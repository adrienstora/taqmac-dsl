/**
 */
package fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl;

import fr.ut2j.m1ice.pdc.taqmac.dsl.model.Destination;
import fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire;
import fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelFactory;
import fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelPackage;
import fr.ut2j.m1ice.pdc.taqmac.dsl.model.PlageHoraire;
import fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeAffichage;
import fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeTransport;

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
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itineraireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plageHoraireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeModeTransportEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeModeAffichageEEnum = null;

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
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited)
			return (ModelPackage) EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModelPackageImpl theModelPackage = registeredModelPackage instanceof ModelPackageImpl
				? (ModelPackageImpl) registeredModelPackage
				: new ModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestination() {
		return destinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestination_Adresse() {
		return (EAttribute) destinationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItineraire() {
		return itineraireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItineraire_Entreprise() {
		return (EAttribute) itineraireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItineraire_Destination() {
		return (EReference) itineraireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItineraire_PlageHoraire() {
		return (EReference) itineraireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItineraire_ModesTransport() {
		return (EAttribute) itineraireEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItineraire_ModesAffichage() {
		return (EAttribute) itineraireEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlageHoraire() {
		return plageHoraireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlageHoraire_HeureDebut() {
		return (EAttribute) plageHoraireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlageHoraire_HeureFin() {
		return (EAttribute) plageHoraireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeModeTransport() {
		return typeModeTransportEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeModeAffichage() {
		return typeModeAffichageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		destinationEClass = createEClass(DESTINATION);
		createEAttribute(destinationEClass, DESTINATION__ADRESSE);

		itineraireEClass = createEClass(ITINERAIRE);
		createEAttribute(itineraireEClass, ITINERAIRE__ENTREPRISE);
		createEReference(itineraireEClass, ITINERAIRE__DESTINATION);
		createEReference(itineraireEClass, ITINERAIRE__PLAGE_HORAIRE);
		createEAttribute(itineraireEClass, ITINERAIRE__MODES_TRANSPORT);
		createEAttribute(itineraireEClass, ITINERAIRE__MODES_AFFICHAGE);

		plageHoraireEClass = createEClass(PLAGE_HORAIRE);
		createEAttribute(plageHoraireEClass, PLAGE_HORAIRE__HEURE_DEBUT);
		createEAttribute(plageHoraireEClass, PLAGE_HORAIRE__HEURE_FIN);

		// Create enums
		typeModeTransportEEnum = createEEnum(TYPE_MODE_TRANSPORT);
		typeModeAffichageEEnum = createEEnum(TYPE_MODE_AFFICHAGE);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(destinationEClass, Destination.class, "Destination", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDestination_Adresse(), ecorePackage.getEString(), "adresse", null, 0, 1, Destination.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itineraireEClass, Itineraire.class, "Itineraire", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItineraire_Entreprise(), ecorePackage.getEString(), "entreprise", null, 0, 1,
				Itineraire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getItineraire_Destination(), this.getDestination(), null, "destination", null, 0, 1,
				Itineraire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItineraire_PlageHoraire(), this.getPlageHoraire(), null, "plageHoraire", null, 0, 1,
				Itineraire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItineraire_ModesTransport(), this.getTypeModeTransport(), "modesTransport", "Tisseo", 0, -1,
				Itineraire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getItineraire_ModesAffichage(), this.getTypeModeAffichage(), "modesAffichage", "Texte", 0, -1,
				Itineraire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(plageHoraireEClass, PlageHoraire.class, "PlageHoraire", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlageHoraire_HeureDebut(), ecorePackage.getEString(), "heureDebut", null, 0, 1,
				PlageHoraire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlageHoraire_HeureFin(), ecorePackage.getEString(), "heureFin", null, 0, 1,
				PlageHoraire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeModeTransportEEnum, TypeModeTransport.class, "TypeModeTransport");
		addEEnumLiteral(typeModeTransportEEnum, TypeModeTransport.TISSEO);
		addEEnumLiteral(typeModeTransportEEnum, TypeModeTransport.VOITURE);
		addEEnumLiteral(typeModeTransportEEnum, TypeModeTransport.PIETON);
		addEEnumLiteral(typeModeTransportEEnum, TypeModeTransport.VELO);
		addEEnumLiteral(typeModeTransportEEnum, TypeModeTransport.BUS);
		addEEnumLiteral(typeModeTransportEEnum, TypeModeTransport.METRO);
		addEEnumLiteral(typeModeTransportEEnum, TypeModeTransport.TRAM);

		initEEnum(typeModeAffichageEEnum, TypeModeAffichage.class, "TypeModeAffichage");
		addEEnumLiteral(typeModeAffichageEEnum, TypeModeAffichage.TEXTE);
		addEEnumLiteral(typeModeAffichageEEnum, TypeModeAffichage.CARTE);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
