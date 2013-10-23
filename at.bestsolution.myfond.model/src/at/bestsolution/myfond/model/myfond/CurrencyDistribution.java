/**
 */
package at.bestsolution.myfond.model.myfond;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Currency Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.myfond.model.myfond.CurrencyDistribution#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.CurrencyDistribution#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getCurrencyDistribution()
 * @model
 * @generated
 */
public interface CurrencyDistribution extends EObject {
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
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getCurrencyDistribution_Percentage()
	 * @model
	 * @generated
	 */
	double getPercentage();

	/**
	 * Sets the value of the '{@link at.bestsolution.myfond.model.myfond.CurrencyDistribution#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(double value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' reference.
	 * @see #setCurrency(Currency)
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getCurrencyDistribution_Currency()
	 * @model
	 * @generated
	 */
	Currency getCurrency();

	/**
	 * Sets the value of the '{@link at.bestsolution.myfond.model.myfond.CurrencyDistribution#getCurrency <em>Currency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' reference.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(Currency value);

} // CurrencyDistribution
