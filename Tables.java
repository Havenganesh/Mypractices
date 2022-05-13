package loop;

public class Tables {

	public static void main(String[] args) 
	{
		Tables tab = new Tables();
		/*tab.num15();
		/*tab.num51();
		tab.num13();
		tab.num31();
		tab.numAster();
		tab.num1t9();
		tab.num1t81();*/
		tab.num1t25();
		tab.num1t15();

	}
	public void num15()
	{
		for(int m =0;m<3;m++) //second loop written
		{
		for(int n =1;n<=5;n++)//first loop written
		{
			System.out.print(n+" ");
		}
		System.out.println();
		}
	}
	public void num51()
	{
		for(int m =0;m<3;m++) //second loop written
		{
		for(int n =5;n>=1;n--)//first loop written and modified
		{
			System.out.print(n+" ");
		}
		System.out.println();
		}
	}
	public void num13()
	{
		for(int m =0;m<5;m++) //second loop written both modified
		{
		for(int n =1;n<=3;n++)//first loop written both modified
		{
			System.out.print(n+" ");
		}
		System.out.println();
		}
	}
	public void num31()
	{
		for(int m =0;m<5;m++) //second loop written both modified
		{
		for(int n =3;n>=1;n--)//first loop written both modified +
		{
			System.out.print(n+" ");
		}
		System.out.println();
		}
	}
	public void numAster()
	{
		for(int m =0;m<5;m++) //second loop written both modified
		{
		for(int n =5;n>=1;n--)//first loop written both modified +
		{
			System.out.print("* ");
		}
		System.out.println();
		}
	}
	public void num1t9()
	{
		for(int m=1;m<=3;m++)
		{
		for(int n=1;n<=9;n=n+2)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		}
	}
	public void num1t81()
	{
		for(int m=1;m<=3;m++)
		{
		for(int n=1;n<=9;n=n+2)
		{
			System.out.print(n*n+" ");
		}
		System.out.println();
		}
	}
	public void num1t25()
	{
		for(int m =0;m<4;m++) //second loop written
		{
		for(int n =1;n<=5;n++)//first loop written
		{
			System.out.print(n*n+" ");
		}
		System.out.println();
		}
	}
	public void num1t15()
	{
		for(int m=1;m<=3;m++)
		{
		for(int n=1;n<=5;n++)
		{
			System.out.print(n*m+" ");
		}
		System.out.println();
		}
	}
	

}
