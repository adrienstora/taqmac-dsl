/**
 */
package fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl;

import fr.ut2j.m1ice.pdc.taqmac.dsl.model.Destination;
import fr.ut2j.m1ice.pdc.taqmac.dsl.model.Itineraire;
import fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelPackage;
import fr.ut2j.m1ice.pdc.taqmac.dsl.model.PlageHoraire;
import fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeAffichage;
import fr.ut2j.m1ice.pdc.taqmac.dsl.model.TypeModeTransport;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Itineraire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ItineraireImpl#getEntreprise <em>Entreprise</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ItineraireImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ItineraireImpl#getPlageHoraire <em>Plage Horaire</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ItineraireImpl#getModesTransport <em>Modes Transport</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.pdc.taqmac.dsl.model.impl.ItineraireImpl#getModesAffichage <em>Modes Affichage</em>}</li>
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
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Destination destination;

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
	 * The cached value of the '{@link #getModesTransport() <em>Modes Transport</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModesTransport()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeModeTransport> modesTransport;

	/**
	 * The cached value of the '{@link #getModesAffichage() <em>Modes Affichage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModesAffichage()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeModeAffichage> modesAffichage;

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
		return ModelPackage.Literals.ITINERAIRE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITINERAIRE__ENTREPRISE, oldEntreprise,
					entreprise));
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
					ModelPackage.ITINERAIRE__DESTINATION, oldDestination, newDestination);
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
						EOPPOSITE_FEATURE_BASE - ModelPackage.ITINERAIRE__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject) newDestination).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.ITINERAIRE__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITINERAIRE__DESTINATION, newDestination,
					newDestination));
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
					ModelPackage.ITINERAIRE__PLAGE_HORAIRE, oldPlageHoraire, newPlageHoraire);
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
						EOPPOSITE_FEATURE_BASE - ModelPackage.ITINERAIRE__PLAGE_HORAIRE, null, msgs);
			if (newPlageHoraire != null)
				msgs = ((InternalEObject) newPlageHoraire).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.ITINERAIRE__PLAGE_HORAIRE, null, msgs);
			msgs = basicSetPlageHoraire(newPlageHoraire, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITINERAIRE__PLAGE_HORAIRE,
					newPlageHoraire, newPlageHoraire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeModeTransport> getModesTransport() {
		if (modesTransport == null) {
			modesTransport = new EDataTypeUniqueEList<TypeModeTransport>(TypeModeTransport.class, this,
					ModelPackage.ITINERAIRE__MODES_TRANSPORT);
		}
		return modesTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeModeAffichage> getModesAffichage() {
		if (modesAffichage == null) {
			modesAffichage = new EDataTypeUniqueEList<TypeModeAffichage>(TypeModeAffichage.class, this,
					ModelPackage.ITINERAIRE__MODES_AFFICHAGE);
		}
		return modesAffichage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.ITINERAIRE__DESTINATION:
			return basicSetDestination(null, msgs);
		case ModelPackage.ITINERAIRE__PLAGE_HORAIRE:
			return basicSetPlageHoraire(null, msgs);
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
		case ModelPackage.ITINERAIRE__ENTREPRISE:
			return getEntreprise();
		case ModelPackage.ITINERAIRE__DESTINATION:
			return getDestination();
		case ModelPackage.ITINERAIRE__PLAGE_HORAIRE:
			return getPlageHoraire();
		case ModelPackage.ITINERAIRE__MODES_TRANSPORT:
			return getModesTransport();
		case ModelPackage.ITINERAIRE__MODES_AFFICHAGE:
			return getModesAffichage();
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
		case ModelPackage.ITINERAIRE__ENTREPRISE:
			setEntreprise((String) newValue);
			return;
		case ModelPackage.ITINERAIRE__DESTINATION:
			setDestination((Destination) newValue);
			return;
		case ModelPackage.ITINERAIRE__PLAGE_HORAIRE:
			setPlageHoraire((PlageHoraire) newValue);
			return;
		case ModelPackage.ITINERAIRE__MODES_TRANSPORT:
			getModesTransport().clear();
			getModesTransport().addAll((Collection<? extends TypeModeTransport>) newValue);
			return;
		case ModelPackage.ITINERAIRE__MODES_AFFICHAGE:
			getModesAffichage().clear();
			getModesAffichage().addAll((Collection<? extends TypeModeAffichage>) newValue);
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
		case ModelPackage.ITINERAIRE__ENTREPRISE:
			setEntreprise(ENTREPRISE_EDEFAULT);
			return;
		case ModelPackage.ITINERAIRE__DESTINATION:
			setDestination((Destination) null);
			return;
		case ModelPackage.ITINERAIRE__PLAGE_HORAIRE:
			setPlageHoraire((PlageHoraire) null);
			return;
		case ModelPackage.ITINERAIRE__MODES_TRANSPORT:
			getModesTransport().clear();
			return;
		case ModelPackage.ITINERAIRE__MODES_AFFICHAGE:
			getModesAffichage().clear();
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
		case ModelPackage.ITINERAIRE__ENTREPRISE:
			return ENTREPRISE_EDEFAULT == null ? entreprise != null : !ENTREPRISE_EDEFAULT.equals(entreprise);
		case ModelPackage.ITINERAIRE__DESTINATION:
			return destination != null;
		case ModelPackage.ITINERAIRE__PLAGE_HORAIRE:
			return plageHoraire != null;
		case ModelPackage.ITINERAIRE__MODES_TRANSPORT:
			return modesTransport != null && !modesTransport.isEmpty();
		case ModelPackage.ITINERAIRE__MODES_AFFICHAGE:
			return modesAffichage != null && !modesAffichage.isEmpty();
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
		result.append(", modesTransport: ");
		result.append(modesTransport);
		result.append(", modesAffichage: ");
		result.append(modesAffichage);
		result.append(')');
		return result.toString();
	}

} //ItineraireImpl
