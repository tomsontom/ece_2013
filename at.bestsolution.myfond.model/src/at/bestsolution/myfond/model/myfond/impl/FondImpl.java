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
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

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
public class FondImpl extends CDOObjectImpl implements Fond {
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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CurrencyDistribution> getCurrencyDistributionList() {
		return (EList<CurrencyDistribution>)eGet(MyfondPackage.Literals.FOND__CURRENCY_DISTRIBUTION_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AssetDistribution> getAssetDistributionList() {
		return (EList<AssetDistribution>)eGet(MyfondPackage.Literals.FOND__ASSET_DISTRIBUTION_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CountryDistribution> getCountryDistributionList() {
		return (EList<CountryDistribution>)eGet(MyfondPackage.Literals.FOND__COUNTRY_DISTRIBUTION_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SectorDistribution> getSectorDistributionList() {
		return (EList<SectorDistribution>)eGet(MyfondPackage.Literals.FOND__SECTOR_DISTRIBUTION_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(MyfondPackage.Literals.FOND__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(MyfondPackage.Literals.FOND__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(MyfondPackage.Literals.FOND__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(MyfondPackage.Literals.FOND__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency getCurrency() {
		return (Currency)eGet(MyfondPackage.Literals.FOND__CURRENCY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(Currency newCurrency) {
		eSet(MyfondPackage.Literals.FOND__CURRENCY, newCurrency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return (Date)eGet(MyfondPackage.Literals.FOND__START_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		eSet(MyfondPackage.Literals.FOND__START_DATE, newStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAssetBasedFee() {
		return (Double)eGet(MyfondPackage.Literals.FOND__ASSET_BASED_FEE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetBasedFee(double newAssetBasedFee) {
		eSet(MyfondPackage.Literals.FOND__ASSET_BASED_FEE, newAssetBasedFee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getManagementFee() {
		return (Double)eGet(MyfondPackage.Literals.FOND__MANAGEMENT_FEE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagementFee(double newManagementFee) {
		eSet(MyfondPackage.Literals.FOND__MANAGEMENT_FEE, newManagementFee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Risk getRisk() {
		return (Risk)eGet(MyfondPackage.Literals.FOND__RISK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRisk(Risk newRisk) {
		eSet(MyfondPackage.Literals.FOND__RISK, newRisk);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetDefinition() {
		return (String)eGet(MyfondPackage.Literals.FOND__TARGET_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDefinition(String newTargetDefinition) {
		eSet(MyfondPackage.Literals.FOND__TARGET_DEFINITION, newTargetDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAdvicedMinHold() {
		return (Integer)eGet(MyfondPackage.Literals.FOND__ADVICED_MIN_HOLD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdvicedMinHold(int newAdvicedMinHold) {
		eSet(MyfondPackage.Literals.FOND__ADVICED_MIN_HOLD, newAdvicedMinHold);
	}

} //FondImpl
