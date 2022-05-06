package loop;
import java.util.Scanner;
public class EB_Bill_Average {
	
	EB_Bill_Average(String name,String ebNum)
	{
		System.out.println("The House owner's name : "+name);
		System.out.println("The Electric Board number : "+ebNum);
	}
	int total;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.println("please enter the house owner's name");
		String name = ip.nextLine();
		System.out.println("please enter the electric board num");
		String ebNum = ip.next();
		EB_Bill_Average bill = new EB_Bill_Average(name,ebNum);
		bill.monthly();
		//bill.average();
		ip.close();

	}
	public void monthly()
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("please enter the usage of the current in units");
		float current =ip.nextFloat();
		ip.close();
		if(current<=100)
		{
			System.out.println("your used less than 100 units\n so it's free");
		}
		else if(current<=200)
		{
			float duty = current/10;
		    current =current-100;
		    float charge = current * 1.5f;
		    float total = charge+duty+20;//fixed cahrges 20rs
		    System.out.println("the energy charges :"+charge+"\n"
	         + "duty               :"+duty+"\n"+"fixed charges      :20\n"
		     +"total              :"+total);
		}
		else if(current<=500) 
		{
			float duty = current/10;
			current = current-200;//for 0-100=free,101-200=2rs per unit,above200 3rs per unit
			float charge = current*3+200;
			float total =charge+duty+30;//fixed charge 30rs
			System.out.println("the energy charges :"+charge+"\n"
			         + "duty               :"+duty+"\n"+"fixed charges      :30\n"
				     +"total              :"+total);	
		}
		else if(current>500) 
		{
			float duty =current/10;
			current = current-500;
			float charge =current*6.6f+350+1380;
			float total =charge+duty+50;
			float roundOff=Math.round(total*100)/100;
			System.out.println("the energy charges :"+charge+"\n"
			         + "duty               :"+duty+"\n"+"fixed charges      :50\n"
				     +"total              :"+roundOff);
		}
		
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
	this.total = total;
	ip.close();
	}

}
