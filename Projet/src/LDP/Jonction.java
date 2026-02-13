/**
 */
package LDP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jonction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.Jonction#getBranches <em>Branches</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getJonction()
 * @model
 * @generated
 */
public interface Jonction extends ElementProcessus {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' reference list.
	 * The list contents are of type {@link LDP.Activite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' reference list.
	 * @see LDP.LDPPackage#getJonction_Branches()
	 * @model
	 * @generated
	 */
	EList<Activite> getBranches();

} // Jonction
