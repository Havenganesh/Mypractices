package loop;

public class Pattern22 {

	public static void main(String[] args) 
	{
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++) 
        { 
          for (int j = rows; j > i; j--)
		   {
	         System.out.print("-");
		   }
		  int temp = 1;
		  for (int k = 1; k <= i; k++)
		    {
			  System.out.print(temp + " ");
			  temp = temp * (i - k) / (k);
     	    }
		   System.out.println();
		}

	}

}
