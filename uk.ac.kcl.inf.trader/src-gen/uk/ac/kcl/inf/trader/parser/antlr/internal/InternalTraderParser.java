package uk.ac.kcl.inf.trader.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.trader.services.TraderGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTraderParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'connect'", "'to'", "'trade'", "'on'", "'server'", "'with'", "'login'", "','", "'password'", "'timeframe'", "'create'", "'bot'", "'strategy'", "'using'", "'lot'", "'size'", "'see'", "'registered'", "'bots'", "'execute'", "'for'", "'days'", "'hours'", "'minutes'", "'seconds'", "'var'", "'='", "'loop'", "'times'", "'do'", "'end'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'.'", "'buyAndHold'", "'meanReversion'", "'M1'", "'M2'", "'M3'", "'M4'", "'M5'", "'M6'", "'M10'", "'M12'", "'M20'", "'M30'", "'H1'", "'H2'", "'H3'", "'H4'", "'H6'", "'H8'", "'H12'", "'D1'", "'W1'", "'MN1'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
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


        public InternalTraderParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTraderParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTraderParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTrader.g"; }



     	private TraderGrammarAccess grammarAccess;

        public InternalTraderParser(TokenStream input, TraderGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TraderProgram";
       	}

       	@Override
       	protected TraderGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTraderProgram"
    // InternalTrader.g:65:1: entryRuleTraderProgram returns [EObject current=null] : iv_ruleTraderProgram= ruleTraderProgram EOF ;
    public final EObject entryRuleTraderProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraderProgram = null;


        try {
            // InternalTrader.g:65:54: (iv_ruleTraderProgram= ruleTraderProgram EOF )
            // InternalTrader.g:66:2: iv_ruleTraderProgram= ruleTraderProgram EOF
            {
             newCompositeNode(grammarAccess.getTraderProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTraderProgram=ruleTraderProgram();

            state._fsp--;

             current =iv_ruleTraderProgram; 
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
    // $ANTLR end "entryRuleTraderProgram"


    // $ANTLR start "ruleTraderProgram"
    // InternalTrader.g:72:1: ruleTraderProgram returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleTraderProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalTrader.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalTrader.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==21||LA1_0==27||LA1_0==30||LA1_0==36||LA1_0==38) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTrader.g:80:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalTrader.g:80:3: (lv_statements_0_0= ruleStatement )
            	    // InternalTrader.g:81:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getTraderProgramAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getTraderProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"uk.ac.kcl.inf.trader.Trader.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraderProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalTrader.g:101:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalTrader.g:101:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalTrader.g:102:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTrader.g:108:1: ruleStatement returns [EObject current=null] : (this_ConnectStatement_0= ruleConnectStatement | this_CreateBotStatement_1= ruleCreateBotStatement | this_ListBotsStatement_2= ruleListBotsStatement | this_ExecuteBotsStatement_3= ruleExecuteBotsStatement | this_VariableDeclaration_4= ruleVariableDeclaration | this_LoopStatement_5= ruleLoopStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectStatement_0 = null;

        EObject this_CreateBotStatement_1 = null;

        EObject this_ListBotsStatement_2 = null;

        EObject this_ExecuteBotsStatement_3 = null;

        EObject this_VariableDeclaration_4 = null;

        EObject this_LoopStatement_5 = null;



        	enterRule();

        try {
            // InternalTrader.g:114:2: ( (this_ConnectStatement_0= ruleConnectStatement | this_CreateBotStatement_1= ruleCreateBotStatement | this_ListBotsStatement_2= ruleListBotsStatement | this_ExecuteBotsStatement_3= ruleExecuteBotsStatement | this_VariableDeclaration_4= ruleVariableDeclaration | this_LoopStatement_5= ruleLoopStatement ) )
            // InternalTrader.g:115:2: (this_ConnectStatement_0= ruleConnectStatement | this_CreateBotStatement_1= ruleCreateBotStatement | this_ListBotsStatement_2= ruleListBotsStatement | this_ExecuteBotsStatement_3= ruleExecuteBotsStatement | this_VariableDeclaration_4= ruleVariableDeclaration | this_LoopStatement_5= ruleLoopStatement )
            {
            // InternalTrader.g:115:2: (this_ConnectStatement_0= ruleConnectStatement | this_CreateBotStatement_1= ruleCreateBotStatement | this_ListBotsStatement_2= ruleListBotsStatement | this_ExecuteBotsStatement_3= ruleExecuteBotsStatement | this_VariableDeclaration_4= ruleVariableDeclaration | this_LoopStatement_5= ruleLoopStatement )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            case 36:
                {
                alt2=5;
                }
                break;
            case 38:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTrader.g:116:3: this_ConnectStatement_0= ruleConnectStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getConnectStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConnectStatement_0=ruleConnectStatement();

                    state._fsp--;


                    			current = this_ConnectStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTrader.g:125:3: this_CreateBotStatement_1= ruleCreateBotStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCreateBotStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CreateBotStatement_1=ruleCreateBotStatement();

                    state._fsp--;


                    			current = this_CreateBotStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTrader.g:134:3: this_ListBotsStatement_2= ruleListBotsStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getListBotsStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListBotsStatement_2=ruleListBotsStatement();

                    state._fsp--;


                    			current = this_ListBotsStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTrader.g:143:3: this_ExecuteBotsStatement_3= ruleExecuteBotsStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getExecuteBotsStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExecuteBotsStatement_3=ruleExecuteBotsStatement();

                    state._fsp--;


                    			current = this_ExecuteBotsStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTrader.g:152:3: this_VariableDeclaration_4= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_4=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTrader.g:161:3: this_LoopStatement_5= ruleLoopStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoopStatement_5=ruleLoopStatement();

                    state._fsp--;


                    			current = this_LoopStatement_5;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleConnectStatement"
    // InternalTrader.g:173:1: entryRuleConnectStatement returns [EObject current=null] : iv_ruleConnectStatement= ruleConnectStatement EOF ;
    public final EObject entryRuleConnectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectStatement = null;


        try {
            // InternalTrader.g:173:57: (iv_ruleConnectStatement= ruleConnectStatement EOF )
            // InternalTrader.g:174:2: iv_ruleConnectStatement= ruleConnectStatement EOF
            {
             newCompositeNode(grammarAccess.getConnectStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectStatement=ruleConnectStatement();

            state._fsp--;

             current =iv_ruleConnectStatement; 
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
    // $ANTLR end "entryRuleConnectStatement"


    // $ANTLR start "ruleConnectStatement"
    // InternalTrader.g:180:1: ruleConnectStatement returns [EObject current=null] : (otherlv_0= 'connect' otherlv_1= 'to' otherlv_2= 'trade' ( (lv_tickerName_3_0= ruleStringPrimary ) ) otherlv_4= 'on' otherlv_5= 'server' ( (lv_brokerName_6_0= ruleStringPrimary ) ) otherlv_7= 'with' otherlv_8= 'login' ( (lv_username_9_0= ruleStringPrimary ) ) otherlv_10= ',' otherlv_11= 'password' ( (lv_password_12_0= ruleStringPrimary ) ) otherlv_13= ',' otherlv_14= 'timeframe' ( (lv_timeframe_15_0= ruleTimeFrameDef ) ) ) ;
    public final EObject ruleConnectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_tickerName_3_0 = null;

        EObject lv_brokerName_6_0 = null;

        EObject lv_username_9_0 = null;

        EObject lv_password_12_0 = null;

        Enumerator lv_timeframe_15_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:186:2: ( (otherlv_0= 'connect' otherlv_1= 'to' otherlv_2= 'trade' ( (lv_tickerName_3_0= ruleStringPrimary ) ) otherlv_4= 'on' otherlv_5= 'server' ( (lv_brokerName_6_0= ruleStringPrimary ) ) otherlv_7= 'with' otherlv_8= 'login' ( (lv_username_9_0= ruleStringPrimary ) ) otherlv_10= ',' otherlv_11= 'password' ( (lv_password_12_0= ruleStringPrimary ) ) otherlv_13= ',' otherlv_14= 'timeframe' ( (lv_timeframe_15_0= ruleTimeFrameDef ) ) ) )
            // InternalTrader.g:187:2: (otherlv_0= 'connect' otherlv_1= 'to' otherlv_2= 'trade' ( (lv_tickerName_3_0= ruleStringPrimary ) ) otherlv_4= 'on' otherlv_5= 'server' ( (lv_brokerName_6_0= ruleStringPrimary ) ) otherlv_7= 'with' otherlv_8= 'login' ( (lv_username_9_0= ruleStringPrimary ) ) otherlv_10= ',' otherlv_11= 'password' ( (lv_password_12_0= ruleStringPrimary ) ) otherlv_13= ',' otherlv_14= 'timeframe' ( (lv_timeframe_15_0= ruleTimeFrameDef ) ) )
            {
            // InternalTrader.g:187:2: (otherlv_0= 'connect' otherlv_1= 'to' otherlv_2= 'trade' ( (lv_tickerName_3_0= ruleStringPrimary ) ) otherlv_4= 'on' otherlv_5= 'server' ( (lv_brokerName_6_0= ruleStringPrimary ) ) otherlv_7= 'with' otherlv_8= 'login' ( (lv_username_9_0= ruleStringPrimary ) ) otherlv_10= ',' otherlv_11= 'password' ( (lv_password_12_0= ruleStringPrimary ) ) otherlv_13= ',' otherlv_14= 'timeframe' ( (lv_timeframe_15_0= ruleTimeFrameDef ) ) )
            // InternalTrader.g:188:3: otherlv_0= 'connect' otherlv_1= 'to' otherlv_2= 'trade' ( (lv_tickerName_3_0= ruleStringPrimary ) ) otherlv_4= 'on' otherlv_5= 'server' ( (lv_brokerName_6_0= ruleStringPrimary ) ) otherlv_7= 'with' otherlv_8= 'login' ( (lv_username_9_0= ruleStringPrimary ) ) otherlv_10= ',' otherlv_11= 'password' ( (lv_password_12_0= ruleStringPrimary ) ) otherlv_13= ',' otherlv_14= 'timeframe' ( (lv_timeframe_15_0= ruleTimeFrameDef ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectStatementAccess().getConnectKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectStatementAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectStatementAccess().getTradeKeyword_2());
            		
            // InternalTrader.g:200:3: ( (lv_tickerName_3_0= ruleStringPrimary ) )
            // InternalTrader.g:201:4: (lv_tickerName_3_0= ruleStringPrimary )
            {
            // InternalTrader.g:201:4: (lv_tickerName_3_0= ruleStringPrimary )
            // InternalTrader.g:202:5: lv_tickerName_3_0= ruleStringPrimary
            {

            					newCompositeNode(grammarAccess.getConnectStatementAccess().getTickerNameStringPrimaryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_tickerName_3_0=ruleStringPrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectStatementRule());
            					}
            					set(
            						current,
            						"tickerName",
            						lv_tickerName_3_0,
            						"uk.ac.kcl.inf.trader.Trader.StringPrimary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getConnectStatementAccess().getOnKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectStatementAccess().getServerKeyword_5());
            		
            // InternalTrader.g:227:3: ( (lv_brokerName_6_0= ruleStringPrimary ) )
            // InternalTrader.g:228:4: (lv_brokerName_6_0= ruleStringPrimary )
            {
            // InternalTrader.g:228:4: (lv_brokerName_6_0= ruleStringPrimary )
            // InternalTrader.g:229:5: lv_brokerName_6_0= ruleStringPrimary
            {

            					newCompositeNode(grammarAccess.getConnectStatementAccess().getBrokerNameStringPrimaryParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_brokerName_6_0=ruleStringPrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectStatementRule());
            					}
            					set(
            						current,
            						"brokerName",
            						lv_brokerName_6_0,
            						"uk.ac.kcl.inf.trader.Trader.StringPrimary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getConnectStatementAccess().getWithKeyword_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getConnectStatementAccess().getLoginKeyword_8());
            		
            // InternalTrader.g:254:3: ( (lv_username_9_0= ruleStringPrimary ) )
            // InternalTrader.g:255:4: (lv_username_9_0= ruleStringPrimary )
            {
            // InternalTrader.g:255:4: (lv_username_9_0= ruleStringPrimary )
            // InternalTrader.g:256:5: lv_username_9_0= ruleStringPrimary
            {

            					newCompositeNode(grammarAccess.getConnectStatementAccess().getUsernameStringPrimaryParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_11);
            lv_username_9_0=ruleStringPrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectStatementRule());
            					}
            					set(
            						current,
            						"username",
            						lv_username_9_0,
            						"uk.ac.kcl.inf.trader.Trader.StringPrimary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getConnectStatementAccess().getCommaKeyword_10());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getConnectStatementAccess().getPasswordKeyword_11());
            		
            // InternalTrader.g:281:3: ( (lv_password_12_0= ruleStringPrimary ) )
            // InternalTrader.g:282:4: (lv_password_12_0= ruleStringPrimary )
            {
            // InternalTrader.g:282:4: (lv_password_12_0= ruleStringPrimary )
            // InternalTrader.g:283:5: lv_password_12_0= ruleStringPrimary
            {

            					newCompositeNode(grammarAccess.getConnectStatementAccess().getPasswordStringPrimaryParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_11);
            lv_password_12_0=ruleStringPrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectStatementRule());
            					}
            					set(
            						current,
            						"password",
            						lv_password_12_0,
            						"uk.ac.kcl.inf.trader.Trader.StringPrimary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getConnectStatementAccess().getCommaKeyword_13());
            		
            otherlv_14=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_14, grammarAccess.getConnectStatementAccess().getTimeframeKeyword_14());
            		
            // InternalTrader.g:308:3: ( (lv_timeframe_15_0= ruleTimeFrameDef ) )
            // InternalTrader.g:309:4: (lv_timeframe_15_0= ruleTimeFrameDef )
            {
            // InternalTrader.g:309:4: (lv_timeframe_15_0= ruleTimeFrameDef )
            // InternalTrader.g:310:5: lv_timeframe_15_0= ruleTimeFrameDef
            {

            					newCompositeNode(grammarAccess.getConnectStatementAccess().getTimeframeTimeFrameDefEnumRuleCall_15_0());
            				
            pushFollow(FOLLOW_2);
            lv_timeframe_15_0=ruleTimeFrameDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectStatementRule());
            					}
            					set(
            						current,
            						"timeframe",
            						lv_timeframe_15_0,
            						"uk.ac.kcl.inf.trader.Trader.TimeFrameDef");
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
    // $ANTLR end "ruleConnectStatement"


    // $ANTLR start "entryRuleCreateBotStatement"
    // InternalTrader.g:331:1: entryRuleCreateBotStatement returns [EObject current=null] : iv_ruleCreateBotStatement= ruleCreateBotStatement EOF ;
    public final EObject entryRuleCreateBotStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateBotStatement = null;


        try {
            // InternalTrader.g:331:59: (iv_ruleCreateBotStatement= ruleCreateBotStatement EOF )
            // InternalTrader.g:332:2: iv_ruleCreateBotStatement= ruleCreateBotStatement EOF
            {
             newCompositeNode(grammarAccess.getCreateBotStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateBotStatement=ruleCreateBotStatement();

            state._fsp--;

             current =iv_ruleCreateBotStatement; 
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
    // $ANTLR end "entryRuleCreateBotStatement"


    // $ANTLR start "ruleCreateBotStatement"
    // InternalTrader.g:338:1: ruleCreateBotStatement returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'bot' otherlv_2= 'with' otherlv_3= 'strategy' ( (lv_strategy_4_0= ruleStrategyDef ) ) otherlv_5= 'using' otherlv_6= 'lot' otherlv_7= 'size' ( (lv_lotSize_8_0= ruleAddition ) ) ) ;
    public final EObject ruleCreateBotStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_strategy_4_0 = null;

        EObject lv_lotSize_8_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:344:2: ( (otherlv_0= 'create' otherlv_1= 'bot' otherlv_2= 'with' otherlv_3= 'strategy' ( (lv_strategy_4_0= ruleStrategyDef ) ) otherlv_5= 'using' otherlv_6= 'lot' otherlv_7= 'size' ( (lv_lotSize_8_0= ruleAddition ) ) ) )
            // InternalTrader.g:345:2: (otherlv_0= 'create' otherlv_1= 'bot' otherlv_2= 'with' otherlv_3= 'strategy' ( (lv_strategy_4_0= ruleStrategyDef ) ) otherlv_5= 'using' otherlv_6= 'lot' otherlv_7= 'size' ( (lv_lotSize_8_0= ruleAddition ) ) )
            {
            // InternalTrader.g:345:2: (otherlv_0= 'create' otherlv_1= 'bot' otherlv_2= 'with' otherlv_3= 'strategy' ( (lv_strategy_4_0= ruleStrategyDef ) ) otherlv_5= 'using' otherlv_6= 'lot' otherlv_7= 'size' ( (lv_lotSize_8_0= ruleAddition ) ) )
            // InternalTrader.g:346:3: otherlv_0= 'create' otherlv_1= 'bot' otherlv_2= 'with' otherlv_3= 'strategy' ( (lv_strategy_4_0= ruleStrategyDef ) ) otherlv_5= 'using' otherlv_6= 'lot' otherlv_7= 'size' ( (lv_lotSize_8_0= ruleAddition ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateBotStatementAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateBotStatementAccess().getBotKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateBotStatementAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateBotStatementAccess().getStrategyKeyword_3());
            		
            // InternalTrader.g:362:3: ( (lv_strategy_4_0= ruleStrategyDef ) )
            // InternalTrader.g:363:4: (lv_strategy_4_0= ruleStrategyDef )
            {
            // InternalTrader.g:363:4: (lv_strategy_4_0= ruleStrategyDef )
            // InternalTrader.g:364:5: lv_strategy_4_0= ruleStrategyDef
            {

            					newCompositeNode(grammarAccess.getCreateBotStatementAccess().getStrategyStrategyDefEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_strategy_4_0=ruleStrategyDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateBotStatementRule());
            					}
            					set(
            						current,
            						"strategy",
            						lv_strategy_4_0,
            						"uk.ac.kcl.inf.trader.Trader.StrategyDef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getCreateBotStatementAccess().getUsingKeyword_5());
            		
            otherlv_6=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getCreateBotStatementAccess().getLotKeyword_6());
            		
            otherlv_7=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getCreateBotStatementAccess().getSizeKeyword_7());
            		
            // InternalTrader.g:393:3: ( (lv_lotSize_8_0= ruleAddition ) )
            // InternalTrader.g:394:4: (lv_lotSize_8_0= ruleAddition )
            {
            // InternalTrader.g:394:4: (lv_lotSize_8_0= ruleAddition )
            // InternalTrader.g:395:5: lv_lotSize_8_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getCreateBotStatementAccess().getLotSizeAdditionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_lotSize_8_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateBotStatementRule());
            					}
            					set(
            						current,
            						"lotSize",
            						lv_lotSize_8_0,
            						"uk.ac.kcl.inf.trader.Trader.Addition");
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
    // $ANTLR end "ruleCreateBotStatement"


    // $ANTLR start "entryRuleListBotsStatement"
    // InternalTrader.g:416:1: entryRuleListBotsStatement returns [EObject current=null] : iv_ruleListBotsStatement= ruleListBotsStatement EOF ;
    public final EObject entryRuleListBotsStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListBotsStatement = null;


        try {
            // InternalTrader.g:416:58: (iv_ruleListBotsStatement= ruleListBotsStatement EOF )
            // InternalTrader.g:417:2: iv_ruleListBotsStatement= ruleListBotsStatement EOF
            {
             newCompositeNode(grammarAccess.getListBotsStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListBotsStatement=ruleListBotsStatement();

            state._fsp--;

             current =iv_ruleListBotsStatement; 
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
    // $ANTLR end "entryRuleListBotsStatement"


    // $ANTLR start "ruleListBotsStatement"
    // InternalTrader.g:423:1: ruleListBotsStatement returns [EObject current=null] : ( ( (lv_listCommand_0_0= 'see' ) ) otherlv_1= 'registered' otherlv_2= 'bots' ) ;
    public final EObject ruleListBotsStatement() throws RecognitionException {
        EObject current = null;

        Token lv_listCommand_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTrader.g:429:2: ( ( ( (lv_listCommand_0_0= 'see' ) ) otherlv_1= 'registered' otherlv_2= 'bots' ) )
            // InternalTrader.g:430:2: ( ( (lv_listCommand_0_0= 'see' ) ) otherlv_1= 'registered' otherlv_2= 'bots' )
            {
            // InternalTrader.g:430:2: ( ( (lv_listCommand_0_0= 'see' ) ) otherlv_1= 'registered' otherlv_2= 'bots' )
            // InternalTrader.g:431:3: ( (lv_listCommand_0_0= 'see' ) ) otherlv_1= 'registered' otherlv_2= 'bots'
            {
            // InternalTrader.g:431:3: ( (lv_listCommand_0_0= 'see' ) )
            // InternalTrader.g:432:4: (lv_listCommand_0_0= 'see' )
            {
            // InternalTrader.g:432:4: (lv_listCommand_0_0= 'see' )
            // InternalTrader.g:433:5: lv_listCommand_0_0= 'see'
            {
            lv_listCommand_0_0=(Token)match(input,27,FOLLOW_22); 

            					newLeafNode(lv_listCommand_0_0, grammarAccess.getListBotsStatementAccess().getListCommandSeeKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListBotsStatementRule());
            					}
            					setWithLastConsumed(current, "listCommand", lv_listCommand_0_0, "see");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getListBotsStatementAccess().getRegisteredKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getListBotsStatementAccess().getBotsKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListBotsStatement"


    // $ANTLR start "entryRuleExecuteBotsStatement"
    // InternalTrader.g:457:1: entryRuleExecuteBotsStatement returns [EObject current=null] : iv_ruleExecuteBotsStatement= ruleExecuteBotsStatement EOF ;
    public final EObject entryRuleExecuteBotsStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecuteBotsStatement = null;


        try {
            // InternalTrader.g:457:61: (iv_ruleExecuteBotsStatement= ruleExecuteBotsStatement EOF )
            // InternalTrader.g:458:2: iv_ruleExecuteBotsStatement= ruleExecuteBotsStatement EOF
            {
             newCompositeNode(grammarAccess.getExecuteBotsStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecuteBotsStatement=ruleExecuteBotsStatement();

            state._fsp--;

             current =iv_ruleExecuteBotsStatement; 
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
    // $ANTLR end "entryRuleExecuteBotsStatement"


    // $ANTLR start "ruleExecuteBotsStatement"
    // InternalTrader.g:464:1: ruleExecuteBotsStatement returns [EObject current=null] : (otherlv_0= 'execute' otherlv_1= 'bots' otherlv_2= 'for' ( (lv_days_3_0= ruleAddition ) ) otherlv_4= 'days' ( (lv_hours_5_0= ruleAddition ) ) otherlv_6= 'hours' ( (lv_minutes_7_0= ruleAddition ) ) otherlv_8= 'minutes' ( (lv_seconds_9_0= ruleAddition ) ) otherlv_10= 'seconds' ) ;
    public final EObject ruleExecuteBotsStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_days_3_0 = null;

        EObject lv_hours_5_0 = null;

        EObject lv_minutes_7_0 = null;

        EObject lv_seconds_9_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:470:2: ( (otherlv_0= 'execute' otherlv_1= 'bots' otherlv_2= 'for' ( (lv_days_3_0= ruleAddition ) ) otherlv_4= 'days' ( (lv_hours_5_0= ruleAddition ) ) otherlv_6= 'hours' ( (lv_minutes_7_0= ruleAddition ) ) otherlv_8= 'minutes' ( (lv_seconds_9_0= ruleAddition ) ) otherlv_10= 'seconds' ) )
            // InternalTrader.g:471:2: (otherlv_0= 'execute' otherlv_1= 'bots' otherlv_2= 'for' ( (lv_days_3_0= ruleAddition ) ) otherlv_4= 'days' ( (lv_hours_5_0= ruleAddition ) ) otherlv_6= 'hours' ( (lv_minutes_7_0= ruleAddition ) ) otherlv_8= 'minutes' ( (lv_seconds_9_0= ruleAddition ) ) otherlv_10= 'seconds' )
            {
            // InternalTrader.g:471:2: (otherlv_0= 'execute' otherlv_1= 'bots' otherlv_2= 'for' ( (lv_days_3_0= ruleAddition ) ) otherlv_4= 'days' ( (lv_hours_5_0= ruleAddition ) ) otherlv_6= 'hours' ( (lv_minutes_7_0= ruleAddition ) ) otherlv_8= 'minutes' ( (lv_seconds_9_0= ruleAddition ) ) otherlv_10= 'seconds' )
            // InternalTrader.g:472:3: otherlv_0= 'execute' otherlv_1= 'bots' otherlv_2= 'for' ( (lv_days_3_0= ruleAddition ) ) otherlv_4= 'days' ( (lv_hours_5_0= ruleAddition ) ) otherlv_6= 'hours' ( (lv_minutes_7_0= ruleAddition ) ) otherlv_8= 'minutes' ( (lv_seconds_9_0= ruleAddition ) ) otherlv_10= 'seconds'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getExecuteBotsStatementAccess().getExecuteKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getExecuteBotsStatementAccess().getBotsKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getExecuteBotsStatementAccess().getForKeyword_2());
            		
            // InternalTrader.g:484:3: ( (lv_days_3_0= ruleAddition ) )
            // InternalTrader.g:485:4: (lv_days_3_0= ruleAddition )
            {
            // InternalTrader.g:485:4: (lv_days_3_0= ruleAddition )
            // InternalTrader.g:486:5: lv_days_3_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getExecuteBotsStatementAccess().getDaysAdditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_days_3_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExecuteBotsStatementRule());
            					}
            					set(
            						current,
            						"days",
            						lv_days_3_0,
            						"uk.ac.kcl.inf.trader.Trader.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getExecuteBotsStatementAccess().getDaysKeyword_4());
            		
            // InternalTrader.g:507:3: ( (lv_hours_5_0= ruleAddition ) )
            // InternalTrader.g:508:4: (lv_hours_5_0= ruleAddition )
            {
            // InternalTrader.g:508:4: (lv_hours_5_0= ruleAddition )
            // InternalTrader.g:509:5: lv_hours_5_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getExecuteBotsStatementAccess().getHoursAdditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_26);
            lv_hours_5_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExecuteBotsStatementRule());
            					}
            					set(
            						current,
            						"hours",
            						lv_hours_5_0,
            						"uk.ac.kcl.inf.trader.Trader.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getExecuteBotsStatementAccess().getHoursKeyword_6());
            		
            // InternalTrader.g:530:3: ( (lv_minutes_7_0= ruleAddition ) )
            // InternalTrader.g:531:4: (lv_minutes_7_0= ruleAddition )
            {
            // InternalTrader.g:531:4: (lv_minutes_7_0= ruleAddition )
            // InternalTrader.g:532:5: lv_minutes_7_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getExecuteBotsStatementAccess().getMinutesAdditionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_27);
            lv_minutes_7_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExecuteBotsStatementRule());
            					}
            					set(
            						current,
            						"minutes",
            						lv_minutes_7_0,
            						"uk.ac.kcl.inf.trader.Trader.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_8, grammarAccess.getExecuteBotsStatementAccess().getMinutesKeyword_8());
            		
            // InternalTrader.g:553:3: ( (lv_seconds_9_0= ruleAddition ) )
            // InternalTrader.g:554:4: (lv_seconds_9_0= ruleAddition )
            {
            // InternalTrader.g:554:4: (lv_seconds_9_0= ruleAddition )
            // InternalTrader.g:555:5: lv_seconds_9_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getExecuteBotsStatementAccess().getSecondsAdditionParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_28);
            lv_seconds_9_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExecuteBotsStatementRule());
            					}
            					set(
            						current,
            						"seconds",
            						lv_seconds_9_0,
            						"uk.ac.kcl.inf.trader.Trader.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getExecuteBotsStatementAccess().getSecondsKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExecuteBotsStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalTrader.g:580:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalTrader.g:580:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalTrader.g:581:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalTrader.g:587:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_value_3_0= ruleStringValue ) ) | ( (lv_value_4_0= ruleIntValue ) ) | ( (lv_value_5_0= ruleRealValue ) ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:593:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_value_3_0= ruleStringValue ) ) | ( (lv_value_4_0= ruleIntValue ) ) | ( (lv_value_5_0= ruleRealValue ) ) ) ) )
            // InternalTrader.g:594:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_value_3_0= ruleStringValue ) ) | ( (lv_value_4_0= ruleIntValue ) ) | ( (lv_value_5_0= ruleRealValue ) ) ) )
            {
            // InternalTrader.g:594:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_value_3_0= ruleStringValue ) ) | ( (lv_value_4_0= ruleIntValue ) ) | ( (lv_value_5_0= ruleRealValue ) ) ) )
            // InternalTrader.g:595:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_value_3_0= ruleStringValue ) ) | ( (lv_value_4_0= ruleIntValue ) ) | ( (lv_value_5_0= ruleRealValue ) ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalTrader.g:599:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTrader.g:600:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTrader.g:600:4: (lv_name_1_0= RULE_ID )
            // InternalTrader.g:601:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalTrader.g:621:3: ( ( (lv_value_3_0= ruleStringValue ) ) | ( (lv_value_4_0= ruleIntValue ) ) | ( (lv_value_5_0= ruleRealValue ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==EOF||LA3_2==11||LA3_2==21||LA3_2==27||LA3_2==30||LA3_2==36||LA3_2==38||LA3_2==41) ) {
                    alt3=2;
                }
                else if ( (LA3_2==48) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTrader.g:622:4: ( (lv_value_3_0= ruleStringValue ) )
                    {
                    // InternalTrader.g:622:4: ( (lv_value_3_0= ruleStringValue ) )
                    // InternalTrader.g:623:5: (lv_value_3_0= ruleStringValue )
                    {
                    // InternalTrader.g:623:5: (lv_value_3_0= ruleStringValue )
                    // InternalTrader.g:624:6: lv_value_3_0= ruleStringValue
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValueStringValueParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleStringValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"uk.ac.kcl.inf.trader.Trader.StringValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:642:4: ( (lv_value_4_0= ruleIntValue ) )
                    {
                    // InternalTrader.g:642:4: ( (lv_value_4_0= ruleIntValue ) )
                    // InternalTrader.g:643:5: (lv_value_4_0= ruleIntValue )
                    {
                    // InternalTrader.g:643:5: (lv_value_4_0= ruleIntValue )
                    // InternalTrader.g:644:6: lv_value_4_0= ruleIntValue
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValueIntValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleIntValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"uk.ac.kcl.inf.trader.Trader.IntValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTrader.g:662:4: ( (lv_value_5_0= ruleRealValue ) )
                    {
                    // InternalTrader.g:662:4: ( (lv_value_5_0= ruleRealValue ) )
                    // InternalTrader.g:663:5: (lv_value_5_0= ruleRealValue )
                    {
                    // InternalTrader.g:663:5: (lv_value_5_0= ruleRealValue )
                    // InternalTrader.g:664:6: lv_value_5_0= ruleRealValue
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValueRealValueParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleRealValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"uk.ac.kcl.inf.trader.Trader.RealValue");
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleStringValue"
    // InternalTrader.g:686:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalTrader.g:686:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalTrader.g:687:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalTrader.g:693:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTrader.g:699:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTrader.g:700:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTrader.g:700:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTrader.g:701:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTrader.g:701:3: (lv_value_0_0= RULE_STRING )
            // InternalTrader.g:702:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleRealValue"
    // InternalTrader.g:721:1: entryRuleRealValue returns [EObject current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final EObject entryRuleRealValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealValue = null;


        try {
            // InternalTrader.g:721:50: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalTrader.g:722:2: iv_ruleRealValue= ruleRealValue EOF
            {
             newCompositeNode(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealValue=ruleRealValue();

            state._fsp--;

             current =iv_ruleRealValue; 
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
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // InternalTrader.g:728:1: ruleRealValue returns [EObject current=null] : ( (lv_value_0_0= ruleREAL ) ) ;
    public final EObject ruleRealValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:734:2: ( ( (lv_value_0_0= ruleREAL ) ) )
            // InternalTrader.g:735:2: ( (lv_value_0_0= ruleREAL ) )
            {
            // InternalTrader.g:735:2: ( (lv_value_0_0= ruleREAL ) )
            // InternalTrader.g:736:3: (lv_value_0_0= ruleREAL )
            {
            // InternalTrader.g:736:3: (lv_value_0_0= ruleREAL )
            // InternalTrader.g:737:4: lv_value_0_0= ruleREAL
            {

            				newCompositeNode(grammarAccess.getRealValueAccess().getValueREALParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleREAL();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"uk.ac.kcl.inf.trader.Trader.REAL");
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
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalTrader.g:757:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalTrader.g:757:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalTrader.g:758:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalTrader.g:764:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTrader.g:770:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalTrader.g:771:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalTrader.g:771:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalTrader.g:772:3: (lv_value_0_0= RULE_INT )
            {
            // InternalTrader.g:772:3: (lv_value_0_0= RULE_INT )
            // InternalTrader.g:773:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleLoopStatement"
    // InternalTrader.g:792:1: entryRuleLoopStatement returns [EObject current=null] : iv_ruleLoopStatement= ruleLoopStatement EOF ;
    public final EObject entryRuleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStatement = null;


        try {
            // InternalTrader.g:792:54: (iv_ruleLoopStatement= ruleLoopStatement EOF )
            // InternalTrader.g:793:2: iv_ruleLoopStatement= ruleLoopStatement EOF
            {
             newCompositeNode(grammarAccess.getLoopStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoopStatement=ruleLoopStatement();

            state._fsp--;

             current =iv_ruleLoopStatement; 
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
    // $ANTLR end "entryRuleLoopStatement"


    // $ANTLR start "ruleLoopStatement"
    // InternalTrader.g:799:1: ruleLoopStatement returns [EObject current=null] : (otherlv_0= 'loop' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times' otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end' ) ;
    public final EObject ruleLoopStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_count_1_0 = null;

        EObject lv_statements_4_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:805:2: ( (otherlv_0= 'loop' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times' otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end' ) )
            // InternalTrader.g:806:2: (otherlv_0= 'loop' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times' otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end' )
            {
            // InternalTrader.g:806:2: (otherlv_0= 'loop' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times' otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end' )
            // InternalTrader.g:807:3: otherlv_0= 'loop' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times' otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopStatementAccess().getLoopKeyword_0());
            		
            // InternalTrader.g:811:3: ( (lv_count_1_0= ruleAddition ) )
            // InternalTrader.g:812:4: (lv_count_1_0= ruleAddition )
            {
            // InternalTrader.g:812:4: (lv_count_1_0= ruleAddition )
            // InternalTrader.g:813:5: lv_count_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getLoopStatementAccess().getCountAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
            lv_count_1_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopStatementRule());
            					}
            					set(
            						current,
            						"count",
            						lv_count_1_0,
            						"uk.ac.kcl.inf.trader.Trader.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopStatementAccess().getTimesKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopStatementAccess().getDoKeyword_3());
            		
            // InternalTrader.g:838:3: ( (lv_statements_4_0= ruleStatement ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11||LA4_0==21||LA4_0==27||LA4_0==30||LA4_0==36||LA4_0==38) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTrader.g:839:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalTrader.g:839:4: (lv_statements_4_0= ruleStatement )
            	    // InternalTrader.g:840:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getLoopStatementAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoopStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_4_0,
            	    						"uk.ac.kcl.inf.trader.Trader.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_5=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLoopStatementAccess().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoopStatement"


    // $ANTLR start "entryRuleAddition"
    // InternalTrader.g:865:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalTrader.g:865:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalTrader.g:866:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalTrader.g:872:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:878:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalTrader.g:879:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalTrader.g:879:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalTrader.g:880:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTrader.g:888:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=42 && LA6_0<=43)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTrader.g:889:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalTrader.g:889:4: ()
            	    // InternalTrader.g:890:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTrader.g:896:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalTrader.g:897:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalTrader.g:897:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalTrader.g:898:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalTrader.g:898:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==42) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==43) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalTrader.g:899:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,42,FOLLOW_21); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalTrader.g:910:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,43,FOLLOW_21); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalTrader.g:923:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalTrader.g:924:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalTrader.g:924:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalTrader.g:925:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"uk.ac.kcl.inf.trader.Trader.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalTrader.g:947:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalTrader.g:947:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalTrader.g:948:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalTrader.g:954:1: ruleMultiplication returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:960:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalTrader.g:961:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalTrader.g:961:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalTrader.g:962:3: this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTrader.g:970:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=44 && LA8_0<=45)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTrader.g:971:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalTrader.g:971:4: ()
            	    // InternalTrader.g:972:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTrader.g:978:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalTrader.g:979:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalTrader.g:979:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalTrader.g:980:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalTrader.g:980:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==44) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==45) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalTrader.g:981:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,44,FOLLOW_21); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalTrader.g:992:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,45,FOLLOW_21); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalTrader.g:1005:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalTrader.g:1006:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalTrader.g:1006:5: (lv_right_3_0= rulePrimary )
            	    // InternalTrader.g:1007:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"uk.ac.kcl.inf.trader.Trader.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalTrader.g:1029:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalTrader.g:1029:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalTrader.g:1030:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalTrader.g:1036:1: rulePrimary returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_RealValue_1= ruleRealValue | this_NumVarExpression_2= ruleNumVarExpression | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_IntValue_0 = null;

        EObject this_RealValue_1 = null;

        EObject this_NumVarExpression_2 = null;

        EObject this_Addition_4 = null;



        	enterRule();

        try {
            // InternalTrader.g:1042:2: ( (this_IntValue_0= ruleIntValue | this_RealValue_1= ruleRealValue | this_NumVarExpression_2= ruleNumVarExpression | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) ) )
            // InternalTrader.g:1043:2: (this_IntValue_0= ruleIntValue | this_RealValue_1= ruleRealValue | this_NumVarExpression_2= ruleNumVarExpression | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) )
            {
            // InternalTrader.g:1043:2: (this_IntValue_0= ruleIntValue | this_RealValue_1= ruleRealValue | this_NumVarExpression_2= ruleNumVarExpression | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||LA9_1==11||LA9_1==21||LA9_1==27||LA9_1==30||(LA9_1>=32 && LA9_1<=36)||(LA9_1>=38 && LA9_1<=39)||(LA9_1>=41 && LA9_1<=45)||LA9_1==47) ) {
                    alt9=1;
                }
                else if ( (LA9_1==48) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            case 46:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalTrader.g:1044:3: this_IntValue_0= ruleIntValue
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getIntValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;


                    			current = this_IntValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTrader.g:1053:3: this_RealValue_1= ruleRealValue
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getRealValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealValue_1=ruleRealValue();

                    state._fsp--;


                    			current = this_RealValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTrader.g:1062:3: this_NumVarExpression_2= ruleNumVarExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumVarExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumVarExpression_2=ruleNumVarExpression();

                    state._fsp--;


                    			current = this_NumVarExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTrader.g:1071:3: (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' )
                    {
                    // InternalTrader.g:1071:3: (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' )
                    // InternalTrader.g:1072:4: otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_37);
                    this_Addition_4=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,47,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2());
                    			

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleNumVarExpression"
    // InternalTrader.g:1093:1: entryRuleNumVarExpression returns [EObject current=null] : iv_ruleNumVarExpression= ruleNumVarExpression EOF ;
    public final EObject entryRuleNumVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumVarExpression = null;


        try {
            // InternalTrader.g:1093:57: (iv_ruleNumVarExpression= ruleNumVarExpression EOF )
            // InternalTrader.g:1094:2: iv_ruleNumVarExpression= ruleNumVarExpression EOF
            {
             newCompositeNode(grammarAccess.getNumVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumVarExpression=ruleNumVarExpression();

            state._fsp--;

             current =iv_ruleNumVarExpression; 
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
    // $ANTLR end "entryRuleNumVarExpression"


    // $ANTLR start "ruleNumVarExpression"
    // InternalTrader.g:1100:1: ruleNumVarExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleNumVarExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTrader.g:1106:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalTrader.g:1107:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalTrader.g:1107:2: ( (otherlv_0= RULE_ID ) )
            // InternalTrader.g:1108:3: (otherlv_0= RULE_ID )
            {
            // InternalTrader.g:1108:3: (otherlv_0= RULE_ID )
            // InternalTrader.g:1109:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumVarExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getNumVarExpressionAccess().getVarVariableDeclarationCrossReference_0());
            			

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
    // $ANTLR end "ruleNumVarExpression"


    // $ANTLR start "entryRuleREAL"
    // InternalTrader.g:1123:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTrader.g:1125:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalTrader.g:1126:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalTrader.g:1135:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTrader.g:1142:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalTrader.g:1143:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalTrader.g:1143:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalTrader.g:1144:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalTrader.g:1144:3: (this_INT_0= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTrader.g:1145:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_38); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,48,FOLLOW_39); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleStringPrimary"
    // InternalTrader.g:1172:1: entryRuleStringPrimary returns [EObject current=null] : iv_ruleStringPrimary= ruleStringPrimary EOF ;
    public final EObject entryRuleStringPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPrimary = null;


        try {
            // InternalTrader.g:1172:54: (iv_ruleStringPrimary= ruleStringPrimary EOF )
            // InternalTrader.g:1173:2: iv_ruleStringPrimary= ruleStringPrimary EOF
            {
             newCompositeNode(grammarAccess.getStringPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringPrimary=ruleStringPrimary();

            state._fsp--;

             current =iv_ruleStringPrimary; 
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
    // $ANTLR end "entryRuleStringPrimary"


    // $ANTLR start "ruleStringPrimary"
    // InternalTrader.g:1179:1: ruleStringPrimary returns [EObject current=null] : (this_StringVarExpression_0= ruleStringVarExpression | this_StringValue_1= ruleStringValue ) ;
    public final EObject ruleStringPrimary() throws RecognitionException {
        EObject current = null;

        EObject this_StringVarExpression_0 = null;

        EObject this_StringValue_1 = null;



        	enterRule();

        try {
            // InternalTrader.g:1185:2: ( (this_StringVarExpression_0= ruleStringVarExpression | this_StringValue_1= ruleStringValue ) )
            // InternalTrader.g:1186:2: (this_StringVarExpression_0= ruleStringVarExpression | this_StringValue_1= ruleStringValue )
            {
            // InternalTrader.g:1186:2: (this_StringVarExpression_0= ruleStringVarExpression | this_StringValue_1= ruleStringValue )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTrader.g:1187:3: this_StringVarExpression_0= ruleStringVarExpression
                    {

                    			newCompositeNode(grammarAccess.getStringPrimaryAccess().getStringVarExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringVarExpression_0=ruleStringVarExpression();

                    state._fsp--;


                    			current = this_StringVarExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTrader.g:1196:3: this_StringValue_1= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getStringPrimaryAccess().getStringValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_1=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_1;
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
    // $ANTLR end "ruleStringPrimary"


    // $ANTLR start "entryRuleStringVarExpression"
    // InternalTrader.g:1208:1: entryRuleStringVarExpression returns [EObject current=null] : iv_ruleStringVarExpression= ruleStringVarExpression EOF ;
    public final EObject entryRuleStringVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVarExpression = null;


        try {
            // InternalTrader.g:1208:60: (iv_ruleStringVarExpression= ruleStringVarExpression EOF )
            // InternalTrader.g:1209:2: iv_ruleStringVarExpression= ruleStringVarExpression EOF
            {
             newCompositeNode(grammarAccess.getStringVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringVarExpression=ruleStringVarExpression();

            state._fsp--;

             current =iv_ruleStringVarExpression; 
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
    // $ANTLR end "entryRuleStringVarExpression"


    // $ANTLR start "ruleStringVarExpression"
    // InternalTrader.g:1215:1: ruleStringVarExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleStringVarExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTrader.g:1221:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalTrader.g:1222:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalTrader.g:1222:2: ( (otherlv_0= RULE_ID ) )
            // InternalTrader.g:1223:3: (otherlv_0= RULE_ID )
            {
            // InternalTrader.g:1223:3: (otherlv_0= RULE_ID )
            // InternalTrader.g:1224:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringVarExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getStringVarExpressionAccess().getVarVariableDeclarationCrossReference_0());
            			

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
    // $ANTLR end "ruleStringVarExpression"


    // $ANTLR start "ruleStrategyDef"
    // InternalTrader.g:1238:1: ruleStrategyDef returns [Enumerator current=null] : ( (enumLiteral_0= 'buyAndHold' ) | (enumLiteral_1= 'meanReversion' ) ) ;
    public final Enumerator ruleStrategyDef() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTrader.g:1244:2: ( ( (enumLiteral_0= 'buyAndHold' ) | (enumLiteral_1= 'meanReversion' ) ) )
            // InternalTrader.g:1245:2: ( (enumLiteral_0= 'buyAndHold' ) | (enumLiteral_1= 'meanReversion' ) )
            {
            // InternalTrader.g:1245:2: ( (enumLiteral_0= 'buyAndHold' ) | (enumLiteral_1= 'meanReversion' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==49) ) {
                alt12=1;
            }
            else if ( (LA12_0==50) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTrader.g:1246:3: (enumLiteral_0= 'buyAndHold' )
                    {
                    // InternalTrader.g:1246:3: (enumLiteral_0= 'buyAndHold' )
                    // InternalTrader.g:1247:4: enumLiteral_0= 'buyAndHold'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getStrategyDefAccess().getBuyAndHoldEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStrategyDefAccess().getBuyAndHoldEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:1254:3: (enumLiteral_1= 'meanReversion' )
                    {
                    // InternalTrader.g:1254:3: (enumLiteral_1= 'meanReversion' )
                    // InternalTrader.g:1255:4: enumLiteral_1= 'meanReversion'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getStrategyDefAccess().getMeanReversionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStrategyDefAccess().getMeanReversionEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleStrategyDef"


    // $ANTLR start "ruleTimeFrameDef"
    // InternalTrader.g:1265:1: ruleTimeFrameDef returns [Enumerator current=null] : ( (enumLiteral_0= 'M1' ) | (enumLiteral_1= 'M2' ) | (enumLiteral_2= 'M3' ) | (enumLiteral_3= 'M4' ) | (enumLiteral_4= 'M5' ) | (enumLiteral_5= 'M6' ) | (enumLiteral_6= 'M10' ) | (enumLiteral_7= 'M12' ) | (enumLiteral_8= 'M20' ) | (enumLiteral_9= 'M30' ) | (enumLiteral_10= 'H1' ) | (enumLiteral_11= 'H2' ) | (enumLiteral_12= 'H3' ) | (enumLiteral_13= 'H4' ) | (enumLiteral_14= 'H6' ) | (enumLiteral_15= 'H8' ) | (enumLiteral_16= 'H12' ) | (enumLiteral_17= 'D1' ) | (enumLiteral_18= 'W1' ) | (enumLiteral_19= 'MN1' ) ) ;
    public final Enumerator ruleTimeFrameDef() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;


        	enterRule();

        try {
            // InternalTrader.g:1271:2: ( ( (enumLiteral_0= 'M1' ) | (enumLiteral_1= 'M2' ) | (enumLiteral_2= 'M3' ) | (enumLiteral_3= 'M4' ) | (enumLiteral_4= 'M5' ) | (enumLiteral_5= 'M6' ) | (enumLiteral_6= 'M10' ) | (enumLiteral_7= 'M12' ) | (enumLiteral_8= 'M20' ) | (enumLiteral_9= 'M30' ) | (enumLiteral_10= 'H1' ) | (enumLiteral_11= 'H2' ) | (enumLiteral_12= 'H3' ) | (enumLiteral_13= 'H4' ) | (enumLiteral_14= 'H6' ) | (enumLiteral_15= 'H8' ) | (enumLiteral_16= 'H12' ) | (enumLiteral_17= 'D1' ) | (enumLiteral_18= 'W1' ) | (enumLiteral_19= 'MN1' ) ) )
            // InternalTrader.g:1272:2: ( (enumLiteral_0= 'M1' ) | (enumLiteral_1= 'M2' ) | (enumLiteral_2= 'M3' ) | (enumLiteral_3= 'M4' ) | (enumLiteral_4= 'M5' ) | (enumLiteral_5= 'M6' ) | (enumLiteral_6= 'M10' ) | (enumLiteral_7= 'M12' ) | (enumLiteral_8= 'M20' ) | (enumLiteral_9= 'M30' ) | (enumLiteral_10= 'H1' ) | (enumLiteral_11= 'H2' ) | (enumLiteral_12= 'H3' ) | (enumLiteral_13= 'H4' ) | (enumLiteral_14= 'H6' ) | (enumLiteral_15= 'H8' ) | (enumLiteral_16= 'H12' ) | (enumLiteral_17= 'D1' ) | (enumLiteral_18= 'W1' ) | (enumLiteral_19= 'MN1' ) )
            {
            // InternalTrader.g:1272:2: ( (enumLiteral_0= 'M1' ) | (enumLiteral_1= 'M2' ) | (enumLiteral_2= 'M3' ) | (enumLiteral_3= 'M4' ) | (enumLiteral_4= 'M5' ) | (enumLiteral_5= 'M6' ) | (enumLiteral_6= 'M10' ) | (enumLiteral_7= 'M12' ) | (enumLiteral_8= 'M20' ) | (enumLiteral_9= 'M30' ) | (enumLiteral_10= 'H1' ) | (enumLiteral_11= 'H2' ) | (enumLiteral_12= 'H3' ) | (enumLiteral_13= 'H4' ) | (enumLiteral_14= 'H6' ) | (enumLiteral_15= 'H8' ) | (enumLiteral_16= 'H12' ) | (enumLiteral_17= 'D1' ) | (enumLiteral_18= 'W1' ) | (enumLiteral_19= 'MN1' ) )
            int alt13=20;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt13=1;
                }
                break;
            case 52:
                {
                alt13=2;
                }
                break;
            case 53:
                {
                alt13=3;
                }
                break;
            case 54:
                {
                alt13=4;
                }
                break;
            case 55:
                {
                alt13=5;
                }
                break;
            case 56:
                {
                alt13=6;
                }
                break;
            case 57:
                {
                alt13=7;
                }
                break;
            case 58:
                {
                alt13=8;
                }
                break;
            case 59:
                {
                alt13=9;
                }
                break;
            case 60:
                {
                alt13=10;
                }
                break;
            case 61:
                {
                alt13=11;
                }
                break;
            case 62:
                {
                alt13=12;
                }
                break;
            case 63:
                {
                alt13=13;
                }
                break;
            case 64:
                {
                alt13=14;
                }
                break;
            case 65:
                {
                alt13=15;
                }
                break;
            case 66:
                {
                alt13=16;
                }
                break;
            case 67:
                {
                alt13=17;
                }
                break;
            case 68:
                {
                alt13=18;
                }
                break;
            case 69:
                {
                alt13=19;
                }
                break;
            case 70:
                {
                alt13=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalTrader.g:1273:3: (enumLiteral_0= 'M1' )
                    {
                    // InternalTrader.g:1273:3: (enumLiteral_0= 'M1' )
                    // InternalTrader.g:1274:4: enumLiteral_0= 'M1'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getM1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeFrameDefAccess().getM1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:1281:3: (enumLiteral_1= 'M2' )
                    {
                    // InternalTrader.g:1281:3: (enumLiteral_1= 'M2' )
                    // InternalTrader.g:1282:4: enumLiteral_1= 'M2'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getM2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeFrameDefAccess().getM2EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTrader.g:1289:3: (enumLiteral_2= 'M3' )
                    {
                    // InternalTrader.g:1289:3: (enumLiteral_2= 'M3' )
                    // InternalTrader.g:1290:4: enumLiteral_2= 'M3'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getM3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeFrameDefAccess().getM3EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTrader.g:1297:3: (enumLiteral_3= 'M4' )
                    {
                    // InternalTrader.g:1297:3: (enumLiteral_3= 'M4' )
                    // InternalTrader.g:1298:4: enumLiteral_3= 'M4'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getM4EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeFrameDefAccess().getM4EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTrader.g:1305:3: (enumLiteral_4= 'M5' )
                    {
                    // InternalTrader.g:1305:3: (enumLiteral_4= 'M5' )
                    // InternalTrader.g:1306:4: enumLiteral_4= 'M5'
                    {
                    enumLiteral_4=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getM5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTimeFrameDefAccess().getM5EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTrader.g:1313:3: (enumLiteral_5= 'M6' )
                    {
                    // InternalTrader.g:1313:3: (enumLiteral_5= 'M6' )
                    // InternalTrader.g:1314:4: enumLiteral_5= 'M6'
                    {
                    enumLiteral_5=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getM6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTimeFrameDefAccess().getM6EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalTrader.g:1321:3: (enumLiteral_6= 'M10' )
                    {
                    // InternalTrader.g:1321:3: (enumLiteral_6= 'M10' )
                    // InternalTrader.g:1322:4: enumLiteral_6= 'M10'
                    {
                    enumLiteral_6=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getM10EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTimeFrameDefAccess().getM10EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalTrader.g:1329:3: (enumLiteral_7= 'M12' )
                    {
                    // InternalTrader.g:1329:3: (enumLiteral_7= 'M12' )
                    // InternalTrader.g:1330:4: enumLiteral_7= 'M12'
                    {
                    enumLiteral_7=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getM12EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTimeFrameDefAccess().getM12EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalTrader.g:1337:3: (enumLiteral_8= 'M20' )
                    {
                    // InternalTrader.g:1337:3: (enumLiteral_8= 'M20' )
                    // InternalTrader.g:1338:4: enumLiteral_8= 'M20'
                    {
                    enumLiteral_8=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getM20EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTimeFrameDefAccess().getM20EnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalTrader.g:1345:3: (enumLiteral_9= 'M30' )
                    {
                    // InternalTrader.g:1345:3: (enumLiteral_9= 'M30' )
                    // InternalTrader.g:1346:4: enumLiteral_9= 'M30'
                    {
                    enumLiteral_9=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getM30EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getTimeFrameDefAccess().getM30EnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalTrader.g:1353:3: (enumLiteral_10= 'H1' )
                    {
                    // InternalTrader.g:1353:3: (enumLiteral_10= 'H1' )
                    // InternalTrader.g:1354:4: enumLiteral_10= 'H1'
                    {
                    enumLiteral_10=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getH1EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getTimeFrameDefAccess().getH1EnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalTrader.g:1361:3: (enumLiteral_11= 'H2' )
                    {
                    // InternalTrader.g:1361:3: (enumLiteral_11= 'H2' )
                    // InternalTrader.g:1362:4: enumLiteral_11= 'H2'
                    {
                    enumLiteral_11=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getH2EnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getTimeFrameDefAccess().getH2EnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalTrader.g:1369:3: (enumLiteral_12= 'H3' )
                    {
                    // InternalTrader.g:1369:3: (enumLiteral_12= 'H3' )
                    // InternalTrader.g:1370:4: enumLiteral_12= 'H3'
                    {
                    enumLiteral_12=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getH3EnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getTimeFrameDefAccess().getH3EnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalTrader.g:1377:3: (enumLiteral_13= 'H4' )
                    {
                    // InternalTrader.g:1377:3: (enumLiteral_13= 'H4' )
                    // InternalTrader.g:1378:4: enumLiteral_13= 'H4'
                    {
                    enumLiteral_13=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getH4EnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getTimeFrameDefAccess().getH4EnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalTrader.g:1385:3: (enumLiteral_14= 'H6' )
                    {
                    // InternalTrader.g:1385:3: (enumLiteral_14= 'H6' )
                    // InternalTrader.g:1386:4: enumLiteral_14= 'H6'
                    {
                    enumLiteral_14=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getH6EnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getTimeFrameDefAccess().getH6EnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalTrader.g:1393:3: (enumLiteral_15= 'H8' )
                    {
                    // InternalTrader.g:1393:3: (enumLiteral_15= 'H8' )
                    // InternalTrader.g:1394:4: enumLiteral_15= 'H8'
                    {
                    enumLiteral_15=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getH8EnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getTimeFrameDefAccess().getH8EnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalTrader.g:1401:3: (enumLiteral_16= 'H12' )
                    {
                    // InternalTrader.g:1401:3: (enumLiteral_16= 'H12' )
                    // InternalTrader.g:1402:4: enumLiteral_16= 'H12'
                    {
                    enumLiteral_16=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getH12EnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getTimeFrameDefAccess().getH12EnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalTrader.g:1409:3: (enumLiteral_17= 'D1' )
                    {
                    // InternalTrader.g:1409:3: (enumLiteral_17= 'D1' )
                    // InternalTrader.g:1410:4: enumLiteral_17= 'D1'
                    {
                    enumLiteral_17=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getD1EnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getTimeFrameDefAccess().getD1EnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalTrader.g:1417:3: (enumLiteral_18= 'W1' )
                    {
                    // InternalTrader.g:1417:3: (enumLiteral_18= 'W1' )
                    // InternalTrader.g:1418:4: enumLiteral_18= 'W1'
                    {
                    enumLiteral_18=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getW1EnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getTimeFrameDefAccess().getW1EnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalTrader.g:1425:3: (enumLiteral_19= 'MN1' )
                    {
                    // InternalTrader.g:1425:3: (enumLiteral_19= 'MN1' )
                    // InternalTrader.g:1426:4: enumLiteral_19= 'MN1'
                    {
                    enumLiteral_19=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getTimeFrameDefAccess().getMN1EnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getTimeFrameDefAccess().getMN1EnumLiteralDeclaration_19());
                    			

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
    // $ANTLR end "ruleTimeFrameDef"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000005048200802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0xFFF8000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001400000000050L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000070L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000025048200800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000040L});

}