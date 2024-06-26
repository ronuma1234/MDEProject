/*
 * generated by Xtext 2.34.0
 */
grammar InternalTrader;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package uk.ac.kcl.inf.trader.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTraderProgram
entryRuleTraderProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTraderProgramRule()); }
	iv_ruleTraderProgram=ruleTraderProgram
	{ $current=$iv_ruleTraderProgram.current; }
	EOF;

// Rule TraderProgram
ruleTraderProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getTraderProgramAccess().getStatementsStatementParserRuleCall_0());
			}
			lv_statements_0_0=ruleStatement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getTraderProgramRule());
				}
				add(
					$current,
					"statements",
					lv_statements_0_0,
					"uk.ac.kcl.inf.trader.Trader.Statement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getConnectStatementParserRuleCall_0());
		}
		this_ConnectStatement_0=ruleConnectStatement
		{
			$current = $this_ConnectStatement_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getCreateBotStatementParserRuleCall_1());
		}
		this_CreateBotStatement_1=ruleCreateBotStatement
		{
			$current = $this_CreateBotStatement_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getListBotsStatementParserRuleCall_2());
		}
		this_ListBotsStatement_2=ruleListBotsStatement
		{
			$current = $this_ListBotsStatement_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getExecuteBotsStatementParserRuleCall_3());
		}
		this_ExecuteBotsStatement_3=ruleExecuteBotsStatement
		{
			$current = $this_ExecuteBotsStatement_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_4());
		}
		this_VariableDeclaration_4=ruleVariableDeclaration
		{
			$current = $this_VariableDeclaration_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_5());
		}
		this_LoopStatement_5=ruleLoopStatement
		{
			$current = $this_LoopStatement_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleConnectStatement
entryRuleConnectStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConnectStatementRule()); }
	iv_ruleConnectStatement=ruleConnectStatement
	{ $current=$iv_ruleConnectStatement.current; }
	EOF;

// Rule ConnectStatement
ruleConnectStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='connect'
		{
			newLeafNode(otherlv_0, grammarAccess.getConnectStatementAccess().getConnectKeyword_0());
		}
		otherlv_1='to'
		{
			newLeafNode(otherlv_1, grammarAccess.getConnectStatementAccess().getToKeyword_1());
		}
		otherlv_2='trade'
		{
			newLeafNode(otherlv_2, grammarAccess.getConnectStatementAccess().getTradeKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectStatementAccess().getTickerNameStringPrimaryParserRuleCall_3_0());
				}
				lv_tickerName_3_0=ruleStringPrimary
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectStatementRule());
					}
					set(
						$current,
						"tickerName",
						lv_tickerName_3_0,
						"uk.ac.kcl.inf.trader.Trader.StringPrimary");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='on'
		{
			newLeafNode(otherlv_4, grammarAccess.getConnectStatementAccess().getOnKeyword_4());
		}
		otherlv_5='server'
		{
			newLeafNode(otherlv_5, grammarAccess.getConnectStatementAccess().getServerKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectStatementAccess().getBrokerNameStringPrimaryParserRuleCall_6_0());
				}
				lv_brokerName_6_0=ruleStringPrimary
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectStatementRule());
					}
					set(
						$current,
						"brokerName",
						lv_brokerName_6_0,
						"uk.ac.kcl.inf.trader.Trader.StringPrimary");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='with'
		{
			newLeafNode(otherlv_7, grammarAccess.getConnectStatementAccess().getWithKeyword_7());
		}
		otherlv_8='login'
		{
			newLeafNode(otherlv_8, grammarAccess.getConnectStatementAccess().getLoginKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectStatementAccess().getUsernameStringPrimaryParserRuleCall_9_0());
				}
				lv_username_9_0=ruleStringPrimary
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectStatementRule());
					}
					set(
						$current,
						"username",
						lv_username_9_0,
						"uk.ac.kcl.inf.trader.Trader.StringPrimary");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10=','
		{
			newLeafNode(otherlv_10, grammarAccess.getConnectStatementAccess().getCommaKeyword_10());
		}
		otherlv_11='password'
		{
			newLeafNode(otherlv_11, grammarAccess.getConnectStatementAccess().getPasswordKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectStatementAccess().getPasswordStringPrimaryParserRuleCall_12_0());
				}
				lv_password_12_0=ruleStringPrimary
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectStatementRule());
					}
					set(
						$current,
						"password",
						lv_password_12_0,
						"uk.ac.kcl.inf.trader.Trader.StringPrimary");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=','
		{
			newLeafNode(otherlv_13, grammarAccess.getConnectStatementAccess().getCommaKeyword_13());
		}
		otherlv_14='timeframe'
		{
			newLeafNode(otherlv_14, grammarAccess.getConnectStatementAccess().getTimeframeKeyword_14());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectStatementAccess().getTimeframeTimeFrameDefEnumRuleCall_15_0());
				}
				lv_timeframe_15_0=ruleTimeFrameDef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectStatementRule());
					}
					set(
						$current,
						"timeframe",
						lv_timeframe_15_0,
						"uk.ac.kcl.inf.trader.Trader.TimeFrameDef");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCreateBotStatement
entryRuleCreateBotStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCreateBotStatementRule()); }
	iv_ruleCreateBotStatement=ruleCreateBotStatement
	{ $current=$iv_ruleCreateBotStatement.current; }
	EOF;

// Rule CreateBotStatement
ruleCreateBotStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='create'
		{
			newLeafNode(otherlv_0, grammarAccess.getCreateBotStatementAccess().getCreateKeyword_0());
		}
		otherlv_1='bot'
		{
			newLeafNode(otherlv_1, grammarAccess.getCreateBotStatementAccess().getBotKeyword_1());
		}
		otherlv_2='with'
		{
			newLeafNode(otherlv_2, grammarAccess.getCreateBotStatementAccess().getWithKeyword_2());
		}
		otherlv_3='strategy'
		{
			newLeafNode(otherlv_3, grammarAccess.getCreateBotStatementAccess().getStrategyKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCreateBotStatementAccess().getStrategyStrategyDefEnumRuleCall_4_0());
				}
				lv_strategy_4_0=ruleStrategyDef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCreateBotStatementRule());
					}
					set(
						$current,
						"strategy",
						lv_strategy_4_0,
						"uk.ac.kcl.inf.trader.Trader.StrategyDef");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='using'
		{
			newLeafNode(otherlv_5, grammarAccess.getCreateBotStatementAccess().getUsingKeyword_5());
		}
		otherlv_6='lot'
		{
			newLeafNode(otherlv_6, grammarAccess.getCreateBotStatementAccess().getLotKeyword_6());
		}
		otherlv_7='size'
		{
			newLeafNode(otherlv_7, grammarAccess.getCreateBotStatementAccess().getSizeKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCreateBotStatementAccess().getLotSizeAdditionParserRuleCall_8_0());
				}
				lv_lotSize_8_0=ruleAddition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCreateBotStatementRule());
					}
					set(
						$current,
						"lotSize",
						lv_lotSize_8_0,
						"uk.ac.kcl.inf.trader.Trader.Addition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleListBotsStatement
entryRuleListBotsStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListBotsStatementRule()); }
	iv_ruleListBotsStatement=ruleListBotsStatement
	{ $current=$iv_ruleListBotsStatement.current; }
	EOF;

// Rule ListBotsStatement
ruleListBotsStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_listCommand_0_0='see'
				{
					newLeafNode(lv_listCommand_0_0, grammarAccess.getListBotsStatementAccess().getListCommandSeeKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getListBotsStatementRule());
					}
					setWithLastConsumed($current, "listCommand", lv_listCommand_0_0, "see");
				}
			)
		)
		otherlv_1='registered'
		{
			newLeafNode(otherlv_1, grammarAccess.getListBotsStatementAccess().getRegisteredKeyword_1());
		}
		otherlv_2='bots'
		{
			newLeafNode(otherlv_2, grammarAccess.getListBotsStatementAccess().getBotsKeyword_2());
		}
	)
;

// Entry rule entryRuleExecuteBotsStatement
entryRuleExecuteBotsStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExecuteBotsStatementRule()); }
	iv_ruleExecuteBotsStatement=ruleExecuteBotsStatement
	{ $current=$iv_ruleExecuteBotsStatement.current; }
	EOF;

// Rule ExecuteBotsStatement
ruleExecuteBotsStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='execute'
		{
			newLeafNode(otherlv_0, grammarAccess.getExecuteBotsStatementAccess().getExecuteKeyword_0());
		}
		otherlv_1='bots'
		{
			newLeafNode(otherlv_1, grammarAccess.getExecuteBotsStatementAccess().getBotsKeyword_1());
		}
		otherlv_2='for'
		{
			newLeafNode(otherlv_2, grammarAccess.getExecuteBotsStatementAccess().getForKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExecuteBotsStatementAccess().getDaysAdditionParserRuleCall_3_0());
				}
				lv_days_3_0=ruleAddition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExecuteBotsStatementRule());
					}
					set(
						$current,
						"days",
						lv_days_3_0,
						"uk.ac.kcl.inf.trader.Trader.Addition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='days'
		{
			newLeafNode(otherlv_4, grammarAccess.getExecuteBotsStatementAccess().getDaysKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExecuteBotsStatementAccess().getHoursAdditionParserRuleCall_5_0());
				}
				lv_hours_5_0=ruleAddition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExecuteBotsStatementRule());
					}
					set(
						$current,
						"hours",
						lv_hours_5_0,
						"uk.ac.kcl.inf.trader.Trader.Addition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='hours'
		{
			newLeafNode(otherlv_6, grammarAccess.getExecuteBotsStatementAccess().getHoursKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExecuteBotsStatementAccess().getMinutesAdditionParserRuleCall_7_0());
				}
				lv_minutes_7_0=ruleAddition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExecuteBotsStatementRule());
					}
					set(
						$current,
						"minutes",
						lv_minutes_7_0,
						"uk.ac.kcl.inf.trader.Trader.Addition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='minutes'
		{
			newLeafNode(otherlv_8, grammarAccess.getExecuteBotsStatementAccess().getMinutesKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExecuteBotsStatementAccess().getSecondsAdditionParserRuleCall_9_0());
				}
				lv_seconds_9_0=ruleAddition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExecuteBotsStatementRule());
					}
					set(
						$current,
						"seconds",
						lv_seconds_9_0,
						"uk.ac.kcl.inf.trader.Trader.Addition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10='seconds'
		{
			newLeafNode(otherlv_10, grammarAccess.getExecuteBotsStatementAccess().getSecondsKeyword_10());
		}
	)
;

// Entry rule entryRuleVariableDeclaration
entryRuleVariableDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableDeclarationRule()); }
	iv_ruleVariableDeclaration=ruleVariableDeclaration
	{ $current=$iv_ruleVariableDeclaration.current; }
	EOF;

// Rule VariableDeclaration
ruleVariableDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='var'
		{
			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValueStringValueParserRuleCall_3_0_0());
					}
					lv_value_3_0=ruleStringValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
						}
						set(
							$current,
							"value",
							lv_value_3_0,
							"uk.ac.kcl.inf.trader.Trader.StringValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValueIntValueParserRuleCall_3_1_0());
					}
					lv_value_4_0=ruleIntValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
						}
						set(
							$current,
							"value",
							lv_value_4_0,
							"uk.ac.kcl.inf.trader.Trader.IntValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValueRealValueParserRuleCall_3_2_0());
					}
					lv_value_5_0=ruleRealValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
						}
						set(
							$current,
							"value",
							lv_value_5_0,
							"uk.ac.kcl.inf.trader.Trader.RealValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleStringValue
entryRuleStringValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringValueRule()); }
	iv_ruleStringValue=ruleStringValue
	{ $current=$iv_ruleStringValue.current; }
	EOF;

// Rule StringValue
ruleStringValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_STRING
			{
				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getStringValueRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleRealValue
entryRuleRealValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRealValueRule()); }
	iv_ruleRealValue=ruleRealValue
	{ $current=$iv_ruleRealValue.current; }
	EOF;

// Rule RealValue
ruleRealValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRealValueAccess().getValueREALParserRuleCall_0());
			}
			lv_value_0_0=ruleREAL
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRealValueRule());
				}
				set(
					$current,
					"value",
					lv_value_0_0,
					"uk.ac.kcl.inf.trader.Trader.REAL");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleIntValue
entryRuleIntValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntValueRule()); }
	iv_ruleIntValue=ruleIntValue
	{ $current=$iv_ruleIntValue.current; }
	EOF;

// Rule IntValue
ruleIntValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_INT
			{
				newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIntValueRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleLoopStatement
entryRuleLoopStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLoopStatementRule()); }
	iv_ruleLoopStatement=ruleLoopStatement
	{ $current=$iv_ruleLoopStatement.current; }
	EOF;

// Rule LoopStatement
ruleLoopStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='loop'
		{
			newLeafNode(otherlv_0, grammarAccess.getLoopStatementAccess().getLoopKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLoopStatementAccess().getCountAdditionParserRuleCall_1_0());
				}
				lv_count_1_0=ruleAddition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLoopStatementRule());
					}
					set(
						$current,
						"count",
						lv_count_1_0,
						"uk.ac.kcl.inf.trader.Trader.Addition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='times'
		{
			newLeafNode(otherlv_2, grammarAccess.getLoopStatementAccess().getTimesKeyword_2());
		}
		otherlv_3='do'
		{
			newLeafNode(otherlv_3, grammarAccess.getLoopStatementAccess().getDoKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLoopStatementAccess().getStatementsStatementParserRuleCall_4_0());
				}
				lv_statements_4_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLoopStatementRule());
					}
					add(
						$current,
						"statements",
						lv_statements_4_0,
						"uk.ac.kcl.inf.trader.Trader.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_5='end'
		{
			newLeafNode(otherlv_5, grammarAccess.getLoopStatementAccess().getEndKeyword_5());
		}
	)
;

// Entry rule entryRuleAddition
entryRuleAddition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAdditionRule()); }
	iv_ruleAddition=ruleAddition
	{ $current=$iv_ruleAddition.current; }
	EOF;

// Rule Addition
ruleAddition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
		}
		this_Multiplication_0=ruleMultiplication
		{
			$current = $this_Multiplication_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_operator_2_1='+'
						{
							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAdditionRule());
							}
							addWithLastConsumed($current, "operator", lv_operator_2_1, null);
						}
						    |
						lv_operator_2_2='-'
						{
							newLeafNode(lv_operator_2_2, grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAdditionRule());
							}
							addWithLastConsumed($current, "operator", lv_operator_2_2, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMultiplication
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAdditionRule());
						}
						add(
							$current,
							"right",
							lv_right_3_0,
							"uk.ac.kcl.inf.trader.Trader.Multiplication");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMultiplication
entryRuleMultiplication returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplicationRule()); }
	iv_ruleMultiplication=ruleMultiplication
	{ $current=$iv_ruleMultiplication.current; }
	EOF;

// Rule Multiplication
ruleMultiplication returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_operator_2_1='*'
						{
							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiplicationRule());
							}
							addWithLastConsumed($current, "operator", lv_operator_2_1, null);
						}
						    |
						lv_operator_2_2='/'
						{
							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiplicationRule());
							}
							addWithLastConsumed($current, "operator", lv_operator_2_2, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiplicationRule());
						}
						add(
							$current,
							"right",
							lv_right_3_0,
							"uk.ac.kcl.inf.trader.Trader.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getIntValueParserRuleCall_0());
		}
		this_IntValue_0=ruleIntValue
		{
			$current = $this_IntValue_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getRealValueParserRuleCall_1());
		}
		this_RealValue_1=ruleRealValue
		{
			$current = $this_RealValue_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getNumVarExpressionParserRuleCall_2());
		}
		this_NumVarExpression_2=ruleNumVarExpression
		{
			$current = $this_NumVarExpression_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			otherlv_3='('
			{
				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0());
			}
			{
				newCompositeNode(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_3_1());
			}
			this_Addition_4=ruleAddition
			{
				$current = $this_Addition_4.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_5=')'
			{
				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2());
			}
		)
	)
;

// Entry rule entryRuleNumVarExpression
entryRuleNumVarExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumVarExpressionRule()); }
	iv_ruleNumVarExpression=ruleNumVarExpression
	{ $current=$iv_ruleNumVarExpression.current; }
	EOF;

// Rule NumVarExpression
ruleNumVarExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNumVarExpressionRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getNumVarExpressionAccess().getVarVariableDeclarationCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleREAL
entryRuleREAL returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getREALRule()); }
	iv_ruleREAL=ruleREAL
	{ $current=$iv_ruleREAL.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule REAL
ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		(
			this_INT_0=RULE_INT
			{
				$current.merge(this_INT_0);
			}
			{
				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleStringPrimary
entryRuleStringPrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringPrimaryRule()); }
	iv_ruleStringPrimary=ruleStringPrimary
	{ $current=$iv_ruleStringPrimary.current; }
	EOF;

// Rule StringPrimary
ruleStringPrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStringPrimaryAccess().getStringVarExpressionParserRuleCall_0());
		}
		this_StringVarExpression_0=ruleStringVarExpression
		{
			$current = $this_StringVarExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStringPrimaryAccess().getStringValueParserRuleCall_1());
		}
		this_StringValue_1=ruleStringValue
		{
			$current = $this_StringValue_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleStringVarExpression
entryRuleStringVarExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringVarExpressionRule()); }
	iv_ruleStringVarExpression=ruleStringVarExpression
	{ $current=$iv_ruleStringVarExpression.current; }
	EOF;

// Rule StringVarExpression
ruleStringVarExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getStringVarExpressionRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getStringVarExpressionAccess().getVarVariableDeclarationCrossReference_0());
			}
		)
	)
;

// Rule StrategyDef
ruleStrategyDef returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='simpleStrategyA'
			{
				$current = grammarAccess.getStrategyDefAccess().getSimpleStrategyAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getStrategyDefAccess().getSimpleStrategyAEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='machineLearningStrategyA'
			{
				$current = grammarAccess.getStrategyDefAccess().getMachineLearningStrategyAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getStrategyDefAccess().getMachineLearningStrategyAEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule TimeFrameDef
ruleTimeFrameDef returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='M1'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getM1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTimeFrameDefAccess().getM1EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='M2'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getM2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTimeFrameDefAccess().getM2EnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='M3'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getM3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTimeFrameDefAccess().getM3EnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='M4'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getM4EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTimeFrameDefAccess().getM4EnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='M5'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getM5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTimeFrameDefAccess().getM5EnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='M6'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getM6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getTimeFrameDefAccess().getM6EnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='M10'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getM10EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getTimeFrameDefAccess().getM10EnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='M12'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getM12EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getTimeFrameDefAccess().getM12EnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='M20'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getM20EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getTimeFrameDefAccess().getM20EnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='M30'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getM30EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getTimeFrameDefAccess().getM30EnumLiteralDeclaration_9());
			}
		)
		    |
		(
			enumLiteral_10='H1'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getH1EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_10, grammarAccess.getTimeFrameDefAccess().getH1EnumLiteralDeclaration_10());
			}
		)
		    |
		(
			enumLiteral_11='H2'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getH2EnumLiteralDeclaration_11().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_11, grammarAccess.getTimeFrameDefAccess().getH2EnumLiteralDeclaration_11());
			}
		)
		    |
		(
			enumLiteral_12='H3'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getH3EnumLiteralDeclaration_12().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_12, grammarAccess.getTimeFrameDefAccess().getH3EnumLiteralDeclaration_12());
			}
		)
		    |
		(
			enumLiteral_13='H4'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getH4EnumLiteralDeclaration_13().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_13, grammarAccess.getTimeFrameDefAccess().getH4EnumLiteralDeclaration_13());
			}
		)
		    |
		(
			enumLiteral_14='H6'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getH6EnumLiteralDeclaration_14().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_14, grammarAccess.getTimeFrameDefAccess().getH6EnumLiteralDeclaration_14());
			}
		)
		    |
		(
			enumLiteral_15='H8'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getH8EnumLiteralDeclaration_15().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_15, grammarAccess.getTimeFrameDefAccess().getH8EnumLiteralDeclaration_15());
			}
		)
		    |
		(
			enumLiteral_16='H12'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getH12EnumLiteralDeclaration_16().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_16, grammarAccess.getTimeFrameDefAccess().getH12EnumLiteralDeclaration_16());
			}
		)
		    |
		(
			enumLiteral_17='D1'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getD1EnumLiteralDeclaration_17().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_17, grammarAccess.getTimeFrameDefAccess().getD1EnumLiteralDeclaration_17());
			}
		)
		    |
		(
			enumLiteral_18='W1'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getW1EnumLiteralDeclaration_18().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_18, grammarAccess.getTimeFrameDefAccess().getW1EnumLiteralDeclaration_18());
			}
		)
		    |
		(
			enumLiteral_19='MN1'
			{
				$current = grammarAccess.getTimeFrameDefAccess().getMN1EnumLiteralDeclaration_19().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_19, grammarAccess.getTimeFrameDefAccess().getMN1EnumLiteralDeclaration_19());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
