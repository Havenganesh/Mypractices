package loop;
import java.util.Scanner;
public class EB_Bill_Average {
	
	EB_Bill_Average(String name,String ebNum)
	{
		System.out.println("The House owner's name : "+name);
		System.out.println("The Electric Board number : "+ebNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.println("please enter the house owner's name");
		String name = ip.nextLine();
		System.out.println("please enter the electric board num");
		String ebNum = ip.next();
		EB_Bill_Average bill = new EB_Bill_Average(name,ebNum);
		bill.average();
		ip.close();

	}
	public void average()
	{
	Scanner ip = new Scanner(System.in);
	System.out.println("please enter the count of month you paid in even value");
	int month = ip.nextInt();
	int count = month/2;
	int repeat =0;
	int bill = 1;
	int total = 0;
	while(repeat<count)
	{
		System.out.println("please enter the "+bill+" bill amount ");
		int amount =ip.nextInt();
		repeat++;
		bill++;
		total = total+amount;
		//System.out.println(total);
	}
	System.out.println("the average bill amount for a month "+(total/count)+'.');
	System.out.println("please use electricity efficiently.");
	System.out.println("Thank you.");
	ip.close();
	}

}
