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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

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
public class MyFondImpl extends CDOObjectImpl implements MyFond {
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
	public EList<Currency> getCurrencyList() {
		return (EList<Currency>)eGet(MyfondPackage.Literals.MY_FOND__CURRENCY_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Fond> getFondList() {
		return (EList<Fond>)eGet(MyfondPackage.Literals.MY_FOND__FOND_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Asset> getAssetList() {
		return (EList<Asset>)eGet(MyfondPackage.Literals.MY_FOND__ASSET_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Country> getCountryList() {
		return (EList<Country>)eGet(MyfondPackage.Literals.MY_FOND__COUNTRY_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Sector> getSectorList() {
		return (EList<Sector>)eGet(MyfondPackage.Literals.MY_FOND__SECTOR_LIST, true);
	}

} //MyFondImpl
