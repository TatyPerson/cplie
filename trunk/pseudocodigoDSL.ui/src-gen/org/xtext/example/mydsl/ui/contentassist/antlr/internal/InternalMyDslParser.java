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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_CAR", "RULE_MATRIZ", "RULE_CAD", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entero'", "'caracter'", "'real'", "'logico'", "'cadena'", "'E'", "'e'", "'verdadero'", "'falso'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'>='", "'<='", "'y'", "'o'", "'=='", "'!='", "'++'", "'--'", "'E/S'", "'var'", "'inicio'", "'fin_inicio'", "','", "'('", "')'", "'='", "'escribir'", "'leer'", "'si'", "'entonces'", "'fin si'", "'mientras'", "'hacer'", "'fin_mientras'", "'repetir'", "'hasta_que'", "'desde'", "'hasta'", "'fin_desde'", "'.'", "'sino'", "'funcion'", "'devolver'", "'fin_funcion'", "'procedimiento'", "'fin_procedimiento'"
    };
    public static final int RULE_ID=5;
    public static final int T__64=64;
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
            else if ( (LA1_0==63) ) {
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:1: rule__Sentencias__Alternatives : ( ( ruleLlamadaFuncion ) | ( ruleAsignacion ) | ( ruleEscribir ) | ( ruleLeer ) | ( ruleSi ) | ( rulemientras ) | ( rulerepetir ) | ( ruledesde ) | ( ruleincremento ) );
    public final void rule__Sentencias__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:1: ( ( ruleLlamadaFuncion ) | ( ruleAsignacion ) | ( ruleEscribir ) | ( ruleLeer ) | ( ruleSi ) | ( rulemientras ) | ( rulerepetir ) | ( ruledesde ) | ( ruleincremento ) )
            int alt2=9;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:1: ( ruleLlamadaFuncion )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:1: ( ruleLlamadaFuncion )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: ruleLlamadaFuncion
                    {
                     before(grammarAccess.getSentenciasAccess().getLlamadaFuncionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_rule__Sentencias__Alternatives2399);
                    ruleLlamadaFuncion();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getLlamadaFuncionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1157:6: ( ruleAsignacion )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1157:6: ( ruleAsignacion )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:1: ruleAsignacion
                    {
                     before(grammarAccess.getSentenciasAccess().getAsignacionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_rule__Sentencias__Alternatives2416);
                    ruleAsignacion();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getAsignacionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:6: ( ruleEscribir )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:6: ( ruleEscribir )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1164:1: ruleEscribir
                    {
                     before(grammarAccess.getSentenciasAccess().getEscribirParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_rule__Sentencias__Alternatives2433);
                    ruleEscribir();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getEscribirParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:6: ( ruleLeer )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:6: ( ruleLeer )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: ruleLeer
                    {
                     before(grammarAccess.getSentenciasAccess().getLeerParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLeer_in_rule__Sentencias__Alternatives2450);
                    ruleLeer();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getLeerParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:6: ( ruleSi )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:6: ( ruleSi )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:1: ruleSi
                    {
                     before(grammarAccess.getSentenciasAccess().getSiParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSi_in_rule__Sentencias__Alternatives2467);
                    ruleSi();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getSiParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:6: ( rulemientras )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:6: ( rulemientras )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:1: rulemientras
                    {
                     before(grammarAccess.getSentenciasAccess().getMientrasParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_rulemientras_in_rule__Sentencias__Alternatives2484);
                    rulemientras();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getMientrasParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:6: ( rulerepetir )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:6: ( rulerepetir )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:1: rulerepetir
                    {
                     before(grammarAccess.getSentenciasAccess().getRepetirParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_rulerepetir_in_rule__Sentencias__Alternatives2501);
                    rulerepetir();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getRepetirParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1193:6: ( ruledesde )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1193:6: ( ruledesde )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:1: ruledesde
                    {
                     before(grammarAccess.getSentenciasAccess().getDesdeParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruledesde_in_rule__Sentencias__Alternatives2518);
                    ruledesde();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getDesdeParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:6: ( ruleincremento )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:6: ( ruleincremento )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: ruleincremento
                    {
                     before(grammarAccess.getSentenciasAccess().getIncrementoParserRuleCall_8()); 
                    pushFollow(FollowSets000.FOLLOW_ruleincremento_in_rule__Sentencias__Alternatives2535);
                    ruleincremento();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getIncrementoParserRuleCall_8()); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: rule__Operador__Alternatives : ( ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleCaracter ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleValorBooleano ) );
    public final void rule__Operador__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1214:1: ( ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleCaracter ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleValorBooleano ) )
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

                    if ( (LA3_5==58) ) {
                        alt3=5;
                    }
                    else if ( (LA3_5==EOF||LA3_5==41||LA3_5==43) ) {
                        alt3=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_4==58) ) {
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

                if ( (LA3_5==58) ) {
                    alt3=5;
                }
                else if ( (LA3_5==EOF||LA3_5==41||LA3_5==43) ) {
                    alt3=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            case 58:
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
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:1: ( ruleVariableID )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:1: ( ruleVariableID )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1216:1: ruleVariableID
                    {
                     before(grammarAccess.getOperadorAccess().getVariableIDParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__Operador__Alternatives2567);
                    ruleVariableID();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getVariableIDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1221:6: ( ruleConstCadena )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1221:6: ( ruleConstCadena )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1222:1: ruleConstCadena
                    {
                     before(grammarAccess.getOperadorAccess().getConstCadenaParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_rule__Operador__Alternatives2584);
                    ruleConstCadena();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getConstCadenaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1227:6: ( ruleCaracter )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1227:6: ( ruleCaracter )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:1: ruleCaracter
                    {
                     before(grammarAccess.getOperadorAccess().getCaracterParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_rule__Operador__Alternatives2601);
                    ruleCaracter();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getCaracterParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:6: ( ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:6: ( ruleNumeroEntero )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:1: ruleNumeroEntero
                    {
                     before(grammarAccess.getOperadorAccess().getNumeroEnteroParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_rule__Operador__Alternatives2618);
                    ruleNumeroEntero();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getNumeroEnteroParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1239:6: ( ruleNumeroDecimal )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1239:6: ( ruleNumeroDecimal )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1240:1: ruleNumeroDecimal
                    {
                     before(grammarAccess.getOperadorAccess().getNumeroDecimalParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_rule__Operador__Alternatives2635);
                    ruleNumeroDecimal();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getNumeroDecimalParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:6: ( ruleValorBooleano )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:6: ( ruleValorBooleano )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: ruleValorBooleano
                    {
                     before(grammarAccess.getOperadorAccess().getValorBooleanoParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_rule__Operador__Alternatives2652);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1256:1: rule__Valor__Alternatives : ( ( ruleLlamadaFuncion ) | ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleoperacion ) | ( ruleValorBooleano ) | ( ruleCaracter ) );
    public final void rule__Valor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: ( ( ruleLlamadaFuncion ) | ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleoperacion ) | ( ruleValorBooleano ) | ( ruleCaracter ) )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:1: ( ruleLlamadaFuncion )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:1: ( ruleLlamadaFuncion )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1262:1: ruleLlamadaFuncion
                    {
                     before(grammarAccess.getValorAccess().getLlamadaFuncionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_rule__Valor__Alternatives2684);
                    ruleLlamadaFuncion();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getLlamadaFuncionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:6: ( ruleVariableID )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:6: ( ruleVariableID )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1268:1: ruleVariableID
                    {
                     before(grammarAccess.getValorAccess().getVariableIDParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__Valor__Alternatives2701);
                    ruleVariableID();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getVariableIDParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:6: ( ruleConstCadena )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:6: ( ruleConstCadena )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:1: ruleConstCadena
                    {
                     before(grammarAccess.getValorAccess().getConstCadenaParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_rule__Valor__Alternatives2718);
                    ruleConstCadena();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getConstCadenaParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1279:6: ( ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1279:6: ( ruleNumeroEntero )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:1: ruleNumeroEntero
                    {
                     before(grammarAccess.getValorAccess().getNumeroEnteroParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_rule__Valor__Alternatives2735);
                    ruleNumeroEntero();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getNumeroEnteroParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:6: ( ruleNumeroDecimal )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:6: ( ruleNumeroDecimal )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: ruleNumeroDecimal
                    {
                     before(grammarAccess.getValorAccess().getNumeroDecimalParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_rule__Valor__Alternatives2752);
                    ruleNumeroDecimal();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getNumeroDecimalParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1291:6: ( ruleoperacion )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1291:6: ( ruleoperacion )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: ruleoperacion
                    {
                     before(grammarAccess.getValorAccess().getOperacionParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rule__Valor__Alternatives2769);
                    ruleoperacion();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getOperacionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:6: ( ruleValorBooleano )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:6: ( ruleValorBooleano )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: ruleValorBooleano
                    {
                     before(grammarAccess.getValorAccess().getValorBooleanoParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_rule__Valor__Alternatives2786);
                    ruleValorBooleano();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getValorBooleanoParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:6: ( ruleCaracter )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:6: ( ruleCaracter )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:1: ruleCaracter
                    {
                     before(grammarAccess.getValorAccess().getCaracterParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_rule__Valor__Alternatives2803);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1314:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1318:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( RULE_STRING )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( RULE_STRING )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives2835); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1325:6: ( RULE_ID )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1325:6: ( RULE_ID )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1326:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives2852); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: rule__TipoVariable__Alternatives : ( ( 'entero' ) | ( 'caracter' ) | ( 'real' ) | ( 'logico' ) | ( 'cadena' ) );
    public final void rule__TipoVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1340:1: ( ( 'entero' ) | ( 'caracter' ) | ( 'real' ) | ( 'logico' ) | ( 'cadena' ) )
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
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:1: ( 'entero' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:1: ( 'entero' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1342:1: 'entero'
                    {
                     before(grammarAccess.getTipoVariableAccess().getEnteroKeyword_0()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__TipoVariable__Alternatives2885); 
                     after(grammarAccess.getTipoVariableAccess().getEnteroKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:6: ( 'caracter' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:6: ( 'caracter' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: 'caracter'
                    {
                     before(grammarAccess.getTipoVariableAccess().getCaracterKeyword_1()); 
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__TipoVariable__Alternatives2905); 
                     after(grammarAccess.getTipoVariableAccess().getCaracterKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1357:6: ( 'real' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1357:6: ( 'real' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: 'real'
                    {
                     before(grammarAccess.getTipoVariableAccess().getRealKeyword_2()); 
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__TipoVariable__Alternatives2925); 
                     after(grammarAccess.getTipoVariableAccess().getRealKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:6: ( 'logico' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:6: ( 'logico' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:1: 'logico'
                    {
                     before(grammarAccess.getTipoVariableAccess().getLogicoKeyword_3()); 
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__TipoVariable__Alternatives2945); 
                     after(grammarAccess.getTipoVariableAccess().getLogicoKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1373:6: ( 'cadena' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1373:6: ( 'cadena' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1374:1: 'cadena'
                    {
                     before(grammarAccess.getTipoVariableAccess().getCadenaKeyword_4()); 
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__TipoVariable__Alternatives2965); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1386:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: ( ( 'E' ) | ( 'e' ) )
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
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: ( 'E' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: ( 'E' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__EFloat__Alternatives_4_03000); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1399:6: ( 'e' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1399:6: ( 'e' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1400:1: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__EFloat__Alternatives_4_03020); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:1: rule__Booleano__Alternatives : ( ( 'verdadero' ) | ( 'falso' ) );
    public final void rule__Booleano__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1416:1: ( ( 'verdadero' ) | ( 'falso' ) )
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
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1417:1: ( 'verdadero' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1417:1: ( 'verdadero' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1418:1: 'verdadero'
                    {
                     before(grammarAccess.getBooleanoAccess().getVerdaderoKeyword_0()); 
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__Booleano__Alternatives3055); 
                     after(grammarAccess.getBooleanoAccess().getVerdaderoKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:6: ( 'falso' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:6: ( 'falso' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1426:1: 'falso'
                    {
                     before(grammarAccess.getBooleanoAccess().getFalsoKeyword_1()); 
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__Booleano__Alternatives3075); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:1: rule__Signo__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '<' ) | ( '>' ) | ( '>=' ) | ( '<=' ) | ( 'y' ) | ( 'o' ) | ( '==' ) | ( '!=' ) );
    public final void rule__Signo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '<' ) | ( '>' ) | ( '>=' ) | ( '<=' ) | ( 'y' ) | ( 'o' ) | ( '==' ) | ( '!=' ) )
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
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1443:1: ( '+' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1443:1: ( '+' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1444:1: '+'
                    {
                     before(grammarAccess.getSignoAccess().getPlusSignKeyword_0()); 
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__Signo__Alternatives3110); 
                     after(grammarAccess.getSignoAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:6: ( '-' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:6: ( '-' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: '-'
                    {
                     before(grammarAccess.getSignoAccess().getHyphenMinusKeyword_1()); 
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__Signo__Alternatives3130); 
                     after(grammarAccess.getSignoAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1459:6: ( '*' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1459:6: ( '*' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1460:1: '*'
                    {
                     before(grammarAccess.getSignoAccess().getAsteriskKeyword_2()); 
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__Signo__Alternatives3150); 
                     after(grammarAccess.getSignoAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1467:6: ( '/' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1467:6: ( '/' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: '/'
                    {
                     before(grammarAccess.getSignoAccess().getSolidusKeyword_3()); 
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__Signo__Alternatives3170); 
                     after(grammarAccess.getSignoAccess().getSolidusKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1475:6: ( '<' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1475:6: ( '<' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1476:1: '<'
                    {
                     before(grammarAccess.getSignoAccess().getLessThanSignKeyword_4()); 
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__Signo__Alternatives3190); 
                     after(grammarAccess.getSignoAccess().getLessThanSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:6: ( '>' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:6: ( '>' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:1: '>'
                    {
                     before(grammarAccess.getSignoAccess().getGreaterThanSignKeyword_5()); 
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__Signo__Alternatives3210); 
                     after(grammarAccess.getSignoAccess().getGreaterThanSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1491:6: ( '>=' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1491:6: ( '>=' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1492:1: '>='
                    {
                     before(grammarAccess.getSignoAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__Signo__Alternatives3230); 
                     after(grammarAccess.getSignoAccess().getGreaterThanSignEqualsSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1499:6: ( '<=' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1499:6: ( '<=' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: '<='
                    {
                     before(grammarAccess.getSignoAccess().getLessThanSignEqualsSignKeyword_7()); 
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__Signo__Alternatives3250); 
                     after(grammarAccess.getSignoAccess().getLessThanSignEqualsSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1507:6: ( 'y' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1507:6: ( 'y' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1508:1: 'y'
                    {
                     before(grammarAccess.getSignoAccess().getYKeyword_8()); 
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__Signo__Alternatives3270); 
                     after(grammarAccess.getSignoAccess().getYKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1515:6: ( 'o' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1515:6: ( 'o' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1516:1: 'o'
                    {
                     before(grammarAccess.getSignoAccess().getOKeyword_9()); 
                    match(input,32,FollowSets000.FOLLOW_32_in_rule__Signo__Alternatives3290); 
                     after(grammarAccess.getSignoAccess().getOKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:6: ( '==' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:6: ( '==' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1524:1: '=='
                    {
                     before(grammarAccess.getSignoAccess().getEqualsSignEqualsSignKeyword_10()); 
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__Signo__Alternatives3310); 
                     after(grammarAccess.getSignoAccess().getEqualsSignEqualsSignKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:6: ( '!=' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:6: ( '!=' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:1: '!='
                    {
                     before(grammarAccess.getSignoAccess().getExclamationMarkEqualsSignKeyword_11()); 
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__Signo__Alternatives3330); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:1: rule__Inc__Alternatives : ( ( '++' ) | ( '--' ) );
    public final void rule__Inc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: ( ( '++' ) | ( '--' ) )
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
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: ( '++' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: ( '++' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1550:1: '++'
                    {
                     before(grammarAccess.getIncAccess().getPlusSignPlusSignKeyword_0()); 
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__Inc__Alternatives3365); 
                     after(grammarAccess.getIncAccess().getPlusSignPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1557:6: ( '--' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1557:6: ( '--' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1558:1: '--'
                    {
                     before(grammarAccess.getIncAccess().getHyphenMinusHyphenMinusKeyword_1()); 
                    match(input,36,FollowSets000.FOLLOW_36_in_rule__Inc__Alternatives3385); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:1: rule__TipoPaso__Alternatives : ( ( 'E' ) | ( 'E/S' ) );
    public final void rule__TipoPaso__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1574:1: ( ( 'E' ) | ( 'E/S' ) )
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
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1575:1: ( 'E' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1575:1: ( 'E' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1576:1: 'E'
                    {
                     before(grammarAccess.getTipoPasoAccess().getEKeyword_0()); 
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__TipoPaso__Alternatives3420); 
                     after(grammarAccess.getTipoPasoAccess().getEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1583:6: ( 'E/S' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1583:6: ( 'E/S' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:1: 'E/S'
                    {
                     before(grammarAccess.getTipoPasoAccess().getESKeyword_1()); 
                    match(input,37,FollowSets000.FOLLOW_37_in_rule__TipoPaso__Alternatives3440); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:1: rule__Codigo__Group__0 : rule__Codigo__Group__0__Impl rule__Codigo__Group__1 ;
    public final void rule__Codigo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1602:1: ( rule__Codigo__Group__0__Impl rule__Codigo__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:2: rule__Codigo__Group__0__Impl rule__Codigo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group__0__Impl_in_rule__Codigo__Group__03472);
            rule__Codigo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group__1_in_rule__Codigo__Group__03475);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1610:1: rule__Codigo__Group__0__Impl : ( ( rule__Codigo__Group_0__0 )? ) ;
    public final void rule__Codigo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: ( ( ( rule__Codigo__Group_0__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1615:1: ( ( rule__Codigo__Group_0__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1615:1: ( ( rule__Codigo__Group_0__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:1: ( rule__Codigo__Group_0__0 )?
            {
             before(grammarAccess.getCodigoAccess().getGroup_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1617:1: ( rule__Codigo__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=14 && LA12_0<=18)||LA12_0==63) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1617:2: rule__Codigo__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group_0__0_in_rule__Codigo__Group__0__Impl3502);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1627:1: rule__Codigo__Group__1 : rule__Codigo__Group__1__Impl ;
    public final void rule__Codigo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1631:1: ( rule__Codigo__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1632:2: rule__Codigo__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group__1__Impl_in_rule__Codigo__Group__13533);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:1: rule__Codigo__Group__1__Impl : ( ( rule__Codigo__TieneAssignment_1 ) ) ;
    public final void rule__Codigo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: ( ( ( rule__Codigo__TieneAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:1: ( ( rule__Codigo__TieneAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:1: ( ( rule__Codigo__TieneAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: ( rule__Codigo__TieneAssignment_1 )
            {
             before(grammarAccess.getCodigoAccess().getTieneAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: ( rule__Codigo__TieneAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:2: rule__Codigo__TieneAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__TieneAssignment_1_in_rule__Codigo__Group__1__Impl3560);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1659:1: rule__Codigo__Group_0__0 : rule__Codigo__Group_0__0__Impl rule__Codigo__Group_0__1 ;
    public final void rule__Codigo__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: ( rule__Codigo__Group_0__0__Impl rule__Codigo__Group_0__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:2: rule__Codigo__Group_0__0__Impl rule__Codigo__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group_0__0__Impl_in_rule__Codigo__Group_0__03594);
            rule__Codigo__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group_0__1_in_rule__Codigo__Group_0__03597);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1671:1: rule__Codigo__Group_0__0__Impl : ( ( rule__Codigo__FuncionAssignment_0_0 ) ) ;
    public final void rule__Codigo__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1675:1: ( ( ( rule__Codigo__FuncionAssignment_0_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1676:1: ( ( rule__Codigo__FuncionAssignment_0_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1676:1: ( ( rule__Codigo__FuncionAssignment_0_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1677:1: ( rule__Codigo__FuncionAssignment_0_0 )
            {
             before(grammarAccess.getCodigoAccess().getFuncionAssignment_0_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: ( rule__Codigo__FuncionAssignment_0_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:2: rule__Codigo__FuncionAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__FuncionAssignment_0_0_in_rule__Codigo__Group_0__0__Impl3624);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1688:1: rule__Codigo__Group_0__1 : rule__Codigo__Group_0__1__Impl ;
    public final void rule__Codigo__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1692:1: ( rule__Codigo__Group_0__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1693:2: rule__Codigo__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group_0__1__Impl_in_rule__Codigo__Group_0__13654);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1699:1: rule__Codigo__Group_0__1__Impl : ( ( rule__Codigo__FuncionAssignment_0_1 )* ) ;
    public final void rule__Codigo__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:1: ( ( ( rule__Codigo__FuncionAssignment_0_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1704:1: ( ( rule__Codigo__FuncionAssignment_0_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1704:1: ( ( rule__Codigo__FuncionAssignment_0_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1705:1: ( rule__Codigo__FuncionAssignment_0_1 )*
            {
             before(grammarAccess.getCodigoAccess().getFuncionAssignment_0_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1706:1: ( rule__Codigo__FuncionAssignment_0_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=14 && LA13_0<=18)||LA13_0==63) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1706:2: rule__Codigo__FuncionAssignment_0_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Codigo__FuncionAssignment_0_1_in_rule__Codigo__Group_0__1__Impl3681);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1720:1: rule__Inicio__Group__0 : rule__Inicio__Group__0__Impl rule__Inicio__Group__1 ;
    public final void rule__Inicio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: ( rule__Inicio__Group__0__Impl rule__Inicio__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1725:2: rule__Inicio__Group__0__Impl rule__Inicio__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__0__Impl_in_rule__Inicio__Group__03716);
            rule__Inicio__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__1_in_rule__Inicio__Group__03719);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1732:1: rule__Inicio__Group__0__Impl : ( () ) ;
    public final void rule__Inicio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1736:1: ( ( () ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: ( () )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: ( () )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: ()
            {
             before(grammarAccess.getInicioAccess().getInicioAction_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: ()
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1751:1: rule__Inicio__Group__1 : rule__Inicio__Group__1__Impl rule__Inicio__Group__2 ;
    public final void rule__Inicio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:1: ( rule__Inicio__Group__1__Impl rule__Inicio__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:2: rule__Inicio__Group__1__Impl rule__Inicio__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__1__Impl_in_rule__Inicio__Group__13777);
            rule__Inicio__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__2_in_rule__Inicio__Group__13780);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1763:1: rule__Inicio__Group__1__Impl : ( 'var' ) ;
    public final void rule__Inicio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: ( ( 'var' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: ( 'var' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: ( 'var' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:1: 'var'
            {
             before(grammarAccess.getInicioAccess().getVarKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Inicio__Group__1__Impl3808); 
             after(grammarAccess.getInicioAccess().getVarKeyword_1()); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1782:1: rule__Inicio__Group__2 : rule__Inicio__Group__2__Impl rule__Inicio__Group__3 ;
    public final void rule__Inicio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1786:1: ( rule__Inicio__Group__2__Impl rule__Inicio__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1787:2: rule__Inicio__Group__2__Impl rule__Inicio__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__2__Impl_in_rule__Inicio__Group__23839);
            rule__Inicio__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__3_in_rule__Inicio__Group__23842);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1794:1: rule__Inicio__Group__2__Impl : ( ( rule__Inicio__Group_2__0 )? ) ;
    public final void rule__Inicio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:1: ( ( ( rule__Inicio__Group_2__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: ( ( rule__Inicio__Group_2__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: ( ( rule__Inicio__Group_2__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: ( rule__Inicio__Group_2__0 )?
            {
             before(grammarAccess.getInicioAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1801:1: ( rule__Inicio__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=14 && LA14_0<=18)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1801:2: rule__Inicio__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__0_in_rule__Inicio__Group__2__Impl3869);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1811:1: rule__Inicio__Group__3 : rule__Inicio__Group__3__Impl rule__Inicio__Group__4 ;
    public final void rule__Inicio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1815:1: ( rule__Inicio__Group__3__Impl rule__Inicio__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1816:2: rule__Inicio__Group__3__Impl rule__Inicio__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__3__Impl_in_rule__Inicio__Group__33900);
            rule__Inicio__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__4_in_rule__Inicio__Group__33903);
            rule__Inicio__Group__4();

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1823:1: rule__Inicio__Group__3__Impl : ( 'inicio' ) ;
    public final void rule__Inicio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1827:1: ( ( 'inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1828:1: ( 'inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1828:1: ( 'inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: 'inicio'
            {
             before(grammarAccess.getInicioAccess().getInicioKeyword_3()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Inicio__Group__3__Impl3931); 
             after(grammarAccess.getInicioAccess().getInicioKeyword_3()); 

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


    // $ANTLR start "rule__Inicio__Group__4"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1842:1: rule__Inicio__Group__4 : rule__Inicio__Group__4__Impl rule__Inicio__Group__5 ;
    public final void rule__Inicio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1846:1: ( rule__Inicio__Group__4__Impl rule__Inicio__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1847:2: rule__Inicio__Group__4__Impl rule__Inicio__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__4__Impl_in_rule__Inicio__Group__43962);
            rule__Inicio__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__5_in_rule__Inicio__Group__43965);
            rule__Inicio__Group__5();

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
    // $ANTLR end "rule__Inicio__Group__4"


    // $ANTLR start "rule__Inicio__Group__4__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:1: rule__Inicio__Group__4__Impl : ( ( rule__Inicio__Group_4__0 )? ) ;
    public final void rule__Inicio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:1: ( ( ( rule__Inicio__Group_4__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( ( rule__Inicio__Group_4__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( ( rule__Inicio__Group_4__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: ( rule__Inicio__Group_4__0 )?
            {
             before(grammarAccess.getInicioAccess().getGroup_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:1: ( rule__Inicio__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)||(LA15_0>=45 && LA15_0<=47)||LA15_0==50||LA15_0==53||LA15_0==55) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:2: rule__Inicio__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_4__0_in_rule__Inicio__Group__4__Impl3992);
                    rule__Inicio__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInicioAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Inicio__Group__4__Impl"


    // $ANTLR start "rule__Inicio__Group__5"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1871:1: rule__Inicio__Group__5 : rule__Inicio__Group__5__Impl ;
    public final void rule__Inicio__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1875:1: ( rule__Inicio__Group__5__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1876:2: rule__Inicio__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__5__Impl_in_rule__Inicio__Group__54023);
            rule__Inicio__Group__5__Impl();

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
    // $ANTLR end "rule__Inicio__Group__5"


    // $ANTLR start "rule__Inicio__Group__5__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:1: rule__Inicio__Group__5__Impl : ( 'fin_inicio' ) ;
    public final void rule__Inicio__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1886:1: ( ( 'fin_inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1887:1: ( 'fin_inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1887:1: ( 'fin_inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1888:1: 'fin_inicio'
            {
             before(grammarAccess.getInicioAccess().getFin_inicioKeyword_5()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Inicio__Group__5__Impl4051); 
             after(grammarAccess.getInicioAccess().getFin_inicioKeyword_5()); 

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
    // $ANTLR end "rule__Inicio__Group__5__Impl"


    // $ANTLR start "rule__Inicio__Group_2__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1913:1: rule__Inicio__Group_2__0 : rule__Inicio__Group_2__0__Impl rule__Inicio__Group_2__1 ;
    public final void rule__Inicio__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: ( rule__Inicio__Group_2__0__Impl rule__Inicio__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1918:2: rule__Inicio__Group_2__0__Impl rule__Inicio__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__0__Impl_in_rule__Inicio__Group_2__04094);
            rule__Inicio__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__1_in_rule__Inicio__Group_2__04097);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1925:1: rule__Inicio__Group_2__0__Impl : ( ( rule__Inicio__DeclaracionvariableAssignment_2_0 ) ) ;
    public final void rule__Inicio__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1929:1: ( ( ( rule__Inicio__DeclaracionvariableAssignment_2_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1930:1: ( ( rule__Inicio__DeclaracionvariableAssignment_2_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1930:1: ( ( rule__Inicio__DeclaracionvariableAssignment_2_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1931:1: ( rule__Inicio__DeclaracionvariableAssignment_2_0 )
            {
             before(grammarAccess.getInicioAccess().getDeclaracionvariableAssignment_2_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1932:1: ( rule__Inicio__DeclaracionvariableAssignment_2_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1932:2: rule__Inicio__DeclaracionvariableAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__DeclaracionvariableAssignment_2_0_in_rule__Inicio__Group_2__0__Impl4124);
            rule__Inicio__DeclaracionvariableAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getInicioAccess().getDeclaracionvariableAssignment_2_0()); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1942:1: rule__Inicio__Group_2__1 : rule__Inicio__Group_2__1__Impl ;
    public final void rule__Inicio__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1946:1: ( rule__Inicio__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1947:2: rule__Inicio__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__1__Impl_in_rule__Inicio__Group_2__14154);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: rule__Inicio__Group_2__1__Impl : ( ( rule__Inicio__DeclaracionvariableAssignment_2_1 )* ) ;
    public final void rule__Inicio__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1957:1: ( ( ( rule__Inicio__DeclaracionvariableAssignment_2_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1958:1: ( ( rule__Inicio__DeclaracionvariableAssignment_2_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1958:1: ( ( rule__Inicio__DeclaracionvariableAssignment_2_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1959:1: ( rule__Inicio__DeclaracionvariableAssignment_2_1 )*
            {
             before(grammarAccess.getInicioAccess().getDeclaracionvariableAssignment_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1960:1: ( rule__Inicio__DeclaracionvariableAssignment_2_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=14 && LA16_0<=18)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1960:2: rule__Inicio__DeclaracionvariableAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Inicio__DeclaracionvariableAssignment_2_1_in_rule__Inicio__Group_2__1__Impl4181);
            	    rule__Inicio__DeclaracionvariableAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getInicioAccess().getDeclaracionvariableAssignment_2_1()); 

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


    // $ANTLR start "rule__Inicio__Group_4__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:1: rule__Inicio__Group_4__0 : rule__Inicio__Group_4__0__Impl rule__Inicio__Group_4__1 ;
    public final void rule__Inicio__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1978:1: ( rule__Inicio__Group_4__0__Impl rule__Inicio__Group_4__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:2: rule__Inicio__Group_4__0__Impl rule__Inicio__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_4__0__Impl_in_rule__Inicio__Group_4__04216);
            rule__Inicio__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_4__1_in_rule__Inicio__Group_4__04219);
            rule__Inicio__Group_4__1();

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
    // $ANTLR end "rule__Inicio__Group_4__0"


    // $ANTLR start "rule__Inicio__Group_4__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:1: rule__Inicio__Group_4__0__Impl : ( ( rule__Inicio__TieneAssignment_4_0 ) ) ;
    public final void rule__Inicio__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1990:1: ( ( ( rule__Inicio__TieneAssignment_4_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1991:1: ( ( rule__Inicio__TieneAssignment_4_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1991:1: ( ( rule__Inicio__TieneAssignment_4_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:1: ( rule__Inicio__TieneAssignment_4_0 )
            {
             before(grammarAccess.getInicioAccess().getTieneAssignment_4_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1993:1: ( rule__Inicio__TieneAssignment_4_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1993:2: rule__Inicio__TieneAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__TieneAssignment_4_0_in_rule__Inicio__Group_4__0__Impl4246);
            rule__Inicio__TieneAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getInicioAccess().getTieneAssignment_4_0()); 

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
    // $ANTLR end "rule__Inicio__Group_4__0__Impl"


    // $ANTLR start "rule__Inicio__Group_4__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2003:1: rule__Inicio__Group_4__1 : rule__Inicio__Group_4__1__Impl ;
    public final void rule__Inicio__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2007:1: ( rule__Inicio__Group_4__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2008:2: rule__Inicio__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_4__1__Impl_in_rule__Inicio__Group_4__14276);
            rule__Inicio__Group_4__1__Impl();

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
    // $ANTLR end "rule__Inicio__Group_4__1"


    // $ANTLR start "rule__Inicio__Group_4__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2014:1: rule__Inicio__Group_4__1__Impl : ( ( rule__Inicio__TieneAssignment_4_1 )* ) ;
    public final void rule__Inicio__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2018:1: ( ( ( rule__Inicio__TieneAssignment_4_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2019:1: ( ( rule__Inicio__TieneAssignment_4_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2019:1: ( ( rule__Inicio__TieneAssignment_4_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2020:1: ( rule__Inicio__TieneAssignment_4_1 )*
            {
             before(grammarAccess.getInicioAccess().getTieneAssignment_4_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2021:1: ( rule__Inicio__TieneAssignment_4_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)||(LA17_0>=45 && LA17_0<=47)||LA17_0==50||LA17_0==53||LA17_0==55) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2021:2: rule__Inicio__TieneAssignment_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Inicio__TieneAssignment_4_1_in_rule__Inicio__Group_4__1__Impl4303);
            	    rule__Inicio__TieneAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getInicioAccess().getTieneAssignment_4_1()); 

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
    // $ANTLR end "rule__Inicio__Group_4__1__Impl"


    // $ANTLR start "rule__DeclaracionVariable__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2035:1: rule__DeclaracionVariable__Group__0 : rule__DeclaracionVariable__Group__0__Impl rule__DeclaracionVariable__Group__1 ;
    public final void rule__DeclaracionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: ( rule__DeclaracionVariable__Group__0__Impl rule__DeclaracionVariable__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:2: rule__DeclaracionVariable__Group__0__Impl rule__DeclaracionVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__0__Impl_in_rule__DeclaracionVariable__Group__04338);
            rule__DeclaracionVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__1_in_rule__DeclaracionVariable__Group__04341);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2047:1: rule__DeclaracionVariable__Group__0__Impl : ( ( rule__DeclaracionVariable__TipoAssignment_0 ) ) ;
    public final void rule__DeclaracionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2051:1: ( ( ( rule__DeclaracionVariable__TipoAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2052:1: ( ( rule__DeclaracionVariable__TipoAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2052:1: ( ( rule__DeclaracionVariable__TipoAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2053:1: ( rule__DeclaracionVariable__TipoAssignment_0 )
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTipoAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2054:1: ( rule__DeclaracionVariable__TipoAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2054:2: rule__DeclaracionVariable__TipoAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__TipoAssignment_0_in_rule__DeclaracionVariable__Group__0__Impl4368);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2064:1: rule__DeclaracionVariable__Group__1 : rule__DeclaracionVariable__Group__1__Impl rule__DeclaracionVariable__Group__2 ;
    public final void rule__DeclaracionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ( rule__DeclaracionVariable__Group__1__Impl rule__DeclaracionVariable__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:2: rule__DeclaracionVariable__Group__1__Impl rule__DeclaracionVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__1__Impl_in_rule__DeclaracionVariable__Group__14398);
            rule__DeclaracionVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__2_in_rule__DeclaracionVariable__Group__14401);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2076:1: rule__DeclaracionVariable__Group__1__Impl : ( ( rule__DeclaracionVariable__TieneIDsAssignment_1 ) ) ;
    public final void rule__DeclaracionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2080:1: ( ( ( rule__DeclaracionVariable__TieneIDsAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2082:1: ( rule__DeclaracionVariable__TieneIDsAssignment_1 )
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2083:1: ( rule__DeclaracionVariable__TieneIDsAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2083:2: rule__DeclaracionVariable__TieneIDsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_1_in_rule__DeclaracionVariable__Group__1__Impl4428);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2093:1: rule__DeclaracionVariable__Group__2 : rule__DeclaracionVariable__Group__2__Impl ;
    public final void rule__DeclaracionVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2097:1: ( rule__DeclaracionVariable__Group__2__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2098:2: rule__DeclaracionVariable__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__2__Impl_in_rule__DeclaracionVariable__Group__24458);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:1: rule__DeclaracionVariable__Group__2__Impl : ( ( rule__DeclaracionVariable__Group_2__0 )* ) ;
    public final void rule__DeclaracionVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2108:1: ( ( ( rule__DeclaracionVariable__Group_2__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: ( ( rule__DeclaracionVariable__Group_2__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: ( ( rule__DeclaracionVariable__Group_2__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2110:1: ( rule__DeclaracionVariable__Group_2__0 )*
            {
             before(grammarAccess.getDeclaracionVariableAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:1: ( rule__DeclaracionVariable__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==41) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:2: rule__DeclaracionVariable__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_2__0_in_rule__DeclaracionVariable__Group__2__Impl4485);
            	    rule__DeclaracionVariable__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2127:1: rule__DeclaracionVariable__Group_2__0 : rule__DeclaracionVariable__Group_2__0__Impl rule__DeclaracionVariable__Group_2__1 ;
    public final void rule__DeclaracionVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2131:1: ( rule__DeclaracionVariable__Group_2__0__Impl rule__DeclaracionVariable__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2132:2: rule__DeclaracionVariable__Group_2__0__Impl rule__DeclaracionVariable__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_2__0__Impl_in_rule__DeclaracionVariable__Group_2__04522);
            rule__DeclaracionVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_2__1_in_rule__DeclaracionVariable__Group_2__04525);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:1: rule__DeclaracionVariable__Group_2__0__Impl : ( ',' ) ;
    public final void rule__DeclaracionVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2143:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2145:1: ','
            {
             before(grammarAccess.getDeclaracionVariableAccess().getCommaKeyword_2_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__DeclaracionVariable__Group_2__0__Impl4553); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2158:1: rule__DeclaracionVariable__Group_2__1 : rule__DeclaracionVariable__Group_2__1__Impl ;
    public final void rule__DeclaracionVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:1: ( rule__DeclaracionVariable__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2163:2: rule__DeclaracionVariable__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_2__1__Impl_in_rule__DeclaracionVariable__Group_2__14584);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2169:1: rule__DeclaracionVariable__Group_2__1__Impl : ( ( rule__DeclaracionVariable__TieneIDsAssignment_2_1 ) ) ;
    public final void rule__DeclaracionVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2173:1: ( ( ( rule__DeclaracionVariable__TieneIDsAssignment_2_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2174:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_2_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2174:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_2_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2175:1: ( rule__DeclaracionVariable__TieneIDsAssignment_2_1 )
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsAssignment_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:1: ( rule__DeclaracionVariable__TieneIDsAssignment_2_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:2: rule__DeclaracionVariable__TieneIDsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_2_1_in_rule__DeclaracionVariable__Group_2__1__Impl4611);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2190:1: rule__LlamadaFuncion__Group__0 : rule__LlamadaFuncion__Group__0__Impl rule__LlamadaFuncion__Group__1 ;
    public final void rule__LlamadaFuncion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2194:1: ( rule__LlamadaFuncion__Group__0__Impl rule__LlamadaFuncion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:2: rule__LlamadaFuncion__Group__0__Impl rule__LlamadaFuncion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__0__Impl_in_rule__LlamadaFuncion__Group__04645);
            rule__LlamadaFuncion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__1_in_rule__LlamadaFuncion__Group__04648);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:1: rule__LlamadaFuncion__Group__0__Impl : ( ( rule__LlamadaFuncion__NombreAssignment_0 ) ) ;
    public final void rule__LlamadaFuncion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2206:1: ( ( ( rule__LlamadaFuncion__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2207:1: ( ( rule__LlamadaFuncion__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2207:1: ( ( rule__LlamadaFuncion__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2208:1: ( rule__LlamadaFuncion__NombreAssignment_0 )
            {
             before(grammarAccess.getLlamadaFuncionAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: ( rule__LlamadaFuncion__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:2: rule__LlamadaFuncion__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__NombreAssignment_0_in_rule__LlamadaFuncion__Group__0__Impl4675);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2219:1: rule__LlamadaFuncion__Group__1 : rule__LlamadaFuncion__Group__1__Impl rule__LlamadaFuncion__Group__2 ;
    public final void rule__LlamadaFuncion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:1: ( rule__LlamadaFuncion__Group__1__Impl rule__LlamadaFuncion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2224:2: rule__LlamadaFuncion__Group__1__Impl rule__LlamadaFuncion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__1__Impl_in_rule__LlamadaFuncion__Group__14705);
            rule__LlamadaFuncion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__2_in_rule__LlamadaFuncion__Group__14708);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: rule__LlamadaFuncion__Group__1__Impl : ( '(' ) ;
    public final void rule__LlamadaFuncion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2235:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2237:1: '('
            {
             before(grammarAccess.getLlamadaFuncionAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__LlamadaFuncion__Group__1__Impl4736); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:1: rule__LlamadaFuncion__Group__2 : rule__LlamadaFuncion__Group__2__Impl rule__LlamadaFuncion__Group__3 ;
    public final void rule__LlamadaFuncion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2254:1: ( rule__LlamadaFuncion__Group__2__Impl rule__LlamadaFuncion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:2: rule__LlamadaFuncion__Group__2__Impl rule__LlamadaFuncion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__2__Impl_in_rule__LlamadaFuncion__Group__24767);
            rule__LlamadaFuncion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__3_in_rule__LlamadaFuncion__Group__24770);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: rule__LlamadaFuncion__Group__2__Impl : ( ( rule__LlamadaFuncion__Group_2__0 )? ) ;
    public final void rule__LlamadaFuncion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2266:1: ( ( ( rule__LlamadaFuncion__Group_2__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:1: ( ( rule__LlamadaFuncion__Group_2__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:1: ( ( rule__LlamadaFuncion__Group_2__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2268:1: ( rule__LlamadaFuncion__Group_2__0 )?
            {
             before(grammarAccess.getLlamadaFuncionAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:1: ( rule__LlamadaFuncion__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_CAR)||LA19_0==RULE_CAD||(LA19_0>=21 && LA19_0<=22)||LA19_0==24||LA19_0==58) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:2: rule__LlamadaFuncion__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__0_in_rule__LlamadaFuncion__Group__2__Impl4797);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: rule__LlamadaFuncion__Group__3 : rule__LlamadaFuncion__Group__3__Impl ;
    public final void rule__LlamadaFuncion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2283:1: ( rule__LlamadaFuncion__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2284:2: rule__LlamadaFuncion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__3__Impl_in_rule__LlamadaFuncion__Group__34828);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2290:1: rule__LlamadaFuncion__Group__3__Impl : ( ')' ) ;
    public final void rule__LlamadaFuncion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2294:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: ')'
            {
             before(grammarAccess.getLlamadaFuncionAccess().getRightParenthesisKeyword_3()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__LlamadaFuncion__Group__3__Impl4856); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2317:1: rule__LlamadaFuncion__Group_2__0 : rule__LlamadaFuncion__Group_2__0__Impl rule__LlamadaFuncion__Group_2__1 ;
    public final void rule__LlamadaFuncion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2321:1: ( rule__LlamadaFuncion__Group_2__0__Impl rule__LlamadaFuncion__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2322:2: rule__LlamadaFuncion__Group_2__0__Impl rule__LlamadaFuncion__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__0__Impl_in_rule__LlamadaFuncion__Group_2__04895);
            rule__LlamadaFuncion__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__1_in_rule__LlamadaFuncion__Group_2__04898);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2329:1: rule__LlamadaFuncion__Group_2__0__Impl : ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) ) ;
    public final void rule__LlamadaFuncion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2333:1: ( ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2334:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2334:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2335:1: ( rule__LlamadaFuncion__OperadorAssignment_2_0 )
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorAssignment_2_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2336:1: ( rule__LlamadaFuncion__OperadorAssignment_2_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2336:2: rule__LlamadaFuncion__OperadorAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_0_in_rule__LlamadaFuncion__Group_2__0__Impl4925);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:1: rule__LlamadaFuncion__Group_2__1 : rule__LlamadaFuncion__Group_2__1__Impl ;
    public final void rule__LlamadaFuncion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2350:1: ( rule__LlamadaFuncion__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:2: rule__LlamadaFuncion__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__1__Impl_in_rule__LlamadaFuncion__Group_2__14955);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2357:1: rule__LlamadaFuncion__Group_2__1__Impl : ( ( rule__LlamadaFuncion__Group_2_1__0 )* ) ;
    public final void rule__LlamadaFuncion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2361:1: ( ( ( rule__LlamadaFuncion__Group_2_1__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2362:1: ( ( rule__LlamadaFuncion__Group_2_1__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2362:1: ( ( rule__LlamadaFuncion__Group_2_1__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:1: ( rule__LlamadaFuncion__Group_2_1__0 )*
            {
             before(grammarAccess.getLlamadaFuncionAccess().getGroup_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2364:1: ( rule__LlamadaFuncion__Group_2_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2364:2: rule__LlamadaFuncion__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__0_in_rule__LlamadaFuncion__Group_2__1__Impl4982);
            	    rule__LlamadaFuncion__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2378:1: rule__LlamadaFuncion__Group_2_1__0 : rule__LlamadaFuncion__Group_2_1__0__Impl rule__LlamadaFuncion__Group_2_1__1 ;
    public final void rule__LlamadaFuncion__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2382:1: ( rule__LlamadaFuncion__Group_2_1__0__Impl rule__LlamadaFuncion__Group_2_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2383:2: rule__LlamadaFuncion__Group_2_1__0__Impl rule__LlamadaFuncion__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__0__Impl_in_rule__LlamadaFuncion__Group_2_1__05017);
            rule__LlamadaFuncion__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__1_in_rule__LlamadaFuncion__Group_2_1__05020);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2390:1: rule__LlamadaFuncion__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__LlamadaFuncion__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2394:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2395:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2395:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2396:1: ','
            {
             before(grammarAccess.getLlamadaFuncionAccess().getCommaKeyword_2_1_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__LlamadaFuncion__Group_2_1__0__Impl5048); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2409:1: rule__LlamadaFuncion__Group_2_1__1 : rule__LlamadaFuncion__Group_2_1__1__Impl ;
    public final void rule__LlamadaFuncion__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2413:1: ( rule__LlamadaFuncion__Group_2_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2414:2: rule__LlamadaFuncion__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__1__Impl_in_rule__LlamadaFuncion__Group_2_1__15079);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2420:1: rule__LlamadaFuncion__Group_2_1__1__Impl : ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) ) ;
    public final void rule__LlamadaFuncion__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2424:1: ( ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2425:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2425:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2426:1: ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 )
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorAssignment_2_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2427:1: ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2427:2: rule__LlamadaFuncion__OperadorAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_1_1_in_rule__LlamadaFuncion__Group_2_1__1__Impl5106);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2441:1: rule__Asignacion__Group__0 : rule__Asignacion__Group__0__Impl rule__Asignacion__Group__1 ;
    public final void rule__Asignacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2445:1: ( rule__Asignacion__Group__0__Impl rule__Asignacion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2446:2: rule__Asignacion__Group__0__Impl rule__Asignacion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__0__Impl_in_rule__Asignacion__Group__05140);
            rule__Asignacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__1_in_rule__Asignacion__Group__05143);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2453:1: rule__Asignacion__Group__0__Impl : ( ( rule__Asignacion__LvalueAssignment_0 ) ) ;
    public final void rule__Asignacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:1: ( ( ( rule__Asignacion__LvalueAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2458:1: ( ( rule__Asignacion__LvalueAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2458:1: ( ( rule__Asignacion__LvalueAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2459:1: ( rule__Asignacion__LvalueAssignment_0 )
            {
             before(grammarAccess.getAsignacionAccess().getLvalueAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2460:1: ( rule__Asignacion__LvalueAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2460:2: rule__Asignacion__LvalueAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__LvalueAssignment_0_in_rule__Asignacion__Group__0__Impl5170);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2470:1: rule__Asignacion__Group__1 : rule__Asignacion__Group__1__Impl rule__Asignacion__Group__2 ;
    public final void rule__Asignacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2474:1: ( rule__Asignacion__Group__1__Impl rule__Asignacion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2475:2: rule__Asignacion__Group__1__Impl rule__Asignacion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__1__Impl_in_rule__Asignacion__Group__15200);
            rule__Asignacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__2_in_rule__Asignacion__Group__15203);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2482:1: rule__Asignacion__Group__1__Impl : ( ( rule__Asignacion__MatAssignment_1 )* ) ;
    public final void rule__Asignacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2486:1: ( ( ( rule__Asignacion__MatAssignment_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:1: ( ( rule__Asignacion__MatAssignment_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:1: ( ( rule__Asignacion__MatAssignment_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2488:1: ( rule__Asignacion__MatAssignment_1 )*
            {
             before(grammarAccess.getAsignacionAccess().getMatAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2489:1: ( rule__Asignacion__MatAssignment_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_MATRIZ) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2489:2: rule__Asignacion__MatAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Asignacion__MatAssignment_1_in_rule__Asignacion__Group__1__Impl5230);
            	    rule__Asignacion__MatAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2499:1: rule__Asignacion__Group__2 : rule__Asignacion__Group__2__Impl rule__Asignacion__Group__3 ;
    public final void rule__Asignacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:1: ( rule__Asignacion__Group__2__Impl rule__Asignacion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2504:2: rule__Asignacion__Group__2__Impl rule__Asignacion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__2__Impl_in_rule__Asignacion__Group__25261);
            rule__Asignacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__3_in_rule__Asignacion__Group__25264);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:1: rule__Asignacion__Group__2__Impl : ( '=' ) ;
    public final void rule__Asignacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2515:1: ( ( '=' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2516:1: ( '=' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2516:1: ( '=' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2517:1: '='
            {
             before(grammarAccess.getAsignacionAccess().getEqualsSignKeyword_2()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Asignacion__Group__2__Impl5292); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2530:1: rule__Asignacion__Group__3 : rule__Asignacion__Group__3__Impl ;
    public final void rule__Asignacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:1: ( rule__Asignacion__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2535:2: rule__Asignacion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__3__Impl_in_rule__Asignacion__Group__35323);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:1: rule__Asignacion__Group__3__Impl : ( ( rule__Asignacion__OperadorAssignment_3 ) ) ;
    public final void rule__Asignacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2545:1: ( ( ( rule__Asignacion__OperadorAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2546:1: ( ( rule__Asignacion__OperadorAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2546:1: ( ( rule__Asignacion__OperadorAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2547:1: ( rule__Asignacion__OperadorAssignment_3 )
            {
             before(grammarAccess.getAsignacionAccess().getOperadorAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2548:1: ( rule__Asignacion__OperadorAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2548:2: rule__Asignacion__OperadorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__OperadorAssignment_3_in_rule__Asignacion__Group__3__Impl5350);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2566:1: rule__Escribir__Group__0 : rule__Escribir__Group__0__Impl rule__Escribir__Group__1 ;
    public final void rule__Escribir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2570:1: ( rule__Escribir__Group__0__Impl rule__Escribir__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2571:2: rule__Escribir__Group__0__Impl rule__Escribir__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__0__Impl_in_rule__Escribir__Group__05388);
            rule__Escribir__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__1_in_rule__Escribir__Group__05391);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: rule__Escribir__Group__0__Impl : ( 'escribir' ) ;
    public final void rule__Escribir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:1: ( ( 'escribir' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: ( 'escribir' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: ( 'escribir' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2584:1: 'escribir'
            {
             before(grammarAccess.getEscribirAccess().getEscribirKeyword_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Escribir__Group__0__Impl5419); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2597:1: rule__Escribir__Group__1 : rule__Escribir__Group__1__Impl rule__Escribir__Group__2 ;
    public final void rule__Escribir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2601:1: ( rule__Escribir__Group__1__Impl rule__Escribir__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2602:2: rule__Escribir__Group__1__Impl rule__Escribir__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__1__Impl_in_rule__Escribir__Group__15450);
            rule__Escribir__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__2_in_rule__Escribir__Group__15453);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2609:1: rule__Escribir__Group__1__Impl : ( '(' ) ;
    public final void rule__Escribir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2613:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2614:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2614:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2615:1: '('
            {
             before(grammarAccess.getEscribirAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Escribir__Group__1__Impl5481); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2628:1: rule__Escribir__Group__2 : rule__Escribir__Group__2__Impl rule__Escribir__Group__3 ;
    public final void rule__Escribir__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2632:1: ( rule__Escribir__Group__2__Impl rule__Escribir__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2633:2: rule__Escribir__Group__2__Impl rule__Escribir__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__2__Impl_in_rule__Escribir__Group__25512);
            rule__Escribir__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__3_in_rule__Escribir__Group__25515);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2640:1: rule__Escribir__Group__2__Impl : ( ( rule__Escribir__OperadorAssignment_2 ) ) ;
    public final void rule__Escribir__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:1: ( ( ( rule__Escribir__OperadorAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2645:1: ( ( rule__Escribir__OperadorAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2645:1: ( ( rule__Escribir__OperadorAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2646:1: ( rule__Escribir__OperadorAssignment_2 )
            {
             before(grammarAccess.getEscribirAccess().getOperadorAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2647:1: ( rule__Escribir__OperadorAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2647:2: rule__Escribir__OperadorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__OperadorAssignment_2_in_rule__Escribir__Group__2__Impl5542);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:1: rule__Escribir__Group__3 : rule__Escribir__Group__3__Impl rule__Escribir__Group__4 ;
    public final void rule__Escribir__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2661:1: ( rule__Escribir__Group__3__Impl rule__Escribir__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2662:2: rule__Escribir__Group__3__Impl rule__Escribir__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__3__Impl_in_rule__Escribir__Group__35572);
            rule__Escribir__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__4_in_rule__Escribir__Group__35575);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2669:1: rule__Escribir__Group__3__Impl : ( ( rule__Escribir__Group_3__0 )* ) ;
    public final void rule__Escribir__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2673:1: ( ( ( rule__Escribir__Group_3__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2674:1: ( ( rule__Escribir__Group_3__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2674:1: ( ( rule__Escribir__Group_3__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2675:1: ( rule__Escribir__Group_3__0 )*
            {
             before(grammarAccess.getEscribirAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2676:1: ( rule__Escribir__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==41) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2676:2: rule__Escribir__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__0_in_rule__Escribir__Group__3__Impl5602);
            	    rule__Escribir__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2686:1: rule__Escribir__Group__4 : rule__Escribir__Group__4__Impl ;
    public final void rule__Escribir__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2690:1: ( rule__Escribir__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2691:2: rule__Escribir__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__4__Impl_in_rule__Escribir__Group__45633);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2697:1: rule__Escribir__Group__4__Impl : ( ')' ) ;
    public final void rule__Escribir__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2701:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2702:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2702:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2703:1: ')'
            {
             before(grammarAccess.getEscribirAccess().getRightParenthesisKeyword_4()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Escribir__Group__4__Impl5661); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2726:1: rule__Escribir__Group_3__0 : rule__Escribir__Group_3__0__Impl rule__Escribir__Group_3__1 ;
    public final void rule__Escribir__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2730:1: ( rule__Escribir__Group_3__0__Impl rule__Escribir__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2731:2: rule__Escribir__Group_3__0__Impl rule__Escribir__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__0__Impl_in_rule__Escribir__Group_3__05702);
            rule__Escribir__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__1_in_rule__Escribir__Group_3__05705);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2738:1: rule__Escribir__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Escribir__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2742:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2743:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2743:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2744:1: ','
            {
             before(grammarAccess.getEscribirAccess().getCommaKeyword_3_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Escribir__Group_3__0__Impl5733); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2757:1: rule__Escribir__Group_3__1 : rule__Escribir__Group_3__1__Impl ;
    public final void rule__Escribir__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:1: ( rule__Escribir__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2762:2: rule__Escribir__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__1__Impl_in_rule__Escribir__Group_3__15764);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2768:1: rule__Escribir__Group_3__1__Impl : ( ( rule__Escribir__OperadorAssignment_3_1 ) ) ;
    public final void rule__Escribir__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2772:1: ( ( ( rule__Escribir__OperadorAssignment_3_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2773:1: ( ( rule__Escribir__OperadorAssignment_3_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2773:1: ( ( rule__Escribir__OperadorAssignment_3_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2774:1: ( rule__Escribir__OperadorAssignment_3_1 )
            {
             before(grammarAccess.getEscribirAccess().getOperadorAssignment_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2775:1: ( rule__Escribir__OperadorAssignment_3_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2775:2: rule__Escribir__OperadorAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__OperadorAssignment_3_1_in_rule__Escribir__Group_3__1__Impl5791);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2789:1: rule__Leer__Group__0 : rule__Leer__Group__0__Impl rule__Leer__Group__1 ;
    public final void rule__Leer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2793:1: ( rule__Leer__Group__0__Impl rule__Leer__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2794:2: rule__Leer__Group__0__Impl rule__Leer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__0__Impl_in_rule__Leer__Group__05825);
            rule__Leer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__1_in_rule__Leer__Group__05828);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2801:1: rule__Leer__Group__0__Impl : ( 'leer' ) ;
    public final void rule__Leer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2805:1: ( ( 'leer' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2806:1: ( 'leer' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2806:1: ( 'leer' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2807:1: 'leer'
            {
             before(grammarAccess.getLeerAccess().getLeerKeyword_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Leer__Group__0__Impl5856); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:1: rule__Leer__Group__1 : rule__Leer__Group__1__Impl rule__Leer__Group__2 ;
    public final void rule__Leer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2824:1: ( rule__Leer__Group__1__Impl rule__Leer__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2825:2: rule__Leer__Group__1__Impl rule__Leer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__1__Impl_in_rule__Leer__Group__15887);
            rule__Leer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__2_in_rule__Leer__Group__15890);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2832:1: rule__Leer__Group__1__Impl : ( '(' ) ;
    public final void rule__Leer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2836:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2837:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2837:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2838:1: '('
            {
             before(grammarAccess.getLeerAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Leer__Group__1__Impl5918); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:1: rule__Leer__Group__2 : rule__Leer__Group__2__Impl rule__Leer__Group__3 ;
    public final void rule__Leer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2855:1: ( rule__Leer__Group__2__Impl rule__Leer__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2856:2: rule__Leer__Group__2__Impl rule__Leer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__2__Impl_in_rule__Leer__Group__25949);
            rule__Leer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__3_in_rule__Leer__Group__25952);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2863:1: rule__Leer__Group__2__Impl : ( ( rule__Leer__VariableAssignment_2 ) ) ;
    public final void rule__Leer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2867:1: ( ( ( rule__Leer__VariableAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2868:1: ( ( rule__Leer__VariableAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2868:1: ( ( rule__Leer__VariableAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2869:1: ( rule__Leer__VariableAssignment_2 )
            {
             before(grammarAccess.getLeerAccess().getVariableAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2870:1: ( rule__Leer__VariableAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2870:2: rule__Leer__VariableAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__VariableAssignment_2_in_rule__Leer__Group__2__Impl5979);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2880:1: rule__Leer__Group__3 : rule__Leer__Group__3__Impl ;
    public final void rule__Leer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2884:1: ( rule__Leer__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2885:2: rule__Leer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__3__Impl_in_rule__Leer__Group__36009);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2891:1: rule__Leer__Group__3__Impl : ( ')' ) ;
    public final void rule__Leer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2895:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2896:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2896:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2897:1: ')'
            {
             before(grammarAccess.getLeerAccess().getRightParenthesisKeyword_3()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Leer__Group__3__Impl6037); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2918:1: rule__Si__Group__0 : rule__Si__Group__0__Impl rule__Si__Group__1 ;
    public final void rule__Si__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: ( rule__Si__Group__0__Impl rule__Si__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:2: rule__Si__Group__0__Impl rule__Si__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__0__Impl_in_rule__Si__Group__06076);
            rule__Si__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__1_in_rule__Si__Group__06079);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2930:1: rule__Si__Group__0__Impl : ( 'si' ) ;
    public final void rule__Si__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2934:1: ( ( 'si' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2935:1: ( 'si' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2935:1: ( 'si' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2936:1: 'si'
            {
             before(grammarAccess.getSiAccess().getSiKeyword_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Si__Group__0__Impl6107); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2949:1: rule__Si__Group__1 : rule__Si__Group__1__Impl rule__Si__Group__2 ;
    public final void rule__Si__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2953:1: ( rule__Si__Group__1__Impl rule__Si__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2954:2: rule__Si__Group__1__Impl rule__Si__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__1__Impl_in_rule__Si__Group__16138);
            rule__Si__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__2_in_rule__Si__Group__16141);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2961:1: rule__Si__Group__1__Impl : ( ( rule__Si__ValorAssignment_1 ) ) ;
    public final void rule__Si__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2965:1: ( ( ( rule__Si__ValorAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2966:1: ( ( rule__Si__ValorAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2966:1: ( ( rule__Si__ValorAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2967:1: ( rule__Si__ValorAssignment_1 )
            {
             before(grammarAccess.getSiAccess().getValorAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2968:1: ( rule__Si__ValorAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2968:2: rule__Si__ValorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__ValorAssignment_1_in_rule__Si__Group__1__Impl6168);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2978:1: rule__Si__Group__2 : rule__Si__Group__2__Impl rule__Si__Group__3 ;
    public final void rule__Si__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2982:1: ( rule__Si__Group__2__Impl rule__Si__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2983:2: rule__Si__Group__2__Impl rule__Si__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__2__Impl_in_rule__Si__Group__26198);
            rule__Si__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__3_in_rule__Si__Group__26201);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2990:1: rule__Si__Group__2__Impl : ( 'entonces' ) ;
    public final void rule__Si__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2994:1: ( ( 'entonces' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2995:1: ( 'entonces' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2995:1: ( 'entonces' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2996:1: 'entonces'
            {
             before(grammarAccess.getSiAccess().getEntoncesKeyword_2()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Si__Group__2__Impl6229); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: rule__Si__Group__3 : rule__Si__Group__3__Impl rule__Si__Group__4 ;
    public final void rule__Si__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3013:1: ( rule__Si__Group__3__Impl rule__Si__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3014:2: rule__Si__Group__3__Impl rule__Si__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__3__Impl_in_rule__Si__Group__36260);
            rule__Si__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__4_in_rule__Si__Group__36263);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3021:1: rule__Si__Group__3__Impl : ( ( rule__Si__Group_3__0 )? ) ;
    public final void rule__Si__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3025:1: ( ( ( rule__Si__Group_3__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3026:1: ( ( rule__Si__Group_3__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3026:1: ( ( rule__Si__Group_3__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3027:1: ( rule__Si__Group_3__0 )?
            {
             before(grammarAccess.getSiAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3028:1: ( rule__Si__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)||(LA23_0>=45 && LA23_0<=47)||LA23_0==50||LA23_0==53||LA23_0==55) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3028:2: rule__Si__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__0_in_rule__Si__Group__3__Impl6290);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3038:1: rule__Si__Group__4 : rule__Si__Group__4__Impl rule__Si__Group__5 ;
    public final void rule__Si__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3042:1: ( rule__Si__Group__4__Impl rule__Si__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3043:2: rule__Si__Group__4__Impl rule__Si__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__4__Impl_in_rule__Si__Group__46321);
            rule__Si__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__5_in_rule__Si__Group__46324);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3050:1: rule__Si__Group__4__Impl : ( ( rule__Si__SinoAssignment_4 )? ) ;
    public final void rule__Si__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3054:1: ( ( ( rule__Si__SinoAssignment_4 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3055:1: ( ( rule__Si__SinoAssignment_4 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3055:1: ( ( rule__Si__SinoAssignment_4 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3056:1: ( rule__Si__SinoAssignment_4 )?
            {
             before(grammarAccess.getSiAccess().getSinoAssignment_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3057:1: ( rule__Si__SinoAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==59) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3057:2: rule__Si__SinoAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Si__SinoAssignment_4_in_rule__Si__Group__4__Impl6351);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:1: rule__Si__Group__5 : rule__Si__Group__5__Impl ;
    public final void rule__Si__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3071:1: ( rule__Si__Group__5__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3072:2: rule__Si__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__5__Impl_in_rule__Si__Group__56382);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3078:1: rule__Si__Group__5__Impl : ( 'fin si' ) ;
    public final void rule__Si__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3082:1: ( ( 'fin si' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3083:1: ( 'fin si' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3083:1: ( 'fin si' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3084:1: 'fin si'
            {
             before(grammarAccess.getSiAccess().getFinSiKeyword_5()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Si__Group__5__Impl6410); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3109:1: rule__Si__Group_3__0 : rule__Si__Group_3__0__Impl rule__Si__Group_3__1 ;
    public final void rule__Si__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3113:1: ( rule__Si__Group_3__0__Impl rule__Si__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3114:2: rule__Si__Group_3__0__Impl rule__Si__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__0__Impl_in_rule__Si__Group_3__06453);
            rule__Si__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__1_in_rule__Si__Group_3__06456);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3121:1: rule__Si__Group_3__0__Impl : ( ( rule__Si__SentenciasAssignment_3_0 ) ) ;
    public final void rule__Si__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3125:1: ( ( ( rule__Si__SentenciasAssignment_3_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3126:1: ( ( rule__Si__SentenciasAssignment_3_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3126:1: ( ( rule__Si__SentenciasAssignment_3_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3127:1: ( rule__Si__SentenciasAssignment_3_0 )
            {
             before(grammarAccess.getSiAccess().getSentenciasAssignment_3_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3128:1: ( rule__Si__SentenciasAssignment_3_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3128:2: rule__Si__SentenciasAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__SentenciasAssignment_3_0_in_rule__Si__Group_3__0__Impl6483);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3138:1: rule__Si__Group_3__1 : rule__Si__Group_3__1__Impl ;
    public final void rule__Si__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3142:1: ( rule__Si__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3143:2: rule__Si__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__1__Impl_in_rule__Si__Group_3__16513);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3149:1: rule__Si__Group_3__1__Impl : ( ( rule__Si__SentenciasAssignment_3_1 )* ) ;
    public final void rule__Si__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3153:1: ( ( ( rule__Si__SentenciasAssignment_3_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3154:1: ( ( rule__Si__SentenciasAssignment_3_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3154:1: ( ( rule__Si__SentenciasAssignment_3_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3155:1: ( rule__Si__SentenciasAssignment_3_1 )*
            {
             before(grammarAccess.getSiAccess().getSentenciasAssignment_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3156:1: ( rule__Si__SentenciasAssignment_3_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)||(LA25_0>=45 && LA25_0<=47)||LA25_0==50||LA25_0==53||LA25_0==55) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3156:2: rule__Si__SentenciasAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Si__SentenciasAssignment_3_1_in_rule__Si__Group_3__1__Impl6540);
            	    rule__Si__SentenciasAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3170:1: rule__Mientras__Group__0 : rule__Mientras__Group__0__Impl rule__Mientras__Group__1 ;
    public final void rule__Mientras__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3174:1: ( rule__Mientras__Group__0__Impl rule__Mientras__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3175:2: rule__Mientras__Group__0__Impl rule__Mientras__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__0__Impl_in_rule__Mientras__Group__06575);
            rule__Mientras__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__1_in_rule__Mientras__Group__06578);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3182:1: rule__Mientras__Group__0__Impl : ( 'mientras' ) ;
    public final void rule__Mientras__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3186:1: ( ( 'mientras' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3187:1: ( 'mientras' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3187:1: ( 'mientras' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3188:1: 'mientras'
            {
             before(grammarAccess.getMientrasAccess().getMientrasKeyword_0()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Mientras__Group__0__Impl6606); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3201:1: rule__Mientras__Group__1 : rule__Mientras__Group__1__Impl rule__Mientras__Group__2 ;
    public final void rule__Mientras__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3205:1: ( rule__Mientras__Group__1__Impl rule__Mientras__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3206:2: rule__Mientras__Group__1__Impl rule__Mientras__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__1__Impl_in_rule__Mientras__Group__16637);
            rule__Mientras__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__2_in_rule__Mientras__Group__16640);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3213:1: rule__Mientras__Group__1__Impl : ( ( rule__Mientras__ValorAssignment_1 ) ) ;
    public final void rule__Mientras__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3217:1: ( ( ( rule__Mientras__ValorAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3218:1: ( ( rule__Mientras__ValorAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3218:1: ( ( rule__Mientras__ValorAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3219:1: ( rule__Mientras__ValorAssignment_1 )
            {
             before(grammarAccess.getMientrasAccess().getValorAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3220:1: ( rule__Mientras__ValorAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3220:2: rule__Mientras__ValorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__ValorAssignment_1_in_rule__Mientras__Group__1__Impl6667);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3230:1: rule__Mientras__Group__2 : rule__Mientras__Group__2__Impl rule__Mientras__Group__3 ;
    public final void rule__Mientras__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3234:1: ( rule__Mientras__Group__2__Impl rule__Mientras__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3235:2: rule__Mientras__Group__2__Impl rule__Mientras__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__2__Impl_in_rule__Mientras__Group__26697);
            rule__Mientras__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__3_in_rule__Mientras__Group__26700);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3242:1: rule__Mientras__Group__2__Impl : ( 'hacer' ) ;
    public final void rule__Mientras__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3246:1: ( ( 'hacer' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3247:1: ( 'hacer' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3247:1: ( 'hacer' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3248:1: 'hacer'
            {
             before(grammarAccess.getMientrasAccess().getHacerKeyword_2()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Mientras__Group__2__Impl6728); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3261:1: rule__Mientras__Group__3 : rule__Mientras__Group__3__Impl rule__Mientras__Group__4 ;
    public final void rule__Mientras__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3265:1: ( rule__Mientras__Group__3__Impl rule__Mientras__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3266:2: rule__Mientras__Group__3__Impl rule__Mientras__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__3__Impl_in_rule__Mientras__Group__36759);
            rule__Mientras__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__4_in_rule__Mientras__Group__36762);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3273:1: rule__Mientras__Group__3__Impl : ( ( rule__Mientras__Group_3__0 )? ) ;
    public final void rule__Mientras__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3277:1: ( ( ( rule__Mientras__Group_3__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3278:1: ( ( rule__Mientras__Group_3__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3278:1: ( ( rule__Mientras__Group_3__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3279:1: ( rule__Mientras__Group_3__0 )?
            {
             before(grammarAccess.getMientrasAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3280:1: ( rule__Mientras__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)||(LA26_0>=45 && LA26_0<=47)||LA26_0==50||LA26_0==53||LA26_0==55) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3280:2: rule__Mientras__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__0_in_rule__Mientras__Group__3__Impl6789);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3290:1: rule__Mientras__Group__4 : rule__Mientras__Group__4__Impl ;
    public final void rule__Mientras__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3294:1: ( rule__Mientras__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3295:2: rule__Mientras__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__4__Impl_in_rule__Mientras__Group__46820);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3301:1: rule__Mientras__Group__4__Impl : ( 'fin_mientras' ) ;
    public final void rule__Mientras__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3305:1: ( ( 'fin_mientras' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3306:1: ( 'fin_mientras' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3306:1: ( 'fin_mientras' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3307:1: 'fin_mientras'
            {
             before(grammarAccess.getMientrasAccess().getFin_mientrasKeyword_4()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Mientras__Group__4__Impl6848); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3330:1: rule__Mientras__Group_3__0 : rule__Mientras__Group_3__0__Impl rule__Mientras__Group_3__1 ;
    public final void rule__Mientras__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3334:1: ( rule__Mientras__Group_3__0__Impl rule__Mientras__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3335:2: rule__Mientras__Group_3__0__Impl rule__Mientras__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__0__Impl_in_rule__Mientras__Group_3__06889);
            rule__Mientras__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__1_in_rule__Mientras__Group_3__06892);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3342:1: rule__Mientras__Group_3__0__Impl : ( ( rule__Mientras__SentenciasAssignment_3_0 ) ) ;
    public final void rule__Mientras__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3346:1: ( ( ( rule__Mientras__SentenciasAssignment_3_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3347:1: ( ( rule__Mientras__SentenciasAssignment_3_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3347:1: ( ( rule__Mientras__SentenciasAssignment_3_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3348:1: ( rule__Mientras__SentenciasAssignment_3_0 )
            {
             before(grammarAccess.getMientrasAccess().getSentenciasAssignment_3_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3349:1: ( rule__Mientras__SentenciasAssignment_3_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3349:2: rule__Mientras__SentenciasAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__SentenciasAssignment_3_0_in_rule__Mientras__Group_3__0__Impl6919);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3359:1: rule__Mientras__Group_3__1 : rule__Mientras__Group_3__1__Impl ;
    public final void rule__Mientras__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3363:1: ( rule__Mientras__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3364:2: rule__Mientras__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__1__Impl_in_rule__Mientras__Group_3__16949);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3370:1: rule__Mientras__Group_3__1__Impl : ( ( rule__Mientras__SentenciasAssignment_3_1 )* ) ;
    public final void rule__Mientras__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3374:1: ( ( ( rule__Mientras__SentenciasAssignment_3_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3375:1: ( ( rule__Mientras__SentenciasAssignment_3_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3375:1: ( ( rule__Mientras__SentenciasAssignment_3_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3376:1: ( rule__Mientras__SentenciasAssignment_3_1 )*
            {
             before(grammarAccess.getMientrasAccess().getSentenciasAssignment_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3377:1: ( rule__Mientras__SentenciasAssignment_3_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)||(LA27_0>=45 && LA27_0<=47)||LA27_0==50||LA27_0==53||LA27_0==55) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3377:2: rule__Mientras__SentenciasAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Mientras__SentenciasAssignment_3_1_in_rule__Mientras__Group_3__1__Impl6976);
            	    rule__Mientras__SentenciasAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3391:1: rule__Repetir__Group__0 : rule__Repetir__Group__0__Impl rule__Repetir__Group__1 ;
    public final void rule__Repetir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3395:1: ( rule__Repetir__Group__0__Impl rule__Repetir__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3396:2: rule__Repetir__Group__0__Impl rule__Repetir__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__0__Impl_in_rule__Repetir__Group__07011);
            rule__Repetir__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__1_in_rule__Repetir__Group__07014);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3403:1: rule__Repetir__Group__0__Impl : ( 'repetir' ) ;
    public final void rule__Repetir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3407:1: ( ( 'repetir' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3408:1: ( 'repetir' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3408:1: ( 'repetir' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3409:1: 'repetir'
            {
             before(grammarAccess.getRepetirAccess().getRepetirKeyword_0()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__Repetir__Group__0__Impl7042); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3422:1: rule__Repetir__Group__1 : rule__Repetir__Group__1__Impl rule__Repetir__Group__2 ;
    public final void rule__Repetir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3426:1: ( rule__Repetir__Group__1__Impl rule__Repetir__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3427:2: rule__Repetir__Group__1__Impl rule__Repetir__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__1__Impl_in_rule__Repetir__Group__17073);
            rule__Repetir__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__2_in_rule__Repetir__Group__17076);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3434:1: rule__Repetir__Group__1__Impl : ( ( rule__Repetir__Group_1__0 )? ) ;
    public final void rule__Repetir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3438:1: ( ( ( rule__Repetir__Group_1__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3439:1: ( ( rule__Repetir__Group_1__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3439:1: ( ( rule__Repetir__Group_1__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3440:1: ( rule__Repetir__Group_1__0 )?
            {
             before(grammarAccess.getRepetirAccess().getGroup_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3441:1: ( rule__Repetir__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||(LA28_0>=45 && LA28_0<=47)||LA28_0==50||LA28_0==53||LA28_0==55) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3441:2: rule__Repetir__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__0_in_rule__Repetir__Group__1__Impl7103);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3451:1: rule__Repetir__Group__2 : rule__Repetir__Group__2__Impl rule__Repetir__Group__3 ;
    public final void rule__Repetir__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3455:1: ( rule__Repetir__Group__2__Impl rule__Repetir__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3456:2: rule__Repetir__Group__2__Impl rule__Repetir__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__2__Impl_in_rule__Repetir__Group__27134);
            rule__Repetir__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__3_in_rule__Repetir__Group__27137);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3463:1: rule__Repetir__Group__2__Impl : ( 'hasta_que' ) ;
    public final void rule__Repetir__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3467:1: ( ( 'hasta_que' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3468:1: ( 'hasta_que' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3468:1: ( 'hasta_que' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3469:1: 'hasta_que'
            {
             before(grammarAccess.getRepetirAccess().getHasta_queKeyword_2()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__Repetir__Group__2__Impl7165); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3482:1: rule__Repetir__Group__3 : rule__Repetir__Group__3__Impl ;
    public final void rule__Repetir__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3486:1: ( rule__Repetir__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3487:2: rule__Repetir__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__3__Impl_in_rule__Repetir__Group__37196);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3493:1: rule__Repetir__Group__3__Impl : ( ( rule__Repetir__ValorAssignment_3 ) ) ;
    public final void rule__Repetir__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3497:1: ( ( ( rule__Repetir__ValorAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3498:1: ( ( rule__Repetir__ValorAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3498:1: ( ( rule__Repetir__ValorAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3499:1: ( rule__Repetir__ValorAssignment_3 )
            {
             before(grammarAccess.getRepetirAccess().getValorAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3500:1: ( rule__Repetir__ValorAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3500:2: rule__Repetir__ValorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__ValorAssignment_3_in_rule__Repetir__Group__3__Impl7223);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3518:1: rule__Repetir__Group_1__0 : rule__Repetir__Group_1__0__Impl rule__Repetir__Group_1__1 ;
    public final void rule__Repetir__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3522:1: ( rule__Repetir__Group_1__0__Impl rule__Repetir__Group_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3523:2: rule__Repetir__Group_1__0__Impl rule__Repetir__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__0__Impl_in_rule__Repetir__Group_1__07261);
            rule__Repetir__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__1_in_rule__Repetir__Group_1__07264);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3530:1: rule__Repetir__Group_1__0__Impl : ( ( rule__Repetir__SentenciasAssignment_1_0 ) ) ;
    public final void rule__Repetir__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3534:1: ( ( ( rule__Repetir__SentenciasAssignment_1_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3535:1: ( ( rule__Repetir__SentenciasAssignment_1_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3535:1: ( ( rule__Repetir__SentenciasAssignment_1_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3536:1: ( rule__Repetir__SentenciasAssignment_1_0 )
            {
             before(grammarAccess.getRepetirAccess().getSentenciasAssignment_1_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3537:1: ( rule__Repetir__SentenciasAssignment_1_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3537:2: rule__Repetir__SentenciasAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__SentenciasAssignment_1_0_in_rule__Repetir__Group_1__0__Impl7291);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3547:1: rule__Repetir__Group_1__1 : rule__Repetir__Group_1__1__Impl ;
    public final void rule__Repetir__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3551:1: ( rule__Repetir__Group_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3552:2: rule__Repetir__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__1__Impl_in_rule__Repetir__Group_1__17321);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3558:1: rule__Repetir__Group_1__1__Impl : ( ( rule__Repetir__SentenciasAssignment_1_1 )* ) ;
    public final void rule__Repetir__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3562:1: ( ( ( rule__Repetir__SentenciasAssignment_1_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3563:1: ( ( rule__Repetir__SentenciasAssignment_1_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3563:1: ( ( rule__Repetir__SentenciasAssignment_1_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3564:1: ( rule__Repetir__SentenciasAssignment_1_1 )*
            {
             before(grammarAccess.getRepetirAccess().getSentenciasAssignment_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3565:1: ( rule__Repetir__SentenciasAssignment_1_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)||(LA29_0>=45 && LA29_0<=47)||LA29_0==50||LA29_0==53||LA29_0==55) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3565:2: rule__Repetir__SentenciasAssignment_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Repetir__SentenciasAssignment_1_1_in_rule__Repetir__Group_1__1__Impl7348);
            	    rule__Repetir__SentenciasAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3579:1: rule__Desde__Group__0 : rule__Desde__Group__0__Impl rule__Desde__Group__1 ;
    public final void rule__Desde__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3583:1: ( rule__Desde__Group__0__Impl rule__Desde__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3584:2: rule__Desde__Group__0__Impl rule__Desde__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__0__Impl_in_rule__Desde__Group__07383);
            rule__Desde__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__1_in_rule__Desde__Group__07386);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3591:1: rule__Desde__Group__0__Impl : ( 'desde' ) ;
    public final void rule__Desde__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3595:1: ( ( 'desde' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3596:1: ( 'desde' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3596:1: ( 'desde' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:1: 'desde'
            {
             before(grammarAccess.getDesdeAccess().getDesdeKeyword_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__Desde__Group__0__Impl7414); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3610:1: rule__Desde__Group__1 : rule__Desde__Group__1__Impl rule__Desde__Group__2 ;
    public final void rule__Desde__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3614:1: ( rule__Desde__Group__1__Impl rule__Desde__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3615:2: rule__Desde__Group__1__Impl rule__Desde__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__1__Impl_in_rule__Desde__Group__17445);
            rule__Desde__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__2_in_rule__Desde__Group__17448);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3622:1: rule__Desde__Group__1__Impl : ( ( rule__Desde__AsignacionAssignment_1 ) ) ;
    public final void rule__Desde__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3626:1: ( ( ( rule__Desde__AsignacionAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3627:1: ( ( rule__Desde__AsignacionAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3627:1: ( ( rule__Desde__AsignacionAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3628:1: ( rule__Desde__AsignacionAssignment_1 )
            {
             before(grammarAccess.getDesdeAccess().getAsignacionAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3629:1: ( rule__Desde__AsignacionAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3629:2: rule__Desde__AsignacionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__AsignacionAssignment_1_in_rule__Desde__Group__1__Impl7475);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3639:1: rule__Desde__Group__2 : rule__Desde__Group__2__Impl rule__Desde__Group__3 ;
    public final void rule__Desde__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3643:1: ( rule__Desde__Group__2__Impl rule__Desde__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3644:2: rule__Desde__Group__2__Impl rule__Desde__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__2__Impl_in_rule__Desde__Group__27505);
            rule__Desde__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__3_in_rule__Desde__Group__27508);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3651:1: rule__Desde__Group__2__Impl : ( 'hasta' ) ;
    public final void rule__Desde__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3655:1: ( ( 'hasta' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3656:1: ( 'hasta' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3656:1: ( 'hasta' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3657:1: 'hasta'
            {
             before(grammarAccess.getDesdeAccess().getHastaKeyword_2()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Desde__Group__2__Impl7536); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3670:1: rule__Desde__Group__3 : rule__Desde__Group__3__Impl rule__Desde__Group__4 ;
    public final void rule__Desde__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3674:1: ( rule__Desde__Group__3__Impl rule__Desde__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3675:2: rule__Desde__Group__3__Impl rule__Desde__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__3__Impl_in_rule__Desde__Group__37567);
            rule__Desde__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__4_in_rule__Desde__Group__37570);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3682:1: rule__Desde__Group__3__Impl : ( ( rule__Desde__ValorAssignment_3 ) ) ;
    public final void rule__Desde__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3686:1: ( ( ( rule__Desde__ValorAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3687:1: ( ( rule__Desde__ValorAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3687:1: ( ( rule__Desde__ValorAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3688:1: ( rule__Desde__ValorAssignment_3 )
            {
             before(grammarAccess.getDesdeAccess().getValorAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3689:1: ( rule__Desde__ValorAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3689:2: rule__Desde__ValorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__ValorAssignment_3_in_rule__Desde__Group__3__Impl7597);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3699:1: rule__Desde__Group__4 : rule__Desde__Group__4__Impl rule__Desde__Group__5 ;
    public final void rule__Desde__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3703:1: ( rule__Desde__Group__4__Impl rule__Desde__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3704:2: rule__Desde__Group__4__Impl rule__Desde__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__4__Impl_in_rule__Desde__Group__47627);
            rule__Desde__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__5_in_rule__Desde__Group__47630);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3711:1: rule__Desde__Group__4__Impl : ( 'hacer' ) ;
    public final void rule__Desde__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3715:1: ( ( 'hacer' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3716:1: ( 'hacer' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3716:1: ( 'hacer' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3717:1: 'hacer'
            {
             before(grammarAccess.getDesdeAccess().getHacerKeyword_4()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Desde__Group__4__Impl7658); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3730:1: rule__Desde__Group__5 : rule__Desde__Group__5__Impl rule__Desde__Group__6 ;
    public final void rule__Desde__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3734:1: ( rule__Desde__Group__5__Impl rule__Desde__Group__6 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3735:2: rule__Desde__Group__5__Impl rule__Desde__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__5__Impl_in_rule__Desde__Group__57689);
            rule__Desde__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__6_in_rule__Desde__Group__57692);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3742:1: rule__Desde__Group__5__Impl : ( ( rule__Desde__Group_5__0 )? ) ;
    public final void rule__Desde__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3746:1: ( ( ( rule__Desde__Group_5__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3747:1: ( ( rule__Desde__Group_5__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3747:1: ( ( rule__Desde__Group_5__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3748:1: ( rule__Desde__Group_5__0 )?
            {
             before(grammarAccess.getDesdeAccess().getGroup_5()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3749:1: ( rule__Desde__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)||(LA30_0>=45 && LA30_0<=47)||LA30_0==50||LA30_0==53||LA30_0==55) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3749:2: rule__Desde__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__0_in_rule__Desde__Group__5__Impl7719);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3759:1: rule__Desde__Group__6 : rule__Desde__Group__6__Impl ;
    public final void rule__Desde__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3763:1: ( rule__Desde__Group__6__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3764:2: rule__Desde__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__6__Impl_in_rule__Desde__Group__67750);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:1: rule__Desde__Group__6__Impl : ( 'fin_desde' ) ;
    public final void rule__Desde__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3774:1: ( ( 'fin_desde' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3775:1: ( 'fin_desde' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3775:1: ( 'fin_desde' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3776:1: 'fin_desde'
            {
             before(grammarAccess.getDesdeAccess().getFin_desdeKeyword_6()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__Desde__Group__6__Impl7778); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3803:1: rule__Desde__Group_5__0 : rule__Desde__Group_5__0__Impl rule__Desde__Group_5__1 ;
    public final void rule__Desde__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3807:1: ( rule__Desde__Group_5__0__Impl rule__Desde__Group_5__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3808:2: rule__Desde__Group_5__0__Impl rule__Desde__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__0__Impl_in_rule__Desde__Group_5__07823);
            rule__Desde__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__1_in_rule__Desde__Group_5__07826);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3815:1: rule__Desde__Group_5__0__Impl : ( ( rule__Desde__SentenciasAssignment_5_0 ) ) ;
    public final void rule__Desde__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3819:1: ( ( ( rule__Desde__SentenciasAssignment_5_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3820:1: ( ( rule__Desde__SentenciasAssignment_5_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3820:1: ( ( rule__Desde__SentenciasAssignment_5_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3821:1: ( rule__Desde__SentenciasAssignment_5_0 )
            {
             before(grammarAccess.getDesdeAccess().getSentenciasAssignment_5_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3822:1: ( rule__Desde__SentenciasAssignment_5_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3822:2: rule__Desde__SentenciasAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__SentenciasAssignment_5_0_in_rule__Desde__Group_5__0__Impl7853);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3832:1: rule__Desde__Group_5__1 : rule__Desde__Group_5__1__Impl ;
    public final void rule__Desde__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3836:1: ( rule__Desde__Group_5__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3837:2: rule__Desde__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__1__Impl_in_rule__Desde__Group_5__17883);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3843:1: rule__Desde__Group_5__1__Impl : ( ( rule__Desde__SentenciasAssignment_5_1 )* ) ;
    public final void rule__Desde__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3847:1: ( ( ( rule__Desde__SentenciasAssignment_5_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3848:1: ( ( rule__Desde__SentenciasAssignment_5_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3848:1: ( ( rule__Desde__SentenciasAssignment_5_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3849:1: ( rule__Desde__SentenciasAssignment_5_1 )*
            {
             before(grammarAccess.getDesdeAccess().getSentenciasAssignment_5_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:1: ( rule__Desde__SentenciasAssignment_5_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)||(LA31_0>=45 && LA31_0<=47)||LA31_0==50||LA31_0==53||LA31_0==55) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:2: rule__Desde__SentenciasAssignment_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Desde__SentenciasAssignment_5_1_in_rule__Desde__Group_5__1__Impl7910);
            	    rule__Desde__SentenciasAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3864:1: rule__Incremento__Group__0 : rule__Incremento__Group__0__Impl rule__Incremento__Group__1 ;
    public final void rule__Incremento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3868:1: ( rule__Incremento__Group__0__Impl rule__Incremento__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3869:2: rule__Incremento__Group__0__Impl rule__Incremento__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__Group__0__Impl_in_rule__Incremento__Group__07945);
            rule__Incremento__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Incremento__Group__1_in_rule__Incremento__Group__07948);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3876:1: rule__Incremento__Group__0__Impl : ( ( rule__Incremento__NombreAssignment_0 ) ) ;
    public final void rule__Incremento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3880:1: ( ( ( rule__Incremento__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3881:1: ( ( rule__Incremento__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3881:1: ( ( rule__Incremento__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3882:1: ( rule__Incremento__NombreAssignment_0 )
            {
             before(grammarAccess.getIncrementoAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3883:1: ( rule__Incremento__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3883:2: rule__Incremento__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__NombreAssignment_0_in_rule__Incremento__Group__0__Impl7975);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3893:1: rule__Incremento__Group__1 : rule__Incremento__Group__1__Impl ;
    public final void rule__Incremento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3897:1: ( rule__Incremento__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3898:2: rule__Incremento__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__Group__1__Impl_in_rule__Incremento__Group__18005);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3904:1: rule__Incremento__Group__1__Impl : ( ( rule__Incremento__SsignoAssignment_1 ) ) ;
    public final void rule__Incremento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3908:1: ( ( ( rule__Incremento__SsignoAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3909:1: ( ( rule__Incremento__SsignoAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3909:1: ( ( rule__Incremento__SsignoAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3910:1: ( rule__Incremento__SsignoAssignment_1 )
            {
             before(grammarAccess.getIncrementoAccess().getSsignoAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3911:1: ( rule__Incremento__SsignoAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3911:2: rule__Incremento__SsignoAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__SsignoAssignment_1_in_rule__Incremento__Group__1__Impl8032);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3925:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3929:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3930:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__08066);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__08069);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3937:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NombreAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3941:1: ( ( ( rule__Variable__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3942:1: ( ( rule__Variable__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3942:1: ( ( rule__Variable__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3943:1: ( rule__Variable__NombreAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3944:1: ( rule__Variable__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3944:2: rule__Variable__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__NombreAssignment_0_in_rule__Variable__Group__0__Impl8096);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3954:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3958:1: ( rule__Variable__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__18126);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3965:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__MatAssignment_1 )* ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3969:1: ( ( ( rule__Variable__MatAssignment_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3970:1: ( ( rule__Variable__MatAssignment_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3970:1: ( ( rule__Variable__MatAssignment_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3971:1: ( rule__Variable__MatAssignment_1 )*
            {
             before(grammarAccess.getVariableAccess().getMatAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3972:1: ( rule__Variable__MatAssignment_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_MATRIZ) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3972:2: rule__Variable__MatAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Variable__MatAssignment_1_in_rule__Variable__Group__1__Impl8153);
            	    rule__Variable__MatAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3986:1: rule__VariableID__Group__0 : rule__VariableID__Group__0__Impl rule__VariableID__Group__1 ;
    public final void rule__VariableID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3990:1: ( rule__VariableID__Group__0__Impl rule__VariableID__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3991:2: rule__VariableID__Group__0__Impl rule__VariableID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__0__Impl_in_rule__VariableID__Group__08188);
            rule__VariableID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__1_in_rule__VariableID__Group__08191);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3998:1: rule__VariableID__Group__0__Impl : ( ( rule__VariableID__NombreAssignment_0 ) ) ;
    public final void rule__VariableID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4002:1: ( ( ( rule__VariableID__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4003:1: ( ( rule__VariableID__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4003:1: ( ( rule__VariableID__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4004:1: ( rule__VariableID__NombreAssignment_0 )
            {
             before(grammarAccess.getVariableIDAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4005:1: ( rule__VariableID__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4005:2: rule__VariableID__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__NombreAssignment_0_in_rule__VariableID__Group__0__Impl8218);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4015:1: rule__VariableID__Group__1 : rule__VariableID__Group__1__Impl ;
    public final void rule__VariableID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4019:1: ( rule__VariableID__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:2: rule__VariableID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__1__Impl_in_rule__VariableID__Group__18248);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4026:1: rule__VariableID__Group__1__Impl : ( ( rule__VariableID__MatAssignment_1 )* ) ;
    public final void rule__VariableID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4030:1: ( ( ( rule__VariableID__MatAssignment_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4031:1: ( ( rule__VariableID__MatAssignment_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4031:1: ( ( rule__VariableID__MatAssignment_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4032:1: ( rule__VariableID__MatAssignment_1 )*
            {
             before(grammarAccess.getVariableIDAccess().getMatAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4033:1: ( rule__VariableID__MatAssignment_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_MATRIZ) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4033:2: rule__VariableID__MatAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__VariableID__MatAssignment_1_in_rule__VariableID__Group__1__Impl8275);
            	    rule__VariableID__MatAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4047:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4051:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4052:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__08310);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__08313);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4059:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4063:1: ( ( ( '-' )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4064:1: ( ( '-' )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4064:1: ( ( '-' )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4065:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4066:1: ( '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==24) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4067:2: '-'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__EInt__Group__0__Impl8342); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4078:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4082:1: ( rule__EInt__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4083:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__18375);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4089:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4093:1: ( ( RULE_INT ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4094:1: ( RULE_INT )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4094:1: ( RULE_INT )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4095:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl8402); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4110:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4114:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4115:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__08435);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__08438);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4122:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4126:1: ( ( ( '-' )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4127:1: ( ( '-' )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4127:1: ( ( '-' )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4128:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4129:1: ( '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==24) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4130:2: '-'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__EFloat__Group__0__Impl8467); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4141:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4145:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4146:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__18500);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__18503);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4153:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4157:1: ( ( ( RULE_INT )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4158:1: ( ( RULE_INT )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4158:1: ( ( RULE_INT )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4159:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4160:1: ( RULE_INT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4160:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl8531); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4170:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4174:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4175:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__28562);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__28565);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4182:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4186:1: ( ( '.' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4187:1: ( '.' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4187:1: ( '.' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4188:1: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__EFloat__Group__2__Impl8593); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4201:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4205:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4206:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__38624);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__38627);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4213:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4217:1: ( ( RULE_INT ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4218:1: ( RULE_INT )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4218:1: ( RULE_INT )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4219:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl8654); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4230:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4234:1: ( rule__EFloat__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4235:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__48683);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4241:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4245:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4246:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4246:1: ( ( rule__EFloat__Group_4__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4247:1: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4248:1: ( rule__EFloat__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=19 && LA37_0<=20)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4248:2: rule__EFloat__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl8710);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4268:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4272:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4273:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__08751);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__08754);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4280:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4284:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4285:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4285:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4286:1: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4287:1: ( rule__EFloat__Alternatives_4_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4287:2: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl8781);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4297:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4301:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4302:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__18811);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__18814);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4309:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4313:1: ( ( ( '-' )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4314:1: ( ( '-' )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4314:1: ( ( '-' )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4315:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4316:1: ( '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==24) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4317:2: '-'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__EFloat__Group_4__1__Impl8843); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4328:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4332:1: ( rule__EFloat__Group_4__2__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4333:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__28876);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4339:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4343:1: ( ( RULE_INT ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4344:1: ( RULE_INT )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4344:1: ( RULE_INT )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4345:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl8903); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4362:1: rule__Operacion__Group__0 : rule__Operacion__Group__0__Impl rule__Operacion__Group__1 ;
    public final void rule__Operacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4366:1: ( rule__Operacion__Group__0__Impl rule__Operacion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4367:2: rule__Operacion__Group__0__Impl rule__Operacion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__0__Impl_in_rule__Operacion__Group__08938);
            rule__Operacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__1_in_rule__Operacion__Group__08941);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4374:1: rule__Operacion__Group__0__Impl : ( '(' ) ;
    public final void rule__Operacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4378:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4379:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4379:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4380:1: '('
            {
             before(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Operacion__Group__0__Impl8969); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4393:1: rule__Operacion__Group__1 : rule__Operacion__Group__1__Impl rule__Operacion__Group__2 ;
    public final void rule__Operacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4397:1: ( rule__Operacion__Group__1__Impl rule__Operacion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4398:2: rule__Operacion__Group__1__Impl rule__Operacion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__1__Impl_in_rule__Operacion__Group__19000);
            rule__Operacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__2_in_rule__Operacion__Group__19003);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4405:1: rule__Operacion__Group__1__Impl : ( ( rule__Operacion__Op_izqAssignment_1 ) ) ;
    public final void rule__Operacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4409:1: ( ( ( rule__Operacion__Op_izqAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4410:1: ( ( rule__Operacion__Op_izqAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4410:1: ( ( rule__Operacion__Op_izqAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4411:1: ( rule__Operacion__Op_izqAssignment_1 )
            {
             before(grammarAccess.getOperacionAccess().getOp_izqAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4412:1: ( rule__Operacion__Op_izqAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4412:2: rule__Operacion__Op_izqAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Op_izqAssignment_1_in_rule__Operacion__Group__1__Impl9030);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4422:1: rule__Operacion__Group__2 : rule__Operacion__Group__2__Impl rule__Operacion__Group__3 ;
    public final void rule__Operacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4426:1: ( rule__Operacion__Group__2__Impl rule__Operacion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4427:2: rule__Operacion__Group__2__Impl rule__Operacion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__2__Impl_in_rule__Operacion__Group__29060);
            rule__Operacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__3_in_rule__Operacion__Group__29063);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4434:1: rule__Operacion__Group__2__Impl : ( ( rule__Operacion__Signo_opAssignment_2 ) ) ;
    public final void rule__Operacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4438:1: ( ( ( rule__Operacion__Signo_opAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4439:1: ( ( rule__Operacion__Signo_opAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4439:1: ( ( rule__Operacion__Signo_opAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4440:1: ( rule__Operacion__Signo_opAssignment_2 )
            {
             before(grammarAccess.getOperacionAccess().getSigno_opAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4441:1: ( rule__Operacion__Signo_opAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4441:2: rule__Operacion__Signo_opAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Signo_opAssignment_2_in_rule__Operacion__Group__2__Impl9090);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4451:1: rule__Operacion__Group__3 : rule__Operacion__Group__3__Impl rule__Operacion__Group__4 ;
    public final void rule__Operacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4455:1: ( rule__Operacion__Group__3__Impl rule__Operacion__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4456:2: rule__Operacion__Group__3__Impl rule__Operacion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__3__Impl_in_rule__Operacion__Group__39120);
            rule__Operacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__4_in_rule__Operacion__Group__39123);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4463:1: rule__Operacion__Group__3__Impl : ( ( rule__Operacion__Op_derAssignment_3 ) ) ;
    public final void rule__Operacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4467:1: ( ( ( rule__Operacion__Op_derAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4468:1: ( ( rule__Operacion__Op_derAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4468:1: ( ( rule__Operacion__Op_derAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4469:1: ( rule__Operacion__Op_derAssignment_3 )
            {
             before(grammarAccess.getOperacionAccess().getOp_derAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4470:1: ( rule__Operacion__Op_derAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4470:2: rule__Operacion__Op_derAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Op_derAssignment_3_in_rule__Operacion__Group__3__Impl9150);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4480:1: rule__Operacion__Group__4 : rule__Operacion__Group__4__Impl ;
    public final void rule__Operacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4484:1: ( rule__Operacion__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4485:2: rule__Operacion__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__4__Impl_in_rule__Operacion__Group__49180);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4491:1: rule__Operacion__Group__4__Impl : ( ')' ) ;
    public final void rule__Operacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4495:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4496:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4496:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4497:1: ')'
            {
             before(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_4()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Operacion__Group__4__Impl9208); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4520:1: rule__Sino__Group__0 : rule__Sino__Group__0__Impl rule__Sino__Group__1 ;
    public final void rule__Sino__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4524:1: ( rule__Sino__Group__0__Impl rule__Sino__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4525:2: rule__Sino__Group__0__Impl rule__Sino__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__0__Impl_in_rule__Sino__Group__09249);
            rule__Sino__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__1_in_rule__Sino__Group__09252);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4532:1: rule__Sino__Group__0__Impl : ( () ) ;
    public final void rule__Sino__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4536:1: ( ( () ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4537:1: ( () )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4537:1: ( () )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4538:1: ()
            {
             before(grammarAccess.getSinoAccess().getSinoAction_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4539:1: ()
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4541:1: 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4551:1: rule__Sino__Group__1 : rule__Sino__Group__1__Impl rule__Sino__Group__2 ;
    public final void rule__Sino__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4555:1: ( rule__Sino__Group__1__Impl rule__Sino__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4556:2: rule__Sino__Group__1__Impl rule__Sino__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__1__Impl_in_rule__Sino__Group__19310);
            rule__Sino__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__2_in_rule__Sino__Group__19313);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4563:1: rule__Sino__Group__1__Impl : ( 'sino' ) ;
    public final void rule__Sino__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4567:1: ( ( 'sino' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4568:1: ( 'sino' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4568:1: ( 'sino' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4569:1: 'sino'
            {
             before(grammarAccess.getSinoAccess().getSinoKeyword_1()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__Sino__Group__1__Impl9341); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4582:1: rule__Sino__Group__2 : rule__Sino__Group__2__Impl ;
    public final void rule__Sino__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4586:1: ( rule__Sino__Group__2__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4587:2: rule__Sino__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__2__Impl_in_rule__Sino__Group__29372);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4593:1: rule__Sino__Group__2__Impl : ( ( rule__Sino__Group_2__0 )? ) ;
    public final void rule__Sino__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4597:1: ( ( ( rule__Sino__Group_2__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4598:1: ( ( rule__Sino__Group_2__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4598:1: ( ( rule__Sino__Group_2__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4599:1: ( rule__Sino__Group_2__0 )?
            {
             before(grammarAccess.getSinoAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4600:1: ( rule__Sino__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)||(LA39_0>=45 && LA39_0<=47)||LA39_0==50||LA39_0==53||LA39_0==55) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4600:2: rule__Sino__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__0_in_rule__Sino__Group__2__Impl9399);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4616:1: rule__Sino__Group_2__0 : rule__Sino__Group_2__0__Impl rule__Sino__Group_2__1 ;
    public final void rule__Sino__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4620:1: ( rule__Sino__Group_2__0__Impl rule__Sino__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4621:2: rule__Sino__Group_2__0__Impl rule__Sino__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__0__Impl_in_rule__Sino__Group_2__09436);
            rule__Sino__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__1_in_rule__Sino__Group_2__09439);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4628:1: rule__Sino__Group_2__0__Impl : ( ( rule__Sino__SentenciasAssignment_2_0 ) ) ;
    public final void rule__Sino__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4632:1: ( ( ( rule__Sino__SentenciasAssignment_2_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4633:1: ( ( rule__Sino__SentenciasAssignment_2_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4633:1: ( ( rule__Sino__SentenciasAssignment_2_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4634:1: ( rule__Sino__SentenciasAssignment_2_0 )
            {
             before(grammarAccess.getSinoAccess().getSentenciasAssignment_2_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4635:1: ( rule__Sino__SentenciasAssignment_2_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4635:2: rule__Sino__SentenciasAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__SentenciasAssignment_2_0_in_rule__Sino__Group_2__0__Impl9466);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4645:1: rule__Sino__Group_2__1 : rule__Sino__Group_2__1__Impl ;
    public final void rule__Sino__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4649:1: ( rule__Sino__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4650:2: rule__Sino__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__1__Impl_in_rule__Sino__Group_2__19496);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4656:1: rule__Sino__Group_2__1__Impl : ( ( rule__Sino__SentenciasAssignment_2_1 )* ) ;
    public final void rule__Sino__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4660:1: ( ( ( rule__Sino__SentenciasAssignment_2_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4661:1: ( ( rule__Sino__SentenciasAssignment_2_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4661:1: ( ( rule__Sino__SentenciasAssignment_2_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4662:1: ( rule__Sino__SentenciasAssignment_2_1 )*
            {
             before(grammarAccess.getSinoAccess().getSentenciasAssignment_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4663:1: ( rule__Sino__SentenciasAssignment_2_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)||(LA40_0>=45 && LA40_0<=47)||LA40_0==50||LA40_0==53||LA40_0==55) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4663:2: rule__Sino__SentenciasAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Sino__SentenciasAssignment_2_1_in_rule__Sino__Group_2__1__Impl9523);
            	    rule__Sino__SentenciasAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4677:1: rule__ParametroFuncion__Group__0 : rule__ParametroFuncion__Group__0__Impl rule__ParametroFuncion__Group__1 ;
    public final void rule__ParametroFuncion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4681:1: ( rule__ParametroFuncion__Group__0__Impl rule__ParametroFuncion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4682:2: rule__ParametroFuncion__Group__0__Impl rule__ParametroFuncion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__0__Impl_in_rule__ParametroFuncion__Group__09558);
            rule__ParametroFuncion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__1_in_rule__ParametroFuncion__Group__09561);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4689:1: rule__ParametroFuncion__Group__0__Impl : ( ( rule__ParametroFuncion__TipoAssignment_0 ) ) ;
    public final void rule__ParametroFuncion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4693:1: ( ( ( rule__ParametroFuncion__TipoAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4694:1: ( ( rule__ParametroFuncion__TipoAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4694:1: ( ( rule__ParametroFuncion__TipoAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4695:1: ( rule__ParametroFuncion__TipoAssignment_0 )
            {
             before(grammarAccess.getParametroFuncionAccess().getTipoAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4696:1: ( rule__ParametroFuncion__TipoAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4696:2: rule__ParametroFuncion__TipoAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__TipoAssignment_0_in_rule__ParametroFuncion__Group__0__Impl9588);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4706:1: rule__ParametroFuncion__Group__1 : rule__ParametroFuncion__Group__1__Impl rule__ParametroFuncion__Group__2 ;
    public final void rule__ParametroFuncion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4710:1: ( rule__ParametroFuncion__Group__1__Impl rule__ParametroFuncion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4711:2: rule__ParametroFuncion__Group__1__Impl rule__ParametroFuncion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__1__Impl_in_rule__ParametroFuncion__Group__19618);
            rule__ParametroFuncion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__2_in_rule__ParametroFuncion__Group__19621);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4718:1: rule__ParametroFuncion__Group__1__Impl : ( ( rule__ParametroFuncion__PasoAssignment_1 ) ) ;
    public final void rule__ParametroFuncion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4722:1: ( ( ( rule__ParametroFuncion__PasoAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4723:1: ( ( rule__ParametroFuncion__PasoAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4723:1: ( ( rule__ParametroFuncion__PasoAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4724:1: ( rule__ParametroFuncion__PasoAssignment_1 )
            {
             before(grammarAccess.getParametroFuncionAccess().getPasoAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4725:1: ( rule__ParametroFuncion__PasoAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4725:2: rule__ParametroFuncion__PasoAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__PasoAssignment_1_in_rule__ParametroFuncion__Group__1__Impl9648);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4735:1: rule__ParametroFuncion__Group__2 : rule__ParametroFuncion__Group__2__Impl ;
    public final void rule__ParametroFuncion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4739:1: ( rule__ParametroFuncion__Group__2__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4740:2: rule__ParametroFuncion__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__2__Impl_in_rule__ParametroFuncion__Group__29678);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4746:1: rule__ParametroFuncion__Group__2__Impl : ( ( rule__ParametroFuncion__VariableAssignment_2 ) ) ;
    public final void rule__ParametroFuncion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4750:1: ( ( ( rule__ParametroFuncion__VariableAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4751:1: ( ( rule__ParametroFuncion__VariableAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4751:1: ( ( rule__ParametroFuncion__VariableAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4752:1: ( rule__ParametroFuncion__VariableAssignment_2 )
            {
             before(grammarAccess.getParametroFuncionAccess().getVariableAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4753:1: ( rule__ParametroFuncion__VariableAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4753:2: rule__ParametroFuncion__VariableAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__VariableAssignment_2_in_rule__ParametroFuncion__Group__2__Impl9705);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4769:1: rule__Funcion__Group__0 : rule__Funcion__Group__0__Impl rule__Funcion__Group__1 ;
    public final void rule__Funcion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4773:1: ( rule__Funcion__Group__0__Impl rule__Funcion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4774:2: rule__Funcion__Group__0__Impl rule__Funcion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__0__Impl_in_rule__Funcion__Group__09741);
            rule__Funcion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__1_in_rule__Funcion__Group__09744);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4781:1: rule__Funcion__Group__0__Impl : ( ( rule__Funcion__TipoAssignment_0 ) ) ;
    public final void rule__Funcion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4785:1: ( ( ( rule__Funcion__TipoAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4786:1: ( ( rule__Funcion__TipoAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4786:1: ( ( rule__Funcion__TipoAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4787:1: ( rule__Funcion__TipoAssignment_0 )
            {
             before(grammarAccess.getFuncionAccess().getTipoAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4788:1: ( rule__Funcion__TipoAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4788:2: rule__Funcion__TipoAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__TipoAssignment_0_in_rule__Funcion__Group__0__Impl9771);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4798:1: rule__Funcion__Group__1 : rule__Funcion__Group__1__Impl rule__Funcion__Group__2 ;
    public final void rule__Funcion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4802:1: ( rule__Funcion__Group__1__Impl rule__Funcion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4803:2: rule__Funcion__Group__1__Impl rule__Funcion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__1__Impl_in_rule__Funcion__Group__19801);
            rule__Funcion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__2_in_rule__Funcion__Group__19804);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4810:1: rule__Funcion__Group__1__Impl : ( 'funcion' ) ;
    public final void rule__Funcion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4814:1: ( ( 'funcion' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4815:1: ( 'funcion' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4815:1: ( 'funcion' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4816:1: 'funcion'
            {
             before(grammarAccess.getFuncionAccess().getFuncionKeyword_1()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__Funcion__Group__1__Impl9832); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4829:1: rule__Funcion__Group__2 : rule__Funcion__Group__2__Impl rule__Funcion__Group__3 ;
    public final void rule__Funcion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4833:1: ( rule__Funcion__Group__2__Impl rule__Funcion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4834:2: rule__Funcion__Group__2__Impl rule__Funcion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__2__Impl_in_rule__Funcion__Group__29863);
            rule__Funcion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__3_in_rule__Funcion__Group__29866);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4841:1: rule__Funcion__Group__2__Impl : ( ( rule__Funcion__NombreAssignment_2 ) ) ;
    public final void rule__Funcion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4845:1: ( ( ( rule__Funcion__NombreAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4846:1: ( ( rule__Funcion__NombreAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4846:1: ( ( rule__Funcion__NombreAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4847:1: ( rule__Funcion__NombreAssignment_2 )
            {
             before(grammarAccess.getFuncionAccess().getNombreAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4848:1: ( rule__Funcion__NombreAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4848:2: rule__Funcion__NombreAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__NombreAssignment_2_in_rule__Funcion__Group__2__Impl9893);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4858:1: rule__Funcion__Group__3 : rule__Funcion__Group__3__Impl rule__Funcion__Group__4 ;
    public final void rule__Funcion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4862:1: ( rule__Funcion__Group__3__Impl rule__Funcion__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4863:2: rule__Funcion__Group__3__Impl rule__Funcion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__3__Impl_in_rule__Funcion__Group__39923);
            rule__Funcion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__4_in_rule__Funcion__Group__39926);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4870:1: rule__Funcion__Group__3__Impl : ( '(' ) ;
    public final void rule__Funcion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4874:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4875:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4875:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4876:1: '('
            {
             before(grammarAccess.getFuncionAccess().getLeftParenthesisKeyword_3()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Funcion__Group__3__Impl9954); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4889:1: rule__Funcion__Group__4 : rule__Funcion__Group__4__Impl rule__Funcion__Group__5 ;
    public final void rule__Funcion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4893:1: ( rule__Funcion__Group__4__Impl rule__Funcion__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4894:2: rule__Funcion__Group__4__Impl rule__Funcion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__4__Impl_in_rule__Funcion__Group__49985);
            rule__Funcion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__5_in_rule__Funcion__Group__49988);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4901:1: rule__Funcion__Group__4__Impl : ( ( rule__Funcion__Group_4__0 )? ) ;
    public final void rule__Funcion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4905:1: ( ( ( rule__Funcion__Group_4__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4906:1: ( ( rule__Funcion__Group_4__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4906:1: ( ( rule__Funcion__Group_4__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4907:1: ( rule__Funcion__Group_4__0 )?
            {
             before(grammarAccess.getFuncionAccess().getGroup_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4908:1: ( rule__Funcion__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=14 && LA41_0<=18)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4908:2: rule__Funcion__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__0_in_rule__Funcion__Group__4__Impl10015);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4918:1: rule__Funcion__Group__5 : rule__Funcion__Group__5__Impl rule__Funcion__Group__6 ;
    public final void rule__Funcion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4922:1: ( rule__Funcion__Group__5__Impl rule__Funcion__Group__6 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4923:2: rule__Funcion__Group__5__Impl rule__Funcion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__5__Impl_in_rule__Funcion__Group__510046);
            rule__Funcion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__6_in_rule__Funcion__Group__510049);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4930:1: rule__Funcion__Group__5__Impl : ( ')' ) ;
    public final void rule__Funcion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4934:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4935:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4935:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4936:1: ')'
            {
             before(grammarAccess.getFuncionAccess().getRightParenthesisKeyword_5()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Funcion__Group__5__Impl10077); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4949:1: rule__Funcion__Group__6 : rule__Funcion__Group__6__Impl rule__Funcion__Group__7 ;
    public final void rule__Funcion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4953:1: ( rule__Funcion__Group__6__Impl rule__Funcion__Group__7 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4954:2: rule__Funcion__Group__6__Impl rule__Funcion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__6__Impl_in_rule__Funcion__Group__610108);
            rule__Funcion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__7_in_rule__Funcion__Group__610111);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4961:1: rule__Funcion__Group__6__Impl : ( 'var' ) ;
    public final void rule__Funcion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4965:1: ( ( 'var' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4966:1: ( 'var' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4966:1: ( 'var' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4967:1: 'var'
            {
             before(grammarAccess.getFuncionAccess().getVarKeyword_6()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Funcion__Group__6__Impl10139); 
             after(grammarAccess.getFuncionAccess().getVarKeyword_6()); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4980:1: rule__Funcion__Group__7 : rule__Funcion__Group__7__Impl rule__Funcion__Group__8 ;
    public final void rule__Funcion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4984:1: ( rule__Funcion__Group__7__Impl rule__Funcion__Group__8 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4985:2: rule__Funcion__Group__7__Impl rule__Funcion__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__7__Impl_in_rule__Funcion__Group__710170);
            rule__Funcion__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__8_in_rule__Funcion__Group__710173);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4992:1: rule__Funcion__Group__7__Impl : ( ( rule__Funcion__Group_7__0 )? ) ;
    public final void rule__Funcion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4996:1: ( ( ( rule__Funcion__Group_7__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4997:1: ( ( rule__Funcion__Group_7__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4997:1: ( ( rule__Funcion__Group_7__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4998:1: ( rule__Funcion__Group_7__0 )?
            {
             before(grammarAccess.getFuncionAccess().getGroup_7()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4999:1: ( rule__Funcion__Group_7__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=14 && LA42_0<=18)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4999:2: rule__Funcion__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__0_in_rule__Funcion__Group__7__Impl10200);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5009:1: rule__Funcion__Group__8 : rule__Funcion__Group__8__Impl rule__Funcion__Group__9 ;
    public final void rule__Funcion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5013:1: ( rule__Funcion__Group__8__Impl rule__Funcion__Group__9 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5014:2: rule__Funcion__Group__8__Impl rule__Funcion__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__8__Impl_in_rule__Funcion__Group__810231);
            rule__Funcion__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__9_in_rule__Funcion__Group__810234);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5021:1: rule__Funcion__Group__8__Impl : ( 'inicio' ) ;
    public final void rule__Funcion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5025:1: ( ( 'inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5026:1: ( 'inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5026:1: ( 'inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5027:1: 'inicio'
            {
             before(grammarAccess.getFuncionAccess().getInicioKeyword_8()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Funcion__Group__8__Impl10262); 
             after(grammarAccess.getFuncionAccess().getInicioKeyword_8()); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5040:1: rule__Funcion__Group__9 : rule__Funcion__Group__9__Impl rule__Funcion__Group__10 ;
    public final void rule__Funcion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5044:1: ( rule__Funcion__Group__9__Impl rule__Funcion__Group__10 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5045:2: rule__Funcion__Group__9__Impl rule__Funcion__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__9__Impl_in_rule__Funcion__Group__910293);
            rule__Funcion__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__10_in_rule__Funcion__Group__910296);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5052:1: rule__Funcion__Group__9__Impl : ( ( rule__Funcion__Group_9__0 )? ) ;
    public final void rule__Funcion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5056:1: ( ( ( rule__Funcion__Group_9__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5057:1: ( ( rule__Funcion__Group_9__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5057:1: ( ( rule__Funcion__Group_9__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5058:1: ( rule__Funcion__Group_9__0 )?
            {
             before(grammarAccess.getFuncionAccess().getGroup_9()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5059:1: ( rule__Funcion__Group_9__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)||(LA43_0>=45 && LA43_0<=47)||LA43_0==50||LA43_0==53||LA43_0==55) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5059:2: rule__Funcion__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_9__0_in_rule__Funcion__Group__9__Impl10323);
                    rule__Funcion__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFuncionAccess().getGroup_9()); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5069:1: rule__Funcion__Group__10 : rule__Funcion__Group__10__Impl rule__Funcion__Group__11 ;
    public final void rule__Funcion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5073:1: ( rule__Funcion__Group__10__Impl rule__Funcion__Group__11 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5074:2: rule__Funcion__Group__10__Impl rule__Funcion__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__10__Impl_in_rule__Funcion__Group__1010354);
            rule__Funcion__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__11_in_rule__Funcion__Group__1010357);
            rule__Funcion__Group__11();

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5081:1: rule__Funcion__Group__10__Impl : ( 'devolver' ) ;
    public final void rule__Funcion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5085:1: ( ( 'devolver' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5086:1: ( 'devolver' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5086:1: ( 'devolver' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5087:1: 'devolver'
            {
             before(grammarAccess.getFuncionAccess().getDevolverKeyword_10()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__Funcion__Group__10__Impl10385); 
             after(grammarAccess.getFuncionAccess().getDevolverKeyword_10()); 

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


    // $ANTLR start "rule__Funcion__Group__11"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5100:1: rule__Funcion__Group__11 : rule__Funcion__Group__11__Impl rule__Funcion__Group__12 ;
    public final void rule__Funcion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5104:1: ( rule__Funcion__Group__11__Impl rule__Funcion__Group__12 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5105:2: rule__Funcion__Group__11__Impl rule__Funcion__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__11__Impl_in_rule__Funcion__Group__1110416);
            rule__Funcion__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__12_in_rule__Funcion__Group__1110419);
            rule__Funcion__Group__12();

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
    // $ANTLR end "rule__Funcion__Group__11"


    // $ANTLR start "rule__Funcion__Group__11__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5112:1: rule__Funcion__Group__11__Impl : ( ( rule__Funcion__DevuelveAssignment_11 ) ) ;
    public final void rule__Funcion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5116:1: ( ( ( rule__Funcion__DevuelveAssignment_11 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5117:1: ( ( rule__Funcion__DevuelveAssignment_11 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5117:1: ( ( rule__Funcion__DevuelveAssignment_11 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5118:1: ( rule__Funcion__DevuelveAssignment_11 )
            {
             before(grammarAccess.getFuncionAccess().getDevuelveAssignment_11()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5119:1: ( rule__Funcion__DevuelveAssignment_11 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5119:2: rule__Funcion__DevuelveAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__DevuelveAssignment_11_in_rule__Funcion__Group__11__Impl10446);
            rule__Funcion__DevuelveAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getFuncionAccess().getDevuelveAssignment_11()); 

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
    // $ANTLR end "rule__Funcion__Group__11__Impl"


    // $ANTLR start "rule__Funcion__Group__12"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5129:1: rule__Funcion__Group__12 : rule__Funcion__Group__12__Impl ;
    public final void rule__Funcion__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5133:1: ( rule__Funcion__Group__12__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5134:2: rule__Funcion__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__12__Impl_in_rule__Funcion__Group__1210476);
            rule__Funcion__Group__12__Impl();

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
    // $ANTLR end "rule__Funcion__Group__12"


    // $ANTLR start "rule__Funcion__Group__12__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5140:1: rule__Funcion__Group__12__Impl : ( 'fin_funcion' ) ;
    public final void rule__Funcion__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5144:1: ( ( 'fin_funcion' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5145:1: ( 'fin_funcion' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5145:1: ( 'fin_funcion' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5146:1: 'fin_funcion'
            {
             before(grammarAccess.getFuncionAccess().getFin_funcionKeyword_12()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__Funcion__Group__12__Impl10504); 
             after(grammarAccess.getFuncionAccess().getFin_funcionKeyword_12()); 

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
    // $ANTLR end "rule__Funcion__Group__12__Impl"


    // $ANTLR start "rule__Funcion__Group_4__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5185:1: rule__Funcion__Group_4__0 : rule__Funcion__Group_4__0__Impl rule__Funcion__Group_4__1 ;
    public final void rule__Funcion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5189:1: ( rule__Funcion__Group_4__0__Impl rule__Funcion__Group_4__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5190:2: rule__Funcion__Group_4__0__Impl rule__Funcion__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__0__Impl_in_rule__Funcion__Group_4__010561);
            rule__Funcion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__1_in_rule__Funcion__Group_4__010564);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5197:1: rule__Funcion__Group_4__0__Impl : ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) ) ;
    public final void rule__Funcion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5201:1: ( ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5202:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5202:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5203:1: ( rule__Funcion__ParametrofuncionAssignment_4_0 )
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionAssignment_4_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5204:1: ( rule__Funcion__ParametrofuncionAssignment_4_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5204:2: rule__Funcion__ParametrofuncionAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_0_in_rule__Funcion__Group_4__0__Impl10591);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5214:1: rule__Funcion__Group_4__1 : rule__Funcion__Group_4__1__Impl ;
    public final void rule__Funcion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5218:1: ( rule__Funcion__Group_4__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5219:2: rule__Funcion__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__1__Impl_in_rule__Funcion__Group_4__110621);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5225:1: rule__Funcion__Group_4__1__Impl : ( ( rule__Funcion__Group_4_1__0 )* ) ;
    public final void rule__Funcion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5229:1: ( ( ( rule__Funcion__Group_4_1__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5230:1: ( ( rule__Funcion__Group_4_1__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5230:1: ( ( rule__Funcion__Group_4_1__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5231:1: ( rule__Funcion__Group_4_1__0 )*
            {
             before(grammarAccess.getFuncionAccess().getGroup_4_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5232:1: ( rule__Funcion__Group_4_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==41) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5232:2: rule__Funcion__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__0_in_rule__Funcion__Group_4__1__Impl10648);
            	    rule__Funcion__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5246:1: rule__Funcion__Group_4_1__0 : rule__Funcion__Group_4_1__0__Impl rule__Funcion__Group_4_1__1 ;
    public final void rule__Funcion__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5250:1: ( rule__Funcion__Group_4_1__0__Impl rule__Funcion__Group_4_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5251:2: rule__Funcion__Group_4_1__0__Impl rule__Funcion__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__0__Impl_in_rule__Funcion__Group_4_1__010683);
            rule__Funcion__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__1_in_rule__Funcion__Group_4_1__010686);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5258:1: rule__Funcion__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Funcion__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5262:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5263:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5263:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5264:1: ','
            {
             before(grammarAccess.getFuncionAccess().getCommaKeyword_4_1_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Funcion__Group_4_1__0__Impl10714); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5277:1: rule__Funcion__Group_4_1__1 : rule__Funcion__Group_4_1__1__Impl ;
    public final void rule__Funcion__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5281:1: ( rule__Funcion__Group_4_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5282:2: rule__Funcion__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__1__Impl_in_rule__Funcion__Group_4_1__110745);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5288:1: rule__Funcion__Group_4_1__1__Impl : ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) ) ;
    public final void rule__Funcion__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5292:1: ( ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5293:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5293:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5294:1: ( rule__Funcion__ParametrofuncionAssignment_4_1_1 )
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionAssignment_4_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5295:1: ( rule__Funcion__ParametrofuncionAssignment_4_1_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5295:2: rule__Funcion__ParametrofuncionAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_1_1_in_rule__Funcion__Group_4_1__1__Impl10772);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5309:1: rule__Funcion__Group_7__0 : rule__Funcion__Group_7__0__Impl rule__Funcion__Group_7__1 ;
    public final void rule__Funcion__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5313:1: ( rule__Funcion__Group_7__0__Impl rule__Funcion__Group_7__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5314:2: rule__Funcion__Group_7__0__Impl rule__Funcion__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__0__Impl_in_rule__Funcion__Group_7__010806);
            rule__Funcion__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__1_in_rule__Funcion__Group_7__010809);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5321:1: rule__Funcion__Group_7__0__Impl : ( ( rule__Funcion__DeclaracionvariableAssignment_7_0 ) ) ;
    public final void rule__Funcion__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5325:1: ( ( ( rule__Funcion__DeclaracionvariableAssignment_7_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5326:1: ( ( rule__Funcion__DeclaracionvariableAssignment_7_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5326:1: ( ( rule__Funcion__DeclaracionvariableAssignment_7_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5327:1: ( rule__Funcion__DeclaracionvariableAssignment_7_0 )
            {
             before(grammarAccess.getFuncionAccess().getDeclaracionvariableAssignment_7_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5328:1: ( rule__Funcion__DeclaracionvariableAssignment_7_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5328:2: rule__Funcion__DeclaracionvariableAssignment_7_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__DeclaracionvariableAssignment_7_0_in_rule__Funcion__Group_7__0__Impl10836);
            rule__Funcion__DeclaracionvariableAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getFuncionAccess().getDeclaracionvariableAssignment_7_0()); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5338:1: rule__Funcion__Group_7__1 : rule__Funcion__Group_7__1__Impl ;
    public final void rule__Funcion__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5342:1: ( rule__Funcion__Group_7__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5343:2: rule__Funcion__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__1__Impl_in_rule__Funcion__Group_7__110866);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5349:1: rule__Funcion__Group_7__1__Impl : ( ( rule__Funcion__DeclaracionvariableAssignment_7_1 )* ) ;
    public final void rule__Funcion__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5353:1: ( ( ( rule__Funcion__DeclaracionvariableAssignment_7_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5354:1: ( ( rule__Funcion__DeclaracionvariableAssignment_7_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5354:1: ( ( rule__Funcion__DeclaracionvariableAssignment_7_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5355:1: ( rule__Funcion__DeclaracionvariableAssignment_7_1 )*
            {
             before(grammarAccess.getFuncionAccess().getDeclaracionvariableAssignment_7_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5356:1: ( rule__Funcion__DeclaracionvariableAssignment_7_1 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=14 && LA45_0<=18)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5356:2: rule__Funcion__DeclaracionvariableAssignment_7_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Funcion__DeclaracionvariableAssignment_7_1_in_rule__Funcion__Group_7__1__Impl10893);
            	    rule__Funcion__DeclaracionvariableAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getFuncionAccess().getDeclaracionvariableAssignment_7_1()); 

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


    // $ANTLR start "rule__Funcion__Group_9__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5370:1: rule__Funcion__Group_9__0 : rule__Funcion__Group_9__0__Impl rule__Funcion__Group_9__1 ;
    public final void rule__Funcion__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5374:1: ( rule__Funcion__Group_9__0__Impl rule__Funcion__Group_9__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5375:2: rule__Funcion__Group_9__0__Impl rule__Funcion__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_9__0__Impl_in_rule__Funcion__Group_9__010928);
            rule__Funcion__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_9__1_in_rule__Funcion__Group_9__010931);
            rule__Funcion__Group_9__1();

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
    // $ANTLR end "rule__Funcion__Group_9__0"


    // $ANTLR start "rule__Funcion__Group_9__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5382:1: rule__Funcion__Group_9__0__Impl : ( ( rule__Funcion__SentenciasAssignment_9_0 ) ) ;
    public final void rule__Funcion__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5386:1: ( ( ( rule__Funcion__SentenciasAssignment_9_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5387:1: ( ( rule__Funcion__SentenciasAssignment_9_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5387:1: ( ( rule__Funcion__SentenciasAssignment_9_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5388:1: ( rule__Funcion__SentenciasAssignment_9_0 )
            {
             before(grammarAccess.getFuncionAccess().getSentenciasAssignment_9_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5389:1: ( rule__Funcion__SentenciasAssignment_9_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5389:2: rule__Funcion__SentenciasAssignment_9_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__SentenciasAssignment_9_0_in_rule__Funcion__Group_9__0__Impl10958);
            rule__Funcion__SentenciasAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getFuncionAccess().getSentenciasAssignment_9_0()); 

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
    // $ANTLR end "rule__Funcion__Group_9__0__Impl"


    // $ANTLR start "rule__Funcion__Group_9__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5399:1: rule__Funcion__Group_9__1 : rule__Funcion__Group_9__1__Impl ;
    public final void rule__Funcion__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5403:1: ( rule__Funcion__Group_9__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5404:2: rule__Funcion__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_9__1__Impl_in_rule__Funcion__Group_9__110988);
            rule__Funcion__Group_9__1__Impl();

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
    // $ANTLR end "rule__Funcion__Group_9__1"


    // $ANTLR start "rule__Funcion__Group_9__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5410:1: rule__Funcion__Group_9__1__Impl : ( ( rule__Funcion__SentenciasAssignment_9_1 )* ) ;
    public final void rule__Funcion__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5414:1: ( ( ( rule__Funcion__SentenciasAssignment_9_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5415:1: ( ( rule__Funcion__SentenciasAssignment_9_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5415:1: ( ( rule__Funcion__SentenciasAssignment_9_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5416:1: ( rule__Funcion__SentenciasAssignment_9_1 )*
            {
             before(grammarAccess.getFuncionAccess().getSentenciasAssignment_9_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5417:1: ( rule__Funcion__SentenciasAssignment_9_1 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_STRING && LA46_0<=RULE_ID)||(LA46_0>=45 && LA46_0<=47)||LA46_0==50||LA46_0==53||LA46_0==55) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5417:2: rule__Funcion__SentenciasAssignment_9_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Funcion__SentenciasAssignment_9_1_in_rule__Funcion__Group_9__1__Impl11015);
            	    rule__Funcion__SentenciasAssignment_9_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getFuncionAccess().getSentenciasAssignment_9_1()); 

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
    // $ANTLR end "rule__Funcion__Group_9__1__Impl"


    // $ANTLR start "rule__Procedimiento__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5431:1: rule__Procedimiento__Group__0 : rule__Procedimiento__Group__0__Impl rule__Procedimiento__Group__1 ;
    public final void rule__Procedimiento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5435:1: ( rule__Procedimiento__Group__0__Impl rule__Procedimiento__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5436:2: rule__Procedimiento__Group__0__Impl rule__Procedimiento__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__0__Impl_in_rule__Procedimiento__Group__011050);
            rule__Procedimiento__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__1_in_rule__Procedimiento__Group__011053);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5443:1: rule__Procedimiento__Group__0__Impl : ( 'procedimiento' ) ;
    public final void rule__Procedimiento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5447:1: ( ( 'procedimiento' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5448:1: ( 'procedimiento' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5448:1: ( 'procedimiento' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5449:1: 'procedimiento'
            {
             before(grammarAccess.getProcedimientoAccess().getProcedimientoKeyword_0()); 
            match(input,63,FollowSets000.FOLLOW_63_in_rule__Procedimiento__Group__0__Impl11081); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5462:1: rule__Procedimiento__Group__1 : rule__Procedimiento__Group__1__Impl rule__Procedimiento__Group__2 ;
    public final void rule__Procedimiento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5466:1: ( rule__Procedimiento__Group__1__Impl rule__Procedimiento__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5467:2: rule__Procedimiento__Group__1__Impl rule__Procedimiento__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__1__Impl_in_rule__Procedimiento__Group__111112);
            rule__Procedimiento__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__2_in_rule__Procedimiento__Group__111115);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5474:1: rule__Procedimiento__Group__1__Impl : ( ( rule__Procedimiento__NombreAssignment_1 ) ) ;
    public final void rule__Procedimiento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5478:1: ( ( ( rule__Procedimiento__NombreAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5479:1: ( ( rule__Procedimiento__NombreAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5479:1: ( ( rule__Procedimiento__NombreAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5480:1: ( rule__Procedimiento__NombreAssignment_1 )
            {
             before(grammarAccess.getProcedimientoAccess().getNombreAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5481:1: ( rule__Procedimiento__NombreAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5481:2: rule__Procedimiento__NombreAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__NombreAssignment_1_in_rule__Procedimiento__Group__1__Impl11142);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5491:1: rule__Procedimiento__Group__2 : rule__Procedimiento__Group__2__Impl rule__Procedimiento__Group__3 ;
    public final void rule__Procedimiento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5495:1: ( rule__Procedimiento__Group__2__Impl rule__Procedimiento__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5496:2: rule__Procedimiento__Group__2__Impl rule__Procedimiento__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__2__Impl_in_rule__Procedimiento__Group__211172);
            rule__Procedimiento__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__3_in_rule__Procedimiento__Group__211175);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5503:1: rule__Procedimiento__Group__2__Impl : ( '(' ) ;
    public final void rule__Procedimiento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5507:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5508:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5508:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5509:1: '('
            {
             before(grammarAccess.getProcedimientoAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Procedimiento__Group__2__Impl11203); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5522:1: rule__Procedimiento__Group__3 : rule__Procedimiento__Group__3__Impl rule__Procedimiento__Group__4 ;
    public final void rule__Procedimiento__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5526:1: ( rule__Procedimiento__Group__3__Impl rule__Procedimiento__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5527:2: rule__Procedimiento__Group__3__Impl rule__Procedimiento__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__3__Impl_in_rule__Procedimiento__Group__311234);
            rule__Procedimiento__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__4_in_rule__Procedimiento__Group__311237);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5534:1: rule__Procedimiento__Group__3__Impl : ( ( rule__Procedimiento__Group_3__0 )? ) ;
    public final void rule__Procedimiento__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5538:1: ( ( ( rule__Procedimiento__Group_3__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5539:1: ( ( rule__Procedimiento__Group_3__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5539:1: ( ( rule__Procedimiento__Group_3__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5540:1: ( rule__Procedimiento__Group_3__0 )?
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5541:1: ( rule__Procedimiento__Group_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=14 && LA47_0<=18)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5541:2: rule__Procedimiento__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__0_in_rule__Procedimiento__Group__3__Impl11264);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5551:1: rule__Procedimiento__Group__4 : rule__Procedimiento__Group__4__Impl rule__Procedimiento__Group__5 ;
    public final void rule__Procedimiento__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5555:1: ( rule__Procedimiento__Group__4__Impl rule__Procedimiento__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5556:2: rule__Procedimiento__Group__4__Impl rule__Procedimiento__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__4__Impl_in_rule__Procedimiento__Group__411295);
            rule__Procedimiento__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__5_in_rule__Procedimiento__Group__411298);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5563:1: rule__Procedimiento__Group__4__Impl : ( ')' ) ;
    public final void rule__Procedimiento__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5567:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5568:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5568:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5569:1: ')'
            {
             before(grammarAccess.getProcedimientoAccess().getRightParenthesisKeyword_4()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Procedimiento__Group__4__Impl11326); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5582:1: rule__Procedimiento__Group__5 : rule__Procedimiento__Group__5__Impl rule__Procedimiento__Group__6 ;
    public final void rule__Procedimiento__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5586:1: ( rule__Procedimiento__Group__5__Impl rule__Procedimiento__Group__6 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5587:2: rule__Procedimiento__Group__5__Impl rule__Procedimiento__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__5__Impl_in_rule__Procedimiento__Group__511357);
            rule__Procedimiento__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__6_in_rule__Procedimiento__Group__511360);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5594:1: rule__Procedimiento__Group__5__Impl : ( 'var' ) ;
    public final void rule__Procedimiento__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5598:1: ( ( 'var' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5599:1: ( 'var' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5599:1: ( 'var' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5600:1: 'var'
            {
             before(grammarAccess.getProcedimientoAccess().getVarKeyword_5()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Procedimiento__Group__5__Impl11388); 
             after(grammarAccess.getProcedimientoAccess().getVarKeyword_5()); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5613:1: rule__Procedimiento__Group__6 : rule__Procedimiento__Group__6__Impl rule__Procedimiento__Group__7 ;
    public final void rule__Procedimiento__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5617:1: ( rule__Procedimiento__Group__6__Impl rule__Procedimiento__Group__7 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5618:2: rule__Procedimiento__Group__6__Impl rule__Procedimiento__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__6__Impl_in_rule__Procedimiento__Group__611419);
            rule__Procedimiento__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__7_in_rule__Procedimiento__Group__611422);
            rule__Procedimiento__Group__7();

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5625:1: rule__Procedimiento__Group__6__Impl : ( ( rule__Procedimiento__Group_6__0 )? ) ;
    public final void rule__Procedimiento__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5629:1: ( ( ( rule__Procedimiento__Group_6__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5630:1: ( ( rule__Procedimiento__Group_6__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5630:1: ( ( rule__Procedimiento__Group_6__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5631:1: ( rule__Procedimiento__Group_6__0 )?
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_6()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5632:1: ( rule__Procedimiento__Group_6__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=14 && LA48_0<=18)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5632:2: rule__Procedimiento__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_6__0_in_rule__Procedimiento__Group__6__Impl11449);
                    rule__Procedimiento__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcedimientoAccess().getGroup_6()); 

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


    // $ANTLR start "rule__Procedimiento__Group__7"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5642:1: rule__Procedimiento__Group__7 : rule__Procedimiento__Group__7__Impl rule__Procedimiento__Group__8 ;
    public final void rule__Procedimiento__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5646:1: ( rule__Procedimiento__Group__7__Impl rule__Procedimiento__Group__8 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5647:2: rule__Procedimiento__Group__7__Impl rule__Procedimiento__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__7__Impl_in_rule__Procedimiento__Group__711480);
            rule__Procedimiento__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__8_in_rule__Procedimiento__Group__711483);
            rule__Procedimiento__Group__8();

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
    // $ANTLR end "rule__Procedimiento__Group__7"


    // $ANTLR start "rule__Procedimiento__Group__7__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5654:1: rule__Procedimiento__Group__7__Impl : ( 'inicio' ) ;
    public final void rule__Procedimiento__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5658:1: ( ( 'inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5659:1: ( 'inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5659:1: ( 'inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5660:1: 'inicio'
            {
             before(grammarAccess.getProcedimientoAccess().getInicioKeyword_7()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Procedimiento__Group__7__Impl11511); 
             after(grammarAccess.getProcedimientoAccess().getInicioKeyword_7()); 

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
    // $ANTLR end "rule__Procedimiento__Group__7__Impl"


    // $ANTLR start "rule__Procedimiento__Group__8"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5673:1: rule__Procedimiento__Group__8 : rule__Procedimiento__Group__8__Impl rule__Procedimiento__Group__9 ;
    public final void rule__Procedimiento__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5677:1: ( rule__Procedimiento__Group__8__Impl rule__Procedimiento__Group__9 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5678:2: rule__Procedimiento__Group__8__Impl rule__Procedimiento__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__8__Impl_in_rule__Procedimiento__Group__811542);
            rule__Procedimiento__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__9_in_rule__Procedimiento__Group__811545);
            rule__Procedimiento__Group__9();

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
    // $ANTLR end "rule__Procedimiento__Group__8"


    // $ANTLR start "rule__Procedimiento__Group__8__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5685:1: rule__Procedimiento__Group__8__Impl : ( ( rule__Procedimiento__Group_8__0 )? ) ;
    public final void rule__Procedimiento__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5689:1: ( ( ( rule__Procedimiento__Group_8__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5690:1: ( ( rule__Procedimiento__Group_8__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5690:1: ( ( rule__Procedimiento__Group_8__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5691:1: ( rule__Procedimiento__Group_8__0 )?
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_8()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5692:1: ( rule__Procedimiento__Group_8__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_ID)||(LA49_0>=45 && LA49_0<=47)||LA49_0==50||LA49_0==53||LA49_0==55) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5692:2: rule__Procedimiento__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_8__0_in_rule__Procedimiento__Group__8__Impl11572);
                    rule__Procedimiento__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcedimientoAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Procedimiento__Group__8__Impl"


    // $ANTLR start "rule__Procedimiento__Group__9"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5702:1: rule__Procedimiento__Group__9 : rule__Procedimiento__Group__9__Impl ;
    public final void rule__Procedimiento__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5706:1: ( rule__Procedimiento__Group__9__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5707:2: rule__Procedimiento__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__9__Impl_in_rule__Procedimiento__Group__911603);
            rule__Procedimiento__Group__9__Impl();

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
    // $ANTLR end "rule__Procedimiento__Group__9"


    // $ANTLR start "rule__Procedimiento__Group__9__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5713:1: rule__Procedimiento__Group__9__Impl : ( 'fin_procedimiento' ) ;
    public final void rule__Procedimiento__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5717:1: ( ( 'fin_procedimiento' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5718:1: ( 'fin_procedimiento' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5718:1: ( 'fin_procedimiento' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5719:1: 'fin_procedimiento'
            {
             before(grammarAccess.getProcedimientoAccess().getFin_procedimientoKeyword_9()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__Procedimiento__Group__9__Impl11631); 
             after(grammarAccess.getProcedimientoAccess().getFin_procedimientoKeyword_9()); 

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
    // $ANTLR end "rule__Procedimiento__Group__9__Impl"


    // $ANTLR start "rule__Procedimiento__Group_3__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5752:1: rule__Procedimiento__Group_3__0 : rule__Procedimiento__Group_3__0__Impl rule__Procedimiento__Group_3__1 ;
    public final void rule__Procedimiento__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5756:1: ( rule__Procedimiento__Group_3__0__Impl rule__Procedimiento__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5757:2: rule__Procedimiento__Group_3__0__Impl rule__Procedimiento__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__0__Impl_in_rule__Procedimiento__Group_3__011682);
            rule__Procedimiento__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__1_in_rule__Procedimiento__Group_3__011685);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5764:1: rule__Procedimiento__Group_3__0__Impl : ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) ) ;
    public final void rule__Procedimiento__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5768:1: ( ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5769:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5769:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5770:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_0 )
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionAssignment_3_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5771:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5771:2: rule__Procedimiento__ParametrofuncionAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_0_in_rule__Procedimiento__Group_3__0__Impl11712);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5781:1: rule__Procedimiento__Group_3__1 : rule__Procedimiento__Group_3__1__Impl ;
    public final void rule__Procedimiento__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5785:1: ( rule__Procedimiento__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5786:2: rule__Procedimiento__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__1__Impl_in_rule__Procedimiento__Group_3__111742);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5792:1: rule__Procedimiento__Group_3__1__Impl : ( ( rule__Procedimiento__Group_3_1__0 )* ) ;
    public final void rule__Procedimiento__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5796:1: ( ( ( rule__Procedimiento__Group_3_1__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5797:1: ( ( rule__Procedimiento__Group_3_1__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5797:1: ( ( rule__Procedimiento__Group_3_1__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5798:1: ( rule__Procedimiento__Group_3_1__0 )*
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5799:1: ( rule__Procedimiento__Group_3_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==41) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5799:2: rule__Procedimiento__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__0_in_rule__Procedimiento__Group_3__1__Impl11769);
            	    rule__Procedimiento__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5813:1: rule__Procedimiento__Group_3_1__0 : rule__Procedimiento__Group_3_1__0__Impl rule__Procedimiento__Group_3_1__1 ;
    public final void rule__Procedimiento__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5817:1: ( rule__Procedimiento__Group_3_1__0__Impl rule__Procedimiento__Group_3_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5818:2: rule__Procedimiento__Group_3_1__0__Impl rule__Procedimiento__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__0__Impl_in_rule__Procedimiento__Group_3_1__011804);
            rule__Procedimiento__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__1_in_rule__Procedimiento__Group_3_1__011807);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5825:1: rule__Procedimiento__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Procedimiento__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5829:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5830:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5830:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5831:1: ','
            {
             before(grammarAccess.getProcedimientoAccess().getCommaKeyword_3_1_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Procedimiento__Group_3_1__0__Impl11835); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5844:1: rule__Procedimiento__Group_3_1__1 : rule__Procedimiento__Group_3_1__1__Impl ;
    public final void rule__Procedimiento__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5848:1: ( rule__Procedimiento__Group_3_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5849:2: rule__Procedimiento__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__1__Impl_in_rule__Procedimiento__Group_3_1__111866);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5855:1: rule__Procedimiento__Group_3_1__1__Impl : ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) ) ;
    public final void rule__Procedimiento__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5859:1: ( ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5860:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5860:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5861:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 )
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionAssignment_3_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5862:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5862:2: rule__Procedimiento__ParametrofuncionAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_1_1_in_rule__Procedimiento__Group_3_1__1__Impl11893);
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


    // $ANTLR start "rule__Procedimiento__Group_6__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5876:1: rule__Procedimiento__Group_6__0 : rule__Procedimiento__Group_6__0__Impl rule__Procedimiento__Group_6__1 ;
    public final void rule__Procedimiento__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5880:1: ( rule__Procedimiento__Group_6__0__Impl rule__Procedimiento__Group_6__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5881:2: rule__Procedimiento__Group_6__0__Impl rule__Procedimiento__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_6__0__Impl_in_rule__Procedimiento__Group_6__011927);
            rule__Procedimiento__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_6__1_in_rule__Procedimiento__Group_6__011930);
            rule__Procedimiento__Group_6__1();

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
    // $ANTLR end "rule__Procedimiento__Group_6__0"


    // $ANTLR start "rule__Procedimiento__Group_6__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5888:1: rule__Procedimiento__Group_6__0__Impl : ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 ) ) ;
    public final void rule__Procedimiento__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5892:1: ( ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5893:1: ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5893:1: ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5894:1: ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 )
            {
             before(grammarAccess.getProcedimientoAccess().getDeclaracionvariableAssignment_6_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5895:1: ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5895:2: rule__Procedimiento__DeclaracionvariableAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__DeclaracionvariableAssignment_6_0_in_rule__Procedimiento__Group_6__0__Impl11957);
            rule__Procedimiento__DeclaracionvariableAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getProcedimientoAccess().getDeclaracionvariableAssignment_6_0()); 

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
    // $ANTLR end "rule__Procedimiento__Group_6__0__Impl"


    // $ANTLR start "rule__Procedimiento__Group_6__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5905:1: rule__Procedimiento__Group_6__1 : rule__Procedimiento__Group_6__1__Impl ;
    public final void rule__Procedimiento__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5909:1: ( rule__Procedimiento__Group_6__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5910:2: rule__Procedimiento__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_6__1__Impl_in_rule__Procedimiento__Group_6__111987);
            rule__Procedimiento__Group_6__1__Impl();

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
    // $ANTLR end "rule__Procedimiento__Group_6__1"


    // $ANTLR start "rule__Procedimiento__Group_6__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5916:1: rule__Procedimiento__Group_6__1__Impl : ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )* ) ;
    public final void rule__Procedimiento__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5920:1: ( ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5921:1: ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5921:1: ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5922:1: ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )*
            {
             before(grammarAccess.getProcedimientoAccess().getDeclaracionvariableAssignment_6_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5923:1: ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=14 && LA51_0<=18)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5923:2: rule__Procedimiento__DeclaracionvariableAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__DeclaracionvariableAssignment_6_1_in_rule__Procedimiento__Group_6__1__Impl12014);
            	    rule__Procedimiento__DeclaracionvariableAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getProcedimientoAccess().getDeclaracionvariableAssignment_6_1()); 

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
    // $ANTLR end "rule__Procedimiento__Group_6__1__Impl"


    // $ANTLR start "rule__Procedimiento__Group_8__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5937:1: rule__Procedimiento__Group_8__0 : rule__Procedimiento__Group_8__0__Impl rule__Procedimiento__Group_8__1 ;
    public final void rule__Procedimiento__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5941:1: ( rule__Procedimiento__Group_8__0__Impl rule__Procedimiento__Group_8__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5942:2: rule__Procedimiento__Group_8__0__Impl rule__Procedimiento__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_8__0__Impl_in_rule__Procedimiento__Group_8__012049);
            rule__Procedimiento__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_8__1_in_rule__Procedimiento__Group_8__012052);
            rule__Procedimiento__Group_8__1();

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
    // $ANTLR end "rule__Procedimiento__Group_8__0"


    // $ANTLR start "rule__Procedimiento__Group_8__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5949:1: rule__Procedimiento__Group_8__0__Impl : ( ( rule__Procedimiento__SentenciasAssignment_8_0 ) ) ;
    public final void rule__Procedimiento__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5953:1: ( ( ( rule__Procedimiento__SentenciasAssignment_8_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5954:1: ( ( rule__Procedimiento__SentenciasAssignment_8_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5954:1: ( ( rule__Procedimiento__SentenciasAssignment_8_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5955:1: ( rule__Procedimiento__SentenciasAssignment_8_0 )
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasAssignment_8_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5956:1: ( rule__Procedimiento__SentenciasAssignment_8_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5956:2: rule__Procedimiento__SentenciasAssignment_8_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__SentenciasAssignment_8_0_in_rule__Procedimiento__Group_8__0__Impl12079);
            rule__Procedimiento__SentenciasAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getProcedimientoAccess().getSentenciasAssignment_8_0()); 

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
    // $ANTLR end "rule__Procedimiento__Group_8__0__Impl"


    // $ANTLR start "rule__Procedimiento__Group_8__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5966:1: rule__Procedimiento__Group_8__1 : rule__Procedimiento__Group_8__1__Impl ;
    public final void rule__Procedimiento__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5970:1: ( rule__Procedimiento__Group_8__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5971:2: rule__Procedimiento__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_8__1__Impl_in_rule__Procedimiento__Group_8__112109);
            rule__Procedimiento__Group_8__1__Impl();

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
    // $ANTLR end "rule__Procedimiento__Group_8__1"


    // $ANTLR start "rule__Procedimiento__Group_8__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5977:1: rule__Procedimiento__Group_8__1__Impl : ( ( rule__Procedimiento__SentenciasAssignment_8_1 )* ) ;
    public final void rule__Procedimiento__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5981:1: ( ( ( rule__Procedimiento__SentenciasAssignment_8_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5982:1: ( ( rule__Procedimiento__SentenciasAssignment_8_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5982:1: ( ( rule__Procedimiento__SentenciasAssignment_8_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5983:1: ( rule__Procedimiento__SentenciasAssignment_8_1 )*
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasAssignment_8_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5984:1: ( rule__Procedimiento__SentenciasAssignment_8_1 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)||(LA52_0>=45 && LA52_0<=47)||LA52_0==50||LA52_0==53||LA52_0==55) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5984:2: rule__Procedimiento__SentenciasAssignment_8_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__SentenciasAssignment_8_1_in_rule__Procedimiento__Group_8__1__Impl12136);
            	    rule__Procedimiento__SentenciasAssignment_8_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getProcedimientoAccess().getSentenciasAssignment_8_1()); 

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
    // $ANTLR end "rule__Procedimiento__Group_8__1__Impl"


    // $ANTLR start "rule__Codigo__FuncionAssignment_0_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5999:1: rule__Codigo__FuncionAssignment_0_0 : ( ruleSubproceso ) ;
    public final void rule__Codigo__FuncionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6003:1: ( ( ruleSubproceso ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6004:1: ( ruleSubproceso )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6004:1: ( ruleSubproceso )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6005:1: ruleSubproceso
            {
             before(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_0_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_012176);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6014:1: rule__Codigo__FuncionAssignment_0_1 : ( ruleSubproceso ) ;
    public final void rule__Codigo__FuncionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6018:1: ( ( ruleSubproceso ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6019:1: ( ruleSubproceso )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6019:1: ( ruleSubproceso )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6020:1: ruleSubproceso
            {
             before(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_112207);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6029:1: rule__Codigo__TieneAssignment_1 : ( ruleInicio ) ;
    public final void rule__Codigo__TieneAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6033:1: ( ( ruleInicio ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6034:1: ( ruleInicio )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6034:1: ( ruleInicio )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6035:1: ruleInicio
            {
             before(grammarAccess.getCodigoAccess().getTieneInicioParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_rule__Codigo__TieneAssignment_112238);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6044:1: rule__Caracter__ContenidoAssignment : ( RULE_CAR ) ;
    public final void rule__Caracter__ContenidoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6048:1: ( ( RULE_CAR ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6049:1: ( RULE_CAR )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6049:1: ( RULE_CAR )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6050:1: RULE_CAR
            {
             before(grammarAccess.getCaracterAccess().getContenidoCARTerminalRuleCall_0()); 
            match(input,RULE_CAR,FollowSets000.FOLLOW_RULE_CAR_in_rule__Caracter__ContenidoAssignment12269); 
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


    // $ANTLR start "rule__Inicio__DeclaracionvariableAssignment_2_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6059:1: rule__Inicio__DeclaracionvariableAssignment_2_0 : ( ruleDeclaracionVariable ) ;
    public final void rule__Inicio__DeclaracionvariableAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6063:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6064:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6064:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6065:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getInicioAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Inicio__DeclaracionvariableAssignment_2_012300);
            ruleDeclaracionVariable();

            state._fsp--;

             after(grammarAccess.getInicioAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Inicio__DeclaracionvariableAssignment_2_0"


    // $ANTLR start "rule__Inicio__DeclaracionvariableAssignment_2_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6074:1: rule__Inicio__DeclaracionvariableAssignment_2_1 : ( ruleDeclaracionVariable ) ;
    public final void rule__Inicio__DeclaracionvariableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6078:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6079:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6079:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6080:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getInicioAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Inicio__DeclaracionvariableAssignment_2_112331);
            ruleDeclaracionVariable();

            state._fsp--;

             after(grammarAccess.getInicioAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Inicio__DeclaracionvariableAssignment_2_1"


    // $ANTLR start "rule__Inicio__TieneAssignment_4_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6089:1: rule__Inicio__TieneAssignment_4_0 : ( ruleSentencias ) ;
    public final void rule__Inicio__TieneAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6093:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6094:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6094:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6095:1: ruleSentencias
            {
             before(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_4_012362);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Inicio__TieneAssignment_4_0"


    // $ANTLR start "rule__Inicio__TieneAssignment_4_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6104:1: rule__Inicio__TieneAssignment_4_1 : ( ruleSentencias ) ;
    public final void rule__Inicio__TieneAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6108:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6109:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6109:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6110:1: ruleSentencias
            {
             before(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_4_112393);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Inicio__TieneAssignment_4_1"


    // $ANTLR start "rule__DeclaracionVariable__TipoAssignment_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6119:1: rule__DeclaracionVariable__TipoAssignment_0 : ( ruleTipoVariable ) ;
    public final void rule__DeclaracionVariable__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6123:1: ( ( ruleTipoVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6124:1: ( ruleTipoVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6124:1: ( ruleTipoVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6125:1: ruleTipoVariable
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_rule__DeclaracionVariable__TipoAssignment_012424);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6134:1: rule__DeclaracionVariable__TieneIDsAssignment_1 : ( ruleVariable ) ;
    public final void rule__DeclaracionVariable__TieneIDsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6138:1: ( ( ruleVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6139:1: ( ruleVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6139:1: ( ruleVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6140:1: ruleVariable
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsVariableParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_112455);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6149:1: rule__DeclaracionVariable__TieneIDsAssignment_2_1 : ( ruleVariable ) ;
    public final void rule__DeclaracionVariable__TieneIDsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6153:1: ( ( ruleVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6154:1: ( ruleVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6154:1: ( ruleVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6155:1: ruleVariable
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsVariableParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_2_112486);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6164:1: rule__LlamadaFuncion__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__LlamadaFuncion__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6168:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6169:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6169:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6170:1: ruleEString
            {
             before(grammarAccess.getLlamadaFuncionAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__LlamadaFuncion__NombreAssignment_012517);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6179:1: rule__LlamadaFuncion__OperadorAssignment_2_0 : ( ruleOperador ) ;
    public final void rule__LlamadaFuncion__OperadorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6183:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6184:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6184:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6185:1: ruleOperador
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorOperadorParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_012548);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6194:1: rule__LlamadaFuncion__OperadorAssignment_2_1_1 : ( ruleOperador ) ;
    public final void rule__LlamadaFuncion__OperadorAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6198:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6199:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6199:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6200:1: ruleOperador
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorOperadorParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_1_112579);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6209:1: rule__Asignacion__LvalueAssignment_0 : ( ruleEString ) ;
    public final void rule__Asignacion__LvalueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6213:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6214:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6214:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6215:1: ruleEString
            {
             before(grammarAccess.getAsignacionAccess().getLvalueEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Asignacion__LvalueAssignment_012610);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6224:1: rule__Asignacion__MatAssignment_1 : ( RULE_MATRIZ ) ;
    public final void rule__Asignacion__MatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6228:1: ( ( RULE_MATRIZ ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6229:1: ( RULE_MATRIZ )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6229:1: ( RULE_MATRIZ )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6230:1: RULE_MATRIZ
            {
             before(grammarAccess.getAsignacionAccess().getMatMATRIZTerminalRuleCall_1_0()); 
            match(input,RULE_MATRIZ,FollowSets000.FOLLOW_RULE_MATRIZ_in_rule__Asignacion__MatAssignment_112641); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6239:1: rule__Asignacion__OperadorAssignment_3 : ( rulevalor ) ;
    public final void rule__Asignacion__OperadorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6243:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6244:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6244:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6245:1: rulevalor
            {
             before(grammarAccess.getAsignacionAccess().getOperadorValorParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Asignacion__OperadorAssignment_312672);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6254:1: rule__Escribir__OperadorAssignment_2 : ( ruleOperador ) ;
    public final void rule__Escribir__OperadorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6258:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6259:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6259:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6260:1: ruleOperador
            {
             before(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_212703);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6269:1: rule__Escribir__OperadorAssignment_3_1 : ( ruleOperador ) ;
    public final void rule__Escribir__OperadorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6273:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6274:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6274:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6275:1: ruleOperador
            {
             before(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_3_112734);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6284:1: rule__Leer__VariableAssignment_2 : ( ruleVariableID ) ;
    public final void rule__Leer__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6288:1: ( ( ruleVariableID ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6289:1: ( ruleVariableID )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6289:1: ( ruleVariableID )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6290:1: ruleVariableID
            {
             before(grammarAccess.getLeerAccess().getVariableVariableIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__Leer__VariableAssignment_212765);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6299:1: rule__Si__ValorAssignment_1 : ( rulevalor ) ;
    public final void rule__Si__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6303:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6304:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6304:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6305:1: rulevalor
            {
             before(grammarAccess.getSiAccess().getValorValorParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Si__ValorAssignment_112796);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6314:1: rule__Si__SentenciasAssignment_3_0 : ( ruleSentencias ) ;
    public final void rule__Si__SentenciasAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6318:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6319:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6319:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6320:1: ruleSentencias
            {
             before(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_012827);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6329:1: rule__Si__SentenciasAssignment_3_1 : ( ruleSentencias ) ;
    public final void rule__Si__SentenciasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6333:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6334:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6334:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6335:1: ruleSentencias
            {
             before(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_112858);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6344:1: rule__Si__SinoAssignment_4 : ( ruleSino ) ;
    public final void rule__Si__SinoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6348:1: ( ( ruleSino ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6349:1: ( ruleSino )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6349:1: ( ruleSino )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6350:1: ruleSino
            {
             before(grammarAccess.getSiAccess().getSinoSinoParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSino_in_rule__Si__SinoAssignment_412889);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6359:1: rule__Mientras__ValorAssignment_1 : ( rulevalor ) ;
    public final void rule__Mientras__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6363:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6364:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6364:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6365:1: rulevalor
            {
             before(grammarAccess.getMientrasAccess().getValorValorParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Mientras__ValorAssignment_112920);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6374:1: rule__Mientras__SentenciasAssignment_3_0 : ( ruleSentencias ) ;
    public final void rule__Mientras__SentenciasAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6378:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6379:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6379:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6380:1: ruleSentencias
            {
             before(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_012951);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6389:1: rule__Mientras__SentenciasAssignment_3_1 : ( ruleSentencias ) ;
    public final void rule__Mientras__SentenciasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6393:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6394:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6394:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6395:1: ruleSentencias
            {
             before(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_112982);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6404:1: rule__Repetir__SentenciasAssignment_1_0 : ( ruleSentencias ) ;
    public final void rule__Repetir__SentenciasAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6408:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6409:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6409:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6410:1: ruleSentencias
            {
             before(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_013013);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6419:1: rule__Repetir__SentenciasAssignment_1_1 : ( ruleSentencias ) ;
    public final void rule__Repetir__SentenciasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6423:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6424:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6424:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6425:1: ruleSentencias
            {
             before(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_113044);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6434:1: rule__Repetir__ValorAssignment_3 : ( rulevalor ) ;
    public final void rule__Repetir__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6438:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6439:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6439:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6440:1: rulevalor
            {
             before(grammarAccess.getRepetirAccess().getValorValorParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Repetir__ValorAssignment_313075);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6449:1: rule__Desde__AsignacionAssignment_1 : ( ruleAsignacion ) ;
    public final void rule__Desde__AsignacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6453:1: ( ( ruleAsignacion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6454:1: ( ruleAsignacion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6454:1: ( ruleAsignacion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6455:1: ruleAsignacion
            {
             before(grammarAccess.getDesdeAccess().getAsignacionAsignacionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_rule__Desde__AsignacionAssignment_113106);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6464:1: rule__Desde__ValorAssignment_3 : ( rulevalor ) ;
    public final void rule__Desde__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6468:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6469:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6469:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6470:1: rulevalor
            {
             before(grammarAccess.getDesdeAccess().getValorValorParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Desde__ValorAssignment_313137);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6479:1: rule__Desde__SentenciasAssignment_5_0 : ( ruleSentencias ) ;
    public final void rule__Desde__SentenciasAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6483:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6484:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6484:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6485:1: ruleSentencias
            {
             before(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_013168);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6494:1: rule__Desde__SentenciasAssignment_5_1 : ( ruleSentencias ) ;
    public final void rule__Desde__SentenciasAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6498:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6499:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6499:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6500:1: ruleSentencias
            {
             before(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_113199);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6509:1: rule__Incremento__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__Incremento__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6513:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6514:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6514:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6515:1: ruleEString
            {
             before(grammarAccess.getIncrementoAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Incremento__NombreAssignment_013230);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6524:1: rule__Incremento__SsignoAssignment_1 : ( ruleinc ) ;
    public final void rule__Incremento__SsignoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6528:1: ( ( ruleinc ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6529:1: ( ruleinc )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6529:1: ( ruleinc )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6530:1: ruleinc
            {
             before(grammarAccess.getIncrementoAccess().getSsignoIncParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_rule__Incremento__SsignoAssignment_113261);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6539:1: rule__Variable__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__Variable__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6543:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6544:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6544:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6545:1: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Variable__NombreAssignment_013292);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6554:1: rule__Variable__MatAssignment_1 : ( RULE_MATRIZ ) ;
    public final void rule__Variable__MatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6558:1: ( ( RULE_MATRIZ ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6559:1: ( RULE_MATRIZ )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6559:1: ( RULE_MATRIZ )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6560:1: RULE_MATRIZ
            {
             before(grammarAccess.getVariableAccess().getMatMATRIZTerminalRuleCall_1_0()); 
            match(input,RULE_MATRIZ,FollowSets000.FOLLOW_RULE_MATRIZ_in_rule__Variable__MatAssignment_113323); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6569:1: rule__VariableID__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__VariableID__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6573:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6574:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6574:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6575:1: ruleEString
            {
             before(grammarAccess.getVariableIDAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VariableID__NombreAssignment_013354);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6584:1: rule__VariableID__MatAssignment_1 : ( RULE_MATRIZ ) ;
    public final void rule__VariableID__MatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6588:1: ( ( RULE_MATRIZ ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6589:1: ( RULE_MATRIZ )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6589:1: ( RULE_MATRIZ )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6590:1: RULE_MATRIZ
            {
             before(grammarAccess.getVariableIDAccess().getMatMATRIZTerminalRuleCall_1_0()); 
            match(input,RULE_MATRIZ,FollowSets000.FOLLOW_RULE_MATRIZ_in_rule__VariableID__MatAssignment_113385); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6599:1: rule__ConstCadena__ContenidoAssignment : ( RULE_CAD ) ;
    public final void rule__ConstCadena__ContenidoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6603:1: ( ( RULE_CAD ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6604:1: ( RULE_CAD )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6604:1: ( RULE_CAD )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6605:1: RULE_CAD
            {
             before(grammarAccess.getConstCadenaAccess().getContenidoCADTerminalRuleCall_0()); 
            match(input,RULE_CAD,FollowSets000.FOLLOW_RULE_CAD_in_rule__ConstCadena__ContenidoAssignment13416); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6614:1: rule__NumeroEntero__ValorAssignment : ( ruleEInt ) ;
    public final void rule__NumeroEntero__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6618:1: ( ( ruleEInt ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6619:1: ( ruleEInt )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6619:1: ( ruleEInt )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6620:1: ruleEInt
            {
             before(grammarAccess.getNumeroEnteroAccess().getValorEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__NumeroEntero__ValorAssignment13447);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6629:1: rule__NumeroDecimal__ValorAssignment : ( ruleEFloat ) ;
    public final void rule__NumeroDecimal__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6633:1: ( ( ruleEFloat ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6634:1: ( ruleEFloat )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6634:1: ( ruleEFloat )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6635:1: ruleEFloat
            {
             before(grammarAccess.getNumeroDecimalAccess().getValorEFloatParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rule__NumeroDecimal__ValorAssignment13478);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6644:1: rule__ValorBooleano__ValorAssignment : ( rulebooleano ) ;
    public final void rule__ValorBooleano__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6648:1: ( ( rulebooleano ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6649:1: ( rulebooleano )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6649:1: ( rulebooleano )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6650:1: rulebooleano
            {
             before(grammarAccess.getValorBooleanoAccess().getValorBooleanoParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleano_in_rule__ValorBooleano__ValorAssignment13509);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6659:1: rule__Operacion__Op_izqAssignment_1 : ( ruleoperando_izq ) ;
    public final void rule__Operacion__Op_izqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6663:1: ( ( ruleoperando_izq ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6664:1: ( ruleoperando_izq )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6664:1: ( ruleoperando_izq )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6665:1: ruleoperando_izq
            {
             before(grammarAccess.getOperacionAccess().getOp_izqOperando_izqParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_izq_in_rule__Operacion__Op_izqAssignment_113540);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6674:1: rule__Operacion__Signo_opAssignment_2 : ( rulesigno ) ;
    public final void rule__Operacion__Signo_opAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6678:1: ( ( rulesigno ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6679:1: ( rulesigno )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6679:1: ( rulesigno )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6680:1: rulesigno
            {
             before(grammarAccess.getOperacionAccess().getSigno_opSignoParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulesigno_in_rule__Operacion__Signo_opAssignment_213571);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6689:1: rule__Operacion__Op_derAssignment_3 : ( ruleoperando_der ) ;
    public final void rule__Operacion__Op_derAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6693:1: ( ( ruleoperando_der ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6694:1: ( ruleoperando_der )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6694:1: ( ruleoperando_der )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6695:1: ruleoperando_der
            {
             before(grammarAccess.getOperacionAccess().getOp_derOperando_derParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_der_in_rule__Operacion__Op_derAssignment_313602);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6704:1: rule__Operando_izq__Oper_izqAssignment : ( rulevalor ) ;
    public final void rule__Operando_izq__Oper_izqAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6708:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6709:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6709:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6710:1: rulevalor
            {
             before(grammarAccess.getOperando_izqAccess().getOper_izqValorParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Operando_izq__Oper_izqAssignment13633);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6719:1: rule__Operando_der__Oper_derAssignment : ( rulevalor ) ;
    public final void rule__Operando_der__Oper_derAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6723:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6724:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6724:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6725:1: rulevalor
            {
             before(grammarAccess.getOperando_derAccess().getOper_derValorParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Operando_der__Oper_derAssignment13664);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6734:1: rule__Sino__SentenciasAssignment_2_0 : ( ruleSentencias ) ;
    public final void rule__Sino__SentenciasAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6738:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6739:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6739:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6740:1: ruleSentencias
            {
             before(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_013695);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6749:1: rule__Sino__SentenciasAssignment_2_1 : ( ruleSentencias ) ;
    public final void rule__Sino__SentenciasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6753:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6754:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6754:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6755:1: ruleSentencias
            {
             before(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_113726);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6764:1: rule__ParametroFuncion__TipoAssignment_0 : ( ruleTipoVariable ) ;
    public final void rule__ParametroFuncion__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6768:1: ( ( ruleTipoVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6769:1: ( ruleTipoVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6769:1: ( ruleTipoVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6770:1: ruleTipoVariable
            {
             before(grammarAccess.getParametroFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_rule__ParametroFuncion__TipoAssignment_013757);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6779:1: rule__ParametroFuncion__PasoAssignment_1 : ( ruleTipoPaso ) ;
    public final void rule__ParametroFuncion__PasoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6783:1: ( ( ruleTipoPaso ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6784:1: ( ruleTipoPaso )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6784:1: ( ruleTipoPaso )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6785:1: ruleTipoPaso
            {
             before(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_rule__ParametroFuncion__PasoAssignment_113788);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6794:1: rule__ParametroFuncion__VariableAssignment_2 : ( ruleVariable ) ;
    public final void rule__ParametroFuncion__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6798:1: ( ( ruleVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6799:1: ( ruleVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6799:1: ( ruleVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6800:1: ruleVariable
            {
             before(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__ParametroFuncion__VariableAssignment_213819);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6809:1: rule__Funcion__TipoAssignment_0 : ( ruleTipoVariable ) ;
    public final void rule__Funcion__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6813:1: ( ( ruleTipoVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6814:1: ( ruleTipoVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6814:1: ( ruleTipoVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6815:1: ruleTipoVariable
            {
             before(grammarAccess.getFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_rule__Funcion__TipoAssignment_013850);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6824:1: rule__Funcion__NombreAssignment_2 : ( ruleEString ) ;
    public final void rule__Funcion__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6828:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6829:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6829:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6830:1: ruleEString
            {
             before(grammarAccess.getFuncionAccess().getNombreEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Funcion__NombreAssignment_213881);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6839:1: rule__Funcion__ParametrofuncionAssignment_4_0 : ( ruleParametroFuncion ) ;
    public final void rule__Funcion__ParametrofuncionAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6843:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6844:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6844:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6845:1: ruleParametroFuncion
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_013912);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6854:1: rule__Funcion__ParametrofuncionAssignment_4_1_1 : ( ruleParametroFuncion ) ;
    public final void rule__Funcion__ParametrofuncionAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6858:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6859:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6859:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6860:1: ruleParametroFuncion
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_1_113943);
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


    // $ANTLR start "rule__Funcion__DeclaracionvariableAssignment_7_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6869:1: rule__Funcion__DeclaracionvariableAssignment_7_0 : ( ruleDeclaracionVariable ) ;
    public final void rule__Funcion__DeclaracionvariableAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6873:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6874:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6874:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6875:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getFuncionAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_7_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Funcion__DeclaracionvariableAssignment_7_013974);
            ruleDeclaracionVariable();

            state._fsp--;

             after(grammarAccess.getFuncionAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_7_0_0()); 

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
    // $ANTLR end "rule__Funcion__DeclaracionvariableAssignment_7_0"


    // $ANTLR start "rule__Funcion__DeclaracionvariableAssignment_7_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6884:1: rule__Funcion__DeclaracionvariableAssignment_7_1 : ( ruleDeclaracionVariable ) ;
    public final void rule__Funcion__DeclaracionvariableAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6888:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6889:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6889:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6890:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getFuncionAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Funcion__DeclaracionvariableAssignment_7_114005);
            ruleDeclaracionVariable();

            state._fsp--;

             after(grammarAccess.getFuncionAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Funcion__DeclaracionvariableAssignment_7_1"


    // $ANTLR start "rule__Funcion__SentenciasAssignment_9_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6899:1: rule__Funcion__SentenciasAssignment_9_0 : ( ruleSentencias ) ;
    public final void rule__Funcion__SentenciasAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6903:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6904:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6904:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6905:1: ruleSentencias
            {
             before(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_9_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_9_014036);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_9_0_0()); 

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
    // $ANTLR end "rule__Funcion__SentenciasAssignment_9_0"


    // $ANTLR start "rule__Funcion__SentenciasAssignment_9_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6914:1: rule__Funcion__SentenciasAssignment_9_1 : ( ruleSentencias ) ;
    public final void rule__Funcion__SentenciasAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6918:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6919:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6919:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6920:1: ruleSentencias
            {
             before(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_9_114067);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Funcion__SentenciasAssignment_9_1"


    // $ANTLR start "rule__Funcion__DevuelveAssignment_11"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6929:1: rule__Funcion__DevuelveAssignment_11 : ( rulevalor ) ;
    public final void rule__Funcion__DevuelveAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6933:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6934:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6934:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6935:1: rulevalor
            {
             before(grammarAccess.getFuncionAccess().getDevuelveValorParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Funcion__DevuelveAssignment_1114098);
            rulevalor();

            state._fsp--;

             after(grammarAccess.getFuncionAccess().getDevuelveValorParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Funcion__DevuelveAssignment_11"


    // $ANTLR start "rule__Procedimiento__NombreAssignment_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6944:1: rule__Procedimiento__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__Procedimiento__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6948:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6949:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6949:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6950:1: ruleEString
            {
             before(grammarAccess.getProcedimientoAccess().getNombreEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Procedimiento__NombreAssignment_114129);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6959:1: rule__Procedimiento__ParametrofuncionAssignment_3_0 : ( ruleParametroFuncion ) ;
    public final void rule__Procedimiento__ParametrofuncionAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6963:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6964:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6964:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6965:1: ruleParametroFuncion
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_014160);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6974:1: rule__Procedimiento__ParametrofuncionAssignment_3_1_1 : ( ruleParametroFuncion ) ;
    public final void rule__Procedimiento__ParametrofuncionAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6978:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6979:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6979:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6980:1: ruleParametroFuncion
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_1_114191);
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


    // $ANTLR start "rule__Procedimiento__DeclaracionvariableAssignment_6_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6989:1: rule__Procedimiento__DeclaracionvariableAssignment_6_0 : ( ruleDeclaracionVariable ) ;
    public final void rule__Procedimiento__DeclaracionvariableAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6993:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6994:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6994:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6995:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getProcedimientoAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_6_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Procedimiento__DeclaracionvariableAssignment_6_014222);
            ruleDeclaracionVariable();

            state._fsp--;

             after(grammarAccess.getProcedimientoAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__Procedimiento__DeclaracionvariableAssignment_6_0"


    // $ANTLR start "rule__Procedimiento__DeclaracionvariableAssignment_6_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7004:1: rule__Procedimiento__DeclaracionvariableAssignment_6_1 : ( ruleDeclaracionVariable ) ;
    public final void rule__Procedimiento__DeclaracionvariableAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7008:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7009:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7009:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7010:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getProcedimientoAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Procedimiento__DeclaracionvariableAssignment_6_114253);
            ruleDeclaracionVariable();

            state._fsp--;

             after(grammarAccess.getProcedimientoAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Procedimiento__DeclaracionvariableAssignment_6_1"


    // $ANTLR start "rule__Procedimiento__SentenciasAssignment_8_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7019:1: rule__Procedimiento__SentenciasAssignment_8_0 : ( ruleSentencias ) ;
    public final void rule__Procedimiento__SentenciasAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7023:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7024:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7024:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7025:1: ruleSentencias
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_8_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_8_014284);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_8_0_0()); 

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
    // $ANTLR end "rule__Procedimiento__SentenciasAssignment_8_0"


    // $ANTLR start "rule__Procedimiento__SentenciasAssignment_8_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7034:1: rule__Procedimiento__SentenciasAssignment_8_1 : ( ruleSentencias ) ;
    public final void rule__Procedimiento__SentenciasAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7038:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7039:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7039:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7040:1: ruleSentencias
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_8_114315);
            ruleSentencias();

            state._fsp--;

             after(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Procedimiento__SentenciasAssignment_8_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA2_eotS =
        "\14\uffff";
    static final String DFA2_eofS =
        "\14\uffff";
    static final String DFA2_minS =
        "\1\4\2\10\11\uffff";
    static final String DFA2_maxS =
        "\1\67\2\54\11\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\2\1\1";
    static final String DFA2_specialS =
        "\14\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\2\47\uffff\1\3\1\4\1\5\2\uffff\1\6\2\uffff\1\7\1\uffff"+
            "\1\10",
            "\1\12\32\uffff\2\11\5\uffff\1\13\1\uffff\1\12",
            "\1\12\32\uffff\2\11\5\uffff\1\13\1\uffff\1\12",
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
            return "1146:1: rule__Sentencias__Alternatives : ( ( ruleLlamadaFuncion ) | ( ruleAsignacion ) | ( ruleEscribir ) | ( ruleLeer ) | ( ruleSi ) | ( rulemientras ) | ( rulerepetir ) | ( ruledesde ) | ( ruleincremento ) );";
        }
    }
    static final String DFA4_eotS =
        "\15\uffff";
    static final String DFA4_eofS =
        "\1\uffff\2\13\2\uffff\1\14\7\uffff";
    static final String DFA4_minS =
        "\3\4\1\uffff\1\6\1\4\7\uffff";
    static final String DFA4_maxS =
        "\1\72\2\100\1\uffff\1\72\1\100\7\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\3\2\uffff\1\5\1\6\1\7\1\10\1\1\1\2\1\4";
    static final String DFA4_specialS =
        "\15\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\1\5\1\11\1\uffff\1\3\13\uffff\2\10\1\uffff\1\4\21"+
            "\uffff\1\7\17\uffff\1\6",
            "\2\13\2\uffff\1\13\16\uffff\14\13\5\uffff\1\13\1\uffff\1\12"+
            "\1\13\1\uffff\15\13\1\uffff\1\13\1\uffff\2\13\1\uffff\1\13",
            "\2\13\2\uffff\1\13\16\uffff\14\13\5\uffff\1\13\1\uffff\1\12"+
            "\1\13\1\uffff\15\13\1\uffff\1\13\1\uffff\2\13\1\uffff\1\13",
            "",
            "\1\5\63\uffff\1\6",
            "\2\14\21\uffff\14\14\5\uffff\1\14\2\uffff\1\14\1\uffff\15"+
            "\14\1\6\1\14\1\uffff\2\14\1\uffff\1\14",
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
            return "1256:1: rule__Valor__Alternatives : ( ( ruleLlamadaFuncion ) | ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleoperacion ) | ( ruleValorBooleano ) | ( ruleCaracter ) );";
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
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_rule__Sentencias__Alternatives2399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_rule__Sentencias__Alternatives2416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_rule__Sentencias__Alternatives2433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_rule__Sentencias__Alternatives2450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_rule__Sentencias__Alternatives2467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_rule__Sentencias__Alternatives2484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_rule__Sentencias__Alternatives2501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_rule__Sentencias__Alternatives2518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleincremento_in_rule__Sentencias__Alternatives2535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__Operador__Alternatives2567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstCadena_in_rule__Operador__Alternatives2584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_rule__Operador__Alternatives2601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_rule__Operador__Alternatives2618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_rule__Operador__Alternatives2635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_rule__Operador__Alternatives2652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_rule__Valor__Alternatives2684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__Valor__Alternatives2701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstCadena_in_rule__Valor__Alternatives2718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_rule__Valor__Alternatives2735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_rule__Valor__Alternatives2752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_rule__Valor__Alternatives2769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_rule__Valor__Alternatives2786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_rule__Valor__Alternatives2803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TipoVariable__Alternatives2885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TipoVariable__Alternatives2905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TipoVariable__Alternatives2925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TipoVariable__Alternatives2945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__TipoVariable__Alternatives2965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__EFloat__Alternatives_4_03000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__EFloat__Alternatives_4_03020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Booleano__Alternatives3055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Booleano__Alternatives3075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Signo__Alternatives3110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Signo__Alternatives3130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Signo__Alternatives3150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Signo__Alternatives3170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Signo__Alternatives3190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Signo__Alternatives3210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Signo__Alternatives3230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Signo__Alternatives3250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Signo__Alternatives3270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Signo__Alternatives3290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Signo__Alternatives3310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Signo__Alternatives3330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Inc__Alternatives3365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Inc__Alternatives3385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__TipoPaso__Alternatives3420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__TipoPaso__Alternatives3440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group__0__Impl_in_rule__Codigo__Group__03472 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Codigo__Group__1_in_rule__Codigo__Group__03475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group_0__0_in_rule__Codigo__Group__0__Impl3502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group__1__Impl_in_rule__Codigo__Group__13533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__TieneAssignment_1_in_rule__Codigo__Group__1__Impl3560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group_0__0__Impl_in_rule__Codigo__Group_0__03594 = new BitSet(new long[]{0x800000000007C000L});
        public static final BitSet FOLLOW_rule__Codigo__Group_0__1_in_rule__Codigo__Group_0__03597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__FuncionAssignment_0_0_in_rule__Codigo__Group_0__0__Impl3624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group_0__1__Impl_in_rule__Codigo__Group_0__13654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__FuncionAssignment_0_1_in_rule__Codigo__Group_0__1__Impl3681 = new BitSet(new long[]{0x800000000007C002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__0__Impl_in_rule__Inicio__Group__03716 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Inicio__Group__1_in_rule__Inicio__Group__03719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__1__Impl_in_rule__Inicio__Group__13777 = new BitSet(new long[]{0x000000800007C000L});
        public static final BitSet FOLLOW_rule__Inicio__Group__2_in_rule__Inicio__Group__13780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Inicio__Group__1__Impl3808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__2__Impl_in_rule__Inicio__Group__23839 = new BitSet(new long[]{0x000000800007C000L});
        public static final BitSet FOLLOW_rule__Inicio__Group__3_in_rule__Inicio__Group__23842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__0_in_rule__Inicio__Group__2__Impl3869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__3__Impl_in_rule__Inicio__Group__33900 = new BitSet(new long[]{0x00A4E10000000030L});
        public static final BitSet FOLLOW_rule__Inicio__Group__4_in_rule__Inicio__Group__33903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Inicio__Group__3__Impl3931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__4__Impl_in_rule__Inicio__Group__43962 = new BitSet(new long[]{0x00A4E10000000030L});
        public static final BitSet FOLLOW_rule__Inicio__Group__5_in_rule__Inicio__Group__43965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_4__0_in_rule__Inicio__Group__4__Impl3992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__5__Impl_in_rule__Inicio__Group__54023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Inicio__Group__5__Impl4051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__0__Impl_in_rule__Inicio__Group_2__04094 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__1_in_rule__Inicio__Group_2__04097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__DeclaracionvariableAssignment_2_0_in_rule__Inicio__Group_2__0__Impl4124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__1__Impl_in_rule__Inicio__Group_2__14154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__DeclaracionvariableAssignment_2_1_in_rule__Inicio__Group_2__1__Impl4181 = new BitSet(new long[]{0x000000000007C002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_4__0__Impl_in_rule__Inicio__Group_4__04216 = new BitSet(new long[]{0x00A4E00000000030L});
        public static final BitSet FOLLOW_rule__Inicio__Group_4__1_in_rule__Inicio__Group_4__04219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__TieneAssignment_4_0_in_rule__Inicio__Group_4__0__Impl4246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_4__1__Impl_in_rule__Inicio__Group_4__14276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__TieneAssignment_4_1_in_rule__Inicio__Group_4__1__Impl4303 = new BitSet(new long[]{0x00A4E00000000032L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__0__Impl_in_rule__DeclaracionVariable__Group__04338 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__1_in_rule__DeclaracionVariable__Group__04341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__TipoAssignment_0_in_rule__DeclaracionVariable__Group__0__Impl4368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__1__Impl_in_rule__DeclaracionVariable__Group__14398 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__2_in_rule__DeclaracionVariable__Group__14401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_1_in_rule__DeclaracionVariable__Group__1__Impl4428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__2__Impl_in_rule__DeclaracionVariable__Group__24458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_2__0_in_rule__DeclaracionVariable__Group__2__Impl4485 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_2__0__Impl_in_rule__DeclaracionVariable__Group_2__04522 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_2__1_in_rule__DeclaracionVariable__Group_2__04525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__DeclaracionVariable__Group_2__0__Impl4553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_2__1__Impl_in_rule__DeclaracionVariable__Group_2__14584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_2_1_in_rule__DeclaracionVariable__Group_2__1__Impl4611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__0__Impl_in_rule__LlamadaFuncion__Group__04645 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__1_in_rule__LlamadaFuncion__Group__04648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__NombreAssignment_0_in_rule__LlamadaFuncion__Group__0__Impl4675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__1__Impl_in_rule__LlamadaFuncion__Group__14705 = new BitSet(new long[]{0x04000800016002F0L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__2_in_rule__LlamadaFuncion__Group__14708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__LlamadaFuncion__Group__1__Impl4736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__2__Impl_in_rule__LlamadaFuncion__Group__24767 = new BitSet(new long[]{0x04000800016002F0L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__3_in_rule__LlamadaFuncion__Group__24770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__0_in_rule__LlamadaFuncion__Group__2__Impl4797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__3__Impl_in_rule__LlamadaFuncion__Group__34828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__LlamadaFuncion__Group__3__Impl4856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__0__Impl_in_rule__LlamadaFuncion__Group_2__04895 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__1_in_rule__LlamadaFuncion__Group_2__04898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_0_in_rule__LlamadaFuncion__Group_2__0__Impl4925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__1__Impl_in_rule__LlamadaFuncion__Group_2__14955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__0_in_rule__LlamadaFuncion__Group_2__1__Impl4982 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__0__Impl_in_rule__LlamadaFuncion__Group_2_1__05017 = new BitSet(new long[]{0x04000000016002F0L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__1_in_rule__LlamadaFuncion__Group_2_1__05020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__LlamadaFuncion__Group_2_1__0__Impl5048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__1__Impl_in_rule__LlamadaFuncion__Group_2_1__15079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_1_1_in_rule__LlamadaFuncion__Group_2_1__1__Impl5106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__0__Impl_in_rule__Asignacion__Group__05140 = new BitSet(new long[]{0x0000100000000100L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__1_in_rule__Asignacion__Group__05143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__LvalueAssignment_0_in_rule__Asignacion__Group__0__Impl5170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__1__Impl_in_rule__Asignacion__Group__15200 = new BitSet(new long[]{0x0000100000000100L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__2_in_rule__Asignacion__Group__15203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__MatAssignment_1_in_rule__Asignacion__Group__1__Impl5230 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__2__Impl_in_rule__Asignacion__Group__25261 = new BitSet(new long[]{0x04000400016002F0L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__3_in_rule__Asignacion__Group__25264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Asignacion__Group__2__Impl5292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__3__Impl_in_rule__Asignacion__Group__35323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__OperadorAssignment_3_in_rule__Asignacion__Group__3__Impl5350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__0__Impl_in_rule__Escribir__Group__05388 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Escribir__Group__1_in_rule__Escribir__Group__05391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Escribir__Group__0__Impl5419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__1__Impl_in_rule__Escribir__Group__15450 = new BitSet(new long[]{0x04000000016002F0L});
        public static final BitSet FOLLOW_rule__Escribir__Group__2_in_rule__Escribir__Group__15453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Escribir__Group__1__Impl5481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__2__Impl_in_rule__Escribir__Group__25512 = new BitSet(new long[]{0x00000A0000000000L});
        public static final BitSet FOLLOW_rule__Escribir__Group__3_in_rule__Escribir__Group__25515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__OperadorAssignment_2_in_rule__Escribir__Group__2__Impl5542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__3__Impl_in_rule__Escribir__Group__35572 = new BitSet(new long[]{0x00000A0000000000L});
        public static final BitSet FOLLOW_rule__Escribir__Group__4_in_rule__Escribir__Group__35575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__0_in_rule__Escribir__Group__3__Impl5602 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__4__Impl_in_rule__Escribir__Group__45633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Escribir__Group__4__Impl5661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__0__Impl_in_rule__Escribir__Group_3__05702 = new BitSet(new long[]{0x04000000016002F0L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__1_in_rule__Escribir__Group_3__05705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Escribir__Group_3__0__Impl5733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__1__Impl_in_rule__Escribir__Group_3__15764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__OperadorAssignment_3_1_in_rule__Escribir__Group_3__1__Impl5791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__0__Impl_in_rule__Leer__Group__05825 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Leer__Group__1_in_rule__Leer__Group__05828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Leer__Group__0__Impl5856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__1__Impl_in_rule__Leer__Group__15887 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Leer__Group__2_in_rule__Leer__Group__15890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Leer__Group__1__Impl5918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__2__Impl_in_rule__Leer__Group__25949 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Leer__Group__3_in_rule__Leer__Group__25952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__VariableAssignment_2_in_rule__Leer__Group__2__Impl5979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__3__Impl_in_rule__Leer__Group__36009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Leer__Group__3__Impl6037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__0__Impl_in_rule__Si__Group__06076 = new BitSet(new long[]{0x04000400016002F0L});
        public static final BitSet FOLLOW_rule__Si__Group__1_in_rule__Si__Group__06079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Si__Group__0__Impl6107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__1__Impl_in_rule__Si__Group__16138 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Si__Group__2_in_rule__Si__Group__16141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__ValorAssignment_1_in_rule__Si__Group__1__Impl6168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__2__Impl_in_rule__Si__Group__26198 = new BitSet(new long[]{0x08A6E00000000030L});
        public static final BitSet FOLLOW_rule__Si__Group__3_in_rule__Si__Group__26201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Si__Group__2__Impl6229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__3__Impl_in_rule__Si__Group__36260 = new BitSet(new long[]{0x08A6E00000000030L});
        public static final BitSet FOLLOW_rule__Si__Group__4_in_rule__Si__Group__36263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group_3__0_in_rule__Si__Group__3__Impl6290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__4__Impl_in_rule__Si__Group__46321 = new BitSet(new long[]{0x08A6E00000000030L});
        public static final BitSet FOLLOW_rule__Si__Group__5_in_rule__Si__Group__46324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__SinoAssignment_4_in_rule__Si__Group__4__Impl6351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__5__Impl_in_rule__Si__Group__56382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Si__Group__5__Impl6410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group_3__0__Impl_in_rule__Si__Group_3__06453 = new BitSet(new long[]{0x00A4E00000000030L});
        public static final BitSet FOLLOW_rule__Si__Group_3__1_in_rule__Si__Group_3__06456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__SentenciasAssignment_3_0_in_rule__Si__Group_3__0__Impl6483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group_3__1__Impl_in_rule__Si__Group_3__16513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__SentenciasAssignment_3_1_in_rule__Si__Group_3__1__Impl6540 = new BitSet(new long[]{0x00A4E00000000032L});
        public static final BitSet FOLLOW_rule__Mientras__Group__0__Impl_in_rule__Mientras__Group__06575 = new BitSet(new long[]{0x04000400016002F0L});
        public static final BitSet FOLLOW_rule__Mientras__Group__1_in_rule__Mientras__Group__06578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Mientras__Group__0__Impl6606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__1__Impl_in_rule__Mientras__Group__16637 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_rule__Mientras__Group__2_in_rule__Mientras__Group__16640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__ValorAssignment_1_in_rule__Mientras__Group__1__Impl6667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__2__Impl_in_rule__Mientras__Group__26697 = new BitSet(new long[]{0x00B4E00000000030L});
        public static final BitSet FOLLOW_rule__Mientras__Group__3_in_rule__Mientras__Group__26700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Mientras__Group__2__Impl6728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__3__Impl_in_rule__Mientras__Group__36759 = new BitSet(new long[]{0x00B4E00000000030L});
        public static final BitSet FOLLOW_rule__Mientras__Group__4_in_rule__Mientras__Group__36762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__0_in_rule__Mientras__Group__3__Impl6789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__4__Impl_in_rule__Mientras__Group__46820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Mientras__Group__4__Impl6848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__0__Impl_in_rule__Mientras__Group_3__06889 = new BitSet(new long[]{0x00A4E00000000030L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__1_in_rule__Mientras__Group_3__06892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__SentenciasAssignment_3_0_in_rule__Mientras__Group_3__0__Impl6919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__1__Impl_in_rule__Mientras__Group_3__16949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__SentenciasAssignment_3_1_in_rule__Mientras__Group_3__1__Impl6976 = new BitSet(new long[]{0x00A4E00000000032L});
        public static final BitSet FOLLOW_rule__Repetir__Group__0__Impl_in_rule__Repetir__Group__07011 = new BitSet(new long[]{0x00E4E00000000030L});
        public static final BitSet FOLLOW_rule__Repetir__Group__1_in_rule__Repetir__Group__07014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__Repetir__Group__0__Impl7042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group__1__Impl_in_rule__Repetir__Group__17073 = new BitSet(new long[]{0x00E4E00000000030L});
        public static final BitSet FOLLOW_rule__Repetir__Group__2_in_rule__Repetir__Group__17076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__0_in_rule__Repetir__Group__1__Impl7103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group__2__Impl_in_rule__Repetir__Group__27134 = new BitSet(new long[]{0x04000400016002F0L});
        public static final BitSet FOLLOW_rule__Repetir__Group__3_in_rule__Repetir__Group__27137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__Repetir__Group__2__Impl7165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group__3__Impl_in_rule__Repetir__Group__37196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__ValorAssignment_3_in_rule__Repetir__Group__3__Impl7223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__0__Impl_in_rule__Repetir__Group_1__07261 = new BitSet(new long[]{0x00A4E00000000030L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__1_in_rule__Repetir__Group_1__07264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__SentenciasAssignment_1_0_in_rule__Repetir__Group_1__0__Impl7291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__1__Impl_in_rule__Repetir__Group_1__17321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__SentenciasAssignment_1_1_in_rule__Repetir__Group_1__1__Impl7348 = new BitSet(new long[]{0x00A4E00000000032L});
        public static final BitSet FOLLOW_rule__Desde__Group__0__Impl_in_rule__Desde__Group__07383 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Desde__Group__1_in_rule__Desde__Group__07386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__Desde__Group__0__Impl7414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__1__Impl_in_rule__Desde__Group__17445 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_rule__Desde__Group__2_in_rule__Desde__Group__17448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__AsignacionAssignment_1_in_rule__Desde__Group__1__Impl7475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__2__Impl_in_rule__Desde__Group__27505 = new BitSet(new long[]{0x04000400016002F0L});
        public static final BitSet FOLLOW_rule__Desde__Group__3_in_rule__Desde__Group__27508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Desde__Group__2__Impl7536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__3__Impl_in_rule__Desde__Group__37567 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_rule__Desde__Group__4_in_rule__Desde__Group__37570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__ValorAssignment_3_in_rule__Desde__Group__3__Impl7597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__4__Impl_in_rule__Desde__Group__47627 = new BitSet(new long[]{0x02A4E00000000030L});
        public static final BitSet FOLLOW_rule__Desde__Group__5_in_rule__Desde__Group__47630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Desde__Group__4__Impl7658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__5__Impl_in_rule__Desde__Group__57689 = new BitSet(new long[]{0x02A4E00000000030L});
        public static final BitSet FOLLOW_rule__Desde__Group__6_in_rule__Desde__Group__57692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__0_in_rule__Desde__Group__5__Impl7719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__6__Impl_in_rule__Desde__Group__67750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__Desde__Group__6__Impl7778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__0__Impl_in_rule__Desde__Group_5__07823 = new BitSet(new long[]{0x00A4E00000000030L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__1_in_rule__Desde__Group_5__07826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__SentenciasAssignment_5_0_in_rule__Desde__Group_5__0__Impl7853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__1__Impl_in_rule__Desde__Group_5__17883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__SentenciasAssignment_5_1_in_rule__Desde__Group_5__1__Impl7910 = new BitSet(new long[]{0x00A4E00000000032L});
        public static final BitSet FOLLOW_rule__Incremento__Group__0__Impl_in_rule__Incremento__Group__07945 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_rule__Incremento__Group__1_in_rule__Incremento__Group__07948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Incremento__NombreAssignment_0_in_rule__Incremento__Group__0__Impl7975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Incremento__Group__1__Impl_in_rule__Incremento__Group__18005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Incremento__SsignoAssignment_1_in_rule__Incremento__Group__1__Impl8032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__08066 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__08069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__NombreAssignment_0_in_rule__Variable__Group__0__Impl8096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__18126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__MatAssignment_1_in_rule__Variable__Group__1__Impl8153 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__VariableID__Group__0__Impl_in_rule__VariableID__Group__08188 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__VariableID__Group__1_in_rule__VariableID__Group__08191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__NombreAssignment_0_in_rule__VariableID__Group__0__Impl8218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group__1__Impl_in_rule__VariableID__Group__18248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__MatAssignment_1_in_rule__VariableID__Group__1__Impl8275 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__08310 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__08313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__EInt__Group__0__Impl8342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__18375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl8402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__08435 = new BitSet(new long[]{0x0400000001000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__08438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__EFloat__Group__0__Impl8467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__18500 = new BitSet(new long[]{0x0400000001000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__18503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl8531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__28562 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__28565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__EFloat__Group__2__Impl8593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__38624 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__38627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl8654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__48683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl8710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__08751 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__08754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl8781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__18811 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__18814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__EFloat__Group_4__1__Impl8843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__28876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl8903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__0__Impl_in_rule__Operacion__Group__08938 = new BitSet(new long[]{0x04000400016002F0L});
        public static final BitSet FOLLOW_rule__Operacion__Group__1_in_rule__Operacion__Group__08941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Operacion__Group__0__Impl8969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__1__Impl_in_rule__Operacion__Group__19000 = new BitSet(new long[]{0x00000007FF800000L});
        public static final BitSet FOLLOW_rule__Operacion__Group__2_in_rule__Operacion__Group__19003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Op_izqAssignment_1_in_rule__Operacion__Group__1__Impl9030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__2__Impl_in_rule__Operacion__Group__29060 = new BitSet(new long[]{0x04000400016002F0L});
        public static final BitSet FOLLOW_rule__Operacion__Group__3_in_rule__Operacion__Group__29063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Signo_opAssignment_2_in_rule__Operacion__Group__2__Impl9090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__3__Impl_in_rule__Operacion__Group__39120 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Operacion__Group__4_in_rule__Operacion__Group__39123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Op_derAssignment_3_in_rule__Operacion__Group__3__Impl9150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__4__Impl_in_rule__Operacion__Group__49180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Operacion__Group__4__Impl9208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group__0__Impl_in_rule__Sino__Group__09249 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rule__Sino__Group__1_in_rule__Sino__Group__09252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group__1__Impl_in_rule__Sino__Group__19310 = new BitSet(new long[]{0x00A4E00000000030L});
        public static final BitSet FOLLOW_rule__Sino__Group__2_in_rule__Sino__Group__19313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__Sino__Group__1__Impl9341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group__2__Impl_in_rule__Sino__Group__29372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__0_in_rule__Sino__Group__2__Impl9399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__0__Impl_in_rule__Sino__Group_2__09436 = new BitSet(new long[]{0x00A4E00000000030L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__1_in_rule__Sino__Group_2__09439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__SentenciasAssignment_2_0_in_rule__Sino__Group_2__0__Impl9466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__1__Impl_in_rule__Sino__Group_2__19496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__SentenciasAssignment_2_1_in_rule__Sino__Group_2__1__Impl9523 = new BitSet(new long[]{0x00A4E00000000032L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__0__Impl_in_rule__ParametroFuncion__Group__09558 = new BitSet(new long[]{0x0000002000080000L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__1_in_rule__ParametroFuncion__Group__09561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__TipoAssignment_0_in_rule__ParametroFuncion__Group__0__Impl9588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__1__Impl_in_rule__ParametroFuncion__Group__19618 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__2_in_rule__ParametroFuncion__Group__19621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__PasoAssignment_1_in_rule__ParametroFuncion__Group__1__Impl9648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__2__Impl_in_rule__ParametroFuncion__Group__29678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__VariableAssignment_2_in_rule__ParametroFuncion__Group__2__Impl9705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__0__Impl_in_rule__Funcion__Group__09741 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__1_in_rule__Funcion__Group__09744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__TipoAssignment_0_in_rule__Funcion__Group__0__Impl9771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__1__Impl_in_rule__Funcion__Group__19801 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Funcion__Group__2_in_rule__Funcion__Group__19804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__Funcion__Group__1__Impl9832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__2__Impl_in_rule__Funcion__Group__29863 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__3_in_rule__Funcion__Group__29866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__NombreAssignment_2_in_rule__Funcion__Group__2__Impl9893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__3__Impl_in_rule__Funcion__Group__39923 = new BitSet(new long[]{0x000008000007C000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__4_in_rule__Funcion__Group__39926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Funcion__Group__3__Impl9954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__4__Impl_in_rule__Funcion__Group__49985 = new BitSet(new long[]{0x000008000007C000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__5_in_rule__Funcion__Group__49988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__0_in_rule__Funcion__Group__4__Impl10015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__5__Impl_in_rule__Funcion__Group__510046 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__6_in_rule__Funcion__Group__510049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Funcion__Group__5__Impl10077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__6__Impl_in_rule__Funcion__Group__610108 = new BitSet(new long[]{0x000000800007C000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__7_in_rule__Funcion__Group__610111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Funcion__Group__6__Impl10139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__7__Impl_in_rule__Funcion__Group__710170 = new BitSet(new long[]{0x000000800007C000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__8_in_rule__Funcion__Group__710173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__0_in_rule__Funcion__Group__7__Impl10200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__8__Impl_in_rule__Funcion__Group__810231 = new BitSet(new long[]{0x20A4E00000000030L});
        public static final BitSet FOLLOW_rule__Funcion__Group__9_in_rule__Funcion__Group__810234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Funcion__Group__8__Impl10262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__9__Impl_in_rule__Funcion__Group__910293 = new BitSet(new long[]{0x20A4E00000000030L});
        public static final BitSet FOLLOW_rule__Funcion__Group__10_in_rule__Funcion__Group__910296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_9__0_in_rule__Funcion__Group__9__Impl10323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__10__Impl_in_rule__Funcion__Group__1010354 = new BitSet(new long[]{0x04000400016002F0L});
        public static final BitSet FOLLOW_rule__Funcion__Group__11_in_rule__Funcion__Group__1010357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__Funcion__Group__10__Impl10385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__11__Impl_in_rule__Funcion__Group__1110416 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__12_in_rule__Funcion__Group__1110419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__DevuelveAssignment_11_in_rule__Funcion__Group__11__Impl10446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__12__Impl_in_rule__Funcion__Group__1210476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__Funcion__Group__12__Impl10504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__0__Impl_in_rule__Funcion__Group_4__010561 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__1_in_rule__Funcion__Group_4__010564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_0_in_rule__Funcion__Group_4__0__Impl10591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__1__Impl_in_rule__Funcion__Group_4__110621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__0_in_rule__Funcion__Group_4__1__Impl10648 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__0__Impl_in_rule__Funcion__Group_4_1__010683 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__1_in_rule__Funcion__Group_4_1__010686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Funcion__Group_4_1__0__Impl10714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__1__Impl_in_rule__Funcion__Group_4_1__110745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_1_1_in_rule__Funcion__Group_4_1__1__Impl10772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__0__Impl_in_rule__Funcion__Group_7__010806 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__1_in_rule__Funcion__Group_7__010809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__DeclaracionvariableAssignment_7_0_in_rule__Funcion__Group_7__0__Impl10836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__1__Impl_in_rule__Funcion__Group_7__110866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__DeclaracionvariableAssignment_7_1_in_rule__Funcion__Group_7__1__Impl10893 = new BitSet(new long[]{0x000000000007C002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_9__0__Impl_in_rule__Funcion__Group_9__010928 = new BitSet(new long[]{0x00A4E00000000030L});
        public static final BitSet FOLLOW_rule__Funcion__Group_9__1_in_rule__Funcion__Group_9__010931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__SentenciasAssignment_9_0_in_rule__Funcion__Group_9__0__Impl10958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_9__1__Impl_in_rule__Funcion__Group_9__110988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__SentenciasAssignment_9_1_in_rule__Funcion__Group_9__1__Impl11015 = new BitSet(new long[]{0x00A4E00000000032L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__0__Impl_in_rule__Procedimiento__Group__011050 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__1_in_rule__Procedimiento__Group__011053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rule__Procedimiento__Group__0__Impl11081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__1__Impl_in_rule__Procedimiento__Group__111112 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__2_in_rule__Procedimiento__Group__111115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__NombreAssignment_1_in_rule__Procedimiento__Group__1__Impl11142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__2__Impl_in_rule__Procedimiento__Group__211172 = new BitSet(new long[]{0x000008000007C000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__3_in_rule__Procedimiento__Group__211175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Procedimiento__Group__2__Impl11203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__3__Impl_in_rule__Procedimiento__Group__311234 = new BitSet(new long[]{0x000008000007C000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__4_in_rule__Procedimiento__Group__311237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__0_in_rule__Procedimiento__Group__3__Impl11264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__4__Impl_in_rule__Procedimiento__Group__411295 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__5_in_rule__Procedimiento__Group__411298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Procedimiento__Group__4__Impl11326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__5__Impl_in_rule__Procedimiento__Group__511357 = new BitSet(new long[]{0x000000800007C000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__6_in_rule__Procedimiento__Group__511360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Procedimiento__Group__5__Impl11388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__6__Impl_in_rule__Procedimiento__Group__611419 = new BitSet(new long[]{0x000000800007C000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__7_in_rule__Procedimiento__Group__611422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_6__0_in_rule__Procedimiento__Group__6__Impl11449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__7__Impl_in_rule__Procedimiento__Group__711480 = new BitSet(new long[]{0x00A4E00000000030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__8_in_rule__Procedimiento__Group__711483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Procedimiento__Group__7__Impl11511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__8__Impl_in_rule__Procedimiento__Group__811542 = new BitSet(new long[]{0x00A4E00000000030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__9_in_rule__Procedimiento__Group__811545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_8__0_in_rule__Procedimiento__Group__8__Impl11572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__9__Impl_in_rule__Procedimiento__Group__911603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__Procedimiento__Group__9__Impl11631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__0__Impl_in_rule__Procedimiento__Group_3__011682 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__1_in_rule__Procedimiento__Group_3__011685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_0_in_rule__Procedimiento__Group_3__0__Impl11712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__1__Impl_in_rule__Procedimiento__Group_3__111742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__0_in_rule__Procedimiento__Group_3__1__Impl11769 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__0__Impl_in_rule__Procedimiento__Group_3_1__011804 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__1_in_rule__Procedimiento__Group_3_1__011807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Procedimiento__Group_3_1__0__Impl11835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__1__Impl_in_rule__Procedimiento__Group_3_1__111866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_1_1_in_rule__Procedimiento__Group_3_1__1__Impl11893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_6__0__Impl_in_rule__Procedimiento__Group_6__011927 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_6__1_in_rule__Procedimiento__Group_6__011930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__DeclaracionvariableAssignment_6_0_in_rule__Procedimiento__Group_6__0__Impl11957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_6__1__Impl_in_rule__Procedimiento__Group_6__111987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__DeclaracionvariableAssignment_6_1_in_rule__Procedimiento__Group_6__1__Impl12014 = new BitSet(new long[]{0x000000000007C002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_8__0__Impl_in_rule__Procedimiento__Group_8__012049 = new BitSet(new long[]{0x00A4E00000000030L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_8__1_in_rule__Procedimiento__Group_8__012052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__SentenciasAssignment_8_0_in_rule__Procedimiento__Group_8__0__Impl12079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_8__1__Impl_in_rule__Procedimiento__Group_8__112109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__SentenciasAssignment_8_1_in_rule__Procedimiento__Group_8__1__Impl12136 = new BitSet(new long[]{0x00A4E00000000032L});
        public static final BitSet FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_012176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_112207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInicio_in_rule__Codigo__TieneAssignment_112238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAR_in_rule__Caracter__ContenidoAssignment12269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Inicio__DeclaracionvariableAssignment_2_012300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Inicio__DeclaracionvariableAssignment_2_112331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_4_012362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_4_112393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_rule__DeclaracionVariable__TipoAssignment_012424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_112455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_2_112486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__LlamadaFuncion__NombreAssignment_012517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_012548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_1_112579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Asignacion__LvalueAssignment_012610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_MATRIZ_in_rule__Asignacion__MatAssignment_112641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Asignacion__OperadorAssignment_312672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_212703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_3_112734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__Leer__VariableAssignment_212765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Si__ValorAssignment_112796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_012827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_112858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSino_in_rule__Si__SinoAssignment_412889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Mientras__ValorAssignment_112920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_012951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_112982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_013013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_113044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Repetir__ValorAssignment_313075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_rule__Desde__AsignacionAssignment_113106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Desde__ValorAssignment_313137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_013168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_113199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Incremento__NombreAssignment_013230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinc_in_rule__Incremento__SsignoAssignment_113261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Variable__NombreAssignment_013292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_MATRIZ_in_rule__Variable__MatAssignment_113323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VariableID__NombreAssignment_013354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_MATRIZ_in_rule__VariableID__MatAssignment_113385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAD_in_rule__ConstCadena__ContenidoAssignment13416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__NumeroEntero__ValorAssignment13447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_rule__NumeroDecimal__ValorAssignment13478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_rule__ValorBooleano__ValorAssignment13509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_izq_in_rule__Operacion__Op_izqAssignment_113540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesigno_in_rule__Operacion__Signo_opAssignment_213571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_der_in_rule__Operacion__Op_derAssignment_313602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Operando_izq__Oper_izqAssignment13633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Operando_der__Oper_derAssignment13664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_013695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_113726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_rule__ParametroFuncion__TipoAssignment_013757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_rule__ParametroFuncion__PasoAssignment_113788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__ParametroFuncion__VariableAssignment_213819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_rule__Funcion__TipoAssignment_013850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Funcion__NombreAssignment_213881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_013912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_1_113943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Funcion__DeclaracionvariableAssignment_7_013974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Funcion__DeclaracionvariableAssignment_7_114005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_9_014036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_9_114067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Funcion__DevuelveAssignment_1114098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Procedimiento__NombreAssignment_114129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_014160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_1_114191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Procedimiento__DeclaracionvariableAssignment_6_014222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Procedimiento__DeclaracionvariableAssignment_6_114253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_8_014284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_8_114315 = new BitSet(new long[]{0x0000000000000002L});
    }


}