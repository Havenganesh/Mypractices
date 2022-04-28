
public class LocalVariables
{
	LocalVariables()
	{
		int rank = 1;
		String name = "constructor";
		System.out.println("rank : "+ rank +" name : " + name);
	}
	public static void main(String[] args)
	{
		int rollno = 10;
		String name ="ganesh";
		LocalVariables LV = new LocalVariables();
		System.out.println(" name of the person " + name);
		System.out.println(" rollno of the person " + rollno);
		LV.speak();
		LV.study();
		LV.read();
	}
	public void speak() 
	{
		String speak = "speaking";
		System.out.println(speak);
	}
	public void study()
	{
		String study ="studing";
		System.out.println(study);
	}	
	public void read()
	{
		String read = "reading";
		System.out.println(read);
	}
}