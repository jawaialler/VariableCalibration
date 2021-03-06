/**
 * Generated from platform:/resource/ca.mcgill.sure.variablecalibration.patterns/src/ca/mcgill/sure/variablecalibration/patterns/patterns.vql
 */
package ca.mcgill.sure.variablecalibration.patterns.util;

import ca.mcgill.sure.variablecalibration.patterns.MismatchDataAndInputMatch;
import ca.mcgill.sure.variablecalibration.patterns.MismatchDataAndInputMatcher;
import ca.mcgill.sure.variablecalibration.patterns.util.InputOfCatQuerySpecification;
import ca.mcgill.sure.variablecalibration.patterns.util.ValuesOfConfigQuerySpecification;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackendFactory;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate MismatchDataAndInputMatcher in a type-safe way.
 * 
 * @see MismatchDataAndInputMatcher
 * @see MismatchDataAndInputMatch
 * 
 */
@SuppressWarnings("all")
public final class MismatchDataAndInputQuerySpecification extends BaseGeneratedEMFQuerySpecification<MismatchDataAndInputMatcher> {
  private MismatchDataAndInputQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static MismatchDataAndInputQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MismatchDataAndInputMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return MismatchDataAndInputMatcher.on(engine);
  }
  
  @Override
  public MismatchDataAndInputMatcher instantiate() throws ViatraQueryException {
    return MismatchDataAndInputMatcher.create();
  }
  
  @Override
  public MismatchDataAndInputMatch newEmptyMatch() {
    return MismatchDataAndInputMatch.newEmptyMatch();
  }
  
  @Override
  public MismatchDataAndInputMatch newMatch(final Object... parameters) {
    return MismatchDataAndInputMatch.newMatch((ca.mcgill.sure.variablecalibration.Configuration) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link MismatchDataAndInputQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link MismatchDataAndInputQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static MismatchDataAndInputQuerySpecification INSTANCE = new MismatchDataAndInputQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MismatchDataAndInputQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pConf = new PParameter("conf", "ca.mcgill.sure.variablecalibration.Configuration", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("ca.mcgill.sure.variablecalibration", "Configuration")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pConf);
    
    @Override
    public String getFullyQualifiedName() {
      return "ca.mcgill.sure.variablecalibration.patterns.mismatchDataAndInput";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("conf");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, (IQueryBackendFactory)null));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_conf = body.getOrCreateVariableByName("conf");
      		PVariable var_model = body.getOrCreateVariableByName("model");
      		PVariable var_cat = body.getOrCreateVariableByName("cat");
      		PVariable var_NbOfValues = body.getOrCreateVariableByName("NbOfValues");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		PVariable var_NbOfInputs = body.getOrCreateVariableByName("NbOfInputs");
      		PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
      		new TypeConstraint(body, new FlatTuple(var_conf), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("ca.mcgill.sure.variablecalibration", "Configuration")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_conf, parameter_pConf)
      		));
      		// 	HillslopeModel.configurations(model, conf)
      		new TypeConstraint(body, new FlatTuple(var_model), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("ca.mcgill.sure.variablecalibration", "HillslopeModel")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_model, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("ca.mcgill.sure.variablecalibration", "HillslopeModel", "configurations")));
      		new Equality(body, var__virtual_0_, var_conf);
      		// 	HillslopeModel.categories(model, cat)
      		new TypeConstraint(body, new FlatTuple(var_model), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("ca.mcgill.sure.variablecalibration", "HillslopeModel")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_model, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("ca.mcgill.sure.variablecalibration", "HillslopeModel", "categories")));
      		new Equality(body, var__virtual_1_, var_cat);
      		// 	NbOfValues == count find valuesOfConfig(conf, _)
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new PatternMatchCounter(body, new FlatTuple(var_conf, var___0_), ValuesOfConfigQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_2_);
      		new Equality(body, var_NbOfValues, var__virtual_2_);
      		//  	NbOfInputs == count find inputOfCat(cat, _)
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new PatternMatchCounter(body, new FlatTuple(var_cat, var___1_), InputOfCatQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_3_);
      		new Equality(body, var_NbOfInputs, var__virtual_3_);
      		// 	NbOfInputs != NbOfValues
      		new Inequality(body, var_NbOfInputs, var_NbOfValues);
      		bodies.add(body);
      	}
      	// to silence compiler error
      	if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
