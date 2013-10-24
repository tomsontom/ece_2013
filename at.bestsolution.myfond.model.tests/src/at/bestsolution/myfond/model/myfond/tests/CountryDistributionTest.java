/**
 */
package at.bestsolution.myfond.model.myfond.tests;

import at.bestsolution.myfond.model.myfond.CountryDistribution;
import at.bestsolution.myfond.model.myfond.MyfondFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Country Distribution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CountryDistributionTest extends TestCase {

	/**
	 * The fixture for this Country Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryDistribution fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CountryDistributionTest.class);
	}

	/**
	 * Constructs a new Country Distribution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountryDistributionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Country Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CountryDistribution fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Country Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryDistribution getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MyfondFactory.eINSTANCE.createCountryDistribution());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CountryDistributionTest
