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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CAR", "RULE_STRING", "RULE_ID", "RULE_MAT", "RULE_CAD", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'const'", "'tipo'", "'//'", "'('", "','", "')'", "'cos'", "'cuadrado'", "'exp'", "'ln'", "'log'", "'sen'", "'sqrt'", "'longitud'", "'concatena'", "'['", "']['", "']'", "'.'", "'='", "'vector'", "' ['", "'] '", "'de '", "' : '", "'matriz'", "'registro:'", "'fin_registro'", "'archivo de '", "':'", "'{'", "'}'", "'..'", "'var'", "'inicio'", "'fin_inicio'", "'escribir'", "'leer'", "'si'", "'entonces'", "'fin_si'", "'mientras'", "'hacer'", "'fin_mientras'", "'repetir'", "'hasta_que'", "'desde'", "'hasta'", "'fin_desde'", "'segun_sea'", "'en_otro_caso:'", "'fin_segun'", "'entero'", "'caracter'", "'real'", "'logico'", "'cadena'", "'-'", "'E'", "'e'", "'verdadero'", "'falso'", "'+'", "'*'", "'/'", "'<'", "'>'", "'>='", "'<='", "'y'", "'o'", "'=='", "'!='", "'sino'", "'devolver'", "'++'", "'--'", "'no'", "'funcion'", "'fin_funcion'", "'procedimiento'", "'fin_procedimiento'", "'E/S'", "'S'"
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:267:1: ruleComentario returns [EObject current=null] : (otherlv_0= '//' ( (lv_mensaje_1_0= ruleEString ) ) ) ;
    public final EObject ruleComentario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_mensaje_1_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:270:28: ( (otherlv_0= '//' ( (lv_mensaje_1_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:271:1: (otherlv_0= '//' ( (lv_mensaje_1_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:271:1: (otherlv_0= '//' ( (lv_mensaje_1_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:271:3: otherlv_0= '//' ( (lv_mensaje_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleComentario428); 

                	newLeafNode(otherlv_0, grammarAccess.getComentarioAccess().getSolidusSolidusKeyword_0());
                
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:800:1: ruleOperador returns [EObject current=null] : (this_VariableID_0= ruleVariableID | this_ConstCadena_1= ruleConstCadena | this_Caracter_2= ruleCaracter | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_ValorBooleano_5= ruleValorBooleano | this_ValorComplejo_6= ruleValorComplejo ) ;
    public final EObject ruleOperador() throws RecognitionException {
        EObject current = null;

        EObject this_VariableID_0 = null;

        EObject this_ConstCadena_1 = null;

        EObject this_Caracter_2 = null;

        EObject this_NumeroEntero_3 = null;

        EObject this_NumeroDecimal_4 = null;

        EObject this_ValorBooleano_5 = null;

        EObject this_ValorComplejo_6 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:803:28: ( (this_VariableID_0= ruleVariableID | this_ConstCadena_1= ruleConstCadena | this_Caracter_2= ruleCaracter | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_ValorBooleano_5= ruleValorBooleano | this_ValorComplejo_6= ruleValorComplejo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:804:1: (this_VariableID_0= ruleVariableID | this_ConstCadena_1= ruleConstCadena | this_Caracter_2= ruleCaracter | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_ValorBooleano_5= ruleValorBooleano | this_ValorComplejo_6= ruleValorComplejo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:804:1: (this_VariableID_0= ruleVariableID | this_ConstCadena_1= ruleConstCadena | this_Caracter_2= ruleCaracter | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_ValorBooleano_5= ruleValorBooleano | this_ValorComplejo_6= ruleValorComplejo )
            int alt18=7;
            alt18 = dfa18.predict(input);
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
                case 7 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:865:5: this_ValorComplejo_6= ruleValorComplejo
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getValorComplejoParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorComplejo_in_ruleOperador2040);
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
    // $ANTLR end "ruleOperador"


    // $ANTLR start "entryRuleCaracter"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:881:1: entryRuleCaracter returns [EObject current=null] : iv_ruleCaracter= ruleCaracter EOF ;
    public final EObject entryRuleCaracter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaracter = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:882:2: (iv_ruleCaracter= ruleCaracter EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:883:2: iv_ruleCaracter= ruleCaracter EOF
            {
             newCompositeNode(grammarAccess.getCaracterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_entryRuleCaracter2075);
            iv_ruleCaracter=ruleCaracter();

            state._fsp--;

             current =iv_ruleCaracter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCaracter2085); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:890:1: ruleCaracter returns [EObject current=null] : ( (lv_contenido_0_0= RULE_CAR ) ) ;
    public final EObject ruleCaracter() throws RecognitionException {
        EObject current = null;

        Token lv_contenido_0_0=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:893:28: ( ( (lv_contenido_0_0= RULE_CAR ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:894:1: ( (lv_contenido_0_0= RULE_CAR ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:894:1: ( (lv_contenido_0_0= RULE_CAR ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:895:1: (lv_contenido_0_0= RULE_CAR )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:895:1: (lv_contenido_0_0= RULE_CAR )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:896:3: lv_contenido_0_0= RULE_CAR
            {
            lv_contenido_0_0=(Token)match(input,RULE_CAR,FollowSets000.FOLLOW_RULE_CAR_in_ruleCaracter2126); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:920:1: entryRulevalor returns [EObject current=null] : iv_rulevalor= rulevalor EOF ;
    public final EObject entryRulevalor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalor = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:921:2: (iv_rulevalor= rulevalor EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:922:2: iv_rulevalor= rulevalor EOF
            {
             newCompositeNode(grammarAccess.getValorRule()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_entryRulevalor2166);
            iv_rulevalor=rulevalor();

            state._fsp--;

             current =iv_rulevalor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulevalor2176); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:929:1: rulevalor returns [EObject current=null] : (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria | this_ValorComplejo_10= ruleValorComplejo ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:932:28: ( (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria | this_ValorComplejo_10= ruleValorComplejo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:933:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria | this_ValorComplejo_10= ruleValorComplejo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:933:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria | this_ValorComplejo_10= ruleValorComplejo )
            int alt19=11;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:934:5: this_LlamadaFuncion_0= ruleLlamadaFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getLlamadaFuncionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_rulevalor2223);
                    this_LlamadaFuncion_0=ruleLlamadaFuncion();

                    state._fsp--;

                     
                            current = this_LlamadaFuncion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:944:5: this_VariableID_1= ruleVariableID
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getVariableIDParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rulevalor2250);
                    this_VariableID_1=ruleVariableID();

                    state._fsp--;

                     
                            current = this_VariableID_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:954:5: this_ConstCadena_2= ruleConstCadena
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getConstCadenaParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_rulevalor2277);
                    this_ConstCadena_2=ruleConstCadena();

                    state._fsp--;

                     
                            current = this_ConstCadena_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:964:5: this_NumeroEntero_3= ruleNumeroEntero
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getNumeroEnteroParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_rulevalor2304);
                    this_NumeroEntero_3=ruleNumeroEntero();

                    state._fsp--;

                     
                            current = this_NumeroEntero_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:974:5: this_NumeroDecimal_4= ruleNumeroDecimal
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getNumeroDecimalParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_rulevalor2331);
                    this_NumeroDecimal_4=ruleNumeroDecimal();

                    state._fsp--;

                     
                            current = this_NumeroDecimal_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:5: this_operacion_5= ruleoperacion
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getOperacionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulevalor2358);
                    this_operacion_5=ruleoperacion();

                    state._fsp--;

                     
                            current = this_operacion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:994:5: this_ValorBooleano_6= ruleValorBooleano
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getValorBooleanoParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_rulevalor2385);
                    this_ValorBooleano_6=ruleValorBooleano();

                    state._fsp--;

                     
                            current = this_ValorBooleano_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1004:5: this_Caracter_7= ruleCaracter
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getCaracterParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_rulevalor2412);
                    this_Caracter_7=ruleCaracter();

                    state._fsp--;

                     
                            current = this_Caracter_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1014:5: this_Internas_8= ruleInternas
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getInternasParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInternas_in_rulevalor2439);
                    this_Internas_8=ruleInternas();

                    state._fsp--;

                     
                            current = this_Internas_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1024:5: this_unaria_9= ruleunaria
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getUnariaParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleunaria_in_rulevalor2466);
                    this_unaria_9=ruleunaria();

                    state._fsp--;

                     
                            current = this_unaria_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1034:5: this_ValorComplejo_10= ruleValorComplejo
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getValorComplejoParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorComplejo_in_rulevalor2493);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1050:1: entryRuleValorComplejo returns [EObject current=null] : iv_ruleValorComplejo= ruleValorComplejo EOF ;
    public final EObject entryRuleValorComplejo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorComplejo = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1051:2: (iv_ruleValorComplejo= ruleValorComplejo EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1052:2: iv_ruleValorComplejo= ruleValorComplejo EOF
            {
             newCompositeNode(grammarAccess.getValorComplejoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValorComplejo_in_entryRuleValorComplejo2528);
            iv_ruleValorComplejo=ruleValorComplejo();

            state._fsp--;

             current =iv_ruleValorComplejo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValorComplejo2538); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1059:1: ruleValorComplejo returns [EObject current=null] : (this_ValorRegistro_0= ruleValorRegistro | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz ) ;
    public final EObject ruleValorComplejo() throws RecognitionException {
        EObject current = null;

        EObject this_ValorRegistro_0 = null;

        EObject this_ValorVector_1 = null;

        EObject this_ValorMatriz_2 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1062:28: ( (this_ValorRegistro_0= ruleValorRegistro | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1063:1: (this_ValorRegistro_0= ruleValorRegistro | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1063:1: (this_ValorRegistro_0= ruleValorRegistro | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz )
            int alt20=3;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1064:5: this_ValorRegistro_0= ruleValorRegistro
                    {
                     
                            newCompositeNode(grammarAccess.getValorComplejoAccess().getValorRegistroParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorRegistro_in_ruleValorComplejo2585);
                    this_ValorRegistro_0=ruleValorRegistro();

                    state._fsp--;

                     
                            current = this_ValorRegistro_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1074:5: this_ValorVector_1= ruleValorVector
                    {
                     
                            newCompositeNode(grammarAccess.getValorComplejoAccess().getValorVectorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorVector_in_ruleValorComplejo2612);
                    this_ValorVector_1=ruleValorVector();

                    state._fsp--;

                     
                            current = this_ValorVector_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1084:5: this_ValorMatriz_2= ruleValorMatriz
                    {
                     
                            newCompositeNode(grammarAccess.getValorComplejoAccess().getValorMatrizParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorMatriz_in_ruleValorComplejo2639);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1100:1: entryRuleValorMatriz returns [EObject current=null] : iv_ruleValorMatriz= ruleValorMatriz EOF ;
    public final EObject entryRuleValorMatriz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorMatriz = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1101:2: (iv_ruleValorMatriz= ruleValorMatriz EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1102:2: iv_ruleValorMatriz= ruleValorMatriz EOF
            {
             newCompositeNode(grammarAccess.getValorMatrizRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValorMatriz_in_entryRuleValorMatriz2674);
            iv_ruleValorMatriz=ruleValorMatriz();

            state._fsp--;

             current =iv_ruleValorMatriz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValorMatriz2684); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1109:1: ruleValorMatriz returns [EObject current=null] : ( ( (lv_nombre_matriz_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indices_2_0= ruleNumeroEntero ) ) | ( (lv_indices_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_indices_5_0= ruleNumeroEntero ) ) | ( (lv_indices_6_0= ruleVariableID ) ) ) otherlv_7= ']' ) ;
    public final EObject ruleValorMatriz() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_nombre_matriz_0_0 = null;

        EObject lv_indices_2_0 = null;

        EObject lv_indices_3_0 = null;

        EObject lv_indices_5_0 = null;

        EObject lv_indices_6_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1112:28: ( ( ( (lv_nombre_matriz_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indices_2_0= ruleNumeroEntero ) ) | ( (lv_indices_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_indices_5_0= ruleNumeroEntero ) ) | ( (lv_indices_6_0= ruleVariableID ) ) ) otherlv_7= ']' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1113:1: ( ( (lv_nombre_matriz_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indices_2_0= ruleNumeroEntero ) ) | ( (lv_indices_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_indices_5_0= ruleNumeroEntero ) ) | ( (lv_indices_6_0= ruleVariableID ) ) ) otherlv_7= ']' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1113:1: ( ( (lv_nombre_matriz_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indices_2_0= ruleNumeroEntero ) ) | ( (lv_indices_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_indices_5_0= ruleNumeroEntero ) ) | ( (lv_indices_6_0= ruleVariableID ) ) ) otherlv_7= ']' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1113:2: ( (lv_nombre_matriz_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indices_2_0= ruleNumeroEntero ) ) | ( (lv_indices_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_indices_5_0= ruleNumeroEntero ) ) | ( (lv_indices_6_0= ruleVariableID ) ) ) otherlv_7= ']'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1113:2: ( (lv_nombre_matriz_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1114:1: (lv_nombre_matriz_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1114:1: (lv_nombre_matriz_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:3: lv_nombre_matriz_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getValorMatrizAccess().getNombre_matrizEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleValorMatriz2730);
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

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleValorMatriz2742); 

                	newLeafNode(otherlv_1, grammarAccess.getValorMatrizAccess().getLeftSquareBracketKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1135:1: ( ( (lv_indices_2_0= ruleNumeroEntero ) ) | ( (lv_indices_3_0= ruleVariableID ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT||LA21_0==71) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1135:2: ( (lv_indices_2_0= ruleNumeroEntero ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1135:2: ( (lv_indices_2_0= ruleNumeroEntero ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1136:1: (lv_indices_2_0= ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1136:1: (lv_indices_2_0= ruleNumeroEntero )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1137:3: lv_indices_2_0= ruleNumeroEntero
                    {
                     
                    	        newCompositeNode(grammarAccess.getValorMatrizAccess().getIndicesNumeroEnteroParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_ruleValorMatriz2764);
                    lv_indices_2_0=ruleNumeroEntero();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValorMatrizRule());
                    	        }
                           		add(
                           			current, 
                           			"indices",
                            		lv_indices_2_0, 
                            		"NumeroEntero");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1154:6: ( (lv_indices_3_0= ruleVariableID ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1154:6: ( (lv_indices_3_0= ruleVariableID ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1155:1: (lv_indices_3_0= ruleVariableID )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1155:1: (lv_indices_3_0= ruleVariableID )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1156:3: lv_indices_3_0= ruleVariableID
                    {
                     
                    	        newCompositeNode(grammarAccess.getValorMatrizAccess().getIndicesVariableIDParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleValorMatriz2791);
                    lv_indices_3_0=ruleVariableID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValorMatrizRule());
                    	        }
                           		add(
                           			current, 
                           			"indices",
                            		lv_indices_3_0, 
                            		"VariableID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleValorMatriz2804); 

                	newLeafNode(otherlv_4, grammarAccess.getValorMatrizAccess().getRightSquareBracketLeftSquareBracketKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1176:1: ( ( (lv_indices_5_0= ruleNumeroEntero ) ) | ( (lv_indices_6_0= ruleVariableID ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT||LA22_0==71) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1176:2: ( (lv_indices_5_0= ruleNumeroEntero ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1176:2: ( (lv_indices_5_0= ruleNumeroEntero ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1177:1: (lv_indices_5_0= ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1177:1: (lv_indices_5_0= ruleNumeroEntero )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1178:3: lv_indices_5_0= ruleNumeroEntero
                    {
                     
                    	        newCompositeNode(grammarAccess.getValorMatrizAccess().getIndicesNumeroEnteroParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_ruleValorMatriz2826);
                    lv_indices_5_0=ruleNumeroEntero();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValorMatrizRule());
                    	        }
                           		add(
                           			current, 
                           			"indices",
                            		lv_indices_5_0, 
                            		"NumeroEntero");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1195:6: ( (lv_indices_6_0= ruleVariableID ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1195:6: ( (lv_indices_6_0= ruleVariableID ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1196:1: (lv_indices_6_0= ruleVariableID )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1196:1: (lv_indices_6_0= ruleVariableID )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1197:3: lv_indices_6_0= ruleVariableID
                    {
                     
                    	        newCompositeNode(grammarAccess.getValorMatrizAccess().getIndicesVariableIDParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleValorMatriz2853);
                    lv_indices_6_0=ruleVariableID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValorMatrizRule());
                    	        }
                           		add(
                           			current, 
                           			"indices",
                            		lv_indices_6_0, 
                            		"VariableID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleValorMatriz2866); 

                	newLeafNode(otherlv_7, grammarAccess.getValorMatrizAccess().getRightSquareBracketKeyword_5());
                

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1225:1: entryRuleValorRegistro returns [EObject current=null] : iv_ruleValorRegistro= ruleValorRegistro EOF ;
    public final EObject entryRuleValorRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorRegistro = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1226:2: (iv_ruleValorRegistro= ruleValorRegistro EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1227:2: iv_ruleValorRegistro= ruleValorRegistro EOF
            {
             newCompositeNode(grammarAccess.getValorRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValorRegistro_in_entryRuleValorRegistro2902);
            iv_ruleValorRegistro=ruleValorRegistro();

            state._fsp--;

             current =iv_ruleValorRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValorRegistro2912); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1234:1: ruleValorRegistro returns [EObject current=null] : ( ( (lv_nombre_registro_0_0= ruleEString ) ) otherlv_1= '.' ( ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )* ) ) ;
    public final EObject ruleValorRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_registro_0_0 = null;

        EObject lv_campo_2_0 = null;

        EObject lv_campo_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1237:28: ( ( ( (lv_nombre_registro_0_0= ruleEString ) ) otherlv_1= '.' ( ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )* ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1238:1: ( ( (lv_nombre_registro_0_0= ruleEString ) ) otherlv_1= '.' ( ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )* ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1238:1: ( ( (lv_nombre_registro_0_0= ruleEString ) ) otherlv_1= '.' ( ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1238:2: ( (lv_nombre_registro_0_0= ruleEString ) ) otherlv_1= '.' ( ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1238:2: ( (lv_nombre_registro_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1239:1: (lv_nombre_registro_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1239:1: (lv_nombre_registro_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1240:3: lv_nombre_registro_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getValorRegistroAccess().getNombre_registroEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleValorRegistro2958);
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

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleValorRegistro2970); 

                	newLeafNode(otherlv_1, grammarAccess.getValorRegistroAccess().getFullStopKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1260:1: ( ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1260:2: ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1260:2: ( (lv_campo_2_0= ruleCampoRegistro ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1261:1: (lv_campo_2_0= ruleCampoRegistro )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1261:1: (lv_campo_2_0= ruleCampoRegistro )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1262:3: lv_campo_2_0= ruleCampoRegistro
            {
             
            	        newCompositeNode(grammarAccess.getValorRegistroAccess().getCampoCampoRegistroParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleValorRegistro2992);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1278:2: (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    int LA23_2 = input.LA(2);

                    if ( ((LA23_2>=RULE_STRING && LA23_2<=RULE_ID)) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1278:4: otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) )
            	    {
            	    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleValorRegistro3005); 

            	        	newLeafNode(otherlv_3, grammarAccess.getValorRegistroAccess().getFullStopKeyword_2_1_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1282:1: ( (lv_campo_4_0= ruleCampoRegistro ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1283:1: (lv_campo_4_0= ruleCampoRegistro )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1283:1: (lv_campo_4_0= ruleCampoRegistro )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1284:3: lv_campo_4_0= ruleCampoRegistro
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValorRegistroAccess().getCampoCampoRegistroParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleValorRegistro3026);
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
            	    break loop23;
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1308:1: entryRuleValorVector returns [EObject current=null] : iv_ruleValorVector= ruleValorVector EOF ;
    public final EObject entryRuleValorVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorVector = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1309:2: (iv_ruleValorVector= ruleValorVector EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1310:2: iv_ruleValorVector= ruleValorVector EOF
            {
             newCompositeNode(grammarAccess.getValorVectorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValorVector_in_entryRuleValorVector3065);
            iv_ruleValorVector=ruleValorVector();

            state._fsp--;

             current =iv_ruleValorVector; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValorVector3075); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1317:1: ruleValorVector returns [EObject current=null] : ( ( (lv_nombre_vector_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indice_2_0= ruleNumeroEntero ) ) | ( (lv_indice_3_0= ruleVariableID ) ) ) otherlv_4= ']' ) ;
    public final EObject ruleValorVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nombre_vector_0_0 = null;

        EObject lv_indice_2_0 = null;

        EObject lv_indice_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1320:28: ( ( ( (lv_nombre_vector_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indice_2_0= ruleNumeroEntero ) ) | ( (lv_indice_3_0= ruleVariableID ) ) ) otherlv_4= ']' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1321:1: ( ( (lv_nombre_vector_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indice_2_0= ruleNumeroEntero ) ) | ( (lv_indice_3_0= ruleVariableID ) ) ) otherlv_4= ']' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1321:1: ( ( (lv_nombre_vector_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indice_2_0= ruleNumeroEntero ) ) | ( (lv_indice_3_0= ruleVariableID ) ) ) otherlv_4= ']' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1321:2: ( (lv_nombre_vector_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indice_2_0= ruleNumeroEntero ) ) | ( (lv_indice_3_0= ruleVariableID ) ) ) otherlv_4= ']'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1321:2: ( (lv_nombre_vector_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1322:1: (lv_nombre_vector_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1322:1: (lv_nombre_vector_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1323:3: lv_nombre_vector_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getValorVectorAccess().getNombre_vectorEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleValorVector3121);
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

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleValorVector3133); 

                	newLeafNode(otherlv_1, grammarAccess.getValorVectorAccess().getLeftSquareBracketKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1343:1: ( ( (lv_indice_2_0= ruleNumeroEntero ) ) | ( (lv_indice_3_0= ruleVariableID ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT||LA24_0==71) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1343:2: ( (lv_indice_2_0= ruleNumeroEntero ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1343:2: ( (lv_indice_2_0= ruleNumeroEntero ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1344:1: (lv_indice_2_0= ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1344:1: (lv_indice_2_0= ruleNumeroEntero )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1345:3: lv_indice_2_0= ruleNumeroEntero
                    {
                     
                    	        newCompositeNode(grammarAccess.getValorVectorAccess().getIndiceNumeroEnteroParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_ruleValorVector3155);
                    lv_indice_2_0=ruleNumeroEntero();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValorVectorRule());
                    	        }
                           		set(
                           			current, 
                           			"indice",
                            		lv_indice_2_0, 
                            		"NumeroEntero");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1362:6: ( (lv_indice_3_0= ruleVariableID ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1362:6: ( (lv_indice_3_0= ruleVariableID ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1363:1: (lv_indice_3_0= ruleVariableID )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1363:1: (lv_indice_3_0= ruleVariableID )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:3: lv_indice_3_0= ruleVariableID
                    {
                     
                    	        newCompositeNode(grammarAccess.getValorVectorAccess().getIndiceVariableIDParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleValorVector3182);
                    lv_indice_3_0=ruleVariableID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValorVectorRule());
                    	        }
                           		set(
                           			current, 
                           			"indice",
                            		lv_indice_3_0, 
                            		"VariableID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleValorVector3195); 

                	newLeafNode(otherlv_4, grammarAccess.getValorVectorAccess().getRightSquareBracketKeyword_3());
                

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1392:1: entryRuleCampoRegistro returns [EObject current=null] : iv_ruleCampoRegistro= ruleCampoRegistro EOF ;
    public final EObject entryRuleCampoRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCampoRegistro = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1393:2: (iv_ruleCampoRegistro= ruleCampoRegistro EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1394:2: iv_ruleCampoRegistro= ruleCampoRegistro EOF
            {
             newCompositeNode(grammarAccess.getCampoRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_entryRuleCampoRegistro3231);
            iv_ruleCampoRegistro=ruleCampoRegistro();

            state._fsp--;

             current =iv_ruleCampoRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCampoRegistro3241); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1401:1: ruleCampoRegistro returns [EObject current=null] : ( (lv_nombre_campo_0_0= ruleEString ) ) ;
    public final EObject ruleCampoRegistro() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_campo_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1404:28: ( ( (lv_nombre_campo_0_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1405:1: ( (lv_nombre_campo_0_0= ruleEString ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1405:1: ( (lv_nombre_campo_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1406:1: (lv_nombre_campo_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1406:1: (lv_nombre_campo_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1407:3: lv_nombre_campo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getNombre_campoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCampoRegistro3286);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1431:1: entryRuleTipo returns [EObject current=null] : iv_ruleTipo= ruleTipo EOF ;
    public final EObject entryRuleTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipo = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1432:2: (iv_ruleTipo= ruleTipo EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1433:2: iv_ruleTipo= ruleTipo EOF
            {
             newCompositeNode(grammarAccess.getTipoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_entryRuleTipo3321);
            iv_ruleTipo=ruleTipo();

            state._fsp--;

             current =iv_ruleTipo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipo3331); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1440:1: ruleTipo returns [EObject current=null] : (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) ;
    public final EObject ruleTipo() throws RecognitionException {
        EObject current = null;

        EObject this_TipoDefinido_0 = null;

        EObject this_TipoExistente_1 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1443:28: ( (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1444:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1444:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=66 && LA25_0<=70)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1445:5: this_TipoDefinido_0= ruleTipoDefinido
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoDefinidoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTipoDefinido_in_ruleTipo3378);
                    this_TipoDefinido_0=ruleTipoDefinido();

                    state._fsp--;

                     
                            current = this_TipoDefinido_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1455:5: this_TipoExistente_1= ruleTipoExistente
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoExistenteParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTipoExistente_in_ruleTipo3405);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1471:1: entryRuleTipoDefinido returns [EObject current=null] : iv_ruleTipoDefinido= ruleTipoDefinido EOF ;
    public final EObject entryRuleTipoDefinido() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoDefinido = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1472:2: (iv_ruleTipoDefinido= ruleTipoDefinido EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1473:2: iv_ruleTipoDefinido= ruleTipoDefinido EOF
            {
             newCompositeNode(grammarAccess.getTipoDefinidoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoDefinido_in_entryRuleTipoDefinido3440);
            iv_ruleTipoDefinido=ruleTipoDefinido();

            state._fsp--;

             current =iv_ruleTipoDefinido; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoDefinido3450); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1480:1: ruleTipoDefinido returns [EObject current=null] : ( (lv_tipo_0_0= ruleEString ) ) ;
    public final EObject ruleTipoDefinido() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1483:28: ( ( (lv_tipo_0_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1484:1: ( (lv_tipo_0_0= ruleEString ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1484:1: ( (lv_tipo_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1485:1: (lv_tipo_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1485:1: (lv_tipo_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1486:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTipoDefinidoAccess().getTipoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTipoDefinido3495);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1510:1: entryRuleTipoExistente returns [EObject current=null] : iv_ruleTipoExistente= ruleTipoExistente EOF ;
    public final EObject entryRuleTipoExistente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoExistente = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1511:2: (iv_ruleTipoExistente= ruleTipoExistente EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1512:2: iv_ruleTipoExistente= ruleTipoExistente EOF
            {
             newCompositeNode(grammarAccess.getTipoExistenteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoExistente_in_entryRuleTipoExistente3530);
            iv_ruleTipoExistente=ruleTipoExistente();

            state._fsp--;

             current =iv_ruleTipoExistente; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoExistente3540); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1519:1: ruleTipoExistente returns [EObject current=null] : ( (lv_tipo_0_0= ruleTipoVariable ) ) ;
    public final EObject ruleTipoExistente() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1522:28: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1523:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1523:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1524:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1524:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1525:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getTipoExistenteAccess().getTipoTipoVariableParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleTipoExistente3585);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1549:1: entryRuleConstantes returns [EObject current=null] : iv_ruleConstantes= ruleConstantes EOF ;
    public final EObject entryRuleConstantes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantes = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1550:2: (iv_ruleConstantes= ruleConstantes EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1551:2: iv_ruleConstantes= ruleConstantes EOF
            {
             newCompositeNode(grammarAccess.getConstantesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_entryRuleConstantes3620);
            iv_ruleConstantes=ruleConstantes();

            state._fsp--;

             current =iv_ruleConstantes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantes3630); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1558:1: ruleConstantes returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) ) ) ;
    public final EObject ruleConstantes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_valor_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1561:28: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1562:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1562:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1562:2: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1562:2: ( (lv_variable_0_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1563:1: (lv_variable_0_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1563:1: (lv_variable_0_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1564:3: lv_variable_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getVariableVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleConstantes3676);
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

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleConstantes3688); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantesAccess().getEqualsSignKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1584:1: ( (lv_valor_2_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1585:1: (lv_valor_2_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1585:1: (lv_valor_2_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1586:3: lv_valor_2_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getValorValorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleConstantes3709);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1610:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1611:2: (iv_ruleVector= ruleVector EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1612:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVector_in_entryRuleVector3745);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVector3755); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1619:1: ruleVector returns [EObject current=null] : (otherlv_0= 'vector' otherlv_1= ' [' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= '] ' otherlv_5= 'de ' ( (lv_tipo_6_0= ruleTipo ) ) otherlv_7= ' : ' ( (lv_nombre_8_0= ruleEString ) ) ) ;
    public final EObject ruleVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_valor_2_0 = null;

        EObject lv_valor_3_0 = null;

        EObject lv_tipo_6_0 = null;

        AntlrDatatypeRuleToken lv_nombre_8_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1622:28: ( (otherlv_0= 'vector' otherlv_1= ' [' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= '] ' otherlv_5= 'de ' ( (lv_tipo_6_0= ruleTipo ) ) otherlv_7= ' : ' ( (lv_nombre_8_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1623:1: (otherlv_0= 'vector' otherlv_1= ' [' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= '] ' otherlv_5= 'de ' ( (lv_tipo_6_0= ruleTipo ) ) otherlv_7= ' : ' ( (lv_nombre_8_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1623:1: (otherlv_0= 'vector' otherlv_1= ' [' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= '] ' otherlv_5= 'de ' ( (lv_tipo_6_0= ruleTipo ) ) otherlv_7= ' : ' ( (lv_nombre_8_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1623:3: otherlv_0= 'vector' otherlv_1= ' [' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= '] ' otherlv_5= 'de ' ( (lv_tipo_6_0= ruleTipo ) ) otherlv_7= ' : ' ( (lv_nombre_8_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleVector3792); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getVectorKeyword_0());
                
            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleVector3804); 

                	newLeafNode(otherlv_1, grammarAccess.getVectorAccess().getSpaceLeftSquareBracketKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1631:1: ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT||LA26_0==71) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1631:2: ( (lv_valor_2_0= ruleNumeroEntero ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1631:2: ( (lv_valor_2_0= ruleNumeroEntero ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1632:1: (lv_valor_2_0= ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1632:1: (lv_valor_2_0= ruleNumeroEntero )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1633:3: lv_valor_2_0= ruleNumeroEntero
                    {
                     
                    	        newCompositeNode(grammarAccess.getVectorAccess().getValorNumeroEnteroParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_ruleVector3826);
                    lv_valor_2_0=ruleNumeroEntero();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVectorRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_2_0, 
                            		"NumeroEntero");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1650:6: ( (lv_valor_3_0= ruleVariableID ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1650:6: ( (lv_valor_3_0= ruleVariableID ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1651:1: (lv_valor_3_0= ruleVariableID )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1651:1: (lv_valor_3_0= ruleVariableID )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1652:3: lv_valor_3_0= ruleVariableID
                    {
                     
                    	        newCompositeNode(grammarAccess.getVectorAccess().getValorVariableIDParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleVector3853);
                    lv_valor_3_0=ruleVariableID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVectorRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_3_0, 
                            		"VariableID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleVector3866); 

                	newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getRightSquareBracketSpaceKeyword_3());
                
            otherlv_5=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleVector3878); 

                	newLeafNode(otherlv_5, grammarAccess.getVectorAccess().getDeKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1676:1: ( (lv_tipo_6_0= ruleTipo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1677:1: (lv_tipo_6_0= ruleTipo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1677:1: (lv_tipo_6_0= ruleTipo )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1678:3: lv_tipo_6_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getTipoTipoParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleVector3899);
            lv_tipo_6_0=ruleTipo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVectorRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_6_0, 
                    		"Tipo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleVector3911); 

                	newLeafNode(otherlv_7, grammarAccess.getVectorAccess().getSpaceColonSpaceKeyword_6());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1698:1: ( (lv_nombre_8_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1699:1: (lv_nombre_8_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1699:1: (lv_nombre_8_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1700:3: lv_nombre_8_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getNombreEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVector3932);
            lv_nombre_8_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVectorRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_8_0, 
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1724:1: entryRuleMatriz returns [EObject current=null] : iv_ruleMatriz= ruleMatriz EOF ;
    public final EObject entryRuleMatriz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatriz = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1725:2: (iv_ruleMatriz= ruleMatriz EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1726:2: iv_ruleMatriz= ruleMatriz EOF
            {
             newCompositeNode(grammarAccess.getMatrizRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_entryRuleMatriz3968);
            iv_ruleMatriz=ruleMatriz();

            state._fsp--;

             current =iv_ruleMatriz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatriz3978); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1733:1: ruleMatriz returns [EObject current=null] : (otherlv_0= 'matriz' otherlv_1= ' [' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_valor_5_0= ruleNumeroEntero ) ) | ( (lv_valor_6_0= ruleVariableID ) ) ) otherlv_7= '] ' otherlv_8= 'de ' ( (lv_tipo_9_0= ruleTipo ) ) otherlv_10= ' : ' ( (lv_nombre_11_0= ruleEString ) ) ) ;
    public final EObject ruleMatriz() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_valor_2_0 = null;

        EObject lv_valor_3_0 = null;

        EObject lv_valor_5_0 = null;

        EObject lv_valor_6_0 = null;

        EObject lv_tipo_9_0 = null;

        AntlrDatatypeRuleToken lv_nombre_11_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1736:28: ( (otherlv_0= 'matriz' otherlv_1= ' [' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_valor_5_0= ruleNumeroEntero ) ) | ( (lv_valor_6_0= ruleVariableID ) ) ) otherlv_7= '] ' otherlv_8= 'de ' ( (lv_tipo_9_0= ruleTipo ) ) otherlv_10= ' : ' ( (lv_nombre_11_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1737:1: (otherlv_0= 'matriz' otherlv_1= ' [' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_valor_5_0= ruleNumeroEntero ) ) | ( (lv_valor_6_0= ruleVariableID ) ) ) otherlv_7= '] ' otherlv_8= 'de ' ( (lv_tipo_9_0= ruleTipo ) ) otherlv_10= ' : ' ( (lv_nombre_11_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1737:1: (otherlv_0= 'matriz' otherlv_1= ' [' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_valor_5_0= ruleNumeroEntero ) ) | ( (lv_valor_6_0= ruleVariableID ) ) ) otherlv_7= '] ' otherlv_8= 'de ' ( (lv_tipo_9_0= ruleTipo ) ) otherlv_10= ' : ' ( (lv_nombre_11_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1737:3: otherlv_0= 'matriz' otherlv_1= ' [' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_valor_5_0= ruleNumeroEntero ) ) | ( (lv_valor_6_0= ruleVariableID ) ) ) otherlv_7= '] ' otherlv_8= 'de ' ( (lv_tipo_9_0= ruleTipo ) ) otherlv_10= ' : ' ( (lv_nombre_11_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMatriz4015); 

                	newLeafNode(otherlv_0, grammarAccess.getMatrizAccess().getMatrizKeyword_0());
                
            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMatriz4027); 

                	newLeafNode(otherlv_1, grammarAccess.getMatrizAccess().getSpaceLeftSquareBracketKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1745:1: ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT||LA27_0==71) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1745:2: ( (lv_valor_2_0= ruleNumeroEntero ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1745:2: ( (lv_valor_2_0= ruleNumeroEntero ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1746:1: (lv_valor_2_0= ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1746:1: (lv_valor_2_0= ruleNumeroEntero )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1747:3: lv_valor_2_0= ruleNumeroEntero
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatrizAccess().getValorNumeroEnteroParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_ruleMatriz4049);
                    lv_valor_2_0=ruleNumeroEntero();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMatrizRule());
                    	        }
                           		add(
                           			current, 
                           			"valor",
                            		lv_valor_2_0, 
                            		"NumeroEntero");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1764:6: ( (lv_valor_3_0= ruleVariableID ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1764:6: ( (lv_valor_3_0= ruleVariableID ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1765:1: (lv_valor_3_0= ruleVariableID )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1765:1: (lv_valor_3_0= ruleVariableID )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1766:3: lv_valor_3_0= ruleVariableID
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatrizAccess().getValorVariableIDParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleMatriz4076);
                    lv_valor_3_0=ruleVariableID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMatrizRule());
                    	        }
                           		add(
                           			current, 
                           			"valor",
                            		lv_valor_3_0, 
                            		"VariableID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMatriz4089); 

                	newLeafNode(otherlv_4, grammarAccess.getMatrizAccess().getRightSquareBracketLeftSquareBracketKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1786:1: ( ( (lv_valor_5_0= ruleNumeroEntero ) ) | ( (lv_valor_6_0= ruleVariableID ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT||LA28_0==71) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1786:2: ( (lv_valor_5_0= ruleNumeroEntero ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1786:2: ( (lv_valor_5_0= ruleNumeroEntero ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1787:1: (lv_valor_5_0= ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1787:1: (lv_valor_5_0= ruleNumeroEntero )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1788:3: lv_valor_5_0= ruleNumeroEntero
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatrizAccess().getValorNumeroEnteroParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_ruleMatriz4111);
                    lv_valor_5_0=ruleNumeroEntero();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMatrizRule());
                    	        }
                           		add(
                           			current, 
                           			"valor",
                            		lv_valor_5_0, 
                            		"NumeroEntero");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1805:6: ( (lv_valor_6_0= ruleVariableID ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1805:6: ( (lv_valor_6_0= ruleVariableID ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1806:1: (lv_valor_6_0= ruleVariableID )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1806:1: (lv_valor_6_0= ruleVariableID )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1807:3: lv_valor_6_0= ruleVariableID
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatrizAccess().getValorVariableIDParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleMatriz4138);
                    lv_valor_6_0=ruleVariableID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMatrizRule());
                    	        }
                           		add(
                           			current, 
                           			"valor",
                            		lv_valor_6_0, 
                            		"VariableID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMatriz4151); 

                	newLeafNode(otherlv_7, grammarAccess.getMatrizAccess().getRightSquareBracketSpaceKeyword_5());
                
            otherlv_8=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleMatriz4163); 

                	newLeafNode(otherlv_8, grammarAccess.getMatrizAccess().getDeKeyword_6());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1831:1: ( (lv_tipo_9_0= ruleTipo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1832:1: (lv_tipo_9_0= ruleTipo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1832:1: (lv_tipo_9_0= ruleTipo )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1833:3: lv_tipo_9_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getTipoTipoParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleMatriz4184);
            lv_tipo_9_0=ruleTipo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrizRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_9_0, 
                    		"Tipo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMatriz4196); 

                	newLeafNode(otherlv_10, grammarAccess.getMatrizAccess().getSpaceColonSpaceKeyword_8());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1853:1: ( (lv_nombre_11_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1854:1: (lv_nombre_11_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1854:1: (lv_nombre_11_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1855:3: lv_nombre_11_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getNombreEStringParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatriz4217);
            lv_nombre_11_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrizRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_11_0, 
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1879:1: entryRuleRegistro returns [EObject current=null] : iv_ruleRegistro= ruleRegistro EOF ;
    public final EObject entryRuleRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistro = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1880:2: (iv_ruleRegistro= ruleRegistro EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1881:2: iv_ruleRegistro= ruleRegistro EOF
            {
             newCompositeNode(grammarAccess.getRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRegistro_in_entryRuleRegistro4253);
            iv_ruleRegistro=ruleRegistro();

            state._fsp--;

             current =iv_ruleRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegistro4263); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1888:1: ruleRegistro returns [EObject current=null] : (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' ) ;
    public final EObject ruleRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1891:28: ( (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1892:1: (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1892:1: (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1892:3: otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleRegistro4300); 

                	newLeafNode(otherlv_0, grammarAccess.getRegistroAccess().getRegistroKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1896:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1897:1: (lv_nombre_1_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1897:1: (lv_nombre_1_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1898:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRegistro4321);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1914:2: ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1914:3: ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1914:3: ( (lv_variable_2_0= ruleDeclaracion ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1915:1: (lv_variable_2_0= ruleDeclaracion )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1915:1: (lv_variable_2_0= ruleDeclaracion )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1916:3: lv_variable_2_0= ruleDeclaracion
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getVariableDeclaracionParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleRegistro4343);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1932:2: ( (lv_variable_3_0= ruleDeclaracion ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)||(LA29_0>=66 && LA29_0<=70)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1933:1: (lv_variable_3_0= ruleDeclaracion )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1933:1: (lv_variable_3_0= ruleDeclaracion )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1934:3: lv_variable_3_0= ruleDeclaracion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRegistroAccess().getVariableDeclaracionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleRegistro4364);
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
            	    break loop29;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleRegistro4378); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1962:1: entryRuleArchivo returns [EObject current=null] : iv_ruleArchivo= ruleArchivo EOF ;
    public final EObject entryRuleArchivo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchivo = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1963:2: (iv_ruleArchivo= ruleArchivo EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1964:2: iv_ruleArchivo= ruleArchivo EOF
            {
             newCompositeNode(grammarAccess.getArchivoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArchivo_in_entryRuleArchivo4414);
            iv_ruleArchivo=ruleArchivo();

            state._fsp--;

             current =iv_ruleArchivo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArchivo4424); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1971:1: ruleArchivo returns [EObject current=null] : (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ':' ( (lv_nombre_3_0= ruleEString ) ) ) ;
    public final EObject ruleArchivo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_tipo_1_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1974:28: ( (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ':' ( (lv_nombre_3_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1975:1: (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ':' ( (lv_nombre_3_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1975:1: (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ':' ( (lv_nombre_3_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1975:3: otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ':' ( (lv_nombre_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleArchivo4461); 

                	newLeafNode(otherlv_0, grammarAccess.getArchivoAccess().getArchivoDeKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1979:1: ( (lv_tipo_1_0= ruleTipo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1980:1: (lv_tipo_1_0= ruleTipo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1980:1: (lv_tipo_1_0= ruleTipo )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1981:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleArchivo4482);
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

            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleArchivo4494); 

                	newLeafNode(otherlv_2, grammarAccess.getArchivoAccess().getColonKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2001:1: ( (lv_nombre_3_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2002:1: (lv_nombre_3_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2002:1: (lv_nombre_3_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2003:3: lv_nombre_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getNombreEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArchivo4515);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2027:1: entryRuleEnumerado returns [EObject current=null] : iv_ruleEnumerado= ruleEnumerado EOF ;
    public final EObject entryRuleEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerado = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2028:2: (iv_ruleEnumerado= ruleEnumerado EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2029:2: iv_ruleEnumerado= ruleEnumerado EOF
            {
             newCompositeNode(grammarAccess.getEnumeradoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumerado_in_entryRuleEnumerado4551);
            iv_ruleEnumerado=ruleEnumerado();

            state._fsp--;

             current =iv_ruleEnumerado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerado4561); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2036:1: ruleEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )* ) otherlv_6= '}' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2039:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )* ) otherlv_6= '}' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2040:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )* ) otherlv_6= '}' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2040:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )* ) otherlv_6= '}' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2040:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )* ) otherlv_6= '}'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2040:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2041:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2041:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2042:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnumerado4607);
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

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEnumerado4619); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumeradoAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEnumerado4631); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumeradoAccess().getLeftCurlyBracketKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2066:1: ( ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2066:2: ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2066:2: ( (lv_valor_3_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2067:1: (lv_valor_3_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2067:1: (lv_valor_3_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2068:3: lv_valor_3_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorValorParserRuleCall_3_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleEnumerado4653);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2084:2: (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==18) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2084:4: otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEnumerado4666); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumeradoAccess().getCommaKeyword_3_1_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2088:1: ( (lv_valor_5_0= rulevalor ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2089:1: (lv_valor_5_0= rulevalor )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2089:1: (lv_valor_5_0= rulevalor )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2090:3: lv_valor_5_0= rulevalor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorValorParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleEnumerado4687);
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
            	    break loop30;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEnumerado4702); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2118:1: entryRuleSubrango returns [EObject current=null] : iv_ruleSubrango= ruleSubrango EOF ;
    public final EObject entryRuleSubrango() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrango = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2119:2: (iv_ruleSubrango= ruleSubrango EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2120:2: iv_ruleSubrango= ruleSubrango EOF
            {
             newCompositeNode(grammarAccess.getSubrangoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrango_in_entryRuleSubrango4738);
            iv_ruleSubrango=ruleSubrango();

            state._fsp--;

             current =iv_ruleSubrango; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrango4748); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2127:1: ruleSubrango returns [EObject current=null] : this_SubrangoNumerico_0= ruleSubrangoNumerico ;
    public final EObject ruleSubrango() throws RecognitionException {
        EObject current = null;

        EObject this_SubrangoNumerico_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2130:28: (this_SubrangoNumerico_0= ruleSubrangoNumerico )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2132:5: this_SubrangoNumerico_0= ruleSubrangoNumerico
            {
             
                    newCompositeNode(grammarAccess.getSubrangoAccess().getSubrangoNumericoParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSubrangoNumerico_in_ruleSubrango4794);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2148:1: entryRuleSubrangoNumerico returns [EObject current=null] : iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF ;
    public final EObject entryRuleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoNumerico = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2149:2: (iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2150:2: iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF
            {
             newCompositeNode(grammarAccess.getSubrangoNumericoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrangoNumerico_in_entryRuleSubrangoNumerico4828);
            iv_ruleSubrangoNumerico=ruleSubrangoNumerico();

            state._fsp--;

             current =iv_ruleSubrangoNumerico; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrangoNumerico4838); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2157:1: ruleSubrangoNumerico returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) ;
    public final EObject ruleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2160:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2161:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2161:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2161:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2161:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2162:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2162:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2163:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoNumerico4884);
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

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSubrangoNumerico4896); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoNumericoAccess().getEqualsSignKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2183:1: ( (lv_limite_inf_2_0= ruleEInt ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2184:1: (lv_limite_inf_2_0= ruleEInt )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2184:1: (lv_limite_inf_2_0= ruleEInt )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2185:3: lv_limite_inf_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_infEIntParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubrangoNumerico4917);
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

            otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleSubrangoNumerico4929); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoNumericoAccess().getFullStopFullStopKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2205:1: ( (lv_limite_sup_4_0= ruleEInt ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2206:1: (lv_limite_sup_4_0= ruleEInt )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2206:1: (lv_limite_sup_4_0= ruleEInt )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2207:3: lv_limite_sup_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_supEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubrangoNumerico4950);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2231:1: entryRuleInicio returns [EObject current=null] : iv_ruleInicio= ruleInicio EOF ;
    public final EObject entryRuleInicio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInicio = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2232:2: (iv_ruleInicio= ruleInicio EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2233:2: iv_ruleInicio= ruleInicio EOF
            {
             newCompositeNode(grammarAccess.getInicioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_entryRuleInicio4986);
            iv_ruleInicio=ruleInicio();

            state._fsp--;

             current =iv_ruleInicio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInicio4996); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2240:1: ruleInicio returns [EObject current=null] : ( () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2243:28: ( ( () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2244:1: ( () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2244:1: ( () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2244:2: () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2244:2: ()
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2245:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInicioAccess().getInicioAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleInicio5042); 

                	newLeafNode(otherlv_1, grammarAccess.getInicioAccess().getVarKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2254:1: ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)||(LA32_0>=66 && LA32_0<=70)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2254:2: ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2254:2: ( (lv_declaracion_2_0= ruleDeclaracion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2255:1: (lv_declaracion_2_0= ruleDeclaracion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2255:1: (lv_declaracion_2_0= ruleDeclaracion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2256:3: lv_declaracion_2_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio5064);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2272:2: ( (lv_declaracion_3_0= ruleDeclaracion ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)||(LA31_0>=66 && LA31_0<=70)) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2273:1: (lv_declaracion_3_0= ruleDeclaracion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2273:1: (lv_declaracion_3_0= ruleDeclaracion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2274:3: lv_declaracion_3_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio5085);
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
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleInicio5100); 

                	newLeafNode(otherlv_4, grammarAccess.getInicioAccess().getInicioKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2294:1: ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)||(LA34_0>=50 && LA34_0<=52)||LA34_0==55||LA34_0==58||LA34_0==60||LA34_0==63) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2294:2: ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2294:2: ( (lv_tiene_5_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2295:1: (lv_tiene_5_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2295:1: (lv_tiene_5_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2296:3: lv_tiene_5_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio5122);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2312:2: ( (lv_tiene_6_0= ruleSentencias ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_ID)||(LA33_0>=50 && LA33_0<=52)||LA33_0==55||LA33_0==58||LA33_0==60||LA33_0==63) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2313:1: (lv_tiene_6_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2313:1: (lv_tiene_6_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2314:3: lv_tiene_6_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio5143);
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
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleInicio5158); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2342:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2343:2: (iv_ruleEString= ruleEString EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2344:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString5195);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString5206); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2351:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2354:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2355:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2355:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2355:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString5246); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2363:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString5272); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2378:1: entryRuleDeclaracionVariable returns [EObject current=null] : iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF ;
    public final EObject entryRuleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionVariable = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2379:2: (iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2380:2: iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable5317);
            iv_ruleDeclaracionVariable=ruleDeclaracionVariable();

            state._fsp--;

             current =iv_ruleDeclaracionVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionVariable5327); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2387:1: ruleDeclaracionVariable returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2390:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2391:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2391:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2391:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2391:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2392:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2392:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2393:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable5373);
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

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDeclaracionVariable5385); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionVariableAccess().getColonKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2413:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2414:1: (lv_variable_2_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2414:1: (lv_variable_2_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2415:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable5406);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2431:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==18) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2431:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDeclaracionVariable5419); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionVariableAccess().getCommaKeyword_3_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2435:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2436:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2436:1: (lv_variable_4_0= ruleVariable )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2437:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable5440);
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
            	    break loop36;
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2461:1: entryRuleDeclaracionPropia returns [EObject current=null] : iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF ;
    public final EObject entryRuleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionPropia = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2462:2: (iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2463:2: iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionPropiaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia5478);
            iv_ruleDeclaracionPropia=ruleDeclaracionPropia();

            state._fsp--;

             current =iv_ruleDeclaracionPropia; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionPropia5488); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2470:1: ruleDeclaracionPropia returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2473:28: ( ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2474:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2474:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2474:2: ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2474:2: ( (lv_tipo_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2475:1: (lv_tipo_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2475:1: (lv_tipo_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2476:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getTipoEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDeclaracionPropia5534);
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

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDeclaracionPropia5546); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionPropiaAccess().getColonKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2496:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2497:1: (lv_variable_2_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2497:1: (lv_variable_2_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2498:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia5567);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2514:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==18) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2514:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDeclaracionPropia5580); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionPropiaAccess().getCommaKeyword_3_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2518:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2519:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2519:1: (lv_variable_4_0= ruleVariable )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2520:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia5601);
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
            	    break loop37;
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2544:1: entryRuleLlamadaFuncion returns [EObject current=null] : iv_ruleLlamadaFuncion= ruleLlamadaFuncion EOF ;
    public final EObject entryRuleLlamadaFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlamadaFuncion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2545:2: (iv_ruleLlamadaFuncion= ruleLlamadaFuncion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2546:2: iv_ruleLlamadaFuncion= ruleLlamadaFuncion EOF
            {
             newCompositeNode(grammarAccess.getLlamadaFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_entryRuleLlamadaFuncion5639);
            iv_ruleLlamadaFuncion=ruleLlamadaFuncion();

            state._fsp--;

             current =iv_ruleLlamadaFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLlamadaFuncion5649); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2553:1: ruleLlamadaFuncion returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )? otherlv_5= ')' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2556:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )? otherlv_5= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2557:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )? otherlv_5= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2557:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )? otherlv_5= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2557:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )? otherlv_5= ')'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2557:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2558:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2558:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2559:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getLlamadaFuncionAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLlamadaFuncion5695);
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

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLlamadaFuncion5707); 

                	newLeafNode(otherlv_1, grammarAccess.getLlamadaFuncionAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2579:1: ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_CAR && LA39_0<=RULE_ID)||(LA39_0>=RULE_CAD && LA39_0<=RULE_INT)||LA39_0==32||LA39_0==71||(LA39_0>=74 && LA39_0<=75)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2579:2: ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2579:2: ( (lv_operador_2_0= ruleOperador ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2580:1: (lv_operador_2_0= ruleOperador )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2580:1: (lv_operador_2_0= ruleOperador )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2581:3: lv_operador_2_0= ruleOperador
                    {
                     
                    	        newCompositeNode(grammarAccess.getLlamadaFuncionAccess().getOperadorOperadorParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleLlamadaFuncion5729);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2597:2: (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==18) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2597:4: otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLlamadaFuncion5742); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getLlamadaFuncionAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2601:1: ( (lv_operador_4_0= ruleOperador ) )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2602:1: (lv_operador_4_0= ruleOperador )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2602:1: (lv_operador_4_0= ruleOperador )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2603:3: lv_operador_4_0= ruleOperador
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLlamadaFuncionAccess().getOperadorOperadorParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleLlamadaFuncion5763);
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
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLlamadaFuncion5779); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2631:1: entryRuleAsignacion returns [EObject current=null] : iv_ruleAsignacion= ruleAsignacion EOF ;
    public final EObject entryRuleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2632:2: (iv_ruleAsignacion= ruleAsignacion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2633:2: iv_ruleAsignacion= ruleAsignacion EOF
            {
             newCompositeNode(grammarAccess.getAsignacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_entryRuleAsignacion5815);
            iv_ruleAsignacion=ruleAsignacion();

            state._fsp--;

             current =iv_ruleAsignacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacion5825); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2640:1: ruleAsignacion returns [EObject current=null] : (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) ;
    public final EObject ruleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject this_AsignacionNormal_0 = null;

        EObject this_AsignacionCompleja_1 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2643:28: ( (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2644:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2644:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==RULE_MAT||LA40_1==33) ) {
                    alt40=1;
                }
                else if ( (LA40_1==29||LA40_1==32) ) {
                    alt40=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA40_0==RULE_ID) ) {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==29||LA40_2==32) ) {
                    alt40=2;
                }
                else if ( (LA40_2==RULE_MAT||LA40_2==33) ) {
                    alt40=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2645:5: this_AsignacionNormal_0= ruleAsignacionNormal
                    {
                     
                            newCompositeNode(grammarAccess.getAsignacionAccess().getAsignacionNormalParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_ruleAsignacion5872);
                    this_AsignacionNormal_0=ruleAsignacionNormal();

                    state._fsp--;

                     
                            current = this_AsignacionNormal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2655:5: this_AsignacionCompleja_1= ruleAsignacionCompleja
                    {
                     
                            newCompositeNode(grammarAccess.getAsignacionAccess().getAsignacionComplejaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacionCompleja_in_ruleAsignacion5899);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2671:1: entryRuleAsignacionNormal returns [EObject current=null] : iv_ruleAsignacionNormal= ruleAsignacionNormal EOF ;
    public final EObject entryRuleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionNormal = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2672:2: (iv_ruleAsignacionNormal= ruleAsignacionNormal EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2673:2: iv_ruleAsignacionNormal= ruleAsignacionNormal EOF
            {
             newCompositeNode(grammarAccess.getAsignacionNormalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_entryRuleAsignacionNormal5934);
            iv_ruleAsignacionNormal=ruleAsignacionNormal();

            state._fsp--;

             current =iv_ruleAsignacionNormal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacionNormal5944); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2680:1: ruleAsignacionNormal returns [EObject current=null] : ( ( (lv_lvalue_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) ) ;
    public final EObject ruleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        Token lv_Mat_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_lvalue_0_0 = null;

        EObject lv_operador_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2683:28: ( ( ( (lv_lvalue_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2684:1: ( ( (lv_lvalue_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2684:1: ( ( (lv_lvalue_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2684:2: ( (lv_lvalue_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2684:2: ( (lv_lvalue_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2685:1: (lv_lvalue_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2685:1: (lv_lvalue_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2686:3: lv_lvalue_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getLvalueEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsignacionNormal5990);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2702:2: ( (lv_Mat_1_0= RULE_MAT ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_MAT) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2703:1: (lv_Mat_1_0= RULE_MAT )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2703:1: (lv_Mat_1_0= RULE_MAT )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2704:3: lv_Mat_1_0= RULE_MAT
            	    {
            	    lv_Mat_1_0=(Token)match(input,RULE_MAT,FollowSets000.FOLLOW_RULE_MAT_in_ruleAsignacionNormal6007); 

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
            	    break loop41;
                }
            } while (true);

            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAsignacionNormal6025); 

                	newLeafNode(otherlv_2, grammarAccess.getAsignacionNormalAccess().getEqualsSignKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2724:1: ( (lv_operador_3_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2725:1: (lv_operador_3_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2725:1: (lv_operador_3_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2726:3: lv_operador_3_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getOperadorValorParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleAsignacionNormal6046);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2750:1: entryRuleAsignacionCompleja returns [EObject current=null] : iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF ;
    public final EObject entryRuleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionCompleja = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2751:2: (iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2752:2: iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF
            {
             newCompositeNode(grammarAccess.getAsignacionComplejaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionCompleja_in_entryRuleAsignacionCompleja6082);
            iv_ruleAsignacionCompleja=ruleAsignacionCompleja();

            state._fsp--;

             current =iv_ruleAsignacionCompleja; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacionCompleja6092); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2759:1: ruleAsignacionCompleja returns [EObject current=null] : ( ( (lv_complejo_0_0= ruleValorComplejo ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) ) ;
    public final EObject ruleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        Token lv_Mat_1_0=null;
        Token otherlv_2=null;
        EObject lv_complejo_0_0 = null;

        EObject lv_operador_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2762:28: ( ( ( (lv_complejo_0_0= ruleValorComplejo ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2763:1: ( ( (lv_complejo_0_0= ruleValorComplejo ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2763:1: ( ( (lv_complejo_0_0= ruleValorComplejo ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2763:2: ( (lv_complejo_0_0= ruleValorComplejo ) ) ( (lv_Mat_1_0= RULE_MAT ) )* otherlv_2= '=' ( (lv_operador_3_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2763:2: ( (lv_complejo_0_0= ruleValorComplejo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2764:1: (lv_complejo_0_0= ruleValorComplejo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2764:1: (lv_complejo_0_0= ruleValorComplejo )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2765:3: lv_complejo_0_0= ruleValorComplejo
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getComplejoValorComplejoParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleValorComplejo_in_ruleAsignacionCompleja6138);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2781:2: ( (lv_Mat_1_0= RULE_MAT ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_MAT) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2782:1: (lv_Mat_1_0= RULE_MAT )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2782:1: (lv_Mat_1_0= RULE_MAT )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2783:3: lv_Mat_1_0= RULE_MAT
            	    {
            	    lv_Mat_1_0=(Token)match(input,RULE_MAT,FollowSets000.FOLLOW_RULE_MAT_in_ruleAsignacionCompleja6155); 

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
            	    break loop42;
                }
            } while (true);

            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAsignacionCompleja6173); 

                	newLeafNode(otherlv_2, grammarAccess.getAsignacionComplejaAccess().getEqualsSignKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2803:1: ( (lv_operador_3_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2804:1: (lv_operador_3_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2804:1: (lv_operador_3_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2805:3: lv_operador_3_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getOperadorValorParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleAsignacionCompleja6194);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2829:1: entryRuleEscribir returns [EObject current=null] : iv_ruleEscribir= ruleEscribir EOF ;
    public final EObject entryRuleEscribir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscribir = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2830:2: (iv_ruleEscribir= ruleEscribir EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2831:2: iv_ruleEscribir= ruleEscribir EOF
            {
             newCompositeNode(grammarAccess.getEscribirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_entryRuleEscribir6230);
            iv_ruleEscribir=ruleEscribir();

            state._fsp--;

             current =iv_ruleEscribir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEscribir6240); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2838:1: ruleEscribir returns [EObject current=null] : (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2841:28: ( (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2842:1: (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2842:1: (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2842:3: otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEscribir6277); 

                	newLeafNode(otherlv_0, grammarAccess.getEscribirAccess().getEscribirKeyword_0());
                
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEscribir6289); 

                	newLeafNode(otherlv_1, grammarAccess.getEscribirAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2850:1: ( (lv_operador_2_0= ruleOperador ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2851:1: (lv_operador_2_0= ruleOperador )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2851:1: (lv_operador_2_0= ruleOperador )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2852:3: lv_operador_2_0= ruleOperador
            {
             
            	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleEscribir6310);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2868:2: (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==18) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2868:4: otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEscribir6323); 

            	        	newLeafNode(otherlv_3, grammarAccess.getEscribirAccess().getCommaKeyword_3_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2872:1: ( (lv_operador_4_0= ruleOperador ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2873:1: (lv_operador_4_0= ruleOperador )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2873:1: (lv_operador_4_0= ruleOperador )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2874:3: lv_operador_4_0= ruleOperador
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleEscribir6344);
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
            	    break loop43;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEscribir6358); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2902:1: entryRuleLeer returns [EObject current=null] : iv_ruleLeer= ruleLeer EOF ;
    public final EObject entryRuleLeer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeer = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2903:2: (iv_ruleLeer= ruleLeer EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2904:2: iv_ruleLeer= ruleLeer EOF
            {
             newCompositeNode(grammarAccess.getLeerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeer_in_entryRuleLeer6394);
            iv_ruleLeer=ruleLeer();

            state._fsp--;

             current =iv_ruleLeer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeer6404); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2911:1: ruleLeer returns [EObject current=null] : (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')' ) ;
    public final EObject ruleLeer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2914:28: ( (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2915:1: (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2915:1: (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2915:3: otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleLeer6441); 

                	newLeafNode(otherlv_0, grammarAccess.getLeerAccess().getLeerKeyword_0());
                
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLeer6453); 

                	newLeafNode(otherlv_1, grammarAccess.getLeerAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2923:1: ( (lv_variable_2_0= ruleVariableID ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2924:1: (lv_variable_2_0= ruleVariableID )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2924:1: (lv_variable_2_0= ruleVariableID )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2925:3: lv_variable_2_0= ruleVariableID
            {
             
            	        newCompositeNode(grammarAccess.getLeerAccess().getVariableVariableIDParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleLeer6474);
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

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLeer6486); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2953:1: entryRuleSi returns [EObject current=null] : iv_ruleSi= ruleSi EOF ;
    public final EObject entryRuleSi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSi = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2954:2: (iv_ruleSi= ruleSi EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2955:2: iv_ruleSi= ruleSi EOF
            {
             newCompositeNode(grammarAccess.getSiRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSi_in_entryRuleSi6522);
            iv_ruleSi=ruleSi();

            state._fsp--;

             current =iv_ruleSi; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSi6532); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2962:1: ruleSi returns [EObject current=null] : (otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2965:28: ( (otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2966:1: (otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2966:1: (otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2966:3: otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleSi6569); 

                	newLeafNode(otherlv_0, grammarAccess.getSiAccess().getSiKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2970:1: ( (lv_valor_1_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2971:1: (lv_valor_1_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2971:1: (lv_valor_1_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2972:3: lv_valor_1_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getSiAccess().getValorValorParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleSi6590);
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

            otherlv_2=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleSi6602); 

                	newLeafNode(otherlv_2, grammarAccess.getSiAccess().getEntoncesKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2992:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)||(LA45_0>=50 && LA45_0<=52)||LA45_0==55||LA45_0==58||LA45_0==60||LA45_0==63) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2992:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2992:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2993:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2993:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2994:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi6624);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3010:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_ID)||(LA44_0>=50 && LA44_0<=52)||LA44_0==55||LA44_0==58||LA44_0==60||LA44_0==63) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3011:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3011:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3012:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi6645);
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
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3028:5: ( (lv_devuelve_5_0= ruleDevolver ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==88) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3029:1: (lv_devuelve_5_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3029:1: (lv_devuelve_5_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3030:3: lv_devuelve_5_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getDevuelveDevolverParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSi6669);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3046:3: ( (lv_sino_6_0= ruleSino ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==87) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3047:1: (lv_sino_6_0= ruleSino )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3047:1: (lv_sino_6_0= ruleSino )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3048:3: lv_sino_6_0= ruleSino
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSinoSinoParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSino_in_ruleSi6691);
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

            otherlv_7=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleSi6704); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3076:1: entryRulemientras returns [EObject current=null] : iv_rulemientras= rulemientras EOF ;
    public final EObject entryRulemientras() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemientras = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3077:2: (iv_rulemientras= rulemientras EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3078:2: iv_rulemientras= rulemientras EOF
            {
             newCompositeNode(grammarAccess.getMientrasRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemientras_in_entryRulemientras6740);
            iv_rulemientras=rulemientras();

            state._fsp--;

             current =iv_rulemientras; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemientras6750); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3085:1: rulemientras returns [EObject current=null] : (otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3088:28: ( (otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3089:1: (otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3089:1: (otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3089:3: otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_rulemientras6787); 

                	newLeafNode(otherlv_0, grammarAccess.getMientrasAccess().getMientrasKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3093:1: ( (lv_valor_1_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3094:1: (lv_valor_1_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3094:1: (lv_valor_1_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3095:3: lv_valor_1_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getMientrasAccess().getValorValorParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rulemientras6808);
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

            otherlv_2=(Token)match(input,56,FollowSets000.FOLLOW_56_in_rulemientras6820); 

                	newLeafNode(otherlv_2, grammarAccess.getMientrasAccess().getHacerKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3115:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_ID)||(LA49_0>=50 && LA49_0<=52)||LA49_0==55||LA49_0==58||LA49_0==60||LA49_0==63) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3115:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3115:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3116:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3116:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3117:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras6842);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3133:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_ID)||(LA48_0>=50 && LA48_0<=52)||LA48_0==55||LA48_0==58||LA48_0==60||LA48_0==63) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3134:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3134:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3135:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras6863);
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
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,57,FollowSets000.FOLLOW_57_in_rulemientras6878); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3163:1: entryRulerepetir returns [EObject current=null] : iv_rulerepetir= rulerepetir EOF ;
    public final EObject entryRulerepetir() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetir = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3164:2: (iv_rulerepetir= rulerepetir EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3165:2: iv_rulerepetir= rulerepetir EOF
            {
             newCompositeNode(grammarAccess.getRepetirRule()); 
            pushFollow(FollowSets000.FOLLOW_rulerepetir_in_entryRulerepetir6914);
            iv_rulerepetir=rulerepetir();

            state._fsp--;

             current =iv_rulerepetir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulerepetir6924); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3172:1: rulerepetir returns [EObject current=null] : (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) ) ) ;
    public final EObject rulerepetir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_sentencias_1_0 = null;

        EObject lv_sentencias_2_0 = null;

        EObject lv_valor_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3175:28: ( (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3176:1: (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3176:1: (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3176:3: otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) )
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_rulerepetir6961); 

                	newLeafNode(otherlv_0, grammarAccess.getRepetirAccess().getRepetirKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3180:1: ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_STRING && LA51_0<=RULE_ID)||(LA51_0>=50 && LA51_0<=52)||LA51_0==55||LA51_0==58||LA51_0==60||LA51_0==63) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3180:2: ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3180:2: ( (lv_sentencias_1_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3181:1: (lv_sentencias_1_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3181:1: (lv_sentencias_1_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3182:3: lv_sentencias_1_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir6983);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3198:2: ( (lv_sentencias_2_0= ruleSentencias ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( ((LA50_0>=RULE_STRING && LA50_0<=RULE_ID)||(LA50_0>=50 && LA50_0<=52)||LA50_0==55||LA50_0==58||LA50_0==60||LA50_0==63) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3199:1: (lv_sentencias_2_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3199:1: (lv_sentencias_2_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3200:3: lv_sentencias_2_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir7004);
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
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,59,FollowSets000.FOLLOW_59_in_rulerepetir7019); 

                	newLeafNode(otherlv_3, grammarAccess.getRepetirAccess().getHasta_queKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3220:1: ( (lv_valor_4_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3221:1: (lv_valor_4_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3221:1: (lv_valor_4_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3222:3: lv_valor_4_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getRepetirAccess().getValorValorParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rulerepetir7040);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3246:1: entryRuledesde returns [EObject current=null] : iv_ruledesde= ruledesde EOF ;
    public final EObject entryRuledesde() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledesde = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3247:2: (iv_ruledesde= ruledesde EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3248:2: iv_ruledesde= ruledesde EOF
            {
             newCompositeNode(grammarAccess.getDesdeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruledesde_in_entryRuledesde7076);
            iv_ruledesde=ruledesde();

            state._fsp--;

             current =iv_ruledesde; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuledesde7086); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3255:1: ruledesde returns [EObject current=null] : (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3258:28: ( (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3259:1: (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3259:1: (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3259:3: otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde'
            {
            otherlv_0=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruledesde7123); 

                	newLeafNode(otherlv_0, grammarAccess.getDesdeAccess().getDesdeKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3263:1: ( (lv_asignacion_1_0= ruleAsignacionNormal ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3264:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3264:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3265:3: lv_asignacion_1_0= ruleAsignacionNormal
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getAsignacionAsignacionNormalParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_ruledesde7144);
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

            otherlv_2=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruledesde7156); 

                	newLeafNode(otherlv_2, grammarAccess.getDesdeAccess().getHastaKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3285:1: ( (lv_valor_3_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3286:1: (lv_valor_3_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3286:1: (lv_valor_3_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3287:3: lv_valor_3_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getValorValorParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruledesde7177);
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

            otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruledesde7189); 

                	newLeafNode(otherlv_4, grammarAccess.getDesdeAccess().getHacerKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3307:1: ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_ID)||(LA53_0>=50 && LA53_0<=52)||LA53_0==55||LA53_0==58||LA53_0==60||LA53_0==63) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3307:2: ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3307:2: ( (lv_sentencias_5_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3308:1: (lv_sentencias_5_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3308:1: (lv_sentencias_5_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3309:3: lv_sentencias_5_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde7211);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3325:2: ( (lv_sentencias_6_0= ruleSentencias ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)||(LA52_0>=50 && LA52_0<=52)||LA52_0==55||LA52_0==58||LA52_0==60||LA52_0==63) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3326:1: (lv_sentencias_6_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3326:1: (lv_sentencias_6_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3327:3: lv_sentencias_6_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde7232);
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
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruledesde7247); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3355:1: entryRuleCaso returns [EObject current=null] : iv_ruleCaso= ruleCaso EOF ;
    public final EObject entryRuleCaso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaso = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3356:2: (iv_ruleCaso= ruleCaso EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3357:2: iv_ruleCaso= ruleCaso EOF
            {
             newCompositeNode(grammarAccess.getCasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCaso_in_entryRuleCaso7283);
            iv_ruleCaso=ruleCaso();

            state._fsp--;

             current =iv_ruleCaso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCaso7293); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3364:1: ruleCaso returns [EObject current=null] : ( ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ':' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) ;
    public final EObject ruleCaso() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operador_0_0 = null;

        EObject lv_sentencias_2_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_devuelve_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3367:28: ( ( ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ':' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3368:1: ( ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ':' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3368:1: ( ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ':' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3368:2: ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ':' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )?
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3368:2: ( (lv_operador_0_0= ruleOperador ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3369:1: (lv_operador_0_0= ruleOperador )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3369:1: (lv_operador_0_0= ruleOperador )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3370:3: lv_operador_0_0= ruleOperador
            {
             
            	        newCompositeNode(grammarAccess.getCasoAccess().getOperadorOperadorParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleCaso7339);
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

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleCaso7351); 

                	newLeafNode(otherlv_1, grammarAccess.getCasoAccess().getColonKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3390:1: ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )?
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3390:2: ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3390:2: ( (lv_sentencias_2_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3391:1: (lv_sentencias_2_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3391:1: (lv_sentencias_2_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3392:3: lv_sentencias_2_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso7373);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3408:2: ( (lv_sentencias_3_0= ruleSentencias ) )*
                    loop54:
                    do {
                        int alt54=2;
                        alt54 = dfa54.predict(input);
                        switch (alt54) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3409:1: (lv_sentencias_3_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3409:1: (lv_sentencias_3_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3410:3: lv_sentencias_3_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso7394);
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
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3426:5: ( (lv_devuelve_4_0= ruleDevolver ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==88) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3427:1: (lv_devuelve_4_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3427:1: (lv_devuelve_4_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3428:3: lv_devuelve_4_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getDevuelveDevolverParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleCaso7418);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3452:1: entryRulesegun returns [EObject current=null] : iv_rulesegun= rulesegun EOF ;
    public final EObject entryRulesegun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesegun = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3453:2: (iv_rulesegun= rulesegun EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3454:2: iv_rulesegun= rulesegun EOF
            {
             newCompositeNode(grammarAccess.getSegunRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesegun_in_entryRulesegun7455);
            iv_rulesegun=rulesegun();

            state._fsp--;

             current =iv_rulesegun; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesegun7465); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3461:1: rulesegun returns [EObject current=null] : (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3464:28: ( (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3465:1: (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3465:1: (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3465:3: otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun'
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_63_in_rulesegun7502); 

                	newLeafNode(otherlv_0, grammarAccess.getSegunAccess().getSegun_seaKeyword_0());
                
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulesegun7514); 

                	newLeafNode(otherlv_1, grammarAccess.getSegunAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3473:1: ( (lv_valor_2_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3474:1: (lv_valor_2_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3474:1: (lv_valor_2_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3475:3: lv_valor_2_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getSegunAccess().getValorValorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rulesegun7535);
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

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulesegun7547); 

                	newLeafNode(otherlv_3, grammarAccess.getSegunAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_56_in_rulesegun7559); 

                	newLeafNode(otherlv_4, grammarAccess.getSegunAccess().getHacerKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3499:1: ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_CAR && LA58_0<=RULE_ID)||(LA58_0>=RULE_CAD && LA58_0<=RULE_INT)||LA58_0==32||LA58_0==71||(LA58_0>=74 && LA58_0<=75)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3499:2: ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3499:2: ( (lv_caso_5_0= ruleCaso ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3500:1: (lv_caso_5_0= ruleCaso )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3500:1: (lv_caso_5_0= ruleCaso )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3501:3: lv_caso_5_0= ruleCaso
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun7581);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3517:2: ( (lv_caso_6_0= ruleCaso ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( ((LA57_0>=RULE_CAR && LA57_0<=RULE_ID)||(LA57_0>=RULE_CAD && LA57_0<=RULE_INT)||LA57_0==32||LA57_0==71||(LA57_0>=74 && LA57_0<=75)) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3518:1: (lv_caso_6_0= ruleCaso )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3518:1: (lv_caso_6_0= ruleCaso )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3519:3: lv_caso_6_0= ruleCaso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun7602);
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
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,64,FollowSets000.FOLLOW_64_in_rulesegun7617); 

                	newLeafNode(otherlv_7, grammarAccess.getSegunAccess().getEn_otro_casoKeyword_6());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3539:1: ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_STRING && LA60_0<=RULE_ID)||(LA60_0>=50 && LA60_0<=52)||LA60_0==55||LA60_0==58||LA60_0==60||LA60_0==63) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3539:2: ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3539:2: ( (lv_sentencias_8_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3540:1: (lv_sentencias_8_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3540:1: (lv_sentencias_8_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3541:3: lv_sentencias_8_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun7639);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3557:2: ( (lv_sentencias_9_0= ruleSentencias ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( ((LA59_0>=RULE_STRING && LA59_0<=RULE_ID)||(LA59_0>=50 && LA59_0<=52)||LA59_0==55||LA59_0==58||LA59_0==60||LA59_0==63) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3558:1: (lv_sentencias_9_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3558:1: (lv_sentencias_9_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3559:3: lv_sentencias_9_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun7660);
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
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3575:5: ( (lv_devuelve_10_0= ruleDevolver ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==88) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3576:1: (lv_devuelve_10_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3576:1: (lv_devuelve_10_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3577:3: lv_devuelve_10_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getDevuelveDevolverParserRuleCall_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_rulesegun7684);
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

            otherlv_11=(Token)match(input,65,FollowSets000.FOLLOW_65_in_rulesegun7697); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3605:1: entryRuleincremento returns [EObject current=null] : iv_ruleincremento= ruleincremento EOF ;
    public final EObject entryRuleincremento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleincremento = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3606:2: (iv_ruleincremento= ruleincremento EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3607:2: iv_ruleincremento= ruleincremento EOF
            {
             newCompositeNode(grammarAccess.getIncrementoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleincremento_in_entryRuleincremento7733);
            iv_ruleincremento=ruleincremento();

            state._fsp--;

             current =iv_ruleincremento; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleincremento7743); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3614:1: ruleincremento returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) ) ) ;
    public final EObject ruleincremento() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_ssigno_1_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3617:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3618:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3618:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3618:2: ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3618:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3619:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3619:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3620:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIncrementoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleincremento7789);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3636:2: ( (lv_ssigno_1_0= ruleinc ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3637:1: (lv_ssigno_1_0= ruleinc )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3637:1: (lv_ssigno_1_0= ruleinc )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3638:3: lv_ssigno_1_0= ruleinc
            {
             
            	        newCompositeNode(grammarAccess.getIncrementoAccess().getSsignoIncParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_ruleincremento7810);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3662:1: entryRuleunaria returns [EObject current=null] : iv_ruleunaria= ruleunaria EOF ;
    public final EObject entryRuleunaria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunaria = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3663:2: (iv_ruleunaria= ruleunaria EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3664:2: iv_ruleunaria= ruleunaria EOF
            {
             newCompositeNode(grammarAccess.getUnariaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleunaria_in_entryRuleunaria7846);
            iv_ruleunaria=ruleunaria();

            state._fsp--;

             current =iv_ruleunaria; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleunaria7856); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3671:1: ruleunaria returns [EObject current=null] : (otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')' ) ;
    public final EObject ruleunaria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_ssigno_1_0 = null;

        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3674:28: ( (otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3675:1: (otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3675:1: (otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3675:3: otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleunaria7893); 

                	newLeafNode(otherlv_0, grammarAccess.getUnariaAccess().getLeftParenthesisKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3679:1: ( (lv_ssigno_1_0= ruleinc ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3680:1: (lv_ssigno_1_0= ruleinc )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3680:1: (lv_ssigno_1_0= ruleinc )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3681:3: lv_ssigno_1_0= ruleinc
            {
             
            	        newCompositeNode(grammarAccess.getUnariaAccess().getSsignoIncParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_ruleunaria7914);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3697:2: ( (lv_variable_2_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3698:1: (lv_variable_2_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3698:1: (lv_variable_2_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3699:3: lv_variable_2_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getUnariaAccess().getVariableValorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleunaria7935);
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

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleunaria7947); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3727:1: entryRuleTipoVariable returns [String current=null] : iv_ruleTipoVariable= ruleTipoVariable EOF ;
    public final String entryRuleTipoVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoVariable = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3728:2: (iv_ruleTipoVariable= ruleTipoVariable EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3729:2: iv_ruleTipoVariable= ruleTipoVariable EOF
            {
             newCompositeNode(grammarAccess.getTipoVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable7984);
            iv_ruleTipoVariable=ruleTipoVariable();

            state._fsp--;

             current =iv_ruleTipoVariable.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoVariable7995); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3736:1: ruleTipoVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' ) ;
    public final AntlrDatatypeRuleToken ruleTipoVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3739:28: ( (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3740:1: (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3740:1: (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' )
            int alt62=5;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt62=1;
                }
                break;
            case 67:
                {
                alt62=2;
                }
                break;
            case 68:
                {
                alt62=3;
                }
                break;
            case 69:
                {
                alt62=4;
                }
                break;
            case 70:
                {
                alt62=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3741:2: kw= 'entero'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleTipoVariable8033); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getEnteroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3748:2: kw= 'caracter'
                    {
                    kw=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleTipoVariable8052); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getCaracterKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3755:2: kw= 'real'
                    {
                    kw=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleTipoVariable8071); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getRealKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3762:2: kw= 'logico'
                    {
                    kw=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleTipoVariable8090); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getLogicoKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3769:2: kw= 'cadena'
                    {
                    kw=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleTipoVariable8109); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3782:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3783:2: (iv_ruleVariable= ruleVariable EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3784:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable8149);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable8159); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3791:1: ruleVariable returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_Mat_1_0=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3794:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3795:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3795:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3795:2: ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3795:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3796:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3796:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3797:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable8205);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3813:2: ( (lv_Mat_1_0= RULE_MAT ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_MAT) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3814:1: (lv_Mat_1_0= RULE_MAT )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3814:1: (lv_Mat_1_0= RULE_MAT )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3815:3: lv_Mat_1_0= RULE_MAT
            	    {
            	    lv_Mat_1_0=(Token)match(input,RULE_MAT,FollowSets000.FOLLOW_RULE_MAT_in_ruleVariable8222); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVariableID"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3839:1: entryRuleVariableID returns [EObject current=null] : iv_ruleVariableID= ruleVariableID EOF ;
    public final EObject entryRuleVariableID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableID = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3840:2: (iv_ruleVariableID= ruleVariableID EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3841:2: iv_ruleVariableID= ruleVariableID EOF
            {
             newCompositeNode(grammarAccess.getVariableIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_entryRuleVariableID8264);
            iv_ruleVariableID=ruleVariableID();

            state._fsp--;

             current =iv_ruleVariableID; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableID8274); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3848:1: ruleVariableID returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* ) ;
    public final EObject ruleVariableID() throws RecognitionException {
        EObject current = null;

        Token lv_Mat_1_0=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3851:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3852:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3852:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3852:2: ( (lv_nombre_0_0= ruleEString ) ) ( (lv_Mat_1_0= RULE_MAT ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3852:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3853:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3853:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3854:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableIDAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariableID8320);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3870:2: ( (lv_Mat_1_0= RULE_MAT ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_MAT) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3871:1: (lv_Mat_1_0= RULE_MAT )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3871:1: (lv_Mat_1_0= RULE_MAT )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3872:3: lv_Mat_1_0= RULE_MAT
            	    {
            	    lv_Mat_1_0=(Token)match(input,RULE_MAT,FollowSets000.FOLLOW_RULE_MAT_in_ruleVariableID8337); 

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
            	    break loop64;
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3896:1: entryRuleConstCadena returns [EObject current=null] : iv_ruleConstCadena= ruleConstCadena EOF ;
    public final EObject entryRuleConstCadena() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstCadena = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3897:2: (iv_ruleConstCadena= ruleConstCadena EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3898:2: iv_ruleConstCadena= ruleConstCadena EOF
            {
             newCompositeNode(grammarAccess.getConstCadenaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_entryRuleConstCadena8379);
            iv_ruleConstCadena=ruleConstCadena();

            state._fsp--;

             current =iv_ruleConstCadena; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstCadena8389); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3905:1: ruleConstCadena returns [EObject current=null] : ( (lv_contenido_0_0= RULE_CAD ) ) ;
    public final EObject ruleConstCadena() throws RecognitionException {
        EObject current = null;

        Token lv_contenido_0_0=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3908:28: ( ( (lv_contenido_0_0= RULE_CAD ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3909:1: ( (lv_contenido_0_0= RULE_CAD ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3909:1: ( (lv_contenido_0_0= RULE_CAD ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3910:1: (lv_contenido_0_0= RULE_CAD )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3910:1: (lv_contenido_0_0= RULE_CAD )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3911:3: lv_contenido_0_0= RULE_CAD
            {
            lv_contenido_0_0=(Token)match(input,RULE_CAD,FollowSets000.FOLLOW_RULE_CAD_in_ruleConstCadena8430); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3935:1: entryRuleNumeroEntero returns [EObject current=null] : iv_ruleNumeroEntero= ruleNumeroEntero EOF ;
    public final EObject entryRuleNumeroEntero() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeroEntero = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3936:2: (iv_ruleNumeroEntero= ruleNumeroEntero EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3937:2: iv_ruleNumeroEntero= ruleNumeroEntero EOF
            {
             newCompositeNode(grammarAccess.getNumeroEnteroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_entryRuleNumeroEntero8470);
            iv_ruleNumeroEntero=ruleNumeroEntero();

            state._fsp--;

             current =iv_ruleNumeroEntero; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumeroEntero8480); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3944:1: ruleNumeroEntero returns [EObject current=null] : ( (lv_valor_0_0= ruleEInt ) ) ;
    public final EObject ruleNumeroEntero() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3947:28: ( ( (lv_valor_0_0= ruleEInt ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3948:1: ( (lv_valor_0_0= ruleEInt ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3948:1: ( (lv_valor_0_0= ruleEInt ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3949:1: (lv_valor_0_0= ruleEInt )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3949:1: (lv_valor_0_0= ruleEInt )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3950:3: lv_valor_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getNumeroEnteroAccess().getValorEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumeroEntero8525);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3974:1: entryRuleNumeroDecimal returns [EObject current=null] : iv_ruleNumeroDecimal= ruleNumeroDecimal EOF ;
    public final EObject entryRuleNumeroDecimal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeroDecimal = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3975:2: (iv_ruleNumeroDecimal= ruleNumeroDecimal EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3976:2: iv_ruleNumeroDecimal= ruleNumeroDecimal EOF
            {
             newCompositeNode(grammarAccess.getNumeroDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_entryRuleNumeroDecimal8560);
            iv_ruleNumeroDecimal=ruleNumeroDecimal();

            state._fsp--;

             current =iv_ruleNumeroDecimal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumeroDecimal8570); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3983:1: ruleNumeroDecimal returns [EObject current=null] : ( (lv_valor_0_0= ruleEFloat ) ) ;
    public final EObject ruleNumeroDecimal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3986:28: ( ( (lv_valor_0_0= ruleEFloat ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3987:1: ( (lv_valor_0_0= ruleEFloat ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3987:1: ( (lv_valor_0_0= ruleEFloat ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3988:1: (lv_valor_0_0= ruleEFloat )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3988:1: (lv_valor_0_0= ruleEFloat )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3989:3: lv_valor_0_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getNumeroDecimalAccess().getValorEFloatParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleNumeroDecimal8615);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4013:1: entryRuleValorBooleano returns [EObject current=null] : iv_ruleValorBooleano= ruleValorBooleano EOF ;
    public final EObject entryRuleValorBooleano() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorBooleano = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4014:2: (iv_ruleValorBooleano= ruleValorBooleano EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4015:2: iv_ruleValorBooleano= ruleValorBooleano EOF
            {
             newCompositeNode(grammarAccess.getValorBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_entryRuleValorBooleano8650);
            iv_ruleValorBooleano=ruleValorBooleano();

            state._fsp--;

             current =iv_ruleValorBooleano; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValorBooleano8660); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4022:1: ruleValorBooleano returns [EObject current=null] : ( (lv_valor_0_0= rulebooleano ) ) ;
    public final EObject ruleValorBooleano() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4025:28: ( ( (lv_valor_0_0= rulebooleano ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4026:1: ( (lv_valor_0_0= rulebooleano ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4026:1: ( (lv_valor_0_0= rulebooleano ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4027:1: (lv_valor_0_0= rulebooleano )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4027:1: (lv_valor_0_0= rulebooleano )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4028:3: lv_valor_0_0= rulebooleano
            {
             
            	        newCompositeNode(grammarAccess.getValorBooleanoAccess().getValorBooleanoParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulebooleano_in_ruleValorBooleano8705);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4052:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4053:2: (iv_ruleEInt= ruleEInt EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4054:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt8741);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt8752); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4061:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4064:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4065:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4065:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4065:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4065:2: (kw= '-' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==71) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4066:2: kw= '-'
                    {
                    kw=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleEInt8791); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt8808); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4086:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4087:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4088:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat8854);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat8865); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4095:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4098:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4099:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4099:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4099:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4099:2: (kw= '-' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==71) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4100:2: kw= '-'
                    {
                    kw=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleEFloat8904); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4105:3: (this_INT_1= RULE_INT )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_INT) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4105:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat8922); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEFloat8942); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat8957); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4125:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=72 && LA70_0<=73)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4125:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4125:2: (kw= 'E' | kw= 'e' )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==72) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==73) ) {
                        alt68=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4126:2: kw= 'E'
                            {
                            kw=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleEFloat8977); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4133:2: kw= 'e'
                            {
                            kw=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleEFloat8996); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4138:2: (kw= '-' )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==71) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4139:2: kw= '-'
                            {
                            kw=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleEFloat9011); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat9028); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4159:1: entryRulebooleano returns [String current=null] : iv_rulebooleano= rulebooleano EOF ;
    public final String entryRulebooleano() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebooleano = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4160:2: (iv_rulebooleano= rulebooleano EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4161:2: iv_rulebooleano= rulebooleano EOF
            {
             newCompositeNode(grammarAccess.getBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleano_in_entryRulebooleano9076);
            iv_rulebooleano=rulebooleano();

            state._fsp--;

             current =iv_rulebooleano.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulebooleano9087); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4168:1: rulebooleano returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'verdadero' | kw= 'falso' ) ;
    public final AntlrDatatypeRuleToken rulebooleano() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4171:28: ( (kw= 'verdadero' | kw= 'falso' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4172:1: (kw= 'verdadero' | kw= 'falso' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4172:1: (kw= 'verdadero' | kw= 'falso' )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==74) ) {
                alt71=1;
            }
            else if ( (LA71_0==75) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4173:2: kw= 'verdadero'
                    {
                    kw=(Token)match(input,74,FollowSets000.FOLLOW_74_in_rulebooleano9125); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanoAccess().getVerdaderoKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4180:2: kw= 'falso'
                    {
                    kw=(Token)match(input,75,FollowSets000.FOLLOW_75_in_rulebooleano9144); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4193:1: entryRuleoperacion returns [EObject current=null] : iv_ruleoperacion= ruleoperacion EOF ;
    public final EObject entryRuleoperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperacion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4194:2: (iv_ruleoperacion= ruleoperacion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4195:2: iv_ruleoperacion= ruleoperacion EOF
            {
             newCompositeNode(grammarAccess.getOperacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_entryRuleoperacion9184);
            iv_ruleoperacion=ruleoperacion();

            state._fsp--;

             current =iv_ruleoperacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperacion9194); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4202:1: ruleoperacion returns [EObject current=null] : (otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')' ) ;
    public final EObject ruleoperacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_op_izq_1_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_op_der_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4205:28: ( (otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4206:1: (otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4206:1: (otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4206:3: otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleoperacion9231); 

                	newLeafNode(otherlv_0, grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4210:1: ( (lv_op_izq_1_0= ruleoperando_izq ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4211:1: (lv_op_izq_1_0= ruleoperando_izq )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4211:1: (lv_op_izq_1_0= ruleoperando_izq )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4212:3: lv_op_izq_1_0= ruleoperando_izq
            {
             
            	        newCompositeNode(grammarAccess.getOperacionAccess().getOp_izqOperando_izqParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperando_izq_in_ruleoperacion9252);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4228:2: ( (lv_signo_op_2_0= rulesigno ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4229:1: (lv_signo_op_2_0= rulesigno )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4229:1: (lv_signo_op_2_0= rulesigno )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4230:3: lv_signo_op_2_0= rulesigno
            {
             
            	        newCompositeNode(grammarAccess.getOperacionAccess().getSigno_opSignoParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulesigno_in_ruleoperacion9273);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4246:2: ( (lv_op_der_3_0= ruleoperando_der ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4247:1: (lv_op_der_3_0= ruleoperando_der )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4247:1: (lv_op_der_3_0= ruleoperando_der )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4248:3: lv_op_der_3_0= ruleoperando_der
            {
             
            	        newCompositeNode(grammarAccess.getOperacionAccess().getOp_derOperando_derParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperando_der_in_ruleoperacion9294);
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

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleoperacion9306); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4276:1: entryRulesigno returns [String current=null] : iv_rulesigno= rulesigno EOF ;
    public final String entryRulesigno() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesigno = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4277:2: (iv_rulesigno= rulesigno EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4278:2: iv_rulesigno= rulesigno EOF
            {
             newCompositeNode(grammarAccess.getSignoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesigno_in_entryRulesigno9343);
            iv_rulesigno=rulesigno();

            state._fsp--;

             current =iv_rulesigno.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesigno9354); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4285:1: rulesigno returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= 'y' | kw= 'o' | kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken rulesigno() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4288:28: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= 'y' | kw= 'o' | kw= '==' | kw= '!=' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4289:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= 'y' | kw= 'o' | kw= '==' | kw= '!=' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4289:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= 'y' | kw= 'o' | kw= '==' | kw= '!=' )
            int alt72=12;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt72=1;
                }
                break;
            case 71:
                {
                alt72=2;
                }
                break;
            case 77:
                {
                alt72=3;
                }
                break;
            case 78:
                {
                alt72=4;
                }
                break;
            case 79:
                {
                alt72=5;
                }
                break;
            case 80:
                {
                alt72=6;
                }
                break;
            case 81:
                {
                alt72=7;
                }
                break;
            case 82:
                {
                alt72=8;
                }
                break;
            case 83:
                {
                alt72=9;
                }
                break;
            case 84:
                {
                alt72=10;
                }
                break;
            case 85:
                {
                alt72=11;
                }
                break;
            case 86:
                {
                alt72=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4290:2: kw= '+'
                    {
                    kw=(Token)match(input,76,FollowSets000.FOLLOW_76_in_rulesigno9392); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4297:2: kw= '-'
                    {
                    kw=(Token)match(input,71,FollowSets000.FOLLOW_71_in_rulesigno9411); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4304:2: kw= '*'
                    {
                    kw=(Token)match(input,77,FollowSets000.FOLLOW_77_in_rulesigno9430); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getAsteriskKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4311:2: kw= '/'
                    {
                    kw=(Token)match(input,78,FollowSets000.FOLLOW_78_in_rulesigno9449); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getSolidusKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4318:2: kw= '<'
                    {
                    kw=(Token)match(input,79,FollowSets000.FOLLOW_79_in_rulesigno9468); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getLessThanSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4325:2: kw= '>'
                    {
                    kw=(Token)match(input,80,FollowSets000.FOLLOW_80_in_rulesigno9487); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getGreaterThanSignKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4332:2: kw= '>='
                    {
                    kw=(Token)match(input,81,FollowSets000.FOLLOW_81_in_rulesigno9506); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4339:2: kw= '<='
                    {
                    kw=(Token)match(input,82,FollowSets000.FOLLOW_82_in_rulesigno9525); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getLessThanSignEqualsSignKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4346:2: kw= 'y'
                    {
                    kw=(Token)match(input,83,FollowSets000.FOLLOW_83_in_rulesigno9544); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getYKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4353:2: kw= 'o'
                    {
                    kw=(Token)match(input,84,FollowSets000.FOLLOW_84_in_rulesigno9563); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getOKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4360:2: kw= '=='
                    {
                    kw=(Token)match(input,85,FollowSets000.FOLLOW_85_in_rulesigno9582); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getEqualsSignEqualsSignKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4367:2: kw= '!='
                    {
                    kw=(Token)match(input,86,FollowSets000.FOLLOW_86_in_rulesigno9601); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4380:1: entryRuleoperando_izq returns [EObject current=null] : iv_ruleoperando_izq= ruleoperando_izq EOF ;
    public final EObject entryRuleoperando_izq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperando_izq = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4381:2: (iv_ruleoperando_izq= ruleoperando_izq EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4382:2: iv_ruleoperando_izq= ruleoperando_izq EOF
            {
             newCompositeNode(grammarAccess.getOperando_izqRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_izq_in_entryRuleoperando_izq9641);
            iv_ruleoperando_izq=ruleoperando_izq();

            state._fsp--;

             current =iv_ruleoperando_izq; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperando_izq9651); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4389:1: ruleoperando_izq returns [EObject current=null] : ( (lv_oper_izq_0_0= rulevalor ) ) ;
    public final EObject ruleoperando_izq() throws RecognitionException {
        EObject current = null;

        EObject lv_oper_izq_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4392:28: ( ( (lv_oper_izq_0_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4393:1: ( (lv_oper_izq_0_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4393:1: ( (lv_oper_izq_0_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4394:1: (lv_oper_izq_0_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4394:1: (lv_oper_izq_0_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4395:3: lv_oper_izq_0_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getOperando_izqAccess().getOper_izqValorParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleoperando_izq9696);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4419:1: entryRuleoperando_der returns [EObject current=null] : iv_ruleoperando_der= ruleoperando_der EOF ;
    public final EObject entryRuleoperando_der() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperando_der = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4420:2: (iv_ruleoperando_der= ruleoperando_der EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4421:2: iv_ruleoperando_der= ruleoperando_der EOF
            {
             newCompositeNode(grammarAccess.getOperando_derRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_der_in_entryRuleoperando_der9731);
            iv_ruleoperando_der=ruleoperando_der();

            state._fsp--;

             current =iv_ruleoperando_der; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperando_der9741); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4428:1: ruleoperando_der returns [EObject current=null] : ( (lv_oper_der_0_0= rulevalor ) ) ;
    public final EObject ruleoperando_der() throws RecognitionException {
        EObject current = null;

        EObject lv_oper_der_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4431:28: ( ( (lv_oper_der_0_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4432:1: ( (lv_oper_der_0_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4432:1: ( (lv_oper_der_0_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4433:1: (lv_oper_der_0_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4433:1: (lv_oper_der_0_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4434:3: lv_oper_der_0_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getOperando_derAccess().getOper_derValorParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleoperando_der9786);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4458:1: entryRuleSino returns [EObject current=null] : iv_ruleSino= ruleSino EOF ;
    public final EObject entryRuleSino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSino = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4459:2: (iv_ruleSino= ruleSino EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4460:2: iv_ruleSino= ruleSino EOF
            {
             newCompositeNode(grammarAccess.getSinoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSino_in_entryRuleSino9821);
            iv_ruleSino=ruleSino();

            state._fsp--;

             current =iv_ruleSino; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSino9831); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4467:1: ruleSino returns [EObject current=null] : ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) ;
    public final EObject ruleSino() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sentencias_2_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_devuelve_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4470:28: ( ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4471:1: ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4471:1: ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4471:2: () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )?
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4471:2: ()
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4472:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSinoAccess().getSinoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleSino9877); 

                	newLeafNode(otherlv_1, grammarAccess.getSinoAccess().getSinoKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4481:1: ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=RULE_STRING && LA74_0<=RULE_ID)||(LA74_0>=50 && LA74_0<=52)||LA74_0==55||LA74_0==58||LA74_0==60||LA74_0==63) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4481:2: ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4481:2: ( (lv_sentencias_2_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4482:1: (lv_sentencias_2_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4482:1: (lv_sentencias_2_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4483:3: lv_sentencias_2_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino9899);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4499:2: ( (lv_sentencias_3_0= ruleSentencias ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( ((LA73_0>=RULE_STRING && LA73_0<=RULE_ID)||(LA73_0>=50 && LA73_0<=52)||LA73_0==55||LA73_0==58||LA73_0==60||LA73_0==63) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4500:1: (lv_sentencias_3_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4500:1: (lv_sentencias_3_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4501:3: lv_sentencias_3_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino9920);
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
                    	    break loop73;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4517:5: ( (lv_devuelve_4_0= ruleDevolver ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==88) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4518:1: (lv_devuelve_4_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4518:1: (lv_devuelve_4_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4519:3: lv_devuelve_4_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getDevuelveDevolverParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSino9944);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4543:1: entryRuleDevolver returns [EObject current=null] : iv_ruleDevolver= ruleDevolver EOF ;
    public final EObject entryRuleDevolver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevolver = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4544:2: (iv_ruleDevolver= ruleDevolver EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4545:2: iv_ruleDevolver= ruleDevolver EOF
            {
             newCompositeNode(grammarAccess.getDevolverRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_entryRuleDevolver9981);
            iv_ruleDevolver=ruleDevolver();

            state._fsp--;

             current =iv_ruleDevolver; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDevolver9991); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4552:1: ruleDevolver returns [EObject current=null] : ( () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')' ) ;
    public final EObject ruleDevolver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_devuelve_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4555:28: ( ( () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4556:1: ( () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4556:1: ( () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4556:2: () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4556:2: ()
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4557:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDevolverAccess().getDevolverAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleDevolver10037); 

                	newLeafNode(otherlv_1, grammarAccess.getDevolverAccess().getDevolverKeyword_1());
                
            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDevolver10049); 

                	newLeafNode(otherlv_2, grammarAccess.getDevolverAccess().getLeftParenthesisKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4570:1: ( (lv_devuelve_3_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4571:1: (lv_devuelve_3_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4571:1: (lv_devuelve_3_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4572:3: lv_devuelve_3_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getDevolverAccess().getDevuelveValorParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleDevolver10070);
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

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDevolver10082); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4600:1: entryRuleinc returns [String current=null] : iv_ruleinc= ruleinc EOF ;
    public final String entryRuleinc() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinc = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4601:2: (iv_ruleinc= ruleinc EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4602:2: iv_ruleinc= ruleinc EOF
            {
             newCompositeNode(grammarAccess.getIncRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_entryRuleinc10119);
            iv_ruleinc=ruleinc();

            state._fsp--;

             current =iv_ruleinc.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleinc10130); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4609:1: ruleinc returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '++' | kw= '--' | kw= 'no' ) ;
    public final AntlrDatatypeRuleToken ruleinc() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4612:28: ( (kw= '++' | kw= '--' | kw= 'no' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4613:1: (kw= '++' | kw= '--' | kw= 'no' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4613:1: (kw= '++' | kw= '--' | kw= 'no' )
            int alt76=3;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt76=1;
                }
                break;
            case 90:
                {
                alt76=2;
                }
                break;
            case 91:
                {
                alt76=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4614:2: kw= '++'
                    {
                    kw=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleinc10168); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIncAccess().getPlusSignPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4621:2: kw= '--'
                    {
                    kw=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleinc10187); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIncAccess().getHyphenMinusHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4628:2: kw= 'no'
                    {
                    kw=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleinc10206); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4641:1: entryRuleParametroFuncion returns [EObject current=null] : iv_ruleParametroFuncion= ruleParametroFuncion EOF ;
    public final EObject entryRuleParametroFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametroFuncion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4642:2: (iv_ruleParametroFuncion= ruleParametroFuncion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4643:2: iv_ruleParametroFuncion= ruleParametroFuncion EOF
            {
             newCompositeNode(grammarAccess.getParametroFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion10246);
            iv_ruleParametroFuncion=ruleParametroFuncion();

            state._fsp--;

             current =iv_ruleParametroFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametroFuncion10256); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4650:1: ruleParametroFuncion returns [EObject current=null] : ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ':' ( (lv_variable_3_0= ruleVariable ) ) ) ;
    public final EObject ruleParametroFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_paso_0_0 = null;

        EObject lv_tipo_1_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4653:28: ( ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ':' ( (lv_variable_3_0= ruleVariable ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4654:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ':' ( (lv_variable_3_0= ruleVariable ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4654:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ':' ( (lv_variable_3_0= ruleVariable ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4654:2: ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ':' ( (lv_variable_3_0= ruleVariable ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4654:2: ( (lv_paso_0_0= ruleTipoPaso ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4655:1: (lv_paso_0_0= ruleTipoPaso )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4655:1: (lv_paso_0_0= ruleTipoPaso )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4656:3: lv_paso_0_0= ruleTipoPaso
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_ruleParametroFuncion10302);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4672:2: ( (lv_tipo_1_0= ruleTipo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4673:1: (lv_tipo_1_0= ruleTipo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4673:1: (lv_tipo_1_0= ruleTipo )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4674:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleParametroFuncion10323);
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

            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleParametroFuncion10335); 

                	newLeafNode(otherlv_2, grammarAccess.getParametroFuncionAccess().getColonKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4694:1: ( (lv_variable_3_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4695:1: (lv_variable_3_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4695:1: (lv_variable_3_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4696:3: lv_variable_3_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleParametroFuncion10356);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4720:1: entryRuleFuncion returns [EObject current=null] : iv_ruleFuncion= ruleFuncion EOF ;
    public final EObject entryRuleFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4721:2: (iv_ruleFuncion= ruleFuncion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4722:2: iv_ruleFuncion= ruleFuncion EOF
            {
             newCompositeNode(grammarAccess.getFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_entryRuleFuncion10392);
            iv_ruleFuncion=ruleFuncion();

            state._fsp--;

             current =iv_ruleFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncion10402); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4729:1: ruleFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4732:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4733:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4733:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4733:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4733:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4734:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4734:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4735:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleFuncion10448);
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

            otherlv_1=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleFuncion10460); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionAccess().getFuncionKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4755:1: ( (lv_nombre_2_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4756:1: (lv_nombre_2_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4756:1: (lv_nombre_2_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4757:3: lv_nombre_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getNombreEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFuncion10481);
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

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFuncion10493); 

                	newLeafNode(otherlv_3, grammarAccess.getFuncionAccess().getLeftParenthesisKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4777:1: ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==72||(LA78_0>=96 && LA78_0<=97)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4777:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4777:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4778:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4778:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4779:3: lv_parametrofuncion_4_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion10515);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4795:2: (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==18) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4795:4: otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFuncion10528); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getFuncionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4799:1: ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4800:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4800:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4801:3: lv_parametrofuncion_6_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion10549);
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

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFuncion10565); 

                	newLeafNode(otherlv_7, grammarAccess.getFuncionAccess().getRightParenthesisKeyword_5());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4821:1: (otherlv_8= 'const' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==14) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4821:3: otherlv_8= 'const'
                    {
                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFuncion10578); 

                        	newLeafNode(otherlv_8, grammarAccess.getFuncionAccess().getConstKeyword_6());
                        

                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4825:3: (otherlv_9= 'tipo' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==15) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4825:5: otherlv_9= 'tipo'
                    {
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFuncion10593); 

                        	newLeafNode(otherlv_9, grammarAccess.getFuncionAccess().getTipoKeyword_7());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleFuncion10607); 

                	newLeafNode(otherlv_10, grammarAccess.getFuncionAccess().getVarKeyword_8());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4833:1: ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=RULE_STRING && LA82_0<=RULE_ID)||(LA82_0>=66 && LA82_0<=70)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4833:2: ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4833:2: ( (lv_declaracion_11_0= ruleDeclaracion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4834:1: (lv_declaracion_11_0= ruleDeclaracion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4834:1: (lv_declaracion_11_0= ruleDeclaracion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4835:3: lv_declaracion_11_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_9_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion10629);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4851:2: ( (lv_declaracion_12_0= ruleDeclaracion ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( ((LA81_0>=RULE_STRING && LA81_0<=RULE_ID)||(LA81_0>=66 && LA81_0<=70)) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4852:1: (lv_declaracion_12_0= ruleDeclaracion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4852:1: (lv_declaracion_12_0= ruleDeclaracion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4853:3: lv_declaracion_12_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion10650);
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

            otherlv_13=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleFuncion10665); 

                	newLeafNode(otherlv_13, grammarAccess.getFuncionAccess().getInicioKeyword_10());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4873:1: ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=RULE_STRING && LA84_0<=RULE_ID)||(LA84_0>=50 && LA84_0<=52)||LA84_0==55||LA84_0==58||LA84_0==60||LA84_0==63) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4873:2: ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4873:2: ( (lv_sentencias_14_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4874:1: (lv_sentencias_14_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4874:1: (lv_sentencias_14_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4875:3: lv_sentencias_14_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_11_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion10687);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4891:2: ( (lv_sentencias_15_0= ruleSentencias ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( ((LA83_0>=RULE_STRING && LA83_0<=RULE_ID)||(LA83_0>=50 && LA83_0<=52)||LA83_0==55||LA83_0==58||LA83_0==60||LA83_0==63) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4892:1: (lv_sentencias_15_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4892:1: (lv_sentencias_15_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4893:3: lv_sentencias_15_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion10708);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4909:5: ( (lv_devuelve_16_0= ruleDevolver ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==88) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4910:1: (lv_devuelve_16_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4910:1: (lv_devuelve_16_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4911:3: lv_devuelve_16_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getDevuelveDevolverParserRuleCall_12_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleFuncion10732);
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

            otherlv_17=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleFuncion10745); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4939:1: entryRuleProcedimiento returns [EObject current=null] : iv_ruleProcedimiento= ruleProcedimiento EOF ;
    public final EObject entryRuleProcedimiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedimiento = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4940:2: (iv_ruleProcedimiento= ruleProcedimiento EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4941:2: iv_ruleProcedimiento= ruleProcedimiento EOF
            {
             newCompositeNode(grammarAccess.getProcedimientoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento10781);
            iv_ruleProcedimiento=ruleProcedimiento();

            state._fsp--;

             current =iv_ruleProcedimiento; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcedimiento10791); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4948:1: ruleProcedimiento returns [EObject current=null] : (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4951:28: ( (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4952:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4952:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4952:3: otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento'
            {
            otherlv_0=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleProcedimiento10828); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedimientoAccess().getProcedimientoKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4956:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4957:1: (lv_nombre_1_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4957:1: (lv_nombre_1_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4958:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProcedimientoAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcedimiento10849);
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

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProcedimiento10861); 

                	newLeafNode(otherlv_2, grammarAccess.getProcedimientoAccess().getLeftParenthesisKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4978:1: ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==72||(LA87_0>=96 && LA87_0<=97)) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4978:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4978:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4979:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4979:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4980:3: lv_parametrofuncion_3_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento10883);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4996:2: (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==18) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4996:4: otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProcedimiento10896); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getProcedimientoAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5000:1: ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5001:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5001:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5002:3: lv_parametrofuncion_5_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento10917);
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
                    	    break loop86;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProcedimiento10933); 

                	newLeafNode(otherlv_6, grammarAccess.getProcedimientoAccess().getRightParenthesisKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5022:1: (otherlv_7= 'const' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==14) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5022:3: otherlv_7= 'const'
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProcedimiento10946); 

                        	newLeafNode(otherlv_7, grammarAccess.getProcedimientoAccess().getConstKeyword_5());
                        

                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5026:3: (otherlv_8= 'tipo' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==15) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5026:5: otherlv_8= 'tipo'
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProcedimiento10961); 

                        	newLeafNode(otherlv_8, grammarAccess.getProcedimientoAccess().getTipoKeyword_6());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleProcedimiento10975); 

                	newLeafNode(otherlv_9, grammarAccess.getProcedimientoAccess().getVarKeyword_7());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5034:1: ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( ((LA91_0>=RULE_STRING && LA91_0<=RULE_ID)||(LA91_0>=66 && LA91_0<=70)) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5034:2: ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5034:2: ( (lv_declaracion_10_0= ruleDeclaracion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5035:1: (lv_declaracion_10_0= ruleDeclaracion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5035:1: (lv_declaracion_10_0= ruleDeclaracion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5036:3: lv_declaracion_10_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_8_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento10997);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5052:2: ( (lv_declaracion_11_0= ruleDeclaracion ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( ((LA90_0>=RULE_STRING && LA90_0<=RULE_ID)||(LA90_0>=66 && LA90_0<=70)) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5053:1: (lv_declaracion_11_0= ruleDeclaracion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5053:1: (lv_declaracion_11_0= ruleDeclaracion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5054:3: lv_declaracion_11_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento11018);
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
                    	    break loop90;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleProcedimiento11033); 

                	newLeafNode(otherlv_12, grammarAccess.getProcedimientoAccess().getInicioKeyword_9());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5074:1: ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( ((LA93_0>=RULE_STRING && LA93_0<=RULE_ID)||(LA93_0>=50 && LA93_0<=52)||LA93_0==55||LA93_0==58||LA93_0==60||LA93_0==63) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5074:2: ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5074:2: ( (lv_sentencias_13_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5075:1: (lv_sentencias_13_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5075:1: (lv_sentencias_13_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5076:3: lv_sentencias_13_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_10_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento11055);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5092:2: ( (lv_sentencias_14_0= ruleSentencias ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( ((LA92_0>=RULE_STRING && LA92_0<=RULE_ID)||(LA92_0>=50 && LA92_0<=52)||LA92_0==55||LA92_0==58||LA92_0==60||LA92_0==63) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5093:1: (lv_sentencias_14_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5093:1: (lv_sentencias_14_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5094:3: lv_sentencias_14_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento11076);
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
                    	    break loop92;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,95,FollowSets000.FOLLOW_95_in_ruleProcedimiento11091); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5122:1: entryRuleTipoPaso returns [String current=null] : iv_ruleTipoPaso= ruleTipoPaso EOF ;
    public final String entryRuleTipoPaso() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoPaso = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5123:2: (iv_ruleTipoPaso= ruleTipoPaso EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5124:2: iv_ruleTipoPaso= ruleTipoPaso EOF
            {
             newCompositeNode(grammarAccess.getTipoPasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso11128);
            iv_ruleTipoPaso=ruleTipoPaso();

            state._fsp--;

             current =iv_ruleTipoPaso.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoPaso11139); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5131:1: ruleTipoPaso returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'E' | kw= 'E/S' | kw= 'S' ) ;
    public final AntlrDatatypeRuleToken ruleTipoPaso() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5134:28: ( (kw= 'E' | kw= 'E/S' | kw= 'S' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5135:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5135:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            int alt94=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt94=1;
                }
                break;
            case 96:
                {
                alt94=2;
                }
                break;
            case 97:
                {
                alt94=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5136:2: kw= 'E'
                    {
                    kw=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleTipoPaso11177); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5143:2: kw= 'E/S'
                    {
                    kw=(Token)match(input,96,FollowSets000.FOLLOW_96_in_ruleTipoPaso11196); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getESKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5150:2: kw= 'S'
                    {
                    kw=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleTipoPaso11215); 

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
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA54 dfa54 = new DFA54(this);
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\1\5\4\uffff\2\41\1\11\2\uffff";
    static final String DFA11_maxS =
        "\1\52\4\uffff\2\41\1\107\2\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\6\1\5";
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
            "\1\10\42\uffff\1\11\32\uffff\1\10",
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
        "\36\uffff";
    static final String DFA13_eofS =
        "\13\uffff\2\22\7\uffff\1\22\1\uffff\2\22\4\uffff\1\22\1\uffff";
    static final String DFA13_minS =
        "\1\5\2\7\5\uffff\1\5\1\uffff\1\5\2\4\1\11\1\36\2\7\1\5\1\uffff\1"+
        "\5\1\4\1\7\2\4\1\11\1\37\2\7\1\4\1\7";
    static final String DFA13_maxS =
        "\1\77\2\133\5\uffff\1\6\1\uffff\1\107\2\137\1\11\3\37\1\11\1\uffff"+
        "\1\107\1\137\1\37\2\137\1\11\3\37\1\137\1\37";
    static final String DFA13_acceptS =
        "\3\uffff\1\3\1\4\1\6\1\2\1\1\1\uffff\1\5\10\uffff\1\7\13\uffff";
    static final String DFA13_specialS =
        "\36\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\2\53\uffff\1\3\1\4\1\5\2\uffff\1\5\2\uffff\1\5\1\uffff"+
            "\1\5\2\uffff\1\5",
            "\1\6\11\uffff\1\7\13\uffff\1\12\2\uffff\1\10\1\6\67\uffff\3"+
            "\11",
            "\1\6\11\uffff\1\7\13\uffff\1\12\2\uffff\1\10\1\6\67\uffff\3"+
            "\11",
            "",
            "",
            "",
            "",
            "",
            "\1\13\1\14",
            "",
            "\1\17\1\20\2\uffff\1\16\75\uffff\1\15",
            "\3\22\1\6\2\22\26\uffff\1\21\1\6\17\uffff\4\22\1\uffff\2\22"+
            "\1\uffff\4\22\1\uffff\4\22\5\uffff\1\22\2\uffff\2\22\13\uffff"+
            "\2\22\4\uffff\1\22\1\uffff\1\22",
            "\3\22\1\6\2\22\26\uffff\1\21\1\6\17\uffff\4\22\1\uffff\2\22"+
            "\1\uffff\4\22\1\uffff\4\22\5\uffff\1\22\2\uffff\2\22\13\uffff"+
            "\2\22\4\uffff\1\22\1\uffff\1\22",
            "\1\16",
            "\1\23\1\24",
            "\1\25\26\uffff\1\23\1\24",
            "\1\25\26\uffff\1\23\1\24",
            "\1\26\1\27\2\uffff\1\22",
            "",
            "\1\32\1\33\2\uffff\1\31\75\uffff\1\30",
            "\3\22\1\6\2\22\26\uffff\1\22\1\6\17\uffff\4\22\1\uffff\2\22"+
            "\1\uffff\4\22\1\uffff\4\22\5\uffff\1\22\2\uffff\2\22\13\uffff"+
            "\2\22\4\uffff\1\22\1\uffff\1\22",
            "\1\25\26\uffff\1\23\1\24",
            "\3\22\1\6\2\22\26\uffff\1\21\1\6\17\uffff\4\22\1\uffff\2\22"+
            "\1\uffff\4\22\1\uffff\4\22\5\uffff\1\22\2\uffff\2\22\13\uffff"+
            "\2\22\4\uffff\1\22\1\uffff\1\22",
            "\3\22\1\6\2\22\26\uffff\1\21\1\6\17\uffff\4\22\1\uffff\2\22"+
            "\1\uffff\4\22\1\uffff\4\22\5\uffff\1\22\2\uffff\2\22\13\uffff"+
            "\2\22\4\uffff\1\22\1\uffff\1\22",
            "\1\31",
            "\1\34",
            "\1\35\27\uffff\1\34",
            "\1\35\27\uffff\1\34",
            "\3\22\1\6\2\22\26\uffff\1\22\1\6\17\uffff\4\22\1\uffff\2\22"+
            "\1\uffff\4\22\1\uffff\4\22\5\uffff\1\22\2\uffff\2\22\13\uffff"+
            "\2\22\4\uffff\1\22\1\uffff\1\22",
            "\1\35\27\uffff\1\34"
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
    static final String DFA18_eotS =
        "\14\uffff";
    static final String DFA18_eofS =
        "\1\uffff\2\12\3\uffff\1\13\5\uffff";
    static final String DFA18_minS =
        "\1\4\2\7\2\uffff\1\11\1\22\5\uffff";
    static final String DFA18_maxS =
        "\1\113\2\53\2\uffff\1\40\1\53\5\uffff";
    static final String DFA18_acceptS =
        "\3\uffff\1\2\1\3\2\uffff\1\5\1\6\1\7\1\1\1\4";
    static final String DFA18_specialS =
        "\14\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\4\1\1\1\2\1\uffff\1\3\1\6\26\uffff\1\7\46\uffff\1\5\2\uffff"+
            "\2\10",
            "\1\12\12\uffff\2\12\11\uffff\1\11\2\uffff\1\11\12\uffff\1\12",
            "\1\12\12\uffff\2\12\11\uffff\1\11\2\uffff\1\11\12\uffff\1\12",
            "",
            "",
            "\1\6\26\uffff\1\7",
            "\2\13\14\uffff\1\7\12\uffff\1\13",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "804:1: (this_VariableID_0= ruleVariableID | this_ConstCadena_1= ruleConstCadena | this_Caracter_2= ruleCaracter | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_ValorBooleano_5= ruleValorBooleano | this_ValorComplejo_6= ruleValorComplejo )";
        }
    }
    static final String DFA19_eotS =
        "\30\uffff";
    static final String DFA19_eofS =
        "\1\uffff\2\13\2\uffff\1\20\15\uffff\1\6\3\uffff\1\6";
    static final String DFA19_minS =
        "\3\4\1\uffff\1\11\1\4\1\uffff\1\4\4\uffff\1\5\2\uffff\1\11\3\uffff"+
        "\1\4\3\11\1\4";
    static final String DFA19_maxS =
        "\1\113\2\137\1\uffff\1\40\1\137\1\uffff\1\133\4\uffff\1\11\2\uffff"+
        "\1\11\3\uffff\1\137\2\107\1\11\1\137";
    static final String DFA19_acceptS =
        "\3\uffff\1\3\2\uffff\1\5\1\uffff\1\7\1\10\1\11\1\2\1\uffff\1\1\1"+
        "\13\1\uffff\1\4\1\12\1\6\5\uffff";
    static final String DFA19_specialS =
        "\30\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\11\1\1\1\2\1\uffff\1\3\1\5\7\uffff\1\7\2\uffff\11\12\3\uffff"+
            "\1\6\46\uffff\1\4\2\uffff\2\10",
            "\6\13\5\uffff\1\13\1\uffff\1\15\2\13\11\uffff\1\16\2\uffff"+
            "\1\14\14\uffff\1\13\1\uffff\1\13\1\uffff\27\13\2\uffff\17\13"+
            "\4\uffff\3\13",
            "\6\13\5\uffff\1\13\1\uffff\1\15\2\13\11\uffff\1\16\2\uffff"+
            "\1\14\14\uffff\1\13\1\uffff\1\13\1\uffff\27\13\2\uffff\17\13"+
            "\4\uffff\3\13",
            "",
            "\1\5\26\uffff\1\6",
            "\3\20\1\uffff\2\20\5\uffff\1\20\2\uffff\2\20\14\uffff\1\17"+
            "\14\uffff\1\20\1\uffff\1\20\1\uffff\27\20\2\uffff\17\20\4\uffff"+
            "\3\20",
            "",
            "\3\22\1\uffff\2\22\7\uffff\1\22\2\uffff\11\22\3\uffff\1\22"+
            "\46\uffff\1\22\2\uffff\2\22\15\uffff\3\21",
            "",
            "",
            "",
            "",
            "\2\16\2\uffff\1\13",
            "",
            "",
            "\1\23",
            "",
            "",
            "",
            "\3\6\1\uffff\2\6\5\uffff\1\6\2\uffff\2\6\14\uffff\1\6\12\uffff"+
            "\1\20\1\uffff\1\6\1\uffff\1\6\1\uffff\27\6\1\24\1\25\17\6\4"+
            "\uffff\3\6",
            "\1\27\75\uffff\1\26",
            "\1\27\75\uffff\1\26",
            "\1\27",
            "\3\6\1\uffff\2\6\5\uffff\1\6\2\uffff\2\6\14\uffff\1\6\12\uffff"+
            "\1\20\1\uffff\1\6\1\uffff\1\6\1\uffff\27\6\2\uffff\17\6\4\uffff"+
            "\3\6"
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
            return "933:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria | this_ValorComplejo_10= ruleValorComplejo )";
        }
    }
    static final String DFA20_eotS =
        "\14\uffff";
    static final String DFA20_eofS =
        "\14\uffff";
    static final String DFA20_minS =
        "\1\5\2\35\1\uffff\1\5\1\11\1\36\2\7\2\uffff\1\7";
    static final String DFA20_maxS =
        "\1\6\2\40\1\uffff\1\107\1\11\3\37\2\uffff\1\37";
    static final String DFA20_acceptS =
        "\3\uffff\1\1\5\uffff\1\2\1\3\1\uffff";
    static final String DFA20_specialS =
        "\14\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\1\2",
            "\1\4\2\uffff\1\3",
            "\1\4\2\uffff\1\3",
            "",
            "\1\7\1\10\2\uffff\1\6\75\uffff\1\5",
            "\1\6",
            "\1\12\1\11",
            "\1\13\26\uffff\1\12\1\11",
            "\1\13\26\uffff\1\12\1\11",
            "",
            "",
            "\1\13\26\uffff\1\12\1\11"
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
            return "1063:1: (this_ValorRegistro_0= ruleValorRegistro | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz )";
        }
    }
    static final String DFA55_eotS =
        "\32\uffff";
    static final String DFA55_eofS =
        "\1\4\13\uffff\2\3\1\uffff\1\3\6\uffff\3\3\1\uffff";
    static final String DFA55_minS =
        "\1\4\2\7\2\uffff\1\7\2\5\1\11\1\36\2\7\2\4\1\5\1\4\1\7\1\5\1\11"+
        "\1\37\2\7\3\4\1\7";
    static final String DFA55_maxS =
        "\1\130\2\133\2\uffff\1\53\1\107\1\6\1\11\3\37\2\130\1\107\1\130"+
        "\1\37\2\11\3\37\3\130\1\37";
    static final String DFA55_acceptS =
        "\3\uffff\1\1\1\2\25\uffff";
    static final String DFA55_specialS =
        "\32\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\4\1\1\1\2\1\uffff\2\4\26\uffff\1\4\21\uffff\3\3\2\uffff\1"+
            "\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\4\6\uffff\1\4\2\uffff"+
            "\2\4\14\uffff\1\4",
            "\1\5\11\uffff\1\3\13\uffff\1\6\2\uffff\1\7\1\3\11\uffff\1\4"+
            "\55\uffff\3\3",
            "\1\5\11\uffff\1\3\13\uffff\1\6\2\uffff\1\7\1\3\11\uffff\1\4"+
            "\55\uffff\3\3",
            "",
            "",
            "\1\5\31\uffff\1\3\11\uffff\1\4",
            "\1\12\1\13\2\uffff\1\11\75\uffff\1\10",
            "\1\14\1\15",
            "\1\11",
            "\1\16\1\17",
            "\1\20\26\uffff\1\16\1\17",
            "\1\20\26\uffff\1\16\1\17",
            "\6\3\26\uffff\1\21\1\3\11\uffff\1\4\6\uffff\3\3\2\uffff\1\3"+
            "\2\uffff\1\3\1\uffff\1\3\2\uffff\2\3\6\uffff\1\3\2\uffff\2\3"+
            "\14\uffff\1\3",
            "\6\3\26\uffff\1\21\1\3\11\uffff\1\4\6\uffff\3\3\2\uffff\1\3"+
            "\2\uffff\1\3\1\uffff\1\3\2\uffff\2\3\6\uffff\1\3\2\uffff\2\3"+
            "\14\uffff\1\3",
            "\1\24\1\25\2\uffff\1\23\75\uffff\1\22",
            "\6\3\26\uffff\2\3\11\uffff\1\4\6\uffff\3\3\2\uffff\1\3\2\uffff"+
            "\1\3\1\uffff\1\3\2\uffff\2\3\6\uffff\1\3\2\uffff\2\3\14\uffff"+
            "\1\3",
            "\1\20\26\uffff\1\16\1\17",
            "\1\26\1\27\2\uffff\1\3",
            "\1\23",
            "\1\30",
            "\1\31\27\uffff\1\30",
            "\1\31\27\uffff\1\30",
            "\6\3\26\uffff\1\21\1\3\11\uffff\1\4\6\uffff\3\3\2\uffff\1\3"+
            "\2\uffff\1\3\1\uffff\1\3\2\uffff\2\3\6\uffff\1\3\2\uffff\2\3"+
            "\14\uffff\1\3",
            "\6\3\26\uffff\1\21\1\3\11\uffff\1\4\6\uffff\3\3\2\uffff\1\3"+
            "\2\uffff\1\3\1\uffff\1\3\2\uffff\2\3\6\uffff\1\3\2\uffff\2\3"+
            "\14\uffff\1\3",
            "\6\3\26\uffff\2\3\11\uffff\1\4\6\uffff\3\3\2\uffff\1\3\2\uffff"+
            "\1\3\1\uffff\1\3\2\uffff\2\3\6\uffff\1\3\2\uffff\2\3\14\uffff"+
            "\1\3",
            "\1\31\27\uffff\1\30"
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "3390:1: ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )?";
        }
    }
    static final String DFA54_eotS =
        "\32\uffff";
    static final String DFA54_eofS =
        "\1\1\13\uffff\2\4\1\uffff\1\4\6\uffff\3\4\1\uffff";
    static final String DFA54_minS =
        "\1\4\1\uffff\2\7\1\uffff\1\5\1\7\1\5\1\11\1\36\2\7\2\4\1\5\1\4\1"+
        "\7\1\5\1\11\1\37\2\7\3\4\1\7";
    static final String DFA54_maxS =
        "\1\130\1\uffff\2\133\1\uffff\1\107\1\53\1\6\1\11\3\37\2\130\1\107"+
        "\1\130\1\37\2\11\3\37\3\130\1\37";
    static final String DFA54_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\25\uffff";
    static final String DFA54_specialS =
        "\32\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\1\1\2\1\3\1\uffff\2\1\26\uffff\1\1\21\uffff\3\4\2\uffff\1"+
            "\4\2\uffff\1\4\1\uffff\1\4\2\uffff\1\4\1\1\6\uffff\1\1\2\uffff"+
            "\2\1\14\uffff\1\1",
            "",
            "\1\6\11\uffff\1\4\13\uffff\1\5\2\uffff\1\7\1\4\11\uffff\1\1"+
            "\55\uffff\3\4",
            "\1\6\11\uffff\1\4\13\uffff\1\5\2\uffff\1\7\1\4\11\uffff\1\1"+
            "\55\uffff\3\4",
            "",
            "\1\12\1\13\2\uffff\1\11\75\uffff\1\10",
            "\1\6\31\uffff\1\4\11\uffff\1\1",
            "\1\14\1\15",
            "\1\11",
            "\1\16\1\17",
            "\1\20\26\uffff\1\16\1\17",
            "\1\20\26\uffff\1\16\1\17",
            "\6\4\26\uffff\1\21\1\4\11\uffff\1\1\6\uffff\3\4\2\uffff\1\4"+
            "\2\uffff\1\4\1\uffff\1\4\2\uffff\2\4\6\uffff\1\4\2\uffff\2\4"+
            "\14\uffff\1\4",
            "\6\4\26\uffff\1\21\1\4\11\uffff\1\1\6\uffff\3\4\2\uffff\1\4"+
            "\2\uffff\1\4\1\uffff\1\4\2\uffff\2\4\6\uffff\1\4\2\uffff\2\4"+
            "\14\uffff\1\4",
            "\1\24\1\25\2\uffff\1\23\75\uffff\1\22",
            "\6\4\26\uffff\2\4\11\uffff\1\1\6\uffff\3\4\2\uffff\1\4\2\uffff"+
            "\1\4\1\uffff\1\4\2\uffff\2\4\6\uffff\1\4\2\uffff\2\4\14\uffff"+
            "\1\4",
            "\1\20\26\uffff\1\16\1\17",
            "\1\26\1\27\2\uffff\1\4",
            "\1\23",
            "\1\30",
            "\1\31\27\uffff\1\30",
            "\1\31\27\uffff\1\30",
            "\6\4\26\uffff\1\21\1\4\11\uffff\1\1\6\uffff\3\4\2\uffff\1\4"+
            "\2\uffff\1\4\1\uffff\1\4\2\uffff\2\4\6\uffff\1\4\2\uffff\2\4"+
            "\14\uffff\1\4",
            "\6\4\26\uffff\1\21\1\4\11\uffff\1\1\6\uffff\3\4\2\uffff\1\4"+
            "\2\uffff\1\4\1\uffff\1\4\2\uffff\2\4\6\uffff\1\4\2\uffff\2\4"+
            "\14\uffff\1\4",
            "\6\4\26\uffff\2\4\11\uffff\1\1\6\uffff\3\4\2\uffff\1\4\2\uffff"+
            "\1\4\1\uffff\1\4\2\uffff\2\4\6\uffff\1\4\2\uffff\2\4\14\uffff"+
            "\1\4",
            "\1\31\27\uffff\1\30"
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "()* loopback of 3408:2: ( (lv_sentencias_3_0= ruleSentencias ) )*";
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
        public static final BitSet FOLLOW_ruleValorComplejo_in_ruleOperador2040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_entryRuleCaracter2075 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCaracter2085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAR_in_ruleCaracter2126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_entryRulevalor2166 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulevalor2176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_rulevalor2223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rulevalor2250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstCadena_in_rulevalor2277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_rulevalor2304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_rulevalor2331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulevalor2358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_rulevalor2385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_rulevalor2412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInternas_in_rulevalor2439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunaria_in_rulevalor2466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorComplejo_in_rulevalor2493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorComplejo_in_entryRuleValorComplejo2528 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValorComplejo2538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorRegistro_in_ruleValorComplejo2585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorVector_in_ruleValorComplejo2612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorMatriz_in_ruleValorComplejo2639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorMatriz_in_entryRuleValorMatriz2674 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValorMatriz2684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleValorMatriz2730 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleValorMatriz2742 = new BitSet(new long[]{0x0000000000000260L,0x0000000000000080L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_ruleValorMatriz2764 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleValorMatriz2791 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleValorMatriz2804 = new BitSet(new long[]{0x0000000000000260L,0x0000000000000080L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_ruleValorMatriz2826 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleValorMatriz2853 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleValorMatriz2866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorRegistro_in_entryRuleValorRegistro2902 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValorRegistro2912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleValorRegistro2958 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleValorRegistro2970 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleValorRegistro2992 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleValorRegistro3005 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleValorRegistro3026 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_ruleValorVector_in_entryRuleValorVector3065 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValorVector3075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleValorVector3121 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleValorVector3133 = new BitSet(new long[]{0x0000000000000260L,0x0000000000000080L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_ruleValorVector3155 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleValorVector3182 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleValorVector3195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_entryRuleCampoRegistro3231 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCampoRegistro3241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCampoRegistro3286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipo_in_entryRuleTipo3321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipo3331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoDefinido_in_ruleTipo3378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoExistente_in_ruleTipo3405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoDefinido_in_entryRuleTipoDefinido3440 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoDefinido3450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTipoDefinido3495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoExistente_in_entryRuleTipoExistente3530 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoExistente3540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleTipoExistente3585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantes_in_entryRuleConstantes3620 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantes3630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleConstantes3676 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleConstantes3688 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleConstantes3709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_entryRuleVector3745 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVector3755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleVector3792 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleVector3804 = new BitSet(new long[]{0x0000000000000260L,0x0000000000000080L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_ruleVector3826 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleVector3853 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleVector3866 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleVector3878 = new BitSet(new long[]{0x0000000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleTipo_in_ruleVector3899 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleVector3911 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVector3932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_entryRuleMatriz3968 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatriz3978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleMatriz4015 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleMatriz4027 = new BitSet(new long[]{0x0000000000000260L,0x0000000000000080L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_ruleMatriz4049 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleMatriz4076 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMatriz4089 = new BitSet(new long[]{0x0000000000000260L,0x0000000000000080L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_ruleMatriz4111 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleMatriz4138 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleMatriz4151 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleMatriz4163 = new BitSet(new long[]{0x0000000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleTipo_in_ruleMatriz4184 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleMatriz4196 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatriz4217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegistro_in_entryRuleRegistro4253 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegistro4263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleRegistro4300 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRegistro4321 = new BitSet(new long[]{0x0000000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleRegistro4343 = new BitSet(new long[]{0x0000020000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleRegistro4364 = new BitSet(new long[]{0x0000020000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_41_in_ruleRegistro4378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchivo_in_entryRuleArchivo4414 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArchivo4424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleArchivo4461 = new BitSet(new long[]{0x0000000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleTipo_in_ruleArchivo4482 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleArchivo4494 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArchivo4515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerado_in_entryRuleEnumerado4551 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerado4561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnumerado4607 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleEnumerado4619 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleEnumerado4631 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleEnumerado4653 = new BitSet(new long[]{0x0000200000040000L});
        public static final BitSet FOLLOW_18_in_ruleEnumerado4666 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleEnumerado4687 = new BitSet(new long[]{0x0000200000040000L});
        public static final BitSet FOLLOW_45_in_ruleEnumerado4702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrango_in_entryRuleSubrango4738 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrango4748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoNumerico_in_ruleSubrango4794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoNumerico_in_entryRuleSubrangoNumerico4828 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrangoNumerico4838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoNumerico4884 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleSubrangoNumerico4896 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000080L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubrangoNumerico4917 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleSubrangoNumerico4929 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000080L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubrangoNumerico4950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInicio_in_entryRuleInicio4986 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInicio4996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleInicio5042 = new BitSet(new long[]{0x0001000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio5064 = new BitSet(new long[]{0x0001000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio5085 = new BitSet(new long[]{0x0001000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_48_in_ruleInicio5100 = new BitSet(new long[]{0x949E000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio5122 = new BitSet(new long[]{0x949E000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio5143 = new BitSet(new long[]{0x949E000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_49_in_ruleInicio5158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString5195 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString5206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString5246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString5272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable5317 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionVariable5327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable5373 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleDeclaracionVariable5385 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable5406 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleDeclaracionVariable5419 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable5440 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia5478 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionPropia5488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDeclaracionPropia5534 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleDeclaracionPropia5546 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia5567 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleDeclaracionPropia5580 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia5601 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_entryRuleLlamadaFuncion5639 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLlamadaFuncion5649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLlamadaFuncion5695 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLlamadaFuncion5707 = new BitSet(new long[]{0x0000000100080370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleLlamadaFuncion5729 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleLlamadaFuncion5742 = new BitSet(new long[]{0x0000000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleLlamadaFuncion5763 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleLlamadaFuncion5779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_entryRuleAsignacion5815 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacion5825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_ruleAsignacion5872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionCompleja_in_ruleAsignacion5899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_entryRuleAsignacionNormal5934 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacionNormal5944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsignacionNormal5990 = new BitSet(new long[]{0x0000000200000080L});
        public static final BitSet FOLLOW_RULE_MAT_in_ruleAsignacionNormal6007 = new BitSet(new long[]{0x0000000200000080L});
        public static final BitSet FOLLOW_33_in_ruleAsignacionNormal6025 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleAsignacionNormal6046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionCompleja_in_entryRuleAsignacionCompleja6082 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacionCompleja6092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorComplejo_in_ruleAsignacionCompleja6138 = new BitSet(new long[]{0x0000000200000080L});
        public static final BitSet FOLLOW_RULE_MAT_in_ruleAsignacionCompleja6155 = new BitSet(new long[]{0x0000000200000080L});
        public static final BitSet FOLLOW_33_in_ruleAsignacionCompleja6173 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleAsignacionCompleja6194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_entryRuleEscribir6230 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEscribir6240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleEscribir6277 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEscribir6289 = new BitSet(new long[]{0x0000000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleEscribir6310 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleEscribir6323 = new BitSet(new long[]{0x0000000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleEscribir6344 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleEscribir6358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_entryRuleLeer6394 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeer6404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleLeer6441 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLeer6453 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleLeer6474 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleLeer6486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_entryRuleSi6522 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSi6532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleSi6569 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleSi6590 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleSi6602 = new BitSet(new long[]{0x94DC000100000370L,0x0000000001800C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi6624 = new BitSet(new long[]{0x94DC000100000370L,0x0000000001800C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi6645 = new BitSet(new long[]{0x94DC000100000370L,0x0000000001800C80L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSi6669 = new BitSet(new long[]{0x0040000000000000L,0x0000000000800000L});
        public static final BitSet FOLLOW_ruleSino_in_ruleSi6691 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleSi6704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_entryRulemientras6740 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemientras6750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rulemientras6787 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_rulemientras6808 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_rulemientras6820 = new BitSet(new long[]{0x969C000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras6842 = new BitSet(new long[]{0x969C000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras6863 = new BitSet(new long[]{0x969C000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_57_in_rulemientras6878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_entryRulerepetir6914 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulerepetir6924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rulerepetir6961 = new BitSet(new long[]{0x9C9C000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir6983 = new BitSet(new long[]{0x9C9C000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir7004 = new BitSet(new long[]{0x9C9C000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_59_in_rulerepetir7019 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_rulerepetir7040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_entryRuledesde7076 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuledesde7086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruledesde7123 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_ruledesde7144 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_61_in_ruledesde7156 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruledesde7177 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruledesde7189 = new BitSet(new long[]{0xD49C000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde7211 = new BitSet(new long[]{0xD49C000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde7232 = new BitSet(new long[]{0xD49C000100000370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_62_in_ruledesde7247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaso_in_entryRuleCaso7283 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCaso7293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleCaso7339 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleCaso7351 = new BitSet(new long[]{0x949C000100000372L,0x0000000001000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso7373 = new BitSet(new long[]{0x949C000100000372L,0x0000000001000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso7394 = new BitSet(new long[]{0x949C000100000372L,0x0000000001000C80L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleCaso7418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_entryRulesegun7455 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesegun7465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rulesegun7502 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulesegun7514 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_rulesegun7535 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulesegun7547 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_rulesegun7559 = new BitSet(new long[]{0x0000000100000370L,0x0000000000000C81L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun7581 = new BitSet(new long[]{0x0000000100000370L,0x0000000000000C81L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun7602 = new BitSet(new long[]{0x0000000100000370L,0x0000000000000C81L});
        public static final BitSet FOLLOW_64_in_rulesegun7617 = new BitSet(new long[]{0x949C000100000370L,0x0000000001000C82L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun7639 = new BitSet(new long[]{0x949C000100000370L,0x0000000001000C82L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun7660 = new BitSet(new long[]{0x949C000100000370L,0x0000000001000C82L});
        public static final BitSet FOLLOW_ruleDevolver_in_rulesegun7684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rulesegun7697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleincremento_in_entryRuleincremento7733 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleincremento7743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleincremento7789 = new BitSet(new long[]{0x0000000000000000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleinc_in_ruleincremento7810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunaria_in_entryRuleunaria7846 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleunaria7856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleunaria7893 = new BitSet(new long[]{0x0000000000000000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleinc_in_ruleunaria7914 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleunaria7935 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleunaria7947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable7984 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoVariable7995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleTipoVariable8033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleTipoVariable8052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleTipoVariable8071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleTipoVariable8090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleTipoVariable8109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable8149 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable8159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable8205 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_RULE_MAT_in_ruleVariable8222 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_ruleVariableID_in_entryRuleVariableID8264 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableID8274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariableID8320 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_RULE_MAT_in_ruleVariableID8337 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_ruleConstCadena_in_entryRuleConstCadena8379 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstCadena8389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAD_in_ruleConstCadena8430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_entryRuleNumeroEntero8470 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumeroEntero8480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumeroEntero8525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_entryRuleNumeroDecimal8560 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumeroDecimal8570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleNumeroDecimal8615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_entryRuleValorBooleano8650 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValorBooleano8660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_ruleValorBooleano8705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt8741 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt8752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleEInt8791 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt8808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat8854 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat8865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleEFloat8904 = new BitSet(new long[]{0x0000000100000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat8922 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleEFloat8942 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat8957 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
        public static final BitSet FOLLOW_72_in_ruleEFloat8977 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000080L});
        public static final BitSet FOLLOW_73_in_ruleEFloat8996 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000080L});
        public static final BitSet FOLLOW_71_in_ruleEFloat9011 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat9028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_entryRulebooleano9076 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulebooleano9087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_rulebooleano9125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_rulebooleano9144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_entryRuleoperacion9184 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperacion9194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleoperacion9231 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleoperando_izq_in_ruleoperacion9252 = new BitSet(new long[]{0x0000000000000000L,0x00000000007FF080L});
        public static final BitSet FOLLOW_rulesigno_in_ruleoperacion9273 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_ruleoperando_der_in_ruleoperacion9294 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleoperacion9306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesigno_in_entryRulesigno9343 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesigno9354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_rulesigno9392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_rulesigno9411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_rulesigno9430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_rulesigno9449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_rulesigno9468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_rulesigno9487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_rulesigno9506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_rulesigno9525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_rulesigno9544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_rulesigno9563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_rulesigno9582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_rulesigno9601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_izq_in_entryRuleoperando_izq9641 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperando_izq9651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_ruleoperando_izq9696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_der_in_entryRuleoperando_der9731 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperando_der9741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_ruleoperando_der9786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSino_in_entryRuleSino9821 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSino9831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleSino9877 = new BitSet(new long[]{0x949C000100000372L,0x0000000001000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino9899 = new BitSet(new long[]{0x949C000100000372L,0x0000000001000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino9920 = new BitSet(new long[]{0x949C000100000372L,0x0000000001000C80L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSino9944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDevolver_in_entryRuleDevolver9981 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDevolver9991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleDevolver10037 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDevolver10049 = new BitSet(new long[]{0x000000011FF20370L,0x0000000000000C80L});
        public static final BitSet FOLLOW_rulevalor_in_ruleDevolver10070 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleDevolver10082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinc_in_entryRuleinc10119 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleinc10130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleinc10168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleinc10187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_ruleinc10206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion10246 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametroFuncion10256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_ruleParametroFuncion10302 = new BitSet(new long[]{0x0000000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleTipo_in_ruleParametroFuncion10323 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleParametroFuncion10335 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleParametroFuncion10356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_entryRuleFuncion10392 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncion10402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleFuncion10448 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
        public static final BitSet FOLLOW_92_in_ruleFuncion10460 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFuncion10481 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFuncion10493 = new BitSet(new long[]{0x0000000000080000L,0x0000000300000100L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion10515 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleFuncion10528 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000100L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion10549 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleFuncion10565 = new BitSet(new long[]{0x000080000000C000L});
        public static final BitSet FOLLOW_14_in_ruleFuncion10578 = new BitSet(new long[]{0x0000800000008000L});
        public static final BitSet FOLLOW_15_in_ruleFuncion10593 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleFuncion10607 = new BitSet(new long[]{0x0001000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion10629 = new BitSet(new long[]{0x0001000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion10650 = new BitSet(new long[]{0x0001000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_48_in_ruleFuncion10665 = new BitSet(new long[]{0x949C000100000370L,0x0000000021000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion10687 = new BitSet(new long[]{0x949C000100000370L,0x0000000021000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion10708 = new BitSet(new long[]{0x949C000100000370L,0x0000000021000C80L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleFuncion10732 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_93_in_ruleFuncion10745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento10781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcedimiento10791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_94_in_ruleProcedimiento10828 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcedimiento10849 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProcedimiento10861 = new BitSet(new long[]{0x0000000000080000L,0x0000000300000100L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento10883 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleProcedimiento10896 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000100L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento10917 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleProcedimiento10933 = new BitSet(new long[]{0x000080000000C000L});
        public static final BitSet FOLLOW_14_in_ruleProcedimiento10946 = new BitSet(new long[]{0x0000800000008000L});
        public static final BitSet FOLLOW_15_in_ruleProcedimiento10961 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleProcedimiento10975 = new BitSet(new long[]{0x0001000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento10997 = new BitSet(new long[]{0x0001000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento11018 = new BitSet(new long[]{0x0001000000000060L,0x000000000000007CL});
        public static final BitSet FOLLOW_48_in_ruleProcedimiento11033 = new BitSet(new long[]{0x949C000100000370L,0x0000000080000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento11055 = new BitSet(new long[]{0x949C000100000370L,0x0000000080000C80L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento11076 = new BitSet(new long[]{0x949C000100000370L,0x0000000080000C80L});
        public static final BitSet FOLLOW_95_in_ruleProcedimiento11091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso11128 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoPaso11139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleTipoPaso11177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_96_in_ruleTipoPaso11196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_97_in_ruleTipoPaso11215 = new BitSet(new long[]{0x0000000000000002L});
    }


}