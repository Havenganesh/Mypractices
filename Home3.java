package street.houseno2;
public class Home3 
{
	String ownerName = "ponnaiya";
	String door = "gate opening";
	String hall= "welcome area and dining";
	String kitchen="cooking area with chimney";
	int rent = 10000;
	int currentBill = 1000;
	int maintenance = 1500;
	int salary;
	String car ="baleno";
	Home3(int salary)
	{
		this.salary = salary;
	}
	public static void main(String[] args)
	{
		Home3 owner= new Home3(80000);
		System.out.println(owner.car);
		owner.car();
		//System.out.println("owner name is " + owner.ownerName);
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
	}
	public void car()
	{
		System.out.println("car driving");
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