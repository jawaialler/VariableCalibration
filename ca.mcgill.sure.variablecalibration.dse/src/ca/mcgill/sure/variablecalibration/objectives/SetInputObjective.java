package ca.mcgill.sure.variablecalibration.objectives;

import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.objectives.Comparators;
import org.eclipse.viatra.dse.objectives.IObjective;
import org.eclipse.viatra.dse.objectives.impl.BaseObjective;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;

public class SetInputObjective extends BaseObjective {
	
	private RunSimulationOnModel sim;
	public static final String DEFAULT_NAME = "AvgResponseTime";
	 
	
	public SetInputObjective(){
		super(DEFAULT_NAME);
        comparator = Comparators.HIGHER_IS_BETTER;		
	}

	@Override
	public void init(ThreadContext context) {
		super.init(context);
		sim = RunSimulationOnModel.create(context);		
	}

	@Override
	public Double getFitness(ThreadContext context) {
		sim.runSimulation();
		return (double) sim.getNumberOfCalibratedInputs();
	}

	@Override
	public IObjective createNew() {
		// TODO Auto-generated method stub
		return null;
	}

	public static IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> instance() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
