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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'buyAndHold'", "'meanReversion'", "'connect'", "'to'", "'broker'", "'with'", "'username:'", "','", "'password:'", "'leverage:'", "'money:'", "'timeframe:'", "'create'", "'bot'", "'strategy'", "'using'", "'funds'", "'registered'", "'bots'", "'var'", "'='", "'loop'", "'times'", "'do'", "'end'", "'.'", "'('", "')'", "'buy'", "'at'", "'price'", "'sell'", "'see'", "'execute'", "'stop'"
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

                if ( (LA1_0==17||LA1_0==27||LA1_0==34||LA1_0==36||(LA1_0>=47 && LA1_0<=49)) ) {
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


    // $ANTLR start "entryRuleConnectStatement"
    // InternalTrader.g:103:1: entryRuleConnectStatement : ruleConnectStatement EOF ;
    public final void entryRuleConnectStatement() throws RecognitionException {
        try {
            // InternalTrader.g:104:1: ( ruleConnectStatement EOF )
            // InternalTrader.g:105:1: ruleConnectStatement EOF
            {
             before(grammarAccess.getConnectStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleConnectStatement();

            state._fsp--;

             after(grammarAccess.getConnectStatementRule()); 
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
    // $ANTLR end "entryRuleConnectStatement"


    // $ANTLR start "ruleConnectStatement"
    // InternalTrader.g:112:1: ruleConnectStatement : ( ( rule__ConnectStatement__Group__0 ) ) ;
    public final void ruleConnectStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:116:2: ( ( ( rule__ConnectStatement__Group__0 ) ) )
            // InternalTrader.g:117:2: ( ( rule__ConnectStatement__Group__0 ) )
            {
            // InternalTrader.g:117:2: ( ( rule__ConnectStatement__Group__0 ) )
            // InternalTrader.g:118:3: ( rule__ConnectStatement__Group__0 )
            {
             before(grammarAccess.getConnectStatementAccess().getGroup()); 
            // InternalTrader.g:119:3: ( rule__ConnectStatement__Group__0 )
            // InternalTrader.g:119:4: rule__ConnectStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnectStatement"


    // $ANTLR start "entryRuleTradingBot"
    // InternalTrader.g:128:1: entryRuleTradingBot : ruleTradingBot EOF ;
    public final void entryRuleTradingBot() throws RecognitionException {
        try {
            // InternalTrader.g:129:1: ( ruleTradingBot EOF )
            // InternalTrader.g:130:1: ruleTradingBot EOF
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
    // InternalTrader.g:137:1: ruleTradingBot : ( ( rule__TradingBot__Group__0 ) ) ;
    public final void ruleTradingBot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:141:2: ( ( ( rule__TradingBot__Group__0 ) ) )
            // InternalTrader.g:142:2: ( ( rule__TradingBot__Group__0 ) )
            {
            // InternalTrader.g:142:2: ( ( rule__TradingBot__Group__0 ) )
            // InternalTrader.g:143:3: ( rule__TradingBot__Group__0 )
            {
             before(grammarAccess.getTradingBotAccess().getGroup()); 
            // InternalTrader.g:144:3: ( rule__TradingBot__Group__0 )
            // InternalTrader.g:144:4: rule__TradingBot__Group__0
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
    // InternalTrader.g:153:1: entryRuleListBots : ruleListBots EOF ;
    public final void entryRuleListBots() throws RecognitionException {
        try {
            // InternalTrader.g:154:1: ( ruleListBots EOF )
            // InternalTrader.g:155:1: ruleListBots EOF
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
    // InternalTrader.g:162:1: ruleListBots : ( ( rule__ListBots__Group__0 ) ) ;
    public final void ruleListBots() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:166:2: ( ( ( rule__ListBots__Group__0 ) ) )
            // InternalTrader.g:167:2: ( ( rule__ListBots__Group__0 ) )
            {
            // InternalTrader.g:167:2: ( ( rule__ListBots__Group__0 ) )
            // InternalTrader.g:168:3: ( rule__ListBots__Group__0 )
            {
             before(grammarAccess.getListBotsAccess().getGroup()); 
            // InternalTrader.g:169:3: ( rule__ListBots__Group__0 )
            // InternalTrader.g:169:4: rule__ListBots__Group__0
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


    // $ANTLR start "entryRuleStop"
    // InternalTrader.g:203:1: entryRuleStop : ruleStop EOF ;
    public final void entryRuleStop() throws RecognitionException {
        try {
            // InternalTrader.g:204:1: ( ruleStop EOF )
            // InternalTrader.g:205:1: ruleStop EOF
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
    // InternalTrader.g:212:1: ruleStop : ( ( rule__Stop__Group__0 ) ) ;
    public final void ruleStop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:216:2: ( ( ( rule__Stop__Group__0 ) ) )
            // InternalTrader.g:217:2: ( ( rule__Stop__Group__0 ) )
            {
            // InternalTrader.g:217:2: ( ( rule__Stop__Group__0 ) )
            // InternalTrader.g:218:3: ( rule__Stop__Group__0 )
            {
             before(grammarAccess.getStopAccess().getGroup()); 
            // InternalTrader.g:219:3: ( rule__Stop__Group__0 )
            // InternalTrader.g:219:4: rule__Stop__Group__0
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
    // InternalTrader.g:228:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalTrader.g:229:1: ( ruleVariableDeclaration EOF )
            // InternalTrader.g:230:1: ruleVariableDeclaration EOF
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
    // InternalTrader.g:237:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:241:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalTrader.g:242:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalTrader.g:242:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalTrader.g:243:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalTrader.g:244:3: ( rule__VariableDeclaration__Group__0 )
            // InternalTrader.g:244:4: rule__VariableDeclaration__Group__0
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


    // $ANTLR start "entryRuleStringValue"
    // InternalTrader.g:253:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalTrader.g:254:1: ( ruleStringValue EOF )
            // InternalTrader.g:255:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalTrader.g:262:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:266:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalTrader.g:267:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalTrader.g:267:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalTrader.g:268:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalTrader.g:269:3: ( rule__StringValue__ValueAssignment )
            // InternalTrader.g:269:4: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleRealValue"
    // InternalTrader.g:278:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // InternalTrader.g:279:1: ( ruleRealValue EOF )
            // InternalTrader.g:280:1: ruleRealValue EOF
            {
             before(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_1);
            ruleRealValue();

            state._fsp--;

             after(grammarAccess.getRealValueRule()); 
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
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // InternalTrader.g:287:1: ruleRealValue : ( ( rule__RealValue__ValueAssignment ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:291:2: ( ( ( rule__RealValue__ValueAssignment ) ) )
            // InternalTrader.g:292:2: ( ( rule__RealValue__ValueAssignment ) )
            {
            // InternalTrader.g:292:2: ( ( rule__RealValue__ValueAssignment ) )
            // InternalTrader.g:293:3: ( rule__RealValue__ValueAssignment )
            {
             before(grammarAccess.getRealValueAccess().getValueAssignment()); 
            // InternalTrader.g:294:3: ( rule__RealValue__ValueAssignment )
            // InternalTrader.g:294:4: rule__RealValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RealValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRealValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalTrader.g:303:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalTrader.g:304:1: ( ruleIntValue EOF )
            // InternalTrader.g:305:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalTrader.g:312:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:316:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalTrader.g:317:2: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalTrader.g:317:2: ( ( rule__IntValue__ValueAssignment ) )
            // InternalTrader.g:318:3: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // InternalTrader.g:319:3: ( rule__IntValue__ValueAssignment )
            // InternalTrader.g:319:4: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleLoopStatement"
    // InternalTrader.g:328:1: entryRuleLoopStatement : ruleLoopStatement EOF ;
    public final void entryRuleLoopStatement() throws RecognitionException {
        try {
            // InternalTrader.g:329:1: ( ruleLoopStatement EOF )
            // InternalTrader.g:330:1: ruleLoopStatement EOF
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
    // InternalTrader.g:337:1: ruleLoopStatement : ( ( rule__LoopStatement__Group__0 ) ) ;
    public final void ruleLoopStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:341:2: ( ( ( rule__LoopStatement__Group__0 ) ) )
            // InternalTrader.g:342:2: ( ( rule__LoopStatement__Group__0 ) )
            {
            // InternalTrader.g:342:2: ( ( rule__LoopStatement__Group__0 ) )
            // InternalTrader.g:343:3: ( rule__LoopStatement__Group__0 )
            {
             before(grammarAccess.getLoopStatementAccess().getGroup()); 
            // InternalTrader.g:344:3: ( rule__LoopStatement__Group__0 )
            // InternalTrader.g:344:4: rule__LoopStatement__Group__0
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
    // InternalTrader.g:353:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTrader.g:357:1: ( ruleREAL EOF )
            // InternalTrader.g:358:1: ruleREAL EOF
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
    // InternalTrader.g:368:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:373:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalTrader.g:374:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalTrader.g:374:2: ( ( rule__REAL__Group__0 ) )
            // InternalTrader.g:375:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalTrader.g:376:3: ( rule__REAL__Group__0 )
            // InternalTrader.g:376:4: rule__REAL__Group__0
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
    // InternalTrader.g:386:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalTrader.g:387:1: ( ruleAddition EOF )
            // InternalTrader.g:388:1: ruleAddition EOF
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
    // InternalTrader.g:395:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:399:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalTrader.g:400:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalTrader.g:400:2: ( ( rule__Addition__Group__0 ) )
            // InternalTrader.g:401:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalTrader.g:402:3: ( rule__Addition__Group__0 )
            // InternalTrader.g:402:4: rule__Addition__Group__0
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
    // InternalTrader.g:411:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalTrader.g:412:1: ( ruleMultiplication EOF )
            // InternalTrader.g:413:1: ruleMultiplication EOF
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
    // InternalTrader.g:420:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:424:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalTrader.g:425:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalTrader.g:425:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalTrader.g:426:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalTrader.g:427:3: ( rule__Multiplication__Group__0 )
            // InternalTrader.g:427:4: rule__Multiplication__Group__0
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
    // InternalTrader.g:436:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalTrader.g:437:1: ( rulePrimary EOF )
            // InternalTrader.g:438:1: rulePrimary EOF
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
    // InternalTrader.g:445:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:449:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalTrader.g:450:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalTrader.g:450:2: ( ( rule__Primary__Alternatives ) )
            // InternalTrader.g:451:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalTrader.g:452:3: ( rule__Primary__Alternatives )
            // InternalTrader.g:452:4: rule__Primary__Alternatives
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


    // $ANTLR start "entryRuleNumVarExpression"
    // InternalTrader.g:461:1: entryRuleNumVarExpression : ruleNumVarExpression EOF ;
    public final void entryRuleNumVarExpression() throws RecognitionException {
        try {
            // InternalTrader.g:462:1: ( ruleNumVarExpression EOF )
            // InternalTrader.g:463:1: ruleNumVarExpression EOF
            {
             before(grammarAccess.getNumVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNumVarExpression();

            state._fsp--;

             after(grammarAccess.getNumVarExpressionRule()); 
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
    // $ANTLR end "entryRuleNumVarExpression"


    // $ANTLR start "ruleNumVarExpression"
    // InternalTrader.g:470:1: ruleNumVarExpression : ( ( rule__NumVarExpression__VarAssignment ) ) ;
    public final void ruleNumVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:474:2: ( ( ( rule__NumVarExpression__VarAssignment ) ) )
            // InternalTrader.g:475:2: ( ( rule__NumVarExpression__VarAssignment ) )
            {
            // InternalTrader.g:475:2: ( ( rule__NumVarExpression__VarAssignment ) )
            // InternalTrader.g:476:3: ( rule__NumVarExpression__VarAssignment )
            {
             before(grammarAccess.getNumVarExpressionAccess().getVarAssignment()); 
            // InternalTrader.g:477:3: ( rule__NumVarExpression__VarAssignment )
            // InternalTrader.g:477:4: rule__NumVarExpression__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumVarExpression__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumVarExpressionAccess().getVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumVarExpression"


    // $ANTLR start "entryRuleStringPrimary"
    // InternalTrader.g:486:1: entryRuleStringPrimary : ruleStringPrimary EOF ;
    public final void entryRuleStringPrimary() throws RecognitionException {
        try {
            // InternalTrader.g:487:1: ( ruleStringPrimary EOF )
            // InternalTrader.g:488:1: ruleStringPrimary EOF
            {
             before(grammarAccess.getStringPrimaryRule()); 
            pushFollow(FOLLOW_1);
            ruleStringPrimary();

            state._fsp--;

             after(grammarAccess.getStringPrimaryRule()); 
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
    // $ANTLR end "entryRuleStringPrimary"


    // $ANTLR start "ruleStringPrimary"
    // InternalTrader.g:495:1: ruleStringPrimary : ( ( rule__StringPrimary__Alternatives ) ) ;
    public final void ruleStringPrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:499:2: ( ( ( rule__StringPrimary__Alternatives ) ) )
            // InternalTrader.g:500:2: ( ( rule__StringPrimary__Alternatives ) )
            {
            // InternalTrader.g:500:2: ( ( rule__StringPrimary__Alternatives ) )
            // InternalTrader.g:501:3: ( rule__StringPrimary__Alternatives )
            {
             before(grammarAccess.getStringPrimaryAccess().getAlternatives()); 
            // InternalTrader.g:502:3: ( rule__StringPrimary__Alternatives )
            // InternalTrader.g:502:4: rule__StringPrimary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StringPrimary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringPrimary"


    // $ANTLR start "entryRuleStringVarExpression"
    // InternalTrader.g:511:1: entryRuleStringVarExpression : ruleStringVarExpression EOF ;
    public final void entryRuleStringVarExpression() throws RecognitionException {
        try {
            // InternalTrader.g:512:1: ( ruleStringVarExpression EOF )
            // InternalTrader.g:513:1: ruleStringVarExpression EOF
            {
             before(grammarAccess.getStringVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleStringVarExpression();

            state._fsp--;

             after(grammarAccess.getStringVarExpressionRule()); 
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
    // $ANTLR end "entryRuleStringVarExpression"


    // $ANTLR start "ruleStringVarExpression"
    // InternalTrader.g:520:1: ruleStringVarExpression : ( ( rule__StringVarExpression__VarAssignment ) ) ;
    public final void ruleStringVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:524:2: ( ( ( rule__StringVarExpression__VarAssignment ) ) )
            // InternalTrader.g:525:2: ( ( rule__StringVarExpression__VarAssignment ) )
            {
            // InternalTrader.g:525:2: ( ( rule__StringVarExpression__VarAssignment ) )
            // InternalTrader.g:526:3: ( rule__StringVarExpression__VarAssignment )
            {
             before(grammarAccess.getStringVarExpressionAccess().getVarAssignment()); 
            // InternalTrader.g:527:3: ( rule__StringVarExpression__VarAssignment )
            // InternalTrader.g:527:4: rule__StringVarExpression__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringVarExpression__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringVarExpressionAccess().getVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringVarExpression"


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
    // InternalTrader.g:601:1: rule__Statement__Alternatives : ( ( ruleConnectStatement ) | ( ruleTradingBot ) | ( ruleListBots ) | ( ruleExecute ) | ( ruleStop ) | ( ruleVariableDeclaration ) | ( ruleLoopStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:605:1: ( ( ruleConnectStatement ) | ( ruleTradingBot ) | ( ruleListBots ) | ( ruleExecute ) | ( ruleStop ) | ( ruleVariableDeclaration ) | ( ruleLoopStatement ) )
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
            case 47:
                {
                alt2=3;
                }
                break;
            case 48:
                {
                alt2=4;
                }
                break;
            case 49:
                {
                alt2=5;
                }
                break;
            case 34:
                {
                alt2=6;
                }
                break;
            case 36:
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
                    // InternalTrader.g:606:2: ( ruleConnectStatement )
                    {
                    // InternalTrader.g:606:2: ( ruleConnectStatement )
                    // InternalTrader.g:607:3: ruleConnectStatement
                    {
                     before(grammarAccess.getStatementAccess().getConnectStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConnectStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getConnectStatementParserRuleCall_0()); 

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


    // $ANTLR start "rule__VariableDeclaration__Alternatives_3"
    // InternalTrader.g:652:1: rule__VariableDeclaration__Alternatives_3 : ( ( ( rule__VariableDeclaration__ValueAssignment_3_0 ) ) | ( ( rule__VariableDeclaration__ValueAssignment_3_1 ) ) | ( ( rule__VariableDeclaration__ValueAssignment_3_2 ) ) );
    public final void rule__VariableDeclaration__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:656:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3_0 ) ) | ( ( rule__VariableDeclaration__ValueAssignment_3_1 ) ) | ( ( rule__VariableDeclaration__ValueAssignment_3_2 ) ) )
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

                if ( (LA3_2==40) ) {
                    alt3=2;
                }
                else if ( (LA3_2==EOF||LA3_2==17||LA3_2==27||LA3_2==34||LA3_2==36||LA3_2==39||(LA3_2>=47 && LA3_2<=49)) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 40:
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
                    // InternalTrader.g:657:2: ( ( rule__VariableDeclaration__ValueAssignment_3_0 ) )
                    {
                    // InternalTrader.g:657:2: ( ( rule__VariableDeclaration__ValueAssignment_3_0 ) )
                    // InternalTrader.g:658:3: ( rule__VariableDeclaration__ValueAssignment_3_0 )
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3_0()); 
                    // InternalTrader.g:659:3: ( rule__VariableDeclaration__ValueAssignment_3_0 )
                    // InternalTrader.g:659:4: rule__VariableDeclaration__ValueAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableDeclaration__ValueAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:663:2: ( ( rule__VariableDeclaration__ValueAssignment_3_1 ) )
                    {
                    // InternalTrader.g:663:2: ( ( rule__VariableDeclaration__ValueAssignment_3_1 ) )
                    // InternalTrader.g:664:3: ( rule__VariableDeclaration__ValueAssignment_3_1 )
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3_1()); 
                    // InternalTrader.g:665:3: ( rule__VariableDeclaration__ValueAssignment_3_1 )
                    // InternalTrader.g:665:4: rule__VariableDeclaration__ValueAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableDeclaration__ValueAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTrader.g:669:2: ( ( rule__VariableDeclaration__ValueAssignment_3_2 ) )
                    {
                    // InternalTrader.g:669:2: ( ( rule__VariableDeclaration__ValueAssignment_3_2 ) )
                    // InternalTrader.g:670:3: ( rule__VariableDeclaration__ValueAssignment_3_2 )
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3_2()); 
                    // InternalTrader.g:671:3: ( rule__VariableDeclaration__ValueAssignment_3_2 )
                    // InternalTrader.g:671:4: rule__VariableDeclaration__ValueAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableDeclaration__ValueAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3_2()); 

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
    // $ANTLR end "rule__VariableDeclaration__Alternatives_3"


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
    // InternalTrader.g:721:1: rule__Primary__Alternatives : ( ( ruleIntValue ) | ( ruleRealValue ) | ( ruleNumVarExpression ) | ( ( rule__Primary__Group_3__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:725:1: ( ( ruleIntValue ) | ( ruleRealValue ) | ( ruleNumVarExpression ) | ( ( rule__Primary__Group_3__0 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==40) ) {
                    alt6=2;
                }
                else if ( (LA6_1==EOF||LA6_1==RULE_ID||(LA6_1>=11 && LA6_1<=14)||LA6_1==22||LA6_1==31||LA6_1==37||LA6_1==42) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            case 41:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTrader.g:726:2: ( ruleIntValue )
                    {
                    // InternalTrader.g:726:2: ( ruleIntValue )
                    // InternalTrader.g:727:3: ruleIntValue
                    {
                     before(grammarAccess.getPrimaryAccess().getIntValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIntValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:732:2: ( ruleRealValue )
                    {
                    // InternalTrader.g:732:2: ( ruleRealValue )
                    // InternalTrader.g:733:3: ruleRealValue
                    {
                     before(grammarAccess.getPrimaryAccess().getRealValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRealValue();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getRealValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTrader.g:738:2: ( ruleNumVarExpression )
                    {
                    // InternalTrader.g:738:2: ( ruleNumVarExpression )
                    // InternalTrader.g:739:3: ruleNumVarExpression
                    {
                     before(grammarAccess.getPrimaryAccess().getNumVarExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNumVarExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNumVarExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTrader.g:744:2: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // InternalTrader.g:744:2: ( ( rule__Primary__Group_3__0 ) )
                    // InternalTrader.g:745:3: ( rule__Primary__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    // InternalTrader.g:746:3: ( rule__Primary__Group_3__0 )
                    // InternalTrader.g:746:4: rule__Primary__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_3()); 

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


    // $ANTLR start "rule__StringPrimary__Alternatives"
    // InternalTrader.g:754:1: rule__StringPrimary__Alternatives : ( ( ruleStringVarExpression ) | ( ruleStringValue ) );
    public final void rule__StringPrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:758:1: ( ( ruleStringVarExpression ) | ( ruleStringValue ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTrader.g:759:2: ( ruleStringVarExpression )
                    {
                    // InternalTrader.g:759:2: ( ruleStringVarExpression )
                    // InternalTrader.g:760:3: ruleStringVarExpression
                    {
                     before(grammarAccess.getStringPrimaryAccess().getStringVarExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringVarExpression();

                    state._fsp--;

                     after(grammarAccess.getStringPrimaryAccess().getStringVarExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:765:2: ( ruleStringValue )
                    {
                    // InternalTrader.g:765:2: ( ruleStringValue )
                    // InternalTrader.g:766:3: ruleStringValue
                    {
                     before(grammarAccess.getStringPrimaryAccess().getStringValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getStringPrimaryAccess().getStringValueParserRuleCall_1()); 

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
    // $ANTLR end "rule__StringPrimary__Alternatives"


    // $ANTLR start "rule__StrategyDef__Alternatives"
    // InternalTrader.g:775:1: rule__StrategyDef__Alternatives : ( ( ( 'buyAndHold' ) ) | ( ( 'meanReversion' ) ) );
    public final void rule__StrategyDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:779:1: ( ( ( 'buyAndHold' ) ) | ( ( 'meanReversion' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTrader.g:780:2: ( ( 'buyAndHold' ) )
                    {
                    // InternalTrader.g:780:2: ( ( 'buyAndHold' ) )
                    // InternalTrader.g:781:3: ( 'buyAndHold' )
                    {
                     before(grammarAccess.getStrategyDefAccess().getBuyAndHoldEnumLiteralDeclaration_0()); 
                    // InternalTrader.g:782:3: ( 'buyAndHold' )
                    // InternalTrader.g:782:4: 'buyAndHold'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getStrategyDefAccess().getBuyAndHoldEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:786:2: ( ( 'meanReversion' ) )
                    {
                    // InternalTrader.g:786:2: ( ( 'meanReversion' ) )
                    // InternalTrader.g:787:3: ( 'meanReversion' )
                    {
                     before(grammarAccess.getStrategyDefAccess().getMeanReversionEnumLiteralDeclaration_1()); 
                    // InternalTrader.g:788:3: ( 'meanReversion' )
                    // InternalTrader.g:788:4: 'meanReversion'
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


    // $ANTLR start "rule__ConnectStatement__Group__0"
    // InternalTrader.g:796:1: rule__ConnectStatement__Group__0 : rule__ConnectStatement__Group__0__Impl rule__ConnectStatement__Group__1 ;
    public final void rule__ConnectStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:800:1: ( rule__ConnectStatement__Group__0__Impl rule__ConnectStatement__Group__1 )
            // InternalTrader.g:801:2: rule__ConnectStatement__Group__0__Impl rule__ConnectStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ConnectStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__1();

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
    // $ANTLR end "rule__ConnectStatement__Group__0"


    // $ANTLR start "rule__ConnectStatement__Group__0__Impl"
    // InternalTrader.g:808:1: rule__ConnectStatement__Group__0__Impl : ( 'connect' ) ;
    public final void rule__ConnectStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:812:1: ( ( 'connect' ) )
            // InternalTrader.g:813:1: ( 'connect' )
            {
            // InternalTrader.g:813:1: ( 'connect' )
            // InternalTrader.g:814:2: 'connect'
            {
             before(grammarAccess.getConnectStatementAccess().getConnectKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getConnectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__0__Impl"


    // $ANTLR start "rule__ConnectStatement__Group__1"
    // InternalTrader.g:823:1: rule__ConnectStatement__Group__1 : rule__ConnectStatement__Group__1__Impl rule__ConnectStatement__Group__2 ;
    public final void rule__ConnectStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:827:1: ( rule__ConnectStatement__Group__1__Impl rule__ConnectStatement__Group__2 )
            // InternalTrader.g:828:2: rule__ConnectStatement__Group__1__Impl rule__ConnectStatement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ConnectStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__2();

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
    // $ANTLR end "rule__ConnectStatement__Group__1"


    // $ANTLR start "rule__ConnectStatement__Group__1__Impl"
    // InternalTrader.g:835:1: rule__ConnectStatement__Group__1__Impl : ( 'to' ) ;
    public final void rule__ConnectStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:839:1: ( ( 'to' ) )
            // InternalTrader.g:840:1: ( 'to' )
            {
            // InternalTrader.g:840:1: ( 'to' )
            // InternalTrader.g:841:2: 'to'
            {
             before(grammarAccess.getConnectStatementAccess().getToKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__1__Impl"


    // $ANTLR start "rule__ConnectStatement__Group__2"
    // InternalTrader.g:850:1: rule__ConnectStatement__Group__2 : rule__ConnectStatement__Group__2__Impl rule__ConnectStatement__Group__3 ;
    public final void rule__ConnectStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:854:1: ( rule__ConnectStatement__Group__2__Impl rule__ConnectStatement__Group__3 )
            // InternalTrader.g:855:2: rule__ConnectStatement__Group__2__Impl rule__ConnectStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ConnectStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__3();

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
    // $ANTLR end "rule__ConnectStatement__Group__2"


    // $ANTLR start "rule__ConnectStatement__Group__2__Impl"
    // InternalTrader.g:862:1: rule__ConnectStatement__Group__2__Impl : ( 'broker' ) ;
    public final void rule__ConnectStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:866:1: ( ( 'broker' ) )
            // InternalTrader.g:867:1: ( 'broker' )
            {
            // InternalTrader.g:867:1: ( 'broker' )
            // InternalTrader.g:868:2: 'broker'
            {
             before(grammarAccess.getConnectStatementAccess().getBrokerKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getBrokerKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__2__Impl"


    // $ANTLR start "rule__ConnectStatement__Group__3"
    // InternalTrader.g:877:1: rule__ConnectStatement__Group__3 : rule__ConnectStatement__Group__3__Impl rule__ConnectStatement__Group__4 ;
    public final void rule__ConnectStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:881:1: ( rule__ConnectStatement__Group__3__Impl rule__ConnectStatement__Group__4 )
            // InternalTrader.g:882:2: rule__ConnectStatement__Group__3__Impl rule__ConnectStatement__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ConnectStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__4();

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
    // $ANTLR end "rule__ConnectStatement__Group__3"


    // $ANTLR start "rule__ConnectStatement__Group__3__Impl"
    // InternalTrader.g:889:1: rule__ConnectStatement__Group__3__Impl : ( ( rule__ConnectStatement__BrokerNameAssignment_3 ) ) ;
    public final void rule__ConnectStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:893:1: ( ( ( rule__ConnectStatement__BrokerNameAssignment_3 ) ) )
            // InternalTrader.g:894:1: ( ( rule__ConnectStatement__BrokerNameAssignment_3 ) )
            {
            // InternalTrader.g:894:1: ( ( rule__ConnectStatement__BrokerNameAssignment_3 ) )
            // InternalTrader.g:895:2: ( rule__ConnectStatement__BrokerNameAssignment_3 )
            {
             before(grammarAccess.getConnectStatementAccess().getBrokerNameAssignment_3()); 
            // InternalTrader.g:896:2: ( rule__ConnectStatement__BrokerNameAssignment_3 )
            // InternalTrader.g:896:3: rule__ConnectStatement__BrokerNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConnectStatement__BrokerNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConnectStatementAccess().getBrokerNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__3__Impl"


    // $ANTLR start "rule__ConnectStatement__Group__4"
    // InternalTrader.g:904:1: rule__ConnectStatement__Group__4 : rule__ConnectStatement__Group__4__Impl rule__ConnectStatement__Group__5 ;
    public final void rule__ConnectStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:908:1: ( rule__ConnectStatement__Group__4__Impl rule__ConnectStatement__Group__5 )
            // InternalTrader.g:909:2: rule__ConnectStatement__Group__4__Impl rule__ConnectStatement__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__ConnectStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__5();

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
    // $ANTLR end "rule__ConnectStatement__Group__4"


    // $ANTLR start "rule__ConnectStatement__Group__4__Impl"
    // InternalTrader.g:916:1: rule__ConnectStatement__Group__4__Impl : ( 'with' ) ;
    public final void rule__ConnectStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:920:1: ( ( 'with' ) )
            // InternalTrader.g:921:1: ( 'with' )
            {
            // InternalTrader.g:921:1: ( 'with' )
            // InternalTrader.g:922:2: 'with'
            {
             before(grammarAccess.getConnectStatementAccess().getWithKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getWithKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__4__Impl"


    // $ANTLR start "rule__ConnectStatement__Group__5"
    // InternalTrader.g:931:1: rule__ConnectStatement__Group__5 : rule__ConnectStatement__Group__5__Impl rule__ConnectStatement__Group__6 ;
    public final void rule__ConnectStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:935:1: ( rule__ConnectStatement__Group__5__Impl rule__ConnectStatement__Group__6 )
            // InternalTrader.g:936:2: rule__ConnectStatement__Group__5__Impl rule__ConnectStatement__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__ConnectStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__6();

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
    // $ANTLR end "rule__ConnectStatement__Group__5"


    // $ANTLR start "rule__ConnectStatement__Group__5__Impl"
    // InternalTrader.g:943:1: rule__ConnectStatement__Group__5__Impl : ( 'username:' ) ;
    public final void rule__ConnectStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:947:1: ( ( 'username:' ) )
            // InternalTrader.g:948:1: ( 'username:' )
            {
            // InternalTrader.g:948:1: ( 'username:' )
            // InternalTrader.g:949:2: 'username:'
            {
             before(grammarAccess.getConnectStatementAccess().getUsernameKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getUsernameKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__5__Impl"


    // $ANTLR start "rule__ConnectStatement__Group__6"
    // InternalTrader.g:958:1: rule__ConnectStatement__Group__6 : rule__ConnectStatement__Group__6__Impl rule__ConnectStatement__Group__7 ;
    public final void rule__ConnectStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:962:1: ( rule__ConnectStatement__Group__6__Impl rule__ConnectStatement__Group__7 )
            // InternalTrader.g:963:2: rule__ConnectStatement__Group__6__Impl rule__ConnectStatement__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__ConnectStatement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__7();

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
    // $ANTLR end "rule__ConnectStatement__Group__6"


    // $ANTLR start "rule__ConnectStatement__Group__6__Impl"
    // InternalTrader.g:970:1: rule__ConnectStatement__Group__6__Impl : ( ( rule__ConnectStatement__UsernameAssignment_6 ) ) ;
    public final void rule__ConnectStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:974:1: ( ( ( rule__ConnectStatement__UsernameAssignment_6 ) ) )
            // InternalTrader.g:975:1: ( ( rule__ConnectStatement__UsernameAssignment_6 ) )
            {
            // InternalTrader.g:975:1: ( ( rule__ConnectStatement__UsernameAssignment_6 ) )
            // InternalTrader.g:976:2: ( rule__ConnectStatement__UsernameAssignment_6 )
            {
             before(grammarAccess.getConnectStatementAccess().getUsernameAssignment_6()); 
            // InternalTrader.g:977:2: ( rule__ConnectStatement__UsernameAssignment_6 )
            // InternalTrader.g:977:3: rule__ConnectStatement__UsernameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ConnectStatement__UsernameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConnectStatementAccess().getUsernameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__6__Impl"


    // $ANTLR start "rule__ConnectStatement__Group__7"
    // InternalTrader.g:985:1: rule__ConnectStatement__Group__7 : rule__ConnectStatement__Group__7__Impl rule__ConnectStatement__Group__8 ;
    public final void rule__ConnectStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:989:1: ( rule__ConnectStatement__Group__7__Impl rule__ConnectStatement__Group__8 )
            // InternalTrader.g:990:2: rule__ConnectStatement__Group__7__Impl rule__ConnectStatement__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__ConnectStatement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__8();

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
    // $ANTLR end "rule__ConnectStatement__Group__7"


    // $ANTLR start "rule__ConnectStatement__Group__7__Impl"
    // InternalTrader.g:997:1: rule__ConnectStatement__Group__7__Impl : ( ',' ) ;
    public final void rule__ConnectStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1001:1: ( ( ',' ) )
            // InternalTrader.g:1002:1: ( ',' )
            {
            // InternalTrader.g:1002:1: ( ',' )
            // InternalTrader.g:1003:2: ','
            {
             before(grammarAccess.getConnectStatementAccess().getCommaKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__7__Impl"


    // $ANTLR start "rule__ConnectStatement__Group__8"
    // InternalTrader.g:1012:1: rule__ConnectStatement__Group__8 : rule__ConnectStatement__Group__8__Impl rule__ConnectStatement__Group__9 ;
    public final void rule__ConnectStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1016:1: ( rule__ConnectStatement__Group__8__Impl rule__ConnectStatement__Group__9 )
            // InternalTrader.g:1017:2: rule__ConnectStatement__Group__8__Impl rule__ConnectStatement__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__ConnectStatement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__9();

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
    // $ANTLR end "rule__ConnectStatement__Group__8"


    // $ANTLR start "rule__ConnectStatement__Group__8__Impl"
    // InternalTrader.g:1024:1: rule__ConnectStatement__Group__8__Impl : ( 'password:' ) ;
    public final void rule__ConnectStatement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1028:1: ( ( 'password:' ) )
            // InternalTrader.g:1029:1: ( 'password:' )
            {
            // InternalTrader.g:1029:1: ( 'password:' )
            // InternalTrader.g:1030:2: 'password:'
            {
             before(grammarAccess.getConnectStatementAccess().getPasswordKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getPasswordKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__8__Impl"


    // $ANTLR start "rule__ConnectStatement__Group__9"
    // InternalTrader.g:1039:1: rule__ConnectStatement__Group__9 : rule__ConnectStatement__Group__9__Impl rule__ConnectStatement__Group__10 ;
    public final void rule__ConnectStatement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1043:1: ( rule__ConnectStatement__Group__9__Impl rule__ConnectStatement__Group__10 )
            // InternalTrader.g:1044:2: rule__ConnectStatement__Group__9__Impl rule__ConnectStatement__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__ConnectStatement__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__10();

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
    // $ANTLR end "rule__ConnectStatement__Group__9"


    // $ANTLR start "rule__ConnectStatement__Group__9__Impl"
    // InternalTrader.g:1051:1: rule__ConnectStatement__Group__9__Impl : ( ( rule__ConnectStatement__PasswordAssignment_9 ) ) ;
    public final void rule__ConnectStatement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1055:1: ( ( ( rule__ConnectStatement__PasswordAssignment_9 ) ) )
            // InternalTrader.g:1056:1: ( ( rule__ConnectStatement__PasswordAssignment_9 ) )
            {
            // InternalTrader.g:1056:1: ( ( rule__ConnectStatement__PasswordAssignment_9 ) )
            // InternalTrader.g:1057:2: ( rule__ConnectStatement__PasswordAssignment_9 )
            {
             before(grammarAccess.getConnectStatementAccess().getPasswordAssignment_9()); 
            // InternalTrader.g:1058:2: ( rule__ConnectStatement__PasswordAssignment_9 )
            // InternalTrader.g:1058:3: rule__ConnectStatement__PasswordAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ConnectStatement__PasswordAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getConnectStatementAccess().getPasswordAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__9__Impl"


    // $ANTLR start "rule__ConnectStatement__Group__10"
    // InternalTrader.g:1066:1: rule__ConnectStatement__Group__10 : rule__ConnectStatement__Group__10__Impl rule__ConnectStatement__Group__11 ;
    public final void rule__ConnectStatement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1070:1: ( rule__ConnectStatement__Group__10__Impl rule__ConnectStatement__Group__11 )
            // InternalTrader.g:1071:2: rule__ConnectStatement__Group__10__Impl rule__ConnectStatement__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__ConnectStatement__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__11();

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
    // $ANTLR end "rule__ConnectStatement__Group__10"


    // $ANTLR start "rule__ConnectStatement__Group__10__Impl"
    // InternalTrader.g:1078:1: rule__ConnectStatement__Group__10__Impl : ( ',' ) ;
    public final void rule__ConnectStatement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1082:1: ( ( ',' ) )
            // InternalTrader.g:1083:1: ( ',' )
            {
            // InternalTrader.g:1083:1: ( ',' )
            // InternalTrader.g:1084:2: ','
            {
             before(grammarAccess.getConnectStatementAccess().getCommaKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getCommaKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__10__Impl"


    // $ANTLR start "rule__ConnectStatement__Group__11"
    // InternalTrader.g:1093:1: rule__ConnectStatement__Group__11 : rule__ConnectStatement__Group__11__Impl rule__ConnectStatement__Group__12 ;
    public final void rule__ConnectStatement__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1097:1: ( rule__ConnectStatement__Group__11__Impl rule__ConnectStatement__Group__12 )
            // InternalTrader.g:1098:2: rule__ConnectStatement__Group__11__Impl rule__ConnectStatement__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__ConnectStatement__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__12();

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
    // $ANTLR end "rule__ConnectStatement__Group__11"


    // $ANTLR start "rule__ConnectStatement__Group__11__Impl"
    // InternalTrader.g:1105:1: rule__ConnectStatement__Group__11__Impl : ( 'leverage:' ) ;
    public final void rule__ConnectStatement__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1109:1: ( ( 'leverage:' ) )
            // InternalTrader.g:1110:1: ( 'leverage:' )
            {
            // InternalTrader.g:1110:1: ( 'leverage:' )
            // InternalTrader.g:1111:2: 'leverage:'
            {
             before(grammarAccess.getConnectStatementAccess().getLeverageKeyword_11()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getLeverageKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__11__Impl"


    // $ANTLR start "rule__ConnectStatement__Group__12"
    // InternalTrader.g:1120:1: rule__ConnectStatement__Group__12 : rule__ConnectStatement__Group__12__Impl rule__ConnectStatement__Group__13 ;
    public final void rule__ConnectStatement__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1124:1: ( rule__ConnectStatement__Group__12__Impl rule__ConnectStatement__Group__13 )
            // InternalTrader.g:1125:2: rule__ConnectStatement__Group__12__Impl rule__ConnectStatement__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__ConnectStatement__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__13();

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
    // $ANTLR end "rule__ConnectStatement__Group__12"


    // $ANTLR start "rule__ConnectStatement__Group__12__Impl"
    // InternalTrader.g:1132:1: rule__ConnectStatement__Group__12__Impl : ( ( rule__ConnectStatement__LeverageAssignment_12 ) ) ;
    public final void rule__ConnectStatement__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1136:1: ( ( ( rule__ConnectStatement__LeverageAssignment_12 ) ) )
            // InternalTrader.g:1137:1: ( ( rule__ConnectStatement__LeverageAssignment_12 ) )
            {
            // InternalTrader.g:1137:1: ( ( rule__ConnectStatement__LeverageAssignment_12 ) )
            // InternalTrader.g:1138:2: ( rule__ConnectStatement__LeverageAssignment_12 )
            {
             before(grammarAccess.getConnectStatementAccess().getLeverageAssignment_12()); 
            // InternalTrader.g:1139:2: ( rule__ConnectStatement__LeverageAssignment_12 )
            // InternalTrader.g:1139:3: rule__ConnectStatement__LeverageAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__ConnectStatement__LeverageAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getConnectStatementAccess().getLeverageAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__12__Impl"


    // $ANTLR start "rule__ConnectStatement__Group__13"
    // InternalTrader.g:1147:1: rule__ConnectStatement__Group__13 : rule__ConnectStatement__Group__13__Impl rule__ConnectStatement__Group__14 ;
    public final void rule__ConnectStatement__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1151:1: ( rule__ConnectStatement__Group__13__Impl rule__ConnectStatement__Group__14 )
            // InternalTrader.g:1152:2: rule__ConnectStatement__Group__13__Impl rule__ConnectStatement__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__ConnectStatement__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__14();

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
    // $ANTLR end "rule__ConnectStatement__Group__13"


    // $ANTLR start "rule__ConnectStatement__Group__13__Impl"
    // InternalTrader.g:1159:1: rule__ConnectStatement__Group__13__Impl : ( ',' ) ;
    public final void rule__ConnectStatement__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1163:1: ( ( ',' ) )
            // InternalTrader.g:1164:1: ( ',' )
            {
            // InternalTrader.g:1164:1: ( ',' )
            // InternalTrader.g:1165:2: ','
            {
             before(grammarAccess.getConnectStatementAccess().getCommaKeyword_13()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getCommaKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__13__Impl"


    // $ANTLR start "rule__ConnectStatement__Group__14"
    // InternalTrader.g:1174:1: rule__ConnectStatement__Group__14 : rule__ConnectStatement__Group__14__Impl rule__ConnectStatement__Group__15 ;
    public final void rule__ConnectStatement__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1178:1: ( rule__ConnectStatement__Group__14__Impl rule__ConnectStatement__Group__15 )
            // InternalTrader.g:1179:2: rule__ConnectStatement__Group__14__Impl rule__ConnectStatement__Group__15
            {
            pushFollow(FOLLOW_13);
            rule__ConnectStatement__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__15();

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
    // $ANTLR end "rule__ConnectStatement__Group__14"


    // $ANTLR start "rule__ConnectStatement__Group__14__Impl"
    // InternalTrader.g:1186:1: rule__ConnectStatement__Group__14__Impl : ( 'money:' ) ;
    public final void rule__ConnectStatement__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1190:1: ( ( 'money:' ) )
            // InternalTrader.g:1191:1: ( 'money:' )
            {
            // InternalTrader.g:1191:1: ( 'money:' )
            // InternalTrader.g:1192:2: 'money:'
            {
             before(grammarAccess.getConnectStatementAccess().getMoneyKeyword_14()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getMoneyKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__14__Impl"


    // $ANTLR start "rule__ConnectStatement__Group__15"
    // InternalTrader.g:1201:1: rule__ConnectStatement__Group__15 : rule__ConnectStatement__Group__15__Impl rule__ConnectStatement__Group__16 ;
    public final void rule__ConnectStatement__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1205:1: ( rule__ConnectStatement__Group__15__Impl rule__ConnectStatement__Group__16 )
            // InternalTrader.g:1206:2: rule__ConnectStatement__Group__15__Impl rule__ConnectStatement__Group__16
            {
            pushFollow(FOLLOW_10);
            rule__ConnectStatement__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__16();

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
    // $ANTLR end "rule__ConnectStatement__Group__15"


    // $ANTLR start "rule__ConnectStatement__Group__15__Impl"
    // InternalTrader.g:1213:1: rule__ConnectStatement__Group__15__Impl : ( ( rule__ConnectStatement__MoneyAssignment_15 ) ) ;
    public final void rule__ConnectStatement__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1217:1: ( ( ( rule__ConnectStatement__MoneyAssignment_15 ) ) )
            // InternalTrader.g:1218:1: ( ( rule__ConnectStatement__MoneyAssignment_15 ) )
            {
            // InternalTrader.g:1218:1: ( ( rule__ConnectStatement__MoneyAssignment_15 ) )
            // InternalTrader.g:1219:2: ( rule__ConnectStatement__MoneyAssignment_15 )
            {
             before(grammarAccess.getConnectStatementAccess().getMoneyAssignment_15()); 
            // InternalTrader.g:1220:2: ( rule__ConnectStatement__MoneyAssignment_15 )
            // InternalTrader.g:1220:3: rule__ConnectStatement__MoneyAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__ConnectStatement__MoneyAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getConnectStatementAccess().getMoneyAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__15__Impl"


    // $ANTLR start "rule__ConnectStatement__Group__16"
    // InternalTrader.g:1228:1: rule__ConnectStatement__Group__16 : rule__ConnectStatement__Group__16__Impl rule__ConnectStatement__Group__17 ;
    public final void rule__ConnectStatement__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1232:1: ( rule__ConnectStatement__Group__16__Impl rule__ConnectStatement__Group__17 )
            // InternalTrader.g:1233:2: rule__ConnectStatement__Group__16__Impl rule__ConnectStatement__Group__17
            {
            pushFollow(FOLLOW_15);
            rule__ConnectStatement__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__17();

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
    // $ANTLR end "rule__ConnectStatement__Group__16"


    // $ANTLR start "rule__ConnectStatement__Group__16__Impl"
    // InternalTrader.g:1240:1: rule__ConnectStatement__Group__16__Impl : ( ',' ) ;
    public final void rule__ConnectStatement__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1244:1: ( ( ',' ) )
            // InternalTrader.g:1245:1: ( ',' )
            {
            // InternalTrader.g:1245:1: ( ',' )
            // InternalTrader.g:1246:2: ','
            {
             before(grammarAccess.getConnectStatementAccess().getCommaKeyword_16()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getCommaKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__16__Impl"


    // $ANTLR start "rule__ConnectStatement__Group__17"
    // InternalTrader.g:1255:1: rule__ConnectStatement__Group__17 : rule__ConnectStatement__Group__17__Impl rule__ConnectStatement__Group__18 ;
    public final void rule__ConnectStatement__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1259:1: ( rule__ConnectStatement__Group__17__Impl rule__ConnectStatement__Group__18 )
            // InternalTrader.g:1260:2: rule__ConnectStatement__Group__17__Impl rule__ConnectStatement__Group__18
            {
            pushFollow(FOLLOW_9);
            rule__ConnectStatement__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__18();

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
    // $ANTLR end "rule__ConnectStatement__Group__17"


    // $ANTLR start "rule__ConnectStatement__Group__17__Impl"
    // InternalTrader.g:1267:1: rule__ConnectStatement__Group__17__Impl : ( 'timeframe:' ) ;
    public final void rule__ConnectStatement__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1271:1: ( ( 'timeframe:' ) )
            // InternalTrader.g:1272:1: ( 'timeframe:' )
            {
            // InternalTrader.g:1272:1: ( 'timeframe:' )
            // InternalTrader.g:1273:2: 'timeframe:'
            {
             before(grammarAccess.getConnectStatementAccess().getTimeframeKeyword_17()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getTimeframeKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__17__Impl"


    // $ANTLR start "rule__ConnectStatement__Group__18"
    // InternalTrader.g:1282:1: rule__ConnectStatement__Group__18 : rule__ConnectStatement__Group__18__Impl ;
    public final void rule__ConnectStatement__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1286:1: ( rule__ConnectStatement__Group__18__Impl )
            // InternalTrader.g:1287:2: rule__ConnectStatement__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__18__Impl();

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
    // $ANTLR end "rule__ConnectStatement__Group__18"


    // $ANTLR start "rule__ConnectStatement__Group__18__Impl"
    // InternalTrader.g:1293:1: rule__ConnectStatement__Group__18__Impl : ( ( rule__ConnectStatement__TimeframeAssignment_18 ) ) ;
    public final void rule__ConnectStatement__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1297:1: ( ( ( rule__ConnectStatement__TimeframeAssignment_18 ) ) )
            // InternalTrader.g:1298:1: ( ( rule__ConnectStatement__TimeframeAssignment_18 ) )
            {
            // InternalTrader.g:1298:1: ( ( rule__ConnectStatement__TimeframeAssignment_18 ) )
            // InternalTrader.g:1299:2: ( rule__ConnectStatement__TimeframeAssignment_18 )
            {
             before(grammarAccess.getConnectStatementAccess().getTimeframeAssignment_18()); 
            // InternalTrader.g:1300:2: ( rule__ConnectStatement__TimeframeAssignment_18 )
            // InternalTrader.g:1300:3: rule__ConnectStatement__TimeframeAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__ConnectStatement__TimeframeAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getConnectStatementAccess().getTimeframeAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__Group__18__Impl"


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
    // InternalTrader.g:1375:1: rule__TradingBot__Group__2__Impl : ( 'with' ) ;
    public final void rule__TradingBot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1379:1: ( ( 'with' ) )
            // InternalTrader.g:1380:1: ( 'with' )
            {
            // InternalTrader.g:1380:1: ( 'with' )
            // InternalTrader.g:1381:2: 'with'
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
    // InternalTrader.g:1390:1: rule__TradingBot__Group__3 : rule__TradingBot__Group__3__Impl rule__TradingBot__Group__4 ;
    public final void rule__TradingBot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1394:1: ( rule__TradingBot__Group__3__Impl rule__TradingBot__Group__4 )
            // InternalTrader.g:1395:2: rule__TradingBot__Group__3__Impl rule__TradingBot__Group__4
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
    // InternalTrader.g:1402:1: rule__TradingBot__Group__3__Impl : ( ( rule__TradingBot__StrategyAssignment_3 ) ) ;
    public final void rule__TradingBot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1406:1: ( ( ( rule__TradingBot__StrategyAssignment_3 ) ) )
            // InternalTrader.g:1407:1: ( ( rule__TradingBot__StrategyAssignment_3 ) )
            {
            // InternalTrader.g:1407:1: ( ( rule__TradingBot__StrategyAssignment_3 ) )
            // InternalTrader.g:1408:2: ( rule__TradingBot__StrategyAssignment_3 )
            {
             before(grammarAccess.getTradingBotAccess().getStrategyAssignment_3()); 
            // InternalTrader.g:1409:2: ( rule__TradingBot__StrategyAssignment_3 )
            // InternalTrader.g:1409:3: rule__TradingBot__StrategyAssignment_3
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
    // InternalTrader.g:1417:1: rule__TradingBot__Group__4 : rule__TradingBot__Group__4__Impl rule__TradingBot__Group__5 ;
    public final void rule__TradingBot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1421:1: ( rule__TradingBot__Group__4__Impl rule__TradingBot__Group__5 )
            // InternalTrader.g:1422:2: rule__TradingBot__Group__4__Impl rule__TradingBot__Group__5
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
    // InternalTrader.g:1429:1: rule__TradingBot__Group__4__Impl : ( 'strategy' ) ;
    public final void rule__TradingBot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1433:1: ( ( 'strategy' ) )
            // InternalTrader.g:1434:1: ( 'strategy' )
            {
            // InternalTrader.g:1434:1: ( 'strategy' )
            // InternalTrader.g:1435:2: 'strategy'
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
    // InternalTrader.g:1444:1: rule__TradingBot__Group__5 : rule__TradingBot__Group__5__Impl rule__TradingBot__Group__6 ;
    public final void rule__TradingBot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1448:1: ( rule__TradingBot__Group__5__Impl rule__TradingBot__Group__6 )
            // InternalTrader.g:1449:2: rule__TradingBot__Group__5__Impl rule__TradingBot__Group__6
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
    // InternalTrader.g:1456:1: rule__TradingBot__Group__5__Impl : ( 'using' ) ;
    public final void rule__TradingBot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1460:1: ( ( 'using' ) )
            // InternalTrader.g:1461:1: ( 'using' )
            {
            // InternalTrader.g:1461:1: ( 'using' )
            // InternalTrader.g:1462:2: 'using'
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
    // InternalTrader.g:1471:1: rule__TradingBot__Group__6 : rule__TradingBot__Group__6__Impl rule__TradingBot__Group__7 ;
    public final void rule__TradingBot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1475:1: ( rule__TradingBot__Group__6__Impl rule__TradingBot__Group__7 )
            // InternalTrader.g:1476:2: rule__TradingBot__Group__6__Impl rule__TradingBot__Group__7
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
    // InternalTrader.g:1483:1: rule__TradingBot__Group__6__Impl : ( ( rule__TradingBot__FundAssignment_6 ) ) ;
    public final void rule__TradingBot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1487:1: ( ( ( rule__TradingBot__FundAssignment_6 ) ) )
            // InternalTrader.g:1488:1: ( ( rule__TradingBot__FundAssignment_6 ) )
            {
            // InternalTrader.g:1488:1: ( ( rule__TradingBot__FundAssignment_6 ) )
            // InternalTrader.g:1489:2: ( rule__TradingBot__FundAssignment_6 )
            {
             before(grammarAccess.getTradingBotAccess().getFundAssignment_6()); 
            // InternalTrader.g:1490:2: ( rule__TradingBot__FundAssignment_6 )
            // InternalTrader.g:1490:3: rule__TradingBot__FundAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__TradingBot__FundAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTradingBotAccess().getFundAssignment_6()); 

            }


            }

        }
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
    // InternalTrader.g:1498:1: rule__TradingBot__Group__7 : rule__TradingBot__Group__7__Impl ;
    public final void rule__TradingBot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1502:1: ( rule__TradingBot__Group__7__Impl )
            // InternalTrader.g:1503:2: rule__TradingBot__Group__7__Impl
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
    // InternalTrader.g:1509:1: rule__TradingBot__Group__7__Impl : ( 'funds' ) ;
    public final void rule__TradingBot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1513:1: ( ( 'funds' ) )
            // InternalTrader.g:1514:1: ( 'funds' )
            {
            // InternalTrader.g:1514:1: ( 'funds' )
            // InternalTrader.g:1515:2: 'funds'
            {
             before(grammarAccess.getTradingBotAccess().getFundsKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTradingBotAccess().getFundsKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__ListBots__Group__0"
    // InternalTrader.g:1525:1: rule__ListBots__Group__0 : rule__ListBots__Group__0__Impl rule__ListBots__Group__1 ;
    public final void rule__ListBots__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1529:1: ( rule__ListBots__Group__0__Impl rule__ListBots__Group__1 )
            // InternalTrader.g:1530:2: rule__ListBots__Group__0__Impl rule__ListBots__Group__1
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
    // InternalTrader.g:1537:1: rule__ListBots__Group__0__Impl : ( ( rule__ListBots__ListCommandAssignment_0 ) ) ;
    public final void rule__ListBots__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1541:1: ( ( ( rule__ListBots__ListCommandAssignment_0 ) ) )
            // InternalTrader.g:1542:1: ( ( rule__ListBots__ListCommandAssignment_0 ) )
            {
            // InternalTrader.g:1542:1: ( ( rule__ListBots__ListCommandAssignment_0 ) )
            // InternalTrader.g:1543:2: ( rule__ListBots__ListCommandAssignment_0 )
            {
             before(grammarAccess.getListBotsAccess().getListCommandAssignment_0()); 
            // InternalTrader.g:1544:2: ( rule__ListBots__ListCommandAssignment_0 )
            // InternalTrader.g:1544:3: rule__ListBots__ListCommandAssignment_0
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
    // InternalTrader.g:1552:1: rule__ListBots__Group__1 : rule__ListBots__Group__1__Impl rule__ListBots__Group__2 ;
    public final void rule__ListBots__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1556:1: ( rule__ListBots__Group__1__Impl rule__ListBots__Group__2 )
            // InternalTrader.g:1557:2: rule__ListBots__Group__1__Impl rule__ListBots__Group__2
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
    // InternalTrader.g:1564:1: rule__ListBots__Group__1__Impl : ( 'registered' ) ;
    public final void rule__ListBots__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1568:1: ( ( 'registered' ) )
            // InternalTrader.g:1569:1: ( 'registered' )
            {
            // InternalTrader.g:1569:1: ( 'registered' )
            // InternalTrader.g:1570:2: 'registered'
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
    // InternalTrader.g:1579:1: rule__ListBots__Group__2 : rule__ListBots__Group__2__Impl ;
    public final void rule__ListBots__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1583:1: ( rule__ListBots__Group__2__Impl )
            // InternalTrader.g:1584:2: rule__ListBots__Group__2__Impl
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
    // InternalTrader.g:1590:1: rule__ListBots__Group__2__Impl : ( 'bots' ) ;
    public final void rule__ListBots__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1594:1: ( ( 'bots' ) )
            // InternalTrader.g:1595:1: ( 'bots' )
            {
            // InternalTrader.g:1595:1: ( 'bots' )
            // InternalTrader.g:1596:2: 'bots'
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
    // InternalTrader.g:1606:1: rule__Execute__Group__0 : rule__Execute__Group__0__Impl rule__Execute__Group__1 ;
    public final void rule__Execute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1610:1: ( rule__Execute__Group__0__Impl rule__Execute__Group__1 )
            // InternalTrader.g:1611:2: rule__Execute__Group__0__Impl rule__Execute__Group__1
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
    // InternalTrader.g:1618:1: rule__Execute__Group__0__Impl : ( ( rule__Execute__ExecuteCommandAssignment_0 ) ) ;
    public final void rule__Execute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1622:1: ( ( ( rule__Execute__ExecuteCommandAssignment_0 ) ) )
            // InternalTrader.g:1623:1: ( ( rule__Execute__ExecuteCommandAssignment_0 ) )
            {
            // InternalTrader.g:1623:1: ( ( rule__Execute__ExecuteCommandAssignment_0 ) )
            // InternalTrader.g:1624:2: ( rule__Execute__ExecuteCommandAssignment_0 )
            {
             before(grammarAccess.getExecuteAccess().getExecuteCommandAssignment_0()); 
            // InternalTrader.g:1625:2: ( rule__Execute__ExecuteCommandAssignment_0 )
            // InternalTrader.g:1625:3: rule__Execute__ExecuteCommandAssignment_0
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
    // InternalTrader.g:1633:1: rule__Execute__Group__1 : rule__Execute__Group__1__Impl ;
    public final void rule__Execute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1637:1: ( rule__Execute__Group__1__Impl )
            // InternalTrader.g:1638:2: rule__Execute__Group__1__Impl
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
    // InternalTrader.g:1644:1: rule__Execute__Group__1__Impl : ( 'bots' ) ;
    public final void rule__Execute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1648:1: ( ( 'bots' ) )
            // InternalTrader.g:1649:1: ( 'bots' )
            {
            // InternalTrader.g:1649:1: ( 'bots' )
            // InternalTrader.g:1650:2: 'bots'
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
    // InternalTrader.g:1660:1: rule__Stop__Group__0 : rule__Stop__Group__0__Impl rule__Stop__Group__1 ;
    public final void rule__Stop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1664:1: ( rule__Stop__Group__0__Impl rule__Stop__Group__1 )
            // InternalTrader.g:1665:2: rule__Stop__Group__0__Impl rule__Stop__Group__1
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
    // InternalTrader.g:1672:1: rule__Stop__Group__0__Impl : ( ( rule__Stop__StopCommandAssignment_0 ) ) ;
    public final void rule__Stop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1676:1: ( ( ( rule__Stop__StopCommandAssignment_0 ) ) )
            // InternalTrader.g:1677:1: ( ( rule__Stop__StopCommandAssignment_0 ) )
            {
            // InternalTrader.g:1677:1: ( ( rule__Stop__StopCommandAssignment_0 ) )
            // InternalTrader.g:1678:2: ( rule__Stop__StopCommandAssignment_0 )
            {
             before(grammarAccess.getStopAccess().getStopCommandAssignment_0()); 
            // InternalTrader.g:1679:2: ( rule__Stop__StopCommandAssignment_0 )
            // InternalTrader.g:1679:3: rule__Stop__StopCommandAssignment_0
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
    // InternalTrader.g:1687:1: rule__Stop__Group__1 : rule__Stop__Group__1__Impl ;
    public final void rule__Stop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1691:1: ( rule__Stop__Group__1__Impl )
            // InternalTrader.g:1692:2: rule__Stop__Group__1__Impl
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
    // InternalTrader.g:1698:1: rule__Stop__Group__1__Impl : ( 'bots' ) ;
    public final void rule__Stop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1702:1: ( ( 'bots' ) )
            // InternalTrader.g:1703:1: ( 'bots' )
            {
            // InternalTrader.g:1703:1: ( 'bots' )
            // InternalTrader.g:1704:2: 'bots'
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
    // InternalTrader.g:1714:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1718:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalTrader.g:1719:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
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
    // InternalTrader.g:1726:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1730:1: ( ( 'var' ) )
            // InternalTrader.g:1731:1: ( 'var' )
            {
            // InternalTrader.g:1731:1: ( 'var' )
            // InternalTrader.g:1732:2: 'var'
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
    // InternalTrader.g:1741:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1745:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalTrader.g:1746:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
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
    // InternalTrader.g:1753:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1757:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalTrader.g:1758:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalTrader.g:1758:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalTrader.g:1759:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalTrader.g:1760:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalTrader.g:1760:3: rule__VariableDeclaration__NameAssignment_1
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
    // InternalTrader.g:1768:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1772:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalTrader.g:1773:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
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
    // InternalTrader.g:1780:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1784:1: ( ( '=' ) )
            // InternalTrader.g:1785:1: ( '=' )
            {
            // InternalTrader.g:1785:1: ( '=' )
            // InternalTrader.g:1786:2: '='
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
    // InternalTrader.g:1795:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1799:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalTrader.g:1800:2: rule__VariableDeclaration__Group__3__Impl
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
    // InternalTrader.g:1806:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__Alternatives_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1810:1: ( ( ( rule__VariableDeclaration__Alternatives_3 ) ) )
            // InternalTrader.g:1811:1: ( ( rule__VariableDeclaration__Alternatives_3 ) )
            {
            // InternalTrader.g:1811:1: ( ( rule__VariableDeclaration__Alternatives_3 ) )
            // InternalTrader.g:1812:2: ( rule__VariableDeclaration__Alternatives_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getAlternatives_3()); 
            // InternalTrader.g:1813:2: ( rule__VariableDeclaration__Alternatives_3 )
            // InternalTrader.g:1813:3: rule__VariableDeclaration__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalTrader.g:1822:1: rule__LoopStatement__Group__0 : rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 ;
    public final void rule__LoopStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1826:1: ( rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 )
            // InternalTrader.g:1827:2: rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalTrader.g:1834:1: rule__LoopStatement__Group__0__Impl : ( 'loop' ) ;
    public final void rule__LoopStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1838:1: ( ( 'loop' ) )
            // InternalTrader.g:1839:1: ( 'loop' )
            {
            // InternalTrader.g:1839:1: ( 'loop' )
            // InternalTrader.g:1840:2: 'loop'
            {
             before(grammarAccess.getLoopStatementAccess().getLoopKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalTrader.g:1849:1: rule__LoopStatement__Group__1 : rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2 ;
    public final void rule__LoopStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1853:1: ( rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2 )
            // InternalTrader.g:1854:2: rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalTrader.g:1861:1: rule__LoopStatement__Group__1__Impl : ( ( rule__LoopStatement__CountAssignment_1 ) ) ;
    public final void rule__LoopStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1865:1: ( ( ( rule__LoopStatement__CountAssignment_1 ) ) )
            // InternalTrader.g:1866:1: ( ( rule__LoopStatement__CountAssignment_1 ) )
            {
            // InternalTrader.g:1866:1: ( ( rule__LoopStatement__CountAssignment_1 ) )
            // InternalTrader.g:1867:2: ( rule__LoopStatement__CountAssignment_1 )
            {
             before(grammarAccess.getLoopStatementAccess().getCountAssignment_1()); 
            // InternalTrader.g:1868:2: ( rule__LoopStatement__CountAssignment_1 )
            // InternalTrader.g:1868:3: rule__LoopStatement__CountAssignment_1
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
    // InternalTrader.g:1876:1: rule__LoopStatement__Group__2 : rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3 ;
    public final void rule__LoopStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1880:1: ( rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3 )
            // InternalTrader.g:1881:2: rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalTrader.g:1888:1: rule__LoopStatement__Group__2__Impl : ( 'times' ) ;
    public final void rule__LoopStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1892:1: ( ( 'times' ) )
            // InternalTrader.g:1893:1: ( 'times' )
            {
            // InternalTrader.g:1893:1: ( 'times' )
            // InternalTrader.g:1894:2: 'times'
            {
             before(grammarAccess.getLoopStatementAccess().getTimesKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalTrader.g:1903:1: rule__LoopStatement__Group__3 : rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4 ;
    public final void rule__LoopStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1907:1: ( rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4 )
            // InternalTrader.g:1908:2: rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalTrader.g:1915:1: rule__LoopStatement__Group__3__Impl : ( 'do' ) ;
    public final void rule__LoopStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1919:1: ( ( 'do' ) )
            // InternalTrader.g:1920:1: ( 'do' )
            {
            // InternalTrader.g:1920:1: ( 'do' )
            // InternalTrader.g:1921:2: 'do'
            {
             before(grammarAccess.getLoopStatementAccess().getDoKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTrader.g:1930:1: rule__LoopStatement__Group__4 : rule__LoopStatement__Group__4__Impl rule__LoopStatement__Group__5 ;
    public final void rule__LoopStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1934:1: ( rule__LoopStatement__Group__4__Impl rule__LoopStatement__Group__5 )
            // InternalTrader.g:1935:2: rule__LoopStatement__Group__4__Impl rule__LoopStatement__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalTrader.g:1942:1: rule__LoopStatement__Group__4__Impl : ( ( ( rule__LoopStatement__StatementsAssignment_4 ) ) ( ( rule__LoopStatement__StatementsAssignment_4 )* ) ) ;
    public final void rule__LoopStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1946:1: ( ( ( ( rule__LoopStatement__StatementsAssignment_4 ) ) ( ( rule__LoopStatement__StatementsAssignment_4 )* ) ) )
            // InternalTrader.g:1947:1: ( ( ( rule__LoopStatement__StatementsAssignment_4 ) ) ( ( rule__LoopStatement__StatementsAssignment_4 )* ) )
            {
            // InternalTrader.g:1947:1: ( ( ( rule__LoopStatement__StatementsAssignment_4 ) ) ( ( rule__LoopStatement__StatementsAssignment_4 )* ) )
            // InternalTrader.g:1948:2: ( ( rule__LoopStatement__StatementsAssignment_4 ) ) ( ( rule__LoopStatement__StatementsAssignment_4 )* )
            {
            // InternalTrader.g:1948:2: ( ( rule__LoopStatement__StatementsAssignment_4 ) )
            // InternalTrader.g:1949:3: ( rule__LoopStatement__StatementsAssignment_4 )
            {
             before(grammarAccess.getLoopStatementAccess().getStatementsAssignment_4()); 
            // InternalTrader.g:1950:3: ( rule__LoopStatement__StatementsAssignment_4 )
            // InternalTrader.g:1950:4: rule__LoopStatement__StatementsAssignment_4
            {
            pushFollow(FOLLOW_3);
            rule__LoopStatement__StatementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLoopStatementAccess().getStatementsAssignment_4()); 

            }

            // InternalTrader.g:1953:2: ( ( rule__LoopStatement__StatementsAssignment_4 )* )
            // InternalTrader.g:1954:3: ( rule__LoopStatement__StatementsAssignment_4 )*
            {
             before(grammarAccess.getLoopStatementAccess().getStatementsAssignment_4()); 
            // InternalTrader.g:1955:3: ( rule__LoopStatement__StatementsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17||LA9_0==27||LA9_0==34||LA9_0==36||(LA9_0>=47 && LA9_0<=49)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTrader.g:1955:4: rule__LoopStatement__StatementsAssignment_4
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
    // InternalTrader.g:1964:1: rule__LoopStatement__Group__5 : rule__LoopStatement__Group__5__Impl ;
    public final void rule__LoopStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1968:1: ( rule__LoopStatement__Group__5__Impl )
            // InternalTrader.g:1969:2: rule__LoopStatement__Group__5__Impl
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
    // InternalTrader.g:1975:1: rule__LoopStatement__Group__5__Impl : ( 'end' ) ;
    public final void rule__LoopStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1979:1: ( ( 'end' ) )
            // InternalTrader.g:1980:1: ( 'end' )
            {
            // InternalTrader.g:1980:1: ( 'end' )
            // InternalTrader.g:1981:2: 'end'
            {
             before(grammarAccess.getLoopStatementAccess().getEndKeyword_5()); 
            match(input,39,FOLLOW_2); 
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
    // InternalTrader.g:1991:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1995:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalTrader.g:1996:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalTrader.g:2003:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2007:1: ( ( ( RULE_INT )? ) )
            // InternalTrader.g:2008:1: ( ( RULE_INT )? )
            {
            // InternalTrader.g:2008:1: ( ( RULE_INT )? )
            // InternalTrader.g:2009:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalTrader.g:2010:2: ( RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTrader.g:2010:3: RULE_INT
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
    // InternalTrader.g:2018:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2022:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalTrader.g:2023:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalTrader.g:2030:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2034:1: ( ( '.' ) )
            // InternalTrader.g:2035:1: ( '.' )
            {
            // InternalTrader.g:2035:1: ( '.' )
            // InternalTrader.g:2036:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalTrader.g:2045:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2049:1: ( rule__REAL__Group__2__Impl )
            // InternalTrader.g:2050:2: rule__REAL__Group__2__Impl
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
    // InternalTrader.g:2056:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2060:1: ( ( RULE_INT ) )
            // InternalTrader.g:2061:1: ( RULE_INT )
            {
            // InternalTrader.g:2061:1: ( RULE_INT )
            // InternalTrader.g:2062:2: RULE_INT
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
    // InternalTrader.g:2072:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2076:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalTrader.g:2077:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalTrader.g:2084:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2088:1: ( ( ruleMultiplication ) )
            // InternalTrader.g:2089:1: ( ruleMultiplication )
            {
            // InternalTrader.g:2089:1: ( ruleMultiplication )
            // InternalTrader.g:2090:2: ruleMultiplication
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
    // InternalTrader.g:2099:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2103:1: ( rule__Addition__Group__1__Impl )
            // InternalTrader.g:2104:2: rule__Addition__Group__1__Impl
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
    // InternalTrader.g:2110:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2114:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalTrader.g:2115:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalTrader.g:2115:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalTrader.g:2116:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalTrader.g:2117:2: ( rule__Addition__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=11 && LA11_0<=12)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTrader.g:2117:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
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
    // InternalTrader.g:2126:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2130:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalTrader.g:2131:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalTrader.g:2138:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2142:1: ( ( () ) )
            // InternalTrader.g:2143:1: ( () )
            {
            // InternalTrader.g:2143:1: ( () )
            // InternalTrader.g:2144:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalTrader.g:2145:2: ()
            // InternalTrader.g:2145:3: 
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
    // InternalTrader.g:2153:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2157:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalTrader.g:2158:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalTrader.g:2165:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2169:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalTrader.g:2170:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalTrader.g:2170:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalTrader.g:2171:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalTrader.g:2172:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalTrader.g:2172:3: rule__Addition__OperatorAssignment_1_1
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
    // InternalTrader.g:2180:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2184:1: ( rule__Addition__Group_1__2__Impl )
            // InternalTrader.g:2185:2: rule__Addition__Group_1__2__Impl
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
    // InternalTrader.g:2191:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2195:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalTrader.g:2196:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalTrader.g:2196:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalTrader.g:2197:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalTrader.g:2198:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalTrader.g:2198:3: rule__Addition__RightAssignment_1_2
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
    // InternalTrader.g:2207:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2211:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalTrader.g:2212:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalTrader.g:2219:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2223:1: ( ( rulePrimary ) )
            // InternalTrader.g:2224:1: ( rulePrimary )
            {
            // InternalTrader.g:2224:1: ( rulePrimary )
            // InternalTrader.g:2225:2: rulePrimary
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
    // InternalTrader.g:2234:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2238:1: ( rule__Multiplication__Group__1__Impl )
            // InternalTrader.g:2239:2: rule__Multiplication__Group__1__Impl
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
    // InternalTrader.g:2245:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2249:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalTrader.g:2250:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalTrader.g:2250:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalTrader.g:2251:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalTrader.g:2252:2: ( rule__Multiplication__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=13 && LA12_0<=14)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTrader.g:2252:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
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
    // InternalTrader.g:2261:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2265:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalTrader.g:2266:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalTrader.g:2273:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2277:1: ( ( () ) )
            // InternalTrader.g:2278:1: ( () )
            {
            // InternalTrader.g:2278:1: ( () )
            // InternalTrader.g:2279:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalTrader.g:2280:2: ()
            // InternalTrader.g:2280:3: 
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
    // InternalTrader.g:2288:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2292:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalTrader.g:2293:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalTrader.g:2300:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2304:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalTrader.g:2305:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalTrader.g:2305:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalTrader.g:2306:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalTrader.g:2307:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalTrader.g:2307:3: rule__Multiplication__OperatorAssignment_1_1
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
    // InternalTrader.g:2315:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2319:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalTrader.g:2320:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalTrader.g:2326:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2330:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalTrader.g:2331:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalTrader.g:2331:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalTrader.g:2332:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalTrader.g:2333:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalTrader.g:2333:3: rule__Multiplication__RightAssignment_1_2
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


    // $ANTLR start "rule__Primary__Group_3__0"
    // InternalTrader.g:2342:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2346:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // InternalTrader.g:2347:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Primary__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__1();

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
    // $ANTLR end "rule__Primary__Group_3__0"


    // $ANTLR start "rule__Primary__Group_3__0__Impl"
    // InternalTrader.g:2354:1: rule__Primary__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2358:1: ( ( '(' ) )
            // InternalTrader.g:2359:1: ( '(' )
            {
            // InternalTrader.g:2359:1: ( '(' )
            // InternalTrader.g:2360:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0__Impl"


    // $ANTLR start "rule__Primary__Group_3__1"
    // InternalTrader.g:2369:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2373:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // InternalTrader.g:2374:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_35);
            rule__Primary__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__2();

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
    // $ANTLR end "rule__Primary__Group_3__1"


    // $ANTLR start "rule__Primary__Group_3__1__Impl"
    // InternalTrader.g:2381:1: rule__Primary__Group_3__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2385:1: ( ( ruleAddition ) )
            // InternalTrader.g:2386:1: ( ruleAddition )
            {
            // InternalTrader.g:2386:1: ( ruleAddition )
            // InternalTrader.g:2387:2: ruleAddition
            {
             before(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1__Impl"


    // $ANTLR start "rule__Primary__Group_3__2"
    // InternalTrader.g:2396:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2400:1: ( rule__Primary__Group_3__2__Impl )
            // InternalTrader.g:2401:2: rule__Primary__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_3__2"


    // $ANTLR start "rule__Primary__Group_3__2__Impl"
    // InternalTrader.g:2407:1: rule__Primary__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2411:1: ( ( ')' ) )
            // InternalTrader.g:2412:1: ( ')' )
            {
            // InternalTrader.g:2412:1: ( ')' )
            // InternalTrader.g:2413:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2__Impl"


    // $ANTLR start "rule__Buy__Group__0"
    // InternalTrader.g:2423:1: rule__Buy__Group__0 : rule__Buy__Group__0__Impl rule__Buy__Group__1 ;
    public final void rule__Buy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2427:1: ( rule__Buy__Group__0__Impl rule__Buy__Group__1 )
            // InternalTrader.g:2428:2: rule__Buy__Group__0__Impl rule__Buy__Group__1
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
    // InternalTrader.g:2435:1: rule__Buy__Group__0__Impl : ( 'buy' ) ;
    public final void rule__Buy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2439:1: ( ( 'buy' ) )
            // InternalTrader.g:2440:1: ( 'buy' )
            {
            // InternalTrader.g:2440:1: ( 'buy' )
            // InternalTrader.g:2441:2: 'buy'
            {
             before(grammarAccess.getBuyAccess().getBuyKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalTrader.g:2450:1: rule__Buy__Group__1 : rule__Buy__Group__1__Impl rule__Buy__Group__2 ;
    public final void rule__Buy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2454:1: ( rule__Buy__Group__1__Impl rule__Buy__Group__2 )
            // InternalTrader.g:2455:2: rule__Buy__Group__1__Impl rule__Buy__Group__2
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
    // InternalTrader.g:2462:1: rule__Buy__Group__1__Impl : ( ( rule__Buy__QuantityAssignment_1 ) ) ;
    public final void rule__Buy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2466:1: ( ( ( rule__Buy__QuantityAssignment_1 ) ) )
            // InternalTrader.g:2467:1: ( ( rule__Buy__QuantityAssignment_1 ) )
            {
            // InternalTrader.g:2467:1: ( ( rule__Buy__QuantityAssignment_1 ) )
            // InternalTrader.g:2468:2: ( rule__Buy__QuantityAssignment_1 )
            {
             before(grammarAccess.getBuyAccess().getQuantityAssignment_1()); 
            // InternalTrader.g:2469:2: ( rule__Buy__QuantityAssignment_1 )
            // InternalTrader.g:2469:3: rule__Buy__QuantityAssignment_1
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
    // InternalTrader.g:2477:1: rule__Buy__Group__2 : rule__Buy__Group__2__Impl rule__Buy__Group__3 ;
    public final void rule__Buy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2481:1: ( rule__Buy__Group__2__Impl rule__Buy__Group__3 )
            // InternalTrader.g:2482:2: rule__Buy__Group__2__Impl rule__Buy__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalTrader.g:2489:1: rule__Buy__Group__2__Impl : ( ( rule__Buy__TickerAssignment_2 ) ) ;
    public final void rule__Buy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2493:1: ( ( ( rule__Buy__TickerAssignment_2 ) ) )
            // InternalTrader.g:2494:1: ( ( rule__Buy__TickerAssignment_2 ) )
            {
            // InternalTrader.g:2494:1: ( ( rule__Buy__TickerAssignment_2 ) )
            // InternalTrader.g:2495:2: ( rule__Buy__TickerAssignment_2 )
            {
             before(grammarAccess.getBuyAccess().getTickerAssignment_2()); 
            // InternalTrader.g:2496:2: ( rule__Buy__TickerAssignment_2 )
            // InternalTrader.g:2496:3: rule__Buy__TickerAssignment_2
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
    // InternalTrader.g:2504:1: rule__Buy__Group__3 : rule__Buy__Group__3__Impl rule__Buy__Group__4 ;
    public final void rule__Buy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2508:1: ( rule__Buy__Group__3__Impl rule__Buy__Group__4 )
            // InternalTrader.g:2509:2: rule__Buy__Group__3__Impl rule__Buy__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalTrader.g:2516:1: rule__Buy__Group__3__Impl : ( 'at' ) ;
    public final void rule__Buy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2520:1: ( ( 'at' ) )
            // InternalTrader.g:2521:1: ( 'at' )
            {
            // InternalTrader.g:2521:1: ( 'at' )
            // InternalTrader.g:2522:2: 'at'
            {
             before(grammarAccess.getBuyAccess().getAtKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalTrader.g:2531:1: rule__Buy__Group__4 : rule__Buy__Group__4__Impl rule__Buy__Group__5 ;
    public final void rule__Buy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2535:1: ( rule__Buy__Group__4__Impl rule__Buy__Group__5 )
            // InternalTrader.g:2536:2: rule__Buy__Group__4__Impl rule__Buy__Group__5
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
    // InternalTrader.g:2543:1: rule__Buy__Group__4__Impl : ( 'price' ) ;
    public final void rule__Buy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2547:1: ( ( 'price' ) )
            // InternalTrader.g:2548:1: ( 'price' )
            {
            // InternalTrader.g:2548:1: ( 'price' )
            // InternalTrader.g:2549:2: 'price'
            {
             before(grammarAccess.getBuyAccess().getPriceKeyword_4()); 
            match(input,45,FOLLOW_2); 
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
    // InternalTrader.g:2558:1: rule__Buy__Group__5 : rule__Buy__Group__5__Impl ;
    public final void rule__Buy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2562:1: ( rule__Buy__Group__5__Impl )
            // InternalTrader.g:2563:2: rule__Buy__Group__5__Impl
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
    // InternalTrader.g:2569:1: rule__Buy__Group__5__Impl : ( ( rule__Buy__PriceAssignment_5 ) ) ;
    public final void rule__Buy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2573:1: ( ( ( rule__Buy__PriceAssignment_5 ) ) )
            // InternalTrader.g:2574:1: ( ( rule__Buy__PriceAssignment_5 ) )
            {
            // InternalTrader.g:2574:1: ( ( rule__Buy__PriceAssignment_5 ) )
            // InternalTrader.g:2575:2: ( rule__Buy__PriceAssignment_5 )
            {
             before(grammarAccess.getBuyAccess().getPriceAssignment_5()); 
            // InternalTrader.g:2576:2: ( rule__Buy__PriceAssignment_5 )
            // InternalTrader.g:2576:3: rule__Buy__PriceAssignment_5
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
    // InternalTrader.g:2585:1: rule__Sell__Group__0 : rule__Sell__Group__0__Impl rule__Sell__Group__1 ;
    public final void rule__Sell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2589:1: ( rule__Sell__Group__0__Impl rule__Sell__Group__1 )
            // InternalTrader.g:2590:2: rule__Sell__Group__0__Impl rule__Sell__Group__1
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
    // InternalTrader.g:2597:1: rule__Sell__Group__0__Impl : ( 'sell' ) ;
    public final void rule__Sell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2601:1: ( ( 'sell' ) )
            // InternalTrader.g:2602:1: ( 'sell' )
            {
            // InternalTrader.g:2602:1: ( 'sell' )
            // InternalTrader.g:2603:2: 'sell'
            {
             before(grammarAccess.getSellAccess().getSellKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalTrader.g:2612:1: rule__Sell__Group__1 : rule__Sell__Group__1__Impl rule__Sell__Group__2 ;
    public final void rule__Sell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2616:1: ( rule__Sell__Group__1__Impl rule__Sell__Group__2 )
            // InternalTrader.g:2617:2: rule__Sell__Group__1__Impl rule__Sell__Group__2
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
    // InternalTrader.g:2624:1: rule__Sell__Group__1__Impl : ( ( rule__Sell__QuantityAssignment_1 ) ) ;
    public final void rule__Sell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2628:1: ( ( ( rule__Sell__QuantityAssignment_1 ) ) )
            // InternalTrader.g:2629:1: ( ( rule__Sell__QuantityAssignment_1 ) )
            {
            // InternalTrader.g:2629:1: ( ( rule__Sell__QuantityAssignment_1 ) )
            // InternalTrader.g:2630:2: ( rule__Sell__QuantityAssignment_1 )
            {
             before(grammarAccess.getSellAccess().getQuantityAssignment_1()); 
            // InternalTrader.g:2631:2: ( rule__Sell__QuantityAssignment_1 )
            // InternalTrader.g:2631:3: rule__Sell__QuantityAssignment_1
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
    // InternalTrader.g:2639:1: rule__Sell__Group__2 : rule__Sell__Group__2__Impl rule__Sell__Group__3 ;
    public final void rule__Sell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2643:1: ( rule__Sell__Group__2__Impl rule__Sell__Group__3 )
            // InternalTrader.g:2644:2: rule__Sell__Group__2__Impl rule__Sell__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalTrader.g:2651:1: rule__Sell__Group__2__Impl : ( ( rule__Sell__TickerAssignment_2 ) ) ;
    public final void rule__Sell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2655:1: ( ( ( rule__Sell__TickerAssignment_2 ) ) )
            // InternalTrader.g:2656:1: ( ( rule__Sell__TickerAssignment_2 ) )
            {
            // InternalTrader.g:2656:1: ( ( rule__Sell__TickerAssignment_2 ) )
            // InternalTrader.g:2657:2: ( rule__Sell__TickerAssignment_2 )
            {
             before(grammarAccess.getSellAccess().getTickerAssignment_2()); 
            // InternalTrader.g:2658:2: ( rule__Sell__TickerAssignment_2 )
            // InternalTrader.g:2658:3: rule__Sell__TickerAssignment_2
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
    // InternalTrader.g:2666:1: rule__Sell__Group__3 : rule__Sell__Group__3__Impl rule__Sell__Group__4 ;
    public final void rule__Sell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2670:1: ( rule__Sell__Group__3__Impl rule__Sell__Group__4 )
            // InternalTrader.g:2671:2: rule__Sell__Group__3__Impl rule__Sell__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalTrader.g:2678:1: rule__Sell__Group__3__Impl : ( 'at' ) ;
    public final void rule__Sell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2682:1: ( ( 'at' ) )
            // InternalTrader.g:2683:1: ( 'at' )
            {
            // InternalTrader.g:2683:1: ( 'at' )
            // InternalTrader.g:2684:2: 'at'
            {
             before(grammarAccess.getSellAccess().getAtKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalTrader.g:2693:1: rule__Sell__Group__4 : rule__Sell__Group__4__Impl rule__Sell__Group__5 ;
    public final void rule__Sell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2697:1: ( rule__Sell__Group__4__Impl rule__Sell__Group__5 )
            // InternalTrader.g:2698:2: rule__Sell__Group__4__Impl rule__Sell__Group__5
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
    // InternalTrader.g:2705:1: rule__Sell__Group__4__Impl : ( 'price' ) ;
    public final void rule__Sell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2709:1: ( ( 'price' ) )
            // InternalTrader.g:2710:1: ( 'price' )
            {
            // InternalTrader.g:2710:1: ( 'price' )
            // InternalTrader.g:2711:2: 'price'
            {
             before(grammarAccess.getSellAccess().getPriceKeyword_4()); 
            match(input,45,FOLLOW_2); 
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
    // InternalTrader.g:2720:1: rule__Sell__Group__5 : rule__Sell__Group__5__Impl ;
    public final void rule__Sell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2724:1: ( rule__Sell__Group__5__Impl )
            // InternalTrader.g:2725:2: rule__Sell__Group__5__Impl
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
    // InternalTrader.g:2731:1: rule__Sell__Group__5__Impl : ( ( rule__Sell__PriceAssignment_5 ) ) ;
    public final void rule__Sell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2735:1: ( ( ( rule__Sell__PriceAssignment_5 ) ) )
            // InternalTrader.g:2736:1: ( ( rule__Sell__PriceAssignment_5 ) )
            {
            // InternalTrader.g:2736:1: ( ( rule__Sell__PriceAssignment_5 ) )
            // InternalTrader.g:2737:2: ( rule__Sell__PriceAssignment_5 )
            {
             before(grammarAccess.getSellAccess().getPriceAssignment_5()); 
            // InternalTrader.g:2738:2: ( rule__Sell__PriceAssignment_5 )
            // InternalTrader.g:2738:3: rule__Sell__PriceAssignment_5
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
    // InternalTrader.g:2747:1: rule__TraderProgram__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__TraderProgram__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2751:1: ( ( ruleStatement ) )
            // InternalTrader.g:2752:2: ( ruleStatement )
            {
            // InternalTrader.g:2752:2: ( ruleStatement )
            // InternalTrader.g:2753:3: ruleStatement
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


    // $ANTLR start "rule__ConnectStatement__BrokerNameAssignment_3"
    // InternalTrader.g:2762:1: rule__ConnectStatement__BrokerNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ConnectStatement__BrokerNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2766:1: ( ( RULE_ID ) )
            // InternalTrader.g:2767:2: ( RULE_ID )
            {
            // InternalTrader.g:2767:2: ( RULE_ID )
            // InternalTrader.g:2768:3: RULE_ID
            {
             before(grammarAccess.getConnectStatementAccess().getBrokerNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getBrokerNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__BrokerNameAssignment_3"


    // $ANTLR start "rule__ConnectStatement__UsernameAssignment_6"
    // InternalTrader.g:2777:1: rule__ConnectStatement__UsernameAssignment_6 : ( ruleStringPrimary ) ;
    public final void rule__ConnectStatement__UsernameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2781:1: ( ( ruleStringPrimary ) )
            // InternalTrader.g:2782:2: ( ruleStringPrimary )
            {
            // InternalTrader.g:2782:2: ( ruleStringPrimary )
            // InternalTrader.g:2783:3: ruleStringPrimary
            {
             before(grammarAccess.getConnectStatementAccess().getUsernameStringPrimaryParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStringPrimary();

            state._fsp--;

             after(grammarAccess.getConnectStatementAccess().getUsernameStringPrimaryParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__UsernameAssignment_6"


    // $ANTLR start "rule__ConnectStatement__PasswordAssignment_9"
    // InternalTrader.g:2792:1: rule__ConnectStatement__PasswordAssignment_9 : ( ruleStringPrimary ) ;
    public final void rule__ConnectStatement__PasswordAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2796:1: ( ( ruleStringPrimary ) )
            // InternalTrader.g:2797:2: ( ruleStringPrimary )
            {
            // InternalTrader.g:2797:2: ( ruleStringPrimary )
            // InternalTrader.g:2798:3: ruleStringPrimary
            {
             before(grammarAccess.getConnectStatementAccess().getPasswordStringPrimaryParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleStringPrimary();

            state._fsp--;

             after(grammarAccess.getConnectStatementAccess().getPasswordStringPrimaryParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__PasswordAssignment_9"


    // $ANTLR start "rule__ConnectStatement__LeverageAssignment_12"
    // InternalTrader.g:2807:1: rule__ConnectStatement__LeverageAssignment_12 : ( ruleAddition ) ;
    public final void rule__ConnectStatement__LeverageAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2811:1: ( ( ruleAddition ) )
            // InternalTrader.g:2812:2: ( ruleAddition )
            {
            // InternalTrader.g:2812:2: ( ruleAddition )
            // InternalTrader.g:2813:3: ruleAddition
            {
             before(grammarAccess.getConnectStatementAccess().getLeverageAdditionParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getConnectStatementAccess().getLeverageAdditionParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__LeverageAssignment_12"


    // $ANTLR start "rule__ConnectStatement__MoneyAssignment_15"
    // InternalTrader.g:2822:1: rule__ConnectStatement__MoneyAssignment_15 : ( ruleAddition ) ;
    public final void rule__ConnectStatement__MoneyAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2826:1: ( ( ruleAddition ) )
            // InternalTrader.g:2827:2: ( ruleAddition )
            {
            // InternalTrader.g:2827:2: ( ruleAddition )
            // InternalTrader.g:2828:3: ruleAddition
            {
             before(grammarAccess.getConnectStatementAccess().getMoneyAdditionParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getConnectStatementAccess().getMoneyAdditionParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__MoneyAssignment_15"


    // $ANTLR start "rule__ConnectStatement__TimeframeAssignment_18"
    // InternalTrader.g:2837:1: rule__ConnectStatement__TimeframeAssignment_18 : ( ruleStringPrimary ) ;
    public final void rule__ConnectStatement__TimeframeAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2841:1: ( ( ruleStringPrimary ) )
            // InternalTrader.g:2842:2: ( ruleStringPrimary )
            {
            // InternalTrader.g:2842:2: ( ruleStringPrimary )
            // InternalTrader.g:2843:3: ruleStringPrimary
            {
             before(grammarAccess.getConnectStatementAccess().getTimeframeStringPrimaryParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleStringPrimary();

            state._fsp--;

             after(grammarAccess.getConnectStatementAccess().getTimeframeStringPrimaryParserRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__TimeframeAssignment_18"


    // $ANTLR start "rule__TradingBot__StrategyAssignment_3"
    // InternalTrader.g:2852:1: rule__TradingBot__StrategyAssignment_3 : ( ruleStrategyDef ) ;
    public final void rule__TradingBot__StrategyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2856:1: ( ( ruleStrategyDef ) )
            // InternalTrader.g:2857:2: ( ruleStrategyDef )
            {
            // InternalTrader.g:2857:2: ( ruleStrategyDef )
            // InternalTrader.g:2858:3: ruleStrategyDef
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


    // $ANTLR start "rule__TradingBot__FundAssignment_6"
    // InternalTrader.g:2867:1: rule__TradingBot__FundAssignment_6 : ( ruleAddition ) ;
    public final void rule__TradingBot__FundAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2871:1: ( ( ruleAddition ) )
            // InternalTrader.g:2872:2: ( ruleAddition )
            {
            // InternalTrader.g:2872:2: ( ruleAddition )
            // InternalTrader.g:2873:3: ruleAddition
            {
             before(grammarAccess.getTradingBotAccess().getFundAdditionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getTradingBotAccess().getFundAdditionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TradingBot__FundAssignment_6"


    // $ANTLR start "rule__ListBots__ListCommandAssignment_0"
    // InternalTrader.g:2882:1: rule__ListBots__ListCommandAssignment_0 : ( ( 'see' ) ) ;
    public final void rule__ListBots__ListCommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2886:1: ( ( ( 'see' ) ) )
            // InternalTrader.g:2887:2: ( ( 'see' ) )
            {
            // InternalTrader.g:2887:2: ( ( 'see' ) )
            // InternalTrader.g:2888:3: ( 'see' )
            {
             before(grammarAccess.getListBotsAccess().getListCommandSeeKeyword_0_0()); 
            // InternalTrader.g:2889:3: ( 'see' )
            // InternalTrader.g:2890:4: 'see'
            {
             before(grammarAccess.getListBotsAccess().getListCommandSeeKeyword_0_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalTrader.g:2901:1: rule__Execute__ExecuteCommandAssignment_0 : ( ( 'execute' ) ) ;
    public final void rule__Execute__ExecuteCommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2905:1: ( ( ( 'execute' ) ) )
            // InternalTrader.g:2906:2: ( ( 'execute' ) )
            {
            // InternalTrader.g:2906:2: ( ( 'execute' ) )
            // InternalTrader.g:2907:3: ( 'execute' )
            {
             before(grammarAccess.getExecuteAccess().getExecuteCommandExecuteKeyword_0_0()); 
            // InternalTrader.g:2908:3: ( 'execute' )
            // InternalTrader.g:2909:4: 'execute'
            {
             before(grammarAccess.getExecuteAccess().getExecuteCommandExecuteKeyword_0_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalTrader.g:2920:1: rule__Stop__StopCommandAssignment_0 : ( ( 'stop' ) ) ;
    public final void rule__Stop__StopCommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2924:1: ( ( ( 'stop' ) ) )
            // InternalTrader.g:2925:2: ( ( 'stop' ) )
            {
            // InternalTrader.g:2925:2: ( ( 'stop' ) )
            // InternalTrader.g:2926:3: ( 'stop' )
            {
             before(grammarAccess.getStopAccess().getStopCommandStopKeyword_0_0()); 
            // InternalTrader.g:2927:3: ( 'stop' )
            // InternalTrader.g:2928:4: 'stop'
            {
             before(grammarAccess.getStopAccess().getStopCommandStopKeyword_0_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalTrader.g:2939:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2943:1: ( ( RULE_ID ) )
            // InternalTrader.g:2944:2: ( RULE_ID )
            {
            // InternalTrader.g:2944:2: ( RULE_ID )
            // InternalTrader.g:2945:3: RULE_ID
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


    // $ANTLR start "rule__VariableDeclaration__ValueAssignment_3_0"
    // InternalTrader.g:2954:1: rule__VariableDeclaration__ValueAssignment_3_0 : ( ruleStringValue ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2958:1: ( ( ruleStringValue ) )
            // InternalTrader.g:2959:2: ( ruleStringValue )
            {
            // InternalTrader.g:2959:2: ( ruleStringValue )
            // InternalTrader.g:2960:3: ruleStringValue
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueStringValueParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getValueStringValueParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ValueAssignment_3_0"


    // $ANTLR start "rule__VariableDeclaration__ValueAssignment_3_1"
    // InternalTrader.g:2969:1: rule__VariableDeclaration__ValueAssignment_3_1 : ( ruleRealValue ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2973:1: ( ( ruleRealValue ) )
            // InternalTrader.g:2974:2: ( ruleRealValue )
            {
            // InternalTrader.g:2974:2: ( ruleRealValue )
            // InternalTrader.g:2975:3: ruleRealValue
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueRealValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRealValue();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getValueRealValueParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ValueAssignment_3_1"


    // $ANTLR start "rule__VariableDeclaration__ValueAssignment_3_2"
    // InternalTrader.g:2984:1: rule__VariableDeclaration__ValueAssignment_3_2 : ( ruleIntValue ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2988:1: ( ( ruleIntValue ) )
            // InternalTrader.g:2989:2: ( ruleIntValue )
            {
            // InternalTrader.g:2989:2: ( ruleIntValue )
            // InternalTrader.g:2990:3: ruleIntValue
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueIntValueParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getValueIntValueParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ValueAssignment_3_2"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalTrader.g:2999:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3003:1: ( ( RULE_STRING ) )
            // InternalTrader.g:3004:2: ( RULE_STRING )
            {
            // InternalTrader.g:3004:2: ( RULE_STRING )
            // InternalTrader.g:3005:3: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__RealValue__ValueAssignment"
    // InternalTrader.g:3014:1: rule__RealValue__ValueAssignment : ( ruleREAL ) ;
    public final void rule__RealValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3018:1: ( ( ruleREAL ) )
            // InternalTrader.g:3019:2: ( ruleREAL )
            {
            // InternalTrader.g:3019:2: ( ruleREAL )
            // InternalTrader.g:3020:3: ruleREAL
            {
             before(grammarAccess.getRealValueAccess().getValueREALParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getRealValueAccess().getValueREALParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__ValueAssignment"


    // $ANTLR start "rule__IntValue__ValueAssignment"
    // InternalTrader.g:3029:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3033:1: ( ( RULE_INT ) )
            // InternalTrader.g:3034:2: ( RULE_INT )
            {
            // InternalTrader.g:3034:2: ( RULE_INT )
            // InternalTrader.g:3035:3: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__ValueAssignment"


    // $ANTLR start "rule__LoopStatement__CountAssignment_1"
    // InternalTrader.g:3044:1: rule__LoopStatement__CountAssignment_1 : ( ruleAddition ) ;
    public final void rule__LoopStatement__CountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3048:1: ( ( ruleAddition ) )
            // InternalTrader.g:3049:2: ( ruleAddition )
            {
            // InternalTrader.g:3049:2: ( ruleAddition )
            // InternalTrader.g:3050:3: ruleAddition
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
    // InternalTrader.g:3059:1: rule__LoopStatement__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__LoopStatement__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3063:1: ( ( ruleStatement ) )
            // InternalTrader.g:3064:2: ( ruleStatement )
            {
            // InternalTrader.g:3064:2: ( ruleStatement )
            // InternalTrader.g:3065:3: ruleStatement
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
    // InternalTrader.g:3074:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3078:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalTrader.g:3079:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalTrader.g:3079:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalTrader.g:3080:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalTrader.g:3081:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalTrader.g:3081:4: rule__Addition__OperatorAlternatives_1_1_0
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
    // InternalTrader.g:3089:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3093:1: ( ( ruleMultiplication ) )
            // InternalTrader.g:3094:2: ( ruleMultiplication )
            {
            // InternalTrader.g:3094:2: ( ruleMultiplication )
            // InternalTrader.g:3095:3: ruleMultiplication
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
    // InternalTrader.g:3104:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3108:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalTrader.g:3109:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalTrader.g:3109:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalTrader.g:3110:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalTrader.g:3111:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalTrader.g:3111:4: rule__Multiplication__OperatorAlternatives_1_1_0
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
    // InternalTrader.g:3119:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3123:1: ( ( rulePrimary ) )
            // InternalTrader.g:3124:2: ( rulePrimary )
            {
            // InternalTrader.g:3124:2: ( rulePrimary )
            // InternalTrader.g:3125:3: rulePrimary
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


    // $ANTLR start "rule__NumVarExpression__VarAssignment"
    // InternalTrader.g:3134:1: rule__NumVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NumVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3138:1: ( ( ( RULE_ID ) ) )
            // InternalTrader.g:3139:2: ( ( RULE_ID ) )
            {
            // InternalTrader.g:3139:2: ( ( RULE_ID ) )
            // InternalTrader.g:3140:3: ( RULE_ID )
            {
             before(grammarAccess.getNumVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalTrader.g:3141:3: ( RULE_ID )
            // InternalTrader.g:3142:4: RULE_ID
            {
             before(grammarAccess.getNumVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNumVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getNumVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumVarExpression__VarAssignment"


    // $ANTLR start "rule__StringVarExpression__VarAssignment"
    // InternalTrader.g:3153:1: rule__StringVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__StringVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3157:1: ( ( ( RULE_ID ) ) )
            // InternalTrader.g:3158:2: ( ( RULE_ID ) )
            {
            // InternalTrader.g:3158:2: ( ( RULE_ID ) )
            // InternalTrader.g:3159:3: ( RULE_ID )
            {
             before(grammarAccess.getStringVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalTrader.g:3160:3: ( RULE_ID )
            // InternalTrader.g:3161:4: RULE_ID
            {
             before(grammarAccess.getStringVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getStringVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVarExpression__VarAssignment"


    // $ANTLR start "rule__Buy__QuantityAssignment_1"
    // InternalTrader.g:3172:1: rule__Buy__QuantityAssignment_1 : ( ruleAddition ) ;
    public final void rule__Buy__QuantityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3176:1: ( ( ruleAddition ) )
            // InternalTrader.g:3177:2: ( ruleAddition )
            {
            // InternalTrader.g:3177:2: ( ruleAddition )
            // InternalTrader.g:3178:3: ruleAddition
            {
             before(grammarAccess.getBuyAccess().getQuantityAdditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getBuyAccess().getQuantityAdditionParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalTrader.g:3187:1: rule__Buy__TickerAssignment_2 : ( RULE_ID ) ;
    public final void rule__Buy__TickerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3191:1: ( ( RULE_ID ) )
            // InternalTrader.g:3192:2: ( RULE_ID )
            {
            // InternalTrader.g:3192:2: ( RULE_ID )
            // InternalTrader.g:3193:3: RULE_ID
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
    // InternalTrader.g:3202:1: rule__Buy__PriceAssignment_5 : ( ruleAddition ) ;
    public final void rule__Buy__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3206:1: ( ( ruleAddition ) )
            // InternalTrader.g:3207:2: ( ruleAddition )
            {
            // InternalTrader.g:3207:2: ( ruleAddition )
            // InternalTrader.g:3208:3: ruleAddition
            {
             before(grammarAccess.getBuyAccess().getPriceAdditionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getBuyAccess().getPriceAdditionParserRuleCall_5_0()); 

            }


            }

        }
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
    // InternalTrader.g:3217:1: rule__Sell__QuantityAssignment_1 : ( ruleAddition ) ;
    public final void rule__Sell__QuantityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3221:1: ( ( ruleAddition ) )
            // InternalTrader.g:3222:2: ( ruleAddition )
            {
            // InternalTrader.g:3222:2: ( ruleAddition )
            // InternalTrader.g:3223:3: ruleAddition
            {
             before(grammarAccess.getSellAccess().getQuantityAdditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getSellAccess().getQuantityAdditionParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalTrader.g:3232:1: rule__Sell__TickerAssignment_2 : ( RULE_ID ) ;
    public final void rule__Sell__TickerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3236:1: ( ( RULE_ID ) )
            // InternalTrader.g:3237:2: ( RULE_ID )
            {
            // InternalTrader.g:3237:2: ( RULE_ID )
            // InternalTrader.g:3238:3: RULE_ID
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
    // InternalTrader.g:3247:1: rule__Sell__PriceAssignment_5 : ( ruleAddition ) ;
    public final void rule__Sell__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3251:1: ( ( ruleAddition ) )
            // InternalTrader.g:3252:2: ( ruleAddition )
            {
            // InternalTrader.g:3252:2: ( ruleAddition )
            // InternalTrader.g:3253:3: ruleAddition
            {
             before(grammarAccess.getSellAccess().getPriceAdditionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getSellAccess().getPriceAdditionParserRuleCall_5_0()); 

            }


            }

        }
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0003801408020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000030000000030L});
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
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0003801408020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});

}