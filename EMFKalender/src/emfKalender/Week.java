/**
 */
package emfKalender;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Week</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfKalender.Week#getDays <em>Days</em>}</li>
 *   <li>{@link emfKalender.Week#getWeekNumber <em>Week Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfKalender.EmfKalenderPackage#getWeek()
 * @model
 * @generated
 */
public interface Week extends EObject {
	/**
	 * Returns the value of the '<em><b>Days</b></em>' containment reference list.
	 * The list contents are of type {@link emfKalender.Day}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Days</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Days</em>' containment reference list.
	 * @see emfKalender.EmfKalenderPackage#getWeek_Days()
	 * @model containment="true" upper="31"
	 * @generated
	 */
	EList<Day> getDays();

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
	 * @see emfKalender.EmfKalenderPackage#getWeek_WeekNumber()
	 * @model
	 * @generated
	 */
	Integer getWeekNumber();

	/**
	 * Sets the value of the '{@link emfKalender.Week#getWeekNumber <em>Week Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Week Number</em>' attribute.
	 * @see #getWeekNumber()
	 * @generated
	 */
	void setWeekNumber(Integer value);

} // Week
