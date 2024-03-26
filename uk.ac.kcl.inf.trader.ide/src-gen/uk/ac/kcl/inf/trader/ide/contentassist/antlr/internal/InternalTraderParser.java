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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'buyAndHold'", "'meanReversion'", "'M1'", "'M2'", "'M3'", "'M4'", "'M5'", "'M6'", "'M10'", "'M12'", "'M20'", "'M30'", "'H1'", "'H2'", "'H3'", "'H4'", "'H6'", "'H8'", "'H12'", "'D1'", "'W1'", "'MN1'", "'connect'", "'to'", "'trade'", "'on'", "'server'", "'with'", "'login'", "','", "'password'", "'timeframe'", "'create'", "'bot'", "'strategy'", "'using'", "'lot'", "'size'", "'registered'", "'bots'", "'execute'", "'for'", "'days'", "'hours'", "'minutes'", "'seconds'", "'var'", "'='", "'loop'", "'times'", "'do'", "'end'", "'('", "')'", "'.'", "'see'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

                if ( (LA1_0==37||LA1_0==47||LA1_0==55||LA1_0==61||LA1_0==63||LA1_0==70) ) {
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


    // $ANTLR start "entryRuleCreateBotStatement"
    // InternalTrader.g:128:1: entryRuleCreateBotStatement : ruleCreateBotStatement EOF ;
    public final void entryRuleCreateBotStatement() throws RecognitionException {
        try {
            // InternalTrader.g:129:1: ( ruleCreateBotStatement EOF )
            // InternalTrader.g:130:1: ruleCreateBotStatement EOF
            {
             before(grammarAccess.getCreateBotStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateBotStatement();

            state._fsp--;

             after(grammarAccess.getCreateBotStatementRule()); 
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
    // $ANTLR end "entryRuleCreateBotStatement"


    // $ANTLR start "ruleCreateBotStatement"
    // InternalTrader.g:137:1: ruleCreateBotStatement : ( ( rule__CreateBotStatement__Group__0 ) ) ;
    public final void ruleCreateBotStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:141:2: ( ( ( rule__CreateBotStatement__Group__0 ) ) )
            // InternalTrader.g:142:2: ( ( rule__CreateBotStatement__Group__0 ) )
            {
            // InternalTrader.g:142:2: ( ( rule__CreateBotStatement__Group__0 ) )
            // InternalTrader.g:143:3: ( rule__CreateBotStatement__Group__0 )
            {
             before(grammarAccess.getCreateBotStatementAccess().getGroup()); 
            // InternalTrader.g:144:3: ( rule__CreateBotStatement__Group__0 )
            // InternalTrader.g:144:4: rule__CreateBotStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateBotStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateBotStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreateBotStatement"


    // $ANTLR start "entryRuleListBotsStatement"
    // InternalTrader.g:153:1: entryRuleListBotsStatement : ruleListBotsStatement EOF ;
    public final void entryRuleListBotsStatement() throws RecognitionException {
        try {
            // InternalTrader.g:154:1: ( ruleListBotsStatement EOF )
            // InternalTrader.g:155:1: ruleListBotsStatement EOF
            {
             before(grammarAccess.getListBotsStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleListBotsStatement();

            state._fsp--;

             after(grammarAccess.getListBotsStatementRule()); 
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
    // $ANTLR end "entryRuleListBotsStatement"


    // $ANTLR start "ruleListBotsStatement"
    // InternalTrader.g:162:1: ruleListBotsStatement : ( ( rule__ListBotsStatement__Group__0 ) ) ;
    public final void ruleListBotsStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:166:2: ( ( ( rule__ListBotsStatement__Group__0 ) ) )
            // InternalTrader.g:167:2: ( ( rule__ListBotsStatement__Group__0 ) )
            {
            // InternalTrader.g:167:2: ( ( rule__ListBotsStatement__Group__0 ) )
            // InternalTrader.g:168:3: ( rule__ListBotsStatement__Group__0 )
            {
             before(grammarAccess.getListBotsStatementAccess().getGroup()); 
            // InternalTrader.g:169:3: ( rule__ListBotsStatement__Group__0 )
            // InternalTrader.g:169:4: rule__ListBotsStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListBotsStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListBotsStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListBotsStatement"


    // $ANTLR start "entryRuleExecuteBotsStatement"
    // InternalTrader.g:178:1: entryRuleExecuteBotsStatement : ruleExecuteBotsStatement EOF ;
    public final void entryRuleExecuteBotsStatement() throws RecognitionException {
        try {
            // InternalTrader.g:179:1: ( ruleExecuteBotsStatement EOF )
            // InternalTrader.g:180:1: ruleExecuteBotsStatement EOF
            {
             before(grammarAccess.getExecuteBotsStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleExecuteBotsStatement();

            state._fsp--;

             after(grammarAccess.getExecuteBotsStatementRule()); 
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
    // $ANTLR end "entryRuleExecuteBotsStatement"


    // $ANTLR start "ruleExecuteBotsStatement"
    // InternalTrader.g:187:1: ruleExecuteBotsStatement : ( ( rule__ExecuteBotsStatement__Group__0 ) ) ;
    public final void ruleExecuteBotsStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:191:2: ( ( ( rule__ExecuteBotsStatement__Group__0 ) ) )
            // InternalTrader.g:192:2: ( ( rule__ExecuteBotsStatement__Group__0 ) )
            {
            // InternalTrader.g:192:2: ( ( rule__ExecuteBotsStatement__Group__0 ) )
            // InternalTrader.g:193:3: ( rule__ExecuteBotsStatement__Group__0 )
            {
             before(grammarAccess.getExecuteBotsStatementAccess().getGroup()); 
            // InternalTrader.g:194:3: ( rule__ExecuteBotsStatement__Group__0 )
            // InternalTrader.g:194:4: rule__ExecuteBotsStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExecuteBotsStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExecuteBotsStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExecuteBotsStatement"


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


    // $ANTLR start "entryRuleStringValue"
    // InternalTrader.g:228:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalTrader.g:229:1: ( ruleStringValue EOF )
            // InternalTrader.g:230:1: ruleStringValue EOF
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
    // InternalTrader.g:237:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:241:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalTrader.g:242:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalTrader.g:242:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalTrader.g:243:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalTrader.g:244:3: ( rule__StringValue__ValueAssignment )
            // InternalTrader.g:244:4: rule__StringValue__ValueAssignment
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
    // InternalTrader.g:253:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // InternalTrader.g:254:1: ( ruleRealValue EOF )
            // InternalTrader.g:255:1: ruleRealValue EOF
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
    // InternalTrader.g:262:1: ruleRealValue : ( ( rule__RealValue__ValueAssignment ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:266:2: ( ( ( rule__RealValue__ValueAssignment ) ) )
            // InternalTrader.g:267:2: ( ( rule__RealValue__ValueAssignment ) )
            {
            // InternalTrader.g:267:2: ( ( rule__RealValue__ValueAssignment ) )
            // InternalTrader.g:268:3: ( rule__RealValue__ValueAssignment )
            {
             before(grammarAccess.getRealValueAccess().getValueAssignment()); 
            // InternalTrader.g:269:3: ( rule__RealValue__ValueAssignment )
            // InternalTrader.g:269:4: rule__RealValue__ValueAssignment
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
    // InternalTrader.g:278:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalTrader.g:279:1: ( ruleIntValue EOF )
            // InternalTrader.g:280:1: ruleIntValue EOF
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
    // InternalTrader.g:287:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:291:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalTrader.g:292:2: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalTrader.g:292:2: ( ( rule__IntValue__ValueAssignment ) )
            // InternalTrader.g:293:3: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // InternalTrader.g:294:3: ( rule__IntValue__ValueAssignment )
            // InternalTrader.g:294:4: rule__IntValue__ValueAssignment
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
    // InternalTrader.g:303:1: entryRuleLoopStatement : ruleLoopStatement EOF ;
    public final void entryRuleLoopStatement() throws RecognitionException {
        try {
            // InternalTrader.g:304:1: ( ruleLoopStatement EOF )
            // InternalTrader.g:305:1: ruleLoopStatement EOF
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
    // InternalTrader.g:312:1: ruleLoopStatement : ( ( rule__LoopStatement__Group__0 ) ) ;
    public final void ruleLoopStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:316:2: ( ( ( rule__LoopStatement__Group__0 ) ) )
            // InternalTrader.g:317:2: ( ( rule__LoopStatement__Group__0 ) )
            {
            // InternalTrader.g:317:2: ( ( rule__LoopStatement__Group__0 ) )
            // InternalTrader.g:318:3: ( rule__LoopStatement__Group__0 )
            {
             before(grammarAccess.getLoopStatementAccess().getGroup()); 
            // InternalTrader.g:319:3: ( rule__LoopStatement__Group__0 )
            // InternalTrader.g:319:4: rule__LoopStatement__Group__0
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


    // $ANTLR start "entryRuleAddition"
    // InternalTrader.g:328:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalTrader.g:329:1: ( ruleAddition EOF )
            // InternalTrader.g:330:1: ruleAddition EOF
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
    // InternalTrader.g:337:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:341:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalTrader.g:342:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalTrader.g:342:2: ( ( rule__Addition__Group__0 ) )
            // InternalTrader.g:343:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalTrader.g:344:3: ( rule__Addition__Group__0 )
            // InternalTrader.g:344:4: rule__Addition__Group__0
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
    // InternalTrader.g:353:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalTrader.g:354:1: ( ruleMultiplication EOF )
            // InternalTrader.g:355:1: ruleMultiplication EOF
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
    // InternalTrader.g:362:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:366:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalTrader.g:367:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalTrader.g:367:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalTrader.g:368:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalTrader.g:369:3: ( rule__Multiplication__Group__0 )
            // InternalTrader.g:369:4: rule__Multiplication__Group__0
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
    // InternalTrader.g:378:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalTrader.g:379:1: ( rulePrimary EOF )
            // InternalTrader.g:380:1: rulePrimary EOF
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
    // InternalTrader.g:387:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:391:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalTrader.g:392:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalTrader.g:392:2: ( ( rule__Primary__Alternatives ) )
            // InternalTrader.g:393:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalTrader.g:394:3: ( rule__Primary__Alternatives )
            // InternalTrader.g:394:4: rule__Primary__Alternatives
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
    // InternalTrader.g:403:1: entryRuleNumVarExpression : ruleNumVarExpression EOF ;
    public final void entryRuleNumVarExpression() throws RecognitionException {
        try {
            // InternalTrader.g:404:1: ( ruleNumVarExpression EOF )
            // InternalTrader.g:405:1: ruleNumVarExpression EOF
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
    // InternalTrader.g:412:1: ruleNumVarExpression : ( ( rule__NumVarExpression__VarAssignment ) ) ;
    public final void ruleNumVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:416:2: ( ( ( rule__NumVarExpression__VarAssignment ) ) )
            // InternalTrader.g:417:2: ( ( rule__NumVarExpression__VarAssignment ) )
            {
            // InternalTrader.g:417:2: ( ( rule__NumVarExpression__VarAssignment ) )
            // InternalTrader.g:418:3: ( rule__NumVarExpression__VarAssignment )
            {
             before(grammarAccess.getNumVarExpressionAccess().getVarAssignment()); 
            // InternalTrader.g:419:3: ( rule__NumVarExpression__VarAssignment )
            // InternalTrader.g:419:4: rule__NumVarExpression__VarAssignment
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


    // $ANTLR start "entryRuleREAL"
    // InternalTrader.g:428:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTrader.g:432:1: ( ruleREAL EOF )
            // InternalTrader.g:433:1: ruleREAL EOF
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
    // InternalTrader.g:443:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:448:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalTrader.g:449:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalTrader.g:449:2: ( ( rule__REAL__Group__0 ) )
            // InternalTrader.g:450:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalTrader.g:451:3: ( rule__REAL__Group__0 )
            // InternalTrader.g:451:4: rule__REAL__Group__0
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


    // $ANTLR start "entryRuleStringPrimary"
    // InternalTrader.g:461:1: entryRuleStringPrimary : ruleStringPrimary EOF ;
    public final void entryRuleStringPrimary() throws RecognitionException {
        try {
            // InternalTrader.g:462:1: ( ruleStringPrimary EOF )
            // InternalTrader.g:463:1: ruleStringPrimary EOF
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
    // InternalTrader.g:470:1: ruleStringPrimary : ( ( rule__StringPrimary__Alternatives ) ) ;
    public final void ruleStringPrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:474:2: ( ( ( rule__StringPrimary__Alternatives ) ) )
            // InternalTrader.g:475:2: ( ( rule__StringPrimary__Alternatives ) )
            {
            // InternalTrader.g:475:2: ( ( rule__StringPrimary__Alternatives ) )
            // InternalTrader.g:476:3: ( rule__StringPrimary__Alternatives )
            {
             before(grammarAccess.getStringPrimaryAccess().getAlternatives()); 
            // InternalTrader.g:477:3: ( rule__StringPrimary__Alternatives )
            // InternalTrader.g:477:4: rule__StringPrimary__Alternatives
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
    // InternalTrader.g:486:1: entryRuleStringVarExpression : ruleStringVarExpression EOF ;
    public final void entryRuleStringVarExpression() throws RecognitionException {
        try {
            // InternalTrader.g:487:1: ( ruleStringVarExpression EOF )
            // InternalTrader.g:488:1: ruleStringVarExpression EOF
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
    // InternalTrader.g:495:1: ruleStringVarExpression : ( ( rule__StringVarExpression__VarAssignment ) ) ;
    public final void ruleStringVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:499:2: ( ( ( rule__StringVarExpression__VarAssignment ) ) )
            // InternalTrader.g:500:2: ( ( rule__StringVarExpression__VarAssignment ) )
            {
            // InternalTrader.g:500:2: ( ( rule__StringVarExpression__VarAssignment ) )
            // InternalTrader.g:501:3: ( rule__StringVarExpression__VarAssignment )
            {
             before(grammarAccess.getStringVarExpressionAccess().getVarAssignment()); 
            // InternalTrader.g:502:3: ( rule__StringVarExpression__VarAssignment )
            // InternalTrader.g:502:4: rule__StringVarExpression__VarAssignment
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


    // $ANTLR start "ruleTimeFrameDef"
    // InternalTrader.g:527:1: ruleTimeFrameDef : ( ( rule__TimeFrameDef__Alternatives ) ) ;
    public final void ruleTimeFrameDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:531:1: ( ( ( rule__TimeFrameDef__Alternatives ) ) )
            // InternalTrader.g:532:2: ( ( rule__TimeFrameDef__Alternatives ) )
            {
            // InternalTrader.g:532:2: ( ( rule__TimeFrameDef__Alternatives ) )
            // InternalTrader.g:533:3: ( rule__TimeFrameDef__Alternatives )
            {
             before(grammarAccess.getTimeFrameDefAccess().getAlternatives()); 
            // InternalTrader.g:534:3: ( rule__TimeFrameDef__Alternatives )
            // InternalTrader.g:534:4: rule__TimeFrameDef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeFrameDef__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeFrameDefAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeFrameDef"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalTrader.g:542:1: rule__Statement__Alternatives : ( ( ruleConnectStatement ) | ( ruleCreateBotStatement ) | ( ruleListBotsStatement ) | ( ruleExecuteBotsStatement ) | ( ruleVariableDeclaration ) | ( ruleLoopStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:546:1: ( ( ruleConnectStatement ) | ( ruleCreateBotStatement ) | ( ruleListBotsStatement ) | ( ruleExecuteBotsStatement ) | ( ruleVariableDeclaration ) | ( ruleLoopStatement ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt2=1;
                }
                break;
            case 47:
                {
                alt2=2;
                }
                break;
            case 70:
                {
                alt2=3;
                }
                break;
            case 55:
                {
                alt2=4;
                }
                break;
            case 61:
                {
                alt2=5;
                }
                break;
            case 63:
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
                    // InternalTrader.g:547:2: ( ruleConnectStatement )
                    {
                    // InternalTrader.g:547:2: ( ruleConnectStatement )
                    // InternalTrader.g:548:3: ruleConnectStatement
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
                    // InternalTrader.g:553:2: ( ruleCreateBotStatement )
                    {
                    // InternalTrader.g:553:2: ( ruleCreateBotStatement )
                    // InternalTrader.g:554:3: ruleCreateBotStatement
                    {
                     before(grammarAccess.getStatementAccess().getCreateBotStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCreateBotStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCreateBotStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTrader.g:559:2: ( ruleListBotsStatement )
                    {
                    // InternalTrader.g:559:2: ( ruleListBotsStatement )
                    // InternalTrader.g:560:3: ruleListBotsStatement
                    {
                     before(grammarAccess.getStatementAccess().getListBotsStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleListBotsStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getListBotsStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTrader.g:565:2: ( ruleExecuteBotsStatement )
                    {
                    // InternalTrader.g:565:2: ( ruleExecuteBotsStatement )
                    // InternalTrader.g:566:3: ruleExecuteBotsStatement
                    {
                     before(grammarAccess.getStatementAccess().getExecuteBotsStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExecuteBotsStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getExecuteBotsStatementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTrader.g:571:2: ( ruleVariableDeclaration )
                    {
                    // InternalTrader.g:571:2: ( ruleVariableDeclaration )
                    // InternalTrader.g:572:3: ruleVariableDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTrader.g:577:2: ( ruleLoopStatement )
                    {
                    // InternalTrader.g:577:2: ( ruleLoopStatement )
                    // InternalTrader.g:578:3: ruleLoopStatement
                    {
                     before(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleLoopStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_5()); 

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
    // InternalTrader.g:587:1: rule__VariableDeclaration__Alternatives_3 : ( ( ( rule__VariableDeclaration__ValueAssignment_3_0 ) ) | ( ( rule__VariableDeclaration__ValueAssignment_3_1 ) ) | ( ( rule__VariableDeclaration__ValueAssignment_3_2 ) ) );
    public final void rule__VariableDeclaration__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:591:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3_0 ) ) | ( ( rule__VariableDeclaration__ValueAssignment_3_1 ) ) | ( ( rule__VariableDeclaration__ValueAssignment_3_2 ) ) )
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

                if ( (LA3_2==EOF||LA3_2==37||LA3_2==47||LA3_2==55||LA3_2==61||LA3_2==63||LA3_2==66||LA3_2==70) ) {
                    alt3=3;
                }
                else if ( (LA3_2==69) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 69:
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
                    // InternalTrader.g:592:2: ( ( rule__VariableDeclaration__ValueAssignment_3_0 ) )
                    {
                    // InternalTrader.g:592:2: ( ( rule__VariableDeclaration__ValueAssignment_3_0 ) )
                    // InternalTrader.g:593:3: ( rule__VariableDeclaration__ValueAssignment_3_0 )
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3_0()); 
                    // InternalTrader.g:594:3: ( rule__VariableDeclaration__ValueAssignment_3_0 )
                    // InternalTrader.g:594:4: rule__VariableDeclaration__ValueAssignment_3_0
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
                    // InternalTrader.g:598:2: ( ( rule__VariableDeclaration__ValueAssignment_3_1 ) )
                    {
                    // InternalTrader.g:598:2: ( ( rule__VariableDeclaration__ValueAssignment_3_1 ) )
                    // InternalTrader.g:599:3: ( rule__VariableDeclaration__ValueAssignment_3_1 )
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3_1()); 
                    // InternalTrader.g:600:3: ( rule__VariableDeclaration__ValueAssignment_3_1 )
                    // InternalTrader.g:600:4: rule__VariableDeclaration__ValueAssignment_3_1
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
                    // InternalTrader.g:604:2: ( ( rule__VariableDeclaration__ValueAssignment_3_2 ) )
                    {
                    // InternalTrader.g:604:2: ( ( rule__VariableDeclaration__ValueAssignment_3_2 ) )
                    // InternalTrader.g:605:3: ( rule__VariableDeclaration__ValueAssignment_3_2 )
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3_2()); 
                    // InternalTrader.g:606:3: ( rule__VariableDeclaration__ValueAssignment_3_2 )
                    // InternalTrader.g:606:4: rule__VariableDeclaration__ValueAssignment_3_2
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
    // InternalTrader.g:614:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:618:1: ( ( '+' ) | ( '-' ) )
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
                    // InternalTrader.g:619:2: ( '+' )
                    {
                    // InternalTrader.g:619:2: ( '+' )
                    // InternalTrader.g:620:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:625:2: ( '-' )
                    {
                    // InternalTrader.g:625:2: ( '-' )
                    // InternalTrader.g:626:3: '-'
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
    // InternalTrader.g:635:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:639:1: ( ( '*' ) | ( '/' ) )
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
                    // InternalTrader.g:640:2: ( '*' )
                    {
                    // InternalTrader.g:640:2: ( '*' )
                    // InternalTrader.g:641:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:646:2: ( '/' )
                    {
                    // InternalTrader.g:646:2: ( '/' )
                    // InternalTrader.g:647:3: '/'
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
    // InternalTrader.g:656:1: rule__Primary__Alternatives : ( ( ruleIntValue ) | ( ruleRealValue ) | ( ruleNumVarExpression ) | ( ( rule__Primary__Group_3__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:660:1: ( ( ruleIntValue ) | ( ruleRealValue ) | ( ruleNumVarExpression ) | ( ( rule__Primary__Group_3__0 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==69) ) {
                    alt6=2;
                }
                else if ( (LA6_1==EOF||(LA6_1>=11 && LA6_1<=14)||LA6_1==37||LA6_1==47||LA6_1==55||(LA6_1>=57 && LA6_1<=61)||(LA6_1>=63 && LA6_1<=64)||LA6_1==66||LA6_1==68||LA6_1==70) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 69:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            case 67:
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
                    // InternalTrader.g:661:2: ( ruleIntValue )
                    {
                    // InternalTrader.g:661:2: ( ruleIntValue )
                    // InternalTrader.g:662:3: ruleIntValue
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
                    // InternalTrader.g:667:2: ( ruleRealValue )
                    {
                    // InternalTrader.g:667:2: ( ruleRealValue )
                    // InternalTrader.g:668:3: ruleRealValue
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
                    // InternalTrader.g:673:2: ( ruleNumVarExpression )
                    {
                    // InternalTrader.g:673:2: ( ruleNumVarExpression )
                    // InternalTrader.g:674:3: ruleNumVarExpression
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
                    // InternalTrader.g:679:2: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // InternalTrader.g:679:2: ( ( rule__Primary__Group_3__0 ) )
                    // InternalTrader.g:680:3: ( rule__Primary__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    // InternalTrader.g:681:3: ( rule__Primary__Group_3__0 )
                    // InternalTrader.g:681:4: rule__Primary__Group_3__0
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
    // InternalTrader.g:689:1: rule__StringPrimary__Alternatives : ( ( ruleStringVarExpression ) | ( ruleStringValue ) );
    public final void rule__StringPrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:693:1: ( ( ruleStringVarExpression ) | ( ruleStringValue ) )
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
                    // InternalTrader.g:694:2: ( ruleStringVarExpression )
                    {
                    // InternalTrader.g:694:2: ( ruleStringVarExpression )
                    // InternalTrader.g:695:3: ruleStringVarExpression
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
                    // InternalTrader.g:700:2: ( ruleStringValue )
                    {
                    // InternalTrader.g:700:2: ( ruleStringValue )
                    // InternalTrader.g:701:3: ruleStringValue
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
    // InternalTrader.g:710:1: rule__StrategyDef__Alternatives : ( ( ( 'buyAndHold' ) ) | ( ( 'meanReversion' ) ) );
    public final void rule__StrategyDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:714:1: ( ( ( 'buyAndHold' ) ) | ( ( 'meanReversion' ) ) )
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
                    // InternalTrader.g:715:2: ( ( 'buyAndHold' ) )
                    {
                    // InternalTrader.g:715:2: ( ( 'buyAndHold' ) )
                    // InternalTrader.g:716:3: ( 'buyAndHold' )
                    {
                     before(grammarAccess.getStrategyDefAccess().getBuyAndHoldEnumLiteralDeclaration_0()); 
                    // InternalTrader.g:717:3: ( 'buyAndHold' )
                    // InternalTrader.g:717:4: 'buyAndHold'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getStrategyDefAccess().getBuyAndHoldEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:721:2: ( ( 'meanReversion' ) )
                    {
                    // InternalTrader.g:721:2: ( ( 'meanReversion' ) )
                    // InternalTrader.g:722:3: ( 'meanReversion' )
                    {
                     before(grammarAccess.getStrategyDefAccess().getMeanReversionEnumLiteralDeclaration_1()); 
                    // InternalTrader.g:723:3: ( 'meanReversion' )
                    // InternalTrader.g:723:4: 'meanReversion'
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


    // $ANTLR start "rule__TimeFrameDef__Alternatives"
    // InternalTrader.g:731:1: rule__TimeFrameDef__Alternatives : ( ( ( 'M1' ) ) | ( ( 'M2' ) ) | ( ( 'M3' ) ) | ( ( 'M4' ) ) | ( ( 'M5' ) ) | ( ( 'M6' ) ) | ( ( 'M10' ) ) | ( ( 'M12' ) ) | ( ( 'M20' ) ) | ( ( 'M30' ) ) | ( ( 'H1' ) ) | ( ( 'H2' ) ) | ( ( 'H3' ) ) | ( ( 'H4' ) ) | ( ( 'H6' ) ) | ( ( 'H8' ) ) | ( ( 'H12' ) ) | ( ( 'D1' ) ) | ( ( 'W1' ) ) | ( ( 'MN1' ) ) );
    public final void rule__TimeFrameDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:735:1: ( ( ( 'M1' ) ) | ( ( 'M2' ) ) | ( ( 'M3' ) ) | ( ( 'M4' ) ) | ( ( 'M5' ) ) | ( ( 'M6' ) ) | ( ( 'M10' ) ) | ( ( 'M12' ) ) | ( ( 'M20' ) ) | ( ( 'M30' ) ) | ( ( 'H1' ) ) | ( ( 'H2' ) ) | ( ( 'H3' ) ) | ( ( 'H4' ) ) | ( ( 'H6' ) ) | ( ( 'H8' ) ) | ( ( 'H12' ) ) | ( ( 'D1' ) ) | ( ( 'W1' ) ) | ( ( 'MN1' ) ) )
            int alt9=20;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 18:
                {
                alt9=2;
                }
                break;
            case 19:
                {
                alt9=3;
                }
                break;
            case 20:
                {
                alt9=4;
                }
                break;
            case 21:
                {
                alt9=5;
                }
                break;
            case 22:
                {
                alt9=6;
                }
                break;
            case 23:
                {
                alt9=7;
                }
                break;
            case 24:
                {
                alt9=8;
                }
                break;
            case 25:
                {
                alt9=9;
                }
                break;
            case 26:
                {
                alt9=10;
                }
                break;
            case 27:
                {
                alt9=11;
                }
                break;
            case 28:
                {
                alt9=12;
                }
                break;
            case 29:
                {
                alt9=13;
                }
                break;
            case 30:
                {
                alt9=14;
                }
                break;
            case 31:
                {
                alt9=15;
                }
                break;
            case 32:
                {
                alt9=16;
                }
                break;
            case 33:
                {
                alt9=17;
                }
                break;
            case 34:
                {
                alt9=18;
                }
                break;
            case 35:
                {
                alt9=19;
                }
                break;
            case 36:
                {
                alt9=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalTrader.g:736:2: ( ( 'M1' ) )
                    {
                    // InternalTrader.g:736:2: ( ( 'M1' ) )
                    // InternalTrader.g:737:3: ( 'M1' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getM1EnumLiteralDeclaration_0()); 
                    // InternalTrader.g:738:3: ( 'M1' )
                    // InternalTrader.g:738:4: 'M1'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getM1EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrader.g:742:2: ( ( 'M2' ) )
                    {
                    // InternalTrader.g:742:2: ( ( 'M2' ) )
                    // InternalTrader.g:743:3: ( 'M2' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getM2EnumLiteralDeclaration_1()); 
                    // InternalTrader.g:744:3: ( 'M2' )
                    // InternalTrader.g:744:4: 'M2'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getM2EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTrader.g:748:2: ( ( 'M3' ) )
                    {
                    // InternalTrader.g:748:2: ( ( 'M3' ) )
                    // InternalTrader.g:749:3: ( 'M3' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getM3EnumLiteralDeclaration_2()); 
                    // InternalTrader.g:750:3: ( 'M3' )
                    // InternalTrader.g:750:4: 'M3'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getM3EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTrader.g:754:2: ( ( 'M4' ) )
                    {
                    // InternalTrader.g:754:2: ( ( 'M4' ) )
                    // InternalTrader.g:755:3: ( 'M4' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getM4EnumLiteralDeclaration_3()); 
                    // InternalTrader.g:756:3: ( 'M4' )
                    // InternalTrader.g:756:4: 'M4'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getM4EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTrader.g:760:2: ( ( 'M5' ) )
                    {
                    // InternalTrader.g:760:2: ( ( 'M5' ) )
                    // InternalTrader.g:761:3: ( 'M5' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getM5EnumLiteralDeclaration_4()); 
                    // InternalTrader.g:762:3: ( 'M5' )
                    // InternalTrader.g:762:4: 'M5'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getM5EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTrader.g:766:2: ( ( 'M6' ) )
                    {
                    // InternalTrader.g:766:2: ( ( 'M6' ) )
                    // InternalTrader.g:767:3: ( 'M6' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getM6EnumLiteralDeclaration_5()); 
                    // InternalTrader.g:768:3: ( 'M6' )
                    // InternalTrader.g:768:4: 'M6'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getM6EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTrader.g:772:2: ( ( 'M10' ) )
                    {
                    // InternalTrader.g:772:2: ( ( 'M10' ) )
                    // InternalTrader.g:773:3: ( 'M10' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getM10EnumLiteralDeclaration_6()); 
                    // InternalTrader.g:774:3: ( 'M10' )
                    // InternalTrader.g:774:4: 'M10'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getM10EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalTrader.g:778:2: ( ( 'M12' ) )
                    {
                    // InternalTrader.g:778:2: ( ( 'M12' ) )
                    // InternalTrader.g:779:3: ( 'M12' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getM12EnumLiteralDeclaration_7()); 
                    // InternalTrader.g:780:3: ( 'M12' )
                    // InternalTrader.g:780:4: 'M12'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getM12EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalTrader.g:784:2: ( ( 'M20' ) )
                    {
                    // InternalTrader.g:784:2: ( ( 'M20' ) )
                    // InternalTrader.g:785:3: ( 'M20' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getM20EnumLiteralDeclaration_8()); 
                    // InternalTrader.g:786:3: ( 'M20' )
                    // InternalTrader.g:786:4: 'M20'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getM20EnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalTrader.g:790:2: ( ( 'M30' ) )
                    {
                    // InternalTrader.g:790:2: ( ( 'M30' ) )
                    // InternalTrader.g:791:3: ( 'M30' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getM30EnumLiteralDeclaration_9()); 
                    // InternalTrader.g:792:3: ( 'M30' )
                    // InternalTrader.g:792:4: 'M30'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getM30EnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalTrader.g:796:2: ( ( 'H1' ) )
                    {
                    // InternalTrader.g:796:2: ( ( 'H1' ) )
                    // InternalTrader.g:797:3: ( 'H1' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getH1EnumLiteralDeclaration_10()); 
                    // InternalTrader.g:798:3: ( 'H1' )
                    // InternalTrader.g:798:4: 'H1'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getH1EnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalTrader.g:802:2: ( ( 'H2' ) )
                    {
                    // InternalTrader.g:802:2: ( ( 'H2' ) )
                    // InternalTrader.g:803:3: ( 'H2' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getH2EnumLiteralDeclaration_11()); 
                    // InternalTrader.g:804:3: ( 'H2' )
                    // InternalTrader.g:804:4: 'H2'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getH2EnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalTrader.g:808:2: ( ( 'H3' ) )
                    {
                    // InternalTrader.g:808:2: ( ( 'H3' ) )
                    // InternalTrader.g:809:3: ( 'H3' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getH3EnumLiteralDeclaration_12()); 
                    // InternalTrader.g:810:3: ( 'H3' )
                    // InternalTrader.g:810:4: 'H3'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getH3EnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalTrader.g:814:2: ( ( 'H4' ) )
                    {
                    // InternalTrader.g:814:2: ( ( 'H4' ) )
                    // InternalTrader.g:815:3: ( 'H4' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getH4EnumLiteralDeclaration_13()); 
                    // InternalTrader.g:816:3: ( 'H4' )
                    // InternalTrader.g:816:4: 'H4'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getH4EnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalTrader.g:820:2: ( ( 'H6' ) )
                    {
                    // InternalTrader.g:820:2: ( ( 'H6' ) )
                    // InternalTrader.g:821:3: ( 'H6' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getH6EnumLiteralDeclaration_14()); 
                    // InternalTrader.g:822:3: ( 'H6' )
                    // InternalTrader.g:822:4: 'H6'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getH6EnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalTrader.g:826:2: ( ( 'H8' ) )
                    {
                    // InternalTrader.g:826:2: ( ( 'H8' ) )
                    // InternalTrader.g:827:3: ( 'H8' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getH8EnumLiteralDeclaration_15()); 
                    // InternalTrader.g:828:3: ( 'H8' )
                    // InternalTrader.g:828:4: 'H8'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getH8EnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalTrader.g:832:2: ( ( 'H12' ) )
                    {
                    // InternalTrader.g:832:2: ( ( 'H12' ) )
                    // InternalTrader.g:833:3: ( 'H12' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getH12EnumLiteralDeclaration_16()); 
                    // InternalTrader.g:834:3: ( 'H12' )
                    // InternalTrader.g:834:4: 'H12'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getH12EnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalTrader.g:838:2: ( ( 'D1' ) )
                    {
                    // InternalTrader.g:838:2: ( ( 'D1' ) )
                    // InternalTrader.g:839:3: ( 'D1' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getD1EnumLiteralDeclaration_17()); 
                    // InternalTrader.g:840:3: ( 'D1' )
                    // InternalTrader.g:840:4: 'D1'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getD1EnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalTrader.g:844:2: ( ( 'W1' ) )
                    {
                    // InternalTrader.g:844:2: ( ( 'W1' ) )
                    // InternalTrader.g:845:3: ( 'W1' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getW1EnumLiteralDeclaration_18()); 
                    // InternalTrader.g:846:3: ( 'W1' )
                    // InternalTrader.g:846:4: 'W1'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getW1EnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalTrader.g:850:2: ( ( 'MN1' ) )
                    {
                    // InternalTrader.g:850:2: ( ( 'MN1' ) )
                    // InternalTrader.g:851:3: ( 'MN1' )
                    {
                     before(grammarAccess.getTimeFrameDefAccess().getMN1EnumLiteralDeclaration_19()); 
                    // InternalTrader.g:852:3: ( 'MN1' )
                    // InternalTrader.g:852:4: 'MN1'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeFrameDefAccess().getMN1EnumLiteralDeclaration_19()); 

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
    // $ANTLR end "rule__TimeFrameDef__Alternatives"


    // $ANTLR start "rule__ConnectStatement__Group__0"
    // InternalTrader.g:860:1: rule__ConnectStatement__Group__0 : rule__ConnectStatement__Group__0__Impl rule__ConnectStatement__Group__1 ;
    public final void rule__ConnectStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:864:1: ( rule__ConnectStatement__Group__0__Impl rule__ConnectStatement__Group__1 )
            // InternalTrader.g:865:2: rule__ConnectStatement__Group__0__Impl rule__ConnectStatement__Group__1
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
    // InternalTrader.g:872:1: rule__ConnectStatement__Group__0__Impl : ( 'connect' ) ;
    public final void rule__ConnectStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:876:1: ( ( 'connect' ) )
            // InternalTrader.g:877:1: ( 'connect' )
            {
            // InternalTrader.g:877:1: ( 'connect' )
            // InternalTrader.g:878:2: 'connect'
            {
             before(grammarAccess.getConnectStatementAccess().getConnectKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalTrader.g:887:1: rule__ConnectStatement__Group__1 : rule__ConnectStatement__Group__1__Impl rule__ConnectStatement__Group__2 ;
    public final void rule__ConnectStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:891:1: ( rule__ConnectStatement__Group__1__Impl rule__ConnectStatement__Group__2 )
            // InternalTrader.g:892:2: rule__ConnectStatement__Group__1__Impl rule__ConnectStatement__Group__2
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
    // InternalTrader.g:899:1: rule__ConnectStatement__Group__1__Impl : ( 'to' ) ;
    public final void rule__ConnectStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:903:1: ( ( 'to' ) )
            // InternalTrader.g:904:1: ( 'to' )
            {
            // InternalTrader.g:904:1: ( 'to' )
            // InternalTrader.g:905:2: 'to'
            {
             before(grammarAccess.getConnectStatementAccess().getToKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTrader.g:914:1: rule__ConnectStatement__Group__2 : rule__ConnectStatement__Group__2__Impl rule__ConnectStatement__Group__3 ;
    public final void rule__ConnectStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:918:1: ( rule__ConnectStatement__Group__2__Impl rule__ConnectStatement__Group__3 )
            // InternalTrader.g:919:2: rule__ConnectStatement__Group__2__Impl rule__ConnectStatement__Group__3
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
    // InternalTrader.g:926:1: rule__ConnectStatement__Group__2__Impl : ( 'trade' ) ;
    public final void rule__ConnectStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:930:1: ( ( 'trade' ) )
            // InternalTrader.g:931:1: ( 'trade' )
            {
            // InternalTrader.g:931:1: ( 'trade' )
            // InternalTrader.g:932:2: 'trade'
            {
             before(grammarAccess.getConnectStatementAccess().getTradeKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getTradeKeyword_2()); 

            }


            }

        }
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
    // InternalTrader.g:941:1: rule__ConnectStatement__Group__3 : rule__ConnectStatement__Group__3__Impl rule__ConnectStatement__Group__4 ;
    public final void rule__ConnectStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:945:1: ( rule__ConnectStatement__Group__3__Impl rule__ConnectStatement__Group__4 )
            // InternalTrader.g:946:2: rule__ConnectStatement__Group__3__Impl rule__ConnectStatement__Group__4
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
    // InternalTrader.g:953:1: rule__ConnectStatement__Group__3__Impl : ( ( rule__ConnectStatement__TickerNameAssignment_3 ) ) ;
    public final void rule__ConnectStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:957:1: ( ( ( rule__ConnectStatement__TickerNameAssignment_3 ) ) )
            // InternalTrader.g:958:1: ( ( rule__ConnectStatement__TickerNameAssignment_3 ) )
            {
            // InternalTrader.g:958:1: ( ( rule__ConnectStatement__TickerNameAssignment_3 ) )
            // InternalTrader.g:959:2: ( rule__ConnectStatement__TickerNameAssignment_3 )
            {
             before(grammarAccess.getConnectStatementAccess().getTickerNameAssignment_3()); 
            // InternalTrader.g:960:2: ( rule__ConnectStatement__TickerNameAssignment_3 )
            // InternalTrader.g:960:3: rule__ConnectStatement__TickerNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConnectStatement__TickerNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConnectStatementAccess().getTickerNameAssignment_3()); 

            }


            }

        }
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
    // InternalTrader.g:968:1: rule__ConnectStatement__Group__4 : rule__ConnectStatement__Group__4__Impl rule__ConnectStatement__Group__5 ;
    public final void rule__ConnectStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:972:1: ( rule__ConnectStatement__Group__4__Impl rule__ConnectStatement__Group__5 )
            // InternalTrader.g:973:2: rule__ConnectStatement__Group__4__Impl rule__ConnectStatement__Group__5
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
    // InternalTrader.g:980:1: rule__ConnectStatement__Group__4__Impl : ( 'on' ) ;
    public final void rule__ConnectStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:984:1: ( ( 'on' ) )
            // InternalTrader.g:985:1: ( 'on' )
            {
            // InternalTrader.g:985:1: ( 'on' )
            // InternalTrader.g:986:2: 'on'
            {
             before(grammarAccess.getConnectStatementAccess().getOnKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getOnKeyword_4()); 

            }


            }

        }
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
    // InternalTrader.g:995:1: rule__ConnectStatement__Group__5 : rule__ConnectStatement__Group__5__Impl rule__ConnectStatement__Group__6 ;
    public final void rule__ConnectStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:999:1: ( rule__ConnectStatement__Group__5__Impl rule__ConnectStatement__Group__6 )
            // InternalTrader.g:1000:2: rule__ConnectStatement__Group__5__Impl rule__ConnectStatement__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalTrader.g:1007:1: rule__ConnectStatement__Group__5__Impl : ( 'server' ) ;
    public final void rule__ConnectStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1011:1: ( ( 'server' ) )
            // InternalTrader.g:1012:1: ( 'server' )
            {
            // InternalTrader.g:1012:1: ( 'server' )
            // InternalTrader.g:1013:2: 'server'
            {
             before(grammarAccess.getConnectStatementAccess().getServerKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getServerKeyword_5()); 

            }


            }

        }
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
    // InternalTrader.g:1022:1: rule__ConnectStatement__Group__6 : rule__ConnectStatement__Group__6__Impl rule__ConnectStatement__Group__7 ;
    public final void rule__ConnectStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1026:1: ( rule__ConnectStatement__Group__6__Impl rule__ConnectStatement__Group__7 )
            // InternalTrader.g:1027:2: rule__ConnectStatement__Group__6__Impl rule__ConnectStatement__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalTrader.g:1034:1: rule__ConnectStatement__Group__6__Impl : ( ( rule__ConnectStatement__BrokerNameAssignment_6 ) ) ;
    public final void rule__ConnectStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1038:1: ( ( ( rule__ConnectStatement__BrokerNameAssignment_6 ) ) )
            // InternalTrader.g:1039:1: ( ( rule__ConnectStatement__BrokerNameAssignment_6 ) )
            {
            // InternalTrader.g:1039:1: ( ( rule__ConnectStatement__BrokerNameAssignment_6 ) )
            // InternalTrader.g:1040:2: ( rule__ConnectStatement__BrokerNameAssignment_6 )
            {
             before(grammarAccess.getConnectStatementAccess().getBrokerNameAssignment_6()); 
            // InternalTrader.g:1041:2: ( rule__ConnectStatement__BrokerNameAssignment_6 )
            // InternalTrader.g:1041:3: rule__ConnectStatement__BrokerNameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ConnectStatement__BrokerNameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConnectStatementAccess().getBrokerNameAssignment_6()); 

            }


            }

        }
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
    // InternalTrader.g:1049:1: rule__ConnectStatement__Group__7 : rule__ConnectStatement__Group__7__Impl rule__ConnectStatement__Group__8 ;
    public final void rule__ConnectStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1053:1: ( rule__ConnectStatement__Group__7__Impl rule__ConnectStatement__Group__8 )
            // InternalTrader.g:1054:2: rule__ConnectStatement__Group__7__Impl rule__ConnectStatement__Group__8
            {
            pushFollow(FOLLOW_10);
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
    // InternalTrader.g:1061:1: rule__ConnectStatement__Group__7__Impl : ( 'with' ) ;
    public final void rule__ConnectStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1065:1: ( ( 'with' ) )
            // InternalTrader.g:1066:1: ( 'with' )
            {
            // InternalTrader.g:1066:1: ( 'with' )
            // InternalTrader.g:1067:2: 'with'
            {
             before(grammarAccess.getConnectStatementAccess().getWithKeyword_7()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getWithKeyword_7()); 

            }


            }

        }
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
    // InternalTrader.g:1076:1: rule__ConnectStatement__Group__8 : rule__ConnectStatement__Group__8__Impl rule__ConnectStatement__Group__9 ;
    public final void rule__ConnectStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1080:1: ( rule__ConnectStatement__Group__8__Impl rule__ConnectStatement__Group__9 )
            // InternalTrader.g:1081:2: rule__ConnectStatement__Group__8__Impl rule__ConnectStatement__Group__9
            {
            pushFollow(FOLLOW_6);
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
    // InternalTrader.g:1088:1: rule__ConnectStatement__Group__8__Impl : ( 'login' ) ;
    public final void rule__ConnectStatement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1092:1: ( ( 'login' ) )
            // InternalTrader.g:1093:1: ( 'login' )
            {
            // InternalTrader.g:1093:1: ( 'login' )
            // InternalTrader.g:1094:2: 'login'
            {
             before(grammarAccess.getConnectStatementAccess().getLoginKeyword_8()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getLoginKeyword_8()); 

            }


            }

        }
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
    // InternalTrader.g:1103:1: rule__ConnectStatement__Group__9 : rule__ConnectStatement__Group__9__Impl rule__ConnectStatement__Group__10 ;
    public final void rule__ConnectStatement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1107:1: ( rule__ConnectStatement__Group__9__Impl rule__ConnectStatement__Group__10 )
            // InternalTrader.g:1108:2: rule__ConnectStatement__Group__9__Impl rule__ConnectStatement__Group__10
            {
            pushFollow(FOLLOW_11);
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
    // InternalTrader.g:1115:1: rule__ConnectStatement__Group__9__Impl : ( ( rule__ConnectStatement__UsernameAssignment_9 ) ) ;
    public final void rule__ConnectStatement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1119:1: ( ( ( rule__ConnectStatement__UsernameAssignment_9 ) ) )
            // InternalTrader.g:1120:1: ( ( rule__ConnectStatement__UsernameAssignment_9 ) )
            {
            // InternalTrader.g:1120:1: ( ( rule__ConnectStatement__UsernameAssignment_9 ) )
            // InternalTrader.g:1121:2: ( rule__ConnectStatement__UsernameAssignment_9 )
            {
             before(grammarAccess.getConnectStatementAccess().getUsernameAssignment_9()); 
            // InternalTrader.g:1122:2: ( rule__ConnectStatement__UsernameAssignment_9 )
            // InternalTrader.g:1122:3: rule__ConnectStatement__UsernameAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ConnectStatement__UsernameAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getConnectStatementAccess().getUsernameAssignment_9()); 

            }


            }

        }
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
    // InternalTrader.g:1130:1: rule__ConnectStatement__Group__10 : rule__ConnectStatement__Group__10__Impl rule__ConnectStatement__Group__11 ;
    public final void rule__ConnectStatement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1134:1: ( rule__ConnectStatement__Group__10__Impl rule__ConnectStatement__Group__11 )
            // InternalTrader.g:1135:2: rule__ConnectStatement__Group__10__Impl rule__ConnectStatement__Group__11
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
    // InternalTrader.g:1142:1: rule__ConnectStatement__Group__10__Impl : ( ',' ) ;
    public final void rule__ConnectStatement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1146:1: ( ( ',' ) )
            // InternalTrader.g:1147:1: ( ',' )
            {
            // InternalTrader.g:1147:1: ( ',' )
            // InternalTrader.g:1148:2: ','
            {
             before(grammarAccess.getConnectStatementAccess().getCommaKeyword_10()); 
            match(input,44,FOLLOW_2); 
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
    // InternalTrader.g:1157:1: rule__ConnectStatement__Group__11 : rule__ConnectStatement__Group__11__Impl rule__ConnectStatement__Group__12 ;
    public final void rule__ConnectStatement__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1161:1: ( rule__ConnectStatement__Group__11__Impl rule__ConnectStatement__Group__12 )
            // InternalTrader.g:1162:2: rule__ConnectStatement__Group__11__Impl rule__ConnectStatement__Group__12
            {
            pushFollow(FOLLOW_6);
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
    // InternalTrader.g:1169:1: rule__ConnectStatement__Group__11__Impl : ( 'password' ) ;
    public final void rule__ConnectStatement__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1173:1: ( ( 'password' ) )
            // InternalTrader.g:1174:1: ( 'password' )
            {
            // InternalTrader.g:1174:1: ( 'password' )
            // InternalTrader.g:1175:2: 'password'
            {
             before(grammarAccess.getConnectStatementAccess().getPasswordKeyword_11()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getPasswordKeyword_11()); 

            }


            }

        }
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
    // InternalTrader.g:1184:1: rule__ConnectStatement__Group__12 : rule__ConnectStatement__Group__12__Impl rule__ConnectStatement__Group__13 ;
    public final void rule__ConnectStatement__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1188:1: ( rule__ConnectStatement__Group__12__Impl rule__ConnectStatement__Group__13 )
            // InternalTrader.g:1189:2: rule__ConnectStatement__Group__12__Impl rule__ConnectStatement__Group__13
            {
            pushFollow(FOLLOW_11);
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
    // InternalTrader.g:1196:1: rule__ConnectStatement__Group__12__Impl : ( ( rule__ConnectStatement__PasswordAssignment_12 ) ) ;
    public final void rule__ConnectStatement__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1200:1: ( ( ( rule__ConnectStatement__PasswordAssignment_12 ) ) )
            // InternalTrader.g:1201:1: ( ( rule__ConnectStatement__PasswordAssignment_12 ) )
            {
            // InternalTrader.g:1201:1: ( ( rule__ConnectStatement__PasswordAssignment_12 ) )
            // InternalTrader.g:1202:2: ( rule__ConnectStatement__PasswordAssignment_12 )
            {
             before(grammarAccess.getConnectStatementAccess().getPasswordAssignment_12()); 
            // InternalTrader.g:1203:2: ( rule__ConnectStatement__PasswordAssignment_12 )
            // InternalTrader.g:1203:3: rule__ConnectStatement__PasswordAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__ConnectStatement__PasswordAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getConnectStatementAccess().getPasswordAssignment_12()); 

            }


            }

        }
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
    // InternalTrader.g:1211:1: rule__ConnectStatement__Group__13 : rule__ConnectStatement__Group__13__Impl rule__ConnectStatement__Group__14 ;
    public final void rule__ConnectStatement__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1215:1: ( rule__ConnectStatement__Group__13__Impl rule__ConnectStatement__Group__14 )
            // InternalTrader.g:1216:2: rule__ConnectStatement__Group__13__Impl rule__ConnectStatement__Group__14
            {
            pushFollow(FOLLOW_13);
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
    // InternalTrader.g:1223:1: rule__ConnectStatement__Group__13__Impl : ( ',' ) ;
    public final void rule__ConnectStatement__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1227:1: ( ( ',' ) )
            // InternalTrader.g:1228:1: ( ',' )
            {
            // InternalTrader.g:1228:1: ( ',' )
            // InternalTrader.g:1229:2: ','
            {
             before(grammarAccess.getConnectStatementAccess().getCommaKeyword_13()); 
            match(input,44,FOLLOW_2); 
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
    // InternalTrader.g:1238:1: rule__ConnectStatement__Group__14 : rule__ConnectStatement__Group__14__Impl rule__ConnectStatement__Group__15 ;
    public final void rule__ConnectStatement__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1242:1: ( rule__ConnectStatement__Group__14__Impl rule__ConnectStatement__Group__15 )
            // InternalTrader.g:1243:2: rule__ConnectStatement__Group__14__Impl rule__ConnectStatement__Group__15
            {
            pushFollow(FOLLOW_14);
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
    // InternalTrader.g:1250:1: rule__ConnectStatement__Group__14__Impl : ( 'timeframe' ) ;
    public final void rule__ConnectStatement__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1254:1: ( ( 'timeframe' ) )
            // InternalTrader.g:1255:1: ( 'timeframe' )
            {
            // InternalTrader.g:1255:1: ( 'timeframe' )
            // InternalTrader.g:1256:2: 'timeframe'
            {
             before(grammarAccess.getConnectStatementAccess().getTimeframeKeyword_14()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getConnectStatementAccess().getTimeframeKeyword_14()); 

            }


            }

        }
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
    // InternalTrader.g:1265:1: rule__ConnectStatement__Group__15 : rule__ConnectStatement__Group__15__Impl ;
    public final void rule__ConnectStatement__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1269:1: ( rule__ConnectStatement__Group__15__Impl )
            // InternalTrader.g:1270:2: rule__ConnectStatement__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectStatement__Group__15__Impl();

            state._fsp--;


            }

        }
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
    // InternalTrader.g:1276:1: rule__ConnectStatement__Group__15__Impl : ( ( rule__ConnectStatement__TimeframeAssignment_15 ) ) ;
    public final void rule__ConnectStatement__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1280:1: ( ( ( rule__ConnectStatement__TimeframeAssignment_15 ) ) )
            // InternalTrader.g:1281:1: ( ( rule__ConnectStatement__TimeframeAssignment_15 ) )
            {
            // InternalTrader.g:1281:1: ( ( rule__ConnectStatement__TimeframeAssignment_15 ) )
            // InternalTrader.g:1282:2: ( rule__ConnectStatement__TimeframeAssignment_15 )
            {
             before(grammarAccess.getConnectStatementAccess().getTimeframeAssignment_15()); 
            // InternalTrader.g:1283:2: ( rule__ConnectStatement__TimeframeAssignment_15 )
            // InternalTrader.g:1283:3: rule__ConnectStatement__TimeframeAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__ConnectStatement__TimeframeAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getConnectStatementAccess().getTimeframeAssignment_15()); 

            }


            }

        }
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


    // $ANTLR start "rule__CreateBotStatement__Group__0"
    // InternalTrader.g:1292:1: rule__CreateBotStatement__Group__0 : rule__CreateBotStatement__Group__0__Impl rule__CreateBotStatement__Group__1 ;
    public final void rule__CreateBotStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1296:1: ( rule__CreateBotStatement__Group__0__Impl rule__CreateBotStatement__Group__1 )
            // InternalTrader.g:1297:2: rule__CreateBotStatement__Group__0__Impl rule__CreateBotStatement__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__CreateBotStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateBotStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__Group__0"


    // $ANTLR start "rule__CreateBotStatement__Group__0__Impl"
    // InternalTrader.g:1304:1: rule__CreateBotStatement__Group__0__Impl : ( 'create' ) ;
    public final void rule__CreateBotStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1308:1: ( ( 'create' ) )
            // InternalTrader.g:1309:1: ( 'create' )
            {
            // InternalTrader.g:1309:1: ( 'create' )
            // InternalTrader.g:1310:2: 'create'
            {
             before(grammarAccess.getCreateBotStatementAccess().getCreateKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getCreateBotStatementAccess().getCreateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__Group__0__Impl"


    // $ANTLR start "rule__CreateBotStatement__Group__1"
    // InternalTrader.g:1319:1: rule__CreateBotStatement__Group__1 : rule__CreateBotStatement__Group__1__Impl rule__CreateBotStatement__Group__2 ;
    public final void rule__CreateBotStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1323:1: ( rule__CreateBotStatement__Group__1__Impl rule__CreateBotStatement__Group__2 )
            // InternalTrader.g:1324:2: rule__CreateBotStatement__Group__1__Impl rule__CreateBotStatement__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__CreateBotStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateBotStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__Group__1"


    // $ANTLR start "rule__CreateBotStatement__Group__1__Impl"
    // InternalTrader.g:1331:1: rule__CreateBotStatement__Group__1__Impl : ( 'bot' ) ;
    public final void rule__CreateBotStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1335:1: ( ( 'bot' ) )
            // InternalTrader.g:1336:1: ( 'bot' )
            {
            // InternalTrader.g:1336:1: ( 'bot' )
            // InternalTrader.g:1337:2: 'bot'
            {
             before(grammarAccess.getCreateBotStatementAccess().getBotKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCreateBotStatementAccess().getBotKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__Group__1__Impl"


    // $ANTLR start "rule__CreateBotStatement__Group__2"
    // InternalTrader.g:1346:1: rule__CreateBotStatement__Group__2 : rule__CreateBotStatement__Group__2__Impl rule__CreateBotStatement__Group__3 ;
    public final void rule__CreateBotStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1350:1: ( rule__CreateBotStatement__Group__2__Impl rule__CreateBotStatement__Group__3 )
            // InternalTrader.g:1351:2: rule__CreateBotStatement__Group__2__Impl rule__CreateBotStatement__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__CreateBotStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateBotStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__Group__2"


    // $ANTLR start "rule__CreateBotStatement__Group__2__Impl"
    // InternalTrader.g:1358:1: rule__CreateBotStatement__Group__2__Impl : ( 'with' ) ;
    public final void rule__CreateBotStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1362:1: ( ( 'with' ) )
            // InternalTrader.g:1363:1: ( 'with' )
            {
            // InternalTrader.g:1363:1: ( 'with' )
            // InternalTrader.g:1364:2: 'with'
            {
             before(grammarAccess.getCreateBotStatementAccess().getWithKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCreateBotStatementAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__Group__2__Impl"


    // $ANTLR start "rule__CreateBotStatement__Group__3"
    // InternalTrader.g:1373:1: rule__CreateBotStatement__Group__3 : rule__CreateBotStatement__Group__3__Impl rule__CreateBotStatement__Group__4 ;
    public final void rule__CreateBotStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1377:1: ( rule__CreateBotStatement__Group__3__Impl rule__CreateBotStatement__Group__4 )
            // InternalTrader.g:1378:2: rule__CreateBotStatement__Group__3__Impl rule__CreateBotStatement__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__CreateBotStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateBotStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__Group__3"


    // $ANTLR start "rule__CreateBotStatement__Group__3__Impl"
    // InternalTrader.g:1385:1: rule__CreateBotStatement__Group__3__Impl : ( 'strategy' ) ;
    public final void rule__CreateBotStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1389:1: ( ( 'strategy' ) )
            // InternalTrader.g:1390:1: ( 'strategy' )
            {
            // InternalTrader.g:1390:1: ( 'strategy' )
            // InternalTrader.g:1391:2: 'strategy'
            {
             before(grammarAccess.getCreateBotStatementAccess().getStrategyKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getCreateBotStatementAccess().getStrategyKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__Group__3__Impl"


    // $ANTLR start "rule__CreateBotStatement__Group__4"
    // InternalTrader.g:1400:1: rule__CreateBotStatement__Group__4 : rule__CreateBotStatement__Group__4__Impl rule__CreateBotStatement__Group__5 ;
    public final void rule__CreateBotStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1404:1: ( rule__CreateBotStatement__Group__4__Impl rule__CreateBotStatement__Group__5 )
            // InternalTrader.g:1405:2: rule__CreateBotStatement__Group__4__Impl rule__CreateBotStatement__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__CreateBotStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateBotStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__Group__4"


    // $ANTLR start "rule__CreateBotStatement__Group__4__Impl"
    // InternalTrader.g:1412:1: rule__CreateBotStatement__Group__4__Impl : ( ( rule__CreateBotStatement__StrategyAssignment_4 ) ) ;
    public final void rule__CreateBotStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1416:1: ( ( ( rule__CreateBotStatement__StrategyAssignment_4 ) ) )
            // InternalTrader.g:1417:1: ( ( rule__CreateBotStatement__StrategyAssignment_4 ) )
            {
            // InternalTrader.g:1417:1: ( ( rule__CreateBotStatement__StrategyAssignment_4 ) )
            // InternalTrader.g:1418:2: ( rule__CreateBotStatement__StrategyAssignment_4 )
            {
             before(grammarAccess.getCreateBotStatementAccess().getStrategyAssignment_4()); 
            // InternalTrader.g:1419:2: ( rule__CreateBotStatement__StrategyAssignment_4 )
            // InternalTrader.g:1419:3: rule__CreateBotStatement__StrategyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CreateBotStatement__StrategyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCreateBotStatementAccess().getStrategyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__Group__4__Impl"


    // $ANTLR start "rule__CreateBotStatement__Group__5"
    // InternalTrader.g:1427:1: rule__CreateBotStatement__Group__5 : rule__CreateBotStatement__Group__5__Impl rule__CreateBotStatement__Group__6 ;
    public final void rule__CreateBotStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1431:1: ( rule__CreateBotStatement__Group__5__Impl rule__CreateBotStatement__Group__6 )
            // InternalTrader.g:1432:2: rule__CreateBotStatement__Group__5__Impl rule__CreateBotStatement__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__CreateBotStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateBotStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__Group__5"


    // $ANTLR start "rule__CreateBotStatement__Group__5__Impl"
    // InternalTrader.g:1439:1: rule__CreateBotStatement__Group__5__Impl : ( 'using' ) ;
    public final void rule__CreateBotStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1443:1: ( ( 'using' ) )
            // InternalTrader.g:1444:1: ( 'using' )
            {
            // InternalTrader.g:1444:1: ( 'using' )
            // InternalTrader.g:1445:2: 'using'
            {
             before(grammarAccess.getCreateBotStatementAccess().getUsingKeyword_5()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getCreateBotStatementAccess().getUsingKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__Group__5__Impl"


    // $ANTLR start "rule__CreateBotStatement__Group__6"
    // InternalTrader.g:1454:1: rule__CreateBotStatement__Group__6 : rule__CreateBotStatement__Group__6__Impl rule__CreateBotStatement__Group__7 ;
    public final void rule__CreateBotStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1458:1: ( rule__CreateBotStatement__Group__6__Impl rule__CreateBotStatement__Group__7 )
            // InternalTrader.g:1459:2: rule__CreateBotStatement__Group__6__Impl rule__CreateBotStatement__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__CreateBotStatement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateBotStatement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__Group__6"


    // $ANTLR start "rule__CreateBotStatement__Group__6__Impl"
    // InternalTrader.g:1466:1: rule__CreateBotStatement__Group__6__Impl : ( 'lot' ) ;
    public final void rule__CreateBotStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1470:1: ( ( 'lot' ) )
            // InternalTrader.g:1471:1: ( 'lot' )
            {
            // InternalTrader.g:1471:1: ( 'lot' )
            // InternalTrader.g:1472:2: 'lot'
            {
             before(grammarAccess.getCreateBotStatementAccess().getLotKeyword_6()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getCreateBotStatementAccess().getLotKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__Group__6__Impl"


    // $ANTLR start "rule__CreateBotStatement__Group__7"
    // InternalTrader.g:1481:1: rule__CreateBotStatement__Group__7 : rule__CreateBotStatement__Group__7__Impl rule__CreateBotStatement__Group__8 ;
    public final void rule__CreateBotStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1485:1: ( rule__CreateBotStatement__Group__7__Impl rule__CreateBotStatement__Group__8 )
            // InternalTrader.g:1486:2: rule__CreateBotStatement__Group__7__Impl rule__CreateBotStatement__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__CreateBotStatement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateBotStatement__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__Group__7"


    // $ANTLR start "rule__CreateBotStatement__Group__7__Impl"
    // InternalTrader.g:1493:1: rule__CreateBotStatement__Group__7__Impl : ( 'size' ) ;
    public final void rule__CreateBotStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1497:1: ( ( 'size' ) )
            // InternalTrader.g:1498:1: ( 'size' )
            {
            // InternalTrader.g:1498:1: ( 'size' )
            // InternalTrader.g:1499:2: 'size'
            {
             before(grammarAccess.getCreateBotStatementAccess().getSizeKeyword_7()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCreateBotStatementAccess().getSizeKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__Group__7__Impl"


    // $ANTLR start "rule__CreateBotStatement__Group__8"
    // InternalTrader.g:1508:1: rule__CreateBotStatement__Group__8 : rule__CreateBotStatement__Group__8__Impl ;
    public final void rule__CreateBotStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1512:1: ( rule__CreateBotStatement__Group__8__Impl )
            // InternalTrader.g:1513:2: rule__CreateBotStatement__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateBotStatement__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__Group__8"


    // $ANTLR start "rule__CreateBotStatement__Group__8__Impl"
    // InternalTrader.g:1519:1: rule__CreateBotStatement__Group__8__Impl : ( ( rule__CreateBotStatement__LotSizeAssignment_8 ) ) ;
    public final void rule__CreateBotStatement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1523:1: ( ( ( rule__CreateBotStatement__LotSizeAssignment_8 ) ) )
            // InternalTrader.g:1524:1: ( ( rule__CreateBotStatement__LotSizeAssignment_8 ) )
            {
            // InternalTrader.g:1524:1: ( ( rule__CreateBotStatement__LotSizeAssignment_8 ) )
            // InternalTrader.g:1525:2: ( rule__CreateBotStatement__LotSizeAssignment_8 )
            {
             before(grammarAccess.getCreateBotStatementAccess().getLotSizeAssignment_8()); 
            // InternalTrader.g:1526:2: ( rule__CreateBotStatement__LotSizeAssignment_8 )
            // InternalTrader.g:1526:3: rule__CreateBotStatement__LotSizeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__CreateBotStatement__LotSizeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCreateBotStatementAccess().getLotSizeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__Group__8__Impl"


    // $ANTLR start "rule__ListBotsStatement__Group__0"
    // InternalTrader.g:1535:1: rule__ListBotsStatement__Group__0 : rule__ListBotsStatement__Group__0__Impl rule__ListBotsStatement__Group__1 ;
    public final void rule__ListBotsStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1539:1: ( rule__ListBotsStatement__Group__0__Impl rule__ListBotsStatement__Group__1 )
            // InternalTrader.g:1540:2: rule__ListBotsStatement__Group__0__Impl rule__ListBotsStatement__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ListBotsStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListBotsStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListBotsStatement__Group__0"


    // $ANTLR start "rule__ListBotsStatement__Group__0__Impl"
    // InternalTrader.g:1547:1: rule__ListBotsStatement__Group__0__Impl : ( ( rule__ListBotsStatement__ListCommandAssignment_0 ) ) ;
    public final void rule__ListBotsStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1551:1: ( ( ( rule__ListBotsStatement__ListCommandAssignment_0 ) ) )
            // InternalTrader.g:1552:1: ( ( rule__ListBotsStatement__ListCommandAssignment_0 ) )
            {
            // InternalTrader.g:1552:1: ( ( rule__ListBotsStatement__ListCommandAssignment_0 ) )
            // InternalTrader.g:1553:2: ( rule__ListBotsStatement__ListCommandAssignment_0 )
            {
             before(grammarAccess.getListBotsStatementAccess().getListCommandAssignment_0()); 
            // InternalTrader.g:1554:2: ( rule__ListBotsStatement__ListCommandAssignment_0 )
            // InternalTrader.g:1554:3: rule__ListBotsStatement__ListCommandAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListBotsStatement__ListCommandAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListBotsStatementAccess().getListCommandAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListBotsStatement__Group__0__Impl"


    // $ANTLR start "rule__ListBotsStatement__Group__1"
    // InternalTrader.g:1562:1: rule__ListBotsStatement__Group__1 : rule__ListBotsStatement__Group__1__Impl rule__ListBotsStatement__Group__2 ;
    public final void rule__ListBotsStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1566:1: ( rule__ListBotsStatement__Group__1__Impl rule__ListBotsStatement__Group__2 )
            // InternalTrader.g:1567:2: rule__ListBotsStatement__Group__1__Impl rule__ListBotsStatement__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__ListBotsStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListBotsStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListBotsStatement__Group__1"


    // $ANTLR start "rule__ListBotsStatement__Group__1__Impl"
    // InternalTrader.g:1574:1: rule__ListBotsStatement__Group__1__Impl : ( 'registered' ) ;
    public final void rule__ListBotsStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1578:1: ( ( 'registered' ) )
            // InternalTrader.g:1579:1: ( 'registered' )
            {
            // InternalTrader.g:1579:1: ( 'registered' )
            // InternalTrader.g:1580:2: 'registered'
            {
             before(grammarAccess.getListBotsStatementAccess().getRegisteredKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getListBotsStatementAccess().getRegisteredKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListBotsStatement__Group__1__Impl"


    // $ANTLR start "rule__ListBotsStatement__Group__2"
    // InternalTrader.g:1589:1: rule__ListBotsStatement__Group__2 : rule__ListBotsStatement__Group__2__Impl ;
    public final void rule__ListBotsStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1593:1: ( rule__ListBotsStatement__Group__2__Impl )
            // InternalTrader.g:1594:2: rule__ListBotsStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListBotsStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListBotsStatement__Group__2"


    // $ANTLR start "rule__ListBotsStatement__Group__2__Impl"
    // InternalTrader.g:1600:1: rule__ListBotsStatement__Group__2__Impl : ( 'bots' ) ;
    public final void rule__ListBotsStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1604:1: ( ( 'bots' ) )
            // InternalTrader.g:1605:1: ( 'bots' )
            {
            // InternalTrader.g:1605:1: ( 'bots' )
            // InternalTrader.g:1606:2: 'bots'
            {
             before(grammarAccess.getListBotsStatementAccess().getBotsKeyword_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getListBotsStatementAccess().getBotsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListBotsStatement__Group__2__Impl"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__0"
    // InternalTrader.g:1616:1: rule__ExecuteBotsStatement__Group__0 : rule__ExecuteBotsStatement__Group__0__Impl rule__ExecuteBotsStatement__Group__1 ;
    public final void rule__ExecuteBotsStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1620:1: ( rule__ExecuteBotsStatement__Group__0__Impl rule__ExecuteBotsStatement__Group__1 )
            // InternalTrader.g:1621:2: rule__ExecuteBotsStatement__Group__0__Impl rule__ExecuteBotsStatement__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ExecuteBotsStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecuteBotsStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__0"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__0__Impl"
    // InternalTrader.g:1628:1: rule__ExecuteBotsStatement__Group__0__Impl : ( 'execute' ) ;
    public final void rule__ExecuteBotsStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1632:1: ( ( 'execute' ) )
            // InternalTrader.g:1633:1: ( 'execute' )
            {
            // InternalTrader.g:1633:1: ( 'execute' )
            // InternalTrader.g:1634:2: 'execute'
            {
             before(grammarAccess.getExecuteBotsStatementAccess().getExecuteKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getExecuteBotsStatementAccess().getExecuteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__0__Impl"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__1"
    // InternalTrader.g:1643:1: rule__ExecuteBotsStatement__Group__1 : rule__ExecuteBotsStatement__Group__1__Impl rule__ExecuteBotsStatement__Group__2 ;
    public final void rule__ExecuteBotsStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1647:1: ( rule__ExecuteBotsStatement__Group__1__Impl rule__ExecuteBotsStatement__Group__2 )
            // InternalTrader.g:1648:2: rule__ExecuteBotsStatement__Group__1__Impl rule__ExecuteBotsStatement__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ExecuteBotsStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecuteBotsStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__1"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__1__Impl"
    // InternalTrader.g:1655:1: rule__ExecuteBotsStatement__Group__1__Impl : ( 'bots' ) ;
    public final void rule__ExecuteBotsStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1659:1: ( ( 'bots' ) )
            // InternalTrader.g:1660:1: ( 'bots' )
            {
            // InternalTrader.g:1660:1: ( 'bots' )
            // InternalTrader.g:1661:2: 'bots'
            {
             before(grammarAccess.getExecuteBotsStatementAccess().getBotsKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getExecuteBotsStatementAccess().getBotsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__1__Impl"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__2"
    // InternalTrader.g:1670:1: rule__ExecuteBotsStatement__Group__2 : rule__ExecuteBotsStatement__Group__2__Impl rule__ExecuteBotsStatement__Group__3 ;
    public final void rule__ExecuteBotsStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1674:1: ( rule__ExecuteBotsStatement__Group__2__Impl rule__ExecuteBotsStatement__Group__3 )
            // InternalTrader.g:1675:2: rule__ExecuteBotsStatement__Group__2__Impl rule__ExecuteBotsStatement__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ExecuteBotsStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecuteBotsStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__2"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__2__Impl"
    // InternalTrader.g:1682:1: rule__ExecuteBotsStatement__Group__2__Impl : ( 'for' ) ;
    public final void rule__ExecuteBotsStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1686:1: ( ( 'for' ) )
            // InternalTrader.g:1687:1: ( 'for' )
            {
            // InternalTrader.g:1687:1: ( 'for' )
            // InternalTrader.g:1688:2: 'for'
            {
             before(grammarAccess.getExecuteBotsStatementAccess().getForKeyword_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getExecuteBotsStatementAccess().getForKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__2__Impl"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__3"
    // InternalTrader.g:1697:1: rule__ExecuteBotsStatement__Group__3 : rule__ExecuteBotsStatement__Group__3__Impl rule__ExecuteBotsStatement__Group__4 ;
    public final void rule__ExecuteBotsStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1701:1: ( rule__ExecuteBotsStatement__Group__3__Impl rule__ExecuteBotsStatement__Group__4 )
            // InternalTrader.g:1702:2: rule__ExecuteBotsStatement__Group__3__Impl rule__ExecuteBotsStatement__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__ExecuteBotsStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecuteBotsStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__3"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__3__Impl"
    // InternalTrader.g:1709:1: rule__ExecuteBotsStatement__Group__3__Impl : ( ( rule__ExecuteBotsStatement__DaysAssignment_3 ) ) ;
    public final void rule__ExecuteBotsStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1713:1: ( ( ( rule__ExecuteBotsStatement__DaysAssignment_3 ) ) )
            // InternalTrader.g:1714:1: ( ( rule__ExecuteBotsStatement__DaysAssignment_3 ) )
            {
            // InternalTrader.g:1714:1: ( ( rule__ExecuteBotsStatement__DaysAssignment_3 ) )
            // InternalTrader.g:1715:2: ( rule__ExecuteBotsStatement__DaysAssignment_3 )
            {
             before(grammarAccess.getExecuteBotsStatementAccess().getDaysAssignment_3()); 
            // InternalTrader.g:1716:2: ( rule__ExecuteBotsStatement__DaysAssignment_3 )
            // InternalTrader.g:1716:3: rule__ExecuteBotsStatement__DaysAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExecuteBotsStatement__DaysAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExecuteBotsStatementAccess().getDaysAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__3__Impl"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__4"
    // InternalTrader.g:1724:1: rule__ExecuteBotsStatement__Group__4 : rule__ExecuteBotsStatement__Group__4__Impl rule__ExecuteBotsStatement__Group__5 ;
    public final void rule__ExecuteBotsStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1728:1: ( rule__ExecuteBotsStatement__Group__4__Impl rule__ExecuteBotsStatement__Group__5 )
            // InternalTrader.g:1729:2: rule__ExecuteBotsStatement__Group__4__Impl rule__ExecuteBotsStatement__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__ExecuteBotsStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecuteBotsStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__4"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__4__Impl"
    // InternalTrader.g:1736:1: rule__ExecuteBotsStatement__Group__4__Impl : ( 'days' ) ;
    public final void rule__ExecuteBotsStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1740:1: ( ( 'days' ) )
            // InternalTrader.g:1741:1: ( 'days' )
            {
            // InternalTrader.g:1741:1: ( 'days' )
            // InternalTrader.g:1742:2: 'days'
            {
             before(grammarAccess.getExecuteBotsStatementAccess().getDaysKeyword_4()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getExecuteBotsStatementAccess().getDaysKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__4__Impl"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__5"
    // InternalTrader.g:1751:1: rule__ExecuteBotsStatement__Group__5 : rule__ExecuteBotsStatement__Group__5__Impl rule__ExecuteBotsStatement__Group__6 ;
    public final void rule__ExecuteBotsStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1755:1: ( rule__ExecuteBotsStatement__Group__5__Impl rule__ExecuteBotsStatement__Group__6 )
            // InternalTrader.g:1756:2: rule__ExecuteBotsStatement__Group__5__Impl rule__ExecuteBotsStatement__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__ExecuteBotsStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecuteBotsStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__5"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__5__Impl"
    // InternalTrader.g:1763:1: rule__ExecuteBotsStatement__Group__5__Impl : ( ( rule__ExecuteBotsStatement__HoursAssignment_5 ) ) ;
    public final void rule__ExecuteBotsStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1767:1: ( ( ( rule__ExecuteBotsStatement__HoursAssignment_5 ) ) )
            // InternalTrader.g:1768:1: ( ( rule__ExecuteBotsStatement__HoursAssignment_5 ) )
            {
            // InternalTrader.g:1768:1: ( ( rule__ExecuteBotsStatement__HoursAssignment_5 ) )
            // InternalTrader.g:1769:2: ( rule__ExecuteBotsStatement__HoursAssignment_5 )
            {
             before(grammarAccess.getExecuteBotsStatementAccess().getHoursAssignment_5()); 
            // InternalTrader.g:1770:2: ( rule__ExecuteBotsStatement__HoursAssignment_5 )
            // InternalTrader.g:1770:3: rule__ExecuteBotsStatement__HoursAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ExecuteBotsStatement__HoursAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExecuteBotsStatementAccess().getHoursAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__5__Impl"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__6"
    // InternalTrader.g:1778:1: rule__ExecuteBotsStatement__Group__6 : rule__ExecuteBotsStatement__Group__6__Impl rule__ExecuteBotsStatement__Group__7 ;
    public final void rule__ExecuteBotsStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1782:1: ( rule__ExecuteBotsStatement__Group__6__Impl rule__ExecuteBotsStatement__Group__7 )
            // InternalTrader.g:1783:2: rule__ExecuteBotsStatement__Group__6__Impl rule__ExecuteBotsStatement__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__ExecuteBotsStatement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecuteBotsStatement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__6"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__6__Impl"
    // InternalTrader.g:1790:1: rule__ExecuteBotsStatement__Group__6__Impl : ( 'hours' ) ;
    public final void rule__ExecuteBotsStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1794:1: ( ( 'hours' ) )
            // InternalTrader.g:1795:1: ( 'hours' )
            {
            // InternalTrader.g:1795:1: ( 'hours' )
            // InternalTrader.g:1796:2: 'hours'
            {
             before(grammarAccess.getExecuteBotsStatementAccess().getHoursKeyword_6()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getExecuteBotsStatementAccess().getHoursKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__6__Impl"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__7"
    // InternalTrader.g:1805:1: rule__ExecuteBotsStatement__Group__7 : rule__ExecuteBotsStatement__Group__7__Impl rule__ExecuteBotsStatement__Group__8 ;
    public final void rule__ExecuteBotsStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1809:1: ( rule__ExecuteBotsStatement__Group__7__Impl rule__ExecuteBotsStatement__Group__8 )
            // InternalTrader.g:1810:2: rule__ExecuteBotsStatement__Group__7__Impl rule__ExecuteBotsStatement__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__ExecuteBotsStatement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecuteBotsStatement__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__7"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__7__Impl"
    // InternalTrader.g:1817:1: rule__ExecuteBotsStatement__Group__7__Impl : ( ( rule__ExecuteBotsStatement__MinutesAssignment_7 ) ) ;
    public final void rule__ExecuteBotsStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1821:1: ( ( ( rule__ExecuteBotsStatement__MinutesAssignment_7 ) ) )
            // InternalTrader.g:1822:1: ( ( rule__ExecuteBotsStatement__MinutesAssignment_7 ) )
            {
            // InternalTrader.g:1822:1: ( ( rule__ExecuteBotsStatement__MinutesAssignment_7 ) )
            // InternalTrader.g:1823:2: ( rule__ExecuteBotsStatement__MinutesAssignment_7 )
            {
             before(grammarAccess.getExecuteBotsStatementAccess().getMinutesAssignment_7()); 
            // InternalTrader.g:1824:2: ( rule__ExecuteBotsStatement__MinutesAssignment_7 )
            // InternalTrader.g:1824:3: rule__ExecuteBotsStatement__MinutesAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ExecuteBotsStatement__MinutesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getExecuteBotsStatementAccess().getMinutesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__7__Impl"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__8"
    // InternalTrader.g:1832:1: rule__ExecuteBotsStatement__Group__8 : rule__ExecuteBotsStatement__Group__8__Impl rule__ExecuteBotsStatement__Group__9 ;
    public final void rule__ExecuteBotsStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1836:1: ( rule__ExecuteBotsStatement__Group__8__Impl rule__ExecuteBotsStatement__Group__9 )
            // InternalTrader.g:1837:2: rule__ExecuteBotsStatement__Group__8__Impl rule__ExecuteBotsStatement__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__ExecuteBotsStatement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecuteBotsStatement__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__8"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__8__Impl"
    // InternalTrader.g:1844:1: rule__ExecuteBotsStatement__Group__8__Impl : ( 'minutes' ) ;
    public final void rule__ExecuteBotsStatement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1848:1: ( ( 'minutes' ) )
            // InternalTrader.g:1849:1: ( 'minutes' )
            {
            // InternalTrader.g:1849:1: ( 'minutes' )
            // InternalTrader.g:1850:2: 'minutes'
            {
             before(grammarAccess.getExecuteBotsStatementAccess().getMinutesKeyword_8()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getExecuteBotsStatementAccess().getMinutesKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__8__Impl"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__9"
    // InternalTrader.g:1859:1: rule__ExecuteBotsStatement__Group__9 : rule__ExecuteBotsStatement__Group__9__Impl rule__ExecuteBotsStatement__Group__10 ;
    public final void rule__ExecuteBotsStatement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1863:1: ( rule__ExecuteBotsStatement__Group__9__Impl rule__ExecuteBotsStatement__Group__10 )
            // InternalTrader.g:1864:2: rule__ExecuteBotsStatement__Group__9__Impl rule__ExecuteBotsStatement__Group__10
            {
            pushFollow(FOLLOW_28);
            rule__ExecuteBotsStatement__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecuteBotsStatement__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__9"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__9__Impl"
    // InternalTrader.g:1871:1: rule__ExecuteBotsStatement__Group__9__Impl : ( ( rule__ExecuteBotsStatement__SecondsAssignment_9 ) ) ;
    public final void rule__ExecuteBotsStatement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1875:1: ( ( ( rule__ExecuteBotsStatement__SecondsAssignment_9 ) ) )
            // InternalTrader.g:1876:1: ( ( rule__ExecuteBotsStatement__SecondsAssignment_9 ) )
            {
            // InternalTrader.g:1876:1: ( ( rule__ExecuteBotsStatement__SecondsAssignment_9 ) )
            // InternalTrader.g:1877:2: ( rule__ExecuteBotsStatement__SecondsAssignment_9 )
            {
             before(grammarAccess.getExecuteBotsStatementAccess().getSecondsAssignment_9()); 
            // InternalTrader.g:1878:2: ( rule__ExecuteBotsStatement__SecondsAssignment_9 )
            // InternalTrader.g:1878:3: rule__ExecuteBotsStatement__SecondsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ExecuteBotsStatement__SecondsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getExecuteBotsStatementAccess().getSecondsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__9__Impl"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__10"
    // InternalTrader.g:1886:1: rule__ExecuteBotsStatement__Group__10 : rule__ExecuteBotsStatement__Group__10__Impl ;
    public final void rule__ExecuteBotsStatement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1890:1: ( rule__ExecuteBotsStatement__Group__10__Impl )
            // InternalTrader.g:1891:2: rule__ExecuteBotsStatement__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExecuteBotsStatement__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__10"


    // $ANTLR start "rule__ExecuteBotsStatement__Group__10__Impl"
    // InternalTrader.g:1897:1: rule__ExecuteBotsStatement__Group__10__Impl : ( 'seconds' ) ;
    public final void rule__ExecuteBotsStatement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1901:1: ( ( 'seconds' ) )
            // InternalTrader.g:1902:1: ( 'seconds' )
            {
            // InternalTrader.g:1902:1: ( 'seconds' )
            // InternalTrader.g:1903:2: 'seconds'
            {
             before(grammarAccess.getExecuteBotsStatementAccess().getSecondsKeyword_10()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getExecuteBotsStatementAccess().getSecondsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__Group__10__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalTrader.g:1913:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1917:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalTrader.g:1918:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalTrader.g:1925:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1929:1: ( ( 'var' ) )
            // InternalTrader.g:1930:1: ( 'var' )
            {
            // InternalTrader.g:1930:1: ( 'var' )
            // InternalTrader.g:1931:2: 'var'
            {
             before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalTrader.g:1940:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1944:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalTrader.g:1945:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalTrader.g:1952:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1956:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalTrader.g:1957:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalTrader.g:1957:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalTrader.g:1958:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalTrader.g:1959:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalTrader.g:1959:3: rule__VariableDeclaration__NameAssignment_1
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
    // InternalTrader.g:1967:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1971:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalTrader.g:1972:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalTrader.g:1979:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1983:1: ( ( '=' ) )
            // InternalTrader.g:1984:1: ( '=' )
            {
            // InternalTrader.g:1984:1: ( '=' )
            // InternalTrader.g:1985:2: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,62,FOLLOW_2); 
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
    // InternalTrader.g:1994:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:1998:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalTrader.g:1999:2: rule__VariableDeclaration__Group__3__Impl
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
    // InternalTrader.g:2005:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__Alternatives_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2009:1: ( ( ( rule__VariableDeclaration__Alternatives_3 ) ) )
            // InternalTrader.g:2010:1: ( ( rule__VariableDeclaration__Alternatives_3 ) )
            {
            // InternalTrader.g:2010:1: ( ( rule__VariableDeclaration__Alternatives_3 ) )
            // InternalTrader.g:2011:2: ( rule__VariableDeclaration__Alternatives_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getAlternatives_3()); 
            // InternalTrader.g:2012:2: ( rule__VariableDeclaration__Alternatives_3 )
            // InternalTrader.g:2012:3: rule__VariableDeclaration__Alternatives_3
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
    // InternalTrader.g:2021:1: rule__LoopStatement__Group__0 : rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 ;
    public final void rule__LoopStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2025:1: ( rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 )
            // InternalTrader.g:2026:2: rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1
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
    // InternalTrader.g:2033:1: rule__LoopStatement__Group__0__Impl : ( 'loop' ) ;
    public final void rule__LoopStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2037:1: ( ( 'loop' ) )
            // InternalTrader.g:2038:1: ( 'loop' )
            {
            // InternalTrader.g:2038:1: ( 'loop' )
            // InternalTrader.g:2039:2: 'loop'
            {
             before(grammarAccess.getLoopStatementAccess().getLoopKeyword_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalTrader.g:2048:1: rule__LoopStatement__Group__1 : rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2 ;
    public final void rule__LoopStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2052:1: ( rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2 )
            // InternalTrader.g:2053:2: rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalTrader.g:2060:1: rule__LoopStatement__Group__1__Impl : ( ( rule__LoopStatement__CountAssignment_1 ) ) ;
    public final void rule__LoopStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2064:1: ( ( ( rule__LoopStatement__CountAssignment_1 ) ) )
            // InternalTrader.g:2065:1: ( ( rule__LoopStatement__CountAssignment_1 ) )
            {
            // InternalTrader.g:2065:1: ( ( rule__LoopStatement__CountAssignment_1 ) )
            // InternalTrader.g:2066:2: ( rule__LoopStatement__CountAssignment_1 )
            {
             before(grammarAccess.getLoopStatementAccess().getCountAssignment_1()); 
            // InternalTrader.g:2067:2: ( rule__LoopStatement__CountAssignment_1 )
            // InternalTrader.g:2067:3: rule__LoopStatement__CountAssignment_1
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
    // InternalTrader.g:2075:1: rule__LoopStatement__Group__2 : rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3 ;
    public final void rule__LoopStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2079:1: ( rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3 )
            // InternalTrader.g:2080:2: rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalTrader.g:2087:1: rule__LoopStatement__Group__2__Impl : ( 'times' ) ;
    public final void rule__LoopStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2091:1: ( ( 'times' ) )
            // InternalTrader.g:2092:1: ( 'times' )
            {
            // InternalTrader.g:2092:1: ( 'times' )
            // InternalTrader.g:2093:2: 'times'
            {
             before(grammarAccess.getLoopStatementAccess().getTimesKeyword_2()); 
            match(input,64,FOLLOW_2); 
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
    // InternalTrader.g:2102:1: rule__LoopStatement__Group__3 : rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4 ;
    public final void rule__LoopStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2106:1: ( rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4 )
            // InternalTrader.g:2107:2: rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalTrader.g:2114:1: rule__LoopStatement__Group__3__Impl : ( 'do' ) ;
    public final void rule__LoopStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2118:1: ( ( 'do' ) )
            // InternalTrader.g:2119:1: ( 'do' )
            {
            // InternalTrader.g:2119:1: ( 'do' )
            // InternalTrader.g:2120:2: 'do'
            {
             before(grammarAccess.getLoopStatementAccess().getDoKeyword_3()); 
            match(input,65,FOLLOW_2); 
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
    // InternalTrader.g:2129:1: rule__LoopStatement__Group__4 : rule__LoopStatement__Group__4__Impl rule__LoopStatement__Group__5 ;
    public final void rule__LoopStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2133:1: ( rule__LoopStatement__Group__4__Impl rule__LoopStatement__Group__5 )
            // InternalTrader.g:2134:2: rule__LoopStatement__Group__4__Impl rule__LoopStatement__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalTrader.g:2141:1: rule__LoopStatement__Group__4__Impl : ( ( ( rule__LoopStatement__StatementsAssignment_4 ) ) ( ( rule__LoopStatement__StatementsAssignment_4 )* ) ) ;
    public final void rule__LoopStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2145:1: ( ( ( ( rule__LoopStatement__StatementsAssignment_4 ) ) ( ( rule__LoopStatement__StatementsAssignment_4 )* ) ) )
            // InternalTrader.g:2146:1: ( ( ( rule__LoopStatement__StatementsAssignment_4 ) ) ( ( rule__LoopStatement__StatementsAssignment_4 )* ) )
            {
            // InternalTrader.g:2146:1: ( ( ( rule__LoopStatement__StatementsAssignment_4 ) ) ( ( rule__LoopStatement__StatementsAssignment_4 )* ) )
            // InternalTrader.g:2147:2: ( ( rule__LoopStatement__StatementsAssignment_4 ) ) ( ( rule__LoopStatement__StatementsAssignment_4 )* )
            {
            // InternalTrader.g:2147:2: ( ( rule__LoopStatement__StatementsAssignment_4 ) )
            // InternalTrader.g:2148:3: ( rule__LoopStatement__StatementsAssignment_4 )
            {
             before(grammarAccess.getLoopStatementAccess().getStatementsAssignment_4()); 
            // InternalTrader.g:2149:3: ( rule__LoopStatement__StatementsAssignment_4 )
            // InternalTrader.g:2149:4: rule__LoopStatement__StatementsAssignment_4
            {
            pushFollow(FOLLOW_3);
            rule__LoopStatement__StatementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLoopStatementAccess().getStatementsAssignment_4()); 

            }

            // InternalTrader.g:2152:2: ( ( rule__LoopStatement__StatementsAssignment_4 )* )
            // InternalTrader.g:2153:3: ( rule__LoopStatement__StatementsAssignment_4 )*
            {
             before(grammarAccess.getLoopStatementAccess().getStatementsAssignment_4()); 
            // InternalTrader.g:2154:3: ( rule__LoopStatement__StatementsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==37||LA10_0==47||LA10_0==55||LA10_0==61||LA10_0==63||LA10_0==70) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTrader.g:2154:4: rule__LoopStatement__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__LoopStatement__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalTrader.g:2163:1: rule__LoopStatement__Group__5 : rule__LoopStatement__Group__5__Impl ;
    public final void rule__LoopStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2167:1: ( rule__LoopStatement__Group__5__Impl )
            // InternalTrader.g:2168:2: rule__LoopStatement__Group__5__Impl
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
    // InternalTrader.g:2174:1: rule__LoopStatement__Group__5__Impl : ( 'end' ) ;
    public final void rule__LoopStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2178:1: ( ( 'end' ) )
            // InternalTrader.g:2179:1: ( 'end' )
            {
            // InternalTrader.g:2179:1: ( 'end' )
            // InternalTrader.g:2180:2: 'end'
            {
             before(grammarAccess.getLoopStatementAccess().getEndKeyword_5()); 
            match(input,66,FOLLOW_2); 
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


    // $ANTLR start "rule__Addition__Group__0"
    // InternalTrader.g:2190:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2194:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalTrader.g:2195:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalTrader.g:2202:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2206:1: ( ( ruleMultiplication ) )
            // InternalTrader.g:2207:1: ( ruleMultiplication )
            {
            // InternalTrader.g:2207:1: ( ruleMultiplication )
            // InternalTrader.g:2208:2: ruleMultiplication
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
    // InternalTrader.g:2217:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2221:1: ( rule__Addition__Group__1__Impl )
            // InternalTrader.g:2222:2: rule__Addition__Group__1__Impl
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
    // InternalTrader.g:2228:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2232:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalTrader.g:2233:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalTrader.g:2233:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalTrader.g:2234:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalTrader.g:2235:2: ( rule__Addition__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=11 && LA11_0<=12)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTrader.g:2235:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
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
    // InternalTrader.g:2244:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2248:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalTrader.g:2249:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalTrader.g:2256:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2260:1: ( ( () ) )
            // InternalTrader.g:2261:1: ( () )
            {
            // InternalTrader.g:2261:1: ( () )
            // InternalTrader.g:2262:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalTrader.g:2263:2: ()
            // InternalTrader.g:2263:3: 
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
    // InternalTrader.g:2271:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2275:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalTrader.g:2276:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalTrader.g:2283:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2287:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalTrader.g:2288:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalTrader.g:2288:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalTrader.g:2289:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalTrader.g:2290:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalTrader.g:2290:3: rule__Addition__OperatorAssignment_1_1
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
    // InternalTrader.g:2298:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2302:1: ( rule__Addition__Group_1__2__Impl )
            // InternalTrader.g:2303:2: rule__Addition__Group_1__2__Impl
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
    // InternalTrader.g:2309:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2313:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalTrader.g:2314:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalTrader.g:2314:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalTrader.g:2315:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalTrader.g:2316:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalTrader.g:2316:3: rule__Addition__RightAssignment_1_2
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
    // InternalTrader.g:2325:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2329:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalTrader.g:2330:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalTrader.g:2337:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2341:1: ( ( rulePrimary ) )
            // InternalTrader.g:2342:1: ( rulePrimary )
            {
            // InternalTrader.g:2342:1: ( rulePrimary )
            // InternalTrader.g:2343:2: rulePrimary
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
    // InternalTrader.g:2352:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2356:1: ( rule__Multiplication__Group__1__Impl )
            // InternalTrader.g:2357:2: rule__Multiplication__Group__1__Impl
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
    // InternalTrader.g:2363:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2367:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalTrader.g:2368:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalTrader.g:2368:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalTrader.g:2369:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalTrader.g:2370:2: ( rule__Multiplication__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=13 && LA12_0<=14)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTrader.g:2370:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
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
    // InternalTrader.g:2379:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2383:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalTrader.g:2384:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalTrader.g:2391:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2395:1: ( ( () ) )
            // InternalTrader.g:2396:1: ( () )
            {
            // InternalTrader.g:2396:1: ( () )
            // InternalTrader.g:2397:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalTrader.g:2398:2: ()
            // InternalTrader.g:2398:3: 
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
    // InternalTrader.g:2406:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2410:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalTrader.g:2411:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalTrader.g:2418:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2422:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalTrader.g:2423:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalTrader.g:2423:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalTrader.g:2424:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalTrader.g:2425:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalTrader.g:2425:3: rule__Multiplication__OperatorAssignment_1_1
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
    // InternalTrader.g:2433:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2437:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalTrader.g:2438:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalTrader.g:2444:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2448:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalTrader.g:2449:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalTrader.g:2449:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalTrader.g:2450:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalTrader.g:2451:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalTrader.g:2451:3: rule__Multiplication__RightAssignment_1_2
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
    // InternalTrader.g:2460:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2464:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // InternalTrader.g:2465:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalTrader.g:2472:1: rule__Primary__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2476:1: ( ( '(' ) )
            // InternalTrader.g:2477:1: ( '(' )
            {
            // InternalTrader.g:2477:1: ( '(' )
            // InternalTrader.g:2478:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalTrader.g:2487:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2491:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // InternalTrader.g:2492:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalTrader.g:2499:1: rule__Primary__Group_3__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2503:1: ( ( ruleAddition ) )
            // InternalTrader.g:2504:1: ( ruleAddition )
            {
            // InternalTrader.g:2504:1: ( ruleAddition )
            // InternalTrader.g:2505:2: ruleAddition
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
    // InternalTrader.g:2514:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2518:1: ( rule__Primary__Group_3__2__Impl )
            // InternalTrader.g:2519:2: rule__Primary__Group_3__2__Impl
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
    // InternalTrader.g:2525:1: rule__Primary__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2529:1: ( ( ')' ) )
            // InternalTrader.g:2530:1: ( ')' )
            {
            // InternalTrader.g:2530:1: ( ')' )
            // InternalTrader.g:2531:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 
            match(input,68,FOLLOW_2); 
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


    // $ANTLR start "rule__REAL__Group__0"
    // InternalTrader.g:2541:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2545:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalTrader.g:2546:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalTrader.g:2553:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2557:1: ( ( ( RULE_INT )? ) )
            // InternalTrader.g:2558:1: ( ( RULE_INT )? )
            {
            // InternalTrader.g:2558:1: ( ( RULE_INT )? )
            // InternalTrader.g:2559:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalTrader.g:2560:2: ( RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTrader.g:2560:3: RULE_INT
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
    // InternalTrader.g:2568:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2572:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalTrader.g:2573:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalTrader.g:2580:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2584:1: ( ( '.' ) )
            // InternalTrader.g:2585:1: ( '.' )
            {
            // InternalTrader.g:2585:1: ( '.' )
            // InternalTrader.g:2586:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,69,FOLLOW_2); 
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
    // InternalTrader.g:2595:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2599:1: ( rule__REAL__Group__2__Impl )
            // InternalTrader.g:2600:2: rule__REAL__Group__2__Impl
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
    // InternalTrader.g:2606:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2610:1: ( ( RULE_INT ) )
            // InternalTrader.g:2611:1: ( RULE_INT )
            {
            // InternalTrader.g:2611:1: ( RULE_INT )
            // InternalTrader.g:2612:2: RULE_INT
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


    // $ANTLR start "rule__TraderProgram__StatementsAssignment"
    // InternalTrader.g:2622:1: rule__TraderProgram__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__TraderProgram__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2626:1: ( ( ruleStatement ) )
            // InternalTrader.g:2627:2: ( ruleStatement )
            {
            // InternalTrader.g:2627:2: ( ruleStatement )
            // InternalTrader.g:2628:3: ruleStatement
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


    // $ANTLR start "rule__ConnectStatement__TickerNameAssignment_3"
    // InternalTrader.g:2637:1: rule__ConnectStatement__TickerNameAssignment_3 : ( ruleStringPrimary ) ;
    public final void rule__ConnectStatement__TickerNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2641:1: ( ( ruleStringPrimary ) )
            // InternalTrader.g:2642:2: ( ruleStringPrimary )
            {
            // InternalTrader.g:2642:2: ( ruleStringPrimary )
            // InternalTrader.g:2643:3: ruleStringPrimary
            {
             before(grammarAccess.getConnectStatementAccess().getTickerNameStringPrimaryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStringPrimary();

            state._fsp--;

             after(grammarAccess.getConnectStatementAccess().getTickerNameStringPrimaryParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__TickerNameAssignment_3"


    // $ANTLR start "rule__ConnectStatement__BrokerNameAssignment_6"
    // InternalTrader.g:2652:1: rule__ConnectStatement__BrokerNameAssignment_6 : ( ruleStringPrimary ) ;
    public final void rule__ConnectStatement__BrokerNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2656:1: ( ( ruleStringPrimary ) )
            // InternalTrader.g:2657:2: ( ruleStringPrimary )
            {
            // InternalTrader.g:2657:2: ( ruleStringPrimary )
            // InternalTrader.g:2658:3: ruleStringPrimary
            {
             before(grammarAccess.getConnectStatementAccess().getBrokerNameStringPrimaryParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStringPrimary();

            state._fsp--;

             after(grammarAccess.getConnectStatementAccess().getBrokerNameStringPrimaryParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__BrokerNameAssignment_6"


    // $ANTLR start "rule__ConnectStatement__UsernameAssignment_9"
    // InternalTrader.g:2667:1: rule__ConnectStatement__UsernameAssignment_9 : ( ruleStringPrimary ) ;
    public final void rule__ConnectStatement__UsernameAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2671:1: ( ( ruleStringPrimary ) )
            // InternalTrader.g:2672:2: ( ruleStringPrimary )
            {
            // InternalTrader.g:2672:2: ( ruleStringPrimary )
            // InternalTrader.g:2673:3: ruleStringPrimary
            {
             before(grammarAccess.getConnectStatementAccess().getUsernameStringPrimaryParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleStringPrimary();

            state._fsp--;

             after(grammarAccess.getConnectStatementAccess().getUsernameStringPrimaryParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__UsernameAssignment_9"


    // $ANTLR start "rule__ConnectStatement__PasswordAssignment_12"
    // InternalTrader.g:2682:1: rule__ConnectStatement__PasswordAssignment_12 : ( ruleStringPrimary ) ;
    public final void rule__ConnectStatement__PasswordAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2686:1: ( ( ruleStringPrimary ) )
            // InternalTrader.g:2687:2: ( ruleStringPrimary )
            {
            // InternalTrader.g:2687:2: ( ruleStringPrimary )
            // InternalTrader.g:2688:3: ruleStringPrimary
            {
             before(grammarAccess.getConnectStatementAccess().getPasswordStringPrimaryParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleStringPrimary();

            state._fsp--;

             after(grammarAccess.getConnectStatementAccess().getPasswordStringPrimaryParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__PasswordAssignment_12"


    // $ANTLR start "rule__ConnectStatement__TimeframeAssignment_15"
    // InternalTrader.g:2697:1: rule__ConnectStatement__TimeframeAssignment_15 : ( ruleTimeFrameDef ) ;
    public final void rule__ConnectStatement__TimeframeAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2701:1: ( ( ruleTimeFrameDef ) )
            // InternalTrader.g:2702:2: ( ruleTimeFrameDef )
            {
            // InternalTrader.g:2702:2: ( ruleTimeFrameDef )
            // InternalTrader.g:2703:3: ruleTimeFrameDef
            {
             before(grammarAccess.getConnectStatementAccess().getTimeframeTimeFrameDefEnumRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeFrameDef();

            state._fsp--;

             after(grammarAccess.getConnectStatementAccess().getTimeframeTimeFrameDefEnumRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectStatement__TimeframeAssignment_15"


    // $ANTLR start "rule__CreateBotStatement__StrategyAssignment_4"
    // InternalTrader.g:2712:1: rule__CreateBotStatement__StrategyAssignment_4 : ( ruleStrategyDef ) ;
    public final void rule__CreateBotStatement__StrategyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2716:1: ( ( ruleStrategyDef ) )
            // InternalTrader.g:2717:2: ( ruleStrategyDef )
            {
            // InternalTrader.g:2717:2: ( ruleStrategyDef )
            // InternalTrader.g:2718:3: ruleStrategyDef
            {
             before(grammarAccess.getCreateBotStatementAccess().getStrategyStrategyDefEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStrategyDef();

            state._fsp--;

             after(grammarAccess.getCreateBotStatementAccess().getStrategyStrategyDefEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__StrategyAssignment_4"


    // $ANTLR start "rule__CreateBotStatement__LotSizeAssignment_8"
    // InternalTrader.g:2727:1: rule__CreateBotStatement__LotSizeAssignment_8 : ( ruleAddition ) ;
    public final void rule__CreateBotStatement__LotSizeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2731:1: ( ( ruleAddition ) )
            // InternalTrader.g:2732:2: ( ruleAddition )
            {
            // InternalTrader.g:2732:2: ( ruleAddition )
            // InternalTrader.g:2733:3: ruleAddition
            {
             before(grammarAccess.getCreateBotStatementAccess().getLotSizeAdditionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getCreateBotStatementAccess().getLotSizeAdditionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateBotStatement__LotSizeAssignment_8"


    // $ANTLR start "rule__ListBotsStatement__ListCommandAssignment_0"
    // InternalTrader.g:2742:1: rule__ListBotsStatement__ListCommandAssignment_0 : ( ( 'see' ) ) ;
    public final void rule__ListBotsStatement__ListCommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2746:1: ( ( ( 'see' ) ) )
            // InternalTrader.g:2747:2: ( ( 'see' ) )
            {
            // InternalTrader.g:2747:2: ( ( 'see' ) )
            // InternalTrader.g:2748:3: ( 'see' )
            {
             before(grammarAccess.getListBotsStatementAccess().getListCommandSeeKeyword_0_0()); 
            // InternalTrader.g:2749:3: ( 'see' )
            // InternalTrader.g:2750:4: 'see'
            {
             before(grammarAccess.getListBotsStatementAccess().getListCommandSeeKeyword_0_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getListBotsStatementAccess().getListCommandSeeKeyword_0_0()); 

            }

             after(grammarAccess.getListBotsStatementAccess().getListCommandSeeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListBotsStatement__ListCommandAssignment_0"


    // $ANTLR start "rule__ExecuteBotsStatement__DaysAssignment_3"
    // InternalTrader.g:2761:1: rule__ExecuteBotsStatement__DaysAssignment_3 : ( ruleAddition ) ;
    public final void rule__ExecuteBotsStatement__DaysAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2765:1: ( ( ruleAddition ) )
            // InternalTrader.g:2766:2: ( ruleAddition )
            {
            // InternalTrader.g:2766:2: ( ruleAddition )
            // InternalTrader.g:2767:3: ruleAddition
            {
             before(grammarAccess.getExecuteBotsStatementAccess().getDaysAdditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getExecuteBotsStatementAccess().getDaysAdditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__DaysAssignment_3"


    // $ANTLR start "rule__ExecuteBotsStatement__HoursAssignment_5"
    // InternalTrader.g:2776:1: rule__ExecuteBotsStatement__HoursAssignment_5 : ( ruleAddition ) ;
    public final void rule__ExecuteBotsStatement__HoursAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2780:1: ( ( ruleAddition ) )
            // InternalTrader.g:2781:2: ( ruleAddition )
            {
            // InternalTrader.g:2781:2: ( ruleAddition )
            // InternalTrader.g:2782:3: ruleAddition
            {
             before(grammarAccess.getExecuteBotsStatementAccess().getHoursAdditionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getExecuteBotsStatementAccess().getHoursAdditionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__HoursAssignment_5"


    // $ANTLR start "rule__ExecuteBotsStatement__MinutesAssignment_7"
    // InternalTrader.g:2791:1: rule__ExecuteBotsStatement__MinutesAssignment_7 : ( ruleAddition ) ;
    public final void rule__ExecuteBotsStatement__MinutesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2795:1: ( ( ruleAddition ) )
            // InternalTrader.g:2796:2: ( ruleAddition )
            {
            // InternalTrader.g:2796:2: ( ruleAddition )
            // InternalTrader.g:2797:3: ruleAddition
            {
             before(grammarAccess.getExecuteBotsStatementAccess().getMinutesAdditionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getExecuteBotsStatementAccess().getMinutesAdditionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__MinutesAssignment_7"


    // $ANTLR start "rule__ExecuteBotsStatement__SecondsAssignment_9"
    // InternalTrader.g:2806:1: rule__ExecuteBotsStatement__SecondsAssignment_9 : ( ruleAddition ) ;
    public final void rule__ExecuteBotsStatement__SecondsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2810:1: ( ( ruleAddition ) )
            // InternalTrader.g:2811:2: ( ruleAddition )
            {
            // InternalTrader.g:2811:2: ( ruleAddition )
            // InternalTrader.g:2812:3: ruleAddition
            {
             before(grammarAccess.getExecuteBotsStatementAccess().getSecondsAdditionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getExecuteBotsStatementAccess().getSecondsAdditionParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecuteBotsStatement__SecondsAssignment_9"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalTrader.g:2821:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2825:1: ( ( RULE_ID ) )
            // InternalTrader.g:2826:2: ( RULE_ID )
            {
            // InternalTrader.g:2826:2: ( RULE_ID )
            // InternalTrader.g:2827:3: RULE_ID
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
    // InternalTrader.g:2836:1: rule__VariableDeclaration__ValueAssignment_3_0 : ( ruleStringValue ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2840:1: ( ( ruleStringValue ) )
            // InternalTrader.g:2841:2: ( ruleStringValue )
            {
            // InternalTrader.g:2841:2: ( ruleStringValue )
            // InternalTrader.g:2842:3: ruleStringValue
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
    // InternalTrader.g:2851:1: rule__VariableDeclaration__ValueAssignment_3_1 : ( ruleRealValue ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2855:1: ( ( ruleRealValue ) )
            // InternalTrader.g:2856:2: ( ruleRealValue )
            {
            // InternalTrader.g:2856:2: ( ruleRealValue )
            // InternalTrader.g:2857:3: ruleRealValue
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
    // InternalTrader.g:2866:1: rule__VariableDeclaration__ValueAssignment_3_2 : ( ruleIntValue ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2870:1: ( ( ruleIntValue ) )
            // InternalTrader.g:2871:2: ( ruleIntValue )
            {
            // InternalTrader.g:2871:2: ( ruleIntValue )
            // InternalTrader.g:2872:3: ruleIntValue
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
    // InternalTrader.g:2881:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2885:1: ( ( RULE_STRING ) )
            // InternalTrader.g:2886:2: ( RULE_STRING )
            {
            // InternalTrader.g:2886:2: ( RULE_STRING )
            // InternalTrader.g:2887:3: RULE_STRING
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
    // InternalTrader.g:2896:1: rule__RealValue__ValueAssignment : ( ruleREAL ) ;
    public final void rule__RealValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2900:1: ( ( ruleREAL ) )
            // InternalTrader.g:2901:2: ( ruleREAL )
            {
            // InternalTrader.g:2901:2: ( ruleREAL )
            // InternalTrader.g:2902:3: ruleREAL
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
    // InternalTrader.g:2911:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2915:1: ( ( RULE_INT ) )
            // InternalTrader.g:2916:2: ( RULE_INT )
            {
            // InternalTrader.g:2916:2: ( RULE_INT )
            // InternalTrader.g:2917:3: RULE_INT
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
    // InternalTrader.g:2926:1: rule__LoopStatement__CountAssignment_1 : ( ruleAddition ) ;
    public final void rule__LoopStatement__CountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2930:1: ( ( ruleAddition ) )
            // InternalTrader.g:2931:2: ( ruleAddition )
            {
            // InternalTrader.g:2931:2: ( ruleAddition )
            // InternalTrader.g:2932:3: ruleAddition
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
    // InternalTrader.g:2941:1: rule__LoopStatement__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__LoopStatement__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2945:1: ( ( ruleStatement ) )
            // InternalTrader.g:2946:2: ( ruleStatement )
            {
            // InternalTrader.g:2946:2: ( ruleStatement )
            // InternalTrader.g:2947:3: ruleStatement
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
    // InternalTrader.g:2956:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2960:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalTrader.g:2961:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalTrader.g:2961:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalTrader.g:2962:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalTrader.g:2963:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalTrader.g:2963:4: rule__Addition__OperatorAlternatives_1_1_0
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
    // InternalTrader.g:2971:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2975:1: ( ( ruleMultiplication ) )
            // InternalTrader.g:2976:2: ( ruleMultiplication )
            {
            // InternalTrader.g:2976:2: ( ruleMultiplication )
            // InternalTrader.g:2977:3: ruleMultiplication
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
    // InternalTrader.g:2986:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:2990:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalTrader.g:2991:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalTrader.g:2991:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalTrader.g:2992:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalTrader.g:2993:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalTrader.g:2993:4: rule__Multiplication__OperatorAlternatives_1_1_0
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
    // InternalTrader.g:3001:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3005:1: ( ( rulePrimary ) )
            // InternalTrader.g:3006:2: ( rulePrimary )
            {
            // InternalTrader.g:3006:2: ( rulePrimary )
            // InternalTrader.g:3007:3: rulePrimary
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
    // InternalTrader.g:3016:1: rule__NumVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NumVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3020:1: ( ( ( RULE_ID ) ) )
            // InternalTrader.g:3021:2: ( ( RULE_ID ) )
            {
            // InternalTrader.g:3021:2: ( ( RULE_ID ) )
            // InternalTrader.g:3022:3: ( RULE_ID )
            {
             before(grammarAccess.getNumVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalTrader.g:3023:3: ( RULE_ID )
            // InternalTrader.g:3024:4: RULE_ID
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
    // InternalTrader.g:3035:1: rule__StringVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__StringVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrader.g:3039:1: ( ( ( RULE_ID ) ) )
            // InternalTrader.g:3040:2: ( ( RULE_ID ) )
            {
            // InternalTrader.g:3040:2: ( ( RULE_ID ) )
            // InternalTrader.g:3041:3: ( RULE_ID )
            {
             before(grammarAccess.getStringVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalTrader.g:3042:3: ( RULE_ID )
            // InternalTrader.g:3043:4: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xA080802000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001FFFFE0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000028L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000070L,0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xA080802000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000010L});

}