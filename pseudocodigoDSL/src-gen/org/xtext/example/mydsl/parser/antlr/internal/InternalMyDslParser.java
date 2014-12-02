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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_COMENT", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_FLOAT", "RULE_CAD", "RULE_CAR", "RULE_EXPONENT", "RULE_WS", "RULE_ANY_OTHER", "'Algoritmo'", "'const'", "'tipo'", "'var'", "'fin_algoritmo'", "'abrir'", "'('", "','", "')'", "'cerrar'", "'escritura'", "'lectura'", "'cos'", "'cuadrado'", "'exp'", "'ln'", "'log'", "'sen'", "'sqrt'", "'longitud'", "'concatena'", "'='", "'vector'", "'['", "']'", "'de'", "': '", "'matriz'", "']['", "'registro:'", "'fin_registro'", "'archivo de '", "'{'", "'}'", "'..'", "'principal'", "'inicio'", "'fin_inicio'", "'escribir'", "'leer'", "'si'", "'entonces'", "'fin_si'", "'mientras'", "'hacer'", "'fin_mientras'", "'repetir'", "'hasta_que'", "'desde'", "'hasta'", "'fin_desde'", "'caso'", "'segun_sea'", "') hacer'", "'en_otro_caso:'", "'fin_segun'", "'entero'", "'caracter'", "'real'", "'logico'", "'cadena'", "'verdadero'", "'falso'", "'o'", "'y'", "'=='", "'!='", "'<'", "'>'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "' ('", "') '", "'.'", "'sino'", "'devolver'", "'funcion'", "'fin_funcion'", "'procedimiento'", "'fin_procedimiento'", "'E'", "'E/S'", "'S'"
    };
    public static final int RULE_ID=9;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=4;
    public static final int RULE_STRING=8;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_EXPONENT=13;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_CAR=12;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int RULE_CAD=11;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int RULE_COMENT=6;
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
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_FLOAT=10;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=14;

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleCodigo returns [EObject current=null] : (otherlv_0= 'Algoritmo' ruleEString ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? (otherlv_4= 'const' ( ( (lv_constantes_5_0= ruleConstantes ) ) ( (lv_constantes_6_0= ruleConstantes ) )* )? )? (otherlv_7= 'tipo' ( ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )* )? )? (otherlv_10= 'var' ( ( (lv_global_11_0= ruleDeclaracion ) ) ( (lv_global_12_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_13_0= ruleSubproceso ) ) ( (lv_funcion_14_0= ruleSubproceso ) )* )? ( (lv_tiene_15_0= ruleInicio ) ) otherlv_16= 'fin_algoritmo' ) ;
    public final EObject ruleCodigo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_16=null;
        EObject lv_comentarios_2_0 = null;

        EObject lv_comentarios_3_0 = null;

        EObject lv_constantes_5_0 = null;

        EObject lv_constantes_6_0 = null;

        EObject lv_tipocomplejo_8_0 = null;

        EObject lv_tipocomplejo_9_0 = null;

        EObject lv_global_11_0 = null;

        EObject lv_global_12_0 = null;

        EObject lv_funcion_13_0 = null;

        EObject lv_funcion_14_0 = null;

        EObject lv_tiene_15_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( (otherlv_0= 'Algoritmo' ruleEString ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? (otherlv_4= 'const' ( ( (lv_constantes_5_0= ruleConstantes ) ) ( (lv_constantes_6_0= ruleConstantes ) )* )? )? (otherlv_7= 'tipo' ( ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )* )? )? (otherlv_10= 'var' ( ( (lv_global_11_0= ruleDeclaracion ) ) ( (lv_global_12_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_13_0= ruleSubproceso ) ) ( (lv_funcion_14_0= ruleSubproceso ) )* )? ( (lv_tiene_15_0= ruleInicio ) ) otherlv_16= 'fin_algoritmo' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'Algoritmo' ruleEString ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? (otherlv_4= 'const' ( ( (lv_constantes_5_0= ruleConstantes ) ) ( (lv_constantes_6_0= ruleConstantes ) )* )? )? (otherlv_7= 'tipo' ( ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )* )? )? (otherlv_10= 'var' ( ( (lv_global_11_0= ruleDeclaracion ) ) ( (lv_global_12_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_13_0= ruleSubproceso ) ) ( (lv_funcion_14_0= ruleSubproceso ) )* )? ( (lv_tiene_15_0= ruleInicio ) ) otherlv_16= 'fin_algoritmo' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'Algoritmo' ruleEString ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? (otherlv_4= 'const' ( ( (lv_constantes_5_0= ruleConstantes ) ) ( (lv_constantes_6_0= ruleConstantes ) )* )? )? (otherlv_7= 'tipo' ( ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )* )? )? (otherlv_10= 'var' ( ( (lv_global_11_0= ruleDeclaracion ) ) ( (lv_global_12_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_13_0= ruleSubproceso ) ) ( (lv_funcion_14_0= ruleSubproceso ) )* )? ( (lv_tiene_15_0= ruleInicio ) ) otherlv_16= 'fin_algoritmo' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:3: otherlv_0= 'Algoritmo' ruleEString ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? (otherlv_4= 'const' ( ( (lv_constantes_5_0= ruleConstantes ) ) ( (lv_constantes_6_0= ruleConstantes ) )* )? )? (otherlv_7= 'tipo' ( ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )* )? )? (otherlv_10= 'var' ( ( (lv_global_11_0= ruleDeclaracion ) ) ( (lv_global_12_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_13_0= ruleSubproceso ) ) ( (lv_funcion_14_0= ruleSubproceso ) )* )? ( (lv_tiene_15_0= ruleInicio ) ) otherlv_16= 'fin_algoritmo'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCodigo122); 

                	newLeafNode(otherlv_0, grammarAccess.getCodigoAccess().getAlgoritmoKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getCodigoAccess().getEStringParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCodigo138);
            ruleEString();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:92:1: ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ML_COMMENT && LA2_0<=RULE_SL_COMMENT)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:92:2: ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:92:2: ( (lv_comentarios_2_0= ruleComentario ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:93:1: (lv_comentarios_2_0= ruleComentario )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:93:1: (lv_comentarios_2_0= ruleComentario )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:94:3: lv_comentarios_2_0= ruleComentario
                    {
                     
                    	        newCompositeNode(grammarAccess.getCodigoAccess().getComentariosComentarioParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComentario_in_ruleCodigo159);
                    lv_comentarios_2_0=ruleComentario();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                    	        }
                           		add(
                           			current, 
                           			"comentarios",
                            		lv_comentarios_2_0, 
                            		"Comentario");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:110:2: ( (lv_comentarios_3_0= ruleComentario ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=RULE_ML_COMMENT && LA1_0<=RULE_SL_COMMENT)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:111:1: (lv_comentarios_3_0= ruleComentario )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:111:1: (lv_comentarios_3_0= ruleComentario )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:112:3: lv_comentarios_3_0= ruleComentario
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCodigoAccess().getComentariosComentarioParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleComentario_in_ruleCodigo180);
                    	    lv_comentarios_3_0=ruleComentario();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"comentarios",
                    	            		lv_comentarios_3_0, 
                    	            		"Comentario");
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:128:5: (otherlv_4= 'const' ( ( (lv_constantes_5_0= ruleConstantes ) ) ( (lv_constantes_6_0= ruleConstantes ) )* )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:128:7: otherlv_4= 'const' ( ( (lv_constantes_5_0= ruleConstantes ) ) ( (lv_constantes_6_0= ruleConstantes ) )* )?
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCodigo196); 

                        	newLeafNode(otherlv_4, grammarAccess.getCodigoAccess().getConstKeyword_3_0());
                        
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:132:1: ( ( (lv_constantes_5_0= ruleConstantes ) ) ( (lv_constantes_6_0= ruleConstantes ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:132:2: ( (lv_constantes_5_0= ruleConstantes ) ) ( (lv_constantes_6_0= ruleConstantes ) )*
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:132:2: ( (lv_constantes_5_0= ruleConstantes ) )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:133:1: (lv_constantes_5_0= ruleConstantes )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:133:1: (lv_constantes_5_0= ruleConstantes )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:134:3: lv_constantes_5_0= ruleConstantes
                            {
                             
                            	        newCompositeNode(grammarAccess.getCodigoAccess().getConstantesConstantesParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_ruleCodigo218);
                            lv_constantes_5_0=ruleConstantes();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"constantes",
                                    		lv_constantes_5_0, 
                                    		"Constantes");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:150:2: ( (lv_constantes_6_0= ruleConstantes ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:151:1: (lv_constantes_6_0= ruleConstantes )
                            	    {
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:151:1: (lv_constantes_6_0= ruleConstantes )
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:152:3: lv_constantes_6_0= ruleConstantes
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCodigoAccess().getConstantesConstantesParserRuleCall_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_ruleCodigo239);
                            	    lv_constantes_6_0=ruleConstantes();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"constantes",
                            	            		lv_constantes_6_0, 
                            	            		"Constantes");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:168:7: (otherlv_7= 'tipo' ( ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )* )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:168:9: otherlv_7= 'tipo' ( ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )* )?
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCodigo257); 

                        	newLeafNode(otherlv_7, grammarAccess.getCodigoAccess().getTipoKeyword_4_0());
                        
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:172:1: ( ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||LA7_0==38||LA7_0==43||LA7_0==45||LA7_0==47) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:172:2: ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )*
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:172:2: ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:173:1: (lv_tipocomplejo_8_0= ruleTipoComplejo )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:173:1: (lv_tipocomplejo_8_0= ruleTipoComplejo )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:174:3: lv_tipocomplejo_8_0= ruleTipoComplejo
                            {
                             
                            	        newCompositeNode(grammarAccess.getCodigoAccess().getTipocomplejoTipoComplejoParserRuleCall_4_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_ruleCodigo279);
                            lv_tipocomplejo_8_0=ruleTipoComplejo();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"tipocomplejo",
                                    		lv_tipocomplejo_8_0, 
                                    		"TipoComplejo");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:190:2: ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)||LA6_0==38||LA6_0==43||LA6_0==45||LA6_0==47) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:191:1: (lv_tipocomplejo_9_0= ruleTipoComplejo )
                            	    {
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:191:1: (lv_tipocomplejo_9_0= ruleTipoComplejo )
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:192:3: lv_tipocomplejo_9_0= ruleTipoComplejo
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCodigoAccess().getTipocomplejoTipoComplejoParserRuleCall_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_ruleCodigo300);
                            	    lv_tipocomplejo_9_0=ruleTipoComplejo();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"tipocomplejo",
                            	            		lv_tipocomplejo_9_0, 
                            	            		"TipoComplejo");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:7: (otherlv_10= 'var' ( ( (lv_global_11_0= ruleDeclaracion ) ) ( (lv_global_12_0= ruleDeclaracion ) )* )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:9: otherlv_10= 'var' ( ( (lv_global_11_0= ruleDeclaracion ) ) ( (lv_global_12_0= ruleDeclaracion ) )* )?
                    {
                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCodigo318); 

                        	newLeafNode(otherlv_10, grammarAccess.getCodigoAccess().getVarKeyword_5_0());
                        
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:212:1: ( ( (lv_global_11_0= ruleDeclaracion ) ) ( (lv_global_12_0= ruleDeclaracion ) )* )?
                    int alt10=2;
                    switch ( input.LA(1) ) {
                        case 72:
                            {
                            int LA10_1 = input.LA(2);

                            if ( (LA10_1==42) ) {
                                alt10=1;
                            }
                            }
                            break;
                        case 73:
                            {
                            int LA10_2 = input.LA(2);

                            if ( (LA10_2==42) ) {
                                alt10=1;
                            }
                            }
                            break;
                        case 74:
                            {
                            int LA10_3 = input.LA(2);

                            if ( (LA10_3==42) ) {
                                alt10=1;
                            }
                            }
                            break;
                        case 75:
                            {
                            int LA10_4 = input.LA(2);

                            if ( (LA10_4==42) ) {
                                alt10=1;
                            }
                            }
                            break;
                        case 76:
                            {
                            int LA10_5 = input.LA(2);

                            if ( (LA10_5==42) ) {
                                alt10=1;
                            }
                            }
                            break;
                        case RULE_STRING:
                        case RULE_ID:
                            {
                            alt10=1;
                            }
                            break;
                    }

                    switch (alt10) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:212:2: ( (lv_global_11_0= ruleDeclaracion ) ) ( (lv_global_12_0= ruleDeclaracion ) )*
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:212:2: ( (lv_global_11_0= ruleDeclaracion ) )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:213:1: (lv_global_11_0= ruleDeclaracion )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:213:1: (lv_global_11_0= ruleDeclaracion )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:214:3: lv_global_11_0= ruleDeclaracion
                            {
                             
                            	        newCompositeNode(grammarAccess.getCodigoAccess().getGlobalDeclaracionParserRuleCall_5_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleCodigo340);
                            lv_global_11_0=ruleDeclaracion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"global",
                                    		lv_global_11_0, 
                                    		"Declaracion");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:230:2: ( (lv_global_12_0= ruleDeclaracion ) )*
                            loop9:
                            do {
                                int alt9=2;
                                switch ( input.LA(1) ) {
                                case 72:
                                    {
                                    int LA9_1 = input.LA(2);

                                    if ( (LA9_1==42) ) {
                                        alt9=1;
                                    }


                                    }
                                    break;
                                case 73:
                                    {
                                    int LA9_2 = input.LA(2);

                                    if ( (LA9_2==42) ) {
                                        alt9=1;
                                    }


                                    }
                                    break;
                                case 74:
                                    {
                                    int LA9_3 = input.LA(2);

                                    if ( (LA9_3==42) ) {
                                        alt9=1;
                                    }


                                    }
                                    break;
                                case 75:
                                    {
                                    int LA9_4 = input.LA(2);

                                    if ( (LA9_4==42) ) {
                                        alt9=1;
                                    }


                                    }
                                    break;
                                case 76:
                                    {
                                    int LA9_5 = input.LA(2);

                                    if ( (LA9_5==42) ) {
                                        alt9=1;
                                    }


                                    }
                                    break;
                                case RULE_STRING:
                                case RULE_ID:
                                    {
                                    alt9=1;
                                    }
                                    break;

                                }

                                switch (alt9) {
                            	case 1 :
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:231:1: (lv_global_12_0= ruleDeclaracion )
                            	    {
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:231:1: (lv_global_12_0= ruleDeclaracion )
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:232:3: lv_global_12_0= ruleDeclaracion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCodigoAccess().getGlobalDeclaracionParserRuleCall_5_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleCodigo361);
                            	    lv_global_12_0=ruleDeclaracion();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"global",
                            	            		lv_global_12_0, 
                            	            		"Declaracion");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop9;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:248:7: ( ( (lv_funcion_13_0= ruleSubproceso ) ) ( (lv_funcion_14_0= ruleSubproceso ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=72 && LA13_0<=76)||LA13_0==98) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:248:8: ( (lv_funcion_13_0= ruleSubproceso ) ) ( (lv_funcion_14_0= ruleSubproceso ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:248:8: ( (lv_funcion_13_0= ruleSubproceso ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:249:1: (lv_funcion_13_0= ruleSubproceso )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:249:1: (lv_funcion_13_0= ruleSubproceso )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:250:3: lv_funcion_13_0= ruleSubproceso
                    {
                     
                    	        newCompositeNode(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_ruleCodigo388);
                    lv_funcion_13_0=ruleSubproceso();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                    	        }
                           		add(
                           			current, 
                           			"funcion",
                            		lv_funcion_13_0, 
                            		"Subproceso");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:266:2: ( (lv_funcion_14_0= ruleSubproceso ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=72 && LA12_0<=76)||LA12_0==98) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:267:1: (lv_funcion_14_0= ruleSubproceso )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:267:1: (lv_funcion_14_0= ruleSubproceso )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:268:3: lv_funcion_14_0= ruleSubproceso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_ruleCodigo409);
                    	    lv_funcion_14_0=ruleSubproceso();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"funcion",
                    	            		lv_funcion_14_0, 
                    	            		"Subproceso");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:284:5: ( (lv_tiene_15_0= ruleInicio ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:285:1: (lv_tiene_15_0= ruleInicio )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:285:1: (lv_tiene_15_0= ruleInicio )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:286:3: lv_tiene_15_0= ruleInicio
            {
             
            	        newCompositeNode(grammarAccess.getCodigoAccess().getTieneInicioParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_ruleCodigo433);
            lv_tiene_15_0=ruleInicio();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCodigoRule());
            	        }
                   		set(
                   			current, 
                   			"tiene",
                    		lv_tiene_15_0, 
                    		"Inicio");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_16=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCodigo445); 

                	newLeafNode(otherlv_16, grammarAccess.getCodigoAccess().getFin_algoritmoKeyword_8());
                

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:314:1: entryRuleTipoComplejo returns [EObject current=null] : iv_ruleTipoComplejo= ruleTipoComplejo EOF ;
    public final EObject entryRuleTipoComplejo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoComplejo = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:315:2: (iv_ruleTipoComplejo= ruleTipoComplejo EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:316:2: iv_ruleTipoComplejo= ruleTipoComplejo EOF
            {
             newCompositeNode(grammarAccess.getTipoComplejoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_entryRuleTipoComplejo481);
            iv_ruleTipoComplejo=ruleTipoComplejo();

            state._fsp--;

             current =iv_ruleTipoComplejo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoComplejo491); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:323:1: ruleTipoComplejo returns [EObject current=null] : (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango ) ;
    public final EObject ruleTipoComplejo() throws RecognitionException {
        EObject current = null;

        EObject this_Vector_0 = null;

        EObject this_Matriz_1 = null;

        EObject this_Registro_2 = null;

        EObject this_Archivo_3 = null;

        EObject this_Enumerado_4 = null;

        EObject this_Subrango_5 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:326:28: ( (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:327:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:327:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )
            int alt14=6;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:328:5: this_Vector_0= ruleVector
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getVectorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVector_in_ruleTipoComplejo538);
                    this_Vector_0=ruleVector();

                    state._fsp--;

                     
                            current = this_Vector_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:338:5: this_Matriz_1= ruleMatriz
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getMatrizParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_ruleTipoComplejo565);
                    this_Matriz_1=ruleMatriz();

                    state._fsp--;

                     
                            current = this_Matriz_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:348:5: this_Registro_2= ruleRegistro
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getRegistroParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRegistro_in_ruleTipoComplejo592);
                    this_Registro_2=ruleRegistro();

                    state._fsp--;

                     
                            current = this_Registro_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:358:5: this_Archivo_3= ruleArchivo
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getArchivoParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleArchivo_in_ruleTipoComplejo619);
                    this_Archivo_3=ruleArchivo();

                    state._fsp--;

                     
                            current = this_Archivo_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:368:5: this_Enumerado_4= ruleEnumerado
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getEnumeradoParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerado_in_ruleTipoComplejo646);
                    this_Enumerado_4=ruleEnumerado();

                    state._fsp--;

                     
                            current = this_Enumerado_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:378:5: this_Subrango_5= ruleSubrango
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getSubrangoParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrango_in_ruleTipoComplejo673);
                    this_Subrango_5=ruleSubrango();

                    state._fsp--;

                     
                            current = this_Subrango_5; 
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:394:1: entryRuleSubproceso returns [EObject current=null] : iv_ruleSubproceso= ruleSubproceso EOF ;
    public final EObject entryRuleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubproceso = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:395:2: (iv_ruleSubproceso= ruleSubproceso EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:2: iv_ruleSubproceso= ruleSubproceso EOF
            {
             newCompositeNode(grammarAccess.getSubprocesoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_entryRuleSubproceso708);
            iv_ruleSubproceso=ruleSubproceso();

            state._fsp--;

             current =iv_ruleSubproceso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubproceso718); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:403:1: ruleSubproceso returns [EObject current=null] : (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) ;
    public final EObject ruleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject this_Funcion_0 = null;

        EObject this_Procedimiento_1 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:406:28: ( (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:407:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:407:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=72 && LA15_0<=76)) ) {
                alt15=1;
            }
            else if ( (LA15_0==98) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:408:5: this_Funcion_0= ruleFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getSubprocesoAccess().getFuncionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_ruleSubproceso765);
                    this_Funcion_0=ruleFuncion();

                    state._fsp--;

                     
                            current = this_Funcion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:418:5: this_Procedimiento_1= ruleProcedimiento
                    {
                     
                            newCompositeNode(grammarAccess.getSubprocesoAccess().getProcedimientoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_ruleSubproceso792);
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


    // $ANTLR start "entryRuleComentario"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:434:1: entryRuleComentario returns [EObject current=null] : iv_ruleComentario= ruleComentario EOF ;
    public final EObject entryRuleComentario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComentario = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:435:2: (iv_ruleComentario= ruleComentario EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:436:2: iv_ruleComentario= ruleComentario EOF
            {
             newCompositeNode(grammarAccess.getComentarioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComentario_in_entryRuleComentario827);
            iv_ruleComentario=ruleComentario();

            state._fsp--;

             current =iv_ruleComentario; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComentario837); 

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
    // $ANTLR end "entryRuleComentario"


    // $ANTLR start "ruleComentario"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:443:1: ruleComentario returns [EObject current=null] : ( ( () this_ML_COMMENT_1= RULE_ML_COMMENT ) | (this_SL_COMMENT_2= RULE_SL_COMMENT ( (lv_mensaje_3_0= RULE_COMENT ) ) ) ) ;
    public final EObject ruleComentario() throws RecognitionException {
        EObject current = null;

        Token this_ML_COMMENT_1=null;
        Token this_SL_COMMENT_2=null;
        Token lv_mensaje_3_0=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:446:28: ( ( ( () this_ML_COMMENT_1= RULE_ML_COMMENT ) | (this_SL_COMMENT_2= RULE_SL_COMMENT ( (lv_mensaje_3_0= RULE_COMENT ) ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:447:1: ( ( () this_ML_COMMENT_1= RULE_ML_COMMENT ) | (this_SL_COMMENT_2= RULE_SL_COMMENT ( (lv_mensaje_3_0= RULE_COMENT ) ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:447:1: ( ( () this_ML_COMMENT_1= RULE_ML_COMMENT ) | (this_SL_COMMENT_2= RULE_SL_COMMENT ( (lv_mensaje_3_0= RULE_COMENT ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ML_COMMENT) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_SL_COMMENT) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:447:2: ( () this_ML_COMMENT_1= RULE_ML_COMMENT )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:447:2: ( () this_ML_COMMENT_1= RULE_ML_COMMENT )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:447:3: () this_ML_COMMENT_1= RULE_ML_COMMENT
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:447:3: ()
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:448:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getComentarioAccess().getComentarioAction_0_0(),
                                current);
                        

                    }

                    this_ML_COMMENT_1=(Token)match(input,RULE_ML_COMMENT,FollowSets000.FOLLOW_RULE_ML_COMMENT_in_ruleComentario883); 
                     
                        newLeafNode(this_ML_COMMENT_1, grammarAccess.getComentarioAccess().getML_COMMENTTerminalRuleCall_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:458:6: (this_SL_COMMENT_2= RULE_SL_COMMENT ( (lv_mensaje_3_0= RULE_COMENT ) ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:458:6: (this_SL_COMMENT_2= RULE_SL_COMMENT ( (lv_mensaje_3_0= RULE_COMENT ) ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:458:7: this_SL_COMMENT_2= RULE_SL_COMMENT ( (lv_mensaje_3_0= RULE_COMENT ) )
                    {
                    this_SL_COMMENT_2=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_RULE_SL_COMMENT_in_ruleComentario901); 
                     
                        newLeafNode(this_SL_COMMENT_2, grammarAccess.getComentarioAccess().getSL_COMMENTTerminalRuleCall_1_0()); 
                        
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:462:1: ( (lv_mensaje_3_0= RULE_COMENT ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:463:1: (lv_mensaje_3_0= RULE_COMENT )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:463:1: (lv_mensaje_3_0= RULE_COMENT )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:464:3: lv_mensaje_3_0= RULE_COMENT
                    {
                    lv_mensaje_3_0=(Token)match(input,RULE_COMENT,FollowSets000.FOLLOW_RULE_COMENT_in_ruleComentario917); 

                    			newLeafNode(lv_mensaje_3_0, grammarAccess.getComentarioAccess().getMensajeCOMENTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComentarioRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"mensaje",
                            		lv_mensaje_3_0, 
                            		"COMENT");
                    	    

                    }


                    }


                    }


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
    // $ANTLR end "ruleComentario"


    // $ANTLR start "entryRuleSentencias"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:488:1: entryRuleSentencias returns [EObject current=null] : iv_ruleSentencias= ruleSentencias EOF ;
    public final EObject entryRuleSentencias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentencias = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:489:2: (iv_ruleSentencias= ruleSentencias EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:490:2: iv_ruleSentencias= ruleSentencias EOF
            {
             newCompositeNode(grammarAccess.getSentenciasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_entryRuleSentencias959);
            iv_ruleSentencias=ruleSentencias();

            state._fsp--;

             current =iv_ruleSentencias; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentencias969); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:497:1: ruleSentencias returns [EObject current=null] : (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Primaria_6= rulePrimaria ) ;
    public final EObject ruleSentencias() throws RecognitionException {
        EObject current = null;

        EObject this_Escribir_0 = null;

        EObject this_Leer_1 = null;

        EObject this_Bloque_2 = null;

        EObject this_FuncionFicheroAbrir_3 = null;

        EObject this_FuncionFicheroCerrar_4 = null;

        EObject this_Asignacion_5 = null;

        EObject this_Primaria_6 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:500:28: ( (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Primaria_6= rulePrimaria ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:501:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Primaria_6= rulePrimaria )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:501:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Primaria_6= rulePrimaria )
            int alt17=7;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:502:5: this_Escribir_0= ruleEscribir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getEscribirParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_ruleSentencias1016);
                    this_Escribir_0=ruleEscribir();

                    state._fsp--;

                     
                            current = this_Escribir_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:512:5: this_Leer_1= ruleLeer
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getLeerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLeer_in_ruleSentencias1043);
                    this_Leer_1=ruleLeer();

                    state._fsp--;

                     
                            current = this_Leer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:522:5: this_Bloque_2= ruleBloque
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getBloqueParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBloque_in_ruleSentencias1070);
                    this_Bloque_2=ruleBloque();

                    state._fsp--;

                     
                            current = this_Bloque_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:532:5: this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionFicheroAbrirParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroAbrir_in_ruleSentencias1097);
                    this_FuncionFicheroAbrir_3=ruleFuncionFicheroAbrir();

                    state._fsp--;

                     
                            current = this_FuncionFicheroAbrir_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:542:5: this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionFicheroCerrarParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroCerrar_in_ruleSentencias1124);
                    this_FuncionFicheroCerrar_4=ruleFuncionFicheroCerrar();

                    state._fsp--;

                     
                            current = this_FuncionFicheroCerrar_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:552:5: this_Asignacion_5= ruleAsignacion
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getAsignacionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_ruleSentencias1151);
                    this_Asignacion_5=ruleAsignacion();

                    state._fsp--;

                     
                            current = this_Asignacion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:562:5: this_Primaria_6= rulePrimaria
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getPrimariaParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleSentencias1178);
                    this_Primaria_6=rulePrimaria();

                    state._fsp--;

                     
                            current = this_Primaria_6; 
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:578:1: entryRuleBloque returns [EObject current=null] : iv_ruleBloque= ruleBloque EOF ;
    public final EObject entryRuleBloque() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBloque = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:579:2: (iv_ruleBloque= ruleBloque EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:580:2: iv_ruleBloque= ruleBloque EOF
            {
             newCompositeNode(grammarAccess.getBloqueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBloque_in_entryRuleBloque1213);
            iv_ruleBloque=ruleBloque();

            state._fsp--;

             current =iv_ruleBloque; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBloque1223); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:587:1: ruleBloque returns [EObject current=null] : (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) ;
    public final EObject ruleBloque() throws RecognitionException {
        EObject current = null;

        EObject this_Si_0 = null;

        EObject this_mientras_1 = null;

        EObject this_repetir_2 = null;

        EObject this_desde_3 = null;

        EObject this_segun_4 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:590:28: ( (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:591:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:591:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt18=1;
                }
                break;
            case 59:
                {
                alt18=2;
                }
                break;
            case 62:
                {
                alt18=3;
                }
                break;
            case 64:
                {
                alt18=4;
                }
                break;
            case 68:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:592:5: this_Si_0= ruleSi
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSiParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSi_in_ruleBloque1270);
                    this_Si_0=ruleSi();

                    state._fsp--;

                     
                            current = this_Si_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:602:5: this_mientras_1= rulemientras
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getMientrasParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemientras_in_ruleBloque1297);
                    this_mientras_1=rulemientras();

                    state._fsp--;

                     
                            current = this_mientras_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:612:5: this_repetir_2= rulerepetir
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getRepetirParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulerepetir_in_ruleBloque1324);
                    this_repetir_2=rulerepetir();

                    state._fsp--;

                     
                            current = this_repetir_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:622:5: this_desde_3= ruledesde
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getDesdeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruledesde_in_ruleBloque1351);
                    this_desde_3=ruledesde();

                    state._fsp--;

                     
                            current = this_desde_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:632:5: this_segun_4= rulesegun
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSegunParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulesegun_in_ruleBloque1378);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:1: entryRuleDeclaracion returns [EObject current=null] : iv_ruleDeclaracion= ruleDeclaracion EOF ;
    public final EObject entryRuleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:649:2: (iv_ruleDeclaracion= ruleDeclaracion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:650:2: iv_ruleDeclaracion= ruleDeclaracion EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_entryRuleDeclaracion1413);
            iv_ruleDeclaracion=ruleDeclaracion();

            state._fsp--;

             current =iv_ruleDeclaracion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracion1423); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:657:1: ruleDeclaracion returns [EObject current=null] : (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) ;
    public final EObject ruleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject this_DeclaracionVariable_0 = null;

        EObject this_DeclaracionPropia_1 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:660:28: ( (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:661:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:661:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=72 && LA19_0<=76)) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:662:5: this_DeclaracionVariable_0= ruleDeclaracionVariable
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionVariableParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_ruleDeclaracion1470);
                    this_DeclaracionVariable_0=ruleDeclaracionVariable();

                    state._fsp--;

                     
                            current = this_DeclaracionVariable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:672:5: this_DeclaracionPropia_1= ruleDeclaracionPropia
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionPropiaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_ruleDeclaracion1497);
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


    // $ANTLR start "entryRuleFuncionFicheroAbrir"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:688:1: entryRuleFuncionFicheroAbrir returns [EObject current=null] : iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF ;
    public final EObject entryRuleFuncionFicheroAbrir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncionFicheroAbrir = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:689:2: (iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:690:2: iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF
            {
             newCompositeNode(grammarAccess.getFuncionFicheroAbrirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroAbrir_in_entryRuleFuncionFicheroAbrir1532);
            iv_ruleFuncionFicheroAbrir=ruleFuncionFicheroAbrir();

            state._fsp--;

             current =iv_ruleFuncionFicheroAbrir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncionFicheroAbrir1542); 

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
    // $ANTLR end "entryRuleFuncionFicheroAbrir"


    // $ANTLR start "ruleFuncionFicheroAbrir"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:697:1: ruleFuncionFicheroAbrir returns [EObject current=null] : (otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' ) ;
    public final EObject ruleFuncionFicheroAbrir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_variable_2_0 = null;

        AntlrDatatypeRuleToken lv_modo_4_0 = null;

        EObject lv_variable_6_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:700:28: ( (otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:701:1: (otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:701:1: (otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:701:3: otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFuncionFicheroAbrir1579); 

                	newLeafNode(otherlv_0, grammarAccess.getFuncionFicheroAbrirAccess().getAbrirKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFuncionFicheroAbrir1591); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionFicheroAbrirAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:709:1: ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:709:2: ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:709:2: ( (lv_variable_2_0= rulePrimaria ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:710:1: (lv_variable_2_0= rulePrimaria )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:710:1: (lv_variable_2_0= rulePrimaria )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:711:3: lv_variable_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getVariablePrimariaParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir1613);
            lv_variable_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionFicheroAbrirRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFuncionFicheroAbrir1625); 

                	newLeafNode(otherlv_3, grammarAccess.getFuncionFicheroAbrirAccess().getCommaKeyword_2_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:1: ( (lv_modo_4_0= ruleModoApertura ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:732:1: (lv_modo_4_0= ruleModoApertura )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:732:1: (lv_modo_4_0= ruleModoApertura )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:733:3: lv_modo_4_0= ruleModoApertura
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getModoModoAperturaParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleModoApertura_in_ruleFuncionFicheroAbrir1646);
            lv_modo_4_0=ruleModoApertura();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionFicheroAbrirRule());
            	        }
                   		set(
                   			current, 
                   			"modo",
                    		lv_modo_4_0, 
                    		"ModoApertura");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFuncionFicheroAbrir1658); 

                	newLeafNode(otherlv_5, grammarAccess.getFuncionFicheroAbrirAccess().getCommaKeyword_2_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:753:1: ( (lv_variable_6_0= rulePrimaria ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:754:1: (lv_variable_6_0= rulePrimaria )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:754:1: (lv_variable_6_0= rulePrimaria )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:3: lv_variable_6_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getVariablePrimariaParserRuleCall_2_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir1679);
            lv_variable_6_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionFicheroAbrirRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_6_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFuncionFicheroAbrir1692); 

                	newLeafNode(otherlv_7, grammarAccess.getFuncionFicheroAbrirAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleFuncionFicheroAbrir"


    // $ANTLR start "entryRuleFuncionFicheroCerrar"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:783:1: entryRuleFuncionFicheroCerrar returns [EObject current=null] : iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF ;
    public final EObject entryRuleFuncionFicheroCerrar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncionFicheroCerrar = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:784:2: (iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:785:2: iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF
            {
             newCompositeNode(grammarAccess.getFuncionFicheroCerrarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroCerrar_in_entryRuleFuncionFicheroCerrar1728);
            iv_ruleFuncionFicheroCerrar=ruleFuncionFicheroCerrar();

            state._fsp--;

             current =iv_ruleFuncionFicheroCerrar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncionFicheroCerrar1738); 

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
    // $ANTLR end "entryRuleFuncionFicheroCerrar"


    // $ANTLR start "ruleFuncionFicheroCerrar"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:792:1: ruleFuncionFicheroCerrar returns [EObject current=null] : (otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) ;
    public final EObject ruleFuncionFicheroCerrar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:795:28: ( (otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:796:1: (otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:796:1: (otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:796:3: otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleFuncionFicheroCerrar1775); 

                	newLeafNode(otherlv_0, grammarAccess.getFuncionFicheroCerrarAccess().getCerrarKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFuncionFicheroCerrar1787); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionFicheroCerrarAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:804:1: ( (lv_variable_2_0= rulePrimaria ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:805:1: (lv_variable_2_0= rulePrimaria )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:805:1: (lv_variable_2_0= rulePrimaria )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:806:3: lv_variable_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroCerrarAccess().getVariablePrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleFuncionFicheroCerrar1808);
            lv_variable_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionFicheroCerrarRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFuncionFicheroCerrar1820); 

                	newLeafNode(otherlv_3, grammarAccess.getFuncionFicheroCerrarAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleFuncionFicheroCerrar"


    // $ANTLR start "entryRuleModoApertura"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:834:1: entryRuleModoApertura returns [String current=null] : iv_ruleModoApertura= ruleModoApertura EOF ;
    public final String entryRuleModoApertura() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModoApertura = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:835:2: (iv_ruleModoApertura= ruleModoApertura EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:836:2: iv_ruleModoApertura= ruleModoApertura EOF
            {
             newCompositeNode(grammarAccess.getModoAperturaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModoApertura_in_entryRuleModoApertura1857);
            iv_ruleModoApertura=ruleModoApertura();

            state._fsp--;

             current =iv_ruleModoApertura.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModoApertura1868); 

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
    // $ANTLR end "entryRuleModoApertura"


    // $ANTLR start "ruleModoApertura"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:843:1: ruleModoApertura returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'escritura' | kw= 'lectura' ) ;
    public final AntlrDatatypeRuleToken ruleModoApertura() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:846:28: ( (kw= 'escritura' | kw= 'lectura' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:847:1: (kw= 'escritura' | kw= 'lectura' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:847:1: (kw= 'escritura' | kw= 'lectura' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            else if ( (LA20_0==27) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:848:2: kw= 'escritura'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleModoApertura1906); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModoAperturaAccess().getEscrituraKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:855:2: kw= 'lectura'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleModoApertura1925); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModoAperturaAccess().getLecturaKeyword_1()); 
                        

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
    // $ANTLR end "ruleModoApertura"


    // $ANTLR start "entryRuleNombreInterna"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:868:1: entryRuleNombreInterna returns [String current=null] : iv_ruleNombreInterna= ruleNombreInterna EOF ;
    public final String entryRuleNombreInterna() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNombreInterna = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:869:2: (iv_ruleNombreInterna= ruleNombreInterna EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:870:2: iv_ruleNombreInterna= ruleNombreInterna EOF
            {
             newCompositeNode(grammarAccess.getNombreInternaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna1966);
            iv_ruleNombreInterna=ruleNombreInterna();

            state._fsp--;

             current =iv_ruleNombreInterna.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNombreInterna1977); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:877:1: ruleNombreInterna returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' | kw= 'concatena' ) ;
    public final AntlrDatatypeRuleToken ruleNombreInterna() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:880:28: ( (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' | kw= 'concatena' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:881:1: (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' | kw= 'concatena' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:881:1: (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' | kw= 'concatena' )
            int alt21=9;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt21=1;
                }
                break;
            case 29:
                {
                alt21=2;
                }
                break;
            case 30:
                {
                alt21=3;
                }
                break;
            case 31:
                {
                alt21=4;
                }
                break;
            case 32:
                {
                alt21=5;
                }
                break;
            case 33:
                {
                alt21=6;
                }
                break;
            case 34:
                {
                alt21=7;
                }
                break;
            case 35:
                {
                alt21=8;
                }
                break;
            case 36:
                {
                alt21=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:882:2: kw= 'cos'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleNombreInterna2015); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCosKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:889:2: kw= 'cuadrado'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleNombreInterna2034); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCuadradoKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:896:2: kw= 'exp'
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleNombreInterna2053); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getExpKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:903:2: kw= 'ln'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleNombreInterna2072); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLnKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:910:2: kw= 'log'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNombreInterna2091); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLogKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:917:2: kw= 'sen'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleNombreInterna2110); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSenKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:924:2: kw= 'sqrt'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleNombreInterna2129); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSqrtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:931:2: kw= 'longitud'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleNombreInterna2148); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLongitudKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:938:2: kw= 'concatena'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleNombreInterna2167); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getConcatenaKeyword_8()); 
                        

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


    // $ANTLR start "entryRuleINTEGER"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:951:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:952:2: (iv_ruleINTEGER= ruleINTEGER EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:953:2: iv_ruleINTEGER= ruleINTEGER EOF
            {
             newCompositeNode(grammarAccess.getINTEGERRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleINTEGER_in_entryRuleINTEGER2208);
            iv_ruleINTEGER=ruleINTEGER();

            state._fsp--;

             current =iv_ruleINTEGER.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleINTEGER2219); 

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
    // $ANTLR end "entryRuleINTEGER"


    // $ANTLR start "ruleINTEGER"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:960:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:963:28: (this_INT_0= RULE_INT )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:964:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleINTEGER2258); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getINTEGERAccess().getINTTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleINTEGER"


    // $ANTLR start "entryRuleCampoRegistro"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:979:1: entryRuleCampoRegistro returns [EObject current=null] : iv_ruleCampoRegistro= ruleCampoRegistro EOF ;
    public final EObject entryRuleCampoRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCampoRegistro = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:980:2: (iv_ruleCampoRegistro= ruleCampoRegistro EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:981:2: iv_ruleCampoRegistro= ruleCampoRegistro EOF
            {
             newCompositeNode(grammarAccess.getCampoRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_entryRuleCampoRegistro2302);
            iv_ruleCampoRegistro=ruleCampoRegistro();

            state._fsp--;

             current =iv_ruleCampoRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCampoRegistro2312); 

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
    // $ANTLR end "entryRuleCampoRegistro"


    // $ANTLR start "ruleCampoRegistro"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:1: ruleCampoRegistro returns [EObject current=null] : ( (lv_nombre_campo_0_0= ruleEString ) ) ;
    public final EObject ruleCampoRegistro() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_campo_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:991:28: ( ( (lv_nombre_campo_0_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:992:1: ( (lv_nombre_campo_0_0= ruleEString ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:992:1: ( (lv_nombre_campo_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:993:1: (lv_nombre_campo_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:993:1: (lv_nombre_campo_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:994:3: lv_nombre_campo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getNombre_campoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCampoRegistro2357);
            lv_nombre_campo_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCampoRegistroRule());
            	        }
                   		set(
                   			current, 
                   			"nombre_campo",
                    		lv_nombre_campo_0_0, 
                    		"EString");
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
    // $ANTLR end "ruleCampoRegistro"


    // $ANTLR start "entryRuleTipo"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1018:1: entryRuleTipo returns [EObject current=null] : iv_ruleTipo= ruleTipo EOF ;
    public final EObject entryRuleTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipo = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1019:2: (iv_ruleTipo= ruleTipo EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1020:2: iv_ruleTipo= ruleTipo EOF
            {
             newCompositeNode(grammarAccess.getTipoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_entryRuleTipo2392);
            iv_ruleTipo=ruleTipo();

            state._fsp--;

             current =iv_ruleTipo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipo2402); 

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
    // $ANTLR end "entryRuleTipo"


    // $ANTLR start "ruleTipo"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1027:1: ruleTipo returns [EObject current=null] : (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) ;
    public final EObject ruleTipo() throws RecognitionException {
        EObject current = null;

        EObject this_TipoDefinido_0 = null;

        EObject this_TipoExistente_1 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1030:28: ( (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1031:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1031:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=72 && LA22_0<=76)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1032:5: this_TipoDefinido_0= ruleTipoDefinido
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoDefinidoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTipoDefinido_in_ruleTipo2449);
                    this_TipoDefinido_0=ruleTipoDefinido();

                    state._fsp--;

                     
                            current = this_TipoDefinido_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1042:5: this_TipoExistente_1= ruleTipoExistente
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoExistenteParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTipoExistente_in_ruleTipo2476);
                    this_TipoExistente_1=ruleTipoExistente();

                    state._fsp--;

                     
                            current = this_TipoExistente_1; 
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
    // $ANTLR end "ruleTipo"


    // $ANTLR start "entryRuleTipoDefinido"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1058:1: entryRuleTipoDefinido returns [EObject current=null] : iv_ruleTipoDefinido= ruleTipoDefinido EOF ;
    public final EObject entryRuleTipoDefinido() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoDefinido = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1059:2: (iv_ruleTipoDefinido= ruleTipoDefinido EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1060:2: iv_ruleTipoDefinido= ruleTipoDefinido EOF
            {
             newCompositeNode(grammarAccess.getTipoDefinidoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoDefinido_in_entryRuleTipoDefinido2511);
            iv_ruleTipoDefinido=ruleTipoDefinido();

            state._fsp--;

             current =iv_ruleTipoDefinido; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoDefinido2521); 

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
    // $ANTLR end "entryRuleTipoDefinido"


    // $ANTLR start "ruleTipoDefinido"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1067:1: ruleTipoDefinido returns [EObject current=null] : ( (lv_tipo_0_0= ruleEString ) ) ;
    public final EObject ruleTipoDefinido() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1070:28: ( ( (lv_tipo_0_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:1: ( (lv_tipo_0_0= ruleEString ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:1: ( (lv_tipo_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1072:1: (lv_tipo_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1072:1: (lv_tipo_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTipoDefinidoAccess().getTipoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTipoDefinido2566);
            lv_tipo_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTipoDefinidoRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_0_0, 
                    		"EString");
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
    // $ANTLR end "ruleTipoDefinido"


    // $ANTLR start "entryRuleTipoExistente"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1097:1: entryRuleTipoExistente returns [EObject current=null] : iv_ruleTipoExistente= ruleTipoExistente EOF ;
    public final EObject entryRuleTipoExistente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoExistente = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1098:2: (iv_ruleTipoExistente= ruleTipoExistente EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1099:2: iv_ruleTipoExistente= ruleTipoExistente EOF
            {
             newCompositeNode(grammarAccess.getTipoExistenteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoExistente_in_entryRuleTipoExistente2601);
            iv_ruleTipoExistente=ruleTipoExistente();

            state._fsp--;

             current =iv_ruleTipoExistente; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoExistente2611); 

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
    // $ANTLR end "entryRuleTipoExistente"


    // $ANTLR start "ruleTipoExistente"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1106:1: ruleTipoExistente returns [EObject current=null] : ( (lv_tipo_0_0= ruleTipoVariable ) ) ;
    public final EObject ruleTipoExistente() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1109:28: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1110:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1110:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1111:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1111:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1112:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getTipoExistenteAccess().getTipoTipoVariableParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleTipoExistente2656);
            lv_tipo_0_0=ruleTipoVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTipoExistenteRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_0_0, 
                    		"TipoVariable");
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
    // $ANTLR end "ruleTipoExistente"


    // $ANTLR start "entryRuleConstantes"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1136:1: entryRuleConstantes returns [EObject current=null] : iv_ruleConstantes= ruleConstantes EOF ;
    public final EObject entryRuleConstantes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantes = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1137:2: (iv_ruleConstantes= ruleConstantes EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1138:2: iv_ruleConstantes= ruleConstantes EOF
            {
             newCompositeNode(grammarAccess.getConstantesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_entryRuleConstantes2691);
            iv_ruleConstantes=ruleConstantes();

            state._fsp--;

             current =iv_ruleConstantes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantes2701); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1145:1: ruleConstantes returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) ) ;
    public final EObject ruleConstantes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_valor_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1148:28: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1149:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1149:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1149:2: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1149:2: ( (lv_variable_0_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1150:1: (lv_variable_0_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1150:1: (lv_variable_0_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1151:3: lv_variable_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getVariableVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleConstantes2747);
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

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleConstantes2759); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantesAccess().getEqualsSignKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1171:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1172:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1172:1: (lv_valor_2_0= rulePrimaria )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1173:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleConstantes2780);
            lv_valor_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantesRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_2_0, 
                    		"Primaria");
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1197:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1198:2: (iv_ruleVector= ruleVector EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1199:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVector_in_entryRuleVector2816);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVector2826); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1206:1: ruleVector returns [EObject current=null] : (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) ) ;
    public final EObject ruleVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_valor_2_0 = null;

        EObject lv_tipo_5_0 = null;

        AntlrDatatypeRuleToken lv_nombre_7_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1209:28: ( (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1210:1: (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1210:1: (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1210:3: otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleVector2863); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getVectorKeyword_0());
                
            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleVector2875); 

                	newLeafNode(otherlv_1, grammarAccess.getVectorAccess().getLeftSquareBracketKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1218:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1219:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1219:1: (lv_valor_2_0= rulePrimaria )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1220:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleVector2896);
            lv_valor_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVectorRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_2_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleVector2908); 

                	newLeafNode(otherlv_3, grammarAccess.getVectorAccess().getRightSquareBracketKeyword_3());
                
            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleVector2920); 

                	newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getDeKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1244:1: ( (lv_tipo_5_0= ruleTipo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1245:1: (lv_tipo_5_0= ruleTipo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1245:1: (lv_tipo_5_0= ruleTipo )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1246:3: lv_tipo_5_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getTipoTipoParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleVector2941);
            lv_tipo_5_0=ruleTipo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVectorRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_5_0, 
                    		"Tipo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleVector2953); 

                	newLeafNode(otherlv_6, grammarAccess.getVectorAccess().getColonSpaceKeyword_6());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1266:1: ( (lv_nombre_7_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1267:1: (lv_nombre_7_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1267:1: (lv_nombre_7_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1268:3: lv_nombre_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getNombreEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVector2974);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1292:1: entryRuleMatriz returns [EObject current=null] : iv_ruleMatriz= ruleMatriz EOF ;
    public final EObject entryRuleMatriz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatriz = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1293:2: (iv_ruleMatriz= ruleMatriz EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1294:2: iv_ruleMatriz= ruleMatriz EOF
            {
             newCompositeNode(grammarAccess.getMatrizRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_entryRuleMatriz3010);
            iv_ruleMatriz=ruleMatriz();

            state._fsp--;

             current =iv_ruleMatriz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatriz3020); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1301:1: ruleMatriz returns [EObject current=null] : (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) ) ;
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

        EObject lv_tipo_7_0 = null;

        AntlrDatatypeRuleToken lv_nombre_9_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1304:28: ( (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1305:1: (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1305:1: (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1305:3: otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMatriz3057); 

                	newLeafNode(otherlv_0, grammarAccess.getMatrizAccess().getMatrizKeyword_0());
                
            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMatriz3069); 

                	newLeafNode(otherlv_1, grammarAccess.getMatrizAccess().getLeftSquareBracketKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1313:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1314:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1314:1: (lv_valor_2_0= rulePrimaria )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1315:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMatriz3090);
            lv_valor_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrizRule());
            	        }
                   		add(
                   			current, 
                   			"valor",
                    		lv_valor_2_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleMatriz3102); 

                	newLeafNode(otherlv_3, grammarAccess.getMatrizAccess().getRightSquareBracketLeftSquareBracketKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1335:1: ( (lv_valor_4_0= rulePrimaria ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1336:1: (lv_valor_4_0= rulePrimaria )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1336:1: (lv_valor_4_0= rulePrimaria )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1337:3: lv_valor_4_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorPrimariaParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMatriz3123);
            lv_valor_4_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrizRule());
            	        }
                   		add(
                   			current, 
                   			"valor",
                    		lv_valor_4_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleMatriz3135); 

                	newLeafNode(otherlv_5, grammarAccess.getMatrizAccess().getRightSquareBracketKeyword_5());
                
            otherlv_6=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleMatriz3147); 

                	newLeafNode(otherlv_6, grammarAccess.getMatrizAccess().getDeKeyword_6());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1361:1: ( (lv_tipo_7_0= ruleTipo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1362:1: (lv_tipo_7_0= ruleTipo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1362:1: (lv_tipo_7_0= ruleTipo )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1363:3: lv_tipo_7_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getTipoTipoParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleMatriz3168);
            lv_tipo_7_0=ruleTipo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrizRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_7_0, 
                    		"Tipo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleMatriz3180); 

                	newLeafNode(otherlv_8, grammarAccess.getMatrizAccess().getColonSpaceKeyword_8());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1383:1: ( (lv_nombre_9_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1384:1: (lv_nombre_9_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1384:1: (lv_nombre_9_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1385:3: lv_nombre_9_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getNombreEStringParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatriz3201);
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


    // $ANTLR start "entryRuleRegistro"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1409:1: entryRuleRegistro returns [EObject current=null] : iv_ruleRegistro= ruleRegistro EOF ;
    public final EObject entryRuleRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistro = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1410:2: (iv_ruleRegistro= ruleRegistro EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1411:2: iv_ruleRegistro= ruleRegistro EOF
            {
             newCompositeNode(grammarAccess.getRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRegistro_in_entryRuleRegistro3237);
            iv_ruleRegistro=ruleRegistro();

            state._fsp--;

             current =iv_ruleRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegistro3247); 

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
    // $ANTLR end "entryRuleRegistro"


    // $ANTLR start "ruleRegistro"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1418:1: ruleRegistro returns [EObject current=null] : (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' ) ;
    public final EObject ruleRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1421:28: ( (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1422:1: (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1422:1: (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1422:3: otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleRegistro3284); 

                	newLeafNode(otherlv_0, grammarAccess.getRegistroAccess().getRegistroKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1426:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1427:1: (lv_nombre_1_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1427:1: (lv_nombre_1_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1428:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRegistro3305);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRegistroRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1444:2: ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1444:3: ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1444:3: ( (lv_variable_2_0= ruleDeclaracion ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1445:1: (lv_variable_2_0= ruleDeclaracion )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1445:1: (lv_variable_2_0= ruleDeclaracion )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1446:3: lv_variable_2_0= ruleDeclaracion
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getVariableDeclaracionParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleRegistro3327);
            lv_variable_2_0=ruleDeclaracion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRegistroRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"Declaracion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1462:2: ( (lv_variable_3_0= ruleDeclaracion ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)||(LA23_0>=72 && LA23_0<=76)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1463:1: (lv_variable_3_0= ruleDeclaracion )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1463:1: (lv_variable_3_0= ruleDeclaracion )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1464:3: lv_variable_3_0= ruleDeclaracion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRegistroAccess().getVariableDeclaracionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleRegistro3348);
            	    lv_variable_3_0=ruleDeclaracion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRegistroRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variable",
            	            		lv_variable_3_0, 
            	            		"Declaracion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleRegistro3362); 

                	newLeafNode(otherlv_4, grammarAccess.getRegistroAccess().getFin_registroKeyword_3());
                

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
    // $ANTLR end "ruleRegistro"


    // $ANTLR start "entryRuleArchivo"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1492:1: entryRuleArchivo returns [EObject current=null] : iv_ruleArchivo= ruleArchivo EOF ;
    public final EObject entryRuleArchivo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchivo = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1493:2: (iv_ruleArchivo= ruleArchivo EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1494:2: iv_ruleArchivo= ruleArchivo EOF
            {
             newCompositeNode(grammarAccess.getArchivoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArchivo_in_entryRuleArchivo3398);
            iv_ruleArchivo=ruleArchivo();

            state._fsp--;

             current =iv_ruleArchivo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArchivo3408); 

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
    // $ANTLR end "entryRuleArchivo"


    // $ANTLR start "ruleArchivo"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1501:1: ruleArchivo returns [EObject current=null] : (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) ) ;
    public final EObject ruleArchivo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_tipo_1_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1504:28: ( (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1505:1: (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1505:1: (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1505:3: otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleArchivo3445); 

                	newLeafNode(otherlv_0, grammarAccess.getArchivoAccess().getArchivoDeKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1509:1: ( (lv_tipo_1_0= ruleTipo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1510:1: (lv_tipo_1_0= ruleTipo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1510:1: (lv_tipo_1_0= ruleTipo )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1511:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleArchivo3466);
            lv_tipo_1_0=ruleTipo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArchivoRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_1_0, 
                    		"Tipo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleArchivo3478); 

                	newLeafNode(otherlv_2, grammarAccess.getArchivoAccess().getColonSpaceKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1531:1: ( (lv_nombre_3_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1532:1: (lv_nombre_3_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1532:1: (lv_nombre_3_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1533:3: lv_nombre_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getNombreEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArchivo3499);
            lv_nombre_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArchivoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_3_0, 
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
    // $ANTLR end "ruleArchivo"


    // $ANTLR start "entryRuleEnumerado"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1557:1: entryRuleEnumerado returns [EObject current=null] : iv_ruleEnumerado= ruleEnumerado EOF ;
    public final EObject entryRuleEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerado = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1558:2: (iv_ruleEnumerado= ruleEnumerado EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1559:2: iv_ruleEnumerado= ruleEnumerado EOF
            {
             newCompositeNode(grammarAccess.getEnumeradoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumerado_in_entryRuleEnumerado3535);
            iv_ruleEnumerado=ruleEnumerado();

            state._fsp--;

             current =iv_ruleEnumerado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerado3545); 

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
    // $ANTLR end "entryRuleEnumerado"


    // $ANTLR start "ruleEnumerado"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1566:1: ruleEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' ) ;
    public final EObject ruleEnumerado() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        EObject lv_valor_3_0 = null;

        EObject lv_valor_5_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1569:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1570:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1570:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1570:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1570:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1571:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1571:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1572:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnumerado3591);
            lv_nombre_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumeradoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEnumerado3603); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumeradoAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEnumerado3615); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumeradoAccess().getLeftCurlyBracketKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1596:1: ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1596:2: ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1596:2: ( (lv_valor_3_0= rulePrimaria ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1597:1: (lv_valor_3_0= rulePrimaria )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1597:1: (lv_valor_3_0= rulePrimaria )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1598:3: lv_valor_3_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorPrimariaParserRuleCall_3_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEnumerado3637);
            lv_valor_3_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumeradoRule());
            	        }
                   		add(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1614:2: (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==23) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1614:4: otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) )
            	    {
            	    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEnumerado3650); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumeradoAccess().getCommaKeyword_3_1_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1618:1: ( (lv_valor_5_0= rulePrimaria ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1619:1: (lv_valor_5_0= rulePrimaria )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1619:1: (lv_valor_5_0= rulePrimaria )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1620:3: lv_valor_5_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorPrimariaParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEnumerado3671);
            	    lv_valor_5_0=rulePrimaria();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumeradoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"valor",
            	            		lv_valor_5_0, 
            	            		"Primaria");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEnumerado3686); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumeradoAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleEnumerado"


    // $ANTLR start "entryRuleSubrango"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1648:1: entryRuleSubrango returns [EObject current=null] : iv_ruleSubrango= ruleSubrango EOF ;
    public final EObject entryRuleSubrango() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrango = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1649:2: (iv_ruleSubrango= ruleSubrango EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1650:2: iv_ruleSubrango= ruleSubrango EOF
            {
             newCompositeNode(grammarAccess.getSubrangoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrango_in_entryRuleSubrango3722);
            iv_ruleSubrango=ruleSubrango();

            state._fsp--;

             current =iv_ruleSubrango; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrango3732); 

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
    // $ANTLR end "entryRuleSubrango"


    // $ANTLR start "ruleSubrango"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1657:1: ruleSubrango returns [EObject current=null] : (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado ) ;
    public final EObject ruleSubrango() throws RecognitionException {
        EObject current = null;

        EObject this_SubrangoNumerico_0 = null;

        EObject this_SubrangoEnumerado_1 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1660:28: ( (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1661:1: (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1661:1: (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==37) ) {
                    int LA25_3 = input.LA(3);

                    if ( ((LA25_3>=RULE_STRING && LA25_3<=RULE_ID)) ) {
                        alt25=2;
                    }
                    else if ( (LA25_3==RULE_INT) ) {
                        alt25=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA25_0==RULE_ID) ) {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==37) ) {
                    int LA25_3 = input.LA(3);

                    if ( ((LA25_3>=RULE_STRING && LA25_3<=RULE_ID)) ) {
                        alt25=2;
                    }
                    else if ( (LA25_3==RULE_INT) ) {
                        alt25=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1662:5: this_SubrangoNumerico_0= ruleSubrangoNumerico
                    {
                     
                            newCompositeNode(grammarAccess.getSubrangoAccess().getSubrangoNumericoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrangoNumerico_in_ruleSubrango3779);
                    this_SubrangoNumerico_0=ruleSubrangoNumerico();

                    state._fsp--;

                     
                            current = this_SubrangoNumerico_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1672:5: this_SubrangoEnumerado_1= ruleSubrangoEnumerado
                    {
                     
                            newCompositeNode(grammarAccess.getSubrangoAccess().getSubrangoEnumeradoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrangoEnumerado_in_ruleSubrango3806);
                    this_SubrangoEnumerado_1=ruleSubrangoEnumerado();

                    state._fsp--;

                     
                            current = this_SubrangoEnumerado_1; 
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
    // $ANTLR end "ruleSubrango"


    // $ANTLR start "entryRuleSubrangoNumerico"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1688:1: entryRuleSubrangoNumerico returns [EObject current=null] : iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF ;
    public final EObject entryRuleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoNumerico = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1689:2: (iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1690:2: iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF
            {
             newCompositeNode(grammarAccess.getSubrangoNumericoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrangoNumerico_in_entryRuleSubrangoNumerico3841);
            iv_ruleSubrangoNumerico=ruleSubrangoNumerico();

            state._fsp--;

             current =iv_ruleSubrangoNumerico; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrangoNumerico3851); 

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
    // $ANTLR end "entryRuleSubrangoNumerico"


    // $ANTLR start "ruleSubrangoNumerico"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1697:1: ruleSubrangoNumerico returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= RULE_INT ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= RULE_INT ) ) ) ;
    public final EObject ruleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_limite_inf_2_0=null;
        Token otherlv_3=null;
        Token lv_limite_sup_4_0=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1700:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= RULE_INT ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= RULE_INT ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1701:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= RULE_INT ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= RULE_INT ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1701:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= RULE_INT ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= RULE_INT ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1701:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= RULE_INT ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= RULE_INT ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1701:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1702:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1702:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1703:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoNumerico3897);
            lv_nombre_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangoNumericoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSubrangoNumerico3909); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoNumericoAccess().getEqualsSignKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1723:1: ( (lv_limite_inf_2_0= RULE_INT ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1724:1: (lv_limite_inf_2_0= RULE_INT )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1724:1: (lv_limite_inf_2_0= RULE_INT )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1725:3: lv_limite_inf_2_0= RULE_INT
            {
            lv_limite_inf_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleSubrangoNumerico3926); 

            			newLeafNode(lv_limite_inf_2_0, grammarAccess.getSubrangoNumericoAccess().getLimite_infINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubrangoNumericoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"limite_inf",
                    		lv_limite_inf_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSubrangoNumerico3943); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoNumericoAccess().getFullStopFullStopKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1745:1: ( (lv_limite_sup_4_0= RULE_INT ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1746:1: (lv_limite_sup_4_0= RULE_INT )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1746:1: (lv_limite_sup_4_0= RULE_INT )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1747:3: lv_limite_sup_4_0= RULE_INT
            {
            lv_limite_sup_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleSubrangoNumerico3960); 

            			newLeafNode(lv_limite_sup_4_0, grammarAccess.getSubrangoNumericoAccess().getLimite_supINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubrangoNumericoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"limite_sup",
                    		lv_limite_sup_4_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleSubrangoNumerico"


    // $ANTLR start "entryRuleSubrangoEnumerado"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1771:1: entryRuleSubrangoEnumerado returns [EObject current=null] : iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF ;
    public final EObject entryRuleSubrangoEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoEnumerado = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1772:2: (iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1773:2: iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF
            {
             newCompositeNode(grammarAccess.getSubrangoEnumeradoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrangoEnumerado_in_entryRuleSubrangoEnumerado4001);
            iv_ruleSubrangoEnumerado=ruleSubrangoEnumerado();

            state._fsp--;

             current =iv_ruleSubrangoEnumerado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrangoEnumerado4011); 

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
    // $ANTLR end "entryRuleSubrangoEnumerado"


    // $ANTLR start "ruleSubrangoEnumerado"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1780:1: ruleSubrangoEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) ;
    public final EObject ruleSubrangoEnumerado() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1783:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1784:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1784:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1784:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1784:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1785:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1785:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1786:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado4057);
            lv_nombre_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangoEnumeradoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSubrangoEnumerado4069); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoEnumeradoAccess().getEqualsSignKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1806:1: ( (lv_limite_inf_2_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1807:1: (lv_limite_inf_2_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1807:1: (lv_limite_inf_2_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1808:3: lv_limite_inf_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getLimite_infEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado4090);
            lv_limite_inf_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangoEnumeradoRule());
            	        }
                   		set(
                   			current, 
                   			"limite_inf",
                    		lv_limite_inf_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSubrangoEnumerado4102); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoEnumeradoAccess().getFullStopFullStopKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1828:1: ( (lv_limite_sup_4_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1829:1: (lv_limite_sup_4_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1829:1: (lv_limite_sup_4_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1830:3: lv_limite_sup_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getLimite_supEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado4123);
            lv_limite_sup_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangoEnumeradoRule());
            	        }
                   		set(
                   			current, 
                   			"limite_sup",
                    		lv_limite_sup_4_0, 
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
    // $ANTLR end "ruleSubrangoEnumerado"


    // $ANTLR start "entryRuleInicio"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1854:1: entryRuleInicio returns [EObject current=null] : iv_ruleInicio= ruleInicio EOF ;
    public final EObject entryRuleInicio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInicio = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1855:2: (iv_ruleInicio= ruleInicio EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1856:2: iv_ruleInicio= ruleInicio EOF
            {
             newCompositeNode(grammarAccess.getInicioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_entryRuleInicio4159);
            iv_ruleInicio=ruleInicio();

            state._fsp--;

             current =iv_ruleInicio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInicio4169); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1863:1: ruleInicio returns [EObject current=null] : (otherlv_0= 'principal' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'inicio' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'fin_inicio' ) ;
    public final EObject ruleInicio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_declaracion_3_0 = null;

        EObject lv_declaracion_4_0 = null;

        EObject lv_tiene_6_0 = null;

        EObject lv_tiene_7_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1866:28: ( (otherlv_0= 'principal' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'inicio' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'fin_inicio' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1867:1: (otherlv_0= 'principal' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'inicio' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'fin_inicio' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1867:1: (otherlv_0= 'principal' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'inicio' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'fin_inicio' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1867:3: otherlv_0= 'principal' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'inicio' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'fin_inicio'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleInicio4206); 

                	newLeafNode(otherlv_0, grammarAccess.getInicioAccess().getPrincipalKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1871:1: ()
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1872:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInicioAccess().getInicioAction_1(),
                        current);
                

            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleInicio4227); 

                	newLeafNode(otherlv_2, grammarAccess.getInicioAccess().getVarKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1881:1: ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)||(LA27_0>=72 && LA27_0<=76)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1881:2: ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1881:2: ( (lv_declaracion_3_0= ruleDeclaracion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1882:1: (lv_declaracion_3_0= ruleDeclaracion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1882:1: (lv_declaracion_3_0= ruleDeclaracion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1883:3: lv_declaracion_3_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio4249);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1899:2: ( (lv_declaracion_4_0= ruleDeclaracion ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)||(LA26_0>=72 && LA26_0<=76)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1900:1: (lv_declaracion_4_0= ruleDeclaracion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1900:1: (lv_declaracion_4_0= ruleDeclaracion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1901:3: lv_declaracion_4_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio4270);
                    	    lv_declaracion_4_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInicioRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declaracion",
                    	            		lv_declaracion_4_0, 
                    	            		"Declaracion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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

            otherlv_5=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleInicio4285); 

                	newLeafNode(otherlv_5, grammarAccess.getInicioAccess().getInicioKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1921:1: ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_INT && LA29_0<=RULE_CAR)||LA29_0==21||LA29_0==25||(LA29_0>=28 && LA29_0<=36)||(LA29_0>=54 && LA29_0<=56)||LA29_0==59||LA29_0==62||LA29_0==64||LA29_0==68||(LA29_0>=77 && LA29_0<=78)||LA29_0==91) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1921:2: ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1921:2: ( (lv_tiene_6_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1922:1: (lv_tiene_6_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1922:1: (lv_tiene_6_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1923:3: lv_tiene_6_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio4307);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1939:2: ( (lv_tiene_7_0= ruleSentencias ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>=RULE_INT && LA28_0<=RULE_CAR)||LA28_0==21||LA28_0==25||(LA28_0>=28 && LA28_0<=36)||(LA28_0>=54 && LA28_0<=56)||LA28_0==59||LA28_0==62||LA28_0==64||LA28_0==68||(LA28_0>=77 && LA28_0<=78)||LA28_0==91) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1940:1: (lv_tiene_7_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1940:1: (lv_tiene_7_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1941:3: lv_tiene_7_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio4328);
                    	    lv_tiene_7_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInicioRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"tiene",
                    	            		lv_tiene_7_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleInicio4343); 

                	newLeafNode(otherlv_8, grammarAccess.getInicioAccess().getFin_inicioKeyword_6());
                

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1969:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1970:2: (iv_ruleEString= ruleEString EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1971:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString4380);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString4391); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1978:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1981:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1982:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1982:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1982:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString4431); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1990:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString4457); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2005:1: entryRuleDeclaracionVariable returns [EObject current=null] : iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF ;
    public final EObject entryRuleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionVariable = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2006:2: (iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2007:2: iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable4502);
            iv_ruleDeclaracionVariable=ruleDeclaracionVariable();

            state._fsp--;

             current =iv_ruleDeclaracionVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionVariable4512); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2014:1: ruleDeclaracionVariable returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2017:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2018:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2018:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2018:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2018:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2019:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2019:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2020:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable4558);
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

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDeclaracionVariable4570); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionVariableAccess().getColonSpaceKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2040:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2041:1: (lv_variable_2_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2041:1: (lv_variable_2_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2042:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable4591);
            lv_variable_2_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclaracionVariableRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2058:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==23) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2058:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleDeclaracionVariable4604); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionVariableAccess().getCommaKeyword_3_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2062:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2063:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2063:1: (lv_variable_4_0= ruleVariable )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2064:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable4625);
            	    lv_variable_4_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclaracionVariableRule());
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
            	    break loop31;
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2088:1: entryRuleDeclaracionPropia returns [EObject current=null] : iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF ;
    public final EObject entryRuleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionPropia = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2089:2: (iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2090:2: iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionPropiaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia4663);
            iv_ruleDeclaracionPropia=ruleDeclaracionPropia();

            state._fsp--;

             current =iv_ruleDeclaracionPropia; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionPropia4673); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2097:1: ruleDeclaracionPropia returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2100:28: ( ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2101:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2101:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2101:2: ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2101:2: ( (lv_tipo_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2102:1: (lv_tipo_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2102:1: (lv_tipo_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2103:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getTipoEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDeclaracionPropia4719);
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

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDeclaracionPropia4731); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionPropiaAccess().getColonSpaceKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2123:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2124:1: (lv_variable_2_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2124:1: (lv_variable_2_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2125:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia4752);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2141:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==23) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2141:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleDeclaracionPropia4765); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionPropiaAccess().getCommaKeyword_3_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2145:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2146:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2146:1: (lv_variable_4_0= ruleVariable )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2147:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia4786);
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
            	    break loop32;
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


    // $ANTLR start "entryRuleAsignacion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2171:1: entryRuleAsignacion returns [EObject current=null] : iv_ruleAsignacion= ruleAsignacion EOF ;
    public final EObject entryRuleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2172:2: (iv_ruleAsignacion= ruleAsignacion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2173:2: iv_ruleAsignacion= ruleAsignacion EOF
            {
             newCompositeNode(grammarAccess.getAsignacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_entryRuleAsignacion4824);
            iv_ruleAsignacion=ruleAsignacion();

            state._fsp--;

             current =iv_ruleAsignacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacion4834); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2180:1: ruleAsignacion returns [EObject current=null] : ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_operadores_2_0= ruleoperacion ) ) ) ;
    public final EObject ruleAsignacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_valor_asignacion_0_0 = null;

        EObject lv_operadores_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2183:28: ( ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_operadores_2_0= ruleoperacion ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2184:1: ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_operadores_2_0= ruleoperacion ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2184:1: ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_operadores_2_0= ruleoperacion ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2184:2: ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_operadores_2_0= ruleoperacion ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2184:2: ( (lv_valor_asignacion_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2185:1: (lv_valor_asignacion_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2185:1: (lv_valor_asignacion_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2186:3: lv_valor_asignacion_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionAccess().getValor_asignacionEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsignacion4880);
            lv_valor_asignacion_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionRule());
            	        }
                   		set(
                   			current, 
                   			"valor_asignacion",
                    		lv_valor_asignacion_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAsignacion4892); 

                	newLeafNode(otherlv_1, grammarAccess.getAsignacionAccess().getEqualsSignKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2206:1: ( (lv_operadores_2_0= ruleoperacion ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2207:1: (lv_operadores_2_0= ruleoperacion )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2207:1: (lv_operadores_2_0= ruleoperacion )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2208:3: lv_operadores_2_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionAccess().getOperadoresOperacionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleAsignacion4913);
            lv_operadores_2_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionRule());
            	        }
                   		set(
                   			current, 
                   			"operadores",
                    		lv_operadores_2_0, 
                    		"operacion");
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2232:1: entryRuleEscribir returns [EObject current=null] : iv_ruleEscribir= ruleEscribir EOF ;
    public final EObject entryRuleEscribir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscribir = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2233:2: (iv_ruleEscribir= ruleEscribir EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2234:2: iv_ruleEscribir= ruleEscribir EOF
            {
             newCompositeNode(grammarAccess.getEscribirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_entryRuleEscribir4949);
            iv_ruleEscribir=ruleEscribir();

            state._fsp--;

             current =iv_ruleEscribir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEscribir4959); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2241:1: ruleEscribir returns [EObject current=null] : (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleEscribir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_operador_2_0 = null;

        EObject lv_operador_4_0 = null;

        EObject lv_operador_5_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2244:28: ( (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2245:1: (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2245:1: (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2245:3: otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleEscribir4996); 

                	newLeafNode(otherlv_0, grammarAccess.getEscribirAccess().getEscribirKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEscribir5008); 

                	newLeafNode(otherlv_1, grammarAccess.getEscribirAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2253:1: ( (lv_operador_2_0= rulePrimaria ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2254:1: (lv_operador_2_0= rulePrimaria )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2254:1: (lv_operador_2_0= rulePrimaria )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2255:3: lv_operador_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEscribir5029);
            lv_operador_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEscribirRule());
            	        }
                   		add(
                   			current, 
                   			"operador",
                    		lv_operador_2_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2271:2: ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==23) ) {
                    alt33=1;
                }
                else if ( ((LA33_0>=RULE_INT && LA33_0<=RULE_CAR)||(LA33_0>=28 && LA33_0<=36)||(LA33_0>=77 && LA33_0<=78)||LA33_0==91) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2271:3: (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2271:3: (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2271:5: otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEscribir5043); 

            	        	newLeafNode(otherlv_3, grammarAccess.getEscribirAccess().getCommaKeyword_3_0_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2275:1: ( (lv_operador_4_0= rulePrimaria ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2276:1: (lv_operador_4_0= rulePrimaria )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2276:1: (lv_operador_4_0= rulePrimaria )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2277:3: lv_operador_4_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorPrimariaParserRuleCall_3_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEscribir5064);
            	    lv_operador_4_0=rulePrimaria();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEscribirRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operador",
            	            		lv_operador_4_0, 
            	            		"Primaria");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2294:6: ( (lv_operador_5_0= ruleoperacion ) )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2294:6: ( (lv_operador_5_0= ruleoperacion ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2295:1: (lv_operador_5_0= ruleoperacion )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2295:1: (lv_operador_5_0= ruleoperacion )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2296:3: lv_operador_5_0= ruleoperacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorOperacionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleEscribir5092);
            	    lv_operador_5_0=ruleoperacion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEscribirRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operador",
            	            		lv_operador_5_0, 
            	            		"operacion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEscribir5106); 

                	newLeafNode(otherlv_6, grammarAccess.getEscribirAccess().getRightParenthesisKeyword_4());
                

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2324:1: entryRuleLeer returns [EObject current=null] : iv_ruleLeer= ruleLeer EOF ;
    public final EObject entryRuleLeer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeer = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2325:2: (iv_ruleLeer= ruleLeer EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2326:2: iv_ruleLeer= ruleLeer EOF
            {
             newCompositeNode(grammarAccess.getLeerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeer_in_entryRuleLeer5142);
            iv_ruleLeer=ruleLeer();

            state._fsp--;

             current =iv_ruleLeer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeer5152); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2333:1: ruleLeer returns [EObject current=null] : (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) ;
    public final EObject ruleLeer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2336:28: ( (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2337:1: (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2337:1: (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2337:3: otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleLeer5189); 

                	newLeafNode(otherlv_0, grammarAccess.getLeerAccess().getLeerKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLeer5201); 

                	newLeafNode(otherlv_1, grammarAccess.getLeerAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2345:1: ( (lv_variable_2_0= rulePrimaria ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2346:1: (lv_variable_2_0= rulePrimaria )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2346:1: (lv_variable_2_0= rulePrimaria )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2347:3: lv_variable_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getLeerAccess().getVariablePrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleLeer5222);
            lv_variable_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLeerRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleLeer5234); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2375:1: entryRuleSi returns [EObject current=null] : iv_ruleSi= ruleSi EOF ;
    public final EObject entryRuleSi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSi = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2376:2: (iv_ruleSi= ruleSi EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2377:2: iv_ruleSi= ruleSi EOF
            {
             newCompositeNode(grammarAccess.getSiRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSi_in_entryRuleSi5270);
            iv_ruleSi=ruleSi();

            state._fsp--;

             current =iv_ruleSi; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSi5280); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2384:1: ruleSi returns [EObject current=null] : (otherlv_0= 'si' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2387:28: ( (otherlv_0= 'si' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2388:1: (otherlv_0= 'si' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2388:1: (otherlv_0= 'si' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2388:3: otherlv_0= 'si' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si'
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleSi5317); 

                	newLeafNode(otherlv_0, grammarAccess.getSiAccess().getSiKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2392:1: ( (lv_valor_1_0= ruleoperacion ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2393:1: (lv_valor_1_0= ruleoperacion )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2393:1: (lv_valor_1_0= ruleoperacion )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2394:3: lv_valor_1_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getSiAccess().getValorOperacionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleSi5338);
            lv_valor_1_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSiRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_1_0, 
                    		"operacion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleSi5350); 

                	newLeafNode(otherlv_2, grammarAccess.getSiAccess().getEntoncesKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2414:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_INT && LA35_0<=RULE_CAR)||LA35_0==21||LA35_0==25||(LA35_0>=28 && LA35_0<=36)||(LA35_0>=54 && LA35_0<=56)||LA35_0==59||LA35_0==62||LA35_0==64||LA35_0==68||(LA35_0>=77 && LA35_0<=78)||LA35_0==91) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2414:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2414:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2415:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2415:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2416:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi5372);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2432:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( ((LA34_0>=RULE_INT && LA34_0<=RULE_CAR)||LA34_0==21||LA34_0==25||(LA34_0>=28 && LA34_0<=36)||(LA34_0>=54 && LA34_0<=56)||LA34_0==59||LA34_0==62||LA34_0==64||LA34_0==68||(LA34_0>=77 && LA34_0<=78)||LA34_0==91) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2433:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2433:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2434:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi5393);
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
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2450:5: ( (lv_devuelve_5_0= ruleDevolver ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==95) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2451:1: (lv_devuelve_5_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2451:1: (lv_devuelve_5_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2452:3: lv_devuelve_5_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getDevuelveDevolverParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSi5417);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2468:3: ( (lv_sino_6_0= ruleSino ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==94) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2469:1: (lv_sino_6_0= ruleSino )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2469:1: (lv_sino_6_0= ruleSino )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2470:3: lv_sino_6_0= ruleSino
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSinoSinoParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSino_in_ruleSi5439);
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

            otherlv_7=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleSi5452); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2498:1: entryRulemientras returns [EObject current=null] : iv_rulemientras= rulemientras EOF ;
    public final EObject entryRulemientras() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemientras = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2499:2: (iv_rulemientras= rulemientras EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2500:2: iv_rulemientras= rulemientras EOF
            {
             newCompositeNode(grammarAccess.getMientrasRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemientras_in_entryRulemientras5488);
            iv_rulemientras=rulemientras();

            state._fsp--;

             current =iv_rulemientras; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemientras5498); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2507:1: rulemientras returns [EObject current=null] : (otherlv_0= 'mientras' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2510:28: ( (otherlv_0= 'mientras' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2511:1: (otherlv_0= 'mientras' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2511:1: (otherlv_0= 'mientras' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2511:3: otherlv_0= 'mientras' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras'
            {
            otherlv_0=(Token)match(input,59,FollowSets000.FOLLOW_59_in_rulemientras5535); 

                	newLeafNode(otherlv_0, grammarAccess.getMientrasAccess().getMientrasKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2515:1: ( (lv_valor_1_0= ruleoperacion ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2516:1: (lv_valor_1_0= ruleoperacion )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2516:1: (lv_valor_1_0= ruleoperacion )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2517:3: lv_valor_1_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getMientrasAccess().getValorOperacionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulemientras5556);
            lv_valor_1_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMientrasRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_1_0, 
                    		"operacion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,60,FollowSets000.FOLLOW_60_in_rulemientras5568); 

                	newLeafNode(otherlv_2, grammarAccess.getMientrasAccess().getHacerKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2537:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_INT && LA39_0<=RULE_CAR)||LA39_0==21||LA39_0==25||(LA39_0>=28 && LA39_0<=36)||(LA39_0>=54 && LA39_0<=56)||LA39_0==59||LA39_0==62||LA39_0==64||LA39_0==68||(LA39_0>=77 && LA39_0<=78)||LA39_0==91) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2537:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2537:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2538:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2538:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2539:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras5590);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2555:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0>=RULE_INT && LA38_0<=RULE_CAR)||LA38_0==21||LA38_0==25||(LA38_0>=28 && LA38_0<=36)||(LA38_0>=54 && LA38_0<=56)||LA38_0==59||LA38_0==62||LA38_0==64||LA38_0==68||(LA38_0>=77 && LA38_0<=78)||LA38_0==91) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2556:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2556:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2557:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras5611);
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
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,61,FollowSets000.FOLLOW_61_in_rulemientras5626); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2585:1: entryRulerepetir returns [EObject current=null] : iv_rulerepetir= rulerepetir EOF ;
    public final EObject entryRulerepetir() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetir = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2586:2: (iv_rulerepetir= rulerepetir EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2587:2: iv_rulerepetir= rulerepetir EOF
            {
             newCompositeNode(grammarAccess.getRepetirRule()); 
            pushFollow(FollowSets000.FOLLOW_rulerepetir_in_entryRulerepetir5662);
            iv_rulerepetir=rulerepetir();

            state._fsp--;

             current =iv_rulerepetir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulerepetir5672); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2594:1: rulerepetir returns [EObject current=null] : (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= ruleoperacion ) ) ) ;
    public final EObject rulerepetir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_sentencias_1_0 = null;

        EObject lv_sentencias_2_0 = null;

        EObject lv_valor_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2597:28: ( (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= ruleoperacion ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2598:1: (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= ruleoperacion ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2598:1: (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= ruleoperacion ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2598:3: otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= ruleoperacion ) )
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_62_in_rulerepetir5709); 

                	newLeafNode(otherlv_0, grammarAccess.getRepetirAccess().getRepetirKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2602:1: ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_INT && LA41_0<=RULE_CAR)||LA41_0==21||LA41_0==25||(LA41_0>=28 && LA41_0<=36)||(LA41_0>=54 && LA41_0<=56)||LA41_0==59||LA41_0==62||LA41_0==64||LA41_0==68||(LA41_0>=77 && LA41_0<=78)||LA41_0==91) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2602:2: ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2602:2: ( (lv_sentencias_1_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2603:1: (lv_sentencias_1_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2603:1: (lv_sentencias_1_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2604:3: lv_sentencias_1_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir5731);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2620:2: ( (lv_sentencias_2_0= ruleSentencias ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( ((LA40_0>=RULE_INT && LA40_0<=RULE_CAR)||LA40_0==21||LA40_0==25||(LA40_0>=28 && LA40_0<=36)||(LA40_0>=54 && LA40_0<=56)||LA40_0==59||LA40_0==62||LA40_0==64||LA40_0==68||(LA40_0>=77 && LA40_0<=78)||LA40_0==91) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2621:1: (lv_sentencias_2_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2621:1: (lv_sentencias_2_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2622:3: lv_sentencias_2_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir5752);
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
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,63,FollowSets000.FOLLOW_63_in_rulerepetir5767); 

                	newLeafNode(otherlv_3, grammarAccess.getRepetirAccess().getHasta_queKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2642:1: ( (lv_valor_4_0= ruleoperacion ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2643:1: (lv_valor_4_0= ruleoperacion )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2643:1: (lv_valor_4_0= ruleoperacion )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2644:3: lv_valor_4_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getRepetirAccess().getValorOperacionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulerepetir5788);
            lv_valor_4_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRepetirRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_4_0, 
                    		"operacion");
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2668:1: entryRuledesde returns [EObject current=null] : iv_ruledesde= ruledesde EOF ;
    public final EObject entryRuledesde() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledesde = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2669:2: (iv_ruledesde= ruledesde EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2670:2: iv_ruledesde= ruledesde EOF
            {
             newCompositeNode(grammarAccess.getDesdeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruledesde_in_entryRuledesde5824);
            iv_ruledesde=ruledesde();

            state._fsp--;

             current =iv_ruledesde; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuledesde5834); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2677:1: ruledesde returns [EObject current=null] : (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacion ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2680:28: ( (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacion ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2681:1: (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacion ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2681:1: (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacion ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2681:3: otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacion ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde'
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruledesde5871); 

                	newLeafNode(otherlv_0, grammarAccess.getDesdeAccess().getDesdeKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2685:1: ( (lv_asignacion_1_0= ruleAsignacion ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2686:1: (lv_asignacion_1_0= ruleAsignacion )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2686:1: (lv_asignacion_1_0= ruleAsignacion )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2687:3: lv_asignacion_1_0= ruleAsignacion
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getAsignacionAsignacionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_ruledesde5892);
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

            otherlv_2=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruledesde5904); 

                	newLeafNode(otherlv_2, grammarAccess.getDesdeAccess().getHastaKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2707:1: ( (lv_valor_3_0= ruleoperacion ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2708:1: (lv_valor_3_0= ruleoperacion )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2708:1: (lv_valor_3_0= ruleoperacion )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2709:3: lv_valor_3_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getValorOperacionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruledesde5925);
            lv_valor_3_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDesdeRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"operacion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruledesde5937); 

                	newLeafNode(otherlv_4, grammarAccess.getDesdeAccess().getHacerKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2729:1: ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_INT && LA43_0<=RULE_CAR)||LA43_0==21||LA43_0==25||(LA43_0>=28 && LA43_0<=36)||(LA43_0>=54 && LA43_0<=56)||LA43_0==59||LA43_0==62||LA43_0==64||LA43_0==68||(LA43_0>=77 && LA43_0<=78)||LA43_0==91) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2729:2: ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2729:2: ( (lv_sentencias_5_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2730:1: (lv_sentencias_5_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2730:1: (lv_sentencias_5_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2731:3: lv_sentencias_5_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde5959);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2747:2: ( (lv_sentencias_6_0= ruleSentencias ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( ((LA42_0>=RULE_INT && LA42_0<=RULE_CAR)||LA42_0==21||LA42_0==25||(LA42_0>=28 && LA42_0<=36)||(LA42_0>=54 && LA42_0<=56)||LA42_0==59||LA42_0==62||LA42_0==64||LA42_0==68||(LA42_0>=77 && LA42_0<=78)||LA42_0==91) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2748:1: (lv_sentencias_6_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2748:1: (lv_sentencias_6_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2749:3: lv_sentencias_6_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde5980);
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
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruledesde5995); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2777:1: entryRuleCaso returns [EObject current=null] : iv_ruleCaso= ruleCaso EOF ;
    public final EObject entryRuleCaso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaso = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2778:2: (iv_ruleCaso= ruleCaso EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2779:2: iv_ruleCaso= ruleCaso EOF
            {
             newCompositeNode(grammarAccess.getCasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCaso_in_entryRuleCaso6031);
            iv_ruleCaso=ruleCaso();

            state._fsp--;

             current =iv_ruleCaso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCaso6041); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2786:1: ruleCaso returns [EObject current=null] : (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ) ;
    public final EObject ruleCaso() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_operador_1_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_sentencias_4_0 = null;

        EObject lv_devuelve_5_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2789:28: ( (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2790:1: (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2790:1: (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2790:3: otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )?
            {
            otherlv_0=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleCaso6078); 

                	newLeafNode(otherlv_0, grammarAccess.getCasoAccess().getCasoKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2794:1: ( (lv_operador_1_0= rulePrimaria ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2795:1: (lv_operador_1_0= rulePrimaria )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2795:1: (lv_operador_1_0= rulePrimaria )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2796:3: lv_operador_1_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getCasoAccess().getOperadorPrimariaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleCaso6099);
            lv_operador_1_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCasoRule());
            	        }
                   		set(
                   			current, 
                   			"operador",
                    		lv_operador_1_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleCaso6111); 

                	newLeafNode(otherlv_2, grammarAccess.getCasoAccess().getColonSpaceKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2816:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_INT && LA45_0<=RULE_CAR)||LA45_0==21||LA45_0==25||(LA45_0>=28 && LA45_0<=36)||(LA45_0>=54 && LA45_0<=56)||LA45_0==59||LA45_0==62||LA45_0==64||LA45_0==68||(LA45_0>=77 && LA45_0<=78)||LA45_0==91) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2816:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2816:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2817:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2817:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2818:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso6133);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2834:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( ((LA44_0>=RULE_INT && LA44_0<=RULE_CAR)||LA44_0==21||LA44_0==25||(LA44_0>=28 && LA44_0<=36)||(LA44_0>=54 && LA44_0<=56)||LA44_0==59||LA44_0==62||LA44_0==64||LA44_0==68||(LA44_0>=77 && LA44_0<=78)||LA44_0==91) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2835:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2835:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2836:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso6154);
                    	    lv_sentencias_4_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCasoRule());
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
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2852:5: ( (lv_devuelve_5_0= ruleDevolver ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==95) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2853:1: (lv_devuelve_5_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2853:1: (lv_devuelve_5_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2854:3: lv_devuelve_5_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getDevuelveDevolverParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleCaso6178);
                    lv_devuelve_5_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCasoRule());
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2878:1: entryRulesegun returns [EObject current=null] : iv_rulesegun= rulesegun EOF ;
    public final EObject entryRulesegun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesegun = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2879:2: (iv_rulesegun= rulesegun EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2880:2: iv_rulesegun= rulesegun EOF
            {
             newCompositeNode(grammarAccess.getSegunRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesegun_in_entryRulesegun6215);
            iv_rulesegun=rulesegun();

            state._fsp--;

             current =iv_rulesegun; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesegun6225); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2887:1: rulesegun returns [EObject current=null] : (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ') hacer' ( ( (lv_caso_4_0= ruleCaso ) ) ( (lv_caso_5_0= ruleCaso ) )* )? otherlv_6= 'en_otro_caso:' ( ( (lv_sentencias_7_0= ruleSentencias ) ) ( (lv_sentencias_8_0= ruleSentencias ) )* )? ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'fin_segun' ) ;
    public final EObject rulesegun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        EObject lv_valor_2_0 = null;

        EObject lv_caso_4_0 = null;

        EObject lv_caso_5_0 = null;

        EObject lv_sentencias_7_0 = null;

        EObject lv_sentencias_8_0 = null;

        EObject lv_devuelve_9_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2890:28: ( (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ') hacer' ( ( (lv_caso_4_0= ruleCaso ) ) ( (lv_caso_5_0= ruleCaso ) )* )? otherlv_6= 'en_otro_caso:' ( ( (lv_sentencias_7_0= ruleSentencias ) ) ( (lv_sentencias_8_0= ruleSentencias ) )* )? ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'fin_segun' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2891:1: (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ') hacer' ( ( (lv_caso_4_0= ruleCaso ) ) ( (lv_caso_5_0= ruleCaso ) )* )? otherlv_6= 'en_otro_caso:' ( ( (lv_sentencias_7_0= ruleSentencias ) ) ( (lv_sentencias_8_0= ruleSentencias ) )* )? ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'fin_segun' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2891:1: (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ') hacer' ( ( (lv_caso_4_0= ruleCaso ) ) ( (lv_caso_5_0= ruleCaso ) )* )? otherlv_6= 'en_otro_caso:' ( ( (lv_sentencias_7_0= ruleSentencias ) ) ( (lv_sentencias_8_0= ruleSentencias ) )* )? ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'fin_segun' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2891:3: otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ') hacer' ( ( (lv_caso_4_0= ruleCaso ) ) ( (lv_caso_5_0= ruleCaso ) )* )? otherlv_6= 'en_otro_caso:' ( ( (lv_sentencias_7_0= ruleSentencias ) ) ( (lv_sentencias_8_0= ruleSentencias ) )* )? ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'fin_segun'
            {
            otherlv_0=(Token)match(input,68,FollowSets000.FOLLOW_68_in_rulesegun6262); 

                	newLeafNode(otherlv_0, grammarAccess.getSegunAccess().getSegun_seaKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulesegun6274); 

                	newLeafNode(otherlv_1, grammarAccess.getSegunAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2899:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2900:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2900:1: (lv_valor_2_0= rulePrimaria )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2901:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getSegunAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_rulesegun6295);
            lv_valor_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSegunRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_2_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,69,FollowSets000.FOLLOW_69_in_rulesegun6307); 

                	newLeafNode(otherlv_3, grammarAccess.getSegunAccess().getHacerKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2921:1: ( ( (lv_caso_4_0= ruleCaso ) ) ( (lv_caso_5_0= ruleCaso ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==67) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2921:2: ( (lv_caso_4_0= ruleCaso ) ) ( (lv_caso_5_0= ruleCaso ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2921:2: ( (lv_caso_4_0= ruleCaso ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2922:1: (lv_caso_4_0= ruleCaso )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2922:1: (lv_caso_4_0= ruleCaso )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2923:3: lv_caso_4_0= ruleCaso
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun6329);
                    lv_caso_4_0=ruleCaso();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSegunRule());
                    	        }
                           		add(
                           			current, 
                           			"caso",
                            		lv_caso_4_0, 
                            		"Caso");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2939:2: ( (lv_caso_5_0= ruleCaso ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==67) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2940:1: (lv_caso_5_0= ruleCaso )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2940:1: (lv_caso_5_0= ruleCaso )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2941:3: lv_caso_5_0= ruleCaso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun6350);
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
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,70,FollowSets000.FOLLOW_70_in_rulesegun6365); 

                	newLeafNode(otherlv_6, grammarAccess.getSegunAccess().getEn_otro_casoKeyword_5());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2961:1: ( ( (lv_sentencias_7_0= ruleSentencias ) ) ( (lv_sentencias_8_0= ruleSentencias ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_INT && LA50_0<=RULE_CAR)||LA50_0==21||LA50_0==25||(LA50_0>=28 && LA50_0<=36)||(LA50_0>=54 && LA50_0<=56)||LA50_0==59||LA50_0==62||LA50_0==64||LA50_0==68||(LA50_0>=77 && LA50_0<=78)||LA50_0==91) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2961:2: ( (lv_sentencias_7_0= ruleSentencias ) ) ( (lv_sentencias_8_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2961:2: ( (lv_sentencias_7_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2962:1: (lv_sentencias_7_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2962:1: (lv_sentencias_7_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2963:3: lv_sentencias_7_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun6387);
                    lv_sentencias_7_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSegunRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_7_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2979:2: ( (lv_sentencias_8_0= ruleSentencias ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( ((LA49_0>=RULE_INT && LA49_0<=RULE_CAR)||LA49_0==21||LA49_0==25||(LA49_0>=28 && LA49_0<=36)||(LA49_0>=54 && LA49_0<=56)||LA49_0==59||LA49_0==62||LA49_0==64||LA49_0==68||(LA49_0>=77 && LA49_0<=78)||LA49_0==91) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2980:1: (lv_sentencias_8_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2980:1: (lv_sentencias_8_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2981:3: lv_sentencias_8_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun6408);
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
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2997:5: ( (lv_devuelve_9_0= ruleDevolver ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==95) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2998:1: (lv_devuelve_9_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2998:1: (lv_devuelve_9_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2999:3: lv_devuelve_9_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getDevuelveDevolverParserRuleCall_7_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_rulesegun6432);
                    lv_devuelve_9_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSegunRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_9_0, 
                            		"Devolver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,71,FollowSets000.FOLLOW_71_in_rulesegun6445); 

                	newLeafNode(otherlv_10, grammarAccess.getSegunAccess().getFin_segunKeyword_8());
                

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


    // $ANTLR start "entryRuleTipoVariable"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3027:1: entryRuleTipoVariable returns [String current=null] : iv_ruleTipoVariable= ruleTipoVariable EOF ;
    public final String entryRuleTipoVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoVariable = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3028:2: (iv_ruleTipoVariable= ruleTipoVariable EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3029:2: iv_ruleTipoVariable= ruleTipoVariable EOF
            {
             newCompositeNode(grammarAccess.getTipoVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable6482);
            iv_ruleTipoVariable=ruleTipoVariable();

            state._fsp--;

             current =iv_ruleTipoVariable.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoVariable6493); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3036:1: ruleTipoVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' ) ;
    public final AntlrDatatypeRuleToken ruleTipoVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3039:28: ( (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3040:1: (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3040:1: (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' )
            int alt52=5;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt52=1;
                }
                break;
            case 73:
                {
                alt52=2;
                }
                break;
            case 74:
                {
                alt52=3;
                }
                break;
            case 75:
                {
                alt52=4;
                }
                break;
            case 76:
                {
                alt52=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3041:2: kw= 'entero'
                    {
                    kw=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleTipoVariable6531); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getEnteroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3048:2: kw= 'caracter'
                    {
                    kw=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleTipoVariable6550); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getCaracterKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3055:2: kw= 'real'
                    {
                    kw=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleTipoVariable6569); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getRealKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3062:2: kw= 'logico'
                    {
                    kw=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleTipoVariable6588); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getLogicoKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3069:2: kw= 'cadena'
                    {
                    kw=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleTipoVariable6607); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3082:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3083:2: (iv_ruleVariable= ruleVariable EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3084:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable6647);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable6657); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3091:1: ruleVariable returns [EObject current=null] : ( () ( (lv_nombre_1_0= ruleEString ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_1_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3094:28: ( ( () ( (lv_nombre_1_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3095:1: ( () ( (lv_nombre_1_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3095:1: ( () ( (lv_nombre_1_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3095:2: () ( (lv_nombre_1_0= ruleEString ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3095:2: ()
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3096:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAccess().getVariableAction_0(),
                        current);
                

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3101:2: ( (lv_nombre_1_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3102:1: (lv_nombre_1_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3102:1: (lv_nombre_1_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3103:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable6712);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRulebooleano"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3127:1: entryRulebooleano returns [String current=null] : iv_rulebooleano= rulebooleano EOF ;
    public final String entryRulebooleano() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebooleano = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3128:2: (iv_rulebooleano= rulebooleano EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3129:2: iv_rulebooleano= rulebooleano EOF
            {
             newCompositeNode(grammarAccess.getBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleano_in_entryRulebooleano6749);
            iv_rulebooleano=rulebooleano();

            state._fsp--;

             current =iv_rulebooleano.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulebooleano6760); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3136:1: rulebooleano returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'verdadero' | kw= 'falso' ) ;
    public final AntlrDatatypeRuleToken rulebooleano() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3139:28: ( (kw= 'verdadero' | kw= 'falso' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3140:1: (kw= 'verdadero' | kw= 'falso' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3140:1: (kw= 'verdadero' | kw= 'falso' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==77) ) {
                alt53=1;
            }
            else if ( (LA53_0==78) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3141:2: kw= 'verdadero'
                    {
                    kw=(Token)match(input,77,FollowSets000.FOLLOW_77_in_rulebooleano6798); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanoAccess().getVerdaderoKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3148:2: kw= 'falso'
                    {
                    kw=(Token)match(input,78,FollowSets000.FOLLOW_78_in_rulebooleano6817); 

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


    // $ANTLR start "entryRulesignoOr"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3163:1: entryRulesignoOr returns [String current=null] : iv_rulesignoOr= rulesignoOr EOF ;
    public final String entryRulesignoOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoOr = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3164:2: (iv_rulesignoOr= rulesignoOr EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3165:2: iv_rulesignoOr= rulesignoOr EOF
            {
             newCompositeNode(grammarAccess.getSignoOrRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoOr_in_entryRulesignoOr6860);
            iv_rulesignoOr=rulesignoOr();

            state._fsp--;

             current =iv_rulesignoOr.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoOr6871); 

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
    // $ANTLR end "entryRulesignoOr"


    // $ANTLR start "rulesignoOr"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3172:1: rulesignoOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'o' ;
    public final AntlrDatatypeRuleToken rulesignoOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3175:28: (kw= 'o' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3177:2: kw= 'o'
            {
            kw=(Token)match(input,79,FollowSets000.FOLLOW_79_in_rulesignoOr6908); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignoOrAccess().getOKeyword()); 
                

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
    // $ANTLR end "rulesignoOr"


    // $ANTLR start "entryRulesignoAnd"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3190:1: entryRulesignoAnd returns [String current=null] : iv_rulesignoAnd= rulesignoAnd EOF ;
    public final String entryRulesignoAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoAnd = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3191:2: (iv_rulesignoAnd= rulesignoAnd EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3192:2: iv_rulesignoAnd= rulesignoAnd EOF
            {
             newCompositeNode(grammarAccess.getSignoAndRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoAnd_in_entryRulesignoAnd6948);
            iv_rulesignoAnd=rulesignoAnd();

            state._fsp--;

             current =iv_rulesignoAnd.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoAnd6959); 

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
    // $ANTLR end "entryRulesignoAnd"


    // $ANTLR start "rulesignoAnd"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3199:1: rulesignoAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'y' ;
    public final AntlrDatatypeRuleToken rulesignoAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3202:28: (kw= 'y' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3204:2: kw= 'y'
            {
            kw=(Token)match(input,80,FollowSets000.FOLLOW_80_in_rulesignoAnd6996); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignoAndAccess().getYKeyword()); 
                

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
    // $ANTLR end "rulesignoAnd"


    // $ANTLR start "entryRulesignoIgualdad"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3217:1: entryRulesignoIgualdad returns [String current=null] : iv_rulesignoIgualdad= rulesignoIgualdad EOF ;
    public final String entryRulesignoIgualdad() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoIgualdad = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3218:2: (iv_rulesignoIgualdad= rulesignoIgualdad EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3219:2: iv_rulesignoIgualdad= rulesignoIgualdad EOF
            {
             newCompositeNode(grammarAccess.getSignoIgualdadRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoIgualdad_in_entryRulesignoIgualdad7036);
            iv_rulesignoIgualdad=rulesignoIgualdad();

            state._fsp--;

             current =iv_rulesignoIgualdad.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoIgualdad7047); 

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
    // $ANTLR end "entryRulesignoIgualdad"


    // $ANTLR start "rulesignoIgualdad"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3226:1: rulesignoIgualdad returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken rulesignoIgualdad() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3229:28: ( (kw= '==' | kw= '!=' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3230:1: (kw= '==' | kw= '!=' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3230:1: (kw= '==' | kw= '!=' )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==81) ) {
                alt54=1;
            }
            else if ( (LA54_0==82) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3231:2: kw= '=='
                    {
                    kw=(Token)match(input,81,FollowSets000.FOLLOW_81_in_rulesignoIgualdad7085); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoIgualdadAccess().getEqualsSignEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3238:2: kw= '!='
                    {
                    kw=(Token)match(input,82,FollowSets000.FOLLOW_82_in_rulesignoIgualdad7104); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoIgualdadAccess().getExclamationMarkEqualsSignKeyword_1()); 
                        

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
    // $ANTLR end "rulesignoIgualdad"


    // $ANTLR start "entryRulesignoComparacion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3251:1: entryRulesignoComparacion returns [String current=null] : iv_rulesignoComparacion= rulesignoComparacion EOF ;
    public final String entryRulesignoComparacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoComparacion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3252:2: (iv_rulesignoComparacion= rulesignoComparacion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3253:2: iv_rulesignoComparacion= rulesignoComparacion EOF
            {
             newCompositeNode(grammarAccess.getSignoComparacionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoComparacion_in_entryRulesignoComparacion7145);
            iv_rulesignoComparacion=rulesignoComparacion();

            state._fsp--;

             current =iv_rulesignoComparacion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoComparacion7156); 

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
    // $ANTLR end "entryRulesignoComparacion"


    // $ANTLR start "rulesignoComparacion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3260:1: rulesignoComparacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken rulesignoComparacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3263:28: ( (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3264:1: (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3264:1: (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt55=1;
                }
                break;
            case 84:
                {
                alt55=2;
                }
                break;
            case 85:
                {
                alt55=3;
                }
                break;
            case 86:
                {
                alt55=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3265:2: kw= '<'
                    {
                    kw=(Token)match(input,83,FollowSets000.FOLLOW_83_in_rulesignoComparacion7194); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3272:2: kw= '>'
                    {
                    kw=(Token)match(input,84,FollowSets000.FOLLOW_84_in_rulesignoComparacion7213); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getGreaterThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3279:2: kw= '>='
                    {
                    kw=(Token)match(input,85,FollowSets000.FOLLOW_85_in_rulesignoComparacion7232); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3286:2: kw= '<='
                    {
                    kw=(Token)match(input,86,FollowSets000.FOLLOW_86_in_rulesignoComparacion7251); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getLessThanSignEqualsSignKeyword_3()); 
                        

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
    // $ANTLR end "rulesignoComparacion"


    // $ANTLR start "entryRulesignoSuma"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3299:1: entryRulesignoSuma returns [String current=null] : iv_rulesignoSuma= rulesignoSuma EOF ;
    public final String entryRulesignoSuma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoSuma = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3300:2: (iv_rulesignoSuma= rulesignoSuma EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3301:2: iv_rulesignoSuma= rulesignoSuma EOF
            {
             newCompositeNode(grammarAccess.getSignoSumaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoSuma_in_entryRulesignoSuma7292);
            iv_rulesignoSuma=rulesignoSuma();

            state._fsp--;

             current =iv_rulesignoSuma.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoSuma7303); 

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
    // $ANTLR end "entryRulesignoSuma"


    // $ANTLR start "rulesignoSuma"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3308:1: rulesignoSuma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+' ;
    public final AntlrDatatypeRuleToken rulesignoSuma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3311:28: (kw= '+' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3313:2: kw= '+'
            {
            kw=(Token)match(input,87,FollowSets000.FOLLOW_87_in_rulesignoSuma7340); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignoSumaAccess().getPlusSignKeyword()); 
                

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
    // $ANTLR end "rulesignoSuma"


    // $ANTLR start "entryRulesignoResta"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3326:1: entryRulesignoResta returns [String current=null] : iv_rulesignoResta= rulesignoResta EOF ;
    public final String entryRulesignoResta() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoResta = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3327:2: (iv_rulesignoResta= rulesignoResta EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3328:2: iv_rulesignoResta= rulesignoResta EOF
            {
             newCompositeNode(grammarAccess.getSignoRestaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoResta_in_entryRulesignoResta7380);
            iv_rulesignoResta=rulesignoResta();

            state._fsp--;

             current =iv_rulesignoResta.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoResta7391); 

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
    // $ANTLR end "entryRulesignoResta"


    // $ANTLR start "rulesignoResta"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3335:1: rulesignoResta returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken rulesignoResta() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3338:28: (kw= '-' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3340:2: kw= '-'
            {
            kw=(Token)match(input,88,FollowSets000.FOLLOW_88_in_rulesignoResta7428); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignoRestaAccess().getHyphenMinusKeyword()); 
                

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
    // $ANTLR end "rulesignoResta"


    // $ANTLR start "entryRulesignoMultiplicacion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3353:1: entryRulesignoMultiplicacion returns [String current=null] : iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF ;
    public final String entryRulesignoMultiplicacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoMultiplicacion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3354:2: (iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3355:2: iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF
            {
             newCompositeNode(grammarAccess.getSignoMultiplicacionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoMultiplicacion_in_entryRulesignoMultiplicacion7468);
            iv_rulesignoMultiplicacion=rulesignoMultiplicacion();

            state._fsp--;

             current =iv_rulesignoMultiplicacion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoMultiplicacion7479); 

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
    // $ANTLR end "entryRulesignoMultiplicacion"


    // $ANTLR start "rulesignoMultiplicacion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3362:1: rulesignoMultiplicacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken rulesignoMultiplicacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3365:28: (kw= '*' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3367:2: kw= '*'
            {
            kw=(Token)match(input,89,FollowSets000.FOLLOW_89_in_rulesignoMultiplicacion7516); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignoMultiplicacionAccess().getAsteriskKeyword()); 
                

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
    // $ANTLR end "rulesignoMultiplicacion"


    // $ANTLR start "entryRulesignoDivision"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3380:1: entryRulesignoDivision returns [String current=null] : iv_rulesignoDivision= rulesignoDivision EOF ;
    public final String entryRulesignoDivision() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoDivision = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3381:2: (iv_rulesignoDivision= rulesignoDivision EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3382:2: iv_rulesignoDivision= rulesignoDivision EOF
            {
             newCompositeNode(grammarAccess.getSignoDivisionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoDivision_in_entryRulesignoDivision7556);
            iv_rulesignoDivision=rulesignoDivision();

            state._fsp--;

             current =iv_rulesignoDivision.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoDivision7567); 

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
    // $ANTLR end "entryRulesignoDivision"


    // $ANTLR start "rulesignoDivision"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3389:1: rulesignoDivision returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '/' ;
    public final AntlrDatatypeRuleToken rulesignoDivision() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3392:28: (kw= '/' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3394:2: kw= '/'
            {
            kw=(Token)match(input,90,FollowSets000.FOLLOW_90_in_rulesignoDivision7604); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignoDivisionAccess().getSolidusKeyword()); 
                

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
    // $ANTLR end "rulesignoDivision"


    // $ANTLR start "entryRuleoperacion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3407:1: entryRuleoperacion returns [EObject current=null] : iv_ruleoperacion= ruleoperacion EOF ;
    public final EObject entryRuleoperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperacion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3408:2: (iv_ruleoperacion= ruleoperacion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3409:2: iv_ruleoperacion= ruleoperacion EOF
            {
             newCompositeNode(grammarAccess.getOperacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_entryRuleoperacion7643);
            iv_ruleoperacion=ruleoperacion();

            state._fsp--;

             current =iv_ruleoperacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperacion7653); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3416:1: ruleoperacion returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleoperacion() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3419:28: (this_Or_0= ruleOr )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3421:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getOperacionAccess().getOrParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOr_in_ruleoperacion7699);
            this_Or_0=ruleOr();

            state._fsp--;

             
                    current = this_Or_0; 
                    afterParserOrEnumRuleCall();
                

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


    // $ANTLR start "entryRuleOr"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3437:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3438:2: (iv_ruleOr= ruleOr EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3439:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOr_in_entryRuleOr7733);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOr7743); 

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3446:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3449:28: ( (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3450:1: (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3450:1: (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3451:5: this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAnd_in_ruleOr7790);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3459:1: ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==79) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3459:2: () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3459:2: ()
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3460:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3465:2: ( (lv_signo_op_2_0= rulesignoOr ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3466:1: (lv_signo_op_2_0= rulesignoOr )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3466:1: (lv_signo_op_2_0= rulesignoOr )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3467:3: lv_signo_op_2_0= rulesignoOr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getSigno_opSignoOrParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoOr_in_ruleOr7820);
            	    lv_signo_op_2_0=rulesignoOr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"signoOr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3483:2: ( (lv_right_3_0= ruleAnd ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3484:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3484:1: (lv_right_3_0= ruleAnd )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3485:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnd_in_ruleOr7841);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"And");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3509:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3510:2: (iv_ruleAnd= ruleAnd EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3511:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnd_in_entryRuleAnd7879);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnd7889); 

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3518:1: ruleAnd returns [EObject current=null] : (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        EObject this_Igualdad_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3521:28: ( (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3522:1: (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3522:1: (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3523:5: this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getIgualdadParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleIgualdad_in_ruleAnd7936);
            this_Igualdad_0=ruleIgualdad();

            state._fsp--;

             
                    current = this_Igualdad_0; 
                    afterParserOrEnumRuleCall();
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3531:1: ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==80) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3531:2: () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3531:2: ()
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3532:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3537:2: ( (lv_signo_op_2_0= rulesignoAnd ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3538:1: (lv_signo_op_2_0= rulesignoAnd )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3538:1: (lv_signo_op_2_0= rulesignoAnd )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3539:3: lv_signo_op_2_0= rulesignoAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getSigno_opSignoAndParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoAnd_in_ruleAnd7966);
            	    lv_signo_op_2_0=rulesignoAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"signoAnd");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3555:2: ( (lv_right_3_0= ruleIgualdad ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3556:1: (lv_right_3_0= ruleIgualdad )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3556:1: (lv_right_3_0= ruleIgualdad )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3557:3: lv_right_3_0= ruleIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightIgualdadParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleIgualdad_in_ruleAnd7987);
            	    lv_right_3_0=ruleIgualdad();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Igualdad");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleIgualdad"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3581:1: entryRuleIgualdad returns [EObject current=null] : iv_ruleIgualdad= ruleIgualdad EOF ;
    public final EObject entryRuleIgualdad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgualdad = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3582:2: (iv_ruleIgualdad= ruleIgualdad EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3583:2: iv_ruleIgualdad= ruleIgualdad EOF
            {
             newCompositeNode(grammarAccess.getIgualdadRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIgualdad_in_entryRuleIgualdad8025);
            iv_ruleIgualdad=ruleIgualdad();

            state._fsp--;

             current =iv_ruleIgualdad; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIgualdad8035); 

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
    // $ANTLR end "entryRuleIgualdad"


    // $ANTLR start "ruleIgualdad"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3590:1: ruleIgualdad returns [EObject current=null] : (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* ) ;
    public final EObject ruleIgualdad() throws RecognitionException {
        EObject current = null;

        EObject this_Comparacion_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3593:28: ( (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3594:1: (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3594:1: (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3595:5: this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getIgualdadAccess().getComparacionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparacion_in_ruleIgualdad8082);
            this_Comparacion_0=ruleComparacion();

            state._fsp--;

             
                    current = this_Comparacion_0; 
                    afterParserOrEnumRuleCall();
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3603:1: ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=81 && LA58_0<=82)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3603:2: () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3603:2: ()
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3604:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3609:2: ( (lv_signo_op_2_0= rulesignoIgualdad ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3610:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3610:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3611:3: lv_signo_op_2_0= rulesignoIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadAccess().getSigno_opSignoIgualdadParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoIgualdad_in_ruleIgualdad8112);
            	    lv_signo_op_2_0=rulesignoIgualdad();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIgualdadRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"signoIgualdad");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3627:2: ( (lv_right_3_0= ruleComparacion ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3628:1: (lv_right_3_0= ruleComparacion )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3628:1: (lv_right_3_0= ruleComparacion )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3629:3: lv_right_3_0= ruleComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadAccess().getRightComparacionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparacion_in_ruleIgualdad8133);
            	    lv_right_3_0=ruleComparacion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIgualdadRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Comparacion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // $ANTLR end "ruleIgualdad"


    // $ANTLR start "entryRuleComparacion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3653:1: entryRuleComparacion returns [EObject current=null] : iv_ruleComparacion= ruleComparacion EOF ;
    public final EObject entryRuleComparacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparacion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3654:2: (iv_ruleComparacion= ruleComparacion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3655:2: iv_ruleComparacion= ruleComparacion EOF
            {
             newCompositeNode(grammarAccess.getComparacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparacion_in_entryRuleComparacion8171);
            iv_ruleComparacion=ruleComparacion();

            state._fsp--;

             current =iv_ruleComparacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparacion8181); 

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
    // $ANTLR end "entryRuleComparacion"


    // $ANTLR start "ruleComparacion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3662:1: ruleComparacion returns [EObject current=null] : (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* ) ;
    public final EObject ruleComparacion() throws RecognitionException {
        EObject current = null;

        EObject this_SumaResta_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3665:28: ( (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3666:1: (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3666:1: (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3667:5: this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparacionAccess().getSumaRestaParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSumaResta_in_ruleComparacion8228);
            this_SumaResta_0=ruleSumaResta();

            state._fsp--;

             
                    current = this_SumaResta_0; 
                    afterParserOrEnumRuleCall();
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3675:1: ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=83 && LA59_0<=86)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3675:2: () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3675:2: ()
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3676:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3681:2: ( (lv_signo_op_2_0= rulesignoComparacion ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3682:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3682:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3683:3: lv_signo_op_2_0= rulesignoComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionAccess().getSigno_opSignoComparacionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoComparacion_in_ruleComparacion8258);
            	    lv_signo_op_2_0=rulesignoComparacion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparacionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"signoComparacion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3699:2: ( (lv_right_3_0= ruleSumaResta ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3700:1: (lv_right_3_0= ruleSumaResta )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3700:1: (lv_right_3_0= ruleSumaResta )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3701:3: lv_right_3_0= ruleSumaResta
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionAccess().getRightSumaRestaParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSumaResta_in_ruleComparacion8279);
            	    lv_right_3_0=ruleSumaResta();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparacionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"SumaResta");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
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
    // $ANTLR end "ruleComparacion"


    // $ANTLR start "entryRuleSumaResta"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3725:1: entryRuleSumaResta returns [EObject current=null] : iv_ruleSumaResta= ruleSumaResta EOF ;
    public final EObject entryRuleSumaResta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumaResta = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3726:2: (iv_ruleSumaResta= ruleSumaResta EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3727:2: iv_ruleSumaResta= ruleSumaResta EOF
            {
             newCompositeNode(grammarAccess.getSumaRestaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSumaResta_in_entryRuleSumaResta8317);
            iv_ruleSumaResta=ruleSumaResta();

            state._fsp--;

             current =iv_ruleSumaResta; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSumaResta8327); 

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
    // $ANTLR end "entryRuleSumaResta"


    // $ANTLR start "ruleSumaResta"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3734:1: ruleSumaResta returns [EObject current=null] : (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* ) ;
    public final EObject ruleSumaResta() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicacionDivision_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3737:28: ( (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3738:1: (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3738:1: (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3739:5: this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSumaRestaAccess().getMultiplicacionDivisionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta8374);
            this_MultiplicacionDivision_0=ruleMultiplicacionDivision();

            state._fsp--;

             
                    current = this_MultiplicacionDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3747:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=87 && LA61_0<=88)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3747:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3747:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) )
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==87) ) {
            	        alt60=1;
            	    }
            	    else if ( (LA60_0==88) ) {
            	        alt60=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 60, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3747:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            {
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3747:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3747:4: () ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            {
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3747:4: ()
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3748:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3753:2: ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3754:1: (lv_signo_op_2_0= rulesignoSuma )
            	            {
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3754:1: (lv_signo_op_2_0= rulesignoSuma )
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3755:3: lv_signo_op_2_0= rulesignoSuma
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaAccess().getSigno_opSignoSumaParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoSuma_in_ruleSumaResta8406);
            	            lv_signo_op_2_0=rulesignoSuma();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSumaRestaRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_2_0, 
            	                    		"signoSuma");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3772:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            {
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3772:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3772:7: () ( (lv_signo_op_4_0= rulesignoResta ) )
            	            {
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3772:7: ()
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3773:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3778:2: ( (lv_signo_op_4_0= rulesignoResta ) )
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3779:1: (lv_signo_op_4_0= rulesignoResta )
            	            {
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3779:1: (lv_signo_op_4_0= rulesignoResta )
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3780:3: lv_signo_op_4_0= rulesignoResta
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaAccess().getSigno_opSignoRestaParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoResta_in_ruleSumaResta8444);
            	            lv_signo_op_4_0=rulesignoResta();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSumaRestaRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_4_0, 
            	                    		"signoResta");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3796:4: ( (lv_right_5_0= ruleMultiplicacionDivision ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3797:1: (lv_right_5_0= ruleMultiplicacionDivision )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3797:1: (lv_right_5_0= ruleMultiplicacionDivision )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3798:3: lv_right_5_0= ruleMultiplicacionDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSumaRestaAccess().getRightMultiplicacionDivisionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta8467);
            	    lv_right_5_0=ruleMultiplicacionDivision();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSumaRestaRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"MultiplicacionDivision");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
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
    // $ANTLR end "ruleSumaResta"


    // $ANTLR start "entryRuleMultiplicacionDivision"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3822:1: entryRuleMultiplicacionDivision returns [EObject current=null] : iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF ;
    public final EObject entryRuleMultiplicacionDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicacionDivision = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3823:2: (iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3824:2: iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF
            {
             newCompositeNode(grammarAccess.getMultiplicacionDivisionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivision_in_entryRuleMultiplicacionDivision8505);
            iv_ruleMultiplicacionDivision=ruleMultiplicacionDivision();

            state._fsp--;

             current =iv_ruleMultiplicacionDivision; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicacionDivision8515); 

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
    // $ANTLR end "entryRuleMultiplicacionDivision"


    // $ANTLR start "ruleMultiplicacionDivision"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3831:1: ruleMultiplicacionDivision returns [EObject current=null] : (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )* ) ;
    public final EObject ruleMultiplicacionDivision() throws RecognitionException {
        EObject current = null;

        EObject this_Primaria_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3834:28: ( (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3835:1: (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3835:1: (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3836:5: this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getPrimariaParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision8562);
            this_Primaria_0=rulePrimaria();

            state._fsp--;

             
                    current = this_Primaria_0; 
                    afterParserOrEnumRuleCall();
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3844:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=89 && LA63_0<=90)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3844:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3844:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) )
            	    int alt62=2;
            	    int LA62_0 = input.LA(1);

            	    if ( (LA62_0==89) ) {
            	        alt62=1;
            	    }
            	    else if ( (LA62_0==90) ) {
            	        alt62=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 62, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt62) {
            	        case 1 :
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3844:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            {
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3844:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3844:4: () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            {
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3844:4: ()
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3845:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3850:2: ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3851:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            {
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3851:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3852:3: lv_signo_op_2_0= rulesignoMultiplicacion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoMultiplicacionParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoMultiplicacion_in_ruleMultiplicacionDivision8594);
            	            lv_signo_op_2_0=rulesignoMultiplicacion();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_2_0, 
            	                    		"signoMultiplicacion");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3869:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            {
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3869:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3869:7: () ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            {
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3869:7: ()
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3870:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3875:2: ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3876:1: (lv_signo_op_4_0= rulesignoDivision )
            	            {
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3876:1: (lv_signo_op_4_0= rulesignoDivision )
            	            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3877:3: lv_signo_op_4_0= rulesignoDivision
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoDivisionParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoDivision_in_ruleMultiplicacionDivision8632);
            	            lv_signo_op_4_0=rulesignoDivision();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_4_0, 
            	                    		"signoDivision");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3893:4: ( (lv_right_5_0= rulePrimaria ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3894:1: (lv_right_5_0= rulePrimaria )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3894:1: (lv_right_5_0= rulePrimaria )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3895:3: lv_right_5_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getRightPrimariaParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision8655);
            	    lv_right_5_0=rulePrimaria();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"Primaria");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
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
    // $ANTLR end "ruleMultiplicacionDivision"


    // $ANTLR start "entryRulePrimaria"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3919:1: entryRulePrimaria returns [EObject current=null] : iv_rulePrimaria= rulePrimaria EOF ;
    public final EObject entryRulePrimaria() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaria = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3920:2: (iv_rulePrimaria= rulePrimaria EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3921:2: iv_rulePrimaria= rulePrimaria EOF
            {
             newCompositeNode(grammarAccess.getPrimariaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_entryRulePrimaria8693);
            iv_rulePrimaria=rulePrimaria();

            state._fsp--;

             current =iv_rulePrimaria; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaria8703); 

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
    // $ANTLR end "entryRulePrimaria"


    // $ANTLR start "rulePrimaria"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3928:1: rulePrimaria returns [EObject current=null] : ( (otherlv_0= ' (' this_operacion_1= ruleoperacion otherlv_2= ') ' ) | ( () ( (lv_valor_4_0= ruleINTEGER ) ) ) | ( () ( (lv_valor_6_0= RULE_FLOAT ) ) ) | ( () ( (lv_contenido_8_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_10_0= RULE_CAR ) ) ) | ( () ( (lv_valor_12_0= rulebooleano ) ) ) | ( () ( (lv_nombre_14_0= ruleEString ) ) ) | ( () ( ( (lv_nombre_matriz_16_0= ruleEString ) ) otherlv_17= '[' ( ( (lv_indicesCadena_18_0= ruleEString ) ) | ( (lv_indicesNumericos_19_0= ruleINTEGER ) ) ) otherlv_20= '][' ( ( (lv_indicesCadena_21_0= ruleEString ) ) | ( (lv_indicesNumericos_22_0= ruleINTEGER ) ) ) otherlv_23= ']' ) (otherlv_24= '.' ( (lv_campo_25_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_vector_27_0= ruleEString ) ) otherlv_28= '[' ( ( (lv_indiceCadena_29_0= ruleEString ) ) | ( (lv_indiceNumerico_30_0= ruleINTEGER ) ) ) otherlv_31= ']' ) (otherlv_32= '.' ( (lv_campo_33_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_35_0= ruleEString ) ) otherlv_36= '.' ( ( (lv_campo_37_0= ruleCampoRegistro ) ) (otherlv_38= '.' ( (lv_campo_39_0= ruleCampoRegistro ) ) )* ) ) | ( () ( (lv_nombre_41_0= ruleEString ) ) otherlv_42= '(' ( ( (lv_operadores_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_operadores_45_0= ruleEString ) ) )* )? otherlv_46= ')' ) | ( () ( (lv_nombre_48_0= ruleNombreInterna ) ) otherlv_49= '(' ( ( (lv_operadores_50_0= ruleEString ) ) (otherlv_51= ',' ( (lv_operadores_52_0= ruleEString ) ) )* ) otherlv_53= ')' ) ) ;
    public final EObject rulePrimaria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_valor_6_0=null;
        Token lv_contenido_8_0=null;
        Token lv_contenido_10_0=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_28=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        EObject this_operacion_1 = null;

        AntlrDatatypeRuleToken lv_valor_4_0 = null;

        AntlrDatatypeRuleToken lv_valor_12_0 = null;

        AntlrDatatypeRuleToken lv_nombre_14_0 = null;

        AntlrDatatypeRuleToken lv_nombre_matriz_16_0 = null;

        AntlrDatatypeRuleToken lv_indicesCadena_18_0 = null;

        AntlrDatatypeRuleToken lv_indicesNumericos_19_0 = null;

        AntlrDatatypeRuleToken lv_indicesCadena_21_0 = null;

        AntlrDatatypeRuleToken lv_indicesNumericos_22_0 = null;

        EObject lv_campo_25_0 = null;

        AntlrDatatypeRuleToken lv_nombre_vector_27_0 = null;

        AntlrDatatypeRuleToken lv_indiceCadena_29_0 = null;

        AntlrDatatypeRuleToken lv_indiceNumerico_30_0 = null;

        EObject lv_campo_33_0 = null;

        AntlrDatatypeRuleToken lv_nombre_registro_35_0 = null;

        EObject lv_campo_37_0 = null;

        EObject lv_campo_39_0 = null;

        AntlrDatatypeRuleToken lv_nombre_41_0 = null;

        AntlrDatatypeRuleToken lv_operadores_43_0 = null;

        AntlrDatatypeRuleToken lv_operadores_45_0 = null;

        AntlrDatatypeRuleToken lv_nombre_48_0 = null;

        AntlrDatatypeRuleToken lv_operadores_50_0 = null;

        AntlrDatatypeRuleToken lv_operadores_52_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3931:28: ( ( (otherlv_0= ' (' this_operacion_1= ruleoperacion otherlv_2= ') ' ) | ( () ( (lv_valor_4_0= ruleINTEGER ) ) ) | ( () ( (lv_valor_6_0= RULE_FLOAT ) ) ) | ( () ( (lv_contenido_8_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_10_0= RULE_CAR ) ) ) | ( () ( (lv_valor_12_0= rulebooleano ) ) ) | ( () ( (lv_nombre_14_0= ruleEString ) ) ) | ( () ( ( (lv_nombre_matriz_16_0= ruleEString ) ) otherlv_17= '[' ( ( (lv_indicesCadena_18_0= ruleEString ) ) | ( (lv_indicesNumericos_19_0= ruleINTEGER ) ) ) otherlv_20= '][' ( ( (lv_indicesCadena_21_0= ruleEString ) ) | ( (lv_indicesNumericos_22_0= ruleINTEGER ) ) ) otherlv_23= ']' ) (otherlv_24= '.' ( (lv_campo_25_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_vector_27_0= ruleEString ) ) otherlv_28= '[' ( ( (lv_indiceCadena_29_0= ruleEString ) ) | ( (lv_indiceNumerico_30_0= ruleINTEGER ) ) ) otherlv_31= ']' ) (otherlv_32= '.' ( (lv_campo_33_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_35_0= ruleEString ) ) otherlv_36= '.' ( ( (lv_campo_37_0= ruleCampoRegistro ) ) (otherlv_38= '.' ( (lv_campo_39_0= ruleCampoRegistro ) ) )* ) ) | ( () ( (lv_nombre_41_0= ruleEString ) ) otherlv_42= '(' ( ( (lv_operadores_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_operadores_45_0= ruleEString ) ) )* )? otherlv_46= ')' ) | ( () ( (lv_nombre_48_0= ruleNombreInterna ) ) otherlv_49= '(' ( ( (lv_operadores_50_0= ruleEString ) ) (otherlv_51= ',' ( (lv_operadores_52_0= ruleEString ) ) )* ) otherlv_53= ')' ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3932:1: ( (otherlv_0= ' (' this_operacion_1= ruleoperacion otherlv_2= ') ' ) | ( () ( (lv_valor_4_0= ruleINTEGER ) ) ) | ( () ( (lv_valor_6_0= RULE_FLOAT ) ) ) | ( () ( (lv_contenido_8_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_10_0= RULE_CAR ) ) ) | ( () ( (lv_valor_12_0= rulebooleano ) ) ) | ( () ( (lv_nombre_14_0= ruleEString ) ) ) | ( () ( ( (lv_nombre_matriz_16_0= ruleEString ) ) otherlv_17= '[' ( ( (lv_indicesCadena_18_0= ruleEString ) ) | ( (lv_indicesNumericos_19_0= ruleINTEGER ) ) ) otherlv_20= '][' ( ( (lv_indicesCadena_21_0= ruleEString ) ) | ( (lv_indicesNumericos_22_0= ruleINTEGER ) ) ) otherlv_23= ']' ) (otherlv_24= '.' ( (lv_campo_25_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_vector_27_0= ruleEString ) ) otherlv_28= '[' ( ( (lv_indiceCadena_29_0= ruleEString ) ) | ( (lv_indiceNumerico_30_0= ruleINTEGER ) ) ) otherlv_31= ']' ) (otherlv_32= '.' ( (lv_campo_33_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_35_0= ruleEString ) ) otherlv_36= '.' ( ( (lv_campo_37_0= ruleCampoRegistro ) ) (otherlv_38= '.' ( (lv_campo_39_0= ruleCampoRegistro ) ) )* ) ) | ( () ( (lv_nombre_41_0= ruleEString ) ) otherlv_42= '(' ( ( (lv_operadores_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_operadores_45_0= ruleEString ) ) )* )? otherlv_46= ')' ) | ( () ( (lv_nombre_48_0= ruleNombreInterna ) ) otherlv_49= '(' ( ( (lv_operadores_50_0= ruleEString ) ) (otherlv_51= ',' ( (lv_operadores_52_0= ruleEString ) ) )* ) otherlv_53= ')' ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3932:1: ( (otherlv_0= ' (' this_operacion_1= ruleoperacion otherlv_2= ') ' ) | ( () ( (lv_valor_4_0= ruleINTEGER ) ) ) | ( () ( (lv_valor_6_0= RULE_FLOAT ) ) ) | ( () ( (lv_contenido_8_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_10_0= RULE_CAR ) ) ) | ( () ( (lv_valor_12_0= rulebooleano ) ) ) | ( () ( (lv_nombre_14_0= ruleEString ) ) ) | ( () ( ( (lv_nombre_matriz_16_0= ruleEString ) ) otherlv_17= '[' ( ( (lv_indicesCadena_18_0= ruleEString ) ) | ( (lv_indicesNumericos_19_0= ruleINTEGER ) ) ) otherlv_20= '][' ( ( (lv_indicesCadena_21_0= ruleEString ) ) | ( (lv_indicesNumericos_22_0= ruleINTEGER ) ) ) otherlv_23= ']' ) (otherlv_24= '.' ( (lv_campo_25_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_vector_27_0= ruleEString ) ) otherlv_28= '[' ( ( (lv_indiceCadena_29_0= ruleEString ) ) | ( (lv_indiceNumerico_30_0= ruleINTEGER ) ) ) otherlv_31= ']' ) (otherlv_32= '.' ( (lv_campo_33_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_35_0= ruleEString ) ) otherlv_36= '.' ( ( (lv_campo_37_0= ruleCampoRegistro ) ) (otherlv_38= '.' ( (lv_campo_39_0= ruleCampoRegistro ) ) )* ) ) | ( () ( (lv_nombre_41_0= ruleEString ) ) otherlv_42= '(' ( ( (lv_operadores_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_operadores_45_0= ruleEString ) ) )* )? otherlv_46= ')' ) | ( () ( (lv_nombre_48_0= ruleNombreInterna ) ) otherlv_49= '(' ( ( (lv_operadores_50_0= ruleEString ) ) (otherlv_51= ',' ( (lv_operadores_52_0= ruleEString ) ) )* ) otherlv_53= ')' ) )
            int alt73=12;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3932:2: (otherlv_0= ' (' this_operacion_1= ruleoperacion otherlv_2= ') ' )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3932:2: (otherlv_0= ' (' this_operacion_1= ruleoperacion otherlv_2= ') ' )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3932:4: otherlv_0= ' (' this_operacion_1= ruleoperacion otherlv_2= ') '
                    {
                    otherlv_0=(Token)match(input,91,FollowSets000.FOLLOW_91_in_rulePrimaria8741); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimariaAccess().getSpaceLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getOperacionParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulePrimaria8763);
                    this_operacion_1=ruleoperacion();

                    state._fsp--;

                     
                            current = this_operacion_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,92,FollowSets000.FOLLOW_92_in_rulePrimaria8774); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimariaAccess().getRightParenthesisSpaceKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3950:6: ( () ( (lv_valor_4_0= ruleINTEGER ) ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3950:6: ( () ( (lv_valor_4_0= ruleINTEGER ) ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3950:7: () ( (lv_valor_4_0= ruleINTEGER ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3950:7: ()
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3951:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getNumeroEnteroAction_1_0(),
                                current);
                        

                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3956:2: ( (lv_valor_4_0= ruleINTEGER ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3957:1: (lv_valor_4_0= ruleINTEGER )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3957:1: (lv_valor_4_0= ruleINTEGER )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3958:3: lv_valor_4_0= ruleINTEGER
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getValorINTEGERParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleINTEGER_in_rulePrimaria8812);
                    lv_valor_4_0=ruleINTEGER();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_4_0, 
                            		"INTEGER");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3975:6: ( () ( (lv_valor_6_0= RULE_FLOAT ) ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3975:6: ( () ( (lv_valor_6_0= RULE_FLOAT ) ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3975:7: () ( (lv_valor_6_0= RULE_FLOAT ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3975:7: ()
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3976:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getNumeroDecimalAction_2_0(),
                                current);
                        

                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3981:2: ( (lv_valor_6_0= RULE_FLOAT ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3982:1: (lv_valor_6_0= RULE_FLOAT )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3982:1: (lv_valor_6_0= RULE_FLOAT )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3983:3: lv_valor_6_0= RULE_FLOAT
                    {
                    lv_valor_6_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rulePrimaria8846); 

                    			newLeafNode(lv_valor_6_0, grammarAccess.getPrimariaAccess().getValorFLOATTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimariaRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valor",
                            		lv_valor_6_0, 
                            		"FLOAT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4000:6: ( () ( (lv_contenido_8_0= RULE_CAD ) ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4000:6: ( () ( (lv_contenido_8_0= RULE_CAD ) ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4000:7: () ( (lv_contenido_8_0= RULE_CAD ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4000:7: ()
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4001:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getConstCadenaAction_3_0(),
                                current);
                        

                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4006:2: ( (lv_contenido_8_0= RULE_CAD ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4007:1: (lv_contenido_8_0= RULE_CAD )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4007:1: (lv_contenido_8_0= RULE_CAD )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4008:3: lv_contenido_8_0= RULE_CAD
                    {
                    lv_contenido_8_0=(Token)match(input,RULE_CAD,FollowSets000.FOLLOW_RULE_CAD_in_rulePrimaria8885); 

                    			newLeafNode(lv_contenido_8_0, grammarAccess.getPrimariaAccess().getContenidoCADTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimariaRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"contenido",
                            		lv_contenido_8_0, 
                            		"CAD");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4025:6: ( () ( (lv_contenido_10_0= RULE_CAR ) ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4025:6: ( () ( (lv_contenido_10_0= RULE_CAR ) ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4025:7: () ( (lv_contenido_10_0= RULE_CAR ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4025:7: ()
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4026:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getCaracterAction_4_0(),
                                current);
                        

                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4031:2: ( (lv_contenido_10_0= RULE_CAR ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4032:1: (lv_contenido_10_0= RULE_CAR )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4032:1: (lv_contenido_10_0= RULE_CAR )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4033:3: lv_contenido_10_0= RULE_CAR
                    {
                    lv_contenido_10_0=(Token)match(input,RULE_CAR,FollowSets000.FOLLOW_RULE_CAR_in_rulePrimaria8924); 

                    			newLeafNode(lv_contenido_10_0, grammarAccess.getPrimariaAccess().getContenidoCARTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimariaRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"contenido",
                            		lv_contenido_10_0, 
                            		"CAR");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4050:6: ( () ( (lv_valor_12_0= rulebooleano ) ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4050:6: ( () ( (lv_valor_12_0= rulebooleano ) ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4050:7: () ( (lv_valor_12_0= rulebooleano ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4050:7: ()
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4051:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getValorBooleanoAction_5_0(),
                                current);
                        

                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4056:2: ( (lv_valor_12_0= rulebooleano ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4057:1: (lv_valor_12_0= rulebooleano )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4057:1: (lv_valor_12_0= rulebooleano )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4058:3: lv_valor_12_0= rulebooleano
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getValorBooleanoParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulebooleano_in_rulePrimaria8967);
                    lv_valor_12_0=rulebooleano();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_12_0, 
                            		"booleano");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4075:6: ( () ( (lv_nombre_14_0= ruleEString ) ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4075:6: ( () ( (lv_nombre_14_0= ruleEString ) ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4075:7: () ( (lv_nombre_14_0= ruleEString ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4075:7: ()
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4076:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getVariableIDAction_6_0(),
                                current);
                        

                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4081:2: ( (lv_nombre_14_0= ruleEString ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4082:1: (lv_nombre_14_0= ruleEString )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4082:1: (lv_nombre_14_0= ruleEString )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4083:3: lv_nombre_14_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getNombreEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePrimaria9005);
                    lv_nombre_14_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre",
                            		lv_nombre_14_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4100:6: ( () ( ( (lv_nombre_matriz_16_0= ruleEString ) ) otherlv_17= '[' ( ( (lv_indicesCadena_18_0= ruleEString ) ) | ( (lv_indicesNumericos_19_0= ruleINTEGER ) ) ) otherlv_20= '][' ( ( (lv_indicesCadena_21_0= ruleEString ) ) | ( (lv_indicesNumericos_22_0= ruleINTEGER ) ) ) otherlv_23= ']' ) (otherlv_24= '.' ( (lv_campo_25_0= ruleCampoRegistro ) ) )? )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4100:6: ( () ( ( (lv_nombre_matriz_16_0= ruleEString ) ) otherlv_17= '[' ( ( (lv_indicesCadena_18_0= ruleEString ) ) | ( (lv_indicesNumericos_19_0= ruleINTEGER ) ) ) otherlv_20= '][' ( ( (lv_indicesCadena_21_0= ruleEString ) ) | ( (lv_indicesNumericos_22_0= ruleINTEGER ) ) ) otherlv_23= ']' ) (otherlv_24= '.' ( (lv_campo_25_0= ruleCampoRegistro ) ) )? )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4100:7: () ( ( (lv_nombre_matriz_16_0= ruleEString ) ) otherlv_17= '[' ( ( (lv_indicesCadena_18_0= ruleEString ) ) | ( (lv_indicesNumericos_19_0= ruleINTEGER ) ) ) otherlv_20= '][' ( ( (lv_indicesCadena_21_0= ruleEString ) ) | ( (lv_indicesNumericos_22_0= ruleINTEGER ) ) ) otherlv_23= ']' ) (otherlv_24= '.' ( (lv_campo_25_0= ruleCampoRegistro ) ) )?
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4100:7: ()
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4101:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getValorMatrizAction_7_0(),
                                current);
                        

                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4106:2: ( ( (lv_nombre_matriz_16_0= ruleEString ) ) otherlv_17= '[' ( ( (lv_indicesCadena_18_0= ruleEString ) ) | ( (lv_indicesNumericos_19_0= ruleINTEGER ) ) ) otherlv_20= '][' ( ( (lv_indicesCadena_21_0= ruleEString ) ) | ( (lv_indicesNumericos_22_0= ruleINTEGER ) ) ) otherlv_23= ']' )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4106:3: ( (lv_nombre_matriz_16_0= ruleEString ) ) otherlv_17= '[' ( ( (lv_indicesCadena_18_0= ruleEString ) ) | ( (lv_indicesNumericos_19_0= ruleINTEGER ) ) ) otherlv_20= '][' ( ( (lv_indicesCadena_21_0= ruleEString ) ) | ( (lv_indicesNumericos_22_0= ruleINTEGER ) ) ) otherlv_23= ']'
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4106:3: ( (lv_nombre_matriz_16_0= ruleEString ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4107:1: (lv_nombre_matriz_16_0= ruleEString )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4107:1: (lv_nombre_matriz_16_0= ruleEString )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4108:3: lv_nombre_matriz_16_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getNombre_matrizEStringParserRuleCall_7_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePrimaria9044);
                    lv_nombre_matriz_16_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre_matriz",
                            		lv_nombre_matriz_16_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePrimaria9056); 

                        	newLeafNode(otherlv_17, grammarAccess.getPrimariaAccess().getLeftSquareBracketKeyword_7_1_1());
                        
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4128:1: ( ( (lv_indicesCadena_18_0= ruleEString ) ) | ( (lv_indicesNumericos_19_0= ruleINTEGER ) ) )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_ID)) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==RULE_INT) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4128:2: ( (lv_indicesCadena_18_0= ruleEString ) )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4128:2: ( (lv_indicesCadena_18_0= ruleEString ) )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4129:1: (lv_indicesCadena_18_0= ruleEString )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4129:1: (lv_indicesCadena_18_0= ruleEString )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4130:3: lv_indicesCadena_18_0= ruleEString
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimariaAccess().getIndicesCadenaEStringParserRuleCall_7_1_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePrimaria9078);
                            lv_indicesCadena_18_0=ruleEString();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"indicesCadena",
                                    		lv_indicesCadena_18_0, 
                                    		"EString");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4147:6: ( (lv_indicesNumericos_19_0= ruleINTEGER ) )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4147:6: ( (lv_indicesNumericos_19_0= ruleINTEGER ) )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4148:1: (lv_indicesNumericos_19_0= ruleINTEGER )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4148:1: (lv_indicesNumericos_19_0= ruleINTEGER )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4149:3: lv_indicesNumericos_19_0= ruleINTEGER
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimariaAccess().getIndicesNumericosINTEGERParserRuleCall_7_1_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleINTEGER_in_rulePrimaria9105);
                            lv_indicesNumericos_19_0=ruleINTEGER();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"indicesNumericos",
                                    		lv_indicesNumericos_19_0, 
                                    		"INTEGER");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_20=(Token)match(input,44,FollowSets000.FOLLOW_44_in_rulePrimaria9118); 

                        	newLeafNode(otherlv_20, grammarAccess.getPrimariaAccess().getRightSquareBracketLeftSquareBracketKeyword_7_1_3());
                        
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4169:1: ( ( (lv_indicesCadena_21_0= ruleEString ) ) | ( (lv_indicesNumericos_22_0= ruleINTEGER ) ) )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_ID)) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==RULE_INT) ) {
                        alt65=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4169:2: ( (lv_indicesCadena_21_0= ruleEString ) )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4169:2: ( (lv_indicesCadena_21_0= ruleEString ) )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4170:1: (lv_indicesCadena_21_0= ruleEString )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4170:1: (lv_indicesCadena_21_0= ruleEString )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4171:3: lv_indicesCadena_21_0= ruleEString
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimariaAccess().getIndicesCadenaEStringParserRuleCall_7_1_4_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePrimaria9140);
                            lv_indicesCadena_21_0=ruleEString();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"indicesCadena",
                                    		lv_indicesCadena_21_0, 
                                    		"EString");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4188:6: ( (lv_indicesNumericos_22_0= ruleINTEGER ) )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4188:6: ( (lv_indicesNumericos_22_0= ruleINTEGER ) )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4189:1: (lv_indicesNumericos_22_0= ruleINTEGER )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4189:1: (lv_indicesNumericos_22_0= ruleINTEGER )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4190:3: lv_indicesNumericos_22_0= ruleINTEGER
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimariaAccess().getIndicesNumericosINTEGERParserRuleCall_7_1_4_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleINTEGER_in_rulePrimaria9167);
                            lv_indicesNumericos_22_0=ruleINTEGER();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"indicesNumericos",
                                    		lv_indicesNumericos_22_0, 
                                    		"INTEGER");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePrimaria9180); 

                        	newLeafNode(otherlv_23, grammarAccess.getPrimariaAccess().getRightSquareBracketKeyword_7_1_5());
                        

                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4210:2: (otherlv_24= '.' ( (lv_campo_25_0= ruleCampoRegistro ) ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==93) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4210:4: otherlv_24= '.' ( (lv_campo_25_0= ruleCampoRegistro ) )
                            {
                            otherlv_24=(Token)match(input,93,FollowSets000.FOLLOW_93_in_rulePrimaria9194); 

                                	newLeafNode(otherlv_24, grammarAccess.getPrimariaAccess().getFullStopKeyword_7_2_0());
                                
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4214:1: ( (lv_campo_25_0= ruleCampoRegistro ) )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4215:1: (lv_campo_25_0= ruleCampoRegistro )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4215:1: (lv_campo_25_0= ruleCampoRegistro )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4216:3: lv_campo_25_0= ruleCampoRegistro
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimariaAccess().getCampoCampoRegistroParserRuleCall_7_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_rulePrimaria9215);
                            lv_campo_25_0=ruleCampoRegistro();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"campo",
                                    		lv_campo_25_0, 
                                    		"CampoRegistro");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4233:6: ( () ( ( (lv_nombre_vector_27_0= ruleEString ) ) otherlv_28= '[' ( ( (lv_indiceCadena_29_0= ruleEString ) ) | ( (lv_indiceNumerico_30_0= ruleINTEGER ) ) ) otherlv_31= ']' ) (otherlv_32= '.' ( (lv_campo_33_0= ruleCampoRegistro ) ) )? )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4233:6: ( () ( ( (lv_nombre_vector_27_0= ruleEString ) ) otherlv_28= '[' ( ( (lv_indiceCadena_29_0= ruleEString ) ) | ( (lv_indiceNumerico_30_0= ruleINTEGER ) ) ) otherlv_31= ']' ) (otherlv_32= '.' ( (lv_campo_33_0= ruleCampoRegistro ) ) )? )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4233:7: () ( ( (lv_nombre_vector_27_0= ruleEString ) ) otherlv_28= '[' ( ( (lv_indiceCadena_29_0= ruleEString ) ) | ( (lv_indiceNumerico_30_0= ruleINTEGER ) ) ) otherlv_31= ']' ) (otherlv_32= '.' ( (lv_campo_33_0= ruleCampoRegistro ) ) )?
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4233:7: ()
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4234:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getValorVectorAction_8_0(),
                                current);
                        

                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4239:2: ( ( (lv_nombre_vector_27_0= ruleEString ) ) otherlv_28= '[' ( ( (lv_indiceCadena_29_0= ruleEString ) ) | ( (lv_indiceNumerico_30_0= ruleINTEGER ) ) ) otherlv_31= ']' )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4239:3: ( (lv_nombre_vector_27_0= ruleEString ) ) otherlv_28= '[' ( ( (lv_indiceCadena_29_0= ruleEString ) ) | ( (lv_indiceNumerico_30_0= ruleINTEGER ) ) ) otherlv_31= ']'
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4239:3: ( (lv_nombre_vector_27_0= ruleEString ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4240:1: (lv_nombre_vector_27_0= ruleEString )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4240:1: (lv_nombre_vector_27_0= ruleEString )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4241:3: lv_nombre_vector_27_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getNombre_vectorEStringParserRuleCall_8_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePrimaria9256);
                    lv_nombre_vector_27_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre_vector",
                            		lv_nombre_vector_27_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_28=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePrimaria9268); 

                        	newLeafNode(otherlv_28, grammarAccess.getPrimariaAccess().getLeftSquareBracketKeyword_8_1_1());
                        
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4261:1: ( ( (lv_indiceCadena_29_0= ruleEString ) ) | ( (lv_indiceNumerico_30_0= ruleINTEGER ) ) )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( ((LA67_0>=RULE_STRING && LA67_0<=RULE_ID)) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==RULE_INT) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4261:2: ( (lv_indiceCadena_29_0= ruleEString ) )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4261:2: ( (lv_indiceCadena_29_0= ruleEString ) )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4262:1: (lv_indiceCadena_29_0= ruleEString )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4262:1: (lv_indiceCadena_29_0= ruleEString )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4263:3: lv_indiceCadena_29_0= ruleEString
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimariaAccess().getIndiceCadenaEStringParserRuleCall_8_1_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePrimaria9290);
                            lv_indiceCadena_29_0=ruleEString();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"indiceCadena",
                                    		lv_indiceCadena_29_0, 
                                    		"EString");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4280:6: ( (lv_indiceNumerico_30_0= ruleINTEGER ) )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4280:6: ( (lv_indiceNumerico_30_0= ruleINTEGER ) )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4281:1: (lv_indiceNumerico_30_0= ruleINTEGER )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4281:1: (lv_indiceNumerico_30_0= ruleINTEGER )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4282:3: lv_indiceNumerico_30_0= ruleINTEGER
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimariaAccess().getIndiceNumericoINTEGERParserRuleCall_8_1_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleINTEGER_in_rulePrimaria9317);
                            lv_indiceNumerico_30_0=ruleINTEGER();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"indiceNumerico",
                                    		lv_indiceNumerico_30_0, 
                                    		"INTEGER");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_31=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePrimaria9330); 

                        	newLeafNode(otherlv_31, grammarAccess.getPrimariaAccess().getRightSquareBracketKeyword_8_1_3());
                        

                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4302:2: (otherlv_32= '.' ( (lv_campo_33_0= ruleCampoRegistro ) ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==93) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4302:4: otherlv_32= '.' ( (lv_campo_33_0= ruleCampoRegistro ) )
                            {
                            otherlv_32=(Token)match(input,93,FollowSets000.FOLLOW_93_in_rulePrimaria9344); 

                                	newLeafNode(otherlv_32, grammarAccess.getPrimariaAccess().getFullStopKeyword_8_2_0());
                                
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4306:1: ( (lv_campo_33_0= ruleCampoRegistro ) )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4307:1: (lv_campo_33_0= ruleCampoRegistro )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4307:1: (lv_campo_33_0= ruleCampoRegistro )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4308:3: lv_campo_33_0= ruleCampoRegistro
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimariaAccess().getCampoCampoRegistroParserRuleCall_8_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_rulePrimaria9365);
                            lv_campo_33_0=ruleCampoRegistro();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"campo",
                                    		lv_campo_33_0, 
                                    		"CampoRegistro");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4325:6: ( () ( (lv_nombre_registro_35_0= ruleEString ) ) otherlv_36= '.' ( ( (lv_campo_37_0= ruleCampoRegistro ) ) (otherlv_38= '.' ( (lv_campo_39_0= ruleCampoRegistro ) ) )* ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4325:6: ( () ( (lv_nombre_registro_35_0= ruleEString ) ) otherlv_36= '.' ( ( (lv_campo_37_0= ruleCampoRegistro ) ) (otherlv_38= '.' ( (lv_campo_39_0= ruleCampoRegistro ) ) )* ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4325:7: () ( (lv_nombre_registro_35_0= ruleEString ) ) otherlv_36= '.' ( ( (lv_campo_37_0= ruleCampoRegistro ) ) (otherlv_38= '.' ( (lv_campo_39_0= ruleCampoRegistro ) ) )* )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4325:7: ()
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4326:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getValorRegistroAction_9_0(),
                                current);
                        

                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4331:2: ( (lv_nombre_registro_35_0= ruleEString ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4332:1: (lv_nombre_registro_35_0= ruleEString )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4332:1: (lv_nombre_registro_35_0= ruleEString )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4333:3: lv_nombre_registro_35_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getNombre_registroEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePrimaria9405);
                    lv_nombre_registro_35_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre_registro",
                            		lv_nombre_registro_35_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_36=(Token)match(input,93,FollowSets000.FOLLOW_93_in_rulePrimaria9417); 

                        	newLeafNode(otherlv_36, grammarAccess.getPrimariaAccess().getFullStopKeyword_9_2());
                        
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4353:1: ( ( (lv_campo_37_0= ruleCampoRegistro ) ) (otherlv_38= '.' ( (lv_campo_39_0= ruleCampoRegistro ) ) )* )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4353:2: ( (lv_campo_37_0= ruleCampoRegistro ) ) (otherlv_38= '.' ( (lv_campo_39_0= ruleCampoRegistro ) ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4353:2: ( (lv_campo_37_0= ruleCampoRegistro ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4354:1: (lv_campo_37_0= ruleCampoRegistro )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4354:1: (lv_campo_37_0= ruleCampoRegistro )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4355:3: lv_campo_37_0= ruleCampoRegistro
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getCampoCampoRegistroParserRuleCall_9_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_rulePrimaria9439);
                    lv_campo_37_0=ruleCampoRegistro();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	        }
                           		add(
                           			current, 
                           			"campo",
                            		lv_campo_37_0, 
                            		"CampoRegistro");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4371:2: (otherlv_38= '.' ( (lv_campo_39_0= ruleCampoRegistro ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==93) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4371:4: otherlv_38= '.' ( (lv_campo_39_0= ruleCampoRegistro ) )
                    	    {
                    	    otherlv_38=(Token)match(input,93,FollowSets000.FOLLOW_93_in_rulePrimaria9452); 

                    	        	newLeafNode(otherlv_38, grammarAccess.getPrimariaAccess().getFullStopKeyword_9_3_1_0());
                    	        
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4375:1: ( (lv_campo_39_0= ruleCampoRegistro ) )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4376:1: (lv_campo_39_0= ruleCampoRegistro )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4376:1: (lv_campo_39_0= ruleCampoRegistro )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4377:3: lv_campo_39_0= ruleCampoRegistro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPrimariaAccess().getCampoCampoRegistroParserRuleCall_9_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_rulePrimaria9473);
                    	    lv_campo_39_0=ruleCampoRegistro();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"campo",
                    	            		lv_campo_39_0, 
                    	            		"CampoRegistro");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    }


                    }


                    }
                    break;
                case 11 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4394:6: ( () ( (lv_nombre_41_0= ruleEString ) ) otherlv_42= '(' ( ( (lv_operadores_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_operadores_45_0= ruleEString ) ) )* )? otherlv_46= ')' )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4394:6: ( () ( (lv_nombre_41_0= ruleEString ) ) otherlv_42= '(' ( ( (lv_operadores_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_operadores_45_0= ruleEString ) ) )* )? otherlv_46= ')' )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4394:7: () ( (lv_nombre_41_0= ruleEString ) ) otherlv_42= '(' ( ( (lv_operadores_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_operadores_45_0= ruleEString ) ) )* )? otherlv_46= ')'
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4394:7: ()
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4395:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getLlamadaFuncionAction_10_0(),
                                current);
                        

                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4400:2: ( (lv_nombre_41_0= ruleEString ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4401:1: (lv_nombre_41_0= ruleEString )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4401:1: (lv_nombre_41_0= ruleEString )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4402:3: lv_nombre_41_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getNombreEStringParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePrimaria9514);
                    lv_nombre_41_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre",
                            		lv_nombre_41_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_42=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePrimaria9526); 

                        	newLeafNode(otherlv_42, grammarAccess.getPrimariaAccess().getLeftParenthesisKeyword_10_2());
                        
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4422:1: ( ( (lv_operadores_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_operadores_45_0= ruleEString ) ) )* )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( ((LA71_0>=RULE_STRING && LA71_0<=RULE_ID)) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4422:2: ( (lv_operadores_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_operadores_45_0= ruleEString ) ) )*
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4422:2: ( (lv_operadores_43_0= ruleEString ) )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4423:1: (lv_operadores_43_0= ruleEString )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4423:1: (lv_operadores_43_0= ruleEString )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4424:3: lv_operadores_43_0= ruleEString
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimariaAccess().getOperadoresEStringParserRuleCall_10_3_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePrimaria9548);
                            lv_operadores_43_0=ruleEString();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"operadores",
                                    		lv_operadores_43_0, 
                                    		"EString");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4440:2: (otherlv_44= ',' ( (lv_operadores_45_0= ruleEString ) ) )*
                            loop70:
                            do {
                                int alt70=2;
                                int LA70_0 = input.LA(1);

                                if ( (LA70_0==23) ) {
                                    alt70=1;
                                }


                                switch (alt70) {
                            	case 1 :
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4440:4: otherlv_44= ',' ( (lv_operadores_45_0= ruleEString ) )
                            	    {
                            	    otherlv_44=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePrimaria9561); 

                            	        	newLeafNode(otherlv_44, grammarAccess.getPrimariaAccess().getCommaKeyword_10_3_1_0());
                            	        
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4444:1: ( (lv_operadores_45_0= ruleEString ) )
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4445:1: (lv_operadores_45_0= ruleEString )
                            	    {
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4445:1: (lv_operadores_45_0= ruleEString )
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4446:3: lv_operadores_45_0= ruleEString
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPrimariaAccess().getOperadoresEStringParserRuleCall_10_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePrimaria9582);
                            	    lv_operadores_45_0=ruleEString();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"operadores",
                            	            		lv_operadores_45_0, 
                            	            		"EString");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


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

                    otherlv_46=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePrimaria9598); 

                        	newLeafNode(otherlv_46, grammarAccess.getPrimariaAccess().getRightParenthesisKeyword_10_4());
                        

                    }


                    }
                    break;
                case 12 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4467:6: ( () ( (lv_nombre_48_0= ruleNombreInterna ) ) otherlv_49= '(' ( ( (lv_operadores_50_0= ruleEString ) ) (otherlv_51= ',' ( (lv_operadores_52_0= ruleEString ) ) )* ) otherlv_53= ')' )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4467:6: ( () ( (lv_nombre_48_0= ruleNombreInterna ) ) otherlv_49= '(' ( ( (lv_operadores_50_0= ruleEString ) ) (otherlv_51= ',' ( (lv_operadores_52_0= ruleEString ) ) )* ) otherlv_53= ')' )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4467:7: () ( (lv_nombre_48_0= ruleNombreInterna ) ) otherlv_49= '(' ( ( (lv_operadores_50_0= ruleEString ) ) (otherlv_51= ',' ( (lv_operadores_52_0= ruleEString ) ) )* ) otherlv_53= ')'
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4467:7: ()
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4468:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getInternasAction_11_0(),
                                current);
                        

                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4473:2: ( (lv_nombre_48_0= ruleNombreInterna ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4474:1: (lv_nombre_48_0= ruleNombreInterna )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4474:1: (lv_nombre_48_0= ruleNombreInterna )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4475:3: lv_nombre_48_0= ruleNombreInterna
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getNombreNombreInternaParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_rulePrimaria9636);
                    lv_nombre_48_0=ruleNombreInterna();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre",
                            		lv_nombre_48_0, 
                            		"NombreInterna");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_49=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePrimaria9648); 

                        	newLeafNode(otherlv_49, grammarAccess.getPrimariaAccess().getLeftParenthesisKeyword_11_2());
                        
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4495:1: ( ( (lv_operadores_50_0= ruleEString ) ) (otherlv_51= ',' ( (lv_operadores_52_0= ruleEString ) ) )* )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4495:2: ( (lv_operadores_50_0= ruleEString ) ) (otherlv_51= ',' ( (lv_operadores_52_0= ruleEString ) ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4495:2: ( (lv_operadores_50_0= ruleEString ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4496:1: (lv_operadores_50_0= ruleEString )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4496:1: (lv_operadores_50_0= ruleEString )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4497:3: lv_operadores_50_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getOperadoresEStringParserRuleCall_11_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePrimaria9670);
                    lv_operadores_50_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	        }
                           		add(
                           			current, 
                           			"operadores",
                            		lv_operadores_50_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4513:2: (otherlv_51= ',' ( (lv_operadores_52_0= ruleEString ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==23) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4513:4: otherlv_51= ',' ( (lv_operadores_52_0= ruleEString ) )
                    	    {
                    	    otherlv_51=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePrimaria9683); 

                    	        	newLeafNode(otherlv_51, grammarAccess.getPrimariaAccess().getCommaKeyword_11_3_1_0());
                    	        
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4517:1: ( (lv_operadores_52_0= ruleEString ) )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4518:1: (lv_operadores_52_0= ruleEString )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4518:1: (lv_operadores_52_0= ruleEString )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4519:3: lv_operadores_52_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPrimariaAccess().getOperadoresEStringParserRuleCall_11_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePrimaria9704);
                    	    lv_operadores_52_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operadores",
                    	            		lv_operadores_52_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);


                    }

                    otherlv_53=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePrimaria9719); 

                        	newLeafNode(otherlv_53, grammarAccess.getPrimariaAccess().getRightParenthesisKeyword_11_4());
                        

                    }


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
    // $ANTLR end "rulePrimaria"


    // $ANTLR start "entryRuleSino"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4547:1: entryRuleSino returns [EObject current=null] : iv_ruleSino= ruleSino EOF ;
    public final EObject entryRuleSino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSino = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4548:2: (iv_ruleSino= ruleSino EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4549:2: iv_ruleSino= ruleSino EOF
            {
             newCompositeNode(grammarAccess.getSinoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSino_in_entryRuleSino9756);
            iv_ruleSino=ruleSino();

            state._fsp--;

             current =iv_ruleSino; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSino9766); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4556:1: ruleSino returns [EObject current=null] : ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) ;
    public final EObject ruleSino() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sentencias_2_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_devuelve_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4559:28: ( ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4560:1: ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4560:1: ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4560:2: () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )?
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4560:2: ()
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4561:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSinoAccess().getSinoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleSino9812); 

                	newLeafNode(otherlv_1, grammarAccess.getSinoAccess().getSinoKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4570:1: ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=RULE_INT && LA75_0<=RULE_CAR)||LA75_0==21||LA75_0==25||(LA75_0>=28 && LA75_0<=36)||(LA75_0>=54 && LA75_0<=56)||LA75_0==59||LA75_0==62||LA75_0==64||LA75_0==68||(LA75_0>=77 && LA75_0<=78)||LA75_0==91) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4570:2: ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4570:2: ( (lv_sentencias_2_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4571:1: (lv_sentencias_2_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4571:1: (lv_sentencias_2_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4572:3: lv_sentencias_2_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino9834);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4588:2: ( (lv_sentencias_3_0= ruleSentencias ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( ((LA74_0>=RULE_INT && LA74_0<=RULE_CAR)||LA74_0==21||LA74_0==25||(LA74_0>=28 && LA74_0<=36)||(LA74_0>=54 && LA74_0<=56)||LA74_0==59||LA74_0==62||LA74_0==64||LA74_0==68||(LA74_0>=77 && LA74_0<=78)||LA74_0==91) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4589:1: (lv_sentencias_3_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4589:1: (lv_sentencias_3_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4590:3: lv_sentencias_3_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino9855);
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
                    	    break loop74;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4606:5: ( (lv_devuelve_4_0= ruleDevolver ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==95) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4607:1: (lv_devuelve_4_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4607:1: (lv_devuelve_4_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4608:3: lv_devuelve_4_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getDevuelveDevolverParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSino9879);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4632:1: entryRuleDevolver returns [EObject current=null] : iv_ruleDevolver= ruleDevolver EOF ;
    public final EObject entryRuleDevolver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevolver = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4633:2: (iv_ruleDevolver= ruleDevolver EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4634:2: iv_ruleDevolver= ruleDevolver EOF
            {
             newCompositeNode(grammarAccess.getDevolverRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_entryRuleDevolver9916);
            iv_ruleDevolver=ruleDevolver();

            state._fsp--;

             current =iv_ruleDevolver; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDevolver9926); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4641:1: ruleDevolver returns [EObject current=null] : ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= rulePrimaria ) ) ) ;
    public final EObject ruleDevolver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_devuelve_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4644:28: ( ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= rulePrimaria ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4645:1: ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= rulePrimaria ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4645:1: ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= rulePrimaria ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4645:2: () otherlv_1= 'devolver' ( (lv_devuelve_2_0= rulePrimaria ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4645:2: ()
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4646:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDevolverAccess().getDevolverAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,95,FollowSets000.FOLLOW_95_in_ruleDevolver9972); 

                	newLeafNode(otherlv_1, grammarAccess.getDevolverAccess().getDevolverKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4655:1: ( (lv_devuelve_2_0= rulePrimaria ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4656:1: (lv_devuelve_2_0= rulePrimaria )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4656:1: (lv_devuelve_2_0= rulePrimaria )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4657:3: lv_devuelve_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getDevolverAccess().getDevuelvePrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleDevolver9993);
            lv_devuelve_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDevolverRule());
            	        }
                   		set(
                   			current, 
                   			"devuelve",
                    		lv_devuelve_2_0, 
                    		"Primaria");
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
    // $ANTLR end "ruleDevolver"


    // $ANTLR start "entryRuleParametroFuncion"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4683:1: entryRuleParametroFuncion returns [EObject current=null] : iv_ruleParametroFuncion= ruleParametroFuncion EOF ;
    public final EObject entryRuleParametroFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametroFuncion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4684:2: (iv_ruleParametroFuncion= ruleParametroFuncion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4685:2: iv_ruleParametroFuncion= ruleParametroFuncion EOF
            {
             newCompositeNode(grammarAccess.getParametroFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion10031);
            iv_ruleParametroFuncion=ruleParametroFuncion();

            state._fsp--;

             current =iv_ruleParametroFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametroFuncion10041); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4692:1: ruleParametroFuncion returns [EObject current=null] : ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) ) ;
    public final EObject ruleParametroFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_paso_0_0 = null;

        EObject lv_tipo_1_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4695:28: ( ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4696:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4696:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4696:2: ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4696:2: ( (lv_paso_0_0= ruleTipoPaso ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4697:1: (lv_paso_0_0= ruleTipoPaso )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4697:1: (lv_paso_0_0= ruleTipoPaso )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4698:3: lv_paso_0_0= ruleTipoPaso
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_ruleParametroFuncion10087);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4714:2: ( (lv_tipo_1_0= ruleTipo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4715:1: (lv_tipo_1_0= ruleTipo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4715:1: (lv_tipo_1_0= ruleTipo )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4716:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleParametroFuncion10108);
            lv_tipo_1_0=ruleTipo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParametroFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_1_0, 
                    		"Tipo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleParametroFuncion10120); 

                	newLeafNode(otherlv_2, grammarAccess.getParametroFuncionAccess().getColonSpaceKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4736:1: ( (lv_variable_3_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4737:1: (lv_variable_3_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4737:1: (lv_variable_3_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4738:3: lv_variable_3_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleParametroFuncion10141);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4762:1: entryRuleFuncion returns [EObject current=null] : iv_ruleFuncion= ruleFuncion EOF ;
    public final EObject entryRuleFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4763:2: (iv_ruleFuncion= ruleFuncion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4764:2: iv_ruleFuncion= ruleFuncion EOF
            {
             newCompositeNode(grammarAccess.getFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_entryRuleFuncion10177);
            iv_ruleFuncion=ruleFuncion();

            state._fsp--;

             current =iv_ruleFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncion10187); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4771:1: ruleFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) ) otherlv_17= 'fin_funcion' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4774:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) ) otherlv_17= 'fin_funcion' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4775:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) ) otherlv_17= 'fin_funcion' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4775:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) ) otherlv_17= 'fin_funcion' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4775:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) ) otherlv_17= 'fin_funcion'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4775:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4776:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4776:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4777:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleFuncion10233);
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

            otherlv_1=(Token)match(input,96,FollowSets000.FOLLOW_96_in_ruleFuncion10245); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionAccess().getFuncionKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4797:1: ( (lv_nombre_2_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4798:1: (lv_nombre_2_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4798:1: (lv_nombre_2_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4799:3: lv_nombre_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getNombreEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFuncion10266);
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

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFuncion10278); 

                	newLeafNode(otherlv_3, grammarAccess.getFuncionAccess().getLeftParenthesisKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4819:1: ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=100 && LA78_0<=102)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4819:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4819:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4820:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4820:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4821:3: lv_parametrofuncion_4_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion10300);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4837:2: (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==23) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4837:4: otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFuncion10313); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getFuncionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4841:1: ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4842:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4842:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4843:3: lv_parametrofuncion_6_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion10334);
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
                    	    break loop77;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFuncion10350); 

                	newLeafNode(otherlv_7, grammarAccess.getFuncionAccess().getRightParenthesisKeyword_5());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4863:1: (otherlv_8= 'const' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==17) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4863:3: otherlv_8= 'const'
                    {
                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFuncion10363); 

                        	newLeafNode(otherlv_8, grammarAccess.getFuncionAccess().getConstKeyword_6());
                        

                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4867:3: (otherlv_9= 'tipo' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==18) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4867:5: otherlv_9= 'tipo'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFuncion10378); 

                        	newLeafNode(otherlv_9, grammarAccess.getFuncionAccess().getTipoKeyword_7());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFuncion10392); 

                	newLeafNode(otherlv_10, grammarAccess.getFuncionAccess().getVarKeyword_8());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4875:1: ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=RULE_STRING && LA82_0<=RULE_ID)||(LA82_0>=72 && LA82_0<=76)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4875:2: ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4875:2: ( (lv_declaracion_11_0= ruleDeclaracion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4876:1: (lv_declaracion_11_0= ruleDeclaracion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4876:1: (lv_declaracion_11_0= ruleDeclaracion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4877:3: lv_declaracion_11_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_9_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion10414);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4893:2: ( (lv_declaracion_12_0= ruleDeclaracion ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( ((LA81_0>=RULE_STRING && LA81_0<=RULE_ID)||(LA81_0>=72 && LA81_0<=76)) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4894:1: (lv_declaracion_12_0= ruleDeclaracion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4894:1: (lv_declaracion_12_0= ruleDeclaracion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4895:3: lv_declaracion_12_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion10435);
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
                    	    break loop81;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleFuncion10450); 

                	newLeafNode(otherlv_13, grammarAccess.getFuncionAccess().getInicioKeyword_10());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4915:1: ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=RULE_INT && LA84_0<=RULE_CAR)||LA84_0==21||LA84_0==25||(LA84_0>=28 && LA84_0<=36)||(LA84_0>=54 && LA84_0<=56)||LA84_0==59||LA84_0==62||LA84_0==64||LA84_0==68||(LA84_0>=77 && LA84_0<=78)||LA84_0==91) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4915:2: ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4915:2: ( (lv_sentencias_14_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4916:1: (lv_sentencias_14_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4916:1: (lv_sentencias_14_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4917:3: lv_sentencias_14_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_11_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion10472);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4933:2: ( (lv_sentencias_15_0= ruleSentencias ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( ((LA83_0>=RULE_INT && LA83_0<=RULE_CAR)||LA83_0==21||LA83_0==25||(LA83_0>=28 && LA83_0<=36)||(LA83_0>=54 && LA83_0<=56)||LA83_0==59||LA83_0==62||LA83_0==64||LA83_0==68||(LA83_0>=77 && LA83_0<=78)||LA83_0==91) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4934:1: (lv_sentencias_15_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4934:1: (lv_sentencias_15_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4935:3: lv_sentencias_15_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion10493);
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
                    	    break loop83;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4951:5: ( (lv_devuelve_16_0= ruleDevolver ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4952:1: (lv_devuelve_16_0= ruleDevolver )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4952:1: (lv_devuelve_16_0= ruleDevolver )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4953:3: lv_devuelve_16_0= ruleDevolver
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getDevuelveDevolverParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleFuncion10517);
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

            otherlv_17=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleFuncion10529); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4981:1: entryRuleProcedimiento returns [EObject current=null] : iv_ruleProcedimiento= ruleProcedimiento EOF ;
    public final EObject entryRuleProcedimiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedimiento = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4982:2: (iv_ruleProcedimiento= ruleProcedimiento EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4983:2: iv_ruleProcedimiento= ruleProcedimiento EOF
            {
             newCompositeNode(grammarAccess.getProcedimientoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento10565);
            iv_ruleProcedimiento=ruleProcedimiento();

            state._fsp--;

             current =iv_ruleProcedimiento; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcedimiento10575); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4990:1: ruleProcedimiento returns [EObject current=null] : (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4993:28: ( (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4994:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4994:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4994:3: otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento'
            {
            otherlv_0=(Token)match(input,98,FollowSets000.FOLLOW_98_in_ruleProcedimiento10612); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedimientoAccess().getProcedimientoKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4998:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4999:1: (lv_nombre_1_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4999:1: (lv_nombre_1_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5000:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProcedimientoAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcedimiento10633);
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

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleProcedimiento10645); 

                	newLeafNode(otherlv_2, grammarAccess.getProcedimientoAccess().getLeftParenthesisKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5020:1: ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=100 && LA86_0<=102)) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5020:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5020:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5021:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5021:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5022:3: lv_parametrofuncion_3_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento10667);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5038:2: (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==23) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5038:4: otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleProcedimiento10680); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getProcedimientoAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5042:1: ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5043:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5043:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5044:3: lv_parametrofuncion_5_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento10701);
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
                    	    break loop85;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleProcedimiento10717); 

                	newLeafNode(otherlv_6, grammarAccess.getProcedimientoAccess().getRightParenthesisKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5064:1: (otherlv_7= 'const' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==17) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5064:3: otherlv_7= 'const'
                    {
                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProcedimiento10730); 

                        	newLeafNode(otherlv_7, grammarAccess.getProcedimientoAccess().getConstKeyword_5());
                        

                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5068:3: (otherlv_8= 'tipo' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==18) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5068:5: otherlv_8= 'tipo'
                    {
                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProcedimiento10745); 

                        	newLeafNode(otherlv_8, grammarAccess.getProcedimientoAccess().getTipoKeyword_6());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProcedimiento10759); 

                	newLeafNode(otherlv_9, grammarAccess.getProcedimientoAccess().getVarKeyword_7());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5076:1: ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( ((LA90_0>=RULE_STRING && LA90_0<=RULE_ID)||(LA90_0>=72 && LA90_0<=76)) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5076:2: ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5076:2: ( (lv_declaracion_10_0= ruleDeclaracion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5077:1: (lv_declaracion_10_0= ruleDeclaracion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5077:1: (lv_declaracion_10_0= ruleDeclaracion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5078:3: lv_declaracion_10_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_8_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento10781);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5094:2: ( (lv_declaracion_11_0= ruleDeclaracion ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( ((LA89_0>=RULE_STRING && LA89_0<=RULE_ID)||(LA89_0>=72 && LA89_0<=76)) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5095:1: (lv_declaracion_11_0= ruleDeclaracion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5095:1: (lv_declaracion_11_0= ruleDeclaracion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5096:3: lv_declaracion_11_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento10802);
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
                    	    break loop89;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleProcedimiento10817); 

                	newLeafNode(otherlv_12, grammarAccess.getProcedimientoAccess().getInicioKeyword_9());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5116:1: ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( ((LA92_0>=RULE_INT && LA92_0<=RULE_CAR)||LA92_0==21||LA92_0==25||(LA92_0>=28 && LA92_0<=36)||(LA92_0>=54 && LA92_0<=56)||LA92_0==59||LA92_0==62||LA92_0==64||LA92_0==68||(LA92_0>=77 && LA92_0<=78)||LA92_0==91) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5116:2: ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5116:2: ( (lv_sentencias_13_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5117:1: (lv_sentencias_13_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5117:1: (lv_sentencias_13_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5118:3: lv_sentencias_13_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_10_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento10839);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5134:2: ( (lv_sentencias_14_0= ruleSentencias ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( ((LA91_0>=RULE_INT && LA91_0<=RULE_CAR)||LA91_0==21||LA91_0==25||(LA91_0>=28 && LA91_0<=36)||(LA91_0>=54 && LA91_0<=56)||LA91_0==59||LA91_0==62||LA91_0==64||LA91_0==68||(LA91_0>=77 && LA91_0<=78)||LA91_0==91) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5135:1: (lv_sentencias_14_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5135:1: (lv_sentencias_14_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5136:3: lv_sentencias_14_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento10860);
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
                    	    break loop91;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,99,FollowSets000.FOLLOW_99_in_ruleProcedimiento10875); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5164:1: entryRuleTipoPaso returns [String current=null] : iv_ruleTipoPaso= ruleTipoPaso EOF ;
    public final String entryRuleTipoPaso() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoPaso = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5165:2: (iv_ruleTipoPaso= ruleTipoPaso EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5166:2: iv_ruleTipoPaso= ruleTipoPaso EOF
            {
             newCompositeNode(grammarAccess.getTipoPasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso10912);
            iv_ruleTipoPaso=ruleTipoPaso();

            state._fsp--;

             current =iv_ruleTipoPaso.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoPaso10923); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5173:1: ruleTipoPaso returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'E' | kw= 'E/S' | kw= 'S' ) ;
    public final AntlrDatatypeRuleToken ruleTipoPaso() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5176:28: ( (kw= 'E' | kw= 'E/S' | kw= 'S' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5177:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5177:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            int alt93=3;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt93=1;
                }
                break;
            case 101:
                {
                alt93=2;
                }
                break;
            case 102:
                {
                alt93=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5178:2: kw= 'E'
                    {
                    kw=(Token)match(input,100,FollowSets000.FOLLOW_100_in_ruleTipoPaso10961); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5185:2: kw= 'E/S'
                    {
                    kw=(Token)match(input,101,FollowSets000.FOLLOW_101_in_ruleTipoPaso10980); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getESKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5192:2: kw= 'S'
                    {
                    kw=(Token)match(input,102,FollowSets000.FOLLOW_102_in_ruleTipoPaso10999); 

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


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA73 dfa73 = new DFA73(this);
    static final String DFA14_eotS =
        "\12\uffff";
    static final String DFA14_eofS =
        "\12\uffff";
    static final String DFA14_minS =
        "\1\10\4\uffff\2\45\1\7\2\uffff";
    static final String DFA14_maxS =
        "\1\57\4\uffff\2\45\1\60\2\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\6\1\5";
    static final String DFA14_specialS =
        "\12\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\5\1\6\34\uffff\1\1\4\uffff\1\2\1\uffff\1\3\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "\1\7",
            "\1\7",
            "\3\10\46\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "327:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )";
        }
    }
    static final String DFA17_eotS =
        "\12\uffff";
    static final String DFA17_eofS =
        "\6\uffff\2\10\2\uffff";
    static final String DFA17_minS =
        "\1\7\5\uffff\2\7\2\uffff";
    static final String DFA17_maxS =
        "\1\133\5\uffff\2\143\2\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\7\1\6";
    static final String DFA17_specialS =
        "\12\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\10\1\6\1\7\3\10\10\uffff\1\4\3\uffff\1\5\2\uffff\11\10\21"+
            "\uffff\1\1\1\2\1\3\2\uffff\1\3\2\uffff\1\3\1\uffff\1\3\3\uffff"+
            "\1\3\10\uffff\2\10\14\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "\6\10\10\uffff\2\10\2\uffff\1\10\2\uffff\11\10\1\11\1\uffff"+
            "\1\10\15\uffff\4\10\1\uffff\2\10\1\uffff\4\10\1\uffff\3\10\1"+
            "\uffff\2\10\5\uffff\2\10\14\uffff\1\10\1\uffff\3\10\3\uffff"+
            "\1\10",
            "\6\10\10\uffff\2\10\2\uffff\1\10\2\uffff\11\10\1\11\1\uffff"+
            "\1\10\15\uffff\4\10\1\uffff\2\10\1\uffff\4\10\1\uffff\3\10\1"+
            "\uffff\2\10\5\uffff\2\10\14\uffff\1\10\1\uffff\3\10\3\uffff"+
            "\1\10",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "501:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Primaria_6= rulePrimaria )";
        }
    }
    static final String DFA73_eotS =
        "\23\uffff";
    static final String DFA73_eofS =
        "\7\uffff\2\13\12\uffff";
    static final String DFA73_minS =
        "\1\7\6\uffff\2\7\3\uffff\1\7\1\uffff\3\50\2\uffff";
    static final String DFA73_maxS =
        "\1\133\6\uffff\2\143\3\uffff\1\11\1\uffff\3\54\2\uffff";
    static final String DFA73_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\14\1\12\1\7\1\uffff\1"+
        "\13\3\uffff\1\10\1\11";
    static final String DFA73_specialS =
        "\23\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\2\1\7\1\10\1\3\1\4\1\5\17\uffff\11\11\50\uffff\2\6\14\uffff"+
            "\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\13\5\uffff\2\13\1\uffff\1\13\1\15\3\13\2\uffff\11\13\2\uffff"+
            "\1\14\1\13\1\uffff\1\13\1\uffff\1\13\4\uffff\1\13\1\uffff\1"+
            "\13\1\uffff\50\13\1\12\2\13\1\uffff\3\13",
            "\6\13\5\uffff\2\13\1\uffff\1\13\1\15\3\13\2\uffff\11\13\2\uffff"+
            "\1\14\1\13\1\uffff\1\13\1\uffff\1\13\4\uffff\1\13\1\uffff\1"+
            "\13\1\uffff\50\13\1\12\2\13\1\uffff\3\13",
            "",
            "",
            "",
            "\1\20\1\16\1\17",
            "",
            "\1\22\3\uffff\1\21",
            "\1\22\3\uffff\1\21",
            "\1\22\3\uffff\1\21",
            "",
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "3932:1: ( (otherlv_0= ' (' this_operacion_1= ruleoperacion otherlv_2= ') ' ) | ( () ( (lv_valor_4_0= ruleINTEGER ) ) ) | ( () ( (lv_valor_6_0= RULE_FLOAT ) ) ) | ( () ( (lv_contenido_8_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_10_0= RULE_CAR ) ) ) | ( () ( (lv_valor_12_0= rulebooleano ) ) ) | ( () ( (lv_nombre_14_0= ruleEString ) ) ) | ( () ( ( (lv_nombre_matriz_16_0= ruleEString ) ) otherlv_17= '[' ( ( (lv_indicesCadena_18_0= ruleEString ) ) | ( (lv_indicesNumericos_19_0= ruleINTEGER ) ) ) otherlv_20= '][' ( ( (lv_indicesCadena_21_0= ruleEString ) ) | ( (lv_indicesNumericos_22_0= ruleINTEGER ) ) ) otherlv_23= ']' ) (otherlv_24= '.' ( (lv_campo_25_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_vector_27_0= ruleEString ) ) otherlv_28= '[' ( ( (lv_indiceCadena_29_0= ruleEString ) ) | ( (lv_indiceNumerico_30_0= ruleINTEGER ) ) ) otherlv_31= ']' ) (otherlv_32= '.' ( (lv_campo_33_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_35_0= ruleEString ) ) otherlv_36= '.' ( ( (lv_campo_37_0= ruleCampoRegistro ) ) (otherlv_38= '.' ( (lv_campo_39_0= ruleCampoRegistro ) ) )* ) ) | ( () ( (lv_nombre_41_0= ruleEString ) ) otherlv_42= '(' ( ( (lv_operadores_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_operadores_45_0= ruleEString ) ) )* )? otherlv_46= ')' ) | ( () ( (lv_nombre_48_0= ruleNombreInterna ) ) otherlv_49= '(' ( ( (lv_operadores_50_0= ruleEString ) ) (otherlv_51= ',' ( (lv_operadores_52_0= ruleEString ) ) )* ) otherlv_53= ')' ) )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleCodigo_in_entryRuleCodigo75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCodigo85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleCodigo122 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCodigo138 = new BitSet(new long[]{0x00080000000E0030L,0x0000000400001F00L});
        public static final BitSet FOLLOW_ruleComentario_in_ruleCodigo159 = new BitSet(new long[]{0x00080000000E0030L,0x0000000400001F00L});
        public static final BitSet FOLLOW_ruleComentario_in_ruleCodigo180 = new BitSet(new long[]{0x00080000000E0030L,0x0000000400001F00L});
        public static final BitSet FOLLOW_17_in_ruleCodigo196 = new BitSet(new long[]{0x00080000000E0330L,0x0000000400001F00L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleCodigo218 = new BitSet(new long[]{0x00080000000E0330L,0x0000000400001F00L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleCodigo239 = new BitSet(new long[]{0x00080000000E0330L,0x0000000400001F00L});
        public static final BitSet FOLLOW_18_in_ruleCodigo257 = new BitSet(new long[]{0x0008A840000E0330L,0x0000000400001F00L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleCodigo279 = new BitSet(new long[]{0x0008A840000E0330L,0x0000000400001F00L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleCodigo300 = new BitSet(new long[]{0x0008A840000E0330L,0x0000000400001F00L});
        public static final BitSet FOLLOW_19_in_ruleCodigo318 = new BitSet(new long[]{0x00080000000E0330L,0x0000000400001F00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleCodigo340 = new BitSet(new long[]{0x00080000000E0330L,0x0000000400001F00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleCodigo361 = new BitSet(new long[]{0x00080000000E0330L,0x0000000400001F00L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleCodigo388 = new BitSet(new long[]{0x00080000000E0030L,0x0000000400001F00L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleCodigo409 = new BitSet(new long[]{0x00080000000E0030L,0x0000000400001F00L});
        public static final BitSet FOLLOW_ruleInicio_in_ruleCodigo433 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleCodigo445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_entryRuleTipoComplejo481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoComplejo491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_ruleTipoComplejo538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_ruleTipoComplejo565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegistro_in_ruleTipoComplejo592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchivo_in_ruleTipoComplejo619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerado_in_ruleTipoComplejo646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrango_in_ruleTipoComplejo673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubproceso_in_entryRuleSubproceso708 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubproceso718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_ruleSubproceso765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_ruleSubproceso792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComentario_in_entryRuleComentario827 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComentario837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleComentario883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleComentario901 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_COMENT_in_ruleComentario917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_entryRuleSentencias959 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSentencias969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_ruleSentencias1016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_ruleSentencias1043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBloque_in_ruleSentencias1070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroAbrir_in_ruleSentencias1097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroCerrar_in_ruleSentencias1124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_ruleSentencias1151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleSentencias1178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBloque_in_entryRuleBloque1213 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBloque1223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_ruleBloque1270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_ruleBloque1297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_ruleBloque1324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_ruleBloque1351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_ruleBloque1378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_entryRuleDeclaracion1413 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracion1423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_ruleDeclaracion1470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_ruleDeclaracion1497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroAbrir_in_entryRuleFuncionFicheroAbrir1532 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncionFicheroAbrir1542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleFuncionFicheroAbrir1579 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleFuncionFicheroAbrir1591 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir1613 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleFuncionFicheroAbrir1625 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_ruleModoApertura_in_ruleFuncionFicheroAbrir1646 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleFuncionFicheroAbrir1658 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir1679 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleFuncionFicheroAbrir1692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroCerrar_in_entryRuleFuncionFicheroCerrar1728 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncionFicheroCerrar1738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleFuncionFicheroCerrar1775 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleFuncionFicheroCerrar1787 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleFuncionFicheroCerrar1808 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleFuncionFicheroCerrar1820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModoApertura_in_entryRuleModoApertura1857 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModoApertura1868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleModoApertura1906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleModoApertura1925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna1966 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNombreInterna1977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleNombreInterna2015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleNombreInterna2034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleNombreInterna2053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleNombreInterna2072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleNombreInterna2091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleNombreInterna2110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleNombreInterna2129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleNombreInterna2148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleNombreInterna2167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleINTEGER_in_entryRuleINTEGER2208 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleINTEGER2219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleINTEGER2258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_entryRuleCampoRegistro2302 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCampoRegistro2312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCampoRegistro2357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipo_in_entryRuleTipo2392 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipo2402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoDefinido_in_ruleTipo2449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoExistente_in_ruleTipo2476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoDefinido_in_entryRuleTipoDefinido2511 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoDefinido2521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTipoDefinido2566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoExistente_in_entryRuleTipoExistente2601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoExistente2611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleTipoExistente2656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantes_in_entryRuleConstantes2691 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantes2701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleConstantes2747 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleConstantes2759 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleConstantes2780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_entryRuleVector2816 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVector2826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleVector2863 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleVector2875 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleVector2896 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleVector2908 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleVector2920 = new BitSet(new long[]{0x0000000000000300L,0x0000000000001F00L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleVector2941 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleVector2953 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVector2974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_entryRuleMatriz3010 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatriz3020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleMatriz3057 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleMatriz3069 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMatriz3090 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleMatriz3102 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMatriz3123 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleMatriz3135 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleMatriz3147 = new BitSet(new long[]{0x0000000000000300L,0x0000000000001F00L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleMatriz3168 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleMatriz3180 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatriz3201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegistro_in_entryRuleRegistro3237 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegistro3247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleRegistro3284 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRegistro3305 = new BitSet(new long[]{0x0000000000000300L,0x0000000000001F00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleRegistro3327 = new BitSet(new long[]{0x0000400000000300L,0x0000000000001F00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleRegistro3348 = new BitSet(new long[]{0x0000400000000300L,0x0000000000001F00L});
        public static final BitSet FOLLOW_46_in_ruleRegistro3362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchivo_in_entryRuleArchivo3398 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArchivo3408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleArchivo3445 = new BitSet(new long[]{0x0000000000000300L,0x0000000000001F00L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleArchivo3466 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleArchivo3478 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArchivo3499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerado_in_entryRuleEnumerado3535 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerado3545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnumerado3591 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleEnumerado3603 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleEnumerado3615 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEnumerado3637 = new BitSet(new long[]{0x0002000000800000L});
        public static final BitSet FOLLOW_23_in_ruleEnumerado3650 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEnumerado3671 = new BitSet(new long[]{0x0002000000800000L});
        public static final BitSet FOLLOW_49_in_ruleEnumerado3686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrango_in_entryRuleSubrango3722 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrango3732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoNumerico_in_ruleSubrango3779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoEnumerado_in_ruleSubrango3806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoNumerico_in_entryRuleSubrangoNumerico3841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrangoNumerico3851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoNumerico3897 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleSubrangoNumerico3909 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleSubrangoNumerico3926 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleSubrangoNumerico3943 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleSubrangoNumerico3960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoEnumerado_in_entryRuleSubrangoEnumerado4001 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrangoEnumerado4011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado4057 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleSubrangoEnumerado4069 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado4090 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleSubrangoEnumerado4102 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado4123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInicio_in_entryRuleInicio4159 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInicio4169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleInicio4206 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleInicio4227 = new BitSet(new long[]{0x0010000000000300L,0x0000000000001F00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio4249 = new BitSet(new long[]{0x0010000000000300L,0x0000000000001F00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio4270 = new BitSet(new long[]{0x0010000000000300L,0x0000000000001F00L});
        public static final BitSet FOLLOW_52_in_ruleInicio4285 = new BitSet(new long[]{0x49E0001FF2201F80L,0x0000000008006011L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio4307 = new BitSet(new long[]{0x49E0001FF2201F80L,0x0000000008006011L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio4328 = new BitSet(new long[]{0x49E0001FF2201F80L,0x0000000008006011L});
        public static final BitSet FOLLOW_53_in_ruleInicio4343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString4380 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString4391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString4431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString4457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable4502 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionVariable4512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable4558 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleDeclaracionVariable4570 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable4591 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_23_in_ruleDeclaracionVariable4604 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable4625 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia4663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionPropia4673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDeclaracionPropia4719 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleDeclaracionPropia4731 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia4752 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_23_in_ruleDeclaracionPropia4765 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia4786 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_entryRuleAsignacion4824 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacion4834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsignacion4880 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleAsignacion4892 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleAsignacion4913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_entryRuleEscribir4949 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEscribir4959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleEscribir4996 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleEscribir5008 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEscribir5029 = new BitSet(new long[]{0x0000001FF1801F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_23_in_ruleEscribir5043 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEscribir5064 = new BitSet(new long[]{0x0000001FF1801F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleEscribir5092 = new BitSet(new long[]{0x0000001FF1801F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_24_in_ruleEscribir5106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_entryRuleLeer5142 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeer5152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleLeer5189 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleLeer5201 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleLeer5222 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleLeer5234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_entryRuleSi5270 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSi5280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleSi5317 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleSi5338 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleSi5350 = new BitSet(new long[]{0x4DC0001FF2201F80L,0x00000000C8006011L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi5372 = new BitSet(new long[]{0x4DC0001FF2201F80L,0x00000000C8006011L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi5393 = new BitSet(new long[]{0x4DC0001FF2201F80L,0x00000000C8006011L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSi5417 = new BitSet(new long[]{0x0400000000000000L,0x0000000040000000L});
        public static final BitSet FOLLOW_ruleSino_in_ruleSi5439 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleSi5452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_entryRulemientras5488 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemientras5498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rulemientras5535 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulemientras5556 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_60_in_rulemientras5568 = new BitSet(new long[]{0x69C0001FF2201F80L,0x0000000008006011L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras5590 = new BitSet(new long[]{0x69C0001FF2201F80L,0x0000000008006011L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras5611 = new BitSet(new long[]{0x69C0001FF2201F80L,0x0000000008006011L});
        public static final BitSet FOLLOW_61_in_rulemientras5626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_entryRulerepetir5662 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulerepetir5672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rulerepetir5709 = new BitSet(new long[]{0xC9C0001FF2201F80L,0x0000000008006011L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir5731 = new BitSet(new long[]{0xC9C0001FF2201F80L,0x0000000008006011L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir5752 = new BitSet(new long[]{0xC9C0001FF2201F80L,0x0000000008006011L});
        public static final BitSet FOLLOW_63_in_rulerepetir5767 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulerepetir5788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_entryRuledesde5824 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuledesde5834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruledesde5871 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleAsignacion_in_ruledesde5892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruledesde5904 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruledesde5925 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_60_in_ruledesde5937 = new BitSet(new long[]{0x49C0001FF2201F80L,0x0000000008006015L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde5959 = new BitSet(new long[]{0x49C0001FF2201F80L,0x0000000008006015L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde5980 = new BitSet(new long[]{0x49C0001FF2201F80L,0x0000000008006015L});
        public static final BitSet FOLLOW_66_in_ruledesde5995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaso_in_entryRuleCaso6031 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCaso6041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleCaso6078 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleCaso6099 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleCaso6111 = new BitSet(new long[]{0x49C0001FF2201F82L,0x0000000088006011L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso6133 = new BitSet(new long[]{0x49C0001FF2201F82L,0x0000000088006011L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso6154 = new BitSet(new long[]{0x49C0001FF2201F82L,0x0000000088006011L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleCaso6178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_entryRulesegun6215 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesegun6225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_rulesegun6262 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulesegun6274 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_rulePrimaria_in_rulesegun6295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_rulesegun6307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000048L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun6329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000048L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun6350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000048L});
        public static final BitSet FOLLOW_70_in_rulesegun6365 = new BitSet(new long[]{0x49C0001FF2201F80L,0x0000000088006091L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun6387 = new BitSet(new long[]{0x49C0001FF2201F80L,0x0000000088006091L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun6408 = new BitSet(new long[]{0x49C0001FF2201F80L,0x0000000088006091L});
        public static final BitSet FOLLOW_ruleDevolver_in_rulesegun6432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_71_in_rulesegun6445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable6482 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoVariable6493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleTipoVariable6531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleTipoVariable6550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleTipoVariable6569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleTipoVariable6588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleTipoVariable6607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable6647 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable6657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable6712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_entryRulebooleano6749 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulebooleano6760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_rulebooleano6798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_rulebooleano6817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoOr_in_entryRulesignoOr6860 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoOr6871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_rulesignoOr6908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoAnd_in_entryRulesignoAnd6948 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoAnd6959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_rulesignoAnd6996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoIgualdad_in_entryRulesignoIgualdad7036 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoIgualdad7047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_rulesignoIgualdad7085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_rulesignoIgualdad7104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoComparacion_in_entryRulesignoComparacion7145 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoComparacion7156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_rulesignoComparacion7194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_rulesignoComparacion7213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_rulesignoComparacion7232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_rulesignoComparacion7251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoSuma_in_entryRulesignoSuma7292 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoSuma7303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_rulesignoSuma7340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoResta_in_entryRulesignoResta7380 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoResta7391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_rulesignoResta7428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoMultiplicacion_in_entryRulesignoMultiplicacion7468 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoMultiplicacion7479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_rulesignoMultiplicacion7516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoDivision_in_entryRulesignoDivision7556 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoDivision7567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_rulesignoDivision7604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_entryRuleoperacion7643 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperacion7653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_ruleoperacion7699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_entryRuleOr7733 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOr7743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnd_in_ruleOr7790 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
        public static final BitSet FOLLOW_rulesignoOr_in_ruleOr7820 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_ruleAnd_in_ruleOr7841 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
        public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd7879 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnd7889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIgualdad_in_ruleAnd7936 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
        public static final BitSet FOLLOW_rulesignoAnd_in_ruleAnd7966 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_ruleIgualdad_in_ruleAnd7987 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
        public static final BitSet FOLLOW_ruleIgualdad_in_entryRuleIgualdad8025 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIgualdad8035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparacion_in_ruleIgualdad8082 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
        public static final BitSet FOLLOW_rulesignoIgualdad_in_ruleIgualdad8112 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_ruleComparacion_in_ruleIgualdad8133 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
        public static final BitSet FOLLOW_ruleComparacion_in_entryRuleComparacion8171 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparacion8181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSumaResta_in_ruleComparacion8228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
        public static final BitSet FOLLOW_rulesignoComparacion_in_ruleComparacion8258 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_ruleSumaResta_in_ruleComparacion8279 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
        public static final BitSet FOLLOW_ruleSumaResta_in_entryRuleSumaResta8317 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSumaResta8327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta8374 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
        public static final BitSet FOLLOW_rulesignoSuma_in_ruleSumaResta8406 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_rulesignoResta_in_ruleSumaResta8444 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta8467 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivision_in_entryRuleMultiplicacionDivision8505 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicacionDivision8515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision8562 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
        public static final BitSet FOLLOW_rulesignoMultiplicacion_in_ruleMultiplicacionDivision8594 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_rulesignoDivision_in_ruleMultiplicacionDivision8632 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision8655 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_entryRulePrimaria8693 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaria8703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_rulePrimaria8741 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulePrimaria8763 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
        public static final BitSet FOLLOW_92_in_rulePrimaria8774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleINTEGER_in_rulePrimaria8812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rulePrimaria8846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAD_in_rulePrimaria8885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAR_in_rulePrimaria8924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_rulePrimaria8967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulePrimaria9005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulePrimaria9044 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_rulePrimaria9056 = new BitSet(new long[]{0x0000000000000380L});
        public static final BitSet FOLLOW_ruleEString_in_rulePrimaria9078 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleINTEGER_in_rulePrimaria9105 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_rulePrimaria9118 = new BitSet(new long[]{0x0000000000000380L});
        public static final BitSet FOLLOW_ruleEString_in_rulePrimaria9140 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleINTEGER_in_rulePrimaria9167 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_rulePrimaria9180 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_93_in_rulePrimaria9194 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_rulePrimaria9215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulePrimaria9256 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_rulePrimaria9268 = new BitSet(new long[]{0x0000000000000380L});
        public static final BitSet FOLLOW_ruleEString_in_rulePrimaria9290 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleINTEGER_in_rulePrimaria9317 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_rulePrimaria9330 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_93_in_rulePrimaria9344 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_rulePrimaria9365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulePrimaria9405 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_93_in_rulePrimaria9417 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_rulePrimaria9439 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_93_in_rulePrimaria9452 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_rulePrimaria9473 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_ruleEString_in_rulePrimaria9514 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulePrimaria9526 = new BitSet(new long[]{0x0000000001000300L});
        public static final BitSet FOLLOW_ruleEString_in_rulePrimaria9548 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_rulePrimaria9561 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleEString_in_rulePrimaria9582 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_24_in_rulePrimaria9598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_rulePrimaria9636 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulePrimaria9648 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleEString_in_rulePrimaria9670 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_rulePrimaria9683 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleEString_in_rulePrimaria9704 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_24_in_rulePrimaria9719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSino_in_entryRuleSino9756 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSino9766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_94_in_ruleSino9812 = new BitSet(new long[]{0x49C0001FF2201F82L,0x0000000088006011L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino9834 = new BitSet(new long[]{0x49C0001FF2201F82L,0x0000000088006011L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino9855 = new BitSet(new long[]{0x49C0001FF2201F82L,0x0000000088006011L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSino9879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDevolver_in_entryRuleDevolver9916 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDevolver9926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_95_in_ruleDevolver9972 = new BitSet(new long[]{0x0000001FF0001F80L,0x0000000008006000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleDevolver9993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion10031 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametroFuncion10041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_ruleParametroFuncion10087 = new BitSet(new long[]{0x0000000000000300L,0x0000000000001F00L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleParametroFuncion10108 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleParametroFuncion10120 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleParametroFuncion10141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_entryRuleFuncion10177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncion10187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleFuncion10233 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_96_in_ruleFuncion10245 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFuncion10266 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleFuncion10278 = new BitSet(new long[]{0x0000000001000000L,0x0000007000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion10300 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleFuncion10313 = new BitSet(new long[]{0x0000000000000000L,0x0000007000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion10334 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_24_in_ruleFuncion10350 = new BitSet(new long[]{0x00000000000E0000L});
        public static final BitSet FOLLOW_17_in_ruleFuncion10363 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleFuncion10378 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFuncion10392 = new BitSet(new long[]{0x0010000000000300L,0x0000000000001F00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion10414 = new BitSet(new long[]{0x0010000000000300L,0x0000000000001F00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion10435 = new BitSet(new long[]{0x0010000000000300L,0x0000000000001F00L});
        public static final BitSet FOLLOW_52_in_ruleFuncion10450 = new BitSet(new long[]{0x49C0001FF2201F80L,0x0000000088006011L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion10472 = new BitSet(new long[]{0x49C0001FF2201F80L,0x0000000088006011L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion10493 = new BitSet(new long[]{0x49C0001FF2201F80L,0x0000000088006011L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleFuncion10517 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
        public static final BitSet FOLLOW_97_in_ruleFuncion10529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento10565 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcedimiento10575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_98_in_ruleProcedimiento10612 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcedimiento10633 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleProcedimiento10645 = new BitSet(new long[]{0x0000000001000000L,0x0000007000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento10667 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleProcedimiento10680 = new BitSet(new long[]{0x0000000000000000L,0x0000007000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento10701 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_24_in_ruleProcedimiento10717 = new BitSet(new long[]{0x00000000000E0000L});
        public static final BitSet FOLLOW_17_in_ruleProcedimiento10730 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleProcedimiento10745 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleProcedimiento10759 = new BitSet(new long[]{0x0010000000000300L,0x0000000000001F00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento10781 = new BitSet(new long[]{0x0010000000000300L,0x0000000000001F00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento10802 = new BitSet(new long[]{0x0010000000000300L,0x0000000000001F00L});
        public static final BitSet FOLLOW_52_in_ruleProcedimiento10817 = new BitSet(new long[]{0x49C0001FF2201F80L,0x0000000808006011L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento10839 = new BitSet(new long[]{0x49C0001FF2201F80L,0x0000000808006011L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento10860 = new BitSet(new long[]{0x49C0001FF2201F80L,0x0000000808006011L});
        public static final BitSet FOLLOW_99_in_ruleProcedimiento10875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso10912 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoPaso10923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_100_in_ruleTipoPaso10961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_101_in_ruleTipoPaso10980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_102_in_ruleTipoPaso10999 = new BitSet(new long[]{0x0000000000000002L});
    }


}