/**
 */
package org.xtext.vaadin.example.geo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.vaadin.example.geo.GeoLayout#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.GeoLayout#isHasLogo <em>Has Logo</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.GeoLayout#getLogoPath <em>Logo Path</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.GeoLayout#getTabs <em>Tabs</em>}</li>
 * </ul>
 *
 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoLayout()
 * @model
 * @generated
 */
public interface GeoLayout extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoLayout_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xtext.vaadin.example.geo.GeoLayout#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Logo</em>' attribute.
	 * @see #setHasLogo(boolean)
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoLayout_HasLogo()
	 * @model unique="false"
	 * @generated
	 */
	boolean isHasLogo();

	/**
	 * Sets the value of the '{@link org.xtext.vaadin.example.geo.GeoLayout#isHasLogo <em>Has Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Logo</em>' attribute.
	 * @see #isHasLogo()
	 * @generated
	 */
	void setHasLogo(boolean value);

	/**
	 * Returns the value of the '<em><b>Logo Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logo Path</em>' attribute.
	 * @see #setLogoPath(String)
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoLayout_LogoPath()
	 * @model unique="false"
	 * @generated
	 */
	String getLogoPath();

	/**
	 * Sets the value of the '{@link org.xtext.vaadin.example.geo.GeoLayout#getLogoPath <em>Logo Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logo Path</em>' attribute.
	 * @see #getLogoPath()
	 * @generated
	 */
	void setLogoPath(String value);

	/**
	 * Returns the value of the '<em><b>Tabs</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.vaadin.example.geo.GeoTab}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabs</em>' containment reference list.
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoLayout_Tabs()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeoTab> getTabs();

} // GeoLayout
