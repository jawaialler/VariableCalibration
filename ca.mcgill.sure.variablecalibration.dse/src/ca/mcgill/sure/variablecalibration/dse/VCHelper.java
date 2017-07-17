package ca.mcgill.sure.variablecalibration.dse;

import ca.mcgill.sure.variablecalibration.Category;
import ca.mcgill.sure.variablecalibration.Configuration;
import ca.mcgill.sure.variablecalibration.Hillslope1DFactory;
import ca.mcgill.sure.variablecalibration.HillslopeModel;

public class VCHelper {

	public static HillslopeModel createInitialModel(){
		 Hillslope1DFactory factory = Hillslope1DFactory.eINSTANCE;
		    HillslopeModel model = factory.createHillslopeModel();
		    Category geologic = factory.createCategory();
		    geologic.setName("Geologic");

		    Configuration configuration = factory.createConfiguration();
		    configuration.setColumn(1);
		    configuration.setRow(1);
		    
		    model.getCategories().add(geologic);
		    model.getConfigurations().add(configuration);
		    
		    return model;
		
	}
	
}
