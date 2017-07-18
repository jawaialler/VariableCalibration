/**
 * Generated from platform:/resource/ca.mcgill.sure.variablecalibration.patterns/src/ca/mcgill/sure/variablecalibration/patterns/patterns.vql
 */
package ca.mcgill.sure.variablecalibration.patterns;

import ca.mcgill.sure.variablecalibration.Input;
import ca.mcgill.sure.variablecalibration.patterns.util.InputWithoutValueQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the ca.mcgill.sure.variablecalibration.patterns.inputWithoutValue pattern,
 * to be used in conjunction with {@link InputWithoutValueMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InputWithoutValueMatcher
 * @see InputWithoutValueProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InputWithoutValueMatch extends BasePatternMatch {
  private Input fInput;
  
  private static List<String> parameterNames = makeImmutableList("input");
  
  private InputWithoutValueMatch(final Input pInput) {
    this.fInput = pInput;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("input".equals(parameterName)) return this.fInput;
    return null;
  }
  
  public Input getInput() {
    return this.fInput;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("input".equals(parameterName) ) {
    	this.fInput = (Input) newValue;
    	return true;
    }
    return false;
  }
  
  public void setInput(final Input pInput) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fInput = pInput;
  }
  
  @Override
  public String patternName() {
    return "ca.mcgill.sure.variablecalibration.patterns.inputWithoutValue";
  }
  
  @Override
  public List<String> parameterNames() {
    return InputWithoutValueMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fInput};
  }
  
  @Override
  public InputWithoutValueMatch toImmutable() {
    return isMutable() ? newMatch(fInput) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"input\"=" + prettyPrintValue(fInput)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fInput == null) ? 0 : fInput.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InputWithoutValueMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    InputWithoutValueMatch other = (InputWithoutValueMatch) obj;
    if (fInput == null) {if (other.fInput != null) return false;}
    else if (!fInput.equals(other.fInput)) return false;
    return true;
  }
  
  @Override
  public InputWithoutValueQuerySpecification specification() {
    try {
    	return InputWithoutValueQuerySpecification.instance();
    } catch (ViatraQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static InputWithoutValueMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pInput the fixed value of pattern parameter input, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InputWithoutValueMatch newMutableMatch(final Input pInput) {
    return new Mutable(pInput);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pInput the fixed value of pattern parameter input, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InputWithoutValueMatch newMatch(final Input pInput) {
    return new Immutable(pInput);
  }
  
  private static final class Mutable extends InputWithoutValueMatch {
    Mutable(final Input pInput) {
      super(pInput);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InputWithoutValueMatch {
    Immutable(final Input pInput) {
      super(pInput);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
