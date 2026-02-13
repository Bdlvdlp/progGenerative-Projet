/**
 */
package LDP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Debut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.Debut#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getDebut()
 * @model
 * @generated
 */
public interface Debut extends PseudoEtat {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(ElementProcessus)
	 * @see LDP.LDPPackage#getDebut_Reference()
	 * @model required="true"
	 * @generated
	 */
	ElementProcessus getReference();

	/**
	 * Sets the value of the '{@link LDP.Debut#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ElementProcessus value);

} // Debut
