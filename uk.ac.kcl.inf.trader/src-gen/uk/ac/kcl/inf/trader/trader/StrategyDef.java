/**
 * generated by Xtext 2.33.0
 */
package uk.ac.kcl.inf.trader.trader;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Strategy Def</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.trader.trader.TraderPackage#getStrategyDef()
 * @model
 * @generated
 */
public enum StrategyDef implements Enumerator
{
  /**
   * The '<em><b>Buy And Hold</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUY_AND_HOLD_VALUE
   * @generated
   * @ordered
   */
  BUY_AND_HOLD(0, "buyAndHold", "buyAndHold"),

  /**
   * The '<em><b>Mean Reversion</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEAN_REVERSION_VALUE
   * @generated
   * @ordered
   */
  MEAN_REVERSION(1, "meanReversion", "meanReversion");

  /**
   * The '<em><b>Buy And Hold</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUY_AND_HOLD
   * @model name="buyAndHold"
   * @generated
   * @ordered
   */
  public static final int BUY_AND_HOLD_VALUE = 0;

  /**
   * The '<em><b>Mean Reversion</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEAN_REVERSION
   * @model name="meanReversion"
   * @generated
   * @ordered
   */
  public static final int MEAN_REVERSION_VALUE = 1;

  /**
   * An array of all the '<em><b>Strategy Def</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final StrategyDef[] VALUES_ARRAY =
    new StrategyDef[]
    {
      BUY_AND_HOLD,
      MEAN_REVERSION,
    };

  /**
   * A public read-only list of all the '<em><b>Strategy Def</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<StrategyDef> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Strategy Def</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static StrategyDef get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      StrategyDef result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Strategy Def</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static StrategyDef getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      StrategyDef result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Strategy Def</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static StrategyDef get(int value)
  {
    switch (value)
    {
      case BUY_AND_HOLD_VALUE: return BUY_AND_HOLD;
      case MEAN_REVERSION_VALUE: return MEAN_REVERSION;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private StrategyDef(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //StrategyDef