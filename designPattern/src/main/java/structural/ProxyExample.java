package structural;
interface CostlyObject {
    void process();
}
class CostlyObjectImpl implements CostlyObject {
	 
    public CostlyObjectImpl() {
        heavyInitialConfiguration();
    }
     
   
    public void process() {
        System.out.println("processing complete.");
    }
     
    private void heavyInitialConfiguration() {
        System.out.println("Loading initial configuration...");
    }
     
    }
     
class CostlyObjectProxy implements CostlyObject {
    private static CostlyObject object;
 
    
    public void process() {
        if (object == null) {
            object = new CostlyObjectImpl();
        }
        object.process();
    }
}
public class ProxyExample {
	public static void main(String[] args) {
	    CostlyObject object = new CostlyObjectProxy();
	    object.process();
	    object.process();
	}

}
