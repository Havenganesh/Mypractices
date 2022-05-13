package loop;
import java.util.Scanner;
public class Armstrong_num {

	public static void main(String[] args) {
		Armstrong_num an = new Armstrong_num();
		an.calculate();
		}
	public void calculate()
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("enter a num");
		int a = ip.nextInt();
		int a1 = a;
		int total = a;
		int n = 0;
		ip.close();
		while(a!=0)
		{
			a =a/10;
			n++;
		}
		while(a1!= 0)
		{
			int b = a1%10;
			a1 = a1/10;
			b = (int) Math.pow(b, n);
			a = a+b;
		}
		if(total==a) {
			System.out.println("it is a armstrong num");
		}
		else
		{
			System.out.println("it's not a armstrong num");
		}
	
	}

}
