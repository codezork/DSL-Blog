/**
 */
package org.xtext.vaadin.example.geo.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.vaadin.example.geo.GeoDSLPackage;
import org.xtext.vaadin.example.geo.GeoTab;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo Tab</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.vaadin.example.geo.impl.GeoTabImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.impl.GeoTabImpl#getIconName <em>Icon Name</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.impl.GeoTabImpl#isHasTopology <em>Has Topology</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.impl.GeoTabImpl#getTopology <em>Topology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeoTabImpl extends MinimalEObjectImpl.Container implements GeoTab {
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
	 * The default value of the '{@link #getIconName() <em>Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconName()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIconName() <em>Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconName()
	 * @generated
	 * @ordered
	 */
	protected String iconName = ICON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasTopology() <em>Has Topology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTopology()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TOPOLOGY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasTopology() <em>Has Topology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTopology()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTopology = HAS_TOPOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopology() <em>Topology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopology()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopology() <em>Topology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopology()
	 * @generated
	 * @ordered
	 */
	protected String topology = TOPOLOGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoTabImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeoDSLPackage.Literals.GEO_TAB;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeoDSLPackage.GEO_TAB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIconName() {
		return iconName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIconName(String newIconName) {
		String oldIconName = iconName;
		iconName = newIconName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoDSLPackage.GEO_TAB__ICON_NAME, oldIconName, iconName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTopology() {
		return hasTopology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTopology(boolean newHasTopology) {
		boolean oldHasTopology = hasTopology;
		hasTopology = newHasTopology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoDSLPackage.GEO_TAB__HAS_TOPOLOGY, oldHasTopology, hasTopology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTopology() {
		return topology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopology(String newTopology) {
		String oldTopology = topology;
		topology = newTopology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoDSLPackage.GEO_TAB__TOPOLOGY, oldTopology, topology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeoDSLPackage.GEO_TAB__NAME:
				return getName();
			case GeoDSLPackage.GEO_TAB__ICON_NAME:
				return getIconName();
			case GeoDSLPackage.GEO_TAB__HAS_TOPOLOGY:
				return isHasTopology();
			case GeoDSLPackage.GEO_TAB__TOPOLOGY:
				return getTopology();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeoDSLPackage.GEO_TAB__NAME:
				setName((String)newValue);
				return;
			case GeoDSLPackage.GEO_TAB__ICON_NAME:
				setIconName((String)newValue);
				return;
			case GeoDSLPackage.GEO_TAB__HAS_TOPOLOGY:
				setHasTopology((Boolean)newValue);
				return;
			case GeoDSLPackage.GEO_TAB__TOPOLOGY:
				setTopology((String)newValue);
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
			case GeoDSLPackage.GEO_TAB__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GeoDSLPackage.GEO_TAB__ICON_NAME:
				setIconName(ICON_NAME_EDEFAULT);
				return;
			case GeoDSLPackage.GEO_TAB__HAS_TOPOLOGY:
				setHasTopology(HAS_TOPOLOGY_EDEFAULT);
				return;
			case GeoDSLPackage.GEO_TAB__TOPOLOGY:
				setTopology(TOPOLOGY_EDEFAULT);
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
			case GeoDSLPackage.GEO_TAB__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GeoDSLPackage.GEO_TAB__ICON_NAME:
				return ICON_NAME_EDEFAULT == null ? iconName != null : !ICON_NAME_EDEFAULT.equals(iconName);
			case GeoDSLPackage.GEO_TAB__HAS_TOPOLOGY:
				return hasTopology != HAS_TOPOLOGY_EDEFAULT;
			case GeoDSLPackage.GEO_TAB__TOPOLOGY:
				return TOPOLOGY_EDEFAULT == null ? topology != null : !TOPOLOGY_EDEFAULT.equals(topology);
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
		result.append(", iconName: ");
		result.append(iconName);
		result.append(", hasTopology: ");
		result.append(hasTopology);
		result.append(", topology: ");
		result.append(topology);
		result.append(')');
		return result.toString();
	}

} //GeoTabImpl
