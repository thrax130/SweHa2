/**
 */
package emfKalender2.impl;

import emfKalender2.Day;
import emfKalender2.EmfKalender2Package;
import emfKalender2.WeekDayEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Day</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emfKalender2.impl.DayImpl#getDayNumber <em>Day Number</em>}</li>
 *   <li>{@link emfKalender2.impl.DayImpl#getWeekDay <em>Week Day</em>}</li>
 *   <li>{@link emfKalender2.impl.DayImpl#getWeekNumber <em>Week Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DayImpl extends MinimalEObjectImpl.Container implements Day {
	/**
	 * The default value of the '{@link #getDayNumber() <em>Day Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DAY_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDayNumber() <em>Day Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer dayNumber = DAY_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeekDay() <em>Week Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekDay()
	 * @generated
	 * @ordered
	 */
	protected static final WeekDayEnum WEEK_DAY_EDEFAULT = WeekDayEnum.MONDAY;

	/**
	 * The cached value of the '{@link #getWeekDay() <em>Week Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekDay()
	 * @generated
	 * @ordered
	 */
	protected WeekDayEnum weekDay = WEEK_DAY_EDEFAULT;

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
	protected DayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfKalender2Package.Literals.DAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDayNumber() {
		return dayNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayNumber(Integer newDayNumber) {
		Integer oldDayNumber = dayNumber;
		dayNumber = newDayNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfKalender2Package.DAY__DAY_NUMBER, oldDayNumber, dayNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekDayEnum getWeekDay() {
		return weekDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeekDay(WeekDayEnum newWeekDay) {
		WeekDayEnum oldWeekDay = weekDay;
		weekDay = newWeekDay == null ? WEEK_DAY_EDEFAULT : newWeekDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfKalender2Package.DAY__WEEK_DAY, oldWeekDay, weekDay));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmfKalender2Package.DAY__WEEK_NUMBER, oldWeekNumber, weekNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfKalender2Package.DAY__DAY_NUMBER:
				return getDayNumber();
			case EmfKalender2Package.DAY__WEEK_DAY:
				return getWeekDay();
			case EmfKalender2Package.DAY__WEEK_NUMBER:
				return getWeekNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmfKalender2Package.DAY__DAY_NUMBER:
				setDayNumber((Integer)newValue);
				return;
			case EmfKalender2Package.DAY__WEEK_DAY:
				setWeekDay((WeekDayEnum)newValue);
				return;
			case EmfKalender2Package.DAY__WEEK_NUMBER:
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
			case EmfKalender2Package.DAY__DAY_NUMBER:
				setDayNumber(DAY_NUMBER_EDEFAULT);
				return;
			case EmfKalender2Package.DAY__WEEK_DAY:
				setWeekDay(WEEK_DAY_EDEFAULT);
				return;
			case EmfKalender2Package.DAY__WEEK_NUMBER:
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
			case EmfKalender2Package.DAY__DAY_NUMBER:
				return DAY_NUMBER_EDEFAULT == null ? dayNumber != null : !DAY_NUMBER_EDEFAULT.equals(dayNumber);
			case EmfKalender2Package.DAY__WEEK_DAY:
				return weekDay != WEEK_DAY_EDEFAULT;
			case EmfKalender2Package.DAY__WEEK_NUMBER:
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
		result.append(" (dayNumber: ");
		result.append(dayNumber);
		result.append(", weekDay: ");
		result.append(weekDay);
		result.append(", weekNumber: ");
		result.append(weekNumber);
		result.append(')');
		return result.toString();
	}

} //DayImpl
