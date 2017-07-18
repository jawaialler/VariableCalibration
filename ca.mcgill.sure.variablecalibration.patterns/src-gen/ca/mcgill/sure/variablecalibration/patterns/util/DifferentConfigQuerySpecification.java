/**
 * Generated from platform:/resource/ca.mcgill.sure.variablecalibration.patterns/src/ca/mcgill/sure/variablecalibration/patterns/patterns.vql
 */
package ca.mcgill.sure.variablecalibration.patterns.util;

import ca.mcgill.sure.variablecalibration.patterns.DifferentConfigMatch;
import ca.mcgill.sure.variablecalibration.patterns.DifferentConfigMatcher;
import com.google.common.base.Objects;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate DifferentConfigMatcher in a type-safe way.
 * 
 * @see DifferentConfigMatcher
 * @see DifferentConfigMatch
 * 
 */
@SuppressWarnings("all")
public final class DifferentConfigQuerySpecification extends BaseGeneratedEMFQuerySpecification<DifferentConfigMatcher> {
  private DifferentConfigQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static DifferentConfigQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected DifferentConfigMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return DifferentConfigMatcher.on(engine);
  }
  
  @Override
  public DifferentConfigMatcher instantiate() throws ViatraQueryException {
    return DifferentConfigMatcher.create();
  }
  
  @Override
  public DifferentConfigMatch newEmptyMatch() {
    return DifferentConfigMatch.newEmptyMatch();
  }
  
  @Override
  public DifferentConfigMatch newMatch(final Object... parameters) {
    return DifferentConfigMatch.newMatch((ca.mcgill.sure.variablecalibration.Configuration) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link DifferentConfigQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link DifferentConfigQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static DifferentConfigQuerySpecification INSTANCE = new DifferentConfigQuerySpecification();
    
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
    private final static DifferentConfigQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pConf = new PParameter("conf", "ca.mcgill.sure.variablecalibration.Configuration", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("ca.mcgill.sure.variablecalibration", "Configuration")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pConf);
    
    @Override
    public String getFullyQualifiedName() {
      return "ca.mcgill.sure.variablecalibration.patterns.differentConfig";
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
      		PVariable var_row1 = body.getOrCreateVariableByName("row1");
      		PVariable var_row2 = body.getOrCreateVariableByName("row2");
      		PVariable var_col1 = body.getOrCreateVariableByName("col1");
      		PVariable var_col2 = body.getOrCreateVariableByName("col2");
      		new TypeConstraint(body, new FlatTuple(var_conf), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("ca.mcgill.sure.variablecalibration", "Configuration")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_conf, parameter_pConf)
      		));
      		// 	Configuration.row(conf, row1)
      		new TypeConstraint(body, new FlatTuple(var_conf), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("ca.mcgill.sure.variablecalibration", "Configuration")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_conf, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("ca.mcgill.sure.variablecalibration", "Configuration", "row")));
      		new Equality(body, var__virtual_0_, var_row1);
      		// 	Configuration.row(conf, row2)
      		new TypeConstraint(body, new FlatTuple(var_conf), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("ca.mcgill.sure.variablecalibration", "Configuration")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_conf, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("ca.mcgill.sure.variablecalibration", "Configuration", "row")));
      		new Equality(body, var__virtual_1_, var_row2);
      		// 	Configuration.column(conf, col1)
      		new TypeConstraint(body, new FlatTuple(var_conf), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("ca.mcgill.sure.variablecalibration", "Configuration")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_conf, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("ca.mcgill.sure.variablecalibration", "Configuration", "column")));
      		new Equality(body, var__virtual_2_, var_col1);
      		// 	Configuration.column(conf, col2)
      		new TypeConstraint(body, new FlatTuple(var_conf), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("ca.mcgill.sure.variablecalibration", "Configuration")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_conf, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("ca.mcgill.sure.variablecalibration", "Configuration", "column")));
      		new Equality(body, var__virtual_3_, var_col2);
      		// 	check((row1 == row2) && (col1 == col2))
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern differentConfig";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("col1", "col2", "row1", "row2");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer col1 = (Integer) provider.getValue("col1");
      		        Integer col2 = (Integer) provider.getValue("col2");
      		        Integer row1 = (Integer) provider.getValue("row1");
      		        Integer row2 = (Integer) provider.getValue("row2");
      		        return evaluateExpression_1_1(col1, col2, row1, row2);
      		    }
      		},  null); 
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
  
  private static boolean evaluateExpression_1_1(final Integer col1, final Integer col2, final Integer row1, final Integer row2) {
    return (Objects.equal(row1, row2) && Objects.equal(col1, col2));
  }
}
