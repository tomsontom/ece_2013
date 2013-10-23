/**
 */
package at.bestsolution.myfond.model.myfond.impl;

import at.bestsolution.myfond.model.myfond.Asset;
import at.bestsolution.myfond.model.myfond.AssetDistribution;
import at.bestsolution.myfond.model.myfond.MyfondPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.AssetDistributionImpl#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.AssetDistributionImpl#getAsset <em>Asset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssetDistributionImpl extends MinimalEObjectImpl.Container implements AssetDistribution {
	/**
	 * The default value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected double percentage = PERCENTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset asset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyfondPackage.Literals.ASSET_DISTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPercentage() {
		return percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentage(double newPercentage) {
		double oldPercentage = percentage;
		percentage = newPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyfondPackage.ASSET_DISTRIBUTION__PERCENTAGE, oldPercentage, percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset getAsset() {
		if (asset != null && asset.eIsProxy()) {
			InternalEObject oldAsset = (InternalEObject)asset;
			asset = (Asset)eResolveProxy(oldAsset);
			if (asset != oldAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyfondPackage.ASSET_DISTRIBUTION__ASSET, oldAsset, asset));
			}
		}
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetAsset() {
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsset(Asset newAsset) {
		Asset oldAsset = asset;
		asset = newAsset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyfondPackage.ASSET_DISTRIBUTION__ASSET, oldAsset, asset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyfondPackage.ASSET_DISTRIBUTION__PERCENTAGE:
				return getPercentage();
			case MyfondPackage.ASSET_DISTRIBUTION__ASSET:
				if (resolve) return getAsset();
				return basicGetAsset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MyfondPackage.ASSET_DISTRIBUTION__PERCENTAGE:
				setPercentage((Double)newValue);
				return;
			case MyfondPackage.ASSET_DISTRIBUTION__ASSET:
				setAsset((Asset)newValue);
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
			case MyfondPackage.ASSET_DISTRIBUTION__PERCENTAGE:
				setPercentage(PERCENTAGE_EDEFAULT);
				return;
			case MyfondPackage.ASSET_DISTRIBUTION__ASSET:
				setAsset((Asset)null);
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
			case MyfondPackage.ASSET_DISTRIBUTION__PERCENTAGE:
				return percentage != PERCENTAGE_EDEFAULT;
			case MyfondPackage.ASSET_DISTRIBUTION__ASSET:
				return asset != null;
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
		result.append(" (percentage: ");
		result.append(percentage);
		result.append(')');
		return result.toString();
	}

} //AssetDistributionImpl
