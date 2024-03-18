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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'buyAndHold'", "'meanReversion'", "'connect'", "'to'", "'broker'", "'with'", "'username'", "','", "'password'", "'leverage'", "'money'", "'timeframe'", "'create'", "'bot'", "'strategy'", "'using'", "'from'", "'registered'", "'bots'", "'var'", "'='", "'int'", "':'", "'String'", "'Real'", "'loop'", "'times'", "'do'", "'end'", "'.'", "'('", "')'", "'buy'", "'at'", "'price'", "'sell'", "'see'", "'execute'", "'stop'"
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

                if ( (LA1_0==17||LA1_0==27||LA1_0==34||LA1_0==40||(LA1_0>=51 && LA1_0<=53)) ) {
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
    // InternalTrader.g:262:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Alternatives ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:266:2: ( ( ( rule__VariableDeclaration__Alternatives ) ) )
            // InternalTrader.g:267:2: ( ( rule__VariableDeclaration__Alternatives ) )
            {
            // InternalTrader.g:267:2: ( ( rule__VariableDeclaration__Alternatives ) )
            // InternalTrader.g:268:3: ( rule__VariableDeclaration__Alternatives )
            {
             before(grammarAccess.getVariableDeclarationAccess().getAlternatives()); 
            // InternalTrader.g:269:3: ( rule__VariableDeclaration__Alternatives )
            // InternalTrader.g:269:4: rule__VariableDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleIntVariableDeclaration"
    // InternalTrader.g:278:1: entryRuleIntVariableDeclaration : ruleIntVariableDeclaration EOF ;
    public final void entryRuleIntVariableDeclaration() throws RecognitionException {
        try {
            // InternalTrader.g:279:1: ( ruleIntVariableDeclaration EOF )
            // InternalTrader.g:280:1: ruleIntVariableDeclaration EOF
            {
             before(grammarAccess.getIntVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleIntVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getIntVariableDeclarationRule()); 
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
    // $ANTLR end "entryRuleIntVariableDeclaration"


    // $ANTLR start "ruleIntVariableDeclaration"
    // InternalTrader.g:287:1: ruleIntVariableDeclaration : ( ( rule__IntVariableDeclaration__Group__0 ) ) ;
    public final void ruleIntVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:291:2: ( ( ( rule__IntVariableDeclaration__Group__0 ) ) )
            // InternalTrader.g:292:2: ( ( rule__IntVariableDeclaration__Group__0 ) )
            {
            // InternalTrader.g:292:2: ( ( rule__IntVariableDeclaration__Group__0 ) )
            // InternalTrader.g:293:3: ( rule__IntVariableDeclaration__Group__0 )
            {
             before(grammarAccess.getIntVariableDeclarationAccess().getGroup()); 
            // InternalTrader.g:294:3: ( rule__IntVariableDeclaration__Group__0 )
            // InternalTrader.g:294:4: rule__IntVariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntVariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntVariableDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleIntVariableDeclaration"


    // $ANTLR start "entryRuleStringVariableDeclaration"
    // InternalTrader.g:303:1: entryRuleStringVariableDeclaration : ruleStringVariableDeclaration EOF ;
    public final void entryRuleStringVariableDeclaration() throws RecognitionException {
        try {
            // InternalTrader.g:304:1: ( ruleStringVariableDeclaration EOF )
            // InternalTrader.g:305:1: ruleStringVariableDeclaration EOF
            {
             before(grammarAccess.getStringVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleStringVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getStringVariableDeclarationRule()); 
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
    // $ANTLR end "entryRuleStringVariableDeclaration"


    // $ANTLR start "ruleStringVariableDeclaration"
    // InternalTrader.g:312:1: ruleStringVariableDeclaration : ( ( rule__StringVariableDeclaration__Group__0 ) ) ;
    public final void ruleStringVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:316:2: ( ( ( rule__StringVariableDeclaration__Group__0 ) ) )
            // InternalTrader.g:317:2: ( ( rule__StringVariableDeclaration__Group__0 ) )
            {
            // InternalTrader.g:317:2: ( ( rule__StringVariableDeclaration__Group__0 ) )
            // InternalTrader.g:318:3: ( rule__StringVariableDeclaration__Group__0 )
            {
             before(grammarAccess.getStringVariableDeclarationAccess().getGroup()); 
            // InternalTrader.g:319:3: ( rule__StringVariableDeclaration__Group__0 )
            // InternalTrader.g:319:4: rule__StringVariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringVariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringVariableDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleStringVariableDeclaration"


    // $ANTLR start "entryRuleRealVariableDeclaration"
    // InternalTrader.g:328:1: entryRuleRealVariableDeclaration : ruleRealVariableDeclaration EOF ;
    public final void entryRuleRealVariableDeclaration() throws RecognitionException {
        try {
            // InternalTrader.g:329:1: ( ruleRealVariableDeclaration EOF )
            // InternalTrader.g:330:1: ruleRealVariableDeclaration EOF
            {
             before(grammarAccess.getRealVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleRealVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getRealVariableDeclarationRule()); 
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
    // $ANTLR end "entryRuleRealVariableDeclaration"


    // $ANTLR start "ruleRealVariableDeclaration"
    // InternalTrader.g:337:1: ruleRealVariableDeclaration : ( ( rule__RealVariableDeclaration__Group__0 ) ) ;
    public final void ruleRealVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:341:2: ( ( ( rule__RealVariableDeclaration__Group__0 ) ) )
            // InternalTrader.g:342:2: ( ( rule__RealVariableDeclaration__Group__0 ) )
            {
            // InternalTrader.g:342:2: ( ( rule__RealVariableDeclaration__Group__0 ) )
            // InternalTrader.g:343:3: ( rule__RealVariableDeclaration__Group__0 )
            {
             before(grammarAccess.getRealVariableDeclarationAccess().getGroup()); 
            // InternalTrader.g:344:3: ( rule__RealVariableDeclaration__Group__0 )
            // InternalTrader.g:344:4: rule__RealVariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RealVariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRealVariableDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleRealVariableDeclaration"


    // $ANTLR start "entryRuleLoopStatement"
    // InternalTrader.g:353:1: entryRuleLoopStatement : ruleLoopStatement EOF ;
    public final void entryRuleLoopStatement() throws RecognitionException {
        try {
            // InternalTrader.g:354:1: ( ruleLoopStatement EOF )
            // InternalTrader.g:355:1: ruleLoopStatement EOF
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
    // InternalTrader.g:362:1: ruleLoopStatement : ( ( rule__LoopStatement__Group__0 ) ) ;
    public final void ruleLoopStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:366:2: ( ( ( rule__LoopStatement__Group__0 ) ) )
            // InternalTrader.g:367:2: ( ( rule__LoopStatement__Group__0 ) )
            {
            // InternalTrader.g:367:2: ( ( rule__LoopStatement__Group__0 ) )
            // InternalTrader.g:368:3: ( rule__LoopStatement__Group__0 )
            {
             before(grammarAccess.getLoopStatementAccess().getGroup()); 
            // InternalTrader.g:369:3: ( rule__LoopStatement__Group__0 )
            // InternalTrader.g:369:4: rule__LoopStatement__Group__0
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
    // InternalTrader.g:378:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTrader.g:382:1: ( ruleREAL EOF )
            // InternalTrader.g:383:1: ruleREAL EOF
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
    // InternalTrader.g:393:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:398:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalTrader.g:399:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalTrader.g:399:2: ( ( rule__REAL__Group__0 ) )
            // InternalTrader.g:400:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalTrader.g:401:3: ( rule__REAL__Group__0 )
            // InternalTrader.g:401:4: rule__REAL__Group__0
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
    // InternalTrader.g:411:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalTrader.g:412:1: ( ruleAddition EOF )
            // InternalTrader.g:413:1: ruleAddition EOF
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
    // InternalTrader.g:420:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:424:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalTrader.g:425:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalTrader.g:425:2: ( ( rule__Addition__Group__0 ) )
            // InternalTrader.g:426:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalTrader.g:427:3: ( rule__Addition__Group__0 )
            // InternalTrader.g:427:4: rule__Addition__Group__0
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
    // InternalTrader.g:436:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalTrader.g:437:1: ( ruleMultiplication EOF )
            // InternalTrader.g:438:1: ruleMultiplication EOF
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
    // InternalTrader.g:445:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:449:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalTrader.g:450:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalTrader.g:450:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalTrader.g:451:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalTrader.g:452:3: ( rule__Multiplication__Group__0 )
            // InternalTrader.g:452:4: rule__Multiplication__Group__0
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
    // InternalTrader.g:461:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalTrader.g:462:1: ( rulePrimary EOF )
            // InternalTrader.g:463:1: rulePrimary EOF
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
    // InternalTrader.g:470:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:474:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalTrader.g:475:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalTrader.g:475:2: ( ( rule__Primary__Alternatives ) )
            // InternalTrader.g:476:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalTrader.g:477:3: ( rule__Primary__Alternatives )
            // InternalTrader.g:477:4: rule__Primary__Alternatives
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
    // InternalTrader.g:486:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalTrader.g:487:1: ( ruleIntLiteral EOF )
            // InternalTrader.g:488:1: ruleIntLiteral EOF
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
    // InternalTrader.g:495:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:499:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalTrader.g:500:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalTrader.g:500:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalTrader.g:501:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalTrader.g:502:3: ( rule__IntLiteral__ValAssignment )
            // InternalTrader.g:502:4: rule__IntLiteral__ValAssignment
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
    // InternalTrader.g:511:1: entryRuleIntVarExpression : ruleIntVarExpression EOF ;
    public final void entryRuleIntVarExpression() throws RecognitionException {
        try {
            // InternalTrader.g:512:1: ( ruleIntVarExpression EOF )
            // InternalTrader.g:513:1: ruleIntVarExpression EOF
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
    // InternalTrader.g:520:1: ruleIntVarExpression : ( ( rule__IntVarExpression__VarAssignment ) ) ;
    public final void ruleIntVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:524:2: ( ( ( rule__IntVarExpression__VarAssignment ) ) )
            // InternalTrader.g:525:2: ( ( rule__IntVarExpression__VarAssignment ) )
            {
            // InternalTrader.g:525:2: ( ( rule__IntVarExpression__VarAssignment ) )
            // InternalTrader.g:526:3: ( rule__IntVarExpression__VarAssignment )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 
            // InternalTrader.g:527:3: ( rule__IntVarExpression__VarAssignment )
            // InternalTrader.g:527:4: rule__IntVarExpression__VarAssignment
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
    // InternalTrader.g:536:1: entryRuleBuy : ruleBuy EOF ;
    public final void entryRuleBuy() throws RecognitionException {
        try {
            // InternalTrader.g:537:1: ( ruleBuy EOF )
            // InternalTrader.g:538:1: ruleBuy EOF
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
    // InternalTrader.g:545:1: ruleBuy : ( ( rule__Buy__Group__0 ) ) ;
    public final void ruleBuy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:549:2: ( ( ( rule__Buy__Group__0 ) ) )
            // InternalTrader.g:550:2: ( ( rule__Buy__Group__0 ) )
            {
            // InternalTrader.g:550:2: ( ( rule__Buy__Group__0 ) )
            // InternalTrader.g:551:3: ( rule__Buy__Group__0 )
            {
             before(grammarAccess.getBuyAccess().getGroup()); 
            // InternalTrader.g:552:3: ( rule__Buy__Group__0 )
            // InternalTrader.g:552:4: rule__Buy__Group__0
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
    // InternalTrader.g:561:1: entryRuleSell : ruleSell EOF ;
    public final void entryRuleSell() throws RecognitionException {
        try {
            // InternalTrader.g:562:1: ( ruleSell EOF )
            // InternalTrader.g:563:1: ruleSell EOF
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
    // InternalTrader.g:570:1: ruleSell : ( ( rule__Sell__Group__0 ) ) ;
    public final void ruleSell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:574:2: ( ( ( rule__Sell__Group__0 ) ) )
            // InternalTrader.g:575:2: ( ( rule__Sell__Group__0 ) )
            {
            // InternalTrader.g:575:2: ( ( rule__Sell__Group__0 ) )
            // InternalTrader.g:576:3: ( rule__Sell__Group__0 )
            {
             before(grammarAccess.getSellAccess().getGroup()); 
            // InternalTrader.g:577:3: ( rule__Sell__Group__0 )
            // InternalTrader.g:577:4: rule__Sell__Group__0
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
    // InternalTrader.g:586:1: ruleStrategyDef : ( ( rule__StrategyDef__Alternatives ) ) ;
    public final void ruleStrategyDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:590:1: ( ( ( rule__StrategyDef__Alternatives ) ) )
            // InternalTrader.g:591:2: ( ( rule__StrategyDef__Alternatives ) )
            {
            // InternalTrader.g:591:2: ( ( rule__StrategyDef__Alternatives ) )
            // InternalTrader.g:592:3: ( rule__StrategyDef__Alternatives )
            {
             before(grammarAccess.getStrategyDefAccess().getAlternatives()); 
            // InternalTrader.g:593:3: ( rule__StrategyDef__Alternatives )
            // InternalTrader.g:593:4: rule__StrategyDef__Alternatives
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
    // InternalTrader.g:601:1: rule__Statement__Alternatives : ( ( ruleConnect ) | ( ruleTradingBot ) | ( ruleListBots ) | ( ruleExecute ) | ( ruleStop ) | ( ruleVariableDeclaration ) | ( ruleLoopStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:605:1: ( ( ruleConnect ) | ( ruleTradingBot ) | ( ruleListBots ) | ( ruleExecute ) | ( ruleStop ) | ( ruleVariableDeclaration ) | ( ruleLoopStatement ) )
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
            case 51:
                {
                alt2=3;
                }
                break;
            case 52:
                {
                alt2=4;
                }
                break;
            case 53:
                {
                alt2=5;
                }
                break;
            case 34:
                {
                alt2=6;
                }
                break;
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
                    // InternalTrader.g:606:2: ( ruleConnect )
                    {
                    // InternalTrader.g:606:2: ( ruleConnect )
                    // InternalTrader.g:607:3: ruleConnect
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
                    // InternalTrader.g:612:2: ( ruleTradingBot )
                    {
                    // InternalTrader.g:612:2: ( ruleTradingBot )
                    // InternalTrader.g:613:3: ruleTradingBot
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
                    // InternalTrader.g:618:2: ( ruleListBots )
                    {
                    // InternalTrader.g:618:2: ( ruleListBots )
                    // InternalTrader.g:619:3: ruleListBots
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
                    // InternalTrader.g:624:2: ( ruleExecute )
                    {
                    // InternalTrader.g:624:2: ( ruleExecute )
                    // InternalTrader.g:625:3: ruleExecute
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
                    // InternalTrader.g:630:2: ( ruleStop )
                    {
                    // InternalTrader.g:630:2: ( ruleStop )
                    // InternalTrader.g:631:3: ruleStop
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
                    // InternalTrader.g:636:2: ( ruleVariableDeclaration )
                    {
                    // InternalTrader.g:636:2: ( ruleVariableDeclaration )
                    // InternalTrader.g:637:3: ruleVariableDeclaration
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
                    // InternalTrader.g:642:2: ( ruleLoopStatement )
                    {
                    // InternalTrader.g:642:2: ( ruleLoopStatement )
                    // InternalTrader.g:643:3: ruleLoopStatement
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


    // $ANTLR start "rule__VariableDeclaration__Alternatives"
    // InternalTrader.g:652:1: rule__VariableDeclaration__Alternatives : ( ( ruleIntVariableDeclaration ) | ( ruleStringVariableDeclaration ) | ( ruleRealVariableDeclaration ) );
    public final void rule__VariableDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:656:1: ( ( ruleIntVariableDeclaration ) | ( ruleStringVariableDeclaration ) | ( ruleRealVariableDeclaration ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==34) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==35) ) {
                        switch ( input.LA(4) ) {
                        case 39:
                            {
                            alt3=3;
                            }
                            break;
                        case 36:
                            {
                            alt3=1;
                            }
                            break;
                        case 38:
                            {
                            alt3=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTrader.g:657:2: ( ruleIntVariableDeclaration )
                    {
                    // InternalTrader.g:657:2: ( ruleIntVariableDeclaration )
                    // InternalTrader.g:658:3: ruleIntVariableDeclaration
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getIntVariableDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getVariableDeclarationAccess().getIntVariableDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:663:2: ( ruleStringVariableDeclaration )
                    {
                    // InternalTrader.g:663:2: ( ruleStringVariableDeclaration )
                    // InternalTrader.g:664:3: ruleStringVariableDeclaration
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getStringVariableDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getVariableDeclarationAccess().getStringVariableDeclarationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTrader.g:669:2: ( ruleRealVariableDeclaration )
                    {
                    // InternalTrader.g:669:2: ( ruleRealVariableDeclaration )
                    // InternalTrader.g:670:3: ruleRealVariableDeclaration
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getRealVariableDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRealVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getVariableDeclarationAccess().getRealVariableDeclarationParserRuleCall_2()); 

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
    // $ANTLR end "rule__VariableDeclaration__Alternatives"


    // $ANTLR start "rule__Addition__OperatorAlternatives_1_1_0"
    // InternalTrader.g:679:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:683:1: ( ( '+' ) | ( '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTrader.g:684:2: ( '+' )
                    {
                    // InternalTrader.g:684:2: ( '+' )
                    // InternalTrader.g:685:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:690:2: ( '-' )
                    {
                    // InternalTrader.g:690:2: ( '-' )
                    // InternalTrader.g:691:3: '-'
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
    // InternalTrader.g:700:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:704:1: ( ( '*' ) | ( '/' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTrader.g:705:2: ( '*' )
                    {
                    // InternalTrader.g:705:2: ( '*' )
                    // InternalTrader.g:706:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:711:2: ( '/' )
                    {
                    // InternalTrader.g:711:2: ( '/' )
                    // InternalTrader.g:712:3: '/'
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
    // InternalTrader.g:721:1: rule__Primary__Alternatives : ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:725:1: ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case 45:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTrader.g:726:2: ( ruleIntLiteral )
                    {
                    // InternalTrader.g:726:2: ( ruleIntLiteral )
                    // InternalTrader.g:727:3: ruleIntLiteral
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
                    // InternalTrader.g:732:2: ( ruleIntVarExpression )
                    {
                    // InternalTrader.g:732:2: ( ruleIntVarExpression )
                    // InternalTrader.g:733:3: ruleIntVarExpression
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
                    // InternalTrader.g:738:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalTrader.g:738:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalTrader.g:739:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalTrader.g:740:3: ( rule__Primary__Group_2__0 )
                    // InternalTrader.g:740:4: rule__Primary__Group_2__0
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
    // InternalTrader.g:748:1: rule__StrategyDef__Alternatives : ( ( ( 'buyAndHold' ) ) | ( ( 'meanReversion' ) ) );
    public final void rule__StrategyDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:752:1: ( ( ( 'buyAndHold' ) ) | ( ( 'meanReversion' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTrader.g:753:2: ( ( 'buyAndHold' ) )
                    {
                    // InternalTrader.g:753:2: ( ( 'buyAndHold' ) )
                    // InternalTrader.g:754:3: ( 'buyAndHold' )
                    {
                     before(grammarAccess.getStrategyDefAccess().getBuyAndHoldEnumLiteralDeclaration_0()); 
                    // InternalTrader.g:755:3: ( 'buyAndHold' )
                    // InternalTrader.g:755:4: 'buyAndHold'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getStrategyDefAccess().getBuyAndHoldEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:759:2: ( ( 'meanReversion' ) )
                    {
                    // InternalTrader.g:759:2: ( ( 'meanReversion' ) )
                    // InternalTrader.g:760:3: ( 'meanReversion' )
                    {
                     before(grammarAccess.getStrategyDefAccess().getMeanReversionEnumLiteralDeclaration_1()); 
                    // InternalTrader.g:761:3: ( 'meanReversion' )
                    // InternalTrader.g:761:4: 'meanReversion'
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
    // InternalTrader.g:769:1: rule__Connect__Group__0 : rule__Connect__Group__0__Impl rule__Connect__Group__1 ;
    public final void rule__Connect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:773:1: ( rule__Connect__Group__0__Impl rule__Connect__Group__1 )
            // InternalTrader.g:774:2: rule__Connect__Group__0__Impl rule__Connect__Group__1
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
    // InternalTrader.g:781:1: rule__Connect__Group__0__Impl : ( 'connect' ) ;
    public final void rule__Connect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:785:1: ( ( 'connect' ) )
            // InternalTrader.g:786:1: ( 'connect' )
            {
            // InternalTrader.g:786:1: ( 'connect' )
            // InternalTrader.g:787:2: 'connect'
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
    // InternalTrader.g:796:1: rule__Connect__Group__1 : rule__Connect__Group__1__Impl rule__Connect__Group__2 ;
    public final void rule__Connect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:800:1: ( rule__Connect__Group__1__Impl rule__Connect__Group__2 )
            // InternalTrader.g:801:2: rule__Connect__Group__1__Impl rule__Connect__Group__2
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
    // InternalTrader.g:808:1: rule__Connect__Group__1__Impl : ( 'to' ) ;
    public final void rule__Connect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:812:1: ( ( 'to' ) )
            // InternalTrader.g:813:1: ( 'to' )
            {
            // InternalTrader.g:813:1: ( 'to' )
            // InternalTrader.g:814:2: 'to'
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
    // InternalTrader.g:823:1: rule__Connect__Group__2 : rule__Connect__Group__2__Impl rule__Connect__Group__3 ;
    public final void rule__Connect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:827:1: ( rule__Connect__Group__2__Impl rule__Connect__Group__3 )
            // InternalTrader.g:828:2: rule__Connect__Group__2__Impl rule__Connect__Group__3
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
    // InternalTrader.g:835:1: rule__Connect__Group__2__Impl : ( 'broker' ) ;
    public final void rule__Connect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:839:1: ( ( 'broker' ) )
            // InternalTrader.g:840:1: ( 'broker' )
            {
            // InternalTrader.g:840:1: ( 'broker' )
            // InternalTrader.g:841:2: 'broker'
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
    // InternalTrader.g:850:1: rule__Connect__Group__3 : rule__Connect__Group__3__Impl rule__Connect__Group__4 ;
    public final void rule__Connect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:854:1: ( rule__Connect__Group__3__Impl rule__Connect__Group__4 )
            // InternalTrader.g:855:2: rule__Connect__Group__3__Impl rule__Connect__Group__4
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
    // InternalTrader.g:862:1: rule__Connect__Group__3__Impl : ( ( rule__Connect__BrokerNameAssignment_3 ) ) ;
    public final void rule__Connect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:866:1: ( ( ( rule__Connect__BrokerNameAssignment_3 ) ) )
            // InternalTrader.g:867:1: ( ( rule__Connect__BrokerNameAssignment_3 ) )
            {
            // InternalTrader.g:867:1: ( ( rule__Connect__BrokerNameAssignment_3 ) )
            // InternalTrader.g:868:2: ( rule__Connect__BrokerNameAssignment_3 )
            {
             before(grammarAccess.getConnectAccess().getBrokerNameAssignment_3()); 
            // InternalTrader.g:869:2: ( rule__Connect__BrokerNameAssignment_3 )
            // InternalTrader.g:869:3: rule__Connect__BrokerNameAssignment_3
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
    // InternalTrader.g:877:1: rule__Connect__Group__4 : rule__Connect__Group__4__Impl rule__Connect__Group__5 ;
    public final void rule__Connect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:881:1: ( rule__Connect__Group__4__Impl rule__Connect__Group__5 )
            // InternalTrader.g:882:2: rule__Connect__Group__4__Impl rule__Connect__Group__5
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
    // InternalTrader.g:889:1: rule__Connect__Group__4__Impl : ( 'with' ) ;
    public final void rule__Connect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:893:1: ( ( 'with' ) )
            // InternalTrader.g:894:1: ( 'with' )
            {
            // InternalTrader.g:894:1: ( 'with' )
            // InternalTrader.g:895:2: 'with'
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
    // InternalTrader.g:904:1: rule__Connect__Group__5 : rule__Connect__Group__5__Impl ;
    public final void rule__Connect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:908:1: ( rule__Connect__Group__5__Impl )
            // InternalTrader.g:909:2: rule__Connect__Group__5__Impl
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
    // InternalTrader.g:915:1: rule__Connect__Group__5__Impl : ( ( rule__Connect__ParametersAssignment_5 )? ) ;
    public final void rule__Connect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:919:1: ( ( ( rule__Connect__ParametersAssignment_5 )? ) )
            // InternalTrader.g:920:1: ( ( rule__Connect__ParametersAssignment_5 )? )
            {
            // InternalTrader.g:920:1: ( ( rule__Connect__ParametersAssignment_5 )? )
            // InternalTrader.g:921:2: ( rule__Connect__ParametersAssignment_5 )?
            {
             before(grammarAccess.getConnectAccess().getParametersAssignment_5()); 
            // InternalTrader.g:922:2: ( rule__Connect__ParametersAssignment_5 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTrader.g:922:3: rule__Connect__ParametersAssignment_5
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
    // InternalTrader.g:931:1: rule__ConnectParameters__Group__0 : rule__ConnectParameters__Group__0__Impl rule__ConnectParameters__Group__1 ;
    public final void rule__ConnectParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:935:1: ( rule__ConnectParameters__Group__0__Impl rule__ConnectParameters__Group__1 )
            // InternalTrader.g:936:2: rule__ConnectParameters__Group__0__Impl rule__ConnectParameters__Group__1
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
    // InternalTrader.g:943:1: rule__ConnectParameters__Group__0__Impl : ( 'username' ) ;
    public final void rule__ConnectParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:947:1: ( ( 'username' ) )
            // InternalTrader.g:948:1: ( 'username' )
            {
            // InternalTrader.g:948:1: ( 'username' )
            // InternalTrader.g:949:2: 'username'
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
    // InternalTrader.g:958:1: rule__ConnectParameters__Group__1 : rule__ConnectParameters__Group__1__Impl rule__ConnectParameters__Group__2 ;
    public final void rule__ConnectParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:962:1: ( rule__ConnectParameters__Group__1__Impl rule__ConnectParameters__Group__2 )
            // InternalTrader.g:963:2: rule__ConnectParameters__Group__1__Impl rule__ConnectParameters__Group__2
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
    // InternalTrader.g:970:1: rule__ConnectParameters__Group__1__Impl : ( ( rule__ConnectParameters__UsernameAssignment_1 ) ) ;
    public final void rule__ConnectParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:974:1: ( ( ( rule__ConnectParameters__UsernameAssignment_1 ) ) )
            // InternalTrader.g:975:1: ( ( rule__ConnectParameters__UsernameAssignment_1 ) )
            {
            // InternalTrader.g:975:1: ( ( rule__ConnectParameters__UsernameAssignment_1 ) )
            // InternalTrader.g:976:2: ( rule__ConnectParameters__UsernameAssignment_1 )
            {
             before(grammarAccess.getConnectParametersAccess().getUsernameAssignment_1()); 
            // InternalTrader.g:977:2: ( rule__ConnectParameters__UsernameAssignment_1 )
            // InternalTrader.g:977:3: rule__ConnectParameters__UsernameAssignment_1
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
    // InternalTrader.g:985:1: rule__ConnectParameters__Group__2 : rule__ConnectParameters__Group__2__Impl rule__ConnectParameters__Group__3 ;
    public final void rule__ConnectParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:989:1: ( rule__ConnectParameters__Group__2__Impl rule__ConnectParameters__Group__3 )
            // InternalTrader.g:990:2: rule__ConnectParameters__Group__2__Impl rule__ConnectParameters__Group__3
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
    // InternalTrader.g:997:1: rule__ConnectParameters__Group__2__Impl : ( ',' ) ;
    public final void rule__ConnectParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1001:1: ( ( ',' ) )
            // InternalTrader.g:1002:1: ( ',' )
            {
            // InternalTrader.g:1002:1: ( ',' )
            // InternalTrader.g:1003:2: ','
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
    // InternalTrader.g:1012:1: rule__ConnectParameters__Group__3 : rule__ConnectParameters__Group__3__Impl rule__ConnectParameters__Group__4 ;
    public final void rule__ConnectParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1016:1: ( rule__ConnectParameters__Group__3__Impl rule__ConnectParameters__Group__4 )
            // InternalTrader.g:1017:2: rule__ConnectParameters__Group__3__Impl rule__ConnectParameters__Group__4
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
    // InternalTrader.g:1024:1: rule__ConnectParameters__Group__3__Impl : ( 'password' ) ;
    public final void rule__ConnectParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1028:1: ( ( 'password' ) )
            // InternalTrader.g:1029:1: ( 'password' )
            {
            // InternalTrader.g:1029:1: ( 'password' )
            // InternalTrader.g:1030:2: 'password'
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
    // InternalTrader.g:1039:1: rule__ConnectParameters__Group__4 : rule__ConnectParameters__Group__4__Impl rule__ConnectParameters__Group__5 ;
    public final void rule__ConnectParameters__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1043:1: ( rule__ConnectParameters__Group__4__Impl rule__ConnectParameters__Group__5 )
            // InternalTrader.g:1044:2: rule__ConnectParameters__Group__4__Impl rule__ConnectParameters__Group__5
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
    // InternalTrader.g:1051:1: rule__ConnectParameters__Group__4__Impl : ( ( rule__ConnectParameters__PasswordAssignment_4 ) ) ;
    public final void rule__ConnectParameters__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1055:1: ( ( ( rule__ConnectParameters__PasswordAssignment_4 ) ) )
            // InternalTrader.g:1056:1: ( ( rule__ConnectParameters__PasswordAssignment_4 ) )
            {
            // InternalTrader.g:1056:1: ( ( rule__ConnectParameters__PasswordAssignment_4 ) )
            // InternalTrader.g:1057:2: ( rule__ConnectParameters__PasswordAssignment_4 )
            {
             before(grammarAccess.getConnectParametersAccess().getPasswordAssignment_4()); 
            // InternalTrader.g:1058:2: ( rule__ConnectParameters__PasswordAssignment_4 )
            // InternalTrader.g:1058:3: rule__ConnectParameters__PasswordAssignment_4
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
    // InternalTrader.g:1066:1: rule__ConnectParameters__Group__5 : rule__ConnectParameters__Group__5__Impl rule__ConnectParameters__Group__6 ;
    public final void rule__ConnectParameters__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1070:1: ( rule__ConnectParameters__Group__5__Impl rule__ConnectParameters__Group__6 )
            // InternalTrader.g:1071:2: rule__ConnectParameters__Group__5__Impl rule__ConnectParameters__Group__6
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
    // InternalTrader.g:1078:1: rule__ConnectParameters__Group__5__Impl : ( ',' ) ;
    public final void rule__ConnectParameters__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1082:1: ( ( ',' ) )
            // InternalTrader.g:1083:1: ( ',' )
            {
            // InternalTrader.g:1083:1: ( ',' )
            // InternalTrader.g:1084:2: ','
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
    // InternalTrader.g:1093:1: rule__ConnectParameters__Group__6 : rule__ConnectParameters__Group__6__Impl rule__ConnectParameters__Group__7 ;
    public final void rule__ConnectParameters__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1097:1: ( rule__ConnectParameters__Group__6__Impl rule__ConnectParameters__Group__7 )
            // InternalTrader.g:1098:2: rule__ConnectParameters__Group__6__Impl rule__ConnectParameters__Group__7
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
    // InternalTrader.g:1105:1: rule__ConnectParameters__Group__6__Impl : ( 'leverage' ) ;
    public final void rule__ConnectParameters__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1109:1: ( ( 'leverage' ) )
            // InternalTrader.g:1110:1: ( 'leverage' )
            {
            // InternalTrader.g:1110:1: ( 'leverage' )
            // InternalTrader.g:1111:2: 'leverage'
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
    // InternalTrader.g:1120:1: rule__ConnectParameters__Group__7 : rule__ConnectParameters__Group__7__Impl rule__ConnectParameters__Group__8 ;
    public final void rule__ConnectParameters__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1124:1: ( rule__ConnectParameters__Group__7__Impl rule__ConnectParameters__Group__8 )
            // InternalTrader.g:1125:2: rule__ConnectParameters__Group__7__Impl rule__ConnectParameters__Group__8
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
    // InternalTrader.g:1132:1: rule__ConnectParameters__Group__7__Impl : ( ( rule__ConnectParameters__LeverageAssignment_7 ) ) ;
    public final void rule__ConnectParameters__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1136:1: ( ( ( rule__ConnectParameters__LeverageAssignment_7 ) ) )
            // InternalTrader.g:1137:1: ( ( rule__ConnectParameters__LeverageAssignment_7 ) )
            {
            // InternalTrader.g:1137:1: ( ( rule__ConnectParameters__LeverageAssignment_7 ) )
            // InternalTrader.g:1138:2: ( rule__ConnectParameters__LeverageAssignment_7 )
            {
             before(grammarAccess.getConnectParametersAccess().getLeverageAssignment_7()); 
            // InternalTrader.g:1139:2: ( rule__ConnectParameters__LeverageAssignment_7 )
            // InternalTrader.g:1139:3: rule__ConnectParameters__LeverageAssignment_7
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
    // InternalTrader.g:1147:1: rule__ConnectParameters__Group__8 : rule__ConnectParameters__Group__8__Impl rule__ConnectParameters__Group__9 ;
    public final void rule__ConnectParameters__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1151:1: ( rule__ConnectParameters__Group__8__Impl rule__ConnectParameters__Group__9 )
            // InternalTrader.g:1152:2: rule__ConnectParameters__Group__8__Impl rule__ConnectParameters__Group__9
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
    // InternalTrader.g:1159:1: rule__ConnectParameters__Group__8__Impl : ( ',' ) ;
    public final void rule__ConnectParameters__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1163:1: ( ( ',' ) )
            // InternalTrader.g:1164:1: ( ',' )
            {
            // InternalTrader.g:1164:1: ( ',' )
            // InternalTrader.g:1165:2: ','
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
    // InternalTrader.g:1174:1: rule__ConnectParameters__Group__9 : rule__ConnectParameters__Group__9__Impl rule__ConnectParameters__Group__10 ;
    public final void rule__ConnectParameters__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1178:1: ( rule__ConnectParameters__Group__9__Impl rule__ConnectParameters__Group__10 )
            // InternalTrader.g:1179:2: rule__ConnectParameters__Group__9__Impl rule__ConnectParameters__Group__10
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
    // InternalTrader.g:1186:1: rule__ConnectParameters__Group__9__Impl : ( 'money' ) ;
    public final void rule__ConnectParameters__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1190:1: ( ( 'money' ) )
            // InternalTrader.g:1191:1: ( 'money' )
            {
            // InternalTrader.g:1191:1: ( 'money' )
            // InternalTrader.g:1192:2: 'money'
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
    // InternalTrader.g:1201:1: rule__ConnectParameters__Group__10 : rule__ConnectParameters__Group__10__Impl rule__ConnectParameters__Group__11 ;
    public final void rule__ConnectParameters__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1205:1: ( rule__ConnectParameters__Group__10__Impl rule__ConnectParameters__Group__11 )
            // InternalTrader.g:1206:2: rule__ConnectParameters__Group__10__Impl rule__ConnectParameters__Group__11
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
    // InternalTrader.g:1213:1: rule__ConnectParameters__Group__10__Impl : ( ( rule__ConnectParameters__MoneyAssignment_10 ) ) ;
    public final void rule__ConnectParameters__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1217:1: ( ( ( rule__ConnectParameters__MoneyAssignment_10 ) ) )
            // InternalTrader.g:1218:1: ( ( rule__ConnectParameters__MoneyAssignment_10 ) )
            {
            // InternalTrader.g:1218:1: ( ( rule__ConnectParameters__MoneyAssignment_10 ) )
            // InternalTrader.g:1219:2: ( rule__ConnectParameters__MoneyAssignment_10 )
            {
             before(grammarAccess.getConnectParametersAccess().getMoneyAssignment_10()); 
            // InternalTrader.g:1220:2: ( rule__ConnectParameters__MoneyAssignment_10 )
            // InternalTrader.g:1220:3: rule__ConnectParameters__MoneyAssignment_10
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
    // InternalTrader.g:1228:1: rule__ConnectParameters__Group__11 : rule__ConnectParameters__Group__11__Impl rule__ConnectParameters__Group__12 ;
    public final void rule__ConnectParameters__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1232:1: ( rule__ConnectParameters__Group__11__Impl rule__ConnectParameters__Group__12 )
            // InternalTrader.g:1233:2: rule__ConnectParameters__Group__11__Impl rule__ConnectParameters__Group__12
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
    // InternalTrader.g:1240:1: rule__ConnectParameters__Group__11__Impl : ( ',' ) ;
    public final void rule__ConnectParameters__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1244:1: ( ( ',' ) )
            // InternalTrader.g:1245:1: ( ',' )
            {
            // InternalTrader.g:1245:1: ( ',' )
            // InternalTrader.g:1246:2: ','
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
    // InternalTrader.g:1255:1: rule__ConnectParameters__Group__12 : rule__ConnectParameters__Group__12__Impl rule__ConnectParameters__Group__13 ;
    public final void rule__ConnectParameters__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1259:1: ( rule__ConnectParameters__Group__12__Impl rule__ConnectParameters__Group__13 )
            // InternalTrader.g:1260:2: rule__ConnectParameters__Group__12__Impl rule__ConnectParameters__Group__13
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
    // InternalTrader.g:1267:1: rule__ConnectParameters__Group__12__Impl : ( 'timeframe' ) ;
    public final void rule__ConnectParameters__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1271:1: ( ( 'timeframe' ) )
            // InternalTrader.g:1272:1: ( 'timeframe' )
            {
            // InternalTrader.g:1272:1: ( 'timeframe' )
            // InternalTrader.g:1273:2: 'timeframe'
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
    // InternalTrader.g:1282:1: rule__ConnectParameters__Group__13 : rule__ConnectParameters__Group__13__Impl ;
    public final void rule__ConnectParameters__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1286:1: ( rule__ConnectParameters__Group__13__Impl )
            // InternalTrader.g:1287:2: rule__ConnectParameters__Group__13__Impl
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
    // InternalTrader.g:1293:1: rule__ConnectParameters__Group__13__Impl : ( ( rule__ConnectParameters__TimeframeAssignment_13 ) ) ;
    public final void rule__ConnectParameters__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1297:1: ( ( ( rule__ConnectParameters__TimeframeAssignment_13 ) ) )
            // InternalTrader.g:1298:1: ( ( rule__ConnectParameters__TimeframeAssignment_13 ) )
            {
            // InternalTrader.g:1298:1: ( ( rule__ConnectParameters__TimeframeAssignment_13 ) )
            // InternalTrader.g:1299:2: ( rule__ConnectParameters__TimeframeAssignment_13 )
            {
             before(grammarAccess.getConnectParametersAccess().getTimeframeAssignment_13()); 
            // InternalTrader.g:1300:2: ( rule__ConnectParameters__TimeframeAssignment_13 )
            // InternalTrader.g:1300:3: rule__ConnectParameters__TimeframeAssignment_13
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
    // InternalTrader.g:1309:1: rule__TradingBot__Group__0 : rule__TradingBot__Group__0__Impl rule__TradingBot__Group__1 ;
    public final void rule__TradingBot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1313:1: ( rule__TradingBot__Group__0__Impl rule__TradingBot__Group__1 )
            // InternalTrader.g:1314:2: rule__TradingBot__Group__0__Impl rule__TradingBot__Group__1
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
    // InternalTrader.g:1321:1: rule__TradingBot__Group__0__Impl : ( 'create' ) ;
    public final void rule__TradingBot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1325:1: ( ( 'create' ) )
            // InternalTrader.g:1326:1: ( 'create' )
            {
            // InternalTrader.g:1326:1: ( 'create' )
            // InternalTrader.g:1327:2: 'create'
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
    // InternalTrader.g:1336:1: rule__TradingBot__Group__1 : rule__TradingBot__Group__1__Impl rule__TradingBot__Group__2 ;
    public final void rule__TradingBot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1340:1: ( rule__TradingBot__Group__1__Impl rule__TradingBot__Group__2 )
            // InternalTrader.g:1341:2: rule__TradingBot__Group__1__Impl rule__TradingBot__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalTrader.g:1348:1: rule__TradingBot__Group__1__Impl : ( 'bot' ) ;
    public final void rule__TradingBot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1352:1: ( ( 'bot' ) )
            // InternalTrader.g:1353:1: ( 'bot' )
            {
            // InternalTrader.g:1353:1: ( 'bot' )
            // InternalTrader.g:1354:2: 'bot'
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
    // InternalTrader.g:1363:1: rule__TradingBot__Group__2 : rule__TradingBot__Group__2__Impl rule__TradingBot__Group__3 ;
    public final void rule__TradingBot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1367:1: ( rule__TradingBot__Group__2__Impl rule__TradingBot__Group__3 )
            // InternalTrader.g:1368:2: rule__TradingBot__Group__2__Impl rule__TradingBot__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalTrader.g:1375:1: rule__TradingBot__Group__2__Impl : ( ( rule__TradingBot__BotNameAssignment_2 ) ) ;
    public final void rule__TradingBot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1379:1: ( ( ( rule__TradingBot__BotNameAssignment_2 ) ) )
            // InternalTrader.g:1380:1: ( ( rule__TradingBot__BotNameAssignment_2 ) )
            {
            // InternalTrader.g:1380:1: ( ( rule__TradingBot__BotNameAssignment_2 ) )
            // InternalTrader.g:1381:2: ( rule__TradingBot__BotNameAssignment_2 )
            {
             before(grammarAccess.getTradingBotAccess().getBotNameAssignment_2()); 
            // InternalTrader.g:1382:2: ( rule__TradingBot__BotNameAssignment_2 )
            // InternalTrader.g:1382:3: rule__TradingBot__BotNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TradingBot__BotNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTradingBotAccess().getBotNameAssignment_2()); 

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
    // InternalTrader.g:1390:1: rule__TradingBot__Group__3 : rule__TradingBot__Group__3__Impl rule__TradingBot__Group__4 ;
    public final void rule__TradingBot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1394:1: ( rule__TradingBot__Group__3__Impl rule__TradingBot__Group__4 )
            // InternalTrader.g:1395:2: rule__TradingBot__Group__3__Impl rule__TradingBot__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalTrader.g:1402:1: rule__TradingBot__Group__3__Impl : ( 'with' ) ;
    public final void rule__TradingBot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1406:1: ( ( 'with' ) )
            // InternalTrader.g:1407:1: ( 'with' )
            {
            // InternalTrader.g:1407:1: ( 'with' )
            // InternalTrader.g:1408:2: 'with'
            {
             before(grammarAccess.getTradingBotAccess().getWithKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getWithKeyword_3()); 

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
    // InternalTrader.g:1417:1: rule__TradingBot__Group__4 : rule__TradingBot__Group__4__Impl rule__TradingBot__Group__5 ;
    public final void rule__TradingBot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1421:1: ( rule__TradingBot__Group__4__Impl rule__TradingBot__Group__5 )
            // InternalTrader.g:1422:2: rule__TradingBot__Group__4__Impl rule__TradingBot__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalTrader.g:1429:1: rule__TradingBot__Group__4__Impl : ( ( rule__TradingBot__StrategyAssignment_4 ) ) ;
    public final void rule__TradingBot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1433:1: ( ( ( rule__TradingBot__StrategyAssignment_4 ) ) )
            // InternalTrader.g:1434:1: ( ( rule__TradingBot__StrategyAssignment_4 ) )
            {
            // InternalTrader.g:1434:1: ( ( rule__TradingBot__StrategyAssignment_4 ) )
            // InternalTrader.g:1435:2: ( rule__TradingBot__StrategyAssignment_4 )
            {
             before(grammarAccess.getTradingBotAccess().getStrategyAssignment_4()); 
            // InternalTrader.g:1436:2: ( rule__TradingBot__StrategyAssignment_4 )
            // InternalTrader.g:1436:3: rule__TradingBot__StrategyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TradingBot__StrategyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTradingBotAccess().getStrategyAssignment_4()); 

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
    // InternalTrader.g:1444:1: rule__TradingBot__Group__5 : rule__TradingBot__Group__5__Impl rule__TradingBot__Group__6 ;
    public final void rule__TradingBot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1448:1: ( rule__TradingBot__Group__5__Impl rule__TradingBot__Group__6 )
            // InternalTrader.g:1449:2: rule__TradingBot__Group__5__Impl rule__TradingBot__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalTrader.g:1456:1: rule__TradingBot__Group__5__Impl : ( 'strategy' ) ;
    public final void rule__TradingBot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1460:1: ( ( 'strategy' ) )
            // InternalTrader.g:1461:1: ( 'strategy' )
            {
            // InternalTrader.g:1461:1: ( 'strategy' )
            // InternalTrader.g:1462:2: 'strategy'
            {
             before(grammarAccess.getTradingBotAccess().getStrategyKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getStrategyKeyword_5()); 

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
    // InternalTrader.g:1471:1: rule__TradingBot__Group__6 : rule__TradingBot__Group__6__Impl rule__TradingBot__Group__7 ;
    public final void rule__TradingBot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1475:1: ( rule__TradingBot__Group__6__Impl rule__TradingBot__Group__7 )
            // InternalTrader.g:1476:2: rule__TradingBot__Group__6__Impl rule__TradingBot__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalTrader.g:1483:1: rule__TradingBot__Group__6__Impl : ( 'using' ) ;
    public final void rule__TradingBot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1487:1: ( ( 'using' ) )
            // InternalTrader.g:1488:1: ( 'using' )
            {
            // InternalTrader.g:1488:1: ( 'using' )
            // InternalTrader.g:1489:2: 'using'
            {
             before(grammarAccess.getTradingBotAccess().getUsingKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getUsingKeyword_6()); 

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
    // InternalTrader.g:1498:1: rule__TradingBot__Group__7 : rule__TradingBot__Group__7__Impl rule__TradingBot__Group__8 ;
    public final void rule__TradingBot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1502:1: ( rule__TradingBot__Group__7__Impl rule__TradingBot__Group__8 )
            // InternalTrader.g:1503:2: rule__TradingBot__Group__7__Impl rule__TradingBot__Group__8
            {
            pushFollow(FOLLOW_20);
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
    // InternalTrader.g:1510:1: rule__TradingBot__Group__7__Impl : ( ( rule__TradingBot__FundsAssignment_7 ) ) ;
    public final void rule__TradingBot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1514:1: ( ( ( rule__TradingBot__FundsAssignment_7 ) ) )
            // InternalTrader.g:1515:1: ( ( rule__TradingBot__FundsAssignment_7 ) )
            {
            // InternalTrader.g:1515:1: ( ( rule__TradingBot__FundsAssignment_7 ) )
            // InternalTrader.g:1516:2: ( rule__TradingBot__FundsAssignment_7 )
            {
             before(grammarAccess.getTradingBotAccess().getFundsAssignment_7()); 
            // InternalTrader.g:1517:2: ( rule__TradingBot__FundsAssignment_7 )
            // InternalTrader.g:1517:3: rule__TradingBot__FundsAssignment_7
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


    // $ANTLR start "rule__TradingBot__Group__8"
    // InternalTrader.g:1525:1: rule__TradingBot__Group__8 : rule__TradingBot__Group__8__Impl rule__TradingBot__Group__9 ;
    public final void rule__TradingBot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1529:1: ( rule__TradingBot__Group__8__Impl rule__TradingBot__Group__9 )
            // InternalTrader.g:1530:2: rule__TradingBot__Group__8__Impl rule__TradingBot__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__TradingBot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TradingBot__Group__9();

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
    // InternalTrader.g:1537:1: rule__TradingBot__Group__8__Impl : ( 'from' ) ;
    public final void rule__TradingBot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1541:1: ( ( 'from' ) )
            // InternalTrader.g:1542:1: ( 'from' )
            {
            // InternalTrader.g:1542:1: ( 'from' )
            // InternalTrader.g:1543:2: 'from'
            {
             before(grammarAccess.getTradingBotAccess().getFromKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getFromKeyword_8()); 

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


    // $ANTLR start "rule__TradingBot__Group__9"
    // InternalTrader.g:1552:1: rule__TradingBot__Group__9 : rule__TradingBot__Group__9__Impl ;
    public final void rule__TradingBot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1556:1: ( rule__TradingBot__Group__9__Impl )
            // InternalTrader.g:1557:2: rule__TradingBot__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TradingBot__Group__9__Impl();

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
    // $ANTLR end "rule__TradingBot__Group__9"


    // $ANTLR start "rule__TradingBot__Group__9__Impl"
    // InternalTrader.g:1563:1: rule__TradingBot__Group__9__Impl : ( 'money' ) ;
    public final void rule__TradingBot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1567:1: ( ( 'money' ) )
            // InternalTrader.g:1568:1: ( 'money' )
            {
            // InternalTrader.g:1568:1: ( 'money' )
            // InternalTrader.g:1569:2: 'money'
            {
             before(grammarAccess.getTradingBotAccess().getMoneyKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getMoneyKeyword_9()); 

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
    // $ANTLR end "rule__TradingBot__Group__9__Impl"


    // $ANTLR start "rule__ListBots__Group__0"
    // InternalTrader.g:1579:1: rule__ListBots__Group__0 : rule__ListBots__Group__0__Impl rule__ListBots__Group__1 ;
    public final void rule__ListBots__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1583:1: ( rule__ListBots__Group__0__Impl rule__ListBots__Group__1 )
            // InternalTrader.g:1584:2: rule__ListBots__Group__0__Impl rule__ListBots__Group__1
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
    // InternalTrader.g:1591:1: rule__ListBots__Group__0__Impl : ( ( rule__ListBots__ListCommandAssignment_0 ) ) ;
    public final void rule__ListBots__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1595:1: ( ( ( rule__ListBots__ListCommandAssignment_0 ) ) )
            // InternalTrader.g:1596:1: ( ( rule__ListBots__ListCommandAssignment_0 ) )
            {
            // InternalTrader.g:1596:1: ( ( rule__ListBots__ListCommandAssignment_0 ) )
            // InternalTrader.g:1597:2: ( rule__ListBots__ListCommandAssignment_0 )
            {
             before(grammarAccess.getListBotsAccess().getListCommandAssignment_0()); 
            // InternalTrader.g:1598:2: ( rule__ListBots__ListCommandAssignment_0 )
            // InternalTrader.g:1598:3: rule__ListBots__ListCommandAssignment_0
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
    // InternalTrader.g:1606:1: rule__ListBots__Group__1 : rule__ListBots__Group__1__Impl rule__ListBots__Group__2 ;
    public final void rule__ListBots__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1610:1: ( rule__ListBots__Group__1__Impl rule__ListBots__Group__2 )
            // InternalTrader.g:1611:2: rule__ListBots__Group__1__Impl rule__ListBots__Group__2
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
    // InternalTrader.g:1618:1: rule__ListBots__Group__1__Impl : ( 'registered' ) ;
    public final void rule__ListBots__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1622:1: ( ( 'registered' ) )
            // InternalTrader.g:1623:1: ( 'registered' )
            {
            // InternalTrader.g:1623:1: ( 'registered' )
            // InternalTrader.g:1624:2: 'registered'
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
    // InternalTrader.g:1633:1: rule__ListBots__Group__2 : rule__ListBots__Group__2__Impl ;
    public final void rule__ListBots__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1637:1: ( rule__ListBots__Group__2__Impl )
            // InternalTrader.g:1638:2: rule__ListBots__Group__2__Impl
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
    // InternalTrader.g:1644:1: rule__ListBots__Group__2__Impl : ( 'bots' ) ;
    public final void rule__ListBots__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1648:1: ( ( 'bots' ) )
            // InternalTrader.g:1649:1: ( 'bots' )
            {
            // InternalTrader.g:1649:1: ( 'bots' )
            // InternalTrader.g:1650:2: 'bots'
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
    // InternalTrader.g:1660:1: rule__Execute__Group__0 : rule__Execute__Group__0__Impl rule__Execute__Group__1 ;
    public final void rule__Execute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1664:1: ( rule__Execute__Group__0__Impl rule__Execute__Group__1 )
            // InternalTrader.g:1665:2: rule__Execute__Group__0__Impl rule__Execute__Group__1
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
    // InternalTrader.g:1672:1: rule__Execute__Group__0__Impl : ( ( rule__Execute__ExecuteCommandAssignment_0 ) ) ;
    public final void rule__Execute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1676:1: ( ( ( rule__Execute__ExecuteCommandAssignment_0 ) ) )
            // InternalTrader.g:1677:1: ( ( rule__Execute__ExecuteCommandAssignment_0 ) )
            {
            // InternalTrader.g:1677:1: ( ( rule__Execute__ExecuteCommandAssignment_0 ) )
            // InternalTrader.g:1678:2: ( rule__Execute__ExecuteCommandAssignment_0 )
            {
             before(grammarAccess.getExecuteAccess().getExecuteCommandAssignment_0()); 
            // InternalTrader.g:1679:2: ( rule__Execute__ExecuteCommandAssignment_0 )
            // InternalTrader.g:1679:3: rule__Execute__ExecuteCommandAssignment_0
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
    // InternalTrader.g:1687:1: rule__Execute__Group__1 : rule__Execute__Group__1__Impl ;
    public final void rule__Execute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1691:1: ( rule__Execute__Group__1__Impl )
            // InternalTrader.g:1692:2: rule__Execute__Group__1__Impl
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
    // InternalTrader.g:1698:1: rule__Execute__Group__1__Impl : ( 'bots' ) ;
    public final void rule__Execute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1702:1: ( ( 'bots' ) )
            // InternalTrader.g:1703:1: ( 'bots' )
            {
            // InternalTrader.g:1703:1: ( 'bots' )
            // InternalTrader.g:1704:2: 'bots'
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
    // InternalTrader.g:1714:1: rule__Stop__Group__0 : rule__Stop__Group__0__Impl rule__Stop__Group__1 ;
    public final void rule__Stop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1718:1: ( rule__Stop__Group__0__Impl rule__Stop__Group__1 )
            // InternalTrader.g:1719:2: rule__Stop__Group__0__Impl rule__Stop__Group__1
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
    // InternalTrader.g:1726:1: rule__Stop__Group__0__Impl : ( ( rule__Stop__StopCommandAssignment_0 ) ) ;
    public final void rule__Stop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1730:1: ( ( ( rule__Stop__StopCommandAssignment_0 ) ) )
            // InternalTrader.g:1731:1: ( ( rule__Stop__StopCommandAssignment_0 ) )
            {
            // InternalTrader.g:1731:1: ( ( rule__Stop__StopCommandAssignment_0 ) )
            // InternalTrader.g:1732:2: ( rule__Stop__StopCommandAssignment_0 )
            {
             before(grammarAccess.getStopAccess().getStopCommandAssignment_0()); 
            // InternalTrader.g:1733:2: ( rule__Stop__StopCommandAssignment_0 )
            // InternalTrader.g:1733:3: rule__Stop__StopCommandAssignment_0
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
    // InternalTrader.g:1741:1: rule__Stop__Group__1 : rule__Stop__Group__1__Impl ;
    public final void rule__Stop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1745:1: ( rule__Stop__Group__1__Impl )
            // InternalTrader.g:1746:2: rule__Stop__Group__1__Impl
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
    // InternalTrader.g:1752:1: rule__Stop__Group__1__Impl : ( 'bots' ) ;
    public final void rule__Stop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1756:1: ( ( 'bots' ) )
            // InternalTrader.g:1757:1: ( 'bots' )
            {
            // InternalTrader.g:1757:1: ( 'bots' )
            // InternalTrader.g:1758:2: 'bots'
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


    // $ANTLR start "rule__IntVariableDeclaration__Group__0"
    // InternalTrader.g:1768:1: rule__IntVariableDeclaration__Group__0 : rule__IntVariableDeclaration__Group__0__Impl rule__IntVariableDeclaration__Group__1 ;
    public final void rule__IntVariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1772:1: ( rule__IntVariableDeclaration__Group__0__Impl rule__IntVariableDeclaration__Group__1 )
            // InternalTrader.g:1773:2: rule__IntVariableDeclaration__Group__0__Impl rule__IntVariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__IntVariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntVariableDeclaration__Group__1();

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
    // $ANTLR end "rule__IntVariableDeclaration__Group__0"


    // $ANTLR start "rule__IntVariableDeclaration__Group__0__Impl"
    // InternalTrader.g:1780:1: rule__IntVariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__IntVariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1784:1: ( ( 'var' ) )
            // InternalTrader.g:1785:1: ( 'var' )
            {
            // InternalTrader.g:1785:1: ( 'var' )
            // InternalTrader.g:1786:2: 'var'
            {
             before(grammarAccess.getIntVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getIntVariableDeclarationAccess().getVarKeyword_0()); 

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
    // $ANTLR end "rule__IntVariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__IntVariableDeclaration__Group__1"
    // InternalTrader.g:1795:1: rule__IntVariableDeclaration__Group__1 : rule__IntVariableDeclaration__Group__1__Impl rule__IntVariableDeclaration__Group__2 ;
    public final void rule__IntVariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1799:1: ( rule__IntVariableDeclaration__Group__1__Impl rule__IntVariableDeclaration__Group__2 )
            // InternalTrader.g:1800:2: rule__IntVariableDeclaration__Group__1__Impl rule__IntVariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__IntVariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntVariableDeclaration__Group__2();

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
    // $ANTLR end "rule__IntVariableDeclaration__Group__1"


    // $ANTLR start "rule__IntVariableDeclaration__Group__1__Impl"
    // InternalTrader.g:1807:1: rule__IntVariableDeclaration__Group__1__Impl : ( ( rule__IntVariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__IntVariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1811:1: ( ( ( rule__IntVariableDeclaration__NameAssignment_1 ) ) )
            // InternalTrader.g:1812:1: ( ( rule__IntVariableDeclaration__NameAssignment_1 ) )
            {
            // InternalTrader.g:1812:1: ( ( rule__IntVariableDeclaration__NameAssignment_1 ) )
            // InternalTrader.g:1813:2: ( rule__IntVariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getIntVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalTrader.g:1814:2: ( rule__IntVariableDeclaration__NameAssignment_1 )
            // InternalTrader.g:1814:3: rule__IntVariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IntVariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntVariableDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__IntVariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__IntVariableDeclaration__Group__2"
    // InternalTrader.g:1822:1: rule__IntVariableDeclaration__Group__2 : rule__IntVariableDeclaration__Group__2__Impl rule__IntVariableDeclaration__Group__3 ;
    public final void rule__IntVariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1826:1: ( rule__IntVariableDeclaration__Group__2__Impl rule__IntVariableDeclaration__Group__3 )
            // InternalTrader.g:1827:2: rule__IntVariableDeclaration__Group__2__Impl rule__IntVariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__IntVariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntVariableDeclaration__Group__3();

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
    // $ANTLR end "rule__IntVariableDeclaration__Group__2"


    // $ANTLR start "rule__IntVariableDeclaration__Group__2__Impl"
    // InternalTrader.g:1834:1: rule__IntVariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__IntVariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1838:1: ( ( '=' ) )
            // InternalTrader.g:1839:1: ( '=' )
            {
            // InternalTrader.g:1839:1: ( '=' )
            // InternalTrader.g:1840:2: '='
            {
             before(grammarAccess.getIntVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getIntVariableDeclarationAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__IntVariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__IntVariableDeclaration__Group__3"
    // InternalTrader.g:1849:1: rule__IntVariableDeclaration__Group__3 : rule__IntVariableDeclaration__Group__3__Impl rule__IntVariableDeclaration__Group__4 ;
    public final void rule__IntVariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1853:1: ( rule__IntVariableDeclaration__Group__3__Impl rule__IntVariableDeclaration__Group__4 )
            // InternalTrader.g:1854:2: rule__IntVariableDeclaration__Group__3__Impl rule__IntVariableDeclaration__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__IntVariableDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntVariableDeclaration__Group__4();

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
    // $ANTLR end "rule__IntVariableDeclaration__Group__3"


    // $ANTLR start "rule__IntVariableDeclaration__Group__3__Impl"
    // InternalTrader.g:1861:1: rule__IntVariableDeclaration__Group__3__Impl : ( 'int' ) ;
    public final void rule__IntVariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1865:1: ( ( 'int' ) )
            // InternalTrader.g:1866:1: ( 'int' )
            {
            // InternalTrader.g:1866:1: ( 'int' )
            // InternalTrader.g:1867:2: 'int'
            {
             before(grammarAccess.getIntVariableDeclarationAccess().getIntKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getIntVariableDeclarationAccess().getIntKeyword_3()); 

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
    // $ANTLR end "rule__IntVariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__IntVariableDeclaration__Group__4"
    // InternalTrader.g:1876:1: rule__IntVariableDeclaration__Group__4 : rule__IntVariableDeclaration__Group__4__Impl rule__IntVariableDeclaration__Group__5 ;
    public final void rule__IntVariableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1880:1: ( rule__IntVariableDeclaration__Group__4__Impl rule__IntVariableDeclaration__Group__5 )
            // InternalTrader.g:1881:2: rule__IntVariableDeclaration__Group__4__Impl rule__IntVariableDeclaration__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__IntVariableDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntVariableDeclaration__Group__5();

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
    // $ANTLR end "rule__IntVariableDeclaration__Group__4"


    // $ANTLR start "rule__IntVariableDeclaration__Group__4__Impl"
    // InternalTrader.g:1888:1: rule__IntVariableDeclaration__Group__4__Impl : ( ':' ) ;
    public final void rule__IntVariableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1892:1: ( ( ':' ) )
            // InternalTrader.g:1893:1: ( ':' )
            {
            // InternalTrader.g:1893:1: ( ':' )
            // InternalTrader.g:1894:2: ':'
            {
             before(grammarAccess.getIntVariableDeclarationAccess().getColonKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getIntVariableDeclarationAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__IntVariableDeclaration__Group__4__Impl"


    // $ANTLR start "rule__IntVariableDeclaration__Group__5"
    // InternalTrader.g:1903:1: rule__IntVariableDeclaration__Group__5 : rule__IntVariableDeclaration__Group__5__Impl ;
    public final void rule__IntVariableDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1907:1: ( rule__IntVariableDeclaration__Group__5__Impl )
            // InternalTrader.g:1908:2: rule__IntVariableDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntVariableDeclaration__Group__5__Impl();

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
    // $ANTLR end "rule__IntVariableDeclaration__Group__5"


    // $ANTLR start "rule__IntVariableDeclaration__Group__5__Impl"
    // InternalTrader.g:1914:1: rule__IntVariableDeclaration__Group__5__Impl : ( ( rule__IntVariableDeclaration__ValueAssignment_5 ) ) ;
    public final void rule__IntVariableDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1918:1: ( ( ( rule__IntVariableDeclaration__ValueAssignment_5 ) ) )
            // InternalTrader.g:1919:1: ( ( rule__IntVariableDeclaration__ValueAssignment_5 ) )
            {
            // InternalTrader.g:1919:1: ( ( rule__IntVariableDeclaration__ValueAssignment_5 ) )
            // InternalTrader.g:1920:2: ( rule__IntVariableDeclaration__ValueAssignment_5 )
            {
             before(grammarAccess.getIntVariableDeclarationAccess().getValueAssignment_5()); 
            // InternalTrader.g:1921:2: ( rule__IntVariableDeclaration__ValueAssignment_5 )
            // InternalTrader.g:1921:3: rule__IntVariableDeclaration__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__IntVariableDeclaration__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIntVariableDeclarationAccess().getValueAssignment_5()); 

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
    // $ANTLR end "rule__IntVariableDeclaration__Group__5__Impl"


    // $ANTLR start "rule__StringVariableDeclaration__Group__0"
    // InternalTrader.g:1930:1: rule__StringVariableDeclaration__Group__0 : rule__StringVariableDeclaration__Group__0__Impl rule__StringVariableDeclaration__Group__1 ;
    public final void rule__StringVariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1934:1: ( rule__StringVariableDeclaration__Group__0__Impl rule__StringVariableDeclaration__Group__1 )
            // InternalTrader.g:1935:2: rule__StringVariableDeclaration__Group__0__Impl rule__StringVariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__StringVariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringVariableDeclaration__Group__1();

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
    // $ANTLR end "rule__StringVariableDeclaration__Group__0"


    // $ANTLR start "rule__StringVariableDeclaration__Group__0__Impl"
    // InternalTrader.g:1942:1: rule__StringVariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__StringVariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1946:1: ( ( 'var' ) )
            // InternalTrader.g:1947:1: ( 'var' )
            {
            // InternalTrader.g:1947:1: ( 'var' )
            // InternalTrader.g:1948:2: 'var'
            {
             before(grammarAccess.getStringVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStringVariableDeclarationAccess().getVarKeyword_0()); 

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
    // $ANTLR end "rule__StringVariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__StringVariableDeclaration__Group__1"
    // InternalTrader.g:1957:1: rule__StringVariableDeclaration__Group__1 : rule__StringVariableDeclaration__Group__1__Impl rule__StringVariableDeclaration__Group__2 ;
    public final void rule__StringVariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1961:1: ( rule__StringVariableDeclaration__Group__1__Impl rule__StringVariableDeclaration__Group__2 )
            // InternalTrader.g:1962:2: rule__StringVariableDeclaration__Group__1__Impl rule__StringVariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__StringVariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringVariableDeclaration__Group__2();

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
    // $ANTLR end "rule__StringVariableDeclaration__Group__1"


    // $ANTLR start "rule__StringVariableDeclaration__Group__1__Impl"
    // InternalTrader.g:1969:1: rule__StringVariableDeclaration__Group__1__Impl : ( ( rule__StringVariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__StringVariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1973:1: ( ( ( rule__StringVariableDeclaration__NameAssignment_1 ) ) )
            // InternalTrader.g:1974:1: ( ( rule__StringVariableDeclaration__NameAssignment_1 ) )
            {
            // InternalTrader.g:1974:1: ( ( rule__StringVariableDeclaration__NameAssignment_1 ) )
            // InternalTrader.g:1975:2: ( rule__StringVariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getStringVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalTrader.g:1976:2: ( rule__StringVariableDeclaration__NameAssignment_1 )
            // InternalTrader.g:1976:3: rule__StringVariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringVariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringVariableDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__StringVariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__StringVariableDeclaration__Group__2"
    // InternalTrader.g:1984:1: rule__StringVariableDeclaration__Group__2 : rule__StringVariableDeclaration__Group__2__Impl rule__StringVariableDeclaration__Group__3 ;
    public final void rule__StringVariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1988:1: ( rule__StringVariableDeclaration__Group__2__Impl rule__StringVariableDeclaration__Group__3 )
            // InternalTrader.g:1989:2: rule__StringVariableDeclaration__Group__2__Impl rule__StringVariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__StringVariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringVariableDeclaration__Group__3();

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
    // $ANTLR end "rule__StringVariableDeclaration__Group__2"


    // $ANTLR start "rule__StringVariableDeclaration__Group__2__Impl"
    // InternalTrader.g:1996:1: rule__StringVariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__StringVariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2000:1: ( ( '=' ) )
            // InternalTrader.g:2001:1: ( '=' )
            {
            // InternalTrader.g:2001:1: ( '=' )
            // InternalTrader.g:2002:2: '='
            {
             before(grammarAccess.getStringVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getStringVariableDeclarationAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__StringVariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__StringVariableDeclaration__Group__3"
    // InternalTrader.g:2011:1: rule__StringVariableDeclaration__Group__3 : rule__StringVariableDeclaration__Group__3__Impl rule__StringVariableDeclaration__Group__4 ;
    public final void rule__StringVariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2015:1: ( rule__StringVariableDeclaration__Group__3__Impl rule__StringVariableDeclaration__Group__4 )
            // InternalTrader.g:2016:2: rule__StringVariableDeclaration__Group__3__Impl rule__StringVariableDeclaration__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__StringVariableDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringVariableDeclaration__Group__4();

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
    // $ANTLR end "rule__StringVariableDeclaration__Group__3"


    // $ANTLR start "rule__StringVariableDeclaration__Group__3__Impl"
    // InternalTrader.g:2023:1: rule__StringVariableDeclaration__Group__3__Impl : ( 'String' ) ;
    public final void rule__StringVariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2027:1: ( ( 'String' ) )
            // InternalTrader.g:2028:1: ( 'String' )
            {
            // InternalTrader.g:2028:1: ( 'String' )
            // InternalTrader.g:2029:2: 'String'
            {
             before(grammarAccess.getStringVariableDeclarationAccess().getStringKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStringVariableDeclarationAccess().getStringKeyword_3()); 

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
    // $ANTLR end "rule__StringVariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__StringVariableDeclaration__Group__4"
    // InternalTrader.g:2038:1: rule__StringVariableDeclaration__Group__4 : rule__StringVariableDeclaration__Group__4__Impl rule__StringVariableDeclaration__Group__5 ;
    public final void rule__StringVariableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2042:1: ( rule__StringVariableDeclaration__Group__4__Impl rule__StringVariableDeclaration__Group__5 )
            // InternalTrader.g:2043:2: rule__StringVariableDeclaration__Group__4__Impl rule__StringVariableDeclaration__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__StringVariableDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringVariableDeclaration__Group__5();

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
    // $ANTLR end "rule__StringVariableDeclaration__Group__4"


    // $ANTLR start "rule__StringVariableDeclaration__Group__4__Impl"
    // InternalTrader.g:2050:1: rule__StringVariableDeclaration__Group__4__Impl : ( ':' ) ;
    public final void rule__StringVariableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2054:1: ( ( ':' ) )
            // InternalTrader.g:2055:1: ( ':' )
            {
            // InternalTrader.g:2055:1: ( ':' )
            // InternalTrader.g:2056:2: ':'
            {
             before(grammarAccess.getStringVariableDeclarationAccess().getColonKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStringVariableDeclarationAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__StringVariableDeclaration__Group__4__Impl"


    // $ANTLR start "rule__StringVariableDeclaration__Group__5"
    // InternalTrader.g:2065:1: rule__StringVariableDeclaration__Group__5 : rule__StringVariableDeclaration__Group__5__Impl ;
    public final void rule__StringVariableDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2069:1: ( rule__StringVariableDeclaration__Group__5__Impl )
            // InternalTrader.g:2070:2: rule__StringVariableDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringVariableDeclaration__Group__5__Impl();

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
    // $ANTLR end "rule__StringVariableDeclaration__Group__5"


    // $ANTLR start "rule__StringVariableDeclaration__Group__5__Impl"
    // InternalTrader.g:2076:1: rule__StringVariableDeclaration__Group__5__Impl : ( ( rule__StringVariableDeclaration__ValueAssignment_5 ) ) ;
    public final void rule__StringVariableDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2080:1: ( ( ( rule__StringVariableDeclaration__ValueAssignment_5 ) ) )
            // InternalTrader.g:2081:1: ( ( rule__StringVariableDeclaration__ValueAssignment_5 ) )
            {
            // InternalTrader.g:2081:1: ( ( rule__StringVariableDeclaration__ValueAssignment_5 ) )
            // InternalTrader.g:2082:2: ( rule__StringVariableDeclaration__ValueAssignment_5 )
            {
             before(grammarAccess.getStringVariableDeclarationAccess().getValueAssignment_5()); 
            // InternalTrader.g:2083:2: ( rule__StringVariableDeclaration__ValueAssignment_5 )
            // InternalTrader.g:2083:3: rule__StringVariableDeclaration__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__StringVariableDeclaration__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStringVariableDeclarationAccess().getValueAssignment_5()); 

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
    // $ANTLR end "rule__StringVariableDeclaration__Group__5__Impl"


    // $ANTLR start "rule__RealVariableDeclaration__Group__0"
    // InternalTrader.g:2092:1: rule__RealVariableDeclaration__Group__0 : rule__RealVariableDeclaration__Group__0__Impl rule__RealVariableDeclaration__Group__1 ;
    public final void rule__RealVariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2096:1: ( rule__RealVariableDeclaration__Group__0__Impl rule__RealVariableDeclaration__Group__1 )
            // InternalTrader.g:2097:2: rule__RealVariableDeclaration__Group__0__Impl rule__RealVariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__RealVariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealVariableDeclaration__Group__1();

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
    // $ANTLR end "rule__RealVariableDeclaration__Group__0"


    // $ANTLR start "rule__RealVariableDeclaration__Group__0__Impl"
    // InternalTrader.g:2104:1: rule__RealVariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__RealVariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2108:1: ( ( 'var' ) )
            // InternalTrader.g:2109:1: ( 'var' )
            {
            // InternalTrader.g:2109:1: ( 'var' )
            // InternalTrader.g:2110:2: 'var'
            {
             before(grammarAccess.getRealVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRealVariableDeclarationAccess().getVarKeyword_0()); 

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
    // $ANTLR end "rule__RealVariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__RealVariableDeclaration__Group__1"
    // InternalTrader.g:2119:1: rule__RealVariableDeclaration__Group__1 : rule__RealVariableDeclaration__Group__1__Impl rule__RealVariableDeclaration__Group__2 ;
    public final void rule__RealVariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2123:1: ( rule__RealVariableDeclaration__Group__1__Impl rule__RealVariableDeclaration__Group__2 )
            // InternalTrader.g:2124:2: rule__RealVariableDeclaration__Group__1__Impl rule__RealVariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__RealVariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealVariableDeclaration__Group__2();

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
    // $ANTLR end "rule__RealVariableDeclaration__Group__1"


    // $ANTLR start "rule__RealVariableDeclaration__Group__1__Impl"
    // InternalTrader.g:2131:1: rule__RealVariableDeclaration__Group__1__Impl : ( ( rule__RealVariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__RealVariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2135:1: ( ( ( rule__RealVariableDeclaration__NameAssignment_1 ) ) )
            // InternalTrader.g:2136:1: ( ( rule__RealVariableDeclaration__NameAssignment_1 ) )
            {
            // InternalTrader.g:2136:1: ( ( rule__RealVariableDeclaration__NameAssignment_1 ) )
            // InternalTrader.g:2137:2: ( rule__RealVariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getRealVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalTrader.g:2138:2: ( rule__RealVariableDeclaration__NameAssignment_1 )
            // InternalTrader.g:2138:3: rule__RealVariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RealVariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRealVariableDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RealVariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__RealVariableDeclaration__Group__2"
    // InternalTrader.g:2146:1: rule__RealVariableDeclaration__Group__2 : rule__RealVariableDeclaration__Group__2__Impl rule__RealVariableDeclaration__Group__3 ;
    public final void rule__RealVariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2150:1: ( rule__RealVariableDeclaration__Group__2__Impl rule__RealVariableDeclaration__Group__3 )
            // InternalTrader.g:2151:2: rule__RealVariableDeclaration__Group__2__Impl rule__RealVariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__RealVariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealVariableDeclaration__Group__3();

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
    // $ANTLR end "rule__RealVariableDeclaration__Group__2"


    // $ANTLR start "rule__RealVariableDeclaration__Group__2__Impl"
    // InternalTrader.g:2158:1: rule__RealVariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__RealVariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2162:1: ( ( '=' ) )
            // InternalTrader.g:2163:1: ( '=' )
            {
            // InternalTrader.g:2163:1: ( '=' )
            // InternalTrader.g:2164:2: '='
            {
             before(grammarAccess.getRealVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRealVariableDeclarationAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__RealVariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__RealVariableDeclaration__Group__3"
    // InternalTrader.g:2173:1: rule__RealVariableDeclaration__Group__3 : rule__RealVariableDeclaration__Group__3__Impl rule__RealVariableDeclaration__Group__4 ;
    public final void rule__RealVariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2177:1: ( rule__RealVariableDeclaration__Group__3__Impl rule__RealVariableDeclaration__Group__4 )
            // InternalTrader.g:2178:2: rule__RealVariableDeclaration__Group__3__Impl rule__RealVariableDeclaration__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__RealVariableDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealVariableDeclaration__Group__4();

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
    // $ANTLR end "rule__RealVariableDeclaration__Group__3"


    // $ANTLR start "rule__RealVariableDeclaration__Group__3__Impl"
    // InternalTrader.g:2185:1: rule__RealVariableDeclaration__Group__3__Impl : ( 'Real' ) ;
    public final void rule__RealVariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2189:1: ( ( 'Real' ) )
            // InternalTrader.g:2190:1: ( 'Real' )
            {
            // InternalTrader.g:2190:1: ( 'Real' )
            // InternalTrader.g:2191:2: 'Real'
            {
             before(grammarAccess.getRealVariableDeclarationAccess().getRealKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRealVariableDeclarationAccess().getRealKeyword_3()); 

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
    // $ANTLR end "rule__RealVariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__RealVariableDeclaration__Group__4"
    // InternalTrader.g:2200:1: rule__RealVariableDeclaration__Group__4 : rule__RealVariableDeclaration__Group__4__Impl rule__RealVariableDeclaration__Group__5 ;
    public final void rule__RealVariableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2204:1: ( rule__RealVariableDeclaration__Group__4__Impl rule__RealVariableDeclaration__Group__5 )
            // InternalTrader.g:2205:2: rule__RealVariableDeclaration__Group__4__Impl rule__RealVariableDeclaration__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__RealVariableDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealVariableDeclaration__Group__5();

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
    // $ANTLR end "rule__RealVariableDeclaration__Group__4"


    // $ANTLR start "rule__RealVariableDeclaration__Group__4__Impl"
    // InternalTrader.g:2212:1: rule__RealVariableDeclaration__Group__4__Impl : ( ':' ) ;
    public final void rule__RealVariableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2216:1: ( ( ':' ) )
            // InternalTrader.g:2217:1: ( ':' )
            {
            // InternalTrader.g:2217:1: ( ':' )
            // InternalTrader.g:2218:2: ':'
            {
             before(grammarAccess.getRealVariableDeclarationAccess().getColonKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRealVariableDeclarationAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__RealVariableDeclaration__Group__4__Impl"


    // $ANTLR start "rule__RealVariableDeclaration__Group__5"
    // InternalTrader.g:2227:1: rule__RealVariableDeclaration__Group__5 : rule__RealVariableDeclaration__Group__5__Impl ;
    public final void rule__RealVariableDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2231:1: ( rule__RealVariableDeclaration__Group__5__Impl )
            // InternalTrader.g:2232:2: rule__RealVariableDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RealVariableDeclaration__Group__5__Impl();

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
    // $ANTLR end "rule__RealVariableDeclaration__Group__5"


    // $ANTLR start "rule__RealVariableDeclaration__Group__5__Impl"
    // InternalTrader.g:2238:1: rule__RealVariableDeclaration__Group__5__Impl : ( ( rule__RealVariableDeclaration__ValueAssignment_5 ) ) ;
    public final void rule__RealVariableDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2242:1: ( ( ( rule__RealVariableDeclaration__ValueAssignment_5 ) ) )
            // InternalTrader.g:2243:1: ( ( rule__RealVariableDeclaration__ValueAssignment_5 ) )
            {
            // InternalTrader.g:2243:1: ( ( rule__RealVariableDeclaration__ValueAssignment_5 ) )
            // InternalTrader.g:2244:2: ( rule__RealVariableDeclaration__ValueAssignment_5 )
            {
             before(grammarAccess.getRealVariableDeclarationAccess().getValueAssignment_5()); 
            // InternalTrader.g:2245:2: ( rule__RealVariableDeclaration__ValueAssignment_5 )
            // InternalTrader.g:2245:3: rule__RealVariableDeclaration__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RealVariableDeclaration__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRealVariableDeclarationAccess().getValueAssignment_5()); 

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
    // $ANTLR end "rule__RealVariableDeclaration__Group__5__Impl"


    // $ANTLR start "rule__LoopStatement__Group__0"
    // InternalTrader.g:2254:1: rule__LoopStatement__Group__0 : rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 ;
    public final void rule__LoopStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2258:1: ( rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 )
            // InternalTrader.g:2259:2: rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalTrader.g:2266:1: rule__LoopStatement__Group__0__Impl : ( 'loop' ) ;
    public final void rule__LoopStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2270:1: ( ( 'loop' ) )
            // InternalTrader.g:2271:1: ( 'loop' )
            {
            // InternalTrader.g:2271:1: ( 'loop' )
            // InternalTrader.g:2272:2: 'loop'
            {
             before(grammarAccess.getLoopStatementAccess().getLoopKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLoopStatementAccess().getLoopKeyword_0()); 

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
    // InternalTrader.g:2281:1: rule__LoopStatement__Group__1 : rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2 ;
    public final void rule__LoopStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2285:1: ( rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2 )
            // InternalTrader.g:2286:2: rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalTrader.g:2293:1: rule__LoopStatement__Group__1__Impl : ( ( rule__LoopStatement__CountAssignment_1 ) ) ;
    public final void rule__LoopStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2297:1: ( ( ( rule__LoopStatement__CountAssignment_1 ) ) )
            // InternalTrader.g:2298:1: ( ( rule__LoopStatement__CountAssignment_1 ) )
            {
            // InternalTrader.g:2298:1: ( ( rule__LoopStatement__CountAssignment_1 ) )
            // InternalTrader.g:2299:2: ( rule__LoopStatement__CountAssignment_1 )
            {
             before(grammarAccess.getLoopStatementAccess().getCountAssignment_1()); 
            // InternalTrader.g:2300:2: ( rule__LoopStatement__CountAssignment_1 )
            // InternalTrader.g:2300:3: rule__LoopStatement__CountAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LoopStatement__CountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopStatementAccess().getCountAssignment_1()); 

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
    // InternalTrader.g:2308:1: rule__LoopStatement__Group__2 : rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3 ;
    public final void rule__LoopStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2312:1: ( rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3 )
            // InternalTrader.g:2313:2: rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalTrader.g:2320:1: rule__LoopStatement__Group__2__Impl : ( 'times' ) ;
    public final void rule__LoopStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2324:1: ( ( 'times' ) )
            // InternalTrader.g:2325:1: ( 'times' )
            {
            // InternalTrader.g:2325:1: ( 'times' )
            // InternalTrader.g:2326:2: 'times'
            {
             before(grammarAccess.getLoopStatementAccess().getTimesKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLoopStatementAccess().getTimesKeyword_2()); 

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
    // InternalTrader.g:2335:1: rule__LoopStatement__Group__3 : rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4 ;
    public final void rule__LoopStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2339:1: ( rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4 )
            // InternalTrader.g:2340:2: rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalTrader.g:2347:1: rule__LoopStatement__Group__3__Impl : ( 'do' ) ;
    public final void rule__LoopStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2351:1: ( ( 'do' ) )
            // InternalTrader.g:2352:1: ( 'do' )
            {
            // InternalTrader.g:2352:1: ( 'do' )
            // InternalTrader.g:2353:2: 'do'
            {
             before(grammarAccess.getLoopStatementAccess().getDoKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLoopStatementAccess().getDoKeyword_3()); 

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
    // InternalTrader.g:2362:1: rule__LoopStatement__Group__4 : rule__LoopStatement__Group__4__Impl rule__LoopStatement__Group__5 ;
    public final void rule__LoopStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2366:1: ( rule__LoopStatement__Group__4__Impl rule__LoopStatement__Group__5 )
            // InternalTrader.g:2367:2: rule__LoopStatement__Group__4__Impl rule__LoopStatement__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__LoopStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__5();

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
    // InternalTrader.g:2374:1: rule__LoopStatement__Group__4__Impl : ( ( ( rule__LoopStatement__StatementsAssignment_4 ) ) ( ( rule__LoopStatement__StatementsAssignment_4 )* ) ) ;
    public final void rule__LoopStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2378:1: ( ( ( ( rule__LoopStatement__StatementsAssignment_4 ) ) ( ( rule__LoopStatement__StatementsAssignment_4 )* ) ) )
            // InternalTrader.g:2379:1: ( ( ( rule__LoopStatement__StatementsAssignment_4 ) ) ( ( rule__LoopStatement__StatementsAssignment_4 )* ) )
            {
            // InternalTrader.g:2379:1: ( ( ( rule__LoopStatement__StatementsAssignment_4 ) ) ( ( rule__LoopStatement__StatementsAssignment_4 )* ) )
            // InternalTrader.g:2380:2: ( ( rule__LoopStatement__StatementsAssignment_4 ) ) ( ( rule__LoopStatement__StatementsAssignment_4 )* )
            {
            // InternalTrader.g:2380:2: ( ( rule__LoopStatement__StatementsAssignment_4 ) )
            // InternalTrader.g:2381:3: ( rule__LoopStatement__StatementsAssignment_4 )
            {
             before(grammarAccess.getLoopStatementAccess().getStatementsAssignment_4()); 
            // InternalTrader.g:2382:3: ( rule__LoopStatement__StatementsAssignment_4 )
            // InternalTrader.g:2382:4: rule__LoopStatement__StatementsAssignment_4
            {
            pushFollow(FOLLOW_3);
            rule__LoopStatement__StatementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLoopStatementAccess().getStatementsAssignment_4()); 

            }

            // InternalTrader.g:2385:2: ( ( rule__LoopStatement__StatementsAssignment_4 )* )
            // InternalTrader.g:2386:3: ( rule__LoopStatement__StatementsAssignment_4 )*
            {
             before(grammarAccess.getLoopStatementAccess().getStatementsAssignment_4()); 
            // InternalTrader.g:2387:3: ( rule__LoopStatement__StatementsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17||LA9_0==27||LA9_0==34||LA9_0==40||(LA9_0>=51 && LA9_0<=53)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTrader.g:2387:4: rule__LoopStatement__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__LoopStatement__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getLoopStatementAccess().getStatementsAssignment_4()); 

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
    // $ANTLR end "rule__LoopStatement__Group__4__Impl"


    // $ANTLR start "rule__LoopStatement__Group__5"
    // InternalTrader.g:2396:1: rule__LoopStatement__Group__5 : rule__LoopStatement__Group__5__Impl ;
    public final void rule__LoopStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2400:1: ( rule__LoopStatement__Group__5__Impl )
            // InternalTrader.g:2401:2: rule__LoopStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__5__Impl();

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
    // $ANTLR end "rule__LoopStatement__Group__5"


    // $ANTLR start "rule__LoopStatement__Group__5__Impl"
    // InternalTrader.g:2407:1: rule__LoopStatement__Group__5__Impl : ( 'end' ) ;
    public final void rule__LoopStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2411:1: ( ( 'end' ) )
            // InternalTrader.g:2412:1: ( 'end' )
            {
            // InternalTrader.g:2412:1: ( 'end' )
            // InternalTrader.g:2413:2: 'end'
            {
             before(grammarAccess.getLoopStatementAccess().getEndKeyword_5()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLoopStatementAccess().getEndKeyword_5()); 

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
    // $ANTLR end "rule__LoopStatement__Group__5__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalTrader.g:2423:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2427:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalTrader.g:2428:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
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
    // InternalTrader.g:2435:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2439:1: ( ( ( RULE_INT )? ) )
            // InternalTrader.g:2440:1: ( ( RULE_INT )? )
            {
            // InternalTrader.g:2440:1: ( ( RULE_INT )? )
            // InternalTrader.g:2441:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalTrader.g:2442:2: ( RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTrader.g:2442:3: RULE_INT
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
    // InternalTrader.g:2450:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2454:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalTrader.g:2455:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalTrader.g:2462:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2466:1: ( ( '.' ) )
            // InternalTrader.g:2467:1: ( '.' )
            {
            // InternalTrader.g:2467:1: ( '.' )
            // InternalTrader.g:2468:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalTrader.g:2477:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2481:1: ( rule__REAL__Group__2__Impl )
            // InternalTrader.g:2482:2: rule__REAL__Group__2__Impl
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
    // InternalTrader.g:2488:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2492:1: ( ( RULE_INT ) )
            // InternalTrader.g:2493:1: ( RULE_INT )
            {
            // InternalTrader.g:2493:1: ( RULE_INT )
            // InternalTrader.g:2494:2: RULE_INT
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
    // InternalTrader.g:2504:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2508:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalTrader.g:2509:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalTrader.g:2516:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2520:1: ( ( ruleMultiplication ) )
            // InternalTrader.g:2521:1: ( ruleMultiplication )
            {
            // InternalTrader.g:2521:1: ( ruleMultiplication )
            // InternalTrader.g:2522:2: ruleMultiplication
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
    // InternalTrader.g:2531:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2535:1: ( rule__Addition__Group__1__Impl )
            // InternalTrader.g:2536:2: rule__Addition__Group__1__Impl
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
    // InternalTrader.g:2542:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2546:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalTrader.g:2547:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalTrader.g:2547:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalTrader.g:2548:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalTrader.g:2549:2: ( rule__Addition__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=11 && LA11_0<=12)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTrader.g:2549:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
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
    // InternalTrader.g:2558:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2562:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalTrader.g:2563:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalTrader.g:2570:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2574:1: ( ( () ) )
            // InternalTrader.g:2575:1: ( () )
            {
            // InternalTrader.g:2575:1: ( () )
            // InternalTrader.g:2576:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalTrader.g:2577:2: ()
            // InternalTrader.g:2577:3: 
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
    // InternalTrader.g:2585:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2589:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalTrader.g:2590:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalTrader.g:2597:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2601:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalTrader.g:2602:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalTrader.g:2602:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalTrader.g:2603:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalTrader.g:2604:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalTrader.g:2604:3: rule__Addition__OperatorAssignment_1_1
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
    // InternalTrader.g:2612:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2616:1: ( rule__Addition__Group_1__2__Impl )
            // InternalTrader.g:2617:2: rule__Addition__Group_1__2__Impl
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
    // InternalTrader.g:2623:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2627:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalTrader.g:2628:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalTrader.g:2628:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalTrader.g:2629:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalTrader.g:2630:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalTrader.g:2630:3: rule__Addition__RightAssignment_1_2
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
    // InternalTrader.g:2639:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2643:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalTrader.g:2644:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalTrader.g:2651:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2655:1: ( ( rulePrimary ) )
            // InternalTrader.g:2656:1: ( rulePrimary )
            {
            // InternalTrader.g:2656:1: ( rulePrimary )
            // InternalTrader.g:2657:2: rulePrimary
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
    // InternalTrader.g:2666:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2670:1: ( rule__Multiplication__Group__1__Impl )
            // InternalTrader.g:2671:2: rule__Multiplication__Group__1__Impl
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
    // InternalTrader.g:2677:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2681:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalTrader.g:2682:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalTrader.g:2682:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalTrader.g:2683:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalTrader.g:2684:2: ( rule__Multiplication__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=13 && LA12_0<=14)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTrader.g:2684:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
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
    // InternalTrader.g:2693:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2697:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalTrader.g:2698:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalTrader.g:2705:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2709:1: ( ( () ) )
            // InternalTrader.g:2710:1: ( () )
            {
            // InternalTrader.g:2710:1: ( () )
            // InternalTrader.g:2711:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalTrader.g:2712:2: ()
            // InternalTrader.g:2712:3: 
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
    // InternalTrader.g:2720:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2724:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalTrader.g:2725:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalTrader.g:2732:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2736:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalTrader.g:2737:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalTrader.g:2737:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalTrader.g:2738:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalTrader.g:2739:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalTrader.g:2739:3: rule__Multiplication__OperatorAssignment_1_1
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
    // InternalTrader.g:2747:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2751:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalTrader.g:2752:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalTrader.g:2758:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2762:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalTrader.g:2763:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalTrader.g:2763:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalTrader.g:2764:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalTrader.g:2765:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalTrader.g:2765:3: rule__Multiplication__RightAssignment_1_2
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
    // InternalTrader.g:2774:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2778:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalTrader.g:2779:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalTrader.g:2786:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2790:1: ( ( '(' ) )
            // InternalTrader.g:2791:1: ( '(' )
            {
            // InternalTrader.g:2791:1: ( '(' )
            // InternalTrader.g:2792:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalTrader.g:2801:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2805:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalTrader.g:2806:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalTrader.g:2813:1: rule__Primary__Group_2__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2817:1: ( ( ruleAddition ) )
            // InternalTrader.g:2818:1: ( ruleAddition )
            {
            // InternalTrader.g:2818:1: ( ruleAddition )
            // InternalTrader.g:2819:2: ruleAddition
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
    // InternalTrader.g:2828:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2832:1: ( rule__Primary__Group_2__2__Impl )
            // InternalTrader.g:2833:2: rule__Primary__Group_2__2__Impl
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
    // InternalTrader.g:2839:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2843:1: ( ( ')' ) )
            // InternalTrader.g:2844:1: ( ')' )
            {
            // InternalTrader.g:2844:1: ( ')' )
            // InternalTrader.g:2845:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalTrader.g:2855:1: rule__Buy__Group__0 : rule__Buy__Group__0__Impl rule__Buy__Group__1 ;
    public final void rule__Buy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2859:1: ( rule__Buy__Group__0__Impl rule__Buy__Group__1 )
            // InternalTrader.g:2860:2: rule__Buy__Group__0__Impl rule__Buy__Group__1
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
    // InternalTrader.g:2867:1: rule__Buy__Group__0__Impl : ( 'buy' ) ;
    public final void rule__Buy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2871:1: ( ( 'buy' ) )
            // InternalTrader.g:2872:1: ( 'buy' )
            {
            // InternalTrader.g:2872:1: ( 'buy' )
            // InternalTrader.g:2873:2: 'buy'
            {
             before(grammarAccess.getBuyAccess().getBuyKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalTrader.g:2882:1: rule__Buy__Group__1 : rule__Buy__Group__1__Impl rule__Buy__Group__2 ;
    public final void rule__Buy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2886:1: ( rule__Buy__Group__1__Impl rule__Buy__Group__2 )
            // InternalTrader.g:2887:2: rule__Buy__Group__1__Impl rule__Buy__Group__2
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
    // InternalTrader.g:2894:1: rule__Buy__Group__1__Impl : ( ( rule__Buy__QuantityAssignment_1 ) ) ;
    public final void rule__Buy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2898:1: ( ( ( rule__Buy__QuantityAssignment_1 ) ) )
            // InternalTrader.g:2899:1: ( ( rule__Buy__QuantityAssignment_1 ) )
            {
            // InternalTrader.g:2899:1: ( ( rule__Buy__QuantityAssignment_1 ) )
            // InternalTrader.g:2900:2: ( rule__Buy__QuantityAssignment_1 )
            {
             before(grammarAccess.getBuyAccess().getQuantityAssignment_1()); 
            // InternalTrader.g:2901:2: ( rule__Buy__QuantityAssignment_1 )
            // InternalTrader.g:2901:3: rule__Buy__QuantityAssignment_1
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
    // InternalTrader.g:2909:1: rule__Buy__Group__2 : rule__Buy__Group__2__Impl rule__Buy__Group__3 ;
    public final void rule__Buy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2913:1: ( rule__Buy__Group__2__Impl rule__Buy__Group__3 )
            // InternalTrader.g:2914:2: rule__Buy__Group__2__Impl rule__Buy__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalTrader.g:2921:1: rule__Buy__Group__2__Impl : ( ( rule__Buy__TickerAssignment_2 ) ) ;
    public final void rule__Buy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2925:1: ( ( ( rule__Buy__TickerAssignment_2 ) ) )
            // InternalTrader.g:2926:1: ( ( rule__Buy__TickerAssignment_2 ) )
            {
            // InternalTrader.g:2926:1: ( ( rule__Buy__TickerAssignment_2 ) )
            // InternalTrader.g:2927:2: ( rule__Buy__TickerAssignment_2 )
            {
             before(grammarAccess.getBuyAccess().getTickerAssignment_2()); 
            // InternalTrader.g:2928:2: ( rule__Buy__TickerAssignment_2 )
            // InternalTrader.g:2928:3: rule__Buy__TickerAssignment_2
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
    // InternalTrader.g:2936:1: rule__Buy__Group__3 : rule__Buy__Group__3__Impl rule__Buy__Group__4 ;
    public final void rule__Buy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2940:1: ( rule__Buy__Group__3__Impl rule__Buy__Group__4 )
            // InternalTrader.g:2941:2: rule__Buy__Group__3__Impl rule__Buy__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalTrader.g:2948:1: rule__Buy__Group__3__Impl : ( 'at' ) ;
    public final void rule__Buy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2952:1: ( ( 'at' ) )
            // InternalTrader.g:2953:1: ( 'at' )
            {
            // InternalTrader.g:2953:1: ( 'at' )
            // InternalTrader.g:2954:2: 'at'
            {
             before(grammarAccess.getBuyAccess().getAtKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalTrader.g:2963:1: rule__Buy__Group__4 : rule__Buy__Group__4__Impl rule__Buy__Group__5 ;
    public final void rule__Buy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2967:1: ( rule__Buy__Group__4__Impl rule__Buy__Group__5 )
            // InternalTrader.g:2968:2: rule__Buy__Group__4__Impl rule__Buy__Group__5
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
    // InternalTrader.g:2975:1: rule__Buy__Group__4__Impl : ( 'price' ) ;
    public final void rule__Buy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2979:1: ( ( 'price' ) )
            // InternalTrader.g:2980:1: ( 'price' )
            {
            // InternalTrader.g:2980:1: ( 'price' )
            // InternalTrader.g:2981:2: 'price'
            {
             before(grammarAccess.getBuyAccess().getPriceKeyword_4()); 
            match(input,49,FOLLOW_2); 
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
    // InternalTrader.g:2990:1: rule__Buy__Group__5 : rule__Buy__Group__5__Impl ;
    public final void rule__Buy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2994:1: ( rule__Buy__Group__5__Impl )
            // InternalTrader.g:2995:2: rule__Buy__Group__5__Impl
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
    // InternalTrader.g:3001:1: rule__Buy__Group__5__Impl : ( ( rule__Buy__PriceAssignment_5 ) ) ;
    public final void rule__Buy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3005:1: ( ( ( rule__Buy__PriceAssignment_5 ) ) )
            // InternalTrader.g:3006:1: ( ( rule__Buy__PriceAssignment_5 ) )
            {
            // InternalTrader.g:3006:1: ( ( rule__Buy__PriceAssignment_5 ) )
            // InternalTrader.g:3007:2: ( rule__Buy__PriceAssignment_5 )
            {
             before(grammarAccess.getBuyAccess().getPriceAssignment_5()); 
            // InternalTrader.g:3008:2: ( rule__Buy__PriceAssignment_5 )
            // InternalTrader.g:3008:3: rule__Buy__PriceAssignment_5
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
    // InternalTrader.g:3017:1: rule__Sell__Group__0 : rule__Sell__Group__0__Impl rule__Sell__Group__1 ;
    public final void rule__Sell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3021:1: ( rule__Sell__Group__0__Impl rule__Sell__Group__1 )
            // InternalTrader.g:3022:2: rule__Sell__Group__0__Impl rule__Sell__Group__1
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
    // InternalTrader.g:3029:1: rule__Sell__Group__0__Impl : ( 'sell' ) ;
    public final void rule__Sell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3033:1: ( ( 'sell' ) )
            // InternalTrader.g:3034:1: ( 'sell' )
            {
            // InternalTrader.g:3034:1: ( 'sell' )
            // InternalTrader.g:3035:2: 'sell'
            {
             before(grammarAccess.getSellAccess().getSellKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalTrader.g:3044:1: rule__Sell__Group__1 : rule__Sell__Group__1__Impl rule__Sell__Group__2 ;
    public final void rule__Sell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3048:1: ( rule__Sell__Group__1__Impl rule__Sell__Group__2 )
            // InternalTrader.g:3049:2: rule__Sell__Group__1__Impl rule__Sell__Group__2
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
    // InternalTrader.g:3056:1: rule__Sell__Group__1__Impl : ( ( rule__Sell__QuantityAssignment_1 ) ) ;
    public final void rule__Sell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3060:1: ( ( ( rule__Sell__QuantityAssignment_1 ) ) )
            // InternalTrader.g:3061:1: ( ( rule__Sell__QuantityAssignment_1 ) )
            {
            // InternalTrader.g:3061:1: ( ( rule__Sell__QuantityAssignment_1 ) )
            // InternalTrader.g:3062:2: ( rule__Sell__QuantityAssignment_1 )
            {
             before(grammarAccess.getSellAccess().getQuantityAssignment_1()); 
            // InternalTrader.g:3063:2: ( rule__Sell__QuantityAssignment_1 )
            // InternalTrader.g:3063:3: rule__Sell__QuantityAssignment_1
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
    // InternalTrader.g:3071:1: rule__Sell__Group__2 : rule__Sell__Group__2__Impl rule__Sell__Group__3 ;
    public final void rule__Sell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3075:1: ( rule__Sell__Group__2__Impl rule__Sell__Group__3 )
            // InternalTrader.g:3076:2: rule__Sell__Group__2__Impl rule__Sell__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalTrader.g:3083:1: rule__Sell__Group__2__Impl : ( ( rule__Sell__TickerAssignment_2 ) ) ;
    public final void rule__Sell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3087:1: ( ( ( rule__Sell__TickerAssignment_2 ) ) )
            // InternalTrader.g:3088:1: ( ( rule__Sell__TickerAssignment_2 ) )
            {
            // InternalTrader.g:3088:1: ( ( rule__Sell__TickerAssignment_2 ) )
            // InternalTrader.g:3089:2: ( rule__Sell__TickerAssignment_2 )
            {
             before(grammarAccess.getSellAccess().getTickerAssignment_2()); 
            // InternalTrader.g:3090:2: ( rule__Sell__TickerAssignment_2 )
            // InternalTrader.g:3090:3: rule__Sell__TickerAssignment_2
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
    // InternalTrader.g:3098:1: rule__Sell__Group__3 : rule__Sell__Group__3__Impl rule__Sell__Group__4 ;
    public final void rule__Sell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3102:1: ( rule__Sell__Group__3__Impl rule__Sell__Group__4 )
            // InternalTrader.g:3103:2: rule__Sell__Group__3__Impl rule__Sell__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalTrader.g:3110:1: rule__Sell__Group__3__Impl : ( 'at' ) ;
    public final void rule__Sell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3114:1: ( ( 'at' ) )
            // InternalTrader.g:3115:1: ( 'at' )
            {
            // InternalTrader.g:3115:1: ( 'at' )
            // InternalTrader.g:3116:2: 'at'
            {
             before(grammarAccess.getSellAccess().getAtKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalTrader.g:3125:1: rule__Sell__Group__4 : rule__Sell__Group__4__Impl rule__Sell__Group__5 ;
    public final void rule__Sell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3129:1: ( rule__Sell__Group__4__Impl rule__Sell__Group__5 )
            // InternalTrader.g:3130:2: rule__Sell__Group__4__Impl rule__Sell__Group__5
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
    // InternalTrader.g:3137:1: rule__Sell__Group__4__Impl : ( 'price' ) ;
    public final void rule__Sell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3141:1: ( ( 'price' ) )
            // InternalTrader.g:3142:1: ( 'price' )
            {
            // InternalTrader.g:3142:1: ( 'price' )
            // InternalTrader.g:3143:2: 'price'
            {
             before(grammarAccess.getSellAccess().getPriceKeyword_4()); 
            match(input,49,FOLLOW_2); 
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
    // InternalTrader.g:3152:1: rule__Sell__Group__5 : rule__Sell__Group__5__Impl ;
    public final void rule__Sell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3156:1: ( rule__Sell__Group__5__Impl )
            // InternalTrader.g:3157:2: rule__Sell__Group__5__Impl
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
    // InternalTrader.g:3163:1: rule__Sell__Group__5__Impl : ( ( rule__Sell__PriceAssignment_5 ) ) ;
    public final void rule__Sell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3167:1: ( ( ( rule__Sell__PriceAssignment_5 ) ) )
            // InternalTrader.g:3168:1: ( ( rule__Sell__PriceAssignment_5 ) )
            {
            // InternalTrader.g:3168:1: ( ( rule__Sell__PriceAssignment_5 ) )
            // InternalTrader.g:3169:2: ( rule__Sell__PriceAssignment_5 )
            {
             before(grammarAccess.getSellAccess().getPriceAssignment_5()); 
            // InternalTrader.g:3170:2: ( rule__Sell__PriceAssignment_5 )
            // InternalTrader.g:3170:3: rule__Sell__PriceAssignment_5
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
    // InternalTrader.g:3179:1: rule__TraderProgram__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__TraderProgram__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3183:1: ( ( ruleStatement ) )
            // InternalTrader.g:3184:2: ( ruleStatement )
            {
            // InternalTrader.g:3184:2: ( ruleStatement )
            // InternalTrader.g:3185:3: ruleStatement
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
    // InternalTrader.g:3194:1: rule__Connect__BrokerNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Connect__BrokerNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3198:1: ( ( RULE_ID ) )
            // InternalTrader.g:3199:2: ( RULE_ID )
            {
            // InternalTrader.g:3199:2: ( RULE_ID )
            // InternalTrader.g:3200:3: RULE_ID
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
    // InternalTrader.g:3209:1: rule__Connect__ParametersAssignment_5 : ( ruleConnectParameters ) ;
    public final void rule__Connect__ParametersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3213:1: ( ( ruleConnectParameters ) )
            // InternalTrader.g:3214:2: ( ruleConnectParameters )
            {
            // InternalTrader.g:3214:2: ( ruleConnectParameters )
            // InternalTrader.g:3215:3: ruleConnectParameters
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
    // InternalTrader.g:3224:1: rule__ConnectParameters__UsernameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ConnectParameters__UsernameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3228:1: ( ( RULE_STRING ) )
            // InternalTrader.g:3229:2: ( RULE_STRING )
            {
            // InternalTrader.g:3229:2: ( RULE_STRING )
            // InternalTrader.g:3230:3: RULE_STRING
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
    // InternalTrader.g:3239:1: rule__ConnectParameters__PasswordAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ConnectParameters__PasswordAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3243:1: ( ( RULE_STRING ) )
            // InternalTrader.g:3244:2: ( RULE_STRING )
            {
            // InternalTrader.g:3244:2: ( RULE_STRING )
            // InternalTrader.g:3245:3: RULE_STRING
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
    // InternalTrader.g:3254:1: rule__ConnectParameters__LeverageAssignment_7 : ( ruleREAL ) ;
    public final void rule__ConnectParameters__LeverageAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3258:1: ( ( ruleREAL ) )
            // InternalTrader.g:3259:2: ( ruleREAL )
            {
            // InternalTrader.g:3259:2: ( ruleREAL )
            // InternalTrader.g:3260:3: ruleREAL
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
    // InternalTrader.g:3269:1: rule__ConnectParameters__MoneyAssignment_10 : ( ruleREAL ) ;
    public final void rule__ConnectParameters__MoneyAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3273:1: ( ( ruleREAL ) )
            // InternalTrader.g:3274:2: ( ruleREAL )
            {
            // InternalTrader.g:3274:2: ( ruleREAL )
            // InternalTrader.g:3275:3: ruleREAL
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
    // InternalTrader.g:3284:1: rule__ConnectParameters__TimeframeAssignment_13 : ( RULE_STRING ) ;
    public final void rule__ConnectParameters__TimeframeAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3288:1: ( ( RULE_STRING ) )
            // InternalTrader.g:3289:2: ( RULE_STRING )
            {
            // InternalTrader.g:3289:2: ( RULE_STRING )
            // InternalTrader.g:3290:3: RULE_STRING
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


    // $ANTLR start "rule__TradingBot__BotNameAssignment_2"
    // InternalTrader.g:3299:1: rule__TradingBot__BotNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TradingBot__BotNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3303:1: ( ( RULE_ID ) )
            // InternalTrader.g:3304:2: ( RULE_ID )
            {
            // InternalTrader.g:3304:2: ( RULE_ID )
            // InternalTrader.g:3305:3: RULE_ID
            {
             before(grammarAccess.getTradingBotAccess().getBotNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getBotNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__TradingBot__BotNameAssignment_2"


    // $ANTLR start "rule__TradingBot__StrategyAssignment_4"
    // InternalTrader.g:3314:1: rule__TradingBot__StrategyAssignment_4 : ( ruleStrategyDef ) ;
    public final void rule__TradingBot__StrategyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3318:1: ( ( ruleStrategyDef ) )
            // InternalTrader.g:3319:2: ( ruleStrategyDef )
            {
            // InternalTrader.g:3319:2: ( ruleStrategyDef )
            // InternalTrader.g:3320:3: ruleStrategyDef
            {
             before(grammarAccess.getTradingBotAccess().getStrategyStrategyDefEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStrategyDef();

            state._fsp--;

             after(grammarAccess.getTradingBotAccess().getStrategyStrategyDefEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__TradingBot__StrategyAssignment_4"


    // $ANTLR start "rule__TradingBot__FundsAssignment_7"
    // InternalTrader.g:3329:1: rule__TradingBot__FundsAssignment_7 : ( ruleREAL ) ;
    public final void rule__TradingBot__FundsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3333:1: ( ( ruleREAL ) )
            // InternalTrader.g:3334:2: ( ruleREAL )
            {
            // InternalTrader.g:3334:2: ( ruleREAL )
            // InternalTrader.g:3335:3: ruleREAL
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


    // $ANTLR start "rule__ListBots__ListCommandAssignment_0"
    // InternalTrader.g:3344:1: rule__ListBots__ListCommandAssignment_0 : ( ( 'see' ) ) ;
    public final void rule__ListBots__ListCommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3348:1: ( ( ( 'see' ) ) )
            // InternalTrader.g:3349:2: ( ( 'see' ) )
            {
            // InternalTrader.g:3349:2: ( ( 'see' ) )
            // InternalTrader.g:3350:3: ( 'see' )
            {
             before(grammarAccess.getListBotsAccess().getListCommandSeeKeyword_0_0()); 
            // InternalTrader.g:3351:3: ( 'see' )
            // InternalTrader.g:3352:4: 'see'
            {
             before(grammarAccess.getListBotsAccess().getListCommandSeeKeyword_0_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalTrader.g:3363:1: rule__Execute__ExecuteCommandAssignment_0 : ( ( 'execute' ) ) ;
    public final void rule__Execute__ExecuteCommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3367:1: ( ( ( 'execute' ) ) )
            // InternalTrader.g:3368:2: ( ( 'execute' ) )
            {
            // InternalTrader.g:3368:2: ( ( 'execute' ) )
            // InternalTrader.g:3369:3: ( 'execute' )
            {
             before(grammarAccess.getExecuteAccess().getExecuteCommandExecuteKeyword_0_0()); 
            // InternalTrader.g:3370:3: ( 'execute' )
            // InternalTrader.g:3371:4: 'execute'
            {
             before(grammarAccess.getExecuteAccess().getExecuteCommandExecuteKeyword_0_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalTrader.g:3382:1: rule__Stop__StopCommandAssignment_0 : ( ( 'stop' ) ) ;
    public final void rule__Stop__StopCommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3386:1: ( ( ( 'stop' ) ) )
            // InternalTrader.g:3387:2: ( ( 'stop' ) )
            {
            // InternalTrader.g:3387:2: ( ( 'stop' ) )
            // InternalTrader.g:3388:3: ( 'stop' )
            {
             before(grammarAccess.getStopAccess().getStopCommandStopKeyword_0_0()); 
            // InternalTrader.g:3389:3: ( 'stop' )
            // InternalTrader.g:3390:4: 'stop'
            {
             before(grammarAccess.getStopAccess().getStopCommandStopKeyword_0_0()); 
            match(input,53,FOLLOW_2); 
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


    // $ANTLR start "rule__IntVariableDeclaration__NameAssignment_1"
    // InternalTrader.g:3401:1: rule__IntVariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IntVariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3405:1: ( ( RULE_ID ) )
            // InternalTrader.g:3406:2: ( RULE_ID )
            {
            // InternalTrader.g:3406:2: ( RULE_ID )
            // InternalTrader.g:3407:3: RULE_ID
            {
             before(grammarAccess.getIntVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__IntVariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__IntVariableDeclaration__ValueAssignment_5"
    // InternalTrader.g:3416:1: rule__IntVariableDeclaration__ValueAssignment_5 : ( RULE_INT ) ;
    public final void rule__IntVariableDeclaration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3420:1: ( ( RULE_INT ) )
            // InternalTrader.g:3421:2: ( RULE_INT )
            {
            // InternalTrader.g:3421:2: ( RULE_INT )
            // InternalTrader.g:3422:3: RULE_INT
            {
             before(grammarAccess.getIntVariableDeclarationAccess().getValueINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntVariableDeclarationAccess().getValueINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__IntVariableDeclaration__ValueAssignment_5"


    // $ANTLR start "rule__StringVariableDeclaration__NameAssignment_1"
    // InternalTrader.g:3431:1: rule__StringVariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringVariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3435:1: ( ( RULE_ID ) )
            // InternalTrader.g:3436:2: ( RULE_ID )
            {
            // InternalTrader.g:3436:2: ( RULE_ID )
            // InternalTrader.g:3437:3: RULE_ID
            {
             before(grammarAccess.getStringVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__StringVariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__StringVariableDeclaration__ValueAssignment_5"
    // InternalTrader.g:3446:1: rule__StringVariableDeclaration__ValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__StringVariableDeclaration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3450:1: ( ( RULE_STRING ) )
            // InternalTrader.g:3451:2: ( RULE_STRING )
            {
            // InternalTrader.g:3451:2: ( RULE_STRING )
            // InternalTrader.g:3452:3: RULE_STRING
            {
             before(grammarAccess.getStringVariableDeclarationAccess().getValueSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringVariableDeclarationAccess().getValueSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__StringVariableDeclaration__ValueAssignment_5"


    // $ANTLR start "rule__RealVariableDeclaration__NameAssignment_1"
    // InternalTrader.g:3461:1: rule__RealVariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RealVariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3465:1: ( ( RULE_ID ) )
            // InternalTrader.g:3466:2: ( RULE_ID )
            {
            // InternalTrader.g:3466:2: ( RULE_ID )
            // InternalTrader.g:3467:3: RULE_ID
            {
             before(grammarAccess.getRealVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRealVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RealVariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__RealVariableDeclaration__ValueAssignment_5"
    // InternalTrader.g:3476:1: rule__RealVariableDeclaration__ValueAssignment_5 : ( ruleREAL ) ;
    public final void rule__RealVariableDeclaration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3480:1: ( ( ruleREAL ) )
            // InternalTrader.g:3481:2: ( ruleREAL )
            {
            // InternalTrader.g:3481:2: ( ruleREAL )
            // InternalTrader.g:3482:3: ruleREAL
            {
             before(grammarAccess.getRealVariableDeclarationAccess().getValueREALParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getRealVariableDeclarationAccess().getValueREALParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__RealVariableDeclaration__ValueAssignment_5"


    // $ANTLR start "rule__LoopStatement__CountAssignment_1"
    // InternalTrader.g:3491:1: rule__LoopStatement__CountAssignment_1 : ( ruleAddition ) ;
    public final void rule__LoopStatement__CountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3495:1: ( ( ruleAddition ) )
            // InternalTrader.g:3496:2: ( ruleAddition )
            {
            // InternalTrader.g:3496:2: ( ruleAddition )
            // InternalTrader.g:3497:3: ruleAddition
            {
             before(grammarAccess.getLoopStatementAccess().getCountAdditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getLoopStatementAccess().getCountAdditionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LoopStatement__CountAssignment_1"


    // $ANTLR start "rule__LoopStatement__StatementsAssignment_4"
    // InternalTrader.g:3506:1: rule__LoopStatement__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__LoopStatement__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3510:1: ( ( ruleStatement ) )
            // InternalTrader.g:3511:2: ( ruleStatement )
            {
            // InternalTrader.g:3511:2: ( ruleStatement )
            // InternalTrader.g:3512:3: ruleStatement
            {
             before(grammarAccess.getLoopStatementAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getLoopStatementAccess().getStatementsStatementParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__LoopStatement__StatementsAssignment_4"


    // $ANTLR start "rule__Addition__OperatorAssignment_1_1"
    // InternalTrader.g:3521:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3525:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalTrader.g:3526:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalTrader.g:3526:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalTrader.g:3527:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalTrader.g:3528:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalTrader.g:3528:4: rule__Addition__OperatorAlternatives_1_1_0
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
    // InternalTrader.g:3536:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3540:1: ( ( ruleMultiplication ) )
            // InternalTrader.g:3541:2: ( ruleMultiplication )
            {
            // InternalTrader.g:3541:2: ( ruleMultiplication )
            // InternalTrader.g:3542:3: ruleMultiplication
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
    // InternalTrader.g:3551:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3555:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalTrader.g:3556:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalTrader.g:3556:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalTrader.g:3557:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalTrader.g:3558:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalTrader.g:3558:4: rule__Multiplication__OperatorAlternatives_1_1_0
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
    // InternalTrader.g:3566:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3570:1: ( ( rulePrimary ) )
            // InternalTrader.g:3571:2: ( rulePrimary )
            {
            // InternalTrader.g:3571:2: ( rulePrimary )
            // InternalTrader.g:3572:3: rulePrimary
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
    // InternalTrader.g:3581:1: rule__IntLiteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3585:1: ( ( RULE_INT ) )
            // InternalTrader.g:3586:2: ( RULE_INT )
            {
            // InternalTrader.g:3586:2: ( RULE_INT )
            // InternalTrader.g:3587:3: RULE_INT
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
    // InternalTrader.g:3596:1: rule__IntVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IntVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3600:1: ( ( ( RULE_ID ) ) )
            // InternalTrader.g:3601:2: ( ( RULE_ID ) )
            {
            // InternalTrader.g:3601:2: ( ( RULE_ID ) )
            // InternalTrader.g:3602:3: ( RULE_ID )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarIntVariableDeclarationCrossReference_0()); 
            // InternalTrader.g:3603:3: ( RULE_ID )
            // InternalTrader.g:3604:4: RULE_ID
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarIntVariableDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntVarExpressionAccess().getVarIntVariableDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getIntVarExpressionAccess().getVarIntVariableDeclarationCrossReference_0()); 

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
    // InternalTrader.g:3615:1: rule__Buy__QuantityAssignment_1 : ( ruleREAL ) ;
    public final void rule__Buy__QuantityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3619:1: ( ( ruleREAL ) )
            // InternalTrader.g:3620:2: ( ruleREAL )
            {
            // InternalTrader.g:3620:2: ( ruleREAL )
            // InternalTrader.g:3621:3: ruleREAL
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
    // InternalTrader.g:3630:1: rule__Buy__TickerAssignment_2 : ( RULE_ID ) ;
    public final void rule__Buy__TickerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3634:1: ( ( RULE_ID ) )
            // InternalTrader.g:3635:2: ( RULE_ID )
            {
            // InternalTrader.g:3635:2: ( RULE_ID )
            // InternalTrader.g:3636:3: RULE_ID
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
    // InternalTrader.g:3645:1: rule__Buy__PriceAssignment_5 : ( ruleREAL ) ;
    public final void rule__Buy__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3649:1: ( ( ruleREAL ) )
            // InternalTrader.g:3650:2: ( ruleREAL )
            {
            // InternalTrader.g:3650:2: ( ruleREAL )
            // InternalTrader.g:3651:3: ruleREAL
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
    // InternalTrader.g:3660:1: rule__Sell__QuantityAssignment_1 : ( ruleREAL ) ;
    public final void rule__Sell__QuantityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3664:1: ( ( ruleREAL ) )
            // InternalTrader.g:3665:2: ( ruleREAL )
            {
            // InternalTrader.g:3665:2: ( ruleREAL )
            // InternalTrader.g:3666:3: ruleREAL
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
    // InternalTrader.g:3675:1: rule__Sell__TickerAssignment_2 : ( RULE_ID ) ;
    public final void rule__Sell__TickerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3679:1: ( ( RULE_ID ) )
            // InternalTrader.g:3680:2: ( RULE_ID )
            {
            // InternalTrader.g:3680:2: ( RULE_ID )
            // InternalTrader.g:3681:3: RULE_ID
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
    // InternalTrader.g:3690:1: rule__Sell__PriceAssignment_5 : ( ruleREAL ) ;
    public final void rule__Sell__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3694:1: ( ( ruleREAL ) )
            // InternalTrader.g:3695:2: ( ruleREAL )
            {
            // InternalTrader.g:3695:2: ( ruleREAL )
            // InternalTrader.g:3696:3: ruleREAL
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0038010408020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100000000010L});
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
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0038010408020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});

}