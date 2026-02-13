/**
 */
package LDP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.Fin#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getFin()
 * @model
 * @generated
 */
public interface Fin extends PseudoEtat {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(ElementProcessus)
	 * @see LDP.LDPPackage#getFin_Reference()
	 * @model required="true"
	 * @generated
	 */
	ElementProcessus getReference();

	/**
	 * Sets the value of the '{@link LDP.Fin#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ElementProcessus value);

} // Fin
