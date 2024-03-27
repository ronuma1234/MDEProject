/**
 * generated by Xtext 2.34.0
 */
package uk.ac.kcl.inf.trader.trader.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.inf.trader.trader.Addition;
import uk.ac.kcl.inf.trader.trader.ConnectStatement;
import uk.ac.kcl.inf.trader.trader.CreateBotStatement;
import uk.ac.kcl.inf.trader.trader.ExecuteBotsStatement;
import uk.ac.kcl.inf.trader.trader.Expression;
import uk.ac.kcl.inf.trader.trader.IntValue;
import uk.ac.kcl.inf.trader.trader.ListBotsStatement;
import uk.ac.kcl.inf.trader.trader.LoopStatement;
import uk.ac.kcl.inf.trader.trader.Multiplication;
import uk.ac.kcl.inf.trader.trader.NumVarExpression;
import uk.ac.kcl.inf.trader.trader.RealValue;
import uk.ac.kcl.inf.trader.trader.Statement;
import uk.ac.kcl.inf.trader.trader.StrategyDef;
import uk.ac.kcl.inf.trader.trader.StringValue;
import uk.ac.kcl.inf.trader.trader.StringVarExpression;
import uk.ac.kcl.inf.trader.trader.TimeFrameDef;
import uk.ac.kcl.inf.trader.trader.TraderFactory;
import uk.ac.kcl.inf.trader.trader.TraderPackage;
import uk.ac.kcl.inf.trader.trader.TraderProgram;
import uk.ac.kcl.inf.trader.trader.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraderPackageImpl extends EPackageImpl implements TraderPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass traderProgramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createBotStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listBotsStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass executeBotsStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loopStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numVarExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringVarExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum strategyDefEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum timeFrameDefEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TraderPackageImpl()
  {
    super(eNS_URI, TraderFactory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link TraderPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TraderPackage init()
  {
    if (isInited) return (TraderPackage)EPackage.Registry.INSTANCE.getEPackage(TraderPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredTraderPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    TraderPackageImpl theTraderPackage = registeredTraderPackage instanceof TraderPackageImpl ? (TraderPackageImpl)registeredTraderPackage : new TraderPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theTraderPackage.createPackageContents();

    // Initialize created meta-data
    theTraderPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTraderPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TraderPackage.eNS_URI, theTraderPackage);
    return theTraderPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTraderProgram()
  {
    return traderProgramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTraderProgram_Statements()
  {
    return (EReference)traderProgramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getConnectStatement()
  {
    return connectStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConnectStatement_TickerName()
  {
    return (EReference)connectStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConnectStatement_BrokerName()
  {
    return (EReference)connectStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConnectStatement_Username()
  {
    return (EReference)connectStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConnectStatement_Password()
  {
    return (EReference)connectStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getConnectStatement_Timeframe()
  {
    return (EAttribute)connectStatementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCreateBotStatement()
  {
    return createBotStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCreateBotStatement_Strategy()
  {
    return (EAttribute)createBotStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCreateBotStatement_LotSize()
  {
    return (EReference)createBotStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getListBotsStatement()
  {
    return listBotsStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getListBotsStatement_ListCommand()
  {
    return (EAttribute)listBotsStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExecuteBotsStatement()
  {
    return executeBotsStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExecuteBotsStatement_Days()
  {
    return (EReference)executeBotsStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExecuteBotsStatement_Hours()
  {
    return (EReference)executeBotsStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExecuteBotsStatement_Minutes()
  {
    return (EReference)executeBotsStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExecuteBotsStatement_Seconds()
  {
    return (EReference)executeBotsStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVariableDeclaration()
  {
    return variableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getVariableDeclaration_Name()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getVariableDeclaration_Value()
  {
    return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStringValue()
  {
    return stringValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getStringValue_Value()
  {
    return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRealValue()
  {
    return realValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRealValue_Value()
  {
    return (EAttribute)realValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIntValue()
  {
    return intValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIntValue_Value()
  {
    return (EAttribute)intValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLoopStatement()
  {
    return loopStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLoopStatement_Count()
  {
    return (EReference)loopStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLoopStatement_Statements()
  {
    return (EReference)loopStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNumVarExpression()
  {
    return numVarExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNumVarExpression_Var()
  {
    return (EReference)numVarExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStringVarExpression()
  {
    return stringVarExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStringVarExpression_Var()
  {
    return (EReference)stringVarExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAddition()
  {
    return additionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAddition_Left()
  {
    return (EReference)additionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAddition_Operator()
  {
    return (EAttribute)additionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAddition_Right()
  {
    return (EReference)additionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMultiplication()
  {
    return multiplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMultiplication_Left()
  {
    return (EReference)multiplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMultiplication_Operator()
  {
    return (EAttribute)multiplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMultiplication_Right()
  {
    return (EReference)multiplicationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getStrategyDef()
  {
    return strategyDefEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getTimeFrameDef()
  {
    return timeFrameDefEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TraderFactory getTraderFactory()
  {
    return (TraderFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    traderProgramEClass = createEClass(TRADER_PROGRAM);
    createEReference(traderProgramEClass, TRADER_PROGRAM__STATEMENTS);

    statementEClass = createEClass(STATEMENT);

    connectStatementEClass = createEClass(CONNECT_STATEMENT);
    createEReference(connectStatementEClass, CONNECT_STATEMENT__TICKER_NAME);
    createEReference(connectStatementEClass, CONNECT_STATEMENT__BROKER_NAME);
    createEReference(connectStatementEClass, CONNECT_STATEMENT__USERNAME);
    createEReference(connectStatementEClass, CONNECT_STATEMENT__PASSWORD);
    createEAttribute(connectStatementEClass, CONNECT_STATEMENT__TIMEFRAME);

    createBotStatementEClass = createEClass(CREATE_BOT_STATEMENT);
    createEAttribute(createBotStatementEClass, CREATE_BOT_STATEMENT__STRATEGY);
    createEReference(createBotStatementEClass, CREATE_BOT_STATEMENT__LOT_SIZE);

    listBotsStatementEClass = createEClass(LIST_BOTS_STATEMENT);
    createEAttribute(listBotsStatementEClass, LIST_BOTS_STATEMENT__LIST_COMMAND);

    executeBotsStatementEClass = createEClass(EXECUTE_BOTS_STATEMENT);
    createEReference(executeBotsStatementEClass, EXECUTE_BOTS_STATEMENT__DAYS);
    createEReference(executeBotsStatementEClass, EXECUTE_BOTS_STATEMENT__HOURS);
    createEReference(executeBotsStatementEClass, EXECUTE_BOTS_STATEMENT__MINUTES);
    createEReference(executeBotsStatementEClass, EXECUTE_BOTS_STATEMENT__SECONDS);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__NAME);
    createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__VALUE);

    stringValueEClass = createEClass(STRING_VALUE);
    createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

    realValueEClass = createEClass(REAL_VALUE);
    createEAttribute(realValueEClass, REAL_VALUE__VALUE);

    intValueEClass = createEClass(INT_VALUE);
    createEAttribute(intValueEClass, INT_VALUE__VALUE);

    loopStatementEClass = createEClass(LOOP_STATEMENT);
    createEReference(loopStatementEClass, LOOP_STATEMENT__COUNT);
    createEReference(loopStatementEClass, LOOP_STATEMENT__STATEMENTS);

    expressionEClass = createEClass(EXPRESSION);

    numVarExpressionEClass = createEClass(NUM_VAR_EXPRESSION);
    createEReference(numVarExpressionEClass, NUM_VAR_EXPRESSION__VAR);

    stringVarExpressionEClass = createEClass(STRING_VAR_EXPRESSION);
    createEReference(stringVarExpressionEClass, STRING_VAR_EXPRESSION__VAR);

    additionEClass = createEClass(ADDITION);
    createEReference(additionEClass, ADDITION__LEFT);
    createEAttribute(additionEClass, ADDITION__OPERATOR);
    createEReference(additionEClass, ADDITION__RIGHT);

    multiplicationEClass = createEClass(MULTIPLICATION);
    createEReference(multiplicationEClass, MULTIPLICATION__LEFT);
    createEAttribute(multiplicationEClass, MULTIPLICATION__OPERATOR);
    createEReference(multiplicationEClass, MULTIPLICATION__RIGHT);

    // Create enums
    strategyDefEEnum = createEEnum(STRATEGY_DEF);
    timeFrameDefEEnum = createEEnum(TIME_FRAME_DEF);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    connectStatementEClass.getESuperTypes().add(this.getStatement());
    createBotStatementEClass.getESuperTypes().add(this.getStatement());
    listBotsStatementEClass.getESuperTypes().add(this.getStatement());
    executeBotsStatementEClass.getESuperTypes().add(this.getStatement());
    variableDeclarationEClass.getESuperTypes().add(this.getStatement());
    stringValueEClass.getESuperTypes().add(this.getExpression());
    realValueEClass.getESuperTypes().add(this.getExpression());
    intValueEClass.getESuperTypes().add(this.getExpression());
    loopStatementEClass.getESuperTypes().add(this.getStatement());
    numVarExpressionEClass.getESuperTypes().add(this.getExpression());
    stringVarExpressionEClass.getESuperTypes().add(this.getExpression());
    additionEClass.getESuperTypes().add(this.getExpression());
    multiplicationEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(traderProgramEClass, TraderProgram.class, "TraderProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTraderProgram_Statements(), this.getStatement(), null, "statements", null, 0, -1, TraderProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(connectStatementEClass, ConnectStatement.class, "ConnectStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConnectStatement_TickerName(), this.getExpression(), null, "tickerName", null, 0, 1, ConnectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnectStatement_BrokerName(), this.getExpression(), null, "brokerName", null, 0, 1, ConnectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnectStatement_Username(), this.getExpression(), null, "username", null, 0, 1, ConnectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnectStatement_Password(), this.getExpression(), null, "password", null, 0, 1, ConnectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConnectStatement_Timeframe(), this.getTimeFrameDef(), "timeframe", null, 0, 1, ConnectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createBotStatementEClass, CreateBotStatement.class, "CreateBotStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateBotStatement_Strategy(), this.getStrategyDef(), "strategy", null, 0, 1, CreateBotStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateBotStatement_LotSize(), this.getExpression(), null, "lotSize", null, 0, 1, CreateBotStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listBotsStatementEClass, ListBotsStatement.class, "ListBotsStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getListBotsStatement_ListCommand(), ecorePackage.getEString(), "listCommand", null, 0, 1, ListBotsStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(executeBotsStatementEClass, ExecuteBotsStatement.class, "ExecuteBotsStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExecuteBotsStatement_Days(), this.getExpression(), null, "days", null, 0, 1, ExecuteBotsStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecuteBotsStatement_Hours(), this.getExpression(), null, "hours", null, 0, 1, ExecuteBotsStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecuteBotsStatement_Minutes(), this.getExpression(), null, "minutes", null, 0, 1, ExecuteBotsStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecuteBotsStatement_Seconds(), this.getExpression(), null, "seconds", null, 0, 1, ExecuteBotsStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDeclaration_Value(), this.getExpression(), null, "value", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realValueEClass, RealValue.class, "RealValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRealValue_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, RealValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intValueEClass, IntValue.class, "IntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loopStatementEClass, LoopStatement.class, "LoopStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLoopStatement_Count(), this.getExpression(), null, "count", null, 0, 1, LoopStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoopStatement_Statements(), this.getStatement(), null, "statements", null, 0, -1, LoopStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numVarExpressionEClass, NumVarExpression.class, "NumVarExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumVarExpression_Var(), this.getVariableDeclaration(), null, "var", null, 0, 1, NumVarExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringVarExpressionEClass, StringVarExpression.class, "StringVarExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringVarExpression_Var(), this.getVariableDeclaration(), null, "var", null, 0, 1, StringVarExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(additionEClass, Addition.class, "Addition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAddition_Left(), this.getExpression(), null, "left", null, 0, 1, Addition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddition_Operator(), ecorePackage.getEString(), "operator", null, 0, -1, Addition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAddition_Right(), this.getExpression(), null, "right", null, 0, -1, Addition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiplication_Left(), this.getExpression(), null, "left", null, 0, 1, Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiplication_Operator(), ecorePackage.getEString(), "operator", null, 0, -1, Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplication_Right(), this.getExpression(), null, "right", null, 0, -1, Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(strategyDefEEnum, StrategyDef.class, "StrategyDef");
    addEEnumLiteral(strategyDefEEnum, StrategyDef.SIMPLE_STRATEGY_A);
    addEEnumLiteral(strategyDefEEnum, StrategyDef.MACHINE_LEARNING_STRATEGY_A);

    initEEnum(timeFrameDefEEnum, TimeFrameDef.class, "TimeFrameDef");
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.M1);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.M2);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.M3);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.M4);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.M5);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.M6);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.M10);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.M12);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.M20);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.M30);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.H1);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.H2);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.H3);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.H4);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.H6);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.H8);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.H12);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.D1);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.W1);
    addEEnumLiteral(timeFrameDefEEnum, TimeFrameDef.MN1);

    // Create resource
    createResource(eNS_URI);
  }

} //TraderPackageImpl
