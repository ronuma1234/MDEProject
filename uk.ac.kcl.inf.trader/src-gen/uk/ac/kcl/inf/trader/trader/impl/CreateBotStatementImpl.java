/**
 * generated by Xtext 2.34.0
 */
package uk.ac.kcl.inf.trader.trader.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.trader.trader.CreateBotStatement;
import uk.ac.kcl.inf.trader.trader.Expression;
import uk.ac.kcl.inf.trader.trader.StrategyDef;
import uk.ac.kcl.inf.trader.trader.TraderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Bot Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.impl.CreateBotStatementImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.impl.CreateBotStatementImpl#getLotSize <em>Lot Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateBotStatementImpl extends StatementImpl implements CreateBotStatement
{
  /**
   * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategy()
   * @generated
   * @ordered
   */
  protected static final StrategyDef STRATEGY_EDEFAULT = StrategyDef.SIMPLE_STRATEGY_A;

  /**
   * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategy()
   * @generated
   * @ordered
   */
  protected StrategyDef strategy = STRATEGY_EDEFAULT;

  /**
   * The cached value of the '{@link #getLotSize() <em>Lot Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLotSize()
   * @generated
   * @ordered
   */
  protected Expression lotSize;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateBotStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TraderPackage.Literals.CREATE_BOT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StrategyDef getStrategy()
  {
    return strategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStrategy(StrategyDef newStrategy)
  {
    StrategyDef oldStrategy = strategy;
    strategy = newStrategy == null ? STRATEGY_EDEFAULT : newStrategy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TraderPackage.CREATE_BOT_STATEMENT__STRATEGY, oldStrategy, strategy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getLotSize()
  {
    return lotSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLotSize(Expression newLotSize, NotificationChain msgs)
  {
    Expression oldLotSize = lotSize;
    lotSize = newLotSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TraderPackage.CREATE_BOT_STATEMENT__LOT_SIZE, oldLotSize, newLotSize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLotSize(Expression newLotSize)
  {
    if (newLotSize != lotSize)
    {
      NotificationChain msgs = null;
      if (lotSize != null)
        msgs = ((InternalEObject)lotSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TraderPackage.CREATE_BOT_STATEMENT__LOT_SIZE, null, msgs);
      if (newLotSize != null)
        msgs = ((InternalEObject)newLotSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TraderPackage.CREATE_BOT_STATEMENT__LOT_SIZE, null, msgs);
      msgs = basicSetLotSize(newLotSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TraderPackage.CREATE_BOT_STATEMENT__LOT_SIZE, newLotSize, newLotSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TraderPackage.CREATE_BOT_STATEMENT__LOT_SIZE:
        return basicSetLotSize(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TraderPackage.CREATE_BOT_STATEMENT__STRATEGY:
        return getStrategy();
      case TraderPackage.CREATE_BOT_STATEMENT__LOT_SIZE:
        return getLotSize();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TraderPackage.CREATE_BOT_STATEMENT__STRATEGY:
        setStrategy((StrategyDef)newValue);
        return;
      case TraderPackage.CREATE_BOT_STATEMENT__LOT_SIZE:
        setLotSize((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TraderPackage.CREATE_BOT_STATEMENT__STRATEGY:
        setStrategy(STRATEGY_EDEFAULT);
        return;
      case TraderPackage.CREATE_BOT_STATEMENT__LOT_SIZE:
        setLotSize((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TraderPackage.CREATE_BOT_STATEMENT__STRATEGY:
        return strategy != STRATEGY_EDEFAULT;
      case TraderPackage.CREATE_BOT_STATEMENT__LOT_SIZE:
        return lotSize != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (strategy: ");
    result.append(strategy);
    result.append(')');
    return result.toString();
  }

} //CreateBotStatementImpl
