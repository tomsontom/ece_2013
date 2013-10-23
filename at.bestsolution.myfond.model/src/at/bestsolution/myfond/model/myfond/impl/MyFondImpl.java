/**
 */
package at.bestsolution.myfond.model.myfond.impl;

import at.bestsolution.myfond.model.myfond.Asset;
import at.bestsolution.myfond.model.myfond.Country;
import at.bestsolution.myfond.model.myfond.Currency;
import at.bestsolution.myfond.model.myfond.Fond;
import at.bestsolution.myfond.model.myfond.MyFond;
import at.bestsolution.myfond.model.myfond.MyfondPackage;
import at.bestsolution.myfond.model.myfond.Sector;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Fond</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.MyFondImpl#getCurrencyList <em>Currency List</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.MyFondImpl#getFondList <em>Fond List</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.MyFondImpl#getAssetList <em>Asset List</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.MyFondImpl#getCountryList <em>Country List</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.MyFondImpl#getSectorList <em>Sector List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MyFondImpl extends MinimalEObjectImpl.Container implements MyFond {
	/**
	 * The cached value of the '{@link #getCurrencyList() <em>Currency List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyList()
	 * @generated
	 * @ordered
	 */
	protected EList<Currency> currencyList;

	/**
	 * The cached value of the '{@link #getFondList() <em>Fond List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFondList()
	 * @generated
	 * @ordered
	 */
	protected EList<Fond> fondList;

	/**
	 * The cached value of the '{@link #getAssetList() <em>Asset List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetList()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assetList;

	/**
	 * The cached value of the '{@link #getCountryList() <em>Country List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryList()
	 * @generated
	 * @ordered
	 */
	protected EList<Country> countryList;

	/**
	 * The cached value of the '{@link #getSectorList() <em>Sector List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectorList()
	 * @generated
	 * @ordered
	 */
	protected EList<Sector> sectorList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyFondImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyfondPackage.Literals.MY_FOND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Currency> getCurrencyList() {
		if (currencyList == null) {
			currencyList = new EObjectContainmentEList<Currency>(Currency.class, this, MyfondPackage.MY_FOND__CURRENCY_LIST);
		}
		return currencyList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fond> getFondList() {
		if (fondList == null) {
			fondList = new EObjectContainmentEList<Fond>(Fond.class, this, MyfondPackage.MY_FOND__FOND_LIST);
		}
		return fondList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getAssetList() {
		if (assetList == null) {
			assetList = new EObjectContainmentEList<Asset>(Asset.class, this, MyfondPackage.MY_FOND__ASSET_LIST);
		}
		return assetList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Country> getCountryList() {
		if (countryList == null) {
			countryList = new EObjectContainmentEList<Country>(Country.class, this, MyfondPackage.MY_FOND__COUNTRY_LIST);
		}
		return countryList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sector> getSectorList() {
		if (sectorList == null) {
			sectorList = new EObjectContainmentEList<Sector>(Sector.class, this, MyfondPackage.MY_FOND__SECTOR_LIST);
		}
		return sectorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyfondPackage.MY_FOND__CURRENCY_LIST:
				return ((InternalEList<?>)getCurrencyList()).basicRemove(otherEnd, msgs);
			case MyfondPackage.MY_FOND__FOND_LIST:
				return ((InternalEList<?>)getFondList()).basicRemove(otherEnd, msgs);
			case MyfondPackage.MY_FOND__ASSET_LIST:
				return ((InternalEList<?>)getAssetList()).basicRemove(otherEnd, msgs);
			case MyfondPackage.MY_FOND__COUNTRY_LIST:
				return ((InternalEList<?>)getCountryList()).basicRemove(otherEnd, msgs);
			case MyfondPackage.MY_FOND__SECTOR_LIST:
				return ((InternalEList<?>)getSectorList()).basicRemove(otherEnd, msgs);
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
			case MyfondPackage.MY_FOND__CURRENCY_LIST:
				return getCurrencyList();
			case MyfondPackage.MY_FOND__FOND_LIST:
				return getFondList();
			case MyfondPackage.MY_FOND__ASSET_LIST:
				return getAssetList();
			case MyfondPackage.MY_FOND__COUNTRY_LIST:
				return getCountryList();
			case MyfondPackage.MY_FOND__SECTOR_LIST:
				return getSectorList();
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
			case MyfondPackage.MY_FOND__CURRENCY_LIST:
				getCurrencyList().clear();
				getCurrencyList().addAll((Collection<? extends Currency>)newValue);
				return;
			case MyfondPackage.MY_FOND__FOND_LIST:
				getFondList().clear();
				getFondList().addAll((Collection<? extends Fond>)newValue);
				return;
			case MyfondPackage.MY_FOND__ASSET_LIST:
				getAssetList().clear();
				getAssetList().addAll((Collection<? extends Asset>)newValue);
				return;
			case MyfondPackage.MY_FOND__COUNTRY_LIST:
				getCountryList().clear();
				getCountryList().addAll((Collection<? extends Country>)newValue);
				return;
			case MyfondPackage.MY_FOND__SECTOR_LIST:
				getSectorList().clear();
				getSectorList().addAll((Collection<? extends Sector>)newValue);
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
			case MyfondPackage.MY_FOND__CURRENCY_LIST:
				getCurrencyList().clear();
				return;
			case MyfondPackage.MY_FOND__FOND_LIST:
				getFondList().clear();
				return;
			case MyfondPackage.MY_FOND__ASSET_LIST:
				getAssetList().clear();
				return;
			case MyfondPackage.MY_FOND__COUNTRY_LIST:
				getCountryList().clear();
				return;
			case MyfondPackage.MY_FOND__SECTOR_LIST:
				getSectorList().clear();
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
			case MyfondPackage.MY_FOND__CURRENCY_LIST:
				return currencyList != null && !currencyList.isEmpty();
			case MyfondPackage.MY_FOND__FOND_LIST:
				return fondList != null && !fondList.isEmpty();
			case MyfondPackage.MY_FOND__ASSET_LIST:
				return assetList != null && !assetList.isEmpty();
			case MyfondPackage.MY_FOND__COUNTRY_LIST:
				return countryList != null && !countryList.isEmpty();
			case MyfondPackage.MY_FOND__SECTOR_LIST:
				return sectorList != null && !sectorList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MyFondImpl
