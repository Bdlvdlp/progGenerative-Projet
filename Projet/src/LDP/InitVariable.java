/**
 */
package LDP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.InitVariable#getNomVariable <em>Nom Variable</em>}</li>
 *   <li>{@link LDP.InitVariable#getType <em>Type</em>}</li>
 *   <li>{@link LDP.InitVariable#getValeurInitiale <em>Valeur Initiale</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getInitVariable()
 * @model
 * @generated
 */
public interface InitVariable extends Action {
	/**
	 * Returns the value of the '<em><b>Nom Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Variable</em>' attribute.
	 * @see #setNomVariable(String)
	 * @see LDP.LDPPackage#getInitVariable_NomVariable()
	 * @model
	 * @generated
	 */
	String getNomVariable();

	/**
	 * Sets the value of the '{@link LDP.InitVariable#getNomVariable <em>Nom Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Variable</em>' attribute.
	 * @see #getNomVariable()
	 * @generated
	 */
	void setNomVariable(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link LDP.TypePrimitif}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see LDP.TypePrimitif
	 * @see #setType(TypePrimitif)
	 * @see LDP.LDPPackage#getInitVariable_Type()
	 * @model
	 * @generated
	 */
	TypePrimitif getType();

	/**
	 * Sets the value of the '{@link LDP.InitVariable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see LDP.TypePrimitif
	 * @see #getType()
	 * @generated
	 */
	void setType(TypePrimitif value);

	/**
	 * Returns the value of the '<em><b>Valeur Initiale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur Initiale</em>' attribute.
	 * @see #setValeurInitiale(String)
	 * @see LDP.LDPPackage#getInitVariable_ValeurInitiale()
	 * @model
	 * @generated
	 */
	String getValeurInitiale();

	/**
	 * Sets the value of the '{@link LDP.InitVariable#getValeurInitiale <em>Valeur Initiale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur Initiale</em>' attribute.
	 * @see #getValeurInitiale()
	 * @generated
	 */
	void setValeurInitiale(String value);

} // InitVariable
