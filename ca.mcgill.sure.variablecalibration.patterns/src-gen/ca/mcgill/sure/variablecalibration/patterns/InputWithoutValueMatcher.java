/**
 * Generated from platform:/resource/ca.mcgill.sure.variablecalibration.patterns/src/ca/mcgill/sure/variablecalibration/patterns/patterns.vql
 */
package ca.mcgill.sure.variablecalibration.patterns;

import ca.mcgill.sure.variablecalibration.Input;
import ca.mcgill.sure.variablecalibration.patterns.InputWithoutValueMatch;
import ca.mcgill.sure.variablecalibration.patterns.util.InputWithoutValueQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * Generated pattern matcher API of the ca.mcgill.sure.variablecalibration.patterns.inputWithoutValue pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link InputWithoutValueMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern inputWithoutValue(input : Input){
 * 	neg find valuesOfInput(input, _value);
 * }
 * </pre></code>
 * 
 * @see InputWithoutValueMatch
 * @see InputWithoutValueProcessor
 * @see InputWithoutValueQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class InputWithoutValueMatcher extends BaseMatcher<InputWithoutValueMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static InputWithoutValueMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    InputWithoutValueMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (InputWithoutValueMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static InputWithoutValueMatcher create() throws ViatraQueryException {
    return new InputWithoutValueMatcher();
  }
  
  private final static int POSITION_INPUT = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(InputWithoutValueMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private InputWithoutValueMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pInput the fixed value of pattern parameter input, or null if not bound.
   * @return matches represented as a InputWithoutValueMatch object.
   * 
   */
  public Collection<InputWithoutValueMatch> getAllMatches(final Input pInput) {
    return rawGetAllMatches(new Object[]{pInput});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pInput the fixed value of pattern parameter input, or null if not bound.
   * @return a match represented as a InputWithoutValueMatch object, or null if no match is found.
   * 
   */
  public InputWithoutValueMatch getOneArbitraryMatch(final Input pInput) {
    return rawGetOneArbitraryMatch(new Object[]{pInput});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pInput the fixed value of pattern parameter input, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Input pInput) {
    return rawHasMatch(new Object[]{pInput});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pInput the fixed value of pattern parameter input, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Input pInput) {
    return rawCountMatches(new Object[]{pInput});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pInput the fixed value of pattern parameter input, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Input pInput, final IMatchProcessor<? super InputWithoutValueMatch> processor) {
    rawForEachMatch(new Object[]{pInput}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pInput the fixed value of pattern parameter input, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Input pInput, final IMatchProcessor<? super InputWithoutValueMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pInput}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pInput the fixed value of pattern parameter input, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public InputWithoutValueMatch newMatch(final Input pInput) {
    return InputWithoutValueMatch.newMatch(pInput);
  }
  
  /**
   * Retrieve the set of values that occur in matches for input.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Input> rawAccumulateAllValuesOfinput(final Object[] parameters) {
    Set<Input> results = new HashSet<Input>();
    rawAccumulateAllValues(POSITION_INPUT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for input.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Input> getAllValuesOfinput() {
    return rawAccumulateAllValuesOfinput(emptyArray());
  }
  
  @Override
  protected InputWithoutValueMatch tupleToMatch(final Tuple t) {
    try {
    	return InputWithoutValueMatch.newMatch((Input) t.get(POSITION_INPUT));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InputWithoutValueMatch arrayToMatch(final Object[] match) {
    try {
    	return InputWithoutValueMatch.newMatch((Input) match[POSITION_INPUT]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InputWithoutValueMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return InputWithoutValueMatch.newMutableMatch((Input) match[POSITION_INPUT]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<InputWithoutValueMatcher> querySpecification() throws ViatraQueryException {
    return InputWithoutValueQuerySpecification.instance();
  }
}
