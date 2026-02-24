# operaton CDI test

## Helper Class

with @Produces it works. otherwise WELD-001408: Unsatisfied dependencies for type IdentityService with qualifiers @Default

@ApplicationScoped
public class OperatonProducer {

    @Produces
    public IdentityService produceIdentityService() {
  
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
        
        if (engine != null) {
            return engine.getIdentityService();
        }
        
        return null;
    }
}


