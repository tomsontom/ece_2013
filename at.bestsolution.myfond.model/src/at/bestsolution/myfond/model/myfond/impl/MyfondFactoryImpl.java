/**
 */
package at.bestsolution.myfond.model.myfond.impl;

import at.bestsolution.myfond.model.myfond.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyfondFactoryImpl extends EFactoryImpl implements MyfondFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MyfondFactory init() {
		try {
			MyfondFactory theMyfondFactory = (MyfondFactory)EPackage.Registry.INSTANCE.getEFactory(MyfondPackage.eNS_URI);
			if (theMyfondFactory != null) {
				return theMyfondFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MyfondFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyfondFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MyfondPackage.MY_FOND: return (EObject)createMyFond();
			case MyfondPackage.FOND: return (EObject)createFond();
			case MyfondPackage.CURRENCY_DISTRIBUTION: return (EObject)createCurrencyDistribution();
			case MyfondPackage.CURRENCY: return (EObject)createCurrency();
			case MyfondPackage.ASSET_DISTRIBUTION: return (EObject)createAssetDistribution();
			case MyfondPackage.ASSET: return (EObject)createAsset();
			case MyfondPackage.COUNTRY_DISTRIBUTION: return (EObject)createCountryDistribution();
			case MyfondPackage.COUNTRY: return (EObject)createCountry();
			case MyfondPackage.SECTOR_DISTRIBUTION: return (EObject)createSectorDistribution();
			case MyfondPackage.SECTOR: return (EObject)createSector();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MyfondPackage.RISK:
				return createRiskFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MyfondPackage.RISK:
				return convertRiskToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyFond createMyFond() {
		MyFondImpl myFond = new MyFondImpl();
		return myFond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fond createFond() {
		FondImpl fond = new FondImpl();
		return fond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyDistribution createCurrencyDistribution() {
		CurrencyDistributionImpl currencyDistribution = new CurrencyDistributionImpl();
		return currencyDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency createCurrency() {
		CurrencyImpl currency = new CurrencyImpl();
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetDistribution createAssetDistribution() {
		AssetDistributionImpl assetDistribution = new AssetDistributionImpl();
		return assetDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountryDistribution createCountryDistribution() {
		CountryDistributionImpl countryDistribution = new CountryDistributionImpl();
		return countryDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country createCountry() {
		CountryImpl country = new CountryImpl();
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectorDistribution createSectorDistribution() {
		SectorDistributionImpl sectorDistribution = new SectorDistributionImpl();
		return sectorDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sector createSector() {
		SectorImpl sector = new SectorImpl();
		return sector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Risk createRiskFromString(EDataType eDataType, String initialValue) {
		Risk result = Risk.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRiskToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyfondPackage getMyfondPackage() {
		return (MyfondPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MyfondPackage getPackage() {
		return MyfondPackage.eINSTANCE;
	}

} //MyfondFactoryImpl
