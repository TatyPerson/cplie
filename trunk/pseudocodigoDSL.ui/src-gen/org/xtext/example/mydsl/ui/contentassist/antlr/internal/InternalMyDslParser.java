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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_CAR", "RULE_MATRIZ", "RULE_CAD", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'cos'", "'cuadrado'", "'exp'", "'ln'", "'log'", "'sen'", "'sqrt'", "'entero'", "'caracter'", "'real'", "'logico'", "'cadena'", "'E'", "'e'", "'verdadero'", "'falso'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'>='", "'<='", "'y'", "'o'", "'=='", "'!='", "'++'", "'--'", "'E/S'", "'S'", "'('", "')'", "','", "'var'", "'inicio'", "'fin_inicio'", "':'", "'='", "'escribir'", "'leer'", "'si'", "'entonces'", "'fin si'", "'mientras'", "'hacer'", "'fin_mientras'", "'repetir'", "'hasta_que'", "'desde'", "'hasta'", "'fin_desde'", "'.'", "'sino'", "'funcion'", "'devolver'", "'fin_funcion'", "'procedimiento'", "'fin_procedimiento'"
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: rule__Sentencias__Alternatives : ( ( ruleLlamadaFuncion ) | ( ruleAsignacion ) | ( ruleEscribir ) | ( ruleLeer ) | ( ruleSi ) | ( rulemientras ) | ( rulerepetir ) | ( ruledesde ) | ( ruleincremento ) | ( ruleInternas ) );
    public final void rule__Sentencias__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:1: ( ( ruleLlamadaFuncion ) | ( ruleAsignacion ) | ( ruleEscribir ) | ( ruleLeer ) | ( ruleSi ) | ( rulemientras ) | ( rulerepetir ) | ( ruledesde ) | ( ruleincremento ) | ( ruleInternas ) )
            int alt2=10;
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
                case 10 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:6: ( ruleInternas )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:6: ( ruleInternas )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1262:1: ruleInternas
                    {
                     before(grammarAccess.getSentenciasAccess().getInternasParserRuleCall_9()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInternas_in_rule__Sentencias__Alternatives2672);
                    ruleInternas();

                    state._fsp--;

                     after(grammarAccess.getSentenciasAccess().getInternasParserRuleCall_9()); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:1: rule__NombreInterna__Alternatives : ( ( 'cos' ) | ( 'cuadrado' ) | ( 'exp' ) | ( 'ln' ) | ( 'log' ) | ( 'sen' ) | ( 'sqrt' ) );
    public final void rule__NombreInterna__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: ( ( 'cos' ) | ( 'cuadrado' ) | ( 'exp' ) | ( 'ln' ) | ( 'log' ) | ( 'sen' ) | ( 'sqrt' ) )
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
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:1: ( 'cos' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:1: ( 'cos' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1278:1: 'cos'
                    {
                     before(grammarAccess.getNombreInternaAccess().getCosKeyword_0()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__NombreInterna__Alternatives2705); 
                     after(grammarAccess.getNombreInternaAccess().getCosKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:6: ( 'cuadrado' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:6: ( 'cuadrado' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: 'cuadrado'
                    {
                     before(grammarAccess.getNombreInternaAccess().getCuadradoKeyword_1()); 
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__NombreInterna__Alternatives2725); 
                     after(grammarAccess.getNombreInternaAccess().getCuadradoKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:6: ( 'exp' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:6: ( 'exp' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:1: 'exp'
                    {
                     before(grammarAccess.getNombreInternaAccess().getExpKeyword_2()); 
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__NombreInterna__Alternatives2745); 
                     after(grammarAccess.getNombreInternaAccess().getExpKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:6: ( 'ln' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:6: ( 'ln' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: 'ln'
                    {
                     before(grammarAccess.getNombreInternaAccess().getLnKeyword_3()); 
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__NombreInterna__Alternatives2765); 
                     after(grammarAccess.getNombreInternaAccess().getLnKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:6: ( 'log' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:6: ( 'log' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1310:1: 'log'
                    {
                     before(grammarAccess.getNombreInternaAccess().getLogKeyword_4()); 
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__NombreInterna__Alternatives2785); 
                     after(grammarAccess.getNombreInternaAccess().getLogKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:6: ( 'sen' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:6: ( 'sen' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1318:1: 'sen'
                    {
                     before(grammarAccess.getNombreInternaAccess().getSenKeyword_5()); 
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__NombreInterna__Alternatives2805); 
                     after(grammarAccess.getNombreInternaAccess().getSenKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1325:6: ( 'sqrt' )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1325:6: ( 'sqrt' )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1326:1: 'sqrt'
                    {
                     before(grammarAccess.getNombreInternaAccess().getSqrtKeyword_6()); 
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__NombreInterna__Alternatives2825); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1338:1: rule__Operador__Alternatives : ( ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleCaracter ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleValorBooleano ) );
    public final void rule__Operador__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1342:1: ( ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleCaracter ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleValorBooleano ) )
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
                    else if ( (LA4_5==EOF||(LA4_5>=47 && LA4_5<=48)) ) {
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
                else if ( (LA4_5==EOF||(LA4_5>=47 && LA4_5<=48)) ) {
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
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1343:1: ( ruleVariableID )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1343:1: ( ruleVariableID )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1344:1: ruleVariableID
                    {
                     before(grammarAccess.getOperadorAccess().getVariableIDParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__Operador__Alternatives2859);
                    ruleVariableID();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getVariableIDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:6: ( ruleConstCadena )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:6: ( ruleConstCadena )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: ruleConstCadena
                    {
                     before(grammarAccess.getOperadorAccess().getConstCadenaParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_rule__Operador__Alternatives2876);
                    ruleConstCadena();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getConstCadenaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1355:6: ( ruleCaracter )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1355:6: ( ruleCaracter )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1356:1: ruleCaracter
                    {
                     before(grammarAccess.getOperadorAccess().getCaracterParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_rule__Operador__Alternatives2893);
                    ruleCaracter();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getCaracterParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:6: ( ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:6: ( ruleNumeroEntero )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: ruleNumeroEntero
                    {
                     before(grammarAccess.getOperadorAccess().getNumeroEnteroParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_rule__Operador__Alternatives2910);
                    ruleNumeroEntero();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getNumeroEnteroParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:6: ( ruleNumeroDecimal )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:6: ( ruleNumeroDecimal )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1368:1: ruleNumeroDecimal
                    {
                     before(grammarAccess.getOperadorAccess().getNumeroDecimalParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_rule__Operador__Alternatives2927);
                    ruleNumeroDecimal();

                    state._fsp--;

                     after(grammarAccess.getOperadorAccess().getNumeroDecimalParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1373:6: ( ruleValorBooleano )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1373:6: ( ruleValorBooleano )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1374:1: ruleValorBooleano
                    {
                     before(grammarAccess.getOperadorAccess().getValorBooleanoParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_rule__Operador__Alternatives2944);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1384:1: rule__Valor__Alternatives : ( ( ruleLlamadaFuncion ) | ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleoperacion ) | ( ruleValorBooleano ) | ( ruleCaracter ) );
    public final void rule__Valor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1388:1: ( ( ruleLlamadaFuncion ) | ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleoperacion ) | ( ruleValorBooleano ) | ( ruleCaracter ) )
            int alt5=8;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:1: ( ruleLlamadaFuncion )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:1: ( ruleLlamadaFuncion )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: ruleLlamadaFuncion
                    {
                     before(grammarAccess.getValorAccess().getLlamadaFuncionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_rule__Valor__Alternatives2976);
                    ruleLlamadaFuncion();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getLlamadaFuncionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1395:6: ( ruleVariableID )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1395:6: ( ruleVariableID )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1396:1: ruleVariableID
                    {
                     before(grammarAccess.getValorAccess().getVariableIDParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__Valor__Alternatives2993);
                    ruleVariableID();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getVariableIDParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1401:6: ( ruleConstCadena )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1401:6: ( ruleConstCadena )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1402:1: ruleConstCadena
                    {
                     before(grammarAccess.getValorAccess().getConstCadenaParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_rule__Valor__Alternatives3010);
                    ruleConstCadena();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getConstCadenaParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:6: ( ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:6: ( ruleNumeroEntero )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1408:1: ruleNumeroEntero
                    {
                     before(grammarAccess.getValorAccess().getNumeroEnteroParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_rule__Valor__Alternatives3027);
                    ruleNumeroEntero();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getNumeroEnteroParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1413:6: ( ruleNumeroDecimal )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1413:6: ( ruleNumeroDecimal )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1414:1: ruleNumeroDecimal
                    {
                     before(grammarAccess.getValorAccess().getNumeroDecimalParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_rule__Valor__Alternatives3044);
                    ruleNumeroDecimal();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getNumeroDecimalParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:6: ( ruleoperacion )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:6: ( ruleoperacion )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1420:1: ruleoperacion
                    {
                     before(grammarAccess.getValorAccess().getOperacionParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rule__Valor__Alternatives3061);
                    ruleoperacion();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getOperacionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:6: ( ruleValorBooleano )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:6: ( ruleValorBooleano )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1426:1: ruleValorBooleano
                    {
                     before(grammarAccess.getValorAccess().getValorBooleanoParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_rule__Valor__Alternatives3078);
                    ruleValorBooleano();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getValorBooleanoParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:6: ( ruleCaracter )
                    {
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:6: ( ruleCaracter )
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1432:1: ruleCaracter
                    {
                     before(grammarAccess.getValorAccess().getCaracterParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_rule__Valor__Alternatives3095);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:1: rule__Internas__Group__0__Impl : ( ( ( rule__Internas__NombreAssignment_0 ) ) ( ( rule__Internas__NombreAssignment_0 )* ) ) ;
    public final void rule__Internas__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: ( ( ( ( rule__Internas__NombreAssignment_0 ) ) ( ( rule__Internas__NombreAssignment_0 )* ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1873:1: ( ( ( rule__Internas__NombreAssignment_0 ) ) ( ( rule__Internas__NombreAssignment_0 )* ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1873:1: ( ( ( rule__Internas__NombreAssignment_0 ) ) ( ( rule__Internas__NombreAssignment_0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1874:1: ( ( rule__Internas__NombreAssignment_0 ) ) ( ( rule__Internas__NombreAssignment_0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1874:1: ( ( rule__Internas__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1875:1: ( rule__Internas__NombreAssignment_0 )
            {
             before(grammarAccess.getInternasAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1876:1: ( rule__Internas__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1876:2: rule__Internas__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Internas__NombreAssignment_0_in_rule__Internas__Group__0__Impl4060);
            rule__Internas__NombreAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInternasAccess().getNombreAssignment_0()); 

            }

            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: ( ( rule__Internas__NombreAssignment_0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1880:1: ( rule__Internas__NombreAssignment_0 )*
            {
             before(grammarAccess.getInternasAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1881:1: ( rule__Internas__NombreAssignment_0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=14 && LA15_0<=20)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1881:2: rule__Internas__NombreAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Internas__NombreAssignment_0_in_rule__Internas__Group__0__Impl4072);
            	    rule__Internas__NombreAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getInternasAccess().getNombreAssignment_0()); 

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
    // $ANTLR end "rule__Internas__Group__0__Impl"


    // $ANTLR start "rule__Internas__Group__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1892:1: rule__Internas__Group__1 : rule__Internas__Group__1__Impl rule__Internas__Group__2 ;
    public final void rule__Internas__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1896:1: ( rule__Internas__Group__1__Impl rule__Internas__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1897:2: rule__Internas__Group__1__Impl rule__Internas__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group__1__Impl_in_rule__Internas__Group__14105);
            rule__Internas__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group__2_in_rule__Internas__Group__14108);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1904:1: rule__Internas__Group__1__Impl : ( '(' ) ;
    public final void rule__Internas__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1908:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1909:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1909:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1910:1: '('
            {
             before(grammarAccess.getInternasAccess().getLeftParenthesisKeyword_1()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Internas__Group__1__Impl4136); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: rule__Internas__Group__2 : rule__Internas__Group__2__Impl rule__Internas__Group__3 ;
    public final void rule__Internas__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1927:1: ( rule__Internas__Group__2__Impl rule__Internas__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1928:2: rule__Internas__Group__2__Impl rule__Internas__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group__2__Impl_in_rule__Internas__Group__24167);
            rule__Internas__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group__3_in_rule__Internas__Group__24170);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:1: rule__Internas__Group__2__Impl : ( ( rule__Internas__Group_2__0 )? ) ;
    public final void rule__Internas__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1939:1: ( ( ( rule__Internas__Group_2__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: ( ( rule__Internas__Group_2__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: ( ( rule__Internas__Group_2__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:1: ( rule__Internas__Group_2__0 )?
            {
             before(grammarAccess.getInternasAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1942:1: ( rule__Internas__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_CAR)||LA16_0==RULE_CAD||(LA16_0>=28 && LA16_0<=29)||LA16_0==31||LA16_0==67) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1942:2: rule__Internas__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Internas__Group_2__0_in_rule__Internas__Group__2__Impl4197);
                    rule__Internas__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInternasAccess().getGroup_2()); 

            }


            }

        }
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1952:1: rule__Internas__Group__3 : rule__Internas__Group__3__Impl ;
    public final void rule__Internas__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1956:1: ( rule__Internas__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1957:2: rule__Internas__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group__3__Impl_in_rule__Internas__Group__34228);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1963:1: rule__Internas__Group__3__Impl : ( ')' ) ;
    public final void rule__Internas__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1969:1: ')'
            {
             before(grammarAccess.getInternasAccess().getRightParenthesisKeyword_3()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Internas__Group__3__Impl4256); 
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


    // $ANTLR start "rule__Internas__Group_2__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1990:1: rule__Internas__Group_2__0 : rule__Internas__Group_2__0__Impl rule__Internas__Group_2__1 ;
    public final void rule__Internas__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1994:1: ( rule__Internas__Group_2__0__Impl rule__Internas__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1995:2: rule__Internas__Group_2__0__Impl rule__Internas__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group_2__0__Impl_in_rule__Internas__Group_2__04295);
            rule__Internas__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group_2__1_in_rule__Internas__Group_2__04298);
            rule__Internas__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__Group_2__0"


    // $ANTLR start "rule__Internas__Group_2__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2002:1: rule__Internas__Group_2__0__Impl : ( ( rule__Internas__OperadorAssignment_2_0 ) ) ;
    public final void rule__Internas__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2006:1: ( ( ( rule__Internas__OperadorAssignment_2_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2007:1: ( ( rule__Internas__OperadorAssignment_2_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2007:1: ( ( rule__Internas__OperadorAssignment_2_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2008:1: ( rule__Internas__OperadorAssignment_2_0 )
            {
             before(grammarAccess.getInternasAccess().getOperadorAssignment_2_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2009:1: ( rule__Internas__OperadorAssignment_2_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2009:2: rule__Internas__OperadorAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Internas__OperadorAssignment_2_0_in_rule__Internas__Group_2__0__Impl4325);
            rule__Internas__OperadorAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getInternasAccess().getOperadorAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__Group_2__0__Impl"


    // $ANTLR start "rule__Internas__Group_2__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2019:1: rule__Internas__Group_2__1 : rule__Internas__Group_2__1__Impl ;
    public final void rule__Internas__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2023:1: ( rule__Internas__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2024:2: rule__Internas__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group_2__1__Impl_in_rule__Internas__Group_2__14355);
            rule__Internas__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__Group_2__1"


    // $ANTLR start "rule__Internas__Group_2__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2030:1: rule__Internas__Group_2__1__Impl : ( ( rule__Internas__Group_2_1__0 )* ) ;
    public final void rule__Internas__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2034:1: ( ( ( rule__Internas__Group_2_1__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2035:1: ( ( rule__Internas__Group_2_1__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2035:1: ( ( rule__Internas__Group_2_1__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2036:1: ( rule__Internas__Group_2_1__0 )*
            {
             before(grammarAccess.getInternasAccess().getGroup_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2037:1: ( rule__Internas__Group_2_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==48) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2037:2: rule__Internas__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Internas__Group_2_1__0_in_rule__Internas__Group_2__1__Impl4382);
            	    rule__Internas__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getInternasAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__Group_2__1__Impl"


    // $ANTLR start "rule__Internas__Group_2_1__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2051:1: rule__Internas__Group_2_1__0 : rule__Internas__Group_2_1__0__Impl rule__Internas__Group_2_1__1 ;
    public final void rule__Internas__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2055:1: ( rule__Internas__Group_2_1__0__Impl rule__Internas__Group_2_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2056:2: rule__Internas__Group_2_1__0__Impl rule__Internas__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group_2_1__0__Impl_in_rule__Internas__Group_2_1__04417);
            rule__Internas__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group_2_1__1_in_rule__Internas__Group_2_1__04420);
            rule__Internas__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__Group_2_1__0"


    // $ANTLR start "rule__Internas__Group_2_1__0__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2063:1: rule__Internas__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Internas__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2067:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: ','
            {
             before(grammarAccess.getInternasAccess().getCommaKeyword_2_1_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Internas__Group_2_1__0__Impl4448); 
             after(grammarAccess.getInternasAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__Group_2_1__0__Impl"


    // $ANTLR start "rule__Internas__Group_2_1__1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2082:1: rule__Internas__Group_2_1__1 : rule__Internas__Group_2_1__1__Impl ;
    public final void rule__Internas__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: ( rule__Internas__Group_2_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:2: rule__Internas__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Internas__Group_2_1__1__Impl_in_rule__Internas__Group_2_1__14479);
            rule__Internas__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__Group_2_1__1"


    // $ANTLR start "rule__Internas__Group_2_1__1__Impl"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2093:1: rule__Internas__Group_2_1__1__Impl : ( ( rule__Internas__OperadorAssignment_2_1_1 ) ) ;
    public final void rule__Internas__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2097:1: ( ( ( rule__Internas__OperadorAssignment_2_1_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2098:1: ( ( rule__Internas__OperadorAssignment_2_1_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2098:1: ( ( rule__Internas__OperadorAssignment_2_1_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:1: ( rule__Internas__OperadorAssignment_2_1_1 )
            {
             before(grammarAccess.getInternasAccess().getOperadorAssignment_2_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:1: ( rule__Internas__OperadorAssignment_2_1_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:2: rule__Internas__OperadorAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Internas__OperadorAssignment_2_1_1_in_rule__Internas__Group_2_1__1__Impl4506);
            rule__Internas__OperadorAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInternasAccess().getOperadorAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__Group_2_1__1__Impl"


    // $ANTLR start "rule__Inicio__Group__0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2114:1: rule__Inicio__Group__0 : rule__Inicio__Group__0__Impl rule__Inicio__Group__1 ;
    public final void rule__Inicio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: ( rule__Inicio__Group__0__Impl rule__Inicio__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2119:2: rule__Inicio__Group__0__Impl rule__Inicio__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__0__Impl_in_rule__Inicio__Group__04540);
            rule__Inicio__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__1_in_rule__Inicio__Group__04543);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2126:1: rule__Inicio__Group__0__Impl : ( () ) ;
    public final void rule__Inicio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:1: ( ( () ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2131:1: ( () )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2131:1: ( () )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2132:1: ()
            {
             before(grammarAccess.getInicioAccess().getInicioAction_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2133:1: ()
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:1: 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2145:1: rule__Inicio__Group__1 : rule__Inicio__Group__1__Impl rule__Inicio__Group__2 ;
    public final void rule__Inicio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2149:1: ( rule__Inicio__Group__1__Impl rule__Inicio__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:2: rule__Inicio__Group__1__Impl rule__Inicio__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__1__Impl_in_rule__Inicio__Group__14601);
            rule__Inicio__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__2_in_rule__Inicio__Group__14604);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2157:1: rule__Inicio__Group__1__Impl : ( 'var' ) ;
    public final void rule__Inicio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:1: ( ( 'var' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:1: ( 'var' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:1: ( 'var' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2163:1: 'var'
            {
             before(grammarAccess.getInicioAccess().getVarKeyword_1()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Inicio__Group__1__Impl4632); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:1: rule__Inicio__Group__2 : rule__Inicio__Group__2__Impl rule__Inicio__Group__3 ;
    public final void rule__Inicio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:1: ( rule__Inicio__Group__2__Impl rule__Inicio__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2181:2: rule__Inicio__Group__2__Impl rule__Inicio__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__2__Impl_in_rule__Inicio__Group__24663);
            rule__Inicio__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__3_in_rule__Inicio__Group__24666);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2188:1: rule__Inicio__Group__2__Impl : ( ( rule__Inicio__Group_2__0 )? ) ;
    public final void rule__Inicio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2192:1: ( ( ( rule__Inicio__Group_2__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: ( ( rule__Inicio__Group_2__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: ( ( rule__Inicio__Group_2__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2194:1: ( rule__Inicio__Group_2__0 )?
            {
             before(grammarAccess.getInicioAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:1: ( rule__Inicio__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=21 && LA18_0<=25)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:2: rule__Inicio__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__0_in_rule__Inicio__Group__2__Impl4693);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2205:1: rule__Inicio__Group__3 : rule__Inicio__Group__3__Impl rule__Inicio__Group__4 ;
    public final void rule__Inicio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: ( rule__Inicio__Group__3__Impl rule__Inicio__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:2: rule__Inicio__Group__3__Impl rule__Inicio__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__3__Impl_in_rule__Inicio__Group__34724);
            rule__Inicio__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__4_in_rule__Inicio__Group__34727);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:1: rule__Inicio__Group__3__Impl : ( 'inicio' ) ;
    public final void rule__Inicio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2221:1: ( ( 'inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2222:1: ( 'inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2222:1: ( 'inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:1: 'inicio'
            {
             before(grammarAccess.getInicioAccess().getInicioKeyword_3()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Inicio__Group__3__Impl4755); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: rule__Inicio__Group__4 : rule__Inicio__Group__4__Impl rule__Inicio__Group__5 ;
    public final void rule__Inicio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2240:1: ( rule__Inicio__Group__4__Impl rule__Inicio__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:2: rule__Inicio__Group__4__Impl rule__Inicio__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__4__Impl_in_rule__Inicio__Group__44786);
            rule__Inicio__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__5_in_rule__Inicio__Group__44789);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: rule__Inicio__Group__4__Impl : ( ( rule__Inicio__Group_4__0 )? ) ;
    public final void rule__Inicio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2252:1: ( ( ( rule__Inicio__Group_4__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:1: ( ( rule__Inicio__Group_4__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:1: ( ( rule__Inicio__Group_4__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2254:1: ( rule__Inicio__Group_4__0 )?
            {
             before(grammarAccess.getInicioAccess().getGroup_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:1: ( rule__Inicio__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)||(LA19_0>=14 && LA19_0<=20)||(LA19_0>=54 && LA19_0<=56)||LA19_0==59||LA19_0==62||LA19_0==64) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:2: rule__Inicio__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_4__0_in_rule__Inicio__Group__4__Impl4816);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2265:1: rule__Inicio__Group__5 : rule__Inicio__Group__5__Impl ;
    public final void rule__Inicio__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:1: ( rule__Inicio__Group__5__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2270:2: rule__Inicio__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group__5__Impl_in_rule__Inicio__Group__54847);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2276:1: rule__Inicio__Group__5__Impl : ( 'fin_inicio' ) ;
    public final void rule__Inicio__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2280:1: ( ( 'fin_inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:1: ( 'fin_inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:1: ( 'fin_inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2282:1: 'fin_inicio'
            {
             before(grammarAccess.getInicioAccess().getFin_inicioKeyword_5()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Inicio__Group__5__Impl4875); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2307:1: rule__Inicio__Group_2__0 : rule__Inicio__Group_2__0__Impl rule__Inicio__Group_2__1 ;
    public final void rule__Inicio__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2311:1: ( rule__Inicio__Group_2__0__Impl rule__Inicio__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2312:2: rule__Inicio__Group_2__0__Impl rule__Inicio__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__0__Impl_in_rule__Inicio__Group_2__04918);
            rule__Inicio__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__1_in_rule__Inicio__Group_2__04921);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2319:1: rule__Inicio__Group_2__0__Impl : ( ( rule__Inicio__DeclaracionvariableAssignment_2_0 ) ) ;
    public final void rule__Inicio__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2323:1: ( ( ( rule__Inicio__DeclaracionvariableAssignment_2_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: ( ( rule__Inicio__DeclaracionvariableAssignment_2_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: ( ( rule__Inicio__DeclaracionvariableAssignment_2_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: ( rule__Inicio__DeclaracionvariableAssignment_2_0 )
            {
             before(grammarAccess.getInicioAccess().getDeclaracionvariableAssignment_2_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:1: ( rule__Inicio__DeclaracionvariableAssignment_2_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:2: rule__Inicio__DeclaracionvariableAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__DeclaracionvariableAssignment_2_0_in_rule__Inicio__Group_2__0__Impl4948);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2336:1: rule__Inicio__Group_2__1 : rule__Inicio__Group_2__1__Impl ;
    public final void rule__Inicio__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: ( rule__Inicio__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:2: rule__Inicio__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_2__1__Impl_in_rule__Inicio__Group_2__14978);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2347:1: rule__Inicio__Group_2__1__Impl : ( ( rule__Inicio__DeclaracionvariableAssignment_2_1 )* ) ;
    public final void rule__Inicio__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:1: ( ( ( rule__Inicio__DeclaracionvariableAssignment_2_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2352:1: ( ( rule__Inicio__DeclaracionvariableAssignment_2_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2352:1: ( ( rule__Inicio__DeclaracionvariableAssignment_2_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2353:1: ( rule__Inicio__DeclaracionvariableAssignment_2_1 )*
            {
             before(grammarAccess.getInicioAccess().getDeclaracionvariableAssignment_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2354:1: ( rule__Inicio__DeclaracionvariableAssignment_2_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=21 && LA20_0<=25)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2354:2: rule__Inicio__DeclaracionvariableAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Inicio__DeclaracionvariableAssignment_2_1_in_rule__Inicio__Group_2__1__Impl5005);
            	    rule__Inicio__DeclaracionvariableAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:1: rule__Inicio__Group_4__0 : rule__Inicio__Group_4__0__Impl rule__Inicio__Group_4__1 ;
    public final void rule__Inicio__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:1: ( rule__Inicio__Group_4__0__Impl rule__Inicio__Group_4__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2373:2: rule__Inicio__Group_4__0__Impl rule__Inicio__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_4__0__Impl_in_rule__Inicio__Group_4__05040);
            rule__Inicio__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_4__1_in_rule__Inicio__Group_4__05043);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2380:1: rule__Inicio__Group_4__0__Impl : ( ( rule__Inicio__TieneAssignment_4_0 ) ) ;
    public final void rule__Inicio__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: ( ( ( rule__Inicio__TieneAssignment_4_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:1: ( ( rule__Inicio__TieneAssignment_4_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:1: ( ( rule__Inicio__TieneAssignment_4_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2386:1: ( rule__Inicio__TieneAssignment_4_0 )
            {
             before(grammarAccess.getInicioAccess().getTieneAssignment_4_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2387:1: ( rule__Inicio__TieneAssignment_4_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2387:2: rule__Inicio__TieneAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__TieneAssignment_4_0_in_rule__Inicio__Group_4__0__Impl5070);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2397:1: rule__Inicio__Group_4__1 : rule__Inicio__Group_4__1__Impl ;
    public final void rule__Inicio__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:1: ( rule__Inicio__Group_4__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:2: rule__Inicio__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inicio__Group_4__1__Impl_in_rule__Inicio__Group_4__15100);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2408:1: rule__Inicio__Group_4__1__Impl : ( ( rule__Inicio__TieneAssignment_4_1 )* ) ;
    public final void rule__Inicio__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2412:1: ( ( ( rule__Inicio__TieneAssignment_4_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2413:1: ( ( rule__Inicio__TieneAssignment_4_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2413:1: ( ( rule__Inicio__TieneAssignment_4_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2414:1: ( rule__Inicio__TieneAssignment_4_1 )*
            {
             before(grammarAccess.getInicioAccess().getTieneAssignment_4_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2415:1: ( rule__Inicio__TieneAssignment_4_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)||(LA21_0>=14 && LA21_0<=20)||(LA21_0>=54 && LA21_0<=56)||LA21_0==59||LA21_0==62||LA21_0==64) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2415:2: rule__Inicio__TieneAssignment_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Inicio__TieneAssignment_4_1_in_rule__Inicio__Group_4__1__Impl5127);
            	    rule__Inicio__TieneAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2429:1: rule__DeclaracionVariable__Group__0 : rule__DeclaracionVariable__Group__0__Impl rule__DeclaracionVariable__Group__1 ;
    public final void rule__DeclaracionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: ( rule__DeclaracionVariable__Group__0__Impl rule__DeclaracionVariable__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2434:2: rule__DeclaracionVariable__Group__0__Impl rule__DeclaracionVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__0__Impl_in_rule__DeclaracionVariable__Group__05162);
            rule__DeclaracionVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__1_in_rule__DeclaracionVariable__Group__05165);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2441:1: rule__DeclaracionVariable__Group__0__Impl : ( ( ( rule__DeclaracionVariable__TipoAssignment_0 ) ) ( ( rule__DeclaracionVariable__TipoAssignment_0 )* ) ) ;
    public final void rule__DeclaracionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2445:1: ( ( ( ( rule__DeclaracionVariable__TipoAssignment_0 ) ) ( ( rule__DeclaracionVariable__TipoAssignment_0 )* ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2446:1: ( ( ( rule__DeclaracionVariable__TipoAssignment_0 ) ) ( ( rule__DeclaracionVariable__TipoAssignment_0 )* ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2446:1: ( ( ( rule__DeclaracionVariable__TipoAssignment_0 ) ) ( ( rule__DeclaracionVariable__TipoAssignment_0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2447:1: ( ( rule__DeclaracionVariable__TipoAssignment_0 ) ) ( ( rule__DeclaracionVariable__TipoAssignment_0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2447:1: ( ( rule__DeclaracionVariable__TipoAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:1: ( rule__DeclaracionVariable__TipoAssignment_0 )
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTipoAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2449:1: ( rule__DeclaracionVariable__TipoAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2449:2: rule__DeclaracionVariable__TipoAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__TipoAssignment_0_in_rule__DeclaracionVariable__Group__0__Impl5194);
            rule__DeclaracionVariable__TipoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracionVariableAccess().getTipoAssignment_0()); 

            }

            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2452:1: ( ( rule__DeclaracionVariable__TipoAssignment_0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2453:1: ( rule__DeclaracionVariable__TipoAssignment_0 )*
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTipoAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2454:1: ( rule__DeclaracionVariable__TipoAssignment_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=21 && LA22_0<=25)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2454:2: rule__DeclaracionVariable__TipoAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__TipoAssignment_0_in_rule__DeclaracionVariable__Group__0__Impl5206);
            	    rule__DeclaracionVariable__TipoAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:1: rule__DeclaracionVariable__Group__1 : rule__DeclaracionVariable__Group__1__Impl rule__DeclaracionVariable__Group__2 ;
    public final void rule__DeclaracionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2469:1: ( rule__DeclaracionVariable__Group__1__Impl rule__DeclaracionVariable__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2470:2: rule__DeclaracionVariable__Group__1__Impl rule__DeclaracionVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__1__Impl_in_rule__DeclaracionVariable__Group__15239);
            rule__DeclaracionVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__2_in_rule__DeclaracionVariable__Group__15242);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:1: rule__DeclaracionVariable__Group__1__Impl : ( ':' ) ;
    public final void rule__DeclaracionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2481:1: ( ( ':' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2482:1: ( ':' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2482:1: ( ':' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:1: ':'
            {
             before(grammarAccess.getDeclaracionVariableAccess().getColonKeyword_1()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__DeclaracionVariable__Group__1__Impl5270); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: rule__DeclaracionVariable__Group__2 : rule__DeclaracionVariable__Group__2__Impl rule__DeclaracionVariable__Group__3 ;
    public final void rule__DeclaracionVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2500:1: ( rule__DeclaracionVariable__Group__2__Impl rule__DeclaracionVariable__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2501:2: rule__DeclaracionVariable__Group__2__Impl rule__DeclaracionVariable__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__2__Impl_in_rule__DeclaracionVariable__Group__25301);
            rule__DeclaracionVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__3_in_rule__DeclaracionVariable__Group__25304);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2508:1: rule__DeclaracionVariable__Group__2__Impl : ( ( rule__DeclaracionVariable__TieneIDsAssignment_2 ) ) ;
    public final void rule__DeclaracionVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:1: ( ( ( rule__DeclaracionVariable__TieneIDsAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2513:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2513:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2514:1: ( rule__DeclaracionVariable__TieneIDsAssignment_2 )
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2515:1: ( rule__DeclaracionVariable__TieneIDsAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2515:2: rule__DeclaracionVariable__TieneIDsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_2_in_rule__DeclaracionVariable__Group__2__Impl5331);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2525:1: rule__DeclaracionVariable__Group__3 : rule__DeclaracionVariable__Group__3__Impl ;
    public final void rule__DeclaracionVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2529:1: ( rule__DeclaracionVariable__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2530:2: rule__DeclaracionVariable__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group__3__Impl_in_rule__DeclaracionVariable__Group__35361);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2536:1: rule__DeclaracionVariable__Group__3__Impl : ( ( rule__DeclaracionVariable__Group_3__0 )* ) ;
    public final void rule__DeclaracionVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2540:1: ( ( ( rule__DeclaracionVariable__Group_3__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:1: ( ( rule__DeclaracionVariable__Group_3__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:1: ( ( rule__DeclaracionVariable__Group_3__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2542:1: ( rule__DeclaracionVariable__Group_3__0 )*
            {
             before(grammarAccess.getDeclaracionVariableAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2543:1: ( rule__DeclaracionVariable__Group_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==48) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2543:2: rule__DeclaracionVariable__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_3__0_in_rule__DeclaracionVariable__Group__3__Impl5388);
            	    rule__DeclaracionVariable__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2561:1: rule__DeclaracionVariable__Group_3__0 : rule__DeclaracionVariable__Group_3__0__Impl rule__DeclaracionVariable__Group_3__1 ;
    public final void rule__DeclaracionVariable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2565:1: ( rule__DeclaracionVariable__Group_3__0__Impl rule__DeclaracionVariable__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2566:2: rule__DeclaracionVariable__Group_3__0__Impl rule__DeclaracionVariable__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_3__0__Impl_in_rule__DeclaracionVariable__Group_3__05427);
            rule__DeclaracionVariable__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_3__1_in_rule__DeclaracionVariable__Group_3__05430);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2573:1: rule__DeclaracionVariable__Group_3__0__Impl : ( ',' ) ;
    public final void rule__DeclaracionVariable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2577:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:1: ','
            {
             before(grammarAccess.getDeclaracionVariableAccess().getCommaKeyword_3_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__DeclaracionVariable__Group_3__0__Impl5458); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2592:1: rule__DeclaracionVariable__Group_3__1 : rule__DeclaracionVariable__Group_3__1__Impl ;
    public final void rule__DeclaracionVariable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:1: ( rule__DeclaracionVariable__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2597:2: rule__DeclaracionVariable__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__Group_3__1__Impl_in_rule__DeclaracionVariable__Group_3__15489);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2603:1: rule__DeclaracionVariable__Group_3__1__Impl : ( ( rule__DeclaracionVariable__TieneIDsAssignment_3_1 ) ) ;
    public final void rule__DeclaracionVariable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2607:1: ( ( ( rule__DeclaracionVariable__TieneIDsAssignment_3_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2608:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_3_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2608:1: ( ( rule__DeclaracionVariable__TieneIDsAssignment_3_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2609:1: ( rule__DeclaracionVariable__TieneIDsAssignment_3_1 )
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsAssignment_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2610:1: ( rule__DeclaracionVariable__TieneIDsAssignment_3_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2610:2: rule__DeclaracionVariable__TieneIDsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_3_1_in_rule__DeclaracionVariable__Group_3__1__Impl5516);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2624:1: rule__LlamadaFuncion__Group__0 : rule__LlamadaFuncion__Group__0__Impl rule__LlamadaFuncion__Group__1 ;
    public final void rule__LlamadaFuncion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2628:1: ( rule__LlamadaFuncion__Group__0__Impl rule__LlamadaFuncion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2629:2: rule__LlamadaFuncion__Group__0__Impl rule__LlamadaFuncion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__0__Impl_in_rule__LlamadaFuncion__Group__05550);
            rule__LlamadaFuncion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__1_in_rule__LlamadaFuncion__Group__05553);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2636:1: rule__LlamadaFuncion__Group__0__Impl : ( ( rule__LlamadaFuncion__NombreAssignment_0 ) ) ;
    public final void rule__LlamadaFuncion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2640:1: ( ( ( rule__LlamadaFuncion__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2641:1: ( ( rule__LlamadaFuncion__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2641:1: ( ( rule__LlamadaFuncion__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2642:1: ( rule__LlamadaFuncion__NombreAssignment_0 )
            {
             before(grammarAccess.getLlamadaFuncionAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2643:1: ( rule__LlamadaFuncion__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2643:2: rule__LlamadaFuncion__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__NombreAssignment_0_in_rule__LlamadaFuncion__Group__0__Impl5580);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2653:1: rule__LlamadaFuncion__Group__1 : rule__LlamadaFuncion__Group__1__Impl rule__LlamadaFuncion__Group__2 ;
    public final void rule__LlamadaFuncion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:1: ( rule__LlamadaFuncion__Group__1__Impl rule__LlamadaFuncion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2658:2: rule__LlamadaFuncion__Group__1__Impl rule__LlamadaFuncion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__1__Impl_in_rule__LlamadaFuncion__Group__15610);
            rule__LlamadaFuncion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__2_in_rule__LlamadaFuncion__Group__15613);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: rule__LlamadaFuncion__Group__1__Impl : ( '(' ) ;
    public final void rule__LlamadaFuncion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2669:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2670:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2670:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2671:1: '('
            {
             before(grammarAccess.getLlamadaFuncionAccess().getLeftParenthesisKeyword_1()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__LlamadaFuncion__Group__1__Impl5641); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2684:1: rule__LlamadaFuncion__Group__2 : rule__LlamadaFuncion__Group__2__Impl rule__LlamadaFuncion__Group__3 ;
    public final void rule__LlamadaFuncion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2688:1: ( rule__LlamadaFuncion__Group__2__Impl rule__LlamadaFuncion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2689:2: rule__LlamadaFuncion__Group__2__Impl rule__LlamadaFuncion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__2__Impl_in_rule__LlamadaFuncion__Group__25672);
            rule__LlamadaFuncion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__3_in_rule__LlamadaFuncion__Group__25675);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2696:1: rule__LlamadaFuncion__Group__2__Impl : ( ( rule__LlamadaFuncion__Group_2__0 )? ) ;
    public final void rule__LlamadaFuncion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2700:1: ( ( ( rule__LlamadaFuncion__Group_2__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2701:1: ( ( rule__LlamadaFuncion__Group_2__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2701:1: ( ( rule__LlamadaFuncion__Group_2__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2702:1: ( rule__LlamadaFuncion__Group_2__0 )?
            {
             before(grammarAccess.getLlamadaFuncionAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2703:1: ( rule__LlamadaFuncion__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_CAR)||LA24_0==RULE_CAD||(LA24_0>=28 && LA24_0<=29)||LA24_0==31||LA24_0==67) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2703:2: rule__LlamadaFuncion__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__0_in_rule__LlamadaFuncion__Group__2__Impl5702);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2713:1: rule__LlamadaFuncion__Group__3 : rule__LlamadaFuncion__Group__3__Impl ;
    public final void rule__LlamadaFuncion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2717:1: ( rule__LlamadaFuncion__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2718:2: rule__LlamadaFuncion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group__3__Impl_in_rule__LlamadaFuncion__Group__35733);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2724:1: rule__LlamadaFuncion__Group__3__Impl : ( ')' ) ;
    public final void rule__LlamadaFuncion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2728:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2729:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2729:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2730:1: ')'
            {
             before(grammarAccess.getLlamadaFuncionAccess().getRightParenthesisKeyword_3()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__LlamadaFuncion__Group__3__Impl5761); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2751:1: rule__LlamadaFuncion__Group_2__0 : rule__LlamadaFuncion__Group_2__0__Impl rule__LlamadaFuncion__Group_2__1 ;
    public final void rule__LlamadaFuncion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2755:1: ( rule__LlamadaFuncion__Group_2__0__Impl rule__LlamadaFuncion__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2756:2: rule__LlamadaFuncion__Group_2__0__Impl rule__LlamadaFuncion__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__0__Impl_in_rule__LlamadaFuncion__Group_2__05800);
            rule__LlamadaFuncion__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__1_in_rule__LlamadaFuncion__Group_2__05803);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2763:1: rule__LlamadaFuncion__Group_2__0__Impl : ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) ) ;
    public final void rule__LlamadaFuncion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2767:1: ( ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2768:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2768:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2769:1: ( rule__LlamadaFuncion__OperadorAssignment_2_0 )
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorAssignment_2_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2770:1: ( rule__LlamadaFuncion__OperadorAssignment_2_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2770:2: rule__LlamadaFuncion__OperadorAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_0_in_rule__LlamadaFuncion__Group_2__0__Impl5830);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2780:1: rule__LlamadaFuncion__Group_2__1 : rule__LlamadaFuncion__Group_2__1__Impl ;
    public final void rule__LlamadaFuncion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2784:1: ( rule__LlamadaFuncion__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2785:2: rule__LlamadaFuncion__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2__1__Impl_in_rule__LlamadaFuncion__Group_2__15860);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2791:1: rule__LlamadaFuncion__Group_2__1__Impl : ( ( rule__LlamadaFuncion__Group_2_1__0 )* ) ;
    public final void rule__LlamadaFuncion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2795:1: ( ( ( rule__LlamadaFuncion__Group_2_1__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2796:1: ( ( rule__LlamadaFuncion__Group_2_1__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2796:1: ( ( rule__LlamadaFuncion__Group_2_1__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2797:1: ( rule__LlamadaFuncion__Group_2_1__0 )*
            {
             before(grammarAccess.getLlamadaFuncionAccess().getGroup_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2798:1: ( rule__LlamadaFuncion__Group_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==48) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2798:2: rule__LlamadaFuncion__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__0_in_rule__LlamadaFuncion__Group_2__1__Impl5887);
            	    rule__LlamadaFuncion__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2812:1: rule__LlamadaFuncion__Group_2_1__0 : rule__LlamadaFuncion__Group_2_1__0__Impl rule__LlamadaFuncion__Group_2_1__1 ;
    public final void rule__LlamadaFuncion__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2816:1: ( rule__LlamadaFuncion__Group_2_1__0__Impl rule__LlamadaFuncion__Group_2_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:2: rule__LlamadaFuncion__Group_2_1__0__Impl rule__LlamadaFuncion__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__0__Impl_in_rule__LlamadaFuncion__Group_2_1__05922);
            rule__LlamadaFuncion__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__1_in_rule__LlamadaFuncion__Group_2_1__05925);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2824:1: rule__LlamadaFuncion__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__LlamadaFuncion__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2828:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2829:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2829:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2830:1: ','
            {
             before(grammarAccess.getLlamadaFuncionAccess().getCommaKeyword_2_1_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__LlamadaFuncion__Group_2_1__0__Impl5953); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2843:1: rule__LlamadaFuncion__Group_2_1__1 : rule__LlamadaFuncion__Group_2_1__1__Impl ;
    public final void rule__LlamadaFuncion__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2847:1: ( rule__LlamadaFuncion__Group_2_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2848:2: rule__LlamadaFuncion__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__Group_2_1__1__Impl_in_rule__LlamadaFuncion__Group_2_1__15984);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2854:1: rule__LlamadaFuncion__Group_2_1__1__Impl : ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) ) ;
    public final void rule__LlamadaFuncion__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2858:1: ( ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2859:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2859:1: ( ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2860:1: ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 )
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorAssignment_2_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2861:1: ( rule__LlamadaFuncion__OperadorAssignment_2_1_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2861:2: rule__LlamadaFuncion__OperadorAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_1_1_in_rule__LlamadaFuncion__Group_2_1__1__Impl6011);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2875:1: rule__Asignacion__Group__0 : rule__Asignacion__Group__0__Impl rule__Asignacion__Group__1 ;
    public final void rule__Asignacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2879:1: ( rule__Asignacion__Group__0__Impl rule__Asignacion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2880:2: rule__Asignacion__Group__0__Impl rule__Asignacion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__0__Impl_in_rule__Asignacion__Group__06045);
            rule__Asignacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__1_in_rule__Asignacion__Group__06048);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2887:1: rule__Asignacion__Group__0__Impl : ( ( rule__Asignacion__LvalueAssignment_0 ) ) ;
    public final void rule__Asignacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2891:1: ( ( ( rule__Asignacion__LvalueAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2892:1: ( ( rule__Asignacion__LvalueAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2892:1: ( ( rule__Asignacion__LvalueAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2893:1: ( rule__Asignacion__LvalueAssignment_0 )
            {
             before(grammarAccess.getAsignacionAccess().getLvalueAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2894:1: ( rule__Asignacion__LvalueAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2894:2: rule__Asignacion__LvalueAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__LvalueAssignment_0_in_rule__Asignacion__Group__0__Impl6075);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2904:1: rule__Asignacion__Group__1 : rule__Asignacion__Group__1__Impl rule__Asignacion__Group__2 ;
    public final void rule__Asignacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2908:1: ( rule__Asignacion__Group__1__Impl rule__Asignacion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2909:2: rule__Asignacion__Group__1__Impl rule__Asignacion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__1__Impl_in_rule__Asignacion__Group__16105);
            rule__Asignacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__2_in_rule__Asignacion__Group__16108);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2916:1: rule__Asignacion__Group__1__Impl : ( ( rule__Asignacion__MatAssignment_1 )* ) ;
    public final void rule__Asignacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2920:1: ( ( ( rule__Asignacion__MatAssignment_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2921:1: ( ( rule__Asignacion__MatAssignment_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2921:1: ( ( rule__Asignacion__MatAssignment_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: ( rule__Asignacion__MatAssignment_1 )*
            {
             before(grammarAccess.getAsignacionAccess().getMatAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:1: ( rule__Asignacion__MatAssignment_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_MATRIZ) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:2: rule__Asignacion__MatAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Asignacion__MatAssignment_1_in_rule__Asignacion__Group__1__Impl6135);
            	    rule__Asignacion__MatAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2933:1: rule__Asignacion__Group__2 : rule__Asignacion__Group__2__Impl rule__Asignacion__Group__3 ;
    public final void rule__Asignacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2937:1: ( rule__Asignacion__Group__2__Impl rule__Asignacion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2938:2: rule__Asignacion__Group__2__Impl rule__Asignacion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__2__Impl_in_rule__Asignacion__Group__26166);
            rule__Asignacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__3_in_rule__Asignacion__Group__26169);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2945:1: rule__Asignacion__Group__2__Impl : ( '=' ) ;
    public final void rule__Asignacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2949:1: ( ( '=' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2950:1: ( '=' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2950:1: ( '=' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2951:1: '='
            {
             before(grammarAccess.getAsignacionAccess().getEqualsSignKeyword_2()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__Asignacion__Group__2__Impl6197); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2964:1: rule__Asignacion__Group__3 : rule__Asignacion__Group__3__Impl ;
    public final void rule__Asignacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2968:1: ( rule__Asignacion__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2969:2: rule__Asignacion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__Group__3__Impl_in_rule__Asignacion__Group__36228);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2975:1: rule__Asignacion__Group__3__Impl : ( ( rule__Asignacion__OperadorAssignment_3 ) ) ;
    public final void rule__Asignacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2979:1: ( ( ( rule__Asignacion__OperadorAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2980:1: ( ( rule__Asignacion__OperadorAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2980:1: ( ( rule__Asignacion__OperadorAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2981:1: ( rule__Asignacion__OperadorAssignment_3 )
            {
             before(grammarAccess.getAsignacionAccess().getOperadorAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2982:1: ( rule__Asignacion__OperadorAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2982:2: rule__Asignacion__OperadorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asignacion__OperadorAssignment_3_in_rule__Asignacion__Group__3__Impl6255);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3000:1: rule__Escribir__Group__0 : rule__Escribir__Group__0__Impl rule__Escribir__Group__1 ;
    public final void rule__Escribir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3004:1: ( rule__Escribir__Group__0__Impl rule__Escribir__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3005:2: rule__Escribir__Group__0__Impl rule__Escribir__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__0__Impl_in_rule__Escribir__Group__06293);
            rule__Escribir__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__1_in_rule__Escribir__Group__06296);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3012:1: rule__Escribir__Group__0__Impl : ( 'escribir' ) ;
    public final void rule__Escribir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3016:1: ( ( 'escribir' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3017:1: ( 'escribir' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3017:1: ( 'escribir' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3018:1: 'escribir'
            {
             before(grammarAccess.getEscribirAccess().getEscribirKeyword_0()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__Escribir__Group__0__Impl6324); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3031:1: rule__Escribir__Group__1 : rule__Escribir__Group__1__Impl rule__Escribir__Group__2 ;
    public final void rule__Escribir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3035:1: ( rule__Escribir__Group__1__Impl rule__Escribir__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3036:2: rule__Escribir__Group__1__Impl rule__Escribir__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__1__Impl_in_rule__Escribir__Group__16355);
            rule__Escribir__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__2_in_rule__Escribir__Group__16358);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3043:1: rule__Escribir__Group__1__Impl : ( '(' ) ;
    public final void rule__Escribir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3047:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3048:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3048:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3049:1: '('
            {
             before(grammarAccess.getEscribirAccess().getLeftParenthesisKeyword_1()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Escribir__Group__1__Impl6386); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3062:1: rule__Escribir__Group__2 : rule__Escribir__Group__2__Impl rule__Escribir__Group__3 ;
    public final void rule__Escribir__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3066:1: ( rule__Escribir__Group__2__Impl rule__Escribir__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:2: rule__Escribir__Group__2__Impl rule__Escribir__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__2__Impl_in_rule__Escribir__Group__26417);
            rule__Escribir__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__3_in_rule__Escribir__Group__26420);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3074:1: rule__Escribir__Group__2__Impl : ( ( rule__Escribir__OperadorAssignment_2 ) ) ;
    public final void rule__Escribir__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3078:1: ( ( ( rule__Escribir__OperadorAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3079:1: ( ( rule__Escribir__OperadorAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3079:1: ( ( rule__Escribir__OperadorAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3080:1: ( rule__Escribir__OperadorAssignment_2 )
            {
             before(grammarAccess.getEscribirAccess().getOperadorAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3081:1: ( rule__Escribir__OperadorAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3081:2: rule__Escribir__OperadorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__OperadorAssignment_2_in_rule__Escribir__Group__2__Impl6447);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3091:1: rule__Escribir__Group__3 : rule__Escribir__Group__3__Impl rule__Escribir__Group__4 ;
    public final void rule__Escribir__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3095:1: ( rule__Escribir__Group__3__Impl rule__Escribir__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3096:2: rule__Escribir__Group__3__Impl rule__Escribir__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__3__Impl_in_rule__Escribir__Group__36477);
            rule__Escribir__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__4_in_rule__Escribir__Group__36480);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:1: rule__Escribir__Group__3__Impl : ( ( rule__Escribir__Group_3__0 )* ) ;
    public final void rule__Escribir__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3107:1: ( ( ( rule__Escribir__Group_3__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3108:1: ( ( rule__Escribir__Group_3__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3108:1: ( ( rule__Escribir__Group_3__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3109:1: ( rule__Escribir__Group_3__0 )*
            {
             before(grammarAccess.getEscribirAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3110:1: ( rule__Escribir__Group_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==48) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3110:2: rule__Escribir__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__0_in_rule__Escribir__Group__3__Impl6507);
            	    rule__Escribir__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3120:1: rule__Escribir__Group__4 : rule__Escribir__Group__4__Impl ;
    public final void rule__Escribir__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3124:1: ( rule__Escribir__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3125:2: rule__Escribir__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group__4__Impl_in_rule__Escribir__Group__46538);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3131:1: rule__Escribir__Group__4__Impl : ( ')' ) ;
    public final void rule__Escribir__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3135:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3136:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3136:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3137:1: ')'
            {
             before(grammarAccess.getEscribirAccess().getRightParenthesisKeyword_4()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Escribir__Group__4__Impl6566); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3160:1: rule__Escribir__Group_3__0 : rule__Escribir__Group_3__0__Impl rule__Escribir__Group_3__1 ;
    public final void rule__Escribir__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3164:1: ( rule__Escribir__Group_3__0__Impl rule__Escribir__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3165:2: rule__Escribir__Group_3__0__Impl rule__Escribir__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__0__Impl_in_rule__Escribir__Group_3__06607);
            rule__Escribir__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__1_in_rule__Escribir__Group_3__06610);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3172:1: rule__Escribir__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Escribir__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3176:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3177:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3177:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3178:1: ','
            {
             before(grammarAccess.getEscribirAccess().getCommaKeyword_3_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Escribir__Group_3__0__Impl6638); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3191:1: rule__Escribir__Group_3__1 : rule__Escribir__Group_3__1__Impl ;
    public final void rule__Escribir__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3195:1: ( rule__Escribir__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3196:2: rule__Escribir__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__Group_3__1__Impl_in_rule__Escribir__Group_3__16669);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3202:1: rule__Escribir__Group_3__1__Impl : ( ( rule__Escribir__OperadorAssignment_3_1 ) ) ;
    public final void rule__Escribir__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3206:1: ( ( ( rule__Escribir__OperadorAssignment_3_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3207:1: ( ( rule__Escribir__OperadorAssignment_3_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3207:1: ( ( rule__Escribir__OperadorAssignment_3_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3208:1: ( rule__Escribir__OperadorAssignment_3_1 )
            {
             before(grammarAccess.getEscribirAccess().getOperadorAssignment_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:1: ( rule__Escribir__OperadorAssignment_3_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:2: rule__Escribir__OperadorAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escribir__OperadorAssignment_3_1_in_rule__Escribir__Group_3__1__Impl6696);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3223:1: rule__Leer__Group__0 : rule__Leer__Group__0__Impl rule__Leer__Group__1 ;
    public final void rule__Leer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3227:1: ( rule__Leer__Group__0__Impl rule__Leer__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3228:2: rule__Leer__Group__0__Impl rule__Leer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__0__Impl_in_rule__Leer__Group__06730);
            rule__Leer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__1_in_rule__Leer__Group__06733);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3235:1: rule__Leer__Group__0__Impl : ( 'leer' ) ;
    public final void rule__Leer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3239:1: ( ( 'leer' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3240:1: ( 'leer' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3240:1: ( 'leer' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3241:1: 'leer'
            {
             before(grammarAccess.getLeerAccess().getLeerKeyword_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__Leer__Group__0__Impl6761); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3254:1: rule__Leer__Group__1 : rule__Leer__Group__1__Impl rule__Leer__Group__2 ;
    public final void rule__Leer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3258:1: ( rule__Leer__Group__1__Impl rule__Leer__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3259:2: rule__Leer__Group__1__Impl rule__Leer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__1__Impl_in_rule__Leer__Group__16792);
            rule__Leer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__2_in_rule__Leer__Group__16795);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3266:1: rule__Leer__Group__1__Impl : ( '(' ) ;
    public final void rule__Leer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3270:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3271:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3271:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3272:1: '('
            {
             before(grammarAccess.getLeerAccess().getLeftParenthesisKeyword_1()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Leer__Group__1__Impl6823); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3285:1: rule__Leer__Group__2 : rule__Leer__Group__2__Impl rule__Leer__Group__3 ;
    public final void rule__Leer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3289:1: ( rule__Leer__Group__2__Impl rule__Leer__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3290:2: rule__Leer__Group__2__Impl rule__Leer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__2__Impl_in_rule__Leer__Group__26854);
            rule__Leer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__3_in_rule__Leer__Group__26857);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3297:1: rule__Leer__Group__2__Impl : ( ( rule__Leer__VariableAssignment_2 ) ) ;
    public final void rule__Leer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3301:1: ( ( ( rule__Leer__VariableAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3302:1: ( ( rule__Leer__VariableAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3302:1: ( ( rule__Leer__VariableAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3303:1: ( rule__Leer__VariableAssignment_2 )
            {
             before(grammarAccess.getLeerAccess().getVariableAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3304:1: ( rule__Leer__VariableAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3304:2: rule__Leer__VariableAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__VariableAssignment_2_in_rule__Leer__Group__2__Impl6884);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3314:1: rule__Leer__Group__3 : rule__Leer__Group__3__Impl ;
    public final void rule__Leer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3318:1: ( rule__Leer__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3319:2: rule__Leer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Leer__Group__3__Impl_in_rule__Leer__Group__36914);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3325:1: rule__Leer__Group__3__Impl : ( ')' ) ;
    public final void rule__Leer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3329:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3330:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3330:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3331:1: ')'
            {
             before(grammarAccess.getLeerAccess().getRightParenthesisKeyword_3()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Leer__Group__3__Impl6942); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3352:1: rule__Si__Group__0 : rule__Si__Group__0__Impl rule__Si__Group__1 ;
    public final void rule__Si__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3356:1: ( rule__Si__Group__0__Impl rule__Si__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:2: rule__Si__Group__0__Impl rule__Si__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__0__Impl_in_rule__Si__Group__06981);
            rule__Si__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__1_in_rule__Si__Group__06984);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3364:1: rule__Si__Group__0__Impl : ( 'si' ) ;
    public final void rule__Si__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3368:1: ( ( 'si' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3369:1: ( 'si' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3369:1: ( 'si' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3370:1: 'si'
            {
             before(grammarAccess.getSiAccess().getSiKeyword_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Si__Group__0__Impl7012); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3383:1: rule__Si__Group__1 : rule__Si__Group__1__Impl rule__Si__Group__2 ;
    public final void rule__Si__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3387:1: ( rule__Si__Group__1__Impl rule__Si__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3388:2: rule__Si__Group__1__Impl rule__Si__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__1__Impl_in_rule__Si__Group__17043);
            rule__Si__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__2_in_rule__Si__Group__17046);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3395:1: rule__Si__Group__1__Impl : ( ( rule__Si__ValorAssignment_1 ) ) ;
    public final void rule__Si__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3399:1: ( ( ( rule__Si__ValorAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3400:1: ( ( rule__Si__ValorAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3400:1: ( ( rule__Si__ValorAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3401:1: ( rule__Si__ValorAssignment_1 )
            {
             before(grammarAccess.getSiAccess().getValorAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3402:1: ( rule__Si__ValorAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3402:2: rule__Si__ValorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__ValorAssignment_1_in_rule__Si__Group__1__Impl7073);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3412:1: rule__Si__Group__2 : rule__Si__Group__2__Impl rule__Si__Group__3 ;
    public final void rule__Si__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3416:1: ( rule__Si__Group__2__Impl rule__Si__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3417:2: rule__Si__Group__2__Impl rule__Si__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__2__Impl_in_rule__Si__Group__27103);
            rule__Si__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__3_in_rule__Si__Group__27106);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3424:1: rule__Si__Group__2__Impl : ( 'entonces' ) ;
    public final void rule__Si__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3428:1: ( ( 'entonces' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3429:1: ( 'entonces' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3429:1: ( 'entonces' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3430:1: 'entonces'
            {
             before(grammarAccess.getSiAccess().getEntoncesKeyword_2()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__Si__Group__2__Impl7134); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3443:1: rule__Si__Group__3 : rule__Si__Group__3__Impl rule__Si__Group__4 ;
    public final void rule__Si__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3447:1: ( rule__Si__Group__3__Impl rule__Si__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3448:2: rule__Si__Group__3__Impl rule__Si__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__3__Impl_in_rule__Si__Group__37165);
            rule__Si__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__4_in_rule__Si__Group__37168);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3455:1: rule__Si__Group__3__Impl : ( ( rule__Si__Group_3__0 )? ) ;
    public final void rule__Si__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3459:1: ( ( ( rule__Si__Group_3__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3460:1: ( ( rule__Si__Group_3__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3460:1: ( ( rule__Si__Group_3__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3461:1: ( rule__Si__Group_3__0 )?
            {
             before(grammarAccess.getSiAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3462:1: ( rule__Si__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||(LA28_0>=14 && LA28_0<=20)||(LA28_0>=54 && LA28_0<=56)||LA28_0==59||LA28_0==62||LA28_0==64) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3462:2: rule__Si__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__0_in_rule__Si__Group__3__Impl7195);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3472:1: rule__Si__Group__4 : rule__Si__Group__4__Impl rule__Si__Group__5 ;
    public final void rule__Si__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3476:1: ( rule__Si__Group__4__Impl rule__Si__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3477:2: rule__Si__Group__4__Impl rule__Si__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__4__Impl_in_rule__Si__Group__47226);
            rule__Si__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__5_in_rule__Si__Group__47229);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3484:1: rule__Si__Group__4__Impl : ( ( rule__Si__SinoAssignment_4 )? ) ;
    public final void rule__Si__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3488:1: ( ( ( rule__Si__SinoAssignment_4 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3489:1: ( ( rule__Si__SinoAssignment_4 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3489:1: ( ( rule__Si__SinoAssignment_4 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3490:1: ( rule__Si__SinoAssignment_4 )?
            {
             before(grammarAccess.getSiAccess().getSinoAssignment_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3491:1: ( rule__Si__SinoAssignment_4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==68) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3491:2: rule__Si__SinoAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Si__SinoAssignment_4_in_rule__Si__Group__4__Impl7256);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3501:1: rule__Si__Group__5 : rule__Si__Group__5__Impl ;
    public final void rule__Si__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3505:1: ( rule__Si__Group__5__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:2: rule__Si__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group__5__Impl_in_rule__Si__Group__57287);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3512:1: rule__Si__Group__5__Impl : ( 'fin si' ) ;
    public final void rule__Si__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3516:1: ( ( 'fin si' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3517:1: ( 'fin si' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3517:1: ( 'fin si' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3518:1: 'fin si'
            {
             before(grammarAccess.getSiAccess().getFinSiKeyword_5()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__Si__Group__5__Impl7315); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3543:1: rule__Si__Group_3__0 : rule__Si__Group_3__0__Impl rule__Si__Group_3__1 ;
    public final void rule__Si__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3547:1: ( rule__Si__Group_3__0__Impl rule__Si__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3548:2: rule__Si__Group_3__0__Impl rule__Si__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__0__Impl_in_rule__Si__Group_3__07358);
            rule__Si__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__1_in_rule__Si__Group_3__07361);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3555:1: rule__Si__Group_3__0__Impl : ( ( rule__Si__SentenciasAssignment_3_0 ) ) ;
    public final void rule__Si__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3559:1: ( ( ( rule__Si__SentenciasAssignment_3_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3560:1: ( ( rule__Si__SentenciasAssignment_3_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3560:1: ( ( rule__Si__SentenciasAssignment_3_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3561:1: ( rule__Si__SentenciasAssignment_3_0 )
            {
             before(grammarAccess.getSiAccess().getSentenciasAssignment_3_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3562:1: ( rule__Si__SentenciasAssignment_3_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3562:2: rule__Si__SentenciasAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__SentenciasAssignment_3_0_in_rule__Si__Group_3__0__Impl7388);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3572:1: rule__Si__Group_3__1 : rule__Si__Group_3__1__Impl ;
    public final void rule__Si__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3576:1: ( rule__Si__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3577:2: rule__Si__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Si__Group_3__1__Impl_in_rule__Si__Group_3__17418);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3583:1: rule__Si__Group_3__1__Impl : ( ( rule__Si__SentenciasAssignment_3_1 )* ) ;
    public final void rule__Si__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3587:1: ( ( ( rule__Si__SentenciasAssignment_3_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3588:1: ( ( rule__Si__SentenciasAssignment_3_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3588:1: ( ( rule__Si__SentenciasAssignment_3_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3589:1: ( rule__Si__SentenciasAssignment_3_1 )*
            {
             before(grammarAccess.getSiAccess().getSentenciasAssignment_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3590:1: ( rule__Si__SentenciasAssignment_3_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)||(LA30_0>=14 && LA30_0<=20)||(LA30_0>=54 && LA30_0<=56)||LA30_0==59||LA30_0==62||LA30_0==64) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3590:2: rule__Si__SentenciasAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Si__SentenciasAssignment_3_1_in_rule__Si__Group_3__1__Impl7445);
            	    rule__Si__SentenciasAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3604:1: rule__Mientras__Group__0 : rule__Mientras__Group__0__Impl rule__Mientras__Group__1 ;
    public final void rule__Mientras__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3608:1: ( rule__Mientras__Group__0__Impl rule__Mientras__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3609:2: rule__Mientras__Group__0__Impl rule__Mientras__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__0__Impl_in_rule__Mientras__Group__07480);
            rule__Mientras__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__1_in_rule__Mientras__Group__07483);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3616:1: rule__Mientras__Group__0__Impl : ( 'mientras' ) ;
    public final void rule__Mientras__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3620:1: ( ( 'mientras' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3621:1: ( 'mientras' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3621:1: ( 'mientras' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3622:1: 'mientras'
            {
             before(grammarAccess.getMientrasAccess().getMientrasKeyword_0()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__Mientras__Group__0__Impl7511); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3635:1: rule__Mientras__Group__1 : rule__Mientras__Group__1__Impl rule__Mientras__Group__2 ;
    public final void rule__Mientras__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3639:1: ( rule__Mientras__Group__1__Impl rule__Mientras__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3640:2: rule__Mientras__Group__1__Impl rule__Mientras__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__1__Impl_in_rule__Mientras__Group__17542);
            rule__Mientras__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__2_in_rule__Mientras__Group__17545);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3647:1: rule__Mientras__Group__1__Impl : ( ( rule__Mientras__ValorAssignment_1 ) ) ;
    public final void rule__Mientras__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3651:1: ( ( ( rule__Mientras__ValorAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3652:1: ( ( rule__Mientras__ValorAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3652:1: ( ( rule__Mientras__ValorAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3653:1: ( rule__Mientras__ValorAssignment_1 )
            {
             before(grammarAccess.getMientrasAccess().getValorAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3654:1: ( rule__Mientras__ValorAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3654:2: rule__Mientras__ValorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__ValorAssignment_1_in_rule__Mientras__Group__1__Impl7572);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3664:1: rule__Mientras__Group__2 : rule__Mientras__Group__2__Impl rule__Mientras__Group__3 ;
    public final void rule__Mientras__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3668:1: ( rule__Mientras__Group__2__Impl rule__Mientras__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3669:2: rule__Mientras__Group__2__Impl rule__Mientras__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__2__Impl_in_rule__Mientras__Group__27602);
            rule__Mientras__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__3_in_rule__Mientras__Group__27605);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3676:1: rule__Mientras__Group__2__Impl : ( 'hacer' ) ;
    public final void rule__Mientras__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3680:1: ( ( 'hacer' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3681:1: ( 'hacer' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3681:1: ( 'hacer' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3682:1: 'hacer'
            {
             before(grammarAccess.getMientrasAccess().getHacerKeyword_2()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__Mientras__Group__2__Impl7633); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3695:1: rule__Mientras__Group__3 : rule__Mientras__Group__3__Impl rule__Mientras__Group__4 ;
    public final void rule__Mientras__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3699:1: ( rule__Mientras__Group__3__Impl rule__Mientras__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3700:2: rule__Mientras__Group__3__Impl rule__Mientras__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__3__Impl_in_rule__Mientras__Group__37664);
            rule__Mientras__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__4_in_rule__Mientras__Group__37667);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:1: rule__Mientras__Group__3__Impl : ( ( rule__Mientras__Group_3__0 )? ) ;
    public final void rule__Mientras__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3711:1: ( ( ( rule__Mientras__Group_3__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3712:1: ( ( rule__Mientras__Group_3__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3712:1: ( ( rule__Mientras__Group_3__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3713:1: ( rule__Mientras__Group_3__0 )?
            {
             before(grammarAccess.getMientrasAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3714:1: ( rule__Mientras__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)||(LA31_0>=14 && LA31_0<=20)||(LA31_0>=54 && LA31_0<=56)||LA31_0==59||LA31_0==62||LA31_0==64) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3714:2: rule__Mientras__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__0_in_rule__Mientras__Group__3__Impl7694);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3724:1: rule__Mientras__Group__4 : rule__Mientras__Group__4__Impl ;
    public final void rule__Mientras__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3728:1: ( rule__Mientras__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3729:2: rule__Mientras__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group__4__Impl_in_rule__Mientras__Group__47725);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3735:1: rule__Mientras__Group__4__Impl : ( 'fin_mientras' ) ;
    public final void rule__Mientras__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3739:1: ( ( 'fin_mientras' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:1: ( 'fin_mientras' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:1: ( 'fin_mientras' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3741:1: 'fin_mientras'
            {
             before(grammarAccess.getMientrasAccess().getFin_mientrasKeyword_4()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__Mientras__Group__4__Impl7753); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3764:1: rule__Mientras__Group_3__0 : rule__Mientras__Group_3__0__Impl rule__Mientras__Group_3__1 ;
    public final void rule__Mientras__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3768:1: ( rule__Mientras__Group_3__0__Impl rule__Mientras__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3769:2: rule__Mientras__Group_3__0__Impl rule__Mientras__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__0__Impl_in_rule__Mientras__Group_3__07794);
            rule__Mientras__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__1_in_rule__Mientras__Group_3__07797);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3776:1: rule__Mientras__Group_3__0__Impl : ( ( rule__Mientras__SentenciasAssignment_3_0 ) ) ;
    public final void rule__Mientras__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3780:1: ( ( ( rule__Mientras__SentenciasAssignment_3_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3781:1: ( ( rule__Mientras__SentenciasAssignment_3_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3781:1: ( ( rule__Mientras__SentenciasAssignment_3_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3782:1: ( rule__Mientras__SentenciasAssignment_3_0 )
            {
             before(grammarAccess.getMientrasAccess().getSentenciasAssignment_3_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3783:1: ( rule__Mientras__SentenciasAssignment_3_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3783:2: rule__Mientras__SentenciasAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__SentenciasAssignment_3_0_in_rule__Mientras__Group_3__0__Impl7824);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3793:1: rule__Mientras__Group_3__1 : rule__Mientras__Group_3__1__Impl ;
    public final void rule__Mientras__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3797:1: ( rule__Mientras__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3798:2: rule__Mientras__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mientras__Group_3__1__Impl_in_rule__Mientras__Group_3__17854);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3804:1: rule__Mientras__Group_3__1__Impl : ( ( rule__Mientras__SentenciasAssignment_3_1 )* ) ;
    public final void rule__Mientras__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3808:1: ( ( ( rule__Mientras__SentenciasAssignment_3_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3809:1: ( ( rule__Mientras__SentenciasAssignment_3_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3809:1: ( ( rule__Mientras__SentenciasAssignment_3_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3810:1: ( rule__Mientras__SentenciasAssignment_3_1 )*
            {
             before(grammarAccess.getMientrasAccess().getSentenciasAssignment_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3811:1: ( rule__Mientras__SentenciasAssignment_3_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)||(LA32_0>=14 && LA32_0<=20)||(LA32_0>=54 && LA32_0<=56)||LA32_0==59||LA32_0==62||LA32_0==64) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3811:2: rule__Mientras__SentenciasAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Mientras__SentenciasAssignment_3_1_in_rule__Mientras__Group_3__1__Impl7881);
            	    rule__Mientras__SentenciasAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3825:1: rule__Repetir__Group__0 : rule__Repetir__Group__0__Impl rule__Repetir__Group__1 ;
    public final void rule__Repetir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3829:1: ( rule__Repetir__Group__0__Impl rule__Repetir__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3830:2: rule__Repetir__Group__0__Impl rule__Repetir__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__0__Impl_in_rule__Repetir__Group__07916);
            rule__Repetir__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__1_in_rule__Repetir__Group__07919);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3837:1: rule__Repetir__Group__0__Impl : ( 'repetir' ) ;
    public final void rule__Repetir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3841:1: ( ( 'repetir' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3842:1: ( 'repetir' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3842:1: ( 'repetir' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3843:1: 'repetir'
            {
             before(grammarAccess.getRepetirAccess().getRepetirKeyword_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__Repetir__Group__0__Impl7947); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3856:1: rule__Repetir__Group__1 : rule__Repetir__Group__1__Impl rule__Repetir__Group__2 ;
    public final void rule__Repetir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3860:1: ( rule__Repetir__Group__1__Impl rule__Repetir__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3861:2: rule__Repetir__Group__1__Impl rule__Repetir__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__1__Impl_in_rule__Repetir__Group__17978);
            rule__Repetir__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__2_in_rule__Repetir__Group__17981);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3868:1: rule__Repetir__Group__1__Impl : ( ( rule__Repetir__Group_1__0 )? ) ;
    public final void rule__Repetir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3872:1: ( ( ( rule__Repetir__Group_1__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3873:1: ( ( rule__Repetir__Group_1__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3873:1: ( ( rule__Repetir__Group_1__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3874:1: ( rule__Repetir__Group_1__0 )?
            {
             before(grammarAccess.getRepetirAccess().getGroup_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3875:1: ( rule__Repetir__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_ID)||(LA33_0>=14 && LA33_0<=20)||(LA33_0>=54 && LA33_0<=56)||LA33_0==59||LA33_0==62||LA33_0==64) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3875:2: rule__Repetir__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__0_in_rule__Repetir__Group__1__Impl8008);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3885:1: rule__Repetir__Group__2 : rule__Repetir__Group__2__Impl rule__Repetir__Group__3 ;
    public final void rule__Repetir__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3889:1: ( rule__Repetir__Group__2__Impl rule__Repetir__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3890:2: rule__Repetir__Group__2__Impl rule__Repetir__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__2__Impl_in_rule__Repetir__Group__28039);
            rule__Repetir__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__3_in_rule__Repetir__Group__28042);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3897:1: rule__Repetir__Group__2__Impl : ( 'hasta_que' ) ;
    public final void rule__Repetir__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3901:1: ( ( 'hasta_que' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3902:1: ( 'hasta_que' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3902:1: ( 'hasta_que' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3903:1: 'hasta_que'
            {
             before(grammarAccess.getRepetirAccess().getHasta_queKeyword_2()); 
            match(input,63,FollowSets000.FOLLOW_63_in_rule__Repetir__Group__2__Impl8070); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3916:1: rule__Repetir__Group__3 : rule__Repetir__Group__3__Impl ;
    public final void rule__Repetir__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3920:1: ( rule__Repetir__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3921:2: rule__Repetir__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group__3__Impl_in_rule__Repetir__Group__38101);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3927:1: rule__Repetir__Group__3__Impl : ( ( rule__Repetir__ValorAssignment_3 ) ) ;
    public final void rule__Repetir__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3931:1: ( ( ( rule__Repetir__ValorAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3932:1: ( ( rule__Repetir__ValorAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3932:1: ( ( rule__Repetir__ValorAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3933:1: ( rule__Repetir__ValorAssignment_3 )
            {
             before(grammarAccess.getRepetirAccess().getValorAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3934:1: ( rule__Repetir__ValorAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3934:2: rule__Repetir__ValorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__ValorAssignment_3_in_rule__Repetir__Group__3__Impl8128);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3952:1: rule__Repetir__Group_1__0 : rule__Repetir__Group_1__0__Impl rule__Repetir__Group_1__1 ;
    public final void rule__Repetir__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3956:1: ( rule__Repetir__Group_1__0__Impl rule__Repetir__Group_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3957:2: rule__Repetir__Group_1__0__Impl rule__Repetir__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__0__Impl_in_rule__Repetir__Group_1__08166);
            rule__Repetir__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__1_in_rule__Repetir__Group_1__08169);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3964:1: rule__Repetir__Group_1__0__Impl : ( ( rule__Repetir__SentenciasAssignment_1_0 ) ) ;
    public final void rule__Repetir__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3968:1: ( ( ( rule__Repetir__SentenciasAssignment_1_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3969:1: ( ( rule__Repetir__SentenciasAssignment_1_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3969:1: ( ( rule__Repetir__SentenciasAssignment_1_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3970:1: ( rule__Repetir__SentenciasAssignment_1_0 )
            {
             before(grammarAccess.getRepetirAccess().getSentenciasAssignment_1_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3971:1: ( rule__Repetir__SentenciasAssignment_1_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3971:2: rule__Repetir__SentenciasAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__SentenciasAssignment_1_0_in_rule__Repetir__Group_1__0__Impl8196);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3981:1: rule__Repetir__Group_1__1 : rule__Repetir__Group_1__1__Impl ;
    public final void rule__Repetir__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3985:1: ( rule__Repetir__Group_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3986:2: rule__Repetir__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repetir__Group_1__1__Impl_in_rule__Repetir__Group_1__18226);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3992:1: rule__Repetir__Group_1__1__Impl : ( ( rule__Repetir__SentenciasAssignment_1_1 )* ) ;
    public final void rule__Repetir__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3996:1: ( ( ( rule__Repetir__SentenciasAssignment_1_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3997:1: ( ( rule__Repetir__SentenciasAssignment_1_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3997:1: ( ( rule__Repetir__SentenciasAssignment_1_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3998:1: ( rule__Repetir__SentenciasAssignment_1_1 )*
            {
             before(grammarAccess.getRepetirAccess().getSentenciasAssignment_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3999:1: ( rule__Repetir__SentenciasAssignment_1_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)||(LA34_0>=14 && LA34_0<=20)||(LA34_0>=54 && LA34_0<=56)||LA34_0==59||LA34_0==62||LA34_0==64) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3999:2: rule__Repetir__SentenciasAssignment_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Repetir__SentenciasAssignment_1_1_in_rule__Repetir__Group_1__1__Impl8253);
            	    rule__Repetir__SentenciasAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4013:1: rule__Desde__Group__0 : rule__Desde__Group__0__Impl rule__Desde__Group__1 ;
    public final void rule__Desde__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4017:1: ( rule__Desde__Group__0__Impl rule__Desde__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4018:2: rule__Desde__Group__0__Impl rule__Desde__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__0__Impl_in_rule__Desde__Group__08288);
            rule__Desde__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__1_in_rule__Desde__Group__08291);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4025:1: rule__Desde__Group__0__Impl : ( 'desde' ) ;
    public final void rule__Desde__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4029:1: ( ( 'desde' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4030:1: ( 'desde' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4030:1: ( 'desde' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4031:1: 'desde'
            {
             before(grammarAccess.getDesdeAccess().getDesdeKeyword_0()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__Desde__Group__0__Impl8319); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4044:1: rule__Desde__Group__1 : rule__Desde__Group__1__Impl rule__Desde__Group__2 ;
    public final void rule__Desde__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4048:1: ( rule__Desde__Group__1__Impl rule__Desde__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4049:2: rule__Desde__Group__1__Impl rule__Desde__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__1__Impl_in_rule__Desde__Group__18350);
            rule__Desde__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__2_in_rule__Desde__Group__18353);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4056:1: rule__Desde__Group__1__Impl : ( ( rule__Desde__AsignacionAssignment_1 ) ) ;
    public final void rule__Desde__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4060:1: ( ( ( rule__Desde__AsignacionAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4061:1: ( ( rule__Desde__AsignacionAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4061:1: ( ( rule__Desde__AsignacionAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4062:1: ( rule__Desde__AsignacionAssignment_1 )
            {
             before(grammarAccess.getDesdeAccess().getAsignacionAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4063:1: ( rule__Desde__AsignacionAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4063:2: rule__Desde__AsignacionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__AsignacionAssignment_1_in_rule__Desde__Group__1__Impl8380);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4073:1: rule__Desde__Group__2 : rule__Desde__Group__2__Impl rule__Desde__Group__3 ;
    public final void rule__Desde__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4077:1: ( rule__Desde__Group__2__Impl rule__Desde__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4078:2: rule__Desde__Group__2__Impl rule__Desde__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__2__Impl_in_rule__Desde__Group__28410);
            rule__Desde__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__3_in_rule__Desde__Group__28413);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4085:1: rule__Desde__Group__2__Impl : ( 'hasta' ) ;
    public final void rule__Desde__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4089:1: ( ( 'hasta' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4090:1: ( 'hasta' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4090:1: ( 'hasta' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4091:1: 'hasta'
            {
             before(grammarAccess.getDesdeAccess().getHastaKeyword_2()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__Desde__Group__2__Impl8441); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4104:1: rule__Desde__Group__3 : rule__Desde__Group__3__Impl rule__Desde__Group__4 ;
    public final void rule__Desde__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4108:1: ( rule__Desde__Group__3__Impl rule__Desde__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4109:2: rule__Desde__Group__3__Impl rule__Desde__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__3__Impl_in_rule__Desde__Group__38472);
            rule__Desde__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__4_in_rule__Desde__Group__38475);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4116:1: rule__Desde__Group__3__Impl : ( ( rule__Desde__ValorAssignment_3 ) ) ;
    public final void rule__Desde__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4120:1: ( ( ( rule__Desde__ValorAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4121:1: ( ( rule__Desde__ValorAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4121:1: ( ( rule__Desde__ValorAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4122:1: ( rule__Desde__ValorAssignment_3 )
            {
             before(grammarAccess.getDesdeAccess().getValorAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4123:1: ( rule__Desde__ValorAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4123:2: rule__Desde__ValorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__ValorAssignment_3_in_rule__Desde__Group__3__Impl8502);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4133:1: rule__Desde__Group__4 : rule__Desde__Group__4__Impl rule__Desde__Group__5 ;
    public final void rule__Desde__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4137:1: ( rule__Desde__Group__4__Impl rule__Desde__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4138:2: rule__Desde__Group__4__Impl rule__Desde__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__4__Impl_in_rule__Desde__Group__48532);
            rule__Desde__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__5_in_rule__Desde__Group__48535);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4145:1: rule__Desde__Group__4__Impl : ( 'hacer' ) ;
    public final void rule__Desde__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4149:1: ( ( 'hacer' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4150:1: ( 'hacer' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4150:1: ( 'hacer' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4151:1: 'hacer'
            {
             before(grammarAccess.getDesdeAccess().getHacerKeyword_4()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__Desde__Group__4__Impl8563); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4164:1: rule__Desde__Group__5 : rule__Desde__Group__5__Impl rule__Desde__Group__6 ;
    public final void rule__Desde__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:1: ( rule__Desde__Group__5__Impl rule__Desde__Group__6 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4169:2: rule__Desde__Group__5__Impl rule__Desde__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__5__Impl_in_rule__Desde__Group__58594);
            rule__Desde__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__6_in_rule__Desde__Group__58597);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4176:1: rule__Desde__Group__5__Impl : ( ( rule__Desde__Group_5__0 )? ) ;
    public final void rule__Desde__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4180:1: ( ( ( rule__Desde__Group_5__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4181:1: ( ( rule__Desde__Group_5__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4181:1: ( ( rule__Desde__Group_5__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4182:1: ( rule__Desde__Group_5__0 )?
            {
             before(grammarAccess.getDesdeAccess().getGroup_5()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4183:1: ( rule__Desde__Group_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_ID)||(LA35_0>=14 && LA35_0<=20)||(LA35_0>=54 && LA35_0<=56)||LA35_0==59||LA35_0==62||LA35_0==64) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4183:2: rule__Desde__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__0_in_rule__Desde__Group__5__Impl8624);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4193:1: rule__Desde__Group__6 : rule__Desde__Group__6__Impl ;
    public final void rule__Desde__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4197:1: ( rule__Desde__Group__6__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4198:2: rule__Desde__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group__6__Impl_in_rule__Desde__Group__68655);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4204:1: rule__Desde__Group__6__Impl : ( 'fin_desde' ) ;
    public final void rule__Desde__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4208:1: ( ( 'fin_desde' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4209:1: ( 'fin_desde' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4209:1: ( 'fin_desde' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4210:1: 'fin_desde'
            {
             before(grammarAccess.getDesdeAccess().getFin_desdeKeyword_6()); 
            match(input,66,FollowSets000.FOLLOW_66_in_rule__Desde__Group__6__Impl8683); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4237:1: rule__Desde__Group_5__0 : rule__Desde__Group_5__0__Impl rule__Desde__Group_5__1 ;
    public final void rule__Desde__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4241:1: ( rule__Desde__Group_5__0__Impl rule__Desde__Group_5__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4242:2: rule__Desde__Group_5__0__Impl rule__Desde__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__0__Impl_in_rule__Desde__Group_5__08728);
            rule__Desde__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__1_in_rule__Desde__Group_5__08731);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4249:1: rule__Desde__Group_5__0__Impl : ( ( rule__Desde__SentenciasAssignment_5_0 ) ) ;
    public final void rule__Desde__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4253:1: ( ( ( rule__Desde__SentenciasAssignment_5_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4254:1: ( ( rule__Desde__SentenciasAssignment_5_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4254:1: ( ( rule__Desde__SentenciasAssignment_5_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4255:1: ( rule__Desde__SentenciasAssignment_5_0 )
            {
             before(grammarAccess.getDesdeAccess().getSentenciasAssignment_5_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4256:1: ( rule__Desde__SentenciasAssignment_5_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4256:2: rule__Desde__SentenciasAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__SentenciasAssignment_5_0_in_rule__Desde__Group_5__0__Impl8758);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4266:1: rule__Desde__Group_5__1 : rule__Desde__Group_5__1__Impl ;
    public final void rule__Desde__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4270:1: ( rule__Desde__Group_5__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4271:2: rule__Desde__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Desde__Group_5__1__Impl_in_rule__Desde__Group_5__18788);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4277:1: rule__Desde__Group_5__1__Impl : ( ( rule__Desde__SentenciasAssignment_5_1 )* ) ;
    public final void rule__Desde__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4281:1: ( ( ( rule__Desde__SentenciasAssignment_5_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4282:1: ( ( rule__Desde__SentenciasAssignment_5_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4282:1: ( ( rule__Desde__SentenciasAssignment_5_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4283:1: ( rule__Desde__SentenciasAssignment_5_1 )*
            {
             before(grammarAccess.getDesdeAccess().getSentenciasAssignment_5_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4284:1: ( rule__Desde__SentenciasAssignment_5_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_ID)||(LA36_0>=14 && LA36_0<=20)||(LA36_0>=54 && LA36_0<=56)||LA36_0==59||LA36_0==62||LA36_0==64) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4284:2: rule__Desde__SentenciasAssignment_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Desde__SentenciasAssignment_5_1_in_rule__Desde__Group_5__1__Impl8815);
            	    rule__Desde__SentenciasAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4298:1: rule__Incremento__Group__0 : rule__Incremento__Group__0__Impl rule__Incremento__Group__1 ;
    public final void rule__Incremento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4302:1: ( rule__Incremento__Group__0__Impl rule__Incremento__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4303:2: rule__Incremento__Group__0__Impl rule__Incremento__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__Group__0__Impl_in_rule__Incremento__Group__08850);
            rule__Incremento__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Incremento__Group__1_in_rule__Incremento__Group__08853);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4310:1: rule__Incremento__Group__0__Impl : ( ( rule__Incremento__NombreAssignment_0 ) ) ;
    public final void rule__Incremento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4314:1: ( ( ( rule__Incremento__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4315:1: ( ( rule__Incremento__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4315:1: ( ( rule__Incremento__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4316:1: ( rule__Incremento__NombreAssignment_0 )
            {
             before(grammarAccess.getIncrementoAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4317:1: ( rule__Incremento__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4317:2: rule__Incremento__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__NombreAssignment_0_in_rule__Incremento__Group__0__Impl8880);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4327:1: rule__Incremento__Group__1 : rule__Incremento__Group__1__Impl ;
    public final void rule__Incremento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4331:1: ( rule__Incremento__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4332:2: rule__Incremento__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__Group__1__Impl_in_rule__Incremento__Group__18910);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4338:1: rule__Incremento__Group__1__Impl : ( ( rule__Incremento__SsignoAssignment_1 ) ) ;
    public final void rule__Incremento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4342:1: ( ( ( rule__Incremento__SsignoAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4343:1: ( ( rule__Incremento__SsignoAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4343:1: ( ( rule__Incremento__SsignoAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4344:1: ( rule__Incremento__SsignoAssignment_1 )
            {
             before(grammarAccess.getIncrementoAccess().getSsignoAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4345:1: ( rule__Incremento__SsignoAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4345:2: rule__Incremento__SsignoAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Incremento__SsignoAssignment_1_in_rule__Incremento__Group__1__Impl8937);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4359:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4363:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4364:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__08971);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__08974);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4371:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NombreAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4375:1: ( ( ( rule__Variable__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4376:1: ( ( rule__Variable__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4376:1: ( ( rule__Variable__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4377:1: ( rule__Variable__NombreAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4378:1: ( rule__Variable__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4378:2: rule__Variable__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__NombreAssignment_0_in_rule__Variable__Group__0__Impl9001);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4388:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4392:1: ( rule__Variable__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4393:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__19031);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4399:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__MatAssignment_1 )* ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4403:1: ( ( ( rule__Variable__MatAssignment_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4404:1: ( ( rule__Variable__MatAssignment_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4404:1: ( ( rule__Variable__MatAssignment_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4405:1: ( rule__Variable__MatAssignment_1 )*
            {
             before(grammarAccess.getVariableAccess().getMatAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4406:1: ( rule__Variable__MatAssignment_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_MATRIZ) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4406:2: rule__Variable__MatAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Variable__MatAssignment_1_in_rule__Variable__Group__1__Impl9058);
            	    rule__Variable__MatAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4420:1: rule__VariableID__Group__0 : rule__VariableID__Group__0__Impl rule__VariableID__Group__1 ;
    public final void rule__VariableID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4424:1: ( rule__VariableID__Group__0__Impl rule__VariableID__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4425:2: rule__VariableID__Group__0__Impl rule__VariableID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__0__Impl_in_rule__VariableID__Group__09093);
            rule__VariableID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__1_in_rule__VariableID__Group__09096);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4432:1: rule__VariableID__Group__0__Impl : ( ( rule__VariableID__NombreAssignment_0 ) ) ;
    public final void rule__VariableID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4436:1: ( ( ( rule__VariableID__NombreAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4437:1: ( ( rule__VariableID__NombreAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4437:1: ( ( rule__VariableID__NombreAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4438:1: ( rule__VariableID__NombreAssignment_0 )
            {
             before(grammarAccess.getVariableIDAccess().getNombreAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4439:1: ( rule__VariableID__NombreAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4439:2: rule__VariableID__NombreAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__NombreAssignment_0_in_rule__VariableID__Group__0__Impl9123);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4449:1: rule__VariableID__Group__1 : rule__VariableID__Group__1__Impl ;
    public final void rule__VariableID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4453:1: ( rule__VariableID__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4454:2: rule__VariableID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__1__Impl_in_rule__VariableID__Group__19153);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4460:1: rule__VariableID__Group__1__Impl : ( ( rule__VariableID__MatAssignment_1 )* ) ;
    public final void rule__VariableID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4464:1: ( ( ( rule__VariableID__MatAssignment_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4465:1: ( ( rule__VariableID__MatAssignment_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4465:1: ( ( rule__VariableID__MatAssignment_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4466:1: ( rule__VariableID__MatAssignment_1 )*
            {
             before(grammarAccess.getVariableIDAccess().getMatAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4467:1: ( rule__VariableID__MatAssignment_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_MATRIZ) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4467:2: rule__VariableID__MatAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__VariableID__MatAssignment_1_in_rule__VariableID__Group__1__Impl9180);
            	    rule__VariableID__MatAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4481:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4485:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4486:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__09215);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__09218);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4493:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4497:1: ( ( ( '-' )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4498:1: ( ( '-' )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4498:1: ( ( '-' )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4499:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4500:1: ( '-' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==31) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4501:2: '-'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__EInt__Group__0__Impl9247); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4512:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4516:1: ( rule__EInt__Group__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4517:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__19280);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4523:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4527:1: ( ( RULE_INT ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4528:1: ( RULE_INT )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4528:1: ( RULE_INT )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4529:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl9307); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4544:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4548:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4549:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__09340);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__09343);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4556:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4560:1: ( ( ( '-' )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4561:1: ( ( '-' )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4561:1: ( ( '-' )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4562:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4563:1: ( '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==31) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4564:2: '-'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__EFloat__Group__0__Impl9372); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4575:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4579:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4580:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__19405);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__19408);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4587:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4591:1: ( ( ( RULE_INT )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4592:1: ( ( RULE_INT )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4592:1: ( ( RULE_INT )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4593:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4594:1: ( RULE_INT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4594:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl9436); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4604:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4608:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4609:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__29467);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__29470);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4616:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4620:1: ( ( '.' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4621:1: ( '.' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4621:1: ( '.' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4622:1: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,67,FollowSets000.FOLLOW_67_in_rule__EFloat__Group__2__Impl9498); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4635:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4639:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4640:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__39529);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__39532);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4647:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4651:1: ( ( RULE_INT ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4652:1: ( RULE_INT )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4652:1: ( RULE_INT )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4653:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl9559); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4664:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4668:1: ( rule__EFloat__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4669:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__49588);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4675:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4679:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4680:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4680:1: ( ( rule__EFloat__Group_4__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4681:1: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4682:1: ( rule__EFloat__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=26 && LA42_0<=27)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4682:2: rule__EFloat__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl9615);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4702:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4706:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4707:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__09656);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__09659);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4714:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4718:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4719:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4719:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4720:1: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4721:1: ( rule__EFloat__Alternatives_4_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4721:2: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl9686);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4731:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4735:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4736:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__19716);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__19719);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4743:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4747:1: ( ( ( '-' )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4748:1: ( ( '-' )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4748:1: ( ( '-' )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4749:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4750:1: ( '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==31) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4751:2: '-'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__EFloat__Group_4__1__Impl9748); 

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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4762:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4766:1: ( rule__EFloat__Group_4__2__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4767:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__29781);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4773:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4777:1: ( ( RULE_INT ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4778:1: ( RULE_INT )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4778:1: ( RULE_INT )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4779:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl9808); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4796:1: rule__Operacion__Group__0 : rule__Operacion__Group__0__Impl rule__Operacion__Group__1 ;
    public final void rule__Operacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4800:1: ( rule__Operacion__Group__0__Impl rule__Operacion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4801:2: rule__Operacion__Group__0__Impl rule__Operacion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__0__Impl_in_rule__Operacion__Group__09843);
            rule__Operacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__1_in_rule__Operacion__Group__09846);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4808:1: rule__Operacion__Group__0__Impl : ( '(' ) ;
    public final void rule__Operacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4812:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4813:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4813:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4814:1: '('
            {
             before(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Operacion__Group__0__Impl9874); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4827:1: rule__Operacion__Group__1 : rule__Operacion__Group__1__Impl rule__Operacion__Group__2 ;
    public final void rule__Operacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4831:1: ( rule__Operacion__Group__1__Impl rule__Operacion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4832:2: rule__Operacion__Group__1__Impl rule__Operacion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__1__Impl_in_rule__Operacion__Group__19905);
            rule__Operacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__2_in_rule__Operacion__Group__19908);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4839:1: rule__Operacion__Group__1__Impl : ( ( rule__Operacion__Op_izqAssignment_1 ) ) ;
    public final void rule__Operacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4843:1: ( ( ( rule__Operacion__Op_izqAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4844:1: ( ( rule__Operacion__Op_izqAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4844:1: ( ( rule__Operacion__Op_izqAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4845:1: ( rule__Operacion__Op_izqAssignment_1 )
            {
             before(grammarAccess.getOperacionAccess().getOp_izqAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4846:1: ( rule__Operacion__Op_izqAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4846:2: rule__Operacion__Op_izqAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Op_izqAssignment_1_in_rule__Operacion__Group__1__Impl9935);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4856:1: rule__Operacion__Group__2 : rule__Operacion__Group__2__Impl rule__Operacion__Group__3 ;
    public final void rule__Operacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4860:1: ( rule__Operacion__Group__2__Impl rule__Operacion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4861:2: rule__Operacion__Group__2__Impl rule__Operacion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__2__Impl_in_rule__Operacion__Group__29965);
            rule__Operacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__3_in_rule__Operacion__Group__29968);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4868:1: rule__Operacion__Group__2__Impl : ( ( rule__Operacion__Signo_opAssignment_2 ) ) ;
    public final void rule__Operacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4872:1: ( ( ( rule__Operacion__Signo_opAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4873:1: ( ( rule__Operacion__Signo_opAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4873:1: ( ( rule__Operacion__Signo_opAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4874:1: ( rule__Operacion__Signo_opAssignment_2 )
            {
             before(grammarAccess.getOperacionAccess().getSigno_opAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4875:1: ( rule__Operacion__Signo_opAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4875:2: rule__Operacion__Signo_opAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Signo_opAssignment_2_in_rule__Operacion__Group__2__Impl9995);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4885:1: rule__Operacion__Group__3 : rule__Operacion__Group__3__Impl rule__Operacion__Group__4 ;
    public final void rule__Operacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4889:1: ( rule__Operacion__Group__3__Impl rule__Operacion__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4890:2: rule__Operacion__Group__3__Impl rule__Operacion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__3__Impl_in_rule__Operacion__Group__310025);
            rule__Operacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__4_in_rule__Operacion__Group__310028);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4897:1: rule__Operacion__Group__3__Impl : ( ( rule__Operacion__Op_derAssignment_3 ) ) ;
    public final void rule__Operacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4901:1: ( ( ( rule__Operacion__Op_derAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4902:1: ( ( rule__Operacion__Op_derAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4902:1: ( ( rule__Operacion__Op_derAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4903:1: ( rule__Operacion__Op_derAssignment_3 )
            {
             before(grammarAccess.getOperacionAccess().getOp_derAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4904:1: ( rule__Operacion__Op_derAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4904:2: rule__Operacion__Op_derAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Op_derAssignment_3_in_rule__Operacion__Group__3__Impl10055);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4914:1: rule__Operacion__Group__4 : rule__Operacion__Group__4__Impl ;
    public final void rule__Operacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4918:1: ( rule__Operacion__Group__4__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4919:2: rule__Operacion__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operacion__Group__4__Impl_in_rule__Operacion__Group__410085);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4925:1: rule__Operacion__Group__4__Impl : ( ')' ) ;
    public final void rule__Operacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4929:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4930:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4930:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4931:1: ')'
            {
             before(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_4()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Operacion__Group__4__Impl10113); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4954:1: rule__Sino__Group__0 : rule__Sino__Group__0__Impl rule__Sino__Group__1 ;
    public final void rule__Sino__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4958:1: ( rule__Sino__Group__0__Impl rule__Sino__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4959:2: rule__Sino__Group__0__Impl rule__Sino__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__0__Impl_in_rule__Sino__Group__010154);
            rule__Sino__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__1_in_rule__Sino__Group__010157);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4966:1: rule__Sino__Group__0__Impl : ( () ) ;
    public final void rule__Sino__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4970:1: ( ( () ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4971:1: ( () )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4971:1: ( () )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4972:1: ()
            {
             before(grammarAccess.getSinoAccess().getSinoAction_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4973:1: ()
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4975:1: 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4985:1: rule__Sino__Group__1 : rule__Sino__Group__1__Impl rule__Sino__Group__2 ;
    public final void rule__Sino__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4989:1: ( rule__Sino__Group__1__Impl rule__Sino__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4990:2: rule__Sino__Group__1__Impl rule__Sino__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__1__Impl_in_rule__Sino__Group__110215);
            rule__Sino__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__2_in_rule__Sino__Group__110218);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4997:1: rule__Sino__Group__1__Impl : ( 'sino' ) ;
    public final void rule__Sino__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5001:1: ( ( 'sino' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5002:1: ( 'sino' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5002:1: ( 'sino' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5003:1: 'sino'
            {
             before(grammarAccess.getSinoAccess().getSinoKeyword_1()); 
            match(input,68,FollowSets000.FOLLOW_68_in_rule__Sino__Group__1__Impl10246); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5016:1: rule__Sino__Group__2 : rule__Sino__Group__2__Impl ;
    public final void rule__Sino__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5020:1: ( rule__Sino__Group__2__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5021:2: rule__Sino__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group__2__Impl_in_rule__Sino__Group__210277);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5027:1: rule__Sino__Group__2__Impl : ( ( rule__Sino__Group_2__0 )? ) ;
    public final void rule__Sino__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5031:1: ( ( ( rule__Sino__Group_2__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5032:1: ( ( rule__Sino__Group_2__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5032:1: ( ( rule__Sino__Group_2__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5033:1: ( rule__Sino__Group_2__0 )?
            {
             before(grammarAccess.getSinoAccess().getGroup_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5034:1: ( rule__Sino__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_ID)||(LA44_0>=14 && LA44_0<=20)||(LA44_0>=54 && LA44_0<=56)||LA44_0==59||LA44_0==62||LA44_0==64) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5034:2: rule__Sino__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__0_in_rule__Sino__Group__2__Impl10304);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5050:1: rule__Sino__Group_2__0 : rule__Sino__Group_2__0__Impl rule__Sino__Group_2__1 ;
    public final void rule__Sino__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5054:1: ( rule__Sino__Group_2__0__Impl rule__Sino__Group_2__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5055:2: rule__Sino__Group_2__0__Impl rule__Sino__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__0__Impl_in_rule__Sino__Group_2__010341);
            rule__Sino__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__1_in_rule__Sino__Group_2__010344);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5062:1: rule__Sino__Group_2__0__Impl : ( ( rule__Sino__SentenciasAssignment_2_0 ) ) ;
    public final void rule__Sino__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5066:1: ( ( ( rule__Sino__SentenciasAssignment_2_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5067:1: ( ( rule__Sino__SentenciasAssignment_2_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5067:1: ( ( rule__Sino__SentenciasAssignment_2_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5068:1: ( rule__Sino__SentenciasAssignment_2_0 )
            {
             before(grammarAccess.getSinoAccess().getSentenciasAssignment_2_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5069:1: ( rule__Sino__SentenciasAssignment_2_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5069:2: rule__Sino__SentenciasAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__SentenciasAssignment_2_0_in_rule__Sino__Group_2__0__Impl10371);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5079:1: rule__Sino__Group_2__1 : rule__Sino__Group_2__1__Impl ;
    public final void rule__Sino__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5083:1: ( rule__Sino__Group_2__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5084:2: rule__Sino__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sino__Group_2__1__Impl_in_rule__Sino__Group_2__110401);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5090:1: rule__Sino__Group_2__1__Impl : ( ( rule__Sino__SentenciasAssignment_2_1 )* ) ;
    public final void rule__Sino__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5094:1: ( ( ( rule__Sino__SentenciasAssignment_2_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5095:1: ( ( rule__Sino__SentenciasAssignment_2_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5095:1: ( ( rule__Sino__SentenciasAssignment_2_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5096:1: ( rule__Sino__SentenciasAssignment_2_1 )*
            {
             before(grammarAccess.getSinoAccess().getSentenciasAssignment_2_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5097:1: ( rule__Sino__SentenciasAssignment_2_1 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)||(LA45_0>=14 && LA45_0<=20)||(LA45_0>=54 && LA45_0<=56)||LA45_0==59||LA45_0==62||LA45_0==64) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5097:2: rule__Sino__SentenciasAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Sino__SentenciasAssignment_2_1_in_rule__Sino__Group_2__1__Impl10428);
            	    rule__Sino__SentenciasAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5111:1: rule__ParametroFuncion__Group__0 : rule__ParametroFuncion__Group__0__Impl rule__ParametroFuncion__Group__1 ;
    public final void rule__ParametroFuncion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5115:1: ( rule__ParametroFuncion__Group__0__Impl rule__ParametroFuncion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5116:2: rule__ParametroFuncion__Group__0__Impl rule__ParametroFuncion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__0__Impl_in_rule__ParametroFuncion__Group__010463);
            rule__ParametroFuncion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__1_in_rule__ParametroFuncion__Group__010466);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5123:1: rule__ParametroFuncion__Group__0__Impl : ( ( rule__ParametroFuncion__PasoAssignment_0 ) ) ;
    public final void rule__ParametroFuncion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5127:1: ( ( ( rule__ParametroFuncion__PasoAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5128:1: ( ( rule__ParametroFuncion__PasoAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5128:1: ( ( rule__ParametroFuncion__PasoAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5129:1: ( rule__ParametroFuncion__PasoAssignment_0 )
            {
             before(grammarAccess.getParametroFuncionAccess().getPasoAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5130:1: ( rule__ParametroFuncion__PasoAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5130:2: rule__ParametroFuncion__PasoAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__PasoAssignment_0_in_rule__ParametroFuncion__Group__0__Impl10493);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5140:1: rule__ParametroFuncion__Group__1 : rule__ParametroFuncion__Group__1__Impl rule__ParametroFuncion__Group__2 ;
    public final void rule__ParametroFuncion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5144:1: ( rule__ParametroFuncion__Group__1__Impl rule__ParametroFuncion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5145:2: rule__ParametroFuncion__Group__1__Impl rule__ParametroFuncion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__1__Impl_in_rule__ParametroFuncion__Group__110523);
            rule__ParametroFuncion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__2_in_rule__ParametroFuncion__Group__110526);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5152:1: rule__ParametroFuncion__Group__1__Impl : ( ( ( rule__ParametroFuncion__TipoAssignment_1 ) ) ( ( rule__ParametroFuncion__TipoAssignment_1 )* ) ) ;
    public final void rule__ParametroFuncion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5156:1: ( ( ( ( rule__ParametroFuncion__TipoAssignment_1 ) ) ( ( rule__ParametroFuncion__TipoAssignment_1 )* ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5157:1: ( ( ( rule__ParametroFuncion__TipoAssignment_1 ) ) ( ( rule__ParametroFuncion__TipoAssignment_1 )* ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5157:1: ( ( ( rule__ParametroFuncion__TipoAssignment_1 ) ) ( ( rule__ParametroFuncion__TipoAssignment_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5158:1: ( ( rule__ParametroFuncion__TipoAssignment_1 ) ) ( ( rule__ParametroFuncion__TipoAssignment_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5158:1: ( ( rule__ParametroFuncion__TipoAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5159:1: ( rule__ParametroFuncion__TipoAssignment_1 )
            {
             before(grammarAccess.getParametroFuncionAccess().getTipoAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5160:1: ( rule__ParametroFuncion__TipoAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5160:2: rule__ParametroFuncion__TipoAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__TipoAssignment_1_in_rule__ParametroFuncion__Group__1__Impl10555);
            rule__ParametroFuncion__TipoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParametroFuncionAccess().getTipoAssignment_1()); 

            }

            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5163:1: ( ( rule__ParametroFuncion__TipoAssignment_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5164:1: ( rule__ParametroFuncion__TipoAssignment_1 )*
            {
             before(grammarAccess.getParametroFuncionAccess().getTipoAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5165:1: ( rule__ParametroFuncion__TipoAssignment_1 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=21 && LA46_0<=25)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5165:2: rule__ParametroFuncion__TipoAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__TipoAssignment_1_in_rule__ParametroFuncion__Group__1__Impl10567);
            	    rule__ParametroFuncion__TipoAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5176:1: rule__ParametroFuncion__Group__2 : rule__ParametroFuncion__Group__2__Impl rule__ParametroFuncion__Group__3 ;
    public final void rule__ParametroFuncion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5180:1: ( rule__ParametroFuncion__Group__2__Impl rule__ParametroFuncion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5181:2: rule__ParametroFuncion__Group__2__Impl rule__ParametroFuncion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__2__Impl_in_rule__ParametroFuncion__Group__210600);
            rule__ParametroFuncion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__3_in_rule__ParametroFuncion__Group__210603);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5188:1: rule__ParametroFuncion__Group__2__Impl : ( ':' ) ;
    public final void rule__ParametroFuncion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5192:1: ( ( ':' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5193:1: ( ':' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5193:1: ( ':' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5194:1: ':'
            {
             before(grammarAccess.getParametroFuncionAccess().getColonKeyword_2()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__ParametroFuncion__Group__2__Impl10631); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5207:1: rule__ParametroFuncion__Group__3 : rule__ParametroFuncion__Group__3__Impl ;
    public final void rule__ParametroFuncion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5211:1: ( rule__ParametroFuncion__Group__3__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5212:2: rule__ParametroFuncion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__Group__3__Impl_in_rule__ParametroFuncion__Group__310662);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5218:1: rule__ParametroFuncion__Group__3__Impl : ( ( rule__ParametroFuncion__VariableAssignment_3 ) ) ;
    public final void rule__ParametroFuncion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5222:1: ( ( ( rule__ParametroFuncion__VariableAssignment_3 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5223:1: ( ( rule__ParametroFuncion__VariableAssignment_3 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5223:1: ( ( rule__ParametroFuncion__VariableAssignment_3 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5224:1: ( rule__ParametroFuncion__VariableAssignment_3 )
            {
             before(grammarAccess.getParametroFuncionAccess().getVariableAssignment_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5225:1: ( rule__ParametroFuncion__VariableAssignment_3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5225:2: rule__ParametroFuncion__VariableAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametroFuncion__VariableAssignment_3_in_rule__ParametroFuncion__Group__3__Impl10689);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5243:1: rule__Funcion__Group__0 : rule__Funcion__Group__0__Impl rule__Funcion__Group__1 ;
    public final void rule__Funcion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5247:1: ( rule__Funcion__Group__0__Impl rule__Funcion__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5248:2: rule__Funcion__Group__0__Impl rule__Funcion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__0__Impl_in_rule__Funcion__Group__010727);
            rule__Funcion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__1_in_rule__Funcion__Group__010730);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5255:1: rule__Funcion__Group__0__Impl : ( ( rule__Funcion__TipoAssignment_0 ) ) ;
    public final void rule__Funcion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5259:1: ( ( ( rule__Funcion__TipoAssignment_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5260:1: ( ( rule__Funcion__TipoAssignment_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5260:1: ( ( rule__Funcion__TipoAssignment_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5261:1: ( rule__Funcion__TipoAssignment_0 )
            {
             before(grammarAccess.getFuncionAccess().getTipoAssignment_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5262:1: ( rule__Funcion__TipoAssignment_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5262:2: rule__Funcion__TipoAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__TipoAssignment_0_in_rule__Funcion__Group__0__Impl10757);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5272:1: rule__Funcion__Group__1 : rule__Funcion__Group__1__Impl rule__Funcion__Group__2 ;
    public final void rule__Funcion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5276:1: ( rule__Funcion__Group__1__Impl rule__Funcion__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5277:2: rule__Funcion__Group__1__Impl rule__Funcion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__1__Impl_in_rule__Funcion__Group__110787);
            rule__Funcion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__2_in_rule__Funcion__Group__110790);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5284:1: rule__Funcion__Group__1__Impl : ( 'funcion' ) ;
    public final void rule__Funcion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5288:1: ( ( 'funcion' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5289:1: ( 'funcion' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5289:1: ( 'funcion' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5290:1: 'funcion'
            {
             before(grammarAccess.getFuncionAccess().getFuncionKeyword_1()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__Funcion__Group__1__Impl10818); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5303:1: rule__Funcion__Group__2 : rule__Funcion__Group__2__Impl rule__Funcion__Group__3 ;
    public final void rule__Funcion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5307:1: ( rule__Funcion__Group__2__Impl rule__Funcion__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5308:2: rule__Funcion__Group__2__Impl rule__Funcion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__2__Impl_in_rule__Funcion__Group__210849);
            rule__Funcion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__3_in_rule__Funcion__Group__210852);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5315:1: rule__Funcion__Group__2__Impl : ( ( rule__Funcion__NombreAssignment_2 ) ) ;
    public final void rule__Funcion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5319:1: ( ( ( rule__Funcion__NombreAssignment_2 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5320:1: ( ( rule__Funcion__NombreAssignment_2 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5320:1: ( ( rule__Funcion__NombreAssignment_2 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5321:1: ( rule__Funcion__NombreAssignment_2 )
            {
             before(grammarAccess.getFuncionAccess().getNombreAssignment_2()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5322:1: ( rule__Funcion__NombreAssignment_2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5322:2: rule__Funcion__NombreAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__NombreAssignment_2_in_rule__Funcion__Group__2__Impl10879);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5332:1: rule__Funcion__Group__3 : rule__Funcion__Group__3__Impl rule__Funcion__Group__4 ;
    public final void rule__Funcion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5336:1: ( rule__Funcion__Group__3__Impl rule__Funcion__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5337:2: rule__Funcion__Group__3__Impl rule__Funcion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__3__Impl_in_rule__Funcion__Group__310909);
            rule__Funcion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__4_in_rule__Funcion__Group__310912);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5344:1: rule__Funcion__Group__3__Impl : ( '(' ) ;
    public final void rule__Funcion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5348:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5349:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5349:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5350:1: '('
            {
             before(grammarAccess.getFuncionAccess().getLeftParenthesisKeyword_3()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Funcion__Group__3__Impl10940); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5363:1: rule__Funcion__Group__4 : rule__Funcion__Group__4__Impl rule__Funcion__Group__5 ;
    public final void rule__Funcion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5367:1: ( rule__Funcion__Group__4__Impl rule__Funcion__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5368:2: rule__Funcion__Group__4__Impl rule__Funcion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__4__Impl_in_rule__Funcion__Group__410971);
            rule__Funcion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__5_in_rule__Funcion__Group__410974);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5375:1: rule__Funcion__Group__4__Impl : ( ( rule__Funcion__Group_4__0 )? ) ;
    public final void rule__Funcion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5379:1: ( ( ( rule__Funcion__Group_4__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5380:1: ( ( rule__Funcion__Group_4__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5380:1: ( ( rule__Funcion__Group_4__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5381:1: ( rule__Funcion__Group_4__0 )?
            {
             before(grammarAccess.getFuncionAccess().getGroup_4()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5382:1: ( rule__Funcion__Group_4__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==26||(LA47_0>=44 && LA47_0<=45)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5382:2: rule__Funcion__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__0_in_rule__Funcion__Group__4__Impl11001);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5392:1: rule__Funcion__Group__5 : rule__Funcion__Group__5__Impl rule__Funcion__Group__6 ;
    public final void rule__Funcion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5396:1: ( rule__Funcion__Group__5__Impl rule__Funcion__Group__6 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5397:2: rule__Funcion__Group__5__Impl rule__Funcion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__5__Impl_in_rule__Funcion__Group__511032);
            rule__Funcion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__6_in_rule__Funcion__Group__511035);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5404:1: rule__Funcion__Group__5__Impl : ( ')' ) ;
    public final void rule__Funcion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5408:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5409:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5409:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5410:1: ')'
            {
             before(grammarAccess.getFuncionAccess().getRightParenthesisKeyword_5()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Funcion__Group__5__Impl11063); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5423:1: rule__Funcion__Group__6 : rule__Funcion__Group__6__Impl rule__Funcion__Group__7 ;
    public final void rule__Funcion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5427:1: ( rule__Funcion__Group__6__Impl rule__Funcion__Group__7 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5428:2: rule__Funcion__Group__6__Impl rule__Funcion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__6__Impl_in_rule__Funcion__Group__611094);
            rule__Funcion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__7_in_rule__Funcion__Group__611097);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5435:1: rule__Funcion__Group__6__Impl : ( 'var' ) ;
    public final void rule__Funcion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5439:1: ( ( 'var' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5440:1: ( 'var' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5440:1: ( 'var' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5441:1: 'var'
            {
             before(grammarAccess.getFuncionAccess().getVarKeyword_6()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Funcion__Group__6__Impl11125); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5454:1: rule__Funcion__Group__7 : rule__Funcion__Group__7__Impl rule__Funcion__Group__8 ;
    public final void rule__Funcion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5458:1: ( rule__Funcion__Group__7__Impl rule__Funcion__Group__8 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5459:2: rule__Funcion__Group__7__Impl rule__Funcion__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__7__Impl_in_rule__Funcion__Group__711156);
            rule__Funcion__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__8_in_rule__Funcion__Group__711159);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5466:1: rule__Funcion__Group__7__Impl : ( ( rule__Funcion__Group_7__0 )? ) ;
    public final void rule__Funcion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5470:1: ( ( ( rule__Funcion__Group_7__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5471:1: ( ( rule__Funcion__Group_7__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5471:1: ( ( rule__Funcion__Group_7__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5472:1: ( rule__Funcion__Group_7__0 )?
            {
             before(grammarAccess.getFuncionAccess().getGroup_7()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5473:1: ( rule__Funcion__Group_7__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=21 && LA48_0<=25)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5473:2: rule__Funcion__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__0_in_rule__Funcion__Group__7__Impl11186);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5483:1: rule__Funcion__Group__8 : rule__Funcion__Group__8__Impl rule__Funcion__Group__9 ;
    public final void rule__Funcion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5487:1: ( rule__Funcion__Group__8__Impl rule__Funcion__Group__9 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5488:2: rule__Funcion__Group__8__Impl rule__Funcion__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__8__Impl_in_rule__Funcion__Group__811217);
            rule__Funcion__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__9_in_rule__Funcion__Group__811220);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5495:1: rule__Funcion__Group__8__Impl : ( 'inicio' ) ;
    public final void rule__Funcion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5499:1: ( ( 'inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5500:1: ( 'inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5500:1: ( 'inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5501:1: 'inicio'
            {
             before(grammarAccess.getFuncionAccess().getInicioKeyword_8()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Funcion__Group__8__Impl11248); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5514:1: rule__Funcion__Group__9 : rule__Funcion__Group__9__Impl rule__Funcion__Group__10 ;
    public final void rule__Funcion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5518:1: ( rule__Funcion__Group__9__Impl rule__Funcion__Group__10 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5519:2: rule__Funcion__Group__9__Impl rule__Funcion__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__9__Impl_in_rule__Funcion__Group__911279);
            rule__Funcion__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__10_in_rule__Funcion__Group__911282);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5526:1: rule__Funcion__Group__9__Impl : ( ( rule__Funcion__Group_9__0 )? ) ;
    public final void rule__Funcion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5530:1: ( ( ( rule__Funcion__Group_9__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5531:1: ( ( rule__Funcion__Group_9__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5531:1: ( ( rule__Funcion__Group_9__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5532:1: ( rule__Funcion__Group_9__0 )?
            {
             before(grammarAccess.getFuncionAccess().getGroup_9()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5533:1: ( rule__Funcion__Group_9__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_ID)||(LA49_0>=14 && LA49_0<=20)||(LA49_0>=54 && LA49_0<=56)||LA49_0==59||LA49_0==62||LA49_0==64) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5533:2: rule__Funcion__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_9__0_in_rule__Funcion__Group__9__Impl11309);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5543:1: rule__Funcion__Group__10 : rule__Funcion__Group__10__Impl rule__Funcion__Group__11 ;
    public final void rule__Funcion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5547:1: ( rule__Funcion__Group__10__Impl rule__Funcion__Group__11 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5548:2: rule__Funcion__Group__10__Impl rule__Funcion__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__10__Impl_in_rule__Funcion__Group__1011340);
            rule__Funcion__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__11_in_rule__Funcion__Group__1011343);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5555:1: rule__Funcion__Group__10__Impl : ( 'devolver' ) ;
    public final void rule__Funcion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5559:1: ( ( 'devolver' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5560:1: ( 'devolver' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5560:1: ( 'devolver' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5561:1: 'devolver'
            {
             before(grammarAccess.getFuncionAccess().getDevolverKeyword_10()); 
            match(input,70,FollowSets000.FOLLOW_70_in_rule__Funcion__Group__10__Impl11371); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5574:1: rule__Funcion__Group__11 : rule__Funcion__Group__11__Impl rule__Funcion__Group__12 ;
    public final void rule__Funcion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5578:1: ( rule__Funcion__Group__11__Impl rule__Funcion__Group__12 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5579:2: rule__Funcion__Group__11__Impl rule__Funcion__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__11__Impl_in_rule__Funcion__Group__1111402);
            rule__Funcion__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__12_in_rule__Funcion__Group__1111405);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5586:1: rule__Funcion__Group__11__Impl : ( '(' ) ;
    public final void rule__Funcion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5590:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5591:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5591:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5592:1: '('
            {
             before(grammarAccess.getFuncionAccess().getLeftParenthesisKeyword_11()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Funcion__Group__11__Impl11433); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5605:1: rule__Funcion__Group__12 : rule__Funcion__Group__12__Impl rule__Funcion__Group__13 ;
    public final void rule__Funcion__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5609:1: ( rule__Funcion__Group__12__Impl rule__Funcion__Group__13 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5610:2: rule__Funcion__Group__12__Impl rule__Funcion__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__12__Impl_in_rule__Funcion__Group__1211464);
            rule__Funcion__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__13_in_rule__Funcion__Group__1211467);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5617:1: rule__Funcion__Group__12__Impl : ( ( rule__Funcion__DevuelveAssignment_12 ) ) ;
    public final void rule__Funcion__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5621:1: ( ( ( rule__Funcion__DevuelveAssignment_12 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5622:1: ( ( rule__Funcion__DevuelveAssignment_12 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5622:1: ( ( rule__Funcion__DevuelveAssignment_12 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5623:1: ( rule__Funcion__DevuelveAssignment_12 )
            {
             before(grammarAccess.getFuncionAccess().getDevuelveAssignment_12()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5624:1: ( rule__Funcion__DevuelveAssignment_12 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5624:2: rule__Funcion__DevuelveAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__DevuelveAssignment_12_in_rule__Funcion__Group__12__Impl11494);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5634:1: rule__Funcion__Group__13 : rule__Funcion__Group__13__Impl rule__Funcion__Group__14 ;
    public final void rule__Funcion__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5638:1: ( rule__Funcion__Group__13__Impl rule__Funcion__Group__14 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5639:2: rule__Funcion__Group__13__Impl rule__Funcion__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__13__Impl_in_rule__Funcion__Group__1311524);
            rule__Funcion__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__14_in_rule__Funcion__Group__1311527);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5646:1: rule__Funcion__Group__13__Impl : ( ')' ) ;
    public final void rule__Funcion__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5650:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5651:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5651:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5652:1: ')'
            {
             before(grammarAccess.getFuncionAccess().getRightParenthesisKeyword_13()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Funcion__Group__13__Impl11555); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5665:1: rule__Funcion__Group__14 : rule__Funcion__Group__14__Impl ;
    public final void rule__Funcion__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5669:1: ( rule__Funcion__Group__14__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5670:2: rule__Funcion__Group__14__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group__14__Impl_in_rule__Funcion__Group__1411586);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5676:1: rule__Funcion__Group__14__Impl : ( 'fin_funcion' ) ;
    public final void rule__Funcion__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5680:1: ( ( 'fin_funcion' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5681:1: ( 'fin_funcion' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5681:1: ( 'fin_funcion' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5682:1: 'fin_funcion'
            {
             before(grammarAccess.getFuncionAccess().getFin_funcionKeyword_14()); 
            match(input,71,FollowSets000.FOLLOW_71_in_rule__Funcion__Group__14__Impl11614); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5725:1: rule__Funcion__Group_4__0 : rule__Funcion__Group_4__0__Impl rule__Funcion__Group_4__1 ;
    public final void rule__Funcion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5729:1: ( rule__Funcion__Group_4__0__Impl rule__Funcion__Group_4__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5730:2: rule__Funcion__Group_4__0__Impl rule__Funcion__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__0__Impl_in_rule__Funcion__Group_4__011675);
            rule__Funcion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__1_in_rule__Funcion__Group_4__011678);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5737:1: rule__Funcion__Group_4__0__Impl : ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) ) ;
    public final void rule__Funcion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5741:1: ( ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5742:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5742:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5743:1: ( rule__Funcion__ParametrofuncionAssignment_4_0 )
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionAssignment_4_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5744:1: ( rule__Funcion__ParametrofuncionAssignment_4_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5744:2: rule__Funcion__ParametrofuncionAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_0_in_rule__Funcion__Group_4__0__Impl11705);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5754:1: rule__Funcion__Group_4__1 : rule__Funcion__Group_4__1__Impl ;
    public final void rule__Funcion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5758:1: ( rule__Funcion__Group_4__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5759:2: rule__Funcion__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4__1__Impl_in_rule__Funcion__Group_4__111735);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5765:1: rule__Funcion__Group_4__1__Impl : ( ( rule__Funcion__Group_4_1__0 )* ) ;
    public final void rule__Funcion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5769:1: ( ( ( rule__Funcion__Group_4_1__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5770:1: ( ( rule__Funcion__Group_4_1__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5770:1: ( ( rule__Funcion__Group_4_1__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5771:1: ( rule__Funcion__Group_4_1__0 )*
            {
             before(grammarAccess.getFuncionAccess().getGroup_4_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5772:1: ( rule__Funcion__Group_4_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==48) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5772:2: rule__Funcion__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__0_in_rule__Funcion__Group_4__1__Impl11762);
            	    rule__Funcion__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5786:1: rule__Funcion__Group_4_1__0 : rule__Funcion__Group_4_1__0__Impl rule__Funcion__Group_4_1__1 ;
    public final void rule__Funcion__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5790:1: ( rule__Funcion__Group_4_1__0__Impl rule__Funcion__Group_4_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5791:2: rule__Funcion__Group_4_1__0__Impl rule__Funcion__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__0__Impl_in_rule__Funcion__Group_4_1__011797);
            rule__Funcion__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__1_in_rule__Funcion__Group_4_1__011800);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5798:1: rule__Funcion__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Funcion__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5802:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5803:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5803:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5804:1: ','
            {
             before(grammarAccess.getFuncionAccess().getCommaKeyword_4_1_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Funcion__Group_4_1__0__Impl11828); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5817:1: rule__Funcion__Group_4_1__1 : rule__Funcion__Group_4_1__1__Impl ;
    public final void rule__Funcion__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5821:1: ( rule__Funcion__Group_4_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5822:2: rule__Funcion__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_4_1__1__Impl_in_rule__Funcion__Group_4_1__111859);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5828:1: rule__Funcion__Group_4_1__1__Impl : ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) ) ;
    public final void rule__Funcion__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5832:1: ( ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5833:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5833:1: ( ( rule__Funcion__ParametrofuncionAssignment_4_1_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5834:1: ( rule__Funcion__ParametrofuncionAssignment_4_1_1 )
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionAssignment_4_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5835:1: ( rule__Funcion__ParametrofuncionAssignment_4_1_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5835:2: rule__Funcion__ParametrofuncionAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_1_1_in_rule__Funcion__Group_4_1__1__Impl11886);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5849:1: rule__Funcion__Group_7__0 : rule__Funcion__Group_7__0__Impl rule__Funcion__Group_7__1 ;
    public final void rule__Funcion__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5853:1: ( rule__Funcion__Group_7__0__Impl rule__Funcion__Group_7__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5854:2: rule__Funcion__Group_7__0__Impl rule__Funcion__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__0__Impl_in_rule__Funcion__Group_7__011920);
            rule__Funcion__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__1_in_rule__Funcion__Group_7__011923);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5861:1: rule__Funcion__Group_7__0__Impl : ( ( rule__Funcion__DeclaracionvariableAssignment_7_0 ) ) ;
    public final void rule__Funcion__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5865:1: ( ( ( rule__Funcion__DeclaracionvariableAssignment_7_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5866:1: ( ( rule__Funcion__DeclaracionvariableAssignment_7_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5866:1: ( ( rule__Funcion__DeclaracionvariableAssignment_7_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5867:1: ( rule__Funcion__DeclaracionvariableAssignment_7_0 )
            {
             before(grammarAccess.getFuncionAccess().getDeclaracionvariableAssignment_7_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5868:1: ( rule__Funcion__DeclaracionvariableAssignment_7_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5868:2: rule__Funcion__DeclaracionvariableAssignment_7_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__DeclaracionvariableAssignment_7_0_in_rule__Funcion__Group_7__0__Impl11950);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5878:1: rule__Funcion__Group_7__1 : rule__Funcion__Group_7__1__Impl ;
    public final void rule__Funcion__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5882:1: ( rule__Funcion__Group_7__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5883:2: rule__Funcion__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_7__1__Impl_in_rule__Funcion__Group_7__111980);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5889:1: rule__Funcion__Group_7__1__Impl : ( ( rule__Funcion__DeclaracionvariableAssignment_7_1 )* ) ;
    public final void rule__Funcion__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5893:1: ( ( ( rule__Funcion__DeclaracionvariableAssignment_7_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5894:1: ( ( rule__Funcion__DeclaracionvariableAssignment_7_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5894:1: ( ( rule__Funcion__DeclaracionvariableAssignment_7_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5895:1: ( rule__Funcion__DeclaracionvariableAssignment_7_1 )*
            {
             before(grammarAccess.getFuncionAccess().getDeclaracionvariableAssignment_7_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5896:1: ( rule__Funcion__DeclaracionvariableAssignment_7_1 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=21 && LA51_0<=25)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5896:2: rule__Funcion__DeclaracionvariableAssignment_7_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Funcion__DeclaracionvariableAssignment_7_1_in_rule__Funcion__Group_7__1__Impl12007);
            	    rule__Funcion__DeclaracionvariableAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5910:1: rule__Funcion__Group_9__0 : rule__Funcion__Group_9__0__Impl rule__Funcion__Group_9__1 ;
    public final void rule__Funcion__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5914:1: ( rule__Funcion__Group_9__0__Impl rule__Funcion__Group_9__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5915:2: rule__Funcion__Group_9__0__Impl rule__Funcion__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_9__0__Impl_in_rule__Funcion__Group_9__012042);
            rule__Funcion__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_9__1_in_rule__Funcion__Group_9__012045);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5922:1: rule__Funcion__Group_9__0__Impl : ( ( rule__Funcion__SentenciasAssignment_9_0 ) ) ;
    public final void rule__Funcion__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5926:1: ( ( ( rule__Funcion__SentenciasAssignment_9_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5927:1: ( ( rule__Funcion__SentenciasAssignment_9_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5927:1: ( ( rule__Funcion__SentenciasAssignment_9_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5928:1: ( rule__Funcion__SentenciasAssignment_9_0 )
            {
             before(grammarAccess.getFuncionAccess().getSentenciasAssignment_9_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5929:1: ( rule__Funcion__SentenciasAssignment_9_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5929:2: rule__Funcion__SentenciasAssignment_9_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__SentenciasAssignment_9_0_in_rule__Funcion__Group_9__0__Impl12072);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5939:1: rule__Funcion__Group_9__1 : rule__Funcion__Group_9__1__Impl ;
    public final void rule__Funcion__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5943:1: ( rule__Funcion__Group_9__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5944:2: rule__Funcion__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Funcion__Group_9__1__Impl_in_rule__Funcion__Group_9__112102);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5950:1: rule__Funcion__Group_9__1__Impl : ( ( rule__Funcion__SentenciasAssignment_9_1 )* ) ;
    public final void rule__Funcion__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5954:1: ( ( ( rule__Funcion__SentenciasAssignment_9_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5955:1: ( ( rule__Funcion__SentenciasAssignment_9_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5955:1: ( ( rule__Funcion__SentenciasAssignment_9_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5956:1: ( rule__Funcion__SentenciasAssignment_9_1 )*
            {
             before(grammarAccess.getFuncionAccess().getSentenciasAssignment_9_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5957:1: ( rule__Funcion__SentenciasAssignment_9_1 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)||(LA52_0>=14 && LA52_0<=20)||(LA52_0>=54 && LA52_0<=56)||LA52_0==59||LA52_0==62||LA52_0==64) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5957:2: rule__Funcion__SentenciasAssignment_9_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Funcion__SentenciasAssignment_9_1_in_rule__Funcion__Group_9__1__Impl12129);
            	    rule__Funcion__SentenciasAssignment_9_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5971:1: rule__Procedimiento__Group__0 : rule__Procedimiento__Group__0__Impl rule__Procedimiento__Group__1 ;
    public final void rule__Procedimiento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5975:1: ( rule__Procedimiento__Group__0__Impl rule__Procedimiento__Group__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5976:2: rule__Procedimiento__Group__0__Impl rule__Procedimiento__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__0__Impl_in_rule__Procedimiento__Group__012164);
            rule__Procedimiento__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__1_in_rule__Procedimiento__Group__012167);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5983:1: rule__Procedimiento__Group__0__Impl : ( 'procedimiento' ) ;
    public final void rule__Procedimiento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5987:1: ( ( 'procedimiento' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5988:1: ( 'procedimiento' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5988:1: ( 'procedimiento' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5989:1: 'procedimiento'
            {
             before(grammarAccess.getProcedimientoAccess().getProcedimientoKeyword_0()); 
            match(input,72,FollowSets000.FOLLOW_72_in_rule__Procedimiento__Group__0__Impl12195); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6002:1: rule__Procedimiento__Group__1 : rule__Procedimiento__Group__1__Impl rule__Procedimiento__Group__2 ;
    public final void rule__Procedimiento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6006:1: ( rule__Procedimiento__Group__1__Impl rule__Procedimiento__Group__2 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6007:2: rule__Procedimiento__Group__1__Impl rule__Procedimiento__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__1__Impl_in_rule__Procedimiento__Group__112226);
            rule__Procedimiento__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__2_in_rule__Procedimiento__Group__112229);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6014:1: rule__Procedimiento__Group__1__Impl : ( ( rule__Procedimiento__NombreAssignment_1 ) ) ;
    public final void rule__Procedimiento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6018:1: ( ( ( rule__Procedimiento__NombreAssignment_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6019:1: ( ( rule__Procedimiento__NombreAssignment_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6019:1: ( ( rule__Procedimiento__NombreAssignment_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6020:1: ( rule__Procedimiento__NombreAssignment_1 )
            {
             before(grammarAccess.getProcedimientoAccess().getNombreAssignment_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6021:1: ( rule__Procedimiento__NombreAssignment_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6021:2: rule__Procedimiento__NombreAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__NombreAssignment_1_in_rule__Procedimiento__Group__1__Impl12256);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6031:1: rule__Procedimiento__Group__2 : rule__Procedimiento__Group__2__Impl rule__Procedimiento__Group__3 ;
    public final void rule__Procedimiento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6035:1: ( rule__Procedimiento__Group__2__Impl rule__Procedimiento__Group__3 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6036:2: rule__Procedimiento__Group__2__Impl rule__Procedimiento__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__2__Impl_in_rule__Procedimiento__Group__212286);
            rule__Procedimiento__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__3_in_rule__Procedimiento__Group__212289);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6043:1: rule__Procedimiento__Group__2__Impl : ( '(' ) ;
    public final void rule__Procedimiento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6047:1: ( ( '(' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6048:1: ( '(' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6048:1: ( '(' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6049:1: '('
            {
             before(grammarAccess.getProcedimientoAccess().getLeftParenthesisKeyword_2()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Procedimiento__Group__2__Impl12317); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6062:1: rule__Procedimiento__Group__3 : rule__Procedimiento__Group__3__Impl rule__Procedimiento__Group__4 ;
    public final void rule__Procedimiento__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6066:1: ( rule__Procedimiento__Group__3__Impl rule__Procedimiento__Group__4 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6067:2: rule__Procedimiento__Group__3__Impl rule__Procedimiento__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__3__Impl_in_rule__Procedimiento__Group__312348);
            rule__Procedimiento__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__4_in_rule__Procedimiento__Group__312351);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6074:1: rule__Procedimiento__Group__3__Impl : ( ( rule__Procedimiento__Group_3__0 )? ) ;
    public final void rule__Procedimiento__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6078:1: ( ( ( rule__Procedimiento__Group_3__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6079:1: ( ( rule__Procedimiento__Group_3__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6079:1: ( ( rule__Procedimiento__Group_3__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6080:1: ( rule__Procedimiento__Group_3__0 )?
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_3()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6081:1: ( rule__Procedimiento__Group_3__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==26||(LA53_0>=44 && LA53_0<=45)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6081:2: rule__Procedimiento__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__0_in_rule__Procedimiento__Group__3__Impl12378);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6091:1: rule__Procedimiento__Group__4 : rule__Procedimiento__Group__4__Impl rule__Procedimiento__Group__5 ;
    public final void rule__Procedimiento__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6095:1: ( rule__Procedimiento__Group__4__Impl rule__Procedimiento__Group__5 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6096:2: rule__Procedimiento__Group__4__Impl rule__Procedimiento__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__4__Impl_in_rule__Procedimiento__Group__412409);
            rule__Procedimiento__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__5_in_rule__Procedimiento__Group__412412);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6103:1: rule__Procedimiento__Group__4__Impl : ( ')' ) ;
    public final void rule__Procedimiento__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6107:1: ( ( ')' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6108:1: ( ')' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6108:1: ( ')' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6109:1: ')'
            {
             before(grammarAccess.getProcedimientoAccess().getRightParenthesisKeyword_4()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Procedimiento__Group__4__Impl12440); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6122:1: rule__Procedimiento__Group__5 : rule__Procedimiento__Group__5__Impl rule__Procedimiento__Group__6 ;
    public final void rule__Procedimiento__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6126:1: ( rule__Procedimiento__Group__5__Impl rule__Procedimiento__Group__6 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6127:2: rule__Procedimiento__Group__5__Impl rule__Procedimiento__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__5__Impl_in_rule__Procedimiento__Group__512471);
            rule__Procedimiento__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__6_in_rule__Procedimiento__Group__512474);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6134:1: rule__Procedimiento__Group__5__Impl : ( 'var' ) ;
    public final void rule__Procedimiento__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6138:1: ( ( 'var' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6139:1: ( 'var' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6139:1: ( 'var' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6140:1: 'var'
            {
             before(grammarAccess.getProcedimientoAccess().getVarKeyword_5()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Procedimiento__Group__5__Impl12502); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6153:1: rule__Procedimiento__Group__6 : rule__Procedimiento__Group__6__Impl rule__Procedimiento__Group__7 ;
    public final void rule__Procedimiento__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6157:1: ( rule__Procedimiento__Group__6__Impl rule__Procedimiento__Group__7 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6158:2: rule__Procedimiento__Group__6__Impl rule__Procedimiento__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__6__Impl_in_rule__Procedimiento__Group__612533);
            rule__Procedimiento__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__7_in_rule__Procedimiento__Group__612536);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6165:1: rule__Procedimiento__Group__6__Impl : ( ( rule__Procedimiento__Group_6__0 )? ) ;
    public final void rule__Procedimiento__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6169:1: ( ( ( rule__Procedimiento__Group_6__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6170:1: ( ( rule__Procedimiento__Group_6__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6170:1: ( ( rule__Procedimiento__Group_6__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6171:1: ( rule__Procedimiento__Group_6__0 )?
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_6()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6172:1: ( rule__Procedimiento__Group_6__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=21 && LA54_0<=25)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6172:2: rule__Procedimiento__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_6__0_in_rule__Procedimiento__Group__6__Impl12563);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6182:1: rule__Procedimiento__Group__7 : rule__Procedimiento__Group__7__Impl rule__Procedimiento__Group__8 ;
    public final void rule__Procedimiento__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6186:1: ( rule__Procedimiento__Group__7__Impl rule__Procedimiento__Group__8 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6187:2: rule__Procedimiento__Group__7__Impl rule__Procedimiento__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__7__Impl_in_rule__Procedimiento__Group__712594);
            rule__Procedimiento__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__8_in_rule__Procedimiento__Group__712597);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6194:1: rule__Procedimiento__Group__7__Impl : ( 'inicio' ) ;
    public final void rule__Procedimiento__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6198:1: ( ( 'inicio' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6199:1: ( 'inicio' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6199:1: ( 'inicio' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6200:1: 'inicio'
            {
             before(grammarAccess.getProcedimientoAccess().getInicioKeyword_7()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Procedimiento__Group__7__Impl12625); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6213:1: rule__Procedimiento__Group__8 : rule__Procedimiento__Group__8__Impl rule__Procedimiento__Group__9 ;
    public final void rule__Procedimiento__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6217:1: ( rule__Procedimiento__Group__8__Impl rule__Procedimiento__Group__9 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6218:2: rule__Procedimiento__Group__8__Impl rule__Procedimiento__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__8__Impl_in_rule__Procedimiento__Group__812656);
            rule__Procedimiento__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__9_in_rule__Procedimiento__Group__812659);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6225:1: rule__Procedimiento__Group__8__Impl : ( ( rule__Procedimiento__Group_8__0 )? ) ;
    public final void rule__Procedimiento__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6229:1: ( ( ( rule__Procedimiento__Group_8__0 )? ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6230:1: ( ( rule__Procedimiento__Group_8__0 )? )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6230:1: ( ( rule__Procedimiento__Group_8__0 )? )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6231:1: ( rule__Procedimiento__Group_8__0 )?
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_8()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6232:1: ( rule__Procedimiento__Group_8__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_STRING && LA55_0<=RULE_ID)||(LA55_0>=14 && LA55_0<=20)||(LA55_0>=54 && LA55_0<=56)||LA55_0==59||LA55_0==62||LA55_0==64) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6232:2: rule__Procedimiento__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_8__0_in_rule__Procedimiento__Group__8__Impl12686);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6242:1: rule__Procedimiento__Group__9 : rule__Procedimiento__Group__9__Impl ;
    public final void rule__Procedimiento__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6246:1: ( rule__Procedimiento__Group__9__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6247:2: rule__Procedimiento__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group__9__Impl_in_rule__Procedimiento__Group__912717);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6253:1: rule__Procedimiento__Group__9__Impl : ( 'fin_procedimiento' ) ;
    public final void rule__Procedimiento__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6257:1: ( ( 'fin_procedimiento' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6258:1: ( 'fin_procedimiento' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6258:1: ( 'fin_procedimiento' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6259:1: 'fin_procedimiento'
            {
             before(grammarAccess.getProcedimientoAccess().getFin_procedimientoKeyword_9()); 
            match(input,73,FollowSets000.FOLLOW_73_in_rule__Procedimiento__Group__9__Impl12745); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6292:1: rule__Procedimiento__Group_3__0 : rule__Procedimiento__Group_3__0__Impl rule__Procedimiento__Group_3__1 ;
    public final void rule__Procedimiento__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6296:1: ( rule__Procedimiento__Group_3__0__Impl rule__Procedimiento__Group_3__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6297:2: rule__Procedimiento__Group_3__0__Impl rule__Procedimiento__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__0__Impl_in_rule__Procedimiento__Group_3__012796);
            rule__Procedimiento__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__1_in_rule__Procedimiento__Group_3__012799);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6304:1: rule__Procedimiento__Group_3__0__Impl : ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) ) ;
    public final void rule__Procedimiento__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6308:1: ( ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6309:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6309:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6310:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_0 )
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionAssignment_3_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6311:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6311:2: rule__Procedimiento__ParametrofuncionAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_0_in_rule__Procedimiento__Group_3__0__Impl12826);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6321:1: rule__Procedimiento__Group_3__1 : rule__Procedimiento__Group_3__1__Impl ;
    public final void rule__Procedimiento__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6325:1: ( rule__Procedimiento__Group_3__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6326:2: rule__Procedimiento__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3__1__Impl_in_rule__Procedimiento__Group_3__112856);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6332:1: rule__Procedimiento__Group_3__1__Impl : ( ( rule__Procedimiento__Group_3_1__0 )* ) ;
    public final void rule__Procedimiento__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6336:1: ( ( ( rule__Procedimiento__Group_3_1__0 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6337:1: ( ( rule__Procedimiento__Group_3_1__0 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6337:1: ( ( rule__Procedimiento__Group_3_1__0 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6338:1: ( rule__Procedimiento__Group_3_1__0 )*
            {
             before(grammarAccess.getProcedimientoAccess().getGroup_3_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6339:1: ( rule__Procedimiento__Group_3_1__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==48) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6339:2: rule__Procedimiento__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__0_in_rule__Procedimiento__Group_3__1__Impl12883);
            	    rule__Procedimiento__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6353:1: rule__Procedimiento__Group_3_1__0 : rule__Procedimiento__Group_3_1__0__Impl rule__Procedimiento__Group_3_1__1 ;
    public final void rule__Procedimiento__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6357:1: ( rule__Procedimiento__Group_3_1__0__Impl rule__Procedimiento__Group_3_1__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6358:2: rule__Procedimiento__Group_3_1__0__Impl rule__Procedimiento__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__0__Impl_in_rule__Procedimiento__Group_3_1__012918);
            rule__Procedimiento__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__1_in_rule__Procedimiento__Group_3_1__012921);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6365:1: rule__Procedimiento__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Procedimiento__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6369:1: ( ( ',' ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6370:1: ( ',' )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6370:1: ( ',' )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6371:1: ','
            {
             before(grammarAccess.getProcedimientoAccess().getCommaKeyword_3_1_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Procedimiento__Group_3_1__0__Impl12949); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6384:1: rule__Procedimiento__Group_3_1__1 : rule__Procedimiento__Group_3_1__1__Impl ;
    public final void rule__Procedimiento__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6388:1: ( rule__Procedimiento__Group_3_1__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6389:2: rule__Procedimiento__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_3_1__1__Impl_in_rule__Procedimiento__Group_3_1__112980);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6395:1: rule__Procedimiento__Group_3_1__1__Impl : ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) ) ;
    public final void rule__Procedimiento__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6399:1: ( ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6400:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6400:1: ( ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6401:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 )
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionAssignment_3_1_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6402:1: ( rule__Procedimiento__ParametrofuncionAssignment_3_1_1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6402:2: rule__Procedimiento__ParametrofuncionAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_1_1_in_rule__Procedimiento__Group_3_1__1__Impl13007);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6416:1: rule__Procedimiento__Group_6__0 : rule__Procedimiento__Group_6__0__Impl rule__Procedimiento__Group_6__1 ;
    public final void rule__Procedimiento__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6420:1: ( rule__Procedimiento__Group_6__0__Impl rule__Procedimiento__Group_6__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6421:2: rule__Procedimiento__Group_6__0__Impl rule__Procedimiento__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_6__0__Impl_in_rule__Procedimiento__Group_6__013041);
            rule__Procedimiento__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_6__1_in_rule__Procedimiento__Group_6__013044);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6428:1: rule__Procedimiento__Group_6__0__Impl : ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 ) ) ;
    public final void rule__Procedimiento__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6432:1: ( ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6433:1: ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6433:1: ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6434:1: ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 )
            {
             before(grammarAccess.getProcedimientoAccess().getDeclaracionvariableAssignment_6_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6435:1: ( rule__Procedimiento__DeclaracionvariableAssignment_6_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6435:2: rule__Procedimiento__DeclaracionvariableAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__DeclaracionvariableAssignment_6_0_in_rule__Procedimiento__Group_6__0__Impl13071);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6445:1: rule__Procedimiento__Group_6__1 : rule__Procedimiento__Group_6__1__Impl ;
    public final void rule__Procedimiento__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6449:1: ( rule__Procedimiento__Group_6__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6450:2: rule__Procedimiento__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_6__1__Impl_in_rule__Procedimiento__Group_6__113101);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6456:1: rule__Procedimiento__Group_6__1__Impl : ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )* ) ;
    public final void rule__Procedimiento__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6460:1: ( ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6461:1: ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6461:1: ( ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6462:1: ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )*
            {
             before(grammarAccess.getProcedimientoAccess().getDeclaracionvariableAssignment_6_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6463:1: ( rule__Procedimiento__DeclaracionvariableAssignment_6_1 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=21 && LA57_0<=25)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6463:2: rule__Procedimiento__DeclaracionvariableAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__DeclaracionvariableAssignment_6_1_in_rule__Procedimiento__Group_6__1__Impl13128);
            	    rule__Procedimiento__DeclaracionvariableAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6477:1: rule__Procedimiento__Group_8__0 : rule__Procedimiento__Group_8__0__Impl rule__Procedimiento__Group_8__1 ;
    public final void rule__Procedimiento__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6481:1: ( rule__Procedimiento__Group_8__0__Impl rule__Procedimiento__Group_8__1 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6482:2: rule__Procedimiento__Group_8__0__Impl rule__Procedimiento__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_8__0__Impl_in_rule__Procedimiento__Group_8__013163);
            rule__Procedimiento__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_8__1_in_rule__Procedimiento__Group_8__013166);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6489:1: rule__Procedimiento__Group_8__0__Impl : ( ( rule__Procedimiento__SentenciasAssignment_8_0 ) ) ;
    public final void rule__Procedimiento__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6493:1: ( ( ( rule__Procedimiento__SentenciasAssignment_8_0 ) ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6494:1: ( ( rule__Procedimiento__SentenciasAssignment_8_0 ) )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6494:1: ( ( rule__Procedimiento__SentenciasAssignment_8_0 ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6495:1: ( rule__Procedimiento__SentenciasAssignment_8_0 )
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasAssignment_8_0()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6496:1: ( rule__Procedimiento__SentenciasAssignment_8_0 )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6496:2: rule__Procedimiento__SentenciasAssignment_8_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__SentenciasAssignment_8_0_in_rule__Procedimiento__Group_8__0__Impl13193);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6506:1: rule__Procedimiento__Group_8__1 : rule__Procedimiento__Group_8__1__Impl ;
    public final void rule__Procedimiento__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6510:1: ( rule__Procedimiento__Group_8__1__Impl )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6511:2: rule__Procedimiento__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__Group_8__1__Impl_in_rule__Procedimiento__Group_8__113223);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6517:1: rule__Procedimiento__Group_8__1__Impl : ( ( rule__Procedimiento__SentenciasAssignment_8_1 )* ) ;
    public final void rule__Procedimiento__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6521:1: ( ( ( rule__Procedimiento__SentenciasAssignment_8_1 )* ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6522:1: ( ( rule__Procedimiento__SentenciasAssignment_8_1 )* )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6522:1: ( ( rule__Procedimiento__SentenciasAssignment_8_1 )* )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6523:1: ( rule__Procedimiento__SentenciasAssignment_8_1 )*
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasAssignment_8_1()); 
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6524:1: ( rule__Procedimiento__SentenciasAssignment_8_1 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_STRING && LA58_0<=RULE_ID)||(LA58_0>=14 && LA58_0<=20)||(LA58_0>=54 && LA58_0<=56)||LA58_0==59||LA58_0==62||LA58_0==64) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6524:2: rule__Procedimiento__SentenciasAssignment_8_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Procedimiento__SentenciasAssignment_8_1_in_rule__Procedimiento__Group_8__1__Impl13250);
            	    rule__Procedimiento__SentenciasAssignment_8_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6539:1: rule__Codigo__FuncionAssignment_0_0 : ( ruleSubproceso ) ;
    public final void rule__Codigo__FuncionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6543:1: ( ( ruleSubproceso ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6544:1: ( ruleSubproceso )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6544:1: ( ruleSubproceso )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6545:1: ruleSubproceso
            {
             before(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_0_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_013290);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6554:1: rule__Codigo__FuncionAssignment_0_1 : ( ruleSubproceso ) ;
    public final void rule__Codigo__FuncionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6558:1: ( ( ruleSubproceso ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6559:1: ( ruleSubproceso )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6559:1: ( ruleSubproceso )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6560:1: ruleSubproceso
            {
             before(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_113321);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6569:1: rule__Codigo__TieneAssignment_1 : ( ruleInicio ) ;
    public final void rule__Codigo__TieneAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6573:1: ( ( ruleInicio ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6574:1: ( ruleInicio )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6574:1: ( ruleInicio )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6575:1: ruleInicio
            {
             before(grammarAccess.getCodigoAccess().getTieneInicioParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_rule__Codigo__TieneAssignment_113352);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6584:1: rule__Internas__NombreAssignment_0 : ( ruleNombreInterna ) ;
    public final void rule__Internas__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6588:1: ( ( ruleNombreInterna ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6589:1: ( ruleNombreInterna )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6589:1: ( ruleNombreInterna )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6590:1: ruleNombreInterna
            {
             before(grammarAccess.getInternasAccess().getNombreNombreInternaParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_rule__Internas__NombreAssignment_013383);
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


    // $ANTLR start "rule__Internas__OperadorAssignment_2_0"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6599:1: rule__Internas__OperadorAssignment_2_0 : ( ruleOperador ) ;
    public final void rule__Internas__OperadorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6603:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6604:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6604:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6605:1: ruleOperador
            {
             before(grammarAccess.getInternasAccess().getOperadorOperadorParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__Internas__OperadorAssignment_2_013414);
            ruleOperador();

            state._fsp--;

             after(grammarAccess.getInternasAccess().getOperadorOperadorParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__OperadorAssignment_2_0"


    // $ANTLR start "rule__Internas__OperadorAssignment_2_1_1"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6614:1: rule__Internas__OperadorAssignment_2_1_1 : ( ruleOperador ) ;
    public final void rule__Internas__OperadorAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6618:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6619:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6619:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6620:1: ruleOperador
            {
             before(grammarAccess.getInternasAccess().getOperadorOperadorParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__Internas__OperadorAssignment_2_1_113445);
            ruleOperador();

            state._fsp--;

             after(grammarAccess.getInternasAccess().getOperadorOperadorParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internas__OperadorAssignment_2_1_1"


    // $ANTLR start "rule__Caracter__ContenidoAssignment"
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6629:1: rule__Caracter__ContenidoAssignment : ( RULE_CAR ) ;
    public final void rule__Caracter__ContenidoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6633:1: ( ( RULE_CAR ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6634:1: ( RULE_CAR )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6634:1: ( RULE_CAR )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6635:1: RULE_CAR
            {
             before(grammarAccess.getCaracterAccess().getContenidoCARTerminalRuleCall_0()); 
            match(input,RULE_CAR,FollowSets000.FOLLOW_RULE_CAR_in_rule__Caracter__ContenidoAssignment13476); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6644:1: rule__Inicio__DeclaracionvariableAssignment_2_0 : ( ruleDeclaracionVariable ) ;
    public final void rule__Inicio__DeclaracionvariableAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6648:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6649:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6649:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6650:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getInicioAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Inicio__DeclaracionvariableAssignment_2_013507);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6659:1: rule__Inicio__DeclaracionvariableAssignment_2_1 : ( ruleDeclaracionVariable ) ;
    public final void rule__Inicio__DeclaracionvariableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6663:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6664:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6664:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6665:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getInicioAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Inicio__DeclaracionvariableAssignment_2_113538);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6674:1: rule__Inicio__TieneAssignment_4_0 : ( ruleSentencias ) ;
    public final void rule__Inicio__TieneAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6678:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6679:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6679:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6680:1: ruleSentencias
            {
             before(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_4_013569);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6689:1: rule__Inicio__TieneAssignment_4_1 : ( ruleSentencias ) ;
    public final void rule__Inicio__TieneAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6693:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6694:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6694:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6695:1: ruleSentencias
            {
             before(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_4_113600);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6704:1: rule__DeclaracionVariable__TipoAssignment_0 : ( ruleTipoVariable ) ;
    public final void rule__DeclaracionVariable__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6708:1: ( ( ruleTipoVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6709:1: ( ruleTipoVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6709:1: ( ruleTipoVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6710:1: ruleTipoVariable
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_rule__DeclaracionVariable__TipoAssignment_013631);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6719:1: rule__DeclaracionVariable__TieneIDsAssignment_2 : ( ruleVariable ) ;
    public final void rule__DeclaracionVariable__TieneIDsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6723:1: ( ( ruleVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6724:1: ( ruleVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6724:1: ( ruleVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6725:1: ruleVariable
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsVariableParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_213662);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6734:1: rule__DeclaracionVariable__TieneIDsAssignment_3_1 : ( ruleVariable ) ;
    public final void rule__DeclaracionVariable__TieneIDsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6738:1: ( ( ruleVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6739:1: ( ruleVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6739:1: ( ruleVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6740:1: ruleVariable
            {
             before(grammarAccess.getDeclaracionVariableAccess().getTieneIDsVariableParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_3_113693);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6749:1: rule__LlamadaFuncion__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__LlamadaFuncion__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6753:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6754:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6754:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6755:1: ruleEString
            {
             before(grammarAccess.getLlamadaFuncionAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__LlamadaFuncion__NombreAssignment_013724);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6764:1: rule__LlamadaFuncion__OperadorAssignment_2_0 : ( ruleOperador ) ;
    public final void rule__LlamadaFuncion__OperadorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6768:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6769:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6769:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6770:1: ruleOperador
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorOperadorParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_013755);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6779:1: rule__LlamadaFuncion__OperadorAssignment_2_1_1 : ( ruleOperador ) ;
    public final void rule__LlamadaFuncion__OperadorAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6783:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6784:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6784:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6785:1: ruleOperador
            {
             before(grammarAccess.getLlamadaFuncionAccess().getOperadorOperadorParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_1_113786);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6794:1: rule__Asignacion__LvalueAssignment_0 : ( ruleEString ) ;
    public final void rule__Asignacion__LvalueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6798:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6799:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6799:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6800:1: ruleEString
            {
             before(grammarAccess.getAsignacionAccess().getLvalueEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Asignacion__LvalueAssignment_013817);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6809:1: rule__Asignacion__MatAssignment_1 : ( RULE_MATRIZ ) ;
    public final void rule__Asignacion__MatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6813:1: ( ( RULE_MATRIZ ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6814:1: ( RULE_MATRIZ )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6814:1: ( RULE_MATRIZ )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6815:1: RULE_MATRIZ
            {
             before(grammarAccess.getAsignacionAccess().getMatMATRIZTerminalRuleCall_1_0()); 
            match(input,RULE_MATRIZ,FollowSets000.FOLLOW_RULE_MATRIZ_in_rule__Asignacion__MatAssignment_113848); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6824:1: rule__Asignacion__OperadorAssignment_3 : ( rulevalor ) ;
    public final void rule__Asignacion__OperadorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6828:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6829:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6829:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6830:1: rulevalor
            {
             before(grammarAccess.getAsignacionAccess().getOperadorValorParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Asignacion__OperadorAssignment_313879);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6839:1: rule__Escribir__OperadorAssignment_2 : ( ruleOperador ) ;
    public final void rule__Escribir__OperadorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6843:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6844:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6844:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6845:1: ruleOperador
            {
             before(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_213910);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6854:1: rule__Escribir__OperadorAssignment_3_1 : ( ruleOperador ) ;
    public final void rule__Escribir__OperadorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6858:1: ( ( ruleOperador ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6859:1: ( ruleOperador )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6859:1: ( ruleOperador )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6860:1: ruleOperador
            {
             before(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_3_113941);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6869:1: rule__Leer__VariableAssignment_2 : ( ruleVariableID ) ;
    public final void rule__Leer__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6873:1: ( ( ruleVariableID ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6874:1: ( ruleVariableID )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6874:1: ( ruleVariableID )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6875:1: ruleVariableID
            {
             before(grammarAccess.getLeerAccess().getVariableVariableIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__Leer__VariableAssignment_213972);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6884:1: rule__Si__ValorAssignment_1 : ( rulevalor ) ;
    public final void rule__Si__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6888:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6889:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6889:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6890:1: rulevalor
            {
             before(grammarAccess.getSiAccess().getValorValorParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Si__ValorAssignment_114003);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6899:1: rule__Si__SentenciasAssignment_3_0 : ( ruleSentencias ) ;
    public final void rule__Si__SentenciasAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6903:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6904:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6904:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6905:1: ruleSentencias
            {
             before(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_014034);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6914:1: rule__Si__SentenciasAssignment_3_1 : ( ruleSentencias ) ;
    public final void rule__Si__SentenciasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6918:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6919:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6919:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6920:1: ruleSentencias
            {
             before(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_114065);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6929:1: rule__Si__SinoAssignment_4 : ( ruleSino ) ;
    public final void rule__Si__SinoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6933:1: ( ( ruleSino ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6934:1: ( ruleSino )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6934:1: ( ruleSino )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6935:1: ruleSino
            {
             before(grammarAccess.getSiAccess().getSinoSinoParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSino_in_rule__Si__SinoAssignment_414096);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6944:1: rule__Mientras__ValorAssignment_1 : ( rulevalor ) ;
    public final void rule__Mientras__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6948:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6949:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6949:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6950:1: rulevalor
            {
             before(grammarAccess.getMientrasAccess().getValorValorParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Mientras__ValorAssignment_114127);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6959:1: rule__Mientras__SentenciasAssignment_3_0 : ( ruleSentencias ) ;
    public final void rule__Mientras__SentenciasAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6963:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6964:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6964:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6965:1: ruleSentencias
            {
             before(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_014158);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6974:1: rule__Mientras__SentenciasAssignment_3_1 : ( ruleSentencias ) ;
    public final void rule__Mientras__SentenciasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6978:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6979:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6979:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6980:1: ruleSentencias
            {
             before(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_114189);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6989:1: rule__Repetir__SentenciasAssignment_1_0 : ( ruleSentencias ) ;
    public final void rule__Repetir__SentenciasAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6993:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6994:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6994:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6995:1: ruleSentencias
            {
             before(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_014220);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7004:1: rule__Repetir__SentenciasAssignment_1_1 : ( ruleSentencias ) ;
    public final void rule__Repetir__SentenciasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7008:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7009:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7009:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7010:1: ruleSentencias
            {
             before(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_114251);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7019:1: rule__Repetir__ValorAssignment_3 : ( rulevalor ) ;
    public final void rule__Repetir__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7023:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7024:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7024:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7025:1: rulevalor
            {
             before(grammarAccess.getRepetirAccess().getValorValorParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Repetir__ValorAssignment_314282);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7034:1: rule__Desde__AsignacionAssignment_1 : ( ruleAsignacion ) ;
    public final void rule__Desde__AsignacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7038:1: ( ( ruleAsignacion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7039:1: ( ruleAsignacion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7039:1: ( ruleAsignacion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7040:1: ruleAsignacion
            {
             before(grammarAccess.getDesdeAccess().getAsignacionAsignacionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_rule__Desde__AsignacionAssignment_114313);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7049:1: rule__Desde__ValorAssignment_3 : ( rulevalor ) ;
    public final void rule__Desde__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7053:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7054:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7054:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7055:1: rulevalor
            {
             before(grammarAccess.getDesdeAccess().getValorValorParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Desde__ValorAssignment_314344);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7064:1: rule__Desde__SentenciasAssignment_5_0 : ( ruleSentencias ) ;
    public final void rule__Desde__SentenciasAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7068:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7069:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7069:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7070:1: ruleSentencias
            {
             before(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_014375);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7079:1: rule__Desde__SentenciasAssignment_5_1 : ( ruleSentencias ) ;
    public final void rule__Desde__SentenciasAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7083:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7084:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7084:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7085:1: ruleSentencias
            {
             before(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_114406);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7094:1: rule__Incremento__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__Incremento__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7098:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7099:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7099:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7100:1: ruleEString
            {
             before(grammarAccess.getIncrementoAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Incremento__NombreAssignment_014437);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7109:1: rule__Incremento__SsignoAssignment_1 : ( ruleinc ) ;
    public final void rule__Incremento__SsignoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7113:1: ( ( ruleinc ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7114:1: ( ruleinc )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7114:1: ( ruleinc )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7115:1: ruleinc
            {
             before(grammarAccess.getIncrementoAccess().getSsignoIncParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_rule__Incremento__SsignoAssignment_114468);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7124:1: rule__Variable__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__Variable__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7128:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7129:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7129:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7130:1: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Variable__NombreAssignment_014499);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7139:1: rule__Variable__MatAssignment_1 : ( RULE_MATRIZ ) ;
    public final void rule__Variable__MatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7143:1: ( ( RULE_MATRIZ ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7144:1: ( RULE_MATRIZ )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7144:1: ( RULE_MATRIZ )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7145:1: RULE_MATRIZ
            {
             before(grammarAccess.getVariableAccess().getMatMATRIZTerminalRuleCall_1_0()); 
            match(input,RULE_MATRIZ,FollowSets000.FOLLOW_RULE_MATRIZ_in_rule__Variable__MatAssignment_114530); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7154:1: rule__VariableID__NombreAssignment_0 : ( ruleEString ) ;
    public final void rule__VariableID__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7158:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7159:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7159:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7160:1: ruleEString
            {
             before(grammarAccess.getVariableIDAccess().getNombreEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VariableID__NombreAssignment_014561);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7169:1: rule__VariableID__MatAssignment_1 : ( RULE_MATRIZ ) ;
    public final void rule__VariableID__MatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7173:1: ( ( RULE_MATRIZ ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7174:1: ( RULE_MATRIZ )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7174:1: ( RULE_MATRIZ )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7175:1: RULE_MATRIZ
            {
             before(grammarAccess.getVariableIDAccess().getMatMATRIZTerminalRuleCall_1_0()); 
            match(input,RULE_MATRIZ,FollowSets000.FOLLOW_RULE_MATRIZ_in_rule__VariableID__MatAssignment_114592); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7184:1: rule__ConstCadena__ContenidoAssignment : ( RULE_CAD ) ;
    public final void rule__ConstCadena__ContenidoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7188:1: ( ( RULE_CAD ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7189:1: ( RULE_CAD )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7189:1: ( RULE_CAD )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7190:1: RULE_CAD
            {
             before(grammarAccess.getConstCadenaAccess().getContenidoCADTerminalRuleCall_0()); 
            match(input,RULE_CAD,FollowSets000.FOLLOW_RULE_CAD_in_rule__ConstCadena__ContenidoAssignment14623); 
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7199:1: rule__NumeroEntero__ValorAssignment : ( ruleEInt ) ;
    public final void rule__NumeroEntero__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7203:1: ( ( ruleEInt ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7204:1: ( ruleEInt )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7204:1: ( ruleEInt )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7205:1: ruleEInt
            {
             before(grammarAccess.getNumeroEnteroAccess().getValorEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__NumeroEntero__ValorAssignment14654);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7214:1: rule__NumeroDecimal__ValorAssignment : ( ruleEFloat ) ;
    public final void rule__NumeroDecimal__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7218:1: ( ( ruleEFloat ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7219:1: ( ruleEFloat )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7219:1: ( ruleEFloat )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7220:1: ruleEFloat
            {
             before(grammarAccess.getNumeroDecimalAccess().getValorEFloatParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rule__NumeroDecimal__ValorAssignment14685);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7229:1: rule__ValorBooleano__ValorAssignment : ( rulebooleano ) ;
    public final void rule__ValorBooleano__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7233:1: ( ( rulebooleano ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7234:1: ( rulebooleano )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7234:1: ( rulebooleano )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7235:1: rulebooleano
            {
             before(grammarAccess.getValorBooleanoAccess().getValorBooleanoParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleano_in_rule__ValorBooleano__ValorAssignment14716);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7244:1: rule__Operacion__Op_izqAssignment_1 : ( ruleoperando_izq ) ;
    public final void rule__Operacion__Op_izqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7248:1: ( ( ruleoperando_izq ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7249:1: ( ruleoperando_izq )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7249:1: ( ruleoperando_izq )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7250:1: ruleoperando_izq
            {
             before(grammarAccess.getOperacionAccess().getOp_izqOperando_izqParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_izq_in_rule__Operacion__Op_izqAssignment_114747);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7259:1: rule__Operacion__Signo_opAssignment_2 : ( rulesigno ) ;
    public final void rule__Operacion__Signo_opAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7263:1: ( ( rulesigno ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7264:1: ( rulesigno )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7264:1: ( rulesigno )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7265:1: rulesigno
            {
             before(grammarAccess.getOperacionAccess().getSigno_opSignoParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulesigno_in_rule__Operacion__Signo_opAssignment_214778);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7274:1: rule__Operacion__Op_derAssignment_3 : ( ruleoperando_der ) ;
    public final void rule__Operacion__Op_derAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7278:1: ( ( ruleoperando_der ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7279:1: ( ruleoperando_der )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7279:1: ( ruleoperando_der )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7280:1: ruleoperando_der
            {
             before(grammarAccess.getOperacionAccess().getOp_derOperando_derParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_der_in_rule__Operacion__Op_derAssignment_314809);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7289:1: rule__Operando_izq__Oper_izqAssignment : ( rulevalor ) ;
    public final void rule__Operando_izq__Oper_izqAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7293:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7294:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7294:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7295:1: rulevalor
            {
             before(grammarAccess.getOperando_izqAccess().getOper_izqValorParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Operando_izq__Oper_izqAssignment14840);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7304:1: rule__Operando_der__Oper_derAssignment : ( rulevalor ) ;
    public final void rule__Operando_der__Oper_derAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7308:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7309:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7309:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7310:1: rulevalor
            {
             before(grammarAccess.getOperando_derAccess().getOper_derValorParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Operando_der__Oper_derAssignment14871);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7319:1: rule__Sino__SentenciasAssignment_2_0 : ( ruleSentencias ) ;
    public final void rule__Sino__SentenciasAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7323:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7324:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7324:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7325:1: ruleSentencias
            {
             before(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_014902);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7334:1: rule__Sino__SentenciasAssignment_2_1 : ( ruleSentencias ) ;
    public final void rule__Sino__SentenciasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7338:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7339:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7339:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7340:1: ruleSentencias
            {
             before(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_114933);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7349:1: rule__ParametroFuncion__PasoAssignment_0 : ( ruleTipoPaso ) ;
    public final void rule__ParametroFuncion__PasoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7353:1: ( ( ruleTipoPaso ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7354:1: ( ruleTipoPaso )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7354:1: ( ruleTipoPaso )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7355:1: ruleTipoPaso
            {
             before(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_rule__ParametroFuncion__PasoAssignment_014964);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7364:1: rule__ParametroFuncion__TipoAssignment_1 : ( ruleTipoVariable ) ;
    public final void rule__ParametroFuncion__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7368:1: ( ( ruleTipoVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7369:1: ( ruleTipoVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7369:1: ( ruleTipoVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7370:1: ruleTipoVariable
            {
             before(grammarAccess.getParametroFuncionAccess().getTipoTipoVariableParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_rule__ParametroFuncion__TipoAssignment_114995);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7379:1: rule__ParametroFuncion__VariableAssignment_3 : ( ruleVariable ) ;
    public final void rule__ParametroFuncion__VariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7383:1: ( ( ruleVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7384:1: ( ruleVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7384:1: ( ruleVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7385:1: ruleVariable
            {
             before(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__ParametroFuncion__VariableAssignment_315026);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7394:1: rule__Funcion__TipoAssignment_0 : ( ruleTipoVariable ) ;
    public final void rule__Funcion__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7398:1: ( ( ruleTipoVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7399:1: ( ruleTipoVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7399:1: ( ruleTipoVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7400:1: ruleTipoVariable
            {
             before(grammarAccess.getFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_rule__Funcion__TipoAssignment_015057);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7409:1: rule__Funcion__NombreAssignment_2 : ( ruleEString ) ;
    public final void rule__Funcion__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7413:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7414:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7414:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7415:1: ruleEString
            {
             before(grammarAccess.getFuncionAccess().getNombreEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Funcion__NombreAssignment_215088);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7424:1: rule__Funcion__ParametrofuncionAssignment_4_0 : ( ruleParametroFuncion ) ;
    public final void rule__Funcion__ParametrofuncionAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7428:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7429:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7429:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7430:1: ruleParametroFuncion
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_015119);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7439:1: rule__Funcion__ParametrofuncionAssignment_4_1_1 : ( ruleParametroFuncion ) ;
    public final void rule__Funcion__ParametrofuncionAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7443:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7444:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7444:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7445:1: ruleParametroFuncion
            {
             before(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_1_115150);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7454:1: rule__Funcion__DeclaracionvariableAssignment_7_0 : ( ruleDeclaracionVariable ) ;
    public final void rule__Funcion__DeclaracionvariableAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7458:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7459:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7459:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7460:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getFuncionAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_7_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Funcion__DeclaracionvariableAssignment_7_015181);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7469:1: rule__Funcion__DeclaracionvariableAssignment_7_1 : ( ruleDeclaracionVariable ) ;
    public final void rule__Funcion__DeclaracionvariableAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7473:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7474:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7474:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7475:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getFuncionAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Funcion__DeclaracionvariableAssignment_7_115212);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7484:1: rule__Funcion__SentenciasAssignment_9_0 : ( ruleSentencias ) ;
    public final void rule__Funcion__SentenciasAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7488:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7489:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7489:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7490:1: ruleSentencias
            {
             before(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_9_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_9_015243);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7499:1: rule__Funcion__SentenciasAssignment_9_1 : ( ruleSentencias ) ;
    public final void rule__Funcion__SentenciasAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7503:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7504:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7504:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7505:1: ruleSentencias
            {
             before(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_9_115274);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7514:1: rule__Funcion__DevuelveAssignment_12 : ( rulevalor ) ;
    public final void rule__Funcion__DevuelveAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7518:1: ( ( rulevalor ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7519:1: ( rulevalor )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7519:1: ( rulevalor )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7520:1: rulevalor
            {
             before(grammarAccess.getFuncionAccess().getDevuelveValorParserRuleCall_12_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rule__Funcion__DevuelveAssignment_1215305);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7529:1: rule__Procedimiento__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__Procedimiento__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7533:1: ( ( ruleEString ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7534:1: ( ruleEString )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7534:1: ( ruleEString )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7535:1: ruleEString
            {
             before(grammarAccess.getProcedimientoAccess().getNombreEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Procedimiento__NombreAssignment_115336);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7544:1: rule__Procedimiento__ParametrofuncionAssignment_3_0 : ( ruleParametroFuncion ) ;
    public final void rule__Procedimiento__ParametrofuncionAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7548:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7549:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7549:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7550:1: ruleParametroFuncion
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_015367);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7559:1: rule__Procedimiento__ParametrofuncionAssignment_3_1_1 : ( ruleParametroFuncion ) ;
    public final void rule__Procedimiento__ParametrofuncionAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7563:1: ( ( ruleParametroFuncion ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7564:1: ( ruleParametroFuncion )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7564:1: ( ruleParametroFuncion )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7565:1: ruleParametroFuncion
            {
             before(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_1_115398);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7574:1: rule__Procedimiento__DeclaracionvariableAssignment_6_0 : ( ruleDeclaracionVariable ) ;
    public final void rule__Procedimiento__DeclaracionvariableAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7578:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7579:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7579:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7580:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getProcedimientoAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_6_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Procedimiento__DeclaracionvariableAssignment_6_015429);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7589:1: rule__Procedimiento__DeclaracionvariableAssignment_6_1 : ( ruleDeclaracionVariable ) ;
    public final void rule__Procedimiento__DeclaracionvariableAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7593:1: ( ( ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7594:1: ( ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7594:1: ( ruleDeclaracionVariable )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7595:1: ruleDeclaracionVariable
            {
             before(grammarAccess.getProcedimientoAccess().getDeclaracionvariableDeclaracionVariableParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_rule__Procedimiento__DeclaracionvariableAssignment_6_115460);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7604:1: rule__Procedimiento__SentenciasAssignment_8_0 : ( ruleSentencias ) ;
    public final void rule__Procedimiento__SentenciasAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7608:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7609:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7609:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7610:1: ruleSentencias
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_8_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_8_015491);
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
    // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7619:1: rule__Procedimiento__SentenciasAssignment_8_1 : ( ruleSentencias ) ;
    public final void rule__Procedimiento__SentenciasAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7623:1: ( ( ruleSentencias ) )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7624:1: ( ruleSentencias )
            {
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7624:1: ( ruleSentencias )
            // ../pseudocodigoDSL.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7625:1: ruleSentencias
            {
             before(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_8_115522);
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
        "\15\uffff";
    static final String DFA2_eofS =
        "\15\uffff";
    static final String DFA2_minS =
        "\1\4\2\10\12\uffff";
    static final String DFA2_maxS =
        "\1\100\2\65\12\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1\2\1\1\1\11";
    static final String DFA2_specialS =
        "\15\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\2\10\uffff\7\11\41\uffff\1\3\1\4\1\5\2\uffff\1\6\2\uffff"+
            "\1\7\1\uffff\1\10",
            "\1\12\41\uffff\2\14\2\uffff\1\13\6\uffff\1\12",
            "\1\12\41\uffff\2\14\2\uffff\1\13\6\uffff\1\12",
            "",
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
            return "1202:1: rule__Sentencias__Alternatives : ( ( ruleLlamadaFuncion ) | ( ruleAsignacion ) | ( ruleEscribir ) | ( ruleLeer ) | ( ruleSi ) | ( rulemientras ) | ( rulerepetir ) | ( ruledesde ) | ( ruleincremento ) | ( ruleInternas ) );";
        }
    }
    static final String DFA5_eotS =
        "\15\uffff";
    static final String DFA5_eofS =
        "\1\uffff\2\13\2\uffff\1\14\7\uffff";
    static final String DFA5_minS =
        "\3\4\1\uffff\1\6\1\4\7\uffff";
    static final String DFA5_maxS =
        "\1\103\2\111\1\uffff\1\103\1\111\7\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\3\2\uffff\1\5\1\6\1\7\1\10\1\1\1\2\1\4";
    static final String DFA5_specialS =
        "\15\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\1\5\1\11\1\uffff\1\3\22\uffff\2\10\1\uffff\1\4\16"+
            "\uffff\1\7\24\uffff\1\6",
            "\2\13\2\uffff\1\13\5\uffff\7\13\11\uffff\14\13\4\uffff\1\12"+
            "\1\13\3\uffff\1\13\2\uffff\15\13\1\uffff\1\13\1\uffff\1\13\2"+
            "\uffff\1\13",
            "\2\13\2\uffff\1\13\5\uffff\7\13\11\uffff\14\13\4\uffff\1\12"+
            "\1\13\3\uffff\1\13\2\uffff\15\13\1\uffff\1\13\1\uffff\1\13\2"+
            "\uffff\1\13",
            "",
            "\1\5\74\uffff\1\6",
            "\2\14\10\uffff\7\14\11\uffff\14\14\5\uffff\1\14\3\uffff\1"+
            "\14\2\uffff\15\14\1\6\1\14\1\uffff\1\14\2\uffff\1\14",
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
            return "1384:1: rule__Valor__Alternatives : ( ( ruleLlamadaFuncion ) | ( ruleVariableID ) | ( ruleConstCadena ) | ( ruleNumeroEntero ) | ( ruleNumeroDecimal ) | ( ruleoperacion ) | ( ruleValorBooleano ) | ( ruleCaracter ) );";
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
        public static final BitSet FOLLOW_ruleInternas_in_rule__Sentencias__Alternatives2672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__NombreInterna__Alternatives2705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__NombreInterna__Alternatives2725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__NombreInterna__Alternatives2745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__NombreInterna__Alternatives2765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__NombreInterna__Alternatives2785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__NombreInterna__Alternatives2805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__NombreInterna__Alternatives2825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__Operador__Alternatives2859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstCadena_in_rule__Operador__Alternatives2876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_rule__Operador__Alternatives2893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_rule__Operador__Alternatives2910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_rule__Operador__Alternatives2927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_rule__Operador__Alternatives2944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_rule__Valor__Alternatives2976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__Valor__Alternatives2993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstCadena_in_rule__Valor__Alternatives3010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_rule__Valor__Alternatives3027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_rule__Valor__Alternatives3044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_rule__Valor__Alternatives3061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_rule__Valor__Alternatives3078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_rule__Valor__Alternatives3095 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_rule__Codigo__Group__0__Impl_in_rule__Codigo__Group__03784 = new BitSet(new long[]{0x0002000000000000L});
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
        public static final BitSet FOLLOW_rule__Internas__NombreAssignment_0_in_rule__Internas__Group__0__Impl4060 = new BitSet(new long[]{0x00000000001FC002L});
        public static final BitSet FOLLOW_rule__Internas__NombreAssignment_0_in_rule__Internas__Group__0__Impl4072 = new BitSet(new long[]{0x00000000001FC002L});
        public static final BitSet FOLLOW_rule__Internas__Group__1__Impl_in_rule__Internas__Group__14105 = new BitSet(new long[]{0x00008000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Internas__Group__2_in_rule__Internas__Group__14108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Internas__Group__1__Impl4136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Internas__Group__2__Impl_in_rule__Internas__Group__24167 = new BitSet(new long[]{0x00008000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Internas__Group__3_in_rule__Internas__Group__24170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Internas__Group_2__0_in_rule__Internas__Group__2__Impl4197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Internas__Group__3__Impl_in_rule__Internas__Group__34228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Internas__Group__3__Impl4256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Internas__Group_2__0__Impl_in_rule__Internas__Group_2__04295 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Internas__Group_2__1_in_rule__Internas__Group_2__04298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Internas__OperadorAssignment_2_0_in_rule__Internas__Group_2__0__Impl4325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Internas__Group_2__1__Impl_in_rule__Internas__Group_2__14355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Internas__Group_2_1__0_in_rule__Internas__Group_2__1__Impl4382 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_rule__Internas__Group_2_1__0__Impl_in_rule__Internas__Group_2_1__04417 = new BitSet(new long[]{0x00000000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Internas__Group_2_1__1_in_rule__Internas__Group_2_1__04420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Internas__Group_2_1__0__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Internas__Group_2_1__1__Impl_in_rule__Internas__Group_2_1__14479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Internas__OperadorAssignment_2_1_1_in_rule__Internas__Group_2_1__1__Impl4506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__0__Impl_in_rule__Inicio__Group__04540 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__Inicio__Group__1_in_rule__Inicio__Group__04543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__1__Impl_in_rule__Inicio__Group__14601 = new BitSet(new long[]{0x0004000003E00000L});
        public static final BitSet FOLLOW_rule__Inicio__Group__2_in_rule__Inicio__Group__14604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Inicio__Group__1__Impl4632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__2__Impl_in_rule__Inicio__Group__24663 = new BitSet(new long[]{0x0004000003E00000L});
        public static final BitSet FOLLOW_rule__Inicio__Group__3_in_rule__Inicio__Group__24666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__0_in_rule__Inicio__Group__2__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__3__Impl_in_rule__Inicio__Group__34724 = new BitSet(new long[]{0x49C80000001FC030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Inicio__Group__4_in_rule__Inicio__Group__34727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Inicio__Group__3__Impl4755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__4__Impl_in_rule__Inicio__Group__44786 = new BitSet(new long[]{0x49C80000001FC030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Inicio__Group__5_in_rule__Inicio__Group__44789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_4__0_in_rule__Inicio__Group__4__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group__5__Impl_in_rule__Inicio__Group__54847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Inicio__Group__5__Impl4875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__0__Impl_in_rule__Inicio__Group_2__04918 = new BitSet(new long[]{0x0000000003E00000L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__1_in_rule__Inicio__Group_2__04921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__DeclaracionvariableAssignment_2_0_in_rule__Inicio__Group_2__0__Impl4948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_2__1__Impl_in_rule__Inicio__Group_2__14978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__DeclaracionvariableAssignment_2_1_in_rule__Inicio__Group_2__1__Impl5005 = new BitSet(new long[]{0x0000000003E00002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_4__0__Impl_in_rule__Inicio__Group_4__05040 = new BitSet(new long[]{0x49C00000001FC030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Inicio__Group_4__1_in_rule__Inicio__Group_4__05043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__TieneAssignment_4_0_in_rule__Inicio__Group_4__0__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__Group_4__1__Impl_in_rule__Inicio__Group_4__15100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inicio__TieneAssignment_4_1_in_rule__Inicio__Group_4__1__Impl5127 = new BitSet(new long[]{0x49C00000001FC032L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__0__Impl_in_rule__DeclaracionVariable__Group__05162 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__1_in_rule__DeclaracionVariable__Group__05165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__TipoAssignment_0_in_rule__DeclaracionVariable__Group__0__Impl5194 = new BitSet(new long[]{0x0000000003E00002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__TipoAssignment_0_in_rule__DeclaracionVariable__Group__0__Impl5206 = new BitSet(new long[]{0x0000000003E00002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__1__Impl_in_rule__DeclaracionVariable__Group__15239 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__2_in_rule__DeclaracionVariable__Group__15242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__DeclaracionVariable__Group__1__Impl5270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__2__Impl_in_rule__DeclaracionVariable__Group__25301 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__3_in_rule__DeclaracionVariable__Group__25304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_2_in_rule__DeclaracionVariable__Group__2__Impl5331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group__3__Impl_in_rule__DeclaracionVariable__Group__35361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_3__0_in_rule__DeclaracionVariable__Group__3__Impl5388 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_3__0__Impl_in_rule__DeclaracionVariable__Group_3__05427 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_3__1_in_rule__DeclaracionVariable__Group_3__05430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__DeclaracionVariable__Group_3__0__Impl5458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__Group_3__1__Impl_in_rule__DeclaracionVariable__Group_3__15489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaracionVariable__TieneIDsAssignment_3_1_in_rule__DeclaracionVariable__Group_3__1__Impl5516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__0__Impl_in_rule__LlamadaFuncion__Group__05550 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__1_in_rule__LlamadaFuncion__Group__05553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__NombreAssignment_0_in_rule__LlamadaFuncion__Group__0__Impl5580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__1__Impl_in_rule__LlamadaFuncion__Group__15610 = new BitSet(new long[]{0x00008000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__2_in_rule__LlamadaFuncion__Group__15613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__LlamadaFuncion__Group__1__Impl5641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__2__Impl_in_rule__LlamadaFuncion__Group__25672 = new BitSet(new long[]{0x00008000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__3_in_rule__LlamadaFuncion__Group__25675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__0_in_rule__LlamadaFuncion__Group__2__Impl5702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group__3__Impl_in_rule__LlamadaFuncion__Group__35733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__LlamadaFuncion__Group__3__Impl5761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__0__Impl_in_rule__LlamadaFuncion__Group_2__05800 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__1_in_rule__LlamadaFuncion__Group_2__05803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_0_in_rule__LlamadaFuncion__Group_2__0__Impl5830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2__1__Impl_in_rule__LlamadaFuncion__Group_2__15860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__0_in_rule__LlamadaFuncion__Group_2__1__Impl5887 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__0__Impl_in_rule__LlamadaFuncion__Group_2_1__05922 = new BitSet(new long[]{0x00000000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__1_in_rule__LlamadaFuncion__Group_2_1__05925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__LlamadaFuncion__Group_2_1__0__Impl5953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__Group_2_1__1__Impl_in_rule__LlamadaFuncion__Group_2_1__15984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LlamadaFuncion__OperadorAssignment_2_1_1_in_rule__LlamadaFuncion__Group_2_1__1__Impl6011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__0__Impl_in_rule__Asignacion__Group__06045 = new BitSet(new long[]{0x0020000000000100L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__1_in_rule__Asignacion__Group__06048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__LvalueAssignment_0_in_rule__Asignacion__Group__0__Impl6075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__1__Impl_in_rule__Asignacion__Group__16105 = new BitSet(new long[]{0x0020000000000100L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__2_in_rule__Asignacion__Group__16108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__MatAssignment_1_in_rule__Asignacion__Group__1__Impl6135 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__2__Impl_in_rule__Asignacion__Group__26166 = new BitSet(new long[]{0x00004000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__3_in_rule__Asignacion__Group__26169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__Asignacion__Group__2__Impl6197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__Group__3__Impl_in_rule__Asignacion__Group__36228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asignacion__OperadorAssignment_3_in_rule__Asignacion__Group__3__Impl6255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__0__Impl_in_rule__Escribir__Group__06293 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Escribir__Group__1_in_rule__Escribir__Group__06296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__Escribir__Group__0__Impl6324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__1__Impl_in_rule__Escribir__Group__16355 = new BitSet(new long[]{0x00000000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Escribir__Group__2_in_rule__Escribir__Group__16358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Escribir__Group__1__Impl6386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__2__Impl_in_rule__Escribir__Group__26417 = new BitSet(new long[]{0x0001800000000000L});
        public static final BitSet FOLLOW_rule__Escribir__Group__3_in_rule__Escribir__Group__26420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__OperadorAssignment_2_in_rule__Escribir__Group__2__Impl6447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__3__Impl_in_rule__Escribir__Group__36477 = new BitSet(new long[]{0x0001800000000000L});
        public static final BitSet FOLLOW_rule__Escribir__Group__4_in_rule__Escribir__Group__36480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__0_in_rule__Escribir__Group__3__Impl6507 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group__4__Impl_in_rule__Escribir__Group__46538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Escribir__Group__4__Impl6566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__0__Impl_in_rule__Escribir__Group_3__06607 = new BitSet(new long[]{0x00000000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__1_in_rule__Escribir__Group_3__06610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Escribir__Group_3__0__Impl6638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__Group_3__1__Impl_in_rule__Escribir__Group_3__16669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escribir__OperadorAssignment_3_1_in_rule__Escribir__Group_3__1__Impl6696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__0__Impl_in_rule__Leer__Group__06730 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Leer__Group__1_in_rule__Leer__Group__06733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__Leer__Group__0__Impl6761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__1__Impl_in_rule__Leer__Group__16792 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Leer__Group__2_in_rule__Leer__Group__16795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Leer__Group__1__Impl6823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__2__Impl_in_rule__Leer__Group__26854 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__Leer__Group__3_in_rule__Leer__Group__26857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__VariableAssignment_2_in_rule__Leer__Group__2__Impl6884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Leer__Group__3__Impl_in_rule__Leer__Group__36914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Leer__Group__3__Impl6942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__0__Impl_in_rule__Si__Group__06981 = new BitSet(new long[]{0x00004000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Si__Group__1_in_rule__Si__Group__06984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Si__Group__0__Impl7012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__1__Impl_in_rule__Si__Group__17043 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_rule__Si__Group__2_in_rule__Si__Group__17046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__ValorAssignment_1_in_rule__Si__Group__1__Impl7073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__2__Impl_in_rule__Si__Group__27103 = new BitSet(new long[]{0x4DC00000001FC030L,0x0000000000000011L});
        public static final BitSet FOLLOW_rule__Si__Group__3_in_rule__Si__Group__27106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__Si__Group__2__Impl7134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__3__Impl_in_rule__Si__Group__37165 = new BitSet(new long[]{0x4DC00000001FC030L,0x0000000000000011L});
        public static final BitSet FOLLOW_rule__Si__Group__4_in_rule__Si__Group__37168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group_3__0_in_rule__Si__Group__3__Impl7195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__4__Impl_in_rule__Si__Group__47226 = new BitSet(new long[]{0x4DC00000001FC030L,0x0000000000000011L});
        public static final BitSet FOLLOW_rule__Si__Group__5_in_rule__Si__Group__47229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__SinoAssignment_4_in_rule__Si__Group__4__Impl7256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group__5__Impl_in_rule__Si__Group__57287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__Si__Group__5__Impl7315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group_3__0__Impl_in_rule__Si__Group_3__07358 = new BitSet(new long[]{0x49C00000001FC030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Si__Group_3__1_in_rule__Si__Group_3__07361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__SentenciasAssignment_3_0_in_rule__Si__Group_3__0__Impl7388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__Group_3__1__Impl_in_rule__Si__Group_3__17418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Si__SentenciasAssignment_3_1_in_rule__Si__Group_3__1__Impl7445 = new BitSet(new long[]{0x49C00000001FC032L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Mientras__Group__0__Impl_in_rule__Mientras__Group__07480 = new BitSet(new long[]{0x00004000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Mientras__Group__1_in_rule__Mientras__Group__07483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__Mientras__Group__0__Impl7511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__1__Impl_in_rule__Mientras__Group__17542 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_rule__Mientras__Group__2_in_rule__Mientras__Group__17545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__ValorAssignment_1_in_rule__Mientras__Group__1__Impl7572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__2__Impl_in_rule__Mientras__Group__27602 = new BitSet(new long[]{0x69C00000001FC030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Mientras__Group__3_in_rule__Mientras__Group__27605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__Mientras__Group__2__Impl7633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__3__Impl_in_rule__Mientras__Group__37664 = new BitSet(new long[]{0x69C00000001FC030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Mientras__Group__4_in_rule__Mientras__Group__37667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__0_in_rule__Mientras__Group__3__Impl7694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group__4__Impl_in_rule__Mientras__Group__47725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__Mientras__Group__4__Impl7753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__0__Impl_in_rule__Mientras__Group_3__07794 = new BitSet(new long[]{0x49C00000001FC030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__1_in_rule__Mientras__Group_3__07797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__SentenciasAssignment_3_0_in_rule__Mientras__Group_3__0__Impl7824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__Group_3__1__Impl_in_rule__Mientras__Group_3__17854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mientras__SentenciasAssignment_3_1_in_rule__Mientras__Group_3__1__Impl7881 = new BitSet(new long[]{0x49C00000001FC032L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Repetir__Group__0__Impl_in_rule__Repetir__Group__07916 = new BitSet(new long[]{0xC9C00000001FC030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Repetir__Group__1_in_rule__Repetir__Group__07919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__Repetir__Group__0__Impl7947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group__1__Impl_in_rule__Repetir__Group__17978 = new BitSet(new long[]{0xC9C00000001FC030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Repetir__Group__2_in_rule__Repetir__Group__17981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__0_in_rule__Repetir__Group__1__Impl8008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group__2__Impl_in_rule__Repetir__Group__28039 = new BitSet(new long[]{0x00004000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Repetir__Group__3_in_rule__Repetir__Group__28042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rule__Repetir__Group__2__Impl8070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group__3__Impl_in_rule__Repetir__Group__38101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__ValorAssignment_3_in_rule__Repetir__Group__3__Impl8128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__0__Impl_in_rule__Repetir__Group_1__08166 = new BitSet(new long[]{0x49C00000001FC030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__1_in_rule__Repetir__Group_1__08169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__SentenciasAssignment_1_0_in_rule__Repetir__Group_1__0__Impl8196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__Group_1__1__Impl_in_rule__Repetir__Group_1__18226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repetir__SentenciasAssignment_1_1_in_rule__Repetir__Group_1__1__Impl8253 = new BitSet(new long[]{0x49C00000001FC032L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Desde__Group__0__Impl_in_rule__Desde__Group__08288 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Desde__Group__1_in_rule__Desde__Group__08291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__Desde__Group__0__Impl8319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__1__Impl_in_rule__Desde__Group__18350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__2_in_rule__Desde__Group__18353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__AsignacionAssignment_1_in_rule__Desde__Group__1__Impl8380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__2__Impl_in_rule__Desde__Group__28410 = new BitSet(new long[]{0x00004000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Desde__Group__3_in_rule__Desde__Group__28413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__Desde__Group__2__Impl8441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__3__Impl_in_rule__Desde__Group__38472 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_rule__Desde__Group__4_in_rule__Desde__Group__38475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__ValorAssignment_3_in_rule__Desde__Group__3__Impl8502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__4__Impl_in_rule__Desde__Group__48532 = new BitSet(new long[]{0x49C00000001FC030L,0x0000000000000005L});
        public static final BitSet FOLLOW_rule__Desde__Group__5_in_rule__Desde__Group__48535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__Desde__Group__4__Impl8563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__5__Impl_in_rule__Desde__Group__58594 = new BitSet(new long[]{0x49C00000001FC030L,0x0000000000000005L});
        public static final BitSet FOLLOW_rule__Desde__Group__6_in_rule__Desde__Group__58597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__0_in_rule__Desde__Group__5__Impl8624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group__6__Impl_in_rule__Desde__Group__68655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_rule__Desde__Group__6__Impl8683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__0__Impl_in_rule__Desde__Group_5__08728 = new BitSet(new long[]{0x49C00000001FC030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__1_in_rule__Desde__Group_5__08731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__SentenciasAssignment_5_0_in_rule__Desde__Group_5__0__Impl8758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__Group_5__1__Impl_in_rule__Desde__Group_5__18788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Desde__SentenciasAssignment_5_1_in_rule__Desde__Group_5__1__Impl8815 = new BitSet(new long[]{0x49C00000001FC032L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Incremento__Group__0__Impl_in_rule__Incremento__Group__08850 = new BitSet(new long[]{0x00000C0000000000L});
        public static final BitSet FOLLOW_rule__Incremento__Group__1_in_rule__Incremento__Group__08853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Incremento__NombreAssignment_0_in_rule__Incremento__Group__0__Impl8880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Incremento__Group__1__Impl_in_rule__Incremento__Group__18910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Incremento__SsignoAssignment_1_in_rule__Incremento__Group__1__Impl8937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__08971 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__08974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__NombreAssignment_0_in_rule__Variable__Group__0__Impl9001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__19031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__MatAssignment_1_in_rule__Variable__Group__1__Impl9058 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__VariableID__Group__0__Impl_in_rule__VariableID__Group__09093 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__VariableID__Group__1_in_rule__VariableID__Group__09096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__NombreAssignment_0_in_rule__VariableID__Group__0__Impl9123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group__1__Impl_in_rule__VariableID__Group__19153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__MatAssignment_1_in_rule__VariableID__Group__1__Impl9180 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__09215 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__09218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__EInt__Group__0__Impl9247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__19280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl9307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__09340 = new BitSet(new long[]{0x0000000080000040L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__09343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__EFloat__Group__0__Impl9372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__19405 = new BitSet(new long[]{0x0000000080000040L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__19408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl9436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__29467 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__29470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_rule__EFloat__Group__2__Impl9498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__39529 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__39532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl9559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__49588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl9615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__09656 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__09659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl9686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__19716 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__19719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__EFloat__Group_4__1__Impl9748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__29781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl9808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__0__Impl_in_rule__Operacion__Group__09843 = new BitSet(new long[]{0x00004000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Operacion__Group__1_in_rule__Operacion__Group__09846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Operacion__Group__0__Impl9874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__1__Impl_in_rule__Operacion__Group__19905 = new BitSet(new long[]{0x000003FFC0000000L});
        public static final BitSet FOLLOW_rule__Operacion__Group__2_in_rule__Operacion__Group__19908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Op_izqAssignment_1_in_rule__Operacion__Group__1__Impl9935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__2__Impl_in_rule__Operacion__Group__29965 = new BitSet(new long[]{0x00004000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Operacion__Group__3_in_rule__Operacion__Group__29968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Signo_opAssignment_2_in_rule__Operacion__Group__2__Impl9995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__3__Impl_in_rule__Operacion__Group__310025 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__Operacion__Group__4_in_rule__Operacion__Group__310028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Op_derAssignment_3_in_rule__Operacion__Group__3__Impl10055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operacion__Group__4__Impl_in_rule__Operacion__Group__410085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Operacion__Group__4__Impl10113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group__0__Impl_in_rule__Sino__Group__010154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Sino__Group__1_in_rule__Sino__Group__010157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group__1__Impl_in_rule__Sino__Group__110215 = new BitSet(new long[]{0x49C00000001FC030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Sino__Group__2_in_rule__Sino__Group__110218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_rule__Sino__Group__1__Impl10246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group__2__Impl_in_rule__Sino__Group__210277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__0_in_rule__Sino__Group__2__Impl10304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__0__Impl_in_rule__Sino__Group_2__010341 = new BitSet(new long[]{0x49C00000001FC030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__1_in_rule__Sino__Group_2__010344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__SentenciasAssignment_2_0_in_rule__Sino__Group_2__0__Impl10371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__Group_2__1__Impl_in_rule__Sino__Group_2__110401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sino__SentenciasAssignment_2_1_in_rule__Sino__Group_2__1__Impl10428 = new BitSet(new long[]{0x49C00000001FC032L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__0__Impl_in_rule__ParametroFuncion__Group__010463 = new BitSet(new long[]{0x0000000003E00000L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__1_in_rule__ParametroFuncion__Group__010466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__PasoAssignment_0_in_rule__ParametroFuncion__Group__0__Impl10493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__1__Impl_in_rule__ParametroFuncion__Group__110523 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__2_in_rule__ParametroFuncion__Group__110526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__TipoAssignment_1_in_rule__ParametroFuncion__Group__1__Impl10555 = new BitSet(new long[]{0x0000000003E00002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__TipoAssignment_1_in_rule__ParametroFuncion__Group__1__Impl10567 = new BitSet(new long[]{0x0000000003E00002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__2__Impl_in_rule__ParametroFuncion__Group__210600 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__3_in_rule__ParametroFuncion__Group__210603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__ParametroFuncion__Group__2__Impl10631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__Group__3__Impl_in_rule__ParametroFuncion__Group__310662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametroFuncion__VariableAssignment_3_in_rule__ParametroFuncion__Group__3__Impl10689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__0__Impl_in_rule__Funcion__Group__010727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Funcion__Group__1_in_rule__Funcion__Group__010730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__TipoAssignment_0_in_rule__Funcion__Group__0__Impl10757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__1__Impl_in_rule__Funcion__Group__110787 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Funcion__Group__2_in_rule__Funcion__Group__110790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__Funcion__Group__1__Impl10818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__2__Impl_in_rule__Funcion__Group__210849 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__3_in_rule__Funcion__Group__210852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__NombreAssignment_2_in_rule__Funcion__Group__2__Impl10879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__3__Impl_in_rule__Funcion__Group__310909 = new BitSet(new long[]{0x0000B00004000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__4_in_rule__Funcion__Group__310912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Funcion__Group__3__Impl10940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__4__Impl_in_rule__Funcion__Group__410971 = new BitSet(new long[]{0x0000B00004000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__5_in_rule__Funcion__Group__410974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__0_in_rule__Funcion__Group__4__Impl11001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__5__Impl_in_rule__Funcion__Group__511032 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__6_in_rule__Funcion__Group__511035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Funcion__Group__5__Impl11063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__6__Impl_in_rule__Funcion__Group__611094 = new BitSet(new long[]{0x0004000003E00000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__7_in_rule__Funcion__Group__611097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Funcion__Group__6__Impl11125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__7__Impl_in_rule__Funcion__Group__711156 = new BitSet(new long[]{0x0004000003E00000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__8_in_rule__Funcion__Group__711159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__0_in_rule__Funcion__Group__7__Impl11186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__8__Impl_in_rule__Funcion__Group__811217 = new BitSet(new long[]{0x49C00000001FC030L,0x0000000000000041L});
        public static final BitSet FOLLOW_rule__Funcion__Group__9_in_rule__Funcion__Group__811220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Funcion__Group__8__Impl11248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__9__Impl_in_rule__Funcion__Group__911279 = new BitSet(new long[]{0x49C00000001FC030L,0x0000000000000041L});
        public static final BitSet FOLLOW_rule__Funcion__Group__10_in_rule__Funcion__Group__911282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_9__0_in_rule__Funcion__Group__9__Impl11309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__10__Impl_in_rule__Funcion__Group__1011340 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__11_in_rule__Funcion__Group__1011343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_rule__Funcion__Group__10__Impl11371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__11__Impl_in_rule__Funcion__Group__1111402 = new BitSet(new long[]{0x00004000B00002F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Funcion__Group__12_in_rule__Funcion__Group__1111405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Funcion__Group__11__Impl11433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__12__Impl_in_rule__Funcion__Group__1211464 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group__13_in_rule__Funcion__Group__1211467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__DevuelveAssignment_12_in_rule__Funcion__Group__12__Impl11494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__13__Impl_in_rule__Funcion__Group__1311524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_rule__Funcion__Group__14_in_rule__Funcion__Group__1311527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Funcion__Group__13__Impl11555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group__14__Impl_in_rule__Funcion__Group__1411586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_rule__Funcion__Group__14__Impl11614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__0__Impl_in_rule__Funcion__Group_4__011675 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__1_in_rule__Funcion__Group_4__011678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_0_in_rule__Funcion__Group_4__0__Impl11705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4__1__Impl_in_rule__Funcion__Group_4__111735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__0_in_rule__Funcion__Group_4__1__Impl11762 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__0__Impl_in_rule__Funcion__Group_4_1__011797 = new BitSet(new long[]{0x0000300004000000L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__1_in_rule__Funcion__Group_4_1__011800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Funcion__Group_4_1__0__Impl11828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_4_1__1__Impl_in_rule__Funcion__Group_4_1__111859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__ParametrofuncionAssignment_4_1_1_in_rule__Funcion__Group_4_1__1__Impl11886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__0__Impl_in_rule__Funcion__Group_7__011920 = new BitSet(new long[]{0x0000000003E00000L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__1_in_rule__Funcion__Group_7__011923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__DeclaracionvariableAssignment_7_0_in_rule__Funcion__Group_7__0__Impl11950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_7__1__Impl_in_rule__Funcion__Group_7__111980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__DeclaracionvariableAssignment_7_1_in_rule__Funcion__Group_7__1__Impl12007 = new BitSet(new long[]{0x0000000003E00002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_9__0__Impl_in_rule__Funcion__Group_9__012042 = new BitSet(new long[]{0x49C00000001FC030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Funcion__Group_9__1_in_rule__Funcion__Group_9__012045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__SentenciasAssignment_9_0_in_rule__Funcion__Group_9__0__Impl12072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__Group_9__1__Impl_in_rule__Funcion__Group_9__112102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Funcion__SentenciasAssignment_9_1_in_rule__Funcion__Group_9__1__Impl12129 = new BitSet(new long[]{0x49C00000001FC032L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__0__Impl_in_rule__Procedimiento__Group__012164 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__1_in_rule__Procedimiento__Group__012167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_rule__Procedimiento__Group__0__Impl12195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__1__Impl_in_rule__Procedimiento__Group__112226 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__2_in_rule__Procedimiento__Group__112229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__NombreAssignment_1_in_rule__Procedimiento__Group__1__Impl12256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__2__Impl_in_rule__Procedimiento__Group__212286 = new BitSet(new long[]{0x0000B00004000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__3_in_rule__Procedimiento__Group__212289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Procedimiento__Group__2__Impl12317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__3__Impl_in_rule__Procedimiento__Group__312348 = new BitSet(new long[]{0x0000B00004000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__4_in_rule__Procedimiento__Group__312351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__0_in_rule__Procedimiento__Group__3__Impl12378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__4__Impl_in_rule__Procedimiento__Group__412409 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__5_in_rule__Procedimiento__Group__412412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Procedimiento__Group__4__Impl12440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__5__Impl_in_rule__Procedimiento__Group__512471 = new BitSet(new long[]{0x0004000003E00000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__6_in_rule__Procedimiento__Group__512474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Procedimiento__Group__5__Impl12502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__6__Impl_in_rule__Procedimiento__Group__612533 = new BitSet(new long[]{0x0004000003E00000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__7_in_rule__Procedimiento__Group__612536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_6__0_in_rule__Procedimiento__Group__6__Impl12563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__7__Impl_in_rule__Procedimiento__Group__712594 = new BitSet(new long[]{0x49C00000001FC030L,0x0000000000000201L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__8_in_rule__Procedimiento__Group__712597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Procedimiento__Group__7__Impl12625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__8__Impl_in_rule__Procedimiento__Group__812656 = new BitSet(new long[]{0x49C00000001FC030L,0x0000000000000201L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__9_in_rule__Procedimiento__Group__812659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_8__0_in_rule__Procedimiento__Group__8__Impl12686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group__9__Impl_in_rule__Procedimiento__Group__912717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_rule__Procedimiento__Group__9__Impl12745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__0__Impl_in_rule__Procedimiento__Group_3__012796 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__1_in_rule__Procedimiento__Group_3__012799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_0_in_rule__Procedimiento__Group_3__0__Impl12826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3__1__Impl_in_rule__Procedimiento__Group_3__112856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__0_in_rule__Procedimiento__Group_3__1__Impl12883 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__0__Impl_in_rule__Procedimiento__Group_3_1__012918 = new BitSet(new long[]{0x0000300004000000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__1_in_rule__Procedimiento__Group_3_1__012921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Procedimiento__Group_3_1__0__Impl12949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_3_1__1__Impl_in_rule__Procedimiento__Group_3_1__112980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__ParametrofuncionAssignment_3_1_1_in_rule__Procedimiento__Group_3_1__1__Impl13007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_6__0__Impl_in_rule__Procedimiento__Group_6__013041 = new BitSet(new long[]{0x0000000003E00000L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_6__1_in_rule__Procedimiento__Group_6__013044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__DeclaracionvariableAssignment_6_0_in_rule__Procedimiento__Group_6__0__Impl13071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_6__1__Impl_in_rule__Procedimiento__Group_6__113101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__DeclaracionvariableAssignment_6_1_in_rule__Procedimiento__Group_6__1__Impl13128 = new BitSet(new long[]{0x0000000003E00002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_8__0__Impl_in_rule__Procedimiento__Group_8__013163 = new BitSet(new long[]{0x49C00000001FC030L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_8__1_in_rule__Procedimiento__Group_8__013166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__SentenciasAssignment_8_0_in_rule__Procedimiento__Group_8__0__Impl13193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__Group_8__1__Impl_in_rule__Procedimiento__Group_8__113223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Procedimiento__SentenciasAssignment_8_1_in_rule__Procedimiento__Group_8__1__Impl13250 = new BitSet(new long[]{0x49C00000001FC032L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_013290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubproceso_in_rule__Codigo__FuncionAssignment_0_113321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInicio_in_rule__Codigo__TieneAssignment_113352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_rule__Internas__NombreAssignment_013383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__Internas__OperadorAssignment_2_013414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__Internas__OperadorAssignment_2_1_113445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAR_in_rule__Caracter__ContenidoAssignment13476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Inicio__DeclaracionvariableAssignment_2_013507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Inicio__DeclaracionvariableAssignment_2_113538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_4_013569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Inicio__TieneAssignment_4_113600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_rule__DeclaracionVariable__TipoAssignment_013631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_213662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__DeclaracionVariable__TieneIDsAssignment_3_113693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__LlamadaFuncion__NombreAssignment_013724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_013755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__LlamadaFuncion__OperadorAssignment_2_1_113786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Asignacion__LvalueAssignment_013817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_MATRIZ_in_rule__Asignacion__MatAssignment_113848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Asignacion__OperadorAssignment_313879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_213910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__Escribir__OperadorAssignment_3_113941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__Leer__VariableAssignment_213972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Si__ValorAssignment_114003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_014034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Si__SentenciasAssignment_3_114065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSino_in_rule__Si__SinoAssignment_414096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Mientras__ValorAssignment_114127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_014158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Mientras__SentenciasAssignment_3_114189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_014220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Repetir__SentenciasAssignment_1_114251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Repetir__ValorAssignment_314282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_rule__Desde__AsignacionAssignment_114313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Desde__ValorAssignment_314344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_014375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Desde__SentenciasAssignment_5_114406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Incremento__NombreAssignment_014437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinc_in_rule__Incremento__SsignoAssignment_114468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Variable__NombreAssignment_014499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_MATRIZ_in_rule__Variable__MatAssignment_114530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VariableID__NombreAssignment_014561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_MATRIZ_in_rule__VariableID__MatAssignment_114592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAD_in_rule__ConstCadena__ContenidoAssignment14623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__NumeroEntero__ValorAssignment14654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_rule__NumeroDecimal__ValorAssignment14685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_rule__ValorBooleano__ValorAssignment14716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_izq_in_rule__Operacion__Op_izqAssignment_114747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesigno_in_rule__Operacion__Signo_opAssignment_214778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_der_in_rule__Operacion__Op_derAssignment_314809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Operando_izq__Oper_izqAssignment14840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Operando_der__Oper_derAssignment14871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_014902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Sino__SentenciasAssignment_2_114933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_rule__ParametroFuncion__PasoAssignment_014964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_rule__ParametroFuncion__TipoAssignment_114995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__ParametroFuncion__VariableAssignment_315026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_rule__Funcion__TipoAssignment_015057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Funcion__NombreAssignment_215088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_015119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Funcion__ParametrofuncionAssignment_4_1_115150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Funcion__DeclaracionvariableAssignment_7_015181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Funcion__DeclaracionvariableAssignment_7_115212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_9_015243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Funcion__SentenciasAssignment_9_115274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_rule__Funcion__DevuelveAssignment_1215305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Procedimiento__NombreAssignment_115336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_015367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_rule__Procedimiento__ParametrofuncionAssignment_3_1_115398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Procedimiento__DeclaracionvariableAssignment_6_015429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_rule__Procedimiento__DeclaracionvariableAssignment_6_115460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_8_015491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_rule__Procedimiento__SentenciasAssignment_8_115522 = new BitSet(new long[]{0x0000000000000002L});
    }


}