/**
 */
package emfKalender.impl;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import emfKalender.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfKalenderFactoryImpl extends EFactoryImpl implements EmfKalenderFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EmfKalenderFactory init() {
		try {
			EmfKalenderFactory theEmfKalenderFactory = (EmfKalenderFactory)EPackage.Registry.INSTANCE.getEFactory(EmfKalenderPackage.eNS_URI);
			if (theEmfKalenderFactory != null) {
				return theEmfKalenderFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmfKalenderFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfKalenderFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EmfKalenderPackage.YEAR: return createYear();
			case EmfKalenderPackage.WEEK: return createWeek();
			case EmfKalenderPackage.DAY: return createDay();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EmfKalenderPackage.WEEK_DAY_ENUM:
				return createWeekDayEnumFromString(eDataType, initialValue);
			case EmfKalenderPackage.MONTH_ENUM:
				return createMonthEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EmfKalenderPackage.WEEK_DAY_ENUM:
				return convertWeekDayEnumToString(eDataType, instanceValue);
			case EmfKalenderPackage.MONTH_ENUM:
				return convertMonthEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year createYear() {
		YearImpl year = new YearImpl();
		return year;
	}
	/**
	 * Automatically creates model for given year
	 * @param year - create model for year 
	 */
	public Year createYear(Integer year) {
		Year y = createYear();
		y.setDate(year);
		
		int weekCounter = 0;
		LocalDate local = LocalDate.of(year, 1, 1); //start with 01.01.YYYY
		
		while(local.getYear() < (year+1)) { //while not in new year
			weekCounter +=1;
			Week w = createWeek();
			w.setWeekNumber(weekCounter);
			for(int i = local.getDayOfWeek().getValue(); i <= DayOfWeek.SUNDAY.getValue(); i++) {
				Day d = createDay(local.getDayOfMonth(),MonthEnum.get(local.getMonthValue()),WeekDayEnum.get(i));
				w.getDays().add(d);
				local = local.plusDays(1);
				if(local.getYear() != year) { //don't add days of next year
					break;
				}
			}
			y.getWeeks().add(w);
		}
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Week createWeek() {
		WeekImpl week = new WeekImpl();
		return week;
	}
	
	public Week createWeek(Integer weekNumber, List<Day> days) {
		Week week = createWeek();
		week.setWeekNumber(weekNumber);
		week.getDays().addAll(days);
		return week;
	}
	public Week createWeek(LocalDate date) {
		Week week= createWeek();
		
		return week;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Day createDay() {
		DayImpl day = new DayImpl();
		return day;
	}
	
	public Day createDay(Integer dayNumber, MonthEnum month, WeekDayEnum weekDay) {
		Day day = createDay();
		day.setDayNumber(dayNumber);
		day.setMonth(month);
		day.setWeekDay(weekDay);
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekDayEnum createWeekDayEnumFromString(EDataType eDataType, String initialValue) {
		WeekDayEnum result = WeekDayEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeekDayEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthEnum createMonthEnumFromString(EDataType eDataType, String initialValue) {
		MonthEnum result = MonthEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonthEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfKalenderPackage getEmfKalenderPackage() {
		return (EmfKalenderPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmfKalenderPackage getPackage() {
		return EmfKalenderPackage.eINSTANCE;
	}

} //EmfKalenderFactoryImpl
