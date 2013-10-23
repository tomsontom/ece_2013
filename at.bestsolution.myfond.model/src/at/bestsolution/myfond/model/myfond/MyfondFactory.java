/**
 */
package at.bestsolution.myfond.model.myfond;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.myfond.model.myfond.MyfondPackage
 * @generated
 */
public interface MyfondFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MyfondFactory eINSTANCE = at.bestsolution.myfond.model.myfond.impl.MyfondFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>My Fond</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Fond</em>'.
	 * @generated
	 */
	MyFond createMyFond();

	/**
	 * Returns a new object of class '<em>Fond</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fond</em>'.
	 * @generated
	 */
	Fond createFond();

	/**
	 * Returns a new object of class '<em>Currency Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Currency Distribution</em>'.
	 * @generated
	 */
	CurrencyDistribution createCurrencyDistribution();

	/**
	 * Returns a new object of class '<em>Currency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Currency</em>'.
	 * @generated
	 */
	Currency createCurrency();

	/**
	 * Returns a new object of class '<em>Asset Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset Distribution</em>'.
	 * @generated
	 */
	AssetDistribution createAssetDistribution();

	/**
	 * Returns a new object of class '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset</em>'.
	 * @generated
	 */
	Asset createAsset();

	/**
	 * Returns a new object of class '<em>Country Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Country Distribution</em>'.
	 * @generated
	 */
	CountryDistribution createCountryDistribution();

	/**
	 * Returns a new object of class '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Country</em>'.
	 * @generated
	 */
	Country createCountry();

	/**
	 * Returns a new object of class '<em>Sector Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sector Distribution</em>'.
	 * @generated
	 */
	SectorDistribution createSectorDistribution();

	/**
	 * Returns a new object of class '<em>Sector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sector</em>'.
	 * @generated
	 */
	Sector createSector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MyfondPackage getMyfondPackage();

} //MyfondFactory
