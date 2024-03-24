/*
 * generated by Xtext 2.34.0
 */
package uk.ac.kcl.inf.trader.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.ac.kcl.inf.trader.services.TraderGrammarAccess;
import uk.ac.kcl.inf.trader.trader.Addition;
import uk.ac.kcl.inf.trader.trader.Buy;
import uk.ac.kcl.inf.trader.trader.ConnectStatement;
import uk.ac.kcl.inf.trader.trader.Execute;
import uk.ac.kcl.inf.trader.trader.IntValue;
import uk.ac.kcl.inf.trader.trader.ListBots;
import uk.ac.kcl.inf.trader.trader.LoopStatement;
import uk.ac.kcl.inf.trader.trader.Multiplication;
import uk.ac.kcl.inf.trader.trader.NumVarExpression;
import uk.ac.kcl.inf.trader.trader.RealValue;
import uk.ac.kcl.inf.trader.trader.Sell;
import uk.ac.kcl.inf.trader.trader.Stop;
import uk.ac.kcl.inf.trader.trader.StringValue;
import uk.ac.kcl.inf.trader.trader.StringVarExpression;
import uk.ac.kcl.inf.trader.trader.TraderPackage;
import uk.ac.kcl.inf.trader.trader.TraderProgram;
import uk.ac.kcl.inf.trader.trader.TradingBot;
import uk.ac.kcl.inf.trader.trader.VariableDeclaration;

@SuppressWarnings("all")
public class TraderSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TraderGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TraderPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TraderPackage.ADDITION:
				sequence_Addition(context, (Addition) semanticObject); 
				return; 
			case TraderPackage.BUY:
				sequence_Buy(context, (Buy) semanticObject); 
				return; 
			case TraderPackage.CONNECT_STATEMENT:
				sequence_ConnectStatement(context, (ConnectStatement) semanticObject); 
				return; 
			case TraderPackage.EXECUTE:
				sequence_Execute(context, (Execute) semanticObject); 
				return; 
			case TraderPackage.INT_VALUE:
				sequence_IntValue(context, (IntValue) semanticObject); 
				return; 
			case TraderPackage.LIST_BOTS:
				sequence_ListBots(context, (ListBots) semanticObject); 
				return; 
			case TraderPackage.LOOP_STATEMENT:
				sequence_LoopStatement(context, (LoopStatement) semanticObject); 
				return; 
			case TraderPackage.MULTIPLICATION:
				sequence_Multiplication(context, (Multiplication) semanticObject); 
				return; 
			case TraderPackage.NUM_VAR_EXPRESSION:
				sequence_NumVarExpression(context, (NumVarExpression) semanticObject); 
				return; 
			case TraderPackage.REAL_VALUE:
				sequence_RealValue(context, (RealValue) semanticObject); 
				return; 
			case TraderPackage.SELL:
				sequence_Sell(context, (Sell) semanticObject); 
				return; 
			case TraderPackage.STOP:
				sequence_Stop(context, (Stop) semanticObject); 
				return; 
			case TraderPackage.STRING_VALUE:
				sequence_StringValue(context, (StringValue) semanticObject); 
				return; 
			case TraderPackage.STRING_VAR_EXPRESSION:
				sequence_StringVarExpression(context, (StringVarExpression) semanticObject); 
				return; 
			case TraderPackage.TRADER_PROGRAM:
				sequence_TraderProgram(context, (TraderProgram) semanticObject); 
				return; 
			case TraderPackage.TRADING_BOT:
				sequence_TradingBot(context, (TradingBot) semanticObject); 
				return; 
			case TraderPackage.VARIABLE_DECLARATION:
				sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Addition returns Addition
	 *     Addition.Addition_1_0 returns Addition
	 *     Multiplication returns Addition
	 *     Multiplication.Multiplication_1_0 returns Addition
	 *     Primary returns Addition
	 *
	 * Constraint:
	 *     (left=Addition_Addition_1_0 (operator+='+' | operator+='-') right+=Multiplication)
	 * </pre>
	 */
	protected void sequence_Addition(ISerializationContext context, Addition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns Buy
	 *     Buy returns Buy
	 *
	 * Constraint:
	 *     (quantity=Addition ticker=ID price=Addition)
	 * </pre>
	 */
	protected void sequence_Buy(ISerializationContext context, Buy semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.ACTION__QUANTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.ACTION__QUANTITY));
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.ACTION__TICKER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.ACTION__TICKER));
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.ACTION__PRICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.ACTION__PRICE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBuyAccess().getQuantityAdditionParserRuleCall_1_0(), semanticObject.getQuantity());
		feeder.accept(grammarAccess.getBuyAccess().getTickerIDTerminalRuleCall_2_0(), semanticObject.getTicker());
		feeder.accept(grammarAccess.getBuyAccess().getPriceAdditionParserRuleCall_5_0(), semanticObject.getPrice());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns ConnectStatement
	 *     ConnectStatement returns ConnectStatement
	 *
	 * Constraint:
	 *     (
	 *         brokerName=ID 
	 *         username=StringPrimary 
	 *         password=StringPrimary 
	 *         leverage=Addition 
	 *         money=Addition 
	 *         timeframe=StringPrimary
	 *     )
	 * </pre>
	 */
	protected void sequence_ConnectStatement(ISerializationContext context, ConnectStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.CONNECT_STATEMENT__BROKER_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.CONNECT_STATEMENT__BROKER_NAME));
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.CONNECT_STATEMENT__USERNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.CONNECT_STATEMENT__USERNAME));
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.CONNECT_STATEMENT__PASSWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.CONNECT_STATEMENT__PASSWORD));
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.CONNECT_STATEMENT__LEVERAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.CONNECT_STATEMENT__LEVERAGE));
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.CONNECT_STATEMENT__MONEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.CONNECT_STATEMENT__MONEY));
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.CONNECT_STATEMENT__TIMEFRAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.CONNECT_STATEMENT__TIMEFRAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConnectStatementAccess().getBrokerNameIDTerminalRuleCall_3_0(), semanticObject.getBrokerName());
		feeder.accept(grammarAccess.getConnectStatementAccess().getUsernameStringPrimaryParserRuleCall_6_0(), semanticObject.getUsername());
		feeder.accept(grammarAccess.getConnectStatementAccess().getPasswordStringPrimaryParserRuleCall_9_0(), semanticObject.getPassword());
		feeder.accept(grammarAccess.getConnectStatementAccess().getLeverageAdditionParserRuleCall_12_0(), semanticObject.getLeverage());
		feeder.accept(grammarAccess.getConnectStatementAccess().getMoneyAdditionParserRuleCall_15_0(), semanticObject.getMoney());
		feeder.accept(grammarAccess.getConnectStatementAccess().getTimeframeStringPrimaryParserRuleCall_18_0(), semanticObject.getTimeframe());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Execute
	 *     Execute returns Execute
	 *
	 * Constraint:
	 *     executeCommand='execute'
	 * </pre>
	 */
	protected void sequence_Execute(ISerializationContext context, Execute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.EXECUTE__EXECUTE_COMMAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.EXECUTE__EXECUTE_COMMAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExecuteAccess().getExecuteCommandExecuteKeyword_0_0(), semanticObject.getExecuteCommand());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     IntValue returns IntValue
	 *     Addition returns IntValue
	 *     Addition.Addition_1_0 returns IntValue
	 *     Multiplication returns IntValue
	 *     Multiplication.Multiplication_1_0 returns IntValue
	 *     Primary returns IntValue
	 *
	 * Constraint:
	 *     value=INT
	 * </pre>
	 */
	protected void sequence_IntValue(ISerializationContext context, IntValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.INT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.INT_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns ListBots
	 *     ListBots returns ListBots
	 *
	 * Constraint:
	 *     listCommand='see'
	 * </pre>
	 */
	protected void sequence_ListBots(ISerializationContext context, ListBots semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.LIST_BOTS__LIST_COMMAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.LIST_BOTS__LIST_COMMAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getListBotsAccess().getListCommandSeeKeyword_0_0(), semanticObject.getListCommand());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns LoopStatement
	 *     LoopStatement returns LoopStatement
	 *
	 * Constraint:
	 *     (count=Addition statements+=Statement+)
	 * </pre>
	 */
	protected void sequence_LoopStatement(ISerializationContext context, LoopStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Addition returns Multiplication
	 *     Addition.Addition_1_0 returns Multiplication
	 *     Multiplication returns Multiplication
	 *     Multiplication.Multiplication_1_0 returns Multiplication
	 *     Primary returns Multiplication
	 *
	 * Constraint:
	 *     (left=Multiplication_Multiplication_1_0 (operator+='*' | operator+='/') right+=Primary)
	 * </pre>
	 */
	protected void sequence_Multiplication(ISerializationContext context, Multiplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Addition returns NumVarExpression
	 *     Addition.Addition_1_0 returns NumVarExpression
	 *     Multiplication returns NumVarExpression
	 *     Multiplication.Multiplication_1_0 returns NumVarExpression
	 *     Primary returns NumVarExpression
	 *     NumVarExpression returns NumVarExpression
	 *
	 * Constraint:
	 *     var=[VariableDeclaration|ID]
	 * </pre>
	 */
	protected void sequence_NumVarExpression(ISerializationContext context, NumVarExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.NUM_VAR_EXPRESSION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.NUM_VAR_EXPRESSION__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1(), semanticObject.eGet(TraderPackage.Literals.NUM_VAR_EXPRESSION__VAR, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RealValue returns RealValue
	 *     Addition returns RealValue
	 *     Addition.Addition_1_0 returns RealValue
	 *     Multiplication returns RealValue
	 *     Multiplication.Multiplication_1_0 returns RealValue
	 *     Primary returns RealValue
	 *
	 * Constraint:
	 *     value=REAL
	 * </pre>
	 */
	protected void sequence_RealValue(ISerializationContext context, RealValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.REAL_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.REAL_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRealValueAccess().getValueREALParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns Sell
	 *     Sell returns Sell
	 *
	 * Constraint:
	 *     (quantity=Addition ticker=ID price=Addition)
	 * </pre>
	 */
	protected void sequence_Sell(ISerializationContext context, Sell semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.ACTION__QUANTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.ACTION__QUANTITY));
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.ACTION__TICKER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.ACTION__TICKER));
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.ACTION__PRICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.ACTION__PRICE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSellAccess().getQuantityAdditionParserRuleCall_1_0(), semanticObject.getQuantity());
		feeder.accept(grammarAccess.getSellAccess().getTickerIDTerminalRuleCall_2_0(), semanticObject.getTicker());
		feeder.accept(grammarAccess.getSellAccess().getPriceAdditionParserRuleCall_5_0(), semanticObject.getPrice());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Stop
	 *     Stop returns Stop
	 *
	 * Constraint:
	 *     stopCommand='stop'
	 * </pre>
	 */
	protected void sequence_Stop(ISerializationContext context, Stop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.STOP__STOP_COMMAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.STOP__STOP_COMMAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStopAccess().getStopCommandStopKeyword_0_0(), semanticObject.getStopCommand());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     StringValue returns StringValue
	 *     StringPrimary returns StringValue
	 *
	 * Constraint:
	 *     value=STRING
	 * </pre>
	 */
	protected void sequence_StringValue(ISerializationContext context, StringValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.STRING_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.STRING_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     StringPrimary returns StringVarExpression
	 *     StringVarExpression returns StringVarExpression
	 *
	 * Constraint:
	 *     var=[VariableDeclaration|ID]
	 * </pre>
	 */
	protected void sequence_StringVarExpression(ISerializationContext context, StringVarExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.STRING_VAR_EXPRESSION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.STRING_VAR_EXPRESSION__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1(), semanticObject.eGet(TraderPackage.Literals.STRING_VAR_EXPRESSION__VAR, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TraderProgram returns TraderProgram
	 *
	 * Constraint:
	 *     statements+=Statement+
	 * </pre>
	 */
	protected void sequence_TraderProgram(ISerializationContext context, TraderProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns TradingBot
	 *     TradingBot returns TradingBot
	 *
	 * Constraint:
	 *     (strategy=StrategyDef fund=Addition)
	 * </pre>
	 */
	protected void sequence_TradingBot(ISerializationContext context, TradingBot semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.TRADING_BOT__STRATEGY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.TRADING_BOT__STRATEGY));
			if (transientValues.isValueTransient(semanticObject, TraderPackage.Literals.TRADING_BOT__FUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraderPackage.Literals.TRADING_BOT__FUND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTradingBotAccess().getStrategyStrategyDefEnumRuleCall_3_0(), semanticObject.getStrategy());
		feeder.accept(grammarAccess.getTradingBotAccess().getFundAdditionParserRuleCall_6_0(), semanticObject.getFund());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns VariableDeclaration
	 *     VariableDeclaration returns VariableDeclaration
	 *
	 * Constraint:
	 *     (name=ID (value=StringValue | value=RealValue | value=IntValue))
	 * </pre>
	 */
	protected void sequence_VariableDeclaration(ISerializationContext context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
