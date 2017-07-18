/**
 * Generated from platform:/resource/ca.mcgill.sure.variablecalibration.patterns/src/ca/mcgill/sure/variablecalibration/patterns/patterns.vql
 */
package ca.mcgill.sure.variablecalibration.patterns.util;

import ca.mcgill.sure.variablecalibration.Configuration;
import ca.mcgill.sure.variablecalibration.patterns.DifferentConfigMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the ca.mcgill.sure.variablecalibration.patterns.differentConfig pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class DifferentConfigProcessor implements IMatchProcessor<DifferentConfigMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pConf the value of pattern parameter conf in the currently processed match
   * 
   */
  public abstract void process(final Configuration pConf);
  
  @Override
  public void process(final DifferentConfigMatch match) {
    process(match.getConf());
  }
}
