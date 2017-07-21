package ca.mcgill.sure.variablecalibration.objectives;

import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra.dse.base.DesignSpaceManager;
import org.eclipse.viatra.dse.base.ThreadContext;

import ca.mcgill.sure.variablecalibration.HillslopeModel;
import ca.mcgill.sure.variablecalibration.simulator.Simulator;

public class RunSimulationOnModel {

    private static Map<Notifier, RunSimulationOnModel> sims = new WeakHashMap<Notifier, RunSimulationOnModel>();
    
    public static synchronized RunSimulationOnModel create(ThreadContext context) {
        Notifier model = context.getModel();
        RunSimulationOnModel sim = sims.get(model);
        if (sim == null) {
            sim = new RunSimulationOnModel();
            sim.init(context);
            sims.put(model, sim);
        }
        return sim;
    }

    private int setInputs;
    private HillslopeModel modelRoot;
    private Object lastState = null;
    private DesignSpaceManager dsm;

    private RunSimulationOnModel() {}
    
    private void init(ThreadContext context) {
        modelRoot = (HillslopeModel) context.getModel();
        dsm = context.getDesignSpaceManager();
    }
    
    public void runSimulation() {
        if (dsm.getCurrentState().equals(lastState)) { //change this since we're not looking for last state, but all states more or less ==
            return;
        }
        
        Simulator simulator = new Simulator(modelRoot, 100, 20);
        if (simulator.canSimulate()) {
            simulator.simulate();

            // nb of cal inputs
            //TODO
            
            
        }
           
    }
    
    public int getNumberOfCalibratedInputs() {
        return setInputs;
    }
    
}