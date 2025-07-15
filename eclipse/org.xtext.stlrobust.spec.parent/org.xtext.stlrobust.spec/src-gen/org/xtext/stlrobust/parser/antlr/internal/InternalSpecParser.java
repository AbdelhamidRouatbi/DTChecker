package org.xtext.stlrobust.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.stlrobust.services.SpecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'signal'", "'from'", "'specification'", "':'", "'scope'", "'pattern'", "'Globally'", "'Before'", "'After'", "'Between'", "'and'", "'until'", "'Universality:'", "'Absence:'", "'Existence:'", "'MinimumDuration:'", "'MaximumDuration:'", "'Recurrence:'", "'Precedence:'", "'Until:'", "'Response:'", "'ResponseInvariance:'", "'it-is-always-the-case-that'", "'holds'", "'It-is-never-the-case-that'", "'Eventually'", "'a'", "'if'", "'then-in-response'", "'eventually holds'", "'-'", "'.'", "'>'", "'>='", "'='", "'<'", "'<='", "'within'", "'after'", "'between'", "'ms'", "'s'", "'min'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSpecParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpecParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpecParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSpec.g"; }



     	private SpecGrammarAccess grammarAccess;

        public InternalSpecParser(TokenStream input, SpecGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SpecGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSpec.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSpec.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSpec.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSpec.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_Signals_0_0= ruleSignal ) )* ( (lv_Specifications_1_0= ruleSpecification ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_Signals_0_0 = null;

        EObject lv_Specifications_1_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:77:2: ( ( ( (lv_Signals_0_0= ruleSignal ) )* ( (lv_Specifications_1_0= ruleSpecification ) )* ) )
            // InternalSpec.g:78:2: ( ( (lv_Signals_0_0= ruleSignal ) )* ( (lv_Specifications_1_0= ruleSpecification ) )* )
            {
            // InternalSpec.g:78:2: ( ( (lv_Signals_0_0= ruleSignal ) )* ( (lv_Specifications_1_0= ruleSpecification ) )* )
            // InternalSpec.g:79:3: ( (lv_Signals_0_0= ruleSignal ) )* ( (lv_Specifications_1_0= ruleSpecification ) )*
            {
            // InternalSpec.g:79:3: ( (lv_Signals_0_0= ruleSignal ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSpec.g:80:4: (lv_Signals_0_0= ruleSignal )
            	    {
            	    // InternalSpec.g:80:4: (lv_Signals_0_0= ruleSignal )
            	    // InternalSpec.g:81:5: lv_Signals_0_0= ruleSignal
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSignalsSignalParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_Signals_0_0=ruleSignal();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Signals",
            	    						lv_Signals_0_0,
            	    						"org.xtext.stlrobust.Spec.Signal");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSpec.g:98:3: ( (lv_Specifications_1_0= ruleSpecification ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSpec.g:99:4: (lv_Specifications_1_0= ruleSpecification )
            	    {
            	    // InternalSpec.g:99:4: (lv_Specifications_1_0= ruleSpecification )
            	    // InternalSpec.g:100:5: lv_Specifications_1_0= ruleSpecification
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSpecificationsSpecificationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_Specifications_1_0=ruleSpecification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Specifications",
            	    						lv_Specifications_1_0,
            	    						"org.xtext.stlrobust.Spec.Specification");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSignal"
    // InternalSpec.g:121:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // InternalSpec.g:121:47: (iv_ruleSignal= ruleSignal EOF )
            // InternalSpec.g:122:2: iv_ruleSignal= ruleSignal EOF
            {
             newCompositeNode(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignal=ruleSignal();

            state._fsp--;

             current =iv_ruleSignal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // InternalSpec.g:128:1: ruleSignal returns [EObject current=null] : (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_queueName_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_queueName_3_0=null;


        	enterRule();

        try {
            // InternalSpec.g:134:2: ( (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_queueName_3_0= RULE_STRING ) ) ) )
            // InternalSpec.g:135:2: (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_queueName_3_0= RULE_STRING ) ) )
            {
            // InternalSpec.g:135:2: (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_queueName_3_0= RULE_STRING ) ) )
            // InternalSpec.g:136:3: otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_queueName_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSignalAccess().getSignalKeyword_0());
            		
            // InternalSpec.g:140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpec.g:141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpec.g:141:4: (lv_name_1_0= RULE_ID )
            // InternalSpec.g:142:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSignalAccess().getFromKeyword_2());
            		
            // InternalSpec.g:162:3: ( (lv_queueName_3_0= RULE_STRING ) )
            // InternalSpec.g:163:4: (lv_queueName_3_0= RULE_STRING )
            {
            // InternalSpec.g:163:4: (lv_queueName_3_0= RULE_STRING )
            // InternalSpec.g:164:5: lv_queueName_3_0= RULE_STRING
            {
            lv_queueName_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_queueName_3_0, grammarAccess.getSignalAccess().getQueueNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"queueName",
            						lv_queueName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleSpecification"
    // InternalSpec.g:184:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalSpec.g:184:54: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalSpec.g:185:2: iv_ruleSpecification= ruleSpecification EOF
            {
             newCompositeNode(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;

             current =iv_ruleSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalSpec.g:191:1: ruleSpecification returns [EObject current=null] : (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'scope' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= 'pattern' ( (lv_pattern_6_0= rulePattern ) ) ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_scope_4_0 = null;

        EObject lv_pattern_6_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:197:2: ( (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'scope' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= 'pattern' ( (lv_pattern_6_0= rulePattern ) ) ) )
            // InternalSpec.g:198:2: (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'scope' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= 'pattern' ( (lv_pattern_6_0= rulePattern ) ) )
            {
            // InternalSpec.g:198:2: (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'scope' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= 'pattern' ( (lv_pattern_6_0= rulePattern ) ) )
            // InternalSpec.g:199:3: otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'scope' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= 'pattern' ( (lv_pattern_6_0= rulePattern ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSpecificationAccess().getSpecificationKeyword_0());
            		
            // InternalSpec.g:203:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpec.g:204:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpec.g:204:4: (lv_name_1_0= RULE_ID )
            // InternalSpec.g:205:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSpecificationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSpecificationAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSpecificationAccess().getScopeKeyword_3());
            		
            // InternalSpec.g:229:3: ( (lv_scope_4_0= ruleScope ) )
            // InternalSpec.g:230:4: (lv_scope_4_0= ruleScope )
            {
            // InternalSpec.g:230:4: (lv_scope_4_0= ruleScope )
            // InternalSpec.g:231:5: lv_scope_4_0= ruleScope
            {

            					newCompositeNode(grammarAccess.getSpecificationAccess().getScopeScopeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_scope_4_0=ruleScope();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            					}
            					set(
            						current,
            						"scope",
            						lv_scope_4_0,
            						"org.xtext.stlrobust.Spec.Scope");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getSpecificationAccess().getPatternKeyword_5());
            		
            // InternalSpec.g:252:3: ( (lv_pattern_6_0= rulePattern ) )
            // InternalSpec.g:253:4: (lv_pattern_6_0= rulePattern )
            {
            // InternalSpec.g:253:4: (lv_pattern_6_0= rulePattern )
            // InternalSpec.g:254:5: lv_pattern_6_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getSpecificationAccess().getPatternPatternParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_pattern_6_0=rulePattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_6_0,
            						"org.xtext.stlrobust.Spec.Pattern");
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
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleScope"
    // InternalSpec.g:275:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalSpec.g:275:46: (iv_ruleScope= ruleScope EOF )
            // InternalSpec.g:276:2: iv_ruleScope= ruleScope EOF
            {
             newCompositeNode(grammarAccess.getScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;

             current =iv_ruleScope; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalSpec.g:282:1: ruleScope returns [EObject current=null] : ( ( () otherlv_1= 'Globally' ) | ( () otherlv_3= 'Before' ( (lv_r_4_0= ruleExpression ) ) ) | ( () otherlv_6= 'After' ( (lv_q_7_0= ruleExpression ) ) ) | ( () otherlv_9= 'Between' ( (lv_q_10_0= ruleExpression ) ) otherlv_11= 'and' ( (lv_r_12_0= ruleExpression ) ) ) | ( () otherlv_14= 'After' ( (lv_q_15_0= ruleExpression ) ) otherlv_16= 'until' ( (lv_r_17_0= ruleExpression ) ) ) ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_r_4_0 = null;

        EObject lv_q_7_0 = null;

        EObject lv_q_10_0 = null;

        EObject lv_r_12_0 = null;

        EObject lv_q_15_0 = null;

        EObject lv_r_17_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:288:2: ( ( ( () otherlv_1= 'Globally' ) | ( () otherlv_3= 'Before' ( (lv_r_4_0= ruleExpression ) ) ) | ( () otherlv_6= 'After' ( (lv_q_7_0= ruleExpression ) ) ) | ( () otherlv_9= 'Between' ( (lv_q_10_0= ruleExpression ) ) otherlv_11= 'and' ( (lv_r_12_0= ruleExpression ) ) ) | ( () otherlv_14= 'After' ( (lv_q_15_0= ruleExpression ) ) otherlv_16= 'until' ( (lv_r_17_0= ruleExpression ) ) ) ) )
            // InternalSpec.g:289:2: ( ( () otherlv_1= 'Globally' ) | ( () otherlv_3= 'Before' ( (lv_r_4_0= ruleExpression ) ) ) | ( () otherlv_6= 'After' ( (lv_q_7_0= ruleExpression ) ) ) | ( () otherlv_9= 'Between' ( (lv_q_10_0= ruleExpression ) ) otherlv_11= 'and' ( (lv_r_12_0= ruleExpression ) ) ) | ( () otherlv_14= 'After' ( (lv_q_15_0= ruleExpression ) ) otherlv_16= 'until' ( (lv_r_17_0= ruleExpression ) ) ) )
            {
            // InternalSpec.g:289:2: ( ( () otherlv_1= 'Globally' ) | ( () otherlv_3= 'Before' ( (lv_r_4_0= ruleExpression ) ) ) | ( () otherlv_6= 'After' ( (lv_q_7_0= ruleExpression ) ) ) | ( () otherlv_9= 'Between' ( (lv_q_10_0= ruleExpression ) ) otherlv_11= 'and' ( (lv_r_12_0= ruleExpression ) ) ) | ( () otherlv_14= 'After' ( (lv_q_15_0= ruleExpression ) ) otherlv_16= 'until' ( (lv_r_17_0= ruleExpression ) ) ) )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSpec.g:290:3: ( () otherlv_1= 'Globally' )
                    {
                    // InternalSpec.g:290:3: ( () otherlv_1= 'Globally' )
                    // InternalSpec.g:291:4: () otherlv_1= 'Globally'
                    {
                    // InternalSpec.g:291:4: ()
                    // InternalSpec.g:292:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getGlobalScopeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getScopeAccess().getGloballyKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:304:3: ( () otherlv_3= 'Before' ( (lv_r_4_0= ruleExpression ) ) )
                    {
                    // InternalSpec.g:304:3: ( () otherlv_3= 'Before' ( (lv_r_4_0= ruleExpression ) ) )
                    // InternalSpec.g:305:4: () otherlv_3= 'Before' ( (lv_r_4_0= ruleExpression ) )
                    {
                    // InternalSpec.g:305:4: ()
                    // InternalSpec.g:306:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getBeforeScopeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getScopeAccess().getBeforeKeyword_1_1());
                    			
                    // InternalSpec.g:316:4: ( (lv_r_4_0= ruleExpression ) )
                    // InternalSpec.g:317:5: (lv_r_4_0= ruleExpression )
                    {
                    // InternalSpec.g:317:5: (lv_r_4_0= ruleExpression )
                    // InternalSpec.g:318:6: lv_r_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getRExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_r_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"r",
                    							lv_r_4_0,
                    							"org.xtext.stlrobust.Spec.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:337:3: ( () otherlv_6= 'After' ( (lv_q_7_0= ruleExpression ) ) )
                    {
                    // InternalSpec.g:337:3: ( () otherlv_6= 'After' ( (lv_q_7_0= ruleExpression ) ) )
                    // InternalSpec.g:338:4: () otherlv_6= 'After' ( (lv_q_7_0= ruleExpression ) )
                    {
                    // InternalSpec.g:338:4: ()
                    // InternalSpec.g:339:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getAfterScopeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getScopeAccess().getAfterKeyword_2_1());
                    			
                    // InternalSpec.g:349:4: ( (lv_q_7_0= ruleExpression ) )
                    // InternalSpec.g:350:5: (lv_q_7_0= ruleExpression )
                    {
                    // InternalSpec.g:350:5: (lv_q_7_0= ruleExpression )
                    // InternalSpec.g:351:6: lv_q_7_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getQExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_q_7_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"q",
                    							lv_q_7_0,
                    							"org.xtext.stlrobust.Spec.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:370:3: ( () otherlv_9= 'Between' ( (lv_q_10_0= ruleExpression ) ) otherlv_11= 'and' ( (lv_r_12_0= ruleExpression ) ) )
                    {
                    // InternalSpec.g:370:3: ( () otherlv_9= 'Between' ( (lv_q_10_0= ruleExpression ) ) otherlv_11= 'and' ( (lv_r_12_0= ruleExpression ) ) )
                    // InternalSpec.g:371:4: () otherlv_9= 'Between' ( (lv_q_10_0= ruleExpression ) ) otherlv_11= 'and' ( (lv_r_12_0= ruleExpression ) )
                    {
                    // InternalSpec.g:371:4: ()
                    // InternalSpec.g:372:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getBetweenScopeAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getScopeAccess().getBetweenKeyword_3_1());
                    			
                    // InternalSpec.g:382:4: ( (lv_q_10_0= ruleExpression ) )
                    // InternalSpec.g:383:5: (lv_q_10_0= ruleExpression )
                    {
                    // InternalSpec.g:383:5: (lv_q_10_0= ruleExpression )
                    // InternalSpec.g:384:6: lv_q_10_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getQExpressionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_q_10_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"q",
                    							lv_q_10_0,
                    							"org.xtext.stlrobust.Spec.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_11, grammarAccess.getScopeAccess().getAndKeyword_3_3());
                    			
                    // InternalSpec.g:405:4: ( (lv_r_12_0= ruleExpression ) )
                    // InternalSpec.g:406:5: (lv_r_12_0= ruleExpression )
                    {
                    // InternalSpec.g:406:5: (lv_r_12_0= ruleExpression )
                    // InternalSpec.g:407:6: lv_r_12_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getRExpressionParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_r_12_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"r",
                    							lv_r_12_0,
                    							"org.xtext.stlrobust.Spec.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:426:3: ( () otherlv_14= 'After' ( (lv_q_15_0= ruleExpression ) ) otherlv_16= 'until' ( (lv_r_17_0= ruleExpression ) ) )
                    {
                    // InternalSpec.g:426:3: ( () otherlv_14= 'After' ( (lv_q_15_0= ruleExpression ) ) otherlv_16= 'until' ( (lv_r_17_0= ruleExpression ) ) )
                    // InternalSpec.g:427:4: () otherlv_14= 'After' ( (lv_q_15_0= ruleExpression ) ) otherlv_16= 'until' ( (lv_r_17_0= ruleExpression ) )
                    {
                    // InternalSpec.g:427:4: ()
                    // InternalSpec.g:428:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getAfterUntilScopeAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_14=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getScopeAccess().getAfterKeyword_4_1());
                    			
                    // InternalSpec.g:438:4: ( (lv_q_15_0= ruleExpression ) )
                    // InternalSpec.g:439:5: (lv_q_15_0= ruleExpression )
                    {
                    // InternalSpec.g:439:5: (lv_q_15_0= ruleExpression )
                    // InternalSpec.g:440:6: lv_q_15_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getQExpressionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_q_15_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"q",
                    							lv_q_15_0,
                    							"org.xtext.stlrobust.Spec.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getScopeAccess().getUntilKeyword_4_3());
                    			
                    // InternalSpec.g:461:4: ( (lv_r_17_0= ruleExpression ) )
                    // InternalSpec.g:462:5: (lv_r_17_0= ruleExpression )
                    {
                    // InternalSpec.g:462:5: (lv_r_17_0= ruleExpression )
                    // InternalSpec.g:463:6: lv_r_17_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getRExpressionParserRuleCall_4_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_r_17_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"r",
                    							lv_r_17_0,
                    							"org.xtext.stlrobust.Spec.Expression");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRulePattern"
    // InternalSpec.g:485:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalSpec.g:485:48: (iv_rulePattern= rulePattern EOF )
            // InternalSpec.g:486:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalSpec.g:492:1: rulePattern returns [EObject current=null] : ( (otherlv_0= 'Universality:' this_Universality_1= ruleUniversality ) | (otherlv_2= 'Absence:' this_Absence_3= ruleAbsence ) | (otherlv_4= 'Existence:' this_Existence_5= ruleExistence ) | (otherlv_6= 'MinimumDuration:' ruleMinimumDuration ) | (otherlv_8= 'MaximumDuration:' ruleMaximumDuration ) | (otherlv_10= 'Recurrence:' ruleRecurrence ) | (otherlv_12= 'Precedence:' rulePrecedence ) | (otherlv_14= 'Until:' ruleUntil ) | (otherlv_16= 'Response:' this_Response_17= ruleResponse ) | (otherlv_18= 'ResponseInvariance:' ruleResponseInvariance ) ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject this_Universality_1 = null;

        EObject this_Absence_3 = null;

        EObject this_Existence_5 = null;

        EObject this_Response_17 = null;



        	enterRule();

        try {
            // InternalSpec.g:498:2: ( ( (otherlv_0= 'Universality:' this_Universality_1= ruleUniversality ) | (otherlv_2= 'Absence:' this_Absence_3= ruleAbsence ) | (otherlv_4= 'Existence:' this_Existence_5= ruleExistence ) | (otherlv_6= 'MinimumDuration:' ruleMinimumDuration ) | (otherlv_8= 'MaximumDuration:' ruleMaximumDuration ) | (otherlv_10= 'Recurrence:' ruleRecurrence ) | (otherlv_12= 'Precedence:' rulePrecedence ) | (otherlv_14= 'Until:' ruleUntil ) | (otherlv_16= 'Response:' this_Response_17= ruleResponse ) | (otherlv_18= 'ResponseInvariance:' ruleResponseInvariance ) ) )
            // InternalSpec.g:499:2: ( (otherlv_0= 'Universality:' this_Universality_1= ruleUniversality ) | (otherlv_2= 'Absence:' this_Absence_3= ruleAbsence ) | (otherlv_4= 'Existence:' this_Existence_5= ruleExistence ) | (otherlv_6= 'MinimumDuration:' ruleMinimumDuration ) | (otherlv_8= 'MaximumDuration:' ruleMaximumDuration ) | (otherlv_10= 'Recurrence:' ruleRecurrence ) | (otherlv_12= 'Precedence:' rulePrecedence ) | (otherlv_14= 'Until:' ruleUntil ) | (otherlv_16= 'Response:' this_Response_17= ruleResponse ) | (otherlv_18= 'ResponseInvariance:' ruleResponseInvariance ) )
            {
            // InternalSpec.g:499:2: ( (otherlv_0= 'Universality:' this_Universality_1= ruleUniversality ) | (otherlv_2= 'Absence:' this_Absence_3= ruleAbsence ) | (otherlv_4= 'Existence:' this_Existence_5= ruleExistence ) | (otherlv_6= 'MinimumDuration:' ruleMinimumDuration ) | (otherlv_8= 'MaximumDuration:' ruleMaximumDuration ) | (otherlv_10= 'Recurrence:' ruleRecurrence ) | (otherlv_12= 'Precedence:' rulePrecedence ) | (otherlv_14= 'Until:' ruleUntil ) | (otherlv_16= 'Response:' this_Response_17= ruleResponse ) | (otherlv_18= 'ResponseInvariance:' ruleResponseInvariance ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 25:
                {
                alt4=3;
                }
                break;
            case 26:
                {
                alt4=4;
                }
                break;
            case 27:
                {
                alt4=5;
                }
                break;
            case 28:
                {
                alt4=6;
                }
                break;
            case 29:
                {
                alt4=7;
                }
                break;
            case 30:
                {
                alt4=8;
                }
                break;
            case 31:
                {
                alt4=9;
                }
                break;
            case 32:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSpec.g:500:3: (otherlv_0= 'Universality:' this_Universality_1= ruleUniversality )
                    {
                    // InternalSpec.g:500:3: (otherlv_0= 'Universality:' this_Universality_1= ruleUniversality )
                    // InternalSpec.g:501:4: otherlv_0= 'Universality:' this_Universality_1= ruleUniversality
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getUniversalityKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPatternAccess().getUniversalityParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Universality_1=ruleUniversality();

                    state._fsp--;


                    				current = this_Universality_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:515:3: (otherlv_2= 'Absence:' this_Absence_3= ruleAbsence )
                    {
                    // InternalSpec.g:515:3: (otherlv_2= 'Absence:' this_Absence_3= ruleAbsence )
                    // InternalSpec.g:516:4: otherlv_2= 'Absence:' this_Absence_3= ruleAbsence
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getAbsenceKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPatternAccess().getAbsenceParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Absence_3=ruleAbsence();

                    state._fsp--;


                    				current = this_Absence_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:530:3: (otherlv_4= 'Existence:' this_Existence_5= ruleExistence )
                    {
                    // InternalSpec.g:530:3: (otherlv_4= 'Existence:' this_Existence_5= ruleExistence )
                    // InternalSpec.g:531:4: otherlv_4= 'Existence:' this_Existence_5= ruleExistence
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getExistenceKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPatternAccess().getExistenceParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Existence_5=ruleExistence();

                    state._fsp--;


                    				current = this_Existence_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:545:3: (otherlv_6= 'MinimumDuration:' ruleMinimumDuration )
                    {
                    // InternalSpec.g:545:3: (otherlv_6= 'MinimumDuration:' ruleMinimumDuration )
                    // InternalSpec.g:546:4: otherlv_6= 'MinimumDuration:' ruleMinimumDuration
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getPatternAccess().getMinimumDurationKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getPatternAccess().getMinimumDurationParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleMinimumDuration();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:559:3: (otherlv_8= 'MaximumDuration:' ruleMaximumDuration )
                    {
                    // InternalSpec.g:559:3: (otherlv_8= 'MaximumDuration:' ruleMaximumDuration )
                    // InternalSpec.g:560:4: otherlv_8= 'MaximumDuration:' ruleMaximumDuration
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getPatternAccess().getMaximumDurationKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getPatternAccess().getMaximumDurationParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleMaximumDuration();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSpec.g:573:3: (otherlv_10= 'Recurrence:' ruleRecurrence )
                    {
                    // InternalSpec.g:573:3: (otherlv_10= 'Recurrence:' ruleRecurrence )
                    // InternalSpec.g:574:4: otherlv_10= 'Recurrence:' ruleRecurrence
                    {
                    otherlv_10=(Token)match(input,28,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getPatternAccess().getRecurrenceKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getPatternAccess().getRecurrenceParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleRecurrence();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSpec.g:587:3: (otherlv_12= 'Precedence:' rulePrecedence )
                    {
                    // InternalSpec.g:587:3: (otherlv_12= 'Precedence:' rulePrecedence )
                    // InternalSpec.g:588:4: otherlv_12= 'Precedence:' rulePrecedence
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getPatternAccess().getPrecedenceKeyword_6_0());
                    			

                    				newCompositeNode(grammarAccess.getPatternAccess().getPrecedenceParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_2);
                    rulePrecedence();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSpec.g:601:3: (otherlv_14= 'Until:' ruleUntil )
                    {
                    // InternalSpec.g:601:3: (otherlv_14= 'Until:' ruleUntil )
                    // InternalSpec.g:602:4: otherlv_14= 'Until:' ruleUntil
                    {
                    otherlv_14=(Token)match(input,30,FOLLOW_19); 

                    				newLeafNode(otherlv_14, grammarAccess.getPatternAccess().getUntilKeyword_7_0());
                    			

                    				newCompositeNode(grammarAccess.getPatternAccess().getUntilParserRuleCall_7_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleUntil();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSpec.g:615:3: (otherlv_16= 'Response:' this_Response_17= ruleResponse )
                    {
                    // InternalSpec.g:615:3: (otherlv_16= 'Response:' this_Response_17= ruleResponse )
                    // InternalSpec.g:616:4: otherlv_16= 'Response:' this_Response_17= ruleResponse
                    {
                    otherlv_16=(Token)match(input,31,FOLLOW_20); 

                    				newLeafNode(otherlv_16, grammarAccess.getPatternAccess().getResponseKeyword_8_0());
                    			

                    				newCompositeNode(grammarAccess.getPatternAccess().getResponseParserRuleCall_8_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Response_17=ruleResponse();

                    state._fsp--;


                    				current = this_Response_17;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSpec.g:630:3: (otherlv_18= 'ResponseInvariance:' ruleResponseInvariance )
                    {
                    // InternalSpec.g:630:3: (otherlv_18= 'ResponseInvariance:' ruleResponseInvariance )
                    // InternalSpec.g:631:4: otherlv_18= 'ResponseInvariance:' ruleResponseInvariance
                    {
                    otherlv_18=(Token)match(input,32,FOLLOW_19); 

                    				newLeafNode(otherlv_18, grammarAccess.getPatternAccess().getResponseInvarianceKeyword_9_0());
                    			

                    				newCompositeNode(grammarAccess.getPatternAccess().getResponseInvarianceParserRuleCall_9_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleResponseInvariance();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleUniversality"
    // InternalSpec.g:647:1: entryRuleUniversality returns [EObject current=null] : iv_ruleUniversality= ruleUniversality EOF ;
    public final EObject entryRuleUniversality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversality = null;


        try {
            // InternalSpec.g:647:53: (iv_ruleUniversality= ruleUniversality EOF )
            // InternalSpec.g:648:2: iv_ruleUniversality= ruleUniversality EOF
            {
             newCompositeNode(grammarAccess.getUniversalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUniversality=ruleUniversality();

            state._fsp--;

             current =iv_ruleUniversality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUniversality"


    // $ANTLR start "ruleUniversality"
    // InternalSpec.g:654:1: ruleUniversality returns [EObject current=null] : (otherlv_0= 'it-is-always-the-case-that' ( (lv_p_1_0= ruleExpression ) ) (otherlv_2= 'holds' )? ) ;
    public final EObject ruleUniversality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_p_1_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:660:2: ( (otherlv_0= 'it-is-always-the-case-that' ( (lv_p_1_0= ruleExpression ) ) (otherlv_2= 'holds' )? ) )
            // InternalSpec.g:661:2: (otherlv_0= 'it-is-always-the-case-that' ( (lv_p_1_0= ruleExpression ) ) (otherlv_2= 'holds' )? )
            {
            // InternalSpec.g:661:2: (otherlv_0= 'it-is-always-the-case-that' ( (lv_p_1_0= ruleExpression ) ) (otherlv_2= 'holds' )? )
            // InternalSpec.g:662:3: otherlv_0= 'it-is-always-the-case-that' ( (lv_p_1_0= ruleExpression ) ) (otherlv_2= 'holds' )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getUniversalityAccess().getItIsAlwaysTheCaseThatKeyword_0());
            		
            // InternalSpec.g:666:3: ( (lv_p_1_0= ruleExpression ) )
            // InternalSpec.g:667:4: (lv_p_1_0= ruleExpression )
            {
            // InternalSpec.g:667:4: (lv_p_1_0= ruleExpression )
            // InternalSpec.g:668:5: lv_p_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getUniversalityAccess().getPExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_p_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniversalityRule());
            					}
            					set(
            						current,
            						"p",
            						lv_p_1_0,
            						"org.xtext.stlrobust.Spec.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpec.g:685:3: (otherlv_2= 'holds' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==34) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSpec.g:686:4: otherlv_2= 'holds'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getUniversalityAccess().getHoldsKeyword_2());
                    			

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
    // $ANTLR end "ruleUniversality"


    // $ANTLR start "entryRuleAbsence"
    // InternalSpec.g:695:1: entryRuleAbsence returns [EObject current=null] : iv_ruleAbsence= ruleAbsence EOF ;
    public final EObject entryRuleAbsence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsence = null;


        try {
            // InternalSpec.g:695:48: (iv_ruleAbsence= ruleAbsence EOF )
            // InternalSpec.g:696:2: iv_ruleAbsence= ruleAbsence EOF
            {
             newCompositeNode(grammarAccess.getAbsenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbsence=ruleAbsence();

            state._fsp--;

             current =iv_ruleAbsence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbsence"


    // $ANTLR start "ruleAbsence"
    // InternalSpec.g:702:1: ruleAbsence returns [EObject current=null] : (otherlv_0= 'It-is-never-the-case-that' ( (lv_p_1_0= ruleExpression ) ) (otherlv_2= 'holds' )? ) ;
    public final EObject ruleAbsence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_p_1_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:708:2: ( (otherlv_0= 'It-is-never-the-case-that' ( (lv_p_1_0= ruleExpression ) ) (otherlv_2= 'holds' )? ) )
            // InternalSpec.g:709:2: (otherlv_0= 'It-is-never-the-case-that' ( (lv_p_1_0= ruleExpression ) ) (otherlv_2= 'holds' )? )
            {
            // InternalSpec.g:709:2: (otherlv_0= 'It-is-never-the-case-that' ( (lv_p_1_0= ruleExpression ) ) (otherlv_2= 'holds' )? )
            // InternalSpec.g:710:3: otherlv_0= 'It-is-never-the-case-that' ( (lv_p_1_0= ruleExpression ) ) (otherlv_2= 'holds' )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAbsenceAccess().getItIsNeverTheCaseThatKeyword_0());
            		
            // InternalSpec.g:714:3: ( (lv_p_1_0= ruleExpression ) )
            // InternalSpec.g:715:4: (lv_p_1_0= ruleExpression )
            {
            // InternalSpec.g:715:4: (lv_p_1_0= ruleExpression )
            // InternalSpec.g:716:5: lv_p_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAbsenceAccess().getPExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_p_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsenceRule());
            					}
            					set(
            						current,
            						"p",
            						lv_p_1_0,
            						"org.xtext.stlrobust.Spec.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpec.g:733:3: (otherlv_2= 'holds' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSpec.g:734:4: otherlv_2= 'holds'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getAbsenceAccess().getHoldsKeyword_2());
                    			

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
    // $ANTLR end "ruleAbsence"


    // $ANTLR start "entryRuleExistence"
    // InternalSpec.g:743:1: entryRuleExistence returns [EObject current=null] : iv_ruleExistence= ruleExistence EOF ;
    public final EObject entryRuleExistence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistence = null;


        try {
            // InternalSpec.g:743:50: (iv_ruleExistence= ruleExistence EOF )
            // InternalSpec.g:744:2: iv_ruleExistence= ruleExistence EOF
            {
             newCompositeNode(grammarAccess.getExistenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistence=ruleExistence();

            state._fsp--;

             current =iv_ruleExistence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistence"


    // $ANTLR start "ruleExistence"
    // InternalSpec.g:750:1: ruleExistence returns [EObject current=null] : (otherlv_0= 'Eventually' ( (lv_p_1_0= ruleExpression ) ) (otherlv_2= 'holds' )? ( (lv_time_3_0= ruleTime ) ) ) ;
    public final EObject ruleExistence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_p_1_0 = null;

        EObject lv_time_3_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:756:2: ( (otherlv_0= 'Eventually' ( (lv_p_1_0= ruleExpression ) ) (otherlv_2= 'holds' )? ( (lv_time_3_0= ruleTime ) ) ) )
            // InternalSpec.g:757:2: (otherlv_0= 'Eventually' ( (lv_p_1_0= ruleExpression ) ) (otherlv_2= 'holds' )? ( (lv_time_3_0= ruleTime ) ) )
            {
            // InternalSpec.g:757:2: (otherlv_0= 'Eventually' ( (lv_p_1_0= ruleExpression ) ) (otherlv_2= 'holds' )? ( (lv_time_3_0= ruleTime ) ) )
            // InternalSpec.g:758:3: otherlv_0= 'Eventually' ( (lv_p_1_0= ruleExpression ) ) (otherlv_2= 'holds' )? ( (lv_time_3_0= ruleTime ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getExistenceAccess().getEventuallyKeyword_0());
            		
            // InternalSpec.g:762:3: ( (lv_p_1_0= ruleExpression ) )
            // InternalSpec.g:763:4: (lv_p_1_0= ruleExpression )
            {
            // InternalSpec.g:763:4: (lv_p_1_0= ruleExpression )
            // InternalSpec.g:764:5: lv_p_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExistenceAccess().getPExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_p_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExistenceRule());
            					}
            					set(
            						current,
            						"p",
            						lv_p_1_0,
            						"org.xtext.stlrobust.Spec.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpec.g:781:3: (otherlv_2= 'holds' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSpec.g:782:4: otherlv_2= 'holds'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getExistenceAccess().getHoldsKeyword_2());
                    			

                    }
                    break;

            }

            // InternalSpec.g:787:3: ( (lv_time_3_0= ruleTime ) )
            // InternalSpec.g:788:4: (lv_time_3_0= ruleTime )
            {
            // InternalSpec.g:788:4: (lv_time_3_0= ruleTime )
            // InternalSpec.g:789:5: lv_time_3_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getExistenceAccess().getTimeTimeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_time_3_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExistenceRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_3_0,
            						"org.xtext.stlrobust.Spec.Time");
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
    // $ANTLR end "ruleExistence"


    // $ANTLR start "entryRuleMinimumDuration"
    // InternalSpec.g:810:1: entryRuleMinimumDuration returns [String current=null] : iv_ruleMinimumDuration= ruleMinimumDuration EOF ;
    public final String entryRuleMinimumDuration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMinimumDuration = null;


        try {
            // InternalSpec.g:810:55: (iv_ruleMinimumDuration= ruleMinimumDuration EOF )
            // InternalSpec.g:811:2: iv_ruleMinimumDuration= ruleMinimumDuration EOF
            {
             newCompositeNode(grammarAccess.getMinimumDurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinimumDuration=ruleMinimumDuration();

            state._fsp--;

             current =iv_ruleMinimumDuration.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinimumDuration"


    // $ANTLR start "ruleMinimumDuration"
    // InternalSpec.g:817:1: ruleMinimumDuration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'a' ;
    public final AntlrDatatypeRuleToken ruleMinimumDuration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSpec.g:823:2: (kw= 'a' )
            // InternalSpec.g:824:2: kw= 'a'
            {
            kw=(Token)match(input,37,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMinimumDurationAccess().getAKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinimumDuration"


    // $ANTLR start "entryRuleMaximumDuration"
    // InternalSpec.g:832:1: entryRuleMaximumDuration returns [String current=null] : iv_ruleMaximumDuration= ruleMaximumDuration EOF ;
    public final String entryRuleMaximumDuration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMaximumDuration = null;


        try {
            // InternalSpec.g:832:55: (iv_ruleMaximumDuration= ruleMaximumDuration EOF )
            // InternalSpec.g:833:2: iv_ruleMaximumDuration= ruleMaximumDuration EOF
            {
             newCompositeNode(grammarAccess.getMaximumDurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaximumDuration=ruleMaximumDuration();

            state._fsp--;

             current =iv_ruleMaximumDuration.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaximumDuration"


    // $ANTLR start "ruleMaximumDuration"
    // InternalSpec.g:839:1: ruleMaximumDuration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'a' ;
    public final AntlrDatatypeRuleToken ruleMaximumDuration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSpec.g:845:2: (kw= 'a' )
            // InternalSpec.g:846:2: kw= 'a'
            {
            kw=(Token)match(input,37,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMaximumDurationAccess().getAKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaximumDuration"


    // $ANTLR start "entryRuleRecurrence"
    // InternalSpec.g:854:1: entryRuleRecurrence returns [String current=null] : iv_ruleRecurrence= ruleRecurrence EOF ;
    public final String entryRuleRecurrence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRecurrence = null;


        try {
            // InternalSpec.g:854:50: (iv_ruleRecurrence= ruleRecurrence EOF )
            // InternalSpec.g:855:2: iv_ruleRecurrence= ruleRecurrence EOF
            {
             newCompositeNode(grammarAccess.getRecurrenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecurrence=ruleRecurrence();

            state._fsp--;

             current =iv_ruleRecurrence.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecurrence"


    // $ANTLR start "ruleRecurrence"
    // InternalSpec.g:861:1: ruleRecurrence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'a' ;
    public final AntlrDatatypeRuleToken ruleRecurrence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSpec.g:867:2: (kw= 'a' )
            // InternalSpec.g:868:2: kw= 'a'
            {
            kw=(Token)match(input,37,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getRecurrenceAccess().getAKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecurrence"


    // $ANTLR start "entryRulePrecedence"
    // InternalSpec.g:876:1: entryRulePrecedence returns [String current=null] : iv_rulePrecedence= rulePrecedence EOF ;
    public final String entryRulePrecedence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrecedence = null;


        try {
            // InternalSpec.g:876:50: (iv_rulePrecedence= rulePrecedence EOF )
            // InternalSpec.g:877:2: iv_rulePrecedence= rulePrecedence EOF
            {
             newCompositeNode(grammarAccess.getPrecedenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrecedence=rulePrecedence();

            state._fsp--;

             current =iv_rulePrecedence.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrecedence"


    // $ANTLR start "rulePrecedence"
    // InternalSpec.g:883:1: rulePrecedence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'a' ;
    public final AntlrDatatypeRuleToken rulePrecedence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSpec.g:889:2: (kw= 'a' )
            // InternalSpec.g:890:2: kw= 'a'
            {
            kw=(Token)match(input,37,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPrecedenceAccess().getAKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrecedence"


    // $ANTLR start "entryRuleUntil"
    // InternalSpec.g:898:1: entryRuleUntil returns [String current=null] : iv_ruleUntil= ruleUntil EOF ;
    public final String entryRuleUntil() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUntil = null;


        try {
            // InternalSpec.g:898:45: (iv_ruleUntil= ruleUntil EOF )
            // InternalSpec.g:899:2: iv_ruleUntil= ruleUntil EOF
            {
             newCompositeNode(grammarAccess.getUntilRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUntil=ruleUntil();

            state._fsp--;

             current =iv_ruleUntil.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUntil"


    // $ANTLR start "ruleUntil"
    // InternalSpec.g:905:1: ruleUntil returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'a' ;
    public final AntlrDatatypeRuleToken ruleUntil() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSpec.g:911:2: (kw= 'a' )
            // InternalSpec.g:912:2: kw= 'a'
            {
            kw=(Token)match(input,37,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getUntilAccess().getAKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUntil"


    // $ANTLR start "entryRuleResponse"
    // InternalSpec.g:920:1: entryRuleResponse returns [EObject current=null] : iv_ruleResponse= ruleResponse EOF ;
    public final EObject entryRuleResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponse = null;


        try {
            // InternalSpec.g:920:49: (iv_ruleResponse= ruleResponse EOF )
            // InternalSpec.g:921:2: iv_ruleResponse= ruleResponse EOF
            {
             newCompositeNode(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponse=ruleResponse();

            state._fsp--;

             current =iv_ruleResponse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalSpec.g:927:1: ruleResponse returns [EObject current=null] : (otherlv_0= 'if' ( (lv_p_1_0= ruleExpression ) ) otherlv_2= 'then-in-response' ( (lv_s_3_0= ruleExpression ) ) (otherlv_4= 'eventually holds' )? ( (lv_time_5_0= ruleTime ) ) ) ;
    public final EObject ruleResponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_p_1_0 = null;

        EObject lv_s_3_0 = null;

        EObject lv_time_5_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:933:2: ( (otherlv_0= 'if' ( (lv_p_1_0= ruleExpression ) ) otherlv_2= 'then-in-response' ( (lv_s_3_0= ruleExpression ) ) (otherlv_4= 'eventually holds' )? ( (lv_time_5_0= ruleTime ) ) ) )
            // InternalSpec.g:934:2: (otherlv_0= 'if' ( (lv_p_1_0= ruleExpression ) ) otherlv_2= 'then-in-response' ( (lv_s_3_0= ruleExpression ) ) (otherlv_4= 'eventually holds' )? ( (lv_time_5_0= ruleTime ) ) )
            {
            // InternalSpec.g:934:2: (otherlv_0= 'if' ( (lv_p_1_0= ruleExpression ) ) otherlv_2= 'then-in-response' ( (lv_s_3_0= ruleExpression ) ) (otherlv_4= 'eventually holds' )? ( (lv_time_5_0= ruleTime ) ) )
            // InternalSpec.g:935:3: otherlv_0= 'if' ( (lv_p_1_0= ruleExpression ) ) otherlv_2= 'then-in-response' ( (lv_s_3_0= ruleExpression ) ) (otherlv_4= 'eventually holds' )? ( (lv_time_5_0= ruleTime ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getResponseAccess().getIfKeyword_0());
            		
            // InternalSpec.g:939:3: ( (lv_p_1_0= ruleExpression ) )
            // InternalSpec.g:940:4: (lv_p_1_0= ruleExpression )
            {
            // InternalSpec.g:940:4: (lv_p_1_0= ruleExpression )
            // InternalSpec.g:941:5: lv_p_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getResponseAccess().getPExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_p_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResponseRule());
            					}
            					set(
            						current,
            						"p",
            						lv_p_1_0,
            						"org.xtext.stlrobust.Spec.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getResponseAccess().getThenInResponseKeyword_2());
            		
            // InternalSpec.g:962:3: ( (lv_s_3_0= ruleExpression ) )
            // InternalSpec.g:963:4: (lv_s_3_0= ruleExpression )
            {
            // InternalSpec.g:963:4: (lv_s_3_0= ruleExpression )
            // InternalSpec.g:964:5: lv_s_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getResponseAccess().getSExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_s_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResponseRule());
            					}
            					set(
            						current,
            						"s",
            						lv_s_3_0,
            						"org.xtext.stlrobust.Spec.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpec.g:981:3: (otherlv_4= 'eventually holds' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==40) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSpec.g:982:4: otherlv_4= 'eventually holds'
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getResponseAccess().getEventuallyHoldsKeyword_4());
                    			

                    }
                    break;

            }

            // InternalSpec.g:987:3: ( (lv_time_5_0= ruleTime ) )
            // InternalSpec.g:988:4: (lv_time_5_0= ruleTime )
            {
            // InternalSpec.g:988:4: (lv_time_5_0= ruleTime )
            // InternalSpec.g:989:5: lv_time_5_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getResponseAccess().getTimeTimeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_time_5_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResponseRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_5_0,
            						"org.xtext.stlrobust.Spec.Time");
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
    // $ANTLR end "ruleResponse"


    // $ANTLR start "entryRuleResponseInvariance"
    // InternalSpec.g:1010:1: entryRuleResponseInvariance returns [String current=null] : iv_ruleResponseInvariance= ruleResponseInvariance EOF ;
    public final String entryRuleResponseInvariance() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResponseInvariance = null;


        try {
            // InternalSpec.g:1010:58: (iv_ruleResponseInvariance= ruleResponseInvariance EOF )
            // InternalSpec.g:1011:2: iv_ruleResponseInvariance= ruleResponseInvariance EOF
            {
             newCompositeNode(grammarAccess.getResponseInvarianceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponseInvariance=ruleResponseInvariance();

            state._fsp--;

             current =iv_ruleResponseInvariance.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResponseInvariance"


    // $ANTLR start "ruleResponseInvariance"
    // InternalSpec.g:1017:1: ruleResponseInvariance returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'a' ;
    public final AntlrDatatypeRuleToken ruleResponseInvariance() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSpec.g:1023:2: (kw= 'a' )
            // InternalSpec.g:1024:2: kw= 'a'
            {
            kw=(Token)match(input,37,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getResponseInvarianceAccess().getAKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResponseInvariance"


    // $ANTLR start "entryRuleNumber"
    // InternalSpec.g:1032:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalSpec.g:1032:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalSpec.g:1033:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalSpec.g:1039:1: ruleNumber returns [EObject current=null] : ( ( (lv_sign_0_0= '-' ) )? ( (lv_intValue_1_0= RULE_INT ) ) (otherlv_2= '.' ( (lv_decimalValue_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_sign_0_0=null;
        Token lv_intValue_1_0=null;
        Token otherlv_2=null;
        Token lv_decimalValue_3_0=null;


        	enterRule();

        try {
            // InternalSpec.g:1045:2: ( ( ( (lv_sign_0_0= '-' ) )? ( (lv_intValue_1_0= RULE_INT ) ) (otherlv_2= '.' ( (lv_decimalValue_3_0= RULE_INT ) ) )? ) )
            // InternalSpec.g:1046:2: ( ( (lv_sign_0_0= '-' ) )? ( (lv_intValue_1_0= RULE_INT ) ) (otherlv_2= '.' ( (lv_decimalValue_3_0= RULE_INT ) ) )? )
            {
            // InternalSpec.g:1046:2: ( ( (lv_sign_0_0= '-' ) )? ( (lv_intValue_1_0= RULE_INT ) ) (otherlv_2= '.' ( (lv_decimalValue_3_0= RULE_INT ) ) )? )
            // InternalSpec.g:1047:3: ( (lv_sign_0_0= '-' ) )? ( (lv_intValue_1_0= RULE_INT ) ) (otherlv_2= '.' ( (lv_decimalValue_3_0= RULE_INT ) ) )?
            {
            // InternalSpec.g:1047:3: ( (lv_sign_0_0= '-' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpec.g:1048:4: (lv_sign_0_0= '-' )
                    {
                    // InternalSpec.g:1048:4: (lv_sign_0_0= '-' )
                    // InternalSpec.g:1049:5: lv_sign_0_0= '-'
                    {
                    lv_sign_0_0=(Token)match(input,41,FOLLOW_25); 

                    					newLeafNode(lv_sign_0_0, grammarAccess.getNumberAccess().getSignHyphenMinusKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNumberRule());
                    					}
                    					setWithLastConsumed(current, "sign", lv_sign_0_0, "-");
                    				

                    }


                    }
                    break;

            }

            // InternalSpec.g:1061:3: ( (lv_intValue_1_0= RULE_INT ) )
            // InternalSpec.g:1062:4: (lv_intValue_1_0= RULE_INT )
            {
            // InternalSpec.g:1062:4: (lv_intValue_1_0= RULE_INT )
            // InternalSpec.g:1063:5: lv_intValue_1_0= RULE_INT
            {
            lv_intValue_1_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_intValue_1_0, grammarAccess.getNumberAccess().getIntValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"intValue",
            						lv_intValue_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSpec.g:1079:3: (otherlv_2= '.' ( (lv_decimalValue_3_0= RULE_INT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==42) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSpec.g:1080:4: otherlv_2= '.' ( (lv_decimalValue_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getNumberAccess().getFullStopKeyword_2_0());
                    			
                    // InternalSpec.g:1084:4: ( (lv_decimalValue_3_0= RULE_INT ) )
                    // InternalSpec.g:1085:5: (lv_decimalValue_3_0= RULE_INT )
                    {
                    // InternalSpec.g:1085:5: (lv_decimalValue_3_0= RULE_INT )
                    // InternalSpec.g:1086:6: lv_decimalValue_3_0= RULE_INT
                    {
                    lv_decimalValue_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_decimalValue_3_0, grammarAccess.getNumberAccess().getDecimalValueINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumberRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"decimalValue",
                    							lv_decimalValue_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleExpression"
    // InternalSpec.g:1107:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSpec.g:1107:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSpec.g:1108:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSpec.g:1114:1: ruleExpression returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_f1_1_0= ruleNumber ) ) ) ( ( (lv_operator_2_1= '>' | lv_operator_2_2= '>=' | lv_operator_2_3= '=' | lv_operator_2_4= '<' | lv_operator_2_5= '<=' ) ) ) ( ( (otherlv_3= RULE_ID ) ) | ( (lv_f2_4_0= ruleNumber ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Token lv_operator_2_4=null;
        Token lv_operator_2_5=null;
        Token otherlv_3=null;
        EObject lv_f1_1_0 = null;

        EObject lv_f2_4_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:1120:2: ( ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_f1_1_0= ruleNumber ) ) ) ( ( (lv_operator_2_1= '>' | lv_operator_2_2= '>=' | lv_operator_2_3= '=' | lv_operator_2_4= '<' | lv_operator_2_5= '<=' ) ) ) ( ( (otherlv_3= RULE_ID ) ) | ( (lv_f2_4_0= ruleNumber ) ) ) ) )
            // InternalSpec.g:1121:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_f1_1_0= ruleNumber ) ) ) ( ( (lv_operator_2_1= '>' | lv_operator_2_2= '>=' | lv_operator_2_3= '=' | lv_operator_2_4= '<' | lv_operator_2_5= '<=' ) ) ) ( ( (otherlv_3= RULE_ID ) ) | ( (lv_f2_4_0= ruleNumber ) ) ) )
            {
            // InternalSpec.g:1121:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_f1_1_0= ruleNumber ) ) ) ( ( (lv_operator_2_1= '>' | lv_operator_2_2= '>=' | lv_operator_2_3= '=' | lv_operator_2_4= '<' | lv_operator_2_5= '<=' ) ) ) ( ( (otherlv_3= RULE_ID ) ) | ( (lv_f2_4_0= ruleNumber ) ) ) )
            // InternalSpec.g:1122:3: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_f1_1_0= ruleNumber ) ) ) ( ( (lv_operator_2_1= '>' | lv_operator_2_2= '>=' | lv_operator_2_3= '=' | lv_operator_2_4= '<' | lv_operator_2_5= '<=' ) ) ) ( ( (otherlv_3= RULE_ID ) ) | ( (lv_f2_4_0= ruleNumber ) ) )
            {
            // InternalSpec.g:1122:3: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_f1_1_0= ruleNumber ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_INT||LA11_0==41) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSpec.g:1123:4: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalSpec.g:1123:4: ( (otherlv_0= RULE_ID ) )
                    // InternalSpec.g:1124:5: (otherlv_0= RULE_ID )
                    {
                    // InternalSpec.g:1124:5: (otherlv_0= RULE_ID )
                    // InternalSpec.g:1125:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getS1SignalCrossReference_0_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:1137:4: ( (lv_f1_1_0= ruleNumber ) )
                    {
                    // InternalSpec.g:1137:4: ( (lv_f1_1_0= ruleNumber ) )
                    // InternalSpec.g:1138:5: (lv_f1_1_0= ruleNumber )
                    {
                    // InternalSpec.g:1138:5: (lv_f1_1_0= ruleNumber )
                    // InternalSpec.g:1139:6: lv_f1_1_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getF1NumberParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_f1_1_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"f1",
                    							lv_f1_1_0,
                    							"org.xtext.stlrobust.Spec.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSpec.g:1157:3: ( ( (lv_operator_2_1= '>' | lv_operator_2_2= '>=' | lv_operator_2_3= '=' | lv_operator_2_4= '<' | lv_operator_2_5= '<=' ) ) )
            // InternalSpec.g:1158:4: ( (lv_operator_2_1= '>' | lv_operator_2_2= '>=' | lv_operator_2_3= '=' | lv_operator_2_4= '<' | lv_operator_2_5= '<=' ) )
            {
            // InternalSpec.g:1158:4: ( (lv_operator_2_1= '>' | lv_operator_2_2= '>=' | lv_operator_2_3= '=' | lv_operator_2_4= '<' | lv_operator_2_5= '<=' ) )
            // InternalSpec.g:1159:5: (lv_operator_2_1= '>' | lv_operator_2_2= '>=' | lv_operator_2_3= '=' | lv_operator_2_4= '<' | lv_operator_2_5= '<=' )
            {
            // InternalSpec.g:1159:5: (lv_operator_2_1= '>' | lv_operator_2_2= '>=' | lv_operator_2_3= '=' | lv_operator_2_4= '<' | lv_operator_2_5= '<=' )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 43:
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
            case 46:
                {
                alt12=4;
                }
                break;
            case 47:
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
                    // InternalSpec.g:1160:6: lv_operator_2_1= '>'
                    {
                    lv_operator_2_1=(Token)match(input,43,FOLLOW_13); 

                    						newLeafNode(lv_operator_2_1, grammarAccess.getExpressionAccess().getOperatorGreaterThanSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSpec.g:1171:6: lv_operator_2_2= '>='
                    {
                    lv_operator_2_2=(Token)match(input,44,FOLLOW_13); 

                    						newLeafNode(lv_operator_2_2, grammarAccess.getExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalSpec.g:1182:6: lv_operator_2_3= '='
                    {
                    lv_operator_2_3=(Token)match(input,45,FOLLOW_13); 

                    						newLeafNode(lv_operator_2_3, grammarAccess.getExpressionAccess().getOperatorEqualsSignKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_2_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalSpec.g:1193:6: lv_operator_2_4= '<'
                    {
                    lv_operator_2_4=(Token)match(input,46,FOLLOW_13); 

                    						newLeafNode(lv_operator_2_4, grammarAccess.getExpressionAccess().getOperatorLessThanSignKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_2_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalSpec.g:1204:6: lv_operator_2_5= '<='
                    {
                    lv_operator_2_5=(Token)match(input,47,FOLLOW_13); 

                    						newLeafNode(lv_operator_2_5, grammarAccess.getExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_2_5, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSpec.g:1217:3: ( ( (otherlv_3= RULE_ID ) ) | ( (lv_f2_4_0= ruleNumber ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_INT||LA13_0==41) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSpec.g:1218:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalSpec.g:1218:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSpec.g:1219:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSpec.g:1219:5: (otherlv_3= RULE_ID )
                    // InternalSpec.g:1220:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getS2SignalCrossReference_2_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:1232:4: ( (lv_f2_4_0= ruleNumber ) )
                    {
                    // InternalSpec.g:1232:4: ( (lv_f2_4_0= ruleNumber ) )
                    // InternalSpec.g:1233:5: (lv_f2_4_0= ruleNumber )
                    {
                    // InternalSpec.g:1233:5: (lv_f2_4_0= ruleNumber )
                    // InternalSpec.g:1234:6: lv_f2_4_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getF2NumberParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_f2_4_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"f2",
                    							lv_f2_4_0,
                    							"org.xtext.stlrobust.Spec.Number");
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTime"
    // InternalSpec.g:1256:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalSpec.g:1256:45: (iv_ruleTime= ruleTime EOF )
            // InternalSpec.g:1257:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalSpec.g:1263:1: ruleTime returns [EObject current=null] : (this_UpperTimeBound_0= ruleUpperTimeBound | this_LowerTimeBound_1= ruleLowerTimeBound | this_Interval_2= ruleInterval ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        EObject this_UpperTimeBound_0 = null;

        EObject this_LowerTimeBound_1 = null;

        EObject this_Interval_2 = null;



        	enterRule();

        try {
            // InternalSpec.g:1269:2: ( (this_UpperTimeBound_0= ruleUpperTimeBound | this_LowerTimeBound_1= ruleLowerTimeBound | this_Interval_2= ruleInterval ) )
            // InternalSpec.g:1270:2: (this_UpperTimeBound_0= ruleUpperTimeBound | this_LowerTimeBound_1= ruleLowerTimeBound | this_Interval_2= ruleInterval )
            {
            // InternalSpec.g:1270:2: (this_UpperTimeBound_0= ruleUpperTimeBound | this_LowerTimeBound_1= ruleLowerTimeBound | this_Interval_2= ruleInterval )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt14=1;
                }
                break;
            case 49:
                {
                alt14=2;
                }
                break;
            case 50:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSpec.g:1271:3: this_UpperTimeBound_0= ruleUpperTimeBound
                    {

                    			newCompositeNode(grammarAccess.getTimeAccess().getUpperTimeBoundParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UpperTimeBound_0=ruleUpperTimeBound();

                    state._fsp--;


                    			current = this_UpperTimeBound_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSpec.g:1280:3: this_LowerTimeBound_1= ruleLowerTimeBound
                    {

                    			newCompositeNode(grammarAccess.getTimeAccess().getLowerTimeBoundParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LowerTimeBound_1=ruleLowerTimeBound();

                    state._fsp--;


                    			current = this_LowerTimeBound_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSpec.g:1289:3: this_Interval_2= ruleInterval
                    {

                    			newCompositeNode(grammarAccess.getTimeAccess().getIntervalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interval_2=ruleInterval();

                    state._fsp--;


                    			current = this_Interval_2;
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
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleUpperTimeBound"
    // InternalSpec.g:1301:1: entryRuleUpperTimeBound returns [EObject current=null] : iv_ruleUpperTimeBound= ruleUpperTimeBound EOF ;
    public final EObject entryRuleUpperTimeBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperTimeBound = null;


        try {
            // InternalSpec.g:1301:55: (iv_ruleUpperTimeBound= ruleUpperTimeBound EOF )
            // InternalSpec.g:1302:2: iv_ruleUpperTimeBound= ruleUpperTimeBound EOF
            {
             newCompositeNode(grammarAccess.getUpperTimeBoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpperTimeBound=ruleUpperTimeBound();

            state._fsp--;

             current =iv_ruleUpperTimeBound; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpperTimeBound"


    // $ANTLR start "ruleUpperTimeBound"
    // InternalSpec.g:1308:1: ruleUpperTimeBound returns [EObject current=null] : (otherlv_0= 'within' ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleUpperTimeBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_unit_2_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:1314:2: ( (otherlv_0= 'within' ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) )
            // InternalSpec.g:1315:2: (otherlv_0= 'within' ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            {
            // InternalSpec.g:1315:2: (otherlv_0= 'within' ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            // InternalSpec.g:1316:3: otherlv_0= 'within' ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperTimeBoundAccess().getWithinKeyword_0());
            		
            // InternalSpec.g:1320:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalSpec.g:1321:4: (lv_value_1_0= RULE_INT )
            {
            // InternalSpec.g:1321:4: (lv_value_1_0= RULE_INT )
            // InternalSpec.g:1322:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_value_1_0, grammarAccess.getUpperTimeBoundAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpperTimeBoundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSpec.g:1338:3: ( (lv_unit_2_0= ruleTimeUnit ) )
            // InternalSpec.g:1339:4: (lv_unit_2_0= ruleTimeUnit )
            {
            // InternalSpec.g:1339:4: (lv_unit_2_0= ruleTimeUnit )
            // InternalSpec.g:1340:5: lv_unit_2_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getUpperTimeBoundAccess().getUnitTimeUnitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_2_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpperTimeBoundRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_2_0,
            						"org.xtext.stlrobust.Spec.TimeUnit");
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
    // $ANTLR end "ruleUpperTimeBound"


    // $ANTLR start "entryRuleLowerTimeBound"
    // InternalSpec.g:1361:1: entryRuleLowerTimeBound returns [EObject current=null] : iv_ruleLowerTimeBound= ruleLowerTimeBound EOF ;
    public final EObject entryRuleLowerTimeBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerTimeBound = null;


        try {
            // InternalSpec.g:1361:55: (iv_ruleLowerTimeBound= ruleLowerTimeBound EOF )
            // InternalSpec.g:1362:2: iv_ruleLowerTimeBound= ruleLowerTimeBound EOF
            {
             newCompositeNode(grammarAccess.getLowerTimeBoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLowerTimeBound=ruleLowerTimeBound();

            state._fsp--;

             current =iv_ruleLowerTimeBound; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLowerTimeBound"


    // $ANTLR start "ruleLowerTimeBound"
    // InternalSpec.g:1368:1: ruleLowerTimeBound returns [EObject current=null] : (otherlv_0= 'after' ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleLowerTimeBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_unit_2_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:1374:2: ( (otherlv_0= 'after' ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) )
            // InternalSpec.g:1375:2: (otherlv_0= 'after' ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            {
            // InternalSpec.g:1375:2: (otherlv_0= 'after' ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            // InternalSpec.g:1376:3: otherlv_0= 'after' ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerTimeBoundAccess().getAfterKeyword_0());
            		
            // InternalSpec.g:1380:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalSpec.g:1381:4: (lv_value_1_0= RULE_INT )
            {
            // InternalSpec.g:1381:4: (lv_value_1_0= RULE_INT )
            // InternalSpec.g:1382:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_value_1_0, grammarAccess.getLowerTimeBoundAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLowerTimeBoundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSpec.g:1398:3: ( (lv_unit_2_0= ruleTimeUnit ) )
            // InternalSpec.g:1399:4: (lv_unit_2_0= ruleTimeUnit )
            {
            // InternalSpec.g:1399:4: (lv_unit_2_0= ruleTimeUnit )
            // InternalSpec.g:1400:5: lv_unit_2_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getLowerTimeBoundAccess().getUnitTimeUnitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_2_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLowerTimeBoundRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_2_0,
            						"org.xtext.stlrobust.Spec.TimeUnit");
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
    // $ANTLR end "ruleLowerTimeBound"


    // $ANTLR start "entryRuleInterval"
    // InternalSpec.g:1421:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalSpec.g:1421:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalSpec.g:1422:2: iv_ruleInterval= ruleInterval EOF
            {
             newCompositeNode(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterval=ruleInterval();

            state._fsp--;

             current =iv_ruleInterval; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterval"


    // $ANTLR start "ruleInterval"
    // InternalSpec.g:1428:1: ruleInterval returns [EObject current=null] : (otherlv_0= 'between' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= 'and' ( (lv_max_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token lv_max_3_0=null;
        AntlrDatatypeRuleToken lv_unit_4_0 = null;



        	enterRule();

        try {
            // InternalSpec.g:1434:2: ( (otherlv_0= 'between' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= 'and' ( (lv_max_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleTimeUnit ) ) ) )
            // InternalSpec.g:1435:2: (otherlv_0= 'between' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= 'and' ( (lv_max_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleTimeUnit ) ) )
            {
            // InternalSpec.g:1435:2: (otherlv_0= 'between' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= 'and' ( (lv_max_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleTimeUnit ) ) )
            // InternalSpec.g:1436:3: otherlv_0= 'between' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= 'and' ( (lv_max_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleTimeUnit ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getIntervalAccess().getBetweenKeyword_0());
            		
            // InternalSpec.g:1440:3: ( (lv_min_1_0= RULE_INT ) )
            // InternalSpec.g:1441:4: (lv_min_1_0= RULE_INT )
            {
            // InternalSpec.g:1441:4: (lv_min_1_0= RULE_INT )
            // InternalSpec.g:1442:5: lv_min_1_0= RULE_INT
            {
            lv_min_1_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_min_1_0, grammarAccess.getIntervalAccess().getMinINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntervalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getIntervalAccess().getAndKeyword_2());
            		
            // InternalSpec.g:1462:3: ( (lv_max_3_0= RULE_INT ) )
            // InternalSpec.g:1463:4: (lv_max_3_0= RULE_INT )
            {
            // InternalSpec.g:1463:4: (lv_max_3_0= RULE_INT )
            // InternalSpec.g:1464:5: lv_max_3_0= RULE_INT
            {
            lv_max_3_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_max_3_0, grammarAccess.getIntervalAccess().getMaxINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntervalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSpec.g:1480:3: ( (lv_unit_4_0= ruleTimeUnit ) )
            // InternalSpec.g:1481:4: (lv_unit_4_0= ruleTimeUnit )
            {
            // InternalSpec.g:1481:4: (lv_unit_4_0= ruleTimeUnit )
            // InternalSpec.g:1482:5: lv_unit_4_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getUnitTimeUnitParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_4_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervalRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_4_0,
            						"org.xtext.stlrobust.Spec.TimeUnit");
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
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleTimeUnit"
    // InternalSpec.g:1503:1: entryRuleTimeUnit returns [String current=null] : iv_ruleTimeUnit= ruleTimeUnit EOF ;
    public final String entryRuleTimeUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeUnit = null;


        try {
            // InternalSpec.g:1503:48: (iv_ruleTimeUnit= ruleTimeUnit EOF )
            // InternalSpec.g:1504:2: iv_ruleTimeUnit= ruleTimeUnit EOF
            {
             newCompositeNode(grammarAccess.getTimeUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeUnit=ruleTimeUnit();

            state._fsp--;

             current =iv_ruleTimeUnit.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeUnit"


    // $ANTLR start "ruleTimeUnit"
    // InternalSpec.g:1510:1: ruleTimeUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ms' | kw= 's' | kw= 'min' ) ;
    public final AntlrDatatypeRuleToken ruleTimeUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSpec.g:1516:2: ( (kw= 'ms' | kw= 's' | kw= 'min' ) )
            // InternalSpec.g:1517:2: (kw= 'ms' | kw= 's' | kw= 'min' )
            {
            // InternalSpec.g:1517:2: (kw= 'ms' | kw= 's' | kw= 'min' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt15=1;
                }
                break;
            case 52:
                {
                alt15=2;
                }
                break;
            case 53:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSpec.g:1518:3: kw= 'ms'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeUnitAccess().getMsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSpec.g:1524:3: kw= 's'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeUnitAccess().getSKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSpec.g:1530:3: kw= 'min'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeUnitAccess().getMinKeyword_2());
                    		

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
    // $ANTLR end "ruleTimeUnit"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\16\uffff\1\22\1\uffff\1\22\4\uffff\1\22";
    static final String dfa_3s = "\1\21\2\uffff\1\4\1\uffff\1\53\1\6\1\52\5\4\1\6\1\20\1\6\1\20\1\53\2\uffff\1\6\1\20";
    static final String dfa_4s = "\1\24\2\uffff\1\51\1\uffff\1\57\1\6\1\57\5\51\1\6\1\26\1\6\1\52\1\57\2\uffff\1\6\1\26";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\uffff\1\4\15\uffff\1\3\1\5\2\uffff";
    static final String dfa_6s = "\26\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4",
            "",
            "",
            "\1\5\1\uffff\1\7\42\uffff\1\6",
            "",
            "\1\10\1\11\1\12\1\13\1\14",
            "\1\7",
            "\1\15\1\10\1\11\1\12\1\13\1\14",
            "\1\16\1\uffff\1\20\42\uffff\1\17",
            "\1\16\1\uffff\1\20\42\uffff\1\17",
            "\1\16\1\uffff\1\20\42\uffff\1\17",
            "\1\16\1\uffff\1\20\42\uffff\1\17",
            "\1\16\1\uffff\1\20\42\uffff\1\17",
            "\1\21",
            "\1\22\5\uffff\1\23",
            "\1\20",
            "\1\22\5\uffff\1\23\23\uffff\1\24",
            "\1\10\1\11\1\12\1\13\1\14",
            "",
            "",
            "\1\25",
            "\1\22\5\uffff\1\23"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "289:2: ( ( () otherlv_1= 'Globally' ) | ( () otherlv_3= 'Before' ( (lv_r_4_0= ruleExpression ) ) ) | ( () otherlv_6= 'After' ( (lv_q_7_0= ruleExpression ) ) ) | ( () otherlv_9= 'Between' ( (lv_q_10_0= ruleExpression ) ) otherlv_11= 'and' ( (lv_r_12_0= ruleExpression ) ) ) | ( () otherlv_14= 'After' ( (lv_q_15_0= ruleExpression ) ) otherlv_16= 'until' ( (lv_r_17_0= ruleExpression ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000001FF800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020000000050L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0007000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0007010400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000F80000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0038000000000000L});

}