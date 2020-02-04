/**
 */
package fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Modes Affichage</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.ut2j.m1ice.pdc.taqmac.metamodel.itineraire.ItinerairePackage#getModesAffichage()
 * @model
 * @generated
 */
public enum ModesAffichage implements Enumerator {
	/**
	 * The '<em><b>Texte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTE_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTE(0, "Texte", "Texte"),

	/**
	 * The '<em><b>Carte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARTE_VALUE
	 * @generated
	 * @ordered
	 */
	CARTE(1, "Carte", "Carte");

	/**
	 * The '<em><b>Texte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Texte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXTE
	 * @model name="Texte"
	 * @generated
	 * @ordered
	 */
	public static final int TEXTE_VALUE = 0;

	/**
	 * The '<em><b>Carte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Carte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARTE
	 * @model name="Carte"
	 * @generated
	 * @ordered
	 */
	public static final int CARTE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Modes Affichage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModesAffichage[] VALUES_ARRAY = new ModesAffichage[] { TEXTE, CARTE, };

	/**
	 * A public read-only list of all the '<em><b>Modes Affichage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModesAffichage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Modes Affichage</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModesAffichage get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModesAffichage result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Modes Affichage</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModesAffichage getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModesAffichage result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Modes Affichage</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModesAffichage get(int value) {
		switch (value) {
		case TEXTE_VALUE:
			return TEXTE;
		case CARTE_VALUE:
			return CARTE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ModesAffichage(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ModesAffichage
