/**
 */
package at.bestsolution.myfond.model.myfond.impl;

import at.bestsolution.myfond.model.myfond.AssetDistribution;
import at.bestsolution.myfond.model.myfond.CountryDistribution;
import at.bestsolution.myfond.model.myfond.Currency;
import at.bestsolution.myfond.model.myfond.CurrencyDistribution;
import at.bestsolution.myfond.model.myfond.Fond;
import at.bestsolution.myfond.model.myfond.MyfondPackage;
import at.bestsolution.myfond.model.myfond.Risk;
import at.bestsolution.myfond.model.myfond.SectorDistribution;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fond</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.FondImpl#getCurrencyDistributionList <em>Currency Distribution List</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.FondImpl#getAssetDistributionList <em>Asset Distribution List</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.FondImpl#getCountryDistributionList <em>Country Distribution List</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.FondImpl#getSectorDistributionList <em>Sector Distribution List</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.FondImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.FondImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.FondImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.FondImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.FondImpl#getAssetBasedFee <em>Asset Based Fee</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.FondImpl#getManagementFee <em>Management Fee</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.FondImpl#getRisk <em>Risk</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.FondImpl#getTargetDefinition <em>Target Definition</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.FondImpl#getAdvicedMinHold <em>Adviced Min Hold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FondImpl extends MinimalEObjectImpl.Container implements Fond {
	/**
	 * The cached value of the '{@link #getCurrencyDistributionList() <em>Currency Distribution List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyDistributionList()
	 * @generated
	 * @ordered
	 */
	protected EList<CurrencyDistribution> currencyDistributionList;

	/**
	 * The cached value of the '{@link #getAssetDistributionList() <em>Asset Distribution List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetDistributionList()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetDistribution> assetDistributionList;

	/**
	 * The cached value of the '{@link #getCountryDistributionList() <em>Country Distribution List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryDistributionList()
	 * @generated
	 * @ordered
	 */
	protected EList<CountryDistribution> countryDistributionList;

	/**
	 * The cached value of the '{@link #getSectorDistributionList() <em>Sector Distribution List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectorDistributionList()
	 * @generated
	 * @ordered
	 */
	protected EList<SectorDistribution> sectorDistributionList;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected Currency currency;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssetBasedFee() <em>Asset Based Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetBasedFee()
	 * @generated
	 * @ordered
	 */
	protected static final double ASSET_BASED_FEE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAssetBasedFee() <em>Asset Based Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetBasedFee()
	 * @generated
	 * @ordered
	 */
	protected double assetBasedFee = ASSET_BASED_FEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getManagementFee() <em>Management Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementFee()
	 * @generated
	 * @ordered
	 */
	protected static final double MANAGEMENT_FEE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getManagementFee() <em>Management Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementFee()
	 * @generated
	 * @ordered
	 */
	protected double managementFee = MANAGEMENT_FEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRisk() <em>Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk()
	 * @generated
	 * @ordered
	 */
	protected static final Risk RISK_EDEFAULT = Risk.R1;

	/**
	 * The cached value of the '{@link #getRisk() <em>Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk()
	 * @generated
	 * @ordered
	 */
	protected Risk risk = RISK_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetDefinition() <em>Target Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetDefinition() <em>Target Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDefinition()
	 * @generated
	 * @ordered
	 */
	protected String targetDefinition = TARGET_DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdvicedMinHold() <em>Adviced Min Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvicedMinHold()
	 * @generated
	 * @ordered
	 */
	protected static final int ADVICED_MIN_HOLD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAdvicedMinHold() <em>Adviced Min Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvicedMinHold()
	 * @generated
	 * @ordered
	 */
	protected int advicedMinHold = ADVICED_MIN_HOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FondImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyfondPackage.Literals.FOND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CurrencyDistribution> getCurrencyDistributionList() {
		if (currencyDistributionList == null) {
			currencyDistributionList = new EObjectContainmentEList<CurrencyDistribution>(CurrencyDistribution.class, this, MyfondPackage.FOND__CURRENCY_DISTRIBUTION_LIST);
		}
		return currencyDistributionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssetDistribution> getAssetDistributionList() {
		if (assetDistributionList == null) {
			assetDistributionList = new EObjectContainmentEList<AssetDistribution>(AssetDistribution.class, this, MyfondPackage.FOND__ASSET_DISTRIBUTION_LIST);
		}
		return assetDistributionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CountryDistribution> getCountryDistributionList() {
		if (countryDistributionList == null) {
			countryDistributionList = new EObjectContainmentEList<CountryDistribution>(CountryDistribution.class, this, MyfondPackage.FOND__COUNTRY_DISTRIBUTION_LIST);
		}
		return countryDistributionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SectorDistribution> getSectorDistributionList() {
		if (sectorDistributionList == null) {
			sectorDistributionList = new EObjectContainmentEList<SectorDistribution>(SectorDistribution.class, this, MyfondPackage.FOND__SECTOR_DISTRIBUTION_LIST);
		}
		return sectorDistributionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyfondPackage.FOND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyfondPackage.FOND__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency getCurrency() {
		if (currency != null && currency.eIsProxy()) {
			InternalEObject oldCurrency = (InternalEObject)currency;
			currency = (Currency)eResolveProxy(oldCurrency);
			if (currency != oldCurrency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyfondPackage.FOND__CURRENCY, oldCurrency, currency));
			}
		}
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency basicGetCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(Currency newCurrency) {
		Currency oldCurrency = currency;
		currency = newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyfondPackage.FOND__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyfondPackage.FOND__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAssetBasedFee() {
		return assetBasedFee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetBasedFee(double newAssetBasedFee) {
		double oldAssetBasedFee = assetBasedFee;
		assetBasedFee = newAssetBasedFee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyfondPackage.FOND__ASSET_BASED_FEE, oldAssetBasedFee, assetBasedFee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getManagementFee() {
		return managementFee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagementFee(double newManagementFee) {
		double oldManagementFee = managementFee;
		managementFee = newManagementFee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyfondPackage.FOND__MANAGEMENT_FEE, oldManagementFee, managementFee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Risk getRisk() {
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRisk(Risk newRisk) {
		Risk oldRisk = risk;
		risk = newRisk == null ? RISK_EDEFAULT : newRisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyfondPackage.FOND__RISK, oldRisk, risk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetDefinition() {
		return targetDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDefinition(String newTargetDefinition) {
		String oldTargetDefinition = targetDefinition;
		targetDefinition = newTargetDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyfondPackage.FOND__TARGET_DEFINITION, oldTargetDefinition, targetDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAdvicedMinHold() {
		return advicedMinHold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdvicedMinHold(int newAdvicedMinHold) {
		int oldAdvicedMinHold = advicedMinHold;
		advicedMinHold = newAdvicedMinHold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyfondPackage.FOND__ADVICED_MIN_HOLD, oldAdvicedMinHold, advicedMinHold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyfondPackage.FOND__CURRENCY_DISTRIBUTION_LIST:
				return ((InternalEList<?>)getCurrencyDistributionList()).basicRemove(otherEnd, msgs);
			case MyfondPackage.FOND__ASSET_DISTRIBUTION_LIST:
				return ((InternalEList<?>)getAssetDistributionList()).basicRemove(otherEnd, msgs);
			case MyfondPackage.FOND__COUNTRY_DISTRIBUTION_LIST:
				return ((InternalEList<?>)getCountryDistributionList()).basicRemove(otherEnd, msgs);
			case MyfondPackage.FOND__SECTOR_DISTRIBUTION_LIST:
				return ((InternalEList<?>)getSectorDistributionList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyfondPackage.FOND__CURRENCY_DISTRIBUTION_LIST:
				return getCurrencyDistributionList();
			case MyfondPackage.FOND__ASSET_DISTRIBUTION_LIST:
				return getAssetDistributionList();
			case MyfondPackage.FOND__COUNTRY_DISTRIBUTION_LIST:
				return getCountryDistributionList();
			case MyfondPackage.FOND__SECTOR_DISTRIBUTION_LIST:
				return getSectorDistributionList();
			case MyfondPackage.FOND__NAME:
				return getName();
			case MyfondPackage.FOND__ID:
				return getId();
			case MyfondPackage.FOND__CURRENCY:
				if (resolve) return getCurrency();
				return basicGetCurrency();
			case MyfondPackage.FOND__START_DATE:
				return getStartDate();
			case MyfondPackage.FOND__ASSET_BASED_FEE:
				return getAssetBasedFee();
			case MyfondPackage.FOND__MANAGEMENT_FEE:
				return getManagementFee();
			case MyfondPackage.FOND__RISK:
				return getRisk();
			case MyfondPackage.FOND__TARGET_DEFINITION:
				return getTargetDefinition();
			case MyfondPackage.FOND__ADVICED_MIN_HOLD:
				return getAdvicedMinHold();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MyfondPackage.FOND__CURRENCY_DISTRIBUTION_LIST:
				getCurrencyDistributionList().clear();
				getCurrencyDistributionList().addAll((Collection<? extends CurrencyDistribution>)newValue);
				return;
			case MyfondPackage.FOND__ASSET_DISTRIBUTION_LIST:
				getAssetDistributionList().clear();
				getAssetDistributionList().addAll((Collection<? extends AssetDistribution>)newValue);
				return;
			case MyfondPackage.FOND__COUNTRY_DISTRIBUTION_LIST:
				getCountryDistributionList().clear();
				getCountryDistributionList().addAll((Collection<? extends CountryDistribution>)newValue);
				return;
			case MyfondPackage.FOND__SECTOR_DISTRIBUTION_LIST:
				getSectorDistributionList().clear();
				getSectorDistributionList().addAll((Collection<? extends SectorDistribution>)newValue);
				return;
			case MyfondPackage.FOND__NAME:
				setName((String)newValue);
				return;
			case MyfondPackage.FOND__ID:
				setId((String)newValue);
				return;
			case MyfondPackage.FOND__CURRENCY:
				setCurrency((Currency)newValue);
				return;
			case MyfondPackage.FOND__START_DATE:
				setStartDate((Date)newValue);
				return;
			case MyfondPackage.FOND__ASSET_BASED_FEE:
				setAssetBasedFee((Double)newValue);
				return;
			case MyfondPackage.FOND__MANAGEMENT_FEE:
				setManagementFee((Double)newValue);
				return;
			case MyfondPackage.FOND__RISK:
				setRisk((Risk)newValue);
				return;
			case MyfondPackage.FOND__TARGET_DEFINITION:
				setTargetDefinition((String)newValue);
				return;
			case MyfondPackage.FOND__ADVICED_MIN_HOLD:
				setAdvicedMinHold((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MyfondPackage.FOND__CURRENCY_DISTRIBUTION_LIST:
				getCurrencyDistributionList().clear();
				return;
			case MyfondPackage.FOND__ASSET_DISTRIBUTION_LIST:
				getAssetDistributionList().clear();
				return;
			case MyfondPackage.FOND__COUNTRY_DISTRIBUTION_LIST:
				getCountryDistributionList().clear();
				return;
			case MyfondPackage.FOND__SECTOR_DISTRIBUTION_LIST:
				getSectorDistributionList().clear();
				return;
			case MyfondPackage.FOND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MyfondPackage.FOND__ID:
				setId(ID_EDEFAULT);
				return;
			case MyfondPackage.FOND__CURRENCY:
				setCurrency((Currency)null);
				return;
			case MyfondPackage.FOND__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case MyfondPackage.FOND__ASSET_BASED_FEE:
				setAssetBasedFee(ASSET_BASED_FEE_EDEFAULT);
				return;
			case MyfondPackage.FOND__MANAGEMENT_FEE:
				setManagementFee(MANAGEMENT_FEE_EDEFAULT);
				return;
			case MyfondPackage.FOND__RISK:
				setRisk(RISK_EDEFAULT);
				return;
			case MyfondPackage.FOND__TARGET_DEFINITION:
				setTargetDefinition(TARGET_DEFINITION_EDEFAULT);
				return;
			case MyfondPackage.FOND__ADVICED_MIN_HOLD:
				setAdvicedMinHold(ADVICED_MIN_HOLD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MyfondPackage.FOND__CURRENCY_DISTRIBUTION_LIST:
				return currencyDistributionList != null && !currencyDistributionList.isEmpty();
			case MyfondPackage.FOND__ASSET_DISTRIBUTION_LIST:
				return assetDistributionList != null && !assetDistributionList.isEmpty();
			case MyfondPackage.FOND__COUNTRY_DISTRIBUTION_LIST:
				return countryDistributionList != null && !countryDistributionList.isEmpty();
			case MyfondPackage.FOND__SECTOR_DISTRIBUTION_LIST:
				return sectorDistributionList != null && !sectorDistributionList.isEmpty();
			case MyfondPackage.FOND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MyfondPackage.FOND__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MyfondPackage.FOND__CURRENCY:
				return currency != null;
			case MyfondPackage.FOND__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case MyfondPackage.FOND__ASSET_BASED_FEE:
				return assetBasedFee != ASSET_BASED_FEE_EDEFAULT;
			case MyfondPackage.FOND__MANAGEMENT_FEE:
				return managementFee != MANAGEMENT_FEE_EDEFAULT;
			case MyfondPackage.FOND__RISK:
				return risk != RISK_EDEFAULT;
			case MyfondPackage.FOND__TARGET_DEFINITION:
				return TARGET_DEFINITION_EDEFAULT == null ? targetDefinition != null : !TARGET_DEFINITION_EDEFAULT.equals(targetDefinition);
			case MyfondPackage.FOND__ADVICED_MIN_HOLD:
				return advicedMinHold != ADVICED_MIN_HOLD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", assetBasedFee: ");
		result.append(assetBasedFee);
		result.append(", managementFee: ");
		result.append(managementFee);
		result.append(", risk: ");
		result.append(risk);
		result.append(", targetDefinition: ");
		result.append(targetDefinition);
		result.append(", advicedMinHold: ");
		result.append(advicedMinHold);
		result.append(')');
		return result.toString();
	}

} //FondImpl
