package ca.mcgill.sure.variablecalibration.dse;

import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.Strategies;
import org.eclipse.viatra.dse.objectives.Comparators;
import org.eclipse.viatra.dse.objectives.impl.ConstraintsObjective;
import org.eclipse.viatra.dse.solutionstore.SolutionStore;

import ca.mcgill.sure.variablecalibration.Hillslope1DPackage;
import ca.mcgill.sure.variablecalibration.HillslopeModel;
import ca.mcgill.sure.variablecalibration.objectives.SetInputObjective;
import ca.mcgill.sure.variablecalibration.rules.VCRuleProvider;
import ca.mcgill.sure.variablecalibration.statecoder.VCStateCoderFactory;

public class VariableCalibration {
	
	public static void main(String[] args) {

	DesignSpaceExplorer dse = new DesignSpaceExplorer(); //API
	
	//create initial model
	HillslopeModel initialModel = VCHelper.createInitialModel(); 
	dse.setInitialModel(initialModel);
	dse.addMetaModelPackage(Hillslope1DPackage.eINSTANCE);
	
	//add state coder factory
	dse.setStateCoderFactory(new VCStateCoderFactory()); 
	
	//add rules
	VCRuleProvider rules = new VCRuleProvider();
	dse.addTransformationRule(rules.mismatchDataAndInput);
	dse.addTransformationRule(rules.inputWithoutValue);
	
	//add objectives
	dse.addObjective(new SetInputObjective()
            //.withHardConstraint(SetInputObjective.instance())
            .withComparator(Comparators.HIGHER_IS_BETTER)
			.withLevel(0));

dse.setSolutionStore(new SolutionStore().storeBestSolutionsOnly());

dse.startExploration(Strategies.createDfsStrategy(10)); //dfs search strategy

System.out.println(dse.toStringSolutions());
	
	
	}
}
