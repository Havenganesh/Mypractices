package loop;
import java.util.Scanner;
public class Lottry_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottry = (int)(Math.random()*100);
		Scanner input = new Scanner(System.in);
		System.out.println("enter the two digit ticket num ");
		int guess = input.nextInt();
		int lottery1 = lottry/10;
		int lottery2 = lottry%10;
		int guess1 = guess/10;
		int guess2 = guess%10;
		System.out.println("the 10,000 won lottery num is "+lottry);
		if(guess==lottry)
		{
			System.out.println("you won Rs10,000/- price");
		}
		else if(lottery1 == guess2 && lottery2==guess1 )
		{
			System.out.println("you won Rs5000/- price");
		}
		else if(lottery1 == guess1 || lottery1==guess2||lottery2==guess1||lottery2==guess1)
		{
			System.out.println("you won Rs1000/-");
		}
		else
		{
			System.out.println("better luck next time");
		}
			
	}

}
