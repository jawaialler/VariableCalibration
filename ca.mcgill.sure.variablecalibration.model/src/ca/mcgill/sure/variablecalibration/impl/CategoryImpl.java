/**
 */
package ca.mcgill.sure.variablecalibration.impl;

import ca.mcgill.sure.variablecalibration.Category;
import ca.mcgill.sure.variablecalibration.Hillslope1DPackage;
import ca.mcgill.sure.variablecalibration.Input;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.sure.variablecalibration.impl.CategoryImpl#getSubcategories <em>Subcategories</em>}</li>
 *   <li>{@link ca.mcgill.sure.variablecalibration.impl.CategoryImpl#getInput <em>Input</em>}</li>
 *   <li>{@link ca.mcgill.sure.variablecalibration.impl.CategoryImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryImpl extends MinimalEObjectImpl.Container implements Category {
	/**
	 * The cached value of the '{@link #getSubcategories() <em>Subcategories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> subcategories;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> input;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hillslope1DPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getSubcategories() {
		if (subcategories == null) {
			subcategories = new EObjectResolvingEList<Category>(Category.class, this, Hillslope1DPackage.CATEGORY__SUBCATEGORIES);
		}
		return subcategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Input>(Input.class, this, Hillslope1DPackage.CATEGORY__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hillslope1DPackage.CATEGORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hillslope1DPackage.CATEGORY__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hillslope1DPackage.CATEGORY__SUBCATEGORIES:
				return getSubcategories();
			case Hillslope1DPackage.CATEGORY__INPUT:
				return getInput();
			case Hillslope1DPackage.CATEGORY__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Hillslope1DPackage.CATEGORY__SUBCATEGORIES:
				getSubcategories().clear();
				getSubcategories().addAll((Collection<? extends Category>)newValue);
				return;
			case Hillslope1DPackage.CATEGORY__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Input>)newValue);
				return;
			case Hillslope1DPackage.CATEGORY__NAME:
				setName((String)newValue);
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
			case Hillslope1DPackage.CATEGORY__SUBCATEGORIES:
				getSubcategories().clear();
				return;
			case Hillslope1DPackage.CATEGORY__INPUT:
				getInput().clear();
				return;
			case Hillslope1DPackage.CATEGORY__NAME:
				setName(NAME_EDEFAULT);
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
			case Hillslope1DPackage.CATEGORY__SUBCATEGORIES:
				return subcategories != null && !subcategories.isEmpty();
			case Hillslope1DPackage.CATEGORY__INPUT:
				return input != null && !input.isEmpty();
			case Hillslope1DPackage.CATEGORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CategoryImpl
