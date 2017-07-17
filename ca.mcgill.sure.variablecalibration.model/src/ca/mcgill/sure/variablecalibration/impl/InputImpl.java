/**
 */
package ca.mcgill.sure.variablecalibration.impl;

import ca.mcgill.sure.variablecalibration.Hillslope1DPackage;
import ca.mcgill.sure.variablecalibration.Input;
import ca.mcgill.sure.variablecalibration.Output;
import ca.mcgill.sure.variablecalibration.Type;
import ca.mcgill.sure.variablecalibration.Value;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.sure.variablecalibration.impl.InputImpl#getPossibleValues <em>Possible Values</em>}</li>
 *   <li>{@link ca.mcgill.sure.variablecalibration.impl.InputImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link ca.mcgill.sure.variablecalibration.impl.InputImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.sure.variablecalibration.impl.InputImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.mcgill.sure.variablecalibration.impl.InputImpl#isToCalibrate <em>To Calibrate</em>}</li>
 *   <li>{@link ca.mcgill.sure.variablecalibration.impl.InputImpl#isAdjustable <em>Adjustable</em>}</li>
 *   <li>{@link ca.mcgill.sure.variablecalibration.impl.InputImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends MinimalEObjectImpl.Container implements Input {
	/**
	 * The cached value of the '{@link #getPossibleValues() <em>Possible Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> possibleValues;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> output;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isToCalibrate() <em>To Calibrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToCalibrate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TO_CALIBRATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isToCalibrate() <em>To Calibrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToCalibrate()
	 * @generated
	 * @ordered
	 */
	protected boolean toCalibrate = TO_CALIBRATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAdjustable() <em>Adjustable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdjustable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADJUSTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdjustable() <em>Adjustable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdjustable()
	 * @generated
	 * @ordered
	 */
	protected boolean adjustable = ADJUSTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hillslope1DPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getPossibleValues() {
		if (possibleValues == null) {
			possibleValues = new EObjectContainmentEList<Value>(Value.class, this, Hillslope1DPackage.INPUT__POSSIBLE_VALUES);
		}
		return possibleValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<Output>(Output.class, this, Hillslope1DPackage.INPUT__OUTPUT);
		}
		return output;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hillslope1DPackage.INPUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hillslope1DPackage.INPUT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isToCalibrate() {
		return toCalibrate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToCalibrate(boolean newToCalibrate) {
		boolean oldToCalibrate = toCalibrate;
		toCalibrate = newToCalibrate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hillslope1DPackage.INPUT__TO_CALIBRATE, oldToCalibrate, toCalibrate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAdjustable() {
		return adjustable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdjustable(boolean newAdjustable) {
		boolean oldAdjustable = adjustable;
		adjustable = newAdjustable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hillslope1DPackage.INPUT__ADJUSTABLE, oldAdjustable, adjustable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hillslope1DPackage.INPUT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hillslope1DPackage.INPUT__POSSIBLE_VALUES:
				return ((InternalEList<?>)getPossibleValues()).basicRemove(otherEnd, msgs);
			case Hillslope1DPackage.INPUT__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
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
			case Hillslope1DPackage.INPUT__POSSIBLE_VALUES:
				return getPossibleValues();
			case Hillslope1DPackage.INPUT__OUTPUT:
				return getOutput();
			case Hillslope1DPackage.INPUT__NAME:
				return getName();
			case Hillslope1DPackage.INPUT__DESCRIPTION:
				return getDescription();
			case Hillslope1DPackage.INPUT__TO_CALIBRATE:
				return isToCalibrate();
			case Hillslope1DPackage.INPUT__ADJUSTABLE:
				return isAdjustable();
			case Hillslope1DPackage.INPUT__TYPE:
				return getType();
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
			case Hillslope1DPackage.INPUT__POSSIBLE_VALUES:
				getPossibleValues().clear();
				getPossibleValues().addAll((Collection<? extends Value>)newValue);
				return;
			case Hillslope1DPackage.INPUT__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Output>)newValue);
				return;
			case Hillslope1DPackage.INPUT__NAME:
				setName((String)newValue);
				return;
			case Hillslope1DPackage.INPUT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Hillslope1DPackage.INPUT__TO_CALIBRATE:
				setToCalibrate((Boolean)newValue);
				return;
			case Hillslope1DPackage.INPUT__ADJUSTABLE:
				setAdjustable((Boolean)newValue);
				return;
			case Hillslope1DPackage.INPUT__TYPE:
				setType((Type)newValue);
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
			case Hillslope1DPackage.INPUT__POSSIBLE_VALUES:
				getPossibleValues().clear();
				return;
			case Hillslope1DPackage.INPUT__OUTPUT:
				getOutput().clear();
				return;
			case Hillslope1DPackage.INPUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Hillslope1DPackage.INPUT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Hillslope1DPackage.INPUT__TO_CALIBRATE:
				setToCalibrate(TO_CALIBRATE_EDEFAULT);
				return;
			case Hillslope1DPackage.INPUT__ADJUSTABLE:
				setAdjustable(ADJUSTABLE_EDEFAULT);
				return;
			case Hillslope1DPackage.INPUT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case Hillslope1DPackage.INPUT__POSSIBLE_VALUES:
				return possibleValues != null && !possibleValues.isEmpty();
			case Hillslope1DPackage.INPUT__OUTPUT:
				return output != null && !output.isEmpty();
			case Hillslope1DPackage.INPUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Hillslope1DPackage.INPUT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Hillslope1DPackage.INPUT__TO_CALIBRATE:
				return toCalibrate != TO_CALIBRATE_EDEFAULT;
			case Hillslope1DPackage.INPUT__ADJUSTABLE:
				return adjustable != ADJUSTABLE_EDEFAULT;
			case Hillslope1DPackage.INPUT__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(", description: ");
		result.append(description);
		result.append(", toCalibrate: ");
		result.append(toCalibrate);
		result.append(", adjustable: ");
		result.append(adjustable);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //InputImpl
