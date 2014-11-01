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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMENT", "RULE_CAR", "RULE_STRING", "RULE_ID", "RULE_CAD", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'const'", "'tipo'", "'//'", "'('", "','", "')'", "'abrir'", "'cerrar'", "'escritura'", "'lectura'", "'cos'", "'cuadrado'", "'exp'", "'ln'", "'log'", "'sen'", "'sqrt'", "'longitud'", "'concatena'", "'['", "']['", "']'", "'.'", "'='", "'vector '", "'de'", "': '", "'matriz '", "'registro:'", "'fin_registro'", "'archivo de '", "'{'", "'}'", "'..'", "'var'", "'inicio'", "'fin_inicio'", "'escribir'", "'leer'", "'si'", "'entonces'", "'fin_si'", "'mientras'", "'hacer'", "'fin_mientras'", "'repetir'", "'hasta_que'", "'desde'", "'hasta'", "'fin_desde'", "'segun_sea'", "'en_otro_caso:'", "'fin_segun'", "'entero'", "'caracter'", "'real'", "'logico'", "'cadena'", "'-'", "'E'", "'e'", "'verdadero'", "'falso'", "'+'", "'*'", "'/'", "'<'", "'>'", "'>='", "'<='", "'y'", "'o'", "'=='", "'!='", "'sino'", "'devolver'", "'++'", "'--'", "'no'", "'funcion'", "'fin_funcion'", "'procedimiento'", "'fin_procedimiento'", "'E/S'", "'S'"
    };
    public static final int RULE_ID=7;
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
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_STRING=6;
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
    public static final int RULE_CAR=5;
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
    public static final int RULE_COMENT=4;
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

                    if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||LA7_0==38||(LA7_0>=41 && LA7_0<=42)||LA7_0==44) ) {
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

                                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)||LA6_0==38||(LA6_0>=41 && LA6_0<=42)||LA6_0==44) ) {
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

            if ( ((LA10_0>=67 && LA10_0<=71)||LA10_0==95) ) {
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

                        if ( ((LA9_0>=67 && LA9_0<=71)||LA9_0==95) ) {
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:267:1: ruleComentario returns [EObject current=null] : (otherlv_0= '//' ( (lv_mensaje_1_0= RULE_COMENT ) ) ) ;
    public final EObject ruleComentario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mensaje_1_0=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:270:28: ( (otherlv_0= '//' ( (lv_mensaje_1_0= RULE_COMENT ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:271:1: (otherlv_0= '//' ( (lv_mensaje_1_0= RULE_COMENT ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:271:1: (otherlv_0= '//' ( (lv_mensaje_1_0= RULE_COMENT ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:271:3: otherlv_0= '//' ( (lv_mensaje_1_0= RULE_COMENT ) )
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleComentario428); 

                	newLeafNode(otherlv_0, grammarAccess.getComentarioAccess().getSolidusSolidusKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:275:1: ( (lv_mensaje_1_0= RULE_COMENT ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:276:1: (lv_mensaje_1_0= RULE_COMENT )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:276:1: (lv_mensaje_1_0= RULE_COMENT )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:277:3: lv_mensaje_1_0= RULE_COMENT
            {
            lv_mensaje_1_0=(Token)match(input,RULE_COMENT,FollowSets000.FOLLOW_RULE_COMENT_in_ruleComentario445); 

            			newLeafNode(lv_mensaje_1_0, grammarAccess.getComentarioAccess().getMensajeCOMENTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComentarioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"mensaje",
                    		lv_mensaje_1_0, 
                    		"COMENT");
            	    

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
            pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_entryRuleTipoComplejo486);
            iv_ruleTipoComplejo=ruleTipoComplejo();

            state._fsp--;

             current =iv_ruleTipoComplejo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoComplejo496); 

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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVector_in_ruleTipoComplejo543);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_ruleTipoComplejo570);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRegistro_in_ruleTipoComplejo597);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleArchivo_in_ruleTipoComplejo624);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerado_in_ruleTipoComplejo651);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrango_in_ruleTipoComplejo678);
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
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_entryRuleSubproceso713);
            iv_ruleSubproceso=ruleSubproceso();

            state._fsp--;

             current =iv_ruleSubproceso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubproceso723); 

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

            if ( ((LA12_0>=67 && LA12_0<=71)) ) {
                alt12=1;
            }
            else if ( (LA12_0==95) ) {
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_ruleSubproceso770);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_ruleSubproceso797);
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
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_entryRuleSentencias832);
            iv_ruleSentencias=ruleSentencias();

            state._fsp--;

             current =iv_ruleSentencias; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentencias842); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:430:1: ruleSentencias returns [EObject current=null] : (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_Asignacion_1= ruleAsignacion | this_Escribir_2= ruleEscribir | this_Leer_3= ruleLeer | this_incremento_4= ruleincremento | this_Bloque_5= ruleBloque | this_ValorComplejo_6= ruleValorComplejo | this_FuncionFicheroAbrir_7= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_8= ruleFuncionFicheroCerrar ) ;
    public final EObject ruleSentencias() throws RecognitionException {
        EObject current = null;

        EObject this_LlamadaFuncion_0 = null;

        EObject this_Asignacion_1 = null;

        EObject this_Escribir_2 = null;

        EObject this_Leer_3 = null;

        EObject this_incremento_4 = null;

        EObject this_Bloque_5 = null;

        EObject this_ValorComplejo_6 = null;

        EObject this_FuncionFicheroAbrir_7 = null;

        EObject this_FuncionFicheroCerrar_8 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:433:28: ( (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_Asignacion_1= ruleAsignacion | this_Escribir_2= ruleEscribir | this_Leer_3= ruleLeer | this_incremento_4= ruleincremento | this_Bloque_5= ruleBloque | this_ValorComplejo_6= ruleValorComplejo | this_FuncionFicheroAbrir_7= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_8= ruleFuncionFicheroCerrar ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:434:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_Asignacion_1= ruleAsignacion | this_Escribir_2= ruleEscribir | this_Leer_3= ruleLeer | this_incremento_4= ruleincremento | this_Bloque_5= ruleBloque | this_ValorComplejo_6= ruleValorComplejo | this_FuncionFicheroAbrir_7= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_8= ruleFuncionFicheroCerrar )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:434:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_Asignacion_1= ruleAsignacion | this_Escribir_2= ruleEscribir | this_Leer_3= ruleLeer | this_incremento_4= ruleincremento | this_Bloque_5= ruleBloque | this_ValorComplejo_6= ruleValorComplejo | this_FuncionFicheroAbrir_7= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_8= ruleFuncionFicheroCerrar )
            int alt13=9;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:435:5: this_LlamadaFuncion_0= ruleLlamadaFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getLlamadaFuncionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_ruleSentencias889);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_ruleSentencias916);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_ruleSentencias943);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLeer_in_ruleSentencias970);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleincremento_in_ruleSentencias997);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBloque_in_ruleSentencias1024);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorComplejo_in_ruleSentencias1051);
                    this_ValorComplejo_6=ruleValorComplejo();

                    state._fsp--;

                     
                            current = this_ValorComplejo_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:505:5: this_FuncionFicheroAbrir_7= ruleFuncionFicheroAbrir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionFicheroAbrirParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroAbrir_in_ruleSentencias1078);
                    this_FuncionFicheroAbrir_7=ruleFuncionFicheroAbrir();

                    state._fsp--;

                     
                            current = this_FuncionFicheroAbrir_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:5: this_FuncionFicheroCerrar_8= ruleFuncionFicheroCerrar
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionFicheroCerrarParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroCerrar_in_ruleSentencias1105);
                    this_FuncionFicheroCerrar_8=ruleFuncionFicheroCerrar();

                    state._fsp--;

                     
                            current = this_FuncionFicheroCerrar_8; 
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:531:1: entryRuleBloque returns [EObject current=null] : iv_ruleBloque= ruleBloque EOF ;
    public final EObject entryRuleBloque() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBloque = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:532:2: (iv_ruleBloque= ruleBloque EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:533:2: iv_ruleBloque= ruleBloque EOF
            {
             newCompositeNode(grammarAccess.getBloqueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBloque_in_entryRuleBloque1140);
            iv_ruleBloque=ruleBloque();

            state._fsp--;

             current =iv_ruleBloque; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBloque1150); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:540:1: ruleBloque returns [EObject current=null] : (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) ;
    public final EObject ruleBloque() throws RecognitionException {
        EObject current = null;

        EObject this_Si_0 = null;

        EObject this_mientras_1 = null;

        EObject this_repetir_2 = null;

        EObject this_desde_3 = null;

        EObject this_segun_4 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:543:28: ( (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:544:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:544:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt14=1;
                }
                break;
            case 56:
                {
                alt14=2;
                }
                break;
            case 59:
                {
                alt14=3;
                }
                break;
            case 61:
                {
                alt14=4;
                }
                break;
            case 64:
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
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:5: this_Si_0= ruleSi
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSiParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSi_in_ruleBloque1197);
                    this_Si_0=ruleSi();

                    state._fsp--;

                     
                            current = this_Si_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:555:5: this_mientras_1= rulemientras
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getMientrasParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemientras_in_ruleBloque1224);
                    this_mientras_1=rulemientras();

                    state._fsp--;

                     
                            current = this_mientras_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:565:5: this_repetir_2= rulerepetir
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getRepetirParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulerepetir_in_ruleBloque1251);
                    this_repetir_2=rulerepetir();

                    state._fsp--;

                     
                            current = this_repetir_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:575:5: this_desde_3= ruledesde
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getDesdeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruledesde_in_ruleBloque1278);
                    this_desde_3=ruledesde();

                    state._fsp--;

                     
                            current = this_desde_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:585:5: this_segun_4= rulesegun
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSegunParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulesegun_in_ruleBloque1305);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:601:1: entryRuleDeclaracion returns [EObject current=null] : iv_ruleDeclaracion= ruleDeclaracion EOF ;
    public final EObject entryRuleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:602:2: (iv_ruleDeclaracion= ruleDeclaracion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:603:2: iv_ruleDeclaracion= ruleDeclaracion EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_entryRuleDeclaracion1340);
            iv_ruleDeclaracion=ruleDeclaracion();

            state._fsp--;

             current =iv_ruleDeclaracion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracion1350); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:610:1: ruleDeclaracion returns [EObject current=null] : (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) ;
    public final EObject ruleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject this_DeclaracionVariable_0 = null;

        EObject this_DeclaracionPropia_1 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:613:28: ( (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:614:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:614:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=67 && LA15_0<=71)) ) {
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
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:615:5: this_DeclaracionVariable_0= ruleDeclaracionVariable
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionVariableParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_ruleDeclaracion1397);
                    this_DeclaracionVariable_0=ruleDeclaracionVariable();

                    state._fsp--;

                     
                            current = this_DeclaracionVariable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:625:5: this_DeclaracionPropia_1= ruleDeclaracionPropia
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionPropiaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_ruleDeclaracion1424);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:641:1: entryRuleInternas returns [EObject current=null] : iv_ruleInternas= ruleInternas EOF ;
    public final EObject entryRuleInternas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternas = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:642:2: (iv_ruleInternas= ruleInternas EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:643:2: iv_ruleInternas= ruleInternas EOF
            {
             newCompositeNode(grammarAccess.getInternasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInternas_in_entryRuleInternas1459);
            iv_ruleInternas=ruleInternas();

            state._fsp--;

             current =iv_ruleInternas; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInternas1469); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:650:1: ruleInternas returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleNombreInterna ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* ) otherlv_5= ')' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:653:28: ( ( ( (lv_nombre_0_0= ruleNombreInterna ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* ) otherlv_5= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:654:1: ( ( (lv_nombre_0_0= ruleNombreInterna ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* ) otherlv_5= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:654:1: ( ( (lv_nombre_0_0= ruleNombreInterna ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* ) otherlv_5= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:654:2: ( (lv_nombre_0_0= ruleNombreInterna ) ) otherlv_1= '(' ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* ) otherlv_5= ')'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:654:2: ( (lv_nombre_0_0= ruleNombreInterna ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:655:1: (lv_nombre_0_0= ruleNombreInterna )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:655:1: (lv_nombre_0_0= ruleNombreInterna )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:656:3: lv_nombre_0_0= ruleNombreInterna
            {
             
            	        newCompositeNode(grammarAccess.getInternasAccess().getNombreNombreInternaParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_ruleInternas1515);
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

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInternas1527); 

                	newLeafNode(otherlv_1, grammarAccess.getInternasAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:676:1: ( ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:676:2: ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:676:2: ( (lv_operador_2_0= ruleOperador ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:677:1: (lv_operador_2_0= ruleOperador )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:677:1: (lv_operador_2_0= ruleOperador )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:678:3: lv_operador_2_0= ruleOperador
            {
             
            	        newCompositeNode(grammarAccess.getInternasAccess().getOperadorOperadorParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleInternas1549);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:694:2: (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:694:4: otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleInternas1562); 

            	        	newLeafNode(otherlv_3, grammarAccess.getInternasAccess().getCommaKeyword_2_1_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:698:1: ( (lv_operador_4_0= ruleOperador ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:699:1: (lv_operador_4_0= ruleOperador )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:699:1: (lv_operador_4_0= ruleOperador )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:700:3: lv_operador_4_0= ruleOperador
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInternasAccess().getOperadorOperadorParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleInternas1583);
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

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleInternas1598); 

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


    // $ANTLR start "entryRuleFuncionFicheroAbrir"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:728:1: entryRuleFuncionFicheroAbrir returns [EObject current=null] : iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF ;
    public final EObject entryRuleFuncionFicheroAbrir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncionFicheroAbrir = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:729:2: (iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:730:2: iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF
            {
             newCompositeNode(grammarAccess.getFuncionFicheroAbrirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroAbrir_in_entryRuleFuncionFicheroAbrir1634);
            iv_ruleFuncionFicheroAbrir=ruleFuncionFicheroAbrir();

            state._fsp--;

             current =iv_ruleFuncionFicheroAbrir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncionFicheroAbrir1644); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:737:1: ruleFuncionFicheroAbrir returns [EObject current=null] : (otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= ruleOperador ) ) ) otherlv_7= ')' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:740:28: ( (otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= ruleOperador ) ) ) otherlv_7= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:741:1: (otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= ruleOperador ) ) ) otherlv_7= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:741:1: (otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= ruleOperador ) ) ) otherlv_7= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:741:3: otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= ruleOperador ) ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFuncionFicheroAbrir1681); 

                	newLeafNode(otherlv_0, grammarAccess.getFuncionFicheroAbrirAccess().getAbrirKeyword_0());
                
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFuncionFicheroAbrir1693); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionFicheroAbrirAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:749:1: ( ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= ruleOperador ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:749:2: ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= ruleOperador ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:749:2: ( (lv_variable_2_0= ruleVariableID ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:750:1: (lv_variable_2_0= ruleVariableID )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:750:1: (lv_variable_2_0= ruleVariableID )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:751:3: lv_variable_2_0= ruleVariableID
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getVariableVariableIDParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleFuncionFicheroAbrir1715);
            lv_variable_2_0=ruleVariableID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionFicheroAbrirRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"VariableID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFuncionFicheroAbrir1727); 

                	newLeafNode(otherlv_3, grammarAccess.getFuncionFicheroAbrirAccess().getCommaKeyword_2_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:771:1: ( (lv_modo_4_0= ruleModoApertura ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:772:1: (lv_modo_4_0= ruleModoApertura )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:772:1: (lv_modo_4_0= ruleModoApertura )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:773:3: lv_modo_4_0= ruleModoApertura
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getModoModoAperturaParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleModoApertura_in_ruleFuncionFicheroAbrir1748);
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

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFuncionFicheroAbrir1760); 

                	newLeafNode(otherlv_5, grammarAccess.getFuncionFicheroAbrirAccess().getCommaKeyword_2_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:793:1: ( (lv_variable_6_0= ruleOperador ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:794:1: (lv_variable_6_0= ruleOperador )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:794:1: (lv_variable_6_0= ruleOperador )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:795:3: lv_variable_6_0= ruleOperador
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getVariableOperadorParserRuleCall_2_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleFuncionFicheroAbrir1781);
            lv_variable_6_0=ruleOperador();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionFicheroAbrirRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_6_0, 
                    		"Operador");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFuncionFicheroAbrir1794); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:823:1: entryRuleFuncionFicheroCerrar returns [EObject current=null] : iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF ;
    public final EObject entryRuleFuncionFicheroCerrar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncionFicheroCerrar = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:824:2: (iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:825:2: iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF
            {
             newCompositeNode(grammarAccess.getFuncionFicheroCerrarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroCerrar_in_entryRuleFuncionFicheroCerrar1830);
            iv_ruleFuncionFicheroCerrar=ruleFuncionFicheroCerrar();

            state._fsp--;

             current =iv_ruleFuncionFicheroCerrar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncionFicheroCerrar1840); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:832:1: ruleFuncionFicheroCerrar returns [EObject current=null] : (otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')' ) ;
    public final EObject ruleFuncionFicheroCerrar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:835:28: ( (otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:836:1: (otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:836:1: (otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:836:3: otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFuncionFicheroCerrar1877); 

                	newLeafNode(otherlv_0, grammarAccess.getFuncionFicheroCerrarAccess().getCerrarKeyword_0());
                
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFuncionFicheroCerrar1889); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionFicheroCerrarAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:844:1: ( (lv_variable_2_0= ruleVariableID ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:845:1: (lv_variable_2_0= ruleVariableID )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:845:1: (lv_variable_2_0= ruleVariableID )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:846:3: lv_variable_2_0= ruleVariableID
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroCerrarAccess().getVariableVariableIDParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleFuncionFicheroCerrar1910);
            lv_variable_2_0=ruleVariableID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionFicheroCerrarRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"VariableID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFuncionFicheroCerrar1922); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:874:1: entryRuleModoApertura returns [String current=null] : iv_ruleModoApertura= ruleModoApertura EOF ;
    public final String entryRuleModoApertura() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModoApertura = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:875:2: (iv_ruleModoApertura= ruleModoApertura EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:876:2: iv_ruleModoApertura= ruleModoApertura EOF
            {
             newCompositeNode(grammarAccess.getModoAperturaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModoApertura_in_entryRuleModoApertura1959);
            iv_ruleModoApertura=ruleModoApertura();

            state._fsp--;

             current =iv_ruleModoApertura.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModoApertura1970); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:883:1: ruleModoApertura returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'escritura' | kw= 'lectura' ) ;
    public final AntlrDatatypeRuleToken ruleModoApertura() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:886:28: ( (kw= 'escritura' | kw= 'lectura' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:887:1: (kw= 'escritura' | kw= 'lectura' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:887:1: (kw= 'escritura' | kw= 'lectura' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            else if ( (LA17_0==23) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:888:2: kw= 'escritura'
                    {
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleModoApertura2008); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModoAperturaAccess().getEscrituraKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:895:2: kw= 'lectura'
                    {
                    kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleModoApertura2027); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:908:1: entryRuleNombreInterna returns [String current=null] : iv_ruleNombreInterna= ruleNombreInterna EOF ;
    public final String entryRuleNombreInterna() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNombreInterna = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:909:2: (iv_ruleNombreInterna= ruleNombreInterna EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:910:2: iv_ruleNombreInterna= ruleNombreInterna EOF
            {
             newCompositeNode(grammarAccess.getNombreInternaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna2068);
            iv_ruleNombreInterna=ruleNombreInterna();

            state._fsp--;

             current =iv_ruleNombreInterna.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNombreInterna2079); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:917:1: ruleNombreInterna returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' | kw= 'concatena' ) ;
    public final AntlrDatatypeRuleToken ruleNombreInterna() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:920:28: ( (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' | kw= 'concatena' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:921:1: (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' | kw= 'concatena' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:921:1: (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' | kw= 'concatena' )
            int alt18=9;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt18=1;
                }
                break;
            case 25:
                {
                alt18=2;
                }
                break;
            case 26:
                {
                alt18=3;
                }
                break;
            case 27:
                {
                alt18=4;
                }
                break;
            case 28:
                {
                alt18=5;
                }
                break;
            case 29:
                {
                alt18=6;
                }
                break;
            case 30:
                {
                alt18=7;
                }
                break;
            case 31:
                {
                alt18=8;
                }
                break;
            case 32:
                {
                alt18=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:922:2: kw= 'cos'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNombreInterna2117); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCosKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:929:2: kw= 'cuadrado'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNombreInterna2136); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCuadradoKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:936:2: kw= 'exp'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNombreInterna2155); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getExpKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:943:2: kw= 'ln'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleNombreInterna2174); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLnKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:950:2: kw= 'log'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleNombreInterna2193); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLogKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:957:2: kw= 'sen'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleNombreInterna2212); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSenKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:964:2: kw= 'sqrt'
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleNombreInterna2231); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSqrtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:971:2: kw= 'longitud'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleNombreInterna2250); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLongitudKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:978:2: kw= 'concatena'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNombreInterna2269); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:991:1: entryRuleOperador returns [EObject current=null] : iv_ruleOperador= ruleOperador EOF ;
    public final EObject entryRuleOperador() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperador = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:992:2: (iv_ruleOperador= ruleOperador EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:993:2: iv_ruleOperador= ruleOperador EOF
            {
             newCompositeNode(grammarAccess.getOperadorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_entryRuleOperador2309);
            iv_ruleOperador=ruleOperador();

            state._fsp--;

             current =iv_ruleOperador; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperador2319); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1000:1: ruleOperador returns [EObject current=null] : (this_VariableID_0= ruleVariableID | this_ConstCadena_1= ruleConstCadena | this_Caracter_2= ruleCaracter | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_ValorBooleano_5= ruleValorBooleano | this_ValorComplejo_6= ruleValorComplejo ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:28: ( (this_VariableID_0= ruleVariableID | this_ConstCadena_1= ruleConstCadena | this_Caracter_2= ruleCaracter | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_ValorBooleano_5= ruleValorBooleano | this_ValorComplejo_6= ruleValorComplejo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1004:1: (this_VariableID_0= ruleVariableID | this_ConstCadena_1= ruleConstCadena | this_Caracter_2= ruleCaracter | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_ValorBooleano_5= ruleValorBooleano | this_ValorComplejo_6= ruleValorComplejo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1004:1: (this_VariableID_0= ruleVariableID | this_ConstCadena_1= ruleConstCadena | this_Caracter_2= ruleCaracter | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_ValorBooleano_5= ruleValorBooleano | this_ValorComplejo_6= ruleValorComplejo )
            int alt19=7;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1005:5: this_VariableID_0= ruleVariableID
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getVariableIDParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleOperador2366);
                    this_VariableID_0=ruleVariableID();

                    state._fsp--;

                     
                            current = this_VariableID_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1015:5: this_ConstCadena_1= ruleConstCadena
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getConstCadenaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_ruleOperador2393);
                    this_ConstCadena_1=ruleConstCadena();

                    state._fsp--;

                     
                            current = this_ConstCadena_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1025:5: this_Caracter_2= ruleCaracter
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getCaracterParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_ruleOperador2420);
                    this_Caracter_2=ruleCaracter();

                    state._fsp--;

                     
                            current = this_Caracter_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1035:5: this_NumeroEntero_3= ruleNumeroEntero
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getNumeroEnteroParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_ruleOperador2447);
                    this_NumeroEntero_3=ruleNumeroEntero();

                    state._fsp--;

                     
                            current = this_NumeroEntero_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1045:5: this_NumeroDecimal_4= ruleNumeroDecimal
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getNumeroDecimalParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_ruleOperador2474);
                    this_NumeroDecimal_4=ruleNumeroDecimal();

                    state._fsp--;

                     
                            current = this_NumeroDecimal_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1055:5: this_ValorBooleano_5= ruleValorBooleano
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getValorBooleanoParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_ruleOperador2501);
                    this_ValorBooleano_5=ruleValorBooleano();

                    state._fsp--;

                     
                            current = this_ValorBooleano_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:5: this_ValorComplejo_6= ruleValorComplejo
                    {
                     
                            newCompositeNode(grammarAccess.getOperadorAccess().getValorComplejoParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorComplejo_in_ruleOperador2528);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1081:1: entryRuleCaracter returns [EObject current=null] : iv_ruleCaracter= ruleCaracter EOF ;
    public final EObject entryRuleCaracter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaracter = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1082:2: (iv_ruleCaracter= ruleCaracter EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:2: iv_ruleCaracter= ruleCaracter EOF
            {
             newCompositeNode(grammarAccess.getCaracterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_entryRuleCaracter2563);
            iv_ruleCaracter=ruleCaracter();

            state._fsp--;

             current =iv_ruleCaracter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCaracter2573); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1090:1: ruleCaracter returns [EObject current=null] : ( (lv_contenido_0_0= RULE_CAR ) ) ;
    public final EObject ruleCaracter() throws RecognitionException {
        EObject current = null;

        Token lv_contenido_0_0=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1093:28: ( ( (lv_contenido_0_0= RULE_CAR ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1094:1: ( (lv_contenido_0_0= RULE_CAR ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1094:1: ( (lv_contenido_0_0= RULE_CAR ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1095:1: (lv_contenido_0_0= RULE_CAR )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1095:1: (lv_contenido_0_0= RULE_CAR )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1096:3: lv_contenido_0_0= RULE_CAR
            {
            lv_contenido_0_0=(Token)match(input,RULE_CAR,FollowSets000.FOLLOW_RULE_CAR_in_ruleCaracter2614); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1120:1: entryRulevalor returns [EObject current=null] : iv_rulevalor= rulevalor EOF ;
    public final EObject entryRulevalor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalor = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1121:2: (iv_rulevalor= rulevalor EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1122:2: iv_rulevalor= rulevalor EOF
            {
             newCompositeNode(grammarAccess.getValorRule()); 
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_entryRulevalor2654);
            iv_rulevalor=rulevalor();

            state._fsp--;

             current =iv_rulevalor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulevalor2664); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1129:1: rulevalor returns [EObject current=null] : (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria | this_ValorComplejo_10= ruleValorComplejo ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1132:28: ( (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria | this_ValorComplejo_10= ruleValorComplejo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1133:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria | this_ValorComplejo_10= ruleValorComplejo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1133:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria | this_ValorComplejo_10= ruleValorComplejo )
            int alt20=11;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1134:5: this_LlamadaFuncion_0= ruleLlamadaFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getLlamadaFuncionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_rulevalor2711);
                    this_LlamadaFuncion_0=ruleLlamadaFuncion();

                    state._fsp--;

                     
                            current = this_LlamadaFuncion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1144:5: this_VariableID_1= ruleVariableID
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getVariableIDParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rulevalor2738);
                    this_VariableID_1=ruleVariableID();

                    state._fsp--;

                     
                            current = this_VariableID_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1154:5: this_ConstCadena_2= ruleConstCadena
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getConstCadenaParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_rulevalor2765);
                    this_ConstCadena_2=ruleConstCadena();

                    state._fsp--;

                     
                            current = this_ConstCadena_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1164:5: this_NumeroEntero_3= ruleNumeroEntero
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getNumeroEnteroParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_rulevalor2792);
                    this_NumeroEntero_3=ruleNumeroEntero();

                    state._fsp--;

                     
                            current = this_NumeroEntero_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1174:5: this_NumeroDecimal_4= ruleNumeroDecimal
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getNumeroDecimalParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_rulevalor2819);
                    this_NumeroDecimal_4=ruleNumeroDecimal();

                    state._fsp--;

                     
                            current = this_NumeroDecimal_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1184:5: this_operacion_5= ruleoperacion
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getOperacionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulevalor2846);
                    this_operacion_5=ruleoperacion();

                    state._fsp--;

                     
                            current = this_operacion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1194:5: this_ValorBooleano_6= ruleValorBooleano
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getValorBooleanoParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_rulevalor2873);
                    this_ValorBooleano_6=ruleValorBooleano();

                    state._fsp--;

                     
                            current = this_ValorBooleano_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1204:5: this_Caracter_7= ruleCaracter
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getCaracterParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCaracter_in_rulevalor2900);
                    this_Caracter_7=ruleCaracter();

                    state._fsp--;

                     
                            current = this_Caracter_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1214:5: this_Internas_8= ruleInternas
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getInternasParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInternas_in_rulevalor2927);
                    this_Internas_8=ruleInternas();

                    state._fsp--;

                     
                            current = this_Internas_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1224:5: this_unaria_9= ruleunaria
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getUnariaParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleunaria_in_rulevalor2954);
                    this_unaria_9=ruleunaria();

                    state._fsp--;

                     
                            current = this_unaria_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1234:5: this_ValorComplejo_10= ruleValorComplejo
                    {
                     
                            newCompositeNode(grammarAccess.getValorAccess().getValorComplejoParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorComplejo_in_rulevalor2981);
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


    // $ANTLR start "entryRulevaloresLeer"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1250:1: entryRulevaloresLeer returns [EObject current=null] : iv_rulevaloresLeer= rulevaloresLeer EOF ;
    public final EObject entryRulevaloresLeer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevaloresLeer = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1251:2: (iv_rulevaloresLeer= rulevaloresLeer EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1252:2: iv_rulevaloresLeer= rulevaloresLeer EOF
            {
             newCompositeNode(grammarAccess.getValoresLeerRule()); 
            pushFollow(FollowSets000.FOLLOW_rulevaloresLeer_in_entryRulevaloresLeer3016);
            iv_rulevaloresLeer=rulevaloresLeer();

            state._fsp--;

             current =iv_rulevaloresLeer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulevaloresLeer3026); 

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
    // $ANTLR end "entryRulevaloresLeer"


    // $ANTLR start "rulevaloresLeer"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1259:1: rulevaloresLeer returns [EObject current=null] : (this_VariableID_0= ruleVariableID | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz | this_ValorRegistro_3= ruleValorRegistro ) ;
    public final EObject rulevaloresLeer() throws RecognitionException {
        EObject current = null;

        EObject this_VariableID_0 = null;

        EObject this_ValorVector_1 = null;

        EObject this_ValorMatriz_2 = null;

        EObject this_ValorRegistro_3 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1262:28: ( (this_VariableID_0= ruleVariableID | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz | this_ValorRegistro_3= ruleValorRegistro ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1263:1: (this_VariableID_0= ruleVariableID | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz | this_ValorRegistro_3= ruleValorRegistro )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1263:1: (this_VariableID_0= ruleVariableID | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz | this_ValorRegistro_3= ruleValorRegistro )
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1264:5: this_VariableID_0= ruleVariableID
                    {
                     
                            newCompositeNode(grammarAccess.getValoresLeerAccess().getVariableIDParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rulevaloresLeer3073);
                    this_VariableID_0=ruleVariableID();

                    state._fsp--;

                     
                            current = this_VariableID_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1274:5: this_ValorVector_1= ruleValorVector
                    {
                     
                            newCompositeNode(grammarAccess.getValoresLeerAccess().getValorVectorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorVector_in_rulevaloresLeer3100);
                    this_ValorVector_1=ruleValorVector();

                    state._fsp--;

                     
                            current = this_ValorVector_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1284:5: this_ValorMatriz_2= ruleValorMatriz
                    {
                     
                            newCompositeNode(grammarAccess.getValoresLeerAccess().getValorMatrizParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorMatriz_in_rulevaloresLeer3127);
                    this_ValorMatriz_2=ruleValorMatriz();

                    state._fsp--;

                     
                            current = this_ValorMatriz_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1294:5: this_ValorRegistro_3= ruleValorRegistro
                    {
                     
                            newCompositeNode(grammarAccess.getValoresLeerAccess().getValorRegistroParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorRegistro_in_rulevaloresLeer3154);
                    this_ValorRegistro_3=ruleValorRegistro();

                    state._fsp--;

                     
                            current = this_ValorRegistro_3; 
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
    // $ANTLR end "rulevaloresLeer"


    // $ANTLR start "entryRuleValorComplejo"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1310:1: entryRuleValorComplejo returns [EObject current=null] : iv_ruleValorComplejo= ruleValorComplejo EOF ;
    public final EObject entryRuleValorComplejo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorComplejo = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1311:2: (iv_ruleValorComplejo= ruleValorComplejo EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1312:2: iv_ruleValorComplejo= ruleValorComplejo EOF
            {
             newCompositeNode(grammarAccess.getValorComplejoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValorComplejo_in_entryRuleValorComplejo3189);
            iv_ruleValorComplejo=ruleValorComplejo();

            state._fsp--;

             current =iv_ruleValorComplejo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValorComplejo3199); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1319:1: ruleValorComplejo returns [EObject current=null] : (this_ValorRegistro_0= ruleValorRegistro | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz ) ;
    public final EObject ruleValorComplejo() throws RecognitionException {
        EObject current = null;

        EObject this_ValorRegistro_0 = null;

        EObject this_ValorVector_1 = null;

        EObject this_ValorMatriz_2 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1322:28: ( (this_ValorRegistro_0= ruleValorRegistro | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1323:1: (this_ValorRegistro_0= ruleValorRegistro | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1323:1: (this_ValorRegistro_0= ruleValorRegistro | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz )
            int alt22=3;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1324:5: this_ValorRegistro_0= ruleValorRegistro
                    {
                     
                            newCompositeNode(grammarAccess.getValorComplejoAccess().getValorRegistroParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorRegistro_in_ruleValorComplejo3246);
                    this_ValorRegistro_0=ruleValorRegistro();

                    state._fsp--;

                     
                            current = this_ValorRegistro_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1334:5: this_ValorVector_1= ruleValorVector
                    {
                     
                            newCompositeNode(grammarAccess.getValorComplejoAccess().getValorVectorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorVector_in_ruleValorComplejo3273);
                    this_ValorVector_1=ruleValorVector();

                    state._fsp--;

                     
                            current = this_ValorVector_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1344:5: this_ValorMatriz_2= ruleValorMatriz
                    {
                     
                            newCompositeNode(grammarAccess.getValorComplejoAccess().getValorMatrizParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValorMatriz_in_ruleValorComplejo3300);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1360:1: entryRuleValorMatriz returns [EObject current=null] : iv_ruleValorMatriz= ruleValorMatriz EOF ;
    public final EObject entryRuleValorMatriz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorMatriz = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1361:2: (iv_ruleValorMatriz= ruleValorMatriz EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1362:2: iv_ruleValorMatriz= ruleValorMatriz EOF
            {
             newCompositeNode(grammarAccess.getValorMatrizRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValorMatriz_in_entryRuleValorMatriz3335);
            iv_ruleValorMatriz=ruleValorMatriz();

            state._fsp--;

             current =iv_ruleValorMatriz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValorMatriz3345); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1369:1: ruleValorMatriz returns [EObject current=null] : ( ( ( (lv_nombre_matriz_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indices_2_0= ruleNumeroEntero ) ) | ( (lv_indices_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_indices_5_0= ruleNumeroEntero ) ) | ( (lv_indices_6_0= ruleVariableID ) ) ) otherlv_7= ']' ) (otherlv_8= '.' ( (lv_campo_9_0= ruleCampoRegistro ) ) )? ) ;
    public final EObject ruleValorMatriz() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_nombre_matriz_0_0 = null;

        EObject lv_indices_2_0 = null;

        EObject lv_indices_3_0 = null;

        EObject lv_indices_5_0 = null;

        EObject lv_indices_6_0 = null;

        EObject lv_campo_9_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1372:28: ( ( ( ( (lv_nombre_matriz_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indices_2_0= ruleNumeroEntero ) ) | ( (lv_indices_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_indices_5_0= ruleNumeroEntero ) ) | ( (lv_indices_6_0= ruleVariableID ) ) ) otherlv_7= ']' ) (otherlv_8= '.' ( (lv_campo_9_0= ruleCampoRegistro ) ) )? ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:1: ( ( ( (lv_nombre_matriz_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indices_2_0= ruleNumeroEntero ) ) | ( (lv_indices_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_indices_5_0= ruleNumeroEntero ) ) | ( (lv_indices_6_0= ruleVariableID ) ) ) otherlv_7= ']' ) (otherlv_8= '.' ( (lv_campo_9_0= ruleCampoRegistro ) ) )? )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:1: ( ( ( (lv_nombre_matriz_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indices_2_0= ruleNumeroEntero ) ) | ( (lv_indices_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_indices_5_0= ruleNumeroEntero ) ) | ( (lv_indices_6_0= ruleVariableID ) ) ) otherlv_7= ']' ) (otherlv_8= '.' ( (lv_campo_9_0= ruleCampoRegistro ) ) )? )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:2: ( ( (lv_nombre_matriz_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indices_2_0= ruleNumeroEntero ) ) | ( (lv_indices_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_indices_5_0= ruleNumeroEntero ) ) | ( (lv_indices_6_0= ruleVariableID ) ) ) otherlv_7= ']' ) (otherlv_8= '.' ( (lv_campo_9_0= ruleCampoRegistro ) ) )?
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:2: ( ( (lv_nombre_matriz_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indices_2_0= ruleNumeroEntero ) ) | ( (lv_indices_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_indices_5_0= ruleNumeroEntero ) ) | ( (lv_indices_6_0= ruleVariableID ) ) ) otherlv_7= ']' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:3: ( (lv_nombre_matriz_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indices_2_0= ruleNumeroEntero ) ) | ( (lv_indices_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_indices_5_0= ruleNumeroEntero ) ) | ( (lv_indices_6_0= ruleVariableID ) ) ) otherlv_7= ']'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:3: ( (lv_nombre_matriz_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1374:1: (lv_nombre_matriz_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1374:1: (lv_nombre_matriz_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1375:3: lv_nombre_matriz_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getValorMatrizAccess().getNombre_matrizEStringParserRuleCall_0_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleValorMatriz3392);
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

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleValorMatriz3404); 

                	newLeafNode(otherlv_1, grammarAccess.getValorMatrizAccess().getLeftSquareBracketKeyword_0_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1395:1: ( ( (lv_indices_2_0= ruleNumeroEntero ) ) | ( (lv_indices_3_0= ruleVariableID ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT||LA23_0==72) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1395:2: ( (lv_indices_2_0= ruleNumeroEntero ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1395:2: ( (lv_indices_2_0= ruleNumeroEntero ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1396:1: (lv_indices_2_0= ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1396:1: (lv_indices_2_0= ruleNumeroEntero )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1397:3: lv_indices_2_0= ruleNumeroEntero
                    {
                     
                    	        newCompositeNode(grammarAccess.getValorMatrizAccess().getIndicesNumeroEnteroParserRuleCall_0_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_ruleValorMatriz3426);
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
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1414:6: ( (lv_indices_3_0= ruleVariableID ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1414:6: ( (lv_indices_3_0= ruleVariableID ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1415:1: (lv_indices_3_0= ruleVariableID )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1415:1: (lv_indices_3_0= ruleVariableID )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1416:3: lv_indices_3_0= ruleVariableID
                    {
                     
                    	        newCompositeNode(grammarAccess.getValorMatrizAccess().getIndicesVariableIDParserRuleCall_0_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleValorMatriz3453);
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

            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleValorMatriz3466); 

                	newLeafNode(otherlv_4, grammarAccess.getValorMatrizAccess().getRightSquareBracketLeftSquareBracketKeyword_0_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1436:1: ( ( (lv_indices_5_0= ruleNumeroEntero ) ) | ( (lv_indices_6_0= ruleVariableID ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT||LA24_0==72) ) {
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
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1436:2: ( (lv_indices_5_0= ruleNumeroEntero ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1436:2: ( (lv_indices_5_0= ruleNumeroEntero ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1437:1: (lv_indices_5_0= ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1437:1: (lv_indices_5_0= ruleNumeroEntero )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1438:3: lv_indices_5_0= ruleNumeroEntero
                    {
                     
                    	        newCompositeNode(grammarAccess.getValorMatrizAccess().getIndicesNumeroEnteroParserRuleCall_0_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_ruleValorMatriz3488);
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
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1455:6: ( (lv_indices_6_0= ruleVariableID ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1455:6: ( (lv_indices_6_0= ruleVariableID ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1456:1: (lv_indices_6_0= ruleVariableID )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1456:1: (lv_indices_6_0= ruleVariableID )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1457:3: lv_indices_6_0= ruleVariableID
                    {
                     
                    	        newCompositeNode(grammarAccess.getValorMatrizAccess().getIndicesVariableIDParserRuleCall_0_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleValorMatriz3515);
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

            otherlv_7=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleValorMatriz3528); 

                	newLeafNode(otherlv_7, grammarAccess.getValorMatrizAccess().getRightSquareBracketKeyword_0_5());
                

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1477:2: (otherlv_8= '.' ( (lv_campo_9_0= ruleCampoRegistro ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                int LA25_1 = input.LA(2);

                if ( ((LA25_1>=RULE_STRING && LA25_1<=RULE_ID)) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1477:4: otherlv_8= '.' ( (lv_campo_9_0= ruleCampoRegistro ) )
                    {
                    otherlv_8=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleValorMatriz3542); 

                        	newLeafNode(otherlv_8, grammarAccess.getValorMatrizAccess().getFullStopKeyword_1_0());
                        
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1481:1: ( (lv_campo_9_0= ruleCampoRegistro ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1482:1: (lv_campo_9_0= ruleCampoRegistro )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1482:1: (lv_campo_9_0= ruleCampoRegistro )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1483:3: lv_campo_9_0= ruleCampoRegistro
                    {
                     
                    	        newCompositeNode(grammarAccess.getValorMatrizAccess().getCampoCampoRegistroParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleValorMatriz3563);
                    lv_campo_9_0=ruleCampoRegistro();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValorMatrizRule());
                    	        }
                           		add(
                           			current, 
                           			"campo",
                            		lv_campo_9_0, 
                            		"CampoRegistro");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleValorMatriz"


    // $ANTLR start "entryRuleValorRegistro"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1507:1: entryRuleValorRegistro returns [EObject current=null] : iv_ruleValorRegistro= ruleValorRegistro EOF ;
    public final EObject entryRuleValorRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorRegistro = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1508:2: (iv_ruleValorRegistro= ruleValorRegistro EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1509:2: iv_ruleValorRegistro= ruleValorRegistro EOF
            {
             newCompositeNode(grammarAccess.getValorRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValorRegistro_in_entryRuleValorRegistro3601);
            iv_ruleValorRegistro=ruleValorRegistro();

            state._fsp--;

             current =iv_ruleValorRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValorRegistro3611); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1516:1: ruleValorRegistro returns [EObject current=null] : ( ( (lv_nombre_registro_0_0= ruleEString ) ) otherlv_1= '.' ( ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )* ) ) ;
    public final EObject ruleValorRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_registro_0_0 = null;

        EObject lv_campo_2_0 = null;

        EObject lv_campo_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1519:28: ( ( ( (lv_nombre_registro_0_0= ruleEString ) ) otherlv_1= '.' ( ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )* ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1520:1: ( ( (lv_nombre_registro_0_0= ruleEString ) ) otherlv_1= '.' ( ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )* ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1520:1: ( ( (lv_nombre_registro_0_0= ruleEString ) ) otherlv_1= '.' ( ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1520:2: ( (lv_nombre_registro_0_0= ruleEString ) ) otherlv_1= '.' ( ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1520:2: ( (lv_nombre_registro_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1521:1: (lv_nombre_registro_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1521:1: (lv_nombre_registro_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1522:3: lv_nombre_registro_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getValorRegistroAccess().getNombre_registroEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleValorRegistro3657);
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

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleValorRegistro3669); 

                	newLeafNode(otherlv_1, grammarAccess.getValorRegistroAccess().getFullStopKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1542:1: ( ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1542:2: ( (lv_campo_2_0= ruleCampoRegistro ) ) (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1542:2: ( (lv_campo_2_0= ruleCampoRegistro ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1543:1: (lv_campo_2_0= ruleCampoRegistro )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1543:1: (lv_campo_2_0= ruleCampoRegistro )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1544:3: lv_campo_2_0= ruleCampoRegistro
            {
             
            	        newCompositeNode(grammarAccess.getValorRegistroAccess().getCampoCampoRegistroParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleValorRegistro3691);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1560:2: (otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==36) ) {
                    int LA26_2 = input.LA(2);

                    if ( ((LA26_2>=RULE_STRING && LA26_2<=RULE_ID)) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1560:4: otherlv_3= '.' ( (lv_campo_4_0= ruleCampoRegistro ) )
            	    {
            	    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleValorRegistro3704); 

            	        	newLeafNode(otherlv_3, grammarAccess.getValorRegistroAccess().getFullStopKeyword_2_1_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1564:1: ( (lv_campo_4_0= ruleCampoRegistro ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1565:1: (lv_campo_4_0= ruleCampoRegistro )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1565:1: (lv_campo_4_0= ruleCampoRegistro )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1566:3: lv_campo_4_0= ruleCampoRegistro
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValorRegistroAccess().getCampoCampoRegistroParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleValorRegistro3725);
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
            	    break loop26;
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1590:1: entryRuleValorVector returns [EObject current=null] : iv_ruleValorVector= ruleValorVector EOF ;
    public final EObject entryRuleValorVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorVector = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1591:2: (iv_ruleValorVector= ruleValorVector EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1592:2: iv_ruleValorVector= ruleValorVector EOF
            {
             newCompositeNode(grammarAccess.getValorVectorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValorVector_in_entryRuleValorVector3764);
            iv_ruleValorVector=ruleValorVector();

            state._fsp--;

             current =iv_ruleValorVector; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValorVector3774); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1599:1: ruleValorVector returns [EObject current=null] : ( ( ( (lv_nombre_vector_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indice_2_0= ruleNumeroEntero ) ) | ( (lv_indice_3_0= ruleVariableID ) ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) ;
    public final EObject ruleValorVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_nombre_vector_0_0 = null;

        EObject lv_indice_2_0 = null;

        EObject lv_indice_3_0 = null;

        EObject lv_campo_6_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1602:28: ( ( ( ( (lv_nombre_vector_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indice_2_0= ruleNumeroEntero ) ) | ( (lv_indice_3_0= ruleVariableID ) ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1603:1: ( ( ( (lv_nombre_vector_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indice_2_0= ruleNumeroEntero ) ) | ( (lv_indice_3_0= ruleVariableID ) ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1603:1: ( ( ( (lv_nombre_vector_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indice_2_0= ruleNumeroEntero ) ) | ( (lv_indice_3_0= ruleVariableID ) ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1603:2: ( ( (lv_nombre_vector_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indice_2_0= ruleNumeroEntero ) ) | ( (lv_indice_3_0= ruleVariableID ) ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )?
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1603:2: ( ( (lv_nombre_vector_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indice_2_0= ruleNumeroEntero ) ) | ( (lv_indice_3_0= ruleVariableID ) ) ) otherlv_4= ']' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1603:3: ( (lv_nombre_vector_0_0= ruleEString ) ) otherlv_1= '[' ( ( (lv_indice_2_0= ruleNumeroEntero ) ) | ( (lv_indice_3_0= ruleVariableID ) ) ) otherlv_4= ']'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1603:3: ( (lv_nombre_vector_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1604:1: (lv_nombre_vector_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1604:1: (lv_nombre_vector_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1605:3: lv_nombre_vector_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getValorVectorAccess().getNombre_vectorEStringParserRuleCall_0_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleValorVector3821);
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

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleValorVector3833); 

                	newLeafNode(otherlv_1, grammarAccess.getValorVectorAccess().getLeftSquareBracketKeyword_0_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1625:1: ( ( (lv_indice_2_0= ruleNumeroEntero ) ) | ( (lv_indice_3_0= ruleVariableID ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT||LA27_0==72) ) {
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
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1625:2: ( (lv_indice_2_0= ruleNumeroEntero ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1625:2: ( (lv_indice_2_0= ruleNumeroEntero ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1626:1: (lv_indice_2_0= ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1626:1: (lv_indice_2_0= ruleNumeroEntero )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1627:3: lv_indice_2_0= ruleNumeroEntero
                    {
                     
                    	        newCompositeNode(grammarAccess.getValorVectorAccess().getIndiceNumeroEnteroParserRuleCall_0_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_ruleValorVector3855);
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
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1644:6: ( (lv_indice_3_0= ruleVariableID ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1644:6: ( (lv_indice_3_0= ruleVariableID ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1645:1: (lv_indice_3_0= ruleVariableID )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1645:1: (lv_indice_3_0= ruleVariableID )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1646:3: lv_indice_3_0= ruleVariableID
                    {
                     
                    	        newCompositeNode(grammarAccess.getValorVectorAccess().getIndiceVariableIDParserRuleCall_0_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleValorVector3882);
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

            otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleValorVector3895); 

                	newLeafNode(otherlv_4, grammarAccess.getValorVectorAccess().getRightSquareBracketKeyword_0_3());
                

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1666:2: (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                int LA28_1 = input.LA(2);

                if ( ((LA28_1>=RULE_STRING && LA28_1<=RULE_ID)) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1666:4: otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) )
                    {
                    otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleValorVector3909); 

                        	newLeafNode(otherlv_5, grammarAccess.getValorVectorAccess().getFullStopKeyword_1_0());
                        
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1670:1: ( (lv_campo_6_0= ruleCampoRegistro ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1671:1: (lv_campo_6_0= ruleCampoRegistro )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1671:1: (lv_campo_6_0= ruleCampoRegistro )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1672:3: lv_campo_6_0= ruleCampoRegistro
                    {
                     
                    	        newCompositeNode(grammarAccess.getValorVectorAccess().getCampoCampoRegistroParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleValorVector3930);
                    lv_campo_6_0=ruleCampoRegistro();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValorVectorRule());
                    	        }
                           		add(
                           			current, 
                           			"campo",
                            		lv_campo_6_0, 
                            		"CampoRegistro");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleValorVector"


    // $ANTLR start "entryRuleCampoRegistro"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1696:1: entryRuleCampoRegistro returns [EObject current=null] : iv_ruleCampoRegistro= ruleCampoRegistro EOF ;
    public final EObject entryRuleCampoRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCampoRegistro = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1697:2: (iv_ruleCampoRegistro= ruleCampoRegistro EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1698:2: iv_ruleCampoRegistro= ruleCampoRegistro EOF
            {
             newCompositeNode(grammarAccess.getCampoRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_entryRuleCampoRegistro3968);
            iv_ruleCampoRegistro=ruleCampoRegistro();

            state._fsp--;

             current =iv_ruleCampoRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCampoRegistro3978); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1705:1: ruleCampoRegistro returns [EObject current=null] : ( (lv_nombre_campo_0_0= ruleEString ) ) ;
    public final EObject ruleCampoRegistro() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_campo_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1708:28: ( ( (lv_nombre_campo_0_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1709:1: ( (lv_nombre_campo_0_0= ruleEString ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1709:1: ( (lv_nombre_campo_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1710:1: (lv_nombre_campo_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1710:1: (lv_nombre_campo_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1711:3: lv_nombre_campo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getNombre_campoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCampoRegistro4023);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1735:1: entryRuleTipo returns [EObject current=null] : iv_ruleTipo= ruleTipo EOF ;
    public final EObject entryRuleTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipo = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1736:2: (iv_ruleTipo= ruleTipo EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1737:2: iv_ruleTipo= ruleTipo EOF
            {
             newCompositeNode(grammarAccess.getTipoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_entryRuleTipo4058);
            iv_ruleTipo=ruleTipo();

            state._fsp--;

             current =iv_ruleTipo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipo4068); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1744:1: ruleTipo returns [EObject current=null] : (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) ;
    public final EObject ruleTipo() throws RecognitionException {
        EObject current = null;

        EObject this_TipoDefinido_0 = null;

        EObject this_TipoExistente_1 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1747:28: ( (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1748:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1748:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=67 && LA29_0<=71)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1749:5: this_TipoDefinido_0= ruleTipoDefinido
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoDefinidoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTipoDefinido_in_ruleTipo4115);
                    this_TipoDefinido_0=ruleTipoDefinido();

                    state._fsp--;

                     
                            current = this_TipoDefinido_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1759:5: this_TipoExistente_1= ruleTipoExistente
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoExistenteParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTipoExistente_in_ruleTipo4142);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1775:1: entryRuleTipoDefinido returns [EObject current=null] : iv_ruleTipoDefinido= ruleTipoDefinido EOF ;
    public final EObject entryRuleTipoDefinido() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoDefinido = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1776:2: (iv_ruleTipoDefinido= ruleTipoDefinido EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1777:2: iv_ruleTipoDefinido= ruleTipoDefinido EOF
            {
             newCompositeNode(grammarAccess.getTipoDefinidoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoDefinido_in_entryRuleTipoDefinido4177);
            iv_ruleTipoDefinido=ruleTipoDefinido();

            state._fsp--;

             current =iv_ruleTipoDefinido; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoDefinido4187); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1784:1: ruleTipoDefinido returns [EObject current=null] : ( (lv_tipo_0_0= ruleEString ) ) ;
    public final EObject ruleTipoDefinido() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1787:28: ( ( (lv_tipo_0_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1788:1: ( (lv_tipo_0_0= ruleEString ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1788:1: ( (lv_tipo_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1789:1: (lv_tipo_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1789:1: (lv_tipo_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1790:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTipoDefinidoAccess().getTipoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTipoDefinido4232);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1814:1: entryRuleTipoExistente returns [EObject current=null] : iv_ruleTipoExistente= ruleTipoExistente EOF ;
    public final EObject entryRuleTipoExistente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoExistente = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1815:2: (iv_ruleTipoExistente= ruleTipoExistente EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1816:2: iv_ruleTipoExistente= ruleTipoExistente EOF
            {
             newCompositeNode(grammarAccess.getTipoExistenteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoExistente_in_entryRuleTipoExistente4267);
            iv_ruleTipoExistente=ruleTipoExistente();

            state._fsp--;

             current =iv_ruleTipoExistente; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoExistente4277); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1823:1: ruleTipoExistente returns [EObject current=null] : ( (lv_tipo_0_0= ruleTipoVariable ) ) ;
    public final EObject ruleTipoExistente() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1826:28: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1827:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1827:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1828:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1828:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1829:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getTipoExistenteAccess().getTipoTipoVariableParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleTipoExistente4322);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1853:1: entryRuleConstantes returns [EObject current=null] : iv_ruleConstantes= ruleConstantes EOF ;
    public final EObject entryRuleConstantes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantes = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1854:2: (iv_ruleConstantes= ruleConstantes EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1855:2: iv_ruleConstantes= ruleConstantes EOF
            {
             newCompositeNode(grammarAccess.getConstantesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_entryRuleConstantes4357);
            iv_ruleConstantes=ruleConstantes();

            state._fsp--;

             current =iv_ruleConstantes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantes4367); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1862:1: ruleConstantes returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) ) ) ;
    public final EObject ruleConstantes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_valor_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1865:28: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1866:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1866:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1866:2: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1866:2: ( (lv_variable_0_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1867:1: (lv_variable_0_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1867:1: (lv_variable_0_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1868:3: lv_variable_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getVariableVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleConstantes4413);
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

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleConstantes4425); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantesAccess().getEqualsSignKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1888:1: ( (lv_valor_2_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1889:1: (lv_valor_2_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1889:1: (lv_valor_2_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1890:3: lv_valor_2_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getValorValorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleConstantes4446);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1914:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1915:2: (iv_ruleVector= ruleVector EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1916:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVector_in_entryRuleVector4482);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVector4492); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1923:1: ruleVector returns [EObject current=null] : (otherlv_0= 'vector ' otherlv_1= '[' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= ']' otherlv_5= 'de' ( (lv_tipo_6_0= ruleTipo ) ) otherlv_7= ': ' ( (lv_nombre_8_0= ruleEString ) ) ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1926:28: ( (otherlv_0= 'vector ' otherlv_1= '[' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= ']' otherlv_5= 'de' ( (lv_tipo_6_0= ruleTipo ) ) otherlv_7= ': ' ( (lv_nombre_8_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1927:1: (otherlv_0= 'vector ' otherlv_1= '[' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= ']' otherlv_5= 'de' ( (lv_tipo_6_0= ruleTipo ) ) otherlv_7= ': ' ( (lv_nombre_8_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1927:1: (otherlv_0= 'vector ' otherlv_1= '[' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= ']' otherlv_5= 'de' ( (lv_tipo_6_0= ruleTipo ) ) otherlv_7= ': ' ( (lv_nombre_8_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1927:3: otherlv_0= 'vector ' otherlv_1= '[' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= ']' otherlv_5= 'de' ( (lv_tipo_6_0= ruleTipo ) ) otherlv_7= ': ' ( (lv_nombre_8_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleVector4529); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getVectorKeyword_0());
                
            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleVector4541); 

                	newLeafNode(otherlv_1, grammarAccess.getVectorAccess().getLeftSquareBracketKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1935:1: ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT||LA30_0==72) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1935:2: ( (lv_valor_2_0= ruleNumeroEntero ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1935:2: ( (lv_valor_2_0= ruleNumeroEntero ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1936:1: (lv_valor_2_0= ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1936:1: (lv_valor_2_0= ruleNumeroEntero )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1937:3: lv_valor_2_0= ruleNumeroEntero
                    {
                     
                    	        newCompositeNode(grammarAccess.getVectorAccess().getValorNumeroEnteroParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_ruleVector4563);
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
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1954:6: ( (lv_valor_3_0= ruleVariableID ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1954:6: ( (lv_valor_3_0= ruleVariableID ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1955:1: (lv_valor_3_0= ruleVariableID )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1955:1: (lv_valor_3_0= ruleVariableID )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1956:3: lv_valor_3_0= ruleVariableID
                    {
                     
                    	        newCompositeNode(grammarAccess.getVectorAccess().getValorVariableIDParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleVector4590);
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

            otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleVector4603); 

                	newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getRightSquareBracketKeyword_3());
                
            otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleVector4615); 

                	newLeafNode(otherlv_5, grammarAccess.getVectorAccess().getDeKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1980:1: ( (lv_tipo_6_0= ruleTipo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1981:1: (lv_tipo_6_0= ruleTipo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1981:1: (lv_tipo_6_0= ruleTipo )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1982:3: lv_tipo_6_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getTipoTipoParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleVector4636);
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

            otherlv_7=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleVector4648); 

                	newLeafNode(otherlv_7, grammarAccess.getVectorAccess().getColonSpaceKeyword_6());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2002:1: ( (lv_nombre_8_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2003:1: (lv_nombre_8_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2003:1: (lv_nombre_8_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2004:3: lv_nombre_8_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getNombreEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVector4669);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2028:1: entryRuleMatriz returns [EObject current=null] : iv_ruleMatriz= ruleMatriz EOF ;
    public final EObject entryRuleMatriz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatriz = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2029:2: (iv_ruleMatriz= ruleMatriz EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2030:2: iv_ruleMatriz= ruleMatriz EOF
            {
             newCompositeNode(grammarAccess.getMatrizRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_entryRuleMatriz4705);
            iv_ruleMatriz=ruleMatriz();

            state._fsp--;

             current =iv_ruleMatriz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatriz4715); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2037:1: ruleMatriz returns [EObject current=null] : (otherlv_0= 'matriz ' otherlv_1= '[' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_valor_5_0= ruleNumeroEntero ) ) | ( (lv_valor_6_0= ruleVariableID ) ) ) otherlv_7= ']' otherlv_8= 'de' ( (lv_tipo_9_0= ruleTipo ) ) otherlv_10= ': ' ( (lv_nombre_11_0= ruleEString ) ) ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2040:28: ( (otherlv_0= 'matriz ' otherlv_1= '[' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_valor_5_0= ruleNumeroEntero ) ) | ( (lv_valor_6_0= ruleVariableID ) ) ) otherlv_7= ']' otherlv_8= 'de' ( (lv_tipo_9_0= ruleTipo ) ) otherlv_10= ': ' ( (lv_nombre_11_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2041:1: (otherlv_0= 'matriz ' otherlv_1= '[' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_valor_5_0= ruleNumeroEntero ) ) | ( (lv_valor_6_0= ruleVariableID ) ) ) otherlv_7= ']' otherlv_8= 'de' ( (lv_tipo_9_0= ruleTipo ) ) otherlv_10= ': ' ( (lv_nombre_11_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2041:1: (otherlv_0= 'matriz ' otherlv_1= '[' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_valor_5_0= ruleNumeroEntero ) ) | ( (lv_valor_6_0= ruleVariableID ) ) ) otherlv_7= ']' otherlv_8= 'de' ( (lv_tipo_9_0= ruleTipo ) ) otherlv_10= ': ' ( (lv_nombre_11_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2041:3: otherlv_0= 'matriz ' otherlv_1= '[' ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) ) otherlv_4= '][' ( ( (lv_valor_5_0= ruleNumeroEntero ) ) | ( (lv_valor_6_0= ruleVariableID ) ) ) otherlv_7= ']' otherlv_8= 'de' ( (lv_tipo_9_0= ruleTipo ) ) otherlv_10= ': ' ( (lv_nombre_11_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleMatriz4752); 

                	newLeafNode(otherlv_0, grammarAccess.getMatrizAccess().getMatrizKeyword_0());
                
            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMatriz4764); 

                	newLeafNode(otherlv_1, grammarAccess.getMatrizAccess().getLeftSquareBracketKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2049:1: ( ( (lv_valor_2_0= ruleNumeroEntero ) ) | ( (lv_valor_3_0= ruleVariableID ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT||LA31_0==72) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2049:2: ( (lv_valor_2_0= ruleNumeroEntero ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2049:2: ( (lv_valor_2_0= ruleNumeroEntero ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2050:1: (lv_valor_2_0= ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2050:1: (lv_valor_2_0= ruleNumeroEntero )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2051:3: lv_valor_2_0= ruleNumeroEntero
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatrizAccess().getValorNumeroEnteroParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_ruleMatriz4786);
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
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2068:6: ( (lv_valor_3_0= ruleVariableID ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2068:6: ( (lv_valor_3_0= ruleVariableID ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2069:1: (lv_valor_3_0= ruleVariableID )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2069:1: (lv_valor_3_0= ruleVariableID )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2070:3: lv_valor_3_0= ruleVariableID
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatrizAccess().getValorVariableIDParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleMatriz4813);
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

            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMatriz4826); 

                	newLeafNode(otherlv_4, grammarAccess.getMatrizAccess().getRightSquareBracketLeftSquareBracketKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2090:1: ( ( (lv_valor_5_0= ruleNumeroEntero ) ) | ( (lv_valor_6_0= ruleVariableID ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT||LA32_0==72) ) {
                alt32=1;
            }
            else if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2090:2: ( (lv_valor_5_0= ruleNumeroEntero ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2090:2: ( (lv_valor_5_0= ruleNumeroEntero ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2091:1: (lv_valor_5_0= ruleNumeroEntero )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2091:1: (lv_valor_5_0= ruleNumeroEntero )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2092:3: lv_valor_5_0= ruleNumeroEntero
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatrizAccess().getValorNumeroEnteroParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_ruleMatriz4848);
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
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2109:6: ( (lv_valor_6_0= ruleVariableID ) )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2109:6: ( (lv_valor_6_0= ruleVariableID ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2110:1: (lv_valor_6_0= ruleVariableID )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2110:1: (lv_valor_6_0= ruleVariableID )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2111:3: lv_valor_6_0= ruleVariableID
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatrizAccess().getValorVariableIDParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleMatriz4875);
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

            otherlv_7=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMatriz4888); 

                	newLeafNode(otherlv_7, grammarAccess.getMatrizAccess().getRightSquareBracketKeyword_5());
                
            otherlv_8=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMatriz4900); 

                	newLeafNode(otherlv_8, grammarAccess.getMatrizAccess().getDeKeyword_6());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2135:1: ( (lv_tipo_9_0= ruleTipo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2136:1: (lv_tipo_9_0= ruleTipo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2136:1: (lv_tipo_9_0= ruleTipo )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2137:3: lv_tipo_9_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getTipoTipoParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleMatriz4921);
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

            otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleMatriz4933); 

                	newLeafNode(otherlv_10, grammarAccess.getMatrizAccess().getColonSpaceKeyword_8());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2157:1: ( (lv_nombre_11_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2158:1: (lv_nombre_11_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2158:1: (lv_nombre_11_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2159:3: lv_nombre_11_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getNombreEStringParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatriz4954);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2183:1: entryRuleRegistro returns [EObject current=null] : iv_ruleRegistro= ruleRegistro EOF ;
    public final EObject entryRuleRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistro = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2184:2: (iv_ruleRegistro= ruleRegistro EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2185:2: iv_ruleRegistro= ruleRegistro EOF
            {
             newCompositeNode(grammarAccess.getRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRegistro_in_entryRuleRegistro4990);
            iv_ruleRegistro=ruleRegistro();

            state._fsp--;

             current =iv_ruleRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegistro5000); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2192:1: ruleRegistro returns [EObject current=null] : (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' ) ;
    public final EObject ruleRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2195:28: ( (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2196:1: (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2196:1: (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2196:3: otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleRegistro5037); 

                	newLeafNode(otherlv_0, grammarAccess.getRegistroAccess().getRegistroKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2200:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2201:1: (lv_nombre_1_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2201:1: (lv_nombre_1_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2202:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRegistro5058);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2218:2: ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2218:3: ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2218:3: ( (lv_variable_2_0= ruleDeclaracion ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2219:1: (lv_variable_2_0= ruleDeclaracion )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2219:1: (lv_variable_2_0= ruleDeclaracion )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2220:3: lv_variable_2_0= ruleDeclaracion
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getVariableDeclaracionParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleRegistro5080);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2236:2: ( (lv_variable_3_0= ruleDeclaracion ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_ID)||(LA33_0>=67 && LA33_0<=71)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2237:1: (lv_variable_3_0= ruleDeclaracion )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2237:1: (lv_variable_3_0= ruleDeclaracion )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2238:3: lv_variable_3_0= ruleDeclaracion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRegistroAccess().getVariableDeclaracionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleRegistro5101);
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
            	    break loop33;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleRegistro5115); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2266:1: entryRuleArchivo returns [EObject current=null] : iv_ruleArchivo= ruleArchivo EOF ;
    public final EObject entryRuleArchivo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchivo = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2267:2: (iv_ruleArchivo= ruleArchivo EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2268:2: iv_ruleArchivo= ruleArchivo EOF
            {
             newCompositeNode(grammarAccess.getArchivoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArchivo_in_entryRuleArchivo5151);
            iv_ruleArchivo=ruleArchivo();

            state._fsp--;

             current =iv_ruleArchivo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArchivo5161); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2275:1: ruleArchivo returns [EObject current=null] : (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) ) ;
    public final EObject ruleArchivo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_tipo_1_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2278:28: ( (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2279:1: (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2279:1: (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2279:3: otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleArchivo5198); 

                	newLeafNode(otherlv_0, grammarAccess.getArchivoAccess().getArchivoDeKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2283:1: ( (lv_tipo_1_0= ruleTipo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2284:1: (lv_tipo_1_0= ruleTipo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2284:1: (lv_tipo_1_0= ruleTipo )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2285:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleArchivo5219);
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

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleArchivo5231); 

                	newLeafNode(otherlv_2, grammarAccess.getArchivoAccess().getColonSpaceKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2305:1: ( (lv_nombre_3_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2306:1: (lv_nombre_3_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2306:1: (lv_nombre_3_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2307:3: lv_nombre_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getNombreEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArchivo5252);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2331:1: entryRuleEnumerado returns [EObject current=null] : iv_ruleEnumerado= ruleEnumerado EOF ;
    public final EObject entryRuleEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerado = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2332:2: (iv_ruleEnumerado= ruleEnumerado EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2333:2: iv_ruleEnumerado= ruleEnumerado EOF
            {
             newCompositeNode(grammarAccess.getEnumeradoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumerado_in_entryRuleEnumerado5288);
            iv_ruleEnumerado=ruleEnumerado();

            state._fsp--;

             current =iv_ruleEnumerado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerado5298); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2340:1: ruleEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )* ) otherlv_6= '}' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2343:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )* ) otherlv_6= '}' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2344:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )* ) otherlv_6= '}' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2344:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )* ) otherlv_6= '}' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2344:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )* ) otherlv_6= '}'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2344:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2345:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2345:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2346:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnumerado5344);
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

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEnumerado5356); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumeradoAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEnumerado5368); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumeradoAccess().getLeftCurlyBracketKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2370:1: ( ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2370:2: ( (lv_valor_3_0= rulevalor ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2370:2: ( (lv_valor_3_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2371:1: (lv_valor_3_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2371:1: (lv_valor_3_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2372:3: lv_valor_3_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorValorParserRuleCall_3_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleEnumerado5390);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2388:2: (otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==18) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2388:4: otherlv_4= ',' ( (lv_valor_5_0= rulevalor ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEnumerado5403); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumeradoAccess().getCommaKeyword_3_1_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2392:1: ( (lv_valor_5_0= rulevalor ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2393:1: (lv_valor_5_0= rulevalor )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2393:1: (lv_valor_5_0= rulevalor )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2394:3: lv_valor_5_0= rulevalor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorValorParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleEnumerado5424);
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
            	    break loop34;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEnumerado5439); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2422:1: entryRuleSubrango returns [EObject current=null] : iv_ruleSubrango= ruleSubrango EOF ;
    public final EObject entryRuleSubrango() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrango = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2423:2: (iv_ruleSubrango= ruleSubrango EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2424:2: iv_ruleSubrango= ruleSubrango EOF
            {
             newCompositeNode(grammarAccess.getSubrangoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrango_in_entryRuleSubrango5475);
            iv_ruleSubrango=ruleSubrango();

            state._fsp--;

             current =iv_ruleSubrango; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrango5485); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2431:1: ruleSubrango returns [EObject current=null] : (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado ) ;
    public final EObject ruleSubrango() throws RecognitionException {
        EObject current = null;

        EObject this_SubrangoNumerico_0 = null;

        EObject this_SubrangoEnumerado_1 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2434:28: ( (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2435:1: (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2435:1: (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==37) ) {
                    int LA35_3 = input.LA(3);

                    if ( ((LA35_3>=RULE_STRING && LA35_3<=RULE_ID)) ) {
                        alt35=2;
                    }
                    else if ( (LA35_3==RULE_INT||LA35_3==72) ) {
                        alt35=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA35_0==RULE_ID) ) {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==37) ) {
                    int LA35_3 = input.LA(3);

                    if ( ((LA35_3>=RULE_STRING && LA35_3<=RULE_ID)) ) {
                        alt35=2;
                    }
                    else if ( (LA35_3==RULE_INT||LA35_3==72) ) {
                        alt35=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2436:5: this_SubrangoNumerico_0= ruleSubrangoNumerico
                    {
                     
                            newCompositeNode(grammarAccess.getSubrangoAccess().getSubrangoNumericoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrangoNumerico_in_ruleSubrango5532);
                    this_SubrangoNumerico_0=ruleSubrangoNumerico();

                    state._fsp--;

                     
                            current = this_SubrangoNumerico_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2446:5: this_SubrangoEnumerado_1= ruleSubrangoEnumerado
                    {
                     
                            newCompositeNode(grammarAccess.getSubrangoAccess().getSubrangoEnumeradoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrangoEnumerado_in_ruleSubrango5559);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2462:1: entryRuleSubrangoNumerico returns [EObject current=null] : iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF ;
    public final EObject entryRuleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoNumerico = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2463:2: (iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2464:2: iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF
            {
             newCompositeNode(grammarAccess.getSubrangoNumericoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrangoNumerico_in_entryRuleSubrangoNumerico5594);
            iv_ruleSubrangoNumerico=ruleSubrangoNumerico();

            state._fsp--;

             current =iv_ruleSubrangoNumerico; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrangoNumerico5604); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2471:1: ruleSubrangoNumerico returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) ;
    public final EObject ruleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2474:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2475:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2475:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2475:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2475:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2476:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2476:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2477:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoNumerico5650);
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

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSubrangoNumerico5662); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoNumericoAccess().getEqualsSignKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2497:1: ( (lv_limite_inf_2_0= ruleEInt ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2498:1: (lv_limite_inf_2_0= ruleEInt )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2498:1: (lv_limite_inf_2_0= ruleEInt )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2499:3: lv_limite_inf_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_infEIntParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubrangoNumerico5683);
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

            otherlv_3=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleSubrangoNumerico5695); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoNumericoAccess().getFullStopFullStopKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2519:1: ( (lv_limite_sup_4_0= ruleEInt ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2520:1: (lv_limite_sup_4_0= ruleEInt )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2520:1: (lv_limite_sup_4_0= ruleEInt )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2521:3: lv_limite_sup_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_supEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubrangoNumerico5716);
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


    // $ANTLR start "entryRuleSubrangoEnumerado"
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2545:1: entryRuleSubrangoEnumerado returns [EObject current=null] : iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF ;
    public final EObject entryRuleSubrangoEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoEnumerado = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2546:2: (iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2547:2: iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF
            {
             newCompositeNode(grammarAccess.getSubrangoEnumeradoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrangoEnumerado_in_entryRuleSubrangoEnumerado5752);
            iv_ruleSubrangoEnumerado=ruleSubrangoEnumerado();

            state._fsp--;

             current =iv_ruleSubrangoEnumerado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrangoEnumerado5762); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2554:1: ruleSubrangoEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) ;
    public final EObject ruleSubrangoEnumerado() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2557:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2558:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2558:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2558:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2558:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2559:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2559:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2560:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado5808);
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

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSubrangoEnumerado5820); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoEnumeradoAccess().getEqualsSignKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2580:1: ( (lv_limite_inf_2_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2581:1: (lv_limite_inf_2_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2581:1: (lv_limite_inf_2_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2582:3: lv_limite_inf_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getLimite_infEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado5841);
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

            otherlv_3=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleSubrangoEnumerado5853); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoEnumeradoAccess().getFullStopFullStopKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2602:1: ( (lv_limite_sup_4_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2603:1: (lv_limite_sup_4_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2603:1: (lv_limite_sup_4_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2604:3: lv_limite_sup_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getLimite_supEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado5874);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2628:1: entryRuleInicio returns [EObject current=null] : iv_ruleInicio= ruleInicio EOF ;
    public final EObject entryRuleInicio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInicio = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2629:2: (iv_ruleInicio= ruleInicio EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2630:2: iv_ruleInicio= ruleInicio EOF
            {
             newCompositeNode(grammarAccess.getInicioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_entryRuleInicio5910);
            iv_ruleInicio=ruleInicio();

            state._fsp--;

             current =iv_ruleInicio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInicio5920); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2637:1: ruleInicio returns [EObject current=null] : ( () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2640:28: ( ( () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2641:1: ( () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2641:1: ( () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2641:2: () otherlv_1= 'var' ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )? otherlv_4= 'inicio' ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_inicio'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2641:2: ()
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2642:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInicioAccess().getInicioAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleInicio5966); 

                	newLeafNode(otherlv_1, grammarAccess.getInicioAccess().getVarKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2651:1: ( ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)||(LA37_0>=67 && LA37_0<=71)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2651:2: ( (lv_declaracion_2_0= ruleDeclaracion ) ) ( (lv_declaracion_3_0= ruleDeclaracion ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2651:2: ( (lv_declaracion_2_0= ruleDeclaracion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2652:1: (lv_declaracion_2_0= ruleDeclaracion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2652:1: (lv_declaracion_2_0= ruleDeclaracion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2653:3: lv_declaracion_2_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio5988);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2669:2: ( (lv_declaracion_3_0= ruleDeclaracion ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_ID)||(LA36_0>=67 && LA36_0<=71)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2670:1: (lv_declaracion_3_0= ruleDeclaracion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2670:1: (lv_declaracion_3_0= ruleDeclaracion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2671:3: lv_declaracion_3_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio6009);
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
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleInicio6024); 

                	newLeafNode(otherlv_4, grammarAccess.getInicioAccess().getInicioKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2691:1: ( ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)||(LA39_0>=20 && LA39_0<=21)||(LA39_0>=51 && LA39_0<=53)||LA39_0==56||LA39_0==59||LA39_0==61||LA39_0==64) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2691:2: ( (lv_tiene_5_0= ruleSentencias ) ) ( (lv_tiene_6_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2691:2: ( (lv_tiene_5_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2692:1: (lv_tiene_5_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2692:1: (lv_tiene_5_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2693:3: lv_tiene_5_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio6046);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2709:2: ( (lv_tiene_6_0= ruleSentencias ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)||(LA38_0>=20 && LA38_0<=21)||(LA38_0>=51 && LA38_0<=53)||LA38_0==56||LA38_0==59||LA38_0==61||LA38_0==64) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2710:1: (lv_tiene_6_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2710:1: (lv_tiene_6_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2711:3: lv_tiene_6_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio6067);
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
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleInicio6082); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2739:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2740:2: (iv_ruleEString= ruleEString EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2741:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString6119);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString6130); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2748:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2751:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2752:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2752:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2752:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString6170); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2760:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString6196); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2775:1: entryRuleDeclaracionVariable returns [EObject current=null] : iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF ;
    public final EObject entryRuleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionVariable = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2776:2: (iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2777:2: iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable6241);
            iv_ruleDeclaracionVariable=ruleDeclaracionVariable();

            state._fsp--;

             current =iv_ruleDeclaracionVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionVariable6251); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2784:1: ruleDeclaracionVariable returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2787:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2788:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2788:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2788:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2788:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2789:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2789:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2790:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable6297);
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

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDeclaracionVariable6309); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionVariableAccess().getColonSpaceKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2810:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2811:1: (lv_variable_2_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2811:1: (lv_variable_2_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2812:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable6330);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2828:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==18) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2828:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDeclaracionVariable6343); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionVariableAccess().getCommaKeyword_3_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2832:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2833:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2833:1: (lv_variable_4_0= ruleVariable )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2834:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable6364);
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
            	    break loop41;
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2858:1: entryRuleDeclaracionPropia returns [EObject current=null] : iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF ;
    public final EObject entryRuleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionPropia = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2859:2: (iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2860:2: iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionPropiaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia6402);
            iv_ruleDeclaracionPropia=ruleDeclaracionPropia();

            state._fsp--;

             current =iv_ruleDeclaracionPropia; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionPropia6412); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2867:1: ruleDeclaracionPropia returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2870:28: ( ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2871:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2871:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2871:2: ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2871:2: ( (lv_tipo_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2872:1: (lv_tipo_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2872:1: (lv_tipo_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2873:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getTipoEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDeclaracionPropia6458);
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

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDeclaracionPropia6470); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionPropiaAccess().getColonSpaceKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2893:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2894:1: (lv_variable_2_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2894:1: (lv_variable_2_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2895:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia6491);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2911:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==18) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2911:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDeclaracionPropia6504); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionPropiaAccess().getCommaKeyword_3_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2915:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2916:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2916:1: (lv_variable_4_0= ruleVariable )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2917:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia6525);
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
            	    break loop42;
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2941:1: entryRuleLlamadaFuncion returns [EObject current=null] : iv_ruleLlamadaFuncion= ruleLlamadaFuncion EOF ;
    public final EObject entryRuleLlamadaFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlamadaFuncion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2942:2: (iv_ruleLlamadaFuncion= ruleLlamadaFuncion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2943:2: iv_ruleLlamadaFuncion= ruleLlamadaFuncion EOF
            {
             newCompositeNode(grammarAccess.getLlamadaFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLlamadaFuncion_in_entryRuleLlamadaFuncion6563);
            iv_ruleLlamadaFuncion=ruleLlamadaFuncion();

            state._fsp--;

             current =iv_ruleLlamadaFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLlamadaFuncion6573); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2950:1: ruleLlamadaFuncion returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= rulevalor ) ) (otherlv_3= ',' ( (lv_operador_4_0= rulevalor ) ) )* )? otherlv_5= ')' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2953:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= rulevalor ) ) (otherlv_3= ',' ( (lv_operador_4_0= rulevalor ) ) )* )? otherlv_5= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2954:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= rulevalor ) ) (otherlv_3= ',' ( (lv_operador_4_0= rulevalor ) ) )* )? otherlv_5= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2954:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= rulevalor ) ) (otherlv_3= ',' ( (lv_operador_4_0= rulevalor ) ) )* )? otherlv_5= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2954:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_operador_2_0= rulevalor ) ) (otherlv_3= ',' ( (lv_operador_4_0= rulevalor ) ) )* )? otherlv_5= ')'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2954:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2955:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2955:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2956:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getLlamadaFuncionAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLlamadaFuncion6619);
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

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLlamadaFuncion6631); 

                	newLeafNode(otherlv_1, grammarAccess.getLlamadaFuncionAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2976:1: ( ( (lv_operador_2_0= rulevalor ) ) (otherlv_3= ',' ( (lv_operador_4_0= rulevalor ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_CAR && LA44_0<=RULE_INT)||LA44_0==17||(LA44_0>=24 && LA44_0<=32)||LA44_0==36||LA44_0==72||(LA44_0>=75 && LA44_0<=76)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2976:2: ( (lv_operador_2_0= rulevalor ) ) (otherlv_3= ',' ( (lv_operador_4_0= rulevalor ) ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2976:2: ( (lv_operador_2_0= rulevalor ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2977:1: (lv_operador_2_0= rulevalor )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2977:1: (lv_operador_2_0= rulevalor )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2978:3: lv_operador_2_0= rulevalor
                    {
                     
                    	        newCompositeNode(grammarAccess.getLlamadaFuncionAccess().getOperadorValorParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleLlamadaFuncion6653);
                    lv_operador_2_0=rulevalor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLlamadaFuncionRule());
                    	        }
                           		add(
                           			current, 
                           			"operador",
                            		lv_operador_2_0, 
                            		"valor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2994:2: (otherlv_3= ',' ( (lv_operador_4_0= rulevalor ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==18) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2994:4: otherlv_3= ',' ( (lv_operador_4_0= rulevalor ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLlamadaFuncion6666); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getLlamadaFuncionAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2998:1: ( (lv_operador_4_0= rulevalor ) )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2999:1: (lv_operador_4_0= rulevalor )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2999:1: (lv_operador_4_0= rulevalor )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3000:3: lv_operador_4_0= rulevalor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLlamadaFuncionAccess().getOperadorValorParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleLlamadaFuncion6687);
                    	    lv_operador_4_0=rulevalor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLlamadaFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operador",
                    	            		lv_operador_4_0, 
                    	            		"valor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


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

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLlamadaFuncion6703); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3028:1: entryRuleAsignacion returns [EObject current=null] : iv_ruleAsignacion= ruleAsignacion EOF ;
    public final EObject entryRuleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3029:2: (iv_ruleAsignacion= ruleAsignacion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3030:2: iv_ruleAsignacion= ruleAsignacion EOF
            {
             newCompositeNode(grammarAccess.getAsignacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_entryRuleAsignacion6739);
            iv_ruleAsignacion=ruleAsignacion();

            state._fsp--;

             current =iv_ruleAsignacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacion6749); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3037:1: ruleAsignacion returns [EObject current=null] : (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) ;
    public final EObject ruleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject this_AsignacionNormal_0 = null;

        EObject this_AsignacionCompleja_1 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3040:28: ( (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3041:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3041:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_STRING) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==33||LA45_1==36) ) {
                    alt45=2;
                }
                else if ( (LA45_1==37) ) {
                    alt45=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA45_0==RULE_ID) ) {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==33||LA45_2==36) ) {
                    alt45=2;
                }
                else if ( (LA45_2==37) ) {
                    alt45=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3042:5: this_AsignacionNormal_0= ruleAsignacionNormal
                    {
                     
                            newCompositeNode(grammarAccess.getAsignacionAccess().getAsignacionNormalParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_ruleAsignacion6796);
                    this_AsignacionNormal_0=ruleAsignacionNormal();

                    state._fsp--;

                     
                            current = this_AsignacionNormal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3052:5: this_AsignacionCompleja_1= ruleAsignacionCompleja
                    {
                     
                            newCompositeNode(grammarAccess.getAsignacionAccess().getAsignacionComplejaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacionCompleja_in_ruleAsignacion6823);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3068:1: entryRuleAsignacionNormal returns [EObject current=null] : iv_ruleAsignacionNormal= ruleAsignacionNormal EOF ;
    public final EObject entryRuleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionNormal = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3069:2: (iv_ruleAsignacionNormal= ruleAsignacionNormal EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3070:2: iv_ruleAsignacionNormal= ruleAsignacionNormal EOF
            {
             newCompositeNode(grammarAccess.getAsignacionNormalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_entryRuleAsignacionNormal6858);
            iv_ruleAsignacionNormal=ruleAsignacionNormal();

            state._fsp--;

             current =iv_ruleAsignacionNormal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacionNormal6868); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3077:1: ruleAsignacionNormal returns [EObject current=null] : ( ( (lv_lvalue_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_operador_2_0= rulevalor ) ) ) ;
    public final EObject ruleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lvalue_0_0 = null;

        EObject lv_operador_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3080:28: ( ( ( (lv_lvalue_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_operador_2_0= rulevalor ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3081:1: ( ( (lv_lvalue_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_operador_2_0= rulevalor ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3081:1: ( ( (lv_lvalue_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_operador_2_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3081:2: ( (lv_lvalue_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_operador_2_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3081:2: ( (lv_lvalue_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3082:1: (lv_lvalue_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3082:1: (lv_lvalue_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3083:3: lv_lvalue_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getLvalueEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsignacionNormal6914);
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

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAsignacionNormal6926); 

                	newLeafNode(otherlv_1, grammarAccess.getAsignacionNormalAccess().getEqualsSignKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3103:1: ( (lv_operador_2_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3104:1: (lv_operador_2_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3104:1: (lv_operador_2_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3105:3: lv_operador_2_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getOperadorValorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleAsignacionNormal6947);
            lv_operador_2_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionNormalRule());
            	        }
                   		set(
                   			current, 
                   			"operador",
                    		lv_operador_2_0, 
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3129:1: entryRuleAsignacionCompleja returns [EObject current=null] : iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF ;
    public final EObject entryRuleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionCompleja = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3130:2: (iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3131:2: iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF
            {
             newCompositeNode(grammarAccess.getAsignacionComplejaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionCompleja_in_entryRuleAsignacionCompleja6983);
            iv_ruleAsignacionCompleja=ruleAsignacionCompleja();

            state._fsp--;

             current =iv_ruleAsignacionCompleja; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacionCompleja6993); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3138:1: ruleAsignacionCompleja returns [EObject current=null] : ( ( (lv_complejo_0_0= ruleValorComplejo ) ) otherlv_1= '=' ( (lv_operador_2_0= rulevalor ) ) ) ;
    public final EObject ruleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_complejo_0_0 = null;

        EObject lv_operador_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3141:28: ( ( ( (lv_complejo_0_0= ruleValorComplejo ) ) otherlv_1= '=' ( (lv_operador_2_0= rulevalor ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3142:1: ( ( (lv_complejo_0_0= ruleValorComplejo ) ) otherlv_1= '=' ( (lv_operador_2_0= rulevalor ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3142:1: ( ( (lv_complejo_0_0= ruleValorComplejo ) ) otherlv_1= '=' ( (lv_operador_2_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3142:2: ( (lv_complejo_0_0= ruleValorComplejo ) ) otherlv_1= '=' ( (lv_operador_2_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3142:2: ( (lv_complejo_0_0= ruleValorComplejo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3143:1: (lv_complejo_0_0= ruleValorComplejo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3143:1: (lv_complejo_0_0= ruleValorComplejo )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3144:3: lv_complejo_0_0= ruleValorComplejo
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getComplejoValorComplejoParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleValorComplejo_in_ruleAsignacionCompleja7039);
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

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAsignacionCompleja7051); 

                	newLeafNode(otherlv_1, grammarAccess.getAsignacionComplejaAccess().getEqualsSignKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3164:1: ( (lv_operador_2_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3165:1: (lv_operador_2_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3165:1: (lv_operador_2_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3166:3: lv_operador_2_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getOperadorValorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleAsignacionCompleja7072);
            lv_operador_2_0=rulevalor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionComplejaRule());
            	        }
                   		set(
                   			current, 
                   			"operador",
                    		lv_operador_2_0, 
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3190:1: entryRuleEscribir returns [EObject current=null] : iv_ruleEscribir= ruleEscribir EOF ;
    public final EObject entryRuleEscribir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscribir = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3191:2: (iv_ruleEscribir= ruleEscribir EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3192:2: iv_ruleEscribir= ruleEscribir EOF
            {
             newCompositeNode(grammarAccess.getEscribirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_entryRuleEscribir7108);
            iv_ruleEscribir=ruleEscribir();

            state._fsp--;

             current =iv_ruleEscribir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEscribir7118); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3199:1: ruleEscribir returns [EObject current=null] : (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3202:28: ( (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3203:1: (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3203:1: (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3203:3: otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= ruleOperador ) ) (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEscribir7155); 

                	newLeafNode(otherlv_0, grammarAccess.getEscribirAccess().getEscribirKeyword_0());
                
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEscribir7167); 

                	newLeafNode(otherlv_1, grammarAccess.getEscribirAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3211:1: ( (lv_operador_2_0= ruleOperador ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3212:1: (lv_operador_2_0= ruleOperador )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3212:1: (lv_operador_2_0= ruleOperador )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3213:3: lv_operador_2_0= ruleOperador
            {
             
            	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleEscribir7188);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3229:2: (otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==18) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3229:4: otherlv_3= ',' ( (lv_operador_4_0= ruleOperador ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEscribir7201); 

            	        	newLeafNode(otherlv_3, grammarAccess.getEscribirAccess().getCommaKeyword_3_0());
            	        
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3233:1: ( (lv_operador_4_0= ruleOperador ) )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3234:1: (lv_operador_4_0= ruleOperador )
            	    {
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3234:1: (lv_operador_4_0= ruleOperador )
            	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3235:3: lv_operador_4_0= ruleOperador
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorOperadorParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleEscribir7222);
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
            	    break loop46;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEscribir7236); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3263:1: entryRuleLeer returns [EObject current=null] : iv_ruleLeer= ruleLeer EOF ;
    public final EObject entryRuleLeer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeer = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3264:2: (iv_ruleLeer= ruleLeer EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3265:2: iv_ruleLeer= ruleLeer EOF
            {
             newCompositeNode(grammarAccess.getLeerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeer_in_entryRuleLeer7272);
            iv_ruleLeer=ruleLeer();

            state._fsp--;

             current =iv_ruleLeer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeer7282); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3272:1: ruleLeer returns [EObject current=null] : (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= rulevaloresLeer ) ) otherlv_3= ')' ) ;
    public final EObject ruleLeer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3275:28: ( (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= rulevaloresLeer ) ) otherlv_3= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3276:1: (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= rulevaloresLeer ) ) otherlv_3= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3276:1: (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= rulevaloresLeer ) ) otherlv_3= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3276:3: otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= rulevaloresLeer ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleLeer7319); 

                	newLeafNode(otherlv_0, grammarAccess.getLeerAccess().getLeerKeyword_0());
                
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLeer7331); 

                	newLeafNode(otherlv_1, grammarAccess.getLeerAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3284:1: ( (lv_variable_2_0= rulevaloresLeer ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3285:1: (lv_variable_2_0= rulevaloresLeer )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3285:1: (lv_variable_2_0= rulevaloresLeer )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3286:3: lv_variable_2_0= rulevaloresLeer
            {
             
            	        newCompositeNode(grammarAccess.getLeerAccess().getVariableValoresLeerParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevaloresLeer_in_ruleLeer7352);
            lv_variable_2_0=rulevaloresLeer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLeerRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"valoresLeer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLeer7364); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3314:1: entryRuleSi returns [EObject current=null] : iv_ruleSi= ruleSi EOF ;
    public final EObject entryRuleSi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSi = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3315:2: (iv_ruleSi= ruleSi EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3316:2: iv_ruleSi= ruleSi EOF
            {
             newCompositeNode(grammarAccess.getSiRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSi_in_entryRuleSi7400);
            iv_ruleSi=ruleSi();

            state._fsp--;

             current =iv_ruleSi; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSi7410); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3323:1: ruleSi returns [EObject current=null] : (otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3326:28: ( (otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3327:1: (otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3327:1: (otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3327:3: otherlv_0= 'si' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleSi7447); 

                	newLeafNode(otherlv_0, grammarAccess.getSiAccess().getSiKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3331:1: ( (lv_valor_1_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3332:1: (lv_valor_1_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3332:1: (lv_valor_1_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3333:3: lv_valor_1_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getSiAccess().getValorValorParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleSi7468);
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

            otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleSi7480); 

                	newLeafNode(otherlv_2, grammarAccess.getSiAccess().getEntoncesKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3353:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_ID)||(LA48_0>=20 && LA48_0<=21)||(LA48_0>=51 && LA48_0<=53)||LA48_0==56||LA48_0==59||LA48_0==61||LA48_0==64) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3353:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3353:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3354:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3354:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3355:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi7502);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3371:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( ((LA47_0>=RULE_STRING && LA47_0<=RULE_ID)||(LA47_0>=20 && LA47_0<=21)||(LA47_0>=51 && LA47_0<=53)||LA47_0==56||LA47_0==59||LA47_0==61||LA47_0==64) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3372:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3372:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3373:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi7523);
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
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3389:5: ( (lv_devuelve_5_0= ruleDevolver ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==89) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3390:1: (lv_devuelve_5_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3390:1: (lv_devuelve_5_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3391:3: lv_devuelve_5_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getDevuelveDevolverParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSi7547);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3407:3: ( (lv_sino_6_0= ruleSino ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==88) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3408:1: (lv_sino_6_0= ruleSino )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3408:1: (lv_sino_6_0= ruleSino )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3409:3: lv_sino_6_0= ruleSino
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSinoSinoParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSino_in_ruleSi7569);
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

            otherlv_7=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleSi7582); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3437:1: entryRulemientras returns [EObject current=null] : iv_rulemientras= rulemientras EOF ;
    public final EObject entryRulemientras() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemientras = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3438:2: (iv_rulemientras= rulemientras EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3439:2: iv_rulemientras= rulemientras EOF
            {
             newCompositeNode(grammarAccess.getMientrasRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemientras_in_entryRulemientras7618);
            iv_rulemientras=rulemientras();

            state._fsp--;

             current =iv_rulemientras; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemientras7628); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3446:1: rulemientras returns [EObject current=null] : (otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3449:28: ( (otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3450:1: (otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3450:1: (otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3450:3: otherlv_0= 'mientras' ( (lv_valor_1_0= rulevalor ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras'
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_rulemientras7665); 

                	newLeafNode(otherlv_0, grammarAccess.getMientrasAccess().getMientrasKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3454:1: ( (lv_valor_1_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3455:1: (lv_valor_1_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3455:1: (lv_valor_1_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3456:3: lv_valor_1_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getMientrasAccess().getValorValorParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rulemientras7686);
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

            otherlv_2=(Token)match(input,57,FollowSets000.FOLLOW_57_in_rulemientras7698); 

                	newLeafNode(otherlv_2, grammarAccess.getMientrasAccess().getHacerKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3476:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)||(LA52_0>=20 && LA52_0<=21)||(LA52_0>=51 && LA52_0<=53)||LA52_0==56||LA52_0==59||LA52_0==61||LA52_0==64) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3476:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3476:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3477:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3477:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3478:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras7720);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3494:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( ((LA51_0>=RULE_STRING && LA51_0<=RULE_ID)||(LA51_0>=20 && LA51_0<=21)||(LA51_0>=51 && LA51_0<=53)||LA51_0==56||LA51_0==59||LA51_0==61||LA51_0==64) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3495:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3495:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3496:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras7741);
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
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,58,FollowSets000.FOLLOW_58_in_rulemientras7756); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3524:1: entryRulerepetir returns [EObject current=null] : iv_rulerepetir= rulerepetir EOF ;
    public final EObject entryRulerepetir() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetir = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3525:2: (iv_rulerepetir= rulerepetir EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3526:2: iv_rulerepetir= rulerepetir EOF
            {
             newCompositeNode(grammarAccess.getRepetirRule()); 
            pushFollow(FollowSets000.FOLLOW_rulerepetir_in_entryRulerepetir7792);
            iv_rulerepetir=rulerepetir();

            state._fsp--;

             current =iv_rulerepetir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulerepetir7802); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3533:1: rulerepetir returns [EObject current=null] : (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) ) ) ;
    public final EObject rulerepetir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_sentencias_1_0 = null;

        EObject lv_sentencias_2_0 = null;

        EObject lv_valor_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3536:28: ( (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3537:1: (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3537:1: (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3537:3: otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= rulevalor ) )
            {
            otherlv_0=(Token)match(input,59,FollowSets000.FOLLOW_59_in_rulerepetir7839); 

                	newLeafNode(otherlv_0, grammarAccess.getRepetirAccess().getRepetirKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3541:1: ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_STRING && LA54_0<=RULE_ID)||(LA54_0>=20 && LA54_0<=21)||(LA54_0>=51 && LA54_0<=53)||LA54_0==56||LA54_0==59||LA54_0==61||LA54_0==64) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3541:2: ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3541:2: ( (lv_sentencias_1_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3542:1: (lv_sentencias_1_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3542:1: (lv_sentencias_1_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3543:3: lv_sentencias_1_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir7861);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3559:2: ( (lv_sentencias_2_0= ruleSentencias ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_ID)||(LA53_0>=20 && LA53_0<=21)||(LA53_0>=51 && LA53_0<=53)||LA53_0==56||LA53_0==59||LA53_0==61||LA53_0==64) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3560:1: (lv_sentencias_2_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3560:1: (lv_sentencias_2_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3561:3: lv_sentencias_2_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir7882);
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
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,60,FollowSets000.FOLLOW_60_in_rulerepetir7897); 

                	newLeafNode(otherlv_3, grammarAccess.getRepetirAccess().getHasta_queKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3581:1: ( (lv_valor_4_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3582:1: (lv_valor_4_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3582:1: (lv_valor_4_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3583:3: lv_valor_4_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getRepetirAccess().getValorValorParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rulerepetir7918);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3607:1: entryRuledesde returns [EObject current=null] : iv_ruledesde= ruledesde EOF ;
    public final EObject entryRuledesde() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledesde = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3608:2: (iv_ruledesde= ruledesde EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3609:2: iv_ruledesde= ruledesde EOF
            {
             newCompositeNode(grammarAccess.getDesdeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruledesde_in_entryRuledesde7954);
            iv_ruledesde=ruledesde();

            state._fsp--;

             current =iv_ruledesde; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuledesde7964); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3616:1: ruledesde returns [EObject current=null] : (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3619:28: ( (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3620:1: (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3620:1: (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3620:3: otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= rulevalor ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde'
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruledesde8001); 

                	newLeafNode(otherlv_0, grammarAccess.getDesdeAccess().getDesdeKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3624:1: ( (lv_asignacion_1_0= ruleAsignacionNormal ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3625:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3625:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3626:3: lv_asignacion_1_0= ruleAsignacionNormal
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getAsignacionAsignacionNormalParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_ruledesde8022);
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

            otherlv_2=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruledesde8034); 

                	newLeafNode(otherlv_2, grammarAccess.getDesdeAccess().getHastaKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3646:1: ( (lv_valor_3_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3647:1: (lv_valor_3_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3647:1: (lv_valor_3_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3648:3: lv_valor_3_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getValorValorParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruledesde8055);
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

            otherlv_4=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruledesde8067); 

                	newLeafNode(otherlv_4, grammarAccess.getDesdeAccess().getHacerKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3668:1: ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_STRING && LA56_0<=RULE_ID)||(LA56_0>=20 && LA56_0<=21)||(LA56_0>=51 && LA56_0<=53)||LA56_0==56||LA56_0==59||LA56_0==61||LA56_0==64) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3668:2: ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3668:2: ( (lv_sentencias_5_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3669:1: (lv_sentencias_5_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3669:1: (lv_sentencias_5_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3670:3: lv_sentencias_5_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde8089);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3686:2: ( (lv_sentencias_6_0= ruleSentencias ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( ((LA55_0>=RULE_STRING && LA55_0<=RULE_ID)||(LA55_0>=20 && LA55_0<=21)||(LA55_0>=51 && LA55_0<=53)||LA55_0==56||LA55_0==59||LA55_0==61||LA55_0==64) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3687:1: (lv_sentencias_6_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3687:1: (lv_sentencias_6_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3688:3: lv_sentencias_6_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde8110);
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
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruledesde8125); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3716:1: entryRuleCaso returns [EObject current=null] : iv_ruleCaso= ruleCaso EOF ;
    public final EObject entryRuleCaso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaso = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3717:2: (iv_ruleCaso= ruleCaso EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3718:2: iv_ruleCaso= ruleCaso EOF
            {
             newCompositeNode(grammarAccess.getCasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCaso_in_entryRuleCaso8161);
            iv_ruleCaso=ruleCaso();

            state._fsp--;

             current =iv_ruleCaso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCaso8171); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3725:1: ruleCaso returns [EObject current=null] : ( ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ': ' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) ;
    public final EObject ruleCaso() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operador_0_0 = null;

        EObject lv_sentencias_2_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_devuelve_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3728:28: ( ( ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ': ' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3729:1: ( ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ': ' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3729:1: ( ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ': ' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3729:2: ( (lv_operador_0_0= ruleOperador ) ) otherlv_1= ': ' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )?
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3729:2: ( (lv_operador_0_0= ruleOperador ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3730:1: (lv_operador_0_0= ruleOperador )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3730:1: (lv_operador_0_0= ruleOperador )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3731:3: lv_operador_0_0= ruleOperador
            {
             
            	        newCompositeNode(grammarAccess.getCasoAccess().getOperadorOperadorParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleCaso8217);
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

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleCaso8229); 

                	newLeafNode(otherlv_1, grammarAccess.getCasoAccess().getColonSpaceKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3751:1: ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3751:2: ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3751:2: ( (lv_sentencias_2_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3752:1: (lv_sentencias_2_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3752:1: (lv_sentencias_2_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3753:3: lv_sentencias_2_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso8251);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3769:2: ( (lv_sentencias_3_0= ruleSentencias ) )*
                    loop57:
                    do {
                        int alt57=2;
                        alt57 = dfa57.predict(input);
                        switch (alt57) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3770:1: (lv_sentencias_3_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3770:1: (lv_sentencias_3_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3771:3: lv_sentencias_3_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso8272);
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
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3787:5: ( (lv_devuelve_4_0= ruleDevolver ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==89) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3788:1: (lv_devuelve_4_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3788:1: (lv_devuelve_4_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3789:3: lv_devuelve_4_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getDevuelveDevolverParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleCaso8296);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3813:1: entryRulesegun returns [EObject current=null] : iv_rulesegun= rulesegun EOF ;
    public final EObject entryRulesegun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesegun = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3814:2: (iv_rulesegun= rulesegun EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3815:2: iv_rulesegun= rulesegun EOF
            {
             newCompositeNode(grammarAccess.getSegunRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesegun_in_entryRulesegun8333);
            iv_rulesegun=rulesegun();

            state._fsp--;

             current =iv_rulesegun; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesegun8343); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3822:1: rulesegun returns [EObject current=null] : (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3825:28: ( (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3826:1: (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3826:1: (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3826:3: otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulevalor ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun'
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_64_in_rulesegun8380); 

                	newLeafNode(otherlv_0, grammarAccess.getSegunAccess().getSegun_seaKeyword_0());
                
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulesegun8392); 

                	newLeafNode(otherlv_1, grammarAccess.getSegunAccess().getLeftParenthesisKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3834:1: ( (lv_valor_2_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3835:1: (lv_valor_2_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3835:1: (lv_valor_2_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3836:3: lv_valor_2_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getSegunAccess().getValorValorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_rulesegun8413);
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

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulesegun8425); 

                	newLeafNode(otherlv_3, grammarAccess.getSegunAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,57,FollowSets000.FOLLOW_57_in_rulesegun8437); 

                	newLeafNode(otherlv_4, grammarAccess.getSegunAccess().getHacerKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3860:1: ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_CAR && LA61_0<=RULE_INT)||LA61_0==36||LA61_0==72||(LA61_0>=75 && LA61_0<=76)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3860:2: ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3860:2: ( (lv_caso_5_0= ruleCaso ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3861:1: (lv_caso_5_0= ruleCaso )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3861:1: (lv_caso_5_0= ruleCaso )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3862:3: lv_caso_5_0= ruleCaso
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun8459);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3878:2: ( (lv_caso_6_0= ruleCaso ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( ((LA60_0>=RULE_CAR && LA60_0<=RULE_INT)||LA60_0==36||LA60_0==72||(LA60_0>=75 && LA60_0<=76)) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3879:1: (lv_caso_6_0= ruleCaso )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3879:1: (lv_caso_6_0= ruleCaso )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3880:3: lv_caso_6_0= ruleCaso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun8480);
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
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,65,FollowSets000.FOLLOW_65_in_rulesegun8495); 

                	newLeafNode(otherlv_7, grammarAccess.getSegunAccess().getEn_otro_casoKeyword_6());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3900:1: ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_STRING && LA63_0<=RULE_ID)||(LA63_0>=20 && LA63_0<=21)||(LA63_0>=51 && LA63_0<=53)||LA63_0==56||LA63_0==59||LA63_0==61||LA63_0==64) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3900:2: ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3900:2: ( (lv_sentencias_8_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3901:1: (lv_sentencias_8_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3901:1: (lv_sentencias_8_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3902:3: lv_sentencias_8_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun8517);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3918:2: ( (lv_sentencias_9_0= ruleSentencias ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( ((LA62_0>=RULE_STRING && LA62_0<=RULE_ID)||(LA62_0>=20 && LA62_0<=21)||(LA62_0>=51 && LA62_0<=53)||LA62_0==56||LA62_0==59||LA62_0==61||LA62_0==64) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3919:1: (lv_sentencias_9_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3919:1: (lv_sentencias_9_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3920:3: lv_sentencias_9_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun8538);
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
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3936:5: ( (lv_devuelve_10_0= ruleDevolver ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==89) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3937:1: (lv_devuelve_10_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3937:1: (lv_devuelve_10_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3938:3: lv_devuelve_10_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getDevuelveDevolverParserRuleCall_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_rulesegun8562);
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

            otherlv_11=(Token)match(input,66,FollowSets000.FOLLOW_66_in_rulesegun8575); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3966:1: entryRuleincremento returns [EObject current=null] : iv_ruleincremento= ruleincremento EOF ;
    public final EObject entryRuleincremento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleincremento = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3967:2: (iv_ruleincremento= ruleincremento EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3968:2: iv_ruleincremento= ruleincremento EOF
            {
             newCompositeNode(grammarAccess.getIncrementoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleincremento_in_entryRuleincremento8611);
            iv_ruleincremento=ruleincremento();

            state._fsp--;

             current =iv_ruleincremento; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleincremento8621); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3975:1: ruleincremento returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) ) ) ;
    public final EObject ruleincremento() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_ssigno_1_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3978:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3979:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3979:1: ( ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3979:2: ( (lv_nombre_0_0= ruleEString ) ) ( (lv_ssigno_1_0= ruleinc ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3979:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3980:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3980:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3981:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIncrementoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleincremento8667);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3997:2: ( (lv_ssigno_1_0= ruleinc ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3998:1: (lv_ssigno_1_0= ruleinc )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3998:1: (lv_ssigno_1_0= ruleinc )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3999:3: lv_ssigno_1_0= ruleinc
            {
             
            	        newCompositeNode(grammarAccess.getIncrementoAccess().getSsignoIncParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_ruleincremento8688);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4023:1: entryRuleunaria returns [EObject current=null] : iv_ruleunaria= ruleunaria EOF ;
    public final EObject entryRuleunaria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunaria = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4024:2: (iv_ruleunaria= ruleunaria EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4025:2: iv_ruleunaria= ruleunaria EOF
            {
             newCompositeNode(grammarAccess.getUnariaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleunaria_in_entryRuleunaria8724);
            iv_ruleunaria=ruleunaria();

            state._fsp--;

             current =iv_ruleunaria; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleunaria8734); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4032:1: ruleunaria returns [EObject current=null] : (otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')' ) ;
    public final EObject ruleunaria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_ssigno_1_0 = null;

        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4035:28: ( (otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4036:1: (otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4036:1: (otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4036:3: otherlv_0= '(' ( (lv_ssigno_1_0= ruleinc ) ) ( (lv_variable_2_0= rulevalor ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleunaria8771); 

                	newLeafNode(otherlv_0, grammarAccess.getUnariaAccess().getLeftParenthesisKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4040:1: ( (lv_ssigno_1_0= ruleinc ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4041:1: (lv_ssigno_1_0= ruleinc )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4041:1: (lv_ssigno_1_0= ruleinc )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4042:3: lv_ssigno_1_0= ruleinc
            {
             
            	        newCompositeNode(grammarAccess.getUnariaAccess().getSsignoIncParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_ruleunaria8792);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4058:2: ( (lv_variable_2_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4059:1: (lv_variable_2_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4059:1: (lv_variable_2_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4060:3: lv_variable_2_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getUnariaAccess().getVariableValorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleunaria8813);
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

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleunaria8825); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4088:1: entryRuleTipoVariable returns [String current=null] : iv_ruleTipoVariable= ruleTipoVariable EOF ;
    public final String entryRuleTipoVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoVariable = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4089:2: (iv_ruleTipoVariable= ruleTipoVariable EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4090:2: iv_ruleTipoVariable= ruleTipoVariable EOF
            {
             newCompositeNode(grammarAccess.getTipoVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable8862);
            iv_ruleTipoVariable=ruleTipoVariable();

            state._fsp--;

             current =iv_ruleTipoVariable.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoVariable8873); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4097:1: ruleTipoVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' ) ;
    public final AntlrDatatypeRuleToken ruleTipoVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4100:28: ( (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4101:1: (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4101:1: (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' )
            int alt65=5;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt65=1;
                }
                break;
            case 68:
                {
                alt65=2;
                }
                break;
            case 69:
                {
                alt65=3;
                }
                break;
            case 70:
                {
                alt65=4;
                }
                break;
            case 71:
                {
                alt65=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4102:2: kw= 'entero'
                    {
                    kw=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleTipoVariable8911); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getEnteroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4109:2: kw= 'caracter'
                    {
                    kw=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleTipoVariable8930); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getCaracterKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4116:2: kw= 'real'
                    {
                    kw=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleTipoVariable8949); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getRealKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4123:2: kw= 'logico'
                    {
                    kw=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleTipoVariable8968); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getLogicoKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4130:2: kw= 'cadena'
                    {
                    kw=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleTipoVariable8987); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4143:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4144:2: (iv_ruleVariable= ruleVariable EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4145:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable9027);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable9037); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4152:1: ruleVariable returns [EObject current=null] : ( (lv_nombre_0_0= ruleEString ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4155:28: ( ( (lv_nombre_0_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4156:1: ( (lv_nombre_0_0= ruleEString ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4156:1: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4157:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4157:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4158:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNombreEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable9082);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4182:1: entryRuleVariableID returns [EObject current=null] : iv_ruleVariableID= ruleVariableID EOF ;
    public final EObject entryRuleVariableID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableID = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4183:2: (iv_ruleVariableID= ruleVariableID EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4184:2: iv_ruleVariableID= ruleVariableID EOF
            {
             newCompositeNode(grammarAccess.getVariableIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_entryRuleVariableID9117);
            iv_ruleVariableID=ruleVariableID();

            state._fsp--;

             current =iv_ruleVariableID; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableID9127); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4191:1: ruleVariableID returns [EObject current=null] : ( (lv_nombre_0_0= ruleEString ) ) ;
    public final EObject ruleVariableID() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4194:28: ( ( (lv_nombre_0_0= ruleEString ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4195:1: ( (lv_nombre_0_0= ruleEString ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4195:1: ( (lv_nombre_0_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4196:1: (lv_nombre_0_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4196:1: (lv_nombre_0_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4197:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableIDAccess().getNombreEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariableID9172);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4221:1: entryRuleConstCadena returns [EObject current=null] : iv_ruleConstCadena= ruleConstCadena EOF ;
    public final EObject entryRuleConstCadena() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstCadena = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4222:2: (iv_ruleConstCadena= ruleConstCadena EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4223:2: iv_ruleConstCadena= ruleConstCadena EOF
            {
             newCompositeNode(grammarAccess.getConstCadenaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstCadena_in_entryRuleConstCadena9207);
            iv_ruleConstCadena=ruleConstCadena();

            state._fsp--;

             current =iv_ruleConstCadena; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstCadena9217); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4230:1: ruleConstCadena returns [EObject current=null] : ( (lv_contenido_0_0= RULE_CAD ) ) ;
    public final EObject ruleConstCadena() throws RecognitionException {
        EObject current = null;

        Token lv_contenido_0_0=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4233:28: ( ( (lv_contenido_0_0= RULE_CAD ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4234:1: ( (lv_contenido_0_0= RULE_CAD ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4234:1: ( (lv_contenido_0_0= RULE_CAD ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4235:1: (lv_contenido_0_0= RULE_CAD )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4235:1: (lv_contenido_0_0= RULE_CAD )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4236:3: lv_contenido_0_0= RULE_CAD
            {
            lv_contenido_0_0=(Token)match(input,RULE_CAD,FollowSets000.FOLLOW_RULE_CAD_in_ruleConstCadena9258); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4260:1: entryRuleNumeroEntero returns [EObject current=null] : iv_ruleNumeroEntero= ruleNumeroEntero EOF ;
    public final EObject entryRuleNumeroEntero() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeroEntero = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4261:2: (iv_ruleNumeroEntero= ruleNumeroEntero EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4262:2: iv_ruleNumeroEntero= ruleNumeroEntero EOF
            {
             newCompositeNode(grammarAccess.getNumeroEnteroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumeroEntero_in_entryRuleNumeroEntero9298);
            iv_ruleNumeroEntero=ruleNumeroEntero();

            state._fsp--;

             current =iv_ruleNumeroEntero; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumeroEntero9308); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4269:1: ruleNumeroEntero returns [EObject current=null] : ( (lv_valor_0_0= ruleEInt ) ) ;
    public final EObject ruleNumeroEntero() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4272:28: ( ( (lv_valor_0_0= ruleEInt ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4273:1: ( (lv_valor_0_0= ruleEInt ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4273:1: ( (lv_valor_0_0= ruleEInt ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4274:1: (lv_valor_0_0= ruleEInt )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4274:1: (lv_valor_0_0= ruleEInt )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4275:3: lv_valor_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getNumeroEnteroAccess().getValorEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumeroEntero9353);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4299:1: entryRuleNumeroDecimal returns [EObject current=null] : iv_ruleNumeroDecimal= ruleNumeroDecimal EOF ;
    public final EObject entryRuleNumeroDecimal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeroDecimal = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4300:2: (iv_ruleNumeroDecimal= ruleNumeroDecimal EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4301:2: iv_ruleNumeroDecimal= ruleNumeroDecimal EOF
            {
             newCompositeNode(grammarAccess.getNumeroDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumeroDecimal_in_entryRuleNumeroDecimal9388);
            iv_ruleNumeroDecimal=ruleNumeroDecimal();

            state._fsp--;

             current =iv_ruleNumeroDecimal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumeroDecimal9398); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4308:1: ruleNumeroDecimal returns [EObject current=null] : ( (lv_valor_0_0= ruleEFloat ) ) ;
    public final EObject ruleNumeroDecimal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4311:28: ( ( (lv_valor_0_0= ruleEFloat ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4312:1: ( (lv_valor_0_0= ruleEFloat ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4312:1: ( (lv_valor_0_0= ruleEFloat ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4313:1: (lv_valor_0_0= ruleEFloat )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4313:1: (lv_valor_0_0= ruleEFloat )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4314:3: lv_valor_0_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getNumeroDecimalAccess().getValorEFloatParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleNumeroDecimal9443);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4338:1: entryRuleValorBooleano returns [EObject current=null] : iv_ruleValorBooleano= ruleValorBooleano EOF ;
    public final EObject entryRuleValorBooleano() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorBooleano = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4339:2: (iv_ruleValorBooleano= ruleValorBooleano EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4340:2: iv_ruleValorBooleano= ruleValorBooleano EOF
            {
             newCompositeNode(grammarAccess.getValorBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValorBooleano_in_entryRuleValorBooleano9478);
            iv_ruleValorBooleano=ruleValorBooleano();

            state._fsp--;

             current =iv_ruleValorBooleano; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValorBooleano9488); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4347:1: ruleValorBooleano returns [EObject current=null] : ( (lv_valor_0_0= rulebooleano ) ) ;
    public final EObject ruleValorBooleano() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4350:28: ( ( (lv_valor_0_0= rulebooleano ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4351:1: ( (lv_valor_0_0= rulebooleano ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4351:1: ( (lv_valor_0_0= rulebooleano ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4352:1: (lv_valor_0_0= rulebooleano )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4352:1: (lv_valor_0_0= rulebooleano )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4353:3: lv_valor_0_0= rulebooleano
            {
             
            	        newCompositeNode(grammarAccess.getValorBooleanoAccess().getValorBooleanoParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulebooleano_in_ruleValorBooleano9533);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4377:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4378:2: (iv_ruleEInt= ruleEInt EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4379:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt9569);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt9580); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4386:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4389:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4390:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4390:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4390:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4390:2: (kw= '-' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==72) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4391:2: kw= '-'
                    {
                    kw=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleEInt9619); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt9636); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4411:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4412:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4413:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat9682);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat9693); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4420:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4423:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4424:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4424:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4424:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4424:2: (kw= '-' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==72) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4425:2: kw= '-'
                    {
                    kw=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleEFloat9732); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4430:3: (this_INT_1= RULE_INT )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_INT) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4430:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat9750); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEFloat9770); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat9785); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4450:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=73 && LA71_0<=74)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4450:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4450:2: (kw= 'E' | kw= 'e' )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==73) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==74) ) {
                        alt69=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4451:2: kw= 'E'
                            {
                            kw=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleEFloat9805); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4458:2: kw= 'e'
                            {
                            kw=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleEFloat9824); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4463:2: (kw= '-' )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==72) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4464:2: kw= '-'
                            {
                            kw=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleEFloat9839); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat9856); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4484:1: entryRulebooleano returns [String current=null] : iv_rulebooleano= rulebooleano EOF ;
    public final String entryRulebooleano() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebooleano = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4485:2: (iv_rulebooleano= rulebooleano EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4486:2: iv_rulebooleano= rulebooleano EOF
            {
             newCompositeNode(grammarAccess.getBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleano_in_entryRulebooleano9904);
            iv_rulebooleano=rulebooleano();

            state._fsp--;

             current =iv_rulebooleano.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulebooleano9915); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4493:1: rulebooleano returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'verdadero' | kw= 'falso' ) ;
    public final AntlrDatatypeRuleToken rulebooleano() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4496:28: ( (kw= 'verdadero' | kw= 'falso' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4497:1: (kw= 'verdadero' | kw= 'falso' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4497:1: (kw= 'verdadero' | kw= 'falso' )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==75) ) {
                alt72=1;
            }
            else if ( (LA72_0==76) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4498:2: kw= 'verdadero'
                    {
                    kw=(Token)match(input,75,FollowSets000.FOLLOW_75_in_rulebooleano9953); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanoAccess().getVerdaderoKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4505:2: kw= 'falso'
                    {
                    kw=(Token)match(input,76,FollowSets000.FOLLOW_76_in_rulebooleano9972); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4518:1: entryRuleoperacion returns [EObject current=null] : iv_ruleoperacion= ruleoperacion EOF ;
    public final EObject entryRuleoperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperacion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4519:2: (iv_ruleoperacion= ruleoperacion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4520:2: iv_ruleoperacion= ruleoperacion EOF
            {
             newCompositeNode(grammarAccess.getOperacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_entryRuleoperacion10012);
            iv_ruleoperacion=ruleoperacion();

            state._fsp--;

             current =iv_ruleoperacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperacion10022); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4527:1: ruleoperacion returns [EObject current=null] : (otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')' ) ;
    public final EObject ruleoperacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_op_izq_1_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_op_der_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4530:28: ( (otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4531:1: (otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4531:1: (otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4531:3: otherlv_0= '(' ( (lv_op_izq_1_0= ruleoperando_izq ) ) ( (lv_signo_op_2_0= rulesigno ) ) ( (lv_op_der_3_0= ruleoperando_der ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleoperacion10059); 

                	newLeafNode(otherlv_0, grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4535:1: ( (lv_op_izq_1_0= ruleoperando_izq ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4536:1: (lv_op_izq_1_0= ruleoperando_izq )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4536:1: (lv_op_izq_1_0= ruleoperando_izq )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4537:3: lv_op_izq_1_0= ruleoperando_izq
            {
             
            	        newCompositeNode(grammarAccess.getOperacionAccess().getOp_izqOperando_izqParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperando_izq_in_ruleoperacion10080);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4553:2: ( (lv_signo_op_2_0= rulesigno ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4554:1: (lv_signo_op_2_0= rulesigno )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4554:1: (lv_signo_op_2_0= rulesigno )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4555:3: lv_signo_op_2_0= rulesigno
            {
             
            	        newCompositeNode(grammarAccess.getOperacionAccess().getSigno_opSignoParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulesigno_in_ruleoperacion10101);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4571:2: ( (lv_op_der_3_0= ruleoperando_der ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4572:1: (lv_op_der_3_0= ruleoperando_der )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4572:1: (lv_op_der_3_0= ruleoperando_der )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4573:3: lv_op_der_3_0= ruleoperando_der
            {
             
            	        newCompositeNode(grammarAccess.getOperacionAccess().getOp_derOperando_derParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperando_der_in_ruleoperacion10122);
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

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleoperacion10134); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4601:1: entryRulesigno returns [String current=null] : iv_rulesigno= rulesigno EOF ;
    public final String entryRulesigno() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesigno = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4602:2: (iv_rulesigno= rulesigno EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4603:2: iv_rulesigno= rulesigno EOF
            {
             newCompositeNode(grammarAccess.getSignoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesigno_in_entryRulesigno10171);
            iv_rulesigno=rulesigno();

            state._fsp--;

             current =iv_rulesigno.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesigno10182); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4610:1: rulesigno returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= 'y' | kw= 'o' | kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken rulesigno() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4613:28: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= 'y' | kw= 'o' | kw= '==' | kw= '!=' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4614:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= 'y' | kw= 'o' | kw= '==' | kw= '!=' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4614:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= 'y' | kw= 'o' | kw= '==' | kw= '!=' )
            int alt73=12;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt73=1;
                }
                break;
            case 72:
                {
                alt73=2;
                }
                break;
            case 78:
                {
                alt73=3;
                }
                break;
            case 79:
                {
                alt73=4;
                }
                break;
            case 80:
                {
                alt73=5;
                }
                break;
            case 81:
                {
                alt73=6;
                }
                break;
            case 82:
                {
                alt73=7;
                }
                break;
            case 83:
                {
                alt73=8;
                }
                break;
            case 84:
                {
                alt73=9;
                }
                break;
            case 85:
                {
                alt73=10;
                }
                break;
            case 86:
                {
                alt73=11;
                }
                break;
            case 87:
                {
                alt73=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4615:2: kw= '+'
                    {
                    kw=(Token)match(input,77,FollowSets000.FOLLOW_77_in_rulesigno10220); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4622:2: kw= '-'
                    {
                    kw=(Token)match(input,72,FollowSets000.FOLLOW_72_in_rulesigno10239); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4629:2: kw= '*'
                    {
                    kw=(Token)match(input,78,FollowSets000.FOLLOW_78_in_rulesigno10258); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getAsteriskKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4636:2: kw= '/'
                    {
                    kw=(Token)match(input,79,FollowSets000.FOLLOW_79_in_rulesigno10277); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getSolidusKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4643:2: kw= '<'
                    {
                    kw=(Token)match(input,80,FollowSets000.FOLLOW_80_in_rulesigno10296); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getLessThanSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4650:2: kw= '>'
                    {
                    kw=(Token)match(input,81,FollowSets000.FOLLOW_81_in_rulesigno10315); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getGreaterThanSignKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4657:2: kw= '>='
                    {
                    kw=(Token)match(input,82,FollowSets000.FOLLOW_82_in_rulesigno10334); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4664:2: kw= '<='
                    {
                    kw=(Token)match(input,83,FollowSets000.FOLLOW_83_in_rulesigno10353); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getLessThanSignEqualsSignKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4671:2: kw= 'y'
                    {
                    kw=(Token)match(input,84,FollowSets000.FOLLOW_84_in_rulesigno10372); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getYKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4678:2: kw= 'o'
                    {
                    kw=(Token)match(input,85,FollowSets000.FOLLOW_85_in_rulesigno10391); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getOKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4685:2: kw= '=='
                    {
                    kw=(Token)match(input,86,FollowSets000.FOLLOW_86_in_rulesigno10410); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoAccess().getEqualsSignEqualsSignKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4692:2: kw= '!='
                    {
                    kw=(Token)match(input,87,FollowSets000.FOLLOW_87_in_rulesigno10429); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4705:1: entryRuleoperando_izq returns [EObject current=null] : iv_ruleoperando_izq= ruleoperando_izq EOF ;
    public final EObject entryRuleoperando_izq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperando_izq = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4706:2: (iv_ruleoperando_izq= ruleoperando_izq EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4707:2: iv_ruleoperando_izq= ruleoperando_izq EOF
            {
             newCompositeNode(grammarAccess.getOperando_izqRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_izq_in_entryRuleoperando_izq10469);
            iv_ruleoperando_izq=ruleoperando_izq();

            state._fsp--;

             current =iv_ruleoperando_izq; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperando_izq10479); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4714:1: ruleoperando_izq returns [EObject current=null] : ( (lv_oper_izq_0_0= rulevalor ) ) ;
    public final EObject ruleoperando_izq() throws RecognitionException {
        EObject current = null;

        EObject lv_oper_izq_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4717:28: ( ( (lv_oper_izq_0_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4718:1: ( (lv_oper_izq_0_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4718:1: ( (lv_oper_izq_0_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4719:1: (lv_oper_izq_0_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4719:1: (lv_oper_izq_0_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4720:3: lv_oper_izq_0_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getOperando_izqAccess().getOper_izqValorParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleoperando_izq10524);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4744:1: entryRuleoperando_der returns [EObject current=null] : iv_ruleoperando_der= ruleoperando_der EOF ;
    public final EObject entryRuleoperando_der() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperando_der = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4745:2: (iv_ruleoperando_der= ruleoperando_der EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4746:2: iv_ruleoperando_der= ruleoperando_der EOF
            {
             newCompositeNode(grammarAccess.getOperando_derRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperando_der_in_entryRuleoperando_der10559);
            iv_ruleoperando_der=ruleoperando_der();

            state._fsp--;

             current =iv_ruleoperando_der; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperando_der10569); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4753:1: ruleoperando_der returns [EObject current=null] : ( (lv_oper_der_0_0= rulevalor ) ) ;
    public final EObject ruleoperando_der() throws RecognitionException {
        EObject current = null;

        EObject lv_oper_der_0_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4756:28: ( ( (lv_oper_der_0_0= rulevalor ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4757:1: ( (lv_oper_der_0_0= rulevalor ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4757:1: ( (lv_oper_der_0_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4758:1: (lv_oper_der_0_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4758:1: (lv_oper_der_0_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4759:3: lv_oper_der_0_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getOperando_derAccess().getOper_derValorParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleoperando_der10614);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4783:1: entryRuleSino returns [EObject current=null] : iv_ruleSino= ruleSino EOF ;
    public final EObject entryRuleSino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSino = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4784:2: (iv_ruleSino= ruleSino EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4785:2: iv_ruleSino= ruleSino EOF
            {
             newCompositeNode(grammarAccess.getSinoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSino_in_entryRuleSino10649);
            iv_ruleSino=ruleSino();

            state._fsp--;

             current =iv_ruleSino; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSino10659); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4792:1: ruleSino returns [EObject current=null] : ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) ;
    public final EObject ruleSino() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sentencias_2_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_devuelve_4_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4795:28: ( ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4796:1: ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4796:1: ( () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4796:2: () otherlv_1= 'sino' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )?
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4796:2: ()
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4797:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSinoAccess().getSinoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleSino10705); 

                	newLeafNode(otherlv_1, grammarAccess.getSinoAccess().getSinoKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4806:1: ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=RULE_STRING && LA75_0<=RULE_ID)||(LA75_0>=20 && LA75_0<=21)||(LA75_0>=51 && LA75_0<=53)||LA75_0==56||LA75_0==59||LA75_0==61||LA75_0==64) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4806:2: ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4806:2: ( (lv_sentencias_2_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4807:1: (lv_sentencias_2_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4807:1: (lv_sentencias_2_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4808:3: lv_sentencias_2_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino10727);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4824:2: ( (lv_sentencias_3_0= ruleSentencias ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( ((LA74_0>=RULE_STRING && LA74_0<=RULE_ID)||(LA74_0>=20 && LA74_0<=21)||(LA74_0>=51 && LA74_0<=53)||LA74_0==56||LA74_0==59||LA74_0==61||LA74_0==64) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4825:1: (lv_sentencias_3_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4825:1: (lv_sentencias_3_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4826:3: lv_sentencias_3_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino10748);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4842:5: ( (lv_devuelve_4_0= ruleDevolver ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==89) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4843:1: (lv_devuelve_4_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4843:1: (lv_devuelve_4_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4844:3: lv_devuelve_4_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getDevuelveDevolverParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSino10772);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4868:1: entryRuleDevolver returns [EObject current=null] : iv_ruleDevolver= ruleDevolver EOF ;
    public final EObject entryRuleDevolver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevolver = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4869:2: (iv_ruleDevolver= ruleDevolver EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4870:2: iv_ruleDevolver= ruleDevolver EOF
            {
             newCompositeNode(grammarAccess.getDevolverRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_entryRuleDevolver10809);
            iv_ruleDevolver=ruleDevolver();

            state._fsp--;

             current =iv_ruleDevolver; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDevolver10819); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4877:1: ruleDevolver returns [EObject current=null] : ( () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')' ) ;
    public final EObject ruleDevolver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_devuelve_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4880:28: ( ( () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4881:1: ( () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4881:1: ( () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4881:2: () otherlv_1= 'devolver' otherlv_2= '(' ( (lv_devuelve_3_0= rulevalor ) ) otherlv_4= ')'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4881:2: ()
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4882:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDevolverAccess().getDevolverAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleDevolver10865); 

                	newLeafNode(otherlv_1, grammarAccess.getDevolverAccess().getDevolverKeyword_1());
                
            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDevolver10877); 

                	newLeafNode(otherlv_2, grammarAccess.getDevolverAccess().getLeftParenthesisKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4895:1: ( (lv_devuelve_3_0= rulevalor ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4896:1: (lv_devuelve_3_0= rulevalor )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4896:1: (lv_devuelve_3_0= rulevalor )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4897:3: lv_devuelve_3_0= rulevalor
            {
             
            	        newCompositeNode(grammarAccess.getDevolverAccess().getDevuelveValorParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulevalor_in_ruleDevolver10898);
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

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDevolver10910); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4925:1: entryRuleinc returns [String current=null] : iv_ruleinc= ruleinc EOF ;
    public final String entryRuleinc() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinc = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4926:2: (iv_ruleinc= ruleinc EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4927:2: iv_ruleinc= ruleinc EOF
            {
             newCompositeNode(grammarAccess.getIncRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleinc_in_entryRuleinc10947);
            iv_ruleinc=ruleinc();

            state._fsp--;

             current =iv_ruleinc.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleinc10958); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4934:1: ruleinc returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '++' | kw= '--' | kw= 'no' ) ;
    public final AntlrDatatypeRuleToken ruleinc() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4937:28: ( (kw= '++' | kw= '--' | kw= 'no' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4938:1: (kw= '++' | kw= '--' | kw= 'no' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4938:1: (kw= '++' | kw= '--' | kw= 'no' )
            int alt77=3;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt77=1;
                }
                break;
            case 91:
                {
                alt77=2;
                }
                break;
            case 92:
                {
                alt77=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4939:2: kw= '++'
                    {
                    kw=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleinc10996); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIncAccess().getPlusSignPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4946:2: kw= '--'
                    {
                    kw=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleinc11015); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIncAccess().getHyphenMinusHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4953:2: kw= 'no'
                    {
                    kw=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleinc11034); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4966:1: entryRuleParametroFuncion returns [EObject current=null] : iv_ruleParametroFuncion= ruleParametroFuncion EOF ;
    public final EObject entryRuleParametroFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametroFuncion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4967:2: (iv_ruleParametroFuncion= ruleParametroFuncion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4968:2: iv_ruleParametroFuncion= ruleParametroFuncion EOF
            {
             newCompositeNode(grammarAccess.getParametroFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion11074);
            iv_ruleParametroFuncion=ruleParametroFuncion();

            state._fsp--;

             current =iv_ruleParametroFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametroFuncion11084); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4975:1: ruleParametroFuncion returns [EObject current=null] : ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) ) ;
    public final EObject ruleParametroFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_paso_0_0 = null;

        EObject lv_tipo_1_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4978:28: ( ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4979:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4979:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4979:2: ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4979:2: ( (lv_paso_0_0= ruleTipoPaso ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4980:1: (lv_paso_0_0= ruleTipoPaso )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4980:1: (lv_paso_0_0= ruleTipoPaso )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4981:3: lv_paso_0_0= ruleTipoPaso
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_ruleParametroFuncion11130);
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

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4997:2: ( (lv_tipo_1_0= ruleTipo ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4998:1: (lv_tipo_1_0= ruleTipo )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4998:1: (lv_tipo_1_0= ruleTipo )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4999:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleParametroFuncion11151);
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

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleParametroFuncion11163); 

                	newLeafNode(otherlv_2, grammarAccess.getParametroFuncionAccess().getColonSpaceKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5019:1: ( (lv_variable_3_0= ruleVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5020:1: (lv_variable_3_0= ruleVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5020:1: (lv_variable_3_0= ruleVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5021:3: lv_variable_3_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleParametroFuncion11184);
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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5045:1: entryRuleFuncion returns [EObject current=null] : iv_ruleFuncion= ruleFuncion EOF ;
    public final EObject entryRuleFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncion = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5046:2: (iv_ruleFuncion= ruleFuncion EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5047:2: iv_ruleFuncion= ruleFuncion EOF
            {
             newCompositeNode(grammarAccess.getFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_entryRuleFuncion11220);
            iv_ruleFuncion=ruleFuncion();

            state._fsp--;

             current =iv_ruleFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncion11230); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5054:1: ruleFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5057:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5058:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5058:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5058:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'tipo' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'inicio' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) )? otherlv_17= 'fin_funcion'
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5058:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5059:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5059:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5060:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleFuncion11276);
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

            otherlv_1=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleFuncion11288); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionAccess().getFuncionKeyword_1());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5080:1: ( (lv_nombre_2_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5081:1: (lv_nombre_2_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5081:1: (lv_nombre_2_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5082:3: lv_nombre_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getNombreEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFuncion11309);
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

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFuncion11321); 

                	newLeafNode(otherlv_3, grammarAccess.getFuncionAccess().getLeftParenthesisKeyword_3());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5102:1: ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==73||(LA79_0>=97 && LA79_0<=98)) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5102:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5102:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5103:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5103:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5104:3: lv_parametrofuncion_4_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion11343);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5120:2: (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==18) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5120:4: otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFuncion11356); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getFuncionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5124:1: ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5125:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5125:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5126:3: lv_parametrofuncion_6_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion11377);
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
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFuncion11393); 

                	newLeafNode(otherlv_7, grammarAccess.getFuncionAccess().getRightParenthesisKeyword_5());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5146:1: (otherlv_8= 'const' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==14) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5146:3: otherlv_8= 'const'
                    {
                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFuncion11406); 

                        	newLeafNode(otherlv_8, grammarAccess.getFuncionAccess().getConstKeyword_6());
                        

                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5150:3: (otherlv_9= 'tipo' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==15) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5150:5: otherlv_9= 'tipo'
                    {
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFuncion11421); 

                        	newLeafNode(otherlv_9, grammarAccess.getFuncionAccess().getTipoKeyword_7());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleFuncion11435); 

                	newLeafNode(otherlv_10, grammarAccess.getFuncionAccess().getVarKeyword_8());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5158:1: ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=RULE_STRING && LA83_0<=RULE_ID)||(LA83_0>=67 && LA83_0<=71)) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5158:2: ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5158:2: ( (lv_declaracion_11_0= ruleDeclaracion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5159:1: (lv_declaracion_11_0= ruleDeclaracion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5159:1: (lv_declaracion_11_0= ruleDeclaracion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5160:3: lv_declaracion_11_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_9_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion11457);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5176:2: ( (lv_declaracion_12_0= ruleDeclaracion ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( ((LA82_0>=RULE_STRING && LA82_0<=RULE_ID)||(LA82_0>=67 && LA82_0<=71)) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5177:1: (lv_declaracion_12_0= ruleDeclaracion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5177:1: (lv_declaracion_12_0= ruleDeclaracion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5178:3: lv_declaracion_12_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion11478);
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
                    	    break loop82;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleFuncion11493); 

                	newLeafNode(otherlv_13, grammarAccess.getFuncionAccess().getInicioKeyword_10());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5198:1: ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=RULE_STRING && LA85_0<=RULE_ID)||(LA85_0>=20 && LA85_0<=21)||(LA85_0>=51 && LA85_0<=53)||LA85_0==56||LA85_0==59||LA85_0==61||LA85_0==64) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5198:2: ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5198:2: ( (lv_sentencias_14_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5199:1: (lv_sentencias_14_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5199:1: (lv_sentencias_14_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5200:3: lv_sentencias_14_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_11_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion11515);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5216:2: ( (lv_sentencias_15_0= ruleSentencias ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( ((LA84_0>=RULE_STRING && LA84_0<=RULE_ID)||(LA84_0>=20 && LA84_0<=21)||(LA84_0>=51 && LA84_0<=53)||LA84_0==56||LA84_0==59||LA84_0==61||LA84_0==64) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5217:1: (lv_sentencias_15_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5217:1: (lv_sentencias_15_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5218:3: lv_sentencias_15_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion11536);
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
                    	    break loop84;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5234:5: ( (lv_devuelve_16_0= ruleDevolver ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==89) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5235:1: (lv_devuelve_16_0= ruleDevolver )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5235:1: (lv_devuelve_16_0= ruleDevolver )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5236:3: lv_devuelve_16_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getDevuelveDevolverParserRuleCall_12_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleFuncion11560);
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

            otherlv_17=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleFuncion11573); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5264:1: entryRuleProcedimiento returns [EObject current=null] : iv_ruleProcedimiento= ruleProcedimiento EOF ;
    public final EObject entryRuleProcedimiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedimiento = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5265:2: (iv_ruleProcedimiento= ruleProcedimiento EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5266:2: iv_ruleProcedimiento= ruleProcedimiento EOF
            {
             newCompositeNode(grammarAccess.getProcedimientoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento11609);
            iv_ruleProcedimiento=ruleProcedimiento();

            state._fsp--;

             current =iv_ruleProcedimiento; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcedimiento11619); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5273:1: ruleProcedimiento returns [EObject current=null] : (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' ) ;
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
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5276:28: ( (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5277:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5277:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento' )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5277:3: otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'tipo' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'inicio' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'fin_procedimiento'
            {
            otherlv_0=(Token)match(input,95,FollowSets000.FOLLOW_95_in_ruleProcedimiento11656); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedimientoAccess().getProcedimientoKeyword_0());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5281:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5282:1: (lv_nombre_1_0= ruleEString )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5282:1: (lv_nombre_1_0= ruleEString )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5283:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProcedimientoAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcedimiento11677);
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

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProcedimiento11689); 

                	newLeafNode(otherlv_2, grammarAccess.getProcedimientoAccess().getLeftParenthesisKeyword_2());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5303:1: ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==73||(LA88_0>=97 && LA88_0<=98)) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5303:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5303:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5304:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5304:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5305:3: lv_parametrofuncion_3_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento11711);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5321:2: (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==18) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5321:4: otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProcedimiento11724); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getProcedimientoAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5325:1: ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5326:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5326:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5327:3: lv_parametrofuncion_5_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento11745);
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
                    	    break loop87;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProcedimiento11761); 

                	newLeafNode(otherlv_6, grammarAccess.getProcedimientoAccess().getRightParenthesisKeyword_4());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5347:1: (otherlv_7= 'const' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==14) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5347:3: otherlv_7= 'const'
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProcedimiento11774); 

                        	newLeafNode(otherlv_7, grammarAccess.getProcedimientoAccess().getConstKeyword_5());
                        

                    }
                    break;

            }

            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5351:3: (otherlv_8= 'tipo' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==15) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5351:5: otherlv_8= 'tipo'
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProcedimiento11789); 

                        	newLeafNode(otherlv_8, grammarAccess.getProcedimientoAccess().getTipoKeyword_6());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleProcedimiento11803); 

                	newLeafNode(otherlv_9, grammarAccess.getProcedimientoAccess().getVarKeyword_7());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5359:1: ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( ((LA92_0>=RULE_STRING && LA92_0<=RULE_ID)||(LA92_0>=67 && LA92_0<=71)) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5359:2: ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5359:2: ( (lv_declaracion_10_0= ruleDeclaracion ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5360:1: (lv_declaracion_10_0= ruleDeclaracion )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5360:1: (lv_declaracion_10_0= ruleDeclaracion )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5361:3: lv_declaracion_10_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_8_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento11825);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5377:2: ( (lv_declaracion_11_0= ruleDeclaracion ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( ((LA91_0>=RULE_STRING && LA91_0<=RULE_ID)||(LA91_0>=67 && LA91_0<=71)) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5378:1: (lv_declaracion_11_0= ruleDeclaracion )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5378:1: (lv_declaracion_11_0= ruleDeclaracion )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5379:3: lv_declaracion_11_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento11846);
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
                    	    break loop91;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleProcedimiento11861); 

                	newLeafNode(otherlv_12, grammarAccess.getProcedimientoAccess().getInicioKeyword_9());
                
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5399:1: ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=RULE_STRING && LA94_0<=RULE_ID)||(LA94_0>=20 && LA94_0<=21)||(LA94_0>=51 && LA94_0<=53)||LA94_0==56||LA94_0==59||LA94_0==61||LA94_0==64) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5399:2: ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )*
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5399:2: ( (lv_sentencias_13_0= ruleSentencias ) )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5400:1: (lv_sentencias_13_0= ruleSentencias )
                    {
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5400:1: (lv_sentencias_13_0= ruleSentencias )
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5401:3: lv_sentencias_13_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_10_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento11883);
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

                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5417:2: ( (lv_sentencias_14_0= ruleSentencias ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( ((LA93_0>=RULE_STRING && LA93_0<=RULE_ID)||(LA93_0>=20 && LA93_0<=21)||(LA93_0>=51 && LA93_0<=53)||LA93_0==56||LA93_0==59||LA93_0==61||LA93_0==64) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5418:1: (lv_sentencias_14_0= ruleSentencias )
                    	    {
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5418:1: (lv_sentencias_14_0= ruleSentencias )
                    	    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5419:3: lv_sentencias_14_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento11904);
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
                    	    break loop93;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,96,FollowSets000.FOLLOW_96_in_ruleProcedimiento11919); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5447:1: entryRuleTipoPaso returns [String current=null] : iv_ruleTipoPaso= ruleTipoPaso EOF ;
    public final String entryRuleTipoPaso() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoPaso = null;


        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5448:2: (iv_ruleTipoPaso= ruleTipoPaso EOF )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5449:2: iv_ruleTipoPaso= ruleTipoPaso EOF
            {
             newCompositeNode(grammarAccess.getTipoPasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso11956);
            iv_ruleTipoPaso=ruleTipoPaso();

            state._fsp--;

             current =iv_ruleTipoPaso.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoPaso11967); 

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
    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5456:1: ruleTipoPaso returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'E' | kw= 'E/S' | kw= 'S' ) ;
    public final AntlrDatatypeRuleToken ruleTipoPaso() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5459:28: ( (kw= 'E' | kw= 'E/S' | kw= 'S' ) )
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5460:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            {
            // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5460:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            int alt95=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt95=1;
                }
                break;
            case 97:
                {
                alt95=2;
                }
                break;
            case 98:
                {
                alt95=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5461:2: kw= 'E'
                    {
                    kw=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleTipoPaso12005); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5468:2: kw= 'E/S'
                    {
                    kw=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleTipoPaso12024); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getESKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../pseudocodigoDSL/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5475:2: kw= 'S'
                    {
                    kw=(Token)match(input,98,FollowSets000.FOLLOW_98_in_ruleTipoPaso12043); 

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
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA57 dfa57 = new DFA57(this);
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\1\6\4\uffff\2\45\1\6\2\uffff";
    static final String DFA11_maxS =
        "\1\54\4\uffff\2\45\1\110\2\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\5\1\6";
    static final String DFA11_specialS =
        "\12\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\5\1\6\36\uffff\1\1\2\uffff\1\2\1\3\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "\1\7",
            "\1\7",
            "\2\11\1\uffff\1\11\43\uffff\1\10\32\uffff\1\11",
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
        "\44\uffff";
    static final String DFA13_eofS =
        "\15\uffff\2\24\7\uffff\3\24\5\uffff\3\24\1\uffff\2\24";
    static final String DFA13_minS =
        "\1\6\2\21\5\uffff\2\6\3\uffff\2\5\1\11\3\42\1\6\1\uffff\1\6\3\5"+
        "\1\11\3\43\1\6\3\5\1\6\2\5";
    static final String DFA13_maxS =
        "\1\100\2\134\5\uffff\1\7\1\110\3\uffff\2\140\1\11\3\43\1\11\1\uffff"+
        "\1\110\3\140\1\11\3\43\1\11\3\140\1\11\2\140";
    static final String DFA13_acceptS =
        "\3\uffff\1\3\1\4\1\6\1\10\1\11\2\uffff\1\5\1\2\1\1\7\uffff\1\7\17"+
        "\uffff";
    static final String DFA13_specialS =
        "\44\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\2\14\uffff\1\6\1\7\35\uffff\1\3\1\4\1\5\2\uffff\1\5\2"+
            "\uffff\1\5\1\uffff\1\5\2\uffff\1\5",
            "\1\14\17\uffff\1\11\2\uffff\1\10\1\13\64\uffff\3\12",
            "\1\14\17\uffff\1\11\2\uffff\1\10\1\13\64\uffff\3\12",
            "",
            "",
            "",
            "",
            "",
            "\1\15\1\16",
            "\1\21\1\22\1\uffff\1\20\76\uffff\1\17",
            "",
            "",
            "",
            "\5\24\12\uffff\2\24\16\uffff\1\23\1\13\14\uffff\4\24\1\uffff"+
            "\2\24\1\uffff\4\24\1\uffff\4\24\5\uffff\1\24\2\uffff\2\24\13"+
            "\uffff\2\24\4\uffff\1\24\1\uffff\1\24",
            "\5\24\12\uffff\2\24\16\uffff\1\23\1\13\14\uffff\4\24\1\uffff"+
            "\2\24\1\uffff\4\24\1\uffff\4\24\5\uffff\1\24\2\uffff\2\24\13"+
            "\uffff\2\24\4\uffff\1\24\1\uffff\1\24",
            "\1\20",
            "\1\25\1\26",
            "\1\25\1\26",
            "\1\25\1\26",
            "\1\27\1\30\1\uffff\1\24",
            "",
            "\1\33\1\34\1\uffff\1\32\76\uffff\1\31",
            "\5\24\12\uffff\2\24\16\uffff\1\35\1\13\14\uffff\4\24\1\uffff"+
            "\2\24\1\uffff\4\24\1\uffff\4\24\5\uffff\1\24\2\uffff\2\24\13"+
            "\uffff\2\24\4\uffff\1\24\1\uffff\1\24",
            "\5\24\12\uffff\2\24\16\uffff\1\23\1\13\14\uffff\4\24\1\uffff"+
            "\2\24\1\uffff\4\24\1\uffff\4\24\5\uffff\1\24\2\uffff\2\24\13"+
            "\uffff\2\24\4\uffff\1\24\1\uffff\1\24",
            "\5\24\12\uffff\2\24\16\uffff\1\23\1\13\14\uffff\4\24\1\uffff"+
            "\2\24\1\uffff\4\24\1\uffff\4\24\5\uffff\1\24\2\uffff\2\24\13"+
            "\uffff\2\24\4\uffff\1\24\1\uffff\1\24",
            "\1\32",
            "\1\36",
            "\1\36",
            "\1\36",
            "\1\37\1\40\1\uffff\1\24",
            "\5\24\12\uffff\2\24\16\uffff\1\41\1\13\14\uffff\4\24\1\uffff"+
            "\2\24\1\uffff\4\24\1\uffff\4\24\5\uffff\1\24\2\uffff\2\24\13"+
            "\uffff\2\24\4\uffff\1\24\1\uffff\1\24",
            "\5\24\12\uffff\2\24\16\uffff\1\24\1\13\14\uffff\4\24\1\uffff"+
            "\2\24\1\uffff\4\24\1\uffff\4\24\5\uffff\1\24\2\uffff\2\24\13"+
            "\uffff\2\24\4\uffff\1\24\1\uffff\1\24",
            "\5\24\12\uffff\2\24\16\uffff\1\24\1\13\14\uffff\4\24\1\uffff"+
            "\2\24\1\uffff\4\24\1\uffff\4\24\5\uffff\1\24\2\uffff\2\24\13"+
            "\uffff\2\24\4\uffff\1\24\1\uffff\1\24",
            "\1\42\1\43\1\uffff\1\24",
            "\5\24\12\uffff\2\24\16\uffff\1\24\1\13\14\uffff\4\24\1\uffff"+
            "\2\24\1\uffff\4\24\1\uffff\4\24\5\uffff\1\24\2\uffff\2\24\13"+
            "\uffff\2\24\4\uffff\1\24\1\uffff\1\24",
            "\5\24\12\uffff\2\24\16\uffff\1\24\1\13\14\uffff\4\24\1\uffff"+
            "\2\24\1\uffff\4\24\1\uffff\4\24\5\uffff\1\24\2\uffff\2\24\13"+
            "\uffff\2\24\4\uffff\1\24\1\uffff\1\24"
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
            return "434:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_Asignacion_1= ruleAsignacion | this_Escribir_2= ruleEscribir | this_Leer_3= ruleLeer | this_incremento_4= ruleincremento | this_Bloque_5= ruleBloque | this_ValorComplejo_6= ruleValorComplejo | this_FuncionFicheroAbrir_7= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_8= ruleFuncionFicheroCerrar )";
        }
    }
    static final String DFA19_eotS =
        "\14\uffff";
    static final String DFA19_eofS =
        "\1\uffff\2\11\3\uffff\1\13\5\uffff";
    static final String DFA19_minS =
        "\1\5\2\22\2\uffff\1\11\1\22\5\uffff";
    static final String DFA19_maxS =
        "\1\114\2\50\2\uffff\1\44\1\50\5\uffff";
    static final String DFA19_acceptS =
        "\3\uffff\1\2\1\3\2\uffff\1\5\1\6\1\1\1\7\1\4";
    static final String DFA19_specialS =
        "\14\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\4\1\1\1\2\1\3\1\6\32\uffff\1\7\43\uffff\1\5\2\uffff\2\10",
            "\2\11\15\uffff\1\12\2\uffff\1\12\3\uffff\1\11",
            "\2\11\15\uffff\1\12\2\uffff\1\12\3\uffff\1\11",
            "",
            "",
            "\1\6\32\uffff\1\7",
            "\2\13\20\uffff\1\7\3\uffff\1\13",
            "",
            "",
            "",
            "",
            ""
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
            return "1004:1: (this_VariableID_0= ruleVariableID | this_ConstCadena_1= ruleConstCadena | this_Caracter_2= ruleCaracter | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_ValorBooleano_5= ruleValorBooleano | this_ValorComplejo_6= ruleValorComplejo )";
        }
    }
    static final String DFA20_eotS =
        "\30\uffff";
    static final String DFA20_eofS =
        "\1\uffff\2\16\2\uffff\1\20\15\uffff\1\6\3\uffff\1\6";
    static final String DFA20_minS =
        "\3\5\1\uffff\1\11\1\5\1\uffff\1\5\4\uffff\1\6\2\uffff\1\11\3\uffff"+
        "\1\5\3\11\1\5";
    static final String DFA20_maxS =
        "\1\114\2\140\1\uffff\1\44\1\140\1\uffff\1\134\4\uffff\1\11\2\uffff"+
        "\1\11\3\uffff\1\140\2\110\1\11\1\140";
    static final String DFA20_acceptS =
        "\3\uffff\1\3\2\uffff\1\5\1\uffff\1\7\1\10\1\11\1\1\1\uffff\1\13"+
        "\1\2\1\uffff\1\4\1\12\1\6\5\uffff";
    static final String DFA20_specialS =
        "\30\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\11\1\1\1\2\1\3\1\5\7\uffff\1\7\6\uffff\11\12\3\uffff\1\6"+
            "\43\uffff\1\4\2\uffff\2\10",
            "\5\16\5\uffff\1\16\1\uffff\1\13\4\16\13\uffff\1\15\2\uffff"+
            "\1\14\11\uffff\1\16\1\uffff\1\16\1\uffff\27\16\2\uffff\17\16"+
            "\4\uffff\3\16",
            "\5\16\5\uffff\1\16\1\uffff\1\13\4\16\13\uffff\1\15\2\uffff"+
            "\1\14\11\uffff\1\16\1\uffff\1\16\1\uffff\27\16\2\uffff\17\16"+
            "\4\uffff\3\16",
            "",
            "\1\5\32\uffff\1\6",
            "\5\20\5\uffff\1\20\2\uffff\4\20\16\uffff\1\17\11\uffff\1\20"+
            "\1\uffff\1\20\1\uffff\27\20\2\uffff\17\20\4\uffff\3\20",
            "",
            "\5\22\7\uffff\1\22\6\uffff\11\22\3\uffff\1\22\43\uffff\1\22"+
            "\2\uffff\2\22\15\uffff\3\21",
            "",
            "",
            "",
            "",
            "\2\15\1\uffff\1\16",
            "",
            "",
            "\1\23",
            "",
            "",
            "",
            "\5\6\5\uffff\1\6\2\uffff\4\6\16\uffff\1\6\3\uffff\1\20\5\uffff"+
            "\1\6\1\uffff\1\6\1\uffff\27\6\1\24\1\25\17\6\4\uffff\3\6",
            "\1\27\76\uffff\1\26",
            "\1\27\76\uffff\1\26",
            "\1\27",
            "\5\6\5\uffff\1\6\2\uffff\4\6\16\uffff\1\6\3\uffff\1\20\5\uffff"+
            "\1\6\1\uffff\1\6\1\uffff\27\6\2\uffff\17\6\4\uffff\3\6"
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
            return "1133:1: (this_LlamadaFuncion_0= ruleLlamadaFuncion | this_VariableID_1= ruleVariableID | this_ConstCadena_2= ruleConstCadena | this_NumeroEntero_3= ruleNumeroEntero | this_NumeroDecimal_4= ruleNumeroDecimal | this_operacion_5= ruleoperacion | this_ValorBooleano_6= ruleValorBooleano | this_Caracter_7= ruleCaracter | this_Internas_8= ruleInternas | this_unaria_9= ruleunaria | this_ValorComplejo_10= ruleValorComplejo )";
        }
    }
    static final String DFA21_eotS =
        "\14\uffff";
    static final String DFA21_eofS =
        "\1\uffff\2\4\11\uffff";
    static final String DFA21_minS =
        "\1\6\2\23\2\uffff\1\6\1\11\3\42\2\uffff";
    static final String DFA21_maxS =
        "\1\7\2\44\2\uffff\1\110\1\11\3\43\2\uffff";
    static final String DFA21_acceptS =
        "\3\uffff\1\4\1\1\5\uffff\1\3\1\2";
    static final String DFA21_specialS =
        "\14\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\1\2",
            "\1\4\15\uffff\1\5\2\uffff\1\3",
            "\1\4\15\uffff\1\5\2\uffff\1\3",
            "",
            "",
            "\1\10\1\11\1\uffff\1\7\76\uffff\1\6",
            "\1\7",
            "\1\12\1\13",
            "\1\12\1\13",
            "\1\12\1\13",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1263:1: (this_VariableID_0= ruleVariableID | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz | this_ValorRegistro_3= ruleValorRegistro )";
        }
    }
    static final String DFA22_eotS =
        "\13\uffff";
    static final String DFA22_eofS =
        "\13\uffff";
    static final String DFA22_minS =
        "\1\6\2\41\1\uffff\1\6\1\11\3\42\2\uffff";
    static final String DFA22_maxS =
        "\1\7\2\44\1\uffff\1\110\1\11\3\43\2\uffff";
    static final String DFA22_acceptS =
        "\3\uffff\1\1\5\uffff\1\2\1\3";
    static final String DFA22_specialS =
        "\13\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\1\2",
            "\1\4\2\uffff\1\3",
            "\1\4\2\uffff\1\3",
            "",
            "\1\7\1\10\1\uffff\1\6\76\uffff\1\5",
            "\1\6",
            "\1\12\1\11",
            "\1\12\1\11",
            "\1\12\1\11",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1323:1: (this_ValorRegistro_0= ruleValorRegistro | this_ValorVector_1= ruleValorVector | this_ValorMatriz_2= ruleValorMatriz )";
        }
    }
    static final String DFA58_eotS =
        "\35\uffff";
    static final String DFA58_eofS =
        "\1\4\12\uffff\2\3\1\uffff\1\3\6\uffff\5\3\1\uffff\2\3";
    static final String DFA58_minS =
        "\1\5\2\21\2\uffff\2\6\1\11\3\42\2\5\1\6\1\5\1\6\1\11\3\43\1\6\5"+
        "\5\1\6\2\5";
    static final String DFA58_maxS =
        "\1\131\2\134\2\uffff\1\110\1\7\1\11\3\43\2\131\1\110\1\131\2\11"+
        "\3\43\1\11\5\131\1\11\2\131";
    static final String DFA58_acceptS =
        "\3\uffff\1\1\1\2\30\uffff";
    static final String DFA58_specialS =
        "\35\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\4\1\1\1\2\2\4\12\uffff\2\3\16\uffff\1\4\16\uffff\3\3\2\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\4\6\uffff\1\4\2\uffff"+
            "\2\4\14\uffff\1\4",
            "\1\3\17\uffff\1\5\2\uffff\1\6\1\3\2\uffff\1\4\61\uffff\3\3",
            "\1\3\17\uffff\1\5\2\uffff\1\6\1\3\2\uffff\1\4\61\uffff\3\3",
            "",
            "",
            "\1\11\1\12\1\uffff\1\10\76\uffff\1\7",
            "\1\13\1\14",
            "\1\10",
            "\1\15\1\16",
            "\1\15\1\16",
            "\1\15\1\16",
            "\5\3\12\uffff\2\3\16\uffff\1\17\1\3\2\uffff\1\4\12\uffff\3"+
            "\3\2\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\2\3\6\uffff\1"+
            "\3\2\uffff\2\3\14\uffff\1\3",
            "\5\3\12\uffff\2\3\16\uffff\1\17\1\3\2\uffff\1\4\12\uffff\3"+
            "\3\2\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\2\3\6\uffff\1"+
            "\3\2\uffff\2\3\14\uffff\1\3",
            "\1\22\1\23\1\uffff\1\21\76\uffff\1\20",
            "\5\3\12\uffff\2\3\16\uffff\1\24\1\3\2\uffff\1\4\12\uffff\3"+
            "\3\2\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\2\3\6\uffff\1"+
            "\3\2\uffff\2\3\14\uffff\1\3",
            "\1\25\1\26\1\uffff\1\3",
            "\1\21",
            "\1\27",
            "\1\27",
            "\1\27",
            "\1\30\1\31\1\uffff\1\3",
            "\5\3\12\uffff\2\3\16\uffff\1\17\1\3\2\uffff\1\4\12\uffff\3"+
            "\3\2\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\2\3\6\uffff\1"+
            "\3\2\uffff\2\3\14\uffff\1\3",
            "\5\3\12\uffff\2\3\16\uffff\1\17\1\3\2\uffff\1\4\12\uffff\3"+
            "\3\2\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\2\3\6\uffff\1"+
            "\3\2\uffff\2\3\14\uffff\1\3",
            "\5\3\12\uffff\2\3\16\uffff\1\32\1\3\2\uffff\1\4\12\uffff\3"+
            "\3\2\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\2\3\6\uffff\1"+
            "\3\2\uffff\2\3\14\uffff\1\3",
            "\5\3\12\uffff\2\3\16\uffff\2\3\2\uffff\1\4\12\uffff\3\3\2\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\2\3\6\uffff\1\3\2\uffff"+
            "\2\3\14\uffff\1\3",
            "\5\3\12\uffff\2\3\16\uffff\2\3\2\uffff\1\4\12\uffff\3\3\2\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\2\3\6\uffff\1\3\2\uffff"+
            "\2\3\14\uffff\1\3",
            "\1\33\1\34\1\uffff\1\3",
            "\5\3\12\uffff\2\3\16\uffff\2\3\2\uffff\1\4\12\uffff\3\3\2\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\2\3\6\uffff\1\3\2\uffff"+
            "\2\3\14\uffff\1\3",
            "\5\3\12\uffff\2\3\16\uffff\2\3\2\uffff\1\4\12\uffff\3\3\2\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\2\3\6\uffff\1\3\2\uffff"+
            "\2\3\14\uffff\1\3"
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "3751:1: ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )?";
        }
    }
    static final String DFA57_eotS =
        "\35\uffff";
    static final String DFA57_eofS =
        "\1\1\6\uffff\2\4\6\uffff\3\4\5\uffff\3\4\1\uffff\2\4";
    static final String DFA57_minS =
        "\1\5\1\uffff\2\21\1\uffff\2\6\2\5\1\11\3\42\2\6\3\5\1\11\3\43\1"+
        "\6\3\5\1\6\2\5";
    static final String DFA57_maxS =
        "\1\131\1\uffff\2\134\1\uffff\1\7\1\110\2\131\1\11\3\43\1\11\1\110"+
        "\3\131\1\11\3\43\1\11\3\131\1\11\2\131";
    static final String DFA57_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\30\uffff";
    static final String DFA57_specialS =
        "\35\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\1\1\2\1\3\2\1\12\uffff\2\4\16\uffff\1\1\16\uffff\3\4\2\uffff"+
            "\1\4\2\uffff\1\4\1\uffff\1\4\2\uffff\1\4\1\1\6\uffff\1\1\2\uffff"+
            "\2\1\14\uffff\1\1",
            "",
            "\1\4\17\uffff\1\6\2\uffff\1\5\1\4\2\uffff\1\1\61\uffff\3\4",
            "\1\4\17\uffff\1\6\2\uffff\1\5\1\4\2\uffff\1\1\61\uffff\3\4",
            "",
            "\1\7\1\10",
            "\1\13\1\14\1\uffff\1\12\76\uffff\1\11",
            "\5\4\12\uffff\2\4\16\uffff\1\15\1\4\2\uffff\1\1\12\uffff\3"+
            "\4\2\uffff\1\4\2\uffff\1\4\1\uffff\1\4\2\uffff\2\4\6\uffff\1"+
            "\4\2\uffff\2\4\14\uffff\1\4",
            "\5\4\12\uffff\2\4\16\uffff\1\15\1\4\2\uffff\1\1\12\uffff\3"+
            "\4\2\uffff\1\4\2\uffff\1\4\1\uffff\1\4\2\uffff\2\4\6\uffff\1"+
            "\4\2\uffff\2\4\14\uffff\1\4",
            "\1\12",
            "\1\16\1\17",
            "\1\16\1\17",
            "\1\16\1\17",
            "\1\20\1\21\1\uffff\1\4",
            "\1\24\1\25\1\uffff\1\23\76\uffff\1\22",
            "\5\4\12\uffff\2\4\16\uffff\1\26\1\4\2\uffff\1\1\12\uffff\3"+
            "\4\2\uffff\1\4\2\uffff\1\4\1\uffff\1\4\2\uffff\2\4\6\uffff\1"+
            "\4\2\uffff\2\4\14\uffff\1\4",
            "\5\4\12\uffff\2\4\16\uffff\1\15\1\4\2\uffff\1\1\12\uffff\3"+
            "\4\2\uffff\1\4\2\uffff\1\4\1\uffff\1\4\2\uffff\2\4\6\uffff\1"+
            "\4\2\uffff\2\4\14\uffff\1\4",
            "\5\4\12\uffff\2\4\16\uffff\1\15\1\4\2\uffff\1\1\12\uffff\3"+
            "\4\2\uffff\1\4\2\uffff\1\4\1\uffff\1\4\2\uffff\2\4\6\uffff\1"+
            "\4\2\uffff\2\4\14\uffff\1\4",
            "\1\23",
            "\1\27",
            "\1\27",
            "\1\27",
            "\1\30\1\31\1\uffff\1\4",
            "\5\4\12\uffff\2\4\16\uffff\1\32\1\4\2\uffff\1\1\12\uffff\3"+
            "\4\2\uffff\1\4\2\uffff\1\4\1\uffff\1\4\2\uffff\2\4\6\uffff\1"+
            "\4\2\uffff\2\4\14\uffff\1\4",
            "\5\4\12\uffff\2\4\16\uffff\2\4\2\uffff\1\1\12\uffff\3\4\2\uffff"+
            "\1\4\2\uffff\1\4\1\uffff\1\4\2\uffff\2\4\6\uffff\1\4\2\uffff"+
            "\2\4\14\uffff\1\4",
            "\5\4\12\uffff\2\4\16\uffff\2\4\2\uffff\1\1\12\uffff\3\4\2\uffff"+
            "\1\4\2\uffff\1\4\1\uffff\1\4\2\uffff\2\4\6\uffff\1\4\2\uffff"+
            "\2\4\14\uffff\1\4",
            "\1\33\1\34\1\uffff\1\4",
            "\5\4\12\uffff\2\4\16\uffff\2\4\2\uffff\1\1\12\uffff\3\4\2\uffff"+
            "\1\4\2\uffff\1\4\1\uffff\1\4\2\uffff\2\4\6\uffff\1\4\2\uffff"+
            "\2\4\14\uffff\1\4",
            "\5\4\12\uffff\2\4\16\uffff\2\4\2\uffff\1\1\12\uffff\3\4\2\uffff"+
            "\1\4\2\uffff\1\4\1\uffff\1\4\2\uffff\2\4\6\uffff\1\4\2\uffff"+
            "\2\4\14\uffff\1\4"
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "()* loopback of 3769:2: ( (lv_sentencias_3_0= ruleSentencias ) )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleCodigo_in_entryRuleCodigo75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCodigo85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComentario_in_ruleCodigo132 = new BitSet(new long[]{0x000100000001C000L,0x00000000800000F8L});
        public static final BitSet FOLLOW_ruleComentario_in_ruleCodigo153 = new BitSet(new long[]{0x000100000001C000L,0x00000000800000F8L});
        public static final BitSet FOLLOW_14_in_ruleCodigo169 = new BitSet(new long[]{0x000100000001C0C0L,0x00000000800000F8L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleCodigo191 = new BitSet(new long[]{0x000100000001C0C0L,0x00000000800000F8L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleCodigo212 = new BitSet(new long[]{0x000100000001C0C0L,0x00000000800000F8L});
        public static final BitSet FOLLOW_15_in_ruleCodigo230 = new BitSet(new long[]{0x000116400001C0C0L,0x00000000800000F8L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleCodigo252 = new BitSet(new long[]{0x000116400001C0C0L,0x00000000800000F8L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleCodigo273 = new BitSet(new long[]{0x000116400001C0C0L,0x00000000800000F8L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleCodigo300 = new BitSet(new long[]{0x000100000001C000L,0x00000000800000F8L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleCodigo321 = new BitSet(new long[]{0x000100000001C000L,0x00000000800000F8L});
        public static final BitSet FOLLOW_ruleInicio_in_ruleCodigo345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComentario_in_entryRuleComentario381 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComentario391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleComentario428 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_COMENT_in_ruleComentario445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_entryRuleTipoComplejo486 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoComplejo496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_ruleTipoComplejo543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_ruleTipoComplejo570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegistro_in_ruleTipoComplejo597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchivo_in_ruleTipoComplejo624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerado_in_ruleTipoComplejo651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrango_in_ruleTipoComplejo678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubproceso_in_entryRuleSubproceso713 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubproceso723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_ruleSubproceso770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_ruleSubproceso797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_entryRuleSentencias832 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSentencias842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_ruleSentencias889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_ruleSentencias916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_ruleSentencias943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_ruleSentencias970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleincremento_in_ruleSentencias997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBloque_in_ruleSentencias1024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorComplejo_in_ruleSentencias1051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroAbrir_in_ruleSentencias1078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroCerrar_in_ruleSentencias1105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBloque_in_entryRuleBloque1140 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBloque1150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_ruleBloque1197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_ruleBloque1224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_ruleBloque1251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_ruleBloque1278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_ruleBloque1305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_entryRuleDeclaracion1340 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracion1350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_ruleDeclaracion1397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_ruleDeclaracion1424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInternas_in_entryRuleInternas1459 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInternas1469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_ruleInternas1515 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInternas1527 = new BitSet(new long[]{0x00000010000003E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleInternas1549 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleInternas1562 = new BitSet(new long[]{0x00000010000003E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleInternas1583 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleInternas1598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroAbrir_in_entryRuleFuncionFicheroAbrir1634 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncionFicheroAbrir1644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleFuncionFicheroAbrir1681 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFuncionFicheroAbrir1693 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleFuncionFicheroAbrir1715 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleFuncionFicheroAbrir1727 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_ruleModoApertura_in_ruleFuncionFicheroAbrir1748 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleFuncionFicheroAbrir1760 = new BitSet(new long[]{0x00000010000003E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleFuncionFicheroAbrir1781 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFuncionFicheroAbrir1794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroCerrar_in_entryRuleFuncionFicheroCerrar1830 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncionFicheroCerrar1840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleFuncionFicheroCerrar1877 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFuncionFicheroCerrar1889 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleFuncionFicheroCerrar1910 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFuncionFicheroCerrar1922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModoApertura_in_entryRuleModoApertura1959 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModoApertura1970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleModoApertura2008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleModoApertura2027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna2068 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNombreInterna2079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleNombreInterna2117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleNombreInterna2136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleNombreInterna2155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleNombreInterna2174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleNombreInterna2193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleNombreInterna2212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleNombreInterna2231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleNombreInterna2250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleNombreInterna2269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_entryRuleOperador2309 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperador2319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleOperador2366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstCadena_in_ruleOperador2393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_ruleOperador2420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_ruleOperador2447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_ruleOperador2474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_ruleOperador2501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorComplejo_in_ruleOperador2528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_entryRuleCaracter2563 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCaracter2573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAR_in_ruleCaracter2614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_entryRulevalor2654 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulevalor2664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_rulevalor2711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rulevalor2738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstCadena_in_rulevalor2765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_rulevalor2792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_rulevalor2819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulevalor2846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_rulevalor2873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaracter_in_rulevalor2900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInternas_in_rulevalor2927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunaria_in_rulevalor2954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorComplejo_in_rulevalor2981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevaloresLeer_in_entryRulevaloresLeer3016 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulevaloresLeer3026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rulevaloresLeer3073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorVector_in_rulevaloresLeer3100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorMatriz_in_rulevaloresLeer3127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorRegistro_in_rulevaloresLeer3154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorComplejo_in_entryRuleValorComplejo3189 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValorComplejo3199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorRegistro_in_ruleValorComplejo3246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorVector_in_ruleValorComplejo3273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorMatriz_in_ruleValorComplejo3300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorMatriz_in_entryRuleValorMatriz3335 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValorMatriz3345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleValorMatriz3392 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleValorMatriz3404 = new BitSet(new long[]{0x00000000000002C0L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_ruleValorMatriz3426 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleValorMatriz3453 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleValorMatriz3466 = new BitSet(new long[]{0x00000000000002C0L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_ruleValorMatriz3488 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleValorMatriz3515 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleValorMatriz3528 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_36_in_ruleValorMatriz3542 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleValorMatriz3563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorRegistro_in_entryRuleValorRegistro3601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValorRegistro3611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleValorRegistro3657 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleValorRegistro3669 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleValorRegistro3691 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_36_in_ruleValorRegistro3704 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleValorRegistro3725 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_ruleValorVector_in_entryRuleValorVector3764 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValorVector3774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleValorVector3821 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleValorVector3833 = new BitSet(new long[]{0x00000000000002C0L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_ruleValorVector3855 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleValorVector3882 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleValorVector3895 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_36_in_ruleValorVector3909 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleValorVector3930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_entryRuleCampoRegistro3968 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCampoRegistro3978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCampoRegistro4023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipo_in_entryRuleTipo4058 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipo4068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoDefinido_in_ruleTipo4115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoExistente_in_ruleTipo4142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoDefinido_in_entryRuleTipoDefinido4177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoDefinido4187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTipoDefinido4232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoExistente_in_entryRuleTipoExistente4267 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoExistente4277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleTipoExistente4322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantes_in_entryRuleConstantes4357 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantes4367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleConstantes4413 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleConstantes4425 = new BitSet(new long[]{0x00000011FF0203E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_rulevalor_in_ruleConstantes4446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_entryRuleVector4482 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVector4492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleVector4529 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleVector4541 = new BitSet(new long[]{0x00000000000002C0L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_ruleVector4563 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleVector4590 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleVector4603 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleVector4615 = new BitSet(new long[]{0x00000000000000C0L,0x00000000000000F8L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleVector4636 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleVector4648 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVector4669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_entryRuleMatriz4705 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatriz4715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleMatriz4752 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleMatriz4764 = new BitSet(new long[]{0x00000000000002C0L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_ruleMatriz4786 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleMatriz4813 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleMatriz4826 = new BitSet(new long[]{0x00000000000002C0L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_ruleMatriz4848 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleMatriz4875 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleMatriz4888 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleMatriz4900 = new BitSet(new long[]{0x00000000000000C0L,0x00000000000000F8L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleMatriz4921 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleMatriz4933 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatriz4954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegistro_in_entryRuleRegistro4990 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegistro5000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleRegistro5037 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRegistro5058 = new BitSet(new long[]{0x00000000000000C0L,0x00000000000000F8L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleRegistro5080 = new BitSet(new long[]{0x00000800000000C0L,0x00000000000000F8L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleRegistro5101 = new BitSet(new long[]{0x00000800000000C0L,0x00000000000000F8L});
        public static final BitSet FOLLOW_43_in_ruleRegistro5115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchivo_in_entryRuleArchivo5151 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArchivo5161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleArchivo5198 = new BitSet(new long[]{0x00000000000000C0L,0x00000000000000F8L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleArchivo5219 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleArchivo5231 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArchivo5252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerado_in_entryRuleEnumerado5288 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerado5298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnumerado5344 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleEnumerado5356 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleEnumerado5368 = new BitSet(new long[]{0x00000011FF0203E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_rulevalor_in_ruleEnumerado5390 = new BitSet(new long[]{0x0000400000040000L});
        public static final BitSet FOLLOW_18_in_ruleEnumerado5403 = new BitSet(new long[]{0x00000011FF0203E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_rulevalor_in_ruleEnumerado5424 = new BitSet(new long[]{0x0000400000040000L});
        public static final BitSet FOLLOW_46_in_ruleEnumerado5439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrango_in_entryRuleSubrango5475 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrango5485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoNumerico_in_ruleSubrango5532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoEnumerado_in_ruleSubrango5559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoNumerico_in_entryRuleSubrangoNumerico5594 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrangoNumerico5604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoNumerico5650 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleSubrangoNumerico5662 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubrangoNumerico5683 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleSubrangoNumerico5695 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubrangoNumerico5716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoEnumerado_in_entryRuleSubrangoEnumerado5752 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrangoEnumerado5762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado5808 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleSubrangoEnumerado5820 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado5841 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleSubrangoEnumerado5853 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado5874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInicio_in_entryRuleInicio5910 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInicio5920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleInicio5966 = new BitSet(new long[]{0x00020000000000C0L,0x00000000000000F8L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio5988 = new BitSet(new long[]{0x00020000000000C0L,0x00000000000000F8L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio6009 = new BitSet(new long[]{0x00020000000000C0L,0x00000000000000F8L});
        public static final BitSet FOLLOW_49_in_ruleInicio6024 = new BitSet(new long[]{0x293C0010003003E0L,0x0000000000001901L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio6046 = new BitSet(new long[]{0x293C0010003003E0L,0x0000000000001901L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio6067 = new BitSet(new long[]{0x293C0010003003E0L,0x0000000000001901L});
        public static final BitSet FOLLOW_50_in_ruleInicio6082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString6119 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString6130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString6170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString6196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable6241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionVariable6251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable6297 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleDeclaracionVariable6309 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable6330 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleDeclaracionVariable6343 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable6364 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia6402 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionPropia6412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDeclaracionPropia6458 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleDeclaracionPropia6470 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia6491 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleDeclaracionPropia6504 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia6525 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleLlamadaFuncion_in_entryRuleLlamadaFuncion6563 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLlamadaFuncion6573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLlamadaFuncion6619 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLlamadaFuncion6631 = new BitSet(new long[]{0x00000011FF0A03E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_rulevalor_in_ruleLlamadaFuncion6653 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleLlamadaFuncion6666 = new BitSet(new long[]{0x00000011FF0203E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_rulevalor_in_ruleLlamadaFuncion6687 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleLlamadaFuncion6703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_entryRuleAsignacion6739 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacion6749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_ruleAsignacion6796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionCompleja_in_ruleAsignacion6823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_entryRuleAsignacionNormal6858 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacionNormal6868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsignacionNormal6914 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleAsignacionNormal6926 = new BitSet(new long[]{0x00000011FF0203E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_rulevalor_in_ruleAsignacionNormal6947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionCompleja_in_entryRuleAsignacionCompleja6983 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacionCompleja6993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorComplejo_in_ruleAsignacionCompleja7039 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleAsignacionCompleja7051 = new BitSet(new long[]{0x00000011FF0203E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_rulevalor_in_ruleAsignacionCompleja7072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_entryRuleEscribir7108 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEscribir7118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleEscribir7155 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEscribir7167 = new BitSet(new long[]{0x00000010000003E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleEscribir7188 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleEscribir7201 = new BitSet(new long[]{0x00000010000003E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleEscribir7222 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleEscribir7236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_entryRuleLeer7272 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeer7282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleLeer7319 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLeer7331 = new BitSet(new long[]{0x00000010000003E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_rulevaloresLeer_in_ruleLeer7352 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleLeer7364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_entryRuleSi7400 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSi7410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleSi7447 = new BitSet(new long[]{0x00000011FF0203E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_rulevalor_in_ruleSi7468 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleSi7480 = new BitSet(new long[]{0x29B80010003003E0L,0x0000000003001901L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi7502 = new BitSet(new long[]{0x29B80010003003E0L,0x0000000003001901L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi7523 = new BitSet(new long[]{0x29B80010003003E0L,0x0000000003001901L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSi7547 = new BitSet(new long[]{0x0080000000000000L,0x0000000001000000L});
        public static final BitSet FOLLOW_ruleSino_in_ruleSi7569 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleSi7582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_entryRulemientras7618 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemientras7628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rulemientras7665 = new BitSet(new long[]{0x00000011FF0203E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_rulevalor_in_rulemientras7686 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_rulemientras7698 = new BitSet(new long[]{0x2D380010003003E0L,0x0000000000001901L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras7720 = new BitSet(new long[]{0x2D380010003003E0L,0x0000000000001901L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras7741 = new BitSet(new long[]{0x2D380010003003E0L,0x0000000000001901L});
        public static final BitSet FOLLOW_58_in_rulemientras7756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_entryRulerepetir7792 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulerepetir7802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rulerepetir7839 = new BitSet(new long[]{0x39380010003003E0L,0x0000000000001901L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir7861 = new BitSet(new long[]{0x39380010003003E0L,0x0000000000001901L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir7882 = new BitSet(new long[]{0x39380010003003E0L,0x0000000000001901L});
        public static final BitSet FOLLOW_60_in_rulerepetir7897 = new BitSet(new long[]{0x00000011FF0203E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_rulevalor_in_rulerepetir7918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_entryRuledesde7954 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuledesde7964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruledesde8001 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_ruledesde8022 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_62_in_ruledesde8034 = new BitSet(new long[]{0x00000011FF0203E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_rulevalor_in_ruledesde8055 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruledesde8067 = new BitSet(new long[]{0xA9380010003003E0L,0x0000000000001901L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde8089 = new BitSet(new long[]{0xA9380010003003E0L,0x0000000000001901L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde8110 = new BitSet(new long[]{0xA9380010003003E0L,0x0000000000001901L});
        public static final BitSet FOLLOW_63_in_ruledesde8125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaso_in_entryRuleCaso8161 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCaso8171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleCaso8217 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleCaso8229 = new BitSet(new long[]{0x29380010003003E2L,0x0000000002001901L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso8251 = new BitSet(new long[]{0x29380010003003E2L,0x0000000002001901L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso8272 = new BitSet(new long[]{0x29380010003003E2L,0x0000000002001901L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleCaso8296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_entryRulesegun8333 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesegun8343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rulesegun8380 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulesegun8392 = new BitSet(new long[]{0x00000011FF0203E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_rulevalor_in_rulesegun8413 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulesegun8425 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_rulesegun8437 = new BitSet(new long[]{0x00000010000003E0L,0x0000000000001902L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun8459 = new BitSet(new long[]{0x00000010000003E0L,0x0000000000001902L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun8480 = new BitSet(new long[]{0x00000010000003E0L,0x0000000000001902L});
        public static final BitSet FOLLOW_65_in_rulesegun8495 = new BitSet(new long[]{0x29380010003003E0L,0x0000000002001905L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun8517 = new BitSet(new long[]{0x29380010003003E0L,0x0000000002001905L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun8538 = new BitSet(new long[]{0x29380010003003E0L,0x0000000002001905L});
        public static final BitSet FOLLOW_ruleDevolver_in_rulesegun8562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_rulesegun8575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleincremento_in_entryRuleincremento8611 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleincremento8621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleincremento8667 = new BitSet(new long[]{0x0000000000000000L,0x000000001C000000L});
        public static final BitSet FOLLOW_ruleinc_in_ruleincremento8688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunaria_in_entryRuleunaria8724 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleunaria8734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleunaria8771 = new BitSet(new long[]{0x0000000000000000L,0x000000001C000000L});
        public static final BitSet FOLLOW_ruleinc_in_ruleunaria8792 = new BitSet(new long[]{0x00000011FF0203E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_rulevalor_in_ruleunaria8813 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleunaria8825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable8862 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoVariable8873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleTipoVariable8911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleTipoVariable8930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleTipoVariable8949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleTipoVariable8968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleTipoVariable8987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable9027 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable9037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable9082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_entryRuleVariableID9117 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableID9127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariableID9172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstCadena_in_entryRuleConstCadena9207 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstCadena9217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAD_in_ruleConstCadena9258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroEntero_in_entryRuleNumeroEntero9298 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumeroEntero9308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumeroEntero9353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumeroDecimal_in_entryRuleNumeroDecimal9388 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumeroDecimal9398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleNumeroDecimal9443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValorBooleano_in_entryRuleValorBooleano9478 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValorBooleano9488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_ruleValorBooleano9533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt9569 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt9580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleEInt9619 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt9636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat9682 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat9693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleEFloat9732 = new BitSet(new long[]{0x0000001000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat9750 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleEFloat9770 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat9785 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
        public static final BitSet FOLLOW_73_in_ruleEFloat9805 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000100L});
        public static final BitSet FOLLOW_74_in_ruleEFloat9824 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleEFloat9839 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat9856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_entryRulebooleano9904 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulebooleano9915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_rulebooleano9953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_rulebooleano9972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_entryRuleoperacion10012 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperacion10022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleoperacion10059 = new BitSet(new long[]{0x00000011FF0203E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_ruleoperando_izq_in_ruleoperacion10080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000FFE100L});
        public static final BitSet FOLLOW_rulesigno_in_ruleoperacion10101 = new BitSet(new long[]{0x00000011FF0203E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_ruleoperando_der_in_ruleoperacion10122 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleoperacion10134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesigno_in_entryRulesigno10171 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesigno10182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_rulesigno10220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_rulesigno10239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_rulesigno10258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_rulesigno10277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_rulesigno10296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_rulesigno10315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_rulesigno10334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_rulesigno10353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_rulesigno10372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_rulesigno10391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_rulesigno10410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_rulesigno10429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_izq_in_entryRuleoperando_izq10469 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperando_izq10479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_ruleoperando_izq10524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperando_der_in_entryRuleoperando_der10559 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperando_der10569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalor_in_ruleoperando_der10614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSino_in_entryRuleSino10649 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSino10659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleSino10705 = new BitSet(new long[]{0x29380010003003E2L,0x0000000002001901L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino10727 = new BitSet(new long[]{0x29380010003003E2L,0x0000000002001901L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino10748 = new BitSet(new long[]{0x29380010003003E2L,0x0000000002001901L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSino10772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDevolver_in_entryRuleDevolver10809 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDevolver10819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleDevolver10865 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDevolver10877 = new BitSet(new long[]{0x00000011FF0203E0L,0x0000000000001900L});
        public static final BitSet FOLLOW_rulevalor_in_ruleDevolver10898 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleDevolver10910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinc_in_entryRuleinc10947 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleinc10958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleinc10996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_ruleinc11015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_92_in_ruleinc11034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion11074 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametroFuncion11084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_ruleParametroFuncion11130 = new BitSet(new long[]{0x00000000000000C0L,0x00000000000000F8L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleParametroFuncion11151 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleParametroFuncion11163 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleParametroFuncion11184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_entryRuleFuncion11220 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncion11230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleFuncion11276 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_93_in_ruleFuncion11288 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFuncion11309 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFuncion11321 = new BitSet(new long[]{0x0000000000080000L,0x0000000600000200L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion11343 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleFuncion11356 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000200L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion11377 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleFuncion11393 = new BitSet(new long[]{0x000100000000C000L});
        public static final BitSet FOLLOW_14_in_ruleFuncion11406 = new BitSet(new long[]{0x0001000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFuncion11421 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleFuncion11435 = new BitSet(new long[]{0x00020000000000C0L,0x00000000000000F8L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion11457 = new BitSet(new long[]{0x00020000000000C0L,0x00000000000000F8L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion11478 = new BitSet(new long[]{0x00020000000000C0L,0x00000000000000F8L});
        public static final BitSet FOLLOW_49_in_ruleFuncion11493 = new BitSet(new long[]{0x29380010003003E0L,0x0000000042001901L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion11515 = new BitSet(new long[]{0x29380010003003E0L,0x0000000042001901L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion11536 = new BitSet(new long[]{0x29380010003003E0L,0x0000000042001901L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleFuncion11560 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
        public static final BitSet FOLLOW_94_in_ruleFuncion11573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento11609 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcedimiento11619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_95_in_ruleProcedimiento11656 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcedimiento11677 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProcedimiento11689 = new BitSet(new long[]{0x0000000000080000L,0x0000000600000200L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento11711 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleProcedimiento11724 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000200L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento11745 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleProcedimiento11761 = new BitSet(new long[]{0x000100000000C000L});
        public static final BitSet FOLLOW_14_in_ruleProcedimiento11774 = new BitSet(new long[]{0x0001000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProcedimiento11789 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleProcedimiento11803 = new BitSet(new long[]{0x00020000000000C0L,0x00000000000000F8L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento11825 = new BitSet(new long[]{0x00020000000000C0L,0x00000000000000F8L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento11846 = new BitSet(new long[]{0x00020000000000C0L,0x00000000000000F8L});
        public static final BitSet FOLLOW_49_in_ruleProcedimiento11861 = new BitSet(new long[]{0x29380010003003E0L,0x0000000100001901L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento11883 = new BitSet(new long[]{0x29380010003003E0L,0x0000000100001901L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento11904 = new BitSet(new long[]{0x29380010003003E0L,0x0000000100001901L});
        public static final BitSet FOLLOW_96_in_ruleProcedimiento11919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso11956 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoPaso11967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleTipoPaso12005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_97_in_ruleTipoPaso12024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_98_in_ruleTipoPaso12043 = new BitSet(new long[]{0x0000000000000002L});
    }


}