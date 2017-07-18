/**
 * Generated from platform:/resource/ca.mcgill.sure.variablecalibration.patterns/src/ca/mcgill/sure/variablecalibration/patterns/patterns.vql
 */
package ca.mcgill.sure.variablecalibration.patterns.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate OutputsOfInputsMatcher in a type-safe way.
 * 
 * @see OutputsOfInputsMatcher
 * @see OutputsOfInputsMatch
 * 
 */
@SuppressWarnings("all")
final class OutputsOfInputsQuerySpecification extends BaseGeneratedEMFQuerySpecification<ViatraQueryMatcher<IPatternMatch>> {
  private OutputsOfInputsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static OutputsOfInputsQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ViatraQueryMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public ViatraQueryMatcher instantiate() throws ViatraQueryException {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public IPatternMatch newEmptyMatch() {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public IPatternMatch newMatch(final Object... parameters) {
    throw new UnsupportedOperationException();
  }
  
  /**
   * Inner class allowing the singleton instance of {@link OutputsOfInputsQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link OutputsOfInputsQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static OutputsOfInputsQuerySpecification INSTANCE = new OutputsOfInputsQuerySpecification();
    
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
    private final static OutputsOfInputsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pO = new PParameter("o", "ca.mcgill.sure.variablecalibration.Output", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("ca.mcgill.sure.variablecalibration", "Output")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pI = new PParameter("i", "ca.mcgill.sure.variablecalibration.Input", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("ca.mcgill.sure.variablecalibration", "Input")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pO, parameter_pI);
    
    @Override
    public String getFullyQualifiedName() {
      return "ca.mcgill.sure.variablecalibration.patterns.outputsOfInputs";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("o","i");
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
      		PVariable var_o = body.getOrCreateVariableByName("o");
      		PVariable var_i = body.getOrCreateVariableByName("i");
      		new TypeConstraint(body, new FlatTuple(var_o), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("ca.mcgill.sure.variablecalibration", "Output")));
      		new TypeConstraint(body, new FlatTuple(var_i), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("ca.mcgill.sure.variablecalibration", "Input")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_o, parameter_pO),
      		   new ExportedParameter(body, var_i, parameter_pI)
      		));
      		// 	Output.input(o, i)
      		new TypeConstraint(body, new FlatTuple(var_o), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("ca.mcgill.sure.variablecalibration", "Output")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_o, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("ca.mcgill.sure.variablecalibration", "Output", "input")));
      		new Equality(body, var__virtual_0_, var_i);
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
