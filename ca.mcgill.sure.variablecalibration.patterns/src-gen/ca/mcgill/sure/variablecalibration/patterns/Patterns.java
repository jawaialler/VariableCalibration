/**
 * Generated from platform:/resource/ca.mcgill.sure.variablecalibration.patterns/src/ca/mcgill/sure/variablecalibration/patterns/patterns.vql
 */
package ca.mcgill.sure.variablecalibration.patterns;

import ca.mcgill.sure.variablecalibration.patterns.MismatchDataAndInputMatcher;
import ca.mcgill.sure.variablecalibration.patterns.util.MismatchDataAndInputQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all patterns defined in patterns.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file patterns.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package ca.mcgill.sure.variablecalibration.patterns, the group contains the definition of the following patterns: <ul>
 * <li>input</li>
 * <li>inputName</li>
 * <li>queryName</li>
 * <li>valuesOfConfig</li>
 * <li>inputOfCat</li>
 * <li>mismatchDataAndInput</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Patterns extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Patterns instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Patterns();
    }
    return INSTANCE;
  }
  
  private static Patterns INSTANCE;
  
  private Patterns() throws ViatraQueryException {
    querySpecifications.add(MismatchDataAndInputQuerySpecification.instance());
  }
  
  public MismatchDataAndInputQuerySpecification getMismatchDataAndInput() throws ViatraQueryException {
    return MismatchDataAndInputQuerySpecification.instance();
  }
  
  public MismatchDataAndInputMatcher getMismatchDataAndInput(final ViatraQueryEngine engine) throws ViatraQueryException {
    return MismatchDataAndInputMatcher.on(engine);
  }
}
