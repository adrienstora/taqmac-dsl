/**
 */
package fr.ut2j.m1ice.pdc.taqmac.dsl.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.Destination#getAdresse <em>Adresse</em>}</li>
 * </ul>
 *
 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelPackage#getDestination()
 * @model
 * @generated
 */
public interface Destination extends EObject {
	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adresse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' attribute.
	 * @see #setAdresse(String)
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelPackage#getDestination_Adresse()
	 * @model
	 * @generated
	 */
	String getAdresse();

	/**
	 * Sets the value of the '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.Destination#getAdresse <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' attribute.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(String value);

} // Destination
