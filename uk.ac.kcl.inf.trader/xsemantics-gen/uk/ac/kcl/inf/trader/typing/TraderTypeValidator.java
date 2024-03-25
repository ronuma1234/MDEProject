package uk.ac.kcl.inf.trader.typing;

import com.google.common.collect.Iterables;
import com.google.inject.Provider;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xsemantics.runtime.ErrorInformation;
import org.eclipse.xsemantics.runtime.Result;
import org.eclipse.xsemantics.runtime.RuleApplicationTrace;
import org.eclipse.xsemantics.runtime.RuleEnvironment;
import org.eclipse.xsemantics.runtime.RuleFailedException;
import org.eclipse.xsemantics.runtime.XsemanticsProvider;
import org.eclipse.xsemantics.runtime.XsemanticsRuntimeSystem;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.inf.trader.trader.Addition;
import uk.ac.kcl.inf.trader.trader.ConnectStatement;
import uk.ac.kcl.inf.trader.trader.Expression;
import uk.ac.kcl.inf.trader.trader.IntValue;
import uk.ac.kcl.inf.trader.trader.LoopStatement;
import uk.ac.kcl.inf.trader.trader.Multiplication;
import uk.ac.kcl.inf.trader.trader.NumVarExpression;
import uk.ac.kcl.inf.trader.trader.RealValue;
import uk.ac.kcl.inf.trader.trader.StringValue;
import uk.ac.kcl.inf.trader.trader.StringVarExpression;
import uk.ac.kcl.inf.trader.trader.TradingBot;

@SuppressWarnings("all")
public class TraderTypeValidator extends XsemanticsRuntimeSystem {
  public static final String TYPEEXPRESSION = "uk.ac.kcl.inf.trader.typing.TypeExpression";

  public static final String TINTLIT = "uk.ac.kcl.inf.trader.typing.TIntLit";

  public static final String TREALLIT = "uk.ac.kcl.inf.trader.typing.TRealLit";

  public static final String TSTRINGLIT = "uk.ac.kcl.inf.trader.typing.TStringLit";

  public static final String TSTRINGVAREXPRESSION = "uk.ac.kcl.inf.trader.typing.TStringVarExpression";

  public static final String TNUMVAREXPRESSION = "uk.ac.kcl.inf.trader.typing.TNumVarExpression";

  public static final String TMULTIPLICATION = "uk.ac.kcl.inf.trader.typing.TMultiplication";

  public static final String TADDITION = "uk.ac.kcl.inf.trader.typing.TAddition";

  public static final String SUBTYPING = "uk.ac.kcl.inf.trader.typing.SubTyping";

  private PolymorphicDispatcher<TraderType> typeExpressionDispatcher;

  private PolymorphicDispatcher<Result<TraderType>> typeDispatcher;

  private PolymorphicDispatcher<Result<Boolean>> subTypeDispatcher;

  public TraderTypeValidator() {
    init();
  }

  public void init() {
    typeDispatcher = buildPolymorphicDispatcher1(
    	"typeImpl", 3, "|-", ":");
    subTypeDispatcher = buildPolymorphicDispatcher1(
    	"subTypeImpl", 4, "|-", "<:");
    typeExpressionDispatcher = buildPolymorphicDispatcher(
    	"typeExpressionImpl", 2);
  }

  public TraderType typeExpression(final Iterable<Expression> exps) throws RuleFailedException {
    return typeExpression(null, exps);
  }

  public TraderType typeExpression(final RuleApplicationTrace _trace_, final Iterable<Expression> exps) throws RuleFailedException {
    try {
    	return typeExpressionInternal(_trace_, exps);
    } catch (Exception _e_typeExpression) {
    	throw extractRuleFailedException(_e_typeExpression);
    }
  }

  public Result<TraderType> type(final Expression exp) {
    return type(new RuleEnvironment(), null, exp);
  }

  public Result<TraderType> type(final RuleEnvironment _environment_, final Expression exp) {
    return type(_environment_, null, exp);
  }

  public Result<TraderType> type(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Expression exp) {
    return getFromCache("type", _environment_, _trace_,
    	new XsemanticsProvider<Result<TraderType>>(_environment_, _trace_) {
    		public Result<TraderType> doGet() {
    			try {
    				return typeInternal(_environment_, _trace_, exp);
    			} catch (Exception _e_type) {
    				return resultForFailure(_e_type);
    			}
    		}
    	}, exp);
  }

  public Result<Boolean> subType(final TraderType left, final TraderType right) {
    return subType(new RuleEnvironment(), null, left, right);
  }

  public Result<Boolean> subType(final RuleEnvironment _environment_, final TraderType left, final TraderType right) {
    return subType(_environment_, null, left, right);
  }

  public Result<Boolean> subType(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final TraderType left, final TraderType right) {
    try {
    	return subTypeInternal(_environment_, _trace_, left, right);
    } catch (Exception _e_subType) {
    	return resultForFailure(_e_subType);
    }
  }

  public Boolean subTypeSucceeded(final TraderType left, final TraderType right) {
    return subTypeSucceeded(new RuleEnvironment(), null, left, right);
  }

  public Boolean subTypeSucceeded(final RuleEnvironment _environment_, final TraderType left, final TraderType right) {
    return subTypeSucceeded(_environment_, null, left, right);
  }

  public Boolean subTypeSucceeded(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final TraderType left, final TraderType right) {
    try {
    	subTypeInternal(_environment_, _trace_, left, right);
    	return true;
    } catch (Exception _e_subType) {
    	return false;
    }
  }

  public Result<Boolean> checkConnectStatement(final ConnectStatement stmt) {
    return checkConnectStatement(null, stmt);
  }

  public Result<Boolean> checkConnectStatement(final RuleApplicationTrace _trace_, final ConnectStatement stmt) {
    try {
    	return checkConnectStatementInternal(_trace_, stmt);
    } catch (Exception _e_checkConnectStatement) {
    	return resultForFailure(_e_checkConnectStatement);
    }
  }

  protected Result<Boolean> checkConnectStatementInternal(final RuleApplicationTrace _trace_, final ConnectStatement stmt) throws RuleFailedException {
    /* empty |- stmt.username : var TraderType usernameTypes */
    Expression _username = stmt.getUsername();
    TraderType usernameTypes = null;
    Result<TraderType> result = typeInternal(emptyEnvironment(), _trace_, _username);
    checkAssignableTo(result.getFirst(), TraderType.class);
    usernameTypes = (TraderType) result.getFirst();
    
    /* empty |- usernameTypes <: TraderType.STRING */
    subTypeInternal(emptyEnvironment(), _trace_, usernameTypes, TraderType.STRING);
    /* empty |- stmt.password : var TraderType passwordTypes */
    Expression _password = stmt.getPassword();
    TraderType passwordTypes = null;
    Result<TraderType> result_1 = typeInternal(emptyEnvironment(), _trace_, _password);
    checkAssignableTo(result_1.getFirst(), TraderType.class);
    passwordTypes = (TraderType) result_1.getFirst();
    
    /* empty |- passwordTypes <: TraderType.STRING */
    subTypeInternal(emptyEnvironment(), _trace_, passwordTypes, TraderType.STRING);
    /* empty |- stmt.leverage : var TraderType leverageTypes */
    Expression _leverage = stmt.getLeverage();
    TraderType leverageTypes = null;
    Result<TraderType> result_2 = typeInternal(emptyEnvironment(), _trace_, _leverage);
    checkAssignableTo(result_2.getFirst(), TraderType.class);
    leverageTypes = (TraderType) result_2.getFirst();
    
    /* empty |- leverageTypes <: TraderType.REAL */
    subTypeInternal(emptyEnvironment(), _trace_, leverageTypes, TraderType.REAL);
    /* empty |- stmt.money : var TraderType moneyTypes */
    Expression _money = stmt.getMoney();
    TraderType moneyTypes = null;
    Result<TraderType> result_3 = typeInternal(emptyEnvironment(), _trace_, _money);
    checkAssignableTo(result_3.getFirst(), TraderType.class);
    moneyTypes = (TraderType) result_3.getFirst();
    
    /* empty |- moneyTypes <: TraderType.REAL */
    subTypeInternal(emptyEnvironment(), _trace_, moneyTypes, TraderType.REAL);
    /* empty |- stmt.timeframe : var TraderType timeframeTypes */
    Expression _timeframe = stmt.getTimeframe();
    TraderType timeframeTypes = null;
    Result<TraderType> result_4 = typeInternal(emptyEnvironment(), _trace_, _timeframe);
    checkAssignableTo(result_4.getFirst(), TraderType.class);
    timeframeTypes = (TraderType) result_4.getFirst();
    
    /* empty |- timeframeTypes <: TraderType.STRING */
    subTypeInternal(emptyEnvironment(), _trace_, timeframeTypes, TraderType.STRING);
    return new Result<Boolean>(true);
  }

  public Result<Boolean> checkLoopStatement(final LoopStatement stmt) {
    return checkLoopStatement(null, stmt);
  }

  public Result<Boolean> checkLoopStatement(final RuleApplicationTrace _trace_, final LoopStatement stmt) {
    try {
    	return checkLoopStatementInternal(_trace_, stmt);
    } catch (Exception _e_checkLoopStatement) {
    	return resultForFailure(_e_checkLoopStatement);
    }
  }

  protected Result<Boolean> checkLoopStatementInternal(final RuleApplicationTrace _trace_, final LoopStatement stmt) throws RuleFailedException {
    /* empty |- stmt.count : var TraderType countTypes */
    Expression _count = stmt.getCount();
    TraderType countTypes = null;
    Result<TraderType> result = typeInternal(emptyEnvironment(), _trace_, _count);
    checkAssignableTo(result.getFirst(), TraderType.class);
    countTypes = (TraderType) result.getFirst();
    
    /* empty |- countTypes <: TraderType.INT */
    subTypeInternal(emptyEnvironment(), _trace_, countTypes, TraderType.INT);
    return new Result<Boolean>(true);
  }

  public Result<Boolean> checkTradingBot(final TradingBot stmt) {
    return checkTradingBot(null, stmt);
  }

  public Result<Boolean> checkTradingBot(final RuleApplicationTrace _trace_, final TradingBot stmt) {
    try {
    	return checkTradingBotInternal(_trace_, stmt);
    } catch (Exception _e_checkTradingBot) {
    	return resultForFailure(_e_checkTradingBot);
    }
  }

  protected Result<Boolean> checkTradingBotInternal(final RuleApplicationTrace _trace_, final TradingBot stmt) throws RuleFailedException {
    /* empty |- stmt.fund : var TraderType fundTypes */
    Expression _fund = stmt.getFund();
    TraderType fundTypes = null;
    Result<TraderType> result = typeInternal(emptyEnvironment(), _trace_, _fund);
    checkAssignableTo(result.getFirst(), TraderType.class);
    fundTypes = (TraderType) result.getFirst();
    
    /* empty |- fundTypes <: TraderType.REAL */
    subTypeInternal(emptyEnvironment(), _trace_, fundTypes, TraderType.REAL);
    return new Result<Boolean>(true);
  }

  protected TraderType typeExpressionInternal(final RuleApplicationTrace _trace_, final Iterable<Expression> exps) {
    return getFromCache("typeExpressionInternal", (RuleEnvironment)null, _trace_,
    	new XsemanticsProvider<TraderType>(null, _trace_) {
    		public TraderType doGet() {
    			try {
    				checkParamsNotNull(exps);
    				return typeExpressionDispatcher.invoke(_trace_, exps);
    			} catch (Exception _e_typeExpression) {
    				sneakyThrowRuleFailedException(_e_typeExpression);
    				return null;
    			}
    		}
    	}, exps);
  }

  protected void typeExpressionThrowException(final String _error, final String _issue, final Exception _ex, final Iterable<Expression> exps, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    throwRuleFailedException(_error, _issue, _ex, _errorInformations);
  }

  protected Result<TraderType> typeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Expression exp) {
    return getFromCache("typeInternal", _environment_, _trace_,
    	new XsemanticsProvider<Result<TraderType>>(_environment_, _trace_) {
    		public Result<TraderType> doGet() {
    			try {
    				checkParamsNotNull(exp);
    				return typeDispatcher.invoke(_environment_, _trace_, exp);
    			} catch (Exception _e_type) {
    				sneakyThrowRuleFailedException(_e_type);
    				return null;
    			}
    		}
    	}, exp);
  }

  protected void typeThrowException(final String _error, final String _issue, final Exception _ex, final Expression exp, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String _stringRep = this.stringRep(exp);
    String _plus = ("Cannot type " + _stringRep);
    String error = _plus;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }

  protected Result<Boolean> subTypeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final TraderType left, final TraderType right) {
    try {
    	checkParamsNotNull(left, right);
    	return subTypeDispatcher.invoke(_environment_, _trace_, left, right);
    } catch (Exception _e_subType) {
    	sneakyThrowRuleFailedException(_e_subType);
    	return null;
    }
  }

  protected void subTypeThrowException(final String _error, final String _issue, final Exception _ex, final TraderType left, final TraderType right, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String _stringRep = this.stringRep(left);
    String _plus = (_stringRep + " is not a subtype of ");
    String _stringRep_1 = this.stringRep(right);
    String _plus_1 = (_plus + _stringRep_1);
    String error = _plus_1;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }

  protected TraderType typeExpressionImpl(final RuleApplicationTrace _trace_, final Iterable<Expression> exps) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final TraderType _result_ = applyAuxFunTypeExpression(_subtrace_, exps);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return auxFunName("typeExpression") + "(" + stringRep(exps)+ ")" + " = " + stringRep(_result_);
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyAuxFunTypeExpression) {
    	typeExpressionThrowException(auxFunName("typeExpression") + "(" + stringRep(exps)+ ")",
    		TYPEEXPRESSION,
    		e_applyAuxFunTypeExpression, exps, new ErrorInformation[] {});
    	return null;
    }
  }

  protected TraderType applyAuxFunTypeExpression(final RuleApplicationTrace _trace_, final Iterable<Expression> exps) throws RuleFailedException {
    final Function1<Expression, Boolean> _function = (Expression exp) -> {
      boolean _xblockexpression = false;
      {
        /* empty |- exp : var TraderType type */
        TraderType type = null;
        Result<TraderType> result = typeInternal(emptyEnvironment(), _trace_, exp);
        checkAssignableTo(result.getFirst(), TraderType.class);
        type = (TraderType) result.getFirst();
        
        _xblockexpression = (type == TraderType.INT);
      }
      return Boolean.valueOf(_xblockexpression);
    };
    boolean _forall = IterableExtensions.<Expression>forall(exps, _function);
    if (_forall) {
      return TraderType.INT;
    } else {
      final Function1<Expression, Boolean> _function_1 = (Expression exp) -> {
        boolean _xblockexpression = false;
        {
          /* empty |- exp : var TraderType type */
          TraderType type = null;
          Result<TraderType> result = typeInternal(emptyEnvironment(), _trace_, exp);
          checkAssignableTo(result.getFirst(), TraderType.class);
          type = (TraderType) result.getFirst();
          
          _xblockexpression = (type == TraderType.STRING);
        }
        return Boolean.valueOf(_xblockexpression);
      };
      boolean _exists = IterableExtensions.<Expression>exists(exps, _function_1);
      if (_exists) {
        return TraderType.STRING;
      } else {
        return TraderType.REAL;
      }
    }
  }

  protected Result<TraderType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntValue exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<TraderType> _result_ = applyRuleTIntLit(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TIntLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTIntLit) {
    	typeThrowException(ruleName("TIntLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "TraderType",
    		TINTLIT,
    		e_applyRuleTIntLit, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }

  protected Result<TraderType> applyRuleTIntLit(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntValue exp) throws RuleFailedException {
    
    return new Result<TraderType>(_applyRuleTIntLit_1(G, exp));
  }

  private TraderType _applyRuleTIntLit_1(final RuleEnvironment G, final IntValue exp) throws RuleFailedException {
    return TraderType.INT;
  }

  protected Result<TraderType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final RealValue exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<TraderType> _result_ = applyRuleTRealLit(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TRealLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTRealLit) {
    	typeThrowException(ruleName("TRealLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "TraderType",
    		TREALLIT,
    		e_applyRuleTRealLit, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }

  protected Result<TraderType> applyRuleTRealLit(final RuleEnvironment G, final RuleApplicationTrace _trace_, final RealValue exp) throws RuleFailedException {
    
    return new Result<TraderType>(_applyRuleTRealLit_1(G, exp));
  }

  private TraderType _applyRuleTRealLit_1(final RuleEnvironment G, final RealValue exp) throws RuleFailedException {
    return TraderType.REAL;
  }

  protected Result<TraderType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final StringValue exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<TraderType> _result_ = applyRuleTStringLit(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TStringLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTStringLit) {
    	typeThrowException(ruleName("TStringLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "TraderType",
    		TSTRINGLIT,
    		e_applyRuleTStringLit, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }

  protected Result<TraderType> applyRuleTStringLit(final RuleEnvironment G, final RuleApplicationTrace _trace_, final StringValue exp) throws RuleFailedException {
    
    return new Result<TraderType>(_applyRuleTStringLit_1(G, exp));
  }

  private TraderType _applyRuleTStringLit_1(final RuleEnvironment G, final StringValue exp) throws RuleFailedException {
    return TraderType.STRING;
  }

  protected Result<TraderType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final StringVarExpression exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<TraderType> _result_ = applyRuleTStringVarExpression(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TStringVarExpression") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTStringVarExpression) {
    	typeThrowException(ruleName("TStringVarExpression") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "TraderType",
    		TSTRINGVAREXPRESSION,
    		e_applyRuleTStringVarExpression, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }

  protected Result<TraderType> applyRuleTStringVarExpression(final RuleEnvironment G, final RuleApplicationTrace _trace_, final StringVarExpression exp) throws RuleFailedException {
    
    return new Result<TraderType>(_applyRuleTStringVarExpression_1(G, exp));
  }

  private TraderType _applyRuleTStringVarExpression_1(final RuleEnvironment G, final StringVarExpression exp) throws RuleFailedException {
    return TraderType.STRING;
  }

  protected Result<TraderType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final NumVarExpression exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<TraderType> _result_ = applyRuleTNumVarExpression(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TNumVarExpression") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTNumVarExpression) {
    	typeThrowException(ruleName("TNumVarExpression") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "TraderType",
    		TNUMVAREXPRESSION,
    		e_applyRuleTNumVarExpression, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }

  protected Result<TraderType> applyRuleTNumVarExpression(final RuleEnvironment G, final RuleApplicationTrace _trace_, final NumVarExpression exp) throws RuleFailedException {
    TraderType t = null; // output parameter
    /* empty |- exp.^var.value : var TraderType type */
    Expression _value = exp.getVar().getValue();
    TraderType type = null;
    Result<TraderType> result = typeInternal(emptyEnvironment(), _trace_, _value);
    checkAssignableTo(result.getFirst(), TraderType.class);
    type = (TraderType) result.getFirst();
    
    if ((type == TraderType.INT)) {
      t = TraderType.INT;
    } else {
      if ((type == TraderType.REAL)) {
        t = TraderType.REAL;
      } else {
        t = TraderType.STRING;
      }
    }
    return new Result<TraderType>(t);
  }

  protected Result<TraderType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Multiplication exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<TraderType> _result_ = applyRuleTMultiplication(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TMultiplication") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTMultiplication) {
    	typeThrowException(ruleName("TMultiplication") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "TraderType",
    		TMULTIPLICATION,
    		e_applyRuleTMultiplication, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }

  protected Result<TraderType> applyRuleTMultiplication(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Multiplication exp) throws RuleFailedException {
    TraderType t = null; // output parameter
    Expression _left = exp.getLeft();
    EList<Expression> _right = exp.getRight();
    t = this.typeExpressionInternal(_trace_, Iterables.<Expression>concat(Collections.<Expression>unmodifiableList(CollectionLiterals.<Expression>newArrayList(_left)), _right));
    return new Result<TraderType>(t);
  }

  protected Result<TraderType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Addition exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<TraderType> _result_ = applyRuleTAddition(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TAddition") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTAddition) {
    	typeThrowException(ruleName("TAddition") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "TraderType",
    		TADDITION,
    		e_applyRuleTAddition, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }

  protected Result<TraderType> applyRuleTAddition(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Addition exp) throws RuleFailedException {
    TraderType t = null; // output parameter
    Expression _left = exp.getLeft();
    EList<Expression> _right = exp.getRight();
    t = this.typeExpressionInternal(_trace_, Iterables.<Expression>concat(Collections.<Expression>unmodifiableList(CollectionLiterals.<Expression>newArrayList(_left)), _right));
    return new Result<TraderType>(t);
  }

  protected Result<Boolean> subTypeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final TraderType left, final TraderType right) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<Boolean> _result_ = applyRuleSubTyping(G, _subtrace_, left, right);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("SubTyping") + stringRepForEnv(G) + " |- " + stringRep(left) + " <: " + stringRep(right);
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleSubTyping) {
    	subTypeThrowException(ruleName("SubTyping") + stringRepForEnv(G) + " |- " + stringRep(left) + " <: " + stringRep(right),
    		SUBTYPING,
    		e_applyRuleSubTyping, left, right, new ErrorInformation[] {});
    	return null;
    }
  }

  protected Result<Boolean> applyRuleSubTyping(final RuleEnvironment G, final RuleApplicationTrace _trace_, final TraderType left, final TraderType right) throws RuleFailedException {
    /* (left !== TraderType.STRING && right === TraderType.REAL) or left === right */
    {
      RuleFailedException previousFailure = null;
      try {
        /* left !== TraderType.STRING && right === TraderType.REAL */
        if (!((left != TraderType.STRING) && (right == TraderType.REAL))) {
          sneakyThrowRuleFailedException("left !== TraderType.STRING && right === TraderType.REAL");
        }
      } catch (Exception e) {
        previousFailure = extractRuleFailedException(e);
        /* left === right */
        if (!(left == right)) {
          sneakyThrowRuleFailedException("left === right");
        }
      }
    }
    return new Result<Boolean>(true);
  }
}
