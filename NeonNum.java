package bookcodes;
import java.util.Scanner;
public class NeonNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the num a");
		int a = sc.nextInt();
		System.out.println("please enter the num b");
		int b = sc.nextInt();
		sc.close();
		if(a>b)
		{
			a=a+b;
			b=a-b;
			a=a-b;
		}
		NeonNum object = new NeonNum();
		object.neonNum(a,b);
		object.perfectNum(a,b);
	}
	public void neonNum(int a,int b)
	{
		
		for(int i=a;i<=b;i++) {
		int input = i;
		int actual = input;
		input *= input;
		int balance =0;
		
		if(input>9) {
		while(input>0)
		{
			balance = balance + input%10;
			input = input/10;
		}
		//System.out.println("input num is "+actual);
		//System.out.println("sum of the digits "+balance);
		if (balance == actual)
		{
			System.out.println(i+" is a neon num");
		}
		else
		{
			System.out.println(i+" is not a neon num");
		}
		}
		}	
	}

	public void perfectNum(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			int sum_Of_Divisors = 0;
			int n = 1;
			while(n<i)
			{
				if(i%n==0)
				{
					sum_Of_Divisors += n;
				}
				n++;
			}
			if(sum_Of_Divisors==i)
			{
				System.out.println(i+" is a perfect number");
			}
			else
			{
				System.out.println(i+" is not a perfect number");
			}
		}	
	}
}
