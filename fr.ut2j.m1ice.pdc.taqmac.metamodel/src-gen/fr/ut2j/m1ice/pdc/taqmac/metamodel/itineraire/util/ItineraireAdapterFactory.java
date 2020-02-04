/**
 */
package fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.util;

import fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ItinerairePackage
 * @generated
 */
public class ItineraireAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ItinerairePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItineraireAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ItinerairePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItineraireSwitch<Adapter> modelSwitch = new ItineraireSwitch<Adapter>() {
		@Override
		public Adapter caseItineraire(Itineraire object) {
			return createItineraireAdapter();
		}

		@Override
		public Adapter casePlageHoraire(PlageHoraire object) {
			return createPlageHoraireAdapter();
		}

		@Override
		public Adapter caseDestination(Destination object) {
			return createDestinationAdapter();
		}

		@Override
		public Adapter caseModeTransport(ModeTransport object) {
			return createModeTransportAdapter();
		}

		@Override
		public Adapter caseModeAffichage(ModeAffichage object) {
			return createModeAffichageAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Itineraire <em>Itineraire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Itineraire
	 * @generated
	 */
	public Adapter createItineraireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.PlageHoraire <em>Plage Horaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.PlageHoraire
	 * @generated
	 */
	public Adapter createPlageHoraireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Destination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Destination
	 * @generated
	 */
	public Adapter createDestinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ModeTransport <em>Mode Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ModeTransport
	 * @generated
	 */
	public Adapter createModeTransportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ModeAffichage <em>Mode Affichage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ModeAffichage
	 * @generated
	 */
	public Adapter createModeAffichageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ItineraireAdapterFactory
