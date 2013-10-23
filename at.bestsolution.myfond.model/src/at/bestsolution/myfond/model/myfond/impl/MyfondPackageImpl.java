/**
 */
package at.bestsolution.myfond.model.myfond.impl;

import at.bestsolution.myfond.model.myfond.Asset;
import at.bestsolution.myfond.model.myfond.AssetDistribution;
import at.bestsolution.myfond.model.myfond.Country;
import at.bestsolution.myfond.model.myfond.CountryDistribution;
import at.bestsolution.myfond.model.myfond.Currency;
import at.bestsolution.myfond.model.myfond.CurrencyDistribution;
import at.bestsolution.myfond.model.myfond.Fond;
import at.bestsolution.myfond.model.myfond.MyFond;
import at.bestsolution.myfond.model.myfond.MyfondFactory;
import at.bestsolution.myfond.model.myfond.MyfondPackage;
import at.bestsolution.myfond.model.myfond.Risk;
import at.bestsolution.myfond.model.myfond.Sector;
import at.bestsolution.myfond.model.myfond.SectorDistribution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyfondPackageImpl extends EPackageImpl implements MyfondPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myFondEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fondEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currencyDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectorDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum riskEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.bestsolution.myfond.model.myfond.MyfondPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MyfondPackageImpl() {
		super(eNS_URI, MyfondFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MyfondPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MyfondPackage init() {
		if (isInited) return (MyfondPackage)EPackage.Registry.INSTANCE.getEPackage(MyfondPackage.eNS_URI);

		// Obtain or create and register package
		MyfondPackageImpl theMyfondPackage = (MyfondPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MyfondPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MyfondPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMyfondPackage.createPackageContents();

		// Initialize created meta-data
		theMyfondPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMyfondPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MyfondPackage.eNS_URI, theMyfondPackage);
		return theMyfondPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMyFond() {
		return myFondEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMyFond_CurrencyList() {
		return (EReference)myFondEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMyFond_FondList() {
		return (EReference)myFondEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMyFond_AssetList() {
		return (EReference)myFondEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMyFond_CountryList() {
		return (EReference)myFondEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMyFond_SectorList() {
		return (EReference)myFondEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFond() {
		return fondEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFond_CurrencyDistributionList() {
		return (EReference)fondEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFond_AssetDistributionList() {
		return (EReference)fondEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFond_CountryDistributionList() {
		return (EReference)fondEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFond_SectorDistributionList() {
		return (EReference)fondEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFond_Name() {
		return (EAttribute)fondEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFond_Id() {
		return (EAttribute)fondEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFond_Currency() {
		return (EReference)fondEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFond_StartDate() {
		return (EAttribute)fondEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFond_AssetBasedFee() {
		return (EAttribute)fondEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFond_ManagementFee() {
		return (EAttribute)fondEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFond_Risk() {
		return (EAttribute)fondEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFond_TargetDefinition() {
		return (EAttribute)fondEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFond_AdvicedMinHold() {
		return (EAttribute)fondEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrencyDistribution() {
		return currencyDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyDistribution_Percentage() {
		return (EAttribute)currencyDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyDistribution_Currency() {
		return (EReference)currencyDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrency() {
		return currencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrency_Name() {
		return (EAttribute)currencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrency_Symbol() {
		return (EAttribute)currencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssetDistribution() {
		return assetDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetDistribution_Percentage() {
		return (EAttribute)assetDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetDistribution_Asset() {
		return (EReference)assetDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_Name() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountryDistribution() {
		return countryDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryDistribution_Percentage() {
		return (EAttribute)countryDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountryDistribution_Country() {
		return (EReference)countryDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountry() {
		return countryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountry_Name() {
		return (EAttribute)countryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSectorDistribution() {
		return sectorDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectorDistribution_Percentage() {
		return (EAttribute)sectorDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectorDistribution_Sector() {
		return (EReference)sectorDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSector() {
		return sectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSector_Name() {
		return (EAttribute)sectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRisk() {
		return riskEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyfondFactory getMyfondFactory() {
		return (MyfondFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		myFondEClass = createEClass(MY_FOND);
		createEReference(myFondEClass, MY_FOND__CURRENCY_LIST);
		createEReference(myFondEClass, MY_FOND__FOND_LIST);
		createEReference(myFondEClass, MY_FOND__ASSET_LIST);
		createEReference(myFondEClass, MY_FOND__COUNTRY_LIST);
		createEReference(myFondEClass, MY_FOND__SECTOR_LIST);

		fondEClass = createEClass(FOND);
		createEReference(fondEClass, FOND__CURRENCY_DISTRIBUTION_LIST);
		createEReference(fondEClass, FOND__ASSET_DISTRIBUTION_LIST);
		createEReference(fondEClass, FOND__COUNTRY_DISTRIBUTION_LIST);
		createEReference(fondEClass, FOND__SECTOR_DISTRIBUTION_LIST);
		createEAttribute(fondEClass, FOND__NAME);
		createEAttribute(fondEClass, FOND__ID);
		createEReference(fondEClass, FOND__CURRENCY);
		createEAttribute(fondEClass, FOND__START_DATE);
		createEAttribute(fondEClass, FOND__ASSET_BASED_FEE);
		createEAttribute(fondEClass, FOND__MANAGEMENT_FEE);
		createEAttribute(fondEClass, FOND__RISK);
		createEAttribute(fondEClass, FOND__TARGET_DEFINITION);
		createEAttribute(fondEClass, FOND__ADVICED_MIN_HOLD);

		currencyDistributionEClass = createEClass(CURRENCY_DISTRIBUTION);
		createEAttribute(currencyDistributionEClass, CURRENCY_DISTRIBUTION__PERCENTAGE);
		createEReference(currencyDistributionEClass, CURRENCY_DISTRIBUTION__CURRENCY);

		currencyEClass = createEClass(CURRENCY);
		createEAttribute(currencyEClass, CURRENCY__NAME);
		createEAttribute(currencyEClass, CURRENCY__SYMBOL);

		assetDistributionEClass = createEClass(ASSET_DISTRIBUTION);
		createEAttribute(assetDistributionEClass, ASSET_DISTRIBUTION__PERCENTAGE);
		createEReference(assetDistributionEClass, ASSET_DISTRIBUTION__ASSET);

		assetEClass = createEClass(ASSET);
		createEAttribute(assetEClass, ASSET__NAME);

		countryDistributionEClass = createEClass(COUNTRY_DISTRIBUTION);
		createEAttribute(countryDistributionEClass, COUNTRY_DISTRIBUTION__PERCENTAGE);
		createEReference(countryDistributionEClass, COUNTRY_DISTRIBUTION__COUNTRY);

		countryEClass = createEClass(COUNTRY);
		createEAttribute(countryEClass, COUNTRY__NAME);

		sectorDistributionEClass = createEClass(SECTOR_DISTRIBUTION);
		createEAttribute(sectorDistributionEClass, SECTOR_DISTRIBUTION__PERCENTAGE);
		createEReference(sectorDistributionEClass, SECTOR_DISTRIBUTION__SECTOR);

		sectorEClass = createEClass(SECTOR);
		createEAttribute(sectorEClass, SECTOR__NAME);

		// Create enums
		riskEEnum = createEEnum(RISK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(myFondEClass, MyFond.class, "MyFond", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMyFond_CurrencyList(), this.getCurrency(), null, "currencyList", null, 0, -1, MyFond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMyFond_FondList(), this.getFond(), null, "fondList", null, 0, -1, MyFond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMyFond_AssetList(), this.getAsset(), null, "assetList", null, 0, -1, MyFond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMyFond_CountryList(), this.getCountry(), null, "countryList", null, 0, -1, MyFond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMyFond_SectorList(), this.getSector(), null, "sectorList", null, 0, -1, MyFond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fondEClass, Fond.class, "Fond", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFond_CurrencyDistributionList(), this.getCurrencyDistribution(), null, "currencyDistributionList", null, 0, -1, Fond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFond_AssetDistributionList(), this.getAssetDistribution(), null, "assetDistributionList", null, 0, -1, Fond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFond_CountryDistributionList(), this.getCountryDistribution(), null, "countryDistributionList", null, 0, -1, Fond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFond_SectorDistributionList(), this.getSectorDistribution(), null, "sectorDistributionList", null, 0, -1, Fond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFond_Name(), ecorePackage.getEString(), "name", null, 0, 1, Fond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFond_Id(), ecorePackage.getEString(), "id", null, 0, 1, Fond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFond_Currency(), this.getCurrency(), null, "currency", null, 0, 1, Fond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFond_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Fond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFond_AssetBasedFee(), ecorePackage.getEDouble(), "assetBasedFee", null, 0, 1, Fond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFond_ManagementFee(), ecorePackage.getEDouble(), "managementFee", null, 0, 1, Fond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFond_Risk(), this.getRisk(), "risk", null, 0, 1, Fond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFond_TargetDefinition(), ecorePackage.getEString(), "targetDefinition", null, 0, 1, Fond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFond_AdvicedMinHold(), ecorePackage.getEInt(), "advicedMinHold", null, 0, 1, Fond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currencyDistributionEClass, CurrencyDistribution.class, "CurrencyDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurrencyDistribution_Percentage(), ecorePackage.getEDouble(), "percentage", null, 0, 1, CurrencyDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyDistribution_Currency(), this.getCurrency(), null, "currency", null, 0, 1, CurrencyDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currencyEClass, Currency.class, "Currency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurrency_Name(), ecorePackage.getEString(), "name", null, 0, 1, Currency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrency_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, Currency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetDistributionEClass, AssetDistribution.class, "AssetDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssetDistribution_Percentage(), ecorePackage.getEDouble(), "percentage", null, 0, 1, AssetDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetDistribution_Asset(), this.getAsset(), null, "asset", null, 0, 1, AssetDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsset_Name(), ecorePackage.getEString(), "name", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countryDistributionEClass, CountryDistribution.class, "CountryDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountryDistribution_Percentage(), ecorePackage.getEDouble(), "percentage", null, 0, 1, CountryDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountryDistribution_Country(), this.getCountry(), null, "country", null, 0, 1, CountryDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countryEClass, Country.class, "Country", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountry_Name(), ecorePackage.getEString(), "name", null, 0, 1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectorDistributionEClass, SectorDistribution.class, "SectorDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSectorDistribution_Percentage(), ecorePackage.getEDouble(), "percentage", null, 0, 1, SectorDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSectorDistribution_Sector(), this.getSector(), null, "sector", null, 0, 1, SectorDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectorEClass, Sector.class, "Sector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSector_Name(), ecorePackage.getEString(), "name", null, 0, 1, Sector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(riskEEnum, Risk.class, "Risk");
		addEEnumLiteral(riskEEnum, Risk.R1);
		addEEnumLiteral(riskEEnum, Risk.R2);
		addEEnumLiteral(riskEEnum, Risk.R3);
		addEEnumLiteral(riskEEnum, Risk.R4);
		addEEnumLiteral(riskEEnum, Risk.R5);
		addEEnumLiteral(riskEEnum, Risk.R6);
		addEEnumLiteral(riskEEnum, Risk.R7);

		// Create resource
		createResource(eNS_URI);
	}

} //MyfondPackageImpl
