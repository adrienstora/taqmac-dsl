/**
 */
package fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl;

import fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Destination;
import fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Itineraire;
import fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ItineraireFactory;
import fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ItinerairePackage;
import fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ModeAffichage;
import fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ModeTransport;
import fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.PlageHoraire;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ItinerairePackageImpl extends EPackageImpl implements ItinerairePackage {
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
	private EClass destinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeTransportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeAffichageEClass = null;

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
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ItinerairePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ItinerairePackageImpl() {
		super(eNS_URI, ItineraireFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ItinerairePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ItinerairePackage init() {
		if (isInited)
			return (ItinerairePackage) EPackage.Registry.INSTANCE.getEPackage(ItinerairePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredItinerairePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ItinerairePackageImpl theItinerairePackage = registeredItinerairePackage instanceof ItinerairePackageImpl
				? (ItinerairePackageImpl) registeredItinerairePackage
				: new ItinerairePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theItinerairePackage.createPackageContents();

		// Initialize created meta-data
		theItinerairePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theItinerairePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ItinerairePackage.eNS_URI, theItinerairePackage);
		return theItinerairePackage;
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
	public EReference getItineraire_PlageHoraire() {
		return (EReference) itineraireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItineraire_Destination() {
		return (EReference) itineraireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItineraire_ModesAffichage() {
		return (EReference) itineraireEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItineraire_ModesTransport() {
		return (EReference) itineraireEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getPlageHoraire_Debut() {
		return (EAttribute) plageHoraireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlageHoraire_Fin() {
		return (EAttribute) plageHoraireEClass.getEStructuralFeatures().get(1);
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
	public EClass getModeTransport() {
		return modeTransportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModeTransport_Type() {
		return (EAttribute) modeTransportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeAffichage() {
		return modeAffichageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModeAffichage_Type() {
		return (EAttribute) modeAffichageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItineraireFactory getItineraireFactory() {
		return (ItineraireFactory) getEFactoryInstance();
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
		itineraireEClass = createEClass(ITINERAIRE);
		createEAttribute(itineraireEClass, ITINERAIRE__ENTREPRISE);
		createEReference(itineraireEClass, ITINERAIRE__PLAGE_HORAIRE);
		createEReference(itineraireEClass, ITINERAIRE__DESTINATION);
		createEReference(itineraireEClass, ITINERAIRE__MODES_AFFICHAGE);
		createEReference(itineraireEClass, ITINERAIRE__MODES_TRANSPORT);

		plageHoraireEClass = createEClass(PLAGE_HORAIRE);
		createEAttribute(plageHoraireEClass, PLAGE_HORAIRE__DEBUT);
		createEAttribute(plageHoraireEClass, PLAGE_HORAIRE__FIN);

		destinationEClass = createEClass(DESTINATION);
		createEAttribute(destinationEClass, DESTINATION__ADRESSE);

		modeTransportEClass = createEClass(MODE_TRANSPORT);
		createEAttribute(modeTransportEClass, MODE_TRANSPORT__TYPE);

		modeAffichageEClass = createEClass(MODE_AFFICHAGE);
		createEAttribute(modeAffichageEClass, MODE_AFFICHAGE__TYPE);
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
		initEClass(itineraireEClass, Itineraire.class, "Itineraire", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItineraire_Entreprise(), ecorePackage.getEString(), "entreprise", null, 0, 1,
				Itineraire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getItineraire_PlageHoraire(), this.getPlageHoraire(), null, "plageHoraire", null, 0, 1,
				Itineraire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItineraire_Destination(), this.getDestination(), null, "destination", null, 0, 1,
				Itineraire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItineraire_ModesAffichage(), this.getModeAffichage(), null, "modesAffichage", null, 0, -1,
				Itineraire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItineraire_ModesTransport(), this.getModeTransport(), null, "modesTransport", null, 0, -1,
				Itineraire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plageHoraireEClass, PlageHoraire.class, "PlageHoraire", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlageHoraire_Debut(), ecorePackage.getEString(), "debut", null, 0, 1, PlageHoraire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlageHoraire_Fin(), ecorePackage.getEString(), "fin", null, 0, 1, PlageHoraire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(destinationEClass, Destination.class, "Destination", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDestination_Adresse(), ecorePackage.getEString(), "adresse", null, 0, 1, Destination.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeTransportEClass, ModeTransport.class, "ModeTransport", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModeTransport_Type(), ecorePackage.getEString(), "type", null, 0, 1, ModeTransport.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeAffichageEClass, ModeAffichage.class, "ModeAffichage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModeAffichage_Type(), ecorePackage.getEString(), "type", null, 0, 1, ModeAffichage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ItinerairePackageImpl
