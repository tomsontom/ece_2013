/**
 */
package at.bestsolution.myfond.model.myfond.tests;

import at.bestsolution.myfond.model.myfond.MyfondFactory;
import at.bestsolution.myfond.model.myfond.Sector;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SectorTest extends TestCase {

	/**
	 * The fixture for this Sector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sector fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SectorTest.class);
	}

	/**
	 * Constructs a new Sector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Sector fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sector getFixture() {
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
		setFixture(MyfondFactory.eINSTANCE.createSector());
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

} //SectorTest
