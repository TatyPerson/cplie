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

class MyDslGenerator implements IGenerator {

	@Inject extension IQualifiedNameProvider

	//EMap<String, TipoVariable> tablaSimbolos;
	override void doGenerate(Resource resource, IFileSystemAccess myCFile) {

		//TODO implement me
		for (myPseudo : resource.allContents.toIterable.filter(typeof(Codigo))) {
			myCFile.generateFile("salida.cpp", myPseudo.toC)
		}
	}

	def toC(Codigo myCodigo) '''
		#include <iostream>
		#include <string>
		#include <cmath>
		
		using namespace std;
		
		�FOR myConstante:myCodigo.constantes�
			�myConstante.toC�
		�ENDFOR�
		�FOR myComplejo:myCodigo.tipocomplejo�
			�myComplejo.toC�
		�ENDFOR�
		
		�FOR funcion:myCodigo.funcion�
			�funcion.toC�
			
		�ENDFOR�
		�myCodigo.tiene.toC�
	'''

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
		return tipoVariable(myTipo.tipo)
	}

	def toC(TipoDefinido myTipo) {
		return myTipo.tipo
	}

	def toC(Constantes myConstante) '''
		#define �myConstante.variable.nombre�  �myConstante.valor.toC�
	'''

	def toC(Vector myVector) '''
		typedef �myVector.tipo.toC� �myVector.nombre�[�myVector.valor.toC�];
	'''

	def toC(Matriz myMatriz) '''
		typedef �myMatriz.tipo.toC� �myMatriz.nombre�[�myMatriz.valor.get(0).toC�][�myMatriz.valor.get(1).toC�];
	'''

	def toC(Registro myRegistro) '''
		typedef struct {
			�FOR myVariable:myRegistro.variable�
				�myVariable.toC�
			�ENDFOR�
		} �myRegistro.nombre�;
	'''

	def toC(Archivo myArchivo) '''
		typedef FILE *�myArchivo.nombre�;
	'''

	def toC(Enumerado myEnumerado) '''
		typedef enum {�FOR myVariable:myEnumerado.valor��IF myVariable == myEnumerado.valor.get(myEnumerado.valor.size()-1)��myVariable.toC��ELSE��myVariable.toC�, �ENDIF��ENDFOR�} �myEnumerado.nombre�;
	'''

	def toC(SubrangoNumerico mySubrango) '''
		typedef enum {«generaSubrango(mySubrango.limite_inf,mySubrango.limite_sup)»} «mySubrango.nombre»;
	'''

	def generaSubrango(int limite_inf, int limite_sup) {
		var concat = new String
		var i = limite_inf
		while (i < limite_sup) {
			concat = concat + i + ", "
			i = i + 1
		}
		concat = concat + i;
		return concat;
	}

	def toC(Inicio myInicio) '''
		int main(){
			�FOR myVariable:myInicio.declaracion�
				�myVariable.toC�
			�ENDFOR�
			�FOR mySentencia:myInicio.tiene�
				�mySentencia.toC�
				
			�ENDFOR�
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

	def tipoVariable(TipoVariable tipo) {
		if(tipo == TipoVariable::ENTERO) return "int";
		if(tipo == TipoVariable::CARACTER) return "char";
		if(tipo == TipoVariable::REAL) return "float";
		if(tipo == TipoVariable::LOGICO) return "bool";
		if(tipo == TipoVariable::CADENA) return "string";
	}

	def toC(EList<ParametroFuncion> parametros) {
		var total = "";
		var actual = 1;
		for (p : parametros) {
			if (actual != 1)
				total = total + ", "
			if (p.paso == TipoPaso::ENTRADA) {
				total = total + "const " + p.tipo.tipoVariable + " " + p.variable.nombre;
			} else if (p.paso == TipoPaso::ENTRADA_SALIDA) {
				total = total + p.tipo.tipoVariable + "* " + p.variable.nombre;
			} else {
				total = total + p.tipo.tipoVariable + "* " + p.variable.nombre;
			}
			actual = actual + 1;
		}
		return total;
	}

	def toC(Funcion myFun) '''
		�myFun.tipo.tipoVariable� �myFun.nombre�(�myFun.parametrofuncion.toC�){
			�FOR myVariable:myFun.declaracion�
				�myVariable.toC�
			�ENDFOR�
			�FOR mySentencia:myFun.sentencias�
				�mySentencia.toC�
			�ENDFOR�
			�IF myFun.devuelve != null� 
			�myFun.devuelve.toC�
			�ENDIF�
		}
	'''

	def toC(Procedimiento myFun) '''
		void �myFun.nombre�(�myFun.parametrofuncion.toC�){
			�FOR myVariable:myFun.declaracion�
				�myVariable.toC�
			�ENDFOR�
			�FOR mySentencia:myFun.sentencias�
				�mySentencia.toC�
			�ENDFOR�
		}
	'''

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
		} else if (mySent.eClass.name.equals("incremento")) {
			var incremento prueba = new incrementoImpl
			prueba = mySent as incremento
			prueba.toC
		} else if (mySent.eClass.name.equals("Leer")) {
			var Leer prueba = new LeerImpl
			prueba = mySent as Leer
			prueba.toC
		} else if (mySent.eClass.name.equals("Escribir")) {
			var Escribir prueba = new EscribirImpl
			prueba = mySent as Escribir
			prueba.toC
		}
	}

	def pintarVariables(EList<Variable> v) '''
		�v.get(0).nombre��FOR matri:v.get(0).mat��matri.toString��ENDFOR��FOR id:v��IF id.nombre != v.get(0).nombre�, �id.nombre��FOR matri2:id.mat��matri2.toString��ENDFOR��ENDIF��ENDFOR�;	
	'''

	// �myDec.tieneIDs.get(0).nombre��FOR id:myDec.tieneIDs��IF id.nombre != myDec.tieneIDs.get(0).nombre�, �id.nombre��ENDIF��ENDFOR�;
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

	def toC(DeclaracionVariable myDec) '''
		�myDec.tipo.tipoVariable� �pintarVariables(myDec.variable)�
	'''

	def toC(DeclaracionPropia myDec) '''
		�myDec.tipo� �pintarVariables(myDec.variable)�
	'''

	def toC(Asignacion myAsig) {
		if (myAsig.eClass.name.equals("AsignacionNormal")) {
			var AsignacionNormal prueba = new AsignacionNormalImpl
			prueba = myAsig as AsignacionNormal
			prueba.toC
		} else if (myAsig.eClass.name.equals("AsignacionCompleja")) {
			var AsignacionCompleja prueba = new AsignacionComplejaImpl
			prueba = myAsig as AsignacionCompleja
			prueba.toC
		}
	}

	def toC(AsignacionNormal asig) '''
	�asig.lvalue��FOR matri:asig.mat��matri.toString��ENDFOR� = �asig.operador.toC�;'''

	def toC(AsignacionCompleja asig) '''
	�asig.complejo.toC.toString��FOR matri:asig.mat��matri.toString��ENDFOR� = �asig.operador.toC.toString�;'''

	def toC(ValorComplejo myComplejo) {
		if (myComplejo.eClass.name.equals("ValorRegistro")) {
			var ValorRegistro prueba = new ValorRegistroImpl
			prueba = myComplejo as ValorRegistro
			prueba.toC
		}
	}

	def toC(ValorRegistro myValor) {

		//Este m�todo esta escrito con otra sintaxis diferente porque me generaba un salto de l�nea innecesario
		var concat = new String;
		concat = myValor.nombre_registro.toString + '.'
		for (myVariable : myValor.campo) {
			concat = concat + myVariable.toC.toString;
		}
		return concat;
	}

	def toC(ValorVector myValor) {
		var concat = new String;
		concat = myValor.nombre_vector.toString + '[' + myValor.elemento.toString + ']';
	}

	def toC(CampoRegistro myCampo) {

		//Este m�todo esta escrito con otra sintaxis diferente porque me generaba un salto de l�nea innecesario
		return myCampo.nombre_campo;
	}

	def toC(ValorMatriz myValor) {
		var concat = new String;
		concat = myValor.nombre_matriz.toString + '[' + myValor.elemento_i.toString + '][' + myValor.elemento_j.toString +
			']';
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
	�variable.nombre��FOR matri:variable.mat��matri.toString��ENDFOR�'''

	def toC(incremento inc) '''
		�inc.nombre��inc.ssigno�;
	'''

	def toC(unaria myUnaria) {
		return "!" + myUnaria.variable.toC;
	}

	def toC(Leer l) '''
		cin >> �l.variable.nombre�;
	'''

	def toC(Internas i) {
		if (i.nombre == NombreInterna::COS) {
			'''cos(�i.operador.get(0).toC�)'''
		} else if (i.nombre == NombreInterna::SEN) {
			'''sin(�i.operador.get(0).toC�)'''
		} else if (i.nombre == NombreInterna::CUADRADO) {
			'''pow(�i.operador.get(0).toC�,�2.0�)'''
		} else if (i.nombre == NombreInterna::EXP) {
			'''exp2(�i.operador.get(0).toC�)'''
		} else if (i.nombre == NombreInterna::LN) {
			'''log(�i.operador.get(0).toC�)'''
		} else if (i.nombre == NombreInterna::LOG) {
			'''log10(�i.operador.get(0).toC�)'''
		} else if (i.nombre == NombreInterna::SQRT) {
			'''sqrt(�i.operador.get(0).toC�)'''
		} else if (i.nombre == NombreInterna::LONGITUD) {
			'''strlen(�i.operador.get(0).toC�)'''
		} else if (i.nombre == NombreInterna::CONCATENA) {
			'''strcat(�i.operador.get(0).toC�,�i.operador.get(1).toC�)'''
		}
	}

	def coutOperadores(EList<Operador> operadores) {
		var resultado = "";
		for (o : operadores) {
			resultado = resultado + " << " + o.toC;
		}
		return resultado;
	}

	def toC(Escribir a) '''
		cout�a.operador.coutOperadores� << endl;
	'''

	def generaParametros(EList<Operador> operadores) {
		var total = "";
		var actual = 1;
		for (o : operadores) {
			if (actual != 1)
				total = total + ", "
			total = total + o.toC;
			actual = actual + 1;
		}
		return total;
	}

	def toC(LlamadaFuncion fun, boolean a) '''�fun.nombre�(�fun.operador.generaParametros�)�IF a�;�ENDIF�'''

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
	}

	def toC(operacion op) '''(�op.op_izq.oper_izq.toC� �IF op.signo_op.toString == 'y'�&&�ELSE��IF op.signo_op.toString == 'o'�||�ELSE��op.signo_op��ENDIF��ENDIF� �op.op_der.oper_der.toC�)'''

	def toC(Si mySi) '''
		if(�mySi.valor.toC�){
			�FOR sent:mySi.sentencias�
				
				�sent.toC�
			�ENDFOR�
			�IF mySi.devuelve != null� 
			�mySi.devuelve.toC�
			�ENDIF�	
		}
		�IF mySi.sino != null� 
		�mySi.sino.toC�
		�ENDIF�
	'''

	def toC(Caso myCaso) '''
		case �myCaso.operador.toC�:
			�FOR sent:myCaso.sentencias�
				�sent.toC�
			�ENDFOR�
			�IF myCaso.devuelve != null� 
			�myCaso.devuelve.toC�
			�ENDIF�
		break;
	'''

	def toC(segun mySegun) '''
		switch(�mySegun.valor.toC�){
			�FOR cas:mySegun.caso�
				�cas.toC� 
			�ENDFOR�
			default:
				�FOR sent:mySegun.sentencias�
					�sent.toC�
				�ENDFOR�
				�IF mySegun.devuelve != null� 
				�mySegun.devuelve.toC�
				�ENDIF�
			break;
		}
	'''

	def toC(Devolver myDevuelve) '''
		return �myDevuelve.devuelve.toC�;
	'''

	def toC(Sino mySino) '''
		else{
			�FOR sent:mySino.sentencias�
				
				�sent.toC�
			�ENDFOR�
			�IF mySino.devuelve != null� 
			�mySino.devuelve.toC�
			�ENDIF�	
		}
	'''

	def toC(mientras m) '''
		while(�m.valor.toC�){
			�FOR sent:m.sentencias�
				
				�sent.toC�
			�ENDFOR�
		}
	'''

	def toC(desde d) '''
		for(�d.asignacion.toC� �d.asignacion.lvalue.toString� <= �d.valor.toC�; �d.asignacion.lvalue.toString�++){
			�FOR sent:d.sentencias�
				
				�sent.toC�
			�ENDFOR�
		}
	'''

	def toC(repetir m) '''
		do{
			�FOR sent:m.sentencias�
				
				�sent.toC�
			�ENDFOR�
		}while(!�m.valor.toC�);
	'''
}
