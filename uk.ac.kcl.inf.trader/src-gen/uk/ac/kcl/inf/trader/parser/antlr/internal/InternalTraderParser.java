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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'connect'", "'to'", "'broker'", "'with'", "'username:'", "','", "'password:'", "'leverage:'", "'money:'", "'timeframe:'", "'create'", "'bot'", "'strategy'", "'using'", "'funds'", "'see'", "'registered'", "'bots'", "'execute'", "'stop'", "'var'", "'='", "'loop'", "'times'", "'do'", "'end'", "'.'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'buy'", "'at'", "'price'", "'sell'", "'buyAndHold'", "'meanReversion'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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

                if ( (LA1_0==11||LA1_0==21||LA1_0==26||(LA1_0>=29 && LA1_0<=31)||LA1_0==33) ) {
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
    // InternalTrader.g:108:1: ruleStatement returns [EObject current=null] : (this_ConnectStatement_0= ruleConnectStatement | this_TradingBot_1= ruleTradingBot | this_ListBots_2= ruleListBots | this_Execute_3= ruleExecute | this_Stop_4= ruleStop | this_VariableDeclaration_5= ruleVariableDeclaration | this_LoopStatement_6= ruleLoopStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectStatement_0 = null;

        EObject this_TradingBot_1 = null;

        EObject this_ListBots_2 = null;

        EObject this_Execute_3 = null;

        EObject this_Stop_4 = null;

        EObject this_VariableDeclaration_5 = null;

        EObject this_LoopStatement_6 = null;



        	enterRule();

        try {
            // InternalTrader.g:114:2: ( (this_ConnectStatement_0= ruleConnectStatement | this_TradingBot_1= ruleTradingBot | this_ListBots_2= ruleListBots | this_Execute_3= ruleExecute | this_Stop_4= ruleStop | this_VariableDeclaration_5= ruleVariableDeclaration | this_LoopStatement_6= ruleLoopStatement ) )
            // InternalTrader.g:115:2: (this_ConnectStatement_0= ruleConnectStatement | this_TradingBot_1= ruleTradingBot | this_ListBots_2= ruleListBots | this_Execute_3= ruleExecute | this_Stop_4= ruleStop | this_VariableDeclaration_5= ruleVariableDeclaration | this_LoopStatement_6= ruleLoopStatement )
            {
            // InternalTrader.g:115:2: (this_ConnectStatement_0= ruleConnectStatement | this_TradingBot_1= ruleTradingBot | this_ListBots_2= ruleListBots | this_Execute_3= ruleExecute | this_Stop_4= ruleStop | this_VariableDeclaration_5= ruleVariableDeclaration | this_LoopStatement_6= ruleLoopStatement )
            int alt2=7;
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
            case 26:
                {
                alt2=3;
                }
                break;
            case 29:
                {
                alt2=4;
                }
                break;
            case 30:
                {
                alt2=5;
                }
                break;
            case 31:
                {
                alt2=6;
                }
                break;
            case 33:
                {
                alt2=7;
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
                    // InternalTrader.g:125:3: this_TradingBot_1= ruleTradingBot
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTradingBotParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TradingBot_1=ruleTradingBot();

                    state._fsp--;


                    			current = this_TradingBot_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTrader.g:134:3: this_ListBots_2= ruleListBots
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getListBotsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListBots_2=ruleListBots();

                    state._fsp--;


                    			current = this_ListBots_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTrader.g:143:3: this_Execute_3= ruleExecute
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getExecuteParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Execute_3=ruleExecute();

                    state._fsp--;


                    			current = this_Execute_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTrader.g:152:3: this_Stop_4= ruleStop
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getStopParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Stop_4=ruleStop();

                    state._fsp--;


                    			current = this_Stop_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTrader.g:161:3: this_VariableDeclaration_5= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_5=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalTrader.g:170:3: this_LoopStatement_6= ruleLoopStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoopStatement_6=ruleLoopStatement();

                    state._fsp--;


                    			current = this_LoopStatement_6;
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
    // InternalTrader.g:182:1: entryRuleConnectStatement returns [EObject current=null] : iv_ruleConnectStatement= ruleConnectStatement EOF ;
    public final EObject entryRuleConnectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectStatement = null;


        try {
            // InternalTrader.g:182:57: (iv_ruleConnectStatement= ruleConnectStatement EOF )
            // InternalTrader.g:183:2: iv_ruleConnectStatement= ruleConnectStatement EOF
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
    // InternalTrader.g:189:1: ruleConnectStatement returns [EObject current=null] : (otherlv_0= 'connect' otherlv_1= 'to' otherlv_2= 'broker' ( (lv_brokerName_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'username:' ( (lv_username_6_0= ruleStringPrimary ) ) otherlv_7= ',' otherlv_8= 'password:' ( (lv_password_9_0= ruleStringPrimary ) ) otherlv_10= ',' otherlv_11= 'leverage:' ( (lv_leverage_12_0= ruleAddition ) ) otherlv_13= ',' otherlv_14= 'money:' ( (lv_money_15_0= ruleAddition ) ) otherlv_16= ',' otherlv_17= 'timeframe:' ( (lv_timeframe_18_0= ruleStringPrimary ) ) ) ;
    public final EObject ruleConnectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_brokerName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_username_6_0 = null;

        EObject lv_password_9_0 = null;

        EObject lv_leverage_12_0 = null;

        EObject lv_money_15_0 = null;

        EObject lv_timeframe_18_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:195:2: ( (otherlv_0= 'connect' otherlv_1= 'to' otherlv_2= 'broker' ( (lv_brokerName_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'username:' ( (lv_username_6_0= ruleStringPrimary ) ) otherlv_7= ',' otherlv_8= 'password:' ( (lv_password_9_0= ruleStringPrimary ) ) otherlv_10= ',' otherlv_11= 'leverage:' ( (lv_leverage_12_0= ruleAddition ) ) otherlv_13= ',' otherlv_14= 'money:' ( (lv_money_15_0= ruleAddition ) ) otherlv_16= ',' otherlv_17= 'timeframe:' ( (lv_timeframe_18_0= ruleStringPrimary ) ) ) )
            // InternalTrader.g:196:2: (otherlv_0= 'connect' otherlv_1= 'to' otherlv_2= 'broker' ( (lv_brokerName_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'username:' ( (lv_username_6_0= ruleStringPrimary ) ) otherlv_7= ',' otherlv_8= 'password:' ( (lv_password_9_0= ruleStringPrimary ) ) otherlv_10= ',' otherlv_11= 'leverage:' ( (lv_leverage_12_0= ruleAddition ) ) otherlv_13= ',' otherlv_14= 'money:' ( (lv_money_15_0= ruleAddition ) ) otherlv_16= ',' otherlv_17= 'timeframe:' ( (lv_timeframe_18_0= ruleStringPrimary ) ) )
            {
            // InternalTrader.g:196:2: (otherlv_0= 'connect' otherlv_1= 'to' otherlv_2= 'broker' ( (lv_brokerName_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'username:' ( (lv_username_6_0= ruleStringPrimary ) ) otherlv_7= ',' otherlv_8= 'password:' ( (lv_password_9_0= ruleStringPrimary ) ) otherlv_10= ',' otherlv_11= 'leverage:' ( (lv_leverage_12_0= ruleAddition ) ) otherlv_13= ',' otherlv_14= 'money:' ( (lv_money_15_0= ruleAddition ) ) otherlv_16= ',' otherlv_17= 'timeframe:' ( (lv_timeframe_18_0= ruleStringPrimary ) ) )
            // InternalTrader.g:197:3: otherlv_0= 'connect' otherlv_1= 'to' otherlv_2= 'broker' ( (lv_brokerName_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'username:' ( (lv_username_6_0= ruleStringPrimary ) ) otherlv_7= ',' otherlv_8= 'password:' ( (lv_password_9_0= ruleStringPrimary ) ) otherlv_10= ',' otherlv_11= 'leverage:' ( (lv_leverage_12_0= ruleAddition ) ) otherlv_13= ',' otherlv_14= 'money:' ( (lv_money_15_0= ruleAddition ) ) otherlv_16= ',' otherlv_17= 'timeframe:' ( (lv_timeframe_18_0= ruleStringPrimary ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectStatementAccess().getConnectKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectStatementAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectStatementAccess().getBrokerKeyword_2());
            		
            // InternalTrader.g:209:3: ( (lv_brokerName_3_0= RULE_ID ) )
            // InternalTrader.g:210:4: (lv_brokerName_3_0= RULE_ID )
            {
            // InternalTrader.g:210:4: (lv_brokerName_3_0= RULE_ID )
            // InternalTrader.g:211:5: lv_brokerName_3_0= RULE_ID
            {
            lv_brokerName_3_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_brokerName_3_0, grammarAccess.getConnectStatementAccess().getBrokerNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"brokerName",
            						lv_brokerName_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getConnectStatementAccess().getWithKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectStatementAccess().getUsernameKeyword_5());
            		
            // InternalTrader.g:235:3: ( (lv_username_6_0= ruleStringPrimary ) )
            // InternalTrader.g:236:4: (lv_username_6_0= ruleStringPrimary )
            {
            // InternalTrader.g:236:4: (lv_username_6_0= ruleStringPrimary )
            // InternalTrader.g:237:5: lv_username_6_0= ruleStringPrimary
            {

            					newCompositeNode(grammarAccess.getConnectStatementAccess().getUsernameStringPrimaryParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_username_6_0=ruleStringPrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectStatementRule());
            					}
            					set(
            						current,
            						"username",
            						lv_username_6_0,
            						"uk.ac.kcl.inf.trader.Trader.StringPrimary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getConnectStatementAccess().getCommaKeyword_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getConnectStatementAccess().getPasswordKeyword_8());
            		
            // InternalTrader.g:262:3: ( (lv_password_9_0= ruleStringPrimary ) )
            // InternalTrader.g:263:4: (lv_password_9_0= ruleStringPrimary )
            {
            // InternalTrader.g:263:4: (lv_password_9_0= ruleStringPrimary )
            // InternalTrader.g:264:5: lv_password_9_0= ruleStringPrimary
            {

            					newCompositeNode(grammarAccess.getConnectStatementAccess().getPasswordStringPrimaryParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_password_9_0=ruleStringPrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectStatementRule());
            					}
            					set(
            						current,
            						"password",
            						lv_password_9_0,
            						"uk.ac.kcl.inf.trader.Trader.StringPrimary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getConnectStatementAccess().getCommaKeyword_10());
            		
            otherlv_11=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getConnectStatementAccess().getLeverageKeyword_11());
            		
            // InternalTrader.g:289:3: ( (lv_leverage_12_0= ruleAddition ) )
            // InternalTrader.g:290:4: (lv_leverage_12_0= ruleAddition )
            {
            // InternalTrader.g:290:4: (lv_leverage_12_0= ruleAddition )
            // InternalTrader.g:291:5: lv_leverage_12_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getConnectStatementAccess().getLeverageAdditionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_10);
            lv_leverage_12_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectStatementRule());
            					}
            					set(
            						current,
            						"leverage",
            						lv_leverage_12_0,
            						"uk.ac.kcl.inf.trader.Trader.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_13, grammarAccess.getConnectStatementAccess().getCommaKeyword_13());
            		
            otherlv_14=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_14, grammarAccess.getConnectStatementAccess().getMoneyKeyword_14());
            		
            // InternalTrader.g:316:3: ( (lv_money_15_0= ruleAddition ) )
            // InternalTrader.g:317:4: (lv_money_15_0= ruleAddition )
            {
            // InternalTrader.g:317:4: (lv_money_15_0= ruleAddition )
            // InternalTrader.g:318:5: lv_money_15_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getConnectStatementAccess().getMoneyAdditionParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_10);
            lv_money_15_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectStatementRule());
            					}
            					set(
            						current,
            						"money",
            						lv_money_15_0,
            						"uk.ac.kcl.inf.trader.Trader.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_16, grammarAccess.getConnectStatementAccess().getCommaKeyword_16());
            		
            otherlv_17=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_17, grammarAccess.getConnectStatementAccess().getTimeframeKeyword_17());
            		
            // InternalTrader.g:343:3: ( (lv_timeframe_18_0= ruleStringPrimary ) )
            // InternalTrader.g:344:4: (lv_timeframe_18_0= ruleStringPrimary )
            {
            // InternalTrader.g:344:4: (lv_timeframe_18_0= ruleStringPrimary )
            // InternalTrader.g:345:5: lv_timeframe_18_0= ruleStringPrimary
            {

            					newCompositeNode(grammarAccess.getConnectStatementAccess().getTimeframeStringPrimaryParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_2);
            lv_timeframe_18_0=ruleStringPrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectStatementRule());
            					}
            					set(
            						current,
            						"timeframe",
            						lv_timeframe_18_0,
            						"uk.ac.kcl.inf.trader.Trader.StringPrimary");
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


    // $ANTLR start "entryRuleTradingBot"
    // InternalTrader.g:366:1: entryRuleTradingBot returns [EObject current=null] : iv_ruleTradingBot= ruleTradingBot EOF ;
    public final EObject entryRuleTradingBot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTradingBot = null;


        try {
            // InternalTrader.g:366:51: (iv_ruleTradingBot= ruleTradingBot EOF )
            // InternalTrader.g:367:2: iv_ruleTradingBot= ruleTradingBot EOF
            {
             newCompositeNode(grammarAccess.getTradingBotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTradingBot=ruleTradingBot();

            state._fsp--;

             current =iv_ruleTradingBot; 
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
    // $ANTLR end "entryRuleTradingBot"


    // $ANTLR start "ruleTradingBot"
    // InternalTrader.g:373:1: ruleTradingBot returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'bot' otherlv_2= 'with' ( (lv_strategy_3_0= ruleStrategyDef ) ) otherlv_4= 'strategy' otherlv_5= 'using' ( (lv_fund_6_0= ruleAddition ) ) otherlv_7= 'funds' ) ;
    public final EObject ruleTradingBot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_strategy_3_0 = null;

        EObject lv_fund_6_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:379:2: ( (otherlv_0= 'create' otherlv_1= 'bot' otherlv_2= 'with' ( (lv_strategy_3_0= ruleStrategyDef ) ) otherlv_4= 'strategy' otherlv_5= 'using' ( (lv_fund_6_0= ruleAddition ) ) otherlv_7= 'funds' ) )
            // InternalTrader.g:380:2: (otherlv_0= 'create' otherlv_1= 'bot' otherlv_2= 'with' ( (lv_strategy_3_0= ruleStrategyDef ) ) otherlv_4= 'strategy' otherlv_5= 'using' ( (lv_fund_6_0= ruleAddition ) ) otherlv_7= 'funds' )
            {
            // InternalTrader.g:380:2: (otherlv_0= 'create' otherlv_1= 'bot' otherlv_2= 'with' ( (lv_strategy_3_0= ruleStrategyDef ) ) otherlv_4= 'strategy' otherlv_5= 'using' ( (lv_fund_6_0= ruleAddition ) ) otherlv_7= 'funds' )
            // InternalTrader.g:381:3: otherlv_0= 'create' otherlv_1= 'bot' otherlv_2= 'with' ( (lv_strategy_3_0= ruleStrategyDef ) ) otherlv_4= 'strategy' otherlv_5= 'using' ( (lv_fund_6_0= ruleAddition ) ) otherlv_7= 'funds'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTradingBotAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTradingBotAccess().getBotKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTradingBotAccess().getWithKeyword_2());
            		
            // InternalTrader.g:393:3: ( (lv_strategy_3_0= ruleStrategyDef ) )
            // InternalTrader.g:394:4: (lv_strategy_3_0= ruleStrategyDef )
            {
            // InternalTrader.g:394:4: (lv_strategy_3_0= ruleStrategyDef )
            // InternalTrader.g:395:5: lv_strategy_3_0= ruleStrategyDef
            {

            					newCompositeNode(grammarAccess.getTradingBotAccess().getStrategyStrategyDefEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_strategy_3_0=ruleStrategyDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTradingBotRule());
            					}
            					set(
            						current,
            						"strategy",
            						lv_strategy_3_0,
            						"uk.ac.kcl.inf.trader.Trader.StrategyDef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getTradingBotAccess().getStrategyKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getTradingBotAccess().getUsingKeyword_5());
            		
            // InternalTrader.g:420:3: ( (lv_fund_6_0= ruleAddition ) )
            // InternalTrader.g:421:4: (lv_fund_6_0= ruleAddition )
            {
            // InternalTrader.g:421:4: (lv_fund_6_0= ruleAddition )
            // InternalTrader.g:422:5: lv_fund_6_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getTradingBotAccess().getFundAdditionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_20);
            lv_fund_6_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTradingBotRule());
            					}
            					set(
            						current,
            						"fund",
            						lv_fund_6_0,
            						"uk.ac.kcl.inf.trader.Trader.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTradingBotAccess().getFundsKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTradingBot"


    // $ANTLR start "entryRuleListBots"
    // InternalTrader.g:447:1: entryRuleListBots returns [EObject current=null] : iv_ruleListBots= ruleListBots EOF ;
    public final EObject entryRuleListBots() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListBots = null;


        try {
            // InternalTrader.g:447:49: (iv_ruleListBots= ruleListBots EOF )
            // InternalTrader.g:448:2: iv_ruleListBots= ruleListBots EOF
            {
             newCompositeNode(grammarAccess.getListBotsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListBots=ruleListBots();

            state._fsp--;

             current =iv_ruleListBots; 
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
    // $ANTLR end "entryRuleListBots"


    // $ANTLR start "ruleListBots"
    // InternalTrader.g:454:1: ruleListBots returns [EObject current=null] : ( ( (lv_listCommand_0_0= 'see' ) ) otherlv_1= 'registered' otherlv_2= 'bots' ) ;
    public final EObject ruleListBots() throws RecognitionException {
        EObject current = null;

        Token lv_listCommand_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTrader.g:460:2: ( ( ( (lv_listCommand_0_0= 'see' ) ) otherlv_1= 'registered' otherlv_2= 'bots' ) )
            // InternalTrader.g:461:2: ( ( (lv_listCommand_0_0= 'see' ) ) otherlv_1= 'registered' otherlv_2= 'bots' )
            {
            // InternalTrader.g:461:2: ( ( (lv_listCommand_0_0= 'see' ) ) otherlv_1= 'registered' otherlv_2= 'bots' )
            // InternalTrader.g:462:3: ( (lv_listCommand_0_0= 'see' ) ) otherlv_1= 'registered' otherlv_2= 'bots'
            {
            // InternalTrader.g:462:3: ( (lv_listCommand_0_0= 'see' ) )
            // InternalTrader.g:463:4: (lv_listCommand_0_0= 'see' )
            {
            // InternalTrader.g:463:4: (lv_listCommand_0_0= 'see' )
            // InternalTrader.g:464:5: lv_listCommand_0_0= 'see'
            {
            lv_listCommand_0_0=(Token)match(input,26,FOLLOW_21); 

            					newLeafNode(lv_listCommand_0_0, grammarAccess.getListBotsAccess().getListCommandSeeKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListBotsRule());
            					}
            					setWithLastConsumed(current, "listCommand", lv_listCommand_0_0, "see");
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getListBotsAccess().getRegisteredKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getListBotsAccess().getBotsKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListBots"


    // $ANTLR start "entryRuleExecute"
    // InternalTrader.g:488:1: entryRuleExecute returns [EObject current=null] : iv_ruleExecute= ruleExecute EOF ;
    public final EObject entryRuleExecute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecute = null;


        try {
            // InternalTrader.g:488:48: (iv_ruleExecute= ruleExecute EOF )
            // InternalTrader.g:489:2: iv_ruleExecute= ruleExecute EOF
            {
             newCompositeNode(grammarAccess.getExecuteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecute=ruleExecute();

            state._fsp--;

             current =iv_ruleExecute; 
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
    // $ANTLR end "entryRuleExecute"


    // $ANTLR start "ruleExecute"
    // InternalTrader.g:495:1: ruleExecute returns [EObject current=null] : ( ( (lv_executeCommand_0_0= 'execute' ) ) otherlv_1= 'bots' ) ;
    public final EObject ruleExecute() throws RecognitionException {
        EObject current = null;

        Token lv_executeCommand_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTrader.g:501:2: ( ( ( (lv_executeCommand_0_0= 'execute' ) ) otherlv_1= 'bots' ) )
            // InternalTrader.g:502:2: ( ( (lv_executeCommand_0_0= 'execute' ) ) otherlv_1= 'bots' )
            {
            // InternalTrader.g:502:2: ( ( (lv_executeCommand_0_0= 'execute' ) ) otherlv_1= 'bots' )
            // InternalTrader.g:503:3: ( (lv_executeCommand_0_0= 'execute' ) ) otherlv_1= 'bots'
            {
            // InternalTrader.g:503:3: ( (lv_executeCommand_0_0= 'execute' ) )
            // InternalTrader.g:504:4: (lv_executeCommand_0_0= 'execute' )
            {
            // InternalTrader.g:504:4: (lv_executeCommand_0_0= 'execute' )
            // InternalTrader.g:505:5: lv_executeCommand_0_0= 'execute'
            {
            lv_executeCommand_0_0=(Token)match(input,29,FOLLOW_22); 

            					newLeafNode(lv_executeCommand_0_0, grammarAccess.getExecuteAccess().getExecuteCommandExecuteKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecuteRule());
            					}
            					setWithLastConsumed(current, "executeCommand", lv_executeCommand_0_0, "execute");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getExecuteAccess().getBotsKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExecute"


    // $ANTLR start "entryRuleStop"
    // InternalTrader.g:525:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalTrader.g:525:45: (iv_ruleStop= ruleStop EOF )
            // InternalTrader.g:526:2: iv_ruleStop= ruleStop EOF
            {
             newCompositeNode(grammarAccess.getStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStop=ruleStop();

            state._fsp--;

             current =iv_ruleStop; 
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
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // InternalTrader.g:532:1: ruleStop returns [EObject current=null] : ( ( (lv_stopCommand_0_0= 'stop' ) ) otherlv_1= 'bots' ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token lv_stopCommand_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTrader.g:538:2: ( ( ( (lv_stopCommand_0_0= 'stop' ) ) otherlv_1= 'bots' ) )
            // InternalTrader.g:539:2: ( ( (lv_stopCommand_0_0= 'stop' ) ) otherlv_1= 'bots' )
            {
            // InternalTrader.g:539:2: ( ( (lv_stopCommand_0_0= 'stop' ) ) otherlv_1= 'bots' )
            // InternalTrader.g:540:3: ( (lv_stopCommand_0_0= 'stop' ) ) otherlv_1= 'bots'
            {
            // InternalTrader.g:540:3: ( (lv_stopCommand_0_0= 'stop' ) )
            // InternalTrader.g:541:4: (lv_stopCommand_0_0= 'stop' )
            {
            // InternalTrader.g:541:4: (lv_stopCommand_0_0= 'stop' )
            // InternalTrader.g:542:5: lv_stopCommand_0_0= 'stop'
            {
            lv_stopCommand_0_0=(Token)match(input,30,FOLLOW_22); 

            					newLeafNode(lv_stopCommand_0_0, grammarAccess.getStopAccess().getStopCommandStopKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStopRule());
            					}
            					setWithLastConsumed(current, "stopCommand", lv_stopCommand_0_0, "stop");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStopAccess().getBotsKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStop"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalTrader.g:562:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalTrader.g:562:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalTrader.g:563:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalTrader.g:569:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_value_3_0= ruleStringValue ) ) | ( (lv_value_4_0= ruleRealValue ) ) | ( (lv_value_5_0= ruleIntValue ) ) ) ) ;
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
            // InternalTrader.g:575:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_value_3_0= ruleStringValue ) ) | ( (lv_value_4_0= ruleRealValue ) ) | ( (lv_value_5_0= ruleIntValue ) ) ) ) )
            // InternalTrader.g:576:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_value_3_0= ruleStringValue ) ) | ( (lv_value_4_0= ruleRealValue ) ) | ( (lv_value_5_0= ruleIntValue ) ) ) )
            {
            // InternalTrader.g:576:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_value_3_0= ruleStringValue ) ) | ( (lv_value_4_0= ruleRealValue ) ) | ( (lv_value_5_0= ruleIntValue ) ) ) )
            // InternalTrader.g:577:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_value_3_0= ruleStringValue ) ) | ( (lv_value_4_0= ruleRealValue ) ) | ( (lv_value_5_0= ruleIntValue ) ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalTrader.g:581:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTrader.g:582:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTrader.g:582:4: (lv_name_1_0= RULE_ID )
            // InternalTrader.g:583:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

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

            otherlv_2=(Token)match(input,32,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalTrader.g:603:3: ( ( (lv_value_3_0= ruleStringValue ) ) | ( (lv_value_4_0= ruleRealValue ) ) | ( (lv_value_5_0= ruleIntValue ) ) )
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

                if ( (LA3_2==37) ) {
                    alt3=2;
                }
                else if ( (LA3_2==EOF||LA3_2==11||LA3_2==21||LA3_2==26||(LA3_2>=29 && LA3_2<=31)||LA3_2==33||LA3_2==36) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTrader.g:604:4: ( (lv_value_3_0= ruleStringValue ) )
                    {
                    // InternalTrader.g:604:4: ( (lv_value_3_0= ruleStringValue ) )
                    // InternalTrader.g:605:5: (lv_value_3_0= ruleStringValue )
                    {
                    // InternalTrader.g:605:5: (lv_value_3_0= ruleStringValue )
                    // InternalTrader.g:606:6: lv_value_3_0= ruleStringValue
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
                    // InternalTrader.g:624:4: ( (lv_value_4_0= ruleRealValue ) )
                    {
                    // InternalTrader.g:624:4: ( (lv_value_4_0= ruleRealValue ) )
                    // InternalTrader.g:625:5: (lv_value_4_0= ruleRealValue )
                    {
                    // InternalTrader.g:625:5: (lv_value_4_0= ruleRealValue )
                    // InternalTrader.g:626:6: lv_value_4_0= ruleRealValue
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValueRealValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleRealValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"uk.ac.kcl.inf.trader.Trader.RealValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTrader.g:644:4: ( (lv_value_5_0= ruleIntValue ) )
                    {
                    // InternalTrader.g:644:4: ( (lv_value_5_0= ruleIntValue ) )
                    // InternalTrader.g:645:5: (lv_value_5_0= ruleIntValue )
                    {
                    // InternalTrader.g:645:5: (lv_value_5_0= ruleIntValue )
                    // InternalTrader.g:646:6: lv_value_5_0= ruleIntValue
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValueIntValueParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleIntValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"uk.ac.kcl.inf.trader.Trader.IntValue");
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
    // InternalTrader.g:668:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalTrader.g:668:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalTrader.g:669:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalTrader.g:675:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTrader.g:681:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTrader.g:682:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTrader.g:682:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTrader.g:683:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTrader.g:683:3: (lv_value_0_0= RULE_STRING )
            // InternalTrader.g:684:4: lv_value_0_0= RULE_STRING
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
    // InternalTrader.g:703:1: entryRuleRealValue returns [EObject current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final EObject entryRuleRealValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealValue = null;


        try {
            // InternalTrader.g:703:50: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalTrader.g:704:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalTrader.g:710:1: ruleRealValue returns [EObject current=null] : ( (lv_value_0_0= ruleREAL ) ) ;
    public final EObject ruleRealValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:716:2: ( ( (lv_value_0_0= ruleREAL ) ) )
            // InternalTrader.g:717:2: ( (lv_value_0_0= ruleREAL ) )
            {
            // InternalTrader.g:717:2: ( (lv_value_0_0= ruleREAL ) )
            // InternalTrader.g:718:3: (lv_value_0_0= ruleREAL )
            {
            // InternalTrader.g:718:3: (lv_value_0_0= ruleREAL )
            // InternalTrader.g:719:4: lv_value_0_0= ruleREAL
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
    // InternalTrader.g:739:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalTrader.g:739:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalTrader.g:740:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalTrader.g:746:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTrader.g:752:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalTrader.g:753:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalTrader.g:753:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalTrader.g:754:3: (lv_value_0_0= RULE_INT )
            {
            // InternalTrader.g:754:3: (lv_value_0_0= RULE_INT )
            // InternalTrader.g:755:4: lv_value_0_0= RULE_INT
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
    // InternalTrader.g:774:1: entryRuleLoopStatement returns [EObject current=null] : iv_ruleLoopStatement= ruleLoopStatement EOF ;
    public final EObject entryRuleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStatement = null;


        try {
            // InternalTrader.g:774:54: (iv_ruleLoopStatement= ruleLoopStatement EOF )
            // InternalTrader.g:775:2: iv_ruleLoopStatement= ruleLoopStatement EOF
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
    // InternalTrader.g:781:1: ruleLoopStatement returns [EObject current=null] : (otherlv_0= 'loop' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times' otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end' ) ;
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
            // InternalTrader.g:787:2: ( (otherlv_0= 'loop' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times' otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end' ) )
            // InternalTrader.g:788:2: (otherlv_0= 'loop' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times' otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end' )
            {
            // InternalTrader.g:788:2: (otherlv_0= 'loop' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times' otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end' )
            // InternalTrader.g:789:3: otherlv_0= 'loop' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times' otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopStatementAccess().getLoopKeyword_0());
            		
            // InternalTrader.g:793:3: ( (lv_count_1_0= ruleAddition ) )
            // InternalTrader.g:794:4: (lv_count_1_0= ruleAddition )
            {
            // InternalTrader.g:794:4: (lv_count_1_0= ruleAddition )
            // InternalTrader.g:795:5: lv_count_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getLoopStatementAccess().getCountAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_2=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopStatementAccess().getTimesKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopStatementAccess().getDoKeyword_3());
            		
            // InternalTrader.g:820:3: ( (lv_statements_4_0= ruleStatement ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11||LA4_0==21||LA4_0==26||(LA4_0>=29 && LA4_0<=31)||LA4_0==33) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTrader.g:821:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalTrader.g:821:4: (lv_statements_4_0= ruleStatement )
            	    // InternalTrader.g:822:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getLoopStatementAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_27);
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

            otherlv_5=(Token)match(input,36,FOLLOW_2); 

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


    // $ANTLR start "entryRuleREAL"
    // InternalTrader.g:847:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTrader.g:849:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalTrader.g:850:2: iv_ruleREAL= ruleREAL EOF
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
    // InternalTrader.g:859:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTrader.g:866:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalTrader.g:867:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalTrader.g:867:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalTrader.g:868:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalTrader.g:868:3: (this_INT_0= RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTrader.g:869:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_28); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,37,FOLLOW_29); 

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


    // $ANTLR start "entryRuleAddition"
    // InternalTrader.g:896:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalTrader.g:896:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalTrader.g:897:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalTrader.g:903:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:909:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalTrader.g:910:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalTrader.g:910:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalTrader.g:911:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTrader.g:919:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=38 && LA7_0<=39)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTrader.g:920:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalTrader.g:920:4: ()
            	    // InternalTrader.g:921:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTrader.g:927:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalTrader.g:928:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalTrader.g:928:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalTrader.g:929:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalTrader.g:929:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==38) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==39) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalTrader.g:930:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,38,FOLLOW_13); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalTrader.g:941:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,39,FOLLOW_13); 

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

            	    // InternalTrader.g:954:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalTrader.g:955:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalTrader.g:955:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalTrader.g:956:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
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
            	    break loop7;
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
    // InternalTrader.g:978:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalTrader.g:978:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalTrader.g:979:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalTrader.g:985:1: ruleMultiplication returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:991:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalTrader.g:992:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalTrader.g:992:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalTrader.g:993:3: this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTrader.g:1001:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=40 && LA9_0<=41)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTrader.g:1002:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalTrader.g:1002:4: ()
            	    // InternalTrader.g:1003:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTrader.g:1009:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalTrader.g:1010:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalTrader.g:1010:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalTrader.g:1011:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalTrader.g:1011:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==40) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==41) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalTrader.g:1012:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,40,FOLLOW_13); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalTrader.g:1023:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,41,FOLLOW_13); 

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

            	    // InternalTrader.g:1036:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalTrader.g:1037:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalTrader.g:1037:5: (lv_right_3_0= rulePrimary )
            	    // InternalTrader.g:1038:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
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
            	    break loop9;
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
    // InternalTrader.g:1060:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalTrader.g:1060:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalTrader.g:1061:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalTrader.g:1067:1: rulePrimary returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_RealValue_1= ruleRealValue | this_NumVarExpression_2= ruleNumVarExpression | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) ) ;
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
            // InternalTrader.g:1073:2: ( (this_IntValue_0= ruleIntValue | this_RealValue_1= ruleRealValue | this_NumVarExpression_2= ruleNumVarExpression | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) ) )
            // InternalTrader.g:1074:2: (this_IntValue_0= ruleIntValue | this_RealValue_1= ruleRealValue | this_NumVarExpression_2= ruleNumVarExpression | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) )
            {
            // InternalTrader.g:1074:2: (this_IntValue_0= ruleIntValue | this_RealValue_1= ruleRealValue | this_NumVarExpression_2= ruleNumVarExpression | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==37) ) {
                    alt10=2;
                }
                else if ( (LA10_1==EOF||LA10_1==RULE_ID||LA10_1==16||LA10_1==25||LA10_1==34||(LA10_1>=38 && LA10_1<=41)||LA10_1==43) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                alt10=3;
                }
                break;
            case 42:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalTrader.g:1075:3: this_IntValue_0= ruleIntValue
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
                    // InternalTrader.g:1084:3: this_RealValue_1= ruleRealValue
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
                    // InternalTrader.g:1093:3: this_NumVarExpression_2= ruleNumVarExpression
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
                    // InternalTrader.g:1102:3: (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' )
                    {
                    // InternalTrader.g:1102:3: (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' )
                    // InternalTrader.g:1103:4: otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_32);
                    this_Addition_4=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,43,FOLLOW_2); 

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
    // InternalTrader.g:1124:1: entryRuleNumVarExpression returns [EObject current=null] : iv_ruleNumVarExpression= ruleNumVarExpression EOF ;
    public final EObject entryRuleNumVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumVarExpression = null;


        try {
            // InternalTrader.g:1124:57: (iv_ruleNumVarExpression= ruleNumVarExpression EOF )
            // InternalTrader.g:1125:2: iv_ruleNumVarExpression= ruleNumVarExpression EOF
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
    // InternalTrader.g:1131:1: ruleNumVarExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleNumVarExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTrader.g:1137:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalTrader.g:1138:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalTrader.g:1138:2: ( (otherlv_0= RULE_ID ) )
            // InternalTrader.g:1139:3: (otherlv_0= RULE_ID )
            {
            // InternalTrader.g:1139:3: (otherlv_0= RULE_ID )
            // InternalTrader.g:1140:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleStringPrimary"
    // InternalTrader.g:1154:1: entryRuleStringPrimary returns [EObject current=null] : iv_ruleStringPrimary= ruleStringPrimary EOF ;
    public final EObject entryRuleStringPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPrimary = null;


        try {
            // InternalTrader.g:1154:54: (iv_ruleStringPrimary= ruleStringPrimary EOF )
            // InternalTrader.g:1155:2: iv_ruleStringPrimary= ruleStringPrimary EOF
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
    // InternalTrader.g:1161:1: ruleStringPrimary returns [EObject current=null] : (this_StringVarExpression_0= ruleStringVarExpression | this_StringValue_1= ruleStringValue ) ;
    public final EObject ruleStringPrimary() throws RecognitionException {
        EObject current = null;

        EObject this_StringVarExpression_0 = null;

        EObject this_StringValue_1 = null;



        	enterRule();

        try {
            // InternalTrader.g:1167:2: ( (this_StringVarExpression_0= ruleStringVarExpression | this_StringValue_1= ruleStringValue ) )
            // InternalTrader.g:1168:2: (this_StringVarExpression_0= ruleStringVarExpression | this_StringValue_1= ruleStringValue )
            {
            // InternalTrader.g:1168:2: (this_StringVarExpression_0= ruleStringVarExpression | this_StringValue_1= ruleStringValue )
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
                    // InternalTrader.g:1169:3: this_StringVarExpression_0= ruleStringVarExpression
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
                    // InternalTrader.g:1178:3: this_StringValue_1= ruleStringValue
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
    // InternalTrader.g:1190:1: entryRuleStringVarExpression returns [EObject current=null] : iv_ruleStringVarExpression= ruleStringVarExpression EOF ;
    public final EObject entryRuleStringVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVarExpression = null;


        try {
            // InternalTrader.g:1190:60: (iv_ruleStringVarExpression= ruleStringVarExpression EOF )
            // InternalTrader.g:1191:2: iv_ruleStringVarExpression= ruleStringVarExpression EOF
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
    // InternalTrader.g:1197:1: ruleStringVarExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleStringVarExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTrader.g:1203:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalTrader.g:1204:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalTrader.g:1204:2: ( (otherlv_0= RULE_ID ) )
            // InternalTrader.g:1205:3: (otherlv_0= RULE_ID )
            {
            // InternalTrader.g:1205:3: (otherlv_0= RULE_ID )
            // InternalTrader.g:1206:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleBuy"
    // InternalTrader.g:1220:1: entryRuleBuy returns [EObject current=null] : iv_ruleBuy= ruleBuy EOF ;
    public final EObject entryRuleBuy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuy = null;


        try {
            // InternalTrader.g:1220:44: (iv_ruleBuy= ruleBuy EOF )
            // InternalTrader.g:1221:2: iv_ruleBuy= ruleBuy EOF
            {
             newCompositeNode(grammarAccess.getBuyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuy=ruleBuy();

            state._fsp--;

             current =iv_ruleBuy; 
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
    // $ANTLR end "entryRuleBuy"


    // $ANTLR start "ruleBuy"
    // InternalTrader.g:1227:1: ruleBuy returns [EObject current=null] : (otherlv_0= 'buy' ( (lv_quantity_1_0= ruleAddition ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleAddition ) ) ) ;
    public final EObject ruleBuy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ticker_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_quantity_1_0 = null;

        EObject lv_price_5_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:1233:2: ( (otherlv_0= 'buy' ( (lv_quantity_1_0= ruleAddition ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleAddition ) ) ) )
            // InternalTrader.g:1234:2: (otherlv_0= 'buy' ( (lv_quantity_1_0= ruleAddition ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleAddition ) ) )
            {
            // InternalTrader.g:1234:2: (otherlv_0= 'buy' ( (lv_quantity_1_0= ruleAddition ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleAddition ) ) )
            // InternalTrader.g:1235:3: otherlv_0= 'buy' ( (lv_quantity_1_0= ruleAddition ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleAddition ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getBuyAccess().getBuyKeyword_0());
            		
            // InternalTrader.g:1239:3: ( (lv_quantity_1_0= ruleAddition ) )
            // InternalTrader.g:1240:4: (lv_quantity_1_0= ruleAddition )
            {
            // InternalTrader.g:1240:4: (lv_quantity_1_0= ruleAddition )
            // InternalTrader.g:1241:5: lv_quantity_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getBuyAccess().getQuantityAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_quantity_1_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBuyRule());
            					}
            					set(
            						current,
            						"quantity",
            						lv_quantity_1_0,
            						"uk.ac.kcl.inf.trader.Trader.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTrader.g:1258:3: ( (lv_ticker_2_0= RULE_ID ) )
            // InternalTrader.g:1259:4: (lv_ticker_2_0= RULE_ID )
            {
            // InternalTrader.g:1259:4: (lv_ticker_2_0= RULE_ID )
            // InternalTrader.g:1260:5: lv_ticker_2_0= RULE_ID
            {
            lv_ticker_2_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_ticker_2_0, grammarAccess.getBuyAccess().getTickerIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBuyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ticker",
            						lv_ticker_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getBuyAccess().getAtKeyword_3());
            		
            otherlv_4=(Token)match(input,46,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getBuyAccess().getPriceKeyword_4());
            		
            // InternalTrader.g:1284:3: ( (lv_price_5_0= ruleAddition ) )
            // InternalTrader.g:1285:4: (lv_price_5_0= ruleAddition )
            {
            // InternalTrader.g:1285:4: (lv_price_5_0= ruleAddition )
            // InternalTrader.g:1286:5: lv_price_5_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getBuyAccess().getPriceAdditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_price_5_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBuyRule());
            					}
            					set(
            						current,
            						"price",
            						lv_price_5_0,
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
    // $ANTLR end "ruleBuy"


    // $ANTLR start "entryRuleSell"
    // InternalTrader.g:1307:1: entryRuleSell returns [EObject current=null] : iv_ruleSell= ruleSell EOF ;
    public final EObject entryRuleSell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSell = null;


        try {
            // InternalTrader.g:1307:45: (iv_ruleSell= ruleSell EOF )
            // InternalTrader.g:1308:2: iv_ruleSell= ruleSell EOF
            {
             newCompositeNode(grammarAccess.getSellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSell=ruleSell();

            state._fsp--;

             current =iv_ruleSell; 
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
    // $ANTLR end "entryRuleSell"


    // $ANTLR start "ruleSell"
    // InternalTrader.g:1314:1: ruleSell returns [EObject current=null] : (otherlv_0= 'sell' ( (lv_quantity_1_0= ruleAddition ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleAddition ) ) ) ;
    public final EObject ruleSell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ticker_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_quantity_1_0 = null;

        EObject lv_price_5_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:1320:2: ( (otherlv_0= 'sell' ( (lv_quantity_1_0= ruleAddition ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleAddition ) ) ) )
            // InternalTrader.g:1321:2: (otherlv_0= 'sell' ( (lv_quantity_1_0= ruleAddition ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleAddition ) ) )
            {
            // InternalTrader.g:1321:2: (otherlv_0= 'sell' ( (lv_quantity_1_0= ruleAddition ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleAddition ) ) )
            // InternalTrader.g:1322:3: otherlv_0= 'sell' ( (lv_quantity_1_0= ruleAddition ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleAddition ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSellAccess().getSellKeyword_0());
            		
            // InternalTrader.g:1326:3: ( (lv_quantity_1_0= ruleAddition ) )
            // InternalTrader.g:1327:4: (lv_quantity_1_0= ruleAddition )
            {
            // InternalTrader.g:1327:4: (lv_quantity_1_0= ruleAddition )
            // InternalTrader.g:1328:5: lv_quantity_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getSellAccess().getQuantityAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_quantity_1_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSellRule());
            					}
            					set(
            						current,
            						"quantity",
            						lv_quantity_1_0,
            						"uk.ac.kcl.inf.trader.Trader.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTrader.g:1345:3: ( (lv_ticker_2_0= RULE_ID ) )
            // InternalTrader.g:1346:4: (lv_ticker_2_0= RULE_ID )
            {
            // InternalTrader.g:1346:4: (lv_ticker_2_0= RULE_ID )
            // InternalTrader.g:1347:5: lv_ticker_2_0= RULE_ID
            {
            lv_ticker_2_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_ticker_2_0, grammarAccess.getSellAccess().getTickerIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ticker",
            						lv_ticker_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getSellAccess().getAtKeyword_3());
            		
            otherlv_4=(Token)match(input,46,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getSellAccess().getPriceKeyword_4());
            		
            // InternalTrader.g:1371:3: ( (lv_price_5_0= ruleAddition ) )
            // InternalTrader.g:1372:4: (lv_price_5_0= ruleAddition )
            {
            // InternalTrader.g:1372:4: (lv_price_5_0= ruleAddition )
            // InternalTrader.g:1373:5: lv_price_5_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getSellAccess().getPriceAdditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_price_5_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSellRule());
            					}
            					set(
            						current,
            						"price",
            						lv_price_5_0,
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
    // $ANTLR end "ruleSell"


    // $ANTLR start "ruleStrategyDef"
    // InternalTrader.g:1394:1: ruleStrategyDef returns [Enumerator current=null] : ( (enumLiteral_0= 'buyAndHold' ) | (enumLiteral_1= 'meanReversion' ) ) ;
    public final Enumerator ruleStrategyDef() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTrader.g:1400:2: ( ( (enumLiteral_0= 'buyAndHold' ) | (enumLiteral_1= 'meanReversion' ) ) )
            // InternalTrader.g:1401:2: ( (enumLiteral_0= 'buyAndHold' ) | (enumLiteral_1= 'meanReversion' ) )
            {
            // InternalTrader.g:1401:2: ( (enumLiteral_0= 'buyAndHold' ) | (enumLiteral_1= 'meanReversion' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==48) ) {
                alt12=1;
            }
            else if ( (LA12_0==49) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTrader.g:1402:3: (enumLiteral_0= 'buyAndHold' )
                    {
                    // InternalTrader.g:1402:3: (enumLiteral_0= 'buyAndHold' )
                    // InternalTrader.g:1403:4: enumLiteral_0= 'buyAndHold'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getStrategyDefAccess().getBuyAndHoldEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStrategyDefAccess().getBuyAndHoldEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:1410:3: (enumLiteral_1= 'meanReversion' )
                    {
                    // InternalTrader.g:1410:3: (enumLiteral_1= 'meanReversion' )
                    // InternalTrader.g:1411:4: enumLiteral_1= 'meanReversion'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000002E4200802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000042000000050L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000012E4200800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});

}