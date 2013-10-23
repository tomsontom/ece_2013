/**
 */
package at.bestsolution.myfond.model.myfond;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Currency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.myfond.model.myfond.Currency#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.Currency#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getCurrency()
 * @model
 * @generated
 */
public interface Currency extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getCurrency_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.bestsolution.myfond.model.myfond.Currency#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getCurrency_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link at.bestsolution.myfond.model.myfond.Currency#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

} // Currency
