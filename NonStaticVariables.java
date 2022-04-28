public class NonStaticVariables
{
	int num1 = 10;
	int num2 = 20;
	String name = "nonstaticvariables";
	public static void main(String[] args)
	{
		NonStaticVariables object = new NonStaticVariables ();
		System.out.println(object.num1+"      "+object.num2);
		System.out.println(object.name);
		//System.out.println(num1);
	}	
}