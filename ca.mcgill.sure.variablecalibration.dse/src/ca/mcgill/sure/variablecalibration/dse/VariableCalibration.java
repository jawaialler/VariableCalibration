package ca.mcgill.sure.variablecalibration.dse;

import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.Strategies;
import org.eclipse.viatra.dse.objectives.Comparators;
import org.eclipse.viatra.dse.objectives.impl.ConstraintsObjective;
import org.eclipse.viatra.dse.solutionstore.SolutionStore;

import ca.mcgill.sure.variablecalibration.Hillslope1DPackage;
import ca.mcgill.sure.variablecalibration.HillslopeModel;
import ca.mcgill.sure.variablecalibration.objectives.QueryName;
import ca.mcgill.sure.variablecalibration.rules.VCRuleProvider;
import ca.mcgill.sure.variablecalibration.statecoder.VCStateCoderFactory;

public class VariableCalibration {
	
	public static void main(String[] args) {

	DesignSpaceExplorer dse = new DesignSpaceExplorer();
	
	//create initial model
	HillslopeModel initialModel = VCHelper.createInitialModel(); 
	dse.setInitialModel(initialModel);
	dse.addMetaModelPackage(Hillslope1DPackage.eINSTANCE);
	
	//add state coder factory
	dse.setStateCoderFactory(new VCStateCoderFactory()); 
	
	//add rules
	VCRuleProvider rules = new VCRuleProvider();
	dse.addTransformationRule(rules.mismatchDataAndInput);
	
	//add objectives
	dse.addObjective(
			new ConstraintsObjective()
            .withHardConstraint(QueryName.instance())
            //.withHardConstraint(OtherQueryName.instance())
            //.withSoftConstraint(AndAnotherQueryName.instance(), 1)
            .withComparator(Comparators.LOWER_IS_BETTER));
//dse.addObjective(new CraIndexObjective());

dse.setSolutionStore(new SolutionStore().storeBestSolutionsOnly());

dse.startExploration(Strategies.createDfsStrategy(0));

System.out.println(dse.toStringSolutions());
	
	
	}
}
