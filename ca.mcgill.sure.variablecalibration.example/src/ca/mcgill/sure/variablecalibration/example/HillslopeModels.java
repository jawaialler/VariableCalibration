package ca.mcgill.sure.variablecalibration.example;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ca.mcgill.sure.variablecalibration.*;

public class HillslopeModels {
	
public static void main(String[] args) {
    
	/*
	//classic main, without using resources (not serialised)
	 
	HillslopeModels hillslopeModels = new HillslopeModels();
	HillslopeModel model = hillslopeModels.createModel();
	hillslopeModels.printHillslopeModel(model);
	
	*/
	
	//main using resources, which serialises the model and looks it up in an xmi file
	
	// init
	HillslopeModels hillslopeModels = new HillslopeModels();
	hillslopeModels.init();
    // create
	HillslopeModel model = hillslopeModels.createModel();
    // save
    URI uri = URI.createFileURI("C:/Users/chloe/Documents/samplemodel.erdiagram");
    Resource resource = hillslopeModels.createResource(uri);
    resource.getContents().add(model);
    hillslopeModels.saveResource(resource);
    // load to a different resource
    Resource resource2 = hillslopeModels.loadResource(uri);
    HillslopeModel model2 = hillslopeModels.getModelFromResource(resource2);
    // print
    hillslopeModels.printHillslopeModel(model2);
	
}

public HillslopeModel createModel() {

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

public void printHillslopeModel(HillslopeModel model)
{
    for (Category category : model.getCategories()) {
        System.out.println(category.getName());
    }
}

public void init() {
	   // For the initialisation of the model.
	   Hillslope1DPackage.eINSTANCE.eClass();
	// Defining that the files with the .erdiagram extension should be parsed as an xmi.
	   Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	   reg.getExtensionToFactoryMap().put("erdiagram", new XMIResourceFactoryImpl());
	   
	}

public Resource createResource(URI uri) {
    ResourceSet resSet = new ResourceSetImpl();
    Resource resource = resSet.createResource(uri);
    return resource;
}
public Resource loadResource(URI uri) {
    ResourceSet resSet = new ResourceSetImpl();
    Resource resource = resSet.getResource(uri, true);
    return resource;
}

public void saveResource(Resource resource) {
	   try {
	     resource.save(Collections.EMPTY_MAP);
	   } catch (IOException e) {
	      System.out.println("The following error occurred during saving the resource: "
	        + e.getMessage());
	   }
}

	public HillslopeModel getModelFromResource(Resource resource) {
	   // check the content in production code!
	   HillslopeModel root = (HillslopeModel) resource.getContents().get(0);
	   return root;
	}

}