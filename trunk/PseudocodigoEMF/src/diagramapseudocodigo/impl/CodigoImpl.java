/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Codigo;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.Subproceso;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Codigo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.CodigoImpl#getTiene <em>Tiene</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.CodigoImpl#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.CodigoImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodigoImpl extends EObjectImpl implements Codigo {
	/**
	 * The cached value of the '{@link #getTiene() <em>Tiene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiene()
	 * @generated
	 * @ordered
	 */
	public Inicio tiene;

	/**
	 * The cached value of the '{@link #getFuncion() <em>Funcion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncion()
	 * @generated
	 * @ordered
	 */
	public EList<Subproceso> funcion;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	public static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	public String nombre = NOMBRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodigoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.CODIGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inicio getTiene() {
		return tiene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTiene(Inicio newTiene, NotificationChain msgs) {
		Inicio oldTiene = tiene;
		tiene = newTiene;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.CODIGO__TIENE, oldTiene, newTiene);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiene(Inicio newTiene) {
		if (newTiene != tiene) {
			NotificationChain msgs = null;
			if (tiene != null)
				msgs = ((InternalEObject)tiene).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.CODIGO__TIENE, null, msgs);
			if (newTiene != null)
				msgs = ((InternalEObject)newTiene).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.CODIGO__TIENE, null, msgs);
			msgs = basicSetTiene(newTiene, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.CODIGO__TIENE, newTiene, newTiene));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subproceso> getFuncion() {
		if (funcion == null) {
			funcion = new EObjectContainmentEList<Subproceso>(Subproceso.class, this, DiagramapseudocodigoPackage.CODIGO__FUNCION);
		}
		return funcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.CODIGO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.CODIGO__TIENE:
				return basicSetTiene(null, msgs);
			case DiagramapseudocodigoPackage.CODIGO__FUNCION:
				return ((InternalEList<?>)getFuncion()).basicRemove(otherEnd, msgs);
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
			case DiagramapseudocodigoPackage.CODIGO__TIENE:
				return getTiene();
			case DiagramapseudocodigoPackage.CODIGO__FUNCION:
				return getFuncion();
			case DiagramapseudocodigoPackage.CODIGO__NOMBRE:
				return getNombre();
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
			case DiagramapseudocodigoPackage.CODIGO__TIENE:
				setTiene((Inicio)newValue);
				return;
			case DiagramapseudocodigoPackage.CODIGO__FUNCION:
				getFuncion().clear();
				getFuncion().addAll((Collection<? extends Subproceso>)newValue);
				return;
			case DiagramapseudocodigoPackage.CODIGO__NOMBRE:
				setNombre((String)newValue);
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
			case DiagramapseudocodigoPackage.CODIGO__TIENE:
				setTiene((Inicio)null);
				return;
			case DiagramapseudocodigoPackage.CODIGO__FUNCION:
				getFuncion().clear();
				return;
			case DiagramapseudocodigoPackage.CODIGO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
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
			case DiagramapseudocodigoPackage.CODIGO__TIENE:
				return tiene != null;
			case DiagramapseudocodigoPackage.CODIGO__FUNCION:
				return funcion != null && !funcion.isEmpty();
			case DiagramapseudocodigoPackage.CODIGO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //CodigoImpl
