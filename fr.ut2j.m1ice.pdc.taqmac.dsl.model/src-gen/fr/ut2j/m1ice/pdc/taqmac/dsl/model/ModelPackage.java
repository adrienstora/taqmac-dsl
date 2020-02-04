/**
 */
package fr.ut2j.m1ice.pdc.taqmac.dsl.model;

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
 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.DestinationImpl <em>Destination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.DestinationImpl
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ModelPackageImpl#getDestination()
	 * @generated
	 */
	int DESTINATION = 0;

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
	 * The meta object id for the '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ItineraireImpl <em>Itineraire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ItineraireImpl
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ModelPackageImpl#getItineraire()
	 * @generated
	 */
	int ITINERAIRE = 1;

	/**
	 * The feature id for the '<em><b>Entreprise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERAIRE__ENTREPRISE = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERAIRE__DESTINATION = 1;

	/**
	 * The feature id for the '<em><b>Plage Horaire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERAIRE__PLAGE_HORAIRE = 2;

	/**
	 * The feature id for the '<em><b>Modes Transport</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERAIRE__MODES_TRANSPORT = 3;

	/**
	 * The feature id for the '<em><b>Modes Affichage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERAIRE__MODES_AFFICHAGE = 4;

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
	 * The meta object id for the '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.PlageHoraireImpl <em>Plage Horaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.PlageHoraireImpl
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ModelPackageImpl#getPlageHoraire()
	 * @generated
	 */
	int PLAGE_HORAIRE = 2;

	/**
	 * The feature id for the '<em><b>Heure Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAGE_HORAIRE__HEURE_DEBUT = 0;

	/**
	 * The feature id for the '<em><b>Heure Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAGE_HORAIRE__HEURE_FIN = 1;

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
	 * The meta object id for the '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeTransport <em>Type Mode Transport</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeTransport
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ModelPackageImpl#getTypeModeTransport()
	 * @generated
	 */
	int TYPE_MODE_TRANSPORT = 3;

	/**
	 * The meta object id for the '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeAffichage <em>Type Mode Affichage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeAffichage
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ModelPackageImpl#getTypeModeAffichage()
	 * @generated
	 */
	int TYPE_MODE_AFFICHAGE = 4;

	/**
	 * Returns the meta object for class '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.Destination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destination</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.Destination
	 * @generated
	 */
	EClass getDestination();

	/**
	 * Returns the meta object for the attribute '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.Destination#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.Destination#getAdresse()
	 * @see #getDestination()
	 * @generated
	 */
	EAttribute getDestination_Adresse();

	/**
	 * Returns the meta object for class '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire <em>Itineraire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Itineraire</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire
	 * @generated
	 */
	EClass getItineraire();

	/**
	 * Returns the meta object for the attribute '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire#getEntreprise <em>Entreprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entreprise</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire#getEntreprise()
	 * @see #getItineraire()
	 * @generated
	 */
	EAttribute getItineraire_Entreprise();

	/**
	 * Returns the meta object for the containment reference '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire#getDestination()
	 * @see #getItineraire()
	 * @generated
	 */
	EReference getItineraire_Destination();

	/**
	 * Returns the meta object for the containment reference '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire#getPlageHoraire <em>Plage Horaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plage Horaire</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire#getPlageHoraire()
	 * @see #getItineraire()
	 * @generated
	 */
	EReference getItineraire_PlageHoraire();

	/**
	 * Returns the meta object for the attribute list '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire#getModesTransport <em>Modes Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modes Transport</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire#getModesTransport()
	 * @see #getItineraire()
	 * @generated
	 */
	EAttribute getItineraire_ModesTransport();

	/**
	 * Returns the meta object for the attribute list '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire#getModesAffichage <em>Modes Affichage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modes Affichage</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire#getModesAffichage()
	 * @see #getItineraire()
	 * @generated
	 */
	EAttribute getItineraire_ModesAffichage();

	/**
	 * Returns the meta object for class '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.PlageHoraire <em>Plage Horaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plage Horaire</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.PlageHoraire
	 * @generated
	 */
	EClass getPlageHoraire();

	/**
	 * Returns the meta object for the attribute '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.PlageHoraire#getHeureDebut <em>Heure Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure Debut</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.PlageHoraire#getHeureDebut()
	 * @see #getPlageHoraire()
	 * @generated
	 */
	EAttribute getPlageHoraire_HeureDebut();

	/**
	 * Returns the meta object for the attribute '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.PlageHoraire#getHeureFin <em>Heure Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure Fin</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.PlageHoraire#getHeureFin()
	 * @see #getPlageHoraire()
	 * @generated
	 */
	EAttribute getPlageHoraire_HeureFin();

	/**
	 * Returns the meta object for enum '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeTransport <em>Type Mode Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Mode Transport</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeTransport
	 * @generated
	 */
	EEnum getTypeModeTransport();

	/**
	 * Returns the meta object for enum '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeAffichage <em>Type Mode Affichage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Mode Affichage</em>'.
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeAffichage
	 * @generated
	 */
	EEnum getTypeModeAffichage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.DestinationImpl <em>Destination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.DestinationImpl
		 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ModelPackageImpl#getDestination()
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
		 * The meta object literal for the '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ItineraireImpl <em>Itineraire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ItineraireImpl
		 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ModelPackageImpl#getItineraire()
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
		 * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITINERAIRE__DESTINATION = eINSTANCE.getItineraire_Destination();

		/**
		 * The meta object literal for the '<em><b>Plage Horaire</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITINERAIRE__PLAGE_HORAIRE = eINSTANCE.getItineraire_PlageHoraire();

		/**
		 * The meta object literal for the '<em><b>Modes Transport</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITINERAIRE__MODES_TRANSPORT = eINSTANCE.getItineraire_ModesTransport();

		/**
		 * The meta object literal for the '<em><b>Modes Affichage</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITINERAIRE__MODES_AFFICHAGE = eINSTANCE.getItineraire_ModesAffichage();

		/**
		 * The meta object literal for the '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.PlageHoraireImpl <em>Plage Horaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.PlageHoraireImpl
		 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ModelPackageImpl#getPlageHoraire()
		 * @generated
		 */
		EClass PLAGE_HORAIRE = eINSTANCE.getPlageHoraire();

		/**
		 * The meta object literal for the '<em><b>Heure Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAGE_HORAIRE__HEURE_DEBUT = eINSTANCE.getPlageHoraire_HeureDebut();

		/**
		 * The meta object literal for the '<em><b>Heure Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAGE_HORAIRE__HEURE_FIN = eINSTANCE.getPlageHoraire_HeureFin();

		/**
		 * The meta object literal for the '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeTransport <em>Type Mode Transport</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeTransport
		 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ModelPackageImpl#getTypeModeTransport()
		 * @generated
		 */
		EEnum TYPE_MODE_TRANSPORT = eINSTANCE.getTypeModeTransport();

		/**
		 * The meta object literal for the '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeAffichage <em>Type Mode Affichage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeAffichage
		 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ModelPackageImpl#getTypeModeAffichage()
		 * @generated
		 */
		EEnum TYPE_MODE_AFFICHAGE = eINSTANCE.getTypeModeAffichage();

	}

} //ModelPackage
