/**
 */
package ca.mcgill.sure.variablecalibration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hillslope Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.sure.variablecalibration.HillslopeModel#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link ca.mcgill.sure.variablecalibration.HillslopeModel#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.sure.variablecalibration.Hillslope1DPackage#getHillslopeModel()
 * @model
 * @generated
 */
public interface HillslopeModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.sure.variablecalibration.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see ca.mcgill.sure.variablecalibration.Hillslope1DPackage#getHillslopeModel_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Configuration> getConfigurations();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.sure.variablecalibration.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see ca.mcgill.sure.variablecalibration.Hillslope1DPackage#getHillslopeModel_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategories();

} // HillslopeModel
