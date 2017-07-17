/**
 */
package ca.mcgill.sure.variablecalibration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.sure.variablecalibration.Category#getSubcategories <em>Subcategories</em>}</li>
 *   <li>{@link ca.mcgill.sure.variablecalibration.Category#getInput <em>Input</em>}</li>
 *   <li>{@link ca.mcgill.sure.variablecalibration.Category#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.sure.variablecalibration.Hillslope1DPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Subcategories</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.sure.variablecalibration.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcategories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcategories</em>' reference list.
	 * @see ca.mcgill.sure.variablecalibration.Hillslope1DPackage#getCategory_Subcategories()
	 * @model
	 * @generated
	 */
	EList<Category> getSubcategories();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.sure.variablecalibration.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see ca.mcgill.sure.variablecalibration.Hillslope1DPackage#getCategory_Input()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Input> getInput();

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
	 * @see ca.mcgill.sure.variablecalibration.Hillslope1DPackage#getCategory_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.mcgill.sure.variablecalibration.Category#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Category
