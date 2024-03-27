/**
 * generated by Xtext 2.34.0
 */
package uk.ac.kcl.inf.trader.trader.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.trader.trader.ExecuteBotsStatement;
import uk.ac.kcl.inf.trader.trader.Expression;
import uk.ac.kcl.inf.trader.trader.TraderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execute Bots Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.impl.ExecuteBotsStatementImpl#getDays <em>Days</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.impl.ExecuteBotsStatementImpl#getHours <em>Hours</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.impl.ExecuteBotsStatementImpl#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.impl.ExecuteBotsStatementImpl#getSeconds <em>Seconds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecuteBotsStatementImpl extends StatementImpl implements ExecuteBotsStatement
{
  /**
   * The cached value of the '{@link #getDays() <em>Days</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDays()
   * @generated
   * @ordered
   */
  protected Expression days;

  /**
   * The cached value of the '{@link #getHours() <em>Hours</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHours()
   * @generated
   * @ordered
   */
  protected Expression hours;

  /**
   * The cached value of the '{@link #getMinutes() <em>Minutes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinutes()
   * @generated
   * @ordered
   */
  protected Expression minutes;

  /**
   * The cached value of the '{@link #getSeconds() <em>Seconds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeconds()
   * @generated
   * @ordered
   */
  protected Expression seconds;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExecuteBotsStatementImpl()
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
    return TraderPackage.Literals.EXECUTE_BOTS_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getDays()
  {
    return days;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDays(Expression newDays, NotificationChain msgs)
  {
    Expression oldDays = days;
    days = newDays;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TraderPackage.EXECUTE_BOTS_STATEMENT__DAYS, oldDays, newDays);
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
  public void setDays(Expression newDays)
  {
    if (newDays != days)
    {
      NotificationChain msgs = null;
      if (days != null)
        msgs = ((InternalEObject)days).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TraderPackage.EXECUTE_BOTS_STATEMENT__DAYS, null, msgs);
      if (newDays != null)
        msgs = ((InternalEObject)newDays).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TraderPackage.EXECUTE_BOTS_STATEMENT__DAYS, null, msgs);
      msgs = basicSetDays(newDays, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TraderPackage.EXECUTE_BOTS_STATEMENT__DAYS, newDays, newDays));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getHours()
  {
    return hours;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHours(Expression newHours, NotificationChain msgs)
  {
    Expression oldHours = hours;
    hours = newHours;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TraderPackage.EXECUTE_BOTS_STATEMENT__HOURS, oldHours, newHours);
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
  public void setHours(Expression newHours)
  {
    if (newHours != hours)
    {
      NotificationChain msgs = null;
      if (hours != null)
        msgs = ((InternalEObject)hours).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TraderPackage.EXECUTE_BOTS_STATEMENT__HOURS, null, msgs);
      if (newHours != null)
        msgs = ((InternalEObject)newHours).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TraderPackage.EXECUTE_BOTS_STATEMENT__HOURS, null, msgs);
      msgs = basicSetHours(newHours, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TraderPackage.EXECUTE_BOTS_STATEMENT__HOURS, newHours, newHours));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getMinutes()
  {
    return minutes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMinutes(Expression newMinutes, NotificationChain msgs)
  {
    Expression oldMinutes = minutes;
    minutes = newMinutes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TraderPackage.EXECUTE_BOTS_STATEMENT__MINUTES, oldMinutes, newMinutes);
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
  public void setMinutes(Expression newMinutes)
  {
    if (newMinutes != minutes)
    {
      NotificationChain msgs = null;
      if (minutes != null)
        msgs = ((InternalEObject)minutes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TraderPackage.EXECUTE_BOTS_STATEMENT__MINUTES, null, msgs);
      if (newMinutes != null)
        msgs = ((InternalEObject)newMinutes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TraderPackage.EXECUTE_BOTS_STATEMENT__MINUTES, null, msgs);
      msgs = basicSetMinutes(newMinutes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TraderPackage.EXECUTE_BOTS_STATEMENT__MINUTES, newMinutes, newMinutes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getSeconds()
  {
    return seconds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSeconds(Expression newSeconds, NotificationChain msgs)
  {
    Expression oldSeconds = seconds;
    seconds = newSeconds;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TraderPackage.EXECUTE_BOTS_STATEMENT__SECONDS, oldSeconds, newSeconds);
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
  public void setSeconds(Expression newSeconds)
  {
    if (newSeconds != seconds)
    {
      NotificationChain msgs = null;
      if (seconds != null)
        msgs = ((InternalEObject)seconds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TraderPackage.EXECUTE_BOTS_STATEMENT__SECONDS, null, msgs);
      if (newSeconds != null)
        msgs = ((InternalEObject)newSeconds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TraderPackage.EXECUTE_BOTS_STATEMENT__SECONDS, null, msgs);
      msgs = basicSetSeconds(newSeconds, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TraderPackage.EXECUTE_BOTS_STATEMENT__SECONDS, newSeconds, newSeconds));
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
      case TraderPackage.EXECUTE_BOTS_STATEMENT__DAYS:
        return basicSetDays(null, msgs);
      case TraderPackage.EXECUTE_BOTS_STATEMENT__HOURS:
        return basicSetHours(null, msgs);
      case TraderPackage.EXECUTE_BOTS_STATEMENT__MINUTES:
        return basicSetMinutes(null, msgs);
      case TraderPackage.EXECUTE_BOTS_STATEMENT__SECONDS:
        return basicSetSeconds(null, msgs);
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
      case TraderPackage.EXECUTE_BOTS_STATEMENT__DAYS:
        return getDays();
      case TraderPackage.EXECUTE_BOTS_STATEMENT__HOURS:
        return getHours();
      case TraderPackage.EXECUTE_BOTS_STATEMENT__MINUTES:
        return getMinutes();
      case TraderPackage.EXECUTE_BOTS_STATEMENT__SECONDS:
        return getSeconds();
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
      case TraderPackage.EXECUTE_BOTS_STATEMENT__DAYS:
        setDays((Expression)newValue);
        return;
      case TraderPackage.EXECUTE_BOTS_STATEMENT__HOURS:
        setHours((Expression)newValue);
        return;
      case TraderPackage.EXECUTE_BOTS_STATEMENT__MINUTES:
        setMinutes((Expression)newValue);
        return;
      case TraderPackage.EXECUTE_BOTS_STATEMENT__SECONDS:
        setSeconds((Expression)newValue);
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
      case TraderPackage.EXECUTE_BOTS_STATEMENT__DAYS:
        setDays((Expression)null);
        return;
      case TraderPackage.EXECUTE_BOTS_STATEMENT__HOURS:
        setHours((Expression)null);
        return;
      case TraderPackage.EXECUTE_BOTS_STATEMENT__MINUTES:
        setMinutes((Expression)null);
        return;
      case TraderPackage.EXECUTE_BOTS_STATEMENT__SECONDS:
        setSeconds((Expression)null);
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
      case TraderPackage.EXECUTE_BOTS_STATEMENT__DAYS:
        return days != null;
      case TraderPackage.EXECUTE_BOTS_STATEMENT__HOURS:
        return hours != null;
      case TraderPackage.EXECUTE_BOTS_STATEMENT__MINUTES:
        return minutes != null;
      case TraderPackage.EXECUTE_BOTS_STATEMENT__SECONDS:
        return seconds != null;
    }
    return super.eIsSet(featureID);
  }

} //ExecuteBotsStatementImpl