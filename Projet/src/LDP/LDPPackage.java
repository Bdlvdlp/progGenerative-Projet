/**
 */
package LDP;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see LDP.LDPFactory
 * @model kind="package"
 * @generated
 */
public interface LDPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LDP";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://LDP/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "LDP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LDPPackage eINSTANCE = LDP.impl.LDPPackageImpl.init();

	/**
	 * The meta object id for the '{@link LDP.impl.ProcessusImpl <em>Processus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.ProcessusImpl
	 * @see LDP.impl.LDPPackageImpl#getProcessus()
	 * @generated
	 */
	int PROCESSUS = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__NOM = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Activite Courante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__ACTIVITE_COURANTE = 2;

	/**
	 * The feature id for the '<em><b>Debut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__DEBUT = 3;

	/**
	 * The feature id for the '<em><b>Fin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__FIN = 4;

	/**
	 * The number of structural features of the '<em>Processus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Processus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDP.impl.ElementProcessusImpl <em>Element Processus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.ElementProcessusImpl
	 * @see LDP.impl.LDPPackageImpl#getElementProcessus()
	 * @generated
	 */
	int ELEMENT_PROCESSUS = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROCESSUS__NOM = 0;

	/**
	 * The number of structural features of the '<em>Element Processus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROCESSUS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element Processus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROCESSUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDP.impl.ActiviteImpl <em>Activite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.ActiviteImpl
	 * @see LDP.impl.LDPPackageImpl#getActivite()
	 * @generated
	 */
	int ACTIVITE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__NOM = ELEMENT_PROCESSUS__NOM;

	/**
	 * The feature id for the '<em><b>Precedente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__PRECEDENTE = ELEMENT_PROCESSUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suivante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__SUIVANTE = ELEMENT_PROCESSUS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__ACTIONS = ELEMENT_PROCESSUS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE_FEATURE_COUNT = ELEMENT_PROCESSUS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Activite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE_OPERATION_COUNT = ELEMENT_PROCESSUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP.impl.PseudoEtatImpl <em>Pseudo Etat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.PseudoEtatImpl
	 * @see LDP.impl.LDPPackageImpl#getPseudoEtat()
	 * @generated
	 */
	int PSEUDO_ETAT = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_ETAT__NOM = ELEMENT_PROCESSUS__NOM;

	/**
	 * The number of structural features of the '<em>Pseudo Etat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_ETAT_FEATURE_COUNT = ELEMENT_PROCESSUS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pseudo Etat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_ETAT_OPERATION_COUNT = ELEMENT_PROCESSUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP.impl.DebutImpl <em>Debut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.DebutImpl
	 * @see LDP.impl.LDPPackageImpl#getDebut()
	 * @generated
	 */
	int DEBUT = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUT__NOM = PSEUDO_ETAT__NOM;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUT__REFERENCE = PSEUDO_ETAT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Debut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUT_FEATURE_COUNT = PSEUDO_ETAT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Debut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUT_OPERATION_COUNT = PSEUDO_ETAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP.impl.FinImpl <em>Fin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.FinImpl
	 * @see LDP.impl.LDPPackageImpl#getFin()
	 * @generated
	 */
	int FIN = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN__NOM = PSEUDO_ETAT__NOM;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN__REFERENCE = PSEUDO_ETAT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_FEATURE_COUNT = PSEUDO_ETAT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_OPERATION_COUNT = PSEUDO_ETAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.ActionImpl
	 * @see LDP.impl.LDPPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 6;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NOM = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDP.impl.InitVariableImpl <em>Init Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.InitVariableImpl
	 * @see LDP.impl.LDPPackageImpl#getInitVariable()
	 * @generated
	 */
	int INIT_VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_VARIABLE__NOM = ACTION__NOM;

	/**
	 * The feature id for the '<em><b>Nom Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_VARIABLE__NOM_VARIABLE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_VARIABLE__TYPE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valeur Initiale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_VARIABLE__VALEUR_INITIALE = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Init Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_VARIABLE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Init Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_VARIABLE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP.impl.InstantiationObjetImpl <em>Instantiation Objet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.InstantiationObjetImpl
	 * @see LDP.impl.LDPPackageImpl#getInstantiationObjet()
	 * @generated
	 */
	int INSTANTIATION_OBJET = 8;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_OBJET__NOM = ACTION__NOM;

	/**
	 * The feature id for the '<em><b>Nom Classe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_OBJET__NOM_CLASSE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nom Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_OBJET__NOM_VARIABLE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instantiation Objet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_OBJET_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instantiation Objet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_OBJET_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP.impl.AppelMethodeImpl <em>Appel Methode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.AppelMethodeImpl
	 * @see LDP.impl.LDPPackageImpl#getAppelMethode()
	 * @generated
	 */
	int APPEL_METHODE = 9;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_METHODE__NOM = ACTION__NOM;

	/**
	 * The feature id for the '<em><b>Nom Methode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_METHODE__NOM_METHODE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objet Cible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_METHODE__OBJET_CIBLE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parametres</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_METHODE__PARAMETRES = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resultat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_METHODE__RESULTAT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Appel Methode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_METHODE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Appel Methode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_METHODE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP.TypePrimitif <em>Type Primitif</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.TypePrimitif
	 * @see LDP.impl.LDPPackageImpl#getTypePrimitif()
	 * @generated
	 */
	int TYPE_PRIMITIF = 10;


	/**
	 * Returns the meta object for class '{@link LDP.Processus <em>Processus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processus</em>'.
	 * @see LDP.Processus
	 * @generated
	 */
	EClass getProcessus();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Processus#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LDP.Processus#getNom()
	 * @see #getProcessus()
	 * @generated
	 */
	EAttribute getProcessus_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link LDP.Processus#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see LDP.Processus#getElements()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Elements();

	/**
	 * Returns the meta object for the reference '{@link LDP.Processus#getActiviteCourante <em>Activite Courante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activite Courante</em>'.
	 * @see LDP.Processus#getActiviteCourante()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_ActiviteCourante();

	/**
	 * Returns the meta object for the containment reference '{@link LDP.Processus#getDebut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Debut</em>'.
	 * @see LDP.Processus#getDebut()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Debut();

	/**
	 * Returns the meta object for the containment reference '{@link LDP.Processus#getFin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fin</em>'.
	 * @see LDP.Processus#getFin()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Fin();

	/**
	 * Returns the meta object for class '{@link LDP.ElementProcessus <em>Element Processus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Processus</em>'.
	 * @see LDP.ElementProcessus
	 * @generated
	 */
	EClass getElementProcessus();

	/**
	 * Returns the meta object for the attribute '{@link LDP.ElementProcessus#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LDP.ElementProcessus#getNom()
	 * @see #getElementProcessus()
	 * @generated
	 */
	EAttribute getElementProcessus_Nom();

	/**
	 * Returns the meta object for class '{@link LDP.Activite <em>Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activite</em>'.
	 * @see LDP.Activite
	 * @generated
	 */
	EClass getActivite();

	/**
	 * Returns the meta object for the reference '{@link LDP.Activite#getPrecedente <em>Precedente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precedente</em>'.
	 * @see LDP.Activite#getPrecedente()
	 * @see #getActivite()
	 * @generated
	 */
	EReference getActivite_Precedente();

	/**
	 * Returns the meta object for the reference '{@link LDP.Activite#getSuivante <em>Suivante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Suivante</em>'.
	 * @see LDP.Activite#getSuivante()
	 * @see #getActivite()
	 * @generated
	 */
	EReference getActivite_Suivante();

	/**
	 * Returns the meta object for the containment reference list '{@link LDP.Activite#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see LDP.Activite#getActions()
	 * @see #getActivite()
	 * @generated
	 */
	EReference getActivite_Actions();

	/**
	 * Returns the meta object for class '{@link LDP.PseudoEtat <em>Pseudo Etat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudo Etat</em>'.
	 * @see LDP.PseudoEtat
	 * @generated
	 */
	EClass getPseudoEtat();

	/**
	 * Returns the meta object for class '{@link LDP.Debut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Debut</em>'.
	 * @see LDP.Debut
	 * @generated
	 */
	EClass getDebut();

	/**
	 * Returns the meta object for the reference '{@link LDP.Debut#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see LDP.Debut#getReference()
	 * @see #getDebut()
	 * @generated
	 */
	EReference getDebut_Reference();

	/**
	 * Returns the meta object for class '{@link LDP.Fin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin</em>'.
	 * @see LDP.Fin
	 * @generated
	 */
	EClass getFin();

	/**
	 * Returns the meta object for the reference '{@link LDP.Fin#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see LDP.Fin#getReference()
	 * @see #getFin()
	 * @generated
	 */
	EReference getFin_Reference();

	/**
	 * Returns the meta object for class '{@link LDP.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see LDP.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Action#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LDP.Action#getNom()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Nom();

	/**
	 * Returns the meta object for class '{@link LDP.InitVariable <em>Init Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Variable</em>'.
	 * @see LDP.InitVariable
	 * @generated
	 */
	EClass getInitVariable();

	/**
	 * Returns the meta object for the attribute '{@link LDP.InitVariable#getNomVariable <em>Nom Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Variable</em>'.
	 * @see LDP.InitVariable#getNomVariable()
	 * @see #getInitVariable()
	 * @generated
	 */
	EAttribute getInitVariable_NomVariable();

	/**
	 * Returns the meta object for the attribute '{@link LDP.InitVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see LDP.InitVariable#getType()
	 * @see #getInitVariable()
	 * @generated
	 */
	EAttribute getInitVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link LDP.InitVariable#getValeurInitiale <em>Valeur Initiale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur Initiale</em>'.
	 * @see LDP.InitVariable#getValeurInitiale()
	 * @see #getInitVariable()
	 * @generated
	 */
	EAttribute getInitVariable_ValeurInitiale();

	/**
	 * Returns the meta object for class '{@link LDP.InstantiationObjet <em>Instantiation Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantiation Objet</em>'.
	 * @see LDP.InstantiationObjet
	 * @generated
	 */
	EClass getInstantiationObjet();

	/**
	 * Returns the meta object for the attribute '{@link LDP.InstantiationObjet#getNomClasse <em>Nom Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Classe</em>'.
	 * @see LDP.InstantiationObjet#getNomClasse()
	 * @see #getInstantiationObjet()
	 * @generated
	 */
	EAttribute getInstantiationObjet_NomClasse();

	/**
	 * Returns the meta object for the attribute '{@link LDP.InstantiationObjet#getNomVariable <em>Nom Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Variable</em>'.
	 * @see LDP.InstantiationObjet#getNomVariable()
	 * @see #getInstantiationObjet()
	 * @generated
	 */
	EAttribute getInstantiationObjet_NomVariable();

	/**
	 * Returns the meta object for class '{@link LDP.AppelMethode <em>Appel Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appel Methode</em>'.
	 * @see LDP.AppelMethode
	 * @generated
	 */
	EClass getAppelMethode();

	/**
	 * Returns the meta object for the attribute '{@link LDP.AppelMethode#getNomMethode <em>Nom Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Methode</em>'.
	 * @see LDP.AppelMethode#getNomMethode()
	 * @see #getAppelMethode()
	 * @generated
	 */
	EAttribute getAppelMethode_NomMethode();

	/**
	 * Returns the meta object for the attribute '{@link LDP.AppelMethode#getObjetCible <em>Objet Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objet Cible</em>'.
	 * @see LDP.AppelMethode#getObjetCible()
	 * @see #getAppelMethode()
	 * @generated
	 */
	EAttribute getAppelMethode_ObjetCible();

	/**
	 * Returns the meta object for the attribute list '{@link LDP.AppelMethode#getParametres <em>Parametres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parametres</em>'.
	 * @see LDP.AppelMethode#getParametres()
	 * @see #getAppelMethode()
	 * @generated
	 */
	EAttribute getAppelMethode_Parametres();

	/**
	 * Returns the meta object for the attribute '{@link LDP.AppelMethode#getResultat <em>Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resultat</em>'.
	 * @see LDP.AppelMethode#getResultat()
	 * @see #getAppelMethode()
	 * @generated
	 */
	EAttribute getAppelMethode_Resultat();

	/**
	 * Returns the meta object for enum '{@link LDP.TypePrimitif <em>Type Primitif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Primitif</em>'.
	 * @see LDP.TypePrimitif
	 * @generated
	 */
	EEnum getTypePrimitif();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LDPFactory getLDPFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link LDP.impl.ProcessusImpl <em>Processus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.ProcessusImpl
		 * @see LDP.impl.LDPPackageImpl#getProcessus()
		 * @generated
		 */
		EClass PROCESSUS = eINSTANCE.getProcessus();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSUS__NOM = eINSTANCE.getProcessus_Nom();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__ELEMENTS = eINSTANCE.getProcessus_Elements();

		/**
		 * The meta object literal for the '<em><b>Activite Courante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__ACTIVITE_COURANTE = eINSTANCE.getProcessus_ActiviteCourante();

		/**
		 * The meta object literal for the '<em><b>Debut</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__DEBUT = eINSTANCE.getProcessus_Debut();

		/**
		 * The meta object literal for the '<em><b>Fin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__FIN = eINSTANCE.getProcessus_Fin();

		/**
		 * The meta object literal for the '{@link LDP.impl.ElementProcessusImpl <em>Element Processus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.ElementProcessusImpl
		 * @see LDP.impl.LDPPackageImpl#getElementProcessus()
		 * @generated
		 */
		EClass ELEMENT_PROCESSUS = eINSTANCE.getElementProcessus();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_PROCESSUS__NOM = eINSTANCE.getElementProcessus_Nom();

		/**
		 * The meta object literal for the '{@link LDP.impl.ActiviteImpl <em>Activite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.ActiviteImpl
		 * @see LDP.impl.LDPPackageImpl#getActivite()
		 * @generated
		 */
		EClass ACTIVITE = eINSTANCE.getActivite();

		/**
		 * The meta object literal for the '<em><b>Precedente</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITE__PRECEDENTE = eINSTANCE.getActivite_Precedente();

		/**
		 * The meta object literal for the '<em><b>Suivante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITE__SUIVANTE = eINSTANCE.getActivite_Suivante();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITE__ACTIONS = eINSTANCE.getActivite_Actions();

		/**
		 * The meta object literal for the '{@link LDP.impl.PseudoEtatImpl <em>Pseudo Etat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.PseudoEtatImpl
		 * @see LDP.impl.LDPPackageImpl#getPseudoEtat()
		 * @generated
		 */
		EClass PSEUDO_ETAT = eINSTANCE.getPseudoEtat();

		/**
		 * The meta object literal for the '{@link LDP.impl.DebutImpl <em>Debut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.DebutImpl
		 * @see LDP.impl.LDPPackageImpl#getDebut()
		 * @generated
		 */
		EClass DEBUT = eINSTANCE.getDebut();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEBUT__REFERENCE = eINSTANCE.getDebut_Reference();

		/**
		 * The meta object literal for the '{@link LDP.impl.FinImpl <em>Fin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.FinImpl
		 * @see LDP.impl.LDPPackageImpl#getFin()
		 * @generated
		 */
		EClass FIN = eINSTANCE.getFin();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN__REFERENCE = eINSTANCE.getFin_Reference();

		/**
		 * The meta object literal for the '{@link LDP.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.ActionImpl
		 * @see LDP.impl.LDPPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NOM = eINSTANCE.getAction_Nom();

		/**
		 * The meta object literal for the '{@link LDP.impl.InitVariableImpl <em>Init Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.InitVariableImpl
		 * @see LDP.impl.LDPPackageImpl#getInitVariable()
		 * @generated
		 */
		EClass INIT_VARIABLE = eINSTANCE.getInitVariable();

		/**
		 * The meta object literal for the '<em><b>Nom Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_VARIABLE__NOM_VARIABLE = eINSTANCE.getInitVariable_NomVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_VARIABLE__TYPE = eINSTANCE.getInitVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Valeur Initiale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_VARIABLE__VALEUR_INITIALE = eINSTANCE.getInitVariable_ValeurInitiale();

		/**
		 * The meta object literal for the '{@link LDP.impl.InstantiationObjetImpl <em>Instantiation Objet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.InstantiationObjetImpl
		 * @see LDP.impl.LDPPackageImpl#getInstantiationObjet()
		 * @generated
		 */
		EClass INSTANTIATION_OBJET = eINSTANCE.getInstantiationObjet();

		/**
		 * The meta object literal for the '<em><b>Nom Classe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANTIATION_OBJET__NOM_CLASSE = eINSTANCE.getInstantiationObjet_NomClasse();

		/**
		 * The meta object literal for the '<em><b>Nom Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANTIATION_OBJET__NOM_VARIABLE = eINSTANCE.getInstantiationObjet_NomVariable();

		/**
		 * The meta object literal for the '{@link LDP.impl.AppelMethodeImpl <em>Appel Methode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.AppelMethodeImpl
		 * @see LDP.impl.LDPPackageImpl#getAppelMethode()
		 * @generated
		 */
		EClass APPEL_METHODE = eINSTANCE.getAppelMethode();

		/**
		 * The meta object literal for the '<em><b>Nom Methode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEL_METHODE__NOM_METHODE = eINSTANCE.getAppelMethode_NomMethode();

		/**
		 * The meta object literal for the '<em><b>Objet Cible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEL_METHODE__OBJET_CIBLE = eINSTANCE.getAppelMethode_ObjetCible();

		/**
		 * The meta object literal for the '<em><b>Parametres</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEL_METHODE__PARAMETRES = eINSTANCE.getAppelMethode_Parametres();

		/**
		 * The meta object literal for the '<em><b>Resultat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEL_METHODE__RESULTAT = eINSTANCE.getAppelMethode_Resultat();

		/**
		 * The meta object literal for the '{@link LDP.TypePrimitif <em>Type Primitif</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.TypePrimitif
		 * @see LDP.impl.LDPPackageImpl#getTypePrimitif()
		 * @generated
		 */
		EEnum TYPE_PRIMITIF = eINSTANCE.getTypePrimitif();

	}

} //LDPPackage
