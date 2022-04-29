import java.util.Scanner;
public class Expression
{
	public static void main(String[]args)
	{
		Expression firstSum = new Expression();
		//firstSum.exp1();
		firstSum.exp2();
	}
	public void exp1()
	{
		Scanner input = new Scanner(System.in);
		System.out.println(" enter a");
		int a = input.nextInt();
		System.out.println(" enter b");
		int b = input.nextInt();
		System.out.println(" enter c");
		int c = input.nextInt();
		System.out.println(" enter d");
		int d = input.nextInt();
		System.out.println(" enter r");
		int r = input.nextInt();
		int A = 4/3*(r+34);
		int B = 9*(a +(b*c));
		int C = 3+d*(2+a)/a+b*d;
		int result = A+B+C;
		System.out.println(result);	
	}
	public void exp2()
	{
		Scanner input = new Scanner(System.in);
		System.out.println(" enter the r value");
		float r = input.nextFloat();
		System.out.println(" enter the t value");
		float t = input.nextFloat();
		double a = r+2.5;
		double b = 2.5+t;
		double n = Math.pow(a,b);
		double result = 5.5*n;
		System.out.println(result);
	}
}