package ca.mcgill.sure.variablecalibration.rules

import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule
import ca.mcgill.sure.variablecalibration.patterns.util.MismatchDataAndInputQuerySpecification
import ca.mcgill.sure.variablecalibration.patterns.MismatchDataAndInputMatch
import ca.mcgill.sure.variablecalibration.patterns.MismatchDataAndInputMatcher
import org.apache.log4j.Logger
import ca.mcgill.sure.variablecalibration.Configuration

class VCRuleProvider {
	extension Logger logger = Logger.getLogger(VCRuleProvider); 
	
	private extension BatchTransformationRuleFactory factory = new BatchTransformationRuleFactory
    
    public BatchTransformationRule<MismatchDataAndInputMatch, MismatchDataAndInputMatcher> mismatchDataAndInput
   
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
       
       }
	
}