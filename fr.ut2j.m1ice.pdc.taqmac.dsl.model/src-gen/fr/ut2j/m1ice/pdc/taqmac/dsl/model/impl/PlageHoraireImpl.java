/**
 */
package fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl;

import fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelPackage;
import fr.ut2j.m1ice.pdc.taqmac.dsl.model.PlageHoraire;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plage Horaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.PlageHoraireImpl#getHeureDebut <em>Heure Debut</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.PlageHoraireImpl#getHeureFin <em>Heure Fin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlageHoraireImpl extends MinimalEObjectImpl.Container implements PlageHoraire {
	/**
	 * The default value of the '{@link #getHeureDebut() <em>Heure Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureDebut()
	 * @generated
	 * @ordered
	 */
	protected static final String HEURE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeureDebut() <em>Heure Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureDebut()
	 * @generated
	 * @ordered
	 */
	protected String heureDebut = HEURE_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeureFin() <em>Heure Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureFin()
	 * @generated
	 * @ordered
	 */
	protected static final String HEURE_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeureFin() <em>Heure Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureFin()
	 * @generated
	 * @ordered
	 */
	protected String heureFin = HEURE_FIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlageHoraireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PLAGE_HORAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeureDebut() {
		return heureDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureDebut(String newHeureDebut) {
		String oldHeureDebut = heureDebut;
		heureDebut = newHeureDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PLAGE_HORAIRE__HEURE_DEBUT,
					oldHeureDebut, heureDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeureFin() {
		return heureFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureFin(String newHeureFin) {
		String oldHeureFin = heureFin;
		heureFin = newHeureFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PLAGE_HORAIRE__HEURE_FIN, oldHeureFin,
					heureFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.PLAGE_HORAIRE__HEURE_DEBUT:
			return getHeureDebut();
		case ModelPackage.PLAGE_HORAIRE__HEURE_FIN:
			return getHeureFin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.PLAGE_HORAIRE__HEURE_DEBUT:
			setHeureDebut((String) newValue);
			return;
		case ModelPackage.PLAGE_HORAIRE__HEURE_FIN:
			setHeureFin((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModelPackage.PLAGE_HORAIRE__HEURE_DEBUT:
			setHeureDebut(HEURE_DEBUT_EDEFAULT);
			return;
		case ModelPackage.PLAGE_HORAIRE__HEURE_FIN:
			setHeureFin(HEURE_FIN_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModelPackage.PLAGE_HORAIRE__HEURE_DEBUT:
			return HEURE_DEBUT_EDEFAULT == null ? heureDebut != null : !HEURE_DEBUT_EDEFAULT.equals(heureDebut);
		case ModelPackage.PLAGE_HORAIRE__HEURE_FIN:
			return HEURE_FIN_EDEFAULT == null ? heureFin != null : !HEURE_FIN_EDEFAULT.equals(heureFin);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (heureDebut: ");
		result.append(heureDebut);
		result.append(", heureFin: ");
		result.append(heureFin);
		result.append(')');
		return result.toString();
	}

} //PlageHoraireImpl
