/**
 * generated by Xtext 2.34.0
 */
package uk.ac.kcl.inf.trader.trader;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.Addition#getLeft <em>Left</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.Addition#getOperator <em>Operator</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.Addition#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getAddition()
 * @model
 * @generated
 */
public interface Addition extends NumExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(NumExpression)
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getAddition_Left()
   * @model containment="true"
   * @generated
   */
  NumExpression getLeft();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.trader.trader.Addition#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(NumExpression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute list.
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getAddition_Operator()
   * @model unique="false"
   * @generated
   */
  EList<String> getOperator();

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.trader.trader.NumExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getAddition_Right()
   * @model containment="true"
   * @generated
   */
  EList<NumExpression> getRight();

} // Addition
