/**
 */
package emfKalender.impl;

import emfKalender.Day;
import emfKalender.EmfKalenderFactory;
import emfKalender.EmfKalenderPackage;
import emfKalender.MonthEnum;
import emfKalender.Week;
import emfKalender.WeekDayEnum;
import emfKalender.Year;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfKalenderPackageImpl extends EPackageImpl implements EmfKalenderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weekEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum weekDayEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum monthEnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see emfKalender.EmfKalenderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EmfKalenderPackageImpl() {
		super(eNS_URI, EmfKalenderFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EmfKalenderPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EmfKalenderPackage init() {
		if (isInited) return (EmfKalenderPackage)EPackage.Registry.INSTANCE.getEPackage(EmfKalenderPackage.eNS_URI);

		// Obtain or create and register package
		EmfKalenderPackageImpl theEmfKalenderPackage = (EmfKalenderPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmfKalenderPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EmfKalenderPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEmfKalenderPackage.createPackageContents();

		// Initialize created meta-data
		theEmfKalenderPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEmfKalenderPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmfKalenderPackage.eNS_URI, theEmfKalenderPackage);
		return theEmfKalenderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYear() {
		return yearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYear_Date() {
		return (EAttribute)yearEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYear_Weeks() {
		return (EReference)yearEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeek() {
		return weekEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeek_Days() {
		return (EReference)weekEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeek_WeekNumber() {
		return (EAttribute)weekEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDay() {
		return dayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDay_DayNumber() {
		return (EAttribute)dayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDay_Month() {
		return (EAttribute)dayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDay_WeekDay() {
		return (EAttribute)dayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWeekDayEnum() {
		return weekDayEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMonthEnum() {
		return monthEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfKalenderFactory getEmfKalenderFactory() {
		return (EmfKalenderFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		yearEClass = createEClass(YEAR);
		createEAttribute(yearEClass, YEAR__DATE);
		createEReference(yearEClass, YEAR__WEEKS);

		weekEClass = createEClass(WEEK);
		createEReference(weekEClass, WEEK__DAYS);
		createEAttribute(weekEClass, WEEK__WEEK_NUMBER);

		dayEClass = createEClass(DAY);
		createEAttribute(dayEClass, DAY__DAY_NUMBER);
		createEAttribute(dayEClass, DAY__MONTH);
		createEAttribute(dayEClass, DAY__WEEK_DAY);

		// Create enums
		weekDayEnumEEnum = createEEnum(WEEK_DAY_ENUM);
		monthEnumEEnum = createEEnum(MONTH_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(yearEClass, Year.class, "Year", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYear_Date(), ecorePackage.getEIntegerObject(), "date", null, 0, 1, Year.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYear_Weeks(), this.getWeek(), null, "weeks", null, 0, 52, Year.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weekEClass, Week.class, "Week", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeek_Days(), this.getDay(), null, "days", null, 0, 31, Week.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeek_WeekNumber(), ecorePackage.getEIntegerObject(), "weekNumber", null, 0, 1, Week.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dayEClass, Day.class, "Day", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDay_DayNumber(), ecorePackage.getEIntegerObject(), "dayNumber", null, 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDay_Month(), this.getMonthEnum(), "month", null, 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDay_WeekDay(), this.getWeekDayEnum(), "weekDay", null, 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(weekDayEnumEEnum, WeekDayEnum.class, "WeekDayEnum");
		addEEnumLiteral(weekDayEnumEEnum, WeekDayEnum.MONDAY);
		addEEnumLiteral(weekDayEnumEEnum, WeekDayEnum.TUESDAY);
		addEEnumLiteral(weekDayEnumEEnum, WeekDayEnum.WEDNESDAY);
		addEEnumLiteral(weekDayEnumEEnum, WeekDayEnum.THURSDAY);
		addEEnumLiteral(weekDayEnumEEnum, WeekDayEnum.FRIDAY);
		addEEnumLiteral(weekDayEnumEEnum, WeekDayEnum.SATURDAY);
		addEEnumLiteral(weekDayEnumEEnum, WeekDayEnum.SUNDAY);

		initEEnum(monthEnumEEnum, MonthEnum.class, "MonthEnum");
		addEEnumLiteral(monthEnumEEnum, MonthEnum.JANUAR);
		addEEnumLiteral(monthEnumEEnum, MonthEnum.FEBRUAR);
		addEEnumLiteral(monthEnumEEnum, MonthEnum.MAERZ);
		addEEnumLiteral(monthEnumEEnum, MonthEnum.APRIL);
		addEEnumLiteral(monthEnumEEnum, MonthEnum.MAI);
		addEEnumLiteral(monthEnumEEnum, MonthEnum.JUNI);
		addEEnumLiteral(monthEnumEEnum, MonthEnum.JULI);
		addEEnumLiteral(monthEnumEEnum, MonthEnum.AUGUST);
		addEEnumLiteral(monthEnumEEnum, MonthEnum.SEPTEMBER);
		addEEnumLiteral(monthEnumEEnum, MonthEnum.OKTOBER);
		addEEnumLiteral(monthEnumEEnum, MonthEnum.NOVEMBER);
		addEEnumLiteral(monthEnumEEnum, MonthEnum.DEZEMBER);

		// Create resource
		createResource(eNS_URI);
	}

} //EmfKalenderPackageImpl
