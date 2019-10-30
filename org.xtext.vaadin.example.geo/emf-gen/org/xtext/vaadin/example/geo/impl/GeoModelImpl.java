/**
 */
package org.xtext.vaadin.example.geo.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.vaadin.example.geo.GeoDSLPackage;
import org.xtext.vaadin.example.geo.GeoLayout;
import org.xtext.vaadin.example.geo.GeoModel;
import org.xtext.vaadin.example.geo.GeoTheme;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.vaadin.example.geo.impl.GeoModelImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.impl.GeoModelImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.impl.GeoModelImpl#isPwa <em>Pwa</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.impl.GeoModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.impl.GeoModelImpl#isHasLongName <em>Has Long Name</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.impl.GeoModelImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.impl.GeoModelImpl#getTheme <em>Theme</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.impl.GeoModelImpl#isHasStyle <em>Has Style</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.impl.GeoModelImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.xtext.vaadin.example.geo.impl.GeoModelImpl#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeoModelImpl extends MinimalEObjectImpl.Container implements GeoModel {
	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isPwa() <em>Pwa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPwa()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PWA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPwa() <em>Pwa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPwa()
	 * @generated
	 * @ordered
	 */
	protected boolean pwa = PWA_EDEFAULT;

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
	 * The default value of the '{@link #isHasLongName() <em>Has Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasLongName()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_LONG_NAME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasLongName() <em>Has Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasLongName()
	 * @generated
	 * @ordered
	 */
	protected boolean hasLongName = HAS_LONG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongName() <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongName()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongName() <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongName()
	 * @generated
	 * @ordered
	 */
	protected String longName = LONG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTheme() <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected static final GeoTheme THEME_EDEFAULT = GeoTheme.LUMO;

	/**
	 * The cached value of the '{@link #getTheme() <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected GeoTheme theme = THEME_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasStyle() <em>Has Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasStyle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_STYLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasStyle() <em>Has Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasStyle()
	 * @generated
	 * @ordered
	 */
	protected boolean hasStyle = HAS_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected GeoLayout layout;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeoDSLPackage.Literals.GEO_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoDSLPackage.GEO_MODEL__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoDSLPackage.GEO_MODEL__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPwa() {
		return pwa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPwa(boolean newPwa) {
		boolean oldPwa = pwa;
		pwa = newPwa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoDSLPackage.GEO_MODEL__PWA, oldPwa, pwa));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeoDSLPackage.GEO_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasLongName() {
		return hasLongName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasLongName(boolean newHasLongName) {
		boolean oldHasLongName = hasLongName;
		hasLongName = newHasLongName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoDSLPackage.GEO_MODEL__HAS_LONG_NAME, oldHasLongName, hasLongName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLongName() {
		return longName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongName(String newLongName) {
		String oldLongName = longName;
		longName = newLongName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoDSLPackage.GEO_MODEL__LONG_NAME, oldLongName, longName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoTheme getTheme() {
		return theme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTheme(GeoTheme newTheme) {
		GeoTheme oldTheme = theme;
		theme = newTheme == null ? THEME_EDEFAULT : newTheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoDSLPackage.GEO_MODEL__THEME, oldTheme, theme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasStyle() {
		return hasStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasStyle(boolean newHasStyle) {
		boolean oldHasStyle = hasStyle;
		hasStyle = newHasStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoDSLPackage.GEO_MODEL__HAS_STYLE, oldHasStyle, hasStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoDSLPackage.GEO_MODEL__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoLayout getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout(GeoLayout newLayout, NotificationChain msgs) {
		GeoLayout oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeoDSLPackage.GEO_MODEL__LAYOUT, oldLayout, newLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayout(GeoLayout newLayout) {
		if (newLayout != layout) {
			NotificationChain msgs = null;
			if (layout != null)
				msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeoDSLPackage.GEO_MODEL__LAYOUT, null, msgs);
			if (newLayout != null)
				msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeoDSLPackage.GEO_MODEL__LAYOUT, null, msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoDSLPackage.GEO_MODEL__LAYOUT, newLayout, newLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeoDSLPackage.GEO_MODEL__LAYOUT:
				return basicSetLayout(null, msgs);
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
			case GeoDSLPackage.GEO_MODEL__PACKAGE_NAME:
				return getPackageName();
			case GeoDSLPackage.GEO_MODEL__PORT:
				return getPort();
			case GeoDSLPackage.GEO_MODEL__PWA:
				return isPwa();
			case GeoDSLPackage.GEO_MODEL__NAME:
				return getName();
			case GeoDSLPackage.GEO_MODEL__HAS_LONG_NAME:
				return isHasLongName();
			case GeoDSLPackage.GEO_MODEL__LONG_NAME:
				return getLongName();
			case GeoDSLPackage.GEO_MODEL__THEME:
				return getTheme();
			case GeoDSLPackage.GEO_MODEL__HAS_STYLE:
				return isHasStyle();
			case GeoDSLPackage.GEO_MODEL__STYLE:
				return getStyle();
			case GeoDSLPackage.GEO_MODEL__LAYOUT:
				return getLayout();
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
			case GeoDSLPackage.GEO_MODEL__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case GeoDSLPackage.GEO_MODEL__PORT:
				setPort((Integer)newValue);
				return;
			case GeoDSLPackage.GEO_MODEL__PWA:
				setPwa((Boolean)newValue);
				return;
			case GeoDSLPackage.GEO_MODEL__NAME:
				setName((String)newValue);
				return;
			case GeoDSLPackage.GEO_MODEL__HAS_LONG_NAME:
				setHasLongName((Boolean)newValue);
				return;
			case GeoDSLPackage.GEO_MODEL__LONG_NAME:
				setLongName((String)newValue);
				return;
			case GeoDSLPackage.GEO_MODEL__THEME:
				setTheme((GeoTheme)newValue);
				return;
			case GeoDSLPackage.GEO_MODEL__HAS_STYLE:
				setHasStyle((Boolean)newValue);
				return;
			case GeoDSLPackage.GEO_MODEL__STYLE:
				setStyle((String)newValue);
				return;
			case GeoDSLPackage.GEO_MODEL__LAYOUT:
				setLayout((GeoLayout)newValue);
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
			case GeoDSLPackage.GEO_MODEL__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case GeoDSLPackage.GEO_MODEL__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case GeoDSLPackage.GEO_MODEL__PWA:
				setPwa(PWA_EDEFAULT);
				return;
			case GeoDSLPackage.GEO_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GeoDSLPackage.GEO_MODEL__HAS_LONG_NAME:
				setHasLongName(HAS_LONG_NAME_EDEFAULT);
				return;
			case GeoDSLPackage.GEO_MODEL__LONG_NAME:
				setLongName(LONG_NAME_EDEFAULT);
				return;
			case GeoDSLPackage.GEO_MODEL__THEME:
				setTheme(THEME_EDEFAULT);
				return;
			case GeoDSLPackage.GEO_MODEL__HAS_STYLE:
				setHasStyle(HAS_STYLE_EDEFAULT);
				return;
			case GeoDSLPackage.GEO_MODEL__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case GeoDSLPackage.GEO_MODEL__LAYOUT:
				setLayout((GeoLayout)null);
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
			case GeoDSLPackage.GEO_MODEL__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case GeoDSLPackage.GEO_MODEL__PORT:
				return port != PORT_EDEFAULT;
			case GeoDSLPackage.GEO_MODEL__PWA:
				return pwa != PWA_EDEFAULT;
			case GeoDSLPackage.GEO_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GeoDSLPackage.GEO_MODEL__HAS_LONG_NAME:
				return hasLongName != HAS_LONG_NAME_EDEFAULT;
			case GeoDSLPackage.GEO_MODEL__LONG_NAME:
				return LONG_NAME_EDEFAULT == null ? longName != null : !LONG_NAME_EDEFAULT.equals(longName);
			case GeoDSLPackage.GEO_MODEL__THEME:
				return theme != THEME_EDEFAULT;
			case GeoDSLPackage.GEO_MODEL__HAS_STYLE:
				return hasStyle != HAS_STYLE_EDEFAULT;
			case GeoDSLPackage.GEO_MODEL__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case GeoDSLPackage.GEO_MODEL__LAYOUT:
				return layout != null;
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
		result.append(" (packageName: ");
		result.append(packageName);
		result.append(", port: ");
		result.append(port);
		result.append(", pwa: ");
		result.append(pwa);
		result.append(", name: ");
		result.append(name);
		result.append(", hasLongName: ");
		result.append(hasLongName);
		result.append(", longName: ");
		result.append(longName);
		result.append(", theme: ");
		result.append(theme);
		result.append(", hasStyle: ");
		result.append(hasStyle);
		result.append(", style: ");
		result.append(style);
		result.append(')');
		return result.toString();
	}

} //GeoModelImpl
