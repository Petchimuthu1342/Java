package Practice;
import java.util.Scanner; 
public class NumberGuessing {  
		    public static void guessingNumberGame()
		    {
		        Scanner sc = new Scanner(System.in);	
		        System.out.println("Enter Number of Chances:");
				int i=sc.nextInt();
				//math.random 0.0 to 100.0
				int number = 1 + (int)(100 * Math.random());

		        System.out.println("The number is chosen between 1 and 100.");
		        System.out.println("You have " + i + " attempts to guess the correct number.");
		        for (int j = 0; j < i; j++) {
		            System.out.print("Enter your guess: ");
		            int guess = sc.nextInt();
		            if (guess == number) {
		                System.out.println("Congratulations! You guessed the correct number.");
		                sc.close();
		                return;
		            }
		            else if (guess > number) {
		                System.out.println(" The number is too high " + guess);
		            }
		            else {
		                System.out.println(" The number is too low " + guess);
		            }
		        }

		        System.out.println("You have exhausted all attempts. The correct number was: "+ number);
		        sc.close();
		    }

		    public static void main(String[] args)
		    {
		        guessingNumberGame();
		    }
	}

