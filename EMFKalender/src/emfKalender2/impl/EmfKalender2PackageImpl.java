/**
 */
package emfKalender2.impl;

import emfKalender2.Day;
import emfKalender2.EmfKalender2Factory;
import emfKalender2.EmfKalender2Package;
import emfKalender2.Month;
import emfKalender2.MonthEnum;
import emfKalender2.WeekDayEnum;
import emfKalender2.Year;

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
public class EmfKalender2PackageImpl extends EPackageImpl implements EmfKalender2Package {
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
	private EClass monthEClass = null;

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
	 * @see emfKalender2.EmfKalender2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EmfKalender2PackageImpl() {
		super(eNS_URI, EmfKalender2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EmfKalender2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EmfKalender2Package init() {
		if (isInited) return (EmfKalender2Package)EPackage.Registry.INSTANCE.getEPackage(EmfKalender2Package.eNS_URI);

		// Obtain or create and register package
		EmfKalender2PackageImpl theEmfKalender2Package = (EmfKalender2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmfKalender2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EmfKalender2PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEmfKalender2Package.createPackageContents();

		// Initialize created meta-data
		theEmfKalender2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEmfKalender2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmfKalender2Package.eNS_URI, theEmfKalender2Package);
		return theEmfKalender2Package;
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
	public EReference getYear_Months() {
		return (EReference)yearEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonth() {
		return monthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonth_Days() {
		return (EReference)monthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonth_Month() {
		return (EAttribute)monthEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDay_WeekDay() {
		return (EAttribute)dayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDay_WeekNumber() {
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
	public EmfKalender2Factory getEmfKalender2Factory() {
		return (EmfKalender2Factory)getEFactoryInstance();
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
		createEReference(yearEClass, YEAR__MONTHS);

		monthEClass = createEClass(MONTH);
		createEReference(monthEClass, MONTH__DAYS);
		createEAttribute(monthEClass, MONTH__MONTH);

		dayEClass = createEClass(DAY);
		createEAttribute(dayEClass, DAY__DAY_NUMBER);
		createEAttribute(dayEClass, DAY__WEEK_DAY);
		createEAttribute(dayEClass, DAY__WEEK_NUMBER);

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
		initEAttribute(getYear_Date(), ecorePackage.getEString(), "date", null, 0, 1, Year.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYear_Months(), this.getMonth(), null, "months", null, 0, 52, Year.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monthEClass, Month.class, "Month", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonth_Days(), this.getDay(), null, "days", null, 0, 31, Month.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonth_Month(), this.getMonthEnum(), "month", null, 0, 1, Month.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dayEClass, Day.class, "Day", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDay_DayNumber(), ecorePackage.getEIntegerObject(), "dayNumber", null, 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDay_WeekDay(), this.getWeekDayEnum(), "weekDay", null, 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDay_WeekNumber(), ecorePackage.getEIntegerObject(), "weekNumber", null, 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

} //EmfKalender2PackageImpl
