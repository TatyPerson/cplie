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
		for(myPseudo: resource.allContents.toIterable.filter(typeof(Codigo))) {
			myCFile.generateFile("salida.cpp",myPseudo.toC)
		}
	}
		
	def toC(Codigo myCodigo)'''
	#include <iostream>
	#include <string>
	#include <cmath>
	
	using namespace std;
	
	«FOR myConstante:myCodigo.constantes»
		«myConstante.toC»
	«ENDFOR»
	«FOR myComplejo:myCodigo.tipocomplejo»
		«myComplejo.toC»
	«ENDFOR»

	«FOR funcion:myCodigo.funcion»
		«funcion.toC»
		
	«ENDFOR»
	«myCodigo.tiene.toC»
	'''
	
	def toC(TipoComplejo myComplejo){
		if(myComplejo.eClass.name.equals("Vector")){
			var Vector prueba = new VectorImpl
			prueba = myComplejo as Vector
			prueba.toC
		}
		else if(myComplejo.eClass.name.equals("Matriz")){
			var Matriz prueba = new MatrizImpl
			prueba = myComplejo as Matriz
			prueba.toC
		}
	
	}
	
	def toC(Constantes myConstante)'''
		#define «myConstante.variable.nombre»  «myConstante.valor.toC»
	'''
	
	def toC(Vector myVector)'''
		typedef «tipoVariable(myVector.tipoInterno)» «myVector.nombre»[«myVector.constante»];
	'''
	
	def toC(Matriz myMatriz)'''
		typedef «tipoVariable(myMatriz.tipoInterno)» «myMatriz.nombre»[«myMatriz.constante»][«myMatriz.constante2»];
	'''
	
	def toC(Inicio myInicio)'''
		int main(){
			«FOR myVariable:myInicio.declaracion»
				«myVariable.toC»
			«ENDFOR»
			«FOR mySentencia:myInicio.tiene»
				«mySentencia.toC»
				
			«ENDFOR»
		}
	'''
	
	def toC(Subproceso subp){
		if(subp.eClass.name.equals("Funcion")){
			var Funcion prueba = new FuncionImpl
			prueba = subp as Funcion
			prueba.toC
		}
		else if(subp.eClass.name.equals("Procedimiento")){
			var Procedimiento prueba = new ProcedimientoImpl
			prueba = subp as Procedimiento
			prueba.toC
		}
	}
	
	def tipoVariable(TipoVariable tipo){
		if(tipo == TipoVariable::ENTERO) return "int";
		if(tipo == TipoVariable::CARACTER) return "char";
		if(tipo == TipoVariable::REAL) return "float";
		if(tipo == TipoVariable::LOGICO) return "bool";
		if(tipo == TipoVariable::CADENA) return "string";		
	}
	
	def toC(EList<ParametroFuncion> parametros){
		var total = "";
		var actual = 1;
		for(p:parametros){
			if(actual != 1)
				total = total + ", "
			if(p.paso == TipoPaso::ENTRADA){
				total = total + "const " + p.tipo.tipoVariable + " " + p.variable.nombre;
			}
			else if(p.paso == TipoPaso::ENTRADA_SALIDA){
				total = total + p.tipo.tipoVariable + "* " + p.variable.nombre;
			}
			else {
				total = total + p.tipo.tipoVariable + " " + p.variable.nombre;
			}
			actual = actual + 1;
		}
		return total;
	}
	
	def toC(Funcion myFun)'''
		«myFun.tipo.tipoVariable» «myFun.nombre»(«myFun.parametrofuncion.toC»){
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
	
	def toC(Procedimiento myFun)'''
		void «myFun.nombre»(«myFun.parametrofuncion.toC»){
			«FOR myVariable:myFun.declaracion»
				«myVariable.toC»
			«ENDFOR»
			«FOR mySentencia:myFun.sentencias»
				«mySentencia.toC»
			«ENDFOR»
		}
	'''
	
	def toC(Sentencias mySent){
		if(mySent.eClass.name.equals("Asignacion")){
			var Asignacion prueba = new AsignacionImpl
			prueba = mySent as Asignacion
			prueba.toC
		}
		else if(mySent.eClass.name.equals("LlamadaFuncion")){
			var LlamadaFuncion prueba = new LlamadaFuncionImpl
			prueba = mySent as LlamadaFuncion
			prueba.toC(true)
		}
		else if(mySent.eClass.name.equals("Si")){
			var Si prueba = new SiImpl
			prueba = mySent as Si
			prueba.toC
		}
		else if(mySent.eClass.name.equals("segun")){
			var segun prueba = new segunImpl
			prueba = mySent as segun
			prueba.toC
		}
		else if(mySent.eClass.name.equals("Caso")){
			var Caso prueba = new CasoImpl
			prueba = mySent as Caso
			prueba.toC
		}
		else if(mySent.eClass.name.equals("mientras")){
			var mientras prueba = new mientrasImpl
			prueba = mySent as mientras
			prueba.toC
		}
		else if(mySent.eClass.name.equals("repetir")){
			var repetir prueba = new repetirImpl
			prueba = mySent as repetir
			prueba.toC
		}
		else if(mySent.eClass.name.equals("desde")){
			var desde prueba = new desdeImpl
			prueba = mySent as desde
			prueba.toC
		}
		else if(mySent.eClass.name.equals("incremento")){
			var incremento prueba = new incrementoImpl
			prueba = mySent as incremento
			prueba.toC
		}
		else if(mySent.eClass.name.equals("Leer")){
			var Leer prueba = new LeerImpl
			prueba = mySent as Leer
			prueba.toC
		}
		else if(mySent.eClass.name.equals("Escribir")){
			var Escribir prueba = new EscribirImpl
			prueba = mySent as Escribir
			prueba.toC
		}
	}
	
	def pintarVariables(EList<Variable> v)'''
	«v.get(0).nombre»«FOR matri:v.get(0).mat»«matri.toString»«ENDFOR»«FOR id:v»«IF id.nombre != v.get(0).nombre», «id.nombre»«FOR matri2:id.mat»«matri2.toString»«ENDFOR»«ENDIF»«ENDFOR»;	
	'''
	
	// «myDec.tieneIDs.get(0).nombre»«FOR id:myDec.tieneIDs»«IF id.nombre != myDec.tieneIDs.get(0).nombre», «id.nombre»«ENDIF»«ENDFOR»;
	
	
	def toC(Declaracion myDec){
		if(myDec.eClass.name.equals("DeclaracionVariable")){
			var DeclaracionVariable prueba = new DeclaracionVariableImpl
			prueba = myDec as DeclaracionVariable
			prueba.toC
		}
		else if(myDec.eClass.name.equals("DeclaracionPropia")){
			var DeclaracionPropia prueba = new DeclaracionPropiaImpl
			prueba = myDec as DeclaracionPropia
			prueba.toC
		}
	
	}
	
	def toC(DeclaracionVariable myDec)'''
		«myDec.tipo.tipoVariable» «pintarVariables(myDec.tieneIDs)»
	'''
	
	def toC(DeclaracionPropia myDec)'''
		«myDec.tipo» «pintarVariables(myDec.variable)»
	'''
	
	def toC(Asignacion asig)'''
	«asig.lvalue»«FOR matri:asig.mat»«matri.toString»«ENDFOR» = «asig.operador.toC»;'''
	
	def toC(valor myVal){
		if(myVal.eClass.name.equals("NumeroEntero")){
			var NumeroEntero prueba = new NumeroEnteroImpl
			prueba = myVal as NumeroEntero
			prueba.toC
		}
		else if(myVal.eClass.name.equals("NumeroDecimal")){
			var NumeroDecimal prueba = new NumeroDecimalImpl
			prueba = myVal as NumeroDecimal
			prueba.toC
		}
		else if(myVal.eClass.name.equals("ValorBooleano")){
			var ValorBooleano prueba = new ValorBooleanoImpl
			prueba = myVal as ValorBooleano
			prueba.toC
		}
		else if(myVal.eClass.name.equals("ConstCadena")){
			var ConstCadena prueba = new ConstCadenaImpl
			prueba = myVal as ConstCadena
			prueba.toC
		}else if(myVal.eClass.name.equals("Caracter")){
			var Caracter prueba = new CaracterImpl
			prueba = myVal as Caracter
			prueba.toC
		}
		else if(myVal.eClass.name.equals("VariableID")){
			var VariableID prueba = new VariableIDImpl
			prueba = myVal as VariableID
			prueba.toC
		}
		else if(myVal.eClass.name.equals("LlamadaFuncion")){
			var LlamadaFuncion prueba = new LlamadaFuncionImpl
			prueba = myVal as LlamadaFuncion
			prueba.toC(false)
		}
		else if(myVal.eClass.name.equals("operacion")){
			var operacion prueba = new operacionImpl
			prueba = myVal as operacion
			prueba.toC
		}
		else if(myVal.eClass.name.equals("Internas")) {
			var Internas prueba = new InternasImpl
			prueba = myVal as Internas
			prueba.toC
		}	
		else if(myVal.eClass.name.equals("unaria")) {
			var unaria prueba = new unariaImpl
			prueba = myVal as unaria
			prueba.toC
		}
	}
	
	def toC(NumeroEntero numero){
		return numero.valor.toString
	}
	
	
	def toC(NumeroDecimal numero){
		return numero.valor.toString
	}
	
	def toC(ValorBooleano valBool){
		if(valBool.valor == booleano::VERDADERO)
			return "true"
		else
			return "false"
	}
	
	def toC(ConstCadena cadena){
		print(cadena.contenido)
	}
	
	def toC(Caracter caract){
		print(caract.contenido)
	}
	
	def toC(VariableID variable)'''
		«variable.nombre»«FOR matri:variable.mat»«matri.toString»«ENDFOR»'''
	
	def toC(incremento inc)'''
		«inc.nombre»«inc.ssigno»;
		'''
	def toC(unaria myUnaria)'''
		!«myUnaria.variable.toC»
	'''
	
	def toC(Leer l)'''
		cin >> «l.variable.nombre»;
	'''
	
	def toC(Internas i) {
		if(i.nombre == NombreInterna::COS) {
			'''cos(«i.operador.toC»)'''
		}
		else if(i.nombre == NombreInterna::SEN) {
			'''sin(«i.operador.toC»)'''
		}
		else if(i.nombre == NombreInterna::CUADRADO) {
			'''pow(«i.operador.toC»,«2.0»)'''
		}
		else if(i.nombre == NombreInterna::EXP) {
			'''exp2(«i.operador.toC»)'''
		}
		else if(i.nombre == NombreInterna::LN) {
			'''log(«i.operador.toC»)'''
		}
		else if(i.nombre == NombreInterna::LOG) {
			'''log10(«i.operador.toC»)'''
		}
		else if(i.nombre == NombreInterna::SQRT) {
			'''sqrt(«i.operador.toC»)'''
		}
	}		
	
	def coutOperadores(EList<Operador> operadores){
		var resultado = "";
		for(o:operadores){
			resultado = resultado + " << " + o.toC;
		}
		return resultado;
	}
	
	def toC(Escribir a)'''
		cout«a.operador.coutOperadores» << endl;
	'''
	
	def generaParametros(EList<Operador> operadores){
		var total = "";
		var actual = 1;
		for(o:operadores){
			if(actual != 1)
				total = total + ", "
			total = total + o.toC;
			actual = actual + 1;
		}
		return total;		
	}
	
	def toC(LlamadaFuncion fun, boolean a)'''«fun.nombre»(«fun.operador.generaParametros»)«IF a»;«ENDIF»'''
	
	def toC(Operador op){
		if(op.eClass.name.equals("NumeroEntero")){
			var NumeroEntero prueba = new NumeroEnteroImpl
			prueba = op as NumeroEntero
			prueba.toC
		}
		else if(op.eClass.name.equals("NumeroDecimal")){
			var NumeroDecimal prueba = new NumeroDecimalImpl
			prueba = op as NumeroDecimal
			prueba.toC
		}
		else if(op.eClass.name.equals("ValorBooleano")){
			var ValorBooleano prueba = new ValorBooleanoImpl
			prueba = op as ValorBooleano
			prueba.toC
		}
		else if(op.eClass.name.equals("ConstCadena")){
			var ConstCadena prueba = new ConstCadenaImpl
			prueba = op as ConstCadena
			prueba.toC
		}	
		else if(op.eClass.name.equals("Caracter")){
			var Caracter prueba = new CaracterImpl
			prueba = op as Caracter
			prueba.toC
		}	
		else if(op.eClass.name.equals("VariableID")){
			var VariableID prueba = new VariableIDImpl
			prueba = op as VariableID
			prueba.toC
		}	
	}
	
	def toC(operacion op)'''(«op.op_izq.oper_izq.toC» «IF op.signo_op.toString == 'y'»&&«ELSE»«IF op.signo_op.toString == 'o'»||«ELSE»«op.signo_op»«ENDIF»«ENDIF» «op.op_der.oper_der.toC»)'''
	
	def toC(Si mySi)'''
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
	
	def toC(Caso myCaso)'''
		case «myCaso.operador.toC»:
			«FOR sent:myCaso.sentencias»
				«sent.toC»
			«ENDFOR»
			«IF myCaso.devuelve != null» 
			«myCaso.devuelve.toC»
			«ENDIF»
		break;
	'''
	
	def toC(segun mySegun)'''
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
	
	def toC(Devolver myDevuelve)'''
		return «myDevuelve.devuelve.toC»;
	'''
	
	def toC(Sino mySino)'''
		else{
			«FOR sent:mySino.sentencias»
				
				«sent.toC»
			«ENDFOR»
			«IF mySino.devuelve != null» 
			«mySino.devuelve.toC»
			«ENDIF»	
		}
	'''
	
	def toC(mientras m)'''
		while(«m.valor.toC»){
			«FOR sent:m.sentencias»
				
				«sent.toC»
			«ENDFOR»
		}
	'''
	
	def toC(desde d)'''
		for(«d.asignacion.toC» «d.asignacion.lvalue» <= «d.valor.toC»; «d.asignacion.lvalue»++){
			«FOR sent:d.sentencias»
				
				«sent.toC»
			«ENDFOR»
		}
	'''
	
	def toC(repetir m)'''
		do{
			«FOR sent:m.sentencias»
				
				«sent.toC»
			«ENDFOR»
		}while(«m.valor.toC»)
	'''
}

