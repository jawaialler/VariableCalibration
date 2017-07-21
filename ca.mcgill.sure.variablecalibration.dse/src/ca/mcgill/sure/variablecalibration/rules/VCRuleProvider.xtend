package ca.mcgill.sure.variablecalibration.rules

import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule
import ca.mcgill.sure.variablecalibration.patterns.util.MismatchDataAndInputQuerySpecification
import ca.mcgill.sure.variablecalibration.patterns.MismatchDataAndInputMatch
import ca.mcgill.sure.variablecalibration.patterns.MismatchDataAndInputMatcher
import org.apache.log4j.Logger
import ca.mcgill.sure.variablecalibration.Configuration
import ca.mcgill.sure.variablecalibration.patterns.InputWithoutValueMatch
import ca.mcgill.sure.variablecalibration.patterns.InputWithoutValueMatcher
import ca.mcgill.sure.variablecalibration.patterns.util.InputWithoutValueQuerySpecification
import ca.mcgill.sure.variablecalibration.Input

class VCRuleProvider {
	extension Logger logger = Logger.getLogger(VCRuleProvider); 
	
	private extension BatchTransformationRuleFactory factory = new BatchTransformationRuleFactory
    
    public BatchTransformationRule<MismatchDataAndInputMatch, MismatchDataAndInputMatcher> mismatchDataAndInput
    public BatchTransformationRule<InputWithoutValueMatch, InputWithoutValueMatcher> inputWithoutValue
   
 	// TODO add the rules

    new() {
         mismatchDataAndInput = createRule
                .name(" mismatchDataAndInput")
                .precondition(MismatchDataAndInputQuerySpecification.instance())
                .action[
                	info("rule Mismatch executed on config: " + it.conf.toString)
                	val Configuration config = it.conf
                	config.column = 3
                 //   c.getEncapsulates().add(f)
                ]
                .build
                
         inputWithoutValue = createRule
         		.name("inputWithoutValue")
         		.precondition(InputWithoutValueQuerySpecification.instance())
         		.action[info("rule input without value executed on input: " + it.input.toString)
                	val Input in = it.input
                	//assign a value
                ]
                .build
     
       }
	
}