package vary.pseudocodigo.dsl.cpp.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import diagramapseudocodigo.And;
import diagramapseudocodigo.Archivo;
import diagramapseudocodigo.AsignacionCompleja;
import diagramapseudocodigo.AsignacionNormal;
import diagramapseudocodigo.CampoRegistro;
import diagramapseudocodigo.Caracter;
import diagramapseudocodigo.Caso;
import diagramapseudocodigo.Codigo;
import diagramapseudocodigo.Comentario;
import diagramapseudocodigo.Comparacion;
import diagramapseudocodigo.ConstCadena;
import diagramapseudocodigo.Constantes;
import diagramapseudocodigo.DeclaracionPropia;
import diagramapseudocodigo.DeclaracionVariable;
import diagramapseudocodigo.Devolver;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Division;
import diagramapseudocodigo.Enumerado;
import diagramapseudocodigo.Escribir;
import diagramapseudocodigo.Funcion;
import diagramapseudocodigo.FuncionFicheroAbrir;
import diagramapseudocodigo.FuncionFicheroCerrar;
import diagramapseudocodigo.Igualdad;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.Internas;
import diagramapseudocodigo.Leer;
import diagramapseudocodigo.LlamadaFuncion;
import diagramapseudocodigo.Matriz;
import diagramapseudocodigo.Multiplicacion;
import diagramapseudocodigo.Negacion;
import diagramapseudocodigo.Negativa;
import diagramapseudocodigo.NumeroDecimal;
import diagramapseudocodigo.NumeroEntero;
import diagramapseudocodigo.Or;
import diagramapseudocodigo.ParametroFuncion;
import diagramapseudocodigo.Procedimiento;
import diagramapseudocodigo.Registro;
import diagramapseudocodigo.Resta;
import diagramapseudocodigo.Si;
import diagramapseudocodigo.Sino;
import diagramapseudocodigo.SubrangoEnumerado;
import diagramapseudocodigo.SubrangoNumerico;
import diagramapseudocodigo.Suma;
import diagramapseudocodigo.TipoDefinido;
import diagramapseudocodigo.TipoExistente;
import diagramapseudocodigo.ValorBooleano;
import diagramapseudocodigo.ValorMatriz;
import diagramapseudocodigo.ValorRegistro;
import diagramapseudocodigo.ValorVector;
import diagramapseudocodigo.Variable;
import diagramapseudocodigo.VariableID;
import diagramapseudocodigo.Vector;
import diagramapseudocodigo.desde;
import diagramapseudocodigo.mientras;
import diagramapseudocodigo.repetir;
import diagramapseudocodigo.segun;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import vary.pseudocodigo.dsl.cpp.services.VaryGrammarGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractVaryGrammarSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VaryGrammarGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DiagramapseudocodigoPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DiagramapseudocodigoPackage.AND:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_And(context, (And) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.ARCHIVO:
				if(context == grammarAccess.getArchivoRule() ||
				   context == grammarAccess.getTipoComplejoRule()) {
					sequence_Archivo(context, (Archivo) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA:
				if(context == grammarAccess.getAsignacionRule() ||
				   context == grammarAccess.getAsignacionComplejaRule() ||
				   context == grammarAccess.getSentenciasRule()) {
					sequence_AsignacionCompleja(context, (AsignacionCompleja) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL:
				if(context == grammarAccess.getAsignacionRule() ||
				   context == grammarAccess.getAsignacionNormalRule() ||
				   context == grammarAccess.getSentenciasRule()) {
					sequence_AsignacionNormal(context, (AsignacionNormal) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO:
				if(context == grammarAccess.getCampoRegistroRule()) {
					sequence_CampoRegistro(context, (CampoRegistro) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.CARACTER:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getVariablesBasicasRule() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_VariablesBasicas(context, (Caracter) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.CASO:
				if(context == grammarAccess.getCasoRule()) {
					sequence_Caso(context, (Caso) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.CODIGO:
				if(context == grammarAccess.getCodigoRule()) {
					sequence_Codigo(context, (Codigo) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.COMENTARIO:
				if(context == grammarAccess.getComentarioRule()) {
					sequence_Comentario(context, (Comentario) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.COMPARACION:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_Comparacion(context, (Comparacion) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.CONST_CADENA:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getVariablesBasicasRule() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_VariablesBasicas(context, (ConstCadena) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.CONSTANTES:
				if(context == grammarAccess.getConstantesRule()) {
					sequence_Constantes(context, (Constantes) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.DECLARACION_PROPIA:
				if(context == grammarAccess.getDeclaracionRule() ||
				   context == grammarAccess.getDeclaracionPropiaRule()) {
					sequence_DeclaracionPropia(context, (DeclaracionPropia) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.DECLARACION_VARIABLE:
				if(context == grammarAccess.getDeclaracionRule() ||
				   context == grammarAccess.getDeclaracionVariableRule()) {
					sequence_DeclaracionVariable(context, (DeclaracionVariable) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.DEVOLVER:
				if(context == grammarAccess.getDevolverRule()) {
					sequence_Devolver(context, (Devolver) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.DIVISION:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_MultiplicacionDivision(context, (Division) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.ENUMERADO:
				if(context == grammarAccess.getEnumeradoRule() ||
				   context == grammarAccess.getTipoComplejoRule()) {
					sequence_Enumerado(context, (Enumerado) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.ESCRIBIR:
				if(context == grammarAccess.getEscribirRule() ||
				   context == grammarAccess.getSentenciasRule()) {
					sequence_Escribir(context, (Escribir) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.FUNCION:
				if(context == grammarAccess.getFuncionRule() ||
				   context == grammarAccess.getSubprocesoRule()) {
					sequence_Funcion(context, (Funcion) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.FUNCION_FICHERO_ABRIR:
				if(context == grammarAccess.getFuncionFicheroAbrirRule() ||
				   context == grammarAccess.getSentenciasRule()) {
					sequence_FuncionFicheroAbrir(context, (FuncionFicheroAbrir) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.FUNCION_FICHERO_CERRAR:
				if(context == grammarAccess.getFuncionFicheroCerrarRule() ||
				   context == grammarAccess.getSentenciasRule()) {
					sequence_FuncionFicheroCerrar(context, (FuncionFicheroCerrar) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.IGUALDAD:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_Igualdad(context, (Igualdad) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.INICIO:
				if(context == grammarAccess.getInicioRule()) {
					sequence_Inicio(context, (Inicio) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.INTERNAS:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getFuncionesRule() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSentenciasRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_Funciones(context, (Internas) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.LEER:
				if(context == grammarAccess.getLeerRule() ||
				   context == grammarAccess.getSentenciasRule()) {
					sequence_Leer(context, (Leer) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.LLAMADA_FUNCION:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getFuncionesRule() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSentenciasRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_Funciones(context, (LlamadaFuncion) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.MATRIZ:
				if(context == grammarAccess.getMatrizRule() ||
				   context == grammarAccess.getTipoComplejoRule()) {
					sequence_Matriz(context, (Matriz) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.MULTIPLICACION:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_MultiplicacionDivision(context, (Multiplicacion) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.NEGACION:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_Primaria(context, (Negacion) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.NEGATIVA:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_Primaria(context, (Negativa) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.NUMERO_DECIMAL:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getVariablesBasicasRule() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_VariablesBasicas(context, (NumeroDecimal) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.NUMERO_ENTERO:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getVariablesBasicasRule() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_VariablesBasicas(context, (NumeroEntero) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.OR:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_Or(context, (Or) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.PARAMETRO_FUNCION:
				if(context == grammarAccess.getParametroFuncionRule()) {
					sequence_ParametroFuncion(context, (ParametroFuncion) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.PROCEDIMIENTO:
				if(context == grammarAccess.getProcedimientoRule() ||
				   context == grammarAccess.getSubprocesoRule()) {
					sequence_Procedimiento(context, (Procedimiento) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.REGISTRO:
				if(context == grammarAccess.getRegistroRule() ||
				   context == grammarAccess.getTipoComplejoRule()) {
					sequence_Registro(context, (Registro) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.RESTA:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_SumaResta(context, (Resta) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.SI:
				if(context == grammarAccess.getBloqueRule() ||
				   context == grammarAccess.getSentenciasRule() ||
				   context == grammarAccess.getSiRule()) {
					sequence_Si(context, (Si) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.SINO:
				if(context == grammarAccess.getSinoRule()) {
					sequence_Sino(context, (Sino) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.SUBRANGO_ENUMERADO:
				if(context == grammarAccess.getSubrangoRule() ||
				   context == grammarAccess.getSubrangoEnumeradoRule() ||
				   context == grammarAccess.getTipoComplejoRule()) {
					sequence_SubrangoEnumerado(context, (SubrangoEnumerado) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.SUBRANGO_NUMERICO:
				if(context == grammarAccess.getSubrangoRule() ||
				   context == grammarAccess.getSubrangoNumericoRule() ||
				   context == grammarAccess.getTipoComplejoRule()) {
					sequence_SubrangoNumerico(context, (SubrangoNumerico) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.SUMA:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_SumaResta(context, (Suma) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.TIPO_DEFINIDO:
				if(context == grammarAccess.getTipoRule() ||
				   context == grammarAccess.getTipoDefinidoRule()) {
					sequence_TipoDefinido(context, (TipoDefinido) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.TIPO_EXISTENTE:
				if(context == grammarAccess.getTipoRule() ||
				   context == grammarAccess.getTipoExistenteRule()) {
					sequence_TipoExistente(context, (TipoExistente) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.VALOR_BOOLEANO:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getVariablesBasicasRule() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_VariablesBasicas(context, (ValorBooleano) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.VALOR_MATRIZ:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getVariablesComplejasRule() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_VariablesComplejas(context, (ValorMatriz) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.VALOR_REGISTRO:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getVariablesComplejasRule() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_VariablesComplejas(context, (ValorRegistro) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.VALOR_VECTOR:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getVariablesComplejasRule() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_VariablesComplejas(context, (ValorVector) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.VARIABLE:
				if(context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.VARIABLE_ID:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparacionRule() ||
				   context == grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0() ||
				   context == grammarAccess.getIgualdadRule() ||
				   context == grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionRule() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimariaRule() ||
				   context == grammarAccess.getSumaRestaRule() ||
				   context == grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0() ||
				   context == grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0() ||
				   context == grammarAccess.getVariablesBasicasRule() ||
				   context == grammarAccess.getOperacionRule()) {
					sequence_VariablesBasicas(context, (VariableID) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.VECTOR:
				if(context == grammarAccess.getTipoComplejoRule() ||
				   context == grammarAccess.getVectorRule()) {
					sequence_Vector(context, (Vector) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.DESDE:
				if(context == grammarAccess.getBloqueRule() ||
				   context == grammarAccess.getSentenciasRule() ||
				   context == grammarAccess.getDesdeRule()) {
					sequence_desde(context, (desde) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.MIENTRAS:
				if(context == grammarAccess.getBloqueRule() ||
				   context == grammarAccess.getSentenciasRule() ||
				   context == grammarAccess.getMientrasRule()) {
					sequence_mientras(context, (mientras) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.REPETIR:
				if(context == grammarAccess.getBloqueRule() ||
				   context == grammarAccess.getSentenciasRule() ||
				   context == grammarAccess.getRepetirRule()) {
					sequence_repetir(context, (repetir) semanticObject); 
					return; 
				}
				else break;
			case DiagramapseudocodigoPackage.SEGUN:
				if(context == grammarAccess.getBloqueRule() ||
				   context == grammarAccess.getSentenciasRule() ||
				   context == grammarAccess.getSegunRule()) {
					sequence_segun(context, (segun) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=And_And_1_0 signo_op=signoAnd right=Igualdad)
	 */
	protected void sequence_And(EObject context, And semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.AND__RIGHT));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.AND__SIGNO_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.AND__SIGNO_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndAccess().getAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndAccess().getSigno_opSignoAndParserRuleCall_1_1_0(), semanticObject.getSigno_op());
		feeder.accept(grammarAccess.getAndAccess().getRightIgualdadParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (tipo=Tipo nombre=EString)
	 */
	protected void sequence_Archivo(EObject context, Archivo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.ARCHIVO__NOMBRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.ARCHIVO__NOMBRE));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.ARCHIVO__TIPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.ARCHIVO__TIPO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArchivoAccess().getTipoTipoParserRuleCall_1_0(), semanticObject.getTipo());
		feeder.accept(grammarAccess.getArchivoAccess().getNombreEStringParserRuleCall_3_0(), semanticObject.getNombre());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (valor_asignacion=VariablesComplejas operador=operacion)
	 */
	protected void sequence_AsignacionCompleja(EObject context, AsignacionCompleja semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.ASIGNACION_COMPLEJA__OPERADOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.ASIGNACION_COMPLEJA__OPERADOR));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.ASIGNACION_COMPLEJA__VALOR_ASIGNACION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.ASIGNACION_COMPLEJA__VALOR_ASIGNACION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAsignacionComplejaAccess().getValor_asignacionVariablesComplejasParserRuleCall_0_0(), semanticObject.getValor_asignacion());
		feeder.accept(grammarAccess.getAsignacionComplejaAccess().getOperadorOperacionParserRuleCall_2_0(), semanticObject.getOperador());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (valor_asignacion=EString operador=operacion)
	 */
	protected void sequence_AsignacionNormal(EObject context, AsignacionNormal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     nombre_campo=EString
	 */
	protected void sequence_CampoRegistro(EObject context, CampoRegistro semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCampoRegistroAccess().getNombre_campoEStringParserRuleCall_0(), semanticObject.getNombre_campo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operador=Primaria (sentencias+=Sentencias sentencias+=Sentencias*)? devuelve=Devolver?)
	 */
	protected void sequence_Caso(EObject context, Caso semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (comentarios+=Comentario comentarios+=Comentario*)? 
	 *         (constantes+=Constantes constantes+=Constantes*)? 
	 *         (tipocomplejo+=TipoComplejo tipocomplejo+=TipoComplejo*)? 
	 *         (global+=Declaracion global+=Declaracion*)? 
	 *         (funcion+=Subproceso funcion+=Subproceso*)? 
	 *         tiene=Inicio
	 *     )
	 */
	protected void sequence_Codigo(EObject context, Codigo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     mensaje=COMENT
	 */
	protected void sequence_Comentario(EObject context, Comentario semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.COMENTARIO__MENSAJE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.COMENTARIO__MENSAJE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComentarioAccess().getMensajeCOMENTTerminalRuleCall_2_0(), semanticObject.getMensaje());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Comparacion_Comparacion_1_0 signo_op=signoComparacion right=SumaResta)
	 */
	protected void sequence_Comparacion(EObject context, Comparacion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.COMPARACION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.COMPARACION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.COMPARACION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.COMPARACION__RIGHT));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.COMPARACION__SIGNO_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.COMPARACION__SIGNO_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparacionAccess().getSigno_opSignoComparacionParserRuleCall_1_1_0(), semanticObject.getSigno_op());
		feeder.accept(grammarAccess.getComparacionAccess().getRightSumaRestaParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variable=Variable valor=Primaria)
	 */
	protected void sequence_Constantes(EObject context, Constantes semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.CONSTANTES__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.CONSTANTES__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.CONSTANTES__VALOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.CONSTANTES__VALOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantesAccess().getVariableVariableParserRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getConstantesAccess().getValorPrimariaParserRuleCall_2_0(), semanticObject.getValor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (tipo=EString variable+=Variable variable+=Variable*)
	 */
	protected void sequence_DeclaracionPropia(EObject context, DeclaracionPropia semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tipo=TipoVariable variable+=Variable variable+=Variable*)
	 */
	protected void sequence_DeclaracionVariable(EObject context, DeclaracionVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     devuelve=Primaria
	 */
	protected void sequence_Devolver(EObject context, Devolver semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=EString valor+=Primaria valor+=Primaria*)
	 */
	protected void sequence_Enumerado(EObject context, Enumerado semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operador+=Primaria (operador+=Primaria | operador+=operacion)*)
	 */
	protected void sequence_Escribir(EObject context, Escribir semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable+=Primaria modo=ModoApertura variable+=Primaria)
	 */
	protected void sequence_FuncionFicheroAbrir(EObject context, FuncionFicheroAbrir semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     variable=Primaria
	 */
	protected void sequence_FuncionFicheroCerrar(EObject context, FuncionFicheroCerrar semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_CERRAR__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_CERRAR__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFuncionFicheroCerrarAccess().getVariablePrimariaParserRuleCall_2_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         tipo=TipoVariable 
	 *         nombre=EString 
	 *         (parametrofuncion+=ParametroFuncion parametrofuncion+=ParametroFuncion*)? 
	 *         (declaracion+=Declaracion declaracion+=Declaracion*)? 
	 *         (sentencias+=Sentencias sentencias+=Sentencias*)? 
	 *         devuelve=Devolver
	 *     )
	 */
	protected void sequence_Funcion(EObject context, Funcion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=NombreInterna (operadores+=operacion operadores+=operacion*)?)
	 */
	protected void sequence_Funciones(EObject context, Internas semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=EString (operadores+=operacion operadores+=operacion*)?)
	 */
	protected void sequence_Funciones(EObject context, LlamadaFuncion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Igualdad_Igualdad_1_0 signo_op=signoIgualdad right=Comparacion)
	 */
	protected void sequence_Igualdad(EObject context, Igualdad semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.IGUALDAD__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.IGUALDAD__LEFT));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.IGUALDAD__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.IGUALDAD__RIGHT));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.IGUALDAD__SIGNO_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.IGUALDAD__SIGNO_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getIgualdadAccess().getSigno_opSignoIgualdadParserRuleCall_1_1_0(), semanticObject.getSigno_op());
		feeder.accept(grammarAccess.getIgualdadAccess().getRightComparacionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((declaracion+=Declaracion declaracion+=Declaracion*)? (tiene+=Sentencias tiene+=Sentencias*)?)
	 */
	protected void sequence_Inicio(EObject context, Inicio semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     variable=Primaria
	 */
	protected void sequence_Leer(EObject context, Leer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.LEER__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.LEER__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLeerAccess().getVariablePrimariaParserRuleCall_2_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (valor+=Primaria valor+=Primaria tipo=Tipo nombre=EString)
	 */
	protected void sequence_Matriz(EObject context, Matriz semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultiplicacionDivision_Division_1_0_1_0 signo_op=signoDivision right=Primaria)
	 */
	protected void sequence_MultiplicacionDivision(EObject context, Division semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.DIVISION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.DIVISION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.DIVISION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.DIVISION__RIGHT));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.DIVISION__SIGNO_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.DIVISION__SIGNO_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoDivisionParserRuleCall_1_0_1_1_0(), semanticObject.getSigno_op());
		feeder.accept(grammarAccess.getMultiplicacionDivisionAccess().getRightPrimariaParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultiplicacionDivision_Multiplicacion_1_0_0_0 signo_op=signoMultiplicacion right=Primaria)
	 */
	protected void sequence_MultiplicacionDivision(EObject context, Multiplicacion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.MULTIPLICACION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.MULTIPLICACION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.MULTIPLICACION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.MULTIPLICACION__RIGHT));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.MULTIPLICACION__SIGNO_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.MULTIPLICACION__SIGNO_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoMultiplicacionParserRuleCall_1_0_0_1_0(), semanticObject.getSigno_op());
		feeder.accept(grammarAccess.getMultiplicacionDivisionAccess().getRightPrimariaParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Or_Or_1_0 signo_op=signoOr right=And)
	 */
	protected void sequence_Or(EObject context, Or semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.OR__RIGHT));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.OR__SIGNO_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.OR__SIGNO_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrAccess().getOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrAccess().getSigno_opSignoOrParserRuleCall_1_1_0(), semanticObject.getSigno_op());
		feeder.accept(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (paso=TipoPaso tipo=Tipo variable=Variable)
	 */
	protected void sequence_ParametroFuncion(EObject context, ParametroFuncion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.PARAMETRO_FUNCION__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.PARAMETRO_FUNCION__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.PARAMETRO_FUNCION__PASO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.PARAMETRO_FUNCION__PASO));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.PARAMETRO_FUNCION__TIPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.PARAMETRO_FUNCION__TIPO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_0_0(), semanticObject.getPaso());
		feeder.accept(grammarAccess.getParametroFuncionAccess().getTipoTipoParserRuleCall_1_0(), semanticObject.getTipo());
		feeder.accept(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_3_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     valor_operacion=operacion
	 */
	protected void sequence_Primaria(EObject context, Negacion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.NEGACION__VALOR_OPERACION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.NEGACION__VALOR_OPERACION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimariaAccess().getValor_operacionOperacionParserRuleCall_3_3_0(), semanticObject.getValor_operacion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     valor_operacion=operacion
	 */
	protected void sequence_Primaria(EObject context, Negativa semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.NEGATIVA__VALOR_OPERACION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.NEGATIVA__VALOR_OPERACION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimariaAccess().getValor_operacionOperacionParserRuleCall_2_2_0(), semanticObject.getValor_operacion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         nombre=EString 
	 *         (parametrofuncion+=ParametroFuncion parametrofuncion+=ParametroFuncion*)? 
	 *         (declaracion+=Declaracion declaracion+=Declaracion*)? 
	 *         (sentencias+=Sentencias sentencias+=Sentencias*)?
	 *     )
	 */
	protected void sequence_Procedimiento(EObject context, Procedimiento semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=EString variable+=Declaracion variable+=Declaracion*)
	 */
	protected void sequence_Registro(EObject context, Registro semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valor=operacion (sentencias+=Sentencias sentencias+=Sentencias*)? devuelve=Devolver? sino=Sino?)
	 */
	protected void sequence_Si(EObject context, Si semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((sentencias+=Sentencias sentencias+=Sentencias*)? devuelve=Devolver?)
	 */
	protected void sequence_Sino(EObject context, Sino semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=EString limite_inf=EString limite_sup=EString)
	 */
	protected void sequence_SubrangoEnumerado(EObject context, SubrangoEnumerado semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.SUBRANGO__NOMBRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.SUBRANGO__NOMBRE));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.SUBRANGO_ENUMERADO__LIMITE_INF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.SUBRANGO_ENUMERADO__LIMITE_INF));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.SUBRANGO_ENUMERADO__LIMITE_SUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.SUBRANGO_ENUMERADO__LIMITE_SUP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubrangoEnumeradoAccess().getNombreEStringParserRuleCall_0_0(), semanticObject.getNombre());
		feeder.accept(grammarAccess.getSubrangoEnumeradoAccess().getLimite_infEStringParserRuleCall_2_0_0(), semanticObject.getLimite_inf());
		feeder.accept(grammarAccess.getSubrangoEnumeradoAccess().getLimite_supEStringParserRuleCall_2_2_0(), semanticObject.getLimite_sup());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=EString limite_inf=EInt limite_sup=EInt)
	 */
	protected void sequence_SubrangoNumerico(EObject context, SubrangoNumerico semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.SUBRANGO__NOMBRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.SUBRANGO__NOMBRE));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.SUBRANGO_NUMERICO__LIMITE_INF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.SUBRANGO_NUMERICO__LIMITE_INF));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.SUBRANGO_NUMERICO__LIMITE_SUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.SUBRANGO_NUMERICO__LIMITE_SUP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubrangoNumericoAccess().getNombreEStringParserRuleCall_0_0(), semanticObject.getNombre());
		feeder.accept(grammarAccess.getSubrangoNumericoAccess().getLimite_infEIntParserRuleCall_2_0_0(), semanticObject.getLimite_inf());
		feeder.accept(grammarAccess.getSubrangoNumericoAccess().getLimite_supEIntParserRuleCall_2_2_0(), semanticObject.getLimite_sup());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SumaResta_Resta_1_0_1_0 signo_op=signoResta right=MultiplicacionDivision)
	 */
	protected void sequence_SumaResta(EObject context, Resta semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.RESTA__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.RESTA__LEFT));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.RESTA__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.RESTA__RIGHT));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.RESTA__SIGNO_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.RESTA__SIGNO_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSumaRestaAccess().getSigno_opSignoRestaParserRuleCall_1_0_1_1_0(), semanticObject.getSigno_op());
		feeder.accept(grammarAccess.getSumaRestaAccess().getRightMultiplicacionDivisionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SumaResta_Suma_1_0_0_0 signo_op=signoSuma right=MultiplicacionDivision)
	 */
	protected void sequence_SumaResta(EObject context, Suma semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.SUMA__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.SUMA__LEFT));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.SUMA__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.SUMA__RIGHT));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.SUMA__SIGNO_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.SUMA__SIGNO_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSumaRestaAccess().getSigno_opSignoSumaParserRuleCall_1_0_0_1_0(), semanticObject.getSigno_op());
		feeder.accept(grammarAccess.getSumaRestaAccess().getRightMultiplicacionDivisionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     tipo=EString
	 */
	protected void sequence_TipoDefinido(EObject context, TipoDefinido semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.TIPO_DEFINIDO__TIPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.TIPO_DEFINIDO__TIPO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTipoDefinidoAccess().getTipoEStringParserRuleCall_0(), semanticObject.getTipo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     tipo=TipoVariable
	 */
	protected void sequence_TipoExistente(EObject context, TipoExistente semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.TIPO_EXISTENTE__TIPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.TIPO_EXISTENTE__TIPO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTipoExistenteAccess().getTipoTipoVariableParserRuleCall_0(), semanticObject.getTipo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     nombre=EString
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     contenido=CAR
	 */
	protected void sequence_VariablesBasicas(EObject context, Caracter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.CARACTER__CONTENIDO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.CARACTER__CONTENIDO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariablesBasicasAccess().getContenidoCARTerminalRuleCall_3_1_0(), semanticObject.getContenido());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     contenido=CAD
	 */
	protected void sequence_VariablesBasicas(EObject context, ConstCadena semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.CONST_CADENA__CONTENIDO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.CONST_CADENA__CONTENIDO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariablesBasicasAccess().getContenidoCADTerminalRuleCall_2_1_0(), semanticObject.getContenido());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     valor=EFloat
	 */
	protected void sequence_VariablesBasicas(EObject context, NumeroDecimal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.NUMERO_DECIMAL__VALOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.NUMERO_DECIMAL__VALOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariablesBasicasAccess().getValorEFloatParserRuleCall_1_1_0(), semanticObject.getValor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     valor=EInt
	 */
	protected void sequence_VariablesBasicas(EObject context, NumeroEntero semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.NUMERO_ENTERO__VALOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.NUMERO_ENTERO__VALOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariablesBasicasAccess().getValorEIntParserRuleCall_0_1_0(), semanticObject.getValor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     valor=booleano
	 */
	protected void sequence_VariablesBasicas(EObject context, ValorBooleano semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.VALOR_BOOLEANO__VALOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.VALOR_BOOLEANO__VALOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariablesBasicasAccess().getValorBooleanoParserRuleCall_4_1_0(), semanticObject.getValor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     nombre=EString
	 */
	protected void sequence_VariablesBasicas(EObject context, VariableID semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nombre_matriz=EString primerIndice=VariablesBasicas segundoIndice=VariablesBasicas campo+=CampoRegistro?)
	 */
	protected void sequence_VariablesComplejas(EObject context, ValorMatriz semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nombre_registro=EString campo+=CampoRegistro campo+=CampoRegistro*)
	 */
	protected void sequence_VariablesComplejas(EObject context, ValorRegistro semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nombre_vector=EString indice=VariablesBasicas campo+=CampoRegistro?)
	 */
	protected void sequence_VariablesComplejas(EObject context, ValorVector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valor=Primaria tipo=Tipo nombre=EString)
	 */
	protected void sequence_Vector(EObject context, Vector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.VECTOR__VALOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.VECTOR__VALOR));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.VECTOR__TIPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.VECTOR__TIPO));
			if(transientValues.isValueTransient(semanticObject, DiagramapseudocodigoPackage.Literals.VECTOR__NOMBRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramapseudocodigoPackage.Literals.VECTOR__NOMBRE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVectorAccess().getValorPrimariaParserRuleCall_2_0(), semanticObject.getValor());
		feeder.accept(grammarAccess.getVectorAccess().getTipoTipoParserRuleCall_5_0(), semanticObject.getTipo());
		feeder.accept(grammarAccess.getVectorAccess().getNombreEStringParserRuleCall_7_0(), semanticObject.getNombre());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (asignacion=AsignacionNormal valor=operacion (sentencias+=Sentencias sentencias+=Sentencias*)?)
	 */
	protected void sequence_desde(EObject context, desde semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valor=operacion (sentencias+=Sentencias sentencias+=Sentencias*)?)
	 */
	protected void sequence_mientras(EObject context, mientras semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((sentencias+=Sentencias sentencias+=Sentencias*)? valor=operacion)
	 */
	protected void sequence_repetir(EObject context, repetir semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valor=Primaria (caso+=Caso caso+=Caso*)? (sentencias+=Sentencias sentencias+=Sentencias*)? devuelve=Devolver?)
	 */
	protected void sequence_segun(EObject context, segun semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
