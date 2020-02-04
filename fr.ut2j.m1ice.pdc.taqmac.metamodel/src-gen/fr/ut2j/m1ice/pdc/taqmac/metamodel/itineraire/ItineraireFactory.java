/**
 */
package fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ItinerairePackage
 * @generated
 */
public interface ItineraireFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ItineraireFactory eINSTANCE = fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItineraireFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Itineraire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Itineraire</em>'.
	 * @generated
	 */
	Itineraire createItineraire();

	/**
	 * Returns a new object of class '<em>Plage Horaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plage Horaire</em>'.
	 * @generated
	 */
	PlageHoraire createPlageHoraire();

	/**
	 * Returns a new object of class '<em>Destination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destination</em>'.
	 * @generated
	 */
	Destination createDestination();

	/**
	 * Returns a new object of class '<em>Mode Transport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Transport</em>'.
	 * @generated
	 */
	ModeTransport createModeTransport();

	/**
	 * Returns a new object of class '<em>Mode Affichage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Affichage</em>'.
	 * @generated
	 */
	ModeAffichage createModeAffichage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ItinerairePackage getItinerairePackage();

} //ItineraireFactory
