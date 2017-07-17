/**
 */
package ca.mcgill.sure.variablecalibration.tests;

import ca.mcgill.sure.variablecalibration.Hillslope1DFactory;
import ca.mcgill.sure.variablecalibration.HillslopeModel;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hillslope Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HillslopeModelTest extends TestCase {

	/**
	 * The fixture for this Hillslope Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HillslopeModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HillslopeModelTest.class);
	}

	/**
	 * Constructs a new Hillslope Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HillslopeModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Hillslope Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(HillslopeModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Hillslope Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HillslopeModel getFixture() {
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
		setFixture(Hillslope1DFactory.eINSTANCE.createHillslopeModel());
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

} //HillslopeModelTest
