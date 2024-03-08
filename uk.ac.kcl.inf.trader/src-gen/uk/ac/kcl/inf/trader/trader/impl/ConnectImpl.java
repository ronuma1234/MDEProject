/**
 * generated by Xtext 2.33.0
 */
package uk.ac.kcl.inf.trader.trader.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.trader.trader.Connect;
import uk.ac.kcl.inf.trader.trader.ConnectParameters;
import uk.ac.kcl.inf.trader.trader.TraderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.impl.ConnectImpl#getBrokerName <em>Broker Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.trader.trader.impl.ConnectImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectImpl extends StatementImpl implements Connect
{
  /**
   * The default value of the '{@link #getBrokerName() <em>Broker Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBrokerName()
   * @generated
   * @ordered
   */
  protected static final String BROKER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBrokerName() <em>Broker Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBrokerName()
   * @generated
   * @ordered
   */
  protected String brokerName = BROKER_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected ConnectParameters parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectImpl()
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
    return TraderPackage.Literals.CONNECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBrokerName()
  {
    return brokerName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBrokerName(String newBrokerName)
  {
    String oldBrokerName = brokerName;
    brokerName = newBrokerName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TraderPackage.CONNECT__BROKER_NAME, oldBrokerName, brokerName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConnectParameters getParameters()
  {
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameters(ConnectParameters newParameters, NotificationChain msgs)
  {
    ConnectParameters oldParameters = parameters;
    parameters = newParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TraderPackage.CONNECT__PARAMETERS, oldParameters, newParameters);
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
  public void setParameters(ConnectParameters newParameters)
  {
    if (newParameters != parameters)
    {
      NotificationChain msgs = null;
      if (parameters != null)
        msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TraderPackage.CONNECT__PARAMETERS, null, msgs);
      if (newParameters != null)
        msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TraderPackage.CONNECT__PARAMETERS, null, msgs);
      msgs = basicSetParameters(newParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TraderPackage.CONNECT__PARAMETERS, newParameters, newParameters));
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
      case TraderPackage.CONNECT__PARAMETERS:
        return basicSetParameters(null, msgs);
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
      case TraderPackage.CONNECT__BROKER_NAME:
        return getBrokerName();
      case TraderPackage.CONNECT__PARAMETERS:
        return getParameters();
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
      case TraderPackage.CONNECT__BROKER_NAME:
        setBrokerName((String)newValue);
        return;
      case TraderPackage.CONNECT__PARAMETERS:
        setParameters((ConnectParameters)newValue);
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
      case TraderPackage.CONNECT__BROKER_NAME:
        setBrokerName(BROKER_NAME_EDEFAULT);
        return;
      case TraderPackage.CONNECT__PARAMETERS:
        setParameters((ConnectParameters)null);
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
      case TraderPackage.CONNECT__BROKER_NAME:
        return BROKER_NAME_EDEFAULT == null ? brokerName != null : !BROKER_NAME_EDEFAULT.equals(brokerName);
      case TraderPackage.CONNECT__PARAMETERS:
        return parameters != null;
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
    result.append(" (brokerName: ");
    result.append(brokerName);
    result.append(')');
    return result.toString();
  }

} //ConnectImpl
