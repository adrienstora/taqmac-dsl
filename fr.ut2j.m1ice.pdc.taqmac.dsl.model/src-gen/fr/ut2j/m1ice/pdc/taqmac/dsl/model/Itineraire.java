/**
 */
package fr.ut2j.m1ice.pdc.taqmac.dsl.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Itineraire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire#getEntreprise <em>Entreprise</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire#getDestination <em>Destination</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire#getPlageHoraire <em>Plage Horaire</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire#getModesTransport <em>Modes Transport</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire#getModesAffichage <em>Modes Affichage</em>}</li>
 * </ul>
 *
 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelPackage#getItineraire()
 * @model
 * @generated
 */
public interface Itineraire extends EObject {
	/**
	 * Returns the value of the '<em><b>Entreprise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entreprise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entreprise</em>' attribute.
	 * @see #setEntreprise(String)
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelPackage#getItineraire_Entreprise()
	 * @model
	 * @generated
	 */
	String getEntreprise();

	/**
	 * Sets the value of the '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire#getEntreprise <em>Entreprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entreprise</em>' attribute.
	 * @see #getEntreprise()
	 * @generated
	 */
	void setEntreprise(String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(Destination)
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelPackage#getItineraire_Destination()
	 * @model containment="true"
	 * @generated
	 */
	Destination getDestination();

	/**
	 * Sets the value of the '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Destination value);

	/**
	 * Returns the value of the '<em><b>Plage Horaire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plage Horaire</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plage Horaire</em>' containment reference.
	 * @see #setPlageHoraire(PlageHoraire)
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelPackage#getItineraire_PlageHoraire()
	 * @model containment="true"
	 * @generated
	 */
	PlageHoraire getPlageHoraire();

	/**
	 * Sets the value of the '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire#getPlageHoraire <em>Plage Horaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plage Horaire</em>' containment reference.
	 * @see #getPlageHoraire()
	 * @generated
	 */
	void setPlageHoraire(PlageHoraire value);

	/**
	 * Returns the value of the '<em><b>Modes Transport</b></em>' attribute list.
	 * The list contents are of type {@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeTransport}.
	 * The literals are from the enumeration {@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeTransport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modes Transport</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modes Transport</em>' attribute list.
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeTransport
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelPackage#getItineraire_ModesTransport()
	 * @model default="Tisseo"
	 * @generated
	 */
	EList<TypeModeTransport> getModesTransport();

	/**
	 * Returns the value of the '<em><b>Modes Affichage</b></em>' attribute list.
	 * The list contents are of type {@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeAffichage}.
	 * The literals are from the enumeration {@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeAffichage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modes Affichage</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modes Affichage</em>' attribute list.
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeAffichage
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelPackage#getItineraire_ModesAffichage()
	 * @model default="Texte"
	 * @generated
	 */
	EList<TypeModeAffichage> getModesAffichage();

} // Itineraire
