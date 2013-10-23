/**
 */
package at.bestsolution.myfond.model.myfond.impl;

import at.bestsolution.myfond.model.myfond.MyfondPackage;
import at.bestsolution.myfond.model.myfond.Sector;
import at.bestsolution.myfond.model.myfond.SectorDistribution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sector Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.SectorDistributionImpl#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.SectorDistributionImpl#getSector <em>Sector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectorDistributionImpl extends MinimalEObjectImpl.Container implements SectorDistribution {
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
	 * The cached value of the '{@link #getSector() <em>Sector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSector()
	 * @generated
	 * @ordered
	 */
	protected Sector sector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectorDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyfondPackage.Literals.SECTOR_DISTRIBUTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyfondPackage.SECTOR_DISTRIBUTION__PERCENTAGE, oldPercentage, percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sector getSector() {
		if (sector != null && sector.eIsProxy()) {
			InternalEObject oldSector = (InternalEObject)sector;
			sector = (Sector)eResolveProxy(oldSector);
			if (sector != oldSector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyfondPackage.SECTOR_DISTRIBUTION__SECTOR, oldSector, sector));
			}
		}
		return sector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sector basicGetSector() {
		return sector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSector(Sector newSector) {
		Sector oldSector = sector;
		sector = newSector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyfondPackage.SECTOR_DISTRIBUTION__SECTOR, oldSector, sector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyfondPackage.SECTOR_DISTRIBUTION__PERCENTAGE:
				return getPercentage();
			case MyfondPackage.SECTOR_DISTRIBUTION__SECTOR:
				if (resolve) return getSector();
				return basicGetSector();
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
			case MyfondPackage.SECTOR_DISTRIBUTION__PERCENTAGE:
				setPercentage((Double)newValue);
				return;
			case MyfondPackage.SECTOR_DISTRIBUTION__SECTOR:
				setSector((Sector)newValue);
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
			case MyfondPackage.SECTOR_DISTRIBUTION__PERCENTAGE:
				setPercentage(PERCENTAGE_EDEFAULT);
				return;
			case MyfondPackage.SECTOR_DISTRIBUTION__SECTOR:
				setSector((Sector)null);
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
			case MyfondPackage.SECTOR_DISTRIBUTION__PERCENTAGE:
				return percentage != PERCENTAGE_EDEFAULT;
			case MyfondPackage.SECTOR_DISTRIBUTION__SECTOR:
				return sector != null;
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

} //SectorDistributionImpl
