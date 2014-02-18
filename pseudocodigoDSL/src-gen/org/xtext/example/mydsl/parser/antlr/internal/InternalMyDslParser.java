package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CAR", "RULE_STRING", "RULE_ID", "RULE_MAT", "RULE_CAD", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'const'", "'tipo'", "'('", "')'", "'cos'", "'cuadrado'", "'exp'", "'ln'", "'log'", "'sen'", "'sqrt'", "'longitud'", "'='", "'vector'", "' ['", "'] '", "'de '", "' : '", "'matriz'", "']['", "'var'", "'inicio'", "'fin_inicio'", "':'", "','", "'escribir'", "'leer'", "'si'", "'entonces'", "'fin_si'", "'mientras'", "'hacer'", "'fin_mientras'", "'repetir'", "'hasta_que'", "'desde'", "'hasta'", "'fin_desde'", "'segun_sea'", "'en_otro_caso:'", "'fin_segun'", "'entero'", "'caracter'", "'real'", "'logico'", "'cadena'", "'-'", "'.'", "'E'", "'e'", "'verdadero'", "'falso'", "'+'", "'*'", "'/'", "'<'", "'>'", "'>='", "'<='", "'y'", "'o'", "'=='", "'!='", "'sino'", "'devolver'", "'++'", "'--'", "'no'", "'funcion'", "'fin_funcion'", "'procedimiento'", "'fin_procedimiento'", "'E/S'", "'S'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=6;
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
    public static final int RULE_CAR=4;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int RULE_CAD=8;
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
    public static final int RULE_INT=9;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_MAT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
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
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Codigo";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCodigo"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleCodigo returns [EObject current=null] : iv_ruleCodigo= ruleCodigo EOF ;
    public final EObject entryRuleCodigo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodigo = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleCodigo= ruleCodigo EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleCodigo= ruleCodigo EOF
            {
             newCompositeNode(grammarAccess.getCodigoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCodigo_in_entryRuleCodigo75);
            iv_ruleCodigo=ruleCodigo();

            state._fsp--;

             current =iv_ruleCodigo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCodigo85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodigo"


    // $ANTLR start "ruleCodigo"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleCodigo returns [EObject current=null] : ( (otherlv_0= 'const' ( ( (lv_constantes_1_0= ruleConstantes ) ) ( (lv_constantes_2_0= ruleConstantes ) )* )? )? (otherlv_3= 'tipo' ( ( (lv_tipocomplejo_4_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )? )? ( ( (lv_funcion_6_0= ruleSubproceso ) ) ( (lv_funcion_7_0= ruleSubproceso ) )* )? ( (lv_tiene_8_0= ruleInicio ) ) ) ;
    public final EObject ruleCodigo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_constantes_1_0 = null;

        EObject lv_constantes_2_0 = null;

        EObject lv_tipocomplejo_4_0 = null;

        EObject lv_tipocomplejo_5_0 = null;

        EObject lv_funcion_6_0 = null;

        EObject lv_funcion_7_0 = null;

        EObject lv_tiene_8_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( (otherlv_0= 'const' ( ( (lv_constantes_1_0= ruleConstantes ) ) ( (lv_constantes_2_0= ruleConstantes ) )* )? )? (otherlv_3= 'tipo' ( ( (lv_tipocomplejo_4_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )? )? ( ( (lv_funcion_6_0= ruleSubproceso ) ) ( (lv_funcion_7_0= ruleSubproceso ) )* )? ( (lv_tiene_8_0= ruleInicio ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( (otherlv_0= 'const' ( ( (lv_constantes_1_0= ruleConstantes ) ) ( (lv_constantes_2_0= ruleConstantes ) )* )? )? (otherlv_3= 'tipo' ( ( (lv_tipocomplejo_4_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )? )? ( ( (lv_funcion_6_0= ruleSubproceso ) ) ( (lv_funcion_7_0= ruleSubproceso ) )* )? ( (lv_tiene_8_0= ruleInicio ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( (otherlv_0= 'const' ( ( (lv_constantes_1_0= ruleConstantes ) ) ( (lv_constantes_2_0= ruleConstantes ) )* )? )? (otherlv_3= 'tipo' ( ( (lv_tipocomplejo_4_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )? )? ( ( (lv_funcion_6_0= ruleSubproceso ) ) ( (lv_funcion_7_0= ruleSubproceso ) )* )? ( (lv_tiene_8_0= ruleInicio ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: (otherlv_0= 'const' ( ( (lv_constantes_1_0= ruleConstantes ) ) ( (lv_constantes_2_0= ruleConstantes ) )* )? )? (otherlv_3= 'tipo' ( ( (lv_tipocomplejo_4_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )? )? ( ( (lv_funcion_6_0= ruleSubproceso ) ) ( (lv_funcion_7_0= ruleSubproceso ) )* )? ( (lv_tiene_8_0= ruleInicio ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: (otherlv_0= 'const' ( ( (lv_constantes_1_0= ruleConstantes ) ) ( (lv_constantes_2_0= ruleConstantes ) )* )? )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:4: otherlv_0= 'const' ( ( (lv_constantes_1_0= ruleConstantes ) ) ( (lv_constantes_2_0= ruleConstantes ) )* )?
                    {
                    otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCodigo123); 

                        	newLeafNode(otherlv_0, grammarAccess.getCodigoAccess().getConstKeyword_0_0());
                        
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:84:1: ( ( (lv_constantes_1_0= ruleConstantes ) ) ( (lv_constantes_2_0= ruleConstantes ) )* )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:84:2: ( (lv_constantes_1_0= ruleConstantes ) ) ( (lv_constantes_2_0= ruleConstantes ) )*
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:84:2: ( (lv_constantes_1_0= ruleConstantes ) )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:85:1: (lv_constantes_1_0= ruleConstantes )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:85:1: (lv_constantes_1_0= ruleConstantes )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:3: lv_constantes_1_0= ruleConstantes
                            {
                             
                            	        newCompositeNode(grammarAccess.getCodigoAccess().getConstantesConstantesParserRuleCall_0_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_ruleCodigo145);
                            lv_constantes_1_0=ruleConstantes();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"constantes",
                                    		lv_constantes_1_0, 
                                    		"Constantes");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:102:2: ( (lv_constantes_2_0= ruleConstantes ) )*
                            loop1:
                            do {
                                int alt1=2;
                                int LA1_0 = input.LA(1);

                                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                                    alt1=1;
                                }


                                switch (alt1) {
                            	case 1 :
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:103:1: (lv_constantes_2_0= ruleConstantes )
                            	    {
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:103:1: (lv_constantes_2_0= ruleConstantes )
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:104:3: lv_constantes_2_0= ruleConstantes
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCodigoAccess().getConstantesConstantesParserRuleCall_0_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_ruleCodigo166);
                            	    lv_constantes_2_0=ruleConstantes();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"constantes",
                            	            		lv_constantes_2_0, 
                            	            		"Constantes");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop1;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:120:7: (otherlv_3= 'tipo' ( ( (lv_tipocomplejo_4_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )? )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:120:9: otherlv_3= 'tipo' ( ( (lv_tipocomplejo_4_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )?
                    {
                    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCodigo184); 

                        	newLeafNode(otherlv_3, grammarAccess.getCodigoAccess().getTipoKeyword_1_0());
                        
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:124:1: ( ( (lv_tipocomplejo_4_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==27||LA5_0==32) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:124:2: ( (lv_tipocomplejo_4_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )*
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:124:2: ( (lv_tipocomplejo_4_0= ruleTipoComplejo ) )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: (lv_tipocomplejo_4_0= ruleTipoComplejo )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: (lv_tipocomplejo_4_0= ruleTipoComplejo )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:126:3: lv_tipocomplejo_4_0= ruleTipoComplejo
                            {
                             
                            	        newCompositeNode(grammarAccess.getCodigoAccess().getTipocomplejoTipoComplejoParserRuleCall_1_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_ruleCodigo206);
                            lv_tipocomplejo_4_0=ruleTipoComplejo();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"tipocomplejo",
                                    		lv_tipocomplejo_4_0, 
                                    		"TipoComplejo");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:142:2: ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==27||LA4_0==32) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:143:1: (lv_tipocomplejo_5_0= ruleTipoComplejo )
                            	    {
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:143:1: (lv_tipocomplejo_5_0= ruleTipoComplejo )
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:144:3: lv_tipocomplejo_5_0= ruleTipoComplejo
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCodigoAccess().getTipocomplejoTipoComplejoParserRuleCall_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_ruleCodigo227);
                            	    lv_tipocomplejo_5_0=ruleTipoComplejo();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"tipocomplejo",
                            	            		lv_tipocomplejo_5_0, 
                            	            		"TipoComplejo");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:160:7: ( ( (lv_funcion_6_0= ruleSubproceso ) ) ( (lv_funcion_7_0= ruleSubproceso ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=55 && LA8_0<=59)||LA8_0==84) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:160:8: ( (lv_funcion_6_0= ruleSubproceso ) ) ( (lv_funcion_7_0= ruleSubproceso ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:160:8: ( (lv_funcion_6_0= ruleSubproceso ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:161:1: (lv_funcion_6_0= ruleSubproceso )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:161:1: (lv_funcion_6_0= ruleSubproceso )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:162:3: lv_funcion_6_0= ruleSubproceso
                    {
                     
                    	        newCompositeNode(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_ruleCodigo254);
                    lv_funcion_6_0=ruleSubproceso();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                    	        }
                           		add(
                           			current, 
                           			"funcion",
                            		lv_funcion_6_0, 
                            		"Subproceso");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:178:2: ( (lv_funcion_7_0= ruleSubproceso ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=55 && LA7_0<=59)||LA7_0==84) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:1: (lv_funcion_7_0= ruleSubproceso )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:1: (lv_funcion_7_0= ruleSubproceso )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:180:3: lv_funcion_7_0= ruleSubproceso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_ruleCodigo275);
                    	    lv_funcion_7_0=ruleSubproceso();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"funcion",
                    	            		lv_funcion_7_0, 
                    	            		"Subproceso");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:196:5: ( (lv_tiene_8_0= ruleInicio ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:197:1: (lv_tiene_8_0= ruleInicio )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:197:1: (lv_tiene_8_0= ruleInicio )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:198:3: lv_tiene_8_0= ruleInicio
            {
             
            	        newCompositeNode(grammarAccess.getCodigoAccess().getTieneInicioParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_ruleCodigo299);
            lv_tiene_8_0=ruleInicio();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCodigoRule());
            	        }
                   		set(
                   			current, 
                   			"tiene",
                    		lv_tiene_8_0, 
                    		"Inicio");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodigo"


    // $ANTLR start "entryRuleTipoComplejo"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:222:1: entryRuleTipoComplejo returns [EObject current=null] : iv_ruleTipoComplejo= ruleTipoComplejo EOF ;
    public final EObject entryRuleTipoComplejo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoComplejo = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:223:2: (iv_ruleTipoComplejo= ruleTipoComplejo EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:224:2: iv_ruleTipoComplejo= ruleTipoComplejo EOF
            {
             newCompositeNode(grammarAccess.getTipoComplejoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_entryRuleTipoComplejo335);
            iv_ruleTipoComplejo=ruleTipoComplejo();

            state._fsp--;

             current =iv_ruleTipoComplejo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoComplejo345); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoComplejo"


    // $ANTLR start "ruleTipoComplejo"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:231:1: ruleTipoComplejo returns [EObject current=null] : (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz ) ;
    public final EObject ruleTipoComplejo() throws RecognitionException {
        EObject current = null;

        EObject this_Vector_0 = null;

        EObject this_Matriz_1 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:234:28: ( (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:235:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:235:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==32) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:236:5: this_Vector_0= ruleVector
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getVectorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVector_in_ruleTipoComplejo392);
                    this_Vector_0=ruleVector();

                    state._fsp--;

                     
                            current = this_Vector_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:246:5: this_Matriz_1= ruleMatriz
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getMatrizParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_ruleTipoComplejo419);
                    this_Matriz_1=ruleMatriz();

                    state._fsp--;

                     
                            current = this_Matriz_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoComplejo"


    // $ANTLR start "entryRuleSubproceso"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:262:1: entryRuleSubproceso returns [EObject current=null] : iv_ruleSubproceso= ruleSubproceso EOF ;
    public final EObject entryRuleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubproceso = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:263:2: (iv_ruleSubproceso= ruleSubproceso EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:264:2: iv_ruleSubproceso= ruleSubproceso EOF
            {
             newCompositeNode(grammarAccess.getSubprocesoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_entryRuleSubproceso454);
            iv_ruleSubproceso=ruleSubproceso();

            state._fsp--;

             current =iv_ruleSubproceso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubproceso464); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubproceso"


    // $ANTLR start "ruleSubproceso"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:271:1: ruleSubproceso returns [EObject current=null] : (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) ;
    public final EObject ruleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject this_Funcion_0 = null;

        EObject this_Procedimiento_1 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:274:28: ( (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:275:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:275:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=55 && LA10_0<=59)) ) {
                alt10=1;
            }
            else if ( (LA10_0==84) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:276:5: this_Funcion_0= ruleFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getSubprocesoAccess().getFuncionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_ruleSubproceso511);
                    this_Funcion_0=ruleFuncion();

                    state._fsp--;

                     
                            current = this_Funcion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:286:5: this_Procedimiento_1= ruleProcedimiento
                    {
                     
                            newCompositeNode(grammarAccess.getSubprocesoAccess().getProcedimientoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_ruleSubproceso538);
                    this_Procedimiento_1=ruleProcedimiento();

                    state._fsp--;

                     
                            current = this_Procedimiento_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubproceso"


    // $ANTLR start "entryRuleSentencias"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:302:1: entryRuleSentencias returns [EObject current=null] : iv_ruleSentencias= ruleSentencias EOF ;
    public final EObject entryRuleSentencias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentencias = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:303:2: (iv_ruleSentencias= ruleSentencias EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:304:2: iv_ruleSentencias= ruleSentencias EOF
            {
             newCompositeNode(grammarAccess.getSentenciasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_entryRuleSentencias573);
            iv_ruleSentencias=ruleSentencias();

            state._fsp--;

             current =iv_ruleSentencias; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentencias583); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSentencias"


    // $ANTLR start "ruleSentencias"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:1: ruleSentencias returns [EObject current=null] : (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_Asignacion_1= ruleAsignacion | this_Escribir_2= ruleEscribir | this_Leer_3= ruleLeer | this_incremento_4= ruleincremento | this_Bloque_5= ruleBloque ) ;
    public final EObject ruleSentencias() throws RecognitionException {
        EObject current = null;

        EObject this_LlamadaFuncion_0 = null;

        EObject this_Asignacion_1 = null;

        EObject this_Escribir_2 = null;

        EObject this_Leer_3 = null;

        EObject this_incremento_4 = null;

        EObject this_Bloque_5 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:314:28: ( (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_Asignacion_1= ruleAsignacion | this_Escribir_2= ruleEscribir | this_Leer_3= ruleLeer | this_incremento_4= ruleincremento | this_Bloque_5= ruleBloque ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:315:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_Asignacion_1= ruleAsignacion | this_Escribir_2= ruleEscribir | this_Leer_3= ruleLeer | this_incremento_4= ruleincremento | this_Bloque_5= ruleBloque )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:315:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_Asignacion_1= ruleAsignacion | this_Escribir_2= ruleEscribir | this_Leer_3= ruleLeer | this_incremento_4= ruleincremento | this_Bloque_5= ruleBloque )
            int alt11=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case RULE_MAT:
                case 26:
                    {
                    alt11=2;
                    }
                    break;
                case 16:
                    {
                    alt11=1;
                    }
                    break;
                case 79:
                case 80:
                case 81:
                    {
                    alt11=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 79:
                case 80:
                case 81:
                    {
                    alt11=5;
                    }
                    break;
                case RULE_MAT:
                case 26:
                    {
                    alt11=2;
                    }
                    break;
                case 16:
                    {
                    alt11=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }

                }
                break;
            case 39:
                {
                alt11=3;
                }
                break;
            case 40:
                {
                alt11=4;
                }
                break;
            case 41:
            case 44:
            case 47:
            case 49:
            case 52:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:316:5: this_LlamadaFuncion_0= ruleLlamadaFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getLlamadaFuncionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_ruleSentencias630);
                    this_LlamadaFuncion_0=ruleLlamadaFuncion();

                    state._fsp--;

                     
                            current = this_LlamadaFuncion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:326:5: this_Asignacion_1= ruleAsignacion
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getAsignacionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_ruleSentencias657);
                    this_Asignacion_1=ruleAsignacion();

                    state._fsp--;

                     
                            current = this_Asignacion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:336:5: this_Escribir_2= ruleEscribir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getEscribirParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_ruleSentencias684);
                    this_Escribir_2=ruleEscribir();

                    state._fsp--;

                     
                            current = this_Escribir_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:346:5: this_Leer_3= ruleLeer
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getLeerParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLeer_in_ruleSentencias711);
                    this_Leer_3=ruleLeer();

                    state._fsp--;

                     
                            current = this_Leer_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:356:5: this_incremento_4= ruleincremento
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getIncrementoParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleincremento_in_ruleSentencias738);
                    this_incremento_4=ruleincremento();

                    state._fsp--;

                     
                            current = this_incremento_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:366:5: this_Bloque_5= ruleBloque
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getBloqueParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBloque_in_ruleSentencias765);
                    this_Bloque_5=ruleBloque();

                    state._fsp--;

                     
                            current = this_Bloque_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSentencias"


    // $ANTLR start "entryRuleBloque"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:382:1: entryRuleBloque returns [EObject current=null] : iv_ruleBloque= ruleBloque EOF ;
    public final EObject entryRuleBloque() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBloque = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:383:2: (iv_ruleBloque= ruleBloque EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:384:2: iv_ruleBloque= ruleBloque EOF
            {
             newCompositeNode(grammarAccess.getBloqueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBloque_in_entryRuleBloque800);
            iv_ruleBloque=ruleBloque();

            state._fsp--;

             current =iv_ruleBloque; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBloque810); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBloque"


    // $ANTLR start "ruleBloque"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:391:1: ruleBloque returns [EObject current=null] : (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) ;
    public final EObject ruleBloque() throws RecognitionException {
        EObject current = null;

        EObject this_Si_0 = null;

        EObject this_mientras_1 = null;

        EObject this_repetir_2 = null;

        EObject this_desde_3 = null;

        EObject this_segun_4 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:394:28: ( (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:395:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:395:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt12=1;
                }
                break;
            case 44:
                {
                alt12=2;
                }
                break;
            case 47:
                {
                alt12=3;
                }
                break;
            case 49:
                {
                alt12=4;
                }
                break;
            case 52:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:5: this_Si_0= ruleSi
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSiParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSi_in_ruleBloque857);
                    this_Si_0=ruleSi();

                    state._fsp--;

                     
                            current = this_Si_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:406:5: this_mientras_1= rulemientras
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getMientrasParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemientras_in_ruleBloque884);
                    this_mientras_1=rulemientras();

                    state._fsp--;

                     
                            current = this_mientras_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:416:5: this_repetir_2= rulerepetir
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getRepetirParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulerepetir_in_ruleBloque911);
                    this_repetir_2=rulerepetir();

                    state._fsp--;

                     
                            current = this_repetir_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:426:5: this_desde_3= ruledesde
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getDesdeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruledesde_in_ruleBloque938);
                    this_desde_3=ruledesde();

                    state._fsp--;

                     
                            current = this_desde_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:436:5: this_segun_4= rulesegun
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSegunParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulesegun_in_ruleBloque965);
                    this_segun_4=rulesegun();

                    state._fsp--;

                     
                            current = this_segun_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBloque"


    // $ANTLR start "entryRuleDeclaracion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:452:1: entryRuleDeclaracion returns [EObject current=null] : iv_ruleDeclaracion= ruleDeclaracion EOF ;
    public final EObject entryRuleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:453:2: (iv_ruleDeclaracion= ruleDeclaracion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:454:2: iv_ruleDeclaracion= ruleDeclaracion EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_entryRuleDeclaracion1000);
            iv_ruleDeclaracion=ruleDeclaracion();

            state._fsp--;

             current =iv_ruleDeclaracion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracion1010); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaracion"


    // $ANTLR start "ruleDeclaracion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:461:1: ruleDeclaracion returns [EObject current=null] : (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) ;
    public final EObject ruleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject this_DeclaracionVariable_0 = null;

        EObject this_DeclaracionPropia_1 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:464:28: ( (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:465:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:465:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=55 && LA13_0<=59)) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:466:5: this_DeclaracionVariable_0= ruleDeclaracionVariable
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionVariableParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_ruleDeclaracion1057);
                    this_DeclaracionVariable_0=ruleDeclaracionVariable();

                    state._fsp--;

                     
                            current = this_DeclaracionVariable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:476:5: this_DeclaracionPropia_1= ruleDeclaracionPropia
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionPropiaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_ruleDeclaracion1084);
                    this_DeclaracionPropia_1=ruleDeclaracionPropia();

                    state._fsp--;

                     
                            current = this_DeclaracionPropia_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaracion"


    // $ANTLR start "entryRuleInternas"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:492:1: entryRuleInternas returns [EObject current=null] : iv_ruleInternas= ruleInternas EOF ;
    public final EObject entryRuleInternas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternas = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:493:2: (iv_ruleInternas= ruleInternas EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:494:2: iv_ruleInternas= ruleInternas EOF
            {
             newCompositeNode(grammarAccess.getInternasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInternas_in_entryRuleInternas1119);
            iv_ruleInternas=ruleInternas();

            state._fsp--;

             current =iv_ruleInternas; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInternas1129); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInternas"


    // $ANTLR start "ruleInternas"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:501:1: ruleInternas returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleNombreInterna ) ) otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) otherlv_3= ')' ) ;
    public final EObject ruleInternas() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        EObject lv_operador_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:504:28: ( ( ( (lv_nombre_0_0= ruleNombreInterna ) ) otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) otherlv_3= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:505:1: ( ( (lv_nombre_0_0= ruleNombreInterna ) ) otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) otherlv_3= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:505:1: ( ( (lv_nombre_0_0= ruleNombreInterna ) ) otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) otherlv_3= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:505:2: ( (lv_nombre_0_0= ruleNombreInterna ) ) otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) otherlv_3= ')'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:505:2: ( (lv_nombre_0_0= ruleNombreInterna ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:506:1: (lv_nombre_0_0= ruleNombreInterna )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:506:1: (lv_nombre_0_0= ruleNombreInterna )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:507:3: lv_nombre_0_0= ruleNombreInterna
            {
             
            	        newCompositeNode(grammarAccess.getInternasAccess().getNombreNombreInternaParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_ruleInternas1175);
            lv_nombre_0_0=ruleNombreInterna();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInternasRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"NombreInterna");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleInternas1187); 

                	newLeafNode(otherlv_1, grammarAccess.getInternasAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:527:1: ( (lv_operador_2_0= ruleOperador ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:528:1: (lv_operador_2_0= ruleOperador )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:528:1: (lv_operador_2_0= ruleOperador )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:529:3: lv_operador_2_0= ruleOperador
            {
             
            	        newCompositeNode(grammarAccess.getInternasAccess().getOperadorOperadorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleInternas1208);
            lv_operador_2_0=ruleOperador();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInternasRule());
            	        }
                   		set(
                   			current, 
                   			"operador",
                    		lv_operador_2_0, 
                    		"Operador");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInternas1220); 

                	newLeafNode(otherlv_3, grammarAccess.getInternasAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInternas"


    // $ANTLR start "entryRuleNombreInterna"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:557:1: entryRuleNombreInterna returns [String current=null] : iv_ruleNombreInterna= ruleNombreInterna EOF ;
    public final String entryRuleNombreInterna() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNombreInterna = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:2: (iv_ruleNombreInterna= ruleNombreInterna EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:559:2: iv_ruleNombreInterna= ruleNombreInterna EOF
            {
             newCompositeNode(grammarAccess.getNombreInternaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna1257);
            iv_ruleNombreInterna=ruleNombreInterna();

            state._fsp--;

             current =iv_ruleNombreInterna.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNombreInterna1268); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNombreInterna"


    // $ANTLR start "ruleNombreInterna"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:566:1: ruleNombreInterna returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' ) ;
    public final AntlrDatatypeRuleToken ruleNombreInterna() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:569:28: ( (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:570:1: (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:570:1: (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' )
            int alt14=8;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt14=1;
                }
                break;
            case 19:
                {
                alt14=2;
                }
                break;
            case 20:
                {
                alt14=3;
                }
                break;
            case 21:
                {
                alt14=4;
                }
                break;
            case 22:
                {
                alt14=5;
                }
                break;
            case 23:
                {
                alt14=6;
                }
                break;
            case 24:
                {
                alt14=7;
                }
                break;
            case 25:
                {
                alt14=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:571:2: kw= 'cos'
                    {
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleNombreInterna1306); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCosKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:578:2: kw= 'cuadrado'
                    {
                    kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNombreInterna1325); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCuadradoKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:585:2: kw= 'exp'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNombreInterna1344); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getExpKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:592:2: kw= 'ln'
                    {
                    kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNombreInterna1363); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLnKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:599:2: kw= 'log'
                    {
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleNombreInterna1382); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLogKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:606:2: kw= 'sen'
                    {
                    kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNombreInterna1401); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSenKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:613:2: kw= 'sqrt'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNombreInterna1420); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSqrtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:620:2: kw= 'longitud'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNombreInterna1439); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLongitudKeyword_7()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNombreInterna"


    // $ANTLR start "entryRuleOperador"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:633:1: entryRuleOperador returns [EObject current=null] : iv_ruleOperador= ruleOperador EOF ;
    public final EObject entryRuleOperador() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperador = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:634:2: (iv_ruleOperador= ruleOperador EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:635:2: iv_ruleOperador= ruleOperador EOF
            {
             newCompositeNode(grammarAccess.getOperadorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_entryRuleOperador1479);
            iv_ruleOperador=ruleOperador();

            state._fsp--;

             current =iv_ruleOperador; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperador1489); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperador"


    // $ANTLR start "ruleOperador"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:642:1: ruleOperador returns [EObject current=null] : (this_VariableID_0= ruleVariableID | this_ConstCadena_1= ruleConstCadena | this_Caracter_2= ruleCaracter | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_ValorBooleano_5= ruleValorBooleano ) ;
    public final EObject ruleOperador() throws RecognitionException {
        EObject current = null;

        EObject this_VariableID_0 = null;

        EObject this_ConstCadena_1 = null;

        EObject this_Caracter_2 = null;

        EObject this_NumeroEntero_3 = null;

        EObject this_NumeroDecimal_4 = null;

        EObject this_ValorBooleano_5 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:645:28: ( (this_VariableID_0= ruleVariableID | this_ConstCadena_1= ruleConstCadena | this_Caracter_2= ruleCaracter | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_ValorBooleano_5= ruleValorBooleano ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:646:1: (this_VariableID_0= ruleVariableID | this_ConstCadena_1= ruleConstCadena | this_Caracter_2= ruleCaracter | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_ValorBooleano_5= ruleValorBooleano )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:646:1: (this_VariableID_0= ruleVariableID | this_ConstCadena_1= ruleConstCadena | this_Caracter_2= ruleCaracter | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_ValorBooleano_5= ruleValorBooleano )
            int alt15=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt15=1;
                }
                break;
            case RULE_CAD:
                {
                alt15=2;
                }
                break;
            case RULE_CAR:
                {
                alt15=3;
                }
                break;
            case 60:
                {
                int LA15_4 = input.LA(2);

                if ( (LA15_4==RULE_INT) ) {
                    int LA15_5 = input.LA(3);

                    if ( (LA15_5==61) ) {
                        alt15=5;
                    }
                    else if ( (LA15_5==EOF||LA15_5==17||(LA15_5>=37 && LA15_5<=38)) ) {
                        alt15=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA15_4==61) ) {
                    alt15=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA15_5 = input.LA(2);

                if ( (LA15_5==61) ) {
                    alt15=5;
                }
                else if ( (LA15_5==EOF||LA15_5==17||(LA15_5>=37 && LA15_5<=38)) ) {
                    alt15=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 5, input);

                    throw nvae;
                }
                }
                break;
            case 61:
                {
                alt15=5;
                }
                break;
            case 64:
            case 65:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:5: this_VariableID_0= ruleVariableID
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getVariableIDParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleOperador1536);
                    this_VariableID_0=ruleVariableID();

                    state._fsp--;

                     
                            current = this_VariableID_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:657:5: this_ConstCadena_1= ruleConstCadena
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getConstCadenaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_ruleOperador1563);
                    this_ConstCadena_1=ruleConstCadena();

                    state._fsp--;

                     
                            current = this_ConstCadena_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:667:5: this_Caracter_2= ruleCaracter
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getCaracterParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_ruleOperador1590);
                    this_Caracter_2=ruleCaracter();

                    state._fsp--;

                     
                            current = this_Caracter_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:677:5: this_NumeroEntero_3= ruleNumeroEntero
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getNumeroEnteroParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_ruleOperador1617);
                    this_NumeroEntero_3=ruleNumeroEntero();

                    state._fsp--;

                     
                            current = this_NumeroEntero_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:687:5: this_NumeroDecimal_4= ruleNumeroDecimal
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getNumeroDecimalParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_ruleOperador1644);
                    this_NumeroDecimal_4=ruleNumeroDecimal();

                    state._fsp--;

                     
                            current = this_NumeroDecimal_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:697:5: this_ValorBooleano_5= ruleValorBooleano
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getValorBooleanoParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_ruleOperador1671);
                    this_ValorBooleano_5=ruleValorBooleano();

                    state._fsp--;

                     
                            current = this_ValorBooleano_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperador"


    // $ANTLR start "entryRuleCaracter"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:713:1: entryRuleCaracter returns [EObject current=null] : iv_ruleCaracter= ruleCaracter EOF ;
    public final EObject entryRuleCaracter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaracter = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:714:2: (iv_ruleCaracter= ruleCaracter EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:715:2: iv_ruleCaracter= ruleCaracter EOF
            {
             newCompositeNode(grammarAccess.getCaracterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_entryRuleCaracter1706);
            iv_ruleCaracter=ruleCaracter();

            state._fsp--;

             current =iv_ruleCaracter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCaracter1716); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaracter"


    // $ANTLR start "ruleCaracter"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:722:1: ruleCaracter returns [EObject current=null] : ( (lv_contenido_0_0= RULE_CAR ) ) ;
    public final EObject ruleCaracter() throws RecognitionException {
        EObject current = null;

        Token lv_contenido_0_0=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:725:28: ( ( (lv_contenido_0_0= RULE_CAR ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:726:1: ( (lv_contenido_0_0= RULE_CAR ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:726:1: ( (lv_contenido_0_0= RULE_CAR ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:727:1: (lv_contenido_0_0= RULE_CAR )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:727:1: (lv_contenido_0_0= RULE_CAR )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:728:3: lv_contenido_0_0= RULE_CAR
            {
            lv_contenido_0_0=(Token)match(input,RULE_CAR,FollowSets000.FOLLOW_RULE_CAR_in_ruleCaracter1757); 

            			newLeafNode(lv_contenido_0_0, grammarAccess.getCaracterAccess().getContenidoCARTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCaracterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"contenido",
                    		lv_contenido_0_0, 
                    		"CAR");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaracter"


    // $ANTLR start "entryRulevalor"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:752:1: entryRulevalor returns [EObject current=null] : iv_rulevalor= rulevalor EOF ;
    public final EObject entryRulevalor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalor = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:753:2: (iv_rulevalor= rulevalor EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:754:2: iv_rulevalor= rulevalor EOF
            {
             newCompositeNode(grammarAccess.getValorRule()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_entryRulevalor1797);
            iv_rulevalor=rulevalor();

            state._fsp--;

             current =iv_rulevalor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulevalor1807); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevalor"


    // $ANTLR start "rulevalor"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:761:1: rulevalor returns [EObject current=null] : (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria ) ;
    public final EObject rulevalor() throws RecognitionException {
        EObject current = null;

        EObject this_LlamadaFuncion_0 = null;

        EObject this_VariableID_1 = null;

        EObject this_ConstCadena_2 = null;

        EObject this_NumeroEntero_3 = null;

        EObject this_NumeroDecimal_4 = null;

        EObject this_operacion_5 = null;

        EObject this_ValorBooleano_6 = null;

        EObject this_Caracter_7 = null;

        EObject this_Internas_8 = null;

        EObject this_unaria_9 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:764:28: ( (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:765:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:765:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria )
            int alt16=10;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:766:5: this_LlamadaFuncion_0= ruleLlamadaFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getLlamadaFuncionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_rulevalor1854);
                    this_LlamadaFuncion_0=ruleLlamadaFuncion();

                    state._fsp--;

                     
                            current = this_LlamadaFuncion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:776:5: this_VariableID_1= ruleVariableID
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getVariableIDParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rulevalor1881);
                    this_VariableID_1=ruleVariableID();

                    state._fsp--;

                     
                            current = this_VariableID_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:786:5: this_ConstCadena_2= ruleConstCadena
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getConstCadenaParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_rulevalor1908);
                    this_ConstCadena_2=ruleConstCadena();

                    state._fsp--;

                     
                            current = this_ConstCadena_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:796:5: this_NumeroEntero_3= ruleNumeroEntero
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getNumeroEnteroParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_rulevalor1935);
                    this_NumeroEntero_3=ruleNumeroEntero();

                    state._fsp--;

                     
                            current = this_NumeroEntero_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:806:5: this_NumeroDecimal_4= ruleNumeroDecimal
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getNumeroDecimalParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_rulevalor1962);
                    this_NumeroDecimal_4=ruleNumeroDecimal();

                    state._fsp--;

                     
                            current = this_NumeroDecimal_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:816:5: this_operacion_5= ruleoperacion
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getOperacionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulevalor1989);
                    this_operacion_5=ruleoperacion();

                    state._fsp--;

                     
                            current = this_operacion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:826:5: this_ValorBooleano_6= ruleValorBooleano
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getValorBooleanoParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_rulevalor2016);
                    this_ValorBooleano_6=ruleValorBooleano();

                    state._fsp--;

                     
                            current = this_ValorBooleano_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:836:5: this_Caracter_7= ruleCaracter
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getCaracterParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_rulevalor2043);
                    this_Caracter_7=ruleCaracter();

                    state._fsp--;

                     
                            current = this_Caracter_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:846:5: this_Internas_8= ruleInternas
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getInternasParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInternas_in_rulevalor2070);
                    this_Internas_8=ruleInternas();

                    state._fsp--;

                     
                            current = this_Internas_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:856:5: this_unaria_9= ruleunaria
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getUnariaParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleunaria_in_rulevalor2097);
                    this_unaria_9=ruleunaria();

                    state._fsp--;

                     
                            current = this_unaria_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalor"


    // $ANTLR start "entryRuleConstantes"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:872:1: entryRuleConstantes returns [EObject current=null] : iv_ruleConstantes= ruleConstantes EOF ;
    public final EObject entryRuleConstantes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantes = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:873:2: (iv_ruleConstantes= ruleConstantes EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:874:2: iv_ruleConstantes= ruleConstantes EOF
            {
             newCompositeNode(grammarAccess.getConstantesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_entryRuleConstantes2132);
            iv_ruleConstantes=ruleConstantes();

            state._fsp--;

             current =iv_ruleConstantes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantes2142); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantes"


    // $ANTLR start "ruleConstantes"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:881:1: ruleConstantes returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) ) ) ;
    public final EObject ruleConstantes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_valor_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:884:28: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:885:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:885:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:885:2: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:885:2: ( (lv_variable_0_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:886:1: (lv_variable_0_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:886:1: (lv_variable_0_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:887:3: lv_variable_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getVariableVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleConstantes2188);
            lv_variable_0_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantesRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_0_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleConstantes2200); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantesAccess().getEqualsSignKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:907:1: ( (lv_valor_2_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:908:1: (lv_valor_2_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:908:1: (lv_valor_2_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:909:3: lv_valor_2_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getValorValorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleConstantes2221);
            lv_valor_2_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantesRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_2_0, 
                    		"valor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantes"


    // $ANTLR start "entryRuleVector"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:933:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:934:2: (iv_ruleVector= ruleVector EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:935:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVector_in_entryRuleVector2257);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVector2267); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVector"


    // $ANTLR start "ruleVector"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:942:1: ruleVector returns [EObject current=null] : (otherlv_0= 'vector' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '] ' otherlv_4= 'de ' ( (lv_tipoInterno_5_0= ruleTipoVariable ) ) otherlv_6= ' : ' ( (lv_nombre_7_0= ruleEString ) ) ) ;
    public final EObject ruleVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_valor_2_0 = null;

        AntlrDatatypeRuleToken lv_tipoInterno_5_0 = null;

        AntlrDatatypeRuleToken lv_nombre_7_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:945:28: ( (otherlv_0= 'vector' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '] ' otherlv_4= 'de ' ( (lv_tipoInterno_5_0= ruleTipoVariable ) ) otherlv_6= ' : ' ( (lv_nombre_7_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:946:1: (otherlv_0= 'vector' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '] ' otherlv_4= 'de ' ( (lv_tipoInterno_5_0= ruleTipoVariable ) ) otherlv_6= ' : ' ( (lv_nombre_7_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:946:1: (otherlv_0= 'vector' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '] ' otherlv_4= 'de ' ( (lv_tipoInterno_5_0= ruleTipoVariable ) ) otherlv_6= ' : ' ( (lv_nombre_7_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:946:3: otherlv_0= 'vector' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '] ' otherlv_4= 'de ' ( (lv_tipoInterno_5_0= ruleTipoVariable ) ) otherlv_6= ' : ' ( (lv_nombre_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleVector2304); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getVectorKeyword_0());
                
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleVector2316); 

                	newLeafNode(otherlv_1, grammarAccess.getVectorAccess().getSpaceLeftSquareBracketKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:954:1: ( (lv_valor_2_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:955:1: (lv_valor_2_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:955:1: (lv_valor_2_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:956:3: lv_valor_2_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getValorValorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleVector2337);
            lv_valor_2_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVectorRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_2_0, 
                    		"valor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleVector2349); 

                	newLeafNode(otherlv_3, grammarAccess.getVectorAccess().getRightSquareBracketSpaceKeyword_3());
                
            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleVector2361); 

                	newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getDeKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:980:1: ( (lv_tipoInterno_5_0= ruleTipoVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:981:1: (lv_tipoInterno_5_0= ruleTipoVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:981:1: (lv_tipoInterno_5_0= ruleTipoVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:982:3: lv_tipoInterno_5_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getTipoInternoTipoVariableParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleVector2382);
            lv_tipoInterno_5_0=ruleTipoVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVectorRule());
            	        }
                   		set(
                   			current, 
                   			"tipoInterno",
                    		lv_tipoInterno_5_0, 
                    		"TipoVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleVector2394); 

                	newLeafNode(otherlv_6, grammarAccess.getVectorAccess().getSpaceColonSpaceKeyword_6());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1002:1: ( (lv_nombre_7_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:1: (lv_nombre_7_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:1: (lv_nombre_7_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1004:3: lv_nombre_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getNombreEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVector2415);
            lv_nombre_7_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVectorRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_7_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVector"


    // $ANTLR start "entryRuleMatriz"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1028:1: entryRuleMatriz returns [EObject current=null] : iv_ruleMatriz= ruleMatriz EOF ;
    public final EObject entryRuleMatriz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatriz = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1029:2: (iv_ruleMatriz= ruleMatriz EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1030:2: iv_ruleMatriz= ruleMatriz EOF
            {
             newCompositeNode(grammarAccess.getMatrizRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_entryRuleMatriz2451);
            iv_ruleMatriz=ruleMatriz();

            state._fsp--;

             current =iv_ruleMatriz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatriz2461); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatriz"


    // $ANTLR start "ruleMatriz"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1037:1: ruleMatriz returns [EObject current=null] : (otherlv_0= 'matriz' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '][' ( (lv_valor_4_0= rulevalor ) ) otherlv_5= '] ' otherlv_6= 'de ' ( (lv_tipoInterno_7_0= ruleTipoVariable ) ) otherlv_8= ' : ' ( (lv_nombre_9_0= ruleEString ) ) ) ;
    public final EObject ruleMatriz() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_valor_2_0 = null;

        EObject lv_valor_4_0 = null;

        AntlrDatatypeRuleToken lv_tipoInterno_7_0 = null;

        AntlrDatatypeRuleToken lv_nombre_9_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1040:28: ( (otherlv_0= 'matriz' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '][' ( (lv_valor_4_0= rulevalor ) ) otherlv_5= '] ' otherlv_6= 'de ' ( (lv_tipoInterno_7_0= ruleTipoVariable ) ) otherlv_8= ' : ' ( (lv_nombre_9_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1041:1: (otherlv_0= 'matriz' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '][' ( (lv_valor_4_0= rulevalor ) ) otherlv_5= '] ' otherlv_6= 'de ' ( (lv_tipoInterno_7_0= ruleTipoVariable ) ) otherlv_8= ' : ' ( (lv_nombre_9_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1041:1: (otherlv_0= 'matriz' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '][' ( (lv_valor_4_0= rulevalor ) ) otherlv_5= '] ' otherlv_6= 'de ' ( (lv_tipoInterno_7_0= ruleTipoVariable ) ) otherlv_8= ' : ' ( (lv_nombre_9_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1041:3: otherlv_0= 'matriz' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '][' ( (lv_valor_4_0= rulevalor ) ) otherlv_5= '] ' otherlv_6= 'de ' ( (lv_tipoInterno_7_0= ruleTipoVariable ) ) otherlv_8= ' : ' ( (lv_nombre_9_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMatriz2498); 

                	newLeafNode(otherlv_0, grammarAccess.getMatrizAccess().getMatrizKeyword_0());
                
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMatriz2510); 

                	newLeafNode(otherlv_1, grammarAccess.getMatrizAccess().getSpaceLeftSquareBracketKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1049:1: ( (lv_valor_2_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1050:1: (lv_valor_2_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1050:1: (lv_valor_2_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1051:3: lv_valor_2_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorValorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleMatriz2531);
            lv_valor_2_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrizRule());
            	        }
                   		add(
                   			current, 
                   			"valor",
                    		lv_valor_2_0, 
                    		"valor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMatriz2543); 

                	newLeafNode(otherlv_3, grammarAccess.getMatrizAccess().getRightSquareBracketLeftSquareBracketKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:1: ( (lv_valor_4_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1072:1: (lv_valor_4_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1072:1: (lv_valor_4_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:3: lv_valor_4_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorValorParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleMatriz2564);
            lv_valor_4_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrizRule());
            	        }
                   		add(
                   			current, 
                   			"valor",
                    		lv_valor_4_0, 
                    		"valor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMatriz2576); 

                	newLeafNode(otherlv_5, grammarAccess.getMatrizAccess().getRightSquareBracketSpaceKeyword_5());
                
            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMatriz2588); 

                	newLeafNode(otherlv_6, grammarAccess.getMatrizAccess().getDeKeyword_6());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1097:1: ( (lv_tipoInterno_7_0= ruleTipoVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1098:1: (lv_tipoInterno_7_0= ruleTipoVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1098:1: (lv_tipoInterno_7_0= ruleTipoVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1099:3: lv_tipoInterno_7_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getTipoInternoTipoVariableParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleMatriz2609);
            lv_tipoInterno_7_0=ruleTipoVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrizRule());
            	        }
                   		set(
                   			current, 
                   			"tipoInterno",
                    		lv_tipoInterno_7_0, 
                    		"TipoVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMatriz2621); 

                	newLeafNode(otherlv_8, grammarAccess.getMatrizAccess().getSpaceColonSpaceKeyword_8());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1119:1: ( (lv_nombre_9_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1120:1: (lv_nombre_9_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1120:1: (lv_nombre_9_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1121:3: lv_nombre_9_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getNombreEStringParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatriz2642);
            lv_nombre_9_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrizRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_9_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatriz"


    // $ANTLR start "entryRuleInicio"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1145:1: entryRuleInicio returns [EObject current=null] : iv_ruleInicio= ruleInicio EOF ;
    public final EObject entryRuleInicio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInicio = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1146:2: (iv_ruleInicio= ruleInicio EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1147:2: iv_ruleInicio= ruleInicio EOF
            {
             newCompositeNode(grammarAccess.getInicioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_entryRuleInicio2678);
            iv_ruleInicio=ruleInicio();

            state._fsp--;

             current =iv_ruleInicio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInicio2688); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInicio"


    // $ANTLR start "ruleInicio"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1154:1: ruleInicio returns [EObject current=null] : ( () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio' ) ;
    public final EObject ruleInicio() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_declaracion_2_0 = null;

        EObject lv_declaracion_3_0 = null;

        EObject lv_tiene_5_0 = null;

        EObject lv_tiene_6_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1157:28: ( ( () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1158:1: ( () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1158:1: ( () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1158:2: () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1158:2: ()
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1159:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInicioAccess().getInicioAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleInicio2734); 

                	newLeafNode(otherlv_1, grammarAccess.getInicioAccess().getVarKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1168:1: ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)||(LA18_0>=55 && LA18_0<=59)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1168:2: ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1168:2: ( (lv_declaracion_2_0= ruleDeclaracion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1169:1: (lv_declaracion_2_0= ruleDeclaracion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1169:1: (lv_declaracion_2_0= ruleDeclaracion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1170:3: lv_declaracion_2_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio2756);
                    lv_declaracion_2_0=ruleDeclaracion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInicioRule());
                    	        }
                           		add(
                           			current, 
                           			"declaracion",
                            		lv_declaracion_2_0, 
                            		"Declaracion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1186:2: ( (lv_declaracion_3_0= ruleDeclaracion ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)||(LA17_0>=55 && LA17_0<=59)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1187:1: (lv_declaracion_3_0= ruleDeclaracion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1187:1: (lv_declaracion_3_0= ruleDeclaracion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:3: lv_declaracion_3_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio2777);
                    	    lv_declaracion_3_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInicioRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declaracion",
                    	            		lv_declaracion_3_0, 
                    	            		"Declaracion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleInicio2792); 

                	newLeafNode(otherlv_4, grammarAccess.getInicioAccess().getInicioKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1208:1: ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)||(LA20_0>=39 && LA20_0<=41)||LA20_0==44||LA20_0==47||LA20_0==49||LA20_0==52) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1208:2: ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1208:2: ( (lv_tiene_5_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1209:1: (lv_tiene_5_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1209:1: (lv_tiene_5_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1210:3: lv_tiene_5_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio2814);
                    lv_tiene_5_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInicioRule());
                    	        }
                           		add(
                           			current, 
                           			"tiene",
                            		lv_tiene_5_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1226:2: ( (lv_tiene_6_0= ruleSentencias ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)||(LA19_0>=39 && LA19_0<=41)||LA19_0==44||LA19_0==47||LA19_0==49||LA19_0==52) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1227:1: (lv_tiene_6_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1227:1: (lv_tiene_6_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1228:3: lv_tiene_6_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio2835);
                    	    lv_tiene_6_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInicioRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"tiene",
                    	            		lv_tiene_6_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleInicio2850); 

                	newLeafNode(otherlv_7, grammarAccess.getInicioAccess().getFin_inicioKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInicio"


    // $ANTLR start "entryRuleEString"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1256:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1257:2: (iv_ruleEString= ruleEString EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1258:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2887);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2898); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1265:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1268:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1269:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1269:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1269:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2938); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1277:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2964); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleDeclaracionVariable"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1292:1: entryRuleDeclaracionVariable returns [EObject current=null] : iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF ;
    public final EObject entryRuleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionVariable = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1293:2: (iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1294:2: iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable3009);
            iv_ruleDeclaracionVariable=ruleDeclaracionVariable();

            state._fsp--;

             current =iv_ruleDeclaracionVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionVariable3019); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaracionVariable"


    // $ANTLR start "ruleDeclaracionVariable"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1301:1: ruleDeclaracionVariable returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) )+ otherlv_1= ':' ( (lv_tieneIDs_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_tieneIDs_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_tieneIDs_2_0 = null;

        EObject lv_tieneIDs_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1304:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) )+ otherlv_1= ':' ( (lv_tieneIDs_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_tieneIDs_4_0= ruleVariable ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1305:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) )+ otherlv_1= ':' ( (lv_tieneIDs_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_tieneIDs_4_0= ruleVariable ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1305:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) )+ otherlv_1= ':' ( (lv_tieneIDs_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_tieneIDs_4_0= ruleVariable ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1305:2: ( (lv_tipo_0_0= ruleTipoVariable ) )+ otherlv_1= ':' ( (lv_tieneIDs_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_tieneIDs_4_0= ruleVariable ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1305:2: ( (lv_tipo_0_0= ruleTipoVariable ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=55 && LA22_0<=59)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1306:1: (lv_tipo_0_0= ruleTipoVariable )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1306:1: (lv_tipo_0_0= ruleTipoVariable )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1307:3: lv_tipo_0_0= ruleTipoVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable3065);
            	    lv_tipo_0_0=ruleTipoVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclaracionVariableRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"tipo",
            	            		lv_tipo_0_0, 
            	            		"TipoVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleDeclaracionVariable3078); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionVariableAccess().getColonKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1327:1: ( (lv_tieneIDs_2_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1328:1: (lv_tieneIDs_2_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1328:1: (lv_tieneIDs_2_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1329:3: lv_tieneIDs_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getTieneIDsVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable3099);
            lv_tieneIDs_2_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclaracionVariableRule());
            	        }
                   		add(
                   			current, 
                   			"tieneIDs",
                    		lv_tieneIDs_2_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1345:2: (otherlv_3= ',' ( (lv_tieneIDs_4_0= ruleVariable ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1345:4: otherlv_3= ',' ( (lv_tieneIDs_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDeclaracionVariable3112); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionVariableAccess().getCommaKeyword_3_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1349:1: ( (lv_tieneIDs_4_0= ruleVariable ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1350:1: (lv_tieneIDs_4_0= ruleVariable )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1350:1: (lv_tieneIDs_4_0= ruleVariable )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1351:3: lv_tieneIDs_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getTieneIDsVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable3133);
            	    lv_tieneIDs_4_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclaracionVariableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tieneIDs",
            	            		lv_tieneIDs_4_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaracionVariable"


    // $ANTLR start "entryRuleDeclaracionPropia"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1375:1: entryRuleDeclaracionPropia returns [EObject current=null] : iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF ;
    public final EObject entryRuleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionPropia = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1376:2: (iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:2: iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionPropiaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia3171);
            iv_ruleDeclaracionPropia=ruleDeclaracionPropia();

            state._fsp--;

             current =iv_ruleDeclaracionPropia; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionPropia3181); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaracionPropia"


    // $ANTLR start "ruleDeclaracionPropia"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1384:1: ruleDeclaracionPropia returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleEString ) )+ otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1387:28: ( ( ( (lv_tipo_0_0= ruleEString ) )+ otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1388:1: ( ( (lv_tipo_0_0= ruleEString ) )+ otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1388:1: ( ( (lv_tipo_0_0= ruleEString ) )+ otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1388:2: ( (lv_tipo_0_0= ruleEString ) )+ otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1388:2: ( (lv_tipo_0_0= ruleEString ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1389:1: (lv_tipo_0_0= ruleEString )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1389:1: (lv_tipo_0_0= ruleEString )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1390:3: lv_tipo_0_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getTipoEStringParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDeclaracionPropia3227);
            	    lv_tipo_0_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclaracionPropiaRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"tipo",
            	            		lv_tipo_0_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleDeclaracionPropia3240); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionPropiaAccess().getColonKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1410:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1411:1: (lv_variable_2_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1411:1: (lv_variable_2_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1412:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia3261);
            lv_variable_2_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclaracionPropiaRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1428:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1428:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDeclaracionPropia3274); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionPropiaAccess().getCommaKeyword_3_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1432:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1433:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1433:1: (lv_variable_4_0= ruleVariable )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1434:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia3295);
            	    lv_variable_4_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclaracionPropiaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variable",
            	            		lv_variable_4_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaracionPropia"


    // $ANTLR start "entryRuleLlamadaFuncion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1458:1: entryRuleLlamadaFuncion returns [EObject current=null] : iv_ruleLlamadaFuncion= ruleLlamadaFuncion EOF ;
    public final EObject entryRuleLlamadaFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlamadaFuncion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1459:2: (iv_ruleLlamadaFuncion= ruleLlamadaFuncion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1460:2: iv_ruleLlamadaFuncion= ruleLlamadaFuncion EOF
            {
             newCompositeNode(grammarAccess.getLlamadaFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_entryRuleLlamadaFuncion3333);
            iv_ruleLlamadaFuncion=ruleLlamadaFuncion();

            state._fsp--;

             current =iv_ruleLlamadaFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLlamadaFuncion3343); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLlamadaFuncion"


    // $ANTLR start "ruleLlamadaFuncion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1467:1: ruleLlamadaFuncion returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleLlamadaFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        EObject lv_operador_2_0 = null;

        EObject lv_operador_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1470:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )? otherlv_5= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1471:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )? otherlv_5= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1471:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )? otherlv_5= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1471:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )? otherlv_5= ')'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1471:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1472:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1472:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1473:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getLlamadaFuncionAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLlamadaFuncion3389);
            lv_nombre_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLlamadaFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLlamadaFuncion3401); 

                	newLeafNode(otherlv_1, grammarAccess.getLlamadaFuncionAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1493:1: ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_CAR && LA27_0<=RULE_ID)||(LA27_0>=RULE_CAD && LA27_0<=RULE_INT)||(LA27_0>=60 && LA27_0<=61)||(LA27_0>=64 && LA27_0<=65)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1493:2: ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1493:2: ( (lv_operador_2_0= ruleOperador ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1494:1: (lv_operador_2_0= ruleOperador )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1494:1: (lv_operador_2_0= ruleOperador )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1495:3: lv_operador_2_0= ruleOperador
                    {
                     
                    	        newCompositeNode(grammarAccess.getLlamadaFuncionAccess().getOperadorOperadorParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleLlamadaFuncion3423);
                    lv_operador_2_0=ruleOperador();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLlamadaFuncionRule());
                    	        }
                           		add(
                           			current, 
                           			"operador",
                            		lv_operador_2_0, 
                            		"Operador");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1511:2: (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==38) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1511:4: otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) )
                    	    {
                    	    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleLlamadaFuncion3436); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getLlamadaFuncionAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1515:1: ( (lv_operador_4_0= ruleOperador ) )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1516:1: (lv_operador_4_0= ruleOperador )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1516:1: (lv_operador_4_0= ruleOperador )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1517:3: lv_operador_4_0= ruleOperador
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLlamadaFuncionAccess().getOperadorOperadorParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleLlamadaFuncion3457);
                    	    lv_operador_4_0=ruleOperador();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLlamadaFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operador",
                    	            		lv_operador_4_0, 
                    	            		"Operador");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLlamadaFuncion3473); 

                	newLeafNode(otherlv_5, grammarAccess.getLlamadaFuncionAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLlamadaFuncion"


    // $ANTLR start "entryRuleAsignacion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1545:1: entryRuleAsignacion returns [EObject current=null] : iv_ruleAsignacion= ruleAsignacion EOF ;
    public final EObject entryRuleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1546:2: (iv_ruleAsignacion= ruleAsignacion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1547:2: iv_ruleAsignacion= ruleAsignacion EOF
            {
             newCompositeNode(grammarAccess.getAsignacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_entryRuleAsignacion3509);
            iv_ruleAsignacion=ruleAsignacion();

            state._fsp--;

             current =iv_ruleAsignacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacion3519); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAsignacion"


    // $ANTLR start "ruleAsignacion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1554:1: ruleAsignacion returns [EObject current=null] : ( ( (lv_lvalue_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) ) ;
    public final EObject ruleAsignacion() throws RecognitionException {
        EObject current = null;

        Token lv_Mat_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_lvalue_0_0 = null;

        EObject lv_operador_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1557:28: ( ( ( (lv_lvalue_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1558:1: ( ( (lv_lvalue_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1558:1: ( ( (lv_lvalue_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1558:2: ( (lv_lvalue_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1558:2: ( (lv_lvalue_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1559:1: (lv_lvalue_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1559:1: (lv_lvalue_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1560:3: lv_lvalue_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionAccess().getLvalueEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsignacion3565);
            lv_lvalue_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionRule());
            	        }
                   		set(
                   			current, 
                   			"lvalue",
                    		lv_lvalue_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1576:2: ( (lv_Mat_1_0= RULE_MAT ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_MAT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1577:1: (lv_Mat_1_0= RULE_MAT )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1577:1: (lv_Mat_1_0= RULE_MAT )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1578:3: lv_Mat_1_0= RULE_MAT
            	    {
            	    lv_Mat_1_0=(Token)match(input,RULE_MAT,FollowSets000.FOLLOW_RULE_MAT_in_ruleAsignacion3582); 

            	    			newLeafNode(lv_Mat_1_0, grammarAccess.getAsignacionAccess().getMatMATTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAsignacionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"Mat",
            	            		lv_Mat_1_0, 
            	            		"MAT");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAsignacion3600); 

                	newLeafNode(otherlv_2, grammarAccess.getAsignacionAccess().getEqualsSignKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1598:1: ( (lv_operador_3_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1599:1: (lv_operador_3_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1599:1: (lv_operador_3_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1600:3: lv_operador_3_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionAccess().getOperadorValorParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleAsignacion3621);
            lv_operador_3_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionRule());
            	        }
                   		set(
                   			current, 
                   			"operador",
                    		lv_operador_3_0, 
                    		"valor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAsignacion"


    // $ANTLR start "entryRuleEscribir"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1624:1: entryRuleEscribir returns [EObject current=null] : iv_ruleEscribir= ruleEscribir EOF ;
    public final EObject entryRuleEscribir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscribir = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1625:2: (iv_ruleEscribir= ruleEscribir EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1626:2: iv_ruleEscribir= ruleEscribir EOF
            {
             newCompositeNode(grammarAccess.getEscribirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_entryRuleEscribir3657);
            iv_ruleEscribir=ruleEscribir();

            state._fsp--;

             current =iv_ruleEscribir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEscribir3667); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEscribir"


    // $ANTLR start "ruleEscribir"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1633:1: ruleEscribir returns [EObject current=null] : (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleEscribir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_operador_2_0 = null;

        EObject lv_operador_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1636:28: ( (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1637:1: (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1637:1: (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1637:3: otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEscribir3704); 

                	newLeafNode(otherlv_0, grammarAccess.getEscribirAccess().getEscribirKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEscribir3716); 

                	newLeafNode(otherlv_1, grammarAccess.getEscribirAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1645:1: ( (lv_operador_2_0= ruleOperador ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1646:1: (lv_operador_2_0= ruleOperador )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1646:1: (lv_operador_2_0= ruleOperador )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1647:3: lv_operador_2_0= ruleOperador
            {
             
            	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleEscribir3737);
            lv_operador_2_0=ruleOperador();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEscribirRule());
            	        }
                   		add(
                   			current, 
                   			"operador",
                    		lv_operador_2_0, 
                    		"Operador");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1663:2: (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==38) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1663:4: otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) )
            	    {
            	    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEscribir3750); 

            	        	newLeafNode(otherlv_3, grammarAccess.getEscribirAccess().getCommaKeyword_3_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1667:1: ( (lv_operador_4_0= ruleOperador ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1668:1: (lv_operador_4_0= ruleOperador )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1668:1: (lv_operador_4_0= ruleOperador )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1669:3: lv_operador_4_0= ruleOperador
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleEscribir3771);
            	    lv_operador_4_0=ruleOperador();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEscribirRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operador",
            	            		lv_operador_4_0, 
            	            		"Operador");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEscribir3785); 

                	newLeafNode(otherlv_5, grammarAccess.getEscribirAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEscribir"


    // $ANTLR start "entryRuleLeer"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1697:1: entryRuleLeer returns [EObject current=null] : iv_ruleLeer= ruleLeer EOF ;
    public final EObject entryRuleLeer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeer = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1698:2: (iv_ruleLeer= ruleLeer EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1699:2: iv_ruleLeer= ruleLeer EOF
            {
             newCompositeNode(grammarAccess.getLeerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeer_in_entryRuleLeer3821);
            iv_ruleLeer=ruleLeer();

            state._fsp--;

             current =iv_ruleLeer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeer3831); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeer"


    // $ANTLR start "ruleLeer"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1706:1: ruleLeer returns [EObject current=null] : (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')' ) ;
    public final EObject ruleLeer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1709:28: ( (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1710:1: (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1710:1: (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1710:3: otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleLeer3868); 

                	newLeafNode(otherlv_0, grammarAccess.getLeerAccess().getLeerKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLeer3880); 

                	newLeafNode(otherlv_1, grammarAccess.getLeerAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1718:1: ( (lv_variable_2_0= ruleVariableID ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1719:1: (lv_variable_2_0= ruleVariableID )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1719:1: (lv_variable_2_0= ruleVariableID )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1720:3: lv_variable_2_0= ruleVariableID
            {
             
            	        newCompositeNode(grammarAccess.getLeerAccess().getVariableVariableIDParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleLeer3901);
            lv_variable_2_0=ruleVariableID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLeerRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"VariableID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLeer3913); 

                	newLeafNode(otherlv_3, grammarAccess.getLeerAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeer"


    // $ANTLR start "entryRuleSi"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1748:1: entryRuleSi returns [EObject current=null] : iv_ruleSi= ruleSi EOF ;
    public final EObject entryRuleSi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSi = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1749:2: (iv_ruleSi= ruleSi EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1750:2: iv_ruleSi= ruleSi EOF
            {
             newCompositeNode(grammarAccess.getSiRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSi_in_entryRuleSi3949);
            iv_ruleSi=ruleSi();

            state._fsp--;

             current =iv_ruleSi; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSi3959); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSi"


    // $ANTLR start "ruleSi"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1757:1: ruleSi returns [EObject current=null] : (otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' ) ;
    public final EObject ruleSi() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_valor_1_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_sentencias_4_0 = null;

        EObject lv_devuelve_5_0 = null;

        EObject lv_sino_6_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1760:28: ( (otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1761:1: (otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1761:1: (otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1761:3: otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleSi3996); 

                	newLeafNode(otherlv_0, grammarAccess.getSiAccess().getSiKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1765:1: ( (lv_valor_1_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1766:1: (lv_valor_1_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1766:1: (lv_valor_1_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1767:3: lv_valor_1_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getSiAccess().getValorValorParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleSi4017);
            lv_valor_1_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSiRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_1_0, 
                    		"valor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleSi4029); 

                	newLeafNode(otherlv_2, grammarAccess.getSiAccess().getEntoncesKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1787:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)||(LA31_0>=39 && LA31_0<=41)||LA31_0==44||LA31_0==47||LA31_0==49||LA31_0==52) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1787:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1787:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1788:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1788:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1789:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi4051);
                    lv_sentencias_3_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSiRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_3_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1805:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)||(LA30_0>=39 && LA30_0<=41)||LA30_0==44||LA30_0==47||LA30_0==49||LA30_0==52) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1806:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1806:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1807:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi4072);
                    	    lv_sentencias_4_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSiRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_4_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1823:5: ( (lv_devuelve_5_0= ruleDevolver ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==78) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1824:1: (lv_devuelve_5_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1824:1: (lv_devuelve_5_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1825:3: lv_devuelve_5_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getDevuelveDevolverParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSi4096);
                    lv_devuelve_5_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSiRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_5_0, 
                            		"Devolver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1841:3: ( (lv_sino_6_0= ruleSino ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==77) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1842:1: (lv_sino_6_0= ruleSino )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1842:1: (lv_sino_6_0= ruleSino )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1843:3: lv_sino_6_0= ruleSino
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSinoSinoParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSino_in_ruleSi4118);
                    lv_sino_6_0=ruleSino();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSiRule());
                    	        }
                           		set(
                           			current, 
                           			"sino",
                            		lv_sino_6_0, 
                            		"Sino");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleSi4131); 

                	newLeafNode(otherlv_7, grammarAccess.getSiAccess().getFin_siKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSi"


    // $ANTLR start "entryRulemientras"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1871:1: entryRulemientras returns [EObject current=null] : iv_rulemientras= rulemientras EOF ;
    public final EObject entryRulemientras() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemientras = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1872:2: (iv_rulemientras= rulemientras EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1873:2: iv_rulemientras= rulemientras EOF
            {
             newCompositeNode(grammarAccess.getMientrasRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemientras_in_entryRulemientras4167);
            iv_rulemientras=rulemientras();

            state._fsp--;

             current =iv_rulemientras; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemientras4177); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemientras"


    // $ANTLR start "rulemientras"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1880:1: rulemientras returns [EObject current=null] : (otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' ) ;
    public final EObject rulemientras() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_valor_1_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_sentencias_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1883:28: ( (otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1884:1: (otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1884:1: (otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1884:3: otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_rulemientras4214); 

                	newLeafNode(otherlv_0, grammarAccess.getMientrasAccess().getMientrasKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1888:1: ( (lv_valor_1_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1889:1: (lv_valor_1_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1889:1: (lv_valor_1_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1890:3: lv_valor_1_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getMientrasAccess().getValorValorParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rulemientras4235);
            lv_valor_1_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMientrasRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_1_0, 
                    		"valor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_rulemientras4247); 

                	newLeafNode(otherlv_2, grammarAccess.getMientrasAccess().getHacerKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1910:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_ID)||(LA35_0>=39 && LA35_0<=41)||LA35_0==44||LA35_0==47||LA35_0==49||LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1910:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1910:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1911:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1911:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1912:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras4269);
                    lv_sentencias_3_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMientrasRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_3_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1928:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)||(LA34_0>=39 && LA34_0<=41)||LA34_0==44||LA34_0==47||LA34_0==49||LA34_0==52) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1929:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1929:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1930:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras4290);
                    	    lv_sentencias_4_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMientrasRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_4_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_46_in_rulemientras4305); 

                	newLeafNode(otherlv_5, grammarAccess.getMientrasAccess().getFin_mientrasKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemientras"


    // $ANTLR start "entryRulerepetir"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1958:1: entryRulerepetir returns [EObject current=null] : iv_rulerepetir= rulerepetir EOF ;
    public final EObject entryRulerepetir() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetir = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1959:2: (iv_rulerepetir= rulerepetir EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1960:2: iv_rulerepetir= rulerepetir EOF
            {
             newCompositeNode(grammarAccess.getRepetirRule()); 
            pushFollow(FollowSets000.FOLLOW_rulerepetir_in_entryRulerepetir4341);
            iv_rulerepetir=rulerepetir();

            state._fsp--;

             current =iv_rulerepetir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulerepetir4351); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerepetir"


    // $ANTLR start "rulerepetir"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1967:1: rulerepetir returns [EObject current=null] : (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) ) ) ;
    public final EObject rulerepetir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_sentencias_1_0 = null;

        EObject lv_sentencias_2_0 = null;

        EObject lv_valor_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1970:28: ( (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1971:1: (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1971:1: (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1971:3: otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) )
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_rulerepetir4388); 

                	newLeafNode(otherlv_0, grammarAccess.getRepetirAccess().getRepetirKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1975:1: ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)||(LA37_0>=39 && LA37_0<=41)||LA37_0==44||LA37_0==47||LA37_0==49||LA37_0==52) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1975:2: ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1975:2: ( (lv_sentencias_1_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1976:1: (lv_sentencias_1_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1976:1: (lv_sentencias_1_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1977:3: lv_sentencias_1_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir4410);
                    lv_sentencias_1_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRepetirRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_1_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1993:2: ( (lv_sentencias_2_0= ruleSentencias ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_ID)||(LA36_0>=39 && LA36_0<=41)||LA36_0==44||LA36_0==47||LA36_0==49||LA36_0==52) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1994:1: (lv_sentencias_2_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1994:1: (lv_sentencias_2_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1995:3: lv_sentencias_2_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir4431);
                    	    lv_sentencias_2_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRepetirRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_2_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,48,FollowSets000.FOLLOW_48_in_rulerepetir4446); 

                	newLeafNode(otherlv_3, grammarAccess.getRepetirAccess().getHasta_queKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2015:1: ( (lv_valor_4_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2016:1: (lv_valor_4_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2016:1: (lv_valor_4_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2017:3: lv_valor_4_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getRepetirAccess().getValorValorParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rulerepetir4467);
            lv_valor_4_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRepetirRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_4_0, 
                    		"valor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerepetir"


    // $ANTLR start "entryRuledesde"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2041:1: entryRuledesde returns [EObject current=null] : iv_ruledesde= ruledesde EOF ;
    public final EObject entryRuledesde() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledesde = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2042:2: (iv_ruledesde= ruledesde EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2043:2: iv_ruledesde= ruledesde EOF
            {
             newCompositeNode(grammarAccess.getDesdeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruledesde_in_entryRuledesde4503);
            iv_ruledesde=ruledesde();

            state._fsp--;

             current =iv_ruledesde; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuledesde4513); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledesde"


    // $ANTLR start "ruledesde"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2050:1: ruledesde returns [EObject current=null] : (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacion ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' ) ;
    public final EObject ruledesde() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_asignacion_1_0 = null;

        EObject lv_valor_3_0 = null;

        EObject lv_sentencias_5_0 = null;

        EObject lv_sentencias_6_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2053:28: ( (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacion ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2054:1: (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacion ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2054:1: (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacion ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2054:3: otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacion ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruledesde4550); 

                	newLeafNode(otherlv_0, grammarAccess.getDesdeAccess().getDesdeKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2058:1: ( (lv_asignacion_1_0= ruleAsignacion ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2059:1: (lv_asignacion_1_0= ruleAsignacion )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2059:1: (lv_asignacion_1_0= ruleAsignacion )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2060:3: lv_asignacion_1_0= ruleAsignacion
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getAsignacionAsignacionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_ruledesde4571);
            lv_asignacion_1_0=ruleAsignacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDesdeRule());
            	        }
                   		set(
                   			current, 
                   			"asignacion",
                    		lv_asignacion_1_0, 
                    		"Asignacion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruledesde4583); 

                	newLeafNode(otherlv_2, grammarAccess.getDesdeAccess().getHastaKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2080:1: ( (lv_valor_3_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2081:1: (lv_valor_3_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2081:1: (lv_valor_3_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2082:3: lv_valor_3_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getValorValorParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruledesde4604);
            lv_valor_3_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDesdeRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"valor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruledesde4616); 

                	newLeafNode(otherlv_4, grammarAccess.getDesdeAccess().getHacerKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2102:1: ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)||(LA39_0>=39 && LA39_0<=41)||LA39_0==44||LA39_0==47||LA39_0==49||LA39_0==52) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2102:2: ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2102:2: ( (lv_sentencias_5_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2103:1: (lv_sentencias_5_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2103:1: (lv_sentencias_5_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2104:3: lv_sentencias_5_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde4638);
                    lv_sentencias_5_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDesdeRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_5_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2120:2: ( (lv_sentencias_6_0= ruleSentencias ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)||(LA38_0>=39 && LA38_0<=41)||LA38_0==44||LA38_0==47||LA38_0==49||LA38_0==52) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2121:1: (lv_sentencias_6_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2121:1: (lv_sentencias_6_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2122:3: lv_sentencias_6_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde4659);
                    	    lv_sentencias_6_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDesdeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_6_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruledesde4674); 

                	newLeafNode(otherlv_7, grammarAccess.getDesdeAccess().getFin_desdeKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledesde"


    // $ANTLR start "entryRuleCaso"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2150:1: entryRuleCaso returns [EObject current=null] : iv_ruleCaso= ruleCaso EOF ;
    public final EObject entryRuleCaso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaso = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2151:2: (iv_ruleCaso= ruleCaso EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2152:2: iv_ruleCaso= ruleCaso EOF
            {
             newCompositeNode(grammarAccess.getCasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCaso_in_entryRuleCaso4710);
            iv_ruleCaso=ruleCaso();

            state._fsp--;

             current =iv_ruleCaso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCaso4720); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaso"


    // $ANTLR start "ruleCaso"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2159:1: ruleCaso returns [EObject current=null] : ( ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ':' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) ;
    public final EObject ruleCaso() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operador_0_0 = null;

        EObject lv_sentencias_2_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_devuelve_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2162:28: ( ( ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ':' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2163:1: ( ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ':' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2163:1: ( ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ':' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2163:2: ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ':' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )?
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2163:2: ( (lv_operador_0_0= ruleOperador ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2164:1: (lv_operador_0_0= ruleOperador )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2164:1: (lv_operador_0_0= ruleOperador )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2165:3: lv_operador_0_0= ruleOperador
            {
             
            	        newCompositeNode(grammarAccess.getCasoAccess().getOperadorOperadorParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleCaso4766);
            lv_operador_0_0=ruleOperador();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCasoRule());
            	        }
                   		set(
                   			current, 
                   			"operador",
                    		lv_operador_0_0, 
                    		"Operador");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleCaso4778); 

                	newLeafNode(otherlv_1, grammarAccess.getCasoAccess().getColonKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2185:1: ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2185:2: ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2185:2: ( (lv_sentencias_2_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2186:1: (lv_sentencias_2_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2186:1: (lv_sentencias_2_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2187:3: lv_sentencias_2_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso4800);
                    lv_sentencias_2_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCasoRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_2_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2203:2: ( (lv_sentencias_3_0= ruleSentencias ) )*
                    loop40:
                    do {
                        int alt40=2;
                        alt40 = dfa40.predict(input);
                        switch (alt40) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2204:1: (lv_sentencias_3_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2204:1: (lv_sentencias_3_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2205:3: lv_sentencias_3_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso4821);
                    	    lv_sentencias_3_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCasoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_3_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2221:5: ( (lv_devuelve_4_0= ruleDevolver ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==78) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2222:1: (lv_devuelve_4_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2222:1: (lv_devuelve_4_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2223:3: lv_devuelve_4_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getDevuelveDevolverParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleCaso4845);
                    lv_devuelve_4_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCasoRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_4_0, 
                            		"Devolver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaso"


    // $ANTLR start "entryRulesegun"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2247:1: entryRulesegun returns [EObject current=null] : iv_rulesegun= rulesegun EOF ;
    public final EObject entryRulesegun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesegun = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2248:2: (iv_rulesegun= rulesegun EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2249:2: iv_rulesegun= rulesegun EOF
            {
             newCompositeNode(grammarAccess.getSegunRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesegun_in_entryRulesegun4882);
            iv_rulesegun=rulesegun();

            state._fsp--;

             current =iv_rulesegun; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesegun4892); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesegun"


    // $ANTLR start "rulesegun"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2256:1: rulesegun returns [EObject current=null] : (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' ) ;
    public final EObject rulesegun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        EObject lv_valor_2_0 = null;

        EObject lv_caso_5_0 = null;

        EObject lv_caso_6_0 = null;

        EObject lv_sentencias_8_0 = null;

        EObject lv_sentencias_9_0 = null;

        EObject lv_devuelve_10_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2259:28: ( (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2260:1: (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2260:1: (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2260:3: otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_rulesegun4929); 

                	newLeafNode(otherlv_0, grammarAccess.getSegunAccess().getSegun_seaKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulesegun4941); 

                	newLeafNode(otherlv_1, grammarAccess.getSegunAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2268:1: ( (lv_valor_2_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2269:1: (lv_valor_2_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2269:1: (lv_valor_2_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2270:3: lv_valor_2_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getSegunAccess().getValorValorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rulesegun4962);
            lv_valor_2_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSegunRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_2_0, 
                    		"valor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulesegun4974); 

                	newLeafNode(otherlv_3, grammarAccess.getSegunAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,45,FollowSets000.FOLLOW_45_in_rulesegun4986); 

                	newLeafNode(otherlv_4, grammarAccess.getSegunAccess().getHacerKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2294:1: ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_CAR && LA44_0<=RULE_ID)||(LA44_0>=RULE_CAD && LA44_0<=RULE_INT)||(LA44_0>=60 && LA44_0<=61)||(LA44_0>=64 && LA44_0<=65)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2294:2: ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2294:2: ( (lv_caso_5_0= ruleCaso ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2295:1: (lv_caso_5_0= ruleCaso )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2295:1: (lv_caso_5_0= ruleCaso )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2296:3: lv_caso_5_0= ruleCaso
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun5008);
                    lv_caso_5_0=ruleCaso();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSegunRule());
                    	        }
                           		add(
                           			current, 
                           			"caso",
                            		lv_caso_5_0, 
                            		"Caso");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2312:2: ( (lv_caso_6_0= ruleCaso ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0>=RULE_CAR && LA43_0<=RULE_ID)||(LA43_0>=RULE_CAD && LA43_0<=RULE_INT)||(LA43_0>=60 && LA43_0<=61)||(LA43_0>=64 && LA43_0<=65)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2313:1: (lv_caso_6_0= ruleCaso )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2313:1: (lv_caso_6_0= ruleCaso )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2314:3: lv_caso_6_0= ruleCaso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun5029);
                    	    lv_caso_6_0=ruleCaso();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSegunRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"caso",
                    	            		lv_caso_6_0, 
                    	            		"Caso");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,53,FollowSets000.FOLLOW_53_in_rulesegun5044); 

                	newLeafNode(otherlv_7, grammarAccess.getSegunAccess().getEn_otro_casoKeyword_6());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2334:1: ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_STRING && LA46_0<=RULE_ID)||(LA46_0>=39 && LA46_0<=41)||LA46_0==44||LA46_0==47||LA46_0==49||LA46_0==52) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2334:2: ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2334:2: ( (lv_sentencias_8_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2335:1: (lv_sentencias_8_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2335:1: (lv_sentencias_8_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2336:3: lv_sentencias_8_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun5066);
                    lv_sentencias_8_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSegunRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_8_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2352:2: ( (lv_sentencias_9_0= ruleSentencias ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)||(LA45_0>=39 && LA45_0<=41)||LA45_0==44||LA45_0==47||LA45_0==49||LA45_0==52) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2353:1: (lv_sentencias_9_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2353:1: (lv_sentencias_9_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2354:3: lv_sentencias_9_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun5087);
                    	    lv_sentencias_9_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSegunRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_9_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2370:5: ( (lv_devuelve_10_0= ruleDevolver ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==78) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2371:1: (lv_devuelve_10_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2371:1: (lv_devuelve_10_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2372:3: lv_devuelve_10_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getDevuelveDevolverParserRuleCall_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_rulesegun5111);
                    lv_devuelve_10_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSegunRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_10_0, 
                            		"Devolver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulesegun5124); 

                	newLeafNode(otherlv_11, grammarAccess.getSegunAccess().getFin_segunKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesegun"


    // $ANTLR start "entryRuleincremento"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2400:1: entryRuleincremento returns [EObject current=null] : iv_ruleincremento= ruleincremento EOF ;
    public final EObject entryRuleincremento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleincremento = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2401:2: (iv_ruleincremento= ruleincremento EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2402:2: iv_ruleincremento= ruleincremento EOF
            {
             newCompositeNode(grammarAccess.getIncrementoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleincremento_in_entryRuleincremento5160);
            iv_ruleincremento=ruleincremento();

            state._fsp--;

             current =iv_ruleincremento; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleincremento5170); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleincremento"


    // $ANTLR start "ruleincremento"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2409:1: ruleincremento returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) ) ) ;
    public final EObject ruleincremento() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_ssigno_1_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2412:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2413:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2413:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2413:2: ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2413:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2414:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2414:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2415:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIncrementoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleincremento5216);
            lv_nombre_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIncrementoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2431:2: ( (lv_ssigno_1_0= ruleinc ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2432:1: (lv_ssigno_1_0= ruleinc )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2432:1: (lv_ssigno_1_0= ruleinc )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2433:3: lv_ssigno_1_0= ruleinc
            {
             
            	        newCompositeNode(grammarAccess.getIncrementoAccess().getSsignoIncParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_ruleincremento5237);
            lv_ssigno_1_0=ruleinc();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIncrementoRule());
            	        }
                   		set(
                   			current, 
                   			"ssigno",
                    		lv_ssigno_1_0, 
                    		"inc");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleincremento"


    // $ANTLR start "entryRuleunaria"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2457:1: entryRuleunaria returns [EObject current=null] : iv_ruleunaria= ruleunaria EOF ;
    public final EObject entryRuleunaria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunaria = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2458:2: (iv_ruleunaria= ruleunaria EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2459:2: iv_ruleunaria= ruleunaria EOF
            {
             newCompositeNode(grammarAccess.getUnariaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleunaria_in_entryRuleunaria5273);
            iv_ruleunaria=ruleunaria();

            state._fsp--;

             current =iv_ruleunaria; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleunaria5283); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunaria"


    // $ANTLR start "ruleunaria"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2466:1: ruleunaria returns [EObject current=null] : (otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')' ) ;
    public final EObject ruleunaria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_ssigno_1_0 = null;

        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2469:28: ( (otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2470:1: (otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2470:1: (otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2470:3: otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleunaria5320); 

                	newLeafNode(otherlv_0, grammarAccess.getUnariaAccess().getLeftParenthesisKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2474:1: ( (lv_ssigno_1_0= ruleinc ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2475:1: (lv_ssigno_1_0= ruleinc )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2475:1: (lv_ssigno_1_0= ruleinc )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2476:3: lv_ssigno_1_0= ruleinc
            {
             
            	        newCompositeNode(grammarAccess.getUnariaAccess().getSsignoIncParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_ruleunaria5341);
            lv_ssigno_1_0=ruleinc();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnariaRule());
            	        }
                   		set(
                   			current, 
                   			"ssigno",
                    		lv_ssigno_1_0, 
                    		"inc");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2492:2: ( (lv_variable_2_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2493:1: (lv_variable_2_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2493:1: (lv_variable_2_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2494:3: lv_variable_2_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getUnariaAccess().getVariableValorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleunaria5362);
            lv_variable_2_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnariaRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"valor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleunaria5374); 

                	newLeafNode(otherlv_3, grammarAccess.getUnariaAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunaria"


    // $ANTLR start "entryRuleTipoVariable"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2522:1: entryRuleTipoVariable returns [String current=null] : iv_ruleTipoVariable= ruleTipoVariable EOF ;
    public final String entryRuleTipoVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoVariable = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2523:2: (iv_ruleTipoVariable= ruleTipoVariable EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2524:2: iv_ruleTipoVariable= ruleTipoVariable EOF
            {
             newCompositeNode(grammarAccess.getTipoVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable5411);
            iv_ruleTipoVariable=ruleTipoVariable();

            state._fsp--;

             current =iv_ruleTipoVariable.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoVariable5422); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoVariable"


    // $ANTLR start "ruleTipoVariable"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2531:1: ruleTipoVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' ) ;
    public final AntlrDatatypeRuleToken ruleTipoVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2534:28: ( (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2535:1: (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2535:1: (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' )
            int alt48=5;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt48=1;
                }
                break;
            case 56:
                {
                alt48=2;
                }
                break;
            case 57:
                {
                alt48=3;
                }
                break;
            case 58:
                {
                alt48=4;
                }
                break;
            case 59:
                {
                alt48=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2536:2: kw= 'entero'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleTipoVariable5460); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getEnteroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2543:2: kw= 'caracter'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleTipoVariable5479); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getCaracterKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2550:2: kw= 'real'
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleTipoVariable5498); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getRealKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2557:2: kw= 'logico'
                    {
                    kw=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleTipoVariable5517); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getLogicoKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2564:2: kw= 'cadena'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleTipoVariable5536); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getCadenaKeyword_4()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoVariable"


    // $ANTLR start "entryRuleVariable"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2577:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2578:2: (iv_ruleVariable= ruleVariable EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2579:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable5576);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable5586); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2586:1: ruleVariable returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_Mat_1_0=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2589:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2590:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2590:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2590:2: ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2590:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2591:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2591:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2592:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable5632);
            lv_nombre_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2608:2: ( (lv_Mat_1_0= RULE_MAT ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_MAT) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2609:1: (lv_Mat_1_0= RULE_MAT )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2609:1: (lv_Mat_1_0= RULE_MAT )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2610:3: lv_Mat_1_0= RULE_MAT
            	    {
            	    lv_Mat_1_0=(Token)match(input,RULE_MAT,FollowSets000.FOLLOW_RULE_MAT_in_ruleVariable5649); 

            	    			newLeafNode(lv_Mat_1_0, grammarAccess.getVariableAccess().getMatMATTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getVariableRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"Mat",
            	            		lv_Mat_1_0, 
            	            		"MAT");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVariableID"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2634:1: entryRuleVariableID returns [EObject current=null] : iv_ruleVariableID= ruleVariableID EOF ;
    public final EObject entryRuleVariableID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableID = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2635:2: (iv_ruleVariableID= ruleVariableID EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2636:2: iv_ruleVariableID= ruleVariableID EOF
            {
             newCompositeNode(grammarAccess.getVariableIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_entryRuleVariableID5691);
            iv_ruleVariableID=ruleVariableID();

            state._fsp--;

             current =iv_ruleVariableID; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableID5701); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableID"


    // $ANTLR start "ruleVariableID"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2643:1: ruleVariableID returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* ) ;
    public final EObject ruleVariableID() throws RecognitionException {
        EObject current = null;

        Token lv_Mat_1_0=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2646:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2647:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2647:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2647:2: ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2647:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2648:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2648:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2649:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableIDAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariableID5747);
            lv_nombre_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableIDRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2665:2: ( (lv_Mat_1_0= RULE_MAT ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_MAT) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2666:1: (lv_Mat_1_0= RULE_MAT )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2666:1: (lv_Mat_1_0= RULE_MAT )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2667:3: lv_Mat_1_0= RULE_MAT
            	    {
            	    lv_Mat_1_0=(Token)match(input,RULE_MAT,FollowSets000.FOLLOW_RULE_MAT_in_ruleVariableID5764); 

            	    			newLeafNode(lv_Mat_1_0, grammarAccess.getVariableIDAccess().getMatMATTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getVariableIDRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"Mat",
            	            		lv_Mat_1_0, 
            	            		"MAT");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableID"


    // $ANTLR start "entryRuleConstCadena"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2691:1: entryRuleConstCadena returns [EObject current=null] : iv_ruleConstCadena= ruleConstCadena EOF ;
    public final EObject entryRuleConstCadena() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstCadena = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2692:2: (iv_ruleConstCadena= ruleConstCadena EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2693:2: iv_ruleConstCadena= ruleConstCadena EOF
            {
             newCompositeNode(grammarAccess.getConstCadenaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_entryRuleConstCadena5806);
            iv_ruleConstCadena=ruleConstCadena();

            state._fsp--;

             current =iv_ruleConstCadena; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstCadena5816); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstCadena"


    // $ANTLR start "ruleConstCadena"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2700:1: ruleConstCadena returns [EObject current=null] : ( (lv_contenido_0_0= RULE_CAD ) ) ;
    public final EObject ruleConstCadena() throws RecognitionException {
        EObject current = null;

        Token lv_contenido_0_0=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2703:28: ( ( (lv_contenido_0_0= RULE_CAD ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2704:1: ( (lv_contenido_0_0= RULE_CAD ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2704:1: ( (lv_contenido_0_0= RULE_CAD ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2705:1: (lv_contenido_0_0= RULE_CAD )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2705:1: (lv_contenido_0_0= RULE_CAD )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2706:3: lv_contenido_0_0= RULE_CAD
            {
            lv_contenido_0_0=(Token)match(input,RULE_CAD,FollowSets000.FOLLOW_RULE_CAD_in_ruleConstCadena5857); 

            			newLeafNode(lv_contenido_0_0, grammarAccess.getConstCadenaAccess().getContenidoCADTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstCadenaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"contenido",
                    		lv_contenido_0_0, 
                    		"CAD");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstCadena"


    // $ANTLR start "entryRuleNumeroEntero"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2730:1: entryRuleNumeroEntero returns [EObject current=null] : iv_ruleNumeroEntero= ruleNumeroEntero EOF ;
    public final EObject entryRuleNumeroEntero() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeroEntero = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2731:2: (iv_ruleNumeroEntero= ruleNumeroEntero EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2732:2: iv_ruleNumeroEntero= ruleNumeroEntero EOF
            {
             newCompositeNode(grammarAccess.getNumeroEnteroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_entryRuleNumeroEntero5897);
            iv_ruleNumeroEntero=ruleNumeroEntero();

            state._fsp--;

             current =iv_ruleNumeroEntero; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumeroEntero5907); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumeroEntero"


    // $ANTLR start "ruleNumeroEntero"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2739:1: ruleNumeroEntero returns [EObject current=null] : ( (lv_valor_0_0= ruleEInt ) ) ;
    public final EObject ruleNumeroEntero() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2742:28: ( ( (lv_valor_0_0= ruleEInt ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2743:1: ( (lv_valor_0_0= ruleEInt ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2743:1: ( (lv_valor_0_0= ruleEInt ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2744:1: (lv_valor_0_0= ruleEInt )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2744:1: (lv_valor_0_0= ruleEInt )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2745:3: lv_valor_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getNumeroEnteroAccess().getValorEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumeroEntero5952);
            lv_valor_0_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumeroEnteroRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_0_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumeroEntero"


    // $ANTLR start "entryRuleNumeroDecimal"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2769:1: entryRuleNumeroDecimal returns [EObject current=null] : iv_ruleNumeroDecimal= ruleNumeroDecimal EOF ;
    public final EObject entryRuleNumeroDecimal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeroDecimal = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2770:2: (iv_ruleNumeroDecimal= ruleNumeroDecimal EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2771:2: iv_ruleNumeroDecimal= ruleNumeroDecimal EOF
            {
             newCompositeNode(grammarAccess.getNumeroDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_entryRuleNumeroDecimal5987);
            iv_ruleNumeroDecimal=ruleNumeroDecimal();

            state._fsp--;

             current =iv_ruleNumeroDecimal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumeroDecimal5997); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumeroDecimal"


    // $ANTLR start "ruleNumeroDecimal"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2778:1: ruleNumeroDecimal returns [EObject current=null] : ( (lv_valor_0_0= ruleEFloat ) ) ;
    public final EObject ruleNumeroDecimal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2781:28: ( ( (lv_valor_0_0= ruleEFloat ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2782:1: ( (lv_valor_0_0= ruleEFloat ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2782:1: ( (lv_valor_0_0= ruleEFloat ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2783:1: (lv_valor_0_0= ruleEFloat )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2783:1: (lv_valor_0_0= ruleEFloat )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2784:3: lv_valor_0_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getNumeroDecimalAccess().getValorEFloatParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleNumeroDecimal6042);
            lv_valor_0_0=ruleEFloat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumeroDecimalRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_0_0, 
                    		"EFloat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumeroDecimal"


    // $ANTLR start "entryRuleValorBooleano"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2808:1: entryRuleValorBooleano returns [EObject current=null] : iv_ruleValorBooleano= ruleValorBooleano EOF ;
    public final EObject entryRuleValorBooleano() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorBooleano = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2809:2: (iv_ruleValorBooleano= ruleValorBooleano EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2810:2: iv_ruleValorBooleano= ruleValorBooleano EOF
            {
             newCompositeNode(grammarAccess.getValorBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_entryRuleValorBooleano6077);
            iv_ruleValorBooleano=ruleValorBooleano();

            state._fsp--;

             current =iv_ruleValorBooleano; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValorBooleano6087); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValorBooleano"


    // $ANTLR start "ruleValorBooleano"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2817:1: ruleValorBooleano returns [EObject current=null] : ( (lv_valor_0_0= rulebooleano ) ) ;
    public final EObject ruleValorBooleano() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2820:28: ( ( (lv_valor_0_0= rulebooleano ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2821:1: ( (lv_valor_0_0= rulebooleano ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2821:1: ( (lv_valor_0_0= rulebooleano ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2822:1: (lv_valor_0_0= rulebooleano )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2822:1: (lv_valor_0_0= rulebooleano )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2823:3: lv_valor_0_0= rulebooleano
            {
             
            	        newCompositeNode(grammarAccess.getValorBooleanoAccess().getValorBooleanoParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulebooleano_in_ruleValorBooleano6132);
            lv_valor_0_0=rulebooleano();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValorBooleanoRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_0_0, 
                    		"booleano");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValorBooleano"


    // $ANTLR start "entryRuleEInt"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2847:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2848:2: (iv_ruleEInt= ruleEInt EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2849:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt6168);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt6179); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2856:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2859:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2860:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2860:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2860:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2860:2: (kw= '-' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==60) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2861:2: kw= '-'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleEInt6218); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt6235); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEFloat"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2881:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2882:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2883:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat6281);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat6292); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2890:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2893:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2894:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2894:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2894:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2894:2: (kw= '-' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==60) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2895:2: kw= '-'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleEFloat6331); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2900:3: (this_INT_1= RULE_INT )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_INT) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2900:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat6349); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleEFloat6369); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat6384); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2920:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=62 && LA56_0<=63)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2920:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2920:2: (kw= 'E' | kw= 'e' )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==62) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==63) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2921:2: kw= 'E'
                            {
                            kw=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleEFloat6404); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2928:2: kw= 'e'
                            {
                            kw=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleEFloat6423); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2933:2: (kw= '-' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==60) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2934:2: kw= '-'
                            {
                            kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleEFloat6438); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat6455); 

                    		current.merge(this_INT_7);
                        
                     
                        newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRulebooleano"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2954:1: entryRulebooleano returns [String current=null] : iv_rulebooleano= rulebooleano EOF ;
    public final String entryRulebooleano() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebooleano = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2955:2: (iv_rulebooleano= rulebooleano EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2956:2: iv_rulebooleano= rulebooleano EOF
            {
             newCompositeNode(grammarAccess.getBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleano_in_entryRulebooleano6503);
            iv_rulebooleano=rulebooleano();

            state._fsp--;

             current =iv_rulebooleano.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulebooleano6514); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebooleano"


    // $ANTLR start "rulebooleano"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2963:1: rulebooleano returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'verdadero' | kw= 'falso' ) ;
    public final AntlrDatatypeRuleToken rulebooleano() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2966:28: ( (kw= 'verdadero' | kw= 'falso' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2967:1: (kw= 'verdadero' | kw= 'falso' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2967:1: (kw= 'verdadero' | kw= 'falso' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==64) ) {
                alt57=1;
            }
            else if ( (LA57_0==65) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2968:2: kw= 'verdadero'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_64_in_rulebooleano6552); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanoAccess().getVerdaderoKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2975:2: kw= 'falso'
                    {
                    kw=(Token)match(input,65,FollowSets000.FOLLOW_65_in_rulebooleano6571); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanoAccess().getFalsoKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebooleano"


    // $ANTLR start "entryRuleoperacion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2988:1: entryRuleoperacion returns [EObject current=null] : iv_ruleoperacion= ruleoperacion EOF ;
    public final EObject entryRuleoperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperacion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2989:2: (iv_ruleoperacion= ruleoperacion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2990:2: iv_ruleoperacion= ruleoperacion EOF
            {
             newCompositeNode(grammarAccess.getOperacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_entryRuleoperacion6611);
            iv_ruleoperacion=ruleoperacion();

            state._fsp--;

             current =iv_ruleoperacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperacion6621); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleoperacion"


    // $ANTLR start "ruleoperacion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2997:1: ruleoperacion returns [EObject current=null] : (otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')' ) ;
    public final EObject ruleoperacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_op_izq_1_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_op_der_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3000:28: ( (otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3001:1: (otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3001:1: (otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3001:3: otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleoperacion6658); 

                	newLeafNode(otherlv_0, grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3005:1: ( (lv_op_izq_1_0= ruleoperando_izq ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3006:1: (lv_op_izq_1_0= ruleoperando_izq )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3006:1: (lv_op_izq_1_0= ruleoperando_izq )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3007:3: lv_op_izq_1_0= ruleoperando_izq
            {
             
            	        newCompositeNode(grammarAccess.getOperacionAccess().getOp_izqOperando_izqParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperando_izq_in_ruleoperacion6679);
            lv_op_izq_1_0=ruleoperando_izq();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperacionRule());
            	        }
                   		set(
                   			current, 
                   			"op_izq",
                    		lv_op_izq_1_0, 
                    		"operando_izq");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3023:2: ( (lv_signo_op_2_0= rulesigno ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3024:1: (lv_signo_op_2_0= rulesigno )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3024:1: (lv_signo_op_2_0= rulesigno )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3025:3: lv_signo_op_2_0= rulesigno
            {
             
            	        newCompositeNode(grammarAccess.getOperacionAccess().getSigno_opSignoParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulesigno_in_ruleoperacion6700);
            lv_signo_op_2_0=rulesigno();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperacionRule());
            	        }
                   		set(
                   			current, 
                   			"signo_op",
                    		lv_signo_op_2_0, 
                    		"signo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3041:2: ( (lv_op_der_3_0= ruleoperando_der ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3042:1: (lv_op_der_3_0= ruleoperando_der )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3042:1: (lv_op_der_3_0= ruleoperando_der )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3043:3: lv_op_der_3_0= ruleoperando_der
            {
             
            	        newCompositeNode(grammarAccess.getOperacionAccess().getOp_derOperando_derParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperando_der_in_ruleoperacion6721);
            lv_op_der_3_0=ruleoperando_der();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperacionRule());
            	        }
                   		set(
                   			current, 
                   			"op_der",
                    		lv_op_der_3_0, 
                    		"operando_der");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleoperacion6733); 

                	newLeafNode(otherlv_4, grammarAccess.getOperacionAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoperacion"


    // $ANTLR start "entryRulesigno"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3071:1: entryRulesigno returns [String current=null] : iv_rulesigno= rulesigno EOF ;
    public final String entryRulesigno() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesigno = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3072:2: (iv_rulesigno= rulesigno EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3073:2: iv_rulesigno= rulesigno EOF
            {
             newCompositeNode(grammarAccess.getSignoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesigno_in_entryRulesigno6770);
            iv_rulesigno=rulesigno();

            state._fsp--;

             current =iv_rulesigno.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesigno6781); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesigno"


    // $ANTLR start "rulesigno"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3080:1: rulesigno returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= 'y' | kw= 'o' | kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken rulesigno() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3083:28: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= 'y' | kw= 'o' | kw= '==' | kw= '!=' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3084:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= 'y' | kw= 'o' | kw= '==' | kw= '!=' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3084:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= 'y' | kw= 'o' | kw= '==' | kw= '!=' )
            int alt58=12;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt58=1;
                }
                break;
            case 60:
                {
                alt58=2;
                }
                break;
            case 67:
                {
                alt58=3;
                }
                break;
            case 68:
                {
                alt58=4;
                }
                break;
            case 69:
                {
                alt58=5;
                }
                break;
            case 70:
                {
                alt58=6;
                }
                break;
            case 71:
                {
                alt58=7;
                }
                break;
            case 72:
                {
                alt58=8;
                }
                break;
            case 73:
                {
                alt58=9;
                }
                break;
            case 74:
                {
                alt58=10;
                }
                break;
            case 75:
                {
                alt58=11;
                }
                break;
            case 76:
                {
                alt58=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3085:2: kw= '+'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_66_in_rulesigno6819); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3092:2: kw= '-'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_rulesigno6838); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3099:2: kw= '*'
                    {
                    kw=(Token)match(input,67,FollowSets000.FOLLOW_67_in_rulesigno6857); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getAsteriskKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3106:2: kw= '/'
                    {
                    kw=(Token)match(input,68,FollowSets000.FOLLOW_68_in_rulesigno6876); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getSolidusKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3113:2: kw= '<'
                    {
                    kw=(Token)match(input,69,FollowSets000.FOLLOW_69_in_rulesigno6895); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getLessThanSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3120:2: kw= '>'
                    {
                    kw=(Token)match(input,70,FollowSets000.FOLLOW_70_in_rulesigno6914); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getGreaterThanSignKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3127:2: kw= '>='
                    {
                    kw=(Token)match(input,71,FollowSets000.FOLLOW_71_in_rulesigno6933); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3134:2: kw= '<='
                    {
                    kw=(Token)match(input,72,FollowSets000.FOLLOW_72_in_rulesigno6952); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getLessThanSignEqualsSignKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3141:2: kw= 'y'
                    {
                    kw=(Token)match(input,73,FollowSets000.FOLLOW_73_in_rulesigno6971); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getYKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3148:2: kw= 'o'
                    {
                    kw=(Token)match(input,74,FollowSets000.FOLLOW_74_in_rulesigno6990); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getOKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3155:2: kw= '=='
                    {
                    kw=(Token)match(input,75,FollowSets000.FOLLOW_75_in_rulesigno7009); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getEqualsSignEqualsSignKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3162:2: kw= '!='
                    {
                    kw=(Token)match(input,76,FollowSets000.FOLLOW_76_in_rulesigno7028); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getExclamationMarkEqualsSignKeyword_11()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesigno"


    // $ANTLR start "entryRuleoperando_izq"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3175:1: entryRuleoperando_izq returns [EObject current=null] : iv_ruleoperando_izq= ruleoperando_izq EOF ;
    public final EObject entryRuleoperando_izq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperando_izq = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3176:2: (iv_ruleoperando_izq= ruleoperando_izq EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3177:2: iv_ruleoperando_izq= ruleoperando_izq EOF
            {
             newCompositeNode(grammarAccess.getOperando_izqRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_izq_in_entryRuleoperando_izq7068);
            iv_ruleoperando_izq=ruleoperando_izq();

            state._fsp--;

             current =iv_ruleoperando_izq; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperando_izq7078); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleoperando_izq"


    // $ANTLR start "ruleoperando_izq"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3184:1: ruleoperando_izq returns [EObject current=null] : ( (lv_oper_izq_0_0= rulevalor ) ) ;
    public final EObject ruleoperando_izq() throws RecognitionException {
        EObject current = null;

        EObject lv_oper_izq_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3187:28: ( ( (lv_oper_izq_0_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3188:1: ( (lv_oper_izq_0_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3188:1: ( (lv_oper_izq_0_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3189:1: (lv_oper_izq_0_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3189:1: (lv_oper_izq_0_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3190:3: lv_oper_izq_0_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getOperando_izqAccess().getOper_izqValorParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleoperando_izq7123);
            lv_oper_izq_0_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperando_izqRule());
            	        }
                   		set(
                   			current, 
                   			"oper_izq",
                    		lv_oper_izq_0_0, 
                    		"valor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoperando_izq"


    // $ANTLR start "entryRuleoperando_der"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3214:1: entryRuleoperando_der returns [EObject current=null] : iv_ruleoperando_der= ruleoperando_der EOF ;
    public final EObject entryRuleoperando_der() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperando_der = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3215:2: (iv_ruleoperando_der= ruleoperando_der EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3216:2: iv_ruleoperando_der= ruleoperando_der EOF
            {
             newCompositeNode(grammarAccess.getOperando_derRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_der_in_entryRuleoperando_der7158);
            iv_ruleoperando_der=ruleoperando_der();

            state._fsp--;

             current =iv_ruleoperando_der; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperando_der7168); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleoperando_der"


    // $ANTLR start "ruleoperando_der"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3223:1: ruleoperando_der returns [EObject current=null] : ( (lv_oper_der_0_0= rulevalor ) ) ;
    public final EObject ruleoperando_der() throws RecognitionException {
        EObject current = null;

        EObject lv_oper_der_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3226:28: ( ( (lv_oper_der_0_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3227:1: ( (lv_oper_der_0_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3227:1: ( (lv_oper_der_0_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3228:1: (lv_oper_der_0_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3228:1: (lv_oper_der_0_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3229:3: lv_oper_der_0_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getOperando_derAccess().getOper_derValorParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleoperando_der7213);
            lv_oper_der_0_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperando_derRule());
            	        }
                   		set(
                   			current, 
                   			"oper_der",
                    		lv_oper_der_0_0, 
                    		"valor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoperando_der"


    // $ANTLR start "entryRuleSino"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3253:1: entryRuleSino returns [EObject current=null] : iv_ruleSino= ruleSino EOF ;
    public final EObject entryRuleSino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSino = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3254:2: (iv_ruleSino= ruleSino EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3255:2: iv_ruleSino= ruleSino EOF
            {
             newCompositeNode(grammarAccess.getSinoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSino_in_entryRuleSino7248);
            iv_ruleSino=ruleSino();

            state._fsp--;

             current =iv_ruleSino; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSino7258); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSino"


    // $ANTLR start "ruleSino"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3262:1: ruleSino returns [EObject current=null] : ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) ;
    public final EObject ruleSino() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sentencias_2_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_devuelve_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3265:28: ( ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3266:1: ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3266:1: ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3266:2: () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )?
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3266:2: ()
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3267:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSinoAccess().getSinoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleSino7304); 

                	newLeafNode(otherlv_1, grammarAccess.getSinoAccess().getSinoKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3276:1: ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_STRING && LA60_0<=RULE_ID)||(LA60_0>=39 && LA60_0<=41)||LA60_0==44||LA60_0==47||LA60_0==49||LA60_0==52) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3276:2: ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3276:2: ( (lv_sentencias_2_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3277:1: (lv_sentencias_2_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3277:1: (lv_sentencias_2_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3278:3: lv_sentencias_2_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino7326);
                    lv_sentencias_2_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinoRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_2_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3294:2: ( (lv_sentencias_3_0= ruleSentencias ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( ((LA59_0>=RULE_STRING && LA59_0<=RULE_ID)||(LA59_0>=39 && LA59_0<=41)||LA59_0==44||LA59_0==47||LA59_0==49||LA59_0==52) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3295:1: (lv_sentencias_3_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3295:1: (lv_sentencias_3_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3296:3: lv_sentencias_3_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino7347);
                    	    lv_sentencias_3_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSinoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_3_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3312:5: ( (lv_devuelve_4_0= ruleDevolver ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==78) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3313:1: (lv_devuelve_4_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3313:1: (lv_devuelve_4_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3314:3: lv_devuelve_4_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getDevuelveDevolverParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSino7371);
                    lv_devuelve_4_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinoRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_4_0, 
                            		"Devolver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSino"


    // $ANTLR start "entryRuleDevolver"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3338:1: entryRuleDevolver returns [EObject current=null] : iv_ruleDevolver= ruleDevolver EOF ;
    public final EObject entryRuleDevolver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevolver = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3339:2: (iv_ruleDevolver= ruleDevolver EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3340:2: iv_ruleDevolver= ruleDevolver EOF
            {
             newCompositeNode(grammarAccess.getDevolverRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_entryRuleDevolver7408);
            iv_ruleDevolver=ruleDevolver();

            state._fsp--;

             current =iv_ruleDevolver; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDevolver7418); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDevolver"


    // $ANTLR start "ruleDevolver"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3347:1: ruleDevolver returns [EObject current=null] : ( () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')' ) ;
    public final EObject ruleDevolver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_devuelve_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3350:28: ( ( () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3351:1: ( () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3351:1: ( () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3351:2: () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3351:2: ()
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3352:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDevolverAccess().getDevolverAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleDevolver7464); 

                	newLeafNode(otherlv_1, grammarAccess.getDevolverAccess().getDevolverKeyword_1());
                
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDevolver7476); 

                	newLeafNode(otherlv_2, grammarAccess.getDevolverAccess().getLeftParenthesisKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3365:1: ( (lv_devuelve_3_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3366:1: (lv_devuelve_3_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3366:1: (lv_devuelve_3_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3367:3: lv_devuelve_3_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getDevolverAccess().getDevuelveValorParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleDevolver7497);
            lv_devuelve_3_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDevolverRule());
            	        }
                   		set(
                   			current, 
                   			"devuelve",
                    		lv_devuelve_3_0, 
                    		"valor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDevolver7509); 

                	newLeafNode(otherlv_4, grammarAccess.getDevolverAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDevolver"


    // $ANTLR start "entryRuleinc"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3395:1: entryRuleinc returns [String current=null] : iv_ruleinc= ruleinc EOF ;
    public final String entryRuleinc() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinc = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3396:2: (iv_ruleinc= ruleinc EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3397:2: iv_ruleinc= ruleinc EOF
            {
             newCompositeNode(grammarAccess.getIncRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_entryRuleinc7546);
            iv_ruleinc=ruleinc();

            state._fsp--;

             current =iv_ruleinc.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleinc7557); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinc"


    // $ANTLR start "ruleinc"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3404:1: ruleinc returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '++' | kw= '--' | kw= 'no' ) ;
    public final AntlrDatatypeRuleToken ruleinc() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3407:28: ( (kw= '++' | kw= '--' | kw= 'no' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3408:1: (kw= '++' | kw= '--' | kw= 'no' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3408:1: (kw= '++' | kw= '--' | kw= 'no' )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt62=1;
                }
                break;
            case 80:
                {
                alt62=2;
                }
                break;
            case 81:
                {
                alt62=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3409:2: kw= '++'
                    {
                    kw=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleinc7595); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIncAccess().getPlusSignPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3416:2: kw= '--'
                    {
                    kw=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleinc7614); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIncAccess().getHyphenMinusHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3423:2: kw= 'no'
                    {
                    kw=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleinc7633); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIncAccess().getNoKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinc"


    // $ANTLR start "entryRuleParametroFuncion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3436:1: entryRuleParametroFuncion returns [EObject current=null] : iv_ruleParametroFuncion= ruleParametroFuncion EOF ;
    public final EObject entryRuleParametroFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametroFuncion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3437:2: (iv_ruleParametroFuncion= ruleParametroFuncion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3438:2: iv_ruleParametroFuncion= ruleParametroFuncion EOF
            {
             newCompositeNode(grammarAccess.getParametroFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion7673);
            iv_ruleParametroFuncion=ruleParametroFuncion();

            state._fsp--;

             current =iv_ruleParametroFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametroFuncion7683); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParametroFuncion"


    // $ANTLR start "ruleParametroFuncion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3445:1: ruleParametroFuncion returns [EObject current=null] : ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipoVariable ) )+ otherlv_2= ':' ( (lv_variable_3_0= ruleVariable ) ) ) ;
    public final EObject ruleParametroFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_paso_0_0 = null;

        AntlrDatatypeRuleToken lv_tipo_1_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3448:28: ( ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipoVariable ) )+ otherlv_2= ':' ( (lv_variable_3_0= ruleVariable ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3449:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipoVariable ) )+ otherlv_2= ':' ( (lv_variable_3_0= ruleVariable ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3449:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipoVariable ) )+ otherlv_2= ':' ( (lv_variable_3_0= ruleVariable ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3449:2: ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipoVariable ) )+ otherlv_2= ':' ( (lv_variable_3_0= ruleVariable ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3449:2: ( (lv_paso_0_0= ruleTipoPaso ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3450:1: (lv_paso_0_0= ruleTipoPaso )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3450:1: (lv_paso_0_0= ruleTipoPaso )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3451:3: lv_paso_0_0= ruleTipoPaso
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_ruleParametroFuncion7729);
            lv_paso_0_0=ruleTipoPaso();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParametroFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"paso",
                    		lv_paso_0_0, 
                    		"TipoPaso");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3467:2: ( (lv_tipo_1_0= ruleTipoVariable ) )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=55 && LA63_0<=59)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3468:1: (lv_tipo_1_0= ruleTipoVariable )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3468:1: (lv_tipo_1_0= ruleTipoVariable )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3469:3: lv_tipo_1_0= ruleTipoVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getTipoTipoVariableParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleParametroFuncion7750);
            	    lv_tipo_1_0=ruleTipoVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParametroFuncionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"tipo",
            	            		lv_tipo_1_0, 
            	            		"TipoVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);

            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleParametroFuncion7763); 

                	newLeafNode(otherlv_2, grammarAccess.getParametroFuncionAccess().getColonKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3489:1: ( (lv_variable_3_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3490:1: (lv_variable_3_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3490:1: (lv_variable_3_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3491:3: lv_variable_3_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleParametroFuncion7784);
            lv_variable_3_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParametroFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_3_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParametroFuncion"


    // $ANTLR start "entryRuleFuncion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3515:1: entryRuleFuncion returns [EObject current=null] : iv_ruleFuncion= ruleFuncion EOF ;
    public final EObject entryRuleFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3516:2: (iv_ruleFuncion= ruleFuncion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3517:2: iv_ruleFuncion= ruleFuncion EOF
            {
             newCompositeNode(grammarAccess.getFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_entryRuleFuncion7820);
            iv_ruleFuncion=ruleFuncion();

            state._fsp--;

             current =iv_ruleFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncion7830); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncion"


    // $ANTLR start "ruleFuncion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3524:1: ruleFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion' ) ;
    public final EObject ruleFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        AntlrDatatypeRuleToken lv_nombre_2_0 = null;

        EObject lv_parametrofuncion_4_0 = null;

        EObject lv_parametrofuncion_6_0 = null;

        EObject lv_declaracion_11_0 = null;

        EObject lv_declaracion_12_0 = null;

        EObject lv_sentencias_14_0 = null;

        EObject lv_sentencias_15_0 = null;

        EObject lv_devuelve_16_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3527:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3528:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3528:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3528:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3528:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3529:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3529:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3530:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleFuncion7876);
            lv_tipo_0_0=ruleTipoVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_0_0, 
                    		"TipoVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleFuncion7888); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionAccess().getFuncionKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3550:1: ( (lv_nombre_2_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3551:1: (lv_nombre_2_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3551:1: (lv_nombre_2_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3552:3: lv_nombre_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getNombreEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFuncion7909);
            lv_nombre_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFuncion7921); 

                	newLeafNode(otherlv_3, grammarAccess.getFuncionAccess().getLeftParenthesisKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3572:1: ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==62||(LA65_0>=86 && LA65_0<=87)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3572:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3572:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3573:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3573:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3574:3: lv_parametrofuncion_4_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion7943);
                    lv_parametrofuncion_4_0=ruleParametroFuncion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	        }
                           		add(
                           			current, 
                           			"parametrofuncion",
                            		lv_parametrofuncion_4_0, 
                            		"ParametroFuncion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3590:2: (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==38) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3590:4: otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_5=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleFuncion7956); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getFuncionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3594:1: ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3595:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3595:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3596:3: lv_parametrofuncion_6_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion7977);
                    	    lv_parametrofuncion_6_0=ruleParametroFuncion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametrofuncion",
                    	            		lv_parametrofuncion_6_0, 
                    	            		"ParametroFuncion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFuncion7993); 

                	newLeafNode(otherlv_7, grammarAccess.getFuncionAccess().getRightParenthesisKeyword_5());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3616:1: (otherlv_8= 'const' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==14) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3616:3: otherlv_8= 'const'
                    {
                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFuncion8006); 

                        	newLeafNode(otherlv_8, grammarAccess.getFuncionAccess().getConstKeyword_6());
                        

                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3620:3: (otherlv_9= 'tipo' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==15) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3620:5: otherlv_9= 'tipo'
                    {
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFuncion8021); 

                        	newLeafNode(otherlv_9, grammarAccess.getFuncionAccess().getTipoKeyword_7());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleFuncion8035); 

                	newLeafNode(otherlv_10, grammarAccess.getFuncionAccess().getVarKeyword_8());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3628:1: ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_STRING && LA69_0<=RULE_ID)||(LA69_0>=55 && LA69_0<=59)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3628:2: ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3628:2: ( (lv_declaracion_11_0= ruleDeclaracion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3629:1: (lv_declaracion_11_0= ruleDeclaracion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3629:1: (lv_declaracion_11_0= ruleDeclaracion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3630:3: lv_declaracion_11_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_9_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion8057);
                    lv_declaracion_11_0=ruleDeclaracion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	        }
                           		add(
                           			current, 
                           			"declaracion",
                            		lv_declaracion_11_0, 
                            		"Declaracion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3646:2: ( (lv_declaracion_12_0= ruleDeclaracion ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( ((LA68_0>=RULE_STRING && LA68_0<=RULE_ID)||(LA68_0>=55 && LA68_0<=59)) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3647:1: (lv_declaracion_12_0= ruleDeclaracion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3647:1: (lv_declaracion_12_0= ruleDeclaracion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3648:3: lv_declaracion_12_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion8078);
                    	    lv_declaracion_12_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declaracion",
                    	            		lv_declaracion_12_0, 
                    	            		"Declaracion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleFuncion8093); 

                	newLeafNode(otherlv_13, grammarAccess.getFuncionAccess().getInicioKeyword_10());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3668:1: ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=RULE_STRING && LA71_0<=RULE_ID)||(LA71_0>=39 && LA71_0<=41)||LA71_0==44||LA71_0==47||LA71_0==49||LA71_0==52) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3668:2: ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3668:2: ( (lv_sentencias_14_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3669:1: (lv_sentencias_14_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3669:1: (lv_sentencias_14_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3670:3: lv_sentencias_14_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_11_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion8115);
                    lv_sentencias_14_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_14_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3686:2: ( (lv_sentencias_15_0= ruleSentencias ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( ((LA70_0>=RULE_STRING && LA70_0<=RULE_ID)||(LA70_0>=39 && LA70_0<=41)||LA70_0==44||LA70_0==47||LA70_0==49||LA70_0==52) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3687:1: (lv_sentencias_15_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3687:1: (lv_sentencias_15_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3688:3: lv_sentencias_15_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion8136);
                    	    lv_sentencias_15_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_15_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3704:5: ( (lv_devuelve_16_0= ruleDevolver ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==78) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3705:1: (lv_devuelve_16_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3705:1: (lv_devuelve_16_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3706:3: lv_devuelve_16_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getDevuelveDevolverParserRuleCall_12_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleFuncion8160);
                    lv_devuelve_16_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_16_0, 
                            		"Devolver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleFuncion8173); 

                	newLeafNode(otherlv_17, grammarAccess.getFuncionAccess().getFin_funcionKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncion"


    // $ANTLR start "entryRuleProcedimiento"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3734:1: entryRuleProcedimiento returns [EObject current=null] : iv_ruleProcedimiento= ruleProcedimiento EOF ;
    public final EObject entryRuleProcedimiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedimiento = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3735:2: (iv_ruleProcedimiento= ruleProcedimiento EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3736:2: iv_ruleProcedimiento= ruleProcedimiento EOF
            {
             newCompositeNode(grammarAccess.getProcedimientoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento8209);
            iv_ruleProcedimiento=ruleProcedimiento();

            state._fsp--;

             current =iv_ruleProcedimiento; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcedimiento8219); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcedimiento"


    // $ANTLR start "ruleProcedimiento"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3743:1: ruleProcedimiento returns [EObject current=null] : (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' ) ;
    public final EObject ruleProcedimiento() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_parametrofuncion_3_0 = null;

        EObject lv_parametrofuncion_5_0 = null;

        EObject lv_declaracion_10_0 = null;

        EObject lv_declaracion_11_0 = null;

        EObject lv_sentencias_13_0 = null;

        EObject lv_sentencias_14_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3746:28: ( (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3747:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3747:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3747:3: otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento'
            {
            otherlv_0=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleProcedimiento8256); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedimientoAccess().getProcedimientoKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3751:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3752:1: (lv_nombre_1_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3752:1: (lv_nombre_1_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3753:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProcedimientoAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcedimiento8277);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProcedimiento8289); 

                	newLeafNode(otherlv_2, grammarAccess.getProcedimientoAccess().getLeftParenthesisKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3773:1: ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==62||(LA74_0>=86 && LA74_0<=87)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3773:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3773:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3774:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3774:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3775:3: lv_parametrofuncion_3_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento8311);
                    lv_parametrofuncion_3_0=ruleParametroFuncion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	        }
                           		add(
                           			current, 
                           			"parametrofuncion",
                            		lv_parametrofuncion_3_0, 
                            		"ParametroFuncion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3791:2: (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==38) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3791:4: otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleProcedimiento8324); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getProcedimientoAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3795:1: ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3796:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3796:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3797:3: lv_parametrofuncion_5_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento8345);
                    	    lv_parametrofuncion_5_0=ruleParametroFuncion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametrofuncion",
                    	            		lv_parametrofuncion_5_0, 
                    	            		"ParametroFuncion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProcedimiento8361); 

                	newLeafNode(otherlv_6, grammarAccess.getProcedimientoAccess().getRightParenthesisKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3817:1: (otherlv_7= 'const' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==14) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3817:3: otherlv_7= 'const'
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProcedimiento8374); 

                        	newLeafNode(otherlv_7, grammarAccess.getProcedimientoAccess().getConstKeyword_5());
                        

                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3821:3: (otherlv_8= 'tipo' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==15) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3821:5: otherlv_8= 'tipo'
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProcedimiento8389); 

                        	newLeafNode(otherlv_8, grammarAccess.getProcedimientoAccess().getTipoKeyword_6());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleProcedimiento8403); 

                	newLeafNode(otherlv_9, grammarAccess.getProcedimientoAccess().getVarKeyword_7());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3829:1: ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=RULE_STRING && LA78_0<=RULE_ID)||(LA78_0>=55 && LA78_0<=59)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3829:2: ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3829:2: ( (lv_declaracion_10_0= ruleDeclaracion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3830:1: (lv_declaracion_10_0= ruleDeclaracion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3830:1: (lv_declaracion_10_0= ruleDeclaracion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3831:3: lv_declaracion_10_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_8_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento8425);
                    lv_declaracion_10_0=ruleDeclaracion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	        }
                           		add(
                           			current, 
                           			"declaracion",
                            		lv_declaracion_10_0, 
                            		"Declaracion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3847:2: ( (lv_declaracion_11_0= ruleDeclaracion ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( ((LA77_0>=RULE_STRING && LA77_0<=RULE_ID)||(LA77_0>=55 && LA77_0<=59)) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3848:1: (lv_declaracion_11_0= ruleDeclaracion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3848:1: (lv_declaracion_11_0= ruleDeclaracion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3849:3: lv_declaracion_11_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento8446);
                    	    lv_declaracion_11_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declaracion",
                    	            		lv_declaracion_11_0, 
                    	            		"Declaracion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleProcedimiento8461); 

                	newLeafNode(otherlv_12, grammarAccess.getProcedimientoAccess().getInicioKeyword_9());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3869:1: ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=RULE_STRING && LA80_0<=RULE_ID)||(LA80_0>=39 && LA80_0<=41)||LA80_0==44||LA80_0==47||LA80_0==49||LA80_0==52) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3869:2: ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3869:2: ( (lv_sentencias_13_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3870:1: (lv_sentencias_13_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3870:1: (lv_sentencias_13_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3871:3: lv_sentencias_13_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_10_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento8483);
                    lv_sentencias_13_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_13_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3887:2: ( (lv_sentencias_14_0= ruleSentencias ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( ((LA79_0>=RULE_STRING && LA79_0<=RULE_ID)||(LA79_0>=39 && LA79_0<=41)||LA79_0==44||LA79_0==47||LA79_0==49||LA79_0==52) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3888:1: (lv_sentencias_14_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3888:1: (lv_sentencias_14_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3889:3: lv_sentencias_14_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento8504);
                    	    lv_sentencias_14_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_14_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleProcedimiento8519); 

                	newLeafNode(otherlv_15, grammarAccess.getProcedimientoAccess().getFin_procedimientoKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcedimiento"


    // $ANTLR start "entryRuleTipoPaso"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3917:1: entryRuleTipoPaso returns [String current=null] : iv_ruleTipoPaso= ruleTipoPaso EOF ;
    public final String entryRuleTipoPaso() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoPaso = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3918:2: (iv_ruleTipoPaso= ruleTipoPaso EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3919:2: iv_ruleTipoPaso= ruleTipoPaso EOF
            {
             newCompositeNode(grammarAccess.getTipoPasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso8556);
            iv_ruleTipoPaso=ruleTipoPaso();

            state._fsp--;

             current =iv_ruleTipoPaso.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoPaso8567); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoPaso"


    // $ANTLR start "ruleTipoPaso"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3926:1: ruleTipoPaso returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'E' | kw= 'E/S' | kw= 'S' ) ;
    public final AntlrDatatypeRuleToken ruleTipoPaso() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3929:28: ( (kw= 'E' | kw= 'E/S' | kw= 'S' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3930:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3930:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            int alt81=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt81=1;
                }
                break;
            case 86:
                {
                alt81=2;
                }
                break;
            case 87:
                {
                alt81=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3931:2: kw= 'E'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleTipoPaso8605); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3938:2: kw= 'E/S'
                    {
                    kw=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleTipoPaso8624); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getESKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3945:2: kw= 'S'
                    {
                    kw=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleTipoPaso8643); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getSKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoPaso"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA16_eotS =
        "\26\uffff";
    static final String DFA16_eofS =
        "\1\uffff\2\14\2\uffff\1\16\13\uffff\1\6\3\uffff\1\6";
    static final String DFA16_minS =
        "\3\4\1\uffff\1\11\1\4\1\uffff\1\4\5\uffff\1\11\3\uffff\1\4\3\11"+
        "\1\4";
    static final String DFA16_maxS =
        "\1\101\2\125\1\uffff\1\75\1\125\1\uffff\1\121\5\uffff\1\11\3\uffff"+
        "\1\125\2\74\1\11\1\125";
    static final String DFA16_acceptS =
        "\3\uffff\1\3\2\uffff\1\5\1\uffff\1\7\1\10\1\11\1\1\1\2\1\uffff"+
        "\1\4\1\12\1\6\5\uffff";
    static final String DFA16_specialS =
        "\26\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\11\1\1\1\2\1\uffff\1\3\1\5\6\uffff\1\7\1\uffff\10\12\42"+
            "\uffff\1\4\1\6\2\uffff\2\10",
            "\6\14\5\uffff\1\14\1\13\1\14\13\uffff\1\14\3\uffff\2\14\1"+
            "\uffff\1\14\2\uffff\27\14\2\uffff\17\14\4\uffff\3\14",
            "\6\14\5\uffff\1\14\1\13\1\14\13\uffff\1\14\3\uffff\2\14\1"+
            "\uffff\1\14\2\uffff\27\14\2\uffff\17\14\4\uffff\3\14",
            "",
            "\1\5\63\uffff\1\6",
            "\3\16\1\uffff\2\16\5\uffff\1\16\1\uffff\1\16\13\uffff\1\16"+
            "\3\uffff\2\16\1\uffff\1\16\2\uffff\26\16\1\15\2\uffff\17\16"+
            "\4\uffff\3\16",
            "",
            "\3\20\1\uffff\2\20\6\uffff\1\20\1\uffff\10\20\42\uffff\2\20"+
            "\2\uffff\2\20\15\uffff\3\17",
            "",
            "",
            "",
            "",
            "",
            "\1\21",
            "",
            "",
            "",
            "\3\6\1\uffff\2\6\5\uffff\1\6\1\uffff\1\6\13\uffff\1\6\3\uffff"+
            "\2\6\1\uffff\1\6\1\16\1\uffff\27\6\1\22\1\23\17\6\4\uffff\3"+
            "\6",
            "\1\25\62\uffff\1\24",
            "\1\25\62\uffff\1\24",
            "\1\25",
            "\3\6\1\uffff\2\6\5\uffff\1\6\1\uffff\1\6\13\uffff\1\6\3\uffff"+
            "\2\6\1\uffff\1\6\1\16\1\uffff\27\6\2\uffff\17\6\4\uffff\3\6"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "765:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria )";
        }
    }
    static final String DFA41_eotS =
        "\6\uffff";
    static final String DFA41_eofS =
        "\1\4\5\uffff";
    static final String DFA41_minS =
        "\1\4\2\7\2\uffff\1\7";
    static final String DFA41_maxS =
        "\1\116\2\121\2\uffff\1\45";
    static final String DFA41_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA41_specialS =
        "\6\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\4\1\1\1\2\1\uffff\2\4\35\uffff\3\3\2\uffff\1\3\2\uffff\1"+
            "\3\1\uffff\1\3\2\uffff\1\3\1\4\6\uffff\2\4\2\uffff\2\4\14\uffff"+
            "\1\4",
            "\1\5\10\uffff\1\3\11\uffff\1\3\12\uffff\1\4\51\uffff\3\3",
            "\1\5\10\uffff\1\3\11\uffff\1\3\12\uffff\1\4\51\uffff\3\3",
            "",
            "",
            "\1\5\22\uffff\1\3\12\uffff\1\4"
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "2185:1: ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )?";
        }
    }
    static final String DFA40_eotS =
        "\6\uffff";
    static final String DFA40_eofS =
        "\1\1\5\uffff";
    static final String DFA40_minS =
        "\1\4\1\uffff\2\7\1\uffff\1\7";
    static final String DFA40_maxS =
        "\1\116\1\uffff\2\121\1\uffff\1\45";
    static final String DFA40_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\1\uffff";
    static final String DFA40_specialS =
        "\6\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1\1\2\1\3\1\uffff\2\1\35\uffff\3\4\2\uffff\1\4\2\uffff\1"+
            "\4\1\uffff\1\4\2\uffff\1\4\1\1\6\uffff\2\1\2\uffff\2\1\14\uffff"+
            "\1\1",
            "",
            "\1\5\10\uffff\1\4\11\uffff\1\4\12\uffff\1\1\51\uffff\3\4",
            "\1\5\10\uffff\1\4\11\uffff\1\4\12\uffff\1\1\51\uffff\3\4",
            "",
            "\1\5\22\uffff\1\4\12\uffff\1\1"
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "()* loopback of 2203:2: ( (lv_sentencias_3_0= ruleSentencias ) )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleCodigo_in_entryRuleCodigo75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCodigo85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleCodigo123 = new BitSet(new long[]{0x0F80000400008060L,0x0000000000100000L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleCodigo145 = new BitSet(new long[]{0x0F80000400008060L,0x0000000000100000L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleCodigo166 = new BitSet(new long[]{0x0F80000400008060L,0x0000000000100000L});
        public static final BitSet FOLLOW_15_in_ruleCodigo184 = new BitSet(new long[]{0x0F80000508008060L,0x0000000000100000L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleCodigo206 = new BitSet(new long[]{0x0F80000508008060L,0x0000000000100000L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleCodigo227 = new BitSet(new long[]{0x0F80000508008060L,0x0000000000100000L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleCodigo254 = new BitSet(new long[]{0x0F80000400008060L,0x0000000000100000L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleCodigo275 = new BitSet(new long[]{0x0F80000400008060L,0x0000000000100000L});
        public static final BitSet FOLLOW_ruleInicio_in_ruleCodigo299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_entryRuleTipoComplejo335 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoComplejo345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_ruleTipoComplejo392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_ruleTipoComplejo419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubproceso_in_entryRuleSubproceso454 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubproceso464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_ruleSubproceso511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_ruleSubproceso538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_entryRuleSentencias573 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSentencias583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_ruleSentencias630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_ruleSentencias657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_ruleSentencias684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_ruleSentencias711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleincremento_in_ruleSentencias738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBloque_in_ruleSentencias765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBloque_in_entryRuleBloque800 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBloque810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_ruleBloque857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_ruleBloque884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_ruleBloque911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_ruleBloque938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_ruleBloque965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_entryRuleDeclaracion1000 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracion1010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_ruleDeclaracion1057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_ruleDeclaracion1084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInternas_in_entryRuleInternas1119 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInternas1129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_ruleInternas1175 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleInternas1187 = new BitSet(new long[]{0x3000000000000370L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleInternas1208 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInternas1220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna1257 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNombreInterna1268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleNombreInterna1306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleNombreInterna1325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleNombreInterna1344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleNombreInterna1363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleNombreInterna1382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleNombreInterna1401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleNombreInterna1420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleNombreInterna1439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_entryRuleOperador1479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperador1489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleOperador1536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstCadena_in_ruleOperador1563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_ruleOperador1590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_ruleOperador1617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_ruleOperador1644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_ruleOperador1671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_entryRuleCaracter1706 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCaracter1716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAR_in_ruleCaracter1757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_entryRulevalor1797 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulevalor1807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_rulevalor1854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rulevalor1881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstCadena_in_rulevalor1908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_rulevalor1935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_rulevalor1962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulevalor1989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_rulevalor2016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_rulevalor2043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInternas_in_rulevalor2070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunaria_in_rulevalor2097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantes_in_entryRuleConstantes2132 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantes2142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleConstantes2188 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleConstantes2200 = new BitSet(new long[]{0x3000000003FD0370L,0x0000000000000003L});
        public static final BitSet FOLLOW_rulevalor_in_ruleConstantes2221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_entryRuleVector2257 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVector2267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleVector2304 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleVector2316 = new BitSet(new long[]{0x3000000003FD0370L,0x0000000000000003L});
        public static final BitSet FOLLOW_rulevalor_in_ruleVector2337 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleVector2349 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleVector2361 = new BitSet(new long[]{0x0F80000000000000L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleVector2382 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleVector2394 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVector2415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_entryRuleMatriz2451 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatriz2461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleMatriz2498 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleMatriz2510 = new BitSet(new long[]{0x3000000003FD0370L,0x0000000000000003L});
        public static final BitSet FOLLOW_rulevalor_in_ruleMatriz2531 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleMatriz2543 = new BitSet(new long[]{0x3000000003FD0370L,0x0000000000000003L});
        public static final BitSet FOLLOW_rulevalor_in_ruleMatriz2564 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleMatriz2576 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMatriz2588 = new BitSet(new long[]{0x0F80000000000000L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleMatriz2609 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMatriz2621 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatriz2642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInicio_in_entryRuleInicio2678 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInicio2688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleInicio2734 = new BitSet(new long[]{0x0F80000800000060L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio2756 = new BitSet(new long[]{0x0F80000800000060L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio2777 = new BitSet(new long[]{0x0F80000800000060L});
        public static final BitSet FOLLOW_35_in_ruleInicio2792 = new BitSet(new long[]{0x0012939000000060L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio2814 = new BitSet(new long[]{0x0012939000000060L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio2835 = new BitSet(new long[]{0x0012939000000060L});
        public static final BitSet FOLLOW_36_in_ruleInicio2850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2887 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable3009 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionVariable3019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable3065 = new BitSet(new long[]{0x0F80002000000000L});
        public static final BitSet FOLLOW_37_in_ruleDeclaracionVariable3078 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable3099 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_38_in_ruleDeclaracionVariable3112 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable3133 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia3171 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionPropia3181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDeclaracionPropia3227 = new BitSet(new long[]{0x0000002000000060L});
        public static final BitSet FOLLOW_37_in_ruleDeclaracionPropia3240 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia3261 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_38_in_ruleDeclaracionPropia3274 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia3295 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_entryRuleLlamadaFuncion3333 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLlamadaFuncion3343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLlamadaFuncion3389 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleLlamadaFuncion3401 = new BitSet(new long[]{0x3000000000020370L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleLlamadaFuncion3423 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_38_in_ruleLlamadaFuncion3436 = new BitSet(new long[]{0x3000000000000370L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleLlamadaFuncion3457 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_17_in_ruleLlamadaFuncion3473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_entryRuleAsignacion3509 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacion3519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsignacion3565 = new BitSet(new long[]{0x0000000004000080L});
        public static final BitSet FOLLOW_RULE_MAT_in_ruleAsignacion3582 = new BitSet(new long[]{0x0000000004000080L});
        public static final BitSet FOLLOW_26_in_ruleAsignacion3600 = new BitSet(new long[]{0x3000000003FD0370L,0x0000000000000003L});
        public static final BitSet FOLLOW_rulevalor_in_ruleAsignacion3621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_entryRuleEscribir3657 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEscribir3667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleEscribir3704 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleEscribir3716 = new BitSet(new long[]{0x3000000000000370L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleEscribir3737 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_38_in_ruleEscribir3750 = new BitSet(new long[]{0x3000000000000370L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleEscribir3771 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_17_in_ruleEscribir3785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_entryRuleLeer3821 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeer3831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleLeer3868 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleLeer3880 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleLeer3901 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLeer3913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_entryRuleSi3949 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSi3959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleSi3996 = new BitSet(new long[]{0x3000000003FD0370L,0x0000000000000003L});
        public static final BitSet FOLLOW_rulevalor_in_ruleSi4017 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleSi4029 = new BitSet(new long[]{0x00129B8000000060L,0x0000000000006000L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi4051 = new BitSet(new long[]{0x00129B8000000060L,0x0000000000006000L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi4072 = new BitSet(new long[]{0x00129B8000000060L,0x0000000000006000L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSi4096 = new BitSet(new long[]{0x0000080000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSino_in_ruleSi4118 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleSi4131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_entryRulemientras4167 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemientras4177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rulemientras4214 = new BitSet(new long[]{0x3000000003FD0370L,0x0000000000000003L});
        public static final BitSet FOLLOW_rulevalor_in_rulemientras4235 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_rulemientras4247 = new BitSet(new long[]{0x0012D38000000060L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras4269 = new BitSet(new long[]{0x0012D38000000060L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras4290 = new BitSet(new long[]{0x0012D38000000060L});
        public static final BitSet FOLLOW_46_in_rulemientras4305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_entryRulerepetir4341 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulerepetir4351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rulerepetir4388 = new BitSet(new long[]{0x0013938000000060L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir4410 = new BitSet(new long[]{0x0013938000000060L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir4431 = new BitSet(new long[]{0x0013938000000060L});
        public static final BitSet FOLLOW_48_in_rulerepetir4446 = new BitSet(new long[]{0x3000000003FD0370L,0x0000000000000003L});
        public static final BitSet FOLLOW_rulevalor_in_rulerepetir4467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_entryRuledesde4503 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuledesde4513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruledesde4550 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleAsignacion_in_ruledesde4571 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruledesde4583 = new BitSet(new long[]{0x3000000003FD0370L,0x0000000000000003L});
        public static final BitSet FOLLOW_rulevalor_in_ruledesde4604 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruledesde4616 = new BitSet(new long[]{0x001A938000000060L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde4638 = new BitSet(new long[]{0x001A938000000060L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde4659 = new BitSet(new long[]{0x001A938000000060L});
        public static final BitSet FOLLOW_51_in_ruledesde4674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaso_in_entryRuleCaso4710 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCaso4720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleCaso4766 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleCaso4778 = new BitSet(new long[]{0x0012938000000062L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso4800 = new BitSet(new long[]{0x0012938000000062L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso4821 = new BitSet(new long[]{0x0012938000000062L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleCaso4845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_entryRulesegun4882 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesegun4892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rulesegun4929 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulesegun4941 = new BitSet(new long[]{0x3000000003FD0370L,0x0000000000000003L});
        public static final BitSet FOLLOW_rulevalor_in_rulesegun4962 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulesegun4974 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_rulesegun4986 = new BitSet(new long[]{0x3020000000000370L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun5008 = new BitSet(new long[]{0x3020000000000370L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun5029 = new BitSet(new long[]{0x3020000000000370L,0x0000000000000003L});
        public static final BitSet FOLLOW_53_in_rulesegun5044 = new BitSet(new long[]{0x0052938000000060L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun5066 = new BitSet(new long[]{0x0052938000000060L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun5087 = new BitSet(new long[]{0x0052938000000060L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleDevolver_in_rulesegun5111 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_rulesegun5124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleincremento_in_entryRuleincremento5160 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleincremento5170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleincremento5216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
        public static final BitSet FOLLOW_ruleinc_in_ruleincremento5237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunaria_in_entryRuleunaria5273 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleunaria5283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleunaria5320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
        public static final BitSet FOLLOW_ruleinc_in_ruleunaria5341 = new BitSet(new long[]{0x3000000003FD0370L,0x0000000000000003L});
        public static final BitSet FOLLOW_rulevalor_in_ruleunaria5362 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleunaria5374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable5411 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoVariable5422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleTipoVariable5460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleTipoVariable5479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleTipoVariable5498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleTipoVariable5517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleTipoVariable5536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable5576 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable5586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable5632 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_RULE_MAT_in_ruleVariable5649 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_ruleVariableID_in_entryRuleVariableID5691 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableID5701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariableID5747 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_RULE_MAT_in_ruleVariableID5764 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_ruleConstCadena_in_entryRuleConstCadena5806 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstCadena5816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAD_in_ruleConstCadena5857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_entryRuleNumeroEntero5897 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumeroEntero5907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumeroEntero5952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_entryRuleNumeroDecimal5987 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumeroDecimal5997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleNumeroDecimal6042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_entryRuleValorBooleano6077 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValorBooleano6087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_ruleValorBooleano6132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt6168 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt6179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleEInt6218 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt6235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat6281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat6292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleEFloat6331 = new BitSet(new long[]{0x2000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat6349 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_61_in_ruleEFloat6369 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat6384 = new BitSet(new long[]{0xC000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleEFloat6404 = new BitSet(new long[]{0x1000000000000200L});
        public static final BitSet FOLLOW_63_in_ruleEFloat6423 = new BitSet(new long[]{0x1000000000000200L});
        public static final BitSet FOLLOW_60_in_ruleEFloat6438 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat6455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_entryRulebooleano6503 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulebooleano6514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rulebooleano6552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rulebooleano6571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_entryRuleoperacion6611 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperacion6621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleoperacion6658 = new BitSet(new long[]{0x3000000003FD0370L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleoperando_izq_in_ruleoperacion6679 = new BitSet(new long[]{0x1000000000000000L,0x0000000000001FFCL});
        public static final BitSet FOLLOW_rulesigno_in_ruleoperacion6700 = new BitSet(new long[]{0x3000000003FD0370L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleoperando_der_in_ruleoperacion6721 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleoperacion6733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesigno_in_entryRulesigno6770 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesigno6781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_rulesigno6819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rulesigno6838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_rulesigno6857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_rulesigno6876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rulesigno6895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_rulesigno6914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_rulesigno6933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_rulesigno6952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_rulesigno6971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_rulesigno6990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_rulesigno7009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_rulesigno7028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_izq_in_entryRuleoperando_izq7068 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperando_izq7078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_ruleoperando_izq7123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_der_in_entryRuleoperando_der7158 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperando_der7168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_ruleoperando_der7213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSino_in_entryRuleSino7248 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSino7258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleSino7304 = new BitSet(new long[]{0x0012938000000062L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino7326 = new BitSet(new long[]{0x0012938000000062L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino7347 = new BitSet(new long[]{0x0012938000000062L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSino7371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDevolver_in_entryRuleDevolver7408 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDevolver7418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleDevolver7464 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDevolver7476 = new BitSet(new long[]{0x3000000003FD0370L,0x0000000000000003L});
        public static final BitSet FOLLOW_rulevalor_in_ruleDevolver7497 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDevolver7509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinc_in_entryRuleinc7546 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleinc7557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_ruleinc7595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleinc7614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleinc7633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion7673 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametroFuncion7683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_ruleParametroFuncion7729 = new BitSet(new long[]{0x0F80000000000000L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleParametroFuncion7750 = new BitSet(new long[]{0x0F80002000000000L});
        public static final BitSet FOLLOW_37_in_ruleParametroFuncion7763 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleParametroFuncion7784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_entryRuleFuncion7820 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncion7830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleFuncion7876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_82_in_ruleFuncion7888 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFuncion7909 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFuncion7921 = new BitSet(new long[]{0x4000000000020000L,0x0000000000C00000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion7943 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_38_in_ruleFuncion7956 = new BitSet(new long[]{0x4000000000000000L,0x0000000000C00000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion7977 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_17_in_ruleFuncion7993 = new BitSet(new long[]{0x000000040000C000L});
        public static final BitSet FOLLOW_14_in_ruleFuncion8006 = new BitSet(new long[]{0x0000000400008000L});
        public static final BitSet FOLLOW_15_in_ruleFuncion8021 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleFuncion8035 = new BitSet(new long[]{0x0F80000800000060L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion8057 = new BitSet(new long[]{0x0F80000800000060L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion8078 = new BitSet(new long[]{0x0F80000800000060L});
        public static final BitSet FOLLOW_35_in_ruleFuncion8093 = new BitSet(new long[]{0x0012938000000060L,0x0000000000084000L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion8115 = new BitSet(new long[]{0x0012938000000060L,0x0000000000084000L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion8136 = new BitSet(new long[]{0x0012938000000060L,0x0000000000084000L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleFuncion8160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_83_in_ruleFuncion8173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento8209 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcedimiento8219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_ruleProcedimiento8256 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcedimiento8277 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProcedimiento8289 = new BitSet(new long[]{0x4000000000020000L,0x0000000000C00000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento8311 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_38_in_ruleProcedimiento8324 = new BitSet(new long[]{0x4000000000000000L,0x0000000000C00000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento8345 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_17_in_ruleProcedimiento8361 = new BitSet(new long[]{0x000000040000C000L});
        public static final BitSet FOLLOW_14_in_ruleProcedimiento8374 = new BitSet(new long[]{0x0000000400008000L});
        public static final BitSet FOLLOW_15_in_ruleProcedimiento8389 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleProcedimiento8403 = new BitSet(new long[]{0x0F80000800000060L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento8425 = new BitSet(new long[]{0x0F80000800000060L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento8446 = new BitSet(new long[]{0x0F80000800000060L});
        public static final BitSet FOLLOW_35_in_ruleProcedimiento8461 = new BitSet(new long[]{0x0012938000000060L,0x0000000000200000L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento8483 = new BitSet(new long[]{0x0012938000000060L,0x0000000000200000L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento8504 = new BitSet(new long[]{0x0012938000000060L,0x0000000000200000L});
        public static final BitSet FOLLOW_85_in_ruleProcedimiento8519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso8556 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoPaso8567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleTipoPaso8605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_ruleTipoPaso8624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleTipoPaso8643 = new BitSet(new long[]{0x0000000000000002L});
    }


}