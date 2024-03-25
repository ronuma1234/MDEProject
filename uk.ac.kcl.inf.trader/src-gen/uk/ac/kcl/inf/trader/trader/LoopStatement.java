/**
 * generated by Xtext 2.34.0
 */
package uk.ac.kcl.inf.trader.trader;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.LoopStatement#getCount <em>Count</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.LoopStatement#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getLoopStatement()
 * @model
 * @generated
 */
public interface LoopStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Count</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Count</em>' containment reference.
   * @see #setCount(Expression)
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getLoopStatement_Count()
   * @model containment="true"
   * @generated
   */
  Expression getCount();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.trader.trader.LoopStatement#getCount <em>Count</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' containment reference.
   * @see #getCount()
   * @generated
   */
  void setCount(Expression value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.trader.trader.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getLoopStatement_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // LoopStatement
