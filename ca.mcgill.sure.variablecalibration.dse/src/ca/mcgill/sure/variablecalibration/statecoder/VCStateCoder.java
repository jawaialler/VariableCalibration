package ca.mcgill.sure.variablecalibration.statecoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.omg.CORBA.PUBLIC_MEMBER;

import ca.mcgill.sure.variablecalibration.Category;
import ca.mcgill.sure.variablecalibration.Configuration;
import ca.mcgill.sure.variablecalibration.HillslopeModel;
import ca.mcgill.sure.variablecalibration.Input;
import ca.mcgill.sure.variablecalibration.Output;

public class VCStateCoder implements IStateCoder {

	private HillslopeModel model;
	private ArrayList<Output> sortedOutputs;
	private ArrayList<Input> sortedInputs;
	
	@Override
    public void init(Notifier notifier) {
	// TODO  
		model = (HillslopeModel) notifier;
		
		sortedInputs = new ArrayList<Input>();
		for (Category config : model.getCategories()){
				sortedInputs.addAll(config.getInput());	
		}
	Collections.sort(sortedInputs, new Comparator<Input>() {
		
		@Override
		public int compare(Input i1, Input i2){
			return i1.getName().compareTo(i2.getName());
		}
	});	
	}
	
	@Override
    public Object createStateCode() {
	// TODO 		
		return null;
	}
	
	 @Override
	 public Object createActivationCode(IPatternMatch match) {
	 // TODO 
		return match;
	 }
}
