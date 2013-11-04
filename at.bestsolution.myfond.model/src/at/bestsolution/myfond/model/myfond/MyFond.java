/**
 */
package at.bestsolution.myfond.model.myfond;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Fond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.myfond.model.myfond.MyFond#getCurrencyList <em>Currency List</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.MyFond#getFondList <em>Fond List</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.MyFond#getAssetList <em>Asset List</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.MyFond#getCountryList <em>Country List</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.MyFond#getSectorList <em>Sector List</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getMyFond()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface MyFond extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Currency List</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.myfond.model.myfond.Currency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency List</em>' containment reference list.
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getMyFond_CurrencyList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Currency> getCurrencyList();

	/**
	 * Returns the value of the '<em><b>Fond List</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.myfond.model.myfond.Fond}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fond List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fond List</em>' containment reference list.
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getMyFond_FondList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fond> getFondList();

	/**
	 * Returns the value of the '<em><b>Asset List</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.myfond.model.myfond.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset List</em>' containment reference list.
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getMyFond_AssetList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Asset> getAssetList();

	/**
	 * Returns the value of the '<em><b>Country List</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.myfond.model.myfond.Country}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country List</em>' containment reference list.
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getMyFond_CountryList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Country> getCountryList();

	/**
	 * Returns the value of the '<em><b>Sector List</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.myfond.model.myfond.Sector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sector List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sector List</em>' containment reference list.
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#getMyFond_SectorList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sector> getSectorList();

} // MyFond
