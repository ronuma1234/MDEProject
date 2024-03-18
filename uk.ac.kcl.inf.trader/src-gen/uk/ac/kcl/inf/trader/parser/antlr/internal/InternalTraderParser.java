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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'connect'", "'to'", "'broker'", "'with'", "'username'", "','", "'password'", "'leverage'", "'money'", "'timeframe'", "'create'", "'bot'", "'strategy'", "'using'", "'from'", "'see'", "'registered'", "'bots'", "'execute'", "'stop'", "'var'", "'='", "'int'", "':'", "'String'", "'Real'", "'loop'", "'times'", "'do'", "'end'", "'.'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'buy'", "'at'", "'price'", "'sell'", "'buyAndHold'", "'meanReversion'"
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

                if ( (LA1_0==11||LA1_0==21||LA1_0==26||(LA1_0>=29 && LA1_0<=31)||LA1_0==37) ) {
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
    // InternalTrader.g:108:1: ruleStatement returns [EObject current=null] : (this_Connect_0= ruleConnect | this_TradingBot_1= ruleTradingBot | this_ListBots_2= ruleListBots | this_Execute_3= ruleExecute | this_Stop_4= ruleStop | this_VariableDeclaration_5= ruleVariableDeclaration | this_LoopStatement_6= ruleLoopStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Connect_0 = null;

        EObject this_TradingBot_1 = null;

        EObject this_ListBots_2 = null;

        EObject this_Execute_3 = null;

        EObject this_Stop_4 = null;

        EObject this_VariableDeclaration_5 = null;

        EObject this_LoopStatement_6 = null;



        	enterRule();

        try {
            // InternalTrader.g:114:2: ( (this_Connect_0= ruleConnect | this_TradingBot_1= ruleTradingBot | this_ListBots_2= ruleListBots | this_Execute_3= ruleExecute | this_Stop_4= ruleStop | this_VariableDeclaration_5= ruleVariableDeclaration | this_LoopStatement_6= ruleLoopStatement ) )
            // InternalTrader.g:115:2: (this_Connect_0= ruleConnect | this_TradingBot_1= ruleTradingBot | this_ListBots_2= ruleListBots | this_Execute_3= ruleExecute | this_Stop_4= ruleStop | this_VariableDeclaration_5= ruleVariableDeclaration | this_LoopStatement_6= ruleLoopStatement )
            {
            // InternalTrader.g:115:2: (this_Connect_0= ruleConnect | this_TradingBot_1= ruleTradingBot | this_ListBots_2= ruleListBots | this_Execute_3= ruleExecute | this_Stop_4= ruleStop | this_VariableDeclaration_5= ruleVariableDeclaration | this_LoopStatement_6= ruleLoopStatement )
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
            case 37:
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


    // $ANTLR start "entryRuleConnect"
    // InternalTrader.g:182:1: entryRuleConnect returns [EObject current=null] : iv_ruleConnect= ruleConnect EOF ;
    public final EObject entryRuleConnect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnect = null;


        try {
            // InternalTrader.g:182:48: (iv_ruleConnect= ruleConnect EOF )
            // InternalTrader.g:183:2: iv_ruleConnect= ruleConnect EOF
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
    // InternalTrader.g:189:1: ruleConnect returns [EObject current=null] : (otherlv_0= 'connect' otherlv_1= 'to' otherlv_2= 'broker' ( (lv_brokerName_3_0= RULE_ID ) ) otherlv_4= 'with' ( (lv_parameters_5_0= ruleConnectParameters ) )? ) ;
    public final EObject ruleConnect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_brokerName_3_0=null;
        Token otherlv_4=null;
        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:195:2: ( (otherlv_0= 'connect' otherlv_1= 'to' otherlv_2= 'broker' ( (lv_brokerName_3_0= RULE_ID ) ) otherlv_4= 'with' ( (lv_parameters_5_0= ruleConnectParameters ) )? ) )
            // InternalTrader.g:196:2: (otherlv_0= 'connect' otherlv_1= 'to' otherlv_2= 'broker' ( (lv_brokerName_3_0= RULE_ID ) ) otherlv_4= 'with' ( (lv_parameters_5_0= ruleConnectParameters ) )? )
            {
            // InternalTrader.g:196:2: (otherlv_0= 'connect' otherlv_1= 'to' otherlv_2= 'broker' ( (lv_brokerName_3_0= RULE_ID ) ) otherlv_4= 'with' ( (lv_parameters_5_0= ruleConnectParameters ) )? )
            // InternalTrader.g:197:3: otherlv_0= 'connect' otherlv_1= 'to' otherlv_2= 'broker' ( (lv_brokerName_3_0= RULE_ID ) ) otherlv_4= 'with' ( (lv_parameters_5_0= ruleConnectParameters ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectAccess().getConnectKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectAccess().getBrokerKeyword_2());
            		
            // InternalTrader.g:209:3: ( (lv_brokerName_3_0= RULE_ID ) )
            // InternalTrader.g:210:4: (lv_brokerName_3_0= RULE_ID )
            {
            // InternalTrader.g:210:4: (lv_brokerName_3_0= RULE_ID )
            // InternalTrader.g:211:5: lv_brokerName_3_0= RULE_ID
            {
            lv_brokerName_3_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_brokerName_3_0, grammarAccess.getConnectAccess().getBrokerNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"brokerName",
            						lv_brokerName_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getConnectAccess().getWithKeyword_4());
            		
            // InternalTrader.g:231:3: ( (lv_parameters_5_0= ruleConnectParameters ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTrader.g:232:4: (lv_parameters_5_0= ruleConnectParameters )
                    {
                    // InternalTrader.g:232:4: (lv_parameters_5_0= ruleConnectParameters )
                    // InternalTrader.g:233:5: lv_parameters_5_0= ruleConnectParameters
                    {

                    					newCompositeNode(grammarAccess.getConnectAccess().getParametersConnectParametersParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parameters_5_0=ruleConnectParameters();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConnectRule());
                    					}
                    					set(
                    						current,
                    						"parameters",
                    						lv_parameters_5_0,
                    						"uk.ac.kcl.inf.trader.Trader.ConnectParameters");
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
    // $ANTLR end "ruleConnect"


    // $ANTLR start "entryRuleConnectParameters"
    // InternalTrader.g:254:1: entryRuleConnectParameters returns [EObject current=null] : iv_ruleConnectParameters= ruleConnectParameters EOF ;
    public final EObject entryRuleConnectParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectParameters = null;


        try {
            // InternalTrader.g:254:58: (iv_ruleConnectParameters= ruleConnectParameters EOF )
            // InternalTrader.g:255:2: iv_ruleConnectParameters= ruleConnectParameters EOF
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
    // InternalTrader.g:261:1: ruleConnectParameters returns [EObject current=null] : (otherlv_0= 'username' ( (lv_username_1_0= RULE_STRING ) ) otherlv_2= ',' otherlv_3= 'password' ( (lv_password_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'leverage' ( (lv_leverage_7_0= ruleREAL ) ) otherlv_8= ',' otherlv_9= 'money' ( (lv_money_10_0= ruleREAL ) ) otherlv_11= ',' otherlv_12= 'timeframe' ( (lv_timeframe_13_0= RULE_STRING ) ) ) ;
    public final EObject ruleConnectParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_username_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_password_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_timeframe_13_0=null;
        AntlrDatatypeRuleToken lv_leverage_7_0 = null;

        AntlrDatatypeRuleToken lv_money_10_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:267:2: ( (otherlv_0= 'username' ( (lv_username_1_0= RULE_STRING ) ) otherlv_2= ',' otherlv_3= 'password' ( (lv_password_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'leverage' ( (lv_leverage_7_0= ruleREAL ) ) otherlv_8= ',' otherlv_9= 'money' ( (lv_money_10_0= ruleREAL ) ) otherlv_11= ',' otherlv_12= 'timeframe' ( (lv_timeframe_13_0= RULE_STRING ) ) ) )
            // InternalTrader.g:268:2: (otherlv_0= 'username' ( (lv_username_1_0= RULE_STRING ) ) otherlv_2= ',' otherlv_3= 'password' ( (lv_password_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'leverage' ( (lv_leverage_7_0= ruleREAL ) ) otherlv_8= ',' otherlv_9= 'money' ( (lv_money_10_0= ruleREAL ) ) otherlv_11= ',' otherlv_12= 'timeframe' ( (lv_timeframe_13_0= RULE_STRING ) ) )
            {
            // InternalTrader.g:268:2: (otherlv_0= 'username' ( (lv_username_1_0= RULE_STRING ) ) otherlv_2= ',' otherlv_3= 'password' ( (lv_password_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'leverage' ( (lv_leverage_7_0= ruleREAL ) ) otherlv_8= ',' otherlv_9= 'money' ( (lv_money_10_0= ruleREAL ) ) otherlv_11= ',' otherlv_12= 'timeframe' ( (lv_timeframe_13_0= RULE_STRING ) ) )
            // InternalTrader.g:269:3: otherlv_0= 'username' ( (lv_username_1_0= RULE_STRING ) ) otherlv_2= ',' otherlv_3= 'password' ( (lv_password_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'leverage' ( (lv_leverage_7_0= ruleREAL ) ) otherlv_8= ',' otherlv_9= 'money' ( (lv_money_10_0= ruleREAL ) ) otherlv_11= ',' otherlv_12= 'timeframe' ( (lv_timeframe_13_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectParametersAccess().getUsernameKeyword_0());
            		
            // InternalTrader.g:273:3: ( (lv_username_1_0= RULE_STRING ) )
            // InternalTrader.g:274:4: (lv_username_1_0= RULE_STRING )
            {
            // InternalTrader.g:274:4: (lv_username_1_0= RULE_STRING )
            // InternalTrader.g:275:5: lv_username_1_0= RULE_STRING
            {
            lv_username_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_username_1_0, grammarAccess.getConnectParametersAccess().getUsernameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectParametersRule());
            					}
            					setWithLastConsumed(
            						current,
            						"username",
            						lv_username_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectParametersAccess().getCommaKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getConnectParametersAccess().getPasswordKeyword_3());
            		
            // InternalTrader.g:299:3: ( (lv_password_4_0= RULE_STRING ) )
            // InternalTrader.g:300:4: (lv_password_4_0= RULE_STRING )
            {
            // InternalTrader.g:300:4: (lv_password_4_0= RULE_STRING )
            // InternalTrader.g:301:5: lv_password_4_0= RULE_STRING
            {
            lv_password_4_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_password_4_0, grammarAccess.getConnectParametersAccess().getPasswordSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectParametersRule());
            					}
            					setWithLastConsumed(
            						current,
            						"password",
            						lv_password_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectParametersAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getConnectParametersAccess().getLeverageKeyword_6());
            		
            // InternalTrader.g:325:3: ( (lv_leverage_7_0= ruleREAL ) )
            // InternalTrader.g:326:4: (lv_leverage_7_0= ruleREAL )
            {
            // InternalTrader.g:326:4: (lv_leverage_7_0= ruleREAL )
            // InternalTrader.g:327:5: lv_leverage_7_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getConnectParametersAccess().getLeverageREALParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_leverage_7_0=ruleREAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectParametersRule());
            					}
            					set(
            						current,
            						"leverage",
            						lv_leverage_7_0,
            						"uk.ac.kcl.inf.trader.Trader.REAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getConnectParametersAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getConnectParametersAccess().getMoneyKeyword_9());
            		
            // InternalTrader.g:352:3: ( (lv_money_10_0= ruleREAL ) )
            // InternalTrader.g:353:4: (lv_money_10_0= ruleREAL )
            {
            // InternalTrader.g:353:4: (lv_money_10_0= ruleREAL )
            // InternalTrader.g:354:5: lv_money_10_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getConnectParametersAccess().getMoneyREALParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_10);
            lv_money_10_0=ruleREAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectParametersRule());
            					}
            					set(
            						current,
            						"money",
            						lv_money_10_0,
            						"uk.ac.kcl.inf.trader.Trader.REAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_11, grammarAccess.getConnectParametersAccess().getCommaKeyword_11());
            		
            otherlv_12=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getConnectParametersAccess().getTimeframeKeyword_12());
            		
            // InternalTrader.g:379:3: ( (lv_timeframe_13_0= RULE_STRING ) )
            // InternalTrader.g:380:4: (lv_timeframe_13_0= RULE_STRING )
            {
            // InternalTrader.g:380:4: (lv_timeframe_13_0= RULE_STRING )
            // InternalTrader.g:381:5: lv_timeframe_13_0= RULE_STRING
            {
            lv_timeframe_13_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_timeframe_13_0, grammarAccess.getConnectParametersAccess().getTimeframeSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectParametersRule());
            					}
            					setWithLastConsumed(
            						current,
            						"timeframe",
            						lv_timeframe_13_0,
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
    // InternalTrader.g:408:1: ruleTradingBot returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'bot' ( (lv_botName_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_strategy_4_0= ruleStrategyDef ) ) otherlv_5= 'strategy' otherlv_6= 'using' ( (lv_funds_7_0= ruleREAL ) ) otherlv_8= 'from' otherlv_9= 'money' ) ;
    public final EObject ruleTradingBot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_botName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_strategy_4_0 = null;

        AntlrDatatypeRuleToken lv_funds_7_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:414:2: ( (otherlv_0= 'create' otherlv_1= 'bot' ( (lv_botName_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_strategy_4_0= ruleStrategyDef ) ) otherlv_5= 'strategy' otherlv_6= 'using' ( (lv_funds_7_0= ruleREAL ) ) otherlv_8= 'from' otherlv_9= 'money' ) )
            // InternalTrader.g:415:2: (otherlv_0= 'create' otherlv_1= 'bot' ( (lv_botName_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_strategy_4_0= ruleStrategyDef ) ) otherlv_5= 'strategy' otherlv_6= 'using' ( (lv_funds_7_0= ruleREAL ) ) otherlv_8= 'from' otherlv_9= 'money' )
            {
            // InternalTrader.g:415:2: (otherlv_0= 'create' otherlv_1= 'bot' ( (lv_botName_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_strategy_4_0= ruleStrategyDef ) ) otherlv_5= 'strategy' otherlv_6= 'using' ( (lv_funds_7_0= ruleREAL ) ) otherlv_8= 'from' otherlv_9= 'money' )
            // InternalTrader.g:416:3: otherlv_0= 'create' otherlv_1= 'bot' ( (lv_botName_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_strategy_4_0= ruleStrategyDef ) ) otherlv_5= 'strategy' otherlv_6= 'using' ( (lv_funds_7_0= ruleREAL ) ) otherlv_8= 'from' otherlv_9= 'money'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTradingBotAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getTradingBotAccess().getBotKeyword_1());
            		
            // InternalTrader.g:424:3: ( (lv_botName_2_0= RULE_ID ) )
            // InternalTrader.g:425:4: (lv_botName_2_0= RULE_ID )
            {
            // InternalTrader.g:425:4: (lv_botName_2_0= RULE_ID )
            // InternalTrader.g:426:5: lv_botName_2_0= RULE_ID
            {
            lv_botName_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_botName_2_0, grammarAccess.getTradingBotAccess().getBotNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTradingBotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"botName",
            						lv_botName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getTradingBotAccess().getWithKeyword_3());
            		
            // InternalTrader.g:446:3: ( (lv_strategy_4_0= ruleStrategyDef ) )
            // InternalTrader.g:447:4: (lv_strategy_4_0= ruleStrategyDef )
            {
            // InternalTrader.g:447:4: (lv_strategy_4_0= ruleStrategyDef )
            // InternalTrader.g:448:5: lv_strategy_4_0= ruleStrategyDef
            {

            					newCompositeNode(grammarAccess.getTradingBotAccess().getStrategyStrategyDefEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_strategy_4_0=ruleStrategyDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTradingBotRule());
            					}
            					set(
            						current,
            						"strategy",
            						lv_strategy_4_0,
            						"uk.ac.kcl.inf.trader.Trader.StrategyDef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getTradingBotAccess().getStrategyKeyword_5());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getTradingBotAccess().getUsingKeyword_6());
            		
            // InternalTrader.g:473:3: ( (lv_funds_7_0= ruleREAL ) )
            // InternalTrader.g:474:4: (lv_funds_7_0= ruleREAL )
            {
            // InternalTrader.g:474:4: (lv_funds_7_0= ruleREAL )
            // InternalTrader.g:475:5: lv_funds_7_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getTradingBotAccess().getFundsREALParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_8=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getTradingBotAccess().getFromKeyword_8());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTradingBotAccess().getMoneyKeyword_9());
            		

            }


            }


            	leaveRule();

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
    // InternalTrader.g:504:1: entryRuleListBots returns [EObject current=null] : iv_ruleListBots= ruleListBots EOF ;
    public final EObject entryRuleListBots() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListBots = null;


        try {
            // InternalTrader.g:504:49: (iv_ruleListBots= ruleListBots EOF )
            // InternalTrader.g:505:2: iv_ruleListBots= ruleListBots EOF
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
    // InternalTrader.g:511:1: ruleListBots returns [EObject current=null] : ( ( (lv_listCommand_0_0= 'see' ) ) otherlv_1= 'registered' otherlv_2= 'bots' ) ;
    public final EObject ruleListBots() throws RecognitionException {
        EObject current = null;

        Token lv_listCommand_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTrader.g:517:2: ( ( ( (lv_listCommand_0_0= 'see' ) ) otherlv_1= 'registered' otherlv_2= 'bots' ) )
            // InternalTrader.g:518:2: ( ( (lv_listCommand_0_0= 'see' ) ) otherlv_1= 'registered' otherlv_2= 'bots' )
            {
            // InternalTrader.g:518:2: ( ( (lv_listCommand_0_0= 'see' ) ) otherlv_1= 'registered' otherlv_2= 'bots' )
            // InternalTrader.g:519:3: ( (lv_listCommand_0_0= 'see' ) ) otherlv_1= 'registered' otherlv_2= 'bots'
            {
            // InternalTrader.g:519:3: ( (lv_listCommand_0_0= 'see' ) )
            // InternalTrader.g:520:4: (lv_listCommand_0_0= 'see' )
            {
            // InternalTrader.g:520:4: (lv_listCommand_0_0= 'see' )
            // InternalTrader.g:521:5: lv_listCommand_0_0= 'see'
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
    // InternalTrader.g:545:1: entryRuleExecute returns [EObject current=null] : iv_ruleExecute= ruleExecute EOF ;
    public final EObject entryRuleExecute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecute = null;


        try {
            // InternalTrader.g:545:48: (iv_ruleExecute= ruleExecute EOF )
            // InternalTrader.g:546:2: iv_ruleExecute= ruleExecute EOF
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
    // InternalTrader.g:552:1: ruleExecute returns [EObject current=null] : ( ( (lv_executeCommand_0_0= 'execute' ) ) otherlv_1= 'bots' ) ;
    public final EObject ruleExecute() throws RecognitionException {
        EObject current = null;

        Token lv_executeCommand_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTrader.g:558:2: ( ( ( (lv_executeCommand_0_0= 'execute' ) ) otherlv_1= 'bots' ) )
            // InternalTrader.g:559:2: ( ( (lv_executeCommand_0_0= 'execute' ) ) otherlv_1= 'bots' )
            {
            // InternalTrader.g:559:2: ( ( (lv_executeCommand_0_0= 'execute' ) ) otherlv_1= 'bots' )
            // InternalTrader.g:560:3: ( (lv_executeCommand_0_0= 'execute' ) ) otherlv_1= 'bots'
            {
            // InternalTrader.g:560:3: ( (lv_executeCommand_0_0= 'execute' ) )
            // InternalTrader.g:561:4: (lv_executeCommand_0_0= 'execute' )
            {
            // InternalTrader.g:561:4: (lv_executeCommand_0_0= 'execute' )
            // InternalTrader.g:562:5: lv_executeCommand_0_0= 'execute'
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
    // InternalTrader.g:582:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalTrader.g:582:45: (iv_ruleStop= ruleStop EOF )
            // InternalTrader.g:583:2: iv_ruleStop= ruleStop EOF
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
    // InternalTrader.g:589:1: ruleStop returns [EObject current=null] : ( ( (lv_stopCommand_0_0= 'stop' ) ) otherlv_1= 'bots' ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token lv_stopCommand_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTrader.g:595:2: ( ( ( (lv_stopCommand_0_0= 'stop' ) ) otherlv_1= 'bots' ) )
            // InternalTrader.g:596:2: ( ( (lv_stopCommand_0_0= 'stop' ) ) otherlv_1= 'bots' )
            {
            // InternalTrader.g:596:2: ( ( (lv_stopCommand_0_0= 'stop' ) ) otherlv_1= 'bots' )
            // InternalTrader.g:597:3: ( (lv_stopCommand_0_0= 'stop' ) ) otherlv_1= 'bots'
            {
            // InternalTrader.g:597:3: ( (lv_stopCommand_0_0= 'stop' ) )
            // InternalTrader.g:598:4: (lv_stopCommand_0_0= 'stop' )
            {
            // InternalTrader.g:598:4: (lv_stopCommand_0_0= 'stop' )
            // InternalTrader.g:599:5: lv_stopCommand_0_0= 'stop'
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
    // InternalTrader.g:619:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalTrader.g:619:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalTrader.g:620:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalTrader.g:626:1: ruleVariableDeclaration returns [EObject current=null] : (this_IntVariableDeclaration_0= ruleIntVariableDeclaration | this_StringVariableDeclaration_1= ruleStringVariableDeclaration | this_RealVariableDeclaration_2= ruleRealVariableDeclaration ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_IntVariableDeclaration_0 = null;

        EObject this_StringVariableDeclaration_1 = null;

        EObject this_RealVariableDeclaration_2 = null;



        	enterRule();

        try {
            // InternalTrader.g:632:2: ( (this_IntVariableDeclaration_0= ruleIntVariableDeclaration | this_StringVariableDeclaration_1= ruleStringVariableDeclaration | this_RealVariableDeclaration_2= ruleRealVariableDeclaration ) )
            // InternalTrader.g:633:2: (this_IntVariableDeclaration_0= ruleIntVariableDeclaration | this_StringVariableDeclaration_1= ruleStringVariableDeclaration | this_RealVariableDeclaration_2= ruleRealVariableDeclaration )
            {
            // InternalTrader.g:633:2: (this_IntVariableDeclaration_0= ruleIntVariableDeclaration | this_StringVariableDeclaration_1= ruleStringVariableDeclaration | this_RealVariableDeclaration_2= ruleRealVariableDeclaration )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==31) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==32) ) {
                        switch ( input.LA(4) ) {
                        case 36:
                            {
                            alt4=3;
                            }
                            break;
                        case 33:
                            {
                            alt4=1;
                            }
                            break;
                        case 35:
                            {
                            alt4=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTrader.g:634:3: this_IntVariableDeclaration_0= ruleIntVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getVariableDeclarationAccess().getIntVariableDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntVariableDeclaration_0=ruleIntVariableDeclaration();

                    state._fsp--;


                    			current = this_IntVariableDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTrader.g:643:3: this_StringVariableDeclaration_1= ruleStringVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getVariableDeclarationAccess().getStringVariableDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringVariableDeclaration_1=ruleStringVariableDeclaration();

                    state._fsp--;


                    			current = this_StringVariableDeclaration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTrader.g:652:3: this_RealVariableDeclaration_2= ruleRealVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getVariableDeclarationAccess().getRealVariableDeclarationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealVariableDeclaration_2=ruleRealVariableDeclaration();

                    state._fsp--;


                    			current = this_RealVariableDeclaration_2;
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleIntVariableDeclaration"
    // InternalTrader.g:664:1: entryRuleIntVariableDeclaration returns [EObject current=null] : iv_ruleIntVariableDeclaration= ruleIntVariableDeclaration EOF ;
    public final EObject entryRuleIntVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVariableDeclaration = null;


        try {
            // InternalTrader.g:664:63: (iv_ruleIntVariableDeclaration= ruleIntVariableDeclaration EOF )
            // InternalTrader.g:665:2: iv_ruleIntVariableDeclaration= ruleIntVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getIntVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntVariableDeclaration=ruleIntVariableDeclaration();

            state._fsp--;

             current =iv_ruleIntVariableDeclaration; 
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
    // $ANTLR end "entryRuleIntVariableDeclaration"


    // $ANTLR start "ruleIntVariableDeclaration"
    // InternalTrader.g:671:1: ruleIntVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'int' otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ) ;
    public final EObject ruleIntVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;


        	enterRule();

        try {
            // InternalTrader.g:677:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'int' otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ) )
            // InternalTrader.g:678:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'int' otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) )
            {
            // InternalTrader.g:678:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'int' otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) )
            // InternalTrader.g:679:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'int' otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIntVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalTrader.g:683:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTrader.g:684:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTrader.g:684:4: (lv_name_1_0= RULE_ID )
            // InternalTrader.g:685:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIntVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getIntVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getIntVariableDeclarationAccess().getIntKeyword_3());
            		
            otherlv_4=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getIntVariableDeclarationAccess().getColonKeyword_4());
            		
            // InternalTrader.g:713:3: ( (lv_value_5_0= RULE_INT ) )
            // InternalTrader.g:714:4: (lv_value_5_0= RULE_INT )
            {
            // InternalTrader.g:714:4: (lv_value_5_0= RULE_INT )
            // InternalTrader.g:715:5: lv_value_5_0= RULE_INT
            {
            lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_5_0, grammarAccess.getIntVariableDeclarationAccess().getValueINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
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
    // $ANTLR end "ruleIntVariableDeclaration"


    // $ANTLR start "entryRuleStringVariableDeclaration"
    // InternalTrader.g:735:1: entryRuleStringVariableDeclaration returns [EObject current=null] : iv_ruleStringVariableDeclaration= ruleStringVariableDeclaration EOF ;
    public final EObject entryRuleStringVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVariableDeclaration = null;


        try {
            // InternalTrader.g:735:66: (iv_ruleStringVariableDeclaration= ruleStringVariableDeclaration EOF )
            // InternalTrader.g:736:2: iv_ruleStringVariableDeclaration= ruleStringVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStringVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringVariableDeclaration=ruleStringVariableDeclaration();

            state._fsp--;

             current =iv_ruleStringVariableDeclaration; 
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
    // $ANTLR end "entryRuleStringVariableDeclaration"


    // $ANTLR start "ruleStringVariableDeclaration"
    // InternalTrader.g:742:1: ruleStringVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'String' otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;


        	enterRule();

        try {
            // InternalTrader.g:748:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'String' otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) ) )
            // InternalTrader.g:749:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'String' otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) )
            {
            // InternalTrader.g:749:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'String' otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) )
            // InternalTrader.g:750:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'String' otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getStringVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalTrader.g:754:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTrader.g:755:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTrader.g:755:4: (lv_name_1_0= RULE_ID )
            // InternalTrader.g:756:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStringVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getStringVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getStringVariableDeclarationAccess().getStringKeyword_3());
            		
            otherlv_4=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getStringVariableDeclarationAccess().getColonKeyword_4());
            		
            // InternalTrader.g:784:3: ( (lv_value_5_0= RULE_STRING ) )
            // InternalTrader.g:785:4: (lv_value_5_0= RULE_STRING )
            {
            // InternalTrader.g:785:4: (lv_value_5_0= RULE_STRING )
            // InternalTrader.g:786:5: lv_value_5_0= RULE_STRING
            {
            lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_5_0, grammarAccess.getStringVariableDeclarationAccess().getValueSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
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
    // $ANTLR end "ruleStringVariableDeclaration"


    // $ANTLR start "entryRuleRealVariableDeclaration"
    // InternalTrader.g:806:1: entryRuleRealVariableDeclaration returns [EObject current=null] : iv_ruleRealVariableDeclaration= ruleRealVariableDeclaration EOF ;
    public final EObject entryRuleRealVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealVariableDeclaration = null;


        try {
            // InternalTrader.g:806:64: (iv_ruleRealVariableDeclaration= ruleRealVariableDeclaration EOF )
            // InternalTrader.g:807:2: iv_ruleRealVariableDeclaration= ruleRealVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getRealVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealVariableDeclaration=ruleRealVariableDeclaration();

            state._fsp--;

             current =iv_ruleRealVariableDeclaration; 
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
    // $ANTLR end "entryRuleRealVariableDeclaration"


    // $ANTLR start "ruleRealVariableDeclaration"
    // InternalTrader.g:813:1: ruleRealVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Real' otherlv_4= ':' ( (lv_value_5_0= ruleREAL ) ) ) ;
    public final EObject ruleRealVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:819:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Real' otherlv_4= ':' ( (lv_value_5_0= ruleREAL ) ) ) )
            // InternalTrader.g:820:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Real' otherlv_4= ':' ( (lv_value_5_0= ruleREAL ) ) )
            {
            // InternalTrader.g:820:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Real' otherlv_4= ':' ( (lv_value_5_0= ruleREAL ) ) )
            // InternalTrader.g:821:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Real' otherlv_4= ':' ( (lv_value_5_0= ruleREAL ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRealVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalTrader.g:825:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTrader.g:826:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTrader.g:826:4: (lv_name_1_0= RULE_ID )
            // InternalTrader.g:827:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRealVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRealVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getRealVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getRealVariableDeclarationAccess().getRealKeyword_3());
            		
            otherlv_4=(Token)match(input,34,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getRealVariableDeclarationAccess().getColonKeyword_4());
            		
            // InternalTrader.g:855:3: ( (lv_value_5_0= ruleREAL ) )
            // InternalTrader.g:856:4: (lv_value_5_0= ruleREAL )
            {
            // InternalTrader.g:856:4: (lv_value_5_0= ruleREAL )
            // InternalTrader.g:857:5: lv_value_5_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getRealVariableDeclarationAccess().getValueREALParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_5_0=ruleREAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRealVariableDeclarationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
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
    // $ANTLR end "ruleRealVariableDeclaration"


    // $ANTLR start "entryRuleLoopStatement"
    // InternalTrader.g:878:1: entryRuleLoopStatement returns [EObject current=null] : iv_ruleLoopStatement= ruleLoopStatement EOF ;
    public final EObject entryRuleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStatement = null;


        try {
            // InternalTrader.g:878:54: (iv_ruleLoopStatement= ruleLoopStatement EOF )
            // InternalTrader.g:879:2: iv_ruleLoopStatement= ruleLoopStatement EOF
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
    // InternalTrader.g:885:1: ruleLoopStatement returns [EObject current=null] : (otherlv_0= 'loop' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times' otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end' ) ;
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
            // InternalTrader.g:891:2: ( (otherlv_0= 'loop' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times' otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end' ) )
            // InternalTrader.g:892:2: (otherlv_0= 'loop' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times' otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end' )
            {
            // InternalTrader.g:892:2: (otherlv_0= 'loop' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times' otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end' )
            // InternalTrader.g:893:3: otherlv_0= 'loop' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times' otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopStatementAccess().getLoopKeyword_0());
            		
            // InternalTrader.g:897:3: ( (lv_count_1_0= ruleAddition ) )
            // InternalTrader.g:898:4: (lv_count_1_0= ruleAddition )
            {
            // InternalTrader.g:898:4: (lv_count_1_0= ruleAddition )
            // InternalTrader.g:899:5: lv_count_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getLoopStatementAccess().getCountAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_2=(Token)match(input,38,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopStatementAccess().getTimesKeyword_2());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopStatementAccess().getDoKeyword_3());
            		
            // InternalTrader.g:924:3: ( (lv_statements_4_0= ruleStatement ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11||LA5_0==21||LA5_0==26||(LA5_0>=29 && LA5_0<=31)||LA5_0==37) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTrader.g:925:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalTrader.g:925:4: (lv_statements_4_0= ruleStatement )
            	    // InternalTrader.g:926:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getLoopStatementAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_32);
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_5=(Token)match(input,40,FOLLOW_2); 

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
    // InternalTrader.g:951:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTrader.g:953:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalTrader.g:954:2: iv_ruleREAL= ruleREAL EOF
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
    // InternalTrader.g:963:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTrader.g:970:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalTrader.g:971:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalTrader.g:971:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalTrader.g:972:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalTrader.g:972:3: (this_INT_0= RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTrader.g:973:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_33); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,41,FOLLOW_26); 

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
    // InternalTrader.g:1000:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalTrader.g:1000:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalTrader.g:1001:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalTrader.g:1007:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:1013:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalTrader.g:1014:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalTrader.g:1014:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalTrader.g:1015:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTrader.g:1023:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=42 && LA8_0<=43)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTrader.g:1024:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalTrader.g:1024:4: ()
            	    // InternalTrader.g:1025:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTrader.g:1031:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalTrader.g:1032:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalTrader.g:1032:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalTrader.g:1033:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalTrader.g:1033:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==42) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==43) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalTrader.g:1034:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,42,FOLLOW_29); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalTrader.g:1045:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,43,FOLLOW_29); 

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

            	    // InternalTrader.g:1058:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalTrader.g:1059:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalTrader.g:1059:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalTrader.g:1060:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
    // InternalTrader.g:1082:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalTrader.g:1082:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalTrader.g:1083:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalTrader.g:1089:1: ruleMultiplication returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTrader.g:1095:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalTrader.g:1096:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalTrader.g:1096:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalTrader.g:1097:3: this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTrader.g:1105:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=44 && LA10_0<=45)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTrader.g:1106:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalTrader.g:1106:4: ()
            	    // InternalTrader.g:1107:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTrader.g:1113:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalTrader.g:1114:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalTrader.g:1114:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalTrader.g:1115:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalTrader.g:1115:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==44) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==45) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalTrader.g:1116:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,44,FOLLOW_29); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalTrader.g:1127:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,45,FOLLOW_29); 

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

            	    // InternalTrader.g:1140:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalTrader.g:1141:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalTrader.g:1141:5: (lv_right_3_0= rulePrimary )
            	    // InternalTrader.g:1142:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
    // InternalTrader.g:1164:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalTrader.g:1164:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalTrader.g:1165:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalTrader.g:1171:1: rulePrimary returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_IntLiteral_0 = null;

        EObject this_IntVarExpression_1 = null;

        EObject this_Addition_3 = null;



        	enterRule();

        try {
            // InternalTrader.g:1177:2: ( (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) ) )
            // InternalTrader.g:1178:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) )
            {
            // InternalTrader.g:1178:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) )
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
            case 46:
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
                    // InternalTrader.g:1179:3: this_IntLiteral_0= ruleIntLiteral
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
                    // InternalTrader.g:1188:3: this_IntVarExpression_1= ruleIntVarExpression
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
                    // InternalTrader.g:1197:3: (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' )
                    {
                    // InternalTrader.g:1197:3: (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' )
                    // InternalTrader.g:1198:4: otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_36);
                    this_Addition_3=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,47,FOLLOW_2); 

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
    // InternalTrader.g:1219:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalTrader.g:1219:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalTrader.g:1220:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalTrader.g:1226:1: ruleIntLiteral returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalTrader.g:1232:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalTrader.g:1233:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalTrader.g:1233:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalTrader.g:1234:3: (lv_val_0_0= RULE_INT )
            {
            // InternalTrader.g:1234:3: (lv_val_0_0= RULE_INT )
            // InternalTrader.g:1235:4: lv_val_0_0= RULE_INT
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
    // InternalTrader.g:1254:1: entryRuleIntVarExpression returns [EObject current=null] : iv_ruleIntVarExpression= ruleIntVarExpression EOF ;
    public final EObject entryRuleIntVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVarExpression = null;


        try {
            // InternalTrader.g:1254:57: (iv_ruleIntVarExpression= ruleIntVarExpression EOF )
            // InternalTrader.g:1255:2: iv_ruleIntVarExpression= ruleIntVarExpression EOF
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
    // InternalTrader.g:1261:1: ruleIntVarExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleIntVarExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTrader.g:1267:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalTrader.g:1268:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalTrader.g:1268:2: ( (otherlv_0= RULE_ID ) )
            // InternalTrader.g:1269:3: (otherlv_0= RULE_ID )
            {
            // InternalTrader.g:1269:3: (otherlv_0= RULE_ID )
            // InternalTrader.g:1270:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntVarExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getIntVarExpressionAccess().getVarIntVariableDeclarationCrossReference_0());
            			

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
    // InternalTrader.g:1284:1: entryRuleBuy returns [EObject current=null] : iv_ruleBuy= ruleBuy EOF ;
    public final EObject entryRuleBuy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuy = null;


        try {
            // InternalTrader.g:1284:44: (iv_ruleBuy= ruleBuy EOF )
            // InternalTrader.g:1285:2: iv_ruleBuy= ruleBuy EOF
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
    // InternalTrader.g:1291:1: ruleBuy returns [EObject current=null] : (otherlv_0= 'buy' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) ) ) ;
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
            // InternalTrader.g:1297:2: ( (otherlv_0= 'buy' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) ) ) )
            // InternalTrader.g:1298:2: (otherlv_0= 'buy' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) ) )
            {
            // InternalTrader.g:1298:2: (otherlv_0= 'buy' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) ) )
            // InternalTrader.g:1299:3: otherlv_0= 'buy' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getBuyAccess().getBuyKeyword_0());
            		
            // InternalTrader.g:1303:3: ( (lv_quantity_1_0= ruleREAL ) )
            // InternalTrader.g:1304:4: (lv_quantity_1_0= ruleREAL )
            {
            // InternalTrader.g:1304:4: (lv_quantity_1_0= ruleREAL )
            // InternalTrader.g:1305:5: lv_quantity_1_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getBuyAccess().getQuantityREALParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalTrader.g:1322:3: ( (lv_ticker_2_0= RULE_ID ) )
            // InternalTrader.g:1323:4: (lv_ticker_2_0= RULE_ID )
            {
            // InternalTrader.g:1323:4: (lv_ticker_2_0= RULE_ID )
            // InternalTrader.g:1324:5: lv_ticker_2_0= RULE_ID
            {
            lv_ticker_2_0=(Token)match(input,RULE_ID,FOLLOW_37); 

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

            otherlv_3=(Token)match(input,49,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getBuyAccess().getAtKeyword_3());
            		
            otherlv_4=(Token)match(input,50,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getBuyAccess().getPriceKeyword_4());
            		
            // InternalTrader.g:1348:3: ( (lv_price_5_0= ruleREAL ) )
            // InternalTrader.g:1349:4: (lv_price_5_0= ruleREAL )
            {
            // InternalTrader.g:1349:4: (lv_price_5_0= ruleREAL )
            // InternalTrader.g:1350:5: lv_price_5_0= ruleREAL
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
    // InternalTrader.g:1371:1: entryRuleSell returns [EObject current=null] : iv_ruleSell= ruleSell EOF ;
    public final EObject entryRuleSell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSell = null;


        try {
            // InternalTrader.g:1371:45: (iv_ruleSell= ruleSell EOF )
            // InternalTrader.g:1372:2: iv_ruleSell= ruleSell EOF
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
    // InternalTrader.g:1378:1: ruleSell returns [EObject current=null] : (otherlv_0= 'sell' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) ) ) ;
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
            // InternalTrader.g:1384:2: ( (otherlv_0= 'sell' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) ) ) )
            // InternalTrader.g:1385:2: (otherlv_0= 'sell' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) ) )
            {
            // InternalTrader.g:1385:2: (otherlv_0= 'sell' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) ) )
            // InternalTrader.g:1386:3: otherlv_0= 'sell' ( (lv_quantity_1_0= ruleREAL ) ) ( (lv_ticker_2_0= RULE_ID ) ) otherlv_3= 'at' otherlv_4= 'price' ( (lv_price_5_0= ruleREAL ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSellAccess().getSellKeyword_0());
            		
            // InternalTrader.g:1390:3: ( (lv_quantity_1_0= ruleREAL ) )
            // InternalTrader.g:1391:4: (lv_quantity_1_0= ruleREAL )
            {
            // InternalTrader.g:1391:4: (lv_quantity_1_0= ruleREAL )
            // InternalTrader.g:1392:5: lv_quantity_1_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getSellAccess().getQuantityREALParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalTrader.g:1409:3: ( (lv_ticker_2_0= RULE_ID ) )
            // InternalTrader.g:1410:4: (lv_ticker_2_0= RULE_ID )
            {
            // InternalTrader.g:1410:4: (lv_ticker_2_0= RULE_ID )
            // InternalTrader.g:1411:5: lv_ticker_2_0= RULE_ID
            {
            lv_ticker_2_0=(Token)match(input,RULE_ID,FOLLOW_37); 

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

            otherlv_3=(Token)match(input,49,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getSellAccess().getAtKeyword_3());
            		
            otherlv_4=(Token)match(input,50,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getSellAccess().getPriceKeyword_4());
            		
            // InternalTrader.g:1435:3: ( (lv_price_5_0= ruleREAL ) )
            // InternalTrader.g:1436:4: (lv_price_5_0= ruleREAL )
            {
            // InternalTrader.g:1436:4: (lv_price_5_0= ruleREAL )
            // InternalTrader.g:1437:5: lv_price_5_0= ruleREAL
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
    // InternalTrader.g:1458:1: ruleStrategyDef returns [Enumerator current=null] : ( (enumLiteral_0= 'buyAndHold' ) | (enumLiteral_1= 'meanReversion' ) ) ;
    public final Enumerator ruleStrategyDef() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTrader.g:1464:2: ( ( (enumLiteral_0= 'buyAndHold' ) | (enumLiteral_1= 'meanReversion' ) ) )
            // InternalTrader.g:1465:2: ( (enumLiteral_0= 'buyAndHold' ) | (enumLiteral_1= 'meanReversion' ) )
            {
            // InternalTrader.g:1465:2: ( (enumLiteral_0= 'buyAndHold' ) | (enumLiteral_1= 'meanReversion' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==52) ) {
                alt12=1;
            }
            else if ( (LA12_0==53) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTrader.g:1466:3: (enumLiteral_0= 'buyAndHold' )
                    {
                    // InternalTrader.g:1466:3: (enumLiteral_0= 'buyAndHold' )
                    // InternalTrader.g:1467:4: enumLiteral_0= 'buyAndHold'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getStrategyDefAccess().getBuyAndHoldEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStrategyDefAccess().getBuyAndHoldEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:1474:3: (enumLiteral_1= 'meanReversion' )
                    {
                    // InternalTrader.g:1474:3: (enumLiteral_1= 'meanReversion' )
                    // InternalTrader.g:1475:4: enumLiteral_1= 'meanReversion'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000020E4200802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000050L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000120E4200800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});

}