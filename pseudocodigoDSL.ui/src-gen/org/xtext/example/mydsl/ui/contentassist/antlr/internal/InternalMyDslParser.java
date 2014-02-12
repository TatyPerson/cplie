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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_CAR", "RULE_MATRIZ", "RULE_CAD", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'cos'", "'cuadrado'", "'exp'", "'ln'", "'log'", "'sen'", "'sqrt'", "'entero'", "'caracter'", "'real'", "'logico'", "'cadena'", "'E'", "'e'", "'verdadero'", "'falso'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'>='", "'<='", "'y'", "'o'", "'=='", "'!='", "'++'", "'--'", "'E/S'", "'S'", "'('", "')'", "'var'", "'inicio'", "'fin_inicio'", "':'", "','", "'='", "'escribir'", "'leer'", "'si'", "'entonces'", "'fin si'", "'mientras'", "'hacer'", "'fin_mientras'", "'repetir'", "'hasta_que'", "'desde'", "'hasta'", "'fin_desde'", "'.'", "'sino'", "'funcion'", "'devolver'", "'fin_funcion'", "'procedimiento'", "'fin_procedimiento'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
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
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;
    public static final int T__73=73;

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


    // $ANTLR start "entryRuleInternas"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleInternas : ruleInternas EOF ;
    public final void entryRuleInternas() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleInternas EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleInternas EOF
            {
             before(grammarAccess.getInternasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInternas_in_entryRuleInternas241);
            ruleInternas();

            state._fsp--;

             after(grammarAccess.getInternasRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInternas248); 

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
    // $ANTLR end "entryRuleInternas"


    // $ANTLR start "ruleInternas"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleInternas : ( ( rule__Internas__Group__0 ) ) ;
    public final void ruleInternas() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Internas__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Internas__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Internas__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Internas__Group__0 )
            {
             before(grammarAccess.getInternasAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Internas__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Internas__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group__0_in_ruleInternas274);
            rule__Internas__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInternas"


    // $ANTLR start "entryRuleNombreInterna"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleNombreInterna : ruleNombreInterna EOF ;
    public final void entryRuleNombreInterna() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleNombreInterna EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleNombreInterna EOF
            {
             before(grammarAccess.getNombreInternaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna301);
            ruleNombreInterna();

            state._fsp--;

             after(grammarAccess.getNombreInternaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNombreInterna308); 

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
    // $ANTLR end "entryRuleNombreInterna"


    // $ANTLR start "ruleNombreInterna"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleNombreInterna : ( ( rule__NombreInterna__Alternatives ) ) ;
    public final void ruleNombreInterna() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__NombreInterna__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__NombreInterna__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__NombreInterna__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__NombreInterna__Alternatives )
            {
             before(grammarAccess.getNombreInternaAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__NombreInterna__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__NombreInterna__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NombreInterna__Alternatives_in_ruleNombreInterna334);
            rule__NombreInterna__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNombreInternaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNombreInterna"


    // $ANTLR start "entryRuleOperador"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleOperador : ruleOperador EOF ;
    public final void entryRuleOperador() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleOperador EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleOperador EOF
            {
             before(grammarAccess.getOperadorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_entryRuleOperador361);
            ruleOperador();

            state._fsp--;

             after(grammarAccess.getOperadorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperador368); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleOperador : ( ( rule__Operador__Alternatives ) ) ;
    public final void ruleOperador() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__Operador__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Operador__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Operador__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__Operador__Alternatives )
            {
             before(grammarAccess.getOperadorAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__Operador__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__Operador__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operador__Alternatives_in_ruleOperador394);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleCaracter : ruleCaracter EOF ;
    public final void entryRuleCaracter() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleCaracter EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleCaracter EOF
            {
             before(grammarAccess.getCaracterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_entryRuleCaracter421);
            ruleCaracter();

            state._fsp--;

             after(grammarAccess.getCaracterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCaracter428); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleCaracter : ( ( rule__Caracter__ContenidoAssignment ) ) ;
    public final void ruleCaracter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__Caracter__ContenidoAssignment ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Caracter__ContenidoAssignment ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Caracter__ContenidoAssignment ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__Caracter__ContenidoAssignment )
            {
             before(grammarAccess.getCaracterAccess().getContenidoAssignment()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__Caracter__ContenidoAssignment )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__Caracter__ContenidoAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Caracter__ContenidoAssignment_in_ruleCaracter454);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRulevalor : rulevalor EOF ;
    public final void entryRulevalor() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( rulevalor EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: rulevalor EOF
            {
             before(grammarAccess.getValorRule()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_entryRulevalor481);
            rulevalor();

            state._fsp--;

             after(grammarAccess.getValorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulevalor488); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: rulevalor : ( ( rule__Valor__Alternatives ) ) ;
    public final void rulevalor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( ( rule__Valor__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Valor__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Valor__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( rule__Valor__Alternatives )
            {
             before(grammarAccess.getValorAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( rule__Valor__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: rule__Valor__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Valor__Alternatives_in_rulevalor514);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: entryRuleInicio : ruleInicio EOF ;
    public final void entryRuleInicio() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( ruleInicio EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ruleInicio EOF
            {
             before(grammarAccess.getInicioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_entryRuleInicio541);
            ruleInicio();

            state._fsp--;

             after(grammarAccess.getInicioRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInicio548); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: ruleInicio : ( ( rule__Inicio__Group__0 ) ) ;
    public final void ruleInicio() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:297:2: ( ( ( rule__Inicio__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Inicio__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Inicio__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rule__Inicio__Group__0 )
            {
             before(grammarAccess.getInicioAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( rule__Inicio__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: rule__Inicio__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__0_in_ruleInicio574);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( ruleEString EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString601);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString608); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:325:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__EString__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__EString__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( rule__EString__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString634);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: entryRuleDeclaracionVariable : ruleDeclaracionVariable EOF ;
    public final void entryRuleDeclaracionVariable() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( ruleDeclaracionVariable EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ruleDeclaracionVariable EOF
            {
             before(grammarAccess.getDeclaracionVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable661);
            ruleDeclaracionVariable();

            state._fsp--;

             after(grammarAccess.getDeclaracionVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionVariable668); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:349:1: ruleDeclaracionVariable : ( ( rule__DeclaracionVariable__Group__0 ) ) ;
    public final void ruleDeclaracionVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:353:2: ( ( ( rule__DeclaracionVariable__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__DeclaracionVariable__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__DeclaracionVariable__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( rule__DeclaracionVariable__Group__0 )
            {
             before(grammarAccess.getDeclaracionVariableAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( rule__DeclaracionVariable__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:2: rule__DeclaracionVariable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__0_in_ruleDeclaracionVariable694);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:368:1: entryRuleLlamadaFuncion : ruleLlamadaFuncion EOF ;
    public final void entryRuleLlamadaFuncion() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( ruleLlamadaFuncion EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ruleLlamadaFuncion EOF
            {
             before(grammarAccess.getLlamadaFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_entryRuleLlamadaFuncion721);
            ruleLlamadaFuncion();

            state._fsp--;

             after(grammarAccess.getLlamadaFuncionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLlamadaFuncion728); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: ruleLlamadaFuncion : ( ( rule__LlamadaFuncion__Group__0 ) ) ;
    public final void ruleLlamadaFuncion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:381:2: ( ( ( rule__LlamadaFuncion__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__LlamadaFuncion__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__LlamadaFuncion__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ( rule__LlamadaFuncion__Group__0 )
            {
             before(grammarAccess.getLlamadaFuncionAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( rule__LlamadaFuncion__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:2: rule__LlamadaFuncion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__0_in_ruleLlamadaFuncion754);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:396:1: entryRuleAsignacion : ruleAsignacion EOF ;
    public final void entryRuleAsignacion() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: ( ruleAsignacion EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: ruleAsignacion EOF
            {
             before(grammarAccess.getAsignacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_entryRuleAsignacion781);
            ruleAsignacion();

            state._fsp--;

             after(grammarAccess.getAsignacionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacion788); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: ruleAsignacion : ( ( rule__Asignacion__Group__0 ) ) ;
    public final void ruleAsignacion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:409:2: ( ( ( rule__Asignacion__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__Asignacion__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__Asignacion__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: ( rule__Asignacion__Group__0 )
            {
             before(grammarAccess.getAsignacionAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( rule__Asignacion__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:2: rule__Asignacion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__0_in_ruleAsignacion814);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:424:1: entryRuleEscribir : ruleEscribir EOF ;
    public final void entryRuleEscribir() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: ( ruleEscribir EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ruleEscribir EOF
            {
             before(grammarAccess.getEscribirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_entryRuleEscribir841);
            ruleEscribir();

            state._fsp--;

             after(grammarAccess.getEscribirRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEscribir848); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ruleEscribir : ( ( rule__Escribir__Group__0 ) ) ;
    public final void ruleEscribir() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:437:2: ( ( ( rule__Escribir__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__Escribir__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__Escribir__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( rule__Escribir__Group__0 )
            {
             before(grammarAccess.getEscribirAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ( rule__Escribir__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:2: rule__Escribir__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__0_in_ruleEscribir874);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:452:1: entryRuleLeer : ruleLeer EOF ;
    public final void entryRuleLeer() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: ( ruleLeer EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:454:1: ruleLeer EOF
            {
             before(grammarAccess.getLeerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeer_in_entryRuleLeer901);
            ruleLeer();

            state._fsp--;

             after(grammarAccess.getLeerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeer908); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: ruleLeer : ( ( rule__Leer__Group__0 ) ) ;
    public final void ruleLeer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:465:2: ( ( ( rule__Leer__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__Leer__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__Leer__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:467:1: ( rule__Leer__Group__0 )
            {
             before(grammarAccess.getLeerAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( rule__Leer__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:2: rule__Leer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__0_in_ruleLeer934);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:480:1: entryRuleSi : ruleSi EOF ;
    public final void entryRuleSi() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:481:1: ( ruleSi EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: ruleSi EOF
            {
             before(grammarAccess.getSiRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSi_in_entryRuleSi961);
            ruleSi();

            state._fsp--;

             after(grammarAccess.getSiRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSi968); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: ruleSi : ( ( rule__Si__Group__0 ) ) ;
    public final void ruleSi() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:493:2: ( ( ( rule__Si__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( ( rule__Si__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( ( rule__Si__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: ( rule__Si__Group__0 )
            {
             before(grammarAccess.getSiAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( rule__Si__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:2: rule__Si__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__0_in_ruleSi994);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:508:1: entryRulemientras : rulemientras EOF ;
    public final void entryRulemientras() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: ( rulemientras EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: rulemientras EOF
            {
             before(grammarAccess.getMientrasRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemientras_in_entryRulemientras1021);
            rulemientras();

            state._fsp--;

             after(grammarAccess.getMientrasRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemientras1028); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:517:1: rulemientras : ( ( rule__Mientras__Group__0 ) ) ;
    public final void rulemientras() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:521:2: ( ( ( rule__Mientras__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( ( rule__Mientras__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( ( rule__Mientras__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: ( rule__Mientras__Group__0 )
            {
             before(grammarAccess.getMientrasAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( rule__Mientras__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:2: rule__Mientras__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__0_in_rulemientras1054);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:536:1: entryRulerepetir : rulerepetir EOF ;
    public final void entryRulerepetir() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: ( rulerepetir EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: rulerepetir EOF
            {
             before(grammarAccess.getRepetirRule()); 
            pushFollow(FollowSets000.FOLLOW_rulerepetir_in_entryRulerepetir1081);
            rulerepetir();

            state._fsp--;

             after(grammarAccess.getRepetirRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulerepetir1088); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:545:1: rulerepetir : ( ( rule__Repetir__Group__0 ) ) ;
    public final void rulerepetir() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:549:2: ( ( ( rule__Repetir__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( rule__Repetir__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( rule__Repetir__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( rule__Repetir__Group__0 )
            {
             before(grammarAccess.getRepetirAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( rule__Repetir__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:2: rule__Repetir__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__0_in_rulerepetir1114);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:564:1: entryRuledesde : ruledesde EOF ;
    public final void entryRuledesde() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: ( ruledesde EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: ruledesde EOF
            {
             before(grammarAccess.getDesdeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruledesde_in_entryRuledesde1141);
            ruledesde();

            state._fsp--;

             after(grammarAccess.getDesdeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuledesde1148); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: ruledesde : ( ( rule__Desde__Group__0 ) ) ;
    public final void ruledesde() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:577:2: ( ( ( rule__Desde__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( ( rule__Desde__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( ( rule__Desde__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( rule__Desde__Group__0 )
            {
             before(grammarAccess.getDesdeAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( rule__Desde__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:2: rule__Desde__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__0_in_ruledesde1174);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: entryRuleincremento : ruleincremento EOF ;
    public final void entryRuleincremento() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:593:1: ( ruleincremento EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: ruleincremento EOF
            {
             before(grammarAccess.getIncrementoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleincremento_in_entryRuleincremento1201);
            ruleincremento();

            state._fsp--;

             after(grammarAccess.getIncrementoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleincremento1208); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: ruleincremento : ( ( rule__Incremento__Group__0 ) ) ;
    public final void ruleincremento() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:2: ( ( ( rule__Incremento__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( ( rule__Incremento__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( ( rule__Incremento__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ( rule__Incremento__Group__0 )
            {
             before(grammarAccess.getIncrementoAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( rule__Incremento__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:2: rule__Incremento__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__Group__0_in_ruleincremento1234);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:620:1: entryRuleTipoVariable : ruleTipoVariable EOF ;
    public final void entryRuleTipoVariable() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:621:1: ( ruleTipoVariable EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: ruleTipoVariable EOF
            {
             before(grammarAccess.getTipoVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable1261);
            ruleTipoVariable();

            state._fsp--;

             after(grammarAccess.getTipoVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoVariable1268); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:629:1: ruleTipoVariable : ( ( rule__TipoVariable__Alternatives ) ) ;
    public final void ruleTipoVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:633:2: ( ( ( rule__TipoVariable__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: ( ( rule__TipoVariable__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: ( ( rule__TipoVariable__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( rule__TipoVariable__Alternatives )
            {
             before(grammarAccess.getTipoVariableAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( rule__TipoVariable__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:2: rule__TipoVariable__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__TipoVariable__Alternatives_in_ruleTipoVariable1294);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: ( ruleVariable EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable1321);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable1328); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:657:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:661:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:662:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:662:1: ( ( rule__Variable__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( rule__Variable__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:2: rule__Variable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0_in_ruleVariable1354);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:676:1: entryRuleVariableID : ruleVariableID EOF ;
    public final void entryRuleVariableID() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:677:1: ( ruleVariableID EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: ruleVariableID EOF
            {
             before(grammarAccess.getVariableIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_entryRuleVariableID1381);
            ruleVariableID();

            state._fsp--;

             after(grammarAccess.getVariableIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableID1388); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:685:1: ruleVariableID : ( ( rule__VariableID__Group__0 ) ) ;
    public final void ruleVariableID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:689:2: ( ( ( rule__VariableID__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ( ( rule__VariableID__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ( ( rule__VariableID__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( rule__VariableID__Group__0 )
            {
             before(grammarAccess.getVariableIDAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ( rule__VariableID__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:2: rule__VariableID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__0_in_ruleVariableID1414);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: entryRuleConstCadena : ruleConstCadena EOF ;
    public final void entryRuleConstCadena() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:705:1: ( ruleConstCadena EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ruleConstCadena EOF
            {
             before(grammarAccess.getConstCadenaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_entryRuleConstCadena1441);
            ruleConstCadena();

            state._fsp--;

             after(grammarAccess.getConstCadenaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstCadena1448); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ruleConstCadena : ( ( rule__ConstCadena__ContenidoAssignment ) ) ;
    public final void ruleConstCadena() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:717:2: ( ( ( rule__ConstCadena__ContenidoAssignment ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:718:1: ( ( rule__ConstCadena__ContenidoAssignment ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:718:1: ( ( rule__ConstCadena__ContenidoAssignment ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( rule__ConstCadena__ContenidoAssignment )
            {
             before(grammarAccess.getConstCadenaAccess().getContenidoAssignment()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( rule__ConstCadena__ContenidoAssignment )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:2: rule__ConstCadena__ContenidoAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstCadena__ContenidoAssignment_in_ruleConstCadena1474);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: entryRuleNumeroEntero : ruleNumeroEntero EOF ;
    public final void entryRuleNumeroEntero() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: ( ruleNumeroEntero EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: ruleNumeroEntero EOF
            {
             before(grammarAccess.getNumeroEnteroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_entryRuleNumeroEntero1501);
            ruleNumeroEntero();

            state._fsp--;

             after(grammarAccess.getNumeroEnteroRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumeroEntero1508); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: ruleNumeroEntero : ( ( rule__NumeroEntero__ValorAssignment ) ) ;
    public final void ruleNumeroEntero() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:745:2: ( ( ( rule__NumeroEntero__ValorAssignment ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:746:1: ( ( rule__NumeroEntero__ValorAssignment ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:746:1: ( ( rule__NumeroEntero__ValorAssignment ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: ( rule__NumeroEntero__ValorAssignment )
            {
             before(grammarAccess.getNumeroEnteroAccess().getValorAssignment()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: ( rule__NumeroEntero__ValorAssignment )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:748:2: rule__NumeroEntero__ValorAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumeroEntero__ValorAssignment_in_ruleNumeroEntero1534);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:760:1: entryRuleNumeroDecimal : ruleNumeroDecimal EOF ;
    public final void entryRuleNumeroDecimal() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:761:1: ( ruleNumeroDecimal EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: ruleNumeroDecimal EOF
            {
             before(grammarAccess.getNumeroDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_entryRuleNumeroDecimal1561);
            ruleNumeroDecimal();

            state._fsp--;

             after(grammarAccess.getNumeroDecimalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumeroDecimal1568); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: ruleNumeroDecimal : ( ( rule__NumeroDecimal__ValorAssignment ) ) ;
    public final void ruleNumeroDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:773:2: ( ( ( rule__NumeroDecimal__ValorAssignment ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: ( ( rule__NumeroDecimal__ValorAssignment ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: ( ( rule__NumeroDecimal__ValorAssignment ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:775:1: ( rule__NumeroDecimal__ValorAssignment )
            {
             before(grammarAccess.getNumeroDecimalAccess().getValorAssignment()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: ( rule__NumeroDecimal__ValorAssignment )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:776:2: rule__NumeroDecimal__ValorAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumeroDecimal__ValorAssignment_in_ruleNumeroDecimal1594);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:788:1: entryRuleValorBooleano : ruleValorBooleano EOF ;
    public final void entryRuleValorBooleano() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: ( ruleValorBooleano EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: ruleValorBooleano EOF
            {
             before(grammarAccess.getValorBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_entryRuleValorBooleano1621);
            ruleValorBooleano();

            state._fsp--;

             after(grammarAccess.getValorBooleanoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValorBooleano1628); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ruleValorBooleano : ( ( rule__ValorBooleano__ValorAssignment ) ) ;
    public final void ruleValorBooleano() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:801:2: ( ( ( rule__ValorBooleano__ValorAssignment ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:802:1: ( ( rule__ValorBooleano__ValorAssignment ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:802:1: ( ( rule__ValorBooleano__ValorAssignment ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: ( rule__ValorBooleano__ValorAssignment )
            {
             before(grammarAccess.getValorBooleanoAccess().getValorAssignment()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:804:1: ( rule__ValorBooleano__ValorAssignment )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:804:2: rule__ValorBooleano__ValorAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValorBooleano__ValorAssignment_in_ruleValorBooleano1654);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:816:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:817:1: ( ruleEInt EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:818:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1681);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1688); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:829:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( ( rule__EInt__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: ( rule__EInt__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt1714);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:844:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:845:1: ( ruleEFloat EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:846:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat1741);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat1748); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:853:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:857:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( ( rule__EFloat__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( ( rule__EFloat__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: ( rule__EFloat__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:860:2: rule__EFloat__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0_in_ruleEFloat1774);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:872:1: entryRulebooleano : rulebooleano EOF ;
    public final void entryRulebooleano() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:873:1: ( rulebooleano EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:874:1: rulebooleano EOF
            {
             before(grammarAccess.getBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleano_in_entryRulebooleano1801);
            rulebooleano();

            state._fsp--;

             after(grammarAccess.getBooleanoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulebooleano1808); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: rulebooleano : ( ( rule__Booleano__Alternatives ) ) ;
    public final void rulebooleano() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:885:2: ( ( ( rule__Booleano__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: ( ( rule__Booleano__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: ( ( rule__Booleano__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: ( rule__Booleano__Alternatives )
            {
             before(grammarAccess.getBooleanoAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: ( rule__Booleano__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:2: rule__Booleano__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Booleano__Alternatives_in_rulebooleano1834);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: entryRuleoperacion : ruleoperacion EOF ;
    public final void entryRuleoperacion() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:901:1: ( ruleoperacion EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: ruleoperacion EOF
            {
             before(grammarAccess.getOperacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_entryRuleoperacion1861);
            ruleoperacion();

            state._fsp--;

             after(grammarAccess.getOperacionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperacion1868); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: ruleoperacion : ( ( rule__Operacion__Group__0 ) ) ;
    public final void ruleoperacion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:913:2: ( ( ( rule__Operacion__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: ( ( rule__Operacion__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: ( ( rule__Operacion__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:915:1: ( rule__Operacion__Group__0 )
            {
             before(grammarAccess.getOperacionAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: ( rule__Operacion__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:2: rule__Operacion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__0_in_ruleoperacion1894);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:928:1: entryRulesigno : rulesigno EOF ;
    public final void entryRulesigno() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:929:1: ( rulesigno EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:930:1: rulesigno EOF
            {
             before(grammarAccess.getSignoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesigno_in_entryRulesigno1921);
            rulesigno();

            state._fsp--;

             after(grammarAccess.getSignoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesigno1928); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:937:1: rulesigno : ( ( rule__Signo__Alternatives ) ) ;
    public final void rulesigno() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:941:2: ( ( ( rule__Signo__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:942:1: ( ( rule__Signo__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:942:1: ( ( rule__Signo__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:943:1: ( rule__Signo__Alternatives )
            {
             before(grammarAccess.getSignoAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:944:1: ( rule__Signo__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:944:2: rule__Signo__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signo__Alternatives_in_rulesigno1954);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:956:1: entryRuleoperando_izq : ruleoperando_izq EOF ;
    public final void entryRuleoperando_izq() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:957:1: ( ruleoperando_izq EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:958:1: ruleoperando_izq EOF
            {
             before(grammarAccess.getOperando_izqRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_izq_in_entryRuleoperando_izq1981);
            ruleoperando_izq();

            state._fsp--;

             after(grammarAccess.getOperando_izqRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperando_izq1988); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:965:1: ruleoperando_izq : ( ( rule__Operando_izq__Oper_izqAssignment ) ) ;
    public final void ruleoperando_izq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:969:2: ( ( ( rule__Operando_izq__Oper_izqAssignment ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:970:1: ( ( rule__Operando_izq__Oper_izqAssignment ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:970:1: ( ( rule__Operando_izq__Oper_izqAssignment ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:971:1: ( rule__Operando_izq__Oper_izqAssignment )
            {
             before(grammarAccess.getOperando_izqAccess().getOper_izqAssignment()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:972:1: ( rule__Operando_izq__Oper_izqAssignment )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:972:2: rule__Operando_izq__Oper_izqAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operando_izq__Oper_izqAssignment_in_ruleoperando_izq2014);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:984:1: entryRuleoperando_der : ruleoperando_der EOF ;
    public final void entryRuleoperando_der() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:985:1: ( ruleoperando_der EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:986:1: ruleoperando_der EOF
            {
             before(grammarAccess.getOperando_derRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_der_in_entryRuleoperando_der2041);
            ruleoperando_der();

            state._fsp--;

             after(grammarAccess.getOperando_derRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperando_der2048); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:993:1: ruleoperando_der : ( ( rule__Operando_der__Oper_derAssignment ) ) ;
    public final void ruleoperando_der() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:997:2: ( ( ( rule__Operando_der__Oper_derAssignment ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:998:1: ( ( rule__Operando_der__Oper_derAssignment ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:998:1: ( ( rule__Operando_der__Oper_derAssignment ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:999:1: ( rule__Operando_der__Oper_derAssignment )
            {
             before(grammarAccess.getOperando_derAccess().getOper_derAssignment()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:1: ( rule__Operando_der__Oper_derAssignment )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:2: rule__Operando_der__Oper_derAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operando_der__Oper_derAssignment_in_ruleoperando_der2074);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:1: entryRuleSino : ruleSino EOF ;
    public final void entryRuleSino() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: ( ruleSino EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:1: ruleSino EOF
            {
             before(grammarAccess.getSinoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSino_in_entryRuleSino2101);
            ruleSino();

            state._fsp--;

             after(grammarAccess.getSinoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSino2108); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1021:1: ruleSino : ( ( rule__Sino__Group__0 ) ) ;
    public final void ruleSino() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:2: ( ( ( rule__Sino__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: ( ( rule__Sino__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: ( ( rule__Sino__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1027:1: ( rule__Sino__Group__0 )
            {
             before(grammarAccess.getSinoAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:1: ( rule__Sino__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:2: rule__Sino__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__0_in_ruleSino2134);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:1: entryRuleinc : ruleinc EOF ;
    public final void entryRuleinc() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:1: ( ruleinc EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: ruleinc EOF
            {
             before(grammarAccess.getIncRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_entryRuleinc2161);
            ruleinc();

            state._fsp--;

             after(grammarAccess.getIncRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleinc2168); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1049:1: ruleinc : ( ( rule__Inc__Alternatives ) ) ;
    public final void ruleinc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:2: ( ( ( rule__Inc__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: ( ( rule__Inc__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: ( ( rule__Inc__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: ( rule__Inc__Alternatives )
            {
             before(grammarAccess.getIncAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:1: ( rule__Inc__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:2: rule__Inc__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inc__Alternatives_in_ruleinc2194);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: entryRuleParametroFuncion : ruleParametroFuncion EOF ;
    public final void entryRuleParametroFuncion() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:1: ( ruleParametroFuncion EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: ruleParametroFuncion EOF
            {
             before(grammarAccess.getParametroFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion2221);
            ruleParametroFuncion();

            state._fsp--;

             after(grammarAccess.getParametroFuncionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametroFuncion2228); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1077:1: ruleParametroFuncion : ( ( rule__ParametroFuncion__Group__0 ) ) ;
    public final void ruleParametroFuncion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:2: ( ( ( rule__ParametroFuncion__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: ( ( rule__ParametroFuncion__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: ( ( rule__ParametroFuncion__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:1: ( rule__ParametroFuncion__Group__0 )
            {
             before(grammarAccess.getParametroFuncionAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:1: ( rule__ParametroFuncion__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:2: rule__ParametroFuncion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__0_in_ruleParametroFuncion2254);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:1: entryRuleFuncion : ruleFuncion EOF ;
    public final void entryRuleFuncion() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:1: ( ruleFuncion EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:1: ruleFuncion EOF
            {
             before(grammarAccess.getFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_entryRuleFuncion2281);
            ruleFuncion();

            state._fsp--;

             after(grammarAccess.getFuncionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncion2288); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: ruleFuncion : ( ( rule__Funcion__Group__0 ) ) ;
    public final void ruleFuncion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:2: ( ( ( rule__Funcion__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:1: ( ( rule__Funcion__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:1: ( ( rule__Funcion__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1111:1: ( rule__Funcion__Group__0 )
            {
             before(grammarAccess.getFuncionAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: ( rule__Funcion__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:2: rule__Funcion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__0_in_ruleFuncion2314);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1124:1: entryRuleProcedimiento : ruleProcedimiento EOF ;
    public final void entryRuleProcedimiento() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1125:1: ( ruleProcedimiento EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:1: ruleProcedimiento EOF
            {
             before(grammarAccess.getProcedimientoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento2341);
            ruleProcedimiento();

            state._fsp--;

             after(grammarAccess.getProcedimientoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcedimiento2348); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:1: ruleProcedimiento : ( ( rule__Procedimiento__Group__0 ) ) ;
    public final void ruleProcedimiento() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1137:2: ( ( ( rule__Procedimiento__Group__0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: ( ( rule__Procedimiento__Group__0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: ( ( rule__Procedimiento__Group__0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:1: ( rule__Procedimiento__Group__0 )
            {
             before(grammarAccess.getProcedimientoAccess().getGroup()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1140:1: ( rule__Procedimiento__Group__0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1140:2: rule__Procedimiento__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__0_in_ruleProcedimiento2374);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: entryRuleTipoPaso : ruleTipoPaso EOF ;
    public final void entryRuleTipoPaso() throws RecognitionException {
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1153:1: ( ruleTipoPaso EOF )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1154:1: ruleTipoPaso EOF
            {
             before(grammarAccess.getTipoPasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso2401);
            ruleTipoPaso();

            state._fsp--;

             after(grammarAccess.getTipoPasoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoPaso2408); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1161:1: ruleTipoPaso : ( ( rule__TipoPaso__Alternatives ) ) ;
    public final void ruleTipoPaso() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:2: ( ( ( rule__TipoPaso__Alternatives ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1166:1: ( ( rule__TipoPaso__Alternatives ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1166:1: ( ( rule__TipoPaso__Alternatives ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:1: ( rule__TipoPaso__Alternatives )
            {
             before(grammarAccess.getTipoPasoAccess().getAlternatives()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:1: ( rule__TipoPaso__Alternatives )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:2: rule__TipoPaso__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__TipoPaso__Alternatives_in_ruleTipoPaso2434);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: rule__Subproceso__Alternatives : ( ( ruleFuncion ) | ( ruleProcedimiento ) );
    public final void rule__Subproceso__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1184:1: ( ( ruleFuncion ) | ( ruleProcedimiento ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=21 && LA1_0<=25)) ) {
                alt1=1;
            }
            else if ( (LA1_0==72) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1185:1: ( ruleFuncion )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1185:1: ( ruleFuncion )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1186:1: ruleFuncion
                    {
                     before(grammarAccess.getSubprocesoAccess().getFuncionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_rule__Subproceso__Alternatives2470);
                    ruleFuncion();

                    state._fsp--;

                     after(grammarAccess.getSubprocesoAccess().getFuncionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1191:6: ( ruleProcedimiento )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1191:6: ( ruleProcedimiento )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1192:1: ruleProcedimiento
                    {
                     before(grammarAccess.getSubprocesoAccess().getProcedimientoParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_rule__Subproceso__Alternatives2487);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: rule__Sentencias__Alternatives : ( ( ruleLlamadaFuncion ) | ( ruleAsignacion ) | ( ruleEscribir ) | ( ruleLeer ) | ( ruleSi ) | ( rulemientras ) | ( rulerepetir ) | ( ruledesde ) | ( ruleincremento ) );
    public final void rule__Sentencias__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:1: ( ( ruleLlamadaFuncion ) | ( ruleAsignacion ) | ( ruleEscribir ) | ( ruleLeer ) | ( ruleSi ) | ( rulemientras ) | ( rulerepetir ) | ( ruledesde ) | ( ruleincremento ) )
            int alt2=9;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1207:1: ( ruleLlamadaFuncion )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1207:1: ( ruleLlamadaFuncion )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1208:1: ruleLlamadaFuncion
                    {
                     before(grammarAccess.getSentenciasAccess().getLlamadaFuncionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_rule__Sentencias__Alternatives2519);
                    ruleLlamadaFuncion();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getLlamadaFuncionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1213:6: ( ruleAsignacion )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1213:6: ( ruleAsignacion )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1214:1: ruleAsignacion
                    {
                     before(grammarAccess.getSentenciasAccess().getAsignacionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_rule__Sentencias__Alternatives2536);
                    ruleAsignacion();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getAsignacionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1219:6: ( ruleEscribir )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1219:6: ( ruleEscribir )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1220:1: ruleEscribir
                    {
                     before(grammarAccess.getSentenciasAccess().getEscribirParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_rule__Sentencias__Alternatives2553);
                    ruleEscribir();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getEscribirParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1225:6: ( ruleLeer )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1225:6: ( ruleLeer )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1226:1: ruleLeer
                    {
                     before(grammarAccess.getSentenciasAccess().getLeerParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLeer_in_rule__Sentencias__Alternatives2570);
                    ruleLeer();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getLeerParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:6: ( ruleSi )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:6: ( ruleSi )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: ruleSi
                    {
                     before(grammarAccess.getSentenciasAccess().getSiParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSi_in_rule__Sentencias__Alternatives2587);
                    ruleSi();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getSiParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:6: ( rulemientras )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:6: ( rulemientras )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1238:1: rulemientras
                    {
                     before(grammarAccess.getSentenciasAccess().getMientrasParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_rulemientras_in_rule__Sentencias__Alternatives2604);
                    rulemientras();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getMientrasParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1243:6: ( rulerepetir )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1243:6: ( rulerepetir )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:1: rulerepetir
                    {
                     before(grammarAccess.getSentenciasAccess().getRepetirParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_rulerepetir_in_rule__Sentencias__Alternatives2621);
                    rulerepetir();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getRepetirParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1249:6: ( ruledesde )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1249:6: ( ruledesde )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1250:1: ruledesde
                    {
                     before(grammarAccess.getSentenciasAccess().getDesdeParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruledesde_in_rule__Sentencias__Alternatives2638);
                    ruledesde();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getDesdeParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1255:6: ( ruleincremento )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1255:6: ( ruleincremento )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1256:1: ruleincremento
                    {
                     before(grammarAccess.getSentenciasAccess().getIncrementoParserRuleCall_8()); 
                    pushFollow(FollowSets000.FOLLOW_ruleincremento_in_rule__Sentencias__Alternatives2655);
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


    // $ANTLR start "rule__NombreInterna__Alternatives"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1266:1: rule__NombreInterna__Alternatives : ( ( 'cos' ) | ( 'cuadrado' ) | ( 'exp' ) | ( 'ln' ) | ( 'log' ) | ( 'sen' ) | ( 'sqrt' ) );
    public final void rule__NombreInterna__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1270:1: ( ( 'cos' ) | ( 'cuadrado' ) | ( 'exp' ) | ( 'ln' ) | ( 'log' ) | ( 'sen' ) | ( 'sqrt' ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            case 19:
                {
                alt3=6;
                }
                break;
            case 20:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: ( 'cos' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: ( 'cos' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:1: 'cos'
                    {
                     before(grammarAccess.getNombreInternaAccess().getCosKeyword_0()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__NombreInterna__Alternatives2688); 
                     after(grammarAccess.getNombreInternaAccess().getCosKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1279:6: ( 'cuadrado' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1279:6: ( 'cuadrado' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:1: 'cuadrado'
                    {
                     before(grammarAccess.getNombreInternaAccess().getCuadradoKeyword_1()); 
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__NombreInterna__Alternatives2708); 
                     after(grammarAccess.getNombreInternaAccess().getCuadradoKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1287:6: ( 'exp' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1287:6: ( 'exp' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: 'exp'
                    {
                     before(grammarAccess.getNombreInternaAccess().getExpKeyword_2()); 
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__NombreInterna__Alternatives2728); 
                     after(grammarAccess.getNombreInternaAccess().getExpKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1295:6: ( 'ln' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1295:6: ( 'ln' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1296:1: 'ln'
                    {
                     before(grammarAccess.getNombreInternaAccess().getLnKeyword_3()); 
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__NombreInterna__Alternatives2748); 
                     after(grammarAccess.getNombreInternaAccess().getLnKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:6: ( 'log' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:6: ( 'log' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:1: 'log'
                    {
                     before(grammarAccess.getNombreInternaAccess().getLogKeyword_4()); 
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__NombreInterna__Alternatives2768); 
                     after(grammarAccess.getNombreInternaAccess().getLogKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1311:6: ( 'sen' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1311:6: ( 'sen' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1312:1: 'sen'
                    {
                     before(grammarAccess.getNombreInternaAccess().getSenKeyword_5()); 
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__NombreInterna__Alternatives2788); 
                     after(grammarAccess.getNombreInternaAccess().getSenKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:6: ( 'sqrt' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:6: ( 'sqrt' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:1: 'sqrt'
                    {
                     before(grammarAccess.getNombreInternaAccess().getSqrtKeyword_6()); 
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__NombreInterna__Alternatives2808); 
                     after(grammarAccess.getNombreInternaAccess().getSqrtKeyword_6()); 

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
    // $ANTLR end "rule__NombreInterna__Alternatives"


    // $ANTLR start "rule__Operador__Alternatives"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1332:1: rule__Operador__Alternatives : ( ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleCaracter ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleValorBooleano ) );
    public final void rule__Operador__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: ( ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleCaracter ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleValorBooleano ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_CAD:
                {
                alt4=2;
                }
                break;
            case RULE_CAR:
                {
                alt4=3;
                }
                break;
            case 31:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==RULE_INT) ) {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==67) ) {
                        alt4=5;
                    }
                    else if ( (LA4_5==EOF||LA4_5==47||LA4_5==52) ) {
                        alt4=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_4==67) ) {
                    alt4=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==67) ) {
                    alt4=5;
                }
                else if ( (LA4_5==EOF||LA4_5==47||LA4_5==52) ) {
                    alt4=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                alt4=5;
                }
                break;
            case 28:
            case 29:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1337:1: ( ruleVariableID )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1337:1: ( ruleVariableID )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1338:1: ruleVariableID
                    {
                     before(grammarAccess.getOperadorAccess().getVariableIDParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__Operador__Alternatives2842);
                    ruleVariableID();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getVariableIDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1343:6: ( ruleConstCadena )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1343:6: ( ruleConstCadena )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1344:1: ruleConstCadena
                    {
                     before(grammarAccess.getOperadorAccess().getConstCadenaParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_rule__Operador__Alternatives2859);
                    ruleConstCadena();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getConstCadenaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:6: ( ruleCaracter )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:6: ( ruleCaracter )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: ruleCaracter
                    {
                     before(grammarAccess.getOperadorAccess().getCaracterParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_rule__Operador__Alternatives2876);
                    ruleCaracter();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getCaracterParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1355:6: ( ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1355:6: ( ruleNumeroEntero )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1356:1: ruleNumeroEntero
                    {
                     before(grammarAccess.getOperadorAccess().getNumeroEnteroParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_rule__Operador__Alternatives2893);
                    ruleNumeroEntero();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getNumeroEnteroParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:6: ( ruleNumeroDecimal )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:6: ( ruleNumeroDecimal )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: ruleNumeroDecimal
                    {
                     before(grammarAccess.getOperadorAccess().getNumeroDecimalParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_rule__Operador__Alternatives2910);
                    ruleNumeroDecimal();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getNumeroDecimalParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:6: ( ruleValorBooleano )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:6: ( ruleValorBooleano )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1368:1: ruleValorBooleano
                    {
                     before(grammarAccess.getOperadorAccess().getValorBooleanoParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_rule__Operador__Alternatives2927);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1378:1: rule__Valor__Alternatives : ( ( ruleLlamadaFuncion ) | ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleoperacion ) | ( ruleValorBooleano ) | ( ruleCaracter ) | ( ruleInternas ) );
    public final void rule__Valor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:1: ( ( ruleLlamadaFuncion ) | ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleoperacion ) | ( ruleValorBooleano ) | ( ruleCaracter ) | ( ruleInternas ) )
            int alt5=9;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1383:1: ( ruleLlamadaFuncion )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1383:1: ( ruleLlamadaFuncion )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1384:1: ruleLlamadaFuncion
                    {
                     before(grammarAccess.getValorAccess().getLlamadaFuncionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_rule__Valor__Alternatives2959);
                    ruleLlamadaFuncion();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getLlamadaFuncionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:6: ( ruleVariableID )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:6: ( ruleVariableID )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: ruleVariableID
                    {
                     before(grammarAccess.getValorAccess().getVariableIDParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__Valor__Alternatives2976);
                    ruleVariableID();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getVariableIDParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1395:6: ( ruleConstCadena )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1395:6: ( ruleConstCadena )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1396:1: ruleConstCadena
                    {
                     before(grammarAccess.getValorAccess().getConstCadenaParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_rule__Valor__Alternatives2993);
                    ruleConstCadena();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getConstCadenaParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1401:6: ( ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1401:6: ( ruleNumeroEntero )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1402:1: ruleNumeroEntero
                    {
                     before(grammarAccess.getValorAccess().getNumeroEnteroParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_rule__Valor__Alternatives3010);
                    ruleNumeroEntero();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getNumeroEnteroParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:6: ( ruleNumeroDecimal )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:6: ( ruleNumeroDecimal )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1408:1: ruleNumeroDecimal
                    {
                     before(grammarAccess.getValorAccess().getNumeroDecimalParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_rule__Valor__Alternatives3027);
                    ruleNumeroDecimal();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getNumeroDecimalParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1413:6: ( ruleoperacion )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1413:6: ( ruleoperacion )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1414:1: ruleoperacion
                    {
                     before(grammarAccess.getValorAccess().getOperacionParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rule__Valor__Alternatives3044);
                    ruleoperacion();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getOperacionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:6: ( ruleValorBooleano )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:6: ( ruleValorBooleano )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1420:1: ruleValorBooleano
                    {
                     before(grammarAccess.getValorAccess().getValorBooleanoParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_rule__Valor__Alternatives3061);
                    ruleValorBooleano();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getValorBooleanoParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:6: ( ruleCaracter )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:6: ( ruleCaracter )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1426:1: ruleCaracter
                    {
                     before(grammarAccess.getValorAccess().getCaracterParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_rule__Valor__Alternatives3078);
                    ruleCaracter();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getCaracterParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:6: ( ruleInternas )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:6: ( ruleInternas )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1432:1: ruleInternas
                    {
                     before(grammarAccess.getValorAccess().getInternasParserRuleCall_8()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInternas_in_rule__Valor__Alternatives3095);
                    ruleInternas();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getInternasParserRuleCall_8()); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1446:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1447:1: ( RULE_STRING )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1447:1: ( RULE_STRING )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1448:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives3127); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:6: ( RULE_ID )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:6: ( RULE_ID )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives3144); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1464:1: rule__TipoVariable__Alternatives : ( ( 'entero' ) | ( 'caracter' ) | ( 'real' ) | ( 'logico' ) | ( 'cadena' ) );
    public final void rule__TipoVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: ( ( 'entero' ) | ( 'caracter' ) | ( 'real' ) | ( 'logico' ) | ( 'cadena' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            case 24:
                {
                alt7=4;
                }
                break;
            case 25:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1469:1: ( 'entero' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1469:1: ( 'entero' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1470:1: 'entero'
                    {
                     before(grammarAccess.getTipoVariableAccess().getEnteroKeyword_0()); 
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__TipoVariable__Alternatives3177); 
                     after(grammarAccess.getTipoVariableAccess().getEnteroKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1477:6: ( 'caracter' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1477:6: ( 'caracter' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:1: 'caracter'
                    {
                     before(grammarAccess.getTipoVariableAccess().getCaracterKeyword_1()); 
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__TipoVariable__Alternatives3197); 
                     after(grammarAccess.getTipoVariableAccess().getCaracterKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:6: ( 'real' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:6: ( 'real' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:1: 'real'
                    {
                     before(grammarAccess.getTipoVariableAccess().getRealKeyword_2()); 
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__TipoVariable__Alternatives3217); 
                     after(grammarAccess.getTipoVariableAccess().getRealKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1493:6: ( 'logico' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1493:6: ( 'logico' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1494:1: 'logico'
                    {
                     before(grammarAccess.getTipoVariableAccess().getLogicoKeyword_3()); 
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__TipoVariable__Alternatives3237); 
                     after(grammarAccess.getTipoVariableAccess().getLogicoKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1501:6: ( 'cadena' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1501:6: ( 'cadena' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1502:1: 'cadena'
                    {
                     before(grammarAccess.getTipoVariableAccess().getCadenaKeyword_4()); 
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__TipoVariable__Alternatives3257); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1514:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: ( ( 'E' ) | ( 'e' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: ( 'E' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: ( 'E' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1520:1: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__EFloat__Alternatives_4_03292); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1527:6: ( 'e' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1527:6: ( 'e' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1528:1: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__EFloat__Alternatives_4_03312); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1540:1: rule__Booleano__Alternatives : ( ( 'verdadero' ) | ( 'falso' ) );
    public final void rule__Booleano__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:1: ( ( 'verdadero' ) | ( 'falso' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            else if ( (LA9_0==29) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1545:1: ( 'verdadero' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1545:1: ( 'verdadero' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:1: 'verdadero'
                    {
                     before(grammarAccess.getBooleanoAccess().getVerdaderoKeyword_0()); 
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__Booleano__Alternatives3347); 
                     after(grammarAccess.getBooleanoAccess().getVerdaderoKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1553:6: ( 'falso' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1553:6: ( 'falso' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1554:1: 'falso'
                    {
                     before(grammarAccess.getBooleanoAccess().getFalsoKeyword_1()); 
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__Booleano__Alternatives3367); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1566:1: rule__Signo__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '<' ) | ( '>' ) | ( '>=' ) | ( '<=' ) | ( 'y' ) | ( 'o' ) | ( '==' ) | ( '!=' ) );
    public final void rule__Signo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '<' ) | ( '>' ) | ( '>=' ) | ( '<=' ) | ( 'y' ) | ( 'o' ) | ( '==' ) | ( '!=' ) )
            int alt10=12;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            case 33:
                {
                alt10=4;
                }
                break;
            case 34:
                {
                alt10=5;
                }
                break;
            case 35:
                {
                alt10=6;
                }
                break;
            case 36:
                {
                alt10=7;
                }
                break;
            case 37:
                {
                alt10=8;
                }
                break;
            case 38:
                {
                alt10=9;
                }
                break;
            case 39:
                {
                alt10=10;
                }
                break;
            case 40:
                {
                alt10=11;
                }
                break;
            case 41:
                {
                alt10=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:1: ( '+' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:1: ( '+' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1572:1: '+'
                    {
                     before(grammarAccess.getSignoAccess().getPlusSignKeyword_0()); 
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__Signo__Alternatives3402); 
                     after(grammarAccess.getSignoAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1579:6: ( '-' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1579:6: ( '-' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1580:1: '-'
                    {
                     before(grammarAccess.getSignoAccess().getHyphenMinusKeyword_1()); 
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__Signo__Alternatives3422); 
                     after(grammarAccess.getSignoAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1587:6: ( '*' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1587:6: ( '*' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:1: '*'
                    {
                     before(grammarAccess.getSignoAccess().getAsteriskKeyword_2()); 
                    match(input,32,FollowSets000.FOLLOW_32_in_rule__Signo__Alternatives3442); 
                     after(grammarAccess.getSignoAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1595:6: ( '/' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1595:6: ( '/' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:1: '/'
                    {
                     before(grammarAccess.getSignoAccess().getSolidusKeyword_3()); 
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__Signo__Alternatives3462); 
                     after(grammarAccess.getSignoAccess().getSolidusKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:6: ( '<' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:6: ( '<' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:1: '<'
                    {
                     before(grammarAccess.getSignoAccess().getLessThanSignKeyword_4()); 
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__Signo__Alternatives3482); 
                     after(grammarAccess.getSignoAccess().getLessThanSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1611:6: ( '>' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1611:6: ( '>' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:1: '>'
                    {
                     before(grammarAccess.getSignoAccess().getGreaterThanSignKeyword_5()); 
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__Signo__Alternatives3502); 
                     after(grammarAccess.getSignoAccess().getGreaterThanSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1619:6: ( '>=' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1619:6: ( '>=' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1620:1: '>='
                    {
                     before(grammarAccess.getSignoAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                    match(input,36,FollowSets000.FOLLOW_36_in_rule__Signo__Alternatives3522); 
                     after(grammarAccess.getSignoAccess().getGreaterThanSignEqualsSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1627:6: ( '<=' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1627:6: ( '<=' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1628:1: '<='
                    {
                     before(grammarAccess.getSignoAccess().getLessThanSignEqualsSignKeyword_7()); 
                    match(input,37,FollowSets000.FOLLOW_37_in_rule__Signo__Alternatives3542); 
                     after(grammarAccess.getSignoAccess().getLessThanSignEqualsSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:6: ( 'y' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:6: ( 'y' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1636:1: 'y'
                    {
                     before(grammarAccess.getSignoAccess().getYKeyword_8()); 
                    match(input,38,FollowSets000.FOLLOW_38_in_rule__Signo__Alternatives3562); 
                     after(grammarAccess.getSignoAccess().getYKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:6: ( 'o' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:6: ( 'o' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: 'o'
                    {
                     before(grammarAccess.getSignoAccess().getOKeyword_9()); 
                    match(input,39,FollowSets000.FOLLOW_39_in_rule__Signo__Alternatives3582); 
                     after(grammarAccess.getSignoAccess().getOKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:6: ( '==' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:6: ( '==' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1652:1: '=='
                    {
                     before(grammarAccess.getSignoAccess().getEqualsSignEqualsSignKeyword_10()); 
                    match(input,40,FollowSets000.FOLLOW_40_in_rule__Signo__Alternatives3602); 
                     after(grammarAccess.getSignoAccess().getEqualsSignEqualsSignKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1659:6: ( '!=' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1659:6: ( '!=' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1660:1: '!='
                    {
                     before(grammarAccess.getSignoAccess().getExclamationMarkEqualsSignKeyword_11()); 
                    match(input,41,FollowSets000.FOLLOW_41_in_rule__Signo__Alternatives3622); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1672:1: rule__Inc__Alternatives : ( ( '++' ) | ( '--' ) );
    public final void rule__Inc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1676:1: ( ( '++' ) | ( '--' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            else if ( (LA11_0==43) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1677:1: ( '++' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1677:1: ( '++' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: '++'
                    {
                     before(grammarAccess.getIncAccess().getPlusSignPlusSignKeyword_0()); 
                    match(input,42,FollowSets000.FOLLOW_42_in_rule__Inc__Alternatives3657); 
                     after(grammarAccess.getIncAccess().getPlusSignPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:6: ( '--' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:6: ( '--' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1686:1: '--'
                    {
                     before(grammarAccess.getIncAccess().getHyphenMinusHyphenMinusKeyword_1()); 
                    match(input,43,FollowSets000.FOLLOW_43_in_rule__Inc__Alternatives3677); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1698:1: rule__TipoPaso__Alternatives : ( ( 'E' ) | ( 'E/S' ) | ( 'S' ) );
    public final void rule__TipoPaso__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1702:1: ( ( 'E' ) | ( 'E/S' ) | ( 'S' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 44:
                {
                alt12=2;
                }
                break;
            case 45:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:1: ( 'E' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:1: ( 'E' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1704:1: 'E'
                    {
                     before(grammarAccess.getTipoPasoAccess().getEKeyword_0()); 
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__TipoPaso__Alternatives3712); 
                     after(grammarAccess.getTipoPasoAccess().getEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1711:6: ( 'E/S' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1711:6: ( 'E/S' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: 'E/S'
                    {
                     before(grammarAccess.getTipoPasoAccess().getESKeyword_1()); 
                    match(input,44,FollowSets000.FOLLOW_44_in_rule__TipoPaso__Alternatives3732); 
                     after(grammarAccess.getTipoPasoAccess().getESKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1719:6: ( 'S' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1719:6: ( 'S' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1720:1: 'S'
                    {
                     before(grammarAccess.getTipoPasoAccess().getSKeyword_2()); 
                    match(input,45,FollowSets000.FOLLOW_45_in_rule__TipoPaso__Alternatives3752); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1734:1: rule__Codigo__Group__0 : rule__Codigo__Group__0__Impl rule__Codigo__Group__1 ;
    public final void rule__Codigo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: ( rule__Codigo__Group__0__Impl rule__Codigo__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:2: rule__Codigo__Group__0__Impl rule__Codigo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group__0__Impl_in_rule__Codigo__Group__03784);
            rule__Codigo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group__1_in_rule__Codigo__Group__03787);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1746:1: rule__Codigo__Group__0__Impl : ( ( rule__Codigo__Group_0__0 )? ) ;
    public final void rule__Codigo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1750:1: ( ( ( rule__Codigo__Group_0__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1751:1: ( ( rule__Codigo__Group_0__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1751:1: ( ( rule__Codigo__Group_0__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1752:1: ( rule__Codigo__Group_0__0 )?
            {
             before(grammarAccess.getCodigoAccess().getGroup_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1753:1: ( rule__Codigo__Group_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=21 && LA13_0<=25)||LA13_0==72) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1753:2: rule__Codigo__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group_0__0_in_rule__Codigo__Group__0__Impl3814);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1763:1: rule__Codigo__Group__1 : rule__Codigo__Group__1__Impl ;
    public final void rule__Codigo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: ( rule__Codigo__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:2: rule__Codigo__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group__1__Impl_in_rule__Codigo__Group__13845);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:1: rule__Codigo__Group__1__Impl : ( ( rule__Codigo__TieneAssignment_1 ) ) ;
    public final void rule__Codigo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1778:1: ( ( ( rule__Codigo__TieneAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1779:1: ( ( rule__Codigo__TieneAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1779:1: ( ( rule__Codigo__TieneAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1780:1: ( rule__Codigo__TieneAssignment_1 )
            {
             before(grammarAccess.getCodigoAccess().getTieneAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:1: ( rule__Codigo__TieneAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:2: rule__Codigo__TieneAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__TieneAssignment_1_in_rule__Codigo__Group__1__Impl3872);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1795:1: rule__Codigo__Group_0__0 : rule__Codigo__Group_0__0__Impl rule__Codigo__Group_0__1 ;
    public final void rule__Codigo__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: ( rule__Codigo__Group_0__0__Impl rule__Codigo__Group_0__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:2: rule__Codigo__Group_0__0__Impl rule__Codigo__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group_0__0__Impl_in_rule__Codigo__Group_0__03906);
            rule__Codigo__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group_0__1_in_rule__Codigo__Group_0__03909);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1807:1: rule__Codigo__Group_0__0__Impl : ( ( rule__Codigo__FuncionAssignment_0_0 ) ) ;
    public final void rule__Codigo__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1811:1: ( ( ( rule__Codigo__FuncionAssignment_0_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1812:1: ( ( rule__Codigo__FuncionAssignment_0_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1812:1: ( ( rule__Codigo__FuncionAssignment_0_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1813:1: ( rule__Codigo__FuncionAssignment_0_0 )
            {
             before(grammarAccess.getCodigoAccess().getFuncionAssignment_0_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1814:1: ( rule__Codigo__FuncionAssignment_0_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1814:2: rule__Codigo__FuncionAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__FuncionAssignment_0_0_in_rule__Codigo__Group_0__0__Impl3936);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: rule__Codigo__Group_0__1 : rule__Codigo__Group_0__1__Impl ;
    public final void rule__Codigo__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1828:1: ( rule__Codigo__Group_0__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:2: rule__Codigo__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Codigo__Group_0__1__Impl_in_rule__Codigo__Group_0__13966);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1835:1: rule__Codigo__Group_0__1__Impl : ( ( rule__Codigo__FuncionAssignment_0_1 )* ) ;
    public final void rule__Codigo__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1839:1: ( ( ( rule__Codigo__FuncionAssignment_0_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1840:1: ( ( rule__Codigo__FuncionAssignment_0_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1840:1: ( ( rule__Codigo__FuncionAssignment_0_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1841:1: ( rule__Codigo__FuncionAssignment_0_1 )*
            {
             before(grammarAccess.getCodigoAccess().getFuncionAssignment_0_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1842:1: ( rule__Codigo__FuncionAssignment_0_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=21 && LA14_0<=25)||LA14_0==72) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1842:2: rule__Codigo__FuncionAssignment_0_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Codigo__FuncionAssignment_0_1_in_rule__Codigo__Group_0__1__Impl3993);
            	    rule__Codigo__FuncionAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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


    // $ANTLR start "rule__Internas__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: rule__Internas__Group__0 : rule__Internas__Group__0__Impl rule__Internas__Group__1 ;
    public final void rule__Internas__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: ( rule__Internas__Group__0__Impl rule__Internas__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:2: rule__Internas__Group__0__Impl rule__Internas__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group__0__Impl_in_rule__Internas__Group__04028);
            rule__Internas__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group__1_in_rule__Internas__Group__04031);
            rule__Internas__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__Group__0"


    // $ANTLR start "rule__Internas__Group__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:1: rule__Internas__Group__0__Impl : ( ( rule__Internas__NombreAssignment_0 ) ) ;
    public final void rule__Internas__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: ( ( ( rule__Internas__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1873:1: ( ( rule__Internas__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1873:1: ( ( rule__Internas__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1874:1: ( rule__Internas__NombreAssignment_0 )
            {
             before(grammarAccess.getInternasAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1875:1: ( rule__Internas__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1875:2: rule__Internas__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Internas__NombreAssignment_0_in_rule__Internas__Group__0__Impl4058);
            rule__Internas__NombreAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInternasAccess().getNombreAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__Group__0__Impl"


    // $ANTLR start "rule__Internas__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1885:1: rule__Internas__Group__1 : rule__Internas__Group__1__Impl rule__Internas__Group__2 ;
    public final void rule__Internas__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:1: ( rule__Internas__Group__1__Impl rule__Internas__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1890:2: rule__Internas__Group__1__Impl rule__Internas__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group__1__Impl_in_rule__Internas__Group__14088);
            rule__Internas__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group__2_in_rule__Internas__Group__14091);
            rule__Internas__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__Group__1"


    // $ANTLR start "rule__Internas__Group__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1897:1: rule__Internas__Group__1__Impl : ( '(' ) ;
    public final void rule__Internas__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1901:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1902:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1902:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1903:1: '('
            {
             before(grammarAccess.getInternasAccess().getLeftParenthesisKeyword_1()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Internas__Group__1__Impl4119); 
             after(grammarAccess.getInternasAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__Group__1__Impl"


    // $ANTLR start "rule__Internas__Group__2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1916:1: rule__Internas__Group__2 : rule__Internas__Group__2__Impl rule__Internas__Group__3 ;
    public final void rule__Internas__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1920:1: ( rule__Internas__Group__2__Impl rule__Internas__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:2: rule__Internas__Group__2__Impl rule__Internas__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group__2__Impl_in_rule__Internas__Group__24150);
            rule__Internas__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group__3_in_rule__Internas__Group__24153);
            rule__Internas__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__Group__2"


    // $ANTLR start "rule__Internas__Group__2__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1928:1: rule__Internas__Group__2__Impl : ( ( rule__Internas__OperadorAssignment_2 ) ) ;
    public final void rule__Internas__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1932:1: ( ( ( rule__Internas__OperadorAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1933:1: ( ( rule__Internas__OperadorAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1933:1: ( ( rule__Internas__OperadorAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1934:1: ( rule__Internas__OperadorAssignment_2 )
            {
             before(grammarAccess.getInternasAccess().getOperadorAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:1: ( rule__Internas__OperadorAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:2: rule__Internas__OperadorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Internas__OperadorAssignment_2_in_rule__Internas__Group__2__Impl4180);
            rule__Internas__OperadorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInternasAccess().getOperadorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__Group__2__Impl"


    // $ANTLR start "rule__Internas__Group__3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1945:1: rule__Internas__Group__3 : rule__Internas__Group__3__Impl ;
    public final void rule__Internas__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: ( rule__Internas__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:2: rule__Internas__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group__3__Impl_in_rule__Internas__Group__34210);
            rule__Internas__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__Group__3"


    // $ANTLR start "rule__Internas__Group__3__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1956:1: rule__Internas__Group__3__Impl : ( ')' ) ;
    public final void rule__Internas__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1960:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1962:1: ')'
            {
             before(grammarAccess.getInternasAccess().getRightParenthesisKeyword_3()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Internas__Group__3__Impl4238); 
             after(grammarAccess.getInternasAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__Group__3__Impl"


    // $ANTLR start "rule__Inicio__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1983:1: rule__Inicio__Group__0 : rule__Inicio__Group__0__Impl rule__Inicio__Group__1 ;
    public final void rule__Inicio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:1: ( rule__Inicio__Group__0__Impl rule__Inicio__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1988:2: rule__Inicio__Group__0__Impl rule__Inicio__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__0__Impl_in_rule__Inicio__Group__04277);
            rule__Inicio__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__1_in_rule__Inicio__Group__04280);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1995:1: rule__Inicio__Group__0__Impl : ( () ) ;
    public final void rule__Inicio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1999:1: ( ( () ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2000:1: ( () )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2000:1: ( () )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:1: ()
            {
             before(grammarAccess.getInicioAccess().getInicioAction_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2002:1: ()
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2004:1: 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2014:1: rule__Inicio__Group__1 : rule__Inicio__Group__1__Impl rule__Inicio__Group__2 ;
    public final void rule__Inicio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2018:1: ( rule__Inicio__Group__1__Impl rule__Inicio__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2019:2: rule__Inicio__Group__1__Impl rule__Inicio__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__1__Impl_in_rule__Inicio__Group__14338);
            rule__Inicio__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__2_in_rule__Inicio__Group__14341);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2026:1: rule__Inicio__Group__1__Impl : ( 'var' ) ;
    public final void rule__Inicio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2030:1: ( ( 'var' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2031:1: ( 'var' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2031:1: ( 'var' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2032:1: 'var'
            {
             before(grammarAccess.getInicioAccess().getVarKeyword_1()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Inicio__Group__1__Impl4369); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2045:1: rule__Inicio__Group__2 : rule__Inicio__Group__2__Impl rule__Inicio__Group__3 ;
    public final void rule__Inicio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2049:1: ( rule__Inicio__Group__2__Impl rule__Inicio__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2050:2: rule__Inicio__Group__2__Impl rule__Inicio__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__2__Impl_in_rule__Inicio__Group__24400);
            rule__Inicio__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__3_in_rule__Inicio__Group__24403);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:1: rule__Inicio__Group__2__Impl : ( ( rule__Inicio__Group_2__0 )? ) ;
    public final void rule__Inicio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2061:1: ( ( ( rule__Inicio__Group_2__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2062:1: ( ( rule__Inicio__Group_2__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2062:1: ( ( rule__Inicio__Group_2__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2063:1: ( rule__Inicio__Group_2__0 )?
            {
             before(grammarAccess.getInicioAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2064:1: ( rule__Inicio__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=21 && LA15_0<=25)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2064:2: rule__Inicio__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__0_in_rule__Inicio__Group__2__Impl4430);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:1: rule__Inicio__Group__3 : rule__Inicio__Group__3__Impl rule__Inicio__Group__4 ;
    public final void rule__Inicio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2078:1: ( rule__Inicio__Group__3__Impl rule__Inicio__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2079:2: rule__Inicio__Group__3__Impl rule__Inicio__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__3__Impl_in_rule__Inicio__Group__34461);
            rule__Inicio__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__4_in_rule__Inicio__Group__34464);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: rule__Inicio__Group__3__Impl : ( 'inicio' ) ;
    public final void rule__Inicio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:1: ( ( 'inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2091:1: ( 'inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2091:1: ( 'inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2092:1: 'inicio'
            {
             before(grammarAccess.getInicioAccess().getInicioKeyword_3()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Inicio__Group__3__Impl4492); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2105:1: rule__Inicio__Group__4 : rule__Inicio__Group__4__Impl rule__Inicio__Group__5 ;
    public final void rule__Inicio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: ( rule__Inicio__Group__4__Impl rule__Inicio__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2110:2: rule__Inicio__Group__4__Impl rule__Inicio__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__4__Impl_in_rule__Inicio__Group__44523);
            rule__Inicio__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__5_in_rule__Inicio__Group__44526);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: rule__Inicio__Group__4__Impl : ( ( rule__Inicio__Group_4__0 )? ) ;
    public final void rule__Inicio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2121:1: ( ( ( rule__Inicio__Group_4__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2122:1: ( ( rule__Inicio__Group_4__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2122:1: ( ( rule__Inicio__Group_4__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2123:1: ( rule__Inicio__Group_4__0 )?
            {
             before(grammarAccess.getInicioAccess().getGroup_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2124:1: ( rule__Inicio__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||(LA16_0>=54 && LA16_0<=56)||LA16_0==59||LA16_0==62||LA16_0==64) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2124:2: rule__Inicio__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_4__0_in_rule__Inicio__Group__4__Impl4553);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2134:1: rule__Inicio__Group__5 : rule__Inicio__Group__5__Impl ;
    public final void rule__Inicio__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2138:1: ( rule__Inicio__Group__5__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:2: rule__Inicio__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__5__Impl_in_rule__Inicio__Group__54584);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2145:1: rule__Inicio__Group__5__Impl : ( 'fin_inicio' ) ;
    public final void rule__Inicio__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2149:1: ( ( 'fin_inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:1: ( 'fin_inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:1: ( 'fin_inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2151:1: 'fin_inicio'
            {
             before(grammarAccess.getInicioAccess().getFin_inicioKeyword_5()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Inicio__Group__5__Impl4612); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:1: rule__Inicio__Group_2__0 : rule__Inicio__Group_2__0__Impl rule__Inicio__Group_2__1 ;
    public final void rule__Inicio__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:1: ( rule__Inicio__Group_2__0__Impl rule__Inicio__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2181:2: rule__Inicio__Group_2__0__Impl rule__Inicio__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__0__Impl_in_rule__Inicio__Group_2__04655);
            rule__Inicio__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__1_in_rule__Inicio__Group_2__04658);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2188:1: rule__Inicio__Group_2__0__Impl : ( ( rule__Inicio__DeclaracionvariableAssignment_2_0 ) ) ;
    public final void rule__Inicio__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2192:1: ( ( ( rule__Inicio__DeclaracionvariableAssignment_2_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: ( ( rule__Inicio__DeclaracionvariableAssignment_2_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: ( ( rule__Inicio__DeclaracionvariableAssignment_2_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2194:1: ( rule__Inicio__DeclaracionvariableAssignment_2_0 )
            {
             before(grammarAccess.getInicioAccess().getDeclaracionvariableAssignment_2_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:1: ( rule__Inicio__DeclaracionvariableAssignment_2_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:2: rule__Inicio__DeclaracionvariableAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__DeclaracionvariableAssignment_2_0_in_rule__Inicio__Group_2__0__Impl4685);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2205:1: rule__Inicio__Group_2__1 : rule__Inicio__Group_2__1__Impl ;
    public final void rule__Inicio__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: ( rule__Inicio__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:2: rule__Inicio__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__1__Impl_in_rule__Inicio__Group_2__14715);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2216:1: rule__Inicio__Group_2__1__Impl : ( ( rule__Inicio__DeclaracionvariableAssignment_2_1 )* ) ;
    public final void rule__Inicio__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2220:1: ( ( ( rule__Inicio__DeclaracionvariableAssignment_2_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2221:1: ( ( rule__Inicio__DeclaracionvariableAssignment_2_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2221:1: ( ( rule__Inicio__DeclaracionvariableAssignment_2_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2222:1: ( rule__Inicio__DeclaracionvariableAssignment_2_1 )*
            {
             before(grammarAccess.getInicioAccess().getDeclaracionvariableAssignment_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:1: ( rule__Inicio__DeclaracionvariableAssignment_2_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=21 && LA17_0<=25)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:2: rule__Inicio__DeclaracionvariableAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Inicio__DeclaracionvariableAssignment_2_1_in_rule__Inicio__Group_2__1__Impl4742);
            	    rule__Inicio__DeclaracionvariableAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2237:1: rule__Inicio__Group_4__0 : rule__Inicio__Group_4__0__Impl rule__Inicio__Group_4__1 ;
    public final void rule__Inicio__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:1: ( rule__Inicio__Group_4__0__Impl rule__Inicio__Group_4__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2242:2: rule__Inicio__Group_4__0__Impl rule__Inicio__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_4__0__Impl_in_rule__Inicio__Group_4__04777);
            rule__Inicio__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_4__1_in_rule__Inicio__Group_4__04780);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:1: rule__Inicio__Group_4__0__Impl : ( ( rule__Inicio__TieneAssignment_4_0 ) ) ;
    public final void rule__Inicio__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:1: ( ( ( rule__Inicio__TieneAssignment_4_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2254:1: ( ( rule__Inicio__TieneAssignment_4_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2254:1: ( ( rule__Inicio__TieneAssignment_4_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:1: ( rule__Inicio__TieneAssignment_4_0 )
            {
             before(grammarAccess.getInicioAccess().getTieneAssignment_4_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2256:1: ( rule__Inicio__TieneAssignment_4_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2256:2: rule__Inicio__TieneAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__TieneAssignment_4_0_in_rule__Inicio__Group_4__0__Impl4807);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2266:1: rule__Inicio__Group_4__1 : rule__Inicio__Group_4__1__Impl ;
    public final void rule__Inicio__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2270:1: ( rule__Inicio__Group_4__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2271:2: rule__Inicio__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_4__1__Impl_in_rule__Inicio__Group_4__14837);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2277:1: rule__Inicio__Group_4__1__Impl : ( ( rule__Inicio__TieneAssignment_4_1 )* ) ;
    public final void rule__Inicio__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:1: ( ( ( rule__Inicio__TieneAssignment_4_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2282:1: ( ( rule__Inicio__TieneAssignment_4_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2282:1: ( ( rule__Inicio__TieneAssignment_4_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2283:1: ( rule__Inicio__TieneAssignment_4_1 )*
            {
             before(grammarAccess.getInicioAccess().getTieneAssignment_4_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2284:1: ( rule__Inicio__TieneAssignment_4_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)||(LA18_0>=54 && LA18_0<=56)||LA18_0==59||LA18_0==62||LA18_0==64) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2284:2: rule__Inicio__TieneAssignment_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Inicio__TieneAssignment_4_1_in_rule__Inicio__Group_4__1__Impl4864);
            	    rule__Inicio__TieneAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:1: rule__DeclaracionVariable__Group__0 : rule__DeclaracionVariable__Group__0__Impl rule__DeclaracionVariable__Group__1 ;
    public final void rule__DeclaracionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:1: ( rule__DeclaracionVariable__Group__0__Impl rule__DeclaracionVariable__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:2: rule__DeclaracionVariable__Group__0__Impl rule__DeclaracionVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__0__Impl_in_rule__DeclaracionVariable__Group__04899);
            rule__DeclaracionVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__1_in_rule__DeclaracionVariable__Group__04902);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2310:1: rule__DeclaracionVariable__Group__0__Impl : ( ( ( rule__DeclaracionVariable__TipoAssignment_0 ) ) ( ( rule__DeclaracionVariable__TipoAssignment_0 )* ) ) ;
    public final void rule__DeclaracionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2314:1: ( ( ( ( rule__DeclaracionVariable__TipoAssignment_0 ) ) ( ( rule__DeclaracionVariable__TipoAssignment_0 )* ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2315:1: ( ( ( rule__DeclaracionVariable__TipoAssignment_0 ) ) ( ( rule__DeclaracionVariable__TipoAssignment_0 )* ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2315:1: ( ( ( rule__DeclaracionVariable__TipoAssignment_0 ) ) ( ( rule__DeclaracionVariable__TipoAssignment_0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2316:1: ( ( rule__DeclaracionVariable__TipoAssignment_0 ) ) ( ( rule__DeclaracionVariable__TipoAssignment_0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2316:1: ( ( rule__DeclaracionVariable__TipoAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2317:1: ( rule__DeclaracionVariable__TipoAssignment_0 )
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTipoAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2318:1: ( rule__DeclaracionVariable__TipoAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2318:2: rule__DeclaracionVariable__TipoAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__TipoAssignment_0_in_rule__DeclaracionVariable__Group__0__Impl4931);
            rule__DeclaracionVariable__TipoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracionVariableAccess().getTipoAssignment_0()); 

            }

            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2321:1: ( ( rule__DeclaracionVariable__TipoAssignment_0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2322:1: ( rule__DeclaracionVariable__TipoAssignment_0 )*
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTipoAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2323:1: ( rule__DeclaracionVariable__TipoAssignment_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=21 && LA19_0<=25)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2323:2: rule__DeclaracionVariable__TipoAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__TipoAssignment_0_in_rule__DeclaracionVariable__Group__0__Impl4943);
            	    rule__DeclaracionVariable__TipoAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getDeclaracionVariableAccess().getTipoAssignment_0()); 

            }


            }


            }

        }
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2334:1: rule__DeclaracionVariable__Group__1 : rule__DeclaracionVariable__Group__1__Impl rule__DeclaracionVariable__Group__2 ;
    public final void rule__DeclaracionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2338:1: ( rule__DeclaracionVariable__Group__1__Impl rule__DeclaracionVariable__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2339:2: rule__DeclaracionVariable__Group__1__Impl rule__DeclaracionVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__1__Impl_in_rule__DeclaracionVariable__Group__14976);
            rule__DeclaracionVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__2_in_rule__DeclaracionVariable__Group__14979);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:1: rule__DeclaracionVariable__Group__1__Impl : ( ':' ) ;
    public final void rule__DeclaracionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2350:1: ( ( ':' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:1: ( ':' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:1: ( ':' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2352:1: ':'
            {
             before(grammarAccess.getDeclaracionVariableAccess().getColonKeyword_1()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__DeclaracionVariable__Group__1__Impl5007); 
             after(grammarAccess.getDeclaracionVariableAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2365:1: rule__DeclaracionVariable__Group__2 : rule__DeclaracionVariable__Group__2__Impl rule__DeclaracionVariable__Group__3 ;
    public final void rule__DeclaracionVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2369:1: ( rule__DeclaracionVariable__Group__2__Impl rule__DeclaracionVariable__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2370:2: rule__DeclaracionVariable__Group__2__Impl rule__DeclaracionVariable__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__2__Impl_in_rule__DeclaracionVariable__Group__25038);
            rule__DeclaracionVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__3_in_rule__DeclaracionVariable__Group__25041);
            rule__DeclaracionVariable__Group__3();

            state._fsp--;


            }

        }
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2377:1: rule__DeclaracionVariable__Group__2__Impl : ( ( rule__DeclaracionVariable__TieneIDsAssignment_2 ) ) ;
    public final void rule__DeclaracionVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2381:1: ( ( ( rule__DeclaracionVariable__TieneIDsAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2382:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2382:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2383:1: ( rule__DeclaracionVariable__TieneIDsAssignment_2 )
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: ( rule__DeclaracionVariable__TieneIDsAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:2: rule__DeclaracionVariable__TieneIDsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_2_in_rule__DeclaracionVariable__Group__2__Impl5068);
            rule__DeclaracionVariable__TieneIDsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracionVariableAccess().getTieneIDsAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__DeclaracionVariable__Group__3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2394:1: rule__DeclaracionVariable__Group__3 : rule__DeclaracionVariable__Group__3__Impl ;
    public final void rule__DeclaracionVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2398:1: ( rule__DeclaracionVariable__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2399:2: rule__DeclaracionVariable__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__3__Impl_in_rule__DeclaracionVariable__Group__35098);
            rule__DeclaracionVariable__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__Group__3"


    // $ANTLR start "rule__DeclaracionVariable__Group__3__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2405:1: rule__DeclaracionVariable__Group__3__Impl : ( ( rule__DeclaracionVariable__Group_3__0 )* ) ;
    public final void rule__DeclaracionVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2409:1: ( ( ( rule__DeclaracionVariable__Group_3__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2410:1: ( ( rule__DeclaracionVariable__Group_3__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2410:1: ( ( rule__DeclaracionVariable__Group_3__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2411:1: ( rule__DeclaracionVariable__Group_3__0 )*
            {
             before(grammarAccess.getDeclaracionVariableAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2412:1: ( rule__DeclaracionVariable__Group_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==52) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2412:2: rule__DeclaracionVariable__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_3__0_in_rule__DeclaracionVariable__Group__3__Impl5125);
            	    rule__DeclaracionVariable__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getDeclaracionVariableAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__Group__3__Impl"


    // $ANTLR start "rule__DeclaracionVariable__Group_3__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2430:1: rule__DeclaracionVariable__Group_3__0 : rule__DeclaracionVariable__Group_3__0__Impl rule__DeclaracionVariable__Group_3__1 ;
    public final void rule__DeclaracionVariable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2434:1: ( rule__DeclaracionVariable__Group_3__0__Impl rule__DeclaracionVariable__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2435:2: rule__DeclaracionVariable__Group_3__0__Impl rule__DeclaracionVariable__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_3__0__Impl_in_rule__DeclaracionVariable__Group_3__05164);
            rule__DeclaracionVariable__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_3__1_in_rule__DeclaracionVariable__Group_3__05167);
            rule__DeclaracionVariable__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__Group_3__0"


    // $ANTLR start "rule__DeclaracionVariable__Group_3__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2442:1: rule__DeclaracionVariable__Group_3__0__Impl : ( ',' ) ;
    public final void rule__DeclaracionVariable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2446:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2447:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2447:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:1: ','
            {
             before(grammarAccess.getDeclaracionVariableAccess().getCommaKeyword_3_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__DeclaracionVariable__Group_3__0__Impl5195); 
             after(grammarAccess.getDeclaracionVariableAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__Group_3__0__Impl"


    // $ANTLR start "rule__DeclaracionVariable__Group_3__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2461:1: rule__DeclaracionVariable__Group_3__1 : rule__DeclaracionVariable__Group_3__1__Impl ;
    public final void rule__DeclaracionVariable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:1: ( rule__DeclaracionVariable__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:2: rule__DeclaracionVariable__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_3__1__Impl_in_rule__DeclaracionVariable__Group_3__15226);
            rule__DeclaracionVariable__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__Group_3__1"


    // $ANTLR start "rule__DeclaracionVariable__Group_3__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2472:1: rule__DeclaracionVariable__Group_3__1__Impl : ( ( rule__DeclaracionVariable__TieneIDsAssignment_3_1 ) ) ;
    public final void rule__DeclaracionVariable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2476:1: ( ( ( rule__DeclaracionVariable__TieneIDsAssignment_3_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_3_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_3_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2478:1: ( rule__DeclaracionVariable__TieneIDsAssignment_3_1 )
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsAssignment_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2479:1: ( rule__DeclaracionVariable__TieneIDsAssignment_3_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2479:2: rule__DeclaracionVariable__TieneIDsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_3_1_in_rule__DeclaracionVariable__Group_3__1__Impl5253);
            rule__DeclaracionVariable__TieneIDsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracionVariableAccess().getTieneIDsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__Group_3__1__Impl"


    // $ANTLR start "rule__LlamadaFuncion__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2493:1: rule__LlamadaFuncion__Group__0 : rule__LlamadaFuncion__Group__0__Impl rule__LlamadaFuncion__Group__1 ;
    public final void rule__LlamadaFuncion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:1: ( rule__LlamadaFuncion__Group__0__Impl rule__LlamadaFuncion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2498:2: rule__LlamadaFuncion__Group__0__Impl rule__LlamadaFuncion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__0__Impl_in_rule__LlamadaFuncion__Group__05287);
            rule__LlamadaFuncion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__1_in_rule__LlamadaFuncion__Group__05290);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:1: rule__LlamadaFuncion__Group__0__Impl : ( ( rule__LlamadaFuncion__NombreAssignment_0 ) ) ;
    public final void rule__LlamadaFuncion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2509:1: ( ( ( rule__LlamadaFuncion__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2510:1: ( ( rule__LlamadaFuncion__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2510:1: ( ( rule__LlamadaFuncion__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:1: ( rule__LlamadaFuncion__NombreAssignment_0 )
            {
             before(grammarAccess.getLlamadaFuncionAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:1: ( rule__LlamadaFuncion__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:2: rule__LlamadaFuncion__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__NombreAssignment_0_in_rule__LlamadaFuncion__Group__0__Impl5317);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2522:1: rule__LlamadaFuncion__Group__1 : rule__LlamadaFuncion__Group__1__Impl rule__LlamadaFuncion__Group__2 ;
    public final void rule__LlamadaFuncion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:1: ( rule__LlamadaFuncion__Group__1__Impl rule__LlamadaFuncion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2527:2: rule__LlamadaFuncion__Group__1__Impl rule__LlamadaFuncion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__1__Impl_in_rule__LlamadaFuncion__Group__15347);
            rule__LlamadaFuncion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__2_in_rule__LlamadaFuncion__Group__15350);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:1: rule__LlamadaFuncion__Group__1__Impl : ( '(' ) ;
    public final void rule__LlamadaFuncion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2539:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2539:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2540:1: '('
            {
             before(grammarAccess.getLlamadaFuncionAccess().getLeftParenthesisKeyword_1()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__LlamadaFuncion__Group__1__Impl5378); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2553:1: rule__LlamadaFuncion__Group__2 : rule__LlamadaFuncion__Group__2__Impl rule__LlamadaFuncion__Group__3 ;
    public final void rule__LlamadaFuncion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2557:1: ( rule__LlamadaFuncion__Group__2__Impl rule__LlamadaFuncion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2558:2: rule__LlamadaFuncion__Group__2__Impl rule__LlamadaFuncion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__2__Impl_in_rule__LlamadaFuncion__Group__25409);
            rule__LlamadaFuncion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__3_in_rule__LlamadaFuncion__Group__25412);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2565:1: rule__LlamadaFuncion__Group__2__Impl : ( ( rule__LlamadaFuncion__Group_2__0 )? ) ;
    public final void rule__LlamadaFuncion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2569:1: ( ( ( rule__LlamadaFuncion__Group_2__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2570:1: ( ( rule__LlamadaFuncion__Group_2__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2570:1: ( ( rule__LlamadaFuncion__Group_2__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2571:1: ( rule__LlamadaFuncion__Group_2__0 )?
            {
             before(grammarAccess.getLlamadaFuncionAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2572:1: ( rule__LlamadaFuncion__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_CAR)||LA21_0==RULE_CAD||(LA21_0>=28 && LA21_0<=29)||LA21_0==31||LA21_0==67) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2572:2: rule__LlamadaFuncion__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__0_in_rule__LlamadaFuncion__Group__2__Impl5439);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:1: rule__LlamadaFuncion__Group__3 : rule__LlamadaFuncion__Group__3__Impl ;
    public final void rule__LlamadaFuncion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:1: ( rule__LlamadaFuncion__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2587:2: rule__LlamadaFuncion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__3__Impl_in_rule__LlamadaFuncion__Group__35470);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2593:1: rule__LlamadaFuncion__Group__3__Impl : ( ')' ) ;
    public final void rule__LlamadaFuncion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2597:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2599:1: ')'
            {
             before(grammarAccess.getLlamadaFuncionAccess().getRightParenthesisKeyword_3()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__LlamadaFuncion__Group__3__Impl5498); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2620:1: rule__LlamadaFuncion__Group_2__0 : rule__LlamadaFuncion__Group_2__0__Impl rule__LlamadaFuncion__Group_2__1 ;
    public final void rule__LlamadaFuncion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2624:1: ( rule__LlamadaFuncion__Group_2__0__Impl rule__LlamadaFuncion__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2625:2: rule__LlamadaFuncion__Group_2__0__Impl rule__LlamadaFuncion__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__0__Impl_in_rule__LlamadaFuncion__Group_2__05537);
            rule__LlamadaFuncion__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__1_in_rule__LlamadaFuncion__Group_2__05540);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2632:1: rule__LlamadaFuncion__Group_2__0__Impl : ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) ) ;
    public final void rule__LlamadaFuncion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2636:1: ( ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2637:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2637:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2638:1: ( rule__LlamadaFuncion__OperadorAssignment_2_0 )
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorAssignment_2_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2639:1: ( rule__LlamadaFuncion__OperadorAssignment_2_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2639:2: rule__LlamadaFuncion__OperadorAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_0_in_rule__LlamadaFuncion__Group_2__0__Impl5567);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2649:1: rule__LlamadaFuncion__Group_2__1 : rule__LlamadaFuncion__Group_2__1__Impl ;
    public final void rule__LlamadaFuncion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2653:1: ( rule__LlamadaFuncion__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2654:2: rule__LlamadaFuncion__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__1__Impl_in_rule__LlamadaFuncion__Group_2__15597);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2660:1: rule__LlamadaFuncion__Group_2__1__Impl : ( ( rule__LlamadaFuncion__Group_2_1__0 )* ) ;
    public final void rule__LlamadaFuncion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2664:1: ( ( ( rule__LlamadaFuncion__Group_2_1__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: ( ( rule__LlamadaFuncion__Group_2_1__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: ( ( rule__LlamadaFuncion__Group_2_1__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2666:1: ( rule__LlamadaFuncion__Group_2_1__0 )*
            {
             before(grammarAccess.getLlamadaFuncionAccess().getGroup_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2667:1: ( rule__LlamadaFuncion__Group_2_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==52) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2667:2: rule__LlamadaFuncion__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__0_in_rule__LlamadaFuncion__Group_2__1__Impl5624);
            	    rule__LlamadaFuncion__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2681:1: rule__LlamadaFuncion__Group_2_1__0 : rule__LlamadaFuncion__Group_2_1__0__Impl rule__LlamadaFuncion__Group_2_1__1 ;
    public final void rule__LlamadaFuncion__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2685:1: ( rule__LlamadaFuncion__Group_2_1__0__Impl rule__LlamadaFuncion__Group_2_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2686:2: rule__LlamadaFuncion__Group_2_1__0__Impl rule__LlamadaFuncion__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__0__Impl_in_rule__LlamadaFuncion__Group_2_1__05659);
            rule__LlamadaFuncion__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__1_in_rule__LlamadaFuncion__Group_2_1__05662);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2693:1: rule__LlamadaFuncion__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__LlamadaFuncion__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2697:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2698:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2698:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2699:1: ','
            {
             before(grammarAccess.getLlamadaFuncionAccess().getCommaKeyword_2_1_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__LlamadaFuncion__Group_2_1__0__Impl5690); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2712:1: rule__LlamadaFuncion__Group_2_1__1 : rule__LlamadaFuncion__Group_2_1__1__Impl ;
    public final void rule__LlamadaFuncion__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2716:1: ( rule__LlamadaFuncion__Group_2_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2717:2: rule__LlamadaFuncion__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__1__Impl_in_rule__LlamadaFuncion__Group_2_1__15721);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2723:1: rule__LlamadaFuncion__Group_2_1__1__Impl : ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) ) ;
    public final void rule__LlamadaFuncion__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2727:1: ( ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2728:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2728:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2729:1: ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 )
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorAssignment_2_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2730:1: ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2730:2: rule__LlamadaFuncion__OperadorAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_1_1_in_rule__LlamadaFuncion__Group_2_1__1__Impl5748);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2744:1: rule__Asignacion__Group__0 : rule__Asignacion__Group__0__Impl rule__Asignacion__Group__1 ;
    public final void rule__Asignacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2748:1: ( rule__Asignacion__Group__0__Impl rule__Asignacion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2749:2: rule__Asignacion__Group__0__Impl rule__Asignacion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__0__Impl_in_rule__Asignacion__Group__05782);
            rule__Asignacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__1_in_rule__Asignacion__Group__05785);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2756:1: rule__Asignacion__Group__0__Impl : ( ( rule__Asignacion__LvalueAssignment_0 ) ) ;
    public final void rule__Asignacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2760:1: ( ( ( rule__Asignacion__LvalueAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:1: ( ( rule__Asignacion__LvalueAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:1: ( ( rule__Asignacion__LvalueAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2762:1: ( rule__Asignacion__LvalueAssignment_0 )
            {
             before(grammarAccess.getAsignacionAccess().getLvalueAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2763:1: ( rule__Asignacion__LvalueAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2763:2: rule__Asignacion__LvalueAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__LvalueAssignment_0_in_rule__Asignacion__Group__0__Impl5812);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2773:1: rule__Asignacion__Group__1 : rule__Asignacion__Group__1__Impl rule__Asignacion__Group__2 ;
    public final void rule__Asignacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2777:1: ( rule__Asignacion__Group__1__Impl rule__Asignacion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2778:2: rule__Asignacion__Group__1__Impl rule__Asignacion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__1__Impl_in_rule__Asignacion__Group__15842);
            rule__Asignacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__2_in_rule__Asignacion__Group__15845);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2785:1: rule__Asignacion__Group__1__Impl : ( ( rule__Asignacion__MatAssignment_1 )* ) ;
    public final void rule__Asignacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2789:1: ( ( ( rule__Asignacion__MatAssignment_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2790:1: ( ( rule__Asignacion__MatAssignment_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2790:1: ( ( rule__Asignacion__MatAssignment_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2791:1: ( rule__Asignacion__MatAssignment_1 )*
            {
             before(grammarAccess.getAsignacionAccess().getMatAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2792:1: ( rule__Asignacion__MatAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_MATRIZ) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2792:2: rule__Asignacion__MatAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Asignacion__MatAssignment_1_in_rule__Asignacion__Group__1__Impl5872);
            	    rule__Asignacion__MatAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2802:1: rule__Asignacion__Group__2 : rule__Asignacion__Group__2__Impl rule__Asignacion__Group__3 ;
    public final void rule__Asignacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2806:1: ( rule__Asignacion__Group__2__Impl rule__Asignacion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2807:2: rule__Asignacion__Group__2__Impl rule__Asignacion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__2__Impl_in_rule__Asignacion__Group__25903);
            rule__Asignacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__3_in_rule__Asignacion__Group__25906);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:1: rule__Asignacion__Group__2__Impl : ( '=' ) ;
    public final void rule__Asignacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: ( ( '=' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: ( '=' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: ( '=' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:1: '='
            {
             before(grammarAccess.getAsignacionAccess().getEqualsSignKeyword_2()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__Asignacion__Group__2__Impl5934); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2833:1: rule__Asignacion__Group__3 : rule__Asignacion__Group__3__Impl ;
    public final void rule__Asignacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2837:1: ( rule__Asignacion__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2838:2: rule__Asignacion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__3__Impl_in_rule__Asignacion__Group__35965);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2844:1: rule__Asignacion__Group__3__Impl : ( ( rule__Asignacion__OperadorAssignment_3 ) ) ;
    public final void rule__Asignacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2848:1: ( ( ( rule__Asignacion__OperadorAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:1: ( ( rule__Asignacion__OperadorAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:1: ( ( rule__Asignacion__OperadorAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2850:1: ( rule__Asignacion__OperadorAssignment_3 )
            {
             before(grammarAccess.getAsignacionAccess().getOperadorAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:1: ( rule__Asignacion__OperadorAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:2: rule__Asignacion__OperadorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__OperadorAssignment_3_in_rule__Asignacion__Group__3__Impl5992);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2869:1: rule__Escribir__Group__0 : rule__Escribir__Group__0__Impl rule__Escribir__Group__1 ;
    public final void rule__Escribir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2873:1: ( rule__Escribir__Group__0__Impl rule__Escribir__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2874:2: rule__Escribir__Group__0__Impl rule__Escribir__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__0__Impl_in_rule__Escribir__Group__06030);
            rule__Escribir__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__1_in_rule__Escribir__Group__06033);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2881:1: rule__Escribir__Group__0__Impl : ( 'escribir' ) ;
    public final void rule__Escribir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2885:1: ( ( 'escribir' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2886:1: ( 'escribir' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2886:1: ( 'escribir' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2887:1: 'escribir'
            {
             before(grammarAccess.getEscribirAccess().getEscribirKeyword_0()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__Escribir__Group__0__Impl6061); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2900:1: rule__Escribir__Group__1 : rule__Escribir__Group__1__Impl rule__Escribir__Group__2 ;
    public final void rule__Escribir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2904:1: ( rule__Escribir__Group__1__Impl rule__Escribir__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2905:2: rule__Escribir__Group__1__Impl rule__Escribir__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__1__Impl_in_rule__Escribir__Group__16092);
            rule__Escribir__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__2_in_rule__Escribir__Group__16095);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2912:1: rule__Escribir__Group__1__Impl : ( '(' ) ;
    public final void rule__Escribir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2916:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2917:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2917:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2918:1: '('
            {
             before(grammarAccess.getEscribirAccess().getLeftParenthesisKeyword_1()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Escribir__Group__1__Impl6123); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2931:1: rule__Escribir__Group__2 : rule__Escribir__Group__2__Impl rule__Escribir__Group__3 ;
    public final void rule__Escribir__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2935:1: ( rule__Escribir__Group__2__Impl rule__Escribir__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2936:2: rule__Escribir__Group__2__Impl rule__Escribir__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__2__Impl_in_rule__Escribir__Group__26154);
            rule__Escribir__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__3_in_rule__Escribir__Group__26157);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: rule__Escribir__Group__2__Impl : ( ( rule__Escribir__OperadorAssignment_2 ) ) ;
    public final void rule__Escribir__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2947:1: ( ( ( rule__Escribir__OperadorAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2948:1: ( ( rule__Escribir__OperadorAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2948:1: ( ( rule__Escribir__OperadorAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2949:1: ( rule__Escribir__OperadorAssignment_2 )
            {
             before(grammarAccess.getEscribirAccess().getOperadorAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2950:1: ( rule__Escribir__OperadorAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2950:2: rule__Escribir__OperadorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__OperadorAssignment_2_in_rule__Escribir__Group__2__Impl6184);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2960:1: rule__Escribir__Group__3 : rule__Escribir__Group__3__Impl rule__Escribir__Group__4 ;
    public final void rule__Escribir__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2964:1: ( rule__Escribir__Group__3__Impl rule__Escribir__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2965:2: rule__Escribir__Group__3__Impl rule__Escribir__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__3__Impl_in_rule__Escribir__Group__36214);
            rule__Escribir__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__4_in_rule__Escribir__Group__36217);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2972:1: rule__Escribir__Group__3__Impl : ( ( rule__Escribir__Group_3__0 )* ) ;
    public final void rule__Escribir__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2976:1: ( ( ( rule__Escribir__Group_3__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2977:1: ( ( rule__Escribir__Group_3__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2977:1: ( ( rule__Escribir__Group_3__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2978:1: ( rule__Escribir__Group_3__0 )*
            {
             before(grammarAccess.getEscribirAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2979:1: ( rule__Escribir__Group_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==52) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2979:2: rule__Escribir__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__0_in_rule__Escribir__Group__3__Impl6244);
            	    rule__Escribir__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2989:1: rule__Escribir__Group__4 : rule__Escribir__Group__4__Impl ;
    public final void rule__Escribir__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2993:1: ( rule__Escribir__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2994:2: rule__Escribir__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__4__Impl_in_rule__Escribir__Group__46275);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3000:1: rule__Escribir__Group__4__Impl : ( ')' ) ;
    public final void rule__Escribir__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3004:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3005:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3005:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3006:1: ')'
            {
             before(grammarAccess.getEscribirAccess().getRightParenthesisKeyword_4()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Escribir__Group__4__Impl6303); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3029:1: rule__Escribir__Group_3__0 : rule__Escribir__Group_3__0__Impl rule__Escribir__Group_3__1 ;
    public final void rule__Escribir__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3033:1: ( rule__Escribir__Group_3__0__Impl rule__Escribir__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3034:2: rule__Escribir__Group_3__0__Impl rule__Escribir__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__0__Impl_in_rule__Escribir__Group_3__06344);
            rule__Escribir__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__1_in_rule__Escribir__Group_3__06347);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:1: rule__Escribir__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Escribir__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3045:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3046:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3046:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3047:1: ','
            {
             before(grammarAccess.getEscribirAccess().getCommaKeyword_3_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Escribir__Group_3__0__Impl6375); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3060:1: rule__Escribir__Group_3__1 : rule__Escribir__Group_3__1__Impl ;
    public final void rule__Escribir__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3064:1: ( rule__Escribir__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3065:2: rule__Escribir__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__1__Impl_in_rule__Escribir__Group_3__16406);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3071:1: rule__Escribir__Group_3__1__Impl : ( ( rule__Escribir__OperadorAssignment_3_1 ) ) ;
    public final void rule__Escribir__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3075:1: ( ( ( rule__Escribir__OperadorAssignment_3_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3076:1: ( ( rule__Escribir__OperadorAssignment_3_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3076:1: ( ( rule__Escribir__OperadorAssignment_3_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3077:1: ( rule__Escribir__OperadorAssignment_3_1 )
            {
             before(grammarAccess.getEscribirAccess().getOperadorAssignment_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3078:1: ( rule__Escribir__OperadorAssignment_3_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3078:2: rule__Escribir__OperadorAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__OperadorAssignment_3_1_in_rule__Escribir__Group_3__1__Impl6433);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3092:1: rule__Leer__Group__0 : rule__Leer__Group__0__Impl rule__Leer__Group__1 ;
    public final void rule__Leer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3096:1: ( rule__Leer__Group__0__Impl rule__Leer__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3097:2: rule__Leer__Group__0__Impl rule__Leer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__0__Impl_in_rule__Leer__Group__06467);
            rule__Leer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__1_in_rule__Leer__Group__06470);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3104:1: rule__Leer__Group__0__Impl : ( 'leer' ) ;
    public final void rule__Leer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3108:1: ( ( 'leer' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3109:1: ( 'leer' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3109:1: ( 'leer' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3110:1: 'leer'
            {
             before(grammarAccess.getLeerAccess().getLeerKeyword_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__Leer__Group__0__Impl6498); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3123:1: rule__Leer__Group__1 : rule__Leer__Group__1__Impl rule__Leer__Group__2 ;
    public final void rule__Leer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3127:1: ( rule__Leer__Group__1__Impl rule__Leer__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3128:2: rule__Leer__Group__1__Impl rule__Leer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__1__Impl_in_rule__Leer__Group__16529);
            rule__Leer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__2_in_rule__Leer__Group__16532);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3135:1: rule__Leer__Group__1__Impl : ( '(' ) ;
    public final void rule__Leer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3139:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3140:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3140:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3141:1: '('
            {
             before(grammarAccess.getLeerAccess().getLeftParenthesisKeyword_1()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Leer__Group__1__Impl6560); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3154:1: rule__Leer__Group__2 : rule__Leer__Group__2__Impl rule__Leer__Group__3 ;
    public final void rule__Leer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3158:1: ( rule__Leer__Group__2__Impl rule__Leer__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3159:2: rule__Leer__Group__2__Impl rule__Leer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__2__Impl_in_rule__Leer__Group__26591);
            rule__Leer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__3_in_rule__Leer__Group__26594);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3166:1: rule__Leer__Group__2__Impl : ( ( rule__Leer__VariableAssignment_2 ) ) ;
    public final void rule__Leer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3170:1: ( ( ( rule__Leer__VariableAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3171:1: ( ( rule__Leer__VariableAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3171:1: ( ( rule__Leer__VariableAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3172:1: ( rule__Leer__VariableAssignment_2 )
            {
             before(grammarAccess.getLeerAccess().getVariableAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3173:1: ( rule__Leer__VariableAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3173:2: rule__Leer__VariableAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__VariableAssignment_2_in_rule__Leer__Group__2__Impl6621);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3183:1: rule__Leer__Group__3 : rule__Leer__Group__3__Impl ;
    public final void rule__Leer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3187:1: ( rule__Leer__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3188:2: rule__Leer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__3__Impl_in_rule__Leer__Group__36651);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3194:1: rule__Leer__Group__3__Impl : ( ')' ) ;
    public final void rule__Leer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3198:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3199:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3199:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3200:1: ')'
            {
             before(grammarAccess.getLeerAccess().getRightParenthesisKeyword_3()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Leer__Group__3__Impl6679); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: rule__Si__Group__0 : rule__Si__Group__0__Impl rule__Si__Group__1 ;
    public final void rule__Si__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3225:1: ( rule__Si__Group__0__Impl rule__Si__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3226:2: rule__Si__Group__0__Impl rule__Si__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__0__Impl_in_rule__Si__Group__06718);
            rule__Si__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__1_in_rule__Si__Group__06721);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3233:1: rule__Si__Group__0__Impl : ( 'si' ) ;
    public final void rule__Si__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:1: ( ( 'si' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3238:1: ( 'si' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3238:1: ( 'si' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3239:1: 'si'
            {
             before(grammarAccess.getSiAccess().getSiKeyword_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Si__Group__0__Impl6749); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3252:1: rule__Si__Group__1 : rule__Si__Group__1__Impl rule__Si__Group__2 ;
    public final void rule__Si__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3256:1: ( rule__Si__Group__1__Impl rule__Si__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3257:2: rule__Si__Group__1__Impl rule__Si__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__1__Impl_in_rule__Si__Group__16780);
            rule__Si__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__2_in_rule__Si__Group__16783);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3264:1: rule__Si__Group__1__Impl : ( ( rule__Si__ValorAssignment_1 ) ) ;
    public final void rule__Si__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3268:1: ( ( ( rule__Si__ValorAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3269:1: ( ( rule__Si__ValorAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3269:1: ( ( rule__Si__ValorAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3270:1: ( rule__Si__ValorAssignment_1 )
            {
             before(grammarAccess.getSiAccess().getValorAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3271:1: ( rule__Si__ValorAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3271:2: rule__Si__ValorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__ValorAssignment_1_in_rule__Si__Group__1__Impl6810);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: rule__Si__Group__2 : rule__Si__Group__2__Impl rule__Si__Group__3 ;
    public final void rule__Si__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3285:1: ( rule__Si__Group__2__Impl rule__Si__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3286:2: rule__Si__Group__2__Impl rule__Si__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__2__Impl_in_rule__Si__Group__26840);
            rule__Si__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__3_in_rule__Si__Group__26843);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3293:1: rule__Si__Group__2__Impl : ( 'entonces' ) ;
    public final void rule__Si__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3297:1: ( ( 'entonces' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3298:1: ( 'entonces' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3298:1: ( 'entonces' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3299:1: 'entonces'
            {
             before(grammarAccess.getSiAccess().getEntoncesKeyword_2()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__Si__Group__2__Impl6871); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3312:1: rule__Si__Group__3 : rule__Si__Group__3__Impl rule__Si__Group__4 ;
    public final void rule__Si__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3316:1: ( rule__Si__Group__3__Impl rule__Si__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3317:2: rule__Si__Group__3__Impl rule__Si__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__3__Impl_in_rule__Si__Group__36902);
            rule__Si__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__4_in_rule__Si__Group__36905);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3324:1: rule__Si__Group__3__Impl : ( ( rule__Si__Group_3__0 )? ) ;
    public final void rule__Si__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3328:1: ( ( ( rule__Si__Group_3__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3329:1: ( ( rule__Si__Group_3__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3329:1: ( ( rule__Si__Group_3__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3330:1: ( rule__Si__Group_3__0 )?
            {
             before(grammarAccess.getSiAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3331:1: ( rule__Si__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)||(LA25_0>=54 && LA25_0<=56)||LA25_0==59||LA25_0==62||LA25_0==64) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3331:2: rule__Si__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__0_in_rule__Si__Group__3__Impl6932);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3341:1: rule__Si__Group__4 : rule__Si__Group__4__Impl rule__Si__Group__5 ;
    public final void rule__Si__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:1: ( rule__Si__Group__4__Impl rule__Si__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3346:2: rule__Si__Group__4__Impl rule__Si__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__4__Impl_in_rule__Si__Group__46963);
            rule__Si__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__5_in_rule__Si__Group__46966);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3353:1: rule__Si__Group__4__Impl : ( ( rule__Si__SinoAssignment_4 )? ) ;
    public final void rule__Si__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:1: ( ( ( rule__Si__SinoAssignment_4 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3358:1: ( ( rule__Si__SinoAssignment_4 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3358:1: ( ( rule__Si__SinoAssignment_4 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3359:1: ( rule__Si__SinoAssignment_4 )?
            {
             before(grammarAccess.getSiAccess().getSinoAssignment_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3360:1: ( rule__Si__SinoAssignment_4 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==68) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3360:2: rule__Si__SinoAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Si__SinoAssignment_4_in_rule__Si__Group__4__Impl6993);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3370:1: rule__Si__Group__5 : rule__Si__Group__5__Impl ;
    public final void rule__Si__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3374:1: ( rule__Si__Group__5__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3375:2: rule__Si__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__5__Impl_in_rule__Si__Group__57024);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3381:1: rule__Si__Group__5__Impl : ( 'fin si' ) ;
    public final void rule__Si__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3385:1: ( ( 'fin si' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3386:1: ( 'fin si' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3386:1: ( 'fin si' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3387:1: 'fin si'
            {
             before(grammarAccess.getSiAccess().getFinSiKeyword_5()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__Si__Group__5__Impl7052); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3412:1: rule__Si__Group_3__0 : rule__Si__Group_3__0__Impl rule__Si__Group_3__1 ;
    public final void rule__Si__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3416:1: ( rule__Si__Group_3__0__Impl rule__Si__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3417:2: rule__Si__Group_3__0__Impl rule__Si__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__0__Impl_in_rule__Si__Group_3__07095);
            rule__Si__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__1_in_rule__Si__Group_3__07098);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3424:1: rule__Si__Group_3__0__Impl : ( ( rule__Si__SentenciasAssignment_3_0 ) ) ;
    public final void rule__Si__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3428:1: ( ( ( rule__Si__SentenciasAssignment_3_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3429:1: ( ( rule__Si__SentenciasAssignment_3_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3429:1: ( ( rule__Si__SentenciasAssignment_3_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3430:1: ( rule__Si__SentenciasAssignment_3_0 )
            {
             before(grammarAccess.getSiAccess().getSentenciasAssignment_3_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3431:1: ( rule__Si__SentenciasAssignment_3_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3431:2: rule__Si__SentenciasAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__SentenciasAssignment_3_0_in_rule__Si__Group_3__0__Impl7125);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3441:1: rule__Si__Group_3__1 : rule__Si__Group_3__1__Impl ;
    public final void rule__Si__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3445:1: ( rule__Si__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3446:2: rule__Si__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__1__Impl_in_rule__Si__Group_3__17155);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3452:1: rule__Si__Group_3__1__Impl : ( ( rule__Si__SentenciasAssignment_3_1 )* ) ;
    public final void rule__Si__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3456:1: ( ( ( rule__Si__SentenciasAssignment_3_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3457:1: ( ( rule__Si__SentenciasAssignment_3_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3457:1: ( ( rule__Si__SentenciasAssignment_3_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3458:1: ( rule__Si__SentenciasAssignment_3_1 )*
            {
             before(grammarAccess.getSiAccess().getSentenciasAssignment_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3459:1: ( rule__Si__SentenciasAssignment_3_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)||(LA27_0>=54 && LA27_0<=56)||LA27_0==59||LA27_0==62||LA27_0==64) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3459:2: rule__Si__SentenciasAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Si__SentenciasAssignment_3_1_in_rule__Si__Group_3__1__Impl7182);
            	    rule__Si__SentenciasAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3473:1: rule__Mientras__Group__0 : rule__Mientras__Group__0__Impl rule__Mientras__Group__1 ;
    public final void rule__Mientras__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3477:1: ( rule__Mientras__Group__0__Impl rule__Mientras__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3478:2: rule__Mientras__Group__0__Impl rule__Mientras__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__0__Impl_in_rule__Mientras__Group__07217);
            rule__Mientras__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__1_in_rule__Mientras__Group__07220);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3485:1: rule__Mientras__Group__0__Impl : ( 'mientras' ) ;
    public final void rule__Mientras__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3489:1: ( ( 'mientras' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3490:1: ( 'mientras' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3490:1: ( 'mientras' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3491:1: 'mientras'
            {
             before(grammarAccess.getMientrasAccess().getMientrasKeyword_0()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__Mientras__Group__0__Impl7248); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3504:1: rule__Mientras__Group__1 : rule__Mientras__Group__1__Impl rule__Mientras__Group__2 ;
    public final void rule__Mientras__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3508:1: ( rule__Mientras__Group__1__Impl rule__Mientras__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3509:2: rule__Mientras__Group__1__Impl rule__Mientras__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__1__Impl_in_rule__Mientras__Group__17279);
            rule__Mientras__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__2_in_rule__Mientras__Group__17282);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3516:1: rule__Mientras__Group__1__Impl : ( ( rule__Mientras__ValorAssignment_1 ) ) ;
    public final void rule__Mientras__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3520:1: ( ( ( rule__Mientras__ValorAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3521:1: ( ( rule__Mientras__ValorAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3521:1: ( ( rule__Mientras__ValorAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3522:1: ( rule__Mientras__ValorAssignment_1 )
            {
             before(grammarAccess.getMientrasAccess().getValorAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3523:1: ( rule__Mientras__ValorAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3523:2: rule__Mientras__ValorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__ValorAssignment_1_in_rule__Mientras__Group__1__Impl7309);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3533:1: rule__Mientras__Group__2 : rule__Mientras__Group__2__Impl rule__Mientras__Group__3 ;
    public final void rule__Mientras__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3537:1: ( rule__Mientras__Group__2__Impl rule__Mientras__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3538:2: rule__Mientras__Group__2__Impl rule__Mientras__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__2__Impl_in_rule__Mientras__Group__27339);
            rule__Mientras__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__3_in_rule__Mientras__Group__27342);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3545:1: rule__Mientras__Group__2__Impl : ( 'hacer' ) ;
    public final void rule__Mientras__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3549:1: ( ( 'hacer' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3550:1: ( 'hacer' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3550:1: ( 'hacer' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3551:1: 'hacer'
            {
             before(grammarAccess.getMientrasAccess().getHacerKeyword_2()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__Mientras__Group__2__Impl7370); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3564:1: rule__Mientras__Group__3 : rule__Mientras__Group__3__Impl rule__Mientras__Group__4 ;
    public final void rule__Mientras__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3568:1: ( rule__Mientras__Group__3__Impl rule__Mientras__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:2: rule__Mientras__Group__3__Impl rule__Mientras__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__3__Impl_in_rule__Mientras__Group__37401);
            rule__Mientras__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__4_in_rule__Mientras__Group__37404);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3576:1: rule__Mientras__Group__3__Impl : ( ( rule__Mientras__Group_3__0 )? ) ;
    public final void rule__Mientras__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3580:1: ( ( ( rule__Mientras__Group_3__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3581:1: ( ( rule__Mientras__Group_3__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3581:1: ( ( rule__Mientras__Group_3__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3582:1: ( rule__Mientras__Group_3__0 )?
            {
             before(grammarAccess.getMientrasAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3583:1: ( rule__Mientras__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||(LA28_0>=54 && LA28_0<=56)||LA28_0==59||LA28_0==62||LA28_0==64) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3583:2: rule__Mientras__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__0_in_rule__Mientras__Group__3__Impl7431);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3593:1: rule__Mientras__Group__4 : rule__Mientras__Group__4__Impl ;
    public final void rule__Mientras__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:1: ( rule__Mientras__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3598:2: rule__Mientras__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__4__Impl_in_rule__Mientras__Group__47462);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3604:1: rule__Mientras__Group__4__Impl : ( 'fin_mientras' ) ;
    public final void rule__Mientras__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3608:1: ( ( 'fin_mientras' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3609:1: ( 'fin_mientras' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3609:1: ( 'fin_mientras' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3610:1: 'fin_mientras'
            {
             before(grammarAccess.getMientrasAccess().getFin_mientrasKeyword_4()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__Mientras__Group__4__Impl7490); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3633:1: rule__Mientras__Group_3__0 : rule__Mientras__Group_3__0__Impl rule__Mientras__Group_3__1 ;
    public final void rule__Mientras__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3637:1: ( rule__Mientras__Group_3__0__Impl rule__Mientras__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3638:2: rule__Mientras__Group_3__0__Impl rule__Mientras__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__0__Impl_in_rule__Mientras__Group_3__07531);
            rule__Mientras__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__1_in_rule__Mientras__Group_3__07534);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3645:1: rule__Mientras__Group_3__0__Impl : ( ( rule__Mientras__SentenciasAssignment_3_0 ) ) ;
    public final void rule__Mientras__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3649:1: ( ( ( rule__Mientras__SentenciasAssignment_3_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3650:1: ( ( rule__Mientras__SentenciasAssignment_3_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3650:1: ( ( rule__Mientras__SentenciasAssignment_3_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3651:1: ( rule__Mientras__SentenciasAssignment_3_0 )
            {
             before(grammarAccess.getMientrasAccess().getSentenciasAssignment_3_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3652:1: ( rule__Mientras__SentenciasAssignment_3_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3652:2: rule__Mientras__SentenciasAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__SentenciasAssignment_3_0_in_rule__Mientras__Group_3__0__Impl7561);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3662:1: rule__Mientras__Group_3__1 : rule__Mientras__Group_3__1__Impl ;
    public final void rule__Mientras__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3666:1: ( rule__Mientras__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3667:2: rule__Mientras__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__1__Impl_in_rule__Mientras__Group_3__17591);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3673:1: rule__Mientras__Group_3__1__Impl : ( ( rule__Mientras__SentenciasAssignment_3_1 )* ) ;
    public final void rule__Mientras__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: ( ( ( rule__Mientras__SentenciasAssignment_3_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:1: ( ( rule__Mientras__SentenciasAssignment_3_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:1: ( ( rule__Mientras__SentenciasAssignment_3_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3679:1: ( rule__Mientras__SentenciasAssignment_3_1 )*
            {
             before(grammarAccess.getMientrasAccess().getSentenciasAssignment_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3680:1: ( rule__Mientras__SentenciasAssignment_3_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)||(LA29_0>=54 && LA29_0<=56)||LA29_0==59||LA29_0==62||LA29_0==64) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3680:2: rule__Mientras__SentenciasAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Mientras__SentenciasAssignment_3_1_in_rule__Mientras__Group_3__1__Impl7618);
            	    rule__Mientras__SentenciasAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3694:1: rule__Repetir__Group__0 : rule__Repetir__Group__0__Impl rule__Repetir__Group__1 ;
    public final void rule__Repetir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3698:1: ( rule__Repetir__Group__0__Impl rule__Repetir__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3699:2: rule__Repetir__Group__0__Impl rule__Repetir__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__0__Impl_in_rule__Repetir__Group__07653);
            rule__Repetir__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__1_in_rule__Repetir__Group__07656);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3706:1: rule__Repetir__Group__0__Impl : ( 'repetir' ) ;
    public final void rule__Repetir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3710:1: ( ( 'repetir' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3711:1: ( 'repetir' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3711:1: ( 'repetir' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3712:1: 'repetir'
            {
             before(grammarAccess.getRepetirAccess().getRepetirKeyword_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__Repetir__Group__0__Impl7684); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3725:1: rule__Repetir__Group__1 : rule__Repetir__Group__1__Impl rule__Repetir__Group__2 ;
    public final void rule__Repetir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3729:1: ( rule__Repetir__Group__1__Impl rule__Repetir__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3730:2: rule__Repetir__Group__1__Impl rule__Repetir__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__1__Impl_in_rule__Repetir__Group__17715);
            rule__Repetir__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__2_in_rule__Repetir__Group__17718);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3737:1: rule__Repetir__Group__1__Impl : ( ( rule__Repetir__Group_1__0 )? ) ;
    public final void rule__Repetir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3741:1: ( ( ( rule__Repetir__Group_1__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3742:1: ( ( rule__Repetir__Group_1__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3742:1: ( ( rule__Repetir__Group_1__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3743:1: ( rule__Repetir__Group_1__0 )?
            {
             before(grammarAccess.getRepetirAccess().getGroup_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3744:1: ( rule__Repetir__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)||(LA30_0>=54 && LA30_0<=56)||LA30_0==59||LA30_0==62||LA30_0==64) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3744:2: rule__Repetir__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__0_in_rule__Repetir__Group__1__Impl7745);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3754:1: rule__Repetir__Group__2 : rule__Repetir__Group__2__Impl rule__Repetir__Group__3 ;
    public final void rule__Repetir__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3758:1: ( rule__Repetir__Group__2__Impl rule__Repetir__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3759:2: rule__Repetir__Group__2__Impl rule__Repetir__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__2__Impl_in_rule__Repetir__Group__27776);
            rule__Repetir__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__3_in_rule__Repetir__Group__27779);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3766:1: rule__Repetir__Group__2__Impl : ( 'hasta_que' ) ;
    public final void rule__Repetir__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:1: ( ( 'hasta_que' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3771:1: ( 'hasta_que' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3771:1: ( 'hasta_que' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3772:1: 'hasta_que'
            {
             before(grammarAccess.getRepetirAccess().getHasta_queKeyword_2()); 
            match(input,63,FollowSets000.FOLLOW_63_in_rule__Repetir__Group__2__Impl7807); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3785:1: rule__Repetir__Group__3 : rule__Repetir__Group__3__Impl ;
    public final void rule__Repetir__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3789:1: ( rule__Repetir__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3790:2: rule__Repetir__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__3__Impl_in_rule__Repetir__Group__37838);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3796:1: rule__Repetir__Group__3__Impl : ( ( rule__Repetir__ValorAssignment_3 ) ) ;
    public final void rule__Repetir__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3800:1: ( ( ( rule__Repetir__ValorAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: ( ( rule__Repetir__ValorAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: ( ( rule__Repetir__ValorAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3802:1: ( rule__Repetir__ValorAssignment_3 )
            {
             before(grammarAccess.getRepetirAccess().getValorAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3803:1: ( rule__Repetir__ValorAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3803:2: rule__Repetir__ValorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__ValorAssignment_3_in_rule__Repetir__Group__3__Impl7865);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3821:1: rule__Repetir__Group_1__0 : rule__Repetir__Group_1__0__Impl rule__Repetir__Group_1__1 ;
    public final void rule__Repetir__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3825:1: ( rule__Repetir__Group_1__0__Impl rule__Repetir__Group_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3826:2: rule__Repetir__Group_1__0__Impl rule__Repetir__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__0__Impl_in_rule__Repetir__Group_1__07903);
            rule__Repetir__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__1_in_rule__Repetir__Group_1__07906);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3833:1: rule__Repetir__Group_1__0__Impl : ( ( rule__Repetir__SentenciasAssignment_1_0 ) ) ;
    public final void rule__Repetir__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3837:1: ( ( ( rule__Repetir__SentenciasAssignment_1_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3838:1: ( ( rule__Repetir__SentenciasAssignment_1_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3838:1: ( ( rule__Repetir__SentenciasAssignment_1_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3839:1: ( rule__Repetir__SentenciasAssignment_1_0 )
            {
             before(grammarAccess.getRepetirAccess().getSentenciasAssignment_1_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3840:1: ( rule__Repetir__SentenciasAssignment_1_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3840:2: rule__Repetir__SentenciasAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__SentenciasAssignment_1_0_in_rule__Repetir__Group_1__0__Impl7933);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:1: rule__Repetir__Group_1__1 : rule__Repetir__Group_1__1__Impl ;
    public final void rule__Repetir__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3854:1: ( rule__Repetir__Group_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3855:2: rule__Repetir__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__1__Impl_in_rule__Repetir__Group_1__17963);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3861:1: rule__Repetir__Group_1__1__Impl : ( ( rule__Repetir__SentenciasAssignment_1_1 )* ) ;
    public final void rule__Repetir__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3865:1: ( ( ( rule__Repetir__SentenciasAssignment_1_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3866:1: ( ( rule__Repetir__SentenciasAssignment_1_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3866:1: ( ( rule__Repetir__SentenciasAssignment_1_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3867:1: ( rule__Repetir__SentenciasAssignment_1_1 )*
            {
             before(grammarAccess.getRepetirAccess().getSentenciasAssignment_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3868:1: ( rule__Repetir__SentenciasAssignment_1_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)||(LA31_0>=54 && LA31_0<=56)||LA31_0==59||LA31_0==62||LA31_0==64) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3868:2: rule__Repetir__SentenciasAssignment_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Repetir__SentenciasAssignment_1_1_in_rule__Repetir__Group_1__1__Impl7990);
            	    rule__Repetir__SentenciasAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3882:1: rule__Desde__Group__0 : rule__Desde__Group__0__Impl rule__Desde__Group__1 ;
    public final void rule__Desde__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3886:1: ( rule__Desde__Group__0__Impl rule__Desde__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3887:2: rule__Desde__Group__0__Impl rule__Desde__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__0__Impl_in_rule__Desde__Group__08025);
            rule__Desde__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__1_in_rule__Desde__Group__08028);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:1: rule__Desde__Group__0__Impl : ( 'desde' ) ;
    public final void rule__Desde__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3898:1: ( ( 'desde' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3899:1: ( 'desde' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3899:1: ( 'desde' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3900:1: 'desde'
            {
             before(grammarAccess.getDesdeAccess().getDesdeKeyword_0()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__Desde__Group__0__Impl8056); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3913:1: rule__Desde__Group__1 : rule__Desde__Group__1__Impl rule__Desde__Group__2 ;
    public final void rule__Desde__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3917:1: ( rule__Desde__Group__1__Impl rule__Desde__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3918:2: rule__Desde__Group__1__Impl rule__Desde__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__1__Impl_in_rule__Desde__Group__18087);
            rule__Desde__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__2_in_rule__Desde__Group__18090);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3925:1: rule__Desde__Group__1__Impl : ( ( rule__Desde__AsignacionAssignment_1 ) ) ;
    public final void rule__Desde__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3929:1: ( ( ( rule__Desde__AsignacionAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3930:1: ( ( rule__Desde__AsignacionAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3930:1: ( ( rule__Desde__AsignacionAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3931:1: ( rule__Desde__AsignacionAssignment_1 )
            {
             before(grammarAccess.getDesdeAccess().getAsignacionAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3932:1: ( rule__Desde__AsignacionAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3932:2: rule__Desde__AsignacionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__AsignacionAssignment_1_in_rule__Desde__Group__1__Impl8117);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3942:1: rule__Desde__Group__2 : rule__Desde__Group__2__Impl rule__Desde__Group__3 ;
    public final void rule__Desde__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3946:1: ( rule__Desde__Group__2__Impl rule__Desde__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3947:2: rule__Desde__Group__2__Impl rule__Desde__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__2__Impl_in_rule__Desde__Group__28147);
            rule__Desde__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__3_in_rule__Desde__Group__28150);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3954:1: rule__Desde__Group__2__Impl : ( 'hasta' ) ;
    public final void rule__Desde__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3958:1: ( ( 'hasta' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:1: ( 'hasta' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:1: ( 'hasta' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3960:1: 'hasta'
            {
             before(grammarAccess.getDesdeAccess().getHastaKeyword_2()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__Desde__Group__2__Impl8178); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3973:1: rule__Desde__Group__3 : rule__Desde__Group__3__Impl rule__Desde__Group__4 ;
    public final void rule__Desde__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3977:1: ( rule__Desde__Group__3__Impl rule__Desde__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3978:2: rule__Desde__Group__3__Impl rule__Desde__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__3__Impl_in_rule__Desde__Group__38209);
            rule__Desde__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__4_in_rule__Desde__Group__38212);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3985:1: rule__Desde__Group__3__Impl : ( ( rule__Desde__ValorAssignment_3 ) ) ;
    public final void rule__Desde__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3989:1: ( ( ( rule__Desde__ValorAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3990:1: ( ( rule__Desde__ValorAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3990:1: ( ( rule__Desde__ValorAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3991:1: ( rule__Desde__ValorAssignment_3 )
            {
             before(grammarAccess.getDesdeAccess().getValorAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3992:1: ( rule__Desde__ValorAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3992:2: rule__Desde__ValorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__ValorAssignment_3_in_rule__Desde__Group__3__Impl8239);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4002:1: rule__Desde__Group__4 : rule__Desde__Group__4__Impl rule__Desde__Group__5 ;
    public final void rule__Desde__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: ( rule__Desde__Group__4__Impl rule__Desde__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4007:2: rule__Desde__Group__4__Impl rule__Desde__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__4__Impl_in_rule__Desde__Group__48269);
            rule__Desde__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__5_in_rule__Desde__Group__48272);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4014:1: rule__Desde__Group__4__Impl : ( 'hacer' ) ;
    public final void rule__Desde__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4018:1: ( ( 'hacer' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4019:1: ( 'hacer' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4019:1: ( 'hacer' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:1: 'hacer'
            {
             before(grammarAccess.getDesdeAccess().getHacerKeyword_4()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__Desde__Group__4__Impl8300); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4033:1: rule__Desde__Group__5 : rule__Desde__Group__5__Impl rule__Desde__Group__6 ;
    public final void rule__Desde__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4037:1: ( rule__Desde__Group__5__Impl rule__Desde__Group__6 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4038:2: rule__Desde__Group__5__Impl rule__Desde__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__5__Impl_in_rule__Desde__Group__58331);
            rule__Desde__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__6_in_rule__Desde__Group__58334);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4045:1: rule__Desde__Group__5__Impl : ( ( rule__Desde__Group_5__0 )? ) ;
    public final void rule__Desde__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4049:1: ( ( ( rule__Desde__Group_5__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4050:1: ( ( rule__Desde__Group_5__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4050:1: ( ( rule__Desde__Group_5__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4051:1: ( rule__Desde__Group_5__0 )?
            {
             before(grammarAccess.getDesdeAccess().getGroup_5()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4052:1: ( rule__Desde__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)||(LA32_0>=54 && LA32_0<=56)||LA32_0==59||LA32_0==62||LA32_0==64) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4052:2: rule__Desde__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__0_in_rule__Desde__Group__5__Impl8361);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4062:1: rule__Desde__Group__6 : rule__Desde__Group__6__Impl ;
    public final void rule__Desde__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4066:1: ( rule__Desde__Group__6__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4067:2: rule__Desde__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__6__Impl_in_rule__Desde__Group__68392);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4073:1: rule__Desde__Group__6__Impl : ( 'fin_desde' ) ;
    public final void rule__Desde__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4077:1: ( ( 'fin_desde' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4078:1: ( 'fin_desde' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4078:1: ( 'fin_desde' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4079:1: 'fin_desde'
            {
             before(grammarAccess.getDesdeAccess().getFin_desdeKeyword_6()); 
            match(input,66,FollowSets000.FOLLOW_66_in_rule__Desde__Group__6__Impl8420); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4106:1: rule__Desde__Group_5__0 : rule__Desde__Group_5__0__Impl rule__Desde__Group_5__1 ;
    public final void rule__Desde__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4110:1: ( rule__Desde__Group_5__0__Impl rule__Desde__Group_5__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4111:2: rule__Desde__Group_5__0__Impl rule__Desde__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__0__Impl_in_rule__Desde__Group_5__08465);
            rule__Desde__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__1_in_rule__Desde__Group_5__08468);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4118:1: rule__Desde__Group_5__0__Impl : ( ( rule__Desde__SentenciasAssignment_5_0 ) ) ;
    public final void rule__Desde__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4122:1: ( ( ( rule__Desde__SentenciasAssignment_5_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4123:1: ( ( rule__Desde__SentenciasAssignment_5_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4123:1: ( ( rule__Desde__SentenciasAssignment_5_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4124:1: ( rule__Desde__SentenciasAssignment_5_0 )
            {
             before(grammarAccess.getDesdeAccess().getSentenciasAssignment_5_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4125:1: ( rule__Desde__SentenciasAssignment_5_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4125:2: rule__Desde__SentenciasAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__SentenciasAssignment_5_0_in_rule__Desde__Group_5__0__Impl8495);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4135:1: rule__Desde__Group_5__1 : rule__Desde__Group_5__1__Impl ;
    public final void rule__Desde__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4139:1: ( rule__Desde__Group_5__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4140:2: rule__Desde__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__1__Impl_in_rule__Desde__Group_5__18525);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4146:1: rule__Desde__Group_5__1__Impl : ( ( rule__Desde__SentenciasAssignment_5_1 )* ) ;
    public final void rule__Desde__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4150:1: ( ( ( rule__Desde__SentenciasAssignment_5_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4151:1: ( ( rule__Desde__SentenciasAssignment_5_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4151:1: ( ( rule__Desde__SentenciasAssignment_5_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4152:1: ( rule__Desde__SentenciasAssignment_5_1 )*
            {
             before(grammarAccess.getDesdeAccess().getSentenciasAssignment_5_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4153:1: ( rule__Desde__SentenciasAssignment_5_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_ID)||(LA33_0>=54 && LA33_0<=56)||LA33_0==59||LA33_0==62||LA33_0==64) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4153:2: rule__Desde__SentenciasAssignment_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Desde__SentenciasAssignment_5_1_in_rule__Desde__Group_5__1__Impl8552);
            	    rule__Desde__SentenciasAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4167:1: rule__Incremento__Group__0 : rule__Incremento__Group__0__Impl rule__Incremento__Group__1 ;
    public final void rule__Incremento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4171:1: ( rule__Incremento__Group__0__Impl rule__Incremento__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4172:2: rule__Incremento__Group__0__Impl rule__Incremento__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__Group__0__Impl_in_rule__Incremento__Group__08587);
            rule__Incremento__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Incremento__Group__1_in_rule__Incremento__Group__08590);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4179:1: rule__Incremento__Group__0__Impl : ( ( rule__Incremento__NombreAssignment_0 ) ) ;
    public final void rule__Incremento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4183:1: ( ( ( rule__Incremento__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4184:1: ( ( rule__Incremento__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4184:1: ( ( rule__Incremento__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4185:1: ( rule__Incremento__NombreAssignment_0 )
            {
             before(grammarAccess.getIncrementoAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4186:1: ( rule__Incremento__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4186:2: rule__Incremento__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__NombreAssignment_0_in_rule__Incremento__Group__0__Impl8617);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4196:1: rule__Incremento__Group__1 : rule__Incremento__Group__1__Impl ;
    public final void rule__Incremento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4200:1: ( rule__Incremento__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4201:2: rule__Incremento__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__Group__1__Impl_in_rule__Incremento__Group__18647);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4207:1: rule__Incremento__Group__1__Impl : ( ( rule__Incremento__SsignoAssignment_1 ) ) ;
    public final void rule__Incremento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4211:1: ( ( ( rule__Incremento__SsignoAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4212:1: ( ( rule__Incremento__SsignoAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4212:1: ( ( rule__Incremento__SsignoAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4213:1: ( rule__Incremento__SsignoAssignment_1 )
            {
             before(grammarAccess.getIncrementoAccess().getSsignoAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4214:1: ( rule__Incremento__SsignoAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4214:2: rule__Incremento__SsignoAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__SsignoAssignment_1_in_rule__Incremento__Group__1__Impl8674);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4228:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4232:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4233:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__08708);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__08711);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4240:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NombreAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4244:1: ( ( ( rule__Variable__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4245:1: ( ( rule__Variable__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4245:1: ( ( rule__Variable__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4246:1: ( rule__Variable__NombreAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4247:1: ( rule__Variable__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4247:2: rule__Variable__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__NombreAssignment_0_in_rule__Variable__Group__0__Impl8738);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4257:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4261:1: ( rule__Variable__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4262:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__18768);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4268:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__MatAssignment_1 )* ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4272:1: ( ( ( rule__Variable__MatAssignment_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4273:1: ( ( rule__Variable__MatAssignment_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4273:1: ( ( rule__Variable__MatAssignment_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4274:1: ( rule__Variable__MatAssignment_1 )*
            {
             before(grammarAccess.getVariableAccess().getMatAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4275:1: ( rule__Variable__MatAssignment_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_MATRIZ) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4275:2: rule__Variable__MatAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Variable__MatAssignment_1_in_rule__Variable__Group__1__Impl8795);
            	    rule__Variable__MatAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4289:1: rule__VariableID__Group__0 : rule__VariableID__Group__0__Impl rule__VariableID__Group__1 ;
    public final void rule__VariableID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4293:1: ( rule__VariableID__Group__0__Impl rule__VariableID__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4294:2: rule__VariableID__Group__0__Impl rule__VariableID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__0__Impl_in_rule__VariableID__Group__08830);
            rule__VariableID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__1_in_rule__VariableID__Group__08833);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4301:1: rule__VariableID__Group__0__Impl : ( ( rule__VariableID__NombreAssignment_0 ) ) ;
    public final void rule__VariableID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4305:1: ( ( ( rule__VariableID__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4306:1: ( ( rule__VariableID__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4306:1: ( ( rule__VariableID__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4307:1: ( rule__VariableID__NombreAssignment_0 )
            {
             before(grammarAccess.getVariableIDAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4308:1: ( rule__VariableID__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4308:2: rule__VariableID__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__NombreAssignment_0_in_rule__VariableID__Group__0__Impl8860);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4318:1: rule__VariableID__Group__1 : rule__VariableID__Group__1__Impl ;
    public final void rule__VariableID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4322:1: ( rule__VariableID__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4323:2: rule__VariableID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__1__Impl_in_rule__VariableID__Group__18890);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4329:1: rule__VariableID__Group__1__Impl : ( ( rule__VariableID__MatAssignment_1 )* ) ;
    public final void rule__VariableID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4333:1: ( ( ( rule__VariableID__MatAssignment_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4334:1: ( ( rule__VariableID__MatAssignment_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4334:1: ( ( rule__VariableID__MatAssignment_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4335:1: ( rule__VariableID__MatAssignment_1 )*
            {
             before(grammarAccess.getVariableIDAccess().getMatAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4336:1: ( rule__VariableID__MatAssignment_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_MATRIZ) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4336:2: rule__VariableID__MatAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__VariableID__MatAssignment_1_in_rule__VariableID__Group__1__Impl8917);
            	    rule__VariableID__MatAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4350:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4354:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4355:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__08952);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__08955);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4362:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4366:1: ( ( ( '-' )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4367:1: ( ( '-' )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4367:1: ( ( '-' )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4368:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4369:1: ( '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==31) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4370:2: '-'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__EInt__Group__0__Impl8984); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4381:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4385:1: ( rule__EInt__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4386:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__19017);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4392:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4396:1: ( ( RULE_INT ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4397:1: ( RULE_INT )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4397:1: ( RULE_INT )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4398:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl9044); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4413:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4417:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4418:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__09077);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__09080);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4425:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4429:1: ( ( ( '-' )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4430:1: ( ( '-' )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4430:1: ( ( '-' )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4431:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4432:1: ( '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4433:2: '-'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__EFloat__Group__0__Impl9109); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4444:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4448:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4449:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__19142);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__19145);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4456:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4460:1: ( ( ( RULE_INT )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4461:1: ( ( RULE_INT )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4461:1: ( ( RULE_INT )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4462:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4463:1: ( RULE_INT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4463:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl9173); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4473:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4477:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4478:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__29204);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__29207);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4485:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4489:1: ( ( '.' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4490:1: ( '.' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4490:1: ( '.' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4491:1: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,67,FollowSets000.FOLLOW_67_in_rule__EFloat__Group__2__Impl9235); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4504:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4508:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4509:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__39266);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__39269);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4516:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4520:1: ( ( RULE_INT ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4521:1: ( RULE_INT )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4521:1: ( RULE_INT )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4522:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl9296); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4533:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4537:1: ( rule__EFloat__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4538:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__49325);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4544:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4548:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4549:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4549:1: ( ( rule__EFloat__Group_4__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4550:1: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4551:1: ( rule__EFloat__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=26 && LA39_0<=27)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4551:2: rule__EFloat__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl9352);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4571:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4575:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4576:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__09393);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__09396);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4583:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4587:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4588:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4588:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4589:1: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4590:1: ( rule__EFloat__Alternatives_4_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4590:2: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl9423);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4600:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4604:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4605:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__19453);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__19456);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4612:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4616:1: ( ( ( '-' )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4617:1: ( ( '-' )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4617:1: ( ( '-' )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4618:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4619:1: ( '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==31) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4620:2: '-'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__EFloat__Group_4__1__Impl9485); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4631:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4635:1: ( rule__EFloat__Group_4__2__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4636:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__29518);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4642:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4646:1: ( ( RULE_INT ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4647:1: ( RULE_INT )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4647:1: ( RULE_INT )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4648:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl9545); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4665:1: rule__Operacion__Group__0 : rule__Operacion__Group__0__Impl rule__Operacion__Group__1 ;
    public final void rule__Operacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4669:1: ( rule__Operacion__Group__0__Impl rule__Operacion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4670:2: rule__Operacion__Group__0__Impl rule__Operacion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__0__Impl_in_rule__Operacion__Group__09580);
            rule__Operacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__1_in_rule__Operacion__Group__09583);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4677:1: rule__Operacion__Group__0__Impl : ( '(' ) ;
    public final void rule__Operacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4681:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4682:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4682:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4683:1: '('
            {
             before(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Operacion__Group__0__Impl9611); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4696:1: rule__Operacion__Group__1 : rule__Operacion__Group__1__Impl rule__Operacion__Group__2 ;
    public final void rule__Operacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4700:1: ( rule__Operacion__Group__1__Impl rule__Operacion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4701:2: rule__Operacion__Group__1__Impl rule__Operacion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__1__Impl_in_rule__Operacion__Group__19642);
            rule__Operacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__2_in_rule__Operacion__Group__19645);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4708:1: rule__Operacion__Group__1__Impl : ( ( rule__Operacion__Op_izqAssignment_1 ) ) ;
    public final void rule__Operacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4712:1: ( ( ( rule__Operacion__Op_izqAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4713:1: ( ( rule__Operacion__Op_izqAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4713:1: ( ( rule__Operacion__Op_izqAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4714:1: ( rule__Operacion__Op_izqAssignment_1 )
            {
             before(grammarAccess.getOperacionAccess().getOp_izqAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4715:1: ( rule__Operacion__Op_izqAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4715:2: rule__Operacion__Op_izqAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Op_izqAssignment_1_in_rule__Operacion__Group__1__Impl9672);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4725:1: rule__Operacion__Group__2 : rule__Operacion__Group__2__Impl rule__Operacion__Group__3 ;
    public final void rule__Operacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4729:1: ( rule__Operacion__Group__2__Impl rule__Operacion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4730:2: rule__Operacion__Group__2__Impl rule__Operacion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__2__Impl_in_rule__Operacion__Group__29702);
            rule__Operacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__3_in_rule__Operacion__Group__29705);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4737:1: rule__Operacion__Group__2__Impl : ( ( rule__Operacion__Signo_opAssignment_2 ) ) ;
    public final void rule__Operacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4741:1: ( ( ( rule__Operacion__Signo_opAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4742:1: ( ( rule__Operacion__Signo_opAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4742:1: ( ( rule__Operacion__Signo_opAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4743:1: ( rule__Operacion__Signo_opAssignment_2 )
            {
             before(grammarAccess.getOperacionAccess().getSigno_opAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4744:1: ( rule__Operacion__Signo_opAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4744:2: rule__Operacion__Signo_opAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Signo_opAssignment_2_in_rule__Operacion__Group__2__Impl9732);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4754:1: rule__Operacion__Group__3 : rule__Operacion__Group__3__Impl rule__Operacion__Group__4 ;
    public final void rule__Operacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4758:1: ( rule__Operacion__Group__3__Impl rule__Operacion__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4759:2: rule__Operacion__Group__3__Impl rule__Operacion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__3__Impl_in_rule__Operacion__Group__39762);
            rule__Operacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__4_in_rule__Operacion__Group__39765);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4766:1: rule__Operacion__Group__3__Impl : ( ( rule__Operacion__Op_derAssignment_3 ) ) ;
    public final void rule__Operacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4770:1: ( ( ( rule__Operacion__Op_derAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4771:1: ( ( rule__Operacion__Op_derAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4771:1: ( ( rule__Operacion__Op_derAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4772:1: ( rule__Operacion__Op_derAssignment_3 )
            {
             before(grammarAccess.getOperacionAccess().getOp_derAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4773:1: ( rule__Operacion__Op_derAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4773:2: rule__Operacion__Op_derAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Op_derAssignment_3_in_rule__Operacion__Group__3__Impl9792);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4783:1: rule__Operacion__Group__4 : rule__Operacion__Group__4__Impl ;
    public final void rule__Operacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4787:1: ( rule__Operacion__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4788:2: rule__Operacion__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__4__Impl_in_rule__Operacion__Group__49822);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4794:1: rule__Operacion__Group__4__Impl : ( ')' ) ;
    public final void rule__Operacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4798:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4799:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4799:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4800:1: ')'
            {
             before(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_4()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Operacion__Group__4__Impl9850); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4823:1: rule__Sino__Group__0 : rule__Sino__Group__0__Impl rule__Sino__Group__1 ;
    public final void rule__Sino__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4827:1: ( rule__Sino__Group__0__Impl rule__Sino__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4828:2: rule__Sino__Group__0__Impl rule__Sino__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__0__Impl_in_rule__Sino__Group__09891);
            rule__Sino__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__1_in_rule__Sino__Group__09894);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4835:1: rule__Sino__Group__0__Impl : ( () ) ;
    public final void rule__Sino__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4839:1: ( ( () ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4840:1: ( () )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4840:1: ( () )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4841:1: ()
            {
             before(grammarAccess.getSinoAccess().getSinoAction_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4842:1: ()
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4844:1: 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4854:1: rule__Sino__Group__1 : rule__Sino__Group__1__Impl rule__Sino__Group__2 ;
    public final void rule__Sino__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4858:1: ( rule__Sino__Group__1__Impl rule__Sino__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4859:2: rule__Sino__Group__1__Impl rule__Sino__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__1__Impl_in_rule__Sino__Group__19952);
            rule__Sino__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__2_in_rule__Sino__Group__19955);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4866:1: rule__Sino__Group__1__Impl : ( 'sino' ) ;
    public final void rule__Sino__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4870:1: ( ( 'sino' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4871:1: ( 'sino' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4871:1: ( 'sino' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4872:1: 'sino'
            {
             before(grammarAccess.getSinoAccess().getSinoKeyword_1()); 
            match(input,68,FollowSets000.FOLLOW_68_in_rule__Sino__Group__1__Impl9983); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4885:1: rule__Sino__Group__2 : rule__Sino__Group__2__Impl ;
    public final void rule__Sino__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4889:1: ( rule__Sino__Group__2__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4890:2: rule__Sino__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__2__Impl_in_rule__Sino__Group__210014);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4896:1: rule__Sino__Group__2__Impl : ( ( rule__Sino__Group_2__0 )? ) ;
    public final void rule__Sino__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4900:1: ( ( ( rule__Sino__Group_2__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4901:1: ( ( rule__Sino__Group_2__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4901:1: ( ( rule__Sino__Group_2__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4902:1: ( rule__Sino__Group_2__0 )?
            {
             before(grammarAccess.getSinoAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4903:1: ( rule__Sino__Group_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_ID)||(LA41_0>=54 && LA41_0<=56)||LA41_0==59||LA41_0==62||LA41_0==64) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4903:2: rule__Sino__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__0_in_rule__Sino__Group__2__Impl10041);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4919:1: rule__Sino__Group_2__0 : rule__Sino__Group_2__0__Impl rule__Sino__Group_2__1 ;
    public final void rule__Sino__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4923:1: ( rule__Sino__Group_2__0__Impl rule__Sino__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4924:2: rule__Sino__Group_2__0__Impl rule__Sino__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__0__Impl_in_rule__Sino__Group_2__010078);
            rule__Sino__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__1_in_rule__Sino__Group_2__010081);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4931:1: rule__Sino__Group_2__0__Impl : ( ( rule__Sino__SentenciasAssignment_2_0 ) ) ;
    public final void rule__Sino__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4935:1: ( ( ( rule__Sino__SentenciasAssignment_2_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4936:1: ( ( rule__Sino__SentenciasAssignment_2_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4936:1: ( ( rule__Sino__SentenciasAssignment_2_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4937:1: ( rule__Sino__SentenciasAssignment_2_0 )
            {
             before(grammarAccess.getSinoAccess().getSentenciasAssignment_2_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4938:1: ( rule__Sino__SentenciasAssignment_2_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4938:2: rule__Sino__SentenciasAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__SentenciasAssignment_2_0_in_rule__Sino__Group_2__0__Impl10108);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4948:1: rule__Sino__Group_2__1 : rule__Sino__Group_2__1__Impl ;
    public final void rule__Sino__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4952:1: ( rule__Sino__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4953:2: rule__Sino__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__1__Impl_in_rule__Sino__Group_2__110138);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4959:1: rule__Sino__Group_2__1__Impl : ( ( rule__Sino__SentenciasAssignment_2_1 )* ) ;
    public final void rule__Sino__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4963:1: ( ( ( rule__Sino__SentenciasAssignment_2_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4964:1: ( ( rule__Sino__SentenciasAssignment_2_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4964:1: ( ( rule__Sino__SentenciasAssignment_2_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4965:1: ( rule__Sino__SentenciasAssignment_2_1 )*
            {
             before(grammarAccess.getSinoAccess().getSentenciasAssignment_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4966:1: ( rule__Sino__SentenciasAssignment_2_1 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_ID)||(LA42_0>=54 && LA42_0<=56)||LA42_0==59||LA42_0==62||LA42_0==64) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4966:2: rule__Sino__SentenciasAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Sino__SentenciasAssignment_2_1_in_rule__Sino__Group_2__1__Impl10165);
            	    rule__Sino__SentenciasAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4980:1: rule__ParametroFuncion__Group__0 : rule__ParametroFuncion__Group__0__Impl rule__ParametroFuncion__Group__1 ;
    public final void rule__ParametroFuncion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4984:1: ( rule__ParametroFuncion__Group__0__Impl rule__ParametroFuncion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4985:2: rule__ParametroFuncion__Group__0__Impl rule__ParametroFuncion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__0__Impl_in_rule__ParametroFuncion__Group__010200);
            rule__ParametroFuncion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__1_in_rule__ParametroFuncion__Group__010203);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4992:1: rule__ParametroFuncion__Group__0__Impl : ( ( rule__ParametroFuncion__PasoAssignment_0 ) ) ;
    public final void rule__ParametroFuncion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4996:1: ( ( ( rule__ParametroFuncion__PasoAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4997:1: ( ( rule__ParametroFuncion__PasoAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4997:1: ( ( rule__ParametroFuncion__PasoAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4998:1: ( rule__ParametroFuncion__PasoAssignment_0 )
            {
             before(grammarAccess.getParametroFuncionAccess().getPasoAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4999:1: ( rule__ParametroFuncion__PasoAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4999:2: rule__ParametroFuncion__PasoAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__PasoAssignment_0_in_rule__ParametroFuncion__Group__0__Impl10230);
            rule__ParametroFuncion__PasoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParametroFuncionAccess().getPasoAssignment_0()); 

            }


            }

        }
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5009:1: rule__ParametroFuncion__Group__1 : rule__ParametroFuncion__Group__1__Impl rule__ParametroFuncion__Group__2 ;
    public final void rule__ParametroFuncion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5013:1: ( rule__ParametroFuncion__Group__1__Impl rule__ParametroFuncion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5014:2: rule__ParametroFuncion__Group__1__Impl rule__ParametroFuncion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__1__Impl_in_rule__ParametroFuncion__Group__110260);
            rule__ParametroFuncion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__2_in_rule__ParametroFuncion__Group__110263);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5021:1: rule__ParametroFuncion__Group__1__Impl : ( ( ( rule__ParametroFuncion__TipoAssignment_1 ) ) ( ( rule__ParametroFuncion__TipoAssignment_1 )* ) ) ;
    public final void rule__ParametroFuncion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5025:1: ( ( ( ( rule__ParametroFuncion__TipoAssignment_1 ) ) ( ( rule__ParametroFuncion__TipoAssignment_1 )* ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5026:1: ( ( ( rule__ParametroFuncion__TipoAssignment_1 ) ) ( ( rule__ParametroFuncion__TipoAssignment_1 )* ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5026:1: ( ( ( rule__ParametroFuncion__TipoAssignment_1 ) ) ( ( rule__ParametroFuncion__TipoAssignment_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5027:1: ( ( rule__ParametroFuncion__TipoAssignment_1 ) ) ( ( rule__ParametroFuncion__TipoAssignment_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5027:1: ( ( rule__ParametroFuncion__TipoAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5028:1: ( rule__ParametroFuncion__TipoAssignment_1 )
            {
             before(grammarAccess.getParametroFuncionAccess().getTipoAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5029:1: ( rule__ParametroFuncion__TipoAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5029:2: rule__ParametroFuncion__TipoAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__TipoAssignment_1_in_rule__ParametroFuncion__Group__1__Impl10292);
            rule__ParametroFuncion__TipoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParametroFuncionAccess().getTipoAssignment_1()); 

            }

            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5032:1: ( ( rule__ParametroFuncion__TipoAssignment_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5033:1: ( rule__ParametroFuncion__TipoAssignment_1 )*
            {
             before(grammarAccess.getParametroFuncionAccess().getTipoAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5034:1: ( rule__ParametroFuncion__TipoAssignment_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=21 && LA43_0<=25)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5034:2: rule__ParametroFuncion__TipoAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__TipoAssignment_1_in_rule__ParametroFuncion__Group__1__Impl10304);
            	    rule__ParametroFuncion__TipoAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getParametroFuncionAccess().getTipoAssignment_1()); 

            }


            }


            }

        }
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5045:1: rule__ParametroFuncion__Group__2 : rule__ParametroFuncion__Group__2__Impl rule__ParametroFuncion__Group__3 ;
    public final void rule__ParametroFuncion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5049:1: ( rule__ParametroFuncion__Group__2__Impl rule__ParametroFuncion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5050:2: rule__ParametroFuncion__Group__2__Impl rule__ParametroFuncion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__2__Impl_in_rule__ParametroFuncion__Group__210337);
            rule__ParametroFuncion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__3_in_rule__ParametroFuncion__Group__210340);
            rule__ParametroFuncion__Group__3();

            state._fsp--;


            }

        }
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5057:1: rule__ParametroFuncion__Group__2__Impl : ( ':' ) ;
    public final void rule__ParametroFuncion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5061:1: ( ( ':' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5062:1: ( ':' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5062:1: ( ':' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5063:1: ':'
            {
             before(grammarAccess.getParametroFuncionAccess().getColonKeyword_2()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__ParametroFuncion__Group__2__Impl10368); 
             after(grammarAccess.getParametroFuncionAccess().getColonKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ParametroFuncion__Group__3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5076:1: rule__ParametroFuncion__Group__3 : rule__ParametroFuncion__Group__3__Impl ;
    public final void rule__ParametroFuncion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5080:1: ( rule__ParametroFuncion__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5081:2: rule__ParametroFuncion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__3__Impl_in_rule__ParametroFuncion__Group__310399);
            rule__ParametroFuncion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametroFuncion__Group__3"


    // $ANTLR start "rule__ParametroFuncion__Group__3__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5087:1: rule__ParametroFuncion__Group__3__Impl : ( ( rule__ParametroFuncion__VariableAssignment_3 ) ) ;
    public final void rule__ParametroFuncion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5091:1: ( ( ( rule__ParametroFuncion__VariableAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5092:1: ( ( rule__ParametroFuncion__VariableAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5092:1: ( ( rule__ParametroFuncion__VariableAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5093:1: ( rule__ParametroFuncion__VariableAssignment_3 )
            {
             before(grammarAccess.getParametroFuncionAccess().getVariableAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5094:1: ( rule__ParametroFuncion__VariableAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5094:2: rule__ParametroFuncion__VariableAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__VariableAssignment_3_in_rule__ParametroFuncion__Group__3__Impl10426);
            rule__ParametroFuncion__VariableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParametroFuncionAccess().getVariableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametroFuncion__Group__3__Impl"


    // $ANTLR start "rule__Funcion__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5112:1: rule__Funcion__Group__0 : rule__Funcion__Group__0__Impl rule__Funcion__Group__1 ;
    public final void rule__Funcion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5116:1: ( rule__Funcion__Group__0__Impl rule__Funcion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5117:2: rule__Funcion__Group__0__Impl rule__Funcion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__0__Impl_in_rule__Funcion__Group__010464);
            rule__Funcion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__1_in_rule__Funcion__Group__010467);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5124:1: rule__Funcion__Group__0__Impl : ( ( rule__Funcion__TipoAssignment_0 ) ) ;
    public final void rule__Funcion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5128:1: ( ( ( rule__Funcion__TipoAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5129:1: ( ( rule__Funcion__TipoAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5129:1: ( ( rule__Funcion__TipoAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5130:1: ( rule__Funcion__TipoAssignment_0 )
            {
             before(grammarAccess.getFuncionAccess().getTipoAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5131:1: ( rule__Funcion__TipoAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5131:2: rule__Funcion__TipoAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__TipoAssignment_0_in_rule__Funcion__Group__0__Impl10494);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5141:1: rule__Funcion__Group__1 : rule__Funcion__Group__1__Impl rule__Funcion__Group__2 ;
    public final void rule__Funcion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5145:1: ( rule__Funcion__Group__1__Impl rule__Funcion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5146:2: rule__Funcion__Group__1__Impl rule__Funcion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__1__Impl_in_rule__Funcion__Group__110524);
            rule__Funcion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__2_in_rule__Funcion__Group__110527);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5153:1: rule__Funcion__Group__1__Impl : ( 'funcion' ) ;
    public final void rule__Funcion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5157:1: ( ( 'funcion' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5158:1: ( 'funcion' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5158:1: ( 'funcion' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5159:1: 'funcion'
            {
             before(grammarAccess.getFuncionAccess().getFuncionKeyword_1()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__Funcion__Group__1__Impl10555); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5172:1: rule__Funcion__Group__2 : rule__Funcion__Group__2__Impl rule__Funcion__Group__3 ;
    public final void rule__Funcion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5176:1: ( rule__Funcion__Group__2__Impl rule__Funcion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5177:2: rule__Funcion__Group__2__Impl rule__Funcion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__2__Impl_in_rule__Funcion__Group__210586);
            rule__Funcion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__3_in_rule__Funcion__Group__210589);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5184:1: rule__Funcion__Group__2__Impl : ( ( rule__Funcion__NombreAssignment_2 ) ) ;
    public final void rule__Funcion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5188:1: ( ( ( rule__Funcion__NombreAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5189:1: ( ( rule__Funcion__NombreAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5189:1: ( ( rule__Funcion__NombreAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5190:1: ( rule__Funcion__NombreAssignment_2 )
            {
             before(grammarAccess.getFuncionAccess().getNombreAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5191:1: ( rule__Funcion__NombreAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5191:2: rule__Funcion__NombreAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__NombreAssignment_2_in_rule__Funcion__Group__2__Impl10616);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5201:1: rule__Funcion__Group__3 : rule__Funcion__Group__3__Impl rule__Funcion__Group__4 ;
    public final void rule__Funcion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5205:1: ( rule__Funcion__Group__3__Impl rule__Funcion__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5206:2: rule__Funcion__Group__3__Impl rule__Funcion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__3__Impl_in_rule__Funcion__Group__310646);
            rule__Funcion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__4_in_rule__Funcion__Group__310649);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5213:1: rule__Funcion__Group__3__Impl : ( '(' ) ;
    public final void rule__Funcion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5217:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5218:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5218:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5219:1: '('
            {
             before(grammarAccess.getFuncionAccess().getLeftParenthesisKeyword_3()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Funcion__Group__3__Impl10677); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5232:1: rule__Funcion__Group__4 : rule__Funcion__Group__4__Impl rule__Funcion__Group__5 ;
    public final void rule__Funcion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5236:1: ( rule__Funcion__Group__4__Impl rule__Funcion__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5237:2: rule__Funcion__Group__4__Impl rule__Funcion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__4__Impl_in_rule__Funcion__Group__410708);
            rule__Funcion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__5_in_rule__Funcion__Group__410711);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5244:1: rule__Funcion__Group__4__Impl : ( ( rule__Funcion__Group_4__0 )? ) ;
    public final void rule__Funcion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5248:1: ( ( ( rule__Funcion__Group_4__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5249:1: ( ( rule__Funcion__Group_4__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5249:1: ( ( rule__Funcion__Group_4__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5250:1: ( rule__Funcion__Group_4__0 )?
            {
             before(grammarAccess.getFuncionAccess().getGroup_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5251:1: ( rule__Funcion__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==26||(LA44_0>=44 && LA44_0<=45)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5251:2: rule__Funcion__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__0_in_rule__Funcion__Group__4__Impl10738);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5261:1: rule__Funcion__Group__5 : rule__Funcion__Group__5__Impl rule__Funcion__Group__6 ;
    public final void rule__Funcion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5265:1: ( rule__Funcion__Group__5__Impl rule__Funcion__Group__6 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5266:2: rule__Funcion__Group__5__Impl rule__Funcion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__5__Impl_in_rule__Funcion__Group__510769);
            rule__Funcion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__6_in_rule__Funcion__Group__510772);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5273:1: rule__Funcion__Group__5__Impl : ( ')' ) ;
    public final void rule__Funcion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5277:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5278:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5278:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5279:1: ')'
            {
             before(grammarAccess.getFuncionAccess().getRightParenthesisKeyword_5()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Funcion__Group__5__Impl10800); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5292:1: rule__Funcion__Group__6 : rule__Funcion__Group__6__Impl rule__Funcion__Group__7 ;
    public final void rule__Funcion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5296:1: ( rule__Funcion__Group__6__Impl rule__Funcion__Group__7 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5297:2: rule__Funcion__Group__6__Impl rule__Funcion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__6__Impl_in_rule__Funcion__Group__610831);
            rule__Funcion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__7_in_rule__Funcion__Group__610834);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5304:1: rule__Funcion__Group__6__Impl : ( 'var' ) ;
    public final void rule__Funcion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5308:1: ( ( 'var' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5309:1: ( 'var' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5309:1: ( 'var' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5310:1: 'var'
            {
             before(grammarAccess.getFuncionAccess().getVarKeyword_6()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Funcion__Group__6__Impl10862); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5323:1: rule__Funcion__Group__7 : rule__Funcion__Group__7__Impl rule__Funcion__Group__8 ;
    public final void rule__Funcion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5327:1: ( rule__Funcion__Group__7__Impl rule__Funcion__Group__8 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5328:2: rule__Funcion__Group__7__Impl rule__Funcion__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__7__Impl_in_rule__Funcion__Group__710893);
            rule__Funcion__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__8_in_rule__Funcion__Group__710896);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5335:1: rule__Funcion__Group__7__Impl : ( ( rule__Funcion__Group_7__0 )? ) ;
    public final void rule__Funcion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5339:1: ( ( ( rule__Funcion__Group_7__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5340:1: ( ( rule__Funcion__Group_7__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5340:1: ( ( rule__Funcion__Group_7__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5341:1: ( rule__Funcion__Group_7__0 )?
            {
             before(grammarAccess.getFuncionAccess().getGroup_7()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5342:1: ( rule__Funcion__Group_7__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=21 && LA45_0<=25)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5342:2: rule__Funcion__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__0_in_rule__Funcion__Group__7__Impl10923);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5352:1: rule__Funcion__Group__8 : rule__Funcion__Group__8__Impl rule__Funcion__Group__9 ;
    public final void rule__Funcion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5356:1: ( rule__Funcion__Group__8__Impl rule__Funcion__Group__9 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5357:2: rule__Funcion__Group__8__Impl rule__Funcion__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__8__Impl_in_rule__Funcion__Group__810954);
            rule__Funcion__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__9_in_rule__Funcion__Group__810957);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5364:1: rule__Funcion__Group__8__Impl : ( 'inicio' ) ;
    public final void rule__Funcion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5368:1: ( ( 'inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5369:1: ( 'inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5369:1: ( 'inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5370:1: 'inicio'
            {
             before(grammarAccess.getFuncionAccess().getInicioKeyword_8()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Funcion__Group__8__Impl10985); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5383:1: rule__Funcion__Group__9 : rule__Funcion__Group__9__Impl rule__Funcion__Group__10 ;
    public final void rule__Funcion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5387:1: ( rule__Funcion__Group__9__Impl rule__Funcion__Group__10 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5388:2: rule__Funcion__Group__9__Impl rule__Funcion__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__9__Impl_in_rule__Funcion__Group__911016);
            rule__Funcion__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__10_in_rule__Funcion__Group__911019);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5395:1: rule__Funcion__Group__9__Impl : ( ( rule__Funcion__Group_9__0 )? ) ;
    public final void rule__Funcion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5399:1: ( ( ( rule__Funcion__Group_9__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5400:1: ( ( rule__Funcion__Group_9__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5400:1: ( ( rule__Funcion__Group_9__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5401:1: ( rule__Funcion__Group_9__0 )?
            {
             before(grammarAccess.getFuncionAccess().getGroup_9()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5402:1: ( rule__Funcion__Group_9__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_STRING && LA46_0<=RULE_ID)||(LA46_0>=54 && LA46_0<=56)||LA46_0==59||LA46_0==62||LA46_0==64) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5402:2: rule__Funcion__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_9__0_in_rule__Funcion__Group__9__Impl11046);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5412:1: rule__Funcion__Group__10 : rule__Funcion__Group__10__Impl rule__Funcion__Group__11 ;
    public final void rule__Funcion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5416:1: ( rule__Funcion__Group__10__Impl rule__Funcion__Group__11 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5417:2: rule__Funcion__Group__10__Impl rule__Funcion__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__10__Impl_in_rule__Funcion__Group__1011077);
            rule__Funcion__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__11_in_rule__Funcion__Group__1011080);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5424:1: rule__Funcion__Group__10__Impl : ( 'devolver' ) ;
    public final void rule__Funcion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5428:1: ( ( 'devolver' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5429:1: ( 'devolver' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5429:1: ( 'devolver' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5430:1: 'devolver'
            {
             before(grammarAccess.getFuncionAccess().getDevolverKeyword_10()); 
            match(input,70,FollowSets000.FOLLOW_70_in_rule__Funcion__Group__10__Impl11108); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5443:1: rule__Funcion__Group__11 : rule__Funcion__Group__11__Impl rule__Funcion__Group__12 ;
    public final void rule__Funcion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5447:1: ( rule__Funcion__Group__11__Impl rule__Funcion__Group__12 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5448:2: rule__Funcion__Group__11__Impl rule__Funcion__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__11__Impl_in_rule__Funcion__Group__1111139);
            rule__Funcion__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__12_in_rule__Funcion__Group__1111142);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5455:1: rule__Funcion__Group__11__Impl : ( '(' ) ;
    public final void rule__Funcion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5459:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5460:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5460:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5461:1: '('
            {
             before(grammarAccess.getFuncionAccess().getLeftParenthesisKeyword_11()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Funcion__Group__11__Impl11170); 
             after(grammarAccess.getFuncionAccess().getLeftParenthesisKeyword_11()); 

            }


            }

        }
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5474:1: rule__Funcion__Group__12 : rule__Funcion__Group__12__Impl rule__Funcion__Group__13 ;
    public final void rule__Funcion__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5478:1: ( rule__Funcion__Group__12__Impl rule__Funcion__Group__13 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5479:2: rule__Funcion__Group__12__Impl rule__Funcion__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__12__Impl_in_rule__Funcion__Group__1211201);
            rule__Funcion__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__13_in_rule__Funcion__Group__1211204);
            rule__Funcion__Group__13();

            state._fsp--;


            }

        }
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5486:1: rule__Funcion__Group__12__Impl : ( ( rule__Funcion__DevuelveAssignment_12 ) ) ;
    public final void rule__Funcion__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5490:1: ( ( ( rule__Funcion__DevuelveAssignment_12 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5491:1: ( ( rule__Funcion__DevuelveAssignment_12 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5491:1: ( ( rule__Funcion__DevuelveAssignment_12 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5492:1: ( rule__Funcion__DevuelveAssignment_12 )
            {
             before(grammarAccess.getFuncionAccess().getDevuelveAssignment_12()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5493:1: ( rule__Funcion__DevuelveAssignment_12 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5493:2: rule__Funcion__DevuelveAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__DevuelveAssignment_12_in_rule__Funcion__Group__12__Impl11231);
            rule__Funcion__DevuelveAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getFuncionAccess().getDevuelveAssignment_12()); 

            }


            }

        }
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


    // $ANTLR start "rule__Funcion__Group__13"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5503:1: rule__Funcion__Group__13 : rule__Funcion__Group__13__Impl rule__Funcion__Group__14 ;
    public final void rule__Funcion__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5507:1: ( rule__Funcion__Group__13__Impl rule__Funcion__Group__14 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5508:2: rule__Funcion__Group__13__Impl rule__Funcion__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__13__Impl_in_rule__Funcion__Group__1311261);
            rule__Funcion__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__14_in_rule__Funcion__Group__1311264);
            rule__Funcion__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__13"


    // $ANTLR start "rule__Funcion__Group__13__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5515:1: rule__Funcion__Group__13__Impl : ( ')' ) ;
    public final void rule__Funcion__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5519:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5520:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5520:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5521:1: ')'
            {
             before(grammarAccess.getFuncionAccess().getRightParenthesisKeyword_13()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Funcion__Group__13__Impl11292); 
             after(grammarAccess.getFuncionAccess().getRightParenthesisKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__13__Impl"


    // $ANTLR start "rule__Funcion__Group__14"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5534:1: rule__Funcion__Group__14 : rule__Funcion__Group__14__Impl ;
    public final void rule__Funcion__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5538:1: ( rule__Funcion__Group__14__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5539:2: rule__Funcion__Group__14__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__14__Impl_in_rule__Funcion__Group__1411323);
            rule__Funcion__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__14"


    // $ANTLR start "rule__Funcion__Group__14__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5545:1: rule__Funcion__Group__14__Impl : ( 'fin_funcion' ) ;
    public final void rule__Funcion__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5549:1: ( ( 'fin_funcion' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5550:1: ( 'fin_funcion' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5550:1: ( 'fin_funcion' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5551:1: 'fin_funcion'
            {
             before(grammarAccess.getFuncionAccess().getFin_funcionKeyword_14()); 
            match(input,71,FollowSets000.FOLLOW_71_in_rule__Funcion__Group__14__Impl11351); 
             after(grammarAccess.getFuncionAccess().getFin_funcionKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__14__Impl"


    // $ANTLR start "rule__Funcion__Group_4__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5594:1: rule__Funcion__Group_4__0 : rule__Funcion__Group_4__0__Impl rule__Funcion__Group_4__1 ;
    public final void rule__Funcion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5598:1: ( rule__Funcion__Group_4__0__Impl rule__Funcion__Group_4__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5599:2: rule__Funcion__Group_4__0__Impl rule__Funcion__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__0__Impl_in_rule__Funcion__Group_4__011412);
            rule__Funcion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__1_in_rule__Funcion__Group_4__011415);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5606:1: rule__Funcion__Group_4__0__Impl : ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) ) ;
    public final void rule__Funcion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5610:1: ( ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5611:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5611:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5612:1: ( rule__Funcion__ParametrofuncionAssignment_4_0 )
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionAssignment_4_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5613:1: ( rule__Funcion__ParametrofuncionAssignment_4_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5613:2: rule__Funcion__ParametrofuncionAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_0_in_rule__Funcion__Group_4__0__Impl11442);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5623:1: rule__Funcion__Group_4__1 : rule__Funcion__Group_4__1__Impl ;
    public final void rule__Funcion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5627:1: ( rule__Funcion__Group_4__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5628:2: rule__Funcion__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__1__Impl_in_rule__Funcion__Group_4__111472);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5634:1: rule__Funcion__Group_4__1__Impl : ( ( rule__Funcion__Group_4_1__0 )* ) ;
    public final void rule__Funcion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5638:1: ( ( ( rule__Funcion__Group_4_1__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5639:1: ( ( rule__Funcion__Group_4_1__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5639:1: ( ( rule__Funcion__Group_4_1__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5640:1: ( rule__Funcion__Group_4_1__0 )*
            {
             before(grammarAccess.getFuncionAccess().getGroup_4_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5641:1: ( rule__Funcion__Group_4_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==52) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5641:2: rule__Funcion__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__0_in_rule__Funcion__Group_4__1__Impl11499);
            	    rule__Funcion__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5655:1: rule__Funcion__Group_4_1__0 : rule__Funcion__Group_4_1__0__Impl rule__Funcion__Group_4_1__1 ;
    public final void rule__Funcion__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5659:1: ( rule__Funcion__Group_4_1__0__Impl rule__Funcion__Group_4_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5660:2: rule__Funcion__Group_4_1__0__Impl rule__Funcion__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__0__Impl_in_rule__Funcion__Group_4_1__011534);
            rule__Funcion__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__1_in_rule__Funcion__Group_4_1__011537);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5667:1: rule__Funcion__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Funcion__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5671:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5672:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5672:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5673:1: ','
            {
             before(grammarAccess.getFuncionAccess().getCommaKeyword_4_1_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Funcion__Group_4_1__0__Impl11565); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5686:1: rule__Funcion__Group_4_1__1 : rule__Funcion__Group_4_1__1__Impl ;
    public final void rule__Funcion__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5690:1: ( rule__Funcion__Group_4_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5691:2: rule__Funcion__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__1__Impl_in_rule__Funcion__Group_4_1__111596);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5697:1: rule__Funcion__Group_4_1__1__Impl : ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) ) ;
    public final void rule__Funcion__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5701:1: ( ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5702:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5702:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5703:1: ( rule__Funcion__ParametrofuncionAssignment_4_1_1 )
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionAssignment_4_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5704:1: ( rule__Funcion__ParametrofuncionAssignment_4_1_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5704:2: rule__Funcion__ParametrofuncionAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_1_1_in_rule__Funcion__Group_4_1__1__Impl11623);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5718:1: rule__Funcion__Group_7__0 : rule__Funcion__Group_7__0__Impl rule__Funcion__Group_7__1 ;
    public final void rule__Funcion__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5722:1: ( rule__Funcion__Group_7__0__Impl rule__Funcion__Group_7__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5723:2: rule__Funcion__Group_7__0__Impl rule__Funcion__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__0__Impl_in_rule__Funcion__Group_7__011657);
            rule__Funcion__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__1_in_rule__Funcion__Group_7__011660);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5730:1: rule__Funcion__Group_7__0__Impl : ( ( rule__Funcion__DeclaracionvariableAssignment_7_0 ) ) ;
    public final void rule__Funcion__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5734:1: ( ( ( rule__Funcion__DeclaracionvariableAssignment_7_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5735:1: ( ( rule__Funcion__DeclaracionvariableAssignment_7_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5735:1: ( ( rule__Funcion__DeclaracionvariableAssignment_7_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5736:1: ( rule__Funcion__DeclaracionvariableAssignment_7_0 )
            {
             before(grammarAccess.getFuncionAccess().getDeclaracionvariableAssignment_7_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5737:1: ( rule__Funcion__DeclaracionvariableAssignment_7_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5737:2: rule__Funcion__DeclaracionvariableAssignment_7_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__DeclaracionvariableAssignment_7_0_in_rule__Funcion__Group_7__0__Impl11687);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5747:1: rule__Funcion__Group_7__1 : rule__Funcion__Group_7__1__Impl ;
    public final void rule__Funcion__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5751:1: ( rule__Funcion__Group_7__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5752:2: rule__Funcion__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__1__Impl_in_rule__Funcion__Group_7__111717);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5758:1: rule__Funcion__Group_7__1__Impl : ( ( rule__Funcion__DeclaracionvariableAssignment_7_1 )* ) ;
    public final void rule__Funcion__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5762:1: ( ( ( rule__Funcion__DeclaracionvariableAssignment_7_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5763:1: ( ( rule__Funcion__DeclaracionvariableAssignment_7_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5763:1: ( ( rule__Funcion__DeclaracionvariableAssignment_7_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5764:1: ( rule__Funcion__DeclaracionvariableAssignment_7_1 )*
            {
             before(grammarAccess.getFuncionAccess().getDeclaracionvariableAssignment_7_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5765:1: ( rule__Funcion__DeclaracionvariableAssignment_7_1 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=21 && LA48_0<=25)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5765:2: rule__Funcion__DeclaracionvariableAssignment_7_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Funcion__DeclaracionvariableAssignment_7_1_in_rule__Funcion__Group_7__1__Impl11744);
            	    rule__Funcion__DeclaracionvariableAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5779:1: rule__Funcion__Group_9__0 : rule__Funcion__Group_9__0__Impl rule__Funcion__Group_9__1 ;
    public final void rule__Funcion__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5783:1: ( rule__Funcion__Group_9__0__Impl rule__Funcion__Group_9__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5784:2: rule__Funcion__Group_9__0__Impl rule__Funcion__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_9__0__Impl_in_rule__Funcion__Group_9__011779);
            rule__Funcion__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_9__1_in_rule__Funcion__Group_9__011782);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5791:1: rule__Funcion__Group_9__0__Impl : ( ( rule__Funcion__SentenciasAssignment_9_0 ) ) ;
    public final void rule__Funcion__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5795:1: ( ( ( rule__Funcion__SentenciasAssignment_9_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5796:1: ( ( rule__Funcion__SentenciasAssignment_9_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5796:1: ( ( rule__Funcion__SentenciasAssignment_9_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5797:1: ( rule__Funcion__SentenciasAssignment_9_0 )
            {
             before(grammarAccess.getFuncionAccess().getSentenciasAssignment_9_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5798:1: ( rule__Funcion__SentenciasAssignment_9_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5798:2: rule__Funcion__SentenciasAssignment_9_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__SentenciasAssignment_9_0_in_rule__Funcion__Group_9__0__Impl11809);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5808:1: rule__Funcion__Group_9__1 : rule__Funcion__Group_9__1__Impl ;
    public final void rule__Funcion__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5812:1: ( rule__Funcion__Group_9__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5813:2: rule__Funcion__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_9__1__Impl_in_rule__Funcion__Group_9__111839);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5819:1: rule__Funcion__Group_9__1__Impl : ( ( rule__Funcion__SentenciasAssignment_9_1 )* ) ;
    public final void rule__Funcion__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5823:1: ( ( ( rule__Funcion__SentenciasAssignment_9_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5824:1: ( ( rule__Funcion__SentenciasAssignment_9_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5824:1: ( ( rule__Funcion__SentenciasAssignment_9_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5825:1: ( rule__Funcion__SentenciasAssignment_9_1 )*
            {
             before(grammarAccess.getFuncionAccess().getSentenciasAssignment_9_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5826:1: ( rule__Funcion__SentenciasAssignment_9_1 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_ID)||(LA49_0>=54 && LA49_0<=56)||LA49_0==59||LA49_0==62||LA49_0==64) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5826:2: rule__Funcion__SentenciasAssignment_9_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Funcion__SentenciasAssignment_9_1_in_rule__Funcion__Group_9__1__Impl11866);
            	    rule__Funcion__SentenciasAssignment_9_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5840:1: rule__Procedimiento__Group__0 : rule__Procedimiento__Group__0__Impl rule__Procedimiento__Group__1 ;
    public final void rule__Procedimiento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5844:1: ( rule__Procedimiento__Group__0__Impl rule__Procedimiento__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5845:2: rule__Procedimiento__Group__0__Impl rule__Procedimiento__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__0__Impl_in_rule__Procedimiento__Group__011901);
            rule__Procedimiento__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__1_in_rule__Procedimiento__Group__011904);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5852:1: rule__Procedimiento__Group__0__Impl : ( 'procedimiento' ) ;
    public final void rule__Procedimiento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5856:1: ( ( 'procedimiento' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5857:1: ( 'procedimiento' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5857:1: ( 'procedimiento' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5858:1: 'procedimiento'
            {
             before(grammarAccess.getProcedimientoAccess().getProcedimientoKeyword_0()); 
            match(input,72,FollowSets000.FOLLOW_72_in_rule__Procedimiento__Group__0__Impl11932); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5871:1: rule__Procedimiento__Group__1 : rule__Procedimiento__Group__1__Impl rule__Procedimiento__Group__2 ;
    public final void rule__Procedimiento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5875:1: ( rule__Procedimiento__Group__1__Impl rule__Procedimiento__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5876:2: rule__Procedimiento__Group__1__Impl rule__Procedimiento__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__1__Impl_in_rule__Procedimiento__Group__111963);
            rule__Procedimiento__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__2_in_rule__Procedimiento__Group__111966);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5883:1: rule__Procedimiento__Group__1__Impl : ( ( rule__Procedimiento__NombreAssignment_1 ) ) ;
    public final void rule__Procedimiento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5887:1: ( ( ( rule__Procedimiento__NombreAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5888:1: ( ( rule__Procedimiento__NombreAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5888:1: ( ( rule__Procedimiento__NombreAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5889:1: ( rule__Procedimiento__NombreAssignment_1 )
            {
             before(grammarAccess.getProcedimientoAccess().getNombreAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5890:1: ( rule__Procedimiento__NombreAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5890:2: rule__Procedimiento__NombreAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__NombreAssignment_1_in_rule__Procedimiento__Group__1__Impl11993);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5900:1: rule__Procedimiento__Group__2 : rule__Procedimiento__Group__2__Impl rule__Procedimiento__Group__3 ;
    public final void rule__Procedimiento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5904:1: ( rule__Procedimiento__Group__2__Impl rule__Procedimiento__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5905:2: rule__Procedimiento__Group__2__Impl rule__Procedimiento__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__2__Impl_in_rule__Procedimiento__Group__212023);
            rule__Procedimiento__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__3_in_rule__Procedimiento__Group__212026);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5912:1: rule__Procedimiento__Group__2__Impl : ( '(' ) ;
    public final void rule__Procedimiento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5916:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5917:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5917:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5918:1: '('
            {
             before(grammarAccess.getProcedimientoAccess().getLeftParenthesisKeyword_2()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Procedimiento__Group__2__Impl12054); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5931:1: rule__Procedimiento__Group__3 : rule__Procedimiento__Group__3__Impl rule__Procedimiento__Group__4 ;
    public final void rule__Procedimiento__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5935:1: ( rule__Procedimiento__Group__3__Impl rule__Procedimiento__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5936:2: rule__Procedimiento__Group__3__Impl rule__Procedimiento__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__3__Impl_in_rule__Procedimiento__Group__312085);
            rule__Procedimiento__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__4_in_rule__Procedimiento__Group__312088);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5943:1: rule__Procedimiento__Group__3__Impl : ( ( rule__Procedimiento__Group_3__0 )? ) ;
    public final void rule__Procedimiento__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5947:1: ( ( ( rule__Procedimiento__Group_3__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5948:1: ( ( rule__Procedimiento__Group_3__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5948:1: ( ( rule__Procedimiento__Group_3__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5949:1: ( rule__Procedimiento__Group_3__0 )?
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5950:1: ( rule__Procedimiento__Group_3__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==26||(LA50_0>=44 && LA50_0<=45)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5950:2: rule__Procedimiento__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__0_in_rule__Procedimiento__Group__3__Impl12115);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5960:1: rule__Procedimiento__Group__4 : rule__Procedimiento__Group__4__Impl rule__Procedimiento__Group__5 ;
    public final void rule__Procedimiento__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5964:1: ( rule__Procedimiento__Group__4__Impl rule__Procedimiento__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5965:2: rule__Procedimiento__Group__4__Impl rule__Procedimiento__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__4__Impl_in_rule__Procedimiento__Group__412146);
            rule__Procedimiento__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__5_in_rule__Procedimiento__Group__412149);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5972:1: rule__Procedimiento__Group__4__Impl : ( ')' ) ;
    public final void rule__Procedimiento__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5976:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5977:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5977:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5978:1: ')'
            {
             before(grammarAccess.getProcedimientoAccess().getRightParenthesisKeyword_4()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Procedimiento__Group__4__Impl12177); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5991:1: rule__Procedimiento__Group__5 : rule__Procedimiento__Group__5__Impl rule__Procedimiento__Group__6 ;
    public final void rule__Procedimiento__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5995:1: ( rule__Procedimiento__Group__5__Impl rule__Procedimiento__Group__6 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5996:2: rule__Procedimiento__Group__5__Impl rule__Procedimiento__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__5__Impl_in_rule__Procedimiento__Group__512208);
            rule__Procedimiento__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__6_in_rule__Procedimiento__Group__512211);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6003:1: rule__Procedimiento__Group__5__Impl : ( 'var' ) ;
    public final void rule__Procedimiento__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6007:1: ( ( 'var' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6008:1: ( 'var' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6008:1: ( 'var' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6009:1: 'var'
            {
             before(grammarAccess.getProcedimientoAccess().getVarKeyword_5()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Procedimiento__Group__5__Impl12239); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6022:1: rule__Procedimiento__Group__6 : rule__Procedimiento__Group__6__Impl rule__Procedimiento__Group__7 ;
    public final void rule__Procedimiento__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6026:1: ( rule__Procedimiento__Group__6__Impl rule__Procedimiento__Group__7 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6027:2: rule__Procedimiento__Group__6__Impl rule__Procedimiento__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__6__Impl_in_rule__Procedimiento__Group__612270);
            rule__Procedimiento__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__7_in_rule__Procedimiento__Group__612273);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6034:1: rule__Procedimiento__Group__6__Impl : ( ( rule__Procedimiento__Group_6__0 )? ) ;
    public final void rule__Procedimiento__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6038:1: ( ( ( rule__Procedimiento__Group_6__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6039:1: ( ( rule__Procedimiento__Group_6__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6039:1: ( ( rule__Procedimiento__Group_6__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6040:1: ( rule__Procedimiento__Group_6__0 )?
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_6()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6041:1: ( rule__Procedimiento__Group_6__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=21 && LA51_0<=25)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6041:2: rule__Procedimiento__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_6__0_in_rule__Procedimiento__Group__6__Impl12300);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6051:1: rule__Procedimiento__Group__7 : rule__Procedimiento__Group__7__Impl rule__Procedimiento__Group__8 ;
    public final void rule__Procedimiento__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6055:1: ( rule__Procedimiento__Group__7__Impl rule__Procedimiento__Group__8 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6056:2: rule__Procedimiento__Group__7__Impl rule__Procedimiento__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__7__Impl_in_rule__Procedimiento__Group__712331);
            rule__Procedimiento__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__8_in_rule__Procedimiento__Group__712334);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6063:1: rule__Procedimiento__Group__7__Impl : ( 'inicio' ) ;
    public final void rule__Procedimiento__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6067:1: ( ( 'inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6068:1: ( 'inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6068:1: ( 'inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6069:1: 'inicio'
            {
             before(grammarAccess.getProcedimientoAccess().getInicioKeyword_7()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Procedimiento__Group__7__Impl12362); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6082:1: rule__Procedimiento__Group__8 : rule__Procedimiento__Group__8__Impl rule__Procedimiento__Group__9 ;
    public final void rule__Procedimiento__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6086:1: ( rule__Procedimiento__Group__8__Impl rule__Procedimiento__Group__9 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6087:2: rule__Procedimiento__Group__8__Impl rule__Procedimiento__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__8__Impl_in_rule__Procedimiento__Group__812393);
            rule__Procedimiento__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__9_in_rule__Procedimiento__Group__812396);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6094:1: rule__Procedimiento__Group__8__Impl : ( ( rule__Procedimiento__Group_8__0 )? ) ;
    public final void rule__Procedimiento__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6098:1: ( ( ( rule__Procedimiento__Group_8__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6099:1: ( ( rule__Procedimiento__Group_8__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6099:1: ( ( rule__Procedimiento__Group_8__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6100:1: ( rule__Procedimiento__Group_8__0 )?
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_8()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6101:1: ( rule__Procedimiento__Group_8__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)||(LA52_0>=54 && LA52_0<=56)||LA52_0==59||LA52_0==62||LA52_0==64) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6101:2: rule__Procedimiento__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_8__0_in_rule__Procedimiento__Group__8__Impl12423);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6111:1: rule__Procedimiento__Group__9 : rule__Procedimiento__Group__9__Impl ;
    public final void rule__Procedimiento__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6115:1: ( rule__Procedimiento__Group__9__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6116:2: rule__Procedimiento__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__9__Impl_in_rule__Procedimiento__Group__912454);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6122:1: rule__Procedimiento__Group__9__Impl : ( 'fin_procedimiento' ) ;
    public final void rule__Procedimiento__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6126:1: ( ( 'fin_procedimiento' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6127:1: ( 'fin_procedimiento' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6127:1: ( 'fin_procedimiento' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6128:1: 'fin_procedimiento'
            {
             before(grammarAccess.getProcedimientoAccess().getFin_procedimientoKeyword_9()); 
            match(input,73,FollowSets000.FOLLOW_73_in_rule__Procedimiento__Group__9__Impl12482); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6161:1: rule__Procedimiento__Group_3__0 : rule__Procedimiento__Group_3__0__Impl rule__Procedimiento__Group_3__1 ;
    public final void rule__Procedimiento__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6165:1: ( rule__Procedimiento__Group_3__0__Impl rule__Procedimiento__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6166:2: rule__Procedimiento__Group_3__0__Impl rule__Procedimiento__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__0__Impl_in_rule__Procedimiento__Group_3__012533);
            rule__Procedimiento__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__1_in_rule__Procedimiento__Group_3__012536);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6173:1: rule__Procedimiento__Group_3__0__Impl : ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) ) ;
    public final void rule__Procedimiento__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6177:1: ( ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6178:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6178:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6179:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_0 )
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionAssignment_3_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6180:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6180:2: rule__Procedimiento__ParametrofuncionAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_0_in_rule__Procedimiento__Group_3__0__Impl12563);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6190:1: rule__Procedimiento__Group_3__1 : rule__Procedimiento__Group_3__1__Impl ;
    public final void rule__Procedimiento__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6194:1: ( rule__Procedimiento__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6195:2: rule__Procedimiento__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__1__Impl_in_rule__Procedimiento__Group_3__112593);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6201:1: rule__Procedimiento__Group_3__1__Impl : ( ( rule__Procedimiento__Group_3_1__0 )* ) ;
    public final void rule__Procedimiento__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6205:1: ( ( ( rule__Procedimiento__Group_3_1__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6206:1: ( ( rule__Procedimiento__Group_3_1__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6206:1: ( ( rule__Procedimiento__Group_3_1__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6207:1: ( rule__Procedimiento__Group_3_1__0 )*
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6208:1: ( rule__Procedimiento__Group_3_1__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==52) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6208:2: rule__Procedimiento__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__0_in_rule__Procedimiento__Group_3__1__Impl12620);
            	    rule__Procedimiento__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6222:1: rule__Procedimiento__Group_3_1__0 : rule__Procedimiento__Group_3_1__0__Impl rule__Procedimiento__Group_3_1__1 ;
    public final void rule__Procedimiento__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6226:1: ( rule__Procedimiento__Group_3_1__0__Impl rule__Procedimiento__Group_3_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6227:2: rule__Procedimiento__Group_3_1__0__Impl rule__Procedimiento__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__0__Impl_in_rule__Procedimiento__Group_3_1__012655);
            rule__Procedimiento__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__1_in_rule__Procedimiento__Group_3_1__012658);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6234:1: rule__Procedimiento__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Procedimiento__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6238:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6239:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6239:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6240:1: ','
            {
             before(grammarAccess.getProcedimientoAccess().getCommaKeyword_3_1_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Procedimiento__Group_3_1__0__Impl12686); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6253:1: rule__Procedimiento__Group_3_1__1 : rule__Procedimiento__Group_3_1__1__Impl ;
    public final void rule__Procedimiento__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6257:1: ( rule__Procedimiento__Group_3_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6258:2: rule__Procedimiento__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__1__Impl_in_rule__Procedimiento__Group_3_1__112717);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6264:1: rule__Procedimiento__Group_3_1__1__Impl : ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) ) ;
    public final void rule__Procedimiento__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6268:1: ( ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6269:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6269:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6270:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 )
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionAssignment_3_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6271:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6271:2: rule__Procedimiento__ParametrofuncionAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_1_1_in_rule__Procedimiento__Group_3_1__1__Impl12744);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6285:1: rule__Procedimiento__Group_6__0 : rule__Procedimiento__Group_6__0__Impl rule__Procedimiento__Group_6__1 ;
    public final void rule__Procedimiento__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6289:1: ( rule__Procedimiento__Group_6__0__Impl rule__Procedimiento__Group_6__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6290:2: rule__Procedimiento__Group_6__0__Impl rule__Procedimiento__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_6__0__Impl_in_rule__Procedimiento__Group_6__012778);
            rule__Procedimiento__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_6__1_in_rule__Procedimiento__Group_6__012781);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6297:1: rule__Procedimiento__Group_6__0__Impl : ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 ) ) ;
    public final void rule__Procedimiento__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6301:1: ( ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6302:1: ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6302:1: ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6303:1: ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 )
            {
             before(grammarAccess.getProcedimientoAccess().getDeclaracionvariableAssignment_6_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6304:1: ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6304:2: rule__Procedimiento__DeclaracionvariableAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__DeclaracionvariableAssignment_6_0_in_rule__Procedimiento__Group_6__0__Impl12808);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6314:1: rule__Procedimiento__Group_6__1 : rule__Procedimiento__Group_6__1__Impl ;
    public final void rule__Procedimiento__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6318:1: ( rule__Procedimiento__Group_6__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6319:2: rule__Procedimiento__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_6__1__Impl_in_rule__Procedimiento__Group_6__112838);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6325:1: rule__Procedimiento__Group_6__1__Impl : ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )* ) ;
    public final void rule__Procedimiento__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6329:1: ( ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6330:1: ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6330:1: ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6331:1: ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )*
            {
             before(grammarAccess.getProcedimientoAccess().getDeclaracionvariableAssignment_6_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6332:1: ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=21 && LA54_0<=25)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6332:2: rule__Procedimiento__DeclaracionvariableAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__DeclaracionvariableAssignment_6_1_in_rule__Procedimiento__Group_6__1__Impl12865);
            	    rule__Procedimiento__DeclaracionvariableAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6346:1: rule__Procedimiento__Group_8__0 : rule__Procedimiento__Group_8__0__Impl rule__Procedimiento__Group_8__1 ;
    public final void rule__Procedimiento__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6350:1: ( rule__Procedimiento__Group_8__0__Impl rule__Procedimiento__Group_8__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6351:2: rule__Procedimiento__Group_8__0__Impl rule__Procedimiento__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_8__0__Impl_in_rule__Procedimiento__Group_8__012900);
            rule__Procedimiento__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_8__1_in_rule__Procedimiento__Group_8__012903);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6358:1: rule__Procedimiento__Group_8__0__Impl : ( ( rule__Procedimiento__SentenciasAssignment_8_0 ) ) ;
    public final void rule__Procedimiento__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6362:1: ( ( ( rule__Procedimiento__SentenciasAssignment_8_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6363:1: ( ( rule__Procedimiento__SentenciasAssignment_8_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6363:1: ( ( rule__Procedimiento__SentenciasAssignment_8_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6364:1: ( rule__Procedimiento__SentenciasAssignment_8_0 )
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasAssignment_8_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6365:1: ( rule__Procedimiento__SentenciasAssignment_8_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6365:2: rule__Procedimiento__SentenciasAssignment_8_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__SentenciasAssignment_8_0_in_rule__Procedimiento__Group_8__0__Impl12930);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6375:1: rule__Procedimiento__Group_8__1 : rule__Procedimiento__Group_8__1__Impl ;
    public final void rule__Procedimiento__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6379:1: ( rule__Procedimiento__Group_8__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6380:2: rule__Procedimiento__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_8__1__Impl_in_rule__Procedimiento__Group_8__112960);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6386:1: rule__Procedimiento__Group_8__1__Impl : ( ( rule__Procedimiento__SentenciasAssignment_8_1 )* ) ;
    public final void rule__Procedimiento__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6390:1: ( ( ( rule__Procedimiento__SentenciasAssignment_8_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6391:1: ( ( rule__Procedimiento__SentenciasAssignment_8_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6391:1: ( ( rule__Procedimiento__SentenciasAssignment_8_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6392:1: ( rule__Procedimiento__SentenciasAssignment_8_1 )*
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasAssignment_8_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6393:1: ( rule__Procedimiento__SentenciasAssignment_8_1 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_STRING && LA55_0<=RULE_ID)||(LA55_0>=54 && LA55_0<=56)||LA55_0==59||LA55_0==62||LA55_0==64) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6393:2: rule__Procedimiento__SentenciasAssignment_8_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__SentenciasAssignment_8_1_in_rule__Procedimiento__Group_8__1__Impl12987);
            	    rule__Procedimiento__SentenciasAssignment_8_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6408:1: rule__Codigo__FuncionAssignment_0_0 : ( ruleSubproceso ) ;
    public final void rule__Codigo__FuncionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6412:1: ( ( ruleSubproceso ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6413:1: ( ruleSubproceso )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6413:1: ( ruleSubproceso )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6414:1: ruleSubproceso
            {
             before(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_0_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_013027);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6423:1: rule__Codigo__FuncionAssignment_0_1 : ( ruleSubproceso ) ;
    public final void rule__Codigo__FuncionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6427:1: ( ( ruleSubproceso ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6428:1: ( ruleSubproceso )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6428:1: ( ruleSubproceso )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6429:1: ruleSubproceso
            {
             before(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_113058);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6438:1: rule__Codigo__TieneAssignment_1 : ( ruleInicio ) ;
    public final void rule__Codigo__TieneAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6442:1: ( ( ruleInicio ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6443:1: ( ruleInicio )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6443:1: ( ruleInicio )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6444:1: ruleInicio
            {
             before(grammarAccess.getCodigoAccess().getTieneInicioParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_rule__Codigo__TieneAssignment_113089);
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


    // $ANTLR start "rule__Internas__NombreAssignment_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6453:1: rule__Internas__NombreAssignment_0 : ( ruleNombreInterna ) ;
    public final void rule__Internas__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6457:1: ( ( ruleNombreInterna ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6458:1: ( ruleNombreInterna )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6458:1: ( ruleNombreInterna )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6459:1: ruleNombreInterna
            {
             before(grammarAccess.getInternasAccess().getNombreNombreInternaParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_rule__Internas__NombreAssignment_013120);
            ruleNombreInterna();

            state._fsp--;

             after(grammarAccess.getInternasAccess().getNombreNombreInternaParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__NombreAssignment_0"


    // $ANTLR start "rule__Internas__OperadorAssignment_2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6468:1: rule__Internas__OperadorAssignment_2 : ( ruleOperador ) ;
    public final void rule__Internas__OperadorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6472:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6473:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6473:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6474:1: ruleOperador
            {
             before(grammarAccess.getInternasAccess().getOperadorOperadorParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__Internas__OperadorAssignment_213151);
            ruleOperador();

            state._fsp--;

             after(grammarAccess.getInternasAccess().getOperadorOperadorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__OperadorAssignment_2"


    // $ANTLR start "rule__Caracter__ContenidoAssignment"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6483:1: rule__Caracter__ContenidoAssignment : ( RULE_CAR ) ;
    public final void rule__Caracter__ContenidoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6487:1: ( ( RULE_CAR ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6488:1: ( RULE_CAR )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6488:1: ( RULE_CAR )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6489:1: RULE_CAR
            {
             before(grammarAccess.getCaracterAccess().getContenidoCARTerminalRuleCall_0()); 
            match(input,RULE_CAR,FollowSets000.FOLLOW_RULE_CAR_in_rule__Caracter__ContenidoAssignment13182); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6498:1: rule__Inicio__DeclaracionvariableAssignment_2_0 : ( ruleDeclaracionVariable ) ;
    public final void rule__Inicio__DeclaracionvariableAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6502:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6503:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6503:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6504:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getInicioAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Inicio__DeclaracionvariableAssignment_2_013213);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6513:1: rule__Inicio__DeclaracionvariableAssignment_2_1 : ( ruleDeclaracionVariable ) ;
    public final void rule__Inicio__DeclaracionvariableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6517:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6518:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6518:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6519:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getInicioAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Inicio__DeclaracionvariableAssignment_2_113244);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6528:1: rule__Inicio__TieneAssignment_4_0 : ( ruleSentencias ) ;
    public final void rule__Inicio__TieneAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6532:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6533:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6533:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6534:1: ruleSentencias
            {
             before(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_4_013275);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6543:1: rule__Inicio__TieneAssignment_4_1 : ( ruleSentencias ) ;
    public final void rule__Inicio__TieneAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6547:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6548:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6548:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6549:1: ruleSentencias
            {
             before(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_4_113306);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6558:1: rule__DeclaracionVariable__TipoAssignment_0 : ( ruleTipoVariable ) ;
    public final void rule__DeclaracionVariable__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6562:1: ( ( ruleTipoVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6563:1: ( ruleTipoVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6563:1: ( ruleTipoVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6564:1: ruleTipoVariable
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_rule__DeclaracionVariable__TipoAssignment_013337);
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


    // $ANTLR start "rule__DeclaracionVariable__TieneIDsAssignment_2"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6573:1: rule__DeclaracionVariable__TieneIDsAssignment_2 : ( ruleVariable ) ;
    public final void rule__DeclaracionVariable__TieneIDsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6577:1: ( ( ruleVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6578:1: ( ruleVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6578:1: ( ruleVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6579:1: ruleVariable
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsVariableParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_213368);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getDeclaracionVariableAccess().getTieneIDsVariableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__TieneIDsAssignment_2"


    // $ANTLR start "rule__DeclaracionVariable__TieneIDsAssignment_3_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6588:1: rule__DeclaracionVariable__TieneIDsAssignment_3_1 : ( ruleVariable ) ;
    public final void rule__DeclaracionVariable__TieneIDsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6592:1: ( ( ruleVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6593:1: ( ruleVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6593:1: ( ruleVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6594:1: ruleVariable
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsVariableParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_3_113399);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getDeclaracionVariableAccess().getTieneIDsVariableParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracionVariable__TieneIDsAssignment_3_1"


    // $ANTLR start "rule__LlamadaFuncion__NombreAssignment_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6603:1: rule__LlamadaFuncion__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__LlamadaFuncion__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6607:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6608:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6608:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6609:1: ruleEString
            {
             before(grammarAccess.getLlamadaFuncionAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__LlamadaFuncion__NombreAssignment_013430);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6618:1: rule__LlamadaFuncion__OperadorAssignment_2_0 : ( ruleOperador ) ;
    public final void rule__LlamadaFuncion__OperadorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6622:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6623:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6623:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6624:1: ruleOperador
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorOperadorParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_013461);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6633:1: rule__LlamadaFuncion__OperadorAssignment_2_1_1 : ( ruleOperador ) ;
    public final void rule__LlamadaFuncion__OperadorAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6637:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6638:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6638:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6639:1: ruleOperador
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorOperadorParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_1_113492);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6648:1: rule__Asignacion__LvalueAssignment_0 : ( ruleEString ) ;
    public final void rule__Asignacion__LvalueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6652:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6653:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6653:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6654:1: ruleEString
            {
             before(grammarAccess.getAsignacionAccess().getLvalueEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Asignacion__LvalueAssignment_013523);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6663:1: rule__Asignacion__MatAssignment_1 : ( RULE_MATRIZ ) ;
    public final void rule__Asignacion__MatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6667:1: ( ( RULE_MATRIZ ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6668:1: ( RULE_MATRIZ )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6668:1: ( RULE_MATRIZ )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6669:1: RULE_MATRIZ
            {
             before(grammarAccess.getAsignacionAccess().getMatMATRIZTerminalRuleCall_1_0()); 
            match(input,RULE_MATRIZ,FollowSets000.FOLLOW_RULE_MATRIZ_in_rule__Asignacion__MatAssignment_113554); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6678:1: rule__Asignacion__OperadorAssignment_3 : ( rulevalor ) ;
    public final void rule__Asignacion__OperadorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6682:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6683:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6683:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6684:1: rulevalor
            {
             before(grammarAccess.getAsignacionAccess().getOperadorValorParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Asignacion__OperadorAssignment_313585);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6693:1: rule__Escribir__OperadorAssignment_2 : ( ruleOperador ) ;
    public final void rule__Escribir__OperadorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6697:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6698:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6698:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6699:1: ruleOperador
            {
             before(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_213616);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6708:1: rule__Escribir__OperadorAssignment_3_1 : ( ruleOperador ) ;
    public final void rule__Escribir__OperadorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6712:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6713:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6713:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6714:1: ruleOperador
            {
             before(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_3_113647);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6723:1: rule__Leer__VariableAssignment_2 : ( ruleVariableID ) ;
    public final void rule__Leer__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6727:1: ( ( ruleVariableID ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6728:1: ( ruleVariableID )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6728:1: ( ruleVariableID )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6729:1: ruleVariableID
            {
             before(grammarAccess.getLeerAccess().getVariableVariableIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__Leer__VariableAssignment_213678);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6738:1: rule__Si__ValorAssignment_1 : ( rulevalor ) ;
    public final void rule__Si__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6742:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6743:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6743:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6744:1: rulevalor
            {
             before(grammarAccess.getSiAccess().getValorValorParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Si__ValorAssignment_113709);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6753:1: rule__Si__SentenciasAssignment_3_0 : ( ruleSentencias ) ;
    public final void rule__Si__SentenciasAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6757:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6758:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6758:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6759:1: ruleSentencias
            {
             before(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_013740);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6768:1: rule__Si__SentenciasAssignment_3_1 : ( ruleSentencias ) ;
    public final void rule__Si__SentenciasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6772:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6773:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6773:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6774:1: ruleSentencias
            {
             before(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_113771);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6783:1: rule__Si__SinoAssignment_4 : ( ruleSino ) ;
    public final void rule__Si__SinoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6787:1: ( ( ruleSino ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6788:1: ( ruleSino )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6788:1: ( ruleSino )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6789:1: ruleSino
            {
             before(grammarAccess.getSiAccess().getSinoSinoParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSino_in_rule__Si__SinoAssignment_413802);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6798:1: rule__Mientras__ValorAssignment_1 : ( rulevalor ) ;
    public final void rule__Mientras__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6802:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6803:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6803:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6804:1: rulevalor
            {
             before(grammarAccess.getMientrasAccess().getValorValorParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Mientras__ValorAssignment_113833);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6813:1: rule__Mientras__SentenciasAssignment_3_0 : ( ruleSentencias ) ;
    public final void rule__Mientras__SentenciasAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6817:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6818:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6818:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6819:1: ruleSentencias
            {
             before(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_013864);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6828:1: rule__Mientras__SentenciasAssignment_3_1 : ( ruleSentencias ) ;
    public final void rule__Mientras__SentenciasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6832:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6833:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6833:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6834:1: ruleSentencias
            {
             before(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_113895);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6843:1: rule__Repetir__SentenciasAssignment_1_0 : ( ruleSentencias ) ;
    public final void rule__Repetir__SentenciasAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6847:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6848:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6848:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6849:1: ruleSentencias
            {
             before(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_013926);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6858:1: rule__Repetir__SentenciasAssignment_1_1 : ( ruleSentencias ) ;
    public final void rule__Repetir__SentenciasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6862:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6863:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6863:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6864:1: ruleSentencias
            {
             before(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_113957);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6873:1: rule__Repetir__ValorAssignment_3 : ( rulevalor ) ;
    public final void rule__Repetir__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6877:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6878:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6878:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6879:1: rulevalor
            {
             before(grammarAccess.getRepetirAccess().getValorValorParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Repetir__ValorAssignment_313988);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6888:1: rule__Desde__AsignacionAssignment_1 : ( ruleAsignacion ) ;
    public final void rule__Desde__AsignacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6892:1: ( ( ruleAsignacion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6893:1: ( ruleAsignacion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6893:1: ( ruleAsignacion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6894:1: ruleAsignacion
            {
             before(grammarAccess.getDesdeAccess().getAsignacionAsignacionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_rule__Desde__AsignacionAssignment_114019);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6903:1: rule__Desde__ValorAssignment_3 : ( rulevalor ) ;
    public final void rule__Desde__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6907:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6908:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6908:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6909:1: rulevalor
            {
             before(grammarAccess.getDesdeAccess().getValorValorParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Desde__ValorAssignment_314050);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6918:1: rule__Desde__SentenciasAssignment_5_0 : ( ruleSentencias ) ;
    public final void rule__Desde__SentenciasAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6922:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6923:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6923:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6924:1: ruleSentencias
            {
             before(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_014081);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6933:1: rule__Desde__SentenciasAssignment_5_1 : ( ruleSentencias ) ;
    public final void rule__Desde__SentenciasAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6937:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6938:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6938:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6939:1: ruleSentencias
            {
             before(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_114112);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6948:1: rule__Incremento__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__Incremento__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6952:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6953:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6953:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6954:1: ruleEString
            {
             before(grammarAccess.getIncrementoAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Incremento__NombreAssignment_014143);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6963:1: rule__Incremento__SsignoAssignment_1 : ( ruleinc ) ;
    public final void rule__Incremento__SsignoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6967:1: ( ( ruleinc ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6968:1: ( ruleinc )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6968:1: ( ruleinc )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6969:1: ruleinc
            {
             before(grammarAccess.getIncrementoAccess().getSsignoIncParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_rule__Incremento__SsignoAssignment_114174);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6978:1: rule__Variable__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__Variable__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6982:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6983:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6983:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6984:1: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Variable__NombreAssignment_014205);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6993:1: rule__Variable__MatAssignment_1 : ( RULE_MATRIZ ) ;
    public final void rule__Variable__MatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6997:1: ( ( RULE_MATRIZ ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6998:1: ( RULE_MATRIZ )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6998:1: ( RULE_MATRIZ )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6999:1: RULE_MATRIZ
            {
             before(grammarAccess.getVariableAccess().getMatMATRIZTerminalRuleCall_1_0()); 
            match(input,RULE_MATRIZ,FollowSets000.FOLLOW_RULE_MATRIZ_in_rule__Variable__MatAssignment_114236); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7008:1: rule__VariableID__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__VariableID__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7012:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7013:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7013:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7014:1: ruleEString
            {
             before(grammarAccess.getVariableIDAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VariableID__NombreAssignment_014267);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7023:1: rule__VariableID__MatAssignment_1 : ( RULE_MATRIZ ) ;
    public final void rule__VariableID__MatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7027:1: ( ( RULE_MATRIZ ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7028:1: ( RULE_MATRIZ )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7028:1: ( RULE_MATRIZ )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7029:1: RULE_MATRIZ
            {
             before(grammarAccess.getVariableIDAccess().getMatMATRIZTerminalRuleCall_1_0()); 
            match(input,RULE_MATRIZ,FollowSets000.FOLLOW_RULE_MATRIZ_in_rule__VariableID__MatAssignment_114298); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7038:1: rule__ConstCadena__ContenidoAssignment : ( RULE_CAD ) ;
    public final void rule__ConstCadena__ContenidoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7042:1: ( ( RULE_CAD ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7043:1: ( RULE_CAD )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7043:1: ( RULE_CAD )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7044:1: RULE_CAD
            {
             before(grammarAccess.getConstCadenaAccess().getContenidoCADTerminalRuleCall_0()); 
            match(input,RULE_CAD,FollowSets000.FOLLOW_RULE_CAD_in_rule__ConstCadena__ContenidoAssignment14329); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7053:1: rule__NumeroEntero__ValorAssignment : ( ruleEInt ) ;
    public final void rule__NumeroEntero__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7057:1: ( ( ruleEInt ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7058:1: ( ruleEInt )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7058:1: ( ruleEInt )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7059:1: ruleEInt
            {
             before(grammarAccess.getNumeroEnteroAccess().getValorEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__NumeroEntero__ValorAssignment14360);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7068:1: rule__NumeroDecimal__ValorAssignment : ( ruleEFloat ) ;
    public final void rule__NumeroDecimal__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7072:1: ( ( ruleEFloat ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7073:1: ( ruleEFloat )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7073:1: ( ruleEFloat )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7074:1: ruleEFloat
            {
             before(grammarAccess.getNumeroDecimalAccess().getValorEFloatParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rule__NumeroDecimal__ValorAssignment14391);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7083:1: rule__ValorBooleano__ValorAssignment : ( rulebooleano ) ;
    public final void rule__ValorBooleano__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7087:1: ( ( rulebooleano ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7088:1: ( rulebooleano )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7088:1: ( rulebooleano )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7089:1: rulebooleano
            {
             before(grammarAccess.getValorBooleanoAccess().getValorBooleanoParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleano_in_rule__ValorBooleano__ValorAssignment14422);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7098:1: rule__Operacion__Op_izqAssignment_1 : ( ruleoperando_izq ) ;
    public final void rule__Operacion__Op_izqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7102:1: ( ( ruleoperando_izq ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7103:1: ( ruleoperando_izq )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7103:1: ( ruleoperando_izq )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7104:1: ruleoperando_izq
            {
             before(grammarAccess.getOperacionAccess().getOp_izqOperando_izqParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_izq_in_rule__Operacion__Op_izqAssignment_114453);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7113:1: rule__Operacion__Signo_opAssignment_2 : ( rulesigno ) ;
    public final void rule__Operacion__Signo_opAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7117:1: ( ( rulesigno ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7118:1: ( rulesigno )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7118:1: ( rulesigno )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7119:1: rulesigno
            {
             before(grammarAccess.getOperacionAccess().getSigno_opSignoParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulesigno_in_rule__Operacion__Signo_opAssignment_214484);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7128:1: rule__Operacion__Op_derAssignment_3 : ( ruleoperando_der ) ;
    public final void rule__Operacion__Op_derAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7132:1: ( ( ruleoperando_der ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7133:1: ( ruleoperando_der )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7133:1: ( ruleoperando_der )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7134:1: ruleoperando_der
            {
             before(grammarAccess.getOperacionAccess().getOp_derOperando_derParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_der_in_rule__Operacion__Op_derAssignment_314515);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7143:1: rule__Operando_izq__Oper_izqAssignment : ( rulevalor ) ;
    public final void rule__Operando_izq__Oper_izqAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7147:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7148:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7148:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7149:1: rulevalor
            {
             before(grammarAccess.getOperando_izqAccess().getOper_izqValorParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Operando_izq__Oper_izqAssignment14546);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7158:1: rule__Operando_der__Oper_derAssignment : ( rulevalor ) ;
    public final void rule__Operando_der__Oper_derAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7162:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7163:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7163:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7164:1: rulevalor
            {
             before(grammarAccess.getOperando_derAccess().getOper_derValorParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Operando_der__Oper_derAssignment14577);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7173:1: rule__Sino__SentenciasAssignment_2_0 : ( ruleSentencias ) ;
    public final void rule__Sino__SentenciasAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7177:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7178:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7178:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7179:1: ruleSentencias
            {
             before(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_014608);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7188:1: rule__Sino__SentenciasAssignment_2_1 : ( ruleSentencias ) ;
    public final void rule__Sino__SentenciasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7192:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7193:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7193:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7194:1: ruleSentencias
            {
             before(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_114639);
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


    // $ANTLR start "rule__ParametroFuncion__PasoAssignment_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7203:1: rule__ParametroFuncion__PasoAssignment_0 : ( ruleTipoPaso ) ;
    public final void rule__ParametroFuncion__PasoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7207:1: ( ( ruleTipoPaso ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7208:1: ( ruleTipoPaso )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7208:1: ( ruleTipoPaso )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7209:1: ruleTipoPaso
            {
             before(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_rule__ParametroFuncion__PasoAssignment_014670);
            ruleTipoPaso();

            state._fsp--;

             after(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametroFuncion__PasoAssignment_0"


    // $ANTLR start "rule__ParametroFuncion__TipoAssignment_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7218:1: rule__ParametroFuncion__TipoAssignment_1 : ( ruleTipoVariable ) ;
    public final void rule__ParametroFuncion__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7222:1: ( ( ruleTipoVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7223:1: ( ruleTipoVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7223:1: ( ruleTipoVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7224:1: ruleTipoVariable
            {
             before(grammarAccess.getParametroFuncionAccess().getTipoTipoVariableParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_rule__ParametroFuncion__TipoAssignment_114701);
            ruleTipoVariable();

            state._fsp--;

             after(grammarAccess.getParametroFuncionAccess().getTipoTipoVariableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametroFuncion__TipoAssignment_1"


    // $ANTLR start "rule__ParametroFuncion__VariableAssignment_3"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7233:1: rule__ParametroFuncion__VariableAssignment_3 : ( ruleVariable ) ;
    public final void rule__ParametroFuncion__VariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7237:1: ( ( ruleVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7238:1: ( ruleVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7238:1: ( ruleVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7239:1: ruleVariable
            {
             before(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__ParametroFuncion__VariableAssignment_314732);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametroFuncion__VariableAssignment_3"


    // $ANTLR start "rule__Funcion__TipoAssignment_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7248:1: rule__Funcion__TipoAssignment_0 : ( ruleTipoVariable ) ;
    public final void rule__Funcion__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7252:1: ( ( ruleTipoVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7253:1: ( ruleTipoVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7253:1: ( ruleTipoVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7254:1: ruleTipoVariable
            {
             before(grammarAccess.getFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_rule__Funcion__TipoAssignment_014763);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7263:1: rule__Funcion__NombreAssignment_2 : ( ruleEString ) ;
    public final void rule__Funcion__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7267:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7268:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7268:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7269:1: ruleEString
            {
             before(grammarAccess.getFuncionAccess().getNombreEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Funcion__NombreAssignment_214794);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7278:1: rule__Funcion__ParametrofuncionAssignment_4_0 : ( ruleParametroFuncion ) ;
    public final void rule__Funcion__ParametrofuncionAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7282:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7283:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7283:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7284:1: ruleParametroFuncion
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_014825);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7293:1: rule__Funcion__ParametrofuncionAssignment_4_1_1 : ( ruleParametroFuncion ) ;
    public final void rule__Funcion__ParametrofuncionAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7297:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7298:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7298:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7299:1: ruleParametroFuncion
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_1_114856);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7308:1: rule__Funcion__DeclaracionvariableAssignment_7_0 : ( ruleDeclaracionVariable ) ;
    public final void rule__Funcion__DeclaracionvariableAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7312:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7313:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7313:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7314:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getFuncionAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_7_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Funcion__DeclaracionvariableAssignment_7_014887);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7323:1: rule__Funcion__DeclaracionvariableAssignment_7_1 : ( ruleDeclaracionVariable ) ;
    public final void rule__Funcion__DeclaracionvariableAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7327:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7328:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7328:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7329:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getFuncionAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Funcion__DeclaracionvariableAssignment_7_114918);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7338:1: rule__Funcion__SentenciasAssignment_9_0 : ( ruleSentencias ) ;
    public final void rule__Funcion__SentenciasAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7342:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7343:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7343:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7344:1: ruleSentencias
            {
             before(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_9_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_9_014949);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7353:1: rule__Funcion__SentenciasAssignment_9_1 : ( ruleSentencias ) ;
    public final void rule__Funcion__SentenciasAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7357:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7358:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7358:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7359:1: ruleSentencias
            {
             before(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_9_114980);
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


    // $ANTLR start "rule__Funcion__DevuelveAssignment_12"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7368:1: rule__Funcion__DevuelveAssignment_12 : ( rulevalor ) ;
    public final void rule__Funcion__DevuelveAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7372:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7373:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7373:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7374:1: rulevalor
            {
             before(grammarAccess.getFuncionAccess().getDevuelveValorParserRuleCall_12_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Funcion__DevuelveAssignment_1215011);
            rulevalor();

            state._fsp--;

             after(grammarAccess.getFuncionAccess().getDevuelveValorParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__DevuelveAssignment_12"


    // $ANTLR start "rule__Procedimiento__NombreAssignment_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7383:1: rule__Procedimiento__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__Procedimiento__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7387:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7388:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7388:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7389:1: ruleEString
            {
             before(grammarAccess.getProcedimientoAccess().getNombreEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Procedimiento__NombreAssignment_115042);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7398:1: rule__Procedimiento__ParametrofuncionAssignment_3_0 : ( ruleParametroFuncion ) ;
    public final void rule__Procedimiento__ParametrofuncionAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7402:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7403:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7403:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7404:1: ruleParametroFuncion
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_015073);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7413:1: rule__Procedimiento__ParametrofuncionAssignment_3_1_1 : ( ruleParametroFuncion ) ;
    public final void rule__Procedimiento__ParametrofuncionAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7417:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7418:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7418:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7419:1: ruleParametroFuncion
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_1_115104);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7428:1: rule__Procedimiento__DeclaracionvariableAssignment_6_0 : ( ruleDeclaracionVariable ) ;
    public final void rule__Procedimiento__DeclaracionvariableAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7432:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7433:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7433:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7434:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getProcedimientoAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_6_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Procedimiento__DeclaracionvariableAssignment_6_015135);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7443:1: rule__Procedimiento__DeclaracionvariableAssignment_6_1 : ( ruleDeclaracionVariable ) ;
    public final void rule__Procedimiento__DeclaracionvariableAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7447:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7448:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7448:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7449:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getProcedimientoAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Procedimiento__DeclaracionvariableAssignment_6_115166);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7458:1: rule__Procedimiento__SentenciasAssignment_8_0 : ( ruleSentencias ) ;
    public final void rule__Procedimiento__SentenciasAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7462:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7463:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7463:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7464:1: ruleSentencias
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_8_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_8_015197);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7473:1: rule__Procedimiento__SentenciasAssignment_8_1 : ( ruleSentencias ) ;
    public final void rule__Procedimiento__SentenciasAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7477:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7478:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7478:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7479:1: ruleSentencias
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_8_115228);
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
    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA2_eotS =
        "\14\uffff";
    static final String DFA2_eofS =
        "\14\uffff";
    static final String DFA2_minS =
        "\1\4\2\10\11\uffff";
    static final String DFA2_maxS =
        "\1\100\2\65\11\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\1\1\11\1\2";
    static final String DFA2_specialS =
        "\14\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\2\60\uffff\1\3\1\4\1\5\2\uffff\1\6\2\uffff\1\7\1\uffff"+
            "\1\10",
            "\1\13\41\uffff\2\12\2\uffff\1\11\6\uffff\1\13",
            "\1\13\41\uffff\2\12\2\uffff\1\11\6\uffff\1\13",
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
            return "1202:1: rule__Sentencias__Alternatives : ( ( ruleLlamadaFuncion ) | ( ruleAsignacion ) | ( ruleEscribir ) | ( ruleLeer ) | ( ruleSi ) | ( rulemientras ) | ( rulerepetir ) | ( ruledesde ) | ( ruleincremento ) );";
        }
    }
    static final String DFA5_eotS =
        "\16\uffff";
    static final String DFA5_eofS =
        "\1\uffff\2\13\2\uffff\1\15\10\uffff";
    static final String DFA5_minS =
        "\3\4\1\uffff\1\6\1\4\10\uffff";
    static final String DFA5_maxS =
        "\1\103\2\111\1\uffff\1\103\1\111\10\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\3\2\uffff\1\5\1\6\1\7\1\10\1\11\1\2\1\1\1\4";
    static final String DFA5_specialS =
        "\16\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\1\5\1\11\1\uffff\1\3\4\uffff\7\12\7\uffff\2\10\1\uffff"+
            "\1\4\16\uffff\1\7\24\uffff\1\6",
            "\2\13\2\uffff\1\13\25\uffff\14\13\4\uffff\1\14\1\13\2\uffff"+
            "\1\13\3\uffff\15\13\1\uffff\1\13\1\uffff\1\13\2\uffff\1\13",
            "\2\13\2\uffff\1\13\25\uffff\14\13\4\uffff\1\14\1\13\2\uffff"+
            "\1\13\3\uffff\15\13\1\uffff\1\13\1\uffff\1\13\2\uffff\1\13",
            "",
            "\1\5\74\uffff\1\6",
            "\2\15\30\uffff\14\15\5\uffff\1\15\2\uffff\1\15\3\uffff\15"+
            "\15\1\6\1\15\1\uffff\1\15\2\uffff\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1378:1: rule__Valor__Alternatives : ( ( ruleLlamadaFuncion ) | ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleoperacion ) | ( ruleValorBooleano ) | ( ruleCaracter ) | ( ruleInternas ) );";
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
        public static final BitSet FOLLOW_ruleInternas_in_entryRuleInternas241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInternas248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Internas__Group__0_in_ruleInternas274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNombreInterna308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NombreInterna__Alternatives_in_ruleNombreInterna334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_entryRuleOperador361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperador368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operador__Alternatives_in_ruleOperador394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_entryRuleCaracter421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCaracter428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Caracter__ContenidoAssignment_in_ruleCaracter454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_entryRulevalor481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulevalor488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Valor__Alternatives_in_rulevalor514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInicio_in_entryRuleInicio541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInicio548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__0_in_ruleInicio574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionVariable668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__0_in_ruleDeclaracionVariable694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_entryRuleLlamadaFuncion721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLlamadaFuncion728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__0_in_ruleLlamadaFuncion754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_entryRuleAsignacion781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacion788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__0_in_ruleAsignacion814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_entryRuleEscribir841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEscribir848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__0_in_ruleEscribir874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_entryRuleLeer901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeer908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__0_in_ruleLeer934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_entryRuleSi961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSi968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__0_in_ruleSi994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_entryRulemientras1021 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemientras1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__0_in_rulemientras1054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_entryRulerepetir1081 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulerepetir1088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group__0_in_rulerepetir1114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_entryRuledesde1141 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuledesde1148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__0_in_ruledesde1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleincremento_in_entryRuleincremento1201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleincremento1208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Incremento__Group__0_in_ruleincremento1234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable1261 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoVariable1268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TipoVariable__Alternatives_in_ruleTipoVariable1294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable1328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable1354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_entryRuleVariableID1381 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableID1388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group__0_in_ruleVariableID1414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstCadena_in_entryRuleConstCadena1441 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstCadena1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstCadena__ContenidoAssignment_in_ruleConstCadena1474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_entryRuleNumeroEntero1501 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumeroEntero1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumeroEntero__ValorAssignment_in_ruleNumeroEntero1534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_entryRuleNumeroDecimal1561 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumeroDecimal1568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumeroDecimal__ValorAssignment_in_ruleNumeroDecimal1594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_entryRuleValorBooleano1621 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValorBooleano1628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValorBooleano__ValorAssignment_in_ruleValorBooleano1654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1681 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt1714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat1741 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat1748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0_in_ruleEFloat1774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_entryRulebooleano1801 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulebooleano1808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Booleano__Alternatives_in_rulebooleano1834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_entryRuleoperacion1861 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperacion1868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__0_in_ruleoperacion1894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesigno_in_entryRulesigno1921 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesigno1928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signo__Alternatives_in_rulesigno1954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_izq_in_entryRuleoperando_izq1981 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperando_izq1988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operando_izq__Oper_izqAssignment_in_ruleoperando_izq2014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_der_in_entryRuleoperando_der2041 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperando_der2048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operando_der__Oper_derAssignment_in_ruleoperando_der2074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSino_in_entryRuleSino2101 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSino2108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group__0_in_ruleSino2134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinc_in_entryRuleinc2161 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleinc2168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inc__Alternatives_in_ruleinc2194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion2221 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametroFuncion2228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__0_in_ruleParametroFuncion2254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_entryRuleFuncion2281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncion2288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__0_in_ruleFuncion2314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento2341 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcedimiento2348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__0_in_ruleProcedimiento2374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso2401 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoPaso2408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TipoPaso__Alternatives_in_ruleTipoPaso2434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_rule__Subproceso__Alternatives2470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_rule__Subproceso__Alternatives2487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_rule__Sentencias__Alternatives2519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_rule__Sentencias__Alternatives2536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_rule__Sentencias__Alternatives2553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_rule__Sentencias__Alternatives2570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_rule__Sentencias__Alternatives2587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_rule__Sentencias__Alternatives2604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_rule__Sentencias__Alternatives2621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_rule__Sentencias__Alternatives2638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleincremento_in_rule__Sentencias__Alternatives2655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__NombreInterna__Alternatives2688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__NombreInterna__Alternatives2708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__NombreInterna__Alternatives2728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__NombreInterna__Alternatives2748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__NombreInterna__Alternatives2768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__NombreInterna__Alternatives2788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__NombreInterna__Alternatives2808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__Operador__Alternatives2842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstCadena_in_rule__Operador__Alternatives2859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_rule__Operador__Alternatives2876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_rule__Operador__Alternatives2893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_rule__Operador__Alternatives2910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_rule__Operador__Alternatives2927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_rule__Valor__Alternatives2959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__Valor__Alternatives2976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstCadena_in_rule__Valor__Alternatives2993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_rule__Valor__Alternatives3010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_rule__Valor__Alternatives3027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_rule__Valor__Alternatives3044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_rule__Valor__Alternatives3061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_rule__Valor__Alternatives3078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInternas_in_rule__Valor__Alternatives3095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives3127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives3144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TipoVariable__Alternatives3177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TipoVariable__Alternatives3197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__TipoVariable__Alternatives3217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TipoVariable__Alternatives3237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__TipoVariable__Alternatives3257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__EFloat__Alternatives_4_03292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__EFloat__Alternatives_4_03312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Booleano__Alternatives3347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Booleano__Alternatives3367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Signo__Alternatives3402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Signo__Alternatives3422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Signo__Alternatives3442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Signo__Alternatives3462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Signo__Alternatives3482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Signo__Alternatives3502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Signo__Alternatives3522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Signo__Alternatives3542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Signo__Alternatives3562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Signo__Alternatives3582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Signo__Alternatives3602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Signo__Alternatives3622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Inc__Alternatives3657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Inc__Alternatives3677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__TipoPaso__Alternatives3712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__TipoPaso__Alternatives3732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__TipoPaso__Alternatives3752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group__0__Impl_in_rule__Codigo__Group__03784 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Codigo__Group__1_in_rule__Codigo__Group__03787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group_0__0_in_rule__Codigo__Group__0__Impl3814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group__1__Impl_in_rule__Codigo__Group__13845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__TieneAssignment_1_in_rule__Codigo__Group__1__Impl3872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group_0__0__Impl_in_rule__Codigo__Group_0__03906 = new BitSet(new long[]{0x0000000003E00000L,0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Codigo__Group_0__1_in_rule__Codigo__Group_0__03909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__FuncionAssignment_0_0_in_rule__Codigo__Group_0__0__Impl3936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__Group_0__1__Impl_in_rule__Codigo__Group_0__13966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Codigo__FuncionAssignment_0_1_in_rule__Codigo__Group_0__1__Impl3993 = new BitSet(new long[]{0x0000000003E00002L,0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Internas__Group__0__Impl_in_rule__Internas__Group__04028 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Internas__Group__1_in_rule__Internas__Group__04031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Internas__NombreAssignment_0_in_rule__Internas__Group__0__Impl4058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Internas__Group__1__Impl_in_rule__Internas__Group__14088 = new BitSet(new long[]{0x00000000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Internas__Group__2_in_rule__Internas__Group__14091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Internas__Group__1__Impl4119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Internas__Group__2__Impl_in_rule__Internas__Group__24150 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__Internas__Group__3_in_rule__Internas__Group__24153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Internas__OperadorAssignment_2_in_rule__Internas__Group__2__Impl4180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Internas__Group__3__Impl_in_rule__Internas__Group__34210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Internas__Group__3__Impl4238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__0__Impl_in_rule__Inicio__Group__04277 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Inicio__Group__1_in_rule__Inicio__Group__04280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__1__Impl_in_rule__Inicio__Group__14338 = new BitSet(new long[]{0x0002000003E00000L});
        public static final BitSet FOLLOW_rule__Inicio__Group__2_in_rule__Inicio__Group__14341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Inicio__Group__1__Impl4369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__2__Impl_in_rule__Inicio__Group__24400 = new BitSet(new long[]{0x0002000003E00000L});
        public static final BitSet FOLLOW_rule__Inicio__Group__3_in_rule__Inicio__Group__24403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__0_in_rule__Inicio__Group__2__Impl4430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__3__Impl_in_rule__Inicio__Group__34461 = new BitSet(new long[]{0x49C4000000000030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Inicio__Group__4_in_rule__Inicio__Group__34464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Inicio__Group__3__Impl4492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__4__Impl_in_rule__Inicio__Group__44523 = new BitSet(new long[]{0x49C4000000000030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Inicio__Group__5_in_rule__Inicio__Group__44526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_4__0_in_rule__Inicio__Group__4__Impl4553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__5__Impl_in_rule__Inicio__Group__54584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Inicio__Group__5__Impl4612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__0__Impl_in_rule__Inicio__Group_2__04655 = new BitSet(new long[]{0x0000000003E00000L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__1_in_rule__Inicio__Group_2__04658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__DeclaracionvariableAssignment_2_0_in_rule__Inicio__Group_2__0__Impl4685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__1__Impl_in_rule__Inicio__Group_2__14715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__DeclaracionvariableAssignment_2_1_in_rule__Inicio__Group_2__1__Impl4742 = new BitSet(new long[]{0x0000000003E00002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_4__0__Impl_in_rule__Inicio__Group_4__04777 = new BitSet(new long[]{0x49C0000000000030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Inicio__Group_4__1_in_rule__Inicio__Group_4__04780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__TieneAssignment_4_0_in_rule__Inicio__Group_4__0__Impl4807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_4__1__Impl_in_rule__Inicio__Group_4__14837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__TieneAssignment_4_1_in_rule__Inicio__Group_4__1__Impl4864 = new BitSet(new long[]{0x49C0000000000032L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__0__Impl_in_rule__DeclaracionVariable__Group__04899 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__1_in_rule__DeclaracionVariable__Group__04902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__TipoAssignment_0_in_rule__DeclaracionVariable__Group__0__Impl4931 = new BitSet(new long[]{0x0000000003E00002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__TipoAssignment_0_in_rule__DeclaracionVariable__Group__0__Impl4943 = new BitSet(new long[]{0x0000000003E00002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__1__Impl_in_rule__DeclaracionVariable__Group__14976 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__2_in_rule__DeclaracionVariable__Group__14979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__DeclaracionVariable__Group__1__Impl5007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__2__Impl_in_rule__DeclaracionVariable__Group__25038 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__3_in_rule__DeclaracionVariable__Group__25041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_2_in_rule__DeclaracionVariable__Group__2__Impl5068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__3__Impl_in_rule__DeclaracionVariable__Group__35098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_3__0_in_rule__DeclaracionVariable__Group__3__Impl5125 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_3__0__Impl_in_rule__DeclaracionVariable__Group_3__05164 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_3__1_in_rule__DeclaracionVariable__Group_3__05167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__DeclaracionVariable__Group_3__0__Impl5195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_3__1__Impl_in_rule__DeclaracionVariable__Group_3__15226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_3_1_in_rule__DeclaracionVariable__Group_3__1__Impl5253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__0__Impl_in_rule__LlamadaFuncion__Group__05287 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__1_in_rule__LlamadaFuncion__Group__05290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__NombreAssignment_0_in_rule__LlamadaFuncion__Group__0__Impl5317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__1__Impl_in_rule__LlamadaFuncion__Group__15347 = new BitSet(new long[]{0x00008000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__2_in_rule__LlamadaFuncion__Group__15350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__LlamadaFuncion__Group__1__Impl5378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__2__Impl_in_rule__LlamadaFuncion__Group__25409 = new BitSet(new long[]{0x00008000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__3_in_rule__LlamadaFuncion__Group__25412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__0_in_rule__LlamadaFuncion__Group__2__Impl5439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__3__Impl_in_rule__LlamadaFuncion__Group__35470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__LlamadaFuncion__Group__3__Impl5498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__0__Impl_in_rule__LlamadaFuncion__Group_2__05537 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__1_in_rule__LlamadaFuncion__Group_2__05540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_0_in_rule__LlamadaFuncion__Group_2__0__Impl5567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__1__Impl_in_rule__LlamadaFuncion__Group_2__15597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__0_in_rule__LlamadaFuncion__Group_2__1__Impl5624 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__0__Impl_in_rule__LlamadaFuncion__Group_2_1__05659 = new BitSet(new long[]{0x00000000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__1_in_rule__LlamadaFuncion__Group_2_1__05662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__LlamadaFuncion__Group_2_1__0__Impl5690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__1__Impl_in_rule__LlamadaFuncion__Group_2_1__15721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_1_1_in_rule__LlamadaFuncion__Group_2_1__1__Impl5748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__0__Impl_in_rule__Asignacion__Group__05782 = new BitSet(new long[]{0x0020000000000100L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__1_in_rule__Asignacion__Group__05785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__LvalueAssignment_0_in_rule__Asignacion__Group__0__Impl5812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__1__Impl_in_rule__Asignacion__Group__15842 = new BitSet(new long[]{0x0020000000000100L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__2_in_rule__Asignacion__Group__15845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__MatAssignment_1_in_rule__Asignacion__Group__1__Impl5872 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__2__Impl_in_rule__Asignacion__Group__25903 = new BitSet(new long[]{0x00004000B01FC2F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__3_in_rule__Asignacion__Group__25906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__Asignacion__Group__2__Impl5934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__3__Impl_in_rule__Asignacion__Group__35965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__OperadorAssignment_3_in_rule__Asignacion__Group__3__Impl5992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__0__Impl_in_rule__Escribir__Group__06030 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Escribir__Group__1_in_rule__Escribir__Group__06033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__Escribir__Group__0__Impl6061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__1__Impl_in_rule__Escribir__Group__16092 = new BitSet(new long[]{0x00000000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Escribir__Group__2_in_rule__Escribir__Group__16095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Escribir__Group__1__Impl6123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__2__Impl_in_rule__Escribir__Group__26154 = new BitSet(new long[]{0x0010800000000000L});
        public static final BitSet FOLLOW_rule__Escribir__Group__3_in_rule__Escribir__Group__26157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__OperadorAssignment_2_in_rule__Escribir__Group__2__Impl6184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__3__Impl_in_rule__Escribir__Group__36214 = new BitSet(new long[]{0x0010800000000000L});
        public static final BitSet FOLLOW_rule__Escribir__Group__4_in_rule__Escribir__Group__36217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__0_in_rule__Escribir__Group__3__Impl6244 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__4__Impl_in_rule__Escribir__Group__46275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Escribir__Group__4__Impl6303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__0__Impl_in_rule__Escribir__Group_3__06344 = new BitSet(new long[]{0x00000000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__1_in_rule__Escribir__Group_3__06347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Escribir__Group_3__0__Impl6375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__1__Impl_in_rule__Escribir__Group_3__16406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__OperadorAssignment_3_1_in_rule__Escribir__Group_3__1__Impl6433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__0__Impl_in_rule__Leer__Group__06467 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Leer__Group__1_in_rule__Leer__Group__06470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__Leer__Group__0__Impl6498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__1__Impl_in_rule__Leer__Group__16529 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Leer__Group__2_in_rule__Leer__Group__16532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Leer__Group__1__Impl6560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__2__Impl_in_rule__Leer__Group__26591 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__Leer__Group__3_in_rule__Leer__Group__26594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__VariableAssignment_2_in_rule__Leer__Group__2__Impl6621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__3__Impl_in_rule__Leer__Group__36651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Leer__Group__3__Impl6679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__0__Impl_in_rule__Si__Group__06718 = new BitSet(new long[]{0x00004000B01FC2F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Si__Group__1_in_rule__Si__Group__06721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Si__Group__0__Impl6749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__1__Impl_in_rule__Si__Group__16780 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_rule__Si__Group__2_in_rule__Si__Group__16783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__ValorAssignment_1_in_rule__Si__Group__1__Impl6810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__2__Impl_in_rule__Si__Group__26840 = new BitSet(new long[]{0x4DC0000000000030L,0x0000000000000011L});
        public static final BitSet FOLLOW_rule__Si__Group__3_in_rule__Si__Group__26843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__Si__Group__2__Impl6871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__3__Impl_in_rule__Si__Group__36902 = new BitSet(new long[]{0x4DC0000000000030L,0x0000000000000011L});
        public static final BitSet FOLLOW_rule__Si__Group__4_in_rule__Si__Group__36905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group_3__0_in_rule__Si__Group__3__Impl6932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__4__Impl_in_rule__Si__Group__46963 = new BitSet(new long[]{0x4DC0000000000030L,0x0000000000000011L});
        public static final BitSet FOLLOW_rule__Si__Group__5_in_rule__Si__Group__46966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__SinoAssignment_4_in_rule__Si__Group__4__Impl6993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__5__Impl_in_rule__Si__Group__57024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__Si__Group__5__Impl7052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group_3__0__Impl_in_rule__Si__Group_3__07095 = new BitSet(new long[]{0x49C0000000000030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Si__Group_3__1_in_rule__Si__Group_3__07098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__SentenciasAssignment_3_0_in_rule__Si__Group_3__0__Impl7125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group_3__1__Impl_in_rule__Si__Group_3__17155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__SentenciasAssignment_3_1_in_rule__Si__Group_3__1__Impl7182 = new BitSet(new long[]{0x49C0000000000032L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Mientras__Group__0__Impl_in_rule__Mientras__Group__07217 = new BitSet(new long[]{0x00004000B01FC2F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Mientras__Group__1_in_rule__Mientras__Group__07220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__Mientras__Group__0__Impl7248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__1__Impl_in_rule__Mientras__Group__17279 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_rule__Mientras__Group__2_in_rule__Mientras__Group__17282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__ValorAssignment_1_in_rule__Mientras__Group__1__Impl7309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__2__Impl_in_rule__Mientras__Group__27339 = new BitSet(new long[]{0x69C0000000000030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Mientras__Group__3_in_rule__Mientras__Group__27342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__Mientras__Group__2__Impl7370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__3__Impl_in_rule__Mientras__Group__37401 = new BitSet(new long[]{0x69C0000000000030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Mientras__Group__4_in_rule__Mientras__Group__37404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__0_in_rule__Mientras__Group__3__Impl7431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__4__Impl_in_rule__Mientras__Group__47462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__Mientras__Group__4__Impl7490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__0__Impl_in_rule__Mientras__Group_3__07531 = new BitSet(new long[]{0x49C0000000000030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__1_in_rule__Mientras__Group_3__07534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__SentenciasAssignment_3_0_in_rule__Mientras__Group_3__0__Impl7561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__1__Impl_in_rule__Mientras__Group_3__17591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__SentenciasAssignment_3_1_in_rule__Mientras__Group_3__1__Impl7618 = new BitSet(new long[]{0x49C0000000000032L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Repetir__Group__0__Impl_in_rule__Repetir__Group__07653 = new BitSet(new long[]{0xC9C0000000000030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Repetir__Group__1_in_rule__Repetir__Group__07656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__Repetir__Group__0__Impl7684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group__1__Impl_in_rule__Repetir__Group__17715 = new BitSet(new long[]{0xC9C0000000000030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Repetir__Group__2_in_rule__Repetir__Group__17718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__0_in_rule__Repetir__Group__1__Impl7745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group__2__Impl_in_rule__Repetir__Group__27776 = new BitSet(new long[]{0x00004000B01FC2F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Repetir__Group__3_in_rule__Repetir__Group__27779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rule__Repetir__Group__2__Impl7807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group__3__Impl_in_rule__Repetir__Group__37838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__ValorAssignment_3_in_rule__Repetir__Group__3__Impl7865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__0__Impl_in_rule__Repetir__Group_1__07903 = new BitSet(new long[]{0x49C0000000000030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__1_in_rule__Repetir__Group_1__07906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__SentenciasAssignment_1_0_in_rule__Repetir__Group_1__0__Impl7933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__1__Impl_in_rule__Repetir__Group_1__17963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__SentenciasAssignment_1_1_in_rule__Repetir__Group_1__1__Impl7990 = new BitSet(new long[]{0x49C0000000000032L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Desde__Group__0__Impl_in_rule__Desde__Group__08025 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Desde__Group__1_in_rule__Desde__Group__08028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__Desde__Group__0__Impl8056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__1__Impl_in_rule__Desde__Group__18087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__2_in_rule__Desde__Group__18090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__AsignacionAssignment_1_in_rule__Desde__Group__1__Impl8117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__2__Impl_in_rule__Desde__Group__28147 = new BitSet(new long[]{0x00004000B01FC2F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Desde__Group__3_in_rule__Desde__Group__28150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__Desde__Group__2__Impl8178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__3__Impl_in_rule__Desde__Group__38209 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_rule__Desde__Group__4_in_rule__Desde__Group__38212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__ValorAssignment_3_in_rule__Desde__Group__3__Impl8239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__4__Impl_in_rule__Desde__Group__48269 = new BitSet(new long[]{0x49C0000000000030L,0x0000000000000005L});
        public static final BitSet FOLLOW_rule__Desde__Group__5_in_rule__Desde__Group__48272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__Desde__Group__4__Impl8300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__5__Impl_in_rule__Desde__Group__58331 = new BitSet(new long[]{0x49C0000000000030L,0x0000000000000005L});
        public static final BitSet FOLLOW_rule__Desde__Group__6_in_rule__Desde__Group__58334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__0_in_rule__Desde__Group__5__Impl8361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__6__Impl_in_rule__Desde__Group__68392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_rule__Desde__Group__6__Impl8420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__0__Impl_in_rule__Desde__Group_5__08465 = new BitSet(new long[]{0x49C0000000000030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__1_in_rule__Desde__Group_5__08468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__SentenciasAssignment_5_0_in_rule__Desde__Group_5__0__Impl8495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__1__Impl_in_rule__Desde__Group_5__18525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__SentenciasAssignment_5_1_in_rule__Desde__Group_5__1__Impl8552 = new BitSet(new long[]{0x49C0000000000032L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Incremento__Group__0__Impl_in_rule__Incremento__Group__08587 = new BitSet(new long[]{0x00000C0000000000L});
        public static final BitSet FOLLOW_rule__Incremento__Group__1_in_rule__Incremento__Group__08590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Incremento__NombreAssignment_0_in_rule__Incremento__Group__0__Impl8617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Incremento__Group__1__Impl_in_rule__Incremento__Group__18647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Incremento__SsignoAssignment_1_in_rule__Incremento__Group__1__Impl8674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__08708 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__08711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__NombreAssignment_0_in_rule__Variable__Group__0__Impl8738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__18768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__MatAssignment_1_in_rule__Variable__Group__1__Impl8795 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__VariableID__Group__0__Impl_in_rule__VariableID__Group__08830 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__VariableID__Group__1_in_rule__VariableID__Group__08833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__NombreAssignment_0_in_rule__VariableID__Group__0__Impl8860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group__1__Impl_in_rule__VariableID__Group__18890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__MatAssignment_1_in_rule__VariableID__Group__1__Impl8917 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__08952 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__08955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__EInt__Group__0__Impl8984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__19017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl9044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__09077 = new BitSet(new long[]{0x0000000080000040L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__09080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__EFloat__Group__0__Impl9109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__19142 = new BitSet(new long[]{0x0000000080000040L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__19145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl9173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__29204 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__29207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_rule__EFloat__Group__2__Impl9235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__39266 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__39269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl9296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__49325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl9352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__09393 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__09396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl9423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__19453 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__19456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__EFloat__Group_4__1__Impl9485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__29518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl9545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__0__Impl_in_rule__Operacion__Group__09580 = new BitSet(new long[]{0x00004000B01FC2F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Operacion__Group__1_in_rule__Operacion__Group__09583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Operacion__Group__0__Impl9611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__1__Impl_in_rule__Operacion__Group__19642 = new BitSet(new long[]{0x000003FFC0000000L});
        public static final BitSet FOLLOW_rule__Operacion__Group__2_in_rule__Operacion__Group__19645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Op_izqAssignment_1_in_rule__Operacion__Group__1__Impl9672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__2__Impl_in_rule__Operacion__Group__29702 = new BitSet(new long[]{0x00004000B01FC2F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Operacion__Group__3_in_rule__Operacion__Group__29705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Signo_opAssignment_2_in_rule__Operacion__Group__2__Impl9732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__3__Impl_in_rule__Operacion__Group__39762 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__Operacion__Group__4_in_rule__Operacion__Group__39765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Op_derAssignment_3_in_rule__Operacion__Group__3__Impl9792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__4__Impl_in_rule__Operacion__Group__49822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Operacion__Group__4__Impl9850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group__0__Impl_in_rule__Sino__Group__09891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Sino__Group__1_in_rule__Sino__Group__09894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group__1__Impl_in_rule__Sino__Group__19952 = new BitSet(new long[]{0x49C0000000000030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Sino__Group__2_in_rule__Sino__Group__19955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_rule__Sino__Group__1__Impl9983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group__2__Impl_in_rule__Sino__Group__210014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__0_in_rule__Sino__Group__2__Impl10041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__0__Impl_in_rule__Sino__Group_2__010078 = new BitSet(new long[]{0x49C0000000000030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__1_in_rule__Sino__Group_2__010081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__SentenciasAssignment_2_0_in_rule__Sino__Group_2__0__Impl10108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__1__Impl_in_rule__Sino__Group_2__110138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__SentenciasAssignment_2_1_in_rule__Sino__Group_2__1__Impl10165 = new BitSet(new long[]{0x49C0000000000032L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__0__Impl_in_rule__ParametroFuncion__Group__010200 = new BitSet(new long[]{0x0000000003E00000L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__1_in_rule__ParametroFuncion__Group__010203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__PasoAssignment_0_in_rule__ParametroFuncion__Group__0__Impl10230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__1__Impl_in_rule__ParametroFuncion__Group__110260 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__2_in_rule__ParametroFuncion__Group__110263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__TipoAssignment_1_in_rule__ParametroFuncion__Group__1__Impl10292 = new BitSet(new long[]{0x0000000003E00002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__TipoAssignment_1_in_rule__ParametroFuncion__Group__1__Impl10304 = new BitSet(new long[]{0x0000000003E00002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__2__Impl_in_rule__ParametroFuncion__Group__210337 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__3_in_rule__ParametroFuncion__Group__210340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__ParametroFuncion__Group__2__Impl10368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__3__Impl_in_rule__ParametroFuncion__Group__310399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__VariableAssignment_3_in_rule__ParametroFuncion__Group__3__Impl10426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__0__Impl_in_rule__Funcion__Group__010464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Funcion__Group__1_in_rule__Funcion__Group__010467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__TipoAssignment_0_in_rule__Funcion__Group__0__Impl10494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__1__Impl_in_rule__Funcion__Group__110524 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Funcion__Group__2_in_rule__Funcion__Group__110527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__Funcion__Group__1__Impl10555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__2__Impl_in_rule__Funcion__Group__210586 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__3_in_rule__Funcion__Group__210589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__NombreAssignment_2_in_rule__Funcion__Group__2__Impl10616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__3__Impl_in_rule__Funcion__Group__310646 = new BitSet(new long[]{0x0000B00004000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__4_in_rule__Funcion__Group__310649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Funcion__Group__3__Impl10677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__4__Impl_in_rule__Funcion__Group__410708 = new BitSet(new long[]{0x0000B00004000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__5_in_rule__Funcion__Group__410711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__0_in_rule__Funcion__Group__4__Impl10738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__5__Impl_in_rule__Funcion__Group__510769 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__6_in_rule__Funcion__Group__510772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Funcion__Group__5__Impl10800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__6__Impl_in_rule__Funcion__Group__610831 = new BitSet(new long[]{0x0002000003E00000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__7_in_rule__Funcion__Group__610834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Funcion__Group__6__Impl10862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__7__Impl_in_rule__Funcion__Group__710893 = new BitSet(new long[]{0x0002000003E00000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__8_in_rule__Funcion__Group__710896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__0_in_rule__Funcion__Group__7__Impl10923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__8__Impl_in_rule__Funcion__Group__810954 = new BitSet(new long[]{0x49C0000000000030L,0x0000000000000041L});
        public static final BitSet FOLLOW_rule__Funcion__Group__9_in_rule__Funcion__Group__810957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Funcion__Group__8__Impl10985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__9__Impl_in_rule__Funcion__Group__911016 = new BitSet(new long[]{0x49C0000000000030L,0x0000000000000041L});
        public static final BitSet FOLLOW_rule__Funcion__Group__10_in_rule__Funcion__Group__911019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_9__0_in_rule__Funcion__Group__9__Impl11046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__10__Impl_in_rule__Funcion__Group__1011077 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__11_in_rule__Funcion__Group__1011080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_rule__Funcion__Group__10__Impl11108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__11__Impl_in_rule__Funcion__Group__1111139 = new BitSet(new long[]{0x00004000B01FC2F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Funcion__Group__12_in_rule__Funcion__Group__1111142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Funcion__Group__11__Impl11170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__12__Impl_in_rule__Funcion__Group__1211201 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__13_in_rule__Funcion__Group__1211204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__DevuelveAssignment_12_in_rule__Funcion__Group__12__Impl11231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__13__Impl_in_rule__Funcion__Group__1311261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_rule__Funcion__Group__14_in_rule__Funcion__Group__1311264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Funcion__Group__13__Impl11292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__14__Impl_in_rule__Funcion__Group__1411323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_rule__Funcion__Group__14__Impl11351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__0__Impl_in_rule__Funcion__Group_4__011412 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__1_in_rule__Funcion__Group_4__011415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_0_in_rule__Funcion__Group_4__0__Impl11442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__1__Impl_in_rule__Funcion__Group_4__111472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__0_in_rule__Funcion__Group_4__1__Impl11499 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__0__Impl_in_rule__Funcion__Group_4_1__011534 = new BitSet(new long[]{0x0000300004000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__1_in_rule__Funcion__Group_4_1__011537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Funcion__Group_4_1__0__Impl11565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__1__Impl_in_rule__Funcion__Group_4_1__111596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_1_1_in_rule__Funcion__Group_4_1__1__Impl11623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__0__Impl_in_rule__Funcion__Group_7__011657 = new BitSet(new long[]{0x0000000003E00000L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__1_in_rule__Funcion__Group_7__011660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__DeclaracionvariableAssignment_7_0_in_rule__Funcion__Group_7__0__Impl11687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__1__Impl_in_rule__Funcion__Group_7__111717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__DeclaracionvariableAssignment_7_1_in_rule__Funcion__Group_7__1__Impl11744 = new BitSet(new long[]{0x0000000003E00002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_9__0__Impl_in_rule__Funcion__Group_9__011779 = new BitSet(new long[]{0x49C0000000000030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Funcion__Group_9__1_in_rule__Funcion__Group_9__011782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__SentenciasAssignment_9_0_in_rule__Funcion__Group_9__0__Impl11809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_9__1__Impl_in_rule__Funcion__Group_9__111839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__SentenciasAssignment_9_1_in_rule__Funcion__Group_9__1__Impl11866 = new BitSet(new long[]{0x49C0000000000032L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__0__Impl_in_rule__Procedimiento__Group__011901 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__1_in_rule__Procedimiento__Group__011904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_rule__Procedimiento__Group__0__Impl11932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__1__Impl_in_rule__Procedimiento__Group__111963 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__2_in_rule__Procedimiento__Group__111966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__NombreAssignment_1_in_rule__Procedimiento__Group__1__Impl11993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__2__Impl_in_rule__Procedimiento__Group__212023 = new BitSet(new long[]{0x0000B00004000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__3_in_rule__Procedimiento__Group__212026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Procedimiento__Group__2__Impl12054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__3__Impl_in_rule__Procedimiento__Group__312085 = new BitSet(new long[]{0x0000B00004000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__4_in_rule__Procedimiento__Group__312088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__0_in_rule__Procedimiento__Group__3__Impl12115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__4__Impl_in_rule__Procedimiento__Group__412146 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__5_in_rule__Procedimiento__Group__412149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Procedimiento__Group__4__Impl12177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__5__Impl_in_rule__Procedimiento__Group__512208 = new BitSet(new long[]{0x0002000003E00000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__6_in_rule__Procedimiento__Group__512211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Procedimiento__Group__5__Impl12239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__6__Impl_in_rule__Procedimiento__Group__612270 = new BitSet(new long[]{0x0002000003E00000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__7_in_rule__Procedimiento__Group__612273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_6__0_in_rule__Procedimiento__Group__6__Impl12300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__7__Impl_in_rule__Procedimiento__Group__712331 = new BitSet(new long[]{0x49C0000000000030L,0x0000000000000201L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__8_in_rule__Procedimiento__Group__712334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Procedimiento__Group__7__Impl12362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__8__Impl_in_rule__Procedimiento__Group__812393 = new BitSet(new long[]{0x49C0000000000030L,0x0000000000000201L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__9_in_rule__Procedimiento__Group__812396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_8__0_in_rule__Procedimiento__Group__8__Impl12423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__9__Impl_in_rule__Procedimiento__Group__912454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_rule__Procedimiento__Group__9__Impl12482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__0__Impl_in_rule__Procedimiento__Group_3__012533 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__1_in_rule__Procedimiento__Group_3__012536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_0_in_rule__Procedimiento__Group_3__0__Impl12563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__1__Impl_in_rule__Procedimiento__Group_3__112593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__0_in_rule__Procedimiento__Group_3__1__Impl12620 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__0__Impl_in_rule__Procedimiento__Group_3_1__012655 = new BitSet(new long[]{0x0000300004000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__1_in_rule__Procedimiento__Group_3_1__012658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Procedimiento__Group_3_1__0__Impl12686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__1__Impl_in_rule__Procedimiento__Group_3_1__112717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_1_1_in_rule__Procedimiento__Group_3_1__1__Impl12744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_6__0__Impl_in_rule__Procedimiento__Group_6__012778 = new BitSet(new long[]{0x0000000003E00000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_6__1_in_rule__Procedimiento__Group_6__012781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__DeclaracionvariableAssignment_6_0_in_rule__Procedimiento__Group_6__0__Impl12808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_6__1__Impl_in_rule__Procedimiento__Group_6__112838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__DeclaracionvariableAssignment_6_1_in_rule__Procedimiento__Group_6__1__Impl12865 = new BitSet(new long[]{0x0000000003E00002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_8__0__Impl_in_rule__Procedimiento__Group_8__012900 = new BitSet(new long[]{0x49C0000000000030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_8__1_in_rule__Procedimiento__Group_8__012903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__SentenciasAssignment_8_0_in_rule__Procedimiento__Group_8__0__Impl12930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_8__1__Impl_in_rule__Procedimiento__Group_8__112960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__SentenciasAssignment_8_1_in_rule__Procedimiento__Group_8__1__Impl12987 = new BitSet(new long[]{0x49C0000000000032L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_013027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_113058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInicio_in_rule__Codigo__TieneAssignment_113089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_rule__Internas__NombreAssignment_013120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__Internas__OperadorAssignment_213151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAR_in_rule__Caracter__ContenidoAssignment13182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Inicio__DeclaracionvariableAssignment_2_013213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Inicio__DeclaracionvariableAssignment_2_113244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_4_013275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_4_113306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_rule__DeclaracionVariable__TipoAssignment_013337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_213368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_3_113399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__LlamadaFuncion__NombreAssignment_013430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_013461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_1_113492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Asignacion__LvalueAssignment_013523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_MATRIZ_in_rule__Asignacion__MatAssignment_113554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Asignacion__OperadorAssignment_313585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_213616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_3_113647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__Leer__VariableAssignment_213678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Si__ValorAssignment_113709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_013740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_113771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSino_in_rule__Si__SinoAssignment_413802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Mientras__ValorAssignment_113833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_013864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_113895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_013926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_113957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Repetir__ValorAssignment_313988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_rule__Desde__AsignacionAssignment_114019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Desde__ValorAssignment_314050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_014081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_114112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Incremento__NombreAssignment_014143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinc_in_rule__Incremento__SsignoAssignment_114174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Variable__NombreAssignment_014205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_MATRIZ_in_rule__Variable__MatAssignment_114236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VariableID__NombreAssignment_014267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_MATRIZ_in_rule__VariableID__MatAssignment_114298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAD_in_rule__ConstCadena__ContenidoAssignment14329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__NumeroEntero__ValorAssignment14360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_rule__NumeroDecimal__ValorAssignment14391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_rule__ValorBooleano__ValorAssignment14422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_izq_in_rule__Operacion__Op_izqAssignment_114453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesigno_in_rule__Operacion__Signo_opAssignment_214484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_der_in_rule__Operacion__Op_derAssignment_314515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Operando_izq__Oper_izqAssignment14546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Operando_der__Oper_derAssignment14577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_014608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_114639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_rule__ParametroFuncion__PasoAssignment_014670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_rule__ParametroFuncion__TipoAssignment_114701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__ParametroFuncion__VariableAssignment_314732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_rule__Funcion__TipoAssignment_014763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Funcion__NombreAssignment_214794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_014825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_1_114856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Funcion__DeclaracionvariableAssignment_7_014887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Funcion__DeclaracionvariableAssignment_7_114918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_9_014949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_9_114980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Funcion__DevuelveAssignment_1215011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Procedimiento__NombreAssignment_115042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_015073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_1_115104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Procedimiento__DeclaracionvariableAssignment_6_015135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Procedimiento__DeclaracionvariableAssignment_6_115166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_8_015197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_8_115228 = new BitSet(new long[]{0x0000000000000002L});
    }


}