/**
 */
package emfKalender2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see emfKalender2.EmfKalender2Factory
 * @model kind="package"
 * @generated
 */
public interface EmfKalender2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emfKalender2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://unibw.de/emfKalender2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emfKalender2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmfKalender2Package eINSTANCE = emfKalender2.impl.EmfKalender2PackageImpl.init();

	/**
	 * The meta object id for the '{@link emfKalender2.impl.YearImpl <em>Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emfKalender2.impl.YearImpl
	 * @see emfKalender2.impl.EmfKalender2PackageImpl#getYear()
	 * @generated
	 */
	int YEAR = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__DATE = 0;

	/**
	 * The feature id for the '<em><b>Months</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__MONTHS = 1;

	/**
	 * The number of structural features of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emfKalender2.impl.MonthImpl <em>Month</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emfKalender2.impl.MonthImpl
	 * @see emfKalender2.impl.EmfKalender2PackageImpl#getMonth()
	 * @generated
	 */
	int MONTH = 1;

	/**
	 * The feature id for the '<em><b>Days</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__DAYS = 0;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__MONTH = 1;

	/**
	 * The number of structural features of the '<em>Month</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Month</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emfKalender2.impl.DayImpl <em>Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emfKalender2.impl.DayImpl
	 * @see emfKalender2.impl.EmfKalender2PackageImpl#getDay()
	 * @generated
	 */
	int DAY = 2;

	/**
	 * The feature id for the '<em><b>Day Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__DAY_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Week Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__WEEK_DAY = 1;

	/**
	 * The feature id for the '<em><b>Week Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__WEEK_NUMBER = 2;

	/**
	 * The number of structural features of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emfKalender2.WeekDayEnum <em>Week Day Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emfKalender2.WeekDayEnum
	 * @see emfKalender2.impl.EmfKalender2PackageImpl#getWeekDayEnum()
	 * @generated
	 */
	int WEEK_DAY_ENUM = 3;

	/**
	 * The meta object id for the '{@link emfKalender2.MonthEnum <em>Month Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emfKalender2.MonthEnum
	 * @see emfKalender2.impl.EmfKalender2PackageImpl#getMonthEnum()
	 * @generated
	 */
	int MONTH_ENUM = 4;


	/**
	 * Returns the meta object for class '{@link emfKalender2.Year <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year</em>'.
	 * @see emfKalender2.Year
	 * @generated
	 */
	EClass getYear();

	/**
	 * Returns the meta object for the attribute '{@link emfKalender2.Year#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see emfKalender2.Year#getDate()
	 * @see #getYear()
	 * @generated
	 */
	EAttribute getYear_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link emfKalender2.Year#getMonths <em>Months</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Months</em>'.
	 * @see emfKalender2.Year#getMonths()
	 * @see #getYear()
	 * @generated
	 */
	EReference getYear_Months();

	/**
	 * Returns the meta object for class '{@link emfKalender2.Month <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Month</em>'.
	 * @see emfKalender2.Month
	 * @generated
	 */
	EClass getMonth();

	/**
	 * Returns the meta object for the containment reference list '{@link emfKalender2.Month#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Days</em>'.
	 * @see emfKalender2.Month#getDays()
	 * @see #getMonth()
	 * @generated
	 */
	EReference getMonth_Days();

	/**
	 * Returns the meta object for the attribute '{@link emfKalender2.Month#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see emfKalender2.Month#getMonth()
	 * @see #getMonth()
	 * @generated
	 */
	EAttribute getMonth_Month();

	/**
	 * Returns the meta object for class '{@link emfKalender2.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day</em>'.
	 * @see emfKalender2.Day
	 * @generated
	 */
	EClass getDay();

	/**
	 * Returns the meta object for the attribute '{@link emfKalender2.Day#getDayNumber <em>Day Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Number</em>'.
	 * @see emfKalender2.Day#getDayNumber()
	 * @see #getDay()
	 * @generated
	 */
	EAttribute getDay_DayNumber();

	/**
	 * Returns the meta object for the attribute '{@link emfKalender2.Day#getWeekDay <em>Week Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Week Day</em>'.
	 * @see emfKalender2.Day#getWeekDay()
	 * @see #getDay()
	 * @generated
	 */
	EAttribute getDay_WeekDay();

	/**
	 * Returns the meta object for the attribute '{@link emfKalender2.Day#getWeekNumber <em>Week Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Week Number</em>'.
	 * @see emfKalender2.Day#getWeekNumber()
	 * @see #getDay()
	 * @generated
	 */
	EAttribute getDay_WeekNumber();

	/**
	 * Returns the meta object for enum '{@link emfKalender2.WeekDayEnum <em>Week Day Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Week Day Enum</em>'.
	 * @see emfKalender2.WeekDayEnum
	 * @generated
	 */
	EEnum getWeekDayEnum();

	/**
	 * Returns the meta object for enum '{@link emfKalender2.MonthEnum <em>Month Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Month Enum</em>'.
	 * @see emfKalender2.MonthEnum
	 * @generated
	 */
	EEnum getMonthEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmfKalender2Factory getEmfKalender2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link emfKalender2.impl.YearImpl <em>Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emfKalender2.impl.YearImpl
		 * @see emfKalender2.impl.EmfKalender2PackageImpl#getYear()
		 * @generated
		 */
		EClass YEAR = eINSTANCE.getYear();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEAR__DATE = eINSTANCE.getYear_Date();

		/**
		 * The meta object literal for the '<em><b>Months</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR__MONTHS = eINSTANCE.getYear_Months();

		/**
		 * The meta object literal for the '{@link emfKalender2.impl.MonthImpl <em>Month</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emfKalender2.impl.MonthImpl
		 * @see emfKalender2.impl.EmfKalender2PackageImpl#getMonth()
		 * @generated
		 */
		EClass MONTH = eINSTANCE.getMonth();

		/**
		 * The meta object literal for the '<em><b>Days</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONTH__DAYS = eINSTANCE.getMonth_Days();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONTH__MONTH = eINSTANCE.getMonth_Month();

		/**
		 * The meta object literal for the '{@link emfKalender2.impl.DayImpl <em>Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emfKalender2.impl.DayImpl
		 * @see emfKalender2.impl.EmfKalender2PackageImpl#getDay()
		 * @generated
		 */
		EClass DAY = eINSTANCE.getDay();

		/**
		 * The meta object literal for the '<em><b>Day Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY__DAY_NUMBER = eINSTANCE.getDay_DayNumber();

		/**
		 * The meta object literal for the '<em><b>Week Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY__WEEK_DAY = eINSTANCE.getDay_WeekDay();

		/**
		 * The meta object literal for the '<em><b>Week Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY__WEEK_NUMBER = eINSTANCE.getDay_WeekNumber();

		/**
		 * The meta object literal for the '{@link emfKalender2.WeekDayEnum <em>Week Day Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emfKalender2.WeekDayEnum
		 * @see emfKalender2.impl.EmfKalender2PackageImpl#getWeekDayEnum()
		 * @generated
		 */
		EEnum WEEK_DAY_ENUM = eINSTANCE.getWeekDayEnum();

		/**
		 * The meta object literal for the '{@link emfKalender2.MonthEnum <em>Month Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emfKalender2.MonthEnum
		 * @see emfKalender2.impl.EmfKalender2PackageImpl#getMonthEnum()
		 * @generated
		 */
		EEnum MONTH_ENUM = eINSTANCE.getMonthEnum();

	}

} //EmfKalender2Package
