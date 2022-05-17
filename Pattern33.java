package loop;

public class Pattern33 {

	public static void main(String[] args) 
	{
		for(int m=1;m<6;m++)
		{
		 for(int n=5;n>m;n--)
		  {
			System.out.print("  ");
		  }
		for(int n=1;n<=m;n++)
		  {
			System.out.print(n+" ");
		  }
		for(int n=1;n<m;n++)
		  {
			System.out.print(m-n +" ");
		  }
		System.out.println();
		}

	}

}
