package bookcodes;

public class Patternstar {

	public static void main(String[] args) 
	{
		Patternstar ps =new Patternstar();
//		ps.pattern();
//		ps.Pattern1();
//		ps.pattern2();
//		ps.pattern3();
		ps.pattern4();

	}
	public void pattern()
	{   int a=1;
		for(int row=5;row>=1;row--)
		{
			for(int space=1;space<=row;space++)
				System.out.print(" ");
			for(int star=1;star<=a;star++)
				System.out.print("*");
			a=a+2;
			System.out.println();
		}
	}
	public void Pattern1()
	{
		for(int row=1;row<=5;row++)
		{ 
			for(int column=1;column<=row;column++)
				{System.out.print(column+" ");
				}
			for(int n=1;n<=5-row;n++)
			{
				System.out.print(" * ");
			}
			
			System.out.println();

		}
	}
	public void pattern2()
	{
		for(int n=1;n<=5;n++)
		{   int k=1;
			for(int m=1;m<=5;m++)
			{
				if(m<=n)	
				{System.out.print(" ");}
			    else
				{System.out.print(k+" ");
				k++;
				}
			}
			System.out.println();   
	    }
	}
	public void pattern3()
	{
		for(int n=1;n<=5;n++)
		{   
			for(int m=1;m<=4;m++)
			{
				if(m<n)	
				{System.out.print(" ");}
			    else
				{System.out.print(n+" ");
				}
			}
			System.out.println();   
	    }
	}
	public void pattern4()
	{
		for(int n=1;n<=5;n++)
		{	
	    for(int k=1;k<=n;k++)
	    	System.out.print("-");
	    for(int m=5;m>=n;m--)
			System.out.print((m-n+1)+" ");
	    System.out.println();
		}
	}

}
