import java.util.Scanner;
public class main 
{
    
	public static void main(String[] args)
   {
		int R = 1;
		
		System.out.println("Enter Your Name ");
		Scanner playername  = new Scanner(System.in);
		String P1 = playername.nextLine();
		System.out.println("Hello  " + P1 + " Welcome to Treasure Hunt");
		while(R!=3)
		    {
		    	 System.out.println( P1 + " ,please Choose Your Role");
		         String Output = Player.Role();
		         Treasure.game();
		         R=R+1;
		     }
		
		System.out.println(P1 +", You have played maximum number of games please Re-run you. Thank You");
		
	}

}
