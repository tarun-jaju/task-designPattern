package creational;
 class Singleton  
{ 
  // public instance initialized when loading the class 
  private static final Singleton instance = new Singleton(); 
  
  private Singleton() 
  { 
    // private constructor 
  } 
  public static Singleton getInstance(){ 
        return instance; 
    } 
} 
public class SingletonExample {
public static void main(String[] args)
{
	Singleton object=Singleton.getInstance();
	System.out.println(object);
}
}
