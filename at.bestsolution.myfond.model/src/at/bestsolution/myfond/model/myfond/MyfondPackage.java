/**
 */
package at.bestsolution.myfond.model.myfond;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bestsolution.myfond.model.myfond.MyfondFactory
 * @model kind="package"
 * @generated
 */
public interface MyfondPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "myfond";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bestsolution.at/myfond";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "myfond";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MyfondPackage eINSTANCE = at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.bestsolution.myfond.model.myfond.impl.MyFondImpl <em>My Fond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.myfond.model.myfond.impl.MyFondImpl
	 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getMyFond()
	 * @generated
	 */
	int MY_FOND = 0;

	/**
	 * The feature id for the '<em><b>Currency List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_FOND__CURRENCY_LIST = 0;

	/**
	 * The feature id for the '<em><b>Fond List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_FOND__FOND_LIST = 1;

	/**
	 * The feature id for the '<em><b>Asset List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_FOND__ASSET_LIST = 2;

	/**
	 * The feature id for the '<em><b>Country List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_FOND__COUNTRY_LIST = 3;

	/**
	 * The feature id for the '<em><b>Sector List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_FOND__SECTOR_LIST = 4;

	/**
	 * The number of structural features of the '<em>My Fond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_FOND_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>My Fond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_FOND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.myfond.model.myfond.impl.FondImpl <em>Fond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.myfond.model.myfond.impl.FondImpl
	 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getFond()
	 * @generated
	 */
	int FOND = 1;

	/**
	 * The feature id for the '<em><b>Currency Distribution List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOND__CURRENCY_DISTRIBUTION_LIST = 0;

	/**
	 * The feature id for the '<em><b>Asset Distribution List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOND__ASSET_DISTRIBUTION_LIST = 1;

	/**
	 * The feature id for the '<em><b>Country Distribution List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOND__COUNTRY_DISTRIBUTION_LIST = 2;

	/**
	 * The feature id for the '<em><b>Sector Distribution List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOND__SECTOR_DISTRIBUTION_LIST = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOND__NAME = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOND__ID = 5;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOND__CURRENCY = 6;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOND__START_DATE = 7;

	/**
	 * The feature id for the '<em><b>Asset Based Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOND__ASSET_BASED_FEE = 8;

	/**
	 * The feature id for the '<em><b>Management Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOND__MANAGEMENT_FEE = 9;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOND__RISK = 10;

	/**
	 * The feature id for the '<em><b>Target Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOND__TARGET_DEFINITION = 11;

	/**
	 * The feature id for the '<em><b>Adviced Min Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOND__ADVICED_MIN_HOLD = 12;

	/**
	 * The number of structural features of the '<em>Fond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOND_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Fond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.myfond.model.myfond.impl.CurrencyDistributionImpl <em>Currency Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.myfond.model.myfond.impl.CurrencyDistributionImpl
	 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getCurrencyDistribution()
	 * @generated
	 */
	int CURRENCY_DISTRIBUTION = 2;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_DISTRIBUTION__PERCENTAGE = 0;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_DISTRIBUTION__CURRENCY = 1;

	/**
	 * The number of structural features of the '<em>Currency Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_DISTRIBUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Currency Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_DISTRIBUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.myfond.model.myfond.impl.CurrencyImpl <em>Currency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.myfond.model.myfond.impl.CurrencyImpl
	 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getCurrency()
	 * @generated
	 */
	int CURRENCY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY__SYMBOL = 1;

	/**
	 * The number of structural features of the '<em>Currency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Currency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.myfond.model.myfond.impl.AssetDistributionImpl <em>Asset Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.myfond.model.myfond.impl.AssetDistributionImpl
	 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getAssetDistribution()
	 * @generated
	 */
	int ASSET_DISTRIBUTION = 4;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_DISTRIBUTION__PERCENTAGE = 0;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_DISTRIBUTION__ASSET = 1;

	/**
	 * The number of structural features of the '<em>Asset Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_DISTRIBUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Asset Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_DISTRIBUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.myfond.model.myfond.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.myfond.model.myfond.impl.AssetImpl
	 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = 0;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.myfond.model.myfond.impl.CountryDistributionImpl <em>Country Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.myfond.model.myfond.impl.CountryDistributionImpl
	 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getCountryDistribution()
	 * @generated
	 */
	int COUNTRY_DISTRIBUTION = 6;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_DISTRIBUTION__PERCENTAGE = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_DISTRIBUTION__COUNTRY = 1;

	/**
	 * The number of structural features of the '<em>Country Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_DISTRIBUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Country Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_DISTRIBUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.myfond.model.myfond.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.myfond.model.myfond.impl.CountryImpl
	 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.myfond.model.myfond.impl.SectorDistributionImpl <em>Sector Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.myfond.model.myfond.impl.SectorDistributionImpl
	 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getSectorDistribution()
	 * @generated
	 */
	int SECTOR_DISTRIBUTION = 8;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR_DISTRIBUTION__PERCENTAGE = 0;

	/**
	 * The feature id for the '<em><b>Sector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR_DISTRIBUTION__SECTOR = 1;

	/**
	 * The number of structural features of the '<em>Sector Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR_DISTRIBUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sector Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR_DISTRIBUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.myfond.model.myfond.impl.SectorImpl <em>Sector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.myfond.model.myfond.impl.SectorImpl
	 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getSector()
	 * @generated
	 */
	int SECTOR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Sector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.myfond.model.myfond.Risk <em>Risk</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.myfond.model.myfond.Risk
	 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getRisk()
	 * @generated
	 */
	int RISK = 10;


	/**
	 * Returns the meta object for class '{@link at.bestsolution.myfond.model.myfond.MyFond <em>My Fond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Fond</em>'.
	 * @see at.bestsolution.myfond.model.myfond.MyFond
	 * @generated
	 */
	EClass getMyFond();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.myfond.model.myfond.MyFond#getCurrencyList <em>Currency List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currency List</em>'.
	 * @see at.bestsolution.myfond.model.myfond.MyFond#getCurrencyList()
	 * @see #getMyFond()
	 * @generated
	 */
	EReference getMyFond_CurrencyList();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.myfond.model.myfond.MyFond#getFondList <em>Fond List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fond List</em>'.
	 * @see at.bestsolution.myfond.model.myfond.MyFond#getFondList()
	 * @see #getMyFond()
	 * @generated
	 */
	EReference getMyFond_FondList();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.myfond.model.myfond.MyFond#getAssetList <em>Asset List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asset List</em>'.
	 * @see at.bestsolution.myfond.model.myfond.MyFond#getAssetList()
	 * @see #getMyFond()
	 * @generated
	 */
	EReference getMyFond_AssetList();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.myfond.model.myfond.MyFond#getCountryList <em>Country List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Country List</em>'.
	 * @see at.bestsolution.myfond.model.myfond.MyFond#getCountryList()
	 * @see #getMyFond()
	 * @generated
	 */
	EReference getMyFond_CountryList();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.myfond.model.myfond.MyFond#getSectorList <em>Sector List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sector List</em>'.
	 * @see at.bestsolution.myfond.model.myfond.MyFond#getSectorList()
	 * @see #getMyFond()
	 * @generated
	 */
	EReference getMyFond_SectorList();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.myfond.model.myfond.Fond <em>Fond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fond</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Fond
	 * @generated
	 */
	EClass getFond();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.myfond.model.myfond.Fond#getCurrencyDistributionList <em>Currency Distribution List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currency Distribution List</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Fond#getCurrencyDistributionList()
	 * @see #getFond()
	 * @generated
	 */
	EReference getFond_CurrencyDistributionList();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.myfond.model.myfond.Fond#getAssetDistributionList <em>Asset Distribution List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asset Distribution List</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Fond#getAssetDistributionList()
	 * @see #getFond()
	 * @generated
	 */
	EReference getFond_AssetDistributionList();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.myfond.model.myfond.Fond#getCountryDistributionList <em>Country Distribution List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Country Distribution List</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Fond#getCountryDistributionList()
	 * @see #getFond()
	 * @generated
	 */
	EReference getFond_CountryDistributionList();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.myfond.model.myfond.Fond#getSectorDistributionList <em>Sector Distribution List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sector Distribution List</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Fond#getSectorDistributionList()
	 * @see #getFond()
	 * @generated
	 */
	EReference getFond_SectorDistributionList();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.myfond.model.myfond.Fond#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Fond#getName()
	 * @see #getFond()
	 * @generated
	 */
	EAttribute getFond_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.myfond.model.myfond.Fond#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Fond#getId()
	 * @see #getFond()
	 * @generated
	 */
	EAttribute getFond_Id();

	/**
	 * Returns the meta object for the reference '{@link at.bestsolution.myfond.model.myfond.Fond#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Fond#getCurrency()
	 * @see #getFond()
	 * @generated
	 */
	EReference getFond_Currency();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.myfond.model.myfond.Fond#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Fond#getStartDate()
	 * @see #getFond()
	 * @generated
	 */
	EAttribute getFond_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.myfond.model.myfond.Fond#getAssetBasedFee <em>Asset Based Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Based Fee</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Fond#getAssetBasedFee()
	 * @see #getFond()
	 * @generated
	 */
	EAttribute getFond_AssetBasedFee();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.myfond.model.myfond.Fond#getManagementFee <em>Management Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Management Fee</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Fond#getManagementFee()
	 * @see #getFond()
	 * @generated
	 */
	EAttribute getFond_ManagementFee();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.myfond.model.myfond.Fond#getRisk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Fond#getRisk()
	 * @see #getFond()
	 * @generated
	 */
	EAttribute getFond_Risk();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.myfond.model.myfond.Fond#getTargetDefinition <em>Target Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Definition</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Fond#getTargetDefinition()
	 * @see #getFond()
	 * @generated
	 */
	EAttribute getFond_TargetDefinition();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.myfond.model.myfond.Fond#getAdvicedMinHold <em>Adviced Min Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adviced Min Hold</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Fond#getAdvicedMinHold()
	 * @see #getFond()
	 * @generated
	 */
	EAttribute getFond_AdvicedMinHold();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.myfond.model.myfond.CurrencyDistribution <em>Currency Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency Distribution</em>'.
	 * @see at.bestsolution.myfond.model.myfond.CurrencyDistribution
	 * @generated
	 */
	EClass getCurrencyDistribution();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.myfond.model.myfond.CurrencyDistribution#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see at.bestsolution.myfond.model.myfond.CurrencyDistribution#getPercentage()
	 * @see #getCurrencyDistribution()
	 * @generated
	 */
	EAttribute getCurrencyDistribution_Percentage();

	/**
	 * Returns the meta object for the reference '{@link at.bestsolution.myfond.model.myfond.CurrencyDistribution#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency</em>'.
	 * @see at.bestsolution.myfond.model.myfond.CurrencyDistribution#getCurrency()
	 * @see #getCurrencyDistribution()
	 * @generated
	 */
	EReference getCurrencyDistribution_Currency();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.myfond.model.myfond.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Currency
	 * @generated
	 */
	EClass getCurrency();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.myfond.model.myfond.Currency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Currency#getName()
	 * @see #getCurrency()
	 * @generated
	 */
	EAttribute getCurrency_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.myfond.model.myfond.Currency#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Currency#getSymbol()
	 * @see #getCurrency()
	 * @generated
	 */
	EAttribute getCurrency_Symbol();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.myfond.model.myfond.AssetDistribution <em>Asset Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Distribution</em>'.
	 * @see at.bestsolution.myfond.model.myfond.AssetDistribution
	 * @generated
	 */
	EClass getAssetDistribution();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.myfond.model.myfond.AssetDistribution#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see at.bestsolution.myfond.model.myfond.AssetDistribution#getPercentage()
	 * @see #getAssetDistribution()
	 * @generated
	 */
	EAttribute getAssetDistribution_Percentage();

	/**
	 * Returns the meta object for the reference '{@link at.bestsolution.myfond.model.myfond.AssetDistribution#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see at.bestsolution.myfond.model.myfond.AssetDistribution#getAsset()
	 * @see #getAssetDistribution()
	 * @generated
	 */
	EReference getAssetDistribution_Asset();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.myfond.model.myfond.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.myfond.model.myfond.Asset#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Asset#getName()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Name();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.myfond.model.myfond.CountryDistribution <em>Country Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Distribution</em>'.
	 * @see at.bestsolution.myfond.model.myfond.CountryDistribution
	 * @generated
	 */
	EClass getCountryDistribution();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.myfond.model.myfond.CountryDistribution#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see at.bestsolution.myfond.model.myfond.CountryDistribution#getPercentage()
	 * @see #getCountryDistribution()
	 * @generated
	 */
	EAttribute getCountryDistribution_Percentage();

	/**
	 * Returns the meta object for the reference '{@link at.bestsolution.myfond.model.myfond.CountryDistribution#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see at.bestsolution.myfond.model.myfond.CountryDistribution#getCountry()
	 * @see #getCountryDistribution()
	 * @generated
	 */
	EReference getCountryDistribution_Country();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.myfond.model.myfond.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.myfond.model.myfond.Country#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Country#getName()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Name();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.myfond.model.myfond.SectorDistribution <em>Sector Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sector Distribution</em>'.
	 * @see at.bestsolution.myfond.model.myfond.SectorDistribution
	 * @generated
	 */
	EClass getSectorDistribution();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.myfond.model.myfond.SectorDistribution#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see at.bestsolution.myfond.model.myfond.SectorDistribution#getPercentage()
	 * @see #getSectorDistribution()
	 * @generated
	 */
	EAttribute getSectorDistribution_Percentage();

	/**
	 * Returns the meta object for the reference '{@link at.bestsolution.myfond.model.myfond.SectorDistribution#getSector <em>Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sector</em>'.
	 * @see at.bestsolution.myfond.model.myfond.SectorDistribution#getSector()
	 * @see #getSectorDistribution()
	 * @generated
	 */
	EReference getSectorDistribution_Sector();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.myfond.model.myfond.Sector <em>Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sector</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Sector
	 * @generated
	 */
	EClass getSector();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.myfond.model.myfond.Sector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Sector#getName()
	 * @see #getSector()
	 * @generated
	 */
	EAttribute getSector_Name();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.myfond.model.myfond.Risk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Risk</em>'.
	 * @see at.bestsolution.myfond.model.myfond.Risk
	 * @generated
	 */
	EEnum getRisk();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MyfondFactory getMyfondFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.bestsolution.myfond.model.myfond.impl.MyFondImpl <em>My Fond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.myfond.model.myfond.impl.MyFondImpl
		 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getMyFond()
		 * @generated
		 */
		EClass MY_FOND = eINSTANCE.getMyFond();

		/**
		 * The meta object literal for the '<em><b>Currency List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_FOND__CURRENCY_LIST = eINSTANCE.getMyFond_CurrencyList();

		/**
		 * The meta object literal for the '<em><b>Fond List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_FOND__FOND_LIST = eINSTANCE.getMyFond_FondList();

		/**
		 * The meta object literal for the '<em><b>Asset List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_FOND__ASSET_LIST = eINSTANCE.getMyFond_AssetList();

		/**
		 * The meta object literal for the '<em><b>Country List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_FOND__COUNTRY_LIST = eINSTANCE.getMyFond_CountryList();

		/**
		 * The meta object literal for the '<em><b>Sector List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_FOND__SECTOR_LIST = eINSTANCE.getMyFond_SectorList();

		/**
		 * The meta object literal for the '{@link at.bestsolution.myfond.model.myfond.impl.FondImpl <em>Fond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.myfond.model.myfond.impl.FondImpl
		 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getFond()
		 * @generated
		 */
		EClass FOND = eINSTANCE.getFond();

		/**
		 * The meta object literal for the '<em><b>Currency Distribution List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOND__CURRENCY_DISTRIBUTION_LIST = eINSTANCE.getFond_CurrencyDistributionList();

		/**
		 * The meta object literal for the '<em><b>Asset Distribution List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOND__ASSET_DISTRIBUTION_LIST = eINSTANCE.getFond_AssetDistributionList();

		/**
		 * The meta object literal for the '<em><b>Country Distribution List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOND__COUNTRY_DISTRIBUTION_LIST = eINSTANCE.getFond_CountryDistributionList();

		/**
		 * The meta object literal for the '<em><b>Sector Distribution List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOND__SECTOR_DISTRIBUTION_LIST = eINSTANCE.getFond_SectorDistributionList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOND__NAME = eINSTANCE.getFond_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOND__ID = eINSTANCE.getFond_Id();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOND__CURRENCY = eINSTANCE.getFond_Currency();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOND__START_DATE = eINSTANCE.getFond_StartDate();

		/**
		 * The meta object literal for the '<em><b>Asset Based Fee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOND__ASSET_BASED_FEE = eINSTANCE.getFond_AssetBasedFee();

		/**
		 * The meta object literal for the '<em><b>Management Fee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOND__MANAGEMENT_FEE = eINSTANCE.getFond_ManagementFee();

		/**
		 * The meta object literal for the '<em><b>Risk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOND__RISK = eINSTANCE.getFond_Risk();

		/**
		 * The meta object literal for the '<em><b>Target Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOND__TARGET_DEFINITION = eINSTANCE.getFond_TargetDefinition();

		/**
		 * The meta object literal for the '<em><b>Adviced Min Hold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOND__ADVICED_MIN_HOLD = eINSTANCE.getFond_AdvicedMinHold();

		/**
		 * The meta object literal for the '{@link at.bestsolution.myfond.model.myfond.impl.CurrencyDistributionImpl <em>Currency Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.myfond.model.myfond.impl.CurrencyDistributionImpl
		 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getCurrencyDistribution()
		 * @generated
		 */
		EClass CURRENCY_DISTRIBUTION = eINSTANCE.getCurrencyDistribution();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_DISTRIBUTION__PERCENTAGE = eINSTANCE.getCurrencyDistribution_Percentage();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_DISTRIBUTION__CURRENCY = eINSTANCE.getCurrencyDistribution_Currency();

		/**
		 * The meta object literal for the '{@link at.bestsolution.myfond.model.myfond.impl.CurrencyImpl <em>Currency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.myfond.model.myfond.impl.CurrencyImpl
		 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getCurrency()
		 * @generated
		 */
		EClass CURRENCY = eINSTANCE.getCurrency();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY__NAME = eINSTANCE.getCurrency_Name();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY__SYMBOL = eINSTANCE.getCurrency_Symbol();

		/**
		 * The meta object literal for the '{@link at.bestsolution.myfond.model.myfond.impl.AssetDistributionImpl <em>Asset Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.myfond.model.myfond.impl.AssetDistributionImpl
		 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getAssetDistribution()
		 * @generated
		 */
		EClass ASSET_DISTRIBUTION = eINSTANCE.getAssetDistribution();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_DISTRIBUTION__PERCENTAGE = eINSTANCE.getAssetDistribution_Percentage();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_DISTRIBUTION__ASSET = eINSTANCE.getAssetDistribution_Asset();

		/**
		 * The meta object literal for the '{@link at.bestsolution.myfond.model.myfond.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.myfond.model.myfond.impl.AssetImpl
		 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__NAME = eINSTANCE.getAsset_Name();

		/**
		 * The meta object literal for the '{@link at.bestsolution.myfond.model.myfond.impl.CountryDistributionImpl <em>Country Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.myfond.model.myfond.impl.CountryDistributionImpl
		 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getCountryDistribution()
		 * @generated
		 */
		EClass COUNTRY_DISTRIBUTION = eINSTANCE.getCountryDistribution();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_DISTRIBUTION__PERCENTAGE = eINSTANCE.getCountryDistribution_Percentage();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY_DISTRIBUTION__COUNTRY = eINSTANCE.getCountryDistribution_Country();

		/**
		 * The meta object literal for the '{@link at.bestsolution.myfond.model.myfond.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.myfond.model.myfond.impl.CountryImpl
		 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__NAME = eINSTANCE.getCountry_Name();

		/**
		 * The meta object literal for the '{@link at.bestsolution.myfond.model.myfond.impl.SectorDistributionImpl <em>Sector Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.myfond.model.myfond.impl.SectorDistributionImpl
		 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getSectorDistribution()
		 * @generated
		 */
		EClass SECTOR_DISTRIBUTION = eINSTANCE.getSectorDistribution();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTOR_DISTRIBUTION__PERCENTAGE = eINSTANCE.getSectorDistribution_Percentage();

		/**
		 * The meta object literal for the '<em><b>Sector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTOR_DISTRIBUTION__SECTOR = eINSTANCE.getSectorDistribution_Sector();

		/**
		 * The meta object literal for the '{@link at.bestsolution.myfond.model.myfond.impl.SectorImpl <em>Sector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.myfond.model.myfond.impl.SectorImpl
		 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getSector()
		 * @generated
		 */
		EClass SECTOR = eINSTANCE.getSector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTOR__NAME = eINSTANCE.getSector_Name();

		/**
		 * The meta object literal for the '{@link at.bestsolution.myfond.model.myfond.Risk <em>Risk</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.myfond.model.myfond.Risk
		 * @see at.bestsolution.myfond.model.myfond.impl.MyfondPackageImpl#getRisk()
		 * @generated
		 */
		EEnum RISK = eINSTANCE.getRisk();

	}

} //MyfondPackage
