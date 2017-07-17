/**
 */
package ca.mcgill.sure.variablecalibration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.sure.variablecalibration.Input#getPossibleValues <em>Possible Values</em>}</li>
 *   <li>{@link ca.mcgill.sure.variablecalibration.Input#getOutput <em>Output</em>}</li>
 *   <li>{@link ca.mcgill.sure.variablecalibration.Input#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.sure.variablecalibration.Input#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.mcgill.sure.variablecalibration.Input#isToCalibrate <em>To Calibrate</em>}</li>
 *   <li>{@link ca.mcgill.sure.variablecalibration.Input#isAdjustable <em>Adjustable</em>}</li>
 *   <li>{@link ca.mcgill.sure.variablecalibration.Input#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.sure.variablecalibration.Hillslope1DPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Possible Values</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.sure.variablecalibration.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possible Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Values</em>' containment reference list.
	 * @see ca.mcgill.sure.variablecalibration.Hillslope1DPackage#getInput_PossibleValues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Value> getPossibleValues();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.sure.variablecalibration.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see ca.mcgill.sure.variablecalibration.Hillslope1DPackage#getInput_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutput();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.mcgill.sure.variablecalibration.Hillslope1DPackage#getInput_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.mcgill.sure.variablecalibration.Input#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ca.mcgill.sure.variablecalibration.Hillslope1DPackage#getInput_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ca.mcgill.sure.variablecalibration.Input#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>To Calibrate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Calibrate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Calibrate</em>' attribute.
	 * @see #setToCalibrate(boolean)
	 * @see ca.mcgill.sure.variablecalibration.Hillslope1DPackage#getInput_ToCalibrate()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isToCalibrate();

	/**
	 * Sets the value of the '{@link ca.mcgill.sure.variablecalibration.Input#isToCalibrate <em>To Calibrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Calibrate</em>' attribute.
	 * @see #isToCalibrate()
	 * @generated
	 */
	void setToCalibrate(boolean value);

	/**
	 * Returns the value of the '<em><b>Adjustable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjustable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjustable</em>' attribute.
	 * @see #setAdjustable(boolean)
	 * @see ca.mcgill.sure.variablecalibration.Hillslope1DPackage#getInput_Adjustable()
	 * @model default="false"
	 * @generated
	 */
	boolean isAdjustable();

	/**
	 * Sets the value of the '{@link ca.mcgill.sure.variablecalibration.Input#isAdjustable <em>Adjustable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjustable</em>' attribute.
	 * @see #isAdjustable()
	 * @generated
	 */
	void setAdjustable(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"String"</code>.
	 * The literals are from the enumeration {@link ca.mcgill.sure.variablecalibration.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ca.mcgill.sure.variablecalibration.Type
	 * @see #setType(Type)
	 * @see ca.mcgill.sure.variablecalibration.Hillslope1DPackage#getInput_Type()
	 * @model default="String"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link ca.mcgill.sure.variablecalibration.Input#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ca.mcgill.sure.variablecalibration.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Input
