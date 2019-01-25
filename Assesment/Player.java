import java.util.Scanner;
public class Player 
{
   public static String Role() 
   {
	    
		 System.out.println("Please choose your Role from: Walker,Runner, Jumper");
		 Scanner playerRole  = new Scanner(System.in);
		 String R1 = playerRole.nextLine();
	  switch (R1) 
	 {
	    case "Walker":
	    	System.out.println("You have choosen " + R1);
	    	break;
	    case "Runner":
	    	System.out.println("You have choosen " + R1);
	    	break;
	    case "Jumper":
	    	System.out.println("You have choosen " + R1);
	    	break;		
	    default:
	    	System.out.println("You have selected Invalid Role");
	}
        
  
	 return R1;
   } 
}