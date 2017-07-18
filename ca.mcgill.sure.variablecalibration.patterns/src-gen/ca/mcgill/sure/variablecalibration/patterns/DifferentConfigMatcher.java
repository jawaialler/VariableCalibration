/**
 * Generated from platform:/resource/ca.mcgill.sure.variablecalibration.patterns/src/ca/mcgill/sure/variablecalibration/patterns/patterns.vql
 */
package ca.mcgill.sure.variablecalibration.patterns;

import ca.mcgill.sure.variablecalibration.Configuration;
import ca.mcgill.sure.variablecalibration.patterns.DifferentConfigMatch;
import ca.mcgill.sure.variablecalibration.patterns.util.DifferentConfigQuerySpecification;
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
 * Generated pattern matcher API of the ca.mcgill.sure.variablecalibration.patterns.differentConfig pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link DifferentConfigMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern differentConfig(conf : Configuration){
 * 	Configuration.row(conf, row1);
 * 	Configuration.row(conf, row2);
 * 	Configuration.column(conf, col1);
 * 	Configuration.column(conf, col2);
 * 	check((row1 == row2) && (col1 == col2));
 * }
 * </pre></code>
 * 
 * @see DifferentConfigMatch
 * @see DifferentConfigProcessor
 * @see DifferentConfigQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class DifferentConfigMatcher extends BaseMatcher<DifferentConfigMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static DifferentConfigMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    DifferentConfigMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (DifferentConfigMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static DifferentConfigMatcher create() throws ViatraQueryException {
    return new DifferentConfigMatcher();
  }
  
  private final static int POSITION_CONF = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DifferentConfigMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private DifferentConfigMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pConf the fixed value of pattern parameter conf, or null if not bound.
   * @return matches represented as a DifferentConfigMatch object.
   * 
   */
  public Collection<DifferentConfigMatch> getAllMatches(final Configuration pConf) {
    return rawGetAllMatches(new Object[]{pConf});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pConf the fixed value of pattern parameter conf, or null if not bound.
   * @return a match represented as a DifferentConfigMatch object, or null if no match is found.
   * 
   */
  public DifferentConfigMatch getOneArbitraryMatch(final Configuration pConf) {
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
  public void forEachMatch(final Configuration pConf, final IMatchProcessor<? super DifferentConfigMatch> processor) {
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
  public boolean forOneArbitraryMatch(final Configuration pConf, final IMatchProcessor<? super DifferentConfigMatch> processor) {
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
  public DifferentConfigMatch newMatch(final Configuration pConf) {
    return DifferentConfigMatch.newMatch(pConf);
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
  protected DifferentConfigMatch tupleToMatch(final Tuple t) {
    try {
    	return DifferentConfigMatch.newMatch((Configuration) t.get(POSITION_CONF));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected DifferentConfigMatch arrayToMatch(final Object[] match) {
    try {
    	return DifferentConfigMatch.newMatch((Configuration) match[POSITION_CONF]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected DifferentConfigMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return DifferentConfigMatch.newMutableMatch((Configuration) match[POSITION_CONF]);
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
  public static IQuerySpecification<DifferentConfigMatcher> querySpecification() throws ViatraQueryException {
    return DifferentConfigQuerySpecification.instance();
  }
}
