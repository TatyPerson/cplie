package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.emf.common.util.EList
import diagramapseudocodigo.*
import diagramapseudocodigo.impl.*
import org.eclipse.emf.common.util.EMap
import java.util.Map
import java.util.HashMap
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import java.io.File
import es.uca.MyOutputConfigurationProvider
import java.util.ArrayList

class MyDslGenerator implements IGenerator {

	@Inject extension IQualifiedNameProvider
	static Map<String, String> variablesInicio = new HashMap<String,String>();
	static Map<String, Map<String,String>>variablesSubprocesos = new HashMap<String,Map<String,String>>();
	static Map<String,String> vectoresMatrices = new HashMap<String,String>();
	static Map<String, Map<String,String>> registros = new HashMap<String, Map<String,String>>();
	static Map<String, ArrayList<String>> variablesEnumerados = new HashMap<String, ArrayList<String>>();
	static ArrayList<String> enumerados = new ArrayList<String>();
	static Codigo codigo;

	//EMap<String, TipoVariable> tablaSimbolos;
	override void doGenerate(Resource resource, IFileSystemAccess myCFile) {

		for (myPseudo : resource.allContents.toIterable.filter(typeof(Codigo))) {	
			myCFile.generateFile("salida.c", myPseudo.toC)		
		}
		
		for (myPseudo : resource.allContents.toIterable.filter(typeof(Codigo))) {
			myCFile.generateFile("salida.cpp", MyOutputConfigurationProvider::DEFAULT_OUTPUT_CPP, myPseudo.toCpp)
		}
	}
	
	
	def toCpp(Codigo myCodigo) {
	
	codigo = myCodigo;
	
	'''
		#include <iostream>
		#include <string>
		#include <cmath>
		
		using namespace std;
		«FOR myComentario:myCodigo.comentarios»
			«myComentario.toC»
		«ENDFOR»
		«FOR myConstante:myCodigo.constantes»
			«myConstante.toC»
		«ENDFOR»
		«FOR myComplejo:myCodigo.tipocomplejo»
			«myComplejo.toCpp»
		«ENDFOR»
		«FOR myVariable:myCodigo.global»
			«myVariable.toCpp»
		«ENDFOR»
		
		«FOR funcion:myCodigo.funcion»
			«funcion.toCpp»
			
		«ENDFOR»
		«myCodigo.tiene.toCpp»
	'''
	}

	def toC(Codigo myCodigo) {
	
	codigo = myCodigo;
	
	for(TipoComplejo t: codigo.tipocomplejo) {
		if(t instanceof Enumerado) {
			var enumerado = t as Enumerado;
			variablesEnumerados.put(enumerado.nombre, new ArrayList<String>());
			enumerados.add(enumerado.nombre);
			for(valor v: enumerado.valor) {
			  if(v instanceof Operador) {
			  	var v2 = v as Operador
				if(v2 instanceof VariableID) {
					var aux = v2 as VariableID
					variablesEnumerados.get(enumerado.nombre).add(aux.nombre)
				}
			  }
			}
		}
	}
	
	for(Declaracion d: codigo.tiene.declaracion) {
		if(d instanceof DeclaracionVariable) {
			var dec = d as DeclaracionVariable;
			for(Variable v: dec.variable) {
				variablesInicio.put(v.nombre, dec.tipo.name);
			}
		}
		else if(d instanceof DeclaracionPropia) {
			var dec = d as DeclaracionPropia;
			for(Variable v: dec.variable) {
				variablesInicio.put(v.nombre, dec.tipo);
			}
		}
	}
	for(Subproceso s: codigo.funcion) {
		variablesSubprocesos.put(s.nombre, new HashMap<String,String>());
		for(Declaracion d: s.declaracion) {
			if(d instanceof DeclaracionVariable) {
				var dec = d as DeclaracionVariable;
				for(Variable v: dec.variable) {
					variablesSubprocesos.get(s.nombre).put(v.nombre, dec.tipo.name);
				}
			}
			else if(d instanceof DeclaracionPropia) {
				var dec = d as DeclaracionPropia;
				for(Variable v: dec.variable) {
					variablesSubprocesos.get(s.nombre).put(v.nombre, dec.tipo);
				}
			}
		}
		for(ParametroFuncion p: s.parametrofuncion) {
			if(p.tipo.eClass.name.equals("TipoExistente")) {
				var tipo = p.tipo as TipoExistente;
				variablesSubprocesos.get(s.nombre).put(p.variable.nombre, tipo.tipo.name);
			}
			else if(p.tipo.eClass.name.equals("TipoDefinido")) {
				var tipo = p.tipo as TipoDefinido;
				variablesSubprocesos.get(s.nombre).put(p.variable.nombre, tipo.tipo);
			}
		}
	}
	
	for(TipoComplejo t: codigo.tipocomplejo) {
		if(t.eClass.name.equals("Vector")) {
			var v = t as Vector;
			if(v.tipo.eClass.name.equals("TipoExistente")) {
				var tipo = v.tipo as TipoExistente;
				vectoresMatrices.put(v.nombre, tipo.tipo.name);
			}
			else if(v.tipo.eClass.name.equals("TipoDefinido")) {
				var tipo = v.tipo as TipoDefinido;
				vectoresMatrices.put(v.nombre, tipo.tipo);
			}
		}
		else if(t.eClass.name.equals("Matriz")) {
			var m = t as Matriz;
			if(m.tipo.eClass.name.equals("TipoExistente")) {
				var tipo = m.tipo as TipoExistente;
				vectoresMatrices.put(m.nombre, tipo.tipo.name);
			}
			else if(m.tipo.eClass.name.equals("TipoDefinido")) {
				var tipo = m.tipo as TipoDefinido;
				vectoresMatrices.put(m.nombre, tipo.tipo);
			}
		}
		else if(t.eClass.name.equals("Registro")) {
			var r = t as Registro;
			registros.put(r.nombre, new HashMap<String,String>());
			for(Declaracion d: r.variable) {
				if(d instanceof DeclaracionVariable) {
					var dec = d as DeclaracionVariable;
					for(Variable v: dec.variable) {
						registros.get(r.nombre).put(v.nombre, dec.tipo.name);
					}
				}
				else if(d instanceof DeclaracionPropia) {
					var dec = d as DeclaracionPropia;
					for(Variable v: dec.variable) {
						registros.get(r.nombre).put(v.nombre, dec.tipo);
					}
				}
			}
		}
	}
	
	'''
		#include <stdio.h>
		#include <stdlib.h>
		#include <string.h>

		«FOR myComentario:myCodigo.comentarios»
			«myComentario.toC»
		«ENDFOR»
		«FOR myConstante:myCodigo.constantes»
			«myConstante.toC»
		«ENDFOR»
		«FOR myComplejo:myCodigo.tipocomplejo»
			«myComplejo.toC»
		«ENDFOR»
		«FOR myVariable:myCodigo.global»
			«myVariable.toC»
		«ENDFOR»
		
		«FOR funcion:myCodigo.funcion»
			«funcion.toC»
			
		«ENDFOR»
		«myCodigo.tiene.toC»
	'''
	}

	def toC(TipoComplejo myComplejo) {
		if (myComplejo.eClass.name.equals("Vector")) {
			var Vector prueba = new VectorImpl
			prueba = myComplejo as Vector
			prueba.toC
		} else if (myComplejo.eClass.name.equals("Matriz")) {
			var Matriz prueba = new MatrizImpl
			prueba = myComplejo as Matriz
			prueba.toC
		} else if (myComplejo.eClass.name.equals("Registro")) {
			var Registro prueba = new RegistroImpl
			prueba = myComplejo as Registro
			prueba.toC
		} else if (myComplejo.eClass.name.equals("Archivo")) {
			var Archivo prueba = new ArchivoImpl
			prueba = myComplejo as Archivo
			prueba.toC
		} else if (myComplejo.eClass.name.equals("Enumerado")) {
			var Enumerado prueba = new EnumeradoImpl
			prueba = myComplejo as Enumerado
			prueba.toC
		} else if (myComplejo.eClass.name.equals("SubrangoNumerico")) {
			var SubrangoNumerico prueba = new SubrangoNumericoImpl
			prueba = myComplejo as SubrangoNumerico
			prueba.toC
		} else if (myComplejo.eClass.name.equals("SubrangoEnumerado")) {
			var SubrangoEnumerado prueba = new SubrangoEnumeradoImpl
			prueba = myComplejo as SubrangoEnumerado
			prueba.toC
		}
	}
	
	def toCpp(TipoComplejo myComplejo) {
		if (myComplejo.eClass.name.equals("Vector")) {
			var Vector prueba = new VectorImpl
			prueba = myComplejo as Vector
			prueba.toC
		} else if (myComplejo.eClass.name.equals("Matriz")) {
			var Matriz prueba = new MatrizImpl
			prueba = myComplejo as Matriz
			prueba.toC
		} else if (myComplejo.eClass.name.equals("Registro")) {
			var Registro prueba = new RegistroImpl
			prueba = myComplejo as Registro
			prueba.toCpp
		} else if (myComplejo.eClass.name.equals("Archivo")) {
			var Archivo prueba = new ArchivoImpl
			prueba = myComplejo as Archivo
			prueba.toC
		} else if (myComplejo.eClass.name.equals("Enumerado")) {
			var Enumerado prueba = new EnumeradoImpl
			prueba = myComplejo as Enumerado
			prueba.toC
		} else if (myComplejo.eClass.name.equals("SubrangoNumerico")) {
			var SubrangoNumerico prueba = new SubrangoNumericoImpl
			prueba = myComplejo as SubrangoNumerico
			prueba.toC
		} else if (myComplejo.eClass.name.equals("SubrangoEnumerado")) {
			var SubrangoEnumerado prueba = new SubrangoEnumeradoImpl
			prueba = myComplejo as SubrangoEnumerado
			prueba.toC
		}
	}

	def toC(Tipo myTipo) {
		if (myTipo.eClass.name.equals("TipoDefinido")) {
			var TipoDefinido prueba = new TipoDefinidoImpl
			prueba = myTipo as TipoDefinido
			prueba.toC
		} else if (myTipo.eClass.name.equals("TipoExistente")) {
			var TipoExistente prueba = new TipoExistenteImpl
			prueba = myTipo as TipoExistente
			prueba.toC
		}
	}

	def toC(TipoExistente myTipo) {
		return tipoVariableC(myTipo.tipo)
	}
	
	def toC(Comentario myComentario)
		'''«myComentario.mensaje»'''

	def toC(TipoDefinido myTipo) {
		return myTipo.tipo
	}

	def toC(Constantes myConstante) '''
		#define «myConstante.variable.nombre»  «myConstante.valor.toC»
	'''

	def toC(Vector myVector) '''
		typedef «myVector.tipo.toC» «myVector.nombre»[«myVector.valor.toC»];
	'''

	def toC(Matriz myMatriz) '''
		typedef «myMatriz.tipo.toC» «myMatriz.nombre»[«myMatriz.valor.get(0).toC»][«myMatriz.valor.get(1).toC»];
	'''

	def toC(Registro myRegistro) '''
		typedef struct {
			«FOR myVariable:myRegistro.variable»
				«myVariable.toC»
			«ENDFOR»
		} «myRegistro.nombre»;
	'''
	
	def toCpp(Registro myRegistro) '''
		typedef struct {
			«FOR myVariable:myRegistro.variable»
				«myVariable.toCpp»
			«ENDFOR»
		} «myRegistro.nombre»;
	'''

	def toC(Archivo myArchivo) '''
		typedef FILE *«myArchivo.nombre»;
	'''

	def toC(Enumerado myEnumerado) '''
		typedef enum {«FOR myVariable:myEnumerado.valor»«IF myVariable == myEnumerado.valor.get(myEnumerado.valor.size()-1)»«myVariable.toC»«ELSE»«myVariable.toC», «ENDIF»«ENDFOR»} «myEnumerado.nombre»;
	'''
	
	def toC(SubrangoNumerico mySubrango) '''
		typedef enum {«generaSubrango(mySubrango.limite_inf,mySubrango.limite_sup)»} «mySubrango.nombre»;
	'''
	
	def toC(SubrangoEnumerado mySubrango) '''
		typedef enum {«generaSubrangoEnumerado(mySubrango.limite_inf,mySubrango.limite_sup)»} «mySubrango.nombre»;
	'''
	
	def obtenerModo(String modo) {
		if(modo == "escritura") {
			return "w";
		}
		else if(modo == "lectura") {
			return "r";
		}
	}
	
	def toC(FuncionFicheroAbrir myFuncionFicheroAbrir) '''
		«myFuncionFicheroAbrir.variable.get(0).toC» = fopen(«myFuncionFicheroAbrir.variable.get(1).toC»,"«obtenerModo(myFuncionFicheroAbrir.modo.getName)»")
	'''
	
	def toC(FuncionFicheroCerrar myFuncionFicheroCerrar)'''
		fclose(«myFuncionFicheroCerrar.variable.toC»)
	'''

	def generaSubrango(int limite_inf,int limite_sup) {
		var concat = new String
		var i = limite_inf
		while (i < limite_sup) {
			concat = concat + i + ", "
			i = i + 1
		}
		concat = concat + i;
		return concat;
	}
	
	def generaSubrangoEnumerado(String limite_inf, String limite_sup) {
		var concat = new String
		for(String nombre: enumerados) {
			if(variablesEnumerados.get(nombre).contains(limite_inf) && variablesEnumerados.get(nombre).contains(limite_sup)) {
				var index_limite_inf = variablesEnumerados.get(nombre).indexOf(limite_inf);
				var index_limite_sup = variablesEnumerados.get(nombre).indexOf(limite_sup);
				var sublista = variablesEnumerados.get(nombre).subList(index_limite_inf, index_limite_sup);
				for(String aux: sublista) {
					concat = concat + aux + ", "
				}
				concat = concat + limite_sup
				return concat
			}
		}
	}

	def toC(Inicio myInicio) '''
		int main(){
			«FOR myVariable:myInicio.declaracion»
				«myVariable.toC»
			«ENDFOR»
			«FOR mySentencia:myInicio.tiene»
				«mySentencia.toC»
			«ENDFOR»
		}
	'''
	
	def toCpp(Inicio myInicio) '''
		int main(){
			«FOR myVariable:myInicio.declaracion»
				«myVariable.toCpp»
			«ENDFOR»
			«FOR mySentencia:myInicio.tiene»
				«IF mySentencia.eClass.name.equals("Escribir") || mySentencia.eClass.name.equals("Leer") || mySentencia.eClass.name.equals("Si") || mySentencia.eClass.name.equals("segun") || mySentencia.eClass.name.equals("Caso") || mySentencia.eClass.name.equals("mientras") || mySentencia.eClass.name.equals("repetir") || mySentencia.eClass.name.equals("desde")»
					«mySentencia.toCpp»
				«ELSE»
					«mySentencia.toC»
				«ENDIF»
			«ENDFOR»
		}
	'''

	def toC(Subproceso subp) {
		if (subp.eClass.name.equals("Funcion")) {
			var Funcion prueba = new FuncionImpl
			prueba = subp as Funcion
			prueba.toC
		} else if (subp.eClass.name.equals("Procedimiento")) {
			var Procedimiento prueba = new ProcedimientoImpl
			prueba = subp as Procedimiento
			prueba.toC
		}
	}
	
	def toCpp(Subproceso subp) {
		if (subp.eClass.name.equals("Funcion")) {
			var Funcion prueba = new FuncionImpl
			prueba = subp as Funcion
			prueba.toCpp
		} else if (subp.eClass.name.equals("Procedimiento")) {
			var Procedimiento prueba = new ProcedimientoImpl
			prueba = subp as Procedimiento
			prueba.toCpp
		}
	}

	def tipoVariableCpp(TipoVariable tipo) {
		if(tipo == TipoVariable::ENTERO) return "int";
		if(tipo == TipoVariable::CARACTER) return "char";
		if(tipo == TipoVariable::REAL) return "float";
		if(tipo == TipoVariable::LOGICO) return "bool";
		if(tipo == TipoVariable::CADENA) return "string";
	}
	
	def tipoVariableC(TipoVariable tipo) {
		if(tipo == TipoVariable::ENTERO) return "int";
		if(tipo == TipoVariable::CARACTER) return "char";
		if(tipo == TipoVariable::REAL) return "float";
		if(tipo == TipoVariable::LOGICO) return "bool";
		if(tipo == TipoVariable::CADENA) return "char *";
	}
	
	def tipoVariableCDeclaraciones(TipoVariable tipo) {
		if(tipo == TipoVariable::ENTERO) return "int";
		if(tipo == TipoVariable::CARACTER) return "char";
		if(tipo == TipoVariable::REAL) return "float";
		if(tipo == TipoVariable::LOGICO) return "bool";
	}

	def toC(EList<ParametroFuncion> parametros) {
		var total = "";
		var actual = 1;
		for (p : parametros) {
			if (actual != 1)
				total = total + ", "
			if (p.paso == TipoPaso::ENTRADA) {
				total = total + "const " + p.tipo.toC + " " + p.variable.nombre;
			} else if (p.paso == TipoPaso::ENTRADA_SALIDA) {
				total = total + p.tipo.toC + "* " + p.variable.nombre;
			} else {
				total = total + p.tipo.toC + "* " + p.variable.nombre;
			}
			actual = actual + 1;
		}
		return total;
	}
	
	def toC(Funcion myFun) '''
		«myFun.tipo.tipoVariableC» «myFun.nombre»(«myFun.parametrofuncion.toC»){
			«FOR myVariable:myFun.declaracion»
				«myVariable.toC»
			«ENDFOR»
			«FOR mySentencia:myFun.sentencias»
				«mySentencia.toC»
			«ENDFOR»
			«IF myFun.devuelve != null» 
			«myFun.devuelve.toC»
			«ENDIF»
		}
	'''

	def toCpp(Funcion myFun) '''
		«myFun.tipo.tipoVariableCpp» «myFun.nombre»(«myFun.parametrofuncion.toC»){
			«FOR myVariable:myFun.declaracion»
				«myVariable.toCpp»
			«ENDFOR»
			«FOR mySentencia:myFun.sentencias»
				«IF mySentencia.eClass.name.equals("Escribir") || mySentencia.eClass.name.equals("Leer") || mySentencia.eClass.name.equals("Si") || mySentencia.eClass.name.equals("segun") || mySentencia.eClass.name.equals("Caso") || mySentencia.eClass.name.equals("mientras") || mySentencia.eClass.name.equals("repetir") || mySentencia.eClass.name.equals("desde")»
					«mySentencia.toCpp»
				«ELSE»
					«mySentencia.toC»
				«ENDIF»
			«ENDFOR»
			«IF myFun.devuelve != null» 
			«myFun.devuelve.toC»
			«ENDIF»
		}
	'''
	
	def toC(Procedimiento myFun) '''
		void «myFun.nombre»(«myFun.parametrofuncion.toC»){
			«FOR myVariable:myFun.declaracion»
				«myVariable.toC»
			«ENDFOR»
			«FOR mySentencia:myFun.sentencias»
				«mySentencia.toC»
			«ENDFOR»
		}
	'''

	def toCpp(Procedimiento myFun) '''
		void «myFun.nombre»(«myFun.parametrofuncion.toC»){
			«FOR myVariable:myFun.declaracion»
				«myVariable.toCpp»
			«ENDFOR»
			«FOR mySentencia:myFun.sentencias»
				«IF mySentencia.eClass.name.equals("Escribir") || mySentencia.eClass.name.equals("Leer") || mySentencia.eClass.name.equals("Si") || mySentencia.eClass.name.equals("segun") || mySentencia.eClass.name.equals("Caso") || mySentencia.eClass.name.equals("mientras") || mySentencia.eClass.name.equals("repetir") || mySentencia.eClass.name.equals("desde")»
					«mySentencia.toCpp»
				«ELSE»
					«mySentencia.toC»
				«ENDIF»
			«ENDFOR»
		}
	'''
	
	def toCpp(Sentencias mySent) {
		if (mySent.eClass.name.equals("AsignacionNormal")) {
			var AsignacionNormal prueba = new AsignacionNormalImpl
			prueba = mySent as AsignacionNormal
			prueba.toC
		} else if (mySent.eClass.name.equals("AsignacionCompleja")) {
			var AsignacionCompleja prueba = new AsignacionComplejaImpl
			prueba = mySent as AsignacionCompleja
			prueba.toC
		}else if (mySent.eClass.name.equals("LlamadaFuncion")) {
			var LlamadaFuncion prueba = new LlamadaFuncionImpl
			prueba = mySent as LlamadaFuncion
			prueba.toC(true)
		} else if (mySent.eClass.name.equals("Si")) {
			var Si prueba = new SiImpl
			prueba = mySent as Si
			prueba.toCpp
		} else if (mySent.eClass.name.equals("segun")) {
			var segun prueba = new segunImpl
			prueba = mySent as segun
			prueba.toCpp
		} else if (mySent.eClass.name.equals("Caso")) {
			var Caso prueba = new CasoImpl
			prueba = mySent as Caso
			prueba.toCpp
		} else if (mySent.eClass.name.equals("mientras")) {
			var mientras prueba = new mientrasImpl
			prueba = mySent as mientras
			prueba.toCpp
		} else if (mySent.eClass.name.equals("repetir")) {
			var repetir prueba = new repetirImpl
			prueba = mySent as repetir
			prueba.toCpp
		} else if (mySent.eClass.name.equals("desde")) {
			var desde prueba = new desdeImpl
			prueba = mySent as desde
			prueba.toCpp
		} else if (mySent.eClass.name.equals("Negacion")) {
			var Negacion prueba = new NegacionImpl
			prueba = mySent as Negacion
			prueba.toC
		} else if (mySent.eClass.name.equals("Leer")) {
			var Leer prueba = new LeerImpl
			prueba = mySent as Leer
			prueba.toCpp
		} else if (mySent.eClass.name.equals("Escribir")) {
			var Escribir prueba = new EscribirImpl
			prueba = mySent as Escribir
			prueba.toCpp
		} else if (mySent.eClass.name.equals("FuncionFicheroAbrir")) {
			var FuncionFicheroAbrir prueba = new FuncionFicheroAbrirImpl
			prueba = mySent as FuncionFicheroAbrir
			prueba.toC
		} else if (mySent.eClass.name.equals("FuncionFicheroCerrar")) {
			var FuncionFicheroCerrar prueba = new FuncionFicheroCerrarImpl
			prueba = mySent as FuncionFicheroCerrar
			prueba.toC
		}	
	}
	

	def toC(Sentencias mySent) {
		if (mySent.eClass.name.equals("AsignacionNormal")) {
			var AsignacionNormal prueba = new AsignacionNormalImpl
			prueba = mySent as AsignacionNormal
			prueba.toC
		} else if (mySent.eClass.name.equals("AsignacionCompleja")) {
			var AsignacionCompleja prueba = new AsignacionComplejaImpl
			prueba = mySent as AsignacionCompleja
			prueba.toC
		} else if (mySent.eClass.name.equals("LlamadaFuncion")) {
			var LlamadaFuncion prueba = new LlamadaFuncionImpl
			prueba = mySent as LlamadaFuncion
			prueba.toC(true)
		} else if (mySent.eClass.name.equals("Si")) {
			var Si prueba = new SiImpl
			prueba = mySent as Si
			prueba.toC
		} else if (mySent.eClass.name.equals("segun")) {
			var segun prueba = new segunImpl
			prueba = mySent as segun
			prueba.toC
		} else if (mySent.eClass.name.equals("Caso")) {
			var Caso prueba = new CasoImpl
			prueba = mySent as Caso
			prueba.toC
		} else if (mySent.eClass.name.equals("mientras")) {
			var mientras prueba = new mientrasImpl
			prueba = mySent as mientras
			prueba.toC
		} else if (mySent.eClass.name.equals("repetir")) {
			var repetir prueba = new repetirImpl
			prueba = mySent as repetir
			prueba.toC
		} else if (mySent.eClass.name.equals("desde")) {
			var desde prueba = new desdeImpl
			prueba = mySent as desde
			prueba.toC
		} else if (mySent.eClass.name.equals("negacion")) {
			var Negacion prueba = new NegacionImpl
			prueba = mySent as Negacion
			prueba.toC
		} else if (mySent.eClass.name.equals("Leer")) {
			var Leer prueba = new LeerImpl
			prueba = mySent as Leer
			prueba.toC
		} else if (mySent.eClass.name.equals("Escribir")) {
			var Escribir prueba = new EscribirImpl
			prueba = mySent as Escribir
			prueba.toC
		} else if (mySent.eClass.name.equals("FuncionFicheroAbrir")) {
			var FuncionFicheroAbrir prueba = new FuncionFicheroAbrirImpl
			prueba = mySent as FuncionFicheroAbrir
			prueba.toC
		} else if (mySent.eClass.name.equals("FuncionFicheroCerrar")) {
			var FuncionFicheroCerrar prueba = new FuncionFicheroCerrarImpl
			prueba = mySent as FuncionFicheroCerrar
			prueba.toC
		}	
	}

	def pintarVariables(EList<Variable> v) '''
		«v.get(0).nombre»«FOR matri:v.get(0).mat»«matri.toString»«ENDFOR»«FOR id:v»«IF id.nombre != v.get(0).nombre», «id.nombre»«FOR matri2:id.mat»«matri2.toString»«ENDFOR»«ENDIF»«ENDFOR»;	
	'''
	def pintarVariablesCadena(EList<Variable> v) {
		var resultado = v.get(0).nombre;
		for(matri: v.get(0).mat) {
			resultado = resultado + matri.toString;
		}
		for(id: v) {
			if(id.nombre != v.get(0).nombre) {
				resultado = resultado + " ," + id.nombre;
				for(matri2: id.mat) {
					resultado = resultado + matri2.toString;
				}
			}
		}
		return resultado;
	}

	// «myDec.tieneIDs.get(0).nombre»«FOR id:myDec.tieneIDs»«IF id.nombre != myDec.tieneIDs.get(0).nombre», «id.nombre»«ENDIF»«ENDFOR»;
	def toC(Declaracion myDec) {
		if (myDec.eClass.name.equals("DeclaracionVariable")) {
			var DeclaracionVariable prueba = new DeclaracionVariableImpl
			prueba = myDec as DeclaracionVariable
			prueba.toC
		} else if (myDec.eClass.name.equals("DeclaracionPropia")) {
			var DeclaracionPropia prueba = new DeclaracionPropiaImpl
			prueba = myDec as DeclaracionPropia
			prueba.toC
		}

	}
	
	def toCpp(Declaracion myDec) {
		if (myDec.eClass.name.equals("DeclaracionVariable")) {
			var DeclaracionVariable prueba = new DeclaracionVariableImpl
			prueba = myDec as DeclaracionVariable
			prueba.toCpp
		} else if (myDec.eClass.name.equals("DeclaracionPropia")) {
			var DeclaracionPropia prueba = new DeclaracionPropiaImpl
			prueba = myDec as DeclaracionPropia
			prueba.toC
		}

	}
	
	def toC(DeclaracionVariable myDec) {
		if(myDec.tipo != TipoVariable::CADENA) {
			return myDec.tipo.tipoVariableCDeclaraciones + " " + pintarVariables(myDec.variable);
		}
		else {
			return "char " + pintarVariablesCadena(myDec.variable) + "[DIM];";
		}
	}
	
	def toCpp(DeclaracionVariable myDec) '''
		«myDec.tipo.tipoVariableCpp» «pintarVariables(myDec.variable)»
	'''

	def toC(DeclaracionPropia myDec) '''
		«myDec.tipo» «pintarVariables(myDec.variable)»
	'''

	//def toC(Asignacion myAsig) '''
	//	«myAsig.valor_asignacion»«FOR matri:myAsig.mat»«matri.toString»«ENDFOR» = «myAsig.operadores.toC»;'''

	def toC(AsignacionNormal asig) '''
	«asig.valor_asignacion»«FOR matri:asig.mat»«matri.toString»«ENDFOR» = «asig.operador.toC»;'''

	def toC(AsignacionCompleja asig) '''
	«asig.valor_asignacion.toC.toString» = «asig.operador.toC.toString»;'''

	def toC(ValorComplejo myComplejo) {
		if (myComplejo.eClass.name.equals("ValorRegistro")) {
			var ValorRegistro prueba = new ValorRegistroImpl
			prueba = myComplejo as ValorRegistro
			prueba.toC
		}
		else if(myComplejo.eClass.name.equals("ValorVector")) {
			var ValorVector prueba = new ValorVectorImpl
			prueba = myComplejo as ValorVector
			prueba.toC
		}
		else if(myComplejo.eClass.name.equals("ValorMatriz")) {
			var ValorMatriz prueba = new ValorMatrizImpl
			prueba = myComplejo as ValorMatriz
			prueba.toC
		}
	}

	def toC(ValorRegistro myValor) {

		//Este metodo esta escrito con otra sintaxis diferente porque me generaba un salto de linea innecesario
		var concat = new String;
		concat = myValor.nombre_registro.toString + '.'
		for (myVariable : myValor.campo) {
			concat = concat + myVariable.toC.toString;
		}
		return concat;
	}

	def toC(ValorVector myValor) {
		var concat = new String;
		if(myValor.campo.size() == 0) {
			concat = myValor.nombre_vector.toString + '[' + myValor.indice.toC + ']';
		}
		else {
			concat = myValor.nombre_vector.toString + '[' + myValor.indice.toC + ']' + '.' + myValor.campo.get(0).nombre_campo;
		}
		return concat;
	}

	def toC(CampoRegistro myCampo) {

		//Este metodo esta escrito con otra sintaxis diferente porque me generaba un salto de linea innecesario
		return myCampo.nombre_campo;
	}

	def toC(ValorMatriz myValor) {
		var concat = new String;
		if(myValor.campo.size() == 0) {
			concat = myValor.nombre_matriz.toString + '[' + myValor.primerIndice.toC + '][' + myValor.segundoIndice.toC + ']';
		}
		else {
			concat = myValor.nombre_matriz.toString + '[' + myValor.primerIndice.toC + '][' + myValor.segundoIndice.toC + ']' + '.' + myValor.campo.get(0).nombre_campo;
		}
		return concat;
	}

	def toC(valor myVal) {
		if (myVal.eClass.name.equals("NumeroEntero")) {
			var NumeroEntero prueba = new NumeroEnteroImpl
			prueba = myVal as NumeroEntero
			prueba.toC
		} else if (myVal.eClass.name.equals("NumeroDecimal")) {
			var NumeroDecimal prueba = new NumeroDecimalImpl
			prueba = myVal as NumeroDecimal
			prueba.toC
		} else if (myVal.eClass.name.equals("ValorBooleano")) {
			var ValorBooleano prueba = new ValorBooleanoImpl
			prueba = myVal as ValorBooleano
			prueba.toC
		} else if (myVal.eClass.name.equals("ConstCadena")) {
			var ConstCadena prueba = new ConstCadenaImpl
			prueba = myVal as ConstCadena
			prueba.toC
		} else if (myVal.eClass.name.equals("Caracter")) {
			var Caracter prueba = new CaracterImpl
			prueba = myVal as Caracter
			prueba.toC
		} else if (myVal.eClass.name.equals("VariableID")) {
			var VariableID prueba = new VariableIDImpl
			prueba = myVal as VariableID
			prueba.toC
		} else if (myVal.eClass.name.equals("LlamadaFuncion")) {
			var LlamadaFuncion prueba = new LlamadaFuncionImpl
			prueba = myVal as LlamadaFuncion
			prueba.toC(false)
		} else if (myVal.eClass.name.equals("operacion")) {
			var operacion prueba = new operacionImpl
			prueba = myVal as operacion
			prueba.toC
		} else if (myVal.eClass.name.equals("Internas")) {
			var Internas prueba = new InternasImpl
			prueba = myVal as Internas
			prueba.toC
		} else if (myVal.eClass.name.equals("unaria")) {
			var unaria prueba = new unariaImpl
			prueba = myVal as unaria
			prueba.toC
		} else if (myVal.eClass.name.equals("ValorRegistro")) {
			var ValorRegistro prueba = new ValorRegistroImpl
			prueba = myVal as ValorRegistro
			prueba.toC
		} else if (myVal.eClass.name.equals("ValorVector")) {
			var ValorVector prueba = new ValorVectorImpl
			prueba = myVal as ValorVector
			prueba.toC
		} else if (myVal.eClass.name.equals("ValorMatriz")) {
			var ValorMatriz prueba = new ValorMatrizImpl
			prueba = myVal as ValorMatriz
			prueba.toC
		}
	}

	def toC(NumeroEntero numero) {
		return numero.valor.toString
	}

	def toC(NumeroDecimal numero) {
		return numero.valor.toString
	}

	def toC(ValorBooleano valBool) {
		if (valBool.valor == booleano::VERDADERO)
			return "true"
		else
			return "false"
	}

	def toC(ConstCadena cadena) {
		print(cadena.contenido)
	}

	def toC(Caracter caract) {
		print(caract.contenido)
	}

	def toC(VariableID variable) '''
	«variable.nombre»«FOR matri:variable.mat»«matri.toString»«ENDFOR»'''

	//def toC(negacion neg) '''
	//	«neg.nombre»«neg.ssigno»;
	//'''

	def toC(unaria myUnaria) {
		return "!" + myUnaria.variable.toC;
	}

	def toCpp(Leer l) '''
		cin >> «l.variable.toC»;
	'''
	
	def contienenExpresionLeer(EList<Sentencias> sentencias, Leer l) {
		if(sentencias.contains(l)) {
			return true;
		}
		for(Sentencias s: sentencias) {
			if(s.eClass.name.equals("mientras")) {
				var mientras = s as mientras;
				if(mientras.sentencias.contains(l)) {
					return true;
				}
				else {
					if(contienenExpresionLeer(mientras.sentencias, l) == true) {
						return true;
					}
				}
			}
			else if(s.eClass.name.equals("repetir")) {
				var repetir = s as repetir;
				if(repetir.sentencias.contains(l)) {
					return true;
				}
				else {
					if(contienenExpresionLeer(repetir.sentencias, l) == true) {
						return true;
					}
				}
			}
			else if(s.eClass.name.equals("desde")) {
				var desde = s as desde;
				if(desde.sentencias.contains(l)) {
					return true;
				}
				else {
					if(contienenExpresionLeer(desde.sentencias, l) == true) {
						return true;
					}
				}
			}
			else if(s.eClass.name.equals("Si")) {
				var si = s as Si;
				if(si.sentencias.contains(l)) {
					return true;
				}
				else if(si.sino != null) {
					if(si.sino.sentencias.contains(l)) {
						return true;
					}
					else {
						if(contienenExpresionLeer(si.sino.sentencias, l) == true) {
							return true;
						}
					}
				}
				else {
					if(contienenExpresionLeer(si.sentencias, l) == true) {
						return true;
					}
				}
			}
			else if(s.eClass.name.equals("segun")) {
				var segun = s as segun;
				for(Caso c: segun.caso) {
					if(c.sentencias.contains(l)) {
						return true;
					}
					else {
						if(contienenExpresionLeer(c.sentencias, l) == true) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	def toC(Leer l) {
		var perteneceInicio = false;
		if(!codigo.tiene.tiene.contains(l)) {
			for(Sentencias s: codigo.tiene.tiene) {
				if(s.eClass.name.equals("mientras") && perteneceInicio == false) {
					var mientras = s as mientras;
					perteneceInicio = contienenExpresionLeer(mientras.sentencias, l);
				}
				else if(s.eClass.name.equals("repetir") && perteneceInicio == false) {
					var repetir = s as repetir;
					perteneceInicio = contienenExpresionLeer(repetir.sentencias, l);
				}
				else if(s.eClass.name.equals("desde") && perteneceInicio == false) {
					var desde = s as desde;
					perteneceInicio = contienenExpresionLeer(desde.sentencias, l);
				}
				else if(s.eClass.name.equals("Si") && perteneceInicio == false) {
					var si = s as Si;
					perteneceInicio = contienenExpresionLeer(si.sentencias, l);
					if(si.sino != null) {
						perteneceInicio = contienenExpresionLeer(si.sino.sentencias, l);
					}
				}	
				else if(s.eClass.name.equals("segun") && perteneceInicio == false) {
					var segun = s as segun;
					for(Caso c: segun.caso) {
						if(perteneceInicio == false) {
							perteneceInicio = contienenExpresionLeer(c.sentencias, l);
						}
					}
				}
		 	}
		}
		if(codigo.tiene.tiene.contains(l) || perteneceInicio) {
			var tipo = "";
			if(l.variable.eClass.name.equals("VariableID")) {
				var varID = l.variable as VariableID;
				tipo = variablesInicio.get(varID.nombre);
			}
			else if(l.variable.eClass.name.equals("ValorVector")) {
				var vector = l.variable as ValorVector;
				if(vector.campo.size() == 0) {
					tipo = vectoresMatrices.get(variablesInicio.get(vector.nombre_vector));
				}
				else {
					tipo = registros.get(vectoresMatrices.get(variablesInicio.get(vector.nombre_vector))).get(vector.campo.get(0).nombre_campo);
				}
			}
			else if(l.variable.eClass.name.equals("ValorMatriz")) {
				var matriz = l.variable as ValorMatriz;
				if(matriz.campo.size() == 0) {
					tipo = vectoresMatrices.get(variablesInicio.get(matriz.nombre_matriz));
				}
				else {
					tipo = registros.get(vectoresMatrices.get(variablesInicio.get(matriz.nombre_matriz))).get(matriz.campo.get(0).nombre_campo);
				}
			}
			else if(l.variable.eClass.name.equals("ValorRegistro")) {
				var registro = l.variable as ValorRegistro;
				tipo = registros.get(variablesInicio.get(registro.nombre_registro)).get(registro.campo.get(0).nombre_campo);
			}
			if(tipo == "ENTERO") {
				'''scanf("%i", &«l.variable.toC»);'''
			}
			else if(tipo == "CARACTER") {
				'''scanf("%c", &«l.variable.toC»);'''
			}
			else if(tipo == "CADENA") {
				'''scanf("%s", &«l.variable.toC»);'''
			}
			else if(tipo == "REAL") {
				'''scanf("%r", &«l.variable.toC»);'''
			}
		}
		else {
			for(Subproceso s: codigo.funcion) {
				var perteneceSubproceso = false;
				if(!s.sentencias.contains(l)) {
					for(Sentencias sent: s.sentencias) {
						if(sent.eClass.name.equals("mientras") && perteneceSubproceso == false) {
						var mientras = sent as mientras;
						perteneceSubproceso = contienenExpresionLeer(mientras.sentencias, l);
					}
					else if(sent.eClass.name.equals("repetir") && perteneceSubproceso == false) {
						var repetir = sent as repetir;
						perteneceSubproceso = contienenExpresionLeer(repetir.sentencias, l);
					}
					else if(sent.eClass.name.equals("desde") && perteneceSubproceso == false) {
						var desde = sent as desde;
						perteneceSubproceso = contienenExpresionLeer(desde.sentencias, l);
					}
					else if(sent.eClass.name.equals("Si") && perteneceSubproceso == false) {
						var si = sent as Si;
						perteneceSubproceso = contienenExpresionLeer(si.sentencias, l);
						if(si.sino != null) {
							perteneceSubproceso = contienenExpresionLeer(si.sino.sentencias, l);
						}
					}	
					else if(sent.eClass.name.equals("segun") && perteneceSubproceso == false) {
						var segun = sent as segun;
						for(Caso c: segun.caso) {
							if(perteneceSubproceso == false) {
								perteneceSubproceso = contienenExpresionLeer(c.sentencias, l);
							}
						}
					}
		 		}
		 	}
		 	if(s.sentencias.contains(l) || perteneceSubproceso) {
		 		var tipo = "";
				if(l.variable.eClass.name.equals("VariableID")) {
						var varID = l.variable as VariableID;
						tipo = variablesSubprocesos.get(s.nombre).get(varID.nombre);
				}
				else if(l.variable.eClass.name.equals("ValorVector")) {
					var vector = l.variable as ValorVector;
					if(vector.campo.size() == 0) {
						tipo = vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(vector.nombre_vector));
					}
					else {
						tipo = registros.get(vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(vector.nombre_vector))).get(vector.campo.get(0).nombre_campo);
					}
				}
				else if(l.variable.eClass.name.equals("ValorMatriz")) {
					var matriz = l.variable as ValorMatriz;
					if(matriz.campo.size() == 0) {
						tipo = vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(matriz.nombre_matriz));
					}
					else {
						tipo = registros.get(vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(matriz.nombre_matriz))).get(matriz.campo.get(0).nombre_campo);
					}
				}	
				else if(l.variable.eClass.name.equals("ValorRegistro")) {
					var registro = l.variable as ValorRegistro;
					tipo = registros.get(variablesSubprocesos.get(s.nombre).get(registro.nombre_registro)).get(registro.campo.get(0).nombre_campo);
				}
				if(tipo == "ENTERO") {
					return '''scanf("%i", &«l.variable.toC»);'''
				}
				else if(tipo == "CARACTER") {
					return '''scanf("%c", &«l.variable.toC»);'''
				}
				else if(tipo == "CADENA") {
					return '''scanf("%s", &«l.variable.toC»);'''
				}
				else if(tipo == "REAL") {
					return '''scanf("%r", &«l.variable.toC»);'''
				}
			}
		}
		}
	}

	def toC(Internas i) {
		if (i.nombre == NombreInterna::COS) {
			'''cos(«i.operadores.get(0).toC»)'''
		} else if (i.nombre == NombreInterna::SEN) {
			'''sin(«i.operadores.get(0).toC»)'''
		} else if (i.nombre == NombreInterna::CUADRADO) {
			'''pow(«i.operadores.get(0).toC»,«2.0»)'''
		} else if (i.nombre == NombreInterna::EXP) {
			'''exp2(«i.operadores.get(0).toC»)'''
		} else if (i.nombre == NombreInterna::LN) {
			'''log(«i.operadores.get(0).toC»)'''
		} else if (i.nombre == NombreInterna::LOG) {
			'''log10(«i.operadores.get(0).toC»)'''
		} else if (i.nombre == NombreInterna::SQRT) {
			'''sqrt(«i.operadores.get(0).toC»)'''
		} else if (i.nombre == NombreInterna::LONGITUD) {
			'''strlen(«i.operadores.get(0).toC»)'''
		} else if (i.nombre == NombreInterna::CONCATENA) {
			'''strcat(«i.operadores.get(0).toC»,«i.operadores.get(1).toC»)'''
		} 
	}

	def coutOperadores(EList<operacion> operaciones) {
		var resultado = "";
		for (op : operaciones) {
			resultado = resultado + " << " + op.toC;
		}
		return resultado;
	}
	
	def coutOperadoresC(EList<operacion> operaciones) {
		var resultado = "";
		var numero = 1;
		for (op : operaciones) {
			if(operaciones.size() > 1 && numero < operaciones.size && numero != 1) {
				resultado = resultado + op.toC + " , ";
			}
			else if(numero != 1 || operaciones.size() == 1) {
				resultado = resultado + op.toC;
			}
			numero = numero + 1;
		}
		return resultado;
	}
	
	def contienenExpresionEscribir(EList<Sentencias> sentencias, Escribir e) {
		if(sentencias.contains(e)) {
			return true;
		}
		for(Sentencias s: sentencias) {
			if(s.eClass.name.equals("mientras")) {
				var mientras = s as mientras;
				if(mientras.sentencias.contains(e)) {
					return true;
				}
				else {
					if(contienenExpresionEscribir(mientras.sentencias, e) == true) {
						return true;
					}
				}
			}
			else if(s.eClass.name.equals("repetir")) {
				var repetir = s as repetir;
				if(repetir.sentencias.contains(e)) {
					return true;
				}
				else {
					if(contienenExpresionEscribir(repetir.sentencias, e) == true) {
						return true;
					}
				}
			}
			else if(s.eClass.name.equals("desde")) {
				var desde = s as desde;
				if(desde.sentencias.contains(e)) {
					return true;
				}
				else {
					if(contienenExpresionEscribir(desde.sentencias, e) == true) {
						return true;
					}
				}
			}
			else if(s.eClass.name.equals("Si")) {
				var si = s as Si;
				if(si.sentencias.contains(e)) {
					return true;
				}
				else if(si.sino != null) {
					if(si.sino.sentencias.contains(e)) {
						return true;
					}
					else {
						if(contienenExpresionEscribir(si.sino.sentencias, e) == true) {
							return true;
						}
					}
				}
				else {
					if(contienenExpresionEscribir(si.sentencias, e) == true) {
						return true;
					}
				}
			}
			else if(s.eClass.name.equals("segun")) {
				var segun = s as segun;
				for(Caso c: segun.caso) {
					if(c.sentencias.contains(e)) {
						return true;
					}
					else {
						if(contienenExpresionEscribir(c.sentencias, e) == true) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	def toCpp(Escribir a) '''
		cout«a.operador.coutOperadores» << endl;
	'''
	
	def toC(Escribir a) {
		var perteneceInicio = false;
		if(!codigo.tiene.tiene.contains(a)) {
			for(Sentencias s: codigo.tiene.tiene) {
				if(s.eClass.name.equals("mientras") && perteneceInicio == false) {
					var mientras = s as mientras;
					perteneceInicio = contienenExpresionEscribir(mientras.sentencias, a);
				}
				else if(s.eClass.name.equals("repetir") && perteneceInicio == false) {
					var repetir = s as repetir;
					perteneceInicio = contienenExpresionEscribir(repetir.sentencias, a);
				}
				else if(s.eClass.name.equals("desde") && perteneceInicio == false) {
					var desde = s as desde;
					perteneceInicio = contienenExpresionEscribir(desde.sentencias, a);
				}
				else if(s.eClass.name.equals("Si") && perteneceInicio == false) {
					var si = s as Si;
					perteneceInicio = contienenExpresionEscribir(si.sentencias, a);
					if(si.sino != null) {
						perteneceInicio = contienenExpresionEscribir(si.sino.sentencias, a);
					}
				}	
				else if(s.eClass.name.equals("segun") && perteneceInicio == false) {
					var segun = s as segun;
					for(Caso c: segun.caso) {
						if(perteneceInicio == false) {
							perteneceInicio = contienenExpresionEscribir(c.sentencias, a);
						}
					}
				}
		 	}
		}
		if((codigo.tiene.tiene.contains(a) && a.operador.size() > 1) || (perteneceInicio && a.operador.size() > 1)) {
			var iterador = 0;
			var primero = a.operador.get(0) as ConstCadena;
			var cadena = primero.contenido;
			cadena = cadena.substring(0, cadena.length()-1);
			for(o: a.operador) {
				if(iterador > 0) {
					var tipo = "";
					if(o.eClass.name.equals("VariableID")) {
						var varID = o as VariableID;
						tipo = variablesInicio.get(varID.nombre);
					}
					else if(o.eClass.name.equals("ValorVector")) {
						var vector = o as ValorVector;
						if(vector.campo.size() == 0) {
							tipo = vectoresMatrices.get(variablesInicio.get(vector.nombre_vector));
						}
						else {
							tipo = registros.get(vectoresMatrices.get(variablesInicio.get(vector.nombre_vector))).get(vector.campo.get(0).nombre_campo);
						}
					}
					else if(o.eClass.name.equals("ValorMatriz")) {
						var matriz = o as ValorMatriz;
						if(matriz.campo.size() == 0) {
							tipo = vectoresMatrices.get(variablesInicio.get(matriz.nombre_matriz));
						}
						else {
							tipo = registros.get(vectoresMatrices.get(variablesInicio.get(matriz.nombre_matriz))).get(matriz.campo.get(0).nombre_campo);
						}
					}
					else if(o.eClass.name.equals("ValorRegistro")) {
						var registro = o as ValorRegistro;
						tipo = registros.get(variablesInicio.get(registro.nombre_registro)).get(registro.campo.get(0).nombre_campo);
					}
					if(tipo == "ENTERO" || o.eClass.name.equals("NumeroEntero")) {
						if(iterador == a.operador.size - 1) {
							cadena = cadena + " %i\"";
						}
						else {
							cadena = cadena + " %i";
						}
					}
					else if(tipo == "CARACTER" || o.eClass.name.equals("Caracter")) {
						if(iterador == a.operador.size - 1) {
							cadena = cadena + " %c\"";
						}
						else {
							cadena = cadena + " %c";
						}
					}
					else if(tipo == "CADENA" || o.eClass.name.equals("ConstCadena")) {
						if(iterador == a.operador.size - 1) {
							cadena = cadena + " %s\"";
						}
						else {
							cadena = cadena + " %s";
						}
					}
					else if(tipo == "REAL" || o.eClass.name.equals("NumeroDecimal")) {
						if(iterador == a.operador.size - 1) {
							cadena = cadena + " %r\"";
						}
						else {
							cadena = cadena + " %r";
						}
					}
				}
				iterador = iterador + 1;
			}
			cadena = cadena + ", " + a.operador.coutOperadoresC;
			return '''printf(«cadena»);'''
		}
		else {
			for(Subproceso s: codigo.funcion) {
				var perteneceSubproceso = false;
				if(!s.sentencias.contains(a) && a.operador.size() > 1) {
					for(Sentencias sent: s.sentencias) {
						if(sent.eClass.name.equals("mientras") && perteneceSubproceso == false) {
						var mientras = sent as mientras;
						perteneceSubproceso = contienenExpresionEscribir(mientras.sentencias, a);
					}
					else if(sent.eClass.name.equals("repetir") && perteneceSubproceso == false) {
						var repetir = sent as repetir;
						perteneceSubproceso = contienenExpresionEscribir(repetir.sentencias, a);
					}
					else if(sent.eClass.name.equals("desde") && perteneceSubproceso == false) {
						var desde = sent as desde;
						perteneceSubproceso = contienenExpresionEscribir(desde.sentencias, a);
					}
					else if(sent.eClass.name.equals("Si") && perteneceSubproceso == false) {
						var si = sent as Si;
						perteneceSubproceso = contienenExpresionEscribir(si.sentencias, a);
						if(si.sino != null) {
							perteneceSubproceso = contienenExpresionEscribir(si.sino.sentencias, a);
						}
					}	
					else if(sent.eClass.name.equals("segun") && perteneceSubproceso == false) {
						var segun = sent as segun;
						for(Caso c: segun.caso) {
							if(perteneceSubproceso == false) {
								perteneceSubproceso = contienenExpresionEscribir(c.sentencias, a);
							}
						}
					}
		 		}
		 	}
			if((s.sentencias.contains(a) && a.operador.size() > 1) || (perteneceSubproceso && a.operador.size() > 1)) {
				var iterador = 0;
				var primero = a.operador.get(0) as ConstCadena;
				var cadena = primero.contenido;
				cadena = cadena.substring(0, cadena.length()-1);
				for(o: a.operador) {
				if(iterador > 0) {
					var tipo = "";
					if(o.eClass.name.equals("VariableID")) {
						var varID = o as VariableID;
						tipo = variablesSubprocesos.get(s.nombre).get(varID.nombre);
					}
					else if(o.eClass.name.equals("ValorVector")) {
						var vector = o as ValorVector;
						if(vector.campo.size() == 0) {
							tipo = vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(vector.nombre_vector));
						}
						else {
							tipo = registros.get(vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(vector.nombre_vector))).get(vector.campo.get(0).nombre_campo);
						}
					}
					else if(o.eClass.name.equals("ValorMatriz")) {
						var matriz = o as ValorMatriz;
						if(matriz.campo.size() == 0) {
							tipo = vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(matriz.nombre_matriz));
						}
						else {
							tipo = registros.get(vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(matriz.nombre_matriz))).get(matriz.campo.get(0).nombre_campo);
						}
					}	
					else if(o.eClass.name.equals("ValorRegistro")) {
						var registro = o as ValorRegistro;
						tipo = registros.get(variablesSubprocesos.get(s.nombre).get(registro.nombre_registro)).get(registro.campo.get(0).nombre_campo);
					}
					if(tipo == "ENTERO" || o.eClass.name.equals("NumeroEntero")) {
						if(iterador == a.operador.size - 1) {
							cadena = cadena + " %i\"";
						}
						else {
							cadena = cadena + " %i";
						}
					}
					else if(tipo == "CARACTER") {
						if(iterador == a.operador.size - 1) {
							cadena = cadena + " %c\"";
						}
						else {
							cadena = cadena + " %c";
						}
					}
					else if(tipo == "CADENA") {
						if(iterador == a.operador.size - 1) {
							cadena = cadena + " %s\"";
						}
						else {
							cadena = cadena + " %s";
						}
					}
					else if(tipo == "REAL") {
						if(iterador == a.operador.size - 1) {
							cadena = cadena + " %r\"";
						}
						else {
							cadena = cadena + " %r";
						}
					}
				}
				iterador = iterador + 1;
			}
				cadena = cadena + ", " + a.operador.coutOperadoresC;
				return '''printf(«cadena»);'''
				}	
			}
		}
	
		'''printf(«a.operador.coutOperadoresC»);'''
	
	}

	def generaParametros(EList<operacion> operaciones) {
		var total = "";
		var actual = 1;
		for (op : operaciones) {
			if (actual != 1)
				total = total + ", "
			total = total + op.toC;
			actual = actual + 1;
		}
		return total;
	}

	def toC(LlamadaFuncion fun, boolean a) '''«fun.nombre»(«fun.operadores.generaParametros»)«IF a»;«ENDIF»'''

	def toC(Operador op) {
		if (op.eClass.name.equals("NumeroEntero")) {
			var NumeroEntero prueba = new NumeroEnteroImpl
			prueba = op as NumeroEntero
			prueba.toC
		} else if (op.eClass.name.equals("NumeroDecimal")) {
			var NumeroDecimal prueba = new NumeroDecimalImpl
			prueba = op as NumeroDecimal
			prueba.toC
		} else if (op.eClass.name.equals("ValorBooleano")) {
			var ValorBooleano prueba = new ValorBooleanoImpl
			prueba = op as ValorBooleano
			prueba.toC
		} else if (op.eClass.name.equals("ConstCadena")) {
			var ConstCadena prueba = new ConstCadenaImpl
			prueba = op as ConstCadena
			prueba.toC
		} else if (op.eClass.name.equals("Caracter")) {
			var Caracter prueba = new CaracterImpl
			prueba = op as Caracter
			prueba.toC
		} else if (op.eClass.name.equals("VariableID")) {
			var VariableID prueba = new VariableIDImpl
			prueba = op as VariableID
			prueba.toC
		}
		else if (op.eClass.name.equals("ValorRegistro")) {
			var ValorRegistro prueba = new ValorRegistroImpl
			prueba = op as ValorRegistro
			prueba.toC
		}
		else if (op.eClass.name.equals("ValorVector")) {
			var ValorVector prueba = new ValorVectorImpl
			prueba = op as ValorVector
			prueba.toC
		}
		else if (op.eClass.name.equals("ValorMatriz")) {
			var ValorMatriz prueba = new ValorMatrizImpl
			prueba = op as ValorMatriz
			prueba.toC
		}
	}

	def toC(operacion op) {
		if (op.eClass.name.equals("NumeroEntero")) {
			var NumeroEntero prueba = new NumeroEnteroImpl
			prueba = op as NumeroEntero
			prueba.toC	
		} else if (op.eClass.name.equals("NumeroDecimal")) {
			var NumeroDecimal prueba = new NumeroDecimalImpl
			prueba = op as NumeroDecimal
			prueba.toC
		} else if (op.eClass.name.equals("ValorBooleano")) {
			var ValorBooleano prueba = new ValorBooleanoImpl
			prueba = op as ValorBooleano
			prueba.toC
		} else if (op.eClass.name.equals("ConstCadena")) {
			var ConstCadena prueba = new ConstCadenaImpl
			prueba = op as ConstCadena
			prueba.toC
		} else if (op.eClass.name.equals("Caracter")) {
			var Caracter prueba = new CaracterImpl
			prueba = op as Caracter
			prueba.toC
		} else if (op.eClass.name.equals("VariableID")) {
			var VariableID prueba = new VariableIDImpl
			prueba = op as VariableID
			prueba.toC
		}
		else if (op.eClass.name.equals("ValorRegistro")) {
			var ValorRegistro prueba = new ValorRegistroImpl
			prueba = op as ValorRegistro
			prueba.toC
		}
		else if (op.eClass.name.equals("ValorVector")) {
			var ValorVector prueba = new ValorVectorImpl
			prueba = op as ValorVector
			prueba.toC
		}
		else if (op.eClass.name.equals("ValorMatriz")) {
			var ValorMatriz prueba = new ValorMatrizImpl
			prueba = op as ValorMatriz
			prueba.toC
		}
		else if (op.eClass.name.equals("LlamadaFuncion")) {
			var LlamadaFuncion prueba = new LlamadaFuncionImpl
			prueba = op as LlamadaFuncion
			prueba.toC(false)
		}
		else if (op.eClass.name.equals("Internas")) {
			var Internas prueba = new InternasImpl
			prueba = op as Internas
			prueba.toC
		}
		else if (op.eClass.name.equals("Suma")) {
			var Suma prueba = new SumaImpl
			prueba = op as Suma
			prueba.toC
		}
		else if (op.eClass.name.equals("Resta")) {
			var Resta prueba = new RestaImpl
			prueba = op as Resta
			prueba.toC
		}
		else if (op.eClass.name.equals("Multiplicacion")) {
			var Multiplicacion prueba = new MultiplicacionImpl
			prueba = op as Multiplicacion
			prueba.toC
		}
		else if (op.eClass.name.equals("Division")) {
			var Division prueba = new DivisionImpl
			prueba = op as Division
			prueba.toC
		}
		else if (op.eClass.name.equals("Or")) {
			var Or prueba = new OrImpl
			prueba = op as Or
			prueba.toC
		}
		else if (op.eClass.name.equals("And")) {
			var And prueba = new AndImpl
			prueba = op as And
			prueba.toC
		}
		else if (op.eClass.name.equals("Comparacion")) {
			var Comparacion prueba = new ComparacionImpl
			prueba = op as Comparacion
			prueba.toC
		}
		else if (op.eClass.name.equals("Igualdad")) {
			var Igualdad prueba = new IgualdadImpl
			prueba = op as Igualdad
			prueba.toC
		}
		else if (op.eClass.name.equals("Negativa")) {
			var Negativa prueba = new NegativaImpl
			prueba = op as Negativa
			prueba.toC
		}
		else if (op.eClass.name.equals("Negacion")) {
			var Negacion prueba = new NegacionImpl
			prueba = op as Negacion
			prueba.toC
		}
	}
	
	def toC(Suma mySuma) {
		return mySuma.left.toC + " " + mySuma.signo_op + " " + mySuma.right.toC;
	}
	
	def toC(Resta myResta) {
		return myResta.left.toC + " " + myResta.signo_op + " " + myResta.right.toC;
	}
	
	def toC(Multiplicacion myMulti) {
		return myMulti.left.toC + " " + myMulti.signo_op + " " + myMulti.right.toC;
	}
	
	def toC(Division myDivi) {
		return myDivi.left.toC + " " + myDivi.signo_op + " " + myDivi.right.toC;
	}
	
	def toC(Or myOr) {
		return myOr.left.toC + " " + "||" + " " + myOr.right.toC;
	}
	
	def toC(And myAnd) {
		return myAnd.left.toC + " " + "&&" + " " + myAnd.right.toC;
	}
	
	def toC(Comparacion myComparacion) {
		return myComparacion.left.toC + " " + myComparacion.signo_op + " " + myComparacion.right.toC;
	}
	
	def toC(Igualdad myIgualdad) {
		return myIgualdad.left.toC + " " + myIgualdad.signo_op + " " + myIgualdad.right.toC;
	}
	
	def toC(Negativa myNegativa) {
		return "( - " + myNegativa.valor_operacion.toC + ")";
	}
	
	def toC(Negacion myNegacion) {
		return "!" + myNegacion.valor_operacion.toC;
	}

	def toC(Si mySi) '''
		if(«mySi.valor.toC»){
			«FOR sent:mySi.sentencias»
				«sent.toC»
			«ENDFOR»
			«IF mySi.devuelve != null» 
			«mySi.devuelve.toC»
			«ENDIF»	
		}
		«IF mySi.sino != null» 
			«mySi.sino.toC»
		«ENDIF»
	'''
	
	def toCpp(Si mySi) '''
		if(«mySi.valor.toC»){
			«FOR sent:mySi.sentencias»
				«IF sent.eClass.name.equals("Escribir") || sent.eClass.name.equals("Leer") || sent.eClass.name.equals("Si") || sent.eClass.name.equals("segun") || sent.eClass.name.equals("Caso") || sent.eClass.name.equals("mientras") || sent.eClass.name.equals("repetir") || sent.eClass.name.equals("desde")»
					«sent.toCpp»
				«ELSE»
					«sent.toC»
				«ENDIF»
			«ENDFOR»
			«IF mySi.devuelve != null» 
				«mySi.devuelve.toC»
			«ENDIF»	
		}
		«IF mySi.sino != null» 
			«mySi.sino.toC»
		«ENDIF»
	'''

	def toC(Caso myCaso) '''
		case «0»:
			«FOR sent:myCaso.sentencias»
				«sent.toC»
			«ENDFOR»
			«IF myCaso.devuelve != null» 
			«myCaso.devuelve.toC»
			«ENDIF»
		break;
	'''
	
	def toCpp(Caso myCaso) '''
		case «0»:
			«FOR sent:myCaso.sentencias»
				«IF sent.eClass.name.equals("Escribir") || sent.eClass.name.equals("Leer") || sent.eClass.name.equals("Si") || sent.eClass.name.equals("segun") || sent.eClass.name.equals("Caso") || sent.eClass.name.equals("mientras") || sent.eClass.name.equals("repetir") || sent.eClass.name.equals("desde")»
					«sent.toCpp»
				«ELSE»
					«sent.toC»
				«ENDIF»
			«ENDFOR»
			«IF myCaso.devuelve != null» 
				«myCaso.devuelve.toC»
			«ENDIF»
		break;
	'''

	def toC(segun mySegun) '''
		switch(«mySegun.valor.toC»){
			«FOR cas:mySegun.caso»
				«cas.toC» 
			«ENDFOR»
			default:
				«FOR sent:mySegun.sentencias»
					«sent.toC»
				«ENDFOR»
				«IF mySegun.devuelve != null» 
				«mySegun.devuelve.toC»
				«ENDIF»
			break;
		}
	'''
	
	def toCpp(segun mySegun) '''
		switch(«mySegun.valor.toC»){
			«FOR cas:mySegun.caso»
				«cas.toCpp» 
			«ENDFOR»
			default:
				«FOR sent:mySegun.sentencias»
					«IF sent.eClass.name.equals("Escribir") || sent.eClass.name.equals("Leer") || sent.eClass.name.equals("Si") || sent.eClass.name.equals("segun") || sent.eClass.name.equals("Caso") || sent.eClass.name.equals("mientras") || sent.eClass.name.equals("repetir") || sent.eClass.name.equals("desde")»
						«sent.toCpp»
					«ELSE»
						«sent.toC»
					«ENDIF»
				«ENDFOR»
				«IF mySegun.devuelve != null» 
				«mySegun.devuelve.toC»
				«ENDIF»
			break;
		}
	'''

	def toC(Devolver myDevuelve) '''
		return «myDevuelve.devuelve.toC»;
	'''

	def toC(Sino mySino) '''
		else{
			«FOR sent:mySino.sentencias»	
				«sent.toC»
			«ENDFOR»
			«IF mySino.devuelve != null» 
			«mySino.devuelve.toC»
			«ENDIF»	
		}
	'''
	
	def toCpp(Sino mySino) '''
		else{
			«FOR sent:mySino.sentencias»	
				«IF sent.eClass.name.equals("Escribir") || sent.eClass.name.equals("Leer") || sent.eClass.name.equals("Si") || sent.eClass.name.equals("segun") || sent.eClass.name.equals("Caso") || sent.eClass.name.equals("mientras") || sent.eClass.name.equals("repetir") || sent.eClass.name.equals("desde")»
					«sent.toCpp»
				«ELSE»
					«sent.toC»
				«ENDIF»
			«ENDFOR»
			«IF mySino.devuelve != null» 
				«mySino.devuelve.toC»
			«ENDIF»	
		}
	'''

	def toC(mientras m) '''
		while(«m.valor.toC»){
			«FOR sent:m.sentencias»
				«sent.toC»
			«ENDFOR»
		}
	'''
	
	def toCpp(mientras m) '''
		while(«m.valor.toC»){
			«FOR sent:m.sentencias»
				«IF sent.eClass.name.equals("Escribir") || sent.eClass.name.equals("Leer") || sent.eClass.name.equals("Si") || sent.eClass.name.equals("segun") || sent.eClass.name.equals("Caso") || sent.eClass.name.equals("mientras") || sent.eClass.name.equals("repetir") || sent.eClass.name.equals("desde")»
					«sent.toCpp»
				«ELSE»
					«sent.toC»
				«ENDIF»
			«ENDFOR»
		}
	'''
	
	
	def toC(desde d) '''
		for(«d.asignacion.toC» «d.asignacion.valor_asignacion.toString» <= «d.valor.toC»; «d.asignacion.valor_asignacion.toString»++){
			«FOR sent:d.sentencias»
				«sent.toC»
			«ENDFOR»
		}
	'''
	
	def toCpp(desde d) '''
		for(«d.asignacion.toC» «d.asignacion.valor_asignacion.toString» <= «d.valor.toC»; «d.asignacion.valor_asignacion.toString»++){
			«FOR sent:d.sentencias»
				«IF sent.eClass.name.equals("Escribir") || sent.eClass.name.equals("Leer") || sent.eClass.name.equals("Si") || sent.eClass.name.equals("segun") || sent.eClass.name.equals("Caso") || sent.eClass.name.equals("mientras") || sent.eClass.name.equals("repetir") || sent.eClass.name.equals("desde")»
					«sent.toCpp»
				«ELSE»
					«sent.toC»
				«ENDIF»
			«ENDFOR»
		}
	''' 

	def toC(repetir m) '''
		do{
			«FOR sent:m.sentencias»
				«sent.toC»
			«ENDFOR»
		}while(«m.valor.toC»);
	'''
	
	def toCpp(repetir m) '''
		do{
			«FOR sent:m.sentencias»
				«IF sent.eClass.name.equals("Escribir") || sent.eClass.name.equals("Leer") || sent.eClass.name.equals("Si") || sent.eClass.name.equals("segun") || sent.eClass.name.equals("Caso") || sent.eClass.name.equals("mientras") || sent.eClass.name.equals("repetir") || sent.eClass.name.equals("desde")»
					«sent.toCpp»
				«ELSE»
					«sent.toC»
				«ENDIF»
			«ENDFOR»
		}while(«m.valor.toC»);
	'''
}
