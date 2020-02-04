/**
 */
package fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plage Horaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.PlageHoraire#getDebut <em>Debut</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.PlageHoraire#getFin <em>Fin</em>}</li>
 * </ul>
 *
 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ItinerairePackage#getPlageHoraire()
 * @model
 * @generated
 */
public interface PlageHoraire extends EObject {
	/**
	 * Returns the value of the '<em><b>Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut</em>' attribute.
	 * @see #setDebut(String)
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ItinerairePackage#getPlageHoraire_Debut()
	 * @model
	 * @generated
	 */
	String getDebut();

	/**
	 * Sets the value of the '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.PlageHoraire#getDebut <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut</em>' attribute.
	 * @see #getDebut()
	 * @generated
	 */
	void setDebut(String value);

	/**
	 * Returns the value of the '<em><b>Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin</em>' attribute.
	 * @see #setFin(String)
	 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ItinerairePackage#getPlageHoraire_Fin()
	 * @model
	 * @generated
	 */
	String getFin();

	/**
	 * Sets the value of the '{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.PlageHoraire#getFin <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin</em>' attribute.
	 * @see #getFin()
	 * @generated
	 */
	void setFin(String value);

} // PlageHoraire
