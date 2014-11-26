/**
 */
package emfKalender.impl;

import emfKalender.Day;
import emfKalender.EmfKalenderPackage;
import emfKalender.Week;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Week</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emfKalender.impl.WeekImpl#getDays <em>Days</em>}</li>
 *   <li>{@link emfKalender.impl.WeekImpl#getWeekNumber <em>Week Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeekImpl extends MinimalEObjectImpl.Container implements Week {
	/**
	 * The cached value of the '{@link #getDays() <em>Days</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDays()
	 * @generated
	 * @ordered
	 */
	protected EList<Day> days;

	/**
	 * The default value of the '{@link #getWeekNumber() <em>Week Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WEEK_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeekNumber() <em>Week Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer weekNumber = WEEK_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeekImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfKalenderPackage.Literals.WEEK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Day> getDays() {
		if (days == null) {
			days = new EObjectContainmentEList<Day>(Day.class, this, EmfKalenderPackage.WEEK__DAYS);
		}
		return days;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getWeekNumber() {
		return weekNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeekNumber(Integer newWeekNumber) {
		Integer oldWeekNumber = weekNumber;
		weekNumber = newWeekNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfKalenderPackage.WEEK__WEEK_NUMBER, oldWeekNumber, weekNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfKalenderPackage.WEEK__DAYS:
				return ((InternalEList<?>)getDays()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfKalenderPackage.WEEK__DAYS:
				return getDays();
			case EmfKalenderPackage.WEEK__WEEK_NUMBER:
				return getWeekNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmfKalenderPackage.WEEK__DAYS:
				getDays().clear();
				getDays().addAll((Collection<? extends Day>)newValue);
				return;
			case EmfKalenderPackage.WEEK__WEEK_NUMBER:
				setWeekNumber((Integer)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmfKalenderPackage.WEEK__DAYS:
				getDays().clear();
				return;
			case EmfKalenderPackage.WEEK__WEEK_NUMBER:
				setWeekNumber(WEEK_NUMBER_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmfKalenderPackage.WEEK__DAYS:
				return days != null && !days.isEmpty();
			case EmfKalenderPackage.WEEK__WEEK_NUMBER:
				return WEEK_NUMBER_EDEFAULT == null ? weekNumber != null : !WEEK_NUMBER_EDEFAULT.equals(weekNumber);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (weekNumber: ");
		result.append(weekNumber);
		result.append(')');
		return result.toString();
	}

} //WeekImpl
