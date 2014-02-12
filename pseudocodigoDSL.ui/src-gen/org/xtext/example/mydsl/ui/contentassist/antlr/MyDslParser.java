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
					put(grammarAccess.getSubprocesoAccess().getAlternatives(), "rule__Subproceso__Alternatives");
					put(grammarAccess.getSentenciasAccess().getAlternatives(), "rule__Sentencias__Alternatives");
					put(grammarAccess.getOperadorAccess().getAlternatives(), "rule__Operador__Alternatives");
					put(grammarAccess.getValorAccess().getAlternatives(), "rule__Valor__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getTipoVariableAccess().getAlternatives(), "rule__TipoVariable__Alternatives");
					put(grammarAccess.getEFloatAccess().getAlternatives_4_0(), "rule__EFloat__Alternatives_4_0");
					put(grammarAccess.getBooleanoAccess().getAlternatives(), "rule__Booleano__Alternatives");
					put(grammarAccess.getSignoAccess().getAlternatives(), "rule__Signo__Alternatives");
					put(grammarAccess.getIncAccess().getAlternatives(), "rule__Inc__Alternatives");
					put(grammarAccess.getTipoPasoAccess().getAlternatives(), "rule__TipoPaso__Alternatives");
					put(grammarAccess.getCodigoAccess().getGroup(), "rule__Codigo__Group__0");
					put(grammarAccess.getCodigoAccess().getGroup_0(), "rule__Codigo__Group_0__0");
					put(grammarAccess.getInicioAccess().getGroup(), "rule__Inicio__Group__0");
					put(grammarAccess.getInicioAccess().getGroup_2(), "rule__Inicio__Group_2__0");
					put(grammarAccess.getInicioAccess().getGroup_4(), "rule__Inicio__Group_4__0");
					put(grammarAccess.getDeclaracionVariableAccess().getGroup(), "rule__DeclaracionVariable__Group__0");
					put(grammarAccess.getDeclaracionVariableAccess().getGroup_3(), "rule__DeclaracionVariable__Group_3__0");
					put(grammarAccess.getLlamadaFuncionAccess().getGroup(), "rule__LlamadaFuncion__Group__0");
					put(grammarAccess.getLlamadaFuncionAccess().getGroup_2(), "rule__LlamadaFuncion__Group_2__0");
					put(grammarAccess.getLlamadaFuncionAccess().getGroup_2_1(), "rule__LlamadaFuncion__Group_2_1__0");
					put(grammarAccess.getAsignacionAccess().getGroup(), "rule__Asignacion__Group__0");
					put(grammarAccess.getEscribirAccess().getGroup(), "rule__Escribir__Group__0");
					put(grammarAccess.getEscribirAccess().getGroup_3(), "rule__Escribir__Group_3__0");
					put(grammarAccess.getLeerAccess().getGroup(), "rule__Leer__Group__0");
					put(grammarAccess.getSiAccess().getGroup(), "rule__Si__Group__0");
					put(grammarAccess.getSiAccess().getGroup_3(), "rule__Si__Group_3__0");
					put(grammarAccess.getMientrasAccess().getGroup(), "rule__Mientras__Group__0");
					put(grammarAccess.getMientrasAccess().getGroup_3(), "rule__Mientras__Group_3__0");
					put(grammarAccess.getRepetirAccess().getGroup(), "rule__Repetir__Group__0");
					put(grammarAccess.getRepetirAccess().getGroup_1(), "rule__Repetir__Group_1__0");
					put(grammarAccess.getDesdeAccess().getGroup(), "rule__Desde__Group__0");
					put(grammarAccess.getDesdeAccess().getGroup_5(), "rule__Desde__Group_5__0");
					put(grammarAccess.getIncrementoAccess().getGroup(), "rule__Incremento__Group__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getVariableIDAccess().getGroup(), "rule__VariableID__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getEFloatAccess().getGroup(), "rule__EFloat__Group__0");
					put(grammarAccess.getEFloatAccess().getGroup_4(), "rule__EFloat__Group_4__0");
					put(grammarAccess.getOperacionAccess().getGroup(), "rule__Operacion__Group__0");
					put(grammarAccess.getSinoAccess().getGroup(), "rule__Sino__Group__0");
					put(grammarAccess.getSinoAccess().getGroup_2(), "rule__Sino__Group_2__0");
					put(grammarAccess.getParametroFuncionAccess().getGroup(), "rule__ParametroFuncion__Group__0");
					put(grammarAccess.getFuncionAccess().getGroup(), "rule__Funcion__Group__0");
					put(grammarAccess.getFuncionAccess().getGroup_4(), "rule__Funcion__Group_4__0");
					put(grammarAccess.getFuncionAccess().getGroup_4_1(), "rule__Funcion__Group_4_1__0");
					put(grammarAccess.getFuncionAccess().getGroup_7(), "rule__Funcion__Group_7__0");
					put(grammarAccess.getFuncionAccess().getGroup_9(), "rule__Funcion__Group_9__0");
					put(grammarAccess.getProcedimientoAccess().getGroup(), "rule__Procedimiento__Group__0");
					put(grammarAccess.getProcedimientoAccess().getGroup_3(), "rule__Procedimiento__Group_3__0");
					put(grammarAccess.getProcedimientoAccess().getGroup_3_1(), "rule__Procedimiento__Group_3_1__0");
					put(grammarAccess.getProcedimientoAccess().getGroup_6(), "rule__Procedimiento__Group_6__0");
					put(grammarAccess.getProcedimientoAccess().getGroup_8(), "rule__Procedimiento__Group_8__0");
					put(grammarAccess.getCodigoAccess().getFuncionAssignment_0_0(), "rule__Codigo__FuncionAssignment_0_0");
					put(grammarAccess.getCodigoAccess().getFuncionAssignment_0_1(), "rule__Codigo__FuncionAssignment_0_1");
					put(grammarAccess.getCodigoAccess().getTieneAssignment_1(), "rule__Codigo__TieneAssignment_1");
					put(grammarAccess.getCaracterAccess().getContenidoAssignment(), "rule__Caracter__ContenidoAssignment");
					put(grammarAccess.getInicioAccess().getDeclaracionvariableAssignment_2_0(), "rule__Inicio__DeclaracionvariableAssignment_2_0");
					put(grammarAccess.getInicioAccess().getDeclaracionvariableAssignment_2_1(), "rule__Inicio__DeclaracionvariableAssignment_2_1");
					put(grammarAccess.getInicioAccess().getTieneAssignment_4_0(), "rule__Inicio__TieneAssignment_4_0");
					put(grammarAccess.getInicioAccess().getTieneAssignment_4_1(), "rule__Inicio__TieneAssignment_4_1");
					put(grammarAccess.getDeclaracionVariableAccess().getTipoAssignment_0(), "rule__DeclaracionVariable__TipoAssignment_0");
					put(grammarAccess.getDeclaracionVariableAccess().getTieneIDsAssignment_2(), "rule__DeclaracionVariable__TieneIDsAssignment_2");
					put(grammarAccess.getDeclaracionVariableAccess().getTieneIDsAssignment_3_1(), "rule__DeclaracionVariable__TieneIDsAssignment_3_1");
					put(grammarAccess.getLlamadaFuncionAccess().getNombreAssignment_0(), "rule__LlamadaFuncion__NombreAssignment_0");
					put(grammarAccess.getLlamadaFuncionAccess().getOperadorAssignment_2_0(), "rule__LlamadaFuncion__OperadorAssignment_2_0");
					put(grammarAccess.getLlamadaFuncionAccess().getOperadorAssignment_2_1_1(), "rule__LlamadaFuncion__OperadorAssignment_2_1_1");
					put(grammarAccess.getAsignacionAccess().getLvalueAssignment_0(), "rule__Asignacion__LvalueAssignment_0");
					put(grammarAccess.getAsignacionAccess().getMatAssignment_1(), "rule__Asignacion__MatAssignment_1");
					put(grammarAccess.getAsignacionAccess().getOperadorAssignment_3(), "rule__Asignacion__OperadorAssignment_3");
					put(grammarAccess.getEscribirAccess().getOperadorAssignment_2(), "rule__Escribir__OperadorAssignment_2");
					put(grammarAccess.getEscribirAccess().getOperadorAssignment_3_1(), "rule__Escribir__OperadorAssignment_3_1");
					put(grammarAccess.getLeerAccess().getVariableAssignment_2(), "rule__Leer__VariableAssignment_2");
					put(grammarAccess.getSiAccess().getValorAssignment_1(), "rule__Si__ValorAssignment_1");
					put(grammarAccess.getSiAccess().getSentenciasAssignment_3_0(), "rule__Si__SentenciasAssignment_3_0");
					put(grammarAccess.getSiAccess().getSentenciasAssignment_3_1(), "rule__Si__SentenciasAssignment_3_1");
					put(grammarAccess.getSiAccess().getSinoAssignment_4(), "rule__Si__SinoAssignment_4");
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
					put(grammarAccess.getIncrementoAccess().getNombreAssignment_0(), "rule__Incremento__NombreAssignment_0");
					put(grammarAccess.getIncrementoAccess().getSsignoAssignment_1(), "rule__Incremento__SsignoAssignment_1");
					put(grammarAccess.getVariableAccess().getNombreAssignment_0(), "rule__Variable__NombreAssignment_0");
					put(grammarAccess.getVariableAccess().getMatAssignment_1(), "rule__Variable__MatAssignment_1");
					put(grammarAccess.getVariableIDAccess().getNombreAssignment_0(), "rule__VariableID__NombreAssignment_0");
					put(grammarAccess.getVariableIDAccess().getMatAssignment_1(), "rule__VariableID__MatAssignment_1");
					put(grammarAccess.getConstCadenaAccess().getContenidoAssignment(), "rule__ConstCadena__ContenidoAssignment");
					put(grammarAccess.getNumeroEnteroAccess().getValorAssignment(), "rule__NumeroEntero__ValorAssignment");
					put(grammarAccess.getNumeroDecimalAccess().getValorAssignment(), "rule__NumeroDecimal__ValorAssignment");
					put(grammarAccess.getValorBooleanoAccess().getValorAssignment(), "rule__ValorBooleano__ValorAssignment");
					put(grammarAccess.getOperacionAccess().getOp_izqAssignment_1(), "rule__Operacion__Op_izqAssignment_1");
					put(grammarAccess.getOperacionAccess().getSigno_opAssignment_2(), "rule__Operacion__Signo_opAssignment_2");
					put(grammarAccess.getOperacionAccess().getOp_derAssignment_3(), "rule__Operacion__Op_derAssignment_3");
					put(grammarAccess.getOperando_izqAccess().getOper_izqAssignment(), "rule__Operando_izq__Oper_izqAssignment");
					put(grammarAccess.getOperando_derAccess().getOper_derAssignment(), "rule__Operando_der__Oper_derAssignment");
					put(grammarAccess.getSinoAccess().getSentenciasAssignment_2_0(), "rule__Sino__SentenciasAssignment_2_0");
					put(grammarAccess.getSinoAccess().getSentenciasAssignment_2_1(), "rule__Sino__SentenciasAssignment_2_1");
					put(grammarAccess.getParametroFuncionAccess().getPasoAssignment_0(), "rule__ParametroFuncion__PasoAssignment_0");
					put(grammarAccess.getParametroFuncionAccess().getTipoAssignment_1(), "rule__ParametroFuncion__TipoAssignment_1");
					put(grammarAccess.getParametroFuncionAccess().getVariableAssignment_3(), "rule__ParametroFuncion__VariableAssignment_3");
					put(grammarAccess.getFuncionAccess().getTipoAssignment_0(), "rule__Funcion__TipoAssignment_0");
					put(grammarAccess.getFuncionAccess().getNombreAssignment_2(), "rule__Funcion__NombreAssignment_2");
					put(grammarAccess.getFuncionAccess().getParametrofuncionAssignment_4_0(), "rule__Funcion__ParametrofuncionAssignment_4_0");
					put(grammarAccess.getFuncionAccess().getParametrofuncionAssignment_4_1_1(), "rule__Funcion__ParametrofuncionAssignment_4_1_1");
					put(grammarAccess.getFuncionAccess().getDeclaracionvariableAssignment_7_0(), "rule__Funcion__DeclaracionvariableAssignment_7_0");
					put(grammarAccess.getFuncionAccess().getDeclaracionvariableAssignment_7_1(), "rule__Funcion__DeclaracionvariableAssignment_7_1");
					put(grammarAccess.getFuncionAccess().getSentenciasAssignment_9_0(), "rule__Funcion__SentenciasAssignment_9_0");
					put(grammarAccess.getFuncionAccess().getSentenciasAssignment_9_1(), "rule__Funcion__SentenciasAssignment_9_1");
					put(grammarAccess.getFuncionAccess().getDevuelveAssignment_12(), "rule__Funcion__DevuelveAssignment_12");
					put(grammarAccess.getProcedimientoAccess().getNombreAssignment_1(), "rule__Procedimiento__NombreAssignment_1");
					put(grammarAccess.getProcedimientoAccess().getParametrofuncionAssignment_3_0(), "rule__Procedimiento__ParametrofuncionAssignment_3_0");
					put(grammarAccess.getProcedimientoAccess().getParametrofuncionAssignment_3_1_1(), "rule__Procedimiento__ParametrofuncionAssignment_3_1_1");
					put(grammarAccess.getProcedimientoAccess().getDeclaracionvariableAssignment_6_0(), "rule__Procedimiento__DeclaracionvariableAssignment_6_0");
					put(grammarAccess.getProcedimientoAccess().getDeclaracionvariableAssignment_6_1(), "rule__Procedimiento__DeclaracionvariableAssignment_6_1");
					put(grammarAccess.getProcedimientoAccess().getSentenciasAssignment_8_0(), "rule__Procedimiento__SentenciasAssignment_8_0");
					put(grammarAccess.getProcedimientoAccess().getSentenciasAssignment_8_1(), "rule__Procedimiento__SentenciasAssignment_8_1");
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
