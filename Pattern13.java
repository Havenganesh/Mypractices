package loop;

public class Pattern13 
{
	public static void main(String[]args)
	{
		Pattern13 pt = new Pattern13();
		//pt.patte13();
		System.out.println();
		//pt.patte14();
		System.out.println();
		//pt.patte15();
		System.out.println();
		pt.patte16();
		System.out.println();
		//pt.patte17();
		System.out.println();
		pt.patte18();
		
	}
	
	private void patte18() 
	{
		int letter =64;
		for(int n=5;n>0;n--)
		{
			for(int m=1;m<=n;m++)
				System.out.print((char)(letter+m)+" ");
			System.out.println();
		}	
	}

	private void patte17() 
	{
		int i =1;
		for(int n=5;n>0;n--)
		{
			for(int m=5;m>=n;m--)
				System.out.print(i++ +" ");
			System.out.println();
		}	
	}
	private void patte16() 
	{
		for(int n=1;n<=5;n++)
		{
			for(int m=5;m>=n;m--)
				System.out.print(m+" ");
			System.out.println();
		}
	}
	public void patte13()
	{
		int letter =64;
		for(int m=1;m<6;m++)//pattern8
		{
			for(int n=5-m;n>0;n--)
				System.out.print(" ");
			for(int n=0;n<m;n++)
				System.out.print((char)(letter+m)+" ");
			System.out.println();
		}
	}
	public void patte14()
	{
		for(int n=5;n>0;n--)
		{
			for(int m=1;m<=n;m++)
				System.out.print(m+" ");
			System.out.println();
		}
		
	}
	public void patte15()
	{
		for(int n=5;n>0;n--)
		{
			for(int m=5;m>=n;m--)
				System.out.print(m+" ");
			System.out.println();
		}
		
	}

}
