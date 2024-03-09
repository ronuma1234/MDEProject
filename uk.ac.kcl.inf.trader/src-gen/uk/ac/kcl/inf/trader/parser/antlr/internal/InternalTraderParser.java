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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'connect'", "'broker'", "','", "'username'", "'='", "'password'", "'leverage'", "'money'", "'timeframe'", "'tradingBot'", "'strategy'", "'funds'", "'execute'", "'bots'", "'var'", "'times'", "'do'", "'end'", "'.'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'buy'", "'at'", "'price'", "'sell'", "'buyAndHold'", "'meanReversion'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

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

                if ( (LA1_0==RULE_ID||LA1_0==RULE_INT||LA1_0==11||LA1_0==20||LA1_0==23||LA1_0==25||LA1_0==34) ) {
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
    // InternalTrader.g:108:1: ruleStatement returns [EObject current=null] : (this_Connect_0= ruleConnect | this_TradingBot_1= ruleTradingBot | this_Execute_2= ruleExecute | this_VariableDeclaration_3= ruleVariableDeclaration | this_LoopStatement_4= ruleLoopStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Connect_0 = null;

        EObject this_TradingBot_1 = null;

        EObject this_Execute_2 = null;

        EObject this_VariableDeclaration_3 = null;

        EObject this_LoopStatement_4 = null;



        	enterRule();

        try {
            // InternalTrader.g:114:2: ( (this_Connect_0= ruleConnect | this_TradingBot_1= ruleTradingBot | this_Execute_2= ruleExecute | this_VariableDeclaration_3= ruleVariableDeclaration | this_LoopStatement_4= ruleLoopStatement ) )
            // InternalTrader.g:115:2: (this_Connect_0= ruleConnect | this_TradingBot_1= ruleTradingBot | this_Execute_2= ruleExecute | this_VariableDeclaration_3= ruleVariableDeclaration | this_LoopStatement_4= ruleLoopStatement )
            {
            // InternalTrader.g:115:2: (this_Connect_0= ruleConnect | this_TradingBot_1= ruleTradingBot | this_Execute_2= ruleExecute | this_VariableDeclaration_3= ruleVariableDeclaration | this_LoopStatement_4= ruleLoopStatement )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 34:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTrader.g:116:3: this_Connect_0= ruleConnect
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getConnectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Connect_0=ruleConnect();

                    state._fsp--;


                    			current = this_Connect_0;
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
                    // InternalTrader.g:134:3: this_Execute_2= ruleExecute
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getExecuteParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Execute_2=ruleExecute();

                    state._fsp--;


                    			current = this_Execute_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTrader.g:143:3: this_VariableDeclaration_3= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_3=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTrader.g:152:3: this_LoopStatement_4= ruleLoopStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoopStatement_4=ruleLoopStatement();

                    state._fsp--;


                    			current = this_LoopStatement_4;
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


    // $ANTLR start "entryRuleConnect"
    // InternalTrader.g:164:1: entryRuleConnect returns [EObject current=null] : iv_ruleConnect= ruleConnect EOF ;
    public final EObject entryRuleConnect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnect = null;


        try {
            // InternalTrader.g:164:48: (iv_ruleConnect= ruleConnect EOF )
            // InternalTrader.g:165:2: iv_ruleConnect= ruleConnect EOF
            {
             newCompositeNode(grammarAccess.getConnectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnect=ruleConnect();

            state._fsp--;

             current =iv_ruleConnect; 
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
    // $ANTLR end "entryRuleConnect"


    // $ANTLR start "ruleConnect"
    // InternalTrader.g:171:1: ruleConnect returns [EObject current=null] : (otherlv_0= 'connect' otherlv_1= 'broker' ( (lv_brokerName_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleConnectParameters ) ) )? ) ;
    public final EObject ruleConnect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_brokerName_2_0=null;
        Token otherlv_3=null;
        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:177:2: ( (otherlv_0= 'connect' otherlv_1= 'broker' ( (lv_brokerName_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleConnectParameters ) ) )? ) )
            // InternalTrader.g:178:2: (otherlv_0= 'connect' otherlv_1= 'broker' ( (lv_brokerName_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleConnectParameters ) ) )? )
            {
            // InternalTrader.g:178:2: (otherlv_0= 'connect' otherlv_1= 'broker' ( (lv_brokerName_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleConnectParameters ) ) )? )
            // InternalTrader.g:179:3: otherlv_0= 'connect' otherlv_1= 'broker' ( (lv_brokerName_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleConnectParameters ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectAccess().getConnectKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectAccess().getBrokerKeyword_1());
            		
            // InternalTrader.g:187:3: ( (lv_brokerName_2_0= RULE_ID ) )
            // InternalTrader.g:188:4: (lv_brokerName_2_0= RULE_ID )
            {
            // InternalTrader.g:188:4: (lv_brokerName_2_0= RULE_ID )
            // InternalTrader.g:189:5: lv_brokerName_2_0= RULE_ID
            {
            lv_brokerName_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_brokerName_2_0, grammarAccess.getConnectAccess().getBrokerNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"brokerName",
            						lv_brokerName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTrader.g:205:3: (otherlv_3= ',' ( (lv_parameters_4_0= ruleConnectParameters ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTrader.g:206:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleConnectParameters ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getConnectAccess().getCommaKeyword_3_0());
                    			
                    // InternalTrader.g:210:4: ( (lv_parameters_4_0= ruleConnectParameters ) )
                    // InternalTrader.g:211:5: (lv_parameters_4_0= ruleConnectParameters )
                    {
                    // InternalTrader.g:211:5: (lv_parameters_4_0= ruleConnectParameters )
                    // InternalTrader.g:212:6: lv_parameters_4_0= ruleConnectParameters
                    {

                    						newCompositeNode(grammarAccess.getConnectAccess().getParametersConnectParametersParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parameters_4_0=ruleConnectParameters();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectRule());
                    						}
                    						set(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"uk.ac.kcl.inf.trader.Trader.ConnectParameters");
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
    // $ANTLR end "ruleConnect"


    // $ANTLR start "entryRuleConnectParameters"
    // InternalTrader.g:234:1: entryRuleConnectParameters returns [EObject current=null] : iv_ruleConnectParameters= ruleConnectParameters EOF ;
    public final EObject entryRuleConnectParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectParameters = null;


        try {
            // InternalTrader.g:234:58: (iv_ruleConnectParameters= ruleConnectParameters EOF )
            // InternalTrader.g:235:2: iv_ruleConnectParameters= ruleConnectParameters EOF
            {
             newCompositeNode(grammarAccess.getConnectParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectParameters=ruleConnectParameters();

            state._fsp--;

             current =iv_ruleConnectParameters; 
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
    // $ANTLR end "entryRuleConnectParameters"


    // $ANTLR start "ruleConnectParameters"
    // InternalTrader.g:241:1: ruleConnectParameters returns [EObject current=null] : (otherlv_0= 'username' otherlv_1= '=' ( (lv_username_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'password' otherlv_5= '=' ( (lv_password_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'leverage' otherlv_9= '=' ( (lv_leverage_10_0= ruleREAL ) ) otherlv_11= ',' otherlv_12= 'money' otherlv_13= '=' ( (lv_money_14_0= ruleREAL ) ) otherlv_15= ',' otherlv_16= 'timeframe' otherlv_17= '=' ( (lv_timeframe_18_0= RULE_STRING ) ) ) ;
    public final EObject ruleConnectParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_username_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_password_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_timeframe_18_0=null;
        AntlrDatatypeRuleToken lv_leverage_10_0 = null;

        AntlrDatatypeRuleToken lv_money_14_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:247:2: ( (otherlv_0= 'username' otherlv_1= '=' ( (lv_username_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'password' otherlv_5= '=' ( (lv_password_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'leverage' otherlv_9= '=' ( (lv_leverage_10_0= ruleREAL ) ) otherlv_11= ',' otherlv_12= 'money' otherlv_13= '=' ( (lv_money_14_0= ruleREAL ) ) otherlv_15= ',' otherlv_16= 'timeframe' otherlv_17= '=' ( (lv_timeframe_18_0= RULE_STRING ) ) ) )
            // InternalTrader.g:248:2: (otherlv_0= 'username' otherlv_1= '=' ( (lv_username_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'password' otherlv_5= '=' ( (lv_password_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'leverage' otherlv_9= '=' ( (lv_leverage_10_0= ruleREAL ) ) otherlv_11= ',' otherlv_12= 'money' otherlv_13= '=' ( (lv_money_14_0= ruleREAL ) ) otherlv_15= ',' otherlv_16= 'timeframe' otherlv_17= '=' ( (lv_timeframe_18_0= RULE_STRING ) ) )
            {
            // InternalTrader.g:248:2: (otherlv_0= 'username' otherlv_1= '=' ( (lv_username_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'password' otherlv_5= '=' ( (lv_password_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'leverage' otherlv_9= '=' ( (lv_leverage_10_0= ruleREAL ) ) otherlv_11= ',' otherlv_12= 'money' otherlv_13= '=' ( (lv_money_14_0= ruleREAL ) ) otherlv_15= ',' otherlv_16= 'timeframe' otherlv_17= '=' ( (lv_timeframe_18_0= RULE_STRING ) ) )
            // InternalTrader.g:249:3: otherlv_0= 'username' otherlv_1= '=' ( (lv_username_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'password' otherlv_5= '=' ( (lv_password_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'leverage' otherlv_9= '=' ( (lv_leverage_10_0= ruleREAL ) ) otherlv_11= ',' otherlv_12= 'money' otherlv_13= '=' ( (lv_money_14_0= ruleREAL ) ) otherlv_15= ',' otherlv_16= 'timeframe' otherlv_17= '=' ( (lv_timeframe_18_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectParametersAccess().getUsernameKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectParametersAccess().getEqualsSignKeyword_1());
            		
            // InternalTrader.g:257:3: ( (lv_username_2_0= RULE_STRING ) )
            // InternalTrader.g:258:4: (lv_username_2_0= RULE_STRING )
            {
            // InternalTrader.g:258:4: (lv_username_2_0= RULE_STRING )
            // InternalTrader.g:259:5: lv_username_2_0= RULE_STRING
            {
            lv_username_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_username_2_0, grammarAccess.getConnectParametersAccess().getUsernameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectParametersRule());
            					}
            					setWithLastConsumed(
            						current,
            						"username",
            						lv_username_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getConnectParametersAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getConnectParametersAccess().getPasswordKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectParametersAccess().getEqualsSignKeyword_5());
            		
            // InternalTrader.g:287:3: ( (lv_password_6_0= RULE_STRING ) )
            // InternalTrader.g:288:4: (lv_password_6_0= RULE_STRING )
            {
            // InternalTrader.g:288:4: (lv_password_6_0= RULE_STRING )
            // InternalTrader.g:289:5: lv_password_6_0= RULE_STRING
            {
            lv_password_6_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_password_6_0, grammarAccess.getConnectParametersAccess().getPasswordSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectParametersRule());
            					}
            					setWithLastConsumed(
            						current,
            						"password",
            						lv_password_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getConnectParametersAccess().getCommaKeyword_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getConnectParametersAccess().getLeverageKeyword_8());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getConnectParametersAccess().getEqualsSignKeyword_9());
            		
            // InternalTrader.g:317:3: ( (lv_leverage_10_0= ruleREAL ) )
            // InternalTrader.g:318:4: (lv_leverage_10_0= ruleREAL )
            {
            // InternalTrader.g:318:4: (lv_leverage_10_0= ruleREAL )
            // InternalTrader.g:319:5: lv_leverage_10_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getConnectParametersAccess().getLeverageREALParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_10);
            lv_leverage_10_0=ruleREAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectParametersRule());
            					}
            					set(
            						current,
            						"leverage",
            						lv_leverage_10_0,
            						"uk.ac.kcl.inf.trader.Trader.REAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_11, grammarAccess.getConnectParametersAccess().getCommaKeyword_11());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_12, grammarAccess.getConnectParametersAccess().getMoneyKeyword_12());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getConnectParametersAccess().getEqualsSignKeyword_13());
            		
            // InternalTrader.g:348:3: ( (lv_money_14_0= ruleREAL ) )
            // InternalTrader.g:349:4: (lv_money_14_0= ruleREAL )
            {
            // InternalTrader.g:349:4: (lv_money_14_0= ruleREAL )
            // InternalTrader.g:350:5: lv_money_14_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getConnectParametersAccess().getMoneyREALParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_10);
            lv_money_14_0=ruleREAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectParametersRule());
            					}
            					set(
            						current,
            						"money",
            						lv_money_14_0,
            						"uk.ac.kcl.inf.trader.Trader.REAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_15, grammarAccess.getConnectParametersAccess().getCommaKeyword_15());
            		
            otherlv_16=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_16, grammarAccess.getConnectParametersAccess().getTimeframeKeyword_16());
            		
            otherlv_17=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_17, grammarAccess.getConnectParametersAccess().getEqualsSignKeyword_17());
            		
            // InternalTrader.g:379:3: ( (lv_timeframe_18_0= RULE_STRING ) )
            // InternalTrader.g:380:4: (lv_timeframe_18_0= RULE_STRING )
            {
            // InternalTrader.g:380:4: (lv_timeframe_18_0= RULE_STRING )
            // InternalTrader.g:381:5: lv_timeframe_18_0= RULE_STRING
            {
            lv_timeframe_18_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_timeframe_18_0, grammarAccess.getConnectParametersAccess().getTimeframeSTRINGTerminalRuleCall_18_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectParametersRule());
            					}
            					setWithLastConsumed(
            						current,
            						"timeframe",
            						lv_timeframe_18_0,
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
    // $ANTLR end "ruleConnectParameters"


    // $ANTLR start "entryRuleTradingBot"
    // InternalTrader.g:401:1: entryRuleTradingBot returns [EObject current=null] : iv_ruleTradingBot= ruleTradingBot EOF ;
    public final EObject entryRuleTradingBot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTradingBot = null;


        try {
            // InternalTrader.g:401:51: (iv_ruleTradingBot= ruleTradingBot EOF )
            // InternalTrader.g:402:2: iv_ruleTradingBot= ruleTradingBot EOF
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
    // InternalTrader.g:408:1: ruleTradingBot returns [EObject current=null] : (otherlv_0= 'tradingBot' otherlv_1= 'strategy' otherlv_2= '=' ( (lv_strategy_3_0= ruleStrategyDef ) ) otherlv_4= ',' otherlv_5= 'funds' otherlv_6= '=' ( (lv_funds_7_0= ruleREAL ) ) ) ;
    public final EObject ruleTradingBot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_strategy_3_0 = null;

        AntlrDatatypeRuleToken lv_funds_7_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:414:2: ( (otherlv_0= 'tradingBot' otherlv_1= 'strategy' otherlv_2= '=' ( (lv_strategy_3_0= ruleStrategyDef ) ) otherlv_4= ',' otherlv_5= 'funds' otherlv_6= '=' ( (lv_funds_7_0= ruleREAL ) ) ) )
            // InternalTrader.g:415:2: (otherlv_0= 'tradingBot' otherlv_1= 'strategy' otherlv_2= '=' ( (lv_strategy_3_0= ruleStrategyDef ) ) otherlv_4= ',' otherlv_5= 'funds' otherlv_6= '=' ( (lv_funds_7_0= ruleREAL ) ) )
            {
            // InternalTrader.g:415:2: (otherlv_0= 'tradingBot' otherlv_1= 'strategy' otherlv_2= '=' ( (lv_strategy_3_0= ruleStrategyDef ) ) otherlv_4= ',' otherlv_5= 'funds' otherlv_6= '=' ( (lv_funds_7_0= ruleREAL ) ) )
            // InternalTrader.g:416:3: otherlv_0= 'tradingBot' otherlv_1= 'strategy' otherlv_2= '=' ( (lv_strategy_3_0= ruleStrategyDef ) ) otherlv_4= ',' otherlv_5= 'funds' otherlv_6= '=' ( (lv_funds_7_0= ruleREAL ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTradingBotAccess().getTradingBotKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTradingBotAccess().getStrategyKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTradingBotAccess().getEqualsSignKeyword_2());
            		
            // InternalTrader.g:428:3: ( (lv_strategy_3_0= ruleStrategyDef ) )
            // InternalTrader.g:429:4: (lv_strategy_3_0= ruleStrategyDef )
            {
            // InternalTrader.g:429:4: (lv_strategy_3_0= ruleStrategyDef )
            // InternalTrader.g:430:5: lv_strategy_3_0= ruleStrategyDef
            {

            					newCompositeNode(grammarAccess.getTradingBotAccess().getStrategyStrategyDefEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_4=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getTradingBotAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getTradingBotAccess().getFundsKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getTradingBotAccess().getEqualsSignKeyword_6());
            		
            // InternalTrader.g:459:3: ( (lv_funds_7_0= ruleREAL ) )
            // InternalTrader.g:460:4: (lv_funds_7_0= ruleREAL )
            {
            // InternalTrader.g:460:4: (lv_funds_7_0= ruleREAL )
            // InternalTrader.g:461:5: lv_funds_7_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getTradingBotAccess().getFundsREALParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_funds_7_0=ruleREAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTradingBotRule());
            					}
            					set(
            						current,
            						"funds",
            						lv_funds_7_0,
            						"uk.ac.kcl.inf.trader.Trader.REAL");
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
    // $ANTLR end "ruleTradingBot"


    // $ANTLR start "entryRuleExecute"
    // InternalTrader.g:482:1: entryRuleExecute returns [EObject current=null] : iv_ruleExecute= ruleExecute EOF ;
    public final EObject entryRuleExecute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecute = null;


        try {
            // InternalTrader.g:482:48: (iv_ruleExecute= ruleExecute EOF )
            // InternalTrader.g:483:2: iv_ruleExecute= ruleExecute EOF
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
    // InternalTrader.g:489:1: ruleExecute returns [EObject current=null] : (otherlv_0= 'execute' otherlv_1= 'bots' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) ;
    public final EObject ruleExecute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTrader.g:495:2: ( (otherlv_0= 'execute' otherlv_1= 'bots' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) )
            // InternalTrader.g:496:2: (otherlv_0= 'execute' otherlv_1= 'bots' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            {
            // InternalTrader.g:496:2: (otherlv_0= 'execute' otherlv_1= 'bots' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            // InternalTrader.g:497:3: otherlv_0= 'execute' otherlv_1= 'bots' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getExecuteAccess().getExecuteKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExecuteAccess().getBotsKeyword_1());
            		
            // InternalTrader.g:505:3: ( (otherlv_2= RULE_ID ) )
            // InternalTrader.g:506:4: (otherlv_2= RULE_ID )
            {
            // InternalTrader.g:506:4: (otherlv_2= RULE_ID )
            // InternalTrader.g:507:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecuteRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_2, grammarAccess.getExecuteAccess().getBotsTradingBotCrossReference_2_0());
            				

            }


            }

            // InternalTrader.g:518:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTrader.g:519:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExecuteAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalTrader.g:523:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalTrader.g:524:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalTrader.g:524:5: (otherlv_4= RULE_ID )
            	    // InternalTrader.g:525:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExecuteRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    						newLeafNode(otherlv_4, grammarAccess.getExecuteAccess().getBotsTradingBotCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleExecute"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalTrader.g:541:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalTrader.g:541:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalTrader.g:542:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalTrader.g:548:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalTrader.g:554:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalTrader.g:555:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalTrader.g:555:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalTrader.g:556:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalTrader.g:560:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTrader.g:561:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTrader.g:561:4: (lv_name_1_0= RULE_ID )
            // InternalTrader.g:562:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalTrader.g:582:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalTrader.g:583:4: (lv_value_3_0= RULE_INT )
            {
            // InternalTrader.g:583:4: (lv_value_3_0= RULE_INT )
            // InternalTrader.g:584:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleLoopStatement"
    // InternalTrader.g:604:1: entryRuleLoopStatement returns [EObject current=null] : iv_ruleLoopStatement= ruleLoopStatement EOF ;
    public final EObject entryRuleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStatement = null;


        try {
            // InternalTrader.g:604:54: (iv_ruleLoopStatement= ruleLoopStatement EOF )
            // InternalTrader.g:605:2: iv_ruleLoopStatement= ruleLoopStatement EOF
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
    // InternalTrader.g:611:1: ruleLoopStatement returns [EObject current=null] : ( ( (lv_count_0_0= ruleAddition ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' ) ;
    public final EObject ruleLoopStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_count_0_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:617:2: ( ( ( (lv_count_0_0= ruleAddition ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' ) )
            // InternalTrader.g:618:2: ( ( (lv_count_0_0= ruleAddition ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' )
            {
            // InternalTrader.g:618:2: ( ( (lv_count_0_0= ruleAddition ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' )
            // InternalTrader.g:619:3: ( (lv_count_0_0= ruleAddition ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end'
            {
            // InternalTrader.g:619:3: ( (lv_count_0_0= ruleAddition ) )
            // InternalTrader.g:620:4: (lv_count_0_0= ruleAddition )
            {
            // InternalTrader.g:620:4: (lv_count_0_0= ruleAddition )
            // InternalTrader.g:621:5: lv_count_0_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getLoopStatementAccess().getCountAdditionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_count_0_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopStatementRule());
            					}
            					set(
            						current,
            						"count",
            						lv_count_0_0,
            						"uk.ac.kcl.inf.trader.Trader.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopStatementAccess().getTimesKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopStatementAccess().getDoKeyword_2());
            		
            // InternalTrader.g:646:3: ( (lv_statements_3_0= ruleStatement ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==RULE_INT||LA5_0==11||LA5_0==20||LA5_0==23||LA5_0==25||LA5_0==34) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTrader.g:647:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalTrader.g:647:4: (lv_statements_3_0= ruleStatement )
            	    // InternalTrader.g:648:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getLoopStatementAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoopStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"uk.ac.kcl.inf.trader.Trader.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLoopStatementAccess().getEndKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalTrader.g:673:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTrader.g:675:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalTrader.g:676:2: iv_ruleREAL= ruleREAL EOF
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
    // InternalTrader.g:685:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTrader.g:692:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalTrader.g:693:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalTrader.g:693:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalTrader.g:694:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalTrader.g:694:3: (this_INT_0= RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTrader.g:695:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,29,FOLLOW_20); 

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
    // InternalTrader.g:722:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalTrader.g:722:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalTrader.g:723:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalTrader.g:729:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:735:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalTrader.g:736:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalTrader.g:736:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalTrader.g:737:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTrader.g:745:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=30 && LA8_0<=31)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTrader.g:746:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalTrader.g:746:4: ()
            	    // InternalTrader.g:747:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTrader.g:753:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalTrader.g:754:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalTrader.g:754:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalTrader.g:755:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalTrader.g:755:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==30) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==31) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalTrader.g:756:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,30,FOLLOW_26); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalTrader.g:767:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,31,FOLLOW_26); 

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

            	    // InternalTrader.g:780:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalTrader.g:781:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalTrader.g:781:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalTrader.g:782:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalTrader.g:804:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalTrader.g:804:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalTrader.g:805:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalTrader.g:811:1: ruleMultiplication returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:817:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalTrader.g:818:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalTrader.g:818:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalTrader.g:819:3: this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTrader.g:827:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=32 && LA10_0<=33)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTrader.g:828:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalTrader.g:828:4: ()
            	    // InternalTrader.g:829:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTrader.g:835:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalTrader.g:836:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalTrader.g:836:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalTrader.g:837:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalTrader.g:837:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==32) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==33) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalTrader.g:838:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,32,FOLLOW_28); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalTrader.g:849:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,33,FOLLOW_28); 

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

            	    // InternalTrader.g:862:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalTrader.g:863:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalTrader.g:863:5: (lv_right_3_0= rulePrimary )
            	    // InternalTrader.g:864:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
            	    break loop10;
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
    // InternalTrader.g:886:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalTrader.g:886:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalTrader.g:887:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalTrader.g:893:1: rulePrimary returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_IntLiteral_0 = null;

        EObject this_IntVarExpression_1 = null;

        EObject this_Addition_3 = null;



        	enterRule();

        try {
            // InternalTrader.g:899:2: ( (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) ) )
            // InternalTrader.g:900:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) )
            {
            // InternalTrader.g:900:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case 34:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTrader.g:901:3: this_IntLiteral_0= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTrader.g:910:3: this_IntVarExpression_1= ruleIntVarExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getIntVarExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntVarExpression_1=ruleIntVarExpression();

                    state._fsp--;


                    			current = this_IntVarExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTrader.g:919:3: (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' )
                    {
                    // InternalTrader.g:919:3: (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' )
                    // InternalTrader.g:920:4: otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_30);
                    this_Addition_3=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2());
                    			

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


    // $ANTLR start "entryRuleIntLiteral"
    // InternalTrader.g:941:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalTrader.g:941:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalTrader.g:942:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalTrader.g:948:1: ruleIntLiteral returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalTrader.g:954:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalTrader.g:955:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalTrader.g:955:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalTrader.g:956:3: (lv_val_0_0= RULE_INT )
            {
            // InternalTrader.g:956:3: (lv_val_0_0= RULE_INT )
            // InternalTrader.g:957:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleIntVarExpression"
    // InternalTrader.g:976:1: entryRuleIntVarExpression returns [EObject current=null] : iv_ruleIntVarExpression= ruleIntVarExpression EOF ;
    public final EObject entryRuleIntVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVarExpression = null;


        try {
            // InternalTrader.g:976:57: (iv_ruleIntVarExpression= ruleIntVarExpression EOF )
            // InternalTrader.g:977:2: iv_ruleIntVarExpression= ruleIntVarExpression EOF
            {
             newCompositeNode(grammarAccess.getIntVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntVarExpression=ruleIntVarExpression();

            state._fsp--;

             current =iv_ruleIntVarExpression; 
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
    // $ANTLR end "entryRuleIntVarExpression"


    // $ANTLR start "ruleIntVarExpression"
    // InternalTrader.g:983:1: ruleIntVarExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleIntVarExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTrader.g:989:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalTrader.g:990:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalTrader.g:990:2: ( (otherlv_0= RULE_ID ) )
            // InternalTrader.g:991:3: (otherlv_0= RULE_ID )
            {
            // InternalTrader.g:991:3: (otherlv_0= RULE_ID )
            // InternalTrader.g:992:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntVarExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0());
            			

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
    // $ANTLR end "ruleIntVarExpression"


    // $ANTLR start "entryRuleBuy"
    // InternalTrader.g:1006:1: entryRuleBuy returns [EObject current=null] : iv_ruleBuy= ruleBuy EOF ;
    public final EObject entryRuleBuy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuy = null;


        try {
            // InternalTrader.g:1006:44: (iv_ruleBuy= ruleBuy EOF )
            // InternalTrader.g:1007:2: iv_ruleBuy= ruleBuy EOF
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
    // InternalTrader.g:1013:1: ruleBuy returns [EObject current=null] : (otherlv_0= 'buy' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) ) ) ;
    public final EObject ruleBuy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ticker_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_quantity_1_0 = null;

        AntlrDatatypeRuleToken lv_price_5_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:1019:2: ( (otherlv_0= 'buy' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) ) ) )
            // InternalTrader.g:1020:2: (otherlv_0= 'buy' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) ) )
            {
            // InternalTrader.g:1020:2: (otherlv_0= 'buy' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) ) )
            // InternalTrader.g:1021:3: otherlv_0= 'buy' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getBuyAccess().getBuyKeyword_0());
            		
            // InternalTrader.g:1025:3: ( (lv_quantity_1_0= ruleREAL ) )
            // InternalTrader.g:1026:4: (lv_quantity_1_0= ruleREAL )
            {
            // InternalTrader.g:1026:4: (lv_quantity_1_0= ruleREAL )
            // InternalTrader.g:1027:5: lv_quantity_1_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getBuyAccess().getQuantityREALParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_quantity_1_0=ruleREAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBuyRule());
            					}
            					set(
            						current,
            						"quantity",
            						lv_quantity_1_0,
            						"uk.ac.kcl.inf.trader.Trader.REAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTrader.g:1044:3: ( (lv_ticker_2_0= RULE_ID ) )
            // InternalTrader.g:1045:4: (lv_ticker_2_0= RULE_ID )
            {
            // InternalTrader.g:1045:4: (lv_ticker_2_0= RULE_ID )
            // InternalTrader.g:1046:5: lv_ticker_2_0= RULE_ID
            {
            lv_ticker_2_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            otherlv_3=(Token)match(input,37,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getBuyAccess().getAtKeyword_3());
            		
            otherlv_4=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getBuyAccess().getPriceKeyword_4());
            		
            // InternalTrader.g:1070:3: ( (lv_price_5_0= ruleREAL ) )
            // InternalTrader.g:1071:4: (lv_price_5_0= ruleREAL )
            {
            // InternalTrader.g:1071:4: (lv_price_5_0= ruleREAL )
            // InternalTrader.g:1072:5: lv_price_5_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getBuyAccess().getPriceREALParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_price_5_0=ruleREAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBuyRule());
            					}
            					set(
            						current,
            						"price",
            						lv_price_5_0,
            						"uk.ac.kcl.inf.trader.Trader.REAL");
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
    // InternalTrader.g:1093:1: entryRuleSell returns [EObject current=null] : iv_ruleSell= ruleSell EOF ;
    public final EObject entryRuleSell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSell = null;


        try {
            // InternalTrader.g:1093:45: (iv_ruleSell= ruleSell EOF )
            // InternalTrader.g:1094:2: iv_ruleSell= ruleSell EOF
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
    // InternalTrader.g:1100:1: ruleSell returns [EObject current=null] : (otherlv_0= 'sell' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) ) ) ;
    public final EObject ruleSell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ticker_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_quantity_1_0 = null;

        AntlrDatatypeRuleToken lv_price_5_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:1106:2: ( (otherlv_0= 'sell' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) ) ) )
            // InternalTrader.g:1107:2: (otherlv_0= 'sell' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) ) )
            {
            // InternalTrader.g:1107:2: (otherlv_0= 'sell' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) ) )
            // InternalTrader.g:1108:3: otherlv_0= 'sell' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSellAccess().getSellKeyword_0());
            		
            // InternalTrader.g:1112:3: ( (lv_quantity_1_0= ruleREAL ) )
            // InternalTrader.g:1113:4: (lv_quantity_1_0= ruleREAL )
            {
            // InternalTrader.g:1113:4: (lv_quantity_1_0= ruleREAL )
            // InternalTrader.g:1114:5: lv_quantity_1_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getSellAccess().getQuantityREALParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_quantity_1_0=ruleREAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSellRule());
            					}
            					set(
            						current,
            						"quantity",
            						lv_quantity_1_0,
            						"uk.ac.kcl.inf.trader.Trader.REAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTrader.g:1131:3: ( (lv_ticker_2_0= RULE_ID ) )
            // InternalTrader.g:1132:4: (lv_ticker_2_0= RULE_ID )
            {
            // InternalTrader.g:1132:4: (lv_ticker_2_0= RULE_ID )
            // InternalTrader.g:1133:5: lv_ticker_2_0= RULE_ID
            {
            lv_ticker_2_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            otherlv_3=(Token)match(input,37,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getSellAccess().getAtKeyword_3());
            		
            otherlv_4=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getSellAccess().getPriceKeyword_4());
            		
            // InternalTrader.g:1157:3: ( (lv_price_5_0= ruleREAL ) )
            // InternalTrader.g:1158:4: (lv_price_5_0= ruleREAL )
            {
            // InternalTrader.g:1158:4: (lv_price_5_0= ruleREAL )
            // InternalTrader.g:1159:5: lv_price_5_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getSellAccess().getPriceREALParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_price_5_0=ruleREAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSellRule());
            					}
            					set(
            						current,
            						"price",
            						lv_price_5_0,
            						"uk.ac.kcl.inf.trader.Trader.REAL");
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
    // InternalTrader.g:1180:1: ruleStrategyDef returns [Enumerator current=null] : ( (enumLiteral_0= 'buyAndHold' ) | (enumLiteral_1= 'meanReversion' ) ) ;
    public final Enumerator ruleStrategyDef() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTrader.g:1186:2: ( ( (enumLiteral_0= 'buyAndHold' ) | (enumLiteral_1= 'meanReversion' ) ) )
            // InternalTrader.g:1187:2: ( (enumLiteral_0= 'buyAndHold' ) | (enumLiteral_1= 'meanReversion' ) )
            {
            // InternalTrader.g:1187:2: ( (enumLiteral_0= 'buyAndHold' ) | (enumLiteral_1= 'meanReversion' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            else if ( (LA12_0==41) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTrader.g:1188:3: (enumLiteral_0= 'buyAndHold' )
                    {
                    // InternalTrader.g:1188:3: (enumLiteral_0= 'buyAndHold' )
                    // InternalTrader.g:1189:4: enumLiteral_0= 'buyAndHold'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getStrategyDefAccess().getBuyAndHoldEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStrategyDefAccess().getBuyAndHoldEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:1196:3: (enumLiteral_1= 'meanReversion' )
                    {
                    // InternalTrader.g:1196:3: (enumLiteral_1= 'meanReversion' )
                    // InternalTrader.g:1197:4: enumLiteral_1= 'meanReversion'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000402900852L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000412900850L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000004C2900850L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000702900850L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000C02900850L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});

}