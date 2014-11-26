/**
 */
package emfKalender;

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
 * @see emfKalender.EmfKalenderFactory
 * @model kind="package"
 * @generated
 */
public interface EmfKalenderPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emfKalender";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://unibw.de/emfKalender";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emfKalender";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmfKalenderPackage eINSTANCE = emfKalender.impl.EmfKalenderPackageImpl.init();

	/**
	 * The meta object id for the '{@link emfKalender.impl.YearImpl <em>Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emfKalender.impl.YearImpl
	 * @see emfKalender.impl.EmfKalenderPackageImpl#getYear()
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
	 * The feature id for the '<em><b>Weeks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__WEEKS = 1;

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
	 * The meta object id for the '{@link emfKalender.impl.WeekImpl <em>Week</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emfKalender.impl.WeekImpl
	 * @see emfKalender.impl.EmfKalenderPackageImpl#getWeek()
	 * @generated
	 */
	int WEEK = 1;

	/**
	 * The feature id for the '<em><b>Days</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK__DAYS = 0;

	/**
	 * The feature id for the '<em><b>Week Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK__WEEK_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Week</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Week</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emfKalender.impl.DayImpl <em>Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emfKalender.impl.DayImpl
	 * @see emfKalender.impl.EmfKalenderPackageImpl#getDay()
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
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__MONTH = 1;

	/**
	 * The feature id for the '<em><b>Week Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__WEEK_DAY = 2;

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
	 * The meta object id for the '{@link emfKalender.WeekDayEnum <em>Week Day Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emfKalender.WeekDayEnum
	 * @see emfKalender.impl.EmfKalenderPackageImpl#getWeekDayEnum()
	 * @generated
	 */
	int WEEK_DAY_ENUM = 3;

	/**
	 * The meta object id for the '{@link emfKalender.MonthEnum <em>Month Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emfKalender.MonthEnum
	 * @see emfKalender.impl.EmfKalenderPackageImpl#getMonthEnum()
	 * @generated
	 */
	int MONTH_ENUM = 4;


	/**
	 * Returns the meta object for class '{@link emfKalender.Year <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year</em>'.
	 * @see emfKalender.Year
	 * @generated
	 */
	EClass getYear();

	/**
	 * Returns the meta object for the attribute '{@link emfKalender.Year#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see emfKalender.Year#getDate()
	 * @see #getYear()
	 * @generated
	 */
	EAttribute getYear_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link emfKalender.Year#getWeeks <em>Weeks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weeks</em>'.
	 * @see emfKalender.Year#getWeeks()
	 * @see #getYear()
	 * @generated
	 */
	EReference getYear_Weeks();

	/**
	 * Returns the meta object for class '{@link emfKalender.Week <em>Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Week</em>'.
	 * @see emfKalender.Week
	 * @generated
	 */
	EClass getWeek();

	/**
	 * Returns the meta object for the containment reference list '{@link emfKalender.Week#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Days</em>'.
	 * @see emfKalender.Week#getDays()
	 * @see #getWeek()
	 * @generated
	 */
	EReference getWeek_Days();

	/**
	 * Returns the meta object for the attribute '{@link emfKalender.Week#getWeekNumber <em>Week Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Week Number</em>'.
	 * @see emfKalender.Week#getWeekNumber()
	 * @see #getWeek()
	 * @generated
	 */
	EAttribute getWeek_WeekNumber();

	/**
	 * Returns the meta object for class '{@link emfKalender.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day</em>'.
	 * @see emfKalender.Day
	 * @generated
	 */
	EClass getDay();

	/**
	 * Returns the meta object for the attribute '{@link emfKalender.Day#getDayNumber <em>Day Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Number</em>'.
	 * @see emfKalender.Day#getDayNumber()
	 * @see #getDay()
	 * @generated
	 */
	EAttribute getDay_DayNumber();

	/**
	 * Returns the meta object for the attribute '{@link emfKalender.Day#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see emfKalender.Day#getMonth()
	 * @see #getDay()
	 * @generated
	 */
	EAttribute getDay_Month();

	/**
	 * Returns the meta object for the attribute '{@link emfKalender.Day#getWeekDay <em>Week Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Week Day</em>'.
	 * @see emfKalender.Day#getWeekDay()
	 * @see #getDay()
	 * @generated
	 */
	EAttribute getDay_WeekDay();

	/**
	 * Returns the meta object for enum '{@link emfKalender.WeekDayEnum <em>Week Day Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Week Day Enum</em>'.
	 * @see emfKalender.WeekDayEnum
	 * @generated
	 */
	EEnum getWeekDayEnum();

	/**
	 * Returns the meta object for enum '{@link emfKalender.MonthEnum <em>Month Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Month Enum</em>'.
	 * @see emfKalender.MonthEnum
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
	EmfKalenderFactory getEmfKalenderFactory();

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
		 * The meta object literal for the '{@link emfKalender.impl.YearImpl <em>Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emfKalender.impl.YearImpl
		 * @see emfKalender.impl.EmfKalenderPackageImpl#getYear()
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
		 * The meta object literal for the '<em><b>Weeks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR__WEEKS = eINSTANCE.getYear_Weeks();

		/**
		 * The meta object literal for the '{@link emfKalender.impl.WeekImpl <em>Week</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emfKalender.impl.WeekImpl
		 * @see emfKalender.impl.EmfKalenderPackageImpl#getWeek()
		 * @generated
		 */
		EClass WEEK = eINSTANCE.getWeek();

		/**
		 * The meta object literal for the '<em><b>Days</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEEK__DAYS = eINSTANCE.getWeek_Days();

		/**
		 * The meta object literal for the '<em><b>Week Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEEK__WEEK_NUMBER = eINSTANCE.getWeek_WeekNumber();

		/**
		 * The meta object literal for the '{@link emfKalender.impl.DayImpl <em>Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emfKalender.impl.DayImpl
		 * @see emfKalender.impl.EmfKalenderPackageImpl#getDay()
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
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY__MONTH = eINSTANCE.getDay_Month();

		/**
		 * The meta object literal for the '<em><b>Week Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY__WEEK_DAY = eINSTANCE.getDay_WeekDay();

		/**
		 * The meta object literal for the '{@link emfKalender.WeekDayEnum <em>Week Day Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emfKalender.WeekDayEnum
		 * @see emfKalender.impl.EmfKalenderPackageImpl#getWeekDayEnum()
		 * @generated
		 */
		EEnum WEEK_DAY_ENUM = eINSTANCE.getWeekDayEnum();

		/**
		 * The meta object literal for the '{@link emfKalender.MonthEnum <em>Month Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emfKalender.MonthEnum
		 * @see emfKalender.impl.EmfKalenderPackageImpl#getMonthEnum()
		 * @generated
		 */
		EEnum MONTH_ENUM = eINSTANCE.getMonthEnum();

	}

} //EmfKalenderPackage
