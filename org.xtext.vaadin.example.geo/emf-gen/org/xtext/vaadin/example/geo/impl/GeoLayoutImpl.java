/**
 */
package org.xtext.vaadin.example.geo.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.vaadin.example.geo.GeoDSLPackage;
import org.xtext.vaadin.example.geo.GeoLayout;
import org.xtext.vaadin.example.geo.GeoTab;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.vaadin.example.geo.impl.GeoLayoutImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.impl.GeoLayoutImpl#isHasLogo <em>Has Logo</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.impl.GeoLayoutImpl#getLogoPath <em>Logo Path</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.impl.GeoLayoutImpl#getTabs <em>Tabs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeoLayoutImpl extends MinimalEObjectImpl.Container implements GeoLayout {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasLogo() <em>Has Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasLogo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_LOGO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasLogo() <em>Has Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasLogo()
	 * @generated
	 * @ordered
	 */
	protected boolean hasLogo = HAS_LOGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogoPath() <em>Logo Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoPath()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGO_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogoPath() <em>Logo Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoPath()
	 * @generated
	 * @ordered
	 */
	protected String logoPath = LOGO_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTabs() <em>Tabs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabs()
	 * @generated
	 * @ordered
	 */
	protected EList<GeoTab> tabs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeoDSLPackage.Literals.GEO_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoDSLPackage.GEO_LAYOUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasLogo() {
		return hasLogo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasLogo(boolean newHasLogo) {
		boolean oldHasLogo = hasLogo;
		hasLogo = newHasLogo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoDSLPackage.GEO_LAYOUT__HAS_LOGO, oldHasLogo, hasLogo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogoPath() {
		return logoPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogoPath(String newLogoPath) {
		String oldLogoPath = logoPath;
		logoPath = newLogoPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoDSLPackage.GEO_LAYOUT__LOGO_PATH, oldLogoPath, logoPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GeoTab> getTabs() {
		if (tabs == null) {
			tabs = new EObjectContainmentEList<GeoTab>(GeoTab.class, this, GeoDSLPackage.GEO_LAYOUT__TABS);
		}
		return tabs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeoDSLPackage.GEO_LAYOUT__TABS:
				return ((InternalEList<?>)getTabs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeoDSLPackage.GEO_LAYOUT__NAME:
				return getName();
			case GeoDSLPackage.GEO_LAYOUT__HAS_LOGO:
				return isHasLogo();
			case GeoDSLPackage.GEO_LAYOUT__LOGO_PATH:
				return getLogoPath();
			case GeoDSLPackage.GEO_LAYOUT__TABS:
				return getTabs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeoDSLPackage.GEO_LAYOUT__NAME:
				setName((String)newValue);
				return;
			case GeoDSLPackage.GEO_LAYOUT__HAS_LOGO:
				setHasLogo((Boolean)newValue);
				return;
			case GeoDSLPackage.GEO_LAYOUT__LOGO_PATH:
				setLogoPath((String)newValue);
				return;
			case GeoDSLPackage.GEO_LAYOUT__TABS:
				getTabs().clear();
				getTabs().addAll((Collection<? extends GeoTab>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GeoDSLPackage.GEO_LAYOUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GeoDSLPackage.GEO_LAYOUT__HAS_LOGO:
				setHasLogo(HAS_LOGO_EDEFAULT);
				return;
			case GeoDSLPackage.GEO_LAYOUT__LOGO_PATH:
				setLogoPath(LOGO_PATH_EDEFAULT);
				return;
			case GeoDSLPackage.GEO_LAYOUT__TABS:
				getTabs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GeoDSLPackage.GEO_LAYOUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GeoDSLPackage.GEO_LAYOUT__HAS_LOGO:
				return hasLogo != HAS_LOGO_EDEFAULT;
			case GeoDSLPackage.GEO_LAYOUT__LOGO_PATH:
				return LOGO_PATH_EDEFAULT == null ? logoPath != null : !LOGO_PATH_EDEFAULT.equals(logoPath);
			case GeoDSLPackage.GEO_LAYOUT__TABS:
				return tabs != null && !tabs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", hasLogo: ");
		result.append(hasLogo);
		result.append(", logoPath: ");
		result.append(logoPath);
		result.append(')');
		return result.toString();
	}

} //GeoLayoutImpl
