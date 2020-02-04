/**
 */
package fr.ut2j.m1ice.pdc.taqmac.dsl.model;

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
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.PlageHoraire#getHeureDebut <em>Heure Debut</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.PlageHoraire#getHeureFin <em>Heure Fin</em>}</li>
 * </ul>
 *
 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelPackage#getPlageHoraire()
 * @model
 * @generated
 */
public interface PlageHoraire extends EObject {
	/**
	 * Returns the value of the '<em><b>Heure Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Debut</em>' attribute.
	 * @see #setHeureDebut(String)
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelPackage#getPlageHoraire_HeureDebut()
	 * @model
	 * @generated
	 */
	String getHeureDebut();

	/**
	 * Sets the value of the '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.PlageHoraire#getHeureDebut <em>Heure Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Debut</em>' attribute.
	 * @see #getHeureDebut()
	 * @generated
	 */
	void setHeureDebut(String value);

	/**
	 * Returns the value of the '<em><b>Heure Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Fin</em>' attribute.
	 * @see #setHeureFin(String)
	 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelPackage#getPlageHoraire_HeureFin()
	 * @model
	 * @generated
	 */
	String getHeureFin();

	/**
	 * Sets the value of the '{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.PlageHoraire#getHeureFin <em>Heure Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Fin</em>' attribute.
	 * @see #getHeureFin()
	 * @generated
	 */
	void setHeureFin(String value);

} // PlageHoraire
