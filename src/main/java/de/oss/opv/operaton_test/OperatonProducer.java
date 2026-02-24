package de.oss.opv.operaton_test;

import org.operaton.bpm.engine.IdentityService;
import org.operaton.bpm.engine.ProcessEngine;
import org.operaton.bpm.engine.ProcessEngines;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class OperatonProducer {

    // @Produces
    public IdentityService produceIdentityService() {
  
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
        
        if (engine != null) {
            return engine.getIdentityService();
        }
        
        return null;
    }
}