/**
 */
package emfKalender2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Month</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfKalender2.Month#getDays <em>Days</em>}</li>
 *   <li>{@link emfKalender2.Month#getMonth <em>Month</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfKalender2.EmfKalender2Package#getMonth()
 * @model
 * @generated
 */
public interface Month extends EObject {
	/**
	 * Returns the value of the '<em><b>Days</b></em>' containment reference list.
	 * The list contents are of type {@link emfKalender2.Day}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Days</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Days</em>' containment reference list.
	 * @see emfKalender2.EmfKalender2Package#getMonth_Days()
	 * @model containment="true" upper="31"
	 * @generated
	 */
	EList<Day> getDays();

	/**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * The literals are from the enumeration {@link emfKalender2.MonthEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see emfKalender2.MonthEnum
	 * @see #setMonth(MonthEnum)
	 * @see emfKalender2.EmfKalender2Package#getMonth_Month()
	 * @model
	 * @generated
	 */
	MonthEnum getMonth();

	/**
	 * Sets the value of the '{@link emfKalender2.Month#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see emfKalender2.MonthEnum
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(MonthEnum value);

} // Month
