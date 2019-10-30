/**
 */
package org.xtext.vaadin.example.geo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.vaadin.example.geo.GeoModel#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.GeoModel#getPort <em>Port</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.GeoModel#isPwa <em>Pwa</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.GeoModel#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.GeoModel#isHasLongName <em>Has Long Name</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.GeoModel#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.GeoModel#getTheme <em>Theme</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.GeoModel#isHasStyle <em>Has Style</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.GeoModel#getStyle <em>Style</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.GeoModel#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoModel()
 * @model
 * @generated
 */
public interface GeoModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoModel_PackageName()
	 * @model unique="false"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link org.xtext.vaadin.example.geo.GeoModel#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoModel_Port()
	 * @model unique="false"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link org.xtext.vaadin.example.geo.GeoModel#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Pwa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pwa</em>' attribute.
	 * @see #setPwa(boolean)
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoModel_Pwa()
	 * @model unique="false"
	 * @generated
	 */
	boolean isPwa();

	/**
	 * Sets the value of the '{@link org.xtext.vaadin.example.geo.GeoModel#isPwa <em>Pwa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwa</em>' attribute.
	 * @see #isPwa()
	 * @generated
	 */
	void setPwa(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoModel_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xtext.vaadin.example.geo.GeoModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Long Name</em>' attribute.
	 * @see #setHasLongName(boolean)
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoModel_HasLongName()
	 * @model unique="false"
	 * @generated
	 */
	boolean isHasLongName();

	/**
	 * Sets the value of the '{@link org.xtext.vaadin.example.geo.GeoModel#isHasLongName <em>Has Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Long Name</em>' attribute.
	 * @see #isHasLongName()
	 * @generated
	 */
	void setHasLongName(boolean value);

	/**
	 * Returns the value of the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Name</em>' attribute.
	 * @see #setLongName(String)
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoModel_LongName()
	 * @model unique="false"
	 * @generated
	 */
	String getLongName();

	/**
	 * Sets the value of the '{@link org.xtext.vaadin.example.geo.GeoModel#getLongName <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Name</em>' attribute.
	 * @see #getLongName()
	 * @generated
	 */
	void setLongName(String value);

	/**
	 * Returns the value of the '<em><b>Theme</b></em>' attribute.
	 * The literals are from the enumeration {@link org.xtext.vaadin.example.geo.GeoTheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theme</em>' attribute.
	 * @see org.xtext.vaadin.example.geo.GeoTheme
	 * @see #setTheme(GeoTheme)
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoModel_Theme()
	 * @model unique="false"
	 * @generated
	 */
	GeoTheme getTheme();

	/**
	 * Sets the value of the '{@link org.xtext.vaadin.example.geo.GeoModel#getTheme <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theme</em>' attribute.
	 * @see org.xtext.vaadin.example.geo.GeoTheme
	 * @see #getTheme()
	 * @generated
	 */
	void setTheme(GeoTheme value);

	/**
	 * Returns the value of the '<em><b>Has Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Style</em>' attribute.
	 * @see #setHasStyle(boolean)
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoModel_HasStyle()
	 * @model unique="false"
	 * @generated
	 */
	boolean isHasStyle();

	/**
	 * Sets the value of the '{@link org.xtext.vaadin.example.geo.GeoModel#isHasStyle <em>Has Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Style</em>' attribute.
	 * @see #isHasStyle()
	 * @generated
	 */
	void setHasStyle(boolean value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoModel_Style()
	 * @model unique="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.xtext.vaadin.example.geo.GeoModel#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(GeoLayout)
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoModel_Layout()
	 * @model containment="true"
	 * @generated
	 */
	GeoLayout getLayout();

	/**
	 * Sets the value of the '{@link org.xtext.vaadin.example.geo.GeoModel#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(GeoLayout value);

} // GeoModel
