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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CAR", "RULE_STRING", "RULE_ID", "RULE_MAT", "RULE_CAD", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'const'", "'tipo'", "'#'", "'('", "','", "')'", "'cos'", "'cuadrado'", "'exp'", "'ln'", "'log'", "'sen'", "'sqrt'", "'longitud'", "'concatena'", "'['", "']['", "']'", "'.'", "'='", "'vector'", "' ['", "'] '", "'de '", "' : '", "'matriz'", "'registro:'", "'fin_registro'", "'archivo de '", "':'", "'{'", "'}'", "'..'", "'var'", "'inicio'", "'fin_inicio'", "'escribir'", "'leer'", "'si'", "'entonces'", "'fin_si'", "'mientras'", "'hacer'", "'fin_mientras'", "'repetir'", "'hasta_que'", "'desde'", "'hasta'", "'fin_desde'", "'segun_sea'", "'en_otro_caso:'", "'fin_segun'", "'entero'", "'caracter'", "'real'", "'logico'", "'cadena'", "'-'", "'E'", "'e'", "'verdadero'", "'falso'", "'+'", "'*'", "'/'", "'<'", "'>'", "'>='", "'<='", "'y'", "'o'", "'=='", "'!='", "'sino'", "'devolver'", "'++'", "'--'", "'no'", "'funcion'", "'fin_funcion'", "'procedimiento'", "'fin_procedimiento'", "'E/S'", "'S'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
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
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_MAT=7;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
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
    public static final int RULE_CAR=4;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int RULE_CAD=8;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=9;
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleCodigo returns [EObject current=null] : ( ( ( (lv_comentarios_0_0= ruleComentario ) ) ( (lv_comentarios_1_0= ruleComentario ) )* )? (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )? (otherlv_5= 'tipo' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )? ( ( (lv_funcion_8_0= ruleSubproceso ) ) ( (lv_funcion_9_0= ruleSubproceso ) )* )? ( (lv_tiene_10_0= ruleInicio ) ) ) ;
    public final EObject ruleCodigo() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_comentarios_0_0 = null;

        EObject lv_comentarios_1_0 = null;

        EObject lv_constantes_3_0 = null;

        EObject lv_constantes_4_0 = null;

        EObject lv_tipocomplejo_6_0 = null;

        EObject lv_tipocomplejo_7_0 = null;

        EObject lv_funcion_8_0 = null;

        EObject lv_funcion_9_0 = null;

        EObject lv_tiene_10_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( ( ( (lv_comentarios_0_0= ruleComentario ) ) ( (lv_comentarios_1_0= ruleComentario ) )* )? (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )? (otherlv_5= 'tipo' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )? ( ( (lv_funcion_8_0= ruleSubproceso ) ) ( (lv_funcion_9_0= ruleSubproceso ) )* )? ( (lv_tiene_10_0= ruleInicio ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( ( ( (lv_comentarios_0_0= ruleComentario ) ) ( (lv_comentarios_1_0= ruleComentario ) )* )? (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )? (otherlv_5= 'tipo' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )? ( ( (lv_funcion_8_0= ruleSubproceso ) ) ( (lv_funcion_9_0= ruleSubproceso ) )* )? ( (lv_tiene_10_0= ruleInicio ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( ( ( (lv_comentarios_0_0= ruleComentario ) ) ( (lv_comentarios_1_0= ruleComentario ) )* )? (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )? (otherlv_5= 'tipo' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )? ( ( (lv_funcion_8_0= ruleSubproceso ) ) ( (lv_funcion_9_0= ruleSubproceso ) )* )? ( (lv_tiene_10_0= ruleInicio ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: ( ( (lv_comentarios_0_0= ruleComentario ) ) ( (lv_comentarios_1_0= ruleComentario ) )* )? (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )? (otherlv_5= 'tipo' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )? ( ( (lv_funcion_8_0= ruleSubproceso ) ) ( (lv_funcion_9_0= ruleSubproceso ) )* )? ( (lv_tiene_10_0= ruleInicio ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: ( ( (lv_comentarios_0_0= ruleComentario ) ) ( (lv_comentarios_1_0= ruleComentario ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:3: ( (lv_comentarios_0_0= ruleComentario ) ) ( (lv_comentarios_1_0= ruleComentario ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:3: ( (lv_comentarios_0_0= ruleComentario ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_comentarios_0_0= ruleComentario )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_comentarios_0_0= ruleComentario )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:3: lv_comentarios_0_0= ruleComentario
                    {
                     
                    	        newCompositeNode(grammarAccess.getCodigoAccess().getComentariosComentarioParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComentario_in_ruleCodigo132);
                    lv_comentarios_0_0=ruleComentario();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                    	        }
                           		add(
                           			current, 
                           			"comentarios",
                            		lv_comentarios_0_0, 
                            		"Comentario");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:98:2: ( (lv_comentarios_1_0= ruleComentario ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:99:1: (lv_comentarios_1_0= ruleComentario )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:99:1: (lv_comentarios_1_0= ruleComentario )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:100:3: lv_comentarios_1_0= ruleComentario
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCodigoAccess().getComentariosComentarioParserRuleCall_0_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleComentario_in_ruleCodigo153);
                    	    lv_comentarios_1_0=ruleComentario();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"comentarios",
                    	            		lv_comentarios_1_0, 
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:116:5: (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:116:7: otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )?
                    {
                    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCodigo169); 

                        	newLeafNode(otherlv_2, grammarAccess.getCodigoAccess().getConstKeyword_1_0());
                        
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:120:1: ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:120:2: ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )*
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:120:2: ( (lv_constantes_3_0= ruleConstantes ) )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:121:1: (lv_constantes_3_0= ruleConstantes )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:121:1: (lv_constantes_3_0= ruleConstantes )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:122:3: lv_constantes_3_0= ruleConstantes
                            {
                             
                            	        newCompositeNode(grammarAccess.getCodigoAccess().getConstantesConstantesParserRuleCall_1_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_ruleCodigo191);
                            lv_constantes_3_0=ruleConstantes();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"constantes",
                                    		lv_constantes_3_0, 
                                    		"Constantes");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:138:2: ( (lv_constantes_4_0= ruleConstantes ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:139:1: (lv_constantes_4_0= ruleConstantes )
                            	    {
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:139:1: (lv_constantes_4_0= ruleConstantes )
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:140:3: lv_constantes_4_0= ruleConstantes
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCodigoAccess().getConstantesConstantesParserRuleCall_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_ruleCodigo212);
                            	    lv_constantes_4_0=ruleConstantes();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"constantes",
                            	            		lv_constantes_4_0, 
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:156:7: (otherlv_5= 'tipo' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:156:9: otherlv_5= 'tipo' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )?
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCodigo230); 

                        	newLeafNode(otherlv_5, grammarAccess.getCodigoAccess().getTipoKeyword_2_0());
                        
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:160:1: ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||LA7_0==34||(LA7_0>=39 && LA7_0<=40)||LA7_0==42) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:160:2: ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )*
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:160:2: ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:161:1: (lv_tipocomplejo_6_0= ruleTipoComplejo )
                            {
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:161:1: (lv_tipocomplejo_6_0= ruleTipoComplejo )
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:162:3: lv_tipocomplejo_6_0= ruleTipoComplejo
                            {
                             
                            	        newCompositeNode(grammarAccess.getCodigoAccess().getTipocomplejoTipoComplejoParserRuleCall_2_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_ruleCodigo252);
                            lv_tipocomplejo_6_0=ruleTipoComplejo();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"tipocomplejo",
                                    		lv_tipocomplejo_6_0, 
                                    		"TipoComplejo");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:178:2: ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)||LA6_0==34||(LA6_0>=39 && LA6_0<=40)||LA6_0==42) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:1: (lv_tipocomplejo_7_0= ruleTipoComplejo )
                            	    {
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:1: (lv_tipocomplejo_7_0= ruleTipoComplejo )
                            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:180:3: lv_tipocomplejo_7_0= ruleTipoComplejo
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCodigoAccess().getTipocomplejoTipoComplejoParserRuleCall_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_ruleCodigo273);
                            	    lv_tipocomplejo_7_0=ruleTipoComplejo();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"tipocomplejo",
                            	            		lv_tipocomplejo_7_0, 
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:196:7: ( ( (lv_funcion_8_0= ruleSubproceso ) ) ( (lv_funcion_9_0= ruleSubproceso ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=66 && LA10_0<=70)||LA10_0==94) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:196:8: ( (lv_funcion_8_0= ruleSubproceso ) ) ( (lv_funcion_9_0= ruleSubproceso ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:196:8: ( (lv_funcion_8_0= ruleSubproceso ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:197:1: (lv_funcion_8_0= ruleSubproceso )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:197:1: (lv_funcion_8_0= ruleSubproceso )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:198:3: lv_funcion_8_0= ruleSubproceso
                    {
                     
                    	        newCompositeNode(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_ruleCodigo300);
                    lv_funcion_8_0=ruleSubproceso();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                    	        }
                           		add(
                           			current, 
                           			"funcion",
                            		lv_funcion_8_0, 
                            		"Subproceso");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:214:2: ( (lv_funcion_9_0= ruleSubproceso ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=66 && LA9_0<=70)||LA9_0==94) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:215:1: (lv_funcion_9_0= ruleSubproceso )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:215:1: (lv_funcion_9_0= ruleSubproceso )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:216:3: lv_funcion_9_0= ruleSubproceso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_ruleCodigo321);
                    	    lv_funcion_9_0=ruleSubproceso();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"funcion",
                    	            		lv_funcion_9_0, 
                    	            		"Subproceso");
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:232:5: ( (lv_tiene_10_0= ruleInicio ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:233:1: (lv_tiene_10_0= ruleInicio )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:233:1: (lv_tiene_10_0= ruleInicio )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:234:3: lv_tiene_10_0= ruleInicio
            {
             
            	        newCompositeNode(grammarAccess.getCodigoAccess().getTieneInicioParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_ruleCodigo345);
            lv_tiene_10_0=ruleInicio();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCodigoRule());
            	        }
                   		set(
                   			current, 
                   			"tiene",
                    		lv_tiene_10_0, 
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


    // $ANTLR start "entryRuleComentario"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:258:1: entryRuleComentario returns [EObject current=null] : iv_ruleComentario= ruleComentario EOF ;
    public final EObject entryRuleComentario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComentario = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:259:2: (iv_ruleComentario= ruleComentario EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:260:2: iv_ruleComentario= ruleComentario EOF
            {
             newCompositeNode(grammarAccess.getComentarioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComentario_in_entryRuleComentario381);
            iv_ruleComentario=ruleComentario();

            state._fsp--;

             current =iv_ruleComentario; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComentario391); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:267:1: ruleComentario returns [EObject current=null] : (otherlv_0= '#' ( (lv_mensaje_1_0= ruleEString ) ) ) ;
    public final EObject ruleComentario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_mensaje_1_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:270:28: ( (otherlv_0= '#' ( (lv_mensaje_1_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:271:1: (otherlv_0= '#' ( (lv_mensaje_1_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:271:1: (otherlv_0= '#' ( (lv_mensaje_1_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:271:3: otherlv_0= '#' ( (lv_mensaje_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleComentario428); 

                	newLeafNode(otherlv_0, grammarAccess.getComentarioAccess().getNumberSignKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:275:1: ( (lv_mensaje_1_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:276:1: (lv_mensaje_1_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:276:1: (lv_mensaje_1_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:277:3: lv_mensaje_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getComentarioAccess().getMensajeEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComentario449);
            lv_mensaje_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComentarioRule());
            	        }
                   		set(
                   			current, 
                   			"mensaje",
                    		lv_mensaje_1_0, 
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
    // $ANTLR end "ruleComentario"


    // $ANTLR start "entryRuleTipoComplejo"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:301:1: entryRuleTipoComplejo returns [EObject current=null] : iv_ruleTipoComplejo= ruleTipoComplejo EOF ;
    public final EObject entryRuleTipoComplejo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoComplejo = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:302:2: (iv_ruleTipoComplejo= ruleTipoComplejo EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:303:2: iv_ruleTipoComplejo= ruleTipoComplejo EOF
            {
             newCompositeNode(grammarAccess.getTipoComplejoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_entryRuleTipoComplejo485);
            iv_ruleTipoComplejo=ruleTipoComplejo();

            state._fsp--;

             current =iv_ruleTipoComplejo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoComplejo495); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:310:1: ruleTipoComplejo returns [EObject current=null] : (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:313:28: ( (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:314:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:314:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )
            int alt11=6;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:315:5: this_Vector_0= ruleVector
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getVectorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVector_in_ruleTipoComplejo542);
                    this_Vector_0=ruleVector();

                    state._fsp--;

                     
                            current = this_Vector_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:325:5: this_Matriz_1= ruleMatriz
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getMatrizParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_ruleTipoComplejo569);
                    this_Matriz_1=ruleMatriz();

                    state._fsp--;

                     
                            current = this_Matriz_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:335:5: this_Registro_2= ruleRegistro
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getRegistroParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRegistro_in_ruleTipoComplejo596);
                    this_Registro_2=ruleRegistro();

                    state._fsp--;

                     
                            current = this_Registro_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:345:5: this_Archivo_3= ruleArchivo
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getArchivoParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleArchivo_in_ruleTipoComplejo623);
                    this_Archivo_3=ruleArchivo();

                    state._fsp--;

                     
                            current = this_Archivo_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:355:5: this_Enumerado_4= ruleEnumerado
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getEnumeradoParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerado_in_ruleTipoComplejo650);
                    this_Enumerado_4=ruleEnumerado();

                    state._fsp--;

                     
                            current = this_Enumerado_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:365:5: this_Subrango_5= ruleSubrango
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getSubrangoParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrango_in_ruleTipoComplejo677);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:381:1: entryRuleSubproceso returns [EObject current=null] : iv_ruleSubproceso= ruleSubproceso EOF ;
    public final EObject entryRuleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubproceso = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:382:2: (iv_ruleSubproceso= ruleSubproceso EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:383:2: iv_ruleSubproceso= ruleSubproceso EOF
            {
             newCompositeNode(grammarAccess.getSubprocesoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_entryRuleSubproceso712);
            iv_ruleSubproceso=ruleSubproceso();

            state._fsp--;

             current =iv_ruleSubproceso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubproceso722); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:390:1: ruleSubproceso returns [EObject current=null] : (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) ;
    public final EObject ruleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject this_Funcion_0 = null;

        EObject this_Procedimiento_1 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:393:28: ( (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:394:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:394:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=66 && LA12_0<=70)) ) {
                alt12=1;
            }
            else if ( (LA12_0==94) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:395:5: this_Funcion_0= ruleFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getSubprocesoAccess().getFuncionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_ruleSubproceso769);
                    this_Funcion_0=ruleFuncion();

                    state._fsp--;

                     
                            current = this_Funcion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:405:5: this_Procedimiento_1= ruleProcedimiento
                    {
                     
                            newCompositeNode(grammarAccess.getSubprocesoAccess().getProcedimientoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_ruleSubproceso796);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:421:1: entryRuleSentencias returns [EObject current=null] : iv_ruleSentencias= ruleSentencias EOF ;
    public final EObject entryRuleSentencias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentencias = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:422:2: (iv_ruleSentencias= ruleSentencias EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:423:2: iv_ruleSentencias= ruleSentencias EOF
            {
             newCompositeNode(grammarAccess.getSentenciasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_entryRuleSentencias831);
            iv_ruleSentencias=ruleSentencias();

            state._fsp--;

             current =iv_ruleSentencias; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentencias841); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:430:1: ruleSentencias returns [EObject current=null] : (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_Asignacion_1= ruleAsignacion | this_Escribir_2= ruleEscribir | this_Leer_3= ruleLeer | this_incremento_4= ruleincremento | this_Bloque_5= ruleBloque | this_ValorComplejo_6= ruleValorComplejo ) ;
    public final EObject ruleSentencias() throws RecognitionException {
        EObject current = null;

        EObject this_LlamadaFuncion_0 = null;

        EObject this_Asignacion_1 = null;

        EObject this_Escribir_2 = null;

        EObject this_Leer_3 = null;

        EObject this_incremento_4 = null;

        EObject this_Bloque_5 = null;

        EObject this_ValorComplejo_6 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:433:28: ( (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_Asignacion_1= ruleAsignacion | this_Escribir_2= ruleEscribir | this_Leer_3= ruleLeer | this_incremento_4= ruleincremento | this_Bloque_5= ruleBloque | this_ValorComplejo_6= ruleValorComplejo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:434:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_Asignacion_1= ruleAsignacion | this_Escribir_2= ruleEscribir | this_Leer_3= ruleLeer | this_incremento_4= ruleincremento | this_Bloque_5= ruleBloque | this_ValorComplejo_6= ruleValorComplejo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:434:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_Asignacion_1= ruleAsignacion | this_Escribir_2= ruleEscribir | this_Leer_3= ruleLeer | this_incremento_4= ruleincremento | this_Bloque_5= ruleBloque | this_ValorComplejo_6= ruleValorComplejo )
            int alt13=7;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:435:5: this_LlamadaFuncion_0= ruleLlamadaFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getLlamadaFuncionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_ruleSentencias888);
                    this_LlamadaFuncion_0=ruleLlamadaFuncion();

                    state._fsp--;

                     
                            current = this_LlamadaFuncion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:445:5: this_Asignacion_1= ruleAsignacion
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getAsignacionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_ruleSentencias915);
                    this_Asignacion_1=ruleAsignacion();

                    state._fsp--;

                     
                            current = this_Asignacion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:455:5: this_Escribir_2= ruleEscribir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getEscribirParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_ruleSentencias942);
                    this_Escribir_2=ruleEscribir();

                    state._fsp--;

                     
                            current = this_Escribir_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:465:5: this_Leer_3= ruleLeer
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getLeerParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLeer_in_ruleSentencias969);
                    this_Leer_3=ruleLeer();

                    state._fsp--;

                     
                            current = this_Leer_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:475:5: this_incremento_4= ruleincremento
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getIncrementoParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleincremento_in_ruleSentencias996);
                    this_incremento_4=ruleincremento();

                    state._fsp--;

                     
                            current = this_incremento_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:485:5: this_Bloque_5= ruleBloque
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getBloqueParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBloque_in_ruleSentencias1023);
                    this_Bloque_5=ruleBloque();

                    state._fsp--;

                     
                            current = this_Bloque_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:495:5: this_ValorComplejo_6= ruleValorComplejo
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getValorComplejoParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorComplejo_in_ruleSentencias1050);
                    this_ValorComplejo_6=ruleValorComplejo();

                    state._fsp--;

                     
                            current = this_ValorComplejo_6; 
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:511:1: entryRuleBloque returns [EObject current=null] : iv_ruleBloque= ruleBloque EOF ;
    public final EObject entryRuleBloque() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBloque = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:512:2: (iv_ruleBloque= ruleBloque EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:513:2: iv_ruleBloque= ruleBloque EOF
            {
             newCompositeNode(grammarAccess.getBloqueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBloque_in_entryRuleBloque1085);
            iv_ruleBloque=ruleBloque();

            state._fsp--;

             current =iv_ruleBloque; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBloque1095); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:520:1: ruleBloque returns [EObject current=null] : (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) ;
    public final EObject ruleBloque() throws RecognitionException {
        EObject current = null;

        EObject this_Si_0 = null;

        EObject this_mientras_1 = null;

        EObject this_repetir_2 = null;

        EObject this_desde_3 = null;

        EObject this_segun_4 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:523:28: ( (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:524:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:524:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt14=1;
                }
                break;
            case 55:
                {
                alt14=2;
                }
                break;
            case 58:
                {
                alt14=3;
                }
                break;
            case 60:
                {
                alt14=4;
                }
                break;
            case 63:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:525:5: this_Si_0= ruleSi
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSiParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSi_in_ruleBloque1142);
                    this_Si_0=ruleSi();

                    state._fsp--;

                     
                            current = this_Si_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:535:5: this_mientras_1= rulemientras
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getMientrasParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemientras_in_ruleBloque1169);
                    this_mientras_1=rulemientras();

                    state._fsp--;

                     
                            current = this_mientras_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:5: this_repetir_2= rulerepetir
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getRepetirParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulerepetir_in_ruleBloque1196);
                    this_repetir_2=rulerepetir();

                    state._fsp--;

                     
                            current = this_repetir_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:555:5: this_desde_3= ruledesde
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getDesdeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruledesde_in_ruleBloque1223);
                    this_desde_3=ruledesde();

                    state._fsp--;

                     
                            current = this_desde_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:565:5: this_segun_4= rulesegun
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSegunParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulesegun_in_ruleBloque1250);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:581:1: entryRuleDeclaracion returns [EObject current=null] : iv_ruleDeclaracion= ruleDeclaracion EOF ;
    public final EObject entryRuleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:582:2: (iv_ruleDeclaracion= ruleDeclaracion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:583:2: iv_ruleDeclaracion= ruleDeclaracion EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_entryRuleDeclaracion1285);
            iv_ruleDeclaracion=ruleDeclaracion();

            state._fsp--;

             current =iv_ruleDeclaracion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracion1295); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:590:1: ruleDeclaracion returns [EObject current=null] : (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) ;
    public final EObject ruleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject this_DeclaracionVariable_0 = null;

        EObject this_DeclaracionPropia_1 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:593:28: ( (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=66 && LA15_0<=70)) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:595:5: this_DeclaracionVariable_0= ruleDeclaracionVariable
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionVariableParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_ruleDeclaracion1342);
                    this_DeclaracionVariable_0=ruleDeclaracionVariable();

                    state._fsp--;

                     
                            current = this_DeclaracionVariable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:605:5: this_DeclaracionPropia_1= ruleDeclaracionPropia
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionPropiaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_ruleDeclaracion1369);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:621:1: entryRuleInternas returns [EObject current=null] : iv_ruleInternas= ruleInternas EOF ;
    public final EObject entryRuleInternas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternas = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:622:2: (iv_ruleInternas= ruleInternas EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:623:2: iv_ruleInternas= ruleInternas EOF
            {
             newCompositeNode(grammarAccess.getInternasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInternas_in_entryRuleInternas1404);
            iv_ruleInternas=ruleInternas();

            state._fsp--;

             current =iv_ruleInternas; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInternas1414); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:630:1: ruleInternas returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleNombreInterna ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* ) otherlv_5= ')' ) ;
    public final EObject ruleInternas() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        EObject lv_operador_2_0 = null;

        EObject lv_operador_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:633:28: ( ( ( (lv_nombre_0_0= ruleNombreInterna ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* ) otherlv_5= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:634:1: ( ( (lv_nombre_0_0= ruleNombreInterna ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* ) otherlv_5= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:634:1: ( ( (lv_nombre_0_0= ruleNombreInterna ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* ) otherlv_5= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:634:2: ( (lv_nombre_0_0= ruleNombreInterna ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* ) otherlv_5= ')'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:634:2: ( (lv_nombre_0_0= ruleNombreInterna ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:635:1: (lv_nombre_0_0= ruleNombreInterna )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:635:1: (lv_nombre_0_0= ruleNombreInterna )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:636:3: lv_nombre_0_0= ruleNombreInterna
            {
             
            	        newCompositeNode(grammarAccess.getInternasAccess().getNombreNombreInternaParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_ruleInternas1460);
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

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInternas1472); 

                	newLeafNode(otherlv_1, grammarAccess.getInternasAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:656:1: ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:656:2: ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:656:2: ( (lv_operador_2_0= ruleOperador ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:657:1: (lv_operador_2_0= ruleOperador )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:657:1: (lv_operador_2_0= ruleOperador )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:658:3: lv_operador_2_0= ruleOperador
            {
             
            	        newCompositeNode(grammarAccess.getInternasAccess().getOperadorOperadorParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleInternas1494);
            lv_operador_2_0=ruleOperador();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInternasRule());
            	        }
                   		add(
                   			current, 
                   			"operador",
                    		lv_operador_2_0, 
                    		"Operador");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:674:2: (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:674:4: otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleInternas1507); 

            	        	newLeafNode(otherlv_3, grammarAccess.getInternasAccess().getCommaKeyword_2_1_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:678:1: ( (lv_operador_4_0= ruleOperador ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:679:1: (lv_operador_4_0= ruleOperador )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:679:1: (lv_operador_4_0= ruleOperador )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:680:3: lv_operador_4_0= ruleOperador
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInternasAccess().getOperadorOperadorParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleInternas1528);
            	    lv_operador_4_0=ruleOperador();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInternasRule());
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
            	    break loop16;
                }
            } while (true);


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleInternas1543); 

                	newLeafNode(otherlv_5, grammarAccess.getInternasAccess().getRightParenthesisKeyword_3());
                

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:708:1: entryRuleNombreInterna returns [String current=null] : iv_ruleNombreInterna= ruleNombreInterna EOF ;
    public final String entryRuleNombreInterna() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNombreInterna = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:709:2: (iv_ruleNombreInterna= ruleNombreInterna EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:710:2: iv_ruleNombreInterna= ruleNombreInterna EOF
            {
             newCompositeNode(grammarAccess.getNombreInternaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna1580);
            iv_ruleNombreInterna=ruleNombreInterna();

            state._fsp--;

             current =iv_ruleNombreInterna.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNombreInterna1591); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:717:1: ruleNombreInterna returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' | kw= 'concatena' ) ;
    public final AntlrDatatypeRuleToken ruleNombreInterna() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:720:28: ( (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' | kw= 'concatena' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:721:1: (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' | kw= 'concatena' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:721:1: (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' | kw= 'concatena' )
            int alt17=9;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt17=1;
                }
                break;
            case 21:
                {
                alt17=2;
                }
                break;
            case 22:
                {
                alt17=3;
                }
                break;
            case 23:
                {
                alt17=4;
                }
                break;
            case 24:
                {
                alt17=5;
                }
                break;
            case 25:
                {
                alt17=6;
                }
                break;
            case 26:
                {
                alt17=7;
                }
                break;
            case 27:
                {
                alt17=8;
                }
                break;
            case 28:
                {
                alt17=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:722:2: kw= 'cos'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNombreInterna1629); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCosKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:729:2: kw= 'cuadrado'
                    {
                    kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNombreInterna1648); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCuadradoKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:736:2: kw= 'exp'
                    {
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleNombreInterna1667); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getExpKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:743:2: kw= 'ln'
                    {
                    kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNombreInterna1686); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLnKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:750:2: kw= 'log'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNombreInterna1705); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLogKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:757:2: kw= 'sen'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNombreInterna1724); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSenKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:764:2: kw= 'sqrt'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNombreInterna1743); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSqrtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:771:2: kw= 'longitud'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleNombreInterna1762); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLongitudKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:778:2: kw= 'concatena'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleNombreInterna1781); 

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


    // $ANTLR start "entryRuleOperador"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:791:1: entryRuleOperador returns [EObject current=null] : iv_ruleOperador= ruleOperador EOF ;
    public final EObject entryRuleOperador() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperador = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:792:2: (iv_ruleOperador= ruleOperador EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:793:2: iv_ruleOperador= ruleOperador EOF
            {
             newCompositeNode(grammarAccess.getOperadorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_entryRuleOperador1821);
            iv_ruleOperador=ruleOperador();

            state._fsp--;

             current =iv_ruleOperador; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperador1831); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:800:1: ruleOperador returns [EObject current=null] : (this_VariableID_0= ruleVariableID | this_ConstCadena_1= ruleConstCadena | this_Caracter_2= ruleCaracter | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_ValorBooleano_5= ruleValorBooleano ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:803:28: ( (this_VariableID_0= ruleVariableID | this_ConstCadena_1= ruleConstCadena | this_Caracter_2= ruleCaracter | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_ValorBooleano_5= ruleValorBooleano ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:804:1: (this_VariableID_0= ruleVariableID | this_ConstCadena_1= ruleConstCadena | this_Caracter_2= ruleCaracter | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_ValorBooleano_5= ruleValorBooleano )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:804:1: (this_VariableID_0= ruleVariableID | this_ConstCadena_1= ruleConstCadena | this_Caracter_2= ruleCaracter | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_ValorBooleano_5= ruleValorBooleano )
            int alt18=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case RULE_CAD:
                {
                alt18=2;
                }
                break;
            case RULE_CAR:
                {
                alt18=3;
                }
                break;
            case 71:
                {
                int LA18_4 = input.LA(2);

                if ( (LA18_4==RULE_INT) ) {
                    int LA18_5 = input.LA(3);

                    if ( (LA18_5==EOF||(LA18_5>=18 && LA18_5<=19)||(LA18_5>=30 && LA18_5<=31)||LA18_5==43) ) {
                        alt18=4;
                    }
                    else if ( (LA18_5==32) ) {
                        alt18=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA18_4==32) ) {
                    alt18=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA18_5 = input.LA(2);

                if ( (LA18_5==EOF||(LA18_5>=18 && LA18_5<=19)||(LA18_5>=30 && LA18_5<=31)||LA18_5==43) ) {
                    alt18=4;
                }
                else if ( (LA18_5==32) ) {
                    alt18=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 5, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                alt18=5;
                }
                break;
            case 74:
            case 75:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:805:5: this_VariableID_0= ruleVariableID
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getVariableIDParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleOperador1878);
                    this_VariableID_0=ruleVariableID();

                    state._fsp--;

                     
                            current = this_VariableID_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:815:5: this_ConstCadena_1= ruleConstCadena
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getConstCadenaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_ruleOperador1905);
                    this_ConstCadena_1=ruleConstCadena();

                    state._fsp--;

                     
                            current = this_ConstCadena_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:825:5: this_Caracter_2= ruleCaracter
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getCaracterParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_ruleOperador1932);
                    this_Caracter_2=ruleCaracter();

                    state._fsp--;

                     
                            current = this_Caracter_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:835:5: this_NumeroEntero_3= ruleNumeroEntero
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getNumeroEnteroParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_ruleOperador1959);
                    this_NumeroEntero_3=ruleNumeroEntero();

                    state._fsp--;

                     
                            current = this_NumeroEntero_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:845:5: this_NumeroDecimal_4= ruleNumeroDecimal
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getNumeroDecimalParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_ruleOperador1986);
                    this_NumeroDecimal_4=ruleNumeroDecimal();

                    state._fsp--;

                     
                            current = this_NumeroDecimal_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:855:5: this_ValorBooleano_5= ruleValorBooleano
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getValorBooleanoParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_ruleOperador2013);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:871:1: entryRuleCaracter returns [EObject current=null] : iv_ruleCaracter= ruleCaracter EOF ;
    public final EObject entryRuleCaracter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaracter = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:872:2: (iv_ruleCaracter= ruleCaracter EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:873:2: iv_ruleCaracter= ruleCaracter EOF
            {
             newCompositeNode(grammarAccess.getCaracterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_entryRuleCaracter2048);
            iv_ruleCaracter=ruleCaracter();

            state._fsp--;

             current =iv_ruleCaracter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCaracter2058); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:880:1: ruleCaracter returns [EObject current=null] : ( (lv_contenido_0_0= RULE_CAR ) ) ;
    public final EObject ruleCaracter() throws RecognitionException {
        EObject current = null;

        Token lv_contenido_0_0=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:883:28: ( ( (lv_contenido_0_0= RULE_CAR ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:884:1: ( (lv_contenido_0_0= RULE_CAR ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:884:1: ( (lv_contenido_0_0= RULE_CAR ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:885:1: (lv_contenido_0_0= RULE_CAR )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:885:1: (lv_contenido_0_0= RULE_CAR )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:886:3: lv_contenido_0_0= RULE_CAR
            {
            lv_contenido_0_0=(Token)match(input,RULE_CAR,FollowSets000.FOLLOW_RULE_CAR_in_ruleCaracter2099); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:910:1: entryRulevalor returns [EObject current=null] : iv_rulevalor= rulevalor EOF ;
    public final EObject entryRulevalor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalor = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:911:2: (iv_rulevalor= rulevalor EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:912:2: iv_rulevalor= rulevalor EOF
            {
             newCompositeNode(grammarAccess.getValorRule()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_entryRulevalor2139);
            iv_rulevalor=rulevalor();

            state._fsp--;

             current =iv_rulevalor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulevalor2149); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:919:1: rulevalor returns [EObject current=null] : (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria | this_ValorComplejo_10= ruleValorComplejo ) ;
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

        EObject this_ValorComplejo_10 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:922:28: ( (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria | this_ValorComplejo_10= ruleValorComplejo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:923:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria | this_ValorComplejo_10= ruleValorComplejo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:923:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria | this_ValorComplejo_10= ruleValorComplejo )
            int alt19=11;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:924:5: this_LlamadaFuncion_0= ruleLlamadaFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getLlamadaFuncionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_rulevalor2196);
                    this_LlamadaFuncion_0=ruleLlamadaFuncion();

                    state._fsp--;

                     
                            current = this_LlamadaFuncion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:934:5: this_VariableID_1= ruleVariableID
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getVariableIDParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rulevalor2223);
                    this_VariableID_1=ruleVariableID();

                    state._fsp--;

                     
                            current = this_VariableID_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:944:5: this_ConstCadena_2= ruleConstCadena
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getConstCadenaParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_rulevalor2250);
                    this_ConstCadena_2=ruleConstCadena();

                    state._fsp--;

                     
                            current = this_ConstCadena_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:954:5: this_NumeroEntero_3= ruleNumeroEntero
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getNumeroEnteroParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_rulevalor2277);
                    this_NumeroEntero_3=ruleNumeroEntero();

                    state._fsp--;

                     
                            current = this_NumeroEntero_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:964:5: this_NumeroDecimal_4= ruleNumeroDecimal
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getNumeroDecimalParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_rulevalor2304);
                    this_NumeroDecimal_4=ruleNumeroDecimal();

                    state._fsp--;

                     
                            current = this_NumeroDecimal_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:974:5: this_operacion_5= ruleoperacion
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getOperacionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulevalor2331);
                    this_operacion_5=ruleoperacion();

                    state._fsp--;

                     
                            current = this_operacion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:5: this_ValorBooleano_6= ruleValorBooleano
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getValorBooleanoParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_rulevalor2358);
                    this_ValorBooleano_6=ruleValorBooleano();

                    state._fsp--;

                     
                            current = this_ValorBooleano_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:994:5: this_Caracter_7= ruleCaracter
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getCaracterParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_rulevalor2385);
                    this_Caracter_7=ruleCaracter();

                    state._fsp--;

                     
                            current = this_Caracter_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1004:5: this_Internas_8= ruleInternas
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getInternasParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInternas_in_rulevalor2412);
                    this_Internas_8=ruleInternas();

                    state._fsp--;

                     
                            current = this_Internas_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1014:5: this_unaria_9= ruleunaria
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getUnariaParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleunaria_in_rulevalor2439);
                    this_unaria_9=ruleunaria();

                    state._fsp--;

                     
                            current = this_unaria_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1024:5: this_ValorComplejo_10= ruleValorComplejo
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getValorComplejoParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorComplejo_in_rulevalor2466);
                    this_ValorComplejo_10=ruleValorComplejo();

                    state._fsp--;

                     
                            current = this_ValorComplejo_10; 
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


    // $ANTLR start "entryRuleValorComplejo"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1040:1: entryRuleValorComplejo returns [EObject current=null] : iv_ruleValorComplejo= ruleValorComplejo EOF ;
    public final EObject entryRuleValorComplejo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorComplejo = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1041:2: (iv_ruleValorComplejo= ruleValorComplejo EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1042:2: iv_ruleValorComplejo= ruleValorComplejo EOF
            {
             newCompositeNode(grammarAccess.getValorComplejoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValorComplejo_in_entryRuleValorComplejo2501);
            iv_ruleValorComplejo=ruleValorComplejo();

            state._fsp--;

             current =iv_ruleValorComplejo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValorComplejo2511); 

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
    // $ANTLR end "entryRuleValorComplejo"


    // $ANTLR start "ruleValorComplejo"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1049:1: ruleValorComplejo returns [EObject current=null] : (this_ValorRegistro_0= ruleValorRegistro | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz ) ;
    public final EObject ruleValorComplejo() throws RecognitionException {
        EObject current = null;

        EObject this_ValorRegistro_0 = null;

        EObject this_ValorVector_1 = null;

        EObject this_ValorMatriz_2 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1052:28: ( (this_ValorRegistro_0= ruleValorRegistro | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:1: (this_ValorRegistro_0= ruleValorRegistro | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:1: (this_ValorRegistro_0= ruleValorRegistro | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz )
            int alt20=3;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1054:5: this_ValorRegistro_0= ruleValorRegistro
                    {
                     
                            newCompositeNode(grammarAccess.getValorComplejoAccess().getValorRegistroParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorRegistro_in_ruleValorComplejo2558);
                    this_ValorRegistro_0=ruleValorRegistro();

                    state._fsp--;

                     
                            current = this_ValorRegistro_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1064:5: this_ValorVector_1= ruleValorVector
                    {
                     
                            newCompositeNode(grammarAccess.getValorComplejoAccess().getValorVectorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorVector_in_ruleValorComplejo2585);
                    this_ValorVector_1=ruleValorVector();

                    state._fsp--;

                     
                            current = this_ValorVector_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1074:5: this_ValorMatriz_2= ruleValorMatriz
                    {
                     
                            newCompositeNode(grammarAccess.getValorComplejoAccess().getValorMatrizParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorMatriz_in_ruleValorComplejo2612);
                    this_ValorMatriz_2=ruleValorMatriz();

                    state._fsp--;

                     
                            current = this_ValorMatriz_2; 
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
    // $ANTLR end "ruleValorComplejo"


    // $ANTLR start "entryRuleValorMatriz"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1090:1: entryRuleValorMatriz returns [EObject current=null] : iv_ruleValorMatriz= ruleValorMatriz EOF ;
    public final EObject entryRuleValorMatriz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorMatriz = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:2: (iv_ruleValorMatriz= ruleValorMatriz EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1092:2: iv_ruleValorMatriz= ruleValorMatriz EOF
            {
             newCompositeNode(grammarAccess.getValorMatrizRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValorMatriz_in_entryRuleValorMatriz2647);
            iv_ruleValorMatriz=ruleValorMatriz();

            state._fsp--;

             current =iv_ruleValorMatriz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValorMatriz2657); 

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
    // $ANTLR end "entryRuleValorMatriz"


    // $ANTLR start "ruleValorMatriz"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1099:1: ruleValorMatriz returns [EObject current=null] : ( ( (lv_nombre_matriz_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_indices_2_0= ruleOperador ) ) otherlv_3= '][' ( (lv_indices_4_0= ruleOperador ) ) otherlv_5= ']' ) ;
    public final EObject ruleValorMatriz() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_nombre_matriz_0_0 = null;

        EObject lv_indices_2_0 = null;

        EObject lv_indices_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1102:28: ( ( ( (lv_nombre_matriz_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_indices_2_0= ruleOperador ) ) otherlv_3= '][' ( (lv_indices_4_0= ruleOperador ) ) otherlv_5= ']' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1103:1: ( ( (lv_nombre_matriz_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_indices_2_0= ruleOperador ) ) otherlv_3= '][' ( (lv_indices_4_0= ruleOperador ) ) otherlv_5= ']' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1103:1: ( ( (lv_nombre_matriz_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_indices_2_0= ruleOperador ) ) otherlv_3= '][' ( (lv_indices_4_0= ruleOperador ) ) otherlv_5= ']' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1103:2: ( (lv_nombre_matriz_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_indices_2_0= ruleOperador ) ) otherlv_3= '][' ( (lv_indices_4_0= ruleOperador ) ) otherlv_5= ']'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1103:2: ( (lv_nombre_matriz_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1104:1: (lv_nombre_matriz_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1104:1: (lv_nombre_matriz_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1105:3: lv_nombre_matriz_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getValorMatrizAccess().getNombre_matrizEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleValorMatriz2703);
            lv_nombre_matriz_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValorMatrizRule());
            	        }
                   		set(
                   			current, 
                   			"nombre_matriz",
                    		lv_nombre_matriz_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleValorMatriz2715); 

                	newLeafNode(otherlv_1, grammarAccess.getValorMatrizAccess().getLeftSquareBracketKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1125:1: ( (lv_indices_2_0= ruleOperador ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1126:1: (lv_indices_2_0= ruleOperador )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1126:1: (lv_indices_2_0= ruleOperador )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1127:3: lv_indices_2_0= ruleOperador
            {
             
            	        newCompositeNode(grammarAccess.getValorMatrizAccess().getIndicesOperadorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleValorMatriz2736);
            lv_indices_2_0=ruleOperador();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValorMatrizRule());
            	        }
                   		add(
                   			current, 
                   			"indices",
                    		lv_indices_2_0, 
                    		"Operador");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleValorMatriz2748); 

                	newLeafNode(otherlv_3, grammarAccess.getValorMatrizAccess().getRightSquareBracketLeftSquareBracketKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1147:1: ( (lv_indices_4_0= ruleOperador ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1148:1: (lv_indices_4_0= ruleOperador )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1148:1: (lv_indices_4_0= ruleOperador )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1149:3: lv_indices_4_0= ruleOperador
            {
             
            	        newCompositeNode(grammarAccess.getValorMatrizAccess().getIndicesOperadorParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleValorMatriz2769);
            lv_indices_4_0=ruleOperador();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValorMatrizRule());
            	        }
                   		add(
                   			current, 
                   			"indices",
                    		lv_indices_4_0, 
                    		"Operador");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleValorMatriz2781); 

                	newLeafNode(otherlv_5, grammarAccess.getValorMatrizAccess().getRightSquareBracketKeyword_5());
                

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
    // $ANTLR end "ruleValorMatriz"


    // $ANTLR start "entryRuleValorRegistro"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1177:1: entryRuleValorRegistro returns [EObject current=null] : iv_ruleValorRegistro= ruleValorRegistro EOF ;
    public final EObject entryRuleValorRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorRegistro = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1178:2: (iv_ruleValorRegistro= ruleValorRegistro EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1179:2: iv_ruleValorRegistro= ruleValorRegistro EOF
            {
             newCompositeNode(grammarAccess.getValorRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValorRegistro_in_entryRuleValorRegistro2817);
            iv_ruleValorRegistro=ruleValorRegistro();

            state._fsp--;

             current =iv_ruleValorRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValorRegistro2827); 

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
    // $ANTLR end "entryRuleValorRegistro"


    // $ANTLR start "ruleValorRegistro"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1186:1: ruleValorRegistro returns [EObject current=null] : ( ( (lv_nombre_registro_0_0= ruleEString ) ) otherlv_1= '.' ( ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )* ) ) ;
    public final EObject ruleValorRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_registro_0_0 = null;

        EObject lv_campo_2_0 = null;

        EObject lv_campo_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1189:28: ( ( ( (lv_nombre_registro_0_0= ruleEString ) ) otherlv_1= '.' ( ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )* ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1190:1: ( ( (lv_nombre_registro_0_0= ruleEString ) ) otherlv_1= '.' ( ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )* ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1190:1: ( ( (lv_nombre_registro_0_0= ruleEString ) ) otherlv_1= '.' ( ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1190:2: ( (lv_nombre_registro_0_0= ruleEString ) ) otherlv_1= '.' ( ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1190:2: ( (lv_nombre_registro_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1191:1: (lv_nombre_registro_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1191:1: (lv_nombre_registro_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1192:3: lv_nombre_registro_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getValorRegistroAccess().getNombre_registroEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleValorRegistro2873);
            lv_nombre_registro_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValorRegistroRule());
            	        }
                   		set(
                   			current, 
                   			"nombre_registro",
                    		lv_nombre_registro_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleValorRegistro2885); 

                	newLeafNode(otherlv_1, grammarAccess.getValorRegistroAccess().getFullStopKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1212:1: ( ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1212:2: ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1212:2: ( (lv_campo_2_0= ruleCampoRegistro ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1213:1: (lv_campo_2_0= ruleCampoRegistro )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1213:1: (lv_campo_2_0= ruleCampoRegistro )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1214:3: lv_campo_2_0= ruleCampoRegistro
            {
             
            	        newCompositeNode(grammarAccess.getValorRegistroAccess().getCampoCampoRegistroParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleValorRegistro2907);
            lv_campo_2_0=ruleCampoRegistro();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValorRegistroRule());
            	        }
                   		add(
                   			current, 
                   			"campo",
                    		lv_campo_2_0, 
                    		"CampoRegistro");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1230:2: (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    int LA21_2 = input.LA(2);

                    if ( ((LA21_2>=RULE_STRING && LA21_2<=RULE_ID)) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1230:4: otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) )
            	    {
            	    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleValorRegistro2920); 

            	        	newLeafNode(otherlv_3, grammarAccess.getValorRegistroAccess().getFullStopKeyword_2_1_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1234:1: ( (lv_campo_4_0= ruleCampoRegistro ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1235:1: (lv_campo_4_0= ruleCampoRegistro )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1235:1: (lv_campo_4_0= ruleCampoRegistro )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1236:3: lv_campo_4_0= ruleCampoRegistro
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValorRegistroAccess().getCampoCampoRegistroParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleValorRegistro2941);
            	    lv_campo_4_0=ruleCampoRegistro();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValorRegistroRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"campo",
            	            		lv_campo_4_0, 
            	            		"CampoRegistro");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end "ruleValorRegistro"


    // $ANTLR start "entryRuleValorVector"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1260:1: entryRuleValorVector returns [EObject current=null] : iv_ruleValorVector= ruleValorVector EOF ;
    public final EObject entryRuleValorVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorVector = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1261:2: (iv_ruleValorVector= ruleValorVector EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1262:2: iv_ruleValorVector= ruleValorVector EOF
            {
             newCompositeNode(grammarAccess.getValorVectorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValorVector_in_entryRuleValorVector2980);
            iv_ruleValorVector=ruleValorVector();

            state._fsp--;

             current =iv_ruleValorVector; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValorVector2990); 

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
    // $ANTLR end "entryRuleValorVector"


    // $ANTLR start "ruleValorVector"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1269:1: ruleValorVector returns [EObject current=null] : ( ( (lv_nombre_vector_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_indice_2_0= ruleOperador ) ) otherlv_3= ']' ) ;
    public final EObject ruleValorVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_vector_0_0 = null;

        EObject lv_indice_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1272:28: ( ( ( (lv_nombre_vector_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_indice_2_0= ruleOperador ) ) otherlv_3= ']' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1273:1: ( ( (lv_nombre_vector_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_indice_2_0= ruleOperador ) ) otherlv_3= ']' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1273:1: ( ( (lv_nombre_vector_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_indice_2_0= ruleOperador ) ) otherlv_3= ']' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1273:2: ( (lv_nombre_vector_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_indice_2_0= ruleOperador ) ) otherlv_3= ']'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1273:2: ( (lv_nombre_vector_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1274:1: (lv_nombre_vector_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1274:1: (lv_nombre_vector_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1275:3: lv_nombre_vector_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getValorVectorAccess().getNombre_vectorEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleValorVector3036);
            lv_nombre_vector_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValorVectorRule());
            	        }
                   		set(
                   			current, 
                   			"nombre_vector",
                    		lv_nombre_vector_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleValorVector3048); 

                	newLeafNode(otherlv_1, grammarAccess.getValorVectorAccess().getLeftSquareBracketKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1295:1: ( (lv_indice_2_0= ruleOperador ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1296:1: (lv_indice_2_0= ruleOperador )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1296:1: (lv_indice_2_0= ruleOperador )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1297:3: lv_indice_2_0= ruleOperador
            {
             
            	        newCompositeNode(grammarAccess.getValorVectorAccess().getIndiceOperadorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleValorVector3069);
            lv_indice_2_0=ruleOperador();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValorVectorRule());
            	        }
                   		set(
                   			current, 
                   			"indice",
                    		lv_indice_2_0, 
                    		"Operador");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleValorVector3081); 

                	newLeafNode(otherlv_3, grammarAccess.getValorVectorAccess().getRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleValorVector"


    // $ANTLR start "entryRuleCampoRegistro"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1325:1: entryRuleCampoRegistro returns [EObject current=null] : iv_ruleCampoRegistro= ruleCampoRegistro EOF ;
    public final EObject entryRuleCampoRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCampoRegistro = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1326:2: (iv_ruleCampoRegistro= ruleCampoRegistro EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1327:2: iv_ruleCampoRegistro= ruleCampoRegistro EOF
            {
             newCompositeNode(grammarAccess.getCampoRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_entryRuleCampoRegistro3117);
            iv_ruleCampoRegistro=ruleCampoRegistro();

            state._fsp--;

             current =iv_ruleCampoRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCampoRegistro3127); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1334:1: ruleCampoRegistro returns [EObject current=null] : ( (lv_nombre_campo_0_0= ruleEString ) ) ;
    public final EObject ruleCampoRegistro() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_campo_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1337:28: ( ( (lv_nombre_campo_0_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1338:1: ( (lv_nombre_campo_0_0= ruleEString ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1338:1: ( (lv_nombre_campo_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1339:1: (lv_nombre_campo_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1339:1: (lv_nombre_campo_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1340:3: lv_nombre_campo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getNombre_campoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCampoRegistro3172);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:1: entryRuleTipo returns [EObject current=null] : iv_ruleTipo= ruleTipo EOF ;
    public final EObject entryRuleTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipo = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1365:2: (iv_ruleTipo= ruleTipo EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1366:2: iv_ruleTipo= ruleTipo EOF
            {
             newCompositeNode(grammarAccess.getTipoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_entryRuleTipo3207);
            iv_ruleTipo=ruleTipo();

            state._fsp--;

             current =iv_ruleTipo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipo3217); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:1: ruleTipo returns [EObject current=null] : (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) ;
    public final EObject ruleTipo() throws RecognitionException {
        EObject current = null;

        EObject this_TipoDefinido_0 = null;

        EObject this_TipoExistente_1 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1376:28: ( (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=66 && LA22_0<=70)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1378:5: this_TipoDefinido_0= ruleTipoDefinido
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoDefinidoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTipoDefinido_in_ruleTipo3264);
                    this_TipoDefinido_0=ruleTipoDefinido();

                    state._fsp--;

                     
                            current = this_TipoDefinido_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1388:5: this_TipoExistente_1= ruleTipoExistente
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoExistenteParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTipoExistente_in_ruleTipo3291);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1404:1: entryRuleTipoDefinido returns [EObject current=null] : iv_ruleTipoDefinido= ruleTipoDefinido EOF ;
    public final EObject entryRuleTipoDefinido() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoDefinido = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1405:2: (iv_ruleTipoDefinido= ruleTipoDefinido EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1406:2: iv_ruleTipoDefinido= ruleTipoDefinido EOF
            {
             newCompositeNode(grammarAccess.getTipoDefinidoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoDefinido_in_entryRuleTipoDefinido3326);
            iv_ruleTipoDefinido=ruleTipoDefinido();

            state._fsp--;

             current =iv_ruleTipoDefinido; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoDefinido3336); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1413:1: ruleTipoDefinido returns [EObject current=null] : ( (lv_tipo_0_0= ruleEString ) ) ;
    public final EObject ruleTipoDefinido() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1416:28: ( ( (lv_tipo_0_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1417:1: ( (lv_tipo_0_0= ruleEString ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1417:1: ( (lv_tipo_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1418:1: (lv_tipo_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1418:1: (lv_tipo_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1419:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTipoDefinidoAccess().getTipoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTipoDefinido3381);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1443:1: entryRuleTipoExistente returns [EObject current=null] : iv_ruleTipoExistente= ruleTipoExistente EOF ;
    public final EObject entryRuleTipoExistente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoExistente = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1444:2: (iv_ruleTipoExistente= ruleTipoExistente EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1445:2: iv_ruleTipoExistente= ruleTipoExistente EOF
            {
             newCompositeNode(grammarAccess.getTipoExistenteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoExistente_in_entryRuleTipoExistente3416);
            iv_ruleTipoExistente=ruleTipoExistente();

            state._fsp--;

             current =iv_ruleTipoExistente; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoExistente3426); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1452:1: ruleTipoExistente returns [EObject current=null] : ( (lv_tipo_0_0= ruleTipoVariable ) ) ;
    public final EObject ruleTipoExistente() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1455:28: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1456:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1456:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1457:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1457:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1458:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getTipoExistenteAccess().getTipoTipoVariableParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleTipoExistente3471);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1482:1: entryRuleConstantes returns [EObject current=null] : iv_ruleConstantes= ruleConstantes EOF ;
    public final EObject entryRuleConstantes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantes = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1483:2: (iv_ruleConstantes= ruleConstantes EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1484:2: iv_ruleConstantes= ruleConstantes EOF
            {
             newCompositeNode(grammarAccess.getConstantesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_entryRuleConstantes3506);
            iv_ruleConstantes=ruleConstantes();

            state._fsp--;

             current =iv_ruleConstantes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantes3516); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1491:1: ruleConstantes returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) ) ) ;
    public final EObject ruleConstantes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_valor_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1494:28: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1495:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1495:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1495:2: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1495:2: ( (lv_variable_0_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1496:1: (lv_variable_0_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1496:1: (lv_variable_0_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1497:3: lv_variable_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getVariableVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleConstantes3562);
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

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleConstantes3574); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantesAccess().getEqualsSignKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1517:1: ( (lv_valor_2_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1518:1: (lv_valor_2_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1518:1: (lv_valor_2_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1519:3: lv_valor_2_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getValorValorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleConstantes3595);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1543:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1544:2: (iv_ruleVector= ruleVector EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1545:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVector_in_entryRuleVector3631);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVector3641); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1552:1: ruleVector returns [EObject current=null] : (otherlv_0= 'vector' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '] ' otherlv_4= 'de ' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ' : ' ( (lv_nombre_7_0= ruleEString ) ) ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1555:28: ( (otherlv_0= 'vector' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '] ' otherlv_4= 'de ' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ' : ' ( (lv_nombre_7_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1556:1: (otherlv_0= 'vector' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '] ' otherlv_4= 'de ' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ' : ' ( (lv_nombre_7_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1556:1: (otherlv_0= 'vector' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '] ' otherlv_4= 'de ' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ' : ' ( (lv_nombre_7_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1556:3: otherlv_0= 'vector' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '] ' otherlv_4= 'de ' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ' : ' ( (lv_nombre_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleVector3678); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getVectorKeyword_0());
                
            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleVector3690); 

                	newLeafNode(otherlv_1, grammarAccess.getVectorAccess().getSpaceLeftSquareBracketKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1564:1: ( (lv_valor_2_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1565:1: (lv_valor_2_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1565:1: (lv_valor_2_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1566:3: lv_valor_2_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getValorValorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleVector3711);
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

            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleVector3723); 

                	newLeafNode(otherlv_3, grammarAccess.getVectorAccess().getRightSquareBracketSpaceKeyword_3());
                
            otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleVector3735); 

                	newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getDeKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1590:1: ( (lv_tipo_5_0= ruleTipo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1591:1: (lv_tipo_5_0= ruleTipo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1591:1: (lv_tipo_5_0= ruleTipo )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1592:3: lv_tipo_5_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getTipoTipoParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleVector3756);
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

            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleVector3768); 

                	newLeafNode(otherlv_6, grammarAccess.getVectorAccess().getSpaceColonSpaceKeyword_6());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1612:1: ( (lv_nombre_7_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1613:1: (lv_nombre_7_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1613:1: (lv_nombre_7_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1614:3: lv_nombre_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getNombreEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVector3789);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1638:1: entryRuleMatriz returns [EObject current=null] : iv_ruleMatriz= ruleMatriz EOF ;
    public final EObject entryRuleMatriz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatriz = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1639:2: (iv_ruleMatriz= ruleMatriz EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1640:2: iv_ruleMatriz= ruleMatriz EOF
            {
             newCompositeNode(grammarAccess.getMatrizRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_entryRuleMatriz3825);
            iv_ruleMatriz=ruleMatriz();

            state._fsp--;

             current =iv_ruleMatriz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatriz3835); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1647:1: ruleMatriz returns [EObject current=null] : (otherlv_0= 'matriz' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '][' ( (lv_valor_4_0= rulevalor ) ) otherlv_5= '] ' otherlv_6= 'de ' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ' : ' ( (lv_nombre_9_0= ruleEString ) ) ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1650:28: ( (otherlv_0= 'matriz' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '][' ( (lv_valor_4_0= rulevalor ) ) otherlv_5= '] ' otherlv_6= 'de ' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ' : ' ( (lv_nombre_9_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1651:1: (otherlv_0= 'matriz' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '][' ( (lv_valor_4_0= rulevalor ) ) otherlv_5= '] ' otherlv_6= 'de ' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ' : ' ( (lv_nombre_9_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1651:1: (otherlv_0= 'matriz' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '][' ( (lv_valor_4_0= rulevalor ) ) otherlv_5= '] ' otherlv_6= 'de ' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ' : ' ( (lv_nombre_9_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1651:3: otherlv_0= 'matriz' otherlv_1= ' [' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= '][' ( (lv_valor_4_0= rulevalor ) ) otherlv_5= '] ' otherlv_6= 'de ' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ' : ' ( (lv_nombre_9_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMatriz3872); 

                	newLeafNode(otherlv_0, grammarAccess.getMatrizAccess().getMatrizKeyword_0());
                
            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMatriz3884); 

                	newLeafNode(otherlv_1, grammarAccess.getMatrizAccess().getSpaceLeftSquareBracketKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1659:1: ( (lv_valor_2_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1660:1: (lv_valor_2_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1660:1: (lv_valor_2_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1661:3: lv_valor_2_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorValorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleMatriz3905);
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

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMatriz3917); 

                	newLeafNode(otherlv_3, grammarAccess.getMatrizAccess().getRightSquareBracketLeftSquareBracketKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1681:1: ( (lv_valor_4_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1682:1: (lv_valor_4_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1682:1: (lv_valor_4_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1683:3: lv_valor_4_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorValorParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleMatriz3938);
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

            otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMatriz3950); 

                	newLeafNode(otherlv_5, grammarAccess.getMatrizAccess().getRightSquareBracketSpaceKeyword_5());
                
            otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleMatriz3962); 

                	newLeafNode(otherlv_6, grammarAccess.getMatrizAccess().getDeKeyword_6());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1707:1: ( (lv_tipo_7_0= ruleTipo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1708:1: (lv_tipo_7_0= ruleTipo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1708:1: (lv_tipo_7_0= ruleTipo )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1709:3: lv_tipo_7_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getTipoTipoParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleMatriz3983);
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

            otherlv_8=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMatriz3995); 

                	newLeafNode(otherlv_8, grammarAccess.getMatrizAccess().getSpaceColonSpaceKeyword_8());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1729:1: ( (lv_nombre_9_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1730:1: (lv_nombre_9_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1730:1: (lv_nombre_9_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1731:3: lv_nombre_9_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getNombreEStringParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatriz4016);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1755:1: entryRuleRegistro returns [EObject current=null] : iv_ruleRegistro= ruleRegistro EOF ;
    public final EObject entryRuleRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistro = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1756:2: (iv_ruleRegistro= ruleRegistro EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1757:2: iv_ruleRegistro= ruleRegistro EOF
            {
             newCompositeNode(grammarAccess.getRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRegistro_in_entryRuleRegistro4052);
            iv_ruleRegistro=ruleRegistro();

            state._fsp--;

             current =iv_ruleRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegistro4062); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1764:1: ruleRegistro returns [EObject current=null] : (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracionVariable ) ) ( (lv_variable_3_0= ruleDeclaracionVariable ) )* ) otherlv_4= 'fin_registro' ) ;
    public final EObject ruleRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1767:28: ( (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracionVariable ) ) ( (lv_variable_3_0= ruleDeclaracionVariable ) )* ) otherlv_4= 'fin_registro' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1768:1: (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracionVariable ) ) ( (lv_variable_3_0= ruleDeclaracionVariable ) )* ) otherlv_4= 'fin_registro' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1768:1: (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracionVariable ) ) ( (lv_variable_3_0= ruleDeclaracionVariable ) )* ) otherlv_4= 'fin_registro' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1768:3: otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracionVariable ) ) ( (lv_variable_3_0= ruleDeclaracionVariable ) )* ) otherlv_4= 'fin_registro'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleRegistro4099); 

                	newLeafNode(otherlv_0, grammarAccess.getRegistroAccess().getRegistroKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1772:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1773:1: (lv_nombre_1_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1773:1: (lv_nombre_1_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1774:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRegistro4120);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1790:2: ( ( (lv_variable_2_0= ruleDeclaracionVariable ) ) ( (lv_variable_3_0= ruleDeclaracionVariable ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1790:3: ( (lv_variable_2_0= ruleDeclaracionVariable ) ) ( (lv_variable_3_0= ruleDeclaracionVariable ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1790:3: ( (lv_variable_2_0= ruleDeclaracionVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1791:1: (lv_variable_2_0= ruleDeclaracionVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1791:1: (lv_variable_2_0= ruleDeclaracionVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1792:3: lv_variable_2_0= ruleDeclaracionVariable
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getVariableDeclaracionVariableParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_ruleRegistro4142);
            lv_variable_2_0=ruleDeclaracionVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRegistroRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"DeclaracionVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1808:2: ( (lv_variable_3_0= ruleDeclaracionVariable ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=66 && LA23_0<=70)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1809:1: (lv_variable_3_0= ruleDeclaracionVariable )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1809:1: (lv_variable_3_0= ruleDeclaracionVariable )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1810:3: lv_variable_3_0= ruleDeclaracionVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRegistroAccess().getVariableDeclaracionVariableParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_ruleRegistro4163);
            	    lv_variable_3_0=ruleDeclaracionVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRegistroRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variable",
            	            		lv_variable_3_0, 
            	            		"DeclaracionVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleRegistro4177); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1838:1: entryRuleArchivo returns [EObject current=null] : iv_ruleArchivo= ruleArchivo EOF ;
    public final EObject entryRuleArchivo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchivo = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1839:2: (iv_ruleArchivo= ruleArchivo EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1840:2: iv_ruleArchivo= ruleArchivo EOF
            {
             newCompositeNode(grammarAccess.getArchivoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArchivo_in_entryRuleArchivo4213);
            iv_ruleArchivo=ruleArchivo();

            state._fsp--;

             current =iv_ruleArchivo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArchivo4223); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1847:1: ruleArchivo returns [EObject current=null] : (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ':' ( (lv_nombre_3_0= ruleEString ) ) ) ;
    public final EObject ruleArchivo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_tipo_1_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1850:28: ( (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ':' ( (lv_nombre_3_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1851:1: (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ':' ( (lv_nombre_3_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1851:1: (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ':' ( (lv_nombre_3_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1851:3: otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ':' ( (lv_nombre_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleArchivo4260); 

                	newLeafNode(otherlv_0, grammarAccess.getArchivoAccess().getArchivoDeKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1855:1: ( (lv_tipo_1_0= ruleTipo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1856:1: (lv_tipo_1_0= ruleTipo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1856:1: (lv_tipo_1_0= ruleTipo )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1857:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleArchivo4281);
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

            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleArchivo4293); 

                	newLeafNode(otherlv_2, grammarAccess.getArchivoAccess().getColonKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1877:1: ( (lv_nombre_3_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1878:1: (lv_nombre_3_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1878:1: (lv_nombre_3_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1879:3: lv_nombre_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getNombreEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArchivo4314);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1903:1: entryRuleEnumerado returns [EObject current=null] : iv_ruleEnumerado= ruleEnumerado EOF ;
    public final EObject entryRuleEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerado = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1904:2: (iv_ruleEnumerado= ruleEnumerado EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1905:2: iv_ruleEnumerado= ruleEnumerado EOF
            {
             newCompositeNode(grammarAccess.getEnumeradoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumerado_in_entryRuleEnumerado4350);
            iv_ruleEnumerado=ruleEnumerado();

            state._fsp--;

             current =iv_ruleEnumerado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerado4360); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1912:1: ruleEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )* ) otherlv_6= '}' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1915:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )* ) otherlv_6= '}' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1916:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )* ) otherlv_6= '}' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1916:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )* ) otherlv_6= '}' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1916:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )* ) otherlv_6= '}'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1916:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1917:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1917:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1918:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnumerado4406);
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

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEnumerado4418); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumeradoAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEnumerado4430); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumeradoAccess().getLeftCurlyBracketKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1942:1: ( ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1942:2: ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1942:2: ( (lv_valor_3_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1943:1: (lv_valor_3_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1943:1: (lv_valor_3_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1944:3: lv_valor_3_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorValorParserRuleCall_3_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleEnumerado4452);
            lv_valor_3_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumeradoRule());
            	        }
                   		add(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"valor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1960:2: (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==18) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1960:4: otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEnumerado4465); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumeradoAccess().getCommaKeyword_3_1_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1964:1: ( (lv_valor_5_0= rulevalor ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1965:1: (lv_valor_5_0= rulevalor )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1965:1: (lv_valor_5_0= rulevalor )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1966:3: lv_valor_5_0= rulevalor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorValorParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleEnumerado4486);
            	    lv_valor_5_0=rulevalor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumeradoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"valor",
            	            		lv_valor_5_0, 
            	            		"valor");
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

            otherlv_6=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEnumerado4501); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1994:1: entryRuleSubrango returns [EObject current=null] : iv_ruleSubrango= ruleSubrango EOF ;
    public final EObject entryRuleSubrango() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrango = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1995:2: (iv_ruleSubrango= ruleSubrango EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1996:2: iv_ruleSubrango= ruleSubrango EOF
            {
             newCompositeNode(grammarAccess.getSubrangoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrango_in_entryRuleSubrango4537);
            iv_ruleSubrango=ruleSubrango();

            state._fsp--;

             current =iv_ruleSubrango; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrango4547); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2003:1: ruleSubrango returns [EObject current=null] : this_SubrangoNumerico_0= ruleSubrangoNumerico ;
    public final EObject ruleSubrango() throws RecognitionException {
        EObject current = null;

        EObject this_SubrangoNumerico_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2006:28: (this_SubrangoNumerico_0= ruleSubrangoNumerico )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2008:5: this_SubrangoNumerico_0= ruleSubrangoNumerico
            {
             
                    newCompositeNode(grammarAccess.getSubrangoAccess().getSubrangoNumericoParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSubrangoNumerico_in_ruleSubrango4593);
            this_SubrangoNumerico_0=ruleSubrangoNumerico();

            state._fsp--;

             
                    current = this_SubrangoNumerico_0; 
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
    // $ANTLR end "ruleSubrango"


    // $ANTLR start "entryRuleSubrangoNumerico"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2024:1: entryRuleSubrangoNumerico returns [EObject current=null] : iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF ;
    public final EObject entryRuleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoNumerico = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2025:2: (iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2026:2: iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF
            {
             newCompositeNode(grammarAccess.getSubrangoNumericoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrangoNumerico_in_entryRuleSubrangoNumerico4627);
            iv_ruleSubrangoNumerico=ruleSubrangoNumerico();

            state._fsp--;

             current =iv_ruleSubrangoNumerico; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrangoNumerico4637); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2033:1: ruleSubrangoNumerico returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) ;
    public final EObject ruleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2036:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2037:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2037:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2037:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2037:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2038:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2038:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2039:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoNumerico4683);
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

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSubrangoNumerico4695); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoNumericoAccess().getEqualsSignKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2059:1: ( (lv_limite_inf_2_0= ruleEInt ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2060:1: (lv_limite_inf_2_0= ruleEInt )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2060:1: (lv_limite_inf_2_0= ruleEInt )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2061:3: lv_limite_inf_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_infEIntParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubrangoNumerico4716);
            lv_limite_inf_2_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangoNumericoRule());
            	        }
                   		set(
                   			current, 
                   			"limite_inf",
                    		lv_limite_inf_2_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleSubrangoNumerico4728); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoNumericoAccess().getFullStopFullStopKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2081:1: ( (lv_limite_sup_4_0= ruleEInt ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2082:1: (lv_limite_sup_4_0= ruleEInt )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2082:1: (lv_limite_sup_4_0= ruleEInt )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2083:3: lv_limite_sup_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_supEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubrangoNumerico4749);
            lv_limite_sup_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangoNumericoRule());
            	        }
                   		set(
                   			current, 
                   			"limite_sup",
                    		lv_limite_sup_4_0, 
                    		"EInt");
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
    // $ANTLR end "ruleSubrangoNumerico"


    // $ANTLR start "entryRuleInicio"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2107:1: entryRuleInicio returns [EObject current=null] : iv_ruleInicio= ruleInicio EOF ;
    public final EObject entryRuleInicio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInicio = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2108:2: (iv_ruleInicio= ruleInicio EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2109:2: iv_ruleInicio= ruleInicio EOF
            {
             newCompositeNode(grammarAccess.getInicioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_entryRuleInicio4785);
            iv_ruleInicio=ruleInicio();

            state._fsp--;

             current =iv_ruleInicio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInicio4795); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2116:1: ruleInicio returns [EObject current=null] : ( () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2119:28: ( ( () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2120:1: ( () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2120:1: ( () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2120:2: () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2120:2: ()
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2121:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInicioAccess().getInicioAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleInicio4841); 

                	newLeafNode(otherlv_1, grammarAccess.getInicioAccess().getVarKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2130:1: ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)||(LA26_0>=66 && LA26_0<=70)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2130:2: ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2130:2: ( (lv_declaracion_2_0= ruleDeclaracion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2131:1: (lv_declaracion_2_0= ruleDeclaracion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2131:1: (lv_declaracion_2_0= ruleDeclaracion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2132:3: lv_declaracion_2_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio4863);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2148:2: ( (lv_declaracion_3_0= ruleDeclaracion ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)||(LA25_0>=66 && LA25_0<=70)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2149:1: (lv_declaracion_3_0= ruleDeclaracion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2149:1: (lv_declaracion_3_0= ruleDeclaracion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2150:3: lv_declaracion_3_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio4884);
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
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleInicio4899); 

                	newLeafNode(otherlv_4, grammarAccess.getInicioAccess().getInicioKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2170:1: ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||(LA28_0>=50 && LA28_0<=52)||LA28_0==55||LA28_0==58||LA28_0==60||LA28_0==63) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2170:2: ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2170:2: ( (lv_tiene_5_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2171:1: (lv_tiene_5_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2171:1: (lv_tiene_5_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2172:3: lv_tiene_5_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio4921);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2188:2: ( (lv_tiene_6_0= ruleSentencias ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)||(LA27_0>=50 && LA27_0<=52)||LA27_0==55||LA27_0==58||LA27_0==60||LA27_0==63) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2189:1: (lv_tiene_6_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2189:1: (lv_tiene_6_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2190:3: lv_tiene_6_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio4942);
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
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleInicio4957); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2218:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2219:2: (iv_ruleEString= ruleEString EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2220:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString4994);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString5005); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2227:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2230:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2231:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2231:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2231:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString5045); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2239:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString5071); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2254:1: entryRuleDeclaracionVariable returns [EObject current=null] : iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF ;
    public final EObject entryRuleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionVariable = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2255:2: (iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2256:2: iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable5116);
            iv_ruleDeclaracionVariable=ruleDeclaracionVariable();

            state._fsp--;

             current =iv_ruleDeclaracionVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionVariable5126); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2263:1: ruleDeclaracionVariable returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) )+ otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2266:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) )+ otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2267:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) )+ otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2267:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) )+ otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2267:2: ( (lv_tipo_0_0= ruleTipoVariable ) )+ otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2267:2: ( (lv_tipo_0_0= ruleTipoVariable ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=66 && LA30_0<=70)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2268:1: (lv_tipo_0_0= ruleTipoVariable )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2268:1: (lv_tipo_0_0= ruleTipoVariable )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2269:3: lv_tipo_0_0= ruleTipoVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable5172);
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
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDeclaracionVariable5185); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionVariableAccess().getColonKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2289:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2290:1: (lv_variable_2_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2290:1: (lv_variable_2_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2291:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable5206);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2307:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==18) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2307:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDeclaracionVariable5219); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionVariableAccess().getCommaKeyword_3_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2311:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2312:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2312:1: (lv_variable_4_0= ruleVariable )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2313:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable5240);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2337:1: entryRuleDeclaracionPropia returns [EObject current=null] : iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF ;
    public final EObject entryRuleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionPropia = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2338:2: (iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2339:2: iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionPropiaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia5278);
            iv_ruleDeclaracionPropia=ruleDeclaracionPropia();

            state._fsp--;

             current =iv_ruleDeclaracionPropia; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionPropia5288); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2346:1: ruleDeclaracionPropia returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleEString ) )+ otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2349:28: ( ( ( (lv_tipo_0_0= ruleEString ) )+ otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2350:1: ( ( (lv_tipo_0_0= ruleEString ) )+ otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2350:1: ( ( (lv_tipo_0_0= ruleEString ) )+ otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2350:2: ( (lv_tipo_0_0= ruleEString ) )+ otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2350:2: ( (lv_tipo_0_0= ruleEString ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2351:1: (lv_tipo_0_0= ruleEString )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2351:1: (lv_tipo_0_0= ruleEString )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2352:3: lv_tipo_0_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getTipoEStringParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDeclaracionPropia5334);
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
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDeclaracionPropia5347); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionPropiaAccess().getColonKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2372:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2373:1: (lv_variable_2_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2373:1: (lv_variable_2_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2374:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia5368);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2390:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==18) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2390:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDeclaracionPropia5381); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionPropiaAccess().getCommaKeyword_3_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2394:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2395:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2395:1: (lv_variable_4_0= ruleVariable )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2396:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia5402);
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
            	    break loop33;
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2420:1: entryRuleLlamadaFuncion returns [EObject current=null] : iv_ruleLlamadaFuncion= ruleLlamadaFuncion EOF ;
    public final EObject entryRuleLlamadaFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlamadaFuncion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2421:2: (iv_ruleLlamadaFuncion= ruleLlamadaFuncion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2422:2: iv_ruleLlamadaFuncion= ruleLlamadaFuncion EOF
            {
             newCompositeNode(grammarAccess.getLlamadaFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_entryRuleLlamadaFuncion5440);
            iv_ruleLlamadaFuncion=ruleLlamadaFuncion();

            state._fsp--;

             current =iv_ruleLlamadaFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLlamadaFuncion5450); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2429:1: ruleLlamadaFuncion returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )? otherlv_5= ')' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2432:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )? otherlv_5= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2433:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )? otherlv_5= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2433:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )? otherlv_5= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2433:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )? otherlv_5= ')'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2433:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2434:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2434:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2435:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getLlamadaFuncionAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLlamadaFuncion5496);
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

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLlamadaFuncion5508); 

                	newLeafNode(otherlv_1, grammarAccess.getLlamadaFuncionAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2455:1: ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_CAR && LA35_0<=RULE_ID)||(LA35_0>=RULE_CAD && LA35_0<=RULE_INT)||LA35_0==32||LA35_0==71||(LA35_0>=74 && LA35_0<=75)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2455:2: ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2455:2: ( (lv_operador_2_0= ruleOperador ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2456:1: (lv_operador_2_0= ruleOperador )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2456:1: (lv_operador_2_0= ruleOperador )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2457:3: lv_operador_2_0= ruleOperador
                    {
                     
                    	        newCompositeNode(grammarAccess.getLlamadaFuncionAccess().getOperadorOperadorParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleLlamadaFuncion5530);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2473:2: (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==18) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2473:4: otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLlamadaFuncion5543); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getLlamadaFuncionAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2477:1: ( (lv_operador_4_0= ruleOperador ) )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2478:1: (lv_operador_4_0= ruleOperador )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2478:1: (lv_operador_4_0= ruleOperador )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2479:3: lv_operador_4_0= ruleOperador
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLlamadaFuncionAccess().getOperadorOperadorParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleLlamadaFuncion5564);
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
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLlamadaFuncion5580); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2507:1: entryRuleAsignacion returns [EObject current=null] : iv_ruleAsignacion= ruleAsignacion EOF ;
    public final EObject entryRuleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2508:2: (iv_ruleAsignacion= ruleAsignacion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2509:2: iv_ruleAsignacion= ruleAsignacion EOF
            {
             newCompositeNode(grammarAccess.getAsignacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_entryRuleAsignacion5616);
            iv_ruleAsignacion=ruleAsignacion();

            state._fsp--;

             current =iv_ruleAsignacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacion5626); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2516:1: ruleAsignacion returns [EObject current=null] : (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) ;
    public final EObject ruleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject this_AsignacionNormal_0 = null;

        EObject this_AsignacionCompleja_1 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2519:28: ( (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2520:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2520:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==29||LA36_1==32) ) {
                    alt36=2;
                }
                else if ( (LA36_1==RULE_MAT||LA36_1==33) ) {
                    alt36=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA36_0==RULE_ID) ) {
                int LA36_2 = input.LA(2);

                if ( (LA36_2==29||LA36_2==32) ) {
                    alt36=2;
                }
                else if ( (LA36_2==RULE_MAT||LA36_2==33) ) {
                    alt36=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2521:5: this_AsignacionNormal_0= ruleAsignacionNormal
                    {
                     
                            newCompositeNode(grammarAccess.getAsignacionAccess().getAsignacionNormalParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_ruleAsignacion5673);
                    this_AsignacionNormal_0=ruleAsignacionNormal();

                    state._fsp--;

                     
                            current = this_AsignacionNormal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2531:5: this_AsignacionCompleja_1= ruleAsignacionCompleja
                    {
                     
                            newCompositeNode(grammarAccess.getAsignacionAccess().getAsignacionComplejaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacionCompleja_in_ruleAsignacion5700);
                    this_AsignacionCompleja_1=ruleAsignacionCompleja();

                    state._fsp--;

                     
                            current = this_AsignacionCompleja_1; 
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
    // $ANTLR end "ruleAsignacion"


    // $ANTLR start "entryRuleAsignacionNormal"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2547:1: entryRuleAsignacionNormal returns [EObject current=null] : iv_ruleAsignacionNormal= ruleAsignacionNormal EOF ;
    public final EObject entryRuleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionNormal = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2548:2: (iv_ruleAsignacionNormal= ruleAsignacionNormal EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2549:2: iv_ruleAsignacionNormal= ruleAsignacionNormal EOF
            {
             newCompositeNode(grammarAccess.getAsignacionNormalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_entryRuleAsignacionNormal5735);
            iv_ruleAsignacionNormal=ruleAsignacionNormal();

            state._fsp--;

             current =iv_ruleAsignacionNormal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacionNormal5745); 

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
    // $ANTLR end "entryRuleAsignacionNormal"


    // $ANTLR start "ruleAsignacionNormal"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2556:1: ruleAsignacionNormal returns [EObject current=null] : ( ( (lv_lvalue_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) ) ;
    public final EObject ruleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        Token lv_Mat_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_lvalue_0_0 = null;

        EObject lv_operador_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2559:28: ( ( ( (lv_lvalue_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2560:1: ( ( (lv_lvalue_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2560:1: ( ( (lv_lvalue_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2560:2: ( (lv_lvalue_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2560:2: ( (lv_lvalue_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2561:1: (lv_lvalue_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2561:1: (lv_lvalue_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2562:3: lv_lvalue_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getLvalueEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsignacionNormal5791);
            lv_lvalue_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionNormalRule());
            	        }
                   		set(
                   			current, 
                   			"lvalue",
                    		lv_lvalue_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2578:2: ( (lv_Mat_1_0= RULE_MAT ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_MAT) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2579:1: (lv_Mat_1_0= RULE_MAT )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2579:1: (lv_Mat_1_0= RULE_MAT )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2580:3: lv_Mat_1_0= RULE_MAT
            	    {
            	    lv_Mat_1_0=(Token)match(input,RULE_MAT,FollowSets000.FOLLOW_RULE_MAT_in_ruleAsignacionNormal5808); 

            	    			newLeafNode(lv_Mat_1_0, grammarAccess.getAsignacionNormalAccess().getMatMATTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAsignacionNormalRule());
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
            	    break loop37;
                }
            } while (true);

            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAsignacionNormal5826); 

                	newLeafNode(otherlv_2, grammarAccess.getAsignacionNormalAccess().getEqualsSignKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2600:1: ( (lv_operador_3_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2601:1: (lv_operador_3_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2601:1: (lv_operador_3_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2602:3: lv_operador_3_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getOperadorValorParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleAsignacionNormal5847);
            lv_operador_3_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionNormalRule());
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
    // $ANTLR end "ruleAsignacionNormal"


    // $ANTLR start "entryRuleAsignacionCompleja"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2626:1: entryRuleAsignacionCompleja returns [EObject current=null] : iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF ;
    public final EObject entryRuleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionCompleja = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2627:2: (iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2628:2: iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF
            {
             newCompositeNode(grammarAccess.getAsignacionComplejaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionCompleja_in_entryRuleAsignacionCompleja5883);
            iv_ruleAsignacionCompleja=ruleAsignacionCompleja();

            state._fsp--;

             current =iv_ruleAsignacionCompleja; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacionCompleja5893); 

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
    // $ANTLR end "entryRuleAsignacionCompleja"


    // $ANTLR start "ruleAsignacionCompleja"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2635:1: ruleAsignacionCompleja returns [EObject current=null] : ( ( (lv_complejo_0_0= ruleValorComplejo ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) ) ;
    public final EObject ruleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        Token lv_Mat_1_0=null;
        Token otherlv_2=null;
        EObject lv_complejo_0_0 = null;

        EObject lv_operador_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2638:28: ( ( ( (lv_complejo_0_0= ruleValorComplejo ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2639:1: ( ( (lv_complejo_0_0= ruleValorComplejo ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2639:1: ( ( (lv_complejo_0_0= ruleValorComplejo ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2639:2: ( (lv_complejo_0_0= ruleValorComplejo ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2639:2: ( (lv_complejo_0_0= ruleValorComplejo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2640:1: (lv_complejo_0_0= ruleValorComplejo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2640:1: (lv_complejo_0_0= ruleValorComplejo )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2641:3: lv_complejo_0_0= ruleValorComplejo
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getComplejoValorComplejoParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleValorComplejo_in_ruleAsignacionCompleja5939);
            lv_complejo_0_0=ruleValorComplejo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionComplejaRule());
            	        }
                   		set(
                   			current, 
                   			"complejo",
                    		lv_complejo_0_0, 
                    		"ValorComplejo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2657:2: ( (lv_Mat_1_0= RULE_MAT ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_MAT) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2658:1: (lv_Mat_1_0= RULE_MAT )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2658:1: (lv_Mat_1_0= RULE_MAT )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2659:3: lv_Mat_1_0= RULE_MAT
            	    {
            	    lv_Mat_1_0=(Token)match(input,RULE_MAT,FollowSets000.FOLLOW_RULE_MAT_in_ruleAsignacionCompleja5956); 

            	    			newLeafNode(lv_Mat_1_0, grammarAccess.getAsignacionComplejaAccess().getMatMATTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAsignacionComplejaRule());
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
            	    break loop38;
                }
            } while (true);

            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAsignacionCompleja5974); 

                	newLeafNode(otherlv_2, grammarAccess.getAsignacionComplejaAccess().getEqualsSignKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2679:1: ( (lv_operador_3_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2680:1: (lv_operador_3_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2680:1: (lv_operador_3_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2681:3: lv_operador_3_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getOperadorValorParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleAsignacionCompleja5995);
            lv_operador_3_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionComplejaRule());
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
    // $ANTLR end "ruleAsignacionCompleja"


    // $ANTLR start "entryRuleEscribir"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2705:1: entryRuleEscribir returns [EObject current=null] : iv_ruleEscribir= ruleEscribir EOF ;
    public final EObject entryRuleEscribir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscribir = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2706:2: (iv_ruleEscribir= ruleEscribir EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2707:2: iv_ruleEscribir= ruleEscribir EOF
            {
             newCompositeNode(grammarAccess.getEscribirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_entryRuleEscribir6031);
            iv_ruleEscribir=ruleEscribir();

            state._fsp--;

             current =iv_ruleEscribir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEscribir6041); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2714:1: ruleEscribir returns [EObject current=null] : (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2717:28: ( (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2718:1: (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2718:1: (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2718:3: otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEscribir6078); 

                	newLeafNode(otherlv_0, grammarAccess.getEscribirAccess().getEscribirKeyword_0());
                
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEscribir6090); 

                	newLeafNode(otherlv_1, grammarAccess.getEscribirAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2726:1: ( (lv_operador_2_0= ruleOperador ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2727:1: (lv_operador_2_0= ruleOperador )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2727:1: (lv_operador_2_0= ruleOperador )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2728:3: lv_operador_2_0= ruleOperador
            {
             
            	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleEscribir6111);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2744:2: (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==18) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2744:4: otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEscribir6124); 

            	        	newLeafNode(otherlv_3, grammarAccess.getEscribirAccess().getCommaKeyword_3_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2748:1: ( (lv_operador_4_0= ruleOperador ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2749:1: (lv_operador_4_0= ruleOperador )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2749:1: (lv_operador_4_0= ruleOperador )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2750:3: lv_operador_4_0= ruleOperador
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleEscribir6145);
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
            	    break loop39;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEscribir6159); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2778:1: entryRuleLeer returns [EObject current=null] : iv_ruleLeer= ruleLeer EOF ;
    public final EObject entryRuleLeer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeer = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2779:2: (iv_ruleLeer= ruleLeer EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2780:2: iv_ruleLeer= ruleLeer EOF
            {
             newCompositeNode(grammarAccess.getLeerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeer_in_entryRuleLeer6195);
            iv_ruleLeer=ruleLeer();

            state._fsp--;

             current =iv_ruleLeer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeer6205); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2787:1: ruleLeer returns [EObject current=null] : (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')' ) ;
    public final EObject ruleLeer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2790:28: ( (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2791:1: (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2791:1: (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2791:3: otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleLeer6242); 

                	newLeafNode(otherlv_0, grammarAccess.getLeerAccess().getLeerKeyword_0());
                
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLeer6254); 

                	newLeafNode(otherlv_1, grammarAccess.getLeerAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2799:1: ( (lv_variable_2_0= ruleVariableID ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2800:1: (lv_variable_2_0= ruleVariableID )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2800:1: (lv_variable_2_0= ruleVariableID )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2801:3: lv_variable_2_0= ruleVariableID
            {
             
            	        newCompositeNode(grammarAccess.getLeerAccess().getVariableVariableIDParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleLeer6275);
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

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLeer6287); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2829:1: entryRuleSi returns [EObject current=null] : iv_ruleSi= ruleSi EOF ;
    public final EObject entryRuleSi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSi = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2830:2: (iv_ruleSi= ruleSi EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2831:2: iv_ruleSi= ruleSi EOF
            {
             newCompositeNode(grammarAccess.getSiRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSi_in_entryRuleSi6323);
            iv_ruleSi=ruleSi();

            state._fsp--;

             current =iv_ruleSi; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSi6333); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2838:1: ruleSi returns [EObject current=null] : (otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2841:28: ( (otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2842:1: (otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2842:1: (otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2842:3: otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleSi6370); 

                	newLeafNode(otherlv_0, grammarAccess.getSiAccess().getSiKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2846:1: ( (lv_valor_1_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2847:1: (lv_valor_1_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2847:1: (lv_valor_1_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2848:3: lv_valor_1_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getSiAccess().getValorValorParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleSi6391);
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

            otherlv_2=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleSi6403); 

                	newLeafNode(otherlv_2, grammarAccess.getSiAccess().getEntoncesKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2868:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_ID)||(LA41_0>=50 && LA41_0<=52)||LA41_0==55||LA41_0==58||LA41_0==60||LA41_0==63) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2868:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2868:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2869:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2869:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2870:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi6425);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2886:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)||(LA40_0>=50 && LA40_0<=52)||LA40_0==55||LA40_0==58||LA40_0==60||LA40_0==63) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2887:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2887:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2888:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi6446);
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
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2904:5: ( (lv_devuelve_5_0= ruleDevolver ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==88) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2905:1: (lv_devuelve_5_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2905:1: (lv_devuelve_5_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2906:3: lv_devuelve_5_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getDevuelveDevolverParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSi6470);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2922:3: ( (lv_sino_6_0= ruleSino ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==87) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2923:1: (lv_sino_6_0= ruleSino )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2923:1: (lv_sino_6_0= ruleSino )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2924:3: lv_sino_6_0= ruleSino
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSinoSinoParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSino_in_ruleSi6492);
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

            otherlv_7=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleSi6505); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2952:1: entryRulemientras returns [EObject current=null] : iv_rulemientras= rulemientras EOF ;
    public final EObject entryRulemientras() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemientras = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2953:2: (iv_rulemientras= rulemientras EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2954:2: iv_rulemientras= rulemientras EOF
            {
             newCompositeNode(grammarAccess.getMientrasRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemientras_in_entryRulemientras6541);
            iv_rulemientras=rulemientras();

            state._fsp--;

             current =iv_rulemientras; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemientras6551); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2961:1: rulemientras returns [EObject current=null] : (otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2964:28: ( (otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2965:1: (otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2965:1: (otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2965:3: otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_rulemientras6588); 

                	newLeafNode(otherlv_0, grammarAccess.getMientrasAccess().getMientrasKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2969:1: ( (lv_valor_1_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2970:1: (lv_valor_1_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2970:1: (lv_valor_1_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2971:3: lv_valor_1_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getMientrasAccess().getValorValorParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rulemientras6609);
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

            otherlv_2=(Token)match(input,56,FollowSets000.FOLLOW_56_in_rulemientras6621); 

                	newLeafNode(otherlv_2, grammarAccess.getMientrasAccess().getHacerKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2991:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)||(LA45_0>=50 && LA45_0<=52)||LA45_0==55||LA45_0==58||LA45_0==60||LA45_0==63) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2991:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2991:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2992:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2992:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2993:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras6643);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3009:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_ID)||(LA44_0>=50 && LA44_0<=52)||LA44_0==55||LA44_0==58||LA44_0==60||LA44_0==63) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3010:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3010:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3011:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras6664);
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
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,57,FollowSets000.FOLLOW_57_in_rulemientras6679); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3039:1: entryRulerepetir returns [EObject current=null] : iv_rulerepetir= rulerepetir EOF ;
    public final EObject entryRulerepetir() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetir = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3040:2: (iv_rulerepetir= rulerepetir EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3041:2: iv_rulerepetir= rulerepetir EOF
            {
             newCompositeNode(grammarAccess.getRepetirRule()); 
            pushFollow(FollowSets000.FOLLOW_rulerepetir_in_entryRulerepetir6715);
            iv_rulerepetir=rulerepetir();

            state._fsp--;

             current =iv_rulerepetir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulerepetir6725); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3048:1: rulerepetir returns [EObject current=null] : (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) ) ) ;
    public final EObject rulerepetir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_sentencias_1_0 = null;

        EObject lv_sentencias_2_0 = null;

        EObject lv_valor_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3051:28: ( (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3052:1: (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3052:1: (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3052:3: otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) )
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_rulerepetir6762); 

                	newLeafNode(otherlv_0, grammarAccess.getRepetirAccess().getRepetirKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3056:1: ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_STRING && LA47_0<=RULE_ID)||(LA47_0>=50 && LA47_0<=52)||LA47_0==55||LA47_0==58||LA47_0==60||LA47_0==63) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3056:2: ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3056:2: ( (lv_sentencias_1_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3057:1: (lv_sentencias_1_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3057:1: (lv_sentencias_1_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3058:3: lv_sentencias_1_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir6784);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3074:2: ( (lv_sentencias_2_0= ruleSentencias ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( ((LA46_0>=RULE_STRING && LA46_0<=RULE_ID)||(LA46_0>=50 && LA46_0<=52)||LA46_0==55||LA46_0==58||LA46_0==60||LA46_0==63) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3075:1: (lv_sentencias_2_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3075:1: (lv_sentencias_2_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3076:3: lv_sentencias_2_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir6805);
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
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,59,FollowSets000.FOLLOW_59_in_rulerepetir6820); 

                	newLeafNode(otherlv_3, grammarAccess.getRepetirAccess().getHasta_queKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3096:1: ( (lv_valor_4_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3097:1: (lv_valor_4_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3097:1: (lv_valor_4_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3098:3: lv_valor_4_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getRepetirAccess().getValorValorParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rulerepetir6841);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3122:1: entryRuledesde returns [EObject current=null] : iv_ruledesde= ruledesde EOF ;
    public final EObject entryRuledesde() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledesde = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3123:2: (iv_ruledesde= ruledesde EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3124:2: iv_ruledesde= ruledesde EOF
            {
             newCompositeNode(grammarAccess.getDesdeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruledesde_in_entryRuledesde6877);
            iv_ruledesde=ruledesde();

            state._fsp--;

             current =iv_ruledesde; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuledesde6887); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3131:1: ruledesde returns [EObject current=null] : (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3134:28: ( (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3135:1: (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3135:1: (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3135:3: otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde'
            {
            otherlv_0=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruledesde6924); 

                	newLeafNode(otherlv_0, grammarAccess.getDesdeAccess().getDesdeKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3139:1: ( (lv_asignacion_1_0= ruleAsignacionNormal ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3140:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3140:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3141:3: lv_asignacion_1_0= ruleAsignacionNormal
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getAsignacionAsignacionNormalParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_ruledesde6945);
            lv_asignacion_1_0=ruleAsignacionNormal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDesdeRule());
            	        }
                   		set(
                   			current, 
                   			"asignacion",
                    		lv_asignacion_1_0, 
                    		"AsignacionNormal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruledesde6957); 

                	newLeafNode(otherlv_2, grammarAccess.getDesdeAccess().getHastaKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3161:1: ( (lv_valor_3_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3162:1: (lv_valor_3_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3162:1: (lv_valor_3_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3163:3: lv_valor_3_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getValorValorParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruledesde6978);
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

            otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruledesde6990); 

                	newLeafNode(otherlv_4, grammarAccess.getDesdeAccess().getHacerKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3183:1: ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_ID)||(LA49_0>=50 && LA49_0<=52)||LA49_0==55||LA49_0==58||LA49_0==60||LA49_0==63) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3183:2: ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3183:2: ( (lv_sentencias_5_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3184:1: (lv_sentencias_5_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3184:1: (lv_sentencias_5_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3185:3: lv_sentencias_5_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde7012);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3201:2: ( (lv_sentencias_6_0= ruleSentencias ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_ID)||(LA48_0>=50 && LA48_0<=52)||LA48_0==55||LA48_0==58||LA48_0==60||LA48_0==63) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3202:1: (lv_sentencias_6_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3202:1: (lv_sentencias_6_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3203:3: lv_sentencias_6_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde7033);
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
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruledesde7048); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3231:1: entryRuleCaso returns [EObject current=null] : iv_ruleCaso= ruleCaso EOF ;
    public final EObject entryRuleCaso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaso = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3232:2: (iv_ruleCaso= ruleCaso EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3233:2: iv_ruleCaso= ruleCaso EOF
            {
             newCompositeNode(grammarAccess.getCasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCaso_in_entryRuleCaso7084);
            iv_ruleCaso=ruleCaso();

            state._fsp--;

             current =iv_ruleCaso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCaso7094); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3240:1: ruleCaso returns [EObject current=null] : ( ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ':' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) ;
    public final EObject ruleCaso() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operador_0_0 = null;

        EObject lv_sentencias_2_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_devuelve_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3243:28: ( ( ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ':' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3244:1: ( ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ':' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3244:1: ( ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ':' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3244:2: ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ':' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )?
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3244:2: ( (lv_operador_0_0= ruleOperador ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3245:1: (lv_operador_0_0= ruleOperador )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3245:1: (lv_operador_0_0= ruleOperador )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3246:3: lv_operador_0_0= ruleOperador
            {
             
            	        newCompositeNode(grammarAccess.getCasoAccess().getOperadorOperadorParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleCaso7140);
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

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleCaso7152); 

                	newLeafNode(otherlv_1, grammarAccess.getCasoAccess().getColonKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3266:1: ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )?
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3266:2: ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3266:2: ( (lv_sentencias_2_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3267:1: (lv_sentencias_2_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3267:1: (lv_sentencias_2_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3268:3: lv_sentencias_2_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso7174);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3284:2: ( (lv_sentencias_3_0= ruleSentencias ) )*
                    loop50:
                    do {
                        int alt50=2;
                        alt50 = dfa50.predict(input);
                        switch (alt50) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3285:1: (lv_sentencias_3_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3285:1: (lv_sentencias_3_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3286:3: lv_sentencias_3_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso7195);
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
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3302:5: ( (lv_devuelve_4_0= ruleDevolver ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==88) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3303:1: (lv_devuelve_4_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3303:1: (lv_devuelve_4_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3304:3: lv_devuelve_4_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getDevuelveDevolverParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleCaso7219);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3328:1: entryRulesegun returns [EObject current=null] : iv_rulesegun= rulesegun EOF ;
    public final EObject entryRulesegun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesegun = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3329:2: (iv_rulesegun= rulesegun EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3330:2: iv_rulesegun= rulesegun EOF
            {
             newCompositeNode(grammarAccess.getSegunRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesegun_in_entryRulesegun7256);
            iv_rulesegun=rulesegun();

            state._fsp--;

             current =iv_rulesegun; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesegun7266); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3337:1: rulesegun returns [EObject current=null] : (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3340:28: ( (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3341:1: (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3341:1: (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3341:3: otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun'
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_63_in_rulesegun7303); 

                	newLeafNode(otherlv_0, grammarAccess.getSegunAccess().getSegun_seaKeyword_0());
                
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulesegun7315); 

                	newLeafNode(otherlv_1, grammarAccess.getSegunAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3349:1: ( (lv_valor_2_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3350:1: (lv_valor_2_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3350:1: (lv_valor_2_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3351:3: lv_valor_2_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getSegunAccess().getValorValorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rulesegun7336);
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

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulesegun7348); 

                	newLeafNode(otherlv_3, grammarAccess.getSegunAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_56_in_rulesegun7360); 

                	newLeafNode(otherlv_4, grammarAccess.getSegunAccess().getHacerKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3375:1: ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_CAR && LA54_0<=RULE_ID)||(LA54_0>=RULE_CAD && LA54_0<=RULE_INT)||LA54_0==32||LA54_0==71||(LA54_0>=74 && LA54_0<=75)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3375:2: ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3375:2: ( (lv_caso_5_0= ruleCaso ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3376:1: (lv_caso_5_0= ruleCaso )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3376:1: (lv_caso_5_0= ruleCaso )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3377:3: lv_caso_5_0= ruleCaso
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun7382);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3393:2: ( (lv_caso_6_0= ruleCaso ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( ((LA53_0>=RULE_CAR && LA53_0<=RULE_ID)||(LA53_0>=RULE_CAD && LA53_0<=RULE_INT)||LA53_0==32||LA53_0==71||(LA53_0>=74 && LA53_0<=75)) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3394:1: (lv_caso_6_0= ruleCaso )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3394:1: (lv_caso_6_0= ruleCaso )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3395:3: lv_caso_6_0= ruleCaso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun7403);
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
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,64,FollowSets000.FOLLOW_64_in_rulesegun7418); 

                	newLeafNode(otherlv_7, grammarAccess.getSegunAccess().getEn_otro_casoKeyword_6());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3415:1: ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_STRING && LA56_0<=RULE_ID)||(LA56_0>=50 && LA56_0<=52)||LA56_0==55||LA56_0==58||LA56_0==60||LA56_0==63) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3415:2: ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3415:2: ( (lv_sentencias_8_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3416:1: (lv_sentencias_8_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3416:1: (lv_sentencias_8_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3417:3: lv_sentencias_8_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun7440);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3433:2: ( (lv_sentencias_9_0= ruleSentencias ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( ((LA55_0>=RULE_STRING && LA55_0<=RULE_ID)||(LA55_0>=50 && LA55_0<=52)||LA55_0==55||LA55_0==58||LA55_0==60||LA55_0==63) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3434:1: (lv_sentencias_9_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3434:1: (lv_sentencias_9_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3435:3: lv_sentencias_9_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun7461);
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
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3451:5: ( (lv_devuelve_10_0= ruleDevolver ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==88) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3452:1: (lv_devuelve_10_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3452:1: (lv_devuelve_10_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3453:3: lv_devuelve_10_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getDevuelveDevolverParserRuleCall_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_rulesegun7485);
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

            otherlv_11=(Token)match(input,65,FollowSets000.FOLLOW_65_in_rulesegun7498); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3481:1: entryRuleincremento returns [EObject current=null] : iv_ruleincremento= ruleincremento EOF ;
    public final EObject entryRuleincremento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleincremento = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3482:2: (iv_ruleincremento= ruleincremento EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3483:2: iv_ruleincremento= ruleincremento EOF
            {
             newCompositeNode(grammarAccess.getIncrementoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleincremento_in_entryRuleincremento7534);
            iv_ruleincremento=ruleincremento();

            state._fsp--;

             current =iv_ruleincremento; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleincremento7544); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3490:1: ruleincremento returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) ) ) ;
    public final EObject ruleincremento() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_ssigno_1_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3493:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3494:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3494:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3494:2: ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3494:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3495:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3495:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3496:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIncrementoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleincremento7590);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3512:2: ( (lv_ssigno_1_0= ruleinc ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3513:1: (lv_ssigno_1_0= ruleinc )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3513:1: (lv_ssigno_1_0= ruleinc )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3514:3: lv_ssigno_1_0= ruleinc
            {
             
            	        newCompositeNode(grammarAccess.getIncrementoAccess().getSsignoIncParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_ruleincremento7611);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3538:1: entryRuleunaria returns [EObject current=null] : iv_ruleunaria= ruleunaria EOF ;
    public final EObject entryRuleunaria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunaria = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3539:2: (iv_ruleunaria= ruleunaria EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3540:2: iv_ruleunaria= ruleunaria EOF
            {
             newCompositeNode(grammarAccess.getUnariaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleunaria_in_entryRuleunaria7647);
            iv_ruleunaria=ruleunaria();

            state._fsp--;

             current =iv_ruleunaria; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleunaria7657); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3547:1: ruleunaria returns [EObject current=null] : (otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')' ) ;
    public final EObject ruleunaria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_ssigno_1_0 = null;

        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3550:28: ( (otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3551:1: (otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3551:1: (otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3551:3: otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleunaria7694); 

                	newLeafNode(otherlv_0, grammarAccess.getUnariaAccess().getLeftParenthesisKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3555:1: ( (lv_ssigno_1_0= ruleinc ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3556:1: (lv_ssigno_1_0= ruleinc )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3556:1: (lv_ssigno_1_0= ruleinc )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3557:3: lv_ssigno_1_0= ruleinc
            {
             
            	        newCompositeNode(grammarAccess.getUnariaAccess().getSsignoIncParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_ruleunaria7715);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3573:2: ( (lv_variable_2_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3574:1: (lv_variable_2_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3574:1: (lv_variable_2_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3575:3: lv_variable_2_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getUnariaAccess().getVariableValorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleunaria7736);
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

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleunaria7748); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3603:1: entryRuleTipoVariable returns [String current=null] : iv_ruleTipoVariable= ruleTipoVariable EOF ;
    public final String entryRuleTipoVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoVariable = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3604:2: (iv_ruleTipoVariable= ruleTipoVariable EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3605:2: iv_ruleTipoVariable= ruleTipoVariable EOF
            {
             newCompositeNode(grammarAccess.getTipoVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable7785);
            iv_ruleTipoVariable=ruleTipoVariable();

            state._fsp--;

             current =iv_ruleTipoVariable.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoVariable7796); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3612:1: ruleTipoVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' ) ;
    public final AntlrDatatypeRuleToken ruleTipoVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3615:28: ( (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3616:1: (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3616:1: (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' )
            int alt58=5;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt58=1;
                }
                break;
            case 67:
                {
                alt58=2;
                }
                break;
            case 68:
                {
                alt58=3;
                }
                break;
            case 69:
                {
                alt58=4;
                }
                break;
            case 70:
                {
                alt58=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3617:2: kw= 'entero'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleTipoVariable7834); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getEnteroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3624:2: kw= 'caracter'
                    {
                    kw=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleTipoVariable7853); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getCaracterKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3631:2: kw= 'real'
                    {
                    kw=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleTipoVariable7872); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getRealKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3638:2: kw= 'logico'
                    {
                    kw=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleTipoVariable7891); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getLogicoKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3645:2: kw= 'cadena'
                    {
                    kw=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleTipoVariable7910); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3658:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3659:2: (iv_ruleVariable= ruleVariable EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3660:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable7950);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable7960); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3667:1: ruleVariable returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_Mat_1_0=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3670:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3671:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3671:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3671:2: ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3671:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3672:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3672:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3673:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable8006);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3689:2: ( (lv_Mat_1_0= RULE_MAT ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_MAT) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3690:1: (lv_Mat_1_0= RULE_MAT )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3690:1: (lv_Mat_1_0= RULE_MAT )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3691:3: lv_Mat_1_0= RULE_MAT
            	    {
            	    lv_Mat_1_0=(Token)match(input,RULE_MAT,FollowSets000.FOLLOW_RULE_MAT_in_ruleVariable8023); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVariableID"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3715:1: entryRuleVariableID returns [EObject current=null] : iv_ruleVariableID= ruleVariableID EOF ;
    public final EObject entryRuleVariableID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableID = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3716:2: (iv_ruleVariableID= ruleVariableID EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3717:2: iv_ruleVariableID= ruleVariableID EOF
            {
             newCompositeNode(grammarAccess.getVariableIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_entryRuleVariableID8065);
            iv_ruleVariableID=ruleVariableID();

            state._fsp--;

             current =iv_ruleVariableID; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableID8075); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3724:1: ruleVariableID returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* ) ;
    public final EObject ruleVariableID() throws RecognitionException {
        EObject current = null;

        Token lv_Mat_1_0=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3727:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3728:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3728:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3728:2: ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3728:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3729:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3729:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3730:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableIDAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariableID8121);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3746:2: ( (lv_Mat_1_0= RULE_MAT ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_MAT) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3747:1: (lv_Mat_1_0= RULE_MAT )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3747:1: (lv_Mat_1_0= RULE_MAT )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3748:3: lv_Mat_1_0= RULE_MAT
            	    {
            	    lv_Mat_1_0=(Token)match(input,RULE_MAT,FollowSets000.FOLLOW_RULE_MAT_in_ruleVariableID8138); 

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
            	    break loop60;
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3772:1: entryRuleConstCadena returns [EObject current=null] : iv_ruleConstCadena= ruleConstCadena EOF ;
    public final EObject entryRuleConstCadena() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstCadena = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3773:2: (iv_ruleConstCadena= ruleConstCadena EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3774:2: iv_ruleConstCadena= ruleConstCadena EOF
            {
             newCompositeNode(grammarAccess.getConstCadenaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_entryRuleConstCadena8180);
            iv_ruleConstCadena=ruleConstCadena();

            state._fsp--;

             current =iv_ruleConstCadena; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstCadena8190); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3781:1: ruleConstCadena returns [EObject current=null] : ( (lv_contenido_0_0= RULE_CAD ) ) ;
    public final EObject ruleConstCadena() throws RecognitionException {
        EObject current = null;

        Token lv_contenido_0_0=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3784:28: ( ( (lv_contenido_0_0= RULE_CAD ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3785:1: ( (lv_contenido_0_0= RULE_CAD ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3785:1: ( (lv_contenido_0_0= RULE_CAD ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3786:1: (lv_contenido_0_0= RULE_CAD )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3786:1: (lv_contenido_0_0= RULE_CAD )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3787:3: lv_contenido_0_0= RULE_CAD
            {
            lv_contenido_0_0=(Token)match(input,RULE_CAD,FollowSets000.FOLLOW_RULE_CAD_in_ruleConstCadena8231); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3811:1: entryRuleNumeroEntero returns [EObject current=null] : iv_ruleNumeroEntero= ruleNumeroEntero EOF ;
    public final EObject entryRuleNumeroEntero() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeroEntero = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3812:2: (iv_ruleNumeroEntero= ruleNumeroEntero EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3813:2: iv_ruleNumeroEntero= ruleNumeroEntero EOF
            {
             newCompositeNode(grammarAccess.getNumeroEnteroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_entryRuleNumeroEntero8271);
            iv_ruleNumeroEntero=ruleNumeroEntero();

            state._fsp--;

             current =iv_ruleNumeroEntero; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumeroEntero8281); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3820:1: ruleNumeroEntero returns [EObject current=null] : ( (lv_valor_0_0= ruleEInt ) ) ;
    public final EObject ruleNumeroEntero() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3823:28: ( ( (lv_valor_0_0= ruleEInt ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3824:1: ( (lv_valor_0_0= ruleEInt ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3824:1: ( (lv_valor_0_0= ruleEInt ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3825:1: (lv_valor_0_0= ruleEInt )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3825:1: (lv_valor_0_0= ruleEInt )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3826:3: lv_valor_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getNumeroEnteroAccess().getValorEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumeroEntero8326);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3850:1: entryRuleNumeroDecimal returns [EObject current=null] : iv_ruleNumeroDecimal= ruleNumeroDecimal EOF ;
    public final EObject entryRuleNumeroDecimal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeroDecimal = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3851:2: (iv_ruleNumeroDecimal= ruleNumeroDecimal EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3852:2: iv_ruleNumeroDecimal= ruleNumeroDecimal EOF
            {
             newCompositeNode(grammarAccess.getNumeroDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_entryRuleNumeroDecimal8361);
            iv_ruleNumeroDecimal=ruleNumeroDecimal();

            state._fsp--;

             current =iv_ruleNumeroDecimal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumeroDecimal8371); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3859:1: ruleNumeroDecimal returns [EObject current=null] : ( (lv_valor_0_0= ruleEFloat ) ) ;
    public final EObject ruleNumeroDecimal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3862:28: ( ( (lv_valor_0_0= ruleEFloat ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3863:1: ( (lv_valor_0_0= ruleEFloat ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3863:1: ( (lv_valor_0_0= ruleEFloat ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3864:1: (lv_valor_0_0= ruleEFloat )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3864:1: (lv_valor_0_0= ruleEFloat )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3865:3: lv_valor_0_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getNumeroDecimalAccess().getValorEFloatParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleNumeroDecimal8416);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3889:1: entryRuleValorBooleano returns [EObject current=null] : iv_ruleValorBooleano= ruleValorBooleano EOF ;
    public final EObject entryRuleValorBooleano() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorBooleano = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3890:2: (iv_ruleValorBooleano= ruleValorBooleano EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3891:2: iv_ruleValorBooleano= ruleValorBooleano EOF
            {
             newCompositeNode(grammarAccess.getValorBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_entryRuleValorBooleano8451);
            iv_ruleValorBooleano=ruleValorBooleano();

            state._fsp--;

             current =iv_ruleValorBooleano; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValorBooleano8461); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3898:1: ruleValorBooleano returns [EObject current=null] : ( (lv_valor_0_0= rulebooleano ) ) ;
    public final EObject ruleValorBooleano() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3901:28: ( ( (lv_valor_0_0= rulebooleano ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3902:1: ( (lv_valor_0_0= rulebooleano ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3902:1: ( (lv_valor_0_0= rulebooleano ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3903:1: (lv_valor_0_0= rulebooleano )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3903:1: (lv_valor_0_0= rulebooleano )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3904:3: lv_valor_0_0= rulebooleano
            {
             
            	        newCompositeNode(grammarAccess.getValorBooleanoAccess().getValorBooleanoParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulebooleano_in_ruleValorBooleano8506);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3928:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3929:2: (iv_ruleEInt= ruleEInt EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3930:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt8542);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt8553); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3937:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3940:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3941:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3941:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3941:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3941:2: (kw= '-' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==71) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3942:2: kw= '-'
                    {
                    kw=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleEInt8592); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt8609); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3962:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3963:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3964:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat8655);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat8666); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3971:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3974:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3975:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3975:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3975:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3975:2: (kw= '-' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==71) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3976:2: kw= '-'
                    {
                    kw=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleEFloat8705); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3981:3: (this_INT_1= RULE_INT )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_INT) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3981:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat8723); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEFloat8743); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat8758); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4001:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=72 && LA66_0<=73)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4001:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4001:2: (kw= 'E' | kw= 'e' )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==72) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==73) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4002:2: kw= 'E'
                            {
                            kw=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleEFloat8778); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4009:2: kw= 'e'
                            {
                            kw=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleEFloat8797); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4014:2: (kw= '-' )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==71) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4015:2: kw= '-'
                            {
                            kw=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleEFloat8812); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat8829); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4035:1: entryRulebooleano returns [String current=null] : iv_rulebooleano= rulebooleano EOF ;
    public final String entryRulebooleano() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebooleano = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4036:2: (iv_rulebooleano= rulebooleano EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4037:2: iv_rulebooleano= rulebooleano EOF
            {
             newCompositeNode(grammarAccess.getBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleano_in_entryRulebooleano8877);
            iv_rulebooleano=rulebooleano();

            state._fsp--;

             current =iv_rulebooleano.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulebooleano8888); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4044:1: rulebooleano returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'verdadero' | kw= 'falso' ) ;
    public final AntlrDatatypeRuleToken rulebooleano() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4047:28: ( (kw= 'verdadero' | kw= 'falso' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4048:1: (kw= 'verdadero' | kw= 'falso' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4048:1: (kw= 'verdadero' | kw= 'falso' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==74) ) {
                alt67=1;
            }
            else if ( (LA67_0==75) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4049:2: kw= 'verdadero'
                    {
                    kw=(Token)match(input,74,FollowSets000.FOLLOW_74_in_rulebooleano8926); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanoAccess().getVerdaderoKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4056:2: kw= 'falso'
                    {
                    kw=(Token)match(input,75,FollowSets000.FOLLOW_75_in_rulebooleano8945); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4069:1: entryRuleoperacion returns [EObject current=null] : iv_ruleoperacion= ruleoperacion EOF ;
    public final EObject entryRuleoperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperacion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4070:2: (iv_ruleoperacion= ruleoperacion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4071:2: iv_ruleoperacion= ruleoperacion EOF
            {
             newCompositeNode(grammarAccess.getOperacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_entryRuleoperacion8985);
            iv_ruleoperacion=ruleoperacion();

            state._fsp--;

             current =iv_ruleoperacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperacion8995); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4078:1: ruleoperacion returns [EObject current=null] : (otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')' ) ;
    public final EObject ruleoperacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_op_izq_1_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_op_der_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4081:28: ( (otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4082:1: (otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4082:1: (otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4082:3: otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleoperacion9032); 

                	newLeafNode(otherlv_0, grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4086:1: ( (lv_op_izq_1_0= ruleoperando_izq ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4087:1: (lv_op_izq_1_0= ruleoperando_izq )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4087:1: (lv_op_izq_1_0= ruleoperando_izq )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4088:3: lv_op_izq_1_0= ruleoperando_izq
            {
             
            	        newCompositeNode(grammarAccess.getOperacionAccess().getOp_izqOperando_izqParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperando_izq_in_ruleoperacion9053);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4104:2: ( (lv_signo_op_2_0= rulesigno ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4105:1: (lv_signo_op_2_0= rulesigno )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4105:1: (lv_signo_op_2_0= rulesigno )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4106:3: lv_signo_op_2_0= rulesigno
            {
             
            	        newCompositeNode(grammarAccess.getOperacionAccess().getSigno_opSignoParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulesigno_in_ruleoperacion9074);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4122:2: ( (lv_op_der_3_0= ruleoperando_der ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4123:1: (lv_op_der_3_0= ruleoperando_der )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4123:1: (lv_op_der_3_0= ruleoperando_der )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4124:3: lv_op_der_3_0= ruleoperando_der
            {
             
            	        newCompositeNode(grammarAccess.getOperacionAccess().getOp_derOperando_derParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperando_der_in_ruleoperacion9095);
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

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleoperacion9107); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4152:1: entryRulesigno returns [String current=null] : iv_rulesigno= rulesigno EOF ;
    public final String entryRulesigno() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesigno = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4153:2: (iv_rulesigno= rulesigno EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4154:2: iv_rulesigno= rulesigno EOF
            {
             newCompositeNode(grammarAccess.getSignoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesigno_in_entryRulesigno9144);
            iv_rulesigno=rulesigno();

            state._fsp--;

             current =iv_rulesigno.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesigno9155); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4161:1: rulesigno returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= 'y' | kw= 'o' | kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken rulesigno() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4164:28: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= 'y' | kw= 'o' | kw= '==' | kw= '!=' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4165:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= 'y' | kw= 'o' | kw= '==' | kw= '!=' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4165:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= 'y' | kw= 'o' | kw= '==' | kw= '!=' )
            int alt68=12;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt68=1;
                }
                break;
            case 71:
                {
                alt68=2;
                }
                break;
            case 77:
                {
                alt68=3;
                }
                break;
            case 78:
                {
                alt68=4;
                }
                break;
            case 79:
                {
                alt68=5;
                }
                break;
            case 80:
                {
                alt68=6;
                }
                break;
            case 81:
                {
                alt68=7;
                }
                break;
            case 82:
                {
                alt68=8;
                }
                break;
            case 83:
                {
                alt68=9;
                }
                break;
            case 84:
                {
                alt68=10;
                }
                break;
            case 85:
                {
                alt68=11;
                }
                break;
            case 86:
                {
                alt68=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4166:2: kw= '+'
                    {
                    kw=(Token)match(input,76,FollowSets000.FOLLOW_76_in_rulesigno9193); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4173:2: kw= '-'
                    {
                    kw=(Token)match(input,71,FollowSets000.FOLLOW_71_in_rulesigno9212); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4180:2: kw= '*'
                    {
                    kw=(Token)match(input,77,FollowSets000.FOLLOW_77_in_rulesigno9231); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getAsteriskKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4187:2: kw= '/'
                    {
                    kw=(Token)match(input,78,FollowSets000.FOLLOW_78_in_rulesigno9250); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getSolidusKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4194:2: kw= '<'
                    {
                    kw=(Token)match(input,79,FollowSets000.FOLLOW_79_in_rulesigno9269); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getLessThanSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4201:2: kw= '>'
                    {
                    kw=(Token)match(input,80,FollowSets000.FOLLOW_80_in_rulesigno9288); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getGreaterThanSignKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4208:2: kw= '>='
                    {
                    kw=(Token)match(input,81,FollowSets000.FOLLOW_81_in_rulesigno9307); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4215:2: kw= '<='
                    {
                    kw=(Token)match(input,82,FollowSets000.FOLLOW_82_in_rulesigno9326); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getLessThanSignEqualsSignKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4222:2: kw= 'y'
                    {
                    kw=(Token)match(input,83,FollowSets000.FOLLOW_83_in_rulesigno9345); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getYKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4229:2: kw= 'o'
                    {
                    kw=(Token)match(input,84,FollowSets000.FOLLOW_84_in_rulesigno9364); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getOKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4236:2: kw= '=='
                    {
                    kw=(Token)match(input,85,FollowSets000.FOLLOW_85_in_rulesigno9383); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getEqualsSignEqualsSignKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4243:2: kw= '!='
                    {
                    kw=(Token)match(input,86,FollowSets000.FOLLOW_86_in_rulesigno9402); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4256:1: entryRuleoperando_izq returns [EObject current=null] : iv_ruleoperando_izq= ruleoperando_izq EOF ;
    public final EObject entryRuleoperando_izq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperando_izq = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4257:2: (iv_ruleoperando_izq= ruleoperando_izq EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4258:2: iv_ruleoperando_izq= ruleoperando_izq EOF
            {
             newCompositeNode(grammarAccess.getOperando_izqRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_izq_in_entryRuleoperando_izq9442);
            iv_ruleoperando_izq=ruleoperando_izq();

            state._fsp--;

             current =iv_ruleoperando_izq; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperando_izq9452); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4265:1: ruleoperando_izq returns [EObject current=null] : ( (lv_oper_izq_0_0= rulevalor ) ) ;
    public final EObject ruleoperando_izq() throws RecognitionException {
        EObject current = null;

        EObject lv_oper_izq_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4268:28: ( ( (lv_oper_izq_0_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4269:1: ( (lv_oper_izq_0_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4269:1: ( (lv_oper_izq_0_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4270:1: (lv_oper_izq_0_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4270:1: (lv_oper_izq_0_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4271:3: lv_oper_izq_0_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getOperando_izqAccess().getOper_izqValorParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleoperando_izq9497);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4295:1: entryRuleoperando_der returns [EObject current=null] : iv_ruleoperando_der= ruleoperando_der EOF ;
    public final EObject entryRuleoperando_der() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperando_der = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4296:2: (iv_ruleoperando_der= ruleoperando_der EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4297:2: iv_ruleoperando_der= ruleoperando_der EOF
            {
             newCompositeNode(grammarAccess.getOperando_derRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_der_in_entryRuleoperando_der9532);
            iv_ruleoperando_der=ruleoperando_der();

            state._fsp--;

             current =iv_ruleoperando_der; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperando_der9542); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4304:1: ruleoperando_der returns [EObject current=null] : ( (lv_oper_der_0_0= rulevalor ) ) ;
    public final EObject ruleoperando_der() throws RecognitionException {
        EObject current = null;

        EObject lv_oper_der_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4307:28: ( ( (lv_oper_der_0_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4308:1: ( (lv_oper_der_0_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4308:1: ( (lv_oper_der_0_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4309:1: (lv_oper_der_0_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4309:1: (lv_oper_der_0_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4310:3: lv_oper_der_0_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getOperando_derAccess().getOper_derValorParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleoperando_der9587);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4334:1: entryRuleSino returns [EObject current=null] : iv_ruleSino= ruleSino EOF ;
    public final EObject entryRuleSino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSino = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4335:2: (iv_ruleSino= ruleSino EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4336:2: iv_ruleSino= ruleSino EOF
            {
             newCompositeNode(grammarAccess.getSinoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSino_in_entryRuleSino9622);
            iv_ruleSino=ruleSino();

            state._fsp--;

             current =iv_ruleSino; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSino9632); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4343:1: ruleSino returns [EObject current=null] : ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) ;
    public final EObject ruleSino() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sentencias_2_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_devuelve_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4346:28: ( ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4347:1: ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4347:1: ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4347:2: () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )?
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4347:2: ()
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4348:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSinoAccess().getSinoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleSino9678); 

                	newLeafNode(otherlv_1, grammarAccess.getSinoAccess().getSinoKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4357:1: ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=RULE_STRING && LA70_0<=RULE_ID)||(LA70_0>=50 && LA70_0<=52)||LA70_0==55||LA70_0==58||LA70_0==60||LA70_0==63) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4357:2: ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4357:2: ( (lv_sentencias_2_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4358:1: (lv_sentencias_2_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4358:1: (lv_sentencias_2_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4359:3: lv_sentencias_2_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino9700);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4375:2: ( (lv_sentencias_3_0= ruleSentencias ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( ((LA69_0>=RULE_STRING && LA69_0<=RULE_ID)||(LA69_0>=50 && LA69_0<=52)||LA69_0==55||LA69_0==58||LA69_0==60||LA69_0==63) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4376:1: (lv_sentencias_3_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4376:1: (lv_sentencias_3_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4377:3: lv_sentencias_3_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino9721);
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
                    	    break loop69;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4393:5: ( (lv_devuelve_4_0= ruleDevolver ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==88) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4394:1: (lv_devuelve_4_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4394:1: (lv_devuelve_4_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4395:3: lv_devuelve_4_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getDevuelveDevolverParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSino9745);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4419:1: entryRuleDevolver returns [EObject current=null] : iv_ruleDevolver= ruleDevolver EOF ;
    public final EObject entryRuleDevolver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevolver = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4420:2: (iv_ruleDevolver= ruleDevolver EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4421:2: iv_ruleDevolver= ruleDevolver EOF
            {
             newCompositeNode(grammarAccess.getDevolverRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_entryRuleDevolver9782);
            iv_ruleDevolver=ruleDevolver();

            state._fsp--;

             current =iv_ruleDevolver; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDevolver9792); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4428:1: ruleDevolver returns [EObject current=null] : ( () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')' ) ;
    public final EObject ruleDevolver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_devuelve_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4431:28: ( ( () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4432:1: ( () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4432:1: ( () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4432:2: () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4432:2: ()
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4433:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDevolverAccess().getDevolverAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleDevolver9838); 

                	newLeafNode(otherlv_1, grammarAccess.getDevolverAccess().getDevolverKeyword_1());
                
            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDevolver9850); 

                	newLeafNode(otherlv_2, grammarAccess.getDevolverAccess().getLeftParenthesisKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4446:1: ( (lv_devuelve_3_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4447:1: (lv_devuelve_3_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4447:1: (lv_devuelve_3_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4448:3: lv_devuelve_3_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getDevolverAccess().getDevuelveValorParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleDevolver9871);
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

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDevolver9883); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4476:1: entryRuleinc returns [String current=null] : iv_ruleinc= ruleinc EOF ;
    public final String entryRuleinc() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinc = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4477:2: (iv_ruleinc= ruleinc EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4478:2: iv_ruleinc= ruleinc EOF
            {
             newCompositeNode(grammarAccess.getIncRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_entryRuleinc9920);
            iv_ruleinc=ruleinc();

            state._fsp--;

             current =iv_ruleinc.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleinc9931); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4485:1: ruleinc returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '++' | kw= '--' | kw= 'no' ) ;
    public final AntlrDatatypeRuleToken ruleinc() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4488:28: ( (kw= '++' | kw= '--' | kw= 'no' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4489:1: (kw= '++' | kw= '--' | kw= 'no' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4489:1: (kw= '++' | kw= '--' | kw= 'no' )
            int alt72=3;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt72=1;
                }
                break;
            case 90:
                {
                alt72=2;
                }
                break;
            case 91:
                {
                alt72=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4490:2: kw= '++'
                    {
                    kw=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleinc9969); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIncAccess().getPlusSignPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4497:2: kw= '--'
                    {
                    kw=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleinc9988); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIncAccess().getHyphenMinusHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4504:2: kw= 'no'
                    {
                    kw=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleinc10007); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4517:1: entryRuleParametroFuncion returns [EObject current=null] : iv_ruleParametroFuncion= ruleParametroFuncion EOF ;
    public final EObject entryRuleParametroFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametroFuncion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4518:2: (iv_ruleParametroFuncion= ruleParametroFuncion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4519:2: iv_ruleParametroFuncion= ruleParametroFuncion EOF
            {
             newCompositeNode(grammarAccess.getParametroFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion10047);
            iv_ruleParametroFuncion=ruleParametroFuncion();

            state._fsp--;

             current =iv_ruleParametroFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametroFuncion10057); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4526:1: ruleParametroFuncion returns [EObject current=null] : ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipoVariable ) )+ otherlv_2= ':' ( (lv_variable_3_0= ruleVariable ) ) ) ;
    public final EObject ruleParametroFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_paso_0_0 = null;

        AntlrDatatypeRuleToken lv_tipo_1_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4529:28: ( ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipoVariable ) )+ otherlv_2= ':' ( (lv_variable_3_0= ruleVariable ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4530:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipoVariable ) )+ otherlv_2= ':' ( (lv_variable_3_0= ruleVariable ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4530:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipoVariable ) )+ otherlv_2= ':' ( (lv_variable_3_0= ruleVariable ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4530:2: ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipoVariable ) )+ otherlv_2= ':' ( (lv_variable_3_0= ruleVariable ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4530:2: ( (lv_paso_0_0= ruleTipoPaso ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4531:1: (lv_paso_0_0= ruleTipoPaso )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4531:1: (lv_paso_0_0= ruleTipoPaso )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4532:3: lv_paso_0_0= ruleTipoPaso
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_ruleParametroFuncion10103);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4548:2: ( (lv_tipo_1_0= ruleTipoVariable ) )+
            int cnt73=0;
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( ((LA73_0>=66 && LA73_0<=70)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4549:1: (lv_tipo_1_0= ruleTipoVariable )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4549:1: (lv_tipo_1_0= ruleTipoVariable )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4550:3: lv_tipo_1_0= ruleTipoVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getTipoTipoVariableParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleParametroFuncion10124);
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
            	    if ( cnt73 >= 1 ) break loop73;
                        EarlyExitException eee =
                            new EarlyExitException(73, input);
                        throw eee;
                }
                cnt73++;
            } while (true);

            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleParametroFuncion10137); 

                	newLeafNode(otherlv_2, grammarAccess.getParametroFuncionAccess().getColonKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4570:1: ( (lv_variable_3_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4571:1: (lv_variable_3_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4571:1: (lv_variable_3_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4572:3: lv_variable_3_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleParametroFuncion10158);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4596:1: entryRuleFuncion returns [EObject current=null] : iv_ruleFuncion= ruleFuncion EOF ;
    public final EObject entryRuleFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4597:2: (iv_ruleFuncion= ruleFuncion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4598:2: iv_ruleFuncion= ruleFuncion EOF
            {
             newCompositeNode(grammarAccess.getFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_entryRuleFuncion10194);
            iv_ruleFuncion=ruleFuncion();

            state._fsp--;

             current =iv_ruleFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncion10204); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4605:1: ruleFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4608:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4609:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4609:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4609:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4609:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4610:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4610:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4611:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleFuncion10250);
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

            otherlv_1=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleFuncion10262); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionAccess().getFuncionKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4631:1: ( (lv_nombre_2_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4632:1: (lv_nombre_2_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4632:1: (lv_nombre_2_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4633:3: lv_nombre_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getNombreEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFuncion10283);
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

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFuncion10295); 

                	newLeafNode(otherlv_3, grammarAccess.getFuncionAccess().getLeftParenthesisKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4653:1: ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==72||(LA75_0>=96 && LA75_0<=97)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4653:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4653:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4654:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4654:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4655:3: lv_parametrofuncion_4_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion10317);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4671:2: (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==18) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4671:4: otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFuncion10330); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getFuncionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4675:1: ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4676:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4676:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4677:3: lv_parametrofuncion_6_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion10351);
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
                    	    break loop74;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFuncion10367); 

                	newLeafNode(otherlv_7, grammarAccess.getFuncionAccess().getRightParenthesisKeyword_5());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4697:1: (otherlv_8= 'const' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==14) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4697:3: otherlv_8= 'const'
                    {
                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFuncion10380); 

                        	newLeafNode(otherlv_8, grammarAccess.getFuncionAccess().getConstKeyword_6());
                        

                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4701:3: (otherlv_9= 'tipo' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==15) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4701:5: otherlv_9= 'tipo'
                    {
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFuncion10395); 

                        	newLeafNode(otherlv_9, grammarAccess.getFuncionAccess().getTipoKeyword_7());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleFuncion10409); 

                	newLeafNode(otherlv_10, grammarAccess.getFuncionAccess().getVarKeyword_8());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4709:1: ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=RULE_STRING && LA79_0<=RULE_ID)||(LA79_0>=66 && LA79_0<=70)) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4709:2: ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4709:2: ( (lv_declaracion_11_0= ruleDeclaracion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4710:1: (lv_declaracion_11_0= ruleDeclaracion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4710:1: (lv_declaracion_11_0= ruleDeclaracion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4711:3: lv_declaracion_11_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_9_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion10431);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4727:2: ( (lv_declaracion_12_0= ruleDeclaracion ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( ((LA78_0>=RULE_STRING && LA78_0<=RULE_ID)||(LA78_0>=66 && LA78_0<=70)) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4728:1: (lv_declaracion_12_0= ruleDeclaracion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4728:1: (lv_declaracion_12_0= ruleDeclaracion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4729:3: lv_declaracion_12_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion10452);
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
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleFuncion10467); 

                	newLeafNode(otherlv_13, grammarAccess.getFuncionAccess().getInicioKeyword_10());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4749:1: ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=RULE_STRING && LA81_0<=RULE_ID)||(LA81_0>=50 && LA81_0<=52)||LA81_0==55||LA81_0==58||LA81_0==60||LA81_0==63) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4749:2: ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4749:2: ( (lv_sentencias_14_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4750:1: (lv_sentencias_14_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4750:1: (lv_sentencias_14_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4751:3: lv_sentencias_14_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_11_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion10489);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4767:2: ( (lv_sentencias_15_0= ruleSentencias ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( ((LA80_0>=RULE_STRING && LA80_0<=RULE_ID)||(LA80_0>=50 && LA80_0<=52)||LA80_0==55||LA80_0==58||LA80_0==60||LA80_0==63) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4768:1: (lv_sentencias_15_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4768:1: (lv_sentencias_15_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4769:3: lv_sentencias_15_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion10510);
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
                    	    break loop80;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4785:5: ( (lv_devuelve_16_0= ruleDevolver ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==88) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4786:1: (lv_devuelve_16_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4786:1: (lv_devuelve_16_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4787:3: lv_devuelve_16_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getDevuelveDevolverParserRuleCall_12_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleFuncion10534);
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

            otherlv_17=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleFuncion10547); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4815:1: entryRuleProcedimiento returns [EObject current=null] : iv_ruleProcedimiento= ruleProcedimiento EOF ;
    public final EObject entryRuleProcedimiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedimiento = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4816:2: (iv_ruleProcedimiento= ruleProcedimiento EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4817:2: iv_ruleProcedimiento= ruleProcedimiento EOF
            {
             newCompositeNode(grammarAccess.getProcedimientoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento10583);
            iv_ruleProcedimiento=ruleProcedimiento();

            state._fsp--;

             current =iv_ruleProcedimiento; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcedimiento10593); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4824:1: ruleProcedimiento returns [EObject current=null] : (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4827:28: ( (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4828:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4828:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4828:3: otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento'
            {
            otherlv_0=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleProcedimiento10630); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedimientoAccess().getProcedimientoKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4832:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4833:1: (lv_nombre_1_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4833:1: (lv_nombre_1_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4834:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProcedimientoAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcedimiento10651);
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

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProcedimiento10663); 

                	newLeafNode(otherlv_2, grammarAccess.getProcedimientoAccess().getLeftParenthesisKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4854:1: ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==72||(LA84_0>=96 && LA84_0<=97)) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4854:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4854:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4855:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4855:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4856:3: lv_parametrofuncion_3_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento10685);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4872:2: (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==18) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4872:4: otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProcedimiento10698); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getProcedimientoAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4876:1: ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4877:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4877:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4878:3: lv_parametrofuncion_5_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento10719);
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
                    	    break loop83;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProcedimiento10735); 

                	newLeafNode(otherlv_6, grammarAccess.getProcedimientoAccess().getRightParenthesisKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4898:1: (otherlv_7= 'const' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==14) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4898:3: otherlv_7= 'const'
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProcedimiento10748); 

                        	newLeafNode(otherlv_7, grammarAccess.getProcedimientoAccess().getConstKeyword_5());
                        

                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4902:3: (otherlv_8= 'tipo' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==15) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4902:5: otherlv_8= 'tipo'
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProcedimiento10763); 

                        	newLeafNode(otherlv_8, grammarAccess.getProcedimientoAccess().getTipoKeyword_6());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleProcedimiento10777); 

                	newLeafNode(otherlv_9, grammarAccess.getProcedimientoAccess().getVarKeyword_7());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4910:1: ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( ((LA88_0>=RULE_STRING && LA88_0<=RULE_ID)||(LA88_0>=66 && LA88_0<=70)) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4910:2: ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4910:2: ( (lv_declaracion_10_0= ruleDeclaracion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4911:1: (lv_declaracion_10_0= ruleDeclaracion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4911:1: (lv_declaracion_10_0= ruleDeclaracion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4912:3: lv_declaracion_10_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_8_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento10799);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4928:2: ( (lv_declaracion_11_0= ruleDeclaracion ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( ((LA87_0>=RULE_STRING && LA87_0<=RULE_ID)||(LA87_0>=66 && LA87_0<=70)) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4929:1: (lv_declaracion_11_0= ruleDeclaracion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4929:1: (lv_declaracion_11_0= ruleDeclaracion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4930:3: lv_declaracion_11_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento10820);
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
                    	    break loop87;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleProcedimiento10835); 

                	newLeafNode(otherlv_12, grammarAccess.getProcedimientoAccess().getInicioKeyword_9());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4950:1: ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( ((LA90_0>=RULE_STRING && LA90_0<=RULE_ID)||(LA90_0>=50 && LA90_0<=52)||LA90_0==55||LA90_0==58||LA90_0==60||LA90_0==63) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4950:2: ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4950:2: ( (lv_sentencias_13_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4951:1: (lv_sentencias_13_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4951:1: (lv_sentencias_13_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4952:3: lv_sentencias_13_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_10_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento10857);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4968:2: ( (lv_sentencias_14_0= ruleSentencias ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( ((LA89_0>=RULE_STRING && LA89_0<=RULE_ID)||(LA89_0>=50 && LA89_0<=52)||LA89_0==55||LA89_0==58||LA89_0==60||LA89_0==63) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4969:1: (lv_sentencias_14_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4969:1: (lv_sentencias_14_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4970:3: lv_sentencias_14_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento10878);
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
                    	    break loop89;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,95,FollowSets000.FOLLOW_95_in_ruleProcedimiento10893); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4998:1: entryRuleTipoPaso returns [String current=null] : iv_ruleTipoPaso= ruleTipoPaso EOF ;
    public final String entryRuleTipoPaso() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoPaso = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4999:2: (iv_ruleTipoPaso= ruleTipoPaso EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5000:2: iv_ruleTipoPaso= ruleTipoPaso EOF
            {
             newCompositeNode(grammarAccess.getTipoPasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso10930);
            iv_ruleTipoPaso=ruleTipoPaso();

            state._fsp--;

             current =iv_ruleTipoPaso.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoPaso10941); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5007:1: ruleTipoPaso returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'E' | kw= 'E/S' | kw= 'S' ) ;
    public final AntlrDatatypeRuleToken ruleTipoPaso() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5010:28: ( (kw= 'E' | kw= 'E/S' | kw= 'S' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5011:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5011:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            int alt91=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt91=1;
                }
                break;
            case 96:
                {
                alt91=2;
                }
                break;
            case 97:
                {
                alt91=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5012:2: kw= 'E'
                    {
                    kw=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleTipoPaso10979); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5019:2: kw= 'E/S'
                    {
                    kw=(Token)match(input,96,FollowSets000.FOLLOW_96_in_ruleTipoPaso10998); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getESKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5026:2: kw= 'S'
                    {
                    kw=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleTipoPaso11017); 

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


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA50 dfa50 = new DFA50(this);
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\1\5\4\uffff\2\41\1\11\2\uffff";
    static final String DFA11_maxS =
        "\1\52\4\uffff\2\41\1\107\2\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\5\1\6";
    static final String DFA11_specialS =
        "\12\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\5\1\6\33\uffff\1\1\4\uffff\1\2\1\3\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "\1\7",
            "\1\7",
            "\1\11\42\uffff\1\10\32\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "314:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )";
        }
    }
    static final String DFA13_eotS =
        "\62\uffff";
    static final String DFA13_eofS =
        "\24\uffff\2\33\2\uffff\1\33\16\uffff\2\33\1\uffff\1\33\7\uffff";
    static final String DFA13_minS =
        "\1\5\2\7\3\uffff\1\4\2\uffff\1\5\1\uffff\2\7\2\36\1\11\1\36\1\11"+
        "\2\36\2\4\1\7\2\4\1\36\1\5\1\uffff\2\7\2\37\1\11\1\37\1\11\2\37"+
        "\2\11\2\4\1\7\1\4\1\37\1\11\1\36\3\11\1\37";
    static final String DFA13_maxS =
        "\1\77\2\133\3\uffff\1\113\2\uffff\1\6\1\uffff\4\37\2\40\1\11\2\37"+
        "\2\137\1\37\1\113\1\137\1\111\1\11\1\uffff\4\37\2\40\1\11\2\37\2"+
        "\107\2\137\1\37\1\137\1\111\1\11\1\37\2\107\1\11\1\37";
    static final String DFA13_acceptS =
        "\3\uffff\1\3\1\4\1\6\1\uffff\1\5\1\1\1\uffff\1\2\20\uffff\1\7\26"+
        "\uffff";
    static final String DFA13_specialS =
        "\62\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\2\53\uffff\1\3\1\4\1\5\2\uffff\1\5\2\uffff\1\5\1\uffff"+
            "\1\5\2\uffff\1\5",
            "\1\12\11\uffff\1\10\13\uffff\1\6\2\uffff\1\11\1\12\67\uffff"+
            "\3\7",
            "\1\12\11\uffff\1\10\13\uffff\1\6\2\uffff\1\11\1\12\67\uffff"+
            "\3\7",
            "",
            "",
            "",
            "\1\16\1\13\1\14\1\uffff\1\15\1\20\26\uffff\1\21\46\uffff\1"+
            "\17\2\uffff\1\22\1\23",
            "",
            "",
            "\1\24\1\25",
            "",
            "\1\26\26\uffff\1\27\1\30",
            "\1\26\26\uffff\1\27\1\30",
            "\1\27\1\30",
            "\1\27\1\30",
            "\1\20\26\uffff\1\21",
            "\1\27\1\30\1\21",
            "\1\31",
            "\1\27\1\30",
            "\1\27\1\30",
            "\3\33\1\12\2\33\26\uffff\1\32\1\12\17\uffff\4\33\1\uffff\2"+
            "\33\1\uffff\4\33\1\uffff\4\33\5\uffff\1\33\2\uffff\2\33\13\uffff"+
            "\2\33\4\uffff\1\33\1\uffff\1\33",
            "\3\33\1\12\2\33\26\uffff\1\32\1\12\17\uffff\4\33\1\uffff\2"+
            "\33\1\uffff\4\33\1\uffff\4\33\5\uffff\1\33\2\uffff\2\33\13\uffff"+
            "\2\33\4\uffff\1\33\1\uffff\1\33",
            "\1\26\26\uffff\1\27\1\30",
            "\1\37\1\34\1\35\1\uffff\1\36\1\41\26\uffff\1\42\46\uffff\1"+
            "\40\2\uffff\1\43\1\44",
            "\3\33\1\12\2\33\26\uffff\1\33\1\12\17\uffff\4\33\1\uffff\2"+
            "\33\1\uffff\4\33\1\uffff\4\33\5\uffff\1\33\2\uffff\2\33\13\uffff"+
            "\2\33\4\uffff\1\33\1\uffff\1\33",
            "\1\27\1\30\50\uffff\1\45\1\46",
            "\1\47\1\50\2\uffff\1\33",
            "",
            "\1\51\27\uffff\1\52",
            "\1\51\27\uffff\1\52",
            "\1\52",
            "\1\52",
            "\1\41\26\uffff\1\42",
            "\1\52\1\42",
            "\1\53",
            "\1\52",
            "\1\52",
            "\1\55\75\uffff\1\54",
            "\1\55\75\uffff\1\54",
            "\3\33\1\12\2\33\26\uffff\1\32\1\12\17\uffff\4\33\1\uffff\2"+
            "\33\1\uffff\4\33\1\uffff\4\33\5\uffff\1\33\2\uffff\2\33\13\uffff"+
            "\2\33\4\uffff\1\33\1\uffff\1\33",
            "\3\33\1\12\2\33\26\uffff\1\32\1\12\17\uffff\4\33\1\uffff\2"+
            "\33\1\uffff\4\33\1\uffff\4\33\5\uffff\1\33\2\uffff\2\33\13\uffff"+
            "\2\33\4\uffff\1\33\1\uffff\1\33",
            "\1\51\27\uffff\1\52",
            "\3\33\1\12\2\33\26\uffff\1\33\1\12\17\uffff\4\33\1\uffff\2"+
            "\33\1\uffff\4\33\1\uffff\4\33\5\uffff\1\33\2\uffff\2\33\13\uffff"+
            "\2\33\4\uffff\1\33\1\uffff\1\33",
            "\1\52\50\uffff\1\56\1\57",
            "\1\55",
            "\1\27\1\30",
            "\1\61\75\uffff\1\60",
            "\1\61\75\uffff\1\60",
            "\1\61",
            "\1\52"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "434:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_Asignacion_1= ruleAsignacion | this_Escribir_2= ruleEscribir | this_Leer_3= ruleLeer | this_incremento_4= ruleincremento | this_Bloque_5= ruleBloque | this_ValorComplejo_6= ruleValorComplejo )";
        }
    }
    static final String DFA19_eotS =
        "\30\uffff";
    static final String DFA19_eofS =
        "\1\uffff\2\14\2\uffff\1\20\15\uffff\1\6\3\uffff\1\6";
    static final String DFA19_minS =
        "\3\4\1\uffff\1\11\1\4\1\uffff\1\4\3\uffff\1\5\3\uffff\1\11\3\uffff"+
        "\1\4\3\11\1\4";
    static final String DFA19_maxS =
        "\1\113\2\137\1\uffff\1\40\1\137\1\uffff\1\133\3\uffff\1\11\3\uffff"+
        "\1\11\3\uffff\1\137\2\107\1\11\1\137";
    static final String DFA19_acceptS =
        "\3\uffff\1\3\2\uffff\1\5\1\uffff\1\7\1\10\1\11\1\uffff\1\2\1\13"+
        "\1\1\1\uffff\1\4\1\6\1\12\5\uffff";
    static final String DFA19_specialS =
        "\30\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\11\1\1\1\2\1\uffff\1\3\1\5\7\uffff\1\7\2\uffff\11\12\3\uffff"+
            "\1\6\46\uffff\1\4\2\uffff\2\10",
            "\6\14\5\uffff\1\14\1\uffff\1\16\2\14\11\uffff\1\15\1\14\1\uffff"+
            "\1\13\3\uffff\1\14\10\uffff\1\14\1\uffff\1\14\1\uffff\27\14"+
            "\2\uffff\17\14\4\uffff\3\14",
            "\6\14\5\uffff\1\14\1\uffff\1\16\2\14\11\uffff\1\15\1\14\1\uffff"+
            "\1\13\3\uffff\1\14\10\uffff\1\14\1\uffff\1\14\1\uffff\27\14"+
            "\2\uffff\17\14\4\uffff\3\14",
            "",
            "\1\5\26\uffff\1\6",
            "\3\20\1\uffff\2\20\5\uffff\1\20\2\uffff\2\20\12\uffff\1\20"+
            "\1\uffff\1\17\3\uffff\1\20\10\uffff\1\20\1\uffff\1\20\1\uffff"+
            "\27\20\2\uffff\17\20\4\uffff\3\20",
            "",
            "\3\21\1\uffff\2\21\7\uffff\1\21\2\uffff\11\21\3\uffff\1\21"+
            "\46\uffff\1\21\2\uffff\2\21\15\uffff\3\22",
            "",
            "",
            "",
            "\2\15\2\uffff\1\14",
            "",
            "",
            "",
            "\1\23",
            "",
            "",
            "",
            "\3\6\1\uffff\2\6\5\uffff\1\6\2\uffff\2\6\12\uffff\1\6\1\uffff"+
            "\1\6\3\uffff\1\6\6\uffff\1\20\1\uffff\1\6\1\uffff\1\6\1\uffff"+
            "\27\6\1\24\1\25\17\6\4\uffff\3\6",
            "\1\27\75\uffff\1\26",
            "\1\27\75\uffff\1\26",
            "\1\27",
            "\3\6\1\uffff\2\6\5\uffff\1\6\2\uffff\2\6\12\uffff\1\6\1\uffff"+
            "\1\6\3\uffff\1\6\6\uffff\1\20\1\uffff\1\6\1\uffff\1\6\1\uffff"+
            "\27\6\2\uffff\17\6\4\uffff\3\6"
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "923:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria | this_ValorComplejo_10= ruleValorComplejo )";
        }
    }
    static final String DFA20_eotS =
        "\26\uffff";
    static final String DFA20_eofS =
        "\26\uffff";
    static final String DFA20_minS =
        "\1\5\2\35\1\uffff\1\4\2\7\2\36\1\11\1\36\1\11\2\36\1\7\2\uffff\1"+
        "\36\3\11\1\36";
    static final String DFA20_maxS =
        "\1\6\2\40\1\uffff\1\113\4\37\2\40\1\11\3\37\2\uffff\1\111\2\107"+
        "\1\11\1\37";
    static final String DFA20_acceptS =
        "\3\uffff\1\1\13\uffff\1\2\1\3\5\uffff";
    static final String DFA20_specialS =
        "\26\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\1\2",
            "\1\4\2\uffff\1\3",
            "\1\4\2\uffff\1\3",
            "",
            "\1\10\1\5\1\6\1\uffff\1\7\1\12\26\uffff\1\13\46\uffff\1\11"+
            "\2\uffff\1\14\1\15",
            "\1\16\26\uffff\1\20\1\17",
            "\1\16\26\uffff\1\20\1\17",
            "\1\20\1\17",
            "\1\20\1\17",
            "\1\12\26\uffff\1\13",
            "\1\20\1\17\1\13",
            "\1\21",
            "\1\20\1\17",
            "\1\20\1\17",
            "\1\16\26\uffff\1\20\1\17",
            "",
            "",
            "\1\20\1\17\50\uffff\1\22\1\23",
            "\1\25\75\uffff\1\24",
            "\1\25\75\uffff\1\24",
            "\1\25",
            "\1\20\1\17"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1053:1: (this_ValorRegistro_0= ruleValorRegistro | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz )";
        }
    }
    static final String DFA51_eotS =
        "\6\uffff";
    static final String DFA51_eofS =
        "\1\4\5\uffff";
    static final String DFA51_minS =
        "\1\4\2\7\2\uffff\1\7";
    static final String DFA51_maxS =
        "\1\130\2\133\2\uffff\1\53";
    static final String DFA51_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA51_specialS =
        "\6\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\4\1\1\1\2\1\uffff\2\4\26\uffff\1\4\21\uffff\3\3\2\uffff\1"+
            "\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\4\6\uffff\1\4\2\uffff"+
            "\2\4\14\uffff\1\4",
            "\1\5\11\uffff\1\3\13\uffff\1\3\2\uffff\2\3\11\uffff\1\4\55"+
            "\uffff\3\3",
            "\1\5\11\uffff\1\3\13\uffff\1\3\2\uffff\2\3\11\uffff\1\4\55"+
            "\uffff\3\3",
            "",
            "",
            "\1\5\31\uffff\1\3\11\uffff\1\4"
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "3266:1: ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )?";
        }
    }
    static final String DFA50_eotS =
        "\6\uffff";
    static final String DFA50_eofS =
        "\1\1\5\uffff";
    static final String DFA50_minS =
        "\1\4\1\uffff\2\7\1\uffff\1\7";
    static final String DFA50_maxS =
        "\1\130\1\uffff\2\133\1\uffff\1\53";
    static final String DFA50_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\1\uffff";
    static final String DFA50_specialS =
        "\6\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\1\1\2\1\3\1\uffff\2\1\26\uffff\1\1\21\uffff\3\4\2\uffff\1"+
            "\4\2\uffff\1\4\1\uffff\1\4\2\uffff\1\4\1\1\6\uffff\1\1\2\uffff"+
            "\2\1\14\uffff\1\1",
            "",
            "\1\5\11\uffff\1\4\13\uffff\1\4\2\uffff\2\4\11\uffff\1\1\55"+
            "\uffff\3\4",
            "\1\5\11\uffff\1\4\13\uffff\1\4\2\uffff\2\4\11\uffff\1\1\55"+
            "\uffff\3\4",
            "",
            "\1\5\31\uffff\1\4\11\uffff\1\1"
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "()* loopback of 3284:2: ( (lv_sentencias_3_0= ruleSentencias ) )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleCodigo_in_entryRuleCodigo75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCodigo85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComentario_in_ruleCodigo132 = new BitSet(new long[]{0x000080000001C000L,0x000000004000007CL});
        public static final BitSet FOLLOW_ruleComentario_in_ruleCodigo153 = new BitSet(new long[]{0x000080000001C000L,0x000000004000007CL});
        public static final BitSet FOLLOW_14_in_ruleCodigo169 = new BitSet(new long[]{0x000080000001C060L,0x000000004000007CL});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleCodigo191 = new BitSet(new long[]{0x000080000001C060L,0x000000004000007CL});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleCodigo212 = new BitSet(new long[]{0x000080000001C060L,0x000000004000007CL});
        public static final BitSet FOLLOW_15_in_ruleCodigo230 = new BitSet(new long[]{0x000085840001C060L,0x000000004000007CL});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleCodigo252 = new BitSet(new long[]{0x000085840001C060L,0x000000004000007CL});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleCodigo273 = new BitSet(new long[]{0x000085840001C060L,0x000000004000007CL});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleCodigo300 = new BitSet(new long[]{0x000080000001C000L,0x000000004000007CL});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleCodigo321 = new BitSet(new long[]{0x000080000001C000L,0x000000004000007CL});
        public static final BitSet FOLLOW_ruleInicio_in_ruleCodigo345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComentario_in_entryRuleComentario381 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComentario391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleComentario428 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComentario449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_entryRuleTipoComplejo485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoComplejo495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_ruleTipoComplejo542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_ruleTipoComplejo569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegistro_in_ruleTipoComplejo596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchivo_in_ruleTipoComplejo623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerado_in_ruleTipoComplejo650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrango_in_ruleTipoComplejo677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubproceso_in_entryRuleSubproceso712 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubproceso722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_ruleSubproceso769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_ruleSubproceso796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_entryRuleSentencias831 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSentencias841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_ruleSentencias888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_ruleSentencias915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_ruleSentencias942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_ruleSentencias969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleincremento_in_ruleSentencias996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBloque_in_ruleSentencias1023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorComplejo_in_ruleSentencias1050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBloque_in_entryRuleBloque1085 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBloque1095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_ruleBloque1142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_ruleBloque1169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_ruleBloque1196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_ruleBloque1223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_ruleBloque1250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_entryRuleDeclaracion1285 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracion1295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_ruleDeclaracion1342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_ruleDeclaracion1369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInternas_in_entryRuleInternas1404 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInternas1414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_ruleInternas1460 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInternas1472 = new BitSet(new long[]{0x0000000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleInternas1494 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleInternas1507 = new BitSet(new long[]{0x0000000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleInternas1528 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleInternas1543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna1580 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNombreInterna1591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleNombreInterna1629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleNombreInterna1648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleNombreInterna1667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleNombreInterna1686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleNombreInterna1705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleNombreInterna1724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleNombreInterna1743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleNombreInterna1762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleNombreInterna1781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_entryRuleOperador1821 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperador1831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleOperador1878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstCadena_in_ruleOperador1905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_ruleOperador1932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_ruleOperador1959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_ruleOperador1986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_ruleOperador2013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_entryRuleCaracter2048 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCaracter2058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAR_in_ruleCaracter2099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_entryRulevalor2139 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulevalor2149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_rulevalor2196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rulevalor2223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstCadena_in_rulevalor2250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_rulevalor2277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_rulevalor2304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulevalor2331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_rulevalor2358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_rulevalor2385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInternas_in_rulevalor2412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunaria_in_rulevalor2439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorComplejo_in_rulevalor2466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorComplejo_in_entryRuleValorComplejo2501 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValorComplejo2511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorRegistro_in_ruleValorComplejo2558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorVector_in_ruleValorComplejo2585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorMatriz_in_ruleValorComplejo2612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorMatriz_in_entryRuleValorMatriz2647 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValorMatriz2657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleValorMatriz2703 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleValorMatriz2715 = new BitSet(new long[]{0x0000000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleValorMatriz2736 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleValorMatriz2748 = new BitSet(new long[]{0x0000000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleValorMatriz2769 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleValorMatriz2781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorRegistro_in_entryRuleValorRegistro2817 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValorRegistro2827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleValorRegistro2873 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleValorRegistro2885 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleValorRegistro2907 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleValorRegistro2920 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleValorRegistro2941 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_ruleValorVector_in_entryRuleValorVector2980 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValorVector2990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleValorVector3036 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleValorVector3048 = new BitSet(new long[]{0x0000000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleValorVector3069 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleValorVector3081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_entryRuleCampoRegistro3117 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCampoRegistro3127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCampoRegistro3172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipo_in_entryRuleTipo3207 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipo3217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoDefinido_in_ruleTipo3264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoExistente_in_ruleTipo3291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoDefinido_in_entryRuleTipoDefinido3326 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoDefinido3336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTipoDefinido3381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoExistente_in_entryRuleTipoExistente3416 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoExistente3426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleTipoExistente3471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantes_in_entryRuleConstantes3506 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantes3516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleConstantes3562 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleConstantes3574 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleConstantes3595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_entryRuleVector3631 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVector3641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleVector3678 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleVector3690 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleVector3711 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleVector3723 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleVector3735 = new BitSet(new long[]{0x0000000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleTipo_in_ruleVector3756 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleVector3768 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVector3789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_entryRuleMatriz3825 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatriz3835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleMatriz3872 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleMatriz3884 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleMatriz3905 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMatriz3917 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleMatriz3938 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleMatriz3950 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleMatriz3962 = new BitSet(new long[]{0x0000000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleTipo_in_ruleMatriz3983 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleMatriz3995 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatriz4016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegistro_in_entryRuleRegistro4052 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegistro4062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleRegistro4099 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRegistro4120 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_ruleRegistro4142 = new BitSet(new long[]{0x0000020000000000L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_ruleRegistro4163 = new BitSet(new long[]{0x0000020000000000L,0x000000000000007CL});
        public static final BitSet FOLLOW_41_in_ruleRegistro4177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchivo_in_entryRuleArchivo4213 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArchivo4223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleArchivo4260 = new BitSet(new long[]{0x0000000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleTipo_in_ruleArchivo4281 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleArchivo4293 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArchivo4314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerado_in_entryRuleEnumerado4350 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerado4360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnumerado4406 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleEnumerado4418 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleEnumerado4430 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleEnumerado4452 = new BitSet(new long[]{0x0000200000040000L});
        public static final BitSet FOLLOW_18_in_ruleEnumerado4465 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleEnumerado4486 = new BitSet(new long[]{0x0000200000040000L});
        public static final BitSet FOLLOW_45_in_ruleEnumerado4501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrango_in_entryRuleSubrango4537 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrango4547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoNumerico_in_ruleSubrango4593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoNumerico_in_entryRuleSubrangoNumerico4627 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrangoNumerico4637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoNumerico4683 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleSubrangoNumerico4695 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000080L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubrangoNumerico4716 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleSubrangoNumerico4728 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000080L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubrangoNumerico4749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInicio_in_entryRuleInicio4785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInicio4795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleInicio4841 = new BitSet(new long[]{0x0001000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio4863 = new BitSet(new long[]{0x0001000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio4884 = new BitSet(new long[]{0x0001000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_48_in_ruleInicio4899 = new BitSet(new long[]{0x949E00011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio4921 = new BitSet(new long[]{0x949E00011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio4942 = new BitSet(new long[]{0x949E00011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_49_in_ruleInicio4957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString4994 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString5005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString5045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString5071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable5116 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionVariable5126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable5172 = new BitSet(new long[]{0x0000080000000000L,0x000000000000007CL});
        public static final BitSet FOLLOW_43_in_ruleDeclaracionVariable5185 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable5206 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleDeclaracionVariable5219 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable5240 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia5278 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionPropia5288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDeclaracionPropia5334 = new BitSet(new long[]{0x0000080000000060L});
        public static final BitSet FOLLOW_43_in_ruleDeclaracionPropia5347 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia5368 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleDeclaracionPropia5381 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia5402 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_entryRuleLlamadaFuncion5440 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLlamadaFuncion5450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLlamadaFuncion5496 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLlamadaFuncion5508 = new BitSet(new long[]{0x0000000100080370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleLlamadaFuncion5530 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleLlamadaFuncion5543 = new BitSet(new long[]{0x0000000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleLlamadaFuncion5564 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleLlamadaFuncion5580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_entryRuleAsignacion5616 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacion5626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_ruleAsignacion5673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionCompleja_in_ruleAsignacion5700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_entryRuleAsignacionNormal5735 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacionNormal5745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsignacionNormal5791 = new BitSet(new long[]{0x0000000200000080L});
        public static final BitSet FOLLOW_RULE_MAT_in_ruleAsignacionNormal5808 = new BitSet(new long[]{0x0000000200000080L});
        public static final BitSet FOLLOW_33_in_ruleAsignacionNormal5826 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleAsignacionNormal5847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionCompleja_in_entryRuleAsignacionCompleja5883 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacionCompleja5893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorComplejo_in_ruleAsignacionCompleja5939 = new BitSet(new long[]{0x0000000200000080L});
        public static final BitSet FOLLOW_RULE_MAT_in_ruleAsignacionCompleja5956 = new BitSet(new long[]{0x0000000200000080L});
        public static final BitSet FOLLOW_33_in_ruleAsignacionCompleja5974 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleAsignacionCompleja5995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_entryRuleEscribir6031 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEscribir6041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleEscribir6078 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEscribir6090 = new BitSet(new long[]{0x0000000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleEscribir6111 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleEscribir6124 = new BitSet(new long[]{0x0000000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleEscribir6145 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleEscribir6159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_entryRuleLeer6195 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeer6205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleLeer6242 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLeer6254 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleLeer6275 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleLeer6287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_entryRuleSi6323 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSi6333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleSi6370 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleSi6391 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleSi6403 = new BitSet(new long[]{0x94DC00011FF20370L,0x0000000001800C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi6425 = new BitSet(new long[]{0x94DC00011FF20370L,0x0000000001800C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi6446 = new BitSet(new long[]{0x94DC00011FF20370L,0x0000000001800C80L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSi6470 = new BitSet(new long[]{0x0040000000000000L,0x0000000000800000L});
        public static final BitSet FOLLOW_ruleSino_in_ruleSi6492 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleSi6505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_entryRulemientras6541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemientras6551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rulemientras6588 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_rulemientras6609 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_rulemientras6621 = new BitSet(new long[]{0x969C00011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras6643 = new BitSet(new long[]{0x969C00011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras6664 = new BitSet(new long[]{0x969C00011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_57_in_rulemientras6679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_entryRulerepetir6715 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulerepetir6725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rulerepetir6762 = new BitSet(new long[]{0x9C9C00011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir6784 = new BitSet(new long[]{0x9C9C00011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir6805 = new BitSet(new long[]{0x9C9C00011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_59_in_rulerepetir6820 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_rulerepetir6841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_entryRuledesde6877 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuledesde6887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruledesde6924 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_ruledesde6945 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_61_in_ruledesde6957 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruledesde6978 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruledesde6990 = new BitSet(new long[]{0xD49C00011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde7012 = new BitSet(new long[]{0xD49C00011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde7033 = new BitSet(new long[]{0xD49C00011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_62_in_ruledesde7048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaso_in_entryRuleCaso7084 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCaso7094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleCaso7140 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleCaso7152 = new BitSet(new long[]{0x949C00011FF20372L,0x0000000001000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso7174 = new BitSet(new long[]{0x949C00011FF20372L,0x0000000001000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso7195 = new BitSet(new long[]{0x949C00011FF20372L,0x0000000001000C80L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleCaso7219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_entryRulesegun7256 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesegun7266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rulesegun7303 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulesegun7315 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_rulesegun7336 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulesegun7348 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_rulesegun7360 = new BitSet(new long[]{0x0000000100000370L,0x0000000000000C81L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun7382 = new BitSet(new long[]{0x0000000100000370L,0x0000000000000C81L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun7403 = new BitSet(new long[]{0x0000000100000370L,0x0000000000000C81L});
        public static final BitSet FOLLOW_64_in_rulesegun7418 = new BitSet(new long[]{0x949C00011FF20370L,0x0000000001000C82L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun7440 = new BitSet(new long[]{0x949C00011FF20370L,0x0000000001000C82L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun7461 = new BitSet(new long[]{0x949C00011FF20370L,0x0000000001000C82L});
        public static final BitSet FOLLOW_ruleDevolver_in_rulesegun7485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rulesegun7498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleincremento_in_entryRuleincremento7534 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleincremento7544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleincremento7590 = new BitSet(new long[]{0x0000000000000000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleinc_in_ruleincremento7611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunaria_in_entryRuleunaria7647 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleunaria7657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleunaria7694 = new BitSet(new long[]{0x0000000000000000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleinc_in_ruleunaria7715 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleunaria7736 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleunaria7748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable7785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoVariable7796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleTipoVariable7834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleTipoVariable7853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleTipoVariable7872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleTipoVariable7891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleTipoVariable7910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable7950 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable7960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable8006 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_RULE_MAT_in_ruleVariable8023 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_ruleVariableID_in_entryRuleVariableID8065 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableID8075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariableID8121 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_RULE_MAT_in_ruleVariableID8138 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_ruleConstCadena_in_entryRuleConstCadena8180 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstCadena8190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAD_in_ruleConstCadena8231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_entryRuleNumeroEntero8271 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumeroEntero8281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumeroEntero8326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_entryRuleNumeroDecimal8361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumeroDecimal8371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleNumeroDecimal8416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_entryRuleValorBooleano8451 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValorBooleano8461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_ruleValorBooleano8506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt8542 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt8553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleEInt8592 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt8609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat8655 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat8666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleEFloat8705 = new BitSet(new long[]{0x0000000100000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat8723 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleEFloat8743 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat8758 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
        public static final BitSet FOLLOW_72_in_ruleEFloat8778 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000080L});
        public static final BitSet FOLLOW_73_in_ruleEFloat8797 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000080L});
        public static final BitSet FOLLOW_71_in_ruleEFloat8812 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat8829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_entryRulebooleano8877 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulebooleano8888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_rulebooleano8926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_rulebooleano8945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_entryRuleoperacion8985 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperacion8995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleoperacion9032 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleoperando_izq_in_ruleoperacion9053 = new BitSet(new long[]{0x0000000000000000L,0x00000000007FF080L});
        public static final BitSet FOLLOW_rulesigno_in_ruleoperacion9074 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleoperando_der_in_ruleoperacion9095 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleoperacion9107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesigno_in_entryRulesigno9144 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesigno9155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_rulesigno9193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_rulesigno9212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_rulesigno9231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_rulesigno9250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_rulesigno9269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_rulesigno9288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_rulesigno9307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_rulesigno9326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_rulesigno9345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_rulesigno9364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_rulesigno9383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_rulesigno9402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_izq_in_entryRuleoperando_izq9442 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperando_izq9452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_ruleoperando_izq9497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_der_in_entryRuleoperando_der9532 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperando_der9542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_ruleoperando_der9587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSino_in_entryRuleSino9622 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSino9632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleSino9678 = new BitSet(new long[]{0x949C00011FF20372L,0x0000000001000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino9700 = new BitSet(new long[]{0x949C00011FF20372L,0x0000000001000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino9721 = new BitSet(new long[]{0x949C00011FF20372L,0x0000000001000C80L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSino9745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDevolver_in_entryRuleDevolver9782 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDevolver9792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleDevolver9838 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDevolver9850 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleDevolver9871 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleDevolver9883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinc_in_entryRuleinc9920 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleinc9931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleinc9969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleinc9988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_ruleinc10007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion10047 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametroFuncion10057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_ruleParametroFuncion10103 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleParametroFuncion10124 = new BitSet(new long[]{0x0000080000000000L,0x000000000000007CL});
        public static final BitSet FOLLOW_43_in_ruleParametroFuncion10137 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleParametroFuncion10158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_entryRuleFuncion10194 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncion10204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleFuncion10250 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
        public static final BitSet FOLLOW_92_in_ruleFuncion10262 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFuncion10283 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFuncion10295 = new BitSet(new long[]{0x0000000000080000L,0x0000000300000100L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion10317 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleFuncion10330 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000100L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion10351 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleFuncion10367 = new BitSet(new long[]{0x000080000000C000L});
        public static final BitSet FOLLOW_14_in_ruleFuncion10380 = new BitSet(new long[]{0x0000800000008000L});
        public static final BitSet FOLLOW_15_in_ruleFuncion10395 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleFuncion10409 = new BitSet(new long[]{0x0001000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion10431 = new BitSet(new long[]{0x0001000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion10452 = new BitSet(new long[]{0x0001000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_48_in_ruleFuncion10467 = new BitSet(new long[]{0x949C00011FF20370L,0x0000000021000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion10489 = new BitSet(new long[]{0x949C00011FF20370L,0x0000000021000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion10510 = new BitSet(new long[]{0x949C00011FF20370L,0x0000000021000C80L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleFuncion10534 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_93_in_ruleFuncion10547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento10583 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcedimiento10593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_94_in_ruleProcedimiento10630 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcedimiento10651 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProcedimiento10663 = new BitSet(new long[]{0x0000000000080000L,0x0000000300000100L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento10685 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleProcedimiento10698 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000100L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento10719 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleProcedimiento10735 = new BitSet(new long[]{0x000080000000C000L});
        public static final BitSet FOLLOW_14_in_ruleProcedimiento10748 = new BitSet(new long[]{0x0000800000008000L});
        public static final BitSet FOLLOW_15_in_ruleProcedimiento10763 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleProcedimiento10777 = new BitSet(new long[]{0x0001000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento10799 = new BitSet(new long[]{0x0001000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento10820 = new BitSet(new long[]{0x0001000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_48_in_ruleProcedimiento10835 = new BitSet(new long[]{0x949C00011FF20370L,0x0000000080000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento10857 = new BitSet(new long[]{0x949C00011FF20370L,0x0000000080000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento10878 = new BitSet(new long[]{0x949C00011FF20370L,0x0000000080000C80L});
        public static final BitSet FOLLOW_95_in_ruleProcedimiento10893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso10930 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoPaso10941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleTipoPaso10979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_96_in_ruleTipoPaso10998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_97_in_ruleTipoPaso11017 = new BitSet(new long[]{0x0000000000000002L});
    }


}