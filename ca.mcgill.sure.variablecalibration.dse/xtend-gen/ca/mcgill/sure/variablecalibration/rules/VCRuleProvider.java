package ca.mcgill.sure.variablecalibration.rules;

import ca.mcgill.sure.variablecalibration.Configuration;
import ca.mcgill.sure.variablecalibration.patterns.MismatchDataAndInputMatch;
import ca.mcgill.sure.variablecalibration.patterns.MismatchDataAndInputMatcher;
import ca.mcgill.sure.variablecalibration.patterns.util.MismatchDataAndInputQuerySpecification;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class VCRuleProvider {
  @Extension
  private Logger logger = Logger.getLogger(VCRuleProvider.class);
  
  @Extension
  private BatchTransformationRuleFactory factory = new BatchTransformationRuleFactory();
  
  public BatchTransformationRule<MismatchDataAndInputMatch, MismatchDataAndInputMatcher> mismatchDataAndInput;
  
  public VCRuleProvider() {
    try {
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<MismatchDataAndInputMatch, MismatchDataAndInputMatcher> _createRule = this.factory.<MismatchDataAndInputMatch, MismatchDataAndInputMatcher>createRule();
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<MismatchDataAndInputMatch, MismatchDataAndInputMatcher> _name = _createRule.name(" mismatchDataAndInput");
      MismatchDataAndInputQuerySpecification _instance = MismatchDataAndInputQuerySpecification.instance();
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<MismatchDataAndInputMatch, MismatchDataAndInputMatcher> _precondition = _name.precondition(_instance);
      final IMatchProcessor<MismatchDataAndInputMatch> _function = (MismatchDataAndInputMatch it) -> {
        Configuration _conf = it.getConf();
        String _string = _conf.toString();
        String _plus = ("rule Mismatch executed on config: " + _string);
        this.logger.info(_plus);
        final Configuration config = it.getConf();
        config.setColumn(3);
      };
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<MismatchDataAndInputMatch, MismatchDataAndInputMatcher> _action = _precondition.action(_function);
      BatchTransformationRule<MismatchDataAndInputMatch, MismatchDataAndInputMatcher> _build = _action.build();
      this.mismatchDataAndInput = _build;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
