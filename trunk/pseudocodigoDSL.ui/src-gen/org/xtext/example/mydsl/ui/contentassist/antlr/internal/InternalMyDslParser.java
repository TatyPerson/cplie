package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_CAR", "RULE_MATRIZ", "RULE_CAD", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entero'", "'caracter'", "'real'", "'logico'", "'cadena'", "'E'", "'e'", "'verdadero'", "'falso'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'>='", "'<='", "'y'", "'o'", "'=='", "'!='", "'++'", "'--'", "'E/S'", "'inicio'", "'fin inicio'", "','", "'('", "')'", "'='", "'escribir'", "'leer'", "'si'", "'entonces'", "'fin si'", "'mientras'", "'hacer'", "'fin_mientras'", "'repetir'", "'hasta_que'", "'desde'", "'hasta'", "'fin_desde'", "'.'", "'sino'", "'funcion'", "'devolver'", "'fin_funcion'", "'procedimiento'", "'fin procedimiento'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_CAR=7;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int RULE_MATRIZ=8;
    public static final int RULE_CAD=9;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleCodigo"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleCodigo : ruleCodigo EOF ;
    public final void entryRuleCodigo() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleCodigo EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleCodigo EOF
            {
             before(grammarAccess.getCodigoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCodigo_in_entryRuleCodigo61);
            ruleCodigo();

            state._fsp--;

             after(grammarAccess.getCodigoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCodigo68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCodigo"


    // $ANTLR start "ruleCodigo"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleCodigo : ( ( rule__Codigo__Group__0 ) ) ;
    public final void ruleCodigo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__Codigo__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Codigo__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Codigo__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__Codigo__Group__0 )
            {
             before(grammarAccess.getCodigoAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Codigo__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__Codigo__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group__0_in_ruleCodigo94);
            rule__Codigo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodigoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodigo"


    // $ANTLR start "entryRuleSubproceso"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleSubproceso : ruleSubproceso EOF ;
    public final void entryRuleSubproceso() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleSubproceso EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleSubproceso EOF
            {
             before(grammarAccess.getSubprocesoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_entryRuleSubproceso121);
            ruleSubproceso();

            state._fsp--;

             after(grammarAccess.getSubprocesoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubproceso128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubproceso"


    // $ANTLR start "ruleSubproceso"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleSubproceso : ( ( rule__Subproceso__Alternatives ) ) ;
    public final void ruleSubproceso() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Subproceso__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Subproceso__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Subproceso__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Subproceso__Alternatives )
            {
             before(grammarAccess.getSubprocesoAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Subproceso__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Subproceso__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Subproceso__Alternatives_in_ruleSubproceso154);
            rule__Subproceso__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSubprocesoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubproceso"


    // $ANTLR start "entryRuleSentencias"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleSentencias : ruleSentencias EOF ;
    public final void entryRuleSentencias() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleSentencias EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleSentencias EOF
            {
             before(grammarAccess.getSentenciasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_entryRuleSentencias181);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getSentenciasRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentencias188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSentencias"


    // $ANTLR start "ruleSentencias"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleSentencias : ( ( rule__Sentencias__Alternatives ) ) ;
    public final void ruleSentencias() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Sentencias__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Sentencias__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Sentencias__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Sentencias__Alternatives )
            {
             before(grammarAccess.getSentenciasAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Sentencias__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Sentencias__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentencias__Alternatives_in_ruleSentencias214);
            rule__Sentencias__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSentenciasAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSentencias"


    // $ANTLR start "entryRuleOperador"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleOperador : ruleOperador EOF ;
    public final void entryRuleOperador() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleOperador EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleOperador EOF
            {
             before(grammarAccess.getOperadorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_entryRuleOperador241);
            ruleOperador();

            state._fsp--;

             after(grammarAccess.getOperadorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperador248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperador"


    // $ANTLR start "ruleOperador"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleOperador : ( ( rule__Operador__Alternatives ) ) ;
    public final void ruleOperador() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Operador__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Operador__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Operador__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Operador__Alternatives )
            {
             before(grammarAccess.getOperadorAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Operador__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Operador__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operador__Alternatives_in_ruleOperador274);
            rule__Operador__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperadorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperador"


    // $ANTLR start "entryRuleCaracter"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleCaracter : ruleCaracter EOF ;
    public final void entryRuleCaracter() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleCaracter EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleCaracter EOF
            {
             before(grammarAccess.getCaracterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_entryRuleCaracter301);
            ruleCaracter();

            state._fsp--;

             after(grammarAccess.getCaracterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCaracter308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCaracter"


    // $ANTLR start "ruleCaracter"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleCaracter : ( ( rule__Caracter__ContenidoAssignment ) ) ;
    public final void ruleCaracter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__Caracter__ContenidoAssignment ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Caracter__ContenidoAssignment ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Caracter__ContenidoAssignment ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__Caracter__ContenidoAssignment )
            {
             before(grammarAccess.getCaracterAccess().getContenidoAssignment()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__Caracter__ContenidoAssignment )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__Caracter__ContenidoAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Caracter__ContenidoAssignment_in_ruleCaracter334);
            rule__Caracter__ContenidoAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCaracterAccess().getContenidoAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCaracter"


    // $ANTLR start "entryRulevalor"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRulevalor : rulevalor EOF ;
    public final void entryRulevalor() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( rulevalor EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: rulevalor EOF
            {
             before(grammarAccess.getValorRule()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_entryRulevalor361);
            rulevalor();

            state._fsp--;

             after(grammarAccess.getValorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulevalor368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevalor"


    // $ANTLR start "rulevalor"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: rulevalor : ( ( rule__Valor__Alternatives ) ) ;
    public final void rulevalor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__Valor__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Valor__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Valor__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__Valor__Alternatives )
            {
             before(grammarAccess.getValorAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__Valor__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__Valor__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Valor__Alternatives_in_rulevalor394);
            rule__Valor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevalor"


    // $ANTLR start "entryRuleInicio"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleInicio : ruleInicio EOF ;
    public final void entryRuleInicio() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleInicio EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleInicio EOF
            {
             before(grammarAccess.getInicioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_entryRuleInicio421);
            ruleInicio();

            state._fsp--;

             after(grammarAccess.getInicioRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInicio428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInicio"


    // $ANTLR start "ruleInicio"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleInicio : ( ( rule__Inicio__Group__0 ) ) ;
    public final void ruleInicio() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__Inicio__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Inicio__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Inicio__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__Inicio__Group__0 )
            {
             before(grammarAccess.getInicioAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__Inicio__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__Inicio__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__0_in_ruleInicio454);
            rule__Inicio__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInicioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInicio"


    // $ANTLR start "entryRuleEString"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleEString EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString481);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__EString__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__EString__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( rule__EString__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString514);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleDeclaracionVariable"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: entryRuleDeclaracionVariable : ruleDeclaracionVariable EOF ;
    public final void entryRuleDeclaracionVariable() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( ruleDeclaracionVariable EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ruleDeclaracionVariable EOF
            {
             before(grammarAccess.getDeclaracionVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable541);
            ruleDeclaracionVariable();

            state._fsp--;

             after(grammarAccess.getDeclaracionVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionVariable548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaracionVariable"


    // $ANTLR start "ruleDeclaracionVariable"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: ruleDeclaracionVariable : ( ( rule__DeclaracionVariable__Group__0 ) ) ;
    public final void ruleDeclaracionVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:297:2: ( ( ( rule__DeclaracionVariable__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__DeclaracionVariable__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__DeclaracionVariable__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rule__DeclaracionVariable__Group__0 )
            {
             before(grammarAccess.getDeclaracionVariableAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( rule__DeclaracionVariable__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: rule__DeclaracionVariable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__0_in_ruleDeclaracionVariable574);
            rule__DeclaracionVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracionVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaracionVariable"


    // $ANTLR start "entryRuleLlamadaFuncion"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: entryRuleLlamadaFuncion : ruleLlamadaFuncion EOF ;
    public final void entryRuleLlamadaFuncion() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( ruleLlamadaFuncion EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ruleLlamadaFuncion EOF
            {
             before(grammarAccess.getLlamadaFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_entryRuleLlamadaFuncion601);
            ruleLlamadaFuncion();

            state._fsp--;

             after(grammarAccess.getLlamadaFuncionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLlamadaFuncion608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLlamadaFuncion"


    // $ANTLR start "ruleLlamadaFuncion"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ruleLlamadaFuncion : ( ( rule__LlamadaFuncion__Group__0 ) ) ;
    public final void ruleLlamadaFuncion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:325:2: ( ( ( rule__LlamadaFuncion__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__LlamadaFuncion__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__LlamadaFuncion__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ( rule__LlamadaFuncion__Group__0 )
            {
             before(grammarAccess.getLlamadaFuncionAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( rule__LlamadaFuncion__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:2: rule__LlamadaFuncion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__0_in_ruleLlamadaFuncion634);
            rule__LlamadaFuncion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLlamadaFuncionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLlamadaFuncion"


    // $ANTLR start "entryRuleAsignacion"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: entryRuleAsignacion : ruleAsignacion EOF ;
    public final void entryRuleAsignacion() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( ruleAsignacion EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ruleAsignacion EOF
            {
             before(grammarAccess.getAsignacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_entryRuleAsignacion661);
            ruleAsignacion();

            state._fsp--;

             after(grammarAccess.getAsignacionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacion668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAsignacion"


    // $ANTLR start "ruleAsignacion"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:349:1: ruleAsignacion : ( ( rule__Asignacion__Group__0 ) ) ;
    public final void ruleAsignacion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:353:2: ( ( ( rule__Asignacion__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__Asignacion__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__Asignacion__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( rule__Asignacion__Group__0 )
            {
             before(grammarAccess.getAsignacionAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( rule__Asignacion__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:2: rule__Asignacion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__0_in_ruleAsignacion694);
            rule__Asignacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAsignacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAsignacion"


    // $ANTLR start "entryRuleEscribir"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:368:1: entryRuleEscribir : ruleEscribir EOF ;
    public final void entryRuleEscribir() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( ruleEscribir EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ruleEscribir EOF
            {
             before(grammarAccess.getEscribirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_entryRuleEscribir721);
            ruleEscribir();

            state._fsp--;

             after(grammarAccess.getEscribirRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEscribir728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEscribir"


    // $ANTLR start "ruleEscribir"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: ruleEscribir : ( ( rule__Escribir__Group__0 ) ) ;
    public final void ruleEscribir() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:381:2: ( ( ( rule__Escribir__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__Escribir__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__Escribir__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ( rule__Escribir__Group__0 )
            {
             before(grammarAccess.getEscribirAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( rule__Escribir__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:2: rule__Escribir__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__0_in_ruleEscribir754);
            rule__Escribir__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEscribirAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEscribir"


    // $ANTLR start "entryRuleLeer"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:396:1: entryRuleLeer : ruleLeer EOF ;
    public final void entryRuleLeer() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: ( ruleLeer EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: ruleLeer EOF
            {
             before(grammarAccess.getLeerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeer_in_entryRuleLeer781);
            ruleLeer();

            state._fsp--;

             after(grammarAccess.getLeerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeer788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeer"


    // $ANTLR start "ruleLeer"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: ruleLeer : ( ( rule__Leer__Group__0 ) ) ;
    public final void ruleLeer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:409:2: ( ( ( rule__Leer__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__Leer__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__Leer__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: ( rule__Leer__Group__0 )
            {
             before(grammarAccess.getLeerAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( rule__Leer__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:2: rule__Leer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__0_in_ruleLeer814);
            rule__Leer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeer"


    // $ANTLR start "entryRuleSi"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:424:1: entryRuleSi : ruleSi EOF ;
    public final void entryRuleSi() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: ( ruleSi EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ruleSi EOF
            {
             before(grammarAccess.getSiRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSi_in_entryRuleSi841);
            ruleSi();

            state._fsp--;

             after(grammarAccess.getSiRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSi848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSi"


    // $ANTLR start "ruleSi"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ruleSi : ( ( rule__Si__Group__0 ) ) ;
    public final void ruleSi() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:437:2: ( ( ( rule__Si__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__Si__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__Si__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( rule__Si__Group__0 )
            {
             before(grammarAccess.getSiAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ( rule__Si__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:2: rule__Si__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__0_in_ruleSi874);
            rule__Si__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSiAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSi"


    // $ANTLR start "entryRulemientras"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:452:1: entryRulemientras : rulemientras EOF ;
    public final void entryRulemientras() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: ( rulemientras EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:454:1: rulemientras EOF
            {
             before(grammarAccess.getMientrasRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemientras_in_entryRulemientras901);
            rulemientras();

            state._fsp--;

             after(grammarAccess.getMientrasRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemientras908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemientras"


    // $ANTLR start "rulemientras"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: rulemientras : ( ( rule__Mientras__Group__0 ) ) ;
    public final void rulemientras() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:465:2: ( ( ( rule__Mientras__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__Mientras__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__Mientras__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:467:1: ( rule__Mientras__Group__0 )
            {
             before(grammarAccess.getMientrasAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( rule__Mientras__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:2: rule__Mientras__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__0_in_rulemientras934);
            rule__Mientras__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMientrasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemientras"


    // $ANTLR start "entryRulerepetir"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:480:1: entryRulerepetir : rulerepetir EOF ;
    public final void entryRulerepetir() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:481:1: ( rulerepetir EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: rulerepetir EOF
            {
             before(grammarAccess.getRepetirRule()); 
            pushFollow(FollowSets000.FOLLOW_rulerepetir_in_entryRulerepetir961);
            rulerepetir();

            state._fsp--;

             after(grammarAccess.getRepetirRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulerepetir968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerepetir"


    // $ANTLR start "rulerepetir"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: rulerepetir : ( ( rule__Repetir__Group__0 ) ) ;
    public final void rulerepetir() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:493:2: ( ( ( rule__Repetir__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( ( rule__Repetir__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( ( rule__Repetir__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: ( rule__Repetir__Group__0 )
            {
             before(grammarAccess.getRepetirAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( rule__Repetir__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:2: rule__Repetir__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__0_in_rulerepetir994);
            rule__Repetir__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepetirAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerepetir"


    // $ANTLR start "entryRuledesde"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:508:1: entryRuledesde : ruledesde EOF ;
    public final void entryRuledesde() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: ( ruledesde EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: ruledesde EOF
            {
             before(grammarAccess.getDesdeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruledesde_in_entryRuledesde1021);
            ruledesde();

            state._fsp--;

             after(grammarAccess.getDesdeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuledesde1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuledesde"


    // $ANTLR start "ruledesde"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:517:1: ruledesde : ( ( rule__Desde__Group__0 ) ) ;
    public final void ruledesde() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:521:2: ( ( ( rule__Desde__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( ( rule__Desde__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( ( rule__Desde__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: ( rule__Desde__Group__0 )
            {
             before(grammarAccess.getDesdeAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( rule__Desde__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:2: rule__Desde__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__0_in_ruledesde1054);
            rule__Desde__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDesdeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledesde"


    // $ANTLR start "entryRuleincremento"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:536:1: entryRuleincremento : ruleincremento EOF ;
    public final void entryRuleincremento() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: ( ruleincremento EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: ruleincremento EOF
            {
             before(grammarAccess.getIncrementoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleincremento_in_entryRuleincremento1081);
            ruleincremento();

            state._fsp--;

             after(grammarAccess.getIncrementoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleincremento1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleincremento"


    // $ANTLR start "ruleincremento"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:545:1: ruleincremento : ( ( rule__Incremento__Group__0 ) ) ;
    public final void ruleincremento() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:549:2: ( ( ( rule__Incremento__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( rule__Incremento__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( rule__Incremento__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( rule__Incremento__Group__0 )
            {
             before(grammarAccess.getIncrementoAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( rule__Incremento__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:2: rule__Incremento__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__Group__0_in_ruleincremento1114);
            rule__Incremento__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncrementoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleincremento"


    // $ANTLR start "entryRuleTipoVariable"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:564:1: entryRuleTipoVariable : ruleTipoVariable EOF ;
    public final void entryRuleTipoVariable() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: ( ruleTipoVariable EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: ruleTipoVariable EOF
            {
             before(grammarAccess.getTipoVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable1141);
            ruleTipoVariable();

            state._fsp--;

             after(grammarAccess.getTipoVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoVariable1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTipoVariable"


    // $ANTLR start "ruleTipoVariable"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: ruleTipoVariable : ( ( rule__TipoVariable__Alternatives ) ) ;
    public final void ruleTipoVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:577:2: ( ( ( rule__TipoVariable__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( ( rule__TipoVariable__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( ( rule__TipoVariable__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( rule__TipoVariable__Alternatives )
            {
             before(grammarAccess.getTipoVariableAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( rule__TipoVariable__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:2: rule__TipoVariable__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__TipoVariable__Alternatives_in_ruleTipoVariable1174);
            rule__TipoVariable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoVariableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoVariable"


    // $ANTLR start "entryRuleVariable"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:593:1: ( ruleVariable EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable1201);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( ( rule__Variable__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( rule__Variable__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:2: rule__Variable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0_in_ruleVariable1234);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVariableID"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:620:1: entryRuleVariableID : ruleVariableID EOF ;
    public final void entryRuleVariableID() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:621:1: ( ruleVariableID EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: ruleVariableID EOF
            {
             before(grammarAccess.getVariableIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_entryRuleVariableID1261);
            ruleVariableID();

            state._fsp--;

             after(grammarAccess.getVariableIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableID1268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableID"


    // $ANTLR start "ruleVariableID"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:629:1: ruleVariableID : ( ( rule__VariableID__Group__0 ) ) ;
    public final void ruleVariableID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:633:2: ( ( ( rule__VariableID__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: ( ( rule__VariableID__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: ( ( rule__VariableID__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( rule__VariableID__Group__0 )
            {
             before(grammarAccess.getVariableIDAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( rule__VariableID__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:2: rule__VariableID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__0_in_ruleVariableID1294);
            rule__VariableID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableID"


    // $ANTLR start "entryRuleConstCadena"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: entryRuleConstCadena : ruleConstCadena EOF ;
    public final void entryRuleConstCadena() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: ( ruleConstCadena EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: ruleConstCadena EOF
            {
             before(grammarAccess.getConstCadenaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_entryRuleConstCadena1321);
            ruleConstCadena();

            state._fsp--;

             after(grammarAccess.getConstCadenaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstCadena1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstCadena"


    // $ANTLR start "ruleConstCadena"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:657:1: ruleConstCadena : ( ( rule__ConstCadena__ContenidoAssignment ) ) ;
    public final void ruleConstCadena() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:661:2: ( ( ( rule__ConstCadena__ContenidoAssignment ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:662:1: ( ( rule__ConstCadena__ContenidoAssignment ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:662:1: ( ( rule__ConstCadena__ContenidoAssignment ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: ( rule__ConstCadena__ContenidoAssignment )
            {
             before(grammarAccess.getConstCadenaAccess().getContenidoAssignment()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( rule__ConstCadena__ContenidoAssignment )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:2: rule__ConstCadena__ContenidoAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstCadena__ContenidoAssignment_in_ruleConstCadena1354);
            rule__ConstCadena__ContenidoAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConstCadenaAccess().getContenidoAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstCadena"


    // $ANTLR start "entryRuleNumeroEntero"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:676:1: entryRuleNumeroEntero : ruleNumeroEntero EOF ;
    public final void entryRuleNumeroEntero() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:677:1: ( ruleNumeroEntero EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: ruleNumeroEntero EOF
            {
             before(grammarAccess.getNumeroEnteroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_entryRuleNumeroEntero1381);
            ruleNumeroEntero();

            state._fsp--;

             after(grammarAccess.getNumeroEnteroRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumeroEntero1388); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumeroEntero"


    // $ANTLR start "ruleNumeroEntero"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:685:1: ruleNumeroEntero : ( ( rule__NumeroEntero__ValorAssignment ) ) ;
    public final void ruleNumeroEntero() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:689:2: ( ( ( rule__NumeroEntero__ValorAssignment ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ( ( rule__NumeroEntero__ValorAssignment ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ( ( rule__NumeroEntero__ValorAssignment ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( rule__NumeroEntero__ValorAssignment )
            {
             before(grammarAccess.getNumeroEnteroAccess().getValorAssignment()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ( rule__NumeroEntero__ValorAssignment )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:2: rule__NumeroEntero__ValorAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumeroEntero__ValorAssignment_in_ruleNumeroEntero1414);
            rule__NumeroEntero__ValorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumeroEnteroAccess().getValorAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumeroEntero"


    // $ANTLR start "entryRuleNumeroDecimal"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: entryRuleNumeroDecimal : ruleNumeroDecimal EOF ;
    public final void entryRuleNumeroDecimal() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:705:1: ( ruleNumeroDecimal EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ruleNumeroDecimal EOF
            {
             before(grammarAccess.getNumeroDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_entryRuleNumeroDecimal1441);
            ruleNumeroDecimal();

            state._fsp--;

             after(grammarAccess.getNumeroDecimalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumeroDecimal1448); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumeroDecimal"


    // $ANTLR start "ruleNumeroDecimal"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ruleNumeroDecimal : ( ( rule__NumeroDecimal__ValorAssignment ) ) ;
    public final void ruleNumeroDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:717:2: ( ( ( rule__NumeroDecimal__ValorAssignment ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:718:1: ( ( rule__NumeroDecimal__ValorAssignment ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:718:1: ( ( rule__NumeroDecimal__ValorAssignment ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( rule__NumeroDecimal__ValorAssignment )
            {
             before(grammarAccess.getNumeroDecimalAccess().getValorAssignment()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( rule__NumeroDecimal__ValorAssignment )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:2: rule__NumeroDecimal__ValorAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumeroDecimal__ValorAssignment_in_ruleNumeroDecimal1474);
            rule__NumeroDecimal__ValorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumeroDecimalAccess().getValorAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumeroDecimal"


    // $ANTLR start "entryRuleValorBooleano"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: entryRuleValorBooleano : ruleValorBooleano EOF ;
    public final void entryRuleValorBooleano() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: ( ruleValorBooleano EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: ruleValorBooleano EOF
            {
             before(grammarAccess.getValorBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_entryRuleValorBooleano1501);
            ruleValorBooleano();

            state._fsp--;

             after(grammarAccess.getValorBooleanoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValorBooleano1508); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValorBooleano"


    // $ANTLR start "ruleValorBooleano"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: ruleValorBooleano : ( ( rule__ValorBooleano__ValorAssignment ) ) ;
    public final void ruleValorBooleano() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:745:2: ( ( ( rule__ValorBooleano__ValorAssignment ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:746:1: ( ( rule__ValorBooleano__ValorAssignment ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:746:1: ( ( rule__ValorBooleano__ValorAssignment ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: ( rule__ValorBooleano__ValorAssignment )
            {
             before(grammarAccess.getValorBooleanoAccess().getValorAssignment()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: ( rule__ValorBooleano__ValorAssignment )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:748:2: rule__ValorBooleano__ValorAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValorBooleano__ValorAssignment_in_ruleValorBooleano1534);
            rule__ValorBooleano__ValorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getValorBooleanoAccess().getValorAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValorBooleano"


    // $ANTLR start "entryRuleEInt"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:760:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:761:1: ( ruleEInt EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1561);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1568); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:773:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: ( ( rule__EInt__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:775:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: ( rule__EInt__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:776:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt1594);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEFloat"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:788:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: ( ruleEFloat EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat1621);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat1628); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:801:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:802:1: ( ( rule__EFloat__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:802:1: ( ( rule__EFloat__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:804:1: ( rule__EFloat__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:804:2: rule__EFloat__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0_in_ruleEFloat1654);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRulebooleano"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:816:1: entryRulebooleano : rulebooleano EOF ;
    public final void entryRulebooleano() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:817:1: ( rulebooleano EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:818:1: rulebooleano EOF
            {
             before(grammarAccess.getBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleano_in_entryRulebooleano1681);
            rulebooleano();

            state._fsp--;

             after(grammarAccess.getBooleanoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulebooleano1688); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebooleano"


    // $ANTLR start "rulebooleano"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: rulebooleano : ( ( rule__Booleano__Alternatives ) ) ;
    public final void rulebooleano() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:829:2: ( ( ( rule__Booleano__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( ( rule__Booleano__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( ( rule__Booleano__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( rule__Booleano__Alternatives )
            {
             before(grammarAccess.getBooleanoAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: ( rule__Booleano__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:2: rule__Booleano__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Booleano__Alternatives_in_rulebooleano1714);
            rule__Booleano__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebooleano"


    // $ANTLR start "entryRuleoperacion"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:844:1: entryRuleoperacion : ruleoperacion EOF ;
    public final void entryRuleoperacion() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:845:1: ( ruleoperacion EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:846:1: ruleoperacion EOF
            {
             before(grammarAccess.getOperacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_entryRuleoperacion1741);
            ruleoperacion();

            state._fsp--;

             after(grammarAccess.getOperacionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperacion1748); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleoperacion"


    // $ANTLR start "ruleoperacion"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:853:1: ruleoperacion : ( ( rule__Operacion__Group__0 ) ) ;
    public final void ruleoperacion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:857:2: ( ( ( rule__Operacion__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( ( rule__Operacion__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( ( rule__Operacion__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ( rule__Operacion__Group__0 )
            {
             before(grammarAccess.getOperacionAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: ( rule__Operacion__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:860:2: rule__Operacion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__0_in_ruleoperacion1774);
            rule__Operacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleoperacion"


    // $ANTLR start "entryRulesigno"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:872:1: entryRulesigno : rulesigno EOF ;
    public final void entryRulesigno() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:873:1: ( rulesigno EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:874:1: rulesigno EOF
            {
             before(grammarAccess.getSignoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesigno_in_entryRulesigno1801);
            rulesigno();

            state._fsp--;

             after(grammarAccess.getSignoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesigno1808); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesigno"


    // $ANTLR start "rulesigno"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: rulesigno : ( ( rule__Signo__Alternatives ) ) ;
    public final void rulesigno() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:885:2: ( ( ( rule__Signo__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: ( ( rule__Signo__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: ( ( rule__Signo__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: ( rule__Signo__Alternatives )
            {
             before(grammarAccess.getSignoAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: ( rule__Signo__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:2: rule__Signo__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signo__Alternatives_in_rulesigno1834);
            rule__Signo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSignoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesigno"


    // $ANTLR start "entryRuleoperando_izq"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: entryRuleoperando_izq : ruleoperando_izq EOF ;
    public final void entryRuleoperando_izq() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:901:1: ( ruleoperando_izq EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: ruleoperando_izq EOF
            {
             before(grammarAccess.getOperando_izqRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_izq_in_entryRuleoperando_izq1861);
            ruleoperando_izq();

            state._fsp--;

             after(grammarAccess.getOperando_izqRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperando_izq1868); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleoperando_izq"


    // $ANTLR start "ruleoperando_izq"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: ruleoperando_izq : ( ( rule__Operando_izq__Oper_izqAssignment ) ) ;
    public final void ruleoperando_izq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:913:2: ( ( ( rule__Operando_izq__Oper_izqAssignment ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: ( ( rule__Operando_izq__Oper_izqAssignment ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: ( ( rule__Operando_izq__Oper_izqAssignment ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:915:1: ( rule__Operando_izq__Oper_izqAssignment )
            {
             before(grammarAccess.getOperando_izqAccess().getOper_izqAssignment()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: ( rule__Operando_izq__Oper_izqAssignment )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:2: rule__Operando_izq__Oper_izqAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operando_izq__Oper_izqAssignment_in_ruleoperando_izq1894);
            rule__Operando_izq__Oper_izqAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOperando_izqAccess().getOper_izqAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleoperando_izq"


    // $ANTLR start "entryRuleoperando_der"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:928:1: entryRuleoperando_der : ruleoperando_der EOF ;
    public final void entryRuleoperando_der() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:929:1: ( ruleoperando_der EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:930:1: ruleoperando_der EOF
            {
             before(grammarAccess.getOperando_derRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_der_in_entryRuleoperando_der1921);
            ruleoperando_der();

            state._fsp--;

             after(grammarAccess.getOperando_derRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperando_der1928); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleoperando_der"


    // $ANTLR start "ruleoperando_der"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:937:1: ruleoperando_der : ( ( rule__Operando_der__Oper_derAssignment ) ) ;
    public final void ruleoperando_der() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:941:2: ( ( ( rule__Operando_der__Oper_derAssignment ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:942:1: ( ( rule__Operando_der__Oper_derAssignment ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:942:1: ( ( rule__Operando_der__Oper_derAssignment ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:943:1: ( rule__Operando_der__Oper_derAssignment )
            {
             before(grammarAccess.getOperando_derAccess().getOper_derAssignment()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:944:1: ( rule__Operando_der__Oper_derAssignment )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:944:2: rule__Operando_der__Oper_derAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operando_der__Oper_derAssignment_in_ruleoperando_der1954);
            rule__Operando_der__Oper_derAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOperando_derAccess().getOper_derAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleoperando_der"


    // $ANTLR start "entryRuleSino"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:956:1: entryRuleSino : ruleSino EOF ;
    public final void entryRuleSino() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:957:1: ( ruleSino EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:958:1: ruleSino EOF
            {
             before(grammarAccess.getSinoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSino_in_entryRuleSino1981);
            ruleSino();

            state._fsp--;

             after(grammarAccess.getSinoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSino1988); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSino"


    // $ANTLR start "ruleSino"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:965:1: ruleSino : ( ( rule__Sino__Group__0 ) ) ;
    public final void ruleSino() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:969:2: ( ( ( rule__Sino__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:970:1: ( ( rule__Sino__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:970:1: ( ( rule__Sino__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:971:1: ( rule__Sino__Group__0 )
            {
             before(grammarAccess.getSinoAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:972:1: ( rule__Sino__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:972:2: rule__Sino__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__0_in_ruleSino2014);
            rule__Sino__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSinoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSino"


    // $ANTLR start "entryRuleinc"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:984:1: entryRuleinc : ruleinc EOF ;
    public final void entryRuleinc() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:985:1: ( ruleinc EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:986:1: ruleinc EOF
            {
             before(grammarAccess.getIncRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_entryRuleinc2041);
            ruleinc();

            state._fsp--;

             after(grammarAccess.getIncRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleinc2048); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleinc"


    // $ANTLR start "ruleinc"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:993:1: ruleinc : ( ( rule__Inc__Alternatives ) ) ;
    public final void ruleinc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:997:2: ( ( ( rule__Inc__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:998:1: ( ( rule__Inc__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:998:1: ( ( rule__Inc__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:999:1: ( rule__Inc__Alternatives )
            {
             before(grammarAccess.getIncAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:1: ( rule__Inc__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:2: rule__Inc__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inc__Alternatives_in_ruleinc2074);
            rule__Inc__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIncAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleinc"


    // $ANTLR start "entryRuleParametroFuncion"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:1: entryRuleParametroFuncion : ruleParametroFuncion EOF ;
    public final void entryRuleParametroFuncion() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: ( ruleParametroFuncion EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:1: ruleParametroFuncion EOF
            {
             before(grammarAccess.getParametroFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion2101);
            ruleParametroFuncion();

            state._fsp--;

             after(grammarAccess.getParametroFuncionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametroFuncion2108); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParametroFuncion"


    // $ANTLR start "ruleParametroFuncion"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1021:1: ruleParametroFuncion : ( ( rule__ParametroFuncion__Group__0 ) ) ;
    public final void ruleParametroFuncion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:2: ( ( ( rule__ParametroFuncion__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: ( ( rule__ParametroFuncion__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: ( ( rule__ParametroFuncion__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1027:1: ( rule__ParametroFuncion__Group__0 )
            {
             before(grammarAccess.getParametroFuncionAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:1: ( rule__ParametroFuncion__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:2: rule__ParametroFuncion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__0_in_ruleParametroFuncion2134);
            rule__ParametroFuncion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParametroFuncionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParametroFuncion"


    // $ANTLR start "entryRuleFuncion"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:1: entryRuleFuncion : ruleFuncion EOF ;
    public final void entryRuleFuncion() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:1: ( ruleFuncion EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: ruleFuncion EOF
            {
             before(grammarAccess.getFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_entryRuleFuncion2161);
            ruleFuncion();

            state._fsp--;

             after(grammarAccess.getFuncionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncion2168); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFuncion"


    // $ANTLR start "ruleFuncion"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1049:1: ruleFuncion : ( ( rule__Funcion__Group__0 ) ) ;
    public final void ruleFuncion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:2: ( ( ( rule__Funcion__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: ( ( rule__Funcion__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: ( ( rule__Funcion__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: ( rule__Funcion__Group__0 )
            {
             before(grammarAccess.getFuncionAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:1: ( rule__Funcion__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:2: rule__Funcion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__0_in_ruleFuncion2194);
            rule__Funcion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFuncion"


    // $ANTLR start "entryRuleProcedimiento"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: entryRuleProcedimiento : ruleProcedimiento EOF ;
    public final void entryRuleProcedimiento() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:1: ( ruleProcedimiento EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: ruleProcedimiento EOF
            {
             before(grammarAccess.getProcedimientoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento2221);
            ruleProcedimiento();

            state._fsp--;

             after(grammarAccess.getProcedimientoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcedimiento2228); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcedimiento"


    // $ANTLR start "ruleProcedimiento"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1077:1: ruleProcedimiento : ( ( rule__Procedimiento__Group__0 ) ) ;
    public final void ruleProcedimiento() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:2: ( ( ( rule__Procedimiento__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: ( ( rule__Procedimiento__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: ( ( rule__Procedimiento__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:1: ( rule__Procedimiento__Group__0 )
            {
             before(grammarAccess.getProcedimientoAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:1: ( rule__Procedimiento__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:2: rule__Procedimiento__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__0_in_ruleProcedimiento2254);
            rule__Procedimiento__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedimientoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcedimiento"


    // $ANTLR start "entryRuleTipoPaso"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:1: entryRuleTipoPaso : ruleTipoPaso EOF ;
    public final void entryRuleTipoPaso() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:1: ( ruleTipoPaso EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:1: ruleTipoPaso EOF
            {
             before(grammarAccess.getTipoPasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso2281);
            ruleTipoPaso();

            state._fsp--;

             after(grammarAccess.getTipoPasoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoPaso2288); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTipoPaso"


    // $ANTLR start "ruleTipoPaso"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: ruleTipoPaso : ( ( rule__TipoPaso__Alternatives ) ) ;
    public final void ruleTipoPaso() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:2: ( ( ( rule__TipoPaso__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:1: ( ( rule__TipoPaso__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:1: ( ( rule__TipoPaso__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1111:1: ( rule__TipoPaso__Alternatives )
            {
             before(grammarAccess.getTipoPasoAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: ( rule__TipoPaso__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:2: rule__TipoPaso__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__TipoPaso__Alternatives_in_ruleTipoPaso2314);
            rule__TipoPaso__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoPasoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoPaso"


    // $ANTLR start "rule__Subproceso__Alternatives"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1124:1: rule__Subproceso__Alternatives : ( ( ruleFuncion ) | ( ruleProcedimiento ) );
    public final void rule__Subproceso__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: ( ( ruleFuncion ) | ( ruleProcedimiento ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=14 && LA1_0<=18)) ) {
                alt1=1;
            }
            else if ( (LA1_0==62) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:1: ( ruleFuncion )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:1: ( ruleFuncion )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1130:1: ruleFuncion
                    {
                     before(grammarAccess.getSubprocesoAccess().getFuncionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_rule__Subproceso__Alternatives2350);
                    ruleFuncion();

                    state._fsp--;

                     after(grammarAccess.getSubprocesoAccess().getFuncionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1135:6: ( ruleProcedimiento )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1135:6: ( ruleProcedimiento )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1136:1: ruleProcedimiento
                    {
                     before(grammarAccess.getSubprocesoAccess().getProcedimientoParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_rule__Subproceso__Alternatives2367);
                    ruleProcedimiento();

                    state._fsp--;

                     after(grammarAccess.getSubprocesoAccess().getProcedimientoParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subproceso__Alternatives"


    // $ANTLR start "rule__Sentencias__Alternatives"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:1: rule__Sentencias__Alternatives : ( ( ruleDeclaracionVariable ) | ( ruleLlamadaFuncion ) | ( ruleAsignacion ) | ( ruleEscribir ) | ( ruleLeer ) | ( ruleSi ) | ( rulemientras ) | ( rulerepetir ) | ( ruledesde ) | ( ruleincremento ) );
    public final void rule__Sentencias__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:1: ( ( ruleDeclaracionVariable ) | ( ruleLlamadaFuncion ) | ( ruleAsignacion ) | ( ruleEscribir ) | ( ruleLeer ) | ( ruleSi ) | ( rulemientras ) | ( rulerepetir ) | ( ruledesde ) | ( ruleincremento ) )
            int alt2=10;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:1: ( ruleDeclaracionVariable )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:1: ( ruleDeclaracionVariable )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: ruleDeclaracionVariable
                    {
                     before(grammarAccess.getSentenciasAccess().getDeclaracionVariableParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Sentencias__Alternatives2399);
                    ruleDeclaracionVariable();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getDeclaracionVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1157:6: ( ruleLlamadaFuncion )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1157:6: ( ruleLlamadaFuncion )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:1: ruleLlamadaFuncion
                    {
                     before(grammarAccess.getSentenciasAccess().getLlamadaFuncionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_rule__Sentencias__Alternatives2416);
                    ruleLlamadaFuncion();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getLlamadaFuncionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:6: ( ruleAsignacion )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:6: ( ruleAsignacion )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1164:1: ruleAsignacion
                    {
                     before(grammarAccess.getSentenciasAccess().getAsignacionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_rule__Sentencias__Alternatives2433);
                    ruleAsignacion();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getAsignacionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:6: ( ruleEscribir )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:6: ( ruleEscribir )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: ruleEscribir
                    {
                     before(grammarAccess.getSentenciasAccess().getEscribirParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_rule__Sentencias__Alternatives2450);
                    ruleEscribir();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getEscribirParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:6: ( ruleLeer )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:6: ( ruleLeer )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:1: ruleLeer
                    {
                     before(grammarAccess.getSentenciasAccess().getLeerParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLeer_in_rule__Sentencias__Alternatives2467);
                    ruleLeer();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getLeerParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:6: ( ruleSi )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:6: ( ruleSi )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:1: ruleSi
                    {
                     before(grammarAccess.getSentenciasAccess().getSiParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSi_in_rule__Sentencias__Alternatives2484);
                    ruleSi();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getSiParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:6: ( rulemientras )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:6: ( rulemientras )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:1: rulemientras
                    {
                     before(grammarAccess.getSentenciasAccess().getMientrasParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_rulemientras_in_rule__Sentencias__Alternatives2501);
                    rulemientras();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getMientrasParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1193:6: ( rulerepetir )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1193:6: ( rulerepetir )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:1: rulerepetir
                    {
                     before(grammarAccess.getSentenciasAccess().getRepetirParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_rulerepetir_in_rule__Sentencias__Alternatives2518);
                    rulerepetir();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getRepetirParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:6: ( ruledesde )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:6: ( ruledesde )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: ruledesde
                    {
                     before(grammarAccess.getSentenciasAccess().getDesdeParserRuleCall_8()); 
                    pushFollow(FollowSets000.FOLLOW_ruledesde_in_rule__Sentencias__Alternatives2535);
                    ruledesde();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getDesdeParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:6: ( ruleincremento )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:6: ( ruleincremento )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:1: ruleincremento
                    {
                     before(grammarAccess.getSentenciasAccess().getIncrementoParserRuleCall_9()); 
                    pushFollow(FollowSets000.FOLLOW_ruleincremento_in_rule__Sentencias__Alternatives2552);
                    ruleincremento();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getIncrementoParserRuleCall_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentencias__Alternatives"


    // $ANTLR start "rule__Operador__Alternatives"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1216:1: rule__Operador__Alternatives : ( ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleCaracter ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleValorBooleano ) );
    public final void rule__Operador__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1220:1: ( ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleCaracter ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleValorBooleano ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_CAD:
                {
                alt3=2;
                }
                break;
            case RULE_CAR:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==RULE_INT) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==57) ) {
                        alt3=5;
                    }
                    else if ( (LA3_5==EOF||LA3_5==40||LA3_5==42) ) {
                        alt3=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_4==57) ) {
                    alt3=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA3_5 = input.LA(2);

                if ( (LA3_5==57) ) {
                    alt3=5;
                }
                else if ( (LA3_5==EOF||LA3_5==40||LA3_5==42) ) {
                    alt3=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            case 57:
                {
                alt3=5;
                }
                break;
            case 21:
            case 22:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1221:1: ( ruleVariableID )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1221:1: ( ruleVariableID )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1222:1: ruleVariableID
                    {
                     before(grammarAccess.getOperadorAccess().getVariableIDParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__Operador__Alternatives2584);
                    ruleVariableID();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getVariableIDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1227:6: ( ruleConstCadena )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1227:6: ( ruleConstCadena )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:1: ruleConstCadena
                    {
                     before(grammarAccess.getOperadorAccess().getConstCadenaParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_rule__Operador__Alternatives2601);
                    ruleConstCadena();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getConstCadenaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:6: ( ruleCaracter )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:6: ( ruleCaracter )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:1: ruleCaracter
                    {
                     before(grammarAccess.getOperadorAccess().getCaracterParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_rule__Operador__Alternatives2618);
                    ruleCaracter();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getCaracterParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1239:6: ( ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1239:6: ( ruleNumeroEntero )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1240:1: ruleNumeroEntero
                    {
                     before(grammarAccess.getOperadorAccess().getNumeroEnteroParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_rule__Operador__Alternatives2635);
                    ruleNumeroEntero();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getNumeroEnteroParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:6: ( ruleNumeroDecimal )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:6: ( ruleNumeroDecimal )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: ruleNumeroDecimal
                    {
                     before(grammarAccess.getOperadorAccess().getNumeroDecimalParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_rule__Operador__Alternatives2652);
                    ruleNumeroDecimal();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getNumeroDecimalParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1251:6: ( ruleValorBooleano )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1251:6: ( ruleValorBooleano )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:1: ruleValorBooleano
                    {
                     before(grammarAccess.getOperadorAccess().getValorBooleanoParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_rule__Operador__Alternatives2669);
                    ruleValorBooleano();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getValorBooleanoParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operador__Alternatives"


    // $ANTLR start "rule__Valor__Alternatives"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1262:1: rule__Valor__Alternatives : ( ( ruleLlamadaFuncion ) | ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleoperacion ) | ( ruleValorBooleano ) | ( ruleCaracter ) );
    public final void rule__Valor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1266:1: ( ( ruleLlamadaFuncion ) | ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleoperacion ) | ( ruleValorBooleano ) | ( ruleCaracter ) )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:1: ( ruleLlamadaFuncion )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:1: ( ruleLlamadaFuncion )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1268:1: ruleLlamadaFuncion
                    {
                     before(grammarAccess.getValorAccess().getLlamadaFuncionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_rule__Valor__Alternatives2701);
                    ruleLlamadaFuncion();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getLlamadaFuncionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:6: ( ruleVariableID )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:6: ( ruleVariableID )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:1: ruleVariableID
                    {
                     before(grammarAccess.getValorAccess().getVariableIDParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__Valor__Alternatives2718);
                    ruleVariableID();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getVariableIDParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1279:6: ( ruleConstCadena )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1279:6: ( ruleConstCadena )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:1: ruleConstCadena
                    {
                     before(grammarAccess.getValorAccess().getConstCadenaParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_rule__Valor__Alternatives2735);
                    ruleConstCadena();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getConstCadenaParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:6: ( ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:6: ( ruleNumeroEntero )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: ruleNumeroEntero
                    {
                     before(grammarAccess.getValorAccess().getNumeroEnteroParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_rule__Valor__Alternatives2752);
                    ruleNumeroEntero();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getNumeroEnteroParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1291:6: ( ruleNumeroDecimal )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1291:6: ( ruleNumeroDecimal )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: ruleNumeroDecimal
                    {
                     before(grammarAccess.getValorAccess().getNumeroDecimalParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_rule__Valor__Alternatives2769);
                    ruleNumeroDecimal();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getNumeroDecimalParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:6: ( ruleoperacion )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:6: ( ruleoperacion )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: ruleoperacion
                    {
                     before(grammarAccess.getValorAccess().getOperacionParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rule__Valor__Alternatives2786);
                    ruleoperacion();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getOperacionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:6: ( ruleValorBooleano )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:6: ( ruleValorBooleano )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:1: ruleValorBooleano
                    {
                     before(grammarAccess.getValorAccess().getValorBooleanoParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_rule__Valor__Alternatives2803);
                    ruleValorBooleano();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getValorBooleanoParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:6: ( ruleCaracter )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:6: ( ruleCaracter )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1310:1: ruleCaracter
                    {
                     before(grammarAccess.getValorAccess().getCaracterParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_rule__Valor__Alternatives2820);
                    ruleCaracter();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getCaracterParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Valor__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1324:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1325:1: ( RULE_STRING )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1325:1: ( RULE_STRING )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1326:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives2852); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:6: ( RULE_ID )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:6: ( RULE_ID )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1332:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives2869); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TipoVariable__Alternatives"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1342:1: rule__TipoVariable__Alternatives : ( ( 'entero' ) | ( 'caracter' ) | ( 'real' ) | ( 'logico' ) | ( 'cadena' ) );
    public final void rule__TipoVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:1: ( ( 'entero' ) | ( 'caracter' ) | ( 'real' ) | ( 'logico' ) | ( 'cadena' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=4;
                }
                break;
            case 18:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1347:1: ( 'entero' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1347:1: ( 'entero' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1348:1: 'entero'
                    {
                     before(grammarAccess.getTipoVariableAccess().getEnteroKeyword_0()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__TipoVariable__Alternatives2902); 
                     after(grammarAccess.getTipoVariableAccess().getEnteroKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1355:6: ( 'caracter' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1355:6: ( 'caracter' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1356:1: 'caracter'
                    {
                     before(grammarAccess.getTipoVariableAccess().getCaracterKeyword_1()); 
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__TipoVariable__Alternatives2922); 
                     after(grammarAccess.getTipoVariableAccess().getCaracterKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:6: ( 'real' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:6: ( 'real' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: 'real'
                    {
                     before(grammarAccess.getTipoVariableAccess().getRealKeyword_2()); 
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__TipoVariable__Alternatives2942); 
                     after(grammarAccess.getTipoVariableAccess().getRealKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:6: ( 'logico' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:6: ( 'logico' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1372:1: 'logico'
                    {
                     before(grammarAccess.getTipoVariableAccess().getLogicoKeyword_3()); 
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__TipoVariable__Alternatives2962); 
                     after(grammarAccess.getTipoVariableAccess().getLogicoKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1379:6: ( 'cadena' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1379:6: ( 'cadena' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1380:1: 'cadena'
                    {
                     before(grammarAccess.getTipoVariableAccess().getCadenaKeyword_4()); 
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__TipoVariable__Alternatives2982); 
                     after(grammarAccess.getTipoVariableAccess().getCadenaKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoVariable__Alternatives"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1396:1: ( ( 'E' ) | ( 'e' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1397:1: ( 'E' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1397:1: ( 'E' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1398:1: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__EFloat__Alternatives_4_03017); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1405:6: ( 'e' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1405:6: ( 'e' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:1: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__EFloat__Alternatives_4_03037); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__Booleano__Alternatives"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1418:1: rule__Booleano__Alternatives : ( ( 'verdadero' ) | ( 'falso' ) );
    public final void rule__Booleano__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1422:1: ( ( 'verdadero' ) | ( 'falso' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( 'verdadero' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( 'verdadero' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: 'verdadero'
                    {
                     before(grammarAccess.getBooleanoAccess().getVerdaderoKeyword_0()); 
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__Booleano__Alternatives3072); 
                     after(grammarAccess.getBooleanoAccess().getVerdaderoKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:6: ( 'falso' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:6: ( 'falso' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1432:1: 'falso'
                    {
                     before(grammarAccess.getBooleanoAccess().getFalsoKeyword_1()); 
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__Booleano__Alternatives3092); 
                     after(grammarAccess.getBooleanoAccess().getFalsoKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Booleano__Alternatives"


    // $ANTLR start "rule__Signo__Alternatives"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1444:1: rule__Signo__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '<' ) | ( '>' ) | ( '>=' ) | ( '<=' ) | ( 'y' ) | ( 'o' ) | ( '==' ) | ( '!=' ) );
    public final void rule__Signo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1448:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '<' ) | ( '>' ) | ( '>=' ) | ( '<=' ) | ( 'y' ) | ( 'o' ) | ( '==' ) | ( '!=' ) )
            int alt9=12;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 25:
                {
                alt9=3;
                }
                break;
            case 26:
                {
                alt9=4;
                }
                break;
            case 27:
                {
                alt9=5;
                }
                break;
            case 28:
                {
                alt9=6;
                }
                break;
            case 29:
                {
                alt9=7;
                }
                break;
            case 30:
                {
                alt9=8;
                }
                break;
            case 31:
                {
                alt9=9;
                }
                break;
            case 32:
                {
                alt9=10;
                }
                break;
            case 33:
                {
                alt9=11;
                }
                break;
            case 34:
                {
                alt9=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1449:1: ( '+' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1449:1: ( '+' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: '+'
                    {
                     before(grammarAccess.getSignoAccess().getPlusSignKeyword_0()); 
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__Signo__Alternatives3127); 
                     after(grammarAccess.getSignoAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:6: ( '-' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:6: ( '-' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:1: '-'
                    {
                     before(grammarAccess.getSignoAccess().getHyphenMinusKeyword_1()); 
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__Signo__Alternatives3147); 
                     after(grammarAccess.getSignoAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1465:6: ( '*' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1465:6: ( '*' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1466:1: '*'
                    {
                     before(grammarAccess.getSignoAccess().getAsteriskKeyword_2()); 
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__Signo__Alternatives3167); 
                     after(grammarAccess.getSignoAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:6: ( '/' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:6: ( '/' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1474:1: '/'
                    {
                     before(grammarAccess.getSignoAccess().getSolidusKeyword_3()); 
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__Signo__Alternatives3187); 
                     after(grammarAccess.getSignoAccess().getSolidusKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1481:6: ( '<' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1481:6: ( '<' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1482:1: '<'
                    {
                     before(grammarAccess.getSignoAccess().getLessThanSignKeyword_4()); 
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__Signo__Alternatives3207); 
                     after(grammarAccess.getSignoAccess().getLessThanSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1489:6: ( '>' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1489:6: ( '>' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1490:1: '>'
                    {
                     before(grammarAccess.getSignoAccess().getGreaterThanSignKeyword_5()); 
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__Signo__Alternatives3227); 
                     after(grammarAccess.getSignoAccess().getGreaterThanSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1497:6: ( '>=' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1497:6: ( '>=' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1498:1: '>='
                    {
                     before(grammarAccess.getSignoAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__Signo__Alternatives3247); 
                     after(grammarAccess.getSignoAccess().getGreaterThanSignEqualsSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:6: ( '<=' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:6: ( '<=' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1506:1: '<='
                    {
                     before(grammarAccess.getSignoAccess().getLessThanSignEqualsSignKeyword_7()); 
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__Signo__Alternatives3267); 
                     after(grammarAccess.getSignoAccess().getLessThanSignEqualsSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1513:6: ( 'y' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1513:6: ( 'y' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1514:1: 'y'
                    {
                     before(grammarAccess.getSignoAccess().getYKeyword_8()); 
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__Signo__Alternatives3287); 
                     after(grammarAccess.getSignoAccess().getYKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1521:6: ( 'o' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1521:6: ( 'o' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1522:1: 'o'
                    {
                     before(grammarAccess.getSignoAccess().getOKeyword_9()); 
                    match(input,32,FollowSets000.FOLLOW_32_in_rule__Signo__Alternatives3307); 
                     after(grammarAccess.getSignoAccess().getOKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1529:6: ( '==' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1529:6: ( '==' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1530:1: '=='
                    {
                     before(grammarAccess.getSignoAccess().getEqualsSignEqualsSignKeyword_10()); 
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__Signo__Alternatives3327); 
                     after(grammarAccess.getSignoAccess().getEqualsSignEqualsSignKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1537:6: ( '!=' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1537:6: ( '!=' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1538:1: '!='
                    {
                     before(grammarAccess.getSignoAccess().getExclamationMarkEqualsSignKeyword_11()); 
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__Signo__Alternatives3347); 
                     after(grammarAccess.getSignoAccess().getExclamationMarkEqualsSignKeyword_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signo__Alternatives"


    // $ANTLR start "rule__Inc__Alternatives"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1550:1: rule__Inc__Alternatives : ( ( '++' ) | ( '--' ) );
    public final void rule__Inc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1554:1: ( ( '++' ) | ( '--' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            else if ( (LA10_0==36) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:1: ( '++' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:1: ( '++' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: '++'
                    {
                     before(grammarAccess.getIncAccess().getPlusSignPlusSignKeyword_0()); 
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__Inc__Alternatives3382); 
                     after(grammarAccess.getIncAccess().getPlusSignPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:6: ( '--' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:6: ( '--' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1564:1: '--'
                    {
                     before(grammarAccess.getIncAccess().getHyphenMinusHyphenMinusKeyword_1()); 
                    match(input,36,FollowSets000.FOLLOW_36_in_rule__Inc__Alternatives3402); 
                     after(grammarAccess.getIncAccess().getHyphenMinusHyphenMinusKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inc__Alternatives"


    // $ANTLR start "rule__TipoPaso__Alternatives"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1576:1: rule__TipoPaso__Alternatives : ( ( 'E' ) | ( 'E/S' ) );
    public final void rule__TipoPaso__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1580:1: ( ( 'E' ) | ( 'E/S' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            else if ( (LA11_0==37) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1581:1: ( 'E' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1581:1: ( 'E' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1582:1: 'E'
                    {
                     before(grammarAccess.getTipoPasoAccess().getEKeyword_0()); 
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__TipoPaso__Alternatives3437); 
                     after(grammarAccess.getTipoPasoAccess().getEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1589:6: ( 'E/S' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1589:6: ( 'E/S' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1590:1: 'E/S'
                    {
                     before(grammarAccess.getTipoPasoAccess().getESKeyword_1()); 
                    match(input,37,FollowSets000.FOLLOW_37_in_rule__TipoPaso__Alternatives3457); 
                     after(grammarAccess.getTipoPasoAccess().getESKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoPaso__Alternatives"


    // $ANTLR start "rule__Codigo__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:1: rule__Codigo__Group__0 : rule__Codigo__Group__0__Impl rule__Codigo__Group__1 ;
    public final void rule__Codigo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1608:1: ( rule__Codigo__Group__0__Impl rule__Codigo__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1609:2: rule__Codigo__Group__0__Impl rule__Codigo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group__0__Impl_in_rule__Codigo__Group__03489);
            rule__Codigo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group__1_in_rule__Codigo__Group__03492);
            rule__Codigo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codigo__Group__0"


    // $ANTLR start "rule__Codigo__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:1: rule__Codigo__Group__0__Impl : ( ( rule__Codigo__Group_0__0 )? ) ;
    public final void rule__Codigo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1620:1: ( ( ( rule__Codigo__Group_0__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:1: ( ( rule__Codigo__Group_0__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:1: ( ( rule__Codigo__Group_0__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:1: ( rule__Codigo__Group_0__0 )?
            {
             before(grammarAccess.getCodigoAccess().getGroup_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:1: ( rule__Codigo__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=14 && LA12_0<=18)||LA12_0==62) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:2: rule__Codigo__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group_0__0_in_rule__Codigo__Group__0__Impl3519);
                    rule__Codigo__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCodigoAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codigo__Group__0__Impl"


    // $ANTLR start "rule__Codigo__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: rule__Codigo__Group__1 : rule__Codigo__Group__1__Impl ;
    public final void rule__Codigo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1637:1: ( rule__Codigo__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:2: rule__Codigo__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group__1__Impl_in_rule__Codigo__Group__13550);
            rule__Codigo__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codigo__Group__1"


    // $ANTLR start "rule__Codigo__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: rule__Codigo__Group__1__Impl : ( ( rule__Codigo__TieneAssignment_1 ) ) ;
    public final void rule__Codigo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1648:1: ( ( ( rule__Codigo__TieneAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:1: ( ( rule__Codigo__TieneAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:1: ( ( rule__Codigo__TieneAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:1: ( rule__Codigo__TieneAssignment_1 )
            {
             before(grammarAccess.getCodigoAccess().getTieneAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: ( rule__Codigo__TieneAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:2: rule__Codigo__TieneAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__TieneAssignment_1_in_rule__Codigo__Group__1__Impl3577);
            rule__Codigo__TieneAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCodigoAccess().getTieneAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codigo__Group__1__Impl"


    // $ANTLR start "rule__Codigo__Group_0__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:1: rule__Codigo__Group_0__0 : rule__Codigo__Group_0__0__Impl rule__Codigo__Group_0__1 ;
    public final void rule__Codigo__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1669:1: ( rule__Codigo__Group_0__0__Impl rule__Codigo__Group_0__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1670:2: rule__Codigo__Group_0__0__Impl rule__Codigo__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group_0__0__Impl_in_rule__Codigo__Group_0__03611);
            rule__Codigo__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group_0__1_in_rule__Codigo__Group_0__03614);
            rule__Codigo__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codigo__Group_0__0"


    // $ANTLR start "rule__Codigo__Group_0__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1677:1: rule__Codigo__Group_0__0__Impl : ( ( rule__Codigo__FuncionAssignment_0_0 ) ) ;
    public final void rule__Codigo__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1681:1: ( ( ( rule__Codigo__FuncionAssignment_0_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1682:1: ( ( rule__Codigo__FuncionAssignment_0_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1682:1: ( ( rule__Codigo__FuncionAssignment_0_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1683:1: ( rule__Codigo__FuncionAssignment_0_0 )
            {
             before(grammarAccess.getCodigoAccess().getFuncionAssignment_0_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:1: ( rule__Codigo__FuncionAssignment_0_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:2: rule__Codigo__FuncionAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__FuncionAssignment_0_0_in_rule__Codigo__Group_0__0__Impl3641);
            rule__Codigo__FuncionAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCodigoAccess().getFuncionAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codigo__Group_0__0__Impl"


    // $ANTLR start "rule__Codigo__Group_0__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1694:1: rule__Codigo__Group_0__1 : rule__Codigo__Group_0__1__Impl ;
    public final void rule__Codigo__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1698:1: ( rule__Codigo__Group_0__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1699:2: rule__Codigo__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group_0__1__Impl_in_rule__Codigo__Group_0__13671);
            rule__Codigo__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codigo__Group_0__1"


    // $ANTLR start "rule__Codigo__Group_0__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1705:1: rule__Codigo__Group_0__1__Impl : ( ( rule__Codigo__FuncionAssignment_0_1 )* ) ;
    public final void rule__Codigo__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1709:1: ( ( ( rule__Codigo__FuncionAssignment_0_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:1: ( ( rule__Codigo__FuncionAssignment_0_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:1: ( ( rule__Codigo__FuncionAssignment_0_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1711:1: ( rule__Codigo__FuncionAssignment_0_1 )*
            {
             before(grammarAccess.getCodigoAccess().getFuncionAssignment_0_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: ( rule__Codigo__FuncionAssignment_0_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=14 && LA13_0<=18)||LA13_0==62) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:2: rule__Codigo__FuncionAssignment_0_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Codigo__FuncionAssignment_0_1_in_rule__Codigo__Group_0__1__Impl3698);
            	    rule__Codigo__FuncionAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getCodigoAccess().getFuncionAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codigo__Group_0__1__Impl"


    // $ANTLR start "rule__Inicio__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1726:1: rule__Inicio__Group__0 : rule__Inicio__Group__0__Impl rule__Inicio__Group__1 ;
    public final void rule__Inicio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1730:1: ( rule__Inicio__Group__0__Impl rule__Inicio__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1731:2: rule__Inicio__Group__0__Impl rule__Inicio__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__0__Impl_in_rule__Inicio__Group__03733);
            rule__Inicio__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__1_in_rule__Inicio__Group__03736);
            rule__Inicio__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inicio__Group__0"


    // $ANTLR start "rule__Inicio__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: rule__Inicio__Group__0__Impl : ( () ) ;
    public final void rule__Inicio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:1: ( ( () ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1743:1: ( () )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1743:1: ( () )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1744:1: ()
            {
             before(grammarAccess.getInicioAccess().getInicioAction_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: ()
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1747:1: 
            {
            }

             after(grammarAccess.getInicioAccess().getInicioAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inicio__Group__0__Impl"


    // $ANTLR start "rule__Inicio__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1757:1: rule__Inicio__Group__1 : rule__Inicio__Group__1__Impl rule__Inicio__Group__2 ;
    public final void rule__Inicio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1761:1: ( rule__Inicio__Group__1__Impl rule__Inicio__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1762:2: rule__Inicio__Group__1__Impl rule__Inicio__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__1__Impl_in_rule__Inicio__Group__13794);
            rule__Inicio__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__2_in_rule__Inicio__Group__13797);
            rule__Inicio__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inicio__Group__1"


    // $ANTLR start "rule__Inicio__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:1: rule__Inicio__Group__1__Impl : ( 'inicio' ) ;
    public final void rule__Inicio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1773:1: ( ( 'inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:1: ( 'inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:1: ( 'inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1775:1: 'inicio'
            {
             before(grammarAccess.getInicioAccess().getInicioKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Inicio__Group__1__Impl3825); 
             after(grammarAccess.getInicioAccess().getInicioKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inicio__Group__1__Impl"


    // $ANTLR start "rule__Inicio__Group__2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:1: rule__Inicio__Group__2 : rule__Inicio__Group__2__Impl rule__Inicio__Group__3 ;
    public final void rule__Inicio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1792:1: ( rule__Inicio__Group__2__Impl rule__Inicio__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:2: rule__Inicio__Group__2__Impl rule__Inicio__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__2__Impl_in_rule__Inicio__Group__23856);
            rule__Inicio__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__3_in_rule__Inicio__Group__23859);
            rule__Inicio__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inicio__Group__2"


    // $ANTLR start "rule__Inicio__Group__2__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: rule__Inicio__Group__2__Impl : ( ( rule__Inicio__Group_2__0 )? ) ;
    public final void rule__Inicio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1804:1: ( ( ( rule__Inicio__Group_2__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:1: ( ( rule__Inicio__Group_2__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:1: ( ( rule__Inicio__Group_2__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1806:1: ( rule__Inicio__Group_2__0 )?
            {
             before(grammarAccess.getInicioAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1807:1: ( rule__Inicio__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)||(LA14_0>=14 && LA14_0<=18)||(LA14_0>=44 && LA14_0<=46)||LA14_0==49||LA14_0==52||LA14_0==54) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1807:2: rule__Inicio__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__0_in_rule__Inicio__Group__2__Impl3886);
                    rule__Inicio__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInicioAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inicio__Group__2__Impl"


    // $ANTLR start "rule__Inicio__Group__3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1817:1: rule__Inicio__Group__3 : rule__Inicio__Group__3__Impl ;
    public final void rule__Inicio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1821:1: ( rule__Inicio__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1822:2: rule__Inicio__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__3__Impl_in_rule__Inicio__Group__33917);
            rule__Inicio__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inicio__Group__3"


    // $ANTLR start "rule__Inicio__Group__3__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1828:1: rule__Inicio__Group__3__Impl : ( 'fin inicio' ) ;
    public final void rule__Inicio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1832:1: ( ( 'fin inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1833:1: ( 'fin inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1833:1: ( 'fin inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1834:1: 'fin inicio'
            {
             before(grammarAccess.getInicioAccess().getFinInicioKeyword_3()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Inicio__Group__3__Impl3945); 
             after(grammarAccess.getInicioAccess().getFinInicioKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inicio__Group__3__Impl"


    // $ANTLR start "rule__Inicio__Group_2__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: rule__Inicio__Group_2__0 : rule__Inicio__Group_2__0__Impl rule__Inicio__Group_2__1 ;
    public final void rule__Inicio__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( rule__Inicio__Group_2__0__Impl rule__Inicio__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:2: rule__Inicio__Group_2__0__Impl rule__Inicio__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__0__Impl_in_rule__Inicio__Group_2__03984);
            rule__Inicio__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__1_in_rule__Inicio__Group_2__03987);
            rule__Inicio__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inicio__Group_2__0"


    // $ANTLR start "rule__Inicio__Group_2__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: rule__Inicio__Group_2__0__Impl : ( ( rule__Inicio__TieneAssignment_2_0 ) ) ;
    public final void rule__Inicio__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1871:1: ( ( ( rule__Inicio__TieneAssignment_2_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: ( ( rule__Inicio__TieneAssignment_2_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: ( ( rule__Inicio__TieneAssignment_2_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1873:1: ( rule__Inicio__TieneAssignment_2_0 )
            {
             before(grammarAccess.getInicioAccess().getTieneAssignment_2_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1874:1: ( rule__Inicio__TieneAssignment_2_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1874:2: rule__Inicio__TieneAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__TieneAssignment_2_0_in_rule__Inicio__Group_2__0__Impl4014);
            rule__Inicio__TieneAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getInicioAccess().getTieneAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inicio__Group_2__0__Impl"


    // $ANTLR start "rule__Inicio__Group_2__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1884:1: rule__Inicio__Group_2__1 : rule__Inicio__Group_2__1__Impl ;
    public final void rule__Inicio__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1888:1: ( rule__Inicio__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:2: rule__Inicio__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__1__Impl_in_rule__Inicio__Group_2__14044);
            rule__Inicio__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inicio__Group_2__1"


    // $ANTLR start "rule__Inicio__Group_2__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1895:1: rule__Inicio__Group_2__1__Impl : ( ( rule__Inicio__TieneAssignment_2_1 )* ) ;
    public final void rule__Inicio__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1899:1: ( ( ( rule__Inicio__TieneAssignment_2_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:1: ( ( rule__Inicio__TieneAssignment_2_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:1: ( ( rule__Inicio__TieneAssignment_2_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1901:1: ( rule__Inicio__TieneAssignment_2_1 )*
            {
             before(grammarAccess.getInicioAccess().getTieneAssignment_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1902:1: ( rule__Inicio__TieneAssignment_2_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)||(LA15_0>=14 && LA15_0<=18)||(LA15_0>=44 && LA15_0<=46)||LA15_0==49||LA15_0==52||LA15_0==54) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1902:2: rule__Inicio__TieneAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Inicio__TieneAssignment_2_1_in_rule__Inicio__Group_2__1__Impl4071);
            	    rule__Inicio__TieneAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getInicioAccess().getTieneAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inicio__Group_2__1__Impl"


    // $ANTLR start "rule__DeclaracionVariable__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1916:1: rule__DeclaracionVariable__Group__0 : rule__DeclaracionVariable__Group__0__Impl rule__DeclaracionVariable__Group__1 ;
    public final void rule__DeclaracionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1920:1: ( rule__DeclaracionVariable__Group__0__Impl rule__DeclaracionVariable__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:2: rule__DeclaracionVariable__Group__0__Impl rule__DeclaracionVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__0__Impl_in_rule__DeclaracionVariable__Group__04106);
            rule__DeclaracionVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__1_in_rule__DeclaracionVariable__Group__04109);
            rule__DeclaracionVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__Group__0"


    // $ANTLR start "rule__DeclaracionVariable__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1928:1: rule__DeclaracionVariable__Group__0__Impl : ( ( rule__DeclaracionVariable__TipoAssignment_0 ) ) ;
    public final void rule__DeclaracionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1932:1: ( ( ( rule__DeclaracionVariable__TipoAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1933:1: ( ( rule__DeclaracionVariable__TipoAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1933:1: ( ( rule__DeclaracionVariable__TipoAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1934:1: ( rule__DeclaracionVariable__TipoAssignment_0 )
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTipoAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:1: ( rule__DeclaracionVariable__TipoAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:2: rule__DeclaracionVariable__TipoAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__TipoAssignment_0_in_rule__DeclaracionVariable__Group__0__Impl4136);
            rule__DeclaracionVariable__TipoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracionVariableAccess().getTipoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__Group__0__Impl"


    // $ANTLR start "rule__DeclaracionVariable__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1945:1: rule__DeclaracionVariable__Group__1 : rule__DeclaracionVariable__Group__1__Impl rule__DeclaracionVariable__Group__2 ;
    public final void rule__DeclaracionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: ( rule__DeclaracionVariable__Group__1__Impl rule__DeclaracionVariable__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:2: rule__DeclaracionVariable__Group__1__Impl rule__DeclaracionVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__1__Impl_in_rule__DeclaracionVariable__Group__14166);
            rule__DeclaracionVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__2_in_rule__DeclaracionVariable__Group__14169);
            rule__DeclaracionVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__Group__1"


    // $ANTLR start "rule__DeclaracionVariable__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1957:1: rule__DeclaracionVariable__Group__1__Impl : ( ( rule__DeclaracionVariable__TieneIDsAssignment_1 ) ) ;
    public final void rule__DeclaracionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: ( ( ( rule__DeclaracionVariable__TieneIDsAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1962:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1962:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1963:1: ( rule__DeclaracionVariable__TieneIDsAssignment_1 )
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1964:1: ( rule__DeclaracionVariable__TieneIDsAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1964:2: rule__DeclaracionVariable__TieneIDsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_1_in_rule__DeclaracionVariable__Group__1__Impl4196);
            rule__DeclaracionVariable__TieneIDsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracionVariableAccess().getTieneIDsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__Group__1__Impl"


    // $ANTLR start "rule__DeclaracionVariable__Group__2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:1: rule__DeclaracionVariable__Group__2 : rule__DeclaracionVariable__Group__2__Impl ;
    public final void rule__DeclaracionVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1978:1: ( rule__DeclaracionVariable__Group__2__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:2: rule__DeclaracionVariable__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__2__Impl_in_rule__DeclaracionVariable__Group__24226);
            rule__DeclaracionVariable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__Group__2"


    // $ANTLR start "rule__DeclaracionVariable__Group__2__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: rule__DeclaracionVariable__Group__2__Impl : ( ( rule__DeclaracionVariable__Group_2__0 )* ) ;
    public final void rule__DeclaracionVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1989:1: ( ( ( rule__DeclaracionVariable__Group_2__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1990:1: ( ( rule__DeclaracionVariable__Group_2__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1990:1: ( ( rule__DeclaracionVariable__Group_2__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1991:1: ( rule__DeclaracionVariable__Group_2__0 )*
            {
             before(grammarAccess.getDeclaracionVariableAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:1: ( rule__DeclaracionVariable__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:2: rule__DeclaracionVariable__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_2__0_in_rule__DeclaracionVariable__Group__2__Impl4253);
            	    rule__DeclaracionVariable__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDeclaracionVariableAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__Group__2__Impl"


    // $ANTLR start "rule__DeclaracionVariable__Group_2__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2008:1: rule__DeclaracionVariable__Group_2__0 : rule__DeclaracionVariable__Group_2__0__Impl rule__DeclaracionVariable__Group_2__1 ;
    public final void rule__DeclaracionVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2012:1: ( rule__DeclaracionVariable__Group_2__0__Impl rule__DeclaracionVariable__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:2: rule__DeclaracionVariable__Group_2__0__Impl rule__DeclaracionVariable__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_2__0__Impl_in_rule__DeclaracionVariable__Group_2__04290);
            rule__DeclaracionVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_2__1_in_rule__DeclaracionVariable__Group_2__04293);
            rule__DeclaracionVariable__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__Group_2__0"


    // $ANTLR start "rule__DeclaracionVariable__Group_2__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2020:1: rule__DeclaracionVariable__Group_2__0__Impl : ( ',' ) ;
    public final void rule__DeclaracionVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2024:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2025:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2025:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2026:1: ','
            {
             before(grammarAccess.getDeclaracionVariableAccess().getCommaKeyword_2_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__DeclaracionVariable__Group_2__0__Impl4321); 
             after(grammarAccess.getDeclaracionVariableAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__Group_2__0__Impl"


    // $ANTLR start "rule__DeclaracionVariable__Group_2__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: rule__DeclaracionVariable__Group_2__1 : rule__DeclaracionVariable__Group_2__1__Impl ;
    public final void rule__DeclaracionVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2043:1: ( rule__DeclaracionVariable__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2044:2: rule__DeclaracionVariable__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_2__1__Impl_in_rule__DeclaracionVariable__Group_2__14352);
            rule__DeclaracionVariable__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__Group_2__1"


    // $ANTLR start "rule__DeclaracionVariable__Group_2__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2050:1: rule__DeclaracionVariable__Group_2__1__Impl : ( ( rule__DeclaracionVariable__TieneIDsAssignment_2_1 ) ) ;
    public final void rule__DeclaracionVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2054:1: ( ( ( rule__DeclaracionVariable__TieneIDsAssignment_2_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2055:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_2_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2055:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_2_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2056:1: ( rule__DeclaracionVariable__TieneIDsAssignment_2_1 )
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsAssignment_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:1: ( rule__DeclaracionVariable__TieneIDsAssignment_2_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:2: rule__DeclaracionVariable__TieneIDsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_2_1_in_rule__DeclaracionVariable__Group_2__1__Impl4379);
            rule__DeclaracionVariable__TieneIDsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracionVariableAccess().getTieneIDsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__Group_2__1__Impl"


    // $ANTLR start "rule__LlamadaFuncion__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2071:1: rule__LlamadaFuncion__Group__0 : rule__LlamadaFuncion__Group__0__Impl rule__LlamadaFuncion__Group__1 ;
    public final void rule__LlamadaFuncion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2075:1: ( rule__LlamadaFuncion__Group__0__Impl rule__LlamadaFuncion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2076:2: rule__LlamadaFuncion__Group__0__Impl rule__LlamadaFuncion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__0__Impl_in_rule__LlamadaFuncion__Group__04413);
            rule__LlamadaFuncion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__1_in_rule__LlamadaFuncion__Group__04416);
            rule__LlamadaFuncion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__Group__0"


    // $ANTLR start "rule__LlamadaFuncion__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2083:1: rule__LlamadaFuncion__Group__0__Impl : ( ( rule__LlamadaFuncion__NombreAssignment_0 ) ) ;
    public final void rule__LlamadaFuncion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:1: ( ( ( rule__LlamadaFuncion__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2088:1: ( ( rule__LlamadaFuncion__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2088:1: ( ( rule__LlamadaFuncion__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2089:1: ( rule__LlamadaFuncion__NombreAssignment_0 )
            {
             before(grammarAccess.getLlamadaFuncionAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:1: ( rule__LlamadaFuncion__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:2: rule__LlamadaFuncion__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__NombreAssignment_0_in_rule__LlamadaFuncion__Group__0__Impl4443);
            rule__LlamadaFuncion__NombreAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLlamadaFuncionAccess().getNombreAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__Group__0__Impl"


    // $ANTLR start "rule__LlamadaFuncion__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:1: rule__LlamadaFuncion__Group__1 : rule__LlamadaFuncion__Group__1__Impl rule__LlamadaFuncion__Group__2 ;
    public final void rule__LlamadaFuncion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:1: ( rule__LlamadaFuncion__Group__1__Impl rule__LlamadaFuncion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2105:2: rule__LlamadaFuncion__Group__1__Impl rule__LlamadaFuncion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__1__Impl_in_rule__LlamadaFuncion__Group__14473);
            rule__LlamadaFuncion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__2_in_rule__LlamadaFuncion__Group__14476);
            rule__LlamadaFuncion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__Group__1"


    // $ANTLR start "rule__LlamadaFuncion__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2112:1: rule__LlamadaFuncion__Group__1__Impl : ( '(' ) ;
    public final void rule__LlamadaFuncion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: '('
            {
             before(grammarAccess.getLlamadaFuncionAccess().getLeftParenthesisKeyword_1()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__LlamadaFuncion__Group__1__Impl4504); 
             after(grammarAccess.getLlamadaFuncionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__Group__1__Impl"


    // $ANTLR start "rule__LlamadaFuncion__Group__2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2131:1: rule__LlamadaFuncion__Group__2 : rule__LlamadaFuncion__Group__2__Impl rule__LlamadaFuncion__Group__3 ;
    public final void rule__LlamadaFuncion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:1: ( rule__LlamadaFuncion__Group__2__Impl rule__LlamadaFuncion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2136:2: rule__LlamadaFuncion__Group__2__Impl rule__LlamadaFuncion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__2__Impl_in_rule__LlamadaFuncion__Group__24535);
            rule__LlamadaFuncion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__3_in_rule__LlamadaFuncion__Group__24538);
            rule__LlamadaFuncion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__Group__2"


    // $ANTLR start "rule__LlamadaFuncion__Group__2__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2143:1: rule__LlamadaFuncion__Group__2__Impl : ( ( rule__LlamadaFuncion__Group_2__0 )? ) ;
    public final void rule__LlamadaFuncion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2147:1: ( ( ( rule__LlamadaFuncion__Group_2__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2148:1: ( ( rule__LlamadaFuncion__Group_2__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2148:1: ( ( rule__LlamadaFuncion__Group_2__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2149:1: ( rule__LlamadaFuncion__Group_2__0 )?
            {
             before(grammarAccess.getLlamadaFuncionAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:1: ( rule__LlamadaFuncion__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_CAR)||LA17_0==RULE_CAD||(LA17_0>=21 && LA17_0<=22)||LA17_0==24||LA17_0==57) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:2: rule__LlamadaFuncion__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__0_in_rule__LlamadaFuncion__Group__2__Impl4565);
                    rule__LlamadaFuncion__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLlamadaFuncionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__Group__2__Impl"


    // $ANTLR start "rule__LlamadaFuncion__Group__3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2160:1: rule__LlamadaFuncion__Group__3 : rule__LlamadaFuncion__Group__3__Impl ;
    public final void rule__LlamadaFuncion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2164:1: ( rule__LlamadaFuncion__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2165:2: rule__LlamadaFuncion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__3__Impl_in_rule__LlamadaFuncion__Group__34596);
            rule__LlamadaFuncion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__Group__3"


    // $ANTLR start "rule__LlamadaFuncion__Group__3__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2171:1: rule__LlamadaFuncion__Group__3__Impl : ( ')' ) ;
    public final void rule__LlamadaFuncion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2175:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2177:1: ')'
            {
             before(grammarAccess.getLlamadaFuncionAccess().getRightParenthesisKeyword_3()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__LlamadaFuncion__Group__3__Impl4624); 
             after(grammarAccess.getLlamadaFuncionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__Group__3__Impl"


    // $ANTLR start "rule__LlamadaFuncion__Group_2__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2198:1: rule__LlamadaFuncion__Group_2__0 : rule__LlamadaFuncion__Group_2__0__Impl rule__LlamadaFuncion__Group_2__1 ;
    public final void rule__LlamadaFuncion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:1: ( rule__LlamadaFuncion__Group_2__0__Impl rule__LlamadaFuncion__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2203:2: rule__LlamadaFuncion__Group_2__0__Impl rule__LlamadaFuncion__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__0__Impl_in_rule__LlamadaFuncion__Group_2__04663);
            rule__LlamadaFuncion__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__1_in_rule__LlamadaFuncion__Group_2__04666);
            rule__LlamadaFuncion__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__Group_2__0"


    // $ANTLR start "rule__LlamadaFuncion__Group_2__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:1: rule__LlamadaFuncion__Group_2__0__Impl : ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) ) ;
    public final void rule__LlamadaFuncion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2214:1: ( ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2216:1: ( rule__LlamadaFuncion__OperadorAssignment_2_0 )
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorAssignment_2_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:1: ( rule__LlamadaFuncion__OperadorAssignment_2_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:2: rule__LlamadaFuncion__OperadorAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_0_in_rule__LlamadaFuncion__Group_2__0__Impl4693);
            rule__LlamadaFuncion__OperadorAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLlamadaFuncionAccess().getOperadorAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__Group_2__0__Impl"


    // $ANTLR start "rule__LlamadaFuncion__Group_2__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2227:1: rule__LlamadaFuncion__Group_2__1 : rule__LlamadaFuncion__Group_2__1__Impl ;
    public final void rule__LlamadaFuncion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: ( rule__LlamadaFuncion__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2232:2: rule__LlamadaFuncion__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__1__Impl_in_rule__LlamadaFuncion__Group_2__14723);
            rule__LlamadaFuncion__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__Group_2__1"


    // $ANTLR start "rule__LlamadaFuncion__Group_2__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2238:1: rule__LlamadaFuncion__Group_2__1__Impl : ( ( rule__LlamadaFuncion__Group_2_1__0 )* ) ;
    public final void rule__LlamadaFuncion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2242:1: ( ( ( rule__LlamadaFuncion__Group_2_1__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2243:1: ( ( rule__LlamadaFuncion__Group_2_1__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2243:1: ( ( rule__LlamadaFuncion__Group_2_1__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2244:1: ( rule__LlamadaFuncion__Group_2_1__0 )*
            {
             before(grammarAccess.getLlamadaFuncionAccess().getGroup_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2245:1: ( rule__LlamadaFuncion__Group_2_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==40) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2245:2: rule__LlamadaFuncion__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__0_in_rule__LlamadaFuncion__Group_2__1__Impl4750);
            	    rule__LlamadaFuncion__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getLlamadaFuncionAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__Group_2__1__Impl"


    // $ANTLR start "rule__LlamadaFuncion__Group_2_1__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2259:1: rule__LlamadaFuncion__Group_2_1__0 : rule__LlamadaFuncion__Group_2_1__0__Impl rule__LlamadaFuncion__Group_2_1__1 ;
    public final void rule__LlamadaFuncion__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2263:1: ( rule__LlamadaFuncion__Group_2_1__0__Impl rule__LlamadaFuncion__Group_2_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2264:2: rule__LlamadaFuncion__Group_2_1__0__Impl rule__LlamadaFuncion__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__0__Impl_in_rule__LlamadaFuncion__Group_2_1__04785);
            rule__LlamadaFuncion__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__1_in_rule__LlamadaFuncion__Group_2_1__04788);
            rule__LlamadaFuncion__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__Group_2_1__0"


    // $ANTLR start "rule__LlamadaFuncion__Group_2_1__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2271:1: rule__LlamadaFuncion__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__LlamadaFuncion__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2275:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2276:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2276:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2277:1: ','
            {
             before(grammarAccess.getLlamadaFuncionAccess().getCommaKeyword_2_1_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__LlamadaFuncion__Group_2_1__0__Impl4816); 
             after(grammarAccess.getLlamadaFuncionAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__Group_2_1__0__Impl"


    // $ANTLR start "rule__LlamadaFuncion__Group_2_1__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2290:1: rule__LlamadaFuncion__Group_2_1__1 : rule__LlamadaFuncion__Group_2_1__1__Impl ;
    public final void rule__LlamadaFuncion__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2294:1: ( rule__LlamadaFuncion__Group_2_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:2: rule__LlamadaFuncion__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__1__Impl_in_rule__LlamadaFuncion__Group_2_1__14847);
            rule__LlamadaFuncion__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__Group_2_1__1"


    // $ANTLR start "rule__LlamadaFuncion__Group_2_1__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2301:1: rule__LlamadaFuncion__Group_2_1__1__Impl : ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) ) ;
    public final void rule__LlamadaFuncion__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2305:1: ( ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2306:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2306:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2307:1: ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 )
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorAssignment_2_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:1: ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:2: rule__LlamadaFuncion__OperadorAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_1_1_in_rule__LlamadaFuncion__Group_2_1__1__Impl4874);
            rule__LlamadaFuncion__OperadorAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLlamadaFuncionAccess().getOperadorAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__Group_2_1__1__Impl"


    // $ANTLR start "rule__Asignacion__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2322:1: rule__Asignacion__Group__0 : rule__Asignacion__Group__0__Impl rule__Asignacion__Group__1 ;
    public final void rule__Asignacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:1: ( rule__Asignacion__Group__0__Impl rule__Asignacion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2327:2: rule__Asignacion__Group__0__Impl rule__Asignacion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__0__Impl_in_rule__Asignacion__Group__04908);
            rule__Asignacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__1_in_rule__Asignacion__Group__04911);
            rule__Asignacion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asignacion__Group__0"


    // $ANTLR start "rule__Asignacion__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2334:1: rule__Asignacion__Group__0__Impl : ( ( rule__Asignacion__LvalueAssignment_0 ) ) ;
    public final void rule__Asignacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2338:1: ( ( ( rule__Asignacion__LvalueAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2339:1: ( ( rule__Asignacion__LvalueAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2339:1: ( ( rule__Asignacion__LvalueAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: ( rule__Asignacion__LvalueAssignment_0 )
            {
             before(grammarAccess.getAsignacionAccess().getLvalueAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ( rule__Asignacion__LvalueAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:2: rule__Asignacion__LvalueAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__LvalueAssignment_0_in_rule__Asignacion__Group__0__Impl4938);
            rule__Asignacion__LvalueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAsignacionAccess().getLvalueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asignacion__Group__0__Impl"


    // $ANTLR start "rule__Asignacion__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:1: rule__Asignacion__Group__1 : rule__Asignacion__Group__1__Impl rule__Asignacion__Group__2 ;
    public final void rule__Asignacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2355:1: ( rule__Asignacion__Group__1__Impl rule__Asignacion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2356:2: rule__Asignacion__Group__1__Impl rule__Asignacion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__1__Impl_in_rule__Asignacion__Group__14968);
            rule__Asignacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__2_in_rule__Asignacion__Group__14971);
            rule__Asignacion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asignacion__Group__1"


    // $ANTLR start "rule__Asignacion__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:1: rule__Asignacion__Group__1__Impl : ( ( rule__Asignacion__MatAssignment_1 )* ) ;
    public final void rule__Asignacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2367:1: ( ( ( rule__Asignacion__MatAssignment_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:1: ( ( rule__Asignacion__MatAssignment_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:1: ( ( rule__Asignacion__MatAssignment_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2369:1: ( rule__Asignacion__MatAssignment_1 )*
            {
             before(grammarAccess.getAsignacionAccess().getMatAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2370:1: ( rule__Asignacion__MatAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_MATRIZ) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2370:2: rule__Asignacion__MatAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Asignacion__MatAssignment_1_in_rule__Asignacion__Group__1__Impl4998);
            	    rule__Asignacion__MatAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getAsignacionAccess().getMatAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asignacion__Group__1__Impl"


    // $ANTLR start "rule__Asignacion__Group__2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2380:1: rule__Asignacion__Group__2 : rule__Asignacion__Group__2__Impl rule__Asignacion__Group__3 ;
    public final void rule__Asignacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: ( rule__Asignacion__Group__2__Impl rule__Asignacion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:2: rule__Asignacion__Group__2__Impl rule__Asignacion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__2__Impl_in_rule__Asignacion__Group__25029);
            rule__Asignacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__3_in_rule__Asignacion__Group__25032);
            rule__Asignacion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asignacion__Group__2"


    // $ANTLR start "rule__Asignacion__Group__2__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2392:1: rule__Asignacion__Group__2__Impl : ( '=' ) ;
    public final void rule__Asignacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2396:1: ( ( '=' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2397:1: ( '=' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2397:1: ( '=' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2398:1: '='
            {
             before(grammarAccess.getAsignacionAccess().getEqualsSignKeyword_2()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Asignacion__Group__2__Impl5060); 
             after(grammarAccess.getAsignacionAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asignacion__Group__2__Impl"


    // $ANTLR start "rule__Asignacion__Group__3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2411:1: rule__Asignacion__Group__3 : rule__Asignacion__Group__3__Impl ;
    public final void rule__Asignacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2415:1: ( rule__Asignacion__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:2: rule__Asignacion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__3__Impl_in_rule__Asignacion__Group__35091);
            rule__Asignacion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asignacion__Group__3"


    // $ANTLR start "rule__Asignacion__Group__3__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2422:1: rule__Asignacion__Group__3__Impl : ( ( rule__Asignacion__OperadorAssignment_3 ) ) ;
    public final void rule__Asignacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2426:1: ( ( ( rule__Asignacion__OperadorAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2427:1: ( ( rule__Asignacion__OperadorAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2427:1: ( ( rule__Asignacion__OperadorAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2428:1: ( rule__Asignacion__OperadorAssignment_3 )
            {
             before(grammarAccess.getAsignacionAccess().getOperadorAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2429:1: ( rule__Asignacion__OperadorAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2429:2: rule__Asignacion__OperadorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__OperadorAssignment_3_in_rule__Asignacion__Group__3__Impl5118);
            rule__Asignacion__OperadorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAsignacionAccess().getOperadorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asignacion__Group__3__Impl"


    // $ANTLR start "rule__Escribir__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2447:1: rule__Escribir__Group__0 : rule__Escribir__Group__0__Impl rule__Escribir__Group__1 ;
    public final void rule__Escribir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2451:1: ( rule__Escribir__Group__0__Impl rule__Escribir__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2452:2: rule__Escribir__Group__0__Impl rule__Escribir__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__0__Impl_in_rule__Escribir__Group__05156);
            rule__Escribir__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__1_in_rule__Escribir__Group__05159);
            rule__Escribir__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escribir__Group__0"


    // $ANTLR start "rule__Escribir__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2459:1: rule__Escribir__Group__0__Impl : ( 'escribir' ) ;
    public final void rule__Escribir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2463:1: ( ( 'escribir' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2464:1: ( 'escribir' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2464:1: ( 'escribir' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:1: 'escribir'
            {
             before(grammarAccess.getEscribirAccess().getEscribirKeyword_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Escribir__Group__0__Impl5187); 
             after(grammarAccess.getEscribirAccess().getEscribirKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escribir__Group__0__Impl"


    // $ANTLR start "rule__Escribir__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2478:1: rule__Escribir__Group__1 : rule__Escribir__Group__1__Impl rule__Escribir__Group__2 ;
    public final void rule__Escribir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2482:1: ( rule__Escribir__Group__1__Impl rule__Escribir__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:2: rule__Escribir__Group__1__Impl rule__Escribir__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__1__Impl_in_rule__Escribir__Group__15218);
            rule__Escribir__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__2_in_rule__Escribir__Group__15221);
            rule__Escribir__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escribir__Group__1"


    // $ANTLR start "rule__Escribir__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2490:1: rule__Escribir__Group__1__Impl : ( '(' ) ;
    public final void rule__Escribir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2494:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: '('
            {
             before(grammarAccess.getEscribirAccess().getLeftParenthesisKeyword_1()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Escribir__Group__1__Impl5249); 
             after(grammarAccess.getEscribirAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escribir__Group__1__Impl"


    // $ANTLR start "rule__Escribir__Group__2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2509:1: rule__Escribir__Group__2 : rule__Escribir__Group__2__Impl rule__Escribir__Group__3 ;
    public final void rule__Escribir__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2513:1: ( rule__Escribir__Group__2__Impl rule__Escribir__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2514:2: rule__Escribir__Group__2__Impl rule__Escribir__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__2__Impl_in_rule__Escribir__Group__25280);
            rule__Escribir__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__3_in_rule__Escribir__Group__25283);
            rule__Escribir__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escribir__Group__2"


    // $ANTLR start "rule__Escribir__Group__2__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2521:1: rule__Escribir__Group__2__Impl : ( ( rule__Escribir__OperadorAssignment_2 ) ) ;
    public final void rule__Escribir__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2525:1: ( ( ( rule__Escribir__OperadorAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:1: ( ( rule__Escribir__OperadorAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:1: ( ( rule__Escribir__OperadorAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2527:1: ( rule__Escribir__OperadorAssignment_2 )
            {
             before(grammarAccess.getEscribirAccess().getOperadorAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2528:1: ( rule__Escribir__OperadorAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2528:2: rule__Escribir__OperadorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__OperadorAssignment_2_in_rule__Escribir__Group__2__Impl5310);
            rule__Escribir__OperadorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEscribirAccess().getOperadorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escribir__Group__2__Impl"


    // $ANTLR start "rule__Escribir__Group__3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: rule__Escribir__Group__3 : rule__Escribir__Group__3__Impl rule__Escribir__Group__4 ;
    public final void rule__Escribir__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2542:1: ( rule__Escribir__Group__3__Impl rule__Escribir__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2543:2: rule__Escribir__Group__3__Impl rule__Escribir__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__3__Impl_in_rule__Escribir__Group__35340);
            rule__Escribir__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__4_in_rule__Escribir__Group__35343);
            rule__Escribir__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escribir__Group__3"


    // $ANTLR start "rule__Escribir__Group__3__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2550:1: rule__Escribir__Group__3__Impl : ( ( rule__Escribir__Group_3__0 )* ) ;
    public final void rule__Escribir__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2554:1: ( ( ( rule__Escribir__Group_3__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:1: ( ( rule__Escribir__Group_3__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:1: ( ( rule__Escribir__Group_3__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2556:1: ( rule__Escribir__Group_3__0 )*
            {
             before(grammarAccess.getEscribirAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2557:1: ( rule__Escribir__Group_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==40) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2557:2: rule__Escribir__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__0_in_rule__Escribir__Group__3__Impl5370);
            	    rule__Escribir__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getEscribirAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escribir__Group__3__Impl"


    // $ANTLR start "rule__Escribir__Group__4"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2567:1: rule__Escribir__Group__4 : rule__Escribir__Group__4__Impl ;
    public final void rule__Escribir__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2571:1: ( rule__Escribir__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2572:2: rule__Escribir__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__4__Impl_in_rule__Escribir__Group__45401);
            rule__Escribir__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escribir__Group__4"


    // $ANTLR start "rule__Escribir__Group__4__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: rule__Escribir__Group__4__Impl : ( ')' ) ;
    public final void rule__Escribir__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2584:1: ')'
            {
             before(grammarAccess.getEscribirAccess().getRightParenthesisKeyword_4()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Escribir__Group__4__Impl5429); 
             after(grammarAccess.getEscribirAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escribir__Group__4__Impl"


    // $ANTLR start "rule__Escribir__Group_3__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2607:1: rule__Escribir__Group_3__0 : rule__Escribir__Group_3__0__Impl rule__Escribir__Group_3__1 ;
    public final void rule__Escribir__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2611:1: ( rule__Escribir__Group_3__0__Impl rule__Escribir__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2612:2: rule__Escribir__Group_3__0__Impl rule__Escribir__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__0__Impl_in_rule__Escribir__Group_3__05470);
            rule__Escribir__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__1_in_rule__Escribir__Group_3__05473);
            rule__Escribir__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escribir__Group_3__0"


    // $ANTLR start "rule__Escribir__Group_3__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2619:1: rule__Escribir__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Escribir__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2623:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2624:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2624:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2625:1: ','
            {
             before(grammarAccess.getEscribirAccess().getCommaKeyword_3_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Escribir__Group_3__0__Impl5501); 
             after(grammarAccess.getEscribirAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escribir__Group_3__0__Impl"


    // $ANTLR start "rule__Escribir__Group_3__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2638:1: rule__Escribir__Group_3__1 : rule__Escribir__Group_3__1__Impl ;
    public final void rule__Escribir__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2642:1: ( rule__Escribir__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2643:2: rule__Escribir__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__1__Impl_in_rule__Escribir__Group_3__15532);
            rule__Escribir__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escribir__Group_3__1"


    // $ANTLR start "rule__Escribir__Group_3__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2649:1: rule__Escribir__Group_3__1__Impl : ( ( rule__Escribir__OperadorAssignment_3_1 ) ) ;
    public final void rule__Escribir__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2653:1: ( ( ( rule__Escribir__OperadorAssignment_3_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2654:1: ( ( rule__Escribir__OperadorAssignment_3_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2654:1: ( ( rule__Escribir__OperadorAssignment_3_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2655:1: ( rule__Escribir__OperadorAssignment_3_1 )
            {
             before(grammarAccess.getEscribirAccess().getOperadorAssignment_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2656:1: ( rule__Escribir__OperadorAssignment_3_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2656:2: rule__Escribir__OperadorAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__OperadorAssignment_3_1_in_rule__Escribir__Group_3__1__Impl5559);
            rule__Escribir__OperadorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEscribirAccess().getOperadorAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escribir__Group_3__1__Impl"


    // $ANTLR start "rule__Leer__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2670:1: rule__Leer__Group__0 : rule__Leer__Group__0__Impl rule__Leer__Group__1 ;
    public final void rule__Leer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2674:1: ( rule__Leer__Group__0__Impl rule__Leer__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2675:2: rule__Leer__Group__0__Impl rule__Leer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__0__Impl_in_rule__Leer__Group__05593);
            rule__Leer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__1_in_rule__Leer__Group__05596);
            rule__Leer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leer__Group__0"


    // $ANTLR start "rule__Leer__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2682:1: rule__Leer__Group__0__Impl : ( 'leer' ) ;
    public final void rule__Leer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2686:1: ( ( 'leer' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2687:1: ( 'leer' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2687:1: ( 'leer' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2688:1: 'leer'
            {
             before(grammarAccess.getLeerAccess().getLeerKeyword_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Leer__Group__0__Impl5624); 
             after(grammarAccess.getLeerAccess().getLeerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leer__Group__0__Impl"


    // $ANTLR start "rule__Leer__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2701:1: rule__Leer__Group__1 : rule__Leer__Group__1__Impl rule__Leer__Group__2 ;
    public final void rule__Leer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2705:1: ( rule__Leer__Group__1__Impl rule__Leer__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2706:2: rule__Leer__Group__1__Impl rule__Leer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__1__Impl_in_rule__Leer__Group__15655);
            rule__Leer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__2_in_rule__Leer__Group__15658);
            rule__Leer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leer__Group__1"


    // $ANTLR start "rule__Leer__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2713:1: rule__Leer__Group__1__Impl : ( '(' ) ;
    public final void rule__Leer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2717:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2718:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2718:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2719:1: '('
            {
             before(grammarAccess.getLeerAccess().getLeftParenthesisKeyword_1()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Leer__Group__1__Impl5686); 
             after(grammarAccess.getLeerAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leer__Group__1__Impl"


    // $ANTLR start "rule__Leer__Group__2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2732:1: rule__Leer__Group__2 : rule__Leer__Group__2__Impl rule__Leer__Group__3 ;
    public final void rule__Leer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2736:1: ( rule__Leer__Group__2__Impl rule__Leer__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2737:2: rule__Leer__Group__2__Impl rule__Leer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__2__Impl_in_rule__Leer__Group__25717);
            rule__Leer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__3_in_rule__Leer__Group__25720);
            rule__Leer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leer__Group__2"


    // $ANTLR start "rule__Leer__Group__2__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2744:1: rule__Leer__Group__2__Impl : ( ( rule__Leer__VariableAssignment_2 ) ) ;
    public final void rule__Leer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2748:1: ( ( ( rule__Leer__VariableAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2749:1: ( ( rule__Leer__VariableAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2749:1: ( ( rule__Leer__VariableAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2750:1: ( rule__Leer__VariableAssignment_2 )
            {
             before(grammarAccess.getLeerAccess().getVariableAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2751:1: ( rule__Leer__VariableAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2751:2: rule__Leer__VariableAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__VariableAssignment_2_in_rule__Leer__Group__2__Impl5747);
            rule__Leer__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeerAccess().getVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leer__Group__2__Impl"


    // $ANTLR start "rule__Leer__Group__3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:1: rule__Leer__Group__3 : rule__Leer__Group__3__Impl ;
    public final void rule__Leer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2765:1: ( rule__Leer__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2766:2: rule__Leer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__3__Impl_in_rule__Leer__Group__35777);
            rule__Leer__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leer__Group__3"


    // $ANTLR start "rule__Leer__Group__3__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2772:1: rule__Leer__Group__3__Impl : ( ')' ) ;
    public final void rule__Leer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2776:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2777:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2777:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2778:1: ')'
            {
             before(grammarAccess.getLeerAccess().getRightParenthesisKeyword_3()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Leer__Group__3__Impl5805); 
             after(grammarAccess.getLeerAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leer__Group__3__Impl"


    // $ANTLR start "rule__Si__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2799:1: rule__Si__Group__0 : rule__Si__Group__0__Impl rule__Si__Group__1 ;
    public final void rule__Si__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2803:1: ( rule__Si__Group__0__Impl rule__Si__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2804:2: rule__Si__Group__0__Impl rule__Si__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__0__Impl_in_rule__Si__Group__05844);
            rule__Si__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__1_in_rule__Si__Group__05847);
            rule__Si__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__Group__0"


    // $ANTLR start "rule__Si__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2811:1: rule__Si__Group__0__Impl : ( 'si' ) ;
    public final void rule__Si__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2815:1: ( ( 'si' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2816:1: ( 'si' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2816:1: ( 'si' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:1: 'si'
            {
             before(grammarAccess.getSiAccess().getSiKeyword_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Si__Group__0__Impl5875); 
             after(grammarAccess.getSiAccess().getSiKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__Group__0__Impl"


    // $ANTLR start "rule__Si__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2830:1: rule__Si__Group__1 : rule__Si__Group__1__Impl rule__Si__Group__2 ;
    public final void rule__Si__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2834:1: ( rule__Si__Group__1__Impl rule__Si__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2835:2: rule__Si__Group__1__Impl rule__Si__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__1__Impl_in_rule__Si__Group__15906);
            rule__Si__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__2_in_rule__Si__Group__15909);
            rule__Si__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__Group__1"


    // $ANTLR start "rule__Si__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2842:1: rule__Si__Group__1__Impl : ( ( rule__Si__ValorAssignment_1 ) ) ;
    public final void rule__Si__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2846:1: ( ( ( rule__Si__ValorAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2847:1: ( ( rule__Si__ValorAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2847:1: ( ( rule__Si__ValorAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2848:1: ( rule__Si__ValorAssignment_1 )
            {
             before(grammarAccess.getSiAccess().getValorAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:1: ( rule__Si__ValorAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:2: rule__Si__ValorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__ValorAssignment_1_in_rule__Si__Group__1__Impl5936);
            rule__Si__ValorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSiAccess().getValorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__Group__1__Impl"


    // $ANTLR start "rule__Si__Group__2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2859:1: rule__Si__Group__2 : rule__Si__Group__2__Impl rule__Si__Group__3 ;
    public final void rule__Si__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2863:1: ( rule__Si__Group__2__Impl rule__Si__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2864:2: rule__Si__Group__2__Impl rule__Si__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__2__Impl_in_rule__Si__Group__25966);
            rule__Si__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__3_in_rule__Si__Group__25969);
            rule__Si__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__Group__2"


    // $ANTLR start "rule__Si__Group__2__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2871:1: rule__Si__Group__2__Impl : ( 'entonces' ) ;
    public final void rule__Si__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2875:1: ( ( 'entonces' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:1: ( 'entonces' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:1: ( 'entonces' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2877:1: 'entonces'
            {
             before(grammarAccess.getSiAccess().getEntoncesKeyword_2()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Si__Group__2__Impl5997); 
             after(grammarAccess.getSiAccess().getEntoncesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__Group__2__Impl"


    // $ANTLR start "rule__Si__Group__3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2890:1: rule__Si__Group__3 : rule__Si__Group__3__Impl rule__Si__Group__4 ;
    public final void rule__Si__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2894:1: ( rule__Si__Group__3__Impl rule__Si__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2895:2: rule__Si__Group__3__Impl rule__Si__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__3__Impl_in_rule__Si__Group__36028);
            rule__Si__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__4_in_rule__Si__Group__36031);
            rule__Si__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__Group__3"


    // $ANTLR start "rule__Si__Group__3__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2902:1: rule__Si__Group__3__Impl : ( ( rule__Si__Group_3__0 )? ) ;
    public final void rule__Si__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2906:1: ( ( ( rule__Si__Group_3__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2907:1: ( ( rule__Si__Group_3__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2907:1: ( ( rule__Si__Group_3__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2908:1: ( rule__Si__Group_3__0 )?
            {
             before(grammarAccess.getSiAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2909:1: ( rule__Si__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)||(LA21_0>=14 && LA21_0<=18)||(LA21_0>=44 && LA21_0<=46)||LA21_0==49||LA21_0==52||LA21_0==54) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2909:2: rule__Si__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__0_in_rule__Si__Group__3__Impl6058);
                    rule__Si__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSiAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__Group__3__Impl"


    // $ANTLR start "rule__Si__Group__4"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2919:1: rule__Si__Group__4 : rule__Si__Group__4__Impl rule__Si__Group__5 ;
    public final void rule__Si__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:1: ( rule__Si__Group__4__Impl rule__Si__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2924:2: rule__Si__Group__4__Impl rule__Si__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__4__Impl_in_rule__Si__Group__46089);
            rule__Si__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__5_in_rule__Si__Group__46092);
            rule__Si__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__Group__4"


    // $ANTLR start "rule__Si__Group__4__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2931:1: rule__Si__Group__4__Impl : ( ( rule__Si__SinoAssignment_4 )? ) ;
    public final void rule__Si__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2935:1: ( ( ( rule__Si__SinoAssignment_4 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2936:1: ( ( rule__Si__SinoAssignment_4 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2936:1: ( ( rule__Si__SinoAssignment_4 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2937:1: ( rule__Si__SinoAssignment_4 )?
            {
             before(grammarAccess.getSiAccess().getSinoAssignment_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2938:1: ( rule__Si__SinoAssignment_4 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==58) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2938:2: rule__Si__SinoAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Si__SinoAssignment_4_in_rule__Si__Group__4__Impl6119);
                    rule__Si__SinoAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSiAccess().getSinoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__Group__4__Impl"


    // $ANTLR start "rule__Si__Group__5"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2948:1: rule__Si__Group__5 : rule__Si__Group__5__Impl ;
    public final void rule__Si__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2952:1: ( rule__Si__Group__5__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2953:2: rule__Si__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__5__Impl_in_rule__Si__Group__56150);
            rule__Si__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__Group__5"


    // $ANTLR start "rule__Si__Group__5__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2959:1: rule__Si__Group__5__Impl : ( 'fin si' ) ;
    public final void rule__Si__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2963:1: ( ( 'fin si' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2964:1: ( 'fin si' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2964:1: ( 'fin si' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2965:1: 'fin si'
            {
             before(grammarAccess.getSiAccess().getFinSiKeyword_5()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Si__Group__5__Impl6178); 
             after(grammarAccess.getSiAccess().getFinSiKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__Group__5__Impl"


    // $ANTLR start "rule__Si__Group_3__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2990:1: rule__Si__Group_3__0 : rule__Si__Group_3__0__Impl rule__Si__Group_3__1 ;
    public final void rule__Si__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2994:1: ( rule__Si__Group_3__0__Impl rule__Si__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2995:2: rule__Si__Group_3__0__Impl rule__Si__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__0__Impl_in_rule__Si__Group_3__06221);
            rule__Si__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__1_in_rule__Si__Group_3__06224);
            rule__Si__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__Group_3__0"


    // $ANTLR start "rule__Si__Group_3__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3002:1: rule__Si__Group_3__0__Impl : ( ( rule__Si__SentenciasAssignment_3_0 ) ) ;
    public final void rule__Si__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3006:1: ( ( ( rule__Si__SentenciasAssignment_3_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3007:1: ( ( rule__Si__SentenciasAssignment_3_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3007:1: ( ( rule__Si__SentenciasAssignment_3_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3008:1: ( rule__Si__SentenciasAssignment_3_0 )
            {
             before(grammarAccess.getSiAccess().getSentenciasAssignment_3_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: ( rule__Si__SentenciasAssignment_3_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:2: rule__Si__SentenciasAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__SentenciasAssignment_3_0_in_rule__Si__Group_3__0__Impl6251);
            rule__Si__SentenciasAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSiAccess().getSentenciasAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__Group_3__0__Impl"


    // $ANTLR start "rule__Si__Group_3__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3019:1: rule__Si__Group_3__1 : rule__Si__Group_3__1__Impl ;
    public final void rule__Si__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3023:1: ( rule__Si__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3024:2: rule__Si__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__1__Impl_in_rule__Si__Group_3__16281);
            rule__Si__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__Group_3__1"


    // $ANTLR start "rule__Si__Group_3__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3030:1: rule__Si__Group_3__1__Impl : ( ( rule__Si__SentenciasAssignment_3_1 )* ) ;
    public final void rule__Si__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3034:1: ( ( ( rule__Si__SentenciasAssignment_3_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3035:1: ( ( rule__Si__SentenciasAssignment_3_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3035:1: ( ( rule__Si__SentenciasAssignment_3_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3036:1: ( rule__Si__SentenciasAssignment_3_1 )*
            {
             before(grammarAccess.getSiAccess().getSentenciasAssignment_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3037:1: ( rule__Si__SentenciasAssignment_3_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)||(LA23_0>=14 && LA23_0<=18)||(LA23_0>=44 && LA23_0<=46)||LA23_0==49||LA23_0==52||LA23_0==54) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3037:2: rule__Si__SentenciasAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Si__SentenciasAssignment_3_1_in_rule__Si__Group_3__1__Impl6308);
            	    rule__Si__SentenciasAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getSiAccess().getSentenciasAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__Group_3__1__Impl"


    // $ANTLR start "rule__Mientras__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3051:1: rule__Mientras__Group__0 : rule__Mientras__Group__0__Impl rule__Mientras__Group__1 ;
    public final void rule__Mientras__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3055:1: ( rule__Mientras__Group__0__Impl rule__Mientras__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3056:2: rule__Mientras__Group__0__Impl rule__Mientras__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__0__Impl_in_rule__Mientras__Group__06343);
            rule__Mientras__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__1_in_rule__Mientras__Group__06346);
            rule__Mientras__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mientras__Group__0"


    // $ANTLR start "rule__Mientras__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3063:1: rule__Mientras__Group__0__Impl : ( 'mientras' ) ;
    public final void rule__Mientras__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:1: ( ( 'mientras' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:1: ( 'mientras' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:1: ( 'mientras' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: 'mientras'
            {
             before(grammarAccess.getMientrasAccess().getMientrasKeyword_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Mientras__Group__0__Impl6374); 
             after(grammarAccess.getMientrasAccess().getMientrasKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mientras__Group__0__Impl"


    // $ANTLR start "rule__Mientras__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3082:1: rule__Mientras__Group__1 : rule__Mientras__Group__1__Impl rule__Mientras__Group__2 ;
    public final void rule__Mientras__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3086:1: ( rule__Mientras__Group__1__Impl rule__Mientras__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3087:2: rule__Mientras__Group__1__Impl rule__Mientras__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__1__Impl_in_rule__Mientras__Group__16405);
            rule__Mientras__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__2_in_rule__Mientras__Group__16408);
            rule__Mientras__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mientras__Group__1"


    // $ANTLR start "rule__Mientras__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3094:1: rule__Mientras__Group__1__Impl : ( ( rule__Mientras__ValorAssignment_1 ) ) ;
    public final void rule__Mientras__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3098:1: ( ( ( rule__Mientras__ValorAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3099:1: ( ( rule__Mientras__ValorAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3099:1: ( ( rule__Mientras__ValorAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3100:1: ( rule__Mientras__ValorAssignment_1 )
            {
             before(grammarAccess.getMientrasAccess().getValorAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3101:1: ( rule__Mientras__ValorAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3101:2: rule__Mientras__ValorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__ValorAssignment_1_in_rule__Mientras__Group__1__Impl6435);
            rule__Mientras__ValorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMientrasAccess().getValorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mientras__Group__1__Impl"


    // $ANTLR start "rule__Mientras__Group__2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3111:1: rule__Mientras__Group__2 : rule__Mientras__Group__2__Impl rule__Mientras__Group__3 ;
    public final void rule__Mientras__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: ( rule__Mientras__Group__2__Impl rule__Mientras__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3116:2: rule__Mientras__Group__2__Impl rule__Mientras__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__2__Impl_in_rule__Mientras__Group__26465);
            rule__Mientras__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__3_in_rule__Mientras__Group__26468);
            rule__Mientras__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mientras__Group__2"


    // $ANTLR start "rule__Mientras__Group__2__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3123:1: rule__Mientras__Group__2__Impl : ( 'hacer' ) ;
    public final void rule__Mientras__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3127:1: ( ( 'hacer' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3128:1: ( 'hacer' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3128:1: ( 'hacer' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3129:1: 'hacer'
            {
             before(grammarAccess.getMientrasAccess().getHacerKeyword_2()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Mientras__Group__2__Impl6496); 
             after(grammarAccess.getMientrasAccess().getHacerKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mientras__Group__2__Impl"


    // $ANTLR start "rule__Mientras__Group__3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3142:1: rule__Mientras__Group__3 : rule__Mientras__Group__3__Impl rule__Mientras__Group__4 ;
    public final void rule__Mientras__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3146:1: ( rule__Mientras__Group__3__Impl rule__Mientras__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3147:2: rule__Mientras__Group__3__Impl rule__Mientras__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__3__Impl_in_rule__Mientras__Group__36527);
            rule__Mientras__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__4_in_rule__Mientras__Group__36530);
            rule__Mientras__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mientras__Group__3"


    // $ANTLR start "rule__Mientras__Group__3__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3154:1: rule__Mientras__Group__3__Impl : ( ( rule__Mientras__Group_3__0 )? ) ;
    public final void rule__Mientras__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3158:1: ( ( ( rule__Mientras__Group_3__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3159:1: ( ( rule__Mientras__Group_3__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3159:1: ( ( rule__Mientras__Group_3__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3160:1: ( rule__Mientras__Group_3__0 )?
            {
             before(grammarAccess.getMientrasAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3161:1: ( rule__Mientras__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)||(LA24_0>=14 && LA24_0<=18)||(LA24_0>=44 && LA24_0<=46)||LA24_0==49||LA24_0==52||LA24_0==54) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3161:2: rule__Mientras__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__0_in_rule__Mientras__Group__3__Impl6557);
                    rule__Mientras__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMientrasAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mientras__Group__3__Impl"


    // $ANTLR start "rule__Mientras__Group__4"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3171:1: rule__Mientras__Group__4 : rule__Mientras__Group__4__Impl ;
    public final void rule__Mientras__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3175:1: ( rule__Mientras__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3176:2: rule__Mientras__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__4__Impl_in_rule__Mientras__Group__46588);
            rule__Mientras__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mientras__Group__4"


    // $ANTLR start "rule__Mientras__Group__4__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3182:1: rule__Mientras__Group__4__Impl : ( 'fin_mientras' ) ;
    public final void rule__Mientras__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3186:1: ( ( 'fin_mientras' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3187:1: ( 'fin_mientras' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3187:1: ( 'fin_mientras' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3188:1: 'fin_mientras'
            {
             before(grammarAccess.getMientrasAccess().getFin_mientrasKeyword_4()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Mientras__Group__4__Impl6616); 
             after(grammarAccess.getMientrasAccess().getFin_mientrasKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mientras__Group__4__Impl"


    // $ANTLR start "rule__Mientras__Group_3__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3211:1: rule__Mientras__Group_3__0 : rule__Mientras__Group_3__0__Impl rule__Mientras__Group_3__1 ;
    public final void rule__Mientras__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3215:1: ( rule__Mientras__Group_3__0__Impl rule__Mientras__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3216:2: rule__Mientras__Group_3__0__Impl rule__Mientras__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__0__Impl_in_rule__Mientras__Group_3__06657);
            rule__Mientras__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__1_in_rule__Mientras__Group_3__06660);
            rule__Mientras__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mientras__Group_3__0"


    // $ANTLR start "rule__Mientras__Group_3__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3223:1: rule__Mientras__Group_3__0__Impl : ( ( rule__Mientras__SentenciasAssignment_3_0 ) ) ;
    public final void rule__Mientras__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3227:1: ( ( ( rule__Mientras__SentenciasAssignment_3_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3228:1: ( ( rule__Mientras__SentenciasAssignment_3_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3228:1: ( ( rule__Mientras__SentenciasAssignment_3_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3229:1: ( rule__Mientras__SentenciasAssignment_3_0 )
            {
             before(grammarAccess.getMientrasAccess().getSentenciasAssignment_3_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3230:1: ( rule__Mientras__SentenciasAssignment_3_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3230:2: rule__Mientras__SentenciasAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__SentenciasAssignment_3_0_in_rule__Mientras__Group_3__0__Impl6687);
            rule__Mientras__SentenciasAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMientrasAccess().getSentenciasAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mientras__Group_3__0__Impl"


    // $ANTLR start "rule__Mientras__Group_3__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3240:1: rule__Mientras__Group_3__1 : rule__Mientras__Group_3__1__Impl ;
    public final void rule__Mientras__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3244:1: ( rule__Mientras__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3245:2: rule__Mientras__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__1__Impl_in_rule__Mientras__Group_3__16717);
            rule__Mientras__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mientras__Group_3__1"


    // $ANTLR start "rule__Mientras__Group_3__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3251:1: rule__Mientras__Group_3__1__Impl : ( ( rule__Mientras__SentenciasAssignment_3_1 )* ) ;
    public final void rule__Mientras__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3255:1: ( ( ( rule__Mientras__SentenciasAssignment_3_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3256:1: ( ( rule__Mientras__SentenciasAssignment_3_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3256:1: ( ( rule__Mientras__SentenciasAssignment_3_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3257:1: ( rule__Mientras__SentenciasAssignment_3_1 )*
            {
             before(grammarAccess.getMientrasAccess().getSentenciasAssignment_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3258:1: ( rule__Mientras__SentenciasAssignment_3_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)||(LA25_0>=14 && LA25_0<=18)||(LA25_0>=44 && LA25_0<=46)||LA25_0==49||LA25_0==52||LA25_0==54) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3258:2: rule__Mientras__SentenciasAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Mientras__SentenciasAssignment_3_1_in_rule__Mientras__Group_3__1__Impl6744);
            	    rule__Mientras__SentenciasAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getMientrasAccess().getSentenciasAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mientras__Group_3__1__Impl"


    // $ANTLR start "rule__Repetir__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3272:1: rule__Repetir__Group__0 : rule__Repetir__Group__0__Impl rule__Repetir__Group__1 ;
    public final void rule__Repetir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3276:1: ( rule__Repetir__Group__0__Impl rule__Repetir__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3277:2: rule__Repetir__Group__0__Impl rule__Repetir__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__0__Impl_in_rule__Repetir__Group__06779);
            rule__Repetir__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__1_in_rule__Repetir__Group__06782);
            rule__Repetir__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetir__Group__0"


    // $ANTLR start "rule__Repetir__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3284:1: rule__Repetir__Group__0__Impl : ( 'repetir' ) ;
    public final void rule__Repetir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:1: ( ( 'repetir' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3289:1: ( 'repetir' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3289:1: ( 'repetir' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3290:1: 'repetir'
            {
             before(grammarAccess.getRepetirAccess().getRepetirKeyword_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Repetir__Group__0__Impl6810); 
             after(grammarAccess.getRepetirAccess().getRepetirKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetir__Group__0__Impl"


    // $ANTLR start "rule__Repetir__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3303:1: rule__Repetir__Group__1 : rule__Repetir__Group__1__Impl rule__Repetir__Group__2 ;
    public final void rule__Repetir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3307:1: ( rule__Repetir__Group__1__Impl rule__Repetir__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3308:2: rule__Repetir__Group__1__Impl rule__Repetir__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__1__Impl_in_rule__Repetir__Group__16841);
            rule__Repetir__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__2_in_rule__Repetir__Group__16844);
            rule__Repetir__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetir__Group__1"


    // $ANTLR start "rule__Repetir__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3315:1: rule__Repetir__Group__1__Impl : ( ( rule__Repetir__Group_1__0 )? ) ;
    public final void rule__Repetir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3319:1: ( ( ( rule__Repetir__Group_1__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3320:1: ( ( rule__Repetir__Group_1__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3320:1: ( ( rule__Repetir__Group_1__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3321:1: ( rule__Repetir__Group_1__0 )?
            {
             before(grammarAccess.getRepetirAccess().getGroup_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3322:1: ( rule__Repetir__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)||(LA26_0>=14 && LA26_0<=18)||(LA26_0>=44 && LA26_0<=46)||LA26_0==49||LA26_0==52||LA26_0==54) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3322:2: rule__Repetir__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__0_in_rule__Repetir__Group__1__Impl6871);
                    rule__Repetir__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRepetirAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetir__Group__1__Impl"


    // $ANTLR start "rule__Repetir__Group__2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3332:1: rule__Repetir__Group__2 : rule__Repetir__Group__2__Impl rule__Repetir__Group__3 ;
    public final void rule__Repetir__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3336:1: ( rule__Repetir__Group__2__Impl rule__Repetir__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3337:2: rule__Repetir__Group__2__Impl rule__Repetir__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__2__Impl_in_rule__Repetir__Group__26902);
            rule__Repetir__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__3_in_rule__Repetir__Group__26905);
            rule__Repetir__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetir__Group__2"


    // $ANTLR start "rule__Repetir__Group__2__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3344:1: rule__Repetir__Group__2__Impl : ( 'hasta_que' ) ;
    public final void rule__Repetir__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3348:1: ( ( 'hasta_que' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3349:1: ( 'hasta_que' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3349:1: ( 'hasta_que' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3350:1: 'hasta_que'
            {
             before(grammarAccess.getRepetirAccess().getHasta_queKeyword_2()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__Repetir__Group__2__Impl6933); 
             after(grammarAccess.getRepetirAccess().getHasta_queKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetir__Group__2__Impl"


    // $ANTLR start "rule__Repetir__Group__3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3363:1: rule__Repetir__Group__3 : rule__Repetir__Group__3__Impl ;
    public final void rule__Repetir__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3367:1: ( rule__Repetir__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3368:2: rule__Repetir__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__3__Impl_in_rule__Repetir__Group__36964);
            rule__Repetir__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetir__Group__3"


    // $ANTLR start "rule__Repetir__Group__3__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3374:1: rule__Repetir__Group__3__Impl : ( ( rule__Repetir__ValorAssignment_3 ) ) ;
    public final void rule__Repetir__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3378:1: ( ( ( rule__Repetir__ValorAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3379:1: ( ( rule__Repetir__ValorAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3379:1: ( ( rule__Repetir__ValorAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3380:1: ( rule__Repetir__ValorAssignment_3 )
            {
             before(grammarAccess.getRepetirAccess().getValorAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3381:1: ( rule__Repetir__ValorAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3381:2: rule__Repetir__ValorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__ValorAssignment_3_in_rule__Repetir__Group__3__Impl6991);
            rule__Repetir__ValorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRepetirAccess().getValorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetir__Group__3__Impl"


    // $ANTLR start "rule__Repetir__Group_1__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3399:1: rule__Repetir__Group_1__0 : rule__Repetir__Group_1__0__Impl rule__Repetir__Group_1__1 ;
    public final void rule__Repetir__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3403:1: ( rule__Repetir__Group_1__0__Impl rule__Repetir__Group_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3404:2: rule__Repetir__Group_1__0__Impl rule__Repetir__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__0__Impl_in_rule__Repetir__Group_1__07029);
            rule__Repetir__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__1_in_rule__Repetir__Group_1__07032);
            rule__Repetir__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetir__Group_1__0"


    // $ANTLR start "rule__Repetir__Group_1__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3411:1: rule__Repetir__Group_1__0__Impl : ( ( rule__Repetir__SentenciasAssignment_1_0 ) ) ;
    public final void rule__Repetir__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3415:1: ( ( ( rule__Repetir__SentenciasAssignment_1_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3416:1: ( ( rule__Repetir__SentenciasAssignment_1_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3416:1: ( ( rule__Repetir__SentenciasAssignment_1_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3417:1: ( rule__Repetir__SentenciasAssignment_1_0 )
            {
             before(grammarAccess.getRepetirAccess().getSentenciasAssignment_1_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3418:1: ( rule__Repetir__SentenciasAssignment_1_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3418:2: rule__Repetir__SentenciasAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__SentenciasAssignment_1_0_in_rule__Repetir__Group_1__0__Impl7059);
            rule__Repetir__SentenciasAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRepetirAccess().getSentenciasAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetir__Group_1__0__Impl"


    // $ANTLR start "rule__Repetir__Group_1__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3428:1: rule__Repetir__Group_1__1 : rule__Repetir__Group_1__1__Impl ;
    public final void rule__Repetir__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3432:1: ( rule__Repetir__Group_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3433:2: rule__Repetir__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__1__Impl_in_rule__Repetir__Group_1__17089);
            rule__Repetir__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetir__Group_1__1"


    // $ANTLR start "rule__Repetir__Group_1__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3439:1: rule__Repetir__Group_1__1__Impl : ( ( rule__Repetir__SentenciasAssignment_1_1 )* ) ;
    public final void rule__Repetir__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3443:1: ( ( ( rule__Repetir__SentenciasAssignment_1_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3444:1: ( ( rule__Repetir__SentenciasAssignment_1_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3444:1: ( ( rule__Repetir__SentenciasAssignment_1_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3445:1: ( rule__Repetir__SentenciasAssignment_1_1 )*
            {
             before(grammarAccess.getRepetirAccess().getSentenciasAssignment_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3446:1: ( rule__Repetir__SentenciasAssignment_1_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)||(LA27_0>=14 && LA27_0<=18)||(LA27_0>=44 && LA27_0<=46)||LA27_0==49||LA27_0==52||LA27_0==54) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3446:2: rule__Repetir__SentenciasAssignment_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Repetir__SentenciasAssignment_1_1_in_rule__Repetir__Group_1__1__Impl7116);
            	    rule__Repetir__SentenciasAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getRepetirAccess().getSentenciasAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetir__Group_1__1__Impl"


    // $ANTLR start "rule__Desde__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3460:1: rule__Desde__Group__0 : rule__Desde__Group__0__Impl rule__Desde__Group__1 ;
    public final void rule__Desde__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3464:1: ( rule__Desde__Group__0__Impl rule__Desde__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3465:2: rule__Desde__Group__0__Impl rule__Desde__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__0__Impl_in_rule__Desde__Group__07151);
            rule__Desde__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__1_in_rule__Desde__Group__07154);
            rule__Desde__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__Group__0"


    // $ANTLR start "rule__Desde__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3472:1: rule__Desde__Group__0__Impl : ( 'desde' ) ;
    public final void rule__Desde__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3476:1: ( ( 'desde' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3477:1: ( 'desde' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3477:1: ( 'desde' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3478:1: 'desde'
            {
             before(grammarAccess.getDesdeAccess().getDesdeKeyword_0()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__Desde__Group__0__Impl7182); 
             after(grammarAccess.getDesdeAccess().getDesdeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__Group__0__Impl"


    // $ANTLR start "rule__Desde__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3491:1: rule__Desde__Group__1 : rule__Desde__Group__1__Impl rule__Desde__Group__2 ;
    public final void rule__Desde__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3495:1: ( rule__Desde__Group__1__Impl rule__Desde__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3496:2: rule__Desde__Group__1__Impl rule__Desde__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__1__Impl_in_rule__Desde__Group__17213);
            rule__Desde__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__2_in_rule__Desde__Group__17216);
            rule__Desde__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__Group__1"


    // $ANTLR start "rule__Desde__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3503:1: rule__Desde__Group__1__Impl : ( ( rule__Desde__AsignacionAssignment_1 ) ) ;
    public final void rule__Desde__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3507:1: ( ( ( rule__Desde__AsignacionAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3508:1: ( ( rule__Desde__AsignacionAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3508:1: ( ( rule__Desde__AsignacionAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3509:1: ( rule__Desde__AsignacionAssignment_1 )
            {
             before(grammarAccess.getDesdeAccess().getAsignacionAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3510:1: ( rule__Desde__AsignacionAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3510:2: rule__Desde__AsignacionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__AsignacionAssignment_1_in_rule__Desde__Group__1__Impl7243);
            rule__Desde__AsignacionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDesdeAccess().getAsignacionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__Group__1__Impl"


    // $ANTLR start "rule__Desde__Group__2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3520:1: rule__Desde__Group__2 : rule__Desde__Group__2__Impl rule__Desde__Group__3 ;
    public final void rule__Desde__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3524:1: ( rule__Desde__Group__2__Impl rule__Desde__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3525:2: rule__Desde__Group__2__Impl rule__Desde__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__2__Impl_in_rule__Desde__Group__27273);
            rule__Desde__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__3_in_rule__Desde__Group__27276);
            rule__Desde__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__Group__2"


    // $ANTLR start "rule__Desde__Group__2__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3532:1: rule__Desde__Group__2__Impl : ( 'hasta' ) ;
    public final void rule__Desde__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3536:1: ( ( 'hasta' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3537:1: ( 'hasta' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3537:1: ( 'hasta' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3538:1: 'hasta'
            {
             before(grammarAccess.getDesdeAccess().getHastaKeyword_2()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__Desde__Group__2__Impl7304); 
             after(grammarAccess.getDesdeAccess().getHastaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__Group__2__Impl"


    // $ANTLR start "rule__Desde__Group__3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3551:1: rule__Desde__Group__3 : rule__Desde__Group__3__Impl rule__Desde__Group__4 ;
    public final void rule__Desde__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3555:1: ( rule__Desde__Group__3__Impl rule__Desde__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3556:2: rule__Desde__Group__3__Impl rule__Desde__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__3__Impl_in_rule__Desde__Group__37335);
            rule__Desde__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__4_in_rule__Desde__Group__37338);
            rule__Desde__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__Group__3"


    // $ANTLR start "rule__Desde__Group__3__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3563:1: rule__Desde__Group__3__Impl : ( ( rule__Desde__ValorAssignment_3 ) ) ;
    public final void rule__Desde__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3567:1: ( ( ( rule__Desde__ValorAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3568:1: ( ( rule__Desde__ValorAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3568:1: ( ( rule__Desde__ValorAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:1: ( rule__Desde__ValorAssignment_3 )
            {
             before(grammarAccess.getDesdeAccess().getValorAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3570:1: ( rule__Desde__ValorAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3570:2: rule__Desde__ValorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__ValorAssignment_3_in_rule__Desde__Group__3__Impl7365);
            rule__Desde__ValorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDesdeAccess().getValorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__Group__3__Impl"


    // $ANTLR start "rule__Desde__Group__4"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3580:1: rule__Desde__Group__4 : rule__Desde__Group__4__Impl rule__Desde__Group__5 ;
    public final void rule__Desde__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3584:1: ( rule__Desde__Group__4__Impl rule__Desde__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3585:2: rule__Desde__Group__4__Impl rule__Desde__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__4__Impl_in_rule__Desde__Group__47395);
            rule__Desde__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__5_in_rule__Desde__Group__47398);
            rule__Desde__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__Group__4"


    // $ANTLR start "rule__Desde__Group__4__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3592:1: rule__Desde__Group__4__Impl : ( 'hacer' ) ;
    public final void rule__Desde__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3596:1: ( ( 'hacer' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:1: ( 'hacer' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:1: ( 'hacer' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3598:1: 'hacer'
            {
             before(grammarAccess.getDesdeAccess().getHacerKeyword_4()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Desde__Group__4__Impl7426); 
             after(grammarAccess.getDesdeAccess().getHacerKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__Group__4__Impl"


    // $ANTLR start "rule__Desde__Group__5"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3611:1: rule__Desde__Group__5 : rule__Desde__Group__5__Impl rule__Desde__Group__6 ;
    public final void rule__Desde__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3615:1: ( rule__Desde__Group__5__Impl rule__Desde__Group__6 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3616:2: rule__Desde__Group__5__Impl rule__Desde__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__5__Impl_in_rule__Desde__Group__57457);
            rule__Desde__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__6_in_rule__Desde__Group__57460);
            rule__Desde__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__Group__5"


    // $ANTLR start "rule__Desde__Group__5__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3623:1: rule__Desde__Group__5__Impl : ( ( rule__Desde__Group_5__0 )? ) ;
    public final void rule__Desde__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3627:1: ( ( ( rule__Desde__Group_5__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3628:1: ( ( rule__Desde__Group_5__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3628:1: ( ( rule__Desde__Group_5__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3629:1: ( rule__Desde__Group_5__0 )?
            {
             before(grammarAccess.getDesdeAccess().getGroup_5()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3630:1: ( rule__Desde__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||(LA28_0>=14 && LA28_0<=18)||(LA28_0>=44 && LA28_0<=46)||LA28_0==49||LA28_0==52||LA28_0==54) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3630:2: rule__Desde__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__0_in_rule__Desde__Group__5__Impl7487);
                    rule__Desde__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDesdeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__Group__5__Impl"


    // $ANTLR start "rule__Desde__Group__6"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3640:1: rule__Desde__Group__6 : rule__Desde__Group__6__Impl ;
    public final void rule__Desde__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3644:1: ( rule__Desde__Group__6__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3645:2: rule__Desde__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__6__Impl_in_rule__Desde__Group__67518);
            rule__Desde__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__Group__6"


    // $ANTLR start "rule__Desde__Group__6__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3651:1: rule__Desde__Group__6__Impl : ( 'fin_desde' ) ;
    public final void rule__Desde__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3655:1: ( ( 'fin_desde' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3656:1: ( 'fin_desde' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3656:1: ( 'fin_desde' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3657:1: 'fin_desde'
            {
             before(grammarAccess.getDesdeAccess().getFin_desdeKeyword_6()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Desde__Group__6__Impl7546); 
             after(grammarAccess.getDesdeAccess().getFin_desdeKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__Group__6__Impl"


    // $ANTLR start "rule__Desde__Group_5__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3684:1: rule__Desde__Group_5__0 : rule__Desde__Group_5__0__Impl rule__Desde__Group_5__1 ;
    public final void rule__Desde__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3688:1: ( rule__Desde__Group_5__0__Impl rule__Desde__Group_5__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3689:2: rule__Desde__Group_5__0__Impl rule__Desde__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__0__Impl_in_rule__Desde__Group_5__07591);
            rule__Desde__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__1_in_rule__Desde__Group_5__07594);
            rule__Desde__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__Group_5__0"


    // $ANTLR start "rule__Desde__Group_5__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3696:1: rule__Desde__Group_5__0__Impl : ( ( rule__Desde__SentenciasAssignment_5_0 ) ) ;
    public final void rule__Desde__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3700:1: ( ( ( rule__Desde__SentenciasAssignment_5_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3701:1: ( ( rule__Desde__SentenciasAssignment_5_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3701:1: ( ( rule__Desde__SentenciasAssignment_5_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3702:1: ( rule__Desde__SentenciasAssignment_5_0 )
            {
             before(grammarAccess.getDesdeAccess().getSentenciasAssignment_5_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3703:1: ( rule__Desde__SentenciasAssignment_5_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3703:2: rule__Desde__SentenciasAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__SentenciasAssignment_5_0_in_rule__Desde__Group_5__0__Impl7621);
            rule__Desde__SentenciasAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getDesdeAccess().getSentenciasAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__Group_5__0__Impl"


    // $ANTLR start "rule__Desde__Group_5__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3713:1: rule__Desde__Group_5__1 : rule__Desde__Group_5__1__Impl ;
    public final void rule__Desde__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3717:1: ( rule__Desde__Group_5__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3718:2: rule__Desde__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__1__Impl_in_rule__Desde__Group_5__17651);
            rule__Desde__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__Group_5__1"


    // $ANTLR start "rule__Desde__Group_5__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3724:1: rule__Desde__Group_5__1__Impl : ( ( rule__Desde__SentenciasAssignment_5_1 )* ) ;
    public final void rule__Desde__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3728:1: ( ( ( rule__Desde__SentenciasAssignment_5_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3729:1: ( ( rule__Desde__SentenciasAssignment_5_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3729:1: ( ( rule__Desde__SentenciasAssignment_5_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3730:1: ( rule__Desde__SentenciasAssignment_5_1 )*
            {
             before(grammarAccess.getDesdeAccess().getSentenciasAssignment_5_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3731:1: ( rule__Desde__SentenciasAssignment_5_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)||(LA29_0>=14 && LA29_0<=18)||(LA29_0>=44 && LA29_0<=46)||LA29_0==49||LA29_0==52||LA29_0==54) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3731:2: rule__Desde__SentenciasAssignment_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Desde__SentenciasAssignment_5_1_in_rule__Desde__Group_5__1__Impl7678);
            	    rule__Desde__SentenciasAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getDesdeAccess().getSentenciasAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__Group_5__1__Impl"


    // $ANTLR start "rule__Incremento__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3745:1: rule__Incremento__Group__0 : rule__Incremento__Group__0__Impl rule__Incremento__Group__1 ;
    public final void rule__Incremento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3749:1: ( rule__Incremento__Group__0__Impl rule__Incremento__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3750:2: rule__Incremento__Group__0__Impl rule__Incremento__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__Group__0__Impl_in_rule__Incremento__Group__07713);
            rule__Incremento__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Incremento__Group__1_in_rule__Incremento__Group__07716);
            rule__Incremento__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Incremento__Group__0"


    // $ANTLR start "rule__Incremento__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3757:1: rule__Incremento__Group__0__Impl : ( ( rule__Incremento__NombreAssignment_0 ) ) ;
    public final void rule__Incremento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3761:1: ( ( ( rule__Incremento__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3762:1: ( ( rule__Incremento__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3762:1: ( ( rule__Incremento__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3763:1: ( rule__Incremento__NombreAssignment_0 )
            {
             before(grammarAccess.getIncrementoAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3764:1: ( rule__Incremento__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3764:2: rule__Incremento__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__NombreAssignment_0_in_rule__Incremento__Group__0__Impl7743);
            rule__Incremento__NombreAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIncrementoAccess().getNombreAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Incremento__Group__0__Impl"


    // $ANTLR start "rule__Incremento__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3774:1: rule__Incremento__Group__1 : rule__Incremento__Group__1__Impl ;
    public final void rule__Incremento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3778:1: ( rule__Incremento__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3779:2: rule__Incremento__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__Group__1__Impl_in_rule__Incremento__Group__17773);
            rule__Incremento__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Incremento__Group__1"


    // $ANTLR start "rule__Incremento__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3785:1: rule__Incremento__Group__1__Impl : ( ( rule__Incremento__SsignoAssignment_1 ) ) ;
    public final void rule__Incremento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3789:1: ( ( ( rule__Incremento__SsignoAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3790:1: ( ( rule__Incremento__SsignoAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3790:1: ( ( rule__Incremento__SsignoAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3791:1: ( rule__Incremento__SsignoAssignment_1 )
            {
             before(grammarAccess.getIncrementoAccess().getSsignoAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3792:1: ( rule__Incremento__SsignoAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3792:2: rule__Incremento__SsignoAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__SsignoAssignment_1_in_rule__Incremento__Group__1__Impl7800);
            rule__Incremento__SsignoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIncrementoAccess().getSsignoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Incremento__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3806:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3810:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3811:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__07834);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__07837);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3818:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NombreAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3822:1: ( ( ( rule__Variable__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3823:1: ( ( rule__Variable__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3823:1: ( ( rule__Variable__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3824:1: ( rule__Variable__NombreAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3825:1: ( rule__Variable__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3825:2: rule__Variable__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__NombreAssignment_0_in_rule__Variable__Group__0__Impl7864);
            rule__Variable__NombreAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNombreAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3835:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3839:1: ( rule__Variable__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3840:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__17894);
            rule__Variable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3846:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__MatAssignment_1 )* ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:1: ( ( ( rule__Variable__MatAssignment_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3851:1: ( ( rule__Variable__MatAssignment_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3851:1: ( ( rule__Variable__MatAssignment_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3852:1: ( rule__Variable__MatAssignment_1 )*
            {
             before(grammarAccess.getVariableAccess().getMatAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3853:1: ( rule__Variable__MatAssignment_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_MATRIZ) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3853:2: rule__Variable__MatAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Variable__MatAssignment_1_in_rule__Variable__Group__1__Impl7921);
            	    rule__Variable__MatAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getMatAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__VariableID__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3867:1: rule__VariableID__Group__0 : rule__VariableID__Group__0__Impl rule__VariableID__Group__1 ;
    public final void rule__VariableID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3871:1: ( rule__VariableID__Group__0__Impl rule__VariableID__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3872:2: rule__VariableID__Group__0__Impl rule__VariableID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__0__Impl_in_rule__VariableID__Group__07956);
            rule__VariableID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__1_in_rule__VariableID__Group__07959);
            rule__VariableID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableID__Group__0"


    // $ANTLR start "rule__VariableID__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3879:1: rule__VariableID__Group__0__Impl : ( ( rule__VariableID__NombreAssignment_0 ) ) ;
    public final void rule__VariableID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3883:1: ( ( ( rule__VariableID__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3884:1: ( ( rule__VariableID__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3884:1: ( ( rule__VariableID__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3885:1: ( rule__VariableID__NombreAssignment_0 )
            {
             before(grammarAccess.getVariableIDAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3886:1: ( rule__VariableID__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3886:2: rule__VariableID__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__NombreAssignment_0_in_rule__VariableID__Group__0__Impl7986);
            rule__VariableID__NombreAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableIDAccess().getNombreAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableID__Group__0__Impl"


    // $ANTLR start "rule__VariableID__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3896:1: rule__VariableID__Group__1 : rule__VariableID__Group__1__Impl ;
    public final void rule__VariableID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3900:1: ( rule__VariableID__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3901:2: rule__VariableID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__1__Impl_in_rule__VariableID__Group__18016);
            rule__VariableID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableID__Group__1"


    // $ANTLR start "rule__VariableID__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3907:1: rule__VariableID__Group__1__Impl : ( ( rule__VariableID__MatAssignment_1 )* ) ;
    public final void rule__VariableID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3911:1: ( ( ( rule__VariableID__MatAssignment_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3912:1: ( ( rule__VariableID__MatAssignment_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3912:1: ( ( rule__VariableID__MatAssignment_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3913:1: ( rule__VariableID__MatAssignment_1 )*
            {
             before(grammarAccess.getVariableIDAccess().getMatAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3914:1: ( rule__VariableID__MatAssignment_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_MATRIZ) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3914:2: rule__VariableID__MatAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__VariableID__MatAssignment_1_in_rule__VariableID__Group__1__Impl8043);
            	    rule__VariableID__MatAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getVariableIDAccess().getMatAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableID__Group__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3928:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3932:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3933:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__08078);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__08081);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3940:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3944:1: ( ( ( '-' )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3945:1: ( ( '-' )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3945:1: ( ( '-' )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3946:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3947:1: ( '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==24) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3948:2: '-'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__EInt__Group__0__Impl8110); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3963:1: ( rule__EInt__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3964:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__18143);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3970:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3974:1: ( ( RULE_INT ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3975:1: ( RULE_INT )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3975:1: ( RULE_INT )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3976:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl8170); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3991:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3995:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3996:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__08203);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__08206);
            rule__EFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4003:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4007:1: ( ( ( '-' )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4008:1: ( ( '-' )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4008:1: ( ( '-' )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4009:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4010:1: ( '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==24) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4011:2: '-'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__EFloat__Group__0__Impl8235); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4022:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4026:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4027:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__18268);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__18271);
            rule__EFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4034:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4038:1: ( ( ( RULE_INT )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4039:1: ( ( RULE_INT )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4039:1: ( ( RULE_INT )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4040:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4041:1: ( RULE_INT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4041:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl8299); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4051:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4055:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4056:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__28330);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__28333);
            rule__EFloat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4063:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4067:1: ( ( '.' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4068:1: ( '.' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4068:1: ( '.' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4069:1: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__EFloat__Group__2__Impl8361); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4082:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4086:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4087:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__38392);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__38395);
            rule__EFloat__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4094:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4098:1: ( ( RULE_INT ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4099:1: ( RULE_INT )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4099:1: ( RULE_INT )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4100:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl8422); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4111:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4115:1: ( rule__EFloat__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4116:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__48451);
            rule__EFloat__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4122:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4126:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4127:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4127:1: ( ( rule__EFloat__Group_4__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4128:1: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4129:1: ( rule__EFloat__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=19 && LA35_0<=20)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4129:2: rule__EFloat__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl8478);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4149:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4153:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4154:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__08519);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__08522);
            rule__EFloat__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4161:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4165:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4166:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4166:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4167:1: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:1: ( rule__EFloat__Alternatives_4_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:2: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl8549);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4178:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4182:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4183:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__18579);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__18582);
            rule__EFloat__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4190:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4194:1: ( ( ( '-' )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4195:1: ( ( '-' )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4195:1: ( ( '-' )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4196:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4197:1: ( '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==24) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4198:2: '-'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__EFloat__Group_4__1__Impl8611); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4209:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4213:1: ( rule__EFloat__Group_4__2__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4214:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__28644);
            rule__EFloat__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4220:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4224:1: ( ( RULE_INT ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4225:1: ( RULE_INT )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4225:1: ( RULE_INT )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4226:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl8671); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__Operacion__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4243:1: rule__Operacion__Group__0 : rule__Operacion__Group__0__Impl rule__Operacion__Group__1 ;
    public final void rule__Operacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4247:1: ( rule__Operacion__Group__0__Impl rule__Operacion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4248:2: rule__Operacion__Group__0__Impl rule__Operacion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__0__Impl_in_rule__Operacion__Group__08706);
            rule__Operacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__1_in_rule__Operacion__Group__08709);
            rule__Operacion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__0"


    // $ANTLR start "rule__Operacion__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4255:1: rule__Operacion__Group__0__Impl : ( '(' ) ;
    public final void rule__Operacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4259:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4260:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4260:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4261:1: '('
            {
             before(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Operacion__Group__0__Impl8737); 
             after(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__0__Impl"


    // $ANTLR start "rule__Operacion__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4274:1: rule__Operacion__Group__1 : rule__Operacion__Group__1__Impl rule__Operacion__Group__2 ;
    public final void rule__Operacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4278:1: ( rule__Operacion__Group__1__Impl rule__Operacion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4279:2: rule__Operacion__Group__1__Impl rule__Operacion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__1__Impl_in_rule__Operacion__Group__18768);
            rule__Operacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__2_in_rule__Operacion__Group__18771);
            rule__Operacion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__1"


    // $ANTLR start "rule__Operacion__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4286:1: rule__Operacion__Group__1__Impl : ( ( rule__Operacion__Op_izqAssignment_1 ) ) ;
    public final void rule__Operacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4290:1: ( ( ( rule__Operacion__Op_izqAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4291:1: ( ( rule__Operacion__Op_izqAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4291:1: ( ( rule__Operacion__Op_izqAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4292:1: ( rule__Operacion__Op_izqAssignment_1 )
            {
             before(grammarAccess.getOperacionAccess().getOp_izqAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4293:1: ( rule__Operacion__Op_izqAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4293:2: rule__Operacion__Op_izqAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Op_izqAssignment_1_in_rule__Operacion__Group__1__Impl8798);
            rule__Operacion__Op_izqAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getOp_izqAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__1__Impl"


    // $ANTLR start "rule__Operacion__Group__2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4303:1: rule__Operacion__Group__2 : rule__Operacion__Group__2__Impl rule__Operacion__Group__3 ;
    public final void rule__Operacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4307:1: ( rule__Operacion__Group__2__Impl rule__Operacion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4308:2: rule__Operacion__Group__2__Impl rule__Operacion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__2__Impl_in_rule__Operacion__Group__28828);
            rule__Operacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__3_in_rule__Operacion__Group__28831);
            rule__Operacion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__2"


    // $ANTLR start "rule__Operacion__Group__2__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4315:1: rule__Operacion__Group__2__Impl : ( ( rule__Operacion__Signo_opAssignment_2 ) ) ;
    public final void rule__Operacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4319:1: ( ( ( rule__Operacion__Signo_opAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4320:1: ( ( rule__Operacion__Signo_opAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4320:1: ( ( rule__Operacion__Signo_opAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4321:1: ( rule__Operacion__Signo_opAssignment_2 )
            {
             before(grammarAccess.getOperacionAccess().getSigno_opAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4322:1: ( rule__Operacion__Signo_opAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4322:2: rule__Operacion__Signo_opAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Signo_opAssignment_2_in_rule__Operacion__Group__2__Impl8858);
            rule__Operacion__Signo_opAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getSigno_opAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__2__Impl"


    // $ANTLR start "rule__Operacion__Group__3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4332:1: rule__Operacion__Group__3 : rule__Operacion__Group__3__Impl rule__Operacion__Group__4 ;
    public final void rule__Operacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4336:1: ( rule__Operacion__Group__3__Impl rule__Operacion__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4337:2: rule__Operacion__Group__3__Impl rule__Operacion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__3__Impl_in_rule__Operacion__Group__38888);
            rule__Operacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__4_in_rule__Operacion__Group__38891);
            rule__Operacion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__3"


    // $ANTLR start "rule__Operacion__Group__3__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4344:1: rule__Operacion__Group__3__Impl : ( ( rule__Operacion__Op_derAssignment_3 ) ) ;
    public final void rule__Operacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4348:1: ( ( ( rule__Operacion__Op_derAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4349:1: ( ( rule__Operacion__Op_derAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4349:1: ( ( rule__Operacion__Op_derAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4350:1: ( rule__Operacion__Op_derAssignment_3 )
            {
             before(grammarAccess.getOperacionAccess().getOp_derAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4351:1: ( rule__Operacion__Op_derAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4351:2: rule__Operacion__Op_derAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Op_derAssignment_3_in_rule__Operacion__Group__3__Impl8918);
            rule__Operacion__Op_derAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getOp_derAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__3__Impl"


    // $ANTLR start "rule__Operacion__Group__4"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4361:1: rule__Operacion__Group__4 : rule__Operacion__Group__4__Impl ;
    public final void rule__Operacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4365:1: ( rule__Operacion__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4366:2: rule__Operacion__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__4__Impl_in_rule__Operacion__Group__48948);
            rule__Operacion__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__4"


    // $ANTLR start "rule__Operacion__Group__4__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4372:1: rule__Operacion__Group__4__Impl : ( ')' ) ;
    public final void rule__Operacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4376:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4377:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4377:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4378:1: ')'
            {
             before(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_4()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Operacion__Group__4__Impl8976); 
             after(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__4__Impl"


    // $ANTLR start "rule__Sino__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4401:1: rule__Sino__Group__0 : rule__Sino__Group__0__Impl rule__Sino__Group__1 ;
    public final void rule__Sino__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4405:1: ( rule__Sino__Group__0__Impl rule__Sino__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4406:2: rule__Sino__Group__0__Impl rule__Sino__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__0__Impl_in_rule__Sino__Group__09017);
            rule__Sino__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__1_in_rule__Sino__Group__09020);
            rule__Sino__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sino__Group__0"


    // $ANTLR start "rule__Sino__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4413:1: rule__Sino__Group__0__Impl : ( () ) ;
    public final void rule__Sino__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4417:1: ( ( () ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4418:1: ( () )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4418:1: ( () )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4419:1: ()
            {
             before(grammarAccess.getSinoAccess().getSinoAction_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4420:1: ()
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4422:1: 
            {
            }

             after(grammarAccess.getSinoAccess().getSinoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sino__Group__0__Impl"


    // $ANTLR start "rule__Sino__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4432:1: rule__Sino__Group__1 : rule__Sino__Group__1__Impl rule__Sino__Group__2 ;
    public final void rule__Sino__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4436:1: ( rule__Sino__Group__1__Impl rule__Sino__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4437:2: rule__Sino__Group__1__Impl rule__Sino__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__1__Impl_in_rule__Sino__Group__19078);
            rule__Sino__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__2_in_rule__Sino__Group__19081);
            rule__Sino__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sino__Group__1"


    // $ANTLR start "rule__Sino__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4444:1: rule__Sino__Group__1__Impl : ( 'sino' ) ;
    public final void rule__Sino__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4448:1: ( ( 'sino' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4449:1: ( 'sino' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4449:1: ( 'sino' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4450:1: 'sino'
            {
             before(grammarAccess.getSinoAccess().getSinoKeyword_1()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__Sino__Group__1__Impl9109); 
             after(grammarAccess.getSinoAccess().getSinoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sino__Group__1__Impl"


    // $ANTLR start "rule__Sino__Group__2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4463:1: rule__Sino__Group__2 : rule__Sino__Group__2__Impl ;
    public final void rule__Sino__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4467:1: ( rule__Sino__Group__2__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4468:2: rule__Sino__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__2__Impl_in_rule__Sino__Group__29140);
            rule__Sino__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sino__Group__2"


    // $ANTLR start "rule__Sino__Group__2__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4474:1: rule__Sino__Group__2__Impl : ( ( rule__Sino__Group_2__0 )? ) ;
    public final void rule__Sino__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4478:1: ( ( ( rule__Sino__Group_2__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4479:1: ( ( rule__Sino__Group_2__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4479:1: ( ( rule__Sino__Group_2__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4480:1: ( rule__Sino__Group_2__0 )?
            {
             before(grammarAccess.getSinoAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4481:1: ( rule__Sino__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)||(LA37_0>=14 && LA37_0<=18)||(LA37_0>=44 && LA37_0<=46)||LA37_0==49||LA37_0==52||LA37_0==54) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4481:2: rule__Sino__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__0_in_rule__Sino__Group__2__Impl9167);
                    rule__Sino__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSinoAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sino__Group__2__Impl"


    // $ANTLR start "rule__Sino__Group_2__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4497:1: rule__Sino__Group_2__0 : rule__Sino__Group_2__0__Impl rule__Sino__Group_2__1 ;
    public final void rule__Sino__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4501:1: ( rule__Sino__Group_2__0__Impl rule__Sino__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4502:2: rule__Sino__Group_2__0__Impl rule__Sino__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__0__Impl_in_rule__Sino__Group_2__09204);
            rule__Sino__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__1_in_rule__Sino__Group_2__09207);
            rule__Sino__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sino__Group_2__0"


    // $ANTLR start "rule__Sino__Group_2__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4509:1: rule__Sino__Group_2__0__Impl : ( ( rule__Sino__SentenciasAssignment_2_0 ) ) ;
    public final void rule__Sino__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4513:1: ( ( ( rule__Sino__SentenciasAssignment_2_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4514:1: ( ( rule__Sino__SentenciasAssignment_2_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4514:1: ( ( rule__Sino__SentenciasAssignment_2_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4515:1: ( rule__Sino__SentenciasAssignment_2_0 )
            {
             before(grammarAccess.getSinoAccess().getSentenciasAssignment_2_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4516:1: ( rule__Sino__SentenciasAssignment_2_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4516:2: rule__Sino__SentenciasAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__SentenciasAssignment_2_0_in_rule__Sino__Group_2__0__Impl9234);
            rule__Sino__SentenciasAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSinoAccess().getSentenciasAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sino__Group_2__0__Impl"


    // $ANTLR start "rule__Sino__Group_2__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4526:1: rule__Sino__Group_2__1 : rule__Sino__Group_2__1__Impl ;
    public final void rule__Sino__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4530:1: ( rule__Sino__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4531:2: rule__Sino__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__1__Impl_in_rule__Sino__Group_2__19264);
            rule__Sino__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sino__Group_2__1"


    // $ANTLR start "rule__Sino__Group_2__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4537:1: rule__Sino__Group_2__1__Impl : ( ( rule__Sino__SentenciasAssignment_2_1 )* ) ;
    public final void rule__Sino__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4541:1: ( ( ( rule__Sino__SentenciasAssignment_2_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4542:1: ( ( rule__Sino__SentenciasAssignment_2_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4542:1: ( ( rule__Sino__SentenciasAssignment_2_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4543:1: ( rule__Sino__SentenciasAssignment_2_1 )*
            {
             before(grammarAccess.getSinoAccess().getSentenciasAssignment_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4544:1: ( rule__Sino__SentenciasAssignment_2_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)||(LA38_0>=14 && LA38_0<=18)||(LA38_0>=44 && LA38_0<=46)||LA38_0==49||LA38_0==52||LA38_0==54) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4544:2: rule__Sino__SentenciasAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Sino__SentenciasAssignment_2_1_in_rule__Sino__Group_2__1__Impl9291);
            	    rule__Sino__SentenciasAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getSinoAccess().getSentenciasAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sino__Group_2__1__Impl"


    // $ANTLR start "rule__ParametroFuncion__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4558:1: rule__ParametroFuncion__Group__0 : rule__ParametroFuncion__Group__0__Impl rule__ParametroFuncion__Group__1 ;
    public final void rule__ParametroFuncion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4562:1: ( rule__ParametroFuncion__Group__0__Impl rule__ParametroFuncion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4563:2: rule__ParametroFuncion__Group__0__Impl rule__ParametroFuncion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__0__Impl_in_rule__ParametroFuncion__Group__09326);
            rule__ParametroFuncion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__1_in_rule__ParametroFuncion__Group__09329);
            rule__ParametroFuncion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametroFuncion__Group__0"


    // $ANTLR start "rule__ParametroFuncion__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4570:1: rule__ParametroFuncion__Group__0__Impl : ( ( rule__ParametroFuncion__TipoAssignment_0 ) ) ;
    public final void rule__ParametroFuncion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4574:1: ( ( ( rule__ParametroFuncion__TipoAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4575:1: ( ( rule__ParametroFuncion__TipoAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4575:1: ( ( rule__ParametroFuncion__TipoAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4576:1: ( rule__ParametroFuncion__TipoAssignment_0 )
            {
             before(grammarAccess.getParametroFuncionAccess().getTipoAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4577:1: ( rule__ParametroFuncion__TipoAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4577:2: rule__ParametroFuncion__TipoAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__TipoAssignment_0_in_rule__ParametroFuncion__Group__0__Impl9356);
            rule__ParametroFuncion__TipoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParametroFuncionAccess().getTipoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametroFuncion__Group__0__Impl"


    // $ANTLR start "rule__ParametroFuncion__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4587:1: rule__ParametroFuncion__Group__1 : rule__ParametroFuncion__Group__1__Impl rule__ParametroFuncion__Group__2 ;
    public final void rule__ParametroFuncion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4591:1: ( rule__ParametroFuncion__Group__1__Impl rule__ParametroFuncion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4592:2: rule__ParametroFuncion__Group__1__Impl rule__ParametroFuncion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__1__Impl_in_rule__ParametroFuncion__Group__19386);
            rule__ParametroFuncion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__2_in_rule__ParametroFuncion__Group__19389);
            rule__ParametroFuncion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametroFuncion__Group__1"


    // $ANTLR start "rule__ParametroFuncion__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4599:1: rule__ParametroFuncion__Group__1__Impl : ( ( rule__ParametroFuncion__PasoAssignment_1 ) ) ;
    public final void rule__ParametroFuncion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4603:1: ( ( ( rule__ParametroFuncion__PasoAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4604:1: ( ( rule__ParametroFuncion__PasoAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4604:1: ( ( rule__ParametroFuncion__PasoAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4605:1: ( rule__ParametroFuncion__PasoAssignment_1 )
            {
             before(grammarAccess.getParametroFuncionAccess().getPasoAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4606:1: ( rule__ParametroFuncion__PasoAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4606:2: rule__ParametroFuncion__PasoAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__PasoAssignment_1_in_rule__ParametroFuncion__Group__1__Impl9416);
            rule__ParametroFuncion__PasoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParametroFuncionAccess().getPasoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametroFuncion__Group__1__Impl"


    // $ANTLR start "rule__ParametroFuncion__Group__2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4616:1: rule__ParametroFuncion__Group__2 : rule__ParametroFuncion__Group__2__Impl ;
    public final void rule__ParametroFuncion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4620:1: ( rule__ParametroFuncion__Group__2__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4621:2: rule__ParametroFuncion__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__2__Impl_in_rule__ParametroFuncion__Group__29446);
            rule__ParametroFuncion__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametroFuncion__Group__2"


    // $ANTLR start "rule__ParametroFuncion__Group__2__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4627:1: rule__ParametroFuncion__Group__2__Impl : ( ( rule__ParametroFuncion__VariableAssignment_2 ) ) ;
    public final void rule__ParametroFuncion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4631:1: ( ( ( rule__ParametroFuncion__VariableAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4632:1: ( ( rule__ParametroFuncion__VariableAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4632:1: ( ( rule__ParametroFuncion__VariableAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4633:1: ( rule__ParametroFuncion__VariableAssignment_2 )
            {
             before(grammarAccess.getParametroFuncionAccess().getVariableAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4634:1: ( rule__ParametroFuncion__VariableAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4634:2: rule__ParametroFuncion__VariableAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__VariableAssignment_2_in_rule__ParametroFuncion__Group__2__Impl9473);
            rule__ParametroFuncion__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParametroFuncionAccess().getVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametroFuncion__Group__2__Impl"


    // $ANTLR start "rule__Funcion__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4650:1: rule__Funcion__Group__0 : rule__Funcion__Group__0__Impl rule__Funcion__Group__1 ;
    public final void rule__Funcion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4654:1: ( rule__Funcion__Group__0__Impl rule__Funcion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4655:2: rule__Funcion__Group__0__Impl rule__Funcion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__0__Impl_in_rule__Funcion__Group__09509);
            rule__Funcion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__1_in_rule__Funcion__Group__09512);
            rule__Funcion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__0"


    // $ANTLR start "rule__Funcion__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4662:1: rule__Funcion__Group__0__Impl : ( ( rule__Funcion__TipoAssignment_0 ) ) ;
    public final void rule__Funcion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4666:1: ( ( ( rule__Funcion__TipoAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4667:1: ( ( rule__Funcion__TipoAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4667:1: ( ( rule__Funcion__TipoAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4668:1: ( rule__Funcion__TipoAssignment_0 )
            {
             before(grammarAccess.getFuncionAccess().getTipoAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4669:1: ( rule__Funcion__TipoAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4669:2: rule__Funcion__TipoAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__TipoAssignment_0_in_rule__Funcion__Group__0__Impl9539);
            rule__Funcion__TipoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFuncionAccess().getTipoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__0__Impl"


    // $ANTLR start "rule__Funcion__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4679:1: rule__Funcion__Group__1 : rule__Funcion__Group__1__Impl rule__Funcion__Group__2 ;
    public final void rule__Funcion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4683:1: ( rule__Funcion__Group__1__Impl rule__Funcion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4684:2: rule__Funcion__Group__1__Impl rule__Funcion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__1__Impl_in_rule__Funcion__Group__19569);
            rule__Funcion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__2_in_rule__Funcion__Group__19572);
            rule__Funcion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__1"


    // $ANTLR start "rule__Funcion__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4691:1: rule__Funcion__Group__1__Impl : ( 'funcion' ) ;
    public final void rule__Funcion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4695:1: ( ( 'funcion' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4696:1: ( 'funcion' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4696:1: ( 'funcion' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4697:1: 'funcion'
            {
             before(grammarAccess.getFuncionAccess().getFuncionKeyword_1()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__Funcion__Group__1__Impl9600); 
             after(grammarAccess.getFuncionAccess().getFuncionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__1__Impl"


    // $ANTLR start "rule__Funcion__Group__2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4710:1: rule__Funcion__Group__2 : rule__Funcion__Group__2__Impl rule__Funcion__Group__3 ;
    public final void rule__Funcion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4714:1: ( rule__Funcion__Group__2__Impl rule__Funcion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4715:2: rule__Funcion__Group__2__Impl rule__Funcion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__2__Impl_in_rule__Funcion__Group__29631);
            rule__Funcion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__3_in_rule__Funcion__Group__29634);
            rule__Funcion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__2"


    // $ANTLR start "rule__Funcion__Group__2__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4722:1: rule__Funcion__Group__2__Impl : ( ( rule__Funcion__NombreAssignment_2 ) ) ;
    public final void rule__Funcion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4726:1: ( ( ( rule__Funcion__NombreAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4727:1: ( ( rule__Funcion__NombreAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4727:1: ( ( rule__Funcion__NombreAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4728:1: ( rule__Funcion__NombreAssignment_2 )
            {
             before(grammarAccess.getFuncionAccess().getNombreAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4729:1: ( rule__Funcion__NombreAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4729:2: rule__Funcion__NombreAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__NombreAssignment_2_in_rule__Funcion__Group__2__Impl9661);
            rule__Funcion__NombreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFuncionAccess().getNombreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__2__Impl"


    // $ANTLR start "rule__Funcion__Group__3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4739:1: rule__Funcion__Group__3 : rule__Funcion__Group__3__Impl rule__Funcion__Group__4 ;
    public final void rule__Funcion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4743:1: ( rule__Funcion__Group__3__Impl rule__Funcion__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4744:2: rule__Funcion__Group__3__Impl rule__Funcion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__3__Impl_in_rule__Funcion__Group__39691);
            rule__Funcion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__4_in_rule__Funcion__Group__39694);
            rule__Funcion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__3"


    // $ANTLR start "rule__Funcion__Group__3__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4751:1: rule__Funcion__Group__3__Impl : ( '(' ) ;
    public final void rule__Funcion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4755:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4756:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4756:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4757:1: '('
            {
             before(grammarAccess.getFuncionAccess().getLeftParenthesisKeyword_3()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Funcion__Group__3__Impl9722); 
             after(grammarAccess.getFuncionAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__3__Impl"


    // $ANTLR start "rule__Funcion__Group__4"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4770:1: rule__Funcion__Group__4 : rule__Funcion__Group__4__Impl rule__Funcion__Group__5 ;
    public final void rule__Funcion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4774:1: ( rule__Funcion__Group__4__Impl rule__Funcion__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4775:2: rule__Funcion__Group__4__Impl rule__Funcion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__4__Impl_in_rule__Funcion__Group__49753);
            rule__Funcion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__5_in_rule__Funcion__Group__49756);
            rule__Funcion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__4"


    // $ANTLR start "rule__Funcion__Group__4__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4782:1: rule__Funcion__Group__4__Impl : ( ( rule__Funcion__Group_4__0 )? ) ;
    public final void rule__Funcion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4786:1: ( ( ( rule__Funcion__Group_4__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4787:1: ( ( rule__Funcion__Group_4__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4787:1: ( ( rule__Funcion__Group_4__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4788:1: ( rule__Funcion__Group_4__0 )?
            {
             before(grammarAccess.getFuncionAccess().getGroup_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4789:1: ( rule__Funcion__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=14 && LA39_0<=18)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4789:2: rule__Funcion__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__0_in_rule__Funcion__Group__4__Impl9783);
                    rule__Funcion__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFuncionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__4__Impl"


    // $ANTLR start "rule__Funcion__Group__5"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4799:1: rule__Funcion__Group__5 : rule__Funcion__Group__5__Impl rule__Funcion__Group__6 ;
    public final void rule__Funcion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4803:1: ( rule__Funcion__Group__5__Impl rule__Funcion__Group__6 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4804:2: rule__Funcion__Group__5__Impl rule__Funcion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__5__Impl_in_rule__Funcion__Group__59814);
            rule__Funcion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__6_in_rule__Funcion__Group__59817);
            rule__Funcion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__5"


    // $ANTLR start "rule__Funcion__Group__5__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4811:1: rule__Funcion__Group__5__Impl : ( ')' ) ;
    public final void rule__Funcion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4815:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4816:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4816:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4817:1: ')'
            {
             before(grammarAccess.getFuncionAccess().getRightParenthesisKeyword_5()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Funcion__Group__5__Impl9845); 
             after(grammarAccess.getFuncionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__5__Impl"


    // $ANTLR start "rule__Funcion__Group__6"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4830:1: rule__Funcion__Group__6 : rule__Funcion__Group__6__Impl rule__Funcion__Group__7 ;
    public final void rule__Funcion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4834:1: ( rule__Funcion__Group__6__Impl rule__Funcion__Group__7 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4835:2: rule__Funcion__Group__6__Impl rule__Funcion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__6__Impl_in_rule__Funcion__Group__69876);
            rule__Funcion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__7_in_rule__Funcion__Group__69879);
            rule__Funcion__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__6"


    // $ANTLR start "rule__Funcion__Group__6__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4842:1: rule__Funcion__Group__6__Impl : ( 'inicio' ) ;
    public final void rule__Funcion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4846:1: ( ( 'inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4847:1: ( 'inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4847:1: ( 'inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4848:1: 'inicio'
            {
             before(grammarAccess.getFuncionAccess().getInicioKeyword_6()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Funcion__Group__6__Impl9907); 
             after(grammarAccess.getFuncionAccess().getInicioKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__6__Impl"


    // $ANTLR start "rule__Funcion__Group__7"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4861:1: rule__Funcion__Group__7 : rule__Funcion__Group__7__Impl rule__Funcion__Group__8 ;
    public final void rule__Funcion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4865:1: ( rule__Funcion__Group__7__Impl rule__Funcion__Group__8 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4866:2: rule__Funcion__Group__7__Impl rule__Funcion__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__7__Impl_in_rule__Funcion__Group__79938);
            rule__Funcion__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__8_in_rule__Funcion__Group__79941);
            rule__Funcion__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__7"


    // $ANTLR start "rule__Funcion__Group__7__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4873:1: rule__Funcion__Group__7__Impl : ( ( rule__Funcion__Group_7__0 )? ) ;
    public final void rule__Funcion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4877:1: ( ( ( rule__Funcion__Group_7__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4878:1: ( ( rule__Funcion__Group_7__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4878:1: ( ( rule__Funcion__Group_7__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4879:1: ( rule__Funcion__Group_7__0 )?
            {
             before(grammarAccess.getFuncionAccess().getGroup_7()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4880:1: ( rule__Funcion__Group_7__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)||(LA40_0>=14 && LA40_0<=18)||(LA40_0>=44 && LA40_0<=46)||LA40_0==49||LA40_0==52||LA40_0==54) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4880:2: rule__Funcion__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__0_in_rule__Funcion__Group__7__Impl9968);
                    rule__Funcion__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFuncionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__7__Impl"


    // $ANTLR start "rule__Funcion__Group__8"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4890:1: rule__Funcion__Group__8 : rule__Funcion__Group__8__Impl rule__Funcion__Group__9 ;
    public final void rule__Funcion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4894:1: ( rule__Funcion__Group__8__Impl rule__Funcion__Group__9 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4895:2: rule__Funcion__Group__8__Impl rule__Funcion__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__8__Impl_in_rule__Funcion__Group__89999);
            rule__Funcion__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__9_in_rule__Funcion__Group__810002);
            rule__Funcion__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__8"


    // $ANTLR start "rule__Funcion__Group__8__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4902:1: rule__Funcion__Group__8__Impl : ( 'devolver' ) ;
    public final void rule__Funcion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4906:1: ( ( 'devolver' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4907:1: ( 'devolver' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4907:1: ( 'devolver' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4908:1: 'devolver'
            {
             before(grammarAccess.getFuncionAccess().getDevolverKeyword_8()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__Funcion__Group__8__Impl10030); 
             after(grammarAccess.getFuncionAccess().getDevolverKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__8__Impl"


    // $ANTLR start "rule__Funcion__Group__9"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4921:1: rule__Funcion__Group__9 : rule__Funcion__Group__9__Impl rule__Funcion__Group__10 ;
    public final void rule__Funcion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4925:1: ( rule__Funcion__Group__9__Impl rule__Funcion__Group__10 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4926:2: rule__Funcion__Group__9__Impl rule__Funcion__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__9__Impl_in_rule__Funcion__Group__910061);
            rule__Funcion__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__10_in_rule__Funcion__Group__910064);
            rule__Funcion__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__9"


    // $ANTLR start "rule__Funcion__Group__9__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4933:1: rule__Funcion__Group__9__Impl : ( ( rule__Funcion__DevuelveAssignment_9 ) ) ;
    public final void rule__Funcion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4937:1: ( ( ( rule__Funcion__DevuelveAssignment_9 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4938:1: ( ( rule__Funcion__DevuelveAssignment_9 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4938:1: ( ( rule__Funcion__DevuelveAssignment_9 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4939:1: ( rule__Funcion__DevuelveAssignment_9 )
            {
             before(grammarAccess.getFuncionAccess().getDevuelveAssignment_9()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4940:1: ( rule__Funcion__DevuelveAssignment_9 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4940:2: rule__Funcion__DevuelveAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__DevuelveAssignment_9_in_rule__Funcion__Group__9__Impl10091);
            rule__Funcion__DevuelveAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFuncionAccess().getDevuelveAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__9__Impl"


    // $ANTLR start "rule__Funcion__Group__10"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4950:1: rule__Funcion__Group__10 : rule__Funcion__Group__10__Impl ;
    public final void rule__Funcion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4954:1: ( rule__Funcion__Group__10__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4955:2: rule__Funcion__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__10__Impl_in_rule__Funcion__Group__1010121);
            rule__Funcion__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__10"


    // $ANTLR start "rule__Funcion__Group__10__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4961:1: rule__Funcion__Group__10__Impl : ( 'fin_funcion' ) ;
    public final void rule__Funcion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4965:1: ( ( 'fin_funcion' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4966:1: ( 'fin_funcion' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4966:1: ( 'fin_funcion' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4967:1: 'fin_funcion'
            {
             before(grammarAccess.getFuncionAccess().getFin_funcionKeyword_10()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__Funcion__Group__10__Impl10149); 
             after(grammarAccess.getFuncionAccess().getFin_funcionKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__10__Impl"


    // $ANTLR start "rule__Funcion__Group_4__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5002:1: rule__Funcion__Group_4__0 : rule__Funcion__Group_4__0__Impl rule__Funcion__Group_4__1 ;
    public final void rule__Funcion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5006:1: ( rule__Funcion__Group_4__0__Impl rule__Funcion__Group_4__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5007:2: rule__Funcion__Group_4__0__Impl rule__Funcion__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__0__Impl_in_rule__Funcion__Group_4__010202);
            rule__Funcion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__1_in_rule__Funcion__Group_4__010205);
            rule__Funcion__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group_4__0"


    // $ANTLR start "rule__Funcion__Group_4__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5014:1: rule__Funcion__Group_4__0__Impl : ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) ) ;
    public final void rule__Funcion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5018:1: ( ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5019:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5019:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5020:1: ( rule__Funcion__ParametrofuncionAssignment_4_0 )
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionAssignment_4_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5021:1: ( rule__Funcion__ParametrofuncionAssignment_4_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5021:2: rule__Funcion__ParametrofuncionAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_0_in_rule__Funcion__Group_4__0__Impl10232);
            rule__Funcion__ParametrofuncionAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getFuncionAccess().getParametrofuncionAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group_4__0__Impl"


    // $ANTLR start "rule__Funcion__Group_4__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5031:1: rule__Funcion__Group_4__1 : rule__Funcion__Group_4__1__Impl ;
    public final void rule__Funcion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5035:1: ( rule__Funcion__Group_4__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5036:2: rule__Funcion__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__1__Impl_in_rule__Funcion__Group_4__110262);
            rule__Funcion__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group_4__1"


    // $ANTLR start "rule__Funcion__Group_4__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5042:1: rule__Funcion__Group_4__1__Impl : ( ( rule__Funcion__Group_4_1__0 )* ) ;
    public final void rule__Funcion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5046:1: ( ( ( rule__Funcion__Group_4_1__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5047:1: ( ( rule__Funcion__Group_4_1__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5047:1: ( ( rule__Funcion__Group_4_1__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5048:1: ( rule__Funcion__Group_4_1__0 )*
            {
             before(grammarAccess.getFuncionAccess().getGroup_4_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5049:1: ( rule__Funcion__Group_4_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==40) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5049:2: rule__Funcion__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__0_in_rule__Funcion__Group_4__1__Impl10289);
            	    rule__Funcion__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getFuncionAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group_4__1__Impl"


    // $ANTLR start "rule__Funcion__Group_4_1__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5063:1: rule__Funcion__Group_4_1__0 : rule__Funcion__Group_4_1__0__Impl rule__Funcion__Group_4_1__1 ;
    public final void rule__Funcion__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5067:1: ( rule__Funcion__Group_4_1__0__Impl rule__Funcion__Group_4_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5068:2: rule__Funcion__Group_4_1__0__Impl rule__Funcion__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__0__Impl_in_rule__Funcion__Group_4_1__010324);
            rule__Funcion__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__1_in_rule__Funcion__Group_4_1__010327);
            rule__Funcion__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group_4_1__0"


    // $ANTLR start "rule__Funcion__Group_4_1__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5075:1: rule__Funcion__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Funcion__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5079:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5080:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5080:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5081:1: ','
            {
             before(grammarAccess.getFuncionAccess().getCommaKeyword_4_1_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Funcion__Group_4_1__0__Impl10355); 
             after(grammarAccess.getFuncionAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group_4_1__0__Impl"


    // $ANTLR start "rule__Funcion__Group_4_1__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5094:1: rule__Funcion__Group_4_1__1 : rule__Funcion__Group_4_1__1__Impl ;
    public final void rule__Funcion__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5098:1: ( rule__Funcion__Group_4_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5099:2: rule__Funcion__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__1__Impl_in_rule__Funcion__Group_4_1__110386);
            rule__Funcion__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group_4_1__1"


    // $ANTLR start "rule__Funcion__Group_4_1__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5105:1: rule__Funcion__Group_4_1__1__Impl : ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) ) ;
    public final void rule__Funcion__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5109:1: ( ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5110:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5110:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5111:1: ( rule__Funcion__ParametrofuncionAssignment_4_1_1 )
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionAssignment_4_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5112:1: ( rule__Funcion__ParametrofuncionAssignment_4_1_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5112:2: rule__Funcion__ParametrofuncionAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_1_1_in_rule__Funcion__Group_4_1__1__Impl10413);
            rule__Funcion__ParametrofuncionAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFuncionAccess().getParametrofuncionAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group_4_1__1__Impl"


    // $ANTLR start "rule__Funcion__Group_7__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5126:1: rule__Funcion__Group_7__0 : rule__Funcion__Group_7__0__Impl rule__Funcion__Group_7__1 ;
    public final void rule__Funcion__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5130:1: ( rule__Funcion__Group_7__0__Impl rule__Funcion__Group_7__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5131:2: rule__Funcion__Group_7__0__Impl rule__Funcion__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__0__Impl_in_rule__Funcion__Group_7__010447);
            rule__Funcion__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__1_in_rule__Funcion__Group_7__010450);
            rule__Funcion__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group_7__0"


    // $ANTLR start "rule__Funcion__Group_7__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5138:1: rule__Funcion__Group_7__0__Impl : ( ( rule__Funcion__SentenciasAssignment_7_0 ) ) ;
    public final void rule__Funcion__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5142:1: ( ( ( rule__Funcion__SentenciasAssignment_7_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5143:1: ( ( rule__Funcion__SentenciasAssignment_7_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5143:1: ( ( rule__Funcion__SentenciasAssignment_7_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5144:1: ( rule__Funcion__SentenciasAssignment_7_0 )
            {
             before(grammarAccess.getFuncionAccess().getSentenciasAssignment_7_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5145:1: ( rule__Funcion__SentenciasAssignment_7_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5145:2: rule__Funcion__SentenciasAssignment_7_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__SentenciasAssignment_7_0_in_rule__Funcion__Group_7__0__Impl10477);
            rule__Funcion__SentenciasAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getFuncionAccess().getSentenciasAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group_7__0__Impl"


    // $ANTLR start "rule__Funcion__Group_7__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5155:1: rule__Funcion__Group_7__1 : rule__Funcion__Group_7__1__Impl ;
    public final void rule__Funcion__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5159:1: ( rule__Funcion__Group_7__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5160:2: rule__Funcion__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__1__Impl_in_rule__Funcion__Group_7__110507);
            rule__Funcion__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group_7__1"


    // $ANTLR start "rule__Funcion__Group_7__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5166:1: rule__Funcion__Group_7__1__Impl : ( ( rule__Funcion__SentenciasAssignment_7_1 )* ) ;
    public final void rule__Funcion__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5170:1: ( ( ( rule__Funcion__SentenciasAssignment_7_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5171:1: ( ( rule__Funcion__SentenciasAssignment_7_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5171:1: ( ( rule__Funcion__SentenciasAssignment_7_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5172:1: ( rule__Funcion__SentenciasAssignment_7_1 )*
            {
             before(grammarAccess.getFuncionAccess().getSentenciasAssignment_7_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5173:1: ( rule__Funcion__SentenciasAssignment_7_1 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_ID)||(LA42_0>=14 && LA42_0<=18)||(LA42_0>=44 && LA42_0<=46)||LA42_0==49||LA42_0==52||LA42_0==54) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5173:2: rule__Funcion__SentenciasAssignment_7_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Funcion__SentenciasAssignment_7_1_in_rule__Funcion__Group_7__1__Impl10534);
            	    rule__Funcion__SentenciasAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getFuncionAccess().getSentenciasAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group_7__1__Impl"


    // $ANTLR start "rule__Procedimiento__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5187:1: rule__Procedimiento__Group__0 : rule__Procedimiento__Group__0__Impl rule__Procedimiento__Group__1 ;
    public final void rule__Procedimiento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5191:1: ( rule__Procedimiento__Group__0__Impl rule__Procedimiento__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5192:2: rule__Procedimiento__Group__0__Impl rule__Procedimiento__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__0__Impl_in_rule__Procedimiento__Group__010569);
            rule__Procedimiento__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__1_in_rule__Procedimiento__Group__010572);
            rule__Procedimiento__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group__0"


    // $ANTLR start "rule__Procedimiento__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5199:1: rule__Procedimiento__Group__0__Impl : ( 'procedimiento' ) ;
    public final void rule__Procedimiento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5203:1: ( ( 'procedimiento' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5204:1: ( 'procedimiento' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5204:1: ( 'procedimiento' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5205:1: 'procedimiento'
            {
             before(grammarAccess.getProcedimientoAccess().getProcedimientoKeyword_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__Procedimiento__Group__0__Impl10600); 
             after(grammarAccess.getProcedimientoAccess().getProcedimientoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group__0__Impl"


    // $ANTLR start "rule__Procedimiento__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5218:1: rule__Procedimiento__Group__1 : rule__Procedimiento__Group__1__Impl rule__Procedimiento__Group__2 ;
    public final void rule__Procedimiento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5222:1: ( rule__Procedimiento__Group__1__Impl rule__Procedimiento__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5223:2: rule__Procedimiento__Group__1__Impl rule__Procedimiento__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__1__Impl_in_rule__Procedimiento__Group__110631);
            rule__Procedimiento__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__2_in_rule__Procedimiento__Group__110634);
            rule__Procedimiento__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group__1"


    // $ANTLR start "rule__Procedimiento__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5230:1: rule__Procedimiento__Group__1__Impl : ( ( rule__Procedimiento__NombreAssignment_1 ) ) ;
    public final void rule__Procedimiento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5234:1: ( ( ( rule__Procedimiento__NombreAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5235:1: ( ( rule__Procedimiento__NombreAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5235:1: ( ( rule__Procedimiento__NombreAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5236:1: ( rule__Procedimiento__NombreAssignment_1 )
            {
             before(grammarAccess.getProcedimientoAccess().getNombreAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5237:1: ( rule__Procedimiento__NombreAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5237:2: rule__Procedimiento__NombreAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__NombreAssignment_1_in_rule__Procedimiento__Group__1__Impl10661);
            rule__Procedimiento__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedimientoAccess().getNombreAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group__1__Impl"


    // $ANTLR start "rule__Procedimiento__Group__2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5247:1: rule__Procedimiento__Group__2 : rule__Procedimiento__Group__2__Impl rule__Procedimiento__Group__3 ;
    public final void rule__Procedimiento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5251:1: ( rule__Procedimiento__Group__2__Impl rule__Procedimiento__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5252:2: rule__Procedimiento__Group__2__Impl rule__Procedimiento__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__2__Impl_in_rule__Procedimiento__Group__210691);
            rule__Procedimiento__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__3_in_rule__Procedimiento__Group__210694);
            rule__Procedimiento__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group__2"


    // $ANTLR start "rule__Procedimiento__Group__2__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5259:1: rule__Procedimiento__Group__2__Impl : ( '(' ) ;
    public final void rule__Procedimiento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5263:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5264:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5264:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5265:1: '('
            {
             before(grammarAccess.getProcedimientoAccess().getLeftParenthesisKeyword_2()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Procedimiento__Group__2__Impl10722); 
             after(grammarAccess.getProcedimientoAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group__2__Impl"


    // $ANTLR start "rule__Procedimiento__Group__3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5278:1: rule__Procedimiento__Group__3 : rule__Procedimiento__Group__3__Impl rule__Procedimiento__Group__4 ;
    public final void rule__Procedimiento__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5282:1: ( rule__Procedimiento__Group__3__Impl rule__Procedimiento__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5283:2: rule__Procedimiento__Group__3__Impl rule__Procedimiento__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__3__Impl_in_rule__Procedimiento__Group__310753);
            rule__Procedimiento__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__4_in_rule__Procedimiento__Group__310756);
            rule__Procedimiento__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group__3"


    // $ANTLR start "rule__Procedimiento__Group__3__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5290:1: rule__Procedimiento__Group__3__Impl : ( ( rule__Procedimiento__Group_3__0 )? ) ;
    public final void rule__Procedimiento__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5294:1: ( ( ( rule__Procedimiento__Group_3__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5295:1: ( ( rule__Procedimiento__Group_3__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5295:1: ( ( rule__Procedimiento__Group_3__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5296:1: ( rule__Procedimiento__Group_3__0 )?
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5297:1: ( rule__Procedimiento__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=14 && LA43_0<=18)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5297:2: rule__Procedimiento__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__0_in_rule__Procedimiento__Group__3__Impl10783);
                    rule__Procedimiento__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcedimientoAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group__3__Impl"


    // $ANTLR start "rule__Procedimiento__Group__4"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5307:1: rule__Procedimiento__Group__4 : rule__Procedimiento__Group__4__Impl rule__Procedimiento__Group__5 ;
    public final void rule__Procedimiento__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5311:1: ( rule__Procedimiento__Group__4__Impl rule__Procedimiento__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5312:2: rule__Procedimiento__Group__4__Impl rule__Procedimiento__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__4__Impl_in_rule__Procedimiento__Group__410814);
            rule__Procedimiento__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__5_in_rule__Procedimiento__Group__410817);
            rule__Procedimiento__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group__4"


    // $ANTLR start "rule__Procedimiento__Group__4__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5319:1: rule__Procedimiento__Group__4__Impl : ( ')' ) ;
    public final void rule__Procedimiento__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5323:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5324:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5324:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5325:1: ')'
            {
             before(grammarAccess.getProcedimientoAccess().getRightParenthesisKeyword_4()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Procedimiento__Group__4__Impl10845); 
             after(grammarAccess.getProcedimientoAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group__4__Impl"


    // $ANTLR start "rule__Procedimiento__Group__5"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5338:1: rule__Procedimiento__Group__5 : rule__Procedimiento__Group__5__Impl rule__Procedimiento__Group__6 ;
    public final void rule__Procedimiento__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5342:1: ( rule__Procedimiento__Group__5__Impl rule__Procedimiento__Group__6 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5343:2: rule__Procedimiento__Group__5__Impl rule__Procedimiento__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__5__Impl_in_rule__Procedimiento__Group__510876);
            rule__Procedimiento__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__6_in_rule__Procedimiento__Group__510879);
            rule__Procedimiento__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group__5"


    // $ANTLR start "rule__Procedimiento__Group__5__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5350:1: rule__Procedimiento__Group__5__Impl : ( ( rule__Procedimiento__Group_5__0 )? ) ;
    public final void rule__Procedimiento__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5354:1: ( ( ( rule__Procedimiento__Group_5__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5355:1: ( ( rule__Procedimiento__Group_5__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5355:1: ( ( rule__Procedimiento__Group_5__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5356:1: ( rule__Procedimiento__Group_5__0 )?
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_5()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5357:1: ( rule__Procedimiento__Group_5__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_ID)||(LA44_0>=14 && LA44_0<=18)||(LA44_0>=44 && LA44_0<=46)||LA44_0==49||LA44_0==52||LA44_0==54) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5357:2: rule__Procedimiento__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_5__0_in_rule__Procedimiento__Group__5__Impl10906);
                    rule__Procedimiento__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcedimientoAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group__5__Impl"


    // $ANTLR start "rule__Procedimiento__Group__6"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5367:1: rule__Procedimiento__Group__6 : rule__Procedimiento__Group__6__Impl ;
    public final void rule__Procedimiento__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5371:1: ( rule__Procedimiento__Group__6__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5372:2: rule__Procedimiento__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__6__Impl_in_rule__Procedimiento__Group__610937);
            rule__Procedimiento__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group__6"


    // $ANTLR start "rule__Procedimiento__Group__6__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5378:1: rule__Procedimiento__Group__6__Impl : ( 'fin procedimiento' ) ;
    public final void rule__Procedimiento__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5382:1: ( ( 'fin procedimiento' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5383:1: ( 'fin procedimiento' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5383:1: ( 'fin procedimiento' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5384:1: 'fin procedimiento'
            {
             before(grammarAccess.getProcedimientoAccess().getFinProcedimientoKeyword_6()); 
            match(input,63,FollowSets000.FOLLOW_63_in_rule__Procedimiento__Group__6__Impl10965); 
             after(grammarAccess.getProcedimientoAccess().getFinProcedimientoKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group__6__Impl"


    // $ANTLR start "rule__Procedimiento__Group_3__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5411:1: rule__Procedimiento__Group_3__0 : rule__Procedimiento__Group_3__0__Impl rule__Procedimiento__Group_3__1 ;
    public final void rule__Procedimiento__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5415:1: ( rule__Procedimiento__Group_3__0__Impl rule__Procedimiento__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5416:2: rule__Procedimiento__Group_3__0__Impl rule__Procedimiento__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__0__Impl_in_rule__Procedimiento__Group_3__011010);
            rule__Procedimiento__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__1_in_rule__Procedimiento__Group_3__011013);
            rule__Procedimiento__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group_3__0"


    // $ANTLR start "rule__Procedimiento__Group_3__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5423:1: rule__Procedimiento__Group_3__0__Impl : ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) ) ;
    public final void rule__Procedimiento__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5427:1: ( ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5428:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5428:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5429:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_0 )
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionAssignment_3_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5430:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5430:2: rule__Procedimiento__ParametrofuncionAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_0_in_rule__Procedimiento__Group_3__0__Impl11040);
            rule__Procedimiento__ParametrofuncionAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getProcedimientoAccess().getParametrofuncionAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group_3__0__Impl"


    // $ANTLR start "rule__Procedimiento__Group_3__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5440:1: rule__Procedimiento__Group_3__1 : rule__Procedimiento__Group_3__1__Impl ;
    public final void rule__Procedimiento__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5444:1: ( rule__Procedimiento__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5445:2: rule__Procedimiento__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__1__Impl_in_rule__Procedimiento__Group_3__111070);
            rule__Procedimiento__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group_3__1"


    // $ANTLR start "rule__Procedimiento__Group_3__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5451:1: rule__Procedimiento__Group_3__1__Impl : ( ( rule__Procedimiento__Group_3_1__0 )* ) ;
    public final void rule__Procedimiento__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5455:1: ( ( ( rule__Procedimiento__Group_3_1__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5456:1: ( ( rule__Procedimiento__Group_3_1__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5456:1: ( ( rule__Procedimiento__Group_3_1__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5457:1: ( rule__Procedimiento__Group_3_1__0 )*
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5458:1: ( rule__Procedimiento__Group_3_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==40) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5458:2: rule__Procedimiento__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__0_in_rule__Procedimiento__Group_3__1__Impl11097);
            	    rule__Procedimiento__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getProcedimientoAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group_3__1__Impl"


    // $ANTLR start "rule__Procedimiento__Group_3_1__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5472:1: rule__Procedimiento__Group_3_1__0 : rule__Procedimiento__Group_3_1__0__Impl rule__Procedimiento__Group_3_1__1 ;
    public final void rule__Procedimiento__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5476:1: ( rule__Procedimiento__Group_3_1__0__Impl rule__Procedimiento__Group_3_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5477:2: rule__Procedimiento__Group_3_1__0__Impl rule__Procedimiento__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__0__Impl_in_rule__Procedimiento__Group_3_1__011132);
            rule__Procedimiento__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__1_in_rule__Procedimiento__Group_3_1__011135);
            rule__Procedimiento__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group_3_1__0"


    // $ANTLR start "rule__Procedimiento__Group_3_1__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5484:1: rule__Procedimiento__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Procedimiento__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5488:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5489:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5489:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5490:1: ','
            {
             before(grammarAccess.getProcedimientoAccess().getCommaKeyword_3_1_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Procedimiento__Group_3_1__0__Impl11163); 
             after(grammarAccess.getProcedimientoAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group_3_1__0__Impl"


    // $ANTLR start "rule__Procedimiento__Group_3_1__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5503:1: rule__Procedimiento__Group_3_1__1 : rule__Procedimiento__Group_3_1__1__Impl ;
    public final void rule__Procedimiento__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5507:1: ( rule__Procedimiento__Group_3_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5508:2: rule__Procedimiento__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__1__Impl_in_rule__Procedimiento__Group_3_1__111194);
            rule__Procedimiento__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group_3_1__1"


    // $ANTLR start "rule__Procedimiento__Group_3_1__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5514:1: rule__Procedimiento__Group_3_1__1__Impl : ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) ) ;
    public final void rule__Procedimiento__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5518:1: ( ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5519:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5519:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5520:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 )
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionAssignment_3_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5521:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5521:2: rule__Procedimiento__ParametrofuncionAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_1_1_in_rule__Procedimiento__Group_3_1__1__Impl11221);
            rule__Procedimiento__ParametrofuncionAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedimientoAccess().getParametrofuncionAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group_3_1__1__Impl"


    // $ANTLR start "rule__Procedimiento__Group_5__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5535:1: rule__Procedimiento__Group_5__0 : rule__Procedimiento__Group_5__0__Impl rule__Procedimiento__Group_5__1 ;
    public final void rule__Procedimiento__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5539:1: ( rule__Procedimiento__Group_5__0__Impl rule__Procedimiento__Group_5__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5540:2: rule__Procedimiento__Group_5__0__Impl rule__Procedimiento__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_5__0__Impl_in_rule__Procedimiento__Group_5__011255);
            rule__Procedimiento__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_5__1_in_rule__Procedimiento__Group_5__011258);
            rule__Procedimiento__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group_5__0"


    // $ANTLR start "rule__Procedimiento__Group_5__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5547:1: rule__Procedimiento__Group_5__0__Impl : ( ( rule__Procedimiento__SentenciasAssignment_5_0 ) ) ;
    public final void rule__Procedimiento__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5551:1: ( ( ( rule__Procedimiento__SentenciasAssignment_5_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5552:1: ( ( rule__Procedimiento__SentenciasAssignment_5_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5552:1: ( ( rule__Procedimiento__SentenciasAssignment_5_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5553:1: ( rule__Procedimiento__SentenciasAssignment_5_0 )
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasAssignment_5_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5554:1: ( rule__Procedimiento__SentenciasAssignment_5_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5554:2: rule__Procedimiento__SentenciasAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__SentenciasAssignment_5_0_in_rule__Procedimiento__Group_5__0__Impl11285);
            rule__Procedimiento__SentenciasAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getProcedimientoAccess().getSentenciasAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group_5__0__Impl"


    // $ANTLR start "rule__Procedimiento__Group_5__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5564:1: rule__Procedimiento__Group_5__1 : rule__Procedimiento__Group_5__1__Impl ;
    public final void rule__Procedimiento__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5568:1: ( rule__Procedimiento__Group_5__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5569:2: rule__Procedimiento__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_5__1__Impl_in_rule__Procedimiento__Group_5__111315);
            rule__Procedimiento__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group_5__1"


    // $ANTLR start "rule__Procedimiento__Group_5__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5575:1: rule__Procedimiento__Group_5__1__Impl : ( ( rule__Procedimiento__SentenciasAssignment_5_1 )* ) ;
    public final void rule__Procedimiento__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5579:1: ( ( ( rule__Procedimiento__SentenciasAssignment_5_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5580:1: ( ( rule__Procedimiento__SentenciasAssignment_5_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5580:1: ( ( rule__Procedimiento__SentenciasAssignment_5_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5581:1: ( rule__Procedimiento__SentenciasAssignment_5_1 )*
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasAssignment_5_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5582:1: ( rule__Procedimiento__SentenciasAssignment_5_1 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_STRING && LA46_0<=RULE_ID)||(LA46_0>=14 && LA46_0<=18)||(LA46_0>=44 && LA46_0<=46)||LA46_0==49||LA46_0==52||LA46_0==54) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5582:2: rule__Procedimiento__SentenciasAssignment_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__SentenciasAssignment_5_1_in_rule__Procedimiento__Group_5__1__Impl11342);
            	    rule__Procedimiento__SentenciasAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getProcedimientoAccess().getSentenciasAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__Group_5__1__Impl"


    // $ANTLR start "rule__Codigo__FuncionAssignment_0_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5597:1: rule__Codigo__FuncionAssignment_0_0 : ( ruleSubproceso ) ;
    public final void rule__Codigo__FuncionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5601:1: ( ( ruleSubproceso ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5602:1: ( ruleSubproceso )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5602:1: ( ruleSubproceso )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5603:1: ruleSubproceso
            {
             before(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_0_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_011382);
            ruleSubproceso();

            state._fsp--;

             after(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codigo__FuncionAssignment_0_0"


    // $ANTLR start "rule__Codigo__FuncionAssignment_0_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5612:1: rule__Codigo__FuncionAssignment_0_1 : ( ruleSubproceso ) ;
    public final void rule__Codigo__FuncionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5616:1: ( ( ruleSubproceso ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5617:1: ( ruleSubproceso )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5617:1: ( ruleSubproceso )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5618:1: ruleSubproceso
            {
             before(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_111413);
            ruleSubproceso();

            state._fsp--;

             after(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codigo__FuncionAssignment_0_1"


    // $ANTLR start "rule__Codigo__TieneAssignment_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5627:1: rule__Codigo__TieneAssignment_1 : ( ruleInicio ) ;
    public final void rule__Codigo__TieneAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5631:1: ( ( ruleInicio ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5632:1: ( ruleInicio )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5632:1: ( ruleInicio )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5633:1: ruleInicio
            {
             before(grammarAccess.getCodigoAccess().getTieneInicioParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_rule__Codigo__TieneAssignment_111444);
            ruleInicio();

            state._fsp--;

             after(grammarAccess.getCodigoAccess().getTieneInicioParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codigo__TieneAssignment_1"


    // $ANTLR start "rule__Caracter__ContenidoAssignment"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5642:1: rule__Caracter__ContenidoAssignment : ( RULE_CAR ) ;
    public final void rule__Caracter__ContenidoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5646:1: ( ( RULE_CAR ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5647:1: ( RULE_CAR )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5647:1: ( RULE_CAR )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5648:1: RULE_CAR
            {
             before(grammarAccess.getCaracterAccess().getContenidoCARTerminalRuleCall_0()); 
            match(input,RULE_CAR,FollowSets000.FOLLOW_RULE_CAR_in_rule__Caracter__ContenidoAssignment11475); 
             after(grammarAccess.getCaracterAccess().getContenidoCARTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caracter__ContenidoAssignment"


    // $ANTLR start "rule__Inicio__TieneAssignment_2_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5657:1: rule__Inicio__TieneAssignment_2_0 : ( ruleSentencias ) ;
    public final void rule__Inicio__TieneAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5661:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5662:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5662:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5663:1: ruleSentencias
            {
             before(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_2_011506);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inicio__TieneAssignment_2_0"


    // $ANTLR start "rule__Inicio__TieneAssignment_2_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5672:1: rule__Inicio__TieneAssignment_2_1 : ( ruleSentencias ) ;
    public final void rule__Inicio__TieneAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5676:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5677:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5677:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5678:1: ruleSentencias
            {
             before(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_2_111537);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inicio__TieneAssignment_2_1"


    // $ANTLR start "rule__DeclaracionVariable__TipoAssignment_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5687:1: rule__DeclaracionVariable__TipoAssignment_0 : ( ruleTipoVariable ) ;
    public final void rule__DeclaracionVariable__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5691:1: ( ( ruleTipoVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5692:1: ( ruleTipoVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5692:1: ( ruleTipoVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5693:1: ruleTipoVariable
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_rule__DeclaracionVariable__TipoAssignment_011568);
            ruleTipoVariable();

            state._fsp--;

             after(grammarAccess.getDeclaracionVariableAccess().getTipoTipoVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__TipoAssignment_0"


    // $ANTLR start "rule__DeclaracionVariable__TieneIDsAssignment_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5702:1: rule__DeclaracionVariable__TieneIDsAssignment_1 : ( ruleVariable ) ;
    public final void rule__DeclaracionVariable__TieneIDsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5706:1: ( ( ruleVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5707:1: ( ruleVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5707:1: ( ruleVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5708:1: ruleVariable
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsVariableParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_111599);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getDeclaracionVariableAccess().getTieneIDsVariableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__TieneIDsAssignment_1"


    // $ANTLR start "rule__DeclaracionVariable__TieneIDsAssignment_2_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5717:1: rule__DeclaracionVariable__TieneIDsAssignment_2_1 : ( ruleVariable ) ;
    public final void rule__DeclaracionVariable__TieneIDsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5721:1: ( ( ruleVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5722:1: ( ruleVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5722:1: ( ruleVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5723:1: ruleVariable
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsVariableParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_2_111630);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getDeclaracionVariableAccess().getTieneIDsVariableParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__TieneIDsAssignment_2_1"


    // $ANTLR start "rule__LlamadaFuncion__NombreAssignment_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5732:1: rule__LlamadaFuncion__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__LlamadaFuncion__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5736:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5737:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5737:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5738:1: ruleEString
            {
             before(grammarAccess.getLlamadaFuncionAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__LlamadaFuncion__NombreAssignment_011661);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLlamadaFuncionAccess().getNombreEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__NombreAssignment_0"


    // $ANTLR start "rule__LlamadaFuncion__OperadorAssignment_2_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5747:1: rule__LlamadaFuncion__OperadorAssignment_2_0 : ( ruleOperador ) ;
    public final void rule__LlamadaFuncion__OperadorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5751:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5752:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5752:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5753:1: ruleOperador
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorOperadorParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_011692);
            ruleOperador();

            state._fsp--;

             after(grammarAccess.getLlamadaFuncionAccess().getOperadorOperadorParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__OperadorAssignment_2_0"


    // $ANTLR start "rule__LlamadaFuncion__OperadorAssignment_2_1_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5762:1: rule__LlamadaFuncion__OperadorAssignment_2_1_1 : ( ruleOperador ) ;
    public final void rule__LlamadaFuncion__OperadorAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5766:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5767:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5767:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5768:1: ruleOperador
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorOperadorParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_1_111723);
            ruleOperador();

            state._fsp--;

             after(grammarAccess.getLlamadaFuncionAccess().getOperadorOperadorParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlamadaFuncion__OperadorAssignment_2_1_1"


    // $ANTLR start "rule__Asignacion__LvalueAssignment_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5777:1: rule__Asignacion__LvalueAssignment_0 : ( ruleEString ) ;
    public final void rule__Asignacion__LvalueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5781:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5782:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5782:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5783:1: ruleEString
            {
             before(grammarAccess.getAsignacionAccess().getLvalueEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Asignacion__LvalueAssignment_011754);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAsignacionAccess().getLvalueEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asignacion__LvalueAssignment_0"


    // $ANTLR start "rule__Asignacion__MatAssignment_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5792:1: rule__Asignacion__MatAssignment_1 : ( RULE_MATRIZ ) ;
    public final void rule__Asignacion__MatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5796:1: ( ( RULE_MATRIZ ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5797:1: ( RULE_MATRIZ )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5797:1: ( RULE_MATRIZ )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5798:1: RULE_MATRIZ
            {
             before(grammarAccess.getAsignacionAccess().getMatMATRIZTerminalRuleCall_1_0()); 
            match(input,RULE_MATRIZ,FollowSets000.FOLLOW_RULE_MATRIZ_in_rule__Asignacion__MatAssignment_111785); 
             after(grammarAccess.getAsignacionAccess().getMatMATRIZTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asignacion__MatAssignment_1"


    // $ANTLR start "rule__Asignacion__OperadorAssignment_3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5807:1: rule__Asignacion__OperadorAssignment_3 : ( rulevalor ) ;
    public final void rule__Asignacion__OperadorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5811:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5812:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5812:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5813:1: rulevalor
            {
             before(grammarAccess.getAsignacionAccess().getOperadorValorParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Asignacion__OperadorAssignment_311816);
            rulevalor();

            state._fsp--;

             after(grammarAccess.getAsignacionAccess().getOperadorValorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asignacion__OperadorAssignment_3"


    // $ANTLR start "rule__Escribir__OperadorAssignment_2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5822:1: rule__Escribir__OperadorAssignment_2 : ( ruleOperador ) ;
    public final void rule__Escribir__OperadorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5826:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5827:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5827:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5828:1: ruleOperador
            {
             before(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_211847);
            ruleOperador();

            state._fsp--;

             after(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escribir__OperadorAssignment_2"


    // $ANTLR start "rule__Escribir__OperadorAssignment_3_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5837:1: rule__Escribir__OperadorAssignment_3_1 : ( ruleOperador ) ;
    public final void rule__Escribir__OperadorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5841:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5842:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5842:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5843:1: ruleOperador
            {
             before(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_3_111878);
            ruleOperador();

            state._fsp--;

             after(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escribir__OperadorAssignment_3_1"


    // $ANTLR start "rule__Leer__VariableAssignment_2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5852:1: rule__Leer__VariableAssignment_2 : ( ruleVariableID ) ;
    public final void rule__Leer__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5856:1: ( ( ruleVariableID ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5857:1: ( ruleVariableID )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5857:1: ( ruleVariableID )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5858:1: ruleVariableID
            {
             before(grammarAccess.getLeerAccess().getVariableVariableIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__Leer__VariableAssignment_211909);
            ruleVariableID();

            state._fsp--;

             after(grammarAccess.getLeerAccess().getVariableVariableIDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leer__VariableAssignment_2"


    // $ANTLR start "rule__Si__ValorAssignment_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5867:1: rule__Si__ValorAssignment_1 : ( rulevalor ) ;
    public final void rule__Si__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5871:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5872:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5872:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5873:1: rulevalor
            {
             before(grammarAccess.getSiAccess().getValorValorParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Si__ValorAssignment_111940);
            rulevalor();

            state._fsp--;

             after(grammarAccess.getSiAccess().getValorValorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__ValorAssignment_1"


    // $ANTLR start "rule__Si__SentenciasAssignment_3_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5882:1: rule__Si__SentenciasAssignment_3_0 : ( ruleSentencias ) ;
    public final void rule__Si__SentenciasAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5886:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5887:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5887:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5888:1: ruleSentencias
            {
             before(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_011971);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__SentenciasAssignment_3_0"


    // $ANTLR start "rule__Si__SentenciasAssignment_3_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5897:1: rule__Si__SentenciasAssignment_3_1 : ( ruleSentencias ) ;
    public final void rule__Si__SentenciasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5901:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5902:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5902:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5903:1: ruleSentencias
            {
             before(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_112002);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__SentenciasAssignment_3_1"


    // $ANTLR start "rule__Si__SinoAssignment_4"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5912:1: rule__Si__SinoAssignment_4 : ( ruleSino ) ;
    public final void rule__Si__SinoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5916:1: ( ( ruleSino ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5917:1: ( ruleSino )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5917:1: ( ruleSino )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5918:1: ruleSino
            {
             before(grammarAccess.getSiAccess().getSinoSinoParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSino_in_rule__Si__SinoAssignment_412033);
            ruleSino();

            state._fsp--;

             after(grammarAccess.getSiAccess().getSinoSinoParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Si__SinoAssignment_4"


    // $ANTLR start "rule__Mientras__ValorAssignment_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5927:1: rule__Mientras__ValorAssignment_1 : ( rulevalor ) ;
    public final void rule__Mientras__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5931:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5932:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5932:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5933:1: rulevalor
            {
             before(grammarAccess.getMientrasAccess().getValorValorParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Mientras__ValorAssignment_112064);
            rulevalor();

            state._fsp--;

             after(grammarAccess.getMientrasAccess().getValorValorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mientras__ValorAssignment_1"


    // $ANTLR start "rule__Mientras__SentenciasAssignment_3_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5942:1: rule__Mientras__SentenciasAssignment_3_0 : ( ruleSentencias ) ;
    public final void rule__Mientras__SentenciasAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5946:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5947:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5947:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5948:1: ruleSentencias
            {
             before(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_012095);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mientras__SentenciasAssignment_3_0"


    // $ANTLR start "rule__Mientras__SentenciasAssignment_3_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5957:1: rule__Mientras__SentenciasAssignment_3_1 : ( ruleSentencias ) ;
    public final void rule__Mientras__SentenciasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5961:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5962:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5962:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5963:1: ruleSentencias
            {
             before(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_112126);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mientras__SentenciasAssignment_3_1"


    // $ANTLR start "rule__Repetir__SentenciasAssignment_1_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5972:1: rule__Repetir__SentenciasAssignment_1_0 : ( ruleSentencias ) ;
    public final void rule__Repetir__SentenciasAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5976:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5977:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5977:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5978:1: ruleSentencias
            {
             before(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_012157);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetir__SentenciasAssignment_1_0"


    // $ANTLR start "rule__Repetir__SentenciasAssignment_1_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5987:1: rule__Repetir__SentenciasAssignment_1_1 : ( ruleSentencias ) ;
    public final void rule__Repetir__SentenciasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5991:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5992:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5992:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5993:1: ruleSentencias
            {
             before(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_112188);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetir__SentenciasAssignment_1_1"


    // $ANTLR start "rule__Repetir__ValorAssignment_3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6002:1: rule__Repetir__ValorAssignment_3 : ( rulevalor ) ;
    public final void rule__Repetir__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6006:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6007:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6007:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6008:1: rulevalor
            {
             before(grammarAccess.getRepetirAccess().getValorValorParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Repetir__ValorAssignment_312219);
            rulevalor();

            state._fsp--;

             after(grammarAccess.getRepetirAccess().getValorValorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetir__ValorAssignment_3"


    // $ANTLR start "rule__Desde__AsignacionAssignment_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6017:1: rule__Desde__AsignacionAssignment_1 : ( ruleAsignacion ) ;
    public final void rule__Desde__AsignacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6021:1: ( ( ruleAsignacion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6022:1: ( ruleAsignacion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6022:1: ( ruleAsignacion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6023:1: ruleAsignacion
            {
             before(grammarAccess.getDesdeAccess().getAsignacionAsignacionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_rule__Desde__AsignacionAssignment_112250);
            ruleAsignacion();

            state._fsp--;

             after(grammarAccess.getDesdeAccess().getAsignacionAsignacionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__AsignacionAssignment_1"


    // $ANTLR start "rule__Desde__ValorAssignment_3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6032:1: rule__Desde__ValorAssignment_3 : ( rulevalor ) ;
    public final void rule__Desde__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6036:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6037:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6037:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6038:1: rulevalor
            {
             before(grammarAccess.getDesdeAccess().getValorValorParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Desde__ValorAssignment_312281);
            rulevalor();

            state._fsp--;

             after(grammarAccess.getDesdeAccess().getValorValorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__ValorAssignment_3"


    // $ANTLR start "rule__Desde__SentenciasAssignment_5_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6047:1: rule__Desde__SentenciasAssignment_5_0 : ( ruleSentencias ) ;
    public final void rule__Desde__SentenciasAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6051:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6052:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6052:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6053:1: ruleSentencias
            {
             before(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_012312);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__SentenciasAssignment_5_0"


    // $ANTLR start "rule__Desde__SentenciasAssignment_5_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6062:1: rule__Desde__SentenciasAssignment_5_1 : ( ruleSentencias ) ;
    public final void rule__Desde__SentenciasAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6066:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6067:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6067:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6068:1: ruleSentencias
            {
             before(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_112343);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Desde__SentenciasAssignment_5_1"


    // $ANTLR start "rule__Incremento__NombreAssignment_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6077:1: rule__Incremento__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__Incremento__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6081:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6082:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6082:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6083:1: ruleEString
            {
             before(grammarAccess.getIncrementoAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Incremento__NombreAssignment_012374);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIncrementoAccess().getNombreEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Incremento__NombreAssignment_0"


    // $ANTLR start "rule__Incremento__SsignoAssignment_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6092:1: rule__Incremento__SsignoAssignment_1 : ( ruleinc ) ;
    public final void rule__Incremento__SsignoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6096:1: ( ( ruleinc ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6097:1: ( ruleinc )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6097:1: ( ruleinc )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6098:1: ruleinc
            {
             before(grammarAccess.getIncrementoAccess().getSsignoIncParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_rule__Incremento__SsignoAssignment_112405);
            ruleinc();

            state._fsp--;

             after(grammarAccess.getIncrementoAccess().getSsignoIncParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Incremento__SsignoAssignment_1"


    // $ANTLR start "rule__Variable__NombreAssignment_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6107:1: rule__Variable__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__Variable__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6111:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6112:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6112:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6113:1: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Variable__NombreAssignment_012436);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNombreEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NombreAssignment_0"


    // $ANTLR start "rule__Variable__MatAssignment_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6122:1: rule__Variable__MatAssignment_1 : ( RULE_MATRIZ ) ;
    public final void rule__Variable__MatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6126:1: ( ( RULE_MATRIZ ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6127:1: ( RULE_MATRIZ )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6127:1: ( RULE_MATRIZ )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6128:1: RULE_MATRIZ
            {
             before(grammarAccess.getVariableAccess().getMatMATRIZTerminalRuleCall_1_0()); 
            match(input,RULE_MATRIZ,FollowSets000.FOLLOW_RULE_MATRIZ_in_rule__Variable__MatAssignment_112467); 
             after(grammarAccess.getVariableAccess().getMatMATRIZTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__MatAssignment_1"


    // $ANTLR start "rule__VariableID__NombreAssignment_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6137:1: rule__VariableID__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__VariableID__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6141:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6142:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6142:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6143:1: ruleEString
            {
             before(grammarAccess.getVariableIDAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VariableID__NombreAssignment_012498);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableIDAccess().getNombreEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableID__NombreAssignment_0"


    // $ANTLR start "rule__VariableID__MatAssignment_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6152:1: rule__VariableID__MatAssignment_1 : ( RULE_MATRIZ ) ;
    public final void rule__VariableID__MatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6156:1: ( ( RULE_MATRIZ ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6157:1: ( RULE_MATRIZ )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6157:1: ( RULE_MATRIZ )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6158:1: RULE_MATRIZ
            {
             before(grammarAccess.getVariableIDAccess().getMatMATRIZTerminalRuleCall_1_0()); 
            match(input,RULE_MATRIZ,FollowSets000.FOLLOW_RULE_MATRIZ_in_rule__VariableID__MatAssignment_112529); 
             after(grammarAccess.getVariableIDAccess().getMatMATRIZTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableID__MatAssignment_1"


    // $ANTLR start "rule__ConstCadena__ContenidoAssignment"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6167:1: rule__ConstCadena__ContenidoAssignment : ( RULE_CAD ) ;
    public final void rule__ConstCadena__ContenidoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6171:1: ( ( RULE_CAD ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6172:1: ( RULE_CAD )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6172:1: ( RULE_CAD )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6173:1: RULE_CAD
            {
             before(grammarAccess.getConstCadenaAccess().getContenidoCADTerminalRuleCall_0()); 
            match(input,RULE_CAD,FollowSets000.FOLLOW_RULE_CAD_in_rule__ConstCadena__ContenidoAssignment12560); 
             after(grammarAccess.getConstCadenaAccess().getContenidoCADTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstCadena__ContenidoAssignment"


    // $ANTLR start "rule__NumeroEntero__ValorAssignment"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6182:1: rule__NumeroEntero__ValorAssignment : ( ruleEInt ) ;
    public final void rule__NumeroEntero__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6186:1: ( ( ruleEInt ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6187:1: ( ruleEInt )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6187:1: ( ruleEInt )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6188:1: ruleEInt
            {
             before(grammarAccess.getNumeroEnteroAccess().getValorEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__NumeroEntero__ValorAssignment12591);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNumeroEnteroAccess().getValorEIntParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumeroEntero__ValorAssignment"


    // $ANTLR start "rule__NumeroDecimal__ValorAssignment"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6197:1: rule__NumeroDecimal__ValorAssignment : ( ruleEFloat ) ;
    public final void rule__NumeroDecimal__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6201:1: ( ( ruleEFloat ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6202:1: ( ruleEFloat )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6202:1: ( ruleEFloat )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6203:1: ruleEFloat
            {
             before(grammarAccess.getNumeroDecimalAccess().getValorEFloatParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rule__NumeroDecimal__ValorAssignment12622);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getNumeroDecimalAccess().getValorEFloatParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumeroDecimal__ValorAssignment"


    // $ANTLR start "rule__ValorBooleano__ValorAssignment"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6212:1: rule__ValorBooleano__ValorAssignment : ( rulebooleano ) ;
    public final void rule__ValorBooleano__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6216:1: ( ( rulebooleano ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6217:1: ( rulebooleano )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6217:1: ( rulebooleano )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6218:1: rulebooleano
            {
             before(grammarAccess.getValorBooleanoAccess().getValorBooleanoParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleano_in_rule__ValorBooleano__ValorAssignment12653);
            rulebooleano();

            state._fsp--;

             after(grammarAccess.getValorBooleanoAccess().getValorBooleanoParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValorBooleano__ValorAssignment"


    // $ANTLR start "rule__Operacion__Op_izqAssignment_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6227:1: rule__Operacion__Op_izqAssignment_1 : ( ruleoperando_izq ) ;
    public final void rule__Operacion__Op_izqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6231:1: ( ( ruleoperando_izq ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6232:1: ( ruleoperando_izq )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6232:1: ( ruleoperando_izq )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6233:1: ruleoperando_izq
            {
             before(grammarAccess.getOperacionAccess().getOp_izqOperando_izqParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_izq_in_rule__Operacion__Op_izqAssignment_112684);
            ruleoperando_izq();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getOp_izqOperando_izqParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Op_izqAssignment_1"


    // $ANTLR start "rule__Operacion__Signo_opAssignment_2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6242:1: rule__Operacion__Signo_opAssignment_2 : ( rulesigno ) ;
    public final void rule__Operacion__Signo_opAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6246:1: ( ( rulesigno ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6247:1: ( rulesigno )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6247:1: ( rulesigno )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6248:1: rulesigno
            {
             before(grammarAccess.getOperacionAccess().getSigno_opSignoParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulesigno_in_rule__Operacion__Signo_opAssignment_212715);
            rulesigno();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getSigno_opSignoParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Signo_opAssignment_2"


    // $ANTLR start "rule__Operacion__Op_derAssignment_3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6257:1: rule__Operacion__Op_derAssignment_3 : ( ruleoperando_der ) ;
    public final void rule__Operacion__Op_derAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6261:1: ( ( ruleoperando_der ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6262:1: ( ruleoperando_der )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6262:1: ( ruleoperando_der )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6263:1: ruleoperando_der
            {
             before(grammarAccess.getOperacionAccess().getOp_derOperando_derParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_der_in_rule__Operacion__Op_derAssignment_312746);
            ruleoperando_der();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getOp_derOperando_derParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Op_derAssignment_3"


    // $ANTLR start "rule__Operando_izq__Oper_izqAssignment"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6272:1: rule__Operando_izq__Oper_izqAssignment : ( rulevalor ) ;
    public final void rule__Operando_izq__Oper_izqAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6276:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6277:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6277:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6278:1: rulevalor
            {
             before(grammarAccess.getOperando_izqAccess().getOper_izqValorParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Operando_izq__Oper_izqAssignment12777);
            rulevalor();

            state._fsp--;

             after(grammarAccess.getOperando_izqAccess().getOper_izqValorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operando_izq__Oper_izqAssignment"


    // $ANTLR start "rule__Operando_der__Oper_derAssignment"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6287:1: rule__Operando_der__Oper_derAssignment : ( rulevalor ) ;
    public final void rule__Operando_der__Oper_derAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6291:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6292:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6292:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6293:1: rulevalor
            {
             before(grammarAccess.getOperando_derAccess().getOper_derValorParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Operando_der__Oper_derAssignment12808);
            rulevalor();

            state._fsp--;

             after(grammarAccess.getOperando_derAccess().getOper_derValorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operando_der__Oper_derAssignment"


    // $ANTLR start "rule__Sino__SentenciasAssignment_2_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6302:1: rule__Sino__SentenciasAssignment_2_0 : ( ruleSentencias ) ;
    public final void rule__Sino__SentenciasAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6306:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6307:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6307:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6308:1: ruleSentencias
            {
             before(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_012839);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sino__SentenciasAssignment_2_0"


    // $ANTLR start "rule__Sino__SentenciasAssignment_2_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6317:1: rule__Sino__SentenciasAssignment_2_1 : ( ruleSentencias ) ;
    public final void rule__Sino__SentenciasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6321:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6322:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6322:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6323:1: ruleSentencias
            {
             before(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_112870);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sino__SentenciasAssignment_2_1"


    // $ANTLR start "rule__ParametroFuncion__TipoAssignment_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6332:1: rule__ParametroFuncion__TipoAssignment_0 : ( ruleTipoVariable ) ;
    public final void rule__ParametroFuncion__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6336:1: ( ( ruleTipoVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6337:1: ( ruleTipoVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6337:1: ( ruleTipoVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6338:1: ruleTipoVariable
            {
             before(grammarAccess.getParametroFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_rule__ParametroFuncion__TipoAssignment_012901);
            ruleTipoVariable();

            state._fsp--;

             after(grammarAccess.getParametroFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametroFuncion__TipoAssignment_0"


    // $ANTLR start "rule__ParametroFuncion__PasoAssignment_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6347:1: rule__ParametroFuncion__PasoAssignment_1 : ( ruleTipoPaso ) ;
    public final void rule__ParametroFuncion__PasoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6351:1: ( ( ruleTipoPaso ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6352:1: ( ruleTipoPaso )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6352:1: ( ruleTipoPaso )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6353:1: ruleTipoPaso
            {
             before(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_rule__ParametroFuncion__PasoAssignment_112932);
            ruleTipoPaso();

            state._fsp--;

             after(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametroFuncion__PasoAssignment_1"


    // $ANTLR start "rule__ParametroFuncion__VariableAssignment_2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6362:1: rule__ParametroFuncion__VariableAssignment_2 : ( ruleVariable ) ;
    public final void rule__ParametroFuncion__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6366:1: ( ( ruleVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6367:1: ( ruleVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6367:1: ( ruleVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6368:1: ruleVariable
            {
             before(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__ParametroFuncion__VariableAssignment_212963);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametroFuncion__VariableAssignment_2"


    // $ANTLR start "rule__Funcion__TipoAssignment_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6377:1: rule__Funcion__TipoAssignment_0 : ( ruleTipoVariable ) ;
    public final void rule__Funcion__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6381:1: ( ( ruleTipoVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6382:1: ( ruleTipoVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6382:1: ( ruleTipoVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6383:1: ruleTipoVariable
            {
             before(grammarAccess.getFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_rule__Funcion__TipoAssignment_012994);
            ruleTipoVariable();

            state._fsp--;

             after(grammarAccess.getFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__TipoAssignment_0"


    // $ANTLR start "rule__Funcion__NombreAssignment_2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6392:1: rule__Funcion__NombreAssignment_2 : ( ruleEString ) ;
    public final void rule__Funcion__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6396:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6397:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6397:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6398:1: ruleEString
            {
             before(grammarAccess.getFuncionAccess().getNombreEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Funcion__NombreAssignment_213025);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFuncionAccess().getNombreEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__NombreAssignment_2"


    // $ANTLR start "rule__Funcion__ParametrofuncionAssignment_4_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6407:1: rule__Funcion__ParametrofuncionAssignment_4_0 : ( ruleParametroFuncion ) ;
    public final void rule__Funcion__ParametrofuncionAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6411:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6412:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6412:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6413:1: ruleParametroFuncion
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_013056);
            ruleParametroFuncion();

            state._fsp--;

             after(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__ParametrofuncionAssignment_4_0"


    // $ANTLR start "rule__Funcion__ParametrofuncionAssignment_4_1_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6422:1: rule__Funcion__ParametrofuncionAssignment_4_1_1 : ( ruleParametroFuncion ) ;
    public final void rule__Funcion__ParametrofuncionAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6426:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6427:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6427:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6428:1: ruleParametroFuncion
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_1_113087);
            ruleParametroFuncion();

            state._fsp--;

             after(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__ParametrofuncionAssignment_4_1_1"


    // $ANTLR start "rule__Funcion__SentenciasAssignment_7_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6437:1: rule__Funcion__SentenciasAssignment_7_0 : ( ruleSentencias ) ;
    public final void rule__Funcion__SentenciasAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6441:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6442:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6442:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6443:1: ruleSentencias
            {
             before(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_7_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_7_013118);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__SentenciasAssignment_7_0"


    // $ANTLR start "rule__Funcion__SentenciasAssignment_7_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6452:1: rule__Funcion__SentenciasAssignment_7_1 : ( ruleSentencias ) ;
    public final void rule__Funcion__SentenciasAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6456:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6457:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6457:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6458:1: ruleSentencias
            {
             before(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_7_113149);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__SentenciasAssignment_7_1"


    // $ANTLR start "rule__Funcion__DevuelveAssignment_9"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6467:1: rule__Funcion__DevuelveAssignment_9 : ( rulevalor ) ;
    public final void rule__Funcion__DevuelveAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6471:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6472:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6472:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6473:1: rulevalor
            {
             before(grammarAccess.getFuncionAccess().getDevuelveValorParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Funcion__DevuelveAssignment_913180);
            rulevalor();

            state._fsp--;

             after(grammarAccess.getFuncionAccess().getDevuelveValorParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__DevuelveAssignment_9"


    // $ANTLR start "rule__Procedimiento__NombreAssignment_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6482:1: rule__Procedimiento__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__Procedimiento__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6486:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6487:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6487:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6488:1: ruleEString
            {
             before(grammarAccess.getProcedimientoAccess().getNombreEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Procedimiento__NombreAssignment_113211);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcedimientoAccess().getNombreEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__NombreAssignment_1"


    // $ANTLR start "rule__Procedimiento__ParametrofuncionAssignment_3_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6497:1: rule__Procedimiento__ParametrofuncionAssignment_3_0 : ( ruleParametroFuncion ) ;
    public final void rule__Procedimiento__ParametrofuncionAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6501:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6502:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6502:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6503:1: ruleParametroFuncion
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_013242);
            ruleParametroFuncion();

            state._fsp--;

             after(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__ParametrofuncionAssignment_3_0"


    // $ANTLR start "rule__Procedimiento__ParametrofuncionAssignment_3_1_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6512:1: rule__Procedimiento__ParametrofuncionAssignment_3_1_1 : ( ruleParametroFuncion ) ;
    public final void rule__Procedimiento__ParametrofuncionAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6516:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6517:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6517:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6518:1: ruleParametroFuncion
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_1_113273);
            ruleParametroFuncion();

            state._fsp--;

             after(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__ParametrofuncionAssignment_3_1_1"


    // $ANTLR start "rule__Procedimiento__SentenciasAssignment_5_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6527:1: rule__Procedimiento__SentenciasAssignment_5_0 : ( ruleSentencias ) ;
    public final void rule__Procedimiento__SentenciasAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6531:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6532:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6532:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6533:1: ruleSentencias
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_5_013304);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__SentenciasAssignment_5_0"


    // $ANTLR start "rule__Procedimiento__SentenciasAssignment_5_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6542:1: rule__Procedimiento__SentenciasAssignment_5_1 : ( ruleSentencias ) ;
    public final void rule__Procedimiento__SentenciasAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6546:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6547:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6547:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6548:1: ruleSentencias
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_5_113335);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedimiento__SentenciasAssignment_5_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA2_eotS =
        "\15\uffff";
    static final String DFA2_eofS =
        "\15\uffff";
    static final String DFA2_minS =
        "\1\4\1\uffff\2\10\11\uffff";
    static final String DFA2_maxS =
        "\1\66\1\uffff\2\53\11\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\3\1\2\1\12";
    static final String DFA2_specialS =
        "\15\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\3\10\uffff\5\1\31\uffff\1\4\1\5\1\6\2\uffff\1\7\2\uffff"+
            "\1\10\1\uffff\1\11",
            "",
            "\1\12\32\uffff\2\14\4\uffff\1\13\1\uffff\1\12",
            "\1\12\32\uffff\2\14\4\uffff\1\13\1\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "1146:1: rule__Sentencias__Alternatives : ( ( ruleDeclaracionVariable ) | ( ruleLlamadaFuncion ) | ( ruleAsignacion ) | ( ruleEscribir ) | ( ruleLeer ) | ( ruleSi ) | ( rulemientras ) | ( rulerepetir ) | ( ruledesde ) | ( ruleincremento ) );";
        }
    }
    static final String DFA4_eotS =
        "\15\uffff";
    static final String DFA4_eofS =
        "\1\uffff\2\12\2\uffff\1\14\7\uffff";
    static final String DFA4_minS =
        "\3\4\1\uffff\1\6\1\4\7\uffff";
    static final String DFA4_maxS =
        "\1\71\2\77\1\uffff\1\71\1\77\7\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\3\2\uffff\1\5\1\6\1\7\1\10\1\2\1\1\1\4";
    static final String DFA4_specialS =
        "\15\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\1\5\1\11\1\uffff\1\3\13\uffff\2\10\1\uffff\1\4\20"+
            "\uffff\1\7\17\uffff\1\6",
            "\2\12\2\uffff\1\12\5\uffff\5\12\4\uffff\14\12\4\uffff\1\12"+
            "\1\uffff\1\13\1\12\1\uffff\15\12\1\uffff\1\12\1\uffff\2\12\1"+
            "\uffff\1\12",
            "\2\12\2\uffff\1\12\5\uffff\5\12\4\uffff\14\12\4\uffff\1\12"+
            "\1\uffff\1\13\1\12\1\uffff\15\12\1\uffff\1\12\1\uffff\2\12\1"+
            "\uffff\1\12",
            "",
            "\1\5\62\uffff\1\6",
            "\2\14\10\uffff\5\14\4\uffff\14\14\4\uffff\1\14\2\uffff\1\14"+
            "\1\uffff\15\14\1\6\1\14\1\uffff\2\14\1\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1262:1: rule__Valor__Alternatives : ( ( ruleLlamadaFuncion ) | ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleoperacion ) | ( ruleValorBooleano ) | ( ruleCaracter ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleCodigo_in_entryRuleCodigo61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCodigo68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group__0_in_ruleCodigo94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubproceso_in_entryRuleSubproceso121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubproceso128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Subproceso__Alternatives_in_ruleSubproceso154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_entryRuleSentencias181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSentencias188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentencias__Alternatives_in_ruleSentencias214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_entryRuleOperador241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperador248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operador__Alternatives_in_ruleOperador274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_entryRuleCaracter301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCaracter308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Caracter__ContenidoAssignment_in_ruleCaracter334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_entryRulevalor361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulevalor368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Valor__Alternatives_in_rulevalor394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInicio_in_entryRuleInicio421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInicio428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__0_in_ruleInicio454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionVariable548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__0_in_ruleDeclaracionVariable574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_entryRuleLlamadaFuncion601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLlamadaFuncion608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__0_in_ruleLlamadaFuncion634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_entryRuleAsignacion661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacion668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__0_in_ruleAsignacion694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_entryRuleEscribir721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEscribir728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__0_in_ruleEscribir754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_entryRuleLeer781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeer788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__0_in_ruleLeer814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_entryRuleSi841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSi848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__0_in_ruleSi874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_entryRulemientras901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemientras908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__0_in_rulemientras934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_entryRulerepetir961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulerepetir968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group__0_in_rulerepetir994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_entryRuledesde1021 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuledesde1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__0_in_ruledesde1054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleincremento_in_entryRuleincremento1081 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleincremento1088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Incremento__Group__0_in_ruleincremento1114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable1141 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoVariable1148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TipoVariable__Alternatives_in_ruleTipoVariable1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable1208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable1234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_entryRuleVariableID1261 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableID1268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group__0_in_ruleVariableID1294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstCadena_in_entryRuleConstCadena1321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstCadena1328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstCadena__ContenidoAssignment_in_ruleConstCadena1354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_entryRuleNumeroEntero1381 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumeroEntero1388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumeroEntero__ValorAssignment_in_ruleNumeroEntero1414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_entryRuleNumeroDecimal1441 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumeroDecimal1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumeroDecimal__ValorAssignment_in_ruleNumeroDecimal1474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_entryRuleValorBooleano1501 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValorBooleano1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValorBooleano__ValorAssignment_in_ruleValorBooleano1534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1561 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt1594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat1621 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat1628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0_in_ruleEFloat1654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_entryRulebooleano1681 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulebooleano1688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Booleano__Alternatives_in_rulebooleano1714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_entryRuleoperacion1741 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperacion1748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__0_in_ruleoperacion1774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesigno_in_entryRulesigno1801 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesigno1808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signo__Alternatives_in_rulesigno1834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_izq_in_entryRuleoperando_izq1861 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperando_izq1868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operando_izq__Oper_izqAssignment_in_ruleoperando_izq1894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_der_in_entryRuleoperando_der1921 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperando_der1928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operando_der__Oper_derAssignment_in_ruleoperando_der1954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSino_in_entryRuleSino1981 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSino1988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group__0_in_ruleSino2014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinc_in_entryRuleinc2041 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleinc2048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inc__Alternatives_in_ruleinc2074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion2101 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametroFuncion2108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__0_in_ruleParametroFuncion2134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_entryRuleFuncion2161 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncion2168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__0_in_ruleFuncion2194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento2221 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcedimiento2228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__0_in_ruleProcedimiento2254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso2281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoPaso2288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TipoPaso__Alternatives_in_ruleTipoPaso2314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_rule__Subproceso__Alternatives2350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_rule__Subproceso__Alternatives2367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Sentencias__Alternatives2399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_rule__Sentencias__Alternatives2416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_rule__Sentencias__Alternatives2433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_rule__Sentencias__Alternatives2450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_rule__Sentencias__Alternatives2467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_rule__Sentencias__Alternatives2484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_rule__Sentencias__Alternatives2501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_rule__Sentencias__Alternatives2518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_rule__Sentencias__Alternatives2535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleincremento_in_rule__Sentencias__Alternatives2552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__Operador__Alternatives2584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstCadena_in_rule__Operador__Alternatives2601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_rule__Operador__Alternatives2618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_rule__Operador__Alternatives2635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_rule__Operador__Alternatives2652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_rule__Operador__Alternatives2669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_rule__Valor__Alternatives2701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__Valor__Alternatives2718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstCadena_in_rule__Valor__Alternatives2735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_rule__Valor__Alternatives2752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_rule__Valor__Alternatives2769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_rule__Valor__Alternatives2786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_rule__Valor__Alternatives2803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_rule__Valor__Alternatives2820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TipoVariable__Alternatives2902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TipoVariable__Alternatives2922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TipoVariable__Alternatives2942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TipoVariable__Alternatives2962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__TipoVariable__Alternatives2982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__EFloat__Alternatives_4_03017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__EFloat__Alternatives_4_03037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Booleano__Alternatives3072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Booleano__Alternatives3092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Signo__Alternatives3127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Signo__Alternatives3147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Signo__Alternatives3167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Signo__Alternatives3187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Signo__Alternatives3207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Signo__Alternatives3227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Signo__Alternatives3247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Signo__Alternatives3267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Signo__Alternatives3287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Signo__Alternatives3307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Signo__Alternatives3327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Signo__Alternatives3347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Inc__Alternatives3382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Inc__Alternatives3402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__TipoPaso__Alternatives3437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__TipoPaso__Alternatives3457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group__0__Impl_in_rule__Codigo__Group__03489 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Codigo__Group__1_in_rule__Codigo__Group__03492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group_0__0_in_rule__Codigo__Group__0__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group__1__Impl_in_rule__Codigo__Group__13550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__TieneAssignment_1_in_rule__Codigo__Group__1__Impl3577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group_0__0__Impl_in_rule__Codigo__Group_0__03611 = new BitSet(new long[]{0x400000000007C000L});
        public static final BitSet FOLLOW_rule__Codigo__Group_0__1_in_rule__Codigo__Group_0__03614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__FuncionAssignment_0_0_in_rule__Codigo__Group_0__0__Impl3641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group_0__1__Impl_in_rule__Codigo__Group_0__13671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__FuncionAssignment_0_1_in_rule__Codigo__Group_0__1__Impl3698 = new BitSet(new long[]{0x400000000007C002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__0__Impl_in_rule__Inicio__Group__03733 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Inicio__Group__1_in_rule__Inicio__Group__03736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__1__Impl_in_rule__Inicio__Group__13794 = new BitSet(new long[]{0x005270800007C030L});
        public static final BitSet FOLLOW_rule__Inicio__Group__2_in_rule__Inicio__Group__13797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Inicio__Group__1__Impl3825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__2__Impl_in_rule__Inicio__Group__23856 = new BitSet(new long[]{0x005270800007C030L});
        public static final BitSet FOLLOW_rule__Inicio__Group__3_in_rule__Inicio__Group__23859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__0_in_rule__Inicio__Group__2__Impl3886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__3__Impl_in_rule__Inicio__Group__33917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Inicio__Group__3__Impl3945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__0__Impl_in_rule__Inicio__Group_2__03984 = new BitSet(new long[]{0x005270000007C030L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__1_in_rule__Inicio__Group_2__03987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__TieneAssignment_2_0_in_rule__Inicio__Group_2__0__Impl4014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__1__Impl_in_rule__Inicio__Group_2__14044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__TieneAssignment_2_1_in_rule__Inicio__Group_2__1__Impl4071 = new BitSet(new long[]{0x005270000007C032L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__0__Impl_in_rule__DeclaracionVariable__Group__04106 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__1_in_rule__DeclaracionVariable__Group__04109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__TipoAssignment_0_in_rule__DeclaracionVariable__Group__0__Impl4136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__1__Impl_in_rule__DeclaracionVariable__Group__14166 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__2_in_rule__DeclaracionVariable__Group__14169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_1_in_rule__DeclaracionVariable__Group__1__Impl4196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__2__Impl_in_rule__DeclaracionVariable__Group__24226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_2__0_in_rule__DeclaracionVariable__Group__2__Impl4253 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_2__0__Impl_in_rule__DeclaracionVariable__Group_2__04290 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_2__1_in_rule__DeclaracionVariable__Group_2__04293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__DeclaracionVariable__Group_2__0__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_2__1__Impl_in_rule__DeclaracionVariable__Group_2__14352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_2_1_in_rule__DeclaracionVariable__Group_2__1__Impl4379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__0__Impl_in_rule__LlamadaFuncion__Group__04413 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__1_in_rule__LlamadaFuncion__Group__04416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__NombreAssignment_0_in_rule__LlamadaFuncion__Group__0__Impl4443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__1__Impl_in_rule__LlamadaFuncion__Group__14473 = new BitSet(new long[]{0x02000400016002F0L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__2_in_rule__LlamadaFuncion__Group__14476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__LlamadaFuncion__Group__1__Impl4504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__2__Impl_in_rule__LlamadaFuncion__Group__24535 = new BitSet(new long[]{0x02000400016002F0L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__3_in_rule__LlamadaFuncion__Group__24538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__0_in_rule__LlamadaFuncion__Group__2__Impl4565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__3__Impl_in_rule__LlamadaFuncion__Group__34596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__LlamadaFuncion__Group__3__Impl4624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__0__Impl_in_rule__LlamadaFuncion__Group_2__04663 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__1_in_rule__LlamadaFuncion__Group_2__04666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_0_in_rule__LlamadaFuncion__Group_2__0__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__1__Impl_in_rule__LlamadaFuncion__Group_2__14723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__0_in_rule__LlamadaFuncion__Group_2__1__Impl4750 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__0__Impl_in_rule__LlamadaFuncion__Group_2_1__04785 = new BitSet(new long[]{0x02000000016002F0L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__1_in_rule__LlamadaFuncion__Group_2_1__04788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__LlamadaFuncion__Group_2_1__0__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__1__Impl_in_rule__LlamadaFuncion__Group_2_1__14847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_1_1_in_rule__LlamadaFuncion__Group_2_1__1__Impl4874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__0__Impl_in_rule__Asignacion__Group__04908 = new BitSet(new long[]{0x0000080000000100L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__1_in_rule__Asignacion__Group__04911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__LvalueAssignment_0_in_rule__Asignacion__Group__0__Impl4938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__1__Impl_in_rule__Asignacion__Group__14968 = new BitSet(new long[]{0x0000080000000100L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__2_in_rule__Asignacion__Group__14971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__MatAssignment_1_in_rule__Asignacion__Group__1__Impl4998 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__2__Impl_in_rule__Asignacion__Group__25029 = new BitSet(new long[]{0x02000200016002F0L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__3_in_rule__Asignacion__Group__25032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Asignacion__Group__2__Impl5060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__3__Impl_in_rule__Asignacion__Group__35091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__OperadorAssignment_3_in_rule__Asignacion__Group__3__Impl5118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__0__Impl_in_rule__Escribir__Group__05156 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Escribir__Group__1_in_rule__Escribir__Group__05159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Escribir__Group__0__Impl5187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__1__Impl_in_rule__Escribir__Group__15218 = new BitSet(new long[]{0x02000000016002F0L});
        public static final BitSet FOLLOW_rule__Escribir__Group__2_in_rule__Escribir__Group__15221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Escribir__Group__1__Impl5249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__2__Impl_in_rule__Escribir__Group__25280 = new BitSet(new long[]{0x0000050000000000L});
        public static final BitSet FOLLOW_rule__Escribir__Group__3_in_rule__Escribir__Group__25283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__OperadorAssignment_2_in_rule__Escribir__Group__2__Impl5310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__3__Impl_in_rule__Escribir__Group__35340 = new BitSet(new long[]{0x0000050000000000L});
        public static final BitSet FOLLOW_rule__Escribir__Group__4_in_rule__Escribir__Group__35343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__0_in_rule__Escribir__Group__3__Impl5370 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__4__Impl_in_rule__Escribir__Group__45401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Escribir__Group__4__Impl5429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__0__Impl_in_rule__Escribir__Group_3__05470 = new BitSet(new long[]{0x02000000016002F0L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__1_in_rule__Escribir__Group_3__05473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Escribir__Group_3__0__Impl5501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__1__Impl_in_rule__Escribir__Group_3__15532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__OperadorAssignment_3_1_in_rule__Escribir__Group_3__1__Impl5559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__0__Impl_in_rule__Leer__Group__05593 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Leer__Group__1_in_rule__Leer__Group__05596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Leer__Group__0__Impl5624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__1__Impl_in_rule__Leer__Group__15655 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Leer__Group__2_in_rule__Leer__Group__15658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Leer__Group__1__Impl5686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__2__Impl_in_rule__Leer__Group__25717 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Leer__Group__3_in_rule__Leer__Group__25720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__VariableAssignment_2_in_rule__Leer__Group__2__Impl5747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__3__Impl_in_rule__Leer__Group__35777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Leer__Group__3__Impl5805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__0__Impl_in_rule__Si__Group__05844 = new BitSet(new long[]{0x02000200016002F0L});
        public static final BitSet FOLLOW_rule__Si__Group__1_in_rule__Si__Group__05847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Si__Group__0__Impl5875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__1__Impl_in_rule__Si__Group__15906 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__Si__Group__2_in_rule__Si__Group__15909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__ValorAssignment_1_in_rule__Si__Group__1__Impl5936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__2__Impl_in_rule__Si__Group__25966 = new BitSet(new long[]{0x045370000007C030L});
        public static final BitSet FOLLOW_rule__Si__Group__3_in_rule__Si__Group__25969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Si__Group__2__Impl5997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__3__Impl_in_rule__Si__Group__36028 = new BitSet(new long[]{0x045370000007C030L});
        public static final BitSet FOLLOW_rule__Si__Group__4_in_rule__Si__Group__36031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group_3__0_in_rule__Si__Group__3__Impl6058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__4__Impl_in_rule__Si__Group__46089 = new BitSet(new long[]{0x045370000007C030L});
        public static final BitSet FOLLOW_rule__Si__Group__5_in_rule__Si__Group__46092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__SinoAssignment_4_in_rule__Si__Group__4__Impl6119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__5__Impl_in_rule__Si__Group__56150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Si__Group__5__Impl6178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group_3__0__Impl_in_rule__Si__Group_3__06221 = new BitSet(new long[]{0x005270000007C030L});
        public static final BitSet FOLLOW_rule__Si__Group_3__1_in_rule__Si__Group_3__06224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__SentenciasAssignment_3_0_in_rule__Si__Group_3__0__Impl6251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group_3__1__Impl_in_rule__Si__Group_3__16281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__SentenciasAssignment_3_1_in_rule__Si__Group_3__1__Impl6308 = new BitSet(new long[]{0x005270000007C032L});
        public static final BitSet FOLLOW_rule__Mientras__Group__0__Impl_in_rule__Mientras__Group__06343 = new BitSet(new long[]{0x02000200016002F0L});
        public static final BitSet FOLLOW_rule__Mientras__Group__1_in_rule__Mientras__Group__06346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Mientras__Group__0__Impl6374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__1__Impl_in_rule__Mientras__Group__16405 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__Mientras__Group__2_in_rule__Mientras__Group__16408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__ValorAssignment_1_in_rule__Mientras__Group__1__Impl6435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__2__Impl_in_rule__Mientras__Group__26465 = new BitSet(new long[]{0x005A70000007C030L});
        public static final BitSet FOLLOW_rule__Mientras__Group__3_in_rule__Mientras__Group__26468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Mientras__Group__2__Impl6496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__3__Impl_in_rule__Mientras__Group__36527 = new BitSet(new long[]{0x005A70000007C030L});
        public static final BitSet FOLLOW_rule__Mientras__Group__4_in_rule__Mientras__Group__36530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__0_in_rule__Mientras__Group__3__Impl6557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__4__Impl_in_rule__Mientras__Group__46588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Mientras__Group__4__Impl6616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__0__Impl_in_rule__Mientras__Group_3__06657 = new BitSet(new long[]{0x005270000007C030L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__1_in_rule__Mientras__Group_3__06660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__SentenciasAssignment_3_0_in_rule__Mientras__Group_3__0__Impl6687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__1__Impl_in_rule__Mientras__Group_3__16717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__SentenciasAssignment_3_1_in_rule__Mientras__Group_3__1__Impl6744 = new BitSet(new long[]{0x005270000007C032L});
        public static final BitSet FOLLOW_rule__Repetir__Group__0__Impl_in_rule__Repetir__Group__06779 = new BitSet(new long[]{0x007270000007C030L});
        public static final BitSet FOLLOW_rule__Repetir__Group__1_in_rule__Repetir__Group__06782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Repetir__Group__0__Impl6810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group__1__Impl_in_rule__Repetir__Group__16841 = new BitSet(new long[]{0x007270000007C030L});
        public static final BitSet FOLLOW_rule__Repetir__Group__2_in_rule__Repetir__Group__16844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__0_in_rule__Repetir__Group__1__Impl6871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group__2__Impl_in_rule__Repetir__Group__26902 = new BitSet(new long[]{0x02000200016002F0L});
        public static final BitSet FOLLOW_rule__Repetir__Group__3_in_rule__Repetir__Group__26905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__Repetir__Group__2__Impl6933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group__3__Impl_in_rule__Repetir__Group__36964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__ValorAssignment_3_in_rule__Repetir__Group__3__Impl6991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__0__Impl_in_rule__Repetir__Group_1__07029 = new BitSet(new long[]{0x005270000007C030L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__1_in_rule__Repetir__Group_1__07032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__SentenciasAssignment_1_0_in_rule__Repetir__Group_1__0__Impl7059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__1__Impl_in_rule__Repetir__Group_1__17089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__SentenciasAssignment_1_1_in_rule__Repetir__Group_1__1__Impl7116 = new BitSet(new long[]{0x005270000007C032L});
        public static final BitSet FOLLOW_rule__Desde__Group__0__Impl_in_rule__Desde__Group__07151 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Desde__Group__1_in_rule__Desde__Group__07154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__Desde__Group__0__Impl7182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__1__Impl_in_rule__Desde__Group__17213 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_rule__Desde__Group__2_in_rule__Desde__Group__17216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__AsignacionAssignment_1_in_rule__Desde__Group__1__Impl7243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__2__Impl_in_rule__Desde__Group__27273 = new BitSet(new long[]{0x02000200016002F0L});
        public static final BitSet FOLLOW_rule__Desde__Group__3_in_rule__Desde__Group__27276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__Desde__Group__2__Impl7304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__3__Impl_in_rule__Desde__Group__37335 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__Desde__Group__4_in_rule__Desde__Group__37338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__ValorAssignment_3_in_rule__Desde__Group__3__Impl7365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__4__Impl_in_rule__Desde__Group__47395 = new BitSet(new long[]{0x015270000007C030L});
        public static final BitSet FOLLOW_rule__Desde__Group__5_in_rule__Desde__Group__47398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Desde__Group__4__Impl7426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__5__Impl_in_rule__Desde__Group__57457 = new BitSet(new long[]{0x015270000007C030L});
        public static final BitSet FOLLOW_rule__Desde__Group__6_in_rule__Desde__Group__57460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__0_in_rule__Desde__Group__5__Impl7487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__6__Impl_in_rule__Desde__Group__67518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Desde__Group__6__Impl7546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__0__Impl_in_rule__Desde__Group_5__07591 = new BitSet(new long[]{0x005270000007C030L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__1_in_rule__Desde__Group_5__07594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__SentenciasAssignment_5_0_in_rule__Desde__Group_5__0__Impl7621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__1__Impl_in_rule__Desde__Group_5__17651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__SentenciasAssignment_5_1_in_rule__Desde__Group_5__1__Impl7678 = new BitSet(new long[]{0x005270000007C032L});
        public static final BitSet FOLLOW_rule__Incremento__Group__0__Impl_in_rule__Incremento__Group__07713 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_rule__Incremento__Group__1_in_rule__Incremento__Group__07716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Incremento__NombreAssignment_0_in_rule__Incremento__Group__0__Impl7743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Incremento__Group__1__Impl_in_rule__Incremento__Group__17773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Incremento__SsignoAssignment_1_in_rule__Incremento__Group__1__Impl7800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__07834 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__07837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__NombreAssignment_0_in_rule__Variable__Group__0__Impl7864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__17894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__MatAssignment_1_in_rule__Variable__Group__1__Impl7921 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__VariableID__Group__0__Impl_in_rule__VariableID__Group__07956 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__VariableID__Group__1_in_rule__VariableID__Group__07959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__NombreAssignment_0_in_rule__VariableID__Group__0__Impl7986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group__1__Impl_in_rule__VariableID__Group__18016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__MatAssignment_1_in_rule__VariableID__Group__1__Impl8043 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__08078 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__08081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__EInt__Group__0__Impl8110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__18143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl8170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__08203 = new BitSet(new long[]{0x0200000001000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__08206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__EFloat__Group__0__Impl8235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__18268 = new BitSet(new long[]{0x0200000001000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__18271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl8299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__28330 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__28333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__EFloat__Group__2__Impl8361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__38392 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__38395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl8422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__48451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl8478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__08519 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__08522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl8549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__18579 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__18582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__EFloat__Group_4__1__Impl8611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__28644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl8671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__0__Impl_in_rule__Operacion__Group__08706 = new BitSet(new long[]{0x02000200016002F0L});
        public static final BitSet FOLLOW_rule__Operacion__Group__1_in_rule__Operacion__Group__08709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Operacion__Group__0__Impl8737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__1__Impl_in_rule__Operacion__Group__18768 = new BitSet(new long[]{0x00000007FF800000L});
        public static final BitSet FOLLOW_rule__Operacion__Group__2_in_rule__Operacion__Group__18771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Op_izqAssignment_1_in_rule__Operacion__Group__1__Impl8798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__2__Impl_in_rule__Operacion__Group__28828 = new BitSet(new long[]{0x02000200016002F0L});
        public static final BitSet FOLLOW_rule__Operacion__Group__3_in_rule__Operacion__Group__28831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Signo_opAssignment_2_in_rule__Operacion__Group__2__Impl8858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__3__Impl_in_rule__Operacion__Group__38888 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Operacion__Group__4_in_rule__Operacion__Group__38891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Op_derAssignment_3_in_rule__Operacion__Group__3__Impl8918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__4__Impl_in_rule__Operacion__Group__48948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Operacion__Group__4__Impl8976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group__0__Impl_in_rule__Sino__Group__09017 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_rule__Sino__Group__1_in_rule__Sino__Group__09020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group__1__Impl_in_rule__Sino__Group__19078 = new BitSet(new long[]{0x005270000007C030L});
        public static final BitSet FOLLOW_rule__Sino__Group__2_in_rule__Sino__Group__19081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__Sino__Group__1__Impl9109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group__2__Impl_in_rule__Sino__Group__29140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__0_in_rule__Sino__Group__2__Impl9167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__0__Impl_in_rule__Sino__Group_2__09204 = new BitSet(new long[]{0x005270000007C030L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__1_in_rule__Sino__Group_2__09207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__SentenciasAssignment_2_0_in_rule__Sino__Group_2__0__Impl9234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__1__Impl_in_rule__Sino__Group_2__19264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__SentenciasAssignment_2_1_in_rule__Sino__Group_2__1__Impl9291 = new BitSet(new long[]{0x005270000007C032L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__0__Impl_in_rule__ParametroFuncion__Group__09326 = new BitSet(new long[]{0x0000002000080000L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__1_in_rule__ParametroFuncion__Group__09329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__TipoAssignment_0_in_rule__ParametroFuncion__Group__0__Impl9356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__1__Impl_in_rule__ParametroFuncion__Group__19386 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__2_in_rule__ParametroFuncion__Group__19389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__PasoAssignment_1_in_rule__ParametroFuncion__Group__1__Impl9416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__2__Impl_in_rule__ParametroFuncion__Group__29446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__VariableAssignment_2_in_rule__ParametroFuncion__Group__2__Impl9473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__0__Impl_in_rule__Funcion__Group__09509 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__1_in_rule__Funcion__Group__09512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__TipoAssignment_0_in_rule__Funcion__Group__0__Impl9539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__1__Impl_in_rule__Funcion__Group__19569 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Funcion__Group__2_in_rule__Funcion__Group__19572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__Funcion__Group__1__Impl9600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__2__Impl_in_rule__Funcion__Group__29631 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__3_in_rule__Funcion__Group__29634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__NombreAssignment_2_in_rule__Funcion__Group__2__Impl9661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__3__Impl_in_rule__Funcion__Group__39691 = new BitSet(new long[]{0x000004000007C000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__4_in_rule__Funcion__Group__39694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Funcion__Group__3__Impl9722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__4__Impl_in_rule__Funcion__Group__49753 = new BitSet(new long[]{0x000004000007C000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__5_in_rule__Funcion__Group__49756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__0_in_rule__Funcion__Group__4__Impl9783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__5__Impl_in_rule__Funcion__Group__59814 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__6_in_rule__Funcion__Group__59817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Funcion__Group__5__Impl9845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__6__Impl_in_rule__Funcion__Group__69876 = new BitSet(new long[]{0x105270000007C030L});
        public static final BitSet FOLLOW_rule__Funcion__Group__7_in_rule__Funcion__Group__69879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Funcion__Group__6__Impl9907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__7__Impl_in_rule__Funcion__Group__79938 = new BitSet(new long[]{0x105270000007C030L});
        public static final BitSet FOLLOW_rule__Funcion__Group__8_in_rule__Funcion__Group__79941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__0_in_rule__Funcion__Group__7__Impl9968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__8__Impl_in_rule__Funcion__Group__89999 = new BitSet(new long[]{0x02000200016002F0L});
        public static final BitSet FOLLOW_rule__Funcion__Group__9_in_rule__Funcion__Group__810002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__Funcion__Group__8__Impl10030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__9__Impl_in_rule__Funcion__Group__910061 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__10_in_rule__Funcion__Group__910064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__DevuelveAssignment_9_in_rule__Funcion__Group__9__Impl10091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__10__Impl_in_rule__Funcion__Group__1010121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__Funcion__Group__10__Impl10149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__0__Impl_in_rule__Funcion__Group_4__010202 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__1_in_rule__Funcion__Group_4__010205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_0_in_rule__Funcion__Group_4__0__Impl10232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__1__Impl_in_rule__Funcion__Group_4__110262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__0_in_rule__Funcion__Group_4__1__Impl10289 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__0__Impl_in_rule__Funcion__Group_4_1__010324 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__1_in_rule__Funcion__Group_4_1__010327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Funcion__Group_4_1__0__Impl10355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__1__Impl_in_rule__Funcion__Group_4_1__110386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_1_1_in_rule__Funcion__Group_4_1__1__Impl10413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__0__Impl_in_rule__Funcion__Group_7__010447 = new BitSet(new long[]{0x005270000007C030L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__1_in_rule__Funcion__Group_7__010450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__SentenciasAssignment_7_0_in_rule__Funcion__Group_7__0__Impl10477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__1__Impl_in_rule__Funcion__Group_7__110507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__SentenciasAssignment_7_1_in_rule__Funcion__Group_7__1__Impl10534 = new BitSet(new long[]{0x005270000007C032L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__0__Impl_in_rule__Procedimiento__Group__010569 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__1_in_rule__Procedimiento__Group__010572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__Procedimiento__Group__0__Impl10600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__1__Impl_in_rule__Procedimiento__Group__110631 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__2_in_rule__Procedimiento__Group__110634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__NombreAssignment_1_in_rule__Procedimiento__Group__1__Impl10661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__2__Impl_in_rule__Procedimiento__Group__210691 = new BitSet(new long[]{0x000004000007C000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__3_in_rule__Procedimiento__Group__210694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Procedimiento__Group__2__Impl10722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__3__Impl_in_rule__Procedimiento__Group__310753 = new BitSet(new long[]{0x000004000007C000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__4_in_rule__Procedimiento__Group__310756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__0_in_rule__Procedimiento__Group__3__Impl10783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__4__Impl_in_rule__Procedimiento__Group__410814 = new BitSet(new long[]{0x805270000007C030L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__5_in_rule__Procedimiento__Group__410817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Procedimiento__Group__4__Impl10845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__5__Impl_in_rule__Procedimiento__Group__510876 = new BitSet(new long[]{0x805270000007C030L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__6_in_rule__Procedimiento__Group__510879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_5__0_in_rule__Procedimiento__Group__5__Impl10906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__6__Impl_in_rule__Procedimiento__Group__610937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rule__Procedimiento__Group__6__Impl10965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__0__Impl_in_rule__Procedimiento__Group_3__011010 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__1_in_rule__Procedimiento__Group_3__011013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_0_in_rule__Procedimiento__Group_3__0__Impl11040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__1__Impl_in_rule__Procedimiento__Group_3__111070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__0_in_rule__Procedimiento__Group_3__1__Impl11097 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__0__Impl_in_rule__Procedimiento__Group_3_1__011132 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__1_in_rule__Procedimiento__Group_3_1__011135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Procedimiento__Group_3_1__0__Impl11163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__1__Impl_in_rule__Procedimiento__Group_3_1__111194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_1_1_in_rule__Procedimiento__Group_3_1__1__Impl11221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_5__0__Impl_in_rule__Procedimiento__Group_5__011255 = new BitSet(new long[]{0x005270000007C030L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_5__1_in_rule__Procedimiento__Group_5__011258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__SentenciasAssignment_5_0_in_rule__Procedimiento__Group_5__0__Impl11285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_5__1__Impl_in_rule__Procedimiento__Group_5__111315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__SentenciasAssignment_5_1_in_rule__Procedimiento__Group_5__1__Impl11342 = new BitSet(new long[]{0x005270000007C032L});
        public static final BitSet FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_011382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_111413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInicio_in_rule__Codigo__TieneAssignment_111444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAR_in_rule__Caracter__ContenidoAssignment11475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_2_011506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_2_111537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_rule__DeclaracionVariable__TipoAssignment_011568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_111599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_2_111630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__LlamadaFuncion__NombreAssignment_011661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_011692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_1_111723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Asignacion__LvalueAssignment_011754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_MATRIZ_in_rule__Asignacion__MatAssignment_111785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Asignacion__OperadorAssignment_311816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_211847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_3_111878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__Leer__VariableAssignment_211909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Si__ValorAssignment_111940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_011971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_112002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSino_in_rule__Si__SinoAssignment_412033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Mientras__ValorAssignment_112064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_012095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_112126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_012157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_112188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Repetir__ValorAssignment_312219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_rule__Desde__AsignacionAssignment_112250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Desde__ValorAssignment_312281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_012312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_112343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Incremento__NombreAssignment_012374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinc_in_rule__Incremento__SsignoAssignment_112405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Variable__NombreAssignment_012436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_MATRIZ_in_rule__Variable__MatAssignment_112467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VariableID__NombreAssignment_012498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_MATRIZ_in_rule__VariableID__MatAssignment_112529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAD_in_rule__ConstCadena__ContenidoAssignment12560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__NumeroEntero__ValorAssignment12591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_rule__NumeroDecimal__ValorAssignment12622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_rule__ValorBooleano__ValorAssignment12653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_izq_in_rule__Operacion__Op_izqAssignment_112684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesigno_in_rule__Operacion__Signo_opAssignment_212715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_der_in_rule__Operacion__Op_derAssignment_312746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Operando_izq__Oper_izqAssignment12777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Operando_der__Oper_derAssignment12808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_012839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_112870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_rule__ParametroFuncion__TipoAssignment_012901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_rule__ParametroFuncion__PasoAssignment_112932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__ParametroFuncion__VariableAssignment_212963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_rule__Funcion__TipoAssignment_012994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Funcion__NombreAssignment_213025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_013056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_1_113087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_7_013118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_7_113149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Funcion__DevuelveAssignment_913180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Procedimiento__NombreAssignment_113211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_013242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_1_113273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_5_013304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_5_113335 = new BitSet(new long[]{0x0000000000000002L});
    }


}