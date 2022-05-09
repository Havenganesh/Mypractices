package bookcodes;
import java.util.Scanner;
public class Guessnum {

	public static void main(String[] args) 
	{
		int number =(int)(Math.random()*101);
		Scanner input = new Scanner(System.in);
		System.out.println("guess a number between 0 to 100");
		
		int guess = -1;
		while(guess!= number)
		{
			System.out.println("\n enter the guess number");
			guess = input.nextInt();
		if (guess==number)
		{
			System.out.println("yes the number :"+number);
		}
		else if(guess>number) {
			System.out.println("the number is  low");
		}
		else if(guess<number) {
			System.out.println("the number is  high");
		}
		input.close();
		}
	}

}
