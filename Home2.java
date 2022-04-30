package street.houseno1;
public class Home2
{
	String ownerName = "murugan";
	String door = "gate opening";
	String hall= "welcome area and dining";
	String kitchen="cooking area with chimney";
	int rent = 10000;
	int currentBill = 1000;
	int maintenance = 1500;
	int salary;
	Home2(int salary)
	{
		this.salary = salary;
	}
	public static void main(String[] args)
	{
		Home2 owner= new Home2(100000);
		Home1 guest = new Home1();
		System.out.println(guest.car);
		guest.car();
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