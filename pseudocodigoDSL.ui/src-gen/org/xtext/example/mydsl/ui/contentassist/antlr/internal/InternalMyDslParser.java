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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_CAR", "RULE_MATRIZ", "RULE_CAD", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entero'", "'caracter'", "'real'", "'logico'", "'cadena'", "'E'", "'e'", "'verdadero'", "'falso'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'>='", "'<='", "'y'", "'o'", "'=='", "'!='", "'++'", "'--'", "'E/S'", "'S'", "'var'", "'inicio'", "'fin_inicio'", "','", "'('", "')'", "'='", "'escribir'", "'leer'", "'si'", "'entonces'", "'fin si'", "'mientras'", "'hacer'", "'fin_mientras'", "'repetir'", "'hasta_que'", "'desde'", "'hasta'", "'fin_desde'", "'.'", "'sino'", "'funcion'", "'devolver'", "'fin_funcion'", "'procedimiento'", "'fin_procedimiento'"
    };
    public static final int RULE_ID=5;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
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
            else if ( (LA1_0==64) ) {
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

                    if ( (LA3_5==EOF||LA3_5==42||LA3_5==44) ) {
                        alt3=4;
                    }
                    else if ( (LA3_5==59) ) {
                        alt3=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_4==59) ) {
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

                if ( (LA3_5==EOF||LA3_5==42||LA3_5==44) ) {
                    alt3=4;
                }
                else if ( (LA3_5==59) ) {
                    alt3=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            case 59:
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:1: rule__TipoPaso__Alternatives : ( ( 'E' ) | ( 'E/S' ) | ( 'S' ) );
    public final void rule__TipoPaso__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1574:1: ( ( 'E' ) | ( 'E/S' ) | ( 'S' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 37:
                {
                alt11=2;
                }
                break;
            case 38:
                {
                alt11=3;
                }
                break;
            default:
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
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1591:6: ( 'S' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1591:6: ( 'S' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:1: 'S'
                    {
                     before(grammarAccess.getTipoPasoAccess().getSKeyword_2()); 
                    match(input,38,FollowSets000.FOLLOW_38_in_rule__TipoPaso__Alternatives3460); 
                     after(grammarAccess.getTipoPasoAccess().getSKeyword_2()); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:1: rule__Codigo__Group__0 : rule__Codigo__Group__0__Impl rule__Codigo__Group__1 ;
    public final void rule__Codigo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1610:1: ( rule__Codigo__Group__0__Impl rule__Codigo__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1611:2: rule__Codigo__Group__0__Impl rule__Codigo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group__0__Impl_in_rule__Codigo__Group__03492);
            rule__Codigo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group__1_in_rule__Codigo__Group__03495);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1618:1: rule__Codigo__Group__0__Impl : ( ( rule__Codigo__Group_0__0 )? ) ;
    public final void rule__Codigo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:1: ( ( ( rule__Codigo__Group_0__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:1: ( ( rule__Codigo__Group_0__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:1: ( ( rule__Codigo__Group_0__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1624:1: ( rule__Codigo__Group_0__0 )?
            {
             before(grammarAccess.getCodigoAccess().getGroup_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1625:1: ( rule__Codigo__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=14 && LA12_0<=18)||LA12_0==64) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1625:2: rule__Codigo__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group_0__0_in_rule__Codigo__Group__0__Impl3522);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:1: rule__Codigo__Group__1 : rule__Codigo__Group__1__Impl ;
    public final void rule__Codigo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1639:1: ( rule__Codigo__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1640:2: rule__Codigo__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group__1__Impl_in_rule__Codigo__Group__13553);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:1: rule__Codigo__Group__1__Impl : ( ( rule__Codigo__TieneAssignment_1 ) ) ;
    public final void rule__Codigo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:1: ( ( ( rule__Codigo__TieneAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: ( ( rule__Codigo__TieneAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: ( ( rule__Codigo__TieneAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1652:1: ( rule__Codigo__TieneAssignment_1 )
            {
             before(grammarAccess.getCodigoAccess().getTieneAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1653:1: ( rule__Codigo__TieneAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1653:2: rule__Codigo__TieneAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__TieneAssignment_1_in_rule__Codigo__Group__1__Impl3580);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1667:1: rule__Codigo__Group_0__0 : rule__Codigo__Group_0__0__Impl rule__Codigo__Group_0__1 ;
    public final void rule__Codigo__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1671:1: ( rule__Codigo__Group_0__0__Impl rule__Codigo__Group_0__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1672:2: rule__Codigo__Group_0__0__Impl rule__Codigo__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group_0__0__Impl_in_rule__Codigo__Group_0__03614);
            rule__Codigo__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group_0__1_in_rule__Codigo__Group_0__03617);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: rule__Codigo__Group_0__0__Impl : ( ( rule__Codigo__FuncionAssignment_0_0 ) ) ;
    public final void rule__Codigo__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1683:1: ( ( ( rule__Codigo__FuncionAssignment_0_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:1: ( ( rule__Codigo__FuncionAssignment_0_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:1: ( ( rule__Codigo__FuncionAssignment_0_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:1: ( rule__Codigo__FuncionAssignment_0_0 )
            {
             before(grammarAccess.getCodigoAccess().getFuncionAssignment_0_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1686:1: ( rule__Codigo__FuncionAssignment_0_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1686:2: rule__Codigo__FuncionAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__FuncionAssignment_0_0_in_rule__Codigo__Group_0__0__Impl3644);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:1: rule__Codigo__Group_0__1 : rule__Codigo__Group_0__1__Impl ;
    public final void rule__Codigo__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1700:1: ( rule__Codigo__Group_0__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:2: rule__Codigo__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group_0__1__Impl_in_rule__Codigo__Group_0__13674);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1707:1: rule__Codigo__Group_0__1__Impl : ( ( rule__Codigo__FuncionAssignment_0_1 )* ) ;
    public final void rule__Codigo__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1711:1: ( ( ( rule__Codigo__FuncionAssignment_0_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: ( ( rule__Codigo__FuncionAssignment_0_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: ( ( rule__Codigo__FuncionAssignment_0_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: ( rule__Codigo__FuncionAssignment_0_1 )*
            {
             before(grammarAccess.getCodigoAccess().getFuncionAssignment_0_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:1: ( rule__Codigo__FuncionAssignment_0_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=14 && LA13_0<=18)||LA13_0==64) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:2: rule__Codigo__FuncionAssignment_0_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Codigo__FuncionAssignment_0_1_in_rule__Codigo__Group_0__1__Impl3701);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:1: rule__Inicio__Group__0 : rule__Inicio__Group__0__Impl rule__Inicio__Group__1 ;
    public final void rule__Inicio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1732:1: ( rule__Inicio__Group__0__Impl rule__Inicio__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1733:2: rule__Inicio__Group__0__Impl rule__Inicio__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__0__Impl_in_rule__Inicio__Group__03736);
            rule__Inicio__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__1_in_rule__Inicio__Group__03739);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: rule__Inicio__Group__0__Impl : ( () ) ;
    public final void rule__Inicio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1744:1: ( ( () ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: ( () )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: ( () )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1746:1: ()
            {
             before(grammarAccess.getInicioAccess().getInicioAction_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1747:1: ()
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1749:1: 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1759:1: rule__Inicio__Group__1 : rule__Inicio__Group__1__Impl rule__Inicio__Group__2 ;
    public final void rule__Inicio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1763:1: ( rule__Inicio__Group__1__Impl rule__Inicio__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1764:2: rule__Inicio__Group__1__Impl rule__Inicio__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__1__Impl_in_rule__Inicio__Group__13797);
            rule__Inicio__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__2_in_rule__Inicio__Group__13800);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1771:1: rule__Inicio__Group__1__Impl : ( 'var' ) ;
    public final void rule__Inicio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1775:1: ( ( 'var' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1776:1: ( 'var' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1776:1: ( 'var' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1777:1: 'var'
            {
             before(grammarAccess.getInicioAccess().getVarKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Inicio__Group__1__Impl3828); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1790:1: rule__Inicio__Group__2 : rule__Inicio__Group__2__Impl rule__Inicio__Group__3 ;
    public final void rule__Inicio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1794:1: ( rule__Inicio__Group__2__Impl rule__Inicio__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1795:2: rule__Inicio__Group__2__Impl rule__Inicio__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__2__Impl_in_rule__Inicio__Group__23859);
            rule__Inicio__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__3_in_rule__Inicio__Group__23862);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1802:1: rule__Inicio__Group__2__Impl : ( ( rule__Inicio__Group_2__0 )? ) ;
    public final void rule__Inicio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1806:1: ( ( ( rule__Inicio__Group_2__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1807:1: ( ( rule__Inicio__Group_2__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1807:1: ( ( rule__Inicio__Group_2__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1808:1: ( rule__Inicio__Group_2__0 )?
            {
             before(grammarAccess.getInicioAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1809:1: ( rule__Inicio__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=14 && LA14_0<=18)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1809:2: rule__Inicio__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__0_in_rule__Inicio__Group__2__Impl3889);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1819:1: rule__Inicio__Group__3 : rule__Inicio__Group__3__Impl rule__Inicio__Group__4 ;
    public final void rule__Inicio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1823:1: ( rule__Inicio__Group__3__Impl rule__Inicio__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:2: rule__Inicio__Group__3__Impl rule__Inicio__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__3__Impl_in_rule__Inicio__Group__33920);
            rule__Inicio__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__4_in_rule__Inicio__Group__33923);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: rule__Inicio__Group__3__Impl : ( 'inicio' ) ;
    public final void rule__Inicio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1835:1: ( ( 'inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: ( 'inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: ( 'inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1837:1: 'inicio'
            {
             before(grammarAccess.getInicioAccess().getInicioKeyword_3()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Inicio__Group__3__Impl3951); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1850:1: rule__Inicio__Group__4 : rule__Inicio__Group__4__Impl rule__Inicio__Group__5 ;
    public final void rule__Inicio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:1: ( rule__Inicio__Group__4__Impl rule__Inicio__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:2: rule__Inicio__Group__4__Impl rule__Inicio__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__4__Impl_in_rule__Inicio__Group__43982);
            rule__Inicio__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__5_in_rule__Inicio__Group__43985);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1862:1: rule__Inicio__Group__4__Impl : ( ( rule__Inicio__Group_4__0 )? ) ;
    public final void rule__Inicio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1866:1: ( ( ( rule__Inicio__Group_4__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: ( ( rule__Inicio__Group_4__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: ( ( rule__Inicio__Group_4__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:1: ( rule__Inicio__Group_4__0 )?
            {
             before(grammarAccess.getInicioAccess().getGroup_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1869:1: ( rule__Inicio__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)||(LA15_0>=46 && LA15_0<=48)||LA15_0==51||LA15_0==54||LA15_0==56) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1869:2: rule__Inicio__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_4__0_in_rule__Inicio__Group__4__Impl4012);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: rule__Inicio__Group__5 : rule__Inicio__Group__5__Impl ;
    public final void rule__Inicio__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1883:1: ( rule__Inicio__Group__5__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1884:2: rule__Inicio__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__5__Impl_in_rule__Inicio__Group__54043);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1890:1: rule__Inicio__Group__5__Impl : ( 'fin_inicio' ) ;
    public final void rule__Inicio__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:1: ( ( 'fin_inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1895:1: ( 'fin_inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1895:1: ( 'fin_inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1896:1: 'fin_inicio'
            {
             before(grammarAccess.getInicioAccess().getFin_inicioKeyword_5()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Inicio__Group__5__Impl4071); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:1: rule__Inicio__Group_2__0 : rule__Inicio__Group_2__0__Impl rule__Inicio__Group_2__1 ;
    public final void rule__Inicio__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1925:1: ( rule__Inicio__Group_2__0__Impl rule__Inicio__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1926:2: rule__Inicio__Group_2__0__Impl rule__Inicio__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__0__Impl_in_rule__Inicio__Group_2__04114);
            rule__Inicio__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__1_in_rule__Inicio__Group_2__04117);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1933:1: rule__Inicio__Group_2__0__Impl : ( ( rule__Inicio__DeclaracionvariableAssignment_2_0 ) ) ;
    public final void rule__Inicio__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1937:1: ( ( ( rule__Inicio__DeclaracionvariableAssignment_2_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1938:1: ( ( rule__Inicio__DeclaracionvariableAssignment_2_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1938:1: ( ( rule__Inicio__DeclaracionvariableAssignment_2_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1939:1: ( rule__Inicio__DeclaracionvariableAssignment_2_0 )
            {
             before(grammarAccess.getInicioAccess().getDeclaracionvariableAssignment_2_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: ( rule__Inicio__DeclaracionvariableAssignment_2_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:2: rule__Inicio__DeclaracionvariableAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__DeclaracionvariableAssignment_2_0_in_rule__Inicio__Group_2__0__Impl4144);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:1: rule__Inicio__Group_2__1 : rule__Inicio__Group_2__1__Impl ;
    public final void rule__Inicio__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:1: ( rule__Inicio__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:2: rule__Inicio__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__1__Impl_in_rule__Inicio__Group_2__14174);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: rule__Inicio__Group_2__1__Impl : ( ( rule__Inicio__DeclaracionvariableAssignment_2_1 )* ) ;
    public final void rule__Inicio__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1965:1: ( ( ( rule__Inicio__DeclaracionvariableAssignment_2_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:1: ( ( rule__Inicio__DeclaracionvariableAssignment_2_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:1: ( ( rule__Inicio__DeclaracionvariableAssignment_2_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:1: ( rule__Inicio__DeclaracionvariableAssignment_2_1 )*
            {
             before(grammarAccess.getInicioAccess().getDeclaracionvariableAssignment_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:1: ( rule__Inicio__DeclaracionvariableAssignment_2_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=14 && LA16_0<=18)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:2: rule__Inicio__DeclaracionvariableAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Inicio__DeclaracionvariableAssignment_2_1_in_rule__Inicio__Group_2__1__Impl4201);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1982:1: rule__Inicio__Group_4__0 : rule__Inicio__Group_4__0__Impl rule__Inicio__Group_4__1 ;
    public final void rule__Inicio__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:1: ( rule__Inicio__Group_4__0__Impl rule__Inicio__Group_4__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:2: rule__Inicio__Group_4__0__Impl rule__Inicio__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_4__0__Impl_in_rule__Inicio__Group_4__04236);
            rule__Inicio__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_4__1_in_rule__Inicio__Group_4__04239);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1994:1: rule__Inicio__Group_4__0__Impl : ( ( rule__Inicio__TieneAssignment_4_0 ) ) ;
    public final void rule__Inicio__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1998:1: ( ( ( rule__Inicio__TieneAssignment_4_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1999:1: ( ( rule__Inicio__TieneAssignment_4_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1999:1: ( ( rule__Inicio__TieneAssignment_4_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2000:1: ( rule__Inicio__TieneAssignment_4_0 )
            {
             before(grammarAccess.getInicioAccess().getTieneAssignment_4_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:1: ( rule__Inicio__TieneAssignment_4_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:2: rule__Inicio__TieneAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__TieneAssignment_4_0_in_rule__Inicio__Group_4__0__Impl4266);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: rule__Inicio__Group_4__1 : rule__Inicio__Group_4__1__Impl ;
    public final void rule__Inicio__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2015:1: ( rule__Inicio__Group_4__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2016:2: rule__Inicio__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_4__1__Impl_in_rule__Inicio__Group_4__14296);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2022:1: rule__Inicio__Group_4__1__Impl : ( ( rule__Inicio__TieneAssignment_4_1 )* ) ;
    public final void rule__Inicio__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2026:1: ( ( ( rule__Inicio__TieneAssignment_4_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: ( ( rule__Inicio__TieneAssignment_4_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: ( ( rule__Inicio__TieneAssignment_4_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2028:1: ( rule__Inicio__TieneAssignment_4_1 )*
            {
             before(grammarAccess.getInicioAccess().getTieneAssignment_4_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2029:1: ( rule__Inicio__TieneAssignment_4_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)||(LA17_0>=46 && LA17_0<=48)||LA17_0==51||LA17_0==54||LA17_0==56) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2029:2: rule__Inicio__TieneAssignment_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Inicio__TieneAssignment_4_1_in_rule__Inicio__Group_4__1__Impl4323);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2043:1: rule__DeclaracionVariable__Group__0 : rule__DeclaracionVariable__Group__0__Impl rule__DeclaracionVariable__Group__1 ;
    public final void rule__DeclaracionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2047:1: ( rule__DeclaracionVariable__Group__0__Impl rule__DeclaracionVariable__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:2: rule__DeclaracionVariable__Group__0__Impl rule__DeclaracionVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__0__Impl_in_rule__DeclaracionVariable__Group__04358);
            rule__DeclaracionVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__1_in_rule__DeclaracionVariable__Group__04361);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2055:1: rule__DeclaracionVariable__Group__0__Impl : ( ( rule__DeclaracionVariable__TipoAssignment_0 ) ) ;
    public final void rule__DeclaracionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2059:1: ( ( ( rule__DeclaracionVariable__TipoAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2060:1: ( ( rule__DeclaracionVariable__TipoAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2060:1: ( ( rule__DeclaracionVariable__TipoAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2061:1: ( rule__DeclaracionVariable__TipoAssignment_0 )
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTipoAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2062:1: ( rule__DeclaracionVariable__TipoAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2062:2: rule__DeclaracionVariable__TipoAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__TipoAssignment_0_in_rule__DeclaracionVariable__Group__0__Impl4388);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2072:1: rule__DeclaracionVariable__Group__1 : rule__DeclaracionVariable__Group__1__Impl rule__DeclaracionVariable__Group__2 ;
    public final void rule__DeclaracionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2076:1: ( rule__DeclaracionVariable__Group__1__Impl rule__DeclaracionVariable__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2077:2: rule__DeclaracionVariable__Group__1__Impl rule__DeclaracionVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__1__Impl_in_rule__DeclaracionVariable__Group__14418);
            rule__DeclaracionVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__2_in_rule__DeclaracionVariable__Group__14421);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2084:1: rule__DeclaracionVariable__Group__1__Impl : ( ( rule__DeclaracionVariable__TieneIDsAssignment_1 ) ) ;
    public final void rule__DeclaracionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2088:1: ( ( ( rule__DeclaracionVariable__TieneIDsAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2089:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2089:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:1: ( rule__DeclaracionVariable__TieneIDsAssignment_1 )
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2091:1: ( rule__DeclaracionVariable__TieneIDsAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2091:2: rule__DeclaracionVariable__TieneIDsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_1_in_rule__DeclaracionVariable__Group__1__Impl4448);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2101:1: rule__DeclaracionVariable__Group__2 : rule__DeclaracionVariable__Group__2__Impl ;
    public final void rule__DeclaracionVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2105:1: ( rule__DeclaracionVariable__Group__2__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:2: rule__DeclaracionVariable__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__2__Impl_in_rule__DeclaracionVariable__Group__24478);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2112:1: rule__DeclaracionVariable__Group__2__Impl : ( ( rule__DeclaracionVariable__Group_2__0 )* ) ;
    public final void rule__DeclaracionVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:1: ( ( ( rule__DeclaracionVariable__Group_2__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: ( ( rule__DeclaracionVariable__Group_2__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: ( ( rule__DeclaracionVariable__Group_2__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: ( rule__DeclaracionVariable__Group_2__0 )*
            {
             before(grammarAccess.getDeclaracionVariableAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2119:1: ( rule__DeclaracionVariable__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==42) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2119:2: rule__DeclaracionVariable__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_2__0_in_rule__DeclaracionVariable__Group__2__Impl4505);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:1: rule__DeclaracionVariable__Group_2__0 : rule__DeclaracionVariable__Group_2__0__Impl rule__DeclaracionVariable__Group_2__1 ;
    public final void rule__DeclaracionVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:1: ( rule__DeclaracionVariable__Group_2__0__Impl rule__DeclaracionVariable__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2140:2: rule__DeclaracionVariable__Group_2__0__Impl rule__DeclaracionVariable__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_2__0__Impl_in_rule__DeclaracionVariable__Group_2__04542);
            rule__DeclaracionVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_2__1_in_rule__DeclaracionVariable__Group_2__04545);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2147:1: rule__DeclaracionVariable__Group_2__0__Impl : ( ',' ) ;
    public final void rule__DeclaracionVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2151:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2152:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2152:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2153:1: ','
            {
             before(grammarAccess.getDeclaracionVariableAccess().getCommaKeyword_2_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__DeclaracionVariable__Group_2__0__Impl4573); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:1: rule__DeclaracionVariable__Group_2__1 : rule__DeclaracionVariable__Group_2__1__Impl ;
    public final void rule__DeclaracionVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2170:1: ( rule__DeclaracionVariable__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2171:2: rule__DeclaracionVariable__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_2__1__Impl_in_rule__DeclaracionVariable__Group_2__14604);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2177:1: rule__DeclaracionVariable__Group_2__1__Impl : ( ( rule__DeclaracionVariable__TieneIDsAssignment_2_1 ) ) ;
    public final void rule__DeclaracionVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2181:1: ( ( ( rule__DeclaracionVariable__TieneIDsAssignment_2_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2182:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_2_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2182:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_2_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2183:1: ( rule__DeclaracionVariable__TieneIDsAssignment_2_1 )
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsAssignment_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2184:1: ( rule__DeclaracionVariable__TieneIDsAssignment_2_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2184:2: rule__DeclaracionVariable__TieneIDsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_2_1_in_rule__DeclaracionVariable__Group_2__1__Impl4631);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2198:1: rule__LlamadaFuncion__Group__0 : rule__LlamadaFuncion__Group__0__Impl rule__LlamadaFuncion__Group__1 ;
    public final void rule__LlamadaFuncion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:1: ( rule__LlamadaFuncion__Group__0__Impl rule__LlamadaFuncion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2203:2: rule__LlamadaFuncion__Group__0__Impl rule__LlamadaFuncion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__0__Impl_in_rule__LlamadaFuncion__Group__04665);
            rule__LlamadaFuncion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__1_in_rule__LlamadaFuncion__Group__04668);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:1: rule__LlamadaFuncion__Group__0__Impl : ( ( rule__LlamadaFuncion__NombreAssignment_0 ) ) ;
    public final void rule__LlamadaFuncion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2214:1: ( ( ( rule__LlamadaFuncion__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:1: ( ( rule__LlamadaFuncion__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:1: ( ( rule__LlamadaFuncion__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2216:1: ( rule__LlamadaFuncion__NombreAssignment_0 )
            {
             before(grammarAccess.getLlamadaFuncionAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:1: ( rule__LlamadaFuncion__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:2: rule__LlamadaFuncion__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__NombreAssignment_0_in_rule__LlamadaFuncion__Group__0__Impl4695);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2227:1: rule__LlamadaFuncion__Group__1 : rule__LlamadaFuncion__Group__1__Impl rule__LlamadaFuncion__Group__2 ;
    public final void rule__LlamadaFuncion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: ( rule__LlamadaFuncion__Group__1__Impl rule__LlamadaFuncion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2232:2: rule__LlamadaFuncion__Group__1__Impl rule__LlamadaFuncion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__1__Impl_in_rule__LlamadaFuncion__Group__14725);
            rule__LlamadaFuncion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__2_in_rule__LlamadaFuncion__Group__14728);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2239:1: rule__LlamadaFuncion__Group__1__Impl : ( '(' ) ;
    public final void rule__LlamadaFuncion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2243:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2244:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2244:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2245:1: '('
            {
             before(grammarAccess.getLlamadaFuncionAccess().getLeftParenthesisKeyword_1()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__LlamadaFuncion__Group__1__Impl4756); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2258:1: rule__LlamadaFuncion__Group__2 : rule__LlamadaFuncion__Group__2__Impl rule__LlamadaFuncion__Group__3 ;
    public final void rule__LlamadaFuncion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: ( rule__LlamadaFuncion__Group__2__Impl rule__LlamadaFuncion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2263:2: rule__LlamadaFuncion__Group__2__Impl rule__LlamadaFuncion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__2__Impl_in_rule__LlamadaFuncion__Group__24787);
            rule__LlamadaFuncion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__3_in_rule__LlamadaFuncion__Group__24790);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2270:1: rule__LlamadaFuncion__Group__2__Impl : ( ( rule__LlamadaFuncion__Group_2__0 )? ) ;
    public final void rule__LlamadaFuncion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2274:1: ( ( ( rule__LlamadaFuncion__Group_2__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2275:1: ( ( rule__LlamadaFuncion__Group_2__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2275:1: ( ( rule__LlamadaFuncion__Group_2__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2276:1: ( rule__LlamadaFuncion__Group_2__0 )?
            {
             before(grammarAccess.getLlamadaFuncionAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2277:1: ( rule__LlamadaFuncion__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_CAR)||LA19_0==RULE_CAD||(LA19_0>=21 && LA19_0<=22)||LA19_0==24||LA19_0==59) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2277:2: rule__LlamadaFuncion__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__0_in_rule__LlamadaFuncion__Group__2__Impl4817);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2287:1: rule__LlamadaFuncion__Group__3 : rule__LlamadaFuncion__Group__3__Impl ;
    public final void rule__LlamadaFuncion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:1: ( rule__LlamadaFuncion__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2292:2: rule__LlamadaFuncion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__3__Impl_in_rule__LlamadaFuncion__Group__34848);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:1: rule__LlamadaFuncion__Group__3__Impl : ( ')' ) ;
    public final void rule__LlamadaFuncion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2304:1: ')'
            {
             before(grammarAccess.getLlamadaFuncionAccess().getRightParenthesisKeyword_3()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__LlamadaFuncion__Group__3__Impl4876); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: rule__LlamadaFuncion__Group_2__0 : rule__LlamadaFuncion__Group_2__0__Impl rule__LlamadaFuncion__Group_2__1 ;
    public final void rule__LlamadaFuncion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2329:1: ( rule__LlamadaFuncion__Group_2__0__Impl rule__LlamadaFuncion__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2330:2: rule__LlamadaFuncion__Group_2__0__Impl rule__LlamadaFuncion__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__0__Impl_in_rule__LlamadaFuncion__Group_2__04915);
            rule__LlamadaFuncion__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__1_in_rule__LlamadaFuncion__Group_2__04918);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2337:1: rule__LlamadaFuncion__Group_2__0__Impl : ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) ) ;
    public final void rule__LlamadaFuncion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ( ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:1: ( rule__LlamadaFuncion__OperadorAssignment_2_0 )
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorAssignment_2_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:1: ( rule__LlamadaFuncion__OperadorAssignment_2_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:2: rule__LlamadaFuncion__OperadorAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_0_in_rule__LlamadaFuncion__Group_2__0__Impl4945);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2354:1: rule__LlamadaFuncion__Group_2__1 : rule__LlamadaFuncion__Group_2__1__Impl ;
    public final void rule__LlamadaFuncion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:1: ( rule__LlamadaFuncion__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2359:2: rule__LlamadaFuncion__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__1__Impl_in_rule__LlamadaFuncion__Group_2__14975);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2365:1: rule__LlamadaFuncion__Group_2__1__Impl : ( ( rule__LlamadaFuncion__Group_2_1__0 )* ) ;
    public final void rule__LlamadaFuncion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2369:1: ( ( ( rule__LlamadaFuncion__Group_2_1__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2370:1: ( ( rule__LlamadaFuncion__Group_2_1__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2370:1: ( ( rule__LlamadaFuncion__Group_2_1__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:1: ( rule__LlamadaFuncion__Group_2_1__0 )*
            {
             before(grammarAccess.getLlamadaFuncionAccess().getGroup_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:1: ( rule__LlamadaFuncion__Group_2_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==42) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:2: rule__LlamadaFuncion__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__0_in_rule__LlamadaFuncion__Group_2__1__Impl5002);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2386:1: rule__LlamadaFuncion__Group_2_1__0 : rule__LlamadaFuncion__Group_2_1__0__Impl rule__LlamadaFuncion__Group_2_1__1 ;
    public final void rule__LlamadaFuncion__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2390:1: ( rule__LlamadaFuncion__Group_2_1__0__Impl rule__LlamadaFuncion__Group_2_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2391:2: rule__LlamadaFuncion__Group_2_1__0__Impl rule__LlamadaFuncion__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__0__Impl_in_rule__LlamadaFuncion__Group_2_1__05037);
            rule__LlamadaFuncion__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__1_in_rule__LlamadaFuncion__Group_2_1__05040);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2398:1: rule__LlamadaFuncion__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__LlamadaFuncion__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2403:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2403:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:1: ','
            {
             before(grammarAccess.getLlamadaFuncionAccess().getCommaKeyword_2_1_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__LlamadaFuncion__Group_2_1__0__Impl5068); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2417:1: rule__LlamadaFuncion__Group_2_1__1 : rule__LlamadaFuncion__Group_2_1__1__Impl ;
    public final void rule__LlamadaFuncion__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2421:1: ( rule__LlamadaFuncion__Group_2_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2422:2: rule__LlamadaFuncion__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__1__Impl_in_rule__LlamadaFuncion__Group_2_1__15099);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2428:1: rule__LlamadaFuncion__Group_2_1__1__Impl : ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) ) ;
    public final void rule__LlamadaFuncion__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2432:1: ( ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2434:1: ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 )
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorAssignment_2_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2435:1: ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2435:2: rule__LlamadaFuncion__OperadorAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_1_1_in_rule__LlamadaFuncion__Group_2_1__1__Impl5126);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2449:1: rule__Asignacion__Group__0 : rule__Asignacion__Group__0__Impl rule__Asignacion__Group__1 ;
    public final void rule__Asignacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2453:1: ( rule__Asignacion__Group__0__Impl rule__Asignacion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2454:2: rule__Asignacion__Group__0__Impl rule__Asignacion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__0__Impl_in_rule__Asignacion__Group__05160);
            rule__Asignacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__1_in_rule__Asignacion__Group__05163);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2461:1: rule__Asignacion__Group__0__Impl : ( ( rule__Asignacion__LvalueAssignment_0 ) ) ;
    public final void rule__Asignacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:1: ( ( ( rule__Asignacion__LvalueAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: ( ( rule__Asignacion__LvalueAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: ( ( rule__Asignacion__LvalueAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2467:1: ( rule__Asignacion__LvalueAssignment_0 )
            {
             before(grammarAccess.getAsignacionAccess().getLvalueAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2468:1: ( rule__Asignacion__LvalueAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2468:2: rule__Asignacion__LvalueAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__LvalueAssignment_0_in_rule__Asignacion__Group__0__Impl5190);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2478:1: rule__Asignacion__Group__1 : rule__Asignacion__Group__1__Impl rule__Asignacion__Group__2 ;
    public final void rule__Asignacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2482:1: ( rule__Asignacion__Group__1__Impl rule__Asignacion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:2: rule__Asignacion__Group__1__Impl rule__Asignacion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__1__Impl_in_rule__Asignacion__Group__15220);
            rule__Asignacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__2_in_rule__Asignacion__Group__15223);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2490:1: rule__Asignacion__Group__1__Impl : ( ( rule__Asignacion__MatAssignment_1 )* ) ;
    public final void rule__Asignacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2494:1: ( ( ( rule__Asignacion__MatAssignment_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: ( ( rule__Asignacion__MatAssignment_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: ( ( rule__Asignacion__MatAssignment_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: ( rule__Asignacion__MatAssignment_1 )*
            {
             before(grammarAccess.getAsignacionAccess().getMatAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:1: ( rule__Asignacion__MatAssignment_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_MATRIZ) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:2: rule__Asignacion__MatAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Asignacion__MatAssignment_1_in_rule__Asignacion__Group__1__Impl5250);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:1: rule__Asignacion__Group__2 : rule__Asignacion__Group__2__Impl rule__Asignacion__Group__3 ;
    public final void rule__Asignacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:1: ( rule__Asignacion__Group__2__Impl rule__Asignacion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:2: rule__Asignacion__Group__2__Impl rule__Asignacion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__2__Impl_in_rule__Asignacion__Group__25281);
            rule__Asignacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__3_in_rule__Asignacion__Group__25284);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:1: rule__Asignacion__Group__2__Impl : ( '=' ) ;
    public final void rule__Asignacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2523:1: ( ( '=' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2524:1: ( '=' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2524:1: ( '=' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2525:1: '='
            {
             before(grammarAccess.getAsignacionAccess().getEqualsSignKeyword_2()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Asignacion__Group__2__Impl5312); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: rule__Asignacion__Group__3 : rule__Asignacion__Group__3__Impl ;
    public final void rule__Asignacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2542:1: ( rule__Asignacion__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2543:2: rule__Asignacion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__3__Impl_in_rule__Asignacion__Group__35343);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2549:1: rule__Asignacion__Group__3__Impl : ( ( rule__Asignacion__OperadorAssignment_3 ) ) ;
    public final void rule__Asignacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2553:1: ( ( ( rule__Asignacion__OperadorAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2554:1: ( ( rule__Asignacion__OperadorAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2554:1: ( ( rule__Asignacion__OperadorAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:1: ( rule__Asignacion__OperadorAssignment_3 )
            {
             before(grammarAccess.getAsignacionAccess().getOperadorAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2556:1: ( rule__Asignacion__OperadorAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2556:2: rule__Asignacion__OperadorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__OperadorAssignment_3_in_rule__Asignacion__Group__3__Impl5370);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2574:1: rule__Escribir__Group__0 : rule__Escribir__Group__0__Impl rule__Escribir__Group__1 ;
    public final void rule__Escribir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: ( rule__Escribir__Group__0__Impl rule__Escribir__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:2: rule__Escribir__Group__0__Impl rule__Escribir__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__0__Impl_in_rule__Escribir__Group__05408);
            rule__Escribir__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__1_in_rule__Escribir__Group__05411);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:1: rule__Escribir__Group__0__Impl : ( 'escribir' ) ;
    public final void rule__Escribir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2590:1: ( ( 'escribir' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: ( 'escribir' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: ( 'escribir' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2592:1: 'escribir'
            {
             before(grammarAccess.getEscribirAccess().getEscribirKeyword_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Escribir__Group__0__Impl5439); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2605:1: rule__Escribir__Group__1 : rule__Escribir__Group__1__Impl rule__Escribir__Group__2 ;
    public final void rule__Escribir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2609:1: ( rule__Escribir__Group__1__Impl rule__Escribir__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2610:2: rule__Escribir__Group__1__Impl rule__Escribir__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__1__Impl_in_rule__Escribir__Group__15470);
            rule__Escribir__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__2_in_rule__Escribir__Group__15473);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2617:1: rule__Escribir__Group__1__Impl : ( '(' ) ;
    public final void rule__Escribir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2621:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2622:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2622:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2623:1: '('
            {
             before(grammarAccess.getEscribirAccess().getLeftParenthesisKeyword_1()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Escribir__Group__1__Impl5501); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2636:1: rule__Escribir__Group__2 : rule__Escribir__Group__2__Impl rule__Escribir__Group__3 ;
    public final void rule__Escribir__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2640:1: ( rule__Escribir__Group__2__Impl rule__Escribir__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2641:2: rule__Escribir__Group__2__Impl rule__Escribir__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__2__Impl_in_rule__Escribir__Group__25532);
            rule__Escribir__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__3_in_rule__Escribir__Group__25535);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2648:1: rule__Escribir__Group__2__Impl : ( ( rule__Escribir__OperadorAssignment_2 ) ) ;
    public final void rule__Escribir__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2652:1: ( ( ( rule__Escribir__OperadorAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2653:1: ( ( rule__Escribir__OperadorAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2653:1: ( ( rule__Escribir__OperadorAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2654:1: ( rule__Escribir__OperadorAssignment_2 )
            {
             before(grammarAccess.getEscribirAccess().getOperadorAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2655:1: ( rule__Escribir__OperadorAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2655:2: rule__Escribir__OperadorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__OperadorAssignment_2_in_rule__Escribir__Group__2__Impl5562);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: rule__Escribir__Group__3 : rule__Escribir__Group__3__Impl rule__Escribir__Group__4 ;
    public final void rule__Escribir__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2669:1: ( rule__Escribir__Group__3__Impl rule__Escribir__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2670:2: rule__Escribir__Group__3__Impl rule__Escribir__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__3__Impl_in_rule__Escribir__Group__35592);
            rule__Escribir__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__4_in_rule__Escribir__Group__35595);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2677:1: rule__Escribir__Group__3__Impl : ( ( rule__Escribir__Group_3__0 )* ) ;
    public final void rule__Escribir__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2681:1: ( ( ( rule__Escribir__Group_3__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2682:1: ( ( rule__Escribir__Group_3__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2682:1: ( ( rule__Escribir__Group_3__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2683:1: ( rule__Escribir__Group_3__0 )*
            {
             before(grammarAccess.getEscribirAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2684:1: ( rule__Escribir__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==42) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2684:2: rule__Escribir__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__0_in_rule__Escribir__Group__3__Impl5622);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:1: rule__Escribir__Group__4 : rule__Escribir__Group__4__Impl ;
    public final void rule__Escribir__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2698:1: ( rule__Escribir__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2699:2: rule__Escribir__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__4__Impl_in_rule__Escribir__Group__45653);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2705:1: rule__Escribir__Group__4__Impl : ( ')' ) ;
    public final void rule__Escribir__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2709:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2710:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2710:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2711:1: ')'
            {
             before(grammarAccess.getEscribirAccess().getRightParenthesisKeyword_4()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Escribir__Group__4__Impl5681); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2734:1: rule__Escribir__Group_3__0 : rule__Escribir__Group_3__0__Impl rule__Escribir__Group_3__1 ;
    public final void rule__Escribir__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2738:1: ( rule__Escribir__Group_3__0__Impl rule__Escribir__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2739:2: rule__Escribir__Group_3__0__Impl rule__Escribir__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__0__Impl_in_rule__Escribir__Group_3__05722);
            rule__Escribir__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__1_in_rule__Escribir__Group_3__05725);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2746:1: rule__Escribir__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Escribir__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2750:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2751:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2751:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2752:1: ','
            {
             before(grammarAccess.getEscribirAccess().getCommaKeyword_3_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Escribir__Group_3__0__Impl5753); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2765:1: rule__Escribir__Group_3__1 : rule__Escribir__Group_3__1__Impl ;
    public final void rule__Escribir__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2769:1: ( rule__Escribir__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2770:2: rule__Escribir__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__1__Impl_in_rule__Escribir__Group_3__15784);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2776:1: rule__Escribir__Group_3__1__Impl : ( ( rule__Escribir__OperadorAssignment_3_1 ) ) ;
    public final void rule__Escribir__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2780:1: ( ( ( rule__Escribir__OperadorAssignment_3_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2781:1: ( ( rule__Escribir__OperadorAssignment_3_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2781:1: ( ( rule__Escribir__OperadorAssignment_3_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2782:1: ( rule__Escribir__OperadorAssignment_3_1 )
            {
             before(grammarAccess.getEscribirAccess().getOperadorAssignment_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:1: ( rule__Escribir__OperadorAssignment_3_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:2: rule__Escribir__OperadorAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__OperadorAssignment_3_1_in_rule__Escribir__Group_3__1__Impl5811);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2797:1: rule__Leer__Group__0 : rule__Leer__Group__0__Impl rule__Leer__Group__1 ;
    public final void rule__Leer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2801:1: ( rule__Leer__Group__0__Impl rule__Leer__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2802:2: rule__Leer__Group__0__Impl rule__Leer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__0__Impl_in_rule__Leer__Group__05845);
            rule__Leer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__1_in_rule__Leer__Group__05848);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2809:1: rule__Leer__Group__0__Impl : ( 'leer' ) ;
    public final void rule__Leer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2813:1: ( ( 'leer' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:1: ( 'leer' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:1: ( 'leer' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2815:1: 'leer'
            {
             before(grammarAccess.getLeerAccess().getLeerKeyword_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Leer__Group__0__Impl5876); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2828:1: rule__Leer__Group__1 : rule__Leer__Group__1__Impl rule__Leer__Group__2 ;
    public final void rule__Leer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2832:1: ( rule__Leer__Group__1__Impl rule__Leer__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2833:2: rule__Leer__Group__1__Impl rule__Leer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__1__Impl_in_rule__Leer__Group__15907);
            rule__Leer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__2_in_rule__Leer__Group__15910);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2840:1: rule__Leer__Group__1__Impl : ( '(' ) ;
    public final void rule__Leer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2844:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2845:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2845:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2846:1: '('
            {
             before(grammarAccess.getLeerAccess().getLeftParenthesisKeyword_1()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Leer__Group__1__Impl5938); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2859:1: rule__Leer__Group__2 : rule__Leer__Group__2__Impl rule__Leer__Group__3 ;
    public final void rule__Leer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2863:1: ( rule__Leer__Group__2__Impl rule__Leer__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2864:2: rule__Leer__Group__2__Impl rule__Leer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__2__Impl_in_rule__Leer__Group__25969);
            rule__Leer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__3_in_rule__Leer__Group__25972);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2871:1: rule__Leer__Group__2__Impl : ( ( rule__Leer__VariableAssignment_2 ) ) ;
    public final void rule__Leer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2875:1: ( ( ( rule__Leer__VariableAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:1: ( ( rule__Leer__VariableAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:1: ( ( rule__Leer__VariableAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2877:1: ( rule__Leer__VariableAssignment_2 )
            {
             before(grammarAccess.getLeerAccess().getVariableAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2878:1: ( rule__Leer__VariableAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2878:2: rule__Leer__VariableAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__VariableAssignment_2_in_rule__Leer__Group__2__Impl5999);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2888:1: rule__Leer__Group__3 : rule__Leer__Group__3__Impl ;
    public final void rule__Leer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2892:1: ( rule__Leer__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2893:2: rule__Leer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__3__Impl_in_rule__Leer__Group__36029);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2899:1: rule__Leer__Group__3__Impl : ( ')' ) ;
    public final void rule__Leer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2903:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2904:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2904:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2905:1: ')'
            {
             before(grammarAccess.getLeerAccess().getRightParenthesisKeyword_3()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Leer__Group__3__Impl6057); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2926:1: rule__Si__Group__0 : rule__Si__Group__0__Impl rule__Si__Group__1 ;
    public final void rule__Si__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2930:1: ( rule__Si__Group__0__Impl rule__Si__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2931:2: rule__Si__Group__0__Impl rule__Si__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__0__Impl_in_rule__Si__Group__06096);
            rule__Si__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__1_in_rule__Si__Group__06099);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2938:1: rule__Si__Group__0__Impl : ( 'si' ) ;
    public final void rule__Si__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2942:1: ( ( 'si' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: ( 'si' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: ( 'si' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2944:1: 'si'
            {
             before(grammarAccess.getSiAccess().getSiKeyword_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Si__Group__0__Impl6127); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2957:1: rule__Si__Group__1 : rule__Si__Group__1__Impl rule__Si__Group__2 ;
    public final void rule__Si__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2961:1: ( rule__Si__Group__1__Impl rule__Si__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2962:2: rule__Si__Group__1__Impl rule__Si__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__1__Impl_in_rule__Si__Group__16158);
            rule__Si__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__2_in_rule__Si__Group__16161);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2969:1: rule__Si__Group__1__Impl : ( ( rule__Si__ValorAssignment_1 ) ) ;
    public final void rule__Si__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2973:1: ( ( ( rule__Si__ValorAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2974:1: ( ( rule__Si__ValorAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2974:1: ( ( rule__Si__ValorAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2975:1: ( rule__Si__ValorAssignment_1 )
            {
             before(grammarAccess.getSiAccess().getValorAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2976:1: ( rule__Si__ValorAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2976:2: rule__Si__ValorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__ValorAssignment_1_in_rule__Si__Group__1__Impl6188);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2986:1: rule__Si__Group__2 : rule__Si__Group__2__Impl rule__Si__Group__3 ;
    public final void rule__Si__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2990:1: ( rule__Si__Group__2__Impl rule__Si__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2991:2: rule__Si__Group__2__Impl rule__Si__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__2__Impl_in_rule__Si__Group__26218);
            rule__Si__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__3_in_rule__Si__Group__26221);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2998:1: rule__Si__Group__2__Impl : ( 'entonces' ) ;
    public final void rule__Si__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3002:1: ( ( 'entonces' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3003:1: ( 'entonces' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3003:1: ( 'entonces' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3004:1: 'entonces'
            {
             before(grammarAccess.getSiAccess().getEntoncesKeyword_2()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Si__Group__2__Impl6249); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3017:1: rule__Si__Group__3 : rule__Si__Group__3__Impl rule__Si__Group__4 ;
    public final void rule__Si__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3021:1: ( rule__Si__Group__3__Impl rule__Si__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3022:2: rule__Si__Group__3__Impl rule__Si__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__3__Impl_in_rule__Si__Group__36280);
            rule__Si__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__4_in_rule__Si__Group__36283);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3029:1: rule__Si__Group__3__Impl : ( ( rule__Si__Group_3__0 )? ) ;
    public final void rule__Si__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3033:1: ( ( ( rule__Si__Group_3__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3034:1: ( ( rule__Si__Group_3__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3034:1: ( ( rule__Si__Group_3__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3035:1: ( rule__Si__Group_3__0 )?
            {
             before(grammarAccess.getSiAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3036:1: ( rule__Si__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)||(LA23_0>=46 && LA23_0<=48)||LA23_0==51||LA23_0==54||LA23_0==56) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3036:2: rule__Si__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__0_in_rule__Si__Group__3__Impl6310);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3046:1: rule__Si__Group__4 : rule__Si__Group__4__Impl rule__Si__Group__5 ;
    public final void rule__Si__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3050:1: ( rule__Si__Group__4__Impl rule__Si__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3051:2: rule__Si__Group__4__Impl rule__Si__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__4__Impl_in_rule__Si__Group__46341);
            rule__Si__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__5_in_rule__Si__Group__46344);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3058:1: rule__Si__Group__4__Impl : ( ( rule__Si__SinoAssignment_4 )? ) ;
    public final void rule__Si__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3062:1: ( ( ( rule__Si__SinoAssignment_4 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3063:1: ( ( rule__Si__SinoAssignment_4 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3063:1: ( ( rule__Si__SinoAssignment_4 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3064:1: ( rule__Si__SinoAssignment_4 )?
            {
             before(grammarAccess.getSiAccess().getSinoAssignment_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3065:1: ( rule__Si__SinoAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==60) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3065:2: rule__Si__SinoAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Si__SinoAssignment_4_in_rule__Si__Group__4__Impl6371);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3075:1: rule__Si__Group__5 : rule__Si__Group__5__Impl ;
    public final void rule__Si__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3079:1: ( rule__Si__Group__5__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3080:2: rule__Si__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__5__Impl_in_rule__Si__Group__56402);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3086:1: rule__Si__Group__5__Impl : ( 'fin si' ) ;
    public final void rule__Si__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3090:1: ( ( 'fin si' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3091:1: ( 'fin si' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3091:1: ( 'fin si' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3092:1: 'fin si'
            {
             before(grammarAccess.getSiAccess().getFinSiKeyword_5()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Si__Group__5__Impl6430); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3117:1: rule__Si__Group_3__0 : rule__Si__Group_3__0__Impl rule__Si__Group_3__1 ;
    public final void rule__Si__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3121:1: ( rule__Si__Group_3__0__Impl rule__Si__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3122:2: rule__Si__Group_3__0__Impl rule__Si__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__0__Impl_in_rule__Si__Group_3__06473);
            rule__Si__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__1_in_rule__Si__Group_3__06476);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3129:1: rule__Si__Group_3__0__Impl : ( ( rule__Si__SentenciasAssignment_3_0 ) ) ;
    public final void rule__Si__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3133:1: ( ( ( rule__Si__SentenciasAssignment_3_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3134:1: ( ( rule__Si__SentenciasAssignment_3_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3134:1: ( ( rule__Si__SentenciasAssignment_3_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3135:1: ( rule__Si__SentenciasAssignment_3_0 )
            {
             before(grammarAccess.getSiAccess().getSentenciasAssignment_3_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3136:1: ( rule__Si__SentenciasAssignment_3_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3136:2: rule__Si__SentenciasAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__SentenciasAssignment_3_0_in_rule__Si__Group_3__0__Impl6503);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3146:1: rule__Si__Group_3__1 : rule__Si__Group_3__1__Impl ;
    public final void rule__Si__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3150:1: ( rule__Si__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3151:2: rule__Si__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__1__Impl_in_rule__Si__Group_3__16533);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3157:1: rule__Si__Group_3__1__Impl : ( ( rule__Si__SentenciasAssignment_3_1 )* ) ;
    public final void rule__Si__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3161:1: ( ( ( rule__Si__SentenciasAssignment_3_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3162:1: ( ( rule__Si__SentenciasAssignment_3_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3162:1: ( ( rule__Si__SentenciasAssignment_3_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3163:1: ( rule__Si__SentenciasAssignment_3_1 )*
            {
             before(grammarAccess.getSiAccess().getSentenciasAssignment_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3164:1: ( rule__Si__SentenciasAssignment_3_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)||(LA25_0>=46 && LA25_0<=48)||LA25_0==51||LA25_0==54||LA25_0==56) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3164:2: rule__Si__SentenciasAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Si__SentenciasAssignment_3_1_in_rule__Si__Group_3__1__Impl6560);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3178:1: rule__Mientras__Group__0 : rule__Mientras__Group__0__Impl rule__Mientras__Group__1 ;
    public final void rule__Mientras__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3182:1: ( rule__Mientras__Group__0__Impl rule__Mientras__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3183:2: rule__Mientras__Group__0__Impl rule__Mientras__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__0__Impl_in_rule__Mientras__Group__06595);
            rule__Mientras__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__1_in_rule__Mientras__Group__06598);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3190:1: rule__Mientras__Group__0__Impl : ( 'mientras' ) ;
    public final void rule__Mientras__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3194:1: ( ( 'mientras' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3195:1: ( 'mientras' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3195:1: ( 'mientras' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3196:1: 'mientras'
            {
             before(grammarAccess.getMientrasAccess().getMientrasKeyword_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Mientras__Group__0__Impl6626); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:1: rule__Mientras__Group__1 : rule__Mientras__Group__1__Impl rule__Mientras__Group__2 ;
    public final void rule__Mientras__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3213:1: ( rule__Mientras__Group__1__Impl rule__Mientras__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3214:2: rule__Mientras__Group__1__Impl rule__Mientras__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__1__Impl_in_rule__Mientras__Group__16657);
            rule__Mientras__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__2_in_rule__Mientras__Group__16660);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: rule__Mientras__Group__1__Impl : ( ( rule__Mientras__ValorAssignment_1 ) ) ;
    public final void rule__Mientras__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3225:1: ( ( ( rule__Mientras__ValorAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3226:1: ( ( rule__Mientras__ValorAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3226:1: ( ( rule__Mientras__ValorAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3227:1: ( rule__Mientras__ValorAssignment_1 )
            {
             before(grammarAccess.getMientrasAccess().getValorAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3228:1: ( rule__Mientras__ValorAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3228:2: rule__Mientras__ValorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__ValorAssignment_1_in_rule__Mientras__Group__1__Impl6687);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3238:1: rule__Mientras__Group__2 : rule__Mientras__Group__2__Impl rule__Mientras__Group__3 ;
    public final void rule__Mientras__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3242:1: ( rule__Mientras__Group__2__Impl rule__Mientras__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3243:2: rule__Mientras__Group__2__Impl rule__Mientras__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__2__Impl_in_rule__Mientras__Group__26717);
            rule__Mientras__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__3_in_rule__Mientras__Group__26720);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3250:1: rule__Mientras__Group__2__Impl : ( 'hacer' ) ;
    public final void rule__Mientras__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3254:1: ( ( 'hacer' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3255:1: ( 'hacer' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3255:1: ( 'hacer' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3256:1: 'hacer'
            {
             before(grammarAccess.getMientrasAccess().getHacerKeyword_2()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Mientras__Group__2__Impl6748); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3269:1: rule__Mientras__Group__3 : rule__Mientras__Group__3__Impl rule__Mientras__Group__4 ;
    public final void rule__Mientras__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3273:1: ( rule__Mientras__Group__3__Impl rule__Mientras__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3274:2: rule__Mientras__Group__3__Impl rule__Mientras__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__3__Impl_in_rule__Mientras__Group__36779);
            rule__Mientras__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__4_in_rule__Mientras__Group__36782);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: rule__Mientras__Group__3__Impl : ( ( rule__Mientras__Group_3__0 )? ) ;
    public final void rule__Mientras__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3285:1: ( ( ( rule__Mientras__Group_3__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3286:1: ( ( rule__Mientras__Group_3__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3286:1: ( ( rule__Mientras__Group_3__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3287:1: ( rule__Mientras__Group_3__0 )?
            {
             before(grammarAccess.getMientrasAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:1: ( rule__Mientras__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)||(LA26_0>=46 && LA26_0<=48)||LA26_0==51||LA26_0==54||LA26_0==56) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:2: rule__Mientras__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__0_in_rule__Mientras__Group__3__Impl6809);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3298:1: rule__Mientras__Group__4 : rule__Mientras__Group__4__Impl ;
    public final void rule__Mientras__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3302:1: ( rule__Mientras__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3303:2: rule__Mientras__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__4__Impl_in_rule__Mientras__Group__46840);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3309:1: rule__Mientras__Group__4__Impl : ( 'fin_mientras' ) ;
    public final void rule__Mientras__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3313:1: ( ( 'fin_mientras' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3314:1: ( 'fin_mientras' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3314:1: ( 'fin_mientras' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3315:1: 'fin_mientras'
            {
             before(grammarAccess.getMientrasAccess().getFin_mientrasKeyword_4()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__Mientras__Group__4__Impl6868); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3338:1: rule__Mientras__Group_3__0 : rule__Mientras__Group_3__0__Impl rule__Mientras__Group_3__1 ;
    public final void rule__Mientras__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3342:1: ( rule__Mientras__Group_3__0__Impl rule__Mientras__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3343:2: rule__Mientras__Group_3__0__Impl rule__Mientras__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__0__Impl_in_rule__Mientras__Group_3__06909);
            rule__Mientras__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__1_in_rule__Mientras__Group_3__06912);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3350:1: rule__Mientras__Group_3__0__Impl : ( ( rule__Mientras__SentenciasAssignment_3_0 ) ) ;
    public final void rule__Mientras__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3354:1: ( ( ( rule__Mientras__SentenciasAssignment_3_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3355:1: ( ( rule__Mientras__SentenciasAssignment_3_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3355:1: ( ( rule__Mientras__SentenciasAssignment_3_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3356:1: ( rule__Mientras__SentenciasAssignment_3_0 )
            {
             before(grammarAccess.getMientrasAccess().getSentenciasAssignment_3_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:1: ( rule__Mientras__SentenciasAssignment_3_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:2: rule__Mientras__SentenciasAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__SentenciasAssignment_3_0_in_rule__Mientras__Group_3__0__Impl6939);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3367:1: rule__Mientras__Group_3__1 : rule__Mientras__Group_3__1__Impl ;
    public final void rule__Mientras__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3371:1: ( rule__Mientras__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3372:2: rule__Mientras__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__1__Impl_in_rule__Mientras__Group_3__16969);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3378:1: rule__Mientras__Group_3__1__Impl : ( ( rule__Mientras__SentenciasAssignment_3_1 )* ) ;
    public final void rule__Mientras__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3382:1: ( ( ( rule__Mientras__SentenciasAssignment_3_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3383:1: ( ( rule__Mientras__SentenciasAssignment_3_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3383:1: ( ( rule__Mientras__SentenciasAssignment_3_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3384:1: ( rule__Mientras__SentenciasAssignment_3_1 )*
            {
             before(grammarAccess.getMientrasAccess().getSentenciasAssignment_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3385:1: ( rule__Mientras__SentenciasAssignment_3_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)||(LA27_0>=46 && LA27_0<=48)||LA27_0==51||LA27_0==54||LA27_0==56) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3385:2: rule__Mientras__SentenciasAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Mientras__SentenciasAssignment_3_1_in_rule__Mientras__Group_3__1__Impl6996);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3399:1: rule__Repetir__Group__0 : rule__Repetir__Group__0__Impl rule__Repetir__Group__1 ;
    public final void rule__Repetir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3403:1: ( rule__Repetir__Group__0__Impl rule__Repetir__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3404:2: rule__Repetir__Group__0__Impl rule__Repetir__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__0__Impl_in_rule__Repetir__Group__07031);
            rule__Repetir__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__1_in_rule__Repetir__Group__07034);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3411:1: rule__Repetir__Group__0__Impl : ( 'repetir' ) ;
    public final void rule__Repetir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3415:1: ( ( 'repetir' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3416:1: ( 'repetir' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3416:1: ( 'repetir' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3417:1: 'repetir'
            {
             before(grammarAccess.getRepetirAccess().getRepetirKeyword_0()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__Repetir__Group__0__Impl7062); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3430:1: rule__Repetir__Group__1 : rule__Repetir__Group__1__Impl rule__Repetir__Group__2 ;
    public final void rule__Repetir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3434:1: ( rule__Repetir__Group__1__Impl rule__Repetir__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3435:2: rule__Repetir__Group__1__Impl rule__Repetir__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__1__Impl_in_rule__Repetir__Group__17093);
            rule__Repetir__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__2_in_rule__Repetir__Group__17096);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3442:1: rule__Repetir__Group__1__Impl : ( ( rule__Repetir__Group_1__0 )? ) ;
    public final void rule__Repetir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3446:1: ( ( ( rule__Repetir__Group_1__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3447:1: ( ( rule__Repetir__Group_1__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3447:1: ( ( rule__Repetir__Group_1__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3448:1: ( rule__Repetir__Group_1__0 )?
            {
             before(grammarAccess.getRepetirAccess().getGroup_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3449:1: ( rule__Repetir__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||(LA28_0>=46 && LA28_0<=48)||LA28_0==51||LA28_0==54||LA28_0==56) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3449:2: rule__Repetir__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__0_in_rule__Repetir__Group__1__Impl7123);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3459:1: rule__Repetir__Group__2 : rule__Repetir__Group__2__Impl rule__Repetir__Group__3 ;
    public final void rule__Repetir__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3463:1: ( rule__Repetir__Group__2__Impl rule__Repetir__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3464:2: rule__Repetir__Group__2__Impl rule__Repetir__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__2__Impl_in_rule__Repetir__Group__27154);
            rule__Repetir__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__3_in_rule__Repetir__Group__27157);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3471:1: rule__Repetir__Group__2__Impl : ( 'hasta_que' ) ;
    public final void rule__Repetir__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3475:1: ( ( 'hasta_que' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3476:1: ( 'hasta_que' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3476:1: ( 'hasta_que' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3477:1: 'hasta_que'
            {
             before(grammarAccess.getRepetirAccess().getHasta_queKeyword_2()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__Repetir__Group__2__Impl7185); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3490:1: rule__Repetir__Group__3 : rule__Repetir__Group__3__Impl ;
    public final void rule__Repetir__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3494:1: ( rule__Repetir__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3495:2: rule__Repetir__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__3__Impl_in_rule__Repetir__Group__37216);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3501:1: rule__Repetir__Group__3__Impl : ( ( rule__Repetir__ValorAssignment_3 ) ) ;
    public final void rule__Repetir__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3505:1: ( ( ( rule__Repetir__ValorAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:1: ( ( rule__Repetir__ValorAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:1: ( ( rule__Repetir__ValorAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3507:1: ( rule__Repetir__ValorAssignment_3 )
            {
             before(grammarAccess.getRepetirAccess().getValorAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3508:1: ( rule__Repetir__ValorAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3508:2: rule__Repetir__ValorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__ValorAssignment_3_in_rule__Repetir__Group__3__Impl7243);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3526:1: rule__Repetir__Group_1__0 : rule__Repetir__Group_1__0__Impl rule__Repetir__Group_1__1 ;
    public final void rule__Repetir__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3530:1: ( rule__Repetir__Group_1__0__Impl rule__Repetir__Group_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3531:2: rule__Repetir__Group_1__0__Impl rule__Repetir__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__0__Impl_in_rule__Repetir__Group_1__07281);
            rule__Repetir__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__1_in_rule__Repetir__Group_1__07284);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3538:1: rule__Repetir__Group_1__0__Impl : ( ( rule__Repetir__SentenciasAssignment_1_0 ) ) ;
    public final void rule__Repetir__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3542:1: ( ( ( rule__Repetir__SentenciasAssignment_1_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3543:1: ( ( rule__Repetir__SentenciasAssignment_1_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3543:1: ( ( rule__Repetir__SentenciasAssignment_1_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3544:1: ( rule__Repetir__SentenciasAssignment_1_0 )
            {
             before(grammarAccess.getRepetirAccess().getSentenciasAssignment_1_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3545:1: ( rule__Repetir__SentenciasAssignment_1_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3545:2: rule__Repetir__SentenciasAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__SentenciasAssignment_1_0_in_rule__Repetir__Group_1__0__Impl7311);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3555:1: rule__Repetir__Group_1__1 : rule__Repetir__Group_1__1__Impl ;
    public final void rule__Repetir__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3559:1: ( rule__Repetir__Group_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3560:2: rule__Repetir__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__1__Impl_in_rule__Repetir__Group_1__17341);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3566:1: rule__Repetir__Group_1__1__Impl : ( ( rule__Repetir__SentenciasAssignment_1_1 )* ) ;
    public final void rule__Repetir__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3570:1: ( ( ( rule__Repetir__SentenciasAssignment_1_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:1: ( ( rule__Repetir__SentenciasAssignment_1_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:1: ( ( rule__Repetir__SentenciasAssignment_1_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3572:1: ( rule__Repetir__SentenciasAssignment_1_1 )*
            {
             before(grammarAccess.getRepetirAccess().getSentenciasAssignment_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3573:1: ( rule__Repetir__SentenciasAssignment_1_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)||(LA29_0>=46 && LA29_0<=48)||LA29_0==51||LA29_0==54||LA29_0==56) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3573:2: rule__Repetir__SentenciasAssignment_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Repetir__SentenciasAssignment_1_1_in_rule__Repetir__Group_1__1__Impl7368);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3587:1: rule__Desde__Group__0 : rule__Desde__Group__0__Impl rule__Desde__Group__1 ;
    public final void rule__Desde__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3591:1: ( rule__Desde__Group__0__Impl rule__Desde__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3592:2: rule__Desde__Group__0__Impl rule__Desde__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__0__Impl_in_rule__Desde__Group__07403);
            rule__Desde__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__1_in_rule__Desde__Group__07406);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3599:1: rule__Desde__Group__0__Impl : ( 'desde' ) ;
    public final void rule__Desde__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3603:1: ( ( 'desde' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3604:1: ( 'desde' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3604:1: ( 'desde' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3605:1: 'desde'
            {
             before(grammarAccess.getDesdeAccess().getDesdeKeyword_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Desde__Group__0__Impl7434); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3618:1: rule__Desde__Group__1 : rule__Desde__Group__1__Impl rule__Desde__Group__2 ;
    public final void rule__Desde__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3622:1: ( rule__Desde__Group__1__Impl rule__Desde__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3623:2: rule__Desde__Group__1__Impl rule__Desde__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__1__Impl_in_rule__Desde__Group__17465);
            rule__Desde__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__2_in_rule__Desde__Group__17468);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3630:1: rule__Desde__Group__1__Impl : ( ( rule__Desde__AsignacionAssignment_1 ) ) ;
    public final void rule__Desde__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3634:1: ( ( ( rule__Desde__AsignacionAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3635:1: ( ( rule__Desde__AsignacionAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3635:1: ( ( rule__Desde__AsignacionAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3636:1: ( rule__Desde__AsignacionAssignment_1 )
            {
             before(grammarAccess.getDesdeAccess().getAsignacionAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3637:1: ( rule__Desde__AsignacionAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3637:2: rule__Desde__AsignacionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__AsignacionAssignment_1_in_rule__Desde__Group__1__Impl7495);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3647:1: rule__Desde__Group__2 : rule__Desde__Group__2__Impl rule__Desde__Group__3 ;
    public final void rule__Desde__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3651:1: ( rule__Desde__Group__2__Impl rule__Desde__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3652:2: rule__Desde__Group__2__Impl rule__Desde__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__2__Impl_in_rule__Desde__Group__27525);
            rule__Desde__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__3_in_rule__Desde__Group__27528);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3659:1: rule__Desde__Group__2__Impl : ( 'hasta' ) ;
    public final void rule__Desde__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3663:1: ( ( 'hasta' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3664:1: ( 'hasta' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3664:1: ( 'hasta' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3665:1: 'hasta'
            {
             before(grammarAccess.getDesdeAccess().getHastaKeyword_2()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__Desde__Group__2__Impl7556); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:1: rule__Desde__Group__3 : rule__Desde__Group__3__Impl rule__Desde__Group__4 ;
    public final void rule__Desde__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3682:1: ( rule__Desde__Group__3__Impl rule__Desde__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3683:2: rule__Desde__Group__3__Impl rule__Desde__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__3__Impl_in_rule__Desde__Group__37587);
            rule__Desde__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__4_in_rule__Desde__Group__37590);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3690:1: rule__Desde__Group__3__Impl : ( ( rule__Desde__ValorAssignment_3 ) ) ;
    public final void rule__Desde__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3694:1: ( ( ( rule__Desde__ValorAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3695:1: ( ( rule__Desde__ValorAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3695:1: ( ( rule__Desde__ValorAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3696:1: ( rule__Desde__ValorAssignment_3 )
            {
             before(grammarAccess.getDesdeAccess().getValorAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3697:1: ( rule__Desde__ValorAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3697:2: rule__Desde__ValorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__ValorAssignment_3_in_rule__Desde__Group__3__Impl7617);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:1: rule__Desde__Group__4 : rule__Desde__Group__4__Impl rule__Desde__Group__5 ;
    public final void rule__Desde__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3711:1: ( rule__Desde__Group__4__Impl rule__Desde__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3712:2: rule__Desde__Group__4__Impl rule__Desde__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__4__Impl_in_rule__Desde__Group__47647);
            rule__Desde__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__5_in_rule__Desde__Group__47650);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3719:1: rule__Desde__Group__4__Impl : ( 'hacer' ) ;
    public final void rule__Desde__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3723:1: ( ( 'hacer' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3724:1: ( 'hacer' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3724:1: ( 'hacer' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3725:1: 'hacer'
            {
             before(grammarAccess.getDesdeAccess().getHacerKeyword_4()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Desde__Group__4__Impl7678); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3738:1: rule__Desde__Group__5 : rule__Desde__Group__5__Impl rule__Desde__Group__6 ;
    public final void rule__Desde__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3742:1: ( rule__Desde__Group__5__Impl rule__Desde__Group__6 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3743:2: rule__Desde__Group__5__Impl rule__Desde__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__5__Impl_in_rule__Desde__Group__57709);
            rule__Desde__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__6_in_rule__Desde__Group__57712);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3750:1: rule__Desde__Group__5__Impl : ( ( rule__Desde__Group_5__0 )? ) ;
    public final void rule__Desde__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3754:1: ( ( ( rule__Desde__Group_5__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3755:1: ( ( rule__Desde__Group_5__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3755:1: ( ( rule__Desde__Group_5__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:1: ( rule__Desde__Group_5__0 )?
            {
             before(grammarAccess.getDesdeAccess().getGroup_5()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3757:1: ( rule__Desde__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)||(LA30_0>=46 && LA30_0<=48)||LA30_0==51||LA30_0==54||LA30_0==56) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3757:2: rule__Desde__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__0_in_rule__Desde__Group__5__Impl7739);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3767:1: rule__Desde__Group__6 : rule__Desde__Group__6__Impl ;
    public final void rule__Desde__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3771:1: ( rule__Desde__Group__6__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3772:2: rule__Desde__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__6__Impl_in_rule__Desde__Group__67770);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3778:1: rule__Desde__Group__6__Impl : ( 'fin_desde' ) ;
    public final void rule__Desde__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3782:1: ( ( 'fin_desde' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3783:1: ( 'fin_desde' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3783:1: ( 'fin_desde' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3784:1: 'fin_desde'
            {
             before(grammarAccess.getDesdeAccess().getFin_desdeKeyword_6()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__Desde__Group__6__Impl7798); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3811:1: rule__Desde__Group_5__0 : rule__Desde__Group_5__0__Impl rule__Desde__Group_5__1 ;
    public final void rule__Desde__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3815:1: ( rule__Desde__Group_5__0__Impl rule__Desde__Group_5__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3816:2: rule__Desde__Group_5__0__Impl rule__Desde__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__0__Impl_in_rule__Desde__Group_5__07843);
            rule__Desde__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__1_in_rule__Desde__Group_5__07846);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3823:1: rule__Desde__Group_5__0__Impl : ( ( rule__Desde__SentenciasAssignment_5_0 ) ) ;
    public final void rule__Desde__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3827:1: ( ( ( rule__Desde__SentenciasAssignment_5_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3828:1: ( ( rule__Desde__SentenciasAssignment_5_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3828:1: ( ( rule__Desde__SentenciasAssignment_5_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3829:1: ( rule__Desde__SentenciasAssignment_5_0 )
            {
             before(grammarAccess.getDesdeAccess().getSentenciasAssignment_5_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3830:1: ( rule__Desde__SentenciasAssignment_5_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3830:2: rule__Desde__SentenciasAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__SentenciasAssignment_5_0_in_rule__Desde__Group_5__0__Impl7873);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3840:1: rule__Desde__Group_5__1 : rule__Desde__Group_5__1__Impl ;
    public final void rule__Desde__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3844:1: ( rule__Desde__Group_5__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3845:2: rule__Desde__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__1__Impl_in_rule__Desde__Group_5__17903);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3851:1: rule__Desde__Group_5__1__Impl : ( ( rule__Desde__SentenciasAssignment_5_1 )* ) ;
    public final void rule__Desde__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3855:1: ( ( ( rule__Desde__SentenciasAssignment_5_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3856:1: ( ( rule__Desde__SentenciasAssignment_5_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3856:1: ( ( rule__Desde__SentenciasAssignment_5_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3857:1: ( rule__Desde__SentenciasAssignment_5_1 )*
            {
             before(grammarAccess.getDesdeAccess().getSentenciasAssignment_5_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3858:1: ( rule__Desde__SentenciasAssignment_5_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)||(LA31_0>=46 && LA31_0<=48)||LA31_0==51||LA31_0==54||LA31_0==56) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3858:2: rule__Desde__SentenciasAssignment_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Desde__SentenciasAssignment_5_1_in_rule__Desde__Group_5__1__Impl7930);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3872:1: rule__Incremento__Group__0 : rule__Incremento__Group__0__Impl rule__Incremento__Group__1 ;
    public final void rule__Incremento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3876:1: ( rule__Incremento__Group__0__Impl rule__Incremento__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3877:2: rule__Incremento__Group__0__Impl rule__Incremento__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__Group__0__Impl_in_rule__Incremento__Group__07965);
            rule__Incremento__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Incremento__Group__1_in_rule__Incremento__Group__07968);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3884:1: rule__Incremento__Group__0__Impl : ( ( rule__Incremento__NombreAssignment_0 ) ) ;
    public final void rule__Incremento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3888:1: ( ( ( rule__Incremento__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3889:1: ( ( rule__Incremento__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3889:1: ( ( rule__Incremento__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3890:1: ( rule__Incremento__NombreAssignment_0 )
            {
             before(grammarAccess.getIncrementoAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3891:1: ( rule__Incremento__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3891:2: rule__Incremento__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__NombreAssignment_0_in_rule__Incremento__Group__0__Impl7995);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3901:1: rule__Incremento__Group__1 : rule__Incremento__Group__1__Impl ;
    public final void rule__Incremento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3905:1: ( rule__Incremento__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3906:2: rule__Incremento__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__Group__1__Impl_in_rule__Incremento__Group__18025);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3912:1: rule__Incremento__Group__1__Impl : ( ( rule__Incremento__SsignoAssignment_1 ) ) ;
    public final void rule__Incremento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3916:1: ( ( ( rule__Incremento__SsignoAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3917:1: ( ( rule__Incremento__SsignoAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3917:1: ( ( rule__Incremento__SsignoAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3918:1: ( rule__Incremento__SsignoAssignment_1 )
            {
             before(grammarAccess.getIncrementoAccess().getSsignoAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3919:1: ( rule__Incremento__SsignoAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3919:2: rule__Incremento__SsignoAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__SsignoAssignment_1_in_rule__Incremento__Group__1__Impl8052);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3933:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3937:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3938:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__08086);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__08089);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3945:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NombreAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3949:1: ( ( ( rule__Variable__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3950:1: ( ( rule__Variable__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3950:1: ( ( rule__Variable__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3951:1: ( rule__Variable__NombreAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3952:1: ( rule__Variable__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3952:2: rule__Variable__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__NombreAssignment_0_in_rule__Variable__Group__0__Impl8116);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3962:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3966:1: ( rule__Variable__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3967:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__18146);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3973:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__MatAssignment_1 )* ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3977:1: ( ( ( rule__Variable__MatAssignment_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3978:1: ( ( rule__Variable__MatAssignment_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3978:1: ( ( rule__Variable__MatAssignment_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3979:1: ( rule__Variable__MatAssignment_1 )*
            {
             before(grammarAccess.getVariableAccess().getMatAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3980:1: ( rule__Variable__MatAssignment_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_MATRIZ) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3980:2: rule__Variable__MatAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Variable__MatAssignment_1_in_rule__Variable__Group__1__Impl8173);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3994:1: rule__VariableID__Group__0 : rule__VariableID__Group__0__Impl rule__VariableID__Group__1 ;
    public final void rule__VariableID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3998:1: ( rule__VariableID__Group__0__Impl rule__VariableID__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3999:2: rule__VariableID__Group__0__Impl rule__VariableID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__0__Impl_in_rule__VariableID__Group__08208);
            rule__VariableID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__1_in_rule__VariableID__Group__08211);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: rule__VariableID__Group__0__Impl : ( ( rule__VariableID__NombreAssignment_0 ) ) ;
    public final void rule__VariableID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4010:1: ( ( ( rule__VariableID__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4011:1: ( ( rule__VariableID__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4011:1: ( ( rule__VariableID__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4012:1: ( rule__VariableID__NombreAssignment_0 )
            {
             before(grammarAccess.getVariableIDAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4013:1: ( rule__VariableID__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4013:2: rule__VariableID__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__NombreAssignment_0_in_rule__VariableID__Group__0__Impl8238);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4023:1: rule__VariableID__Group__1 : rule__VariableID__Group__1__Impl ;
    public final void rule__VariableID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4027:1: ( rule__VariableID__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4028:2: rule__VariableID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__1__Impl_in_rule__VariableID__Group__18268);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4034:1: rule__VariableID__Group__1__Impl : ( ( rule__VariableID__MatAssignment_1 )* ) ;
    public final void rule__VariableID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4038:1: ( ( ( rule__VariableID__MatAssignment_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4039:1: ( ( rule__VariableID__MatAssignment_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4039:1: ( ( rule__VariableID__MatAssignment_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4040:1: ( rule__VariableID__MatAssignment_1 )*
            {
             before(grammarAccess.getVariableIDAccess().getMatAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4041:1: ( rule__VariableID__MatAssignment_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_MATRIZ) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4041:2: rule__VariableID__MatAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__VariableID__MatAssignment_1_in_rule__VariableID__Group__1__Impl8295);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4055:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4059:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4060:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__08330);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__08333);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4067:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4071:1: ( ( ( '-' )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4072:1: ( ( '-' )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4072:1: ( ( '-' )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4073:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4074:1: ( '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==24) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4075:2: '-'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__EInt__Group__0__Impl8362); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4086:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4090:1: ( rule__EInt__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4091:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__18395);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4097:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4101:1: ( ( RULE_INT ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4102:1: ( RULE_INT )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4102:1: ( RULE_INT )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4103:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl8422); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4118:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4122:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4123:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__08455);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__08458);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4130:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4134:1: ( ( ( '-' )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4135:1: ( ( '-' )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4135:1: ( ( '-' )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4136:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4137:1: ( '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==24) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4138:2: '-'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__EFloat__Group__0__Impl8487); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4149:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4153:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4154:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__18520);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__18523);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4161:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4165:1: ( ( ( RULE_INT )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4166:1: ( ( RULE_INT )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4166:1: ( ( RULE_INT )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4167:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:1: ( RULE_INT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl8551); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4178:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4182:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4183:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__28582);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__28585);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4190:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4194:1: ( ( '.' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4195:1: ( '.' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4195:1: ( '.' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4196:1: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__EFloat__Group__2__Impl8613); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4209:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4213:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4214:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__38644);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__38647);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4221:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4225:1: ( ( RULE_INT ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4226:1: ( RULE_INT )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4226:1: ( RULE_INT )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4227:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl8674); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4238:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4242:1: ( rule__EFloat__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4243:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__48703);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4249:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4253:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4254:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4254:1: ( ( rule__EFloat__Group_4__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4255:1: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4256:1: ( rule__EFloat__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=19 && LA37_0<=20)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4256:2: rule__EFloat__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl8730);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4276:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4280:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4281:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__08771);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__08774);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4288:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4292:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4293:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4293:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4294:1: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4295:1: ( rule__EFloat__Alternatives_4_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4295:2: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl8801);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4305:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4309:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4310:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__18831);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__18834);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4317:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4321:1: ( ( ( '-' )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4322:1: ( ( '-' )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4322:1: ( ( '-' )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4323:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4324:1: ( '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==24) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4325:2: '-'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__EFloat__Group_4__1__Impl8863); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4336:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4340:1: ( rule__EFloat__Group_4__2__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4341:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__28896);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4347:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4351:1: ( ( RULE_INT ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4352:1: ( RULE_INT )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4352:1: ( RULE_INT )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4353:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl8923); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4370:1: rule__Operacion__Group__0 : rule__Operacion__Group__0__Impl rule__Operacion__Group__1 ;
    public final void rule__Operacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4374:1: ( rule__Operacion__Group__0__Impl rule__Operacion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4375:2: rule__Operacion__Group__0__Impl rule__Operacion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__0__Impl_in_rule__Operacion__Group__08958);
            rule__Operacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__1_in_rule__Operacion__Group__08961);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4382:1: rule__Operacion__Group__0__Impl : ( '(' ) ;
    public final void rule__Operacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4386:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4387:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4387:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4388:1: '('
            {
             before(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Operacion__Group__0__Impl8989); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4401:1: rule__Operacion__Group__1 : rule__Operacion__Group__1__Impl rule__Operacion__Group__2 ;
    public final void rule__Operacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4405:1: ( rule__Operacion__Group__1__Impl rule__Operacion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4406:2: rule__Operacion__Group__1__Impl rule__Operacion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__1__Impl_in_rule__Operacion__Group__19020);
            rule__Operacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__2_in_rule__Operacion__Group__19023);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4413:1: rule__Operacion__Group__1__Impl : ( ( rule__Operacion__Op_izqAssignment_1 ) ) ;
    public final void rule__Operacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4417:1: ( ( ( rule__Operacion__Op_izqAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4418:1: ( ( rule__Operacion__Op_izqAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4418:1: ( ( rule__Operacion__Op_izqAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4419:1: ( rule__Operacion__Op_izqAssignment_1 )
            {
             before(grammarAccess.getOperacionAccess().getOp_izqAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4420:1: ( rule__Operacion__Op_izqAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4420:2: rule__Operacion__Op_izqAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Op_izqAssignment_1_in_rule__Operacion__Group__1__Impl9050);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4430:1: rule__Operacion__Group__2 : rule__Operacion__Group__2__Impl rule__Operacion__Group__3 ;
    public final void rule__Operacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4434:1: ( rule__Operacion__Group__2__Impl rule__Operacion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4435:2: rule__Operacion__Group__2__Impl rule__Operacion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__2__Impl_in_rule__Operacion__Group__29080);
            rule__Operacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__3_in_rule__Operacion__Group__29083);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4442:1: rule__Operacion__Group__2__Impl : ( ( rule__Operacion__Signo_opAssignment_2 ) ) ;
    public final void rule__Operacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4446:1: ( ( ( rule__Operacion__Signo_opAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4447:1: ( ( rule__Operacion__Signo_opAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4447:1: ( ( rule__Operacion__Signo_opAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4448:1: ( rule__Operacion__Signo_opAssignment_2 )
            {
             before(grammarAccess.getOperacionAccess().getSigno_opAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4449:1: ( rule__Operacion__Signo_opAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4449:2: rule__Operacion__Signo_opAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Signo_opAssignment_2_in_rule__Operacion__Group__2__Impl9110);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4459:1: rule__Operacion__Group__3 : rule__Operacion__Group__3__Impl rule__Operacion__Group__4 ;
    public final void rule__Operacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4463:1: ( rule__Operacion__Group__3__Impl rule__Operacion__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4464:2: rule__Operacion__Group__3__Impl rule__Operacion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__3__Impl_in_rule__Operacion__Group__39140);
            rule__Operacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__4_in_rule__Operacion__Group__39143);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4471:1: rule__Operacion__Group__3__Impl : ( ( rule__Operacion__Op_derAssignment_3 ) ) ;
    public final void rule__Operacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4475:1: ( ( ( rule__Operacion__Op_derAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4476:1: ( ( rule__Operacion__Op_derAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4476:1: ( ( rule__Operacion__Op_derAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4477:1: ( rule__Operacion__Op_derAssignment_3 )
            {
             before(grammarAccess.getOperacionAccess().getOp_derAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4478:1: ( rule__Operacion__Op_derAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4478:2: rule__Operacion__Op_derAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Op_derAssignment_3_in_rule__Operacion__Group__3__Impl9170);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4488:1: rule__Operacion__Group__4 : rule__Operacion__Group__4__Impl ;
    public final void rule__Operacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4492:1: ( rule__Operacion__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4493:2: rule__Operacion__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__4__Impl_in_rule__Operacion__Group__49200);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4499:1: rule__Operacion__Group__4__Impl : ( ')' ) ;
    public final void rule__Operacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4503:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4504:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4504:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4505:1: ')'
            {
             before(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_4()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Operacion__Group__4__Impl9228); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4528:1: rule__Sino__Group__0 : rule__Sino__Group__0__Impl rule__Sino__Group__1 ;
    public final void rule__Sino__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4532:1: ( rule__Sino__Group__0__Impl rule__Sino__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4533:2: rule__Sino__Group__0__Impl rule__Sino__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__0__Impl_in_rule__Sino__Group__09269);
            rule__Sino__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__1_in_rule__Sino__Group__09272);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4540:1: rule__Sino__Group__0__Impl : ( () ) ;
    public final void rule__Sino__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4544:1: ( ( () ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4545:1: ( () )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4545:1: ( () )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4546:1: ()
            {
             before(grammarAccess.getSinoAccess().getSinoAction_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4547:1: ()
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4549:1: 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4559:1: rule__Sino__Group__1 : rule__Sino__Group__1__Impl rule__Sino__Group__2 ;
    public final void rule__Sino__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4563:1: ( rule__Sino__Group__1__Impl rule__Sino__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4564:2: rule__Sino__Group__1__Impl rule__Sino__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__1__Impl_in_rule__Sino__Group__19330);
            rule__Sino__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__2_in_rule__Sino__Group__19333);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4571:1: rule__Sino__Group__1__Impl : ( 'sino' ) ;
    public final void rule__Sino__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4575:1: ( ( 'sino' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4576:1: ( 'sino' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4576:1: ( 'sino' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4577:1: 'sino'
            {
             before(grammarAccess.getSinoAccess().getSinoKeyword_1()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__Sino__Group__1__Impl9361); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4590:1: rule__Sino__Group__2 : rule__Sino__Group__2__Impl ;
    public final void rule__Sino__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4594:1: ( rule__Sino__Group__2__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4595:2: rule__Sino__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__2__Impl_in_rule__Sino__Group__29392);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4601:1: rule__Sino__Group__2__Impl : ( ( rule__Sino__Group_2__0 )? ) ;
    public final void rule__Sino__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4605:1: ( ( ( rule__Sino__Group_2__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4606:1: ( ( rule__Sino__Group_2__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4606:1: ( ( rule__Sino__Group_2__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4607:1: ( rule__Sino__Group_2__0 )?
            {
             before(grammarAccess.getSinoAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4608:1: ( rule__Sino__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)||(LA39_0>=46 && LA39_0<=48)||LA39_0==51||LA39_0==54||LA39_0==56) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4608:2: rule__Sino__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__0_in_rule__Sino__Group__2__Impl9419);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4624:1: rule__Sino__Group_2__0 : rule__Sino__Group_2__0__Impl rule__Sino__Group_2__1 ;
    public final void rule__Sino__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4628:1: ( rule__Sino__Group_2__0__Impl rule__Sino__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4629:2: rule__Sino__Group_2__0__Impl rule__Sino__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__0__Impl_in_rule__Sino__Group_2__09456);
            rule__Sino__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__1_in_rule__Sino__Group_2__09459);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4636:1: rule__Sino__Group_2__0__Impl : ( ( rule__Sino__SentenciasAssignment_2_0 ) ) ;
    public final void rule__Sino__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4640:1: ( ( ( rule__Sino__SentenciasAssignment_2_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4641:1: ( ( rule__Sino__SentenciasAssignment_2_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4641:1: ( ( rule__Sino__SentenciasAssignment_2_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4642:1: ( rule__Sino__SentenciasAssignment_2_0 )
            {
             before(grammarAccess.getSinoAccess().getSentenciasAssignment_2_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4643:1: ( rule__Sino__SentenciasAssignment_2_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4643:2: rule__Sino__SentenciasAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__SentenciasAssignment_2_0_in_rule__Sino__Group_2__0__Impl9486);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4653:1: rule__Sino__Group_2__1 : rule__Sino__Group_2__1__Impl ;
    public final void rule__Sino__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4657:1: ( rule__Sino__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4658:2: rule__Sino__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__1__Impl_in_rule__Sino__Group_2__19516);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4664:1: rule__Sino__Group_2__1__Impl : ( ( rule__Sino__SentenciasAssignment_2_1 )* ) ;
    public final void rule__Sino__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4668:1: ( ( ( rule__Sino__SentenciasAssignment_2_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4669:1: ( ( rule__Sino__SentenciasAssignment_2_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4669:1: ( ( rule__Sino__SentenciasAssignment_2_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4670:1: ( rule__Sino__SentenciasAssignment_2_1 )*
            {
             before(grammarAccess.getSinoAccess().getSentenciasAssignment_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4671:1: ( rule__Sino__SentenciasAssignment_2_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)||(LA40_0>=46 && LA40_0<=48)||LA40_0==51||LA40_0==54||LA40_0==56) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4671:2: rule__Sino__SentenciasAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Sino__SentenciasAssignment_2_1_in_rule__Sino__Group_2__1__Impl9543);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4685:1: rule__ParametroFuncion__Group__0 : rule__ParametroFuncion__Group__0__Impl rule__ParametroFuncion__Group__1 ;
    public final void rule__ParametroFuncion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4689:1: ( rule__ParametroFuncion__Group__0__Impl rule__ParametroFuncion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4690:2: rule__ParametroFuncion__Group__0__Impl rule__ParametroFuncion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__0__Impl_in_rule__ParametroFuncion__Group__09578);
            rule__ParametroFuncion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__1_in_rule__ParametroFuncion__Group__09581);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4697:1: rule__ParametroFuncion__Group__0__Impl : ( ( rule__ParametroFuncion__TipoAssignment_0 ) ) ;
    public final void rule__ParametroFuncion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4701:1: ( ( ( rule__ParametroFuncion__TipoAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4702:1: ( ( rule__ParametroFuncion__TipoAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4702:1: ( ( rule__ParametroFuncion__TipoAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4703:1: ( rule__ParametroFuncion__TipoAssignment_0 )
            {
             before(grammarAccess.getParametroFuncionAccess().getTipoAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4704:1: ( rule__ParametroFuncion__TipoAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4704:2: rule__ParametroFuncion__TipoAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__TipoAssignment_0_in_rule__ParametroFuncion__Group__0__Impl9608);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4714:1: rule__ParametroFuncion__Group__1 : rule__ParametroFuncion__Group__1__Impl rule__ParametroFuncion__Group__2 ;
    public final void rule__ParametroFuncion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4718:1: ( rule__ParametroFuncion__Group__1__Impl rule__ParametroFuncion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4719:2: rule__ParametroFuncion__Group__1__Impl rule__ParametroFuncion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__1__Impl_in_rule__ParametroFuncion__Group__19638);
            rule__ParametroFuncion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__2_in_rule__ParametroFuncion__Group__19641);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4726:1: rule__ParametroFuncion__Group__1__Impl : ( ( rule__ParametroFuncion__PasoAssignment_1 ) ) ;
    public final void rule__ParametroFuncion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4730:1: ( ( ( rule__ParametroFuncion__PasoAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4731:1: ( ( rule__ParametroFuncion__PasoAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4731:1: ( ( rule__ParametroFuncion__PasoAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4732:1: ( rule__ParametroFuncion__PasoAssignment_1 )
            {
             before(grammarAccess.getParametroFuncionAccess().getPasoAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4733:1: ( rule__ParametroFuncion__PasoAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4733:2: rule__ParametroFuncion__PasoAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__PasoAssignment_1_in_rule__ParametroFuncion__Group__1__Impl9668);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4743:1: rule__ParametroFuncion__Group__2 : rule__ParametroFuncion__Group__2__Impl ;
    public final void rule__ParametroFuncion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4747:1: ( rule__ParametroFuncion__Group__2__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4748:2: rule__ParametroFuncion__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__2__Impl_in_rule__ParametroFuncion__Group__29698);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4754:1: rule__ParametroFuncion__Group__2__Impl : ( ( rule__ParametroFuncion__VariableAssignment_2 ) ) ;
    public final void rule__ParametroFuncion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4758:1: ( ( ( rule__ParametroFuncion__VariableAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4759:1: ( ( rule__ParametroFuncion__VariableAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4759:1: ( ( rule__ParametroFuncion__VariableAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4760:1: ( rule__ParametroFuncion__VariableAssignment_2 )
            {
             before(grammarAccess.getParametroFuncionAccess().getVariableAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4761:1: ( rule__ParametroFuncion__VariableAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4761:2: rule__ParametroFuncion__VariableAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__VariableAssignment_2_in_rule__ParametroFuncion__Group__2__Impl9725);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4777:1: rule__Funcion__Group__0 : rule__Funcion__Group__0__Impl rule__Funcion__Group__1 ;
    public final void rule__Funcion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4781:1: ( rule__Funcion__Group__0__Impl rule__Funcion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4782:2: rule__Funcion__Group__0__Impl rule__Funcion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__0__Impl_in_rule__Funcion__Group__09761);
            rule__Funcion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__1_in_rule__Funcion__Group__09764);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4789:1: rule__Funcion__Group__0__Impl : ( ( rule__Funcion__TipoAssignment_0 ) ) ;
    public final void rule__Funcion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4793:1: ( ( ( rule__Funcion__TipoAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4794:1: ( ( rule__Funcion__TipoAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4794:1: ( ( rule__Funcion__TipoAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4795:1: ( rule__Funcion__TipoAssignment_0 )
            {
             before(grammarAccess.getFuncionAccess().getTipoAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4796:1: ( rule__Funcion__TipoAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4796:2: rule__Funcion__TipoAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__TipoAssignment_0_in_rule__Funcion__Group__0__Impl9791);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4806:1: rule__Funcion__Group__1 : rule__Funcion__Group__1__Impl rule__Funcion__Group__2 ;
    public final void rule__Funcion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4810:1: ( rule__Funcion__Group__1__Impl rule__Funcion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4811:2: rule__Funcion__Group__1__Impl rule__Funcion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__1__Impl_in_rule__Funcion__Group__19821);
            rule__Funcion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__2_in_rule__Funcion__Group__19824);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4818:1: rule__Funcion__Group__1__Impl : ( 'funcion' ) ;
    public final void rule__Funcion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4822:1: ( ( 'funcion' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4823:1: ( 'funcion' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4823:1: ( 'funcion' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4824:1: 'funcion'
            {
             before(grammarAccess.getFuncionAccess().getFuncionKeyword_1()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__Funcion__Group__1__Impl9852); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4837:1: rule__Funcion__Group__2 : rule__Funcion__Group__2__Impl rule__Funcion__Group__3 ;
    public final void rule__Funcion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4841:1: ( rule__Funcion__Group__2__Impl rule__Funcion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4842:2: rule__Funcion__Group__2__Impl rule__Funcion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__2__Impl_in_rule__Funcion__Group__29883);
            rule__Funcion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__3_in_rule__Funcion__Group__29886);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4849:1: rule__Funcion__Group__2__Impl : ( ( rule__Funcion__NombreAssignment_2 ) ) ;
    public final void rule__Funcion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4853:1: ( ( ( rule__Funcion__NombreAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4854:1: ( ( rule__Funcion__NombreAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4854:1: ( ( rule__Funcion__NombreAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4855:1: ( rule__Funcion__NombreAssignment_2 )
            {
             before(grammarAccess.getFuncionAccess().getNombreAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4856:1: ( rule__Funcion__NombreAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4856:2: rule__Funcion__NombreAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__NombreAssignment_2_in_rule__Funcion__Group__2__Impl9913);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4866:1: rule__Funcion__Group__3 : rule__Funcion__Group__3__Impl rule__Funcion__Group__4 ;
    public final void rule__Funcion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4870:1: ( rule__Funcion__Group__3__Impl rule__Funcion__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4871:2: rule__Funcion__Group__3__Impl rule__Funcion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__3__Impl_in_rule__Funcion__Group__39943);
            rule__Funcion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__4_in_rule__Funcion__Group__39946);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4878:1: rule__Funcion__Group__3__Impl : ( '(' ) ;
    public final void rule__Funcion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4882:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4883:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4883:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4884:1: '('
            {
             before(grammarAccess.getFuncionAccess().getLeftParenthesisKeyword_3()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Funcion__Group__3__Impl9974); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4897:1: rule__Funcion__Group__4 : rule__Funcion__Group__4__Impl rule__Funcion__Group__5 ;
    public final void rule__Funcion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4901:1: ( rule__Funcion__Group__4__Impl rule__Funcion__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4902:2: rule__Funcion__Group__4__Impl rule__Funcion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__4__Impl_in_rule__Funcion__Group__410005);
            rule__Funcion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__5_in_rule__Funcion__Group__410008);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4909:1: rule__Funcion__Group__4__Impl : ( ( rule__Funcion__Group_4__0 )? ) ;
    public final void rule__Funcion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4913:1: ( ( ( rule__Funcion__Group_4__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4914:1: ( ( rule__Funcion__Group_4__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4914:1: ( ( rule__Funcion__Group_4__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4915:1: ( rule__Funcion__Group_4__0 )?
            {
             before(grammarAccess.getFuncionAccess().getGroup_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4916:1: ( rule__Funcion__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=14 && LA41_0<=18)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4916:2: rule__Funcion__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__0_in_rule__Funcion__Group__4__Impl10035);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4926:1: rule__Funcion__Group__5 : rule__Funcion__Group__5__Impl rule__Funcion__Group__6 ;
    public final void rule__Funcion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4930:1: ( rule__Funcion__Group__5__Impl rule__Funcion__Group__6 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4931:2: rule__Funcion__Group__5__Impl rule__Funcion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__5__Impl_in_rule__Funcion__Group__510066);
            rule__Funcion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__6_in_rule__Funcion__Group__510069);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4938:1: rule__Funcion__Group__5__Impl : ( ')' ) ;
    public final void rule__Funcion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4942:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4943:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4943:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4944:1: ')'
            {
             before(grammarAccess.getFuncionAccess().getRightParenthesisKeyword_5()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Funcion__Group__5__Impl10097); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4957:1: rule__Funcion__Group__6 : rule__Funcion__Group__6__Impl rule__Funcion__Group__7 ;
    public final void rule__Funcion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4961:1: ( rule__Funcion__Group__6__Impl rule__Funcion__Group__7 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4962:2: rule__Funcion__Group__6__Impl rule__Funcion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__6__Impl_in_rule__Funcion__Group__610128);
            rule__Funcion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__7_in_rule__Funcion__Group__610131);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4969:1: rule__Funcion__Group__6__Impl : ( 'var' ) ;
    public final void rule__Funcion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4973:1: ( ( 'var' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4974:1: ( 'var' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4974:1: ( 'var' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4975:1: 'var'
            {
             before(grammarAccess.getFuncionAccess().getVarKeyword_6()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Funcion__Group__6__Impl10159); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4988:1: rule__Funcion__Group__7 : rule__Funcion__Group__7__Impl rule__Funcion__Group__8 ;
    public final void rule__Funcion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4992:1: ( rule__Funcion__Group__7__Impl rule__Funcion__Group__8 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4993:2: rule__Funcion__Group__7__Impl rule__Funcion__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__7__Impl_in_rule__Funcion__Group__710190);
            rule__Funcion__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__8_in_rule__Funcion__Group__710193);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5000:1: rule__Funcion__Group__7__Impl : ( ( rule__Funcion__Group_7__0 )? ) ;
    public final void rule__Funcion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5004:1: ( ( ( rule__Funcion__Group_7__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5005:1: ( ( rule__Funcion__Group_7__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5005:1: ( ( rule__Funcion__Group_7__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5006:1: ( rule__Funcion__Group_7__0 )?
            {
             before(grammarAccess.getFuncionAccess().getGroup_7()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5007:1: ( rule__Funcion__Group_7__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=14 && LA42_0<=18)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5007:2: rule__Funcion__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__0_in_rule__Funcion__Group__7__Impl10220);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5017:1: rule__Funcion__Group__8 : rule__Funcion__Group__8__Impl rule__Funcion__Group__9 ;
    public final void rule__Funcion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5021:1: ( rule__Funcion__Group__8__Impl rule__Funcion__Group__9 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5022:2: rule__Funcion__Group__8__Impl rule__Funcion__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__8__Impl_in_rule__Funcion__Group__810251);
            rule__Funcion__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__9_in_rule__Funcion__Group__810254);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5029:1: rule__Funcion__Group__8__Impl : ( 'inicio' ) ;
    public final void rule__Funcion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5033:1: ( ( 'inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5034:1: ( 'inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5034:1: ( 'inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5035:1: 'inicio'
            {
             before(grammarAccess.getFuncionAccess().getInicioKeyword_8()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Funcion__Group__8__Impl10282); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5048:1: rule__Funcion__Group__9 : rule__Funcion__Group__9__Impl rule__Funcion__Group__10 ;
    public final void rule__Funcion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5052:1: ( rule__Funcion__Group__9__Impl rule__Funcion__Group__10 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5053:2: rule__Funcion__Group__9__Impl rule__Funcion__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__9__Impl_in_rule__Funcion__Group__910313);
            rule__Funcion__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__10_in_rule__Funcion__Group__910316);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5060:1: rule__Funcion__Group__9__Impl : ( ( rule__Funcion__Group_9__0 )? ) ;
    public final void rule__Funcion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5064:1: ( ( ( rule__Funcion__Group_9__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5065:1: ( ( rule__Funcion__Group_9__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5065:1: ( ( rule__Funcion__Group_9__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5066:1: ( rule__Funcion__Group_9__0 )?
            {
             before(grammarAccess.getFuncionAccess().getGroup_9()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5067:1: ( rule__Funcion__Group_9__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)||(LA43_0>=46 && LA43_0<=48)||LA43_0==51||LA43_0==54||LA43_0==56) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5067:2: rule__Funcion__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_9__0_in_rule__Funcion__Group__9__Impl10343);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5077:1: rule__Funcion__Group__10 : rule__Funcion__Group__10__Impl rule__Funcion__Group__11 ;
    public final void rule__Funcion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5081:1: ( rule__Funcion__Group__10__Impl rule__Funcion__Group__11 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5082:2: rule__Funcion__Group__10__Impl rule__Funcion__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__10__Impl_in_rule__Funcion__Group__1010374);
            rule__Funcion__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__11_in_rule__Funcion__Group__1010377);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5089:1: rule__Funcion__Group__10__Impl : ( 'devolver' ) ;
    public final void rule__Funcion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5093:1: ( ( 'devolver' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5094:1: ( 'devolver' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5094:1: ( 'devolver' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5095:1: 'devolver'
            {
             before(grammarAccess.getFuncionAccess().getDevolverKeyword_10()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__Funcion__Group__10__Impl10405); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5108:1: rule__Funcion__Group__11 : rule__Funcion__Group__11__Impl rule__Funcion__Group__12 ;
    public final void rule__Funcion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5112:1: ( rule__Funcion__Group__11__Impl rule__Funcion__Group__12 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5113:2: rule__Funcion__Group__11__Impl rule__Funcion__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__11__Impl_in_rule__Funcion__Group__1110436);
            rule__Funcion__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__12_in_rule__Funcion__Group__1110439);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5120:1: rule__Funcion__Group__11__Impl : ( ( rule__Funcion__DevuelveAssignment_11 ) ) ;
    public final void rule__Funcion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5124:1: ( ( ( rule__Funcion__DevuelveAssignment_11 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5125:1: ( ( rule__Funcion__DevuelveAssignment_11 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5125:1: ( ( rule__Funcion__DevuelveAssignment_11 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5126:1: ( rule__Funcion__DevuelveAssignment_11 )
            {
             before(grammarAccess.getFuncionAccess().getDevuelveAssignment_11()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5127:1: ( rule__Funcion__DevuelveAssignment_11 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5127:2: rule__Funcion__DevuelveAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__DevuelveAssignment_11_in_rule__Funcion__Group__11__Impl10466);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5137:1: rule__Funcion__Group__12 : rule__Funcion__Group__12__Impl ;
    public final void rule__Funcion__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5141:1: ( rule__Funcion__Group__12__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5142:2: rule__Funcion__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__12__Impl_in_rule__Funcion__Group__1210496);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5148:1: rule__Funcion__Group__12__Impl : ( 'fin_funcion' ) ;
    public final void rule__Funcion__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5152:1: ( ( 'fin_funcion' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5153:1: ( 'fin_funcion' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5153:1: ( 'fin_funcion' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5154:1: 'fin_funcion'
            {
             before(grammarAccess.getFuncionAccess().getFin_funcionKeyword_12()); 
            match(input,63,FollowSets000.FOLLOW_63_in_rule__Funcion__Group__12__Impl10524); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5193:1: rule__Funcion__Group_4__0 : rule__Funcion__Group_4__0__Impl rule__Funcion__Group_4__1 ;
    public final void rule__Funcion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5197:1: ( rule__Funcion__Group_4__0__Impl rule__Funcion__Group_4__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5198:2: rule__Funcion__Group_4__0__Impl rule__Funcion__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__0__Impl_in_rule__Funcion__Group_4__010581);
            rule__Funcion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__1_in_rule__Funcion__Group_4__010584);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5205:1: rule__Funcion__Group_4__0__Impl : ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) ) ;
    public final void rule__Funcion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5209:1: ( ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5210:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5210:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5211:1: ( rule__Funcion__ParametrofuncionAssignment_4_0 )
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionAssignment_4_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5212:1: ( rule__Funcion__ParametrofuncionAssignment_4_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5212:2: rule__Funcion__ParametrofuncionAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_0_in_rule__Funcion__Group_4__0__Impl10611);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5222:1: rule__Funcion__Group_4__1 : rule__Funcion__Group_4__1__Impl ;
    public final void rule__Funcion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5226:1: ( rule__Funcion__Group_4__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5227:2: rule__Funcion__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__1__Impl_in_rule__Funcion__Group_4__110641);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5233:1: rule__Funcion__Group_4__1__Impl : ( ( rule__Funcion__Group_4_1__0 )* ) ;
    public final void rule__Funcion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5237:1: ( ( ( rule__Funcion__Group_4_1__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5238:1: ( ( rule__Funcion__Group_4_1__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5238:1: ( ( rule__Funcion__Group_4_1__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5239:1: ( rule__Funcion__Group_4_1__0 )*
            {
             before(grammarAccess.getFuncionAccess().getGroup_4_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5240:1: ( rule__Funcion__Group_4_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==42) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5240:2: rule__Funcion__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__0_in_rule__Funcion__Group_4__1__Impl10668);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5254:1: rule__Funcion__Group_4_1__0 : rule__Funcion__Group_4_1__0__Impl rule__Funcion__Group_4_1__1 ;
    public final void rule__Funcion__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5258:1: ( rule__Funcion__Group_4_1__0__Impl rule__Funcion__Group_4_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5259:2: rule__Funcion__Group_4_1__0__Impl rule__Funcion__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__0__Impl_in_rule__Funcion__Group_4_1__010703);
            rule__Funcion__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__1_in_rule__Funcion__Group_4_1__010706);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5266:1: rule__Funcion__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Funcion__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5270:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5271:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5271:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5272:1: ','
            {
             before(grammarAccess.getFuncionAccess().getCommaKeyword_4_1_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Funcion__Group_4_1__0__Impl10734); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5285:1: rule__Funcion__Group_4_1__1 : rule__Funcion__Group_4_1__1__Impl ;
    public final void rule__Funcion__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5289:1: ( rule__Funcion__Group_4_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5290:2: rule__Funcion__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__1__Impl_in_rule__Funcion__Group_4_1__110765);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5296:1: rule__Funcion__Group_4_1__1__Impl : ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) ) ;
    public final void rule__Funcion__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5300:1: ( ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5301:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5301:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5302:1: ( rule__Funcion__ParametrofuncionAssignment_4_1_1 )
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionAssignment_4_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5303:1: ( rule__Funcion__ParametrofuncionAssignment_4_1_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5303:2: rule__Funcion__ParametrofuncionAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_1_1_in_rule__Funcion__Group_4_1__1__Impl10792);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5317:1: rule__Funcion__Group_7__0 : rule__Funcion__Group_7__0__Impl rule__Funcion__Group_7__1 ;
    public final void rule__Funcion__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5321:1: ( rule__Funcion__Group_7__0__Impl rule__Funcion__Group_7__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5322:2: rule__Funcion__Group_7__0__Impl rule__Funcion__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__0__Impl_in_rule__Funcion__Group_7__010826);
            rule__Funcion__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__1_in_rule__Funcion__Group_7__010829);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5329:1: rule__Funcion__Group_7__0__Impl : ( ( rule__Funcion__DeclaracionvariableAssignment_7_0 ) ) ;
    public final void rule__Funcion__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5333:1: ( ( ( rule__Funcion__DeclaracionvariableAssignment_7_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5334:1: ( ( rule__Funcion__DeclaracionvariableAssignment_7_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5334:1: ( ( rule__Funcion__DeclaracionvariableAssignment_7_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5335:1: ( rule__Funcion__DeclaracionvariableAssignment_7_0 )
            {
             before(grammarAccess.getFuncionAccess().getDeclaracionvariableAssignment_7_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5336:1: ( rule__Funcion__DeclaracionvariableAssignment_7_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5336:2: rule__Funcion__DeclaracionvariableAssignment_7_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__DeclaracionvariableAssignment_7_0_in_rule__Funcion__Group_7__0__Impl10856);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5346:1: rule__Funcion__Group_7__1 : rule__Funcion__Group_7__1__Impl ;
    public final void rule__Funcion__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5350:1: ( rule__Funcion__Group_7__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5351:2: rule__Funcion__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__1__Impl_in_rule__Funcion__Group_7__110886);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5357:1: rule__Funcion__Group_7__1__Impl : ( ( rule__Funcion__DeclaracionvariableAssignment_7_1 )* ) ;
    public final void rule__Funcion__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5361:1: ( ( ( rule__Funcion__DeclaracionvariableAssignment_7_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5362:1: ( ( rule__Funcion__DeclaracionvariableAssignment_7_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5362:1: ( ( rule__Funcion__DeclaracionvariableAssignment_7_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5363:1: ( rule__Funcion__DeclaracionvariableAssignment_7_1 )*
            {
             before(grammarAccess.getFuncionAccess().getDeclaracionvariableAssignment_7_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5364:1: ( rule__Funcion__DeclaracionvariableAssignment_7_1 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=14 && LA45_0<=18)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5364:2: rule__Funcion__DeclaracionvariableAssignment_7_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Funcion__DeclaracionvariableAssignment_7_1_in_rule__Funcion__Group_7__1__Impl10913);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5378:1: rule__Funcion__Group_9__0 : rule__Funcion__Group_9__0__Impl rule__Funcion__Group_9__1 ;
    public final void rule__Funcion__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5382:1: ( rule__Funcion__Group_9__0__Impl rule__Funcion__Group_9__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5383:2: rule__Funcion__Group_9__0__Impl rule__Funcion__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_9__0__Impl_in_rule__Funcion__Group_9__010948);
            rule__Funcion__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_9__1_in_rule__Funcion__Group_9__010951);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5390:1: rule__Funcion__Group_9__0__Impl : ( ( rule__Funcion__SentenciasAssignment_9_0 ) ) ;
    public final void rule__Funcion__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5394:1: ( ( ( rule__Funcion__SentenciasAssignment_9_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5395:1: ( ( rule__Funcion__SentenciasAssignment_9_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5395:1: ( ( rule__Funcion__SentenciasAssignment_9_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5396:1: ( rule__Funcion__SentenciasAssignment_9_0 )
            {
             before(grammarAccess.getFuncionAccess().getSentenciasAssignment_9_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5397:1: ( rule__Funcion__SentenciasAssignment_9_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5397:2: rule__Funcion__SentenciasAssignment_9_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__SentenciasAssignment_9_0_in_rule__Funcion__Group_9__0__Impl10978);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5407:1: rule__Funcion__Group_9__1 : rule__Funcion__Group_9__1__Impl ;
    public final void rule__Funcion__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5411:1: ( rule__Funcion__Group_9__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5412:2: rule__Funcion__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_9__1__Impl_in_rule__Funcion__Group_9__111008);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5418:1: rule__Funcion__Group_9__1__Impl : ( ( rule__Funcion__SentenciasAssignment_9_1 )* ) ;
    public final void rule__Funcion__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5422:1: ( ( ( rule__Funcion__SentenciasAssignment_9_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5423:1: ( ( rule__Funcion__SentenciasAssignment_9_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5423:1: ( ( rule__Funcion__SentenciasAssignment_9_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5424:1: ( rule__Funcion__SentenciasAssignment_9_1 )*
            {
             before(grammarAccess.getFuncionAccess().getSentenciasAssignment_9_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5425:1: ( rule__Funcion__SentenciasAssignment_9_1 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_STRING && LA46_0<=RULE_ID)||(LA46_0>=46 && LA46_0<=48)||LA46_0==51||LA46_0==54||LA46_0==56) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5425:2: rule__Funcion__SentenciasAssignment_9_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Funcion__SentenciasAssignment_9_1_in_rule__Funcion__Group_9__1__Impl11035);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5439:1: rule__Procedimiento__Group__0 : rule__Procedimiento__Group__0__Impl rule__Procedimiento__Group__1 ;
    public final void rule__Procedimiento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5443:1: ( rule__Procedimiento__Group__0__Impl rule__Procedimiento__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5444:2: rule__Procedimiento__Group__0__Impl rule__Procedimiento__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__0__Impl_in_rule__Procedimiento__Group__011070);
            rule__Procedimiento__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__1_in_rule__Procedimiento__Group__011073);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5451:1: rule__Procedimiento__Group__0__Impl : ( 'procedimiento' ) ;
    public final void rule__Procedimiento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5455:1: ( ( 'procedimiento' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5456:1: ( 'procedimiento' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5456:1: ( 'procedimiento' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5457:1: 'procedimiento'
            {
             before(grammarAccess.getProcedimientoAccess().getProcedimientoKeyword_0()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__Procedimiento__Group__0__Impl11101); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5470:1: rule__Procedimiento__Group__1 : rule__Procedimiento__Group__1__Impl rule__Procedimiento__Group__2 ;
    public final void rule__Procedimiento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5474:1: ( rule__Procedimiento__Group__1__Impl rule__Procedimiento__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5475:2: rule__Procedimiento__Group__1__Impl rule__Procedimiento__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__1__Impl_in_rule__Procedimiento__Group__111132);
            rule__Procedimiento__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__2_in_rule__Procedimiento__Group__111135);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5482:1: rule__Procedimiento__Group__1__Impl : ( ( rule__Procedimiento__NombreAssignment_1 ) ) ;
    public final void rule__Procedimiento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5486:1: ( ( ( rule__Procedimiento__NombreAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5487:1: ( ( rule__Procedimiento__NombreAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5487:1: ( ( rule__Procedimiento__NombreAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5488:1: ( rule__Procedimiento__NombreAssignment_1 )
            {
             before(grammarAccess.getProcedimientoAccess().getNombreAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5489:1: ( rule__Procedimiento__NombreAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5489:2: rule__Procedimiento__NombreAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__NombreAssignment_1_in_rule__Procedimiento__Group__1__Impl11162);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5499:1: rule__Procedimiento__Group__2 : rule__Procedimiento__Group__2__Impl rule__Procedimiento__Group__3 ;
    public final void rule__Procedimiento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5503:1: ( rule__Procedimiento__Group__2__Impl rule__Procedimiento__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5504:2: rule__Procedimiento__Group__2__Impl rule__Procedimiento__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__2__Impl_in_rule__Procedimiento__Group__211192);
            rule__Procedimiento__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__3_in_rule__Procedimiento__Group__211195);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5511:1: rule__Procedimiento__Group__2__Impl : ( '(' ) ;
    public final void rule__Procedimiento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5515:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5516:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5516:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5517:1: '('
            {
             before(grammarAccess.getProcedimientoAccess().getLeftParenthesisKeyword_2()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Procedimiento__Group__2__Impl11223); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5530:1: rule__Procedimiento__Group__3 : rule__Procedimiento__Group__3__Impl rule__Procedimiento__Group__4 ;
    public final void rule__Procedimiento__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5534:1: ( rule__Procedimiento__Group__3__Impl rule__Procedimiento__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5535:2: rule__Procedimiento__Group__3__Impl rule__Procedimiento__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__3__Impl_in_rule__Procedimiento__Group__311254);
            rule__Procedimiento__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__4_in_rule__Procedimiento__Group__311257);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5542:1: rule__Procedimiento__Group__3__Impl : ( ( rule__Procedimiento__Group_3__0 )? ) ;
    public final void rule__Procedimiento__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5546:1: ( ( ( rule__Procedimiento__Group_3__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5547:1: ( ( rule__Procedimiento__Group_3__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5547:1: ( ( rule__Procedimiento__Group_3__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5548:1: ( rule__Procedimiento__Group_3__0 )?
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5549:1: ( rule__Procedimiento__Group_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=14 && LA47_0<=18)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5549:2: rule__Procedimiento__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__0_in_rule__Procedimiento__Group__3__Impl11284);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5559:1: rule__Procedimiento__Group__4 : rule__Procedimiento__Group__4__Impl rule__Procedimiento__Group__5 ;
    public final void rule__Procedimiento__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5563:1: ( rule__Procedimiento__Group__4__Impl rule__Procedimiento__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5564:2: rule__Procedimiento__Group__4__Impl rule__Procedimiento__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__4__Impl_in_rule__Procedimiento__Group__411315);
            rule__Procedimiento__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__5_in_rule__Procedimiento__Group__411318);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5571:1: rule__Procedimiento__Group__4__Impl : ( ')' ) ;
    public final void rule__Procedimiento__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5575:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5576:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5576:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5577:1: ')'
            {
             before(grammarAccess.getProcedimientoAccess().getRightParenthesisKeyword_4()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Procedimiento__Group__4__Impl11346); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5590:1: rule__Procedimiento__Group__5 : rule__Procedimiento__Group__5__Impl rule__Procedimiento__Group__6 ;
    public final void rule__Procedimiento__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5594:1: ( rule__Procedimiento__Group__5__Impl rule__Procedimiento__Group__6 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5595:2: rule__Procedimiento__Group__5__Impl rule__Procedimiento__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__5__Impl_in_rule__Procedimiento__Group__511377);
            rule__Procedimiento__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__6_in_rule__Procedimiento__Group__511380);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5602:1: rule__Procedimiento__Group__5__Impl : ( 'var' ) ;
    public final void rule__Procedimiento__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5606:1: ( ( 'var' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5607:1: ( 'var' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5607:1: ( 'var' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5608:1: 'var'
            {
             before(grammarAccess.getProcedimientoAccess().getVarKeyword_5()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Procedimiento__Group__5__Impl11408); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5621:1: rule__Procedimiento__Group__6 : rule__Procedimiento__Group__6__Impl rule__Procedimiento__Group__7 ;
    public final void rule__Procedimiento__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5625:1: ( rule__Procedimiento__Group__6__Impl rule__Procedimiento__Group__7 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5626:2: rule__Procedimiento__Group__6__Impl rule__Procedimiento__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__6__Impl_in_rule__Procedimiento__Group__611439);
            rule__Procedimiento__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__7_in_rule__Procedimiento__Group__611442);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5633:1: rule__Procedimiento__Group__6__Impl : ( ( rule__Procedimiento__Group_6__0 )? ) ;
    public final void rule__Procedimiento__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5637:1: ( ( ( rule__Procedimiento__Group_6__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5638:1: ( ( rule__Procedimiento__Group_6__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5638:1: ( ( rule__Procedimiento__Group_6__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5639:1: ( rule__Procedimiento__Group_6__0 )?
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_6()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5640:1: ( rule__Procedimiento__Group_6__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=14 && LA48_0<=18)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5640:2: rule__Procedimiento__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_6__0_in_rule__Procedimiento__Group__6__Impl11469);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5650:1: rule__Procedimiento__Group__7 : rule__Procedimiento__Group__7__Impl rule__Procedimiento__Group__8 ;
    public final void rule__Procedimiento__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5654:1: ( rule__Procedimiento__Group__7__Impl rule__Procedimiento__Group__8 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5655:2: rule__Procedimiento__Group__7__Impl rule__Procedimiento__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__7__Impl_in_rule__Procedimiento__Group__711500);
            rule__Procedimiento__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__8_in_rule__Procedimiento__Group__711503);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5662:1: rule__Procedimiento__Group__7__Impl : ( 'inicio' ) ;
    public final void rule__Procedimiento__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5666:1: ( ( 'inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5667:1: ( 'inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5667:1: ( 'inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5668:1: 'inicio'
            {
             before(grammarAccess.getProcedimientoAccess().getInicioKeyword_7()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Procedimiento__Group__7__Impl11531); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5681:1: rule__Procedimiento__Group__8 : rule__Procedimiento__Group__8__Impl rule__Procedimiento__Group__9 ;
    public final void rule__Procedimiento__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5685:1: ( rule__Procedimiento__Group__8__Impl rule__Procedimiento__Group__9 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5686:2: rule__Procedimiento__Group__8__Impl rule__Procedimiento__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__8__Impl_in_rule__Procedimiento__Group__811562);
            rule__Procedimiento__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__9_in_rule__Procedimiento__Group__811565);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5693:1: rule__Procedimiento__Group__8__Impl : ( ( rule__Procedimiento__Group_8__0 )? ) ;
    public final void rule__Procedimiento__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5697:1: ( ( ( rule__Procedimiento__Group_8__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5698:1: ( ( rule__Procedimiento__Group_8__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5698:1: ( ( rule__Procedimiento__Group_8__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5699:1: ( rule__Procedimiento__Group_8__0 )?
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_8()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5700:1: ( rule__Procedimiento__Group_8__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_ID)||(LA49_0>=46 && LA49_0<=48)||LA49_0==51||LA49_0==54||LA49_0==56) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5700:2: rule__Procedimiento__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_8__0_in_rule__Procedimiento__Group__8__Impl11592);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5710:1: rule__Procedimiento__Group__9 : rule__Procedimiento__Group__9__Impl ;
    public final void rule__Procedimiento__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5714:1: ( rule__Procedimiento__Group__9__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5715:2: rule__Procedimiento__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__9__Impl_in_rule__Procedimiento__Group__911623);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5721:1: rule__Procedimiento__Group__9__Impl : ( 'fin_procedimiento' ) ;
    public final void rule__Procedimiento__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5725:1: ( ( 'fin_procedimiento' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5726:1: ( 'fin_procedimiento' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5726:1: ( 'fin_procedimiento' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5727:1: 'fin_procedimiento'
            {
             before(grammarAccess.getProcedimientoAccess().getFin_procedimientoKeyword_9()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__Procedimiento__Group__9__Impl11651); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5760:1: rule__Procedimiento__Group_3__0 : rule__Procedimiento__Group_3__0__Impl rule__Procedimiento__Group_3__1 ;
    public final void rule__Procedimiento__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5764:1: ( rule__Procedimiento__Group_3__0__Impl rule__Procedimiento__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5765:2: rule__Procedimiento__Group_3__0__Impl rule__Procedimiento__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__0__Impl_in_rule__Procedimiento__Group_3__011702);
            rule__Procedimiento__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__1_in_rule__Procedimiento__Group_3__011705);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5772:1: rule__Procedimiento__Group_3__0__Impl : ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) ) ;
    public final void rule__Procedimiento__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5776:1: ( ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5777:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5777:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5778:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_0 )
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionAssignment_3_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5779:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5779:2: rule__Procedimiento__ParametrofuncionAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_0_in_rule__Procedimiento__Group_3__0__Impl11732);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5789:1: rule__Procedimiento__Group_3__1 : rule__Procedimiento__Group_3__1__Impl ;
    public final void rule__Procedimiento__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5793:1: ( rule__Procedimiento__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5794:2: rule__Procedimiento__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__1__Impl_in_rule__Procedimiento__Group_3__111762);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5800:1: rule__Procedimiento__Group_3__1__Impl : ( ( rule__Procedimiento__Group_3_1__0 )* ) ;
    public final void rule__Procedimiento__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5804:1: ( ( ( rule__Procedimiento__Group_3_1__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5805:1: ( ( rule__Procedimiento__Group_3_1__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5805:1: ( ( rule__Procedimiento__Group_3_1__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5806:1: ( rule__Procedimiento__Group_3_1__0 )*
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5807:1: ( rule__Procedimiento__Group_3_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==42) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5807:2: rule__Procedimiento__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__0_in_rule__Procedimiento__Group_3__1__Impl11789);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5821:1: rule__Procedimiento__Group_3_1__0 : rule__Procedimiento__Group_3_1__0__Impl rule__Procedimiento__Group_3_1__1 ;
    public final void rule__Procedimiento__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5825:1: ( rule__Procedimiento__Group_3_1__0__Impl rule__Procedimiento__Group_3_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5826:2: rule__Procedimiento__Group_3_1__0__Impl rule__Procedimiento__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__0__Impl_in_rule__Procedimiento__Group_3_1__011824);
            rule__Procedimiento__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__1_in_rule__Procedimiento__Group_3_1__011827);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5833:1: rule__Procedimiento__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Procedimiento__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5837:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5838:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5838:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5839:1: ','
            {
             before(grammarAccess.getProcedimientoAccess().getCommaKeyword_3_1_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Procedimiento__Group_3_1__0__Impl11855); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5852:1: rule__Procedimiento__Group_3_1__1 : rule__Procedimiento__Group_3_1__1__Impl ;
    public final void rule__Procedimiento__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5856:1: ( rule__Procedimiento__Group_3_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5857:2: rule__Procedimiento__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__1__Impl_in_rule__Procedimiento__Group_3_1__111886);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5863:1: rule__Procedimiento__Group_3_1__1__Impl : ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) ) ;
    public final void rule__Procedimiento__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5867:1: ( ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5868:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5868:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5869:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 )
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionAssignment_3_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5870:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5870:2: rule__Procedimiento__ParametrofuncionAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_1_1_in_rule__Procedimiento__Group_3_1__1__Impl11913);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5884:1: rule__Procedimiento__Group_6__0 : rule__Procedimiento__Group_6__0__Impl rule__Procedimiento__Group_6__1 ;
    public final void rule__Procedimiento__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5888:1: ( rule__Procedimiento__Group_6__0__Impl rule__Procedimiento__Group_6__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5889:2: rule__Procedimiento__Group_6__0__Impl rule__Procedimiento__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_6__0__Impl_in_rule__Procedimiento__Group_6__011947);
            rule__Procedimiento__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_6__1_in_rule__Procedimiento__Group_6__011950);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5896:1: rule__Procedimiento__Group_6__0__Impl : ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 ) ) ;
    public final void rule__Procedimiento__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5900:1: ( ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5901:1: ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5901:1: ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5902:1: ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 )
            {
             before(grammarAccess.getProcedimientoAccess().getDeclaracionvariableAssignment_6_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5903:1: ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5903:2: rule__Procedimiento__DeclaracionvariableAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__DeclaracionvariableAssignment_6_0_in_rule__Procedimiento__Group_6__0__Impl11977);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5913:1: rule__Procedimiento__Group_6__1 : rule__Procedimiento__Group_6__1__Impl ;
    public final void rule__Procedimiento__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5917:1: ( rule__Procedimiento__Group_6__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5918:2: rule__Procedimiento__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_6__1__Impl_in_rule__Procedimiento__Group_6__112007);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5924:1: rule__Procedimiento__Group_6__1__Impl : ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )* ) ;
    public final void rule__Procedimiento__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5928:1: ( ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5929:1: ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5929:1: ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5930:1: ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )*
            {
             before(grammarAccess.getProcedimientoAccess().getDeclaracionvariableAssignment_6_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5931:1: ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=14 && LA51_0<=18)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5931:2: rule__Procedimiento__DeclaracionvariableAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__DeclaracionvariableAssignment_6_1_in_rule__Procedimiento__Group_6__1__Impl12034);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5945:1: rule__Procedimiento__Group_8__0 : rule__Procedimiento__Group_8__0__Impl rule__Procedimiento__Group_8__1 ;
    public final void rule__Procedimiento__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5949:1: ( rule__Procedimiento__Group_8__0__Impl rule__Procedimiento__Group_8__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5950:2: rule__Procedimiento__Group_8__0__Impl rule__Procedimiento__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_8__0__Impl_in_rule__Procedimiento__Group_8__012069);
            rule__Procedimiento__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_8__1_in_rule__Procedimiento__Group_8__012072);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5957:1: rule__Procedimiento__Group_8__0__Impl : ( ( rule__Procedimiento__SentenciasAssignment_8_0 ) ) ;
    public final void rule__Procedimiento__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5961:1: ( ( ( rule__Procedimiento__SentenciasAssignment_8_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5962:1: ( ( rule__Procedimiento__SentenciasAssignment_8_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5962:1: ( ( rule__Procedimiento__SentenciasAssignment_8_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5963:1: ( rule__Procedimiento__SentenciasAssignment_8_0 )
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasAssignment_8_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5964:1: ( rule__Procedimiento__SentenciasAssignment_8_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5964:2: rule__Procedimiento__SentenciasAssignment_8_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__SentenciasAssignment_8_0_in_rule__Procedimiento__Group_8__0__Impl12099);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5974:1: rule__Procedimiento__Group_8__1 : rule__Procedimiento__Group_8__1__Impl ;
    public final void rule__Procedimiento__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5978:1: ( rule__Procedimiento__Group_8__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5979:2: rule__Procedimiento__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_8__1__Impl_in_rule__Procedimiento__Group_8__112129);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5985:1: rule__Procedimiento__Group_8__1__Impl : ( ( rule__Procedimiento__SentenciasAssignment_8_1 )* ) ;
    public final void rule__Procedimiento__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5989:1: ( ( ( rule__Procedimiento__SentenciasAssignment_8_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5990:1: ( ( rule__Procedimiento__SentenciasAssignment_8_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5990:1: ( ( rule__Procedimiento__SentenciasAssignment_8_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5991:1: ( rule__Procedimiento__SentenciasAssignment_8_1 )*
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasAssignment_8_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5992:1: ( rule__Procedimiento__SentenciasAssignment_8_1 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)||(LA52_0>=46 && LA52_0<=48)||LA52_0==51||LA52_0==54||LA52_0==56) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5992:2: rule__Procedimiento__SentenciasAssignment_8_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__SentenciasAssignment_8_1_in_rule__Procedimiento__Group_8__1__Impl12156);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6007:1: rule__Codigo__FuncionAssignment_0_0 : ( ruleSubproceso ) ;
    public final void rule__Codigo__FuncionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6011:1: ( ( ruleSubproceso ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6012:1: ( ruleSubproceso )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6012:1: ( ruleSubproceso )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6013:1: ruleSubproceso
            {
             before(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_0_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_012196);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6022:1: rule__Codigo__FuncionAssignment_0_1 : ( ruleSubproceso ) ;
    public final void rule__Codigo__FuncionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6026:1: ( ( ruleSubproceso ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6027:1: ( ruleSubproceso )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6027:1: ( ruleSubproceso )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6028:1: ruleSubproceso
            {
             before(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_112227);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6037:1: rule__Codigo__TieneAssignment_1 : ( ruleInicio ) ;
    public final void rule__Codigo__TieneAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6041:1: ( ( ruleInicio ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6042:1: ( ruleInicio )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6042:1: ( ruleInicio )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6043:1: ruleInicio
            {
             before(grammarAccess.getCodigoAccess().getTieneInicioParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_rule__Codigo__TieneAssignment_112258);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6052:1: rule__Caracter__ContenidoAssignment : ( RULE_CAR ) ;
    public final void rule__Caracter__ContenidoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6056:1: ( ( RULE_CAR ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6057:1: ( RULE_CAR )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6057:1: ( RULE_CAR )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6058:1: RULE_CAR
            {
             before(grammarAccess.getCaracterAccess().getContenidoCARTerminalRuleCall_0()); 
            match(input,RULE_CAR,FollowSets000.FOLLOW_RULE_CAR_in_rule__Caracter__ContenidoAssignment12289); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6067:1: rule__Inicio__DeclaracionvariableAssignment_2_0 : ( ruleDeclaracionVariable ) ;
    public final void rule__Inicio__DeclaracionvariableAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6071:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6072:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6072:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6073:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getInicioAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Inicio__DeclaracionvariableAssignment_2_012320);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6082:1: rule__Inicio__DeclaracionvariableAssignment_2_1 : ( ruleDeclaracionVariable ) ;
    public final void rule__Inicio__DeclaracionvariableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6086:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6087:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6087:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6088:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getInicioAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Inicio__DeclaracionvariableAssignment_2_112351);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6097:1: rule__Inicio__TieneAssignment_4_0 : ( ruleSentencias ) ;
    public final void rule__Inicio__TieneAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6101:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6102:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6102:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6103:1: ruleSentencias
            {
             before(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_4_012382);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6112:1: rule__Inicio__TieneAssignment_4_1 : ( ruleSentencias ) ;
    public final void rule__Inicio__TieneAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6116:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6117:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6117:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6118:1: ruleSentencias
            {
             before(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_4_112413);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6127:1: rule__DeclaracionVariable__TipoAssignment_0 : ( ruleTipoVariable ) ;
    public final void rule__DeclaracionVariable__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6131:1: ( ( ruleTipoVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6132:1: ( ruleTipoVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6132:1: ( ruleTipoVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6133:1: ruleTipoVariable
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_rule__DeclaracionVariable__TipoAssignment_012444);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6142:1: rule__DeclaracionVariable__TieneIDsAssignment_1 : ( ruleVariable ) ;
    public final void rule__DeclaracionVariable__TieneIDsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6146:1: ( ( ruleVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6147:1: ( ruleVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6147:1: ( ruleVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6148:1: ruleVariable
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsVariableParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_112475);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6157:1: rule__DeclaracionVariable__TieneIDsAssignment_2_1 : ( ruleVariable ) ;
    public final void rule__DeclaracionVariable__TieneIDsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6161:1: ( ( ruleVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6162:1: ( ruleVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6162:1: ( ruleVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6163:1: ruleVariable
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsVariableParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_2_112506);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6172:1: rule__LlamadaFuncion__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__LlamadaFuncion__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6176:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6177:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6177:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6178:1: ruleEString
            {
             before(grammarAccess.getLlamadaFuncionAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__LlamadaFuncion__NombreAssignment_012537);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6187:1: rule__LlamadaFuncion__OperadorAssignment_2_0 : ( ruleOperador ) ;
    public final void rule__LlamadaFuncion__OperadorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6191:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6192:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6192:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6193:1: ruleOperador
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorOperadorParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_012568);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6202:1: rule__LlamadaFuncion__OperadorAssignment_2_1_1 : ( ruleOperador ) ;
    public final void rule__LlamadaFuncion__OperadorAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6206:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6207:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6207:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6208:1: ruleOperador
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorOperadorParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_1_112599);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6217:1: rule__Asignacion__LvalueAssignment_0 : ( ruleEString ) ;
    public final void rule__Asignacion__LvalueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6221:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6222:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6222:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6223:1: ruleEString
            {
             before(grammarAccess.getAsignacionAccess().getLvalueEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Asignacion__LvalueAssignment_012630);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6232:1: rule__Asignacion__MatAssignment_1 : ( RULE_MATRIZ ) ;
    public final void rule__Asignacion__MatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6236:1: ( ( RULE_MATRIZ ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6237:1: ( RULE_MATRIZ )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6237:1: ( RULE_MATRIZ )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6238:1: RULE_MATRIZ
            {
             before(grammarAccess.getAsignacionAccess().getMatMATRIZTerminalRuleCall_1_0()); 
            match(input,RULE_MATRIZ,FollowSets000.FOLLOW_RULE_MATRIZ_in_rule__Asignacion__MatAssignment_112661); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6247:1: rule__Asignacion__OperadorAssignment_3 : ( rulevalor ) ;
    public final void rule__Asignacion__OperadorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6251:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6252:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6252:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6253:1: rulevalor
            {
             before(grammarAccess.getAsignacionAccess().getOperadorValorParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Asignacion__OperadorAssignment_312692);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6262:1: rule__Escribir__OperadorAssignment_2 : ( ruleOperador ) ;
    public final void rule__Escribir__OperadorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6266:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6267:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6267:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6268:1: ruleOperador
            {
             before(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_212723);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6277:1: rule__Escribir__OperadorAssignment_3_1 : ( ruleOperador ) ;
    public final void rule__Escribir__OperadorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6281:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6282:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6282:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6283:1: ruleOperador
            {
             before(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_3_112754);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6292:1: rule__Leer__VariableAssignment_2 : ( ruleVariableID ) ;
    public final void rule__Leer__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6296:1: ( ( ruleVariableID ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6297:1: ( ruleVariableID )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6297:1: ( ruleVariableID )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6298:1: ruleVariableID
            {
             before(grammarAccess.getLeerAccess().getVariableVariableIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__Leer__VariableAssignment_212785);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6307:1: rule__Si__ValorAssignment_1 : ( rulevalor ) ;
    public final void rule__Si__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6311:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6312:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6312:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6313:1: rulevalor
            {
             before(grammarAccess.getSiAccess().getValorValorParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Si__ValorAssignment_112816);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6322:1: rule__Si__SentenciasAssignment_3_0 : ( ruleSentencias ) ;
    public final void rule__Si__SentenciasAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6326:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6327:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6327:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6328:1: ruleSentencias
            {
             before(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_012847);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6337:1: rule__Si__SentenciasAssignment_3_1 : ( ruleSentencias ) ;
    public final void rule__Si__SentenciasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6341:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6342:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6342:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6343:1: ruleSentencias
            {
             before(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_112878);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6352:1: rule__Si__SinoAssignment_4 : ( ruleSino ) ;
    public final void rule__Si__SinoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6356:1: ( ( ruleSino ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6357:1: ( ruleSino )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6357:1: ( ruleSino )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6358:1: ruleSino
            {
             before(grammarAccess.getSiAccess().getSinoSinoParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSino_in_rule__Si__SinoAssignment_412909);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6367:1: rule__Mientras__ValorAssignment_1 : ( rulevalor ) ;
    public final void rule__Mientras__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6371:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6372:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6372:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6373:1: rulevalor
            {
             before(grammarAccess.getMientrasAccess().getValorValorParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Mientras__ValorAssignment_112940);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6382:1: rule__Mientras__SentenciasAssignment_3_0 : ( ruleSentencias ) ;
    public final void rule__Mientras__SentenciasAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6386:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6387:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6387:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6388:1: ruleSentencias
            {
             before(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_012971);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6397:1: rule__Mientras__SentenciasAssignment_3_1 : ( ruleSentencias ) ;
    public final void rule__Mientras__SentenciasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6401:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6402:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6402:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6403:1: ruleSentencias
            {
             before(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_113002);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6412:1: rule__Repetir__SentenciasAssignment_1_0 : ( ruleSentencias ) ;
    public final void rule__Repetir__SentenciasAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6416:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6417:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6417:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6418:1: ruleSentencias
            {
             before(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_013033);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6427:1: rule__Repetir__SentenciasAssignment_1_1 : ( ruleSentencias ) ;
    public final void rule__Repetir__SentenciasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6431:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6432:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6432:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6433:1: ruleSentencias
            {
             before(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_113064);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6442:1: rule__Repetir__ValorAssignment_3 : ( rulevalor ) ;
    public final void rule__Repetir__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6446:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6447:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6447:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6448:1: rulevalor
            {
             before(grammarAccess.getRepetirAccess().getValorValorParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Repetir__ValorAssignment_313095);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6457:1: rule__Desde__AsignacionAssignment_1 : ( ruleAsignacion ) ;
    public final void rule__Desde__AsignacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6461:1: ( ( ruleAsignacion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6462:1: ( ruleAsignacion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6462:1: ( ruleAsignacion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6463:1: ruleAsignacion
            {
             before(grammarAccess.getDesdeAccess().getAsignacionAsignacionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_rule__Desde__AsignacionAssignment_113126);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6472:1: rule__Desde__ValorAssignment_3 : ( rulevalor ) ;
    public final void rule__Desde__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6476:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6477:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6477:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6478:1: rulevalor
            {
             before(grammarAccess.getDesdeAccess().getValorValorParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Desde__ValorAssignment_313157);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6487:1: rule__Desde__SentenciasAssignment_5_0 : ( ruleSentencias ) ;
    public final void rule__Desde__SentenciasAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6491:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6492:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6492:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6493:1: ruleSentencias
            {
             before(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_013188);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6502:1: rule__Desde__SentenciasAssignment_5_1 : ( ruleSentencias ) ;
    public final void rule__Desde__SentenciasAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6506:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6507:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6507:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6508:1: ruleSentencias
            {
             before(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_113219);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6517:1: rule__Incremento__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__Incremento__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6521:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6522:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6522:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6523:1: ruleEString
            {
             before(grammarAccess.getIncrementoAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Incremento__NombreAssignment_013250);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6532:1: rule__Incremento__SsignoAssignment_1 : ( ruleinc ) ;
    public final void rule__Incremento__SsignoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6536:1: ( ( ruleinc ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6537:1: ( ruleinc )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6537:1: ( ruleinc )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6538:1: ruleinc
            {
             before(grammarAccess.getIncrementoAccess().getSsignoIncParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_rule__Incremento__SsignoAssignment_113281);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6547:1: rule__Variable__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__Variable__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6551:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6552:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6552:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6553:1: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Variable__NombreAssignment_013312);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6562:1: rule__Variable__MatAssignment_1 : ( RULE_MATRIZ ) ;
    public final void rule__Variable__MatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6566:1: ( ( RULE_MATRIZ ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6567:1: ( RULE_MATRIZ )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6567:1: ( RULE_MATRIZ )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6568:1: RULE_MATRIZ
            {
             before(grammarAccess.getVariableAccess().getMatMATRIZTerminalRuleCall_1_0()); 
            match(input,RULE_MATRIZ,FollowSets000.FOLLOW_RULE_MATRIZ_in_rule__Variable__MatAssignment_113343); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6577:1: rule__VariableID__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__VariableID__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6581:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6582:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6582:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6583:1: ruleEString
            {
             before(grammarAccess.getVariableIDAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VariableID__NombreAssignment_013374);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6592:1: rule__VariableID__MatAssignment_1 : ( RULE_MATRIZ ) ;
    public final void rule__VariableID__MatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6596:1: ( ( RULE_MATRIZ ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6597:1: ( RULE_MATRIZ )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6597:1: ( RULE_MATRIZ )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6598:1: RULE_MATRIZ
            {
             before(grammarAccess.getVariableIDAccess().getMatMATRIZTerminalRuleCall_1_0()); 
            match(input,RULE_MATRIZ,FollowSets000.FOLLOW_RULE_MATRIZ_in_rule__VariableID__MatAssignment_113405); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6607:1: rule__ConstCadena__ContenidoAssignment : ( RULE_CAD ) ;
    public final void rule__ConstCadena__ContenidoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6611:1: ( ( RULE_CAD ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6612:1: ( RULE_CAD )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6612:1: ( RULE_CAD )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6613:1: RULE_CAD
            {
             before(grammarAccess.getConstCadenaAccess().getContenidoCADTerminalRuleCall_0()); 
            match(input,RULE_CAD,FollowSets000.FOLLOW_RULE_CAD_in_rule__ConstCadena__ContenidoAssignment13436); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6622:1: rule__NumeroEntero__ValorAssignment : ( ruleEInt ) ;
    public final void rule__NumeroEntero__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6626:1: ( ( ruleEInt ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6627:1: ( ruleEInt )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6627:1: ( ruleEInt )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6628:1: ruleEInt
            {
             before(grammarAccess.getNumeroEnteroAccess().getValorEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__NumeroEntero__ValorAssignment13467);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6637:1: rule__NumeroDecimal__ValorAssignment : ( ruleEFloat ) ;
    public final void rule__NumeroDecimal__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6641:1: ( ( ruleEFloat ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6642:1: ( ruleEFloat )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6642:1: ( ruleEFloat )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6643:1: ruleEFloat
            {
             before(grammarAccess.getNumeroDecimalAccess().getValorEFloatParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rule__NumeroDecimal__ValorAssignment13498);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6652:1: rule__ValorBooleano__ValorAssignment : ( rulebooleano ) ;
    public final void rule__ValorBooleano__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6656:1: ( ( rulebooleano ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6657:1: ( rulebooleano )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6657:1: ( rulebooleano )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6658:1: rulebooleano
            {
             before(grammarAccess.getValorBooleanoAccess().getValorBooleanoParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleano_in_rule__ValorBooleano__ValorAssignment13529);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6667:1: rule__Operacion__Op_izqAssignment_1 : ( ruleoperando_izq ) ;
    public final void rule__Operacion__Op_izqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6671:1: ( ( ruleoperando_izq ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6672:1: ( ruleoperando_izq )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6672:1: ( ruleoperando_izq )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6673:1: ruleoperando_izq
            {
             before(grammarAccess.getOperacionAccess().getOp_izqOperando_izqParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_izq_in_rule__Operacion__Op_izqAssignment_113560);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6682:1: rule__Operacion__Signo_opAssignment_2 : ( rulesigno ) ;
    public final void rule__Operacion__Signo_opAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6686:1: ( ( rulesigno ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6687:1: ( rulesigno )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6687:1: ( rulesigno )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6688:1: rulesigno
            {
             before(grammarAccess.getOperacionAccess().getSigno_opSignoParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulesigno_in_rule__Operacion__Signo_opAssignment_213591);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6697:1: rule__Operacion__Op_derAssignment_3 : ( ruleoperando_der ) ;
    public final void rule__Operacion__Op_derAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6701:1: ( ( ruleoperando_der ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6702:1: ( ruleoperando_der )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6702:1: ( ruleoperando_der )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6703:1: ruleoperando_der
            {
             before(grammarAccess.getOperacionAccess().getOp_derOperando_derParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_der_in_rule__Operacion__Op_derAssignment_313622);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6712:1: rule__Operando_izq__Oper_izqAssignment : ( rulevalor ) ;
    public final void rule__Operando_izq__Oper_izqAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6716:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6717:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6717:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6718:1: rulevalor
            {
             before(grammarAccess.getOperando_izqAccess().getOper_izqValorParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Operando_izq__Oper_izqAssignment13653);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6727:1: rule__Operando_der__Oper_derAssignment : ( rulevalor ) ;
    public final void rule__Operando_der__Oper_derAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6731:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6732:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6732:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6733:1: rulevalor
            {
             before(grammarAccess.getOperando_derAccess().getOper_derValorParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Operando_der__Oper_derAssignment13684);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6742:1: rule__Sino__SentenciasAssignment_2_0 : ( ruleSentencias ) ;
    public final void rule__Sino__SentenciasAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6746:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6747:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6747:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6748:1: ruleSentencias
            {
             before(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_013715);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6757:1: rule__Sino__SentenciasAssignment_2_1 : ( ruleSentencias ) ;
    public final void rule__Sino__SentenciasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6761:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6762:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6762:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6763:1: ruleSentencias
            {
             before(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_113746);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6772:1: rule__ParametroFuncion__TipoAssignment_0 : ( ruleTipoVariable ) ;
    public final void rule__ParametroFuncion__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6776:1: ( ( ruleTipoVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6777:1: ( ruleTipoVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6777:1: ( ruleTipoVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6778:1: ruleTipoVariable
            {
             before(grammarAccess.getParametroFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_rule__ParametroFuncion__TipoAssignment_013777);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6787:1: rule__ParametroFuncion__PasoAssignment_1 : ( ruleTipoPaso ) ;
    public final void rule__ParametroFuncion__PasoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6791:1: ( ( ruleTipoPaso ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6792:1: ( ruleTipoPaso )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6792:1: ( ruleTipoPaso )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6793:1: ruleTipoPaso
            {
             before(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_rule__ParametroFuncion__PasoAssignment_113808);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6802:1: rule__ParametroFuncion__VariableAssignment_2 : ( ruleVariable ) ;
    public final void rule__ParametroFuncion__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6806:1: ( ( ruleVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6807:1: ( ruleVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6807:1: ( ruleVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6808:1: ruleVariable
            {
             before(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__ParametroFuncion__VariableAssignment_213839);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6817:1: rule__Funcion__TipoAssignment_0 : ( ruleTipoVariable ) ;
    public final void rule__Funcion__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6821:1: ( ( ruleTipoVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6822:1: ( ruleTipoVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6822:1: ( ruleTipoVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6823:1: ruleTipoVariable
            {
             before(grammarAccess.getFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_rule__Funcion__TipoAssignment_013870);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6832:1: rule__Funcion__NombreAssignment_2 : ( ruleEString ) ;
    public final void rule__Funcion__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6836:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6837:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6837:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6838:1: ruleEString
            {
             before(grammarAccess.getFuncionAccess().getNombreEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Funcion__NombreAssignment_213901);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6847:1: rule__Funcion__ParametrofuncionAssignment_4_0 : ( ruleParametroFuncion ) ;
    public final void rule__Funcion__ParametrofuncionAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6851:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6852:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6852:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6853:1: ruleParametroFuncion
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_013932);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6862:1: rule__Funcion__ParametrofuncionAssignment_4_1_1 : ( ruleParametroFuncion ) ;
    public final void rule__Funcion__ParametrofuncionAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6866:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6867:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6867:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6868:1: ruleParametroFuncion
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_1_113963);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6877:1: rule__Funcion__DeclaracionvariableAssignment_7_0 : ( ruleDeclaracionVariable ) ;
    public final void rule__Funcion__DeclaracionvariableAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6881:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6882:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6882:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6883:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getFuncionAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_7_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Funcion__DeclaracionvariableAssignment_7_013994);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6892:1: rule__Funcion__DeclaracionvariableAssignment_7_1 : ( ruleDeclaracionVariable ) ;
    public final void rule__Funcion__DeclaracionvariableAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6896:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6897:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6897:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6898:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getFuncionAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Funcion__DeclaracionvariableAssignment_7_114025);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6907:1: rule__Funcion__SentenciasAssignment_9_0 : ( ruleSentencias ) ;
    public final void rule__Funcion__SentenciasAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6911:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6912:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6912:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6913:1: ruleSentencias
            {
             before(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_9_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_9_014056);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6922:1: rule__Funcion__SentenciasAssignment_9_1 : ( ruleSentencias ) ;
    public final void rule__Funcion__SentenciasAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6926:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6927:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6927:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6928:1: ruleSentencias
            {
             before(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_9_114087);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6937:1: rule__Funcion__DevuelveAssignment_11 : ( rulevalor ) ;
    public final void rule__Funcion__DevuelveAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6941:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6942:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6942:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6943:1: rulevalor
            {
             before(grammarAccess.getFuncionAccess().getDevuelveValorParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Funcion__DevuelveAssignment_1114118);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6952:1: rule__Procedimiento__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__Procedimiento__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6956:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6957:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6957:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6958:1: ruleEString
            {
             before(grammarAccess.getProcedimientoAccess().getNombreEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Procedimiento__NombreAssignment_114149);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6967:1: rule__Procedimiento__ParametrofuncionAssignment_3_0 : ( ruleParametroFuncion ) ;
    public final void rule__Procedimiento__ParametrofuncionAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6971:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6972:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6972:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6973:1: ruleParametroFuncion
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_014180);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6982:1: rule__Procedimiento__ParametrofuncionAssignment_3_1_1 : ( ruleParametroFuncion ) ;
    public final void rule__Procedimiento__ParametrofuncionAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6986:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6987:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6987:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6988:1: ruleParametroFuncion
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_1_114211);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6997:1: rule__Procedimiento__DeclaracionvariableAssignment_6_0 : ( ruleDeclaracionVariable ) ;
    public final void rule__Procedimiento__DeclaracionvariableAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7001:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7002:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7002:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7003:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getProcedimientoAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_6_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Procedimiento__DeclaracionvariableAssignment_6_014242);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7012:1: rule__Procedimiento__DeclaracionvariableAssignment_6_1 : ( ruleDeclaracionVariable ) ;
    public final void rule__Procedimiento__DeclaracionvariableAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7016:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7017:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7017:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7018:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getProcedimientoAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Procedimiento__DeclaracionvariableAssignment_6_114273);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7027:1: rule__Procedimiento__SentenciasAssignment_8_0 : ( ruleSentencias ) ;
    public final void rule__Procedimiento__SentenciasAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7031:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7032:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7032:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7033:1: ruleSentencias
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_8_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_8_014304);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7042:1: rule__Procedimiento__SentenciasAssignment_8_1 : ( ruleSentencias ) ;
    public final void rule__Procedimiento__SentenciasAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7046:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7047:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7047:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7048:1: ruleSentencias
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_8_114335);
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
        "\1\70\2\55\11\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\2\1\11\1\1";
    static final String DFA2_specialS =
        "\14\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\2\50\uffff\1\3\1\4\1\5\2\uffff\1\6\2\uffff\1\7\1\uffff"+
            "\1\10",
            "\1\11\32\uffff\2\12\6\uffff\1\13\1\uffff\1\11",
            "\1\11\32\uffff\2\12\6\uffff\1\13\1\uffff\1\11",
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
        "\1\uffff\2\12\2\uffff\1\14\7\uffff";
    static final String DFA4_minS =
        "\3\4\1\uffff\1\6\1\4\7\uffff";
    static final String DFA4_maxS =
        "\1\73\2\101\1\uffff\1\73\1\101\7\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\3\2\uffff\1\5\1\6\1\7\1\10\1\2\1\1\1\4";
    static final String DFA4_specialS =
        "\15\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\1\5\1\11\1\uffff\1\3\13\uffff\2\10\1\uffff\1\4\22"+
            "\uffff\1\7\17\uffff\1\6",
            "\2\12\2\uffff\1\12\16\uffff\14\12\6\uffff\1\12\1\uffff\1\13"+
            "\1\12\1\uffff\15\12\1\uffff\1\12\1\uffff\2\12\1\uffff\1\12",
            "\2\12\2\uffff\1\12\16\uffff\14\12\6\uffff\1\12\1\uffff\1\13"+
            "\1\12\1\uffff\15\12\1\uffff\1\12\1\uffff\2\12\1\uffff\1\12",
            "",
            "\1\5\64\uffff\1\6",
            "\2\14\21\uffff\14\14\6\uffff\1\14\2\uffff\1\14\1\uffff\15"+
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
        public static final BitSet FOLLOW_38_in_rule__TipoPaso__Alternatives3460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group__0__Impl_in_rule__Codigo__Group__03492 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Codigo__Group__1_in_rule__Codigo__Group__03495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group_0__0_in_rule__Codigo__Group__0__Impl3522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group__1__Impl_in_rule__Codigo__Group__13553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__TieneAssignment_1_in_rule__Codigo__Group__1__Impl3580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group_0__0__Impl_in_rule__Codigo__Group_0__03614 = new BitSet(new long[]{0x000000000007C000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Codigo__Group_0__1_in_rule__Codigo__Group_0__03617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__FuncionAssignment_0_0_in_rule__Codigo__Group_0__0__Impl3644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group_0__1__Impl_in_rule__Codigo__Group_0__13674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__FuncionAssignment_0_1_in_rule__Codigo__Group_0__1__Impl3701 = new BitSet(new long[]{0x000000000007C002L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Inicio__Group__0__Impl_in_rule__Inicio__Group__03736 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Inicio__Group__1_in_rule__Inicio__Group__03739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__1__Impl_in_rule__Inicio__Group__13797 = new BitSet(new long[]{0x000001000007C000L});
        public static final BitSet FOLLOW_rule__Inicio__Group__2_in_rule__Inicio__Group__13800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Inicio__Group__1__Impl3828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__2__Impl_in_rule__Inicio__Group__23859 = new BitSet(new long[]{0x000001000007C000L});
        public static final BitSet FOLLOW_rule__Inicio__Group__3_in_rule__Inicio__Group__23862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__0_in_rule__Inicio__Group__2__Impl3889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__3__Impl_in_rule__Inicio__Group__33920 = new BitSet(new long[]{0x0149C20000000030L});
        public static final BitSet FOLLOW_rule__Inicio__Group__4_in_rule__Inicio__Group__33923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Inicio__Group__3__Impl3951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__4__Impl_in_rule__Inicio__Group__43982 = new BitSet(new long[]{0x0149C20000000030L});
        public static final BitSet FOLLOW_rule__Inicio__Group__5_in_rule__Inicio__Group__43985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_4__0_in_rule__Inicio__Group__4__Impl4012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__5__Impl_in_rule__Inicio__Group__54043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Inicio__Group__5__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__0__Impl_in_rule__Inicio__Group_2__04114 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__1_in_rule__Inicio__Group_2__04117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__DeclaracionvariableAssignment_2_0_in_rule__Inicio__Group_2__0__Impl4144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__1__Impl_in_rule__Inicio__Group_2__14174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__DeclaracionvariableAssignment_2_1_in_rule__Inicio__Group_2__1__Impl4201 = new BitSet(new long[]{0x000000000007C002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_4__0__Impl_in_rule__Inicio__Group_4__04236 = new BitSet(new long[]{0x0149C00000000030L});
        public static final BitSet FOLLOW_rule__Inicio__Group_4__1_in_rule__Inicio__Group_4__04239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__TieneAssignment_4_0_in_rule__Inicio__Group_4__0__Impl4266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_4__1__Impl_in_rule__Inicio__Group_4__14296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__TieneAssignment_4_1_in_rule__Inicio__Group_4__1__Impl4323 = new BitSet(new long[]{0x0149C00000000032L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__0__Impl_in_rule__DeclaracionVariable__Group__04358 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__1_in_rule__DeclaracionVariable__Group__04361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__TipoAssignment_0_in_rule__DeclaracionVariable__Group__0__Impl4388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__1__Impl_in_rule__DeclaracionVariable__Group__14418 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__2_in_rule__DeclaracionVariable__Group__14421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_1_in_rule__DeclaracionVariable__Group__1__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__2__Impl_in_rule__DeclaracionVariable__Group__24478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_2__0_in_rule__DeclaracionVariable__Group__2__Impl4505 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_2__0__Impl_in_rule__DeclaracionVariable__Group_2__04542 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_2__1_in_rule__DeclaracionVariable__Group_2__04545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__DeclaracionVariable__Group_2__0__Impl4573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_2__1__Impl_in_rule__DeclaracionVariable__Group_2__14604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_2_1_in_rule__DeclaracionVariable__Group_2__1__Impl4631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__0__Impl_in_rule__LlamadaFuncion__Group__04665 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__1_in_rule__LlamadaFuncion__Group__04668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__NombreAssignment_0_in_rule__LlamadaFuncion__Group__0__Impl4695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__1__Impl_in_rule__LlamadaFuncion__Group__14725 = new BitSet(new long[]{0x08001000016002F0L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__2_in_rule__LlamadaFuncion__Group__14728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__LlamadaFuncion__Group__1__Impl4756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__2__Impl_in_rule__LlamadaFuncion__Group__24787 = new BitSet(new long[]{0x08001000016002F0L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__3_in_rule__LlamadaFuncion__Group__24790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__0_in_rule__LlamadaFuncion__Group__2__Impl4817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__3__Impl_in_rule__LlamadaFuncion__Group__34848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__LlamadaFuncion__Group__3__Impl4876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__0__Impl_in_rule__LlamadaFuncion__Group_2__04915 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__1_in_rule__LlamadaFuncion__Group_2__04918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_0_in_rule__LlamadaFuncion__Group_2__0__Impl4945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__1__Impl_in_rule__LlamadaFuncion__Group_2__14975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__0_in_rule__LlamadaFuncion__Group_2__1__Impl5002 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__0__Impl_in_rule__LlamadaFuncion__Group_2_1__05037 = new BitSet(new long[]{0x08000000016002F0L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__1_in_rule__LlamadaFuncion__Group_2_1__05040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__LlamadaFuncion__Group_2_1__0__Impl5068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__1__Impl_in_rule__LlamadaFuncion__Group_2_1__15099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_1_1_in_rule__LlamadaFuncion__Group_2_1__1__Impl5126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__0__Impl_in_rule__Asignacion__Group__05160 = new BitSet(new long[]{0x0000200000000100L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__1_in_rule__Asignacion__Group__05163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__LvalueAssignment_0_in_rule__Asignacion__Group__0__Impl5190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__1__Impl_in_rule__Asignacion__Group__15220 = new BitSet(new long[]{0x0000200000000100L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__2_in_rule__Asignacion__Group__15223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__MatAssignment_1_in_rule__Asignacion__Group__1__Impl5250 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__2__Impl_in_rule__Asignacion__Group__25281 = new BitSet(new long[]{0x08000800016002F0L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__3_in_rule__Asignacion__Group__25284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Asignacion__Group__2__Impl5312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__3__Impl_in_rule__Asignacion__Group__35343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__OperadorAssignment_3_in_rule__Asignacion__Group__3__Impl5370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__0__Impl_in_rule__Escribir__Group__05408 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Escribir__Group__1_in_rule__Escribir__Group__05411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Escribir__Group__0__Impl5439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__1__Impl_in_rule__Escribir__Group__15470 = new BitSet(new long[]{0x08000000016002F0L});
        public static final BitSet FOLLOW_rule__Escribir__Group__2_in_rule__Escribir__Group__15473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Escribir__Group__1__Impl5501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__2__Impl_in_rule__Escribir__Group__25532 = new BitSet(new long[]{0x0000140000000000L});
        public static final BitSet FOLLOW_rule__Escribir__Group__3_in_rule__Escribir__Group__25535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__OperadorAssignment_2_in_rule__Escribir__Group__2__Impl5562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__3__Impl_in_rule__Escribir__Group__35592 = new BitSet(new long[]{0x0000140000000000L});
        public static final BitSet FOLLOW_rule__Escribir__Group__4_in_rule__Escribir__Group__35595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__0_in_rule__Escribir__Group__3__Impl5622 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__4__Impl_in_rule__Escribir__Group__45653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Escribir__Group__4__Impl5681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__0__Impl_in_rule__Escribir__Group_3__05722 = new BitSet(new long[]{0x08000000016002F0L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__1_in_rule__Escribir__Group_3__05725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Escribir__Group_3__0__Impl5753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__1__Impl_in_rule__Escribir__Group_3__15784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__OperadorAssignment_3_1_in_rule__Escribir__Group_3__1__Impl5811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__0__Impl_in_rule__Leer__Group__05845 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Leer__Group__1_in_rule__Leer__Group__05848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Leer__Group__0__Impl5876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__1__Impl_in_rule__Leer__Group__15907 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Leer__Group__2_in_rule__Leer__Group__15910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Leer__Group__1__Impl5938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__2__Impl_in_rule__Leer__Group__25969 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__Leer__Group__3_in_rule__Leer__Group__25972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__VariableAssignment_2_in_rule__Leer__Group__2__Impl5999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__3__Impl_in_rule__Leer__Group__36029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Leer__Group__3__Impl6057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__0__Impl_in_rule__Si__Group__06096 = new BitSet(new long[]{0x08000800016002F0L});
        public static final BitSet FOLLOW_rule__Si__Group__1_in_rule__Si__Group__06099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Si__Group__0__Impl6127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__1__Impl_in_rule__Si__Group__16158 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__Si__Group__2_in_rule__Si__Group__16161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__ValorAssignment_1_in_rule__Si__Group__1__Impl6188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__2__Impl_in_rule__Si__Group__26218 = new BitSet(new long[]{0x114DC00000000030L});
        public static final BitSet FOLLOW_rule__Si__Group__3_in_rule__Si__Group__26221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Si__Group__2__Impl6249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__3__Impl_in_rule__Si__Group__36280 = new BitSet(new long[]{0x114DC00000000030L});
        public static final BitSet FOLLOW_rule__Si__Group__4_in_rule__Si__Group__36283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group_3__0_in_rule__Si__Group__3__Impl6310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__4__Impl_in_rule__Si__Group__46341 = new BitSet(new long[]{0x114DC00000000030L});
        public static final BitSet FOLLOW_rule__Si__Group__5_in_rule__Si__Group__46344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__SinoAssignment_4_in_rule__Si__Group__4__Impl6371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__5__Impl_in_rule__Si__Group__56402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Si__Group__5__Impl6430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group_3__0__Impl_in_rule__Si__Group_3__06473 = new BitSet(new long[]{0x0149C00000000030L});
        public static final BitSet FOLLOW_rule__Si__Group_3__1_in_rule__Si__Group_3__06476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__SentenciasAssignment_3_0_in_rule__Si__Group_3__0__Impl6503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group_3__1__Impl_in_rule__Si__Group_3__16533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__SentenciasAssignment_3_1_in_rule__Si__Group_3__1__Impl6560 = new BitSet(new long[]{0x0149C00000000032L});
        public static final BitSet FOLLOW_rule__Mientras__Group__0__Impl_in_rule__Mientras__Group__06595 = new BitSet(new long[]{0x08000800016002F0L});
        public static final BitSet FOLLOW_rule__Mientras__Group__1_in_rule__Mientras__Group__06598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Mientras__Group__0__Impl6626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__1__Impl_in_rule__Mientras__Group__16657 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__Mientras__Group__2_in_rule__Mientras__Group__16660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__ValorAssignment_1_in_rule__Mientras__Group__1__Impl6687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__2__Impl_in_rule__Mientras__Group__26717 = new BitSet(new long[]{0x0169C00000000030L});
        public static final BitSet FOLLOW_rule__Mientras__Group__3_in_rule__Mientras__Group__26720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Mientras__Group__2__Impl6748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__3__Impl_in_rule__Mientras__Group__36779 = new BitSet(new long[]{0x0169C00000000030L});
        public static final BitSet FOLLOW_rule__Mientras__Group__4_in_rule__Mientras__Group__36782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__0_in_rule__Mientras__Group__3__Impl6809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__4__Impl_in_rule__Mientras__Group__46840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__Mientras__Group__4__Impl6868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__0__Impl_in_rule__Mientras__Group_3__06909 = new BitSet(new long[]{0x0149C00000000030L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__1_in_rule__Mientras__Group_3__06912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__SentenciasAssignment_3_0_in_rule__Mientras__Group_3__0__Impl6939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__1__Impl_in_rule__Mientras__Group_3__16969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__SentenciasAssignment_3_1_in_rule__Mientras__Group_3__1__Impl6996 = new BitSet(new long[]{0x0149C00000000032L});
        public static final BitSet FOLLOW_rule__Repetir__Group__0__Impl_in_rule__Repetir__Group__07031 = new BitSet(new long[]{0x01C9C00000000030L});
        public static final BitSet FOLLOW_rule__Repetir__Group__1_in_rule__Repetir__Group__07034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__Repetir__Group__0__Impl7062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group__1__Impl_in_rule__Repetir__Group__17093 = new BitSet(new long[]{0x01C9C00000000030L});
        public static final BitSet FOLLOW_rule__Repetir__Group__2_in_rule__Repetir__Group__17096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__0_in_rule__Repetir__Group__1__Impl7123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group__2__Impl_in_rule__Repetir__Group__27154 = new BitSet(new long[]{0x08000800016002F0L});
        public static final BitSet FOLLOW_rule__Repetir__Group__3_in_rule__Repetir__Group__27157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__Repetir__Group__2__Impl7185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group__3__Impl_in_rule__Repetir__Group__37216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__ValorAssignment_3_in_rule__Repetir__Group__3__Impl7243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__0__Impl_in_rule__Repetir__Group_1__07281 = new BitSet(new long[]{0x0149C00000000030L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__1_in_rule__Repetir__Group_1__07284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__SentenciasAssignment_1_0_in_rule__Repetir__Group_1__0__Impl7311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__1__Impl_in_rule__Repetir__Group_1__17341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__SentenciasAssignment_1_1_in_rule__Repetir__Group_1__1__Impl7368 = new BitSet(new long[]{0x0149C00000000032L});
        public static final BitSet FOLLOW_rule__Desde__Group__0__Impl_in_rule__Desde__Group__07403 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Desde__Group__1_in_rule__Desde__Group__07406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Desde__Group__0__Impl7434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__1__Impl_in_rule__Desde__Group__17465 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_rule__Desde__Group__2_in_rule__Desde__Group__17468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__AsignacionAssignment_1_in_rule__Desde__Group__1__Impl7495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__2__Impl_in_rule__Desde__Group__27525 = new BitSet(new long[]{0x08000800016002F0L});
        public static final BitSet FOLLOW_rule__Desde__Group__3_in_rule__Desde__Group__27528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__Desde__Group__2__Impl7556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__3__Impl_in_rule__Desde__Group__37587 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__Desde__Group__4_in_rule__Desde__Group__37590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__ValorAssignment_3_in_rule__Desde__Group__3__Impl7617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__4__Impl_in_rule__Desde__Group__47647 = new BitSet(new long[]{0x0549C00000000030L});
        public static final BitSet FOLLOW_rule__Desde__Group__5_in_rule__Desde__Group__47650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Desde__Group__4__Impl7678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__5__Impl_in_rule__Desde__Group__57709 = new BitSet(new long[]{0x0549C00000000030L});
        public static final BitSet FOLLOW_rule__Desde__Group__6_in_rule__Desde__Group__57712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__0_in_rule__Desde__Group__5__Impl7739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__6__Impl_in_rule__Desde__Group__67770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__Desde__Group__6__Impl7798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__0__Impl_in_rule__Desde__Group_5__07843 = new BitSet(new long[]{0x0149C00000000030L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__1_in_rule__Desde__Group_5__07846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__SentenciasAssignment_5_0_in_rule__Desde__Group_5__0__Impl7873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__1__Impl_in_rule__Desde__Group_5__17903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__SentenciasAssignment_5_1_in_rule__Desde__Group_5__1__Impl7930 = new BitSet(new long[]{0x0149C00000000032L});
        public static final BitSet FOLLOW_rule__Incremento__Group__0__Impl_in_rule__Incremento__Group__07965 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_rule__Incremento__Group__1_in_rule__Incremento__Group__07968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Incremento__NombreAssignment_0_in_rule__Incremento__Group__0__Impl7995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Incremento__Group__1__Impl_in_rule__Incremento__Group__18025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Incremento__SsignoAssignment_1_in_rule__Incremento__Group__1__Impl8052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__08086 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__08089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__NombreAssignment_0_in_rule__Variable__Group__0__Impl8116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__18146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__MatAssignment_1_in_rule__Variable__Group__1__Impl8173 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__VariableID__Group__0__Impl_in_rule__VariableID__Group__08208 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__VariableID__Group__1_in_rule__VariableID__Group__08211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__NombreAssignment_0_in_rule__VariableID__Group__0__Impl8238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group__1__Impl_in_rule__VariableID__Group__18268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__MatAssignment_1_in_rule__VariableID__Group__1__Impl8295 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__08330 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__08333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__EInt__Group__0__Impl8362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__18395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl8422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__08455 = new BitSet(new long[]{0x0800000001000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__08458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__EFloat__Group__0__Impl8487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__18520 = new BitSet(new long[]{0x0800000001000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__18523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl8551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__28582 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__28585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__EFloat__Group__2__Impl8613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__38644 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__38647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl8674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__48703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl8730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__08771 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__08774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl8801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__18831 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__18834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__EFloat__Group_4__1__Impl8863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__28896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl8923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__0__Impl_in_rule__Operacion__Group__08958 = new BitSet(new long[]{0x08000800016002F0L});
        public static final BitSet FOLLOW_rule__Operacion__Group__1_in_rule__Operacion__Group__08961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Operacion__Group__0__Impl8989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__1__Impl_in_rule__Operacion__Group__19020 = new BitSet(new long[]{0x00000007FF800000L});
        public static final BitSet FOLLOW_rule__Operacion__Group__2_in_rule__Operacion__Group__19023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Op_izqAssignment_1_in_rule__Operacion__Group__1__Impl9050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__2__Impl_in_rule__Operacion__Group__29080 = new BitSet(new long[]{0x08000800016002F0L});
        public static final BitSet FOLLOW_rule__Operacion__Group__3_in_rule__Operacion__Group__29083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Signo_opAssignment_2_in_rule__Operacion__Group__2__Impl9110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__3__Impl_in_rule__Operacion__Group__39140 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__Operacion__Group__4_in_rule__Operacion__Group__39143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Op_derAssignment_3_in_rule__Operacion__Group__3__Impl9170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__4__Impl_in_rule__Operacion__Group__49200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Operacion__Group__4__Impl9228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group__0__Impl_in_rule__Sino__Group__09269 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_rule__Sino__Group__1_in_rule__Sino__Group__09272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group__1__Impl_in_rule__Sino__Group__19330 = new BitSet(new long[]{0x0149C00000000030L});
        public static final BitSet FOLLOW_rule__Sino__Group__2_in_rule__Sino__Group__19333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__Sino__Group__1__Impl9361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group__2__Impl_in_rule__Sino__Group__29392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__0_in_rule__Sino__Group__2__Impl9419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__0__Impl_in_rule__Sino__Group_2__09456 = new BitSet(new long[]{0x0149C00000000030L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__1_in_rule__Sino__Group_2__09459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__SentenciasAssignment_2_0_in_rule__Sino__Group_2__0__Impl9486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__1__Impl_in_rule__Sino__Group_2__19516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__SentenciasAssignment_2_1_in_rule__Sino__Group_2__1__Impl9543 = new BitSet(new long[]{0x0149C00000000032L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__0__Impl_in_rule__ParametroFuncion__Group__09578 = new BitSet(new long[]{0x0000006000080000L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__1_in_rule__ParametroFuncion__Group__09581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__TipoAssignment_0_in_rule__ParametroFuncion__Group__0__Impl9608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__1__Impl_in_rule__ParametroFuncion__Group__19638 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__2_in_rule__ParametroFuncion__Group__19641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__PasoAssignment_1_in_rule__ParametroFuncion__Group__1__Impl9668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__2__Impl_in_rule__ParametroFuncion__Group__29698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__VariableAssignment_2_in_rule__ParametroFuncion__Group__2__Impl9725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__0__Impl_in_rule__Funcion__Group__09761 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__1_in_rule__Funcion__Group__09764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__TipoAssignment_0_in_rule__Funcion__Group__0__Impl9791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__1__Impl_in_rule__Funcion__Group__19821 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Funcion__Group__2_in_rule__Funcion__Group__19824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__Funcion__Group__1__Impl9852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__2__Impl_in_rule__Funcion__Group__29883 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__3_in_rule__Funcion__Group__29886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__NombreAssignment_2_in_rule__Funcion__Group__2__Impl9913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__3__Impl_in_rule__Funcion__Group__39943 = new BitSet(new long[]{0x000010000007C000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__4_in_rule__Funcion__Group__39946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Funcion__Group__3__Impl9974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__4__Impl_in_rule__Funcion__Group__410005 = new BitSet(new long[]{0x000010000007C000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__5_in_rule__Funcion__Group__410008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__0_in_rule__Funcion__Group__4__Impl10035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__5__Impl_in_rule__Funcion__Group__510066 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__6_in_rule__Funcion__Group__510069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Funcion__Group__5__Impl10097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__6__Impl_in_rule__Funcion__Group__610128 = new BitSet(new long[]{0x000001000007C000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__7_in_rule__Funcion__Group__610131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Funcion__Group__6__Impl10159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__7__Impl_in_rule__Funcion__Group__710190 = new BitSet(new long[]{0x000001000007C000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__8_in_rule__Funcion__Group__710193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__0_in_rule__Funcion__Group__7__Impl10220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__8__Impl_in_rule__Funcion__Group__810251 = new BitSet(new long[]{0x4149C00000000030L});
        public static final BitSet FOLLOW_rule__Funcion__Group__9_in_rule__Funcion__Group__810254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Funcion__Group__8__Impl10282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__9__Impl_in_rule__Funcion__Group__910313 = new BitSet(new long[]{0x4149C00000000030L});
        public static final BitSet FOLLOW_rule__Funcion__Group__10_in_rule__Funcion__Group__910316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_9__0_in_rule__Funcion__Group__9__Impl10343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__10__Impl_in_rule__Funcion__Group__1010374 = new BitSet(new long[]{0x08000800016002F0L});
        public static final BitSet FOLLOW_rule__Funcion__Group__11_in_rule__Funcion__Group__1010377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__Funcion__Group__10__Impl10405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__11__Impl_in_rule__Funcion__Group__1110436 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__12_in_rule__Funcion__Group__1110439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__DevuelveAssignment_11_in_rule__Funcion__Group__11__Impl10466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__12__Impl_in_rule__Funcion__Group__1210496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rule__Funcion__Group__12__Impl10524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__0__Impl_in_rule__Funcion__Group_4__010581 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__1_in_rule__Funcion__Group_4__010584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_0_in_rule__Funcion__Group_4__0__Impl10611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__1__Impl_in_rule__Funcion__Group_4__110641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__0_in_rule__Funcion__Group_4__1__Impl10668 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__0__Impl_in_rule__Funcion__Group_4_1__010703 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__1_in_rule__Funcion__Group_4_1__010706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Funcion__Group_4_1__0__Impl10734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__1__Impl_in_rule__Funcion__Group_4_1__110765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_1_1_in_rule__Funcion__Group_4_1__1__Impl10792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__0__Impl_in_rule__Funcion__Group_7__010826 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__1_in_rule__Funcion__Group_7__010829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__DeclaracionvariableAssignment_7_0_in_rule__Funcion__Group_7__0__Impl10856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__1__Impl_in_rule__Funcion__Group_7__110886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__DeclaracionvariableAssignment_7_1_in_rule__Funcion__Group_7__1__Impl10913 = new BitSet(new long[]{0x000000000007C002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_9__0__Impl_in_rule__Funcion__Group_9__010948 = new BitSet(new long[]{0x0149C00000000030L});
        public static final BitSet FOLLOW_rule__Funcion__Group_9__1_in_rule__Funcion__Group_9__010951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__SentenciasAssignment_9_0_in_rule__Funcion__Group_9__0__Impl10978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_9__1__Impl_in_rule__Funcion__Group_9__111008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__SentenciasAssignment_9_1_in_rule__Funcion__Group_9__1__Impl11035 = new BitSet(new long[]{0x0149C00000000032L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__0__Impl_in_rule__Procedimiento__Group__011070 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__1_in_rule__Procedimiento__Group__011073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__Procedimiento__Group__0__Impl11101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__1__Impl_in_rule__Procedimiento__Group__111132 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__2_in_rule__Procedimiento__Group__111135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__NombreAssignment_1_in_rule__Procedimiento__Group__1__Impl11162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__2__Impl_in_rule__Procedimiento__Group__211192 = new BitSet(new long[]{0x000010000007C000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__3_in_rule__Procedimiento__Group__211195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Procedimiento__Group__2__Impl11223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__3__Impl_in_rule__Procedimiento__Group__311254 = new BitSet(new long[]{0x000010000007C000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__4_in_rule__Procedimiento__Group__311257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__0_in_rule__Procedimiento__Group__3__Impl11284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__4__Impl_in_rule__Procedimiento__Group__411315 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__5_in_rule__Procedimiento__Group__411318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Procedimiento__Group__4__Impl11346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__5__Impl_in_rule__Procedimiento__Group__511377 = new BitSet(new long[]{0x000001000007C000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__6_in_rule__Procedimiento__Group__511380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Procedimiento__Group__5__Impl11408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__6__Impl_in_rule__Procedimiento__Group__611439 = new BitSet(new long[]{0x000001000007C000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__7_in_rule__Procedimiento__Group__611442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_6__0_in_rule__Procedimiento__Group__6__Impl11469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__7__Impl_in_rule__Procedimiento__Group__711500 = new BitSet(new long[]{0x0149C00000000030L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__8_in_rule__Procedimiento__Group__711503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Procedimiento__Group__7__Impl11531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__8__Impl_in_rule__Procedimiento__Group__811562 = new BitSet(new long[]{0x0149C00000000030L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__9_in_rule__Procedimiento__Group__811565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_8__0_in_rule__Procedimiento__Group__8__Impl11592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__9__Impl_in_rule__Procedimiento__Group__911623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__Procedimiento__Group__9__Impl11651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__0__Impl_in_rule__Procedimiento__Group_3__011702 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__1_in_rule__Procedimiento__Group_3__011705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_0_in_rule__Procedimiento__Group_3__0__Impl11732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__1__Impl_in_rule__Procedimiento__Group_3__111762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__0_in_rule__Procedimiento__Group_3__1__Impl11789 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__0__Impl_in_rule__Procedimiento__Group_3_1__011824 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__1_in_rule__Procedimiento__Group_3_1__011827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Procedimiento__Group_3_1__0__Impl11855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__1__Impl_in_rule__Procedimiento__Group_3_1__111886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_1_1_in_rule__Procedimiento__Group_3_1__1__Impl11913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_6__0__Impl_in_rule__Procedimiento__Group_6__011947 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_6__1_in_rule__Procedimiento__Group_6__011950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__DeclaracionvariableAssignment_6_0_in_rule__Procedimiento__Group_6__0__Impl11977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_6__1__Impl_in_rule__Procedimiento__Group_6__112007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__DeclaracionvariableAssignment_6_1_in_rule__Procedimiento__Group_6__1__Impl12034 = new BitSet(new long[]{0x000000000007C002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_8__0__Impl_in_rule__Procedimiento__Group_8__012069 = new BitSet(new long[]{0x0149C00000000030L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_8__1_in_rule__Procedimiento__Group_8__012072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__SentenciasAssignment_8_0_in_rule__Procedimiento__Group_8__0__Impl12099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_8__1__Impl_in_rule__Procedimiento__Group_8__112129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__SentenciasAssignment_8_1_in_rule__Procedimiento__Group_8__1__Impl12156 = new BitSet(new long[]{0x0149C00000000032L});
        public static final BitSet FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_012196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_112227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInicio_in_rule__Codigo__TieneAssignment_112258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAR_in_rule__Caracter__ContenidoAssignment12289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Inicio__DeclaracionvariableAssignment_2_012320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Inicio__DeclaracionvariableAssignment_2_112351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_4_012382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_4_112413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_rule__DeclaracionVariable__TipoAssignment_012444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_112475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_2_112506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__LlamadaFuncion__NombreAssignment_012537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_012568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_1_112599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Asignacion__LvalueAssignment_012630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_MATRIZ_in_rule__Asignacion__MatAssignment_112661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Asignacion__OperadorAssignment_312692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_212723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_3_112754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__Leer__VariableAssignment_212785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Si__ValorAssignment_112816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_012847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_112878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSino_in_rule__Si__SinoAssignment_412909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Mientras__ValorAssignment_112940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_012971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_113002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_013033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_113064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Repetir__ValorAssignment_313095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_rule__Desde__AsignacionAssignment_113126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Desde__ValorAssignment_313157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_013188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_113219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Incremento__NombreAssignment_013250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinc_in_rule__Incremento__SsignoAssignment_113281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Variable__NombreAssignment_013312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_MATRIZ_in_rule__Variable__MatAssignment_113343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VariableID__NombreAssignment_013374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_MATRIZ_in_rule__VariableID__MatAssignment_113405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAD_in_rule__ConstCadena__ContenidoAssignment13436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__NumeroEntero__ValorAssignment13467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_rule__NumeroDecimal__ValorAssignment13498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_rule__ValorBooleano__ValorAssignment13529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_izq_in_rule__Operacion__Op_izqAssignment_113560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesigno_in_rule__Operacion__Signo_opAssignment_213591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_der_in_rule__Operacion__Op_derAssignment_313622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Operando_izq__Oper_izqAssignment13653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Operando_der__Oper_derAssignment13684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_013715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_113746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_rule__ParametroFuncion__TipoAssignment_013777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_rule__ParametroFuncion__PasoAssignment_113808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__ParametroFuncion__VariableAssignment_213839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_rule__Funcion__TipoAssignment_013870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Funcion__NombreAssignment_213901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_013932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_1_113963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Funcion__DeclaracionvariableAssignment_7_013994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Funcion__DeclaracionvariableAssignment_7_114025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_9_014056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_9_114087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Funcion__DevuelveAssignment_1114118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Procedimiento__NombreAssignment_114149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_014180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_1_114211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Procedimiento__DeclaracionvariableAssignment_6_014242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Procedimiento__DeclaracionvariableAssignment_6_114273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_8_014304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_8_114335 = new BitSet(new long[]{0x0000000000000002L});
    }


}