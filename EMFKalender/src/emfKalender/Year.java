/**
 */
package emfKalender;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfKalender.Year#getDate <em>Date</em>}</li>
 *   <li>{@link emfKalender.Year#getWeeks <em>Weeks</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfKalender.EmfKalenderPackage#getYear()
 * @model
 * @generated
 */
public interface Year extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Integer)
	 * @see emfKalender.EmfKalenderPackage#getYear_Date()
	 * @model
	 * @generated
	 */
	Integer getDate();

	/**
	 * Sets the value of the '{@link emfKalender.Year#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Integer value);

	/**
	 * Returns the value of the '<em><b>Weeks</b></em>' containment reference list.
	 * The list contents are of type {@link emfKalender.Week}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weeks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weeks</em>' containment reference list.
	 * @see emfKalender.EmfKalenderPackage#getYear_Weeks()
	 * @model containment="true" upper="52"
	 * @generated
	 */
	EList<Week> getWeeks();

} // Year
