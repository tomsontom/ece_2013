/**
 */
package at.bestsolution.myfond.model.myfond.tests;

import at.bestsolution.myfond.model.myfond.AssetDistribution;
import at.bestsolution.myfond.model.myfond.MyfondFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asset Distribution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssetDistributionTest extends TestCase {

	/**
	 * The fixture for this Asset Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetDistribution fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssetDistributionTest.class);
	}

	/**
	 * Constructs a new Asset Distribution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetDistributionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Asset Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AssetDistribution fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Asset Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetDistribution getFixture() {
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
		setFixture(MyfondFactory.eINSTANCE.createAssetDistribution());
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

} //AssetDistributionTest
