import java.util.Random;
import java.util.Scanner;
public class Treasure
{
  public static void game() 
     {
		         Scanner command = new Scanner(System.in);
		         Random coord = new Random();
		         int coordX = coord.nextInt(10);
		         int coordY = coord.nextInt(10);
		         int plX =5;
		         int plY=5;
		         int X;
		         int Y;
		         int Score =0;
		         X= coordX - plX;
		         Y = coordY -plY;
		         float distance = (float) Math.sqrt(X*X+Y*Y);
		         System.out.println(" You are in middle of grey swamp which is infinite and dreary, Try going North,South,East or West");
		         while(distance>0) 
		             {  
			            String direction = command.next();
			                  if(direction.equals("North"))                                                            
			                   {
			                    plY++;
				                System.out.println("Enter your next Command");
			                   }
			                  else if (direction.equals("South"))
			                  {
				                plY--;
				                System.out.println("Enter your next Command");
			                  }
			                  else if (direction.equals("West"))
			                  {
				                plX--;
				                System.out.println("Enter your next Command");
			                  }
			                  else if (direction.equals("East"))
			                  {
				                plX++;
				                System.out.println("Enter your next Command");
			                  }
			                  
			                  else 
			                  {
			                	  System.out.println("Invalid Command");
			                	  System.out.println("Enter your Valid Command");
			                  }
			                    
			                    X= coordX - plX;
					            Y = coordY -plY;
					            distance = (float) Math.sqrt(X*X+Y*Y);
					            System.out.println("The dial reads" + distance +"m");
					           
			              }
		         System.out.println("You see a box sitting on the plain. Its filled with treasure! You win!"); 
		         Score = Score +1;
		         System.out.println("Your Score is " + Score);
		    }
	       
     }

