/**
 */
package org.xtext.vaadin.example.geo;

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
 * @see org.xtext.vaadin.example.geo.GeoDSLFactory
 * @model kind="package"
 * @generated
 */
public interface GeoDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "geo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.vaadin.xtext.org/geo/GeoDsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "geodsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeoDSLPackage eINSTANCE = org.xtext.vaadin.example.geo.impl.GeoDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.xtext.vaadin.example.geo.impl.GeoModelImpl <em>Geo Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.vaadin.example.geo.impl.GeoModelImpl
	 * @see org.xtext.vaadin.example.geo.impl.GeoDSLPackageImpl#getGeoModel()
	 * @generated
	 */
	int GEO_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_MODEL__PACKAGE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_MODEL__PORT = 1;

	/**
	 * The feature id for the '<em><b>Pwa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_MODEL__PWA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_MODEL__NAME = 3;

	/**
	 * The feature id for the '<em><b>Has Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_MODEL__HAS_LONG_NAME = 4;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_MODEL__LONG_NAME = 5;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_MODEL__THEME = 6;

	/**
	 * The feature id for the '<em><b>Has Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_MODEL__HAS_STYLE = 7;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_MODEL__STYLE = 8;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_MODEL__LAYOUT = 9;

	/**
	 * The number of structural features of the '<em>Geo Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_MODEL_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Geo Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xtext.vaadin.example.geo.impl.GeoLayoutImpl <em>Geo Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.vaadin.example.geo.impl.GeoLayoutImpl
	 * @see org.xtext.vaadin.example.geo.impl.GeoDSLPackageImpl#getGeoLayout()
	 * @generated
	 */
	int GEO_LAYOUT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LAYOUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LAYOUT__HAS_LOGO = 1;

	/**
	 * The feature id for the '<em><b>Logo Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LAYOUT__LOGO_PATH = 2;

	/**
	 * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LAYOUT__TABS = 3;

	/**
	 * The number of structural features of the '<em>Geo Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LAYOUT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Geo Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xtext.vaadin.example.geo.impl.GeoTabImpl <em>Geo Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.vaadin.example.geo.impl.GeoTabImpl
	 * @see org.xtext.vaadin.example.geo.impl.GeoDSLPackageImpl#getGeoTab()
	 * @generated
	 */
	int GEO_TAB = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_TAB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_TAB__ICON_NAME = 1;

	/**
	 * The feature id for the '<em><b>Has Topology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_TAB__HAS_TOPOLOGY = 2;

	/**
	 * The feature id for the '<em><b>Topology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_TAB__TOPOLOGY = 3;

	/**
	 * The number of structural features of the '<em>Geo Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_TAB_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Geo Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_TAB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xtext.vaadin.example.geo.GeoTheme <em>Geo Theme</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.vaadin.example.geo.GeoTheme
	 * @see org.xtext.vaadin.example.geo.impl.GeoDSLPackageImpl#getGeoTheme()
	 * @generated
	 */
	int GEO_THEME = 3;


	/**
	 * Returns the meta object for class '{@link org.xtext.vaadin.example.geo.GeoModel <em>Geo Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Model</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoModel
	 * @generated
	 */
	EClass getGeoModel();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.vaadin.example.geo.GeoModel#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoModel#getPackageName()
	 * @see #getGeoModel()
	 * @generated
	 */
	EAttribute getGeoModel_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.vaadin.example.geo.GeoModel#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoModel#getPort()
	 * @see #getGeoModel()
	 * @generated
	 */
	EAttribute getGeoModel_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.vaadin.example.geo.GeoModel#isPwa <em>Pwa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwa</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoModel#isPwa()
	 * @see #getGeoModel()
	 * @generated
	 */
	EAttribute getGeoModel_Pwa();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.vaadin.example.geo.GeoModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoModel#getName()
	 * @see #getGeoModel()
	 * @generated
	 */
	EAttribute getGeoModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.vaadin.example.geo.GeoModel#isHasLongName <em>Has Long Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Long Name</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoModel#isHasLongName()
	 * @see #getGeoModel()
	 * @generated
	 */
	EAttribute getGeoModel_HasLongName();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.vaadin.example.geo.GeoModel#getLongName <em>Long Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Name</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoModel#getLongName()
	 * @see #getGeoModel()
	 * @generated
	 */
	EAttribute getGeoModel_LongName();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.vaadin.example.geo.GeoModel#getTheme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theme</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoModel#getTheme()
	 * @see #getGeoModel()
	 * @generated
	 */
	EAttribute getGeoModel_Theme();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.vaadin.example.geo.GeoModel#isHasStyle <em>Has Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Style</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoModel#isHasStyle()
	 * @see #getGeoModel()
	 * @generated
	 */
	EAttribute getGeoModel_HasStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.vaadin.example.geo.GeoModel#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoModel#getStyle()
	 * @see #getGeoModel()
	 * @generated
	 */
	EAttribute getGeoModel_Style();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.vaadin.example.geo.GeoModel#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoModel#getLayout()
	 * @see #getGeoModel()
	 * @generated
	 */
	EReference getGeoModel_Layout();

	/**
	 * Returns the meta object for class '{@link org.xtext.vaadin.example.geo.GeoLayout <em>Geo Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Layout</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoLayout
	 * @generated
	 */
	EClass getGeoLayout();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.vaadin.example.geo.GeoLayout#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoLayout#getName()
	 * @see #getGeoLayout()
	 * @generated
	 */
	EAttribute getGeoLayout_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.vaadin.example.geo.GeoLayout#isHasLogo <em>Has Logo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Logo</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoLayout#isHasLogo()
	 * @see #getGeoLayout()
	 * @generated
	 */
	EAttribute getGeoLayout_HasLogo();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.vaadin.example.geo.GeoLayout#getLogoPath <em>Logo Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logo Path</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoLayout#getLogoPath()
	 * @see #getGeoLayout()
	 * @generated
	 */
	EAttribute getGeoLayout_LogoPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.vaadin.example.geo.GeoLayout#getTabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabs</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoLayout#getTabs()
	 * @see #getGeoLayout()
	 * @generated
	 */
	EReference getGeoLayout_Tabs();

	/**
	 * Returns the meta object for class '{@link org.xtext.vaadin.example.geo.GeoTab <em>Geo Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Tab</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoTab
	 * @generated
	 */
	EClass getGeoTab();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.vaadin.example.geo.GeoTab#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoTab#getName()
	 * @see #getGeoTab()
	 * @generated
	 */
	EAttribute getGeoTab_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.vaadin.example.geo.GeoTab#getIconName <em>Icon Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Name</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoTab#getIconName()
	 * @see #getGeoTab()
	 * @generated
	 */
	EAttribute getGeoTab_IconName();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.vaadin.example.geo.GeoTab#isHasTopology <em>Has Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Topology</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoTab#isHasTopology()
	 * @see #getGeoTab()
	 * @generated
	 */
	EAttribute getGeoTab_HasTopology();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.vaadin.example.geo.GeoTab#getTopology <em>Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topology</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoTab#getTopology()
	 * @see #getGeoTab()
	 * @generated
	 */
	EAttribute getGeoTab_Topology();

	/**
	 * Returns the meta object for enum '{@link org.xtext.vaadin.example.geo.GeoTheme <em>Geo Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Geo Theme</em>'.
	 * @see org.xtext.vaadin.example.geo.GeoTheme
	 * @generated
	 */
	EEnum getGeoTheme();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeoDSLFactory getGeoDSLFactory();

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
		 * The meta object literal for the '{@link org.xtext.vaadin.example.geo.impl.GeoModelImpl <em>Geo Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.vaadin.example.geo.impl.GeoModelImpl
		 * @see org.xtext.vaadin.example.geo.impl.GeoDSLPackageImpl#getGeoModel()
		 * @generated
		 */
		EClass GEO_MODEL = eINSTANCE.getGeoModel();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_MODEL__PACKAGE_NAME = eINSTANCE.getGeoModel_PackageName();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_MODEL__PORT = eINSTANCE.getGeoModel_Port();

		/**
		 * The meta object literal for the '<em><b>Pwa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_MODEL__PWA = eINSTANCE.getGeoModel_Pwa();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_MODEL__NAME = eINSTANCE.getGeoModel_Name();

		/**
		 * The meta object literal for the '<em><b>Has Long Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_MODEL__HAS_LONG_NAME = eINSTANCE.getGeoModel_HasLongName();

		/**
		 * The meta object literal for the '<em><b>Long Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_MODEL__LONG_NAME = eINSTANCE.getGeoModel_LongName();

		/**
		 * The meta object literal for the '<em><b>Theme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_MODEL__THEME = eINSTANCE.getGeoModel_Theme();

		/**
		 * The meta object literal for the '<em><b>Has Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_MODEL__HAS_STYLE = eINSTANCE.getGeoModel_HasStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_MODEL__STYLE = eINSTANCE.getGeoModel_Style();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_MODEL__LAYOUT = eINSTANCE.getGeoModel_Layout();

		/**
		 * The meta object literal for the '{@link org.xtext.vaadin.example.geo.impl.GeoLayoutImpl <em>Geo Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.vaadin.example.geo.impl.GeoLayoutImpl
		 * @see org.xtext.vaadin.example.geo.impl.GeoDSLPackageImpl#getGeoLayout()
		 * @generated
		 */
		EClass GEO_LAYOUT = eINSTANCE.getGeoLayout();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_LAYOUT__NAME = eINSTANCE.getGeoLayout_Name();

		/**
		 * The meta object literal for the '<em><b>Has Logo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_LAYOUT__HAS_LOGO = eINSTANCE.getGeoLayout_HasLogo();

		/**
		 * The meta object literal for the '<em><b>Logo Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_LAYOUT__LOGO_PATH = eINSTANCE.getGeoLayout_LogoPath();

		/**
		 * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_LAYOUT__TABS = eINSTANCE.getGeoLayout_Tabs();

		/**
		 * The meta object literal for the '{@link org.xtext.vaadin.example.geo.impl.GeoTabImpl <em>Geo Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.vaadin.example.geo.impl.GeoTabImpl
		 * @see org.xtext.vaadin.example.geo.impl.GeoDSLPackageImpl#getGeoTab()
		 * @generated
		 */
		EClass GEO_TAB = eINSTANCE.getGeoTab();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_TAB__NAME = eINSTANCE.getGeoTab_Name();

		/**
		 * The meta object literal for the '<em><b>Icon Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_TAB__ICON_NAME = eINSTANCE.getGeoTab_IconName();

		/**
		 * The meta object literal for the '<em><b>Has Topology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_TAB__HAS_TOPOLOGY = eINSTANCE.getGeoTab_HasTopology();

		/**
		 * The meta object literal for the '<em><b>Topology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_TAB__TOPOLOGY = eINSTANCE.getGeoTab_Topology();

		/**
		 * The meta object literal for the '{@link org.xtext.vaadin.example.geo.GeoTheme <em>Geo Theme</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.vaadin.example.geo.GeoTheme
		 * @see org.xtext.vaadin.example.geo.impl.GeoDSLPackageImpl#getGeoTheme()
		 * @generated
		 */
		EEnum GEO_THEME = eINSTANCE.getGeoTheme();

	}

} //GeoDSLPackage
