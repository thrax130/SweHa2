/**
 */
package emfKalender.impl;

import emfKalender.Day;
import emfKalender.EmfKalenderPackage;
import emfKalender.MonthEnum;
import emfKalender.WeekDayEnum;
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
 *   <li>{@link emfKalender.impl.DayImpl#getDayNumber <em>Day Number</em>}</li>
 *   <li>{@link emfKalender.impl.DayImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link emfKalender.impl.DayImpl#getWeekDay <em>Week Day</em>}</li>
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
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final MonthEnum MONTH_EDEFAULT = MonthEnum.JANUAR;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected MonthEnum month = MONTH_EDEFAULT;

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
		return EmfKalenderPackage.Literals.DAY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmfKalenderPackage.DAY__DAY_NUMBER, oldDayNumber, dayNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthEnum getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(MonthEnum newMonth) {
		MonthEnum oldMonth = month;
		month = newMonth == null ? MONTH_EDEFAULT : newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfKalenderPackage.DAY__MONTH, oldMonth, month));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmfKalenderPackage.DAY__WEEK_DAY, oldWeekDay, weekDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfKalenderPackage.DAY__DAY_NUMBER:
				return getDayNumber();
			case EmfKalenderPackage.DAY__MONTH:
				return getMonth();
			case EmfKalenderPackage.DAY__WEEK_DAY:
				return getWeekDay();
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
			case EmfKalenderPackage.DAY__DAY_NUMBER:
				setDayNumber((Integer)newValue);
				return;
			case EmfKalenderPackage.DAY__MONTH:
				setMonth((MonthEnum)newValue);
				return;
			case EmfKalenderPackage.DAY__WEEK_DAY:
				setWeekDay((WeekDayEnum)newValue);
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
			case EmfKalenderPackage.DAY__DAY_NUMBER:
				setDayNumber(DAY_NUMBER_EDEFAULT);
				return;
			case EmfKalenderPackage.DAY__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case EmfKalenderPackage.DAY__WEEK_DAY:
				setWeekDay(WEEK_DAY_EDEFAULT);
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
			case EmfKalenderPackage.DAY__DAY_NUMBER:
				return DAY_NUMBER_EDEFAULT == null ? dayNumber != null : !DAY_NUMBER_EDEFAULT.equals(dayNumber);
			case EmfKalenderPackage.DAY__MONTH:
				return month != MONTH_EDEFAULT;
			case EmfKalenderPackage.DAY__WEEK_DAY:
				return weekDay != WEEK_DAY_EDEFAULT;
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
		result.append(", month: ");
		result.append(month);
		result.append(", weekDay: ");
		result.append(weekDay);
		result.append(')');
		return result.toString();
	}

} //DayImpl
