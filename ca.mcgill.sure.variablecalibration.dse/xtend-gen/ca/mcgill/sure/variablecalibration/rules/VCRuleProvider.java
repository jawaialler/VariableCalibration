package ca.mcgill.sure.variablecalibration.rules;

import ca.mcgill.sure.variablecalibration.Configuration;
import ca.mcgill.sure.variablecalibration.Input;
import ca.mcgill.sure.variablecalibration.patterns.InputWithoutValueMatch;
import ca.mcgill.sure.variablecalibration.patterns.InputWithoutValueMatcher;
import ca.mcgill.sure.variablecalibration.patterns.MismatchDataAndInputMatch;
import ca.mcgill.sure.variablecalibration.patterns.MismatchDataAndInputMatcher;
import ca.mcgill.sure.variablecalibration.patterns.util.InputWithoutValueQuerySpecification;
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
  
  public BatchTransformationRule<InputWithoutValueMatch, InputWithoutValueMatcher> inputWithoutValue;
  
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
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<InputWithoutValueMatch, InputWithoutValueMatcher> _createRule_1 = this.factory.<InputWithoutValueMatch, InputWithoutValueMatcher>createRule();
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<InputWithoutValueMatch, InputWithoutValueMatcher> _name_1 = _createRule_1.name("inputWithoutValue");
      InputWithoutValueQuerySpecification _instance_1 = InputWithoutValueQuerySpecification.instance();
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<InputWithoutValueMatch, InputWithoutValueMatcher> _precondition_1 = _name_1.precondition(_instance_1);
      final IMatchProcessor<InputWithoutValueMatch> _function_1 = (InputWithoutValueMatch it) -> {
        Input _input = it.getInput();
        String _string = _input.toString();
        String _plus = ("rule input without value executed on input: " + _string);
        this.logger.info(_plus);
        final Input in = it.getInput();
      };
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<InputWithoutValueMatch, InputWithoutValueMatcher> _action_1 = _precondition_1.action(_function_1);
      BatchTransformationRule<InputWithoutValueMatch, InputWithoutValueMatcher> _build_1 = _action_1.build();
      this.inputWithoutValue = _build_1;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
