/**
 */
package org.xtext.vaadin.example.geo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.vaadin.example.geo.GeoDSLPackage
 * @generated
 */
public interface GeoDSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeoDSLFactory eINSTANCE = org.xtext.vaadin.example.geo.impl.GeoDSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Geo Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geo Model</em>'.
	 * @generated
	 */
	GeoModel createGeoModel();

	/**
	 * Returns a new object of class '<em>Geo Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geo Layout</em>'.
	 * @generated
	 */
	GeoLayout createGeoLayout();

	/**
	 * Returns a new object of class '<em>Geo Tab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geo Tab</em>'.
	 * @generated
	 */
	GeoTab createGeoTab();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GeoDSLPackage getGeoDSLPackage();

} //GeoDSLFactory
