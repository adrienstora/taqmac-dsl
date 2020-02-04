/**
 */
package fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl;

import fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Destination;
import fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.Itineraire;
import fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ItinerairePackage;
import fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ModeAffichage;
import fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ModeTransport;
import fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.PlageHoraire;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Itineraire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItineraireImpl#getEntreprise <em>Entreprise</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItineraireImpl#getPlageHoraire <em>Plage Horaire</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItineraireImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItineraireImpl#getModesAffichage <em>Modes Affichage</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.impl.ItineraireImpl#getModesTransport <em>Modes Transport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItineraireImpl extends MinimalEObjectImpl.Container implements Itineraire {
	/**
	 * The default value of the '{@link #getEntreprise() <em>Entreprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntreprise()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTREPRISE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntreprise() <em>Entreprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntreprise()
	 * @generated
	 * @ordered
	 */
	protected String entreprise = ENTREPRISE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlageHoraire() <em>Plage Horaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlageHoraire()
	 * @generated
	 * @ordered
	 */
	protected PlageHoraire plageHoraire;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Destination destination;

	/**
	 * The cached value of the '{@link #getModesAffichage() <em>Modes Affichage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModesAffichage()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeAffichage> modesAffichage;

	/**
	 * The cached value of the '{@link #getModesTransport() <em>Modes Transport</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModesTransport()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeTransport> modesTransport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItineraireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItinerairePackage.Literals.ITINERAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntreprise() {
		return entreprise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntreprise(String newEntreprise) {
		String oldEntreprise = entreprise;
		entreprise = newEntreprise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItinerairePackage.ITINERAIRE__ENTREPRISE,
					oldEntreprise, entreprise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlageHoraire getPlageHoraire() {
		return plageHoraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlageHoraire(PlageHoraire newPlageHoraire, NotificationChain msgs) {
		PlageHoraire oldPlageHoraire = plageHoraire;
		plageHoraire = newPlageHoraire;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ItinerairePackage.ITINERAIRE__PLAGE_HORAIRE, oldPlageHoraire, newPlageHoraire);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlageHoraire(PlageHoraire newPlageHoraire) {
		if (newPlageHoraire != plageHoraire) {
			NotificationChain msgs = null;
			if (plageHoraire != null)
				msgs = ((InternalEObject) plageHoraire).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ItinerairePackage.ITINERAIRE__PLAGE_HORAIRE, null, msgs);
			if (newPlageHoraire != null)
				msgs = ((InternalEObject) newPlageHoraire).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ItinerairePackage.ITINERAIRE__PLAGE_HORAIRE, null, msgs);
			msgs = basicSetPlageHoraire(newPlageHoraire, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItinerairePackage.ITINERAIRE__PLAGE_HORAIRE,
					newPlageHoraire, newPlageHoraire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Destination getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(Destination newDestination, NotificationChain msgs) {
		Destination oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ItinerairePackage.ITINERAIRE__DESTINATION, oldDestination, newDestination);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Destination newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject) destination).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ItinerairePackage.ITINERAIRE__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject) newDestination).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ItinerairePackage.ITINERAIRE__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItinerairePackage.ITINERAIRE__DESTINATION,
					newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeAffichage> getModesAffichage() {
		if (modesAffichage == null) {
			modesAffichage = new EObjectContainmentEList<ModeAffichage>(ModeAffichage.class, this,
					ItinerairePackage.ITINERAIRE__MODES_AFFICHAGE);
		}
		return modesAffichage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeTransport> getModesTransport() {
		if (modesTransport == null) {
			modesTransport = new EObjectContainmentEList<ModeTransport>(ModeTransport.class, this,
					ItinerairePackage.ITINERAIRE__MODES_TRANSPORT);
		}
		return modesTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ItinerairePackage.ITINERAIRE__PLAGE_HORAIRE:
			return basicSetPlageHoraire(null, msgs);
		case ItinerairePackage.ITINERAIRE__DESTINATION:
			return basicSetDestination(null, msgs);
		case ItinerairePackage.ITINERAIRE__MODES_AFFICHAGE:
			return ((InternalEList<?>) getModesAffichage()).basicRemove(otherEnd, msgs);
		case ItinerairePackage.ITINERAIRE__MODES_TRANSPORT:
			return ((InternalEList<?>) getModesTransport()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ItinerairePackage.ITINERAIRE__ENTREPRISE:
			return getEntreprise();
		case ItinerairePackage.ITINERAIRE__PLAGE_HORAIRE:
			return getPlageHoraire();
		case ItinerairePackage.ITINERAIRE__DESTINATION:
			return getDestination();
		case ItinerairePackage.ITINERAIRE__MODES_AFFICHAGE:
			return getModesAffichage();
		case ItinerairePackage.ITINERAIRE__MODES_TRANSPORT:
			return getModesTransport();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ItinerairePackage.ITINERAIRE__ENTREPRISE:
			setEntreprise((String) newValue);
			return;
		case ItinerairePackage.ITINERAIRE__PLAGE_HORAIRE:
			setPlageHoraire((PlageHoraire) newValue);
			return;
		case ItinerairePackage.ITINERAIRE__DESTINATION:
			setDestination((Destination) newValue);
			return;
		case ItinerairePackage.ITINERAIRE__MODES_AFFICHAGE:
			getModesAffichage().clear();
			getModesAffichage().addAll((Collection<? extends ModeAffichage>) newValue);
			return;
		case ItinerairePackage.ITINERAIRE__MODES_TRANSPORT:
			getModesTransport().clear();
			getModesTransport().addAll((Collection<? extends ModeTransport>) newValue);
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
		case ItinerairePackage.ITINERAIRE__ENTREPRISE:
			setEntreprise(ENTREPRISE_EDEFAULT);
			return;
		case ItinerairePackage.ITINERAIRE__PLAGE_HORAIRE:
			setPlageHoraire((PlageHoraire) null);
			return;
		case ItinerairePackage.ITINERAIRE__DESTINATION:
			setDestination((Destination) null);
			return;
		case ItinerairePackage.ITINERAIRE__MODES_AFFICHAGE:
			getModesAffichage().clear();
			return;
		case ItinerairePackage.ITINERAIRE__MODES_TRANSPORT:
			getModesTransport().clear();
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
		case ItinerairePackage.ITINERAIRE__ENTREPRISE:
			return ENTREPRISE_EDEFAULT == null ? entreprise != null : !ENTREPRISE_EDEFAULT.equals(entreprise);
		case ItinerairePackage.ITINERAIRE__PLAGE_HORAIRE:
			return plageHoraire != null;
		case ItinerairePackage.ITINERAIRE__DESTINATION:
			return destination != null;
		case ItinerairePackage.ITINERAIRE__MODES_AFFICHAGE:
			return modesAffichage != null && !modesAffichage.isEmpty();
		case ItinerairePackage.ITINERAIRE__MODES_TRANSPORT:
			return modesTransport != null && !modesTransport.isEmpty();
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
		result.append(" (entreprise: ");
		result.append(entreprise);
		result.append(')');
		return result.toString();
	}

} //ItineraireImpl
