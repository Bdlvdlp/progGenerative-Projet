/**
 */
package LDP.impl;

import LDP.Action;
import LDP.Activite;
import LDP.AppelMethode;
import LDP.Debut;
import LDP.ElementProcessus;
import LDP.Fin;
import LDP.Fourche;
import LDP.InitVariable;
import LDP.InstantiationObjet;
import LDP.Jonction;
import LDP.LDPFactory;
import LDP.LDPPackage;
import LDP.Processus;
import LDP.PseudoEtat;
import LDP.TypePrimitif;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LDPPackageImpl extends EPackageImpl implements LDPPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementProcessusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pseudoEtatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass debutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantiationObjetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appelMethodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fourcheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jonctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typePrimitifEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see LDP.LDPPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LDPPackageImpl() {
		super(eNS_URI, LDPFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LDPPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LDPPackage init() {
		if (isInited) return (LDPPackage)EPackage.Registry.INSTANCE.getEPackage(LDPPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLDPPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LDPPackageImpl theLDPPackage = registeredLDPPackage instanceof LDPPackageImpl ? (LDPPackageImpl)registeredLDPPackage : new LDPPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLDPPackage.createPackageContents();

		// Initialize created meta-data
		theLDPPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLDPPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LDPPackage.eNS_URI, theLDPPackage);
		return theLDPPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessus() {
		return processusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessus_Nom() {
		return (EAttribute)processusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessus_Elements() {
		return (EReference)processusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessus_ActiviteCourante() {
		return (EReference)processusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessus_Debut() {
		return (EReference)processusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessus_Fin() {
		return (EReference)processusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementProcessus() {
		return elementProcessusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementProcessus_Nom() {
		return (EAttribute)elementProcessusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivite() {
		return activiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivite_Precedente() {
		return (EReference)activiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivite_Suivante() {
		return (EReference)activiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivite_Actions() {
		return (EReference)activiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPseudoEtat() {
		return pseudoEtatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDebut() {
		return debutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDebut_Reference() {
		return (EReference)debutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFin() {
		return finEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFin_Reference() {
		return (EReference)finEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Nom() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitVariable() {
		return initVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInitVariable_NomVariable() {
		return (EAttribute)initVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInitVariable_Type() {
		return (EAttribute)initVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInitVariable_ValeurInitiale() {
		return (EAttribute)initVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstantiationObjet() {
		return instantiationObjetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstantiationObjet_NomClasse() {
		return (EAttribute)instantiationObjetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstantiationObjet_NomVariable() {
		return (EAttribute)instantiationObjetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAppelMethode() {
		return appelMethodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppelMethode_NomMethode() {
		return (EAttribute)appelMethodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppelMethode_ObjetCible() {
		return (EAttribute)appelMethodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppelMethode_Parametres() {
		return (EAttribute)appelMethodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppelMethode_Resultat() {
		return (EAttribute)appelMethodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFourche() {
		return fourcheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFourche_Branches() {
		return (EReference)fourcheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJonction() {
		return jonctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJonction_Branches() {
		return (EReference)jonctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypePrimitif() {
		return typePrimitifEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LDPFactory getLDPFactory() {
		return (LDPFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		processusEClass = createEClass(PROCESSUS);
		createEAttribute(processusEClass, PROCESSUS__NOM);
		createEReference(processusEClass, PROCESSUS__ELEMENTS);
		createEReference(processusEClass, PROCESSUS__ACTIVITE_COURANTE);
		createEReference(processusEClass, PROCESSUS__DEBUT);
		createEReference(processusEClass, PROCESSUS__FIN);

		elementProcessusEClass = createEClass(ELEMENT_PROCESSUS);
		createEAttribute(elementProcessusEClass, ELEMENT_PROCESSUS__NOM);

		activiteEClass = createEClass(ACTIVITE);
		createEReference(activiteEClass, ACTIVITE__PRECEDENTE);
		createEReference(activiteEClass, ACTIVITE__SUIVANTE);
		createEReference(activiteEClass, ACTIVITE__ACTIONS);

		pseudoEtatEClass = createEClass(PSEUDO_ETAT);

		debutEClass = createEClass(DEBUT);
		createEReference(debutEClass, DEBUT__REFERENCE);

		finEClass = createEClass(FIN);
		createEReference(finEClass, FIN__REFERENCE);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__NOM);

		initVariableEClass = createEClass(INIT_VARIABLE);
		createEAttribute(initVariableEClass, INIT_VARIABLE__NOM_VARIABLE);
		createEAttribute(initVariableEClass, INIT_VARIABLE__TYPE);
		createEAttribute(initVariableEClass, INIT_VARIABLE__VALEUR_INITIALE);

		instantiationObjetEClass = createEClass(INSTANTIATION_OBJET);
		createEAttribute(instantiationObjetEClass, INSTANTIATION_OBJET__NOM_CLASSE);
		createEAttribute(instantiationObjetEClass, INSTANTIATION_OBJET__NOM_VARIABLE);

		appelMethodeEClass = createEClass(APPEL_METHODE);
		createEAttribute(appelMethodeEClass, APPEL_METHODE__NOM_METHODE);
		createEAttribute(appelMethodeEClass, APPEL_METHODE__OBJET_CIBLE);
		createEAttribute(appelMethodeEClass, APPEL_METHODE__PARAMETRES);
		createEAttribute(appelMethodeEClass, APPEL_METHODE__RESULTAT);

		fourcheEClass = createEClass(FOURCHE);
		createEReference(fourcheEClass, FOURCHE__BRANCHES);

		jonctionEClass = createEClass(JONCTION);
		createEReference(jonctionEClass, JONCTION__BRANCHES);

		// Create enums
		typePrimitifEEnum = createEEnum(TYPE_PRIMITIF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activiteEClass.getESuperTypes().add(this.getElementProcessus());
		pseudoEtatEClass.getESuperTypes().add(this.getElementProcessus());
		debutEClass.getESuperTypes().add(this.getPseudoEtat());
		finEClass.getESuperTypes().add(this.getPseudoEtat());
		initVariableEClass.getESuperTypes().add(this.getAction());
		instantiationObjetEClass.getESuperTypes().add(this.getAction());
		appelMethodeEClass.getESuperTypes().add(this.getAction());
		fourcheEClass.getESuperTypes().add(this.getElementProcessus());
		jonctionEClass.getESuperTypes().add(this.getElementProcessus());

		// Initialize classes, features, and operations; add parameters
		initEClass(processusEClass, Processus.class, "Processus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessus_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Processus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessus_Elements(), this.getElementProcessus(), null, "elements", null, 0, -1, Processus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessus_ActiviteCourante(), this.getActivite(), null, "activiteCourante", null, 0, 1, Processus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessus_Debut(), this.getDebut(), null, "debut", null, 1, 1, Processus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessus_Fin(), this.getFin(), null, "fin", null, 1, 1, Processus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementProcessusEClass, ElementProcessus.class, "ElementProcessus", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementProcessus_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, ElementProcessus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activiteEClass, Activite.class, "Activite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivite_Precedente(), this.getActivite(), this.getActivite_Suivante(), "precedente", null, 0, 1, Activite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivite_Suivante(), this.getActivite(), this.getActivite_Precedente(), "suivante", null, 0, 1, Activite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivite_Actions(), this.getAction(), null, "actions", null, 0, -1, Activite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pseudoEtatEClass, PseudoEtat.class, "PseudoEtat", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(debutEClass, Debut.class, "Debut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDebut_Reference(), this.getElementProcessus(), null, "reference", null, 1, 1, Debut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finEClass, Fin.class, "Fin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFin_Reference(), this.getElementProcessus(), null, "reference", null, 1, 1, Fin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initVariableEClass, InitVariable.class, "InitVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitVariable_NomVariable(), ecorePackage.getEString(), "nomVariable", null, 0, 1, InitVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitVariable_Type(), this.getTypePrimitif(), "type", null, 0, 1, InitVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitVariable_ValeurInitiale(), ecorePackage.getEString(), "valeurInitiale", null, 0, 1, InitVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instantiationObjetEClass, InstantiationObjet.class, "InstantiationObjet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstantiationObjet_NomClasse(), ecorePackage.getEString(), "nomClasse", null, 0, 1, InstantiationObjet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstantiationObjet_NomVariable(), ecorePackage.getEString(), "nomVariable", null, 0, 1, InstantiationObjet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appelMethodeEClass, AppelMethode.class, "AppelMethode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppelMethode_NomMethode(), ecorePackage.getEString(), "nomMethode", null, 0, 1, AppelMethode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppelMethode_ObjetCible(), ecorePackage.getEString(), "objetCible", null, 0, 1, AppelMethode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppelMethode_Parametres(), ecorePackage.getEString(), "parametres", null, 0, -1, AppelMethode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppelMethode_Resultat(), ecorePackage.getEString(), "resultat", null, 0, 1, AppelMethode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fourcheEClass, Fourche.class, "Fourche", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFourche_Branches(), this.getActivite(), null, "branches", null, 0, -1, Fourche.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jonctionEClass, Jonction.class, "Jonction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJonction_Branches(), this.getActivite(), null, "branches", null, 0, -1, Jonction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typePrimitifEEnum, TypePrimitif.class, "TypePrimitif");
		addEEnumLiteral(typePrimitifEEnum, TypePrimitif.INT);
		addEEnumLiteral(typePrimitifEEnum, TypePrimitif.BOOLEAN);
		addEEnumLiteral(typePrimitifEEnum, TypePrimitif.STRING);
		addEEnumLiteral(typePrimitifEEnum, TypePrimitif.FLOAT);

		// Create resource
		createResource(eNS_URI);
	}

} //LDPPackageImpl
