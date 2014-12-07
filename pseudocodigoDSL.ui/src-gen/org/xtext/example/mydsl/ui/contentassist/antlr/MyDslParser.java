/*
* generated by Xtext
*/
package org.xtext.example.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {
	
	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser createParser() {
		org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser result = new org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTipoComplejoAccess().getAlternatives(), "rule__TipoComplejo__Alternatives");
					put(grammarAccess.getSubprocesoAccess().getAlternatives(), "rule__Subproceso__Alternatives");
					put(grammarAccess.getComentarioAccess().getAlternatives(), "rule__Comentario__Alternatives");
					put(grammarAccess.getSentenciasAccess().getAlternatives(), "rule__Sentencias__Alternatives");
					put(grammarAccess.getBloqueAccess().getAlternatives(), "rule__Bloque__Alternatives");
					put(grammarAccess.getDeclaracionAccess().getAlternatives(), "rule__Declaracion__Alternatives");
					put(grammarAccess.getModoAperturaAccess().getAlternatives(), "rule__ModoApertura__Alternatives");
					put(grammarAccess.getNombreInternaAccess().getAlternatives(), "rule__NombreInterna__Alternatives");
					put(grammarAccess.getEFloatAccess().getAlternatives_3_0(), "rule__EFloat__Alternatives_3_0");
					put(grammarAccess.getEFloatAccess().getAlternatives_3_1(), "rule__EFloat__Alternatives_3_1");
					put(grammarAccess.getTipoAccess().getAlternatives(), "rule__Tipo__Alternatives");
					put(grammarAccess.getSubrangoAccess().getAlternatives(), "rule__Subrango__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEscribirAccess().getAlternatives_3(), "rule__Escribir__Alternatives_3");
					put(grammarAccess.getTipoVariableAccess().getAlternatives(), "rule__TipoVariable__Alternatives");
					put(grammarAccess.getBooleanoAccess().getAlternatives(), "rule__Booleano__Alternatives");
					put(grammarAccess.getSignoAccess().getAlternatives(), "rule__Signo__Alternatives");
					put(grammarAccess.getSignoIgualdadAccess().getAlternatives(), "rule__SignoIgualdad__Alternatives");
					put(grammarAccess.getSignoComparacionAccess().getAlternatives(), "rule__SignoComparacion__Alternatives");
					put(grammarAccess.getSumaRestaAccess().getAlternatives_1_0(), "rule__SumaResta__Alternatives_1_0");
					put(grammarAccess.getMultiplicacionDivisionAccess().getAlternatives_1_0(), "rule__MultiplicacionDivision__Alternatives_1_0");
					put(grammarAccess.getPrimariaAccess().getAlternatives(), "rule__Primaria__Alternatives");
					put(grammarAccess.getVariablesBasicasAccess().getAlternatives(), "rule__VariablesBasicas__Alternatives");
					put(grammarAccess.getTipoPasoAccess().getAlternatives(), "rule__TipoPaso__Alternatives");
					put(grammarAccess.getCodigoAccess().getGroup(), "rule__Codigo__Group__0");
					put(grammarAccess.getCodigoAccess().getGroup_2(), "rule__Codigo__Group_2__0");
					put(grammarAccess.getCodigoAccess().getGroup_3(), "rule__Codigo__Group_3__0");
					put(grammarAccess.getCodigoAccess().getGroup_3_1(), "rule__Codigo__Group_3_1__0");
					put(grammarAccess.getCodigoAccess().getGroup_4(), "rule__Codigo__Group_4__0");
					put(grammarAccess.getCodigoAccess().getGroup_4_1(), "rule__Codigo__Group_4_1__0");
					put(grammarAccess.getCodigoAccess().getGroup_5(), "rule__Codigo__Group_5__0");
					put(grammarAccess.getCodigoAccess().getGroup_5_1(), "rule__Codigo__Group_5_1__0");
					put(grammarAccess.getCodigoAccess().getGroup_6(), "rule__Codigo__Group_6__0");
					put(grammarAccess.getComentarioAccess().getGroup_0(), "rule__Comentario__Group_0__0");
					put(grammarAccess.getComentarioAccess().getGroup_1(), "rule__Comentario__Group_1__0");
					put(grammarAccess.getFuncionFicheroAbrirAccess().getGroup(), "rule__FuncionFicheroAbrir__Group__0");
					put(grammarAccess.getFuncionFicheroAbrirAccess().getGroup_2(), "rule__FuncionFicheroAbrir__Group_2__0");
					put(grammarAccess.getFuncionFicheroCerrarAccess().getGroup(), "rule__FuncionFicheroCerrar__Group__0");
					put(grammarAccess.getEFloatAccess().getGroup(), "rule__EFloat__Group__0");
					put(grammarAccess.getEFloatAccess().getGroup_3(), "rule__EFloat__Group_3__0");
					put(grammarAccess.getConstantesAccess().getGroup(), "rule__Constantes__Group__0");
					put(grammarAccess.getVectorAccess().getGroup(), "rule__Vector__Group__0");
					put(grammarAccess.getMatrizAccess().getGroup(), "rule__Matriz__Group__0");
					put(grammarAccess.getRegistroAccess().getGroup(), "rule__Registro__Group__0");
					put(grammarAccess.getRegistroAccess().getGroup_2(), "rule__Registro__Group_2__0");
					put(grammarAccess.getArchivoAccess().getGroup(), "rule__Archivo__Group__0");
					put(grammarAccess.getEnumeradoAccess().getGroup(), "rule__Enumerado__Group__0");
					put(grammarAccess.getEnumeradoAccess().getGroup_3(), "rule__Enumerado__Group_3__0");
					put(grammarAccess.getEnumeradoAccess().getGroup_3_1(), "rule__Enumerado__Group_3_1__0");
					put(grammarAccess.getSubrangoNumericoAccess().getGroup(), "rule__SubrangoNumerico__Group__0");
					put(grammarAccess.getSubrangoNumericoAccess().getGroup_2(), "rule__SubrangoNumerico__Group_2__0");
					put(grammarAccess.getSubrangoEnumeradoAccess().getGroup(), "rule__SubrangoEnumerado__Group__0");
					put(grammarAccess.getSubrangoEnumeradoAccess().getGroup_2(), "rule__SubrangoEnumerado__Group_2__0");
					put(grammarAccess.getInicioAccess().getGroup(), "rule__Inicio__Group__0");
					put(grammarAccess.getInicioAccess().getGroup_3(), "rule__Inicio__Group_3__0");
					put(grammarAccess.getInicioAccess().getGroup_5(), "rule__Inicio__Group_5__0");
					put(grammarAccess.getDeclaracionVariableAccess().getGroup(), "rule__DeclaracionVariable__Group__0");
					put(grammarAccess.getDeclaracionVariableAccess().getGroup_3(), "rule__DeclaracionVariable__Group_3__0");
					put(grammarAccess.getDeclaracionPropiaAccess().getGroup(), "rule__DeclaracionPropia__Group__0");
					put(grammarAccess.getDeclaracionPropiaAccess().getGroup_3(), "rule__DeclaracionPropia__Group_3__0");
					put(grammarAccess.getAsignacionAccess().getGroup(), "rule__Asignacion__Group__0");
					put(grammarAccess.getEscribirAccess().getGroup(), "rule__Escribir__Group__0");
					put(grammarAccess.getEscribirAccess().getGroup_3_0(), "rule__Escribir__Group_3_0__0");
					put(grammarAccess.getLeerAccess().getGroup(), "rule__Leer__Group__0");
					put(grammarAccess.getSiAccess().getGroup(), "rule__Si__Group__0");
					put(grammarAccess.getSiAccess().getGroup_3(), "rule__Si__Group_3__0");
					put(grammarAccess.getMientrasAccess().getGroup(), "rule__Mientras__Group__0");
					put(grammarAccess.getMientrasAccess().getGroup_3(), "rule__Mientras__Group_3__0");
					put(grammarAccess.getRepetirAccess().getGroup(), "rule__Repetir__Group__0");
					put(grammarAccess.getRepetirAccess().getGroup_1(), "rule__Repetir__Group_1__0");
					put(grammarAccess.getDesdeAccess().getGroup(), "rule__Desde__Group__0");
					put(grammarAccess.getDesdeAccess().getGroup_5(), "rule__Desde__Group_5__0");
					put(grammarAccess.getCasoAccess().getGroup(), "rule__Caso__Group__0");
					put(grammarAccess.getCasoAccess().getGroup_3(), "rule__Caso__Group_3__0");
					put(grammarAccess.getSegunAccess().getGroup(), "rule__Segun__Group__0");
					put(grammarAccess.getSegunAccess().getGroup_5(), "rule__Segun__Group_5__0");
					put(grammarAccess.getSegunAccess().getGroup_7(), "rule__Segun__Group_7__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
					put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
					put(grammarAccess.getIgualdadAccess().getGroup(), "rule__Igualdad__Group__0");
					put(grammarAccess.getIgualdadAccess().getGroup_1(), "rule__Igualdad__Group_1__0");
					put(grammarAccess.getComparacionAccess().getGroup(), "rule__Comparacion__Group__0");
					put(grammarAccess.getComparacionAccess().getGroup_1(), "rule__Comparacion__Group_1__0");
					put(grammarAccess.getSumaRestaAccess().getGroup(), "rule__SumaResta__Group__0");
					put(grammarAccess.getSumaRestaAccess().getGroup_1(), "rule__SumaResta__Group_1__0");
					put(grammarAccess.getSumaRestaAccess().getGroup_1_0_0(), "rule__SumaResta__Group_1_0_0__0");
					put(grammarAccess.getSumaRestaAccess().getGroup_1_0_1(), "rule__SumaResta__Group_1_0_1__0");
					put(grammarAccess.getMultiplicacionDivisionAccess().getGroup(), "rule__MultiplicacionDivision__Group__0");
					put(grammarAccess.getMultiplicacionDivisionAccess().getGroup_1(), "rule__MultiplicacionDivision__Group_1__0");
					put(grammarAccess.getMultiplicacionDivisionAccess().getGroup_1_0_0(), "rule__MultiplicacionDivision__Group_1_0_0__0");
					put(grammarAccess.getMultiplicacionDivisionAccess().getGroup_1_0_1(), "rule__MultiplicacionDivision__Group_1_0_1__0");
					put(grammarAccess.getPrimariaAccess().getGroup_0(), "rule__Primaria__Group_0__0");
					put(grammarAccess.getPrimariaAccess().getGroup_2(), "rule__Primaria__Group_2__0");
					put(grammarAccess.getPrimariaAccess().getGroup_2_3(), "rule__Primaria__Group_2_3__0");
					put(grammarAccess.getPrimariaAccess().getGroup_2_3_1(), "rule__Primaria__Group_2_3_1__0");
					put(grammarAccess.getPrimariaAccess().getGroup_3(), "rule__Primaria__Group_3__0");
					put(grammarAccess.getPrimariaAccess().getGroup_3_3(), "rule__Primaria__Group_3_3__0");
					put(grammarAccess.getPrimariaAccess().getGroup_3_3_1(), "rule__Primaria__Group_3_3_1__0");
					put(grammarAccess.getPrimariaAccess().getGroup_4(), "rule__Primaria__Group_4__0");
					put(grammarAccess.getPrimariaAccess().getGroup_4_1(), "rule__Primaria__Group_4_1__0");
					put(grammarAccess.getPrimariaAccess().getGroup_4_2(), "rule__Primaria__Group_4_2__0");
					put(grammarAccess.getPrimariaAccess().getGroup_5(), "rule__Primaria__Group_5__0");
					put(grammarAccess.getPrimariaAccess().getGroup_5_1(), "rule__Primaria__Group_5_1__0");
					put(grammarAccess.getPrimariaAccess().getGroup_5_2(), "rule__Primaria__Group_5_2__0");
					put(grammarAccess.getVariablesBasicasAccess().getGroup_0(), "rule__VariablesBasicas__Group_0__0");
					put(grammarAccess.getVariablesBasicasAccess().getGroup_1(), "rule__VariablesBasicas__Group_1__0");
					put(grammarAccess.getVariablesBasicasAccess().getGroup_2(), "rule__VariablesBasicas__Group_2__0");
					put(grammarAccess.getVariablesBasicasAccess().getGroup_3(), "rule__VariablesBasicas__Group_3__0");
					put(grammarAccess.getVariablesBasicasAccess().getGroup_4(), "rule__VariablesBasicas__Group_4__0");
					put(grammarAccess.getVariablesBasicasAccess().getGroup_5(), "rule__VariablesBasicas__Group_5__0");
					put(grammarAccess.getVariablesBasicasAccess().getGroup_6(), "rule__VariablesBasicas__Group_6__0");
					put(grammarAccess.getVariablesBasicasAccess().getGroup_6_3(), "rule__VariablesBasicas__Group_6_3__0");
					put(grammarAccess.getVariablesBasicasAccess().getGroup_6_3_1(), "rule__VariablesBasicas__Group_6_3_1__0");
					put(grammarAccess.getSinoAccess().getGroup(), "rule__Sino__Group__0");
					put(grammarAccess.getSinoAccess().getGroup_2(), "rule__Sino__Group_2__0");
					put(grammarAccess.getDevolverAccess().getGroup(), "rule__Devolver__Group__0");
					put(grammarAccess.getParametroFuncionAccess().getGroup(), "rule__ParametroFuncion__Group__0");
					put(grammarAccess.getFuncionAccess().getGroup(), "rule__Funcion__Group__0");
					put(grammarAccess.getFuncionAccess().getGroup_4(), "rule__Funcion__Group_4__0");
					put(grammarAccess.getFuncionAccess().getGroup_4_1(), "rule__Funcion__Group_4_1__0");
					put(grammarAccess.getFuncionAccess().getGroup_9(), "rule__Funcion__Group_9__0");
					put(grammarAccess.getFuncionAccess().getGroup_11(), "rule__Funcion__Group_11__0");
					put(grammarAccess.getProcedimientoAccess().getGroup(), "rule__Procedimiento__Group__0");
					put(grammarAccess.getProcedimientoAccess().getGroup_3(), "rule__Procedimiento__Group_3__0");
					put(grammarAccess.getProcedimientoAccess().getGroup_3_1(), "rule__Procedimiento__Group_3_1__0");
					put(grammarAccess.getProcedimientoAccess().getGroup_8(), "rule__Procedimiento__Group_8__0");
					put(grammarAccess.getProcedimientoAccess().getGroup_10(), "rule__Procedimiento__Group_10__0");
					put(grammarAccess.getCodigoAccess().getComentariosAssignment_2_0(), "rule__Codigo__ComentariosAssignment_2_0");
					put(grammarAccess.getCodigoAccess().getComentariosAssignment_2_1(), "rule__Codigo__ComentariosAssignment_2_1");
					put(grammarAccess.getCodigoAccess().getConstantesAssignment_3_1_0(), "rule__Codigo__ConstantesAssignment_3_1_0");
					put(grammarAccess.getCodigoAccess().getConstantesAssignment_3_1_1(), "rule__Codigo__ConstantesAssignment_3_1_1");
					put(grammarAccess.getCodigoAccess().getTipocomplejoAssignment_4_1_0(), "rule__Codigo__TipocomplejoAssignment_4_1_0");
					put(grammarAccess.getCodigoAccess().getTipocomplejoAssignment_4_1_1(), "rule__Codigo__TipocomplejoAssignment_4_1_1");
					put(grammarAccess.getCodigoAccess().getGlobalAssignment_5_1_0(), "rule__Codigo__GlobalAssignment_5_1_0");
					put(grammarAccess.getCodigoAccess().getGlobalAssignment_5_1_1(), "rule__Codigo__GlobalAssignment_5_1_1");
					put(grammarAccess.getCodigoAccess().getFuncionAssignment_6_0(), "rule__Codigo__FuncionAssignment_6_0");
					put(grammarAccess.getCodigoAccess().getFuncionAssignment_6_1(), "rule__Codigo__FuncionAssignment_6_1");
					put(grammarAccess.getCodigoAccess().getTieneAssignment_7(), "rule__Codigo__TieneAssignment_7");
					put(grammarAccess.getComentarioAccess().getMensajeAssignment_1_1(), "rule__Comentario__MensajeAssignment_1_1");
					put(grammarAccess.getFuncionFicheroAbrirAccess().getVariableAssignment_2_0(), "rule__FuncionFicheroAbrir__VariableAssignment_2_0");
					put(grammarAccess.getFuncionFicheroAbrirAccess().getModoAssignment_2_2(), "rule__FuncionFicheroAbrir__ModoAssignment_2_2");
					put(grammarAccess.getFuncionFicheroAbrirAccess().getVariableAssignment_2_4(), "rule__FuncionFicheroAbrir__VariableAssignment_2_4");
					put(grammarAccess.getFuncionFicheroCerrarAccess().getVariableAssignment_2(), "rule__FuncionFicheroCerrar__VariableAssignment_2");
					put(grammarAccess.getCampoRegistroAccess().getNombre_campoAssignment(), "rule__CampoRegistro__Nombre_campoAssignment");
					put(grammarAccess.getTipoDefinidoAccess().getTipoAssignment(), "rule__TipoDefinido__TipoAssignment");
					put(grammarAccess.getTipoExistenteAccess().getTipoAssignment(), "rule__TipoExistente__TipoAssignment");
					put(grammarAccess.getConstantesAccess().getVariableAssignment_0(), "rule__Constantes__VariableAssignment_0");
					put(grammarAccess.getConstantesAccess().getValorAssignment_2(), "rule__Constantes__ValorAssignment_2");
					put(grammarAccess.getVectorAccess().getValorAssignment_2(), "rule__Vector__ValorAssignment_2");
					put(grammarAccess.getVectorAccess().getTipoAssignment_5(), "rule__Vector__TipoAssignment_5");
					put(grammarAccess.getVectorAccess().getNombreAssignment_7(), "rule__Vector__NombreAssignment_7");
					put(grammarAccess.getMatrizAccess().getValorAssignment_2(), "rule__Matriz__ValorAssignment_2");
					put(grammarAccess.getMatrizAccess().getValorAssignment_4(), "rule__Matriz__ValorAssignment_4");
					put(grammarAccess.getMatrizAccess().getTipoAssignment_7(), "rule__Matriz__TipoAssignment_7");
					put(grammarAccess.getMatrizAccess().getNombreAssignment_9(), "rule__Matriz__NombreAssignment_9");
					put(grammarAccess.getRegistroAccess().getNombreAssignment_1(), "rule__Registro__NombreAssignment_1");
					put(grammarAccess.getRegistroAccess().getVariableAssignment_2_0(), "rule__Registro__VariableAssignment_2_0");
					put(grammarAccess.getRegistroAccess().getVariableAssignment_2_1(), "rule__Registro__VariableAssignment_2_1");
					put(grammarAccess.getArchivoAccess().getTipoAssignment_1(), "rule__Archivo__TipoAssignment_1");
					put(grammarAccess.getArchivoAccess().getNombreAssignment_3(), "rule__Archivo__NombreAssignment_3");
					put(grammarAccess.getEnumeradoAccess().getNombreAssignment_0(), "rule__Enumerado__NombreAssignment_0");
					put(grammarAccess.getEnumeradoAccess().getValorAssignment_3_0(), "rule__Enumerado__ValorAssignment_3_0");
					put(grammarAccess.getEnumeradoAccess().getValorAssignment_3_1_1(), "rule__Enumerado__ValorAssignment_3_1_1");
					put(grammarAccess.getSubrangoNumericoAccess().getNombreAssignment_0(), "rule__SubrangoNumerico__NombreAssignment_0");
					put(grammarAccess.getSubrangoNumericoAccess().getLimite_infAssignment_2_0(), "rule__SubrangoNumerico__Limite_infAssignment_2_0");
					put(grammarAccess.getSubrangoNumericoAccess().getLimite_supAssignment_2_2(), "rule__SubrangoNumerico__Limite_supAssignment_2_2");
					put(grammarAccess.getSubrangoEnumeradoAccess().getNombreAssignment_0(), "rule__SubrangoEnumerado__NombreAssignment_0");
					put(grammarAccess.getSubrangoEnumeradoAccess().getLimite_infAssignment_2_0(), "rule__SubrangoEnumerado__Limite_infAssignment_2_0");
					put(grammarAccess.getSubrangoEnumeradoAccess().getLimite_supAssignment_2_2(), "rule__SubrangoEnumerado__Limite_supAssignment_2_2");
					put(grammarAccess.getInicioAccess().getDeclaracionAssignment_3_0(), "rule__Inicio__DeclaracionAssignment_3_0");
					put(grammarAccess.getInicioAccess().getDeclaracionAssignment_3_1(), "rule__Inicio__DeclaracionAssignment_3_1");
					put(grammarAccess.getInicioAccess().getTieneAssignment_5_0(), "rule__Inicio__TieneAssignment_5_0");
					put(grammarAccess.getInicioAccess().getTieneAssignment_5_1(), "rule__Inicio__TieneAssignment_5_1");
					put(grammarAccess.getDeclaracionVariableAccess().getTipoAssignment_0(), "rule__DeclaracionVariable__TipoAssignment_0");
					put(grammarAccess.getDeclaracionVariableAccess().getVariableAssignment_2(), "rule__DeclaracionVariable__VariableAssignment_2");
					put(grammarAccess.getDeclaracionVariableAccess().getVariableAssignment_3_1(), "rule__DeclaracionVariable__VariableAssignment_3_1");
					put(grammarAccess.getDeclaracionPropiaAccess().getTipoAssignment_0(), "rule__DeclaracionPropia__TipoAssignment_0");
					put(grammarAccess.getDeclaracionPropiaAccess().getVariableAssignment_2(), "rule__DeclaracionPropia__VariableAssignment_2");
					put(grammarAccess.getDeclaracionPropiaAccess().getVariableAssignment_3_1(), "rule__DeclaracionPropia__VariableAssignment_3_1");
					put(grammarAccess.getAsignacionAccess().getValor_asignacionAssignment_0(), "rule__Asignacion__Valor_asignacionAssignment_0");
					put(grammarAccess.getAsignacionAccess().getOperadoresAssignment_2(), "rule__Asignacion__OperadoresAssignment_2");
					put(grammarAccess.getEscribirAccess().getOperadorAssignment_2(), "rule__Escribir__OperadorAssignment_2");
					put(grammarAccess.getEscribirAccess().getOperadorAssignment_3_0_1(), "rule__Escribir__OperadorAssignment_3_0_1");
					put(grammarAccess.getEscribirAccess().getOperadorAssignment_3_1(), "rule__Escribir__OperadorAssignment_3_1");
					put(grammarAccess.getLeerAccess().getVariableAssignment_2(), "rule__Leer__VariableAssignment_2");
					put(grammarAccess.getSiAccess().getValorAssignment_1(), "rule__Si__ValorAssignment_1");
					put(grammarAccess.getSiAccess().getSentenciasAssignment_3_0(), "rule__Si__SentenciasAssignment_3_0");
					put(grammarAccess.getSiAccess().getSentenciasAssignment_3_1(), "rule__Si__SentenciasAssignment_3_1");
					put(grammarAccess.getSiAccess().getDevuelveAssignment_4(), "rule__Si__DevuelveAssignment_4");
					put(grammarAccess.getSiAccess().getSinoAssignment_5(), "rule__Si__SinoAssignment_5");
					put(grammarAccess.getMientrasAccess().getValorAssignment_1(), "rule__Mientras__ValorAssignment_1");
					put(grammarAccess.getMientrasAccess().getSentenciasAssignment_3_0(), "rule__Mientras__SentenciasAssignment_3_0");
					put(grammarAccess.getMientrasAccess().getSentenciasAssignment_3_1(), "rule__Mientras__SentenciasAssignment_3_1");
					put(grammarAccess.getRepetirAccess().getSentenciasAssignment_1_0(), "rule__Repetir__SentenciasAssignment_1_0");
					put(grammarAccess.getRepetirAccess().getSentenciasAssignment_1_1(), "rule__Repetir__SentenciasAssignment_1_1");
					put(grammarAccess.getRepetirAccess().getValorAssignment_3(), "rule__Repetir__ValorAssignment_3");
					put(grammarAccess.getDesdeAccess().getAsignacionAssignment_1(), "rule__Desde__AsignacionAssignment_1");
					put(grammarAccess.getDesdeAccess().getValorAssignment_3(), "rule__Desde__ValorAssignment_3");
					put(grammarAccess.getDesdeAccess().getSentenciasAssignment_5_0(), "rule__Desde__SentenciasAssignment_5_0");
					put(grammarAccess.getDesdeAccess().getSentenciasAssignment_5_1(), "rule__Desde__SentenciasAssignment_5_1");
					put(grammarAccess.getCasoAccess().getOperadorAssignment_1(), "rule__Caso__OperadorAssignment_1");
					put(grammarAccess.getCasoAccess().getSentenciasAssignment_3_0(), "rule__Caso__SentenciasAssignment_3_0");
					put(grammarAccess.getCasoAccess().getSentenciasAssignment_3_1(), "rule__Caso__SentenciasAssignment_3_1");
					put(grammarAccess.getCasoAccess().getDevuelveAssignment_4(), "rule__Caso__DevuelveAssignment_4");
					put(grammarAccess.getSegunAccess().getValorAssignment_2(), "rule__Segun__ValorAssignment_2");
					put(grammarAccess.getSegunAccess().getCasoAssignment_5_0(), "rule__Segun__CasoAssignment_5_0");
					put(grammarAccess.getSegunAccess().getCasoAssignment_5_1(), "rule__Segun__CasoAssignment_5_1");
					put(grammarAccess.getSegunAccess().getSentenciasAssignment_7_0(), "rule__Segun__SentenciasAssignment_7_0");
					put(grammarAccess.getSegunAccess().getSentenciasAssignment_7_1(), "rule__Segun__SentenciasAssignment_7_1");
					put(grammarAccess.getSegunAccess().getDevuelveAssignment_8(), "rule__Segun__DevuelveAssignment_8");
					put(grammarAccess.getVariableAccess().getNombreAssignment_1(), "rule__Variable__NombreAssignment_1");
					put(grammarAccess.getOrAccess().getSigno_opAssignment_1_1(), "rule__Or__Signo_opAssignment_1_1");
					put(grammarAccess.getOrAccess().getRightAssignment_1_2(), "rule__Or__RightAssignment_1_2");
					put(grammarAccess.getAndAccess().getSigno_opAssignment_1_1(), "rule__And__Signo_opAssignment_1_1");
					put(grammarAccess.getAndAccess().getRightAssignment_1_2(), "rule__And__RightAssignment_1_2");
					put(grammarAccess.getIgualdadAccess().getSigno_opAssignment_1_1(), "rule__Igualdad__Signo_opAssignment_1_1");
					put(grammarAccess.getIgualdadAccess().getRightAssignment_1_2(), "rule__Igualdad__RightAssignment_1_2");
					put(grammarAccess.getComparacionAccess().getSigno_opAssignment_1_1(), "rule__Comparacion__Signo_opAssignment_1_1");
					put(grammarAccess.getComparacionAccess().getRightAssignment_1_2(), "rule__Comparacion__RightAssignment_1_2");
					put(grammarAccess.getSumaRestaAccess().getSigno_opAssignment_1_0_0_1(), "rule__SumaResta__Signo_opAssignment_1_0_0_1");
					put(grammarAccess.getSumaRestaAccess().getSigno_opAssignment_1_0_1_1(), "rule__SumaResta__Signo_opAssignment_1_0_1_1");
					put(grammarAccess.getSumaRestaAccess().getRightAssignment_1_1(), "rule__SumaResta__RightAssignment_1_1");
					put(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opAssignment_1_0_0_1(), "rule__MultiplicacionDivision__Signo_opAssignment_1_0_0_1");
					put(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opAssignment_1_0_1_1(), "rule__MultiplicacionDivision__Signo_opAssignment_1_0_1_1");
					put(grammarAccess.getMultiplicacionDivisionAccess().getRightAssignment_1_1(), "rule__MultiplicacionDivision__RightAssignment_1_1");
					put(grammarAccess.getPrimariaAccess().getNombreAssignment_2_1(), "rule__Primaria__NombreAssignment_2_1");
					put(grammarAccess.getPrimariaAccess().getOperadoresAssignment_2_3_0(), "rule__Primaria__OperadoresAssignment_2_3_0");
					put(grammarAccess.getPrimariaAccess().getOperadoresAssignment_2_3_1_1(), "rule__Primaria__OperadoresAssignment_2_3_1_1");
					put(grammarAccess.getPrimariaAccess().getNombreAssignment_3_1(), "rule__Primaria__NombreAssignment_3_1");
					put(grammarAccess.getPrimariaAccess().getOperadoresAssignment_3_3_0(), "rule__Primaria__OperadoresAssignment_3_3_0");
					put(grammarAccess.getPrimariaAccess().getOperadoresAssignment_3_3_1_1(), "rule__Primaria__OperadoresAssignment_3_3_1_1");
					put(grammarAccess.getPrimariaAccess().getNombre_vectorAssignment_4_1_0(), "rule__Primaria__Nombre_vectorAssignment_4_1_0");
					put(grammarAccess.getPrimariaAccess().getIndiceAssignment_4_1_2(), "rule__Primaria__IndiceAssignment_4_1_2");
					put(grammarAccess.getPrimariaAccess().getCampoAssignment_4_2_1(), "rule__Primaria__CampoAssignment_4_2_1");
					put(grammarAccess.getPrimariaAccess().getNombre_matrizAssignment_5_1_0(), "rule__Primaria__Nombre_matrizAssignment_5_1_0");
					put(grammarAccess.getPrimariaAccess().getPrimerIndiceAssignment_5_1_2(), "rule__Primaria__PrimerIndiceAssignment_5_1_2");
					put(grammarAccess.getPrimariaAccess().getSegundoIndiceAssignment_5_1_4(), "rule__Primaria__SegundoIndiceAssignment_5_1_4");
					put(grammarAccess.getPrimariaAccess().getCampoAssignment_5_2_1(), "rule__Primaria__CampoAssignment_5_2_1");
					put(grammarAccess.getVariablesBasicasAccess().getValorAssignment_0_1(), "rule__VariablesBasicas__ValorAssignment_0_1");
					put(grammarAccess.getVariablesBasicasAccess().getValorAssignment_1_1(), "rule__VariablesBasicas__ValorAssignment_1_1");
					put(grammarAccess.getVariablesBasicasAccess().getContenidoAssignment_2_1(), "rule__VariablesBasicas__ContenidoAssignment_2_1");
					put(grammarAccess.getVariablesBasicasAccess().getContenidoAssignment_3_1(), "rule__VariablesBasicas__ContenidoAssignment_3_1");
					put(grammarAccess.getVariablesBasicasAccess().getValorAssignment_4_1(), "rule__VariablesBasicas__ValorAssignment_4_1");
					put(grammarAccess.getVariablesBasicasAccess().getNombreAssignment_5_1(), "rule__VariablesBasicas__NombreAssignment_5_1");
					put(grammarAccess.getVariablesBasicasAccess().getNombre_registroAssignment_6_1(), "rule__VariablesBasicas__Nombre_registroAssignment_6_1");
					put(grammarAccess.getVariablesBasicasAccess().getCampoAssignment_6_3_0(), "rule__VariablesBasicas__CampoAssignment_6_3_0");
					put(grammarAccess.getVariablesBasicasAccess().getCampoAssignment_6_3_1_1(), "rule__VariablesBasicas__CampoAssignment_6_3_1_1");
					put(grammarAccess.getSinoAccess().getSentenciasAssignment_2_0(), "rule__Sino__SentenciasAssignment_2_0");
					put(grammarAccess.getSinoAccess().getSentenciasAssignment_2_1(), "rule__Sino__SentenciasAssignment_2_1");
					put(grammarAccess.getSinoAccess().getDevuelveAssignment_3(), "rule__Sino__DevuelveAssignment_3");
					put(grammarAccess.getDevolverAccess().getDevuelveAssignment_2(), "rule__Devolver__DevuelveAssignment_2");
					put(grammarAccess.getParametroFuncionAccess().getPasoAssignment_0(), "rule__ParametroFuncion__PasoAssignment_0");
					put(grammarAccess.getParametroFuncionAccess().getTipoAssignment_1(), "rule__ParametroFuncion__TipoAssignment_1");
					put(grammarAccess.getParametroFuncionAccess().getVariableAssignment_3(), "rule__ParametroFuncion__VariableAssignment_3");
					put(grammarAccess.getFuncionAccess().getTipoAssignment_0(), "rule__Funcion__TipoAssignment_0");
					put(grammarAccess.getFuncionAccess().getNombreAssignment_2(), "rule__Funcion__NombreAssignment_2");
					put(grammarAccess.getFuncionAccess().getParametrofuncionAssignment_4_0(), "rule__Funcion__ParametrofuncionAssignment_4_0");
					put(grammarAccess.getFuncionAccess().getParametrofuncionAssignment_4_1_1(), "rule__Funcion__ParametrofuncionAssignment_4_1_1");
					put(grammarAccess.getFuncionAccess().getDeclaracionAssignment_9_0(), "rule__Funcion__DeclaracionAssignment_9_0");
					put(grammarAccess.getFuncionAccess().getDeclaracionAssignment_9_1(), "rule__Funcion__DeclaracionAssignment_9_1");
					put(grammarAccess.getFuncionAccess().getSentenciasAssignment_11_0(), "rule__Funcion__SentenciasAssignment_11_0");
					put(grammarAccess.getFuncionAccess().getSentenciasAssignment_11_1(), "rule__Funcion__SentenciasAssignment_11_1");
					put(grammarAccess.getFuncionAccess().getDevuelveAssignment_12(), "rule__Funcion__DevuelveAssignment_12");
					put(grammarAccess.getProcedimientoAccess().getNombreAssignment_1(), "rule__Procedimiento__NombreAssignment_1");
					put(grammarAccess.getProcedimientoAccess().getParametrofuncionAssignment_3_0(), "rule__Procedimiento__ParametrofuncionAssignment_3_0");
					put(grammarAccess.getProcedimientoAccess().getParametrofuncionAssignment_3_1_1(), "rule__Procedimiento__ParametrofuncionAssignment_3_1_1");
					put(grammarAccess.getProcedimientoAccess().getDeclaracionAssignment_8_0(), "rule__Procedimiento__DeclaracionAssignment_8_0");
					put(grammarAccess.getProcedimientoAccess().getDeclaracionAssignment_8_1(), "rule__Procedimiento__DeclaracionAssignment_8_1");
					put(grammarAccess.getProcedimientoAccess().getSentenciasAssignment_10_0(), "rule__Procedimiento__SentenciasAssignment_10_0");
					put(grammarAccess.getProcedimientoAccess().getSentenciasAssignment_10_1(), "rule__Procedimiento__SentenciasAssignment_10_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser typedParser = (org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser) parser;
			typedParser.entryRuleCodigo();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
