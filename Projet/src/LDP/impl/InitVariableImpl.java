/**
 */
package LDP.impl;

import LDP.InitVariable;
import LDP.LDPPackage;
import LDP.TypePrimitif;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDP.impl.InitVariableImpl#getNomVariable <em>Nom Variable</em>}</li>
 *   <li>{@link LDP.impl.InitVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link LDP.impl.InitVariableImpl#getValeurInitiale <em>Valeur Initiale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitVariableImpl extends ActionImpl implements InitVariable {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypePrimitif TYPE_EDEFAULT = TypePrimitif.INT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypePrimitif type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValeurInitiale() <em>Valeur Initiale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeurInitiale()
	 * @generated
	 * @ordered
	 */
	protected static final String VALEUR_INITIALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValeurInitiale() <em>Valeur Initiale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeurInitiale()
	 * @generated
	 * @ordered
	 */
	protected String valeurInitiale = VALEUR_INITIALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDPPackage.Literals.INIT_VARIABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.INIT_VARIABLE__NOM_VARIABLE, oldNomVariable, nomVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypePrimitif getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypePrimitif newType) {
		TypePrimitif oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.INIT_VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValeurInitiale() {
		return valeurInitiale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValeurInitiale(String newValeurInitiale) {
		String oldValeurInitiale = valeurInitiale;
		valeurInitiale = newValeurInitiale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.INIT_VARIABLE__VALEUR_INITIALE, oldValeurInitiale, valeurInitiale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LDPPackage.INIT_VARIABLE__NOM_VARIABLE:
				return getNomVariable();
			case LDPPackage.INIT_VARIABLE__TYPE:
				return getType();
			case LDPPackage.INIT_VARIABLE__VALEUR_INITIALE:
				return getValeurInitiale();
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
			case LDPPackage.INIT_VARIABLE__NOM_VARIABLE:
				setNomVariable((String)newValue);
				return;
			case LDPPackage.INIT_VARIABLE__TYPE:
				setType((TypePrimitif)newValue);
				return;
			case LDPPackage.INIT_VARIABLE__VALEUR_INITIALE:
				setValeurInitiale((String)newValue);
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
			case LDPPackage.INIT_VARIABLE__NOM_VARIABLE:
				setNomVariable(NOM_VARIABLE_EDEFAULT);
				return;
			case LDPPackage.INIT_VARIABLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case LDPPackage.INIT_VARIABLE__VALEUR_INITIALE:
				setValeurInitiale(VALEUR_INITIALE_EDEFAULT);
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
			case LDPPackage.INIT_VARIABLE__NOM_VARIABLE:
				return NOM_VARIABLE_EDEFAULT == null ? nomVariable != null : !NOM_VARIABLE_EDEFAULT.equals(nomVariable);
			case LDPPackage.INIT_VARIABLE__TYPE:
				return type != TYPE_EDEFAULT;
			case LDPPackage.INIT_VARIABLE__VALEUR_INITIALE:
				return VALEUR_INITIALE_EDEFAULT == null ? valeurInitiale != null : !VALEUR_INITIALE_EDEFAULT.equals(valeurInitiale);
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
		result.append(" (nomVariable: ");
		result.append(nomVariable);
		result.append(", type: ");
		result.append(type);
		result.append(", valeurInitiale: ");
		result.append(valeurInitiale);
		result.append(')');
		return result.toString();
	}

} //InitVariableImpl
