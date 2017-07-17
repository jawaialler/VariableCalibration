package ca.mcgill.sure.variablecalibration.statecoder;

import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.dse.statecode.IStateCoderFactory;

public class VCStateCoderFactory implements IStateCoderFactory{
	
	 @Override
	    public IStateCoder createStateCoder() {
	        return new VCStateCoder();
	    }

}
