/**
 * generated by Xtext 2.33.0
 */
package uk.ac.kcl.inf.trader.trader;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.Execute#getBots <em>Bots</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getExecute()
 * @model
 * @generated
 */
public interface Execute extends Statement
{
  /**
   * Returns the value of the '<em><b>Bots</b></em>' reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.trader.trader.TradingBot}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bots</em>' reference list.
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getExecute_Bots()
   * @model
   * @generated
   */
  EList<TradingBot> getBots();

} // Execute
