/**
 */
package at.bestsolution.myfond.model.myfond.util;

import at.bestsolution.myfond.model.myfond.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.myfond.model.myfond.MyfondPackage
 * @generated
 */
public class MyfondAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MyfondPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyfondAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MyfondPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyfondSwitch<Adapter> modelSwitch =
		new MyfondSwitch<Adapter>() {
			@Override
			public Adapter caseMyFond(MyFond object) {
				return createMyFondAdapter();
			}
			@Override
			public Adapter caseFond(Fond object) {
				return createFondAdapter();
			}
			@Override
			public Adapter caseCurrencyDistribution(CurrencyDistribution object) {
				return createCurrencyDistributionAdapter();
			}
			@Override
			public Adapter caseCurrency(Currency object) {
				return createCurrencyAdapter();
			}
			@Override
			public Adapter caseAssetDistribution(AssetDistribution object) {
				return createAssetDistributionAdapter();
			}
			@Override
			public Adapter caseAsset(Asset object) {
				return createAssetAdapter();
			}
			@Override
			public Adapter caseCountryDistribution(CountryDistribution object) {
				return createCountryDistributionAdapter();
			}
			@Override
			public Adapter caseCountry(Country object) {
				return createCountryAdapter();
			}
			@Override
			public Adapter caseSectorDistribution(SectorDistribution object) {
				return createSectorDistributionAdapter();
			}
			@Override
			public Adapter caseSector(Sector object) {
				return createSectorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.myfond.model.myfond.MyFond <em>My Fond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.myfond.model.myfond.MyFond
	 * @generated
	 */
	public Adapter createMyFondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.myfond.model.myfond.Fond <em>Fond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.myfond.model.myfond.Fond
	 * @generated
	 */
	public Adapter createFondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.myfond.model.myfond.CurrencyDistribution <em>Currency Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.myfond.model.myfond.CurrencyDistribution
	 * @generated
	 */
	public Adapter createCurrencyDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.myfond.model.myfond.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.myfond.model.myfond.Currency
	 * @generated
	 */
	public Adapter createCurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.myfond.model.myfond.AssetDistribution <em>Asset Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.myfond.model.myfond.AssetDistribution
	 * @generated
	 */
	public Adapter createAssetDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.myfond.model.myfond.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.myfond.model.myfond.Asset
	 * @generated
	 */
	public Adapter createAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.myfond.model.myfond.CountryDistribution <em>Country Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.myfond.model.myfond.CountryDistribution
	 * @generated
	 */
	public Adapter createCountryDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.myfond.model.myfond.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.myfond.model.myfond.Country
	 * @generated
	 */
	public Adapter createCountryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.myfond.model.myfond.SectorDistribution <em>Sector Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.myfond.model.myfond.SectorDistribution
	 * @generated
	 */
	public Adapter createSectorDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.myfond.model.myfond.Sector <em>Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.myfond.model.myfond.Sector
	 * @generated
	 */
	public Adapter createSectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MyfondAdapterFactory
