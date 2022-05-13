package loop;
import java.util.Scanner;
public class Num_ordering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num_ordering ld=new Num_ordering();
		ld.Num();

	}
	public void Num() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value ");
		int cake = sc.nextInt();
		int cake2 = cake;
		int digit_count = 0;
		int sum_of_digits = 0;
		int reverse =0;
		while(cake>0)
		{
			int remainder = cake%10;//223322
			//System.out.println(remainder);
			cake = cake/10;
			reverse = (reverse*10)+remainder;
			digit_count = digit_count+1;
		    sum_of_digits = sum_of_digits+remainder;
		}
		//System.out.println("count of digits "+digit_count);
		//System.out.println("sum of digits "+sum_of_digits);
		System.out.println("reversed num is "+ reverse);
		sc.close();
		if(cake2==reverse)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
