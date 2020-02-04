/**
 */
package fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.util;

import fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ItinerairePackage
 * @generated
 */
public class ItineraireSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ItinerairePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItineraireSwitch() {
		if (modelPackage == null) {
			modelPackage = ItinerairePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ItinerairePackage.ITINERAIRE: {
			Itineraire itineraire = (Itineraire) theEObject;
			T result = caseItineraire(itineraire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ItinerairePackage.PLAGE_HORAIRE: {
			PlageHoraire plageHoraire = (PlageHoraire) theEObject;
			T result = casePlageHoraire(plageHoraire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ItinerairePackage.DESTINATION: {
			Destination destination = (Destination) theEObject;
			T result = caseDestination(destination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ItinerairePackage.MODE_TRANSPORT: {
			ModeTransport modeTransport = (ModeTransport) theEObject;
			T result = caseModeTransport(modeTransport);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ItinerairePackage.MODE_AFFICHAGE: {
			ModeAffichage modeAffichage = (ModeAffichage) theEObject;
			T result = caseModeAffichage(modeAffichage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Itineraire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Itineraire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItineraire(Itineraire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plage Horaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plage Horaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlageHoraire(PlageHoraire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestination(Destination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeTransport(ModeTransport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Affichage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Affichage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeAffichage(ModeAffichage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ItineraireSwitch
