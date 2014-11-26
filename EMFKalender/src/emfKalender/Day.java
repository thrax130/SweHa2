/**
 */
package emfKalender;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfKalender.Day#getDayNumber <em>Day Number</em>}</li>
 *   <li>{@link emfKalender.Day#getMonth <em>Month</em>}</li>
 *   <li>{@link emfKalender.Day#getWeekDay <em>Week Day</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfKalender.EmfKalenderPackage#getDay()
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
	 * @see emfKalender.EmfKalenderPackage#getDay_DayNumber()
	 * @model
	 * @generated
	 */
	Integer getDayNumber();

	/**
	 * Sets the value of the '{@link emfKalender.Day#getDayNumber <em>Day Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Number</em>' attribute.
	 * @see #getDayNumber()
	 * @generated
	 */
	void setDayNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * The literals are from the enumeration {@link emfKalender.MonthEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see emfKalender.MonthEnum
	 * @see #setMonth(MonthEnum)
	 * @see emfKalender.EmfKalenderPackage#getDay_Month()
	 * @model
	 * @generated
	 */
	MonthEnum getMonth();

	/**
	 * Sets the value of the '{@link emfKalender.Day#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see emfKalender.MonthEnum
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(MonthEnum value);

	/**
	 * Returns the value of the '<em><b>Week Day</b></em>' attribute.
	 * The literals are from the enumeration {@link emfKalender.WeekDayEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Week Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Week Day</em>' attribute.
	 * @see emfKalender.WeekDayEnum
	 * @see #setWeekDay(WeekDayEnum)
	 * @see emfKalender.EmfKalenderPackage#getDay_WeekDay()
	 * @model
	 * @generated
	 */
	WeekDayEnum getWeekDay();

	/**
	 * Sets the value of the '{@link emfKalender.Day#getWeekDay <em>Week Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Week Day</em>' attribute.
	 * @see emfKalender.WeekDayEnum
	 * @see #getWeekDay()
	 * @generated
	 */
	void setWeekDay(WeekDayEnum value);

} // Day
