package structural;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
interface MobileShop {  
    public void modelName();  
    public void price();  
}  
class Redmi implements MobileShop {  
      
    public void modelName() {  
        System.out.println(" Note 8 pro ");  
    }  
   
    public void price() {  
    System.out.println(" Rs 15000.00 ");  
    }  
}  
class Realme implements MobileShop {  
      
    public void modelName() {  
        System.out.println(" realme 6 pro ");  
    }  
    
    public void price() {  
    System.out.println(" Rs 17000.00 ");  
    }  
}  
class ShopOwner {  
    private MobileShop redmi;  
    private MobileShop realme;  
 
      
    public ShopOwner(){  
        redmi= new Redmi();  
        realme=new Realme();  
         }  
    public void redmiSale(){  
        redmi.modelName();  
        redmi.price();  
    }  
        public void realmeSale(){  
        realme.modelName();  
        realme.price();  
    }  
}
public class FacadeExample {
	 private static int  choice;  
	    public static void main(String args[]) throws NumberFormatException, IOException{  
	        do{       
	            System.out.print("========= Mobile Shop ============ \n");  
	            System.out.print("            1. Redmi.              \n");  
	            System.out.print("            2. Realme.              \n");  
	            System.out.print("            3. Exit.            \n");  
	            System.out.print("Enter your choice: ");  
	              
	            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	            choice=Integer.parseInt(br.readLine());  
	            ShopOwner sk=new ShopOwner();  
	              
	            switch (choice) {  
	            case 1:  
	                {   
	                  sk.redmiSale();  
	                    }  
	                break;  
	       case 2:  
	                {  
	                  sk.realmeSale();        
	                    }  
	                 
	        
	            default:  
	            {    
	                System.out.println("Nothing You purchased");  
	            }         
	                return;  
	            }  
	              
	      }while(choice!=3);  
	   }  
	}  

