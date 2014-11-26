/**
 */
package emfKalender2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfKalender2.Day#getDayNumber <em>Day Number</em>}</li>
 *   <li>{@link emfKalender2.Day#getWeekDay <em>Week Day</em>}</li>
 *   <li>{@link emfKalender2.Day#getWeekNumber <em>Week Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfKalender2.EmfKalender2Package#getDay()
 * @model
 * @generated
 */
public interface Day extends EObject {
	/**
	 * Returns the value of the '<em><b>Day Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Number</em>' attribute.
	 * @see #setDayNumber(Integer)
	 * @see emfKalender2.EmfKalender2Package#getDay_DayNumber()
	 * @model
	 * @generated
	 */
	Integer getDayNumber();

	/**
	 * Sets the value of the '{@link emfKalender2.Day#getDayNumber <em>Day Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Number</em>' attribute.
	 * @see #getDayNumber()
	 * @generated
	 */
	void setDayNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Week Day</b></em>' attribute.
	 * The literals are from the enumeration {@link emfKalender2.WeekDayEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Week Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Week Day</em>' attribute.
	 * @see emfKalender2.WeekDayEnum
	 * @see #setWeekDay(WeekDayEnum)
	 * @see emfKalender2.EmfKalender2Package#getDay_WeekDay()
	 * @model
	 * @generated
	 */
	WeekDayEnum getWeekDay();

	/**
	 * Sets the value of the '{@link emfKalender2.Day#getWeekDay <em>Week Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Week Day</em>' attribute.
	 * @see emfKalender2.WeekDayEnum
	 * @see #getWeekDay()
	 * @generated
	 */
	void setWeekDay(WeekDayEnum value);

	/**
	 * Returns the value of the '<em><b>Week Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Week Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Week Number</em>' attribute.
	 * @see #setWeekNumber(Integer)
	 * @see emfKalender2.EmfKalender2Package#getDay_WeekNumber()
	 * @model
	 * @generated
	 */
	Integer getWeekNumber();

	/**
	 * Sets the value of the '{@link emfKalender2.Day#getWeekNumber <em>Week Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Week Number</em>' attribute.
	 * @see #getWeekNumber()
	 * @generated
	 */
	void setWeekNumber(Integer value);

} // Day
