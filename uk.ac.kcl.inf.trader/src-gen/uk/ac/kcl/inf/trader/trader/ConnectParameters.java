/**
 * generated by Xtext 2.33.0
 */
package uk.ac.kcl.inf.trader.trader;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connect Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.ConnectParameters#getUsername <em>Username</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.ConnectParameters#getPassword <em>Password</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.ConnectParameters#getLeverage <em>Leverage</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.ConnectParameters#getMoney <em>Money</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.ConnectParameters#getTimeframe <em>Timeframe</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getConnectParameters()
 * @model
 * @generated
 */
public interface ConnectParameters extends EObject
{
  /**
   * Returns the value of the '<em><b>Username</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Username</em>' attribute.
   * @see #setUsername(String)
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getConnectParameters_Username()
   * @model
   * @generated
   */
  String getUsername();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.trader.trader.ConnectParameters#getUsername <em>Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Username</em>' attribute.
   * @see #getUsername()
   * @generated
   */
  void setUsername(String value);

  /**
   * Returns the value of the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Password</em>' attribute.
   * @see #setPassword(String)
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getConnectParameters_Password()
   * @model
   * @generated
   */
  String getPassword();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.trader.trader.ConnectParameters#getPassword <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Password</em>' attribute.
   * @see #getPassword()
   * @generated
   */
  void setPassword(String value);

  /**
   * Returns the value of the '<em><b>Leverage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Leverage</em>' attribute.
   * @see #setLeverage(float)
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getConnectParameters_Leverage()
   * @model
   * @generated
   */
  float getLeverage();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.trader.trader.ConnectParameters#getLeverage <em>Leverage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Leverage</em>' attribute.
   * @see #getLeverage()
   * @generated
   */
  void setLeverage(float value);

  /**
   * Returns the value of the '<em><b>Money</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Money</em>' attribute.
   * @see #setMoney(float)
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getConnectParameters_Money()
   * @model
   * @generated
   */
  float getMoney();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.trader.trader.ConnectParameters#getMoney <em>Money</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Money</em>' attribute.
   * @see #getMoney()
   * @generated
   */
  void setMoney(float value);

  /**
   * Returns the value of the '<em><b>Timeframe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeframe</em>' attribute.
   * @see #setTimeframe(String)
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getConnectParameters_Timeframe()
   * @model
   * @generated
   */
  String getTimeframe();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.trader.trader.ConnectParameters#getTimeframe <em>Timeframe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeframe</em>' attribute.
   * @see #getTimeframe()
   * @generated
   */
  void setTimeframe(String value);

} // ConnectParameters
