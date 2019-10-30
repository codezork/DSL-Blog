/**
 */
package org.xtext.vaadin.example.geo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Tab</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.vaadin.example.geo.GeoTab#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.GeoTab#getIconName <em>Icon Name</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.GeoTab#isHasTopology <em>Has Topology</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.GeoTab#getTopology <em>Topology</em>}</li>
 * </ul>
 *
 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoTab()
 * @model
 * @generated
 */
public interface GeoTab extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoTab_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xtext.vaadin.example.geo.GeoTab#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Name</em>' attribute.
	 * @see #setIconName(String)
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoTab_IconName()
	 * @model unique="false"
	 * @generated
	 */
	String getIconName();

	/**
	 * Sets the value of the '{@link org.xtext.vaadin.example.geo.GeoTab#getIconName <em>Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Name</em>' attribute.
	 * @see #getIconName()
	 * @generated
	 */
	void setIconName(String value);

	/**
	 * Returns the value of the '<em><b>Has Topology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Topology</em>' attribute.
	 * @see #setHasTopology(boolean)
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoTab_HasTopology()
	 * @model unique="false"
	 * @generated
	 */
	boolean isHasTopology();

	/**
	 * Sets the value of the '{@link org.xtext.vaadin.example.geo.GeoTab#isHasTopology <em>Has Topology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Topology</em>' attribute.
	 * @see #isHasTopology()
	 * @generated
	 */
	void setHasTopology(boolean value);

	/**
	 * Returns the value of the '<em><b>Topology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology</em>' attribute.
	 * @see #setTopology(String)
	 * @see org.xtext.vaadin.example.geo.GeoDSLPackage#getGeoTab_Topology()
	 * @model unique="false"
	 * @generated
	 */
	String getTopology();

	/**
	 * Sets the value of the '{@link org.xtext.vaadin.example.geo.GeoTab#getTopology <em>Topology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology</em>' attribute.
	 * @see #getTopology()
	 * @generated
	 */
	void setTopology(String value);

} // GeoTab
