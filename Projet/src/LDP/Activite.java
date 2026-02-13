/**
 */
package LDP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.Activite#getPrecedente <em>Precedente</em>}</li>
 *   <li>{@link LDP.Activite#getSuivante <em>Suivante</em>}</li>
 *   <li>{@link LDP.Activite#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getActivite()
 * @model
 * @generated
 */
public interface Activite extends ElementProcessus {
	/**
	 * Returns the value of the '<em><b>Precedente</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LDP.Activite#getSuivante <em>Suivante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedente</em>' reference.
	 * @see #setPrecedente(Activite)
	 * @see LDP.LDPPackage#getActivite_Precedente()
	 * @see LDP.Activite#getSuivante
	 * @model opposite="suivante"
	 * @generated
	 */
	Activite getPrecedente();

	/**
	 * Sets the value of the '{@link LDP.Activite#getPrecedente <em>Precedente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedente</em>' reference.
	 * @see #getPrecedente()
	 * @generated
	 */
	void setPrecedente(Activite value);

	/**
	 * Returns the value of the '<em><b>Suivante</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LDP.Activite#getPrecedente <em>Precedente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suivante</em>' reference.
	 * @see #setSuivante(Activite)
	 * @see LDP.LDPPackage#getActivite_Suivante()
	 * @see LDP.Activite#getPrecedente
	 * @model opposite="precedente"
	 * @generated
	 */
	Activite getSuivante();

	/**
	 * Sets the value of the '{@link LDP.Activite#getSuivante <em>Suivante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suivante</em>' reference.
	 * @see #getSuivante()
	 * @generated
	 */
	void setSuivante(Activite value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link LDP.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see LDP.LDPPackage#getActivite_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Activite
