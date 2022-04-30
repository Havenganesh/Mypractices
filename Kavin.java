public class Kavin implements Employee
{
public static void main(String [] args)
{
Employee.no_of_leaves = 50;
Kavin kavin = new Kavin();
kavin.work();
kavin.take_leave();
kavin.team_outing();
System.out.println(no_of_leaves);
System.out.println(Kavin.no_of_leaves);
System.out.println(kavin.no_of_leaves);
}
public void work()
{
System.out.println("Software engineer");
}
public void take_leave()
{
System.out.println("leave letter");
}
public void team_outing()
{
System.out.println("Outing");
}
}