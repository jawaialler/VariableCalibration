package ca.mcgill.sure.variablecalibration.statecoder;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

public class VCStateCoder implements IStateCoder {

	@Override
    public void init(Notifier notifier) {
	// TODO  
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
