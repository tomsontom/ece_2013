/**
 */
package at.bestsolution.myfond.model.myfond;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sector Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.myfond.model.myfond.SectorDistribution#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.SectorDistribution#getSector <em>Sector</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getSectorDistribution()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface SectorDistribution extends CDOObject {
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
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getSectorDistribution_Percentage()
	 * @model
	 * @generated
	 */
	double getPercentage();

	/**
	 * Sets the value of the '{@link at.bestsolution.myfond.model.myfond.SectorDistribution#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(double value);

	/**
	 * Returns the value of the '<em><b>Sector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sector</em>' reference.
	 * @see #setSector(Sector)
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getSectorDistribution_Sector()
	 * @model
	 * @generated
	 */
	Sector getSector();

	/**
	 * Sets the value of the '{@link at.bestsolution.myfond.model.myfond.SectorDistribution#getSector <em>Sector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sector</em>' reference.
	 * @see #getSector()
	 * @generated
	 */
	void setSector(Sector value);

} // SectorDistribution
