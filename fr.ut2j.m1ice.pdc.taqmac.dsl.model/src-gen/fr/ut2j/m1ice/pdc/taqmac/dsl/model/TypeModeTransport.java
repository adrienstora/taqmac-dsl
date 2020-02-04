/**
 */
package fr.ut2j.m1ice.pdc.taqmac.dsl.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Mode Transport</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.ut2j.m1ice.pdc.taqmac.dsl.model.ModelPackage#getTypeModeTransport()
 * @model
 * @generated
 */
public enum TypeModeTransport implements Enumerator {
	/**
	 * The '<em><b>Tisseo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TISSEO_VALUE
	 * @generated
	 * @ordered
	 */
	TISSEO(0, "Tisseo", "Tisseo"),

	/**
	 * The '<em><b>Voiture</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOITURE_VALUE
	 * @generated
	 * @ordered
	 */
	VOITURE(1, "Voiture", "Voiture"),

	/**
	 * The '<em><b>Pieton</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIETON_VALUE
	 * @generated
	 * @ordered
	 */
	PIETON(2, "Pieton", "Pieton"),

	/**
	 * The '<em><b>Velo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VELO_VALUE
	 * @generated
	 * @ordered
	 */
	VELO(3, "Velo", "Velo"),

	/**
	 * The '<em><b>Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS_VALUE
	 * @generated
	 * @ordered
	 */
	BUS(4, "Bus", "Bus"),

	/**
	 * The '<em><b>Metro</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METRO_VALUE
	 * @generated
	 * @ordered
	 */
	METRO(5, "Metro", "Metro"),

	/**
	 * The '<em><b>Tram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAM_VALUE
	 * @generated
	 * @ordered
	 */
	TRAM(6, "Tram", "Tram");

	/**
	 * The '<em><b>Tisseo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tisseo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TISSEO
	 * @model name="Tisseo"
	 * @generated
	 * @ordered
	 */
	public static final int TISSEO_VALUE = 0;

	/**
	 * The '<em><b>Voiture</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Voiture</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOITURE
	 * @model name="Voiture"
	 * @generated
	 * @ordered
	 */
	public static final int VOITURE_VALUE = 1;

	/**
	 * The '<em><b>Pieton</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pieton</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIETON
	 * @model name="Pieton"
	 * @generated
	 * @ordered
	 */
	public static final int PIETON_VALUE = 2;

	/**
	 * The '<em><b>Velo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Velo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VELO
	 * @model name="Velo"
	 * @generated
	 * @ordered
	 */
	public static final int VELO_VALUE = 3;

	/**
	 * The '<em><b>Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUS
	 * @model name="Bus"
	 * @generated
	 * @ordered
	 */
	public static final int BUS_VALUE = 4;

	/**
	 * The '<em><b>Metro</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Metro</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METRO
	 * @model name="Metro"
	 * @generated
	 * @ordered
	 */
	public static final int METRO_VALUE = 5;

	/**
	 * The '<em><b>Tram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tram</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAM
	 * @model name="Tram"
	 * @generated
	 * @ordered
	 */
	public static final int TRAM_VALUE = 6;

	/**
	 * An array of all the '<em><b>Type Mode Transport</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeModeTransport[] VALUES_ARRAY = new TypeModeTransport[] { TISSEO, VOITURE, PIETON, VELO,
			BUS, METRO, TRAM, };

	/**
	 * A public read-only list of all the '<em><b>Type Mode Transport</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeModeTransport> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Mode Transport</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeModeTransport get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeModeTransport result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Mode Transport</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeModeTransport getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeModeTransport result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Mode Transport</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeModeTransport get(int value) {
		switch (value) {
		case TISSEO_VALUE:
			return TISSEO;
		case VOITURE_VALUE:
			return VOITURE;
		case PIETON_VALUE:
			return PIETON;
		case VELO_VALUE:
			return VELO;
		case BUS_VALUE:
			return BUS;
		case METRO_VALUE:
			return METRO;
		case TRAM_VALUE:
			return TRAM;
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
	private TypeModeTransport(int value, String name, String literal) {
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

} //TypeModeTransport
