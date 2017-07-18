/**
 * Generated from platform:/resource/ca.mcgill.sure.variablecalibration.patterns/src/ca/mcgill/sure/variablecalibration/patterns/patterns.vql
 */
package ca.mcgill.sure.variablecalibration.patterns;

import ca.mcgill.sure.variablecalibration.Configuration;
import ca.mcgill.sure.variablecalibration.patterns.util.DifferentConfigQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the ca.mcgill.sure.variablecalibration.patterns.differentConfig pattern,
 * to be used in conjunction with {@link DifferentConfigMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see DifferentConfigMatcher
 * @see DifferentConfigProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class DifferentConfigMatch extends BasePatternMatch {
  private Configuration fConf;
  
  private static List<String> parameterNames = makeImmutableList("conf");
  
  private DifferentConfigMatch(final Configuration pConf) {
    this.fConf = pConf;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("conf".equals(parameterName)) return this.fConf;
    return null;
  }
  
  public Configuration getConf() {
    return this.fConf;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("conf".equals(parameterName) ) {
    	this.fConf = (Configuration) newValue;
    	return true;
    }
    return false;
  }
  
  public void setConf(final Configuration pConf) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fConf = pConf;
  }
  
  @Override
  public String patternName() {
    return "ca.mcgill.sure.variablecalibration.patterns.differentConfig";
  }
  
  @Override
  public List<String> parameterNames() {
    return DifferentConfigMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fConf};
  }
  
  @Override
  public DifferentConfigMatch toImmutable() {
    return isMutable() ? newMatch(fConf) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"conf\"=" + prettyPrintValue(fConf)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fConf == null) ? 0 : fConf.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof DifferentConfigMatch)) { // this should be infrequent
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
    DifferentConfigMatch other = (DifferentConfigMatch) obj;
    if (fConf == null) {if (other.fConf != null) return false;}
    else if (!fConf.equals(other.fConf)) return false;
    return true;
  }
  
  @Override
  public DifferentConfigQuerySpecification specification() {
    try {
    	return DifferentConfigQuerySpecification.instance();
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
  public static DifferentConfigMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pConf the fixed value of pattern parameter conf, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static DifferentConfigMatch newMutableMatch(final Configuration pConf) {
    return new Mutable(pConf);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pConf the fixed value of pattern parameter conf, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static DifferentConfigMatch newMatch(final Configuration pConf) {
    return new Immutable(pConf);
  }
  
  private static final class Mutable extends DifferentConfigMatch {
    Mutable(final Configuration pConf) {
      super(pConf);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends DifferentConfigMatch {
    Immutable(final Configuration pConf) {
      super(pConf);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
