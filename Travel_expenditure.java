package loop;
import java.util.Scanner;
public class Travel_expenditure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Travel_expenditure te = new Travel_expenditure();
		te.travel();

	}
	public void travel()
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("please enter the total working days ");
		int days = ip.nextInt();
		System.out.println("please enter the bus spare for once ");
		float busSpare = ip.nextFloat();
		busSpare += busSpare;
		System.out.println("please enter the hire price for once");
		float ola = ip.nextFloat();
		ola += ola;
		float totalCost = (busSpare + ola)*days;
		System.out.println("total cost for travel "+(int)totalCost +"for a month");
		ip.close();
		System.out.println("if you are using tamilnadu freebus Scheme enter 1 else 0");
		int value = ip.nextInt();
		if(value==1)
		{
			float savings = totalCost-(ola*days);
			System.out.println("by the scheme you can save "+savings+" Rupees");
			float percentage = 100-savings/totalCost*100;
			System.out.println("The amount of percentage you are saved is "+ Math.round(percentage)+"%");
		}
		else
		{
			System.out.println("please use the government transportion");
		}
	}
}

