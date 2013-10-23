/**
 */
package at.bestsolution.myfond.model.myfond;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.myfond.model.myfond.CountryDistribution#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.CountryDistribution#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getCountryDistribution()
 * @model
 * @generated
 */
public interface CountryDistribution extends EObject {
	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(double)
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getCountryDistribution_Percentage()
	 * @model
	 * @generated
	 */
	double getPercentage();

	/**
	 * Sets the value of the '{@link at.bestsolution.myfond.model.myfond.CountryDistribution#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(double value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' reference.
	 * @see #setCountry(Country)
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getCountryDistribution_Country()
	 * @model
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link at.bestsolution.myfond.model.myfond.CountryDistribution#getCountry <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

} // CountryDistribution
