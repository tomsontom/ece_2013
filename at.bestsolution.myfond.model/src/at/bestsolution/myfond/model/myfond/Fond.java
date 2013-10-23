/**
 */
package at.bestsolution.myfond.model.myfond;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.myfond.model.myfond.Fond#getCurrencyDistributionList <em>Currency Distribution List</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.Fond#getAssetDistributionList <em>Asset Distribution List</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.Fond#getCountryDistributionList <em>Country Distribution List</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.Fond#getSectorDistributionList <em>Sector Distribution List</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.Fond#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.Fond#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.Fond#getCurrency <em>Currency</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.Fond#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.Fond#getAssetBasedFee <em>Asset Based Fee</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.Fond#getManagementFee <em>Management Fee</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.Fond#getRisk <em>Risk</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.Fond#getTargetDefinition <em>Target Definition</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.Fond#getAdvicedMinHold <em>Adviced Min Hold</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getFond()
 * @model
 * @generated
 */
public interface Fond extends EObject {
	/**
	 * Returns the value of the '<em><b>Currency Distribution List</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.myfond.model.myfond.CurrencyDistribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Distribution List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Distribution List</em>' containment reference list.
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getFond_CurrencyDistributionList()
	 * @model containment="true"
	 * @generated
	 */
	EList<CurrencyDistribution> getCurrencyDistributionList();

	/**
	 * Returns the value of the '<em><b>Asset Distribution List</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.myfond.model.myfond.AssetDistribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Distribution List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Distribution List</em>' containment reference list.
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getFond_AssetDistributionList()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssetDistribution> getAssetDistributionList();

	/**
	 * Returns the value of the '<em><b>Country Distribution List</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.myfond.model.myfond.CountryDistribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Distribution List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Distribution List</em>' containment reference list.
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getFond_CountryDistributionList()
	 * @model containment="true"
	 * @generated
	 */
	EList<CountryDistribution> getCountryDistributionList();

	/**
	 * Returns the value of the '<em><b>Sector Distribution List</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.myfond.model.myfond.SectorDistribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sector Distribution List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sector Distribution List</em>' containment reference list.
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getFond_SectorDistributionList()
	 * @model containment="true"
	 * @generated
	 */
	EList<SectorDistribution> getSectorDistributionList();

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
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getFond_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.bestsolution.myfond.model.myfond.Fond#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getFond_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link at.bestsolution.myfond.model.myfond.Fond#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getFond_Currency()
	 * @model
	 * @generated
	 */
	Currency getCurrency();

	/**
	 * Sets the value of the '{@link at.bestsolution.myfond.model.myfond.Fond#getCurrency <em>Currency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' reference.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(Currency value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getFond_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link at.bestsolution.myfond.model.myfond.Fond#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Asset Based Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Based Fee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Based Fee</em>' attribute.
	 * @see #setAssetBasedFee(double)
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getFond_AssetBasedFee()
	 * @model
	 * @generated
	 */
	double getAssetBasedFee();

	/**
	 * Sets the value of the '{@link at.bestsolution.myfond.model.myfond.Fond#getAssetBasedFee <em>Asset Based Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Based Fee</em>' attribute.
	 * @see #getAssetBasedFee()
	 * @generated
	 */
	void setAssetBasedFee(double value);

	/**
	 * Returns the value of the '<em><b>Management Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Management Fee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Management Fee</em>' attribute.
	 * @see #setManagementFee(double)
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getFond_ManagementFee()
	 * @model
	 * @generated
	 */
	double getManagementFee();

	/**
	 * Sets the value of the '{@link at.bestsolution.myfond.model.myfond.Fond#getManagementFee <em>Management Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Management Fee</em>' attribute.
	 * @see #getManagementFee()
	 * @generated
	 */
	void setManagementFee(double value);

	/**
	 * Returns the value of the '<em><b>Risk</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.myfond.model.myfond.Risk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk</em>' attribute.
	 * @see at.bestsolution.myfond.model.myfond.Risk
	 * @see #setRisk(Risk)
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getFond_Risk()
	 * @model
	 * @generated
	 */
	Risk getRisk();

	/**
	 * Sets the value of the '{@link at.bestsolution.myfond.model.myfond.Fond#getRisk <em>Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk</em>' attribute.
	 * @see at.bestsolution.myfond.model.myfond.Risk
	 * @see #getRisk()
	 * @generated
	 */
	void setRisk(Risk value);

	/**
	 * Returns the value of the '<em><b>Target Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Definition</em>' attribute.
	 * @see #setTargetDefinition(String)
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getFond_TargetDefinition()
	 * @model
	 * @generated
	 */
	String getTargetDefinition();

	/**
	 * Sets the value of the '{@link at.bestsolution.myfond.model.myfond.Fond#getTargetDefinition <em>Target Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Definition</em>' attribute.
	 * @see #getTargetDefinition()
	 * @generated
	 */
	void setTargetDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Adviced Min Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adviced Min Hold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adviced Min Hold</em>' attribute.
	 * @see #setAdvicedMinHold(int)
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getFond_AdvicedMinHold()
	 * @model
	 * @generated
	 */
	int getAdvicedMinHold();

	/**
	 * Sets the value of the '{@link at.bestsolution.myfond.model.myfond.Fond#getAdvicedMinHold <em>Adviced Min Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adviced Min Hold</em>' attribute.
	 * @see #getAdvicedMinHold()
	 * @generated
	 */
	void setAdvicedMinHold(int value);

} // Fond
