package uk.ac.kcl.inf.trader.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.trader.services.TraderGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTraderParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'buyAndHold'", "'meanReversion'", "'connect'", "'broker'", "','", "'username'", "'='", "'password'", "'leverage'", "'money'", "'timeframe'", "'tradingBot'", "'strategy'", "'funds'", "'execute'", "'bots'", "'var'", "'times'", "'do'", "'end'", "'.'", "'('", "')'", "'buy'", "'at'", "'price'", "'sell'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(TraderGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTraderProgram"
    // InternalTrader.g:53:1: entryRuleTraderProgram : ruleTraderProgram EOF ;
    public final void entryRuleTraderProgram() throws RecognitionException {
        try {
            // InternalTrader.g:54:1: ( ruleTraderProgram EOF )
            // InternalTrader.g:55:1: ruleTraderProgram EOF
            {
             before(grammarAccess.getTraderProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleTraderProgram();

            state._fsp--;

             after(grammarAccess.getTraderProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTraderProgram"


    // $ANTLR start "ruleTraderProgram"
    // InternalTrader.g:62:1: ruleTraderProgram : ( ( rule__TraderProgram__StatementsAssignment )* ) ;
    public final void ruleTraderProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:66:2: ( ( ( rule__TraderProgram__StatementsAssignment )* ) )
            // InternalTrader.g:67:2: ( ( rule__TraderProgram__StatementsAssignment )* )
            {
            // InternalTrader.g:67:2: ( ( rule__TraderProgram__StatementsAssignment )* )
            // InternalTrader.g:68:3: ( rule__TraderProgram__StatementsAssignment )*
            {
             before(grammarAccess.getTraderProgramAccess().getStatementsAssignment()); 
            // InternalTrader.g:69:3: ( rule__TraderProgram__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_ID)||LA1_0==17||LA1_0==26||LA1_0==29||LA1_0==31||LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTrader.g:69:4: rule__TraderProgram__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__TraderProgram__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTraderProgramAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTraderProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalTrader.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalTrader.g:79:1: ( ruleStatement EOF )
            // InternalTrader.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTrader.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalTrader.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalTrader.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalTrader.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalTrader.g:94:3: ( rule__Statement__Alternatives )
            // InternalTrader.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleConnect"
    // InternalTrader.g:103:1: entryRuleConnect : ruleConnect EOF ;
    public final void entryRuleConnect() throws RecognitionException {
        try {
            // InternalTrader.g:104:1: ( ruleConnect EOF )
            // InternalTrader.g:105:1: ruleConnect EOF
            {
             before(grammarAccess.getConnectRule()); 
            pushFollow(FOLLOW_1);
            ruleConnect();

            state._fsp--;

             after(grammarAccess.getConnectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnect"


    // $ANTLR start "ruleConnect"
    // InternalTrader.g:112:1: ruleConnect : ( ( rule__Connect__Group__0 ) ) ;
    public final void ruleConnect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:116:2: ( ( ( rule__Connect__Group__0 ) ) )
            // InternalTrader.g:117:2: ( ( rule__Connect__Group__0 ) )
            {
            // InternalTrader.g:117:2: ( ( rule__Connect__Group__0 ) )
            // InternalTrader.g:118:3: ( rule__Connect__Group__0 )
            {
             before(grammarAccess.getConnectAccess().getGroup()); 
            // InternalTrader.g:119:3: ( rule__Connect__Group__0 )
            // InternalTrader.g:119:4: rule__Connect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnect"


    // $ANTLR start "entryRuleConnectParameters"
    // InternalTrader.g:128:1: entryRuleConnectParameters : ruleConnectParameters EOF ;
    public final void entryRuleConnectParameters() throws RecognitionException {
        try {
            // InternalTrader.g:129:1: ( ruleConnectParameters EOF )
            // InternalTrader.g:130:1: ruleConnectParameters EOF
            {
             before(grammarAccess.getConnectParametersRule()); 
            pushFollow(FOLLOW_1);
            ruleConnectParameters();

            state._fsp--;

             after(grammarAccess.getConnectParametersRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnectParameters"


    // $ANTLR start "ruleConnectParameters"
    // InternalTrader.g:137:1: ruleConnectParameters : ( ( rule__ConnectParameters__Group__0 ) ) ;
    public final void ruleConnectParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:141:2: ( ( ( rule__ConnectParameters__Group__0 ) ) )
            // InternalTrader.g:142:2: ( ( rule__ConnectParameters__Group__0 ) )
            {
            // InternalTrader.g:142:2: ( ( rule__ConnectParameters__Group__0 ) )
            // InternalTrader.g:143:3: ( rule__ConnectParameters__Group__0 )
            {
             before(grammarAccess.getConnectParametersAccess().getGroup()); 
            // InternalTrader.g:144:3: ( rule__ConnectParameters__Group__0 )
            // InternalTrader.g:144:4: rule__ConnectParameters__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectParametersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnectParameters"


    // $ANTLR start "entryRuleTradingBot"
    // InternalTrader.g:153:1: entryRuleTradingBot : ruleTradingBot EOF ;
    public final void entryRuleTradingBot() throws RecognitionException {
        try {
            // InternalTrader.g:154:1: ( ruleTradingBot EOF )
            // InternalTrader.g:155:1: ruleTradingBot EOF
            {
             before(grammarAccess.getTradingBotRule()); 
            pushFollow(FOLLOW_1);
            ruleTradingBot();

            state._fsp--;

             after(grammarAccess.getTradingBotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTradingBot"


    // $ANTLR start "ruleTradingBot"
    // InternalTrader.g:162:1: ruleTradingBot : ( ( rule__TradingBot__Group__0 ) ) ;
    public final void ruleTradingBot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:166:2: ( ( ( rule__TradingBot__Group__0 ) ) )
            // InternalTrader.g:167:2: ( ( rule__TradingBot__Group__0 ) )
            {
            // InternalTrader.g:167:2: ( ( rule__TradingBot__Group__0 ) )
            // InternalTrader.g:168:3: ( rule__TradingBot__Group__0 )
            {
             before(grammarAccess.getTradingBotAccess().getGroup()); 
            // InternalTrader.g:169:3: ( rule__TradingBot__Group__0 )
            // InternalTrader.g:169:4: rule__TradingBot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TradingBot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTradingBotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTradingBot"


    // $ANTLR start "entryRuleExecute"
    // InternalTrader.g:178:1: entryRuleExecute : ruleExecute EOF ;
    public final void entryRuleExecute() throws RecognitionException {
        try {
            // InternalTrader.g:179:1: ( ruleExecute EOF )
            // InternalTrader.g:180:1: ruleExecute EOF
            {
             before(grammarAccess.getExecuteRule()); 
            pushFollow(FOLLOW_1);
            ruleExecute();

            state._fsp--;

             after(grammarAccess.getExecuteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExecute"


    // $ANTLR start "ruleExecute"
    // InternalTrader.g:187:1: ruleExecute : ( ( rule__Execute__Group__0 ) ) ;
    public final void ruleExecute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:191:2: ( ( ( rule__Execute__Group__0 ) ) )
            // InternalTrader.g:192:2: ( ( rule__Execute__Group__0 ) )
            {
            // InternalTrader.g:192:2: ( ( rule__Execute__Group__0 ) )
            // InternalTrader.g:193:3: ( rule__Execute__Group__0 )
            {
             before(grammarAccess.getExecuteAccess().getGroup()); 
            // InternalTrader.g:194:3: ( rule__Execute__Group__0 )
            // InternalTrader.g:194:4: rule__Execute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Execute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExecuteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExecute"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalTrader.g:203:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalTrader.g:204:1: ( ruleVariableDeclaration EOF )
            // InternalTrader.g:205:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalTrader.g:212:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:216:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalTrader.g:217:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalTrader.g:217:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalTrader.g:218:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalTrader.g:219:3: ( rule__VariableDeclaration__Group__0 )
            // InternalTrader.g:219:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleLoopStatement"
    // InternalTrader.g:228:1: entryRuleLoopStatement : ruleLoopStatement EOF ;
    public final void entryRuleLoopStatement() throws RecognitionException {
        try {
            // InternalTrader.g:229:1: ( ruleLoopStatement EOF )
            // InternalTrader.g:230:1: ruleLoopStatement EOF
            {
             before(grammarAccess.getLoopStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleLoopStatement();

            state._fsp--;

             after(grammarAccess.getLoopStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoopStatement"


    // $ANTLR start "ruleLoopStatement"
    // InternalTrader.g:237:1: ruleLoopStatement : ( ( rule__LoopStatement__Group__0 ) ) ;
    public final void ruleLoopStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:241:2: ( ( ( rule__LoopStatement__Group__0 ) ) )
            // InternalTrader.g:242:2: ( ( rule__LoopStatement__Group__0 ) )
            {
            // InternalTrader.g:242:2: ( ( rule__LoopStatement__Group__0 ) )
            // InternalTrader.g:243:3: ( rule__LoopStatement__Group__0 )
            {
             before(grammarAccess.getLoopStatementAccess().getGroup()); 
            // InternalTrader.g:244:3: ( rule__LoopStatement__Group__0 )
            // InternalTrader.g:244:4: rule__LoopStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoopStatement"


    // $ANTLR start "entryRuleREAL"
    // InternalTrader.g:253:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTrader.g:257:1: ( ruleREAL EOF )
            // InternalTrader.g:258:1: ruleREAL EOF
            {
             before(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getREALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalTrader.g:268:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:273:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalTrader.g:274:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalTrader.g:274:2: ( ( rule__REAL__Group__0 ) )
            // InternalTrader.g:275:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalTrader.g:276:3: ( rule__REAL__Group__0 )
            // InternalTrader.g:276:4: rule__REAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleAddition"
    // InternalTrader.g:286:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalTrader.g:287:1: ( ruleAddition EOF )
            // InternalTrader.g:288:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalTrader.g:295:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:299:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalTrader.g:300:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalTrader.g:300:2: ( ( rule__Addition__Group__0 ) )
            // InternalTrader.g:301:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalTrader.g:302:3: ( rule__Addition__Group__0 )
            // InternalTrader.g:302:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalTrader.g:311:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalTrader.g:312:1: ( ruleMultiplication EOF )
            // InternalTrader.g:313:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalTrader.g:320:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:324:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalTrader.g:325:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalTrader.g:325:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalTrader.g:326:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalTrader.g:327:3: ( rule__Multiplication__Group__0 )
            // InternalTrader.g:327:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalTrader.g:336:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalTrader.g:337:1: ( rulePrimary EOF )
            // InternalTrader.g:338:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalTrader.g:345:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:349:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalTrader.g:350:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalTrader.g:350:2: ( ( rule__Primary__Alternatives ) )
            // InternalTrader.g:351:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalTrader.g:352:3: ( rule__Primary__Alternatives )
            // InternalTrader.g:352:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalTrader.g:361:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalTrader.g:362:1: ( ruleIntLiteral EOF )
            // InternalTrader.g:363:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getIntLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalTrader.g:370:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:374:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalTrader.g:375:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalTrader.g:375:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalTrader.g:376:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalTrader.g:377:3: ( rule__IntLiteral__ValAssignment )
            // InternalTrader.g:377:4: rule__IntLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleIntVarExpression"
    // InternalTrader.g:386:1: entryRuleIntVarExpression : ruleIntVarExpression EOF ;
    public final void entryRuleIntVarExpression() throws RecognitionException {
        try {
            // InternalTrader.g:387:1: ( ruleIntVarExpression EOF )
            // InternalTrader.g:388:1: ruleIntVarExpression EOF
            {
             before(grammarAccess.getIntVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleIntVarExpression();

            state._fsp--;

             after(grammarAccess.getIntVarExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntVarExpression"


    // $ANTLR start "ruleIntVarExpression"
    // InternalTrader.g:395:1: ruleIntVarExpression : ( ( rule__IntVarExpression__VarAssignment ) ) ;
    public final void ruleIntVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:399:2: ( ( ( rule__IntVarExpression__VarAssignment ) ) )
            // InternalTrader.g:400:2: ( ( rule__IntVarExpression__VarAssignment ) )
            {
            // InternalTrader.g:400:2: ( ( rule__IntVarExpression__VarAssignment ) )
            // InternalTrader.g:401:3: ( rule__IntVarExpression__VarAssignment )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 
            // InternalTrader.g:402:3: ( rule__IntVarExpression__VarAssignment )
            // InternalTrader.g:402:4: rule__IntVarExpression__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntVarExpression__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntVarExpression"


    // $ANTLR start "entryRuleBuy"
    // InternalTrader.g:411:1: entryRuleBuy : ruleBuy EOF ;
    public final void entryRuleBuy() throws RecognitionException {
        try {
            // InternalTrader.g:412:1: ( ruleBuy EOF )
            // InternalTrader.g:413:1: ruleBuy EOF
            {
             before(grammarAccess.getBuyRule()); 
            pushFollow(FOLLOW_1);
            ruleBuy();

            state._fsp--;

             after(grammarAccess.getBuyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBuy"


    // $ANTLR start "ruleBuy"
    // InternalTrader.g:420:1: ruleBuy : ( ( rule__Buy__Group__0 ) ) ;
    public final void ruleBuy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:424:2: ( ( ( rule__Buy__Group__0 ) ) )
            // InternalTrader.g:425:2: ( ( rule__Buy__Group__0 ) )
            {
            // InternalTrader.g:425:2: ( ( rule__Buy__Group__0 ) )
            // InternalTrader.g:426:3: ( rule__Buy__Group__0 )
            {
             before(grammarAccess.getBuyAccess().getGroup()); 
            // InternalTrader.g:427:3: ( rule__Buy__Group__0 )
            // InternalTrader.g:427:4: rule__Buy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Buy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBuyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuy"


    // $ANTLR start "entryRuleSell"
    // InternalTrader.g:436:1: entryRuleSell : ruleSell EOF ;
    public final void entryRuleSell() throws RecognitionException {
        try {
            // InternalTrader.g:437:1: ( ruleSell EOF )
            // InternalTrader.g:438:1: ruleSell EOF
            {
             before(grammarAccess.getSellRule()); 
            pushFollow(FOLLOW_1);
            ruleSell();

            state._fsp--;

             after(grammarAccess.getSellRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSell"


    // $ANTLR start "ruleSell"
    // InternalTrader.g:445:1: ruleSell : ( ( rule__Sell__Group__0 ) ) ;
    public final void ruleSell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:449:2: ( ( ( rule__Sell__Group__0 ) ) )
            // InternalTrader.g:450:2: ( ( rule__Sell__Group__0 ) )
            {
            // InternalTrader.g:450:2: ( ( rule__Sell__Group__0 ) )
            // InternalTrader.g:451:3: ( rule__Sell__Group__0 )
            {
             before(grammarAccess.getSellAccess().getGroup()); 
            // InternalTrader.g:452:3: ( rule__Sell__Group__0 )
            // InternalTrader.g:452:4: rule__Sell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSell"


    // $ANTLR start "ruleStrategyDef"
    // InternalTrader.g:461:1: ruleStrategyDef : ( ( rule__StrategyDef__Alternatives ) ) ;
    public final void ruleStrategyDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:465:1: ( ( ( rule__StrategyDef__Alternatives ) ) )
            // InternalTrader.g:466:2: ( ( rule__StrategyDef__Alternatives ) )
            {
            // InternalTrader.g:466:2: ( ( rule__StrategyDef__Alternatives ) )
            // InternalTrader.g:467:3: ( rule__StrategyDef__Alternatives )
            {
             before(grammarAccess.getStrategyDefAccess().getAlternatives()); 
            // InternalTrader.g:468:3: ( rule__StrategyDef__Alternatives )
            // InternalTrader.g:468:4: rule__StrategyDef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StrategyDef__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStrategyDefAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStrategyDef"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalTrader.g:476:1: rule__Statement__Alternatives : ( ( ruleConnect ) | ( ruleTradingBot ) | ( ruleExecute ) | ( ruleVariableDeclaration ) | ( ruleLoopStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:480:1: ( ( ruleConnect ) | ( ruleTradingBot ) | ( ruleExecute ) | ( ruleVariableDeclaration ) | ( ruleLoopStatement ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case 31:
                {
                alt2=4;
                }
                break;
            case RULE_INT:
            case RULE_ID:
            case 36:
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
                    // InternalTrader.g:481:2: ( ruleConnect )
                    {
                    // InternalTrader.g:481:2: ( ruleConnect )
                    // InternalTrader.g:482:3: ruleConnect
                    {
                     before(grammarAccess.getStatementAccess().getConnectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConnect();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getConnectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:487:2: ( ruleTradingBot )
                    {
                    // InternalTrader.g:487:2: ( ruleTradingBot )
                    // InternalTrader.g:488:3: ruleTradingBot
                    {
                     before(grammarAccess.getStatementAccess().getTradingBotParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTradingBot();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTradingBotParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTrader.g:493:2: ( ruleExecute )
                    {
                    // InternalTrader.g:493:2: ( ruleExecute )
                    // InternalTrader.g:494:3: ruleExecute
                    {
                     before(grammarAccess.getStatementAccess().getExecuteParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExecute();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getExecuteParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTrader.g:499:2: ( ruleVariableDeclaration )
                    {
                    // InternalTrader.g:499:2: ( ruleVariableDeclaration )
                    // InternalTrader.g:500:3: ruleVariableDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTrader.g:505:2: ( ruleLoopStatement )
                    {
                    // InternalTrader.g:505:2: ( ruleLoopStatement )
                    // InternalTrader.g:506:3: ruleLoopStatement
                    {
                     before(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleLoopStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Addition__OperatorAlternatives_1_1_0"
    // InternalTrader.g:515:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:519:1: ( ( '+' ) | ( '-' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTrader.g:520:2: ( '+' )
                    {
                    // InternalTrader.g:520:2: ( '+' )
                    // InternalTrader.g:521:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:526:2: ( '-' )
                    {
                    // InternalTrader.g:526:2: ( '-' )
                    // InternalTrader.g:527:3: '-'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Multiplication__OperatorAlternatives_1_1_0"
    // InternalTrader.g:536:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:540:1: ( ( '*' ) | ( '/' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTrader.g:541:2: ( '*' )
                    {
                    // InternalTrader.g:541:2: ( '*' )
                    // InternalTrader.g:542:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:547:2: ( '/' )
                    {
                    // InternalTrader.g:547:2: ( '/' )
                    // InternalTrader.g:548:3: '/'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalTrader.g:557:1: rule__Primary__Alternatives : ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:561:1: ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 36:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTrader.g:562:2: ( ruleIntLiteral )
                    {
                    // InternalTrader.g:562:2: ( ruleIntLiteral )
                    // InternalTrader.g:563:3: ruleIntLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:568:2: ( ruleIntVarExpression )
                    {
                    // InternalTrader.g:568:2: ( ruleIntVarExpression )
                    // InternalTrader.g:569:3: ruleIntVarExpression
                    {
                     before(grammarAccess.getPrimaryAccess().getIntVarExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntVarExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIntVarExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTrader.g:574:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalTrader.g:574:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalTrader.g:575:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalTrader.g:576:3: ( rule__Primary__Group_2__0 )
                    // InternalTrader.g:576:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__StrategyDef__Alternatives"
    // InternalTrader.g:584:1: rule__StrategyDef__Alternatives : ( ( ( 'buyAndHold' ) ) | ( ( 'meanReversion' ) ) );
    public final void rule__StrategyDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:588:1: ( ( ( 'buyAndHold' ) ) | ( ( 'meanReversion' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTrader.g:589:2: ( ( 'buyAndHold' ) )
                    {
                    // InternalTrader.g:589:2: ( ( 'buyAndHold' ) )
                    // InternalTrader.g:590:3: ( 'buyAndHold' )
                    {
                     before(grammarAccess.getStrategyDefAccess().getBuyAndHoldEnumLiteralDeclaration_0()); 
                    // InternalTrader.g:591:3: ( 'buyAndHold' )
                    // InternalTrader.g:591:4: 'buyAndHold'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getStrategyDefAccess().getBuyAndHoldEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:595:2: ( ( 'meanReversion' ) )
                    {
                    // InternalTrader.g:595:2: ( ( 'meanReversion' ) )
                    // InternalTrader.g:596:3: ( 'meanReversion' )
                    {
                     before(grammarAccess.getStrategyDefAccess().getMeanReversionEnumLiteralDeclaration_1()); 
                    // InternalTrader.g:597:3: ( 'meanReversion' )
                    // InternalTrader.g:597:4: 'meanReversion'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getStrategyDefAccess().getMeanReversionEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StrategyDef__Alternatives"


    // $ANTLR start "rule__Connect__Group__0"
    // InternalTrader.g:605:1: rule__Connect__Group__0 : rule__Connect__Group__0__Impl rule__Connect__Group__1 ;
    public final void rule__Connect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:609:1: ( rule__Connect__Group__0__Impl rule__Connect__Group__1 )
            // InternalTrader.g:610:2: rule__Connect__Group__0__Impl rule__Connect__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Connect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__0"


    // $ANTLR start "rule__Connect__Group__0__Impl"
    // InternalTrader.g:617:1: rule__Connect__Group__0__Impl : ( 'connect' ) ;
    public final void rule__Connect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:621:1: ( ( 'connect' ) )
            // InternalTrader.g:622:1: ( 'connect' )
            {
            // InternalTrader.g:622:1: ( 'connect' )
            // InternalTrader.g:623:2: 'connect'
            {
             before(grammarAccess.getConnectAccess().getConnectKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConnectAccess().getConnectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__0__Impl"


    // $ANTLR start "rule__Connect__Group__1"
    // InternalTrader.g:632:1: rule__Connect__Group__1 : rule__Connect__Group__1__Impl rule__Connect__Group__2 ;
    public final void rule__Connect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:636:1: ( rule__Connect__Group__1__Impl rule__Connect__Group__2 )
            // InternalTrader.g:637:2: rule__Connect__Group__1__Impl rule__Connect__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Connect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__1"


    // $ANTLR start "rule__Connect__Group__1__Impl"
    // InternalTrader.g:644:1: rule__Connect__Group__1__Impl : ( 'broker' ) ;
    public final void rule__Connect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:648:1: ( ( 'broker' ) )
            // InternalTrader.g:649:1: ( 'broker' )
            {
            // InternalTrader.g:649:1: ( 'broker' )
            // InternalTrader.g:650:2: 'broker'
            {
             before(grammarAccess.getConnectAccess().getBrokerKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConnectAccess().getBrokerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__1__Impl"


    // $ANTLR start "rule__Connect__Group__2"
    // InternalTrader.g:659:1: rule__Connect__Group__2 : rule__Connect__Group__2__Impl rule__Connect__Group__3 ;
    public final void rule__Connect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:663:1: ( rule__Connect__Group__2__Impl rule__Connect__Group__3 )
            // InternalTrader.g:664:2: rule__Connect__Group__2__Impl rule__Connect__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Connect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connect__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__2"


    // $ANTLR start "rule__Connect__Group__2__Impl"
    // InternalTrader.g:671:1: rule__Connect__Group__2__Impl : ( ( rule__Connect__BrokerNameAssignment_2 ) ) ;
    public final void rule__Connect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:675:1: ( ( ( rule__Connect__BrokerNameAssignment_2 ) ) )
            // InternalTrader.g:676:1: ( ( rule__Connect__BrokerNameAssignment_2 ) )
            {
            // InternalTrader.g:676:1: ( ( rule__Connect__BrokerNameAssignment_2 ) )
            // InternalTrader.g:677:2: ( rule__Connect__BrokerNameAssignment_2 )
            {
             before(grammarAccess.getConnectAccess().getBrokerNameAssignment_2()); 
            // InternalTrader.g:678:2: ( rule__Connect__BrokerNameAssignment_2 )
            // InternalTrader.g:678:3: rule__Connect__BrokerNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Connect__BrokerNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectAccess().getBrokerNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__2__Impl"


    // $ANTLR start "rule__Connect__Group__3"
    // InternalTrader.g:686:1: rule__Connect__Group__3 : rule__Connect__Group__3__Impl ;
    public final void rule__Connect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:690:1: ( rule__Connect__Group__3__Impl )
            // InternalTrader.g:691:2: rule__Connect__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connect__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__3"


    // $ANTLR start "rule__Connect__Group__3__Impl"
    // InternalTrader.g:697:1: rule__Connect__Group__3__Impl : ( ( rule__Connect__Group_3__0 )? ) ;
    public final void rule__Connect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:701:1: ( ( ( rule__Connect__Group_3__0 )? ) )
            // InternalTrader.g:702:1: ( ( rule__Connect__Group_3__0 )? )
            {
            // InternalTrader.g:702:1: ( ( rule__Connect__Group_3__0 )? )
            // InternalTrader.g:703:2: ( rule__Connect__Group_3__0 )?
            {
             before(grammarAccess.getConnectAccess().getGroup_3()); 
            // InternalTrader.g:704:2: ( rule__Connect__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTrader.g:704:3: rule__Connect__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connect__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__3__Impl"


    // $ANTLR start "rule__Connect__Group_3__0"
    // InternalTrader.g:713:1: rule__Connect__Group_3__0 : rule__Connect__Group_3__0__Impl rule__Connect__Group_3__1 ;
    public final void rule__Connect__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:717:1: ( rule__Connect__Group_3__0__Impl rule__Connect__Group_3__1 )
            // InternalTrader.g:718:2: rule__Connect__Group_3__0__Impl rule__Connect__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Connect__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connect__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group_3__0"


    // $ANTLR start "rule__Connect__Group_3__0__Impl"
    // InternalTrader.g:725:1: rule__Connect__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Connect__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:729:1: ( ( ',' ) )
            // InternalTrader.g:730:1: ( ',' )
            {
            // InternalTrader.g:730:1: ( ',' )
            // InternalTrader.g:731:2: ','
            {
             before(grammarAccess.getConnectAccess().getCommaKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConnectAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group_3__0__Impl"


    // $ANTLR start "rule__Connect__Group_3__1"
    // InternalTrader.g:740:1: rule__Connect__Group_3__1 : rule__Connect__Group_3__1__Impl ;
    public final void rule__Connect__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:744:1: ( rule__Connect__Group_3__1__Impl )
            // InternalTrader.g:745:2: rule__Connect__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connect__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group_3__1"


    // $ANTLR start "rule__Connect__Group_3__1__Impl"
    // InternalTrader.g:751:1: rule__Connect__Group_3__1__Impl : ( ( rule__Connect__ParametersAssignment_3_1 ) ) ;
    public final void rule__Connect__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:755:1: ( ( ( rule__Connect__ParametersAssignment_3_1 ) ) )
            // InternalTrader.g:756:1: ( ( rule__Connect__ParametersAssignment_3_1 ) )
            {
            // InternalTrader.g:756:1: ( ( rule__Connect__ParametersAssignment_3_1 ) )
            // InternalTrader.g:757:2: ( rule__Connect__ParametersAssignment_3_1 )
            {
             before(grammarAccess.getConnectAccess().getParametersAssignment_3_1()); 
            // InternalTrader.g:758:2: ( rule__Connect__ParametersAssignment_3_1 )
            // InternalTrader.g:758:3: rule__Connect__ParametersAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Connect__ParametersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectAccess().getParametersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group_3__1__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__0"
    // InternalTrader.g:767:1: rule__ConnectParameters__Group__0 : rule__ConnectParameters__Group__0__Impl rule__ConnectParameters__Group__1 ;
    public final void rule__ConnectParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:771:1: ( rule__ConnectParameters__Group__0__Impl rule__ConnectParameters__Group__1 )
            // InternalTrader.g:772:2: rule__ConnectParameters__Group__0__Impl rule__ConnectParameters__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ConnectParameters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__0"


    // $ANTLR start "rule__ConnectParameters__Group__0__Impl"
    // InternalTrader.g:779:1: rule__ConnectParameters__Group__0__Impl : ( 'username' ) ;
    public final void rule__ConnectParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:783:1: ( ( 'username' ) )
            // InternalTrader.g:784:1: ( 'username' )
            {
            // InternalTrader.g:784:1: ( 'username' )
            // InternalTrader.g:785:2: 'username'
            {
             before(grammarAccess.getConnectParametersAccess().getUsernameKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getUsernameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__0__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__1"
    // InternalTrader.g:794:1: rule__ConnectParameters__Group__1 : rule__ConnectParameters__Group__1__Impl rule__ConnectParameters__Group__2 ;
    public final void rule__ConnectParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:798:1: ( rule__ConnectParameters__Group__1__Impl rule__ConnectParameters__Group__2 )
            // InternalTrader.g:799:2: rule__ConnectParameters__Group__1__Impl rule__ConnectParameters__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ConnectParameters__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__1"


    // $ANTLR start "rule__ConnectParameters__Group__1__Impl"
    // InternalTrader.g:806:1: rule__ConnectParameters__Group__1__Impl : ( '=' ) ;
    public final void rule__ConnectParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:810:1: ( ( '=' ) )
            // InternalTrader.g:811:1: ( '=' )
            {
            // InternalTrader.g:811:1: ( '=' )
            // InternalTrader.g:812:2: '='
            {
             before(grammarAccess.getConnectParametersAccess().getEqualsSignKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__1__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__2"
    // InternalTrader.g:821:1: rule__ConnectParameters__Group__2 : rule__ConnectParameters__Group__2__Impl rule__ConnectParameters__Group__3 ;
    public final void rule__ConnectParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:825:1: ( rule__ConnectParameters__Group__2__Impl rule__ConnectParameters__Group__3 )
            // InternalTrader.g:826:2: rule__ConnectParameters__Group__2__Impl rule__ConnectParameters__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ConnectParameters__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__2"


    // $ANTLR start "rule__ConnectParameters__Group__2__Impl"
    // InternalTrader.g:833:1: rule__ConnectParameters__Group__2__Impl : ( ( rule__ConnectParameters__UsernameAssignment_2 ) ) ;
    public final void rule__ConnectParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:837:1: ( ( ( rule__ConnectParameters__UsernameAssignment_2 ) ) )
            // InternalTrader.g:838:1: ( ( rule__ConnectParameters__UsernameAssignment_2 ) )
            {
            // InternalTrader.g:838:1: ( ( rule__ConnectParameters__UsernameAssignment_2 ) )
            // InternalTrader.g:839:2: ( rule__ConnectParameters__UsernameAssignment_2 )
            {
             before(grammarAccess.getConnectParametersAccess().getUsernameAssignment_2()); 
            // InternalTrader.g:840:2: ( rule__ConnectParameters__UsernameAssignment_2 )
            // InternalTrader.g:840:3: rule__ConnectParameters__UsernameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConnectParameters__UsernameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectParametersAccess().getUsernameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__2__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__3"
    // InternalTrader.g:848:1: rule__ConnectParameters__Group__3 : rule__ConnectParameters__Group__3__Impl rule__ConnectParameters__Group__4 ;
    public final void rule__ConnectParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:852:1: ( rule__ConnectParameters__Group__3__Impl rule__ConnectParameters__Group__4 )
            // InternalTrader.g:853:2: rule__ConnectParameters__Group__3__Impl rule__ConnectParameters__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ConnectParameters__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__3"


    // $ANTLR start "rule__ConnectParameters__Group__3__Impl"
    // InternalTrader.g:860:1: rule__ConnectParameters__Group__3__Impl : ( ',' ) ;
    public final void rule__ConnectParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:864:1: ( ( ',' ) )
            // InternalTrader.g:865:1: ( ',' )
            {
            // InternalTrader.g:865:1: ( ',' )
            // InternalTrader.g:866:2: ','
            {
             before(grammarAccess.getConnectParametersAccess().getCommaKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__3__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__4"
    // InternalTrader.g:875:1: rule__ConnectParameters__Group__4 : rule__ConnectParameters__Group__4__Impl rule__ConnectParameters__Group__5 ;
    public final void rule__ConnectParameters__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:879:1: ( rule__ConnectParameters__Group__4__Impl rule__ConnectParameters__Group__5 )
            // InternalTrader.g:880:2: rule__ConnectParameters__Group__4__Impl rule__ConnectParameters__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__ConnectParameters__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__4"


    // $ANTLR start "rule__ConnectParameters__Group__4__Impl"
    // InternalTrader.g:887:1: rule__ConnectParameters__Group__4__Impl : ( 'password' ) ;
    public final void rule__ConnectParameters__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:891:1: ( ( 'password' ) )
            // InternalTrader.g:892:1: ( 'password' )
            {
            // InternalTrader.g:892:1: ( 'password' )
            // InternalTrader.g:893:2: 'password'
            {
             before(grammarAccess.getConnectParametersAccess().getPasswordKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getPasswordKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__4__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__5"
    // InternalTrader.g:902:1: rule__ConnectParameters__Group__5 : rule__ConnectParameters__Group__5__Impl rule__ConnectParameters__Group__6 ;
    public final void rule__ConnectParameters__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:906:1: ( rule__ConnectParameters__Group__5__Impl rule__ConnectParameters__Group__6 )
            // InternalTrader.g:907:2: rule__ConnectParameters__Group__5__Impl rule__ConnectParameters__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__ConnectParameters__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__5"


    // $ANTLR start "rule__ConnectParameters__Group__5__Impl"
    // InternalTrader.g:914:1: rule__ConnectParameters__Group__5__Impl : ( '=' ) ;
    public final void rule__ConnectParameters__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:918:1: ( ( '=' ) )
            // InternalTrader.g:919:1: ( '=' )
            {
            // InternalTrader.g:919:1: ( '=' )
            // InternalTrader.g:920:2: '='
            {
             before(grammarAccess.getConnectParametersAccess().getEqualsSignKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__5__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__6"
    // InternalTrader.g:929:1: rule__ConnectParameters__Group__6 : rule__ConnectParameters__Group__6__Impl rule__ConnectParameters__Group__7 ;
    public final void rule__ConnectParameters__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:933:1: ( rule__ConnectParameters__Group__6__Impl rule__ConnectParameters__Group__7 )
            // InternalTrader.g:934:2: rule__ConnectParameters__Group__6__Impl rule__ConnectParameters__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__ConnectParameters__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__6"


    // $ANTLR start "rule__ConnectParameters__Group__6__Impl"
    // InternalTrader.g:941:1: rule__ConnectParameters__Group__6__Impl : ( ( rule__ConnectParameters__PasswordAssignment_6 ) ) ;
    public final void rule__ConnectParameters__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:945:1: ( ( ( rule__ConnectParameters__PasswordAssignment_6 ) ) )
            // InternalTrader.g:946:1: ( ( rule__ConnectParameters__PasswordAssignment_6 ) )
            {
            // InternalTrader.g:946:1: ( ( rule__ConnectParameters__PasswordAssignment_6 ) )
            // InternalTrader.g:947:2: ( rule__ConnectParameters__PasswordAssignment_6 )
            {
             before(grammarAccess.getConnectParametersAccess().getPasswordAssignment_6()); 
            // InternalTrader.g:948:2: ( rule__ConnectParameters__PasswordAssignment_6 )
            // InternalTrader.g:948:3: rule__ConnectParameters__PasswordAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ConnectParameters__PasswordAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConnectParametersAccess().getPasswordAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__6__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__7"
    // InternalTrader.g:956:1: rule__ConnectParameters__Group__7 : rule__ConnectParameters__Group__7__Impl rule__ConnectParameters__Group__8 ;
    public final void rule__ConnectParameters__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:960:1: ( rule__ConnectParameters__Group__7__Impl rule__ConnectParameters__Group__8 )
            // InternalTrader.g:961:2: rule__ConnectParameters__Group__7__Impl rule__ConnectParameters__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__ConnectParameters__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__7"


    // $ANTLR start "rule__ConnectParameters__Group__7__Impl"
    // InternalTrader.g:968:1: rule__ConnectParameters__Group__7__Impl : ( ',' ) ;
    public final void rule__ConnectParameters__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:972:1: ( ( ',' ) )
            // InternalTrader.g:973:1: ( ',' )
            {
            // InternalTrader.g:973:1: ( ',' )
            // InternalTrader.g:974:2: ','
            {
             before(grammarAccess.getConnectParametersAccess().getCommaKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__7__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__8"
    // InternalTrader.g:983:1: rule__ConnectParameters__Group__8 : rule__ConnectParameters__Group__8__Impl rule__ConnectParameters__Group__9 ;
    public final void rule__ConnectParameters__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:987:1: ( rule__ConnectParameters__Group__8__Impl rule__ConnectParameters__Group__9 )
            // InternalTrader.g:988:2: rule__ConnectParameters__Group__8__Impl rule__ConnectParameters__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__ConnectParameters__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__8"


    // $ANTLR start "rule__ConnectParameters__Group__8__Impl"
    // InternalTrader.g:995:1: rule__ConnectParameters__Group__8__Impl : ( 'leverage' ) ;
    public final void rule__ConnectParameters__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:999:1: ( ( 'leverage' ) )
            // InternalTrader.g:1000:1: ( 'leverage' )
            {
            // InternalTrader.g:1000:1: ( 'leverage' )
            // InternalTrader.g:1001:2: 'leverage'
            {
             before(grammarAccess.getConnectParametersAccess().getLeverageKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getLeverageKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__8__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__9"
    // InternalTrader.g:1010:1: rule__ConnectParameters__Group__9 : rule__ConnectParameters__Group__9__Impl rule__ConnectParameters__Group__10 ;
    public final void rule__ConnectParameters__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1014:1: ( rule__ConnectParameters__Group__9__Impl rule__ConnectParameters__Group__10 )
            // InternalTrader.g:1015:2: rule__ConnectParameters__Group__9__Impl rule__ConnectParameters__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__ConnectParameters__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__9"


    // $ANTLR start "rule__ConnectParameters__Group__9__Impl"
    // InternalTrader.g:1022:1: rule__ConnectParameters__Group__9__Impl : ( '=' ) ;
    public final void rule__ConnectParameters__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1026:1: ( ( '=' ) )
            // InternalTrader.g:1027:1: ( '=' )
            {
            // InternalTrader.g:1027:1: ( '=' )
            // InternalTrader.g:1028:2: '='
            {
             before(grammarAccess.getConnectParametersAccess().getEqualsSignKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getEqualsSignKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__9__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__10"
    // InternalTrader.g:1037:1: rule__ConnectParameters__Group__10 : rule__ConnectParameters__Group__10__Impl rule__ConnectParameters__Group__11 ;
    public final void rule__ConnectParameters__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1041:1: ( rule__ConnectParameters__Group__10__Impl rule__ConnectParameters__Group__11 )
            // InternalTrader.g:1042:2: rule__ConnectParameters__Group__10__Impl rule__ConnectParameters__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__ConnectParameters__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__10"


    // $ANTLR start "rule__ConnectParameters__Group__10__Impl"
    // InternalTrader.g:1049:1: rule__ConnectParameters__Group__10__Impl : ( ( rule__ConnectParameters__LeverageAssignment_10 ) ) ;
    public final void rule__ConnectParameters__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1053:1: ( ( ( rule__ConnectParameters__LeverageAssignment_10 ) ) )
            // InternalTrader.g:1054:1: ( ( rule__ConnectParameters__LeverageAssignment_10 ) )
            {
            // InternalTrader.g:1054:1: ( ( rule__ConnectParameters__LeverageAssignment_10 ) )
            // InternalTrader.g:1055:2: ( rule__ConnectParameters__LeverageAssignment_10 )
            {
             before(grammarAccess.getConnectParametersAccess().getLeverageAssignment_10()); 
            // InternalTrader.g:1056:2: ( rule__ConnectParameters__LeverageAssignment_10 )
            // InternalTrader.g:1056:3: rule__ConnectParameters__LeverageAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__ConnectParameters__LeverageAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getConnectParametersAccess().getLeverageAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__10__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__11"
    // InternalTrader.g:1064:1: rule__ConnectParameters__Group__11 : rule__ConnectParameters__Group__11__Impl rule__ConnectParameters__Group__12 ;
    public final void rule__ConnectParameters__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1068:1: ( rule__ConnectParameters__Group__11__Impl rule__ConnectParameters__Group__12 )
            // InternalTrader.g:1069:2: rule__ConnectParameters__Group__11__Impl rule__ConnectParameters__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__ConnectParameters__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__11"


    // $ANTLR start "rule__ConnectParameters__Group__11__Impl"
    // InternalTrader.g:1076:1: rule__ConnectParameters__Group__11__Impl : ( ',' ) ;
    public final void rule__ConnectParameters__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1080:1: ( ( ',' ) )
            // InternalTrader.g:1081:1: ( ',' )
            {
            // InternalTrader.g:1081:1: ( ',' )
            // InternalTrader.g:1082:2: ','
            {
             before(grammarAccess.getConnectParametersAccess().getCommaKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getCommaKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__11__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__12"
    // InternalTrader.g:1091:1: rule__ConnectParameters__Group__12 : rule__ConnectParameters__Group__12__Impl rule__ConnectParameters__Group__13 ;
    public final void rule__ConnectParameters__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1095:1: ( rule__ConnectParameters__Group__12__Impl rule__ConnectParameters__Group__13 )
            // InternalTrader.g:1096:2: rule__ConnectParameters__Group__12__Impl rule__ConnectParameters__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__ConnectParameters__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__12"


    // $ANTLR start "rule__ConnectParameters__Group__12__Impl"
    // InternalTrader.g:1103:1: rule__ConnectParameters__Group__12__Impl : ( 'money' ) ;
    public final void rule__ConnectParameters__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1107:1: ( ( 'money' ) )
            // InternalTrader.g:1108:1: ( 'money' )
            {
            // InternalTrader.g:1108:1: ( 'money' )
            // InternalTrader.g:1109:2: 'money'
            {
             before(grammarAccess.getConnectParametersAccess().getMoneyKeyword_12()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getMoneyKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__12__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__13"
    // InternalTrader.g:1118:1: rule__ConnectParameters__Group__13 : rule__ConnectParameters__Group__13__Impl rule__ConnectParameters__Group__14 ;
    public final void rule__ConnectParameters__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1122:1: ( rule__ConnectParameters__Group__13__Impl rule__ConnectParameters__Group__14 )
            // InternalTrader.g:1123:2: rule__ConnectParameters__Group__13__Impl rule__ConnectParameters__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__ConnectParameters__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__13"


    // $ANTLR start "rule__ConnectParameters__Group__13__Impl"
    // InternalTrader.g:1130:1: rule__ConnectParameters__Group__13__Impl : ( '=' ) ;
    public final void rule__ConnectParameters__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1134:1: ( ( '=' ) )
            // InternalTrader.g:1135:1: ( '=' )
            {
            // InternalTrader.g:1135:1: ( '=' )
            // InternalTrader.g:1136:2: '='
            {
             before(grammarAccess.getConnectParametersAccess().getEqualsSignKeyword_13()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getEqualsSignKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__13__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__14"
    // InternalTrader.g:1145:1: rule__ConnectParameters__Group__14 : rule__ConnectParameters__Group__14__Impl rule__ConnectParameters__Group__15 ;
    public final void rule__ConnectParameters__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1149:1: ( rule__ConnectParameters__Group__14__Impl rule__ConnectParameters__Group__15 )
            // InternalTrader.g:1150:2: rule__ConnectParameters__Group__14__Impl rule__ConnectParameters__Group__15
            {
            pushFollow(FOLLOW_6);
            rule__ConnectParameters__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__14"


    // $ANTLR start "rule__ConnectParameters__Group__14__Impl"
    // InternalTrader.g:1157:1: rule__ConnectParameters__Group__14__Impl : ( ( rule__ConnectParameters__MoneyAssignment_14 ) ) ;
    public final void rule__ConnectParameters__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1161:1: ( ( ( rule__ConnectParameters__MoneyAssignment_14 ) ) )
            // InternalTrader.g:1162:1: ( ( rule__ConnectParameters__MoneyAssignment_14 ) )
            {
            // InternalTrader.g:1162:1: ( ( rule__ConnectParameters__MoneyAssignment_14 ) )
            // InternalTrader.g:1163:2: ( rule__ConnectParameters__MoneyAssignment_14 )
            {
             before(grammarAccess.getConnectParametersAccess().getMoneyAssignment_14()); 
            // InternalTrader.g:1164:2: ( rule__ConnectParameters__MoneyAssignment_14 )
            // InternalTrader.g:1164:3: rule__ConnectParameters__MoneyAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__ConnectParameters__MoneyAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getConnectParametersAccess().getMoneyAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__14__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__15"
    // InternalTrader.g:1172:1: rule__ConnectParameters__Group__15 : rule__ConnectParameters__Group__15__Impl rule__ConnectParameters__Group__16 ;
    public final void rule__ConnectParameters__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1176:1: ( rule__ConnectParameters__Group__15__Impl rule__ConnectParameters__Group__16 )
            // InternalTrader.g:1177:2: rule__ConnectParameters__Group__15__Impl rule__ConnectParameters__Group__16
            {
            pushFollow(FOLLOW_14);
            rule__ConnectParameters__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__15"


    // $ANTLR start "rule__ConnectParameters__Group__15__Impl"
    // InternalTrader.g:1184:1: rule__ConnectParameters__Group__15__Impl : ( ',' ) ;
    public final void rule__ConnectParameters__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1188:1: ( ( ',' ) )
            // InternalTrader.g:1189:1: ( ',' )
            {
            // InternalTrader.g:1189:1: ( ',' )
            // InternalTrader.g:1190:2: ','
            {
             before(grammarAccess.getConnectParametersAccess().getCommaKeyword_15()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getCommaKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__15__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__16"
    // InternalTrader.g:1199:1: rule__ConnectParameters__Group__16 : rule__ConnectParameters__Group__16__Impl rule__ConnectParameters__Group__17 ;
    public final void rule__ConnectParameters__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1203:1: ( rule__ConnectParameters__Group__16__Impl rule__ConnectParameters__Group__17 )
            // InternalTrader.g:1204:2: rule__ConnectParameters__Group__16__Impl rule__ConnectParameters__Group__17
            {
            pushFollow(FOLLOW_8);
            rule__ConnectParameters__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__16"


    // $ANTLR start "rule__ConnectParameters__Group__16__Impl"
    // InternalTrader.g:1211:1: rule__ConnectParameters__Group__16__Impl : ( 'timeframe' ) ;
    public final void rule__ConnectParameters__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1215:1: ( ( 'timeframe' ) )
            // InternalTrader.g:1216:1: ( 'timeframe' )
            {
            // InternalTrader.g:1216:1: ( 'timeframe' )
            // InternalTrader.g:1217:2: 'timeframe'
            {
             before(grammarAccess.getConnectParametersAccess().getTimeframeKeyword_16()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getTimeframeKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__16__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__17"
    // InternalTrader.g:1226:1: rule__ConnectParameters__Group__17 : rule__ConnectParameters__Group__17__Impl rule__ConnectParameters__Group__18 ;
    public final void rule__ConnectParameters__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1230:1: ( rule__ConnectParameters__Group__17__Impl rule__ConnectParameters__Group__18 )
            // InternalTrader.g:1231:2: rule__ConnectParameters__Group__17__Impl rule__ConnectParameters__Group__18
            {
            pushFollow(FOLLOW_9);
            rule__ConnectParameters__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__17"


    // $ANTLR start "rule__ConnectParameters__Group__17__Impl"
    // InternalTrader.g:1238:1: rule__ConnectParameters__Group__17__Impl : ( '=' ) ;
    public final void rule__ConnectParameters__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1242:1: ( ( '=' ) )
            // InternalTrader.g:1243:1: ( '=' )
            {
            // InternalTrader.g:1243:1: ( '=' )
            // InternalTrader.g:1244:2: '='
            {
             before(grammarAccess.getConnectParametersAccess().getEqualsSignKeyword_17()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getEqualsSignKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__17__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__18"
    // InternalTrader.g:1253:1: rule__ConnectParameters__Group__18 : rule__ConnectParameters__Group__18__Impl ;
    public final void rule__ConnectParameters__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1257:1: ( rule__ConnectParameters__Group__18__Impl )
            // InternalTrader.g:1258:2: rule__ConnectParameters__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__18"


    // $ANTLR start "rule__ConnectParameters__Group__18__Impl"
    // InternalTrader.g:1264:1: rule__ConnectParameters__Group__18__Impl : ( ( rule__ConnectParameters__TimeframeAssignment_18 ) ) ;
    public final void rule__ConnectParameters__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1268:1: ( ( ( rule__ConnectParameters__TimeframeAssignment_18 ) ) )
            // InternalTrader.g:1269:1: ( ( rule__ConnectParameters__TimeframeAssignment_18 ) )
            {
            // InternalTrader.g:1269:1: ( ( rule__ConnectParameters__TimeframeAssignment_18 ) )
            // InternalTrader.g:1270:2: ( rule__ConnectParameters__TimeframeAssignment_18 )
            {
             before(grammarAccess.getConnectParametersAccess().getTimeframeAssignment_18()); 
            // InternalTrader.g:1271:2: ( rule__ConnectParameters__TimeframeAssignment_18 )
            // InternalTrader.g:1271:3: rule__ConnectParameters__TimeframeAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__ConnectParameters__TimeframeAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getConnectParametersAccess().getTimeframeAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__Group__18__Impl"


    // $ANTLR start "rule__TradingBot__Group__0"
    // InternalTrader.g:1280:1: rule__TradingBot__Group__0 : rule__TradingBot__Group__0__Impl rule__TradingBot__Group__1 ;
    public final void rule__TradingBot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1284:1: ( rule__TradingBot__Group__0__Impl rule__TradingBot__Group__1 )
            // InternalTrader.g:1285:2: rule__TradingBot__Group__0__Impl rule__TradingBot__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__TradingBot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TradingBot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__Group__0"


    // $ANTLR start "rule__TradingBot__Group__0__Impl"
    // InternalTrader.g:1292:1: rule__TradingBot__Group__0__Impl : ( 'tradingBot' ) ;
    public final void rule__TradingBot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1296:1: ( ( 'tradingBot' ) )
            // InternalTrader.g:1297:1: ( 'tradingBot' )
            {
            // InternalTrader.g:1297:1: ( 'tradingBot' )
            // InternalTrader.g:1298:2: 'tradingBot'
            {
             before(grammarAccess.getTradingBotAccess().getTradingBotKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getTradingBotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__Group__0__Impl"


    // $ANTLR start "rule__TradingBot__Group__1"
    // InternalTrader.g:1307:1: rule__TradingBot__Group__1 : rule__TradingBot__Group__1__Impl rule__TradingBot__Group__2 ;
    public final void rule__TradingBot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1311:1: ( rule__TradingBot__Group__1__Impl rule__TradingBot__Group__2 )
            // InternalTrader.g:1312:2: rule__TradingBot__Group__1__Impl rule__TradingBot__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__TradingBot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TradingBot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__Group__1"


    // $ANTLR start "rule__TradingBot__Group__1__Impl"
    // InternalTrader.g:1319:1: rule__TradingBot__Group__1__Impl : ( 'strategy' ) ;
    public final void rule__TradingBot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1323:1: ( ( 'strategy' ) )
            // InternalTrader.g:1324:1: ( 'strategy' )
            {
            // InternalTrader.g:1324:1: ( 'strategy' )
            // InternalTrader.g:1325:2: 'strategy'
            {
             before(grammarAccess.getTradingBotAccess().getStrategyKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getStrategyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__Group__1__Impl"


    // $ANTLR start "rule__TradingBot__Group__2"
    // InternalTrader.g:1334:1: rule__TradingBot__Group__2 : rule__TradingBot__Group__2__Impl rule__TradingBot__Group__3 ;
    public final void rule__TradingBot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1338:1: ( rule__TradingBot__Group__2__Impl rule__TradingBot__Group__3 )
            // InternalTrader.g:1339:2: rule__TradingBot__Group__2__Impl rule__TradingBot__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__TradingBot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TradingBot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__Group__2"


    // $ANTLR start "rule__TradingBot__Group__2__Impl"
    // InternalTrader.g:1346:1: rule__TradingBot__Group__2__Impl : ( '=' ) ;
    public final void rule__TradingBot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1350:1: ( ( '=' ) )
            // InternalTrader.g:1351:1: ( '=' )
            {
            // InternalTrader.g:1351:1: ( '=' )
            // InternalTrader.g:1352:2: '='
            {
             before(grammarAccess.getTradingBotAccess().getEqualsSignKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__Group__2__Impl"


    // $ANTLR start "rule__TradingBot__Group__3"
    // InternalTrader.g:1361:1: rule__TradingBot__Group__3 : rule__TradingBot__Group__3__Impl rule__TradingBot__Group__4 ;
    public final void rule__TradingBot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1365:1: ( rule__TradingBot__Group__3__Impl rule__TradingBot__Group__4 )
            // InternalTrader.g:1366:2: rule__TradingBot__Group__3__Impl rule__TradingBot__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__TradingBot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TradingBot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__Group__3"


    // $ANTLR start "rule__TradingBot__Group__3__Impl"
    // InternalTrader.g:1373:1: rule__TradingBot__Group__3__Impl : ( ( rule__TradingBot__StrategyAssignment_3 ) ) ;
    public final void rule__TradingBot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1377:1: ( ( ( rule__TradingBot__StrategyAssignment_3 ) ) )
            // InternalTrader.g:1378:1: ( ( rule__TradingBot__StrategyAssignment_3 ) )
            {
            // InternalTrader.g:1378:1: ( ( rule__TradingBot__StrategyAssignment_3 ) )
            // InternalTrader.g:1379:2: ( rule__TradingBot__StrategyAssignment_3 )
            {
             before(grammarAccess.getTradingBotAccess().getStrategyAssignment_3()); 
            // InternalTrader.g:1380:2: ( rule__TradingBot__StrategyAssignment_3 )
            // InternalTrader.g:1380:3: rule__TradingBot__StrategyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TradingBot__StrategyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTradingBotAccess().getStrategyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__Group__3__Impl"


    // $ANTLR start "rule__TradingBot__Group__4"
    // InternalTrader.g:1388:1: rule__TradingBot__Group__4 : rule__TradingBot__Group__4__Impl rule__TradingBot__Group__5 ;
    public final void rule__TradingBot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1392:1: ( rule__TradingBot__Group__4__Impl rule__TradingBot__Group__5 )
            // InternalTrader.g:1393:2: rule__TradingBot__Group__4__Impl rule__TradingBot__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__TradingBot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TradingBot__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__Group__4"


    // $ANTLR start "rule__TradingBot__Group__4__Impl"
    // InternalTrader.g:1400:1: rule__TradingBot__Group__4__Impl : ( ',' ) ;
    public final void rule__TradingBot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1404:1: ( ( ',' ) )
            // InternalTrader.g:1405:1: ( ',' )
            {
            // InternalTrader.g:1405:1: ( ',' )
            // InternalTrader.g:1406:2: ','
            {
             before(grammarAccess.getTradingBotAccess().getCommaKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__Group__4__Impl"


    // $ANTLR start "rule__TradingBot__Group__5"
    // InternalTrader.g:1415:1: rule__TradingBot__Group__5 : rule__TradingBot__Group__5__Impl rule__TradingBot__Group__6 ;
    public final void rule__TradingBot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1419:1: ( rule__TradingBot__Group__5__Impl rule__TradingBot__Group__6 )
            // InternalTrader.g:1420:2: rule__TradingBot__Group__5__Impl rule__TradingBot__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__TradingBot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TradingBot__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__Group__5"


    // $ANTLR start "rule__TradingBot__Group__5__Impl"
    // InternalTrader.g:1427:1: rule__TradingBot__Group__5__Impl : ( 'funds' ) ;
    public final void rule__TradingBot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1431:1: ( ( 'funds' ) )
            // InternalTrader.g:1432:1: ( 'funds' )
            {
            // InternalTrader.g:1432:1: ( 'funds' )
            // InternalTrader.g:1433:2: 'funds'
            {
             before(grammarAccess.getTradingBotAccess().getFundsKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getFundsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__Group__5__Impl"


    // $ANTLR start "rule__TradingBot__Group__6"
    // InternalTrader.g:1442:1: rule__TradingBot__Group__6 : rule__TradingBot__Group__6__Impl rule__TradingBot__Group__7 ;
    public final void rule__TradingBot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1446:1: ( rule__TradingBot__Group__6__Impl rule__TradingBot__Group__7 )
            // InternalTrader.g:1447:2: rule__TradingBot__Group__6__Impl rule__TradingBot__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__TradingBot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TradingBot__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__Group__6"


    // $ANTLR start "rule__TradingBot__Group__6__Impl"
    // InternalTrader.g:1454:1: rule__TradingBot__Group__6__Impl : ( '=' ) ;
    public final void rule__TradingBot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1458:1: ( ( '=' ) )
            // InternalTrader.g:1459:1: ( '=' )
            {
            // InternalTrader.g:1459:1: ( '=' )
            // InternalTrader.g:1460:2: '='
            {
             before(grammarAccess.getTradingBotAccess().getEqualsSignKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__Group__6__Impl"


    // $ANTLR start "rule__TradingBot__Group__7"
    // InternalTrader.g:1469:1: rule__TradingBot__Group__7 : rule__TradingBot__Group__7__Impl ;
    public final void rule__TradingBot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1473:1: ( rule__TradingBot__Group__7__Impl )
            // InternalTrader.g:1474:2: rule__TradingBot__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TradingBot__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__Group__7"


    // $ANTLR start "rule__TradingBot__Group__7__Impl"
    // InternalTrader.g:1480:1: rule__TradingBot__Group__7__Impl : ( ( rule__TradingBot__FundsAssignment_7 ) ) ;
    public final void rule__TradingBot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1484:1: ( ( ( rule__TradingBot__FundsAssignment_7 ) ) )
            // InternalTrader.g:1485:1: ( ( rule__TradingBot__FundsAssignment_7 ) )
            {
            // InternalTrader.g:1485:1: ( ( rule__TradingBot__FundsAssignment_7 ) )
            // InternalTrader.g:1486:2: ( rule__TradingBot__FundsAssignment_7 )
            {
             before(grammarAccess.getTradingBotAccess().getFundsAssignment_7()); 
            // InternalTrader.g:1487:2: ( rule__TradingBot__FundsAssignment_7 )
            // InternalTrader.g:1487:3: rule__TradingBot__FundsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__TradingBot__FundsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTradingBotAccess().getFundsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__Group__7__Impl"


    // $ANTLR start "rule__Execute__Group__0"
    // InternalTrader.g:1496:1: rule__Execute__Group__0 : rule__Execute__Group__0__Impl rule__Execute__Group__1 ;
    public final void rule__Execute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1500:1: ( rule__Execute__Group__0__Impl rule__Execute__Group__1 )
            // InternalTrader.g:1501:2: rule__Execute__Group__0__Impl rule__Execute__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Execute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Execute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__Group__0"


    // $ANTLR start "rule__Execute__Group__0__Impl"
    // InternalTrader.g:1508:1: rule__Execute__Group__0__Impl : ( 'execute' ) ;
    public final void rule__Execute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1512:1: ( ( 'execute' ) )
            // InternalTrader.g:1513:1: ( 'execute' )
            {
            // InternalTrader.g:1513:1: ( 'execute' )
            // InternalTrader.g:1514:2: 'execute'
            {
             before(grammarAccess.getExecuteAccess().getExecuteKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExecuteAccess().getExecuteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__Group__0__Impl"


    // $ANTLR start "rule__Execute__Group__1"
    // InternalTrader.g:1523:1: rule__Execute__Group__1 : rule__Execute__Group__1__Impl rule__Execute__Group__2 ;
    public final void rule__Execute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1527:1: ( rule__Execute__Group__1__Impl rule__Execute__Group__2 )
            // InternalTrader.g:1528:2: rule__Execute__Group__1__Impl rule__Execute__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Execute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Execute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__Group__1"


    // $ANTLR start "rule__Execute__Group__1__Impl"
    // InternalTrader.g:1535:1: rule__Execute__Group__1__Impl : ( 'bots' ) ;
    public final void rule__Execute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1539:1: ( ( 'bots' ) )
            // InternalTrader.g:1540:1: ( 'bots' )
            {
            // InternalTrader.g:1540:1: ( 'bots' )
            // InternalTrader.g:1541:2: 'bots'
            {
             before(grammarAccess.getExecuteAccess().getBotsKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getExecuteAccess().getBotsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__Group__1__Impl"


    // $ANTLR start "rule__Execute__Group__2"
    // InternalTrader.g:1550:1: rule__Execute__Group__2 : rule__Execute__Group__2__Impl rule__Execute__Group__3 ;
    public final void rule__Execute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1554:1: ( rule__Execute__Group__2__Impl rule__Execute__Group__3 )
            // InternalTrader.g:1555:2: rule__Execute__Group__2__Impl rule__Execute__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Execute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Execute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__Group__2"


    // $ANTLR start "rule__Execute__Group__2__Impl"
    // InternalTrader.g:1562:1: rule__Execute__Group__2__Impl : ( ( rule__Execute__BotsAssignment_2 ) ) ;
    public final void rule__Execute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1566:1: ( ( ( rule__Execute__BotsAssignment_2 ) ) )
            // InternalTrader.g:1567:1: ( ( rule__Execute__BotsAssignment_2 ) )
            {
            // InternalTrader.g:1567:1: ( ( rule__Execute__BotsAssignment_2 ) )
            // InternalTrader.g:1568:2: ( rule__Execute__BotsAssignment_2 )
            {
             before(grammarAccess.getExecuteAccess().getBotsAssignment_2()); 
            // InternalTrader.g:1569:2: ( rule__Execute__BotsAssignment_2 )
            // InternalTrader.g:1569:3: rule__Execute__BotsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Execute__BotsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExecuteAccess().getBotsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__Group__2__Impl"


    // $ANTLR start "rule__Execute__Group__3"
    // InternalTrader.g:1577:1: rule__Execute__Group__3 : rule__Execute__Group__3__Impl ;
    public final void rule__Execute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1581:1: ( rule__Execute__Group__3__Impl )
            // InternalTrader.g:1582:2: rule__Execute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Execute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__Group__3"


    // $ANTLR start "rule__Execute__Group__3__Impl"
    // InternalTrader.g:1588:1: rule__Execute__Group__3__Impl : ( ( rule__Execute__Group_3__0 )* ) ;
    public final void rule__Execute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1592:1: ( ( ( rule__Execute__Group_3__0 )* ) )
            // InternalTrader.g:1593:1: ( ( rule__Execute__Group_3__0 )* )
            {
            // InternalTrader.g:1593:1: ( ( rule__Execute__Group_3__0 )* )
            // InternalTrader.g:1594:2: ( rule__Execute__Group_3__0 )*
            {
             before(grammarAccess.getExecuteAccess().getGroup_3()); 
            // InternalTrader.g:1595:2: ( rule__Execute__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTrader.g:1595:3: rule__Execute__Group_3__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Execute__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getExecuteAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__Group__3__Impl"


    // $ANTLR start "rule__Execute__Group_3__0"
    // InternalTrader.g:1604:1: rule__Execute__Group_3__0 : rule__Execute__Group_3__0__Impl rule__Execute__Group_3__1 ;
    public final void rule__Execute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1608:1: ( rule__Execute__Group_3__0__Impl rule__Execute__Group_3__1 )
            // InternalTrader.g:1609:2: rule__Execute__Group_3__0__Impl rule__Execute__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Execute__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Execute__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__Group_3__0"


    // $ANTLR start "rule__Execute__Group_3__0__Impl"
    // InternalTrader.g:1616:1: rule__Execute__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Execute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1620:1: ( ( ',' ) )
            // InternalTrader.g:1621:1: ( ',' )
            {
            // InternalTrader.g:1621:1: ( ',' )
            // InternalTrader.g:1622:2: ','
            {
             before(grammarAccess.getExecuteAccess().getCommaKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExecuteAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__Group_3__0__Impl"


    // $ANTLR start "rule__Execute__Group_3__1"
    // InternalTrader.g:1631:1: rule__Execute__Group_3__1 : rule__Execute__Group_3__1__Impl ;
    public final void rule__Execute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1635:1: ( rule__Execute__Group_3__1__Impl )
            // InternalTrader.g:1636:2: rule__Execute__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Execute__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__Group_3__1"


    // $ANTLR start "rule__Execute__Group_3__1__Impl"
    // InternalTrader.g:1642:1: rule__Execute__Group_3__1__Impl : ( ( rule__Execute__BotsAssignment_3_1 ) ) ;
    public final void rule__Execute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1646:1: ( ( ( rule__Execute__BotsAssignment_3_1 ) ) )
            // InternalTrader.g:1647:1: ( ( rule__Execute__BotsAssignment_3_1 ) )
            {
            // InternalTrader.g:1647:1: ( ( rule__Execute__BotsAssignment_3_1 ) )
            // InternalTrader.g:1648:2: ( rule__Execute__BotsAssignment_3_1 )
            {
             before(grammarAccess.getExecuteAccess().getBotsAssignment_3_1()); 
            // InternalTrader.g:1649:2: ( rule__Execute__BotsAssignment_3_1 )
            // InternalTrader.g:1649:3: rule__Execute__BotsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Execute__BotsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExecuteAccess().getBotsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__Group_3__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalTrader.g:1658:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1662:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalTrader.g:1663:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalTrader.g:1670:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1674:1: ( ( 'var' ) )
            // InternalTrader.g:1675:1: ( 'var' )
            {
            // InternalTrader.g:1675:1: ( 'var' )
            // InternalTrader.g:1676:2: 'var'
            {
             before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalTrader.g:1685:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1689:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalTrader.g:1690:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalTrader.g:1697:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1701:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalTrader.g:1702:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalTrader.g:1702:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalTrader.g:1703:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalTrader.g:1704:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalTrader.g:1704:3: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // InternalTrader.g:1712:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1716:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalTrader.g:1717:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // InternalTrader.g:1724:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1728:1: ( ( '=' ) )
            // InternalTrader.g:1729:1: ( '=' )
            {
            // InternalTrader.g:1729:1: ( '=' )
            // InternalTrader.g:1730:2: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // InternalTrader.g:1739:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1743:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalTrader.g:1744:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // InternalTrader.g:1750:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1754:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) )
            // InternalTrader.g:1755:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            {
            // InternalTrader.g:1755:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            // InternalTrader.g:1756:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
            // InternalTrader.g:1757:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            // InternalTrader.g:1757:3: rule__VariableDeclaration__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__LoopStatement__Group__0"
    // InternalTrader.g:1766:1: rule__LoopStatement__Group__0 : rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 ;
    public final void rule__LoopStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1770:1: ( rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 )
            // InternalTrader.g:1771:2: rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__LoopStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__0"


    // $ANTLR start "rule__LoopStatement__Group__0__Impl"
    // InternalTrader.g:1778:1: rule__LoopStatement__Group__0__Impl : ( ( rule__LoopStatement__CountAssignment_0 ) ) ;
    public final void rule__LoopStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1782:1: ( ( ( rule__LoopStatement__CountAssignment_0 ) ) )
            // InternalTrader.g:1783:1: ( ( rule__LoopStatement__CountAssignment_0 ) )
            {
            // InternalTrader.g:1783:1: ( ( rule__LoopStatement__CountAssignment_0 ) )
            // InternalTrader.g:1784:2: ( rule__LoopStatement__CountAssignment_0 )
            {
             before(grammarAccess.getLoopStatementAccess().getCountAssignment_0()); 
            // InternalTrader.g:1785:2: ( rule__LoopStatement__CountAssignment_0 )
            // InternalTrader.g:1785:3: rule__LoopStatement__CountAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LoopStatement__CountAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLoopStatementAccess().getCountAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__0__Impl"


    // $ANTLR start "rule__LoopStatement__Group__1"
    // InternalTrader.g:1793:1: rule__LoopStatement__Group__1 : rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2 ;
    public final void rule__LoopStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1797:1: ( rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2 )
            // InternalTrader.g:1798:2: rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__LoopStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__1"


    // $ANTLR start "rule__LoopStatement__Group__1__Impl"
    // InternalTrader.g:1805:1: rule__LoopStatement__Group__1__Impl : ( 'times' ) ;
    public final void rule__LoopStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1809:1: ( ( 'times' ) )
            // InternalTrader.g:1810:1: ( 'times' )
            {
            // InternalTrader.g:1810:1: ( 'times' )
            // InternalTrader.g:1811:2: 'times'
            {
             before(grammarAccess.getLoopStatementAccess().getTimesKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLoopStatementAccess().getTimesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__1__Impl"


    // $ANTLR start "rule__LoopStatement__Group__2"
    // InternalTrader.g:1820:1: rule__LoopStatement__Group__2 : rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3 ;
    public final void rule__LoopStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1824:1: ( rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3 )
            // InternalTrader.g:1825:2: rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__LoopStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__2"


    // $ANTLR start "rule__LoopStatement__Group__2__Impl"
    // InternalTrader.g:1832:1: rule__LoopStatement__Group__2__Impl : ( 'do' ) ;
    public final void rule__LoopStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1836:1: ( ( 'do' ) )
            // InternalTrader.g:1837:1: ( 'do' )
            {
            // InternalTrader.g:1837:1: ( 'do' )
            // InternalTrader.g:1838:2: 'do'
            {
             before(grammarAccess.getLoopStatementAccess().getDoKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLoopStatementAccess().getDoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__2__Impl"


    // $ANTLR start "rule__LoopStatement__Group__3"
    // InternalTrader.g:1847:1: rule__LoopStatement__Group__3 : rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4 ;
    public final void rule__LoopStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1851:1: ( rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4 )
            // InternalTrader.g:1852:2: rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__LoopStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__3"


    // $ANTLR start "rule__LoopStatement__Group__3__Impl"
    // InternalTrader.g:1859:1: rule__LoopStatement__Group__3__Impl : ( ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* ) ) ;
    public final void rule__LoopStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1863:1: ( ( ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* ) ) )
            // InternalTrader.g:1864:1: ( ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* ) )
            {
            // InternalTrader.g:1864:1: ( ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* ) )
            // InternalTrader.g:1865:2: ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* )
            {
            // InternalTrader.g:1865:2: ( ( rule__LoopStatement__StatementsAssignment_3 ) )
            // InternalTrader.g:1866:3: ( rule__LoopStatement__StatementsAssignment_3 )
            {
             before(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3()); 
            // InternalTrader.g:1867:3: ( rule__LoopStatement__StatementsAssignment_3 )
            // InternalTrader.g:1867:4: rule__LoopStatement__StatementsAssignment_3
            {
            pushFollow(FOLLOW_3);
            rule__LoopStatement__StatementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3()); 

            }

            // InternalTrader.g:1870:2: ( ( rule__LoopStatement__StatementsAssignment_3 )* )
            // InternalTrader.g:1871:3: ( rule__LoopStatement__StatementsAssignment_3 )*
            {
             before(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3()); 
            // InternalTrader.g:1872:3: ( rule__LoopStatement__StatementsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_ID)||LA9_0==17||LA9_0==26||LA9_0==29||LA9_0==31||LA9_0==36) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTrader.g:1872:4: rule__LoopStatement__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__LoopStatement__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__3__Impl"


    // $ANTLR start "rule__LoopStatement__Group__4"
    // InternalTrader.g:1881:1: rule__LoopStatement__Group__4 : rule__LoopStatement__Group__4__Impl ;
    public final void rule__LoopStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1885:1: ( rule__LoopStatement__Group__4__Impl )
            // InternalTrader.g:1886:2: rule__LoopStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__4"


    // $ANTLR start "rule__LoopStatement__Group__4__Impl"
    // InternalTrader.g:1892:1: rule__LoopStatement__Group__4__Impl : ( 'end' ) ;
    public final void rule__LoopStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1896:1: ( ( 'end' ) )
            // InternalTrader.g:1897:1: ( 'end' )
            {
            // InternalTrader.g:1897:1: ( 'end' )
            // InternalTrader.g:1898:2: 'end'
            {
             before(grammarAccess.getLoopStatementAccess().getEndKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLoopStatementAccess().getEndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__4__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalTrader.g:1908:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1912:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalTrader.g:1913:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__REAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0"


    // $ANTLR start "rule__REAL__Group__0__Impl"
    // InternalTrader.g:1920:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1924:1: ( ( ( RULE_INT )? ) )
            // InternalTrader.g:1925:1: ( ( RULE_INT )? )
            {
            // InternalTrader.g:1925:1: ( ( RULE_INT )? )
            // InternalTrader.g:1926:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalTrader.g:1927:2: ( RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTrader.g:1927:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0__Impl"


    // $ANTLR start "rule__REAL__Group__1"
    // InternalTrader.g:1935:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1939:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalTrader.g:1940:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__REAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1"


    // $ANTLR start "rule__REAL__Group__1__Impl"
    // InternalTrader.g:1947:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1951:1: ( ( '.' ) )
            // InternalTrader.g:1952:1: ( '.' )
            {
            // InternalTrader.g:1952:1: ( '.' )
            // InternalTrader.g:1953:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1__Impl"


    // $ANTLR start "rule__REAL__Group__2"
    // InternalTrader.g:1962:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1966:1: ( rule__REAL__Group__2__Impl )
            // InternalTrader.g:1967:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2"


    // $ANTLR start "rule__REAL__Group__2__Impl"
    // InternalTrader.g:1973:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1977:1: ( ( RULE_INT ) )
            // InternalTrader.g:1978:1: ( RULE_INT )
            {
            // InternalTrader.g:1978:1: ( RULE_INT )
            // InternalTrader.g:1979:2: RULE_INT
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalTrader.g:1989:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1993:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalTrader.g:1994:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalTrader.g:2001:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2005:1: ( ( ruleMultiplication ) )
            // InternalTrader.g:2006:1: ( ruleMultiplication )
            {
            // InternalTrader.g:2006:1: ( ruleMultiplication )
            // InternalTrader.g:2007:2: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalTrader.g:2016:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2020:1: ( rule__Addition__Group__1__Impl )
            // InternalTrader.g:2021:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalTrader.g:2027:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2031:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalTrader.g:2032:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalTrader.g:2032:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalTrader.g:2033:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalTrader.g:2034:2: ( rule__Addition__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=11 && LA11_0<=12)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTrader.g:2034:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalTrader.g:2043:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2047:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalTrader.g:2048:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalTrader.g:2055:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2059:1: ( ( () ) )
            // InternalTrader.g:2060:1: ( () )
            {
            // InternalTrader.g:2060:1: ( () )
            // InternalTrader.g:2061:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalTrader.g:2062:2: ()
            // InternalTrader.g:2062:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalTrader.g:2070:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2074:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalTrader.g:2075:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalTrader.g:2082:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2086:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalTrader.g:2087:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalTrader.g:2087:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalTrader.g:2088:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalTrader.g:2089:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalTrader.g:2089:3: rule__Addition__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // InternalTrader.g:2097:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2101:1: ( rule__Addition__Group_1__2__Impl )
            // InternalTrader.g:2102:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // InternalTrader.g:2108:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2112:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalTrader.g:2113:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalTrader.g:2113:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalTrader.g:2114:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalTrader.g:2115:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalTrader.g:2115:3: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalTrader.g:2124:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2128:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalTrader.g:2129:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalTrader.g:2136:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2140:1: ( ( rulePrimary ) )
            // InternalTrader.g:2141:1: ( rulePrimary )
            {
            // InternalTrader.g:2141:1: ( rulePrimary )
            // InternalTrader.g:2142:2: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalTrader.g:2151:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2155:1: ( rule__Multiplication__Group__1__Impl )
            // InternalTrader.g:2156:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalTrader.g:2162:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2166:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalTrader.g:2167:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalTrader.g:2167:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalTrader.g:2168:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalTrader.g:2169:2: ( rule__Multiplication__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=13 && LA12_0<=14)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTrader.g:2169:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalTrader.g:2178:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2182:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalTrader.g:2183:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalTrader.g:2190:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2194:1: ( ( () ) )
            // InternalTrader.g:2195:1: ( () )
            {
            // InternalTrader.g:2195:1: ( () )
            // InternalTrader.g:2196:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalTrader.g:2197:2: ()
            // InternalTrader.g:2197:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalTrader.g:2205:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2209:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalTrader.g:2210:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalTrader.g:2217:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2221:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalTrader.g:2222:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalTrader.g:2222:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalTrader.g:2223:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalTrader.g:2224:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalTrader.g:2224:3: rule__Multiplication__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // InternalTrader.g:2232:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2236:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalTrader.g:2237:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // InternalTrader.g:2243:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2247:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalTrader.g:2248:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalTrader.g:2248:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalTrader.g:2249:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalTrader.g:2250:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalTrader.g:2250:3: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalTrader.g:2259:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2263:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalTrader.g:2264:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalTrader.g:2271:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2275:1: ( ( '(' ) )
            // InternalTrader.g:2276:1: ( '(' )
            {
            // InternalTrader.g:2276:1: ( '(' )
            // InternalTrader.g:2277:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalTrader.g:2286:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2290:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalTrader.g:2291:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_29);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalTrader.g:2298:1: rule__Primary__Group_2__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2302:1: ( ( ruleAddition ) )
            // InternalTrader.g:2303:1: ( ruleAddition )
            {
            // InternalTrader.g:2303:1: ( ruleAddition )
            // InternalTrader.g:2304:2: ruleAddition
            {
             before(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalTrader.g:2313:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2317:1: ( rule__Primary__Group_2__2__Impl )
            // InternalTrader.g:2318:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalTrader.g:2324:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2328:1: ( ( ')' ) )
            // InternalTrader.g:2329:1: ( ')' )
            {
            // InternalTrader.g:2329:1: ( ')' )
            // InternalTrader.g:2330:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__Buy__Group__0"
    // InternalTrader.g:2340:1: rule__Buy__Group__0 : rule__Buy__Group__0__Impl rule__Buy__Group__1 ;
    public final void rule__Buy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2344:1: ( rule__Buy__Group__0__Impl rule__Buy__Group__1 )
            // InternalTrader.g:2345:2: rule__Buy__Group__0__Impl rule__Buy__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Buy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Buy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buy__Group__0"


    // $ANTLR start "rule__Buy__Group__0__Impl"
    // InternalTrader.g:2352:1: rule__Buy__Group__0__Impl : ( 'buy' ) ;
    public final void rule__Buy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2356:1: ( ( 'buy' ) )
            // InternalTrader.g:2357:1: ( 'buy' )
            {
            // InternalTrader.g:2357:1: ( 'buy' )
            // InternalTrader.g:2358:2: 'buy'
            {
             before(grammarAccess.getBuyAccess().getBuyKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBuyAccess().getBuyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buy__Group__0__Impl"


    // $ANTLR start "rule__Buy__Group__1"
    // InternalTrader.g:2367:1: rule__Buy__Group__1 : rule__Buy__Group__1__Impl rule__Buy__Group__2 ;
    public final void rule__Buy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2371:1: ( rule__Buy__Group__1__Impl rule__Buy__Group__2 )
            // InternalTrader.g:2372:2: rule__Buy__Group__1__Impl rule__Buy__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Buy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Buy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buy__Group__1"


    // $ANTLR start "rule__Buy__Group__1__Impl"
    // InternalTrader.g:2379:1: rule__Buy__Group__1__Impl : ( ( rule__Buy__QuantityAssignment_1 ) ) ;
    public final void rule__Buy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2383:1: ( ( ( rule__Buy__QuantityAssignment_1 ) ) )
            // InternalTrader.g:2384:1: ( ( rule__Buy__QuantityAssignment_1 ) )
            {
            // InternalTrader.g:2384:1: ( ( rule__Buy__QuantityAssignment_1 ) )
            // InternalTrader.g:2385:2: ( rule__Buy__QuantityAssignment_1 )
            {
             before(grammarAccess.getBuyAccess().getQuantityAssignment_1()); 
            // InternalTrader.g:2386:2: ( rule__Buy__QuantityAssignment_1 )
            // InternalTrader.g:2386:3: rule__Buy__QuantityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Buy__QuantityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBuyAccess().getQuantityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buy__Group__1__Impl"


    // $ANTLR start "rule__Buy__Group__2"
    // InternalTrader.g:2394:1: rule__Buy__Group__2 : rule__Buy__Group__2__Impl rule__Buy__Group__3 ;
    public final void rule__Buy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2398:1: ( rule__Buy__Group__2__Impl rule__Buy__Group__3 )
            // InternalTrader.g:2399:2: rule__Buy__Group__2__Impl rule__Buy__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Buy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Buy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buy__Group__2"


    // $ANTLR start "rule__Buy__Group__2__Impl"
    // InternalTrader.g:2406:1: rule__Buy__Group__2__Impl : ( ( rule__Buy__TickerAssignment_2 ) ) ;
    public final void rule__Buy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2410:1: ( ( ( rule__Buy__TickerAssignment_2 ) ) )
            // InternalTrader.g:2411:1: ( ( rule__Buy__TickerAssignment_2 ) )
            {
            // InternalTrader.g:2411:1: ( ( rule__Buy__TickerAssignment_2 ) )
            // InternalTrader.g:2412:2: ( rule__Buy__TickerAssignment_2 )
            {
             before(grammarAccess.getBuyAccess().getTickerAssignment_2()); 
            // InternalTrader.g:2413:2: ( rule__Buy__TickerAssignment_2 )
            // InternalTrader.g:2413:3: rule__Buy__TickerAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Buy__TickerAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBuyAccess().getTickerAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buy__Group__2__Impl"


    // $ANTLR start "rule__Buy__Group__3"
    // InternalTrader.g:2421:1: rule__Buy__Group__3 : rule__Buy__Group__3__Impl rule__Buy__Group__4 ;
    public final void rule__Buy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2425:1: ( rule__Buy__Group__3__Impl rule__Buy__Group__4 )
            // InternalTrader.g:2426:2: rule__Buy__Group__3__Impl rule__Buy__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Buy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Buy__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buy__Group__3"


    // $ANTLR start "rule__Buy__Group__3__Impl"
    // InternalTrader.g:2433:1: rule__Buy__Group__3__Impl : ( 'at' ) ;
    public final void rule__Buy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2437:1: ( ( 'at' ) )
            // InternalTrader.g:2438:1: ( 'at' )
            {
            // InternalTrader.g:2438:1: ( 'at' )
            // InternalTrader.g:2439:2: 'at'
            {
             before(grammarAccess.getBuyAccess().getAtKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBuyAccess().getAtKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buy__Group__3__Impl"


    // $ANTLR start "rule__Buy__Group__4"
    // InternalTrader.g:2448:1: rule__Buy__Group__4 : rule__Buy__Group__4__Impl rule__Buy__Group__5 ;
    public final void rule__Buy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2452:1: ( rule__Buy__Group__4__Impl rule__Buy__Group__5 )
            // InternalTrader.g:2453:2: rule__Buy__Group__4__Impl rule__Buy__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Buy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Buy__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buy__Group__4"


    // $ANTLR start "rule__Buy__Group__4__Impl"
    // InternalTrader.g:2460:1: rule__Buy__Group__4__Impl : ( 'price' ) ;
    public final void rule__Buy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2464:1: ( ( 'price' ) )
            // InternalTrader.g:2465:1: ( 'price' )
            {
            // InternalTrader.g:2465:1: ( 'price' )
            // InternalTrader.g:2466:2: 'price'
            {
             before(grammarAccess.getBuyAccess().getPriceKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBuyAccess().getPriceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buy__Group__4__Impl"


    // $ANTLR start "rule__Buy__Group__5"
    // InternalTrader.g:2475:1: rule__Buy__Group__5 : rule__Buy__Group__5__Impl ;
    public final void rule__Buy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2479:1: ( rule__Buy__Group__5__Impl )
            // InternalTrader.g:2480:2: rule__Buy__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Buy__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buy__Group__5"


    // $ANTLR start "rule__Buy__Group__5__Impl"
    // InternalTrader.g:2486:1: rule__Buy__Group__5__Impl : ( ( rule__Buy__PriceAssignment_5 ) ) ;
    public final void rule__Buy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2490:1: ( ( ( rule__Buy__PriceAssignment_5 ) ) )
            // InternalTrader.g:2491:1: ( ( rule__Buy__PriceAssignment_5 ) )
            {
            // InternalTrader.g:2491:1: ( ( rule__Buy__PriceAssignment_5 ) )
            // InternalTrader.g:2492:2: ( rule__Buy__PriceAssignment_5 )
            {
             before(grammarAccess.getBuyAccess().getPriceAssignment_5()); 
            // InternalTrader.g:2493:2: ( rule__Buy__PriceAssignment_5 )
            // InternalTrader.g:2493:3: rule__Buy__PriceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Buy__PriceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBuyAccess().getPriceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buy__Group__5__Impl"


    // $ANTLR start "rule__Sell__Group__0"
    // InternalTrader.g:2502:1: rule__Sell__Group__0 : rule__Sell__Group__0__Impl rule__Sell__Group__1 ;
    public final void rule__Sell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2506:1: ( rule__Sell__Group__0__Impl rule__Sell__Group__1 )
            // InternalTrader.g:2507:2: rule__Sell__Group__0__Impl rule__Sell__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Sell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sell__Group__0"


    // $ANTLR start "rule__Sell__Group__0__Impl"
    // InternalTrader.g:2514:1: rule__Sell__Group__0__Impl : ( 'sell' ) ;
    public final void rule__Sell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2518:1: ( ( 'sell' ) )
            // InternalTrader.g:2519:1: ( 'sell' )
            {
            // InternalTrader.g:2519:1: ( 'sell' )
            // InternalTrader.g:2520:2: 'sell'
            {
             before(grammarAccess.getSellAccess().getSellKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSellAccess().getSellKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sell__Group__0__Impl"


    // $ANTLR start "rule__Sell__Group__1"
    // InternalTrader.g:2529:1: rule__Sell__Group__1 : rule__Sell__Group__1__Impl rule__Sell__Group__2 ;
    public final void rule__Sell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2533:1: ( rule__Sell__Group__1__Impl rule__Sell__Group__2 )
            // InternalTrader.g:2534:2: rule__Sell__Group__1__Impl rule__Sell__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Sell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sell__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sell__Group__1"


    // $ANTLR start "rule__Sell__Group__1__Impl"
    // InternalTrader.g:2541:1: rule__Sell__Group__1__Impl : ( ( rule__Sell__QuantityAssignment_1 ) ) ;
    public final void rule__Sell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2545:1: ( ( ( rule__Sell__QuantityAssignment_1 ) ) )
            // InternalTrader.g:2546:1: ( ( rule__Sell__QuantityAssignment_1 ) )
            {
            // InternalTrader.g:2546:1: ( ( rule__Sell__QuantityAssignment_1 ) )
            // InternalTrader.g:2547:2: ( rule__Sell__QuantityAssignment_1 )
            {
             before(grammarAccess.getSellAccess().getQuantityAssignment_1()); 
            // InternalTrader.g:2548:2: ( rule__Sell__QuantityAssignment_1 )
            // InternalTrader.g:2548:3: rule__Sell__QuantityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sell__QuantityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSellAccess().getQuantityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sell__Group__1__Impl"


    // $ANTLR start "rule__Sell__Group__2"
    // InternalTrader.g:2556:1: rule__Sell__Group__2 : rule__Sell__Group__2__Impl rule__Sell__Group__3 ;
    public final void rule__Sell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2560:1: ( rule__Sell__Group__2__Impl rule__Sell__Group__3 )
            // InternalTrader.g:2561:2: rule__Sell__Group__2__Impl rule__Sell__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Sell__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sell__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sell__Group__2"


    // $ANTLR start "rule__Sell__Group__2__Impl"
    // InternalTrader.g:2568:1: rule__Sell__Group__2__Impl : ( ( rule__Sell__TickerAssignment_2 ) ) ;
    public final void rule__Sell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2572:1: ( ( ( rule__Sell__TickerAssignment_2 ) ) )
            // InternalTrader.g:2573:1: ( ( rule__Sell__TickerAssignment_2 ) )
            {
            // InternalTrader.g:2573:1: ( ( rule__Sell__TickerAssignment_2 ) )
            // InternalTrader.g:2574:2: ( rule__Sell__TickerAssignment_2 )
            {
             before(grammarAccess.getSellAccess().getTickerAssignment_2()); 
            // InternalTrader.g:2575:2: ( rule__Sell__TickerAssignment_2 )
            // InternalTrader.g:2575:3: rule__Sell__TickerAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sell__TickerAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSellAccess().getTickerAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sell__Group__2__Impl"


    // $ANTLR start "rule__Sell__Group__3"
    // InternalTrader.g:2583:1: rule__Sell__Group__3 : rule__Sell__Group__3__Impl rule__Sell__Group__4 ;
    public final void rule__Sell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2587:1: ( rule__Sell__Group__3__Impl rule__Sell__Group__4 )
            // InternalTrader.g:2588:2: rule__Sell__Group__3__Impl rule__Sell__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Sell__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sell__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sell__Group__3"


    // $ANTLR start "rule__Sell__Group__3__Impl"
    // InternalTrader.g:2595:1: rule__Sell__Group__3__Impl : ( 'at' ) ;
    public final void rule__Sell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2599:1: ( ( 'at' ) )
            // InternalTrader.g:2600:1: ( 'at' )
            {
            // InternalTrader.g:2600:1: ( 'at' )
            // InternalTrader.g:2601:2: 'at'
            {
             before(grammarAccess.getSellAccess().getAtKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSellAccess().getAtKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sell__Group__3__Impl"


    // $ANTLR start "rule__Sell__Group__4"
    // InternalTrader.g:2610:1: rule__Sell__Group__4 : rule__Sell__Group__4__Impl rule__Sell__Group__5 ;
    public final void rule__Sell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2614:1: ( rule__Sell__Group__4__Impl rule__Sell__Group__5 )
            // InternalTrader.g:2615:2: rule__Sell__Group__4__Impl rule__Sell__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Sell__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sell__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sell__Group__4"


    // $ANTLR start "rule__Sell__Group__4__Impl"
    // InternalTrader.g:2622:1: rule__Sell__Group__4__Impl : ( 'price' ) ;
    public final void rule__Sell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2626:1: ( ( 'price' ) )
            // InternalTrader.g:2627:1: ( 'price' )
            {
            // InternalTrader.g:2627:1: ( 'price' )
            // InternalTrader.g:2628:2: 'price'
            {
             before(grammarAccess.getSellAccess().getPriceKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSellAccess().getPriceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sell__Group__4__Impl"


    // $ANTLR start "rule__Sell__Group__5"
    // InternalTrader.g:2637:1: rule__Sell__Group__5 : rule__Sell__Group__5__Impl ;
    public final void rule__Sell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2641:1: ( rule__Sell__Group__5__Impl )
            // InternalTrader.g:2642:2: rule__Sell__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sell__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sell__Group__5"


    // $ANTLR start "rule__Sell__Group__5__Impl"
    // InternalTrader.g:2648:1: rule__Sell__Group__5__Impl : ( ( rule__Sell__PriceAssignment_5 ) ) ;
    public final void rule__Sell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2652:1: ( ( ( rule__Sell__PriceAssignment_5 ) ) )
            // InternalTrader.g:2653:1: ( ( rule__Sell__PriceAssignment_5 ) )
            {
            // InternalTrader.g:2653:1: ( ( rule__Sell__PriceAssignment_5 ) )
            // InternalTrader.g:2654:2: ( rule__Sell__PriceAssignment_5 )
            {
             before(grammarAccess.getSellAccess().getPriceAssignment_5()); 
            // InternalTrader.g:2655:2: ( rule__Sell__PriceAssignment_5 )
            // InternalTrader.g:2655:3: rule__Sell__PriceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Sell__PriceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSellAccess().getPriceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sell__Group__5__Impl"


    // $ANTLR start "rule__TraderProgram__StatementsAssignment"
    // InternalTrader.g:2664:1: rule__TraderProgram__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__TraderProgram__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2668:1: ( ( ruleStatement ) )
            // InternalTrader.g:2669:2: ( ruleStatement )
            {
            // InternalTrader.g:2669:2: ( ruleStatement )
            // InternalTrader.g:2670:3: ruleStatement
            {
             before(grammarAccess.getTraderProgramAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getTraderProgramAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraderProgram__StatementsAssignment"


    // $ANTLR start "rule__Connect__BrokerNameAssignment_2"
    // InternalTrader.g:2679:1: rule__Connect__BrokerNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Connect__BrokerNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2683:1: ( ( RULE_ID ) )
            // InternalTrader.g:2684:2: ( RULE_ID )
            {
            // InternalTrader.g:2684:2: ( RULE_ID )
            // InternalTrader.g:2685:3: RULE_ID
            {
             before(grammarAccess.getConnectAccess().getBrokerNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectAccess().getBrokerNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__BrokerNameAssignment_2"


    // $ANTLR start "rule__Connect__ParametersAssignment_3_1"
    // InternalTrader.g:2694:1: rule__Connect__ParametersAssignment_3_1 : ( ruleConnectParameters ) ;
    public final void rule__Connect__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2698:1: ( ( ruleConnectParameters ) )
            // InternalTrader.g:2699:2: ( ruleConnectParameters )
            {
            // InternalTrader.g:2699:2: ( ruleConnectParameters )
            // InternalTrader.g:2700:3: ruleConnectParameters
            {
             before(grammarAccess.getConnectAccess().getParametersConnectParametersParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConnectParameters();

            state._fsp--;

             after(grammarAccess.getConnectAccess().getParametersConnectParametersParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__ParametersAssignment_3_1"


    // $ANTLR start "rule__ConnectParameters__UsernameAssignment_2"
    // InternalTrader.g:2709:1: rule__ConnectParameters__UsernameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ConnectParameters__UsernameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2713:1: ( ( RULE_STRING ) )
            // InternalTrader.g:2714:2: ( RULE_STRING )
            {
            // InternalTrader.g:2714:2: ( RULE_STRING )
            // InternalTrader.g:2715:3: RULE_STRING
            {
             before(grammarAccess.getConnectParametersAccess().getUsernameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getUsernameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__UsernameAssignment_2"


    // $ANTLR start "rule__ConnectParameters__PasswordAssignment_6"
    // InternalTrader.g:2724:1: rule__ConnectParameters__PasswordAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ConnectParameters__PasswordAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2728:1: ( ( RULE_STRING ) )
            // InternalTrader.g:2729:2: ( RULE_STRING )
            {
            // InternalTrader.g:2729:2: ( RULE_STRING )
            // InternalTrader.g:2730:3: RULE_STRING
            {
             before(grammarAccess.getConnectParametersAccess().getPasswordSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getPasswordSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__PasswordAssignment_6"


    // $ANTLR start "rule__ConnectParameters__LeverageAssignment_10"
    // InternalTrader.g:2739:1: rule__ConnectParameters__LeverageAssignment_10 : ( ruleREAL ) ;
    public final void rule__ConnectParameters__LeverageAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2743:1: ( ( ruleREAL ) )
            // InternalTrader.g:2744:2: ( ruleREAL )
            {
            // InternalTrader.g:2744:2: ( ruleREAL )
            // InternalTrader.g:2745:3: ruleREAL
            {
             before(grammarAccess.getConnectParametersAccess().getLeverageREALParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getConnectParametersAccess().getLeverageREALParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__LeverageAssignment_10"


    // $ANTLR start "rule__ConnectParameters__MoneyAssignment_14"
    // InternalTrader.g:2754:1: rule__ConnectParameters__MoneyAssignment_14 : ( ruleREAL ) ;
    public final void rule__ConnectParameters__MoneyAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2758:1: ( ( ruleREAL ) )
            // InternalTrader.g:2759:2: ( ruleREAL )
            {
            // InternalTrader.g:2759:2: ( ruleREAL )
            // InternalTrader.g:2760:3: ruleREAL
            {
             before(grammarAccess.getConnectParametersAccess().getMoneyREALParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getConnectParametersAccess().getMoneyREALParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__MoneyAssignment_14"


    // $ANTLR start "rule__ConnectParameters__TimeframeAssignment_18"
    // InternalTrader.g:2769:1: rule__ConnectParameters__TimeframeAssignment_18 : ( RULE_STRING ) ;
    public final void rule__ConnectParameters__TimeframeAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2773:1: ( ( RULE_STRING ) )
            // InternalTrader.g:2774:2: ( RULE_STRING )
            {
            // InternalTrader.g:2774:2: ( RULE_STRING )
            // InternalTrader.g:2775:3: RULE_STRING
            {
             before(grammarAccess.getConnectParametersAccess().getTimeframeSTRINGTerminalRuleCall_18_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getTimeframeSTRINGTerminalRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectParameters__TimeframeAssignment_18"


    // $ANTLR start "rule__TradingBot__StrategyAssignment_3"
    // InternalTrader.g:2784:1: rule__TradingBot__StrategyAssignment_3 : ( ruleStrategyDef ) ;
    public final void rule__TradingBot__StrategyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2788:1: ( ( ruleStrategyDef ) )
            // InternalTrader.g:2789:2: ( ruleStrategyDef )
            {
            // InternalTrader.g:2789:2: ( ruleStrategyDef )
            // InternalTrader.g:2790:3: ruleStrategyDef
            {
             before(grammarAccess.getTradingBotAccess().getStrategyStrategyDefEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStrategyDef();

            state._fsp--;

             after(grammarAccess.getTradingBotAccess().getStrategyStrategyDefEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__StrategyAssignment_3"


    // $ANTLR start "rule__TradingBot__FundsAssignment_7"
    // InternalTrader.g:2799:1: rule__TradingBot__FundsAssignment_7 : ( ruleREAL ) ;
    public final void rule__TradingBot__FundsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2803:1: ( ( ruleREAL ) )
            // InternalTrader.g:2804:2: ( ruleREAL )
            {
            // InternalTrader.g:2804:2: ( ruleREAL )
            // InternalTrader.g:2805:3: ruleREAL
            {
             before(grammarAccess.getTradingBotAccess().getFundsREALParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getTradingBotAccess().getFundsREALParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__FundsAssignment_7"


    // $ANTLR start "rule__Execute__BotsAssignment_2"
    // InternalTrader.g:2814:1: rule__Execute__BotsAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Execute__BotsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2818:1: ( ( ( RULE_ID ) ) )
            // InternalTrader.g:2819:2: ( ( RULE_ID ) )
            {
            // InternalTrader.g:2819:2: ( ( RULE_ID ) )
            // InternalTrader.g:2820:3: ( RULE_ID )
            {
             before(grammarAccess.getExecuteAccess().getBotsTradingBotCrossReference_2_0()); 
            // InternalTrader.g:2821:3: ( RULE_ID )
            // InternalTrader.g:2822:4: RULE_ID
            {
             before(grammarAccess.getExecuteAccess().getBotsTradingBotIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExecuteAccess().getBotsTradingBotIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getExecuteAccess().getBotsTradingBotCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__BotsAssignment_2"


    // $ANTLR start "rule__Execute__BotsAssignment_3_1"
    // InternalTrader.g:2833:1: rule__Execute__BotsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Execute__BotsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2837:1: ( ( ( RULE_ID ) ) )
            // InternalTrader.g:2838:2: ( ( RULE_ID ) )
            {
            // InternalTrader.g:2838:2: ( ( RULE_ID ) )
            // InternalTrader.g:2839:3: ( RULE_ID )
            {
             before(grammarAccess.getExecuteAccess().getBotsTradingBotCrossReference_3_1_0()); 
            // InternalTrader.g:2840:3: ( RULE_ID )
            // InternalTrader.g:2841:4: RULE_ID
            {
             before(grammarAccess.getExecuteAccess().getBotsTradingBotIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExecuteAccess().getBotsTradingBotIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getExecuteAccess().getBotsTradingBotCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execute__BotsAssignment_3_1"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalTrader.g:2852:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2856:1: ( ( RULE_ID ) )
            // InternalTrader.g:2857:2: ( RULE_ID )
            {
            // InternalTrader.g:2857:2: ( RULE_ID )
            // InternalTrader.g:2858:3: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__ValueAssignment_3"
    // InternalTrader.g:2867:1: rule__VariableDeclaration__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2871:1: ( ( RULE_INT ) )
            // InternalTrader.g:2872:2: ( RULE_INT )
            {
            // InternalTrader.g:2872:2: ( RULE_INT )
            // InternalTrader.g:2873:3: RULE_INT
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ValueAssignment_3"


    // $ANTLR start "rule__LoopStatement__CountAssignment_0"
    // InternalTrader.g:2882:1: rule__LoopStatement__CountAssignment_0 : ( ruleAddition ) ;
    public final void rule__LoopStatement__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2886:1: ( ( ruleAddition ) )
            // InternalTrader.g:2887:2: ( ruleAddition )
            {
            // InternalTrader.g:2887:2: ( ruleAddition )
            // InternalTrader.g:2888:3: ruleAddition
            {
             before(grammarAccess.getLoopStatementAccess().getCountAdditionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getLoopStatementAccess().getCountAdditionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__CountAssignment_0"


    // $ANTLR start "rule__LoopStatement__StatementsAssignment_3"
    // InternalTrader.g:2897:1: rule__LoopStatement__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__LoopStatement__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2901:1: ( ( ruleStatement ) )
            // InternalTrader.g:2902:2: ( ruleStatement )
            {
            // InternalTrader.g:2902:2: ( ruleStatement )
            // InternalTrader.g:2903:3: ruleStatement
            {
             before(grammarAccess.getLoopStatementAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getLoopStatementAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__StatementsAssignment_3"


    // $ANTLR start "rule__Addition__OperatorAssignment_1_1"
    // InternalTrader.g:2912:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2916:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalTrader.g:2917:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalTrader.g:2917:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalTrader.g:2918:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalTrader.g:2919:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalTrader.g:2919:4: rule__Addition__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OperatorAssignment_1_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // InternalTrader.g:2927:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2931:1: ( ( ruleMultiplication ) )
            // InternalTrader.g:2932:2: ( ruleMultiplication )
            {
            // InternalTrader.g:2932:2: ( ruleMultiplication )
            // InternalTrader.g:2933:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplication__OperatorAssignment_1_1"
    // InternalTrader.g:2942:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2946:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalTrader.g:2947:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalTrader.g:2947:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalTrader.g:2948:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalTrader.g:2949:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalTrader.g:2949:4: rule__Multiplication__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OperatorAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // InternalTrader.g:2957:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2961:1: ( ( rulePrimary ) )
            // InternalTrader.g:2962:2: ( rulePrimary )
            {
            // InternalTrader.g:2962:2: ( rulePrimary )
            // InternalTrader.g:2963:3: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__IntLiteral__ValAssignment"
    // InternalTrader.g:2972:1: rule__IntLiteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2976:1: ( ( RULE_INT ) )
            // InternalTrader.g:2977:2: ( RULE_INT )
            {
            // InternalTrader.g:2977:2: ( RULE_INT )
            // InternalTrader.g:2978:3: RULE_INT
            {
             before(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__ValAssignment"


    // $ANTLR start "rule__IntVarExpression__VarAssignment"
    // InternalTrader.g:2987:1: rule__IntVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IntVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2991:1: ( ( ( RULE_ID ) ) )
            // InternalTrader.g:2992:2: ( ( RULE_ID ) )
            {
            // InternalTrader.g:2992:2: ( ( RULE_ID ) )
            // InternalTrader.g:2993:3: ( RULE_ID )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalTrader.g:2994:3: ( RULE_ID )
            // InternalTrader.g:2995:4: RULE_ID
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntVarExpression__VarAssignment"


    // $ANTLR start "rule__Buy__QuantityAssignment_1"
    // InternalTrader.g:3006:1: rule__Buy__QuantityAssignment_1 : ( ruleREAL ) ;
    public final void rule__Buy__QuantityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3010:1: ( ( ruleREAL ) )
            // InternalTrader.g:3011:2: ( ruleREAL )
            {
            // InternalTrader.g:3011:2: ( ruleREAL )
            // InternalTrader.g:3012:3: ruleREAL
            {
             before(grammarAccess.getBuyAccess().getQuantityREALParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getBuyAccess().getQuantityREALParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buy__QuantityAssignment_1"


    // $ANTLR start "rule__Buy__TickerAssignment_2"
    // InternalTrader.g:3021:1: rule__Buy__TickerAssignment_2 : ( RULE_ID ) ;
    public final void rule__Buy__TickerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3025:1: ( ( RULE_ID ) )
            // InternalTrader.g:3026:2: ( RULE_ID )
            {
            // InternalTrader.g:3026:2: ( RULE_ID )
            // InternalTrader.g:3027:3: RULE_ID
            {
             before(grammarAccess.getBuyAccess().getTickerIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBuyAccess().getTickerIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buy__TickerAssignment_2"


    // $ANTLR start "rule__Buy__PriceAssignment_5"
    // InternalTrader.g:3036:1: rule__Buy__PriceAssignment_5 : ( ruleREAL ) ;
    public final void rule__Buy__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3040:1: ( ( ruleREAL ) )
            // InternalTrader.g:3041:2: ( ruleREAL )
            {
            // InternalTrader.g:3041:2: ( ruleREAL )
            // InternalTrader.g:3042:3: ruleREAL
            {
             before(grammarAccess.getBuyAccess().getPriceREALParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getBuyAccess().getPriceREALParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buy__PriceAssignment_5"


    // $ANTLR start "rule__Sell__QuantityAssignment_1"
    // InternalTrader.g:3051:1: rule__Sell__QuantityAssignment_1 : ( ruleREAL ) ;
    public final void rule__Sell__QuantityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3055:1: ( ( ruleREAL ) )
            // InternalTrader.g:3056:2: ( ruleREAL )
            {
            // InternalTrader.g:3056:2: ( ruleREAL )
            // InternalTrader.g:3057:3: ruleREAL
            {
             before(grammarAccess.getSellAccess().getQuantityREALParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getSellAccess().getQuantityREALParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sell__QuantityAssignment_1"


    // $ANTLR start "rule__Sell__TickerAssignment_2"
    // InternalTrader.g:3066:1: rule__Sell__TickerAssignment_2 : ( RULE_ID ) ;
    public final void rule__Sell__TickerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3070:1: ( ( RULE_ID ) )
            // InternalTrader.g:3071:2: ( RULE_ID )
            {
            // InternalTrader.g:3071:2: ( RULE_ID )
            // InternalTrader.g:3072:3: RULE_ID
            {
             before(grammarAccess.getSellAccess().getTickerIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSellAccess().getTickerIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sell__TickerAssignment_2"


    // $ANTLR start "rule__Sell__PriceAssignment_5"
    // InternalTrader.g:3081:1: rule__Sell__PriceAssignment_5 : ( ruleREAL ) ;
    public final void rule__Sell__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3085:1: ( ( ruleREAL ) )
            // InternalTrader.g:3086:2: ( ruleREAL )
            {
            // InternalTrader.g:3086:2: ( ruleREAL )
            // InternalTrader.g:3087:3: ruleREAL
            {
             before(grammarAccess.getSellAccess().getPriceREALParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getSellAccess().getPriceREALParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sell__PriceAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000010A4020032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000010A4020030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});

}