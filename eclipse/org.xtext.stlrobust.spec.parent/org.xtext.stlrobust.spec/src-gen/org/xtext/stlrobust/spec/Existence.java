/**
 * generated by Xtext 2.37.0
 */
package org.xtext.stlrobust.spec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Existence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.stlrobust.spec.Existence#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.xtext.stlrobust.spec.SpecPackage#getExistence()
 * @model
 * @generated
 */
public interface Existence extends Pattern
{
  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference.
   * @see #setTime(Time)
   * @see org.xtext.stlrobust.spec.SpecPackage#getExistence_Time()
   * @model containment="true"
   * @generated
   */
  Time getTime();

  /**
   * Sets the value of the '{@link org.xtext.stlrobust.spec.Existence#getTime <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' containment reference.
   * @see #getTime()
   * @generated
   */
  void setTime(Time value);

} // Existence
