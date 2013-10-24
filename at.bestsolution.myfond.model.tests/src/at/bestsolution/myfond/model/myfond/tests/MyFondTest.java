/**
 */
package at.bestsolution.myfond.model.myfond.tests;

import at.bestsolution.myfond.model.myfond.MyFond;
import at.bestsolution.myfond.model.myfond.MyfondFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>My Fond</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyFondTest extends TestCase {

	/**
	 * The fixture for this My Fond test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyFond fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MyFondTest.class);
	}

	/**
	 * Constructs a new My Fond test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyFondTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this My Fond test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MyFond fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this My Fond test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyFond getFixture() {
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
		setFixture(MyfondFactory.eINSTANCE.createMyFond());
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

} //MyFondTest
