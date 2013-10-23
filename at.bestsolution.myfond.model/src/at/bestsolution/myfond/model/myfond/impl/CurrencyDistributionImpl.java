/**
 */
package at.bestsolution.myfond.model.myfond.impl;

import at.bestsolution.myfond.model.myfond.Currency;
import at.bestsolution.myfond.model.myfond.CurrencyDistribution;
import at.bestsolution.myfond.model.myfond.MyfondPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Currency Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.CurrencyDistributionImpl#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link at.bestsolution.myfond.model.myfond.impl.CurrencyDistributionImpl#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurrencyDistributionImpl extends MinimalEObjectImpl.Container implements CurrencyDistribution {
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
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected Currency currency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrencyDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyfondPackage.Literals.CURRENCY_DISTRIBUTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyfondPackage.CURRENCY_DISTRIBUTION__PERCENTAGE, oldPercentage, percentage));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyfondPackage.CURRENCY_DISTRIBUTION__CURRENCY, oldCurrency, currency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyfondPackage.CURRENCY_DISTRIBUTION__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyfondPackage.CURRENCY_DISTRIBUTION__PERCENTAGE:
				return getPercentage();
			case MyfondPackage.CURRENCY_DISTRIBUTION__CURRENCY:
				if (resolve) return getCurrency();
				return basicGetCurrency();
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
			case MyfondPackage.CURRENCY_DISTRIBUTION__PERCENTAGE:
				setPercentage((Double)newValue);
				return;
			case MyfondPackage.CURRENCY_DISTRIBUTION__CURRENCY:
				setCurrency((Currency)newValue);
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
			case MyfondPackage.CURRENCY_DISTRIBUTION__PERCENTAGE:
				setPercentage(PERCENTAGE_EDEFAULT);
				return;
			case MyfondPackage.CURRENCY_DISTRIBUTION__CURRENCY:
				setCurrency((Currency)null);
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
			case MyfondPackage.CURRENCY_DISTRIBUTION__PERCENTAGE:
				return percentage != PERCENTAGE_EDEFAULT;
			case MyfondPackage.CURRENCY_DISTRIBUTION__CURRENCY:
				return currency != null;
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

} //CurrencyDistributionImpl
