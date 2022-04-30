package street.houseno1;
public class Home1
{
	String ownerName="Iyyappan";
	String door = "door opening";
	String hall= "welcome area";
	String kitchen="cooking area";
	String car = "camry";
	int rent = 5000;
	int currentBill = 600;
	int maintenance = 1000;
	int salary;
	Home1(int salary)
	{
		this.salary = salary;
	}
	Home1()
	{
		System.out.println("car was driven by murugan");
	}
	public static void main(String[] args)
	{
		Home1 owner= new Home1(50000);
		System.out.println("owner name is " + owner.ownerName);
		//System.out.println("owner " + owner.door);
		//System.out.println("owner at " + owner.hall);
		//System.out.println("owner " + owner.kitchen);
		//System.out.println("rent "+ owner.rent);
		//System.out.println("current bill "+ owner.currentBill);
		//System.out.println("maintenance " + owner.maintenance);
		//System.out.println(owner.salary);
		//owner.monthly_Savings();
		//owner.weekEnd("going to party");
		//owner.traveling();
		//owner.expenses(10000);
		owner.car();
	}
	void car()
	{
		System.out.println("car was driving " + car);
	}
	void monthly_Savings()
	{
		System.out.println("the saving is " +(salary-rent-currentBill-maintenance));
	}
	void weekEnd(String party)
	{
		System.out.println(party + " have fun");
	}
	void expenses(int money)
	{
		System.out.println("the expenses is " +money);
	}
	void traveling()
	{
		System.out.println("driving the car with the family");
	}
}