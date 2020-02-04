/**
 */
package fr.ut2j.m1ice.pdc.taqmac.dsl.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Destination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destination</em>'.
	 * @generated
	 */
	Destination createDestination();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
