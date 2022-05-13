package loop;
import java.util.Scanner;
public class Swappingnum {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("enter a");
		int a = ip.nextInt();
		System.out.println("enter b");
		int b = ip.nextInt();
		
		while(a+b<=13)
		{
		System.out.println(a+b);
		b=a+b;
		a=b-a;
		}
		//b=b-a;
		System.out.println("a is "+a+" b is "+b);
		
		ip.close();
	}

}
