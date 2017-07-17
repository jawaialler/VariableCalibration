/**
 */
package ca.mcgill.sure.variablecalibration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.sure.variablecalibration.Value#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.sure.variablecalibration.Hillslope1DPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see ca.mcgill.sure.variablecalibration.Hillslope1DPackage#getValue_Value()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getValue();

} // Value
