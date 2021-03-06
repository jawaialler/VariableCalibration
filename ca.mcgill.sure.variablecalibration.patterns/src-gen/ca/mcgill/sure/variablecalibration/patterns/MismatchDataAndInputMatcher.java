/**
 * Generated from platform:/resource/ca.mcgill.sure.variablecalibration.patterns/src/ca/mcgill/sure/variablecalibration/patterns/patterns.vql
 */
package ca.mcgill.sure.variablecalibration.patterns;

import ca.mcgill.sure.variablecalibration.Configuration;
import ca.mcgill.sure.variablecalibration.patterns.MismatchDataAndInputMatch;
import ca.mcgill.sure.variablecalibration.patterns.util.MismatchDataAndInputQuerySpecification;
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
 * Generated pattern matcher API of the ca.mcgill.sure.variablecalibration.patterns.mismatchDataAndInput pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link MismatchDataAndInputMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * private pattern rowOfConfig(conf : Configuration) {
 * 	Configuration.row(conf, row);
 * }
 * 
 * private pattern colOfConfig(conf : Configuration) {
 * 	Configuration.column(conf, col);
 * }
 * 
 * 
 * pattern mismatchDataAndInput(conf : Configuration){
 * 	HillslopeModel.configurations(model, conf);
 * 	HillslopeModel.categories(model, cat);
 * 	NbOfValues == count find valuesOfConfig(conf, _); 
 * 	NbOfInputs == count find inputOfCat(cat, _);
 * 	NbOfInputs != NbOfValues;	
 * }
 * </pre></code>
 * 
 * @see MismatchDataAndInputMatch
 * @see MismatchDataAndInputProcessor
 * @see MismatchDataAndInputQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class MismatchDataAndInputMatcher extends BaseMatcher<MismatchDataAndInputMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static MismatchDataAndInputMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    MismatchDataAndInputMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (MismatchDataAndInputMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static MismatchDataAndInputMatcher create() throws ViatraQueryException {
    return new MismatchDataAndInputMatcher();
  }
  
  private final static int POSITION_CONF = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MismatchDataAndInputMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private MismatchDataAndInputMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pConf the fixed value of pattern parameter conf, or null if not bound.
   * @return matches represented as a MismatchDataAndInputMatch object.
   * 
   */
  public Collection<MismatchDataAndInputMatch> getAllMatches(final Configuration pConf) {
    return rawGetAllMatches(new Object[]{pConf});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pConf the fixed value of pattern parameter conf, or null if not bound.
   * @return a match represented as a MismatchDataAndInputMatch object, or null if no match is found.
   * 
   */
  public MismatchDataAndInputMatch getOneArbitraryMatch(final Configuration pConf) {
    return rawGetOneArbitraryMatch(new Object[]{pConf});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pConf the fixed value of pattern parameter conf, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Configuration pConf) {
    return rawHasMatch(new Object[]{pConf});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pConf the fixed value of pattern parameter conf, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Configuration pConf) {
    return rawCountMatches(new Object[]{pConf});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pConf the fixed value of pattern parameter conf, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Configuration pConf, final IMatchProcessor<? super MismatchDataAndInputMatch> processor) {
    rawForEachMatch(new Object[]{pConf}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pConf the fixed value of pattern parameter conf, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Configuration pConf, final IMatchProcessor<? super MismatchDataAndInputMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pConf}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pConf the fixed value of pattern parameter conf, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public MismatchDataAndInputMatch newMatch(final Configuration pConf) {
    return MismatchDataAndInputMatch.newMatch(pConf);
  }
  
  /**
   * Retrieve the set of values that occur in matches for conf.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Configuration> rawAccumulateAllValuesOfconf(final Object[] parameters) {
    Set<Configuration> results = new HashSet<Configuration>();
    rawAccumulateAllValues(POSITION_CONF, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for conf.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Configuration> getAllValuesOfconf() {
    return rawAccumulateAllValuesOfconf(emptyArray());
  }
  
  @Override
  protected MismatchDataAndInputMatch tupleToMatch(final Tuple t) {
    try {
    	return MismatchDataAndInputMatch.newMatch((Configuration) t.get(POSITION_CONF));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MismatchDataAndInputMatch arrayToMatch(final Object[] match) {
    try {
    	return MismatchDataAndInputMatch.newMatch((Configuration) match[POSITION_CONF]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MismatchDataAndInputMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return MismatchDataAndInputMatch.newMutableMatch((Configuration) match[POSITION_CONF]);
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
  public static IQuerySpecification<MismatchDataAndInputMatcher> querySpecification() throws ViatraQueryException {
    return MismatchDataAndInputQuerySpecification.instance();
  }
}
