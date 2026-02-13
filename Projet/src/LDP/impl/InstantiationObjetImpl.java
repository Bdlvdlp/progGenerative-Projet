/**
 */
package LDP.impl;

import LDP.InstantiationObjet;
import LDP.LDPPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instantiation Objet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDP.impl.InstantiationObjetImpl#getNomClasse <em>Nom Classe</em>}</li>
 *   <li>{@link LDP.impl.InstantiationObjetImpl#getNomVariable <em>Nom Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstantiationObjetImpl extends ActionImpl implements InstantiationObjet {
	/**
	 * The default value of the '{@link #getNomClasse() <em>Nom Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomClasse()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_CLASSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomClasse() <em>Nom Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomClasse()
	 * @generated
	 * @ordered
	 */
	protected String nomClasse = NOM_CLASSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomVariable() <em>Nom Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomVariable() <em>Nom Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomVariable()
	 * @generated
	 * @ordered
	 */
	protected String nomVariable = NOM_VARIABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantiationObjetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDPPackage.Literals.INSTANTIATION_OBJET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNomClasse() {
		return nomClasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNomClasse(String newNomClasse) {
		String oldNomClasse = nomClasse;
		nomClasse = newNomClasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.INSTANTIATION_OBJET__NOM_CLASSE, oldNomClasse, nomClasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNomVariable() {
		return nomVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNomVariable(String newNomVariable) {
		String oldNomVariable = nomVariable;
		nomVariable = newNomVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.INSTANTIATION_OBJET__NOM_VARIABLE, oldNomVariable, nomVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LDPPackage.INSTANTIATION_OBJET__NOM_CLASSE:
				return getNomClasse();
			case LDPPackage.INSTANTIATION_OBJET__NOM_VARIABLE:
				return getNomVariable();
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
			case LDPPackage.INSTANTIATION_OBJET__NOM_CLASSE:
				setNomClasse((String)newValue);
				return;
			case LDPPackage.INSTANTIATION_OBJET__NOM_VARIABLE:
				setNomVariable((String)newValue);
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
			case LDPPackage.INSTANTIATION_OBJET__NOM_CLASSE:
				setNomClasse(NOM_CLASSE_EDEFAULT);
				return;
			case LDPPackage.INSTANTIATION_OBJET__NOM_VARIABLE:
				setNomVariable(NOM_VARIABLE_EDEFAULT);
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
			case LDPPackage.INSTANTIATION_OBJET__NOM_CLASSE:
				return NOM_CLASSE_EDEFAULT == null ? nomClasse != null : !NOM_CLASSE_EDEFAULT.equals(nomClasse);
			case LDPPackage.INSTANTIATION_OBJET__NOM_VARIABLE:
				return NOM_VARIABLE_EDEFAULT == null ? nomVariable != null : !NOM_VARIABLE_EDEFAULT.equals(nomVariable);
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
		result.append(" (nomClasse: ");
		result.append(nomClasse);
		result.append(", nomVariable: ");
		result.append(nomVariable);
		result.append(')');
		return result.toString();
	}

} //InstantiationObjetImpl
