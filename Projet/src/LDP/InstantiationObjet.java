/**
 */
package LDP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiation Objet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.InstantiationObjet#getNomClasse <em>Nom Classe</em>}</li>
 *   <li>{@link LDP.InstantiationObjet#getNomVariable <em>Nom Variable</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getInstantiationObjet()
 * @model
 * @generated
 */
public interface InstantiationObjet extends Action {
	/**
	 * Returns the value of the '<em><b>Nom Classe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Classe</em>' attribute.
	 * @see #setNomClasse(String)
	 * @see LDP.LDPPackage#getInstantiationObjet_NomClasse()
	 * @model
	 * @generated
	 */
	String getNomClasse();

	/**
	 * Sets the value of the '{@link LDP.InstantiationObjet#getNomClasse <em>Nom Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Classe</em>' attribute.
	 * @see #getNomClasse()
	 * @generated
	 */
	void setNomClasse(String value);

	/**
	 * Returns the value of the '<em><b>Nom Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Variable</em>' attribute.
	 * @see #setNomVariable(String)
	 * @see LDP.LDPPackage#getInstantiationObjet_NomVariable()
	 * @model
	 * @generated
	 */
	String getNomVariable();

	/**
	 * Sets the value of the '{@link LDP.InstantiationObjet#getNomVariable <em>Nom Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Variable</em>' attribute.
	 * @see #getNomVariable()
	 * @generated
	 */
	void setNomVariable(String value);

} // InstantiationObjet
