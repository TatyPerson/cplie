package vary.pseudocodigo.dsl.cpp.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import vary.pseudocodigo.dsl.cpp.services.VaryGrammarGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractVaryGrammarSyntacticSequencer extends AbstractSyntacticSequencer {

	protected VaryGrammarGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Codigo_ConstKeyword_3_0_q;
	protected AbstractElementAlias match_Codigo_TipoKeyword_4_0_q;
	protected AbstractElementAlias match_Codigo_VarKeyword_5_0_q;
	protected AbstractElementAlias match_Funcion_ConstKeyword_6_q;
	protected AbstractElementAlias match_Funcion_TipoKeyword_7_q;
	protected AbstractElementAlias match_Primaria_VerticalLineKeyword_0_0_a;
	protected AbstractElementAlias match_Primaria_VerticalLineKeyword_0_0_p;
	protected AbstractElementAlias match_Procedimiento_ConstKeyword_5_q;
	protected AbstractElementAlias match_Procedimiento_TipoKeyword_6_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (VaryGrammarGrammarAccess) access;
		match_Codigo_ConstKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getCodigoAccess().getConstKeyword_3_0());
		match_Codigo_TipoKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getCodigoAccess().getTipoKeyword_4_0());
		match_Codigo_VarKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getCodigoAccess().getVarKeyword_5_0());
		match_Funcion_ConstKeyword_6_q = new TokenAlias(false, true, grammarAccess.getFuncionAccess().getConstKeyword_6());
		match_Funcion_TipoKeyword_7_q = new TokenAlias(false, true, grammarAccess.getFuncionAccess().getTipoKeyword_7());
		match_Primaria_VerticalLineKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getPrimariaAccess().getVerticalLineKeyword_0_0());
		match_Primaria_VerticalLineKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getPrimariaAccess().getVerticalLineKeyword_0_0());
		match_Procedimiento_ConstKeyword_5_q = new TokenAlias(false, true, grammarAccess.getProcedimientoAccess().getConstKeyword_5());
		match_Procedimiento_TipoKeyword_6_q = new TokenAlias(false, true, grammarAccess.getProcedimientoAccess().getTipoKeyword_6());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getEStringRule())
			return getEStringToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSL_COMMENTRule())
			return getSL_COMMENTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * EString returns ecore::EString:
	 * 	STRING | ID;
	 */
	protected String getEStringToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	/**
	 * terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')? ;
	 */
	protected String getSL_COMMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "//";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Codigo_ConstKeyword_3_0_q.equals(syntax))
				emit_Codigo_ConstKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Codigo_TipoKeyword_4_0_q.equals(syntax))
				emit_Codigo_TipoKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Codigo_VarKeyword_5_0_q.equals(syntax))
				emit_Codigo_VarKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Funcion_ConstKeyword_6_q.equals(syntax))
				emit_Funcion_ConstKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Funcion_TipoKeyword_7_q.equals(syntax))
				emit_Funcion_TipoKeyword_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primaria_VerticalLineKeyword_0_0_a.equals(syntax))
				emit_Primaria_VerticalLineKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primaria_VerticalLineKeyword_0_0_p.equals(syntax))
				emit_Primaria_VerticalLineKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Procedimiento_ConstKeyword_5_q.equals(syntax))
				emit_Procedimiento_ConstKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Procedimiento_TipoKeyword_6_q.equals(syntax))
				emit_Procedimiento_TipoKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'const'?
	 */
	protected void emit_Codigo_ConstKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'tipo'?
	 */
	protected void emit_Codigo_TipoKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'var'?
	 */
	protected void emit_Codigo_VarKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'const'?
	 */
	protected void emit_Funcion_ConstKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'tipo'?
	 */
	protected void emit_Funcion_TipoKeyword_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '|'*
	 */
	protected void emit_Primaria_VerticalLineKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '|'+
	 */
	protected void emit_Primaria_VerticalLineKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'const'?
	 */
	protected void emit_Procedimiento_ConstKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'tipo'?
	 */
	protected void emit_Procedimiento_TipoKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
