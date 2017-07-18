/**
 * Generated from platform:/resource/ca.mcgill.sure.variablecalibration.patterns/src/ca/mcgill/sure/variablecalibration/patterns/patterns.vql
 */
package ca.mcgill.sure.variablecalibration.patterns.util;

import ca.mcgill.sure.variablecalibration.Input;
import ca.mcgill.sure.variablecalibration.patterns.InputWithoutValueMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the ca.mcgill.sure.variablecalibration.patterns.inputWithoutValue pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InputWithoutValueProcessor implements IMatchProcessor<InputWithoutValueMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pInput the value of pattern parameter input in the currently processed match
   * 
   */
  public abstract void process(final Input pInput);
  
  @Override
  public void process(final InputWithoutValueMatch match) {
    process(match.getInput());
  }
}
