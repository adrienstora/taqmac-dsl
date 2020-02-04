/**
 */
package fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ItineraireFactory
 * @model kind="package"
 * @generated
 */
public interface ItinerairePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "itineraire";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/itineraire";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "itineraire";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ItinerairePackage eINSTANCE = fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItinerairePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItineraireImpl <em>Itineraire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItineraireImpl
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItinerairePackageImpl#getItineraire()
	 * @generated
	 */
	int ITINERAIRE = 0;

	/**
	 * The feature id for the '<em><b>Entreprise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERAIRE__ENTREPRISE = 0;

	/**
	 * The feature id for the '<em><b>Plage Horaire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERAIRE__PLAGE_HORAIRE = 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERAIRE__DESTINATION = 2;

	/**
	 * The feature id for the '<em><b>Modes Affichage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERAIRE__MODES_AFFICHAGE = 3;

	/**
	 * The feature id for the '<em><b>Modes Transport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERAIRE__MODES_TRANSPORT = 4;

	/**
	 * The number of structural features of the '<em>Itineraire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERAIRE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Itineraire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERAIRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.PlageHoraireImpl <em>Plage Horaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.PlageHoraireImpl
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItinerairePackageImpl#getPlageHoraire()
	 * @generated
	 */
	int PLAGE_HORAIRE = 1;

	/**
	 * The feature id for the '<em><b>Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAGE_HORAIRE__DEBUT = 0;

	/**
	 * The feature id for the '<em><b>Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAGE_HORAIRE__FIN = 1;

	/**
	 * The number of structural features of the '<em>Plage Horaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAGE_HORAIRE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Plage Horaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAGE_HORAIRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.DestinationImpl <em>Destination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.DestinationImpl
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItinerairePackageImpl#getDestination()
	 * @generated
	 */
	int DESTINATION = 2;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION__ADRESSE = 0;

	/**
	 * The number of structural features of the '<em>Destination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Destination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ModeTransportImpl <em>Mode Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ModeTransportImpl
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItinerairePackageImpl#getModeTransport()
	 * @generated
	 */
	int MODE_TRANSPORT = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSPORT__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Mode Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mode Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ModeAffichageImpl <em>Mode Affichage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ModeAffichageImpl
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItinerairePackageImpl#getModeAffichage()
	 * @generated
	 */
	int MODE_AFFICHAGE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_AFFICHAGE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Mode Affichage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_AFFICHAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mode Affichage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_AFFICHAGE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Itineraire <em>Itineraire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Itineraire</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Itineraire
	 * @generated
	 */
	EClass getItineraire();

	/**
	 * Returns the meta object for the attribute '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Itineraire#getEntreprise <em>Entreprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entreprise</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Itineraire#getEntreprise()
	 * @see #getItineraire()
	 * @generated
	 */
	EAttribute getItineraire_Entreprise();

	/**
	 * Returns the meta object for the containment reference '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Itineraire#getPlageHoraire <em>Plage Horaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plage Horaire</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Itineraire#getPlageHoraire()
	 * @see #getItineraire()
	 * @generated
	 */
	EReference getItineraire_PlageHoraire();

	/**
	 * Returns the meta object for the containment reference '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Itineraire#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Itineraire#getDestination()
	 * @see #getItineraire()
	 * @generated
	 */
	EReference getItineraire_Destination();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Itineraire#getModesAffichage <em>Modes Affichage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modes Affichage</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Itineraire#getModesAffichage()
	 * @see #getItineraire()
	 * @generated
	 */
	EReference getItineraire_ModesAffichage();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Itineraire#getModesTransport <em>Modes Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modes Transport</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Itineraire#getModesTransport()
	 * @see #getItineraire()
	 * @generated
	 */
	EReference getItineraire_ModesTransport();

	/**
	 * Returns the meta object for class '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.PlageHoraire <em>Plage Horaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plage Horaire</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.PlageHoraire
	 * @generated
	 */
	EClass getPlageHoraire();

	/**
	 * Returns the meta object for the attribute '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.PlageHoraire#getDebut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debut</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.PlageHoraire#getDebut()
	 * @see #getPlageHoraire()
	 * @generated
	 */
	EAttribute getPlageHoraire_Debut();

	/**
	 * Returns the meta object for the attribute '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.PlageHoraire#getFin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.PlageHoraire#getFin()
	 * @see #getPlageHoraire()
	 * @generated
	 */
	EAttribute getPlageHoraire_Fin();

	/**
	 * Returns the meta object for class '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Destination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destination</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Destination
	 * @generated
	 */
	EClass getDestination();

	/**
	 * Returns the meta object for the attribute '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Destination#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Destination#getAdresse()
	 * @see #getDestination()
	 * @generated
	 */
	EAttribute getDestination_Adresse();

	/**
	 * Returns the meta object for class '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ModeTransport <em>Mode Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Transport</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ModeTransport
	 * @generated
	 */
	EClass getModeTransport();

	/**
	 * Returns the meta object for the attribute '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ModeTransport#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ModeTransport#getType()
	 * @see #getModeTransport()
	 * @generated
	 */
	EAttribute getModeTransport_Type();

	/**
	 * Returns the meta object for class '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ModeAffichage <em>Mode Affichage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Affichage</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ModeAffichage
	 * @generated
	 */
	EClass getModeAffichage();

	/**
	 * Returns the meta object for the attribute '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ModeAffichage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ModeAffichage#getType()
	 * @see #getModeAffichage()
	 * @generated
	 */
	EAttribute getModeAffichage_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ItineraireFactory getItineraireFactory();

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
		 * The meta object literal for the '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItineraireImpl <em>Itineraire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItineraireImpl
		 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItinerairePackageImpl#getItineraire()
		 * @generated
		 */
		EClass ITINERAIRE = eINSTANCE.getItineraire();

		/**
		 * The meta object literal for the '<em><b>Entreprise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITINERAIRE__ENTREPRISE = eINSTANCE.getItineraire_Entreprise();

		/**
		 * The meta object literal for the '<em><b>Plage Horaire</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITINERAIRE__PLAGE_HORAIRE = eINSTANCE.getItineraire_PlageHoraire();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITINERAIRE__DESTINATION = eINSTANCE.getItineraire_Destination();

		/**
		 * The meta object literal for the '<em><b>Modes Affichage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITINERAIRE__MODES_AFFICHAGE = eINSTANCE.getItineraire_ModesAffichage();

		/**
		 * The meta object literal for the '<em><b>Modes Transport</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITINERAIRE__MODES_TRANSPORT = eINSTANCE.getItineraire_ModesTransport();

		/**
		 * The meta object literal for the '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.PlageHoraireImpl <em>Plage Horaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.PlageHoraireImpl
		 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItinerairePackageImpl#getPlageHoraire()
		 * @generated
		 */
		EClass PLAGE_HORAIRE = eINSTANCE.getPlageHoraire();

		/**
		 * The meta object literal for the '<em><b>Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAGE_HORAIRE__DEBUT = eINSTANCE.getPlageHoraire_Debut();

		/**
		 * The meta object literal for the '<em><b>Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAGE_HORAIRE__FIN = eINSTANCE.getPlageHoraire_Fin();

		/**
		 * The meta object literal for the '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.DestinationImpl <em>Destination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.DestinationImpl
		 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItinerairePackageImpl#getDestination()
		 * @generated
		 */
		EClass DESTINATION = eINSTANCE.getDestination();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESTINATION__ADRESSE = eINSTANCE.getDestination_Adresse();

		/**
		 * The meta object literal for the '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ModeTransportImpl <em>Mode Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ModeTransportImpl
		 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItinerairePackageImpl#getModeTransport()
		 * @generated
		 */
		EClass MODE_TRANSPORT = eINSTANCE.getModeTransport();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODE_TRANSPORT__TYPE = eINSTANCE.getModeTransport_Type();

		/**
		 * The meta object literal for the '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ModeAffichageImpl <em>Mode Affichage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ModeAffichageImpl
		 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItinerairePackageImpl#getModeAffichage()
		 * @generated
		 */
		EClass MODE_AFFICHAGE = eINSTANCE.getModeAffichage();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODE_AFFICHAGE__TYPE = eINSTANCE.getModeAffichage_Type();

	}

} //ItinerairePackage
