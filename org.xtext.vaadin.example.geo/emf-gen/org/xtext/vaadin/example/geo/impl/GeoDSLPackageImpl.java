/**
 */
package org.xtext.vaadin.example.geo.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.vaadin.example.geo.GeoDSLFactory;
import org.xtext.vaadin.example.geo.GeoDSLPackage;
import org.xtext.vaadin.example.geo.GeoLayout;
import org.xtext.vaadin.example.geo.GeoModel;
import org.xtext.vaadin.example.geo.GeoTab;
import org.xtext.vaadin.example.geo.GeoTheme;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeoDSLPackageImpl extends EPackageImpl implements GeoDSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoTabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum geoThemeEEnum = null;

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
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeoDSLPackageImpl() {
		super(eNS_URI, GeoDSLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GeoDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeoDSLPackage init() {
		if (isInited) return (GeoDSLPackage)EPackage.Registry.INSTANCE.getEPackage(GeoDSLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGeoDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GeoDSLPackageImpl theGeoDSLPackage = registeredGeoDSLPackage instanceof GeoDSLPackageImpl ? (GeoDSLPackageImpl)registeredGeoDSLPackage : new GeoDSLPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGeoDSLPackage.createPackageContents();

		// Initialize created meta-data
		theGeoDSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeoDSLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeoDSLPackage.eNS_URI, theGeoDSLPackage);
		return theGeoDSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeoModel() {
		return geoModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoModel_PackageName() {
		return (EAttribute)geoModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoModel_Port() {
		return (EAttribute)geoModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoModel_Pwa() {
		return (EAttribute)geoModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoModel_Name() {
		return (EAttribute)geoModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoModel_HasLongName() {
		return (EAttribute)geoModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoModel_LongName() {
		return (EAttribute)geoModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoModel_Theme() {
		return (EAttribute)geoModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoModel_HasStyle() {
		return (EAttribute)geoModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoModel_Style() {
		return (EAttribute)geoModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeoModel_Layout() {
		return (EReference)geoModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeoLayout() {
		return geoLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoLayout_Name() {
		return (EAttribute)geoLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoLayout_HasLogo() {
		return (EAttribute)geoLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoLayout_LogoPath() {
		return (EAttribute)geoLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeoLayout_Tabs() {
		return (EReference)geoLayoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeoTab() {
		return geoTabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoTab_Name() {
		return (EAttribute)geoTabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoTab_IconName() {
		return (EAttribute)geoTabEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoTab_HasTopology() {
		return (EAttribute)geoTabEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoTab_Topology() {
		return (EAttribute)geoTabEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGeoTheme() {
		return geoThemeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoDSLFactory getGeoDSLFactory() {
		return (GeoDSLFactory)getEFactoryInstance();
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
		geoModelEClass = createEClass(GEO_MODEL);
		createEAttribute(geoModelEClass, GEO_MODEL__PACKAGE_NAME);
		createEAttribute(geoModelEClass, GEO_MODEL__PORT);
		createEAttribute(geoModelEClass, GEO_MODEL__PWA);
		createEAttribute(geoModelEClass, GEO_MODEL__NAME);
		createEAttribute(geoModelEClass, GEO_MODEL__HAS_LONG_NAME);
		createEAttribute(geoModelEClass, GEO_MODEL__LONG_NAME);
		createEAttribute(geoModelEClass, GEO_MODEL__THEME);
		createEAttribute(geoModelEClass, GEO_MODEL__HAS_STYLE);
		createEAttribute(geoModelEClass, GEO_MODEL__STYLE);
		createEReference(geoModelEClass, GEO_MODEL__LAYOUT);

		geoLayoutEClass = createEClass(GEO_LAYOUT);
		createEAttribute(geoLayoutEClass, GEO_LAYOUT__NAME);
		createEAttribute(geoLayoutEClass, GEO_LAYOUT__HAS_LOGO);
		createEAttribute(geoLayoutEClass, GEO_LAYOUT__LOGO_PATH);
		createEReference(geoLayoutEClass, GEO_LAYOUT__TABS);

		geoTabEClass = createEClass(GEO_TAB);
		createEAttribute(geoTabEClass, GEO_TAB__NAME);
		createEAttribute(geoTabEClass, GEO_TAB__ICON_NAME);
		createEAttribute(geoTabEClass, GEO_TAB__HAS_TOPOLOGY);
		createEAttribute(geoTabEClass, GEO_TAB__TOPOLOGY);

		// Create enums
		geoThemeEEnum = createEEnum(GEO_THEME);
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

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(geoModelEClass, GeoModel.class, "GeoModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeoModel_PackageName(), theEcorePackage.getEString(), "packageName", null, 0, 1, GeoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoModel_Port(), theEcorePackage.getEInt(), "port", null, 0, 1, GeoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoModel_Pwa(), theEcorePackage.getEBoolean(), "pwa", null, 0, 1, GeoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoModel_Name(), theEcorePackage.getEString(), "name", null, 0, 1, GeoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoModel_HasLongName(), theEcorePackage.getEBoolean(), "hasLongName", null, 0, 1, GeoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoModel_LongName(), theEcorePackage.getEString(), "longName", null, 0, 1, GeoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoModel_Theme(), this.getGeoTheme(), "theme", null, 0, 1, GeoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoModel_HasStyle(), theEcorePackage.getEBoolean(), "hasStyle", null, 0, 1, GeoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoModel_Style(), theEcorePackage.getEString(), "style", null, 0, 1, GeoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeoModel_Layout(), this.getGeoLayout(), null, "layout", null, 0, 1, GeoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geoLayoutEClass, GeoLayout.class, "GeoLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeoLayout_Name(), theEcorePackage.getEString(), "name", null, 0, 1, GeoLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoLayout_HasLogo(), theEcorePackage.getEBoolean(), "hasLogo", null, 0, 1, GeoLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoLayout_LogoPath(), theEcorePackage.getEString(), "logoPath", null, 0, 1, GeoLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeoLayout_Tabs(), this.getGeoTab(), null, "tabs", null, 0, -1, GeoLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geoTabEClass, GeoTab.class, "GeoTab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeoTab_Name(), theEcorePackage.getEString(), "name", null, 0, 1, GeoTab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoTab_IconName(), theEcorePackage.getEString(), "iconName", null, 0, 1, GeoTab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoTab_HasTopology(), theEcorePackage.getEBoolean(), "hasTopology", null, 0, 1, GeoTab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoTab_Topology(), theEcorePackage.getEString(), "topology", null, 0, 1, GeoTab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(geoThemeEEnum, GeoTheme.class, "GeoTheme");
		addEEnumLiteral(geoThemeEEnum, GeoTheme.LUMO);
		addEEnumLiteral(geoThemeEEnum, GeoTheme.MATERIAL);

		// Create resource
		createResource(eNS_URI);
	}

} //GeoDSLPackageImpl
