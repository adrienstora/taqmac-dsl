/**
 */
package fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl;

import fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ItineraireFactoryImpl extends EFactoryImpl implements ItineraireFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ItineraireFactory init() {
		try {
			ItineraireFactory theItineraireFactory = (ItineraireFactory) EPackage.Registry.INSTANCE
					.getEFactory(ItinerairePackage.eNS_URI);
			if (theItineraireFactory != null) {
				return theItineraireFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ItineraireFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItineraireFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ItinerairePackage.ITINERAIRE:
			return createItineraire();
		case ItinerairePackage.PLAGE_HORAIRE:
			return createPlageHoraire();
		case ItinerairePackage.DESTINATION:
			return createDestination();
		case ItinerairePackage.MODE_TRANSPORT:
			return createModeTransport();
		case ItinerairePackage.MODE_AFFICHAGE:
			return createModeAffichage();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Itineraire createItineraire() {
		ItineraireImpl itineraire = new ItineraireImpl();
		return itineraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlageHoraire createPlageHoraire() {
		PlageHoraireImpl plageHoraire = new PlageHoraireImpl();
		return plageHoraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Destination createDestination() {
		DestinationImpl destination = new DestinationImpl();
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeTransport createModeTransport() {
		ModeTransportImpl modeTransport = new ModeTransportImpl();
		return modeTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeAffichage createModeAffichage() {
		ModeAffichageImpl modeAffichage = new ModeAffichageImpl();
		return modeAffichage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItinerairePackage getItinerairePackage() {
		return (ItinerairePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ItinerairePackage getPackage() {
		return ItinerairePackage.eINSTANCE;
	}

} //ItineraireFactoryImpl
