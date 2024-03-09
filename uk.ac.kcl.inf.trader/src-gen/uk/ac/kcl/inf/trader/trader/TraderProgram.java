/**
 * generated by Xtext 2.33.0
 */
package uk.ac.kcl.inf.trader.trader;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.TraderProgram#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getTraderProgram()
 * @model
 * @generated
 */
public interface TraderProgram extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.trader.trader.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getTraderProgram_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // TraderProgram