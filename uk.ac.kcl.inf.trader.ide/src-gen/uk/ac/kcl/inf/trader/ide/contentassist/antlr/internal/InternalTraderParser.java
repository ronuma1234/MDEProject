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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'buyAndHold'", "'meanReversion'", "'connect'", "'to'", "'broker'", "'with'", "'username'", "','", "'password'", "'leverage'", "'money'", "'timeframe'", "'create'", "'bot'", "'strategy'", "'using'", "'from'", "'registered'", "'bots'", "'var'", "'='", "'times'", "'do'", "'end'", "'.'", "'('", "')'", "'buy'", "'at'", "'price'", "'sell'", "'see'", "'execute'", "'stop'"
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
    public static final int RULE_ID=5;
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
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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

                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_ID)||LA1_0==17||LA1_0==27||LA1_0==34||LA1_0==40||(LA1_0>=46 && LA1_0<=48)) ) {
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


    // $ANTLR start "entryRuleListBots"
    // InternalTrader.g:178:1: entryRuleListBots : ruleListBots EOF ;
    public final void entryRuleListBots() throws RecognitionException {
        try {
            // InternalTrader.g:179:1: ( ruleListBots EOF )
            // InternalTrader.g:180:1: ruleListBots EOF
            {
             before(grammarAccess.getListBotsRule()); 
            pushFollow(FOLLOW_1);
            ruleListBots();

            state._fsp--;

             after(grammarAccess.getListBotsRule()); 
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
    // $ANTLR end "entryRuleListBots"


    // $ANTLR start "ruleListBots"
    // InternalTrader.g:187:1: ruleListBots : ( ( rule__ListBots__Group__0 ) ) ;
    public final void ruleListBots() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:191:2: ( ( ( rule__ListBots__Group__0 ) ) )
            // InternalTrader.g:192:2: ( ( rule__ListBots__Group__0 ) )
            {
            // InternalTrader.g:192:2: ( ( rule__ListBots__Group__0 ) )
            // InternalTrader.g:193:3: ( rule__ListBots__Group__0 )
            {
             before(grammarAccess.getListBotsAccess().getGroup()); 
            // InternalTrader.g:194:3: ( rule__ListBots__Group__0 )
            // InternalTrader.g:194:4: rule__ListBots__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListBots__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListBotsAccess().getGroup()); 

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
    // $ANTLR end "ruleListBots"


    // $ANTLR start "entryRuleExecute"
    // InternalTrader.g:203:1: entryRuleExecute : ruleExecute EOF ;
    public final void entryRuleExecute() throws RecognitionException {
        try {
            // InternalTrader.g:204:1: ( ruleExecute EOF )
            // InternalTrader.g:205:1: ruleExecute EOF
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
    // InternalTrader.g:212:1: ruleExecute : ( ( rule__Execute__Group__0 ) ) ;
    public final void ruleExecute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:216:2: ( ( ( rule__Execute__Group__0 ) ) )
            // InternalTrader.g:217:2: ( ( rule__Execute__Group__0 ) )
            {
            // InternalTrader.g:217:2: ( ( rule__Execute__Group__0 ) )
            // InternalTrader.g:218:3: ( rule__Execute__Group__0 )
            {
             before(grammarAccess.getExecuteAccess().getGroup()); 
            // InternalTrader.g:219:3: ( rule__Execute__Group__0 )
            // InternalTrader.g:219:4: rule__Execute__Group__0
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


    // $ANTLR start "entryRuleStop"
    // InternalTrader.g:228:1: entryRuleStop : ruleStop EOF ;
    public final void entryRuleStop() throws RecognitionException {
        try {
            // InternalTrader.g:229:1: ( ruleStop EOF )
            // InternalTrader.g:230:1: ruleStop EOF
            {
             before(grammarAccess.getStopRule()); 
            pushFollow(FOLLOW_1);
            ruleStop();

            state._fsp--;

             after(grammarAccess.getStopRule()); 
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
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // InternalTrader.g:237:1: ruleStop : ( ( rule__Stop__Group__0 ) ) ;
    public final void ruleStop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:241:2: ( ( ( rule__Stop__Group__0 ) ) )
            // InternalTrader.g:242:2: ( ( rule__Stop__Group__0 ) )
            {
            // InternalTrader.g:242:2: ( ( rule__Stop__Group__0 ) )
            // InternalTrader.g:243:3: ( rule__Stop__Group__0 )
            {
             before(grammarAccess.getStopAccess().getGroup()); 
            // InternalTrader.g:244:3: ( rule__Stop__Group__0 )
            // InternalTrader.g:244:4: rule__Stop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Stop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStopAccess().getGroup()); 

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
    // $ANTLR end "ruleStop"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalTrader.g:253:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalTrader.g:254:1: ( ruleVariableDeclaration EOF )
            // InternalTrader.g:255:1: ruleVariableDeclaration EOF
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
    // InternalTrader.g:262:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:266:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalTrader.g:267:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalTrader.g:267:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalTrader.g:268:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalTrader.g:269:3: ( rule__VariableDeclaration__Group__0 )
            // InternalTrader.g:269:4: rule__VariableDeclaration__Group__0
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
    // InternalTrader.g:278:1: entryRuleLoopStatement : ruleLoopStatement EOF ;
    public final void entryRuleLoopStatement() throws RecognitionException {
        try {
            // InternalTrader.g:279:1: ( ruleLoopStatement EOF )
            // InternalTrader.g:280:1: ruleLoopStatement EOF
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
    // InternalTrader.g:287:1: ruleLoopStatement : ( ( rule__LoopStatement__Group__0 ) ) ;
    public final void ruleLoopStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:291:2: ( ( ( rule__LoopStatement__Group__0 ) ) )
            // InternalTrader.g:292:2: ( ( rule__LoopStatement__Group__0 ) )
            {
            // InternalTrader.g:292:2: ( ( rule__LoopStatement__Group__0 ) )
            // InternalTrader.g:293:3: ( rule__LoopStatement__Group__0 )
            {
             before(grammarAccess.getLoopStatementAccess().getGroup()); 
            // InternalTrader.g:294:3: ( rule__LoopStatement__Group__0 )
            // InternalTrader.g:294:4: rule__LoopStatement__Group__0
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
    // InternalTrader.g:303:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTrader.g:307:1: ( ruleREAL EOF )
            // InternalTrader.g:308:1: ruleREAL EOF
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
    // InternalTrader.g:318:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:323:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalTrader.g:324:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalTrader.g:324:2: ( ( rule__REAL__Group__0 ) )
            // InternalTrader.g:325:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalTrader.g:326:3: ( rule__REAL__Group__0 )
            // InternalTrader.g:326:4: rule__REAL__Group__0
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
    // InternalTrader.g:336:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalTrader.g:337:1: ( ruleAddition EOF )
            // InternalTrader.g:338:1: ruleAddition EOF
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
    // InternalTrader.g:345:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:349:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalTrader.g:350:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalTrader.g:350:2: ( ( rule__Addition__Group__0 ) )
            // InternalTrader.g:351:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalTrader.g:352:3: ( rule__Addition__Group__0 )
            // InternalTrader.g:352:4: rule__Addition__Group__0
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
    // InternalTrader.g:361:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalTrader.g:362:1: ( ruleMultiplication EOF )
            // InternalTrader.g:363:1: ruleMultiplication EOF
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
    // InternalTrader.g:370:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:374:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalTrader.g:375:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalTrader.g:375:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalTrader.g:376:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalTrader.g:377:3: ( rule__Multiplication__Group__0 )
            // InternalTrader.g:377:4: rule__Multiplication__Group__0
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
    // InternalTrader.g:386:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalTrader.g:387:1: ( rulePrimary EOF )
            // InternalTrader.g:388:1: rulePrimary EOF
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
    // InternalTrader.g:395:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:399:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalTrader.g:400:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalTrader.g:400:2: ( ( rule__Primary__Alternatives ) )
            // InternalTrader.g:401:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalTrader.g:402:3: ( rule__Primary__Alternatives )
            // InternalTrader.g:402:4: rule__Primary__Alternatives
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
    // InternalTrader.g:411:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalTrader.g:412:1: ( ruleIntLiteral EOF )
            // InternalTrader.g:413:1: ruleIntLiteral EOF
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
    // InternalTrader.g:420:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:424:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalTrader.g:425:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalTrader.g:425:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalTrader.g:426:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalTrader.g:427:3: ( rule__IntLiteral__ValAssignment )
            // InternalTrader.g:427:4: rule__IntLiteral__ValAssignment
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
    // InternalTrader.g:436:1: entryRuleIntVarExpression : ruleIntVarExpression EOF ;
    public final void entryRuleIntVarExpression() throws RecognitionException {
        try {
            // InternalTrader.g:437:1: ( ruleIntVarExpression EOF )
            // InternalTrader.g:438:1: ruleIntVarExpression EOF
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
    // InternalTrader.g:445:1: ruleIntVarExpression : ( ( rule__IntVarExpression__VarAssignment ) ) ;
    public final void ruleIntVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:449:2: ( ( ( rule__IntVarExpression__VarAssignment ) ) )
            // InternalTrader.g:450:2: ( ( rule__IntVarExpression__VarAssignment ) )
            {
            // InternalTrader.g:450:2: ( ( rule__IntVarExpression__VarAssignment ) )
            // InternalTrader.g:451:3: ( rule__IntVarExpression__VarAssignment )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 
            // InternalTrader.g:452:3: ( rule__IntVarExpression__VarAssignment )
            // InternalTrader.g:452:4: rule__IntVarExpression__VarAssignment
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
    // InternalTrader.g:461:1: entryRuleBuy : ruleBuy EOF ;
    public final void entryRuleBuy() throws RecognitionException {
        try {
            // InternalTrader.g:462:1: ( ruleBuy EOF )
            // InternalTrader.g:463:1: ruleBuy EOF
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
    // InternalTrader.g:470:1: ruleBuy : ( ( rule__Buy__Group__0 ) ) ;
    public final void ruleBuy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:474:2: ( ( ( rule__Buy__Group__0 ) ) )
            // InternalTrader.g:475:2: ( ( rule__Buy__Group__0 ) )
            {
            // InternalTrader.g:475:2: ( ( rule__Buy__Group__0 ) )
            // InternalTrader.g:476:3: ( rule__Buy__Group__0 )
            {
             before(grammarAccess.getBuyAccess().getGroup()); 
            // InternalTrader.g:477:3: ( rule__Buy__Group__0 )
            // InternalTrader.g:477:4: rule__Buy__Group__0
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
    // InternalTrader.g:486:1: entryRuleSell : ruleSell EOF ;
    public final void entryRuleSell() throws RecognitionException {
        try {
            // InternalTrader.g:487:1: ( ruleSell EOF )
            // InternalTrader.g:488:1: ruleSell EOF
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
    // InternalTrader.g:495:1: ruleSell : ( ( rule__Sell__Group__0 ) ) ;
    public final void ruleSell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:499:2: ( ( ( rule__Sell__Group__0 ) ) )
            // InternalTrader.g:500:2: ( ( rule__Sell__Group__0 ) )
            {
            // InternalTrader.g:500:2: ( ( rule__Sell__Group__0 ) )
            // InternalTrader.g:501:3: ( rule__Sell__Group__0 )
            {
             before(grammarAccess.getSellAccess().getGroup()); 
            // InternalTrader.g:502:3: ( rule__Sell__Group__0 )
            // InternalTrader.g:502:4: rule__Sell__Group__0
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
    // InternalTrader.g:511:1: ruleStrategyDef : ( ( rule__StrategyDef__Alternatives ) ) ;
    public final void ruleStrategyDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:515:1: ( ( ( rule__StrategyDef__Alternatives ) ) )
            // InternalTrader.g:516:2: ( ( rule__StrategyDef__Alternatives ) )
            {
            // InternalTrader.g:516:2: ( ( rule__StrategyDef__Alternatives ) )
            // InternalTrader.g:517:3: ( rule__StrategyDef__Alternatives )
            {
             before(grammarAccess.getStrategyDefAccess().getAlternatives()); 
            // InternalTrader.g:518:3: ( rule__StrategyDef__Alternatives )
            // InternalTrader.g:518:4: rule__StrategyDef__Alternatives
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
    // InternalTrader.g:526:1: rule__Statement__Alternatives : ( ( ruleConnect ) | ( ruleTradingBot ) | ( ruleListBots ) | ( ruleExecute ) | ( ruleStop ) | ( ruleVariableDeclaration ) | ( ruleLoopStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:530:1: ( ( ruleConnect ) | ( ruleTradingBot ) | ( ruleListBots ) | ( ruleExecute ) | ( ruleStop ) | ( ruleVariableDeclaration ) | ( ruleLoopStatement ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 46:
                {
                alt2=3;
                }
                break;
            case 47:
                {
                alt2=4;
                }
                break;
            case 48:
                {
                alt2=5;
                }
                break;
            case 34:
                {
                alt2=6;
                }
                break;
            case RULE_INT:
            case RULE_ID:
            case 40:
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
                    // InternalTrader.g:531:2: ( ruleConnect )
                    {
                    // InternalTrader.g:531:2: ( ruleConnect )
                    // InternalTrader.g:532:3: ruleConnect
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
                    // InternalTrader.g:537:2: ( ruleTradingBot )
                    {
                    // InternalTrader.g:537:2: ( ruleTradingBot )
                    // InternalTrader.g:538:3: ruleTradingBot
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
                    // InternalTrader.g:543:2: ( ruleListBots )
                    {
                    // InternalTrader.g:543:2: ( ruleListBots )
                    // InternalTrader.g:544:3: ruleListBots
                    {
                     before(grammarAccess.getStatementAccess().getListBotsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleListBots();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getListBotsParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTrader.g:549:2: ( ruleExecute )
                    {
                    // InternalTrader.g:549:2: ( ruleExecute )
                    // InternalTrader.g:550:3: ruleExecute
                    {
                     before(grammarAccess.getStatementAccess().getExecuteParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExecute();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getExecuteParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTrader.g:555:2: ( ruleStop )
                    {
                    // InternalTrader.g:555:2: ( ruleStop )
                    // InternalTrader.g:556:3: ruleStop
                    {
                     before(grammarAccess.getStatementAccess().getStopParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleStop();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStopParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTrader.g:561:2: ( ruleVariableDeclaration )
                    {
                    // InternalTrader.g:561:2: ( ruleVariableDeclaration )
                    // InternalTrader.g:562:3: ruleVariableDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTrader.g:567:2: ( ruleLoopStatement )
                    {
                    // InternalTrader.g:567:2: ( ruleLoopStatement )
                    // InternalTrader.g:568:3: ruleLoopStatement
                    {
                     before(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleLoopStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_6()); 

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
    // InternalTrader.g:577:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:581:1: ( ( '+' ) | ( '-' ) )
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
                    // InternalTrader.g:582:2: ( '+' )
                    {
                    // InternalTrader.g:582:2: ( '+' )
                    // InternalTrader.g:583:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:588:2: ( '-' )
                    {
                    // InternalTrader.g:588:2: ( '-' )
                    // InternalTrader.g:589:3: '-'
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
    // InternalTrader.g:598:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:602:1: ( ( '*' ) | ( '/' ) )
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
                    // InternalTrader.g:603:2: ( '*' )
                    {
                    // InternalTrader.g:603:2: ( '*' )
                    // InternalTrader.g:604:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:609:2: ( '/' )
                    {
                    // InternalTrader.g:609:2: ( '/' )
                    // InternalTrader.g:610:3: '/'
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
    // InternalTrader.g:619:1: rule__Primary__Alternatives : ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:623:1: ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ( rule__Primary__Group_2__0 ) ) )
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
            case 40:
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
                    // InternalTrader.g:624:2: ( ruleIntLiteral )
                    {
                    // InternalTrader.g:624:2: ( ruleIntLiteral )
                    // InternalTrader.g:625:3: ruleIntLiteral
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
                    // InternalTrader.g:630:2: ( ruleIntVarExpression )
                    {
                    // InternalTrader.g:630:2: ( ruleIntVarExpression )
                    // InternalTrader.g:631:3: ruleIntVarExpression
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
                    // InternalTrader.g:636:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalTrader.g:636:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalTrader.g:637:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalTrader.g:638:3: ( rule__Primary__Group_2__0 )
                    // InternalTrader.g:638:4: rule__Primary__Group_2__0
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
    // InternalTrader.g:646:1: rule__StrategyDef__Alternatives : ( ( ( 'buyAndHold' ) ) | ( ( 'meanReversion' ) ) );
    public final void rule__StrategyDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:650:1: ( ( ( 'buyAndHold' ) ) | ( ( 'meanReversion' ) ) )
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
                    // InternalTrader.g:651:2: ( ( 'buyAndHold' ) )
                    {
                    // InternalTrader.g:651:2: ( ( 'buyAndHold' ) )
                    // InternalTrader.g:652:3: ( 'buyAndHold' )
                    {
                     before(grammarAccess.getStrategyDefAccess().getBuyAndHoldEnumLiteralDeclaration_0()); 
                    // InternalTrader.g:653:3: ( 'buyAndHold' )
                    // InternalTrader.g:653:4: 'buyAndHold'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getStrategyDefAccess().getBuyAndHoldEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:657:2: ( ( 'meanReversion' ) )
                    {
                    // InternalTrader.g:657:2: ( ( 'meanReversion' ) )
                    // InternalTrader.g:658:3: ( 'meanReversion' )
                    {
                     before(grammarAccess.getStrategyDefAccess().getMeanReversionEnumLiteralDeclaration_1()); 
                    // InternalTrader.g:659:3: ( 'meanReversion' )
                    // InternalTrader.g:659:4: 'meanReversion'
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
    // InternalTrader.g:667:1: rule__Connect__Group__0 : rule__Connect__Group__0__Impl rule__Connect__Group__1 ;
    public final void rule__Connect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:671:1: ( rule__Connect__Group__0__Impl rule__Connect__Group__1 )
            // InternalTrader.g:672:2: rule__Connect__Group__0__Impl rule__Connect__Group__1
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
    // InternalTrader.g:679:1: rule__Connect__Group__0__Impl : ( 'connect' ) ;
    public final void rule__Connect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:683:1: ( ( 'connect' ) )
            // InternalTrader.g:684:1: ( 'connect' )
            {
            // InternalTrader.g:684:1: ( 'connect' )
            // InternalTrader.g:685:2: 'connect'
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
    // InternalTrader.g:694:1: rule__Connect__Group__1 : rule__Connect__Group__1__Impl rule__Connect__Group__2 ;
    public final void rule__Connect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:698:1: ( rule__Connect__Group__1__Impl rule__Connect__Group__2 )
            // InternalTrader.g:699:2: rule__Connect__Group__1__Impl rule__Connect__Group__2
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
    // InternalTrader.g:706:1: rule__Connect__Group__1__Impl : ( 'to' ) ;
    public final void rule__Connect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:710:1: ( ( 'to' ) )
            // InternalTrader.g:711:1: ( 'to' )
            {
            // InternalTrader.g:711:1: ( 'to' )
            // InternalTrader.g:712:2: 'to'
            {
             before(grammarAccess.getConnectAccess().getToKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConnectAccess().getToKeyword_1()); 

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
    // InternalTrader.g:721:1: rule__Connect__Group__2 : rule__Connect__Group__2__Impl rule__Connect__Group__3 ;
    public final void rule__Connect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:725:1: ( rule__Connect__Group__2__Impl rule__Connect__Group__3 )
            // InternalTrader.g:726:2: rule__Connect__Group__2__Impl rule__Connect__Group__3
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
    // InternalTrader.g:733:1: rule__Connect__Group__2__Impl : ( 'broker' ) ;
    public final void rule__Connect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:737:1: ( ( 'broker' ) )
            // InternalTrader.g:738:1: ( 'broker' )
            {
            // InternalTrader.g:738:1: ( 'broker' )
            // InternalTrader.g:739:2: 'broker'
            {
             before(grammarAccess.getConnectAccess().getBrokerKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConnectAccess().getBrokerKeyword_2()); 

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
    // InternalTrader.g:748:1: rule__Connect__Group__3 : rule__Connect__Group__3__Impl rule__Connect__Group__4 ;
    public final void rule__Connect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:752:1: ( rule__Connect__Group__3__Impl rule__Connect__Group__4 )
            // InternalTrader.g:753:2: rule__Connect__Group__3__Impl rule__Connect__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Connect__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connect__Group__4();

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
    // InternalTrader.g:760:1: rule__Connect__Group__3__Impl : ( ( rule__Connect__BrokerNameAssignment_3 ) ) ;
    public final void rule__Connect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:764:1: ( ( ( rule__Connect__BrokerNameAssignment_3 ) ) )
            // InternalTrader.g:765:1: ( ( rule__Connect__BrokerNameAssignment_3 ) )
            {
            // InternalTrader.g:765:1: ( ( rule__Connect__BrokerNameAssignment_3 ) )
            // InternalTrader.g:766:2: ( rule__Connect__BrokerNameAssignment_3 )
            {
             before(grammarAccess.getConnectAccess().getBrokerNameAssignment_3()); 
            // InternalTrader.g:767:2: ( rule__Connect__BrokerNameAssignment_3 )
            // InternalTrader.g:767:3: rule__Connect__BrokerNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Connect__BrokerNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConnectAccess().getBrokerNameAssignment_3()); 

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


    // $ANTLR start "rule__Connect__Group__4"
    // InternalTrader.g:775:1: rule__Connect__Group__4 : rule__Connect__Group__4__Impl rule__Connect__Group__5 ;
    public final void rule__Connect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:779:1: ( rule__Connect__Group__4__Impl rule__Connect__Group__5 )
            // InternalTrader.g:780:2: rule__Connect__Group__4__Impl rule__Connect__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Connect__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connect__Group__5();

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
    // $ANTLR end "rule__Connect__Group__4"


    // $ANTLR start "rule__Connect__Group__4__Impl"
    // InternalTrader.g:787:1: rule__Connect__Group__4__Impl : ( 'with' ) ;
    public final void rule__Connect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:791:1: ( ( 'with' ) )
            // InternalTrader.g:792:1: ( 'with' )
            {
            // InternalTrader.g:792:1: ( 'with' )
            // InternalTrader.g:793:2: 'with'
            {
             before(grammarAccess.getConnectAccess().getWithKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConnectAccess().getWithKeyword_4()); 

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
    // $ANTLR end "rule__Connect__Group__4__Impl"


    // $ANTLR start "rule__Connect__Group__5"
    // InternalTrader.g:802:1: rule__Connect__Group__5 : rule__Connect__Group__5__Impl ;
    public final void rule__Connect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:806:1: ( rule__Connect__Group__5__Impl )
            // InternalTrader.g:807:2: rule__Connect__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connect__Group__5__Impl();

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
    // $ANTLR end "rule__Connect__Group__5"


    // $ANTLR start "rule__Connect__Group__5__Impl"
    // InternalTrader.g:813:1: rule__Connect__Group__5__Impl : ( ( rule__Connect__ParametersAssignment_5 )? ) ;
    public final void rule__Connect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:817:1: ( ( ( rule__Connect__ParametersAssignment_5 )? ) )
            // InternalTrader.g:818:1: ( ( rule__Connect__ParametersAssignment_5 )? )
            {
            // InternalTrader.g:818:1: ( ( rule__Connect__ParametersAssignment_5 )? )
            // InternalTrader.g:819:2: ( rule__Connect__ParametersAssignment_5 )?
            {
             before(grammarAccess.getConnectAccess().getParametersAssignment_5()); 
            // InternalTrader.g:820:2: ( rule__Connect__ParametersAssignment_5 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTrader.g:820:3: rule__Connect__ParametersAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connect__ParametersAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectAccess().getParametersAssignment_5()); 

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
    // $ANTLR end "rule__Connect__Group__5__Impl"


    // $ANTLR start "rule__ConnectParameters__Group__0"
    // InternalTrader.g:829:1: rule__ConnectParameters__Group__0 : rule__ConnectParameters__Group__0__Impl rule__ConnectParameters__Group__1 ;
    public final void rule__ConnectParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:833:1: ( rule__ConnectParameters__Group__0__Impl rule__ConnectParameters__Group__1 )
            // InternalTrader.g:834:2: rule__ConnectParameters__Group__0__Impl rule__ConnectParameters__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalTrader.g:841:1: rule__ConnectParameters__Group__0__Impl : ( 'username' ) ;
    public final void rule__ConnectParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:845:1: ( ( 'username' ) )
            // InternalTrader.g:846:1: ( 'username' )
            {
            // InternalTrader.g:846:1: ( 'username' )
            // InternalTrader.g:847:2: 'username'
            {
             before(grammarAccess.getConnectParametersAccess().getUsernameKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalTrader.g:856:1: rule__ConnectParameters__Group__1 : rule__ConnectParameters__Group__1__Impl rule__ConnectParameters__Group__2 ;
    public final void rule__ConnectParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:860:1: ( rule__ConnectParameters__Group__1__Impl rule__ConnectParameters__Group__2 )
            // InternalTrader.g:861:2: rule__ConnectParameters__Group__1__Impl rule__ConnectParameters__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalTrader.g:868:1: rule__ConnectParameters__Group__1__Impl : ( ( rule__ConnectParameters__UsernameAssignment_1 ) ) ;
    public final void rule__ConnectParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:872:1: ( ( ( rule__ConnectParameters__UsernameAssignment_1 ) ) )
            // InternalTrader.g:873:1: ( ( rule__ConnectParameters__UsernameAssignment_1 ) )
            {
            // InternalTrader.g:873:1: ( ( rule__ConnectParameters__UsernameAssignment_1 ) )
            // InternalTrader.g:874:2: ( rule__ConnectParameters__UsernameAssignment_1 )
            {
             before(grammarAccess.getConnectParametersAccess().getUsernameAssignment_1()); 
            // InternalTrader.g:875:2: ( rule__ConnectParameters__UsernameAssignment_1 )
            // InternalTrader.g:875:3: rule__ConnectParameters__UsernameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConnectParameters__UsernameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectParametersAccess().getUsernameAssignment_1()); 

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
    // InternalTrader.g:883:1: rule__ConnectParameters__Group__2 : rule__ConnectParameters__Group__2__Impl rule__ConnectParameters__Group__3 ;
    public final void rule__ConnectParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:887:1: ( rule__ConnectParameters__Group__2__Impl rule__ConnectParameters__Group__3 )
            // InternalTrader.g:888:2: rule__ConnectParameters__Group__2__Impl rule__ConnectParameters__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalTrader.g:895:1: rule__ConnectParameters__Group__2__Impl : ( ',' ) ;
    public final void rule__ConnectParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:899:1: ( ( ',' ) )
            // InternalTrader.g:900:1: ( ',' )
            {
            // InternalTrader.g:900:1: ( ',' )
            // InternalTrader.g:901:2: ','
            {
             before(grammarAccess.getConnectParametersAccess().getCommaKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getCommaKeyword_2()); 

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
    // InternalTrader.g:910:1: rule__ConnectParameters__Group__3 : rule__ConnectParameters__Group__3__Impl rule__ConnectParameters__Group__4 ;
    public final void rule__ConnectParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:914:1: ( rule__ConnectParameters__Group__3__Impl rule__ConnectParameters__Group__4 )
            // InternalTrader.g:915:2: rule__ConnectParameters__Group__3__Impl rule__ConnectParameters__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalTrader.g:922:1: rule__ConnectParameters__Group__3__Impl : ( 'password' ) ;
    public final void rule__ConnectParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:926:1: ( ( 'password' ) )
            // InternalTrader.g:927:1: ( 'password' )
            {
            // InternalTrader.g:927:1: ( 'password' )
            // InternalTrader.g:928:2: 'password'
            {
             before(grammarAccess.getConnectParametersAccess().getPasswordKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getPasswordKeyword_3()); 

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
    // InternalTrader.g:937:1: rule__ConnectParameters__Group__4 : rule__ConnectParameters__Group__4__Impl rule__ConnectParameters__Group__5 ;
    public final void rule__ConnectParameters__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:941:1: ( rule__ConnectParameters__Group__4__Impl rule__ConnectParameters__Group__5 )
            // InternalTrader.g:942:2: rule__ConnectParameters__Group__4__Impl rule__ConnectParameters__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalTrader.g:949:1: rule__ConnectParameters__Group__4__Impl : ( ( rule__ConnectParameters__PasswordAssignment_4 ) ) ;
    public final void rule__ConnectParameters__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:953:1: ( ( ( rule__ConnectParameters__PasswordAssignment_4 ) ) )
            // InternalTrader.g:954:1: ( ( rule__ConnectParameters__PasswordAssignment_4 ) )
            {
            // InternalTrader.g:954:1: ( ( rule__ConnectParameters__PasswordAssignment_4 ) )
            // InternalTrader.g:955:2: ( rule__ConnectParameters__PasswordAssignment_4 )
            {
             before(grammarAccess.getConnectParametersAccess().getPasswordAssignment_4()); 
            // InternalTrader.g:956:2: ( rule__ConnectParameters__PasswordAssignment_4 )
            // InternalTrader.g:956:3: rule__ConnectParameters__PasswordAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ConnectParameters__PasswordAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConnectParametersAccess().getPasswordAssignment_4()); 

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
    // InternalTrader.g:964:1: rule__ConnectParameters__Group__5 : rule__ConnectParameters__Group__5__Impl rule__ConnectParameters__Group__6 ;
    public final void rule__ConnectParameters__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:968:1: ( rule__ConnectParameters__Group__5__Impl rule__ConnectParameters__Group__6 )
            // InternalTrader.g:969:2: rule__ConnectParameters__Group__5__Impl rule__ConnectParameters__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalTrader.g:976:1: rule__ConnectParameters__Group__5__Impl : ( ',' ) ;
    public final void rule__ConnectParameters__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:980:1: ( ( ',' ) )
            // InternalTrader.g:981:1: ( ',' )
            {
            // InternalTrader.g:981:1: ( ',' )
            // InternalTrader.g:982:2: ','
            {
             before(grammarAccess.getConnectParametersAccess().getCommaKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getCommaKeyword_5()); 

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
    // InternalTrader.g:991:1: rule__ConnectParameters__Group__6 : rule__ConnectParameters__Group__6__Impl rule__ConnectParameters__Group__7 ;
    public final void rule__ConnectParameters__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:995:1: ( rule__ConnectParameters__Group__6__Impl rule__ConnectParameters__Group__7 )
            // InternalTrader.g:996:2: rule__ConnectParameters__Group__6__Impl rule__ConnectParameters__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalTrader.g:1003:1: rule__ConnectParameters__Group__6__Impl : ( 'leverage' ) ;
    public final void rule__ConnectParameters__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1007:1: ( ( 'leverage' ) )
            // InternalTrader.g:1008:1: ( 'leverage' )
            {
            // InternalTrader.g:1008:1: ( 'leverage' )
            // InternalTrader.g:1009:2: 'leverage'
            {
             before(grammarAccess.getConnectParametersAccess().getLeverageKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getLeverageKeyword_6()); 

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
    // InternalTrader.g:1018:1: rule__ConnectParameters__Group__7 : rule__ConnectParameters__Group__7__Impl rule__ConnectParameters__Group__8 ;
    public final void rule__ConnectParameters__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1022:1: ( rule__ConnectParameters__Group__7__Impl rule__ConnectParameters__Group__8 )
            // InternalTrader.g:1023:2: rule__ConnectParameters__Group__7__Impl rule__ConnectParameters__Group__8
            {
            pushFollow(FOLLOW_10);
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
    // InternalTrader.g:1030:1: rule__ConnectParameters__Group__7__Impl : ( ( rule__ConnectParameters__LeverageAssignment_7 ) ) ;
    public final void rule__ConnectParameters__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1034:1: ( ( ( rule__ConnectParameters__LeverageAssignment_7 ) ) )
            // InternalTrader.g:1035:1: ( ( rule__ConnectParameters__LeverageAssignment_7 ) )
            {
            // InternalTrader.g:1035:1: ( ( rule__ConnectParameters__LeverageAssignment_7 ) )
            // InternalTrader.g:1036:2: ( rule__ConnectParameters__LeverageAssignment_7 )
            {
             before(grammarAccess.getConnectParametersAccess().getLeverageAssignment_7()); 
            // InternalTrader.g:1037:2: ( rule__ConnectParameters__LeverageAssignment_7 )
            // InternalTrader.g:1037:3: rule__ConnectParameters__LeverageAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ConnectParameters__LeverageAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getConnectParametersAccess().getLeverageAssignment_7()); 

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
    // InternalTrader.g:1045:1: rule__ConnectParameters__Group__8 : rule__ConnectParameters__Group__8__Impl rule__ConnectParameters__Group__9 ;
    public final void rule__ConnectParameters__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1049:1: ( rule__ConnectParameters__Group__8__Impl rule__ConnectParameters__Group__9 )
            // InternalTrader.g:1050:2: rule__ConnectParameters__Group__8__Impl rule__ConnectParameters__Group__9
            {
            pushFollow(FOLLOW_14);
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
    // InternalTrader.g:1057:1: rule__ConnectParameters__Group__8__Impl : ( ',' ) ;
    public final void rule__ConnectParameters__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1061:1: ( ( ',' ) )
            // InternalTrader.g:1062:1: ( ',' )
            {
            // InternalTrader.g:1062:1: ( ',' )
            // InternalTrader.g:1063:2: ','
            {
             before(grammarAccess.getConnectParametersAccess().getCommaKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getCommaKeyword_8()); 

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
    // InternalTrader.g:1072:1: rule__ConnectParameters__Group__9 : rule__ConnectParameters__Group__9__Impl rule__ConnectParameters__Group__10 ;
    public final void rule__ConnectParameters__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1076:1: ( rule__ConnectParameters__Group__9__Impl rule__ConnectParameters__Group__10 )
            // InternalTrader.g:1077:2: rule__ConnectParameters__Group__9__Impl rule__ConnectParameters__Group__10
            {
            pushFollow(FOLLOW_13);
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
    // InternalTrader.g:1084:1: rule__ConnectParameters__Group__9__Impl : ( 'money' ) ;
    public final void rule__ConnectParameters__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1088:1: ( ( 'money' ) )
            // InternalTrader.g:1089:1: ( 'money' )
            {
            // InternalTrader.g:1089:1: ( 'money' )
            // InternalTrader.g:1090:2: 'money'
            {
             before(grammarAccess.getConnectParametersAccess().getMoneyKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getMoneyKeyword_9()); 

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
    // InternalTrader.g:1099:1: rule__ConnectParameters__Group__10 : rule__ConnectParameters__Group__10__Impl rule__ConnectParameters__Group__11 ;
    public final void rule__ConnectParameters__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1103:1: ( rule__ConnectParameters__Group__10__Impl rule__ConnectParameters__Group__11 )
            // InternalTrader.g:1104:2: rule__ConnectParameters__Group__10__Impl rule__ConnectParameters__Group__11
            {
            pushFollow(FOLLOW_10);
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
    // InternalTrader.g:1111:1: rule__ConnectParameters__Group__10__Impl : ( ( rule__ConnectParameters__MoneyAssignment_10 ) ) ;
    public final void rule__ConnectParameters__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1115:1: ( ( ( rule__ConnectParameters__MoneyAssignment_10 ) ) )
            // InternalTrader.g:1116:1: ( ( rule__ConnectParameters__MoneyAssignment_10 ) )
            {
            // InternalTrader.g:1116:1: ( ( rule__ConnectParameters__MoneyAssignment_10 ) )
            // InternalTrader.g:1117:2: ( rule__ConnectParameters__MoneyAssignment_10 )
            {
             before(grammarAccess.getConnectParametersAccess().getMoneyAssignment_10()); 
            // InternalTrader.g:1118:2: ( rule__ConnectParameters__MoneyAssignment_10 )
            // InternalTrader.g:1118:3: rule__ConnectParameters__MoneyAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__ConnectParameters__MoneyAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getConnectParametersAccess().getMoneyAssignment_10()); 

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
    // InternalTrader.g:1126:1: rule__ConnectParameters__Group__11 : rule__ConnectParameters__Group__11__Impl rule__ConnectParameters__Group__12 ;
    public final void rule__ConnectParameters__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1130:1: ( rule__ConnectParameters__Group__11__Impl rule__ConnectParameters__Group__12 )
            // InternalTrader.g:1131:2: rule__ConnectParameters__Group__11__Impl rule__ConnectParameters__Group__12
            {
            pushFollow(FOLLOW_15);
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
    // InternalTrader.g:1138:1: rule__ConnectParameters__Group__11__Impl : ( ',' ) ;
    public final void rule__ConnectParameters__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1142:1: ( ( ',' ) )
            // InternalTrader.g:1143:1: ( ',' )
            {
            // InternalTrader.g:1143:1: ( ',' )
            // InternalTrader.g:1144:2: ','
            {
             before(grammarAccess.getConnectParametersAccess().getCommaKeyword_11()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTrader.g:1153:1: rule__ConnectParameters__Group__12 : rule__ConnectParameters__Group__12__Impl rule__ConnectParameters__Group__13 ;
    public final void rule__ConnectParameters__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1157:1: ( rule__ConnectParameters__Group__12__Impl rule__ConnectParameters__Group__13 )
            // InternalTrader.g:1158:2: rule__ConnectParameters__Group__12__Impl rule__ConnectParameters__Group__13
            {
            pushFollow(FOLLOW_9);
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
    // InternalTrader.g:1165:1: rule__ConnectParameters__Group__12__Impl : ( 'timeframe' ) ;
    public final void rule__ConnectParameters__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1169:1: ( ( 'timeframe' ) )
            // InternalTrader.g:1170:1: ( 'timeframe' )
            {
            // InternalTrader.g:1170:1: ( 'timeframe' )
            // InternalTrader.g:1171:2: 'timeframe'
            {
             before(grammarAccess.getConnectParametersAccess().getTimeframeKeyword_12()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getTimeframeKeyword_12()); 

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
    // InternalTrader.g:1180:1: rule__ConnectParameters__Group__13 : rule__ConnectParameters__Group__13__Impl ;
    public final void rule__ConnectParameters__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1184:1: ( rule__ConnectParameters__Group__13__Impl )
            // InternalTrader.g:1185:2: rule__ConnectParameters__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectParameters__Group__13__Impl();

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
    // InternalTrader.g:1191:1: rule__ConnectParameters__Group__13__Impl : ( ( rule__ConnectParameters__TimeframeAssignment_13 ) ) ;
    public final void rule__ConnectParameters__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1195:1: ( ( ( rule__ConnectParameters__TimeframeAssignment_13 ) ) )
            // InternalTrader.g:1196:1: ( ( rule__ConnectParameters__TimeframeAssignment_13 ) )
            {
            // InternalTrader.g:1196:1: ( ( rule__ConnectParameters__TimeframeAssignment_13 ) )
            // InternalTrader.g:1197:2: ( rule__ConnectParameters__TimeframeAssignment_13 )
            {
             before(grammarAccess.getConnectParametersAccess().getTimeframeAssignment_13()); 
            // InternalTrader.g:1198:2: ( rule__ConnectParameters__TimeframeAssignment_13 )
            // InternalTrader.g:1198:3: rule__ConnectParameters__TimeframeAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__ConnectParameters__TimeframeAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getConnectParametersAccess().getTimeframeAssignment_13()); 

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


    // $ANTLR start "rule__TradingBot__Group__0"
    // InternalTrader.g:1207:1: rule__TradingBot__Group__0 : rule__TradingBot__Group__0__Impl rule__TradingBot__Group__1 ;
    public final void rule__TradingBot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1211:1: ( rule__TradingBot__Group__0__Impl rule__TradingBot__Group__1 )
            // InternalTrader.g:1212:2: rule__TradingBot__Group__0__Impl rule__TradingBot__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalTrader.g:1219:1: rule__TradingBot__Group__0__Impl : ( 'create' ) ;
    public final void rule__TradingBot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1223:1: ( ( 'create' ) )
            // InternalTrader.g:1224:1: ( 'create' )
            {
            // InternalTrader.g:1224:1: ( 'create' )
            // InternalTrader.g:1225:2: 'create'
            {
             before(grammarAccess.getTradingBotAccess().getCreateKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getCreateKeyword_0()); 

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
    // InternalTrader.g:1234:1: rule__TradingBot__Group__1 : rule__TradingBot__Group__1__Impl rule__TradingBot__Group__2 ;
    public final void rule__TradingBot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1238:1: ( rule__TradingBot__Group__1__Impl rule__TradingBot__Group__2 )
            // InternalTrader.g:1239:2: rule__TradingBot__Group__1__Impl rule__TradingBot__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalTrader.g:1246:1: rule__TradingBot__Group__1__Impl : ( 'bot' ) ;
    public final void rule__TradingBot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1250:1: ( ( 'bot' ) )
            // InternalTrader.g:1251:1: ( 'bot' )
            {
            // InternalTrader.g:1251:1: ( 'bot' )
            // InternalTrader.g:1252:2: 'bot'
            {
             before(grammarAccess.getTradingBotAccess().getBotKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getBotKeyword_1()); 

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
    // InternalTrader.g:1261:1: rule__TradingBot__Group__2 : rule__TradingBot__Group__2__Impl rule__TradingBot__Group__3 ;
    public final void rule__TradingBot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1265:1: ( rule__TradingBot__Group__2__Impl rule__TradingBot__Group__3 )
            // InternalTrader.g:1266:2: rule__TradingBot__Group__2__Impl rule__TradingBot__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalTrader.g:1273:1: rule__TradingBot__Group__2__Impl : ( 'with' ) ;
    public final void rule__TradingBot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1277:1: ( ( 'with' ) )
            // InternalTrader.g:1278:1: ( 'with' )
            {
            // InternalTrader.g:1278:1: ( 'with' )
            // InternalTrader.g:1279:2: 'with'
            {
             before(grammarAccess.getTradingBotAccess().getWithKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getWithKeyword_2()); 

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
    // InternalTrader.g:1288:1: rule__TradingBot__Group__3 : rule__TradingBot__Group__3__Impl rule__TradingBot__Group__4 ;
    public final void rule__TradingBot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1292:1: ( rule__TradingBot__Group__3__Impl rule__TradingBot__Group__4 )
            // InternalTrader.g:1293:2: rule__TradingBot__Group__3__Impl rule__TradingBot__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalTrader.g:1300:1: rule__TradingBot__Group__3__Impl : ( ( rule__TradingBot__StrategyAssignment_3 ) ) ;
    public final void rule__TradingBot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1304:1: ( ( ( rule__TradingBot__StrategyAssignment_3 ) ) )
            // InternalTrader.g:1305:1: ( ( rule__TradingBot__StrategyAssignment_3 ) )
            {
            // InternalTrader.g:1305:1: ( ( rule__TradingBot__StrategyAssignment_3 ) )
            // InternalTrader.g:1306:2: ( rule__TradingBot__StrategyAssignment_3 )
            {
             before(grammarAccess.getTradingBotAccess().getStrategyAssignment_3()); 
            // InternalTrader.g:1307:2: ( rule__TradingBot__StrategyAssignment_3 )
            // InternalTrader.g:1307:3: rule__TradingBot__StrategyAssignment_3
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
    // InternalTrader.g:1315:1: rule__TradingBot__Group__4 : rule__TradingBot__Group__4__Impl rule__TradingBot__Group__5 ;
    public final void rule__TradingBot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1319:1: ( rule__TradingBot__Group__4__Impl rule__TradingBot__Group__5 )
            // InternalTrader.g:1320:2: rule__TradingBot__Group__4__Impl rule__TradingBot__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalTrader.g:1327:1: rule__TradingBot__Group__4__Impl : ( 'strategy' ) ;
    public final void rule__TradingBot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1331:1: ( ( 'strategy' ) )
            // InternalTrader.g:1332:1: ( 'strategy' )
            {
            // InternalTrader.g:1332:1: ( 'strategy' )
            // InternalTrader.g:1333:2: 'strategy'
            {
             before(grammarAccess.getTradingBotAccess().getStrategyKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getStrategyKeyword_4()); 

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
    // InternalTrader.g:1342:1: rule__TradingBot__Group__5 : rule__TradingBot__Group__5__Impl rule__TradingBot__Group__6 ;
    public final void rule__TradingBot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1346:1: ( rule__TradingBot__Group__5__Impl rule__TradingBot__Group__6 )
            // InternalTrader.g:1347:2: rule__TradingBot__Group__5__Impl rule__TradingBot__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalTrader.g:1354:1: rule__TradingBot__Group__5__Impl : ( 'using' ) ;
    public final void rule__TradingBot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1358:1: ( ( 'using' ) )
            // InternalTrader.g:1359:1: ( 'using' )
            {
            // InternalTrader.g:1359:1: ( 'using' )
            // InternalTrader.g:1360:2: 'using'
            {
             before(grammarAccess.getTradingBotAccess().getUsingKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getUsingKeyword_5()); 

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
    // InternalTrader.g:1369:1: rule__TradingBot__Group__6 : rule__TradingBot__Group__6__Impl rule__TradingBot__Group__7 ;
    public final void rule__TradingBot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1373:1: ( rule__TradingBot__Group__6__Impl rule__TradingBot__Group__7 )
            // InternalTrader.g:1374:2: rule__TradingBot__Group__6__Impl rule__TradingBot__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalTrader.g:1381:1: rule__TradingBot__Group__6__Impl : ( ( rule__TradingBot__FundsAssignment_6 ) ) ;
    public final void rule__TradingBot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1385:1: ( ( ( rule__TradingBot__FundsAssignment_6 ) ) )
            // InternalTrader.g:1386:1: ( ( rule__TradingBot__FundsAssignment_6 ) )
            {
            // InternalTrader.g:1386:1: ( ( rule__TradingBot__FundsAssignment_6 ) )
            // InternalTrader.g:1387:2: ( rule__TradingBot__FundsAssignment_6 )
            {
             before(grammarAccess.getTradingBotAccess().getFundsAssignment_6()); 
            // InternalTrader.g:1388:2: ( rule__TradingBot__FundsAssignment_6 )
            // InternalTrader.g:1388:3: rule__TradingBot__FundsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__TradingBot__FundsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTradingBotAccess().getFundsAssignment_6()); 

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
    // InternalTrader.g:1396:1: rule__TradingBot__Group__7 : rule__TradingBot__Group__7__Impl rule__TradingBot__Group__8 ;
    public final void rule__TradingBot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1400:1: ( rule__TradingBot__Group__7__Impl rule__TradingBot__Group__8 )
            // InternalTrader.g:1401:2: rule__TradingBot__Group__7__Impl rule__TradingBot__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__TradingBot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TradingBot__Group__8();

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
    // InternalTrader.g:1408:1: rule__TradingBot__Group__7__Impl : ( 'from' ) ;
    public final void rule__TradingBot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1412:1: ( ( 'from' ) )
            // InternalTrader.g:1413:1: ( 'from' )
            {
            // InternalTrader.g:1413:1: ( 'from' )
            // InternalTrader.g:1414:2: 'from'
            {
             before(grammarAccess.getTradingBotAccess().getFromKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getFromKeyword_7()); 

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


    // $ANTLR start "rule__TradingBot__Group__8"
    // InternalTrader.g:1423:1: rule__TradingBot__Group__8 : rule__TradingBot__Group__8__Impl ;
    public final void rule__TradingBot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1427:1: ( rule__TradingBot__Group__8__Impl )
            // InternalTrader.g:1428:2: rule__TradingBot__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TradingBot__Group__8__Impl();

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
    // $ANTLR end "rule__TradingBot__Group__8"


    // $ANTLR start "rule__TradingBot__Group__8__Impl"
    // InternalTrader.g:1434:1: rule__TradingBot__Group__8__Impl : ( 'money' ) ;
    public final void rule__TradingBot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1438:1: ( ( 'money' ) )
            // InternalTrader.g:1439:1: ( 'money' )
            {
            // InternalTrader.g:1439:1: ( 'money' )
            // InternalTrader.g:1440:2: 'money'
            {
             before(grammarAccess.getTradingBotAccess().getMoneyKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getMoneyKeyword_8()); 

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
    // $ANTLR end "rule__TradingBot__Group__8__Impl"


    // $ANTLR start "rule__ListBots__Group__0"
    // InternalTrader.g:1450:1: rule__ListBots__Group__0 : rule__ListBots__Group__0__Impl rule__ListBots__Group__1 ;
    public final void rule__ListBots__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1454:1: ( rule__ListBots__Group__0__Impl rule__ListBots__Group__1 )
            // InternalTrader.g:1455:2: rule__ListBots__Group__0__Impl rule__ListBots__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ListBots__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListBots__Group__1();

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
    // $ANTLR end "rule__ListBots__Group__0"


    // $ANTLR start "rule__ListBots__Group__0__Impl"
    // InternalTrader.g:1462:1: rule__ListBots__Group__0__Impl : ( ( rule__ListBots__ListCommandAssignment_0 ) ) ;
    public final void rule__ListBots__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1466:1: ( ( ( rule__ListBots__ListCommandAssignment_0 ) ) )
            // InternalTrader.g:1467:1: ( ( rule__ListBots__ListCommandAssignment_0 ) )
            {
            // InternalTrader.g:1467:1: ( ( rule__ListBots__ListCommandAssignment_0 ) )
            // InternalTrader.g:1468:2: ( rule__ListBots__ListCommandAssignment_0 )
            {
             before(grammarAccess.getListBotsAccess().getListCommandAssignment_0()); 
            // InternalTrader.g:1469:2: ( rule__ListBots__ListCommandAssignment_0 )
            // InternalTrader.g:1469:3: rule__ListBots__ListCommandAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListBots__ListCommandAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListBotsAccess().getListCommandAssignment_0()); 

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
    // $ANTLR end "rule__ListBots__Group__0__Impl"


    // $ANTLR start "rule__ListBots__Group__1"
    // InternalTrader.g:1477:1: rule__ListBots__Group__1 : rule__ListBots__Group__1__Impl rule__ListBots__Group__2 ;
    public final void rule__ListBots__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1481:1: ( rule__ListBots__Group__1__Impl rule__ListBots__Group__2 )
            // InternalTrader.g:1482:2: rule__ListBots__Group__1__Impl rule__ListBots__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ListBots__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListBots__Group__2();

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
    // $ANTLR end "rule__ListBots__Group__1"


    // $ANTLR start "rule__ListBots__Group__1__Impl"
    // InternalTrader.g:1489:1: rule__ListBots__Group__1__Impl : ( 'registered' ) ;
    public final void rule__ListBots__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1493:1: ( ( 'registered' ) )
            // InternalTrader.g:1494:1: ( 'registered' )
            {
            // InternalTrader.g:1494:1: ( 'registered' )
            // InternalTrader.g:1495:2: 'registered'
            {
             before(grammarAccess.getListBotsAccess().getRegisteredKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getListBotsAccess().getRegisteredKeyword_1()); 

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
    // $ANTLR end "rule__ListBots__Group__1__Impl"


    // $ANTLR start "rule__ListBots__Group__2"
    // InternalTrader.g:1504:1: rule__ListBots__Group__2 : rule__ListBots__Group__2__Impl ;
    public final void rule__ListBots__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1508:1: ( rule__ListBots__Group__2__Impl )
            // InternalTrader.g:1509:2: rule__ListBots__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListBots__Group__2__Impl();

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
    // $ANTLR end "rule__ListBots__Group__2"


    // $ANTLR start "rule__ListBots__Group__2__Impl"
    // InternalTrader.g:1515:1: rule__ListBots__Group__2__Impl : ( 'bots' ) ;
    public final void rule__ListBots__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1519:1: ( ( 'bots' ) )
            // InternalTrader.g:1520:1: ( 'bots' )
            {
            // InternalTrader.g:1520:1: ( 'bots' )
            // InternalTrader.g:1521:2: 'bots'
            {
             before(grammarAccess.getListBotsAccess().getBotsKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getListBotsAccess().getBotsKeyword_2()); 

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
    // $ANTLR end "rule__ListBots__Group__2__Impl"


    // $ANTLR start "rule__Execute__Group__0"
    // InternalTrader.g:1531:1: rule__Execute__Group__0 : rule__Execute__Group__0__Impl rule__Execute__Group__1 ;
    public final void rule__Execute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1535:1: ( rule__Execute__Group__0__Impl rule__Execute__Group__1 )
            // InternalTrader.g:1536:2: rule__Execute__Group__0__Impl rule__Execute__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalTrader.g:1543:1: rule__Execute__Group__0__Impl : ( ( rule__Execute__ExecuteCommandAssignment_0 ) ) ;
    public final void rule__Execute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1547:1: ( ( ( rule__Execute__ExecuteCommandAssignment_0 ) ) )
            // InternalTrader.g:1548:1: ( ( rule__Execute__ExecuteCommandAssignment_0 ) )
            {
            // InternalTrader.g:1548:1: ( ( rule__Execute__ExecuteCommandAssignment_0 ) )
            // InternalTrader.g:1549:2: ( rule__Execute__ExecuteCommandAssignment_0 )
            {
             before(grammarAccess.getExecuteAccess().getExecuteCommandAssignment_0()); 
            // InternalTrader.g:1550:2: ( rule__Execute__ExecuteCommandAssignment_0 )
            // InternalTrader.g:1550:3: rule__Execute__ExecuteCommandAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Execute__ExecuteCommandAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExecuteAccess().getExecuteCommandAssignment_0()); 

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
    // InternalTrader.g:1558:1: rule__Execute__Group__1 : rule__Execute__Group__1__Impl ;
    public final void rule__Execute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1562:1: ( rule__Execute__Group__1__Impl )
            // InternalTrader.g:1563:2: rule__Execute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Execute__Group__1__Impl();

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
    // InternalTrader.g:1569:1: rule__Execute__Group__1__Impl : ( 'bots' ) ;
    public final void rule__Execute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1573:1: ( ( 'bots' ) )
            // InternalTrader.g:1574:1: ( 'bots' )
            {
            // InternalTrader.g:1574:1: ( 'bots' )
            // InternalTrader.g:1575:2: 'bots'
            {
             before(grammarAccess.getExecuteAccess().getBotsKeyword_1()); 
            match(input,33,FOLLOW_2); 
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


    // $ANTLR start "rule__Stop__Group__0"
    // InternalTrader.g:1585:1: rule__Stop__Group__0 : rule__Stop__Group__0__Impl rule__Stop__Group__1 ;
    public final void rule__Stop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1589:1: ( rule__Stop__Group__0__Impl rule__Stop__Group__1 )
            // InternalTrader.g:1590:2: rule__Stop__Group__0__Impl rule__Stop__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Stop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stop__Group__1();

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
    // $ANTLR end "rule__Stop__Group__0"


    // $ANTLR start "rule__Stop__Group__0__Impl"
    // InternalTrader.g:1597:1: rule__Stop__Group__0__Impl : ( ( rule__Stop__StopCommandAssignment_0 ) ) ;
    public final void rule__Stop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1601:1: ( ( ( rule__Stop__StopCommandAssignment_0 ) ) )
            // InternalTrader.g:1602:1: ( ( rule__Stop__StopCommandAssignment_0 ) )
            {
            // InternalTrader.g:1602:1: ( ( rule__Stop__StopCommandAssignment_0 ) )
            // InternalTrader.g:1603:2: ( rule__Stop__StopCommandAssignment_0 )
            {
             before(grammarAccess.getStopAccess().getStopCommandAssignment_0()); 
            // InternalTrader.g:1604:2: ( rule__Stop__StopCommandAssignment_0 )
            // InternalTrader.g:1604:3: rule__Stop__StopCommandAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Stop__StopCommandAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStopAccess().getStopCommandAssignment_0()); 

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
    // $ANTLR end "rule__Stop__Group__0__Impl"


    // $ANTLR start "rule__Stop__Group__1"
    // InternalTrader.g:1612:1: rule__Stop__Group__1 : rule__Stop__Group__1__Impl ;
    public final void rule__Stop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1616:1: ( rule__Stop__Group__1__Impl )
            // InternalTrader.g:1617:2: rule__Stop__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stop__Group__1__Impl();

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
    // $ANTLR end "rule__Stop__Group__1"


    // $ANTLR start "rule__Stop__Group__1__Impl"
    // InternalTrader.g:1623:1: rule__Stop__Group__1__Impl : ( 'bots' ) ;
    public final void rule__Stop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1627:1: ( ( 'bots' ) )
            // InternalTrader.g:1628:1: ( 'bots' )
            {
            // InternalTrader.g:1628:1: ( 'bots' )
            // InternalTrader.g:1629:2: 'bots'
            {
             before(grammarAccess.getStopAccess().getBotsKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStopAccess().getBotsKeyword_1()); 

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
    // $ANTLR end "rule__Stop__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalTrader.g:1639:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1643:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalTrader.g:1644:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalTrader.g:1651:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1655:1: ( ( 'var' ) )
            // InternalTrader.g:1656:1: ( 'var' )
            {
            // InternalTrader.g:1656:1: ( 'var' )
            // InternalTrader.g:1657:2: 'var'
            {
             before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalTrader.g:1666:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1670:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalTrader.g:1671:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalTrader.g:1678:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1682:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalTrader.g:1683:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalTrader.g:1683:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalTrader.g:1684:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalTrader.g:1685:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalTrader.g:1685:3: rule__VariableDeclaration__NameAssignment_1
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
    // InternalTrader.g:1693:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1697:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalTrader.g:1698:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalTrader.g:1705:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1709:1: ( ( '=' ) )
            // InternalTrader.g:1710:1: ( '=' )
            {
            // InternalTrader.g:1710:1: ( '=' )
            // InternalTrader.g:1711:2: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalTrader.g:1720:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1724:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalTrader.g:1725:2: rule__VariableDeclaration__Group__3__Impl
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
    // InternalTrader.g:1731:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1735:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) )
            // InternalTrader.g:1736:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            {
            // InternalTrader.g:1736:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            // InternalTrader.g:1737:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
            // InternalTrader.g:1738:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            // InternalTrader.g:1738:3: rule__VariableDeclaration__ValueAssignment_3
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
    // InternalTrader.g:1747:1: rule__LoopStatement__Group__0 : rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 ;
    public final void rule__LoopStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1751:1: ( rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 )
            // InternalTrader.g:1752:2: rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalTrader.g:1759:1: rule__LoopStatement__Group__0__Impl : ( ( rule__LoopStatement__CountAssignment_0 ) ) ;
    public final void rule__LoopStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1763:1: ( ( ( rule__LoopStatement__CountAssignment_0 ) ) )
            // InternalTrader.g:1764:1: ( ( rule__LoopStatement__CountAssignment_0 ) )
            {
            // InternalTrader.g:1764:1: ( ( rule__LoopStatement__CountAssignment_0 ) )
            // InternalTrader.g:1765:2: ( rule__LoopStatement__CountAssignment_0 )
            {
             before(grammarAccess.getLoopStatementAccess().getCountAssignment_0()); 
            // InternalTrader.g:1766:2: ( rule__LoopStatement__CountAssignment_0 )
            // InternalTrader.g:1766:3: rule__LoopStatement__CountAssignment_0
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
    // InternalTrader.g:1774:1: rule__LoopStatement__Group__1 : rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2 ;
    public final void rule__LoopStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1778:1: ( rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2 )
            // InternalTrader.g:1779:2: rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalTrader.g:1786:1: rule__LoopStatement__Group__1__Impl : ( 'times' ) ;
    public final void rule__LoopStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1790:1: ( ( 'times' ) )
            // InternalTrader.g:1791:1: ( 'times' )
            {
            // InternalTrader.g:1791:1: ( 'times' )
            // InternalTrader.g:1792:2: 'times'
            {
             before(grammarAccess.getLoopStatementAccess().getTimesKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalTrader.g:1801:1: rule__LoopStatement__Group__2 : rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3 ;
    public final void rule__LoopStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1805:1: ( rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3 )
            // InternalTrader.g:1806:2: rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalTrader.g:1813:1: rule__LoopStatement__Group__2__Impl : ( 'do' ) ;
    public final void rule__LoopStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1817:1: ( ( 'do' ) )
            // InternalTrader.g:1818:1: ( 'do' )
            {
            // InternalTrader.g:1818:1: ( 'do' )
            // InternalTrader.g:1819:2: 'do'
            {
             before(grammarAccess.getLoopStatementAccess().getDoKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalTrader.g:1828:1: rule__LoopStatement__Group__3 : rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4 ;
    public final void rule__LoopStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1832:1: ( rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4 )
            // InternalTrader.g:1833:2: rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalTrader.g:1840:1: rule__LoopStatement__Group__3__Impl : ( ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* ) ) ;
    public final void rule__LoopStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1844:1: ( ( ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* ) ) )
            // InternalTrader.g:1845:1: ( ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* ) )
            {
            // InternalTrader.g:1845:1: ( ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* ) )
            // InternalTrader.g:1846:2: ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* )
            {
            // InternalTrader.g:1846:2: ( ( rule__LoopStatement__StatementsAssignment_3 ) )
            // InternalTrader.g:1847:3: ( rule__LoopStatement__StatementsAssignment_3 )
            {
             before(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3()); 
            // InternalTrader.g:1848:3: ( rule__LoopStatement__StatementsAssignment_3 )
            // InternalTrader.g:1848:4: rule__LoopStatement__StatementsAssignment_3
            {
            pushFollow(FOLLOW_3);
            rule__LoopStatement__StatementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3()); 

            }

            // InternalTrader.g:1851:2: ( ( rule__LoopStatement__StatementsAssignment_3 )* )
            // InternalTrader.g:1852:3: ( rule__LoopStatement__StatementsAssignment_3 )*
            {
             before(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3()); 
            // InternalTrader.g:1853:3: ( rule__LoopStatement__StatementsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_ID)||LA8_0==17||LA8_0==27||LA8_0==34||LA8_0==40||(LA8_0>=46 && LA8_0<=48)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTrader.g:1853:4: rule__LoopStatement__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__LoopStatement__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalTrader.g:1862:1: rule__LoopStatement__Group__4 : rule__LoopStatement__Group__4__Impl ;
    public final void rule__LoopStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1866:1: ( rule__LoopStatement__Group__4__Impl )
            // InternalTrader.g:1867:2: rule__LoopStatement__Group__4__Impl
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
    // InternalTrader.g:1873:1: rule__LoopStatement__Group__4__Impl : ( 'end' ) ;
    public final void rule__LoopStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1877:1: ( ( 'end' ) )
            // InternalTrader.g:1878:1: ( 'end' )
            {
            // InternalTrader.g:1878:1: ( 'end' )
            // InternalTrader.g:1879:2: 'end'
            {
             before(grammarAccess.getLoopStatementAccess().getEndKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTrader.g:1889:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1893:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalTrader.g:1894:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalTrader.g:1901:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1905:1: ( ( ( RULE_INT )? ) )
            // InternalTrader.g:1906:1: ( ( RULE_INT )? )
            {
            // InternalTrader.g:1906:1: ( ( RULE_INT )? )
            // InternalTrader.g:1907:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalTrader.g:1908:2: ( RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTrader.g:1908:3: RULE_INT
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
    // InternalTrader.g:1916:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1920:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalTrader.g:1921:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalTrader.g:1928:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1932:1: ( ( '.' ) )
            // InternalTrader.g:1933:1: ( '.' )
            {
            // InternalTrader.g:1933:1: ( '.' )
            // InternalTrader.g:1934:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalTrader.g:1943:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1947:1: ( rule__REAL__Group__2__Impl )
            // InternalTrader.g:1948:2: rule__REAL__Group__2__Impl
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
    // InternalTrader.g:1954:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1958:1: ( ( RULE_INT ) )
            // InternalTrader.g:1959:1: ( RULE_INT )
            {
            // InternalTrader.g:1959:1: ( RULE_INT )
            // InternalTrader.g:1960:2: RULE_INT
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
    // InternalTrader.g:1970:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1974:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalTrader.g:1975:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalTrader.g:1982:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1986:1: ( ( ruleMultiplication ) )
            // InternalTrader.g:1987:1: ( ruleMultiplication )
            {
            // InternalTrader.g:1987:1: ( ruleMultiplication )
            // InternalTrader.g:1988:2: ruleMultiplication
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
    // InternalTrader.g:1997:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2001:1: ( rule__Addition__Group__1__Impl )
            // InternalTrader.g:2002:2: rule__Addition__Group__1__Impl
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
    // InternalTrader.g:2008:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2012:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalTrader.g:2013:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalTrader.g:2013:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalTrader.g:2014:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalTrader.g:2015:2: ( rule__Addition__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=11 && LA10_0<=12)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTrader.g:2015:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalTrader.g:2024:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2028:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalTrader.g:2029:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalTrader.g:2036:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2040:1: ( ( () ) )
            // InternalTrader.g:2041:1: ( () )
            {
            // InternalTrader.g:2041:1: ( () )
            // InternalTrader.g:2042:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalTrader.g:2043:2: ()
            // InternalTrader.g:2043:3: 
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
    // InternalTrader.g:2051:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2055:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalTrader.g:2056:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalTrader.g:2063:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2067:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalTrader.g:2068:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalTrader.g:2068:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalTrader.g:2069:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalTrader.g:2070:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalTrader.g:2070:3: rule__Addition__OperatorAssignment_1_1
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
    // InternalTrader.g:2078:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2082:1: ( rule__Addition__Group_1__2__Impl )
            // InternalTrader.g:2083:2: rule__Addition__Group_1__2__Impl
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
    // InternalTrader.g:2089:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2093:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalTrader.g:2094:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalTrader.g:2094:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalTrader.g:2095:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalTrader.g:2096:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalTrader.g:2096:3: rule__Addition__RightAssignment_1_2
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
    // InternalTrader.g:2105:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2109:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalTrader.g:2110:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalTrader.g:2117:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2121:1: ( ( rulePrimary ) )
            // InternalTrader.g:2122:1: ( rulePrimary )
            {
            // InternalTrader.g:2122:1: ( rulePrimary )
            // InternalTrader.g:2123:2: rulePrimary
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
    // InternalTrader.g:2132:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2136:1: ( rule__Multiplication__Group__1__Impl )
            // InternalTrader.g:2137:2: rule__Multiplication__Group__1__Impl
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
    // InternalTrader.g:2143:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2147:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalTrader.g:2148:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalTrader.g:2148:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalTrader.g:2149:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalTrader.g:2150:2: ( rule__Multiplication__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=13 && LA11_0<=14)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTrader.g:2150:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalTrader.g:2159:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2163:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalTrader.g:2164:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalTrader.g:2171:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2175:1: ( ( () ) )
            // InternalTrader.g:2176:1: ( () )
            {
            // InternalTrader.g:2176:1: ( () )
            // InternalTrader.g:2177:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalTrader.g:2178:2: ()
            // InternalTrader.g:2178:3: 
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
    // InternalTrader.g:2186:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2190:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalTrader.g:2191:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalTrader.g:2198:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2202:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalTrader.g:2203:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalTrader.g:2203:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalTrader.g:2204:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalTrader.g:2205:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalTrader.g:2205:3: rule__Multiplication__OperatorAssignment_1_1
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
    // InternalTrader.g:2213:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2217:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalTrader.g:2218:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalTrader.g:2224:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2228:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalTrader.g:2229:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalTrader.g:2229:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalTrader.g:2230:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalTrader.g:2231:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalTrader.g:2231:3: rule__Multiplication__RightAssignment_1_2
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
    // InternalTrader.g:2240:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2244:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalTrader.g:2245:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalTrader.g:2252:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2256:1: ( ( '(' ) )
            // InternalTrader.g:2257:1: ( '(' )
            {
            // InternalTrader.g:2257:1: ( '(' )
            // InternalTrader.g:2258:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalTrader.g:2267:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2271:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalTrader.g:2272:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalTrader.g:2279:1: rule__Primary__Group_2__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2283:1: ( ( ruleAddition ) )
            // InternalTrader.g:2284:1: ( ruleAddition )
            {
            // InternalTrader.g:2284:1: ( ruleAddition )
            // InternalTrader.g:2285:2: ruleAddition
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
    // InternalTrader.g:2294:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2298:1: ( rule__Primary__Group_2__2__Impl )
            // InternalTrader.g:2299:2: rule__Primary__Group_2__2__Impl
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
    // InternalTrader.g:2305:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2309:1: ( ( ')' ) )
            // InternalTrader.g:2310:1: ( ')' )
            {
            // InternalTrader.g:2310:1: ( ')' )
            // InternalTrader.g:2311:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalTrader.g:2321:1: rule__Buy__Group__0 : rule__Buy__Group__0__Impl rule__Buy__Group__1 ;
    public final void rule__Buy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2325:1: ( rule__Buy__Group__0__Impl rule__Buy__Group__1 )
            // InternalTrader.g:2326:2: rule__Buy__Group__0__Impl rule__Buy__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalTrader.g:2333:1: rule__Buy__Group__0__Impl : ( 'buy' ) ;
    public final void rule__Buy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2337:1: ( ( 'buy' ) )
            // InternalTrader.g:2338:1: ( 'buy' )
            {
            // InternalTrader.g:2338:1: ( 'buy' )
            // InternalTrader.g:2339:2: 'buy'
            {
             before(grammarAccess.getBuyAccess().getBuyKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalTrader.g:2348:1: rule__Buy__Group__1 : rule__Buy__Group__1__Impl rule__Buy__Group__2 ;
    public final void rule__Buy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2352:1: ( rule__Buy__Group__1__Impl rule__Buy__Group__2 )
            // InternalTrader.g:2353:2: rule__Buy__Group__1__Impl rule__Buy__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalTrader.g:2360:1: rule__Buy__Group__1__Impl : ( ( rule__Buy__QuantityAssignment_1 ) ) ;
    public final void rule__Buy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2364:1: ( ( ( rule__Buy__QuantityAssignment_1 ) ) )
            // InternalTrader.g:2365:1: ( ( rule__Buy__QuantityAssignment_1 ) )
            {
            // InternalTrader.g:2365:1: ( ( rule__Buy__QuantityAssignment_1 ) )
            // InternalTrader.g:2366:2: ( rule__Buy__QuantityAssignment_1 )
            {
             before(grammarAccess.getBuyAccess().getQuantityAssignment_1()); 
            // InternalTrader.g:2367:2: ( rule__Buy__QuantityAssignment_1 )
            // InternalTrader.g:2367:3: rule__Buy__QuantityAssignment_1
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
    // InternalTrader.g:2375:1: rule__Buy__Group__2 : rule__Buy__Group__2__Impl rule__Buy__Group__3 ;
    public final void rule__Buy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2379:1: ( rule__Buy__Group__2__Impl rule__Buy__Group__3 )
            // InternalTrader.g:2380:2: rule__Buy__Group__2__Impl rule__Buy__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalTrader.g:2387:1: rule__Buy__Group__2__Impl : ( ( rule__Buy__TickerAssignment_2 ) ) ;
    public final void rule__Buy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2391:1: ( ( ( rule__Buy__TickerAssignment_2 ) ) )
            // InternalTrader.g:2392:1: ( ( rule__Buy__TickerAssignment_2 ) )
            {
            // InternalTrader.g:2392:1: ( ( rule__Buy__TickerAssignment_2 ) )
            // InternalTrader.g:2393:2: ( rule__Buy__TickerAssignment_2 )
            {
             before(grammarAccess.getBuyAccess().getTickerAssignment_2()); 
            // InternalTrader.g:2394:2: ( rule__Buy__TickerAssignment_2 )
            // InternalTrader.g:2394:3: rule__Buy__TickerAssignment_2
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
    // InternalTrader.g:2402:1: rule__Buy__Group__3 : rule__Buy__Group__3__Impl rule__Buy__Group__4 ;
    public final void rule__Buy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2406:1: ( rule__Buy__Group__3__Impl rule__Buy__Group__4 )
            // InternalTrader.g:2407:2: rule__Buy__Group__3__Impl rule__Buy__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalTrader.g:2414:1: rule__Buy__Group__3__Impl : ( 'at' ) ;
    public final void rule__Buy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2418:1: ( ( 'at' ) )
            // InternalTrader.g:2419:1: ( 'at' )
            {
            // InternalTrader.g:2419:1: ( 'at' )
            // InternalTrader.g:2420:2: 'at'
            {
             before(grammarAccess.getBuyAccess().getAtKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalTrader.g:2429:1: rule__Buy__Group__4 : rule__Buy__Group__4__Impl rule__Buy__Group__5 ;
    public final void rule__Buy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2433:1: ( rule__Buy__Group__4__Impl rule__Buy__Group__5 )
            // InternalTrader.g:2434:2: rule__Buy__Group__4__Impl rule__Buy__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalTrader.g:2441:1: rule__Buy__Group__4__Impl : ( 'price' ) ;
    public final void rule__Buy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2445:1: ( ( 'price' ) )
            // InternalTrader.g:2446:1: ( 'price' )
            {
            // InternalTrader.g:2446:1: ( 'price' )
            // InternalTrader.g:2447:2: 'price'
            {
             before(grammarAccess.getBuyAccess().getPriceKeyword_4()); 
            match(input,44,FOLLOW_2); 
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
    // InternalTrader.g:2456:1: rule__Buy__Group__5 : rule__Buy__Group__5__Impl ;
    public final void rule__Buy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2460:1: ( rule__Buy__Group__5__Impl )
            // InternalTrader.g:2461:2: rule__Buy__Group__5__Impl
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
    // InternalTrader.g:2467:1: rule__Buy__Group__5__Impl : ( ( rule__Buy__PriceAssignment_5 ) ) ;
    public final void rule__Buy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2471:1: ( ( ( rule__Buy__PriceAssignment_5 ) ) )
            // InternalTrader.g:2472:1: ( ( rule__Buy__PriceAssignment_5 ) )
            {
            // InternalTrader.g:2472:1: ( ( rule__Buy__PriceAssignment_5 ) )
            // InternalTrader.g:2473:2: ( rule__Buy__PriceAssignment_5 )
            {
             before(grammarAccess.getBuyAccess().getPriceAssignment_5()); 
            // InternalTrader.g:2474:2: ( rule__Buy__PriceAssignment_5 )
            // InternalTrader.g:2474:3: rule__Buy__PriceAssignment_5
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
    // InternalTrader.g:2483:1: rule__Sell__Group__0 : rule__Sell__Group__0__Impl rule__Sell__Group__1 ;
    public final void rule__Sell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2487:1: ( rule__Sell__Group__0__Impl rule__Sell__Group__1 )
            // InternalTrader.g:2488:2: rule__Sell__Group__0__Impl rule__Sell__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalTrader.g:2495:1: rule__Sell__Group__0__Impl : ( 'sell' ) ;
    public final void rule__Sell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2499:1: ( ( 'sell' ) )
            // InternalTrader.g:2500:1: ( 'sell' )
            {
            // InternalTrader.g:2500:1: ( 'sell' )
            // InternalTrader.g:2501:2: 'sell'
            {
             before(grammarAccess.getSellAccess().getSellKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalTrader.g:2510:1: rule__Sell__Group__1 : rule__Sell__Group__1__Impl rule__Sell__Group__2 ;
    public final void rule__Sell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2514:1: ( rule__Sell__Group__1__Impl rule__Sell__Group__2 )
            // InternalTrader.g:2515:2: rule__Sell__Group__1__Impl rule__Sell__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalTrader.g:2522:1: rule__Sell__Group__1__Impl : ( ( rule__Sell__QuantityAssignment_1 ) ) ;
    public final void rule__Sell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2526:1: ( ( ( rule__Sell__QuantityAssignment_1 ) ) )
            // InternalTrader.g:2527:1: ( ( rule__Sell__QuantityAssignment_1 ) )
            {
            // InternalTrader.g:2527:1: ( ( rule__Sell__QuantityAssignment_1 ) )
            // InternalTrader.g:2528:2: ( rule__Sell__QuantityAssignment_1 )
            {
             before(grammarAccess.getSellAccess().getQuantityAssignment_1()); 
            // InternalTrader.g:2529:2: ( rule__Sell__QuantityAssignment_1 )
            // InternalTrader.g:2529:3: rule__Sell__QuantityAssignment_1
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
    // InternalTrader.g:2537:1: rule__Sell__Group__2 : rule__Sell__Group__2__Impl rule__Sell__Group__3 ;
    public final void rule__Sell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2541:1: ( rule__Sell__Group__2__Impl rule__Sell__Group__3 )
            // InternalTrader.g:2542:2: rule__Sell__Group__2__Impl rule__Sell__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalTrader.g:2549:1: rule__Sell__Group__2__Impl : ( ( rule__Sell__TickerAssignment_2 ) ) ;
    public final void rule__Sell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2553:1: ( ( ( rule__Sell__TickerAssignment_2 ) ) )
            // InternalTrader.g:2554:1: ( ( rule__Sell__TickerAssignment_2 ) )
            {
            // InternalTrader.g:2554:1: ( ( rule__Sell__TickerAssignment_2 ) )
            // InternalTrader.g:2555:2: ( rule__Sell__TickerAssignment_2 )
            {
             before(grammarAccess.getSellAccess().getTickerAssignment_2()); 
            // InternalTrader.g:2556:2: ( rule__Sell__TickerAssignment_2 )
            // InternalTrader.g:2556:3: rule__Sell__TickerAssignment_2
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
    // InternalTrader.g:2564:1: rule__Sell__Group__3 : rule__Sell__Group__3__Impl rule__Sell__Group__4 ;
    public final void rule__Sell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2568:1: ( rule__Sell__Group__3__Impl rule__Sell__Group__4 )
            // InternalTrader.g:2569:2: rule__Sell__Group__3__Impl rule__Sell__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalTrader.g:2576:1: rule__Sell__Group__3__Impl : ( 'at' ) ;
    public final void rule__Sell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2580:1: ( ( 'at' ) )
            // InternalTrader.g:2581:1: ( 'at' )
            {
            // InternalTrader.g:2581:1: ( 'at' )
            // InternalTrader.g:2582:2: 'at'
            {
             before(grammarAccess.getSellAccess().getAtKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalTrader.g:2591:1: rule__Sell__Group__4 : rule__Sell__Group__4__Impl rule__Sell__Group__5 ;
    public final void rule__Sell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2595:1: ( rule__Sell__Group__4__Impl rule__Sell__Group__5 )
            // InternalTrader.g:2596:2: rule__Sell__Group__4__Impl rule__Sell__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalTrader.g:2603:1: rule__Sell__Group__4__Impl : ( 'price' ) ;
    public final void rule__Sell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2607:1: ( ( 'price' ) )
            // InternalTrader.g:2608:1: ( 'price' )
            {
            // InternalTrader.g:2608:1: ( 'price' )
            // InternalTrader.g:2609:2: 'price'
            {
             before(grammarAccess.getSellAccess().getPriceKeyword_4()); 
            match(input,44,FOLLOW_2); 
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
    // InternalTrader.g:2618:1: rule__Sell__Group__5 : rule__Sell__Group__5__Impl ;
    public final void rule__Sell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2622:1: ( rule__Sell__Group__5__Impl )
            // InternalTrader.g:2623:2: rule__Sell__Group__5__Impl
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
    // InternalTrader.g:2629:1: rule__Sell__Group__5__Impl : ( ( rule__Sell__PriceAssignment_5 ) ) ;
    public final void rule__Sell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2633:1: ( ( ( rule__Sell__PriceAssignment_5 ) ) )
            // InternalTrader.g:2634:1: ( ( rule__Sell__PriceAssignment_5 ) )
            {
            // InternalTrader.g:2634:1: ( ( rule__Sell__PriceAssignment_5 ) )
            // InternalTrader.g:2635:2: ( rule__Sell__PriceAssignment_5 )
            {
             before(grammarAccess.getSellAccess().getPriceAssignment_5()); 
            // InternalTrader.g:2636:2: ( rule__Sell__PriceAssignment_5 )
            // InternalTrader.g:2636:3: rule__Sell__PriceAssignment_5
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
    // InternalTrader.g:2645:1: rule__TraderProgram__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__TraderProgram__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2649:1: ( ( ruleStatement ) )
            // InternalTrader.g:2650:2: ( ruleStatement )
            {
            // InternalTrader.g:2650:2: ( ruleStatement )
            // InternalTrader.g:2651:3: ruleStatement
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


    // $ANTLR start "rule__Connect__BrokerNameAssignment_3"
    // InternalTrader.g:2660:1: rule__Connect__BrokerNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Connect__BrokerNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2664:1: ( ( RULE_ID ) )
            // InternalTrader.g:2665:2: ( RULE_ID )
            {
            // InternalTrader.g:2665:2: ( RULE_ID )
            // InternalTrader.g:2666:3: RULE_ID
            {
             before(grammarAccess.getConnectAccess().getBrokerNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectAccess().getBrokerNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Connect__BrokerNameAssignment_3"


    // $ANTLR start "rule__Connect__ParametersAssignment_5"
    // InternalTrader.g:2675:1: rule__Connect__ParametersAssignment_5 : ( ruleConnectParameters ) ;
    public final void rule__Connect__ParametersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2679:1: ( ( ruleConnectParameters ) )
            // InternalTrader.g:2680:2: ( ruleConnectParameters )
            {
            // InternalTrader.g:2680:2: ( ruleConnectParameters )
            // InternalTrader.g:2681:3: ruleConnectParameters
            {
             before(grammarAccess.getConnectAccess().getParametersConnectParametersParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleConnectParameters();

            state._fsp--;

             after(grammarAccess.getConnectAccess().getParametersConnectParametersParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Connect__ParametersAssignment_5"


    // $ANTLR start "rule__ConnectParameters__UsernameAssignment_1"
    // InternalTrader.g:2690:1: rule__ConnectParameters__UsernameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ConnectParameters__UsernameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2694:1: ( ( RULE_STRING ) )
            // InternalTrader.g:2695:2: ( RULE_STRING )
            {
            // InternalTrader.g:2695:2: ( RULE_STRING )
            // InternalTrader.g:2696:3: RULE_STRING
            {
             before(grammarAccess.getConnectParametersAccess().getUsernameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getUsernameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ConnectParameters__UsernameAssignment_1"


    // $ANTLR start "rule__ConnectParameters__PasswordAssignment_4"
    // InternalTrader.g:2705:1: rule__ConnectParameters__PasswordAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ConnectParameters__PasswordAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2709:1: ( ( RULE_STRING ) )
            // InternalTrader.g:2710:2: ( RULE_STRING )
            {
            // InternalTrader.g:2710:2: ( RULE_STRING )
            // InternalTrader.g:2711:3: RULE_STRING
            {
             before(grammarAccess.getConnectParametersAccess().getPasswordSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getPasswordSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__ConnectParameters__PasswordAssignment_4"


    // $ANTLR start "rule__ConnectParameters__LeverageAssignment_7"
    // InternalTrader.g:2720:1: rule__ConnectParameters__LeverageAssignment_7 : ( ruleREAL ) ;
    public final void rule__ConnectParameters__LeverageAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2724:1: ( ( ruleREAL ) )
            // InternalTrader.g:2725:2: ( ruleREAL )
            {
            // InternalTrader.g:2725:2: ( ruleREAL )
            // InternalTrader.g:2726:3: ruleREAL
            {
             before(grammarAccess.getConnectParametersAccess().getLeverageREALParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getConnectParametersAccess().getLeverageREALParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ConnectParameters__LeverageAssignment_7"


    // $ANTLR start "rule__ConnectParameters__MoneyAssignment_10"
    // InternalTrader.g:2735:1: rule__ConnectParameters__MoneyAssignment_10 : ( ruleREAL ) ;
    public final void rule__ConnectParameters__MoneyAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2739:1: ( ( ruleREAL ) )
            // InternalTrader.g:2740:2: ( ruleREAL )
            {
            // InternalTrader.g:2740:2: ( ruleREAL )
            // InternalTrader.g:2741:3: ruleREAL
            {
             before(grammarAccess.getConnectParametersAccess().getMoneyREALParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getConnectParametersAccess().getMoneyREALParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__ConnectParameters__MoneyAssignment_10"


    // $ANTLR start "rule__ConnectParameters__TimeframeAssignment_13"
    // InternalTrader.g:2750:1: rule__ConnectParameters__TimeframeAssignment_13 : ( RULE_STRING ) ;
    public final void rule__ConnectParameters__TimeframeAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2754:1: ( ( RULE_STRING ) )
            // InternalTrader.g:2755:2: ( RULE_STRING )
            {
            // InternalTrader.g:2755:2: ( RULE_STRING )
            // InternalTrader.g:2756:3: RULE_STRING
            {
             before(grammarAccess.getConnectParametersAccess().getTimeframeSTRINGTerminalRuleCall_13_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConnectParametersAccess().getTimeframeSTRINGTerminalRuleCall_13_0()); 

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
    // $ANTLR end "rule__ConnectParameters__TimeframeAssignment_13"


    // $ANTLR start "rule__TradingBot__StrategyAssignment_3"
    // InternalTrader.g:2765:1: rule__TradingBot__StrategyAssignment_3 : ( ruleStrategyDef ) ;
    public final void rule__TradingBot__StrategyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2769:1: ( ( ruleStrategyDef ) )
            // InternalTrader.g:2770:2: ( ruleStrategyDef )
            {
            // InternalTrader.g:2770:2: ( ruleStrategyDef )
            // InternalTrader.g:2771:3: ruleStrategyDef
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


    // $ANTLR start "rule__TradingBot__FundsAssignment_6"
    // InternalTrader.g:2780:1: rule__TradingBot__FundsAssignment_6 : ( ruleREAL ) ;
    public final void rule__TradingBot__FundsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2784:1: ( ( ruleREAL ) )
            // InternalTrader.g:2785:2: ( ruleREAL )
            {
            // InternalTrader.g:2785:2: ( ruleREAL )
            // InternalTrader.g:2786:3: ruleREAL
            {
             before(grammarAccess.getTradingBotAccess().getFundsREALParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getTradingBotAccess().getFundsREALParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__TradingBot__FundsAssignment_6"


    // $ANTLR start "rule__ListBots__ListCommandAssignment_0"
    // InternalTrader.g:2795:1: rule__ListBots__ListCommandAssignment_0 : ( ( 'see' ) ) ;
    public final void rule__ListBots__ListCommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2799:1: ( ( ( 'see' ) ) )
            // InternalTrader.g:2800:2: ( ( 'see' ) )
            {
            // InternalTrader.g:2800:2: ( ( 'see' ) )
            // InternalTrader.g:2801:3: ( 'see' )
            {
             before(grammarAccess.getListBotsAccess().getListCommandSeeKeyword_0_0()); 
            // InternalTrader.g:2802:3: ( 'see' )
            // InternalTrader.g:2803:4: 'see'
            {
             before(grammarAccess.getListBotsAccess().getListCommandSeeKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getListBotsAccess().getListCommandSeeKeyword_0_0()); 

            }

             after(grammarAccess.getListBotsAccess().getListCommandSeeKeyword_0_0()); 

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
    // $ANTLR end "rule__ListBots__ListCommandAssignment_0"


    // $ANTLR start "rule__Execute__ExecuteCommandAssignment_0"
    // InternalTrader.g:2814:1: rule__Execute__ExecuteCommandAssignment_0 : ( ( 'execute' ) ) ;
    public final void rule__Execute__ExecuteCommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2818:1: ( ( ( 'execute' ) ) )
            // InternalTrader.g:2819:2: ( ( 'execute' ) )
            {
            // InternalTrader.g:2819:2: ( ( 'execute' ) )
            // InternalTrader.g:2820:3: ( 'execute' )
            {
             before(grammarAccess.getExecuteAccess().getExecuteCommandExecuteKeyword_0_0()); 
            // InternalTrader.g:2821:3: ( 'execute' )
            // InternalTrader.g:2822:4: 'execute'
            {
             before(grammarAccess.getExecuteAccess().getExecuteCommandExecuteKeyword_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getExecuteAccess().getExecuteCommandExecuteKeyword_0_0()); 

            }

             after(grammarAccess.getExecuteAccess().getExecuteCommandExecuteKeyword_0_0()); 

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
    // $ANTLR end "rule__Execute__ExecuteCommandAssignment_0"


    // $ANTLR start "rule__Stop__StopCommandAssignment_0"
    // InternalTrader.g:2833:1: rule__Stop__StopCommandAssignment_0 : ( ( 'stop' ) ) ;
    public final void rule__Stop__StopCommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2837:1: ( ( ( 'stop' ) ) )
            // InternalTrader.g:2838:2: ( ( 'stop' ) )
            {
            // InternalTrader.g:2838:2: ( ( 'stop' ) )
            // InternalTrader.g:2839:3: ( 'stop' )
            {
             before(grammarAccess.getStopAccess().getStopCommandStopKeyword_0_0()); 
            // InternalTrader.g:2840:3: ( 'stop' )
            // InternalTrader.g:2841:4: 'stop'
            {
             before(grammarAccess.getStopAccess().getStopCommandStopKeyword_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getStopAccess().getStopCommandStopKeyword_0_0()); 

            }

             after(grammarAccess.getStopAccess().getStopCommandStopKeyword_0_0()); 

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
    // $ANTLR end "rule__Stop__StopCommandAssignment_0"


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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0001C10408020032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001C10408020030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L});

}