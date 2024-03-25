/**
 * generated by Xtext 2.34.0
 */
package uk.ac.kcl.inf.trader.trader;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connect Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.ConnectStatement#getBrokerName <em>Broker Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.ConnectStatement#getUsername <em>Username</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.ConnectStatement#getPassword <em>Password</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.ConnectStatement#getLeverage <em>Leverage</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.ConnectStatement#getMoney <em>Money</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.ConnectStatement#getTimeframe <em>Timeframe</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getConnectStatement()
 * @model
 * @generated
 */
public interface ConnectStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Broker Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Broker Name</em>' attribute.
   * @see #setBrokerName(String)
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getConnectStatement_BrokerName()
   * @model
   * @generated
   */
  String getBrokerName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.trader.trader.ConnectStatement#getBrokerName <em>Broker Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Broker Name</em>' attribute.
   * @see #getBrokerName()
   * @generated
   */
  void setBrokerName(String value);

  /**
   * Returns the value of the '<em><b>Username</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Username</em>' containment reference.
   * @see #setUsername(Expression)
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getConnectStatement_Username()
   * @model containment="true"
   * @generated
   */
  Expression getUsername();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.trader.trader.ConnectStatement#getUsername <em>Username</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Username</em>' containment reference.
   * @see #getUsername()
   * @generated
   */
  void setUsername(Expression value);

  /**
   * Returns the value of the '<em><b>Password</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Password</em>' containment reference.
   * @see #setPassword(Expression)
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getConnectStatement_Password()
   * @model containment="true"
   * @generated
   */
  Expression getPassword();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.trader.trader.ConnectStatement#getPassword <em>Password</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Password</em>' containment reference.
   * @see #getPassword()
   * @generated
   */
  void setPassword(Expression value);

  /**
   * Returns the value of the '<em><b>Leverage</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Leverage</em>' containment reference.
   * @see #setLeverage(Expression)
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getConnectStatement_Leverage()
   * @model containment="true"
   * @generated
   */
  Expression getLeverage();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.trader.trader.ConnectStatement#getLeverage <em>Leverage</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Leverage</em>' containment reference.
   * @see #getLeverage()
   * @generated
   */
  void setLeverage(Expression value);

  /**
   * Returns the value of the '<em><b>Money</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Money</em>' containment reference.
   * @see #setMoney(Expression)
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getConnectStatement_Money()
   * @model containment="true"
   * @generated
   */
  Expression getMoney();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.trader.trader.ConnectStatement#getMoney <em>Money</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Money</em>' containment reference.
   * @see #getMoney()
   * @generated
   */
  void setMoney(Expression value);

  /**
   * Returns the value of the '<em><b>Timeframe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeframe</em>' containment reference.
   * @see #setTimeframe(Expression)
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getConnectStatement_Timeframe()
   * @model containment="true"
   * @generated
   */
  Expression getTimeframe();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.trader.trader.ConnectStatement#getTimeframe <em>Timeframe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeframe</em>' containment reference.
   * @see #getTimeframe()
   * @generated
   */
  void setTimeframe(Expression value);

} // ConnectStatement
