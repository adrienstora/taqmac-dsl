/**
 */
package fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl;

import fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ItinerairePackage;
import fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.PlageHoraire;

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
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.PlageHoraireImpl#getDebut <em>Debut</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.PlageHoraireImpl#getFin <em>Fin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlageHoraireImpl extends MinimalEObjectImpl.Container implements PlageHoraire {
	/**
	 * The default value of the '{@link #getDebut() <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebut()
	 * @generated
	 * @ordered
	 */
	protected static final String DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebut() <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebut()
	 * @generated
	 * @ordered
	 */
	protected String debut = DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFin() <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin()
	 * @generated
	 * @ordered
	 */
	protected static final String FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFin() <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin()
	 * @generated
	 * @ordered
	 */
	protected String fin = FIN_EDEFAULT;

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
		return ItinerairePackage.Literals.PLAGE_HORAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDebut() {
		return debut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebut(String newDebut) {
		String oldDebut = debut;
		debut = newDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItinerairePackage.PLAGE_HORAIRE__DEBUT, oldDebut,
					debut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFin() {
		return fin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFin(String newFin) {
		String oldFin = fin;
		fin = newFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItinerairePackage.PLAGE_HORAIRE__FIN, oldFin, fin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ItinerairePackage.PLAGE_HORAIRE__DEBUT:
			return getDebut();
		case ItinerairePackage.PLAGE_HORAIRE__FIN:
			return getFin();
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
		case ItinerairePackage.PLAGE_HORAIRE__DEBUT:
			setDebut((String) newValue);
			return;
		case ItinerairePackage.PLAGE_HORAIRE__FIN:
			setFin((String) newValue);
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
		case ItinerairePackage.PLAGE_HORAIRE__DEBUT:
			setDebut(DEBUT_EDEFAULT);
			return;
		case ItinerairePackage.PLAGE_HORAIRE__FIN:
			setFin(FIN_EDEFAULT);
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
		case ItinerairePackage.PLAGE_HORAIRE__DEBUT:
			return DEBUT_EDEFAULT == null ? debut != null : !DEBUT_EDEFAULT.equals(debut);
		case ItinerairePackage.PLAGE_HORAIRE__FIN:
			return FIN_EDEFAULT == null ? fin != null : !FIN_EDEFAULT.equals(fin);
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
		result.append(" (debut: ");
		result.append(debut);
		result.append(", fin: ");
		result.append(fin);
		result.append(')');
		return result.toString();
	}

} //PlageHoraireImpl
